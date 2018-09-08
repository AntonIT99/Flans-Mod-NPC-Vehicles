//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Sherman
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSherman extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelSherman()
	{
		shermanModel = new ModelRendererTurbo[496];
		shermanModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		shermanModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box6
		shermanModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box7
		shermanModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box8
		shermanModel[4] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import Box9
		shermanModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box11
		shermanModel[6] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import Box12
		shermanModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box13
		shermanModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box15
		shermanModel[9] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import Box16
		shermanModel[10] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box19
		shermanModel[11] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box22
		shermanModel[12] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import Box23
		shermanModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box24
		shermanModel[14] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box42
		shermanModel[15] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box43
		shermanModel[16] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box44
		shermanModel[17] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import Box45
		shermanModel[18] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box52
		shermanModel[19] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box53
		shermanModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box56
		shermanModel[21] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import Box42
		shermanModel[22] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box43
		shermanModel[23] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box60
		shermanModel[24] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box61
		shermanModel[25] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box63
		shermanModel[26] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box64
		shermanModel[27] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box65
		shermanModel[28] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box66
		shermanModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box67
		shermanModel[30] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box75
		shermanModel[31] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box77
		shermanModel[32] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import Box78
		shermanModel[33] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import Box79
		shermanModel[34] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Import Box80
		shermanModel[35] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Import Box81
		shermanModel[36] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import Box82
		shermanModel[37] = new ModelRendererTurbo(this, 473, 121, textureX, textureY); // Import Box83
		shermanModel[38] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Import Box84
		shermanModel[39] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box85
		shermanModel[40] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Import Box86
		shermanModel[41] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box87
		shermanModel[42] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box88
		shermanModel[43] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Import Box89
		shermanModel[44] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Import Box90
		shermanModel[45] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box91
		shermanModel[46] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box92
		shermanModel[47] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Import Box93
		shermanModel[48] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box94
		shermanModel[49] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box95
		shermanModel[50] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box96
		shermanModel[51] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Import Box98
		shermanModel[52] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box99
		shermanModel[53] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box100
		shermanModel[54] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import Box102
		shermanModel[55] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box103
		shermanModel[56] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box104
		shermanModel[57] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box105
		shermanModel[58] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box106
		shermanModel[59] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import Box107
		shermanModel[60] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Import Box108
		shermanModel[61] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box109
		shermanModel[62] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import Box110
		shermanModel[63] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Box111
		shermanModel[64] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box112
		shermanModel[65] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Import Box113
		shermanModel[66] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Import Box114
		shermanModel[67] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box115
		shermanModel[68] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import Box117
		shermanModel[69] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Import Box118
		shermanModel[70] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box119
		shermanModel[71] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box112
		shermanModel[72] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import Box113
		shermanModel[73] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import Box114
		shermanModel[74] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import Box115
		shermanModel[75] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Import Box116
		shermanModel[76] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box117
		shermanModel[77] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import Box118
		shermanModel[78] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Import Box119
		shermanModel[79] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box120
		shermanModel[80] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box121
		shermanModel[81] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box122
		shermanModel[82] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Import Box123
		shermanModel[83] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import Box124
		shermanModel[84] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box125
		shermanModel[85] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box126
		shermanModel[86] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box127
		shermanModel[87] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box128
		shermanModel[88] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import Box129
		shermanModel[89] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box130
		shermanModel[90] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Import Box131
		shermanModel[91] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box132
		shermanModel[92] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Import Box133
		shermanModel[93] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import Box134
		shermanModel[94] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Import Box135
		shermanModel[95] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import Box136
		shermanModel[96] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Import Box137
		shermanModel[97] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box138
		shermanModel[98] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box139
		shermanModel[99] = new ModelRendererTurbo(this, 225, 137, textureX, textureY); // Import Box140
		shermanModel[100] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import Box141
		shermanModel[101] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Import Box142
		shermanModel[102] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Import Box143
		shermanModel[103] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box144
		shermanModel[104] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box145
		shermanModel[105] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import Box146
		shermanModel[106] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Import Box147
		shermanModel[107] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box148
		shermanModel[108] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Import Box149
		shermanModel[109] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import Box150
		shermanModel[110] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box151
		shermanModel[111] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Import Box152
		shermanModel[112] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box153
		shermanModel[113] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Import Box154
		shermanModel[114] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Import Box155
		shermanModel[115] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Import Box156
		shermanModel[116] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Import Box157
		shermanModel[117] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Import Box158
		shermanModel[118] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Import Box159
		shermanModel[119] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box160
		shermanModel[120] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box161
		shermanModel[121] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box162
		shermanModel[122] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box163
		shermanModel[123] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import Box164
		shermanModel[124] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Import Box165
		shermanModel[125] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Import Box166
		shermanModel[126] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Import Box167
		shermanModel[127] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Import Box168
		shermanModel[128] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Import Box169
		shermanModel[129] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Import Box170
		shermanModel[130] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Import Box171
		shermanModel[131] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Import Box172
		shermanModel[132] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Import Box173
		shermanModel[133] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Import Box174
		shermanModel[134] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box175
		shermanModel[135] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box176
		shermanModel[136] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import Box177
		shermanModel[137] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box178
		shermanModel[138] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Import Box179
		shermanModel[139] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box180
		shermanModel[140] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Import Box181
		shermanModel[141] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Import Box182
		shermanModel[142] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Import Box183
		shermanModel[143] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Import Box184
		shermanModel[144] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Import Box185
		shermanModel[145] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Import Box186
		shermanModel[146] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Import Box187
		shermanModel[147] = new ModelRendererTurbo(this, 273, 185, textureX, textureY); // Import Box188
		shermanModel[148] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Import Box189
		shermanModel[149] = new ModelRendererTurbo(this, 41, 193, textureX, textureY); // Import Box190
		shermanModel[150] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Import Box191
		shermanModel[151] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Import Box192
		shermanModel[152] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Import Box193
		shermanModel[153] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Import Box194
		shermanModel[154] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Import Box195
		shermanModel[155] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Import Box196
		shermanModel[156] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Import Box197
		shermanModel[157] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Import Box198
		shermanModel[158] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Import Box199
		shermanModel[159] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Import Box200
		shermanModel[160] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Import Box201
		shermanModel[161] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Import Box202
		shermanModel[162] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Import Box203
		shermanModel[163] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box204
		shermanModel[164] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import Box205
		shermanModel[165] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box206
		shermanModel[166] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Import Box207
		shermanModel[167] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Import Box208
		shermanModel[168] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import Box209
		shermanModel[169] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Import Box210
		shermanModel[170] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Import Box211
		shermanModel[171] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Import Box212
		shermanModel[172] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Import Box213
		shermanModel[173] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box214
		shermanModel[174] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import Box215
		shermanModel[175] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Import Box216
		shermanModel[176] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Import Box217
		shermanModel[177] = new ModelRendererTurbo(this, 281, 201, textureX, textureY); // Import Box218
		shermanModel[178] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Import Box219
		shermanModel[179] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box220
		shermanModel[180] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Import Box221
		shermanModel[181] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import Box222
		shermanModel[182] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box223
		shermanModel[183] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Import Box224
		shermanModel[184] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import Box225
		shermanModel[185] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Import Box226
		shermanModel[186] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Import Box227
		shermanModel[187] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Import Box228
		shermanModel[188] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Import Box229
		shermanModel[189] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Import Box230
		shermanModel[190] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Import Box231
		shermanModel[191] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Import Box232
		shermanModel[192] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Import Box233
		shermanModel[193] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Import Box234
		shermanModel[194] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Import Box235
		shermanModel[195] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Import Box236
		shermanModel[196] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Import Box237
		shermanModel[197] = new ModelRendererTurbo(this, 17, 201, textureX, textureY); // Import Box238
		shermanModel[198] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Import Box239
		shermanModel[199] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Import Box240
		shermanModel[200] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Import Box241
		shermanModel[201] = new ModelRendererTurbo(this, 265, 217, textureX, textureY); // Import Box242
		shermanModel[202] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Import Box243
		shermanModel[203] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Import Box290
		shermanModel[204] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box300
		shermanModel[205] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box301
		shermanModel[206] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box302
		shermanModel[207] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box303
		shermanModel[208] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box304
		shermanModel[209] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box308
		shermanModel[210] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box311
		shermanModel[211] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box312
		shermanModel[212] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Import Box313
		shermanModel[213] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Import Box314
		shermanModel[214] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box315
		shermanModel[215] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box316
		shermanModel[216] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box317
		shermanModel[217] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Import Box318
		shermanModel[218] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box68
		shermanModel[219] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box69
		shermanModel[220] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box70
		shermanModel[221] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box73
		shermanModel[222] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box74
		shermanModel[223] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box75
		shermanModel[224] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box76
		shermanModel[225] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box77
		shermanModel[226] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box79
		shermanModel[227] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box80
		shermanModel[228] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box81
		shermanModel[229] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box82
		shermanModel[230] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box83
		shermanModel[231] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box84
		shermanModel[232] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box85
		shermanModel[233] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box86
		shermanModel[234] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box87
		shermanModel[235] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box88
		shermanModel[236] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box89
		shermanModel[237] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box90
		shermanModel[238] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box91
		shermanModel[239] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box92
		shermanModel[240] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box93
		shermanModel[241] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box94
		shermanModel[242] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box95
		shermanModel[243] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box96
		shermanModel[244] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box97
		shermanModel[245] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box98
		shermanModel[246] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box99
		shermanModel[247] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box100
		shermanModel[248] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box101
		shermanModel[249] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box102
		shermanModel[250] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box103
		shermanModel[251] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box104
		shermanModel[252] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box105
		shermanModel[253] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box106
		shermanModel[254] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box107
		shermanModel[255] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box108
		shermanModel[256] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box109
		shermanModel[257] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box110
		shermanModel[258] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box111
		shermanModel[259] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box112
		shermanModel[260] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box113
		shermanModel[261] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box114
		shermanModel[262] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box115
		shermanModel[263] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box116
		shermanModel[264] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box117
		shermanModel[265] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box118
		shermanModel[266] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box119
		shermanModel[267] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box120
		shermanModel[268] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box121
		shermanModel[269] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box122
		shermanModel[270] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box123
		shermanModel[271] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box124
		shermanModel[272] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box125
		shermanModel[273] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box126
		shermanModel[274] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box127
		shermanModel[275] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box128
		shermanModel[276] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box129
		shermanModel[277] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box130
		shermanModel[278] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box131
		shermanModel[279] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box132
		shermanModel[280] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box133
		shermanModel[281] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box134
		shermanModel[282] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box135
		shermanModel[283] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box136
		shermanModel[284] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box137
		shermanModel[285] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box138
		shermanModel[286] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box139
		shermanModel[287] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box140
		shermanModel[288] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box141
		shermanModel[289] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box142
		shermanModel[290] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box143
		shermanModel[291] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box144
		shermanModel[292] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box145
		shermanModel[293] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box146
		shermanModel[294] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box147
		shermanModel[295] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box148
		shermanModel[296] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box149
		shermanModel[297] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box150
		shermanModel[298] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box151
		shermanModel[299] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box152
		shermanModel[300] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box153
		shermanModel[301] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box154
		shermanModel[302] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box155
		shermanModel[303] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box156
		shermanModel[304] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box157
		shermanModel[305] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box158
		shermanModel[306] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box159
		shermanModel[307] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box160
		shermanModel[308] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box161
		shermanModel[309] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box162
		shermanModel[310] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box163
		shermanModel[311] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box164
		shermanModel[312] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box165
		shermanModel[313] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box166
		shermanModel[314] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box167
		shermanModel[315] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box168
		shermanModel[316] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box169
		shermanModel[317] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box170
		shermanModel[318] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box171
		shermanModel[319] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box172
		shermanModel[320] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box173
		shermanModel[321] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box174
		shermanModel[322] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box175
		shermanModel[323] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box176
		shermanModel[324] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box177
		shermanModel[325] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box178
		shermanModel[326] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box25
		shermanModel[327] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box27
		shermanModel[328] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import Box28
		shermanModel[329] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box31
		shermanModel[330] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import Box32
		shermanModel[331] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import Box33
		shermanModel[332] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Import Box34
		shermanModel[333] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Import Box35
		shermanModel[334] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box36
		shermanModel[335] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Import Box37
		shermanModel[336] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box39
		shermanModel[337] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box47
		shermanModel[338] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box48
		shermanModel[339] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import Box49
		shermanModel[340] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box50
		shermanModel[341] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box51
		shermanModel[342] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box45
		shermanModel[343] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box46
		shermanModel[344] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box47
		shermanModel[345] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box48
		shermanModel[346] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import Box49
		shermanModel[347] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box50
		shermanModel[348] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box51
		shermanModel[349] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box52
		shermanModel[350] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box53
		shermanModel[351] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box54
		shermanModel[352] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box55
		shermanModel[353] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box56
		shermanModel[354] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box57
		shermanModel[355] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box58
		shermanModel[356] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box69
		shermanModel[357] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box70
		shermanModel[358] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box71
		shermanModel[359] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box72
		shermanModel[360] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box76
		shermanModel[361] = new ModelRendererTurbo(this, 40, 290, textureX, textureY); // Import Box288
		shermanModel[362] = new ModelRendererTurbo(this, 42, 298, textureX, textureY); // Import Box289
		shermanModel[363] = new ModelRendererTurbo(this, 0, 301, textureX, textureY); // Import Box290
		shermanModel[364] = new ModelRendererTurbo(this, 0, 301, textureX, textureY); // Import Box291
		shermanModel[365] = new ModelRendererTurbo(this, 26, 300, textureX, textureY); // Import Box292
		shermanModel[366] = new ModelRendererTurbo(this, 17, 312, textureX, textureY); // Import Box293
		shermanModel[367] = new ModelRendererTurbo(this, 0, 290, textureX, textureY); // Import Box294
		shermanModel[368] = new ModelRendererTurbo(this, 24, 290, textureX, textureY); // Import Box295
		shermanModel[369] = new ModelRendererTurbo(this, 24, 290, textureX, textureY); // Import Box296
		shermanModel[370] = new ModelRendererTurbo(this, 0, 306, textureX, textureY); // Import Box297
		shermanModel[371] = new ModelRendererTurbo(this, 0, 295, textureX, textureY); // Import Box299
		shermanModel[372] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box42
		shermanModel[373] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box42
		shermanModel[374] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box42
		shermanModel[375] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box42
		shermanModel[376] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box42
		shermanModel[377] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box42
		shermanModel[378] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box42
		shermanModel[379] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box42
		shermanModel[380] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box8
		shermanModel[381] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box9
		shermanModel[382] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box10
		shermanModel[383] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box11
		shermanModel[384] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box12
		shermanModel[385] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box13
		shermanModel[386] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box14
		shermanModel[387] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box15
		shermanModel[388] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box16
		shermanModel[389] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box17
		shermanModel[390] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box18
		shermanModel[391] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box19
		shermanModel[392] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box20
		shermanModel[393] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box21
		shermanModel[394] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box22
		shermanModel[395] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box23
		shermanModel[396] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box24
		shermanModel[397] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box25
		shermanModel[398] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box26
		shermanModel[399] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box27
		shermanModel[400] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box28
		shermanModel[401] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box29
		shermanModel[402] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box30
		shermanModel[403] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box31
		shermanModel[404] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box32
		shermanModel[405] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box33
		shermanModel[406] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box34
		shermanModel[407] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box35
		shermanModel[408] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box36
		shermanModel[409] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box37
		shermanModel[410] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box38
		shermanModel[411] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box39
		shermanModel[412] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box40
		shermanModel[413] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box41
		shermanModel[414] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box42
		shermanModel[415] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box43
		shermanModel[416] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box44
		shermanModel[417] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box45
		shermanModel[418] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box46
		shermanModel[419] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box47
		shermanModel[420] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box48
		shermanModel[421] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box49
		shermanModel[422] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box50
		shermanModel[423] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box51
		shermanModel[424] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box52
		shermanModel[425] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box53
		shermanModel[426] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box54
		shermanModel[427] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box55
		shermanModel[428] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box56
		shermanModel[429] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box57
		shermanModel[430] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box58
		shermanModel[431] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box59
		shermanModel[432] = new ModelRendererTurbo(this, 0, 325, textureX, textureY); // Import Box60
		shermanModel[433] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box61
		shermanModel[434] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Import Box62
		shermanModel[435] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box63
		shermanModel[436] = new ModelRendererTurbo(this, 20, 400, textureX, textureY); // Import Box4
		shermanModel[437] = new ModelRendererTurbo(this, 36, 400, textureX, textureY); // Import Box5
		shermanModel[438] = new ModelRendererTurbo(this, 36, 400, textureX, textureY); // Import Box7
		shermanModel[439] = new ModelRendererTurbo(this, 4, 408, textureX, textureY); // Import Box8
		shermanModel[440] = new ModelRendererTurbo(this, 52, 400, textureX, textureY); // Import Box9
		shermanModel[441] = new ModelRendererTurbo(this, 60, 400, textureX, textureY); // Import Box10
		shermanModel[442] = new ModelRendererTurbo(this, 4, 408, textureX, textureY); // Import Box11
		shermanModel[443] = new ModelRendererTurbo(this, 30, 420, textureX, textureY); // Import Box299
		shermanModel[444] = new ModelRendererTurbo(this, 60, 408, textureX, textureY); // Import Box13
		shermanModel[445] = new ModelRendererTurbo(this, 44, 416, textureX, textureY); // Import Box14
		shermanModel[446] = new ModelRendererTurbo(this, 52, 416, textureX, textureY); // Import Box15
		shermanModel[447] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box38
		shermanModel[448] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box40
		shermanModel[449] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box41
		shermanModel[450] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box54
		shermanModel[451] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box55
		shermanModel[452] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Import Box268
		shermanModel[453] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Import Box269
		shermanModel[454] = new ModelRendererTurbo(this, 305, 249, textureX, textureY); // Import Box270
		shermanModel[455] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Import Box271
		shermanModel[456] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Import Box272
		shermanModel[457] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Import Box273
		shermanModel[458] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Import Box274
		shermanModel[459] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Import Box275
		shermanModel[460] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Import Box276
		shermanModel[461] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Import Box277
		shermanModel[462] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Box278
		shermanModel[463] = new ModelRendererTurbo(this, 33, 257, textureX, textureY); // Import Box279
		shermanModel[464] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Import Box280
		shermanModel[465] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Import Box281
		shermanModel[466] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Import Box282
		shermanModel[467] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Import Box283
		shermanModel[468] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Import Box284
		shermanModel[469] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Import Box285
		shermanModel[470] = new ModelRendererTurbo(this, 289, 257, textureX, textureY); // Import Box286
		shermanModel[471] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Import Box287
		shermanModel[472] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Import Box288
		shermanModel[473] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box289
		shermanModel[474] = new ModelRendererTurbo(this, 393, 217, textureX, textureY); // Import Box244
		shermanModel[475] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Import Box245
		shermanModel[476] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Import Box246
		shermanModel[477] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Import Box247
		shermanModel[478] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box248
		shermanModel[479] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Import Box249
		shermanModel[480] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Import Box250
		shermanModel[481] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Import Box252
		shermanModel[482] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Import Box253
		shermanModel[483] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Import Box255
		shermanModel[484] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Import Box256
		shermanModel[485] = new ModelRendererTurbo(this, 265, 225, textureX, textureY); // Import Box257
		shermanModel[486] = new ModelRendererTurbo(this, 201, 225, textureX, textureY); // Import Box258
		shermanModel[487] = new ModelRendererTurbo(this, 225, 233, textureX, textureY); // Import Box259
		shermanModel[488] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Import Box260
		shermanModel[489] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Import Box261
		shermanModel[490] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Import Box262
		shermanModel[491] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Import Box263
		shermanModel[492] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Import Box264
		shermanModel[493] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box265
		shermanModel[494] = new ModelRendererTurbo(this, 457, 233, textureX, textureY); // Import Box266
		shermanModel[495] = new ModelRendererTurbo(this, 265, 241, textureX, textureY); // Import Box267

		shermanModel[0].addShapeBox(0F, 0F, 0F, 24, 11, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 60F, 1F, 0F, 15F, 4F, 0F, 15F, 4F, 0F, 60F, 1F, 0F); // Import Box0
		shermanModel[0].setRotationPoint(6F, -24F, -24F);

		shermanModel[1].addBox(-71F, 0F, 0F, 91, 14, 28, 0F); // Import Box6
		shermanModel[1].setRotationPoint(20F, -12F, -14F);

		shermanModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 28, 0F, 0F, 5F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box7
		shermanModel[2].setRotationPoint(38F, -8F, -14F);

		shermanModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		shermanModel[3].setRotationPoint(40F, -7F, -14F);

		shermanModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 28, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F); // Import Box9
		shermanModel[4].setRotationPoint(40F, -3F, -14F);

		shermanModel[5].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Import Box11
		shermanModel[5].setRotationPoint(-55F, -12.5F, -27F);

		shermanModel[6].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Import Box12
		shermanModel[6].setRotationPoint(-55F, -12.5F, 13F);

		shermanModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 4F, 0F); // Import Box13
		shermanModel[7].setRotationPoint(42F, -12.5F, -27F);

		shermanModel[8].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Import Box15
		shermanModel[8].setRotationPoint(-55F, -11.5F, -27F);

		shermanModel[9].addBox(67F, 0F, 0F, 97, 4, 1, 0F); // Import Box16
		shermanModel[9].setRotationPoint(-122F, -11.5F, 26F);

		shermanModel[10].addShapeBox(0F, 0F, 0F, 22, 11, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 35F, -5F, 0F, -60F, 1F, 0F, -60F, 1F, 0F, 35F, -5F, -6F); // Import Box19
		shermanModel[10].setRotationPoint(-16F, -24F, 0F);

		shermanModel[11].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Import Box22
		shermanModel[11].setRotationPoint(-55F, -11.5F, -14F);

		shermanModel[12].addShapeBox(0F, 0F, 0F, 97, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		shermanModel[12].setRotationPoint(-55F, -11.5F, 13F);

		shermanModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 4F, 0F); // Import Box24
		shermanModel[13].setRotationPoint(42F, -12.5F, 13F);

		shermanModel[14].addShapeBox(0F, 0F, 0F, 22, 11, 24, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 35F, -5F, -6F, -60F, 1F, 0F, -60F, 1F, 0F, 35F, -5F, 0F); // Import Box42
		shermanModel[14].setRotationPoint(-16F, -24F, -24F);

		shermanModel[15].addBox(0F, 0F, 0F, 5, 1, 26, 0F); // Import Box43
		shermanModel[15].setRotationPoint(-55F, -12.5F, -13F);

		shermanModel[16].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box44
		shermanModel[16].setRotationPoint(18F, -25F, 8F);

		shermanModel[17].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box45
		shermanModel[17].setRotationPoint(18F, -25F, -18F);

		shermanModel[18].addBox(0F, 0F, 0F, 5, 5, 6, 0F); // Import Box52
		shermanModel[18].setRotationPoint(33F, -21F, -14F);

		shermanModel[19].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box53
		shermanModel[19].setRotationPoint(38F, -20.5F, -13F);

		shermanModel[20].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box56
		shermanModel[20].setRotationPoint(39F, -18.8F, -11.5F);

		shermanModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, 5F, 0F); // Import Box42
		shermanModel[21].setRotationPoint(-57F, -12.5F, -27F);

		shermanModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, 5F, 0F); // Import Box43
		shermanModel[22].setRotationPoint(-57F, -12.5F, 13F);

		shermanModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		shermanModel[23].setRotationPoint(-52.3F, -9F, -10.5F);

		shermanModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		shermanModel[24].setRotationPoint(-52.4F, -9F, -0.5F);

		shermanModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		shermanModel[25].setRotationPoint(-52.4F, -10F, -11.5F);

		shermanModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		shermanModel[26].setRotationPoint(-52.4F, -10F, 10.5F);

		shermanModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		shermanModel[27].setRotationPoint(-52.4F, -10F, -10.5F);

		shermanModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		shermanModel[28].setRotationPoint(-52.4F, -1F, -10.5F);

		shermanModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		shermanModel[29].setRotationPoint(-53F, -6F, 0.1F);

		shermanModel[30].addShapeBox(4F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, -2F, -2F, 0F, -1F); // Import Box75
		shermanModel[30].setRotationPoint(35.4F, -13F, 5F);
		shermanModel[30].rotateAngleZ = 0.33161256F;

		shermanModel[31].addBox(0F, 0F, 0F, 7, 4, 14, 0F); // Import Box77
		shermanModel[31].setRotationPoint(43F, -14F, -2F);
		shermanModel[31].rotateAngleY = -0.05235988F;
		shermanModel[31].rotateAngleZ = 0.71558499F;

		shermanModel[32].addBox(0F, 0F, 0F, 7, 4, 14, 0F); // Import Box78
		shermanModel[32].setRotationPoint(43F, -16F, -15F);
		shermanModel[32].rotateAngleX = -0.20943951F;
		shermanModel[32].rotateAngleY = 0.03490659F;
		shermanModel[32].rotateAngleZ = 0.45378561F;

		shermanModel[33].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Import Box79
		shermanModel[33].setRotationPoint(38F, -19F, -1F);
		shermanModel[33].rotateAngleX = -0.05235988F;
		shermanModel[33].rotateAngleY = 0.06981317F;
		shermanModel[33].rotateAngleZ = 0.71558499F;

		shermanModel[34].addBox(0F, 0F, 0F, 4, 5, 9, 0F); // Import Box80
		shermanModel[34].setRotationPoint(40F, -17F, -11F);
		shermanModel[34].rotateAngleY = -0.17453293F;
		shermanModel[34].rotateAngleZ = 0.34906585F;

		shermanModel[35].addBox(0F, 0F, 0F, 8, 4, 12, 0F); // Import Box81
		shermanModel[35].setRotationPoint(34F, -20F, -8F);
		shermanModel[35].rotateAngleX = 0.10471976F;
		shermanModel[35].rotateAngleY = -0.13962634F;
		shermanModel[35].rotateAngleZ = 0.31415927F;

		shermanModel[36].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Import Box82
		shermanModel[36].setRotationPoint(35F, -21F, 6F);
		shermanModel[36].rotateAngleX = -0.19198622F;
		shermanModel[36].rotateAngleY = 0.34906585F;
		shermanModel[36].rotateAngleZ = 0.57595865F;

		shermanModel[37].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Import Box83
		shermanModel[37].setRotationPoint(30F, -24F, 6F);
		shermanModel[37].rotateAngleX = -0.12217305F;
		shermanModel[37].rotateAngleY = 0.06981317F;
		shermanModel[37].rotateAngleZ = 0.13962634F;

		shermanModel[38].addBox(0F, 0F, 0F, 8, 8, 16, 0F); // Import Box84
		shermanModel[38].setRotationPoint(31F, -25F, -8F);
		shermanModel[38].rotateAngleX = -0.15707963F;
		shermanModel[38].rotateAngleY = -0.13962634F;
		shermanModel[38].rotateAngleZ = 0.15707963F;

		shermanModel[39].addBox(0F, 0F, 0F, 7, 2, 11, 0F); // Import Box85
		shermanModel[39].setRotationPoint(37F, -24F, -19F);
		shermanModel[39].rotateAngleX = 0.08726646F;
		shermanModel[39].rotateAngleY = -0.2268928F;
		shermanModel[39].rotateAngleZ = 0.01745329F;

		shermanModel[40].addBox(0F, 0F, 0F, 9, 4, 8, 0F); // Import Box86
		shermanModel[40].setRotationPoint(37F, -17F, -21F);
		shermanModel[40].rotateAngleY = -0.17453293F;
		shermanModel[40].rotateAngleZ = 0.12217305F;

		shermanModel[41].addBox(0F, 0F, 0F, 8, 5, 5, 0F); // Import Box87
		shermanModel[41].setRotationPoint(37F, -15F, -25F);
		shermanModel[41].rotateAngleX = 0.2268928F;
		shermanModel[41].rotateAngleY = 0.19198622F;
		shermanModel[41].rotateAngleZ = -0.05235988F;

		shermanModel[42].addBox(0F, 0F, 0F, 4, 4, 9, 0F); // Import Box88
		shermanModel[42].setRotationPoint(40F, -16F, 14F);
		shermanModel[42].rotateAngleX = -0.10471976F;
		shermanModel[42].rotateAngleY = -0.19198622F;
		shermanModel[42].rotateAngleZ = 0.01745329F;

		shermanModel[43].addBox(0F, 0F, 0F, 7, 3, 10, 0F); // Import Box89
		shermanModel[43].setRotationPoint(35F, -21F, 14F);
		shermanModel[43].rotateAngleX = -0.20943951F;
		shermanModel[43].rotateAngleY = 0.29670597F;
		shermanModel[43].rotateAngleZ = 0.27925268F;

		shermanModel[44].addBox(0F, 0F, 0F, 7, 4, 9, 0F); // Import Box90
		shermanModel[44].setRotationPoint(31F, -24F, 14F);
		shermanModel[44].rotateAngleY = -0.12217305F;
		shermanModel[44].rotateAngleZ = 0.29670597F;

		shermanModel[45].addBox(0F, 0F, 0F, 6, 3, 11, 0F); // Import Box91
		shermanModel[45].setRotationPoint(31F, -24F, -23F);
		shermanModel[45].rotateAngleX = 0.10471976F;
		shermanModel[45].rotateAngleY = 0.10471976F;
		shermanModel[45].rotateAngleZ = 0.40142573F;

		shermanModel[46].addBox(0F, 0F, 0F, 5, 3, 8, 0F); // Import Box92
		shermanModel[46].setRotationPoint(35F, -19F, -23F);
		shermanModel[46].rotateAngleX = 0.08726646F;
		shermanModel[46].rotateAngleY = 0.29670597F;
		shermanModel[46].rotateAngleZ = 0.20943951F;

		shermanModel[47].addBox(0F, 0F, 0F, 6, 4, 10, 0F); // Import Box93
		shermanModel[47].setRotationPoint(31F, -26F, -1F);
		shermanModel[47].rotateAngleX = -0.03490659F;
		shermanModel[47].rotateAngleY = -0.2268928F;
		shermanModel[47].rotateAngleZ = 0.19198622F;

		shermanModel[48].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Import Box94
		shermanModel[48].setRotationPoint(21F, -25F, -20F);

		shermanModel[49].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box95
		shermanModel[49].setRotationPoint(34F, -25F, -20F);
		shermanModel[49].rotateAngleZ = 0.54105207F;

		shermanModel[50].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Box96
		shermanModel[50].setRotationPoint(39F, -22F, -20F);
		shermanModel[50].rotateAngleX = 0.03490659F;
		shermanModel[50].rotateAngleY = -0.33161256F;
		shermanModel[50].rotateAngleZ = 0.61086524F;

		shermanModel[51].addBox(-13F, 0F, 0F, 13, 1, 1, 0F); // Import Box98
		shermanModel[51].setRotationPoint(21F, -25F, -20F);
		shermanModel[51].rotateAngleY = 0.10471976F;

		shermanModel[52].addBox(-13F, 0F, -0.7F, 13, 1, 1, 0F); // Import Box99
		shermanModel[52].setRotationPoint(8.2F, -25F, -18F);
		shermanModel[52].rotateAngleY = -0.15707963F;

		shermanModel[53].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Import Box100
		shermanModel[53].setRotationPoint(33F, -25F, -19F);
		shermanModel[53].rotateAngleX = 0.10471976F;
		shermanModel[53].rotateAngleY = 0.05235988F;

		shermanModel[54].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Import Box102
		shermanModel[54].setRotationPoint(21F, -25F, 19F);

		shermanModel[55].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box103
		shermanModel[55].setRotationPoint(34F, -25F, 19F);
		shermanModel[55].rotateAngleZ = 0.54105207F;

		shermanModel[56].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Box104
		shermanModel[56].setRotationPoint(39F, -22F, 19F);
		shermanModel[56].rotateAngleX = -0.34906585F;
		shermanModel[56].rotateAngleY = 0.33161256F;
		shermanModel[56].rotateAngleZ = 0.6981317F;

		shermanModel[57].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Import Box105
		shermanModel[57].setRotationPoint(33.6F, -26.2F, -8.1F);
		shermanModel[57].rotateAngleY = 0.05235988F;

		shermanModel[58].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Import Box106
		shermanModel[58].setRotationPoint(34.2F, -26.2F, 2.9F);
		shermanModel[58].rotateAngleX = -0.26179939F;
		shermanModel[58].rotateAngleY = 0.13962634F;

		shermanModel[59].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Import Box107
		shermanModel[59].setRotationPoint(35.7F, -23.3F, 13.2F);
		shermanModel[59].rotateAngleY = 0.05235988F;

		shermanModel[60].addBox(-13F, 0F, 0F, 13, 1, 1, 0F); // Import Box108
		shermanModel[60].setRotationPoint(21F, -25F, 19F);
		shermanModel[60].rotateAngleY = 0.10471976F;

		shermanModel[61].addBox(-13F, 0F, 0.3F, 13, 1, 1, 0F); // Import Box109
		shermanModel[61].setRotationPoint(8.2F, -25F, 20F);
		shermanModel[61].rotateAngleY = -0.05235988F;

		shermanModel[62].addBox(0F, 0F, 0F, 15, 1, 9, 0F); // Import Box110
		shermanModel[62].setRotationPoint(30F, -23F, -16F);

		shermanModel[63].addBox(-1F, 0F, 0F, 1, 6, 1, 0F); // Import Box111
		shermanModel[63].setRotationPoint(45F, -22F, -16F);
		shermanModel[63].rotateAngleZ = 0.13962634F;

		shermanModel[64].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Import Box112
		shermanModel[64].setRotationPoint(46F, -15F, -17F);
		shermanModel[64].rotateAngleX = 0.10471976F;
		shermanModel[64].rotateAngleY = 0.05235988F;
		shermanModel[64].rotateAngleZ = 0.97738438F;

		shermanModel[65].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Import Box113
		shermanModel[65].setRotationPoint(47.6F, -15.7F, -6.1F);
		shermanModel[65].rotateAngleY = 0.05235988F;
		shermanModel[65].rotateAngleZ = 0.97738438F;

		shermanModel[66].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Import Box114
		shermanModel[66].setRotationPoint(48.2F, -15.7F, 4.9F);
		shermanModel[66].rotateAngleX = -0.26179939F;
		shermanModel[66].rotateAngleY = 0.08726646F;
		shermanModel[66].rotateAngleZ = 1.13446401F;

		shermanModel[67].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box115
		shermanModel[67].setRotationPoint(45.7F, -16.3F, 16.7F);
		shermanModel[67].rotateAngleX = -0.34906585F;
		shermanModel[67].rotateAngleY = 0.17453293F;
		shermanModel[67].rotateAngleZ = 1.22173048F;

		shermanModel[68].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Import Box117
		shermanModel[68].setRotationPoint(45.9F, -16.9F, -17.7F);
		shermanModel[68].rotateAngleX = -0.34906585F;
		shermanModel[68].rotateAngleY = 0.17453293F;
		shermanModel[68].rotateAngleZ = 1.25663706F;

		shermanModel[69].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box118
		shermanModel[69].setRotationPoint(-6F, -24.5F, 19F);

		shermanModel[70].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box119
		shermanModel[70].setRotationPoint(-6F, -24.5F, -21.2F);

		shermanModel[71].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box112
		shermanModel[71].setRotationPoint(-2.2F, -7F, 21F);

		shermanModel[72].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box113
		shermanModel[72].setRotationPoint(-3.8F, -7F, 21F);

		shermanModel[73].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box114
		shermanModel[73].setRotationPoint(-6F, -7F, 21F);

		shermanModel[74].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box115
		shermanModel[74].setRotationPoint(0F, -7F, 21F);

		shermanModel[75].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box116
		shermanModel[75].setRotationPoint(-6F, -7F, 17F);

		shermanModel[76].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box117
		shermanModel[76].setRotationPoint(-4F, -2F, 17F);

		shermanModel[77].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box118
		shermanModel[77].setRotationPoint(-4F, 2F, 17F);
		shermanModel[77].rotateAngleZ = -0.34906585F;

		shermanModel[78].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box119
		shermanModel[78].setRotationPoint(1.8F, 3F, 17F);
		shermanModel[78].rotateAngleZ = 0.34906585F;

		shermanModel[79].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box120
		shermanModel[79].setRotationPoint(1F, 4F, 17.4F);
		shermanModel[79].rotateAngleZ = 0.34906585F;

		shermanModel[80].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box121
		shermanModel[80].setRotationPoint(-4F, 3.4F, 17.4F);
		shermanModel[80].rotateAngleZ = -0.34906585F;

		shermanModel[81].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box122
		shermanModel[81].setRotationPoint(3F, 1F, 17F);

		shermanModel[82].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box123
		shermanModel[82].setRotationPoint(6F, 1F, 17F);

		shermanModel[83].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box124
		shermanModel[83].setRotationPoint(1F, 1F, 17F);

		shermanModel[84].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box125
		shermanModel[84].setRotationPoint(-8F, 1F, 17F);

		shermanModel[85].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box126
		shermanModel[85].setRotationPoint(-11F, 1F, 17F);

		shermanModel[86].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box127
		shermanModel[86].setRotationPoint(-13F, 1F, 17F);

		shermanModel[87].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box128
		shermanModel[87].setRotationPoint(19F, -7F, 21F);

		shermanModel[88].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box129
		shermanModel[88].setRotationPoint(25F, -7F, 21F);

		shermanModel[89].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box130
		shermanModel[89].setRotationPoint(22.8F, -7F, 21F);

		shermanModel[90].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box131
		shermanModel[90].setRotationPoint(21.2F, -7F, 21F);

		shermanModel[91].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box132
		shermanModel[91].setRotationPoint(19F, -7F, 17F);

		shermanModel[92].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box133
		shermanModel[92].setRotationPoint(21F, 2F, 17F);
		shermanModel[92].rotateAngleZ = -0.34906585F;

		shermanModel[93].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box134
		shermanModel[93].setRotationPoint(26.8F, 3F, 17F);
		shermanModel[93].rotateAngleZ = 0.34906585F;

		shermanModel[94].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box135
		shermanModel[94].setRotationPoint(26F, 4F, 17.4F);
		shermanModel[94].rotateAngleZ = 0.34906585F;

		shermanModel[95].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box136
		shermanModel[95].setRotationPoint(21F, 3.4F, 17.4F);
		shermanModel[95].rotateAngleZ = -0.34906585F;

		shermanModel[96].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box137
		shermanModel[96].setRotationPoint(21F, -2F, 17F);

		shermanModel[97].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box138
		shermanModel[97].setRotationPoint(17F, 1F, 17F);

		shermanModel[98].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box139
		shermanModel[98].setRotationPoint(14F, 1F, 17F);

		shermanModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box140
		shermanModel[99].setRotationPoint(12F, 1F, 17F);

		shermanModel[100].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box141
		shermanModel[100].setRotationPoint(26F, 1F, 17F);

		shermanModel[101].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box142
		shermanModel[101].setRotationPoint(28F, 1F, 17F);

		shermanModel[102].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box143
		shermanModel[102].setRotationPoint(31F, 1F, 17F);

		shermanModel[103].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box144
		shermanModel[103].setRotationPoint(-31F, -7F, 21F);

		shermanModel[104].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box145
		shermanModel[104].setRotationPoint(-25F, -7F, 21F);

		shermanModel[105].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box146
		shermanModel[105].setRotationPoint(-27.2F, -7F, 21F);

		shermanModel[106].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box147
		shermanModel[106].setRotationPoint(-28.8F, -7F, 21F);

		shermanModel[107].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box148
		shermanModel[107].setRotationPoint(-31F, -7F, 17F);

		shermanModel[108].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box149
		shermanModel[108].setRotationPoint(-29F, 2F, 17F);
		shermanModel[108].rotateAngleZ = -0.34906585F;

		shermanModel[109].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box150
		shermanModel[109].setRotationPoint(-23.2F, 3F, 17F);
		shermanModel[109].rotateAngleZ = 0.34906585F;

		shermanModel[110].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box151
		shermanModel[110].setRotationPoint(-24F, 4F, 17.4F);
		shermanModel[110].rotateAngleZ = 0.34906585F;

		shermanModel[111].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box152
		shermanModel[111].setRotationPoint(-29F, 3.4F, 17.4F);
		shermanModel[111].rotateAngleZ = -0.34906585F;

		shermanModel[112].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box153
		shermanModel[112].setRotationPoint(-29F, -2F, 17F);

		shermanModel[113].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box154
		shermanModel[113].setRotationPoint(-33F, 1F, 17F);

		shermanModel[114].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box155
		shermanModel[114].setRotationPoint(-36F, 1F, 17F);

		shermanModel[115].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box156
		shermanModel[115].setRotationPoint(-38F, 1F, 17F);

		shermanModel[116].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box157
		shermanModel[116].setRotationPoint(-24F, 1F, 17F);

		shermanModel[117].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box158
		shermanModel[117].setRotationPoint(-22F, 1F, 17F);

		shermanModel[118].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box159
		shermanModel[118].setRotationPoint(-19F, 1F, 17F);

		shermanModel[119].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box160
		shermanModel[119].setRotationPoint(19F, -7F, -22F);

		shermanModel[120].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box161
		shermanModel[120].setRotationPoint(25F, -7F, -22F);

		shermanModel[121].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box162
		shermanModel[121].setRotationPoint(22.8F, -7F, -22F);

		shermanModel[122].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box163
		shermanModel[122].setRotationPoint(21.2F, -7F, -22F);

		shermanModel[123].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box164
		shermanModel[123].setRotationPoint(19F, -7F, -21F);

		shermanModel[124].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box165
		shermanModel[124].setRotationPoint(21F, 2F, -21F);
		shermanModel[124].rotateAngleZ = -0.34906585F;

		shermanModel[125].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box166
		shermanModel[125].setRotationPoint(26.8F, 3F, -21F);
		shermanModel[125].rotateAngleZ = 0.34906585F;

		shermanModel[126].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box167
		shermanModel[126].setRotationPoint(21F, -2F, -21F);

		shermanModel[127].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box168
		shermanModel[127].setRotationPoint(26F, 4F, -21.4F);
		shermanModel[127].rotateAngleZ = 0.34906585F;

		shermanModel[128].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box169
		shermanModel[128].setRotationPoint(21F, 3.4F, -21.4F);
		shermanModel[128].rotateAngleZ = -0.34906585F;

		shermanModel[129].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box170
		shermanModel[129].setRotationPoint(17F, 1F, -22F);

		shermanModel[130].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box171
		shermanModel[130].setRotationPoint(14F, 1F, -22F);

		shermanModel[131].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box172
		shermanModel[131].setRotationPoint(12F, 1F, -22F);

		shermanModel[132].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box173
		shermanModel[132].setRotationPoint(26F, 1F, -22F);

		shermanModel[133].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box174
		shermanModel[133].setRotationPoint(28F, 1F, -22F);

		shermanModel[134].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box175
		shermanModel[134].setRotationPoint(31F, 1F, -22F);

		shermanModel[135].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box176
		shermanModel[135].setRotationPoint(0F, -7F, -22F);

		shermanModel[136].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box177
		shermanModel[136].setRotationPoint(-2.2F, -7F, -22F);

		shermanModel[137].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box178
		shermanModel[137].setRotationPoint(-3.8F, -7F, -22F);

		shermanModel[138].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box179
		shermanModel[138].setRotationPoint(-6F, -7F, -21F);

		shermanModel[139].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box180
		shermanModel[139].setRotationPoint(-6F, -7F, -22F);

		shermanModel[140].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box181
		shermanModel[140].setRotationPoint(-4F, 2F, -21F);
		shermanModel[140].rotateAngleZ = -0.34906585F;

		shermanModel[141].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box182
		shermanModel[141].setRotationPoint(-4F, -2F, -21F);

		shermanModel[142].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box183
		shermanModel[142].setRotationPoint(1.8F, 3F, -21F);
		shermanModel[142].rotateAngleZ = 0.34906585F;

		shermanModel[143].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box184
		shermanModel[143].setRotationPoint(1F, 4F, -21.4F);
		shermanModel[143].rotateAngleZ = 0.34906585F;

		shermanModel[144].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box185
		shermanModel[144].setRotationPoint(-4F, 3.4F, -21.4F);
		shermanModel[144].rotateAngleZ = -0.34906585F;

		shermanModel[145].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box186
		shermanModel[145].setRotationPoint(-8F, 1F, -22F);

		shermanModel[146].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box187
		shermanModel[146].setRotationPoint(-11F, 1F, -22F);

		shermanModel[147].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box188
		shermanModel[147].setRotationPoint(-13F, 1F, -22F);

		shermanModel[148].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box189
		shermanModel[148].setRotationPoint(1F, 1F, -22F);

		shermanModel[149].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box190
		shermanModel[149].setRotationPoint(3F, 1F, -22F);

		shermanModel[150].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box191
		shermanModel[150].setRotationPoint(6F, 1F, -22F);

		shermanModel[151].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box192
		shermanModel[151].setRotationPoint(-19F, 1F, -22F);

		shermanModel[152].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box193
		shermanModel[152].setRotationPoint(-22F, 1F, -22F);

		shermanModel[153].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box194
		shermanModel[153].setRotationPoint(-24F, 1F, -22F);

		shermanModel[154].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box195
		shermanModel[154].setRotationPoint(-24F, 4F, -21.4F);
		shermanModel[154].rotateAngleZ = 0.34906585F;

		shermanModel[155].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box196
		shermanModel[155].setRotationPoint(-23.2F, 3F, -21F);
		shermanModel[155].rotateAngleZ = 0.34906585F;

		shermanModel[156].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box197
		shermanModel[156].setRotationPoint(-29F, -2F, -21F);

		shermanModel[157].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box198
		shermanModel[157].setRotationPoint(-29F, 2F, -21F);
		shermanModel[157].rotateAngleZ = -0.34906585F;

		shermanModel[158].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box199
		shermanModel[158].setRotationPoint(-29F, 3.4F, -21.4F);
		shermanModel[158].rotateAngleZ = -0.34906585F;

		shermanModel[159].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box200
		shermanModel[159].setRotationPoint(-33F, 1F, -22F);

		shermanModel[160].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box201
		shermanModel[160].setRotationPoint(-36F, 1F, -22F);

		shermanModel[161].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box202
		shermanModel[161].setRotationPoint(-38F, 1F, -22F);

		shermanModel[162].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box203
		shermanModel[162].setRotationPoint(-27.2F, -7F, -22F);

		shermanModel[163].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box204
		shermanModel[163].setRotationPoint(-25F, -7F, -22F);

		shermanModel[164].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box205
		shermanModel[164].setRotationPoint(-31F, -7F, -22F);

		shermanModel[165].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box206
		shermanModel[165].setRotationPoint(-28.8F, -7F, -22F);

		shermanModel[166].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box207
		shermanModel[166].setRotationPoint(-31F, -7F, -21F);

		shermanModel[167].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box208
		shermanModel[167].setRotationPoint(44F, -6F, 15F);

		shermanModel[168].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box209
		shermanModel[168].setRotationPoint(39F, -6F, 15F);

		shermanModel[169].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box210
		shermanModel[169].setRotationPoint(37F, -6F, 15F);

		shermanModel[170].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box211
		shermanModel[170].setRotationPoint(-47F, -6F, 15F);

		shermanModel[171].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box212
		shermanModel[171].setRotationPoint(-52F, -6F, 15F);

		shermanModel[172].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box213
		shermanModel[172].setRotationPoint(-54F, -6F, 15F);

		shermanModel[173].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box214
		shermanModel[173].setRotationPoint(-47F, -6F, -24F);

		shermanModel[174].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box215
		shermanModel[174].setRotationPoint(-52F, -6F, -24F);

		shermanModel[175].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box216
		shermanModel[175].setRotationPoint(-54F, -6F, -24F);

		shermanModel[176].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box217
		shermanModel[176].setRotationPoint(37F, -6F, -24F);

		shermanModel[177].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box218
		shermanModel[177].setRotationPoint(39F, -6F, -24F);

		shermanModel[178].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box219
		shermanModel[178].setRotationPoint(44F, -6F, -24F);

		shermanModel[179].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box220
		shermanModel[179].setRotationPoint(16F, -8F, 17F);

		shermanModel[180].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box221
		shermanModel[180].setRotationPoint(14F, -8F, 17F);

		shermanModel[181].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box222
		shermanModel[181].setRotationPoint(13F, -8F, 17F);

		shermanModel[182].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box223
		shermanModel[182].setRotationPoint(-9F, -8F, 17F);

		shermanModel[183].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box224
		shermanModel[183].setRotationPoint(-11F, -8F, 17F);

		shermanModel[184].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box225
		shermanModel[184].setRotationPoint(-12F, -8F, 17F);

		shermanModel[185].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box226
		shermanModel[185].setRotationPoint(-34F, -8F, 17F);

		shermanModel[186].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box227
		shermanModel[186].setRotationPoint(-36F, -8F, 17F);

		shermanModel[187].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box228
		shermanModel[187].setRotationPoint(-37F, -8F, 17F);

		shermanModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box229
		shermanModel[188].setRotationPoint(-34F, -8F, -22F);

		shermanModel[189].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box230
		shermanModel[189].setRotationPoint(-36F, -8F, -22F);

		shermanModel[190].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box231
		shermanModel[190].setRotationPoint(-37F, -8F, -22F);

		shermanModel[191].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box232
		shermanModel[191].setRotationPoint(-12F, -8F, -22F);

		shermanModel[192].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box233
		shermanModel[192].setRotationPoint(-11F, -8F, -22F);

		shermanModel[193].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box234
		shermanModel[193].setRotationPoint(-9F, -8F, -22F);

		shermanModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box235
		shermanModel[194].setRotationPoint(13F, -8F, -22F);

		shermanModel[195].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box236
		shermanModel[195].setRotationPoint(14F, -8F, -22F);

		shermanModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box237
		shermanModel[196].setRotationPoint(16F, -8F, -22F);

		shermanModel[197].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box238
		shermanModel[197].setRotationPoint(19F, -6F, 17F);
		shermanModel[197].rotateAngleZ = 0.34906585F;

		shermanModel[198].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box239
		shermanModel[198].setRotationPoint(-6F, -6F, 17F);
		shermanModel[198].rotateAngleZ = 0.34906585F;

		shermanModel[199].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box240
		shermanModel[199].setRotationPoint(-31F, -6F, 17F);
		shermanModel[199].rotateAngleZ = 0.34906585F;

		shermanModel[200].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box241
		shermanModel[200].setRotationPoint(-31F, -6F, -21F);
		shermanModel[200].rotateAngleZ = 0.34906585F;

		shermanModel[201].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box242
		shermanModel[201].setRotationPoint(-6F, -6F, -21F);
		shermanModel[201].rotateAngleZ = 0.34906585F;

		shermanModel[202].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box243
		shermanModel[202].setRotationPoint(19F, -6F, -21F);
		shermanModel[202].rotateAngleZ = 0.34906585F;

		shermanModel[203].addBox(0F, 0F, 0F, 13, 8, 1, 0F); // Import Box290
		shermanModel[203].setRotationPoint(13F, -22F, 23.5F);

		shermanModel[204].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box300
		shermanModel[204].setRotationPoint(-32F, -22F, 8F);
		shermanModel[204].rotateAngleZ = -0.15707963F;

		shermanModel[205].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box301
		shermanModel[205].setRotationPoint(-39F, -21F, 8F);
		shermanModel[205].rotateAngleZ = -0.15707963F;

		shermanModel[206].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box302
		shermanModel[206].setRotationPoint(-45F, -20F, 8F);
		shermanModel[206].rotateAngleZ = -0.15707963F;

		shermanModel[207].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box303
		shermanModel[207].setRotationPoint(-52F, -19F, 8F);
		shermanModel[207].rotateAngleZ = -0.15707963F;

		shermanModel[208].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Import Box304
		shermanModel[208].setRotationPoint(-32F, -22F, -15F);
		shermanModel[208].rotateAngleZ = -0.15707963F;

		shermanModel[209].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Import Box308
		shermanModel[209].setRotationPoint(-39F, -21F, -15F);
		shermanModel[209].rotateAngleZ = -0.15707963F;

		shermanModel[210].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Import Box311
		shermanModel[210].setRotationPoint(-45F, -20F, -15F);
		shermanModel[210].rotateAngleZ = -0.15707963F;

		shermanModel[211].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Import Box312
		shermanModel[211].setRotationPoint(-52F, -19F, -15F);
		shermanModel[211].rotateAngleZ = -0.15707963F;

		shermanModel[212].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box313
		shermanModel[212].setRotationPoint(-30F, -25F, -11F);
		shermanModel[212].rotateAngleY = -0.62831853F;

		shermanModel[213].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box314
		shermanModel[213].setRotationPoint(-38F, -24F, -11F);
		shermanModel[213].rotateAngleY = 0.4712389F;

		shermanModel[214].addBox(0F, 0F, 0F, 7, 2, 11, 0F); // Import Box315
		shermanModel[214].setRotationPoint(-34F, -23F, -4F);
		shermanModel[214].rotateAngleX = 0.08726646F;
		shermanModel[214].rotateAngleY = -0.2268928F;
		shermanModel[214].rotateAngleZ = 0.01745329F;

		shermanModel[215].addBox(0F, 0F, 0F, 6, 3, 11, 0F); // Import Box316
		shermanModel[215].setRotationPoint(-41F, -22F, -6F);
		shermanModel[215].rotateAngleX = -0.03490659F;
		shermanModel[215].rotateAngleY = 0.10471976F;

		shermanModel[216].addBox(0F, 0F, 0F, 7, 2, 11, 0F); // Import Box317
		shermanModel[216].setRotationPoint(-43F, -22F, 4F);
		shermanModel[216].rotateAngleX = 0.08726646F;
		shermanModel[216].rotateAngleY = 0.41887902F;
		shermanModel[216].rotateAngleZ = -0.10471976F;

		shermanModel[217].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		shermanModel[217].setRotationPoint(-28F, -25F, 9F);
		shermanModel[217].rotateAngleY = -1.57079633F;

		shermanModel[218].addShapeBox(6F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box68
		shermanModel[218].setRotationPoint(-10F, -14F, 27F);
		shermanModel[218].rotateAngleY = 4.71238898F;
		shermanModel[218].rotateAngleZ = -1.57079633F;

		shermanModel[219].addShapeBox(6F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box69
		shermanModel[219].setRotationPoint(-10F, -14F, 27F);
		shermanModel[219].rotateAngleY = 4.71238898F;
		shermanModel[219].rotateAngleZ = -1.57079633F;

		shermanModel[220].addShapeBox(1F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box70
		shermanModel[220].setRotationPoint(-10F, -14F, 27F);
		shermanModel[220].rotateAngleY = 4.71238898F;
		shermanModel[220].rotateAngleZ = -1.57079633F;

		shermanModel[221].addShapeBox(0F, 0F, 5.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box73
		shermanModel[221].setRotationPoint(-10.5F, -13F, 24F);
		shermanModel[221].rotateAngleY = 4.71238898F;
		shermanModel[221].rotateAngleZ = -1.57079633F;

		shermanModel[222].addShapeBox(0F, 0F, 8.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		shermanModel[222].setRotationPoint(-10.5F, -13F, 24F);
		shermanModel[222].rotateAngleY = 4.71238898F;
		shermanModel[222].rotateAngleZ = -1.57079633F;

		shermanModel[223].addShapeBox(0F, 0F, 9.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		shermanModel[223].setRotationPoint(-10.5F, -13F, 24F);
		shermanModel[223].rotateAngleY = 4.71238898F;
		shermanModel[223].rotateAngleZ = -1.57079633F;

		shermanModel[224].addShapeBox(0F, 0F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box76
		shermanModel[224].setRotationPoint(-10.5F, -13F, 24F);
		shermanModel[224].rotateAngleY = 4.71238898F;
		shermanModel[224].rotateAngleZ = -1.57079633F;

		shermanModel[225].addShapeBox(1F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box77
		shermanModel[225].setRotationPoint(-10F, -14F, 27F);
		shermanModel[225].rotateAngleY = 4.71238898F;
		shermanModel[225].rotateAngleZ = -1.57079633F;

		shermanModel[226].addShapeBox(0F, 0F, 5.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		shermanModel[226].setRotationPoint(-4.5F, -13F, 24F);
		shermanModel[226].rotateAngleY = 4.71238898F;
		shermanModel[226].rotateAngleZ = -1.57079633F;

		shermanModel[227].addShapeBox(0F, 0F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		shermanModel[227].setRotationPoint(-4.5F, -13F, 24F);
		shermanModel[227].rotateAngleY = 4.71238898F;
		shermanModel[227].rotateAngleZ = -1.57079633F;

		shermanModel[228].addShapeBox(0F, 0F, 8.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box81
		shermanModel[228].setRotationPoint(-4.5F, -13F, 24F);
		shermanModel[228].rotateAngleY = 4.71238898F;
		shermanModel[228].rotateAngleZ = -1.57079633F;

		shermanModel[229].addShapeBox(1F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box82
		shermanModel[229].setRotationPoint(-4F, -14F, 27F);
		shermanModel[229].rotateAngleY = 4.71238898F;
		shermanModel[229].rotateAngleZ = -1.57079633F;

		shermanModel[230].addShapeBox(1F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box83
		shermanModel[230].setRotationPoint(-4F, -14F, 27F);
		shermanModel[230].rotateAngleY = 4.71238898F;
		shermanModel[230].rotateAngleZ = -1.57079633F;

		shermanModel[231].addShapeBox(6F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box84
		shermanModel[231].setRotationPoint(-4F, -14F, 27F);
		shermanModel[231].rotateAngleY = 4.71238898F;
		shermanModel[231].rotateAngleZ = -1.57079633F;

		shermanModel[232].addShapeBox(0F, 0F, 9.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		shermanModel[232].setRotationPoint(-4.5F, -13F, 24F);
		shermanModel[232].rotateAngleY = 4.71238898F;
		shermanModel[232].rotateAngleZ = -1.57079633F;

		shermanModel[233].addShapeBox(6F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box86
		shermanModel[233].setRotationPoint(-4F, -14F, 27F);
		shermanModel[233].rotateAngleY = 4.71238898F;
		shermanModel[233].rotateAngleZ = -1.57079633F;

		shermanModel[234].addShapeBox(6F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box87
		shermanModel[234].setRotationPoint(8F, -14F, 27F);
		shermanModel[234].rotateAngleY = 4.71238898F;
		shermanModel[234].rotateAngleZ = -1.57079633F;

		shermanModel[235].addShapeBox(6F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box88
		shermanModel[235].setRotationPoint(8F, -14F, 27F);
		shermanModel[235].rotateAngleY = 4.71238898F;
		shermanModel[235].rotateAngleZ = -1.57079633F;

		shermanModel[236].addShapeBox(0F, 0F, 8.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		shermanModel[236].setRotationPoint(7.5F, -13F, 24F);
		shermanModel[236].rotateAngleY = 4.71238898F;
		shermanModel[236].rotateAngleZ = -1.57079633F;

		shermanModel[237].addShapeBox(1F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box90
		shermanModel[237].setRotationPoint(8F, -14F, 27F);
		shermanModel[237].rotateAngleY = 4.71238898F;
		shermanModel[237].rotateAngleZ = -1.57079633F;

		shermanModel[238].addShapeBox(1F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box91
		shermanModel[238].setRotationPoint(8F, -14F, 27F);
		shermanModel[238].rotateAngleY = 4.71238898F;
		shermanModel[238].rotateAngleZ = -1.57079633F;

		shermanModel[239].addShapeBox(0F, 0F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		shermanModel[239].setRotationPoint(7.5F, -13F, 24F);
		shermanModel[239].rotateAngleY = 4.71238898F;
		shermanModel[239].rotateAngleZ = -1.57079633F;

		shermanModel[240].addShapeBox(0F, 0F, 9.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box93
		shermanModel[240].setRotationPoint(7.5F, -13F, 24F);
		shermanModel[240].rotateAngleY = 4.71238898F;
		shermanModel[240].rotateAngleZ = -1.57079633F;

		shermanModel[241].addShapeBox(0F, 0F, 5.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box94
		shermanModel[241].setRotationPoint(7.5F, -13F, 24F);
		shermanModel[241].rotateAngleY = 4.71238898F;
		shermanModel[241].rotateAngleZ = -1.57079633F;

		shermanModel[242].addShapeBox(0F, 0F, 5.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		shermanModel[242].setRotationPoint(1.5F, -13F, 24F);
		shermanModel[242].rotateAngleY = 4.71238898F;
		shermanModel[242].rotateAngleZ = -1.57079633F;

		shermanModel[243].addShapeBox(0F, 0F, 8.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		shermanModel[243].setRotationPoint(1.5F, -13F, 24F);
		shermanModel[243].rotateAngleY = 4.71238898F;
		shermanModel[243].rotateAngleZ = -1.57079633F;

		shermanModel[244].addShapeBox(0F, 0F, 9.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box97
		shermanModel[244].setRotationPoint(1.5F, -13F, 24F);
		shermanModel[244].rotateAngleY = 4.71238898F;
		shermanModel[244].rotateAngleZ = -1.57079633F;

		shermanModel[245].addShapeBox(6F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box98
		shermanModel[245].setRotationPoint(2F, -14F, 27F);
		shermanModel[245].rotateAngleY = 4.71238898F;
		shermanModel[245].rotateAngleZ = -1.57079633F;

		shermanModel[246].addShapeBox(0F, 0F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box99
		shermanModel[246].setRotationPoint(1.5F, -13F, 24F);
		shermanModel[246].rotateAngleY = 4.71238898F;
		shermanModel[246].rotateAngleZ = -1.57079633F;

		shermanModel[247].addShapeBox(6F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box100
		shermanModel[247].setRotationPoint(2F, -14F, 27F);
		shermanModel[247].rotateAngleY = 4.71238898F;
		shermanModel[247].rotateAngleZ = -1.57079633F;

		shermanModel[248].addShapeBox(1F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box101
		shermanModel[248].setRotationPoint(2F, -14F, 27F);
		shermanModel[248].rotateAngleY = 4.71238898F;
		shermanModel[248].rotateAngleZ = -1.57079633F;

		shermanModel[249].addShapeBox(1F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box102
		shermanModel[249].setRotationPoint(2F, -14F, 27F);
		shermanModel[249].rotateAngleY = 4.71238898F;
		shermanModel[249].rotateAngleZ = -1.57079633F;

		shermanModel[250].addShapeBox(6F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box103
		shermanModel[250].setRotationPoint(20F, -14F, 27F);
		shermanModel[250].rotateAngleY = 4.71238898F;
		shermanModel[250].rotateAngleZ = -1.57079633F;

		shermanModel[251].addShapeBox(6F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box104
		shermanModel[251].setRotationPoint(20F, -14F, 27F);
		shermanModel[251].rotateAngleY = 4.71238898F;
		shermanModel[251].rotateAngleZ = -1.57079633F;

		shermanModel[252].addShapeBox(0F, 0F, 8.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box105
		shermanModel[252].setRotationPoint(19.5F, -13F, 24F);
		shermanModel[252].rotateAngleY = 4.71238898F;
		shermanModel[252].rotateAngleZ = -1.57079633F;

		shermanModel[253].addShapeBox(1F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box106
		shermanModel[253].setRotationPoint(20F, -14F, 27F);
		shermanModel[253].rotateAngleY = 4.71238898F;
		shermanModel[253].rotateAngleZ = -1.57079633F;

		shermanModel[254].addShapeBox(1F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box107
		shermanModel[254].setRotationPoint(20F, -14F, 27F);
		shermanModel[254].rotateAngleY = 4.71238898F;
		shermanModel[254].rotateAngleZ = -1.57079633F;

		shermanModel[255].addShapeBox(0F, 0F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box108
		shermanModel[255].setRotationPoint(19.5F, -13F, 24F);
		shermanModel[255].rotateAngleY = 4.71238898F;
		shermanModel[255].rotateAngleZ = -1.57079633F;

		shermanModel[256].addShapeBox(0F, 0F, 9.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box109
		shermanModel[256].setRotationPoint(19.5F, -13F, 24F);
		shermanModel[256].rotateAngleY = 4.71238898F;
		shermanModel[256].rotateAngleZ = -1.57079633F;

		shermanModel[257].addShapeBox(0F, 0F, 5.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box110
		shermanModel[257].setRotationPoint(19.5F, -13F, 24F);
		shermanModel[257].rotateAngleY = 4.71238898F;
		shermanModel[257].rotateAngleZ = -1.57079633F;

		shermanModel[258].addShapeBox(0F, 0F, 5.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box111
		shermanModel[258].setRotationPoint(13.5F, -13F, 24F);
		shermanModel[258].rotateAngleY = 4.71238898F;
		shermanModel[258].rotateAngleZ = -1.57079633F;

		shermanModel[259].addShapeBox(0F, 0F, 8.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		shermanModel[259].setRotationPoint(13.5F, -13F, 24F);
		shermanModel[259].rotateAngleY = 4.71238898F;
		shermanModel[259].rotateAngleZ = -1.57079633F;

		shermanModel[260].addShapeBox(0F, 0F, 9.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		shermanModel[260].setRotationPoint(13.5F, -13F, 24F);
		shermanModel[260].rotateAngleY = 4.71238898F;
		shermanModel[260].rotateAngleZ = -1.57079633F;

		shermanModel[261].addShapeBox(6F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box114
		shermanModel[261].setRotationPoint(14F, -14F, 27F);
		shermanModel[261].rotateAngleY = 4.71238898F;
		shermanModel[261].rotateAngleZ = -1.57079633F;

		shermanModel[262].addShapeBox(0F, 0F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		shermanModel[262].setRotationPoint(13.5F, -13F, 24F);
		shermanModel[262].rotateAngleY = 4.71238898F;
		shermanModel[262].rotateAngleZ = -1.57079633F;

		shermanModel[263].addShapeBox(6F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box116
		shermanModel[263].setRotationPoint(14F, -14F, 27F);
		shermanModel[263].rotateAngleY = 4.71238898F;
		shermanModel[263].rotateAngleZ = -1.57079633F;

		shermanModel[264].addShapeBox(1F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box117
		shermanModel[264].setRotationPoint(14F, -14F, 27F);
		shermanModel[264].rotateAngleY = 4.71238898F;
		shermanModel[264].rotateAngleZ = -1.57079633F;

		shermanModel[265].addShapeBox(1F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box118
		shermanModel[265].setRotationPoint(14F, -14F, 27F);
		shermanModel[265].rotateAngleY = 4.71238898F;
		shermanModel[265].rotateAngleZ = -1.57079633F;

		shermanModel[266].addShapeBox(6F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		shermanModel[266].setRotationPoint(42F, -14F, 26F);
		shermanModel[266].rotateAngleY = 4.71238898F;
		shermanModel[266].rotateAngleZ = -1.57079633F;

		shermanModel[267].addShapeBox(6F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box120
		shermanModel[267].setRotationPoint(42F, -14F, 26F);
		shermanModel[267].rotateAngleY = 4.71238898F;
		shermanModel[267].rotateAngleZ = -1.57079633F;

		shermanModel[268].addShapeBox(0F, -49F, 14.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box121
		shermanModel[268].setRotationPoint(41.5F, -13F, 24F);
		shermanModel[268].rotateAngleY = 4.71238898F;
		shermanModel[268].rotateAngleZ = -1.57079633F;

		shermanModel[269].addShapeBox(1F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box122
		shermanModel[269].setRotationPoint(42F, -14F, 26F);
		shermanModel[269].rotateAngleY = 4.71238898F;
		shermanModel[269].rotateAngleZ = -1.57079633F;

		shermanModel[270].addShapeBox(1F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		shermanModel[270].setRotationPoint(42F, -14F, 26F);
		shermanModel[270].rotateAngleY = 4.71238898F;
		shermanModel[270].rotateAngleZ = -1.57079633F;

		shermanModel[271].addShapeBox(0F, -49F, 12.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box124
		shermanModel[271].setRotationPoint(41.5F, -13F, 24F);
		shermanModel[271].rotateAngleY = 4.71238898F;
		shermanModel[271].rotateAngleZ = -1.57079633F;

		shermanModel[272].addShapeBox(0F, -49F, 15.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		shermanModel[272].setRotationPoint(41.5F, -13F, 24F);
		shermanModel[272].rotateAngleY = 4.71238898F;
		shermanModel[272].rotateAngleZ = -1.57079633F;

		shermanModel[273].addShapeBox(0F, -49F, 11.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		shermanModel[273].setRotationPoint(41.5F, -13F, 24F);
		shermanModel[273].rotateAngleY = 4.71238898F;
		shermanModel[273].rotateAngleZ = -1.57079633F;

		shermanModel[274].addShapeBox(0F, -49F, 11.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box127
		shermanModel[274].setRotationPoint(35.5F, -13F, 24F);
		shermanModel[274].rotateAngleY = 4.71238898F;
		shermanModel[274].rotateAngleZ = -1.57079633F;

		shermanModel[275].addShapeBox(0F, -49F, 14.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		shermanModel[275].setRotationPoint(35.5F, -13F, 24F);
		shermanModel[275].rotateAngleY = 4.71238898F;
		shermanModel[275].rotateAngleZ = -1.57079633F;

		shermanModel[276].addShapeBox(0F, -49F, 15.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box129
		shermanModel[276].setRotationPoint(35.5F, -13F, 24F);
		shermanModel[276].rotateAngleY = 4.71238898F;
		shermanModel[276].rotateAngleZ = -1.57079633F;

		shermanModel[277].addShapeBox(6F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box130
		shermanModel[277].setRotationPoint(36F, -14F, 26F);
		shermanModel[277].rotateAngleY = 4.71238898F;
		shermanModel[277].rotateAngleZ = -1.57079633F;

		shermanModel[278].addShapeBox(0F, -49F, 12.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box131
		shermanModel[278].setRotationPoint(35.5F, -13F, 24F);
		shermanModel[278].rotateAngleY = 4.71238898F;
		shermanModel[278].rotateAngleZ = -1.57079633F;

		shermanModel[279].addShapeBox(6F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box132
		shermanModel[279].setRotationPoint(36F, -14F, 26F);
		shermanModel[279].rotateAngleY = 4.71238898F;
		shermanModel[279].rotateAngleZ = -1.57079633F;

		shermanModel[280].addShapeBox(1F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		shermanModel[280].setRotationPoint(36F, -14F, 26F);
		shermanModel[280].rotateAngleY = 4.71238898F;
		shermanModel[280].rotateAngleZ = -1.57079633F;

		shermanModel[281].addShapeBox(1F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box134
		shermanModel[281].setRotationPoint(36F, -14F, 26F);
		shermanModel[281].rotateAngleY = 4.71238898F;
		shermanModel[281].rotateAngleZ = -1.57079633F;

		shermanModel[282].addShapeBox(0F, -49F, 11.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		shermanModel[282].setRotationPoint(29.5F, -13F, 24F);
		shermanModel[282].rotateAngleY = 4.71238898F;
		shermanModel[282].rotateAngleZ = -1.57079633F;

		shermanModel[283].addShapeBox(0F, -49F, 12.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box136
		shermanModel[283].setRotationPoint(29.5F, -13F, 24F);
		shermanModel[283].rotateAngleY = 4.71238898F;
		shermanModel[283].rotateAngleZ = -1.57079633F;

		shermanModel[284].addShapeBox(6F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box137
		shermanModel[284].setRotationPoint(30F, -14F, 26F);
		shermanModel[284].rotateAngleY = 4.71238898F;
		shermanModel[284].rotateAngleZ = -1.57079633F;

		shermanModel[285].addShapeBox(1F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		shermanModel[285].setRotationPoint(30F, -14F, 26F);
		shermanModel[285].rotateAngleY = 4.71238898F;
		shermanModel[285].rotateAngleZ = -1.57079633F;

		shermanModel[286].addShapeBox(1F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box139
		shermanModel[286].setRotationPoint(30F, -14F, 26F);
		shermanModel[286].rotateAngleY = 4.71238898F;
		shermanModel[286].rotateAngleZ = -1.57079633F;

		shermanModel[287].addShapeBox(0F, -49F, 14.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		shermanModel[287].setRotationPoint(29.5F, -13F, 24F);
		shermanModel[287].rotateAngleY = 4.71238898F;
		shermanModel[287].rotateAngleZ = -1.57079633F;

		shermanModel[288].addShapeBox(0F, -49F, 15.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		shermanModel[288].setRotationPoint(29.5F, -13F, 24F);
		shermanModel[288].rotateAngleY = 4.71238898F;
		shermanModel[288].rotateAngleZ = -1.57079633F;

		shermanModel[289].addShapeBox(0F, -49F, 11.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		shermanModel[289].setRotationPoint(23.5F, -13F, 24F);
		shermanModel[289].rotateAngleY = 4.71238898F;
		shermanModel[289].rotateAngleZ = -1.57079633F;

		shermanModel[290].addShapeBox(0F, -49F, 14.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box143
		shermanModel[290].setRotationPoint(23.5F, -13F, 24F);
		shermanModel[290].rotateAngleY = 4.71238898F;
		shermanModel[290].rotateAngleZ = -1.57079633F;

		shermanModel[291].addShapeBox(0F, -49F, 15.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box144
		shermanModel[291].setRotationPoint(23.5F, -13F, 24F);
		shermanModel[291].rotateAngleY = 4.71238898F;
		shermanModel[291].rotateAngleZ = -1.57079633F;

		shermanModel[292].addShapeBox(0F, -49F, 11.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		shermanModel[292].setRotationPoint(17.5F, -13F, 24F);
		shermanModel[292].rotateAngleY = 4.71238898F;
		shermanModel[292].rotateAngleZ = -1.57079633F;

		shermanModel[293].addShapeBox(0F, -49F, 12.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		shermanModel[293].setRotationPoint(17.5F, -13F, 24F);
		shermanModel[293].rotateAngleY = 4.71238898F;
		shermanModel[293].rotateAngleZ = -1.57079633F;

		shermanModel[294].addShapeBox(0F, -49F, 14.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box147
		shermanModel[294].setRotationPoint(17.5F, -13F, 24F);
		shermanModel[294].rotateAngleY = 4.71238898F;
		shermanModel[294].rotateAngleZ = -1.57079633F;

		shermanModel[295].addShapeBox(0F, -49F, 15.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box148
		shermanModel[295].setRotationPoint(17.5F, -13F, 24F);
		shermanModel[295].rotateAngleY = 4.71238898F;
		shermanModel[295].rotateAngleZ = -1.57079633F;

		shermanModel[296].addShapeBox(0F, -49F, 11.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box149
		shermanModel[296].setRotationPoint(11.5F, -13F, 24F);
		shermanModel[296].rotateAngleY = 4.71238898F;
		shermanModel[296].rotateAngleZ = -1.57079633F;

		shermanModel[297].addShapeBox(0F, -49F, 12.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		shermanModel[297].setRotationPoint(11.5F, -13F, 24F);
		shermanModel[297].rotateAngleY = 4.71238898F;
		shermanModel[297].rotateAngleZ = -1.57079633F;

		shermanModel[298].addShapeBox(0F, -49F, 14.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		shermanModel[298].setRotationPoint(11.5F, -13F, 24F);
		shermanModel[298].rotateAngleY = 4.71238898F;
		shermanModel[298].rotateAngleZ = -1.57079633F;

		shermanModel[299].addShapeBox(1F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		shermanModel[299].setRotationPoint(12F, -14F, 26F);
		shermanModel[299].rotateAngleY = 4.71238898F;
		shermanModel[299].rotateAngleZ = -1.57079633F;

		shermanModel[300].addShapeBox(1F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
		shermanModel[300].setRotationPoint(12F, -14F, 26F);
		shermanModel[300].rotateAngleY = 4.71238898F;
		shermanModel[300].rotateAngleZ = -1.57079633F;

		shermanModel[301].addShapeBox(0F, -49F, 15.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		shermanModel[301].setRotationPoint(11.5F, -13F, 24F);
		shermanModel[301].rotateAngleY = 4.71238898F;
		shermanModel[301].rotateAngleZ = -1.57079633F;

		shermanModel[302].addShapeBox(1F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		shermanModel[302].setRotationPoint(18F, -14F, 26F);
		shermanModel[302].rotateAngleY = 4.71238898F;
		shermanModel[302].rotateAngleZ = -1.57079633F;

		shermanModel[303].addShapeBox(1F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		shermanModel[303].setRotationPoint(18F, -14F, 26F);
		shermanModel[303].rotateAngleY = 4.71238898F;
		shermanModel[303].rotateAngleZ = -1.57079633F;

		shermanModel[304].addShapeBox(1F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		shermanModel[304].setRotationPoint(24F, -14F, 26F);
		shermanModel[304].rotateAngleY = 4.71238898F;
		shermanModel[304].rotateAngleZ = -1.57079633F;

		shermanModel[305].addShapeBox(1F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		shermanModel[305].setRotationPoint(24F, -14F, 26F);
		shermanModel[305].rotateAngleY = 4.71238898F;
		shermanModel[305].rotateAngleZ = -1.57079633F;

		shermanModel[306].addShapeBox(6F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		shermanModel[306].setRotationPoint(24F, -14F, 26F);
		shermanModel[306].rotateAngleY = 4.71238898F;
		shermanModel[306].rotateAngleZ = -1.57079633F;

		shermanModel[307].addShapeBox(0F, -49F, 12.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		shermanModel[307].setRotationPoint(23.5F, -13F, 24F);
		shermanModel[307].rotateAngleY = 4.71238898F;
		shermanModel[307].rotateAngleZ = -1.57079633F;

		shermanModel[308].addShapeBox(6F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		shermanModel[308].setRotationPoint(30F, -14F, 26F);
		shermanModel[308].rotateAngleY = 4.71238898F;
		shermanModel[308].rotateAngleZ = -1.57079633F;

		shermanModel[309].addShapeBox(6F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		shermanModel[309].setRotationPoint(24F, -14F, 26F);
		shermanModel[309].rotateAngleY = 4.71238898F;
		shermanModel[309].rotateAngleZ = -1.57079633F;

		shermanModel[310].addShapeBox(6F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box163
		shermanModel[310].setRotationPoint(18F, -14F, 26F);
		shermanModel[310].rotateAngleY = 4.71238898F;
		shermanModel[310].rotateAngleZ = -1.57079633F;

		shermanModel[311].addShapeBox(6F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		shermanModel[311].setRotationPoint(18F, -14F, 26F);
		shermanModel[311].rotateAngleY = 4.71238898F;
		shermanModel[311].rotateAngleZ = -1.57079633F;

		shermanModel[312].addShapeBox(6F, -51.5F, 12.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box165
		shermanModel[312].setRotationPoint(12F, -14F, 26F);
		shermanModel[312].rotateAngleY = 4.71238898F;
		shermanModel[312].rotateAngleZ = -1.57079633F;

		shermanModel[313].addShapeBox(6F, -51.5F, 15.3F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box166
		shermanModel[313].setRotationPoint(12F, -14F, 26F);
		shermanModel[313].rotateAngleY = 4.71238898F;
		shermanModel[313].rotateAngleZ = -1.57079633F;

		shermanModel[314].addShapeBox(0F, 0F, 5.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		shermanModel[314].setRotationPoint(37.5F, -13F, 24F);
		shermanModel[314].rotateAngleY = 4.71238898F;
		shermanModel[314].rotateAngleZ = -1.57079633F;

		shermanModel[315].addShapeBox(0F, 0F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		shermanModel[315].setRotationPoint(37.5F, -13F, 24F);
		shermanModel[315].rotateAngleY = 4.71238898F;
		shermanModel[315].rotateAngleZ = -1.57079633F;

		shermanModel[316].addShapeBox(0F, 0F, 8.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		shermanModel[316].setRotationPoint(37.5F, -13F, 24F);
		shermanModel[316].rotateAngleY = 4.71238898F;
		shermanModel[316].rotateAngleZ = -1.57079633F;

		shermanModel[317].addShapeBox(0F, 0F, 9.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		shermanModel[317].setRotationPoint(37.5F, -13F, 24F);
		shermanModel[317].rotateAngleY = 4.71238898F;
		shermanModel[317].rotateAngleZ = -1.57079633F;

		shermanModel[318].addShapeBox(0F, 0F, 5.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		shermanModel[318].setRotationPoint(31.5F, -13F, 24F);
		shermanModel[318].rotateAngleY = 4.71238898F;
		shermanModel[318].rotateAngleZ = -1.57079633F;

		shermanModel[319].addShapeBox(0F, 0F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		shermanModel[319].setRotationPoint(31.5F, -13F, 24F);
		shermanModel[319].rotateAngleY = 4.71238898F;
		shermanModel[319].rotateAngleZ = -1.57079633F;

		shermanModel[320].addShapeBox(6F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box173
		shermanModel[320].setRotationPoint(32F, -14F, 27F);
		shermanModel[320].rotateAngleY = 4.71238898F;
		shermanModel[320].rotateAngleZ = -1.57079633F;

		shermanModel[321].addShapeBox(6F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box174
		shermanModel[321].setRotationPoint(38F, -14F, 27F);
		shermanModel[321].rotateAngleY = 4.71238898F;
		shermanModel[321].rotateAngleZ = -1.57079633F;

		shermanModel[322].addShapeBox(6F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box175
		shermanModel[322].setRotationPoint(38F, -14F, 27F);
		shermanModel[322].rotateAngleY = 4.71238898F;
		shermanModel[322].rotateAngleZ = -1.57079633F;

		shermanModel[323].addShapeBox(1F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box176
		shermanModel[323].setRotationPoint(38F, -14F, 27F);
		shermanModel[323].rotateAngleY = 4.71238898F;
		shermanModel[323].rotateAngleZ = -1.57079633F;

		shermanModel[324].addShapeBox(1F, -2.5F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box177
		shermanModel[324].setRotationPoint(38F, -14F, 27F);
		shermanModel[324].rotateAngleY = 4.71238898F;
		shermanModel[324].rotateAngleZ = -1.57079633F;

		shermanModel[325].addShapeBox(1F, -2.5F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box178
		shermanModel[325].setRotationPoint(32F, -14F, 27F);
		shermanModel[325].rotateAngleY = 4.71238898F;
		shermanModel[325].rotateAngleZ = -1.57079633F;

		shermanModel[326].addBox(-10F, -24F, -15F, 20, 1, 30, 0F); // Import Box25
		shermanModel[326].setRotationPoint(0F, -1F, 0F);

		shermanModel[327].addShapeBox(-15F, -24F, -15F, 5, 1, 30, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box27
		shermanModel[327].setRotationPoint(0F, -1F, 0F);

		shermanModel[328].addShapeBox(10F, -24F, -15F, 5, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box28
		shermanModel[328].setRotationPoint(0F, -1F, 0F);

		shermanModel[329].addShapeBox(10F, -25F, -16F, 5, 1, 32, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box31
		shermanModel[329].setRotationPoint(0F, -1F, 0F);

		shermanModel[330].addBox(-10F, -25F, -16F, 20, 1, 32, 0F); // Import Box32
		shermanModel[330].setRotationPoint(0F, -1F, 0F);

		shermanModel[331].addShapeBox(-19F, -25F, -16F, 9, 1, 32, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box33
		shermanModel[331].setRotationPoint(0F, -1F, 0F);

		shermanModel[332].addShapeBox(-10F, -38F, -18F, 14, 13, 36, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		shermanModel[332].setRotationPoint(0F, -1F, 0F);

		shermanModel[333].addShapeBox(10F, -38F, -18F, 7, 13, 36, 0F, 6F, 0F, -2F, -1F, -2F, -5F, -1F, -2F, -5F, 6F, 0F, -2F, 6F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 6F, 0F, 0F); // Import Box35
		shermanModel[333].setRotationPoint(0F, -1F, 0F);

		shermanModel[334].addShapeBox(-21F, -31F, -14F, 11, 6, 28, 0F, 5F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -5F); // Import Box36
		shermanModel[334].setRotationPoint(0F, -1F, 0F);

		shermanModel[335].addShapeBox(-26F, -38F, -18F, 16, 7, 36, 0F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F); // Import Box37
		shermanModel[335].setRotationPoint(0F, -1F, 0F);

		shermanModel[336].addShapeBox(16F, -35F, -10F, 3, 7, 20, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Import Box39
		shermanModel[336].setRotationPoint(0F, -1F, 0F);

		shermanModel[337].addShapeBox(-12F, -40F, -12F, 14, 2, 10, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		shermanModel[337].setRotationPoint(0F, -1F, 0F);

		shermanModel[338].addShapeBox(-12F, -40F, -14F, 14, 2, 2, 0F, -4F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		shermanModel[338].setRotationPoint(0F, -1F, 0F);

		shermanModel[339].addShapeBox(-12F, -40F, -2F, 14, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box49
		shermanModel[339].setRotationPoint(0F, -1F, 0F);

		shermanModel[340].addShapeBox(-6F, -39F, 7F, 10, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		shermanModel[340].setRotationPoint(0F, -1F, 0F);
		shermanModel[340].rotateAngleY = -0.54105207F;

		shermanModel[341].addShapeBox(-3F, -40F, 12F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		shermanModel[341].setRotationPoint(0F, -1F, 0F);
		shermanModel[341].rotateAngleY = -0.54105207F;

		shermanModel[342].addShapeBox(-22F, -42F, -4F, 3, 4, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		shermanModel[342].setRotationPoint(0F, -1F, 0F);

		shermanModel[343].addShapeBox(-21.5F, -48F, -3.5F, 2, 6, 2, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box46
		shermanModel[343].setRotationPoint(0F, -1F, 0F);

		shermanModel[344].addShapeBox(-30F, -38F, -7F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		shermanModel[344].setRotationPoint(0F, -1F, 0F);

		shermanModel[345].addShapeBox(-30F, -38F, 6F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		shermanModel[345].setRotationPoint(0F, -1F, 0F);

		shermanModel[346].addShapeBox(-29F, -35.5F, 5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		shermanModel[346].setRotationPoint(0F, -1F, 0F);

		shermanModel[347].addShapeBox(-29F, -35.5F, -6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		shermanModel[347].setRotationPoint(0F, -1F, 0F);

		shermanModel[348].addShapeBox(-30F, -39F, -7F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		shermanModel[348].setRotationPoint(0F, -1F, 0F);

		shermanModel[349].addShapeBox(-30F, -39F, 6F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		shermanModel[349].setRotationPoint(0F, -1F, 0F);

		shermanModel[350].addShapeBox(0F, -40F, 12F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		shermanModel[350].setRotationPoint(0F, -1F, 0F);
		shermanModel[350].rotateAngleY = -0.54105207F;

		shermanModel[351].addShapeBox(-3F, -40.8F, 12F, 4, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box54
		shermanModel[351].setRotationPoint(0F, -1F, 0F);
		shermanModel[351].rotateAngleY = -0.54105207F;

		shermanModel[352].addBox(-8F, -25F, 23.2F, 6, 4, 1, 0F); // Import Box55
		shermanModel[352].setRotationPoint(0F, -1F, 0F);
		shermanModel[352].rotateAngleX = 0.2443461F;

		shermanModel[353].addBox(-8F, -25.2F, 23.3F, 1, 1, 1, 0F); // Import Box56
		shermanModel[353].setRotationPoint(0F, -1F, 0F);
		shermanModel[353].rotateAngleX = 0.2443461F;

		shermanModel[354].addBox(-3F, -25.2F, 23.3F, 1, 1, 1, 0F); // Import Box57
		shermanModel[354].setRotationPoint(0F, -1F, 0F);
		shermanModel[354].rotateAngleX = 0.2443461F;

		shermanModel[355].addShapeBox(-26.5F, -37F, -3F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		shermanModel[355].setRotationPoint(0F, -1F, 0F);

		shermanModel[356].addBox(8F, -39F, -11F, 1, 2, 4, 0F); // Import Box69
		shermanModel[356].setRotationPoint(0F, -1F, 0F);

		shermanModel[357].addShapeBox(7F, -38F, -11F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		shermanModel[357].setRotationPoint(0F, -1F, 0F);

		shermanModel[358].addShapeBox(7F, -38F, 7F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		shermanModel[358].setRotationPoint(0F, -1F, 0F);

		shermanModel[359].addBox(8F, -39F, 7F, 1, 2, 4, 0F); // Import Box72
		shermanModel[359].setRotationPoint(0F, -1F, 0F);

		shermanModel[360].addShapeBox(1.5F, -44F, 2.5F, 2, 6, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box76
		shermanModel[360].setRotationPoint(0F, -1F, 0F);

		shermanModel[361].addShapeBox(-15.5F, -52F, 9.5F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		shermanModel[361].setRotationPoint(0F, -1F, 0F);
		shermanModel[361].rotateAngleY = -0.66322512F;
		shermanModel[361].rotateAngleZ = -0.13962634F;

		shermanModel[362].addShapeBox(-19.5F, -52F, 9.5F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box289
		shermanModel[362].setRotationPoint(0F, -1F, 0F);
		shermanModel[362].rotateAngleY = -0.66322512F;
		shermanModel[362].rotateAngleZ = -0.13962634F;

		shermanModel[363].addShapeBox(-21.5F, -52.5F, 8.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		shermanModel[363].setRotationPoint(0F, -1F, 0F);
		shermanModel[363].rotateAngleY = -0.66322512F;
		shermanModel[363].rotateAngleZ = -0.13962634F;

		shermanModel[364].addShapeBox(-21.5F, -52.5F, 11.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		shermanModel[364].setRotationPoint(0F, -1F, 0F);
		shermanModel[364].rotateAngleY = -0.66322512F;
		shermanModel[364].rotateAngleZ = -0.13962634F;

		shermanModel[365].addShapeBox(-6.5F, -51.5F, 10F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Import Box292
		shermanModel[365].setRotationPoint(0F, -1F, 0F);
		shermanModel[365].rotateAngleY = -0.66322512F;
		shermanModel[365].rotateAngleZ = -0.13962634F;

		shermanModel[366].addShapeBox(-1.5F, -51.5F, 10F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box293
		shermanModel[366].setRotationPoint(0F, -1F, 0F);
		shermanModel[366].rotateAngleY = -0.66322512F;
		shermanModel[366].rotateAngleZ = -0.13962634F;

		shermanModel[367].addShapeBox(-12.5F, -51.8F, 8F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		shermanModel[367].setRotationPoint(0F, -1F, 0F);
		shermanModel[367].rotateAngleY = -0.66322512F;
		shermanModel[367].rotateAngleZ = -0.13962634F;

		shermanModel[368].addShapeBox(-20.5F, -52F, 9.5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		shermanModel[368].setRotationPoint(0F, -1F, 0F);
		shermanModel[368].rotateAngleY = -0.66322512F;
		shermanModel[368].rotateAngleZ = -0.13962634F;

		shermanModel[369].addShapeBox(-20.5F, -52F, 11.5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box296
		shermanModel[369].setRotationPoint(0F, -1F, 0F);
		shermanModel[369].rotateAngleY = -0.66322512F;
		shermanModel[369].rotateAngleZ = -0.13962634F;

		shermanModel[370].addShapeBox(-12.5F, -51.5F, 11.5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		shermanModel[370].setRotationPoint(0F, -1F, 0F);
		shermanModel[370].rotateAngleY = -0.66322512F;
		shermanModel[370].rotateAngleZ = -0.13962634F;

		shermanModel[371].addShapeBox(-3.5F, -50.8F, 9F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box299
		shermanModel[371].setRotationPoint(0F, -1F, 0F);
		shermanModel[371].rotateAngleY = -0.66322512F;
		shermanModel[371].rotateAngleZ = -0.13962634F;

		shermanModel[372].addShapeBox(25F, 20.5F, -10F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		shermanModel[372].setRotationPoint(0F, -1F, 0F);
		shermanModel[372].rotateAngleY = 4.81710874F;
		shermanModel[372].rotateAngleZ = -1.69296937F;

		shermanModel[373].addShapeBox(31F, 18F, -10F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box42
		shermanModel[373].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[373].rotateAngleY = 4.81710874F;
		shermanModel[373].rotateAngleZ = -1.69296937F;

		shermanModel[374].addShapeBox(31F, 18F, -7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box42
		shermanModel[374].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[374].rotateAngleY = 4.81710874F;
		shermanModel[374].rotateAngleZ = -1.69296937F;

		shermanModel[375].addShapeBox(26F, 18F, -10F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box42
		shermanModel[375].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[375].rotateAngleY = 4.81710874F;
		shermanModel[375].rotateAngleZ = -1.69296937F;

		shermanModel[376].addShapeBox(26F, 18F, -7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box42
		shermanModel[376].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[376].rotateAngleY = 4.81710874F;
		shermanModel[376].rotateAngleZ = -1.69296937F;

		shermanModel[377].addShapeBox(25F, 20.5F, -11F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		shermanModel[377].setRotationPoint(0F, -1F, 0F);
		shermanModel[377].rotateAngleY = 4.81710874F;
		shermanModel[377].rotateAngleZ = -1.69296937F;

		shermanModel[378].addShapeBox(25F, 20.5F, -7F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		shermanModel[378].setRotationPoint(0F, -1F, 0F);
		shermanModel[378].rotateAngleY = 4.81710874F;
		shermanModel[378].rotateAngleZ = -1.69296937F;

		shermanModel[379].addShapeBox(25F, 20.5F, -8F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		shermanModel[379].setRotationPoint(0F, -1F, 0F);
		shermanModel[379].rotateAngleY = 4.81710874F;
		shermanModel[379].rotateAngleZ = -1.69296937F;

		shermanModel[380].addShapeBox(31F, 18F, -4.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box8
		shermanModel[380].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[380].rotateAngleY = 4.76474886F;
		shermanModel[380].rotateAngleZ = -1.69296937F;

		shermanModel[381].addShapeBox(31F, 18F, -1.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box9
		shermanModel[381].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[381].rotateAngleY = 4.76474886F;
		shermanModel[381].rotateAngleZ = -1.69296937F;

		shermanModel[382].addShapeBox(26F, 18F, -4.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box10
		shermanModel[382].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[382].rotateAngleY = 4.76474886F;
		shermanModel[382].rotateAngleZ = -1.69296937F;

		shermanModel[383].addShapeBox(26F, 18F, -1.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box11
		shermanModel[383].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[383].rotateAngleY = 4.76474886F;
		shermanModel[383].rotateAngleZ = -1.69296937F;

		shermanModel[384].addShapeBox(25F, 20.5F, -5.7F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		shermanModel[384].setRotationPoint(0F, -1F, 0F);
		shermanModel[384].rotateAngleY = 4.76474886F;
		shermanModel[384].rotateAngleZ = -1.69296937F;

		shermanModel[385].addShapeBox(25F, 20.5F, -4.7F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		shermanModel[385].setRotationPoint(0F, -1F, 0F);
		shermanModel[385].rotateAngleY = 4.76474886F;
		shermanModel[385].rotateAngleZ = -1.69296937F;

		shermanModel[386].addShapeBox(25F, 20.5F, -2.7F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		shermanModel[386].setRotationPoint(0F, -1F, 0F);
		shermanModel[386].rotateAngleY = 4.76474886F;
		shermanModel[386].rotateAngleZ = -1.69296937F;

		shermanModel[387].addShapeBox(25F, 20.5F, -1.7F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		shermanModel[387].setRotationPoint(0F, -1F, 0F);
		shermanModel[387].rotateAngleY = 4.76474886F;
		shermanModel[387].rotateAngleZ = -1.69296937F;

		shermanModel[388].addShapeBox(29F, 21F, 11.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box16
		shermanModel[388].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[388].rotateAngleY = 4.38077642F;
		shermanModel[388].rotateAngleZ = -1.76278254F;

		shermanModel[389].addShapeBox(29F, 21F, 14.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box17
		shermanModel[389].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[389].rotateAngleY = 4.38077642F;
		shermanModel[389].rotateAngleZ = -1.76278254F;

		shermanModel[390].addShapeBox(24F, 21F, 11.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box18
		shermanModel[390].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[390].rotateAngleY = 4.38077642F;
		shermanModel[390].rotateAngleZ = -1.76278254F;

		shermanModel[391].addShapeBox(24F, 21F, 14.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box19
		shermanModel[391].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[391].rotateAngleY = 4.38077642F;
		shermanModel[391].rotateAngleZ = -1.76278254F;

		shermanModel[392].addShapeBox(23F, 23.5F, 10.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		shermanModel[392].setRotationPoint(0F, -1F, 0F);
		shermanModel[392].rotateAngleY = 4.38077642F;
		shermanModel[392].rotateAngleZ = -1.76278254F;

		shermanModel[393].addShapeBox(23F, 23.5F, 11.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		shermanModel[393].setRotationPoint(0F, -1F, 0F);
		shermanModel[393].rotateAngleY = 4.38077642F;
		shermanModel[393].rotateAngleZ = -1.76278254F;

		shermanModel[394].addShapeBox(23F, 23.5F, 13.3F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		shermanModel[394].setRotationPoint(0F, -1F, 0F);
		shermanModel[394].rotateAngleY = 4.38077642F;
		shermanModel[394].rotateAngleZ = -1.76278254F;

		shermanModel[395].addShapeBox(23F, 23.5F, 14.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		shermanModel[395].setRotationPoint(0F, -1F, 0F);
		shermanModel[395].rotateAngleY = 4.38077642F;
		shermanModel[395].rotateAngleZ = -1.76278254F;

		shermanModel[396].addShapeBox(23F, 23.5F, 5F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		shermanModel[396].setRotationPoint(0F, -1F, 0F);
		shermanModel[396].rotateAngleY = 4.4331363F;
		shermanModel[396].rotateAngleZ = -1.76278254F;

		shermanModel[397].addShapeBox(23F, 23.5F, 6F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		shermanModel[397].setRotationPoint(0F, -1F, 0F);
		shermanModel[397].rotateAngleY = 4.4331363F;
		shermanModel[397].rotateAngleZ = -1.76278254F;

		shermanModel[398].addShapeBox(29F, 21F, 6F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box26
		shermanModel[398].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[398].rotateAngleY = 4.4331363F;
		shermanModel[398].rotateAngleZ = -1.76278254F;

		shermanModel[399].addShapeBox(24F, 21F, 6F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box27
		shermanModel[399].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[399].rotateAngleY = 4.4331363F;
		shermanModel[399].rotateAngleZ = -1.76278254F;

		shermanModel[400].addShapeBox(23F, 23.5F, 8F, 10, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		shermanModel[400].setRotationPoint(0F, -1F, 0F);
		shermanModel[400].rotateAngleY = 4.4331363F;
		shermanModel[400].rotateAngleZ = -1.76278254F;

		shermanModel[401].addShapeBox(24F, 21F, 9F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box29
		shermanModel[401].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[401].rotateAngleY = 4.4331363F;
		shermanModel[401].rotateAngleZ = -1.76278254F;

		shermanModel[402].addShapeBox(23F, 23.5F, 9F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		shermanModel[402].setRotationPoint(0F, -1F, 0F);
		shermanModel[402].rotateAngleY = 4.4331363F;
		shermanModel[402].rotateAngleZ = -1.76278254F;

		shermanModel[403].addShapeBox(29F, 21F, 9F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box31
		shermanModel[403].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[403].rotateAngleY = 4.4331363F;
		shermanModel[403].rotateAngleZ = -1.76278254F;

		shermanModel[404].addShapeBox(25F, 20.5F, 3F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box32
		shermanModel[404].setRotationPoint(0F, -1F, 0F);
		shermanModel[404].rotateAngleY = 1.41371669F;
		shermanModel[404].rotateAngleZ = -1.69296937F;

		shermanModel[405].addShapeBox(25F, 20.5F, 1F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		shermanModel[405].setRotationPoint(0F, -1F, 0F);
		shermanModel[405].rotateAngleY = 1.41371669F;
		shermanModel[405].rotateAngleZ = -1.69296937F;

		shermanModel[406].addShapeBox(31F, 18F, 1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box34
		shermanModel[406].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[406].rotateAngleY = 1.41371669F;
		shermanModel[406].rotateAngleZ = -1.69296937F;

		shermanModel[407].addShapeBox(26F, 18F, 1F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box35
		shermanModel[407].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[407].rotateAngleY = 1.41371669F;
		shermanModel[407].rotateAngleZ = -1.69296937F;

		shermanModel[408].addShapeBox(25F, 20.5F, 6F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box36
		shermanModel[408].setRotationPoint(0F, -1F, 0F);
		shermanModel[408].rotateAngleY = 1.41371669F;
		shermanModel[408].rotateAngleZ = -1.69296937F;

		shermanModel[409].addShapeBox(25F, 20.5F, 4F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		shermanModel[409].setRotationPoint(0F, -1F, 0F);
		shermanModel[409].rotateAngleY = 1.41371669F;
		shermanModel[409].rotateAngleZ = -1.69296937F;

		shermanModel[410].addShapeBox(26F, 18F, 4F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box38
		shermanModel[410].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[410].rotateAngleY = 1.41371669F;
		shermanModel[410].rotateAngleZ = -1.69296937F;

		shermanModel[411].addShapeBox(31F, 18F, 4F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box39
		shermanModel[411].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[411].rotateAngleY = 1.41371669F;
		shermanModel[411].rotateAngleZ = -1.69296937F;

		shermanModel[412].addShapeBox(25F, 20.5F, 8.3F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box40
		shermanModel[412].setRotationPoint(0F, -1F, 0F);
		shermanModel[412].rotateAngleY = 1.36135682F;
		shermanModel[412].rotateAngleZ = -1.69296937F;

		shermanModel[413].addShapeBox(26F, 18F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box41
		shermanModel[413].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[413].rotateAngleY = 1.36135682F;
		shermanModel[413].rotateAngleZ = -1.69296937F;

		shermanModel[414].addShapeBox(25F, 20.5F, 6.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		shermanModel[414].setRotationPoint(0F, -1F, 0F);
		shermanModel[414].rotateAngleY = 1.36135682F;
		shermanModel[414].rotateAngleZ = -1.69296937F;

		shermanModel[415].addShapeBox(31F, 18F, 6.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box43
		shermanModel[415].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[415].rotateAngleY = 1.36135682F;
		shermanModel[415].rotateAngleZ = -1.69296937F;

		shermanModel[416].addShapeBox(25F, 20.5F, 11.3F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box44
		shermanModel[416].setRotationPoint(0F, -1F, 0F);
		shermanModel[416].rotateAngleY = 1.36135682F;
		shermanModel[416].rotateAngleZ = -1.69296937F;

		shermanModel[417].addShapeBox(31F, 18F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box45
		shermanModel[417].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[417].rotateAngleY = 1.36135682F;
		shermanModel[417].rotateAngleZ = -1.69296937F;

		shermanModel[418].addShapeBox(25F, 20.5F, 9.3F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box46
		shermanModel[418].setRotationPoint(0F, -1F, 0F);
		shermanModel[418].rotateAngleY = 1.36135682F;
		shermanModel[418].rotateAngleZ = -1.69296937F;

		shermanModel[419].addShapeBox(26F, 18F, 9.3F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box47
		shermanModel[419].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[419].rotateAngleY = 1.36135682F;
		shermanModel[419].rotateAngleZ = -1.69296937F;

		shermanModel[420].addShapeBox(23F, 23.5F, -14F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		shermanModel[420].setRotationPoint(0F, -1F, 0F);
		shermanModel[420].rotateAngleY = 1.91986218F;
		shermanModel[420].rotateAngleZ = -1.76278254F;

		shermanModel[421].addShapeBox(24F, 21F, -17F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box49
		shermanModel[421].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[421].rotateAngleY = 1.91986218F;
		shermanModel[421].rotateAngleZ = -1.76278254F;

		shermanModel[422].addShapeBox(29F, 21F, -17F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box50
		shermanModel[422].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[422].rotateAngleY = 1.91986218F;
		shermanModel[422].rotateAngleZ = -1.76278254F;

		shermanModel[423].addShapeBox(23F, 23.5F, -17F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		shermanModel[423].setRotationPoint(0F, -1F, 0F);
		shermanModel[423].rotateAngleY = 1.91986218F;
		shermanModel[423].rotateAngleZ = -1.76278254F;

		shermanModel[424].addShapeBox(23F, 23.5F, -15F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box52
		shermanModel[424].setRotationPoint(0F, -1F, 0F);
		shermanModel[424].rotateAngleY = 1.91986218F;
		shermanModel[424].rotateAngleZ = -1.76278254F;

		shermanModel[425].addShapeBox(24F, 21F, -14F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box53
		shermanModel[425].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[425].rotateAngleY = 1.91986218F;
		shermanModel[425].rotateAngleZ = -1.76278254F;

		shermanModel[426].addShapeBox(29F, 21F, -14F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box54
		shermanModel[426].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[426].rotateAngleY = 1.91986218F;
		shermanModel[426].rotateAngleZ = -1.76278254F;

		shermanModel[427].addShapeBox(23F, 23.5F, -12F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box55
		shermanModel[427].setRotationPoint(0F, -1F, 0F);
		shermanModel[427].rotateAngleY = 1.91986218F;
		shermanModel[427].rotateAngleZ = -1.76278254F;

		shermanModel[428].addShapeBox(29F, 21F, -11.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box56
		shermanModel[428].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[428].rotateAngleY = 1.8675023F;
		shermanModel[428].rotateAngleZ = -1.76278254F;

		shermanModel[429].addShapeBox(24F, 21F, -11.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box57
		shermanModel[429].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[429].rotateAngleY = 1.8675023F;
		shermanModel[429].rotateAngleZ = -1.76278254F;

		shermanModel[430].addShapeBox(23F, 23.5F, -11.7F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		shermanModel[430].setRotationPoint(0F, -1F, 0F);
		shermanModel[430].rotateAngleY = 1.8675023F;
		shermanModel[430].rotateAngleZ = -1.76278254F;

		shermanModel[431].addShapeBox(23F, 23.5F, -9.7F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box59
		shermanModel[431].setRotationPoint(0F, -1F, 0F);
		shermanModel[431].rotateAngleY = 1.8675023F;
		shermanModel[431].rotateAngleZ = -1.76278254F;

		shermanModel[432].addShapeBox(23F, 23.5F, -8.7F, 10, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		shermanModel[432].setRotationPoint(0F, -1F, 0F);
		shermanModel[432].rotateAngleY = 1.8675023F;
		shermanModel[432].rotateAngleZ = -1.76278254F;

		shermanModel[433].addShapeBox(24F, 21F, -8.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box61
		shermanModel[433].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[433].rotateAngleY = 1.8675023F;
		shermanModel[433].rotateAngleZ = -1.76278254F;

		shermanModel[434].addShapeBox(29F, 21F, -8.7F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Import Box62
		shermanModel[434].setRotationPoint(3.5F, -2F, 0F);
		shermanModel[434].rotateAngleY = 1.8675023F;
		shermanModel[434].rotateAngleZ = -1.76278254F;

		shermanModel[435].addShapeBox(23F, 23.5F, -6.7F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box63
		shermanModel[435].setRotationPoint(0F, -1F, 0F);
		shermanModel[435].rotateAngleY = 1.8675023F;
		shermanModel[435].rotateAngleZ = -1.76278254F;

		shermanModel[436].addShapeBox(-3F, -44.3F, 7.5F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box4
		shermanModel[436].setRotationPoint(0F, -1F, 0F);
		shermanModel[436].rotateAngleX = 0.2443461F;
		shermanModel[436].rotateAngleY = 1.25663706F;

		shermanModel[437].addShapeBox(-3.5F, -42.8F, 13.3F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box5
		shermanModel[437].setRotationPoint(0F, -1F, 0F);
		shermanModel[437].rotateAngleX = 0.2443461F;
		shermanModel[437].rotateAngleY = 1.25663706F;

		shermanModel[438].addShapeBox(-2.5F, -43.8F, 14F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		shermanModel[438].setRotationPoint(0F, -1F, 0F);
		shermanModel[438].rotateAngleX = 0.2443461F;
		shermanModel[438].rotateAngleY = 1.25663706F;

		shermanModel[439].addShapeBox(-2.5F, -43.8F, 14.5F, 1, 1, 10, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box8
		shermanModel[439].setRotationPoint(0F, -1F, 0F);
		shermanModel[439].rotateAngleX = 0.2443461F;
		shermanModel[439].rotateAngleY = 1.25663706F;

		shermanModel[440].addShapeBox(-2.5F, -43.3F, 6F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		shermanModel[440].setRotationPoint(0F, -1F, 0F);
		shermanModel[440].rotateAngleX = 0.2443461F;
		shermanModel[440].rotateAngleY = 1.25663706F;

		shermanModel[441].addShapeBox(-2.5F, -43.3F, 6F, 1, 3, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F); // Import Box10
		shermanModel[441].setRotationPoint(0F, -1F, 0F);
		shermanModel[441].rotateAngleX = 0.2443461F;
		shermanModel[441].rotateAngleY = 1.25663706F;

		shermanModel[442].addShapeBox(-2.5F, -45F, 13.4F, 1, 1, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		shermanModel[442].setRotationPoint(0F, -1F, 0F);
		shermanModel[442].rotateAngleX = 0.2443461F;
		shermanModel[442].rotateAngleY = 1.25663706F;

		shermanModel[443].addShapeBox(-6F, -43.7F, 12F, 3, 2, 4, 0F, 0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F); // Import Box299
		shermanModel[443].setRotationPoint(0F, -1F, 0F);
		shermanModel[443].rotateAngleX = 0.29670597F;
		shermanModel[443].rotateAngleY = 1.25663706F;

		shermanModel[444].addShapeBox(-2.5F, -44.3F, 8F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		shermanModel[444].setRotationPoint(0F, -1.5F, 0F);
		shermanModel[444].rotateAngleX = 0.2443461F;
		shermanModel[444].rotateAngleY = 1.25663706F;

		shermanModel[445].addShapeBox(-2.5F, -44.3F, 8F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Import Box14
		shermanModel[445].setRotationPoint(0F, -2.2F, 0F);
		shermanModel[445].rotateAngleX = 0.2443461F;
		shermanModel[445].rotateAngleY = 1.25663706F;

		shermanModel[446].addShapeBox(-1.5F, -42.8F, 13.3F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box15
		shermanModel[446].setRotationPoint(0F, -1F, 0F);
		shermanModel[446].rotateAngleX = 0.2443461F;
		shermanModel[446].rotateAngleY = 1.25663706F;

		shermanModel[447].addShapeBox(0F, -4F, -10F, 3, 9, 20, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Import Box38
		shermanModel[447].setRotationPoint(17.5F, -32.5F, 0F);

		shermanModel[448].addShapeBox(-1F, -1.5F, -1.5F, 45, 3, 3, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Import Box40
		shermanModel[448].setRotationPoint(17.5F, -32.5F, 0F);

		shermanModel[449].addShapeBox(-1F, -2.5F, -2.5F, 9, 5, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Import Box41
		shermanModel[449].setRotationPoint(17.5F, -32.5F, 0F);

		shermanModel[450].addShapeBox(44F, -1.5F, -1.5F, 2, 3, 3, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box54
		shermanModel[450].setRotationPoint(17.5F, -32.5F, 0F);

		shermanModel[451].addShapeBox(46F, -1.5F, -1.5F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		shermanModel[451].setRotationPoint(17.5F, -32.5F, 0F);

		shermanModel[452].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box268
		shermanModel[452].setRotationPoint(45.5F, -5.2F, -25F);

		shermanModel[453].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box269
		shermanModel[453].setRotationPoint(46F, -4.5F, -25F);
		shermanModel[453].rotateAngleZ = 3.71755131F;

		shermanModel[454].addBox(0F, 0F, 0F, 17, 1, 11, 0F); // Import Box270
		shermanModel[454].setRotationPoint(27F, -7F, -25F);

		shermanModel[455].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box271
		shermanModel[455].setRotationPoint(27F, -6F, -25F);
		shermanModel[455].rotateAngleZ = 3.4906585F;

		shermanModel[456].addBox(0F, 0F, 0F, 8, 1, 11, 0F); // Import Box272
		shermanModel[456].setRotationPoint(17.5F, -7.6F, -25F);

		shermanModel[457].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box273
		shermanModel[457].setRotationPoint(17.5F, -6.6F, -25F);
		shermanModel[457].rotateAngleZ = 3.85717765F;

		shermanModel[458].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box274
		shermanModel[458].setRotationPoint(14.5F, -8.2F, -25F);
		shermanModel[458].rotateAngleZ = -3.66519143F;

		shermanModel[459].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box275
		shermanModel[459].setRotationPoint(-7F, -7.6F, -25F);

		shermanModel[460].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box276
		shermanModel[460].setRotationPoint(13.5F, -8.6F, -25F);

		shermanModel[461].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box277
		shermanModel[461].setRotationPoint(-7.5F, -6.6F, -25F);
		shermanModel[461].rotateAngleZ = 3.85717765F;

		shermanModel[462].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box278
		shermanModel[462].setRotationPoint(-11.5F, -8.6F, -25F);

		shermanModel[463].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box279
		shermanModel[463].setRotationPoint(-10.5F, -8.2F, -25F);
		shermanModel[463].rotateAngleZ = -3.66519143F;

		shermanModel[464].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box280
		shermanModel[464].setRotationPoint(-32F, -7.6F, -25F);

		shermanModel[465].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box281
		shermanModel[465].setRotationPoint(-32.5F, -6.6F, -25F);
		shermanModel[465].rotateAngleZ = 3.85717765F;

		shermanModel[466].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box282
		shermanModel[466].setRotationPoint(-36.5F, -8.6F, -25F);

		shermanModel[467].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box283
		shermanModel[467].setRotationPoint(-35.5F, -8.2F, -25F);
		shermanModel[467].rotateAngleZ = -3.66519143F;

		shermanModel[468].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box284
		shermanModel[468].setRotationPoint(-51F, -7F, -25F);
		shermanModel[468].rotateAngleZ = -0.05235988F;

		shermanModel[469].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Import Box285
		shermanModel[469].setRotationPoint(-51F, -6.2F, -25F);
		shermanModel[469].rotateAngleZ = -3.7350046F;

		shermanModel[470].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box286
		shermanModel[470].setRotationPoint(-54.8F, -4.8F, -25F);

		shermanModel[471].addShapeBox(0F, -1F, 0F, 14, 1, 11, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		shermanModel[471].setRotationPoint(-55F, 2F, -25F);
		shermanModel[471].rotateAngleZ = 0.48869219F;

		shermanModel[472].addBox(0F, 0F, 0F, 77, 1, 11, 0F); // Import Box288
		shermanModel[472].setRotationPoint(-42F, 8F, -25F);

		shermanModel[473].addShapeBox(0F, -1F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F); // Import Box289
		shermanModel[473].setRotationPoint(35F, 9F, -25F);
		shermanModel[473].rotateAngleZ = -0.54105207F;

		shermanModel[474].addBox(0F, 0F, 0F, 17, 1, 11, 0F); // Import Box244
		shermanModel[474].setRotationPoint(27F, -7F, 14F);

		shermanModel[475].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box245
		shermanModel[475].setRotationPoint(27F, -6F, 14F);
		shermanModel[475].rotateAngleZ = 3.4906585F;

		shermanModel[476].addBox(0F, 0F, 0F, 8, 1, 11, 0F); // Import Box246
		shermanModel[476].setRotationPoint(17.5F, -7.6F, 14F);

		shermanModel[477].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box247
		shermanModel[477].setRotationPoint(17.5F, -6.6F, 14F);
		shermanModel[477].rotateAngleZ = 3.85717765F;

		shermanModel[478].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box248
		shermanModel[478].setRotationPoint(13.5F, -8.6F, 14F);

		shermanModel[479].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box249
		shermanModel[479].setRotationPoint(14.5F, -8.2F, 14F);
		shermanModel[479].rotateAngleZ = -3.66519143F;

		shermanModel[480].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box250
		shermanModel[480].setRotationPoint(-7.5F, -6.6F, 14F);
		shermanModel[480].rotateAngleZ = 3.85717765F;

		shermanModel[481].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box252
		shermanModel[481].setRotationPoint(-11.5F, -8.6F, 14F);

		shermanModel[482].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box253
		shermanModel[482].setRotationPoint(-32.5F, -6.6F, 14F);
		shermanModel[482].rotateAngleZ = 3.85717765F;

		shermanModel[483].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box255
		shermanModel[483].setRotationPoint(-36.5F, -8.6F, 14F);

		shermanModel[484].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box256
		shermanModel[484].setRotationPoint(-7F, -7.6F, 14F);

		shermanModel[485].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box257
		shermanModel[485].setRotationPoint(-32F, -7.6F, 14F);

		shermanModel[486].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box258
		shermanModel[486].setRotationPoint(-10.5F, -8.2F, 14F);
		shermanModel[486].rotateAngleZ = -3.66519143F;

		shermanModel[487].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box259
		shermanModel[487].setRotationPoint(-51F, -7F, 14F);
		shermanModel[487].rotateAngleZ = -0.05235988F;

		shermanModel[488].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box260
		shermanModel[488].setRotationPoint(-35.5F, -8.2F, 14F);
		shermanModel[488].rotateAngleZ = -3.66519143F;

		shermanModel[489].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box261
		shermanModel[489].setRotationPoint(46F, -4.5F, 14F);
		shermanModel[489].rotateAngleZ = 3.71755131F;

		shermanModel[490].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box262
		shermanModel[490].setRotationPoint(45.5F, -5.2F, 14F);

		shermanModel[491].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Import Box263
		shermanModel[491].setRotationPoint(-51F, -6.2F, 14F);
		shermanModel[491].rotateAngleZ = -3.7350046F;

		shermanModel[492].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box264
		shermanModel[492].setRotationPoint(-54.8F, -4.8F, 14F);

		shermanModel[493].addBox(0F, 0F, 0F, 77, 1, 11, 0F); // Import Box265
		shermanModel[493].setRotationPoint(-42F, 8F, 14F);

		shermanModel[494].addShapeBox(0F, -1F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F); // Import Box266
		shermanModel[494].setRotationPoint(35F, 9F, 14F);
		shermanModel[494].rotateAngleZ = -0.54105207F;

		shermanModel[495].addShapeBox(0F, -1F, 0F, 14, 1, 11, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box267
		shermanModel[495].setRotationPoint(-55F, 2F, 14F);
		shermanModel[495].rotateAngleZ = 0.48869219F;
	}


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 496; i++)
		{
			shermanModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}
	
	public ModelRendererTurbo shermanModel[];
}