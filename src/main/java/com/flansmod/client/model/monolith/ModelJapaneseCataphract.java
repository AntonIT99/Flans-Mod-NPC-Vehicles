//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: JapaneseCataphract
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJapaneseCataphract extends ModelMecha //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelJapaneseCataphract() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		hipsModel = new ModelRendererTurbo[418];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[60];
		rightLegModel = new ModelRendererTurbo[52];

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
		bodyModel[0] = new ModelRendererTurbo(this, 106, 224, textureX, textureY); // Box 134

		bodyModel[0].addBox(-1F, 0F, -1F, 2, 1, 2, 0F); // Box 134
		bodyModel[0].setRotationPoint(0F, -30F, 0F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 4, 127, textureX, textureY); // Box 0
		hipsModel[1] = new ModelRendererTurbo(this, 4, 108, textureX, textureY); // Box 0
		hipsModel[2] = new ModelRendererTurbo(this, 4, 88, textureX, textureY); // Box 1
		hipsModel[3] = new ModelRendererTurbo(this, 4, 68, textureX, textureY); // Box 2
		hipsModel[4] = new ModelRendererTurbo(this, 4, 53, textureX, textureY); // Box 3
		hipsModel[5] = new ModelRendererTurbo(this, 4, 162, textureX, textureY); // Box 4
		hipsModel[6] = new ModelRendererTurbo(this, 4, 179, textureX, textureY); // Box 5
		hipsModel[7] = new ModelRendererTurbo(this, 4, 198, textureX, textureY); // Box 6
		hipsModel[8] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 7
		hipsModel[9] = new ModelRendererTurbo(this, 4, 145, textureX, textureY); // Box 8
		hipsModel[10] = new ModelRendererTurbo(this, 58, 69, textureX, textureY); // Box 47
		hipsModel[11] = new ModelRendererTurbo(this, 58, 85, textureX, textureY); // Box 48
		hipsModel[12] = new ModelRendererTurbo(this, 58, 99, textureX, textureY); // Box 49
		hipsModel[13] = new ModelRendererTurbo(this, 58, 55, textureX, textureY); // Box 50
		hipsModel[14] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 9
		hipsModel[15] = new ModelRendererTurbo(this, 59, 167, textureX, textureY); // Box 8
		hipsModel[16] = new ModelRendererTurbo(this, 66, 162, textureX, textureY); // Box 9
		hipsModel[17] = new ModelRendererTurbo(this, 66, 157, textureX, textureY); // Box 10
		hipsModel[18] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 11
		hipsModel[19] = new ModelRendererTurbo(this, 58, 142, textureX, textureY); // Box 12
		hipsModel[20] = new ModelRendererTurbo(this, 58, 134, textureX, textureY); // Box 13
		hipsModel[21] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 14
		hipsModel[22] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 0
		hipsModel[23] = new ModelRendererTurbo(this, 72, 157, textureX, textureY); // Box 1
		hipsModel[24] = new ModelRendererTurbo(this, 72, 162, textureX, textureY); // Box 2
		hipsModel[25] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 3
		hipsModel[26] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 4
		hipsModel[27] = new ModelRendererTurbo(this, 66, 167, textureX, textureY); // Box 6
		hipsModel[28] = new ModelRendererTurbo(this, 58, 113, textureX, textureY); // Box 8
		hipsModel[29] = new ModelRendererTurbo(this, 79, 72, textureX, textureY); // Box 12
		hipsModel[30] = new ModelRendererTurbo(this, 79, 87, textureX, textureY); // Box 13
		hipsModel[31] = new ModelRendererTurbo(this, 79, 99, textureX, textureY); // Box 14
		hipsModel[32] = new ModelRendererTurbo(this, 68, 55, textureX, textureY); // Box 15
		hipsModel[33] = new ModelRendererTurbo(this, 68, 69, textureX, textureY); // Box 16
		hipsModel[34] = new ModelRendererTurbo(this, 68, 85, textureX, textureY); // Box 17
		hipsModel[35] = new ModelRendererTurbo(this, 68, 99, textureX, textureY); // Box 18
		hipsModel[36] = new ModelRendererTurbo(this, 68, 113, textureX, textureY); // Box 19
		hipsModel[37] = new ModelRendererTurbo(this, 78, 113, textureX, textureY); // Box 20
		hipsModel[38] = new ModelRendererTurbo(this, 78, 123, textureX, textureY); // Box 21
		hipsModel[39] = new ModelRendererTurbo(this, 68, 123, textureX, textureY); // Box 22
		hipsModel[40] = new ModelRendererTurbo(this, 68, 134, textureX, textureY); // Box 23
		hipsModel[41] = new ModelRendererTurbo(this, 78, 134, textureX, textureY); // Box 24
		hipsModel[42] = new ModelRendererTurbo(this, 78, 142, textureX, textureY); // Box 25
		hipsModel[43] = new ModelRendererTurbo(this, 68, 142, textureX, textureY); // Box 26
		hipsModel[44] = new ModelRendererTurbo(this, 68, 147, textureX, textureY); // Box 27
		hipsModel[45] = new ModelRendererTurbo(this, 78, 147, textureX, textureY); // Box 28
		hipsModel[46] = new ModelRendererTurbo(this, 36, 127, textureX, textureY); // Box 29
		hipsModel[47] = new ModelRendererTurbo(this, 20, 127, textureX, textureY); // Box 30
		hipsModel[48] = new ModelRendererTurbo(this, 36, 145, textureX, textureY); // Box 31
		hipsModel[49] = new ModelRendererTurbo(this, 20, 145, textureX, textureY); // Box 32
		hipsModel[50] = new ModelRendererTurbo(this, 36, 179, textureX, textureY); // Box 33
		hipsModel[51] = new ModelRendererTurbo(this, 36, 162, textureX, textureY); // Box 34
		hipsModel[52] = new ModelRendererTurbo(this, 36, 198, textureX, textureY); // Box 35
		hipsModel[53] = new ModelRendererTurbo(this, 36, 215, textureX, textureY); // Box 36
		hipsModel[54] = new ModelRendererTurbo(this, 20, 215, textureX, textureY); // Box 37
		hipsModel[55] = new ModelRendererTurbo(this, 20, 198, textureX, textureY); // Box 38
		hipsModel[56] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 39
		hipsModel[57] = new ModelRendererTurbo(this, 20, 162, textureX, textureY); // Box 40
		hipsModel[58] = new ModelRendererTurbo(this, 20, 108, textureX, textureY); // Box 41
		hipsModel[59] = new ModelRendererTurbo(this, 20, 88, textureX, textureY); // Box 42
		hipsModel[60] = new ModelRendererTurbo(this, 36, 108, textureX, textureY); // Box 43
		hipsModel[61] = new ModelRendererTurbo(this, 36, 88, textureX, textureY); // Box 44
		hipsModel[62] = new ModelRendererTurbo(this, 20, 68, textureX, textureY); // Box 45
		hipsModel[63] = new ModelRendererTurbo(this, 20, 53, textureX, textureY); // Box 46
		hipsModel[64] = new ModelRendererTurbo(this, 36, 53, textureX, textureY); // Box 47
		hipsModel[65] = new ModelRendererTurbo(this, 36, 68, textureX, textureY); // Box 48
		hipsModel[66] = new ModelRendererTurbo(this, 59, 157, textureX, textureY); // Box 0
		hipsModel[67] = new ModelRendererTurbo(this, 78, 157, textureX, textureY); // Box 3
		hipsModel[68] = new ModelRendererTurbo(this, 59, 162, textureX, textureY); // Box 0
		hipsModel[69] = new ModelRendererTurbo(this, 78, 162, textureX, textureY); // Box 1
		hipsModel[70] = new ModelRendererTurbo(this, 77, 167, textureX, textureY); // Box 2
		hipsModel[71] = new ModelRendererTurbo(this, 72, 167, textureX, textureY); // Box 3
		hipsModel[72] = new ModelRendererTurbo(this, 55, 175, textureX, textureY); // Box 7
		hipsModel[73] = new ModelRendererTurbo(this, 55, 181, textureX, textureY); // Box 9
		hipsModel[74] = new ModelRendererTurbo(this, 55, 187, textureX, textureY); // Box 10
		hipsModel[75] = new ModelRendererTurbo(this, 55, 197, textureX, textureY); // Box 13
		hipsModel[76] = new ModelRendererTurbo(this, 55, 207, textureX, textureY); // Box 14
		hipsModel[77] = new ModelRendererTurbo(this, 55, 227, textureX, textureY); // Box 0
		hipsModel[78] = new ModelRendererTurbo(this, 55, 218, textureX, textureY); // Box 8
		hipsModel[79] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 9
		hipsModel[80] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 10
		hipsModel[81] = new ModelRendererTurbo(this, 4, 198, textureX, textureY); // Box 11
		hipsModel[82] = new ModelRendererTurbo(this, 4, 179, textureX, textureY); // Box 12
		hipsModel[83] = new ModelRendererTurbo(this, 4, 162, textureX, textureY); // Box 13
		hipsModel[84] = new ModelRendererTurbo(this, 4, 145, textureX, textureY); // Box 14
		hipsModel[85] = new ModelRendererTurbo(this, 4, 127, textureX, textureY); // Box 15
		hipsModel[86] = new ModelRendererTurbo(this, 4, 108, textureX, textureY); // Box 16
		hipsModel[87] = new ModelRendererTurbo(this, 4, 88, textureX, textureY); // Box 17
		hipsModel[88] = new ModelRendererTurbo(this, 4, 68, textureX, textureY); // Box 18
		hipsModel[89] = new ModelRendererTurbo(this, 4, 53, textureX, textureY); // Box 19
		hipsModel[90] = new ModelRendererTurbo(this, 58, 69, textureX, textureY); // Box 20
		hipsModel[91] = new ModelRendererTurbo(this, 58, 85, textureX, textureY); // Box 21
		hipsModel[92] = new ModelRendererTurbo(this, 58, 99, textureX, textureY); // Box 22
		hipsModel[93] = new ModelRendererTurbo(this, 58, 55, textureX, textureY); // Box 24
		hipsModel[94] = new ModelRendererTurbo(this, 68, 99, textureX, textureY); // Box 25
		hipsModel[95] = new ModelRendererTurbo(this, 79, 99, textureX, textureY); // Box 26
		hipsModel[96] = new ModelRendererTurbo(this, 68, 85, textureX, textureY); // Box 27
		hipsModel[97] = new ModelRendererTurbo(this, 79, 87, textureX, textureY); // Box 28
		hipsModel[98] = new ModelRendererTurbo(this, 68, 69, textureX, textureY); // Box 29
		hipsModel[99] = new ModelRendererTurbo(this, 79, 72, textureX, textureY); // Box 30
		hipsModel[100] = new ModelRendererTurbo(this, 68, 55, textureX, textureY); // Box 31
		hipsModel[101] = new ModelRendererTurbo(this, 58, 113, textureX, textureY); // Box 32
		hipsModel[102] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 33
		hipsModel[103] = new ModelRendererTurbo(this, 58, 134, textureX, textureY); // Box 34
		hipsModel[104] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 35
		hipsModel[105] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 36
		hipsModel[106] = new ModelRendererTurbo(this, 58, 142, textureX, textureY); // Box 37
		hipsModel[107] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 38
		hipsModel[108] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 39
		hipsModel[109] = new ModelRendererTurbo(this, 78, 113, textureX, textureY); // Box 42
		hipsModel[110] = new ModelRendererTurbo(this, 68, 113, textureX, textureY); // Box 43
		hipsModel[111] = new ModelRendererTurbo(this, 78, 123, textureX, textureY); // Box 44
		hipsModel[112] = new ModelRendererTurbo(this, 68, 123, textureX, textureY); // Box 45
		hipsModel[113] = new ModelRendererTurbo(this, 68, 134, textureX, textureY); // Box 46
		hipsModel[114] = new ModelRendererTurbo(this, 78, 134, textureX, textureY); // Box 47
		hipsModel[115] = new ModelRendererTurbo(this, 78, 142, textureX, textureY); // Box 48
		hipsModel[116] = new ModelRendererTurbo(this, 68, 142, textureX, textureY); // Box 49
		hipsModel[117] = new ModelRendererTurbo(this, 68, 147, textureX, textureY); // Box 50
		hipsModel[118] = new ModelRendererTurbo(this, 78, 147, textureX, textureY); // Box 51
		hipsModel[119] = new ModelRendererTurbo(this, 59, 157, textureX, textureY); // Box 52
		hipsModel[120] = new ModelRendererTurbo(this, 78, 157, textureX, textureY); // Box 53
		hipsModel[121] = new ModelRendererTurbo(this, 78, 162, textureX, textureY); // Box 54
		hipsModel[122] = new ModelRendererTurbo(this, 59, 162, textureX, textureY); // Box 55
		hipsModel[123] = new ModelRendererTurbo(this, 77, 167, textureX, textureY); // Box 56
		hipsModel[124] = new ModelRendererTurbo(this, 72, 167, textureX, textureY); // Box 57
		hipsModel[125] = new ModelRendererTurbo(this, 36, 53, textureX, textureY); // Box 58
		hipsModel[126] = new ModelRendererTurbo(this, 36, 68, textureX, textureY); // Box 59
		hipsModel[127] = new ModelRendererTurbo(this, 36, 88, textureX, textureY); // Box 60
		hipsModel[128] = new ModelRendererTurbo(this, 36, 108, textureX, textureY); // Box 61
		hipsModel[129] = new ModelRendererTurbo(this, 36, 127, textureX, textureY); // Box 62
		hipsModel[130] = new ModelRendererTurbo(this, 36, 145, textureX, textureY); // Box 63
		hipsModel[131] = new ModelRendererTurbo(this, 36, 162, textureX, textureY); // Box 64
		hipsModel[132] = new ModelRendererTurbo(this, 36, 179, textureX, textureY); // Box 65
		hipsModel[133] = new ModelRendererTurbo(this, 36, 198, textureX, textureY); // Box 66
		hipsModel[134] = new ModelRendererTurbo(this, 36, 215, textureX, textureY); // Box 67
		hipsModel[135] = new ModelRendererTurbo(this, 20, 53, textureX, textureY); // Box 68
		hipsModel[136] = new ModelRendererTurbo(this, 20, 68, textureX, textureY); // Box 69
		hipsModel[137] = new ModelRendererTurbo(this, 20, 88, textureX, textureY); // Box 70
		hipsModel[138] = new ModelRendererTurbo(this, 20, 108, textureX, textureY); // Box 71
		hipsModel[139] = new ModelRendererTurbo(this, 20, 127, textureX, textureY); // Box 72
		hipsModel[140] = new ModelRendererTurbo(this, 20, 145, textureX, textureY); // Box 73
		hipsModel[141] = new ModelRendererTurbo(this, 20, 162, textureX, textureY); // Box 74
		hipsModel[142] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 75
		hipsModel[143] = new ModelRendererTurbo(this, 20, 198, textureX, textureY); // Box 76
		hipsModel[144] = new ModelRendererTurbo(this, 20, 215, textureX, textureY); // Box 77
		hipsModel[145] = new ModelRendererTurbo(this, 15, 227, textureX, textureY); // Box 137
		hipsModel[146] = new ModelRendererTurbo(this, 75, 229, textureX, textureY); // Box 138
		hipsModel[147] = new ModelRendererTurbo(this, 149, 21, textureX, textureY); // Box 0
		hipsModel[148] = new ModelRendererTurbo(this, 179, 21, textureX, textureY); // Box 1
		hipsModel[149] = new ModelRendererTurbo(this, 159, 21, textureX, textureY); // Box 2
		hipsModel[150] = new ModelRendererTurbo(this, 173, 46, textureX, textureY); // Box 3
		hipsModel[151] = new ModelRendererTurbo(this, 173, 46, textureX, textureY); // Box 4
		hipsModel[152] = new ModelRendererTurbo(this, 149, 39, textureX, textureY); // Box 5
		hipsModel[153] = new ModelRendererTurbo(this, 173, 55, textureX, textureY); // Box 9
		hipsModel[154] = new ModelRendererTurbo(this, 151, 39, textureX, textureY); // Box 10
		hipsModel[155] = new ModelRendererTurbo(this, 173, 54, textureX, textureY); // Box 11
		hipsModel[156] = new ModelRendererTurbo(this, 167, 21, textureX, textureY); // Box 12
		hipsModel[157] = new ModelRendererTurbo(this, 194, 22, textureX, textureY); // Box 16
		hipsModel[158] = new ModelRendererTurbo(this, 183, 29, textureX, textureY); // Box 17
		hipsModel[159] = new ModelRendererTurbo(this, 174, 63, textureX, textureY); // Box 18
		hipsModel[160] = new ModelRendererTurbo(this, 151, 40, textureX, textureY); // Box 19
		hipsModel[161] = new ModelRendererTurbo(this, 174, 63, textureX, textureY); // Box 20
		hipsModel[162] = new ModelRendererTurbo(this, 176, 29, textureX, textureY); // Box 22
		hipsModel[163] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 23
		hipsModel[164] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 27
		hipsModel[165] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 28
		hipsModel[166] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 29
		hipsModel[167] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 30
		hipsModel[168] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 31
		hipsModel[169] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 32
		hipsModel[170] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 40
		hipsModel[171] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 45
		hipsModel[172] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 46
		hipsModel[173] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 47
		hipsModel[174] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 48
		hipsModel[175] = new ModelRendererTurbo(this, 149, 66, textureX, textureY); // Box 49
		hipsModel[176] = new ModelRendererTurbo(this, 149, 66, textureX, textureY); // Box 54
		hipsModel[177] = new ModelRendererTurbo(this, 151, 48, textureX, textureY); // Box 55
		hipsModel[178] = new ModelRendererTurbo(this, 159, 21, textureX, textureY); // Box 59
		hipsModel[179] = new ModelRendererTurbo(this, 183, 29, textureX, textureY); // Box 60
		hipsModel[180] = new ModelRendererTurbo(this, 173, 55, textureX, textureY); // Box 61
		hipsModel[181] = new ModelRendererTurbo(this, 151, 39, textureX, textureY); // Box 62
		hipsModel[182] = new ModelRendererTurbo(this, 173, 54, textureX, textureY); // Box 63
		hipsModel[183] = new ModelRendererTurbo(this, 174, 63, textureX, textureY); // Box 64
		hipsModel[184] = new ModelRendererTurbo(this, 151, 40, textureX, textureY); // Box 65
		hipsModel[185] = new ModelRendererTurbo(this, 174, 63, textureX, textureY); // Box 66
		hipsModel[186] = new ModelRendererTurbo(this, 167, 21, textureX, textureY); // Box 67
		hipsModel[187] = new ModelRendererTurbo(this, 194, 22, textureX, textureY); // Box 68
		hipsModel[188] = new ModelRendererTurbo(this, 176, 29, textureX, textureY); // Box 69
		hipsModel[189] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 70
		hipsModel[190] = new ModelRendererTurbo(this, 132, 17, textureX, textureY); // Box 75
		hipsModel[191] = new ModelRendererTurbo(this, 151, 48, textureX, textureY); // Box 76
		hipsModel[192] = new ModelRendererTurbo(this, 132, 21, textureX, textureY); // Box 77
		hipsModel[193] = new ModelRendererTurbo(this, 132, 25, textureX, textureY); // Box 0
		hipsModel[194] = new ModelRendererTurbo(this, 132, 30, textureX, textureY); // Box 1
		hipsModel[195] = new ModelRendererTurbo(this, 132, 33, textureX, textureY); // Box 2
		hipsModel[196] = new ModelRendererTurbo(this, 132, 37, textureX, textureY); // Box 3
		hipsModel[197] = new ModelRendererTurbo(this, 132, 42, textureX, textureY); // Box 4
		hipsModel[198] = new ModelRendererTurbo(this, 132, 48, textureX, textureY); // Box 5
		hipsModel[199] = new ModelRendererTurbo(this, 132, 53, textureX, textureY); // Box 6
		hipsModel[200] = new ModelRendererTurbo(this, 132, 53, textureX, textureY); // Box 7
		hipsModel[201] = new ModelRendererTurbo(this, 132, 13, textureX, textureY); // Box 8
		hipsModel[202] = new ModelRendererTurbo(this, 132, 10, textureX, textureY); // Box 9
		hipsModel[203] = new ModelRendererTurbo(this, 132, 10, textureX, textureY); // Box 10
		hipsModel[204] = new ModelRendererTurbo(this, 132, 13, textureX, textureY); // Box 11
		hipsModel[205] = new ModelRendererTurbo(this, 132, 17, textureX, textureY); // Box 12
		hipsModel[206] = new ModelRendererTurbo(this, 132, 21, textureX, textureY); // Box 13
		hipsModel[207] = new ModelRendererTurbo(this, 132, 25, textureX, textureY); // Box 14
		hipsModel[208] = new ModelRendererTurbo(this, 132, 30, textureX, textureY); // Box 15
		hipsModel[209] = new ModelRendererTurbo(this, 132, 33, textureX, textureY); // Box 16
		hipsModel[210] = new ModelRendererTurbo(this, 132, 37, textureX, textureY); // Box 17
		hipsModel[211] = new ModelRendererTurbo(this, 132, 42, textureX, textureY); // Box 18
		hipsModel[212] = new ModelRendererTurbo(this, 132, 48, textureX, textureY); // Box 19
		hipsModel[213] = new ModelRendererTurbo(this, 132, 53, textureX, textureY); // Box 20
		hipsModel[214] = new ModelRendererTurbo(this, 191, 89, textureX, textureY); // Box 21
		hipsModel[215] = new ModelRendererTurbo(this, 137, 159, textureX, textureY); // Box 0
		hipsModel[216] = new ModelRendererTurbo(this, 127, 159, textureX, textureY); // Box 3
		hipsModel[217] = new ModelRendererTurbo(this, 127, 164, textureX, textureY); // Box 4
		hipsModel[218] = new ModelRendererTurbo(this, 137, 164, textureX, textureY); // Box 5
		hipsModel[219] = new ModelRendererTurbo(this, 137, 174, textureX, textureY); // Box 6
		hipsModel[220] = new ModelRendererTurbo(this, 127, 174, textureX, textureY); // Box 7
		hipsModel[221] = new ModelRendererTurbo(this, 162, 174, textureX, textureY); // Box 8
		hipsModel[222] = new ModelRendererTurbo(this, 162, 164, textureX, textureY); // Box 9
		hipsModel[223] = new ModelRendererTurbo(this, 162, 159, textureX, textureY); // Box 10
		hipsModel[224] = new ModelRendererTurbo(this, 146, 181, textureX, textureY); // Box 11
		hipsModel[225] = new ModelRendererTurbo(this, 138, 181, textureX, textureY); // Box 12
		hipsModel[226] = new ModelRendererTurbo(this, 138, 181, textureX, textureY); // Box 14
		hipsModel[227] = new ModelRendererTurbo(this, 154, 181, textureX, textureY); // Box 15
		hipsModel[228] = new ModelRendererTurbo(this, 154, 181, textureX, textureY); // Box 16
		hipsModel[229] = new ModelRendererTurbo(this, 138, 181, textureX, textureY); // Box 21
		hipsModel[230] = new ModelRendererTurbo(this, 133, 155, textureX, textureY); // Box 22
		hipsModel[231] = new ModelRendererTurbo(this, 155, 155, textureX, textureY); // Box 25
		hipsModel[232] = new ModelRendererTurbo(this, 143, 107, textureX, textureY); // Box 27
		hipsModel[233] = new ModelRendererTurbo(this, 143, 112, textureX, textureY); // Box 28
		hipsModel[234] = new ModelRendererTurbo(this, 154, 107, textureX, textureY); // Box 29
		hipsModel[235] = new ModelRendererTurbo(this, 134, 107, textureX, textureY); // Box 30
		hipsModel[236] = new ModelRendererTurbo(this, 134, 112, textureX, textureY); // Box 31
		hipsModel[237] = new ModelRendererTurbo(this, 154, 112, textureX, textureY); // Box 32
		hipsModel[238] = new ModelRendererTurbo(this, 154, 116, textureX, textureY); // Box 33
		hipsModel[239] = new ModelRendererTurbo(this, 154, 121, textureX, textureY); // Box 34
		hipsModel[240] = new ModelRendererTurbo(this, 143, 116, textureX, textureY); // Box 35
		hipsModel[241] = new ModelRendererTurbo(this, 143, 121, textureX, textureY); // Box 36
		hipsModel[242] = new ModelRendererTurbo(this, 134, 116, textureX, textureY); // Box 37
		hipsModel[243] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 38
		hipsModel[244] = new ModelRendererTurbo(this, 134, 126, textureX, textureY); // Box 39
		hipsModel[245] = new ModelRendererTurbo(this, 143, 126, textureX, textureY); // Box 40
		hipsModel[246] = new ModelRendererTurbo(this, 154, 127, textureX, textureY); // Box 41
		hipsModel[247] = new ModelRendererTurbo(this, 171, 119, textureX, textureY); // Box 42
		hipsModel[248] = new ModelRendererTurbo(this, 171, 110, textureX, textureY); // Box 43
		hipsModel[249] = new ModelRendererTurbo(this, 180, 110, textureX, textureY); // Box 44
		hipsModel[250] = new ModelRendererTurbo(this, 185, 119, textureX, textureY); // Box 45
		hipsModel[251] = new ModelRendererTurbo(this, 188, 110, textureX, textureY); // Box 46
		hipsModel[252] = new ModelRendererTurbo(this, 172, 103, textureX, textureY); // Box 47
		hipsModel[253] = new ModelRendererTurbo(this, 192, 119, textureX, textureY); // Box 48
		hipsModel[254] = new ModelRendererTurbo(this, 194, 128, textureX, textureY); // Box 49
		hipsModel[255] = new ModelRendererTurbo(this, 186, 128, textureX, textureY); // Box 50
		hipsModel[256] = new ModelRendererTurbo(this, 176, 119, textureX, textureY); // Box 51
		hipsModel[257] = new ModelRendererTurbo(this, 176, 128, textureX, textureY); // Box 52
		hipsModel[258] = new ModelRendererTurbo(this, 171, 128, textureX, textureY); // Box 53
		hipsModel[259] = new ModelRendererTurbo(this, 184, 135, textureX, textureY); // Box 54
		hipsModel[260] = new ModelRendererTurbo(this, 174, 135, textureX, textureY); // Box 55
		hipsModel[261] = new ModelRendererTurbo(this, 185, 99, textureX, textureY); // Box 56
		hipsModel[262] = new ModelRendererTurbo(this, 190, 99, textureX, textureY); // Box 58
		hipsModel[263] = new ModelRendererTurbo(this, 195, 99, textureX, textureY); // Box 59
		hipsModel[264] = new ModelRendererTurbo(this, 226, 110, textureX, textureY); // Box 60
		hipsModel[265] = new ModelRendererTurbo(this, 79, 61, textureX, textureY); // Box 61
		hipsModel[266] = new ModelRendererTurbo(this, 79, 55, textureX, textureY); // Box 62
		hipsModel[267] = new ModelRendererTurbo(this, 79, 61, textureX, textureY); // Box 63
		hipsModel[268] = new ModelRendererTurbo(this, 79, 55, textureX, textureY); // Box 64
		hipsModel[269] = new ModelRendererTurbo(this, 212, 110, textureX, textureY); // Box 67
		hipsModel[270] = new ModelRendererTurbo(this, 239, 110, textureX, textureY); // Box 68
		hipsModel[271] = new ModelRendererTurbo(this, 239, 115, textureX, textureY); // Box 69
		hipsModel[272] = new ModelRendererTurbo(this, 226, 115, textureX, textureY); // Box 70
		hipsModel[273] = new ModelRendererTurbo(this, 212, 115, textureX, textureY); // Box 71
		hipsModel[274] = new ModelRendererTurbo(this, 226, 120, textureX, textureY); // Box 72
		hipsModel[275] = new ModelRendererTurbo(this, 239, 120, textureX, textureY); // Box 73
		hipsModel[276] = new ModelRendererTurbo(this, 212, 120, textureX, textureY); // Box 74
		hipsModel[277] = new ModelRendererTurbo(this, 212, 125, textureX, textureY); // Box 75
		hipsModel[278] = new ModelRendererTurbo(this, 226, 125, textureX, textureY); // Box 76
		hipsModel[279] = new ModelRendererTurbo(this, 239, 125, textureX, textureY); // Box 77
		hipsModel[280] = new ModelRendererTurbo(this, 219, 132, textureX, textureY); // Box 78
		hipsModel[281] = new ModelRendererTurbo(this, 226, 132, textureX, textureY); // Box 79
		hipsModel[282] = new ModelRendererTurbo(this, 239, 132, textureX, textureY); // Box 80
		hipsModel[283] = new ModelRendererTurbo(this, 226, 143, textureX, textureY); // Box 81
		hipsModel[284] = new ModelRendererTurbo(this, 239, 143, textureX, textureY); // Box 82
		hipsModel[285] = new ModelRendererTurbo(this, 205, 147, textureX, textureY); // Box 83
		hipsModel[286] = new ModelRendererTurbo(this, 205, 153, textureX, textureY); // Box 84
		hipsModel[287] = new ModelRendererTurbo(this, 205, 160, textureX, textureY); // Box 85
		hipsModel[288] = new ModelRendererTurbo(this, 205, 168, textureX, textureY); // Box 86
		hipsModel[289] = new ModelRendererTurbo(this, 197, 168, textureX, textureY); // Box 87
		hipsModel[290] = new ModelRendererTurbo(this, 197, 160, textureX, textureY); // Box 88
		hipsModel[291] = new ModelRendererTurbo(this, 197, 153, textureX, textureY); // Box 89
		hipsModel[292] = new ModelRendererTurbo(this, 197, 147, textureX, textureY); // Box 90
		hipsModel[293] = new ModelRendererTurbo(this, 189, 147, textureX, textureY); // Box 91
		hipsModel[294] = new ModelRendererTurbo(this, 183, 153, textureX, textureY); // Box 92
		hipsModel[295] = new ModelRendererTurbo(this, 183, 160, textureX, textureY); // Box 93
		hipsModel[296] = new ModelRendererTurbo(this, 183, 168, textureX, textureY); // Box 94
		hipsModel[297] = new ModelRendererTurbo(this, 181, 89, textureX, textureY); // Box 107
		hipsModel[298] = new ModelRendererTurbo(this, 176, 89, textureX, textureY); // Box 108
		hipsModel[299] = new ModelRendererTurbo(this, 181, 94, textureX, textureY); // Box 109
		hipsModel[300] = new ModelRendererTurbo(this, 191, 94, textureX, textureY); // Box 110
		hipsModel[301] = new ModelRendererTurbo(this, 176, 94, textureX, textureY); // Box 111
		hipsModel[302] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 112
		hipsModel[303] = new ModelRendererTurbo(this, 169, 94, textureX, textureY); // Box 113
		hipsModel[304] = new ModelRendererTurbo(this, 199, 89, textureX, textureY); // Box 115
		hipsModel[305] = new ModelRendererTurbo(this, 164, 89, textureX, textureY); // Box 118
		hipsModel[306] = new ModelRendererTurbo(this, 164, 94, textureX, textureY); // Box 119
		hipsModel[307] = new ModelRendererTurbo(this, 159, 94, textureX, textureY); // Box 122
		hipsModel[308] = new ModelRendererTurbo(this, 159, 89, textureX, textureY); // Box 123
		hipsModel[309] = new ModelRendererTurbo(this, 222, 90, textureX, textureY); // Box 0
		hipsModel[310] = new ModelRendererTurbo(this, 222, 93, textureX, textureY); // Box 1
		hipsModel[311] = new ModelRendererTurbo(this, 228, 90, textureX, textureY); // Box 2
		hipsModel[312] = new ModelRendererTurbo(this, 161, 99, textureX, textureY); // Box 3
		hipsModel[313] = new ModelRendererTurbo(this, 167, 99, textureX, textureY); // Box 4
		hipsModel[314] = new ModelRendererTurbo(this, 172, 99, textureX, textureY); // Box 5
		hipsModel[315] = new ModelRendererTurbo(this, 207, 89, textureX, textureY); // Box 7
		hipsModel[316] = new ModelRendererTurbo(this, 214, 89, textureX, textureY); // Box 8
		hipsModel[317] = new ModelRendererTurbo(this, 207, 94, textureX, textureY); // Box 9
		hipsModel[318] = new ModelRendererTurbo(this, 214, 94, textureX, textureY); // Box 10
		hipsModel[319] = new ModelRendererTurbo(this, 220, 102, textureX, textureY); // Box 11
		hipsModel[320] = new ModelRendererTurbo(this, 220, 98, textureX, textureY); // Box 12
		hipsModel[321] = new ModelRendererTurbo(this, 211, 99, textureX, textureY); // Box 13
		hipsModel[322] = new ModelRendererTurbo(this, 209, 83, textureX, textureY); // Box 14
		hipsModel[323] = new ModelRendererTurbo(this, 202, 83, textureX, textureY); // Box 15
		hipsModel[324] = new ModelRendererTurbo(this, 222, 83, textureX, textureY); // Box 17
		hipsModel[325] = new ModelRendererTurbo(this, 164, 89, textureX, textureY); // Box 0
		hipsModel[326] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 1
		hipsModel[327] = new ModelRendererTurbo(this, 176, 89, textureX, textureY); // Box 2
		hipsModel[328] = new ModelRendererTurbo(this, 199, 89, textureX, textureY); // Box 3
		hipsModel[329] = new ModelRendererTurbo(this, 191, 89, textureX, textureY); // Box 4
		hipsModel[330] = new ModelRendererTurbo(this, 181, 89, textureX, textureY); // Box 5
		hipsModel[331] = new ModelRendererTurbo(this, 228, 90, textureX, textureY); // Box 6
		hipsModel[332] = new ModelRendererTurbo(this, 169, 94, textureX, textureY); // Box 11
		hipsModel[333] = new ModelRendererTurbo(this, 176, 94, textureX, textureY); // Box 12
		hipsModel[334] = new ModelRendererTurbo(this, 181, 94, textureX, textureY); // Box 13
		hipsModel[335] = new ModelRendererTurbo(this, 191, 94, textureX, textureY); // Box 14
		hipsModel[336] = new ModelRendererTurbo(this, 164, 94, textureX, textureY); // Box 15
		hipsModel[337] = new ModelRendererTurbo(this, 159, 94, textureX, textureY); // Box 16
		hipsModel[338] = new ModelRendererTurbo(this, 209, 83, textureX, textureY); // Box 17
		hipsModel[339] = new ModelRendererTurbo(this, 202, 83, textureX, textureY); // Box 18
		hipsModel[340] = new ModelRendererTurbo(this, 215, 83, textureX, textureY); // Box 19
		hipsModel[341] = new ModelRendererTurbo(this, 222, 83, textureX, textureY); // Box 20
		hipsModel[342] = new ModelRendererTurbo(this, 215, 83, textureX, textureY); // Box 21
		hipsModel[343] = new ModelRendererTurbo(this, 211, 99, textureX, textureY); // Box 22
		hipsModel[344] = new ModelRendererTurbo(this, 214, 94, textureX, textureY); // Box 23
		hipsModel[345] = new ModelRendererTurbo(this, 207, 94, textureX, textureY); // Box 24
		hipsModel[346] = new ModelRendererTurbo(this, 214, 89, textureX, textureY); // Box 25
		hipsModel[347] = new ModelRendererTurbo(this, 207, 89, textureX, textureY); // Box 26
		hipsModel[348] = new ModelRendererTurbo(this, 220, 102, textureX, textureY); // Box 27
		hipsModel[349] = new ModelRendererTurbo(this, 220, 98, textureX, textureY); // Box 28
		hipsModel[350] = new ModelRendererTurbo(this, 172, 99, textureX, textureY); // Box 29
		hipsModel[351] = new ModelRendererTurbo(this, 167, 99, textureX, textureY); // Box 30
		hipsModel[352] = new ModelRendererTurbo(this, 185, 99, textureX, textureY); // Box 31
		hipsModel[353] = new ModelRendererTurbo(this, 190, 99, textureX, textureY); // Box 32
		hipsModel[354] = new ModelRendererTurbo(this, 195, 99, textureX, textureY); // Box 33
		hipsModel[355] = new ModelRendererTurbo(this, 134, 126, textureX, textureY); // Box 34
		hipsModel[356] = new ModelRendererTurbo(this, 143, 126, textureX, textureY); // Box 35
		hipsModel[357] = new ModelRendererTurbo(this, 143, 121, textureX, textureY); // Box 36
		hipsModel[358] = new ModelRendererTurbo(this, 134, 121, textureX, textureY); // Box 37
		hipsModel[359] = new ModelRendererTurbo(this, 134, 116, textureX, textureY); // Box 38
		hipsModel[360] = new ModelRendererTurbo(this, 143, 116, textureX, textureY); // Box 39
		hipsModel[361] = new ModelRendererTurbo(this, 154, 116, textureX, textureY); // Box 40
		hipsModel[362] = new ModelRendererTurbo(this, 154, 121, textureX, textureY); // Box 41
		hipsModel[363] = new ModelRendererTurbo(this, 154, 112, textureX, textureY); // Box 42
		hipsModel[364] = new ModelRendererTurbo(this, 143, 112, textureX, textureY); // Box 43
		hipsModel[365] = new ModelRendererTurbo(this, 134, 112, textureX, textureY); // Box 44
		hipsModel[366] = new ModelRendererTurbo(this, 171, 128, textureX, textureY); // Box 45
		hipsModel[367] = new ModelRendererTurbo(this, 171, 110, textureX, textureY); // Box 46
		hipsModel[368] = new ModelRendererTurbo(this, 180, 110, textureX, textureY); // Box 47
		hipsModel[369] = new ModelRendererTurbo(this, 172, 103, textureX, textureY); // Box 48
		hipsModel[370] = new ModelRendererTurbo(this, 188, 110, textureX, textureY); // Box 49
		hipsModel[371] = new ModelRendererTurbo(this, 192, 119, textureX, textureY); // Box 50
		hipsModel[372] = new ModelRendererTurbo(this, 185, 119, textureX, textureY); // Box 51
		hipsModel[373] = new ModelRendererTurbo(this, 176, 119, textureX, textureY); // Box 52
		hipsModel[374] = new ModelRendererTurbo(this, 176, 128, textureX, textureY); // Box 53
		hipsModel[375] = new ModelRendererTurbo(this, 194, 128, textureX, textureY); // Box 54
		hipsModel[376] = new ModelRendererTurbo(this, 186, 128, textureX, textureY); // Box 55
		hipsModel[377] = new ModelRendererTurbo(this, 184, 135, textureX, textureY); // Box 56
		hipsModel[378] = new ModelRendererTurbo(this, 174, 135, textureX, textureY); // Box 57
		hipsModel[379] = new ModelRendererTurbo(this, 127, 174, textureX, textureY); // Box 58
		hipsModel[380] = new ModelRendererTurbo(this, 127, 164, textureX, textureY); // Box 59
		hipsModel[381] = new ModelRendererTurbo(this, 127, 159, textureX, textureY); // Box 60
		hipsModel[382] = new ModelRendererTurbo(this, 138, 181, textureX, textureY); // Box 61
		hipsModel[383] = new ModelRendererTurbo(this, 155, 155, textureX, textureY); // Box 62
		hipsModel[384] = new ModelRendererTurbo(this, 133, 155, textureX, textureY); // Box 63
		hipsModel[385] = new ModelRendererTurbo(this, 137, 159, textureX, textureY); // Box 64
		hipsModel[386] = new ModelRendererTurbo(this, 162, 159, textureX, textureY); // Box 65
		hipsModel[387] = new ModelRendererTurbo(this, 138, 181, textureX, textureY); // Box 66
		hipsModel[388] = new ModelRendererTurbo(this, 146, 181, textureX, textureY); // Box 67
		hipsModel[389] = new ModelRendererTurbo(this, 154, 181, textureX, textureY); // Box 68
		hipsModel[390] = new ModelRendererTurbo(this, 162, 164, textureX, textureY); // Box 69
		hipsModel[391] = new ModelRendererTurbo(this, 154, 181, textureX, textureY); // Box 70
		hipsModel[392] = new ModelRendererTurbo(this, 138, 181, textureX, textureY); // Box 71
		hipsModel[393] = new ModelRendererTurbo(this, 137, 164, textureX, textureY); // Box 72
		hipsModel[394] = new ModelRendererTurbo(this, 162, 174, textureX, textureY); // Box 73
		hipsModel[395] = new ModelRendererTurbo(this, 137, 174, textureX, textureY); // Box 74
		hipsModel[396] = new ModelRendererTurbo(this, 212, 115, textureX, textureY); // Box 75
		hipsModel[397] = new ModelRendererTurbo(this, 226, 115, textureX, textureY); // Box 76
		hipsModel[398] = new ModelRendererTurbo(this, 239, 115, textureX, textureY); // Box 77
		hipsModel[399] = new ModelRendererTurbo(this, 212, 120, textureX, textureY); // Box 78
		hipsModel[400] = new ModelRendererTurbo(this, 226, 120, textureX, textureY); // Box 79
		hipsModel[401] = new ModelRendererTurbo(this, 239, 120, textureX, textureY); // Box 80
		hipsModel[402] = new ModelRendererTurbo(this, 212, 125, textureX, textureY); // Box 81
		hipsModel[403] = new ModelRendererTurbo(this, 226, 125, textureX, textureY); // Box 82
		hipsModel[404] = new ModelRendererTurbo(this, 239, 125, textureX, textureY); // Box 83
		hipsModel[405] = new ModelRendererTurbo(this, 219, 132, textureX, textureY); // Box 84
		hipsModel[406] = new ModelRendererTurbo(this, 226, 132, textureX, textureY); // Box 85
		hipsModel[407] = new ModelRendererTurbo(this, 239, 132, textureX, textureY); // Box 86
		hipsModel[408] = new ModelRendererTurbo(this, 226, 143, textureX, textureY); // Box 87
		hipsModel[409] = new ModelRendererTurbo(this, 239, 143, textureX, textureY); // Box 88
		hipsModel[410] = new ModelRendererTurbo(this, 197, 147, textureX, textureY); // Box 89
		hipsModel[411] = new ModelRendererTurbo(this, 197, 153, textureX, textureY); // Box 90
		hipsModel[412] = new ModelRendererTurbo(this, 197, 160, textureX, textureY); // Box 91
		hipsModel[413] = new ModelRendererTurbo(this, 197, 168, textureX, textureY); // Box 92
		hipsModel[414] = new ModelRendererTurbo(this, 183, 168, textureX, textureY); // Box 93
		hipsModel[415] = new ModelRendererTurbo(this, 183, 160, textureX, textureY); // Box 94
		hipsModel[416] = new ModelRendererTurbo(this, 183, 153, textureX, textureY); // Box 95
		hipsModel[417] = new ModelRendererTurbo(this, 189, 147, textureX, textureY); // Box 96

		hipsModel[0].addShapeBox(-3F, 0F, 0F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 0
		hipsModel[0].setRotationPoint(0F, -29F, 0F);

		hipsModel[1].addShapeBox(0F, 0F, 0F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 0
		hipsModel[1].setRotationPoint(0F, -29F, 0F);

		hipsModel[2].addShapeBox(4F, -1F, 0F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[2].setRotationPoint(0F, -29F, 0F);

		hipsModel[3].addShapeBox(8F, -2F, 0F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 2
		hipsModel[3].setRotationPoint(0F, -29F, 0F);

		hipsModel[4].addShapeBox(10F, 5F, 0F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[4].setRotationPoint(0F, -29F, 0F);

		hipsModel[5].addShapeBox(-10F, 0F, 0F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 4
		hipsModel[5].setRotationPoint(0F, -29F, 0F);

		hipsModel[6].addShapeBox(-13F, -1F, 0F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[6].setRotationPoint(0F, -29F, 0F);

		hipsModel[7].addShapeBox(-16F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[7].setRotationPoint(0F, -29F, 0F);

		hipsModel[8].addShapeBox(-18F, 5F, 0F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 7
		hipsModel[8].setRotationPoint(0F, -29F, 0F);

		hipsModel[9].addShapeBox(-6F, 0F, 0F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[9].setRotationPoint(0F, -29F, 0F);

		hipsModel[10].addShapeBox(10F, -4F, 0F, 3, 11, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 47
		hipsModel[10].setRotationPoint(0F, -29F, 0F);

		hipsModel[11].addShapeBox(13F, -5F, 0F, 3, 9, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 48
		hipsModel[11].setRotationPoint(0F, -29F, 0F);

		hipsModel[12].addShapeBox(16F, -6F, 0F, 3, 6, 1, 0F,0F, -.5F, 0F, 0F, -.1F, 0F, -.2F, -.15F, 0F, 0F, -.5F, 0F, 0F, 3F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, 3F, 0F); // Box 49
		hipsModel[12].setRotationPoint(0F, -29F, 0F);

		hipsModel[13].addShapeBox(8F, -3F, 0F, 2, 9, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[13].setRotationPoint(0F, -29F, 0F);

		hipsModel[14].addShapeBox(-18F, 0F, 0F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 9
		hipsModel[14].setRotationPoint(0F, -29F, 0F);

		hipsModel[15].addShapeBox(23.7F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.1F, -.7F, 0F, 0F, -.2F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .1F, 0F); // Box 8
		hipsModel[15].setRotationPoint(0F, -29F, 0F);
		hipsModel[15].rotateAngleZ = -0.64577182F;

		hipsModel[16].addShapeBox(22.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[16].setRotationPoint(0F, -29F, 0F);
		hipsModel[16].rotateAngleZ = -0.64577182F;

		hipsModel[17].addShapeBox(21.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[17].setRotationPoint(0F, -29F, 0F);
		hipsModel[17].rotateAngleZ = -0.64577182F;

		hipsModel[18].addShapeBox(19.5F, -18F, 0F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 11
		hipsModel[18].setRotationPoint(0F, -29F, 0F);
		hipsModel[18].rotateAngleZ = -0.64577182F;

		hipsModel[19].addShapeBox(17.5F, -18F, 0F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[19].setRotationPoint(0F, -29F, 0F);
		hipsModel[19].rotateAngleZ = -0.64577182F;

		hipsModel[20].addShapeBox(15.5F, -19F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[20].setRotationPoint(0F, -29F, 0F);
		hipsModel[20].rotateAngleZ = -0.64577182F;

		hipsModel[21].addShapeBox(13.5F, -19F, 0F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[21].setRotationPoint(0F, -29F, 0F);
		hipsModel[21].rotateAngleZ = -0.64577182F;

		hipsModel[22].addShapeBox(19.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 0
		hipsModel[22].setRotationPoint(0F, -29F, 0F);
		hipsModel[22].rotateAngleZ = -0.64577182F;

		hipsModel[23].addShapeBox(21.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.5F, 0F); // Box 1
		hipsModel[23].setRotationPoint(0F, -29F, 0F);
		hipsModel[23].rotateAngleZ = -0.64577182F;

		hipsModel[24].addShapeBox(22.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F); // Box 2
		hipsModel[24].setRotationPoint(0F, -29F, 0F);
		hipsModel[24].rotateAngleZ = -0.64577182F;

		hipsModel[25].addShapeBox(17.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 3
		hipsModel[25].setRotationPoint(0F, -29F, 0F);
		hipsModel[25].rotateAngleZ = -0.64577182F;

		hipsModel[26].addShapeBox(15.5F, -15F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[26].setRotationPoint(0F, -29F, 0F);
		hipsModel[26].rotateAngleZ = -0.64577182F;

		hipsModel[27].addShapeBox(23.7F, -15F, -0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, 0.1F, -.3F, 0F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, .2F, -0.2F, 0F); // Box 6
		hipsModel[27].setRotationPoint(0F, -29F, 0F);
		hipsModel[27].rotateAngleZ = -0.64577182F;

		hipsModel[28].addShapeBox(11.5F, -18F, 0F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[28].setRotationPoint(0F, -29F, 0F);
		hipsModel[28].rotateAngleZ = -0.64577182F;

		hipsModel[29].addShapeBox(10F, 2F, 1F, 3, 5, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[29].setRotationPoint(0F, -29F, 0F);

		hipsModel[30].addShapeBox(13F, 1F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -.5F, 2F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 13
		hipsModel[30].setRotationPoint(0F, -29F, 0F);

		hipsModel[31].addShapeBox(16F, -3F, 1F, 3, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 3F, 0F, 1F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 2F, 0F); // Box 14
		hipsModel[31].setRotationPoint(0F, -29F, 0F);

		hipsModel[32].addShapeBox(8F, -3F, 1F, 2, 7, 1, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 2F); // Box 15
		hipsModel[32].setRotationPoint(0F, -29F, 0F);

		hipsModel[33].addShapeBox(10F, -4F, 1F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 2F, 0F, 0F, 2F); // Box 16
		hipsModel[33].setRotationPoint(0F, -29F, 0F);

		hipsModel[34].addShapeBox(13F, -5F, 1F, 3, 6, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, .5F, 2F); // Box 17
		hipsModel[34].setRotationPoint(0F, -29F, 0F);

		hipsModel[35].addShapeBox(16F, -6F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, -.2F, -.15F, 0F, -.5F, -.53F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F); // Box 18
		hipsModel[35].setRotationPoint(0F, -29F, 0F);

		hipsModel[36].addShapeBox(11.5F, -18F, 1F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F); // Box 19
		hipsModel[36].setRotationPoint(0F, -29F, 0F);
		hipsModel[36].rotateAngleZ = -0.64577182F;

		hipsModel[37].addShapeBox(11.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -1.3F, 0F); // Box 20
		hipsModel[37].setRotationPoint(0F, -29F, 0F);
		hipsModel[37].rotateAngleZ = -0.64577182F;

		hipsModel[38].addShapeBox(13.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 1F, 0F, -.8F, 0F); // Box 21
		hipsModel[38].setRotationPoint(0F, -29F, 0F);
		hipsModel[38].rotateAngleZ = -0.64577182F;

		hipsModel[39].addShapeBox(13.5F, -19F, 1F, 2, 4, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F); // Box 22
		hipsModel[39].setRotationPoint(0F, -29F, 0F);
		hipsModel[39].rotateAngleZ = -0.64577182F;

		hipsModel[40].addShapeBox(15.5F, -19F, 1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 23
		hipsModel[40].setRotationPoint(0F, -29F, 0F);
		hipsModel[40].rotateAngleZ = -0.64577182F;

		hipsModel[41].addShapeBox(15.5F, -15F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.7F, 0F, 0F, -.8F, 0F); // Box 24
		hipsModel[41].setRotationPoint(0F, -29F, 0F);
		hipsModel[41].rotateAngleZ = -0.64577182F;

		hipsModel[42].addShapeBox(17.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.7F, 1F); // Box 25
		hipsModel[42].setRotationPoint(0F, -29F, 0F);
		hipsModel[42].rotateAngleZ = -0.64577182F;

		hipsModel[43].addShapeBox(17.5F, -18F, 1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F); // Box 26
		hipsModel[43].setRotationPoint(0F, -29F, 0F);
		hipsModel[43].rotateAngleZ = -0.64577182F;

		hipsModel[44].addShapeBox(19.5F, -18F, 1F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, .5F, 0F, -1.5F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F); // Box 27
		hipsModel[44].setRotationPoint(0F, -29F, 0F);
		hipsModel[44].rotateAngleZ = -0.64577182F;

		hipsModel[45].addShapeBox(19.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.8F, -.5F, 0F, -.5F, 0F); // Box 28
		hipsModel[45].setRotationPoint(0F, -29F, 0F);
		hipsModel[45].rotateAngleZ = -0.64577182F;

		hipsModel[46].addShapeBox(-3F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 29
		hipsModel[46].setRotationPoint(0F, -29F, 0F);

		hipsModel[47].addShapeBox(-3F, 5F, 2F, 3, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 30
		hipsModel[47].setRotationPoint(0F, -29F, 0F);

		hipsModel[48].addShapeBox(-6F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 31
		hipsModel[48].setRotationPoint(0F, -29F, 0F);

		hipsModel[49].addShapeBox(-6F, 5F, 2F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 32
		hipsModel[49].setRotationPoint(0F, -29F, 0F);

		hipsModel[50].addShapeBox(-13F, -1F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 33
		hipsModel[50].setRotationPoint(0F, -29F, 0F);

		hipsModel[51].addShapeBox(-10F, 0F, 2F, 4, 5, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 34
		hipsModel[51].setRotationPoint(0F, -29F, 0F);

		hipsModel[52].addShapeBox(-16F, 0F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[52].setRotationPoint(0F, -29F, 0F);

		hipsModel[53].addShapeBox(-18F, 0F, 2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -3F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 36
		hipsModel[53].setRotationPoint(0F, -29F, 0F);

		hipsModel[54].addShapeBox(-18F, 5F, 2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, -1F, -4F, -.7F); // Box 37
		hipsModel[54].setRotationPoint(0F, -29F, 0F);

		hipsModel[55].addShapeBox(-16F, 5F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -.5F); // Box 38
		hipsModel[55].setRotationPoint(0F, -29F, 0F);

		hipsModel[56].addShapeBox(-13F, 5F, 2F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -4F, .5F, 0F, -3F, 0F); // Box 39
		hipsModel[56].setRotationPoint(0F, -29F, 0F);

		hipsModel[57].addShapeBox(-10F, 5F, 2F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -3F, -.5F); // Box 40
		hipsModel[57].setRotationPoint(0F, -29F, 0F);

		hipsModel[58].addShapeBox(0F, 5F, 2F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F); // Box 41
		hipsModel[58].setRotationPoint(0F, -29F, 0F);

		hipsModel[59].addShapeBox(4F, 5F, 2F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 1F); // Box 42
		hipsModel[59].setRotationPoint(0F, -29F, 0F);

		hipsModel[60].addShapeBox(0F, 0F, 2F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 43
		hipsModel[60].setRotationPoint(0F, -29F, 0F);

		hipsModel[61].addShapeBox(4F, -1F, 2F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 44
		hipsModel[61].setRotationPoint(0F, -29F, 0F);

		hipsModel[62].addShapeBox(8F, 5F, 2F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, 0F); // Box 45
		hipsModel[62].setRotationPoint(0F, -29F, 0F);

		hipsModel[63].addShapeBox(10F, 5F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, .5F, -2F, 0F, -.5F, -5F, 0F, 0F, -3.5F, 0F); // Box 46
		hipsModel[63].setRotationPoint(0F, -29F, 0F);

		hipsModel[64].addShapeBox(10F, -1F, 2F, 2, 6, 2, 0F,0F, 0F, 0F, .5F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 47
		hipsModel[64].setRotationPoint(0F, -29F, 0F);

		hipsModel[65].addShapeBox(8F, -2F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F); // Box 48
		hipsModel[65].setRotationPoint(0F, -29F, 0F);

		hipsModel[66].addShapeBox(21.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.8F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[66].setRotationPoint(0F, -29F, 0F);
		hipsModel[66].rotateAngleZ = -0.64577182F;

		hipsModel[67].addShapeBox(21.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 3
		hipsModel[67].setRotationPoint(0F, -29F, 0F);
		hipsModel[67].rotateAngleZ = -0.64577182F;

		hipsModel[68].addShapeBox(22.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.5F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, .3F, 0F, 0F, 0F); // Box 0
		hipsModel[68].setRotationPoint(0F, -29F, 0F);
		hipsModel[68].rotateAngleZ = -0.64577182F;

		hipsModel[69].addShapeBox(22.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.7F, 0F, 0F, -.8F, 0F); // Box 1
		hipsModel[69].setRotationPoint(0F, -29F, 0F);
		hipsModel[69].rotateAngleZ = -0.64577182F;

		hipsModel[70].addShapeBox(23.7F, -15F, 0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, -.35F, -.3F, -.3F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -.5F, -1F, -.5F, .2F, -.7F, 0F); // Box 2
		hipsModel[70].setRotationPoint(0F, -29F, 0F);
		hipsModel[70].rotateAngleZ = -0.64577182F;

		hipsModel[71].addShapeBox(23.7F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.5F, -1F, -.5F, 0F, -.5F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, -.2F, .2F, -.2F, .2F, .1F, .3F); // Box 3
		hipsModel[71].setRotationPoint(0F, -29F, 0F);
		hipsModel[71].rotateAngleZ = -0.64577182F;

		hipsModel[72].addShapeBox(-18F, 0F, -1F, 2, 2, 2, 0F,0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 7
		hipsModel[72].setRotationPoint(0F, -29F, 0F);

		hipsModel[73].addShapeBox(-14.5F, -13.5F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 9
		hipsModel[73].setRotationPoint(0F, -29F, 0F);
		hipsModel[73].rotateAngleZ = 0.85521133F;

		hipsModel[74].addShapeBox(-13.3F, -18.5F, -2F, 4, 4, 4, 0F,0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F); // Box 10
		hipsModel[74].setRotationPoint(0F, -29F, 0F);
		hipsModel[74].rotateAngleZ = 1.18682389F;

		hipsModel[75].addShapeBox(-13.6F, -20.2F, -2F, 3, 4, 4, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 13
		hipsModel[75].setRotationPoint(0F, -29F, 0F);
		hipsModel[75].rotateAngleZ = 1.32645023F;

		hipsModel[76].addShapeBox(-15.6F, -21.9F, -2F, 5, 4, 4, 0F,0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F); // Box 14
		hipsModel[76].setRotationPoint(0F, -29F, 0F);
		hipsModel[76].rotateAngleZ = 1.46607657F;

		hipsModel[77].addShapeBox(-27.89F, -15.79F, 0F, 7, 4, 2, 0F,2F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, .5F, -.5F, -.5F, .5F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -.5F, -.5F, -.5F); // Box 0
		hipsModel[77].setRotationPoint(0F, -29F, 0F);
		hipsModel[77].rotateAngleZ = 1.13446401F;

		hipsModel[78].addShapeBox(-27.89F, -15.79F, -2F, 7, 4, 2, 0F,0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 2F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 8
		hipsModel[78].setRotationPoint(0F, -29F, 0F);
		hipsModel[78].rotateAngleZ = 1.13446401F;

		hipsModel[79].addShapeBox(-18F, 0F, -2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 9
		hipsModel[79].setRotationPoint(0F, -29F, 0F);

		hipsModel[80].addShapeBox(-18F, 5F, -2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 10
		hipsModel[80].setRotationPoint(0F, -29F, 0F);

		hipsModel[81].addShapeBox(-16F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[81].setRotationPoint(0F, -29F, 0F);

		hipsModel[82].addShapeBox(-13F, -1F, -2F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[82].setRotationPoint(0F, -29F, 0F);

		hipsModel[83].addShapeBox(-10F, 0F, -2F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 13
		hipsModel[83].setRotationPoint(0F, -29F, 0F);

		hipsModel[84].addShapeBox(-6F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[84].setRotationPoint(0F, -29F, 0F);

		hipsModel[85].addShapeBox(-3F, 0F, -2F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 15
		hipsModel[85].setRotationPoint(0F, -29F, 0F);

		hipsModel[86].addShapeBox(0F, 0F, -2F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 16
		hipsModel[86].setRotationPoint(0F, -29F, 0F);

		hipsModel[87].addShapeBox(4F, -1F, -2F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[87].setRotationPoint(0F, -29F, 0F);

		hipsModel[88].addShapeBox(8F, -2F, -2F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 18
		hipsModel[88].setRotationPoint(0F, -29F, 0F);

		hipsModel[89].addShapeBox(10F, 5F, -2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[89].setRotationPoint(0F, -29F, 0F);

		hipsModel[90].addShapeBox(10F, -4F, -1F, 3, 11, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 20
		hipsModel[90].setRotationPoint(0F, -29F, 0F);

		hipsModel[91].addShapeBox(13F, -5F, -1F, 3, 9, 1, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 21
		hipsModel[91].setRotationPoint(0F, -29F, 0F);

		hipsModel[92].addShapeBox(16F, -6F, -1F, 3, 6, 1, 0F,0F, -0.5F, 0F, -0.2F, -0.15F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 22
		hipsModel[92].setRotationPoint(0F, -29F, 0F);

		hipsModel[93].addShapeBox(8F, -3F, -1F, 2, 9, 1, 0F,0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[93].setRotationPoint(0F, -29F, 0F);

		hipsModel[94].addShapeBox(16F, -6F, -2F, 3, 3, 1, 0F,0F, -1.5F, 0F, -0.5F, -0.53F, 0F, -0.2F, -0.15F, 0F, 0F, -0.5F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 25
		hipsModel[94].setRotationPoint(0F, -29F, 0F);

		hipsModel[95].addShapeBox(16F, -3F, -2F, 3, 3, 1, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0.5F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 26
		hipsModel[95].setRotationPoint(0F, -29F, 0F);

		hipsModel[96].addShapeBox(13F, -5F, -2F, 3, 6, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 2F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 27
		hipsModel[96].setRotationPoint(0F, -29F, 0F);

		hipsModel[97].addShapeBox(13F, 1F, -2F, 3, 3, 1, 0F,0F, -0.5F, 2F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 28
		hipsModel[97].setRotationPoint(0F, -29F, 0F);

		hipsModel[98].addShapeBox(10F, -4F, -2F, 3, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[98].setRotationPoint(0F, -29F, 0F);

		hipsModel[99].addShapeBox(10F, 2F, -2F, 3, 5, 1, 0F,0F, -1F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[99].setRotationPoint(0F, -29F, 0F);

		hipsModel[100].addShapeBox(8F, -3F, -2F, 2, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[100].setRotationPoint(0F, -29F, 0F);

		hipsModel[101].addShapeBox(11.5F, -18F, -1F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[101].setRotationPoint(0F, -29F, 0F);
		hipsModel[101].rotateAngleZ = -0.64577182F;

		hipsModel[102].addShapeBox(13.5F, -19F, -1F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		hipsModel[102].setRotationPoint(0F, -29F, 0F);
		hipsModel[102].rotateAngleZ = -0.64577182F;

		hipsModel[103].addShapeBox(15.5F, -19F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		hipsModel[103].setRotationPoint(0F, -29F, 0F);
		hipsModel[103].rotateAngleZ = -0.64577182F;

		hipsModel[104].addShapeBox(15.5F, -15F, -1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[104].setRotationPoint(0F, -29F, 0F);
		hipsModel[104].rotateAngleZ = -0.64577182F;

		hipsModel[105].addShapeBox(17.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 36
		hipsModel[105].setRotationPoint(0F, -29F, 0F);
		hipsModel[105].rotateAngleZ = -0.64577182F;

		hipsModel[106].addShapeBox(17.5F, -18F, -1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[106].setRotationPoint(0F, -29F, 0F);
		hipsModel[106].rotateAngleZ = -0.64577182F;

		hipsModel[107].addShapeBox(19.5F, -18F, -1F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		hipsModel[107].setRotationPoint(0F, -29F, 0F);
		hipsModel[107].rotateAngleZ = -0.64577182F;

		hipsModel[108].addShapeBox(19.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[108].setRotationPoint(0F, -29F, 0F);
		hipsModel[108].rotateAngleZ = -0.64577182F;

		hipsModel[109].addShapeBox(11.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F); // Box 42
		hipsModel[109].setRotationPoint(0F, -29F, 0F);
		hipsModel[109].rotateAngleZ = -0.64577182F;

		hipsModel[110].addShapeBox(11.5F, -18F, -2F, 2, 3, 1, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		hipsModel[110].setRotationPoint(0F, -29F, 0F);
		hipsModel[110].rotateAngleZ = -0.64577182F;

		hipsModel[111].addShapeBox(13.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[111].setRotationPoint(0F, -29F, 0F);
		hipsModel[111].rotateAngleZ = -0.64577182F;

		hipsModel[112].addShapeBox(13.5F, -19F, -2F, 2, 4, 1, 0F,0F, -1.5F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		hipsModel[112].setRotationPoint(0F, -29F, 0F);
		hipsModel[112].rotateAngleZ = -0.64577182F;

		hipsModel[113].addShapeBox(15.5F, -19F, -3F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		hipsModel[113].setRotationPoint(0F, -29F, 0F);
		hipsModel[113].rotateAngleZ = -0.64577182F;

		hipsModel[114].addShapeBox(15.5F, -15F, -3F, 2, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.7F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 47
		hipsModel[114].setRotationPoint(0F, -29F, 0F);
		hipsModel[114].rotateAngleZ = -0.64577182F;

		hipsModel[115].addShapeBox(17.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F); // Box 48
		hipsModel[115].setRotationPoint(0F, -29F, 0F);
		hipsModel[115].rotateAngleZ = -0.64577182F;

		hipsModel[116].addShapeBox(17.5F, -18F, -2F, 2, 3, 1, 0F,0F, -0.5F, 1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[116].setRotationPoint(0F, -29F, 0F);
		hipsModel[116].rotateAngleZ = -0.64577182F;

		hipsModel[117].addShapeBox(19.5F, -18F, -2F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 50
		hipsModel[117].setRotationPoint(0F, -29F, 0F);
		hipsModel[117].rotateAngleZ = -0.64577182F;

		hipsModel[118].addShapeBox(19.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 51
		hipsModel[118].setRotationPoint(0F, -29F, 0F);
		hipsModel[118].rotateAngleZ = -0.64577182F;

		hipsModel[119].addShapeBox(21.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[119].setRotationPoint(0F, -29F, 0F);
		hipsModel[119].rotateAngleZ = -0.64577182F;

		hipsModel[120].addShapeBox(21.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F); // Box 53
		hipsModel[120].setRotationPoint(0F, -29F, 0F);
		hipsModel[120].rotateAngleZ = -0.64577182F;

		hipsModel[121].addShapeBox(22.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F); // Box 54
		hipsModel[121].setRotationPoint(0F, -29F, 0F);
		hipsModel[121].rotateAngleZ = -0.64577182F;

		hipsModel[122].addShapeBox(22.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.8F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 55
		hipsModel[122].setRotationPoint(0F, -29F, 0F);
		hipsModel[122].rotateAngleZ = -0.64577182F;

		hipsModel[123].addShapeBox(23.7F, -15F, -1.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, -0.35F, -0.3F, -0.3F, 0.1F, -0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.7F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0.2F, -0.2F, 0F); // Box 56
		hipsModel[123].setRotationPoint(0F, -29F, 0F);
		hipsModel[123].rotateAngleZ = -0.64577182F;

		hipsModel[124].addShapeBox(23.7F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0F, -0.2F, 0F, 0.2F, 0.1F, 0.3F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F); // Box 57
		hipsModel[124].setRotationPoint(0F, -29F, 0F);
		hipsModel[124].rotateAngleZ = -0.64577182F;

		hipsModel[125].addShapeBox(10F, -1F, -4F, 2, 6, 2, 0F,0F, -3F, 0F, -1F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[125].setRotationPoint(0F, -29F, 0F);

		hipsModel[126].addShapeBox(8F, -2F, -4F, 2, 7, 2, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		hipsModel[126].setRotationPoint(0F, -29F, 0F);

		hipsModel[127].addShapeBox(4F, -1F, -4F, 4, 6, 2, 0F,0F, -2F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[127].setRotationPoint(0F, -29F, 0F);

		hipsModel[128].addShapeBox(0F, 0F, -5F, 4, 5, 3, 0F,0F, -2F, 1F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		hipsModel[128].setRotationPoint(0F, -29F, 0F);

		hipsModel[129].addShapeBox(-3F, 0F, -6F, 3, 5, 4, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[129].setRotationPoint(0F, -29F, 0F);

		hipsModel[130].addShapeBox(-6F, 0F, -6F, 3, 5, 4, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[130].setRotationPoint(0F, -29F, 0F);

		hipsModel[131].addShapeBox(-10F, 0F, -5F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[131].setRotationPoint(0F, -29F, 0F);

		hipsModel[132].addShapeBox(-13F, -1F, -4F, 3, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[132].setRotationPoint(0F, -29F, 0F);

		hipsModel[133].addShapeBox(-16F, 0F, -4F, 3, 5, 2, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[133].setRotationPoint(0F, -29F, 0F);

		hipsModel[134].addShapeBox(-18F, 0F, -4F, 2, 5, 2, 0F,-1F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 67
		hipsModel[134].setRotationPoint(0F, -29F, 0F);

		hipsModel[135].addShapeBox(10F, 5F, -4F, 2, 7, 2, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[135].setRotationPoint(0F, -29F, 0F);

		hipsModel[136].addShapeBox(8F, 5F, -4F, 2, 8, 2, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 69
		hipsModel[136].setRotationPoint(0F, -29F, 0F);

		hipsModel[137].addShapeBox(4F, 5F, -4F, 4, 8, 2, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[137].setRotationPoint(0F, -29F, 0F);

		hipsModel[138].addShapeBox(0F, 5F, -5F, 4, 8, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 71
		hipsModel[138].setRotationPoint(0F, -29F, 0F);

		hipsModel[139].addShapeBox(-3F, 5F, -6F, 3, 7, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F); // Box 72
		hipsModel[139].setRotationPoint(0F, -29F, 0F);

		hipsModel[140].addShapeBox(-6F, 5F, -6F, 3, 6, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[140].setRotationPoint(0F, -29F, 0F);

		hipsModel[141].addShapeBox(-10F, 5F, -5F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 74
		hipsModel[141].setRotationPoint(0F, -29F, 0F);

		hipsModel[142].addShapeBox(-13F, 5F, -4F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[142].setRotationPoint(0F, -29F, 0F);

		hipsModel[143].addShapeBox(-16F, 5F, -4F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[143].setRotationPoint(0F, -29F, 0F);

		hipsModel[144].addShapeBox(-18F, 5F, -4F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -4F, -0.7F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 77
		hipsModel[144].setRotationPoint(0F, -29F, 0F);

		hipsModel[145].addShapeBox(11F, -24F, 3F, 15, 15, 1, 0F,-6.5F, -6.5F, 0F, -6.5F, -7F, 1F, -6.5F, -7F, -1.97F, -6.5F, -6.5F, -0.95F, -6.5F, -6.5F, 0F, -6.5F, -6F, 1F, -6.5F, -6F, -1.65F, -6.5F, -6.5F, -0.95F); // Box 137
		hipsModel[145].setRotationPoint(0F, -29F, 0F);
		hipsModel[145].rotateAngleZ = -0.64577182F;

		hipsModel[146].addShapeBox(11F, -24F, -4F, 15, 15, 1, 0F,-6.5F, -6.5F, -0.95F, -6.5F, -7F, -1.97F, -6.5F, -7F, 1F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, -0.95F, -6.5F, -6F, -1.65F, -6.5F, -6F, 1F, -6.5F, -6.5F, 0F); // Box 138
		hipsModel[146].setRotationPoint(0F, -29F, 0F);
		hipsModel[146].rotateAngleZ = -0.64577182F;

		hipsModel[147].addShapeBox(4F, -3F, -2.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[147].setRotationPoint(0F, -29F, 1F);

		hipsModel[148].addShapeBox(-7F, -2F, -2.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[148].setRotationPoint(0F, -29F, 1F);

		hipsModel[149].addShapeBox(4F, -3F, 1.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[149].setRotationPoint(0F, -29F, 0F);

		hipsModel[150].addShapeBox(2F, -2F, -1.5F, 2, 4, 3, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[150].setRotationPoint(0F, -29F, 0F);

		hipsModel[151].addShapeBox(-4F, -2F, -1.5F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[151].setRotationPoint(0F, -29F, 0F);

		hipsModel[152].addShapeBox(-2F, -1.5F, -1.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[152].setRotationPoint(0F, -29F, 0F);

		hipsModel[153].addShapeBox(2F, -2F, 1.5F, 2, 4, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 9
		hipsModel[153].setRotationPoint(0F, -29F, 0F);

		hipsModel[154].addShapeBox(-2F, -1.5F, 1.5F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 10
		hipsModel[154].setRotationPoint(0F, -29F, 0F);

		hipsModel[155].addShapeBox(-4F, -2F, 1.5F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 11
		hipsModel[155].setRotationPoint(0F, -29F, 0F);

		hipsModel[156].addShapeBox(4F, -2.5F, 3.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[156].setRotationPoint(0F, -29F, 0F);

		hipsModel[157].addShapeBox(-6F, -1.5F, 3.5F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -.5F, -2F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 16
		hipsModel[157].setRotationPoint(0F, -29F, 0F);

		hipsModel[158].addShapeBox(-6F, -2F, 1.5F, 2, 3, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, .5F, -.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 17
		hipsModel[158].setRotationPoint(0F, -29F, 0F);

		hipsModel[159].addShapeBox(2F, -1.5F, 3F, 2, 4, 1, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2.5F, 0F, -.5F, 2.5F); // Box 18
		hipsModel[159].setRotationPoint(0F, -29F, 0F);

		hipsModel[160].addShapeBox(-2F, -1F, 3F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 19
		hipsModel[160].setRotationPoint(0F, -29F, 0F);

		hipsModel[161].addShapeBox(-4F, -1.5F, 3F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2.5F, 0F, -.5F, 2.5F); // Box 20
		hipsModel[161].setRotationPoint(0F, -29F, 0F);

		hipsModel[162].addShapeBox(-5F, 0.5F, 5.5F, 1, 2, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, .5F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, .5F, 0F, 1F, .5F); // Box 22
		hipsModel[162].setRotationPoint(0F, -29F, 0F);

		hipsModel[163].addShapeBox(4F, -0.5F, 5.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, .5F, 0F, 1F, .5F); // Box 23
		hipsModel[163].setRotationPoint(0F, -29F, 0F);

		hipsModel[164].addShapeBox(21F, -16F, -1.5F, 1, 1, 3, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F); // Box 27
		hipsModel[164].setRotationPoint(0F, -29F, 0F);
		hipsModel[164].rotateAngleZ = -0.64577182F;

		hipsModel[165].addShapeBox(21F, -17F, 0F, 1, 1, 1, 0F,0F, .4F, 0F, 0F, .2F, 0F, 0F, -.4F, .5F, 0F, -.2F, .7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F); // Box 28
		hipsModel[165].setRotationPoint(0F, -29F, 0F);
		hipsModel[165].rotateAngleZ = -0.64577182F;

		hipsModel[166].addShapeBox(21F, -15F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F); // Box 29
		hipsModel[166].setRotationPoint(0F, -29F, 0F);
		hipsModel[166].rotateAngleZ = -0.64577182F;

		hipsModel[167].addShapeBox(21F, -17F, -1F, 1, 1, 1, 0F,0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[167].setRotationPoint(0F, -29F, 0F);
		hipsModel[167].rotateAngleZ = -0.64577182F;

		hipsModel[168].addShapeBox(21F, -14.3F, -1F, 1, 1, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F); // Box 31
		hipsModel[168].setRotationPoint(0F, -29F, 0F);
		hipsModel[168].rotateAngleZ = -0.64577182F;

		hipsModel[169].addShapeBox(21F, -14.3F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0.7F); // Box 32
		hipsModel[169].setRotationPoint(0F, -29F, 0F);
		hipsModel[169].rotateAngleZ = -0.64577182F;

		hipsModel[170].addShapeBox(19.5F, -15.5F, -2F, 2, 1, 4, 0F,0F, 0F, .3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, .3F, 0F, -.5F, .4F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, .4F); // Box 40
		hipsModel[170].setRotationPoint(0F, -29F, 0F);
		hipsModel[170].rotateAngleZ = -0.64577182F;

		hipsModel[171].addShapeBox(17.5F, -15.5F, -3F, 2, 1, 6, 0F,0F, 0F, .2F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, .2F, 0F, -.5F, .4F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, .4F); // Box 45
		hipsModel[171].setRotationPoint(0F, -29F, 0F);
		hipsModel[171].rotateAngleZ = -0.64577182F;

		hipsModel[172].addShapeBox(15.5F, -15.5F, -3.5F, 2, 1, 7, 0F,0F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, 0F, -.5F, -.1F, 0F, -.5F, 0F); // Box 46
		hipsModel[172].setRotationPoint(0F, -29F, 0F);
		hipsModel[172].rotateAngleZ = -0.64577182F;

		hipsModel[173].addShapeBox(13.5F, -16F, -3.5F, 2, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F); // Box 47
		hipsModel[173].setRotationPoint(0F, -29F, 0F);
		hipsModel[173].rotateAngleZ = -0.64577182F;

		hipsModel[174].addShapeBox(11.5F, -16F, -2.5F, 2, 1, 5, 0F,.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -.5F, .6F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, .6F, -.5F, -.5F); // Box 48
		hipsModel[174].setRotationPoint(0F, -29F, 0F);
		hipsModel[174].rotateAngleZ = -0.64577182F;

		hipsModel[175].addShapeBox(14.5F, -18F, -3.5F, 1, 2, 7, 0F,-.5F, 0F, -.6F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, -.6F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.25F); // Box 49
		hipsModel[175].setRotationPoint(0F, -29F, 0F);
		hipsModel[175].rotateAngleZ = -0.64577182F;

		hipsModel[176].addShapeBox(14.5F, -19F, -3F, 1, 1, 6, 0F,-.5F, .1F, -2F, 0F, .1F, -2F, 0F, .1F, -2F, -.5F, .1F, -2F, -.5F, 0F, -.1F, 0F, 0F, .2F, 0F, 0F, .2F, -.5F, 0F, -.1F); // Box 54
		hipsModel[176].setRotationPoint(0F, -29F, 0F);
		hipsModel[176].rotateAngleZ = -0.64577182F;

		hipsModel[177].addShapeBox(-4F, 2F, 5F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F); // Box 55
		hipsModel[177].setRotationPoint(0F, -29F, 0F);

		hipsModel[178].addShapeBox(4F, -3F, -3.5F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		hipsModel[178].setRotationPoint(0F, -29F, 0F);

		hipsModel[179].addShapeBox(-6F, -2F, -3.5F, 2, 3, 2, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 60
		hipsModel[179].setRotationPoint(0F, -29F, 0F);

		hipsModel[180].addShapeBox(2F, -2F, -3.5F, 2, 4, 2, 0F,0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		hipsModel[180].setRotationPoint(0F, -29F, 0F);

		hipsModel[181].addShapeBox(-2F, -1.5F, -3.5F, 4, 3, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[181].setRotationPoint(0F, -29F, 0F);

		hipsModel[182].addShapeBox(-4F, -2F, -3.5F, 2, 4, 2, 0F,0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[182].setRotationPoint(0F, -29F, 0F);

		hipsModel[183].addShapeBox(2F, -1.5F, -4F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 64
		hipsModel[183].setRotationPoint(0F, -29F, 0F);

		hipsModel[184].addShapeBox(-2F, -1F, -4F, 4, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[184].setRotationPoint(0F, -29F, 0F);

		hipsModel[185].addShapeBox(-4F, -1.5F, -4F, 2, 4, 1, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		hipsModel[185].setRotationPoint(0F, -29F, 0F);

		hipsModel[186].addShapeBox(4F, -2.5F, -5.5F, 1, 7, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		hipsModel[186].setRotationPoint(0F, -29F, 0F);

		hipsModel[187].addShapeBox(-6F, -1.5F, -5.5F, 2, 6, 2, 0F,-0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 68
		hipsModel[187].setRotationPoint(0F, -29F, 0F);

		hipsModel[188].addShapeBox(-5F, 0.5F, -6.5F, 1, 2, 1, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 2F, 0F, 0.5F, 2F, 0F); // Box 69
		hipsModel[188].setRotationPoint(0F, -29F, 0F);

		hipsModel[189].addShapeBox(4F, -0.5F, -6.5F, 1, 3, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 70
		hipsModel[189].setRotationPoint(0F, -29F, 0F);

		hipsModel[190].addShapeBox(25F, 2.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F); // Box 75
		hipsModel[190].setRotationPoint(0F, -29F, 0F);

		hipsModel[191].addShapeBox(-4F, 2F, -7F, 8, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[191].setRotationPoint(0F, -29F, 0F);

		hipsModel[192].addShapeBox(25F, 3.5F, 1.5F, 1, 2, 1, 0F,0F, .5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, .5F, -.2F, 2F, -.5F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 2F, -.5F, 1F); // Box 77
		hipsModel[192].setRotationPoint(0F, -29F, 0F);

		hipsModel[193].addShapeBox(23F, 5.5F, 2.5F, 1, 3, 1, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 5F, -1F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, 2.5F, 5F, -1F, 2.5F); // Box 0
		hipsModel[193].setRotationPoint(0F, -29F, 0F);

		hipsModel[194].addShapeBox(13F, 7.5F, 5F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1
		hipsModel[194].setRotationPoint(0F, -29F, 0F);

		hipsModel[195].addShapeBox(8F, 6.5F, 6.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, .5F, 4F, -1F, .5F, 4F, -1F, -.5F, -5F, 0F, -.5F); // Box 2
		hipsModel[195].setRotationPoint(0F, -29F, 0F);

		hipsModel[196].addShapeBox(6F, 3.5F, 6.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 3
		hipsModel[196].setRotationPoint(0F, -29F, 0F);

		hipsModel[197].addShapeBox(6F, -0.5F, 6.5F, 1, 4, 1, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[197].setRotationPoint(0F, -29F, 0F);

		hipsModel[198].addShapeBox(6F, -3.5F, 6.5F, 1, 3, 1, 0F,0F, -.3F, 2F, 0F, -.3F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[198].setRotationPoint(0F, -29F, 0F);

		hipsModel[199].addShapeBox(6F, -5.5F, 4.5F, 1, 2, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[199].setRotationPoint(0F, -29F, 0F);

		hipsModel[200].addShapeBox(6F, -5.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		hipsModel[200].setRotationPoint(0F, -29F, 0F);

		hipsModel[201].addShapeBox(25F, 1.5F, 1.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[201].setRotationPoint(0F, -29F, 0F);

		hipsModel[202].addShapeBox(25F, 0.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 9
		hipsModel[202].setRotationPoint(0F, -29F, 0F);

		hipsModel[203].addShapeBox(25F, 0.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 10
		hipsModel[203].setRotationPoint(0F, -29F, 0F);

		hipsModel[204].addShapeBox(25F, 1.5F, -2.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[204].setRotationPoint(0F, -29F, 0F);

		hipsModel[205].addShapeBox(25F, 2.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F); // Box 12
		hipsModel[205].setRotationPoint(0F, -29F, 0F);

		hipsModel[206].addShapeBox(25F, 3.5F, -2.5F, 1, 2, 1, 0F,0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 2F, -0.5F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, -0.5F, -1F); // Box 13
		hipsModel[206].setRotationPoint(0F, -29F, 0F);

		hipsModel[207].addShapeBox(23F, 5.5F, -3.5F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 5F, -1F, 2.5F, -6F, 0F, 2.5F, -6F, 0F, -2.5F, 5F, -1F, -2.5F); // Box 14
		hipsModel[207].setRotationPoint(0F, -29F, 0F);

		hipsModel[208].addShapeBox(13F, 7.5F, -6F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 15
		hipsModel[208].setRotationPoint(0F, -29F, 0F);

		hipsModel[209].addShapeBox(8F, 6.5F, -7.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 4F, -1F, -0.5F, 4F, -1F, 0.5F, -5F, 0F, 0.5F); // Box 16
		hipsModel[209].setRotationPoint(0F, -29F, 0F);

		hipsModel[210].addShapeBox(6F, 3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 17
		hipsModel[210].setRotationPoint(0F, -29F, 0F);

		hipsModel[211].addShapeBox(6F, -0.5F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[211].setRotationPoint(0F, -29F, 0F);

		hipsModel[212].addShapeBox(6F, -3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 19
		hipsModel[212].setRotationPoint(0F, -29F, 0F);

		hipsModel[213].addShapeBox(6F, -5.5F, -5.5F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 20
		hipsModel[213].setRotationPoint(0F, -29F, 0F);

		hipsModel[214].addShapeBox(14.5F, -19F, 0F, 2, 1, 1, 0F,0F, .5F, 0F, 0F, .7F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[214].setRotationPoint(0F, -29F, 0F);
		hipsModel[214].rotateAngleZ = -0.64577182F;

		hipsModel[215].addShapeBox(-7F, 3.5F, 6F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[215].setRotationPoint(0F, -29F, 0F);

		hipsModel[216].addShapeBox(4F, 3.5F, 5F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, -.5F, 0F, -1F, -.5F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 3
		hipsModel[216].setRotationPoint(0F, -29F, 0F);

		hipsModel[217].addShapeBox(4F, 5.5F, 5F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, .5F); // Box 4
		hipsModel[217].setRotationPoint(0F, -29F, 0F);

		hipsModel[218].addShapeBox(-7F, 5.5F, 6F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 5
		hipsModel[218].setRotationPoint(0F, -29F, 0F);

		hipsModel[219].addShapeBox(-7F, 12.5F, 6.5F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[219].setRotationPoint(0F, -29F, 0F);

		hipsModel[220].addShapeBox(4F, 12.5F, 6.5F, 2, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 1F, .5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .5F, 0F, -1F, -.5F, 0F, 0F, 0F); // Box 7
		hipsModel[220].setRotationPoint(0F, -29F, 0F);

		hipsModel[221].addShapeBox(-9F, 12.5F, 6.5F, 2, 3, 1, 0F,0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F); // Box 8
		hipsModel[221].setRotationPoint(0F, -29F, 0F);

		hipsModel[222].addShapeBox(-9F, 5.5F, 5F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F); // Box 9
		hipsModel[222].setRotationPoint(0F, -29F, 0F);

		hipsModel[223].addShapeBox(-9F, 3.5F, 5F, 2, 2, 2, 0F,-1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 10
		hipsModel[223].setRotationPoint(0F, -29F, 0F);

		hipsModel[224].addShapeBox(-6F, 4.5F, 6.5F, 2, 1, 1, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 11
		hipsModel[224].setRotationPoint(0F, -29F, 0F);

		hipsModel[225].addShapeBox(-6F, 3.5F, 6.5F, 2, 1, 1, 0F,-.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 12
		hipsModel[225].setRotationPoint(0F, -29F, 0F);

		hipsModel[226].addShapeBox(-6F, 5.5F, 6.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F); // Box 14
		hipsModel[226].setRotationPoint(0F, -29F, 0F);

		hipsModel[227].addShapeBox(-5.2F, 3.8F, 6.5F, 1, 1, 1, 0F,-.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, -.15F, -.25F, -.6F, -.15F, -.25F, -.6F, 0F, -.25F, -.6F, 0F, -.25F, -.6F, 0F, -.25F, -.6F, 0F, -.25F); // Box 15
		hipsModel[227].setRotationPoint(0F, -29F, 0F);

		hipsModel[228].addShapeBox(-5.8F, 3.8F, 6.5F, 1, 1, 1, 0F,-.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, -.15F, -.25F, -.6F, -.15F, -.25F, -.6F, 0F, -.25F, -.6F, 0F, -.25F, -.6F, 0F, -.25F, -.6F, 0F, -.25F); // Box 16
		hipsModel[228].setRotationPoint(0F, -29F, 0F);

		hipsModel[229].addShapeBox(1F, 5.5F, 6.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F); // Box 21
		hipsModel[229].setRotationPoint(0F, -29F, 0F);

		hipsModel[230].addShapeBox(-4F, 3.5F, 6F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .3F, -2F, 0F, .3F); // Box 22
		hipsModel[230].setRotationPoint(0F, -29F, 0F);

		hipsModel[231].addShapeBox(-2F, 4.5F, 6F, 6, 1, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, .3F, 0F, 0F, .3F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, -1F, 0F, .5F); // Box 25
		hipsModel[231].setRotationPoint(0F, -29F, 0F);

		hipsModel[232].addShapeBox(13F, -6F, -1F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 27
		hipsModel[232].setRotationPoint(0F, -29F, 0F);

		hipsModel[233].addShapeBox(13F, -6F, 1F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F); // Box 28
		hipsModel[233].setRotationPoint(0F, -29F, 0F);

		hipsModel[234].addShapeBox(10F, -5F, -1F, 3, 1, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 29
		hipsModel[234].setRotationPoint(0F, -29F, 0F);

		hipsModel[235].addShapeBox(16F, -6F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 30
		hipsModel[235].setRotationPoint(0F, -29F, 0F);

		hipsModel[236].addShapeBox(16F, -6F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F); // Box 31
		hipsModel[236].setRotationPoint(0F, -29F, 0F);

		hipsModel[237].addShapeBox(10F, -5F, 1F, 3, 1, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, .5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -.7F, 4F, .5F); // Box 32
		hipsModel[237].setRotationPoint(0F, -29F, 0F);

		hipsModel[238].addShapeBox(10F, -3F, 3F, 3, 2, 2, 0F,0F, -1.5F, -.5F, 0F, 0F, 0F, 0F, -4F, -.5F, -1F, -5F, -.5F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 3F, -1.5F, -1F, 3F, -1.5F); // Box 33
		hipsModel[238].setRotationPoint(0F, -29F, 0F);

		hipsModel[239].addShapeBox(11F, 1F, 3F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 34
		hipsModel[239].setRotationPoint(0F, -29F, 0F);

		hipsModel[240].addShapeBox(13F, -4F, 3F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -5F, -.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 4F, -1.5F); // Box 35
		hipsModel[240].setRotationPoint(0F, -29F, 0F);

		hipsModel[241].addShapeBox(13F, 1F, 3F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 36
		hipsModel[241].setRotationPoint(0F, -29F, 0F);

		hipsModel[242].addShapeBox(16F, -4F, 3F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, .5F, 0F, 1.5F, -2.5F, -1.5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 1.5F, 1.5F, -2F, 0F, 2F, -2F); // Box 37
		hipsModel[242].setRotationPoint(0F, -29F, 0F);

		hipsModel[243].addShapeBox(16F, -1F, 3F, 2, 3, 1, 0F,0F, 0F, 0F, 1.5F, .5F, 0F, 1.5F, .5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, .5F, 0F, -1F, -.5F, 0F, 0F, 0F); // Box 38
		hipsModel[243].setRotationPoint(0F, -29F, 0F);

		hipsModel[244].addShapeBox(16F, 2F, 3F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, .5F, 0F, 1F, -.5F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -4F, .5F, -.5F, -3F, -2F, 0F, -1F, -3F); // Box 39
		hipsModel[244].setRotationPoint(0F, -29F, 0F);

		hipsModel[245].addShapeBox(13F, 3F, 3F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 2F, 0F, -3F, 2F, 0F, -2F, -3F, -1F, 0F, -3F); // Box 40
		hipsModel[245].setRotationPoint(0F, -29F, 0F);

		hipsModel[246].addShapeBox(14F, 5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[246].setRotationPoint(0F, -29F, 0F);

		hipsModel[247].addShapeBox(13F, 6F, -1F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		hipsModel[247].setRotationPoint(0F, -29F, 0F);

		hipsModel[248].addShapeBox(12F, 3F, 1F, 1, 3, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		hipsModel[248].setRotationPoint(0F, -29F, 0F);

		hipsModel[249].addShapeBox(11F, 3F, 4F, 2, 3, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F); // Box 44
		hipsModel[249].setRotationPoint(0F, -29F, 0F);

		hipsModel[250].addShapeBox(11F, 6F, 4F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, .5F); // Box 45
		hipsModel[250].setRotationPoint(0F, -29F, 0F);

		hipsModel[251].addShapeBox(8F, 2F, 4F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, 0F); // Box 46
		hipsModel[251].setRotationPoint(0F, -29F, 0F);

		hipsModel[252].addShapeBox(9F, -1F, 4F, 2, 3, 1, 0F,0F, 0F, 1F, -1F, .5F, 1.5F, -1F, .5F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, 0F); // Box 47
		hipsModel[252].setRotationPoint(0F, -29F, 0F);

		hipsModel[253].addShapeBox(7F, 6F, 4F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F, 0F); // Box 48
		hipsModel[253].setRotationPoint(0F, -29F, 0F);

		hipsModel[254].addShapeBox(7F, 11F, 4F, 4, 3, 2, 0F,1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 1F, 0F, -1F, 1F, -0.5F, 0F, 0F, 0F); // Box 49
		hipsModel[254].setRotationPoint(0F, -29F, 0F);

		hipsModel[255].addShapeBox(11F, 11F, 4F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, .5F, 1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 1F, 0F, .5F); // Box 50
		hipsModel[255].setRotationPoint(0F, -29F, 0F);

		hipsModel[256].addShapeBox(12F, 6F, 1F, 1, 5, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[256].setRotationPoint(0F, -29F, 0F);

		hipsModel[257].addShapeBox(12F, 11F, 1F, 1, 2, 3, 0F,-1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[257].setRotationPoint(0F, -29F, 0F);

		hipsModel[258].addShapeBox(13.5F, 11F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 53
		hipsModel[258].setRotationPoint(0F, -29F, 0F);

		hipsModel[259].addShapeBox(11F, 15F, 4F, 2, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 1F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, .5F, 1F, 0F, -1F, 0F, 0F, -.5F); // Box 54
		hipsModel[259].setRotationPoint(0F, -29F, 0F);

		hipsModel[260].addShapeBox(11F, 17F, 4F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -.5F, -3F, 0F, 1F, 1F, -1F, 1F, 1F, -1F, -1.5F, -3F, 0F, -1.5F); // Box 55
		hipsModel[260].setRotationPoint(0F, -29F, 0F);

		hipsModel[261].addShapeBox(25F, 3.5F, 1.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 56
		hipsModel[261].setRotationPoint(0F, -29F, 0F);

		hipsModel[262].addShapeBox(25F, 6.5F, 1.5F, 1, 2, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[262].setRotationPoint(0F, -29F, 0F);

		hipsModel[263].addShapeBox(24.5F, 8.5F, 1F, 2, 5, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, .5F, -.5F, -.5F, .5F, -.5F, -.5F, 0F, -.5F); // Box 59
		hipsModel[263].setRotationPoint(0F, -29F, 0F);

		hipsModel[264].addShapeBox(-13F, -2F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[264].setRotationPoint(0F, -29F, 0F);

		hipsModel[265].addShapeBox(20F, -8F, -1F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 61
		hipsModel[265].setRotationPoint(0F, -29F, 0F);
		hipsModel[265].rotateAngleX = -0.34906585F;
		hipsModel[265].rotateAngleY = 0.03490659F;

		hipsModel[266].addShapeBox(20F, -8F, -2F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[266].setRotationPoint(0F, -29F, 0F);
		hipsModel[266].rotateAngleX = -0.34906585F;
		hipsModel[266].rotateAngleY = 0.03490659F;

		hipsModel[267].addShapeBox(20F, -8.5F, -0.5F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 63
		hipsModel[267].setRotationPoint(0F, -29F, 0F);
		hipsModel[267].rotateAngleX = 0.34906585F;
		hipsModel[267].rotateAngleY = 0.03490659F;

		hipsModel[268].addShapeBox(20F, -8.5F, -1.5F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[268].setRotationPoint(0F, -29F, 0F);
		hipsModel[268].rotateAngleX = 0.34906585F;
		hipsModel[268].rotateAngleY = 0.03490659F;

		hipsModel[269].addShapeBox(-10F, -2F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 67
		hipsModel[269].setRotationPoint(0F, -29F, 0F);

		hipsModel[270].addShapeBox(-17F, -2F, -1F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F); // Box 68
		hipsModel[270].setRotationPoint(0F, -29F, 0F);

		hipsModel[271].addShapeBox(-17F, -2F, 1F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 3F, 0F); // Box 69
		hipsModel[271].setRotationPoint(0F, -29F, 0F);

		hipsModel[272].addShapeBox(-13F, -2F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 70
		hipsModel[272].setRotationPoint(0F, -29F, 0F);

		hipsModel[273].addShapeBox(-10F, -2F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 71
		hipsModel[273].setRotationPoint(0F, -29F, 0F);

		hipsModel[274].addShapeBox(-13F, -1F, 3F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, .5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, .5F, 0F, 2F, 0F); // Box 72
		hipsModel[274].setRotationPoint(0F, -29F, 0F);

		hipsModel[275].addShapeBox(-17F, -1F, 3F, 4, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 4F, -.5F); // Box 73
		hipsModel[275].setRotationPoint(0F, -29F, 0F);

		hipsModel[276].addShapeBox(-10F, -1F, 3F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 1F, 0F, -2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0F, 2F, .5F); // Box 74
		hipsModel[276].setRotationPoint(0F, -29F, 0F);

		hipsModel[277].addShapeBox(-10F, 1F, 5.5F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, .5F, 0F, -3F, .5F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[277].setRotationPoint(0F, -29F, 0F);

		hipsModel[278].addShapeBox(-13F, 1F, 5.5F, 3, 4, 1, 0F,0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 76
		hipsModel[278].setRotationPoint(0F, -29F, 0F);

		hipsModel[279].addShapeBox(-17F, 1F, 5F, 4, 4, 1, 0F,1F, -3F, .5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[279].setRotationPoint(0F, -29F, 0F);

		hipsModel[280].addShapeBox(-10F, 5F, 5.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 78
		hipsModel[280].setRotationPoint(0F, -29F, 0F);

		hipsModel[281].addShapeBox(-13F, 5F, 5.5F, 3, 8, 1, 0F,0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		hipsModel[281].setRotationPoint(0F, -29F, 0F);

		hipsModel[282].addShapeBox(-17F, 5F, 5F, 4, 8, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 80
		hipsModel[282].setRotationPoint(0F, -29F, 0F);

		hipsModel[283].addShapeBox(-13F, 13F, 5.5F, 3, 3, 1, 0F,0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 81
		hipsModel[283].setRotationPoint(0F, -29F, 0F);

		hipsModel[284].addShapeBox(-16F, 13F, 5F, 3, 3, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		hipsModel[284].setRotationPoint(0F, -29F, 0F);

		hipsModel[285].addShapeBox(-21F, 0F, -1F, 1, 2, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		hipsModel[285].setRotationPoint(0F, -29F, 0F);

		hipsModel[286].addShapeBox(-23F, 2F, -1F, 1, 3, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		hipsModel[286].setRotationPoint(0F, -29F, 0F);

		hipsModel[287].addShapeBox(-24F, 5F, -1F, 1, 4, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[287].setRotationPoint(0F, -29F, 0F);

		hipsModel[288].addShapeBox(-24F, 9F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 86
		hipsModel[288].setRotationPoint(0F, -29F, 0F);

		hipsModel[289].addShapeBox(-24F, 9F, 1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, .5F, 0F); // Box 87
		hipsModel[289].setRotationPoint(0F, -29F, 0F);

		hipsModel[290].addShapeBox(-24F, 5F, 1F, 1, 4, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 88
		hipsModel[290].setRotationPoint(0F, -29F, 0F);

		hipsModel[291].addShapeBox(-23F, 2F, 1F, 1, 3, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 89
		hipsModel[291].setRotationPoint(0F, -29F, 0F);

		hipsModel[292].addShapeBox(-21F, 0F, 1F, 1, 2, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 3F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 90
		hipsModel[292].setRotationPoint(0F, -29F, 0F);

		hipsModel[293].addShapeBox(-20F, 1F, 3F, 2, 1, 1, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 91
		hipsModel[293].setRotationPoint(0F, -29F, 0F);

		hipsModel[294].addShapeBox(-20F, 2F, 3F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 92
		hipsModel[294].setRotationPoint(0F, -29F, 0F);

		hipsModel[295].addShapeBox(-22F, 5F, 3F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 93
		hipsModel[295].setRotationPoint(0F, -29F, 0F);

		hipsModel[296].addShapeBox(-23F, 9F, 3F, 4, 4, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, .5F, .5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F); // Box 94
		hipsModel[296].setRotationPoint(0F, -29F, 0F);

		hipsModel[297].addShapeBox(16.5F, -19.5F, 0F, 3, 2, 1, 0F,0F, .2F, 0F, 0F, -.1F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		hipsModel[297].setRotationPoint(0F, -29F, 0F);
		hipsModel[297].rotateAngleZ = -0.64577182F;

		hipsModel[298].addShapeBox(19.5F, -19F, 0F, 1, 2, 1, 0F,0F, 0.4F, 0F, .5F, -1F, 0F, 0F, -1F, -.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 108
		hipsModel[298].setRotationPoint(0F, -29F, 0F);
		hipsModel[298].rotateAngleZ = -0.64577182F;

		hipsModel[299].addShapeBox(16.5F, -19.5F, 1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -.3F, 0F, 0F, -1F, -.5F, 0F, -.5F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 1F); // Box 109
		hipsModel[299].setRotationPoint(0F, -29F, 0F);
		hipsModel[299].rotateAngleZ = -0.64577182F;

		hipsModel[300].addShapeBox(14.5F, -19F, 1F, 2, 1, 1, 0F,0F, .3F, 0F, 0F, .5F, 0F, 0F, 0F, .3F, -.5F, -.1F, 0F, 1F, -.5F, 0F, 0F, 0F, 0F, 0F, .3F, 1F, 0F, 0F, 1F); // Box 110
		hipsModel[300].setRotationPoint(0F, -29F, 0F);
		hipsModel[300].rotateAngleZ = -0.64577182F;

		hipsModel[301].addShapeBox(19.5F, -19F, 0.5F, 1, 2, 1, 0F,0F, 0.2F, -.5F, 0F, -1F, 0F, 0F, -1.3F, -.5F, 0F, -.5F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, -.3F, .5F); // Box 111
		hipsModel[301].setRotationPoint(0F, -29F, 0F);
		hipsModel[301].rotateAngleZ = -0.64577182F;

		hipsModel[302].addShapeBox(20.5F, -18F, -0.5F, 2, 2, 1, 0F,-.5F, 0F, -.5F, 0F, -.4F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 112
		hipsModel[302].setRotationPoint(0F, -29F, 0F);
		hipsModel[302].rotateAngleZ = -0.64577182F;

		hipsModel[303].addShapeBox(20.5F, -18F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.7F, -.5F, 0F, -.3F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -1F, -.1F); // Box 113
		hipsModel[303].setRotationPoint(0F, -29F, 0F);
		hipsModel[303].rotateAngleZ = -0.64577182F;

		hipsModel[304].addShapeBox(13.5F, -19F, 0F, 1, 1, 1, 0F,0F, 0.7F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, -.5F, 0F, 0F, -.35F, 0F, 0F, -.35F, 0F, 0F, -.5F, 0F); // Box 115
		hipsModel[304].setRotationPoint(0F, -29F, 0F);
		hipsModel[304].rotateAngleZ = -0.64577182F;

		hipsModel[305].addShapeBox(22.5F, -18F, -0.5F, 1, 2, 1, 0F,0F, -0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 118
		hipsModel[305].setRotationPoint(0F, -29F, 0F);
		hipsModel[305].rotateAngleZ = -0.64577182F;

		hipsModel[306].addShapeBox(22.5F, -18F, 0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -.5F, -0.1F, 0F, -0.4F, 0F); // Box 119
		hipsModel[306].setRotationPoint(0F, -29F, 0F);
		hipsModel[306].rotateAngleZ = -0.64577182F;

		hipsModel[307].addShapeBox(23.5F, -18F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, -.3F, -0.7F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.5F, 0F, .7F, -0.5F, 0F, .3F, -0.4F, 0F, 0F, -0.5F, -0.1F); // Box 122
		hipsModel[307].setRotationPoint(0F, -29F, 0F);
		hipsModel[307].rotateAngleZ = -0.64577182F;

		hipsModel[308].addShapeBox(23.5F, -18F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, .7F, -0.5F, 0F, .7F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 123
		hipsModel[308].setRotationPoint(0F, -29F, 0F);
		hipsModel[308].rotateAngleZ = -0.64577182F;

		hipsModel[309].addShapeBox(23.5F, -18F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[309].setRotationPoint(0F, -29F, 0F);
		hipsModel[309].rotateAngleZ = -0.64577182F;

		hipsModel[310].addShapeBox(24.5F, -18F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.6F, -.2F, -.2F, -.6F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F); // Box 1
		hipsModel[310].setRotationPoint(0F, -29F, 0F);
		hipsModel[310].rotateAngleZ = -0.64577182F;

		hipsModel[311].addShapeBox(23.7F, -17.9F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.4F, 0F, -.2F, -.5F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Box 2
		hipsModel[311].setRotationPoint(0F, -29F, 0F);
		hipsModel[311].rotateAngleZ = -0.64577182F;

		hipsModel[312].addShapeBox(24.5F, -16.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[312].setRotationPoint(0F, -29F, 0F);
		hipsModel[312].rotateAngleZ = -0.64577182F;

		hipsModel[313].addShapeBox(24.5F, -16.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.3F, .5F, 0F, -.3F, 0F, 0F, 0F, -.2F, 0F, 0F, -.8F, 0F, 0F, .3F, 0F, 0F); // Box 4
		hipsModel[313].setRotationPoint(0F, -29F, 0F);
		hipsModel[313].rotateAngleZ = -0.64577182F;

		hipsModel[314].addShapeBox(22.5F, -16.5F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.8F, -1.4F, -.5F, -.8F, -1.4F, -.5F, -.8F, .5F, -.5F, -.8F, .5F); // Box 5
		hipsModel[314].setRotationPoint(0F, -29F, 0F);
		hipsModel[314].rotateAngleZ = -0.64577182F;

		hipsModel[315].addShapeBox(18.5F, -19.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.5F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, .1F); // Box 7
		hipsModel[315].setRotationPoint(0F, -29F, 0F);
		hipsModel[315].rotateAngleZ = -0.64577182F;

		hipsModel[316].addShapeBox(17.5F, -19.5F, 1.5F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.3F, 0.3F, 0F, .3F); // Box 8
		hipsModel[316].setRotationPoint(0F, -29F, 0F);
		hipsModel[316].rotateAngleZ = -0.64577182F;

		hipsModel[317].addShapeBox(18.5F, -18.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -.3F, 0.5F); // Box 9
		hipsModel[317].setRotationPoint(0F, -29F, 0F);
		hipsModel[317].rotateAngleZ = -0.64577182F;

		hipsModel[318].addShapeBox(17.5F, -18.5F, 1.5F, 1, 1, 1, 0F,0.3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.4F, 0.3F, 0F, 0.3F, 0F, -0.3F, 0F, 0F, 0F, 0.5F, 0F, -.3F, 0F, 0F, -0.5F, .5F); // Box 10
		hipsModel[318].setRotationPoint(0F, -29F, 0F);
		hipsModel[318].rotateAngleZ = -0.64577182F;

		hipsModel[319].addShapeBox(18.5F, -19F, 1.5F, 1, 1, 1, 0F,0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 11
		hipsModel[319].setRotationPoint(0F, -29F, 0F);
		hipsModel[319].rotateAngleZ = -0.64577182F;

		hipsModel[320].addShapeBox(17.5F, -19F, 2F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F); // Box 12
		hipsModel[320].setRotationPoint(0F, -29F, 0F);
		hipsModel[320].rotateAngleZ = -0.64577182F;

		hipsModel[321].addShapeBox(16.5F, -21F, 1.5F, 1, 3, 1, 0F,.5F, -.5F, -1F, -1F, 0F, -0.8F, -1F, 0.3F, .5F, .5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 13
		hipsModel[321].setRotationPoint(0F, -29F, 0F);
		hipsModel[321].rotateAngleZ = -0.64577182F;

		hipsModel[322].addShapeBox(17.5F, -21F, 0.5F, 1, 2, 1, 0F,-1.5F, .4F, -.6F, 1F, 0F, -.6F, 1F, 0F, .2F, -1.5F, .4F, .2F, -.2F, -.5F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.2F); // Box 14
		hipsModel[322].setRotationPoint(0F, -29F, 0F);
		hipsModel[322].rotateAngleZ = -0.64577182F;

		hipsModel[323].addShapeBox(17.3F, -20F, 0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 15
		hipsModel[323].setRotationPoint(0F, -29F, 0F);
		hipsModel[323].rotateAngleZ = -0.64577182F;

		hipsModel[324].addShapeBox(17.3F, -25F, 0.5F, 1, 2, 1, 0F,1.3F, 0F, -.7F, -2F, 0F, -.7F, -2F, 0F, 0F,  1.3F, 0F, 0F,  .5F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F,  .5F, 0F, -.3F); // Box 17
		hipsModel[324].setRotationPoint(0F, -29F, 0F);
		hipsModel[324].rotateAngleZ = -0.64577182F;

		hipsModel[325].addShapeBox(22.5F, -18F, -0.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		hipsModel[325].setRotationPoint(0F, -29F, 0F);
		hipsModel[325].rotateAngleZ = -0.64577182F;

		hipsModel[326].addShapeBox(20.5F, -18F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 1
		hipsModel[326].setRotationPoint(0F, -29F, 0F);
		hipsModel[326].rotateAngleZ = -0.64577182F;

		hipsModel[327].addShapeBox(19.5F, -19F, -1F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, -1F, -0.5F, 0.5F, -1F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[327].setRotationPoint(0F, -29F, 0F);
		hipsModel[327].rotateAngleZ = -0.64577182F;

		hipsModel[328].addShapeBox(13.5F, -19F, -1F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.5F, 0F); // Box 3
		hipsModel[328].setRotationPoint(0F, -29F, 0F);
		hipsModel[328].rotateAngleZ = -0.64577182F;

		hipsModel[329].addShapeBox(14.5F, -19F, -1F, 2, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[329].setRotationPoint(0F, -29F, 0F);
		hipsModel[329].rotateAngleZ = -0.64577182F;

		hipsModel[330].addShapeBox(16.5F, -19.5F, -1F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[330].setRotationPoint(0F, -29F, 0F);
		hipsModel[330].rotateAngleZ = -0.64577182F;

		hipsModel[331].addShapeBox(23.7F, -17.9F, -1.5F, 1, 1, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[331].setRotationPoint(0F, -29F, 0F);
		hipsModel[331].rotateAngleZ = -0.64577182F;

		hipsModel[332].addShapeBox(20.5F, -18F, -1.5F, 2, 2, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.1F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		hipsModel[332].setRotationPoint(0F, -29F, 0F);
		hipsModel[332].rotateAngleZ = -0.64577182F;

		hipsModel[333].addShapeBox(19.5F, -19F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -1.3F, -0.5F, 0F, -1F, 0F, 0F, 0.2F, -0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 12
		hipsModel[333].setRotationPoint(0F, -29F, 0F);
		hipsModel[333].rotateAngleZ = -0.64577182F;

		hipsModel[334].addShapeBox(16.5F, -19.5F, -2F, 3, 2, 1, 0F,0F, -0.5F, 0.3F, 0F, -1F, -0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.2F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[334].setRotationPoint(0F, -29F, 0F);
		hipsModel[334].rotateAngleZ = -0.64577182F;

		hipsModel[335].addShapeBox(14.5F, -19F, -2F, 2, 1, 1, 0F,-0.5F, -0.1F, 0F, 0F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0.3F, 1F, 0F, 0F, 0F, 1F, -0.5F, 0F); // Box 14
		hipsModel[335].setRotationPoint(0F, -29F, 0F);
		hipsModel[335].rotateAngleZ = -0.64577182F;

		hipsModel[336].addShapeBox(22.5F, -18F, -1.5F, 1, 2, 1, 0F,0F, -0.7F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, -0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		hipsModel[336].setRotationPoint(0F, -29F, 0F);
		hipsModel[336].rotateAngleZ = -0.64577182F;

		hipsModel[337].addShapeBox(23.5F, -18F, -1.5F, 1, 2, 1, 0F,0F, -0.3F, -0.5F, -0.3F, -0.7F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.1F, 0.3F, -0.4F, 0F, 0.7F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 16
		hipsModel[337].setRotationPoint(0F, -29F, 0F);
		hipsModel[337].rotateAngleZ = -0.64577182F;

		hipsModel[338].addShapeBox(17.5F, -21F, -1.5F, 1, 2, 1, 0F,-1.5F, 0.4F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, -0.6F, -1.5F, 0.4F, -0.6F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 17
		hipsModel[338].setRotationPoint(0F, -29F, 0F);
		hipsModel[338].rotateAngleZ = -0.64577182F;

		hipsModel[339].addShapeBox(17.3F, -20F, -1.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 18
		hipsModel[339].setRotationPoint(0F, -29F, 0F);
		hipsModel[339].rotateAngleZ = -0.64577182F;

		hipsModel[340].addShapeBox(17.3F, -23F, -1.5F, 1, 3, 1, 0F,.5F, 0F, -.3F, -1F, 0F, -.3F, -1F, 0F, -.3F, .5F, 0F, -.3F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 19
		hipsModel[340].setRotationPoint(0F, -29F, 0F);
		hipsModel[340].rotateAngleZ = -0.64577182F;

		hipsModel[341].addShapeBox(17.3F, -25F, -1.5F, 1, 2, 1, 0F,1.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.7F, 1.3F, 0F, -0.7F, 0.5F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F); // Box 20
		hipsModel[341].setRotationPoint(0F, -29F, 0F);
		hipsModel[341].rotateAngleZ = -0.64577182F;

		hipsModel[342].addShapeBox(17.3F, -23F, 0.5F, 1, 3, 1, 0F,0.5F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 21
		hipsModel[342].setRotationPoint(0F, -29F, 0F);
		hipsModel[342].rotateAngleZ = -0.64577182F;

		hipsModel[343].addShapeBox(16.5F, -21F, -2.5F, 1, 3, 1, 0F,0.5F, -0.5F, 0F, -1F, 0.3F, 0.5F, -1F, 0F, -0.8F, 0.5F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		hipsModel[343].setRotationPoint(0F, -29F, 0F);
		hipsModel[343].rotateAngleZ = -0.64577182F;

		hipsModel[344].addShapeBox(17.5F, -18.5F, -2.5F, 1, 1, 1, 0F,0.3F, 0F, 0.3F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0.3F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.3F, 0F, 0F, 0F, 0.5F, 0F, -0.3F, 0F); // Box 23
		hipsModel[344].setRotationPoint(0F, -29F, 0F);
		hipsModel[344].rotateAngleZ = -0.64577182F;

		hipsModel[345].addShapeBox(18.5F, -18.5F, -2F, 1, 1, 1, 0F,0F, 0F, 0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[345].setRotationPoint(0F, -29F, 0F);
		hipsModel[345].rotateAngleZ = -0.64577182F;

		hipsModel[346].addShapeBox(17.5F, -19.5F, -2.5F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, 0F, -0.3F, 0F, 0.3F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 0.3F, 0F, 0F); // Box 25
		hipsModel[346].setRotationPoint(0F, -29F, 0F);
		hipsModel[346].rotateAngleZ = -0.64577182F;

		hipsModel[347].addShapeBox(18.5F, -19.5F, -2F, 1, 1, 1, 0F,0F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[347].setRotationPoint(0F, -29F, 0F);
		hipsModel[347].rotateAngleZ = -0.64577182F;

		hipsModel[348].addShapeBox(18.5F, -19F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F); // Box 27
		hipsModel[348].setRotationPoint(0F, -29F, 0F);
		hipsModel[348].rotateAngleZ = -0.64577182F;

		hipsModel[349].addShapeBox(17.5F, -19F, -3F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 28
		hipsModel[349].setRotationPoint(0F, -29F, 0F);
		hipsModel[349].rotateAngleZ = -0.64577182F;

		hipsModel[350].addShapeBox(22.5F, -16.5F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, 0.5F, -0.5F, -0.8F, -1.4F, -0.5F, -0.8F, -1.4F); // Box 29
		hipsModel[350].setRotationPoint(0F, -29F, 0F);
		hipsModel[350].rotateAngleZ = -0.64577182F;

		hipsModel[351].addShapeBox(24.5F, -16.5F, -1.5F, 1, 1, 1, 0F,0.5F, 0F, -0.3F, -1F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[351].setRotationPoint(0F, -29F, 0F);
		hipsModel[351].rotateAngleZ = -0.64577182F;

		hipsModel[352].addShapeBox(25F, 3.5F, -2.5F, 1, 3, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Box 31
		hipsModel[352].setRotationPoint(0F, -29F, 0F);

		hipsModel[353].addShapeBox(25F, 6.5F, -2.5F, 1, 2, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[353].setRotationPoint(0F, -29F, 0F);

		hipsModel[354].addShapeBox(24.5F, 8.5F, -3F, 2, 5, 2, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, .5F, -.5F, -.5F, .5F, -.5F, -.5F, 0F, -.5F); // Box 33
		hipsModel[354].setRotationPoint(0F, -29F, 0F);

		hipsModel[355].addShapeBox(16F, 2F, -4F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, -1F, -3F, -0.5F, -3F, -2F, 0F, -4F, 0.5F, 0F, -2F, 2F); // Box 34
		hipsModel[355].setRotationPoint(0F, -29F, 0F);

		hipsModel[356].addShapeBox(13F, 3F, -4F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, -2F, -3F, 0F, -3F, 2F, -1F, -1F, 2F); // Box 35
		hipsModel[356].setRotationPoint(0F, -29F, 0F);

		hipsModel[357].addShapeBox(13F, 1F, -5F, 3, 2, 2, 0F,0F, 0F, -0.5F, 0F, 2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 36
		hipsModel[357].setRotationPoint(0F, -29F, 0F);

		hipsModel[358].addShapeBox(16F, -1F, -4F, 2, 3, 1, 0F,0F, 0F, 0F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F); // Box 37
		hipsModel[358].setRotationPoint(0F, -29F, 0F);

		hipsModel[359].addShapeBox(16F, -4F, -5F, 2, 1, 2, 0F,0F, -3F, -1F, 1.5F, -2.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 1.5F, 1.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 38
		hipsModel[359].setRotationPoint(0F, -29F, 0F);

		hipsModel[360].addShapeBox(13F, -4F, -5F, 3, 1, 2, 0F,0F, -5F, -0.5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 4F, -1.5F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 39
		hipsModel[360].setRotationPoint(0F, -29F, 0F);

		hipsModel[361].addShapeBox(10F, -3F, -5F, 3, 2, 2, 0F,-1F, -5F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, -1F, 3F, -1.5F, 0F, 3F, -1.5F, 0F, 0F, 0F, -1F, 1.5F, 0F); // Box 40
		hipsModel[361].setRotationPoint(0F, -29F, 0F);

		hipsModel[362].addShapeBox(11F, 1F, -5F, 2, 2, 2, 0F,0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 41
		hipsModel[362].setRotationPoint(0F, -29F, 0F);

		hipsModel[363].addShapeBox(10F, -5F, -3F, 3, 1, 2, 0F,0F, -3.5F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.7F, 4F, 0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 42
		hipsModel[363].setRotationPoint(0F, -29F, 0F);

		hipsModel[364].addShapeBox(13F, -6F, -3F, 3, 1, 2, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 43
		hipsModel[364].setRotationPoint(0F, -29F, 0F);

		hipsModel[365].addShapeBox(16F, -6F, -3F, 2, 1, 2, 0F,0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[365].setRotationPoint(0F, -29F, 0F);

		hipsModel[366].addShapeBox(13.5F, 11F, -1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 45
		hipsModel[366].setRotationPoint(0F, -29F, 0F);

		hipsModel[367].addShapeBox(12F, 3F, -4F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		hipsModel[367].setRotationPoint(0F, -29F, 0F);

		hipsModel[368].addShapeBox(11F, 3F, -5F, 2, 3, 1, 0F,0F, 1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		hipsModel[368].setRotationPoint(0F, -29F, 0F);

		hipsModel[369].addShapeBox(9F, -1F, -5F, 2, 3, 1, 0F,0F, 0F, -1.5F, -1F, 0.5F, -1.5F, -1F, 0.5F, 1.5F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 48
		hipsModel[369].setRotationPoint(0F, -29F, 0F);

		hipsModel[370].addShapeBox(8F, 2F, -6F, 3, 4, 2, 0F,0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 49
		hipsModel[370].setRotationPoint(0F, -29F, 0F);

		hipsModel[371].addShapeBox(7F, 6F, -6F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 50
		hipsModel[371].setRotationPoint(0F, -29F, 0F);

		hipsModel[372].addShapeBox(11F, 6F, -5F, 2, 5, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[372].setRotationPoint(0F, -29F, 0F);

		hipsModel[373].addShapeBox(12F, 6F, -4F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F); // Box 52
		hipsModel[373].setRotationPoint(0F, -29F, 0F);

		hipsModel[374].addShapeBox(12F, 11F, -4F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -2F, 0F, -1F, -2F, 0F); // Box 53
		hipsModel[374].setRotationPoint(0F, -29F, 0F);

		hipsModel[375].addShapeBox(7F, 11F, -6F, 4, 3, 2, 0F,1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, -0.5F, -1F, 1F, 0F, 0F, 0F, -1F); // Box 54
		hipsModel[375].setRotationPoint(0F, -29F, 0F);

		hipsModel[376].addShapeBox(11F, 11F, -5F, 2, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 55
		hipsModel[376].setRotationPoint(0F, -29F, 0F);

		hipsModel[377].addShapeBox(11F, 15F, -5F, 2, 2, 1, 0F,1F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -1F, 1F, 0F, 0.5F, 0F, 0F, 0F); // Box 56
		hipsModel[377].setRotationPoint(0F, -29F, 0F);

		hipsModel[378].addShapeBox(11F, 17F, -5F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -3F, 0F, -1.5F, 1F, -1F, -1.5F, 1F, -1F, 1F, -3F, 0F, 1F); // Box 57
		hipsModel[378].setRotationPoint(0F, -29F, 0F);

		hipsModel[379].addShapeBox(4F, 12.5F, -7.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F); // Box 58
		hipsModel[379].setRotationPoint(0F, -29F, 0F);

		hipsModel[380].addShapeBox(4F, 5.5F, -7F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -1.5F); // Box 59
		hipsModel[380].setRotationPoint(0F, -29F, 0F);

		hipsModel[381].addShapeBox(4F, 3.5F, -7F, 2, 2, 2, 0F,0F, 0F, -0.5F, -1F, -0.5F, -1F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[381].setRotationPoint(0F, -29F, 0F);

		hipsModel[382].addShapeBox(1F, 5.5F, -7.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F); // Box 61
		hipsModel[382].setRotationPoint(0F, -29F, 0F);

		hipsModel[383].addShapeBox(-2F, 4.5F, -7F, 6, 1, 1, 0F,0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -1F, 0F, 0F); // Box 62
		hipsModel[383].setRotationPoint(0F, -29F, 0F);

		hipsModel[384].addShapeBox(-4F, 3.5F, -7F, 9, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -2F, 0F, 0F); // Box 63
		hipsModel[384].setRotationPoint(0F, -29F, 0F);

		hipsModel[385].addShapeBox(-7F, 3.5F, -7F, 11, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[385].setRotationPoint(0F, -29F, 0F);

		hipsModel[386].addShapeBox(-9F, 3.5F, -7F, 2, 2, 2, 0F,-1F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[386].setRotationPoint(0F, -29F, 0F);

		hipsModel[387].addShapeBox(-6F, 5.5F, -7.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F); // Box 66
		hipsModel[387].setRotationPoint(0F, -29F, 0F);

		hipsModel[388].addShapeBox(-6F, 4.5F, -7.5F, 2, 1, 1, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 67
		hipsModel[388].setRotationPoint(0F, -29F, 0F);

		hipsModel[389].addShapeBox(-5.2F, 3.8F, -7.5F, 1, 1, 1, 0F,-0.6F, -0.15F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F); // Box 68
		hipsModel[389].setRotationPoint(0F, -29F, 0F);

		hipsModel[390].addShapeBox(-9F, 5.5F, -7F, 2, 7, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0.5F, 0F, -0.5F); // Box 69
		hipsModel[390].setRotationPoint(0F, -29F, 0F);

		hipsModel[391].addShapeBox(-5.8F, 3.8F, -7.5F, 1, 1, 1, 0F,-0.6F, -0.15F, -0.25F, -0.6F, -0.15F, -0.25F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F, -0.6F, 0F, -0.25F); // Box 70
		hipsModel[391].setRotationPoint(0F, -29F, 0F);

		hipsModel[392].addShapeBox(-6F, 3.5F, -7.5F, 2, 1, 1, 0F,-.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 71
		hipsModel[392].setRotationPoint(0F, -29F, 0F);

		hipsModel[393].addShapeBox(-7F, 5.5F, -7F, 11, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 72
		hipsModel[393].setRotationPoint(0F, -29F, 0F);

		hipsModel[394].addShapeBox(-9F, 12.5F, -7.5F, 2, 3, 1, 0F,0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F); // Box 73
		hipsModel[394].setRotationPoint(0F, -29F, 0F);

		hipsModel[395].addShapeBox(-7F, 12.5F, -7.5F, 11, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		hipsModel[395].setRotationPoint(0F, -29F, 0F);

		hipsModel[396].addShapeBox(-10F, -2F, -3F, 2, 1, 2, 0F,0F, -1F, 0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[396].setRotationPoint(0F, -29F, 0F);

		hipsModel[397].addShapeBox(-13F, -2F, -3F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[397].setRotationPoint(0F, -29F, 0F);

		hipsModel[398].addShapeBox(-17F, -2F, -3F, 4, 1, 2, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 2F, 0F); // Box 77
		hipsModel[398].setRotationPoint(0F, -29F, 0F);

		hipsModel[399].addShapeBox(-10F, -1F, -5F, 4, 1, 2, 0F,0F, -2F, 0.5F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0F, 1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		hipsModel[399].setRotationPoint(0F, -29F, 0F);

		hipsModel[400].addShapeBox(-13F, -1F, -5F, 3, 1, 2, 0F,0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		hipsModel[400].setRotationPoint(0F, -29F, 0F);

		hipsModel[401].addShapeBox(-17F, -1F, -5F, 4, 1, 2, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 4F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 2F, 0F); // Box 80
		hipsModel[401].setRotationPoint(0F, -29F, 0F);

		hipsModel[402].addShapeBox(-10F, 1F, -6.5F, 4, 4, 1, 0F,0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F); // Box 81
		hipsModel[402].setRotationPoint(0F, -29F, 0F);

		hipsModel[403].addShapeBox(-13F, 1F, -6.5F, 3, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 82
		hipsModel[403].setRotationPoint(0F, -29F, 0F);

		hipsModel[404].addShapeBox(-17F, 1F, -6F, 4, 4, 1, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 83
		hipsModel[404].setRotationPoint(0F, -29F, 0F);

		hipsModel[405].addShapeBox(-10F, 5F, -6.5F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 84
		hipsModel[405].setRotationPoint(0F, -29F, 0F);

		hipsModel[406].addShapeBox(-13F, 5F, -6.5F, 3, 8, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 85
		hipsModel[406].setRotationPoint(0F, -29F, 0F);

		hipsModel[407].addShapeBox(-17F, 5F, -6F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		hipsModel[407].setRotationPoint(0F, -29F, 0F);

		hipsModel[408].addShapeBox(-13F, 13F, -6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0.5F); // Box 87
		hipsModel[408].setRotationPoint(0F, -29F, 0F);

		hipsModel[409].addShapeBox(-16F, 13F, -6F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 88
		hipsModel[409].setRotationPoint(0F, -29F, 0F);

		hipsModel[410].addShapeBox(-21F, 0F, -3F, 1, 2, 2, 0F,-3F, -1F, 0F, 3F, -1F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		hipsModel[410].setRotationPoint(0F, -29F, 0F);

		hipsModel[411].addShapeBox(-23F, 2F, -3F, 1, 3, 2, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		hipsModel[411].setRotationPoint(0F, -29F, 0F);

		hipsModel[412].addShapeBox(-24F, 5F, -3F, 1, 4, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		hipsModel[412].setRotationPoint(0F, -29F, 0F);

		hipsModel[413].addShapeBox(-24F, 9F, -3F, 1, 4, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		hipsModel[413].setRotationPoint(0F, -29F, 0F);

		hipsModel[414].addShapeBox(-23F, 9F, -5F, 4, 4, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 93
		hipsModel[414].setRotationPoint(0F, -29F, 0F);

		hipsModel[415].addShapeBox(-22F, 5F, -5F, 4, 4, 2, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F); // Box 94
		hipsModel[415].setRotationPoint(0F, -29F, 0F);

		hipsModel[416].addShapeBox(-20F, 2F, -5F, 3, 3, 2, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F); // Box 95
		hipsModel[416].setRotationPoint(0F, -29F, 0F);

		hipsModel[417].addShapeBox(-20F, 1F, -4F, 2, 1, 1, 0F,-2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		hipsModel[417].setRotationPoint(0F, -29F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 106, 218, textureX, textureY); // Box 135

		leftArmModel[0].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 135
		leftArmModel[0].setRotationPoint(7F, -33F, 6F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 106, 218, textureX, textureY); // Box 136

		rightArmModel[0].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 136
		rightArmModel[0].setRotationPoint(7F, -33F, -6F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 107, 107, textureX, textureY); // Box 20
		leftLegModel[1] = new ModelRendererTurbo(this, 107, 114, textureX, textureY); // Box 22
		leftLegModel[2] = new ModelRendererTurbo(this, 107, 119, textureX, textureY); // Box 23
		leftLegModel[3] = new ModelRendererTurbo(this, 107, 123, textureX, textureY); // Box 24
		leftLegModel[4] = new ModelRendererTurbo(this, 107, 127, textureX, textureY); // Box 25
		leftLegModel[5] = new ModelRendererTurbo(this, 107, 133, textureX, textureY); // Box 26
		leftLegModel[6] = new ModelRendererTurbo(this, 101, 142, textureX, textureY); // Box 27
		leftLegModel[7] = new ModelRendererTurbo(this, 101, 148, textureX, textureY); // Box 28
		leftLegModel[8] = new ModelRendererTurbo(this, 101, 145, textureX, textureY); // Box 29
		leftLegModel[9] = new ModelRendererTurbo(this, 101, 152, textureX, textureY); // Box 30
		leftLegModel[10] = new ModelRendererTurbo(this, 98, 53, textureX, textureY); // Box 21
		leftLegModel[11] = new ModelRendererTurbo(this, 98, 62, textureX, textureY); // Box 22
		leftLegModel[12] = new ModelRendererTurbo(this, 98, 73, textureX, textureY); // Box 23
		leftLegModel[13] = new ModelRendererTurbo(this, 98, 84, textureX, textureY); // Box 24
		leftLegModel[14] = new ModelRendererTurbo(this, 98, 96, textureX, textureY); // Box 25
		leftLegModel[15] = new ModelRendererTurbo(this, 110, 84, textureX, textureY); // Box 34
		leftLegModel[16] = new ModelRendererTurbo(this, 110, 96, textureX, textureY); // Box 35
		leftLegModel[17] = new ModelRendererTurbo(this, 110, 62, textureX, textureY); // Box 36
		leftLegModel[18] = new ModelRendererTurbo(this, 110, 53, textureX, textureY); // Box 37
		leftLegModel[19] = new ModelRendererTurbo(this, 110, 73, textureX, textureY); // Box 38
		leftLegModel[20] = new ModelRendererTurbo(this, 109, 148, textureX, textureY); // Box 58
		leftLegModel[21] = new ModelRendererTurbo(this, 109, 145, textureX, textureY); // Box 59
		leftLegModel[22] = new ModelRendererTurbo(this, 98, 107, textureX, textureY); // Box 68
		leftLegModel[23] = new ModelRendererTurbo(this, 98, 114, textureX, textureY); // Box 69
		leftLegModel[24] = new ModelRendererTurbo(this, 98, 127, textureX, textureY); // Box 70
		leftLegModel[25] = new ModelRendererTurbo(this, 98, 133, textureX, textureY); // Box 71
		leftLegModel[26] = new ModelRendererTurbo(this, 109, 142, textureX, textureY); // Box 72
		leftLegModel[27] = new ModelRendererTurbo(this, 98, 123, textureX, textureY); // Box 73
		leftLegModel[28] = new ModelRendererTurbo(this, 98, 119, textureX, textureY); // Box 74
		leftLegModel[29] = new ModelRendererTurbo(this, 109, 152, textureX, textureY); // Box 83
		leftLegModel[30] = new ModelRendererTurbo(this, 98, 73, textureX, textureY); // Box 78
		leftLegModel[31] = new ModelRendererTurbo(this, 98, 84, textureX, textureY); // Box 79
		leftLegModel[32] = new ModelRendererTurbo(this, 98, 96, textureX, textureY); // Box 80
		leftLegModel[33] = new ModelRendererTurbo(this, 98, 62, textureX, textureY); // Box 81
		leftLegModel[34] = new ModelRendererTurbo(this, 98, 53, textureX, textureY); // Box 82
		leftLegModel[35] = new ModelRendererTurbo(this, 110, 62, textureX, textureY); // Box 83
		leftLegModel[36] = new ModelRendererTurbo(this, 110, 53, textureX, textureY); // Box 84
		leftLegModel[37] = new ModelRendererTurbo(this, 110, 96, textureX, textureY); // Box 85
		leftLegModel[38] = new ModelRendererTurbo(this, 110, 84, textureX, textureY); // Box 86
		leftLegModel[39] = new ModelRendererTurbo(this, 110, 73, textureX, textureY); // Box 87
		leftLegModel[40] = new ModelRendererTurbo(this, 101, 152, textureX, textureY); // Box 88
		leftLegModel[41] = new ModelRendererTurbo(this, 109, 152, textureX, textureY); // Box 89
		leftLegModel[42] = new ModelRendererTurbo(this, 109, 148, textureX, textureY); // Box 90
		leftLegModel[43] = new ModelRendererTurbo(this, 101, 148, textureX, textureY); // Box 91
		leftLegModel[44] = new ModelRendererTurbo(this, 101, 145, textureX, textureY); // Box 92
		leftLegModel[45] = new ModelRendererTurbo(this, 109, 145, textureX, textureY); // Box 93
		leftLegModel[46] = new ModelRendererTurbo(this, 109, 142, textureX, textureY); // Box 94
		leftLegModel[47] = new ModelRendererTurbo(this, 101, 142, textureX, textureY); // Box 95
		leftLegModel[48] = new ModelRendererTurbo(this, 107, 133, textureX, textureY); // Box 96
		leftLegModel[49] = new ModelRendererTurbo(this, 98, 133, textureX, textureY); // Box 97
		leftLegModel[50] = new ModelRendererTurbo(this, 98, 127, textureX, textureY); // Box 98
		leftLegModel[51] = new ModelRendererTurbo(this, 107, 127, textureX, textureY); // Box 99
		leftLegModel[52] = new ModelRendererTurbo(this, 107, 123, textureX, textureY); // Box 100
		leftLegModel[53] = new ModelRendererTurbo(this, 98, 123, textureX, textureY); // Box 101
		leftLegModel[54] = new ModelRendererTurbo(this, 98, 119, textureX, textureY); // Box 102
		leftLegModel[55] = new ModelRendererTurbo(this, 107, 119, textureX, textureY); // Box 103
		leftLegModel[56] = new ModelRendererTurbo(this, 98, 114, textureX, textureY); // Box 104
		leftLegModel[57] = new ModelRendererTurbo(this, 107, 114, textureX, textureY); // Box 105
		leftLegModel[58] = new ModelRendererTurbo(this, 107, 107, textureX, textureY); // Box 106
		leftLegModel[59] = new ModelRendererTurbo(this, 98, 107, textureX, textureY); // Box 107

		leftLegModel[0].addShapeBox(-2F, 3.5F, 1.5F, 3, 4, 1, 0F,.5F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.2F, -.2F, 0F, -.2F); // Box 20
		leftLegModel[0].setRotationPoint(8F, -20F, 2F);

		leftLegModel[1].addShapeBox(-2.5F, 7.5F, 1.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 22
		leftLegModel[1].setRotationPoint(8F, -20F, 2F);

		leftLegModel[2].addShapeBox(-3F, 9.5F, 1.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F); // Box 23
		leftLegModel[2].setRotationPoint(8F, -20F, 2F);

		leftLegModel[3].addShapeBox(-3F, 10.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F, -.2F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 24
		leftLegModel[3].setRotationPoint(8F, -20F, 2F);

		leftLegModel[4].addShapeBox(-2.5F, 11.5F, 1.5F, 2, 3, 1, 0F,.3F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 25
		leftLegModel[4].setRotationPoint(8F, -20F, 2F);

		leftLegModel[5].addShapeBox(-2.5F, 14.5F, 1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 26
		leftLegModel[5].setRotationPoint(8F, -20F, 2F);

		leftLegModel[6].addShapeBox(-2.5F, 16.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 27
		leftLegModel[6].setRotationPoint(8F, -20F, 2F);

		leftLegModel[7].addShapeBox(-1.5F, 18.5F, 1.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 28
		leftLegModel[7].setRotationPoint(8F, -20F, 2F);

		leftLegModel[8].addShapeBox(-2.5F, 17.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 29
		leftLegModel[8].setRotationPoint(8F, -20F, 2F);

		leftLegModel[9].addShapeBox(-1.5F, 19F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 30
		leftLegModel[9].setRotationPoint(8F, -20F, 2F);

		leftLegModel[10].addShapeBox(-4.5F, -2.5F, 0F, 1, 5, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 21
		leftLegModel[10].setRotationPoint(8F, -20F, 2F);

		leftLegModel[11].addShapeBox(-3.5F, -3.5F, 0F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, -.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 22
		leftLegModel[11].setRotationPoint(8F, -20F, 2F);

		leftLegModel[12].addShapeBox(-1.5F, -3.5F, 0F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 23
		leftLegModel[12].setRotationPoint(8F, -20F, 2F);

		leftLegModel[13].addShapeBox(1.5F, -3.5F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 24
		leftLegModel[13].setRotationPoint(8F, -20F, 2F);

		leftLegModel[14].addShapeBox(2.5F, -2.5F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		leftLegModel[14].setRotationPoint(8F, -20F, 2F);

		leftLegModel[15].addShapeBox(1.5F, -3.5F, 2F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -2.8F, 0F, 1F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F); // Box 34
		leftLegModel[15].setRotationPoint(8F, -20F, 2F);

		leftLegModel[16].addShapeBox(2.5F, -2.5F, 2F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 1F, -1.8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -.5F); // Box 35
		leftLegModel[16].setRotationPoint(8F, -20F, 2F);

		leftLegModel[17].addShapeBox(-3.5F, -3.5F, 2F, 2, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -.5F, 0F, -1F, -.5F); // Box 36
		leftLegModel[17].setRotationPoint(8F, -20F, 2F);

		leftLegModel[18].addShapeBox(-4.5F, -2.5F, 2F, 1, 5, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2F, -1F); // Box 37
		leftLegModel[18].setRotationPoint(8F, -20F, 2F);

		leftLegModel[19].addShapeBox(-1.5F, -3.5F, 2F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, 0F, -2.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, 1F, -.5F); // Box 38
		leftLegModel[19].setRotationPoint(8F, -20F, 2F);

		leftLegModel[20].addShapeBox(-1.5F, 18.5F, 0.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		leftLegModel[20].setRotationPoint(8F, -20F, 2F);

		leftLegModel[21].addShapeBox(-2.5F, 17.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 59
		leftLegModel[21].setRotationPoint(8F, -20F, 2F);

		leftLegModel[22].addShapeBox(-2F, 3.5F, 0.5F, 3, 4, 1, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 68
		leftLegModel[22].setRotationPoint(8F, -20F, 2F);

		leftLegModel[23].addShapeBox(-2.5F, 7.5F, 0.5F, 3, 2, 1, 0F,-0.7F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 69
		leftLegModel[23].setRotationPoint(8F, -20F, 2F);

		leftLegModel[24].addShapeBox(-2.5F, 11.5F, 0.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		leftLegModel[24].setRotationPoint(8F, -20F, 2F);

		leftLegModel[25].addShapeBox(-2.5F, 14.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftLegModel[25].setRotationPoint(8F, -20F, 2F);

		leftLegModel[26].addShapeBox(-2.5F, 16.5F, 0.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 72
		leftLegModel[26].setRotationPoint(8F, -20F, 2F);

		leftLegModel[27].addShapeBox(-3F, 10.5F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F); // Box 73
		leftLegModel[27].setRotationPoint(8F, -20F, 2F);

		leftLegModel[28].addShapeBox(-3F, 9.5F, 0.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 74
		leftLegModel[28].setRotationPoint(8F, -20F, 2F);

		leftLegModel[29].addShapeBox(-1.5F, 19F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 83
		leftLegModel[29].setRotationPoint(8F, -20F, 2F);

		leftLegModel[30].addShapeBox(-1.5F, -3.5F, -6F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 1F, -0.5F); // Box 78
		leftLegModel[30].setRotationPoint(8F, -20F, 2F);

		leftLegModel[31].addShapeBox(1.5F, -3.5F, -6F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F); // Box 79
		leftLegModel[31].setRotationPoint(8F, -20F, 2F);

		leftLegModel[32].addShapeBox(2.5F, -2.5F, -6F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 80
		leftLegModel[32].setRotationPoint(8F, -20F, 2F);

		leftLegModel[33].addShapeBox(-3.5F, -3.5F, -6F, 2, 7, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, -0.5F, 0F, -1F, 0F); // Box 81
		leftLegModel[33].setRotationPoint(8F, -20F, 2F);

		leftLegModel[34].addShapeBox(-4.5F, -2.5F, -6F, 1, 5, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 82
		leftLegModel[34].setRotationPoint(8F, -20F, 2F);

		leftLegModel[35].addShapeBox(-3.5F, -3.5F, -7F, 2, 7, 1, 0F,0F, -3F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, 0F, -1F, 0F); // Box 83
		leftLegModel[35].setRotationPoint(8F, -20F, 2F);

		leftLegModel[36].addShapeBox(-4.5F, -2.5F, -7F, 1, 5, 1, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 84
		leftLegModel[36].setRotationPoint(8F, -20F, 2F);

		leftLegModel[37].addShapeBox(2.5F, -2.5F, -7F, 1, 5, 1, 0F,1F, -1.8F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 85
		leftLegModel[37].setRotationPoint(8F, -20F, 2F);

		leftLegModel[38].addShapeBox(1.5F, -3.5F, -7F, 1, 7, 1, 0F,1F, -2.5F, 0F, -1F, -2.8F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 86
		leftLegModel[38].setRotationPoint(8F, -20F, 2F);

		leftLegModel[39].addShapeBox(-1.5F, -3.5F, -7F, 3, 7, 1, 0F,0F, -2.5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 87
		leftLegModel[39].setRotationPoint(8F, -20F, 2F);

		leftLegModel[40].addShapeBox(-1.5F, 19F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 88
		leftLegModel[40].setRotationPoint(8F, -20F, 2F);

		leftLegModel[41].addShapeBox(-1.5F, 19F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 89
		leftLegModel[41].setRotationPoint(8F, -20F, 2F);

		leftLegModel[42].addShapeBox(-1.5F, 18.5F, -6.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 90
		leftLegModel[42].setRotationPoint(8F, -20F, 2F);

		leftLegModel[43].addShapeBox(-1.5F, 18.5F, -5.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 91
		leftLegModel[43].setRotationPoint(8F, -20F, 2F);

		leftLegModel[44].addShapeBox(-2.5F, 17.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 92
		leftLegModel[44].setRotationPoint(8F, -20F, 2F);

		leftLegModel[45].addShapeBox(-2.5F, 17.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 93
		leftLegModel[45].setRotationPoint(8F, -20F, 2F);

		leftLegModel[46].addShapeBox(-2.5F, 16.5F, -6.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 94
		leftLegModel[46].setRotationPoint(8F, -20F, 2F);

		leftLegModel[47].addShapeBox(-2.5F, 16.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 95
		leftLegModel[47].setRotationPoint(8F, -20F, 2F);

		leftLegModel[48].addShapeBox(-2.5F, 14.5F, -5.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 96
		leftLegModel[48].setRotationPoint(8F, -20F, 2F);

		leftLegModel[49].addShapeBox(-2.5F, 14.5F, -6.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		leftLegModel[49].setRotationPoint(8F, -20F, 2F);

		leftLegModel[50].addShapeBox(-2.5F, 11.5F, -6.5F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		leftLegModel[50].setRotationPoint(8F, -20F, 2F);

		leftLegModel[51].addShapeBox(-2.5F, 11.5F, -5.5F, 2, 3, 1, 0F,.3F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F); // Box 99
		leftLegModel[51].setRotationPoint(8F, -20F, 2F);

		leftLegModel[52].addShapeBox(-3F, 10.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F, -.2F, 0F, 0F, -.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 100
		leftLegModel[52].setRotationPoint(8F, -20F, 2F);

		leftLegModel[53].addShapeBox(-3F, 10.5F, -6.5F, 3, 1, 1, 0F,-1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, 0F); // Box 101
		leftLegModel[53].setRotationPoint(8F, -20F, 2F);

		leftLegModel[54].addShapeBox(-3F, 9.5F, -6.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0.2F, -0.5F, 0F, 0.2F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 102
		leftLegModel[54].setRotationPoint(8F, -20F, 2F);

		leftLegModel[55].addShapeBox(-3F, 9.5F, -5.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, .2F, -1F, 0F, .2F); // Box 103
		leftLegModel[55].setRotationPoint(8F, -20F, 2F);

		leftLegModel[56].addShapeBox(-2.5F, 7.5F, -6.5F, 3, 2, 1, 0F,-0.7F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 104
		leftLegModel[56].setRotationPoint(8F, -20F, 2F);

		leftLegModel[57].addShapeBox(-2.5F, 7.5F, -5.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.2F, -.7F, 0F, -.2F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F); // Box 105
		leftLegModel[57].setRotationPoint(8F, -20F, 2F);

		leftLegModel[58].addShapeBox(-2F, 3.5F, -5.5F, 3, 4, 1, 0F,.5F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.2F, -.2F, 0F, -.2F); // Box 106
		leftLegModel[58].setRotationPoint(8F, -20F, 2F);

		leftLegModel[59].addShapeBox(-2F, 3.5F, -6.5F, 3, 4, 1, 0F,0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, -0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 107
		leftLegModel[59].setRotationPoint(8F, -20F, 2F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 94, 171, textureX, textureY); // Box 16
		rightLegModel[1] = new ModelRendererTurbo(this, 94, 158, textureX, textureY); // Box 17
		rightLegModel[2] = new ModelRendererTurbo(this, 94, 186, textureX, textureY); // Box 18
		rightLegModel[3] = new ModelRendererTurbo(this, 94, 201, textureX, textureY); // Box 19
		rightLegModel[4] = new ModelRendererTurbo(this, 94, 216, textureX, textureY); // Box 20
		rightLegModel[5] = new ModelRendererTurbo(this, 84, 171, textureX, textureY); // Box 26
		rightLegModel[6] = new ModelRendererTurbo(this, 84, 158, textureX, textureY); // Box 27
		rightLegModel[7] = new ModelRendererTurbo(this, 84, 186, textureX, textureY); // Box 28
		rightLegModel[8] = new ModelRendererTurbo(this, 84, 201, textureX, textureY); // Box 29
		rightLegModel[9] = new ModelRendererTurbo(this, 84, 216, textureX, textureY); // Box 30
		rightLegModel[10] = new ModelRendererTurbo(this, 101, 152, textureX, textureY); // Box 79
		rightLegModel[11] = new ModelRendererTurbo(this, 101, 148, textureX, textureY); // Box 80
		rightLegModel[12] = new ModelRendererTurbo(this, 101, 145, textureX, textureY); // Box 81
		rightLegModel[13] = new ModelRendererTurbo(this, 101, 142, textureX, textureY); // Box 82
		rightLegModel[14] = new ModelRendererTurbo(this, 108, 177, textureX, textureY); // Box 84
		rightLegModel[15] = new ModelRendererTurbo(this, 108, 171, textureX, textureY); // Box 85
		rightLegModel[16] = new ModelRendererTurbo(this, 108, 167, textureX, textureY); // Box 86
		rightLegModel[17] = new ModelRendererTurbo(this, 108, 160, textureX, textureY); // Box 87
		rightLegModel[18] = new ModelRendererTurbo(this, 109, 152, textureX, textureY); // Box 0
		rightLegModel[19] = new ModelRendererTurbo(this, 109, 148, textureX, textureY); // Box 1
		rightLegModel[20] = new ModelRendererTurbo(this, 109, 145, textureX, textureY); // Box 2
		rightLegModel[21] = new ModelRendererTurbo(this, 109, 142, textureX, textureY); // Box 3
		rightLegModel[22] = new ModelRendererTurbo(this, 108, 205, textureX, textureY); // Box 4
		rightLegModel[23] = new ModelRendererTurbo(this, 108, 199, textureX, textureY); // Box 5
		rightLegModel[24] = new ModelRendererTurbo(this, 108, 195, textureX, textureY); // Box 6
		rightLegModel[25] = new ModelRendererTurbo(this, 108, 188, textureX, textureY); // Box 7
		rightLegModel[26] = new ModelRendererTurbo(this, 94, 158, textureX, textureY); // Box 108
		rightLegModel[27] = new ModelRendererTurbo(this, 94, 171, textureX, textureY); // Box 109
		rightLegModel[28] = new ModelRendererTurbo(this, 94, 186, textureX, textureY); // Box 110
		rightLegModel[29] = new ModelRendererTurbo(this, 94, 201, textureX, textureY); // Box 111
		rightLegModel[30] = new ModelRendererTurbo(this, 94, 216, textureX, textureY); // Box 112
		rightLegModel[31] = new ModelRendererTurbo(this, 84, 158, textureX, textureY); // Box 113
		rightLegModel[32] = new ModelRendererTurbo(this, 84, 171, textureX, textureY); // Box 114
		rightLegModel[33] = new ModelRendererTurbo(this, 84, 186, textureX, textureY); // Box 115
		rightLegModel[34] = new ModelRendererTurbo(this, 84, 201, textureX, textureY); // Box 116
		rightLegModel[35] = new ModelRendererTurbo(this, 84, 216, textureX, textureY); // Box 117
		rightLegModel[36] = new ModelRendererTurbo(this, 108, 188, textureX, textureY); // Box 118
		rightLegModel[37] = new ModelRendererTurbo(this, 108, 160, textureX, textureY); // Box 119
		rightLegModel[38] = new ModelRendererTurbo(this, 108, 167, textureX, textureY); // Box 120
		rightLegModel[39] = new ModelRendererTurbo(this, 108, 195, textureX, textureY); // Box 121
		rightLegModel[40] = new ModelRendererTurbo(this, 108, 199, textureX, textureY); // Box 122
		rightLegModel[41] = new ModelRendererTurbo(this, 108, 171, textureX, textureY); // Box 123
		rightLegModel[42] = new ModelRendererTurbo(this, 108, 177, textureX, textureY); // Box 124
		rightLegModel[43] = new ModelRendererTurbo(this, 108, 205, textureX, textureY); // Box 125
		rightLegModel[44] = new ModelRendererTurbo(this, 101, 142, textureX, textureY); // Box 126
		rightLegModel[45] = new ModelRendererTurbo(this, 109, 142, textureX, textureY); // Box 127
		rightLegModel[46] = new ModelRendererTurbo(this, 109, 145, textureX, textureY); // Box 128
		rightLegModel[47] = new ModelRendererTurbo(this, 101, 145, textureX, textureY); // Box 129
		rightLegModel[48] = new ModelRendererTurbo(this, 101, 148, textureX, textureY); // Box 130
		rightLegModel[49] = new ModelRendererTurbo(this, 109, 148, textureX, textureY); // Box 131
		rightLegModel[50] = new ModelRendererTurbo(this, 109, 152, textureX, textureY); // Box 132
		rightLegModel[51] = new ModelRendererTurbo(this, 101, 152, textureX, textureY); // Box 133

		rightLegModel[0].addShapeBox(1.5F, -3.5F, 0F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 16
		rightLegModel[0].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[1].addShapeBox(2.5F, -2.5F, 0F, 1, 9, 2, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 17
		rightLegModel[1].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[2].addShapeBox(-1.5F, -3.5F, 0F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -.5F, 0F, 1F, -.5F, 0F, 1F, 0F, 2F, 0F, 0F); // Box 18
		rightLegModel[2].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[3].addShapeBox(-3.5F, -3.5F, 0F, 2, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .5F, -1F, -.5F, -2F, 0F, -.5F, -2F, 0F, 0F, .5F, -1F, 0F); // Box 19
		rightLegModel[3].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[4].addShapeBox(-4.5F, -2.5F, 0F, 1, 8, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -4F, 0F, 0F, -2F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, .2F, -2F, 0F); // Box 20
		rightLegModel[4].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[5].addShapeBox(1.5F, -3.5F, 2F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F); // Box 26
		rightLegModel[5].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[6].addShapeBox(2.5F, -2.5F, 2F, 1, 9, 1, 0F,0F, 0F, 0F, .5F, -3F, 0F, .5F, -3F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -.5F); // Box 27
		rightLegModel[6].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[7].addShapeBox(-1.5F, -3.5F, 2F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.3F, 0F, 0F, -3.5F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -.5F, 2F, 0F, -.5F); // Box 28
		rightLegModel[7].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[8].addShapeBox(-3.5F, -3.5F, 2F, 2, 10, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4F, 0F, .5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -.5F, .5F, -1F, -.5F); // Box 29
		rightLegModel[8].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[9].addShapeBox(-4.5F, -2.5F, 2F, 1, 8, 1, 0F,.5F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, .5F, -4F, -1F, .2F, -2F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, .2F, -2F, -1F); // Box 30
		rightLegModel[9].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[10].addShapeBox(-4.5F, 22F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 79
		rightLegModel[10].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[11].addShapeBox(-4.5F, 21.5F, 1.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 80
		rightLegModel[11].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[12].addShapeBox(-5.5F, 20.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 81
		rightLegModel[12].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[13].addShapeBox(-5.5F, 19.5F, 1.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 82
		rightLegModel[13].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[14].addShapeBox(-5.5F, 14.5F, 1.5F, 2, 5, 1, 0F,.2F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 84
		rightLegModel[14].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[15].addShapeBox(-5.5F, 11.5F, 1.5F, 3, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -.2F, -.4F, 0F, .2F, .2F, 0F, 0F, -.5F, 0F, 0F, -1.1F, 0F, -.2F, -.3F, 0F, -.2F); // Box 85
		rightLegModel[15].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[16].addShapeBox(-4.5F, 10.5F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, -.4F, 0F, -.2F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.2F, 0F, -.2F, .6F, 0F, .2F); // Box 86
		rightLegModel[16].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[17].addShapeBox(-3.5F, 6.5F, 1.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.3F, 0F, -.2F, .6F, 0F, -.2F); // Box 87
		rightLegModel[17].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[18].addShapeBox(-4.5F, 22F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 0
		rightLegModel[18].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[19].addShapeBox(-4.5F, 21.5F, 0.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1
		rightLegModel[19].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[20].addShapeBox(-5.5F, 20.5F, 0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 2
		rightLegModel[20].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[21].addShapeBox(-5.5F, 19.5F, 0.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 3
		rightLegModel[21].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[22].addShapeBox(-5.5F, 14.5F, 0.5F, 2, 5, 1, 0F,-0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightLegModel[22].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[23].addShapeBox(-5.5F, 11.5F, 0.5F, 3, 3, 1, 0F,-0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 5
		rightLegModel[23].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[24].addShapeBox(-4.5F, 10.5F, 0.5F, 3, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 6
		rightLegModel[24].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[25].addShapeBox(-3.5F, 6.5F, 0.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 7
		rightLegModel[25].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[26].addShapeBox(2.5F, -2.5F, -6F, 1, 9, 2, 0F,0F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F); // Box 108
		rightLegModel[26].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[27].addShapeBox(1.5F, -3.5F, -6F, 1, 11, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F); // Box 109
		rightLegModel[27].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[28].addShapeBox(-1.5F, -3.5F, -6F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 2F, 0F, -0.5F); // Box 110
		rightLegModel[28].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[29].addShapeBox(-3.5F, -3.5F, -6F, 2, 10, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0.5F, -1F, -0.5F); // Box 111
		rightLegModel[29].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[30].addShapeBox(-4.5F, -2.5F, -6F, 1, 8, 2, 0F,0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.2F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -2F, -0.5F); // Box 112
		rightLegModel[30].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[31].addShapeBox(2.5F, -2.5F, -7F, 1, 9, 1, 0F,0F, -2.5F, 0F, 0.5F, -3F, -1F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 113
		rightLegModel[31].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[32].addShapeBox(1.5F, -3.5F, -7F, 1, 11, 1, 0F,0F, -3.3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 114
		rightLegModel[32].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[33].addShapeBox(-1.5F, -3.5F, -7F, 3, 10, 1, 0F,0F, -3.5F, 0F, 0F, -3.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 2F, 0F, 0F); // Box 115
		rightLegModel[33].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[34].addShapeBox(-3.5F, -3.5F, -7F, 2, 10, 1, 0F,0F, -4F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0.5F, -1F, 0F); // Box 116
		rightLegModel[34].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[35].addShapeBox(-4.5F, -2.5F, -7F, 1, 8, 1, 0F,0.5F, -4F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.2F, -2F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.2F, -2F, 0F); // Box 117
		rightLegModel[35].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[36].addShapeBox(-3.5F, 6.5F, -6.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.2F, -3.3F, 0F, -0.2F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 118
		rightLegModel[36].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[37].addShapeBox(-3.5F, 6.5F, -5.5F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3.3F, 0F, -.2F, .6F, 0F, -.2F); // Box 119
		rightLegModel[37].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[38].addShapeBox(-4.5F, 10.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, -.4F, 0F, -.2F, 1F, 0F, 0F, -.5F, 0F, 0F, -1.2F, 0F, -.2F, .6F, 0F, .2F); // Box 120
		rightLegModel[38].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[39].addShapeBox(-4.5F, 10.5F, -6.5F, 3, 1, 1, 0F,-0.4F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.2F, -1.2F, 0F, -0.2F, -0.5F, 0F, 0F, 1F, 0F, 0F); // Box 121
		rightLegModel[39].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[40].addShapeBox(-5.5F, 11.5F, -6.5F, 3, 3, 1, 0F,-0.4F, 0F, 0.2F, -0.2F, 0F, -0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, -1.1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F); // Box 122
		rightLegModel[40].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[41].addShapeBox(-5.5F, 11.5F, -5.5F, 3, 3, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F, -.2F, -.4F, 0F, .2F, .2F, 0F, 0F, -.5F, 0F, 0F, -1.1F, 0F, -.2F, -.3F, 0F, -.2F); // Box 123
		rightLegModel[41].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[42].addShapeBox(-5.5F, 14.5F, -5.5F, 2, 5, 1, 0F,.2F, 0F, 0F, .5F, 0F, 0F, -.1F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 124
		rightLegModel[42].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[43].addShapeBox(-5.5F, 14.5F, -6.5F, 2, 5, 1, 0F,-0.3F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		rightLegModel[43].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[44].addShapeBox(-5.5F, 19.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 126
		rightLegModel[44].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[45].addShapeBox(-5.5F, 19.5F, -6.5F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 127
		rightLegModel[45].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[46].addShapeBox(-5.5F, 20.5F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F); // Box 128
		rightLegModel[46].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[47].addShapeBox(-5.5F, 20.5F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F); // Box 129
		rightLegModel[47].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[48].addShapeBox(-4.5F, 21.5F, -5.5F, 2, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, -.5F, 0F, .2F, -.5F, 0F, .2F, -.5F, 0F, 0F, -.5F, 0F); // Box 130
		rightLegModel[48].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[49].addShapeBox(-4.5F, 21.5F, -6.5F, 2, 1, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 131
		rightLegModel[49].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[50].addShapeBox(-4.5F, 22F, -6.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 132
		rightLegModel[50].setRotationPoint(-14F, -23F, 2F);

		rightLegModel[51].addShapeBox(-4.5F, 22F, -5.5F, 2, 1, 1, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, .5F, 0F, .5F, .5F, 0F, .5F); // Box 133
		rightLegModel[51].setRotationPoint(-14F, -23F, 2F);
	}
}