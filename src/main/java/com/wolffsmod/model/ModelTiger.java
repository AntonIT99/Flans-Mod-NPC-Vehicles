//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tiger
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTiger extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelTiger()
	{
		tigerModel = new ModelRendererTurbo[467];
		tigerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		tigerModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box1
		tigerModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box2
		tigerModel[3] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box3
		tigerModel[4] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import Box4
		tigerModel[5] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box6
		tigerModel[6] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import Box7
		tigerModel[7] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import Box28
		tigerModel[8] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box30
		tigerModel[9] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box46
		tigerModel[10] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import Box89
		tigerModel[11] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box90
		tigerModel[12] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Import Box91
		tigerModel[13] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import Box92
		tigerModel[14] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box93
		tigerModel[15] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import Box94
		tigerModel[16] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import Box95
		tigerModel[17] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import Box96
		tigerModel[18] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Import Box97
		tigerModel[19] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import Box98
		tigerModel[20] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Import Box99
		tigerModel[21] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Import Box100
		tigerModel[22] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Import Box101
		tigerModel[23] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Import Box102
		tigerModel[24] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Import Box103
		tigerModel[25] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Import Box104
		tigerModel[26] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import Box105
		tigerModel[27] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Import Box106
		tigerModel[28] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import Box107
		tigerModel[29] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Import Box108
		tigerModel[30] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Import Box109
		tigerModel[31] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Import Box110
		tigerModel[32] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Import Box111
		tigerModel[33] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Import Box112
		tigerModel[34] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Import Box113
		tigerModel[35] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Import Box114
		tigerModel[36] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Import Box115
		tigerModel[37] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Import Box116
		tigerModel[38] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Import Box117
		tigerModel[39] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Import Box118
		tigerModel[40] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Import Box119
		tigerModel[41] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Import Box120
		tigerModel[42] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Import Box121
		tigerModel[43] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Import Box125
		tigerModel[44] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Import Box126
		tigerModel[45] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Import Box127
		tigerModel[46] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Import Box128
		tigerModel[47] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Import Box129
		tigerModel[48] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Import Box130
		tigerModel[49] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box131
		tigerModel[50] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Import Box132
		tigerModel[51] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Import Box133
		tigerModel[52] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Import Box134
		tigerModel[53] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Import Box135
		tigerModel[54] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Import Box136
		tigerModel[55] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Import Box137
		tigerModel[56] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Import Box138
		tigerModel[57] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Import Box139
		tigerModel[58] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box140
		tigerModel[59] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Import Box141
		tigerModel[60] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Import Box142
		tigerModel[61] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Import Box143
		tigerModel[62] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Import Box144
		tigerModel[63] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Import Box145
		tigerModel[64] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Import Box146
		tigerModel[65] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Import Box147
		tigerModel[66] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Import Box148
		tigerModel[67] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Import Box149
		tigerModel[68] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Import Box150
		tigerModel[69] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import Box151
		tigerModel[70] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Import Box152
		tigerModel[71] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Import Box153
		tigerModel[72] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Import Box154
		tigerModel[73] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Import Box155
		tigerModel[74] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Import Box156
		tigerModel[75] = new ModelRendererTurbo(this, 246, 263, textureX, textureY); // Import Box157
		tigerModel[76] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Import Box158
		tigerModel[77] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Import Box159
		tigerModel[78] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Import Box160
		tigerModel[79] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Box161
		tigerModel[80] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Import Box162
		tigerModel[81] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Import Box163
		tigerModel[82] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Import Box164
		tigerModel[83] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Import Box165
		tigerModel[84] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Import Box166
		tigerModel[85] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Import Box167
		tigerModel[86] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Import Box168
		tigerModel[87] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Import Box169
		tigerModel[88] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import Box170
		tigerModel[89] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box171
		tigerModel[90] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box172
		tigerModel[91] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Import Box173
		tigerModel[92] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box174
		tigerModel[93] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import Box175
		tigerModel[94] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Box179
		tigerModel[95] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import Box182
		tigerModel[96] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Import Box184
		tigerModel[97] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box185
		tigerModel[98] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Import Box186
		tigerModel[99] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box187
		tigerModel[100] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Import Box188
		tigerModel[101] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box189
		tigerModel[102] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Import Box190
		tigerModel[103] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box191
		tigerModel[104] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box192
		tigerModel[105] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Import Box193
		tigerModel[106] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Import Box198
		tigerModel[107] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Import Box199
		tigerModel[108] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Import Box193
		tigerModel[109] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box194
		tigerModel[110] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box195
		tigerModel[111] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import Box199
		tigerModel[112] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Import Box200
		tigerModel[113] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Import Box201
		tigerModel[114] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Import Box202
		tigerModel[115] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import Box206
		tigerModel[116] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import Box212
		tigerModel[117] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Import Box213
		tigerModel[118] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Import Box214
		tigerModel[119] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Import Box215
		tigerModel[120] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Import Box216
		tigerModel[121] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Import Box217
		tigerModel[122] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box218
		tigerModel[123] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Import Box219
		tigerModel[124] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Import Box220
		tigerModel[125] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Import Box221
		tigerModel[126] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Import Box222
		tigerModel[127] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Import Box223
		tigerModel[128] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Import Box224
		tigerModel[129] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import Box225
		tigerModel[130] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import Box226
		tigerModel[131] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Import Box227
		tigerModel[132] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Import Box228
		tigerModel[133] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Import Box229
		tigerModel[134] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Import Box230
		tigerModel[135] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Import Box231
		tigerModel[136] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Import Box232
		tigerModel[137] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Import Box233
		tigerModel[138] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Import Box234
		tigerModel[139] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Import Box235
		tigerModel[140] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Import Box236
		tigerModel[141] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Import Box237
		tigerModel[142] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Import Box238
		tigerModel[143] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Import Box239
		tigerModel[144] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Import Box240
		tigerModel[145] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Import Box241
		tigerModel[146] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Import Box242
		tigerModel[147] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import Box243
		tigerModel[148] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Import Box244
		tigerModel[149] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Import Box245
		tigerModel[150] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Import Box246
		tigerModel[151] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Import Box247
		tigerModel[152] = new ModelRendererTurbo(this, 305, 297, textureX, textureY); // Import Box248
		tigerModel[153] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Import Box249
		tigerModel[154] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import Box250
		tigerModel[155] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import Box252
		tigerModel[156] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box253
		tigerModel[157] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Import Box254
		tigerModel[158] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Import Box255
		tigerModel[159] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Import Box256
		tigerModel[160] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Import Box257
		tigerModel[161] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Import Box258
		tigerModel[162] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Import Box259
		tigerModel[163] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box260
		tigerModel[164] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box261
		tigerModel[165] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box262
		tigerModel[166] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box263
		tigerModel[167] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box264
		tigerModel[168] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import Box265
		tigerModel[169] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box1
		tigerModel[170] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box2
		tigerModel[171] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box3
		tigerModel[172] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box4
		tigerModel[173] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box5
		tigerModel[174] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box6
		tigerModel[175] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box7
		tigerModel[176] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box8
		tigerModel[177] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box9
		tigerModel[178] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box10
		tigerModel[179] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box11
		tigerModel[180] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box12
		tigerModel[181] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box13
		tigerModel[182] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box14
		tigerModel[183] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box15
		tigerModel[184] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box16
		tigerModel[185] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box17
		tigerModel[186] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box18
		tigerModel[187] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box19
		tigerModel[188] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box25
		tigerModel[189] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box48
		tigerModel[190] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box49
		tigerModel[191] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box50
		tigerModel[192] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box51
		tigerModel[193] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box52
		tigerModel[194] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box53
		tigerModel[195] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box54
		tigerModel[196] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box55
		tigerModel[197] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box56
		tigerModel[198] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box57
		tigerModel[199] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box58
		tigerModel[200] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box59
		tigerModel[201] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box60
		tigerModel[202] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box61
		tigerModel[203] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box62
		tigerModel[204] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box63
		tigerModel[205] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box64
		tigerModel[206] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box65
		tigerModel[207] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box66
		tigerModel[208] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box67
		tigerModel[209] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box68
		tigerModel[210] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box69
		tigerModel[211] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box70
		tigerModel[212] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box71
		tigerModel[213] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box72
		tigerModel[214] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box73
		tigerModel[215] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box74
		tigerModel[216] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box75
		tigerModel[217] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box76
		tigerModel[218] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box77
		tigerModel[219] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box78
		tigerModel[220] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box79
		tigerModel[221] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box80
		tigerModel[222] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box81
		tigerModel[223] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box82
		tigerModel[224] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box83
		tigerModel[225] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box84
		tigerModel[226] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box85
		tigerModel[227] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box86
		tigerModel[228] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box87
		tigerModel[229] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box88
		tigerModel[230] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box89
		tigerModel[231] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box90
		tigerModel[232] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box91
		tigerModel[233] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box92
		tigerModel[234] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box93
		tigerModel[235] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box94
		tigerModel[236] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box95
		tigerModel[237] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box96
		tigerModel[238] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box97
		tigerModel[239] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box98
		tigerModel[240] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box99
		tigerModel[241] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box100
		tigerModel[242] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box101
		tigerModel[243] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box102
		tigerModel[244] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box103
		tigerModel[245] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box104
		tigerModel[246] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box105
		tigerModel[247] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box106
		tigerModel[248] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box107
		tigerModel[249] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box108
		tigerModel[250] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box109
		tigerModel[251] = new ModelRendererTurbo(this, 150, 350, textureX, textureY); // Import Box9
		tigerModel[252] = new ModelRendererTurbo(this, 90, 350, textureX, textureY); // Import Box10
		tigerModel[253] = new ModelRendererTurbo(this, 80, 350, textureX, textureY); // Import Box11
		tigerModel[254] = new ModelRendererTurbo(this, 150, 360, textureX, textureY); // Import Box12
		tigerModel[255] = new ModelRendererTurbo(this, 150, 350, textureX, textureY); // Import Box233
		tigerModel[256] = new ModelRendererTurbo(this, 90, 350, textureX, textureY); // Import Box234
		tigerModel[257] = new ModelRendererTurbo(this, 90, 350, textureX, textureY); // Import Box235
		tigerModel[258] = new ModelRendererTurbo(this, 150, 360, textureX, textureY); // Import Box236
		tigerModel[259] = new ModelRendererTurbo(this, 100, 365, textureX, textureY); // Import Box237
		tigerModel[260] = new ModelRendererTurbo(this, 100, 350, textureX, textureY); // Import Box238
		tigerModel[261] = new ModelRendererTurbo(this, 25, 400, textureX, textureY); // Import Box1
		tigerModel[262] = new ModelRendererTurbo(this, 100, 350, textureX, textureY); // Import Box261
		tigerModel[263] = new ModelRendererTurbo(this, 100, 350, textureX, textureY); // Import Box262
		tigerModel[264] = new ModelRendererTurbo(this, 100, 350, textureX, textureY); // Import Box263
		tigerModel[265] = new ModelRendererTurbo(this, 100, 350, textureX, textureY); // Import Box264
		tigerModel[266] = new ModelRendererTurbo(this, 100, 350, textureX, textureY); // Import Box265
		tigerModel[267] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box266
		tigerModel[268] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box268
		tigerModel[269] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box269
		tigerModel[270] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box271
		tigerModel[271] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box272
		tigerModel[272] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box278
		tigerModel[273] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box279
		tigerModel[274] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box280
		tigerModel[275] = new ModelRendererTurbo(this, 0, 372, textureX, textureY); // Import Box281
		tigerModel[276] = new ModelRendererTurbo(this, 0, 372, textureX, textureY); // Import Box282
		tigerModel[277] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box283
		tigerModel[278] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box284
		tigerModel[279] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box285
		tigerModel[280] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box286
		tigerModel[281] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box287
		tigerModel[282] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box288
		tigerModel[283] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box2
		tigerModel[284] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box3
		tigerModel[285] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box4
		tigerModel[286] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box5
		tigerModel[287] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box6
		tigerModel[288] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box7
		tigerModel[289] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box8
		tigerModel[290] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box9
		tigerModel[291] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box10
		tigerModel[292] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box11
		tigerModel[293] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box12
		tigerModel[294] = new ModelRendererTurbo(this, 0, 380, textureX, textureY); // Import Box13
		tigerModel[295] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Box14
		tigerModel[296] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import Box15
		tigerModel[297] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Box16
		tigerModel[298] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import Box17
		tigerModel[299] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box20
		tigerModel[300] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box21
		tigerModel[301] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box22
		tigerModel[302] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box23
		tigerModel[303] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box24
		tigerModel[304] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box25
		tigerModel[305] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import Box26
		tigerModel[306] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Box27
		tigerModel[307] = new ModelRendererTurbo(this, 0, 355, textureX, textureY); // Import Box28
		tigerModel[308] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box29
		tigerModel[309] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box30
		tigerModel[310] = new ModelRendererTurbo(this, 0, 330, textureX, textureY); // Import Box31
		tigerModel[311] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Import Box8
		tigerModel[312] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box9
		tigerModel[313] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Import Box10
		tigerModel[314] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box12
		tigerModel[315] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box13
		tigerModel[316] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box15
		tigerModel[317] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box16
		tigerModel[318] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box32
		tigerModel[319] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box33
		tigerModel[320] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box34
		tigerModel[321] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import Box37
		tigerModel[322] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box38
		tigerModel[323] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Import Box39
		tigerModel[324] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Import Box40
		tigerModel[325] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Import Box41
		tigerModel[326] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box42
		tigerModel[327] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box43
		tigerModel[328] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Import Box44
		tigerModel[329] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box45
		tigerModel[330] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Import Box39
		tigerModel[331] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box40
		tigerModel[332] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box41
		tigerModel[333] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box42
		tigerModel[334] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box43
		tigerModel[335] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import Box44
		tigerModel[336] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box45
		tigerModel[337] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box46
		tigerModel[338] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box47
		tigerModel[339] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import Box178
		tigerModel[340] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box1
		tigerModel[341] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box1
		tigerModel[342] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box1
		tigerModel[343] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box1
		tigerModel[344] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box1
		tigerModel[345] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box1
		tigerModel[346] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box1
		tigerModel[347] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box1
		tigerModel[348] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box1
		tigerModel[349] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box1
		tigerModel[350] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box1
		tigerModel[351] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box1
		tigerModel[352] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box1
		tigerModel[353] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box1
		tigerModel[354] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box1
		tigerModel[355] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box1
		tigerModel[356] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box1
		tigerModel[357] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box1
		tigerModel[358] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box1
		tigerModel[359] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box1
		tigerModel[360] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box20
		tigerModel[361] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box21
		tigerModel[362] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box22
		tigerModel[363] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box23
		tigerModel[364] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box24
		tigerModel[365] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box25
		tigerModel[366] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box199
		tigerModel[367] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box200
		tigerModel[368] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box201
		tigerModel[369] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box202
		tigerModel[370] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box203
		tigerModel[371] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box204
		tigerModel[372] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box205
		tigerModel[373] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box206
		tigerModel[374] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box207
		tigerModel[375] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box208
		tigerModel[376] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box209
		tigerModel[377] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box210
		tigerModel[378] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box211
		tigerModel[379] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box212
		tigerModel[380] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box213
		tigerModel[381] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box214
		tigerModel[382] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box215
		tigerModel[383] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box216
		tigerModel[384] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box217
		tigerModel[385] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box218
		tigerModel[386] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box219
		tigerModel[387] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box221
		tigerModel[388] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box222
		tigerModel[389] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box226
		tigerModel[390] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box245
		tigerModel[391] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box246
		tigerModel[392] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box247
		tigerModel[393] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box248
		tigerModel[394] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box249
		tigerModel[395] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box250
		tigerModel[396] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box251
		tigerModel[397] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box252
		tigerModel[398] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box253
		tigerModel[399] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box254
		tigerModel[400] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box0
		tigerModel[401] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box1
		tigerModel[402] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box40
		tigerModel[403] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box41
		tigerModel[404] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box42
		tigerModel[405] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box43
		tigerModel[406] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box44
		tigerModel[407] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box45
		tigerModel[408] = new ModelRendererTurbo(this, 35, 330, textureX, textureY); // Import Box46
		tigerModel[409] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box47
		tigerModel[410] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box48
		tigerModel[411] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box49
		tigerModel[412] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import Box17
		tigerModel[413] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box19
		tigerModel[414] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box20
		tigerModel[415] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box21
		tigerModel[416] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box22
		tigerModel[417] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import Box23
		tigerModel[418] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box24
		tigerModel[419] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box26
		tigerModel[420] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box27
		tigerModel[421] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import Box48
		tigerModel[422] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box49
		tigerModel[423] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box50
		tigerModel[424] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Import Box70
		tigerModel[425] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Import Box71
		tigerModel[426] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box72
		tigerModel[427] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Import Box73
		tigerModel[428] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Import Box74
		tigerModel[429] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Import Box75
		tigerModel[430] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Import Box76
		tigerModel[431] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Import Box77
		tigerModel[432] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box78
		tigerModel[433] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Import Box79
		tigerModel[434] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Import Box80
		tigerModel[435] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Import Box81
		tigerModel[436] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Import Box82
		tigerModel[437] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Import Box83
		tigerModel[438] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Import Box84
		tigerModel[439] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Import Box87
		tigerModel[440] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Import Box267
		tigerModel[441] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Import Box268
		tigerModel[442] = new ModelRendererTurbo(this, 217, 305, textureX, textureY); // Import Box269
		tigerModel[443] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Import Box51
		tigerModel[444] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import Box52
		tigerModel[445] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Import Box53
		tigerModel[446] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box54
		tigerModel[447] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Import Box55
		tigerModel[448] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import Box56
		tigerModel[449] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import Box57
		tigerModel[450] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Import Box58
		tigerModel[451] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Import Box59
		tigerModel[452] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box60
		tigerModel[453] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Import Box61
		tigerModel[454] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import Box62
		tigerModel[455] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import Box63
		tigerModel[456] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Import Box64
		tigerModel[457] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Import Box65
		tigerModel[458] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Import Box66
		tigerModel[459] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Import Box67
		tigerModel[460] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Import Box68
		tigerModel[461] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Import Box69
		tigerModel[462] = new ModelRendererTurbo(this, 25, 400, textureX, textureY); // Import Box17
		tigerModel[463] = new ModelRendererTurbo(this, 25, 415, textureX, textureY); // Import Box18
		tigerModel[464] = new ModelRendererTurbo(this, 25, 400, textureX, textureY); // Import Box19
		tigerModel[465] = new ModelRendererTurbo(this, 25, 400, textureX, textureY); // Import Box21
		tigerModel[466] = new ModelRendererTurbo(this, 25, 400, textureX, textureY); // Import Box0

		tigerModel[0].addShapeBox(0F, 0F, 0F, 90, 14, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		tigerModel[0].setRotationPoint(-48F, -14F, -19F);

		tigerModel[1].addShapeBox(0F, 0F, 0F, 85, 7, 56, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[1].setRotationPoint(-48F, -21F, -28F);

		tigerModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 60, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import Box2
		tigerModel[2].setRotationPoint(42F, -14F, -30F);
		tigerModel[2].rotateAngleZ = 0.2443461F;

		tigerModel[3].addBox(0F, 0F, 0F, 90, 1, 10, 0F); // Import Box3
		tigerModel[3].setRotationPoint(-48F, -14F, 18F);

		tigerModel[4].addBox(0F, 0F, 0F, 90, 1, 10, 0F); // Import Box4
		tigerModel[4].setRotationPoint(-48F, -14F, -28F);

		tigerModel[5].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Import Box6
		tigerModel[5].setRotationPoint(39F, -14.9F, 18F);
		tigerModel[5].rotateAngleZ = 0.2443461F;

		tigerModel[6].addShapeBox(0F, 0F, 0F, 10, 14, 38, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		tigerModel[6].setRotationPoint(42F, -14F, -19F);

		tigerModel[7].addShapeBox(0F, 0F, 0F, 88, 5, 3, 0F, 0.4F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -3F, 0.4F, 0F, -3F, 00F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 2F, 0.2F); // Import Box28
		tigerModel[7].setRotationPoint(-48F, -16F, 28F);

		tigerModel[8].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Import Box30
		tigerModel[8].setRotationPoint(39F, -14.9F, -30F);
		tigerModel[8].rotateAngleZ = 0.2443461F;

		tigerModel[9].addShapeBox(0F, 0F, 0F, 1, 8, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Import Box46
		tigerModel[9].setRotationPoint(36.5F, -21.5F, -28F);

		tigerModel[10].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box89
		tigerModel[10].setRotationPoint(1F, -3F, 28F);

		tigerModel[11].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		tigerModel[11].setRotationPoint(1F, -6F, 28F);

		tigerModel[12].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box91
		tigerModel[12].setRotationPoint(1F, 4F, 28F);

		tigerModel[13].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		tigerModel[13].setRotationPoint(20F, -6F, 28F);

		tigerModel[14].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box93
		tigerModel[14].setRotationPoint(20F, -3F, 28F);

		tigerModel[15].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box94
		tigerModel[15].setRotationPoint(20F, 4F, 28F);

		tigerModel[16].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		tigerModel[16].setRotationPoint(-18F, -6F, 28F);

		tigerModel[17].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		tigerModel[17].setRotationPoint(-37F, -6F, 28F);

		tigerModel[18].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box97
		tigerModel[18].setRotationPoint(-37F, -3F, 28F);

		tigerModel[19].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box98
		tigerModel[19].setRotationPoint(-37F, 4F, 28F);

		tigerModel[20].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box99
		tigerModel[20].setRotationPoint(-18F, 4F, 28F);

		tigerModel[21].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box100
		tigerModel[21].setRotationPoint(-18F, -3F, 28F);

		tigerModel[22].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		tigerModel[22].setRotationPoint(20F, -6F, 20F);

		tigerModel[23].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box102
		tigerModel[23].setRotationPoint(20F, -3F, 20F);

		tigerModel[24].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box103
		tigerModel[24].setRotationPoint(20F, 4F, 20F);

		tigerModel[25].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box104
		tigerModel[25].setRotationPoint(1F, 4F, 20F);

		tigerModel[26].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box105
		tigerModel[26].setRotationPoint(1F, -3F, 20F);

		tigerModel[27].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		tigerModel[27].setRotationPoint(1F, -6F, 20F);

		tigerModel[28].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		tigerModel[28].setRotationPoint(-18F, -6F, 20F);

		tigerModel[29].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box108
		tigerModel[29].setRotationPoint(-18F, -3F, 20F);

		tigerModel[30].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box109
		tigerModel[30].setRotationPoint(-18F, 4F, 20F);

		tigerModel[31].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box110
		tigerModel[31].setRotationPoint(-37F, 4F, 20F);

		tigerModel[32].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box111
		tigerModel[32].setRotationPoint(-37F, -3F, 20F);

		tigerModel[33].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		tigerModel[33].setRotationPoint(-37F, -6F, 20F);

		tigerModel[34].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		tigerModel[34].setRotationPoint(10.5F, -6F, 23F);

		tigerModel[35].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box114
		tigerModel[35].setRotationPoint(10.5F, -3F, 23F);

		tigerModel[36].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box115
		tigerModel[36].setRotationPoint(10.5F, 4F, 23F);

		tigerModel[37].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box116
		tigerModel[37].setRotationPoint(-8.5F, 4F, 23F);

		tigerModel[38].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box117
		tigerModel[38].setRotationPoint(-8.5F, -3F, 23F);

		tigerModel[39].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		tigerModel[39].setRotationPoint(-8.5F, -6F, 23F);

		tigerModel[40].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		tigerModel[40].setRotationPoint(-27.5F, -6F, 23F);

		tigerModel[41].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box120
		tigerModel[41].setRotationPoint(-27.5F, -3F, 23F);

		tigerModel[42].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box121
		tigerModel[42].setRotationPoint(-27.5F, 4F, 23F);

		tigerModel[43].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		tigerModel[43].setRotationPoint(-49F, -7F, 22F);

		tigerModel[44].addBox(0F, 0F, 0F, 11, 7, 6, 0F); // Import Box126
		tigerModel[44].setRotationPoint(-49F, -5F, 22F);

		tigerModel[45].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box127
		tigerModel[45].setRotationPoint(-49F, 2F, 22F);

		tigerModel[46].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		tigerModel[46].setRotationPoint(-35F, -6F, -22F);

		tigerModel[47].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box129
		tigerModel[47].setRotationPoint(-35F, -3F, -22F);

		tigerModel[48].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box130
		tigerModel[48].setRotationPoint(-35F, 4F, -22F);

		tigerModel[49].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box131
		tigerModel[49].setRotationPoint(3F, 4F, -22F);

		tigerModel[50].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box132
		tigerModel[50].setRotationPoint(3F, -3F, -22F);

		tigerModel[51].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box133
		tigerModel[51].setRotationPoint(-16F, 4F, -22F);

		tigerModel[52].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box134
		tigerModel[52].setRotationPoint(-16F, -3F, -22F);

		tigerModel[53].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box135
		tigerModel[53].setRotationPoint(22F, 4F, -22F);

		tigerModel[54].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box136
		tigerModel[54].setRotationPoint(22F, -3F, -22F);

		tigerModel[55].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box137
		tigerModel[55].setRotationPoint(-35F, 4F, -30F);

		tigerModel[56].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		tigerModel[56].setRotationPoint(-35F, -6F, -30F);

		tigerModel[57].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box139
		tigerModel[57].setRotationPoint(-35F, -3F, -30F);

		tigerModel[58].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		tigerModel[58].setRotationPoint(-25.5F, -6F, -27F);

		tigerModel[59].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box141
		tigerModel[59].setRotationPoint(-25.5F, -3F, -27F);

		tigerModel[60].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box142
		tigerModel[60].setRotationPoint(-25.5F, 4F, -27F);

		tigerModel[61].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box143
		tigerModel[61].setRotationPoint(-16F, 4F, -30F);

		tigerModel[62].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box144
		tigerModel[62].setRotationPoint(-16F, -3F, -30F);

		tigerModel[63].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		tigerModel[63].setRotationPoint(-16F, -6F, -30F);

		tigerModel[64].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		tigerModel[64].setRotationPoint(-6.5F, -6F, -27F);

		tigerModel[65].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box147
		tigerModel[65].setRotationPoint(-6.5F, -3F, -27F);

		tigerModel[66].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box148
		tigerModel[66].setRotationPoint(-6.5F, 4F, -27F);

		tigerModel[67].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box149
		tigerModel[67].setRotationPoint(3F, 4F, -30F);

		tigerModel[68].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box150
		tigerModel[68].setRotationPoint(3F, -3F, -30F);

		tigerModel[69].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		tigerModel[69].setRotationPoint(3F, -6F, -30F);

		tigerModel[70].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		tigerModel[70].setRotationPoint(12.5F, -6F, -27F);

		tigerModel[71].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box153
		tigerModel[71].setRotationPoint(12.5F, -3F, -27F);

		tigerModel[72].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box154
		tigerModel[72].setRotationPoint(12.5F, 4F, -27F);

		tigerModel[73].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box155
		tigerModel[73].setRotationPoint(22F, 4F, -30F);

		tigerModel[74].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box156
		tigerModel[74].setRotationPoint(22F, -3F, -30F);

		tigerModel[75].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		tigerModel[75].setRotationPoint(22F, -6F, -30F);

		tigerModel[76].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		tigerModel[76].setRotationPoint(22F, -6F, -22F);

		tigerModel[77].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		tigerModel[77].setRotationPoint(3F, -6F, -22F);

		tigerModel[78].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		tigerModel[78].setRotationPoint(-16F, -6F, -22F);

		tigerModel[79].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		tigerModel[79].setRotationPoint(-49F, -7F, -28F);

		tigerModel[80].addBox(0F, 0F, 0F, 11, 7, 6, 0F); // Import Box162
		tigerModel[80].setRotationPoint(-49F, -5F, -28F);

		tigerModel[81].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box163
		tigerModel[81].setRotationPoint(-49F, 2F, -28F);

		tigerModel[82].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		tigerModel[82].setRotationPoint(35F, -9F, 20F);

		tigerModel[83].addBox(0F, 0F, 0F, 13, 7, 9, 0F); // Import Box165
		tigerModel[83].setRotationPoint(35F, -6F, 20F);

		tigerModel[84].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box166
		tigerModel[84].setRotationPoint(35F, 1F, 20F);

		tigerModel[85].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		tigerModel[85].setRotationPoint(35F, -9F, -29F);

		tigerModel[86].addBox(0F, 0F, 0F, 13, 7, 9, 0F); // Import Box168
		tigerModel[86].setRotationPoint(35F, -6F, -29F);

		tigerModel[87].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box169
		tigerModel[87].setRotationPoint(35F, 1F, -29F);

		tigerModel[88].addBox(0F, 0F, 0F, 2, 5, 5, 0F); // Import Box170
		tigerModel[88].setRotationPoint(38F, -20F, -14F);

		tigerModel[89].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		tigerModel[89].setRotationPoint(40F, -19.5F, -13.5F);

		tigerModel[90].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		tigerModel[90].setRotationPoint(41F, -18F, -12F);

		tigerModel[91].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Import Box173
		tigerModel[91].setRotationPoint(38F, -20F, 5F);

		tigerModel[92].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Import Box174
		tigerModel[92].setRotationPoint(39F, -16F, 5F);

		tigerModel[93].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Import Box175
		tigerModel[93].setRotationPoint(37F, -21F, 7F);
		tigerModel[93].rotateAngleZ = 0.29670597F;

		tigerModel[94].addShapeBox(0F, 0F, 0F, 2, 16, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box179
		tigerModel[94].setRotationPoint(-55F, -22F, 3F);
		tigerModel[94].rotateAngleZ = -0.12217305F;

		tigerModel[95].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Import Box182
		tigerModel[95].setRotationPoint(-53F, -22.3F, 3F);
		tigerModel[95].rotateAngleZ = -0.12217305F;

		tigerModel[96].addShapeBox(0F, 0F, 0F, 2, 16, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box184
		tigerModel[96].setRotationPoint(-55F, -22F, -11F);
		tigerModel[96].rotateAngleZ = -0.12217305F;

		tigerModel[97].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Import Box185
		tigerModel[97].setRotationPoint(-53F, -22.3F, 10F);
		tigerModel[97].rotateAngleZ = -0.12217305F;

		tigerModel[98].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Import Box186
		tigerModel[98].setRotationPoint(-53F, -22.3F, -11F);
		tigerModel[98].rotateAngleZ = -0.12217305F;

		tigerModel[99].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Import Box187
		tigerModel[99].setRotationPoint(-53F, -22.3F, -4F);
		tigerModel[99].rotateAngleZ = -0.12217305F;

		tigerModel[100].addBox(0F, 0F, 0F, 4, 16, 4, 0F); // Import Box188
		tigerModel[100].setRotationPoint(-53F, -24F, 5F);
		tigerModel[100].rotateAngleZ = -0.12217305F;

		tigerModel[101].addBox(0F, 0F, 0F, 4, 16, 4, 0F); // Import Box189
		tigerModel[101].setRotationPoint(-53F, -24F, -9F);
		tigerModel[101].rotateAngleZ = -0.12217305F;

		tigerModel[102].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import Box190
		tigerModel[102].setRotationPoint(-51F, -22F, 24F);

		tigerModel[103].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box191
		tigerModel[103].setRotationPoint(-51F, -18F, 24F);

		tigerModel[104].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box192
		tigerModel[104].setRotationPoint(-51F, -18F, 19.5F);

		tigerModel[105].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import Box193
		tigerModel[105].setRotationPoint(-51F, -22F, 19.5F);

		tigerModel[106].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Import Box198
		tigerModel[106].setRotationPoint(-52F, -7.5F, 18F);
		tigerModel[106].rotateAngleZ = -0.97738438F;

		tigerModel[107].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Import Box199
		tigerModel[107].setRotationPoint(-52F, -7.5F, -29F);
		tigerModel[107].rotateAngleZ = -0.97738438F;

		tigerModel[108].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box193
		tigerModel[108].setRotationPoint(-49F, -24F, 14F);

		tigerModel[109].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box194
		tigerModel[109].setRotationPoint(-49F, -23F, 13F);

		tigerModel[110].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		tigerModel[110].setRotationPoint(-50F, -21F, 15.5F);

		tigerModel[111].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box199
		tigerModel[111].setRotationPoint(-41F, -23F, -4F);

		tigerModel[112].addBox(0F, 0F, 0F, 6, 2, 8, 0F); // Import Box200
		tigerModel[112].setRotationPoint(-40F, -23F, -4F);

		tigerModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box201
		tigerModel[113].setRotationPoint(-34F, -23F, -4F);

		tigerModel[114].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, -1.5F, 4.5F, 0F, -1.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box202
		tigerModel[114].setRotationPoint(-32F, -23.5F, 4.5F);

		tigerModel[115].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box206
		tigerModel[115].setRotationPoint(-49F, -23F, 18F);

		tigerModel[116].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import Box212
		tigerModel[116].setRotationPoint(-51F, -22F, -28F);

		tigerModel[117].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import Box213
		tigerModel[117].setRotationPoint(-51F, -22F, -23.5F);

		tigerModel[118].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box214
		tigerModel[118].setRotationPoint(-51F, -18F, -28F);

		tigerModel[119].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box215
		tigerModel[119].setRotationPoint(-51F, -18F, -23.5F);

		tigerModel[120].addBox(0F, 0F, 0F, 7, 1, 15, 0F); // Import Box216
		tigerModel[120].setRotationPoint(-45F, -22.1F, 11F);

		tigerModel[121].addBox(0F, 0F, 0F, 11, 1, 15, 0F); // Import Box217
		tigerModel[121].setRotationPoint(-35F, -22.1F, 11F);

		tigerModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, -1F, -3F, 2F); // Import Box218
		tigerModel[122].setRotationPoint(-50F, -21F, -19.5F);

		tigerModel[123].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Import Box219
		tigerModel[123].setRotationPoint(-49F, -23F, -19F);

		tigerModel[124].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Import Box220
		tigerModel[124].setRotationPoint(-49F, -24F, -18F);

		tigerModel[125].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Import Box221
		tigerModel[125].setRotationPoint(-49F, -23F, -14F);

		tigerModel[126].addBox(0F, 0F, 0F, 7, 1, 15, 0F); // Import Box222
		tigerModel[126].setRotationPoint(-45F, -22.1F, -26F);

		tigerModel[127].addBox(0F, 0F, 0F, 11, 1, 15, 0F); // Import Box223
		tigerModel[127].setRotationPoint(-35F, -22.1F, -26F);

		tigerModel[128].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, -1.5F, -5F, 0F, -1.5F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4.5F, 0F, 0F, 0F); // Import Box224
		tigerModel[128].setRotationPoint(-32F, -23.5F, -7.5F);

		tigerModel[129].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box225
		tigerModel[129].setRotationPoint(-47.5F, -5F, -2F);
		tigerModel[129].rotateAngleZ = -0.12217305F;

		tigerModel[130].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box226
		tigerModel[130].setRotationPoint(21F, -5F, 28.5F);

		tigerModel[131].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box227
		tigerModel[131].setRotationPoint(21F, -2F, 28.5F);

		tigerModel[132].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box228
		tigerModel[132].setRotationPoint(21F, 3F, 28.5F);

		tigerModel[133].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box229
		tigerModel[133].setRotationPoint(2F, -5F, 28.5F);

		tigerModel[134].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box230
		tigerModel[134].setRotationPoint(2F, -2F, 28.5F);

		tigerModel[135].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box231
		tigerModel[135].setRotationPoint(2F, 3F, 28.5F);

		tigerModel[136].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box232
		tigerModel[136].setRotationPoint(-36F, -5F, 28.5F);

		tigerModel[137].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box233
		tigerModel[137].setRotationPoint(-36F, -2F, 28.5F);

		tigerModel[138].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box234
		tigerModel[138].setRotationPoint(-36F, 3F, 28.5F);

		tigerModel[139].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box235
		tigerModel[139].setRotationPoint(-17F, -5F, 28.5F);

		tigerModel[140].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box236
		tigerModel[140].setRotationPoint(-17F, -2F, 28.5F);

		tigerModel[141].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box237
		tigerModel[141].setRotationPoint(-17F, 3F, 28.5F);

		tigerModel[142].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box238
		tigerModel[142].setRotationPoint(-34F, -5F, -30.5F);

		tigerModel[143].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box239
		tigerModel[143].setRotationPoint(-34F, -2F, -30.5F);

		tigerModel[144].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box240
		tigerModel[144].setRotationPoint(-34F, 3F, -30.5F);

		tigerModel[145].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box241
		tigerModel[145].setRotationPoint(-15F, -5F, -30.5F);

		tigerModel[146].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box242
		tigerModel[146].setRotationPoint(-15F, -2F, -30.5F);

		tigerModel[147].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box243
		tigerModel[147].setRotationPoint(-15F, 3F, -30.5F);

		tigerModel[148].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box244
		tigerModel[148].setRotationPoint(4F, -5F, -30.5F);

		tigerModel[149].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box245
		tigerModel[149].setRotationPoint(4F, -2F, -30.5F);

		tigerModel[150].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box246
		tigerModel[150].setRotationPoint(4F, 3F, -30.5F);

		tigerModel[151].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box247
		tigerModel[151].setRotationPoint(23F, 3F, -30.5F);

		tigerModel[152].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box248
		tigerModel[152].setRotationPoint(23F, -2F, -30.5F);

		tigerModel[153].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		tigerModel[153].setRotationPoint(23F, -5F, -30.5F);

		tigerModel[154].addShapeBox(0F, 0F, 0F, 88, 5, 3, 0F, 0.4F, 0F, -3F, -1.3F, 0F, -3F, -1.3F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 2F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0F, 00F, 0F, 0F); // Import Box250
		tigerModel[154].setRotationPoint(-48F, -16F, -31F);

		tigerModel[155].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F); // Import Box252
		tigerModel[155].setRotationPoint(51.5F, -12F, -14F);
		tigerModel[155].rotateAngleZ = 0.31415927F;

		tigerModel[156].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F); // Import Box253
		tigerModel[156].setRotationPoint(51.5F, -12F, 13F);
		tigerModel[156].rotateAngleZ = 0.31415927F;

		tigerModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box254
		tigerModel[157].setRotationPoint(33F, -22F, 10F);

		tigerModel[158].addBox(0F, 0F, 0F, 7, 1, 9, 0F); // Import Box255
		tigerModel[158].setRotationPoint(26F, -22F, 10F);

		tigerModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box256
		tigerModel[159].setRotationPoint(25F, -22F, 10F);

		tigerModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box257
		tigerModel[160].setRotationPoint(33F, -22F, -19F);

		tigerModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box258
		tigerModel[161].setRotationPoint(25F, -22F, -19F);

		tigerModel[162].addBox(0F, 0F, 0F, 7, 1, 9, 0F); // Import Box259
		tigerModel[162].setRotationPoint(26F, -22F, -19F);

		tigerModel[163].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box260
		tigerModel[163].setRotationPoint(-49.5F, -22.5F, 25.5F);

		tigerModel[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box261
		tigerModel[164].setRotationPoint(-49.5F, -22.5F, 21F);

		tigerModel[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box262
		tigerModel[165].setRotationPoint(-49.5F, -22.5F, -26.5F);

		tigerModel[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box263
		tigerModel[166].setRotationPoint(-49.5F, -22.5F, -22F);

		tigerModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box264
		tigerModel[167].setRotationPoint(31F, -23F, -17F);
		tigerModel[167].rotateAngleY = 0.40142573F;

		tigerModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box265
		tigerModel[168].setRotationPoint(32F, -23F, 15F);
		tigerModel[168].rotateAngleY = -0.41887902F;

		tigerModel[169].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		tigerModel[169].setRotationPoint(52F, -15F, 16F);
		tigerModel[169].rotateAngleZ = 1.80527957F;

		tigerModel[170].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		tigerModel[170].setRotationPoint(52F, -15F, 14F);
		tigerModel[170].rotateAngleZ = 1.80527957F;

		tigerModel[171].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		tigerModel[171].setRotationPoint(52F, -16F, 9F);
		tigerModel[171].rotateAngleZ = 1.80527957F;

		tigerModel[172].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		tigerModel[172].setRotationPoint(52F, -16F, 6F);
		tigerModel[172].rotateAngleZ = 1.80527957F;

		tigerModel[173].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		tigerModel[173].setRotationPoint(52F, -15F, 11F);
		tigerModel[173].rotateAngleZ = 1.80527957F;

		tigerModel[174].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		tigerModel[174].setRotationPoint(52F, -15F, 8F);
		tigerModel[174].rotateAngleZ = 1.80527957F;

		tigerModel[175].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		tigerModel[175].setRotationPoint(52F, -16F, 3F);
		tigerModel[175].rotateAngleZ = 1.80527957F;

		tigerModel[176].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box8
		tigerModel[176].setRotationPoint(52F, -15F, 10F);
		tigerModel[176].rotateAngleZ = 1.80527957F;

		tigerModel[177].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		tigerModel[177].setRotationPoint(52F, -15F, 5F);
		tigerModel[177].rotateAngleZ = 1.80527957F;

		tigerModel[178].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box10
		tigerModel[178].setRotationPoint(52F, -15F, 7F);
		tigerModel[178].rotateAngleZ = 1.80527957F;

		tigerModel[179].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box11
		tigerModel[179].setRotationPoint(52F, -15F, 4F);
		tigerModel[179].rotateAngleZ = 1.80527957F;

		tigerModel[180].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		tigerModel[180].setRotationPoint(52F, -15F, 2F);
		tigerModel[180].rotateAngleZ = 1.80527957F;

		tigerModel[181].addShapeBox(3.5F, -1.5F, -15F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box13
		tigerModel[181].setRotationPoint(52F, -14F, 1F);
		tigerModel[181].rotateAngleZ = 1.80527957F;

		tigerModel[182].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		tigerModel[182].setRotationPoint(52F, -15F, -1F);
		tigerModel[182].rotateAngleZ = 1.80527957F;

		tigerModel[183].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		tigerModel[183].setRotationPoint(52F, -16F, -6F);
		tigerModel[183].rotateAngleZ = 1.80527957F;

		tigerModel[184].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		tigerModel[184].setRotationPoint(52F, -16F, -3F);
		tigerModel[184].rotateAngleZ = 1.80527957F;

		tigerModel[185].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		tigerModel[185].setRotationPoint(52F, -16F, 0F);
		tigerModel[185].rotateAngleZ = 1.80527957F;

		tigerModel[186].addShapeBox(9F, -1F, -15F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		tigerModel[186].setRotationPoint(52F, -13F, -2F);
		tigerModel[186].rotateAngleZ = 1.80527957F;

		tigerModel[187].addShapeBox(4F, -1F, -15F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		tigerModel[187].setRotationPoint(52F, -13F, -2F);
		tigerModel[187].rotateAngleZ = 1.80527957F;

		tigerModel[188].addShapeBox(3.5F, -1.5F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box25
		tigerModel[188].setRotationPoint(52F, -15F, 13F);
		tigerModel[188].rotateAngleZ = 1.80527957F;

		tigerModel[189].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		tigerModel[189].setRotationPoint(52F, -15F, -1F);
		tigerModel[189].rotateAngleZ = 1.80527957F;

		tigerModel[190].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		tigerModel[190].setRotationPoint(52F, -15F, 2F);
		tigerModel[190].rotateAngleZ = 1.80527957F;

		tigerModel[191].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box50
		tigerModel[191].setRotationPoint(52F, -15F, 4F);
		tigerModel[191].rotateAngleZ = 1.80527957F;

		tigerModel[192].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		tigerModel[192].setRotationPoint(52F, -15F, 5F);
		tigerModel[192].rotateAngleZ = 1.80527957F;

		tigerModel[193].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box52
		tigerModel[193].setRotationPoint(52F, -15F, 7F);
		tigerModel[193].rotateAngleZ = 1.80527957F;

		tigerModel[194].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		tigerModel[194].setRotationPoint(52F, -15F, 8F);
		tigerModel[194].rotateAngleZ = 1.80527957F;

		tigerModel[195].addShapeBox(3.5F, -1.5F, 3F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box54
		tigerModel[195].setRotationPoint(52F, -14F, 10F);
		tigerModel[195].rotateAngleZ = 1.80527957F;

		tigerModel[196].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		tigerModel[196].setRotationPoint(52F, -15F, 11F);
		tigerModel[196].rotateAngleZ = 1.80527957F;

		tigerModel[197].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box56
		tigerModel[197].setRotationPoint(52F, -15F, 13F);
		tigerModel[197].rotateAngleZ = 1.80527957F;

		tigerModel[198].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		tigerModel[198].setRotationPoint(52F, -15F, 14F);
		tigerModel[198].rotateAngleZ = 1.80527957F;

		tigerModel[199].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box58
		tigerModel[199].setRotationPoint(52F, -15F, 16F);
		tigerModel[199].rotateAngleZ = 1.80527957F;

		tigerModel[200].addShapeBox(3.5F, -1.5F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box59
		tigerModel[200].setRotationPoint(52F, -15F, 1F);
		tigerModel[200].rotateAngleZ = 1.80527957F;

		tigerModel[201].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		tigerModel[201].setRotationPoint(52F, -16F, 12F);
		tigerModel[201].rotateAngleZ = 1.80527957F;

		tigerModel[202].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		tigerModel[202].setRotationPoint(52F, -16F, 15F);
		tigerModel[202].rotateAngleZ = 1.80527957F;

		tigerModel[203].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		tigerModel[203].setRotationPoint(52F, -16F, 18F);
		tigerModel[203].rotateAngleZ = 1.80527957F;

		tigerModel[204].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		tigerModel[204].setRotationPoint(52F, -16F, 21F);
		tigerModel[204].rotateAngleZ = 1.80527957F;

		tigerModel[205].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		tigerModel[205].setRotationPoint(52F, -16F, 24F);
		tigerModel[205].rotateAngleZ = 1.80527957F;

		tigerModel[206].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		tigerModel[206].setRotationPoint(52F, -16F, 27F);
		tigerModel[206].rotateAngleZ = 1.80527957F;

		tigerModel[207].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		tigerModel[207].setRotationPoint(51F, -10F, 12F);
		tigerModel[207].rotateAngleZ = 1.80527957F;

		tigerModel[208].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		tigerModel[208].setRotationPoint(51F, -10F, 15F);
		tigerModel[208].rotateAngleZ = 1.80527957F;

		tigerModel[209].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		tigerModel[209].setRotationPoint(51F, -10F, 18F);
		tigerModel[209].rotateAngleZ = 1.80527957F;

		tigerModel[210].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		tigerModel[210].setRotationPoint(51F, -10F, 21F);
		tigerModel[210].rotateAngleZ = 1.80527957F;

		tigerModel[211].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		tigerModel[211].setRotationPoint(51F, -10F, 24F);
		tigerModel[211].rotateAngleZ = 1.80527957F;

		tigerModel[212].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		tigerModel[212].setRotationPoint(51F, -10F, 27F);
		tigerModel[212].rotateAngleZ = 1.80527957F;

		tigerModel[213].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box72
		tigerModel[213].setRotationPoint(51F, -10F, 9F);
		tigerModel[213].rotateAngleZ = 1.80527957F;

		tigerModel[214].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		tigerModel[214].setRotationPoint(51F, -10F, 6F);
		tigerModel[214].rotateAngleZ = 1.80527957F;

		tigerModel[215].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		tigerModel[215].setRotationPoint(51F, -10F, 3F);
		tigerModel[215].rotateAngleZ = 1.80527957F;

		tigerModel[216].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		tigerModel[216].setRotationPoint(51F, -10F, 0F);
		tigerModel[216].rotateAngleZ = 1.80527957F;

		tigerModel[217].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		tigerModel[217].setRotationPoint(51F, -10F, -3F);
		tigerModel[217].rotateAngleZ = 1.80527957F;

		tigerModel[218].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		tigerModel[218].setRotationPoint(51F, -10F, -6F);
		tigerModel[218].rotateAngleZ = 1.80527957F;

		tigerModel[219].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box78
		tigerModel[219].setRotationPoint(38F, -14.5F, 6F);
		tigerModel[219].rotateAngleZ = 0.21702995F;

		tigerModel[220].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		tigerModel[220].setRotationPoint(38F, -14.5F, 7F);
		tigerModel[220].rotateAngleZ = 0.21702995F;

		tigerModel[221].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box80
		tigerModel[221].setRotationPoint(38F, -14.5F, 9F);
		tigerModel[221].rotateAngleZ = 0.21702995F;

		tigerModel[222].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box81
		tigerModel[222].setRotationPoint(38F, -14.5F, 12F);
		tigerModel[222].rotateAngleZ = 0.21702995F;

		tigerModel[223].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box82
		tigerModel[223].setRotationPoint(38F, -14.5F, 4F);
		tigerModel[223].rotateAngleZ = 0.21702995F;

		tigerModel[224].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		tigerModel[224].setRotationPoint(38F, -14.5F, 13F);
		tigerModel[224].rotateAngleZ = 0.21702995F;

		tigerModel[225].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box84
		tigerModel[225].setRotationPoint(38F, -14.5F, 15F);
		tigerModel[225].rotateAngleZ = 0.21702995F;

		tigerModel[226].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		tigerModel[226].setRotationPoint(38F, -14.5F, 16F);
		tigerModel[226].rotateAngleZ = 0.21702995F;

		tigerModel[227].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box86
		tigerModel[227].setRotationPoint(38F, -14.5F, 18F);
		tigerModel[227].rotateAngleZ = 0.21702995F;

		tigerModel[228].addShapeBox(3.5F, -1.3F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		tigerModel[228].setRotationPoint(38F, -14.5F, 1F);
		tigerModel[228].rotateAngleZ = 0.21702995F;

		tigerModel[229].addShapeBox(3.5F, -1.3F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box88
		tigerModel[229].setRotationPoint(38F, -14.5F, 3F);
		tigerModel[229].rotateAngleZ = 0.21702995F;

		tigerModel[230].addShapeBox(3.5F, -1.3F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		tigerModel[230].setRotationPoint(38F, -14.5F, 4F);
		tigerModel[230].rotateAngleZ = 0.21702995F;

		tigerModel[231].addShapeBox(3.5F, -1.3F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box90
		tigerModel[231].setRotationPoint(38F, -14.5F, 6F);
		tigerModel[231].rotateAngleZ = 0.21702995F;

		tigerModel[232].addShapeBox(3.5F, -1.3F, 3F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		tigerModel[232].setRotationPoint(38F, -14.5F, 7F);
		tigerModel[232].rotateAngleZ = 0.21702995F;

		tigerModel[233].addShapeBox(3.5F, -1.3F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box92
		tigerModel[233].setRotationPoint(38F, -14.5F, 9F);
		tigerModel[233].rotateAngleZ = 0.21702995F;

		tigerModel[234].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		tigerModel[234].setRotationPoint(37F, -14.5F, 20F);
		tigerModel[234].rotateAngleZ = 0.21702995F;

		tigerModel[235].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		tigerModel[235].setRotationPoint(37F, -14.5F, 17F);
		tigerModel[235].rotateAngleZ = 0.21702995F;

		tigerModel[236].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		tigerModel[236].setRotationPoint(37F, -14.5F, 14F);
		tigerModel[236].rotateAngleZ = 0.21702995F;

		tigerModel[237].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		tigerModel[237].setRotationPoint(37F, -14.5F, 11F);
		tigerModel[237].rotateAngleZ = 0.21702995F;

		tigerModel[238].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		tigerModel[238].setRotationPoint(37F, -14.5F, 8F);
		tigerModel[238].rotateAngleZ = 0.21702995F;

		tigerModel[239].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box98
		tigerModel[239].setRotationPoint(37F, -14.5F, 2F);
		tigerModel[239].rotateAngleZ = 0.21702995F;

		tigerModel[240].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		tigerModel[240].setRotationPoint(37F, -14.5F, 5F);
		tigerModel[240].rotateAngleZ = 0.21702995F;

		tigerModel[241].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box100
		tigerModel[241].setRotationPoint(37F, -14.5F, -1F);
		tigerModel[241].rotateAngleZ = 0.21702995F;

		tigerModel[242].addShapeBox(3.5F, -1.3F, -15F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		tigerModel[242].setRotationPoint(38F, -14.5F, 10F);
		tigerModel[242].rotateAngleZ = 0.21702995F;

		tigerModel[243].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		tigerModel[243].setRotationPoint(43F, -13.5F, -1F);
		tigerModel[243].rotateAngleZ = 0.21702995F;

		tigerModel[244].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box103
		tigerModel[244].setRotationPoint(43F, -13.5F, 2F);
		tigerModel[244].rotateAngleZ = 0.21702995F;

		tigerModel[245].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box104
		tigerModel[245].setRotationPoint(43F, -13.5F, 5F);
		tigerModel[245].rotateAngleZ = 0.21702995F;

		tigerModel[246].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		tigerModel[246].setRotationPoint(43F, -13.5F, 8F);
		tigerModel[246].rotateAngleZ = 0.21702995F;

		tigerModel[247].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		tigerModel[247].setRotationPoint(43F, -13.5F, 11F);
		tigerModel[247].rotateAngleZ = 0.21702995F;

		tigerModel[248].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		tigerModel[248].setRotationPoint(43F, -13.5F, 14F);
		tigerModel[248].rotateAngleZ = 0.21702995F;

		tigerModel[249].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		tigerModel[249].setRotationPoint(43F, -13.5F, 17F);
		tigerModel[249].rotateAngleZ = 0.21702995F;

		tigerModel[250].addShapeBox(7F, -2.3F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box109
		tigerModel[250].setRotationPoint(43F, -13.5F, 20F);
		tigerModel[250].rotateAngleZ = 0.21702995F;

		tigerModel[251].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		tigerModel[251].setRotationPoint(33F, -25F, -24.5F);

		tigerModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		tigerModel[252].setRotationPoint(34F, -23F, -23.5F);

		tigerModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box11
		tigerModel[253].setRotationPoint(34F, -22F, -23.5F);

		tigerModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box12
		tigerModel[254].setRotationPoint(33F, -24F, -24.5F);

		tigerModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box233
		tigerModel[255].setRotationPoint(33F, -25F, 21.5F);

		tigerModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box234
		tigerModel[256].setRotationPoint(34F, -23F, 22.5F);

		tigerModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box235
		tigerModel[257].setRotationPoint(34F, -22F, 22.5F);

		tigerModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box236
		tigerModel[258].setRotationPoint(33F, -24F, 21.5F);

		tigerModel[259].addBox(0F, 0F, 0F, 6, 2, 9, 0F); // Import Box237
		tigerModel[259].setRotationPoint(29F, -23F, -6F);

		tigerModel[260].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box238
		tigerModel[260].setRotationPoint(28F, -23.1F, -2F);

		tigerModel[261].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[261].setRotationPoint(-49F, -4.5F, 10.5F);

		tigerModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box261
		tigerModel[262].setRotationPoint(31.5F, -23.1F, -7F);

		tigerModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box262
		tigerModel[263].setRotationPoint(31.5F, -22.1F, -7F);

		tigerModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box263
		tigerModel[264].setRotationPoint(31.5F, -22.1F, 3F);

		tigerModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box264
		tigerModel[265].setRotationPoint(28F, -22.1F, -2F);

		tigerModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box265
		tigerModel[266].setRotationPoint(35F, -22.1F, -2F);

		tigerModel[267].addBox(0F, 0F, 0F, 35, 1, 1, 0F); // Import Box266
		tigerModel[267].setRotationPoint(-18F, -21.5F, -26F);
		tigerModel[267].rotateAngleY = -0.03490659F;

		tigerModel[268].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Import Box268
		tigerModel[268].setRotationPoint(-18F, -21.5F, -23F);

		tigerModel[269].addBox(0F, 0F, 0F, 34, 1, 1, 0F); // Import Box269
		tigerModel[269].setRotationPoint(-18F, -21.5F, 25F);
		tigerModel[269].rotateAngleY = 0.03490659F;

		tigerModel[270].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Import Box271
		tigerModel[270].setRotationPoint(-18F, -21.5F, 22F);

		tigerModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box272
		tigerModel[271].setRotationPoint(17F, -21.7F, -24.8F);

		tigerModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box278
		tigerModel[272].setRotationPoint(22F, -21.7F, -23F);

		tigerModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box279
		tigerModel[273].setRotationPoint(16F, -21.7F, 24F);

		tigerModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box280
		tigerModel[274].setRotationPoint(22F, -21.7F, 22F);

		tigerModel[275].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Import Box281
		tigerModel[275].setRotationPoint(9F, -22F, -26.5F);

		tigerModel[276].addBox(0F, 0F, 0F, 4, 1, 5, 0F); // Import Box282
		tigerModel[276].setRotationPoint(9F, -22F, 21.5F);

		tigerModel[277].addBox(-6F, 0F, -1F, 6, 1, 1, 0F); // Import Box283
		tigerModel[277].setRotationPoint(-18F, -21.5F, 26F);
		tigerModel[277].rotateAngleY = -0.85521133F;
		tigerModel[277].rotateAngleZ = 0.01745329F;

		tigerModel[278].addBox(-5F, 0F, -1F, 5, 1, 1, 0F); // Import Box284
		tigerModel[278].setRotationPoint(-18F, -21.5F, 23F);
		tigerModel[278].rotateAngleY = -0.34906585F;
		tigerModel[278].rotateAngleZ = 0.01745329F;

		tigerModel[279].addBox(-6F, 0F, 0F, 6, 1, 1, 0F); // Import Box285
		tigerModel[279].setRotationPoint(-18F, -21.5F, -26F);
		tigerModel[279].rotateAngleY = 1.09955743F;
		tigerModel[279].rotateAngleZ = 0.01745329F;

		tigerModel[280].addBox(-5F, 0F, 0F, 5, 1, 1, 0F); // Import Box286
		tigerModel[280].setRotationPoint(-18F, -21.5F, -23F);
		tigerModel[280].rotateAngleY = 0.6981317F;
		tigerModel[280].rotateAngleZ = 0.01745329F;

		tigerModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box287
		tigerModel[281].setRotationPoint(-23F, -21.7F, 20.5F);

		tigerModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box288
		tigerModel[282].setRotationPoint(-22F, -21.7F, -20F);

		tigerModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box2
		tigerModel[283].setRotationPoint(22F, -19.5F, 27.5F);

		tigerModel[284].addBox(0F, 0F, 0F, 51, 1, 1, 0F); // Import Box3
		tigerModel[284].setRotationPoint(-29F, -19.5F, 27.5F);

		tigerModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box4
		tigerModel[285].setRotationPoint(16F, -17.5F, 27.5F);

		tigerModel[286].addBox(0F, 0F, 0F, 45, 1, 1, 0F); // Import Box5
		tigerModel[286].setRotationPoint(-29F, -17.5F, 27.5F);

		tigerModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box6
		tigerModel[287].setRotationPoint(-30F, -17.5F, 27.5F);

		tigerModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box7
		tigerModel[288].setRotationPoint(-30F, -19.5F, 27.5F);

		tigerModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box8
		tigerModel[289].setRotationPoint(22F, -19.5F, -28.5F);

		tigerModel[290].addBox(0F, 0F, 0F, 51, 1, 1, 0F); // Import Box9
		tigerModel[290].setRotationPoint(-29F, -19.5F, -28.5F);

		tigerModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box10
		tigerModel[291].setRotationPoint(16F, -17.5F, -28.5F);

		tigerModel[292].addBox(0F, 0F, 0F, 45, 1, 1, 0F); // Import Box11
		tigerModel[292].setRotationPoint(-29F, -17.5F, -28.5F);

		tigerModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box12
		tigerModel[293].setRotationPoint(-30F, -17.5F, -28.5F);

		tigerModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box13
		tigerModel[294].setRotationPoint(-30F, -19.5F, -28.5F);

		tigerModel[295].addShapeBox(15F, -1F, 3.5F, 1, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box14
		tigerModel[295].setRotationPoint(34.8F, -36.5F, -31F);
		tigerModel[295].rotateAngleZ = 1.35149396F;

		tigerModel[296].addShapeBox(15F, -1F, 3.5F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		tigerModel[296].setRotationPoint(35F, -35.5F, -31F);
		tigerModel[296].rotateAngleZ = 1.35149396F;

		tigerModel[297].addShapeBox(15F, -1F, 3.5F, 1, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box16
		tigerModel[297].setRotationPoint(35.5F, -33.5F, -31F);
		tigerModel[297].rotateAngleZ = 1.35149396F;

		tigerModel[298].addShapeBox(15F, -1F, 3.5F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		tigerModel[298].setRotationPoint(35.8F, -32.5F, -31F);
		tigerModel[298].rotateAngleZ = 1.35149396F;

		tigerModel[299].addShapeBox(10F, -2F, 7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		tigerModel[299].setRotationPoint(35.8F, -31.5F, -32F);
		tigerModel[299].rotateAngleZ = 1.35149396F;

		tigerModel[300].addShapeBox(10F, -2F, 7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		tigerModel[300].setRotationPoint(35.8F, -31.5F, -26F);
		tigerModel[300].rotateAngleZ = 1.35149396F;

		tigerModel[301].addShapeBox(10F, -2F, 7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		tigerModel[301].setRotationPoint(36.5F, -28.5F, -32F);
		tigerModel[301].rotateAngleZ = 1.35149396F;

		tigerModel[302].addShapeBox(10F, -2F, 7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		tigerModel[302].setRotationPoint(36.5F, -28.5F, -26F);
		tigerModel[302].rotateAngleZ = 1.35149396F;

		tigerModel[303].addShapeBox(10F, -2F, 7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		tigerModel[303].setRotationPoint(36.5F, -28.5F, 12F);
		tigerModel[303].rotateAngleZ = 1.35149396F;

		tigerModel[304].addShapeBox(10F, -2F, 7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		tigerModel[304].setRotationPoint(36.5F, -28.5F, 18F);
		tigerModel[304].rotateAngleZ = 1.35149396F;

		tigerModel[305].addShapeBox(15F, -1F, 3.5F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		tigerModel[305].setRotationPoint(35.8F, -32.5F, 13F);
		tigerModel[305].rotateAngleZ = 1.35149396F;

		tigerModel[306].addShapeBox(15F, -1F, 3.5F, 1, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box27
		tigerModel[306].setRotationPoint(35.5F, -33.5F, 13F);
		tigerModel[306].rotateAngleZ = 1.35149396F;

		tigerModel[307].addShapeBox(15F, -1F, 3.5F, 2, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		tigerModel[307].setRotationPoint(35F, -35.5F, 13F);
		tigerModel[307].rotateAngleZ = 1.35149396F;

		tigerModel[308].addShapeBox(10F, -2F, 7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		tigerModel[308].setRotationPoint(35.8F, -31.5F, 12F);
		tigerModel[308].rotateAngleZ = 1.35149396F;

		tigerModel[309].addShapeBox(10F, -2F, 7F, 2, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		tigerModel[309].setRotationPoint(35.8F, -31.5F, 18F);
		tigerModel[309].rotateAngleZ = 1.35149396F;

		tigerModel[310].addShapeBox(15F, -1F, 3.5F, 1, 1, 12, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box31
		tigerModel[310].setRotationPoint(34.8F, -36.5F, 13F);
		tigerModel[310].rotateAngleZ = 1.35149396F;

		tigerModel[311].addBox(0F, -35F, -19.5F, 15, 14, 39, 0F); // Import Box8
		tigerModel[311].setRotationPoint(-8F, 0F, 0F);

		tigerModel[312].addShapeBox(-7F, -35F, -19.5F, 7, 14, 39, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box9
		tigerModel[312].setRotationPoint(-8F, 0F, 0F);

		tigerModel[313].addShapeBox(0F, -22F, -19.5F, 7, 1, 39, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box10
		tigerModel[313].setRotationPoint(7F, 0F, 0F);

		tigerModel[314].addShapeBox(-11F, -35F, -15.5F, 4, 14, 29, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box12
		tigerModel[314].setRotationPoint(-8F, 0F, 1F);

		tigerModel[315].addShapeBox(0F, -22F, -14.5F, 4, 1, 29, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box13
		tigerModel[315].setRotationPoint(14F, 0F, 0F);

		tigerModel[316].addShapeBox(15F, -35F, -19.5F, 13, 13, 39, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import Box15
		tigerModel[316].setRotationPoint(-8F, 0F, 0F);

		tigerModel[317].addShapeBox(0F, -33F, -12.5F, 2, 11, 25, 0F, 0F, 0F, 0F, 1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 0F, 0F); // Import Box16
		tigerModel[317].setRotationPoint(20F, 0F, 0F);

		tigerModel[318].addShapeBox(-19F, -35F, -3.5F, 5, 11, 7, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		tigerModel[318].setRotationPoint(-8F, 0F, 0F);

		tigerModel[319].addShapeBox(-19F, -35F, 3.5F, 8, 11, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -3F, 0F, 3F); // Import Box33
		tigerModel[319].setRotationPoint(-8F, 0F, 0F);

		tigerModel[320].addShapeBox(-12F, -35F, -3.5F, 1, 11, 7, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		tigerModel[320].setRotationPoint(-8F, 0F, 0F);

		tigerModel[321].addShapeBox(-19F, -35F, -3.5F, 8, 11, 5, 0F, -3F, -1F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box37
		tigerModel[321].setRotationPoint(-8F, 0F, -5F);

		tigerModel[322].addBox(0F, -39F, 5F, 7, 4, 13, 0F); // Import Box38
		tigerModel[322].setRotationPoint(-10F, 0F, 0F);

		tigerModel[323].addShapeBox(8F, -39F, 5F, 3, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box39
		tigerModel[323].setRotationPoint(-11F, 0F, 0F);

		tigerModel[324].addShapeBox(-2F, -39F, 5F, 3, 4, 13, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box40
		tigerModel[324].setRotationPoint(-11F, 0F, 0F);

		tigerModel[325].addBox(26.7F, -29F, -15F, 2, 2, 30, 0F); // Import Box41
		tigerModel[325].setRotationPoint(-8F, 0F, 0F);

		tigerModel[326].addBox(26.2F, -29.5F, -14F, 3, 3, 28, 0F); // Import Box42
		tigerModel[326].setRotationPoint(-8F, 0F, 0F);

		tigerModel[327].addShapeBox(7.5F, -40F, 5.5F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box43
		tigerModel[327].setRotationPoint(-11F, 0F, 0F);

		tigerModel[328].addBox(0.5F, -40F, 5.5F, 6, 1, 12, 0F); // Import Box44
		tigerModel[328].setRotationPoint(-10F, 0F, 0F);

		tigerModel[329].addShapeBox(-1.5F, -40F, 5.5F, 3, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box45
		tigerModel[329].setRotationPoint(-11F, 0F, 0F);

		tigerModel[330].addBox(6F, -36F, -16.5F, 8, 1, 10, 0F); // Import Box39
		tigerModel[330].setRotationPoint(-8F, 0F, 0F);

		tigerModel[331].addShapeBox(11.5F, -36F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box40
		tigerModel[331].setRotationPoint(-10F, 0F, 0F);

		tigerModel[332].addBox(6.5F, -36F, -2F, 2, 1, 4, 0F); // Import Box41
		tigerModel[332].setRotationPoint(-7F, 0F, 0F);

		tigerModel[333].addShapeBox(6.5F, -36F, -2F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box42
		tigerModel[333].setRotationPoint(-8F, 0F, 0F);

		tigerModel[334].addBox(5F, -35.5F, -15.5F, 1, 1, 3, 0F); // Import Box43
		tigerModel[334].setRotationPoint(-8F, 0F, 0F);

		tigerModel[335].addBox(5F, -35.5F, -10.5F, 1, 1, 3, 0F); // Import Box44
		tigerModel[335].setRotationPoint(-8F, 0F, 0F);

		tigerModel[336].addShapeBox(12F, -37F, -13.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box45
		tigerModel[336].setRotationPoint(-8F, 0F, 0F);

		tigerModel[337].addShapeBox(12F, -36.5F, -13.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box46
		tigerModel[337].setRotationPoint(-8F, 0F, 0F);

		tigerModel[338].addShapeBox(12F, -36.5F, -10.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box47
		tigerModel[338].setRotationPoint(-8F, 0F, 0F);

		tigerModel[339].addBox(8.5F, -34F, 11.8F, 9, 12, 1, 0F); // Import Box178
		tigerModel[339].setRotationPoint(-15F, 0F, 0F);
		tigerModel[339].rotateAngleY = -0.61086524F;

		tigerModel[340].addShapeBox(22F, -21F, 7F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		tigerModel[340].setRotationPoint(0F, 0F, 0F);
		tigerModel[340].rotateAngleY = 1.57079633F;
		tigerModel[340].rotateAngleZ = -1.57079633F;

		tigerModel[341].addShapeBox(22F, -21F, 5F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[341].setRotationPoint(0F, 0F, 0F);
		tigerModel[341].rotateAngleY = 1.57079633F;
		tigerModel[341].rotateAngleZ = -1.57079633F;

		tigerModel[342].addShapeBox(28F, -22F, 5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[342].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[342].rotateAngleY = 1.57079633F;
		tigerModel[342].rotateAngleZ = -1.57079633F;

		tigerModel[343].addShapeBox(28F, -22F, 2F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[343].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[343].rotateAngleY = 1.57079633F;
		tigerModel[343].rotateAngleZ = -1.57079633F;

		tigerModel[344].addShapeBox(22F, -21F, 2F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[344].setRotationPoint(0F, 0F, 0F);
		tigerModel[344].rotateAngleY = 1.57079633F;
		tigerModel[344].rotateAngleZ = -1.57079633F;

		tigerModel[345].addShapeBox(22F, -21F, -1F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[345].setRotationPoint(0F, 0F, 0F);
		tigerModel[345].rotateAngleY = 1.57079633F;
		tigerModel[345].rotateAngleZ = -1.57079633F;

		tigerModel[346].addShapeBox(28F, -22F, -1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[346].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[346].rotateAngleY = 1.57079633F;
		tigerModel[346].rotateAngleZ = -1.57079633F;

		tigerModel[347].addShapeBox(22F, -21F, 1F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		tigerModel[347].setRotationPoint(0F, 0F, 0F);
		tigerModel[347].rotateAngleY = 1.57079633F;
		tigerModel[347].rotateAngleZ = -1.57079633F;

		tigerModel[348].addShapeBox(22F, -21F, -4F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[348].setRotationPoint(0F, 0F, 0F);
		tigerModel[348].rotateAngleY = 1.57079633F;
		tigerModel[348].rotateAngleZ = -1.57079633F;

		tigerModel[349].addShapeBox(22F, -21F, -2F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		tigerModel[349].setRotationPoint(0F, 0F, 0F);
		tigerModel[349].rotateAngleY = 1.57079633F;
		tigerModel[349].rotateAngleZ = -1.57079633F;

		tigerModel[350].addShapeBox(22F, -21F, -5F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		tigerModel[350].setRotationPoint(0F, 0F, 0F);
		tigerModel[350].rotateAngleY = 1.57079633F;
		tigerModel[350].rotateAngleZ = -1.57079633F;

		tigerModel[351].addShapeBox(22F, -21F, -7F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[351].setRotationPoint(0F, 0F, 0F);
		tigerModel[351].rotateAngleY = 1.57079633F;
		tigerModel[351].rotateAngleZ = -1.57079633F;

		tigerModel[352].addShapeBox(22F, -21F, -8F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		tigerModel[352].setRotationPoint(0F, 0F, 0F);
		tigerModel[352].rotateAngleY = 1.57079633F;
		tigerModel[352].rotateAngleZ = -1.57079633F;

		tigerModel[353].addShapeBox(22F, -21F, -10F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[353].setRotationPoint(0F, 0F, 0F);
		tigerModel[353].rotateAngleY = 1.57079633F;
		tigerModel[353].rotateAngleZ = -1.57079633F;

		tigerModel[354].addShapeBox(28F, -22F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[354].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[354].rotateAngleY = 1.57079633F;
		tigerModel[354].rotateAngleZ = -1.57079633F;

		tigerModel[355].addShapeBox(28F, -22F, -7F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[355].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[355].rotateAngleY = 1.57079633F;
		tigerModel[355].rotateAngleZ = -1.57079633F;

		tigerModel[356].addShapeBox(28F, -22F, -4F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[356].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[356].rotateAngleY = 1.57079633F;
		tigerModel[356].rotateAngleZ = -1.57079633F;

		tigerModel[357].addShapeBox(28.5F, -20.5F, -11F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[357].setRotationPoint(0F, 0F, 0F);
		tigerModel[357].rotateAngleY = 1.57079633F;
		tigerModel[357].rotateAngleZ = -1.57079633F;

		tigerModel[358].addShapeBox(23.5F, -20.5F, -11F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tigerModel[358].setRotationPoint(0F, 0F, 0F);
		tigerModel[358].rotateAngleY = 1.57079633F;
		tigerModel[358].rotateAngleZ = -1.57079633F;

		tigerModel[359].addShapeBox(22F, -21F, 4F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		tigerModel[359].setRotationPoint(0F, 0F, 0F);
		tigerModel[359].rotateAngleY = 1.57079633F;
		tigerModel[359].rotateAngleZ = -1.57079633F;

		tigerModel[360].addShapeBox(33F, -22F, 5F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		tigerModel[360].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[360].rotateAngleY = 1.57079633F;
		tigerModel[360].rotateAngleZ = -1.57079633F;

		tigerModel[361].addShapeBox(33F, -22F, 2F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		tigerModel[361].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[361].rotateAngleY = 1.57079633F;
		tigerModel[361].rotateAngleZ = -1.57079633F;

		tigerModel[362].addShapeBox(33F, -22F, -1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		tigerModel[362].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[362].rotateAngleY = 1.57079633F;
		tigerModel[362].rotateAngleZ = -1.57079633F;

		tigerModel[363].addShapeBox(33F, -22F, -4F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		tigerModel[363].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[363].rotateAngleY = 1.57079633F;
		tigerModel[363].rotateAngleZ = -1.57079633F;

		tigerModel[364].addShapeBox(33F, -22F, -7F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		tigerModel[364].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[364].rotateAngleY = 1.57079633F;
		tigerModel[364].rotateAngleZ = -1.57079633F;

		tigerModel[365].addShapeBox(33F, -22F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		tigerModel[365].setRotationPoint(0F, 3.5F, 0F);
		tigerModel[365].rotateAngleY = 1.57079633F;
		tigerModel[365].rotateAngleZ = -1.57079633F;

		tigerModel[366].addShapeBox(22F, 20F, -3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box199
		tigerModel[366].setRotationPoint(0F, 0F, 0F);
		tigerModel[366].rotateAngleY = 1.57079633F;
		tigerModel[366].rotateAngleZ = -1.57079633F;

		tigerModel[367].addShapeBox(22F, 20F, -5F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box200
		tigerModel[367].setRotationPoint(0F, 0F, 0F);
		tigerModel[367].rotateAngleY = 1.57079633F;
		tigerModel[367].rotateAngleZ = -1.57079633F;

		tigerModel[368].addShapeBox(22F, 20F, -6F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box201
		tigerModel[368].setRotationPoint(0F, 0F, 0F);
		tigerModel[368].rotateAngleY = 1.57079633F;
		tigerModel[368].rotateAngleZ = -1.57079633F;

		tigerModel[369].addShapeBox(22F, 20F, -8F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box202
		tigerModel[369].setRotationPoint(0F, 0F, 0F);
		tigerModel[369].rotateAngleY = 1.57079633F;
		tigerModel[369].rotateAngleZ = -1.57079633F;

		tigerModel[370].addShapeBox(28.5F, 20.5F, -9F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box203
		tigerModel[370].setRotationPoint(0F, 0F, 0F);
		tigerModel[370].rotateAngleY = 1.57079633F;
		tigerModel[370].rotateAngleZ = -1.57079633F;

		tigerModel[371].addShapeBox(23.5F, 20.5F, -9F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box204
		tigerModel[371].setRotationPoint(0F, 0F, 0F);
		tigerModel[371].rotateAngleY = 1.57079633F;
		tigerModel[371].rotateAngleZ = -1.57079633F;

		tigerModel[372].addShapeBox(24F, 17.5F, -8F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box205
		tigerModel[372].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[372].rotateAngleY = 1.57079633F;
		tigerModel[372].rotateAngleZ = -1.57079633F;

		tigerModel[373].addShapeBox(24F, 17.5F, -5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box206
		tigerModel[373].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[373].rotateAngleY = 1.57079633F;
		tigerModel[373].rotateAngleZ = -1.57079633F;

		tigerModel[374].addShapeBox(29F, 17.5F, -5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box207
		tigerModel[374].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[374].rotateAngleY = 1.57079633F;
		tigerModel[374].rotateAngleZ = -1.57079633F;

		tigerModel[375].addShapeBox(29F, 17.5F, -8F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box208
		tigerModel[375].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[375].rotateAngleY = 1.57079633F;
		tigerModel[375].rotateAngleZ = -1.57079633F;

		tigerModel[376].addShapeBox(28.5F, 21F, -2F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box209
		tigerModel[376].setRotationPoint(0F, 0F, 0F);
		tigerModel[376].rotateAngleY = 1.08210414F;
		tigerModel[376].rotateAngleZ = -1.57079633F;

		tigerModel[377].addShapeBox(29F, 18F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box210
		tigerModel[377].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[377].rotateAngleY = 1.08210414F;
		tigerModel[377].rotateAngleZ = -1.57079633F;

		tigerModel[378].addShapeBox(29F, 18F, 2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box211
		tigerModel[378].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[378].rotateAngleY = 1.08210414F;
		tigerModel[378].rotateAngleZ = -1.57079633F;

		tigerModel[379].addShapeBox(22F, 20.5F, 1F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box212
		tigerModel[379].setRotationPoint(0F, 0F, 0F);
		tigerModel[379].rotateAngleY = 1.08210414F;
		tigerModel[379].rotateAngleZ = -1.57079633F;

		tigerModel[380].addShapeBox(22F, 20.5F, -1F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box213
		tigerModel[380].setRotationPoint(0F, 0F, 0F);
		tigerModel[380].rotateAngleY = 1.08210414F;
		tigerModel[380].rotateAngleZ = -1.57079633F;

		tigerModel[381].addShapeBox(22F, 20.5F, 2F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box214
		tigerModel[381].setRotationPoint(0F, 0F, 0F);
		tigerModel[381].rotateAngleY = 1.08210414F;
		tigerModel[381].rotateAngleZ = -1.57079633F;

		tigerModel[382].addShapeBox(22F, 20.5F, 4F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box215
		tigerModel[382].setRotationPoint(0F, 0F, 0F);
		tigerModel[382].rotateAngleY = 1.08210414F;
		tigerModel[382].rotateAngleZ = -1.57079633F;

		tigerModel[383].addShapeBox(24F, 18F, 2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box216
		tigerModel[383].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[383].rotateAngleY = 1.08210414F;
		tigerModel[383].rotateAngleZ = -1.57079633F;

		tigerModel[384].addShapeBox(24F, 18F, -1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box217
		tigerModel[384].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[384].rotateAngleY = 1.08210414F;
		tigerModel[384].rotateAngleZ = -1.57079633F;

		tigerModel[385].addShapeBox(23.5F, 21F, -2F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box218
		tigerModel[385].setRotationPoint(0F, 0F, 0F);
		tigerModel[385].rotateAngleY = 1.08210414F;
		tigerModel[385].rotateAngleZ = -1.57079633F;

		tigerModel[386].addShapeBox(29F, 18F, 5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box219
		tigerModel[386].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[386].rotateAngleY = 1.08210414F;
		tigerModel[386].rotateAngleZ = -1.57079633F;

		tigerModel[387].addShapeBox(22F, 20.5F, 5F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box221
		tigerModel[387].setRotationPoint(0F, 0F, 0F);
		tigerModel[387].rotateAngleY = 1.08210414F;
		tigerModel[387].rotateAngleZ = -1.57079633F;

		tigerModel[388].addShapeBox(22F, 20.5F, 7F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box222
		tigerModel[388].setRotationPoint(0F, 0F, 0F);
		tigerModel[388].rotateAngleY = 1.08210414F;
		tigerModel[388].rotateAngleZ = -1.57079633F;

		tigerModel[389].addShapeBox(24F, 18F, 5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box226
		tigerModel[389].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[389].rotateAngleY = 1.08210414F;
		tigerModel[389].rotateAngleZ = -1.57079633F;

		tigerModel[390].addShapeBox(28.5F, 21F, -3F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box245
		tigerModel[390].setRotationPoint(0F, 0F, 0F);
		tigerModel[390].rotateAngleY = 2.18166156F;
		tigerModel[390].rotateAngleZ = -1.57079633F;

		tigerModel[391].addShapeBox(22F, 20.5F, -2F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box246
		tigerModel[391].setRotationPoint(0F, 0F, 0F);
		tigerModel[391].rotateAngleY = 2.18166156F;
		tigerModel[391].rotateAngleZ = -1.57079633F;

		tigerModel[392].addShapeBox(22F, 20.5F, 1F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box247
		tigerModel[392].setRotationPoint(0F, 0F, 0F);
		tigerModel[392].rotateAngleY = 2.18166156F;
		tigerModel[392].rotateAngleZ = -1.57079633F;

		tigerModel[393].addShapeBox(29F, 18F, -2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box248
		tigerModel[393].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[393].rotateAngleY = 2.18166156F;
		tigerModel[393].rotateAngleZ = -1.57079633F;

		tigerModel[394].addShapeBox(29F, 18F, 1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box249
		tigerModel[394].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[394].rotateAngleY = 2.18166156F;
		tigerModel[394].rotateAngleZ = -1.57079633F;

		tigerModel[395].addShapeBox(24F, 18F, -2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box250
		tigerModel[395].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[395].rotateAngleY = 2.18166156F;
		tigerModel[395].rotateAngleZ = -1.57079633F;

		tigerModel[396].addShapeBox(24F, 18F, 1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box251
		tigerModel[396].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[396].rotateAngleY = 2.18166156F;
		tigerModel[396].rotateAngleZ = -1.57079633F;

		tigerModel[397].addShapeBox(23.5F, 21F, -3F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box252
		tigerModel[397].setRotationPoint(0F, 0F, 0F);
		tigerModel[397].rotateAngleY = 2.18166156F;
		tigerModel[397].rotateAngleZ = -1.57079633F;

		tigerModel[398].addShapeBox(22F, 20.5F, 0F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box253
		tigerModel[398].setRotationPoint(0F, 0F, 0F);
		tigerModel[398].rotateAngleY = 2.18166156F;
		tigerModel[398].rotateAngleZ = -1.57079633F;

		tigerModel[399].addShapeBox(22F, 20.5F, 3F, 12, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box254
		tigerModel[399].setRotationPoint(0F, 0F, 0F);
		tigerModel[399].rotateAngleY = 2.18166156F;
		tigerModel[399].rotateAngleZ = -1.57079633F;

		tigerModel[400].addShapeBox(10F, -36F, -13F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		tigerModel[400].setRotationPoint(-2F, 0F, 0F);

		tigerModel[401].addShapeBox(15.8F, -36F, -13.5F, 1, 1, 4, 0F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F); // Import Box1
		tigerModel[401].setRotationPoint(-8F, 0F, 0F);

		tigerModel[402].addShapeBox(28.5F, 21F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		tigerModel[402].setRotationPoint(0F, 0F, 0F);
		tigerModel[402].rotateAngleY = 5.16617459F;
		tigerModel[402].rotateAngleZ = -1.57079633F;

		tigerModel[403].addShapeBox(23.5F, 21F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		tigerModel[403].setRotationPoint(0F, 0F, 0F);
		tigerModel[403].rotateAngleY = 5.16617459F;
		tigerModel[403].rotateAngleZ = -1.57079633F;

		tigerModel[404].addShapeBox(22F, 20.5F, -5F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		tigerModel[404].setRotationPoint(0F, 0F, 0F);
		tigerModel[404].rotateAngleY = 5.16617459F;
		tigerModel[404].rotateAngleZ = -1.57079633F;

		tigerModel[405].addShapeBox(29F, 18F, -5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box43
		tigerModel[405].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[405].rotateAngleY = 5.16617459F;
		tigerModel[405].rotateAngleZ = -1.57079633F;

		tigerModel[406].addShapeBox(29F, 18F, -2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box44
		tigerModel[406].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[406].rotateAngleY = 5.16617459F;
		tigerModel[406].rotateAngleZ = -1.57079633F;

		tigerModel[407].addShapeBox(24F, 18F, -5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box45
		tigerModel[407].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[407].rotateAngleY = 5.16617459F;
		tigerModel[407].rotateAngleZ = -1.57079633F;

		tigerModel[408].addShapeBox(24F, 18F, -2F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box46
		tigerModel[408].setRotationPoint(3.5F, -1F, 0F);
		tigerModel[408].rotateAngleY = 5.16617459F;
		tigerModel[408].rotateAngleZ = -1.57079633F;

		tigerModel[409].addShapeBox(22F, 20.5F, -6F, 12, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		tigerModel[409].setRotationPoint(0F, 0F, 0F);
		tigerModel[409].rotateAngleY = 5.16617459F;
		tigerModel[409].rotateAngleZ = -1.57079633F;

		tigerModel[410].addShapeBox(22F, 20.5F, -2F, 12, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		tigerModel[410].setRotationPoint(0F, 0F, 0F);
		tigerModel[410].rotateAngleY = 5.16617459F;
		tigerModel[410].rotateAngleZ = -1.57079633F;

		tigerModel[411].addShapeBox(22F, 20.5F, -3F, 12, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		tigerModel[411].setRotationPoint(0F, 0F, 0F);
		tigerModel[411].rotateAngleY = 5.16617459F;
		tigerModel[411].rotateAngleZ = -1.57079633F;

		tigerModel[412].addShapeBox(-1F, -2F, -11F, 2, 8, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		tigerModel[412].setRotationPoint(22.5F, -29.5F, 0F);

		tigerModel[413].addShapeBox(0.5F, -2F, -10F, 1, 8, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		tigerModel[413].setRotationPoint(22.5F, -29.5F, 0F);

		tigerModel[414].addShapeBox(1.5F, -1F, -4F, 1, 6, 8, 0F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Import Box20
		tigerModel[414].setRotationPoint(22.5F, -29.5F, 0F);

		tigerModel[415].addShapeBox(2.5F, -1F, -2F, 14, 4, 4, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Import Box21
		tigerModel[415].setRotationPoint(22.5F, -28.5F, 0F);

		tigerModel[416].addShapeBox(16.5F, -1F, -2F, 15, 4, 4, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box22
		tigerModel[416].setRotationPoint(22.5F, -28.5F, 0F);

		tigerModel[417].addShapeBox(31.5F, -1F, -2F, 28, 4, 4, 0F, 0F, -0.6F, -0.6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.6F, -0.6F); // Import Box23
		tigerModel[417].setRotationPoint(22.5F, -28.5F, 0F);

		tigerModel[418].addShapeBox(31.5F, -1F, -2F, 1, 4, 4, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F); // Import Box24
		tigerModel[418].setRotationPoint(22.5F, -28.5F, 0F);

		tigerModel[419].addShapeBox(16.5F, -1F, -2F, 1, 4, 4, 0F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0.3F); // Import Box26
		tigerModel[419].setRotationPoint(22.5F, -28.5F, 0F);

		tigerModel[420].addShapeBox(2.5F, -0.5F, -2.5F, 1, 5, 5, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Import Box27
		tigerModel[420].setRotationPoint(22.5F, -29.5F, 0F);

		tigerModel[421].addShapeBox(59.5F, -1F, -2F, 3, 4, 4, 0F, 0F, -1F, -1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, -1F, -1F); // Import Box48
		tigerModel[421].setRotationPoint(22.5F, -28.5F, 0F);

		tigerModel[422].addShapeBox(62.5F, -0.5F, -1.5F, 2, 3, 3, 0F, 0F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box49
		tigerModel[422].setRotationPoint(22.5F, -28.5F, 0F);

		tigerModel[423].addShapeBox(66.5F, -1.5F, -2F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Import Box50
		tigerModel[423].setRotationPoint(22.5F, -28F, 0F);

		tigerModel[424].addBox(-2F, 0F, 0F, 7, 1, 12, 0F); // Import Box70
		tigerModel[424].setRotationPoint(-47F, -7F, -31F);
		tigerModel[424].rotateAngleZ = -0.40142573F;

		tigerModel[425].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box71
		tigerModel[425].setRotationPoint(-48.9F, -6.3F, -31F);
		tigerModel[425].rotateAngleZ = -1.01229097F;

		tigerModel[426].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box72
		tigerModel[426].setRotationPoint(-50F, -4.6F, -31F);
		tigerModel[426].rotateAngleZ = -1.50098316F;

		tigerModel[427].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box73
		tigerModel[427].setRotationPoint(-50.2F, -2.6F, -31F);
		tigerModel[427].rotateAngleZ = -1.58824962F;

		tigerModel[428].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box74
		tigerModel[428].setRotationPoint(-50.2F, -0.6F, -31F);
		tigerModel[428].rotateAngleZ = -1.76278254F;

		tigerModel[429].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box75
		tigerModel[429].setRotationPoint(-49.8F, 1.4F, -31F);
		tigerModel[429].rotateAngleZ = -2.23402144F;

		tigerModel[430].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Import Box76
		tigerModel[430].setRotationPoint(-48.6F, 3F, -31F);
		tigerModel[430].rotateAngleZ = -2.47836754F;

		tigerModel[431].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Import Box77
		tigerModel[431].setRotationPoint(-44.7F, 6F, -31F);
		tigerModel[431].rotateAngleZ = -2.72271363F;

		tigerModel[432].addBox(0F, 0F, 0F, 77, 1, 12, 0F); // Import Box78
		tigerModel[432].setRotationPoint(-40.4F, 7F, -31F);

		tigerModel[433].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Import Box79
		tigerModel[433].setRotationPoint(48.6F, -0.1F, -31F);
		tigerModel[433].rotateAngleZ = -1.48352986F;

		tigerModel[434].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box80
		tigerModel[434].setRotationPoint(48.9F, -4.1F, -31F);
		tigerModel[434].rotateAngleZ = -1.79768913F;

		tigerModel[435].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Import Box81
		tigerModel[435].setRotationPoint(48F, 1.9F, -31F);
		tigerModel[435].rotateAngleZ = -1.25663706F;

		tigerModel[436].addBox(0F, -1F, 0F, 11, 1, 12, 0F); // Import Box82
		tigerModel[436].setRotationPoint(36.6F, 8F, -31F);
		tigerModel[436].rotateAngleZ = -0.43633231F;

		tigerModel[437].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Import Box83
		tigerModel[437].setRotationPoint(46.6F, 3.3F, -31F);
		tigerModel[437].rotateAngleZ = -0.80285146F;

		tigerModel[438].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box84
		tigerModel[438].setRotationPoint(48.2F, -7.1F, -31F);
		tigerModel[438].rotateAngleZ = -2.32128791F;

		tigerModel[439].addBox(0F, 0F, 0F, 75, 1, 12, 0F); // Import Box87
		tigerModel[439].setRotationPoint(-42.4F, -9F, -31F);

		tigerModel[440].addBox(0F, -1F, 0F, 6, 1, 12, 0F); // Import Box267
		tigerModel[440].setRotationPoint(38.3F, -10.1F, -31F);
		tigerModel[440].rotateAngleZ = -3.33357887F;

		tigerModel[441].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box268
		tigerModel[441].setRotationPoint(41.2F, -10.1F, -31F);
		tigerModel[441].rotateAngleZ = -3.14159265F;

		tigerModel[442].addBox(0F, -1F, 0F, 5, 1, 12, 0F); // Import Box269
		tigerModel[442].setRotationPoint(46.1F, -9.3F, -31F);
		tigerModel[442].rotateAngleZ = -2.98451302F;

		tigerModel[443].addBox(0F, 0F, 0F, 75, 1, 12, 0F); // Import Box51
		tigerModel[443].setRotationPoint(-42.4F, -9F, 19F);

		tigerModel[444].addBox(-2F, 0F, 0F, 7, 1, 12, 0F); // Import Box52
		tigerModel[444].setRotationPoint(-47F, -7F, 19F);
		tigerModel[444].rotateAngleZ = -0.40142573F;

		tigerModel[445].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box53
		tigerModel[445].setRotationPoint(-48.9F, -6.3F, 19F);
		tigerModel[445].rotateAngleZ = -1.01229097F;

		tigerModel[446].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box54
		tigerModel[446].setRotationPoint(-50F, -4.6F, 19F);
		tigerModel[446].rotateAngleZ = -1.50098316F;

		tigerModel[447].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box55
		tigerModel[447].setRotationPoint(-50.2F, -2.6F, 19F);
		tigerModel[447].rotateAngleZ = -1.58824962F;

		tigerModel[448].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box56
		tigerModel[448].setRotationPoint(-50.2F, -0.6F, 19F);
		tigerModel[448].rotateAngleZ = -1.76278254F;

		tigerModel[449].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box57
		tigerModel[449].setRotationPoint(-49.8F, 1.4F, 19F);
		tigerModel[449].rotateAngleZ = -2.23402144F;

		tigerModel[450].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Import Box58
		tigerModel[450].setRotationPoint(-48.6F, 3F, 19F);
		tigerModel[450].rotateAngleZ = -2.47836754F;

		tigerModel[451].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Import Box59
		tigerModel[451].setRotationPoint(-44.7F, 6F, 19F);
		tigerModel[451].rotateAngleZ = -2.72271363F;

		tigerModel[452].addBox(0F, 0F, 0F, 77, 1, 12, 0F); // Import Box60
		tigerModel[452].setRotationPoint(-40.4F, 7F, 19F);

		tigerModel[453].addBox(0F, -1F, 0F, 11, 1, 12, 0F); // Import Box61
		tigerModel[453].setRotationPoint(36.6F, 8F, 19F);
		tigerModel[453].rotateAngleZ = -0.43633231F;

		tigerModel[454].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Import Box62
		tigerModel[454].setRotationPoint(46.6F, 3.3F, 19F);
		tigerModel[454].rotateAngleZ = -0.80285146F;

		tigerModel[455].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Import Box63
		tigerModel[455].setRotationPoint(48F, 1.9F, 19F);
		tigerModel[455].rotateAngleZ = -1.25663706F;

		tigerModel[456].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Import Box64
		tigerModel[456].setRotationPoint(48.6F, -0.1F, 19F);
		tigerModel[456].rotateAngleZ = -1.48352986F;

		tigerModel[457].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box65
		tigerModel[457].setRotationPoint(48.9F, -4.1F, 19F);
		tigerModel[457].rotateAngleZ = -1.79768913F;

		tigerModel[458].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box66
		tigerModel[458].setRotationPoint(48.2F, -7.1F, 19F);
		tigerModel[458].rotateAngleZ = -2.32128791F;

		tigerModel[459].addBox(0F, -1F, 0F, 5, 1, 12, 0F); // Import Box67
		tigerModel[459].setRotationPoint(46.1F, -9.3F, 19F);
		tigerModel[459].rotateAngleZ = -2.98451302F;

		tigerModel[460].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box68
		tigerModel[460].setRotationPoint(41.2F, -10.1F, 19F);
		tigerModel[460].rotateAngleZ = -3.14159265F;

		tigerModel[461].addBox(0F, -1F, 0F, 6, 1, 12, 0F); // Import Box69
		tigerModel[461].setRotationPoint(38.3F, -10.1F, 19F);
		tigerModel[461].rotateAngleZ = -3.33357887F;

		tigerModel[462].addShapeBox(-6F, 4.5F, -3F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box17
		tigerModel[462].setRotationPoint(-46F, -5F, 11F);

		tigerModel[463].addShapeBox(-6F, 3.5F, -3F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box18
		tigerModel[463].setRotationPoint(-46F, -5F, 11F);

		tigerModel[464].addShapeBox(-4F, -0.5F, -3F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		tigerModel[464].setRotationPoint(-46F, -5F, 11F);

		tigerModel[465].addShapeBox(-1F, -0.5F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		tigerModel[465].setRotationPoint(-46F, -5F, 11F);

		tigerModel[466].addShapeBox(-4F, -0.5F, 2F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		tigerModel[466].setRotationPoint(-46F, -5F, 11F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 467; i++)
		{
			tigerModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
	}

	public ModelRendererTurbo tigerModel[];
}