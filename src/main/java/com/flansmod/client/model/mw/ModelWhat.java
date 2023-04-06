//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M60A1
// Model Creator: 
// Created on: 11.10.2016 - 11:38:40
// Last changed on: 11.10.2016 - 11:38:40

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWhat extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 2048;

	public ModelWhat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[236];
		turretModel = new ModelRendererTurbo[188];
		barrelModel = new ModelRendererTurbo[32];
		leftTrackWheelModels = new ModelRendererTurbo[17];
		rightTrackWheelModels = new ModelRendererTurbo[17];
		leftTrackModel = new ModelRendererTurbo[8];
		rightTrackModel = new ModelRendererTurbo[8];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 0, 110, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import Box5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 140, textureX, textureY); // Import Box6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 170, textureX, textureY); // Import Box8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 200, textureX, textureY); // Import Box9
		bodyModel[8] = new ModelRendererTurbo(this, 0, 246, textureX, textureY); // Import Box10
		bodyModel[9] = new ModelRendererTurbo(this, 0, 287, textureX, textureY); // Import Box11
		bodyModel[10] = new ModelRendererTurbo(this, 0, 328, textureX, textureY); // Import Box12
		bodyModel[11] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Import Box13
		bodyModel[12] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box14
		bodyModel[13] = new ModelRendererTurbo(this, 0, 361, textureX, textureY); // Import Box15
		bodyModel[14] = new ModelRendererTurbo(this, 41, 361, textureX, textureY); // Import Box16
		bodyModel[15] = new ModelRendererTurbo(this, 0, 378, textureX, textureY); // Import Box17
		bodyModel[16] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Import Box18
		bodyModel[17] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Import Box19
		bodyModel[18] = new ModelRendererTurbo(this, 0, 398, textureX, textureY); // Import Box20
		bodyModel[19] = new ModelRendererTurbo(this, 0, 415, textureX, textureY); // Import Box21
		bodyModel[20] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // Import Box22
		bodyModel[21] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Import Box23
		bodyModel[22] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // Import Box25
		bodyModel[23] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Import Box26
		bodyModel[24] = new ModelRendererTurbo(this, 0, 461, textureX, textureY); // Import Box27
		bodyModel[25] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Import Box28
		bodyModel[26] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Import Box29
		bodyModel[27] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Import Box30
		bodyModel[28] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Box31
		bodyModel[29] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Box32
		bodyModel[30] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Box33
		bodyModel[31] = new ModelRendererTurbo(this, 0, 522, textureX, textureY); // Import Box34
		bodyModel[32] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box35
		bodyModel[33] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Import Box36
		bodyModel[34] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Import Box37
		bodyModel[35] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Import Box38
		bodyModel[36] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Import Box39
		bodyModel[37] = new ModelRendererTurbo(this, 0, 534, textureX, textureY); // Import Box40
		bodyModel[38] = new ModelRendererTurbo(this, 0, 551, textureX, textureY); // Import Box41
		bodyModel[39] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box42
		bodyModel[40] = new ModelRendererTurbo(this, 0, 568, textureX, textureY); // Import Box43
		bodyModel[41] = new ModelRendererTurbo(this, 0, 328, textureX, textureY); // Import Box44
		bodyModel[42] = new ModelRendererTurbo(this, 0, 344, textureX, textureY); // Import Box45
		bodyModel[43] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box46
		bodyModel[44] = new ModelRendererTurbo(this, 0, 361, textureX, textureY); // Import Box47
		bodyModel[45] = new ModelRendererTurbo(this, 41, 361, textureX, textureY); // Import Box48
		bodyModel[46] = new ModelRendererTurbo(this, 0, 381, textureX, textureY); // Import Box49
		bodyModel[47] = new ModelRendererTurbo(this, 0, 398, textureX, textureY); // Import Box50
		bodyModel[48] = new ModelRendererTurbo(this, 0, 415, textureX, textureY); // Import Box51
		bodyModel[49] = new ModelRendererTurbo(this, 0, 432, textureX, textureY); // Import Box52
		bodyModel[50] = new ModelRendererTurbo(this, 0, 434, textureX, textureY); // Import Box53
		bodyModel[51] = new ModelRendererTurbo(this, 0, 436, textureX, textureY); // Import Box54
		bodyModel[52] = new ModelRendererTurbo(this, 0, 452, textureX, textureY); // Import Box55
		bodyModel[53] = new ModelRendererTurbo(this, 0, 461, textureX, textureY); // Import Box56
		bodyModel[54] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Import Box57
		bodyModel[55] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Import Box58
		bodyModel[56] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Import Box59
		bodyModel[57] = new ModelRendererTurbo(this, 0, 478, textureX, textureY); // Import Box60
		bodyModel[58] = new ModelRendererTurbo(this, 0, 492, textureX, textureY); // Import Box61
		bodyModel[59] = new ModelRendererTurbo(this, 0, 505, textureX, textureY); // Import Box62
		bodyModel[60] = new ModelRendererTurbo(this, 0, 522, textureX, textureY); // Import Box63
		bodyModel[61] = new ModelRendererTurbo(this, 0, 530, textureX, textureY); // Import Box64
		bodyModel[62] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Import Box65
		bodyModel[63] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Import Box66
		bodyModel[64] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Import Box67
		bodyModel[65] = new ModelRendererTurbo(this, 0, 533, textureX, textureY); // Import Box68
		bodyModel[66] = new ModelRendererTurbo(this, 0, 534, textureX, textureY); // Import Box69
		bodyModel[67] = new ModelRendererTurbo(this, 0, 551, textureX, textureY); // Import Box70
		bodyModel[68] = new ModelRendererTurbo(this, 0, 565, textureX, textureY); // Import Box71
		bodyModel[69] = new ModelRendererTurbo(this, 0, 568, textureX, textureY); // Import Box72
		bodyModel[70] = new ModelRendererTurbo(this, 0, 582, textureX, textureY); // Import Box82
		bodyModel[71] = new ModelRendererTurbo(this, 0, 582, textureX, textureY); // Import Box83
		bodyModel[72] = new ModelRendererTurbo(this, 0, 606, textureX, textureY); // Import Box84
		bodyModel[73] = new ModelRendererTurbo(this, 0, 644, textureX, textureY); // Import Box85
		bodyModel[74] = new ModelRendererTurbo(this, 0, 644, textureX, textureY); // Import Box86
		bodyModel[75] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Import Box87
		bodyModel[76] = new ModelRendererTurbo(this, 0, 652, textureX, textureY); // Import Box88
		bodyModel[77] = new ModelRendererTurbo(this, 0, 660, textureX, textureY); // Import Box89
		bodyModel[78] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Import Box90
		bodyModel[79] = new ModelRendererTurbo(this, 0, 681, textureX, textureY); // Import Box91
		bodyModel[80] = new ModelRendererTurbo(this, 0, 693, textureX, textureY); // Import Box92
		bodyModel[81] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Import Box93
		bodyModel[82] = new ModelRendererTurbo(this, 0, 713, textureX, textureY); // Import Box94
		bodyModel[83] = new ModelRendererTurbo(this, 0, 727, textureX, textureY); // Import Box95
		bodyModel[84] = new ModelRendererTurbo(this, 0, 748, textureX, textureY); // Import Box96
		bodyModel[85] = new ModelRendererTurbo(this, 0, 763, textureX, textureY); // Import Box97
		bodyModel[86] = new ModelRendererTurbo(this, 0, 777, textureX, textureY); // Import Box99
		bodyModel[87] = new ModelRendererTurbo(this, 0, 798, textureX, textureY); // Import Box100
		bodyModel[88] = new ModelRendererTurbo(this, 0, 836, textureX, textureY); // Import Box101
		bodyModel[89] = new ModelRendererTurbo(this, 0, 879, textureX, textureY); // Import Box102
		bodyModel[90] = new ModelRendererTurbo(this, 0, 928, textureX, textureY); // Import Box103
		bodyModel[91] = new ModelRendererTurbo(this, 0, 977, textureX, textureY); // Import Box104
		bodyModel[92] = new ModelRendererTurbo(this, 0, 1026, textureX, textureY); // Import Box105
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1071, textureX, textureY); // Import Shape107
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1071, textureX, textureY); // Import Shape108
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1082, textureX, textureY); // Import Box109
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1100, textureX, textureY); // Import Box110
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1082, textureX, textureY); // Import Box111
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1100, textureX, textureY); // Import Box112
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box113
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box114
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box115
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1110, textureX, textureY); // Import Box116
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1114, textureX, textureY); // Import Box117
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1122, textureX, textureY); // Import Box118
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1122, textureX, textureY); // Import Box119
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box120
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1138, textureX, textureY); // Import Box121
		bodyModel[108] = new ModelRendererTurbo(this, 0, 1143, textureX, textureY); // Import Box122
		bodyModel[109] = new ModelRendererTurbo(this, 0, 1132, textureX, textureY); // Import Box123
		bodyModel[110] = new ModelRendererTurbo(this, 0, 1138, textureX, textureY); // Import Box124
		bodyModel[111] = new ModelRendererTurbo(this, 0, 1143, textureX, textureY); // Import Box125
		bodyModel[112] = new ModelRendererTurbo(this, 0, 1147, textureX, textureY); // Import Box126
		bodyModel[113] = new ModelRendererTurbo(this, 0, 1147, textureX, textureY); // Import Box128
		bodyModel[114] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Import Box129
		bodyModel[115] = new ModelRendererTurbo(this, 0, 1161, textureX, textureY); // Import Box130
		bodyModel[116] = new ModelRendererTurbo(this, 0, 1166, textureX, textureY); // Import Box131
		bodyModel[117] = new ModelRendererTurbo(this, 0, 1172, textureX, textureY); // Import Box132
		bodyModel[118] = new ModelRendererTurbo(this, 0, 1155, textureX, textureY); // Import Box133
		bodyModel[119] = new ModelRendererTurbo(this, 0, 1161, textureX, textureY); // Import Box134
		bodyModel[120] = new ModelRendererTurbo(this, 0, 1166, textureX, textureY); // Import Box135
		bodyModel[121] = new ModelRendererTurbo(this, 0, 1172, textureX, textureY); // Import Box136
		bodyModel[122] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Import Box137
		bodyModel[123] = new ModelRendererTurbo(this, 0, 1184, textureX, textureY); // Import Box138
		bodyModel[124] = new ModelRendererTurbo(this, 0, 1180, textureX, textureY); // Import Box139
		bodyModel[125] = new ModelRendererTurbo(this, 0, 1184, textureX, textureY); // Import Box140
		bodyModel[126] = new ModelRendererTurbo(this, 0, 1186, textureX, textureY); // Import Box141
		bodyModel[127] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Import Box142
		bodyModel[128] = new ModelRendererTurbo(this, 0, 1193, textureX, textureY); // Import Box143
		bodyModel[129] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Import Box144
		bodyModel[130] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Import Box145
		bodyModel[131] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Import Box146
		bodyModel[132] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Import Box147
		bodyModel[133] = new ModelRendererTurbo(this, 0, 1186, textureX, textureY); // Import Box148
		bodyModel[134] = new ModelRendererTurbo(this, 0, 1191, textureX, textureY); // Import Box149
		bodyModel[135] = new ModelRendererTurbo(this, 0, 1193, textureX, textureY); // Import Box150
		bodyModel[136] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Import Box151
		bodyModel[137] = new ModelRendererTurbo(this, 0, 1199, textureX, textureY); // Import Box152
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Import Box153
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1203, textureX, textureY); // Import Box154
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1192, textureX, textureY); // Import Box155
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1210, textureX, textureY); // Import Box156
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1228, textureX, textureY); // Import Box157
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1246, textureX, textureY); // Import Box158
		bodyModel[144] = new ModelRendererTurbo(this, 20, 1246, textureX, textureY); // Import Box159
		bodyModel[145] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Import Box160
		bodyModel[146] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Import Box161
		bodyModel[147] = new ModelRendererTurbo(this, 0, 1255, textureX, textureY); // Import Box162
		bodyModel[148] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box163
		bodyModel[149] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box164
		bodyModel[150] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box165
		bodyModel[151] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box166
		bodyModel[152] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Import Box167
		bodyModel[153] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box168
		bodyModel[154] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box169
		bodyModel[155] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box170
		bodyModel[156] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box171
		bodyModel[157] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box173
		bodyModel[158] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box174
		bodyModel[159] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box175
		bodyModel[160] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box176
		bodyModel[161] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Import Box177
		bodyModel[162] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box178
		bodyModel[163] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box179
		bodyModel[164] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box180
		bodyModel[165] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box181
		bodyModel[166] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box182
		bodyModel[167] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box183
		bodyModel[168] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box184
		bodyModel[169] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box185
		bodyModel[170] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box186
		bodyModel[171] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Import Box187
		bodyModel[172] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box188
		bodyModel[173] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box189
		bodyModel[174] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box190
		bodyModel[175] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box191
		bodyModel[176] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box192
		bodyModel[177] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box193
		bodyModel[178] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box194
		bodyModel[179] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box195
		bodyModel[180] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box196
		bodyModel[181] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Import Box197
		bodyModel[182] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box198
		bodyModel[183] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box199
		bodyModel[184] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box200
		bodyModel[185] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box201
		bodyModel[186] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box202
		bodyModel[187] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box203
		bodyModel[188] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box204
		bodyModel[189] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box205
		bodyModel[190] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box206
		bodyModel[191] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Import Box207
		bodyModel[192] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box208
		bodyModel[193] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box209
		bodyModel[194] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box210
		bodyModel[195] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box211
		bodyModel[196] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box212
		bodyModel[197] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box213
		bodyModel[198] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box214
		bodyModel[199] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box215
		bodyModel[200] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box216
		bodyModel[201] = new ModelRendererTurbo(this, 0, 1286, textureX, textureY); // Import Box217
		bodyModel[202] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box218
		bodyModel[203] = new ModelRendererTurbo(this, 0, 1262, textureX, textureY); // Import Box219
		bodyModel[204] = new ModelRendererTurbo(this, 0, 1278, textureX, textureY); // Import Box220
		bodyModel[205] = new ModelRendererTurbo(this, 0, 1293, textureX, textureY); // Import Box221
		bodyModel[206] = new ModelRendererTurbo(this, 0, 1270, textureX, textureY); // Import Box222
		bodyModel[207] = new ModelRendererTurbo(this, 0, 1266, textureX, textureY); // Import Box223
		bodyModel[208] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Import Box224
		bodyModel[209] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box225
		bodyModel[210] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Import Box226
		bodyModel[211] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Import Box227
		bodyModel[212] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box228
		bodyModel[213] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Import Box229
		bodyModel[214] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Import Box230
		bodyModel[215] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box231
		bodyModel[216] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Import Box232
		bodyModel[217] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Import Box233
		bodyModel[218] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box234
		bodyModel[219] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Import Box235
		bodyModel[220] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Import Box236
		bodyModel[221] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box237
		bodyModel[222] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Import Box238
		bodyModel[223] = new ModelRendererTurbo(this, 0, 1298, textureX, textureY); // Import Box239
		bodyModel[224] = new ModelRendererTurbo(this, 0, 1308, textureX, textureY); // Import Box240
		bodyModel[225] = new ModelRendererTurbo(this, 0, 1317, textureX, textureY); // Import Box241
		bodyModel[226] = new ModelRendererTurbo(this, 0, 1285, textureX, textureY); // Import Box333
		bodyModel[227] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Import Box339
		bodyModel[228] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Import Box343
		bodyModel[229] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Import Box279
		bodyModel[230] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Import Box283
		bodyModel[231] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Import Box284
		bodyModel[232] = new ModelRendererTurbo(this, 0, 1332, textureX, textureY); // Import Box285
		bodyModel[233] = new ModelRendererTurbo(this, 30, 763, textureX, textureY); // Import Box471
		bodyModel[234] = new ModelRendererTurbo(this, 0, 378, textureX, textureY); // Import Box652
		bodyModel[235] = new ModelRendererTurbo(this, 15, 378, textureX, textureY); // Import Box653

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 14, 39, 0F,0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 2F, 18F, -7F, 0F, 18F, -7F, 0F, 0F, -7F, 2F); // Import Box0
		bodyModel[0].setRotationPoint(22.5F, -16.5F, -19.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 19, 11, 19, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, -14F, -1F, -2F, -15F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box1
		bodyModel[1].setRotationPoint(22.5F, -9.5F, -19.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 19, 11, 19, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0.5F, -15F, 0F, 0.5F, -14F, -1F, -2F, 0F, -1F, -2F); // Import Box2
		bodyModel[2].setRotationPoint(22.5F, -9.5F, 0.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 96, 11, 19, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Import Box5
		bodyModel[3].setRotationPoint(-73.5F, -9.5F, -19.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 96, 11, 19, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, 0F, -1F, -2F); // Import Box6
		bodyModel[4].setRotationPoint(-73.5F, -9.5F, 0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 11, 19, 0F,0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -9F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0.5F, -10F, 0F, 0.5F); // Import Box7
		bodyModel[5].setRotationPoint(-86.5F, -9.5F, -19.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 11, 19, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0.5F, 0F, 0F, -10F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2F, -9F, -1F, -2F); // Import Box8
		bodyModel[6].setRotationPoint(-86.5F, -9.5F, 0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 7, 39, 0F,0F, 0F, 0F, 93F, 0F, 0F, 93F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 93F, 0F, 2F, 93F, 0F, 2F, 0F, 0F, 2F); // Import Box9
		bodyModel[7].setRotationPoint(-73.5F, -16.5F, -19.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 39, 0F,0F, 0F, -2F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F); // Import Box10
		bodyModel[8].setRotationPoint(22.5F, -19F, -19.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 24, 2, 39, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box11
		bodyModel[9].setRotationPoint(-1.5F, -19F, -19.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 84, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box12
		bodyModel[10].setRotationPoint(-78.5F, -17.5F, -34F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box13
		bodyModel[11].setRotationPoint(5.5F, -17.5F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 15, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Import Box14
		bodyModel[12].setRotationPoint(22.5F, -17.5F, -34F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F); // Import Box15
		bodyModel[13].setRotationPoint(30.5F, -17F, -34F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, -0.5F, -0.5F); // Import Box16
		bodyModel[14].setRotationPoint(35.5F, -15.5F, -34F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F); // Import Box17
		bodyModel[15].setRotationPoint(30.5F, -15.5F, -20F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1F, 2.5F, -0.5F, -1F, 2.5F, 0F, 0F, -0.5F, -0.5F); // Import Box18
		bodyModel[16].setRotationPoint(35.5F, -14F, -20F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box19
		bodyModel[17].setRotationPoint(-81.5F, -17.5F, -34F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F); // Import Box20
		bodyModel[18].setRotationPoint(-85.5F, -17.5F, -34F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, -1F, 3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, 3F, -0.5F); // Import Box21
		bodyModel[19].setRotationPoint(-90.5F, -16F, -34F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box22
		bodyModel[20].setRotationPoint(-78.5F, -17F, -34F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box23
		bodyModel[21].setRotationPoint(-59.5F, -17F, -34F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		bodyModel[22].setRotationPoint(-75.5F, -20F, -34.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		bodyModel[23].setRotationPoint(-75F, -21F, -32.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,-1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		bodyModel[24].setRotationPoint(-75F, -21F, -34.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		bodyModel[25].setRotationPoint(-73F, -21.5F, -25F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[26].setRotationPoint(-63.5F, -21.5F, -25F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box30
		bodyModel[27].setRotationPoint(-54.5F, -22.8F, -30F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box31
		bodyModel[28].setRotationPoint(-38.5F, -22.8F, -30F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box32
		bodyModel[29].setRotationPoint(-56.5F, -22.3F, -30F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 36, 3, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		bodyModel[30].setRotationPoint(-30.5F, -19F, -34.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 35, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		bodyModel[31].setRotationPoint(-30.5F, -20F, -32.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F,-1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		bodyModel[32].setRotationPoint(-30.5F, -20F, -34.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		bodyModel[33].setRotationPoint(-29.5F, -20.5F, -26F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		bodyModel[34].setRotationPoint(-19.5F, -20.5F, -26F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		bodyModel[35].setRotationPoint(-8.5F, -20.5F, -26F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		bodyModel[36].setRotationPoint(1.5F, -20.5F, -26F);

		bodyModel[37].addShapeBox(-0.5F, -0.2F, 0F, 3, 2, 14, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		bodyModel[37].setRotationPoint(35.5F, -15.5F, -34F);
		bodyModel[37].rotateAngleZ = -0.34906585F;

		bodyModel[38].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 13, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		bodyModel[38].setRotationPoint(35.5F, -15.5F, -33F);
		bodyModel[38].rotateAngleZ = -0.34906585F;

		bodyModel[39].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		bodyModel[39].setRotationPoint(35.5F, -15.5F, -20F);
		bodyModel[39].rotateAngleZ = -0.34906585F;

		bodyModel[40].addShapeBox(0.5F, -0.2F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		bodyModel[40].setRotationPoint(35.5F, -15.5F, -20F);
		bodyModel[40].rotateAngleZ = -0.34906585F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 84, 1, 15, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box44
		bodyModel[41].setRotationPoint(-78.5F, -17.5F, 19F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box45
		bodyModel[42].setRotationPoint(5.5F, -17.5F, 19F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 2, 15, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import Box46
		bodyModel[43].setRotationPoint(22.5F, -17.5F, 19F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Import Box47
		bodyModel[44].setRotationPoint(30.5F, -17F, 19F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 2, 15, 0F,0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, -0.5F, 0F); // Import Box48
		bodyModel[45].setRotationPoint(35.5F, -15.5F, 19F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 15, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box49
		bodyModel[46].setRotationPoint(-81.5F, -17.5F, 19F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F,0F, -1.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 0F); // Import Box50
		bodyModel[47].setRotationPoint(-85.5F, -17.5F, 19F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 2, 15, 0F,0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, -1F, 3F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 3F, 0F); // Import Box51
		bodyModel[48].setRotationPoint(-90.5F, -16F, 19F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		bodyModel[49].setRotationPoint(-78.5F, -17F, 33F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		bodyModel[50].setRotationPoint(-59.5F, -17F, 33F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		bodyModel[51].setRotationPoint(-75.5F, -20F, 22.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		bodyModel[52].setRotationPoint(-75F, -21F, 24.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Import Box56
		bodyModel[53].setRotationPoint(-75F, -21F, 32.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		bodyModel[54].setRotationPoint(-73F, -21.5F, 24F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		bodyModel[55].setRotationPoint(-63.5F, -21.5F, 24F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 5, 9, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box59
		bodyModel[56].setRotationPoint(-54.5F, -22.8F, 21F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F,0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box60
		bodyModel[57].setRotationPoint(-38.5F, -22.8F, 21F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F); // Import Box61
		bodyModel[58].setRotationPoint(-56.5F, -22.3F, 21F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 36, 3, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		bodyModel[59].setRotationPoint(-30.5F, -19F, 20.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 35, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		bodyModel[60].setRotationPoint(-30.5F, -20F, 25.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 35, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F); // Import Box64
		bodyModel[61].setRotationPoint(-30.5F, -20F, 32.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		bodyModel[62].setRotationPoint(-29.5F, -20.5F, 25F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		bodyModel[63].setRotationPoint(-19.5F, -20.5F, 25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		bodyModel[64].setRotationPoint(-8.5F, -20.5F, 25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[65].setRotationPoint(1.5F, -20.5F, 25F);

		bodyModel[66].addShapeBox(-0.5F, -0.2F, 0F, 3, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Import Box69
		bodyModel[66].setRotationPoint(35.5F, -15.5F, 20F);
		bodyModel[66].rotateAngleZ = -0.34906585F;

		bodyModel[67].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		bodyModel[67].setRotationPoint(35.5F, -15.5F, 20F);
		bodyModel[67].rotateAngleZ = -0.34906585F;

		bodyModel[68].addShapeBox(0.5F, -1.2F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		bodyModel[68].setRotationPoint(35.5F, -15.5F, 18F);
		bodyModel[68].rotateAngleZ = -0.34906585F;

		bodyModel[69].addShapeBox(0.5F, -0.2F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		bodyModel[69].setRotationPoint(35.5F, -15.5F, 18F);
		bodyModel[69].rotateAngleZ = -0.34906585F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 13, 4, 20, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		bodyModel[70].setRotationPoint(-37F, -19.5F, -20F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 13, 4, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		bodyModel[71].setRotationPoint(-37F, -19.5F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 4, 34, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[72].setRotationPoint(-45F, -21F, -17F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, -1F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		bodyModel[73].setRotationPoint(-45F, -21F, -21F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		bodyModel[74].setRotationPoint(-45F, -21F, 17F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		bodyModel[75].setRotationPoint(-44.9F, -22F, -21F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		bodyModel[76].setRotationPoint(-44.9F, -22F, 17F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 19, 6, 15, 0F,0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		bodyModel[77].setRotationPoint(-60F, -25F, -7.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F,0F, 0F, 0F, -0.5F, -5F, -4F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		bodyModel[78].setRotationPoint(-60F, -25.5F, -13.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 19, 6, 6, 0F,0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, 4F); // Import Box91
		bodyModel[79].setRotationPoint(-60F, -25.5F, 7.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 19, 6, 14, 0F,0F, 0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		bodyModel[80].setRotationPoint(-60F, -25.5F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 4F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box93
		bodyModel[81].setRotationPoint(-66F, -25.5F, -16F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F,2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, -2F, 0F, 4F); // Import Box94
		bodyModel[82].setRotationPoint(-66F, -25.5F, 8F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 8, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		bodyModel[83].setRotationPoint(-68F, -25F, -7.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		bodyModel[84].setRotationPoint(-67.5F, -25.5F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 3F, 2.5F, -1.5F, 3F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box97
		bodyModel[85].setRotationPoint(-73F, -25.5F, -16F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 5, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		bodyModel[86].setRotationPoint(-73F, -25.5F, -7.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 14, 6, 32, 0F,0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, 0F, -2F, 2F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, -2F, 2F); // Import Box100
		bodyModel[87].setRotationPoint(-87F, -25.5F, -16F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 5, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		bodyModel[88].setRotationPoint(-87F, -21.5F, -19F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 5, 44, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box102
		bodyModel[89].setRotationPoint(-77F, -21.5F, -22F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 13, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		bodyModel[90].setRotationPoint(-74F, -21.5F, -22F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box104
		bodyModel[91].setRotationPoint(-61F, -21.5F, -22F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 13, 5, 40, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		bodyModel[92].setRotationPoint(-58F, -21.5F, -20F);

		bodyModel[93].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(3, 0, 3, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 8, 14, 8), new Coord2D(11, 10, 11, 10), new Coord2D(0, 10, 0, 10) }), 1, 14, 10, 46, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,11 ,4 ,8 ,11 ,4}); // Import Shape107
		bodyModel[93].setRotationPoint(-87F, -12.5F, 2F);
		bodyModel[93].rotateAngleY = -1.57079633F;

		bodyModel[94].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 2, 0, 2), new Coord2D(3, 0, 3, 0), new Coord2D(14, 0, 14, 0), new Coord2D(14, 8, 14, 8), new Coord2D(11, 10, 11, 10), new Coord2D(0, 10, 0, 10) }), 1, 14, 10, 46, 1, ModelRendererTurbo.MR_FRONT, new float[] {8 ,11 ,4 ,8 ,11 ,4}); // Import Shape108
		bodyModel[94].setRotationPoint(-88F, -12.5F, -2F);
		bodyModel[94].rotateAngleY = 1.57079633F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box109
		bodyModel[95].setRotationPoint(-79.5F, -20.5F, -33F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box110
		bodyModel[96].setRotationPoint(-85.5F, -19.5F, -27F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 4, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box111
		bodyModel[97].setRotationPoint(-79.5F, -20.5F, 19F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box112
		bodyModel[98].setRotationPoint(-85.5F, -19.5F, 21F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		bodyModel[99].setRotationPoint(-33.5F, -20.8F, -28F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box114
		bodyModel[100].setRotationPoint(-33.5F, -20.8F, -24F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		bodyModel[101].setRotationPoint(-33.5F, -20.8F, 27F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box116
		bodyModel[102].setRotationPoint(-33.5F, -20.8F, 23F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box117
		bodyModel[103].setRotationPoint(-89.5F, -9.5F, -2F);

		bodyModel[104].addShapeBox(0F, -1F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		bodyModel[104].setRotationPoint(-87.5F, -9.5F, -11F);
		bodyModel[104].rotateAngleZ = 0.36651914F;

		bodyModel[105].addShapeBox(0F, -1F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		bodyModel[105].setRotationPoint(-87.5F, -9.5F, 6F);
		bodyModel[105].rotateAngleZ = 0.36651914F;

		bodyModel[106].addShapeBox(0F, -1F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box120
		bodyModel[106].setRotationPoint(-89.5F, -8.5F, -18F);

		bodyModel[107].addShapeBox(0F, -1F, 0F, 5, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		bodyModel[107].setRotationPoint(-89.5F, -9.5F, -18F);

		bodyModel[108].addShapeBox(0F, -1F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box122
		bodyModel[108].setRotationPoint(-90F, -9F, -17F);

		bodyModel[109].addShapeBox(0F, -1F, 0F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		bodyModel[109].setRotationPoint(-89.5F, -8.5F, 14F);

		bodyModel[110].addShapeBox(0F, -1F, 0F, 5, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		bodyModel[110].setRotationPoint(-89.5F, -9.5F, 14F);

		bodyModel[111].addShapeBox(0F, -1F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		bodyModel[111].setRotationPoint(-90F, -9F, 15F);

		bodyModel[112].addShapeBox(0F, -1F, 0F, 5, 7, 1, 0F,-1F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, -5F, 0F, 0F, 4.5F, -2F, 0F, 4.5F, -2F, 0F, -5F, 0F, 0F); // Import Box126
		bodyModel[112].setRotationPoint(-89.5F, -6.5F, -15.2F);

		bodyModel[113].addShapeBox(0F, -1F, 0F, 5, 7, 1, 0F,-1F, -4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -1F, -4F, 0F, -5F, 0F, 0F, 4.5F, -2F, 0F, 4.5F, -2F, 0F, -5F, 0F, 0F); // Import Box128
		bodyModel[113].setRotationPoint(-89.5F, -6.5F, 12.2F);

		bodyModel[114].addShapeBox(1F, -1.2F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box129
		bodyModel[114].setRotationPoint(35.5F, -15.5F, -24F);
		bodyModel[114].rotateAngleZ = -0.34906585F;

		bodyModel[115].addShapeBox(1F, -2.2F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box130
		bodyModel[115].setRotationPoint(35.5F, -15.5F, -19F);
		bodyModel[115].rotateAngleZ = -0.34906585F;

		bodyModel[116].addShapeBox(1F, -4.2F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		bodyModel[116].setRotationPoint(35.5F, -15.5F, -15F);
		bodyModel[116].rotateAngleZ = -0.34906585F;

		bodyModel[117].addShapeBox(1F, -3.2F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		bodyModel[117].setRotationPoint(35.5F, -15.5F, -11F);
		bodyModel[117].rotateAngleZ = -0.34906585F;

		bodyModel[118].addShapeBox(1F, -1.2F, 0F, 1, 1, 5, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[118].setRotationPoint(35.5F, -15.5F, 19F);
		bodyModel[118].rotateAngleZ = -0.34906585F;

		bodyModel[119].addShapeBox(1F, -2.2F, 0F, 1, 1, 4, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		bodyModel[119].setRotationPoint(35.5F, -15.5F, 15F);
		bodyModel[119].rotateAngleZ = -0.34906585F;

		bodyModel[120].addShapeBox(1F, -4.2F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		bodyModel[120].setRotationPoint(35.5F, -15.5F, 10F);
		bodyModel[120].rotateAngleZ = -0.34906585F;

		bodyModel[121].addShapeBox(1F, -3.2F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		bodyModel[121].setRotationPoint(35.5F, -15.5F, 10F);
		bodyModel[121].rotateAngleZ = -0.34906585F;

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		bodyModel[122].setRotationPoint(33F, -15.5F, -17.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		bodyModel[123].setRotationPoint(33F, -16.5F, -17.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		bodyModel[124].setRotationPoint(33F, -15.5F, 16.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		bodyModel[125].setRotationPoint(33F, -16.5F, 16.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		bodyModel[126].setRotationPoint(37F, -12.5F, -15F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		bodyModel[127].setRotationPoint(37.5F, -13.5F, -14.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		bodyModel[128].setRotationPoint(36F, -16.5F, -15.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		bodyModel[129].setRotationPoint(36F, -16.5F, -16.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box145
		bodyModel[130].setRotationPoint(36F, -16.5F, -12.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box146
		bodyModel[131].setRotationPoint(38.5F, -16F, -16F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box147
		bodyModel[132].setRotationPoint(38.5F, -16F, -14F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		bodyModel[133].setRotationPoint(37F, -12.5F, 13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		bodyModel[134].setRotationPoint(37.5F, -13.5F, 13.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		bodyModel[135].setRotationPoint(36F, -16.5F, 12.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box151
		bodyModel[136].setRotationPoint(36F, -16.5F, 15.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		bodyModel[137].setRotationPoint(36F, -16.5F, 11.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box153
		bodyModel[138].setRotationPoint(38.5F, -16F, 14F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Import Box154
		bodyModel[139].setRotationPoint(38.5F, -16F, 12F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box155
		bodyModel[140].setRotationPoint(11.5F, -19.5F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		bodyModel[141].setRotationPoint(12.5F, -19.5F, -8F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box157
		bodyModel[142].setRotationPoint(14.5F, -19.5F, -8F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		bodyModel[143].setRotationPoint(17.5F, -19.5F, -6F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F); // Import Box159
		bodyModel[144].setRotationPoint(17.5F, -19.5F, 0F);

		bodyModel[145].addShapeBox(3F, -1F, -2F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		bodyModel[145].setRotationPoint(17.5F, -19.5F, 0F);

		bodyModel[146].addShapeBox(4F, -1F, -5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		bodyModel[146].setRotationPoint(17.5F, -19.5F, 0F);
		bodyModel[146].rotateAngleY = -0.76794487F;

		bodyModel[147].addShapeBox(4F, -1F, 1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		bodyModel[147].setRotationPoint(17.5F, -19.5F, 0F);
		bodyModel[147].rotateAngleY = 0.76794487F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Import Box163
		bodyModel[148].setRotationPoint(-61F, -2F, -21.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box164
		bodyModel[149].setRotationPoint(-69F, -2F, -22.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		bodyModel[150].setRotationPoint(-70F, 1F, -24.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		bodyModel[151].setRotationPoint(-69F, -7F, -23.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Import Box167
		bodyModel[152].setRotationPoint(-69F, -7F, -21.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		bodyModel[153].setRotationPoint(-68.5F, -2F, -23F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box169
		bodyModel[154].setRotationPoint(-69F, -2F, 21.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		bodyModel[155].setRotationPoint(-70F, 1F, 20.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		bodyModel[156].setRotationPoint(-69F, -7F, 21.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box173
		bodyModel[157].setRotationPoint(-68.5F, -2F, 22F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box174
		bodyModel[158].setRotationPoint(-51F, -2F, 21.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		bodyModel[159].setRotationPoint(-52F, 1F, 20.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		bodyModel[160].setRotationPoint(-51F, -7F, 21.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box177
		bodyModel[161].setRotationPoint(-51F, -7F, 20.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		bodyModel[162].setRotationPoint(-50.5F, -2F, 22F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Import Box179
		bodyModel[163].setRotationPoint(-43F, -2F, -21.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		bodyModel[164].setRotationPoint(-51F, -7F, -23.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		bodyModel[165].setRotationPoint(-50.5F, -2F, -23F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		bodyModel[166].setRotationPoint(-52F, 1F, -24.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box183
		bodyModel[167].setRotationPoint(-51F, -2F, -22.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box184
		bodyModel[168].setRotationPoint(-35F, -2F, 21.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box185
		bodyModel[169].setRotationPoint(-36F, 1F, 20.5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box186
		bodyModel[170].setRotationPoint(-35F, -7F, 21.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box187
		bodyModel[171].setRotationPoint(-35F, -7F, 20.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box188
		bodyModel[172].setRotationPoint(-34.5F, -2F, 22F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Import Box189
		bodyModel[173].setRotationPoint(-27F, -2F, -21.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box190
		bodyModel[174].setRotationPoint(-35F, -7F, -23.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box191
		bodyModel[175].setRotationPoint(-34.5F, -2F, -23F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		bodyModel[176].setRotationPoint(-36F, 1F, -24.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box193
		bodyModel[177].setRotationPoint(-35F, -2F, -22.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box194
		bodyModel[178].setRotationPoint(-18F, -2F, 21.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		bodyModel[179].setRotationPoint(-19F, 1F, 20.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box196
		bodyModel[180].setRotationPoint(-18F, -7F, 21.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		bodyModel[181].setRotationPoint(-18F, -7F, 20.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box198
		bodyModel[182].setRotationPoint(-17.5F, -2F, 22F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Import Box199
		bodyModel[183].setRotationPoint(-10F, -2F, -21.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		bodyModel[184].setRotationPoint(-18F, -7F, -23.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box201
		bodyModel[185].setRotationPoint(-17.5F, -2F, -23F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		bodyModel[186].setRotationPoint(-19F, 1F, -24.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box203
		bodyModel[187].setRotationPoint(-18F, -2F, -22.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box204
		bodyModel[188].setRotationPoint(-1F, -2F, 21.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box205
		bodyModel[189].setRotationPoint(-2F, 1F, 20.5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box206
		bodyModel[190].setRotationPoint(-1F, -7F, 21.5F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box207
		bodyModel[191].setRotationPoint(-1F, -7F, 20.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box208
		bodyModel[192].setRotationPoint(-0.5F, -2F, 22F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Import Box209
		bodyModel[193].setRotationPoint(7F, -2F, -21.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box210
		bodyModel[194].setRotationPoint(-1F, -7F, -23.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box211
		bodyModel[195].setRotationPoint(-0.5F, -2F, -23F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box212
		bodyModel[196].setRotationPoint(-2F, 1F, -24.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box213
		bodyModel[197].setRotationPoint(-1F, -2F, -22.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box214
		bodyModel[198].setRotationPoint(15F, -2F, 21.5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box215
		bodyModel[199].setRotationPoint(14F, 1F, 20.5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box216
		bodyModel[200].setRotationPoint(15F, -7F, 21.5F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box217
		bodyModel[201].setRotationPoint(15F, -7F, 20.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box218
		bodyModel[202].setRotationPoint(15.5F, -2F, 22F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 42F, 0F, 0F, 42F); // Import Box219
		bodyModel[203].setRotationPoint(23F, -2F, -21.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box220
		bodyModel[204].setRotationPoint(15F, -7F, -23.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		bodyModel[205].setRotationPoint(15.5F, -2F, -23F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box222
		bodyModel[206].setRotationPoint(14F, 1F, -24.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box223
		bodyModel[207].setRotationPoint(15F, -2F, -22.5F);

		bodyModel[208].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box224
		bodyModel[208].setRotationPoint(-67.5F, 1F, -24F);
		bodyModel[208].rotateAngleZ = -0.45378561F;

		bodyModel[209].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box225
		bodyModel[209].setRotationPoint(-67.5F, 1F, -24F);
		bodyModel[209].rotateAngleZ = -0.45378561F;

		bodyModel[210].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box226
		bodyModel[210].setRotationPoint(-67.5F, 1F, -22.4F);
		bodyModel[210].rotateAngleZ = -0.45378561F;

		bodyModel[211].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box227
		bodyModel[211].setRotationPoint(-67.5F, 1F, 23F);
		bodyModel[211].rotateAngleZ = -0.45378561F;

		bodyModel[212].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box228
		bodyModel[212].setRotationPoint(-67.5F, 1F, 23F);
		bodyModel[212].rotateAngleZ = -0.45378561F;

		bodyModel[213].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box229
		bodyModel[213].setRotationPoint(-67.5F, 1F, 18.4F);
		bodyModel[213].rotateAngleZ = -0.45378561F;

		bodyModel[214].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box230
		bodyModel[214].setRotationPoint(0.5F, 1F, 23F);
		bodyModel[214].rotateAngleZ = -0.45378561F;

		bodyModel[215].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box231
		bodyModel[215].setRotationPoint(0.5F, 1F, 23F);
		bodyModel[215].rotateAngleZ = -0.45378561F;

		bodyModel[216].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box232
		bodyModel[216].setRotationPoint(0.5F, 1F, 18.4F);
		bodyModel[216].rotateAngleZ = -0.45378561F;

		bodyModel[217].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box233
		bodyModel[217].setRotationPoint(0.5F, 1F, -24F);
		bodyModel[217].rotateAngleZ = -0.45378561F;

		bodyModel[218].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box234
		bodyModel[218].setRotationPoint(0.5F, 1F, -24F);
		bodyModel[218].rotateAngleZ = -0.45378561F;

		bodyModel[219].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box235
		bodyModel[219].setRotationPoint(0.5F, 1F, -22.4F);
		bodyModel[219].rotateAngleZ = -0.45378561F;

		bodyModel[220].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box236
		bodyModel[220].setRotationPoint(16.5F, 1F, 23F);
		bodyModel[220].rotateAngleZ = -0.45378561F;

		bodyModel[221].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box237
		bodyModel[221].setRotationPoint(16.5F, 1F, 23F);
		bodyModel[221].rotateAngleZ = -0.45378561F;

		bodyModel[222].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box238
		bodyModel[222].setRotationPoint(16.5F, 1F, 18.4F);
		bodyModel[222].rotateAngleZ = -0.45378561F;

		bodyModel[223].addShapeBox(0F, -7F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box239
		bodyModel[223].setRotationPoint(16.5F, 1F, -24F);
		bodyModel[223].rotateAngleZ = -0.45378561F;

		bodyModel[224].addShapeBox(0F, -15F, 0F, 1, 8, 1, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box240
		bodyModel[224].setRotationPoint(16.5F, 1F, -24F);
		bodyModel[224].rotateAngleZ = -0.45378561F;

		bodyModel[225].addShapeBox(0F, -15F, 0F, 1, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box241
		bodyModel[225].setRotationPoint(16.5F, 1F, -22.4F);
		bodyModel[225].rotateAngleZ = -0.45378561F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 7, 39, 0F,0.5F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 10F, 0F, 2F, 10F, 0F, 2F, 0.5F, 0F, 0F); // Import Box333
		bodyModel[226].setRotationPoint(-86.5F, -16.5F, -19.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box339
		bodyModel[227].setRotationPoint(-23.5F, -12.25F, 19.5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box343
		bodyModel[228].setRotationPoint(10.5F, -12F, 19.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box279
		bodyModel[229].setRotationPoint(-54.5F, -12.5F, 19.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box283
		bodyModel[230].setRotationPoint(-23.5F, -12.25F, -24.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box284
		bodyModel[231].setRotationPoint(10.5F, -12F, -24.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box285
		bodyModel[232].setRotationPoint(-54.5F, -12.5F, -24.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F,0F, 0F, 0.5F, -1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 2.5F, -1.5F, 3F, 0F, -1F, 3F); // Import Box471
		bodyModel[233].setRotationPoint(-73F, -25.5F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Import Box652
		bodyModel[234].setRotationPoint(30.5F, -15.5F, 19F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -1F, 2.5F, 0F, -1F, 2.5F, -0.5F, 0F, -0.5F, 0F); // Import Box653
		bodyModel[235].setRotationPoint(35.5F, -14F, 19F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 200, 41, textureX, textureY); // Box 664
		turretModel[1] = new ModelRendererTurbo(this, 200, 80, textureX, textureY); // Box 665
		turretModel[2] = new ModelRendererTurbo(this, 200, 106, textureX, textureY); // Box 666
		turretModel[3] = new ModelRendererTurbo(this, 200, 131, textureX, textureY); // Box 667
		turretModel[4] = new ModelRendererTurbo(this, 200, 148, textureX, textureY); // Box 668
		turretModel[5] = new ModelRendererTurbo(this, 200, 148, textureX, textureY); // Box 669
		turretModel[6] = new ModelRendererTurbo(this, 200, 168, textureX, textureY); // Box 670
		turretModel[7] = new ModelRendererTurbo(this, 200, 131, textureX, textureY); // Box 671
		turretModel[8] = new ModelRendererTurbo(this, 200, 168, textureX, textureY); // Box 673
		turretModel[9] = new ModelRendererTurbo(this, 200, 188, textureX, textureY); // Box 674
		turretModel[10] = new ModelRendererTurbo(this, 200, 279, textureX, textureY); // Box 675
		turretModel[11] = new ModelRendererTurbo(this, 200, 298, textureX, textureY); // Box 676
		turretModel[12] = new ModelRendererTurbo(this, 200, 313, textureX, textureY); // Box 677
		turretModel[13] = new ModelRendererTurbo(this, 200, 326, textureX, textureY); // Box 678
		turretModel[14] = new ModelRendererTurbo(this, 200, 342, textureX, textureY); // Box 636
		turretModel[15] = new ModelRendererTurbo(this, 200, 188, textureX, textureY); // Box 637
		turretModel[16] = new ModelRendererTurbo(this, 200, 279, textureX, textureY); // Box 638
		turretModel[17] = new ModelRendererTurbo(this, 200, 298, textureX, textureY); // Box 639
		turretModel[18] = new ModelRendererTurbo(this, 200, 313, textureX, textureY); // Box 640
		turretModel[19] = new ModelRendererTurbo(this, 200, 326, textureX, textureY); // Box 641
		turretModel[20] = new ModelRendererTurbo(this, 200, 342, textureX, textureY); // Box 642
		turretModel[21] = new ModelRendererTurbo(this, 200, 357, textureX, textureY); // Box 643
		turretModel[22] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Box 644
		turretModel[23] = new ModelRendererTurbo(this, 200, 466, textureX, textureY); // Box 646
		turretModel[24] = new ModelRendererTurbo(this, 200, 357, textureX, textureY); // Box 647
		turretModel[25] = new ModelRendererTurbo(this, 200, 380, textureX, textureY); // Box 648
		turretModel[26] = new ModelRendererTurbo(this, 200, 466, textureX, textureY); // Box 649
		turretModel[27] = new ModelRendererTurbo(this, 200, 484, textureX, textureY); // Box 650
		turretModel[28] = new ModelRendererTurbo(this, 200, 505, textureX, textureY); // Box 651
		turretModel[29] = new ModelRendererTurbo(this, 200, 529, textureX, textureY); // Box 652
		turretModel[30] = new ModelRendererTurbo(this, 200, 484, textureX, textureY); // Box 653
		turretModel[31] = new ModelRendererTurbo(this, 200, 505, textureX, textureY); // Box 654
		turretModel[32] = new ModelRendererTurbo(this, 200, 529, textureX, textureY); // Box 655
		turretModel[33] = new ModelRendererTurbo(this, 200, 546, textureX, textureY); // Box 656
		turretModel[34] = new ModelRendererTurbo(this, 200, 564, textureX, textureY); // Box 657
		turretModel[35] = new ModelRendererTurbo(this, 200, 616, textureX, textureY); // Box 658
		turretModel[36] = new ModelRendererTurbo(this, 200, 631, textureX, textureY); // Box 659
		turretModel[37] = new ModelRendererTurbo(this, 200, 658, textureX, textureY); // Box 662
		turretModel[38] = new ModelRendererTurbo(this, 200, 680, textureX, textureY); // Box 663
		turretModel[39] = new ModelRendererTurbo(this, 200, 546, textureX, textureY); // Box 664
		turretModel[40] = new ModelRendererTurbo(this, 200, 564, textureX, textureY); // Box 665
		turretModel[41] = new ModelRendererTurbo(this, 200, 616, textureX, textureY); // Box 666
		turretModel[42] = new ModelRendererTurbo(this, 200, 631, textureX, textureY); // Box 667
		turretModel[43] = new ModelRendererTurbo(this, 200, 658, textureX, textureY); // Box 668
		turretModel[44] = new ModelRendererTurbo(this, 200, 680, textureX, textureY); // Box 669
		turretModel[45] = new ModelRendererTurbo(this, 200, 678, textureX, textureY); // Box 670
		turretModel[46] = new ModelRendererTurbo(this, 200, 713, textureX, textureY); // Box 671
		turretModel[47] = new ModelRendererTurbo(this, 200, 748, textureX, textureY); // Box 672
		turretModel[48] = new ModelRendererTurbo(this, 200, 789, textureX, textureY); // Box 673
		turretModel[49] = new ModelRendererTurbo(this, 200, 826, textureX, textureY); // Box 674
		turretModel[50] = new ModelRendererTurbo(this, 200, 865, textureX, textureY); // Box 675
		turretModel[51] = new ModelRendererTurbo(this, 200, 900, textureX, textureY); // Box 676
		turretModel[52] = new ModelRendererTurbo(this, 200, 941, textureX, textureY); // Box 677
		turretModel[53] = new ModelRendererTurbo(this, 200, 977, textureX, textureY); // Box 678
		turretModel[54] = new ModelRendererTurbo(this, 200, 1016, textureX, textureY); // Box 679
		turretModel[55] = new ModelRendererTurbo(this, 200, 1047, textureX, textureY); // Box 680
		turretModel[56] = new ModelRendererTurbo(this, 200, 1084, textureX, textureY); // Box 681
		turretModel[57] = new ModelRendererTurbo(this, 200, 1116, textureX, textureY); // Box 682
		turretModel[58] = new ModelRendererTurbo(this, 200, 1152, textureX, textureY); // Box 683
		turretModel[59] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Box 684
		turretModel[60] = new ModelRendererTurbo(this, 200, 1185, textureX, textureY); // Box 685
		turretModel[61] = new ModelRendererTurbo(this, 200, 1200, textureX, textureY); // Box 686
		turretModel[62] = new ModelRendererTurbo(this, 200, 1152, textureX, textureY); // Box 685
		turretModel[63] = new ModelRendererTurbo(this, 200, 1165, textureX, textureY); // Box 686
		turretModel[64] = new ModelRendererTurbo(this, 200, 1185, textureX, textureY); // Box 687
		turretModel[65] = new ModelRendererTurbo(this, 200, 1200, textureX, textureY); // Box 688
		turretModel[66] = new ModelRendererTurbo(this, 200, 1218, textureX, textureY); // Box 689
		turretModel[67] = new ModelRendererTurbo(this, 200, 1218, textureX, textureY); // Box 690
		turretModel[68] = new ModelRendererTurbo(this, 200, 1236, textureX, textureY); // Box 691
		turretModel[69] = new ModelRendererTurbo(this, 200, 1261, textureX, textureY); // Box 692
		turretModel[70] = new ModelRendererTurbo(this, 200, 1278, textureX, textureY); // Box 693
		turretModel[71] = new ModelRendererTurbo(this, 200, 1290, textureX, textureY); // Box 694
		turretModel[72] = new ModelRendererTurbo(this, 200, 1297, textureX, textureY); // Box 695
		turretModel[73] = new ModelRendererTurbo(this, 200, 1297, textureX, textureY); // Box 696
		turretModel[74] = new ModelRendererTurbo(this, 200, 1297, textureX, textureY); // Box 697
		turretModel[75] = new ModelRendererTurbo(this, 200, 1298, textureX, textureY); // Box 698
		turretModel[76] = new ModelRendererTurbo(this, 200, 1311, textureX, textureY); // Box 699
		turretModel[77] = new ModelRendererTurbo(this, 200, 1324, textureX, textureY); // Box 700
		turretModel[78] = new ModelRendererTurbo(this, 200, 1337, textureX, textureY); // Box 701
		turretModel[79] = new ModelRendererTurbo(this, 200, 1349, textureX, textureY); // Box 702
		turretModel[80] = new ModelRendererTurbo(this, 200, 1298, textureX, textureY); // Box 703
		turretModel[81] = new ModelRendererTurbo(this, 200, 1311, textureX, textureY); // Box 704
		turretModel[82] = new ModelRendererTurbo(this, 200, 1324, textureX, textureY); // Box 705
		turretModel[83] = new ModelRendererTurbo(this, 200, 1337, textureX, textureY); // Box 706
		turretModel[84] = new ModelRendererTurbo(this, 200, 1349, textureX, textureY); // Box 707
		turretModel[85] = new ModelRendererTurbo(this, 200, 1352, textureX, textureY); // Box 708
		turretModel[86] = new ModelRendererTurbo(this, 200, 1360, textureX, textureY); // Box 709
		turretModel[87] = new ModelRendererTurbo(this, 200, 1369, textureX, textureY); // Box 710
		turretModel[88] = new ModelRendererTurbo(this, 200, 1375, textureX, textureY); // Box 711
		turretModel[89] = new ModelRendererTurbo(this, 200, 1375, textureX, textureY); // Box 712
		turretModel[90] = new ModelRendererTurbo(this, 200, 1378, textureX, textureY); // Box 712
		turretModel[91] = new ModelRendererTurbo(this, 200, 1365, textureX, textureY); // Box 713
		turretModel[92] = new ModelRendererTurbo(this, 200, 1387, textureX, textureY); // Box 714
		turretModel[93] = new ModelRendererTurbo(this, 200, 1409, textureX, textureY); // Box 715
		turretModel[94] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 716
		turretModel[95] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 717
		turretModel[96] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 718
		turretModel[97] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 719
		turretModel[98] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 720
		turretModel[99] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 721
		turretModel[100] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 722
		turretModel[101] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 723
		turretModel[102] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 724
		turretModel[103] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 725
		turretModel[104] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 726
		turretModel[105] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 727
		turretModel[106] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 728
		turretModel[107] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 729
		turretModel[108] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 730
		turretModel[109] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 731
		turretModel[110] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 732
		turretModel[111] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 733
		turretModel[112] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 734
		turretModel[113] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 735
		turretModel[114] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 742
		turretModel[115] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 743
		turretModel[116] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 744
		turretModel[117] = new ModelRendererTurbo(this, 200, 1431, textureX, textureY); // Box 745
		turretModel[118] = new ModelRendererTurbo(this, 200, 1434, textureX, textureY); // Box 746
		turretModel[119] = new ModelRendererTurbo(this, 200, 1434, textureX, textureY); // Box 747
		turretModel[120] = new ModelRendererTurbo(this, 200, 1434, textureX, textureY); // Box 748
		turretModel[121] = new ModelRendererTurbo(this, 200, 1438, textureX, textureY); // Box 749
		turretModel[122] = new ModelRendererTurbo(this, 200, 1438, textureX, textureY); // Box 750
		turretModel[123] = new ModelRendererTurbo(this, 200, 1438, textureX, textureY); // Box 751
		turretModel[124] = new ModelRendererTurbo(this, 200, 1441, textureX, textureY); // Box 752
		turretModel[125] = new ModelRendererTurbo(this, 200, 1446, textureX, textureY); // Box 753
		turretModel[126] = new ModelRendererTurbo(this, 200, 1435, textureX, textureY); // Box 754
		turretModel[127] = new ModelRendererTurbo(this, 200, 1464, textureX, textureY); // Box 755
		turretModel[128] = new ModelRendererTurbo(this, 200, 1464, textureX, textureY); // Box 756
		turretModel[129] = new ModelRendererTurbo(this, 200, 1493, textureX, textureY); // Box 757
		turretModel[130] = new ModelRendererTurbo(this, 200, 1523, textureX, textureY); // Box 758
		turretModel[131] = new ModelRendererTurbo(this, 200, 1523, textureX, textureY); // Box 759
		turretModel[132] = new ModelRendererTurbo(this, 200, 1553, textureX, textureY); // Box 760
		turretModel[133] = new ModelRendererTurbo(this, 200, 1583, textureX, textureY); // Box 761
		turretModel[134] = new ModelRendererTurbo(this, 200, 1583, textureX, textureY); // Box 762
		turretModel[135] = new ModelRendererTurbo(this, 200, 1587, textureX, textureY); // Box 763
		turretModel[136] = new ModelRendererTurbo(this, 200, 1596, textureX, textureY); // Box 764
		turretModel[137] = new ModelRendererTurbo(this, 200, 1605, textureX, textureY); // Box 765
		turretModel[138] = new ModelRendererTurbo(this, 200, 1605, textureX, textureY); // Box 766
		turretModel[139] = new ModelRendererTurbo(this, 200, 1609, textureX, textureY); // Box 767
		turretModel[140] = new ModelRendererTurbo(this, 200, 1609, textureX, textureY); // Box 768
		turretModel[141] = new ModelRendererTurbo(this, 200, 1609, textureX, textureY); // Box 769
		turretModel[142] = new ModelRendererTurbo(this, 200, 1615, textureX, textureY); // Box 770
		turretModel[143] = new ModelRendererTurbo(this, 200, 1620, textureX, textureY); // Box 771
		turretModel[144] = new ModelRendererTurbo(this, 200, 1620, textureX, textureY); // Box 773
		turretModel[145] = new ModelRendererTurbo(this, 200, 1628, textureX, textureY); // Box 774
		turretModel[146] = new ModelRendererTurbo(this, 200, 1633, textureX, textureY); // Box 775
		turretModel[147] = new ModelRendererTurbo(this, 200, 1638, textureX, textureY); // Box 776
		turretModel[148] = new ModelRendererTurbo(this, 200, 1644, textureX, textureY); // Box 776
		turretModel[149] = new ModelRendererTurbo(this, 200, 1654, textureX, textureY); // Box 777
		turretModel[150] = new ModelRendererTurbo(this, 200, 1664, textureX, textureY); // Box 778
		turretModel[151] = new ModelRendererTurbo(this, 200, 1674, textureX, textureY); // Box 779
		turretModel[152] = new ModelRendererTurbo(this, 200, 1674, textureX, textureY); // Box 780
		turretModel[153] = new ModelRendererTurbo(this, 200, 1674, textureX, textureY); // Box 781
		turretModel[154] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 782
		turretModel[155] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 783
		turretModel[156] = new ModelRendererTurbo(this, 200, 1687, textureX, textureY); // Box 784
		turretModel[157] = new ModelRendererTurbo(this, 200, 1687, textureX, textureY); // Box 785
		turretModel[158] = new ModelRendererTurbo(this, 200, 1687, textureX, textureY); // Box 786
		turretModel[159] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 787
		turretModel[160] = new ModelRendererTurbo(this, 200, 1690, textureX, textureY); // Box 788
		turretModel[161] = new ModelRendererTurbo(this, 200, 1690, textureX, textureY); // Box 789
		turretModel[162] = new ModelRendererTurbo(this, 200, 1690, textureX, textureY); // Box 790
		turretModel[163] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 791
		turretModel[164] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 792
		turretModel[165] = new ModelRendererTurbo(this, 200, 1674, textureX, textureY); // Box 793
		turretModel[166] = new ModelRendererTurbo(this, 200, 1674, textureX, textureY); // Box 794
		turretModel[167] = new ModelRendererTurbo(this, 200, 1674, textureX, textureY); // Box 795
		turretModel[168] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 796
		turretModel[169] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 797
		turretModel[170] = new ModelRendererTurbo(this, 200, 1687, textureX, textureY); // Box 798
		turretModel[171] = new ModelRendererTurbo(this, 200, 1687, textureX, textureY); // Box 799
		turretModel[172] = new ModelRendererTurbo(this, 200, 1687, textureX, textureY); // Box 800
		turretModel[173] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 801
		turretModel[174] = new ModelRendererTurbo(this, 200, 1677, textureX, textureY); // Box 802
		turretModel[175] = new ModelRendererTurbo(this, 200, 1704, textureX, textureY); // Box 803
		turretModel[176] = new ModelRendererTurbo(this, 200, 1704, textureX, textureY); // Box 804
		turretModel[177] = new ModelRendererTurbo(this, 200, 1704, textureX, textureY); // Box 805
		turretModel[178] = new ModelRendererTurbo(this, 200, 1704, textureX, textureY); // Box 806
		turretModel[179] = new ModelRendererTurbo(this, 200, 1706, textureX, textureY); // Box 807
		turretModel[180] = new ModelRendererTurbo(this, 200, 1732, textureX, textureY); // Box 808
		turretModel[181] = new ModelRendererTurbo(this, 200, 1750, textureX, textureY); // Box 809
		turretModel[182] = new ModelRendererTurbo(this, 200, 1441, textureX, textureY); // Box 842
		turretModel[183] = new ModelRendererTurbo(this, 200, 1438, textureX, textureY); // Box 843
		turretModel[184] = new ModelRendererTurbo(this, 200, 1438, textureX, textureY); // Box 844
		turretModel[185] = new ModelRendererTurbo(this, 200, 1438, textureX, textureY); // Box 845
		turretModel[186] = new ModelRendererTurbo(this, 200, 1446, textureX, textureY); // Box 846
		turretModel[187] = new ModelRendererTurbo(this, 200, 1772, textureX, textureY); // Box 847

		turretModel[0].addShapeBox(0F, 0F, 0F, 30, 13, 22, 0F,0F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 664
		turretModel[0].setRotationPoint(-4F, -36F, -11F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 30, 1, 22, 0F,0F, 0F, -1F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, 0F, 0F); // Box 665
		turretModel[1].setRotationPoint(-4F, -37F, -11F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 30, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 666
		turretModel[2].setRotationPoint(-4F, -23F, -11F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 28, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 667
		turretModel[3].setRotationPoint(-4F, -23F, -11F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 28, 7, 11, 0F,0F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 668
		turretModel[4].setRotationPoint(-4F, -30F, -11F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 28, 7, 11, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 669
		turretModel[5].setRotationPoint(-4F, -30F, 0F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 24, 7, 11, 0F,0F, 0F, 0F, -4F, -3F, 0F, -5.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 670
		turretModel[6].setRotationPoint(-4F, -37F, -11F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 28, 4, 11, 0F,0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		turretModel[7].setRotationPoint(-4F, -23F, 0F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 24, 7, 11, 0F,0F, 0F, 0F, -5.5F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 673
		turretModel[8].setRotationPoint(-4F, -37F, 0F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 28, 4, 9, 0F,0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		turretModel[9].setRotationPoint(-4F, -23F, -20F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, -3F, -8F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		turretModel[10].setRotationPoint(-4F, -30F, -20F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 24, 7, 6, 0F,0F, -0.5F, -3F, -7F, -3F, -3F, -4F, -3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		turretModel[11].setRotationPoint(-4F, -37F, -17F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 20, 4, 7, 0F,0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 677
		turretModel[12].setRotationPoint(-2F, -23F, -27F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 20, 7, 7, 0F,0F, 0F, -3.5F, -11F, 0F, -5F, -2F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		turretModel[13].setRotationPoint(-2F, -30F, -27F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F,0F, -2F, -4.5F, -11F, -2F, -5F, -3F, -2F, 3F, 2F, 0.5F, 3F, 0F, 0F, -0.5F, -9F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		turretModel[14].setRotationPoint(-2F, -36F, -24F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 28, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 637
		turretModel[15].setRotationPoint(-4F, -23F, 11F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 28, 7, 9, 0F,0F, 0F, 0F, -4F, 0F, 0F, -8F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 638
		turretModel[16].setRotationPoint(-4F, -30F, 11F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 24, 7, 6, 0F,0F, -0.5F, 0F, -4F, -3F, 0F, -7F, -3F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 639
		turretModel[17].setRotationPoint(-4F, -37F, 11F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 20, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, 0F); // Box 640
		turretModel[18].setRotationPoint(-2F, -23F, 20F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 20, 7, 7, 0F,0F, 0F, 3F, -2F, 0F, 3F, -11F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, 0F); // Box 641
		turretModel[19].setRotationPoint(-2F, -30F, 20F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 18, 6, 7, 0F,2F, 0.5F, 3F, -3F, -2F, 3F, -11F, -2F, -5F, 0F, -2F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, -2F, 0F, 0F, -0.5F); // Box 642
		turretModel[20].setRotationPoint(-2F, -36F, 17F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 7, 4, 16, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 643
		turretModel[21].setRotationPoint(-9F, -23F, -27F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 7, 7, 16, 0F,0F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		turretModel[22].setRotationPoint(-9F, -30F, -27F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 7, 7, 9, 0F,0F, -3F, -5F, 0F, -3F, -3.5F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		turretModel[23].setRotationPoint(-9F, -37F, -23F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 7, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 647
		turretModel[24].setRotationPoint(-9F, -23F, 11F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 7, 7, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 648
		turretModel[25].setRotationPoint(-9F, -30F, 11F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 7, 7, 9, 0F,0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -3F, -3.5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F); // Box 649
		turretModel[26].setRotationPoint(-9F, -37F, 14F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 6, 4, 15, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		turretModel[27].setRotationPoint(-15F, -23F, -26F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 6, 7, 15, 0F,-2F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 651
		turretModel[28].setRotationPoint(-15F, -30F, -26F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F,-1F, -4F, -5F, 0F, -3F, -4F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		turretModel[29].setRotationPoint(-13F, -37F, -22F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 6, 4, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 653
		turretModel[30].setRotationPoint(-15F, -23F, 11F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 6, 7, 15, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 654
		turretModel[31].setRotationPoint(-15F, -30F, 11F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 4, 7, 8, 0F,-1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, -4F, -1F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 655
		turretModel[32].setRotationPoint(-13F, -37F, 14F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		turretModel[33].setRotationPoint(-21F, -23F, -23F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 6, 7, 12, 0F,-3F, 0F, -7F, 2F, 0F, -3F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 657
		turretModel[34].setRotationPoint(-21F, -30F, -23F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, -4F, -5F, 1F, -4F, -3F, 1F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 658
		turretModel[35].setRotationPoint(-18F, -37F, -20F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		turretModel[36].setRotationPoint(-25F, -23F, -18F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 4, 7, 12, 0F,-4F, 0F, -6F, 3F, 0F, -2F, 3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		turretModel[37].setRotationPoint(-25F, -30F, -18F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, -4F, -4F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -4F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 663
		turretModel[38].setRotationPoint(-21F, -35F, -16F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 6, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 664
		turretModel[39].setRotationPoint(-21F, -23F, 11F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 6, 7, 12, 0F,-3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -3F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 665
		turretModel[40].setRotationPoint(-21F, -30F, 11F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F,0F, -2F, 0F, 1F, -1.5F, 0F, 1F, -4F, -3F, 0F, -4F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 666
		turretModel[41].setRotationPoint(-18F, -37F, 14F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 667
		turretModel[42].setRotationPoint(-25F, -23F, 6F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 4, 7, 12, 0F,-4F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -2F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 668
		turretModel[43].setRotationPoint(-25F, -30F, 6F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, -4F, 4F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -4F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 669
		turretModel[44].setRotationPoint(-21F, -35F, 14F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 24, 1, 32, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		turretModel[45].setRotationPoint(-33F, -36.5F, -16F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 5, 1, 32, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 671
		turretModel[46].setRotationPoint(-9F, -36.5F, -16F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 24, 7, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 672
		turretModel[47].setRotationPoint(-33F, -35.5F, -16F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 24, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 673
		turretModel[48].setRotationPoint(-33F, -28.5F, -16F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 24, 6, 31, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 674
		turretModel[49].setRotationPoint(-33F, -26.5F, -15.5F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 6, 1, 32, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 675
		turretModel[50].setRotationPoint(-39F, -36.5F, -16F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 6, 7, 32, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 676
		turretModel[51].setRotationPoint(-39F, -35.5F, -16F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 6, 2, 32, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Box 677
		turretModel[52].setRotationPoint(-39F, -28.5F, -16F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 6, 6, 31, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -4F); // Box 678
		turretModel[53].setRotationPoint(-39F, -26.5F, -15.5F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 28, 0F,0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 679
		turretModel[54].setRotationPoint(-44F, -36.5F, -14F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 5, 7, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 680
		turretModel[55].setRotationPoint(-44F, -35.5F, -14F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 5, 2, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F); // Box 681
		turretModel[56].setRotationPoint(-44F, -28.5F, -14F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 5, 6, 27, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -6F, 2F, 0F, -2F, 2F, 0F, -2F, -2F, 0F, -6F); // Box 682
		turretModel[57].setRotationPoint(-44F, -26.5F, -13.5F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1.25F, 0F, -5.25F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 683
		turretModel[58].setRotationPoint(-48F, -36.5F, -10F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,-0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 684
		turretModel[59].setRotationPoint(-48F, -35.5F, -10F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,-0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 685
		turretModel[60].setRotationPoint(-48F, -28.5F, -10F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 4, 6, 10, 0F,-1F, 0F, -5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -6F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F); // Box 686
		turretModel[61].setRotationPoint(-48F, -26.5F, -10F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.25F, 0F, -5.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F); // Box 685
		turretModel[62].setRotationPoint(-48F, -36.5F, 0F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 4, 7, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F); // Box 686
		turretModel[63].setRotationPoint(-48F, -35.5F, 0F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -5F); // Box 687
		turretModel[64].setRotationPoint(-48F, -28.5F, 0F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 4, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -5F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2.5F, -4F, 0F, -6F); // Box 688
		turretModel[65].setRotationPoint(-48F, -26.5F, 0F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 689
		turretModel[66].setRotationPoint(-27F, -23F, -12F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 690
		turretModel[67].setRotationPoint(-27F, -23F, 0F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		turretModel[68].setRotationPoint(-5F, -37F, -11F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 692
		turretModel[69].setRotationPoint(-6F, -37F, -7F);

		turretModel[70].addShapeBox(0F, 0F, 0F, 3, 1, 9, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 693
		turretModel[70].setRotationPoint(-9F, -37F, -4.5F);

		turretModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 694
		turretModel[71].setRotationPoint(-15F, -37F, -2F);

		turretModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 695
		turretModel[72].setRotationPoint(-16F, -37F, -2F);

		turretModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		turretModel[73].setRotationPoint(-16F, -37F, 1F);

		turretModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 697
		turretModel[74].setRotationPoint(-16F, -37F, -1F);

		turretModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 698
		turretModel[75].setRotationPoint(-15F, -37.2F, -13.5F);

		turretModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		turretModel[76].setRotationPoint(-14F, -37.2F, -13.5F);

		turretModel[77].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 700
		turretModel[77].setRotationPoint(-11F, -37.2F, -13.5F);

		turretModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 701
		turretModel[78].setRotationPoint(-8F, -37.2F, -13.5F);

		turretModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 702
		turretModel[79].setRotationPoint(-14F, -37.4F, -13F);

		turretModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 703
		turretModel[80].setRotationPoint(-15F, -37.2F, 3.5F);

		turretModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		turretModel[81].setRotationPoint(-14F, -37.2F, 3.5F);

		turretModel[82].addShapeBox(0F, 0F, 0F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		turretModel[82].setRotationPoint(-11F, -37.2F, 3.5F);

		turretModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 706
		turretModel[83].setRotationPoint(-8F, -37.2F, 4.5F);

		turretModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		turretModel[84].setRotationPoint(-14F, -37.4F, 12F);

		turretModel[85].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 708
		turretModel[85].setRotationPoint(-32F, -34.5F, -16.5F);

		turretModel[86].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 709
		turretModel[86].setRotationPoint(-31F, -34.5F, -16.5F);

		turretModel[87].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 710
		turretModel[87].setRotationPoint(-25F, -33.5F, -16.5F);

		turretModel[88].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 711
		turretModel[88].setRotationPoint(-23F, -33F, -16.5F);
		turretModel[88].rotateAngleY = 0.52359878F;

		turretModel[89].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		turretModel[89].setRotationPoint(-23F, -31F, -16.5F);
		turretModel[89].rotateAngleY = 0.52359878F;

		turretModel[90].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		turretModel[90].setRotationPoint(-5F, -37.5F, -14.5F);

		turretModel[91].addShapeBox(0.3F, -0.7F, 0F, 2, 2, 19, 0F,0F, 0F, -2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 713
		turretModel[91].setRotationPoint(-4F, -36.5F, -9.5F);
		turretModel[91].rotateAngleZ = -0.12786282F;

		turretModel[92].addShapeBox(2.5F, -0.7F, 0F, 24, 2, 19, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 714
		turretModel[92].setRotationPoint(-4F, -36.5F, -9.5F);
		turretModel[92].rotateAngleZ = -0.12786282F;

		turretModel[93].addShapeBox(26.5F, -0.7F, 0F, 2, 2, 19, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 715
		turretModel[93].setRotationPoint(-4F, -36.5F, -9.5F);
		turretModel[93].rotateAngleZ = -0.12786282F;

		turretModel[94].addShapeBox(1.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		turretModel[94].setRotationPoint(-4F, -36.5F, -8F);
		turretModel[94].rotateAngleZ = -0.12786282F;

		turretModel[95].addShapeBox(1.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		turretModel[95].setRotationPoint(-4F, -36.5F, -5F);
		turretModel[95].rotateAngleZ = -0.12786282F;

		turretModel[96].addShapeBox(1.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		turretModel[96].setRotationPoint(-4F, -36.5F, -2F);
		turretModel[96].rotateAngleZ = -0.12786282F;

		turretModel[97].addShapeBox(1.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		turretModel[97].setRotationPoint(-4F, -36.5F, 7F);
		turretModel[97].rotateAngleZ = -0.12786282F;

		turretModel[98].addShapeBox(1.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 720
		turretModel[98].setRotationPoint(-4F, -36.5F, 4F);
		turretModel[98].rotateAngleZ = -0.12786282F;

		turretModel[99].addShapeBox(1.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		turretModel[99].setRotationPoint(-4F, -36.5F, 1F);
		turretModel[99].rotateAngleZ = -0.12786282F;

		turretModel[100].addShapeBox(4.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		turretModel[100].setRotationPoint(-4F, -36.5F, -8F);
		turretModel[100].rotateAngleZ = -0.12786282F;

		turretModel[101].addShapeBox(4.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 723
		turretModel[101].setRotationPoint(-4F, -36.5F, 7F);
		turretModel[101].rotateAngleZ = -0.12786282F;

		turretModel[102].addShapeBox(7.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		turretModel[102].setRotationPoint(-4F, -36.5F, -8F);
		turretModel[102].rotateAngleZ = -0.12786282F;

		turretModel[103].addShapeBox(7.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		turretModel[103].setRotationPoint(-4F, -36.5F, 7F);
		turretModel[103].rotateAngleZ = -0.12786282F;

		turretModel[104].addShapeBox(10.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		turretModel[104].setRotationPoint(-4F, -36.5F, -8F);
		turretModel[104].rotateAngleZ = -0.12786282F;

		turretModel[105].addShapeBox(10.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 727
		turretModel[105].setRotationPoint(-4F, -36.5F, 7F);
		turretModel[105].rotateAngleZ = -0.12786282F;

		turretModel[106].addShapeBox(13.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 728
		turretModel[106].setRotationPoint(-4F, -36.5F, -8F);
		turretModel[106].rotateAngleZ = -0.12786282F;

		turretModel[107].addShapeBox(13.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 729
		turretModel[107].setRotationPoint(-4F, -36.5F, 7F);
		turretModel[107].rotateAngleZ = -0.12786282F;

		turretModel[108].addShapeBox(16.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		turretModel[108].setRotationPoint(-4F, -36.5F, -8F);
		turretModel[108].rotateAngleZ = -0.12786282F;

		turretModel[109].addShapeBox(16.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		turretModel[109].setRotationPoint(-4F, -36.5F, 7F);
		turretModel[109].rotateAngleZ = -0.12786282F;

		turretModel[110].addShapeBox(19.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 732
		turretModel[110].setRotationPoint(-4F, -36.5F, -8F);
		turretModel[110].rotateAngleZ = -0.12786282F;

		turretModel[111].addShapeBox(19.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 733
		turretModel[111].setRotationPoint(-4F, -36.5F, 7F);
		turretModel[111].rotateAngleZ = -0.12786282F;

		turretModel[112].addShapeBox(22.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		turretModel[112].setRotationPoint(-4F, -36.5F, -8F);
		turretModel[112].rotateAngleZ = -0.12786282F;

		turretModel[113].addShapeBox(22.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		turretModel[113].setRotationPoint(-4F, -36.5F, 7F);
		turretModel[113].rotateAngleZ = -0.12786282F;

		turretModel[114].addShapeBox(26.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 742
		turretModel[114].setRotationPoint(-4F, -36.5F, 4F);
		turretModel[114].rotateAngleZ = -0.12786282F;

		turretModel[115].addShapeBox(26.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 743
		turretModel[115].setRotationPoint(-4F, -36.5F, 1F);
		turretModel[115].rotateAngleZ = -0.12786282F;

		turretModel[116].addShapeBox(26.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		turretModel[116].setRotationPoint(-4F, -36.5F, -2F);
		turretModel[116].rotateAngleZ = -0.12786282F;

		turretModel[117].addShapeBox(26.7F, -0.9F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 745
		turretModel[117].setRotationPoint(-4F, -36.5F, -5F);
		turretModel[117].rotateAngleZ = -0.12786282F;

		turretModel[118].addShapeBox(10.5F, -1.7F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 746
		turretModel[118].setRotationPoint(-4F, -36.5F, 3.5F);
		turretModel[118].rotateAngleZ = -0.12786282F;

		turretModel[119].addShapeBox(10.5F, -1.7F, -1F, 4, 2, 1, 0F,-2F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		turretModel[119].setRotationPoint(-4F, -36.5F, 3.5F);
		turretModel[119].rotateAngleZ = -0.12786282F;

		turretModel[120].addShapeBox(10.5F, -1.7F, -1F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 748
		turretModel[120].setRotationPoint(-4F, -36.5F, 5.5F);
		turretModel[120].rotateAngleZ = -0.12786282F;

		turretModel[121].addShapeBox(22.5F, -1F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 749
		turretModel[121].setRotationPoint(-4F, -36.5F, 4F);
		turretModel[121].rotateAngleZ = -0.12786282F;

		turretModel[122].addShapeBox(22.5F, -1F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 750
		turretModel[122].setRotationPoint(-4F, -36.5F, 3F);
		turretModel[122].rotateAngleZ = -0.12786282F;

		turretModel[123].addShapeBox(22.5F, -1F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 751
		turretModel[123].setRotationPoint(-4F, -36.5F, 5F);
		turretModel[123].rotateAngleZ = -0.12786282F;

		turretModel[124].addTrapezoid(23F, -3F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_TOP); // Box 752
		turretModel[124].setRotationPoint(-4F, -36.5F, 3.5F);
		turretModel[124].rotateAngleZ = -0.12786282F;

		turretModel[125].addShapeBox(23F, -15F, 0F, 2, 12, 2, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 753
		turretModel[125].setRotationPoint(-4F, -36.5F, 3.5F);
		turretModel[125].rotateAngleZ = -0.12786282F;

		turretModel[126].addShapeBox(0F, 0F, 0F, 9, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 754
		turretModel[126].setRotationPoint(-34F, -38F, -13F);

		turretModel[127].addShapeBox(0F, 0F, 0F, 8, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, -8.6F, 0F, 0F, -8.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.6F, 0F, 0F, -8.6F, 0F, 0F, 0F); // Box 755
		turretModel[127].setRotationPoint(-25F, -38F, -13F);

		turretModel[128].addShapeBox(0F, 0F, 0F, 8, 2, 26, 0F,0F, 0F, -8.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.6F, 0F, 0F, -8.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.6F); // Box 756
		turretModel[128].setRotationPoint(-42F, -38F, -13F);

		turretModel[129].addShapeBox(0F, 0F, 0F, 9, 3, 26, 0F,-1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 757
		turretModel[129].setRotationPoint(-34F, -41F, -13F);

		turretModel[130].addShapeBox(0F, 0F, 0F, 8, 3, 26, 0F,1F, 0F, -2F, 0F, -2F, -9F, 0F, -2F, -9F, 1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -8.6F, 0F, 0F, -8.6F, 0F, 0F, 0F); // Box 758
		turretModel[130].setRotationPoint(-25F, -41F, -13F);

		turretModel[131].addShapeBox(0F, 0F, 0F, 8, 3, 26, 0F,-2F, 0F, -9.6F, 1F, 0F, -2F, 1F, 0F, -2F, -2F, 0F, -9.6F, 0F, 0F, -8.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8.6F); // Box 759
		turretModel[131].setRotationPoint(-42F, -41F, -13F);

		turretModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 760
		turretModel[132].setRotationPoint(-28F, -40.5F, -13F);

		turretModel[133].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 761
		turretModel[133].setRotationPoint(-38F, -42F, -7F);

		turretModel[134].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 762
		turretModel[134].setRotationPoint(-38F, -42F, 2F);

		turretModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		turretModel[135].setRotationPoint(-38F, -42F, -5F);

		turretModel[136].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		turretModel[136].setRotationPoint(-38F, -43F, -5F);

		turretModel[137].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2.5F, 0F, -2F, -2.5F, 0F, -2F, -2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		turretModel[137].setRotationPoint(-38F, -43F, -7F);

		turretModel[138].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2F, 0F, 1F, -2F, 0F, 1F, -2.5F, 0F, -2F, -2.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 766
		turretModel[138].setRotationPoint(-38F, -43F, 2F);

		turretModel[139].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 767
		turretModel[139].setRotationPoint(-31F, -43F, -3F);

		turretModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 768
		turretModel[140].setRotationPoint(-31F, -43F, 1F);
		turretModel[140].rotateAngleY = 0.33161256F;

		turretModel[141].addShapeBox(0F, 0F, -3F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 769
		turretModel[141].setRotationPoint(-31F, -43F, -4F);
		turretModel[141].rotateAngleY = -0.33161256F;

		turretModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 770
		turretModel[142].setRotationPoint(-20F, -40.8F, -1F);

		turretModel[143].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,-1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 771
		turretModel[143].setRotationPoint(-35F, -47F, 5F);

		turretModel[144].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,-1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 773
		turretModel[144].setRotationPoint(-35F, -47F, 8F);

		turretModel[145].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 774
		turretModel[145].setRotationPoint(-35F, -47F, 8.5F);

		turretModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 775
		turretModel[146].setRotationPoint(-35F, -45F, 9.5F);

		turretModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		turretModel[147].setRotationPoint(-35F, -47F, 9.5F);

		turretModel[148].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 776
		turretModel[148].setRotationPoint(-30F, -34.5F, 15.5F);

		turretModel[149].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 777
		turretModel[149].setRotationPoint(-32F, -34.5F, 15.5F);

		turretModel[150].addShapeBox(0F, 0F, 0F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 778
		turretModel[150].setRotationPoint(-28F, -34.5F, 15.5F);

		turretModel[151].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 779
		turretModel[151].setRotationPoint(-50F, -35.5F, -14F);

		turretModel[152].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 780
		turretModel[152].setRotationPoint(-50F, -31.5F, -14F);

		turretModel[153].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 781
		turretModel[153].setRotationPoint(-50F, -26.5F, -14F);

		turretModel[154].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 782
		turretModel[154].setRotationPoint(-50F, -34.5F, -14F);

		turretModel[155].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 783
		turretModel[155].setRotationPoint(-46F, -34.5F, -14F);

		turretModel[156].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F); // Box 784
		turretModel[156].setRotationPoint(-58F, -35.5F, -14F);

		turretModel[157].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F); // Box 785
		turretModel[157].setRotationPoint(-58F, -31.5F, -14F);

		turretModel[158].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 7F); // Box 786
		turretModel[158].setRotationPoint(-58F, -26.5F, -14F);

		turretModel[159].addShapeBox(-7F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 787
		turretModel[159].setRotationPoint(-50F, -34.5F, -14F);
		turretModel[159].rotateAngleY = -0.76794487F;

		turretModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 788
		turretModel[160].setRotationPoint(-58F, -35.5F, -6F);

		turretModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 789
		turretModel[161].setRotationPoint(-58F, -31.5F, -6F);

		turretModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 790
		turretModel[162].setRotationPoint(-58F, -26.5F, -6F);

		turretModel[163].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 791
		turretModel[163].setRotationPoint(-58F, -34.5F, -6F);

		turretModel[164].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 792
		turretModel[164].setRotationPoint(-58F, -34.5F, -0.5F);

		turretModel[165].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 793
		turretModel[165].setRotationPoint(-50F, -35.5F, 13F);

		turretModel[166].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 794
		turretModel[166].setRotationPoint(-50F, -31.5F, 13F);

		turretModel[167].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 795
		turretModel[167].setRotationPoint(-50F, -26.5F, 13F);

		turretModel[168].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 796
		turretModel[168].setRotationPoint(-50F, -34.5F, 13F);

		turretModel[169].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 797
		turretModel[169].setRotationPoint(-46F, -34.5F, 13F);

		turretModel[170].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 798
		turretModel[170].setRotationPoint(-58F, -35.5F, 13F);

		turretModel[171].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 799
		turretModel[171].setRotationPoint(-58F, -31.5F, 13F);

		turretModel[172].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -1F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 800
		turretModel[172].setRotationPoint(-58F, -26.5F, 13F);

		turretModel[173].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 801
		turretModel[173].setRotationPoint(-58F, -34.5F, 5F);

		turretModel[174].addShapeBox(-7F, 0F, -1F, 1, 8, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 802
		turretModel[174].setRotationPoint(-50F, -34.5F, 14F);
		turretModel[174].rotateAngleY = 0.76794487F;

		turretModel[175].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 803
		turretModel[175].setRotationPoint(-56F, -26.5F, -8F);

		turretModel[176].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 804
		turretModel[176].setRotationPoint(-57F, -26.5F, -3F);

		turretModel[177].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 805
		turretModel[177].setRotationPoint(-56F, -26.5F, 7F);

		turretModel[178].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 806
		turretModel[178].setRotationPoint(-57F, -26.5F, 2F);

		turretModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 807
		turretModel[179].setRotationPoint(-52F, -26.6F, -12F);

		turretModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 808
		turretModel[180].setRotationPoint(-56F, -26.6F, -8F);

		turretModel[181].addShapeBox(0F, 0F, 0F, 4, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		turretModel[181].setRotationPoint(26F, -31.5F, -7F);

		turretModel[182].addTrapezoid(0F, -3F, 0F, 2, 2, 2, 0F, -0.80F, ModelRendererTurbo.MR_TOP); // Box 842
		turretModel[182].setRotationPoint(-19F, -36.5F, 11F);

		turretModel[183].addShapeBox(-0.5F, -1F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 843
		turretModel[183].setRotationPoint(-19F, -36.5F, 12.5F);

		turretModel[184].addShapeBox(-0.5F, -1F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		turretModel[184].setRotationPoint(-19F, -36.5F, 11.5F);

		turretModel[185].addShapeBox(-0.5F, -1F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
		turretModel[185].setRotationPoint(-19F, -36.5F, 10.5F);

		turretModel[186].addShapeBox(0F, -15F, 0F, 2, 12, 2, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Box 846
		turretModel[186].setRotationPoint(-19F, -36.5F, 11F);

		turretModel[187].addShapeBox(0F, 0F, -1F, 1, 5, 1, 0F,0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 847
		turretModel[187].setRotationPoint(-34F, -46F, -7F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 200, 1779, textureX, textureY); // Box 810
		barrelModel[1] = new ModelRendererTurbo(this, 200, 1779, textureX, textureY); // Box 811
		barrelModel[2] = new ModelRendererTurbo(this, 200, 1776, textureX, textureY); // Box 812
		barrelModel[3] = new ModelRendererTurbo(this, 200, 1800, textureX, textureY); // Box 813
		barrelModel[4] = new ModelRendererTurbo(this, 200, 1824, textureX, textureY); // Box 814
		barrelModel[5] = new ModelRendererTurbo(this, 200, 1824, textureX, textureY); // Box 815
		barrelModel[6] = new ModelRendererTurbo(this, 200, 1835, textureX, textureY); // Box 816
		barrelModel[7] = new ModelRendererTurbo(this, 200, 1844, textureX, textureY); // Box 817
		barrelModel[8] = new ModelRendererTurbo(this, 200, 1851, textureX, textureY); // Box 819
		barrelModel[9] = new ModelRendererTurbo(this, 200, 1851, textureX, textureY); // Box 820
		barrelModel[10] = new ModelRendererTurbo(this, 200, 1851, textureX, textureY); // Box 821
		barrelModel[11] = new ModelRendererTurbo(this, 200, 1844, textureX, textureY); // Box 822
		barrelModel[12] = new ModelRendererTurbo(this, 200, 1860, textureX, textureY); // Box 823
		barrelModel[13] = new ModelRendererTurbo(this, 200, 1867, textureX, textureY); // Box 824
		barrelModel[14] = new ModelRendererTurbo(this, 200, 1867, textureX, textureY); // Box 825
		barrelModel[15] = new ModelRendererTurbo(this, 200, 1883, textureX, textureY); // Box 827
		barrelModel[16] = new ModelRendererTurbo(this, 200, 1890, textureX, textureY); // Box 828
		barrelModel[17] = new ModelRendererTurbo(this, 200, 1897, textureX, textureY); // Box 828
		barrelModel[18] = new ModelRendererTurbo(this, 200, 1897, textureX, textureY); // Box 829
		barrelModel[19] = new ModelRendererTurbo(this, 200, 1897, textureX, textureY); // Box 830
		barrelModel[20] = new ModelRendererTurbo(this, 200, 1900, textureX, textureY); // Box 831
		barrelModel[21] = new ModelRendererTurbo(this, 200, 1900, textureX, textureY); // Box 832
		barrelModel[22] = new ModelRendererTurbo(this, 200, 1900, textureX, textureY); // Box 833
		barrelModel[23] = new ModelRendererTurbo(this, 200, 1903, textureX, textureY); // Box 834
		barrelModel[24] = new ModelRendererTurbo(this, 200, 1909, textureX, textureY); // Box 835
		barrelModel[25] = new ModelRendererTurbo(this, 200, 1915, textureX, textureY); // Box 836
		barrelModel[26] = new ModelRendererTurbo(this, 200, 1919, textureX, textureY); // Box 837
		barrelModel[27] = new ModelRendererTurbo(this, 200, 1924, textureX, textureY); // Box 838
		barrelModel[28] = new ModelRendererTurbo(this, 200, 1929, textureX, textureY); // Box 839
		barrelModel[29] = new ModelRendererTurbo(this, 200, 1929, textureX, textureY); // Box 840
		barrelModel[30] = new ModelRendererTurbo(this, 200, 1929, textureX, textureY); // Box 841
		barrelModel[31] = new ModelRendererTurbo(this, 200, 1874, textureX, textureY); // Box 826

		barrelModel[0].addShapeBox(-2F, -4.5F, -8F, 3, 9, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		barrelModel[0].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[1].addShapeBox(-2F, -4.5F, 7F, 3, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 811
		barrelModel[1].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[2].addShapeBox(-2F, -4.5F, -7F, 3, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		barrelModel[2].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[3].addShapeBox(1F, -4.5F, -7F, 6, 9, 14, 0F,0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 813
		barrelModel[3].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[4].addShapeBox(1F, -4.5F, -8F, 6, 9, 1, 0F,0F, -1F, 0F, 0F, -2F, -4F, 0F, -1F, 5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 814
		barrelModel[4].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[5].addShapeBox(1F, -4.5F, 7F, 6, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 5F, 0F, -2F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, -1F, -4F, 0F, -1F, 0F); // Box 815
		barrelModel[5].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[6].addShapeBox(6F, -2.2F, -1.5F, 41, 5, 3, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 816
		barrelModel[6].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[7].addShapeBox(6F, -2.2F, -2.5F, 41, 5, 1, 0F,0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F); // Box 817
		barrelModel[7].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[8].addShapeBox(46F, -2.7F, -1F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 819
		barrelModel[8].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[9].addShapeBox(46F, -2.7F, 1F, 11, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 820
		barrelModel[9].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[10].addShapeBox(46F, -2.7F, -3F, 11, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 821
		barrelModel[10].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[11].addShapeBox(6F, -2.2F, 1.5F, 41, 5, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -1.5F, -0.5F, 0F, -1F, 0F); // Box 822
		barrelModel[11].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[12].addShapeBox(57F, -1.7F, -1F, 37, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 823
		barrelModel[12].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[13].addShapeBox(57F, -1.7F, -2F, 37, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 824
		barrelModel[13].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[14].addShapeBox(57F, -1.7F, 1F, 37, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 825
		barrelModel[14].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[15].addShapeBox(94F, -2.2F, -2.5F, 7, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 827
		barrelModel[15].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[16].addShapeBox(94F, -2.2F, 1.5F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 828
		barrelModel[16].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[17].addShapeBox(97F, -2.2F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 828
		barrelModel[17].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[18].addShapeBox(97F, -2.2F, -1.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 829
		barrelModel[18].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[19].addShapeBox(97F, -2.2F, 0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 830
		barrelModel[19].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[20].addShapeBox(97F, 1.8F, 0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 831
		barrelModel[20].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[21].addShapeBox(97F, 1.8F, -1.5F, 4, 1, 1, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 832
		barrelModel[21].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[22].addShapeBox(97F, 1.8F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 833
		barrelModel[22].setRotationPoint(30F, -27.5F, 0F);

		barrelModel[23].addShapeBox(-2F, -1F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 834
		barrelModel[23].setRotationPoint(-35F, -47F, 6F);

		barrelModel[24].addShapeBox(-3F, -1F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 835
		barrelModel[24].setRotationPoint(-35F, -47F, 6F);

		barrelModel[25].addShapeBox(-3.5F, -1F, -0.25F, 1, 1, 2, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 836
		barrelModel[25].setRotationPoint(-35F, -47F, 6F);

		barrelModel[26].addShapeBox(-4F, -1F, -0.25F, 1, 2, 2, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 837
		barrelModel[26].setRotationPoint(-35F, -47F, 6F);

		barrelModel[27].addShapeBox(1.5F, -1F, 0F, 1, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 838
		barrelModel[27].setRotationPoint(-35F, -47F, 6F);

		barrelModel[28].addShapeBox(2.5F, -0.5F, 0.75F, 10, 1, 1, 0F,0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F); // Box 839
		barrelModel[28].setRotationPoint(-35F, -47F, 6F);

		barrelModel[29].addShapeBox(2.5F, -0.5F, 0.75F, 10, 1, 1, 0F,0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, -0.67F, 0F); // Box 840
		barrelModel[29].setRotationPoint(-35F, -47F, 6F);

		barrelModel[30].addShapeBox(2.5F, -0.5F, 0.75F, 10, 1, 1, 0F,0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, -0.67F, 0F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F, 0F, 0F, -0.33F); // Box 841
		barrelModel[30].setRotationPoint(-35F, -47F, 6F);

		barrelModel[31].addShapeBox(94F, -2.2F, -1.5F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 826
		barrelModel[31].setRotationPoint(30F, -27.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape317
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape318
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape319
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape320
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape321
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape322
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape323
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 250, 1686, textureX, textureY); // Import Shape324
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Import Box335
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box337
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box338
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box340
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box341
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Import Box342
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Import Box280
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box281
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box282

		leftTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape317
		leftTrackWheelModels[0].setRotationPoint(-17F, 3F, 31.5F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape318
		leftTrackWheelModels[1].setRotationPoint(-1F, 3F, 31.5F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape319
		leftTrackWheelModels[2].setRotationPoint(16F, 3F, 31.5F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape320
		leftTrackWheelModels[3].setRotationPoint(30F, -7F, 31.5F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape321
		leftTrackWheelModels[4].setRotationPoint(-34F, 3F, 31.5F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape322
		leftTrackWheelModels[5].setRotationPoint(-51F, 3F, 31.5F);

		leftTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape323
		leftTrackWheelModels[6].setRotationPoint(-68F, 3F, 31.5F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 14, 12, 12, 40, 14, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape324
		leftTrackWheelModels[7].setRotationPoint(-82F, -8F, 33F);

		leftTrackWheelModels[8].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box335
		leftTrackWheelModels[8].setRotationPoint(-22F, -10.75F, 24.5F);

		leftTrackWheelModels[9].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box337
		leftTrackWheelModels[9].setRotationPoint(-22F, -10.75F, 24.5F);

		leftTrackWheelModels[10].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box338
		leftTrackWheelModels[10].setRotationPoint(-22F, -10.75F, 24.5F);

		leftTrackWheelModels[11].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box340
		leftTrackWheelModels[11].setRotationPoint(12F, -10.5F, 24.5F);

		leftTrackWheelModels[12].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box341
		leftTrackWheelModels[12].setRotationPoint(12F, -10.5F, 24.5F);

		leftTrackWheelModels[13].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box342
		leftTrackWheelModels[13].setRotationPoint(12F, -10.5F, 24.5F);

		leftTrackWheelModels[14].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box280
		leftTrackWheelModels[14].setRotationPoint(-53F, -11F, 24.5F);

		leftTrackWheelModels[15].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box281
		leftTrackWheelModels[15].setRotationPoint(-53F, -11F, 24.5F);

		leftTrackWheelModels[16].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box282
		leftTrackWheelModels[16].setRotationPoint(-53F, -11F, 24.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape325
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape326
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape327
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape328
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape329
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape330
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 250, 1664, textureX, textureY); // Import Shape331
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 250, 1686, textureX, textureY); // Import Shape332
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Import Box286
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box287
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box288
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box289
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box290
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Import Box291
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 250, 1714, textureX, textureY); // Import Box292
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box293
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 250, 1723, textureX, textureY); // Import Box294

		rightTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape325
		rightTrackWheelModels[0].setRotationPoint(-17F, 3F, -24.5F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape326
		rightTrackWheelModels[1].setRotationPoint(-1F, 3F, -24.5F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape327
		rightTrackWheelModels[2].setRotationPoint(16F, 3F, -24.5F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape328
		rightTrackWheelModels[3].setRotationPoint(30F, -7F, -24.5F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape329
		rightTrackWheelModels[4].setRotationPoint(-34F, 3F, -24.5F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape330
		rightTrackWheelModels[5].setRotationPoint(-51F, 3F, -24.5F);

		rightTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 7, 12, 12, 40, 7, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape331
		rightTrackWheelModels[6].setRotationPoint(-68F, 3F, -24.5F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 14, 12, 12, 40, 14, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import Shape332
		rightTrackWheelModels[7].setRotationPoint(-82F, -8F, -20F);

		rightTrackWheelModels[8].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box286
		rightTrackWheelModels[8].setRotationPoint(-22F, -10.75F, -29.5F);

		rightTrackWheelModels[9].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		rightTrackWheelModels[9].setRotationPoint(-22F, -10.75F, -29.5F);

		rightTrackWheelModels[10].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box288
		rightTrackWheelModels[10].setRotationPoint(-22F, -10.75F, -29.5F);

		rightTrackWheelModels[11].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box289
		rightTrackWheelModels[11].setRotationPoint(12F, -10.5F, -29.5F);

		rightTrackWheelModels[12].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		rightTrackWheelModels[12].setRotationPoint(12F, -10.5F, -29.5F);

		rightTrackWheelModels[13].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		rightTrackWheelModels[13].setRotationPoint(12F, -10.5F, -29.5F);

		rightTrackWheelModels[14].addShapeBox(-2.5F, -1.5F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box292
		rightTrackWheelModels[14].setRotationPoint(-53F, -11F, -29.5F);

		rightTrackWheelModels[15].addShapeBox(-2.5F, 1.5F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box293
		rightTrackWheelModels[15].setRotationPoint(-53F, -11F, -29.5F);

		rightTrackWheelModels[16].addShapeBox(-2.5F, -2.5F, 0F, 5, 1, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		rightTrackWheelModels[16].setRotationPoint(-53F, -11F, -29.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 450, 131, textureX, textureY); // Import Box314
		leftTrackModel[1] = new ModelRendererTurbo(this, 450, 151, textureX, textureY); // Import Box315
		leftTrackModel[2] = new ModelRendererTurbo(this, 450, 186, textureX, textureY); // Import Box316
		leftTrackModel[3] = new ModelRendererTurbo(this, 450, 291, textureX, textureY); // Import Box317
		leftTrackModel[4] = new ModelRendererTurbo(this, 450, 328, textureX, textureY); // Import Box318
		leftTrackModel[5] = new ModelRendererTurbo(this, 450, 349, textureX, textureY); // Import Box319
		leftTrackModel[6] = new ModelRendererTurbo(this, 450, 369, textureX, textureY); // Import Box320
		leftTrackModel[7] = new ModelRendererTurbo(this, 450, 501, textureX, textureY); // Import Box321

		leftTrackModel[0].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box314
		leftTrackModel[0].setRotationPoint(36F, -9F, 20.5F);

		leftTrackModel[1].addShapeBox(-1F, 0F, 0F, 1, 21, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box315
		leftTrackModel[1].setRotationPoint(37F, -3F, 20.5F);
		leftTrackModel[1].rotateAngleZ = -0.90408055F;

		leftTrackModel[2].addShapeBox(-1F, 0F, 0F, 1, 91, 13, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box316
		leftTrackModel[2].setRotationPoint(20F, 10F, 20.5F);
		leftTrackModel[2].rotateAngleZ = -1.57079633F;

		leftTrackModel[3].addShapeBox(-1F, 0F, 0F, 1, 23, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Import Box317
		leftTrackModel[3].setRotationPoint(-71F, 10F, 20.5F);
		leftTrackModel[3].rotateAngleZ = -2.23227611F;

		leftTrackModel[4].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		leftTrackModel[4].setRotationPoint(-89F, -4F, 20.5F);
		leftTrackModel[4].rotateAngleZ = -3.14159265F;

		leftTrackModel[5].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box319
		leftTrackModel[5].setRotationPoint(-89F, -10F, 20.5F);
		leftTrackModel[5].rotateAngleZ = -3.83972435F;

		leftTrackModel[6].addShapeBox(-1F, 0F, 0F, 1, 116, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F); // Import Box320
		leftTrackModel[6].setRotationPoint(-85F, -15F, 20.5F);
		leftTrackModel[6].rotateAngleZ = -4.71238898F;

		leftTrackModel[7].addShapeBox(-1F, 0F, 0F, 1, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import Box321
		leftTrackModel[7].setRotationPoint(32F, -14F, 20.5F);
		leftTrackModel[7].rotateAngleZ = -5.49778714F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 450, 131, textureX, textureY); // Import Box322
		rightTrackModel[1] = new ModelRendererTurbo(this, 450, 151, textureX, textureY); // Import Box323
		rightTrackModel[2] = new ModelRendererTurbo(this, 450, 186, textureX, textureY); // Import Box324
		rightTrackModel[3] = new ModelRendererTurbo(this, 450, 291, textureX, textureY); // Import Box325
		rightTrackModel[4] = new ModelRendererTurbo(this, 450, 328, textureX, textureY); // Import Box326
		rightTrackModel[5] = new ModelRendererTurbo(this, 450, 349, textureX, textureY); // Import Box327
		rightTrackModel[6] = new ModelRendererTurbo(this, 450, 369, textureX, textureY); // Import Box328
		rightTrackModel[7] = new ModelRendererTurbo(this, 450, 501, textureX, textureY); // Import Box329

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		rightTrackModel[0].setRotationPoint(36F, -9F, -33.5F);

		rightTrackModel[1].addShapeBox(-1F, 0F, 0F, 1, 21, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box323
		rightTrackModel[1].setRotationPoint(37F, -3F, -33.5F);
		rightTrackModel[1].rotateAngleZ = -0.90408055F;

		rightTrackModel[2].addShapeBox(-1F, 0F, 0F, 1, 91, 13, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box324
		rightTrackModel[2].setRotationPoint(20F, 10F, -33.5F);
		rightTrackModel[2].rotateAngleZ = -1.57079633F;

		rightTrackModel[3].addShapeBox(-1F, 0F, 0F, 1, 23, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Import Box325
		rightTrackModel[3].setRotationPoint(-71F, 10F, -33.5F);
		rightTrackModel[3].rotateAngleZ = -2.23227611F;

		rightTrackModel[4].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box326
		rightTrackModel[4].setRotationPoint(-89F, -4F, -33.5F);
		rightTrackModel[4].rotateAngleZ = -3.14159265F;

		rightTrackModel[5].addShapeBox(-1F, 0F, 0F, 1, 6, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box327
		rightTrackModel[5].setRotationPoint(-89F, -10F, -33.5F);
		rightTrackModel[5].rotateAngleZ = -3.83972435F;

		rightTrackModel[6].addShapeBox(-1F, 0F, 0F, 1, 116, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F); // Import Box328
		rightTrackModel[6].setRotationPoint(-85F, -15F, -33.5F);
		rightTrackModel[6].rotateAngleZ = -4.71238898F;

		rightTrackModel[7].addShapeBox(-1F, 0F, 0F, 1, 7, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F); // Import Box329
		rightTrackModel[7].setRotationPoint(32F, -14F, -33.5F);
		rightTrackModel[7].rotateAngleZ = -5.49778714F;
	}
}