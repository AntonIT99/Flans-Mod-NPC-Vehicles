//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSantaCaterina extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSantaCaterina() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[310];
		bodyDoorCloseModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initbodyDoorCloseModel_1();


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 705, 145, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 777, 257, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 137, 353, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 825, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 897, 97, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 569, 25, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 729, 33, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 977, 33, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 417, 385, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 993, 137, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 713, 369, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 497, 401, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 529, 401, textureX, textureY); // Box 54
		bodyModel[45] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 61
		bodyModel[46] = new ModelRendererTurbo(this, 1, 457, textureX, textureY); // Box 72
		bodyModel[47] = new ModelRendererTurbo(this, 529, 521, textureX, textureY); // Box 74
		bodyModel[48] = new ModelRendererTurbo(this, 673, 145, textureX, textureY); // Box 75
		bodyModel[49] = new ModelRendererTurbo(this, 425, 665, textureX, textureY); // Box 76
		bodyModel[50] = new ModelRendererTurbo(this, 641, 681, textureX, textureY); // Box 77
		bodyModel[51] = new ModelRendererTurbo(this, 1, 705, textureX, textureY); // Box 78
		bodyModel[52] = new ModelRendererTurbo(this, 225, 729, textureX, textureY); // Box 79
		bodyModel[53] = new ModelRendererTurbo(this, 409, 785, textureX, textureY); // Box 80
		bodyModel[54] = new ModelRendererTurbo(this, 593, 801, textureX, textureY); // Box 81
		bodyModel[55] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 82
		bodyModel[56] = new ModelRendererTurbo(this, 1, 825, textureX, textureY); // Box 83
		bodyModel[57] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 84
		bodyModel[58] = new ModelRendererTurbo(this, 849, 145, textureX, textureY); // Box 85
		bodyModel[59] = new ModelRendererTurbo(this, 673, 257, textureX, textureY); // Box 86
		bodyModel[60] = new ModelRendererTurbo(this, 641, 401, textureX, textureY); // Box 87
		bodyModel[61] = new ModelRendererTurbo(this, 257, 457, textureX, textureY); // Box 88
		bodyModel[62] = new ModelRendererTurbo(this, 1, 481, textureX, textureY); // Box 89
		bodyModel[63] = new ModelRendererTurbo(this, 257, 561, textureX, textureY); // Box 90
		bodyModel[64] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 91
		bodyModel[65] = new ModelRendererTurbo(this, 849, 521, textureX, textureY); // Box 92
		bodyModel[66] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 94
		bodyModel[67] = new ModelRendererTurbo(this, 865, 369, textureX, textureY); // Box 95
		bodyModel[68] = new ModelRendererTurbo(this, 1, 593, textureX, textureY); // Box 96
		bodyModel[69] = new ModelRendererTurbo(this, 609, 169, textureX, textureY); // Box 97
		bodyModel[70] = new ModelRendererTurbo(this, 849, 169, textureX, textureY); // Box 98
		bodyModel[71] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 99
		bodyModel[72] = new ModelRendererTurbo(this, 777, 801, textureX, textureY); // Box 100
		bodyModel[73] = new ModelRendererTurbo(this, 185, 841, textureX, textureY); // Box 101
		bodyModel[74] = new ModelRendererTurbo(this, 921, 241, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 369, 897, textureX, textureY); // Box 103
		bodyModel[76] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Box 105
		bodyModel[77] = new ModelRendererTurbo(this, 801, 873, textureX, textureY); // Box 106
		bodyModel[78] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 107
		bodyModel[79] = new ModelRendererTurbo(this, 857, 625, textureX, textureY); // Box 108
		bodyModel[80] = new ModelRendererTurbo(this, 65, 145, textureX, textureY); // Box 109
		bodyModel[81] = new ModelRendererTurbo(this, 705, 169, textureX, textureY); // Box 111
		bodyModel[82] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 112
		bodyModel[83] = new ModelRendererTurbo(this, 985, 721, textureX, textureY); // Box 113
		bodyModel[84] = new ModelRendererTurbo(this, 281, 929, textureX, textureY); // Box 114
		bodyModel[85] = new ModelRendererTurbo(this, 993, 73, textureX, textureY); // Box 117
		bodyModel[86] = new ModelRendererTurbo(this, 521, 185, textureX, textureY); // Box 118
		bodyModel[87] = new ModelRendererTurbo(this, 281, 929, textureX, textureY); // Box 1
		bodyModel[88] = new ModelRendererTurbo(this, 985, 721, textureX, textureY); // Box 2
		bodyModel[89] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 3
		bodyModel[90] = new ModelRendererTurbo(this, 529, 401, textureX, textureY); // Box 4
		bodyModel[91] = new ModelRendererTurbo(this, 529, 521, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 529, 521, textureX, textureY); // Box 1
		bodyModel[93] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 2
		bodyModel[94] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 3
		bodyModel[95] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 1
		bodyModel[96] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 2
		bodyModel[97] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 4
		bodyModel[98] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 7
		bodyModel[99] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 8
		bodyModel[100] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 9
		bodyModel[101] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 10
		bodyModel[102] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 11
		bodyModel[103] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 12
		bodyModel[104] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 13
		bodyModel[105] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 14
		bodyModel[106] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 15
		bodyModel[107] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 16
		bodyModel[108] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 17
		bodyModel[109] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 18
		bodyModel[110] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 19
		bodyModel[111] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 20
		bodyModel[112] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 23
		bodyModel[113] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 24
		bodyModel[114] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 25
		bodyModel[115] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 26
		bodyModel[116] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 27
		bodyModel[117] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 28
		bodyModel[118] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 29
		bodyModel[119] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 30
		bodyModel[120] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 31
		bodyModel[121] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 32
		bodyModel[122] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 33
		bodyModel[123] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 34
		bodyModel[124] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 35
		bodyModel[125] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 36
		bodyModel[126] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 37
		bodyModel[127] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 38
		bodyModel[128] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 39
		bodyModel[129] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 40
		bodyModel[130] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 41
		bodyModel[131] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 42
		bodyModel[132] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 43
		bodyModel[133] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 44
		bodyModel[134] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 45
		bodyModel[135] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 46
		bodyModel[136] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 47
		bodyModel[137] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 48
		bodyModel[138] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 49
		bodyModel[139] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 50
		bodyModel[140] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 51
		bodyModel[141] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 52
		bodyModel[142] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 53
		bodyModel[143] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 54
		bodyModel[144] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 55
		bodyModel[145] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 56
		bodyModel[146] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 57
		bodyModel[147] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 58
		bodyModel[148] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 59
		bodyModel[149] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 60
		bodyModel[150] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 61
		bodyModel[151] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 62
		bodyModel[152] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 63
		bodyModel[153] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 64
		bodyModel[154] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 65
		bodyModel[155] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 66
		bodyModel[156] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 67
		bodyModel[157] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 68
		bodyModel[158] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 69
		bodyModel[159] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 70
		bodyModel[160] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 71
		bodyModel[161] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 72
		bodyModel[162] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 73
		bodyModel[163] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 74
		bodyModel[164] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 75
		bodyModel[165] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 76
		bodyModel[166] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 77
		bodyModel[167] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 78
		bodyModel[168] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 79
		bodyModel[169] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 80
		bodyModel[170] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 81
		bodyModel[171] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 82
		bodyModel[172] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 83
		bodyModel[173] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 84
		bodyModel[174] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 85
		bodyModel[175] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 86
		bodyModel[176] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 87
		bodyModel[177] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 88
		bodyModel[178] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 89
		bodyModel[179] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 90
		bodyModel[180] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 91
		bodyModel[181] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 92
		bodyModel[182] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 95
		bodyModel[183] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 96
		bodyModel[184] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 97
		bodyModel[185] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 98
		bodyModel[186] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 99
		bodyModel[187] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 100
		bodyModel[188] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 101
		bodyModel[189] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 102
		bodyModel[190] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 103
		bodyModel[191] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 104
		bodyModel[192] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 105
		bodyModel[193] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 106
		bodyModel[194] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 107
		bodyModel[195] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 108
		bodyModel[196] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 109
		bodyModel[197] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 110
		bodyModel[198] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 111
		bodyModel[199] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 112
		bodyModel[200] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 113
		bodyModel[201] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 114
		bodyModel[202] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 115
		bodyModel[203] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 116
		bodyModel[204] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 117
		bodyModel[205] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 118
		bodyModel[206] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 119
		bodyModel[207] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 120
		bodyModel[208] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 121
		bodyModel[209] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 122
		bodyModel[210] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 123
		bodyModel[211] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 124
		bodyModel[212] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 125
		bodyModel[213] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 126
		bodyModel[214] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 127
		bodyModel[215] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 128
		bodyModel[216] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 129
		bodyModel[217] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 130
		bodyModel[218] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 131
		bodyModel[219] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 132
		bodyModel[220] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 133
		bodyModel[221] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 134
		bodyModel[222] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 135
		bodyModel[223] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 136
		bodyModel[224] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 137
		bodyModel[225] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 138
		bodyModel[226] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 139
		bodyModel[227] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 140
		bodyModel[228] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 141
		bodyModel[229] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 142
		bodyModel[230] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 143
		bodyModel[231] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 144
		bodyModel[232] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 145
		bodyModel[233] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 146
		bodyModel[234] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 147
		bodyModel[235] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 148
		bodyModel[236] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 149
		bodyModel[237] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 150
		bodyModel[238] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 151
		bodyModel[239] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 152
		bodyModel[240] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 153
		bodyModel[241] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 154
		bodyModel[242] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 155
		bodyModel[243] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 156
		bodyModel[244] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 157
		bodyModel[245] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 158
		bodyModel[246] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 159
		bodyModel[247] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 160
		bodyModel[248] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 161
		bodyModel[249] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 162
		bodyModel[250] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 163
		bodyModel[251] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 164
		bodyModel[252] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 165
		bodyModel[253] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 166
		bodyModel[254] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 167
		bodyModel[255] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 168
		bodyModel[256] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 169
		bodyModel[257] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 170
		bodyModel[258] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 171
		bodyModel[259] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 172
		bodyModel[260] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 173
		bodyModel[261] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 174
		bodyModel[262] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 175
		bodyModel[263] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 176
		bodyModel[264] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 177
		bodyModel[265] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 178
		bodyModel[266] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 179
		bodyModel[267] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 180
		bodyModel[268] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 181
		bodyModel[269] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 182
		bodyModel[270] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 183
		bodyModel[271] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 184
		bodyModel[272] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 185
		bodyModel[273] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 186
		bodyModel[274] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 187
		bodyModel[275] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 188
		bodyModel[276] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 189
		bodyModel[277] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 190
		bodyModel[278] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 191
		bodyModel[279] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 192
		bodyModel[280] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 193
		bodyModel[281] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 194
		bodyModel[282] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 195
		bodyModel[283] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 196
		bodyModel[284] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 197
		bodyModel[285] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 198
		bodyModel[286] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 0
		bodyModel[287] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 1
		bodyModel[288] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 2
		bodyModel[289] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 3
		bodyModel[290] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 4
		bodyModel[291] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 5
		bodyModel[292] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 6
		bodyModel[293] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 7
		bodyModel[294] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 8
		bodyModel[295] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 9
		bodyModel[296] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 10
		bodyModel[297] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 11
		bodyModel[298] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 12
		bodyModel[299] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 13
		bodyModel[300] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 14
		bodyModel[301] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 15
		bodyModel[302] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 16
		bodyModel[303] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 17
		bodyModel[304] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 18
		bodyModel[305] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 19
		bodyModel[306] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 20
		bodyModel[307] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 21
		bodyModel[308] = new ModelRendererTurbo(this, 39, 741, textureX, textureY); // Box 22
		bodyModel[309] = new ModelRendererTurbo(this, 77, 736, textureX, textureY); // Box 23

		bodyModel[0].addShapeBox(0F, 0F, 0F, 57, 36, 100, 0F,0F, 0F, 3F, 0F, 2F, -7F, 0F, 2F, -7F, 0F, 0F, 4F, 0F, 0F, 6F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, 7F); // Box 1
		bodyModel[0].setRotationPoint(50.01F, -9F, -50F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 35, 96, 0F,0F, 0F, -5F, 0F, 3F, -8F, 0F, 3F, -8F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(107F, -11F, -48F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 42, 37, 103, 0F,0F, 3F, -10F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 3F, -10F, 0F, -5F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -5F, -6F); // Box 4
		bodyModel[2].setRotationPoint(-175F, -15F, -51F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 34, 60, 0F,0F, 0F, 0F, 0F, 4F, -16F, 0F, 4F, -16F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -5F, -14F, 0F, -5F, -14F, 0F, 0F, 4F); // Box 5
		bodyModel[3].setRotationPoint(151F, -17F, -30F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 18, 33, 28, 0F,0F, 0F, 0F, 3F, 4F, -12F, 3F, 4F, -12F, 0F, 0F, 0F, 0F, 0F, 2F, 1F, -5F, -12F, 1F, -5F, -12F, 0F, 0F, 2F); // Box 6
		bodyModel[4].setRotationPoint(169.01F, -21F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 57, 16, 100, 0F,0F, 0F, 6F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 7F, 0F, 0F, 2F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 3F); // Box 8
		bodyModel[5].setRotationPoint(50.01F, 26.99F, -50F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 22, 16, 96, 0F,0F, 0F, 0F, 0F, 2F, -5F, 0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F); // Box 9
		bodyModel[6].setRotationPoint(107F, 23.99F, -48F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 42, 18, 103, 0F,0F, 5F, -6F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 5F, -6F, 0F, -2F, -14F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -14F); // Box 10
		bodyModel[7].setRotationPoint(-175F, 21.99F, -51F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 18, 21, 60, 0F,0F, 0F, 4F, 0F, 5F, -14F, 0F, 5F, -14F, 0F, 0F, 4F, 0F, 0F, -1F, -5F, -1F, -16F, -5F, -1F, -16F, 0F, 0F, -1F); // Box 11
		bodyModel[8].setRotationPoint(151F, 16.99F, -30F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 18, 24, 28, 0F,0F, 0F, 2F, 1F, 5F, -12F, 1F, 5F, -12F, 0F, 0F, 2F, 5F, 1F, 0F, -11F, 0F, -12F, -11F, 0F, -12F, 5F, 1F, 0F); // Box 12
		bodyModel[9].setRotationPoint(169.01F, 11.99F, -14F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 57, 12, 100, 0F,0F, 0F, 2F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, 3F, 0F, 0F, -6F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -5F); // Box 13
		bodyModel[10].setRotationPoint(50.01F, 43F, -50F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 22, 15, 96, 0F,0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -11F); // Box 14
		bodyModel[11].setRotationPoint(107F, 40F, -48F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 42, 15, 103, 0F,0F, 2F, -14F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, -14F, -6F, 0F, -28F, 0F, 0F, -10F, 0F, 0F, -10F, -6F, 0F, -28F); // Box 15
		bodyModel[12].setRotationPoint(-175F, 40F, -51F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 17, 60, 0F,0F, 0F, -1F, 0F, 1F, -16F, 0F, 1F, -16F, 0F, 0F, -1F, 6F, 0F, -15F, -8F, 0F, -26F, -8F, 0F, -26F, 6F, 0F, -15F); // Box 16
		bodyModel[13].setRotationPoint(151F, 38F, -30F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 18, 17, 28, 0F,5F, 1F, 0F, -11F, 2F, -12F, -11F, 2F, -12F, 5F, 1F, 0F, 13F, 0F, -10F, -24F, 0F, -12F, -24F, 0F, -12F, 13F, 0F, -10F); // Box 17
		bodyModel[14].setRotationPoint(169.01F, 38F, -14F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 57, 13, 100, 0F,0F, 0F, -6F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -5F, 0F, 0F, -16F, 0F, 0F, -29F, 0F, 0F, -30F, 0F, 0F, -15F); // Box 18
		bodyModel[15].setRotationPoint(50.01F, 55.01F, -50F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 22, 13, 96, 0F,0F, 0F, -11F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -11F, 0F, 0F, -27F, 0F, 0F, -37F, 0F, 0F, -37F, 0F, 0F, -28F); // Box 19
		bodyModel[16].setRotationPoint(107F, 55.01F, -48F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 36, 13, 103, 0F,0F, 0F, -28F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -28F, -2F, -3F, -42F, 0F, 0F, -25F, 0F, 0F, -25F, -2F, -3F, -42F); // Box 20
		bodyModel[17].setRotationPoint(-169F, 55.01F, -51F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 10, 32, 0F,0F, 0F, -1F, -3F, 0F, -12F, -3F, 0F, -12F, 0F, 0F, -1F, 2F, 0F, -15F, -15F, 0F, -15F, -15F, 0F, -15F, 2F, 0F, -15F); // Box 21
		bodyModel[18].setRotationPoint(145F, 55.01F, -16F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 20, 4, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 28F, 0F, 0F, -24F, -1F, 0F, -24F, -1F, 0F, 28F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(156.01F, 55F, -2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 91, 25, 76, 0F,0F, 0F, -3F, -12F, 7F, -33F, -12F, 7F, -33F, 0F, 0F, -3F, 5F, 25F, 0F, 12F, 2F, -33F, 12F, 2F, -33F, 5F, 25F, 0F); // Box 23
		bodyModel[20].setRotationPoint(131.01F, -79F, -38F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 44, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 25F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 25F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(125.01F, -54F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 57, 12, 3, 0F,0F, 0F, 8F, 0F, 4F, -3F, 0F, 4F, 3F, 0F, 0F, -8F, 0F, 0F, 12F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, -8F); // Box 25
		bodyModel[22].setRotationPoint(50.01F, -21.01F, -41F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 4F, -2F, 0F, 7F, -13F, 0F, 7F, 13F, 0F, 4F, 2F, 0F, -2F, 2F, 0F, -5F, -8F, 0F, -5F, 10F, 0F, -2F, 0F); // Box 26
		bodyModel[23].setRotationPoint(129.01F, -30.01F, -38F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 4F, -3F, 0F, 7F, -5F, 0F, 7F, 5F, 0F, 4F, 3F, 0F, -2F, 2F, 0F, -5F, -1F, 0F, -5F, 3F, 0F, -2F, 0F); // Box 27
		bodyModel[24].setRotationPoint(107F, -27.01F, -41F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 18, 17, 2, 0F,0F, 0F, -4F, 0F, 4F, -18F, 0F, 4F, 18F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, -16F, 0F, -4F, 16F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(151F, -34F, -30F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 57, 12, 3, 0F,0F, 0F, -9F, 0F, 4F, 2F, 0F, 4F, -3F, 0F, 0F, 9F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, 0F, 13F); // Box 29
		bodyModel[26].setRotationPoint(50.01F, -21.01F, 38F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 42, 18, 3, 0F,0F, 7F, 13F, 0F, 4F, 2F, 0F, 4F, -2F, 0F, 7F, -13F, 0F, -5F, 10F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -5F, -8F); // Box 30
		bodyModel[27].setRotationPoint(-175F, -30.01F, 35F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 4F, 3F, 0F, 7F, 5F, 0F, 7F, -5F, 0F, 4F, -3F, 0F, -2F, 0F, 0F, -5F, 3F, 0F, -5F, -1F, 0F, -2F, 2F); // Box 31
		bodyModel[28].setRotationPoint(107F, -27.01F, 38F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 18, 17, 2, 0F,0F, 0F, 4F, 0F, 4F, 18F, 0F, 4F, -18F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -4F, 16F, 0F, -4F, -16F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(151F, -34F, 28F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 21, 17, 2, 0F,0F, 0F, -2F, 6F, 7F, -12F, 6F, 7F, 14F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -4F, -12F, 0F, -4F, 14F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(169F, -38F, -14F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 21, 17, 2, 0F,0F, 0F, 4F, 6F, 7F, 14F, 6F, 7F, -12F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 14F, 0F, -4F, -12F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(169F, -38F, 12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 4F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(126F, -29.01F, 20F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 18, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 4F, 0F, -8F); // Box 36
		bodyModel[33].setRotationPoint(126F, -29.01F, -36F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 41
		bodyModel[34].setRotationPoint(135.01F, -71F, 30F);
		bodyModel[34].rotateAngleZ = -0.29670597F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 23, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 42
		bodyModel[35].setRotationPoint(135.01F, -71F, -33F);
		bodyModel[35].rotateAngleZ = -0.29670597F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 27, 3, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F); // Box 43
		bodyModel[36].setRotationPoint(129.01F, -50F, 32F);
		bodyModel[36].rotateAngleZ = -0.73303829F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 27, 3, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 44
		bodyModel[37].setRotationPoint(129.01F, -50F, -35F);
		bodyModel[37].rotateAngleZ = -0.73303829F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, 150F, 0F, 0F, 150F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 150F, 0F, 0F, 150F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[38].setRotationPoint(190F, -58F, -3F);
		bodyModel[38].rotateAngleZ = 0.60213859F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 4, 104, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(296F, -126F, -53F);

		bodyModel[40].addShapeBox(0F, -40F, 0F, 6, 20, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 230F, 0F, 0F, 230F, 0F, 0F, 230F, 0F, 0F, 230F, 0F); // Box 49
		bodyModel[40].setRotationPoint(180F, -249F, -3F);
		bodyModel[40].rotateAngleZ = -0.03490659F;

		bodyModel[41].addShapeBox(0F, 28F, 0F, 4, 4, 140, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[41].setRotationPoint(184F, -221F, -73F);
		bodyModel[41].rotateAngleZ = -0.03490659F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 1F, 400F, 1F, 1F, 400F, 1F, 1F, 400F, 1F, 1F, 400F, 1F); // Box 52
		bodyModel[42].setRotationPoint(1F, -388F, -3F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 50, 20, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F); // Box 53
		bodyModel[43].setRotationPoint(-22F, -282F, -25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[44].setRotationPoint(5F, -336F, -52F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 14, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[45].setRotationPoint(137F, -68F, 28F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 5, 240, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[46].setRotationPoint(7F, -246F, -123F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 57, 36, 125, 0F,0F, 2F, -7F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 2F, -7F, 0F, -3F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, -2F); // Box 74
		bodyModel[47].setRotationPoint(-7F, -9F, -62F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 57, 12, 3, 0F,0F, 4F, 3F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 4F, -3F, 0F, -2F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -2F, 2F); // Box 75
		bodyModel[48].setRotationPoint(-7F, -21.01F, 51F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 57, 13, 113, 0F,0F, 0F, -10F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -10F, 0F, 0F, -18F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -18F); // Box 76
		bodyModel[49].setRotationPoint(-7F, 55.01F, -56F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 57, 12, 117, 0F,0F, 3F, -4F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 3F, -4F, 0F, 0F, -12F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -12F); // Box 77
		bodyModel[50].setRotationPoint(-7F, 43F, -58F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 57, 16, 125, 0F,0F, 3F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 3F, -2F, 0F, -3F, -8F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, -3F, -8F); // Box 78
		bodyModel[51].setRotationPoint(-7F, 26.99F, -62F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 127, 13, 121, 0F,0F, 0F, -19F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -19F, 0F, 0F, -34F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, 0F, -34F); // Box 79
		bodyModel[52].setRotationPoint(-133.01F, 55.01F, -60F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 127, 15, 121, 0F,0F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -10F, 0F, 0F, -19F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -19F); // Box 80
		bodyModel[53].setRotationPoint(-133.01F, 40F, -60F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 127, 16, 121, 0F,0F, 2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -5F, 0F, 0F, -10F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -10F); // Box 81
		bodyModel[54].setRotationPoint(-133.01F, 23.99F, -60F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 127, 18, 67, 0F,0F, 7F, 5F, 0F, 4F, 3F, 0F, 4F, -3F, 0F, 7F, -5F, 0F, -5F, 3F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -5F, -1F); // Box 82
		bodyModel[55].setRotationPoint(-133.01F, -27.01F, -13F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 127, 35, 121, 0F,0F, 3F, -8F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 3F, -8F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Box 83
		bodyModel[56].setRotationPoint(-133.01F, -11F, -60F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 42, 18, 3, 0F,0F, 7F, -13F, 0F, 4F, -2F, 0F, 4F, 2F, 0F, 7F, 13F, 0F, -5F, -8F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -5F, 10F); // Box 84
		bodyModel[57].setRotationPoint(-175F, -30.01F, -38F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 57, 12, 3, 0F,0F, 4F, -3F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 4F, 3F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -2F, 0F); // Box 85
		bodyModel[58].setRotationPoint(-7F, -21.01F, -53F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 127, 18, 42, 0F,0F, 7F, -5F, 0F, 4F, -3F, 0F, 4F, 3F, 0F, 7F, 5F, 0F, -5F, -1F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, -5F, 3F); // Box 86
		bodyModel[59].setRotationPoint(-133.01F, -27.01F, -53F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 16, 13, 86, 0F,0F, 0F, -14F, 0F, 0F, -28F, 0F, 0F, -28F, 0F, 0F, -14F, 0F, 0F, -32F, -2F, -3F, -42F, -2F, -3F, -42F, 0F, 0F, -32F); // Box 87
		bodyModel[60].setRotationPoint(129.01F, 55.01F, -43F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 22, 15, 86, 0F,0F, 0F, -5F, 0F, 2F, -14F, 0F, 2F, -14F, 0F, 0F, -5F, 0F, 0F, -14F, -6F, 0F, -28F, -6F, 0F, -28F, 0F, 0F, -14F); // Box 88
		bodyModel[61].setRotationPoint(129.01F, 40F, -43F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 22, 18, 86, 0F,0F, 0F, 0F, 0F, 5F, -9F, 0F, 5F, -9F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -14F, 0F, -2F, -14F, 0F, 0F, -5F); // Box 89
		bodyModel[62].setRotationPoint(129.01F, 21.99F, -43F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 22, 36, 86, 0F,0F, 0F, -3F, 0F, 3F, -13F, 0F, 3F, -13F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, -9F, 0F, -5F, -9F, 0F, 0F, 0F); // Box 90
		bodyModel[63].setRotationPoint(129.01F, -14F, -43F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 22, 18, 3, 0F,0F, 4F, 2F, 0F, 7F, 13F, 0F, 7F, -13F, 0F, 4F, -2F, 0F, -2F, 0F, 0F, -5F, 10F, 0F, -5F, -8F, 0F, -2F, 2F); // Box 91
		bodyModel[64].setRotationPoint(129.01F, -30.01F, 35F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 18, 35, 83, 0F,0F, 4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -3F, 0F, -5F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, -5F, -1F); // Box 92
		bodyModel[65].setRotationPoint(-193F, -18F, -41F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 14, 10, 49, 0F,-3F, 0F, -12F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -12F, -15F, 0F, -15F, 2F, 0F, -15F, 2F, 0F, -15F, -15F, 0F, -15F); // Box 94
		bodyModel[66].setRotationPoint(-183F, 55.01F, -24F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 13, 17, 77, 0F,0F, 1F, -8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -8F, -8F, 0F, -26F, 6F, 0F, -15F, 6F, 0F, -15F, -8F, 0F, -26F); // Box 95
		bodyModel[67].setRotationPoint(-188F, 38F, -38F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 18, 21, 77, 0F,0F, 5F, 2F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 5F, 2F, -5F, -1F, -8F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, -1F, -8F); // Box 96
		bodyModel[68].setRotationPoint(-193F, 16.99F, -38F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 30, 17, 45, 0F,-11F, 6F, -6F, 5F, 1F, 8F, 5F, 1F, 8F, -11F, 6F, -6F, -33F, -3F, -12F, 13F, 0F, -10F, 13F, 0F, -10F, -33F, -3F, -12F); // Box 97
		bodyModel[69].setRotationPoint(-223.01F, 38F, -22F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 30, 24, 49, 0F,-12F, 5F, 13F, 0F, 0F, 16F, 0F, 0F, 16F, -12F, 5F, 13F, -11F, -4F, -8F, 5F, 1F, 6F, 5F, 1F, 6F, -11F, -4F, -8F); // Box 98
		bodyModel[70].setRotationPoint(-223.01F, 11.99F, -24F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 117, 7, 4, 0F,0F, 0F, 0F, 228F, 2F, 0F, 228F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 219F, 0F, 0F, 219F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[71].setRotationPoint(-205F, 68F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 114, 70, 7, 0F,7F, 15F, 30F, 0F, -16F, 30F, 0F, -16F, 17F, 7F, 15F, 0F, -4F, 12F, 30F, 0F, 34F, 30F, 2F, 34F, 22F, -4F, 12F, 2F); // Box 100
		bodyModel[72].setRotationPoint(-241F, -113.01F, 22F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 114, 70, 7, 0F,7F, 15F, 0F, 0F, -16F, 17F, 0F, -16F, 30F, 7F, 15F, 30F, -4F, 12F, 2F, 2F, 34F, 22F, 0F, 34F, 30F, -4F, 12F, 30F); // Box 101
		bodyModel[73].setRotationPoint(-241F, -113.01F, -29F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 5, 69, 47, 0F,7F, 15F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 7F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[74].setRotationPoint(-240F, -101.01F, -23F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 118, 1, 47, 0F,0F, 5F, 0F, 0F, 0F, 22F, 0F, 0F, 22F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 22F, 22F, 0F, 22F, 22F, 0F, 0F, 0F); // Box 103
		bodyModel[75].setRotationPoint(-240F, -34.01F, -23F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 73, 1, 23, 0F,-1F, 8F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, -1F, 8F, 0F, 0F, 0F, 0F, 0F, 35F, 18F, 0F, 35F, 18F, 0F, 0F, 0F); // Box 105
		bodyModel[76].setRotationPoint(-240F, -69.01F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 18, 35, 83, 0F,0F, 9F, -6F, 0F, 4F, -3F, 0F, 4F, -3F, 0F, 8F, -6F, 0F, -10F, -4F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -10F, -4F); // Box 106
		bodyModel[77].setRotationPoint(-211F, -18F, -41F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 18, 32, 49, 0F,7F, 10F, -7F, -8F, -3F, 13F, -8F, -3F, 13F, 7F, 10F, -7F, 1F, -20F, -12F, -9F, -4F, -8F, -9F, -4F, -8F, 1F, -20F, -12F); // Box 107
		bodyModel[78].setRotationPoint(-221.01F, 3.99F, -24F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 17, 37, 71, 0F,4F, 4F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 4F, -12F, 0F, -17F, -18F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -17F, -18F); // Box 108
		bodyModel[79].setRotationPoint(-228.02F, -26.02F, -35F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 37, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, -14F, 0F, 0F); // Box 109
		bodyModel[80].setRotationPoint(-167F, -69.01F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 118, 28, 2, 0F,1F, 20F, 50F, 0F, 4F, 50F, 0F, 4F, -1F, 1F, 20F, -5F, 0F, 6F, 50F, 14F, 12F, 50F, 14F, 12F, 2F, 0F, 6F, -1F); // Box 111
		bodyModel[81].setRotationPoint(-137.01F, -69.01F, 48F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 118, 28, 2, 0F,1F, 20F, -5F, 0F, 4F, -1F, 0F, 4F, 50F, 1F, 20F, 50F, 0F, 6F, -1F, 14F, 12F, 2F, 14F, 12F, 50F, 0F, 6F, 50F); // Box 112
		bodyModel[82].setRotationPoint(-137.01F, -69.01F, -49F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 200F, 0F, 0F, 200F, 0F, 0F, 200F, 0F, 0F, 200F, 0F); // Box 113
		bodyModel[83].setRotationPoint(-263F, -283F, 0F);
		bodyModel[83].rotateAngleZ = 0.12217305F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 161, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[84].setRotationPoint(-293F, -308F, 6F);
		bodyModel[84].rotateAngleZ = -0.76794487F;

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 7, 5, 0F,0F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 0F, 0F, 0F, -11F, 40F, 0F, 60F, 38F, 0F, 60F, 38F, 0F, -12F, 40F, 0F); // Box 117
		bodyModel[85].setRotationPoint(-216.01F, 22F, -2.5F);

		bodyModel[86].addShapeBox(-6F, -8F, -2.5F, 9, 30, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 6F, 60F, 0F, 2F, 65F, 0F, 2F, 65F, 0F, 6F, 60F, 0F); // Box 118
		bodyModel[86].setRotationPoint(-231.01F, -8F, -1F);
		bodyModel[86].rotateAngleZ = 0.2268928F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 229, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[87].setRotationPoint(-218F, -302F, 0F);
		bodyModel[87].rotateAngleZ = -0.76794487F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 20, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 210F, 0F, 0F, 210F, 0F, 0F, 210F, 0F, 0F, 210F, 0F); // Box 2
		bodyModel[88].setRotationPoint(-142F, -277F, -6F);
		bodyModel[88].rotateAngleZ = 0.12217305F;

		bodyModel[89].addShapeBox(0F, 0F, 0F, 50, 16, 40, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F); // Box 3
		bodyModel[89].setRotationPoint(156F, -215F, -20F);
		bodyModel[89].rotateAngleZ = -0.03490659F;

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 3, 100, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[90].setRotationPoint(185F, -262F, -52F);
		bodyModel[90].rotateAngleZ = -0.03490659F;

		bodyModel[91].addShapeBox(0F, 0F, 4F, 20, 2, 38, 0F,50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F); // Box 0
		bodyModel[91].setRotationPoint(44F, -32F, -47F);
		bodyModel[91].rotateAngleX = 0.17453293F;
		bodyModel[91].rotateAngleY = 0.10471976F;

		bodyModel[92].addShapeBox(0F, 0F, -42F, 20, 2, 38, 0F,50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F); // Box 1
		bodyModel[92].setRotationPoint(44F, -32F, 47F);
		bodyModel[92].rotateAngleX = -0.17453293F;
		bodyModel[92].rotateAngleY = -0.10471976F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[93].setRotationPoint(-133.01F, -31.01F, -64F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[94].setRotationPoint(-136.01F, -40.01F, -50F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[95].setRotationPoint(-119.01F, -31.01F, -64F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[96].setRotationPoint(-119.01F, -31.01F, -64F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[97].setRotationPoint(-91.01F, -29.01F, -65F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[98].setRotationPoint(-94.01F, -38.01F, -51F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[99].setRotationPoint(-108.01F, -39.01F, -51F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[100].setRotationPoint(-105.01F, -30.01F, -65F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[101].setRotationPoint(-122.01F, -40.01F, -51F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[102].setRotationPoint(-80.01F, -38.01F, -51F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[103].setRotationPoint(-77.01F, -29.01F, -64F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[104].setRotationPoint(-66.01F, -37.01F, -52F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[105].setRotationPoint(-63.01F, -28.01F, -66F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[106].setRotationPoint(-52.01F, -36.01F, -52F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[107].setRotationPoint(-49.01F, -27.01F, -66F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[108].setRotationPoint(-36.01F, -36.01F, -52F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[109].setRotationPoint(-33.01F, -27.01F, -65F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[110].setRotationPoint(-22.01F, -35.01F, -53F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[111].setRotationPoint(-19.01F, -26.01F, -67F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[112].setRotationPoint(-133.01F, -31.01F, 46.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[113].setRotationPoint(-136.01F, -40.01F, 48.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[114].setRotationPoint(-119.01F, -31.01F, 46.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[115].setRotationPoint(-91.01F, -29.01F, 47.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[116].setRotationPoint(-94.01F, -38.01F, 49.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[117].setRotationPoint(-108.01F, -39.01F, 49.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[118].setRotationPoint(-105.01F, -30.01F, 47.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[119].setRotationPoint(-122.01F, -40.01F, 49.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[120].setRotationPoint(-80.01F, -38.01F, 49.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[121].setRotationPoint(-77.01F, -29.01F, 46.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[122].setRotationPoint(-66.01F, -37.01F, 50.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[123].setRotationPoint(-63.01F, -28.01F, 48.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[124].setRotationPoint(-52.01F, -36.01F, 50.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[125].setRotationPoint(-49.01F, -27.01F, 48.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[126].setRotationPoint(-36.01F, -36.01F, 50.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[127].setRotationPoint(-33.01F, -27.01F, 47.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[128].setRotationPoint(-22.01F, -35.01F, 51.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[129].setRotationPoint(-19.01F, -26.01F, 49.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[130].setRotationPoint(-165.01F, -42.01F, -46F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[131].setRotationPoint(-151.01F, -41.01F, -48F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[132].setRotationPoint(-148.01F, -32.01F, -62F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[133].setRotationPoint(-162.01F, -33.01F, -59F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[134].setRotationPoint(-179.01F, -42.01F, -44F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[135].setRotationPoint(-176.01F, -33.01F, -58F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[136].setRotationPoint(-210.01F, -46.01F, -39F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[137].setRotationPoint(-196.01F, -44.01F, -40F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[138].setRotationPoint(-193.01F, -35.01F, -54F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[139].setRotationPoint(-207.01F, -37.01F, -52F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[140].setRotationPoint(-224.01F, -48.01F, -35F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[141].setRotationPoint(-221.01F, -39.01F, -49F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[142].setRotationPoint(-165.01F, -42.01F, 43F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[143].setRotationPoint(-151.01F, -41.01F, 45F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[144].setRotationPoint(-148.01F, -32.01F, 43F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[145].setRotationPoint(-162.01F, -33.01F, 40F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[146].setRotationPoint(-179.01F, -42.01F, 41F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[147].setRotationPoint(-176.01F, -33.01F, 39F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[148].setRotationPoint(-210.01F, -46.01F, 36F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[149].setRotationPoint(-196.01F, -44.01F, 37F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[150].setRotationPoint(-193.01F, -35.01F, 35F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[151].setRotationPoint(-207.01F, -37.01F, 33F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[152].setRotationPoint(-224.01F, -48.01F, 32F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[153].setRotationPoint(-221.01F, -39.01F, 30F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[154].setRotationPoint(-165.01F, -74.01F, 43F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[155].setRotationPoint(-151.01F, -73.01F, 45F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[156].setRotationPoint(-148.01F, -64.01F, 43F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[157].setRotationPoint(-162.01F, -65.01F, 40F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[158].setRotationPoint(-179.01F, -74.01F, 41F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[159].setRotationPoint(-176.01F, -65.01F, 39F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[160].setRotationPoint(-210.01F, -78.01F, 36F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[161].setRotationPoint(-196.01F, -76.01F, 37F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[162].setRotationPoint(-193.01F, -67.01F, 35F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[163].setRotationPoint(-207.01F, -69.01F, 33F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[164].setRotationPoint(-224.01F, -80.01F, 32F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[165].setRotationPoint(-221.01F, -71.01F, 30F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[166].setRotationPoint(-136.01F, -72.01F, 48.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[167].setRotationPoint(-133.01F, -63.01F, 46.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[168].setRotationPoint(-122.01F, -72.01F, 49.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[169].setRotationPoint(-119.01F, -63.01F, 46.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[170].setRotationPoint(-108.01F, -71.01F, 49.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[171].setRotationPoint(-105.01F, -62.01F, 47.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[172].setRotationPoint(-91.01F, -61.01F, 47.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[173].setRotationPoint(-94.01F, -70.01F, 49.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[174].setRotationPoint(-77.01F, -61.01F, 46.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[175].setRotationPoint(-80.01F, -70.01F, 49.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[176].setRotationPoint(-63.01F, -60.01F, 48.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[177].setRotationPoint(-66.01F, -69.01F, 50.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[178].setRotationPoint(-52.01F, -68.01F, 50.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[179].setRotationPoint(-49.01F, -59.01F, 48.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[180].setRotationPoint(-33.01F, -59.01F, 47.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[181].setRotationPoint(-36.01F, -68.01F, 50.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[182].setRotationPoint(-238.01F, -81.01F, 30F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[183].setRotationPoint(-235.01F, -72.01F, 28F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[184].setRotationPoint(-165.01F, -74.01F, -45F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[185].setRotationPoint(-151.01F, -73.01F, -47F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[186].setRotationPoint(-148.01F, -64.01F, -61F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[187].setRotationPoint(-162.01F, -65.01F, -58F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[188].setRotationPoint(-179.01F, -74.01F, -43F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[189].setRotationPoint(-176.01F, -65.01F, -57F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[190].setRotationPoint(-210.01F, -78.01F, -38F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[191].setRotationPoint(-196.01F, -76.01F, -40F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[192].setRotationPoint(-193.01F, -67.01F, -53F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[193].setRotationPoint(-207.01F, -69.01F, -51F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[194].setRotationPoint(-224.01F, -80.01F, -35F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[195].setRotationPoint(-221.01F, -71.01F, -48F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[196].setRotationPoint(-136.01F, -72.01F, -50.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[197].setRotationPoint(-133.01F, -63.01F, -64.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[198].setRotationPoint(-122.01F, -72.01F, -51.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[199].setRotationPoint(-119.01F, -63.01F, -64.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[200].setRotationPoint(-108.01F, -71.01F, -51.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[201].setRotationPoint(-105.01F, -62.01F, -65.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[202].setRotationPoint(-91.01F, -61.01F, -65.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[203].setRotationPoint(-94.01F, -70.01F, -51.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[204].setRotationPoint(-77.01F, -61.01F, -64.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[205].setRotationPoint(-80.01F, -70.01F, -51.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[206].setRotationPoint(-63.01F, -60.01F, -66.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[207].setRotationPoint(-66.01F, -69.01F, -52.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[208].setRotationPoint(-52.01F, -68.01F, -52.5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[209].setRotationPoint(-49.01F, -59.01F, -66.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[210].setRotationPoint(-33.01F, -59.01F, -65.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[211].setRotationPoint(-36.01F, -68.01F, -52.5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[212].setRotationPoint(-238.01F, -81.01F, -32.5F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[213].setRotationPoint(-235.01F, -72.01F, -46F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[214].setRotationPoint(-151.01F, -99.01F, -47F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[215].setRotationPoint(-148.01F, -90.01F, -61F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[216].setRotationPoint(-165.01F, -102.01F, -45F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[217].setRotationPoint(-162.01F, -93.01F, -58F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[218].setRotationPoint(-176.01F, -96.01F, -57F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[219].setRotationPoint(-179.01F, -105.01F, -43F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[220].setRotationPoint(-193.01F, -100.01F, -53F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[221].setRotationPoint(-196.01F, -109.01F, -40F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[222].setRotationPoint(-207.01F, -102.01F, -51F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[223].setRotationPoint(-210.01F, -111.01F, -38F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		bodyModel[224].setRotationPoint(-221.01F, -105.01F, -48F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[225].setRotationPoint(-224.01F, -114.01F, -35F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[226].setRotationPoint(-238.01F, -115.01F, -32.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[227].setRotationPoint(-235.01F, -106.01F, -46F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[228].setRotationPoint(-151.01F, -99.01F, 43.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[229].setRotationPoint(-148.01F, -90.01F, 41.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[230].setRotationPoint(-165.01F, -102.01F, 41.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[231].setRotationPoint(-162.01F, -93.01F, 38.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[232].setRotationPoint(-176.01F, -96.01F, 37.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[233].setRotationPoint(-179.01F, -105.01F, 39.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[234].setRotationPoint(-193.01F, -100.01F, 33.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[235].setRotationPoint(-196.01F, -109.01F, 36.5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[236].setRotationPoint(-207.01F, -102.01F, 31.5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[237].setRotationPoint(-210.01F, -111.01F, 34.5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[238].setRotationPoint(-221.01F, -105.01F, 28.5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[239].setRotationPoint(-224.01F, -114.01F, 32F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[240].setRotationPoint(-238.01F, -115.01F, 30F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[241].setRotationPoint(-235.01F, -106.01F, 26.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[242].setRotationPoint(133F, -51.01F, 33.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[243].setRotationPoint(136F, -42.01F, 31.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[244].setRotationPoint(146F, -53.01F, 28.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[245].setRotationPoint(149F, -44.01F, 26.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[246].setRotationPoint(161F, -55.01F, 23.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[247].setRotationPoint(164F, -46.01F, 21.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[248].setRotationPoint(174F, -57.01F, 19.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[249].setRotationPoint(177F, -48.01F, 17.5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[250].setRotationPoint(190F, -61.01F, 15F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[251].setRotationPoint(193F, -52.01F, 13F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[252].setRotationPoint(205F, -65.01F, 10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[253].setRotationPoint(208F, -56.01F, 8F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[254].setRotationPoint(133F, -51.01F, -36.5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[255].setRotationPoint(136F, -42.01F, -50.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[256].setRotationPoint(146F, -53.01F, -31.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[257].setRotationPoint(149F, -44.01F, -45.5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[258].setRotationPoint(161F, -55.01F, -27F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[259].setRotationPoint(164F, -46.01F, -40.5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[260].setRotationPoint(174F, -57.01F, -23F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[261].setRotationPoint(177F, -48.01F, -36.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[262].setRotationPoint(190F, -61.01F, -18.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[263].setRotationPoint(193F, -52.01F, -32F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[264].setRotationPoint(205F, -65.01F, -13.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		bodyModel[265].setRotationPoint(208F, -56.01F, -27F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		bodyModel[266].setRotationPoint(133F, -74.01F, -35F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[267].setRotationPoint(136F, -65.01F, -49F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[268].setRotationPoint(147F, -75.01F, -31F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[269].setRotationPoint(150F, -66.01F, -45F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[270].setRotationPoint(164F, -78.01F, -25F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[271].setRotationPoint(167F, -69.01F, -39F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[272].setRotationPoint(133F, -74.01F, 33F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[273].setRotationPoint(136F, -65.01F, 31F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[274].setRotationPoint(147F, -75.01F, 29F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[275].setRotationPoint(150F, -66.01F, 27F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[276].setRotationPoint(164F, -78.01F, 23F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[277].setRotationPoint(167F, -69.01F, 21F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[278].setRotationPoint(-245.01F, -83.01F, -17.5F);
		bodyModel[278].rotateAngleY = -1.57079633F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[279].setRotationPoint(-257.01F, -74.01F, -20.5F);
		bodyModel[279].rotateAngleY = -1.57079633F;

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[280].setRotationPoint(-257.01F, -74.01F, -6.5F);
		bodyModel[280].rotateAngleY = -1.57079633F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[281].setRotationPoint(-245.01F, -83.01F, -3.5F);
		bodyModel[281].rotateAngleY = -1.57079633F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[282].setRotationPoint(-258.01F, -74.01F, 6.5F);
		bodyModel[282].rotateAngleY = -1.57079633F;

		bodyModel[283].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[283].setRotationPoint(-245.01F, -83.01F, 9.5F);
		bodyModel[283].rotateAngleY = -1.57079633F;

		bodyModel[284].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[284].setRotationPoint(-245.01F, -83.01F, 24.5F);
		bodyModel[284].rotateAngleY = -1.57079633F;

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[285].setRotationPoint(-258.01F, -74.01F, 21.5F);
		bodyModel[285].rotateAngleY = -1.57079633F;

		bodyModel[286].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[286].setRotationPoint(-242.01F, -53.01F, 24.5F);
		bodyModel[286].rotateAngleY = -1.57079633F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[287].setRotationPoint(-255.01F, -44.01F, 21.5F);
		bodyModel[287].rotateAngleY = -1.57079633F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[288].setRotationPoint(-242.01F, -53.01F, 9.5F);
		bodyModel[288].rotateAngleY = -1.57079633F;

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[289].setRotationPoint(-255.01F, -44.01F, 6.5F);
		bodyModel[289].rotateAngleY = -1.57079633F;

		bodyModel[290].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[290].setRotationPoint(-242.01F, -53.01F, -3.5F);
		bodyModel[290].rotateAngleY = -1.57079633F;

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[291].setRotationPoint(-254.01F, -44.01F, -6.5F);
		bodyModel[291].rotateAngleY = -1.57079633F;

		bodyModel[292].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[292].setRotationPoint(-242.01F, -53.01F, -17.5F);
		bodyModel[292].rotateAngleY = -1.57079633F;

		bodyModel[293].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[293].setRotationPoint(-254.01F, -44.01F, -20.5F);
		bodyModel[293].rotateAngleY = -1.57079633F;

		bodyModel[294].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[294].setRotationPoint(-247.01F, -116.01F, 24.5F);
		bodyModel[294].rotateAngleY = -1.57079633F;

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[295].setRotationPoint(-260.01F, -107.01F, 21.5F);
		bodyModel[295].rotateAngleY = -1.57079633F;

		bodyModel[296].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[296].setRotationPoint(-247.01F, -116.01F, 9.5F);
		bodyModel[296].rotateAngleY = -1.57079633F;

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[297].setRotationPoint(-260.01F, -107.01F, 6.5F);
		bodyModel[297].rotateAngleY = -1.57079633F;

		bodyModel[298].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[298].setRotationPoint(-247.01F, -116.01F, -3.5F);
		bodyModel[298].rotateAngleY = -1.57079633F;

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[299].setRotationPoint(-259.01F, -107.01F, -6.5F);
		bodyModel[299].rotateAngleY = -1.57079633F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[300].setRotationPoint(-247.01F, -116.01F, -17.5F);
		bodyModel[300].rotateAngleY = -1.57079633F;

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[301].setRotationPoint(-259.01F, -107.01F, -20.5F);
		bodyModel[301].rotateAngleY = -1.57079633F;

		bodyModel[302].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[302].setRotationPoint(128F, -75.01F, 24.5F);
		bodyModel[302].rotateAngleY = -1.57079633F;

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[303].setRotationPoint(115F, -66.01F, 21.5F);
		bodyModel[303].rotateAngleY = -1.57079633F;

		bodyModel[304].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[304].setRotationPoint(128F, -75.01F, 9.5F);
		bodyModel[304].rotateAngleY = -1.57079633F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[305].setRotationPoint(115F, -66.01F, 6.5F);
		bodyModel[305].rotateAngleY = -1.57079633F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[306].setRotationPoint(128F, -75.01F, -3.5F);
		bodyModel[306].rotateAngleY = -1.57079633F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[307].setRotationPoint(116F, -66.01F, -6.5F);
		bodyModel[307].rotateAngleY = -1.57079633F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[308].setRotationPoint(128F, -75.01F, -17.5F);
		bodyModel[308].rotateAngleY = -1.57079633F;

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[309].setRotationPoint(116F, -66.01F, -20.5F);
		bodyModel[309].rotateAngleY = -1.57079633F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 48
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 609, 129, textureX, textureY); // Box 51
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 55
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 185, 291, textureX, textureY); // Box 73
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 281, 1000, textureX, textureY); // Box 116
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 281, 988, textureX, textureY); // Box 0
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 5

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 1, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 90F, 0F, 0F, 90F, 0F, 40F, 4F, 0F, 40F, 4F, 0F, 40F, 94F, 0F, 40F, 94F); // Box 48
		bodyDoorCloseModel[0].setRotationPoint(297F, -125F, -50F);
		bodyDoorCloseModel[0].rotateAngleZ = -0.34906585F;

		bodyDoorCloseModel[1].addShapeBox(0F, 28F, 0F, 2, 10, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 110F, 0F, 0F, 110F, 0F, 90F, 6F, 0F, 90F, 6F, 0F, 90F, 116F, 0F, 90F, 116F); // Box 51
		bodyDoorCloseModel[1].setRotationPoint(185F, -217F, -71F);
		bodyDoorCloseModel[1].rotateAngleZ = -0.03490659F;

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 90F, 0F, 0F, 90F, 0F, 20F, 2F, 0F, 20F, 2F, 0F, 20F, 92F, 0F, 20F, 92F); // Box 55
		bodyDoorCloseModel[2].setRotationPoint(6F, -333F, -50F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 2, 38, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 220F, 0F, 0F, 220F, 0F, 150F, 0F, 0F, 150F, 0F, 0F, 150F, 220F, 0F, 150F, 220F); // Box 73
		bodyDoorCloseModel[3].setRotationPoint(10F, -241F, -118F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 150, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -100F, 130F, 0F, 20F, 30F, 0F, 20F, 30F, 0F, -100F, 130F, 0F); // Box 116
		bodyDoorCloseModel[4].setRotationPoint(-293F, -303F, 7F);
		bodyDoorCloseModel[4].rotateAngleZ = -0.76794487F;

		bodyDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 218, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -100F, 130F, 0F, 20F, 30F, 0F, 20F, 30F, 0F, -100F, 130F, 0F); // Box 0
		bodyDoorCloseModel[5].setRotationPoint(-218F, -297F, 1F);
		bodyDoorCloseModel[5].rotateAngleZ = -0.76794487F;

		bodyDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 90F, 0F, 0F, 90F, 0F, 20F, 2F, 0F, 20F, 2F, 0F, 20F, 92F, 0F, 20F, 92F); // Box 5
		bodyDoorCloseModel[6].setRotationPoint(186F, -259F, -50F);
		bodyDoorCloseModel[6].rotateAngleZ = -0.03490659F;
	}

	
}