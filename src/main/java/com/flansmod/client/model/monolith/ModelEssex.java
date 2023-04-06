//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEssex extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 1024;

	public ModelEssex() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[250];
		bodyDoorCloseModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initbodyDoorCloseModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 56
		bodyModel[53] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 57
		bodyModel[54] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 58
		bodyModel[55] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 59
		bodyModel[56] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 60
		bodyModel[57] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 61
		bodyModel[58] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 62
		bodyModel[59] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 63
		bodyModel[60] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 64
		bodyModel[61] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 65
		bodyModel[62] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 66
		bodyModel[63] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 67
		bodyModel[64] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 68
		bodyModel[65] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 69
		bodyModel[66] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 70
		bodyModel[67] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 71
		bodyModel[68] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 72
		bodyModel[69] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 73
		bodyModel[70] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 74
		bodyModel[71] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 75
		bodyModel[72] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 76
		bodyModel[73] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 77
		bodyModel[74] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 78
		bodyModel[75] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 79
		bodyModel[76] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 80
		bodyModel[77] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 81
		bodyModel[78] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 82
		bodyModel[79] = new ModelRendererTurbo(this, 297, 121, textureX, textureY); // Box 83
		bodyModel[80] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 84
		bodyModel[81] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Essex
		bodyModel[82] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 86
		bodyModel[83] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 88
		bodyModel[85] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 89
		bodyModel[86] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 90
		bodyModel[87] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 91
		bodyModel[88] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 93
		bodyModel[90] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 94
		bodyModel[91] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 95
		bodyModel[92] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 96
		bodyModel[93] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 97
		bodyModel[94] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 98
		bodyModel[95] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 99
		bodyModel[96] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 100
		bodyModel[97] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 101
		bodyModel[98] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 102
		bodyModel[99] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 104
		bodyModel[101] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 105
		bodyModel[102] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 107
		bodyModel[104] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 108
		bodyModel[105] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 109
		bodyModel[106] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 1
		bodyModel[108] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 2
		bodyModel[109] = new ModelRendererTurbo(this, 425, 185, textureX, textureY); // Box 3
		bodyModel[110] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 4
		bodyModel[111] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 5
		bodyModel[112] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 6
		bodyModel[113] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Box 7
		bodyModel[114] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 8
		bodyModel[115] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 9
		bodyModel[116] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 10
		bodyModel[117] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 11
		bodyModel[118] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 12
		bodyModel[119] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 13
		bodyModel[120] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 14
		bodyModel[121] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 15
		bodyModel[122] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 16
		bodyModel[123] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Box 17
		bodyModel[124] = new ModelRendererTurbo(this, 393, 225, textureX, textureY); // Box 18
		bodyModel[125] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Box 19
		bodyModel[126] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Box 20
		bodyModel[127] = new ModelRendererTurbo(this, 353, 281, textureX, textureY); // Box 21
		bodyModel[128] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 22
		bodyModel[129] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Box 23
		bodyModel[130] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Box 24
		bodyModel[131] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 25
		bodyModel[132] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Box 26
		bodyModel[133] = new ModelRendererTurbo(this, 257, 385, textureX, textureY); // Box 27
		bodyModel[134] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 28
		bodyModel[135] = new ModelRendererTurbo(this, 281, 457, textureX, textureY); // Box 29
		bodyModel[136] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 30
		bodyModel[137] = new ModelRendererTurbo(this, 353, 313, textureX, textureY); // Box 31
		bodyModel[138] = new ModelRendererTurbo(this, 1, 465, textureX, textureY); // Box 32
		bodyModel[139] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 33
		bodyModel[140] = new ModelRendererTurbo(this, 1, 521, textureX, textureY); // Box 34
		bodyModel[141] = new ModelRendererTurbo(this, 57, 521, textureX, textureY); // Box 35
		bodyModel[142] = new ModelRendererTurbo(this, 361, 433, textureX, textureY); // Box 36
		bodyModel[143] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 37
		bodyModel[144] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 38
		bodyModel[145] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 39
		bodyModel[146] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 40
		bodyModel[147] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 41
		bodyModel[148] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // Box 42
		bodyModel[149] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Box 43
		bodyModel[150] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 44
		bodyModel[151] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 45
		bodyModel[152] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Box 46
		bodyModel[153] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Box 47
		bodyModel[154] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 48
		bodyModel[155] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 49
		bodyModel[156] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 50
		bodyModel[157] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 51
		bodyModel[158] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 52
		bodyModel[159] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 53
		bodyModel[160] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 54
		bodyModel[161] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 55
		bodyModel[162] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 56
		bodyModel[163] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 57
		bodyModel[164] = new ModelRendererTurbo(this, 25, 249, textureX, textureY); // Box 58
		bodyModel[165] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 59
		bodyModel[166] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 60
		bodyModel[167] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 61
		bodyModel[168] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 62
		bodyModel[169] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 63
		bodyModel[170] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 64
		bodyModel[171] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 65
		bodyModel[172] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 66
		bodyModel[173] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 67
		bodyModel[174] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 68
		bodyModel[175] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Box 69
		bodyModel[176] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 70
		bodyModel[177] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 71
		bodyModel[178] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Box 72
		bodyModel[179] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Box 73
		bodyModel[180] = new ModelRendererTurbo(this, 33, 241, textureX, textureY); // Box 74
		bodyModel[181] = new ModelRendererTurbo(this, 145, 249, textureX, textureY); // Box 75
		bodyModel[182] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Box 76
		bodyModel[183] = new ModelRendererTurbo(this, 489, 249, textureX, textureY); // Box 77
		bodyModel[184] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 78
		bodyModel[185] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 79
		bodyModel[186] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 80
		bodyModel[187] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 81
		bodyModel[188] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 82
		bodyModel[189] = new ModelRendererTurbo(this, 33, 265, textureX, textureY); // Box 83
		bodyModel[190] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Box 84
		bodyModel[191] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Box 85
		bodyModel[192] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 86
		bodyModel[193] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 87
		bodyModel[194] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 88
		bodyModel[195] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 89
		bodyModel[196] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 90
		bodyModel[197] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 91
		bodyModel[198] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 92
		bodyModel[199] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 93
		bodyModel[200] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 94
		bodyModel[201] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 95
		bodyModel[202] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 96
		bodyModel[203] = new ModelRendererTurbo(this, 297, 137, textureX, textureY); // Box 97
		bodyModel[204] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 98
		bodyModel[205] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 99
		bodyModel[206] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 100
		bodyModel[207] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 101
		bodyModel[208] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 102
		bodyModel[209] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 103
		bodyModel[210] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 104
		bodyModel[211] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 105
		bodyModel[212] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 106
		bodyModel[213] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 107
		bodyModel[214] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 108
		bodyModel[215] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 109
		bodyModel[216] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 110
		bodyModel[217] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 111
		bodyModel[218] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 112
		bodyModel[219] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 113
		bodyModel[220] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 114
		bodyModel[221] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 115
		bodyModel[222] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); // Box 116
		bodyModel[223] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Box 117
		bodyModel[224] = new ModelRendererTurbo(this, 481, 265, textureX, textureY); // Box 118
		bodyModel[225] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Box 119
		bodyModel[226] = new ModelRendererTurbo(this, 113, 273, textureX, textureY); // Box 120
		bodyModel[227] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Box 121
		bodyModel[228] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Box 122
		bodyModel[229] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 123
		bodyModel[230] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Box 124
		bodyModel[231] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Box 125
		bodyModel[232] = new ModelRendererTurbo(this, 209, 281, textureX, textureY); // Box 126
		bodyModel[233] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Box 127
		bodyModel[234] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Box 128
		bodyModel[235] = new ModelRendererTurbo(this, 169, 529, textureX, textureY); // Box 130
		bodyModel[236] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Box 132
		bodyModel[237] = new ModelRendererTurbo(this, 57, 545, textureX, textureY); // Box 133
		bodyModel[238] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Box 134
		bodyModel[239] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 135
		bodyModel[240] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 136
		bodyModel[241] = new ModelRendererTurbo(this, 249, 305, textureX, textureY); // Box 139
		bodyModel[242] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Box 140
		bodyModel[243] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 141
		bodyModel[244] = new ModelRendererTurbo(this, 441, 313, textureX, textureY); // Box 142
		bodyModel[245] = new ModelRendererTurbo(this, 249, 321, textureX, textureY); // Box 143
		bodyModel[246] = new ModelRendererTurbo(this, 281, 305, textureX, textureY); // Box 144
		bodyModel[247] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 145
		bodyModel[248] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Box 146
		bodyModel[249] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 149

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, -1F, 0F, 0F, -1.1F, 0F, 0F, 38.9F, 0F, 0F, 39F); // Box 1
		bodyModel[0].setRotationPoint(-172F, -2F, -22F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 5, 42, 0F,0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -9F, 0F, -1F); // Box 2
		bodyModel[1].setRotationPoint(-172F, 5F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 87, 11, 4, 0F,0F, 0F, 0F, 200F, 0F, 0F, 200F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, -2F, 200F, 0F, -2F, 200F, 0F, 38F, 0F, 0F, 38F); // Box 3
		bodyModel[2].setRotationPoint(-162F, -1F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 11, 7, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 39F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 39F, 0F, 0F, 37F); // Box 4
		bodyModel[3].setRotationPoint(-183F, -2F, -22F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 5, 2, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 40F, 0F, 0F, 38F, 0F, 0F, -5.5F, 9F, 0F, -1F, 9F, 0F, 39F, 0F, 0F, 34.5F); // Box 5
		bodyModel[4].setRotationPoint(-183F, 5F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 11, 4, 0F,0F, -0.5F, 0F, 1F, -0.5F, -0.5F, 1F, -0.5F, 39.5F, 0F, -0.5F, 40F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 36F, 0F, 0F, 38F); // Box 6
		bodyModel[5].setRotationPoint(125F, -1F, -22F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F,0F, -0.5F, 0.5F, 1F, -0.5F, -3F, 1F, -0.5F, 37F, 0F, -0.5F, 40.5F, 1F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, 33F, 1F, 0F, 37F); // Box 7
		bodyModel[6].setRotationPoint(135F, -1F, -21F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 11, 2, 0F,0F, -0.5F, -1F, 1F, -0.5F, -6F, 1F, -0.5F, 30F, 0F, -0.5F, 35F, 1F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 26F, 1F, 0F, 31F); // Box 8
		bodyModel[7].setRotationPoint(150F, -1F, -19F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 11, 4, 0F,0F, -0.5F, -1F, 1F, -0.5F, -6.5F, 1F, -0.5F, 17.5F, 0F, -0.5F, 23F, 1F, 0F, -5F, -1.5F, 0F, -9.5F, -1.5F, 0F, 14.5F, 1F, 0F, 19F); // Box 9
		bodyModel[8].setRotationPoint(165F, -1F, -14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 14, 11, 3, 0F,0F, -0.5F, -1F, 1.5F, -0.5F, -4.5F, 1.5F, -0.5F, 9.5F, 0F, -0.5F, 13F, 2.5F, 0F, -4F, -1.5F, 0F, -7F, -1.5F, 0F, 7F, 2.5F, 0F, 10F); // Box 10
		bodyModel[9].setRotationPoint(180F, -1F, -8.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 11, 4, 0F,0F, -0.5F, -1F, 1.5F, -0.5F, -2F, 1.5F, -0.5F, 4F, 0F, -0.5F, 5F, 3F, 0F, -3.6F, -2F, 0F, -4.2F, -2F, 0F, 1.8F, 3F, 0F, 2.6F); // Box 11
		bodyModel[10].setRotationPoint(195.5F, -1F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 11, 2, 0F,-3.5F, -0.5F, 2F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -3.5F, -0.5F, 2F, 0F, 0F, -0.2F, -2F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, -0.2F); // Box 12
		bodyModel[11].setRotationPoint(197.5F, -1F, -1F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 7, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 35F, 0F, 0F, 33F, -2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 33F, -2F, 0F, 31F); // Box 13
		bodyModel[12].setRotationPoint(-192F, -2F, -21F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 5, 7, 0F,-2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 33F, -2F, 0F, 31F, -4F, 0F, -7.5F, 0F, 0F, -5.5F, 0F, 0F, 29.5F, -4F, 0F, 27.5F); // Box 14
		bodyModel[13].setRotationPoint(-192F, 5F, -21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 7, 3, 0F,0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 35F, 0F, 0F, 34F, -2F, 0F, -3.5F, 1.5F, 0F, -2F, 1.5F, 0F, 33F, -2F, 0F, 31.5F); // Box 15
		bodyModel[14].setRotationPoint(-195.5F, -2F, -19F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,-2F, 0F, -3.5F, 1.5F, 0F, -2F, 1.5F, 0F, 33F, -2F, 0F, 31.5F, -4F, 0F, -7F, 3.5F, 0F, -5.5F, 3.5F, 0F, 29.5F, -4F, 0F, 28F); // Box 16
		bodyModel[15].setRotationPoint(-195.5F, 5F, -19F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 34F, 0F, 0F, 32F, -2F, 0F, -3.5F, 2F, 0F, -1.5F, 2F, 0F, 31.5F, -2F, 0F, 29.5F); // Box 17
		bodyModel[16].setRotationPoint(-199.5F, -2F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 30F, 0F, 0F, 28.5F, -2F, 0F, -6.5F, 2F, 0F, -4F, 2F, 0F, 27F, -2F, 0F, 24.5F); // Box 18
		bodyModel[17].setRotationPoint(-197.5F, 5F, -16F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 7, 7, 0F,0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 24F, 0F, 0F, 19F, -2F, 0F, -6.5F, 2F, 0F, -1.5F, 2F, 0F, 21.5F, -2F, 0F, 16.5F); // Box 19
		bodyModel[18].setRotationPoint(-204.5F, -2F, -15F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 5, 7, 0F,-2F, 0F, -6.5F, 0F, 0F, -1.5F, 0F, 0F, 21.5F, -2F, 0F, 16.5F, -4F, 0F, -10F, 2F, 0F, -5.5F, 2F, 0F, 17.5F, -4F, 0F, 13F); // Box 20
		bodyModel[19].setRotationPoint(-204.5F, 5F, -15F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 7, 22, 0F,0.2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -8F, -2F, 0F, -9F, 2F, 0F, -2.5F, 2F, 0F, -2.5F, -2F, 0F, -9F); // Box 21
		bodyModel[20].setRotationPoint(-206.5F, -2F, -11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 5, 22, 0F,-2F, 0F, -9F, 2F, 0F, -2.5F, 2F, 0F, -2.5F, -2F, 0F, -9F, -4.8F, 0F, -10F, 4F, 0F, -6F, 4F, 0F, -6F, -4.8F, 0F, -10F); // Box 22
		bodyModel[21].setRotationPoint(-206.5F, 5F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 1, 16, 0F,0.5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 22F, 0.5F, 0F, 22F, 0.5F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 22F, 0.5F, 0F, 22F); // Box 23
		bodyModel[22].setRotationPoint(-206.5F, -2.7F, -18F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 17, 1, 8, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -2F); // Box 24
		bodyModel[23].setRotationPoint(-206.5F, -2.7F, 20F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 17, 1, 13, 0F,0F, 0F, 4F, 68F, 0F, 4F, 68F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 68F, 0F, 4F, 68F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-190.5F, -2.7F, 15F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 17, 1, 13, 0F,0F, 0F, 4F, 30F, 0F, 4F, 30F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 4F, 30F, 0F, 4F, 30F, 0F, -4F, -1F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(-106.5F, -2.7F, 15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 3, 3, 0F,0F, 0F, 4F, 29.5F, 0F, 4F, 29.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 4F, 29.5F, 0F, 4F, 29.5F, 0F, -5F, -1F, 0F, -5F); // Box 27
		bodyModel[26].setRotationPoint(-149F, -1.7F, 25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 15, 3, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -2.5F, 4F, 0F, 0F, 4F, 0F, 0F, -5F, 0F, -2.5F, -5F); // Box 28
		bodyModel[27].setRotationPoint(-163F, -1.7F, 25F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 17, 3, 3, 0F,0F, 0F, 4F, 30F, 0F, 4F, 30F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 4F, 30F, -2F, 4F, 30F, -2F, -5F, -1F, 0F, -5F); // Box 29
		bodyModel[28].setRotationPoint(-106.5F, -1.7F, 25F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 26, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-49.5F, -1.2F, 21.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 26, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0.5F, -5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0.5F, -5F, 0F, 0.5F); // Box 31
		bodyModel[30].setRotationPoint(-49.5F, -1.2F, 23.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 25, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -5F, -5F, 0F, -5F); // Box 32
		bodyModel[31].setRotationPoint(-49F, -0.2F, 21F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 33, 5, 3, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 4F, 0F, -4F, 4F, 0F, -4F, -6.5F, -1F, 0F, -5F); // Box 35
		bodyModel[32].setRotationPoint(89.5F, -1.7F, 25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 1, 13, 0F,-1F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F, 0.5F, -1F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, -1F, 0F, 0.5F); // Box 37
		bodyModel[33].setRotationPoint(111.5F, -2.7F, 15F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 19, 1, 13, 0F,0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 38
		bodyModel[34].setRotationPoint(73.5F, -2.7F, 15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F); // Box 39
		bodyModel[35].setRotationPoint(64.5F, -2.7F, 15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 40
		bodyModel[36].setRotationPoint(61.5F, -2.7F, 15F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2F); // Box 41
		bodyModel[37].setRotationPoint(47.5F, -2.7F, 15F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 14, 2, 11, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -4F, -0.5F, 0F, -2.5F); // Box 42
		bodyModel[38].setRotationPoint(47.5F, -1.7F, 15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 13, 5, 11, 0F,0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, -3F, 0F, 0F, -4F); // Box 43
		bodyModel[39].setRotationPoint(61.5F, -1.7F, 15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 33, 5, 3, 0F,-1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, -5F, 0F, -4F, -6.5F, 0F, -4F, 4F, -1F, 0F, 4F); // Box 44
		bodyModel[40].setRotationPoint(89.5F, -1.7F, -28F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 14, 1, 13, 0F,-1F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, 4F, -1F, 0F, 4F, -1F, 0F, 0.5F, 0F, 0F, -4F, 0F, 0F, 4F, -1F, 0F, 4F); // Box 45
		bodyModel[41].setRotationPoint(111.5F, -2.7F, -28F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 19, 1, 13, 0F,0F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[42].setRotationPoint(73.5F, -2.7F, -28F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F,0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[43].setRotationPoint(64.5F, -2.7F, -28F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 1, 11, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[44].setRotationPoint(61.5F, -2.7F, -26F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 14, 1, 11, 0F,-0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 49
		bodyModel[45].setRotationPoint(47.5F, -2.7F, -26F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 14, 2, 11, 0F,-0.5F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 3F, -4F, 0F, 3F, 0F, -0.5F, 0F, 0F); // Box 50
		bodyModel[46].setRotationPoint(47.5F, -1.7F, -26F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 13, 5, 11, 0F,0F, 0F, -0.5F, 16F, 0F, 2F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 16F, 0F, -3F, 16F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[47].setRotationPoint(61.5F, -1.7F, -26F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 14, 9, 2, 0F,1F, 0F, 2F, 3F, 0F, -0.5F, 3F, 0F, 35.5F, 1F, 0F, 38F, 0F, 0F, -1F, 1F, 0F, -6F, 1F, 0F, 30F, 0F, 0F, 35F); // Box 52
		bodyModel[48].setRotationPoint(150F, -9.5F, -19F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F,-2F, 0.5F, 4.5F, 4F, 3.5F, 6.5F, 4F, 3.5F, 30.5F, -2F, 0.5F, 28.5F, 0F, -0.5F, -1F, 1F, -0.5F, -6.5F, 1F, -0.5F, 17.5F, 0F, -0.5F, 23F); // Box 53
		bodyModel[49].setRotationPoint(165F, -9F, -14F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 14, 12, 3, 0F,-3F, 0.5F, 12F, 6.5F, 0.5F, 10.5F, 6.5F, 0.5F, 24.5F, -3F, 0.5F, 26F, 0F, -0.5F, -1F, 1.5F, -0.5F, -4.5F, 1.5F, -0.5F, 9.5F, 0F, -0.5F, 13F); // Box 54
		bodyModel[50].setRotationPoint(180F, -12F, -8.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,1F, 0F, 4F, 4F, 0F, 3.5F, 4F, 0F, 39.5F, 1F, 0F, 40F, 1F, 0F, 2F, 3F, 0F, -0.5F, 3F, 0F, 35.5F, 1F, 0F, 38F); // Box 55
		bodyModel[51].setRotationPoint(150F, -15.5F, -19F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F,-3F, -0.5F, 8.5F, 1F, -0.5F, 8F, 1F, -0.5F, 32F, -3F, -0.5F, 32.5F, -2F, -2.5F, 4.5F, 4F, -5.5F, 6.5F, 4F, -5.5F, 30.5F, -2F, -2.5F, 28.5F); // Box 56
		bodyModel[52].setRotationPoint(165F, -16F, -14F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F,0F, -0.3F, 1.8F, 0F, -0.3F, 1.8F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, -2F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F); // Box 57
		bodyModel[53].setRotationPoint(179F, -15.5F, -22F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-0.5F, -0.3F, 0.4F, 0F, -0.3F, 1.8F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F); // Box 58
		bodyModel[54].setRotationPoint(175F, -15.5F, -22F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, -0.3F, 1.8F, 2F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.3F, -2F, 0.5F, 0.3F, -2.5F, 0F, 0.3F, 1F, 0F, 0.3F, 0.5F); // Box 59
		bodyModel[55].setRotationPoint(197F, -15.5F, -22F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 18, 4, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1.8F, 0F, -0.3F, 1.8F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, -2F, 0F, 0.3F, -0.5F); // Box 60
		bodyModel[56].setRotationPoint(179F, -15.5F, 18F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1.8F, -0.5F, -0.3F, 0.4F, -0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F); // Box 61
		bodyModel[57].setRotationPoint(175F, -15.5F, 18F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0.5F, 0F, -0.3F, 1.8F, 0F, 0.3F, 0.5F, 0F, 0.3F, 1F, 0.5F, 0.3F, -2.5F, 0F, 0.3F, -2F); // Box 62
		bodyModel[58].setRotationPoint(197F, -15.5F, 18F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 12, 4, 0F,-5F, 0.5F, 14F, 6F, -0.5F, 9.5F, 6F, -0.5F, 14.5F, -5F, 0.5F, 20F, 0F, -0.5F, -1F, 1.5F, -0.5F, -2F, 1.5F, -0.5F, 4F, 0F, -0.5F, 5F); // Box 63
		bodyModel[59].setRotationPoint(195.5F, -12F, -5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 12, 2, 0F,-8F, -0.5F, 13.5F, 5F, -0.5F, 3F, 5F, -0.5F, 3F, -8F, -0.5F, 12.5F, -3.5F, -0.5F, 2F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -3.5F, -0.5F, 2F); // Box 64
		bodyModel[60].setRotationPoint(197.5F, -12F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, -0.3F, 0.5F, 2F, -0.3F, -1.2F, 2.5F, -0.3F, 5F, 0F, -0.3F, 0F, 0.5F, 0.3F, -2.5F, -1F, 0.3F, -4F, 1.5F, 0.3F, 5.5F, 2F, 0.3F, 5F); // Box 65
		bodyModel[61].setRotationPoint(201F, -15.5F, -22F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, -0.3F, 0F, 2.5F, -0.3F, 5F, 2F, -0.3F, -1.2F, -1F, -0.3F, 0.5F, 2F, 0.3F, 5F, 1.5F, 0.3F, 5.5F, -1F, 0.3F, -4F, 0.5F, 0.3F, -2.5F); // Box 66
		bodyModel[62].setRotationPoint(201F, -15.5F, 18F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 4, 15, 0F,0F, 0F, 0F, 1F, -0.1F, 1F, 1F, -0.1F, 10F, 0F, 0F, 10F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 9.5F, 0F, 0.1F, 10F); // Box 67
		bodyModel[63].setRotationPoint(202.5F, -15.3F, -12F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 26, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[64].setRotationPoint(125.3F, -10F, -31F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[65].setRotationPoint(151.3F, -10F, -31F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 11, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, -10F, 0F, -14F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[66].setRotationPoint(151.3F, -8F, -30.8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 26, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[67].setRotationPoint(125.3F, -8F, -30.8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 26, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[68].setRotationPoint(125.3F, -10F, 16F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 11, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, 0F); // Box 73
		bodyModel[69].setRotationPoint(151.3F, -10F, 16F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 11, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -14F, 0F, 0F, -14F); // Box 74
		bodyModel[70].setRotationPoint(151.3F, -8F, 15.8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 26, 8, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -10F); // Box 75
		bodyModel[71].setRotationPoint(125.3F, -8F, 15.8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 17, 6, 2, 0F,4F, 0F, 3.5F, 1F, 0F, 4F, 1F, 0F, 40F, 4F, 0F, 39.5F, 4F, 0F, 3.5F, 1F, 0F, 2F, 1F, 0F, 38F, 4F, 0F, 39.5F); // Box 76
		bodyModel[72].setRotationPoint(131F, -15.5F, -19F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 24, 14, 13, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F); // Box 77
		bodyModel[73].setRotationPoint(34.5F, -15F, 12F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 20, 14, 13, 0F,-0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 78
		bodyModel[74].setRotationPoint(38.5F, -15F, -25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 19, 14, 13, 0F,-0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 79
		bodyModel[75].setRotationPoint(-90.5F, -15F, -25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 30, 2, 13, 0F,0F, 0F, 0F, 39F, 0F, 0F, 39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 39F, 0F, 0F, 39F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[76].setRotationPoint(-71.5F, -3F, -23F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[77].setRotationPoint(-3F, -3F, -23F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 2, 13, 0F,0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[78].setRotationPoint(30F, -3F, -23F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[79].setRotationPoint(35F, -3F, -23F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 28, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[80].setRotationPoint(2F, -3F, -30F);

		bodyModel[81].addShapeBox(-37F, -40F, 0F, 70, 80, 3, 0F,-33F, -37F, -1.4F, -33F, -37F, -1.4F, -33F, -37F, -1.4F, -33F, -37F, -1.4F, -33F, -38F, -1.4F, -33F, -38F, -1.4F, -33F, -38F, -1.4F, -33F, -38F, -1.4F); // Essex
		bodyModel[81].setRotationPoint(22.5F, -5F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 24, 14, 3, 0F,-0.5F, 0F, 0F, 47F, 0F, 0F, 47F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 47F, 0F, 0F, 47F, 0F, -3F, -0.5F, 0F, -3F); // Box 86
		bodyModel[82].setRotationPoint(57.5F, -15F, 18F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 24, 14, 3, 0F,-0.5F, 0F, -2.5F, 47F, 0F, -2.5F, 47F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 47F, 0F, -3F, 47F, 0F, 0F, -0.5F, 0F, 0F); // Box 87
		bodyModel[83].setRotationPoint(57.5F, -15F, -21F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 31, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[84].setRotationPoint(4F, -3F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 20, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[85].setRotationPoint(3.5F, -15F, 12F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 20, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[86].setRotationPoint(34.8F, -15F, 12F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F); // Box 91
		bodyModel[87].setRotationPoint(0.5F, -12.5F, 19.8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 29, 14, 13, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F); // Box 92
		bodyModel[88].setRotationPoint(-24.5F, -15F, 12F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F); // Box 93
		bodyModel[89].setRotationPoint(0.5F, -10F, 19.8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F); // Box 94
		bodyModel[90].setRotationPoint(0.5F, -7.5F, 19.8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F); // Box 95
		bodyModel[91].setRotationPoint(-4.5F, -5.5F, 19.8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -0.5F); // Box 96
		bodyModel[92].setRotationPoint(-4.5F, -3F, 19.8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1F); // Box 97
		bodyModel[93].setRotationPoint(-4.5F, -0.5F, 19.8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -1.5F); // Box 98
		bodyModel[94].setRotationPoint(-4.5F, 2F, 19.8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 3F); // Box 99
		bodyModel[95].setRotationPoint(35.8F, 2F, 19.8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F); // Box 100
		bodyModel[96].setRotationPoint(35.8F, -0.5F, 19.8F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F); // Box 101
		bodyModel[97].setRotationPoint(35.8F, -3F, 19.8F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F); // Box 102
		bodyModel[98].setRotationPoint(35.8F, -5.5F, 19.8F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F); // Box 103
		bodyModel[99].setRotationPoint(35.8F, -7.5F, 19.8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F); // Box 104
		bodyModel[100].setRotationPoint(35.8F, -10F, 19.8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 3F); // Box 105
		bodyModel[101].setRotationPoint(35.8F, -12.5F, 19.8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 42, 14, 3, 0F,-0.5F, 0F, -2.5F, 70F, 0F, -2.5F, 70F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 70F, 0F, -3F, 70F, 0F, 0F, -0.5F, 0F, 0F); // Box 106
		bodyModel[102].setRotationPoint(-72.5F, -15F, -21F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 35, 14, 13, 0F,0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, -2.5F, 0F, 0F, -2.5F, -7F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, -3F, -7F, 0F, -3F); // Box 107
		bodyModel[103].setRotationPoint(-97.5F, -15F, 12F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 40, 14, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[104].setRotationPoint(-205F, -15F, -4.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 40, 14, 21, 0F,0F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[105].setRotationPoint(-194.5F, -15F, -18F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 12, 14, 3, 0F,-0.5F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, -3F, -0.5F, 0F, -3F); // Box 0
		bodyModel[106].setRotationPoint(-50.5F, -15F, 16F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 20, 14, 3, 0F,-0.5F, 0F, 0F, 55F, 0F, 0F, 55F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 55F, 0F, 0F, 55F, 0F, -3F, -0.5F, 0F, -3F); // Box 1
		bodyModel[107].setRotationPoint(-165.5F, -15F, 14F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[108].setRotationPoint(-190.5F, -2.7F, -23F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[109].setRotationPoint(-172.5F, -2.7F, -26F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 22, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[110].setRotationPoint(-162.5F, -2.7F, -27F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[111].setRotationPoint(-140.5F, -2.7F, -27F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 1, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[112].setRotationPoint(-132.5F, -2.7F, -37F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 29, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[113].setRotationPoint(-125.5F, -2.7F, -28F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[114].setRotationPoint(-96.5F, -2.7F, -28F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[115].setRotationPoint(-92.5F, -15F, -16F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[116].setRotationPoint(-133.5F, -15F, -16F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 38, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[117].setRotationPoint(-130.5F, -15F, -16F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 12
		bodyModel[118].setRotationPoint(-97.5F, -15F, -29F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 13
		bodyModel[119].setRotationPoint(-127.5F, -15F, -29F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 7, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 11F, 0F, 0.5F); // Box 14
		bodyModel[120].setRotationPoint(-132.5F, -2F, -26F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 7, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		bodyModel[121].setRotationPoint(-97.5F, -2F, -26F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 28, 3, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F); // Box 16
		bodyModel[122].setRotationPoint(-209F, -17.5F, -32.5F);
		bodyModel[122].rotateAngleY = 0.19198622F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 20, 3, 49, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 9.2F, 0F, -1.85F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 9.2F, -0.5F, -1.85F); // Box 17
		bodyModel[123].setRotationPoint(-181.5F, -17.5F, -27.2F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 5, 3, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F); // Box 18
		bodyModel[124].setRotationPoint(-161.5F, -17.5F, -27.2F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 19, 3, 51, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 0.5F); // Box 19
		bodyModel[125].setRotationPoint(-156.5F, -17.5F, -27.2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 96, 3, 55, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 16.5F, 0F, -0.5F, 0F); // Box 20
		bodyModel[126].setRotationPoint(-137.5F, -17.5F, -27.2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 48, 3, 11, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -11F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 21
		bodyModel[127].setRotationPoint(-137.5F, -17.5F, -38.7F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 30, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 22
		bodyModel[128].setRotationPoint(-126.5F, -17.5F, -50.7F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 48, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F, 0.7F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -11.5F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.5F); // Box 23
		bodyModel[129].setRotationPoint(-89.5F, -17.5F, -38.7F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 23, 3, 71, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 24
		bodyModel[130].setRotationPoint(-41.5F, -17.5F, -27.2F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 24, 3, 72, 0F,0F, 0F, 0.5F, 0F, 0F, 4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 4F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 25
		bodyModel[131].setRotationPoint(-18.5F, -17.5F, -28.2F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 27, 3, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 26
		bodyModel[132].setRotationPoint(5.5F, -17.5F, -32.2F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 19, 3, 61, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 27
		bodyModel[133].setRotationPoint(32.5F, -17.5F, -32.2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 3, 15, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, -1.5F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4F, -0.5F, -1.5F, 0F, -0.5F, 0.2F); // Box 28
		bodyModel[134].setRotationPoint(32.5F, -17.5F, 29.2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 40, 3, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 29
		bodyModel[135].setRotationPoint(51.5F, -17.5F, -24.2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -8F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 30
		bodyModel[136].setRotationPoint(51.5F, -17.5F, -32.2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 16, 3, 53, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, 0.5F); // Box 31
		bodyModel[137].setRotationPoint(91.5F, -17.5F, -24.2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 89, 3, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		bodyModel[138].setRotationPoint(107.5F, -17.5F, -24.2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 8, 3, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F); // Box 33
		bodyModel[139].setRotationPoint(196.5F, -17.5F, -24.2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 3, 47, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F); // Box 34
		bodyModel[140].setRotationPoint(204.5F, -17.5F, -24.2F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 46, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[141].setRotationPoint(-6.5F, -26.5F, -22.2F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 46, 3, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 36
		bodyModel[142].setRotationPoint(-7F, -30F, -22.2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 7, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0.5F); // Box 37
		bodyModel[143].setRotationPoint(39F, -30F, -22.2F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, -0.2F, 0F, -3.5F, -0.2F, 0F, -3.5F, 0.5F); // Box 38
		bodyModel[144].setRotationPoint(41F, -30F, -21.7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.2F, 0F, -3.5F, -0.2F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -0.2F); // Box 39
		bodyModel[145].setRotationPoint(42F, -30F, -21.7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -2.2F, -0.5F, 0F, -2.2F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, -0.5F, -3.5F, -2.2F, -0.5F, -3.5F, -2.2F, 0F, -3.5F, -0.5F); // Box 40
		bodyModel[146].setRotationPoint(43F, -30F, -20.7F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 7, 6, 0F,0F, 0F, -0.5F, -0.5F, 0F, -2.2F, -0.5F, 0F, -2.2F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, -0.5F, -3.5F, -2.2F, -0.5F, -3.5F, -2.2F, 0F, -3.5F, -0.5F); // Box 41
		bodyModel[147].setRotationPoint(37.5F, -33F, -20.7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, -0.3F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, -1.5F, 0F, -3.5F, -1.5F, 0F, -3.5F, -0.3F); // Box 42
		bodyModel[148].setRotationPoint(36.5F, -33F, -21.7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 7, 8, 0F,0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, -3.5F, 0.2F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, 0.2F); // Box 43
		bodyModel[149].setRotationPoint(35.5F, -33F, -21.7F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 7, 9, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, -0.3F, 0F, -3.5F, -0.3F, 0F, -3.5F, 0F); // Box 44
		bodyModel[150].setRotationPoint(33.5F, -33F, -22.2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 40, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[151].setRotationPoint(-6.5F, -33F, -22.2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 18, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[152].setRotationPoint(4.5F, -35F, -22.2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 12, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 47
		bodyModel[153].setRotationPoint(22.5F, -35F, -22.2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 48
		bodyModel[154].setRotationPoint(34.5F, -35F, -20.7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[155].setRotationPoint(22.5F, -37F, -20.2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 8, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[156].setRotationPoint(22.5F, -39F, -20.2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[157].setRotationPoint(27F, -41F, -18.7F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F); // Box 52
		bodyModel[158].setRotationPoint(10F, -29.5F, -12.7F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 53
		bodyModel[159].setRotationPoint(15.5F, -29.5F, -12.7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 9, 15, 5, 0F,0F, 0.3F, 0.2F, -0.3F, 0.3F, 0.2F, -0.3F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.5F, 0F, 1.4F, 1F, 0F, 1.4F, 1F, 0F, 1.4F, 0.5F, 0F, 1.4F); // Box 54
		bodyModel[160].setRotationPoint(13.2F, -49F, -20.2F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.2F, 0F, -0.5F, 1.2F, 0F, -0.5F, 1.2F, 0F, -0.5F, 1.2F); // Box 55
		bodyModel[161].setRotationPoint(4.5F, -41F, -20.7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 9, 6, 8, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 56
		bodyModel[162].setRotationPoint(4.5F, -38.5F, -21.7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 6, 8, 0F,-0.5F, 0F, -1.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, -1.8F, -0.5F, 0F, -1.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, -1.8F); // Box 57
		bodyModel[163].setRotationPoint(-0.5F, -38.5F, -21.7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,-2.5F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, -2.5F, -0.5F, -2F, -0.5F, 0F, -1.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.5F, 0F, -1.8F); // Box 58
		bodyModel[164].setRotationPoint(-0.5F, -41.5F, -21.7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 59
		bodyModel[165].setRotationPoint(3.5F, -45F, -20.7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0.3F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, 0F, -1.2F, 0.3F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, 0F, -1.2F); // Box 60
		bodyModel[166].setRotationPoint(2.5F, -45F, -20.7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, -0.2F, 0.3F, 0F, -1.2F, 0.3F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, 0F, -1.2F, 0.3F, 0F, -1.2F, 0F, 0F, -0.2F); // Box 61
		bodyModel[167].setRotationPoint(11.5F, -47F, -20.7F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.5F, 0F, -1.2F, -0.7F, 0F, -2.2F, -0.7F, 0F, -2.2F, 0.5F, 0F, -1.2F, 0F, 0F, -0.2F, 0.3F, 0F, -1.2F, 0.3F, 0F, -1.2F, 0F, 0F, -0.2F); // Box 62
		bodyModel[168].setRotationPoint(11.5F, -48F, -20.7F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.7F, 0F, -2.2F, 0.5F, 0.5F, -1.2F, 0.5F, 0.5F, -1.2F, -0.7F, 0F, -2.2F, 0.3F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.3F, 0F, -1.2F); // Box 63
		bodyModel[169].setRotationPoint(2.5F, -46F, -20.7F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,-0.5F, 0.5F, -1.2F, -0.5F, 2F, -1.2F, -0.5F, 2F, -1.2F, -0.5F, 0.5F, -1.2F, 0F, 0F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 0F, -0.2F); // Box 64
		bodyModel[170].setRotationPoint(3.5F, -46F, -20.7F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F); // Box 65
		bodyModel[171].setRotationPoint(26F, -33.5F, -14.7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F); // Box 66
		bodyModel[172].setRotationPoint(30.5F, -33.5F, -14.7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 67
		bodyModel[173].setRotationPoint(28F, -33.5F, -14.7F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F); // Box 68
		bodyModel[174].setRotationPoint(26F, -31.5F, -14.7F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 69
		bodyModel[175].setRotationPoint(28F, -31.5F, -14.7F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F); // Box 70
		bodyModel[176].setRotationPoint(30.5F, -31.5F, -14.7F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 11, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 71
		bodyModel[177].setRotationPoint(3F, -39.2F, -14.7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F); // Box 72
		bodyModel[178].setRotationPoint(7.1F, -43.5F, -16F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F); // Box 73
		bodyModel[179].setRotationPoint(2.6F, -43.5F, -16F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 74
		bodyModel[180].setRotationPoint(4.6F, -43.5F, -16F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -2F); // Box 75
		bodyModel[181].setRotationPoint(2.6F, -41.5F, -16F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 76
		bodyModel[182].setRotationPoint(4.6F, -41.5F, -16F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F); // Box 77
		bodyModel[183].setRotationPoint(7.1F, -41.5F, -16F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 5, 1, 9, 0F,0F, -0.5F, -2.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 78
		bodyModel[184].setRotationPoint(-11F, -27F, -22.2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 79
		bodyModel[185].setRotationPoint(-15F, -27F, -20.2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[186].setRotationPoint(-17F, -27.5F, -19.2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 81
		bodyModel[187].setRotationPoint(-17F, -27.5F, -16.2F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[188].setRotationPoint(-17F, -27.5F, -22.2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[189].setRotationPoint(-15.5F, -31.5F, -18.7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 84
		bodyModel[190].setRotationPoint(-15.5F, -31.5F, -16.7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[191].setRotationPoint(-15.5F, -31.5F, -20.7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, -1.9F, -2F, 0F, -1.9F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 86
		bodyModel[192].setRotationPoint(-15.5F, -33F, -20.7F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 87
		bodyModel[193].setRotationPoint(-15.5F, -33F, -18.7F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1.9F, -2F, 0F, -1.9F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F); // Box 88
		bodyModel[194].setRotationPoint(-15.5F, -33F, -16.7F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[195].setRotationPoint(18.5F, -58F, -18.2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, -0.2F, 0.7F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[196].setRotationPoint(18.5F, -62F, -18.2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0.7F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 91
		bodyModel[197].setRotationPoint(18.5F, -65.5F, -18.2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.48F, 0F, -0.48F, -0.48F, 0F, -0.48F, -0.48F, 0F, -0.48F, -0.48F, 0F, -0.48F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 92
		bodyModel[198].setRotationPoint(18.5F, -73.5F, -18.2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 15, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 93
		bodyModel[199].setRotationPoint(18.5F, -63.2F, -25.2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 94
		bodyModel[200].setRotationPoint(18.5F, -64.2F, -25.2F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 95
		bodyModel[201].setRotationPoint(18.5F, -64.2F, -11.2F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[202].setRotationPoint(17.5F, -65.5F, -19.2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[203].setRotationPoint(11.5F, -62.5F, -18.2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 98
		bodyModel[204].setRotationPoint(11.5F, -63.7F, -18.2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, -0.7F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 99
		bodyModel[205].setRotationPoint(25.5F, -63.7F, -18.2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 100
		bodyModel[206].setRotationPoint(18.2F, -49F, -15.2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 101
		bodyModel[207].setRotationPoint(19.2F, -52F, -13.2F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 102
		bodyModel[208].setRotationPoint(19.9F, -54F, -14.2F);
		bodyModel[208].rotateAngleY = 0.38397244F;
		bodyModel[208].rotateAngleZ = 0.10471976F;

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 8, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 103
		bodyModel[209].setRotationPoint(17.2F, -55.2F, -29.2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, -4F, 0.5F, 0.5F, -4F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F); // Box 104
		bodyModel[210].setRotationPoint(17.2F, -53F, -25.2F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 105
		bodyModel[211].setRotationPoint(18.5F, -58F, -19F);

		bodyModel[212].addShapeBox(0F, 0F, -1.5F, 1, 3, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 106
		bodyModel[212].setRotationPoint(18.5F, -60.5F, -15F);
		bodyModel[212].rotateAngleY = 0.73303829F;

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 107
		bodyModel[213].setRotationPoint(18.5F, -63.2F, -22.2F);
		bodyModel[213].rotateAngleX = -0.40142573F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F); // Box 108
		bodyModel[214].setRotationPoint(18.5F, -61.2F, -17.7F);
		bodyModel[214].rotateAngleX = 0.40142573F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[215].setRotationPoint(-5.5F, -40F, -19.2F);

		bodyModel[216].addShapeBox(1F, 0F, 22F, 2, 1, 7, 0F,0F, 0F, 21.9F, 0F, 0F, 21.9F, 0F, 0F, 21.6F, 0F, 0F, 21.8F, 0F, 0F, 21.9F, 0F, 0F, 21.9F, 0F, 0F, 21.6F, 0F, 0F, 21.8F); // Box 110
		bodyModel[216].setRotationPoint(-209F, -17.53F, -32.5F);
		bodyModel[216].rotateAngleY = 0.19198622F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 304F, 0F, 0F, 301F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 304F, 0F, 0F, 301F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[217].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[217].rotateAngleY = 0.1850049F;

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,1F, 0F, 0F, 282F, 0F, 0F, 276F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 282F, 0F, 0F, 276F, 0F, 0F, 1F, 0F, 0F); // Box 112
		bodyModel[218].setRotationPoint(-207F, -17.53F, -23F);
		bodyModel[218].rotateAngleY = 0.1850049F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,8F, 0F, 0F, 173F, 0F, 0F, 168F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 173F, 0F, 0F, 168F, 0F, 0F, 8F, 0F, 0F); // Box 113
		bodyModel[219].setRotationPoint(-207F, -17.53F, 12F);
		bodyModel[219].rotateAngleY = 0.1850049F;

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,8F, 0F, 0F, 197F, 0F, 0F, 192F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 197F, 0F, 0F, 192F, 0F, 0F, 8F, 0F, 0F); // Box 114
		bodyModel[220].setRotationPoint(-207F, -17.53F, 7.5F);
		bodyModel[220].rotateAngleY = 0.1850049F;

		bodyModel[221].addShapeBox(0F, 0F, 0F, 10, 1, 2, 0F,5F, 0F, 0F, 237.5F, 0F, 0F, 237.3F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 237.5F, 0F, 0F, 237.3F, 0F, 0F, 5F, 0F, 0F); // Box 115
		bodyModel[221].setRotationPoint(-207F, -17.53F, -9.5F);
		bodyModel[221].rotateAngleY = 0.18151424F;

		bodyModel[222].addShapeBox(35F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 116
		bodyModel[222].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[222].rotateAngleY = 0.1850049F;

		bodyModel[223].addShapeBox(70F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 117
		bodyModel[223].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[223].rotateAngleY = 0.1850049F;

		bodyModel[224].addShapeBox(105F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 118
		bodyModel[224].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[224].rotateAngleY = 0.1850049F;

		bodyModel[225].addShapeBox(140F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 119
		bodyModel[225].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[225].rotateAngleY = 0.1850049F;

		bodyModel[226].addShapeBox(175F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 120
		bodyModel[226].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[226].rotateAngleY = 0.1850049F;

		bodyModel[227].addShapeBox(210F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 121
		bodyModel[227].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[227].rotateAngleY = 0.1850049F;

		bodyModel[228].addShapeBox(245F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 122
		bodyModel[228].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[228].rotateAngleY = 0.1850049F;

		bodyModel[229].addShapeBox(280F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 123
		bodyModel[229].setRotationPoint(-208F, -17.53F, -27.5F);
		bodyModel[229].rotateAngleY = 0.1850049F;

		bodyModel[230].addShapeBox(27F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[230].setRotationPoint(-207F, -17.53F, 7.5F);
		bodyModel[230].rotateAngleY = 0.1850049F;

		bodyModel[231].addShapeBox(62F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[231].setRotationPoint(-207F, -17.53F, 7.5F);
		bodyModel[231].rotateAngleY = 0.1850049F;

		bodyModel[232].addShapeBox(97F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[232].setRotationPoint(-207F, -17.53F, 7.5F);
		bodyModel[232].rotateAngleY = 0.1850049F;

		bodyModel[233].addShapeBox(132F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[233].setRotationPoint(-207F, -17.53F, 7.5F);
		bodyModel[233].rotateAngleY = 0.1850049F;

		bodyModel[234].addShapeBox(167F, 0F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[234].setRotationPoint(-207F, -17.53F, 7.5F);
		bodyModel[234].rotateAngleY = 0.1850049F;

		bodyModel[235].addShapeBox(51F, 0F, 0F, 140, 1, 1, 0F,0F, 0F, 0F, 130F, 0F, 0F, 130F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 130F, 0F, 0F, 130F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[235].setRotationPoint(-208F, -17.53F, -36.5F);
		bodyModel[235].rotateAngleY = 0.1850049F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F,0F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[236].setRotationPoint(110F, -17.52F, 18.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 87, 8, 4, 0F,0F, 0F, -2F, 200F, 0F, -2F, 200F, 0F, 38F, 0F, 0F, 38F, 0F, 0.5F, -5F, 200F, 0.5F, -5F, 200F, 0.5F, 35F, 0F, 0.5F, 35F); // Box 133
		bodyModel[237].setRotationPoint(-162F, 10F, -22F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 11, 6, 2, 0F,0F, 0F, -5.5F, 10F, 0F, -1F, 10F, 0F, 39F, 0F, 0F, 34.5F, 0F, -3F, -12F, 10F, 2.5F, -4F, 10F, 2.5F, 36F, 0F, -3F, 28F); // Box 134
		bodyModel[238].setRotationPoint(-183F, 10F, -21F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 9, 6, 7, 0F,-4F, 0F, -7.5F, 0F, 0F, -5.5F, 0F, 0F, 29.5F, -4F, 0F, 27.5F, -2F, -4F, -16F, 0F, -3F, -12F, 0F, -3F, 23F, -2F, -4F, 19F); // Box 135
		bodyModel[239].setRotationPoint(-192F, 10F, -21F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,1F, 0F, -10F, 3.5F, 0F, -5.5F, 3.5F, 0F, 29.5F, 0F, 0F, 25F, -2F, -5F, -16.5F, 1.5F, -4F, -14F, 1.5F, -4F, 21F, -2F, -5F, 18.5F); // Box 136
		bodyModel[240].setRotationPoint(-195.5F, 10F, -19F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 9, 9, 4, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 36F, 0F, 0F, 38F, 0F, -0.5F, -5F, 1F, -0.5F, -7.5F, 1F, -0.5F, 32.5F, 0F, -0.5F, 35F); // Box 139
		bodyModel[241].setRotationPoint(125F, 10F, -22F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 14, 9, 2, 0F,1F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, 33F, 1F, 0F, 37F, 0F, -0.5F, -6.5F, 1F, -0.5F, -13F, 1F, -0.5F, 27F, 0F, -0.5F, 33.5F); // Box 140
		bodyModel[242].setRotationPoint(135F, 10F, -21F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 14, 9, 2, 0F,1F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 26F, 1F, 0F, 31F, 0F, -0.5F, -11F, 1F, -0.5F, -17F, 1F, -0.5F, 19F, 0F, -0.5F, 25F); // Box 141
		bodyModel[243].setRotationPoint(150F, 10F, -19F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 14, 9, 4, 0F,1F, 0F, -5F, -1.5F, 0F, -9.5F, -1.5F, 0F, 14.5F, 1F, 0F, 19F, 0F, -0.5F, -12F, 1F, -1.5F, -12.5F, 1F, -1.5F, 11.5F, 0F, -0.5F, 12F); // Box 142
		bodyModel[244].setRotationPoint(165F, 10F, -14F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 14, 9, 3, 0F,2.5F, 0F, -4F, -1.5F, 0F, -7F, -1.5F, 0F, 7F, 2.5F, 0F, 10F, 0F, -1.5F, -7F, 1.5F, -2.5F, -7.5F, 1.5F, -2.5F, 6.5F, 0F, -1.5F, 7F); // Box 143
		bodyModel[245].setRotationPoint(180F, 10F, -8.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 9, 4, 0F,3F, 0F, -3.6F, -2F, 0F, -4.2F, -2F, 0F, 1.8F, 3F, 0F, 2.6F, 0F, -2.5F, -4F, 1.5F, -1.5F, -3.5F, 1.5F, -1.5F, 2.5F, 0F, -2.5F, 2F); // Box 144
		bodyModel[246].setRotationPoint(195.5F, 10F, -5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,0F, 0F, -0.2F, -2F, 0F, -0.8F, -2F, 0F, -0.8F, 0F, 0F, -0.2F, -3.5F, -1.5F, 0.5F, 1F, -2.5F, -0.5F, 1F, -2.5F, -0.5F, -3.5F, -1.5F, 0.5F); // Box 145
		bodyModel[247].setRotationPoint(197.5F, 10F, -1F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 45, 1, 1, 0F,0F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[248].setRotationPoint(110F, -17.52F, -19.5F);

		bodyModel[249].addShapeBox(-37F, -40F, 0F, 70, 80, 3, 0F,-33F, -37F, -1.4F, -33F, -37F, -1.4F, -33F, -37F, -1.4F, -33F, -37F, -1.4F, -33F, -38F, -1.4F, -33F, -38F, -1.4F, -33F, -38F, -1.4F, -33F, -38F, -1.4F); // Box 149
		bodyModel[249].setRotationPoint(-112F, -5F, -7F);
		bodyModel[249].rotateAngleY = -3.14159265F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 147
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 441, 329, textureX, textureY); // Box 148

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 31, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyDoorCloseModel[0].setRotationPoint(4F, -15F, 15F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 31, 13, 1, 0F,8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F); // Box 148
		bodyDoorCloseModel[1].setRotationPoint(-100F, -15F, -14F);
		bodyDoorCloseModel[1].rotateAngleY = -3.14159265F;
	}
}