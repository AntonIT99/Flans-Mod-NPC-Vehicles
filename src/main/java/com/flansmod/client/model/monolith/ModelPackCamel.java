//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPackCamel extends ModelMecha //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelPackCamel() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		hipsModel = new ModelRendererTurbo[411];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[86];
		rightLegModel = new ModelRendererTurbo[96];

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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-5F, -42F, 0F);
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 25, 29, textureX, textureY); // Box 1
		hipsModel[1] = new ModelRendererTurbo(this, 41, 29, textureX, textureY); // Box 2
		hipsModel[2] = new ModelRendererTurbo(this, 57, 29, textureX, textureY); // Box 3
		hipsModel[3] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 4
		hipsModel[4] = new ModelRendererTurbo(this, 84, 29, textureX, textureY); // Box 5
		hipsModel[5] = new ModelRendererTurbo(this, 96, 21, textureX, textureY); // Box 6
		hipsModel[6] = new ModelRendererTurbo(this, 13, 29, textureX, textureY); // Box 7
		hipsModel[7] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 8
		hipsModel[8] = new ModelRendererTurbo(this, 112, 40, textureX, textureY); // Box 9
		hipsModel[9] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 11
		hipsModel[10] = new ModelRendererTurbo(this, 13, 11, textureX, textureY); // Box 12
		hipsModel[11] = new ModelRendererTurbo(this, 25, 11, textureX, textureY); // Box 13
		hipsModel[12] = new ModelRendererTurbo(this, 41, 11, textureX, textureY); // Box 14
		hipsModel[13] = new ModelRendererTurbo(this, 57, 11, textureX, textureY); // Box 15
		hipsModel[14] = new ModelRendererTurbo(this, 71, 11, textureX, textureY); // Box 16
		hipsModel[15] = new ModelRendererTurbo(this, 84, 11, textureX, textureY); // Box 17
		hipsModel[16] = new ModelRendererTurbo(this, 96, 11, textureX, textureY); // Box 18
		hipsModel[17] = new ModelRendererTurbo(this, 2, 75, textureX, textureY); // Box 19
		hipsModel[18] = new ModelRendererTurbo(this, 13, 75, textureX, textureY); // Box 20
		hipsModel[19] = new ModelRendererTurbo(this, 25, 75, textureX, textureY); // Box 22
		hipsModel[20] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 30
		hipsModel[21] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 36
		hipsModel[22] = new ModelRendererTurbo(this, 38, 74, textureX, textureY); // Box 37
		hipsModel[23] = new ModelRendererTurbo(this, 43, 74, textureX, textureY); // Box 38
		hipsModel[24] = new ModelRendererTurbo(this, 48, 74, textureX, textureY); // Box 39
		hipsModel[25] = new ModelRendererTurbo(this, 37, 80, textureX, textureY); // Box 44
		hipsModel[26] = new ModelRendererTurbo(this, 118, 83, textureX, textureY); // Box 76
		hipsModel[27] = new ModelRendererTurbo(this, 119, 59, textureX, textureY); // Box 79
		hipsModel[28] = new ModelRendererTurbo(this, 127, 52, textureX, textureY); // Box 80
		hipsModel[29] = new ModelRendererTurbo(this, 119, 88, textureX, textureY); // Box 81
		hipsModel[30] = new ModelRendererTurbo(this, 119, 65, textureX, textureY); // Box 83
		hipsModel[31] = new ModelRendererTurbo(this, 118, 93, textureX, textureY); // Box 0
		hipsModel[32] = new ModelRendererTurbo(this, 118, 71, textureX, textureY); // Box 1
		hipsModel[33] = new ModelRendererTurbo(this, 118, 75, textureX, textureY); // Box 2
		hipsModel[34] = new ModelRendererTurbo(this, 118, 97, textureX, textureY); // Box 3
		hipsModel[35] = new ModelRendererTurbo(this, 118, 79, textureX, textureY); // Box 4
		hipsModel[36] = new ModelRendererTurbo(this, 118, 101, textureX, textureY); // Box 5
		hipsModel[37] = new ModelRendererTurbo(this, 112, 67, textureX, textureY); // Box 6
		hipsModel[38] = new ModelRendererTurbo(this, 112, 63, textureX, textureY); // Box 7
		hipsModel[39] = new ModelRendererTurbo(this, 96, 29, textureX, textureY); // Box 0
		hipsModel[40] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 1
		hipsModel[41] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 2
		hipsModel[42] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 3
		hipsModel[43] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 4
		hipsModel[44] = new ModelRendererTurbo(this, 71, 57, textureX, textureY); // Box 5
		hipsModel[45] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 7
		hipsModel[46] = new ModelRendererTurbo(this, 13, 50, textureX, textureY); // Box 8
		hipsModel[47] = new ModelRendererTurbo(this, 25, 50, textureX, textureY); // Box 9
		hipsModel[48] = new ModelRendererTurbo(this, 41, 50, textureX, textureY); // Box 10
		hipsModel[49] = new ModelRendererTurbo(this, 57, 50, textureX, textureY); // Box 11
		hipsModel[50] = new ModelRendererTurbo(this, 71, 50, textureX, textureY); // Box 12
		hipsModel[51] = new ModelRendererTurbo(this, 84, 50, textureX, textureY); // Box 13
		hipsModel[52] = new ModelRendererTurbo(this, 96, 50, textureX, textureY); // Box 14
		hipsModel[53] = new ModelRendererTurbo(this, 96, 39, textureX, textureY); // Box 15
		hipsModel[54] = new ModelRendererTurbo(this, 84, 39, textureX, textureY); // Box 16
		hipsModel[55] = new ModelRendererTurbo(this, 71, 39, textureX, textureY); // Box 17
		hipsModel[56] = new ModelRendererTurbo(this, 57, 39, textureX, textureY); // Box 18
		hipsModel[57] = new ModelRendererTurbo(this, 41, 39, textureX, textureY); // Box 19
		hipsModel[58] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 20
		hipsModel[59] = new ModelRendererTurbo(this, 13, 39, textureX, textureY); // Box 21
		hipsModel[60] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 22
		hipsModel[61] = new ModelRendererTurbo(this, 2, 81, textureX, textureY); // Box 23
		hipsModel[62] = new ModelRendererTurbo(this, 13, 81, textureX, textureY); // Box 24
		hipsModel[63] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 25
		hipsModel[64] = new ModelRendererTurbo(this, 1, 64, textureX, textureY); // Box 26
		hipsModel[65] = new ModelRendererTurbo(this, 13, 64, textureX, textureY); // Box 27
		hipsModel[66] = new ModelRendererTurbo(this, 25, 64, textureX, textureY); // Box 28
		hipsModel[67] = new ModelRendererTurbo(this, 41, 64, textureX, textureY); // Box 29
		hipsModel[68] = new ModelRendererTurbo(this, 57, 64, textureX, textureY); // Box 30
		hipsModel[69] = new ModelRendererTurbo(this, 71, 64, textureX, textureY); // Box 31
		hipsModel[70] = new ModelRendererTurbo(this, 84, 64, textureX, textureY); // Box 32
		hipsModel[71] = new ModelRendererTurbo(this, 96, 64, textureX, textureY); // Box 33
		hipsModel[72] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 35
		hipsModel[73] = new ModelRendererTurbo(this, 44, 80, textureX, textureY); // Box 6
		hipsModel[74] = new ModelRendererTurbo(this, 139, 40, textureX, textureY); // Box 7
		hipsModel[75] = new ModelRendererTurbo(this, 130, 40, textureX, textureY); // Box 8
		hipsModel[76] = new ModelRendererTurbo(this, 139, 35, textureX, textureY); // Box 9
		hipsModel[77] = new ModelRendererTurbo(this, 130, 34, textureX, textureY); // Box 10
		hipsModel[78] = new ModelRendererTurbo(this, 139, 28, textureX, textureY); // Box 11
		hipsModel[79] = new ModelRendererTurbo(this, 130, 28, textureX, textureY); // Box 12
		hipsModel[80] = new ModelRendererTurbo(this, 139, 23, textureX, textureY); // Box 13
		hipsModel[81] = new ModelRendererTurbo(this, 130, 23, textureX, textureY); // Box 14
		hipsModel[82] = new ModelRendererTurbo(this, 139, 19, textureX, textureY); // Box 15
		hipsModel[83] = new ModelRendererTurbo(this, 130, 19, textureX, textureY); // Box 16
		hipsModel[84] = new ModelRendererTurbo(this, 139, 14, textureX, textureY); // Box 17
		hipsModel[85] = new ModelRendererTurbo(this, 130, 14, textureX, textureY); // Box 18
		hipsModel[86] = new ModelRendererTurbo(this, 139, 9, textureX, textureY); // Box 19
		hipsModel[87] = new ModelRendererTurbo(this, 130, 9, textureX, textureY); // Box 20
		hipsModel[88] = new ModelRendererTurbo(this, 134, 52, textureX, textureY); // Box 2
		hipsModel[89] = new ModelRendererTurbo(this, 127, 56, textureX, textureY); // Box 3
		hipsModel[90] = new ModelRendererTurbo(this, 134, 57, textureX, textureY); // Box 4
		hipsModel[91] = new ModelRendererTurbo(this, 119, 55, textureX, textureY); // Box 5
		hipsModel[92] = new ModelRendererTurbo(this, 118, 50, textureX, textureY); // Box 6
		hipsModel[93] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 7
		hipsModel[94] = new ModelRendererTurbo(this, 13, 11, textureX, textureY); // Box 8
		hipsModel[95] = new ModelRendererTurbo(this, 25, 11, textureX, textureY); // Box 9
		hipsModel[96] = new ModelRendererTurbo(this, 41, 11, textureX, textureY); // Box 10
		hipsModel[97] = new ModelRendererTurbo(this, 57, 11, textureX, textureY); // Box 11
		hipsModel[98] = new ModelRendererTurbo(this, 71, 11, textureX, textureY); // Box 12
		hipsModel[99] = new ModelRendererTurbo(this, 84, 11, textureX, textureY); // Box 13
		hipsModel[100] = new ModelRendererTurbo(this, 96, 11, textureX, textureY); // Box 14
		hipsModel[101] = new ModelRendererTurbo(this, 96, 21, textureX, textureY); // Box 15
		hipsModel[102] = new ModelRendererTurbo(this, 96, 29, textureX, textureY); // Box 16
		hipsModel[103] = new ModelRendererTurbo(this, 84, 29, textureX, textureY); // Box 17
		hipsModel[104] = new ModelRendererTurbo(this, 71, 29, textureX, textureY); // Box 18
		hipsModel[105] = new ModelRendererTurbo(this, 57, 29, textureX, textureY); // Box 19
		hipsModel[106] = new ModelRendererTurbo(this, 41, 29, textureX, textureY); // Box 20
		hipsModel[107] = new ModelRendererTurbo(this, 25, 29, textureX, textureY); // Box 21
		hipsModel[108] = new ModelRendererTurbo(this, 13, 29, textureX, textureY); // Box 22
		hipsModel[109] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Box 23
		hipsModel[110] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 24
		hipsModel[111] = new ModelRendererTurbo(this, 96, 50, textureX, textureY); // Box 25
		hipsModel[112] = new ModelRendererTurbo(this, 96, 64, textureX, textureY); // Box 26
		hipsModel[113] = new ModelRendererTurbo(this, 96, 39, textureX, textureY); // Box 27
		hipsModel[114] = new ModelRendererTurbo(this, 84, 39, textureX, textureY); // Box 28
		hipsModel[115] = new ModelRendererTurbo(this, 71, 39, textureX, textureY); // Box 29
		hipsModel[116] = new ModelRendererTurbo(this, 57, 39, textureX, textureY); // Box 30
		hipsModel[117] = new ModelRendererTurbo(this, 41, 39, textureX, textureY); // Box 31
		hipsModel[118] = new ModelRendererTurbo(this, 25, 39, textureX, textureY); // Box 32
		hipsModel[119] = new ModelRendererTurbo(this, 13, 39, textureX, textureY); // Box 33
		hipsModel[120] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Box 34
		hipsModel[121] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 35
		hipsModel[122] = new ModelRendererTurbo(this, 25, 64, textureX, textureY); // Box 39
		hipsModel[123] = new ModelRendererTurbo(this, 41, 64, textureX, textureY); // Box 40
		hipsModel[124] = new ModelRendererTurbo(this, 57, 64, textureX, textureY); // Box 41
		hipsModel[125] = new ModelRendererTurbo(this, 71, 64, textureX, textureY); // Box 42
		hipsModel[126] = new ModelRendererTurbo(this, 84, 64, textureX, textureY); // Box 43
		hipsModel[127] = new ModelRendererTurbo(this, 13, 50, textureX, textureY); // Box 44
		hipsModel[128] = new ModelRendererTurbo(this, 25, 50, textureX, textureY); // Box 46
		hipsModel[129] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 47
		hipsModel[130] = new ModelRendererTurbo(this, 41, 50, textureX, textureY); // Box 48
		hipsModel[131] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 49
		hipsModel[132] = new ModelRendererTurbo(this, 57, 50, textureX, textureY); // Box 50
		hipsModel[133] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 51
		hipsModel[134] = new ModelRendererTurbo(this, 71, 50, textureX, textureY); // Box 52
		hipsModel[135] = new ModelRendererTurbo(this, 71, 57, textureX, textureY); // Box 53
		hipsModel[136] = new ModelRendererTurbo(this, 84, 50, textureX, textureY); // Box 54
		hipsModel[137] = new ModelRendererTurbo(this, 13, 75, textureX, textureY); // Box 55
		hipsModel[138] = new ModelRendererTurbo(this, 25, 75, textureX, textureY); // Box 56
		hipsModel[139] = new ModelRendererTurbo(this, 2, 75, textureX, textureY); // Box 57
		hipsModel[140] = new ModelRendererTurbo(this, 13, 81, textureX, textureY); // Box 58
		hipsModel[141] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 59
		hipsModel[142] = new ModelRendererTurbo(this, 2, 81, textureX, textureY); // Box 60
		hipsModel[143] = new ModelRendererTurbo(this, 37, 80, textureX, textureY); // Box 61
		hipsModel[144] = new ModelRendererTurbo(this, 44, 80, textureX, textureY); // Box 62
		hipsModel[145] = new ModelRendererTurbo(this, 121, 40, textureX, textureY); // Box 63
		hipsModel[146] = new ModelRendererTurbo(this, 121, 34, textureX, textureY); // Box 64
		hipsModel[147] = new ModelRendererTurbo(this, 112, 34, textureX, textureY); // Box 66
		hipsModel[148] = new ModelRendererTurbo(this, 112, 28, textureX, textureY); // Box 67
		hipsModel[149] = new ModelRendererTurbo(this, 121, 28, textureX, textureY); // Box 68
		hipsModel[150] = new ModelRendererTurbo(this, 112, 23, textureX, textureY); // Box 69
		hipsModel[151] = new ModelRendererTurbo(this, 112, 19, textureX, textureY); // Box 71
		hipsModel[152] = new ModelRendererTurbo(this, 112, 14, textureX, textureY); // Box 72
		hipsModel[153] = new ModelRendererTurbo(this, 121, 14, textureX, textureY); // Box 73
		hipsModel[154] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 74
		hipsModel[155] = new ModelRendererTurbo(this, 112, 9, textureX, textureY); // Box 75
		hipsModel[156] = new ModelRendererTurbo(this, 121, 4, textureX, textureY); // Box 76
		hipsModel[157] = new ModelRendererTurbo(this, 139, 40, textureX, textureY); // Box 77
		hipsModel[158] = new ModelRendererTurbo(this, 130, 40, textureX, textureY); // Box 78
		hipsModel[159] = new ModelRendererTurbo(this, 130, 34, textureX, textureY); // Box 79
		hipsModel[160] = new ModelRendererTurbo(this, 139, 35, textureX, textureY); // Box 80
		hipsModel[161] = new ModelRendererTurbo(this, 139, 28, textureX, textureY); // Box 81
		hipsModel[162] = new ModelRendererTurbo(this, 130, 28, textureX, textureY); // Box 82
		hipsModel[163] = new ModelRendererTurbo(this, 139, 23, textureX, textureY); // Box 83
		hipsModel[164] = new ModelRendererTurbo(this, 130, 23, textureX, textureY); // Box 84
		hipsModel[165] = new ModelRendererTurbo(this, 130, 19, textureX, textureY); // Box 85
		hipsModel[166] = new ModelRendererTurbo(this, 139, 19, textureX, textureY); // Box 86
		hipsModel[167] = new ModelRendererTurbo(this, 139, 14, textureX, textureY); // Box 87
		hipsModel[168] = new ModelRendererTurbo(this, 139, 9, textureX, textureY); // Box 89
		hipsModel[169] = new ModelRendererTurbo(this, 139, 4, textureX, textureY); // Box 91
		hipsModel[170] = new ModelRendererTurbo(this, 13, 57, textureX, textureY); // Box 68
		hipsModel[171] = new ModelRendererTurbo(this, 13, 64, textureX, textureY); // Box 69
		hipsModel[172] = new ModelRendererTurbo(this, 1, 64, textureX, textureY); // Box 70
		hipsModel[173] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 71
		hipsModel[174] = new ModelRendererTurbo(this, 127, 62, textureX, textureY); // Box 57
		hipsModel[175] = new ModelRendererTurbo(this, 132, 62, textureX, textureY); // Box 58
		hipsModel[176] = new ModelRendererTurbo(this, 112, 71, textureX, textureY); // Box 59
		hipsModel[177] = new ModelRendererTurbo(this, 128, 75, textureX, textureY); // Box 60
		hipsModel[178] = new ModelRendererTurbo(this, 126, 66, textureX, textureY); // Box 61
		hipsModel[179] = new ModelRendererTurbo(this, 128, 71, textureX, textureY); // Box 62
		hipsModel[180] = new ModelRendererTurbo(this, 119, 65, textureX, textureY); // Box 64
		hipsModel[181] = new ModelRendererTurbo(this, 119, 59, textureX, textureY); // Box 65
		hipsModel[182] = new ModelRendererTurbo(this, 119, 55, textureX, textureY); // Box 66
		hipsModel[183] = new ModelRendererTurbo(this, 130, 14, textureX, textureY); // Box 67
		hipsModel[184] = new ModelRendererTurbo(this, 130, 9, textureX, textureY); // Box 68
		hipsModel[185] = new ModelRendererTurbo(this, 135, 66, textureX, textureY); // Box 69
		hipsModel[186] = new ModelRendererTurbo(this, 133, 71, textureX, textureY); // Box 70
		hipsModel[187] = new ModelRendererTurbo(this, 133, 76, textureX, textureY); // Box 71
		hipsModel[188] = new ModelRendererTurbo(this, 112, 75, textureX, textureY); // Box 76
		hipsModel[189] = new ModelRendererTurbo(this, 112, 50, textureX, textureY); // Box 1
		hipsModel[190] = new ModelRendererTurbo(this, 112, 56, textureX, textureY); // Box 3
		hipsModel[191] = new ModelRendererTurbo(this, 112, 53, textureX, textureY); // Box 5
		hipsModel[192] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 6
		hipsModel[193] = new ModelRendererTurbo(this, 134, 52, textureX, textureY); // Box 7
		hipsModel[194] = new ModelRendererTurbo(this, 127, 52, textureX, textureY); // Box 8
		hipsModel[195] = new ModelRendererTurbo(this, 134, 57, textureX, textureY); // Box 9
		hipsModel[196] = new ModelRendererTurbo(this, 127, 56, textureX, textureY); // Box 10
		hipsModel[197] = new ModelRendererTurbo(this, 127, 62, textureX, textureY); // Box 11
		hipsModel[198] = new ModelRendererTurbo(this, 132, 62, textureX, textureY); // Box 12
		hipsModel[199] = new ModelRendererTurbo(this, 126, 66, textureX, textureY); // Box 13
		hipsModel[200] = new ModelRendererTurbo(this, 135, 66, textureX, textureY); // Box 14
		hipsModel[201] = new ModelRendererTurbo(this, 128, 71, textureX, textureY); // Box 15
		hipsModel[202] = new ModelRendererTurbo(this, 133, 71, textureX, textureY); // Box 16
		hipsModel[203] = new ModelRendererTurbo(this, 133, 76, textureX, textureY); // Box 17
		hipsModel[204] = new ModelRendererTurbo(this, 128, 75, textureX, textureY); // Box 18
		hipsModel[205] = new ModelRendererTurbo(this, 112, 67, textureX, textureY); // Box 19
		hipsModel[206] = new ModelRendererTurbo(this, 112, 63, textureX, textureY); // Box 20
		hipsModel[207] = new ModelRendererTurbo(this, 112, 75, textureX, textureY); // Box 21
		hipsModel[208] = new ModelRendererTurbo(this, 112, 53, textureX, textureY); // Box 22
		hipsModel[209] = new ModelRendererTurbo(this, 112, 56, textureX, textureY); // Box 23
		hipsModel[210] = new ModelRendererTurbo(this, 112, 59, textureX, textureY); // Box 24
		hipsModel[211] = new ModelRendererTurbo(this, 112, 50, textureX, textureY); // Box 25
		hipsModel[212] = new ModelRendererTurbo(this, 195, 9, textureX, textureY); // Box 3
		hipsModel[213] = new ModelRendererTurbo(this, 155, 10, textureX, textureY); // Box 4
		hipsModel[214] = new ModelRendererTurbo(this, 155, 14, textureX, textureY); // Box 5
		hipsModel[215] = new ModelRendererTurbo(this, 155, 19, textureX, textureY); // Box 6
		hipsModel[216] = new ModelRendererTurbo(this, 155, 38, textureX, textureY); // Box 7
		hipsModel[217] = new ModelRendererTurbo(this, 155, 32, textureX, textureY); // Box 8
		hipsModel[218] = new ModelRendererTurbo(this, 155, 26, textureX, textureY); // Box 9
		hipsModel[219] = new ModelRendererTurbo(this, 155, 23, textureX, textureY); // Box 10
		hipsModel[220] = new ModelRendererTurbo(this, 154, 44, textureX, textureY); // Box 11
		hipsModel[221] = new ModelRendererTurbo(this, 154, 47, textureX, textureY); // Box 12
		hipsModel[222] = new ModelRendererTurbo(this, 154, 50, textureX, textureY); // Box 13
		hipsModel[223] = new ModelRendererTurbo(this, 154, 53, textureX, textureY); // Box 16
		hipsModel[224] = new ModelRendererTurbo(this, 154, 56, textureX, textureY); // Box 17
		hipsModel[225] = new ModelRendererTurbo(this, 154, 59, textureX, textureY); // Box 18
		hipsModel[226] = new ModelRendererTurbo(this, 154, 62, textureX, textureY); // Box 19
		hipsModel[227] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 20
		hipsModel[228] = new ModelRendererTurbo(this, 154, 68, textureX, textureY); // Box 21
		hipsModel[229] = new ModelRendererTurbo(this, 154, 71, textureX, textureY); // Box 22
		hipsModel[230] = new ModelRendererTurbo(this, 154, 78, textureX, textureY); // Box 23
		hipsModel[231] = new ModelRendererTurbo(this, 154, 74, textureX, textureY); // Box 24
		hipsModel[232] = new ModelRendererTurbo(this, 155, 10, textureX, textureY); // Box 25
		hipsModel[233] = new ModelRendererTurbo(this, 155, 14, textureX, textureY); // Box 26
		hipsModel[234] = new ModelRendererTurbo(this, 155, 19, textureX, textureY); // Box 27
		hipsModel[235] = new ModelRendererTurbo(this, 154, 44, textureX, textureY); // Box 28
		hipsModel[236] = new ModelRendererTurbo(this, 154, 47, textureX, textureY); // Box 29
		hipsModel[237] = new ModelRendererTurbo(this, 154, 50, textureX, textureY); // Box 30
		hipsModel[238] = new ModelRendererTurbo(this, 154, 53, textureX, textureY); // Box 31
		hipsModel[239] = new ModelRendererTurbo(this, 154, 56, textureX, textureY); // Box 32
		hipsModel[240] = new ModelRendererTurbo(this, 154, 59, textureX, textureY); // Box 33
		hipsModel[241] = new ModelRendererTurbo(this, 154, 62, textureX, textureY); // Box 34
		hipsModel[242] = new ModelRendererTurbo(this, 154, 65, textureX, textureY); // Box 35
		hipsModel[243] = new ModelRendererTurbo(this, 154, 68, textureX, textureY); // Box 36
		hipsModel[244] = new ModelRendererTurbo(this, 154, 71, textureX, textureY); // Box 37
		hipsModel[245] = new ModelRendererTurbo(this, 154, 74, textureX, textureY); // Box 38
		hipsModel[246] = new ModelRendererTurbo(this, 195, 13, textureX, textureY); // Box 39
		hipsModel[247] = new ModelRendererTurbo(this, 195, 22, textureX, textureY); // Box 40
		hipsModel[248] = new ModelRendererTurbo(this, 182, 9, textureX, textureY); // Box 41
		hipsModel[249] = new ModelRendererTurbo(this, 182, 13, textureX, textureY); // Box 42
		hipsModel[250] = new ModelRendererTurbo(this, 182, 22, textureX, textureY); // Box 43
		hipsModel[251] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 44
		hipsModel[252] = new ModelRendererTurbo(this, 169, 13, textureX, textureY); // Box 45
		hipsModel[253] = new ModelRendererTurbo(this, 169, 22, textureX, textureY); // Box 46
		hipsModel[254] = new ModelRendererTurbo(this, 211, 13, textureX, textureY); // Box 47
		hipsModel[255] = new ModelRendererTurbo(this, 211, 22, textureX, textureY); // Box 48
		hipsModel[256] = new ModelRendererTurbo(this, 211, 9, textureX, textureY); // Box 49
		hipsModel[257] = new ModelRendererTurbo(this, 224, 9, textureX, textureY); // Box 50
		hipsModel[258] = new ModelRendererTurbo(this, 224, 13, textureX, textureY); // Box 51
		hipsModel[259] = new ModelRendererTurbo(this, 224, 22, textureX, textureY); // Box 52
		hipsModel[260] = new ModelRendererTurbo(this, 235, 9, textureX, textureY); // Box 53
		hipsModel[261] = new ModelRendererTurbo(this, 235, 13, textureX, textureY); // Box 54
		hipsModel[262] = new ModelRendererTurbo(this, 235, 22, textureX, textureY); // Box 55
		hipsModel[263] = new ModelRendererTurbo(this, 195, 29, textureX, textureY); // Box 57
		hipsModel[264] = new ModelRendererTurbo(this, 182, 29, textureX, textureY); // Box 62
		hipsModel[265] = new ModelRendererTurbo(this, 169, 29, textureX, textureY); // Box 63
		hipsModel[266] = new ModelRendererTurbo(this, 211, 29, textureX, textureY); // Box 0
		hipsModel[267] = new ModelRendererTurbo(this, 224, 29, textureX, textureY); // Box 1
		hipsModel[268] = new ModelRendererTurbo(this, 235, 29, textureX, textureY); // Box 2
		hipsModel[269] = new ModelRendererTurbo(this, 246, 3, textureX, textureY); // Box 0
		hipsModel[270] = new ModelRendererTurbo(this, 246, 9, textureX, textureY); // Box 1
		hipsModel[271] = new ModelRendererTurbo(this, 246, 15, textureX, textureY); // Box 2
		hipsModel[272] = new ModelRendererTurbo(this, 246, 21, textureX, textureY); // Box 3
		hipsModel[273] = new ModelRendererTurbo(this, 246, 3, textureX, textureY); // Box 4
		hipsModel[274] = new ModelRendererTurbo(this, 246, 9, textureX, textureY); // Box 5
		hipsModel[275] = new ModelRendererTurbo(this, 246, 15, textureX, textureY); // Box 6
		hipsModel[276] = new ModelRendererTurbo(this, 246, 21, textureX, textureY); // Box 7
		hipsModel[277] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 8
		hipsModel[278] = new ModelRendererTurbo(this, 153, 85, textureX, textureY); // Box 9
		hipsModel[279] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 10
		hipsModel[280] = new ModelRendererTurbo(this, 153, 95, textureX, textureY); // Box 11
		hipsModel[281] = new ModelRendererTurbo(this, 169, 29, textureX, textureY); // Box 12
		hipsModel[282] = new ModelRendererTurbo(this, 182, 29, textureX, textureY); // Box 13
		hipsModel[283] = new ModelRendererTurbo(this, 195, 29, textureX, textureY); // Box 14
		hipsModel[284] = new ModelRendererTurbo(this, 211, 29, textureX, textureY); // Box 15
		hipsModel[285] = new ModelRendererTurbo(this, 224, 29, textureX, textureY); // Box 16
		hipsModel[286] = new ModelRendererTurbo(this, 235, 29, textureX, textureY); // Box 17
		hipsModel[287] = new ModelRendererTurbo(this, 235, 22, textureX, textureY); // Box 18
		hipsModel[288] = new ModelRendererTurbo(this, 224, 22, textureX, textureY); // Box 19
		hipsModel[289] = new ModelRendererTurbo(this, 211, 22, textureX, textureY); // Box 20
		hipsModel[290] = new ModelRendererTurbo(this, 195, 22, textureX, textureY); // Box 21
		hipsModel[291] = new ModelRendererTurbo(this, 182, 22, textureX, textureY); // Box 22
		hipsModel[292] = new ModelRendererTurbo(this, 169, 22, textureX, textureY); // Box 23
		hipsModel[293] = new ModelRendererTurbo(this, 169, 13, textureX, textureY); // Box 24
		hipsModel[294] = new ModelRendererTurbo(this, 182, 13, textureX, textureY); // Box 25
		hipsModel[295] = new ModelRendererTurbo(this, 195, 13, textureX, textureY); // Box 26
		hipsModel[296] = new ModelRendererTurbo(this, 211, 13, textureX, textureY); // Box 27
		hipsModel[297] = new ModelRendererTurbo(this, 224, 13, textureX, textureY); // Box 28
		hipsModel[298] = new ModelRendererTurbo(this, 235, 13, textureX, textureY); // Box 29
		hipsModel[299] = new ModelRendererTurbo(this, 246, 3, textureX, textureY); // Box 30
		hipsModel[300] = new ModelRendererTurbo(this, 246, 9, textureX, textureY); // Box 31
		hipsModel[301] = new ModelRendererTurbo(this, 246, 15, textureX, textureY); // Box 32
		hipsModel[302] = new ModelRendererTurbo(this, 246, 21, textureX, textureY); // Box 33
		hipsModel[303] = new ModelRendererTurbo(this, 246, 21, textureX, textureY); // Box 34
		hipsModel[304] = new ModelRendererTurbo(this, 246, 15, textureX, textureY); // Box 35
		hipsModel[305] = new ModelRendererTurbo(this, 246, 9, textureX, textureY); // Box 36
		hipsModel[306] = new ModelRendererTurbo(this, 246, 3, textureX, textureY); // Box 37
		hipsModel[307] = new ModelRendererTurbo(this, 153, 101, textureX, textureY); // Box 38
		hipsModel[308] = new ModelRendererTurbo(this, 153, 108, textureX, textureY); // Box 39
		hipsModel[309] = new ModelRendererTurbo(this, 153, 115, textureX, textureY); // Box 40
		hipsModel[310] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 41
		hipsModel[311] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 42
		hipsModel[312] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 43
		hipsModel[313] = new ModelRendererTurbo(this, 227, 35, textureX, textureY); // Box 44
		hipsModel[314] = new ModelRendererTurbo(this, 214, 35, textureX, textureY); // Box 45
		hipsModel[315] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 46
		hipsModel[316] = new ModelRendererTurbo(this, 201, 35, textureX, textureY); // Box 47
		hipsModel[317] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 48
		hipsModel[318] = new ModelRendererTurbo(this, 168, 50, textureX, textureY); // Box 49
		hipsModel[319] = new ModelRendererTurbo(this, 214, 35, textureX, textureY); // Box 50
		hipsModel[320] = new ModelRendererTurbo(this, 227, 35, textureX, textureY); // Box 51
		hipsModel[321] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 52
		hipsModel[322] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 53
		hipsModel[323] = new ModelRendererTurbo(this, 176, 48, textureX, textureY); // Box 54
		hipsModel[324] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 55
		hipsModel[325] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 56
		hipsModel[326] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 57
		hipsModel[327] = new ModelRendererTurbo(this, 153, 115, textureX, textureY); // Box 58
		hipsModel[328] = new ModelRendererTurbo(this, 153, 108, textureX, textureY); // Box 59
		hipsModel[329] = new ModelRendererTurbo(this, 153, 101, textureX, textureY); // Box 60
		hipsModel[330] = new ModelRendererTurbo(this, 153, 95, textureX, textureY); // Box 61
		hipsModel[331] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 62
		hipsModel[332] = new ModelRendererTurbo(this, 214, 54, textureX, textureY); // Box 63
		hipsModel[333] = new ModelRendererTurbo(this, 214, 48, textureX, textureY); // Box 64
		hipsModel[334] = new ModelRendererTurbo(this, 214, 45, textureX, textureY); // Box 65
		hipsModel[335] = new ModelRendererTurbo(this, 214, 48, textureX, textureY); // Box 66
		hipsModel[336] = new ModelRendererTurbo(this, 214, 45, textureX, textureY); // Box 67
		hipsModel[337] = new ModelRendererTurbo(this, 181, 56, textureX, textureY); // Box 68
		hipsModel[338] = new ModelRendererTurbo(this, 189, 56, textureX, textureY); // Box 69
		hipsModel[339] = new ModelRendererTurbo(this, 189, 56, textureX, textureY); // Box 97
		hipsModel[340] = new ModelRendererTurbo(this, 181, 56, textureX, textureY); // Box 98
		hipsModel[341] = new ModelRendererTurbo(this, 189, 56, textureX, textureY); // Box 99
		hipsModel[342] = new ModelRendererTurbo(this, 189, 56, textureX, textureY); // Box 100
		hipsModel[343] = new ModelRendererTurbo(this, 170, 35, textureX, textureY); // Box 101
		hipsModel[344] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 102
		hipsModel[345] = new ModelRendererTurbo(this, 227, 35, textureX, textureY); // Box 103
		hipsModel[346] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 104
		hipsModel[347] = new ModelRendererTurbo(this, 176, 48, textureX, textureY); // Box 105
		hipsModel[348] = new ModelRendererTurbo(this, 181, 56, textureX, textureY); // Box 106
		hipsModel[349] = new ModelRendererTurbo(this, 214, 35, textureX, textureY); // Box 107
		hipsModel[350] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 108
		hipsModel[351] = new ModelRendererTurbo(this, 181, 56, textureX, textureY); // Box 109
		hipsModel[352] = new ModelRendererTurbo(this, 201, 35, textureX, textureY); // Box 110
		hipsModel[353] = new ModelRendererTurbo(this, 214, 35, textureX, textureY); // Box 111
		hipsModel[354] = new ModelRendererTurbo(this, 168, 50, textureX, textureY); // Box 112
		hipsModel[355] = new ModelRendererTurbo(this, 189, 56, textureX, textureY); // Box 113
		hipsModel[356] = new ModelRendererTurbo(this, 189, 56, textureX, textureY); // Box 114
		hipsModel[357] = new ModelRendererTurbo(this, 189, 56, textureX, textureY); // Box 115
		hipsModel[358] = new ModelRendererTurbo(this, 189, 56, textureX, textureY); // Box 116
		hipsModel[359] = new ModelRendererTurbo(this, 214, 45, textureX, textureY); // Box 117
		hipsModel[360] = new ModelRendererTurbo(this, 214, 48, textureX, textureY); // Box 118
		hipsModel[361] = new ModelRendererTurbo(this, 214, 54, textureX, textureY); // Box 119
		hipsModel[362] = new ModelRendererTurbo(this, 214, 48, textureX, textureY); // Box 120
		hipsModel[363] = new ModelRendererTurbo(this, 214, 45, textureX, textureY); // Box 121
		hipsModel[364] = new ModelRendererTurbo(this, 237, 35, textureX, textureY); // Box 122
		hipsModel[365] = new ModelRendererTurbo(this, 227, 35, textureX, textureY); // Box 123
		hipsModel[366] = new ModelRendererTurbo(this, 214, 60, textureX, textureY); // Box 125
		hipsModel[367] = new ModelRendererTurbo(this, 202, 60, textureX, textureY); // Box 0
		hipsModel[368] = new ModelRendererTurbo(this, 207, 57, textureX, textureY); // Box 1
		hipsModel[369] = new ModelRendererTurbo(this, 214, 60, textureX, textureY); // Box 2
		hipsModel[370] = new ModelRendererTurbo(this, 214, 60, textureX, textureY); // Box 3
		hipsModel[371] = new ModelRendererTurbo(this, 195, 57, textureX, textureY); // Box 4
		hipsModel[372] = new ModelRendererTurbo(this, 207, 57, textureX, textureY); // Box 5
		hipsModel[373] = new ModelRendererTurbo(this, 202, 60, textureX, textureY); // Box 6
		hipsModel[374] = new ModelRendererTurbo(this, 196, 66, textureX, textureY); // Box 7
		hipsModel[375] = new ModelRendererTurbo(this, 196, 66, textureX, textureY); // Box 8
		hipsModel[376] = new ModelRendererTurbo(this, 195, 69, textureX, textureY); // Box 9
		hipsModel[377] = new ModelRendererTurbo(this, 166, 73, textureX, textureY); // Box 10
		hipsModel[378] = new ModelRendererTurbo(this, 226, 61, textureX, textureY); // Box 11
		hipsModel[379] = new ModelRendererTurbo(this, 226, 61, textureX, textureY); // Box 12
		hipsModel[380] = new ModelRendererTurbo(this, 219, 65, textureX, textureY); // Box 13
		hipsModel[381] = new ModelRendererTurbo(this, 175, 73, textureX, textureY); // Box 14
		hipsModel[382] = new ModelRendererTurbo(this, 165, 79, textureX, textureY); // Box 15
		hipsModel[383] = new ModelRendererTurbo(this, 170, 69, textureX, textureY); // Box 16
		hipsModel[384] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 17
		hipsModel[385] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 18
		hipsModel[386] = new ModelRendererTurbo(this, 175, 68, textureX, textureY); // Box 19
		hipsModel[387] = new ModelRendererTurbo(this, 175, 68, textureX, textureY); // Box 20
		hipsModel[388] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 21
		hipsModel[389] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 22
		hipsModel[390] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 23
		hipsModel[391] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 24
		hipsModel[392] = new ModelRendererTurbo(this, 182, 74, textureX, textureY); // Box 25
		hipsModel[393] = new ModelRendererTurbo(this, 182, 74, textureX, textureY); // Box 26
		hipsModel[394] = new ModelRendererTurbo(this, 170, 69, textureX, textureY); // Box 27
		hipsModel[395] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 28
		hipsModel[396] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 29
		hipsModel[397] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 30
		hipsModel[398] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 31
		hipsModel[399] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 32
		hipsModel[400] = new ModelRendererTurbo(this, 167, 68, textureX, textureY); // Box 33
		hipsModel[401] = new ModelRendererTurbo(this, 175, 68, textureX, textureY); // Box 34
		hipsModel[402] = new ModelRendererTurbo(this, 175, 68, textureX, textureY); // Box 35
		hipsModel[403] = new ModelRendererTurbo(this, 175, 73, textureX, textureY); // Box 36
		hipsModel[404] = new ModelRendererTurbo(this, 166, 73, textureX, textureY); // Box 37
		hipsModel[405] = new ModelRendererTurbo(this, 165, 79, textureX, textureY); // Box 38
		hipsModel[406] = new ModelRendererTurbo(this, 164, 107, textureX, textureY); // Box 39
		hipsModel[407] = new ModelRendererTurbo(this, 164, 95, textureX, textureY); // Box 41
		hipsModel[408] = new ModelRendererTurbo(this, 164, 83, textureX, textureY); // Box 42
		hipsModel[409] = new ModelRendererTurbo(this, 164, 95, textureX, textureY); // Box 43
		hipsModel[410] = new ModelRendererTurbo(this, 164, 83, textureX, textureY); // Box 44

		hipsModel[0].addShapeBox(0F, -6F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[0].setRotationPoint(0F, -21F, 0F);

		hipsModel[1].addShapeBox(-4F, -6F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[1].setRotationPoint(0F, -21F, 0F);

		hipsModel[2].addShapeBox(-8F, -6F, 0F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 3
		hipsModel[2].setRotationPoint(0F, -21F, 0F);

		hipsModel[3].addShapeBox(-12F, -6F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 4
		hipsModel[3].setRotationPoint(0F, -21F, 0F);

		hipsModel[4].addShapeBox(-15F, -6F, 0F, 3, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 5
		hipsModel[4].setRotationPoint(0F, -21F, 0F);

		hipsModel[5].addShapeBox(-18F, -10F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 6
		hipsModel[5].setRotationPoint(0F, -21F, 0F);

		hipsModel[6].addShapeBox(4F, -6F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F); // Box 7
		hipsModel[6].setRotationPoint(0F, -21F, 0F);

		hipsModel[7].addShapeBox(7F, -6F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, .5F, 0F); // Box 8
		hipsModel[7].setRotationPoint(0F, -21F, 0F);

		hipsModel[8].addShapeBox(9F, -6F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[8].setRotationPoint(0F, -21F, 0F);

		hipsModel[9].addShapeBox(7F, -15F, 0F, 3, 5, 2, 0F,0F, .5F, 0F, -1F, -1.5F, 0F, -1F, -2F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[9].setRotationPoint(0F, -21F, 0F);

		hipsModel[10].addShapeBox(4F, -16F, 0F, 3, 6, 2, 0F,0F, .5F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[10].setRotationPoint(0F, -21F, 0F);

		hipsModel[11].addShapeBox(0F, -16F, 0F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[11].setRotationPoint(0F, -21F, 0F);

		hipsModel[12].addShapeBox(-4F, -16F, 0F, 4, 6, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[12].setRotationPoint(0F, -21F, 0F);

		hipsModel[13].addShapeBox(-8F, -16F, 0F, 4, 6, 2, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		hipsModel[13].setRotationPoint(0F, -21F, 0F);

		hipsModel[14].addShapeBox(-12F, -15F, 0F, 4, 5, 2, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		hipsModel[14].setRotationPoint(0F, -21F, 0F);

		hipsModel[15].addShapeBox(-15F, -14F, 0F, 3, 4, 2, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[15].setRotationPoint(0F, -21F, 0F);

		hipsModel[16].addShapeBox(-18F, -13F, 0F, 3, 3, 2, 0F,-.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 18
		hipsModel[16].setRotationPoint(0F, -21F, 0F);

		hipsModel[17].addShapeBox(0F, -20F, 0F, 4, 4, 1, 0F,.5F, .3F, 0F, -1.8F, -1F, 0F, -2F, -1F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[17].setRotationPoint(0F, -21F, 0F);

		hipsModel[18].addShapeBox(-4F, -20F, 0F, 4, 4, 1, 0F,-1.5F, .3F, 0F, -.5F, .3F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		hipsModel[18].setRotationPoint(0F, -21F, 0F);

		hipsModel[19].addShapeBox(-8F, -20F, 0F, 4, 4, 1, 0F,-1.8F, -2F, 0F, 1.5F, .3F, 0F, 1.5F, 0F, 0F, -2F, -2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F); // Box 22
		hipsModel[19].setRotationPoint(0F, -21F, 0F);

		hipsModel[20].addShapeBox(7F, -10F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[20].setRotationPoint(0F, -21F, 0F);

		hipsModel[21].addShapeBox(17.5F, -18F, 0.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F); // Box 36
		hipsModel[21].setRotationPoint(0F, -21F, 0F);

		hipsModel[22].addShapeBox(-19F, -10F, -0.5F, 1, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[22].setRotationPoint(0F, -21F, 0F);

		hipsModel[23].addShapeBox(-19F, -7F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F); // Box 38
		hipsModel[23].setRotationPoint(0F, -21F, 0F);

		hipsModel[24].addShapeBox(-19.5F, -3F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 39
		hipsModel[24].setRotationPoint(0F, -21F, 0F);

		hipsModel[25].addShapeBox(-21F, 1F, 0F, 2, 5, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -.5F, .5F, 0F, 0F, -.5F, 0F, -.5F, -1.5F, 0F, -.5F, -1F, 0F); // Box 44
		hipsModel[25].setRotationPoint(0F, -21F, 0F);

		hipsModel[26].addShapeBox(20.5F, -16.5F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		hipsModel[26].setRotationPoint(0F, -21F, 0F);

		hipsModel[27].addShapeBox(20.5F, -19.5F, -1F, 2, 3, 1, 0F,.3F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, .3F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		hipsModel[27].setRotationPoint(0F, -21F, 0F);

		hipsModel[28].addShapeBox(18.5F, -18.5F, 1F, 2, 2, 1, 0F,-.3F, .3F, 0F, -.3F, 1F, 0F, -.3F, 0F, 0F, -.3F, -.5F, 0F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, -1F, 0F); // Box 80
		hipsModel[28].setRotationPoint(0F, -21F, 0F);

		hipsModel[29].addShapeBox(22.5F, -16.5F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F); // Box 81
		hipsModel[29].setRotationPoint(0F, -21F, 0F);

		hipsModel[30].addShapeBox(22.5F, -18.5F, -1F, 1, 2, 1, 0F,0F, .7F, 0F, .5F, 0F, -.5F, .5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		hipsModel[30].setRotationPoint(0F, -21F, 0F);

		hipsModel[31].addShapeBox(23.5F, -16.5F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.2F, 0F); // Box 0
		hipsModel[31].setRotationPoint(0F, -21F, 0F);

		hipsModel[32].addShapeBox(23.5F, -18.5F, -0.5F, 3, 2, 1, 0F,-.5F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		hipsModel[32].setRotationPoint(0F, -21F, 0F);

		hipsModel[33].addShapeBox(26.5F, -18.5F, -0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[33].setRotationPoint(0F, -21F, 0F);

		hipsModel[34].addShapeBox(25.3F, -16.5F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, -1F, -.7F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, -1F, -.7F, 0F); // Box 3
		hipsModel[34].setRotationPoint(0F, -21F, 0F);

		hipsModel[35].addShapeBox(27.5F, -18.5F, -0.5F, 1, 2, 1, 0F,0F, -.4F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, -.4F, 0F, 0F, .1F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, 0F, .1F, 0F); // Box 4
		hipsModel[35].setRotationPoint(0F, -21F, 0F);

		hipsModel[36].addShapeBox(27.3F, -16.3F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F); // Box 5
		hipsModel[36].setRotationPoint(0F, -21F, 0F);

		hipsModel[37].addShapeBox(18.5F, -19.5F, 1F, 1, 1, 1, 0F,0F, 0F, -.5F, .2F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, .5F, -.5F, 0F, 0F, .2F, 0F, .5F, .2F, 0F, -.5F, -.5F, 1F, -.3F); // Box 6
		hipsModel[37].setRotationPoint(0F, -21F, 0F);

		hipsModel[38].addShapeBox(18.5F, -20.5F, 1F, 1, 1, 1, 0F,-.5F, 0F, -.5F, 0F, .5F, -.5F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, 0F, -.5F, .2F, 0F, 0F, 0F, 0F, -.5F, 0F, .5F, .5F); // Box 7
		hipsModel[38].setRotationPoint(0F, -21F, 0F);

		hipsModel[39].addShapeBox(-17F, -7F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -2F, 0F, -1F); // Box 0
		hipsModel[39].setRotationPoint(0F, -21F, 0F);

		hipsModel[40].addShapeBox(4F, -8F, 2F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 1
		hipsModel[40].setRotationPoint(0F, -21F, 0F);

		hipsModel[41].addShapeBox(0F, -8F, 4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F); // Box 2
		hipsModel[41].setRotationPoint(0F, -21F, 0F);

		hipsModel[42].addShapeBox(-4F, -8F, 4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 3
		hipsModel[42].setRotationPoint(0F, -21F, 0F);

		hipsModel[43].addShapeBox(-8F, -8F, 4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F); // Box 4
		hipsModel[43].setRotationPoint(0F, -21F, 0F);

		hipsModel[44].addShapeBox(-12F, -8F, 2F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 5
		hipsModel[44].setRotationPoint(0F, -21F, 0F);

		hipsModel[45].addShapeBox(7F, -10F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F); // Box 7
		hipsModel[45].setRotationPoint(0F, -21F, 0F);

		hipsModel[46].addShapeBox(4F, -10F, 2F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F); // Box 8
		hipsModel[46].setRotationPoint(0F, -21F, 0F);

		hipsModel[47].addShapeBox(0F, -10F, 2F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 1F); // Box 9
		hipsModel[47].setRotationPoint(0F, -21F, 0F);

		hipsModel[48].addShapeBox(-4F, -10F, 2F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 10
		hipsModel[48].setRotationPoint(0F, -21F, 0F);

		hipsModel[49].addShapeBox(-8F, -10F, 2F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 11
		hipsModel[49].setRotationPoint(0F, -21F, 0F);

		hipsModel[50].addShapeBox(-12F, -10F, 2F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 12
		hipsModel[50].setRotationPoint(0F, -21F, 0F);

		hipsModel[51].addShapeBox(-15F, -10F, 2F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -.5F); // Box 13
		hipsModel[51].setRotationPoint(0F, -21F, 0F);

		hipsModel[52].addShapeBox(-18F, -10F, 2F, 3, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, .5F, -1F, -.5F, -.5F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, .5F, -1.5F, -.5F, -.5F); // Box 14
		hipsModel[52].setRotationPoint(0F, -21F, 0F);

		hipsModel[53].addShapeBox(-18F, -13F, 2F, 3, 3, 1, 0F,-.5F, -2F, 1F, 0F, 0F, .5F, 0F, -1.5F, 0F, -1.5F, -2.5F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F, .5F, -1F, .5F, -.5F); // Box 15
		hipsModel[53].setRotationPoint(0F, -21F, 0F);

		hipsModel[54].addShapeBox(-15F, -14F, 2F, 3, 4, 2, 0F,0F, -1F, .5F, 0F, .5F, 0F, 0F, -2F, -.3F, 0F, -2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F); // Box 16
		hipsModel[54].setRotationPoint(0F, -21F, 0F);

		hipsModel[55].addShapeBox(-12F, -15F, 2F, 4, 5, 2, 0F,0F, -.5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -3F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 17
		hipsModel[55].setRotationPoint(0F, -21F, 0F);

		hipsModel[56].addShapeBox(-8F, -16F, 2F, 4, 6, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F); // Box 18
		hipsModel[56].setRotationPoint(0F, -21F, 0F);

		hipsModel[57].addShapeBox(-4F, -16F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 19
		hipsModel[57].setRotationPoint(0F, -21F, 0F);

		hipsModel[58].addShapeBox(0F, -16F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -.3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 20
		hipsModel[58].setRotationPoint(0F, -21F, 0F);

		hipsModel[59].addShapeBox(4F, -16F, 2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, .5F, 0F, -3.5F, -1F, 0F, -2.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 21
		hipsModel[59].setRotationPoint(0F, -21F, 0F);

		hipsModel[60].addShapeBox(7F, -15F, 2F, 3, 5, 1, 0F,0F, 0F, .5F, -1F, -2F, .5F, -2F, -3F, -.5F, 0F, -2.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F); // Box 22
		hipsModel[60].setRotationPoint(0F, -21F, 0F);

		hipsModel[61].addShapeBox(0F, -20F, 1F, 4, 4, 1, 0F,.5F, 0F, 0F, -2F, -1F, 0F, -3F, -1.5F, 0F, 1F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, .5F, .5F, 0F, 1.5F, 1.5F); // Box 23
		hipsModel[61].setRotationPoint(0F, -21F, 0F);

		hipsModel[62].addShapeBox(-4F, -20F, 1F, 4, 4, 1, 0F,-1.5F, 0F, 0F, -.5F, 0F, 0F, -1F, -1F, .5F, -1.5F, -1F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F); // Box 24
		hipsModel[62].setRotationPoint(0F, -21F, 0F);

		hipsModel[63].addShapeBox(-8F, -20F, 1F, 4, 4, 1, 0F,-2F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, -1F, .5F, -3F, -2F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1.5F, -2F, 1F, .5F); // Box 25
		hipsModel[63].setRotationPoint(0F, -21F, 0F);

		hipsModel[64].addShapeBox(7F, -6F, 2F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 1F, 0F, .5F, 0F, -1F, -1F, 1F, -1F, -2F, -.5F, 0F, -1F, .5F); // Box 26
		hipsModel[64].setRotationPoint(0F, -21F, 0F);

		hipsModel[65].addShapeBox(4F, -6F, 2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -2F, -.5F, 0F, -1.5F, 0F); // Box 27
		hipsModel[65].setRotationPoint(0F, -21F, 0F);

		hipsModel[66].addShapeBox(0F, -6F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 1F); // Box 28
		hipsModel[66].setRotationPoint(0F, -21F, 0F);

		hipsModel[67].addShapeBox(-4F, -6F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F); // Box 29
		hipsModel[67].setRotationPoint(0F, -21F, 0F);

		hipsModel[68].addShapeBox(-8F, -6F, 2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2.5F, 0F); // Box 30
		hipsModel[68].setRotationPoint(0F, -21F, 0F);

		hipsModel[69].addShapeBox(-12F, -6F, 2F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -2F, -1F); // Box 31
		hipsModel[69].setRotationPoint(0F, -21F, 0F);

		hipsModel[70].addShapeBox(-15F, -6F, 2F, 3, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -.5F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2.5F, -2F); // Box 32
		hipsModel[70].setRotationPoint(0F, -21F, 0F);

		hipsModel[71].addShapeBox(-17F, -7F, 2F, 2, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, .5F, .5F, -.5F, .5F, -.5F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, -.5F, -1F, -2F, -.5F, -1F); // Box 33
		hipsModel[71].setRotationPoint(0F, -21F, 0F);

		hipsModel[72].addShapeBox(7F, -8F, 2F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 1F); // Box 35
		hipsModel[72].setRotationPoint(0F, -21F, 0F);

		hipsModel[73].addShapeBox(-22F, 1F, 0F, 2, 5, 1, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1.5F, 0F); // Box 6
		hipsModel[73].setRotationPoint(0F, -21F, 0F);

		hipsModel[74].addShapeBox(9F, -10F, 0.5F, 3, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 7
		hipsModel[74].setRotationPoint(0F, -21F, 0F);

		hipsModel[75].addShapeBox(9F, -6F, 0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 8
		hipsModel[75].setRotationPoint(0F, -21F, 0F);

		hipsModel[76].addShapeBox(12F, -9F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F); // Box 9
		hipsModel[76].setRotationPoint(0F, -21F, 0F);

		hipsModel[77].addShapeBox(12F, -6F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, -.3F, 0F, -.8F, 0F); // Box 10
		hipsModel[77].setRotationPoint(0F, -21F, 0F);

		hipsModel[78].addShapeBox(14F, -10F, 0.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, .5F, -.5F, -.3F, 0F, -1.5F, -.3F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[78].setRotationPoint(0F, -21F, 0F);

		hipsModel[79].addShapeBox(14F, -6F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 1F, -.5F, 0F, 1F, -1F, -.3F, 0F, 0F, -.3F); // Box 12
		hipsModel[79].setRotationPoint(0F, -21F, 0F);

		hipsModel[80].addShapeBox(16F, -10F, 0.5F, 2, 3, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, .5F, 0F); // Box 13
		hipsModel[80].setRotationPoint(0F, -21F, 0F);

		hipsModel[81].addShapeBox(16F, -7F, 0.5F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, 1.5F, -2.5F, 0F, 1F, -3F, -.3F, -1F, -1F, -.3F); // Box 14
		hipsModel[81].setRotationPoint(0F, -21F, 0F);

		hipsModel[82].addShapeBox(16F, -10F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, -.5F, -.3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, -.3F); // Box 15
		hipsModel[82].setRotationPoint(0F, -21F, 0F);

		hipsModel[83].addShapeBox(18F, -10F, 0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -.3F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -1F, 1F, -.3F, 0F, 0F, 0F); // Box 16
		hipsModel[83].setRotationPoint(0F, -21F, 0F);

		hipsModel[84].addShapeBox(16F, -12F, 0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, .5F, -.3F); // Box 17
		hipsModel[84].setRotationPoint(0F, -21F, 0F);

		hipsModel[85].addShapeBox(18F, -12F, 0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -.3F, -.5F, 0F, 0F); // Box 18
		hipsModel[85].setRotationPoint(0F, -21F, 0F);

		hipsModel[86].addShapeBox(17.5F, -15F, 0.5F, 1, 3, 1, 0F,.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, -.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -.5F); // Box 19
		hipsModel[86].setRotationPoint(0F, -21F, 0F);

		hipsModel[87].addShapeBox(18.5F, -15F, 0.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F); // Box 20
		hipsModel[87].setRotationPoint(0F, -21F, 0F);

		hipsModel[88].addShapeBox(18.5F, -16.5F, 1F, 2, 2, 1, 0F,.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -1F, 0F); // Box 2
		hipsModel[88].setRotationPoint(0F, -21F, 0F);

		hipsModel[89].addShapeBox(20.5F, -19.5F, 1F, 2, 3, 1, 0F,.3F, 0F, 0F, 0F, -.3F, 0F, 0F, -1F, .2F, .3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F); // Box 3
		hipsModel[89].setRotationPoint(0F, -21F, 0F);

		hipsModel[90].addShapeBox(20.5F, -16.5F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 4
		hipsModel[90].setRotationPoint(0F, -21F, 0F);

		hipsModel[91].addShapeBox(18.5F, -18.5F, -1F, 2, 2, 1, 0F,-.3F, .3F, 0F, -.3F, 1F, 0F, -.3F, 1.2F, 0F, -.3F, .3F, 0F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F); // Box 5
		hipsModel[91].setRotationPoint(0F, -21F, 0F);

		hipsModel[92].addShapeBox(18.5F, -16.5F, -1F, 2, 2, 2, 0F,.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 6
		hipsModel[92].setRotationPoint(0F, -21F, 0F);

		hipsModel[93].addShapeBox(7F, -15F, -2F, 3, 5, 2, 0F,0F, 0F, -0.5F, -1F, -2F, -0.5F, -1F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		hipsModel[93].setRotationPoint(0F, -21F, 0F);

		hipsModel[94].addShapeBox(4F, -16F, -2F, 3, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[94].setRotationPoint(0F, -21F, 0F);

		hipsModel[95].addShapeBox(0F, -16F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[95].setRotationPoint(0F, -21F, 0F);

		hipsModel[96].addShapeBox(-4F, -16F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[96].setRotationPoint(0F, -21F, 0F);

		hipsModel[97].addShapeBox(-8F, -16F, -2F, 4, 6, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		hipsModel[97].setRotationPoint(0F, -21F, 0F);

		hipsModel[98].addShapeBox(-12F, -15F, -2F, 4, 5, 2, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[98].setRotationPoint(0F, -21F, 0F);

		hipsModel[99].addShapeBox(-15F, -14F, -2F, 3, 4, 2, 0F,0F, -1F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[99].setRotationPoint(0F, -21F, 0F);

		hipsModel[100].addShapeBox(-18F, -13F, -2F, 3, 3, 2, 0F,-0.5F, -2F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[100].setRotationPoint(0F, -21F, 0F);

		hipsModel[101].addShapeBox(-18F, -10F, -2F, 3, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 15
		hipsModel[101].setRotationPoint(0F, -21F, 0F);

		hipsModel[102].addShapeBox(-17F, -7F, -2F, 2, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, -2F, 1F, 0F); // Box 16
		hipsModel[102].setRotationPoint(0F, -21F, 0F);

		hipsModel[103].addShapeBox(-15F, -6F, -2F, 3, 3, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 17
		hipsModel[103].setRotationPoint(0F, -21F, 0F);

		hipsModel[104].addShapeBox(-12F, -6F, -2F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F); // Box 18
		hipsModel[104].setRotationPoint(0F, -21F, 0F);

		hipsModel[105].addShapeBox(-8F, -6F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, -.5F, 0F); // Box 19
		hipsModel[105].setRotationPoint(0F, -21F, 0F);

		hipsModel[106].addShapeBox(-4F, -6F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F); // Box 20
		hipsModel[106].setRotationPoint(0F, -21F, 0F);

		hipsModel[107].addShapeBox(0F, -6F, -2F, 4, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 21
		hipsModel[107].setRotationPoint(0F, -21F, 0F);

		hipsModel[108].addShapeBox(4F, -6F, -2F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 22
		hipsModel[108].setRotationPoint(0F, -21F, 0F);

		hipsModel[109].addShapeBox(7F, -6F, -2F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -1F, -1F, 0F, -1F, 0F, 0F, 1F, 0F); // Box 23
		hipsModel[109].setRotationPoint(0F, -21F, 0F);

		hipsModel[110].addShapeBox(7F, -10F, -2F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		hipsModel[110].setRotationPoint(0F, -21F, 0F);

		hipsModel[111].addShapeBox(-18F, -10F, -3F, 3, 3, 1, 0F,-1F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -1F, 0F, 1F); // Box 25
		hipsModel[111].setRotationPoint(0F, -21F, 0F);

		hipsModel[112].addShapeBox(-17F, -7F, -3F, 2, 2, 1, 0F,-0.5F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 1F, -2F, 0F, 1F); // Box 26
		hipsModel[112].setRotationPoint(0F, -21F, 0F);

		hipsModel[113].addShapeBox(-18F, -13F, -3F, 3, 3, 1, 0F,-1.5F, -2.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0.5F, -0.5F, -2F, 1F, -1F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 27
		hipsModel[113].setRotationPoint(0F, -21F, 0F);

		hipsModel[114].addShapeBox(-15F, -14F, -4F, 3, 4, 2, 0F,0F, -2.5F, -1F, 0F, -2F, -0.3F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		hipsModel[114].setRotationPoint(0F, -21F, 0F);

		hipsModel[115].addShapeBox(-12F, -15F, -4F, 4, 5, 2, 0F,0F, -3F, -0.3F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		hipsModel[115].setRotationPoint(0F, -21F, 0F);

		hipsModel[116].addShapeBox(-8F, -16F, -4F, 4, 6, 2, 0F,0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[116].setRotationPoint(0F, -21F, 0F);

		hipsModel[117].addShapeBox(-4F, -16F, -4F, 4, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		hipsModel[117].setRotationPoint(0F, -21F, 0F);

		hipsModel[118].addShapeBox(0F, -16F, -4F, 4, 6, 2, 0F,0F, -2F, 0F, 0F, -2.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		hipsModel[118].setRotationPoint(0F, -21F, 0F);

		hipsModel[119].addShapeBox(4F, -16F, -4F, 3, 6, 2, 0F,0F, -2.5F, -0.3F, 0F, -3.5F, -1F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		hipsModel[119].setRotationPoint(0F, -21F, 0F);

		hipsModel[120].addShapeBox(7F, -15F, -3F, 3, 5, 1, 0F,0F, -2.5F, 0F, -2F, -3F, -0.5F, -1F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 34
		hipsModel[120].setRotationPoint(0F, -21F, 0F);

		hipsModel[121].addShapeBox(7F, -10F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		hipsModel[121].setRotationPoint(0F, -21F, 0F);

		hipsModel[122].addShapeBox(0F, -6F, -4F, 4, 6, 2, 0F,0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[122].setRotationPoint(0F, -21F, 0F);

		hipsModel[123].addShapeBox(-4F, -6F, -4F, 4, 6, 2, 0F,0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		hipsModel[123].setRotationPoint(0F, -21F, 0F);

		hipsModel[124].addShapeBox(-8F, -6F, -4F, 4, 6, 2, 0F,0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 41
		hipsModel[124].setRotationPoint(0F, -21F, 0F);

		hipsModel[125].addShapeBox(-12F, -6F, -4F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F); // Box 42
		hipsModel[125].setRotationPoint(0F, -21F, 0F);

		hipsModel[126].addShapeBox(-15F, -6F, -4F, 3, 3, 2, 0F,0F, 1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2.5F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 1F); // Box 43
		hipsModel[126].setRotationPoint(0F, -21F, 0F);

		hipsModel[127].addShapeBox(4F, -10F, -4F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[127].setRotationPoint(0F, -21F, 0F);

		hipsModel[128].addShapeBox(0F, -10F, -5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		hipsModel[128].setRotationPoint(0F, -21F, 0F);

		hipsModel[129].addShapeBox(0F, -8F, -6F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		hipsModel[129].setRotationPoint(0F, -21F, 0F);

		hipsModel[130].addShapeBox(-4F, -10F, -5F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		hipsModel[130].setRotationPoint(0F, -21F, 0F);

		hipsModel[131].addShapeBox(-4F, -8F, -6F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		hipsModel[131].setRotationPoint(0F, -21F, 0F);

		hipsModel[132].addShapeBox(-8F, -10F, -5F, 4, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		hipsModel[132].setRotationPoint(0F, -21F, 0F);

		hipsModel[133].addShapeBox(-8F, -8F, -6F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[133].setRotationPoint(0F, -21F, 0F);

		hipsModel[134].addShapeBox(-12F, -10F, -4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		hipsModel[134].setRotationPoint(0F, -21F, 0F);

		hipsModel[135].addShapeBox(-12F, -8F, -4F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		hipsModel[135].setRotationPoint(0F, -21F, 0F);

		hipsModel[136].addShapeBox(-15F, -10F, -4F, 3, 4, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 54
		hipsModel[136].setRotationPoint(0F, -21F, 0F);

		hipsModel[137].addShapeBox(-4F, -20F, -1F, 4, 4, 1, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, 0F, -1.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		hipsModel[137].setRotationPoint(0F, -21F, 0F);

		hipsModel[138].addShapeBox(-8F, -20F, -1F, 4, 4, 1, 0F,-2F, -2F, 0F, 1.5F, 0F, 0F, 1.5F, 0.3F, 0F, -1.8F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 56
		hipsModel[138].setRotationPoint(0F, -21F, 0F);

		hipsModel[139].addShapeBox(0F, -20F, -1F, 4, 4, 1, 0F,0.5F, 0F, 0F, -2F, -1F, 0F, -1.8F, -1F, 0F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		hipsModel[139].setRotationPoint(0F, -21F, 0F);

		hipsModel[140].addShapeBox(-4F, -20F, -2F, 4, 4, 1, 0F,-1.5F, -1F, 0.5F, -1F, -1F, 0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		hipsModel[140].setRotationPoint(0F, -21F, 0F);

		hipsModel[141].addShapeBox(-8F, -20F, -2F, 4, 4, 1, 0F,-3F, -2F, 0F, 1.5F, -1F, 0.5F, 1.5F, 0F, 0F, -2F, -2F, 0F, -2F, 1F, 0.5F, 0F, 1.5F, 1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 59
		hipsModel[141].setRotationPoint(0F, -21F, 0F);

		hipsModel[142].addShapeBox(0F, -20F, -2F, 4, 4, 1, 0F,1F, -1F, 0.5F, -3F, -1.5F, 0F, -2F, -1F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 1.5F, -1.5F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[142].setRotationPoint(0F, -21F, 0F);

		hipsModel[143].addShapeBox(-21F, 1F, -1F, 2, 5, 1, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F); // Box 61
		hipsModel[143].setRotationPoint(0F, -21F, 0F);

		hipsModel[144].addShapeBox(-22F, 1F, -1F, 2, 5, 1, 0F,-1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F); // Box 62
		hipsModel[144].setRotationPoint(0F, -21F, 0F);

		hipsModel[145].addShapeBox(9F, -10F, -0.5F, 3, 4, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[145].setRotationPoint(0F, -21F, 0F);

		hipsModel[146].addShapeBox(12F, -9F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[146].setRotationPoint(0F, -21F, 0F);

		hipsModel[147].addShapeBox(12F, -6F, -0.5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 66
		hipsModel[147].setRotationPoint(0F, -21F, 0F);

		hipsModel[148].addShapeBox(14F, -6F, -0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 1F, -.5F, 0F, 1F, -.5F, 0F, 0F, .5F, 0F); // Box 67
		hipsModel[148].setRotationPoint(0F, -21F, 0F);

		hipsModel[149].addShapeBox(14F, -10F, -0.5F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[149].setRotationPoint(0F, -21F, 0F);

		hipsModel[150].addShapeBox(16F, -7F, -0.5F, 2, 3, 1, 0F,0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, -1F, -.5F, 0F, 1.5F, -2.5F, 0F, 1.5F, -2.5F, 0F, -1F, -.5F, 0F); // Box 69
		hipsModel[150].setRotationPoint(0F, -21F, 0F);

		hipsModel[151].addShapeBox(18F, -10F, -0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 1.5F, 0F, -.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[151].setRotationPoint(0F, -21F, 0F);

		hipsModel[152].addShapeBox(18F, -12F, -0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F); // Box 72
		hipsModel[152].setRotationPoint(0F, -21F, 0F);

		hipsModel[153].addShapeBox(16F, -12F, -0.5F, 2, 2, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 73
		hipsModel[153].setRotationPoint(0F, -21F, 0F);

		hipsModel[154].addShapeBox(17.5F, -15F, -0.5F, 1, 3, 1, 0F,.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 74
		hipsModel[154].setRotationPoint(0F, -21F, 0F);

		hipsModel[155].addShapeBox(18.5F, -15F, -0.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 75
		hipsModel[155].setRotationPoint(0F, -21F, 0F);

		hipsModel[156].addShapeBox(17.5F, -18F, -0.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 76
		hipsModel[156].setRotationPoint(0F, -21F, 0F);

		hipsModel[157].addShapeBox(9F, -10F, -1.5F, 3, 4, 1, 0F,-.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		hipsModel[157].setRotationPoint(0F, -21F, 0F);

		hipsModel[158].addShapeBox(9F, -6F, -1.5F, 3, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		hipsModel[158].setRotationPoint(0F, -21F, 0F);

		hipsModel[159].addShapeBox(12F, -6F, -1.5F, 2, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 79
		hipsModel[159].setRotationPoint(0F, -21F, 0F);

		hipsModel[160].addShapeBox(12F, -9F, -1.5F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		hipsModel[160].setRotationPoint(0F, -21F, 0F);

		hipsModel[161].addShapeBox(14F, -10F, -1.5F, 2, 4, 1, 0F,0F, -1.5F, -0.3F, 0.5F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 81
		hipsModel[161].setRotationPoint(0F, -21F, 0F);

		hipsModel[162].addShapeBox(14F, -6F, -1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 1F, -1F, -0.3F, 1F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 82
		hipsModel[162].setRotationPoint(0F, -21F, 0F);

		hipsModel[163].addShapeBox(16F, -10F, -1.5F, 2, 3, 1, 0F,-0.5F, -0.5F, -0.3F, -1.5F, -0.5F, -0.3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 83
		hipsModel[163].setRotationPoint(0F, -21F, 0F);

		hipsModel[164].addShapeBox(16F, -7F, -1.5F, 2, 3, 1, 0F,0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, -1F, -1F, -0.3F, 1F, -3F, -0.3F, 1.5F, -2.5F, 0F, -1F, -0.5F, 0F); // Box 84
		hipsModel[164].setRotationPoint(0F, -21F, 0F);

		hipsModel[165].addShapeBox(18F, -10F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, -0.3F, -0.5F, 1.5F, 0F, 0F, 0F, 0F); // Box 85
		hipsModel[165].setRotationPoint(0F, -21F, 0F);

		hipsModel[166].addShapeBox(16F, -10F, -1.5F, 2, 2, 1, 0F,-0.5F, -0.5F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 86
		hipsModel[166].setRotationPoint(0F, -21F, 0F);

		hipsModel[167].addShapeBox(16F, -12F, -1.5F, 2, 2, 1, 0F,-1F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, -0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87
		hipsModel[167].setRotationPoint(0F, -21F, 0F);

		hipsModel[168].addShapeBox(17.5F, -15F, -1.5F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 89
		hipsModel[168].setRotationPoint(0F, -21F, 0F);

		hipsModel[169].addShapeBox(17.5F, -18F, -1.5F, 2, 3, 1, 0F,-1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 91
		hipsModel[169].setRotationPoint(0F, -21F, 0F);

		hipsModel[170].addShapeBox(4F, -8F, -4F, 3, 2, 2, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[170].setRotationPoint(0F, -21F, 0F);

		hipsModel[171].addShapeBox(4F, -6F, -4F, 3, 5, 2, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 69
		hipsModel[171].setRotationPoint(0F, -21F, 0F);

		hipsModel[172].addShapeBox(7F, -6F, -3F, 3, 4, 1, 0F,0F, 0F, 1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -1F, -2F, -0.5F, -1F, -1F, 1F, 0F, 0.5F, 0F); // Box 70
		hipsModel[172].setRotationPoint(0F, -21F, 0F);

		hipsModel[173].addShapeBox(7F, -8F, -3F, 3, 2, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		hipsModel[173].setRotationPoint(0F, -21F, 0F);

		hipsModel[174].addShapeBox(22.5F, -18.5F, 1F, 1, 2, 1, 0F,0F, .7F, 0F, .5F, 0F, .5F, 0F, -.5F, -.5F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 57
		hipsModel[174].setRotationPoint(0F, -21F, 0F);

		hipsModel[175].addShapeBox(22.5F, -16.5F, 1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, .5F, 0F, -.8F, -.3F, 0F, -.5F, 0F); // Box 58
		hipsModel[175].setRotationPoint(0F, -21F, 0F);

		hipsModel[176].addShapeBox(27.5F, -18.5F, -0.5F, 1, 1, 1, 0F,0F, -.3F, 0F, -.3F, -.8F, -.2F, -.3F, -.8F, -.2F, 0F, -.3F, 0F, 0F, 0F, 0F, -.1F, .2F, -.4F, -.1F, .2F, -.4F, 0F, 0F, 0F); // Box 59
		hipsModel[176].setRotationPoint(0F, -21F, 0F);

		hipsModel[177].addShapeBox(27.5F, -18.5F, 0.5F, 1, 2, 1, 0F,0F, -.4F, 0F, -.35F, -.8F, .45F, -.5F, -1F, -.7F, 0F, -.7F, -.3F, 0F, .1F, 0F, 0F, .1F, .45F, -.1F, 0F, -.4F, 0F, .1F, 0F); // Box 60
		hipsModel[177].setRotationPoint(0F, -21F, 0F);

		hipsModel[178].addShapeBox(23.5F, -18.5F, 0.5F, 3, 2, 1, 0F,-.5F, 0F, 0F, 0F, -.2F, 0F, 0F, -.7F, -.3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F); // Box 61
		hipsModel[178].setRotationPoint(0F, -21F, 0F);

		hipsModel[179].addShapeBox(26.5F, -18.5F, 0.5F, 1, 2, 1, 0F,0F, -.2F, 0F, 0F, -.4F, 0F, 0F, -.7F, -.3F, 0F, -.7F, -.3F, 0F, 0F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, -.3F); // Box 62
		hipsModel[179].setRotationPoint(0F, -21F, 0F);

		hipsModel[180].addShapeBox(22.5F, -18.5F, 0F, 1, 2, 1, 0F,0F, 1F, 0F, .5F, 0F, 0F, .5F, 0F, -0.5F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 64
		hipsModel[180].setRotationPoint(0F, -21F, 0F);

		hipsModel[181].addShapeBox(20.5F, -19.5F, 0F, 2, 3, 1, 0F,.3F, .2F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		hipsModel[181].setRotationPoint(0F, -21F, 0F);

		hipsModel[182].addShapeBox(18.5F, -18.5F, 0F, 2, 2, 1, 0F,-.3F, .3F, 0F, -.3F, 1.2F, 0F, -.3F, 1F, 0F, -.3F, .3F, 0F, .5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 0F); // Box 66
		hipsModel[182].setRotationPoint(0F, -21F, 0F);

		hipsModel[183].addShapeBox(18F, -12F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 67
		hipsModel[183].setRotationPoint(0F, -21F, 0F);

		hipsModel[184].addShapeBox(18.5F, -15F, -1.5F, 2, 3, 1, 0F,-1F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 68
		hipsModel[184].setRotationPoint(0F, -21F, 0F);

		hipsModel[185].addShapeBox(23.5F, -16.5F, 0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -1F, 0F, 0F, -1.4F, -.5F, 0F, -.8F, .2F); // Box 69
		hipsModel[185].setRotationPoint(0F, -21F, 0F);

		hipsModel[186].addShapeBox(25.3F, -16.5F, 0.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.1F, -.5F, 0F, -.1F, -1F, -.7F, 0F, 0F, -.8F, 0F, 0F, -1.1F, -.3F, -1.1F, -1F, 0F); // Box 70
		hipsModel[186].setRotationPoint(0F, -21F, 0F);

		hipsModel[187].addShapeBox(27.3F, -16.3F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, .1F, 0F, 0F, -.1F, 0F, -.5F, 0F, 0F, -.1F, 0F, 0F, 0F, 0F, -.2F, 0F, -.3F, -.5F, -.6F, 0F, -.3F, -.3F); // Box 71
		hipsModel[187].setRotationPoint(0F, -21F, 0F);

		hipsModel[188].addShapeBox(20.5F, -14.5F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, .5F, 0F, .3F, -.5F, 0F, 0F, -.8F, 0F, -.5F, 0F, 0F); // Box 76
		hipsModel[188].setRotationPoint(0F, -21F, 0F);

		hipsModel[189].addShapeBox(22.6F, -18.8F, 1F, 1, 1, 1, 0F,0F, -.8F, 0F, -.4F, -.7F, 0F, -.4F, -.7F, -.15F, -.2F, -.8F, .1F, 0F, 0F, 0F, 0F, -.1F, 0F, 0F, -.1F, -.45F, 0F, 0F, .2F); // Box 1
		hipsModel[189].setRotationPoint(0F, -21F, 0F);

		hipsModel[190].addShapeBox(22.6F, -19.21F, 1F, 1, 1, 1, 0F,-.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, -.35F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, 0F, -.2F, -.4F, -.35F, -.2F, -.4F, 0F); // Box 3
		hipsModel[190].setRotationPoint(0F, -20F, 0F);

		hipsModel[191].addShapeBox(22.6F, -19.41F, 1F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -.2F, -0.4F, -0.4F, -.1F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -.35F, -0.2F, -0.4F, 0F); // Box 5
		hipsModel[191].setRotationPoint(0F, -20F, 0F);

		hipsModel[192].addShapeBox(22.6F, -19.01F, 1F, 1, 1, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.1F); // Box 6
		hipsModel[192].setRotationPoint(0F, -20F, 0F);

		hipsModel[193].addShapeBox(18.5F, -16.5F, -2F, 2, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 7
		hipsModel[193].setRotationPoint(0F, -21F, 0F);

		hipsModel[194].addShapeBox(18.5F, -18.5F, -2F, 2, 2, 1, 0F,-0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, -1F, 0F); // Box 8
		hipsModel[194].setRotationPoint(0F, -21F, 0F);

		hipsModel[195].addShapeBox(20.5F, -16.5F, -2F, 2, 2, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[195].setRotationPoint(0F, -21F, 0F);

		hipsModel[196].addShapeBox(20.5F, -19.5F, -2F, 2, 3, 1, 0F,0.3F, -1F, 0F, 0F, -1F, 0.2F, 0F, -0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[196].setRotationPoint(0F, -21F, 0F);

		hipsModel[197].addShapeBox(22.5F, -18.5F, -2F, 1, 2, 1, 0F,0F, 0F, 0.2F, 0F, -0.5F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 11
		hipsModel[197].setRotationPoint(0F, -21F, 0F);

		hipsModel[198].addShapeBox(22.5F, -16.5F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -0.3F, 0F, -0.2F, 0.5F, 0F, 0F, 0F); // Box 12
		hipsModel[198].setRotationPoint(0F, -21F, 0F);

		hipsModel[199].addShapeBox(23.5F, -18.5F, -1.5F, 3, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.7F, -0.3F, 0F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		hipsModel[199].setRotationPoint(0F, -21F, 0F);

		hipsModel[200].addShapeBox(23.5F, -16.5F, -1.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.2F, 0F, -1.4F, -0.5F, 0F, -1F, 0F, 0F, -0.2F, 0F); // Box 14
		hipsModel[200].setRotationPoint(0F, -21F, 0F);

		hipsModel[201].addShapeBox(26.5F, -18.5F, -1.5F, 1, 2, 1, 0F,0F, -0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.3F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Box 15
		hipsModel[201].setRotationPoint(0F, -21F, 0F);

		hipsModel[202].addShapeBox(25.3F, -16.5F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1.1F, -1F, 0F, 0F, -1.1F, -0.3F, 0F, -0.8F, 0F, -1F, -0.7F, 0F); // Box 16
		hipsModel[202].setRotationPoint(0F, -21F, 0F);

		hipsModel[203].addShapeBox(27.3F, -16.3F, -1.5F, 1, 1, 1, 0F,0F, 0F, -0.1F, -0.1F, 0F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, -0.3F, -0.5F, -0.6F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 17
		hipsModel[203].setRotationPoint(0F, -21F, 0F);

		hipsModel[204].addShapeBox(27.5F, -18.5F, -1.5F, 1, 2, 1, 0F,0F, -0.7F, -0.3F, -0.5F, -1F, -0.7F, -0.35F, -0.8F, 0.45F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, -0.1F, 0F, -0.4F, 0F, 0.1F, 0.45F, 0F, 0.1F, 0F); // Box 18
		hipsModel[204].setRotationPoint(0F, -21F, 0F);

		hipsModel[205].addShapeBox(18.5F, -19.5F, -2F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.5F, -0.5F, 0F, 0F); // Box 19
		hipsModel[205].setRotationPoint(0F, -21F, 0F);

		hipsModel[206].addShapeBox(18.5F, -20.5F, -2F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, -0.5F); // Box 20
		hipsModel[206].setRotationPoint(0F, -21F, 0F);

		hipsModel[207].addShapeBox(20.5F, -14.5F, -1F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.8F, 0F, 0.3F, -0.5F, 0F, -0.6F, 0.5F, 0F); // Box 21
		hipsModel[207].setRotationPoint(0F, -21F, 0F);

		hipsModel[208].addShapeBox(22.6F, -19.41F, -2F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 22
		hipsModel[208].setRotationPoint(0F, -20F, 0F);

		hipsModel[209].addShapeBox(22.6F, -19.21F, -2F, 1, 1, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 23
		hipsModel[209].setRotationPoint(0F, -20F, 0F);

		hipsModel[210].addShapeBox(22.6F, -19.01F, -2F, 1, 1, 1, 0F,-0.2F, -0.4F, 0F, -0.2F, -0.4F, -0.35F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 24
		hipsModel[210].setRotationPoint(0F, -20F, 0F);

		hipsModel[211].addShapeBox(22.6F, -18.8F, -2F, 1, 1, 1, 0F,-0.2F, -0.8F, 0.1F, -0.4F, -0.7F, -0.15F, -0.4F, -0.7F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0.2F, 0F, -0.1F, -0.45F, 0F, -0.1F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[211].setRotationPoint(0F, -21F, 0F);

		hipsModel[212].addShapeBox(-3.5F, -21F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[212].setRotationPoint(0F, -21F, 0F);

		hipsModel[213].addShapeBox(24F, -18.5F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 4
		hipsModel[213].setRotationPoint(0F, -21F, 0F);

		hipsModel[214].addShapeBox(24F, -18F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .6F, 0F, 0F, .2F, 0F, 0F, .2F, -.3F, 0F, .6F, -.3F); // Box 5
		hipsModel[214].setRotationPoint(0F, -21F, 0F);

		hipsModel[215].addShapeBox(24F, -16F, 0F, 1, 1, 2, 0F,0F, -.6F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.6F, -.3F, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .2F, -1F); // Box 6
		hipsModel[215].setRotationPoint(0F, -21F, 0F);

		hipsModel[216].addShapeBox(17F, -15F, -1F, 1, 1, 2, 0F,.1F, .2F, -.4F, 0F, 0F, .3F, 0F, 0F, .3F, .1F, .2F, -.4F, .3F, -.3F, -.4F, 0F, 0F, .3F, 0F, 0F, .3F, .3F, -.3F, -.4F); // Box 7
		hipsModel[216].setRotationPoint(0F, -21F, 0F);

		hipsModel[217].addShapeBox(18F, -15F, -2F, 2, 1, 4, 0F,0F, 0F, -.7F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.7F); // Box 8
		hipsModel[217].setRotationPoint(0F, -21F, 0F);

		hipsModel[218].addShapeBox(20F, -14.5F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, .1F, -.2F, -1F, .1F, -.2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -1.2F, 0F, .2F, -1.2F, 0F, 0F, 0F); // Box 9
		hipsModel[218].setRotationPoint(0F, -21F, 0F);

		hipsModel[219].addShapeBox(22F, -14.5F, -0.5F, 3, 1, 1, 0F,0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .2F, 0F); // Box 10
		hipsModel[219].setRotationPoint(0F, -21F, 0F);

		hipsModel[220].addShapeBox(24F, -16F, 1F, 1, 1, 1, 0F,-.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.3F, 0F, -.1F, -.6F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, .1F, 0F, -.1F, .4F, 0F); // Box 11
		hipsModel[220].setRotationPoint(0F, -21F, 0F);

		hipsModel[221].addShapeBox(24F, -15.8F, 2F, 1, 1, 1, 0F,-.1F, -.4F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -1F, -.1F, -.4F, -.2F, -.1F, .2F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, -1F, -.1F, .2F, -.2F); // Box 12
		hipsModel[221].setRotationPoint(0F, -21F, 0F);

		hipsModel[222].addShapeBox(19.2F, -15.5F, 1.9F, 5, 1, 1, 0F,-.1F, -2.1F, -1.5F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -2.1F, 1.2F, -.1F, 1.9F, -1.5F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, 1.9F, 1.2F); // Box 13
		hipsModel[222].setRotationPoint(0F, -21F, 0F);

		hipsModel[223].addShapeBox(16.4F, -13.5F, 3.6F, 3, 1, 1, 0F,-.1F, -.6F, -.1F, -.1F, -.1F, .2F, -.1F, -.1F, -.5F, -.1F, -.6F, -.1F, -.1F, .4F, -.1F, -.1F, -.1F, .2F, -.1F, -.1F, -.5F, -.1F, .4F, -.1F); // Box 16
		hipsModel[223].setRotationPoint(0F, -21F, 0F);

		hipsModel[224].addShapeBox(13.6F, -13F, 3.6F, 3, 1, 1, 0F,-.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F); // Box 17
		hipsModel[224].setRotationPoint(0F, -21F, 0F);

		hipsModel[225].addShapeBox(11.8F, -13.5F, 3.6F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 18
		hipsModel[225].setRotationPoint(0F, -21F, 0F);

		hipsModel[226].addShapeBox(9F, -15.5F, 3.6F, 3, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 19
		hipsModel[226].setRotationPoint(0F, -21F, 0F);

		hipsModel[227].addShapeBox(5.2F, -17.5F, 3.6F, 4, 1, 1, 0F,-0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F); // Box 20
		hipsModel[227].setRotationPoint(0F, -21F, 0F);

		hipsModel[228].addShapeBox(1.4F, -21.5F, 3.6F, 4, 1, 1, 0F,-0.1F, 2F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 2F, -0.1F, -0.1F, -2.2F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.2F, -0.1F); // Box 21
		hipsModel[228].setRotationPoint(0F, -21F, 0F);

		hipsModel[229].addShapeBox(-0.4F, -23.6F, 3.6F, 2, 1, 1, 0F,-0.5F, .9F, .3F, -0.1F, -.1F, -0.1F, -0.1F, -.1F, -0.1F, -0.1F, .9F, -.9F, -0.5F, -1.1F, .3F, -0.1F, -.1F, -0.1F, -0.1F, -.1F, -0.1F, -0.1F, -1.1F, -0.9F); // Box 22
		hipsModel[229].setRotationPoint(0F, -21F, 0F);

		hipsModel[230].addShapeBox(-1.4F, -24.6F, -2F, 1, 1, 4, 0F,-0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F); // Box 23
		hipsModel[230].setRotationPoint(0F, -21F, 0F);

		hipsModel[231].addShapeBox(-1.4F, -24.6F, 2F, 1, 1, 2, 0F,-0.1F, -.1F, 0F, -0.1F, -.1F, 0F, .5F, -.1F, -.7F, -1.1F, -.1F, -0.3F, -0.1F, -.1F, 0F, -0.1F, -.1F, 0F, .5F, -.1F, -.7F, -1.1F, -.1F, -0.3F); // Box 24
		hipsModel[231].setRotationPoint(0F, -21F, 0F);

		hipsModel[232].addShapeBox(24F, -18.5F, -2F, 1, 1, 2, 0F,0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		hipsModel[232].setRotationPoint(0F, -21F, 0F);

		hipsModel[233].addShapeBox(24F, -18F, -2F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0F, 0F, 0.6F, 0F); // Box 26
		hipsModel[233].setRotationPoint(0F, -21F, 0F);

		hipsModel[234].addShapeBox(24F, -16F, -2F, 1, 1, 2, 0F,0F, -0.6F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, 0F); // Box 27
		hipsModel[234].setRotationPoint(0F, -21F, 0F);

		hipsModel[235].addShapeBox(24F, -16F, -2F, 1, 1, 1, 0F,-0.1F, -0.6F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 28
		hipsModel[235].setRotationPoint(0F, -21F, 0F);

		hipsModel[236].addShapeBox(24F, -15.8F, -3F, 1, 1, 1, 0F,-0.1F, -0.4F, -0.2F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, 0F, -0.1F, -0.4F, 0F, -0.1F, 0.2F, -0.2F, -0.1F, -0.1F, -1F, -0.1F, -0.1F, 0F, -0.1F, 0.2F, 0F); // Box 29
		hipsModel[236].setRotationPoint(0F, -21F, 0F);

		hipsModel[237].addShapeBox(19.2F, -15.5F, -2.9F, 5, 1, 1, 0F,-0.1F, -2.1F, 1.2F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -2.1F, -1.5F, -0.1F, 1.9F, 1.2F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 1.9F, -1.5F); // Box 30
		hipsModel[237].setRotationPoint(0F, -21F, 0F);

		hipsModel[238].addShapeBox(16.4F, -13.5F, -4.6F, 3, 1, 1, 0F,-0.1F, -0.6F, -0.1F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.2F, -0.1F, -0.6F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.2F, -0.1F, 0.4F, -0.1F); // Box 31
		hipsModel[238].setRotationPoint(0F, -21F, 0F);

		hipsModel[239].addShapeBox(13.6F, -13F, -4.6F, 3, 1, 1, 0F,-.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F, -.1F); // Box 32
		hipsModel[239].setRotationPoint(0F, -21F, 0F);

		hipsModel[240].addShapeBox(11.8F, -13.5F, -4.6F, 2, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.6F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 33
		hipsModel[240].setRotationPoint(0F, -21F, 0F);

		hipsModel[241].addShapeBox(9F, -15.5F, -4.6F, 3, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 34
		hipsModel[241].setRotationPoint(0F, -21F, 0F);

		hipsModel[242].addShapeBox(5.2F, -17.5F, -4.6F, 4, 1, 1, 0F,-0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.1F, -0.1F); // Box 35
		hipsModel[242].setRotationPoint(0F, -21F, 0F);

		hipsModel[243].addShapeBox(1.4F, -21.5F, -4.6F, 4, 1, 1, 0F,-0.1F, 2F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, -2.1F, -0.1F, -0.1F, 2F, -0.1F, -0.1F, -2.2F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, 1.9F, -0.1F, -0.1F, -2.2F, -0.1F); // Box 36
		hipsModel[243].setRotationPoint(0F, -21F, 0F);

		hipsModel[244].addShapeBox(-0.4F, -23.6F, -4.6F, 2, 1, 1, 0F,-0.1F, 0.9F, -0.9F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.5F, 0.9F, 0.3F, -0.1F, -1.1F, -0.9F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.5F, -1.1F, 0.3F); // Box 37
		hipsModel[244].setRotationPoint(0F, -21F, 0F);

		hipsModel[245].addShapeBox(-1.4F, -24.6F, -4F, 1, 1, 2, 0F,-1.1F, -0.1F, -0.3F, 0.5F, -0.1F, -0.7F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -1.1F, -0.1F, -0.3F, 0.5F, -0.1F, -0.7F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 38
		hipsModel[245].setRotationPoint(0F, -21F, 0F);

		hipsModel[246].addShapeBox(-3.5F, -21F, 1F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[246].setRotationPoint(0F, -21F, 0F);

		hipsModel[247].addShapeBox(-3.5F, -17F, 3F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 40
		hipsModel[247].setRotationPoint(0F, -21F, 0F);

		hipsModel[248].addShapeBox(0.5F, -21F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[248].setRotationPoint(0F, -21F, 0F);

		hipsModel[249].addShapeBox(0.5F, -21F, 1F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F); // Box 42
		hipsModel[249].setRotationPoint(0F, -21F, 0F);

		hipsModel[250].addShapeBox(0.5F, -16F, 3F, 3, 4, 1, 0F,0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 43
		hipsModel[250].setRotationPoint(0F, -21F, 0F);

		hipsModel[251].addShapeBox(3.5F, -20F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, .5F, -2F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 44
		hipsModel[251].setRotationPoint(0F, -21F, 0F);

		hipsModel[252].addShapeBox(3.5F, -20F, 1F, 3, 4, 3, 0F,0F, 0F, 0F, .5F, -2F, 0F, 0F, -3F, -1.5F, 0F, -1.5F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, .5F, -1F, 0F, -.5F, 0F); // Box 45
		hipsModel[252].setRotationPoint(0F, -21F, 0F);

		hipsModel[253].addShapeBox(3.5F, -16F, 3F, 3, 4, 1, 0F,0F, 1F, 0F, 0F, .5F, 1F, 0F, -.5F, -1F, 0F, .5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 1F); // Box 46
		hipsModel[253].setRotationPoint(0F, -21F, 0F);

		hipsModel[254].addShapeBox(-6.5F, -21F, 1F, 3, 5, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F); // Box 47
		hipsModel[254].setRotationPoint(0F, -21F, 0F);

		hipsModel[255].addShapeBox(-6.5F, -16F, 3F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 48
		hipsModel[255].setRotationPoint(0F, -21F, 0F);

		hipsModel[256].addShapeBox(-6.5F, -21F, -1F, 3, 1, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 49
		hipsModel[256].setRotationPoint(0F, -21F, 0F);

		hipsModel[257].addShapeBox(-8.5F, -20F, -1F, 2, 1, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F); // Box 50
		hipsModel[257].setRotationPoint(0F, -21F, 0F);

		hipsModel[258].addShapeBox(-8.5F, -20F, 1F, 2, 4, 3, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -2.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 51
		hipsModel[258].setRotationPoint(0F, -21F, 0F);

		hipsModel[259].addShapeBox(-8.5F, -16F, 3F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 52
		hipsModel[259].setRotationPoint(0F, -21F, 0F);

		hipsModel[260].addShapeBox(-10.5F, -18.5F, -1F, 2, 1, 2, 0F,.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Box 53
		hipsModel[260].setRotationPoint(0F, -21F, 0F);

		hipsModel[261].addShapeBox(-10.5F, -19F, 1F, 2, 3, 3, 0F,.5F, -2.5F, 0F, 0F, -.5F, 0F, 0F, -1.5F, -1F, 0F, -3F, -1F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, 1F, 0F); // Box 54
		hipsModel[261].setRotationPoint(0F, -21F, 0F);

		hipsModel[262].addShapeBox(-10.5F, -16F, 3F, 2, 4, 1, 0F,-.3F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, .5F); // Box 55
		hipsModel[262].setRotationPoint(0F, -21F, 0F);

		hipsModel[263].addShapeBox(-3.5F, -12F, 4F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 1F, 0F, .5F, 1F); // Box 57
		hipsModel[263].setRotationPoint(0F, -21F, 0F);

		hipsModel[264].addShapeBox(0.5F, -12F, 4F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F); // Box 62
		hipsModel[264].setRotationPoint(0F, -21F, 0F);

		hipsModel[265].addShapeBox(3.5F, -12F, 4F, 3, 3, 1, 0F,0F, 0F, 0F, -.5F, 0F, 1F, -.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -.5F, 0F, 0F, 0F); // Box 63
		hipsModel[265].setRotationPoint(0F, -21F, 0F);

		hipsModel[266].addShapeBox(-6.5F, -12F, 4F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, .5F); // Box 0
		hipsModel[266].setRotationPoint(0F, -21F, 0F);

		hipsModel[267].addShapeBox(-8.5F, -12F, 4F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F, 0F); // Box 1
		hipsModel[267].setRotationPoint(0F, -21F, 0F);

		hipsModel[268].addShapeBox(-10.5F, -12F, 4F, 2, 3, 1, 0F,-.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 1F, 0F); // Box 2
		hipsModel[268].setRotationPoint(0F, -21F, 0F);

		hipsModel[269].addShapeBox(2.5F, -9F, 4F, 1, 3, 1, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.2F, 0F, .3F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, .8F); // Box 0
		hipsModel[269].setRotationPoint(0F, -21F, 0F);

		hipsModel[270].addShapeBox(2.5F, -6F, 4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.8F, .5F, .15F, 0F, -.5F, .15F, 0F, -.5F, 0F, -0.1F, .5F, 0F, .1F); // Box 1
		hipsModel[270].setRotationPoint(0F, -21F, 0F);

		hipsModel[271].addShapeBox(2F, -3F, 2F, 1, 3, 2, 0F,.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, .9F, 0F, 0F, 1.1F, .5F, .3F, 0F, -.5F, .3F, 0F, -.2F, -1.5F, .2F, .2F, -1.5F, .4F); // Box 2
		hipsModel[271].setRotationPoint(0F, -21F, 0F);

		hipsModel[272].addShapeBox(1.5F, -2.5F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Box 3
		hipsModel[272].setRotationPoint(0F, -21F, 0F);

		hipsModel[273].addShapeBox(-8.5F, -9F, 4F, 1, 3, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F); // Box 4
		hipsModel[273].setRotationPoint(0F, -21F, 0F);

		hipsModel[274].addShapeBox(-8.5F, -6F, 4F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, -0.5F, -.3F, 0F, 0.5F, -.3F, 0F, 0.5F, -.5F, 0.1F, -0.5F, -.5F, -0.1F); // Box 5
		hipsModel[274].setRotationPoint(0F, -21F, 0F);

		hipsModel[275].addShapeBox(-8F, -3.5F, 2F, 1, 3, 2, 0F,-0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 1.1F, 0F, 0F, 0.9F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.2F, -1.5F, 0.4F, -0.2F, -1.5F, 0.2F); // Box 6
		hipsModel[275].setRotationPoint(0F, -21F, 0F);

		hipsModel[276].addShapeBox(-7.5F, -3F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 7
		hipsModel[276].setRotationPoint(0F, -21F, 0F);

		hipsModel[277].addShapeBox(-7.5F, -9F, 8F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		hipsModel[277].setRotationPoint(0F, -21F, 0F);
		hipsModel[277].rotateAngleX = 0.26179939F;

		hipsModel[278].addShapeBox(-2.5F, -21.5F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		hipsModel[278].setRotationPoint(0F, -21F, 0F);

		hipsModel[279].addShapeBox(-2.5F, -21.5F, 1F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[279].setRotationPoint(0F, -21F, 0F);

		hipsModel[280].addShapeBox(-2.5F, -19.5F, 3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -.5F, 0F, -3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 11
		hipsModel[280].setRotationPoint(0F, -21F, 0F);

		hipsModel[281].addShapeBox(3.5F, -12F, -5F, 3, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 12
		hipsModel[281].setRotationPoint(0F, -21F, 0F);

		hipsModel[282].addShapeBox(0.5F, -12F, -5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 13
		hipsModel[282].setRotationPoint(0F, -21F, 0F);

		hipsModel[283].addShapeBox(-3.5F, -12F, -5F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 14
		hipsModel[283].setRotationPoint(0F, -21F, 0F);

		hipsModel[284].addShapeBox(-6.5F, -12F, -5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, -0.5F); // Box 15
		hipsModel[284].setRotationPoint(0F, -21F, 0F);

		hipsModel[285].addShapeBox(-8.5F, -12F, -5F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 16
		hipsModel[285].setRotationPoint(0F, -21F, 0F);

		hipsModel[286].addShapeBox(-10.5F, -12F, -5F, 2, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 17
		hipsModel[286].setRotationPoint(0F, -21F, 0F);

		hipsModel[287].addShapeBox(-10.5F, -16F, -4F, 2, 4, 1, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.8F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 18
		hipsModel[287].setRotationPoint(0F, -21F, 0F);

		hipsModel[288].addShapeBox(-8.5F, -16F, -4F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		hipsModel[288].setRotationPoint(0F, -21F, 0F);

		hipsModel[289].addShapeBox(-6.5F, -16F, -4F, 3, 4, 1, 0F,0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		hipsModel[289].setRotationPoint(0F, -21F, 0F);

		hipsModel[290].addShapeBox(-3.5F, -17F, -4F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		hipsModel[290].setRotationPoint(0F, -21F, 0F);

		hipsModel[291].addShapeBox(0.5F, -16F, -4F, 3, 4, 1, 0F,0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		hipsModel[291].setRotationPoint(0F, -21F, 0F);

		hipsModel[292].addShapeBox(3.5F, -16F, -4F, 3, 4, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		hipsModel[292].setRotationPoint(0F, -21F, 0F);

		hipsModel[293].addShapeBox(3.5F, -20F, -4F, 3, 4, 3, 0F,0F, -1.5F, -1F, 0F, -3F, -1.5F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -1F, 0F, -1F, 0F, 0F, -2F, 0F); // Box 24
		hipsModel[293].setRotationPoint(0F, -21F, 0F);

		hipsModel[294].addShapeBox(0.5F, -21F, -4F, 3, 5, 3, 0F,0F, -2F, -1F, 0F, -2.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 25
		hipsModel[294].setRotationPoint(0F, -21F, 0F);

		hipsModel[295].addShapeBox(-3.5F, -21F, -4F, 4, 4, 3, 0F,0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		hipsModel[295].setRotationPoint(0F, -21F, 0F);

		hipsModel[296].addShapeBox(-6.5F, -21F, -4F, 3, 5, 3, 0F,0F, -2.5F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 27
		hipsModel[296].setRotationPoint(0F, -21F, 0F);

		hipsModel[297].addShapeBox(-8.5F, -20F, -4F, 2, 4, 3, 0F,0F, -2.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 28
		hipsModel[297].setRotationPoint(0F, -21F, 0F);

		hipsModel[298].addShapeBox(-10.5F, -19F, -4F, 2, 3, 3, 0F,0F, -3F, -1F, 0F, -1.5F, -1F, 0F, -0.5F, 0F, 0.5F, -2.5F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F); // Box 29
		hipsModel[298].setRotationPoint(0F, -21F, 0F);

		hipsModel[299].addShapeBox(-8.5F, -9F, -5F, 1, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		hipsModel[299].setRotationPoint(0F, -21F, 0F);

		hipsModel[300].addShapeBox(-8.5F, -6F, -5F, 1, 3, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.1F, 0.5F, -0.5F, 0.1F, 0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 31
		hipsModel[300].setRotationPoint(0F, -21F, 0F);

		hipsModel[301].addShapeBox(-8F, -3.5F, -4F, 1, 3, 2, 0F,0F, 0F, 0.9F, 0F, 0F, 1.1F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -1.5F, 0.2F, 0.2F, -1.5F, 0.4F, 0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F); // Box 32
		hipsModel[301].setRotationPoint(0F, -21F, 0F);

		hipsModel[302].addShapeBox(-7.5F, -3F, -2F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 33
		hipsModel[302].setRotationPoint(0F, -21F, 0F);

		hipsModel[303].addShapeBox(1.5F, -2.5F, -2F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 34
		hipsModel[303].setRotationPoint(0F, -21F, 0F);

		hipsModel[304].addShapeBox(2F, -3F, -4F, 1, 3, 2, 0F,0F, 0F, 1.1F, 0F, 0F, 0.9F, -0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.2F, -1.5F, 0.4F, -0.2F, -1.5F, 0.2F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F); // Box 35
		hipsModel[304].setRotationPoint(0F, -21F, 0F);

		hipsModel[305].addShapeBox(2.5F, -6F, -5F, 1, 3, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.1F, -0.5F, 0F, -0.1F, -0.5F, 0.15F, 0F, 0.5F, 0.15F, 0F); // Box 36
		hipsModel[305].setRotationPoint(0F, -21F, 0F);

		hipsModel[306].addShapeBox(2.5F, -9F, -5F, 1, 3, 1, 0F,0F, 0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[306].setRotationPoint(0F, -21F, 0F);

		hipsModel[307].addShapeBox(-2.5F, -16.5F, 3F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 38
		hipsModel[307].setRotationPoint(0F, -21F, 0F);

		hipsModel[308].addShapeBox(-2.5F, -12.5F, 4F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 39
		hipsModel[308].setRotationPoint(0F, -21F, 0F);

		hipsModel[309].addShapeBox(-2.5F, -8.5F, 5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 40
		hipsModel[309].setRotationPoint(0F, -21F, 0F);

		hipsModel[310].addShapeBox(-2.5F, -6.5F, 5F, 2, 5, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 41
		hipsModel[310].setRotationPoint(0F, -21F, 0F);

		hipsModel[311].addShapeBox(-2.5F, -2F, 2F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -2.5F, .3F, 0F, -2.5F, .3F); // Box 42
		hipsModel[311].setRotationPoint(0F, -21F, 0F);

		hipsModel[312].addShapeBox(-2.5F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 43
		hipsModel[312].setRotationPoint(0F, -21F, 0F);

		hipsModel[313].addShapeBox(-7.5F, -9F, 9F, 2, 3, 2, 0F,.2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, .2F, 0F); // Box 44
		hipsModel[313].setRotationPoint(0F, -21F, 0F);
		hipsModel[313].rotateAngleX = 0.26179939F;

		hipsModel[314].addShapeBox(-5.5F, -9F, 8F, 2, 3, 4, 0F,0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, -.1F, .2F, 0F, -.1F, .2F, 0F, .2F, .2F); // Box 45
		hipsModel[314].setRotationPoint(0F, -21F, 0F);
		hipsModel[314].rotateAngleX = 0.26179939F;

		hipsModel[315].addShapeBox(-7.5F, -9F, 11F, 2, 3, 1, 0F,.2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, .2F, .2F, 1F, .2F); // Box 46
		hipsModel[315].setRotationPoint(0F, -21F, 0F);
		hipsModel[315].rotateAngleX = 0.26179939F;

		hipsModel[316].addShapeBox(-3.5F, -9F, 8F, 2, 3, 4, 0F,0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, -.1F, .2F, 0F, -.1F, .2F, 0F, -.1F, .2F, 0F, -.1F, .2F); // Box 47
		hipsModel[316].setRotationPoint(0F, -21F, 0F);
		hipsModel[316].rotateAngleX = 0.26179939F;

		hipsModel[317].addShapeBox(-7.5F, -9F, 8F, 2, 3, 1, 0F,0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 48
		hipsModel[317].setRotationPoint(0F, -21F, 0F);
		hipsModel[317].rotateAngleX = 0.26179939F;

		hipsModel[318].addShapeBox(-3F, -9.5F, 7.5F, 1, 9, 5, 0F,0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F); // Box 49
		hipsModel[318].setRotationPoint(0F, -21F, 0F);
		hipsModel[318].rotateAngleX = 0.26179939F;

		hipsModel[319].addShapeBox(-1.5F, -9F, 8F, 2, 3, 4, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.1F, 0.2F); // Box 50
		hipsModel[319].setRotationPoint(0F, -21F, 0F);
		hipsModel[319].rotateAngleX = 0.26179939F;

		hipsModel[320].addShapeBox(0.5F, -9F, 9F, 2, 3, 2, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 51
		hipsModel[320].setRotationPoint(0F, -21F, 0F);
		hipsModel[320].rotateAngleX = 0.26179939F;

		hipsModel[321].addShapeBox(0.5F, -9F, 11F, 2, 3, 1, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1F, 0.2F, 0F, 0.2F, 0.2F); // Box 52
		hipsModel[321].setRotationPoint(0F, -21F, 0F);
		hipsModel[321].rotateAngleX = 0.26179939F;

		hipsModel[322].addShapeBox(0.5F, -9F, 8F, 2, 3, 1, 0F,0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 53
		hipsModel[322].setRotationPoint(0F, -21F, 0F);
		hipsModel[322].rotateAngleX = 0.26179939F;

		hipsModel[323].addShapeBox(-8F, -7.5F, 7.5F, 11, 1, 5, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 54
		hipsModel[323].setRotationPoint(0F, -21F, 0F);
		hipsModel[323].rotateAngleX = 0.26179939F;

		hipsModel[324].addShapeBox(-2.5F, 0F, -2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		hipsModel[324].setRotationPoint(0F, -21F, 0F);

		hipsModel[325].addShapeBox(-2.5F, -2F, -5F, 2, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.3F, 0F, -2.5F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 56
		hipsModel[325].setRotationPoint(0F, -21F, 0F);

		hipsModel[326].addShapeBox(-2.5F, -6.5F, -7F, 2, 5, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		hipsModel[326].setRotationPoint(0F, -21F, 0F);

		hipsModel[327].addShapeBox(-2.5F, -8.5F, -7F, 2, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 58
		hipsModel[327].setRotationPoint(0F, -21F, 0F);

		hipsModel[328].addShapeBox(-2.5F, -12.5F, -6F, 2, 4, 2, 0F,0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		hipsModel[328].setRotationPoint(0F, -21F, 0F);

		hipsModel[329].addShapeBox(-2.5F, -16.5F, -5F, 2, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		hipsModel[329].setRotationPoint(0F, -21F, 0F);

		hipsModel[330].addShapeBox(-2.5F, -19.5F, -5F, 2, 3, 2, 0F,0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		hipsModel[330].setRotationPoint(0F, -21F, 0F);

		hipsModel[331].addShapeBox(-2.5F, -21.5F, -3F, 2, 3, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		hipsModel[331].setRotationPoint(0F, -21F, 0F);

		hipsModel[332].addShapeBox(-8.5F, -11.5F, 8F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		hipsModel[332].setRotationPoint(0F, -21F, 0F);
		hipsModel[332].rotateAngleX = 0.26179939F;

		hipsModel[333].addShapeBox(-8.5F, -12.5F, 8F, 12, 1, 4, 0F,0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		hipsModel[333].setRotationPoint(0F, -21F, 0F);
		hipsModel[333].rotateAngleX = 0.26179939F;

		hipsModel[334].addShapeBox(-8.5F, -13F, 9.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 1F, 0F, -.4F, 1F, 0F, -.4F, 1F, 0F, -.4F, 1F); // Box 65
		hipsModel[334].setRotationPoint(0F, -21F, 0F);
		hipsModel[334].rotateAngleX = 0.26179939F;

		hipsModel[335].addShapeBox(-8.5F, -10.5F, 8F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 66
		hipsModel[335].setRotationPoint(0F, -21F, 0F);
		hipsModel[335].rotateAngleX = 0.26179939F;

		hipsModel[336].addShapeBox(-8.5F, -10F, 9.5F, 12, 1, 1, 0F,0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		hipsModel[336].setRotationPoint(0F, -21F, 0F);
		hipsModel[336].rotateAngleX = 0.26179939F;

		hipsModel[337].addShapeBox(-1F, -11.5F, 7.5F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -.3F, -.3F, -3F, -.3F, -.3F, -3F, -.3F, -.3F, 3F, -.3F, -.3F); // Box 68
		hipsModel[337].setRotationPoint(0F, -21F, 0F);
		hipsModel[337].rotateAngleX = 0.26179939F;

		hipsModel[338].addShapeBox(-1F, -13.5F, 10.5F, 1, 2, 2, 0F,-.7F, 0F, .5F, .7F, 0F, .5F, .5F, -.5F, -1F, -.5F, -.5F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		hipsModel[338].setRotationPoint(0F, -21F, 0F);
		hipsModel[338].rotateAngleX = 0.26179939F;

		hipsModel[339].addShapeBox(-1F, -13.5F, 7.5F, 1, 2, 2, 0F,-0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 97
		hipsModel[339].setRotationPoint(0F, -21F, 0F);
		hipsModel[339].rotateAngleX = 0.26179939F;

		hipsModel[340].addShapeBox(-5F, -11.5F, 7.5F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.3F, -0.3F, 3F, -0.3F, -0.3F, 3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F); // Box 98
		hipsModel[340].setRotationPoint(0F, -21F, 0F);
		hipsModel[340].rotateAngleX = 0.26179939F;

		hipsModel[341].addShapeBox(-5F, -13.5F, 10.5F, 1, 2, 2, 0F,0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		hipsModel[341].setRotationPoint(0F, -21F, 0F);
		hipsModel[341].rotateAngleX = 0.26179939F;

		hipsModel[342].addShapeBox(-5F, -13.5F, 7.5F, 1, 2, 2, 0F,0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.7F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		hipsModel[342].setRotationPoint(0F, -21F, 0F);
		hipsModel[342].rotateAngleX = 0.26179939F;

		hipsModel[343].addShapeBox(-7.5F, -9F, -12F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		hipsModel[343].setRotationPoint(0F, -21F, 0F);
		hipsModel[343].rotateAngleX = -0.26179939F;

		hipsModel[344].addShapeBox(0.5F, -9F, -9F, 2, 3, 1, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1F, 0.2F, 0F, 0.2F, 0.2F); // Box 102
		hipsModel[344].setRotationPoint(0F, -21F, 0F);
		hipsModel[344].rotateAngleX = -0.26179939F;

		hipsModel[345].addShapeBox(0.5F, -9F, -11F, 2, 3, 2, 0F,0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 103
		hipsModel[345].setRotationPoint(0F, -21F, 0F);
		hipsModel[345].rotateAngleX = -0.26179939F;

		hipsModel[346].addShapeBox(0.5F, -9F, -12F, 2, 3, 1, 0F,0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 104
		hipsModel[346].setRotationPoint(0F, -21F, 0F);
		hipsModel[346].rotateAngleX = -0.26179939F;

		hipsModel[347].addShapeBox(-8F, -7.5F, -12.5F, 11, 1, 5, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 105
		hipsModel[347].setRotationPoint(0F, -21F, 0F);
		hipsModel[347].rotateAngleX = -0.26179939F;

		hipsModel[348].addShapeBox(-1F, -11.5F, -12.5F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -.3F, -.3F, -3F, -.3F, -.3F, -3F, -.3F, -.3F, 3F, -.3F, -.3F); // Box 106
		hipsModel[348].setRotationPoint(0F, -21F, 0F);
		hipsModel[348].rotateAngleX = -0.26179939F;

		hipsModel[349].addShapeBox(-5.5F, -9F, -12F, 2, 3, 4, 0F,0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, -.1F, .2F, 0F, -.1F, .2F, 0F, .2F, .2F); // Box 107
		hipsModel[349].setRotationPoint(0F, -21F, 0F);
		hipsModel[349].rotateAngleX = -0.26179939F;

		hipsModel[350].addShapeBox(-7.5F, -9F, -9F, 2, 3, 1, 0F,.2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, .2F, .2F, .2F, .2F, .2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, .2F, .2F, 1F, .2F); // Box 108
		hipsModel[350].setRotationPoint(0F, -21F, 0F);
		hipsModel[350].rotateAngleX = -0.26179939F;

		hipsModel[351].addShapeBox(-5F, -11.5F, -12.5F, 1, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.3F, -0.3F, 3F, -0.3F, -0.3F, 3F, -0.3F, -0.3F, -3F, -0.3F, -0.3F); // Box 109
		hipsModel[351].setRotationPoint(0F, -21F, 0F);
		hipsModel[351].rotateAngleX = -0.26179939F;

		hipsModel[352].addShapeBox(-3.5F, -9F, -12F, 2, 3, 4, 0F,0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, -.1F, .2F, 0F, -.1F, .2F, 0F, -.1F, .2F, 0F, -.1F, .2F); // Box 110
		hipsModel[352].setRotationPoint(0F, -21F, 0F);
		hipsModel[352].rotateAngleX = -0.26179939F;

		hipsModel[353].addShapeBox(-1.5F, -9F, -12F, 2, 3, 4, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.1F, 0.2F); // Box 111
		hipsModel[353].setRotationPoint(0F, -21F, 0F);
		hipsModel[353].rotateAngleX = -0.26179939F;

		hipsModel[354].addShapeBox(-3F, -9.5F, -12.5F, 1, 9, 5, 0F,0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F); // Box 112
		hipsModel[354].setRotationPoint(0F, -21F, 0F);
		hipsModel[354].rotateAngleX = -0.26179939F;

		hipsModel[355].addShapeBox(-1F, -13.5F, -9.5F, 1, 2, 2, 0F,-.7F, 0F, .5F, .7F, 0F, .5F, .5F, -.5F, -1F, -.5F, -.5F, -1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		hipsModel[355].setRotationPoint(0F, -21F, 0F);
		hipsModel[355].rotateAngleX = -0.26179939F;

		hipsModel[356].addShapeBox(-5F, -13.5F, -9.5F, 1, 2, 2, 0F,0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		hipsModel[356].setRotationPoint(0F, -21F, 0F);
		hipsModel[356].rotateAngleX = -0.26179939F;

		hipsModel[357].addShapeBox(-5F, -13.5F, -12.5F, 1, 2, 2, 0F,0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.7F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 115
		hipsModel[357].setRotationPoint(0F, -21F, 0F);
		hipsModel[357].rotateAngleX = -0.26179939F;

		hipsModel[358].addShapeBox(-1F, -13.5F, -12.5F, 1, 2, 2, 0F,-0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F, 0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 116
		hipsModel[358].setRotationPoint(0F, -21F, 0F);
		hipsModel[358].rotateAngleX = -0.26179939F;

		hipsModel[359].addShapeBox(-8.5F, -13F, -10.5F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 1F, 0F, -.4F, 1F, 0F, -.4F, 1F, 0F, -.4F, 1F); // Box 117
		hipsModel[359].setRotationPoint(0F, -21F, 0F);
		hipsModel[359].rotateAngleX = -0.26179939F;

		hipsModel[360].addShapeBox(-8.5F, -12.5F, -12F, 12, 1, 4, 0F,0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		hipsModel[360].setRotationPoint(0F, -21F, 0F);
		hipsModel[360].rotateAngleX = -0.26179939F;

		hipsModel[361].addShapeBox(-8.5F, -11.5F, -12F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		hipsModel[361].setRotationPoint(0F, -21F, 0F);
		hipsModel[361].rotateAngleX = -0.26179939F;

		hipsModel[362].addShapeBox(-8.5F, -10.5F, -12F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 120
		hipsModel[362].setRotationPoint(0F, -21F, 0F);
		hipsModel[362].rotateAngleX = -0.26179939F;

		hipsModel[363].addShapeBox(-8.5F, -10F, -10.5F, 12, 1, 1, 0F,0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, -0.4F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		hipsModel[363].setRotationPoint(0F, -21F, 0F);
		hipsModel[363].rotateAngleX = -0.26179939F;

		hipsModel[364].addShapeBox(-7.5F, -9F, -12F, 2, 3, 1, 0F,0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 122
		hipsModel[364].setRotationPoint(0F, -21F, 0F);
		hipsModel[364].rotateAngleX = -0.26179939F;

		hipsModel[365].addShapeBox(-7.5F, -9F, -11F, 2, 3, 2, 0F,.2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, .2F, 0F); // Box 123
		hipsModel[365].setRotationPoint(0F, -21F, 0F);
		hipsModel[365].rotateAngleX = -0.26179939F;

		hipsModel[366].addShapeBox(-20F, -11F, -1F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		hipsModel[366].setRotationPoint(0F, -21F, 0F);
		hipsModel[366].rotateAngleZ = -0.55850536F;

		hipsModel[367].addShapeBox(-20F, -11.2F, -4F, 1, 1, 8, 0F,.1F, 0F, .1F, -.5F, 0F, .1F, -.5F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, -.5F, 0F, .1F, -.5F, 0F, .1F, .1F, 0F, .1F); // Box 0
		hipsModel[367].setRotationPoint(0F, -21F, 0F);
		hipsModel[367].rotateAngleZ = -0.55850536F;

		hipsModel[368].addShapeBox(-20.5F, -10.8F, 2F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 1
		hipsModel[368].setRotationPoint(0F, -21F, 0F);
		hipsModel[368].rotateAngleZ = -0.55850536F;

		hipsModel[369].addShapeBox(-20F, -11F, 2F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		hipsModel[369].setRotationPoint(0F, -21F, 0F);
		hipsModel[369].rotateAngleZ = -0.55850536F;

		hipsModel[370].addShapeBox(-20F, -11F, -4F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		hipsModel[370].setRotationPoint(0F, -21F, 0F);
		hipsModel[370].rotateAngleZ = -0.55850536F;

		hipsModel[371].addShapeBox(-20F, -11F, -2F, 3, 4, 4, 0F,-.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Box 4
		hipsModel[371].setRotationPoint(0F, -21F, 0F);
		hipsModel[371].rotateAngleZ = -0.55850536F;

		hipsModel[372].addShapeBox(-20.5F, -10.8F, -3F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 5
		hipsModel[372].setRotationPoint(0F, -21F, 0F);
		hipsModel[372].rotateAngleZ = -0.55850536F;

		hipsModel[373].addShapeBox(-18F, -11.2F, -4F, 1, 1, 8, 0F,-.5F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, -.5F, 0F, .1F, -.5F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, -.5F, 0F, .1F); // Box 6
		hipsModel[373].setRotationPoint(0F, -21F, 0F);
		hipsModel[373].rotateAngleZ = -0.55850536F;

		hipsModel[374].addShapeBox(-19F, -11.2F, -4F, 1, 1, 1, 0F,.5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F); // Box 7
		hipsModel[374].setRotationPoint(0F, -21F, 0F);
		hipsModel[374].rotateAngleZ = -0.55850536F;

		hipsModel[375].addShapeBox(-19F, -11.2F, 3F, 1, 1, 1, 0F,.5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F); // Box 8
		hipsModel[375].setRotationPoint(0F, -21F, 0F);
		hipsModel[375].rotateAngleZ = -0.55850536F;

		hipsModel[376].addShapeBox(-19F, -11.2F, -1F, 1, 1, 2, 0F,.5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F); // Box 9
		hipsModel[376].setRotationPoint(0F, -21F, 0F);
		hipsModel[376].rotateAngleZ = -0.55850536F;

		hipsModel[377].addShapeBox(-12.5F, -15F, 4.3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		hipsModel[377].setRotationPoint(0F, -21F, 0F);
		hipsModel[377].rotateAngleZ = -0.10471976F;

		hipsModel[378].addShapeBox(-19.8F, -10F, 3.5F, 9, 1, 1, 0F,0F, 0F, -.4F, 0F, 0F, -.8F, 0F, 0F, .3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.8F, 0F, 0F, .3F, 0F, 0F, -.4F); // Box 11
		hipsModel[378].setRotationPoint(0F, -21F, 0F);
		hipsModel[378].rotateAngleZ = -0.52359878F;

		hipsModel[379].addShapeBox(-19.8F, -10F, -4.5F, 9, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, 0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.4F); // Box 12
		hipsModel[379].setRotationPoint(0F, -21F, 0F);
		hipsModel[379].rotateAngleZ = -0.52359878F;

		hipsModel[380].addShapeBox(-19.8F, -10F, -3.5F, 1, 1, 7, 0F,0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, .4F); // Box 13
		hipsModel[380].setRotationPoint(0F, -21F, 0F);
		hipsModel[380].rotateAngleZ = -0.52359878F;

		hipsModel[381].addShapeBox(-13.5F, -15F, 4.3F, 1, 3, 2, 0F,0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		hipsModel[381].setRotationPoint(0F, -21F, 0F);
		hipsModel[381].rotateAngleZ = -0.10471976F;

		hipsModel[382].addShapeBox(-13.5F, -12F, 4.3F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, -.8F, -.1F, -.1F, -.8F, -.1F, -.1F, -.8F, -.1F, -.1F, -.8F, -.1F); // Box 15
		hipsModel[382].setRotationPoint(0F, -21F, 0F);
		hipsModel[382].rotateAngleZ = -0.10471976F;

		hipsModel[383].addShapeBox(-11.5F, -16F, 4.3F, 1, 1, 2, 0F,-.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		hipsModel[383].setRotationPoint(0F, -21F, 0F);
		hipsModel[383].rotateAngleZ = -0.10471976F;

		hipsModel[384].addShapeBox(-12.5F, -16F, 4.8F, 1, 1, 1, 0F,-.3F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.3F, -.3F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Box 17
		hipsModel[384].setRotationPoint(0F, -21F, 0F);
		hipsModel[384].rotateAngleZ = -0.10471976F;

		hipsModel[385].addShapeBox(-12F, -16F, 4.8F, 1, 1, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, .1F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, .1F, -.4F, -.3F); // Box 18
		hipsModel[385].setRotationPoint(0F, -21F, 0F);
		hipsModel[385].rotateAngleZ = -0.10471976F;

		hipsModel[386].addShapeBox(-6.1F, -19F, 4.8F, 1, 1, 1, 0F,-.2F, 0F, -.3F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.2F, 0F, -.3F); // Box 19
		hipsModel[386].setRotationPoint(0F, -21F, 0F);
		hipsModel[386].rotateAngleZ = 0.33161256F;

		hipsModel[387].addShapeBox(-6.1F, -19F, 4.8F, 1, 1, 1, 0F,-0.5F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.2F); // Box 20
		hipsModel[387].setRotationPoint(0F, -21F, 0F);
		hipsModel[387].rotateAngleZ = 0.33161256F;

		hipsModel[388].addShapeBox(-12.5F, -16F, 4.05F, 1, 1, 1, 0F,-.3F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.3F, -.3F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Box 21
		hipsModel[388].setRotationPoint(0F, -21F, 0F);
		hipsModel[388].rotateAngleZ = -0.10471976F;

		hipsModel[389].addShapeBox(-12F, -16F, 4.05F, 1, 1, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, .1F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, .1F, -.4F, -.3F); // Box 22
		hipsModel[389].setRotationPoint(0F, -21F, 0F);
		hipsModel[389].rotateAngleZ = -0.10471976F;

		hipsModel[390].addShapeBox(-12.5F, -16F, 5.55F, 1, 1, 1, 0F,-.3F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.3F, -.3F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Box 23
		hipsModel[390].setRotationPoint(0F, -21F, 0F);
		hipsModel[390].rotateAngleZ = -0.10471976F;

		hipsModel[391].addShapeBox(-12F, -16F, 5.55F, 1, 1, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, .1F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, .1F, -.4F, -.3F); // Box 24
		hipsModel[391].setRotationPoint(0F, -21F, 0F);
		hipsModel[391].rotateAngleZ = -0.10471976F;

		hipsModel[392].addShapeBox(-17.3F, -10F, 4.3F, 1, 1, 2, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.15F, .1F, -.2F, -.4F, .1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, .1F, -.2F, -.2F, .1F); // Box 25
		hipsModel[392].setRotationPoint(0F, -21F, 0F);
		hipsModel[392].rotateAngleZ = -0.52359878F;

		hipsModel[393].addShapeBox(-17.3F, -10F, -6.3F, 1, 1, 2, 0F,-0.2F, -0.4F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 26
		hipsModel[393].setRotationPoint(0F, -21F, 0F);
		hipsModel[393].rotateAngleZ = -0.52359878F;

		hipsModel[394].addShapeBox(-11.5F, -16F, -6.3F, 1, 1, 2, 0F,-.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		hipsModel[394].setRotationPoint(0F, -21F, 0F);
		hipsModel[394].rotateAngleZ = -0.10471976F;

		hipsModel[395].addShapeBox(-12F, -16F, -5.05F, 1, 1, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, .1F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, .1F, -.4F, -.3F); // Box 28
		hipsModel[395].setRotationPoint(0F, -21F, 0F);
		hipsModel[395].rotateAngleZ = -0.10471976F;

		hipsModel[396].addShapeBox(-12F, -16F, -5.8F, 1, 1, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, .1F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, .1F, -.4F, -.3F); // Box 29
		hipsModel[396].setRotationPoint(0F, -21F, 0F);
		hipsModel[396].rotateAngleZ = -0.10471976F;

		hipsModel[397].addShapeBox(-12F, -16F, -6.55F, 1, 1, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, .1F, -.4F, -.3F, 0F, -.4F, -.3F, 0F, -.4F, -.3F, .1F, -.4F, -.3F); // Box 30
		hipsModel[397].setRotationPoint(0F, -21F, 0F);
		hipsModel[397].rotateAngleZ = -0.10471976F;

		hipsModel[398].addShapeBox(-12.5F, -16F, -6.55F, 1, 1, 1, 0F,-.3F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.3F, -.3F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Box 31
		hipsModel[398].setRotationPoint(0F, -21F, 0F);
		hipsModel[398].rotateAngleZ = -0.10471976F;

		hipsModel[399].addShapeBox(-12.5F, -16F, -5.8F, 1, 1, 1, 0F,-.3F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.3F, -.3F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Box 32
		hipsModel[399].setRotationPoint(0F, -21F, 0F);
		hipsModel[399].rotateAngleZ = -0.10471976F;

		hipsModel[400].addShapeBox(-12.5F, -16F, -5.05F, 1, 1, 1, 0F,-.3F, -.3F, -.3F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, -.3F, -.3F, -.3F, 0F, 0F, -.3F, -.7F, 0F, -.3F, -.7F, 0F, -.3F, 0F, 0F, -.3F); // Box 33
		hipsModel[400].setRotationPoint(0F, -21F, 0F);
		hipsModel[400].rotateAngleZ = -0.10471976F;

		hipsModel[401].addShapeBox(-6.1F, -19F, -5.8F, 1, 1, 1, 0F,-0.5F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.2F); // Box 34
		hipsModel[401].setRotationPoint(0F, -21F, 0F);
		hipsModel[401].rotateAngleZ = 0.33161256F;

		hipsModel[402].addShapeBox(-6.1F, -19F, -5.8F, 1, 1, 1, 0F,-.2F, 0F, -.3F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.2F, 0F, -.3F, -.2F, 0F, -.3F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.2F, 0F, -.3F); // Box 35
		hipsModel[402].setRotationPoint(0F, -21F, 0F);
		hipsModel[402].rotateAngleZ = 0.33161256F;

		hipsModel[403].addShapeBox(-13.5F, -15F, -6.3F, 1, 3, 2, 0F,0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		hipsModel[403].setRotationPoint(0F, -21F, 0F);
		hipsModel[403].rotateAngleZ = -0.10471976F;

		hipsModel[404].addShapeBox(-12.5F, -15F, -6.3F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		hipsModel[404].setRotationPoint(0F, -21F, 0F);
		hipsModel[404].rotateAngleZ = -0.10471976F;

		hipsModel[405].addShapeBox(-13.5F, -12F, -6.3F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.1F, -.8F, -.1F, -.1F, -.8F, -.1F, -.1F, -.8F, -.1F, -.1F, -.8F, -.1F); // Box 38
		hipsModel[405].setRotationPoint(0F, -21F, 0F);
		hipsModel[405].rotateAngleZ = -0.10471976F;

		hipsModel[406].addShapeBox(-9.5F, -20.5F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		hipsModel[406].setRotationPoint(0F, -21F, 0F);

		hipsModel[407].addShapeBox(-9.5F, -21.5F, -5F, 3, 1, 10, 0F,-.3F, -.4F, 0F, -.3F, -.4F, 0F, -.3F, -.4F, 0F, -.3F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		hipsModel[407].setRotationPoint(0F, -21F, 0F);

		hipsModel[408].addShapeBox(-9.5F, -22F, -5F, 3, 1, 10, 0F,-1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F); // Box 42
		hipsModel[408].setRotationPoint(0F, -21F, 0F);

		hipsModel[409].addShapeBox(-9.5F, -19.5F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 43
		hipsModel[409].setRotationPoint(0F, -21F, 0F);

		hipsModel[410].addShapeBox(-9.5F, -19F, -5F, 3, 1, 10, 0F,-0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 44
		hipsModel[410].setRotationPoint(0F, -21F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0

		leftArmModel[0].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 0
		leftArmModel[0].setRotationPoint(2F, -44F, 6F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1

		rightArmModel[0].addBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F); // Box 1
		rightArmModel[0].setRotationPoint(2F, -44F, -6F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 47
		leftLegModel[1] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 48
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 49
		leftLegModel[3] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 50
		leftLegModel[4] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 51
		leftLegModel[5] = new ModelRendererTurbo(this, 3, 106, textureX, textureY); // Box 52
		leftLegModel[6] = new ModelRendererTurbo(this, 3, 110, textureX, textureY); // Box 53
		leftLegModel[7] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Box 54
		leftLegModel[8] = new ModelRendererTurbo(this, 3, 120, textureX, textureY); // Box 55
		leftLegModel[9] = new ModelRendererTurbo(this, 3, 123, textureX, textureY); // Box 56
		leftLegModel[10] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 57
		leftLegModel[11] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 58
		leftLegModel[12] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 59
		leftLegModel[13] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 1
		leftLegModel[14] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 2
		leftLegModel[15] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 3
		leftLegModel[16] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 4
		leftLegModel[17] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 5
		leftLegModel[18] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 6
		leftLegModel[19] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 14
		leftLegModel[20] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 15
		leftLegModel[21] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 16
		leftLegModel[22] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 17
		leftLegModel[23] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 18
		leftLegModel[24] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 19
		leftLegModel[25] = new ModelRendererTurbo(this, 3, 106, textureX, textureY); // Box 20
		leftLegModel[26] = new ModelRendererTurbo(this, 3, 110, textureX, textureY); // Box 21
		leftLegModel[27] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Box 22
		leftLegModel[28] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 24
		leftLegModel[29] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 0
		leftLegModel[30] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 1
		leftLegModel[31] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 2
		leftLegModel[32] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 3
		leftLegModel[33] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 4
		leftLegModel[34] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 5
		leftLegModel[35] = new ModelRendererTurbo(this, 3, 120, textureX, textureY); // Box 0
		leftLegModel[36] = new ModelRendererTurbo(this, 3, 123, textureX, textureY); // Box 1
		leftLegModel[37] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 2
		leftLegModel[38] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 3
		leftLegModel[39] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 4
		leftLegModel[40] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 5
		leftLegModel[41] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 6
		leftLegModel[42] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 7
		leftLegModel[43] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 24
		leftLegModel[44] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 25
		leftLegModel[45] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 26
		leftLegModel[46] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 27
		leftLegModel[47] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 28
		leftLegModel[48] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 29
		leftLegModel[49] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 30
		leftLegModel[50] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 31
		leftLegModel[51] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 32
		leftLegModel[52] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 33
		leftLegModel[53] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 34
		leftLegModel[54] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 35
		leftLegModel[55] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 36
		leftLegModel[56] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 37
		leftLegModel[57] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 38
		leftLegModel[58] = new ModelRendererTurbo(this, 3, 123, textureX, textureY); // Box 39
		leftLegModel[59] = new ModelRendererTurbo(this, 3, 123, textureX, textureY); // Box 40
		leftLegModel[60] = new ModelRendererTurbo(this, 3, 120, textureX, textureY); // Box 41
		leftLegModel[61] = new ModelRendererTurbo(this, 3, 120, textureX, textureY); // Box 42
		leftLegModel[62] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Box 43
		leftLegModel[63] = new ModelRendererTurbo(this, 3, 116, textureX, textureY); // Box 44
		leftLegModel[64] = new ModelRendererTurbo(this, 3, 110, textureX, textureY); // Box 45
		leftLegModel[65] = new ModelRendererTurbo(this, 3, 110, textureX, textureY); // Box 46
		leftLegModel[66] = new ModelRendererTurbo(this, 3, 106, textureX, textureY); // Box 47
		leftLegModel[67] = new ModelRendererTurbo(this, 3, 106, textureX, textureY); // Box 48
		leftLegModel[68] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 49
		leftLegModel[69] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 50
		leftLegModel[70] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 51
		leftLegModel[71] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 52
		leftLegModel[72] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 53
		leftLegModel[73] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 54
		leftLegModel[74] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 55
		leftLegModel[75] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 56
		leftLegModel[76] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 57
		leftLegModel[77] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 58
		leftLegModel[78] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 59
		leftLegModel[79] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 60
		leftLegModel[80] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 61
		leftLegModel[81] = new ModelRendererTurbo(this, 17, 100, textureX, textureY); // Box 62
		leftLegModel[82] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 63
		leftLegModel[83] = new ModelRendererTurbo(this, 10, 100, textureX, textureY); // Box 64
		leftLegModel[84] = new ModelRendererTurbo(this, 10, 94, textureX, textureY); // Box 66
		leftLegModel[85] = new ModelRendererTurbo(this, 17, 94, textureX, textureY); // Box 67

		leftLegModel[0].addShapeBox(-3F, 1F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F); // Box 47
		leftLegModel[0].setRotationPoint(6F, -25F, 5F);

		leftLegModel[1].addShapeBox(1F, 1F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F, -.5F, 0F, 0F, -.5F); // Box 48
		leftLegModel[1].setRotationPoint(6F, -25F, 5F);

		leftLegModel[2].addShapeBox(-3F, -3F, -2F, 2, 4, 1, 0F,-1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftLegModel[2].setRotationPoint(6F, -25F, 5F);

		leftLegModel[3].addShapeBox(-1F, -3F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		leftLegModel[3].setRotationPoint(6F, -25F, 5F);

		leftLegModel[4].addShapeBox(1F, -3F, -2F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		leftLegModel[4].setRotationPoint(6F, -25F, 5F);

		leftLegModel[5].addShapeBox(-2F, 5F, -1.5F, 3, 2, 1, 0F,.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.8F, 0F, .3F, -.5F, 0F, .3F); // Box 52
		leftLegModel[5].setRotationPoint(6F, -25F, 5F);

		leftLegModel[6].addShapeBox(-1.5F, 7F, -1.5F, 2, 4, 1, 0F,.5F, 0F, 0F, .2F, 0F, 0F, -.3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 53
		leftLegModel[6].setRotationPoint(6F, -25F, 5F);

		leftLegModel[7].addShapeBox(-1.5F, 11F, -1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 54
		leftLegModel[7].setRotationPoint(6F, -25F, 5F);

		leftLegModel[8].addShapeBox(-1.5F, 13F, -1.5F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F); // Box 55
		leftLegModel[8].setRotationPoint(6F, -25F, 5F);

		leftLegModel[9].addShapeBox(-1.5F, 14F, -1.5F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 56
		leftLegModel[9].setRotationPoint(6F, -25F, 5F);

		leftLegModel[10].addShapeBox(0.5F, 21F, -1F, 1, 1, 1, 0F,.5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftLegModel[10].setRotationPoint(6F, -25F, 5F);

		leftLegModel[11].addShapeBox(0F, 23F, -1F, 3, 1, 1, 0F,0F, 0F, .5F, -1F, 0F, .5F, -1.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 0F, .3F, 0F, 0F, -.2F); // Box 58
		leftLegModel[11].setRotationPoint(6F, -25F, 5F);

		leftLegModel[12].addShapeBox(-1F, 24F, -1F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, .3F, -1F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F); // Box 59
		leftLegModel[12].setRotationPoint(6F, -25F, 5F);

		leftLegModel[13].addShapeBox(-3F, -3F, -1F, 2, 4, 1, 0F,-1F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 1
		leftLegModel[13].setRotationPoint(6F, -25F, 5F);

		leftLegModel[14].addShapeBox(-1F, -3F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 2
		leftLegModel[14].setRotationPoint(6F, -25F, 5F);

		leftLegModel[15].addShapeBox(1F, -3F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 3
		leftLegModel[15].setRotationPoint(6F, -25F, 5F);

		leftLegModel[16].addShapeBox(1F, 1F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -1.5F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftLegModel[16].setRotationPoint(6F, -25F, 5F);

		leftLegModel[17].addShapeBox(-1F, 1F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftLegModel[17].setRotationPoint(6F, -25F, 5F);

		leftLegModel[18].addShapeBox(-3F, 1F, -1F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 6
		leftLegModel[18].setRotationPoint(6F, -25F, 5F);

		leftLegModel[19].addShapeBox(1F, -3F, -3F, 2, 4, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftLegModel[19].setRotationPoint(6F, -25F, 5F);

		leftLegModel[20].addShapeBox(-1F, -3F, -3F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		leftLegModel[20].setRotationPoint(6F, -25F, 5F);

		leftLegModel[21].addShapeBox(-3F, -3F, -3F, 2, 4, 1, 0F,-1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftLegModel[21].setRotationPoint(6F, -25F, 5F);

		leftLegModel[22].addShapeBox(-3F, 1F, -3F, 2, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 17
		leftLegModel[22].setRotationPoint(6F, -25F, 5F);

		leftLegModel[23].addShapeBox(-1F, 1F, -3F, 2, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftLegModel[23].setRotationPoint(6F, -25F, 5F);

		leftLegModel[24].addShapeBox(1F, 1F, -3F, 2, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 19
		leftLegModel[24].setRotationPoint(6F, -25F, 5F);

		leftLegModel[25].addShapeBox(-2F, 5F, -2.5F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftLegModel[25].setRotationPoint(6F, -25F, 5F);

		leftLegModel[26].addShapeBox(-1.5F, 7F, -2.5F, 2, 4, 1, 0F,0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		leftLegModel[26].setRotationPoint(6F, -25F, 5F);

		leftLegModel[27].addShapeBox(-1.5F, 11F, -2.5F, 2, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 22
		leftLegModel[27].setRotationPoint(6F, -25F, 5F);

		leftLegModel[28].addShapeBox(0.5F, 21F, -2F, 1, 1, 1, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 24
		leftLegModel[28].setRotationPoint(6F, -25F, 5F);

		leftLegModel[29].addShapeBox(0.5F, 22F, -1F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 0
		leftLegModel[29].setRotationPoint(6F, -25F, 5F);

		leftLegModel[30].addShapeBox(0.5F, 22F, -2F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 1
		leftLegModel[30].setRotationPoint(6F, -25F, 5F);

		leftLegModel[31].addShapeBox(0F, 23F, -2F, 3, 1, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F); // Box 2
		leftLegModel[31].setRotationPoint(6F, -25F, 5F);

		leftLegModel[32].addShapeBox(-1F, 24F, -2F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		leftLegModel[32].setRotationPoint(6F, -25F, 5F);

		leftLegModel[33].addShapeBox(3F, 24F, -1F, 1, 1, 1, 0F,0F, .3F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, .5F, 0F, .3F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 4
		leftLegModel[33].setRotationPoint(6F, -25F, 5F);

		leftLegModel[34].addShapeBox(3.5F, 24F, -1F, 1, 1, 1, 0F,-.2F, -.25F, -.3F, -.3F, -.5F, -.4F, -.3F, -.5F, -.4F, -.2F, -.25F, -.3F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 5
		leftLegModel[34].setRotationPoint(6F, -25F, 5F);

		leftLegModel[35].addShapeBox(-1.5F, 13F, -2.5F, 2, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftLegModel[35].setRotationPoint(6F, -25F, 5F);

		leftLegModel[36].addShapeBox(-1.5F, 14F, -2.5F, 2, 7, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 1
		leftLegModel[36].setRotationPoint(6F, -25F, 5F);

		leftLegModel[37].addShapeBox(0.5F, 21F, -3F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 2
		leftLegModel[37].setRotationPoint(6F, -25F, 5F);

		leftLegModel[38].addShapeBox(0.5F, 22F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 3
		leftLegModel[38].setRotationPoint(6F, -25F, 5F);

		leftLegModel[39].addShapeBox(-1F, 24F, -3F, 4, 1, 1, 0F,-1F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 4
		leftLegModel[39].setRotationPoint(6F, -25F, 5F);

		leftLegModel[40].addShapeBox(3F, 24F, -3F, 1, 1, 1, 0F,0.5F, 0F, 0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0.5F); // Box 5
		leftLegModel[40].setRotationPoint(6F, -25F, 5F);

		leftLegModel[41].addShapeBox(3.5F, 24F, -3F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.25F, -0.3F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F); // Box 6
		leftLegModel[41].setRotationPoint(6F, -25F, 5F);

		leftLegModel[42].addShapeBox(0F, 23F, -3F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F); // Box 7
		leftLegModel[42].setRotationPoint(6F, -25F, 5F);

		leftLegModel[43].addShapeBox(3.5F, 24F, -10F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.25F, -0.3F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F); // Box 24
		leftLegModel[43].setRotationPoint(6F, -25F, 5F);

		leftLegModel[44].addShapeBox(3.5F, 24F, -8F, 1, 1, 1, 0F,-.2F, -.25F, -.3F, -.3F, -.5F, -.4F, -.3F, -.5F, -.4F, -.2F, -.25F, -.3F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 25
		leftLegModel[44].setRotationPoint(6F, -25F, 5F);

		leftLegModel[45].addShapeBox(3F, 24F, -8F, 1, 1, 1, 0F,0F, .3F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, .5F, 0F, .3F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 26
		leftLegModel[45].setRotationPoint(6F, -25F, 5F);

		leftLegModel[46].addShapeBox(3F, 24F, -10F, 1, 1, 1, 0F,0.5F, 0F, 0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0.5F); // Box 27
		leftLegModel[46].setRotationPoint(6F, -25F, 5F);

		leftLegModel[47].addShapeBox(-1F, 24F, -9F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 28
		leftLegModel[47].setRotationPoint(6F, -25F, 5F);

		leftLegModel[48].addShapeBox(0F, 23F, -10F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F); // Box 29
		leftLegModel[48].setRotationPoint(6F, -25F, 5F);

		leftLegModel[49].addShapeBox(0F, 23F, -8F, 3, 1, 1, 0F,0F, 0F, .5F, -1F, 0F, .5F, -1.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 0F, .3F, 0F, 0F, -.2F); // Box 30
		leftLegModel[49].setRotationPoint(6F, -25F, 5F);

		leftLegModel[50].addShapeBox(0.5F, 22F, -10F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 31
		leftLegModel[50].setRotationPoint(6F, -25F, 5F);

		leftLegModel[51].addShapeBox(0.5F, 22F, -9F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 32
		leftLegModel[51].setRotationPoint(6F, -25F, 5F);

		leftLegModel[52].addShapeBox(0.5F, 22F, -8F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 33
		leftLegModel[52].setRotationPoint(6F, -25F, 5F);

		leftLegModel[53].addShapeBox(0.5F, 21F, -8F, 1, 1, 1, 0F,.5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 34
		leftLegModel[53].setRotationPoint(6F, -25F, 5F);

		leftLegModel[54].addShapeBox(0.5F, 21F, -9F, 1, 1, 1, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 35
		leftLegModel[54].setRotationPoint(6F, -25F, 5F);

		leftLegModel[55].addShapeBox(0.5F, 21F, -10F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 36
		leftLegModel[55].setRotationPoint(6F, -25F, 5F);

		leftLegModel[56].addShapeBox(-1F, 24F, -10F, 4, 1, 1, 0F,-1F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 37
		leftLegModel[56].setRotationPoint(6F, -25F, 5F);

		leftLegModel[57].addShapeBox(-1F, 24F, -8F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, .3F, -1F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F); // Box 38
		leftLegModel[57].setRotationPoint(6F, -25F, 5F);

		leftLegModel[58].addShapeBox(-1.5F, 14F, -9.5F, 2, 7, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 39
		leftLegModel[58].setRotationPoint(6F, -25F, 5F);

		leftLegModel[59].addShapeBox(-1.5F, 14F, -8.5F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F); // Box 40
		leftLegModel[59].setRotationPoint(6F, -25F, 5F);

		leftLegModel[60].addShapeBox(-1.5F, 13F, -8.5F, 2, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.5F, 0F, 0F); // Box 41
		leftLegModel[60].setRotationPoint(6F, -25F, 5F);

		leftLegModel[61].addShapeBox(-1.5F, 13F, -9.5F, 2, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		leftLegModel[61].setRotationPoint(6F, -25F, 5F);

		leftLegModel[62].addShapeBox(-1.5F, 11F, -9.5F, 2, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 43
		leftLegModel[62].setRotationPoint(6F, -25F, 5F);

		leftLegModel[63].addShapeBox(-1.5F, 11F, -8.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 44
		leftLegModel[63].setRotationPoint(6F, -25F, 5F);

		leftLegModel[64].addShapeBox(-1.5F, 7F, -8.5F, 2, 4, 1, 0F,.5F, 0F, 0F, .2F, 0F, 0F, -.3F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 45
		leftLegModel[64].setRotationPoint(6F, -25F, 5F);

		leftLegModel[65].addShapeBox(-1.5F, 7F, -9.5F, 2, 4, 1, 0F,0F, 0F, 0.3F, -0.3F, 0F, 0.3F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		leftLegModel[65].setRotationPoint(6F, -25F, 5F);

		leftLegModel[66].addShapeBox(-2F, 5F, -9.5F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.3F, -0.8F, 0F, 0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 47
		leftLegModel[66].setRotationPoint(6F, -25F, 5F);

		leftLegModel[67].addShapeBox(-2F, 5F, -8.5F, 3, 2, 1, 0F,.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.8F, 0F, .3F, -.5F, 0F, .3F); // Box 48
		leftLegModel[67].setRotationPoint(6F, -25F, 5F);

		leftLegModel[68].addShapeBox(1F, 1F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -1.5F, 0F, .5F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 49
		leftLegModel[68].setRotationPoint(6F, -25F, 5F);

		leftLegModel[69].addShapeBox(1F, 1F, -9F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F, -.5F, 0F, 0F, -.5F); // Box 50
		leftLegModel[69].setRotationPoint(6F, -25F, 5F);

		leftLegModel[70].addShapeBox(1F, 1F, -10F, 2, 4, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		leftLegModel[70].setRotationPoint(6F, -25F, 5F);

		leftLegModel[71].addShapeBox(1F, -3F, -10F, 2, 4, 1, 0F,0F, -1F, 0F, -1F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		leftLegModel[71].setRotationPoint(6F, -25F, 5F);

		leftLegModel[72].addShapeBox(1F, -3F, -9F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		leftLegModel[72].setRotationPoint(6F, -25F, 5F);

		leftLegModel[73].addShapeBox(1F, -3F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, -.5F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F); // Box 54
		leftLegModel[73].setRotationPoint(6F, -25F, 5F);

		leftLegModel[74].addShapeBox(-1F, -3F, -9F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftLegModel[74].setRotationPoint(6F, -25F, 5F);

		leftLegModel[75].addShapeBox(-1F, -3F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 56
		leftLegModel[75].setRotationPoint(6F, -25F, 5F);

		leftLegModel[76].addShapeBox(-3F, -3F, -9F, 2, 4, 1, 0F,-1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftLegModel[76].setRotationPoint(6F, -25F, 5F);

		leftLegModel[77].addShapeBox(-3F, -3F, -8F, 2, 4, 1, 0F,-1F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F); // Box 58
		leftLegModel[77].setRotationPoint(6F, -25F, 5F);

		leftLegModel[78].addShapeBox(-1F, 1F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftLegModel[78].setRotationPoint(6F, -25F, 5F);

		leftLegModel[79].addShapeBox(-3F, 1F, -8F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -.5F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 60
		leftLegModel[79].setRotationPoint(6F, -25F, 5F);

		leftLegModel[80].addShapeBox(-3F, 1F, -10F, 2, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 61
		leftLegModel[80].setRotationPoint(6F, -25F, 5F);

		leftLegModel[81].addShapeBox(-3F, 1F, -9F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F); // Box 62
		leftLegModel[81].setRotationPoint(6F, -25F, 5F);

		leftLegModel[82].addShapeBox(0F, 23F, -9F, 3, 1, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F); // Box 63
		leftLegModel[82].setRotationPoint(6F, -25F, 5F);

		leftLegModel[83].addShapeBox(-1F, 1F, -10F, 2, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftLegModel[83].setRotationPoint(6F, -25F, 5F);

		leftLegModel[84].addShapeBox(-1F, -3F, -10F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftLegModel[84].setRotationPoint(6F, -25F, 5F);

		leftLegModel[85].addShapeBox(-3F, -3F, -10F, 2, 4, 1, 0F,-1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftLegModel[85].setRotationPoint(6F, -25F, 5F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 61
		rightLegModel[1] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 62
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 63
		rightLegModel[3] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 65
		rightLegModel[4] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 66
		rightLegModel[5] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 67
		rightLegModel[6] = new ModelRendererTurbo(this, 42, 109, textureX, textureY); // Box 68
		rightLegModel[7] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 69
		rightLegModel[8] = new ModelRendererTurbo(this, 33, 119, textureX, textureY); // Box 70
		rightLegModel[9] = new ModelRendererTurbo(this, 33, 124, textureX, textureY); // Box 71
		rightLegModel[10] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 0
		rightLegModel[11] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 7
		rightLegModel[12] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 8
		rightLegModel[13] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 9
		rightLegModel[14] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 10
		rightLegModel[15] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 11
		rightLegModel[16] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 12
		rightLegModel[17] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 8
		rightLegModel[18] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 9
		rightLegModel[19] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 10
		rightLegModel[20] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 11
		rightLegModel[21] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 12
		rightLegModel[22] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 13
		rightLegModel[23] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 14
		rightLegModel[24] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 15
		rightLegModel[25] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 16
		rightLegModel[26] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 17
		rightLegModel[27] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 18
		rightLegModel[28] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 19
		rightLegModel[29] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 20
		rightLegModel[30] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 21
		rightLegModel[31] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 22
		rightLegModel[32] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 23
		rightLegModel[33] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 72
		rightLegModel[34] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 73
		rightLegModel[35] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 74
		rightLegModel[36] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 75
		rightLegModel[37] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 76
		rightLegModel[38] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 78
		rightLegModel[39] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 0
		rightLegModel[40] = new ModelRendererTurbo(this, 33, 124, textureX, textureY); // Box 1
		rightLegModel[41] = new ModelRendererTurbo(this, 33, 119, textureX, textureY); // Box 2
		rightLegModel[42] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 3
		rightLegModel[43] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 4
		rightLegModel[44] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 5
		rightLegModel[45] = new ModelRendererTurbo(this, 42, 109, textureX, textureY); // Box 6
		rightLegModel[46] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 7
		rightLegModel[47] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 8
		rightLegModel[48] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 9
		rightLegModel[49] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 10
		rightLegModel[50] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 11
		rightLegModel[51] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 12
		rightLegModel[52] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 13
		rightLegModel[53] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 14
		rightLegModel[54] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 15
		rightLegModel[55] = new ModelRendererTurbo(this, 33, 106, textureX, textureY); // Box 16
		rightLegModel[56] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 17
		rightLegModel[57] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 18
		rightLegModel[58] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 19
		rightLegModel[59] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 20
		rightLegModel[60] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 21
		rightLegModel[61] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 22
		rightLegModel[62] = new ModelRendererTurbo(this, 33, 91, textureX, textureY); // Box 23
		rightLegModel[63] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 24
		rightLegModel[64] = new ModelRendererTurbo(this, 42, 91, textureX, textureY); // Box 25
		rightLegModel[65] = new ModelRendererTurbo(this, 42, 97, textureX, textureY); // Box 26
		rightLegModel[66] = new ModelRendererTurbo(this, 51, 91, textureX, textureY); // Box 27
		rightLegModel[67] = new ModelRendererTurbo(this, 51, 97, textureX, textureY); // Box 28
		rightLegModel[68] = new ModelRendererTurbo(this, 42, 109, textureX, textureY); // Box 29
		rightLegModel[69] = new ModelRendererTurbo(this, 42, 109, textureX, textureY); // Box 30
		rightLegModel[70] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 31
		rightLegModel[71] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 32
		rightLegModel[72] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 33
		rightLegModel[73] = new ModelRendererTurbo(this, 33, 116, textureX, textureY); // Box 34
		rightLegModel[74] = new ModelRendererTurbo(this, 33, 119, textureX, textureY); // Box 35
		rightLegModel[75] = new ModelRendererTurbo(this, 33, 119, textureX, textureY); // Box 36
		rightLegModel[76] = new ModelRendererTurbo(this, 33, 124, textureX, textureY); // Box 37
		rightLegModel[77] = new ModelRendererTurbo(this, 33, 124, textureX, textureY); // Box 38
		rightLegModel[78] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 39
		rightLegModel[79] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 40
		rightLegModel[80] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 41
		rightLegModel[81] = new ModelRendererTurbo(this, 3, 132, textureX, textureY); // Box 42
		rightLegModel[82] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 43
		rightLegModel[83] = new ModelRendererTurbo(this, 8, 132, textureX, textureY); // Box 44
		rightLegModel[84] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 45
		rightLegModel[85] = new ModelRendererTurbo(this, 2, 135, textureX, textureY); // Box 46
		rightLegModel[86] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Box 47
		rightLegModel[87] = new ModelRendererTurbo(this, 2, 138, textureX, textureY); // Box 48
		rightLegModel[88] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 49
		rightLegModel[89] = new ModelRendererTurbo(this, 13, 138, textureX, textureY); // Box 50
		rightLegModel[90] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 51
		rightLegModel[91] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 52
		rightLegModel[92] = new ModelRendererTurbo(this, 7, 141, textureX, textureY); // Box 53
		rightLegModel[93] = new ModelRendererTurbo(this, 2, 141, textureX, textureY); // Box 54
		rightLegModel[94] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 55
		rightLegModel[95] = new ModelRendererTurbo(this, 33, 109, textureX, textureY); // Box 56

		rightLegModel[0].addShapeBox(-2F, -4F, -2F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		rightLegModel[0].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[1].addShapeBox(1F, -4F, -2F, 3, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		rightLegModel[1].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[2].addShapeBox(1F, 0F, -2F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, -1F, 0F, 0F); // Box 63
		rightLegModel[2].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[3].addShapeBox(-5F, 0F, -2F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 65
		rightLegModel[3].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[4].addShapeBox(-3F, 8F, -1.5F, 3, 5, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .3F, -1F, 0F, .3F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 66
		rightLegModel[4].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[5].addShapeBox(-4F, 7F, -2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 67
		rightLegModel[5].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[6].addShapeBox(-5F, 8F, -1.5F, 2, 5, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, .3F, -2F, 0F, .3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 68
		rightLegModel[6].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[7].addShapeBox(-5F, -4F, -2F, 3, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 69
		rightLegModel[7].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[8].addShapeBox(-4F, 15F, -1.5F, 2, 3, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 70
		rightLegModel[8].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[9].addShapeBox(-4F, 18F, -1.5F, 2, 4, 1, 0F,0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F); // Box 71
		rightLegModel[9].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[10].addShapeBox(-5F, 13F, -1.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .7F, 0F, 0F, .2F, 0F, .4F, -.5F, 0F, .4F); // Box 0
		rightLegModel[10].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[11].addShapeBox(1F, -4F, -1F, 3, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F); // Box 7
		rightLegModel[11].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[12].addShapeBox(-2F, -4F, -1F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 8
		rightLegModel[12].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[13].addShapeBox(-5F, -4F, -1F, 3, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, 1F, 0F); // Box 9
		rightLegModel[13].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[14].addShapeBox(-5F, 0F, -1F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 10
		rightLegModel[14].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[15].addShapeBox(-2F, 0F, -1F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightLegModel[15].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[16].addShapeBox(1F, 0F, -1F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, 0F, -.5F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 12
		rightLegModel[16].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[17].addShapeBox(0.5F, 25F, -3F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.25F, -0.3F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F); // Box 8
		rightLegModel[17].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[18].addShapeBox(0F, 25F, -3F, 1, 1, 1, 0F,0.5F, 0F, 0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0.5F); // Box 9
		rightLegModel[18].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[19].addShapeBox(0.5F, 25F, -1F, 1, 1, 1, 0F,-.2F, -.25F, -.3F, -.3F, -.5F, -.4F, -.3F, -.5F, -.4F, -.2F, -.25F, -.3F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 10
		rightLegModel[19].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[20].addShapeBox(0F, 25F, -1F, 1, 1, 1, 0F,0F, .3F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, .5F, 0F, .3F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 11
		rightLegModel[20].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[21].addShapeBox(-4F, 25F, -2F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightLegModel[21].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[22].addShapeBox(-3F, 24F, -2F, 3, 1, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F); // Box 13
		rightLegModel[22].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[23].addShapeBox(-3F, 24F, -3F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F); // Box 14
		rightLegModel[23].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[24].addShapeBox(-3F, 24F, -1F, 3, 1, 1, 0F,0F, 0F, .5F, -1F, 0F, .5F, -1.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 0F, .3F, 0F, 0F, -.2F); // Box 15
		rightLegModel[24].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[25].addShapeBox(-2.5F, 23F, -2F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 16
		rightLegModel[25].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[26].addShapeBox(-2.5F, 23F, -1F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 17
		rightLegModel[26].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[27].addShapeBox(-2.5F, 22F, -1F, 1, 1, 1, 0F,.5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightLegModel[27].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[28].addShapeBox(-2.5F, 22F, -2F, 1, 1, 1, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 19
		rightLegModel[28].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[29].addShapeBox(-2.5F, 22F, -3F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 20
		rightLegModel[29].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[30].addShapeBox(-2.5F, 23F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 21
		rightLegModel[30].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[31].addShapeBox(-4F, 25F, -3F, 4, 1, 1, 0F,-1F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 22
		rightLegModel[31].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[32].addShapeBox(-4F, 25F, -1F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, .3F, -1F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F); // Box 23
		rightLegModel[32].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[33].addShapeBox(-5F, 14F, -1.5F, 3, 1, 1, 0F,0F, 0F, 0F, .7F, 0F, 0F, .2F, 0F, .4F, -.5F, 0F, .4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F); // Box 72
		rightLegModel[33].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[34].addShapeBox(1F, -4F, -9F, 3, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		rightLegModel[34].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[35].addShapeBox(-2F, -4F, -9F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		rightLegModel[35].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[36].addShapeBox(-5F, -4F, -9F, 3, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 75
		rightLegModel[36].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[37].addShapeBox(1F, 0F, -9F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, -1F, 0F, 0F); // Box 76
		rightLegModel[37].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[38].addShapeBox(-5F, 0F, -9F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 78
		rightLegModel[38].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[39].addShapeBox(-4F, 7F, -1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, .5F, -2F, 0F, -.2F, -1F, 0F, -.2F); // Box 0
		rightLegModel[39].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[40].addShapeBox(-4F, 18F, -2.5F, 2, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 1
		rightLegModel[40].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[41].addShapeBox(-4F, 15F, -2.5F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightLegModel[41].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[42].addShapeBox(-5F, 14F, -2.5F, 3, 1, 1, 0F,-0.5F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		rightLegModel[42].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[43].addShapeBox(-5F, 13F, -2.5F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightLegModel[43].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[44].addShapeBox(-3F, 8F, -2.5F, 3, 5, 1, 0F,-1F, 0F, 0.3F, 0F, 0F, 0.3F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 5
		rightLegModel[44].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[45].addShapeBox(-5F, 8F, -2.5F, 2, 5, 1, 0F,-2F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 6
		rightLegModel[45].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[46].addShapeBox(-4F, 7F, -3F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, -2F, 0F, -0.2F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 7
		rightLegModel[46].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[47].addShapeBox(1F, -4F, -8F, 3, 4, 1, 0F,0F, 0F, 0F, -1F, -1F, 0F, -2F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 2F); // Box 8
		rightLegModel[47].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[48].addShapeBox(-2F, -4F, -8F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 9
		rightLegModel[48].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[49].addShapeBox(-5F, -4F, -8F, 3, 4, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 1F, 1F); // Box 10
		rightLegModel[49].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[50].addShapeBox(-5F, 0F, -8F, 3, 7, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, -1F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 11
		rightLegModel[50].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[51].addShapeBox(-2F, 0F, -8F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		rightLegModel[51].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[52].addShapeBox(1F, 0F, -8F, 3, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 2F, -1F, 0F, 0F, -.5F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 13
		rightLegModel[52].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[53].addShapeBox(-4F, 7F, -8F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, .5F, -1F, 0F, .5F, -2F, 0F, -.2F, -1F, 0F, -.2F); // Box 14
		rightLegModel[53].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[54].addShapeBox(-4F, 7F, -9F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 15
		rightLegModel[54].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[55].addShapeBox(-4F, 7F, -10F, 6, 1, 1, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.2F, -2F, 0F, -0.2F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 16
		rightLegModel[55].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[56].addShapeBox(1F, 0F, -3F, 3, 7, 1, 0F,0F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -0.5F, -3F, 0F, -1F, 0F, 0F); // Box 17
		rightLegModel[56].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[57].addShapeBox(1F, -4F, -3F, 3, 4, 1, 0F,0F, -1F, 0F, -2F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightLegModel[57].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[58].addShapeBox(-2F, -4F, -3F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		rightLegModel[58].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[59].addShapeBox(-2F, 0F, -3F, 3, 7, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightLegModel[59].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[60].addShapeBox(-5F, -4F, -3F, 3, 4, 1, 0F,-1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 21
		rightLegModel[60].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[61].addShapeBox(-5F, 0F, -3F, 3, 7, 1, 0F,-1F, -1F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 22
		rightLegModel[61].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[62].addShapeBox(1F, -4F, -10F, 3, 4, 1, 0F,0F, -1F, 0F, -2F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightLegModel[62].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[63].addShapeBox(1F, 0F, -10F, 3, 7, 1, 0F,0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -0.5F, -3F, 0F, -1F, 0F, 0F); // Box 24
		rightLegModel[63].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[64].addShapeBox(-2F, -4F, -10F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		rightLegModel[64].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[65].addShapeBox(-2F, 0F, -10F, 3, 7, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 26
		rightLegModel[65].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[66].addShapeBox(-5F, -4F, -10F, 3, 4, 1, 0F,-1.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 27
		rightLegModel[66].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[67].addShapeBox(-5F, 0F, -10F, 3, 7, 1, 0F,-1F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 28
		rightLegModel[67].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[68].addShapeBox(-5F, 8F, -8.5F, 2, 5, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, .3F, -2F, 0F, .3F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 29
		rightLegModel[68].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[69].addShapeBox(-5F, 8F, -9.5F, 2, 5, 1, 0F,-2F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 30
		rightLegModel[69].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[70].addShapeBox(-5F, 13F, -9.5F, 3, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 31
		rightLegModel[70].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[71].addShapeBox(-5F, 13F, -8.5F, 3, 1, 1, 0F,-.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, .7F, 0F, 0F, .2F, 0F, .4F, -.5F, 0F, .4F); // Box 32
		rightLegModel[71].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[72].addShapeBox(-5F, 14F, -8.5F, 3, 1, 1, 0F,0F, 0F, 0F, .7F, 0F, 0F, .2F, 0F, .4F, -.5F, 0F, .4F, -0.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F); // Box 33
		rightLegModel[72].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[73].addShapeBox(-5F, 14F, -9.5F, 3, 1, 1, 0F,-0.5F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.7F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 34
		rightLegModel[73].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[74].addShapeBox(-4F, 15F, -9.5F, 2, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightLegModel[74].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[75].addShapeBox(-4F, 15F, -8.5F, 2, 3, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 36
		rightLegModel[75].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[76].addShapeBox(-4F, 18F, -8.5F, 2, 4, 1, 0F,0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F); // Box 37
		rightLegModel[76].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[77].addShapeBox(-4F, 18F, -9.5F, 2, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		rightLegModel[77].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[78].addShapeBox(-2.5F, 22F, -10F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 39
		rightLegModel[78].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[79].addShapeBox(-2.5F, 22F, -8F, 1, 1, 1, 0F,.5F, 0F, .5F, .5F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 40
		rightLegModel[79].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[80].addShapeBox(-2.5F, 22F, -9F, 1, 1, 1, 0F,.5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, -.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 41
		rightLegModel[80].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[81].addShapeBox(-2.5F, 23F, -9F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 42
		rightLegModel[81].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[82].addShapeBox(-2.5F, 23F, -10F, 1, 1, 1, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 43
		rightLegModel[82].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[83].addShapeBox(-2.5F, 23F, -8F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 44
		rightLegModel[83].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[84].addShapeBox(-3F, 24F, -8F, 3, 1, 1, 0F,0F, 0F, .5F, -1F, 0F, .5F, -1.5F, 0F, 0F, -.5F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, -.5F, 0F, .3F, 0F, 0F, -.2F); // Box 45
		rightLegModel[84].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[85].addShapeBox(-3F, 24F, -9F, 3, 1, 1, 0F,0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, .5F, 0F, 0F); // Box 46
		rightLegModel[85].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[86].addShapeBox(-3F, 24F, -10F, 3, 1, 1, 0F,-0.5F, 0F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F); // Box 47
		rightLegModel[86].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[87].addShapeBox(-4F, 25F, -9F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 48
		rightLegModel[87].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[88].addShapeBox(-4F, 25F, -8F, 4, 1, 1, 0F,-.5F, 0F, 0F, 0F, .3F, 0F, -.5F, 0F, .3F, -1F, 0F, -.2F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 1F, -.5F, 0F, 0F); // Box 49
		rightLegModel[88].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[89].addShapeBox(-4F, 25F, -10F, 4, 1, 1, 0F,-1F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		rightLegModel[89].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[90].addShapeBox(0F, 25F, -10F, 1, 1, 1, 0F,0.5F, 0F, 0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0.5F); // Box 51
		rightLegModel[90].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[91].addShapeBox(0.5F, 25F, -10F, 1, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.2F, -0.25F, -0.3F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F); // Box 52
		rightLegModel[91].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[92].addShapeBox(0.5F, 25F, -8F, 1, 1, 1, 0F,-.2F, -.25F, -.3F, -.3F, -.5F, -.4F, -.3F, -.5F, -.4F, -.2F, -.25F, -.3F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 53
		rightLegModel[92].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[93].addShapeBox(0F, 25F, -8F, 1, 1, 1, 0F,0F, .3F, 0F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, .5F, 0F, .3F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 54
		rightLegModel[93].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[94].addShapeBox(-3F, 8F, -8.5F, 3, 5, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, .3F, -1F, 0F, .3F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightLegModel[94].setRotationPoint(-13F, -26F, 5F);

		rightLegModel[95].addShapeBox(-3F, 8F, -9.5F, 3, 5, 1, 0F,-1F, 0F, 0.3F, 0F, 0F, 0.3F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightLegModel[95].setRotationPoint(-13F, -26F, 5F);
	}
}