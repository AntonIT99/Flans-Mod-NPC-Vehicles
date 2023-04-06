//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PersianCataphract
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSassyHorse extends ModelMecha //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelSassyHorse() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		hipsModel = new ModelRendererTurbo[350];
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
		hipsModel[10] = new ModelRendererTurbo(this, 58, 99, textureX, textureY); // Box 49
		hipsModel[11] = new ModelRendererTurbo(this, 58, 55, textureX, textureY); // Box 50
		hipsModel[12] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 9
		hipsModel[13] = new ModelRendererTurbo(this, 59, 167, textureX, textureY); // Box 8
		hipsModel[14] = new ModelRendererTurbo(this, 66, 162, textureX, textureY); // Box 9
		hipsModel[15] = new ModelRendererTurbo(this, 66, 157, textureX, textureY); // Box 10
		hipsModel[16] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 11
		hipsModel[17] = new ModelRendererTurbo(this, 58, 142, textureX, textureY); // Box 12
		hipsModel[18] = new ModelRendererTurbo(this, 58, 134, textureX, textureY); // Box 13
		hipsModel[19] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 14
		hipsModel[20] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 0
		hipsModel[21] = new ModelRendererTurbo(this, 72, 157, textureX, textureY); // Box 1
		hipsModel[22] = new ModelRendererTurbo(this, 72, 162, textureX, textureY); // Box 2
		hipsModel[23] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 3
		hipsModel[24] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 4
		hipsModel[25] = new ModelRendererTurbo(this, 66, 167, textureX, textureY); // Box 6
		hipsModel[26] = new ModelRendererTurbo(this, 58, 113, textureX, textureY); // Box 8
		hipsModel[27] = new ModelRendererTurbo(this, 79, 72, textureX, textureY); // Box 12
		hipsModel[28] = new ModelRendererTurbo(this, 79, 87, textureX, textureY); // Box 13
		hipsModel[29] = new ModelRendererTurbo(this, 79, 99, textureX, textureY); // Box 14
		hipsModel[30] = new ModelRendererTurbo(this, 68, 55, textureX, textureY); // Box 15
		hipsModel[31] = new ModelRendererTurbo(this, 68, 99, textureX, textureY); // Box 18
		hipsModel[32] = new ModelRendererTurbo(this, 68, 113, textureX, textureY); // Box 19
		hipsModel[33] = new ModelRendererTurbo(this, 78, 113, textureX, textureY); // Box 20
		hipsModel[34] = new ModelRendererTurbo(this, 78, 123, textureX, textureY); // Box 21
		hipsModel[35] = new ModelRendererTurbo(this, 68, 123, textureX, textureY); // Box 22
		hipsModel[36] = new ModelRendererTurbo(this, 68, 134, textureX, textureY); // Box 23
		hipsModel[37] = new ModelRendererTurbo(this, 78, 134, textureX, textureY); // Box 24
		hipsModel[38] = new ModelRendererTurbo(this, 78, 142, textureX, textureY); // Box 25
		hipsModel[39] = new ModelRendererTurbo(this, 68, 142, textureX, textureY); // Box 26
		hipsModel[40] = new ModelRendererTurbo(this, 68, 147, textureX, textureY); // Box 27
		hipsModel[41] = new ModelRendererTurbo(this, 78, 147, textureX, textureY); // Box 28
		hipsModel[42] = new ModelRendererTurbo(this, 36, 127, textureX, textureY); // Box 29
		hipsModel[43] = new ModelRendererTurbo(this, 20, 127, textureX, textureY); // Box 30
		hipsModel[44] = new ModelRendererTurbo(this, 36, 145, textureX, textureY); // Box 31
		hipsModel[45] = new ModelRendererTurbo(this, 20, 145, textureX, textureY); // Box 32
		hipsModel[46] = new ModelRendererTurbo(this, 36, 179, textureX, textureY); // Box 33
		hipsModel[47] = new ModelRendererTurbo(this, 36, 162, textureX, textureY); // Box 34
		hipsModel[48] = new ModelRendererTurbo(this, 36, 198, textureX, textureY); // Box 35
		hipsModel[49] = new ModelRendererTurbo(this, 36, 215, textureX, textureY); // Box 36
		hipsModel[50] = new ModelRendererTurbo(this, 20, 215, textureX, textureY); // Box 37
		hipsModel[51] = new ModelRendererTurbo(this, 20, 198, textureX, textureY); // Box 38
		hipsModel[52] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 39
		hipsModel[53] = new ModelRendererTurbo(this, 20, 162, textureX, textureY); // Box 40
		hipsModel[54] = new ModelRendererTurbo(this, 20, 108, textureX, textureY); // Box 41
		hipsModel[55] = new ModelRendererTurbo(this, 20, 88, textureX, textureY); // Box 42
		hipsModel[56] = new ModelRendererTurbo(this, 36, 108, textureX, textureY); // Box 43
		hipsModel[57] = new ModelRendererTurbo(this, 36, 88, textureX, textureY); // Box 44
		hipsModel[58] = new ModelRendererTurbo(this, 20, 68, textureX, textureY); // Box 45
		hipsModel[59] = new ModelRendererTurbo(this, 20, 53, textureX, textureY); // Box 46
		hipsModel[60] = new ModelRendererTurbo(this, 36, 53, textureX, textureY); // Box 47
		hipsModel[61] = new ModelRendererTurbo(this, 36, 68, textureX, textureY); // Box 48
		hipsModel[62] = new ModelRendererTurbo(this, 59, 157, textureX, textureY); // Box 0
		hipsModel[63] = new ModelRendererTurbo(this, 78, 157, textureX, textureY); // Box 3
		hipsModel[64] = new ModelRendererTurbo(this, 79, 61, textureX, textureY); // Box 6
		hipsModel[65] = new ModelRendererTurbo(this, 59, 162, textureX, textureY); // Box 0
		hipsModel[66] = new ModelRendererTurbo(this, 78, 162, textureX, textureY); // Box 1
		hipsModel[67] = new ModelRendererTurbo(this, 77, 167, textureX, textureY); // Box 2
		hipsModel[68] = new ModelRendererTurbo(this, 72, 167, textureX, textureY); // Box 3
		hipsModel[69] = new ModelRendererTurbo(this, 79, 55, textureX, textureY); // Box 6
		hipsModel[70] = new ModelRendererTurbo(this, 55, 175, textureX, textureY); // Box 7
		hipsModel[71] = new ModelRendererTurbo(this, 55, 181, textureX, textureY); // Box 9
		hipsModel[72] = new ModelRendererTurbo(this, 55, 187, textureX, textureY); // Box 10
		hipsModel[73] = new ModelRendererTurbo(this, 55, 197, textureX, textureY); // Box 13
		hipsModel[74] = new ModelRendererTurbo(this, 55, 207, textureX, textureY); // Box 14
		hipsModel[75] = new ModelRendererTurbo(this, 55, 227, textureX, textureY); // Box 0
		hipsModel[76] = new ModelRendererTurbo(this, 55, 218, textureX, textureY); // Box 8
		hipsModel[77] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 9
		hipsModel[78] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 10
		hipsModel[79] = new ModelRendererTurbo(this, 4, 198, textureX, textureY); // Box 11
		hipsModel[80] = new ModelRendererTurbo(this, 4, 179, textureX, textureY); // Box 12
		hipsModel[81] = new ModelRendererTurbo(this, 4, 162, textureX, textureY); // Box 13
		hipsModel[82] = new ModelRendererTurbo(this, 4, 145, textureX, textureY); // Box 14
		hipsModel[83] = new ModelRendererTurbo(this, 4, 127, textureX, textureY); // Box 15
		hipsModel[84] = new ModelRendererTurbo(this, 4, 108, textureX, textureY); // Box 16
		hipsModel[85] = new ModelRendererTurbo(this, 4, 88, textureX, textureY); // Box 17
		hipsModel[86] = new ModelRendererTurbo(this, 4, 68, textureX, textureY); // Box 18
		hipsModel[87] = new ModelRendererTurbo(this, 4, 53, textureX, textureY); // Box 19
		hipsModel[88] = new ModelRendererTurbo(this, 58, 99, textureX, textureY); // Box 22
		hipsModel[89] = new ModelRendererTurbo(this, 58, 55, textureX, textureY); // Box 24
		hipsModel[90] = new ModelRendererTurbo(this, 68, 99, textureX, textureY); // Box 25
		hipsModel[91] = new ModelRendererTurbo(this, 79, 99, textureX, textureY); // Box 26
		hipsModel[92] = new ModelRendererTurbo(this, 79, 87, textureX, textureY); // Box 28
		hipsModel[93] = new ModelRendererTurbo(this, 79, 72, textureX, textureY); // Box 30
		hipsModel[94] = new ModelRendererTurbo(this, 68, 55, textureX, textureY); // Box 31
		hipsModel[95] = new ModelRendererTurbo(this, 58, 113, textureX, textureY); // Box 32
		hipsModel[96] = new ModelRendererTurbo(this, 58, 123, textureX, textureY); // Box 33
		hipsModel[97] = new ModelRendererTurbo(this, 58, 134, textureX, textureY); // Box 34
		hipsModel[98] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 35
		hipsModel[99] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 36
		hipsModel[100] = new ModelRendererTurbo(this, 58, 142, textureX, textureY); // Box 37
		hipsModel[101] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 38
		hipsModel[102] = new ModelRendererTurbo(this, 58, 147, textureX, textureY); // Box 39
		hipsModel[103] = new ModelRendererTurbo(this, 79, 61, textureX, textureY); // Box 40
		hipsModel[104] = new ModelRendererTurbo(this, 79, 55, textureX, textureY); // Box 41
		hipsModel[105] = new ModelRendererTurbo(this, 78, 113, textureX, textureY); // Box 42
		hipsModel[106] = new ModelRendererTurbo(this, 68, 113, textureX, textureY); // Box 43
		hipsModel[107] = new ModelRendererTurbo(this, 78, 123, textureX, textureY); // Box 44
		hipsModel[108] = new ModelRendererTurbo(this, 68, 123, textureX, textureY); // Box 45
		hipsModel[109] = new ModelRendererTurbo(this, 68, 134, textureX, textureY); // Box 46
		hipsModel[110] = new ModelRendererTurbo(this, 78, 134, textureX, textureY); // Box 47
		hipsModel[111] = new ModelRendererTurbo(this, 78, 142, textureX, textureY); // Box 48
		hipsModel[112] = new ModelRendererTurbo(this, 68, 142, textureX, textureY); // Box 49
		hipsModel[113] = new ModelRendererTurbo(this, 68, 147, textureX, textureY); // Box 50
		hipsModel[114] = new ModelRendererTurbo(this, 78, 147, textureX, textureY); // Box 51
		hipsModel[115] = new ModelRendererTurbo(this, 59, 157, textureX, textureY); // Box 52
		hipsModel[116] = new ModelRendererTurbo(this, 78, 157, textureX, textureY); // Box 53
		hipsModel[117] = new ModelRendererTurbo(this, 78, 162, textureX, textureY); // Box 54
		hipsModel[118] = new ModelRendererTurbo(this, 59, 162, textureX, textureY); // Box 55
		hipsModel[119] = new ModelRendererTurbo(this, 77, 167, textureX, textureY); // Box 56
		hipsModel[120] = new ModelRendererTurbo(this, 72, 167, textureX, textureY); // Box 57
		hipsModel[121] = new ModelRendererTurbo(this, 36, 53, textureX, textureY); // Box 58
		hipsModel[122] = new ModelRendererTurbo(this, 36, 68, textureX, textureY); // Box 59
		hipsModel[123] = new ModelRendererTurbo(this, 36, 88, textureX, textureY); // Box 60
		hipsModel[124] = new ModelRendererTurbo(this, 36, 108, textureX, textureY); // Box 61
		hipsModel[125] = new ModelRendererTurbo(this, 36, 127, textureX, textureY); // Box 62
		hipsModel[126] = new ModelRendererTurbo(this, 36, 145, textureX, textureY); // Box 63
		hipsModel[127] = new ModelRendererTurbo(this, 36, 162, textureX, textureY); // Box 64
		hipsModel[128] = new ModelRendererTurbo(this, 36, 179, textureX, textureY); // Box 65
		hipsModel[129] = new ModelRendererTurbo(this, 36, 198, textureX, textureY); // Box 66
		hipsModel[130] = new ModelRendererTurbo(this, 36, 215, textureX, textureY); // Box 67
		hipsModel[131] = new ModelRendererTurbo(this, 20, 53, textureX, textureY); // Box 68
		hipsModel[132] = new ModelRendererTurbo(this, 20, 68, textureX, textureY); // Box 69
		hipsModel[133] = new ModelRendererTurbo(this, 20, 88, textureX, textureY); // Box 70
		hipsModel[134] = new ModelRendererTurbo(this, 20, 108, textureX, textureY); // Box 71
		hipsModel[135] = new ModelRendererTurbo(this, 20, 127, textureX, textureY); // Box 72
		hipsModel[136] = new ModelRendererTurbo(this, 20, 145, textureX, textureY); // Box 73
		hipsModel[137] = new ModelRendererTurbo(this, 20, 162, textureX, textureY); // Box 74
		hipsModel[138] = new ModelRendererTurbo(this, 20, 179, textureX, textureY); // Box 75
		hipsModel[139] = new ModelRendererTurbo(this, 20, 198, textureX, textureY); // Box 76
		hipsModel[140] = new ModelRendererTurbo(this, 20, 215, textureX, textureY); // Box 77
		hipsModel[141] = new ModelRendererTurbo(this, 15, 227, textureX, textureY); // Box 137
		hipsModel[142] = new ModelRendererTurbo(this, 75, 229, textureX, textureY); // Box 138
		hipsModel[143] = new ModelRendererTurbo(this, 173, 46, textureX, textureY); // Box 3
		hipsModel[144] = new ModelRendererTurbo(this, 173, 46, textureX, textureY); // Box 4
		hipsModel[145] = new ModelRendererTurbo(this, 149, 39, textureX, textureY); // Box 5
		hipsModel[146] = new ModelRendererTurbo(this, 173, 55, textureX, textureY); // Box 9
		hipsModel[147] = new ModelRendererTurbo(this, 151, 39, textureX, textureY); // Box 10
		hipsModel[148] = new ModelRendererTurbo(this, 173, 54, textureX, textureY); // Box 11
		hipsModel[149] = new ModelRendererTurbo(this, 167, 21, textureX, textureY); // Box 12
		hipsModel[150] = new ModelRendererTurbo(this, 174, 63, textureX, textureY); // Box 18
		hipsModel[151] = new ModelRendererTurbo(this, 151, 40, textureX, textureY); // Box 19
		hipsModel[152] = new ModelRendererTurbo(this, 174, 63, textureX, textureY); // Box 20
		hipsModel[153] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 23
		hipsModel[154] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 27
		hipsModel[155] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 28
		hipsModel[156] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 29
		hipsModel[157] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 30
		hipsModel[158] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 31
		hipsModel[159] = new ModelRendererTurbo(this, 162, 66, textureX, textureY); // Box 32
		hipsModel[160] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 47
		hipsModel[161] = new ModelRendererTurbo(this, 149, 55, textureX, textureY); // Box 48
		hipsModel[162] = new ModelRendererTurbo(this, 151, 48, textureX, textureY); // Box 55
		hipsModel[163] = new ModelRendererTurbo(this, 173, 55, textureX, textureY); // Box 61
		hipsModel[164] = new ModelRendererTurbo(this, 151, 39, textureX, textureY); // Box 62
		hipsModel[165] = new ModelRendererTurbo(this, 173, 54, textureX, textureY); // Box 63
		hipsModel[166] = new ModelRendererTurbo(this, 174, 63, textureX, textureY); // Box 64
		hipsModel[167] = new ModelRendererTurbo(this, 151, 40, textureX, textureY); // Box 65
		hipsModel[168] = new ModelRendererTurbo(this, 174, 63, textureX, textureY); // Box 66
		hipsModel[169] = new ModelRendererTurbo(this, 167, 21, textureX, textureY); // Box 67
		hipsModel[170] = new ModelRendererTurbo(this, 132, 17, textureX, textureY); // Box 75
		hipsModel[171] = new ModelRendererTurbo(this, 151, 48, textureX, textureY); // Box 76
		hipsModel[172] = new ModelRendererTurbo(this, 132, 21, textureX, textureY); // Box 77
		hipsModel[173] = new ModelRendererTurbo(this, 132, 25, textureX, textureY); // Box 0
		hipsModel[174] = new ModelRendererTurbo(this, 132, 30, textureX, textureY); // Box 1
		hipsModel[175] = new ModelRendererTurbo(this, 132, 33, textureX, textureY); // Box 2
		hipsModel[176] = new ModelRendererTurbo(this, 132, 37, textureX, textureY); // Box 3
		hipsModel[177] = new ModelRendererTurbo(this, 132, 42, textureX, textureY); // Box 4
		hipsModel[178] = new ModelRendererTurbo(this, 132, 48, textureX, textureY); // Box 5
		hipsModel[179] = new ModelRendererTurbo(this, 132, 53, textureX, textureY); // Box 6
		hipsModel[180] = new ModelRendererTurbo(this, 132, 53, textureX, textureY); // Box 7
		hipsModel[181] = new ModelRendererTurbo(this, 132, 13, textureX, textureY); // Box 8
		hipsModel[182] = new ModelRendererTurbo(this, 132, 10, textureX, textureY); // Box 9
		hipsModel[183] = new ModelRendererTurbo(this, 132, 10, textureX, textureY); // Box 10
		hipsModel[184] = new ModelRendererTurbo(this, 132, 13, textureX, textureY); // Box 11
		hipsModel[185] = new ModelRendererTurbo(this, 132, 17, textureX, textureY); // Box 12
		hipsModel[186] = new ModelRendererTurbo(this, 132, 21, textureX, textureY); // Box 13
		hipsModel[187] = new ModelRendererTurbo(this, 132, 25, textureX, textureY); // Box 14
		hipsModel[188] = new ModelRendererTurbo(this, 132, 30, textureX, textureY); // Box 15
		hipsModel[189] = new ModelRendererTurbo(this, 132, 33, textureX, textureY); // Box 16
		hipsModel[190] = new ModelRendererTurbo(this, 132, 37, textureX, textureY); // Box 17
		hipsModel[191] = new ModelRendererTurbo(this, 132, 42, textureX, textureY); // Box 18
		hipsModel[192] = new ModelRendererTurbo(this, 132, 48, textureX, textureY); // Box 19
		hipsModel[193] = new ModelRendererTurbo(this, 132, 53, textureX, textureY); // Box 20
		hipsModel[194] = new ModelRendererTurbo(this, 212, 100, textureX, textureY); // Box 23
		hipsModel[195] = new ModelRendererTurbo(this, 212, 90, textureX, textureY); // Box 24
		hipsModel[196] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 25
		hipsModel[197] = new ModelRendererTurbo(this, 201, 71, textureX, textureY); // Box 26
		hipsModel[198] = new ModelRendererTurbo(this, 192, 71, textureX, textureY); // Box 27
		hipsModel[199] = new ModelRendererTurbo(this, 192, 81, textureX, textureY); // Box 28
		hipsModel[200] = new ModelRendererTurbo(this, 181, 71, textureX, textureY); // Box 29
		hipsModel[201] = new ModelRendererTurbo(this, 181, 81, textureX, textureY); // Box 30
		hipsModel[202] = new ModelRendererTurbo(this, 199, 104, textureX, textureY); // Box 31
		hipsModel[203] = new ModelRendererTurbo(this, 199, 94, textureX, textureY); // Box 32
		hipsModel[204] = new ModelRendererTurbo(this, 211, 11, textureX, textureY); // Box 42
		hipsModel[205] = new ModelRendererTurbo(this, 167, 21, textureX, textureY); // Box 1
		hipsModel[206] = new ModelRendererTurbo(this, 159, 21, textureX, textureY); // Box 2
		hipsModel[207] = new ModelRendererTurbo(this, 149, 21, textureX, textureY); // Box 3
		hipsModel[208] = new ModelRendererTurbo(this, 159, 21, textureX, textureY); // Box 4
		hipsModel[209] = new ModelRendererTurbo(this, 167, 21, textureX, textureY); // Box 5
		hipsModel[210] = new ModelRendererTurbo(this, 211, 16, textureX, textureY); // Box 14
		hipsModel[211] = new ModelRendererTurbo(this, 191, 58, textureX, textureY); // Box 39
		hipsModel[212] = new ModelRendererTurbo(this, 156, 92, textureX, textureY); // Box 40
		hipsModel[213] = new ModelRendererTurbo(this, 187, 99, textureX, textureY); // Box 41
		hipsModel[214] = new ModelRendererTurbo(this, 166, 100, textureX, textureY); // Box 42
		hipsModel[215] = new ModelRendererTurbo(this, 201, 125, textureX, textureY); // Box 43
		hipsModel[216] = new ModelRendererTurbo(this, 181, 107, textureX, textureY); // Box 44
		hipsModel[217] = new ModelRendererTurbo(this, 155, 100, textureX, textureY); // Box 45
		hipsModel[218] = new ModelRendererTurbo(this, 175, 99, textureX, textureY); // Box 46
		hipsModel[219] = new ModelRendererTurbo(this, 169, 107, textureX, textureY); // Box 47
		hipsModel[220] = new ModelRendererTurbo(this, 189, 125, textureX, textureY); // Box 48
		hipsModel[221] = new ModelRendererTurbo(this, 157, 107, textureX, textureY); // Box 14
		hipsModel[222] = new ModelRendererTurbo(this, 171, 125, textureX, textureY); // Box 15
		hipsModel[223] = new ModelRendererTurbo(this, 158, 125, textureX, textureY); // Box 16
		hipsModel[224] = new ModelRendererTurbo(this, 171, 113, textureX, textureY); // Box 18
		hipsModel[225] = new ModelRendererTurbo(this, 182, 113, textureX, textureY); // Box 19
		hipsModel[226] = new ModelRendererTurbo(this, 158, 116, textureX, textureY); // Box 20
		hipsModel[227] = new ModelRendererTurbo(this, 184, 134, textureX, textureY); // Box 21
		hipsModel[228] = new ModelRendererTurbo(this, 196, 134, textureX, textureY); // Box 22
		hipsModel[229] = new ModelRendererTurbo(this, 171, 134, textureX, textureY); // Box 23
		hipsModel[230] = new ModelRendererTurbo(this, 152, 144, textureX, textureY); // Box 24
		hipsModel[231] = new ModelRendererTurbo(this, 201, 143, textureX, textureY); // Box 25
		hipsModel[232] = new ModelRendererTurbo(this, 192, 143, textureX, textureY); // Box 26
		hipsModel[233] = new ModelRendererTurbo(this, 179, 143, textureX, textureY); // Box 27
		hipsModel[234] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 0
		hipsModel[235] = new ModelRendererTurbo(this, 235, 82, textureX, textureY); // Box 1
		hipsModel[236] = new ModelRendererTurbo(this, 246, 82, textureX, textureY); // Box 3
		hipsModel[237] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 3
		hipsModel[238] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 4
		hipsModel[239] = new ModelRendererTurbo(this, 174, 22, textureX, textureY); // Box 5
		hipsModel[240] = new ModelRendererTurbo(this, 175, 99, textureX, textureY); // Box 20
		hipsModel[241] = new ModelRendererTurbo(this, 187, 99, textureX, textureY); // Box 21
		hipsModel[242] = new ModelRendererTurbo(this, 156, 92, textureX, textureY); // Box 26
		hipsModel[243] = new ModelRendererTurbo(this, 155, 100, textureX, textureY); // Box 27
		hipsModel[244] = new ModelRendererTurbo(this, 166, 100, textureX, textureY); // Box 28
		hipsModel[245] = new ModelRendererTurbo(this, 157, 107, textureX, textureY); // Box 29
		hipsModel[246] = new ModelRendererTurbo(this, 169, 107, textureX, textureY); // Box 30
		hipsModel[247] = new ModelRendererTurbo(this, 181, 107, textureX, textureY); // Box 31
		hipsModel[248] = new ModelRendererTurbo(this, 182, 113, textureX, textureY); // Box 48
		hipsModel[249] = new ModelRendererTurbo(this, 171, 113, textureX, textureY); // Box 51
		hipsModel[250] = new ModelRendererTurbo(this, 158, 116, textureX, textureY); // Box 52
		hipsModel[251] = new ModelRendererTurbo(this, 173, 71, textureX, textureY); // Box 59
		hipsModel[252] = new ModelRendererTurbo(this, 173, 81, textureX, textureY); // Box 60
		hipsModel[253] = new ModelRendererTurbo(this, 181, 71, textureX, textureY); // Box 61
		hipsModel[254] = new ModelRendererTurbo(this, 181, 81, textureX, textureY); // Box 62
		hipsModel[255] = new ModelRendererTurbo(this, 192, 81, textureX, textureY); // Box 63
		hipsModel[256] = new ModelRendererTurbo(this, 192, 71, textureX, textureY); // Box 64
		hipsModel[257] = new ModelRendererTurbo(this, 201, 71, textureX, textureY); // Box 65
		hipsModel[258] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 66
		hipsModel[259] = new ModelRendererTurbo(this, 212, 71, textureX, textureY); // Box 67
		hipsModel[260] = new ModelRendererTurbo(this, 212, 81, textureX, textureY); // Box 68
		hipsModel[261] = new ModelRendererTurbo(this, 199, 89, textureX, textureY); // Box 20
		hipsModel[262] = new ModelRendererTurbo(this, 205, 64, textureX, textureY); // Box 23
		hipsModel[263] = new ModelRendererTurbo(this, 198, 64, textureX, textureY); // Box 24
		hipsModel[264] = new ModelRendererTurbo(this, 200, 11, textureX, textureY); // Box 49
		hipsModel[265] = new ModelRendererTurbo(this, 200, 16, textureX, textureY); // Box 51
		hipsModel[266] = new ModelRendererTurbo(this, 189, 11, textureX, textureY); // Box 52
		hipsModel[267] = new ModelRendererTurbo(this, 189, 16, textureX, textureY); // Box 53
		hipsModel[268] = new ModelRendererTurbo(this, 211, 23, textureX, textureY); // Box 55
		hipsModel[269] = new ModelRendererTurbo(this, 200, 23, textureX, textureY); // Box 56
		hipsModel[270] = new ModelRendererTurbo(this, 189, 23, textureX, textureY); // Box 57
		hipsModel[271] = new ModelRendererTurbo(this, 211, 28, textureX, textureY); // Box 58
		hipsModel[272] = new ModelRendererTurbo(this, 189, 28, textureX, textureY); // Box 59
		hipsModel[273] = new ModelRendererTurbo(this, 200, 28, textureX, textureY); // Box 60
		hipsModel[274] = new ModelRendererTurbo(this, 211, 16, textureX, textureY); // Box 63
		hipsModel[275] = new ModelRendererTurbo(this, 200, 16, textureX, textureY); // Box 64
		hipsModel[276] = new ModelRendererTurbo(this, 189, 16, textureX, textureY); // Box 65
		hipsModel[277] = new ModelRendererTurbo(this, 200, 23, textureX, textureY); // Box 66
		hipsModel[278] = new ModelRendererTurbo(this, 211, 23, textureX, textureY); // Box 67
		hipsModel[279] = new ModelRendererTurbo(this, 211, 28, textureX, textureY); // Box 68
		hipsModel[280] = new ModelRendererTurbo(this, 200, 28, textureX, textureY); // Box 69
		hipsModel[281] = new ModelRendererTurbo(this, 189, 28, textureX, textureY); // Box 70
		hipsModel[282] = new ModelRendererTurbo(this, 189, 23, textureX, textureY); // Box 71
		hipsModel[283] = new ModelRendererTurbo(this, 200, 41, textureX, textureY); // Box 72
		hipsModel[284] = new ModelRendererTurbo(this, 200, 36, textureX, textureY); // Box 73
		hipsModel[285] = new ModelRendererTurbo(this, 200, 46, textureX, textureY); // Box 74
		hipsModel[286] = new ModelRendererTurbo(this, 193, 36, textureX, textureY); // Box 75
		hipsModel[287] = new ModelRendererTurbo(this, 212, 33, textureX, textureY); // Box 76
		hipsModel[288] = new ModelRendererTurbo(this, 212, 40, textureX, textureY); // Box 77
		hipsModel[289] = new ModelRendererTurbo(this, 212, 47, textureX, textureY); // Box 78
		hipsModel[290] = new ModelRendererTurbo(this, 183, 36, textureX, textureY); // Box 81
		hipsModel[291] = new ModelRendererTurbo(this, 211, 122, textureX, textureY); // Box 6
		hipsModel[292] = new ModelRendererTurbo(this, 211, 134, textureX, textureY); // Box 7
		hipsModel[293] = new ModelRendererTurbo(this, 224, 124, textureX, textureY); // Box 8
		hipsModel[294] = new ModelRendererTurbo(this, 223, 136, textureX, textureY); // Box 9
		hipsModel[295] = new ModelRendererTurbo(this, 241, 124, textureX, textureY); // Box 10
		hipsModel[296] = new ModelRendererTurbo(this, 240, 136, textureX, textureY); // Box 11
		hipsModel[297] = new ModelRendererTurbo(this, 205, 64, textureX, textureY); // Box 12
		hipsModel[298] = new ModelRendererTurbo(this, 198, 64, textureX, textureY); // Box 13
		hipsModel[299] = new ModelRendererTurbo(this, 190, 64, textureX, textureY); // Box 14
		hipsModel[300] = new ModelRendererTurbo(this, 159, 21, textureX, textureY); // Box 17
		hipsModel[301] = new ModelRendererTurbo(this, 149, 21, textureX, textureY); // Box 18
		hipsModel[302] = new ModelRendererTurbo(this, 159, 21, textureX, textureY); // Box 19
		hipsModel[303] = new ModelRendererTurbo(this, 225, 82, textureX, textureY); // Box 20
		hipsModel[304] = new ModelRendererTurbo(this, 179, 16, textureX, textureY); // Box 29
		hipsModel[305] = new ModelRendererTurbo(this, 179, 11, textureX, textureY); // Box 31
		hipsModel[306] = new ModelRendererTurbo(this, 171, 11, textureX, textureY); // Box 32
		hipsModel[307] = new ModelRendererTurbo(this, 170, 15, textureX, textureY); // Box 35
		hipsModel[308] = new ModelRendererTurbo(this, 171, 11, textureX, textureY); // Box 36
		hipsModel[309] = new ModelRendererTurbo(this, 170, 15, textureX, textureY); // Box 37
		hipsModel[310] = new ModelRendererTurbo(this, 222, 77, textureX, textureY); // Box 38
		hipsModel[311] = new ModelRendererTurbo(this, 222, 73, textureX, textureY); // Box 39
		hipsModel[312] = new ModelRendererTurbo(this, 222, 69, textureX, textureY); // Box 40
		hipsModel[313] = new ModelRendererTurbo(this, 222, 64, textureX, textureY); // Box 41
		hipsModel[314] = new ModelRendererTurbo(this, 222, 77, textureX, textureY); // Box 42
		hipsModel[315] = new ModelRendererTurbo(this, 222, 73, textureX, textureY); // Box 43
		hipsModel[316] = new ModelRendererTurbo(this, 181, 23, textureX, textureY); // Box 50
		hipsModel[317] = new ModelRendererTurbo(this, 181, 23, textureX, textureY); // Box 52
		hipsModel[318] = new ModelRendererTurbo(this, 225, 82, textureX, textureY); // Box 66
		hipsModel[319] = new ModelRendererTurbo(this, 235, 82, textureX, textureY); // Box 67
		hipsModel[320] = new ModelRendererTurbo(this, 246, 82, textureX, textureY); // Box 68
		hipsModel[321] = new ModelRendererTurbo(this, 158, 125, textureX, textureY); // Box 69
		hipsModel[322] = new ModelRendererTurbo(this, 171, 125, textureX, textureY); // Box 70
		hipsModel[323] = new ModelRendererTurbo(this, 189, 125, textureX, textureY); // Box 71
		hipsModel[324] = new ModelRendererTurbo(this, 201, 125, textureX, textureY); // Box 72
		hipsModel[325] = new ModelRendererTurbo(this, 196, 134, textureX, textureY); // Box 73
		hipsModel[326] = new ModelRendererTurbo(this, 201, 143, textureX, textureY); // Box 74
		hipsModel[327] = new ModelRendererTurbo(this, 192, 143, textureX, textureY); // Box 75
		hipsModel[328] = new ModelRendererTurbo(this, 171, 134, textureX, textureY); // Box 77
		hipsModel[329] = new ModelRendererTurbo(this, 179, 143, textureX, textureY); // Box 78
		hipsModel[330] = new ModelRendererTurbo(this, 157, 134, textureX, textureY); // Box 79
		hipsModel[331] = new ModelRendererTurbo(this, 166, 143, textureX, textureY); // Box 80
		hipsModel[332] = new ModelRendererTurbo(this, 184, 134, textureX, textureY); // Box 81
		hipsModel[333] = new ModelRendererTurbo(this, 211, 122, textureX, textureY); // Box 82
		hipsModel[334] = new ModelRendererTurbo(this, 224, 124, textureX, textureY); // Box 83
		hipsModel[335] = new ModelRendererTurbo(this, 241, 124, textureX, textureY); // Box 84
		hipsModel[336] = new ModelRendererTurbo(this, 240, 136, textureX, textureY); // Box 85
		hipsModel[337] = new ModelRendererTurbo(this, 223, 136, textureX, textureY); // Box 86
		hipsModel[338] = new ModelRendererTurbo(this, 211, 134, textureX, textureY); // Box 87
		hipsModel[339] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 88
		hipsModel[340] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 0
		hipsModel[341] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 1
		hipsModel[342] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 2
		hipsModel[343] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 3
		hipsModel[344] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 4
		hipsModel[345] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 5
		hipsModel[346] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 6
		hipsModel[347] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 7
		hipsModel[348] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 8
		hipsModel[349] = new ModelRendererTurbo(this, 132, 65, textureX, textureY); // Box 9

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

		hipsModel[10].addShapeBox(16F, -6F, 0F, 3, 6, 1, 0F,0F, -1F, 0F, 0F, -.1F, 0F, -.2F, -.15F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, 3F, 0F); // Box 49
		hipsModel[10].setRotationPoint(0F, -29F, 0F);

		hipsModel[11].addShapeBox(8F, -3F, 0F, 2, 9, 1, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[11].setRotationPoint(0F, -29F, 0F);

		hipsModel[12].addShapeBox(-18F, 0F, 0F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 9
		hipsModel[12].setRotationPoint(0F, -29F, 0F);

		hipsModel[13].addShapeBox(23.7F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.1F, -.7F, 0F, 0F, -.2F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .1F, 0F); // Box 8
		hipsModel[13].setRotationPoint(0F, -29F, 0F);
		hipsModel[13].rotateAngleZ = -0.64577182F;

		hipsModel[14].addShapeBox(22.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[14].setRotationPoint(0F, -29F, 0F);
		hipsModel[14].rotateAngleZ = -0.64577182F;

		hipsModel[15].addShapeBox(21.5F, -17F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[15].setRotationPoint(0F, -29F, 0F);
		hipsModel[15].rotateAngleZ = -0.64577182F;

		hipsModel[16].addShapeBox(19.5F, -18F, 0F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 11
		hipsModel[16].setRotationPoint(0F, -29F, 0F);
		hipsModel[16].rotateAngleZ = -0.64577182F;

		hipsModel[17].addShapeBox(17.5F, -18F, 0F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[17].setRotationPoint(0F, -29F, 0F);
		hipsModel[17].rotateAngleZ = -0.64577182F;

		hipsModel[18].addShapeBox(15.5F, -19F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[18].setRotationPoint(0F, -29F, 0F);
		hipsModel[18].rotateAngleZ = -0.64577182F;

		hipsModel[19].addShapeBox(13.5F, -19F, 0F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[19].setRotationPoint(0F, -29F, 0F);
		hipsModel[19].rotateAngleZ = -0.64577182F;

		hipsModel[20].addShapeBox(19.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 0
		hipsModel[20].setRotationPoint(0F, -29F, 0F);
		hipsModel[20].rotateAngleZ = -0.64577182F;

		hipsModel[21].addShapeBox(21.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.5F, 0F); // Box 1
		hipsModel[21].setRotationPoint(0F, -29F, 0F);
		hipsModel[21].rotateAngleZ = -0.64577182F;

		hipsModel[22].addShapeBox(22.5F, -15F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F); // Box 2
		hipsModel[22].setRotationPoint(0F, -29F, 0F);
		hipsModel[22].rotateAngleZ = -0.64577182F;

		hipsModel[23].addShapeBox(17.5F, -15F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 3
		hipsModel[23].setRotationPoint(0F, -29F, 0F);
		hipsModel[23].rotateAngleZ = -0.64577182F;

		hipsModel[24].addShapeBox(15.5F, -15F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[24].setRotationPoint(0F, -29F, 0F);
		hipsModel[24].rotateAngleZ = -0.64577182F;

		hipsModel[25].addShapeBox(23.7F, -15F, -0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, 0.1F, -.3F, 0F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -0.1F, -0.7F, 0F, .2F, -0.2F, 0F); // Box 6
		hipsModel[25].setRotationPoint(0F, -29F, 0F);
		hipsModel[25].rotateAngleZ = -0.64577182F;

		hipsModel[26].addShapeBox(11.5F, -18F, 0F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[26].setRotationPoint(0F, -29F, 0F);
		hipsModel[26].rotateAngleZ = -0.64577182F;

		hipsModel[27].addShapeBox(10F, 2F, 1F, 3, 5, 1, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[27].setRotationPoint(0F, -29F, 0F);

		hipsModel[28].addShapeBox(13F, 1F, 1F, 3, 3, 1, 0F,0F, -.5F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, -.5F, 2F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F); // Box 13
		hipsModel[28].setRotationPoint(0F, -29F, 0F);

		hipsModel[29].addShapeBox(16F, -3F, 1F, 3, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 3F, 0F, 1F, -.5F, 0F, .5F, -1.5F, 0F, 0F, 2F, 0F); // Box 14
		hipsModel[29].setRotationPoint(0F, -29F, 0F);

		hipsModel[30].addShapeBox(8F, -3F, 1F, 2, 7, 1, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 2F, 0F, 0F, 2F); // Box 15
		hipsModel[30].setRotationPoint(0F, -29F, 0F);

		hipsModel[31].addShapeBox(16F, -6F, 1F, 3, 3, 1, 0F,0F, -1F, 0F, -.2F, -.15F, 0F, -.5F, -.53F, 0F, 0F, -1.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1F); // Box 18
		hipsModel[31].setRotationPoint(0F, -29F, 0F);

		hipsModel[32].addShapeBox(11.5F, -18F, 1F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F); // Box 19
		hipsModel[32].setRotationPoint(0F, -29F, 0F);
		hipsModel[32].rotateAngleZ = -0.64577182F;

		hipsModel[33].addShapeBox(11.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -1.3F, 0F); // Box 20
		hipsModel[33].setRotationPoint(0F, -29F, 0F);
		hipsModel[33].rotateAngleZ = -0.64577182F;

		hipsModel[34].addShapeBox(13.5F, -15F, 1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 1F, 0F, -.8F, 0F); // Box 21
		hipsModel[34].setRotationPoint(0F, -29F, 0F);
		hipsModel[34].rotateAngleZ = -0.64577182F;

		hipsModel[35].addShapeBox(13.5F, -19F, 1F, 2, 4, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, .2F); // Box 22
		hipsModel[35].setRotationPoint(0F, -29F, 0F);
		hipsModel[35].rotateAngleZ = -0.64577182F;

		hipsModel[36].addShapeBox(15.5F, -19F, 1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 23
		hipsModel[36].setRotationPoint(0F, -29F, 0F);
		hipsModel[36].rotateAngleZ = -0.64577182F;

		hipsModel[37].addShapeBox(15.5F, -15F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.7F, 0F, 0F, -.8F, 0F); // Box 24
		hipsModel[37].setRotationPoint(0F, -29F, 0F);
		hipsModel[37].rotateAngleZ = -0.64577182F;

		hipsModel[38].addShapeBox(17.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.7F, 1F); // Box 25
		hipsModel[38].setRotationPoint(0F, -29F, 0F);
		hipsModel[38].rotateAngleZ = -0.64577182F;

		hipsModel[39].addShapeBox(17.5F, -18F, 1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 1F); // Box 26
		hipsModel[39].setRotationPoint(0F, -29F, 0F);
		hipsModel[39].rotateAngleZ = -0.64577182F;

		hipsModel[40].addShapeBox(19.5F, -18F, 1F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, -1F, .5F, 0F, -1.5F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F); // Box 27
		hipsModel[40].setRotationPoint(0F, -29F, 0F);
		hipsModel[40].rotateAngleZ = -0.64577182F;

		hipsModel[41].addShapeBox(19.5F, -15F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.8F, -.5F, 0F, -.5F, 0F); // Box 28
		hipsModel[41].setRotationPoint(0F, -29F, 0F);
		hipsModel[41].rotateAngleZ = -0.64577182F;

		hipsModel[42].addShapeBox(-3F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 29
		hipsModel[42].setRotationPoint(0F, -29F, 0F);

		hipsModel[43].addShapeBox(-3F, 5F, 2F, 3, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F); // Box 30
		hipsModel[43].setRotationPoint(0F, -29F, 0F);

		hipsModel[44].addShapeBox(-6F, 0F, 2F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 31
		hipsModel[44].setRotationPoint(0F, -29F, 0F);

		hipsModel[45].addShapeBox(-6F, 5F, 2F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F); // Box 32
		hipsModel[45].setRotationPoint(0F, -29F, 0F);

		hipsModel[46].addShapeBox(-13F, -1F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 33
		hipsModel[46].setRotationPoint(0F, -29F, 0F);

		hipsModel[47].addShapeBox(-10F, 0F, 2F, 4, 5, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 34
		hipsModel[47].setRotationPoint(0F, -29F, 0F);

		hipsModel[48].addShapeBox(-16F, 0F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[48].setRotationPoint(0F, -29F, 0F);

		hipsModel[49].addShapeBox(-18F, 0F, 2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, -3F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 36
		hipsModel[49].setRotationPoint(0F, -29F, 0F);

		hipsModel[50].addShapeBox(-18F, 5F, 2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -.5F, -1F, -4F, -.7F); // Box 37
		hipsModel[50].setRotationPoint(0F, -29F, 0F);

		hipsModel[51].addShapeBox(-16F, 5F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, -.5F); // Box 38
		hipsModel[51].setRotationPoint(0F, -29F, 0F);

		hipsModel[52].addShapeBox(-13F, 5F, 2F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -4F, .5F, 0F, -3F, 0F); // Box 39
		hipsModel[52].setRotationPoint(0F, -29F, 0F);

		hipsModel[53].addShapeBox(-10F, 5F, 2F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -3F, -.5F); // Box 40
		hipsModel[53].setRotationPoint(0F, -29F, 0F);

		hipsModel[54].addShapeBox(0F, 5F, 2F, 4, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 1F); // Box 41
		hipsModel[54].setRotationPoint(0F, -29F, 0F);

		hipsModel[55].addShapeBox(4F, 5F, 2F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 1F); // Box 42
		hipsModel[55].setRotationPoint(0F, -29F, 0F);

		hipsModel[56].addShapeBox(0F, 0F, 2F, 4, 5, 3, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F); // Box 43
		hipsModel[56].setRotationPoint(0F, -29F, 0F);

		hipsModel[57].addShapeBox(4F, -1F, 2F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 44
		hipsModel[57].setRotationPoint(0F, -29F, 0F);

		hipsModel[58].addShapeBox(8F, 5F, 2F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0F, 0F, -3.5F, 0F); // Box 45
		hipsModel[58].setRotationPoint(0F, -29F, 0F);

		hipsModel[59].addShapeBox(10F, 5F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, .5F, -2F, 0F, -.5F, -5F, 0F, 0F, -3.5F, 0F); // Box 46
		hipsModel[59].setRotationPoint(0F, -29F, 0F);

		hipsModel[60].addShapeBox(10F, -1F, 2F, 2, 6, 2, 0F,0F, 0F, 0F, .5F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 47
		hipsModel[60].setRotationPoint(0F, -29F, 0F);

		hipsModel[61].addShapeBox(8F, -2F, 2F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F); // Box 48
		hipsModel[61].setRotationPoint(0F, -29F, 0F);

		hipsModel[62].addShapeBox(21.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.8F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		hipsModel[62].setRotationPoint(0F, -29F, 0F);
		hipsModel[62].rotateAngleZ = -0.64577182F;

		hipsModel[63].addShapeBox(21.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.4F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 3
		hipsModel[63].setRotationPoint(0F, -29F, 0F);
		hipsModel[63].rotateAngleZ = -0.64577182F;

		hipsModel[64].addShapeBox(20F, -8F, -1F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 6
		hipsModel[64].setRotationPoint(0F, -29F, 0F);
		hipsModel[64].rotateAngleX = -0.34906585F;
		hipsModel[64].rotateAngleY = 0.03490659F;

		hipsModel[65].addShapeBox(22.5F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, .2F, -.2F, 0F, .2F, -.5F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, .3F, 0F, 0F, 0F); // Box 0
		hipsModel[65].setRotationPoint(0F, -29F, 0F);
		hipsModel[65].rotateAngleZ = -0.64577182F;

		hipsModel[66].addShapeBox(22.5F, -15F, 0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.7F, 0F, 0F, -.8F, 0F); // Box 1
		hipsModel[66].setRotationPoint(0F, -29F, 0F);
		hipsModel[66].rotateAngleZ = -0.64577182F;

		hipsModel[67].addShapeBox(23.7F, -15F, 0.5F, 1, 2, 1, 0F,0.2F, -.2F, 0F, 0.1F, -.3F, 0F, -.35F, -.3F, -.3F, 0.2F, -.2F, 0F, .2F, -0.2F, 0F, -0.1F, -0.7F, 0F, -.5F, -1F, -.5F, .2F, -.7F, 0F); // Box 2
		hipsModel[67].setRotationPoint(0F, -29F, 0F);
		hipsModel[67].rotateAngleZ = -0.64577182F;

		hipsModel[68].addShapeBox(23.7F, -17F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, -.1F, -.7F, 0F, -.5F, -1F, -.5F, 0F, -.5F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, -.2F, .2F, -.2F, .2F, .1F, .3F); // Box 3
		hipsModel[68].setRotationPoint(0F, -29F, 0F);
		hipsModel[68].rotateAngleZ = -0.64577182F;

		hipsModel[69].addShapeBox(20F, -8F, -2F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[69].setRotationPoint(0F, -29F, 0F);
		hipsModel[69].rotateAngleX = -0.34906585F;
		hipsModel[69].rotateAngleY = 0.03490659F;

		hipsModel[70].addShapeBox(-18F, 0F, -1F, 2, 2, 2, 0F,0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 7
		hipsModel[70].setRotationPoint(0F, -29F, 0F);

		hipsModel[71].addShapeBox(-14.5F, -13.5F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 9
		hipsModel[71].setRotationPoint(0F, -29F, 0F);
		hipsModel[71].rotateAngleZ = 0.85521133F;

		hipsModel[72].addShapeBox(-13.3F, -18.5F, -2F, 4, 4, 4, 0F,0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.5F, -.5F); // Box 10
		hipsModel[72].setRotationPoint(0F, -29F, 0F);
		hipsModel[72].rotateAngleZ = 1.18682389F;

		hipsModel[73].addShapeBox(-13.6F, -20.2F, -2F, 3, 4, 4, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 13
		hipsModel[73].setRotationPoint(0F, -29F, 0F);
		hipsModel[73].rotateAngleZ = 1.32645023F;

		hipsModel[74].addShapeBox(-15.6F, -21.9F, -2F, 5, 4, 4, 0F,0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -1F); // Box 14
		hipsModel[74].setRotationPoint(0F, -29F, 0F);
		hipsModel[74].rotateAngleZ = 1.46607657F;

		hipsModel[75].addShapeBox(-27.89F, -15.79F, 0F, 7, 4, 2, 0F,2F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, .5F, -.5F, -.5F, .5F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -.5F, -.5F, -.5F); // Box 0
		hipsModel[75].setRotationPoint(0F, -29F, 0F);
		hipsModel[75].rotateAngleZ = 1.13446401F;

		hipsModel[76].addShapeBox(-27.89F, -15.79F, -2F, 7, 4, 2, 0F,0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 2F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0.5F, -0.5F, 0F); // Box 8
		hipsModel[76].setRotationPoint(0F, -29F, 0F);
		hipsModel[76].rotateAngleZ = 1.13446401F;

		hipsModel[77].addShapeBox(-18F, 0F, -2F, 2, 5, 2, 0F,.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -3F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 9
		hipsModel[77].setRotationPoint(0F, -29F, 0F);

		hipsModel[78].addShapeBox(-18F, 5F, -2F, 2, 6, 2, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 10
		hipsModel[78].setRotationPoint(0F, -29F, 0F);

		hipsModel[79].addShapeBox(-16F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[79].setRotationPoint(0F, -29F, 0F);

		hipsModel[80].addShapeBox(-13F, -1F, -2F, 3, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[80].setRotationPoint(0F, -29F, 0F);

		hipsModel[81].addShapeBox(-10F, 0F, -2F, 4, 11, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 13
		hipsModel[81].setRotationPoint(0F, -29F, 0F);

		hipsModel[82].addShapeBox(-6F, 0F, -2F, 3, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[82].setRotationPoint(0F, -29F, 0F);

		hipsModel[83].addShapeBox(-3F, 0F, -2F, 3, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.2F, 0F); // Box 15
		hipsModel[83].setRotationPoint(0F, -29F, 0F);

		hipsModel[84].addShapeBox(0F, 0F, -2F, 4, 13, 2, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 16
		hipsModel[84].setRotationPoint(0F, -29F, 0F);

		hipsModel[85].addShapeBox(4F, -1F, -2F, 4, 14, 2, 0F,0F, .5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[85].setRotationPoint(0F, -29F, 0F);

		hipsModel[86].addShapeBox(8F, -2F, -2F, 2, 14, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 18
		hipsModel[86].setRotationPoint(0F, -29F, 0F);

		hipsModel[87].addShapeBox(10F, 5F, -2F, 2, 7, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[87].setRotationPoint(0F, -29F, 0F);

		hipsModel[88].addShapeBox(16F, -6F, -1F, 3, 6, 1, 0F,0F, -1F, 0F, -0.2F, -0.15F, 0F, 0F, -0.1F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 22
		hipsModel[88].setRotationPoint(0F, -29F, 0F);

		hipsModel[89].addShapeBox(8F, -3F, -1F, 2, 9, 1, 0F,0F, -1.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[89].setRotationPoint(0F, -29F, 0F);

		hipsModel[90].addShapeBox(16F, -6F, -2F, 3, 3, 1, 0F,0F, -1.5F, 0F, -0.5F, -0.53F, 0F, -0.2F, -0.15F, 0F, 0F, -1F, 0F, 0F, 2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 25
		hipsModel[90].setRotationPoint(0F, -29F, 0F);

		hipsModel[91].addShapeBox(16F, -3F, -2F, 3, 3, 1, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0.5F, -1.5F, 0F, 1F, -0.5F, 0F, 0F, 3F, 0F); // Box 26
		hipsModel[91].setRotationPoint(0F, -29F, 0F);

		hipsModel[92].addShapeBox(13F, 1F, -2F, 3, 3, 1, 0F,0F, -0.5F, 2F, 0F, 2F, 1F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 2F, 0F); // Box 28
		hipsModel[92].setRotationPoint(0F, -29F, 0F);

		hipsModel[93].addShapeBox(10F, 2F, -2F, 3, 5, 1, 0F,0F, -1F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[93].setRotationPoint(0F, -29F, 0F);

		hipsModel[94].addShapeBox(8F, -3F, -2F, 2, 7, 1, 0F,0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[94].setRotationPoint(0F, -29F, 0F);

		hipsModel[95].addShapeBox(11.5F, -18F, -1F, 2, 6, 1, 0F,0F, -2F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[95].setRotationPoint(0F, -29F, 0F);
		hipsModel[95].rotateAngleZ = -0.64577182F;

		hipsModel[96].addShapeBox(13.5F, -19F, -1F, 2, 7, 1, 0F,0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		hipsModel[96].setRotationPoint(0F, -29F, 0F);
		hipsModel[96].rotateAngleZ = -0.64577182F;

		hipsModel[97].addShapeBox(15.5F, -19F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		hipsModel[97].setRotationPoint(0F, -29F, 0F);
		hipsModel[97].rotateAngleZ = -0.64577182F;

		hipsModel[98].addShapeBox(15.5F, -15F, -1F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[98].setRotationPoint(0F, -29F, 0F);
		hipsModel[98].rotateAngleZ = -0.64577182F;

		hipsModel[99].addShapeBox(17.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F); // Box 36
		hipsModel[99].setRotationPoint(0F, -29F, 0F);
		hipsModel[99].rotateAngleZ = -0.64577182F;

		hipsModel[100].addShapeBox(17.5F, -18F, -1F, 2, 3, 1, 0F,0F, .1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[100].setRotationPoint(0F, -29F, 0F);
		hipsModel[100].rotateAngleZ = -0.64577182F;

		hipsModel[101].addShapeBox(19.5F, -18F, -1F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		hipsModel[101].setRotationPoint(0F, -29F, 0F);
		hipsModel[101].rotateAngleZ = -0.64577182F;

		hipsModel[102].addShapeBox(19.5F, -15F, -1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[102].setRotationPoint(0F, -29F, 0F);
		hipsModel[102].rotateAngleZ = -0.64577182F;

		hipsModel[103].addShapeBox(20F, -8.5F, -0.5F, 3, 3, 1, 0F,-2F, -.8F, 0F, 2F, 0F, 0F, 1F, -.8F, 0F, -2F, -1.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.3F, -.5F, 0F, -.5F); // Box 40
		hipsModel[103].setRotationPoint(0F, -29F, 0F);
		hipsModel[103].rotateAngleX = 0.34906585F;
		hipsModel[103].rotateAngleY = 0.03490659F;

		hipsModel[104].addShapeBox(20F, -8.5F, -1.5F, 3, 3, 1, 0F,-2F, -1.5F, 0F, 1F, -0.8F, 0F, 2F, 0F, 0F, -2F, -0.8F, 0F, -0.5F, 0F, -.5F, -0.5F, 0F, -.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[104].setRotationPoint(0F, -29F, 0F);
		hipsModel[104].rotateAngleX = 0.34906585F;
		hipsModel[104].rotateAngleY = 0.03490659F;

		hipsModel[105].addShapeBox(11.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F); // Box 42
		hipsModel[105].setRotationPoint(0F, -29F, 0F);
		hipsModel[105].rotateAngleZ = -0.64577182F;

		hipsModel[106].addShapeBox(11.5F, -18F, -2F, 2, 3, 1, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		hipsModel[106].setRotationPoint(0F, -29F, 0F);
		hipsModel[106].rotateAngleZ = -0.64577182F;

		hipsModel[107].addShapeBox(13.5F, -15F, -2F, 2, 3, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[107].setRotationPoint(0F, -29F, 0F);
		hipsModel[107].rotateAngleZ = -0.64577182F;

		hipsModel[108].addShapeBox(13.5F, -19F, -2F, 2, 4, 1, 0F,0F, -1.5F, 0F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		hipsModel[108].setRotationPoint(0F, -29F, 0F);
		hipsModel[108].rotateAngleZ = -0.64577182F;

		hipsModel[109].addShapeBox(15.5F, -19F, -3F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		hipsModel[109].setRotationPoint(0F, -29F, 0F);
		hipsModel[109].rotateAngleZ = -0.64577182F;

		hipsModel[110].addShapeBox(15.5F, -15F, -3F, 2, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1.7F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F); // Box 47
		hipsModel[110].setRotationPoint(0F, -29F, 0F);
		hipsModel[110].rotateAngleZ = -0.64577182F;

		hipsModel[111].addShapeBox(17.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F); // Box 48
		hipsModel[111].setRotationPoint(0F, -29F, 0F);
		hipsModel[111].rotateAngleZ = -0.64577182F;

		hipsModel[112].addShapeBox(17.5F, -18F, -2F, 2, 3, 1, 0F,0F, -0.5F, 1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[112].setRotationPoint(0F, -29F, 0F);
		hipsModel[112].rotateAngleZ = -0.64577182F;

		hipsModel[113].addShapeBox(19.5F, -18F, -2F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 50
		hipsModel[113].setRotationPoint(0F, -29F, 0F);
		hipsModel[113].rotateAngleZ = -0.64577182F;

		hipsModel[114].addShapeBox(19.5F, -15F, -2F, 2, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 51
		hipsModel[114].setRotationPoint(0F, -29F, 0F);
		hipsModel[114].rotateAngleZ = -0.64577182F;

		hipsModel[115].addShapeBox(21.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[115].setRotationPoint(0F, -29F, 0F);
		hipsModel[115].rotateAngleZ = -0.64577182F;

		hipsModel[116].addShapeBox(21.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F); // Box 53
		hipsModel[116].setRotationPoint(0F, -29F, 0F);
		hipsModel[116].rotateAngleZ = -0.64577182F;

		hipsModel[117].addShapeBox(22.5F, -15F, -1.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F); // Box 54
		hipsModel[117].setRotationPoint(0F, -29F, 0F);
		hipsModel[117].rotateAngleZ = -0.64577182F;

		hipsModel[118].addShapeBox(22.5F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.8F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 55
		hipsModel[118].setRotationPoint(0F, -29F, 0F);
		hipsModel[118].rotateAngleZ = -0.64577182F;

		hipsModel[119].addShapeBox(23.7F, -15F, -1.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, -0.35F, -0.3F, -0.3F, 0.1F, -0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.7F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0.2F, -0.2F, 0F); // Box 56
		hipsModel[119].setRotationPoint(0F, -29F, 0F);
		hipsModel[119].rotateAngleZ = -0.64577182F;

		hipsModel[120].addShapeBox(23.7F, -17F, -1.5F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -1F, -0.5F, -0.1F, -0.7F, 0F, 0F, -0.2F, 0F, 0.2F, 0.1F, 0.3F, -0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F); // Box 57
		hipsModel[120].setRotationPoint(0F, -29F, 0F);
		hipsModel[120].rotateAngleZ = -0.64577182F;

		hipsModel[121].addShapeBox(10F, -1F, -4F, 2, 6, 2, 0F,0F, -3F, 0F, -1F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[121].setRotationPoint(0F, -29F, 0F);

		hipsModel[122].addShapeBox(8F, -2F, -4F, 2, 7, 2, 0F,0F, -3F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		hipsModel[122].setRotationPoint(0F, -29F, 0F);

		hipsModel[123].addShapeBox(4F, -1F, -4F, 4, 6, 2, 0F,0F, -2F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[123].setRotationPoint(0F, -29F, 0F);

		hipsModel[124].addShapeBox(0F, 0F, -5F, 4, 5, 3, 0F,0F, -2F, 1F, 0F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		hipsModel[124].setRotationPoint(0F, -29F, 0F);

		hipsModel[125].addShapeBox(-3F, 0F, -6F, 3, 5, 4, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[125].setRotationPoint(0F, -29F, 0F);

		hipsModel[126].addShapeBox(-6F, 0F, -6F, 3, 5, 4, 0F,0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[126].setRotationPoint(0F, -29F, 0F);

		hipsModel[127].addShapeBox(-10F, 0F, -5F, 4, 5, 3, 0F,0F, -1F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[127].setRotationPoint(0F, -29F, 0F);

		hipsModel[128].addShapeBox(-13F, -1F, -4F, 3, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[128].setRotationPoint(0F, -29F, 0F);

		hipsModel[129].addShapeBox(-16F, 0F, -4F, 3, 5, 2, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[129].setRotationPoint(0F, -29F, 0F);

		hipsModel[130].addShapeBox(-18F, 0F, -4F, 2, 5, 2, 0F,-1F, -3F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0.5F, -3F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 67
		hipsModel[130].setRotationPoint(0F, -29F, 0F);

		hipsModel[131].addShapeBox(10F, 5F, -4F, 2, 7, 2, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[131].setRotationPoint(0F, -29F, 0F);

		hipsModel[132].addShapeBox(8F, 5F, -4F, 2, 8, 2, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 69
		hipsModel[132].setRotationPoint(0F, -29F, 0F);

		hipsModel[133].addShapeBox(4F, 5F, -4F, 4, 8, 2, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[133].setRotationPoint(0F, -29F, 0F);

		hipsModel[134].addShapeBox(0F, 5F, -5F, 4, 8, 3, 0F,0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 71
		hipsModel[134].setRotationPoint(0F, -29F, 0F);

		hipsModel[135].addShapeBox(-3F, 5F, -6F, 3, 7, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F); // Box 72
		hipsModel[135].setRotationPoint(0F, -29F, 0F);

		hipsModel[136].addShapeBox(-6F, 5F, -6F, 3, 6, 4, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[136].setRotationPoint(0F, -29F, 0F);

		hipsModel[137].addShapeBox(-10F, 5F, -5F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 74
		hipsModel[137].setRotationPoint(0F, -29F, 0F);

		hipsModel[138].addShapeBox(-13F, 5F, -4F, 3, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[138].setRotationPoint(0F, -29F, 0F);

		hipsModel[139].addShapeBox(-16F, 5F, -4F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[139].setRotationPoint(0F, -29F, 0F);

		hipsModel[140].addShapeBox(-18F, 5F, -4F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -4F, -0.7F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 77
		hipsModel[140].setRotationPoint(0F, -29F, 0F);

		hipsModel[141].addShapeBox(11F, -24F, 3F, 15, 15, 1, 0F,-6.5F, -6.5F, 0F, -6.5F, -7F, 1F, -6.5F, -7F, -1.97F, -6.5F, -6.5F, -0.95F, -6.5F, -6.5F, 0F, -6.5F, -6F, 1F, -6.5F, -6F, -1.65F, -6.5F, -6.5F, -0.95F); // Box 137
		hipsModel[141].setRotationPoint(0F, -29F, 0F);
		hipsModel[141].rotateAngleZ = -0.64577182F;

		hipsModel[142].addShapeBox(11F, -24F, -4F, 15, 15, 1, 0F,-6.5F, -6.5F, -0.95F, -6.5F, -7F, -1.97F, -6.5F, -7F, 1F, -6.5F, -6.5F, 0F, -6.5F, -6.5F, -0.95F, -6.5F, -6F, -1.65F, -6.5F, -6F, 1F, -6.5F, -6.5F, 0F); // Box 138
		hipsModel[142].setRotationPoint(0F, -29F, 0F);
		hipsModel[142].rotateAngleZ = -0.64577182F;

		hipsModel[143].addShapeBox(2F, -2F, -1.5F, 2, 4, 3, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[143].setRotationPoint(0F, -29F, 0F);

		hipsModel[144].addShapeBox(-4F, -2F, -1.5F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[144].setRotationPoint(0F, -29F, 0F);

		hipsModel[145].addShapeBox(-2F, -1.5F, -1.5F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[145].setRotationPoint(0F, -29F, 0F);

		hipsModel[146].addShapeBox(2F, -2F, 1.5F, 2, 4, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 9
		hipsModel[146].setRotationPoint(0F, -29F, 0F);

		hipsModel[147].addShapeBox(-2F, -1.5F, 1.5F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 10
		hipsModel[147].setRotationPoint(0F, -29F, 0F);

		hipsModel[148].addShapeBox(-4F, -2F, 1.5F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 11
		hipsModel[148].setRotationPoint(0F, -29F, 0F);

		hipsModel[149].addShapeBox(4F, -2.5F, 3.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[149].setRotationPoint(0F, -29F, 0F);

		hipsModel[150].addShapeBox(2F, -1.5F, 3F, 2, 4, 1, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2.5F, 0F, -.5F, 2.5F); // Box 18
		hipsModel[150].setRotationPoint(0F, -29F, 0F);

		hipsModel[151].addShapeBox(-2F, -1F, 3F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 19
		hipsModel[151].setRotationPoint(0F, -29F, 0F);

		hipsModel[152].addShapeBox(-4F, -1.5F, 3F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 2.5F, 0F, -.5F, 2.5F); // Box 20
		hipsModel[152].setRotationPoint(0F, -29F, 0F);

		hipsModel[153].addShapeBox(4F, -0.5F, 5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 23
		hipsModel[153].setRotationPoint(0F, -29F, 0F);

		hipsModel[154].addShapeBox(21F, -16F, -1.5F, 1, 1, 3, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .5F); // Box 27
		hipsModel[154].setRotationPoint(0F, -29F, 0F);
		hipsModel[154].rotateAngleZ = -0.64577182F;

		hipsModel[155].addShapeBox(21F, -17F, 0F, 1, 1, 1, 0F,0F, .4F, 0F, 0F, .2F, 0F, 0F, -.4F, .5F, 0F, -.2F, .7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, 0F, 0F, .8F); // Box 28
		hipsModel[155].setRotationPoint(0F, -29F, 0F);
		hipsModel[155].rotateAngleZ = -0.64577182F;

		hipsModel[156].addShapeBox(21F, -15F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F, 0F, -.3F, 0.3F); // Box 29
		hipsModel[156].setRotationPoint(0F, -29F, 0F);
		hipsModel[156].rotateAngleZ = -0.64577182F;

		hipsModel[157].addShapeBox(21F, -17F, -1F, 1, 1, 1, 0F,0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[157].setRotationPoint(0F, -29F, 0F);
		hipsModel[157].rotateAngleZ = -0.64577182F;

		hipsModel[158].addShapeBox(21F, -14.3F, -1F, 1, 1, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.7F, 0F, -0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F); // Box 31
		hipsModel[158].setRotationPoint(0F, -29F, 0F);
		hipsModel[158].rotateAngleZ = -0.64577182F;

		hipsModel[159].addShapeBox(21F, -14.3F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 0F, -0.4F, 0.5F, 0F, -0.2F, 0.7F); // Box 32
		hipsModel[159].setRotationPoint(0F, -29F, 0F);
		hipsModel[159].rotateAngleZ = -0.64577182F;

		hipsModel[160].addShapeBox(13.5F, -16F, -3.5F, 2, 1, 7, 0F,0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F); // Box 47
		hipsModel[160].setRotationPoint(0F, -29F, 0F);
		hipsModel[160].rotateAngleZ = -0.64577182F;

		hipsModel[161].addShapeBox(11.5F, -16F, -2.5F, 2, 1, 5, 0F,.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, -.5F, .6F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, .6F, -.5F, -.5F); // Box 48
		hipsModel[161].setRotationPoint(0F, -29F, 0F);
		hipsModel[161].rotateAngleZ = -0.64577182F;

		hipsModel[162].addShapeBox(-5F, 2F, 5F, 9, 1, 2, 0F,-.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F); // Box 55
		hipsModel[162].setRotationPoint(0F, -29F, 0F);

		hipsModel[163].addShapeBox(2F, -2F, -3.5F, 2, 4, 2, 0F,0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		hipsModel[163].setRotationPoint(0F, -29F, 0F);

		hipsModel[164].addShapeBox(-2F, -1.5F, -3.5F, 4, 3, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[164].setRotationPoint(0F, -29F, 0F);

		hipsModel[165].addShapeBox(-4F, -2F, -3.5F, 2, 4, 2, 0F,0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[165].setRotationPoint(0F, -29F, 0F);

		hipsModel[166].addShapeBox(2F, -1.5F, -4F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 64
		hipsModel[166].setRotationPoint(0F, -29F, 0F);

		hipsModel[167].addShapeBox(-2F, -1F, -4F, 4, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[167].setRotationPoint(0F, -29F, 0F);

		hipsModel[168].addShapeBox(-4F, -1.5F, -4F, 2, 4, 1, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		hipsModel[168].setRotationPoint(0F, -29F, 0F);

		hipsModel[169].addShapeBox(4F, -2.5F, -5.5F, 1, 7, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		hipsModel[169].setRotationPoint(0F, -29F, 0F);

		hipsModel[170].addShapeBox(25F, 2.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F); // Box 75
		hipsModel[170].setRotationPoint(0F, -29F, 0F);

		hipsModel[171].addShapeBox(-5F, 2F, -7F, 9, 1, 2, 0F,-.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -.2F, 0F, 0F); // Box 76
		hipsModel[171].setRotationPoint(0F, -29F, 0F);

		hipsModel[172].addShapeBox(25F, 3.5F, 1.5F, 1, 2, 1, 0F,0F, .5F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, .5F, -.2F, 2F, -.5F, -1F, -2F, 0F, -1F, -2F, 0F, 1F, 2F, -.5F, 1F); // Box 77
		hipsModel[172].setRotationPoint(0F, -29F, 0F);

		hipsModel[173].addShapeBox(23F, 5.5F, 2.5F, 1, 3, 1, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 5F, -1F, -2.5F, -6F, 0F, -2.5F, -6F, 0F, 2.5F, 5F, -1F, 2.5F); // Box 0
		hipsModel[173].setRotationPoint(0F, -29F, 0F);

		hipsModel[174].addShapeBox(13F, 7.5F, 5F, 5, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1
		hipsModel[174].setRotationPoint(0F, -29F, 0F);

		hipsModel[175].addShapeBox(8F, 6.5F, 6.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, .5F, 4F, -1F, .5F, 4F, -1F, -.5F, -5F, 0F, -.5F); // Box 2
		hipsModel[175].setRotationPoint(0F, -29F, 0F);

		hipsModel[176].addShapeBox(6F, 3.5F, 6.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 3
		hipsModel[176].setRotationPoint(0F, -29F, 0F);

		hipsModel[177].addShapeBox(6F, -0.5F, 6.5F, 1, 4, 1, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[177].setRotationPoint(0F, -29F, 0F);

		hipsModel[178].addShapeBox(6F, -3.5F, 6.5F, 1, 3, 1, 0F,0F, -.3F, 2F, 0F, -.3F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[178].setRotationPoint(0F, -29F, 0F);

		hipsModel[179].addShapeBox(6F, -5.5F, 4.5F, 1, 2, 1, 0F,0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		hipsModel[179].setRotationPoint(0F, -29F, 0F);

		hipsModel[180].addShapeBox(6F, -5.5F, -2.5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		hipsModel[180].setRotationPoint(0F, -29F, 0F);

		hipsModel[181].addShapeBox(25F, 1.5F, 1.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[181].setRotationPoint(0F, -29F, 0F);

		hipsModel[182].addShapeBox(25F, 0.5F, 1.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 9
		hipsModel[182].setRotationPoint(0F, -29F, 0F);

		hipsModel[183].addShapeBox(25F, 0.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 10
		hipsModel[183].setRotationPoint(0F, -29F, 0F);

		hipsModel[184].addShapeBox(25F, 1.5F, -2.5F, 1, 1, 1, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[184].setRotationPoint(0F, -29F, 0F);

		hipsModel[185].addShapeBox(25F, 2.5F, -2.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F); // Box 12
		hipsModel[185].setRotationPoint(0F, -29F, 0F);

		hipsModel[186].addShapeBox(25F, 3.5F, -2.5F, 1, 2, 1, 0F,0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 2F, -0.5F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, -0.5F, -1F); // Box 13
		hipsModel[186].setRotationPoint(0F, -29F, 0F);

		hipsModel[187].addShapeBox(23F, 5.5F, -3.5F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 5F, -1F, 2.5F, -6F, 0F, 2.5F, -6F, 0F, -2.5F, 5F, -1F, -2.5F); // Box 14
		hipsModel[187].setRotationPoint(0F, -29F, 0F);

		hipsModel[188].addShapeBox(13F, 7.5F, -6F, 5, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 15
		hipsModel[188].setRotationPoint(0F, -29F, 0F);

		hipsModel[189].addShapeBox(8F, 6.5F, -7.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, 4F, -1F, -0.5F, 4F, -1F, 0.5F, -5F, 0F, 0.5F); // Box 16
		hipsModel[189].setRotationPoint(0F, -29F, 0F);

		hipsModel[190].addShapeBox(6F, 3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0F, 0F); // Box 17
		hipsModel[190].setRotationPoint(0F, -29F, 0F);

		hipsModel[191].addShapeBox(6F, -0.5F, -7.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[191].setRotationPoint(0F, -29F, 0F);

		hipsModel[192].addShapeBox(6F, -3.5F, -7.5F, 1, 3, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.3F, 2F, 0F, -0.3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 19
		hipsModel[192].setRotationPoint(0F, -29F, 0F);

		hipsModel[193].addShapeBox(6F, -5.5F, -5.5F, 1, 2, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 20
		hipsModel[193].setRotationPoint(0F, -29F, 0F);

		hipsModel[194].addShapeBox(11.2F, -12F, 0F, 1, 5, 2, 0F,0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 23
		hipsModel[194].setRotationPoint(0F, -29F, 0F);
		hipsModel[194].rotateAngleZ = -0.9424778F;

		hipsModel[195].addShapeBox(11.2F, -16F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[195].setRotationPoint(0F, -29F, 0F);
		hipsModel[195].rotateAngleZ = -0.9424778F;

		hipsModel[196].addShapeBox(9.2F, -12F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, .5F); // Box 25
		hipsModel[196].setRotationPoint(0F, -29F, 0F);
		hipsModel[196].rotateAngleZ = -0.9424778F;

		hipsModel[197].addShapeBox(9.2F, -17F, 2F, 2, 5, 1, 0F,0F, 0F, 0F, .5F, -1F, 0F, -.5F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F); // Box 26
		hipsModel[197].setRotationPoint(0F, -29F, 0F);
		hipsModel[197].rotateAngleZ = -0.9424778F;

		hipsModel[198].addShapeBox(7.2F, -17F, 2F, 2, 5, 1, 0F,-.5F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.8F); // Box 27
		hipsModel[198].setRotationPoint(0F, -29F, 0F);
		hipsModel[198].rotateAngleZ = -0.9424778F;

		hipsModel[199].addShapeBox(7.2F, -12F, 2F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 28
		hipsModel[199].setRotationPoint(0F, -29F, 0F);
		hipsModel[199].rotateAngleZ = -0.9424778F;

		hipsModel[200].addShapeBox(6.2F, -18F, 2F, 1, 6, 1, 0F,.5F, 0F, 0F, .5F, -.6F, 0F, .5F, -.6F, 0F, -0.5F, -.3F, -0.2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .8F, .5F, 0F, .5F); // Box 29
		hipsModel[200].setRotationPoint(0F, -29F, 0F);
		hipsModel[200].rotateAngleZ = -0.9424778F;

		hipsModel[201].addShapeBox(4.2F, -12F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -1.5F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F); // Box 30
		hipsModel[201].setRotationPoint(0F, -29F, 0F);
		hipsModel[201].rotateAngleZ = -0.9424778F;

		hipsModel[202].addShapeBox(4.2F, -12F, 0F, 1, 5, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 31
		hipsModel[202].setRotationPoint(0F, -29F, 0F);
		hipsModel[202].rotateAngleZ = -0.9424778F;

		hipsModel[203].addShapeBox(5.2F, -18F, 0F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 32
		hipsModel[203].setRotationPoint(0F, -29F, 0F);
		hipsModel[203].rotateAngleZ = -0.9424778F;

		hipsModel[204].addShapeBox(14.5F, -19.5F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 42
		hipsModel[204].setRotationPoint(0F, -29F, 0F);
		hipsModel[204].rotateAngleZ = -0.64577182F;

		hipsModel[205].addShapeBox(-5F, -2.5F, -5.5F, 1, 7, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[205].setRotationPoint(0F, -29F, 0F);

		hipsModel[206].addShapeBox(-5F, -3F, -3.5F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[206].setRotationPoint(0F, -29F, 0F);

		hipsModel[207].addShapeBox(-5F, -3F, -2.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[207].setRotationPoint(0F, -29F, 1F);

		hipsModel[208].addShapeBox(-5F, -3F, 1.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[208].setRotationPoint(0F, -29F, 0F);

		hipsModel[209].addShapeBox(-5F, -2.5F, 3.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[209].setRotationPoint(0F, -29F, 0F);

		hipsModel[210].addShapeBox(14.5F, -19.5F, 1F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, -.8F, 0F, 0F, -1.7F, .3F, -1F, -1.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, 0.5F); // Box 14
		hipsModel[210].setRotationPoint(0F, -29F, 0F);
		hipsModel[210].rotateAngleZ = -0.64577182F;

		hipsModel[211].addShapeBox(5F, -2.5F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[211].setRotationPoint(0F, -29F, 0F);

		hipsModel[212].addShapeBox(5F, -2.2F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		hipsModel[212].setRotationPoint(0F, -29F, 0F);

		hipsModel[213].addShapeBox(5F, -2.2F, 2F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, .5F, 0F, -2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[213].setRotationPoint(0F, -29F, 0F);

		hipsModel[214].addShapeBox(5F, -0.2F, 4F, 2, 2, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		hipsModel[214].setRotationPoint(0F, -29F, 0F);

		hipsModel[215].addShapeBox(5F, 7F, 5F, 2, 3, 2, 0F,0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .5F, .2F, .5F, .5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 1F, 0F, 1F); // Box 43
		hipsModel[215].setRotationPoint(0F, -29F, 0F);

		hipsModel[216].addShapeBox(5F, 1.8F, 4F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F); // Box 44
		hipsModel[216].setRotationPoint(0F, -29F, 0F);

		hipsModel[217].addShapeBox(7F, -0.2F, 4F, 3, 2, 2, 0F,0F, 0F, -.5F, -1F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 45
		hipsModel[217].setRotationPoint(0F, -29F, 0F);

		hipsModel[218].addShapeBox(7F, -2.2F, 2F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		hipsModel[218].setRotationPoint(0F, -29F, 0F);

		hipsModel[219].addShapeBox(7F, 1.8F, 4F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F); // Box 47
		hipsModel[219].setRotationPoint(0F, -29F, 0F);

		hipsModel[220].addShapeBox(7F, 7F, 4F, 3, 3, 2, 0F,0F, .2F, -1F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F); // Box 48
		hipsModel[220].setRotationPoint(0F, -29F, 0F);

		hipsModel[221].addShapeBox(10F, 1.8F, 2F, 2, 2, 3, 0F,0F, 0F, 0F, -.5F, -2F, 0F, -.5F, -2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, .5F); // Box 14
		hipsModel[221].setRotationPoint(0F, -29F, 0F);

		hipsModel[222].addShapeBox(10F, 7F, 2F, 4, 3, 4, 0F,0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -3.5F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, .5F); // Box 15
		hipsModel[222].setRotationPoint(0F, -29F, 0F);

		hipsModel[223].addShapeBox(14F, 6.8F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, .5F, -3.2F, 0F, .2F, -3.2F, -3F, 0F, 0F, -1.5F, 0F, .2F, -2F, .5F, .2F, 0F, .2F, .2F, -3F, 0F, .2F, 0F); // Box 16
		hipsModel[223].setRotationPoint(0F, -29F, 0F);

		hipsModel[224].addShapeBox(7F, 3.8F, 4F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 18
		hipsModel[224].setRotationPoint(0F, -29F, 0F);

		hipsModel[225].addShapeBox(5F, 3.8F, 4F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1.5F); // Box 19
		hipsModel[225].setRotationPoint(0F, -29F, 0F);

		hipsModel[226].addShapeBox(10F, 3.8F, 1F, 2, 3, 4, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2.5F, 0F, 0F, 1F); // Box 20
		hipsModel[226].setRotationPoint(0F, -29F, 0F);

		hipsModel[227].addShapeBox(7F, 10F, 4F, 3, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 21
		hipsModel[227].setRotationPoint(0F, -29F, 0F);

		hipsModel[228].addShapeBox(4F, 10F, 6F, 3, 4, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1.5F); // Box 22
		hipsModel[228].setRotationPoint(0F, -29F, 0F);

		hipsModel[229].addShapeBox(10F, 10F, 4F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F); // Box 23
		hipsModel[229].setRotationPoint(0F, -29F, 0F);

		hipsModel[230].addShapeBox(14F, 9.8F, 0F, 2, 4, 4, 0F,0F, -.2F, -2F, -.5F, -.2F, 0F, -.8F, -.2F, -3F, 0F, -.2F, 0F, 0F, .2F, -2F, .5F, .2F, -.5F, 0F, .2F, -2F, 0F, .2F, .5F); // Box 24
		hipsModel[230].setRotationPoint(0F, -29F, 0F);

		hipsModel[231].addShapeBox(4F, 14F, 6F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0F, 2F); // Box 25
		hipsModel[231].setRotationPoint(0F, -29F, 0F);

		hipsModel[232].addShapeBox(7F, 14F, 5F, 3, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.3F, 0F, 0F, 2.5F); // Box 26
		hipsModel[232].setRotationPoint(0F, -29F, 0F);

		hipsModel[233].addShapeBox(10F, 14F, 4F, 4, 4, 2, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.3F); // Box 27
		hipsModel[233].setRotationPoint(0F, -29F, 0F);

		hipsModel[234].addShapeBox(14F, 13.8F, 0F, 2, 4, 4, 0F,0F, -0.2F, -3F, .5F, -0.2F, -0.5F, 0F, -0.2F, -2F, 0F, -0.2F, 0.5F, 1F, 0.2F, -3F, 1F, .5F, -1.5F, .5F, 0.4F, -0.8F, 0F, 0.2F, 1F); // Box 0
		hipsModel[234].setRotationPoint(0F, -29F, 0F);

		hipsModel[235].addShapeBox(-2F, 3F, 5.5F, 4, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 1
		hipsModel[235].setRotationPoint(0F, -29F, 0F);

		hipsModel[236].addShapeBox(-5F, 3F, 5.5F, 3, 13, 1, 0F,-.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, -.2F, 0F, .3F, 1F, 0F, -1F, 0F, 1F, -.5F, 0F, 1F, 0.5F, 1F, 0F, 0.5F); // Box 3
		hipsModel[236].setRotationPoint(0F, -29F, 0F);

		hipsModel[237].addShapeBox(-5F, -0.5F, 5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 3
		hipsModel[237].setRotationPoint(0F, -29F, 0F);

		hipsModel[238].addShapeBox(-5F, -0.5F, -6.5F, 1, 4, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		hipsModel[238].setRotationPoint(0F, -29F, 0F);

		hipsModel[239].addShapeBox(4F, -0.5F, -6.5F, 1, 4, 1, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[239].setRotationPoint(0F, -29F, 0F);

		hipsModel[240].addShapeBox(7F, -2.2F, -4F, 2, 3, 2, 0F,0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		hipsModel[240].setRotationPoint(0F, -29F, 0F);

		hipsModel[241].addShapeBox(5F, -2.2F, -4F, 2, 3, 2, 0F,0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[241].setRotationPoint(0F, -29F, 0F);

		hipsModel[242].addShapeBox(5F, -2.2F, -2F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[242].setRotationPoint(0F, -29F, 0F);

		hipsModel[243].addShapeBox(7F, -0.2F, -6F, 3, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[243].setRotationPoint(0F, -29F, 0F);

		hipsModel[244].addShapeBox(5F, -0.2F, -6F, 2, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		hipsModel[244].setRotationPoint(0F, -29F, 0F);

		hipsModel[245].addShapeBox(10F, 1.8F, -5F, 2, 2, 3, 0F,0F, 0F, 0F, -0.5F, -2F, -0.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[245].setRotationPoint(0F, -29F, 0F);

		hipsModel[246].addShapeBox(7F, 1.8F, -6F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[246].setRotationPoint(0F, -29F, 0F);

		hipsModel[247].addShapeBox(5F, 1.8F, -6F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[247].setRotationPoint(0F, -29F, 0F);

		hipsModel[248].addShapeBox(5F, 3.8F, -6F, 2, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		hipsModel[248].setRotationPoint(0F, -29F, 0F);

		hipsModel[249].addShapeBox(7F, 3.8F, -6F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[249].setRotationPoint(0F, -29F, 0F);

		hipsModel[250].addShapeBox(10F, 3.8F, -5F, 2, 3, 4, 0F,0F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[250].setRotationPoint(0F, -29F, 0F);

		hipsModel[251].addShapeBox(5.2F, -18F, -2F, 1, 6, 2, 0F,-0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 59
		hipsModel[251].setRotationPoint(0F, -29F, 0F);
		hipsModel[251].rotateAngleZ = -0.9424778F;

		hipsModel[252].addShapeBox(4.2F, -12F, -2F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 60
		hipsModel[252].setRotationPoint(0F, -29F, 0F);
		hipsModel[252].rotateAngleZ = -0.9424778F;

		hipsModel[253].addShapeBox(6.2F, -18F, -3F, 1, 6, 1, 0F,-0.5F, -0.3F, -0.2F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 61
		hipsModel[253].setRotationPoint(0F, -29F, 0F);
		hipsModel[253].rotateAngleZ = -0.9424778F;

		hipsModel[254].addShapeBox(4.2F, -12F, -4F, 3, 5, 2, 0F,-1.5F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 62
		hipsModel[254].setRotationPoint(0F, -29F, 0F);
		hipsModel[254].rotateAngleZ = -0.9424778F;

		hipsModel[255].addShapeBox(7.2F, -12F, -4F, 2, 5, 2, 0F,0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[255].setRotationPoint(0F, -29F, 0F);
		hipsModel[255].rotateAngleZ = -0.9424778F;

		hipsModel[256].addShapeBox(7.2F, -17F, -3F, 2, 5, 1, 0F,-0.5F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.4F, 0F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[256].setRotationPoint(0F, -29F, 0F);
		hipsModel[256].rotateAngleZ = -0.9424778F;

		hipsModel[257].addShapeBox(9.2F, -17F, -3F, 2, 5, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, -0.2F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[257].setRotationPoint(0F, -29F, 0F);
		hipsModel[257].rotateAngleZ = -0.9424778F;

		hipsModel[258].addShapeBox(9.2F, -12F, -4F, 3, 5, 2, 0F,0F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[258].setRotationPoint(0F, -29F, 0F);
		hipsModel[258].rotateAngleZ = -0.9424778F;

		hipsModel[259].addShapeBox(11.2F, -16F, -2F, 1, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 67
		hipsModel[259].setRotationPoint(0F, -29F, 0F);
		hipsModel[259].rotateAngleZ = -0.9424778F;

		hipsModel[260].addShapeBox(11.2F, -12F, -2F, 1, 5, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, -1F, -1F, 0F, 0F, 0F); // Box 68
		hipsModel[260].setRotationPoint(0F, -29F, 0F);
		hipsModel[260].rotateAngleZ = -0.9424778F;

		hipsModel[261].addShapeBox(5.2F, -20F, 0F, 1, 2, 2, 0F,-.9F, .2F, 0F, .6F, .2F, 0F, .8F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 20
		hipsModel[261].setRotationPoint(0F, -29F, 0F);
		hipsModel[261].rotateAngleZ = -0.9424778F;

		hipsModel[262].addShapeBox(7.2F, -19F, 2F, 2, 2, 1, 0F,0F, .6F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -.5F, .5F, -.3F, -.5F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.4F, 0F); // Box 23
		hipsModel[262].setRotationPoint(0F, -29F, 0F);
		hipsModel[262].rotateAngleZ = -0.9424778F;

		hipsModel[263].addShapeBox(6.2F, -20F, 2F, 1, 2, 1, 0F,-.4F, 0F, 0F, -.2F, 0F, 0F, .5F, -.5F, -.3F, -1F, -.4F, -.5F, .5F, 0F, 0F, .5F, .6F, 0F, .5F, .6F, 0F, -.5F, .3F, -.2F); // Box 24
		hipsModel[263].setRotationPoint(0F, -29F, 0F);
		hipsModel[263].rotateAngleZ = -0.9424778F;

		hipsModel[264].addShapeBox(17.5F, -18.7F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[264].setRotationPoint(0F, -29F, 0F);
		hipsModel[264].rotateAngleZ = -0.64577182F;

		hipsModel[265].addShapeBox(17.5F, -18.7F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -.7F, 0F, 0F, -1.4F, 0F, 0F, -.9F, .3F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, .3F, .35F); // Box 51
		hipsModel[265].setRotationPoint(0F, -29F, 0F);
		hipsModel[265].rotateAngleZ = -0.64577182F;

		hipsModel[266].addShapeBox(19.5F, -18F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[266].setRotationPoint(0F, -29F, 0F);
		hipsModel[266].rotateAngleZ = -0.64577182F;

		hipsModel[267].addShapeBox(19.5F, -18F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, -.5F, -.7F, 0F, -.5F, -1.2F, -1.2F, 0F, -.7F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, -1F, 0F, -.5F, 0F); // Box 53
		hipsModel[267].setRotationPoint(0F, -29F, 0F);
		hipsModel[267].rotateAngleZ = -0.64577182F;

		hipsModel[268].addShapeBox(14.5F, -15.5F, 2F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.5F); // Box 55
		hipsModel[268].setRotationPoint(0F, -29F, 0F);
		hipsModel[268].rotateAngleZ = -0.64577182F;

		hipsModel[269].addShapeBox(17.5F, -15.5F, 1.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .1F); // Box 56
		hipsModel[269].setRotationPoint(0F, -29F, 0F);
		hipsModel[269].rotateAngleZ = -0.64577182F;

		hipsModel[270].addShapeBox(19.5F, -15.5F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 0F); // Box 57
		hipsModel[270].setRotationPoint(0F, -29F, 0F);
		hipsModel[270].rotateAngleZ = -0.64577182F;

		hipsModel[271].addShapeBox(14.5F, -14.5F, 3F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -.4F, -1F, -.3F, -.5F); // Box 58
		hipsModel[271].setRotationPoint(0F, -29F, 0F);
		hipsModel[271].rotateAngleZ = -0.64577182F;

		hipsModel[272].addShapeBox(19.5F, -14.5F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.5F, -1.2F, 0F, -.5F, -1.2F, -1F, 0F, -.7F, 0F); // Box 59
		hipsModel[272].setRotationPoint(0F, -29F, 0F);
		hipsModel[272].rotateAngleZ = -0.64577182F;

		hipsModel[273].addShapeBox(17.5F, -14.5F, 2.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .1F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.7F, -.5F, 0F, -.3F, .1F); // Box 60
		hipsModel[273].setRotationPoint(0F, -29F, 0F);
		hipsModel[273].rotateAngleZ = -0.64577182F;

		hipsModel[274].addShapeBox(14.5F, -19.5F, -3F, 3, 4, 2, 0F,-1F, -1.1F, 0F, 0F, -1.7F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[274].setRotationPoint(0F, -29F, 0F);
		hipsModel[274].rotateAngleZ = -0.64577182F;

		hipsModel[275].addShapeBox(17.5F, -18.7F, -3F, 2, 1, 2, 0F,0F, -0.9F, 0.3F, 0F, -1.4F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.35F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[275].setRotationPoint(0F, -29F, 0F);
		hipsModel[275].rotateAngleZ = -0.64577182F;

		hipsModel[276].addShapeBox(19.5F, -18F, -3F, 2, 3, 2, 0F,0F, -0.7F, 0F, -0.5F, -1.2F, -1.2F, -0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 65
		hipsModel[276].setRotationPoint(0F, -29F, 0F);
		hipsModel[276].rotateAngleZ = -0.64577182F;

		hipsModel[277].addShapeBox(17.5F, -15.5F, -3.5F, 2, 1, 2, 0F,0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[277].setRotationPoint(0F, -29F, 0F);
		hipsModel[277].rotateAngleZ = -0.64577182F;

		hipsModel[278].addShapeBox(14.5F, -15.5F, -4F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		hipsModel[278].setRotationPoint(0F, -29F, 0F);
		hipsModel[278].rotateAngleZ = -0.64577182F;

		hipsModel[279].addShapeBox(14.5F, -14.5F, -4F, 3, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.3F, -0.5F, 0F, -0.3F, -0.4F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		hipsModel[279].setRotationPoint(0F, -29F, 0F);
		hipsModel[279].rotateAngleZ = -0.64577182F;

		hipsModel[280].addShapeBox(17.5F, -14.5F, -3.5F, 2, 2, 1, 0F,0F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.1F, 0F, -0.7F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -0.5F); // Box 69
		hipsModel[280].setRotationPoint(0F, -29F, 0F);
		hipsModel[280].rotateAngleZ = -0.64577182F;

		hipsModel[281].addShapeBox(19.5F, -14.5F, -3F, 2, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -1.2F, -1F, -0.5F, -1.2F, 0F, 0F, -0.5F, -0.5F); // Box 70
		hipsModel[281].setRotationPoint(0F, -29F, 0F);
		hipsModel[281].rotateAngleZ = -0.64577182F;

		hipsModel[282].addShapeBox(19.5F, -15.5F, -3F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[282].setRotationPoint(0F, -29F, 0F);
		hipsModel[282].rotateAngleZ = -0.64577182F;

		hipsModel[283].addShapeBox(18.5F, 1.5F, -3.5F, 2, 1, 2, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 72
		hipsModel[283].setRotationPoint(0F, -29F, 0F);

		hipsModel[284].addShapeBox(18.5F, 0.5F, -3.5F, 2, 1, 2, 0F,-.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 73
		hipsModel[284].setRotationPoint(0F, -29F, 0F);

		hipsModel[285].addShapeBox(18.5F, 2.5F, -3.5F, 2, 1, 2, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 74
		hipsModel[285].setRotationPoint(0F, -29F, 0F);

		hipsModel[286].addShapeBox(19F, -0.5F, -3F, 1, 2, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 75
		hipsModel[286].setRotationPoint(0F, -29F, 0F);

		hipsModel[287].addShapeBox(17.5F, 2.5F, -4.5F, 4, 2, 4, 0F,-1.3F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1.3F, 0F, -1.3F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 76
		hipsModel[287].setRotationPoint(0F, -29F, 0F);

		hipsModel[288].addShapeBox(17.5F, 4.5F, -4.5F, 4, 2, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 77
		hipsModel[288].setRotationPoint(0F, -29F, 0F);

		hipsModel[289].addShapeBox(17.5F, 6.5F, -4.5F, 4, 2, 4, 0F,-.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.7F, 0F, -.7F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 78
		hipsModel[289].setRotationPoint(0F, -29F, 0F);

		hipsModel[290].addShapeBox(18F, -2.5F, -3F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 81
		hipsModel[290].setRotationPoint(0F, -29F, 0F);

		hipsModel[291].addShapeBox(14F, 11.8F, 0F, 2, 7, 4, 0F,1F, 1F, -3F, -1F, 1F, 0F, -.8F, -.2F, -2.5F, 0F, -.2F, -.5F, 0F, .2F, -3F, 0F, .2F, -.5F, -.5F, .2F, -2F, 0F, .2F, .5F); // Box 6
		hipsModel[291].setRotationPoint(0F, -29F, 0F);

		hipsModel[292].addShapeBox(14F, 18.8F, 0F, 2, 3, 4, 0F,0F, -0.2F, -3F, 0F, -0.2F, -0.5F, -0.5F, -0.2F, -2F, 0F, -0.2F, 0.5F, 0F, 0.2F, -3F, 1F, 1F, -1.5F, 0F, 0.5F, -0.8F, 0F, 0.2F, 0.5F); // Box 7
		hipsModel[292].setRotationPoint(0F, -29F, 0F);

		hipsModel[293].addShapeBox(8F, 12F, 4F, 6, 7, 2, 0F,0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F); // Box 8
		hipsModel[293].setRotationPoint(0F, -29F, 0F);

		hipsModel[294].addShapeBox(8F, 19F, 4F, 6, 3, 2, 0F,0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F); // Box 9
		hipsModel[294].setRotationPoint(0F, -29F, 0F);

		hipsModel[295].addShapeBox(4F, 12F, 5.5F, 4, 7, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 10
		hipsModel[295].setRotationPoint(0F, -29F, 0F);

		hipsModel[296].addShapeBox(4F, 19F, 6.5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, .5F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, .5F, .5F, 0F); // Box 11
		hipsModel[296].setRotationPoint(0F, -29F, 0F);

		hipsModel[297].addShapeBox(7.2F, -19F, -3F, 2, 2, 1, 0F,-0.5F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0.6F, 0F, -0.5F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F); // Box 12
		hipsModel[297].setRotationPoint(0F, -29F, 0F);
		hipsModel[297].rotateAngleZ = -0.9424778F;

		hipsModel[298].addShapeBox(6.2F, -20F, -3F, 1, 2, 1, 0F,-1F, -0.4F, -0.5F, 0.5F, -0.5F, -0.3F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0.3F, -0.2F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0F, 0F); // Box 13
		hipsModel[298].setRotationPoint(0F, -29F, 0F);
		hipsModel[298].rotateAngleZ = -0.9424778F;

		hipsModel[299].addShapeBox(5.2F, -20F, -2F, 1, 2, 2, 0F,-1.4F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[299].setRotationPoint(0F, -29F, 0F);
		hipsModel[299].rotateAngleZ = -0.9424778F;

		hipsModel[300].addShapeBox(4F, -3F, -3.5F, 1, 4, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[300].setRotationPoint(0F, -29F, 0F);

		hipsModel[301].addShapeBox(4F, -3F, -2.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[301].setRotationPoint(0F, -29F, 1F);

		hipsModel[302].addShapeBox(4F, -3F, 1.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[302].setRotationPoint(0F, -29F, 0F);

		hipsModel[303].addShapeBox(2F, 3F, 5.5F, 3, 14, 1, 0F,0F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, .5F); // Box 20
		hipsModel[303].setRotationPoint(0F, -29F, 0F);

		hipsModel[304].addShapeBox(20.5F, -17.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[304].setRotationPoint(0F, -29F, 0F);
		hipsModel[304].rotateAngleZ = -0.64577182F;

		hipsModel[305].addShapeBox(22.5F, -17.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 31
		hipsModel[305].setRotationPoint(0F, -29F, 0F);
		hipsModel[305].rotateAngleZ = -0.64577182F;

		hipsModel[306].addShapeBox(22.5F, -17.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -.3F, .5F, -.3F, -.7F, -1F, 0F, -.7F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, -.3F, 0F, -1F, 0F, 0F, -.5F); // Box 32
		hipsModel[306].setRotationPoint(0F, -29F, 0F);
		hipsModel[306].rotateAngleZ = -0.64577182F;

		hipsModel[307].addShapeBox(20.5F, -17.5F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, -.5F, -.5F, -.7F, -.2F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 1F, 0F); // Box 35
		hipsModel[307].setRotationPoint(0F, -29F, 0F);
		hipsModel[307].rotateAngleZ = -0.64577182F;

		hipsModel[308].addShapeBox(22.5F, -17.5F, -2F, 1, 1, 1, 0F,0F, -0.7F, -0.5F, -0.3F, -0.7F, -1F, 0F, -0.3F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 36
		hipsModel[308].setRotationPoint(0F, -29F, 0F);
		hipsModel[308].rotateAngleZ = -0.64577182F;

		hipsModel[309].addShapeBox(20.5F, -17.5F, -2F, 2, 1, 1, 0F,-0.5F, -0.7F, -0.2F, 0F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 1F, 0F); // Box 37
		hipsModel[309].setRotationPoint(0F, -29F, 0F);
		hipsModel[309].rotateAngleZ = -0.64577182F;

		hipsModel[310].addShapeBox(18F, -7.3F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 38
		hipsModel[310].setRotationPoint(0F, -29F, 0F);

		hipsModel[311].addShapeBox(18F, -8.3F, 0F, 2, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.6F, 0F, -.3F, -.6F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 39
		hipsModel[311].setRotationPoint(0F, -29F, 0F);

		hipsModel[312].addShapeBox(18.5F, -9.3F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F); // Box 40
		hipsModel[312].setRotationPoint(0F, -29F, 0F);

		hipsModel[313].addShapeBox(18F, -11.3F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 41
		hipsModel[313].setRotationPoint(0F, -29F, 0F);

		hipsModel[314].addShapeBox(18F, -7.3F, -1F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		hipsModel[314].setRotationPoint(0F, -29F, 0F);

		hipsModel[315].addShapeBox(18F, -8.3F, -1F, 2, 1, 1, 0F,-0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		hipsModel[315].setRotationPoint(0F, -29F, 0F);

		hipsModel[316].addShapeBox(17.5F, -17.5F, 1.5F, 1, 1, 2, 0F,0F, -.1F, 0F, 0F, 0F, 0F, 0F, -.4F, -.5F, 0F, -.1F, -.15F, 0F, -.4F, 0F, 0F, -1F, 0F, 0F, -.6F, -.5F, 0F, -.4F, -.08F); // Box 50
		hipsModel[316].setRotationPoint(0F, -29F, 0F);
		hipsModel[316].rotateAngleZ = -0.64577182F;

		hipsModel[317].addShapeBox(17.5F, -17.5F, -3.5F, 1, 1, 2, 0F,0F, -0.1F, -0.15F, 0F, -0.4F, -0.5F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.4F, -0.08F, 0F, -0.6F, -0.5F, 0F, -1F, 0F, 0F, -0.4F, 0F); // Box 52
		hipsModel[317].setRotationPoint(0F, -29F, 0F);
		hipsModel[317].rotateAngleZ = -0.64577182F;

		hipsModel[318].addShapeBox(2F, 3F, -6.5F, 3, 14, 1, 0F,0F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F); // Box 66
		hipsModel[318].setRotationPoint(0F, -29F, 0F);

		hipsModel[319].addShapeBox(-2F, 3F, -6.5F, 4, 14, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 67
		hipsModel[319].setRotationPoint(0F, -29F, 0F);

		hipsModel[320].addShapeBox(-5F, 3F, -6.5F, 3, 13, 1, 0F,-0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.2F, 0F, 0F, 1F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 1F, 0F, -1F); // Box 68
		hipsModel[320].setRotationPoint(0F, -29F, 0F);

		hipsModel[321].addShapeBox(14F, 6.8F, -4F, 1, 3, 4, 0F,0F, 0F, -1.5F, 0.2F, -3.2F, -3F, 0.5F, -3.2F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, -3F, 0.5F, 0.2F, 0F, 0F, 0.2F, -2F); // Box 69
		hipsModel[321].setRotationPoint(0F, -29F, 0F);

		hipsModel[322].addShapeBox(10F, 7F, -6F, 4, 3, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, -3.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		hipsModel[322].setRotationPoint(0F, -29F, 0F);

		hipsModel[323].addShapeBox(7F, 7F, -6F, 3, 3, 2, 0F,0F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 71
		hipsModel[323].setRotationPoint(0F, -29F, 0F);

		hipsModel[324].addShapeBox(5F, 7F, -7F, 2, 3, 2, 0F,0.5F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Box 72
		hipsModel[324].setRotationPoint(0F, -29F, 0F);

		hipsModel[325].addShapeBox(4F, 10F, -7F, 3, 4, 1, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[325].setRotationPoint(0F, -29F, 0F);

		hipsModel[326].addShapeBox(4F, 14F, -7F, 3, 4, 1, 0F,0.5F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 74
		hipsModel[326].setRotationPoint(0F, -29F, 0F);

		hipsModel[327].addShapeBox(7F, 14F, -6F, 3, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2.5F, 0F, 0F, 1.3F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 75
		hipsModel[327].setRotationPoint(0F, -29F, 0F);

		hipsModel[328].addShapeBox(10F, 10F, -6F, 4, 4, 2, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 77
		hipsModel[328].setRotationPoint(0F, -29F, 0F);

		hipsModel[329].addShapeBox(10F, 14F, -6F, 4, 4, 2, 0F,0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 78
		hipsModel[329].setRotationPoint(0F, -29F, 0F);

		hipsModel[330].addShapeBox(14F, 9.8F, -4F, 2, 4, 4, 0F,0F, -0.2F, 0F, -0.8F, -0.2F, -3F, -0.5F, -0.2F, 0F, 0F, -0.2F, -2F, 0F, 0.2F, 0.5F, 0F, 0.2F, -2F, 0.5F, 0.2F, -0.5F, 0F, 0.2F, -2F); // Box 79
		hipsModel[330].setRotationPoint(0F, -29F, 0F);

		hipsModel[331].addShapeBox(14F, 13.8F, -4F, 2, 4, 4, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, -2F, 0.5F, -0.2F, -0.5F, 0F, -0.2F, -3F, 0F, 0.2F, 1F, 0.5F, 0.4F, -0.8F, 1F, 0.5F, -1.5F, 1F, 0.2F, -3F); // Box 80
		hipsModel[331].setRotationPoint(0F, -29F, 0F);

		hipsModel[332].addShapeBox(7F, 10F, -6F, 3, 4, 2, 0F,0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 81
		hipsModel[332].setRotationPoint(0F, -29F, 0F);

		hipsModel[333].addShapeBox(14F, 11.8F, -4F, 2, 7, 4, 0F,0F, -0.2F, -0.5F, -0.8F, -0.2F, -2.5F, -1F, 1F, 0F, 1F, 1F, -3F, 0F, 0.2F, 0.5F, -0.5F, 0.2F, -2F, 0F, 0.2F, -0.5F, 0F, 0.2F, -3F); // Box 82
		hipsModel[333].setRotationPoint(0F, -29F, 0F);

		hipsModel[334].addShapeBox(8F, 12F, -6F, 6, 7, 2, 0F,0F, 0F, 1F, 0F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 83
		hipsModel[334].setRotationPoint(0F, -29F, 0F);

		hipsModel[335].addShapeBox(4F, 12F, -7.5F, 4, 7, 2, 0F,-1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 84
		hipsModel[335].setRotationPoint(0F, -29F, 0F);

		hipsModel[336].addShapeBox(4F, 19F, -7.5F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0.5F, 0F); // Box 85
		hipsModel[336].setRotationPoint(0F, -29F, 0F);

		hipsModel[337].addShapeBox(8F, 19F, -6F, 6, 3, 2, 0F,0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, -2F); // Box 86
		hipsModel[337].setRotationPoint(0F, -29F, 0F);

		hipsModel[338].addShapeBox(14F, 18.8F, -4F, 2, 3, 4, 0F,0F, -0.2F, 0.5F, -0.5F, -0.2F, -2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -3F, 0F, 0.2F, 0.5F, 0F, 0.5F, -0.8F, 1F, 1F, -1.5F, 0F, 0.2F, -3F); // Box 87
		hipsModel[338].setRotationPoint(0F, -29F, 0F);

		hipsModel[339].addShapeBox(-6F, 1.5F, 5.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		hipsModel[339].setRotationPoint(0F, -29F, 0F);

		hipsModel[340].addShapeBox(-10F, 1.5F, 5.5F, 4, 1, 1, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 0
		hipsModel[340].setRotationPoint(0F, -29F, 0F);

		hipsModel[341].addShapeBox(-13F, 0.5F, 4.5F, 3, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 1
		hipsModel[341].setRotationPoint(0F, -29F, 0F);

		hipsModel[342].addShapeBox(-15F, 0.5F, 3.5F, 2, 1, 1, 0F,0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, .5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F); // Box 2
		hipsModel[342].setRotationPoint(0F, -29F, 0F);

		hipsModel[343].addShapeBox(-18F, 1F, 3F, 3, 1, 1, 0F,0F, -1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, 1F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F); // Box 3
		hipsModel[343].setRotationPoint(0F, -29F, 0F);

		hipsModel[344].addShapeBox(-19F, 2F, -2F, 1, 1, 4, 0F,0F, -.5F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.5F, -.5F, 0F, .5F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, .5F, -.5F); // Box 4
		hipsModel[344].setRotationPoint(0F, -29F, 0F);

		hipsModel[345].addShapeBox(-6F, 1.5F, -6.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[345].setRotationPoint(0F, -29F, 0F);

		hipsModel[346].addShapeBox(-10F, 1.5F, -6.5F, 4, 1, 1, 0F,0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 6
		hipsModel[346].setRotationPoint(0F, -29F, 0F);

		hipsModel[347].addShapeBox(-13F, 0.5F, -5.5F, 3, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 7
		hipsModel[347].setRotationPoint(0F, -29F, 0F);

		hipsModel[348].addShapeBox(-15F, 0.5F, -4.5F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 8
		hipsModel[348].setRotationPoint(0F, -29F, 0F);

		hipsModel[349].addShapeBox(-18F, 1F, -4F, 3, 1, 1, 0F,0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.5F); // Box 9
		hipsModel[349].setRotationPoint(0F, -29F, 0F);
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