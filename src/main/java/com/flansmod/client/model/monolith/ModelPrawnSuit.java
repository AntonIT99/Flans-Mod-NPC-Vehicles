//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PrawnExosuit
// Model Creator: 
// Created on: 21.07.2020 - 08:28:42
// Last changed on: 21.07.2020 - 08:28:42

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPrawnSuit extends ModelMecha //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelPrawnSuit() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[278];
		hipsModel = new ModelRendererTurbo[45];
		leftArmModel = new ModelRendererTurbo[51];
		rightArmModel = new ModelRendererTurbo[51];
		leftLegModel = new ModelRendererTurbo[89];
		rightLegModel = new ModelRendererTurbo[88];

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
		bodyModel[0] = new ModelRendererTurbo(this, 28, 20, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 142, 42, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 136, 68, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 48, 64, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 2, 20, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 4, 71, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 38, 71, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 2, 61, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 132, 75, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 137, 98, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 137, 103, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 156, 110, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 125, 23, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 156, 114, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 116, 60, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 116, 56, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 116, 46, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 121, 64, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 121, 60, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 121, 46, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 145, 15, textureX, textureY); // Box 0
		bodyModel[22] = new ModelRendererTurbo(this, 145, 23, textureX, textureY); // Box 1
		bodyModel[23] = new ModelRendererTurbo(this, 132, 15, textureX, textureY); // Box 2
		bodyModel[24] = new ModelRendererTurbo(this, 132, 23, textureX, textureY); // Box 3
		bodyModel[25] = new ModelRendererTurbo(this, 162, 15, textureX, textureY); // Box 5
		bodyModel[26] = new ModelRendererTurbo(this, 202, 11, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 202, 19, textureX, textureY); // Box 7
		bodyModel[28] = new ModelRendererTurbo(this, 192, 19, textureX, textureY); // Box 8
		bodyModel[29] = new ModelRendererTurbo(this, 192, 11, textureX, textureY); // Box 9
		bodyModel[30] = new ModelRendererTurbo(this, 199, 28, textureX, textureY); // Box 11
		bodyModel[31] = new ModelRendererTurbo(this, 171, 103, textureX, textureY); // Box 16
		bodyModel[32] = new ModelRendererTurbo(this, 42, 44, textureX, textureY); // Box 27
		bodyModel[33] = new ModelRendererTurbo(this, 62, 41, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 83, 61, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 42, 33, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 90, 43, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 83, 53, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 83, 53, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 50, 55, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 42, 20, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 83, 69, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 83, 77, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 83, 69, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 96, 69, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 96, 77, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 96, 69, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 62, 29, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 166, 75, textureX, textureY); // Box 0
		bodyModel[49] = new ModelRendererTurbo(this, 154, 103, textureX, textureY); // Box 1
		bodyModel[50] = new ModelRendererTurbo(this, 162, 68, textureX, textureY); // Box 2
		bodyModel[51] = new ModelRendererTurbo(this, 3, 41, textureX, textureY); // Box 3
		bodyModel[52] = new ModelRendererTurbo(this, 90, 20, textureX, textureY); // Box 5
		bodyModel[53] = new ModelRendererTurbo(this, 62, 21, textureX, textureY); // Box 6
		bodyModel[54] = new ModelRendererTurbo(this, 90, 31, textureX, textureY); // Box 7
		bodyModel[55] = new ModelRendererTurbo(this, 137, 82, textureX, textureY); // Box 8
		bodyModel[56] = new ModelRendererTurbo(this, 48, 76, textureX, textureY); // Box 9
		bodyModel[57] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 10
		bodyModel[58] = new ModelRendererTurbo(this, 67, 76, textureX, textureY); // Box 11
		bodyModel[59] = new ModelRendererTurbo(this, 110, 21, textureX, textureY); // Box 12
		bodyModel[60] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 13
		bodyModel[61] = new ModelRendererTurbo(this, 109, 38, textureX, textureY); // Box 14
		bodyModel[62] = new ModelRendererTurbo(this, 115, 69, textureX, textureY); // Box 15
		bodyModel[63] = new ModelRendererTurbo(this, 109, 42, textureX, textureY); // Box 16
		bodyModel[64] = new ModelRendererTurbo(this, 109, 42, textureX, textureY); // Box 17
		bodyModel[65] = new ModelRendererTurbo(this, 109, 38, textureX, textureY); // Box 18
		bodyModel[66] = new ModelRendererTurbo(this, 122, 69, textureX, textureY); // Box 19
		bodyModel[67] = new ModelRendererTurbo(this, 115, 78, textureX, textureY); // Box 20
		bodyModel[68] = new ModelRendererTurbo(this, 122, 78, textureX, textureY); // Box 21
		bodyModel[69] = new ModelRendererTurbo(this, 110, 71, textureX, textureY); // Box 22
		bodyModel[70] = new ModelRendererTurbo(this, 207, 50, textureX, textureY); // Box 23
		bodyModel[71] = new ModelRendererTurbo(this, 137, 56, textureX, textureY); // Box 24
		bodyModel[72] = new ModelRendererTurbo(this, 24, 40, textureX, textureY); // Box 25
		bodyModel[73] = new ModelRendererTurbo(this, 166, 88, textureX, textureY); // Box 26
		bodyModel[74] = new ModelRendererTurbo(this, 176, 88, textureX, textureY); // Box 27
		bodyModel[75] = new ModelRendererTurbo(this, 122, 78, textureX, textureY); // Box 28
		bodyModel[76] = new ModelRendererTurbo(this, 122, 69, textureX, textureY); // Box 29
		bodyModel[77] = new ModelRendererTurbo(this, 4, 51, textureX, textureY); // Box 30
		bodyModel[78] = new ModelRendererTurbo(this, 125, 41, textureX, textureY); // Box 32
		bodyModel[79] = new ModelRendererTurbo(this, 145, 56, textureX, textureY); // Box 33
		bodyModel[80] = new ModelRendererTurbo(this, 153, 56, textureX, textureY); // Box 34
		bodyModel[81] = new ModelRendererTurbo(this, 161, 56, textureX, textureY); // Box 35
		bodyModel[82] = new ModelRendererTurbo(this, 156, 117, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 156, 110, textureX, textureY); // Box 1
		bodyModel[84] = new ModelRendererTurbo(this, 156, 114, textureX, textureY); // Box 2
		bodyModel[85] = new ModelRendererTurbo(this, 156, 117, textureX, textureY); // Box 3
		bodyModel[86] = new ModelRendererTurbo(this, 163, 110, textureX, textureY); // Box 4
		bodyModel[87] = new ModelRendererTurbo(this, 163, 113, textureX, textureY); // Box 5
		bodyModel[88] = new ModelRendererTurbo(this, 163, 116, textureX, textureY); // Box 6
		bodyModel[89] = new ModelRendererTurbo(this, 163, 116, textureX, textureY); // Box 7
		bodyModel[90] = new ModelRendererTurbo(this, 163, 113, textureX, textureY); // Box 8
		bodyModel[91] = new ModelRendererTurbo(this, 163, 110, textureX, textureY); // Box 9
		bodyModel[92] = new ModelRendererTurbo(this, 216, 76, textureX, textureY); // Box 12
		bodyModel[93] = new ModelRendererTurbo(this, 229, 76, textureX, textureY); // Box 13
		bodyModel[94] = new ModelRendererTurbo(this, 242, 76, textureX, textureY); // Box 14
		bodyModel[95] = new ModelRendererTurbo(this, 203, 76, textureX, textureY); // Box 15
		bodyModel[96] = new ModelRendererTurbo(this, 192, 76, textureX, textureY); // Box 16
		bodyModel[97] = new ModelRendererTurbo(this, 216, 91, textureX, textureY); // Box 17
		bodyModel[98] = new ModelRendererTurbo(this, 229, 91, textureX, textureY); // Box 18
		bodyModel[99] = new ModelRendererTurbo(this, 242, 91, textureX, textureY); // Box 19
		bodyModel[100] = new ModelRendererTurbo(this, 152, 2, textureX, textureY); // Box 21
		bodyModel[101] = new ModelRendererTurbo(this, 183, 2, textureX, textureY); // Box 22
		bodyModel[102] = new ModelRendererTurbo(this, 130, 2, textureX, textureY); // Box 23
		bodyModel[103] = new ModelRendererTurbo(this, 203, 2, textureX, textureY); // Box 24
		bodyModel[104] = new ModelRendererTurbo(this, 226, 2, textureX, textureY); // Box 25
		bodyModel[105] = new ModelRendererTurbo(this, 226, 9, textureX, textureY); // Box 26
		bodyModel[106] = new ModelRendererTurbo(this, 234, 16, textureX, textureY); // Box 27
		bodyModel[107] = new ModelRendererTurbo(this, 226, 16, textureX, textureY); // Box 28
		bodyModel[108] = new ModelRendererTurbo(this, 203, 91, textureX, textureY); // Box 29
		bodyModel[109] = new ModelRendererTurbo(this, 192, 91, textureX, textureY); // Box 30
		bodyModel[110] = new ModelRendererTurbo(this, 242, 69, textureX, textureY); // Box 31
		bodyModel[111] = new ModelRendererTurbo(this, 229, 69, textureX, textureY); // Box 32
		bodyModel[112] = new ModelRendererTurbo(this, 216, 69, textureX, textureY); // Box 33
		bodyModel[113] = new ModelRendererTurbo(this, 24, 48, textureX, textureY); // Box 34
		bodyModel[114] = new ModelRendererTurbo(this, 34, 61, textureX, textureY); // Box 36
		bodyModel[115] = new ModelRendererTurbo(this, 34, 61, textureX, textureY); // Box 37
		bodyModel[116] = new ModelRendererTurbo(this, 38, 71, textureX, textureY); // Box 38
		bodyModel[117] = new ModelRendererTurbo(this, 26, 61, textureX, textureY); // Box 39
		bodyModel[118] = new ModelRendererTurbo(this, 26, 61, textureX, textureY); // Box 40
		bodyModel[119] = new ModelRendererTurbo(this, 18, 63, textureX, textureY); // Box 41
		bodyModel[120] = new ModelRendererTurbo(this, 18, 63, textureX, textureY); // Box 42
		bodyModel[121] = new ModelRendererTurbo(this, 18, 63, textureX, textureY); // Box 43
		bodyModel[122] = new ModelRendererTurbo(this, 18, 63, textureX, textureY); // Box 44
		bodyModel[123] = new ModelRendererTurbo(this, 176, 15, textureX, textureY); // Box 54
		bodyModel[124] = new ModelRendererTurbo(this, 189, 28, textureX, textureY); // Box 55
		bodyModel[125] = new ModelRendererTurbo(this, 189, 28, textureX, textureY); // Box 56
		bodyModel[126] = new ModelRendererTurbo(this, 185, 11, textureX, textureY); // Box 57
		bodyModel[127] = new ModelRendererTurbo(this, 185, 11, textureX, textureY); // Box 58
		bodyModel[128] = new ModelRendererTurbo(this, 175, 24, textureX, textureY); // Box 59
		bodyModel[129] = new ModelRendererTurbo(this, 175, 20, textureX, textureY); // Box 60
		bodyModel[130] = new ModelRendererTurbo(this, 183, 20, textureX, textureY); // Box 61
		bodyModel[131] = new ModelRendererTurbo(this, 175, 24, textureX, textureY); // Box 62
		bodyModel[132] = new ModelRendererTurbo(this, 175, 20, textureX, textureY); // Box 63
		bodyModel[133] = new ModelRendererTurbo(this, 183, 20, textureX, textureY); // Box 64
		bodyModel[134] = new ModelRendererTurbo(this, 183, 24, textureX, textureY); // Box 65
		bodyModel[135] = new ModelRendererTurbo(this, 227, 58, textureX, textureY); // Box 66
		bodyModel[136] = new ModelRendererTurbo(this, 227, 53, textureX, textureY); // Box 67
		bodyModel[137] = new ModelRendererTurbo(this, 227, 53, textureX, textureY); // Box 68
		bodyModel[138] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 69
		bodyModel[139] = new ModelRendererTurbo(this, 226, 32, textureX, textureY); // Box 70
		bodyModel[140] = new ModelRendererTurbo(this, 227, 45, textureX, textureY); // Box 71
		bodyModel[141] = new ModelRendererTurbo(this, 226, 24, textureX, textureY); // Box 72
		bodyModel[142] = new ModelRendererTurbo(this, 207, 44, textureX, textureY); // Box 80
		bodyModel[143] = new ModelRendererTurbo(this, 207, 36, textureX, textureY); // Box 81
		bodyModel[144] = new ModelRendererTurbo(this, 207, 36, textureX, textureY); // Box 83
		bodyModel[145] = new ModelRendererTurbo(this, 162, 23, textureX, textureY); // Box 84
		bodyModel[146] = new ModelRendererTurbo(this, 207, 44, textureX, textureY); // Box 90
		bodyModel[147] = new ModelRendererTurbo(this, 207, 44, textureX, textureY); // Box 91
		bodyModel[148] = new ModelRendererTurbo(this, 207, 44, textureX, textureY); // Box 92
		bodyModel[149] = new ModelRendererTurbo(this, 207, 50, textureX, textureY); // Box 93
		bodyModel[150] = new ModelRendererTurbo(this, 191, 36, textureX, textureY); // Box 94
		bodyModel[151] = new ModelRendererTurbo(this, 195, 47, textureX, textureY); // Box 95
		bodyModel[152] = new ModelRendererTurbo(this, 195, 47, textureX, textureY); // Box 96
		bodyModel[153] = new ModelRendererTurbo(this, 179, 32, textureX, textureY); // Box 21
		bodyModel[154] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 1
		bodyModel[156] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 2
		bodyModel[157] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 3
		bodyModel[158] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 4
		bodyModel[159] = new ModelRendererTurbo(this, 202, 123, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 202, 116, textureX, textureY); // Box 1
		bodyModel[161] = new ModelRendererTurbo(this, 231, 109, textureX, textureY); // Box 2
		bodyModel[162] = new ModelRendererTurbo(this, 227, 102, textureX, textureY); // Box 3
		bodyModel[163] = new ModelRendererTurbo(this, 142, 42, textureX, textureY); // Box 5
		bodyModel[164] = new ModelRendererTurbo(this, 137, 98, textureX, textureY); // Box 6
		bodyModel[165] = new ModelRendererTurbo(this, 171, 103, textureX, textureY); // Box 7
		bodyModel[166] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 8
		bodyModel[167] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 9
		bodyModel[168] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 10
		bodyModel[169] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 11
		bodyModel[170] = new ModelRendererTurbo(this, 181, 93, textureX, textureY); // Box 12
		bodyModel[171] = new ModelRendererTurbo(this, 176, 88, textureX, textureY); // Box 13
		bodyModel[172] = new ModelRendererTurbo(this, 137, 56, textureX, textureY); // Box 14
		bodyModel[173] = new ModelRendererTurbo(this, 145, 56, textureX, textureY); // Box 15
		bodyModel[174] = new ModelRendererTurbo(this, 153, 56, textureX, textureY); // Box 16
		bodyModel[175] = new ModelRendererTurbo(this, 161, 56, textureX, textureY); // Box 17
		bodyModel[176] = new ModelRendererTurbo(this, 90, 43, textureX, textureY); // Box 4
		bodyModel[177] = new ModelRendererTurbo(this, 90, 31, textureX, textureY); // Box 5
		bodyModel[178] = new ModelRendererTurbo(this, 229, 69, textureX, textureY); // Box 6
		bodyModel[179] = new ModelRendererTurbo(this, 2, 61, textureX, textureY); // Box 7
		bodyModel[180] = new ModelRendererTurbo(this, 110, 29, textureX, textureY); // Box 8
		bodyModel[181] = new ModelRendererTurbo(this, 109, 42, textureX, textureY); // Box 9
		bodyModel[182] = new ModelRendererTurbo(this, 109, 38, textureX, textureY); // Box 10
		bodyModel[183] = new ModelRendererTurbo(this, 109, 38, textureX, textureY); // Box 11
		bodyModel[184] = new ModelRendererTurbo(this, 109, 42, textureX, textureY); // Box 12
		bodyModel[185] = new ModelRendererTurbo(this, 110, 21, textureX, textureY); // Box 13
		bodyModel[186] = new ModelRendererTurbo(this, 90, 20, textureX, textureY); // Box 14
		bodyModel[187] = new ModelRendererTurbo(this, 62, 21, textureX, textureY); // Box 15
		bodyModel[188] = new ModelRendererTurbo(this, 3, 41, textureX, textureY); // Box 5
		bodyModel[189] = new ModelRendererTurbo(this, 50, 55, textureX, textureY); // Box 6
		bodyModel[190] = new ModelRendererTurbo(this, 4, 51, textureX, textureY); // Box 7
		bodyModel[191] = new ModelRendererTurbo(this, 24, 40, textureX, textureY); // Box 8
		bodyModel[192] = new ModelRendererTurbo(this, 24, 48, textureX, textureY); // Box 9
		bodyModel[193] = new ModelRendererTurbo(this, 28, 20, textureX, textureY); // Box 10
		bodyModel[194] = new ModelRendererTurbo(this, 42, 33, textureX, textureY); // Box 11
		bodyModel[195] = new ModelRendererTurbo(this, 42, 44, textureX, textureY); // Box 12
		bodyModel[196] = new ModelRendererTurbo(this, 229, 69, textureX, textureY); // Box 14
		bodyModel[197] = new ModelRendererTurbo(this, 216, 69, textureX, textureY); // Box 15
		bodyModel[198] = new ModelRendererTurbo(this, 229, 69, textureX, textureY); // Box 16
		bodyModel[199] = new ModelRendererTurbo(this, 242, 69, textureX, textureY); // Box 17
		bodyModel[200] = new ModelRendererTurbo(this, 192, 76, textureX, textureY); // Box 18
		bodyModel[201] = new ModelRendererTurbo(this, 203, 76, textureX, textureY); // Box 19
		bodyModel[202] = new ModelRendererTurbo(this, 216, 76, textureX, textureY); // Box 20
		bodyModel[203] = new ModelRendererTurbo(this, 229, 76, textureX, textureY); // Box 21
		bodyModel[204] = new ModelRendererTurbo(this, 242, 76, textureX, textureY); // Box 22
		bodyModel[205] = new ModelRendererTurbo(this, 192, 91, textureX, textureY); // Box 23
		bodyModel[206] = new ModelRendererTurbo(this, 203, 91, textureX, textureY); // Box 24
		bodyModel[207] = new ModelRendererTurbo(this, 216, 91, textureX, textureY); // Box 25
		bodyModel[208] = new ModelRendererTurbo(this, 229, 91, textureX, textureY); // Box 26
		bodyModel[209] = new ModelRendererTurbo(this, 242, 91, textureX, textureY); // Box 27
		bodyModel[210] = new ModelRendererTurbo(this, 42, 20, textureX, textureY); // Box 28
		bodyModel[211] = new ModelRendererTurbo(this, 152, 2, textureX, textureY); // Box 13
		bodyModel[212] = new ModelRendererTurbo(this, 183, 2, textureX, textureY); // Box 14
		bodyModel[213] = new ModelRendererTurbo(this, 203, 2, textureX, textureY); // Box 15
		bodyModel[214] = new ModelRendererTurbo(this, 122, 78, textureX, textureY); // Box 16
		bodyModel[215] = new ModelRendererTurbo(this, 122, 78, textureX, textureY); // Box 17
		bodyModel[216] = new ModelRendererTurbo(this, 115, 78, textureX, textureY); // Box 18
		bodyModel[217] = new ModelRendererTurbo(this, 122, 69, textureX, textureY); // Box 19
		bodyModel[218] = new ModelRendererTurbo(this, 110, 71, textureX, textureY); // Box 20
		bodyModel[219] = new ModelRendererTurbo(this, 122, 69, textureX, textureY); // Box 21
		bodyModel[220] = new ModelRendererTurbo(this, 67, 76, textureX, textureY); // Box 22
		bodyModel[221] = new ModelRendererTurbo(this, 48, 76, textureX, textureY); // Box 23
		bodyModel[222] = new ModelRendererTurbo(this, 226, 16, textureX, textureY); // Box 24
		bodyModel[223] = new ModelRendererTurbo(this, 234, 16, textureX, textureY); // Box 25
		bodyModel[224] = new ModelRendererTurbo(this, 226, 9, textureX, textureY); // Box 26
		bodyModel[225] = new ModelRendererTurbo(this, 226, 2, textureX, textureY); // Box 27
		bodyModel[226] = new ModelRendererTurbo(this, 130, 2, textureX, textureY); // Box 28
		bodyModel[227] = new ModelRendererTurbo(this, 191, 36, textureX, textureY); // Box 29
		bodyModel[228] = new ModelRendererTurbo(this, 207, 36, textureX, textureY); // Box 30
		bodyModel[229] = new ModelRendererTurbo(this, 207, 44, textureX, textureY); // Box 31
		bodyModel[230] = new ModelRendererTurbo(this, 207, 50, textureX, textureY); // Box 32
		bodyModel[231] = new ModelRendererTurbo(this, 207, 44, textureX, textureY); // Box 33
		bodyModel[232] = new ModelRendererTurbo(this, 207, 36, textureX, textureY); // Box 34
		bodyModel[233] = new ModelRendererTurbo(this, 207, 44, textureX, textureY); // Box 35
		bodyModel[234] = new ModelRendererTurbo(this, 207, 50, textureX, textureY); // Box 36
		bodyModel[235] = new ModelRendererTurbo(this, 207, 44, textureX, textureY); // Box 37
		bodyModel[236] = new ModelRendererTurbo(this, 192, 19, textureX, textureY); // Box 38
		bodyModel[237] = new ModelRendererTurbo(this, 202, 19, textureX, textureY); // Box 39
		bodyModel[238] = new ModelRendererTurbo(this, 202, 11, textureX, textureY); // Box 40
		bodyModel[239] = new ModelRendererTurbo(this, 192, 11, textureX, textureY); // Box 41
		bodyModel[240] = new ModelRendererTurbo(this, 189, 28, textureX, textureY); // Box 42
		bodyModel[241] = new ModelRendererTurbo(this, 199, 28, textureX, textureY); // Box 43
		bodyModel[242] = new ModelRendererTurbo(this, 189, 28, textureX, textureY); // Box 44
		bodyModel[243] = new ModelRendererTurbo(this, 145, 23, textureX, textureY); // Box 45
		bodyModel[244] = new ModelRendererTurbo(this, 132, 23, textureX, textureY); // Box 46
		bodyModel[245] = new ModelRendererTurbo(this, 162, 23, textureX, textureY); // Box 47
		bodyModel[246] = new ModelRendererTurbo(this, 162, 15, textureX, textureY); // Box 48
		bodyModel[247] = new ModelRendererTurbo(this, 132, 15, textureX, textureY); // Box 49
		bodyModel[248] = new ModelRendererTurbo(this, 145, 15, textureX, textureY); // Box 50
		bodyModel[249] = new ModelRendererTurbo(this, 227, 45, textureX, textureY); // Box 51
		bodyModel[250] = new ModelRendererTurbo(this, 227, 37, textureX, textureY); // Box 52
		bodyModel[251] = new ModelRendererTurbo(this, 226, 32, textureX, textureY); // Box 53
		bodyModel[252] = new ModelRendererTurbo(this, 226, 24, textureX, textureY); // Box 54
		bodyModel[253] = new ModelRendererTurbo(this, 227, 53, textureX, textureY); // Box 55
		bodyModel[254] = new ModelRendererTurbo(this, 227, 58, textureX, textureY); // Box 56
		bodyModel[255] = new ModelRendererTurbo(this, 227, 53, textureX, textureY); // Box 57
		bodyModel[256] = new ModelRendererTurbo(this, 175, 20, textureX, textureY); // Box 58
		bodyModel[257] = new ModelRendererTurbo(this, 175, 24, textureX, textureY); // Box 59
		bodyModel[258] = new ModelRendererTurbo(this, 183, 20, textureX, textureY); // Box 60
		bodyModel[259] = new ModelRendererTurbo(this, 183, 20, textureX, textureY); // Box 61
		bodyModel[260] = new ModelRendererTurbo(this, 175, 24, textureX, textureY); // Box 62
		bodyModel[261] = new ModelRendererTurbo(this, 175, 20, textureX, textureY); // Box 63
		bodyModel[262] = new ModelRendererTurbo(this, 183, 24, textureX, textureY); // Box 64
		bodyModel[263] = new ModelRendererTurbo(this, 179, 32, textureX, textureY); // Box 65
		bodyModel[264] = new ModelRendererTurbo(this, 185, 11, textureX, textureY); // Box 66
		bodyModel[265] = new ModelRendererTurbo(this, 185, 11, textureX, textureY); // Box 67
		bodyModel[266] = new ModelRendererTurbo(this, 62, 29, textureX, textureY); // Box 68
		bodyModel[267] = new ModelRendererTurbo(this, 62, 41, textureX, textureY); // Box 69
		bodyModel[268] = new ModelRendererTurbo(this, 83, 69, textureX, textureY); // Box 71
		bodyModel[269] = new ModelRendererTurbo(this, 83, 77, textureX, textureY); // Box 72
		bodyModel[270] = new ModelRendererTurbo(this, 83, 69, textureX, textureY); // Box 73
		bodyModel[271] = new ModelRendererTurbo(this, 96, 69, textureX, textureY); // Box 74
		bodyModel[272] = new ModelRendererTurbo(this, 96, 77, textureX, textureY); // Box 75
		bodyModel[273] = new ModelRendererTurbo(this, 96, 69, textureX, textureY); // Box 76
		bodyModel[274] = new ModelRendererTurbo(this, 83, 53, textureX, textureY); // Box 77
		bodyModel[275] = new ModelRendererTurbo(this, 83, 61, textureX, textureY); // Box 78
		bodyModel[276] = new ModelRendererTurbo(this, 83, 53, textureX, textureY); // Box 79
		bodyModel[277] = new ModelRendererTurbo(this, 115, 69, textureX, textureY); // Box 219

		bodyModel[0].addShapeBox(-7F, -14F, 3F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(0F, -39F, 0F);

		bodyModel[1].addShapeBox(6F, -6F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(0F, -39F, 0F);

		bodyModel[2].addShapeBox(-3F, -18F, -2F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, -39F, 0F);

		bodyModel[3].addShapeBox(-13F, -18F, -3F, 10, 4, 6, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, -39F, 0F);

		bodyModel[4].addShapeBox(-12F, -14F, -3F, 6, 13, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(0F, -39F, 0F);

		bodyModel[5].addShapeBox(-15F, -17.83F, -3F, 10, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(0F, -39F, 0F);
		bodyModel[5].rotateAngleZ = 0.38397244F;

		bodyModel[6].addShapeBox(-17F, -17.84F, -3F, 2, 10, 1, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 7
		bodyModel[6].setRotationPoint(0F, -39F, 0F);
		bodyModel[6].rotateAngleZ = 0.38397244F;

		bodyModel[7].addShapeBox(-9F, -5F, 0F, 3, 6, 2, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(0F, -39F, 0F);

		bodyModel[8].addShapeBox(5F, -18F, -2F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, -3.5F, -.5F, 0F, -3.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -.5F, 0F, 4F, -.5F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(0F, -39F, 0F);

		bodyModel[9].addShapeBox(7F, -10F, 0F, 9, 1, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 5F, 0F); // Box 10
		bodyModel[9].setRotationPoint(0F, -39F, 0F);

		bodyModel[10].addShapeBox(16F, -10F, -2.5F, 3, 1, 5, 0F,0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, -.5F); // Box 11
		bodyModel[10].setRotationPoint(0F, -39F, 0F);

		bodyModel[11].addShapeBox(15.8F, -14F, -1.5F, 4, 4, 3, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(0F, -39F, 0F);

		bodyModel[12].addShapeBox(18F, -10F, 1F, 2, 1, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F); // Box 13
		bodyModel[12].setRotationPoint(0F, -39F, 0F);

		bodyModel[13].addShapeBox(-16F, -28F, -4F, 1, 16, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 14
		bodyModel[13].setRotationPoint(0F, -39F, 0F);

		bodyModel[14].addShapeBox(19F, -9F, 1F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1.5F, 0F, -.2F, 1.5F, 0F, -.2F, 1.5F, 0F, -.2F, -1.5F, 0F, -.2F); // Box 15
		bodyModel[14].setRotationPoint(0F, -39F, 0F);

		bodyModel[15].addShapeBox(-1.5F, -21F, 4F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(0F, -39F, 0F);

		bodyModel[16].addShapeBox(-1.5F, -23F, 4F, 1, 2, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(0F, -39F, 0F);

		bodyModel[17].addShapeBox(-1.5F, -31F, 4F, 1, 8, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 19
		bodyModel[17].setRotationPoint(0F, -39F, 0F);

		bodyModel[18].addShapeBox(-5.5F, -19F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(0F, -39F, 0F);

		bodyModel[19].addShapeBox(-5.5F, -21F, 0F, 1, 2, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(0F, -39F, 0F);

		bodyModel[20].addShapeBox(-6.5F, -32F, 0F, 2, 12, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 22
		bodyModel[20].setRotationPoint(0F, -39F, 0F);

		bodyModel[21].addShapeBox(-3F, -15F, 21F, 4, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[21].setRotationPoint(0F, -39F, 0F);

		bodyModel[22].addShapeBox(-3F, -12F, 21F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[22].setRotationPoint(0F, -39F, 0F);

		bodyModel[23].addShapeBox(1F, -15F, 21F, 2, 3, 3, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[23].setRotationPoint(0F, -39F, 0F);

		bodyModel[24].addShapeBox(1F, -12F, 21F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F); // Box 3
		bodyModel[24].setRotationPoint(0F, -39F, 0F);

		bodyModel[25].addShapeBox(-5F, -15F, 21F, 2, 3, 3, 0F,0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[25].setRotationPoint(0F, -39F, 0F);

		bodyModel[26].addShapeBox(-3.5F, -7F, 21.5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 6
		bodyModel[26].setRotationPoint(0F, -39F, 0F);

		bodyModel[27].addShapeBox(-3.5F, -2F, 21.5F, 2, 5, 2, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[27].setRotationPoint(0F, -39F, 0F);

		bodyModel[28].addShapeBox(-0.5F, -2F, 21.5F, 2, 5, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[28].setRotationPoint(0F, -39F, 0F);

		bodyModel[29].addShapeBox(-0.5F, -7F, 21.5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[29].setRotationPoint(0F, -39F, 0F);

		bodyModel[30].addShapeBox(-2.5F, -2.5F, 21F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[30].setRotationPoint(0F, -39F, 0F);

		bodyModel[31].addShapeBox(16F, -14F, 1.5F, 4, 4, 1, 0F,0F, .3F, 0F, -.5F, -.8F, .5F, -.5F, -.8F, -1F, 0F, .3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, -.2F); // Box 16
		bodyModel[31].setRotationPoint(0F, -39F, 0F);

		bodyModel[32].addShapeBox(-7F, -6F, 5F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 27
		bodyModel[32].setRotationPoint(0F, -39F, 0F);

		bodyModel[33].addShapeBox(-4F, -6F, 6F, 8, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 36
		bodyModel[33].setRotationPoint(0F, -39F, 0F);

		bodyModel[34].addShapeBox(-6F, -7F, 8F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[34].setRotationPoint(0F, -39F, 0F);

		bodyModel[35].addShapeBox(-7F, -10F, 5F, 3, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(0F, -39F, 0F);

		bodyModel[36].addShapeBox(4F, -6F, 6F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[36].setRotationPoint(0F, -39F, 0F);

		bodyModel[37].addShapeBox(-6F, -8F, 8F, 12, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(0F, -39F, 0F);

		bodyModel[38].addShapeBox(-6F, -5F, 8F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 41
		bodyModel[38].setRotationPoint(0F, -39F, 0F);

		bodyModel[39].addShapeBox(-13F, -18F, 3F, 10, 4, 3, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[39].setRotationPoint(0F, -39F, 0F);

		bodyModel[40].addShapeBox(-7F, -14F, 5F, 3, 4, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(0F, -39F, 0F);

		bodyModel[41].addShapeBox(6F, -8F, 8F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 44
		bodyModel[41].setRotationPoint(0F, -39F, 0F);

		bodyModel[42].addShapeBox(6F, -7F, 8F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 45
		bodyModel[42].setRotationPoint(0F, -39F, 0F);

		bodyModel[43].addShapeBox(6F, -5F, 8F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 47
		bodyModel[43].setRotationPoint(0F, -39F, 0F);

		bodyModel[44].addShapeBox(-7F, -5F, 8F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 48
		bodyModel[44].setRotationPoint(0F, -39F, 0F);

		bodyModel[45].addShapeBox(-7F, -7F, 8F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 49
		bodyModel[45].setRotationPoint(0F, -39F, 0F);

		bodyModel[46].addShapeBox(-7F, -8F, 8F, 1, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 50
		bodyModel[46].setRotationPoint(0F, -39F, 0F);

		bodyModel[47].addShapeBox(-4F, -12F, 9F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[47].setRotationPoint(0F, -39F, 0F);

		bodyModel[48].addShapeBox(5F, -18F, 2F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, -4F, -3F, 0F, 0F, 0.5F, 0F, 0F, -0.7F, 0F, -4F, 3F); // Box 0
		bodyModel[48].setRotationPoint(0F, -39F, 0F);

		bodyModel[49].addShapeBox(16F, -14.3F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0F, -.5F, -1.1F, -.5F, -.5F, -1.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.56F, .5F, -.44F, -.56F, .5F, -.44F, 0F, 0F, 0F); // Box 1
		bodyModel[49].setRotationPoint(0F, -39F, 0F);

		bodyModel[50].addShapeBox(-3F, -18F, 2F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 2
		bodyModel[50].setRotationPoint(0F, -39F, 0F);

		bodyModel[51].addShapeBox(-13F, -14F, 3F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 3
		bodyModel[51].setRotationPoint(0F, -39F, 0F);

		bodyModel[52].addShapeBox(4F, -14F, 6F, 3, 4, 5, 0F,-1F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[52].setRotationPoint(0F, -39F, 0F);

		bodyModel[53].addShapeBox(-4F, -14F, 6F, 8, 2, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[53].setRotationPoint(0F, -39F, 0F);

		bodyModel[54].addShapeBox(4F, -10F, 6F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[54].setRotationPoint(0F, -39F, 0F);

		bodyModel[55].addShapeBox(5F, -14F, 2F, 11, 5, 1, 0F,0F, 0F, -3F, 0F, -4F, 1F, 0F, -4F, -.7F, 0F, 0F, 3F, -2F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, 3F); // Box 8
		bodyModel[55].setRotationPoint(0F, -39F, 0F);

		bodyModel[56].addShapeBox(4F, -15F, 7F, 4, 3, 4, 0F,0F, 0F, 0F, 2F, -2F, 2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1.2F, 0F, 4F, 2F, 3F, 2F, 2F, -3F, 0F, -1.2F, 0F); // Box 9
		bodyModel[56].setRotationPoint(0F, -39F, 0F);

		bodyModel[57].addShapeBox(5F, -9F, 2F, 11, 5, 1, 0F,-2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 3F, -2F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, -1F, -2F, -2F, 3F); // Box 10
		bodyModel[57].setRotationPoint(0F, -39F, 0F);

		bodyModel[58].addShapeBox(1F, -15F, 7F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[58].setRotationPoint(0F, -39F, 0F);

		bodyModel[59].addShapeBox(7F, -12F, 6F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, -1F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.8F, 0F, 0F); // Box 12
		bodyModel[59].setRotationPoint(0F, -39F, 0F);

		bodyModel[60].addShapeBox(7F, -9F, 6F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -3F, -2F, 1.8F, -3F, 0F); // Box 13
		bodyModel[60].setRotationPoint(0F, -39F, 0F);

		bodyModel[61].addShapeBox(5F, -10.2F, 5F, 5, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[61].setRotationPoint(0F, -39F, 0F);

		bodyModel[62].addShapeBox(5F, -21F, 8F, 1, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[62].setRotationPoint(0F, -39F, 0F);
		bodyModel[62].rotateAngleZ = 0.38397244F;

		bodyModel[63].addShapeBox(5F, -9.2F, 5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 16
		bodyModel[63].setRotationPoint(0F, -39F, 0F);

		bodyModel[64].addShapeBox(4.5F, -9.2F, 7F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 17
		bodyModel[64].setRotationPoint(0F, -39F, 0F);

		bodyModel[65].addShapeBox(4.5F, -10.2F, 7F, 5, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[65].setRotationPoint(0F, -39F, 0F);

		bodyModel[66].addShapeBox(5F, -21F, 9F, 1, 5, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, .5F, -1F, 1F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 19
		bodyModel[66].setRotationPoint(0F, -39F, 0F);
		bodyModel[66].rotateAngleZ = 0.38397244F;

		bodyModel[67].addShapeBox(5F, -16F, 8F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[67].setRotationPoint(0F, -39F, 0F);
		bodyModel[67].rotateAngleZ = 0.38397244F;

		bodyModel[68].addShapeBox(5F, -16F, 9F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 1F, -3F, 0F); // Box 21
		bodyModel[68].setRotationPoint(0F, -39F, 0F);
		bodyModel[68].rotateAngleZ = 0.38397244F;

		bodyModel[69].addShapeBox(4F, -27F, 8F, 1, 11, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[69].setRotationPoint(0F, -39F, 0F);
		bodyModel[69].rotateAngleZ = 0.38397244F;

		bodyModel[70].addShapeBox(-4F, 3F, 21F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[70].setRotationPoint(0F, -39F, 0F);

		bodyModel[71].addShapeBox(7F, -4F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 24
		bodyModel[71].setRotationPoint(0F, -39F, 0F);

		bodyModel[72].addShapeBox(-12F, -12F, 3.5F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[72].setRotationPoint(0F, -39F, 0F);

		bodyModel[73].addShapeBox(19F, -7.5F, -1.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[73].setRotationPoint(0F, -39F, 0F);
		bodyModel[73].rotateAngleZ = 0.6981317F;

		bodyModel[74].addShapeBox(19F, -7.5F, 1.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 27
		bodyModel[74].setRotationPoint(0F, -39F, 0F);
		bodyModel[74].rotateAngleZ = 0.6981317F;

		bodyModel[75].addShapeBox(5F, -16F, 6F, 1, 4, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[75].setRotationPoint(0F, -39F, 0F);
		bodyModel[75].rotateAngleZ = 0.38397244F;

		bodyModel[76].addShapeBox(5F, -21F, 6F, 1, 5, 2, 0F,1F, 0.5F, -1F, -2F, 0.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[76].setRotationPoint(0F, -39F, 0F);
		bodyModel[76].rotateAngleZ = 0.38397244F;

		bodyModel[77].addShapeBox(-13F, -14F, 6F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -9F, -2F, 0F, 0F, -3F, 0F, 0F, .5F, 0F, 3F, 0F, 0F, -9F, 0F, 0F); // Box 30
		bodyModel[77].setRotationPoint(0F, -39F, 0F);

		bodyModel[78].addShapeBox(-16F, -12F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[78].setRotationPoint(0F, -39F, 0F);

		bodyModel[79].addShapeBox(7F, -4F, 2F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, 0F, 1F, 0F); // Box 33
		bodyModel[79].setRotationPoint(0F, -39F, 0F);

		bodyModel[80].addShapeBox(7F, -5F, 4F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[80].setRotationPoint(0F, -39F, 0F);

		bodyModel[81].addShapeBox(7F, -5F, 6F, 1, 5, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, .5F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 35
		bodyModel[81].setRotationPoint(0F, -39F, 0F);

		bodyModel[82].addShapeBox(20.5F, -8F, 1F, 1, 2, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F); // Box 0
		bodyModel[82].setRotationPoint(0F, -39F, 0F);

		bodyModel[83].addShapeBox(18F, -10F, -2F, 2, 1, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F); // Box 1
		bodyModel[83].setRotationPoint(0F, -39F, 0F);

		bodyModel[84].addShapeBox(19F, -9F, -2F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1.5F, 0F, -.2F, 1.5F, 0F, -.2F, 1.5F, 0F, -.2F, -1.5F, 0F, -.2F); // Box 2
		bodyModel[84].setRotationPoint(0F, -39F, 0F);

		bodyModel[85].addShapeBox(20.5F, -8F, -2F, 1, 2, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F); // Box 3
		bodyModel[85].setRotationPoint(0F, -39F, 0F);

		bodyModel[86].addShapeBox(18F, -10F, 0F, 2, 1, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F); // Box 4
		bodyModel[86].setRotationPoint(0F, -39F, 0F);

		bodyModel[87].addShapeBox(19F, -9F, 0F, 2, 1, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, -.5F, -.2F); // Box 5
		bodyModel[87].setRotationPoint(0F, -39F, 0F);

		bodyModel[88].addShapeBox(20.5F, -9F, 0F, 1, 2, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1F, -.2F); // Box 6
		bodyModel[88].setRotationPoint(0F, -39F, 0F);

		bodyModel[89].addShapeBox(20.5F, -9F, -1F, 1, 2, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1F, -.2F); // Box 7
		bodyModel[89].setRotationPoint(0F, -39F, 0F);

		bodyModel[90].addShapeBox(19F, -9F, -1F, 2, 1, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, -.5F, -.2F); // Box 8
		bodyModel[90].setRotationPoint(0F, -39F, 0F);

		bodyModel[91].addShapeBox(18F, -10F, -1F, 2, 1, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F); // Box 9
		bodyModel[91].setRotationPoint(0F, -39F, 0F);

		bodyModel[92].addShapeBox(-9.5F, -11F, 4F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[92].setRotationPoint(0F, -39F, 0F);

		bodyModel[93].addShapeBox(-10.5F, -11F, 4F, 1, 9, 5, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 13
		bodyModel[93].setRotationPoint(0F, -39F, 0F);

		bodyModel[94].addShapeBox(-11.5F, -11F, 4.5F, 1, 9, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 14
		bodyModel[94].setRotationPoint(0F, -39F, 0F);

		bodyModel[95].addShapeBox(-8.5F, -11F, 4F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 15
		bodyModel[95].setRotationPoint(0F, -39F, 0F);

		bodyModel[96].addShapeBox(-7.5F, -11F, 4.5F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 16
		bodyModel[96].setRotationPoint(0F, -39F, 0F);

		bodyModel[97].addShapeBox(-9.5F, -2F, 4F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		bodyModel[97].setRotationPoint(0F, -39F, 0F);

		bodyModel[98].addShapeBox(-10.5F, -2F, 4F, 1, 4, 5, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 18
		bodyModel[98].setRotationPoint(0F, -39F, 0F);

		bodyModel[99].addShapeBox(-11.5F, -2F, 4.5F, 1, 4, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, -.5F, 1F, 0F, -.5F, -1F, 0F, -1.5F); // Box 19
		bodyModel[99].setRotationPoint(0F, -39F, 0F);

		bodyModel[100].addShapeBox(-3.5F, -13.5F, 7F, 7, 3, 7, 0F,0F, 1F, 2F, 0F, 1F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 21
		bodyModel[100].setRotationPoint(0F, -39F, 0F);

		bodyModel[101].addShapeBox(-2.5F, -13.5F, 14F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 22
		bodyModel[101].setRotationPoint(0F, -39F, 0F);

		bodyModel[102].addShapeBox(2.5F, -13.5F, 14F, 6, 3, 4, 0F,0F, 0F, 0F, -2F, -2F, 6F, 0F, -2F, -12F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 6F, 0F, 0F, -12F, 0F, 0F, 0F); // Box 23
		bodyModel[102].setRotationPoint(0F, -39F, 0F);

		bodyModel[103].addShapeBox(-3.5F, -12.5F, 18F, 6, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 24
		bodyModel[103].setRotationPoint(0F, -39F, 0F);

		bodyModel[104].addShapeBox(-2F, -14F, 11.5F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[104].setRotationPoint(0F, -39F, 0F);

		bodyModel[105].addShapeBox(-1.5F, -13F, 16F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[105].setRotationPoint(0F, -39F, 0F);

		bodyModel[106].addShapeBox(2.5F, -13F, 16F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[106].setRotationPoint(0F, -39F, 0F);

		bodyModel[107].addShapeBox(2.5F, -13F, 14F, 1, 3, 2, 0F,-1.5F, 0F, 0F, 1.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[107].setRotationPoint(0F, -39F, 0F);

		bodyModel[108].addShapeBox(-8.5F, -2F, 4F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 29
		bodyModel[108].setRotationPoint(0F, -39F, 0F);

		bodyModel[109].addShapeBox(-7.5F, -2F, 4.5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, -0.5F); // Box 30
		bodyModel[109].setRotationPoint(0F, -39F, 0F);

		bodyModel[110].addShapeBox(-11.5F, -12F, 4.5F, 1, 1, 4, 0F,-1F, -.5F, -1.5F, 1F, -.5F, -0.5F, 1F, -.5F, -0.5F, -1F, -.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 31
		bodyModel[110].setRotationPoint(0F, -39F, 0F);

		bodyModel[111].addShapeBox(-10.5F, -12F, 4F, 1, 1, 5, 0F,-1F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, -1F, -.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 32
		bodyModel[111].setRotationPoint(0F, -39F, 0F);

		bodyModel[112].addShapeBox(-9.5F, -12F, 4F, 1, 1, 5, 0F,0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[112].setRotationPoint(0F, -39F, 0F);

		bodyModel[113].addShapeBox(-15F, -12F, 3.5F, 3, 5, 2, 0F,.5F, -4F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -4F, -.5F, 0F, 1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -.5F); // Box 34
		bodyModel[113].setRotationPoint(0F, -39F, 0F);

		bodyModel[114].addShapeBox(-17F, -17.84F, -2F, 2, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[114].setRotationPoint(0F, -39F, 0F);
		bodyModel[114].rotateAngleZ = 0.38397244F;

		bodyModel[115].addShapeBox(-17F, -10.84F, -2F, 2, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 37
		bodyModel[115].setRotationPoint(0F, -39F, 0F);
		bodyModel[115].rotateAngleZ = 0.38397244F;

		bodyModel[116].addShapeBox(-17F, -17.84F, 2F, 2, 10, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 38
		bodyModel[116].setRotationPoint(0F, -39F, 0F);
		bodyModel[116].rotateAngleZ = 0.38397244F;

		bodyModel[117].addShapeBox(-17F, -14.84F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[117].setRotationPoint(0F, -39F, 0F);
		bodyModel[117].rotateAngleZ = 0.38397244F;

		bodyModel[118].addShapeBox(-17F, -14.84F, 1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[118].setRotationPoint(0F, -39F, 0F);
		bodyModel[118].rotateAngleZ = 0.38397244F;

		bodyModel[119].addShapeBox(-17F, -14.84F, -1F, 1, 1, 2, 0F,0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 41
		bodyModel[119].setRotationPoint(0F, -39F, 0F);
		bodyModel[119].rotateAngleZ = 0.38397244F;

		bodyModel[120].addShapeBox(-17F, -13.84F, -1F, 1, 1, 2, 0F,0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 42
		bodyModel[120].setRotationPoint(0F, -39F, 0F);
		bodyModel[120].rotateAngleZ = 0.38397244F;

		bodyModel[121].addShapeBox(-17F, -12.84F, -1F, 1, 1, 2, 0F,0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 43
		bodyModel[121].setRotationPoint(0F, -39F, 0F);
		bodyModel[121].rotateAngleZ = 0.38397244F;

		bodyModel[122].addShapeBox(-17F, -11.84F, -1F, 1, 1, 2, 0F,0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 44
		bodyModel[122].setRotationPoint(0F, -39F, 0F);
		bodyModel[122].rotateAngleZ = 0.38397244F;

		bodyModel[123].addShapeBox(-4F, -7F, 21F, 1, 1, 3, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F); // Box 54
		bodyModel[123].setRotationPoint(0F, -39F, 0F);

		bodyModel[124].addShapeBox(0.5F, -2.5F, 21F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 55
		bodyModel[124].setRotationPoint(0F, -39F, 0F);

		bodyModel[125].addShapeBox(-3.5F, -2.5F, 21F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 56
		bodyModel[125].setRotationPoint(0F, -39F, 0F);

		bodyModel[126].addShapeBox(-1F, -9F, 24F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 57
		bodyModel[126].setRotationPoint(0F, -39F, 0F);

		bodyModel[127].addShapeBox(-2F, -9F, 24F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 58
		bodyModel[127].setRotationPoint(0F, -39F, 0F);

		bodyModel[128].addShapeBox(1.5F, -6F, 21.5F, 2, 5, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[128].setRotationPoint(0F, -39F, 0F);
		bodyModel[128].rotateAngleZ = 0.08726646F;

		bodyModel[129].addShapeBox(1.5F, -7F, 21.5F, 2, 1, 1, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[129].setRotationPoint(0F, -39F, 0F);
		bodyModel[129].rotateAngleZ = 0.08726646F;

		bodyModel[130].addShapeBox(1.5F, -1F, 21.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
		bodyModel[130].setRotationPoint(0F, -39F, 0F);
		bodyModel[130].rotateAngleZ = 0.08726646F;

		bodyModel[131].addShapeBox(1.5F, -6F, 22.5F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 62
		bodyModel[131].setRotationPoint(0F, -39F, 0F);
		bodyModel[131].rotateAngleZ = 0.08726646F;

		bodyModel[132].addShapeBox(1.5F, -7F, 22.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 63
		bodyModel[132].setRotationPoint(0F, -39F, 0F);
		bodyModel[132].rotateAngleZ = 0.08726646F;

		bodyModel[133].addShapeBox(1.5F, -1F, 22.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 64
		bodyModel[133].setRotationPoint(0F, -39F, 0F);
		bodyModel[133].rotateAngleZ = 0.08726646F;

		bodyModel[134].addShapeBox(2F, 0F, 22F, 1, 5, 1, 0F,-.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 65
		bodyModel[134].setRotationPoint(0F, -39F, 0F);
		bodyModel[134].rotateAngleZ = 0.08726646F;

		bodyModel[135].addShapeBox(-3F, -13F, 22.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[135].setRotationPoint(0F, -39F, 0F);

		bodyModel[136].addShapeBox(-3F, -14F, 22.5F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[136].setRotationPoint(0F, -39F, 0F);

		bodyModel[137].addShapeBox(-3F, -11F, 22.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 68
		bodyModel[137].setRotationPoint(0F, -39F, 0F);

		bodyModel[138].addShapeBox(-3F, -18.5F, 21F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[138].setRotationPoint(0F, -39F, 0F);

		bodyModel[139].addShapeBox(-3F, -19.5F, 21F, 4, 1, 3, 0F,-.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[139].setRotationPoint(0F, -39F, 0F);

		bodyModel[140].addShapeBox(-3F, -15.5F, 21F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F); // Box 71
		bodyModel[140].setRotationPoint(0F, -39F, 0F);

		bodyModel[141].addShapeBox(-5.5F, -19.5F, 20F, 9, 1, 5, 0F,-3F, -.2F, -1.5F, -3F, -.2F, -1.5F, -3F, -.2F, -1.5F, -3F, -.2F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F); // Box 72
		bodyModel[141].setRotationPoint(0F, -39F, 0F);

		bodyModel[142].addShapeBox(-4F, 2F, 21F, 2, 1, 3, 0F,-.6F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[142].setRotationPoint(0F, -39F, 0F);

		bodyModel[143].addShapeBox(-3F, 1F, 21F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F); // Box 81
		bodyModel[143].setRotationPoint(0F, -39F, 0F);

		bodyModel[144].addShapeBox(-3F, 6F, 21F, 4, 1, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 83
		bodyModel[144].setRotationPoint(0F, -39F, 0F);

		bodyModel[145].addShapeBox(-5F, -12F, 21F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F); // Box 84
		bodyModel[145].setRotationPoint(0F, -39F, 0F);

		bodyModel[146].addShapeBox(-4F, 5F, 21F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F); // Box 90
		bodyModel[146].setRotationPoint(0F, -39F, 0F);

		bodyModel[147].addShapeBox(0F, 5F, 21F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F); // Box 91
		bodyModel[147].setRotationPoint(0F, -39F, 0F);

		bodyModel[148].addShapeBox(0F, 2F, 21F, 2, 1, 3, 0F,-0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 92
		bodyModel[148].setRotationPoint(0F, -39F, 0F);

		bodyModel[149].addShapeBox(1F, 3F, 21F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[149].setRotationPoint(0F, -39F, 0F);

		bodyModel[150].addShapeBox(-3F, 2F, 21F, 4, 4, 3, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 94
		bodyModel[150].setRotationPoint(0F, -39F, 0F);

		bodyModel[151].addShapeBox(-2F, 3F, 21F, 2, 1, 3, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[151].setRotationPoint(0F, -39F, 0F);

		bodyModel[152].addShapeBox(-2F, 4F, 21F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 96
		bodyModel[152].setRotationPoint(0F, -39F, 0F);

		bodyModel[153].addShapeBox(0F, 5F, 22F, 3, 1, 1, 0F,-.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -1F, 0F, -.1F, -1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 21
		bodyModel[153].setRotationPoint(0F, -39F, 0F);
		bodyModel[153].rotateAngleZ = 0.08726646F;

		bodyModel[154].addShapeBox(18F, -5.5F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 0
		bodyModel[154].setRotationPoint(0F, -39F, 0F);
		bodyModel[154].rotateAngleZ = 0.97738438F;

		bodyModel[155].addShapeBox(18.2F, -4.5F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[155].setRotationPoint(0F, -39F, 0F);
		bodyModel[155].rotateAngleZ = 1.20427718F;

		bodyModel[156].addShapeBox(17.8F, -5.2F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[156].setRotationPoint(0F, -39F, 0F);
		bodyModel[156].rotateAngleZ = 1.32645023F;

		bodyModel[157].addShapeBox(17.2F, -5.6F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[157].setRotationPoint(0F, -39F, 0F);
		bodyModel[157].rotateAngleZ = 1.46607657F;

		bodyModel[158].addShapeBox(17.3F, -4.6F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[158].setRotationPoint(0F, -39F, 0F);
		bodyModel[158].rotateAngleZ = 1.67551608F;

		bodyModel[159].addShapeBox(5F, -9F, -3F, 11, 5, 1, 0F,-2F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, -2F, 3F, 0F, -5F, -1F, 0F, -5F, 0F, -2F, 0F, -1F); // Box 0
		bodyModel[159].setRotationPoint(0F, -39F, 0F);

		bodyModel[160].addShapeBox(5F, -14F, -3F, 11, 5, 1, 0F,0F, 0F, 3F, 0F, -4F, -0.7F, 0F, -4F, 1F, 0F, 0F, -3F, -2F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, -3F); // Box 1
		bodyModel[160].setRotationPoint(0F, -39F, 0F);

		bodyModel[161].addShapeBox(5F, -18F, -3F, 11, 8, 1, 0F,0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, -3.5F, 0.5F, 0F, 0F, 0F, 0F, -4F, 3F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, 0F, -4F, -3F); // Box 2
		bodyModel[161].setRotationPoint(0F, -39F, 0F);

		bodyModel[162].addShapeBox(-3F, -18F, -3F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 3
		bodyModel[162].setRotationPoint(0F, -39F, 0F);

		bodyModel[163].addShapeBox(6F, -6F, -6F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[163].setRotationPoint(0F, -39F, 0F);

		bodyModel[164].addShapeBox(7F, -10F, -3F, 9, 1, 3, 0F,0F, -4F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, 0F); // Box 6
		bodyModel[164].setRotationPoint(0F, -39F, 0F);

		bodyModel[165].addShapeBox(16F, -14F, -2.5F, 4, 4, 1, 0F,0F, 0.3F, 0F, -0.5F, -0.8F, -1F, -0.5F, -0.8F, 0.5F, 0F, 0.3F, 0F, 0F, 0F, -0.2F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[165].setRotationPoint(0F, -39F, 0F);

		bodyModel[166].addShapeBox(18F, -5.5F, -3F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[166].setRotationPoint(0F, -39F, 0F);
		bodyModel[166].rotateAngleZ = 0.97738438F;

		bodyModel[167].addShapeBox(17.8F, -5.2F, -3F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 9
		bodyModel[167].setRotationPoint(0F, -39F, 0F);
		bodyModel[167].rotateAngleZ = 1.32645023F;

		bodyModel[168].addShapeBox(17.3F, -4.6F, -3F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 10
		bodyModel[168].setRotationPoint(0F, -39F, 0F);
		bodyModel[168].rotateAngleZ = 1.67551608F;

		bodyModel[169].addShapeBox(18.2F, -4.5F, -3F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 11
		bodyModel[169].setRotationPoint(0F, -39F, 0F);
		bodyModel[169].rotateAngleZ = 1.20427718F;

		bodyModel[170].addShapeBox(17.2F, -5.6F, -3F, 1, 4, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 12
		bodyModel[170].setRotationPoint(0F, -39F, 0F);
		bodyModel[170].rotateAngleZ = 1.46607657F;

		bodyModel[171].addShapeBox(19F, -7.5F, -2.5F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[171].setRotationPoint(0F, -39F, 0F);
		bodyModel[171].rotateAngleZ = 0.6981317F;

		bodyModel[172].addShapeBox(7F, -4F, -2F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 14
		bodyModel[172].setRotationPoint(0F, -39F, 0F);

		bodyModel[173].addShapeBox(7F, -4F, -4F, 1, 4, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[173].setRotationPoint(0F, -39F, 0F);

		bodyModel[174].addShapeBox(7F, -5F, -6F, 1, 6, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[174].setRotationPoint(0F, -39F, 0F);

		bodyModel[175].addShapeBox(7F, -5F, -8F, 1, 5, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0F); // Box 17
		bodyModel[175].setRotationPoint(0F, -39F, 0F);

		bodyModel[176].addShapeBox(4F, -6F, -9F, 3, 5, 3, 0F,0F, 0F, 2F, -3F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[176].setRotationPoint(0F, -39F, 0F);

		bodyModel[177].addShapeBox(4F, -10F, -11F, 3, 4, 5, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[177].setRotationPoint(0F, -39F, 0F);

		bodyModel[178].addShapeBox(-8.5F, -12F, 4F, 1, 1, 5, 0F,0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 6
		bodyModel[178].setRotationPoint(0F, -39F, 0F);

		bodyModel[179].addShapeBox(-9F, -5F, -2F, 3, 6, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 7
		bodyModel[179].setRotationPoint(0F, -39F, 0F);

		bodyModel[180].addShapeBox(7F, -9F, -9F, 2, 3, 3, 0F,1.8F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 1.8F, -3F, 0F, 0F, -3F, -2F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 8
		bodyModel[180].setRotationPoint(0F, -39F, 0F);

		bodyModel[181].addShapeBox(4.5F, -9.2F, -9F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 9
		bodyModel[181].setRotationPoint(0F, -39F, 0F);

		bodyModel[182].addShapeBox(4.5F, -10.2F, -9F, 5, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[182].setRotationPoint(0F, -39F, 0F);

		bodyModel[183].addShapeBox(5F, -10.2F, -7F, 5, 1, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[183].setRotationPoint(0F, -39F, 0F);

		bodyModel[184].addShapeBox(5F, -9.2F, -7F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 12
		bodyModel[184].setRotationPoint(0F, -39F, 0F);

		bodyModel[185].addShapeBox(7F, -12F, -9F, 2, 3, 3, 0F,1.8F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 13
		bodyModel[185].setRotationPoint(0F, -39F, 0F);

		bodyModel[186].addShapeBox(4F, -14F, -11F, 3, 4, 5, 0F,0F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[186].setRotationPoint(0F, -39F, 0F);

		bodyModel[187].addShapeBox(-4F, -14F, -11F, 8, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 15
		bodyModel[187].setRotationPoint(0F, -39F, 0F);

		bodyModel[188].addShapeBox(-13F, -14F, -6F, 7, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 5
		bodyModel[188].setRotationPoint(0F, -39F, 0F);

		bodyModel[189].addShapeBox(-13F, -18F, -6F, 10, 4, 3, 0F,0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[189].setRotationPoint(0F, -39F, 0F);

		bodyModel[190].addShapeBox(-13F, -14F, -11F, 6, 4, 5, 0F,-9F, -2F, 0F, 3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 3F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F); // Box 7
		bodyModel[190].setRotationPoint(0F, -39F, 0F);

		bodyModel[191].addShapeBox(-12F, -12F, -5.5F, 6, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[191].setRotationPoint(0F, -39F, 0F);

		bodyModel[192].addShapeBox(-15F, -12F, -5.5F, 3, 5, 2, 0F,0.5F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F); // Box 9
		bodyModel[192].setRotationPoint(0F, -39F, 0F);

		bodyModel[193].addShapeBox(-7F, -14F, -5F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[193].setRotationPoint(0F, -39F, 0F);

		bodyModel[194].addShapeBox(-7F, -10F, -11F, 3, 4, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[194].setRotationPoint(0F, -39F, 0F);

		bodyModel[195].addShapeBox(-7F, -6F, -8F, 3, 5, 3, 0F,-3F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[195].setRotationPoint(0F, -39F, 0F);

		bodyModel[196].addShapeBox(-8.5F, -12F, -9F, 1, 1, 5, 0F,0F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 14
		bodyModel[196].setRotationPoint(0F, -39F, 0F);

		bodyModel[197].addShapeBox(-9.5F, -12F, -9F, 1, 1, 5, 0F,0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[197].setRotationPoint(0F, -39F, 0F);

		bodyModel[198].addShapeBox(-10.5F, -12F, -9F, 1, 1, 5, 0F,-1F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, -1F, -.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 16
		bodyModel[198].setRotationPoint(0F, -39F, 0F);

		bodyModel[199].addShapeBox(-11.5F, -12F, -8.5F, 1, 1, 4, 0F,-1F, -.5F, -1.5F, 1F, -.5F, -0.5F, 1F, -.5F, -0.5F, -1F, -.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 17
		bodyModel[199].setRotationPoint(0F, -39F, 0F);

		bodyModel[200].addShapeBox(-7.5F, -11F, -8.5F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 18
		bodyModel[200].setRotationPoint(0F, -39F, 0F);

		bodyModel[201].addShapeBox(-8.5F, -11F, -9F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 19
		bodyModel[201].setRotationPoint(0F, -39F, 0F);

		bodyModel[202].addShapeBox(-9.5F, -11F, -9F, 1, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[202].setRotationPoint(0F, -39F, 0F);

		bodyModel[203].addShapeBox(-10.5F, -11F, -9F, 1, 9, 5, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 21
		bodyModel[203].setRotationPoint(0F, -39F, 0F);

		bodyModel[204].addShapeBox(-11.5F, -11F, -8.5F, 1, 9, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 22
		bodyModel[204].setRotationPoint(0F, -39F, 0F);

		bodyModel[205].addShapeBox(-7.5F, -2F, -8.5F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, -0.5F); // Box 23
		bodyModel[205].setRotationPoint(0F, -39F, 0F);

		bodyModel[206].addShapeBox(-8.5F, -2F, -9F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 24
		bodyModel[206].setRotationPoint(0F, -39F, 0F);

		bodyModel[207].addShapeBox(-9.5F, -2F, -9F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 25
		bodyModel[207].setRotationPoint(0F, -39F, 0F);

		bodyModel[208].addShapeBox(-10.5F, -2F, -9F, 1, 4, 5, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 26
		bodyModel[208].setRotationPoint(0F, -39F, 0F);

		bodyModel[209].addShapeBox(-11.5F, -2F, -8.5F, 1, 4, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 1F, 0F, -.5F, 1F, 0F, -.5F, -1F, 0F, -1.5F); // Box 27
		bodyModel[209].setRotationPoint(0F, -39F, 0F);

		bodyModel[210].addShapeBox(-7F, -14F, -11F, 3, 4, 6, 0F,-3F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[210].setRotationPoint(0F, -39F, 0F);

		bodyModel[211].addShapeBox(-3.5F, -13.5F, -14F, 7, 3, 7, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 13
		bodyModel[211].setRotationPoint(0F, -39F, 0F);

		bodyModel[212].addShapeBox(-2.5F, -13.5F, -18F, 5, 3, 4, 0F,1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[212].setRotationPoint(0F, -39F, 0F);

		bodyModel[213].addShapeBox(-3.5F, -12.5F, -22F, 6, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 15
		bodyModel[213].setRotationPoint(0F, -39F, 0F);

		bodyModel[214].addShapeBox(5F, -16F, -11F, 1, 4, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[214].setRotationPoint(0F, -39F, 0F);
		bodyModel[214].rotateAngleZ = 0.38397244F;

		bodyModel[215].addShapeBox(5F, -16F, -8F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 1F, -3F, 0F); // Box 17
		bodyModel[215].setRotationPoint(0F, -39F, 0F);
		bodyModel[215].rotateAngleZ = 0.38397244F;

		bodyModel[216].addShapeBox(5F, -16F, -9F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[216].setRotationPoint(0F, -39F, 0F);
		bodyModel[216].rotateAngleZ = 0.38397244F;

		bodyModel[217].addShapeBox(5F, -21F, -11F, 1, 5, 2, 0F,1F, 0.5F, -1F, -2F, 0.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[217].setRotationPoint(0F, -39F, 0F);
		bodyModel[217].rotateAngleZ = 0.38397244F;

		bodyModel[218].addShapeBox(4F, -27F, -9F, 1, 11, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[218].setRotationPoint(0F, -39F, 0F);
		bodyModel[218].rotateAngleZ = 0.38397244F;

		bodyModel[219].addShapeBox(5F, -21F, -8F, 1, 5, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, .5F, -1F, 1F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 21
		bodyModel[219].setRotationPoint(0F, -39F, 0F);
		bodyModel[219].rotateAngleZ = 0.38397244F;

		bodyModel[220].addShapeBox(1F, -15F, -11F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F); // Box 22
		bodyModel[220].setRotationPoint(0F, -39F, 0F);

		bodyModel[221].addShapeBox(4F, -15F, -11F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, -2F, -2F, 2F, -2F, 2F, 0F, 0F, 0F, 0F, -1.2F, 0F, 2F, 2F, -3F, 4F, 2F, 3F, 0F, -1.2F, 0F); // Box 23
		bodyModel[221].setRotationPoint(0F, -39F, 0F);

		bodyModel[222].addShapeBox(2.5F, -13F, -16F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1.5F, -0.5F, 0F, -1.5F, 0F, 0F); // Box 24
		bodyModel[222].setRotationPoint(0F, -39F, 0F);

		bodyModel[223].addShapeBox(2.5F, -13F, -18F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[223].setRotationPoint(0F, -39F, 0F);

		bodyModel[224].addShapeBox(-1.5F, -13F, -18F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[224].setRotationPoint(0F, -39F, 0F);

		bodyModel[225].addShapeBox(-2F, -14F, -15.5F, 4, 1, 4, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[225].setRotationPoint(0F, -39F, 0F);

		bodyModel[226].addShapeBox(2.5F, -13.5F, -18F, 6, 3, 4, 0F,0F, -1F, 0F, 0F, -2F, -12F, -2F, -2F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -2F, 0F, 6F, 0F, 0F, 0F); // Box 28
		bodyModel[226].setRotationPoint(0F, -39F, 0F);

		bodyModel[227].addShapeBox(-3F, 2F, -24F, 4, 4, 3, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 29
		bodyModel[227].setRotationPoint(0F, -39F, 0F);

		bodyModel[228].addShapeBox(-3F, 6F, -24F, 4, 1, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		bodyModel[228].setRotationPoint(0F, -39F, 0F);

		bodyModel[229].addShapeBox(0F, 5F, -24F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F); // Box 31
		bodyModel[229].setRotationPoint(0F, -39F, 0F);

		bodyModel[230].addShapeBox(1F, 3F, -24F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[230].setRotationPoint(0F, -39F, 0F);

		bodyModel[231].addShapeBox(0F, 2F, -24F, 2, 1, 3, 0F,-0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 33
		bodyModel[231].setRotationPoint(0F, -39F, 0F);

		bodyModel[232].addShapeBox(-3F, 1F, -24F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F); // Box 34
		bodyModel[232].setRotationPoint(0F, -39F, 0F);

		bodyModel[233].addShapeBox(-4F, 5F, -24F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.6F, 0F, 0F); // Box 35
		bodyModel[233].setRotationPoint(0F, -39F, 0F);

		bodyModel[234].addShapeBox(-4F, 3F, -24F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[234].setRotationPoint(0F, -39F, 0F);

		bodyModel[235].addShapeBox(-4F, 2F, -24F, 2, 1, 3, 0F,-.6F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[235].setRotationPoint(0F, -39F, 0F);

		bodyModel[236].addShapeBox(-0.5F, -2F, -23.5F, 2, 5, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[236].setRotationPoint(0F, -39F, 0F);

		bodyModel[237].addShapeBox(-3.5F, -2F, -23.5F, 2, 5, 2, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[237].setRotationPoint(0F, -39F, 0F);

		bodyModel[238].addShapeBox(-3.5F, -7F, -23.5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 40
		bodyModel[238].setRotationPoint(0F, -39F, 0F);

		bodyModel[239].addShapeBox(-0.5F, -7F, -23.5F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[239].setRotationPoint(0F, -39F, 0F);

		bodyModel[240].addShapeBox(0.5F, -2.5F, -24F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 42
		bodyModel[240].setRotationPoint(0F, -39F, 0F);

		bodyModel[241].addShapeBox(-2.5F, -2.5F, -24F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[241].setRotationPoint(0F, -39F, 0F);

		bodyModel[242].addShapeBox(-3.5F, -2.5F, -24F, 1, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 44
		bodyModel[242].setRotationPoint(0F, -39F, 0F);

		bodyModel[243].addShapeBox(-3F, -12F, -24F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[243].setRotationPoint(0F, -39F, 0F);

		bodyModel[244].addShapeBox(1F, -12F, -24F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F); // Box 46
		bodyModel[244].setRotationPoint(0F, -39F, 0F);

		bodyModel[245].addShapeBox(-5F, -12F, -24F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F); // Box 47
		bodyModel[245].setRotationPoint(0F, -39F, 0F);

		bodyModel[246].addShapeBox(-5F, -15F, -24F, 2, 3, 3, 0F,0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[246].setRotationPoint(0F, -39F, 0F);

		bodyModel[247].addShapeBox(1F, -15F, -24F, 2, 3, 3, 0F,0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[247].setRotationPoint(0F, -39F, 0F);

		bodyModel[248].addShapeBox(-3F, -15F, -24F, 4, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[248].setRotationPoint(0F, -39F, 0F);

		bodyModel[249].addShapeBox(-3F, -15.5F, -24F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F); // Box 51
		bodyModel[249].setRotationPoint(0F, -39F, 0F);

		bodyModel[250].addShapeBox(-3F, -18.5F, -24F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[250].setRotationPoint(0F, -39F, 0F);

		bodyModel[251].addShapeBox(-3F, -19.5F, -24F, 4, 1, 3, 0F,-.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[251].setRotationPoint(0F, -39F, 0F);

		bodyModel[252].addShapeBox(-5.5F, -19.5F, -25F, 9, 1, 5, 0F,-3F, -.2F, -1.5F, -3F, -.2F, -1.5F, -3F, -.2F, -1.5F, -3F, -.2F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F); // Box 54
		bodyModel[252].setRotationPoint(0F, -39F, 0F);

		bodyModel[253].addShapeBox(-3F, -14F, -24.5F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[253].setRotationPoint(0F, -39F, 0F);

		bodyModel[254].addShapeBox(-3F, -13F, -24.5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[254].setRotationPoint(0F, -39F, 0F);

		bodyModel[255].addShapeBox(-3F, -11F, -24.5F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 57
		bodyModel[255].setRotationPoint(0F, -39F, 0F);

		bodyModel[256].addShapeBox(1.5F, -7F, -22.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 58
		bodyModel[256].setRotationPoint(0F, -39F, 0F);
		bodyModel[256].rotateAngleZ = 0.08726646F;

		bodyModel[257].addShapeBox(1.5F, -6F, -22.5F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 59
		bodyModel[257].setRotationPoint(0F, -39F, 0F);
		bodyModel[257].rotateAngleZ = 0.08726646F;

		bodyModel[258].addShapeBox(1.5F, -1F, -22.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 60
		bodyModel[258].setRotationPoint(0F, -39F, 0F);
		bodyModel[258].rotateAngleZ = 0.08726646F;

		bodyModel[259].addShapeBox(1.5F, -1F, -23.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 61
		bodyModel[259].setRotationPoint(0F, -39F, 0F);
		bodyModel[259].rotateAngleZ = 0.08726646F;

		bodyModel[260].addShapeBox(1.5F, -6F, -23.5F, 2, 5, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[260].setRotationPoint(0F, -39F, 0F);
		bodyModel[260].rotateAngleZ = 0.08726646F;

		bodyModel[261].addShapeBox(1.5F, -7F, -23.5F, 2, 1, 1, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[261].setRotationPoint(0F, -39F, 0F);
		bodyModel[261].rotateAngleZ = 0.08726646F;

		bodyModel[262].addShapeBox(2F, 0F, -23F, 1, 5, 1, 0F,-.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 64
		bodyModel[262].setRotationPoint(0F, -39F, 0F);
		bodyModel[262].rotateAngleZ = 0.08726646F;

		bodyModel[263].addShapeBox(0F, 5F, -23F, 3, 1, 1, 0F,-.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -1F, 0F, -.1F, -1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 65
		bodyModel[263].setRotationPoint(0F, -39F, 0F);
		bodyModel[263].rotateAngleZ = 0.08726646F;

		bodyModel[264].addShapeBox(-1F, -9F, -25F, 1, 5, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[264].setRotationPoint(0F, -39F, 0F);

		bodyModel[265].addShapeBox(-2F, -9F, -25F, 1, 5, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 67
		bodyModel[265].setRotationPoint(0F, -39F, 0F);

		bodyModel[266].addShapeBox(-4F, -12F, -11F, 8, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[266].setRotationPoint(0F, -39F, 0F);

		bodyModel[267].addShapeBox(-4F, -6F, -9F, 8, 5, 3, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[267].setRotationPoint(0F, -39F, 0F);

		bodyModel[268].addShapeBox(6F, -5F, -12F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 71
		bodyModel[268].setRotationPoint(0F, -39F, 0F);

		bodyModel[269].addShapeBox(6F, -7F, -12F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 72
		bodyModel[269].setRotationPoint(0F, -39F, 0F);

		bodyModel[270].addShapeBox(6F, -8F, -12F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 73
		bodyModel[270].setRotationPoint(0F, -39F, 0F);

		bodyModel[271].addShapeBox(-7F, -8F, -12F, 1, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 74
		bodyModel[271].setRotationPoint(0F, -39F, 0F);

		bodyModel[272].addShapeBox(-7F, -7F, -12F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 75
		bodyModel[272].setRotationPoint(0F, -39F, 0F);

		bodyModel[273].addShapeBox(-7F, -5F, -12F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 76
		bodyModel[273].setRotationPoint(0F, -39F, 0F);

		bodyModel[274].addShapeBox(-6F, -5F, -12F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 77
		bodyModel[274].setRotationPoint(0F, -39F, 0F);

		bodyModel[275].addShapeBox(-6F, -7F, -12F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[275].setRotationPoint(0F, -39F, 0F);

		bodyModel[276].addShapeBox(-6F, -8F, -12F, 12, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[276].setRotationPoint(0F, -39F, 0F);

		bodyModel[277].addShapeBox(5F, -21F, -9F, 1, 5, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[277].setRotationPoint(0F, -39F, 0F);
		bodyModel[277].rotateAngleZ = 0.38397244F;
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 3, 95, textureX, textureY); // Box 23
		hipsModel[1] = new ModelRendererTurbo(this, 2, 118, textureX, textureY); // Box 26
		hipsModel[2] = new ModelRendererTurbo(this, 19, 118, textureX, textureY); // Box 27
		hipsModel[3] = new ModelRendererTurbo(this, 92, 95, textureX, textureY); // Box 28
		hipsModel[4] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 29
		hipsModel[5] = new ModelRendererTurbo(this, 74, 118, textureX, textureY); // Box 30
		hipsModel[6] = new ModelRendererTurbo(this, 110, 103, textureX, textureY); // Box 31
		hipsModel[7] = new ModelRendererTurbo(this, 55, 104, textureX, textureY); // Box 19
		hipsModel[8] = new ModelRendererTurbo(this, 73, 104, textureX, textureY); // Box 20
		hipsModel[9] = new ModelRendererTurbo(this, 19, 109, textureX, textureY); // Box 21
		hipsModel[10] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Box 22
		hipsModel[11] = new ModelRendererTurbo(this, 22, 95, textureX, textureY); // Box 23
		hipsModel[12] = new ModelRendererTurbo(this, 93, 116, textureX, textureY); // Box 24
		hipsModel[13] = new ModelRendererTurbo(this, 36, 95, textureX, textureY); // Box 25
		hipsModel[14] = new ModelRendererTurbo(this, 65, 95, textureX, textureY); // Box 26
		hipsModel[15] = new ModelRendererTurbo(this, 92, 108, textureX, textureY); // Box 28
		hipsModel[16] = new ModelRendererTurbo(this, 77, 140, textureX, textureY); // Box 30
		hipsModel[17] = new ModelRendererTurbo(this, 77, 133, textureX, textureY); // Box 31
		hipsModel[18] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 32
		hipsModel[19] = new ModelRendererTurbo(this, 97, 148, textureX, textureY); // Box 33
		hipsModel[20] = new ModelRendererTurbo(this, 97, 140, textureX, textureY); // Box 34
		hipsModel[21] = new ModelRendererTurbo(this, 97, 133, textureX, textureY); // Box 35
		hipsModel[22] = new ModelRendererTurbo(this, 110, 96, textureX, textureY); // Box 10
		hipsModel[23] = new ModelRendererTurbo(this, 110, 110, textureX, textureY); // Box 11
		hipsModel[24] = new ModelRendererTurbo(this, 58, 118, textureX, textureY); // Box 18
		hipsModel[25] = new ModelRendererTurbo(this, 19, 118, textureX, textureY); // Box 19
		hipsModel[26] = new ModelRendererTurbo(this, 2, 118, textureX, textureY); // Box 20
		hipsModel[27] = new ModelRendererTurbo(this, 3, 95, textureX, textureY); // Box 21
		hipsModel[28] = new ModelRendererTurbo(this, 92, 95, textureX, textureY); // Box 22
		hipsModel[29] = new ModelRendererTurbo(this, 93, 116, textureX, textureY); // Box 0
		hipsModel[30] = new ModelRendererTurbo(this, 55, 104, textureX, textureY); // Box 1
		hipsModel[31] = new ModelRendererTurbo(this, 73, 104, textureX, textureY); // Box 2
		hipsModel[32] = new ModelRendererTurbo(this, 92, 108, textureX, textureY); // Box 3
		hipsModel[33] = new ModelRendererTurbo(this, 22, 95, textureX, textureY); // Box 13
		hipsModel[34] = new ModelRendererTurbo(this, 97, 133, textureX, textureY); // Box 0
		hipsModel[35] = new ModelRendererTurbo(this, 97, 140, textureX, textureY); // Box 1
		hipsModel[36] = new ModelRendererTurbo(this, 97, 148, textureX, textureY); // Box 2
		hipsModel[37] = new ModelRendererTurbo(this, 5, 109, textureX, textureY); // Box 3
		hipsModel[38] = new ModelRendererTurbo(this, 19, 109, textureX, textureY); // Box 4
		hipsModel[39] = new ModelRendererTurbo(this, 93, 116, textureX, textureY); // Box 5
		hipsModel[40] = new ModelRendererTurbo(this, 36, 95, textureX, textureY); // Box 6
		hipsModel[41] = new ModelRendererTurbo(this, 77, 148, textureX, textureY); // Box 7
		hipsModel[42] = new ModelRendererTurbo(this, 77, 140, textureX, textureY); // Box 8
		hipsModel[43] = new ModelRendererTurbo(this, 77, 133, textureX, textureY); // Box 9
		hipsModel[44] = new ModelRendererTurbo(this, 65, 95, textureX, textureY); // Box 70

		hipsModel[0].addShapeBox(-7F, -1F, 0F, 3, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 23
		hipsModel[0].setRotationPoint(0F, -39F, 0F);

		hipsModel[1].addShapeBox(-6F, 7F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 26
		hipsModel[1].setRotationPoint(0F, -39F, 0F);

		hipsModel[2].addShapeBox(-4F, 7F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[2].setRotationPoint(0F, -39F, 0F);

		hipsModel[3].addShapeBox(7F, -1F, 0F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		hipsModel[3].setRotationPoint(0F, -39F, 0F);

		hipsModel[4].addShapeBox(9F, 3F, 0F, 5, 10, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[4].setRotationPoint(0F, -39F, 0F);

		hipsModel[5].addShapeBox(14F, 6F, -2F, 4, 7, 4, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[5].setRotationPoint(0F, -39F, 0F);

		hipsModel[6].addShapeBox(17.5F, 9.8F, -2F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[6].setRotationPoint(0F, -39F, 0F);

		hipsModel[7].addShapeBox(9F, 3F, 2F, 5, 10, 3, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[7].setRotationPoint(0F, -39F, 0F);

		hipsModel[8].addShapeBox(14F, 6F, 2F, 4, 7, 3, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -3F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -3F, 0F, -.5F, 0F); // Box 20
		hipsModel[8].setRotationPoint(0F, -39F, 0F);

		hipsModel[9].addShapeBox(-4F, 7F, 5F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, -3F, 0F); // Box 21
		hipsModel[9].setRotationPoint(0F, -39F, 0F);

		hipsModel[10].addShapeBox(-6F, 7F, 5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F); // Box 22
		hipsModel[10].setRotationPoint(0F, -39F, 0F);

		hipsModel[11].addShapeBox(-6F, -1F, 5F, 2, 8, 3, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23
		hipsModel[11].setRotationPoint(0F, -39F, 0F);

		hipsModel[12].addShapeBox(9F, 3F, 5F, 5, 10, 3, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -3F, 0F, -2F, 0F); // Box 24
		hipsModel[12].setRotationPoint(0F, -39F, 0F);

		hipsModel[13].addShapeBox(-4F, 3F, 7F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[13].setRotationPoint(0F, -39F, 0F);

		hipsModel[14].addShapeBox(-4F, -1F, 6F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		hipsModel[14].setRotationPoint(0F, -39F, 0F);

		hipsModel[15].addShapeBox(4F, -1F, 6F, 5, 4, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 28
		hipsModel[15].setRotationPoint(0F, -39F, 0F);

		hipsModel[16].addShapeBox(-5.5F, 4F, 9F, 7, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 30
		hipsModel[16].setRotationPoint(0F, -39F, 0F);

		hipsModel[17].addShapeBox(-5.5F, 2F, 9F, 7, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		hipsModel[17].setRotationPoint(0F, -39F, 0F);

		hipsModel[18].addShapeBox(-5.5F, 7F, 9F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 32
		hipsModel[18].setRotationPoint(0F, -39F, 0F);

		hipsModel[19].addShapeBox(-5.5F, 7F, 6F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 33
		hipsModel[19].setRotationPoint(0F, -39F, 0F);

		hipsModel[20].addShapeBox(-5.5F, 4F, 6F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		hipsModel[20].setRotationPoint(0F, -39F, 0F);

		hipsModel[21].addShapeBox(-5.5F, 2F, 6F, 7, 2, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[21].setRotationPoint(0F, -39F, 0F);

		hipsModel[22].addShapeBox(17.5F, 8.8F, -2F, 1, 1, 4, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[22].setRotationPoint(0F, -39F, 0F);

		hipsModel[23].addShapeBox(17.5F, 11.8F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 11
		hipsModel[23].setRotationPoint(0F, -39F, 0F);

		hipsModel[24].addShapeBox(9F, 3F, -2F, 5, 10, 2, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[24].setRotationPoint(0F, -39F, 0F);

		hipsModel[25].addShapeBox(-4F, 7F, -5F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[25].setRotationPoint(0F, -39F, 0F);

		hipsModel[26].addShapeBox(-6F, 7F, -5F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 20
		hipsModel[26].setRotationPoint(0F, -39F, 0F);

		hipsModel[27].addShapeBox(-7F, -1F, -5F, 3, 8, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 21
		hipsModel[27].setRotationPoint(0F, -39F, 0F);

		hipsModel[28].addShapeBox(7F, -1F, -6F, 2, 4, 6, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		hipsModel[28].setRotationPoint(0F, -39F, 0F);

		hipsModel[29].addShapeBox(9F, 3F, -8F, 5, 10, 3, 0F,0F, 0F, 0F, 0F, -3.5F, -3F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[29].setRotationPoint(0F, -39F, 0F);

		hipsModel[30].addShapeBox(9F, 3F, -5F, 5, 10, 3, 0F,0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[30].setRotationPoint(0F, -39F, 0F);

		hipsModel[31].addShapeBox(14F, 6F, -5F, 4, 7, 3, 0F,0F, -0.5F, 0F, 0F, -2.5F, -3F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[31].setRotationPoint(0F, -39F, 0F);

		hipsModel[32].addShapeBox(4F, -1F, -9F, 5, 4, 3, 0F,0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[32].setRotationPoint(0F, -39F, 0F);

		hipsModel[33].addShapeBox(-6F, -1F, -8F, 2, 8, 3, 0F,1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[33].setRotationPoint(0F, -39F, 0F);

		hipsModel[34].addShapeBox(-5.5F, 2F, -9F, 7, 2, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[34].setRotationPoint(0F, -39F, 0F);

		hipsModel[35].addShapeBox(-5.5F, 4F, -9F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[35].setRotationPoint(0F, -39F, 0F);

		hipsModel[36].addShapeBox(-5.5F, 7F, -9F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 2
		hipsModel[36].setRotationPoint(0F, -39F, 0F);

		hipsModel[37].addShapeBox(-6F, 7F, -8F, 2, 3, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 3
		hipsModel[37].setRotationPoint(0F, -39F, 0F);

		hipsModel[38].addShapeBox(-4F, 7F, -8F, 13, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[38].setRotationPoint(0F, -39F, 0F);

		hipsModel[39].addShapeBox(9F, 3F, -8F, 5, 10, 3, 0F,0F, 0F, 0F, 0F, -3.5F, -3F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[39].setRotationPoint(0F, -39F, 0F);

		hipsModel[40].addShapeBox(-4F, 3F, -8F, 13, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[40].setRotationPoint(0F, -39F, 0F);

		hipsModel[41].addShapeBox(-5.5F, 7F, -11F, 7, 2, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 7
		hipsModel[41].setRotationPoint(0F, -39F, 0F);

		hipsModel[42].addShapeBox(-5.5F, 4F, -11F, 7, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[42].setRotationPoint(0F, -39F, 0F);

		hipsModel[43].addShapeBox(-5.5F, 2F, -11F, 7, 2, 2, 0F,-2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[43].setRotationPoint(0F, -39F, 0F);

		hipsModel[44].addShapeBox(-4F, -1F, -9F, 8, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[44].setRotationPoint(0F, -39F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 0
		leftArmModel[1] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 1
		leftArmModel[2] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 2
		leftArmModel[3] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 3
		leftArmModel[4] = new ModelRendererTurbo(this, 146, 148, textureX, textureY); // Box 4
		leftArmModel[5] = new ModelRendererTurbo(this, 160, 141, textureX, textureY); // Box 5
		leftArmModel[6] = new ModelRendererTurbo(this, 160, 138, textureX, textureY); // Box 6
		leftArmModel[7] = new ModelRendererTurbo(this, 130, 146, textureX, textureY); // Box 7
		leftArmModel[8] = new ModelRendererTurbo(this, 156, 182, textureX, textureY); // Box 8
		leftArmModel[9] = new ModelRendererTurbo(this, 131, 177, textureX, textureY); // Box 9
		leftArmModel[10] = new ModelRendererTurbo(this, 174, 158, textureX, textureY); // Box 10
		leftArmModel[11] = new ModelRendererTurbo(this, 131, 171, textureX, textureY); // Box 11
		leftArmModel[12] = new ModelRendererTurbo(this, 131, 165, textureX, textureY); // Box 12
		leftArmModel[13] = new ModelRendererTurbo(this, 130, 142, textureX, textureY); // Box 13
		leftArmModel[14] = new ModelRendererTurbo(this, 130, 139, textureX, textureY); // Box 14
		leftArmModel[15] = new ModelRendererTurbo(this, 160, 131, textureX, textureY); // Box 15
		leftArmModel[16] = new ModelRendererTurbo(this, 174, 131, textureX, textureY); // Box 16
		leftArmModel[17] = new ModelRendererTurbo(this, 186, 162, textureX, textureY); // Box 17
		leftArmModel[18] = new ModelRendererTurbo(this, 187, 172, textureX, textureY); // Box 18
		leftArmModel[19] = new ModelRendererTurbo(this, 129, 158, textureX, textureY); // Box 21
		leftArmModel[20] = new ModelRendererTurbo(this, 156, 167, textureX, textureY); // Box 22
		leftArmModel[21] = new ModelRendererTurbo(this, 156, 174, textureX, textureY); // Box 27
		leftArmModel[22] = new ModelRendererTurbo(this, 154, 158, textureX, textureY); // Box 28
		leftArmModel[23] = new ModelRendererTurbo(this, 143, 141, textureX, textureY); // Box 29
		leftArmModel[24] = new ModelRendererTurbo(this, 144, 136, textureX, textureY); // Box 30
		leftArmModel[25] = new ModelRendererTurbo(this, 144, 132, textureX, textureY); // Box 31
		leftArmModel[26] = new ModelRendererTurbo(this, 182, 136, textureX, textureY); // Box 32
		leftArmModel[27] = new ModelRendererTurbo(this, 174, 131, textureX, textureY); // Box 34
		leftArmModel[28] = new ModelRendererTurbo(this, 177, 136, textureX, textureY); // Box 35
		leftArmModel[29] = new ModelRendererTurbo(this, 187, 167, textureX, textureY); // Box 0
		leftArmModel[30] = new ModelRendererTurbo(this, 187, 167, textureX, textureY); // Box 1
		leftArmModel[31] = new ModelRendererTurbo(this, 187, 172, textureX, textureY); // Box 2
		leftArmModel[32] = new ModelRendererTurbo(this, 183, 158, textureX, textureY); // Box 3
		leftArmModel[33] = new ModelRendererTurbo(this, 195, 162, textureX, textureY); // Box 4
		leftArmModel[34] = new ModelRendererTurbo(this, 188, 154, textureX, textureY); // Box 5
		leftArmModel[35] = new ModelRendererTurbo(this, 196, 166, textureX, textureY); // Box 6
		leftArmModel[36] = new ModelRendererTurbo(this, 195, 158, textureX, textureY); // Box 7
		leftArmModel[37] = new ModelRendererTurbo(this, 196, 154, textureX, textureY); // Box 8
		leftArmModel[38] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 9
		leftArmModel[39] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 10
		leftArmModel[40] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 11
		leftArmModel[41] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 12
		leftArmModel[42] = new ModelRendererTurbo(this, 144, 132, textureX, textureY); // Box 13
		leftArmModel[43] = new ModelRendererTurbo(this, 144, 136, textureX, textureY); // Box 14
		leftArmModel[44] = new ModelRendererTurbo(this, 195, 162, textureX, textureY); // Box 15
		leftArmModel[45] = new ModelRendererTurbo(this, 195, 158, textureX, textureY); // Box 16
		leftArmModel[46] = new ModelRendererTurbo(this, 196, 154, textureX, textureY); // Box 17
		leftArmModel[47] = new ModelRendererTurbo(this, 196, 166, textureX, textureY); // Box 18
		leftArmModel[48] = new ModelRendererTurbo(this, 130, 139, textureX, textureY); // Box 19
		leftArmModel[49] = new ModelRendererTurbo(this, 130, 142, textureX, textureY); // Box 20
		leftArmModel[50] = new ModelRendererTurbo(this, 204, 136, textureX, textureY); // Box 22

		leftArmModel[0].addShapeBox(-1.5F, 0F, 0F, 3, 2, 1, 0F,-1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 0
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -0.78539816F;

		leftArmModel[1].addShapeBox(-2F, 3F, 0F, 4, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 1
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -0.78539816F;

		leftArmModel[2].addShapeBox(-1.5F, 5F, 0F, 3, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 2
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -0.78539816F;

		leftArmModel[3].addShapeBox(-2F, 2F, 0F, 4, 1, 1, 0F,-0.5F, 0F, .3F, -0.5F, 0F, .3F, -0.5F, 0F, .3F, -0.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 3
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -0.78539816F;

		leftArmModel[4].addShapeBox(5F, 4F, -4F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -1.57079633F;

		leftArmModel[5].addShapeBox(11F, 3F, 0F, 5, 1, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 5
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -1.57079633F;

		leftArmModel[6].addShapeBox(11F, 2F, 0F, 5, 1, 1, 0F,-1F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 6
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -1.57079633F;

		leftArmModel[7].addShapeBox(2F, 2F, -4F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 7
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -1.57079633F;

		leftArmModel[8].addShapeBox(16F, 5F, -4F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 8
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -1.57079633F;

		leftArmModel[9].addShapeBox(16F, 3F, -4F, 8, 2, 5, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
		leftArmModel[9].rotateAngleZ = -1.57079633F;

		leftArmModel[10].addShapeBox(15F, -1F, -3F, 1, 3, 3, 0F,0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 10
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
		leftArmModel[10].rotateAngleZ = -1.57079633F;

		leftArmModel[11].addShapeBox(16F, 0F, -3F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 11
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
		leftArmModel[11].rotateAngleZ = -1.57079633F;

		leftArmModel[12].addShapeBox(16F, -1F, -3F, 8, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
		leftArmModel[12].rotateAngleZ = -1.57079633F;

		leftArmModel[13].addShapeBox(2F, 1F, 0F, 5, 1, 1, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -.5F, 0F, .1F, -.5F, 0F, .1F, 0F, 0F, .1F); // Box 13
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
		leftArmModel[13].rotateAngleZ = -1.57079633F;

		leftArmModel[14].addShapeBox(2F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, .1F, -2F, .5F, .1F, -2F, .5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 14
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
		leftArmModel[14].rotateAngleZ = -1.57079633F;

		leftArmModel[15].addShapeBox(11F, 0F, -2F, 4, 1, 1, 0F,0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Box 15
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
		leftArmModel[15].rotateAngleZ = -1.57079633F;

		leftArmModel[16].addShapeBox(4F, 0.5F, -2.5F, 7, 1, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 16
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
		leftArmModel[16].rotateAngleZ = -1.57079633F;

		leftArmModel[17].addShapeBox(24F, 2F, -2F, 2, 2, 1, 0F,0F, 0F, .5F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, .5F); // Box 17
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);
		leftArmModel[17].rotateAngleZ = -1.57079633F;

		leftArmModel[18].addShapeBox(25F, 2F, -1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);
		leftArmModel[18].rotateAngleZ = -1.57079633F;

		leftArmModel[19].addShapeBox(5F, 1.5F, -3.5F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);
		leftArmModel[19].rotateAngleZ = -1.57079633F;

		leftArmModel[20].addShapeBox(16F, 1.5F, -4F, 8, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);
		leftArmModel[20].rotateAngleZ = -1.57079633F;

		leftArmModel[21].addShapeBox(16F, 1.5F, -3F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);
		leftArmModel[21].rotateAngleZ = -1.57079633F;

		leftArmModel[22].addShapeBox(12F, 2F, -4F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
		leftArmModel[22].rotateAngleZ = -1.57079633F;

		leftArmModel[23].addShapeBox(5F, 2F, -3F, 4, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);
		leftArmModel[23].rotateAngleZ = -1.57079633F;

		leftArmModel[24].addShapeBox(5F, 2.5F, -0.5F, 3, 1, 1, 0F,0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F); // Box 30
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);
		leftArmModel[24].rotateAngleZ = -0.78539816F;

		leftArmModel[25].addShapeBox(3F, 2.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F); // Box 31
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);
		leftArmModel[25].rotateAngleZ = -0.78539816F;

		leftArmModel[26].addShapeBox(6.8F, 2.5F, -3.5F, 1, 1, 4, 0F,-.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F); // Box 32
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);
		leftArmModel[26].rotateAngleZ = -0.78539816F;

		leftArmModel[27].addShapeBox(4F, -0.5F, -2.5F, 7, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 34
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);
		leftArmModel[27].rotateAngleZ = -1.57079633F;

		leftArmModel[28].addShapeBox(6.8F, 2.5F, -2F, 1, 5, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 35
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);
		leftArmModel[28].rotateAngleZ = -0.78539816F;

		leftArmModel[29].addShapeBox(25F, 1F, -3F, 1, 1, 3, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);
		leftArmModel[29].rotateAngleZ = -1.57079633F;

		leftArmModel[30].addShapeBox(25F, 4F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 1
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);
		leftArmModel[30].rotateAngleZ = -1.57079633F;

		leftArmModel[31].addShapeBox(25F, 2F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);
		leftArmModel[31].rotateAngleZ = -1.57079633F;

		leftArmModel[32].addShapeBox(25F, 4F, -2F, 4, 1, 1, 0F,0F, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, .5F, -.2F, 0F, .5F, -.2F, 0F, 0F, -.2F); // Box 3
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);
		leftArmModel[32].rotateAngleZ = -1.57079633F;

		leftArmModel[33].addShapeBox(25F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 4
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);
		leftArmModel[33].rotateAngleZ = -1.57079633F;

		leftArmModel[34].addShapeBox(29F, 3F, -2F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F); // Box 5
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);
		leftArmModel[34].rotateAngleZ = -1.57079633F;

		leftArmModel[35].addShapeBox(25F, 2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F); // Box 6
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);
		leftArmModel[35].rotateAngleZ = -1.57079633F;

		leftArmModel[36].addShapeBox(27F, 1F, -0.5F, 2, 1, 1, 0F,0F, 1.2F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, 0F, 1.2F, .2F, 0F, -1F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, 0F, -1F, .2F); // Box 7
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);
		leftArmModel[36].rotateAngleZ = -1.57079633F;

		leftArmModel[37].addShapeBox(29F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 8
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);
		leftArmModel[37].rotateAngleZ = -1.57079633F;

		leftArmModel[38].addShapeBox(-1.5F, 0F, -4F, 3, 2, 1, 0F,-1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 9
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);
		leftArmModel[38].rotateAngleZ = -0.78539816F;

		leftArmModel[39].addShapeBox(-2F, 2F, -4F, 4, 1, 1, 0F,-0.5F, 0F, .3F, -0.5F, 0F, .3F, -0.5F, 0F, .3F, -0.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 10
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);
		leftArmModel[39].rotateAngleZ = -0.78539816F;

		leftArmModel[40].addShapeBox(-2F, 3F, -4F, 4, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 11
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);
		leftArmModel[40].rotateAngleZ = -0.78539816F;

		leftArmModel[41].addShapeBox(-1.5F, 5F, -4F, 3, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 12
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);
		leftArmModel[41].rotateAngleZ = -0.78539816F;

		leftArmModel[42].addShapeBox(3F, 2.5F, -3.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F); // Box 13
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);
		leftArmModel[42].rotateAngleZ = -0.78539816F;

		leftArmModel[43].addShapeBox(5F, 2.5F, -3.5F, 3, 1, 1, 0F,0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F); // Box 14
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);
		leftArmModel[43].rotateAngleZ = -0.78539816F;

		leftArmModel[44].addShapeBox(25F, 1F, -3.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 15
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);
		leftArmModel[44].rotateAngleZ = -1.57079633F;

		leftArmModel[45].addShapeBox(27F, 1F, -3.5F, 2, 1, 1, 0F,0F, 1.2F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, 0F, 1.2F, .2F, 0F, -1F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, 0F, -1F, .2F); // Box 16
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);
		leftArmModel[45].rotateAngleZ = -1.57079633F;

		leftArmModel[46].addShapeBox(29F, 1F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 17
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);
		leftArmModel[46].rotateAngleZ = -1.57079633F;

		leftArmModel[47].addShapeBox(25F, 2F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F); // Box 18
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);
		leftArmModel[47].rotateAngleZ = -1.57079633F;

		leftArmModel[48].addShapeBox(2F, 0F, -4F, 5, 1, 1, 0F,0F, 0F, .1F, -2F, .5F, .1F, -2F, .5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 19
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);
		leftArmModel[48].rotateAngleZ = -1.57079633F;

		leftArmModel[49].addShapeBox(2F, 1F, -4F, 5, 1, 1, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -.5F, 0F, .1F, -.5F, 0F, .1F, 0F, 0F, .1F); // Box 20
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);
		leftArmModel[49].rotateAngleZ = -1.57079633F;

		leftArmModel[50].addShapeBox(9F, 0F, 1F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);
		leftArmModel[50].rotateAngleZ = -1.57079633F;
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 130, 139, textureX, textureY); // Box 83
		rightArmModel[1] = new ModelRendererTurbo(this, 130, 142, textureX, textureY); // Box 84
		rightArmModel[2] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 85
		rightArmModel[3] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 86
		rightArmModel[4] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 87
		rightArmModel[5] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 88
		rightArmModel[6] = new ModelRendererTurbo(this, 143, 141, textureX, textureY); // Box 89
		rightArmModel[7] = new ModelRendererTurbo(this, 146, 148, textureX, textureY); // Box 90
		rightArmModel[8] = new ModelRendererTurbo(this, 130, 146, textureX, textureY); // Box 91
		rightArmModel[9] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 92
		rightArmModel[10] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 93
		rightArmModel[11] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 94
		rightArmModel[12] = new ModelRendererTurbo(this, 130, 132, textureX, textureY); // Box 95
		rightArmModel[13] = new ModelRendererTurbo(this, 130, 139, textureX, textureY); // Box 96
		rightArmModel[14] = new ModelRendererTurbo(this, 130, 142, textureX, textureY); // Box 97
		rightArmModel[15] = new ModelRendererTurbo(this, 129, 158, textureX, textureY); // Box 98
		rightArmModel[16] = new ModelRendererTurbo(this, 160, 141, textureX, textureY); // Box 99
		rightArmModel[17] = new ModelRendererTurbo(this, 160, 138, textureX, textureY); // Box 100
		rightArmModel[18] = new ModelRendererTurbo(this, 156, 182, textureX, textureY); // Box 101
		rightArmModel[19] = new ModelRendererTurbo(this, 131, 177, textureX, textureY); // Box 102
		rightArmModel[20] = new ModelRendererTurbo(this, 156, 174, textureX, textureY); // Box 103
		rightArmModel[21] = new ModelRendererTurbo(this, 154, 158, textureX, textureY); // Box 104
		rightArmModel[22] = new ModelRendererTurbo(this, 174, 131, textureX, textureY); // Box 105
		rightArmModel[23] = new ModelRendererTurbo(this, 174, 131, textureX, textureY); // Box 106
		rightArmModel[24] = new ModelRendererTurbo(this, 160, 131, textureX, textureY); // Box 107
		rightArmModel[25] = new ModelRendererTurbo(this, 177, 136, textureX, textureY); // Box 108
		rightArmModel[26] = new ModelRendererTurbo(this, 182, 136, textureX, textureY); // Box 109
		rightArmModel[27] = new ModelRendererTurbo(this, 144, 136, textureX, textureY); // Box 110
		rightArmModel[28] = new ModelRendererTurbo(this, 144, 132, textureX, textureY); // Box 111
		rightArmModel[29] = new ModelRendererTurbo(this, 144, 136, textureX, textureY); // Box 112
		rightArmModel[30] = new ModelRendererTurbo(this, 144, 132, textureX, textureY); // Box 113
		rightArmModel[31] = new ModelRendererTurbo(this, 174, 158, textureX, textureY); // Box 114
		rightArmModel[32] = new ModelRendererTurbo(this, 156, 167, textureX, textureY); // Box 115
		rightArmModel[33] = new ModelRendererTurbo(this, 131, 171, textureX, textureY); // Box 116
		rightArmModel[34] = new ModelRendererTurbo(this, 131, 165, textureX, textureY); // Box 117
		rightArmModel[35] = new ModelRendererTurbo(this, 186, 162, textureX, textureY); // Box 118
		rightArmModel[36] = new ModelRendererTurbo(this, 187, 167, textureX, textureY); // Box 119
		rightArmModel[37] = new ModelRendererTurbo(this, 187, 172, textureX, textureY); // Box 120
		rightArmModel[38] = new ModelRendererTurbo(this, 183, 158, textureX, textureY); // Box 121
		rightArmModel[39] = new ModelRendererTurbo(this, 188, 154, textureX, textureY); // Box 122
		rightArmModel[40] = new ModelRendererTurbo(this, 187, 172, textureX, textureY); // Box 123
		rightArmModel[41] = new ModelRendererTurbo(this, 187, 167, textureX, textureY); // Box 124
		rightArmModel[42] = new ModelRendererTurbo(this, 195, 162, textureX, textureY); // Box 125
		rightArmModel[43] = new ModelRendererTurbo(this, 195, 162, textureX, textureY); // Box 126
		rightArmModel[44] = new ModelRendererTurbo(this, 196, 166, textureX, textureY); // Box 127
		rightArmModel[45] = new ModelRendererTurbo(this, 196, 166, textureX, textureY); // Box 128
		rightArmModel[46] = new ModelRendererTurbo(this, 195, 158, textureX, textureY); // Box 129
		rightArmModel[47] = new ModelRendererTurbo(this, 196, 154, textureX, textureY); // Box 130
		rightArmModel[48] = new ModelRendererTurbo(this, 195, 158, textureX, textureY); // Box 131
		rightArmModel[49] = new ModelRendererTurbo(this, 196, 154, textureX, textureY); // Box 132
		rightArmModel[50] = new ModelRendererTurbo(this, 204, 136, textureX, textureY); // Box 133

		rightArmModel[0].addShapeBox(2F, 0F, 3F, 5, 1, 1, 0F,0F, 0F, .1F, -2F, .5F, .1F, -2F, .5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 83
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -1.57079633F;

		rightArmModel[1].addShapeBox(2F, 1F, 3F, 5, 1, 1, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -.5F, 0F, .1F, -.5F, 0F, .1F, 0F, 0F, .1F); // Box 84
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -1.57079633F;

		rightArmModel[2].addShapeBox(-1.5F, 0F, 3F, 3, 2, 1, 0F,-1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 85
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -0.78539816F;

		rightArmModel[3].addShapeBox(-2F, 2F, 3F, 4, 1, 1, 0F,-0.5F, 0F, .3F, -0.5F, 0F, .3F, -0.5F, 0F, .3F, -0.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 86
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -0.78539816F;

		rightArmModel[4].addShapeBox(-2F, 3F, 3F, 4, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 87
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = -0.78539816F;

		rightArmModel[5].addShapeBox(-1.5F, 5F, 3F, 3, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 88
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = -0.78539816F;

		rightArmModel[6].addShapeBox(5F, 2F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -1.57079633F;

		rightArmModel[7].addShapeBox(5F, 4F, -1F, 11, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -1.57079633F;

		rightArmModel[8].addShapeBox(2F, 2F, -1F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 91
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -1.57079633F;

		rightArmModel[9].addShapeBox(-1.5F, 5F, -1F, 3, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 92
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
		rightArmModel[9].rotateAngleZ = -0.78539816F;

		rightArmModel[10].addShapeBox(-2F, 3F, -1F, 4, 2, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 93
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
		rightArmModel[10].rotateAngleZ = -0.78539816F;

		rightArmModel[11].addShapeBox(-2F, 2F, -1F, 4, 1, 1, 0F,-0.5F, 0F, .3F, -0.5F, 0F, .3F, -0.5F, 0F, .3F, -0.5F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 94
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
		rightArmModel[11].rotateAngleZ = -0.78539816F;

		rightArmModel[12].addShapeBox(-1.5F, 0F, -1F, 3, 2, 1, 0F,-1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F, -.5F, 0F, .3F); // Box 95
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
		rightArmModel[12].rotateAngleZ = -0.78539816F;

		rightArmModel[13].addShapeBox(2F, 0F, -1F, 5, 1, 1, 0F,0F, 0F, .1F, -2F, .5F, .1F, -2F, .5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 96
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
		rightArmModel[13].rotateAngleZ = -1.57079633F;

		rightArmModel[14].addShapeBox(2F, 1F, -1F, 5, 1, 1, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -.5F, 0F, .1F, -.5F, 0F, .1F, 0F, 0F, .1F); // Box 97
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
		rightArmModel[14].rotateAngleZ = -1.57079633F;

		rightArmModel[15].addShapeBox(5F, 1.5F, -0.5F, 7, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 98
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);
		rightArmModel[15].rotateAngleZ = -1.57079633F;

		rightArmModel[16].addShapeBox(11F, 3F, 3F, 5, 1, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 99
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);
		rightArmModel[16].rotateAngleZ = -1.57079633F;

		rightArmModel[17].addShapeBox(11F, 2F, 3F, 5, 1, 1, 0F,-1F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F, -1F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 100
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);
		rightArmModel[17].rotateAngleZ = -1.57079633F;

		rightArmModel[18].addShapeBox(16F, 5F, -1F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 101
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);
		rightArmModel[18].rotateAngleZ = -1.57079633F;

		rightArmModel[19].addShapeBox(16F, 3F, -1F, 8, 2, 5, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);
		rightArmModel[19].rotateAngleZ = -1.57079633F;

		rightArmModel[20].addShapeBox(16F, 1.5F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);
		rightArmModel[20].rotateAngleZ = -1.57079633F;

		rightArmModel[21].addShapeBox(12F, 2F, -1F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);
		rightArmModel[21].rotateAngleZ = -1.57079633F;

		rightArmModel[22].addShapeBox(4F, 0.5F, 0.5F, 7, 1, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 105
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);
		rightArmModel[22].rotateAngleZ = -1.57079633F;

		rightArmModel[23].addShapeBox(4F, -0.5F, 0.5F, 7, 1, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 106
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);
		rightArmModel[23].rotateAngleZ = -1.57079633F;

		rightArmModel[24].addShapeBox(11F, 0F, 1F, 4, 1, 1, 0F,0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // Box 107
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);
		rightArmModel[24].rotateAngleZ = -1.57079633F;

		rightArmModel[25].addShapeBox(6.8F, 2.5F, 1F, 1, 5, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 108
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);
		rightArmModel[25].rotateAngleZ = -0.78539816F;

		rightArmModel[26].addShapeBox(6.8F, 2.5F, -0.5F, 1, 1, 4, 0F,-.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F, -.1F, -.1F, .2F); // Box 109
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);
		rightArmModel[26].rotateAngleZ = -0.78539816F;

		rightArmModel[27].addShapeBox(5F, 2.5F, 2.5F, 3, 1, 1, 0F,0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F); // Box 110
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);
		rightArmModel[27].rotateAngleZ = -0.78539816F;

		rightArmModel[28].addShapeBox(3F, 2.5F, 2.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F); // Box 111
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);
		rightArmModel[28].rotateAngleZ = -0.78539816F;

		rightArmModel[29].addShapeBox(5F, 2.5F, -0.5F, 3, 1, 1, 0F,0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F); // Box 112
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);
		rightArmModel[29].rotateAngleZ = -0.78539816F;

		rightArmModel[30].addShapeBox(3F, 2.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F); // Box 113
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);
		rightArmModel[30].rotateAngleZ = -0.78539816F;

		rightArmModel[31].addShapeBox(15F, -1F, 0F, 1, 3, 3, 0F,0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 114
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);
		rightArmModel[31].rotateAngleZ = -1.57079633F;

		rightArmModel[32].addShapeBox(16F, 1.5F, -1F, 8, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);
		rightArmModel[32].rotateAngleZ = -1.57079633F;

		rightArmModel[33].addShapeBox(16F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 116
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);
		rightArmModel[33].rotateAngleZ = -1.57079633F;

		rightArmModel[34].addShapeBox(16F, -1F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);
		rightArmModel[34].rotateAngleZ = -1.57079633F;

		rightArmModel[35].addShapeBox(24F, 2F, 1F, 2, 2, 1, 0F,0F, 0F, .5F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, .5F); // Box 118
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);
		rightArmModel[35].rotateAngleZ = -1.57079633F;

		rightArmModel[36].addShapeBox(25F, 4F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 119
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);
		rightArmModel[36].rotateAngleZ = -1.57079633F;

		rightArmModel[37].addShapeBox(25F, 2F, 2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);
		rightArmModel[37].rotateAngleZ = -1.57079633F;

		rightArmModel[38].addShapeBox(25F, 4F, 1F, 4, 1, 1, 0F,0F, 0F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, .5F, -.2F, 0F, .5F, -.2F, 0F, 0F, -.2F); // Box 121
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);
		rightArmModel[38].rotateAngleZ = -1.57079633F;

		rightArmModel[39].addShapeBox(29F, 3F, 1F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F); // Box 122
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);
		rightArmModel[39].rotateAngleZ = -1.57079633F;

		rightArmModel[40].addShapeBox(25F, 2F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);
		rightArmModel[40].rotateAngleZ = -1.57079633F;

		rightArmModel[41].addShapeBox(25F, 1F, 0F, 1, 1, 3, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);
		rightArmModel[41].rotateAngleZ = -1.57079633F;

		rightArmModel[42].addShapeBox(25F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 125
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);
		rightArmModel[42].rotateAngleZ = -1.57079633F;

		rightArmModel[43].addShapeBox(25F, 1F, 2.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 126
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);
		rightArmModel[43].rotateAngleZ = -1.57079633F;

		rightArmModel[44].addShapeBox(25F, 2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F); // Box 127
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);
		rightArmModel[44].rotateAngleZ = -1.57079633F;

		rightArmModel[45].addShapeBox(25F, 2F, 2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F); // Box 128
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);
		rightArmModel[45].rotateAngleZ = -1.57079633F;

		rightArmModel[46].addShapeBox(27F, 1F, 2.5F, 2, 1, 1, 0F,0F, 1.2F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, 0F, 1.2F, .2F, 0F, -1F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, 0F, -1F, .2F); // Box 129
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);
		rightArmModel[46].rotateAngleZ = -1.57079633F;

		rightArmModel[47].addShapeBox(29F, 1F, 2.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 130
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);
		rightArmModel[47].rotateAngleZ = -1.57079633F;

		rightArmModel[48].addShapeBox(27F, 1F, -0.5F, 2, 1, 1, 0F,0F, 1.2F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, 0F, 1.2F, .2F, 0F, -1F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, 0F, -1F, .2F); // Box 131
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);
		rightArmModel[48].rotateAngleZ = -1.57079633F;

		rightArmModel[49].addShapeBox(29F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 132
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);
		rightArmModel[49].rotateAngleZ = -1.57079633F;

		rightArmModel[50].addShapeBox(9F, 0F, -4F, 6, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		rightArmModel[50].setRotationPoint(0F, 0F, 0F);
		rightArmModel[50].rotateAngleZ = -1.57079633F;
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 24, 137, textureX, textureY); // Box 32
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 157, textureX, textureY); // Box 33
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 34
		leftLegModel[3] = new ModelRendererTurbo(this, 62, 148, textureX, textureY); // Box 35
		leftLegModel[4] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 36
		leftLegModel[5] = new ModelRendererTurbo(this, 3, 153, textureX, textureY); // Box 37
		leftLegModel[6] = new ModelRendererTurbo(this, 2, 144, textureX, textureY); // Box 38
		leftLegModel[7] = new ModelRendererTurbo(this, 62, 137, textureX, textureY); // Box 43
		leftLegModel[8] = new ModelRendererTurbo(this, 25, 147, textureX, textureY); // Box 44
		leftLegModel[9] = new ModelRendererTurbo(this, 2, 137, textureX, textureY); // Box 46
		leftLegModel[10] = new ModelRendererTurbo(this, 2, 144, textureX, textureY); // Box 47
		leftLegModel[11] = new ModelRendererTurbo(this, 3, 171, textureX, textureY); // Box 48
		leftLegModel[12] = new ModelRendererTurbo(this, 1, 183, textureX, textureY); // Box 49
		leftLegModel[13] = new ModelRendererTurbo(this, 57, 172, textureX, textureY); // Box 50
		leftLegModel[14] = new ModelRendererTurbo(this, 43, 172, textureX, textureY); // Box 51
		leftLegModel[15] = new ModelRendererTurbo(this, 51, 165, textureX, textureY); // Box 52
		leftLegModel[16] = new ModelRendererTurbo(this, 43, 165, textureX, textureY); // Box 53
		leftLegModel[17] = new ModelRendererTurbo(this, 1, 179, textureX, textureY); // Box 54
		leftLegModel[18] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 55
		leftLegModel[19] = new ModelRendererTurbo(this, 52, 184, textureX, textureY); // Box 56
		leftLegModel[20] = new ModelRendererTurbo(this, 34, 184, textureX, textureY); // Box 57
		leftLegModel[21] = new ModelRendererTurbo(this, 34, 180, textureX, textureY); // Box 63
		leftLegModel[22] = new ModelRendererTurbo(this, 2, 209, textureX, textureY); // Box 64
		leftLegModel[23] = new ModelRendererTurbo(this, 2, 198, textureX, textureY); // Box 65
		leftLegModel[24] = new ModelRendererTurbo(this, 2, 193, textureX, textureY); // Box 66
		leftLegModel[25] = new ModelRendererTurbo(this, 43, 189, textureX, textureY); // Box 67
		leftLegModel[26] = new ModelRendererTurbo(this, 67, 195, textureX, textureY); // Box 68
		leftLegModel[27] = new ModelRendererTurbo(this, 2, 217, textureX, textureY); // Box 69
		leftLegModel[28] = new ModelRendererTurbo(this, 2, 193, textureX, textureY); // Box 70
		leftLegModel[29] = new ModelRendererTurbo(this, 2, 198, textureX, textureY); // Box 71
		leftLegModel[30] = new ModelRendererTurbo(this, 59, 189, textureX, textureY); // Box 72
		leftLegModel[31] = new ModelRendererTurbo(this, 59, 209, textureX, textureY); // Box 73
		leftLegModel[32] = new ModelRendererTurbo(this, 67, 205, textureX, textureY); // Box 74
		leftLegModel[33] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 75
		leftLegModel[34] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 76
		leftLegModel[35] = new ModelRendererTurbo(this, 59, 209, textureX, textureY); // Box 77
		leftLegModel[36] = new ModelRendererTurbo(this, 16, 234, textureX, textureY); // Box 78
		leftLegModel[37] = new ModelRendererTurbo(this, 16, 227, textureX, textureY); // Box 79
		leftLegModel[38] = new ModelRendererTurbo(this, 16, 241, textureX, textureY); // Box 80
		leftLegModel[39] = new ModelRendererTurbo(this, 4, 234, textureX, textureY); // Box 81
		leftLegModel[40] = new ModelRendererTurbo(this, 29, 234, textureX, textureY); // Box 82
		leftLegModel[41] = new ModelRendererTurbo(this, 29, 227, textureX, textureY); // Box 83
		leftLegModel[42] = new ModelRendererTurbo(this, 29, 241, textureX, textureY); // Box 84
		leftLegModel[43] = new ModelRendererTurbo(this, 4, 227, textureX, textureY); // Box 86
		leftLegModel[44] = new ModelRendererTurbo(this, 46, 209, textureX, textureY); // Box 87
		leftLegModel[45] = new ModelRendererTurbo(this, 74, 182, textureX, textureY); // Box 88
		leftLegModel[46] = new ModelRendererTurbo(this, 100, 182, textureX, textureY); // Box 89
		leftLegModel[47] = new ModelRendererTurbo(this, 109, 200, textureX, textureY); // Box 90
		leftLegModel[48] = new ModelRendererTurbo(this, 110, 182, textureX, textureY); // Box 91
		leftLegModel[49] = new ModelRendererTurbo(this, 109, 176, textureX, textureY); // Box 92
		leftLegModel[50] = new ModelRendererTurbo(this, 42, 229, textureX, textureY); // Box 93
		leftLegModel[51] = new ModelRendererTurbo(this, 42, 237, textureX, textureY); // Box 94
		leftLegModel[52] = new ModelRendererTurbo(this, 42, 220, textureX, textureY); // Box 95
		leftLegModel[53] = new ModelRendererTurbo(this, 25, 210, textureX, textureY); // Box 96
		leftLegModel[54] = new ModelRendererTurbo(this, 92, 226, textureX, textureY); // Box 97
		leftLegModel[55] = new ModelRendererTurbo(this, 83, 234, textureX, textureY); // Box 98
		leftLegModel[56] = new ModelRendererTurbo(this, 87, 226, textureX, textureY); // Box 99
		leftLegModel[57] = new ModelRendererTurbo(this, 82, 226, textureX, textureY); // Box 100
		leftLegModel[58] = new ModelRendererTurbo(this, 83, 215, textureX, textureY); // Box 101
		leftLegModel[59] = new ModelRendererTurbo(this, 84, 222, textureX, textureY); // Box 103
		leftLegModel[60] = new ModelRendererTurbo(this, 95, 214, textureX, textureY); // Box 104
		leftLegModel[61] = new ModelRendererTurbo(this, 75, 221, textureX, textureY); // Box 105
		leftLegModel[62] = new ModelRendererTurbo(this, 75, 229, textureX, textureY); // Box 106
		leftLegModel[63] = new ModelRendererTurbo(this, 75, 217, textureX, textureY); // Box 107
		leftLegModel[64] = new ModelRendererTurbo(this, 25, 166, textureX, textureY); // Box 109
		leftLegModel[65] = new ModelRendererTurbo(this, 64, 233, textureX, textureY); // Box 110
		leftLegModel[66] = new ModelRendererTurbo(this, 64, 223, textureX, textureY); // Box 111
		leftLegModel[67] = new ModelRendererTurbo(this, 64, 233, textureX, textureY); // Box 112
		leftLegModel[68] = new ModelRendererTurbo(this, 64, 218, textureX, textureY); // Box 113
		leftLegModel[69] = new ModelRendererTurbo(this, 82, 182, textureX, textureY); // Box 12
		leftLegModel[70] = new ModelRendererTurbo(this, 92, 182, textureX, textureY); // Box 13
		leftLegModel[71] = new ModelRendererTurbo(this, 82, 176, textureX, textureY); // Box 14
		leftLegModel[72] = new ModelRendererTurbo(this, 82, 200, textureX, textureY); // Box 15
		leftLegModel[73] = new ModelRendererTurbo(this, 36, 166, textureX, textureY); // Box 18
		leftLegModel[74] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 52
		leftLegModel[75] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 45
		leftLegModel[76] = new ModelRendererTurbo(this, 83, 234, textureX, textureY); // Box 46
		leftLegModel[77] = new ModelRendererTurbo(this, 92, 226, textureX, textureY); // Box 47
		leftLegModel[78] = new ModelRendererTurbo(this, 87, 226, textureX, textureY); // Box 48
		leftLegModel[79] = new ModelRendererTurbo(this, 82, 226, textureX, textureY); // Box 49
		leftLegModel[80] = new ModelRendererTurbo(this, 64, 233, textureX, textureY); // Box 50
		leftLegModel[81] = new ModelRendererTurbo(this, 64, 223, textureX, textureY); // Box 51
		leftLegModel[82] = new ModelRendererTurbo(this, 64, 233, textureX, textureY); // Box 52
		leftLegModel[83] = new ModelRendererTurbo(this, 64, 218, textureX, textureY); // Box 53
		leftLegModel[84] = new ModelRendererTurbo(this, 75, 221, textureX, textureY); // Box 0
		leftLegModel[85] = new ModelRendererTurbo(this, 75, 229, textureX, textureY); // Box 1
		leftLegModel[86] = new ModelRendererTurbo(this, 84, 222, textureX, textureY); // Box 2
		leftLegModel[87] = new ModelRendererTurbo(this, 83, 215, textureX, textureY); // Box 3
		leftLegModel[88] = new ModelRendererTurbo(this, 95, 214, textureX, textureY); // Box 4

		leftLegModel[0].addShapeBox(-4F, -2.5F, -3.5F, 15, 5, 3, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 32
		leftLegModel[0].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[0].rotateAngleZ = -0.59341195F;

		leftLegModel[1].addShapeBox(-6F, -3.5F, -3F, 18, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		leftLegModel[1].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[1].rotateAngleZ = -0.59341195F;

		leftLegModel[2].addShapeBox(-6F, 3.5F, -3F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		leftLegModel[2].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[2].rotateAngleZ = -0.59341195F;

		leftLegModel[3].addShapeBox(-8F, -2.5F, -3F, 2, 6, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F); // Box 35
		leftLegModel[3].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[3].rotateAngleZ = -0.59341195F;

		leftLegModel[4].addShapeBox(9F, -2.5F, -3.5F, 3, 5, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		leftLegModel[4].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[4].rotateAngleZ = -0.59341195F;

		leftLegModel[5].addShapeBox(12F, -2.5F, -3.5F, 3, 5, 3, 0F,0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftLegModel[5].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[5].rotateAngleZ = -0.59341195F;

		leftLegModel[6].addShapeBox(-2F, -1F, -4F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		leftLegModel[6].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[6].rotateAngleZ = -0.59341195F;

		leftLegModel[7].addShapeBox(-6F, -2.5F, -3.5F, 2, 5, 3, 0F,0F, -1.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1.5F, -.2F, 0F, -1.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1.5F, -.2F); // Box 43
		leftLegModel[7].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[7].rotateAngleZ = -0.59341195F;

		leftLegModel[8].addShapeBox(-6F, -2.5F, -3F, 13, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		leftLegModel[8].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[8].rotateAngleZ = -0.59341195F;

		leftLegModel[9].addShapeBox(-2F, -2F, -4F, 4, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftLegModel[9].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[9].rotateAngleZ = -0.59341195F;

		leftLegModel[10].addShapeBox(-2F, 1F, -4F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		leftLegModel[10].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[10].rotateAngleZ = -0.59341195F;

		leftLegModel[11].addShapeBox(9F, 2.5F, -3.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 48
		leftLegModel[11].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[11].rotateAngleZ = -0.59341195F;

		leftLegModel[12].addShapeBox(-6F, 10F, -3F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftLegModel[12].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[12].rotateAngleZ = 0.13962634F;

		leftLegModel[13].addShapeBox(9F, 5F, -3F, 1, 3, 2, 0F,0F, -1F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -1F, .1F); // Box 50
		leftLegModel[13].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[13].rotateAngleZ = -0.45378561F;

		leftLegModel[14].addShapeBox(10F, 5F, -3F, 4, 3, 2, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 51
		leftLegModel[14].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[14].rotateAngleZ = -0.45378561F;

		leftLegModel[15].addShapeBox(14F, 5F, -3F, 6, 3, 2, 0F,0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, .1F); // Box 52
		leftLegModel[15].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[15].rotateAngleZ = -0.45378561F;

		leftLegModel[16].addShapeBox(20F, 5.5F, -3F, 1, 2, 2, 0F,0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, .1F); // Box 53
		leftLegModel[16].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[16].rotateAngleZ = -0.45378561F;

		leftLegModel[17].addShapeBox(-6F, 9F, -3F, 12, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		leftLegModel[17].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[17].rotateAngleZ = 0.13962634F;

		leftLegModel[18].addShapeBox(-6F, 12F, -3F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 55
		leftLegModel[18].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[18].rotateAngleZ = 0.13962634F;

		leftLegModel[19].addShapeBox(0F, 16F, -3F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 56
		leftLegModel[19].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[19].rotateAngleZ = 0.19198622F;

		leftLegModel[20].addShapeBox(0F, 15F, -3F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftLegModel[20].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[20].rotateAngleZ = 0.19198622F;

		leftLegModel[21].addShapeBox(-3F, 16F, -2.5F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		leftLegModel[21].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[21].rotateAngleZ = 0.19198622F;

		leftLegModel[22].addShapeBox(-8F, 11F, -4.5F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftLegModel[22].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[22].rotateAngleZ = 0.19198622F;

		leftLegModel[23].addShapeBox(-8F, 8F, -4.5F, 7, 1, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 65
		leftLegModel[23].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[23].rotateAngleZ = 0.19198622F;

		leftLegModel[24].addShapeBox(-7.5F, 7F, -4.5F, 6, 1, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -.5F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 66
		leftLegModel[24].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[24].rotateAngleZ = 0.19198622F;

		leftLegModel[25].addShapeBox(-5F, 12F, -3.5F, 4, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 67
		leftLegModel[25].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[25].rotateAngleZ = 0.19198622F;

		leftLegModel[26].addShapeBox(-7.5F, 18F, -2.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftLegModel[26].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[26].rotateAngleZ = 0.19198622F;

		leftLegModel[27].addShapeBox(-8F, 12F, -4.5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 69
		leftLegModel[27].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[27].rotateAngleZ = 0.19198622F;

		leftLegModel[28].addShapeBox(-7.5F, 7F, -1.5F, 6, 1, 2, 0F,-1.5F, 0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftLegModel[28].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[28].rotateAngleZ = 0.19198622F;

		leftLegModel[29].addShapeBox(-8F, 8F, -1.5F, 7, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftLegModel[29].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[29].rotateAngleZ = 0.19198622F;

		leftLegModel[30].addShapeBox(-6F, 12F, -3F, 1, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 72
		leftLegModel[30].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[30].rotateAngleZ = 0.19198622F;

		leftLegModel[31].addShapeBox(-8F, 12F, -3F, 2, 6, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		leftLegModel[31].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[31].rotateAngleZ = 0.19198622F;

		leftLegModel[32].addShapeBox(-8F, 25F, -3F, 2, 7, 2, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 74
		leftLegModel[32].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[32].rotateAngleZ = 0.19198622F;

		leftLegModel[33].addShapeBox(-8F, 9F, -1.5F, 7, 2, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		leftLegModel[33].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[33].rotateAngleZ = 0.19198622F;

		leftLegModel[34].addShapeBox(-8F, 9F, -4.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 76
		leftLegModel[34].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[34].rotateAngleZ = 0.19198622F;

		leftLegModel[35].addShapeBox(-8F, 12F, -2F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 77
		leftLegModel[35].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[35].rotateAngleZ = 0.19198622F;

		leftLegModel[36].addShapeBox(2F, 29F, -4F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftLegModel[36].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[37].addShapeBox(2F, 28F, -4F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftLegModel[37].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[38].addShapeBox(2F, 31F, -4F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 80
		leftLegModel[38].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[39].addShapeBox(4F, 29F, -4F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 81
		leftLegModel[39].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[40].addShapeBox(1F, 29F, -4F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 82
		leftLegModel[40].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[41].addShapeBox(1F, 28F, -4F, 1, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 83
		leftLegModel[41].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[42].addShapeBox(1F, 31F, -4F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 84
		leftLegModel[42].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[43].addShapeBox(4F, 28F, -4F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 86
		leftLegModel[43].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[44].addShapeBox(-5F, 26F, -3F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		leftLegModel[44].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[44].rotateAngleZ = 0.19198622F;

		leftLegModel[45].addShapeBox(15F, -2F, -3F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		leftLegModel[45].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[46].addShapeBox(15F, -2F, -1F, 1, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 89
		leftLegModel[46].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[47].addShapeBox(15F, 11F, -1F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, -1F, -.5F, 0F, -1F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 90
		leftLegModel[47].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[48].addShapeBox(13.5F, -3F, 2F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 1.5F, -2F, 0F); // Box 91
		leftLegModel[48].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[49].addShapeBox(15F, -3F, -1F, 1, 1, 3, 0F,.4F, 0F, -1F, -.4F, 0F, -1F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 92
		leftLegModel[49].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[50].addShapeBox(1F, 31.5F, -4F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 93
		leftLegModel[50].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[51].addShapeBox(-3F, 31.5F, -4F, 4, 2, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 94
		leftLegModel[51].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[52].addShapeBox(5F, 31.5F, -5F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, 0F); // Box 95
		leftLegModel[52].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[53].addShapeBox(5F, 28.5F, -5F, 4, 3, 6, 0F,0F, 0F, -1F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 96
		leftLegModel[53].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[54].addShapeBox(3F, 27.5F, 0.5F, 4, 5, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftLegModel[54].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[55].addShapeBox(3F, 32.5F, 0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 98
		leftLegModel[55].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[56].addShapeBox(7F, 27.5F, 0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		leftLegModel[56].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[57].addShapeBox(8F, 27.5F, 0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		leftLegModel[57].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[58].addShapeBox(-4F, 28.5F, -1F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		leftLegModel[58].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[59].addShapeBox(-5F, 32.5F, -1F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 103
		leftLegModel[59].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[60].addShapeBox(-5F, 28.5F, -1F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftLegModel[60].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[61].addShapeBox(-6F, 27.5F, -2F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 105
		leftLegModel[61].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[62].addShapeBox(-6F, 29.5F, -2F, 2, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, -.3F, 0F, .3F, -.3F, 0F, .3F, .3F, 0F, 0F, .3F, 0F, 0F, -.3F, 0F, .3F, -.3F, 0F, .3F); // Box 106
		leftLegModel[62].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[63].addShapeBox(-5.5F, 26.5F, -2.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		leftLegModel[63].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[64].addShapeBox(11F, 5F, -2.5F, 4, 4, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 109
		leftLegModel[64].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[65].addShapeBox(9F, 27.5F, -0.5F, 1, 6, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 110
		leftLegModel[65].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[66].addShapeBox(10F, 27.5F, -0.5F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		leftLegModel[66].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[67].addShapeBox(11F, 27.5F, -0.5F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 112
		leftLegModel[67].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[68].addShapeBox(9.5F, 26.5F, 0F, 2, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 113
		leftLegModel[68].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[69].addShapeBox(15F, -2F, -6F, 1, 13, 3, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftLegModel[69].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[70].addShapeBox(13.5F, -3F, -8F, 1, 12, 2, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		leftLegModel[70].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[71].addShapeBox(15F, -3F, -6F, 1, 1, 3, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.4F, 0F, -1F, 0.4F, 0F, -1F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftLegModel[71].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[72].addShapeBox(15F, 11F, -6F, 1, 4, 3, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 15
		leftLegModel[72].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[73].addShapeBox(9F, 11F, -2.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftLegModel[73].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[73].rotateAngleZ = 0.34906585F;

		leftLegModel[74].addShapeBox(-5F, 12F, -0.5F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 52
		leftLegModel[74].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[74].rotateAngleZ = 0.19198622F;

		leftLegModel[75].addShapeBox(-5F, 12F, -4.5F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 45
		leftLegModel[75].setRotationPoint(-2F, -33.5F, 15F);
		leftLegModel[75].rotateAngleZ = 0.19198622F;

		leftLegModel[76].addShapeBox(3F, 32.5F, -5.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		leftLegModel[76].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[77].addShapeBox(3F, 27.5F, -5.5F, 4, 5, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftLegModel[77].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[78].addShapeBox(7F, 27.5F, -5.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		leftLegModel[78].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[79].addShapeBox(8F, 27.5F, -5.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftLegModel[79].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[80].addShapeBox(9F, 27.5F, -6.5F, 1, 6, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 50
		leftLegModel[80].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[81].addShapeBox(10F, 27.5F, -6.5F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftLegModel[81].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[82].addShapeBox(11F, 27.5F, -6.5F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 52
		leftLegModel[82].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[83].addShapeBox(9.5F, 26.5F, -6F, 2, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 53
		leftLegModel[83].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[84].addShapeBox(-6F, 27.5F, -3F, 2, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftLegModel[84].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[85].addShapeBox(-6F, 29.5F, -3F, 2, 1, 1, 0F,-0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 1
		leftLegModel[85].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[86].addShapeBox(-5F, 32.5F, -4F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		leftLegModel[86].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[87].addShapeBox(-4F, 28.5F, -4F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftLegModel[87].setRotationPoint(-2F, -33.5F, 15F);

		leftLegModel[88].addShapeBox(-5F, 28.5F, -4F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftLegModel[88].setRotationPoint(-2F, -33.5F, 15F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 2, 144, textureX, textureY); // Box 80
		rightLegModel[1] = new ModelRendererTurbo(this, 2, 144, textureX, textureY); // Box 81
		rightLegModel[2] = new ModelRendererTurbo(this, 2, 137, textureX, textureY); // Box 82
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 157, textureX, textureY); // Box 134
		rightLegModel[4] = new ModelRendererTurbo(this, 62, 148, textureX, textureY); // Box 135
		rightLegModel[5] = new ModelRendererTurbo(this, 25, 147, textureX, textureY); // Box 136
		rightLegModel[6] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Box 137
		rightLegModel[7] = new ModelRendererTurbo(this, 62, 137, textureX, textureY); // Box 138
		rightLegModel[8] = new ModelRendererTurbo(this, 24, 137, textureX, textureY); // Box 139
		rightLegModel[9] = new ModelRendererTurbo(this, 3, 162, textureX, textureY); // Box 140
		rightLegModel[10] = new ModelRendererTurbo(this, 3, 153, textureX, textureY); // Box 141
		rightLegModel[11] = new ModelRendererTurbo(this, 3, 171, textureX, textureY); // Box 142
		rightLegModel[12] = new ModelRendererTurbo(this, 25, 166, textureX, textureY); // Box 143
		rightLegModel[13] = new ModelRendererTurbo(this, 36, 166, textureX, textureY); // Box 144
		rightLegModel[14] = new ModelRendererTurbo(this, 51, 165, textureX, textureY); // Box 145
		rightLegModel[15] = new ModelRendererTurbo(this, 43, 172, textureX, textureY); // Box 146
		rightLegModel[16] = new ModelRendererTurbo(this, 57, 172, textureX, textureY); // Box 147
		rightLegModel[17] = new ModelRendererTurbo(this, 1, 179, textureX, textureY); // Box 148
		rightLegModel[18] = new ModelRendererTurbo(this, 1, 183, textureX, textureY); // Box 149
		rightLegModel[19] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 150
		rightLegModel[20] = new ModelRendererTurbo(this, 2, 193, textureX, textureY); // Box 151
		rightLegModel[21] = new ModelRendererTurbo(this, 2, 193, textureX, textureY); // Box 152
		rightLegModel[22] = new ModelRendererTurbo(this, 2, 198, textureX, textureY); // Box 153
		rightLegModel[23] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 154
		rightLegModel[24] = new ModelRendererTurbo(this, 2, 198, textureX, textureY); // Box 155
		rightLegModel[25] = new ModelRendererTurbo(this, 2, 203, textureX, textureY); // Box 156
		rightLegModel[26] = new ModelRendererTurbo(this, 2, 209, textureX, textureY); // Box 157
		rightLegModel[27] = new ModelRendererTurbo(this, 59, 209, textureX, textureY); // Box 158
		rightLegModel[28] = new ModelRendererTurbo(this, 59, 209, textureX, textureY); // Box 159
		rightLegModel[29] = new ModelRendererTurbo(this, 67, 195, textureX, textureY); // Box 160
		rightLegModel[30] = new ModelRendererTurbo(this, 67, 205, textureX, textureY); // Box 161
		rightLegModel[31] = new ModelRendererTurbo(this, 2, 217, textureX, textureY); // Box 162
		rightLegModel[32] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 163
		rightLegModel[33] = new ModelRendererTurbo(this, 43, 189, textureX, textureY); // Box 164
		rightLegModel[34] = new ModelRendererTurbo(this, 32, 189, textureX, textureY); // Box 165
		rightLegModel[35] = new ModelRendererTurbo(this, 46, 209, textureX, textureY); // Box 166
		rightLegModel[36] = new ModelRendererTurbo(this, 34, 180, textureX, textureY); // Box 167
		rightLegModel[37] = new ModelRendererTurbo(this, 52, 184, textureX, textureY); // Box 168
		rightLegModel[38] = new ModelRendererTurbo(this, 34, 184, textureX, textureY); // Box 169
		rightLegModel[39] = new ModelRendererTurbo(this, 43, 165, textureX, textureY); // Box 170
		rightLegModel[40] = new ModelRendererTurbo(this, 74, 182, textureX, textureY); // Box 171
		rightLegModel[41] = new ModelRendererTurbo(this, 144, 198, textureX, textureY); // Box 172
		rightLegModel[42] = new ModelRendererTurbo(this, 154, 198, textureX, textureY); // Box 173
		rightLegModel[43] = new ModelRendererTurbo(this, 153, 216, textureX, textureY); // Box 174
		rightLegModel[44] = new ModelRendererTurbo(this, 126, 216, textureX, textureY); // Box 175
		rightLegModel[45] = new ModelRendererTurbo(this, 126, 198, textureX, textureY); // Box 176
		rightLegModel[46] = new ModelRendererTurbo(this, 136, 198, textureX, textureY); // Box 177
		rightLegModel[47] = new ModelRendererTurbo(this, 126, 192, textureX, textureY); // Box 178
		rightLegModel[48] = new ModelRendererTurbo(this, 153, 192, textureX, textureY); // Box 179
		rightLegModel[49] = new ModelRendererTurbo(this, 42, 237, textureX, textureY); // Box 180
		rightLegModel[50] = new ModelRendererTurbo(this, 42, 229, textureX, textureY); // Box 181
		rightLegModel[51] = new ModelRendererTurbo(this, 42, 220, textureX, textureY); // Box 182
		rightLegModel[52] = new ModelRendererTurbo(this, 84, 222, textureX, textureY); // Box 183
		rightLegModel[53] = new ModelRendererTurbo(this, 83, 215, textureX, textureY); // Box 184
		rightLegModel[54] = new ModelRendererTurbo(this, 95, 214, textureX, textureY); // Box 185
		rightLegModel[55] = new ModelRendererTurbo(this, 75, 221, textureX, textureY); // Box 186
		rightLegModel[56] = new ModelRendererTurbo(this, 75, 221, textureX, textureY); // Box 187
		rightLegModel[57] = new ModelRendererTurbo(this, 75, 229, textureX, textureY); // Box 188
		rightLegModel[58] = new ModelRendererTurbo(this, 75, 229, textureX, textureY); // Box 189
		rightLegModel[59] = new ModelRendererTurbo(this, 75, 217, textureX, textureY); // Box 190
		rightLegModel[60] = new ModelRendererTurbo(this, 84, 222, textureX, textureY); // Box 191
		rightLegModel[61] = new ModelRendererTurbo(this, 83, 215, textureX, textureY); // Box 192
		rightLegModel[62] = new ModelRendererTurbo(this, 95, 214, textureX, textureY); // Box 193
		rightLegModel[63] = new ModelRendererTurbo(this, 83, 234, textureX, textureY); // Box 194
		rightLegModel[64] = new ModelRendererTurbo(this, 92, 226, textureX, textureY); // Box 195
		rightLegModel[65] = new ModelRendererTurbo(this, 87, 226, textureX, textureY); // Box 196
		rightLegModel[66] = new ModelRendererTurbo(this, 82, 226, textureX, textureY); // Box 197
		rightLegModel[67] = new ModelRendererTurbo(this, 64, 233, textureX, textureY); // Box 198
		rightLegModel[68] = new ModelRendererTurbo(this, 64, 223, textureX, textureY); // Box 199
		rightLegModel[69] = new ModelRendererTurbo(this, 64, 233, textureX, textureY); // Box 200
		rightLegModel[70] = new ModelRendererTurbo(this, 64, 218, textureX, textureY); // Box 201
		rightLegModel[71] = new ModelRendererTurbo(this, 25, 210, textureX, textureY); // Box 202
		rightLegModel[72] = new ModelRendererTurbo(this, 4, 234, textureX, textureY); // Box 203
		rightLegModel[73] = new ModelRendererTurbo(this, 16, 241, textureX, textureY); // Box 204
		rightLegModel[74] = new ModelRendererTurbo(this, 16, 234, textureX, textureY); // Box 205
		rightLegModel[75] = new ModelRendererTurbo(this, 4, 227, textureX, textureY); // Box 206
		rightLegModel[76] = new ModelRendererTurbo(this, 16, 227, textureX, textureY); // Box 207
		rightLegModel[77] = new ModelRendererTurbo(this, 29, 227, textureX, textureY); // Box 208
		rightLegModel[78] = new ModelRendererTurbo(this, 29, 234, textureX, textureY); // Box 209
		rightLegModel[79] = new ModelRendererTurbo(this, 29, 241, textureX, textureY); // Box 210
		rightLegModel[80] = new ModelRendererTurbo(this, 83, 234, textureX, textureY); // Box 211
		rightLegModel[81] = new ModelRendererTurbo(this, 82, 226, textureX, textureY); // Box 212
		rightLegModel[82] = new ModelRendererTurbo(this, 87, 226, textureX, textureY); // Box 213
		rightLegModel[83] = new ModelRendererTurbo(this, 92, 226, textureX, textureY); // Box 214
		rightLegModel[84] = new ModelRendererTurbo(this, 64, 233, textureX, textureY); // Box 215
		rightLegModel[85] = new ModelRendererTurbo(this, 64, 223, textureX, textureY); // Box 216
		rightLegModel[86] = new ModelRendererTurbo(this, 64, 233, textureX, textureY); // Box 217
		rightLegModel[87] = new ModelRendererTurbo(this, 64, 218, textureX, textureY); // Box 218

		rightLegModel[0].addShapeBox(-2F, 1F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 80
		rightLegModel[0].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[0].rotateAngleZ = -0.59341195F;

		rightLegModel[1].addShapeBox(-2F, -1F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		rightLegModel[1].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[1].rotateAngleZ = -0.59341195F;

		rightLegModel[2].addShapeBox(-2F, -2F, 0F, 4, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		rightLegModel[2].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[2].rotateAngleZ = -0.59341195F;

		rightLegModel[3].addShapeBox(-6F, -3.5F, 1F, 18, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		rightLegModel[3].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[3].rotateAngleZ = -0.59341195F;

		rightLegModel[4].addShapeBox(-8F, -2.5F, 1F, 2, 6, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F); // Box 135
		rightLegModel[4].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[4].rotateAngleZ = -0.59341195F;

		rightLegModel[5].addShapeBox(-6F, -2.5F, 1F, 13, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		rightLegModel[5].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[5].rotateAngleZ = -0.59341195F;

		rightLegModel[6].addShapeBox(-6F, 3.5F, 1F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 137
		rightLegModel[6].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[6].rotateAngleZ = -0.59341195F;

		rightLegModel[7].addShapeBox(-6F, -2.5F, 0.5F, 2, 5, 3, 0F,0F, -1.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1.5F, -.2F, 0F, -1.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -1.5F, -.2F); // Box 138
		rightLegModel[7].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[7].rotateAngleZ = -0.59341195F;

		rightLegModel[8].addShapeBox(-4F, -2.5F, 0.5F, 15, 5, 3, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // Box 139
		rightLegModel[8].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[8].rotateAngleZ = -0.59341195F;

		rightLegModel[9].addShapeBox(9F, -2.5F, 0.5F, 3, 5, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		rightLegModel[9].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[9].rotateAngleZ = -0.59341195F;

		rightLegModel[10].addShapeBox(12F, -2.5F, 0.5F, 3, 5, 3, 0F,0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		rightLegModel[10].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[10].rotateAngleZ = -0.59341195F;

		rightLegModel[11].addShapeBox(9F, 2.5F, 0.5F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 142
		rightLegModel[11].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[11].rotateAngleZ = -0.59341195F;

		rightLegModel[12].addShapeBox(11F, 5F, 1.5F, 4, 4, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 143
		rightLegModel[12].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[13].addShapeBox(9F, 11F, 1.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		rightLegModel[13].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[13].rotateAngleZ = 0.34906585F;

		rightLegModel[14].addShapeBox(14F, 5F, 1F, 6, 3, 2, 0F,0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, .1F); // Box 145
		rightLegModel[14].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[14].rotateAngleZ = -0.45378561F;

		rightLegModel[15].addShapeBox(10F, 5F, 1F, 4, 3, 2, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 146
		rightLegModel[15].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[15].rotateAngleZ = -0.45378561F;

		rightLegModel[16].addShapeBox(9F, 5F, 1F, 1, 3, 2, 0F,0F, -1F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -1F, .1F, 0F, -1F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -1F, .1F); // Box 147
		rightLegModel[16].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[16].rotateAngleZ = -0.45378561F;

		rightLegModel[17].addShapeBox(-6F, 9F, 1F, 12, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		rightLegModel[17].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[17].rotateAngleZ = 0.13962634F;

		rightLegModel[18].addShapeBox(-6F, 10F, 1F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		rightLegModel[18].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[18].rotateAngleZ = 0.13962634F;

		rightLegModel[19].addShapeBox(-6F, 12F, 1F, 12, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 150
		rightLegModel[19].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[19].rotateAngleZ = 0.13962634F;

		rightLegModel[20].addShapeBox(-7.5F, 7F, -0.5F, 6, 1, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -.5F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 151
		rightLegModel[20].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[20].rotateAngleZ = 0.19198622F;

		rightLegModel[21].addShapeBox(-7.5F, 7F, 2.5F, 6, 1, 2, 0F,-1.5F, 0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		rightLegModel[21].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[21].rotateAngleZ = 0.19198622F;

		rightLegModel[22].addShapeBox(-8F, 8F, 2.5F, 7, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		rightLegModel[22].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[22].rotateAngleZ = 0.19198622F;

		rightLegModel[23].addShapeBox(-8F, 9F, 2.5F, 7, 2, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		rightLegModel[23].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[23].rotateAngleZ = 0.19198622F;

		rightLegModel[24].addShapeBox(-8F, 8F, -0.5F, 7, 1, 2, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 155
		rightLegModel[24].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[24].rotateAngleZ = 0.19198622F;

		rightLegModel[25].addShapeBox(-8F, 9F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 156
		rightLegModel[25].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[25].rotateAngleZ = 0.19198622F;

		rightLegModel[26].addShapeBox(-8F, 11F, -0.5F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		rightLegModel[26].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[26].rotateAngleZ = 0.19198622F;

		rightLegModel[27].addShapeBox(-8F, 12F, 1F, 2, 6, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		rightLegModel[27].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[27].rotateAngleZ = 0.19198622F;

		rightLegModel[28].addShapeBox(-8F, 12F, 2F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 159
		rightLegModel[28].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[28].rotateAngleZ = 0.19198622F;

		rightLegModel[29].addShapeBox(-7.5F, 18F, 1.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		rightLegModel[29].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[29].rotateAngleZ = 0.19198622F;

		rightLegModel[30].addShapeBox(-8F, 25F, 1F, 2, 7, 2, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 161
		rightLegModel[30].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[30].rotateAngleZ = 0.19198622F;

		rightLegModel[31].addShapeBox(-8F, 12F, -0.5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 162
		rightLegModel[31].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[31].rotateAngleZ = 0.19198622F;

		rightLegModel[32].addShapeBox(-5F, 12F, -0.5F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 163
		rightLegModel[32].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[32].rotateAngleZ = 0.19198622F;

		rightLegModel[33].addShapeBox(-5F, 12F, 0.5F, 4, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 164
		rightLegModel[33].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[33].rotateAngleZ = 0.19198622F;

		rightLegModel[34].addShapeBox(-5F, 12F, 3.5F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 165
		rightLegModel[34].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[34].rotateAngleZ = 0.19198622F;

		rightLegModel[35].addShapeBox(-5F, 26F, 1F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		rightLegModel[35].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[35].rotateAngleZ = 0.19198622F;

		rightLegModel[36].addShapeBox(-3F, 16F, 1.5F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		rightLegModel[36].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[36].rotateAngleZ = 0.19198622F;

		rightLegModel[37].addShapeBox(0F, 16F, 1F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 168
		rightLegModel[37].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[37].rotateAngleZ = 0.19198622F;

		rightLegModel[38].addShapeBox(0F, 15F, 1F, 6, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		rightLegModel[38].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[38].rotateAngleZ = 0.19198622F;

		rightLegModel[39].addShapeBox(20F, 5.5F, 1F, 1, 2, 2, 0F,0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, .1F); // Box 170
		rightLegModel[39].setRotationPoint(-2F, -33.5F, -15F);
		rightLegModel[39].rotateAngleZ = -0.45378561F;

		rightLegModel[40].addShapeBox(15F, -2F, 1F, 1, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		rightLegModel[40].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[41].addShapeBox(15F, -2F, 3F, 1, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 172
		rightLegModel[41].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[42].addShapeBox(13.5F, -3F, 6F, 1, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, 1.5F, -2F, 0F); // Box 173
		rightLegModel[42].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[43].addShapeBox(15F, 11F, 3F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, -1F, -.5F, 0F, -1F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 174
		rightLegModel[43].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[44].addShapeBox(15F, 11F, -2F, 1, 4, 3, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 175
		rightLegModel[44].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[45].addShapeBox(15F, -2F, -2F, 1, 13, 3, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		rightLegModel[45].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[46].addShapeBox(13.5F, -3F, -4F, 1, 12, 2, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		rightLegModel[46].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[47].addShapeBox(15F, -3F, -2F, 1, 1, 3, 0F,1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.4F, 0F, -1F, 0.4F, 0F, -1F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		rightLegModel[47].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[48].addShapeBox(15F, -3F, 3F, 1, 1, 3, 0F,.4F, 0F, -1F, -.4F, 0F, -1F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 179
		rightLegModel[48].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[49].addShapeBox(-3F, 31.5F, 0F, 4, 2, 4, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 180
		rightLegModel[49].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[50].addShapeBox(1F, 31.5F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 181
		rightLegModel[50].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[51].addShapeBox(5F, 31.5F, -1F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, 0F); // Box 182
		rightLegModel[51].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[52].addShapeBox(-5F, 32.5F, 3F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 183
		rightLegModel[52].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[53].addShapeBox(-4F, 28.5F, 3F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		rightLegModel[53].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[54].addShapeBox(-5F, 28.5F, 3F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		rightLegModel[54].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[55].addShapeBox(-6F, 27.5F, 2F, 2, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 186
		rightLegModel[55].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[56].addShapeBox(-6F, 27.5F, 1F, 2, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		rightLegModel[56].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[57].addShapeBox(-6F, 29.5F, 1F, 2, 1, 1, 0F,-0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 188
		rightLegModel[57].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[58].addShapeBox(-6F, 29.5F, 2F, 2, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, -.3F, 0F, .3F, -.3F, 0F, .3F, .3F, 0F, 0F, .3F, 0F, 0F, -.3F, 0F, .3F, -.3F, 0F, .3F); // Box 189
		rightLegModel[58].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[59].addShapeBox(-5.5F, 26.5F, 1.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		rightLegModel[59].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[60].addShapeBox(-5F, 32.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 191
		rightLegModel[60].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[61].addShapeBox(-4F, 28.5F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		rightLegModel[61].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[62].addShapeBox(-5F, 28.5F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		rightLegModel[62].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[63].addShapeBox(3F, 32.5F, 4.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		rightLegModel[63].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[64].addShapeBox(3F, 27.5F, 4.5F, 4, 5, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		rightLegModel[64].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[65].addShapeBox(7F, 27.5F, 4.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		rightLegModel[65].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[66].addShapeBox(8F, 27.5F, 4.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		rightLegModel[66].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[67].addShapeBox(9F, 27.5F, 3.5F, 1, 6, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 198
		rightLegModel[67].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[68].addShapeBox(10F, 27.5F, 3.5F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		rightLegModel[68].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[69].addShapeBox(11F, 27.5F, 3.5F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 200
		rightLegModel[69].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[70].addShapeBox(9.5F, 26.5F, 4F, 2, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 201
		rightLegModel[70].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[71].addShapeBox(5F, 28.5F, -1F, 4, 3, 6, 0F,0F, 0F, -1F, 0F, -3F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 202
		rightLegModel[71].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[72].addShapeBox(4F, 29F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 203
		rightLegModel[72].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[73].addShapeBox(2F, 31F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 204
		rightLegModel[73].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[74].addShapeBox(2F, 29F, 0F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		rightLegModel[74].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[75].addShapeBox(4F, 28F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 206
		rightLegModel[75].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[76].addShapeBox(2F, 28F, 0F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		rightLegModel[76].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[77].addShapeBox(1F, 28F, 0F, 1, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 208
		rightLegModel[77].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[78].addShapeBox(1F, 29F, 0F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 209
		rightLegModel[78].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[79].addShapeBox(1F, 31F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 210
		rightLegModel[79].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[80].addShapeBox(3F, 32.5F, -1.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 211
		rightLegModel[80].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[81].addShapeBox(8F, 27.5F, -1.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		rightLegModel[81].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[82].addShapeBox(7F, 27.5F, -1.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		rightLegModel[82].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[83].addShapeBox(3F, 27.5F, -1.5F, 4, 5, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		rightLegModel[83].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[84].addShapeBox(9F, 27.5F, -2.5F, 1, 6, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 215
		rightLegModel[84].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[85].addShapeBox(10F, 27.5F, -2.5F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		rightLegModel[85].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[86].addShapeBox(11F, 27.5F, -2.5F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 217
		rightLegModel[86].setRotationPoint(-2F, -33.5F, -15F);

		rightLegModel[87].addShapeBox(9.5F, 26.5F, -2F, 2, 1, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 218
		rightLegModel[87].setRotationPoint(-2F, -33.5F, -15F);
	}
}