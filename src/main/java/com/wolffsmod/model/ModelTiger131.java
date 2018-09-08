//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tiger131
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTiger131 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelTiger131()
	{
		tiger131Model = new ModelRendererTurbo[306];
		tiger131Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		tiger131Model[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box1
		tiger131Model[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box2
		tiger131Model[3] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import Box3
		tiger131Model[4] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Import Box4
		tiger131Model[5] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box6
		tiger131Model[6] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Import Box7
		tiger131Model[7] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Import Box28
		tiger131Model[8] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Import Box30
		tiger131Model[9] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box46
		tiger131Model[10] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import Box89
		tiger131Model[11] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box90
		tiger131Model[12] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Import Box91
		tiger131Model[13] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import Box92
		tiger131Model[14] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box93
		tiger131Model[15] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import Box94
		tiger131Model[16] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Import Box95
		tiger131Model[17] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Import Box96
		tiger131Model[18] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Import Box97
		tiger131Model[19] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Import Box98
		tiger131Model[20] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Import Box99
		tiger131Model[21] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Import Box100
		tiger131Model[22] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Import Box101
		tiger131Model[23] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Import Box102
		tiger131Model[24] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Import Box103
		tiger131Model[25] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Import Box104
		tiger131Model[26] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Import Box105
		tiger131Model[27] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Import Box106
		tiger131Model[28] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Import Box107
		tiger131Model[29] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Import Box108
		tiger131Model[30] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Import Box109
		tiger131Model[31] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Import Box110
		tiger131Model[32] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Import Box111
		tiger131Model[33] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Import Box112
		tiger131Model[34] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Import Box113
		tiger131Model[35] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Import Box114
		tiger131Model[36] = new ModelRendererTurbo(this, 137, 217, textureX, textureY); // Import Box115
		tiger131Model[37] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Import Box116
		tiger131Model[38] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Import Box117
		tiger131Model[39] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Import Box118
		tiger131Model[40] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Import Box119
		tiger131Model[41] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Import Box120
		tiger131Model[42] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Import Box121
		tiger131Model[43] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Import Box125
		tiger131Model[44] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Import Box126
		tiger131Model[45] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Import Box127
		tiger131Model[46] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Import Box128
		tiger131Model[47] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Import Box129
		tiger131Model[48] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Import Box130
		tiger131Model[49] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Import Box131
		tiger131Model[50] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Import Box132
		tiger131Model[51] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Import Box133
		tiger131Model[52] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Import Box134
		tiger131Model[53] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Import Box135
		tiger131Model[54] = new ModelRendererTurbo(this, 161, 233, textureX, textureY); // Import Box136
		tiger131Model[55] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Import Box137
		tiger131Model[56] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Import Box138
		tiger131Model[57] = new ModelRendererTurbo(this, 473, 233, textureX, textureY); // Import Box139
		tiger131Model[58] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box140
		tiger131Model[59] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Import Box141
		tiger131Model[60] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Import Box142
		tiger131Model[61] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Import Box143
		tiger131Model[62] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Import Box144
		tiger131Model[63] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Import Box145
		tiger131Model[64] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Import Box146
		tiger131Model[65] = new ModelRendererTurbo(this, 329, 241, textureX, textureY); // Import Box147
		tiger131Model[66] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Import Box148
		tiger131Model[67] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Import Box149
		tiger131Model[68] = new ModelRendererTurbo(this, 441, 241, textureX, textureY); // Import Box150
		tiger131Model[69] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Import Box151
		tiger131Model[70] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Import Box152
		tiger131Model[71] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Import Box153
		tiger131Model[72] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Import Box154
		tiger131Model[73] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Import Box155
		tiger131Model[74] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Import Box156
		tiger131Model[75] = new ModelRendererTurbo(this, 289, 249, textureX, textureY); // Import Box157
		tiger131Model[76] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Import Box158
		tiger131Model[77] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Import Box159
		tiger131Model[78] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Import Box160
		tiger131Model[79] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Box161
		tiger131Model[80] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Import Box162
		tiger131Model[81] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Import Box163
		tiger131Model[82] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Import Box164
		tiger131Model[83] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Import Box165
		tiger131Model[84] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Import Box166
		tiger131Model[85] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Import Box167
		tiger131Model[86] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Import Box168
		tiger131Model[87] = new ModelRendererTurbo(this, 425, 257, textureX, textureY); // Import Box169
		tiger131Model[88] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Import Box170
		tiger131Model[89] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box171
		tiger131Model[90] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Import Box172
		tiger131Model[91] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Import Box173
		tiger131Model[92] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Import Box174
		tiger131Model[93] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import Box175
		tiger131Model[94] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Import Box179
		tiger131Model[95] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import Box182
		tiger131Model[96] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Import Box184
		tiger131Model[97] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box185
		tiger131Model[98] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Import Box186
		tiger131Model[99] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box187
		tiger131Model[100] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Import Box188
		tiger131Model[101] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Import Box189
		tiger131Model[102] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Import Box190
		tiger131Model[103] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Import Box191
		tiger131Model[104] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Import Box192
		tiger131Model[105] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Import Box193
		tiger131Model[106] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Import Box198
		tiger131Model[107] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Import Box199
		tiger131Model[108] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Import Box193
		tiger131Model[109] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box194
		tiger131Model[110] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box195
		tiger131Model[111] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Import Box199
		tiger131Model[112] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Import Box200
		tiger131Model[113] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Import Box201
		tiger131Model[114] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Import Box202
		tiger131Model[115] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Import Box206
		tiger131Model[116] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Import Box212
		tiger131Model[117] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Import Box213
		tiger131Model[118] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Import Box214
		tiger131Model[119] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Import Box215
		tiger131Model[120] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Import Box216
		tiger131Model[121] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Import Box217
		tiger131Model[122] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box218
		tiger131Model[123] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Import Box219
		tiger131Model[124] = new ModelRendererTurbo(this, 425, 273, textureX, textureY); // Import Box220
		tiger131Model[125] = new ModelRendererTurbo(this, 465, 273, textureX, textureY); // Import Box221
		tiger131Model[126] = new ModelRendererTurbo(this, 113, 281, textureX, textureY); // Import Box222
		tiger131Model[127] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Import Box223
		tiger131Model[128] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Import Box224
		tiger131Model[129] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import Box225
		tiger131Model[130] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Import Box226
		tiger131Model[131] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Import Box227
		tiger131Model[132] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Import Box228
		tiger131Model[133] = new ModelRendererTurbo(this, 225, 281, textureX, textureY); // Import Box229
		tiger131Model[134] = new ModelRendererTurbo(this, 369, 281, textureX, textureY); // Import Box230
		tiger131Model[135] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Import Box231
		tiger131Model[136] = new ModelRendererTurbo(this, 401, 281, textureX, textureY); // Import Box232
		tiger131Model[137] = new ModelRendererTurbo(this, 433, 281, textureX, textureY); // Import Box233
		tiger131Model[138] = new ModelRendererTurbo(this, 465, 281, textureX, textureY); // Import Box234
		tiger131Model[139] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Import Box235
		tiger131Model[140] = new ModelRendererTurbo(this, 57, 289, textureX, textureY); // Import Box236
		tiger131Model[141] = new ModelRendererTurbo(this, 145, 289, textureX, textureY); // Import Box237
		tiger131Model[142] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Import Box238
		tiger131Model[143] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Import Box239
		tiger131Model[144] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Import Box240
		tiger131Model[145] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Import Box241
		tiger131Model[146] = new ModelRendererTurbo(this, 465, 289, textureX, textureY); // Import Box242
		tiger131Model[147] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Import Box243
		tiger131Model[148] = new ModelRendererTurbo(this, 33, 297, textureX, textureY); // Import Box244
		tiger131Model[149] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Import Box245
		tiger131Model[150] = new ModelRendererTurbo(this, 241, 297, textureX, textureY); // Import Box246
		tiger131Model[151] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Import Box247
		tiger131Model[152] = new ModelRendererTurbo(this, 305, 297, textureX, textureY); // Import Box248
		tiger131Model[153] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Import Box249
		tiger131Model[154] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Import Box250
		tiger131Model[155] = new ModelRendererTurbo(this, 337, 297, textureX, textureY); // Import Box251
		tiger131Model[156] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import Box252
		tiger131Model[157] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box253
		tiger131Model[158] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Import Box254
		tiger131Model[159] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Import Box255
		tiger131Model[160] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Import Box256
		tiger131Model[161] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Import Box257
		tiger131Model[162] = new ModelRendererTurbo(this, 417, 297, textureX, textureY); // Import Box258
		tiger131Model[163] = new ModelRendererTurbo(this, 441, 297, textureX, textureY); // Import Box259
		tiger131Model[164] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box260
		tiger131Model[165] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box261
		tiger131Model[166] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box262
		tiger131Model[167] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box263
		tiger131Model[168] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box264
		tiger131Model[169] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import Box265
		tiger131Model[170] = new ModelRendererTurbo(this, 0, 315, textureX, textureY); // Import Box250
		tiger131Model[171] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box262
		tiger131Model[172] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box263
		tiger131Model[173] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box264
		tiger131Model[174] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box265
		tiger131Model[175] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box266
		tiger131Model[176] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box267
		tiger131Model[177] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box268
		tiger131Model[178] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box269
		tiger131Model[179] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box270
		tiger131Model[180] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box271
		tiger131Model[181] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box272
		tiger131Model[182] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box273
		tiger131Model[183] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box274
		tiger131Model[184] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box275
		tiger131Model[185] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box276
		tiger131Model[186] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box277
		tiger131Model[187] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box278
		tiger131Model[188] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box279
		tiger131Model[189] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box280
		tiger131Model[190] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box281
		tiger131Model[191] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box282
		tiger131Model[192] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box283
		tiger131Model[193] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box284
		tiger131Model[194] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box285
		tiger131Model[195] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box286
		tiger131Model[196] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box287
		tiger131Model[197] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box288
		tiger131Model[198] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box289
		tiger131Model[199] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box290
		tiger131Model[200] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box291
		tiger131Model[201] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box292
		tiger131Model[202] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box293
		tiger131Model[203] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box294
		tiger131Model[204] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box295
		tiger131Model[205] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box296
		tiger131Model[206] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box297
		tiger131Model[207] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box298
		tiger131Model[208] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box299
		tiger131Model[209] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box300
		tiger131Model[210] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box301
		tiger131Model[211] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box302
		tiger131Model[212] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box303
		tiger131Model[213] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box304
		tiger131Model[214] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box305
		tiger131Model[215] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box306
		tiger131Model[216] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box307
		tiger131Model[217] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Import Box308
		tiger131Model[218] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box309
		tiger131Model[219] = new ModelRendererTurbo(this, 0, 425, textureX, textureY); // Import Box310
		tiger131Model[220] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Import Box8
		tiger131Model[221] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Import Box9
		tiger131Model[222] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Import Box10
		tiger131Model[223] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box12
		tiger131Model[224] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box13
		tiger131Model[225] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Import Box15
		tiger131Model[226] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box32
		tiger131Model[227] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box33
		tiger131Model[228] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box34
		tiger131Model[229] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import Box37
		tiger131Model[230] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box38
		tiger131Model[231] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Import Box39
		tiger131Model[232] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Import Box40
		tiger131Model[233] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Import Box41
		tiger131Model[234] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box42
		tiger131Model[235] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box43
		tiger131Model[236] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Import Box44
		tiger131Model[237] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Import Box45
		tiger131Model[238] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Import Box39
		tiger131Model[239] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box40
		tiger131Model[240] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box41
		tiger131Model[241] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box42
		tiger131Model[242] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box43
		tiger131Model[243] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import Box44
		tiger131Model[244] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box45
		tiger131Model[245] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box46
		tiger131Model[246] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box47
		tiger131Model[247] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box0
		tiger131Model[248] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box1
		tiger131Model[249] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box16
		tiger131Model[250] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import Box17
		tiger131Model[251] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Import Box19
		tiger131Model[252] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box20
		tiger131Model[253] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box21
		tiger131Model[254] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box22
		tiger131Model[255] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Import Box23
		tiger131Model[256] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box24
		tiger131Model[257] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box26
		tiger131Model[258] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box27
		tiger131Model[259] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box250
		tiger131Model[260] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box251
		tiger131Model[261] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box252
		tiger131Model[262] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box253
		tiger131Model[263] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box254
		tiger131Model[264] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box255
		tiger131Model[265] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Import Box48
		tiger131Model[266] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box49
		tiger131Model[267] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box50
		tiger131Model[268] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Import Box70
		tiger131Model[269] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Import Box71
		tiger131Model[270] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box72
		tiger131Model[271] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Import Box73
		tiger131Model[272] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Import Box74
		tiger131Model[273] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Import Box75
		tiger131Model[274] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Import Box76
		tiger131Model[275] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Import Box77
		tiger131Model[276] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Import Box78
		tiger131Model[277] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Import Box79
		tiger131Model[278] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Import Box80
		tiger131Model[279] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Import Box81
		tiger131Model[280] = new ModelRendererTurbo(this, 417, 193, textureX, textureY); // Import Box82
		tiger131Model[281] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Import Box83
		tiger131Model[282] = new ModelRendererTurbo(this, 217, 201, textureX, textureY); // Import Box84
		tiger131Model[283] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Import Box87
		tiger131Model[284] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Import Box267
		tiger131Model[285] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Import Box268
		tiger131Model[286] = new ModelRendererTurbo(this, 217, 305, textureX, textureY); // Import Box269
		tiger131Model[287] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Import Box51
		tiger131Model[288] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Import Box52
		tiger131Model[289] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Import Box53
		tiger131Model[290] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box54
		tiger131Model[291] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Import Box55
		tiger131Model[292] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import Box56
		tiger131Model[293] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Import Box57
		tiger131Model[294] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Import Box58
		tiger131Model[295] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Import Box59
		tiger131Model[296] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Import Box60
		tiger131Model[297] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Import Box61
		tiger131Model[298] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Import Box62
		tiger131Model[299] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Import Box63
		tiger131Model[300] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Import Box64
		tiger131Model[301] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Import Box65
		tiger131Model[302] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Import Box66
		tiger131Model[303] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Import Box67
		tiger131Model[304] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Import Box68
		tiger131Model[305] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Import Box69

		tiger131Model[0].addShapeBox(0F, 0F, 0F, 90, 14, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box0
		tiger131Model[0].setRotationPoint(-47F, -14F, -19F);

		tiger131Model[1].addShapeBox(0F, 0F, 0F, 85, 7, 56, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		tiger131Model[1].setRotationPoint(-47F, -21F, -28F);

		tiger131Model[2].addShapeBox(0F, 0F, 0F, 10, 1, 60, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Import Box2
		tiger131Model[2].setRotationPoint(43F, -14F, -30F);
		tiger131Model[2].rotateAngleZ = 0.2443461F;

		tiger131Model[3].addBox(0F, 0F, 0F, 90, 1, 10, 0F); // Import Box3
		tiger131Model[3].setRotationPoint(-47F, -14F, 18F);

		tiger131Model[4].addBox(0F, 0F, 0F, 90, 1, 10, 0F); // Import Box4
		tiger131Model[4].setRotationPoint(-47F, -14F, -28F);

		tiger131Model[5].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Import Box6
		tiger131Model[5].setRotationPoint(40F, -14.9F, 18F);
		tiger131Model[5].rotateAngleZ = 0.2443461F;

		tiger131Model[6].addShapeBox(0F, 0F, 0F, 10, 14, 38, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		tiger131Model[6].setRotationPoint(43F, -14F, -19F);

		tiger131Model[7].addShapeBox(0F, 0F, 0F, 88, 5, 3, 0F, 0.4F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -3F, 0.4F, 0F, -3F, 00F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.2F, 0.4F, 2F, 0.2F); // Import Box28
		tiger131Model[7].setRotationPoint(-47F, -16F, 28F);

		tiger131Model[8].addBox(0F, 0F, 0F, 13, 1, 12, 0F); // Import Box30
		tiger131Model[8].setRotationPoint(40F, -14.9F, -30F);
		tiger131Model[8].rotateAngleZ = 0.2443461F;

		tiger131Model[9].addShapeBox(0F, 0F, 0F, 1, 8, 56, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F); // Import Box46
		tiger131Model[9].setRotationPoint(37.5F, -21.5F, -28F);

		tiger131Model[10].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box89
		tiger131Model[10].setRotationPoint(2F, -3F, 28F);

		tiger131Model[11].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		tiger131Model[11].setRotationPoint(2F, -6F, 28F);

		tiger131Model[12].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box91
		tiger131Model[12].setRotationPoint(2F, 4F, 28F);

		tiger131Model[13].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		tiger131Model[13].setRotationPoint(21F, -6F, 28F);

		tiger131Model[14].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box93
		tiger131Model[14].setRotationPoint(21F, -3F, 28F);

		tiger131Model[15].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box94
		tiger131Model[15].setRotationPoint(21F, 4F, 28F);

		tiger131Model[16].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box95
		tiger131Model[16].setRotationPoint(-17F, -6F, 28F);

		tiger131Model[17].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box96
		tiger131Model[17].setRotationPoint(-36F, -6F, 28F);

		tiger131Model[18].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box97
		tiger131Model[18].setRotationPoint(-36F, -3F, 28F);

		tiger131Model[19].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box98
		tiger131Model[19].setRotationPoint(-36F, 4F, 28F);

		tiger131Model[20].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box99
		tiger131Model[20].setRotationPoint(-17F, 4F, 28F);

		tiger131Model[21].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box100
		tiger131Model[21].setRotationPoint(-17F, -3F, 28F);

		tiger131Model[22].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box101
		tiger131Model[22].setRotationPoint(21F, -6F, 20F);

		tiger131Model[23].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box102
		tiger131Model[23].setRotationPoint(21F, -3F, 20F);

		tiger131Model[24].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box103
		tiger131Model[24].setRotationPoint(21F, 4F, 20F);

		tiger131Model[25].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box104
		tiger131Model[25].setRotationPoint(2F, 4F, 20F);

		tiger131Model[26].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box105
		tiger131Model[26].setRotationPoint(2F, -3F, 20F);

		tiger131Model[27].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box106
		tiger131Model[27].setRotationPoint(2F, -6F, 20F);

		tiger131Model[28].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box107
		tiger131Model[28].setRotationPoint(-17F, -6F, 20F);

		tiger131Model[29].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box108
		tiger131Model[29].setRotationPoint(-17F, -3F, 20F);

		tiger131Model[30].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box109
		tiger131Model[30].setRotationPoint(-17F, 4F, 20F);

		tiger131Model[31].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box110
		tiger131Model[31].setRotationPoint(-36F, 4F, 20F);

		tiger131Model[32].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box111
		tiger131Model[32].setRotationPoint(-36F, -3F, 20F);

		tiger131Model[33].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box112
		tiger131Model[33].setRotationPoint(-36F, -6F, 20F);

		tiger131Model[34].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box113
		tiger131Model[34].setRotationPoint(11.5F, -6F, 23F);

		tiger131Model[35].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box114
		tiger131Model[35].setRotationPoint(11.5F, -3F, 23F);

		tiger131Model[36].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box115
		tiger131Model[36].setRotationPoint(11.5F, 4F, 23F);

		tiger131Model[37].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box116
		tiger131Model[37].setRotationPoint(-7.5F, 4F, 23F);

		tiger131Model[38].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box117
		tiger131Model[38].setRotationPoint(-7.5F, -3F, 23F);

		tiger131Model[39].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box118
		tiger131Model[39].setRotationPoint(-7.5F, -6F, 23F);

		tiger131Model[40].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box119
		tiger131Model[40].setRotationPoint(-26.5F, -6F, 23F);

		tiger131Model[41].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box120
		tiger131Model[41].setRotationPoint(-26.5F, -3F, 23F);

		tiger131Model[42].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box121
		tiger131Model[42].setRotationPoint(-26.5F, 4F, 23F);

		tiger131Model[43].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box125
		tiger131Model[43].setRotationPoint(-48F, -7F, 22F);

		tiger131Model[44].addBox(0F, 0F, 0F, 11, 7, 6, 0F); // Import Box126
		tiger131Model[44].setRotationPoint(-48F, -5F, 22F);

		tiger131Model[45].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box127
		tiger131Model[45].setRotationPoint(-48F, 2F, 22F);

		tiger131Model[46].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box128
		tiger131Model[46].setRotationPoint(-34F, -6F, -22F);

		tiger131Model[47].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box129
		tiger131Model[47].setRotationPoint(-34F, -3F, -22F);

		tiger131Model[48].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box130
		tiger131Model[48].setRotationPoint(-34F, 4F, -22F);

		tiger131Model[49].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box131
		tiger131Model[49].setRotationPoint(4F, 4F, -22F);

		tiger131Model[50].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box132
		tiger131Model[50].setRotationPoint(4F, -3F, -22F);

		tiger131Model[51].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box133
		tiger131Model[51].setRotationPoint(-15F, 4F, -22F);

		tiger131Model[52].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box134
		tiger131Model[52].setRotationPoint(-15F, -3F, -22F);

		tiger131Model[53].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box135
		tiger131Model[53].setRotationPoint(23F, 4F, -22F);

		tiger131Model[54].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box136
		tiger131Model[54].setRotationPoint(23F, -3F, -22F);

		tiger131Model[55].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box137
		tiger131Model[55].setRotationPoint(-34F, 4F, -30F);

		tiger131Model[56].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		tiger131Model[56].setRotationPoint(-34F, -6F, -30F);

		tiger131Model[57].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box139
		tiger131Model[57].setRotationPoint(-34F, -3F, -30F);

		tiger131Model[58].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box140
		tiger131Model[58].setRotationPoint(-24.5F, -6F, -27F);

		tiger131Model[59].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box141
		tiger131Model[59].setRotationPoint(-24.5F, -3F, -27F);

		tiger131Model[60].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box142
		tiger131Model[60].setRotationPoint(-24.5F, 4F, -27F);

		tiger131Model[61].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box143
		tiger131Model[61].setRotationPoint(-15F, 4F, -30F);

		tiger131Model[62].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box144
		tiger131Model[62].setRotationPoint(-15F, -3F, -30F);

		tiger131Model[63].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		tiger131Model[63].setRotationPoint(-15F, -6F, -30F);

		tiger131Model[64].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box146
		tiger131Model[64].setRotationPoint(-5.5F, -6F, -27F);

		tiger131Model[65].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box147
		tiger131Model[65].setRotationPoint(-5.5F, -3F, -27F);

		tiger131Model[66].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box148
		tiger131Model[66].setRotationPoint(-5.5F, 4F, -27F);

		tiger131Model[67].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box149
		tiger131Model[67].setRotationPoint(4F, 4F, -30F);

		tiger131Model[68].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box150
		tiger131Model[68].setRotationPoint(4F, -3F, -30F);

		tiger131Model[69].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		tiger131Model[69].setRotationPoint(4F, -6F, -30F);

		tiger131Model[70].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		tiger131Model[70].setRotationPoint(13.5F, -6F, -27F);

		tiger131Model[71].addBox(0F, 0F, 0F, 13, 7, 4, 0F); // Import Box153
		tiger131Model[71].setRotationPoint(13.5F, -3F, -27F);

		tiger131Model[72].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box154
		tiger131Model[72].setRotationPoint(13.5F, 4F, -27F);

		tiger131Model[73].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box155
		tiger131Model[73].setRotationPoint(23F, 4F, -30F);

		tiger131Model[74].addBox(0F, 0F, 0F, 13, 7, 2, 0F); // Import Box156
		tiger131Model[74].setRotationPoint(23F, -3F, -30F);

		tiger131Model[75].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		tiger131Model[75].setRotationPoint(23F, -6F, -30F);

		tiger131Model[76].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		tiger131Model[76].setRotationPoint(23F, -6F, -22F);

		tiger131Model[77].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		tiger131Model[77].setRotationPoint(4F, -6F, -22F);

		tiger131Model[78].addShapeBox(0F, 0F, 0F, 13, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		tiger131Model[78].setRotationPoint(-15F, -6F, -22F);

		tiger131Model[79].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		tiger131Model[79].setRotationPoint(-48F, -7F, -28F);

		tiger131Model[80].addBox(0F, 0F, 0F, 11, 7, 6, 0F); // Import Box162
		tiger131Model[80].setRotationPoint(-48F, -5F, -28F);

		tiger131Model[81].addShapeBox(0F, 0F, 0F, 11, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box163
		tiger131Model[81].setRotationPoint(-48F, 2F, -28F);

		tiger131Model[82].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box164
		tiger131Model[82].setRotationPoint(36F, -9F, 20F);

		tiger131Model[83].addBox(0F, 0F, 0F, 13, 7, 9, 0F); // Import Box165
		tiger131Model[83].setRotationPoint(36F, -6F, 20F);

		tiger131Model[84].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box166
		tiger131Model[84].setRotationPoint(36F, 1F, 20F);

		tiger131Model[85].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box167
		tiger131Model[85].setRotationPoint(36F, -9F, -29F);

		tiger131Model[86].addBox(0F, 0F, 0F, 13, 7, 9, 0F); // Import Box168
		tiger131Model[86].setRotationPoint(36F, -6F, -29F);

		tiger131Model[87].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box169
		tiger131Model[87].setRotationPoint(36F, 1F, -29F);

		tiger131Model[88].addBox(0F, 0F, 0F, 2, 5, 5, 0F); // Import Box170
		tiger131Model[88].setRotationPoint(39F, -20F, -14F);

		tiger131Model[89].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		tiger131Model[89].setRotationPoint(41F, -19.5F, -13.5F);

		tiger131Model[90].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		tiger131Model[90].setRotationPoint(42F, -18F, -12F);

		tiger131Model[91].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Import Box173
		tiger131Model[91].setRotationPoint(39F, -20F, 5F);

		tiger131Model[92].addBox(0F, 0F, 0F, 2, 2, 10, 0F); // Import Box174
		tiger131Model[92].setRotationPoint(40F, -16F, 5F);

		tiger131Model[93].addBox(0F, 0F, 0F, 4, 1, 6, 0F); // Import Box175
		tiger131Model[93].setRotationPoint(38F, -21F, 7F);
		tiger131Model[93].rotateAngleZ = 0.29670597F;

		tiger131Model[94].addShapeBox(0F, 0F, 0F, 2, 16, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box179
		tiger131Model[94].setRotationPoint(-54F, -22F, 3F);
		tiger131Model[94].rotateAngleZ = -0.12217305F;

		tiger131Model[95].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Import Box182
		tiger131Model[95].setRotationPoint(-52F, -22.3F, 3F);
		tiger131Model[95].rotateAngleZ = -0.12217305F;

		tiger131Model[96].addShapeBox(0F, 0F, 0F, 2, 16, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box184
		tiger131Model[96].setRotationPoint(-54F, -22F, -11F);
		tiger131Model[96].rotateAngleZ = -0.12217305F;

		tiger131Model[97].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Import Box185
		tiger131Model[97].setRotationPoint(-52F, -22.3F, 10F);
		tiger131Model[97].rotateAngleZ = -0.12217305F;

		tiger131Model[98].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Import Box186
		tiger131Model[98].setRotationPoint(-52F, -22.3F, -11F);
		tiger131Model[98].rotateAngleZ = -0.12217305F;

		tiger131Model[99].addBox(0F, 0F, 0F, 4, 16, 1, 0F); // Import Box187
		tiger131Model[99].setRotationPoint(-52F, -22.3F, -4F);
		tiger131Model[99].rotateAngleZ = -0.12217305F;

		tiger131Model[100].addBox(0F, 0F, 0F, 4, 16, 4, 0F); // Import Box188
		tiger131Model[100].setRotationPoint(-52F, -24F, 5F);
		tiger131Model[100].rotateAngleZ = -0.12217305F;

		tiger131Model[101].addBox(0F, 0F, 0F, 4, 16, 4, 0F); // Import Box189
		tiger131Model[101].setRotationPoint(-52F, -24F, -9F);
		tiger131Model[101].rotateAngleZ = -0.12217305F;

		tiger131Model[102].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import Box190
		tiger131Model[102].setRotationPoint(-50F, -22F, 23.9F);

		tiger131Model[103].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box191
		tiger131Model[103].setRotationPoint(-50F, -18F, 23.9F);

		tiger131Model[104].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box192
		tiger131Model[104].setRotationPoint(-50F, -18F, 19.5F);

		tiger131Model[105].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import Box193
		tiger131Model[105].setRotationPoint(-50F, -22F, 19.5F);

		tiger131Model[106].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Import Box198
		tiger131Model[106].setRotationPoint(-51F, -7.5F, 18F);
		tiger131Model[106].rotateAngleZ = -0.97738438F;

		tiger131Model[107].addBox(0F, 0F, 0F, 7, 1, 11, 0F); // Import Box199
		tiger131Model[107].setRotationPoint(-51F, -7.5F, -28F);
		tiger131Model[107].rotateAngleZ = -0.97738438F;

		tiger131Model[108].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box193
		tiger131Model[108].setRotationPoint(-48F, -24F, 14F);

		tiger131Model[109].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box194
		tiger131Model[109].setRotationPoint(-48F, -23F, 13F);

		tiger131Model[110].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		tiger131Model[110].setRotationPoint(-49F, -21F, 15.5F);

		tiger131Model[111].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box199
		tiger131Model[111].setRotationPoint(-40F, -23F, -4F);

		tiger131Model[112].addBox(0F, 0F, 0F, 6, 2, 8, 0F); // Import Box200
		tiger131Model[112].setRotationPoint(-39F, -23F, -4F);

		tiger131Model[113].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box201
		tiger131Model[113].setRotationPoint(-33F, -23F, -4F);

		tiger131Model[114].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, -1.5F, 4.5F, 0F, -1.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box202
		tiger131Model[114].setRotationPoint(-31F, -23.5F, 4.5F);

		tiger131Model[115].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F); // Import Box206
		tiger131Model[115].setRotationPoint(-48F, -23F, 18F);

		tiger131Model[116].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import Box212
		tiger131Model[116].setRotationPoint(-50F, -22F, -27.9F);

		tiger131Model[117].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Import Box213
		tiger131Model[117].setRotationPoint(-50F, -22F, -23.5F);

		tiger131Model[118].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box214
		tiger131Model[118].setRotationPoint(-50F, -18F, -27.9F);

		tiger131Model[119].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box215
		tiger131Model[119].setRotationPoint(-50F, -18F, -23.5F);

		tiger131Model[120].addBox(0F, 0F, 0F, 7, 1, 15, 0F); // Import Box216
		tiger131Model[120].setRotationPoint(-44F, -22.1F, 11F);

		tiger131Model[121].addBox(0F, 0F, 0F, 11, 1, 15, 0F); // Import Box217
		tiger131Model[121].setRotationPoint(-34F, -22.1F, 11F);

		tiger131Model[122].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, -1F, -3F, 2F); // Import Box218
		tiger131Model[122].setRotationPoint(-49F, -21F, -19.5F);

		tiger131Model[123].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Import Box219
		tiger131Model[123].setRotationPoint(-48F, -23F, -19F);

		tiger131Model[124].addShapeBox(0F, 0F, 0F, 17, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Import Box220
		tiger131Model[124].setRotationPoint(-48F, -24F, -18F);

		tiger131Model[125].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F); // Import Box221
		tiger131Model[125].setRotationPoint(-48F, -23F, -14F);

		tiger131Model[126].addBox(0F, 0F, 0F, 7, 1, 15, 0F); // Import Box222
		tiger131Model[126].setRotationPoint(-44F, -22.1F, -26F);

		tiger131Model[127].addBox(0F, 0F, 0F, 11, 1, 15, 0F); // Import Box223
		tiger131Model[127].setRotationPoint(-34F, -22.1F, -26F);

		tiger131Model[128].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0F, 0F, 0F, 0F, -1.5F, -5F, 0F, -1.5F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 4.5F, 0F, 0F, 0F); // Import Box224
		tiger131Model[128].setRotationPoint(-31F, -23.5F, -7.5F);

		tiger131Model[129].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box225
		tiger131Model[129].setRotationPoint(-46.5F, -5F, -2F);
		tiger131Model[129].rotateAngleZ = -0.12217305F;

		tiger131Model[130].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box226
		tiger131Model[130].setRotationPoint(22F, -5F, 28.5F);

		tiger131Model[131].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box227
		tiger131Model[131].setRotationPoint(22F, -2F, 28.5F);

		tiger131Model[132].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box228
		tiger131Model[132].setRotationPoint(22F, 3F, 28.5F);

		tiger131Model[133].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box229
		tiger131Model[133].setRotationPoint(3F, -5F, 28.5F);

		tiger131Model[134].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box230
		tiger131Model[134].setRotationPoint(3F, -2F, 28.5F);

		tiger131Model[135].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box231
		tiger131Model[135].setRotationPoint(3F, 3F, 28.5F);

		tiger131Model[136].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box232
		tiger131Model[136].setRotationPoint(-35F, -5F, 28.5F);

		tiger131Model[137].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box233
		tiger131Model[137].setRotationPoint(-35F, -2F, 28.5F);

		tiger131Model[138].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box234
		tiger131Model[138].setRotationPoint(-35F, 3F, 28.5F);

		tiger131Model[139].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box235
		tiger131Model[139].setRotationPoint(-16F, -5F, 28.5F);

		tiger131Model[140].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box236
		tiger131Model[140].setRotationPoint(-16F, -2F, 28.5F);

		tiger131Model[141].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box237
		tiger131Model[141].setRotationPoint(-16F, 3F, 28.5F);

		tiger131Model[142].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box238
		tiger131Model[142].setRotationPoint(-33F, -5F, -30.5F);

		tiger131Model[143].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box239
		tiger131Model[143].setRotationPoint(-33F, -2F, -30.5F);

		tiger131Model[144].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box240
		tiger131Model[144].setRotationPoint(-33F, 3F, -30.5F);

		tiger131Model[145].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box241
		tiger131Model[145].setRotationPoint(-14F, -5F, -30.5F);

		tiger131Model[146].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box242
		tiger131Model[146].setRotationPoint(-14F, -2F, -30.5F);

		tiger131Model[147].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box243
		tiger131Model[147].setRotationPoint(-14F, 3F, -30.5F);

		tiger131Model[148].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box244
		tiger131Model[148].setRotationPoint(5F, -5F, -30.5F);

		tiger131Model[149].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box245
		tiger131Model[149].setRotationPoint(5F, -2F, -30.5F);

		tiger131Model[150].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box246
		tiger131Model[150].setRotationPoint(5F, 3F, -30.5F);

		tiger131Model[151].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Import Box247
		tiger131Model[151].setRotationPoint(24F, 3F, -30.5F);

		tiger131Model[152].addBox(0F, 0F, 0F, 11, 5, 2, 0F); // Import Box248
		tiger131Model[152].setRotationPoint(24F, -2F, -30.5F);

		tiger131Model[153].addShapeBox(0F, 0F, 0F, 11, 3, 2, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		tiger131Model[153].setRotationPoint(24F, -5F, -30.5F);

		tiger131Model[154].addShapeBox(0F, 0F, 0F, 88, 5, 3, 0F, 0.4F, 0F, -3F, -1.3F, 0F, -3F, -1.3F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 2F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0F, 00F, 0F, 0F); // Import Box250
		tiger131Model[154].setRotationPoint(-47F, -16F, -31F);

		tiger131Model[155].addShapeBox(0F, 0F, 0F, 1, 9, 30, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box251
		tiger131Model[155].setRotationPoint(52F, -10F, -15F);
		tiger131Model[155].rotateAngleZ = 0.31415927F;

		tiger131Model[156].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F); // Import Box252
		tiger131Model[156].setRotationPoint(52.5F, -12F, -14F);
		tiger131Model[156].rotateAngleZ = 0.31415927F;

		tiger131Model[157].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F); // Import Box253
		tiger131Model[157].setRotationPoint(52.5F, -12F, 13F);
		tiger131Model[157].rotateAngleZ = 0.31415927F;

		tiger131Model[158].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box254
		tiger131Model[158].setRotationPoint(34F, -22F, 10F);

		tiger131Model[159].addBox(0F, 0F, 0F, 7, 1, 9, 0F); // Import Box255
		tiger131Model[159].setRotationPoint(27F, -22F, 10F);

		tiger131Model[160].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box256
		tiger131Model[160].setRotationPoint(26F, -22F, 10F);

		tiger131Model[161].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box257
		tiger131Model[161].setRotationPoint(34F, -22F, -19F);

		tiger131Model[162].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box258
		tiger131Model[162].setRotationPoint(26F, -22F, -19F);

		tiger131Model[163].addBox(0F, 0F, 0F, 7, 1, 9, 0F); // Import Box259
		tiger131Model[163].setRotationPoint(27F, -22F, -19F);

		tiger131Model[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box260
		tiger131Model[164].setRotationPoint(-48.5F, -22.5F, 25.4F);

		tiger131Model[165].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box261
		tiger131Model[165].setRotationPoint(-48.5F, -22.5F, 21F);

		tiger131Model[166].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box262
		tiger131Model[166].setRotationPoint(-48.5F, -22.5F, -26.4F);

		tiger131Model[167].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box263
		tiger131Model[167].setRotationPoint(-48.5F, -22.5F, -22F);

		tiger131Model[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box264
		tiger131Model[168].setRotationPoint(32F, -23F, -17F);
		tiger131Model[168].rotateAngleY = 0.40142573F;

		tiger131Model[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box265
		tiger131Model[169].setRotationPoint(33F, -23F, 15F);
		tiger131Model[169].rotateAngleY = -0.41887902F;

		tiger131Model[170].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Import Box250
		tiger131Model[170].setRotationPoint(0F, -21F, 27.1F);

		tiger131Model[171].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box262
		tiger131Model[171].setRotationPoint(40.5F, -21.5F, -25F);
		tiger131Model[171].rotateAngleY = -0.31415927F;

		tiger131Model[172].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box263
		tiger131Model[172].setRotationPoint(33.5F, -26.5F, -23F);
		tiger131Model[172].rotateAngleY = 0.73303829F;

		tiger131Model[173].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box264
		tiger131Model[173].setRotationPoint(35.5F, -25.5F, 19F);
		tiger131Model[173].rotateAngleY = -0.6981317F;

		tiger131Model[174].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box265
		tiger131Model[174].setRotationPoint(40.5F, -19.5F, 22F);
		tiger131Model[174].rotateAngleY = 0.64577182F;

		tiger131Model[175].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box266
		tiger131Model[175].setRotationPoint(-36.5F, -24.5F, 26F);
		tiger131Model[175].rotateAngleY = -0.38397244F;

		tiger131Model[176].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box267
		tiger131Model[176].setRotationPoint(-39.5F, -23.5F, -31F);
		tiger131Model[176].rotateAngleY = 0.27925268F;

		tiger131Model[177].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box268
		tiger131Model[177].setRotationPoint(-24.5F, -25.5F, -31F);
		tiger131Model[177].rotateAngleY = -0.26179939F;

		tiger131Model[178].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box269
		tiger131Model[178].setRotationPoint(-23.5F, -23.5F, 26F);
		tiger131Model[178].rotateAngleY = 0.52359878F;

		tiger131Model[179].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box270
		tiger131Model[179].setRotationPoint(20.5F, -23.5F, 24F);
		tiger131Model[179].rotateAngleY = -0.6981317F;

		tiger131Model[180].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box271
		tiger131Model[180].setRotationPoint(19.5F, -22.5F, -31F);
		tiger131Model[180].rotateAngleY = -0.99483767F;

		tiger131Model[181].addBox(0F, 0F, 0F, 0, 0, 5, 0F); // Import Box272
		tiger131Model[181].setRotationPoint(33.5F, -26.5F, -23F);
		tiger131Model[181].rotateAngleY = 0.73303829F;

		tiger131Model[182].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box273
		tiger131Model[182].setRotationPoint(-1.5F, -22.5F, -29F);
		tiger131Model[182].rotateAngleY = 0.73303829F;

		tiger131Model[183].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box274
		tiger131Model[183].setRotationPoint(1.5F, -22.5F, -29F);
		tiger131Model[183].rotateAngleY = -0.73303829F;

		tiger131Model[184].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box275
		tiger131Model[184].setRotationPoint(41.5F, -20.5F, 16F);
		tiger131Model[184].rotateAngleY = 0.73303829F;

		tiger131Model[185].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box276
		tiger131Model[185].setRotationPoint(44.5F, -20.5F, 16F);
		tiger131Model[185].rotateAngleY = -0.73303829F;

		tiger131Model[186].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box277
		tiger131Model[186].setRotationPoint(46.5F, -17.5F, -29F);
		tiger131Model[186].rotateAngleY = 0.73303829F;

		tiger131Model[187].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box278
		tiger131Model[187].setRotationPoint(49.5F, -17.5F, -29F);
		tiger131Model[187].rotateAngleY = -0.73303829F;

		tiger131Model[188].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box279
		tiger131Model[188].setRotationPoint(28.5F, -23.5F, 20F);
		tiger131Model[188].rotateAngleY = 0.73303829F;

		tiger131Model[189].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box280
		tiger131Model[189].setRotationPoint(31.5F, -23.5F, 20F);
		tiger131Model[189].rotateAngleY = -0.73303829F;

		tiger131Model[190].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box281
		tiger131Model[190].setRotationPoint(-14.5F, -23.5F, 26F);
		tiger131Model[190].rotateAngleY = 0.73303829F;

		tiger131Model[191].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box282
		tiger131Model[191].setRotationPoint(-11.5F, -23.5F, 26F);
		tiger131Model[191].rotateAngleY = -0.73303829F;

		tiger131Model[192].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box283
		tiger131Model[192].setRotationPoint(-46.5F, -23.5F, 26F);
		tiger131Model[192].rotateAngleY = 0.85521133F;

		tiger131Model[193].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box284
		tiger131Model[193].setRotationPoint(-43.5F, -23.5F, 26F);
		tiger131Model[193].rotateAngleY = -0.61086524F;

		tiger131Model[194].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box285
		tiger131Model[194].setRotationPoint(-12.5F, -23.5F, -32F);
		tiger131Model[194].rotateAngleY = 0.85521133F;

		tiger131Model[195].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box286
		tiger131Model[195].setRotationPoint(-9.5F, -23.5F, -32F);
		tiger131Model[195].rotateAngleY = -0.61086524F;

		tiger131Model[196].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box287
		tiger131Model[196].setRotationPoint(33.5F, -24.5F, -16F);
		tiger131Model[196].rotateAngleY = 1.37881011F;

		tiger131Model[197].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box288
		tiger131Model[197].setRotationPoint(40.5F, -19.5F, -18F);
		tiger131Model[197].rotateAngleY = 0.33161256F;

		tiger131Model[198].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box289
		tiger131Model[198].setRotationPoint(33.5F, -24.5F, 17F);
		tiger131Model[198].rotateAngleY = -0.31415927F;

		tiger131Model[199].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box290
		tiger131Model[199].setRotationPoint(38.5F, -20.5F, 20F);
		tiger131Model[199].rotateAngleY = 1.02974426F;

		tiger131Model[200].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box291
		tiger131Model[200].setRotationPoint(45.5F, -20.5F, 22F);
		tiger131Model[200].rotateAngleY = 0.73303829F;

		tiger131Model[201].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box292
		tiger131Model[201].setRotationPoint(48.5F, -20.5F, 22F);
		tiger131Model[201].rotateAngleY = -0.73303829F;

		tiger131Model[202].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box293
		tiger131Model[202].setRotationPoint(36.5F, -26.5F, -21F);
		tiger131Model[202].rotateAngleY = 0.73303829F;

		tiger131Model[203].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box294
		tiger131Model[203].setRotationPoint(39.5F, -26.5F, -21F);
		tiger131Model[203].rotateAngleY = -0.73303829F;

		tiger131Model[204].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box295
		tiger131Model[204].setRotationPoint(40.5F, -21.5F, -22F);
		tiger131Model[204].rotateAngleY = 0.73303829F;

		tiger131Model[205].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box296
		tiger131Model[205].setRotationPoint(43.5F, -21.5F, -22F);
		tiger131Model[205].rotateAngleY = -0.73303829F;

		tiger131Model[206].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box297
		tiger131Model[206].setRotationPoint(47.5F, -17.5F, -27F);
		tiger131Model[206].rotateAngleY = 0.73303829F;

		tiger131Model[207].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box298
		tiger131Model[207].setRotationPoint(50.5F, -17.5F, -27F);
		tiger131Model[207].rotateAngleY = -0.73303829F;

		tiger131Model[208].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box299
		tiger131Model[208].setRotationPoint(47.5F, -16.5F, -29F);
		tiger131Model[208].rotateAngleY = -0.31415927F;

		tiger131Model[209].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box300
		tiger131Model[209].setRotationPoint(15.5F, -22.5F, -30F);
		tiger131Model[209].rotateAngleY = 0.73303829F;

		tiger131Model[210].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box301
		tiger131Model[210].setRotationPoint(18.5F, -22.5F, -30F);
		tiger131Model[210].rotateAngleY = -0.73303829F;

		tiger131Model[211].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box302
		tiger131Model[211].setRotationPoint(13.5F, -22.5F, -30F);
		tiger131Model[211].rotateAngleY = -0.99483767F;

		tiger131Model[212].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box303
		tiger131Model[212].setRotationPoint(25.5F, -21.5F, -30F);
		tiger131Model[212].rotateAngleY = 0.95993109F;

		tiger131Model[213].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box304
		tiger131Model[213].setRotationPoint(26.5F, -21.5F, -30F);
		tiger131Model[213].rotateAngleY = -1.85004901F;

		tiger131Model[214].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box305
		tiger131Model[214].setRotationPoint(11.5F, -21.5F, -29F);
		tiger131Model[214].rotateAngleY = -0.12217305F;

		tiger131Model[215].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box306
		tiger131Model[215].setRotationPoint(24.5F, -22.5F, 24F);
		tiger131Model[215].rotateAngleY = -0.6981317F;

		tiger131Model[216].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box307
		tiger131Model[216].setRotationPoint(25.5F, -20.5F, 27F);
		tiger131Model[216].rotateAngleY = -0.73303829F;

		tiger131Model[217].addBox(0F, 0F, 0F, 0, 5, 5, 0F); // Import Box308
		tiger131Model[217].setRotationPoint(22.5F, -20.5F, 27F);
		tiger131Model[217].rotateAngleY = 0.73303829F;

		tiger131Model[218].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box309
		tiger131Model[218].setRotationPoint(38.5F, -18.5F, 23F);
		tiger131Model[218].rotateAngleY = -0.08726646F;

		tiger131Model[219].addBox(0F, 0F, 0F, 5, 5, 5, 0F); // Import Box310
		tiger131Model[219].setRotationPoint(35.5F, -23.5F, 22F);
		tiger131Model[219].rotateAngleY = -1.81514242F;

		tiger131Model[220].addBox(0F, -35F, -19.5F, 15, 14, 39, 0F); // Import Box8
		tiger131Model[220].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[221].addShapeBox(0F, -35F, -19.5F, 7, 14, 39, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box9
		tiger131Model[221].setRotationPoint(-14F, 0F, 0F);

		tiger131Model[222].addShapeBox(0F, -22F, -19.5F, 7, 1, 39, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box10
		tiger131Model[222].setRotationPoint(8F, 0F, 0F);

		tiger131Model[223].addShapeBox(0F, -35F, -15.5F, 4, 14, 29, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box12
		tiger131Model[223].setRotationPoint(-18F, 0F, 1F);

		tiger131Model[224].addShapeBox(0F, -22F, -14.5F, 4, 1, 29, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box13
		tiger131Model[224].setRotationPoint(15F, 0F, 0F);

		tiger131Model[225].addShapeBox(0F, -35F, -19.5F, 13, 13, 39, 0F, 0F, 0F, 0F, 0F, -2F, -7F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Import Box15
		tiger131Model[225].setRotationPoint(8F, 0F, 0F);

		tiger131Model[226].addShapeBox(-19F, -35F, -3.5F, 5, 11, 7, 0F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		tiger131Model[226].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[227].addShapeBox(-19F, -35F, 3.5F, 8, 11, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, -3F, 0F, 3F); // Import Box33
		tiger131Model[227].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[228].addShapeBox(-12F, -35F, -3.5F, 1, 11, 7, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		tiger131Model[228].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[229].addShapeBox(-19F, -35F, -3.5F, 8, 11, 5, 0F, -3F, -1F, 3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 3F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box37
		tiger131Model[229].setRotationPoint(-7F, 0F, -5F);

		tiger131Model[230].addBox(0F, -39F, 5F, 7, 4, 13, 0F); // Import Box38
		tiger131Model[230].setRotationPoint(-9F, 0F, 0F);

		tiger131Model[231].addShapeBox(8F, -39F, 5F, 3, 4, 13, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box39
		tiger131Model[231].setRotationPoint(-10F, 0F, 0F);

		tiger131Model[232].addShapeBox(-2F, -39F, 5F, 3, 4, 13, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box40
		tiger131Model[232].setRotationPoint(-10F, 0F, 0F);

		tiger131Model[233].addBox(26.7F, -29F, -15F, 2, 2, 30, 0F); // Import Box41
		tiger131Model[233].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[234].addBox(26.2F, -29.5F, -14F, 3, 3, 28, 0F); // Import Box42
		tiger131Model[234].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[235].addShapeBox(7.5F, -40F, 5.5F, 3, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box43
		tiger131Model[235].setRotationPoint(-10F, 0F, 0F);

		tiger131Model[236].addBox(0.5F, -40F, 5.5F, 6, 1, 12, 0F); // Import Box44
		tiger131Model[236].setRotationPoint(-9F, 0F, 0F);

		tiger131Model[237].addShapeBox(-1.5F, -40F, 5.5F, 3, 1, 12, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box45
		tiger131Model[237].setRotationPoint(-10F, 0F, 0F);

		tiger131Model[238].addBox(6F, -36F, -16.5F, 8, 1, 10, 0F); // Import Box39
		tiger131Model[238].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[239].addShapeBox(11.5F, -36F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box40
		tiger131Model[239].setRotationPoint(-9F, 0F, 0F);

		tiger131Model[240].addBox(6.5F, -36F, -2F, 2, 1, 4, 0F); // Import Box41
		tiger131Model[240].setRotationPoint(-6F, 0F, 0F);

		tiger131Model[241].addShapeBox(6.5F, -36F, -2F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box42
		tiger131Model[241].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[242].addBox(5F, -35.5F, -15.5F, 1, 1, 3, 0F); // Import Box43
		tiger131Model[242].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[243].addBox(5F, -35.5F, -10.5F, 1, 1, 3, 0F); // Import Box44
		tiger131Model[243].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[244].addShapeBox(12F, -37F, -13.5F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box45
		tiger131Model[244].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[245].addShapeBox(12F, -36.5F, -13.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box46
		tiger131Model[245].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[246].addShapeBox(12F, -36.5F, -10.5F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box47
		tiger131Model[246].setRotationPoint(-7F, 0F, 0F);

		tiger131Model[247].addShapeBox(10F, -36F, -13F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box0
		tiger131Model[247].setRotationPoint(-2F, 0F, 0F);

		tiger131Model[248].addShapeBox(15.8F, -36F, -13.5F, 1, 1, 4, 0F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F); // Import Box1
		tiger131Model[248].setRotationPoint(-8F, 0F, 0F);

		tiger131Model[249].addShapeBox(0F, -33F, -12.5F, 2, 11, 25, 0F, 0F, 0F, 0F, 1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4.5F, 0F, 1F, -4.5F, 0F, 0F, 0F, 0F); // Import Box16
		tiger131Model[249].setRotationPoint(20F, 0F, 0F);

		tiger131Model[250].addShapeBox(-1F, -2F, -11F, 2, 8, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		tiger131Model[250].setRotationPoint(23.5F, -29.5F, 0F);

		tiger131Model[251].addShapeBox(0.5F, -2F, -10F, 1, 8, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		tiger131Model[251].setRotationPoint(23.5F, -29.5F, 0F);

		tiger131Model[252].addShapeBox(1.5F, -1F, -4F, 1, 6, 8, 0F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F); // Import Box20
		tiger131Model[252].setRotationPoint(23.5F, -29.5F, 0F);

		tiger131Model[253].addShapeBox(2.5F, -1F, -2F, 14, 4, 4, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Import Box21
		tiger131Model[253].setRotationPoint(23.5F, -28.5F, 0F);

		tiger131Model[254].addShapeBox(16.5F, -1F, -2F, 15, 4, 4, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box22
		tiger131Model[254].setRotationPoint(23.5F, -28.5F, 0F);

		tiger131Model[255].addShapeBox(31.5F, -1F, -2F, 28, 4, 4, 0F, 0F, -0.6F, -0.6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.6F, -0.6F); // Import Box23
		tiger131Model[255].setRotationPoint(23.5F, -28.5F, 0F);

		tiger131Model[256].addShapeBox(31.5F, -1F, -2F, 1, 4, 4, 0F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.2F, -0.2F); // Import Box24
		tiger131Model[256].setRotationPoint(23.5F, -28.5F, 0F);

		tiger131Model[257].addShapeBox(16.5F, -1F, -2F, 1, 4, 4, 0F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0.3F, 0.3F); // Import Box26
		tiger131Model[257].setRotationPoint(23.5F, -28.5F, 0F);

		tiger131Model[258].addShapeBox(2.5F, -0.5F, -2.5F, 1, 5, 5, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Import Box27
		tiger131Model[258].setRotationPoint(23.5F, -29.5F, 0F);

		tiger131Model[259].addBox(50F, -0.5F, -1.5F, 3, 4, 3, 0F); // Import Box250
		tiger131Model[259].setRotationPoint(23.5F, -28.5F, 0F);

		tiger131Model[260].addBox(46F, 0F, -1.5F, 1, 6, 3, 0F); // Import Box251
		tiger131Model[260].setRotationPoint(23.5F, -29F, 0F);

		tiger131Model[261].addBox(46F, 5F, -1.5F, 6, 1, 1, 0F); // Import Box252
		tiger131Model[261].setRotationPoint(23.5F, -28.5F, 0F);
		tiger131Model[261].rotateAngleZ = -0.03490659F;

		tiger131Model[262].addBox(47F, 4.5F, 0.5F, 6, 1, 1, 0F); // Import Box253
		tiger131Model[262].setRotationPoint(23.5F, -29.5F, 0F);

		tiger131Model[263].addBox(52F, 4F, -1F, 1, 3, 1, 0F); // Import Box254
		tiger131Model[263].setRotationPoint(23.5F, -29.5F, 0F);

		tiger131Model[264].addShapeBox(52F, 6F, -1F, 1, 2, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box255
		tiger131Model[264].setRotationPoint(22.5F, -28.5F, 0F);

		tiger131Model[265].addShapeBox(59.5F, -1F, -2F, 3, 4, 4, 0F, 0F, -1F, -1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, -1F, -1F); // Import Box48
		tiger131Model[265].setRotationPoint(22.5F, -28.5F, 0F);

		tiger131Model[266].addShapeBox(62.5F, -0.5F, -1.5F, 2, 3, 3, 0F, 0F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box49
		tiger131Model[266].setRotationPoint(22.5F, -28.5F, 0F);

		tiger131Model[267].addShapeBox(66.5F, -1F, -2F, 1, 4, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Import Box50
		tiger131Model[267].setRotationPoint(22.5F, -28.5F, 0F);

		tiger131Model[268].addBox(-2F, 0F, 0F, 7, 1, 12, 0F); // Import Box70
		tiger131Model[268].setRotationPoint(-46F, -7F, -31F);
		tiger131Model[268].rotateAngleZ = -0.40142573F;

		tiger131Model[269].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box71
		tiger131Model[269].setRotationPoint(-47.9F, -6.3F, -31F);
		tiger131Model[269].rotateAngleZ = -1.01229097F;

		tiger131Model[270].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box72
		tiger131Model[270].setRotationPoint(-49F, -4.6F, -31F);
		tiger131Model[270].rotateAngleZ = -1.50098316F;

		tiger131Model[271].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box73
		tiger131Model[271].setRotationPoint(-49.2F, -2.6F, -31F);
		tiger131Model[271].rotateAngleZ = -1.58824962F;

		tiger131Model[272].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box74
		tiger131Model[272].setRotationPoint(-49.2F, -0.6F, -31F);
		tiger131Model[272].rotateAngleZ = -1.76278254F;

		tiger131Model[273].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box75
		tiger131Model[273].setRotationPoint(-48.8F, 1.4F, -31F);
		tiger131Model[273].rotateAngleZ = -2.23402144F;

		tiger131Model[274].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Import Box76
		tiger131Model[274].setRotationPoint(-47.6F, 3F, -31F);
		tiger131Model[274].rotateAngleZ = -2.47836754F;

		tiger131Model[275].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Import Box77
		tiger131Model[275].setRotationPoint(-43.7F, 6F, -31F);
		tiger131Model[275].rotateAngleZ = -2.72271363F;

		tiger131Model[276].addBox(0F, 0F, 0F, 77, 1, 12, 0F); // Import Box78
		tiger131Model[276].setRotationPoint(-39.4F, 7F, -31F);

		tiger131Model[277].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Import Box79
		tiger131Model[277].setRotationPoint(49.6F, -0.1F, -31F);
		tiger131Model[277].rotateAngleZ = -1.48352986F;

		tiger131Model[278].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box80
		tiger131Model[278].setRotationPoint(49.9F, -4.1F, -31F);
		tiger131Model[278].rotateAngleZ = -1.79768913F;

		tiger131Model[279].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Import Box81
		tiger131Model[279].setRotationPoint(49F, 1.9F, -31F);
		tiger131Model[279].rotateAngleZ = -1.25663706F;

		tiger131Model[280].addBox(0F, -1F, 0F, 11, 1, 12, 0F); // Import Box82
		tiger131Model[280].setRotationPoint(37.6F, 8F, -31F);
		tiger131Model[280].rotateAngleZ = -0.43633231F;

		tiger131Model[281].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Import Box83
		tiger131Model[281].setRotationPoint(47.6F, 3.3F, -31F);
		tiger131Model[281].rotateAngleZ = -0.80285146F;

		tiger131Model[282].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box84
		tiger131Model[282].setRotationPoint(49.2F, -7.1F, -31F);
		tiger131Model[282].rotateAngleZ = -2.32128791F;

		tiger131Model[283].addBox(0F, 0F, 0F, 75, 1, 12, 0F); // Import Box87
		tiger131Model[283].setRotationPoint(-41.4F, -9F, -31F);

		tiger131Model[284].addBox(0F, -1F, 0F, 6, 1, 12, 0F); // Import Box267
		tiger131Model[284].setRotationPoint(39.3F, -10.1F, -31F);
		tiger131Model[284].rotateAngleZ = -3.33357887F;

		tiger131Model[285].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box268
		tiger131Model[285].setRotationPoint(42.2F, -10.1F, -31F);
		tiger131Model[285].rotateAngleZ = -3.14159265F;

		tiger131Model[286].addBox(0F, -1F, 0F, 5, 1, 12, 0F); // Import Box269
		tiger131Model[286].setRotationPoint(47.1F, -9.3F, -31F);
		tiger131Model[286].rotateAngleZ = -2.98451302F;

		tiger131Model[287].addBox(0F, 0F, 0F, 75, 1, 12, 0F); // Import Box51
		tiger131Model[287].setRotationPoint(-41.4F, -9F, 19F);

		tiger131Model[288].addBox(-2F, 0F, 0F, 7, 1, 12, 0F); // Import Box52
		tiger131Model[288].setRotationPoint(-46F, -7F, 19F);
		tiger131Model[288].rotateAngleZ = -0.40142573F;

		tiger131Model[289].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box53
		tiger131Model[289].setRotationPoint(-47.9F, -6.3F, 19F);
		tiger131Model[289].rotateAngleZ = -1.01229097F;

		tiger131Model[290].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box54
		tiger131Model[290].setRotationPoint(-49F, -4.6F, 19F);
		tiger131Model[290].rotateAngleZ = -1.50098316F;

		tiger131Model[291].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box55
		tiger131Model[291].setRotationPoint(-49.2F, -2.6F, 19F);
		tiger131Model[291].rotateAngleZ = -1.58824962F;

		tiger131Model[292].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box56
		tiger131Model[292].setRotationPoint(-49.2F, -0.6F, 19F);
		tiger131Model[292].rotateAngleZ = -1.76278254F;

		tiger131Model[293].addBox(-2F, 0F, 0F, 2, 1, 12, 0F); // Import Box57
		tiger131Model[293].setRotationPoint(-48.8F, 1.4F, 19F);
		tiger131Model[293].rotateAngleZ = -2.23402144F;

		tiger131Model[294].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Import Box58
		tiger131Model[294].setRotationPoint(-47.6F, 3F, 19F);
		tiger131Model[294].rotateAngleZ = -2.47836754F;

		tiger131Model[295].addBox(-5F, 0F, 0F, 5, 1, 12, 0F); // Import Box59
		tiger131Model[295].setRotationPoint(-43.7F, 6F, 19F);
		tiger131Model[295].rotateAngleZ = -2.72271363F;

		tiger131Model[296].addBox(0F, 0F, 0F, 77, 1, 12, 0F); // Import Box60
		tiger131Model[296].setRotationPoint(-39.4F, 7F, 19F);

		tiger131Model[297].addBox(0F, -1F, 0F, 11, 1, 12, 0F); // Import Box61
		tiger131Model[297].setRotationPoint(37.6F, 8F, 19F);
		tiger131Model[297].rotateAngleZ = -0.43633231F;

		tiger131Model[298].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Import Box62
		tiger131Model[298].setRotationPoint(47.6F, 3.3F, 19F);
		tiger131Model[298].rotateAngleZ = -0.80285146F;

		tiger131Model[299].addBox(0F, -1F, 0F, 2, 1, 12, 0F); // Import Box63
		tiger131Model[299].setRotationPoint(49F, 1.9F, 19F);
		tiger131Model[299].rotateAngleZ = -1.25663706F;

		tiger131Model[300].addBox(0F, -1F, 0F, 4, 1, 12, 0F); // Import Box64
		tiger131Model[300].setRotationPoint(49.6F, -0.1F, 19F);
		tiger131Model[300].rotateAngleZ = -1.48352986F;

		tiger131Model[301].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box65
		tiger131Model[301].setRotationPoint(49.9F, -4.1F, 19F);
		tiger131Model[301].rotateAngleZ = -1.79768913F;

		tiger131Model[302].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box66
		tiger131Model[302].setRotationPoint(49.2F, -7.1F, 19F);
		tiger131Model[302].rotateAngleZ = -2.32128791F;

		tiger131Model[303].addBox(0F, -1F, 0F, 5, 1, 12, 0F); // Import Box67
		tiger131Model[303].setRotationPoint(47.1F, -9.3F, 19F);
		tiger131Model[303].rotateAngleZ = -2.98451302F;

		tiger131Model[304].addBox(0F, -1F, 0F, 3, 1, 12, 0F); // Import Box68
		tiger131Model[304].setRotationPoint(42.2F, -10.1F, 19F);
		tiger131Model[304].rotateAngleZ = -3.14159265F;

		tiger131Model[305].addBox(0F, -1F, 0F, 6, 1, 12, 0F); // Import Box69
		tiger131Model[305].setRotationPoint(39.3F, -10.1F, 19F);
		tiger131Model[305].rotateAngleZ = -3.33357887F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 306; i++)
		{
			tiger131Model[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo tiger131Model[];
}