//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Fury
// Model Creator:
// Created on:-
// Last changed on: -

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShermanFury extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelShermanFury()
	{
		shermanfuryModel = new ModelRendererTurbo[363];
		shermanfuryModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		shermanfuryModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box6
		shermanfuryModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box7
		shermanfuryModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box8
		shermanfuryModel[4] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import Box9
		shermanfuryModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box11
		shermanfuryModel[6] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import Box12
		shermanfuryModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box13
		shermanfuryModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box15
		shermanfuryModel[9] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import Box16
		shermanfuryModel[10] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box19
		shermanfuryModel[11] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box22
		shermanfuryModel[12] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import Box23
		shermanfuryModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box24
		shermanfuryModel[14] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box42
		shermanfuryModel[15] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box43
		shermanfuryModel[16] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box44
		shermanfuryModel[17] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import Box45
		shermanfuryModel[18] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box52
		shermanfuryModel[19] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box53
		shermanfuryModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box56
		shermanfuryModel[21] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import Box42
		shermanfuryModel[22] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box43
		shermanfuryModel[23] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box60
		shermanfuryModel[24] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box61
		shermanfuryModel[25] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box63
		shermanfuryModel[26] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box64
		shermanfuryModel[27] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box65
		shermanfuryModel[28] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box66
		shermanfuryModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box67
		shermanfuryModel[30] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box75
		shermanfuryModel[31] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box112
		shermanfuryModel[32] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import Box113
		shermanfuryModel[33] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box114
		shermanfuryModel[34] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box115
		shermanfuryModel[35] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import Box116
		shermanfuryModel[36] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box117
		shermanfuryModel[37] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Box118
		shermanfuryModel[38] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import Box119
		shermanfuryModel[39] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box120
		shermanfuryModel[40] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import Box121
		shermanfuryModel[41] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box122
		shermanfuryModel[42] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box126
		shermanfuryModel[43] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box128
		shermanfuryModel[44] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import Box129
		shermanfuryModel[45] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Import Box130
		shermanfuryModel[46] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box131
		shermanfuryModel[47] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Import Box132
		shermanfuryModel[48] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box133
		shermanfuryModel[49] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box134
		shermanfuryModel[50] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Import Box135
		shermanfuryModel[51] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Import Box136
		shermanfuryModel[52] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box137
		shermanfuryModel[53] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box139
		shermanfuryModel[54] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import Box142
		shermanfuryModel[55] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import Box144
		shermanfuryModel[56] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box145
		shermanfuryModel[57] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box146
		shermanfuryModel[58] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box147
		shermanfuryModel[59] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import Box148
		shermanfuryModel[60] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box149
		shermanfuryModel[61] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Import Box150
		shermanfuryModel[62] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Import Box151
		shermanfuryModel[63] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box152
		shermanfuryModel[64] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Import Box153
		shermanfuryModel[65] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box154
		shermanfuryModel[66] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box155
		shermanfuryModel[67] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box156
		shermanfuryModel[68] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box158
		shermanfuryModel[69] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box160
		shermanfuryModel[70] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import Box161
		shermanfuryModel[71] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import Box162
		shermanfuryModel[72] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box163
		shermanfuryModel[73] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box164
		shermanfuryModel[74] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Import Box165
		shermanfuryModel[75] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import Box166
		shermanfuryModel[76] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box167
		shermanfuryModel[77] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import Box168
		shermanfuryModel[78] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import Box169
		shermanfuryModel[79] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import Box171
		shermanfuryModel[80] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import Box174
		shermanfuryModel[81] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box176
		shermanfuryModel[82] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Import Box177
		shermanfuryModel[83] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import Box178
		shermanfuryModel[84] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import Box179
		shermanfuryModel[85] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box180
		shermanfuryModel[86] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import Box181
		shermanfuryModel[87] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box182
		shermanfuryModel[88] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import Box183
		shermanfuryModel[89] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box184
		shermanfuryModel[90] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box185
		shermanfuryModel[91] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import Box187
		shermanfuryModel[92] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import Box190
		shermanfuryModel[93] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Import Box193
		shermanfuryModel[94] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box195
		shermanfuryModel[95] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import Box196
		shermanfuryModel[96] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import Box197
		shermanfuryModel[97] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box198
		shermanfuryModel[98] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Import Box199
		shermanfuryModel[99] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box200
		shermanfuryModel[100] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Import Box201
		shermanfuryModel[101] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box202
		shermanfuryModel[102] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box203
		shermanfuryModel[103] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import Box204
		shermanfuryModel[104] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import Box205
		shermanfuryModel[105] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import Box206
		shermanfuryModel[106] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Import Box207
		shermanfuryModel[107] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box208
		shermanfuryModel[108] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import Box209
		shermanfuryModel[109] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Import Box210
		shermanfuryModel[110] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Import Box211
		shermanfuryModel[111] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Import Box212
		shermanfuryModel[112] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Import Box213
		shermanfuryModel[113] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Import Box214
		shermanfuryModel[114] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Import Box215
		shermanfuryModel[115] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Import Box216
		shermanfuryModel[116] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Import Box217
		shermanfuryModel[117] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Import Box218
		shermanfuryModel[118] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Import Box219
		shermanfuryModel[119] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box226
		shermanfuryModel[120] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box227
		shermanfuryModel[121] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Import Box228
		shermanfuryModel[122] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import Box229
		shermanfuryModel[123] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import Box230
		shermanfuryModel[124] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box231
		shermanfuryModel[125] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import Box240
		shermanfuryModel[126] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Import Box241
		shermanfuryModel[127] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Import Box290
		shermanfuryModel[128] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Import Box300
		shermanfuryModel[129] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Import Box301
		shermanfuryModel[130] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Import Box302
		shermanfuryModel[131] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Import Box303
		shermanfuryModel[132] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import Box304
		shermanfuryModel[133] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Import Box308
		shermanfuryModel[134] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import Box311
		shermanfuryModel[135] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Import Box312
		shermanfuryModel[136] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Import Box270
		shermanfuryModel[137] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Import Box273
		shermanfuryModel[138] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Import Box274
		shermanfuryModel[139] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Import Box275
		shermanfuryModel[140] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Import Box109
		shermanfuryModel[141] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box118
		shermanfuryModel[142] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Import Box108
		shermanfuryModel[143] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Box102
		shermanfuryModel[144] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box103
		shermanfuryModel[145] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import Box104
		shermanfuryModel[146] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box115
		shermanfuryModel[147] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import Box285
		shermanfuryModel[148] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box286
		shermanfuryModel[149] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box287
		shermanfuryModel[150] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import Box288
		shermanfuryModel[151] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import Box289
		shermanfuryModel[152] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Box291
		shermanfuryModel[153] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box293
		shermanfuryModel[154] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box294
		shermanfuryModel[155] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box295
		shermanfuryModel[156] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import Box299
		shermanfuryModel[157] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box302
		shermanfuryModel[158] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Import Box303
		shermanfuryModel[159] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import Box304
		shermanfuryModel[160] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import Box305
		shermanfuryModel[161] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box306
		shermanfuryModel[162] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box307
		shermanfuryModel[163] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Import Box308
		shermanfuryModel[164] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import Box309
		shermanfuryModel[165] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Import Box310
		shermanfuryModel[166] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Import Box311
		shermanfuryModel[167] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import Box312
		shermanfuryModel[168] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Import Box313
		shermanfuryModel[169] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Import Box314
		shermanfuryModel[170] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Import Box315
		shermanfuryModel[171] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Import Box316
		shermanfuryModel[172] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import Box317
		shermanfuryModel[173] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import Box318
		shermanfuryModel[174] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Import Box2
		shermanfuryModel[175] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Import Box3
		shermanfuryModel[176] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Import Box4
		shermanfuryModel[177] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Import Box5
		shermanfuryModel[178] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Import Box6
		shermanfuryModel[179] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import Box7
		shermanfuryModel[180] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Import Box8
		shermanfuryModel[181] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Import Box9
		shermanfuryModel[182] = new ModelRendererTurbo(this, 233, 241, textureX, textureY); // Import Box19
		shermanfuryModel[183] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Import Box20
		shermanfuryModel[184] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Import Box21
		shermanfuryModel[185] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Import Box22
		shermanfuryModel[186] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import Box23
		shermanfuryModel[187] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box24
		shermanfuryModel[188] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box25
		shermanfuryModel[189] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box26
		shermanfuryModel[190] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box343
		shermanfuryModel[191] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box344
		shermanfuryModel[192] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box0
		shermanfuryModel[193] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box1
		shermanfuryModel[194] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box2
		shermanfuryModel[195] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box3
		shermanfuryModel[196] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box4
		shermanfuryModel[197] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box5
		shermanfuryModel[198] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box6
		shermanfuryModel[199] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box7
		shermanfuryModel[200] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box8
		shermanfuryModel[201] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box9
		shermanfuryModel[202] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box10
		shermanfuryModel[203] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box11
		shermanfuryModel[204] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box12
		shermanfuryModel[205] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box13
		shermanfuryModel[206] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box14
		shermanfuryModel[207] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box15
		shermanfuryModel[208] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box16
		shermanfuryModel[209] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box17
		shermanfuryModel[210] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box18
		shermanfuryModel[211] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box19
		shermanfuryModel[212] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box0
		shermanfuryModel[213] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box1
		shermanfuryModel[214] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Import Box2
		shermanfuryModel[215] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import Box3
		shermanfuryModel[216] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box4
		shermanfuryModel[217] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box5
		shermanfuryModel[218] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Import Box6
		shermanfuryModel[219] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import Box7
		shermanfuryModel[220] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box8
		shermanfuryModel[221] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import Box9
		shermanfuryModel[222] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import Box10
		shermanfuryModel[223] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Import Box11
		shermanfuryModel[224] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box12
		shermanfuryModel[225] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import Box13
		shermanfuryModel[226] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import Box14
		shermanfuryModel[227] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Import Box15
		shermanfuryModel[228] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box16
		shermanfuryModel[229] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box17
		shermanfuryModel[230] = new ModelRendererTurbo(this, 35, 350, textureX, textureY); // Import Box18
		shermanfuryModel[231] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box19
		shermanfuryModel[232] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box20
		shermanfuryModel[233] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Import Box21
		shermanfuryModel[234] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box25
		shermanfuryModel[235] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box27
		shermanfuryModel[236] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import Box28
		shermanfuryModel[237] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box31
		shermanfuryModel[238] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import Box32
		shermanfuryModel[239] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import Box33
		shermanfuryModel[240] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Import Box34
		shermanfuryModel[241] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Import Box35
		shermanfuryModel[242] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box36
		shermanfuryModel[243] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Import Box37
		shermanfuryModel[244] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box39
		shermanfuryModel[245] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box47
		shermanfuryModel[246] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box48
		shermanfuryModel[247] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import Box49
		shermanfuryModel[248] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box50
		shermanfuryModel[249] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box51
		shermanfuryModel[250] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box45
		shermanfuryModel[251] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box46
		shermanfuryModel[252] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box47
		shermanfuryModel[253] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box48
		shermanfuryModel[254] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import Box49
		shermanfuryModel[255] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box50
		shermanfuryModel[256] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box51
		shermanfuryModel[257] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box52
		shermanfuryModel[258] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box53
		shermanfuryModel[259] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box54
		shermanfuryModel[260] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box55
		shermanfuryModel[261] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box56
		shermanfuryModel[262] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box57
		shermanfuryModel[263] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box58
		shermanfuryModel[264] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box69
		shermanfuryModel[265] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box70
		shermanfuryModel[266] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box71
		shermanfuryModel[267] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box72
		shermanfuryModel[268] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box76
		shermanfuryModel[269] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Import Box288
		shermanfuryModel[270] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Import Box289
		shermanfuryModel[271] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box290
		shermanfuryModel[272] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Import Box291
		shermanfuryModel[273] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box292
		shermanfuryModel[274] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box293
		shermanfuryModel[275] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box294
		shermanfuryModel[276] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box295
		shermanfuryModel[277] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box296
		shermanfuryModel[278] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Import Box297
		shermanfuryModel[279] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box299
		shermanfuryModel[280] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Import Box319
		shermanfuryModel[281] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Import Box320
		shermanfuryModel[282] = new ModelRendererTurbo(this, 105, 217, textureX, textureY); // Import Box321
		shermanfuryModel[283] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Import Box322
		shermanfuryModel[284] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import Box325
		shermanfuryModel[285] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Import Box326
		shermanfuryModel[286] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Import Box327
		shermanfuryModel[287] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Import Box333
		shermanfuryModel[288] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Import Box335
		shermanfuryModel[289] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import Box336
		shermanfuryModel[290] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Import Box0
		shermanfuryModel[291] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import Box1
		shermanfuryModel[292] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Import Box11
		shermanfuryModel[293] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Import Box12
		shermanfuryModel[294] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Import Box13
		shermanfuryModel[295] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Import Box14
		shermanfuryModel[296] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box15
		shermanfuryModel[297] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Import Box18
		shermanfuryModel[298] = new ModelRendererTurbo(this, 20, 400, textureX, textureY); // Import Box4
		shermanfuryModel[299] = new ModelRendererTurbo(this, 36, 400, textureX, textureY); // Import Box5
		shermanfuryModel[300] = new ModelRendererTurbo(this, 36, 400, textureX, textureY); // Import Box7
		shermanfuryModel[301] = new ModelRendererTurbo(this, 4, 408, textureX, textureY); // Import Box8
		shermanfuryModel[302] = new ModelRendererTurbo(this, 52, 400, textureX, textureY); // Import Box9
		shermanfuryModel[303] = new ModelRendererTurbo(this, 60, 400, textureX, textureY); // Import Box10
		shermanfuryModel[304] = new ModelRendererTurbo(this, 4, 408, textureX, textureY); // Import Box11
		shermanfuryModel[305] = new ModelRendererTurbo(this, 30, 420, textureX, textureY); // Import Box299
		shermanfuryModel[306] = new ModelRendererTurbo(this, 60, 408, textureX, textureY); // Import Box13
		shermanfuryModel[307] = new ModelRendererTurbo(this, 44, 416, textureX, textureY); // Import Box14
		shermanfuryModel[308] = new ModelRendererTurbo(this, 52, 416, textureX, textureY); // Import Box15
		shermanfuryModel[309] = new ModelRendererTurbo(this, 60, 416, textureX, textureY); // Import Box16
		shermanfuryModel[310] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box38
		shermanfuryModel[311] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box40
		shermanfuryModel[312] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box41
		shermanfuryModel[313] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box54
		shermanfuryModel[314] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box55
		shermanfuryModel[315] = new ModelRendererTurbo(this, 0, 300, textureX, textureY); // Import Box343
		shermanfuryModel[316] = new ModelRendererTurbo(this, 200, 300, textureX, textureY); // Import Box345
		shermanfuryModel[317] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Import Box268
		shermanfuryModel[318] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Import Box269
		shermanfuryModel[319] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Import Box270
		shermanfuryModel[320] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Import Box271
		shermanfuryModel[321] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Import Box272
		shermanfuryModel[322] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box273
		shermanfuryModel[323] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Import Box274
		shermanfuryModel[324] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Import Box275
		shermanfuryModel[325] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Import Box276
		shermanfuryModel[326] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Import Box277
		shermanfuryModel[327] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Import Box278
		shermanfuryModel[328] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Import Box279
		shermanfuryModel[329] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Import Box280
		shermanfuryModel[330] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Import Box281
		shermanfuryModel[331] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Import Box282
		shermanfuryModel[332] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Import Box283
		shermanfuryModel[333] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Import Box284
		shermanfuryModel[334] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Import Box285
		shermanfuryModel[335] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box286
		shermanfuryModel[336] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Import Box287
		shermanfuryModel[337] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Import Box288
		shermanfuryModel[338] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Import Box289
		shermanfuryModel[339] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import Box244
		shermanfuryModel[340] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Import Box245
		shermanfuryModel[341] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Import Box246
		shermanfuryModel[342] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Import Box247
		shermanfuryModel[343] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Import Box248
		shermanfuryModel[344] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Import Box249
		shermanfuryModel[345] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Import Box250
		shermanfuryModel[346] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Import Box252
		shermanfuryModel[347] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Import Box253
		shermanfuryModel[348] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Import Box255
		shermanfuryModel[349] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Import Box256
		shermanfuryModel[350] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Import Box257
		shermanfuryModel[351] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Import Box258
		shermanfuryModel[352] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Import Box259
		shermanfuryModel[353] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import Box260
		shermanfuryModel[354] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box261
		shermanfuryModel[355] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Import Box262
		shermanfuryModel[356] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Import Box263
		shermanfuryModel[357] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Import Box264
		shermanfuryModel[358] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Import Box265
		shermanfuryModel[359] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Import Box266
		shermanfuryModel[360] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Import Box267
		shermanfuryModel[361] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Import Box276
		shermanfuryModel[362] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Import Box277

		shermanfuryModel[0].addShapeBox(0F, 0F, 0F, 24, 11, 48, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 60F, 1F, 0F, 15F, 4F, 0F, 15F, 4F, 0F, 60F, 1F, 0F); // Import Box0
		shermanfuryModel[0].setRotationPoint(6F, -24F, -24F);

		shermanfuryModel[1].addBox(-71F, 0F, 0F, 91, 14, 28, 0F); // Import Box6
		shermanfuryModel[1].setRotationPoint(20F, -12F, -14F);

		shermanfuryModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 28, 0F, 0F, 5F, 0F, -4F, 3F, 0F, -4F, 3F, 0F, 0F, 5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box7
		shermanfuryModel[2].setRotationPoint(38F, -7.9F, -14F);

		shermanfuryModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		shermanfuryModel[3].setRotationPoint(40F, -7F, -14F);

		shermanfuryModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 28, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 2F, 0F); // Import Box9
		shermanfuryModel[4].setRotationPoint(40F, -3F, -14F);

		shermanfuryModel[5].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Import Box11
		shermanfuryModel[5].setRotationPoint(-55F, -12.5F, -27F);

		shermanfuryModel[6].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Import Box12
		shermanfuryModel[6].setRotationPoint(-55F, -12.5F, 13F);

		shermanfuryModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 4F, 0F); // Import Box13
		shermanfuryModel[7].setRotationPoint(42F, -12.5F, -27F);

		shermanfuryModel[8].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Import Box15
		shermanfuryModel[8].setRotationPoint(-55F, -11.5F, -27F);

		shermanfuryModel[9].addBox(67F, 0F, 0F, 97, 4, 1, 0F); // Import Box16
		shermanfuryModel[9].setRotationPoint(-122F, -11.5F, 26F);

		shermanfuryModel[10].addShapeBox(0F, 0F, 0F, 22, 11, 24, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 35F, -5F, 0F, -60F, 1F, 0F, -60F, 1F, 0F, 35F, -5F, -6F); // Import Box19
		shermanfuryModel[10].setRotationPoint(-16F, -24F, 0F);

		shermanfuryModel[11].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Import Box22
		shermanfuryModel[11].setRotationPoint(-55F, -11.5F, -14F);

		shermanfuryModel[12].addShapeBox(0F, 0F, 0F, 97, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		shermanfuryModel[12].setRotationPoint(-55F, -11.5F, 13F);

		shermanfuryModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 2F, 5F, 0F, 2F, 5F, 0F, 0F, 4F, 0F); // Import Box24
		shermanfuryModel[13].setRotationPoint(42F, -12.5F, 13F);

		shermanfuryModel[14].addShapeBox(0F, 0F, 0F, 22, 11, 24, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 35F, -5F, -6F, -60F, 1F, 0F, -60F, 1F, 0F, 35F, -5F, 0F); // Import Box42
		shermanfuryModel[14].setRotationPoint(-16F, -24F, -24F);

		shermanfuryModel[15].addBox(0F, 0F, 0F, 5, 1, 26, 0F); // Import Box43
		shermanfuryModel[15].setRotationPoint(-55F, -12.5F, -13F);

		shermanfuryModel[16].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box44
		shermanfuryModel[16].setRotationPoint(18F, -25F, 8F);

		shermanfuryModel[17].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box45
		shermanfuryModel[17].setRotationPoint(18F, -25F, -18F);

		shermanfuryModel[18].addBox(0F, 0F, 0F, 5, 5, 6, 0F); // Import Box52
		shermanfuryModel[18].setRotationPoint(33F, -21F, -14F);

		shermanfuryModel[19].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box53
		shermanfuryModel[19].setRotationPoint(38F, -20.5F, -13F);

		shermanfuryModel[20].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box56
		shermanfuryModel[20].setRotationPoint(39F, -18.8F, -11.5F);

		shermanfuryModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, 5F, 0F); // Import Box42
		shermanfuryModel[21].setRotationPoint(-57F, -12.5F, -27F);

		shermanfuryModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 2F, 5F, 0F); // Import Box43
		shermanfuryModel[22].setRotationPoint(-57F, -12.5F, 13F);

		shermanfuryModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box60
		shermanfuryModel[23].setRotationPoint(-52.3F, -9F, -10.5F);

		shermanfuryModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		shermanfuryModel[24].setRotationPoint(-52.4F, -9F, -0.5F);

		shermanfuryModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		shermanfuryModel[25].setRotationPoint(-52.4F, -10F, -11.5F);

		shermanfuryModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		shermanfuryModel[26].setRotationPoint(-52.4F, -10F, 10.5F);

		shermanfuryModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box65
		shermanfuryModel[27].setRotationPoint(-52.4F, -10F, -10.5F);

		shermanfuryModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		shermanfuryModel[28].setRotationPoint(-52.4F, -1F, -10.5F);

		shermanfuryModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box67
		shermanfuryModel[29].setRotationPoint(-53F, -6F, 0.1F);

		shermanfuryModel[30].addShapeBox(4F, 0F, 0F, 5, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, -2F, -2F, 0F, -1F); // Import Box75
		shermanfuryModel[30].setRotationPoint(35.4F, -13F, 5F);
		shermanfuryModel[30].rotateAngleZ = 0.33161256F;

		shermanfuryModel[31].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box112
		shermanfuryModel[31].setRotationPoint(-2.2F, -7F, 21F);

		shermanfuryModel[32].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box113
		shermanfuryModel[32].setRotationPoint(-3.8F, -7F, 21F);

		shermanfuryModel[33].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box114
		shermanfuryModel[33].setRotationPoint(-6F, -7F, 21F);

		shermanfuryModel[34].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box115
		shermanfuryModel[34].setRotationPoint(0F, -7F, 21F);

		shermanfuryModel[35].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box116
		shermanfuryModel[35].setRotationPoint(-6F, -7F, 17F);

		shermanfuryModel[36].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box117
		shermanfuryModel[36].setRotationPoint(-4F, -2F, 17F);

		shermanfuryModel[37].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box118
		shermanfuryModel[37].setRotationPoint(-4F, 2F, 17F);
		shermanfuryModel[37].rotateAngleZ = -0.34906585F;

		shermanfuryModel[38].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box119
		shermanfuryModel[38].setRotationPoint(1.8F, 3F, 17F);
		shermanfuryModel[38].rotateAngleZ = 0.34906585F;

		shermanfuryModel[39].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box120
		shermanfuryModel[39].setRotationPoint(1F, 4F, 17.4F);
		shermanfuryModel[39].rotateAngleZ = 0.34906585F;

		shermanfuryModel[40].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box121
		shermanfuryModel[40].setRotationPoint(-4F, 3.4F, 17.4F);
		shermanfuryModel[40].rotateAngleZ = -0.34906585F;

		shermanfuryModel[41].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box122
		shermanfuryModel[41].setRotationPoint(3F, 1F, 17F);

		shermanfuryModel[42].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box126
		shermanfuryModel[42].setRotationPoint(-11F, 1F, 17F);

		shermanfuryModel[43].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box128
		shermanfuryModel[43].setRotationPoint(19F, -7F, 21F);

		shermanfuryModel[44].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box129
		shermanfuryModel[44].setRotationPoint(25F, -7F, 21F);

		shermanfuryModel[45].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box130
		shermanfuryModel[45].setRotationPoint(22.8F, -7F, 21F);

		shermanfuryModel[46].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box131
		shermanfuryModel[46].setRotationPoint(21.2F, -7F, 21F);

		shermanfuryModel[47].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box132
		shermanfuryModel[47].setRotationPoint(19F, -7F, 17F);

		shermanfuryModel[48].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box133
		shermanfuryModel[48].setRotationPoint(21F, 2F, 17F);
		shermanfuryModel[48].rotateAngleZ = -0.34906585F;

		shermanfuryModel[49].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box134
		shermanfuryModel[49].setRotationPoint(26.8F, 3F, 17F);
		shermanfuryModel[49].rotateAngleZ = 0.34906585F;

		shermanfuryModel[50].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box135
		shermanfuryModel[50].setRotationPoint(26F, 4F, 17.4F);
		shermanfuryModel[50].rotateAngleZ = 0.34906585F;

		shermanfuryModel[51].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box136
		shermanfuryModel[51].setRotationPoint(21F, 3.4F, 17.4F);
		shermanfuryModel[51].rotateAngleZ = -0.34906585F;

		shermanfuryModel[52].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box137
		shermanfuryModel[52].setRotationPoint(21F, -2F, 17F);

		shermanfuryModel[53].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box139
		shermanfuryModel[53].setRotationPoint(14F, 1F, 17F);

		shermanfuryModel[54].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box142
		shermanfuryModel[54].setRotationPoint(28F, 1F, 17F);

		shermanfuryModel[55].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box144
		shermanfuryModel[55].setRotationPoint(-31F, -7F, 21F);

		shermanfuryModel[56].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box145
		shermanfuryModel[56].setRotationPoint(-25F, -7F, 21F);

		shermanfuryModel[57].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box146
		shermanfuryModel[57].setRotationPoint(-27.2F, -7F, 21F);

		shermanfuryModel[58].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box147
		shermanfuryModel[58].setRotationPoint(-28.8F, -7F, 21F);

		shermanfuryModel[59].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box148
		shermanfuryModel[59].setRotationPoint(-31F, -7F, 17F);

		shermanfuryModel[60].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box149
		shermanfuryModel[60].setRotationPoint(-29F, 2F, 17F);
		shermanfuryModel[60].rotateAngleZ = -0.34906585F;

		shermanfuryModel[61].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box150
		shermanfuryModel[61].setRotationPoint(-23.2F, 3F, 17F);
		shermanfuryModel[61].rotateAngleZ = 0.34906585F;

		shermanfuryModel[62].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box151
		shermanfuryModel[62].setRotationPoint(-24F, 4F, 17.4F);
		shermanfuryModel[62].rotateAngleZ = 0.34906585F;

		shermanfuryModel[63].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box152
		shermanfuryModel[63].setRotationPoint(-29F, 3.4F, 17.4F);
		shermanfuryModel[63].rotateAngleZ = -0.34906585F;

		shermanfuryModel[64].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box153
		shermanfuryModel[64].setRotationPoint(-29F, -2F, 17F);

		shermanfuryModel[65].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box154
		shermanfuryModel[65].setRotationPoint(-33F, 1F, 17F);

		shermanfuryModel[66].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box155
		shermanfuryModel[66].setRotationPoint(-36F, 1F, 17F);

		shermanfuryModel[67].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box156
		shermanfuryModel[67].setRotationPoint(-38F, 1F, 17F);

		shermanfuryModel[68].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box158
		shermanfuryModel[68].setRotationPoint(-22F, 1F, 17F);

		shermanfuryModel[69].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box160
		shermanfuryModel[69].setRotationPoint(19F, -7F, -22F);

		shermanfuryModel[70].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box161
		shermanfuryModel[70].setRotationPoint(25F, -7F, -22F);

		shermanfuryModel[71].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box162
		shermanfuryModel[71].setRotationPoint(22.8F, -7F, -22F);

		shermanfuryModel[72].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box163
		shermanfuryModel[72].setRotationPoint(21.2F, -7F, -22F);

		shermanfuryModel[73].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box164
		shermanfuryModel[73].setRotationPoint(19F, -7F, -21F);

		shermanfuryModel[74].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box165
		shermanfuryModel[74].setRotationPoint(21F, 2F, -21F);
		shermanfuryModel[74].rotateAngleZ = -0.34906585F;

		shermanfuryModel[75].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box166
		shermanfuryModel[75].setRotationPoint(26.8F, 3F, -21F);
		shermanfuryModel[75].rotateAngleZ = 0.34906585F;

		shermanfuryModel[76].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box167
		shermanfuryModel[76].setRotationPoint(21F, -2F, -21F);

		shermanfuryModel[77].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box168
		shermanfuryModel[77].setRotationPoint(26F, 4F, -21.4F);
		shermanfuryModel[77].rotateAngleZ = 0.34906585F;

		shermanfuryModel[78].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box169
		shermanfuryModel[78].setRotationPoint(21F, 3.4F, -21.4F);
		shermanfuryModel[78].rotateAngleZ = -0.34906585F;

		shermanfuryModel[79].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box171
		shermanfuryModel[79].setRotationPoint(14F, 1F, -22F);

		shermanfuryModel[80].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box174
		shermanfuryModel[80].setRotationPoint(28F, 1F, -22F);

		shermanfuryModel[81].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box176
		shermanfuryModel[81].setRotationPoint(0F, -7F, -22F);

		shermanfuryModel[82].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box177
		shermanfuryModel[82].setRotationPoint(-2.2F, -7F, -22F);

		shermanfuryModel[83].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box178
		shermanfuryModel[83].setRotationPoint(-3.8F, -7F, -22F);

		shermanfuryModel[84].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box179
		shermanfuryModel[84].setRotationPoint(-6F, -7F, -21F);

		shermanfuryModel[85].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box180
		shermanfuryModel[85].setRotationPoint(-6F, -7F, -22F);

		shermanfuryModel[86].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box181
		shermanfuryModel[86].setRotationPoint(-4F, 2F, -21F);
		shermanfuryModel[86].rotateAngleZ = -0.34906585F;

		shermanfuryModel[87].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box182
		shermanfuryModel[87].setRotationPoint(-4F, -2F, -21F);

		shermanfuryModel[88].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box183
		shermanfuryModel[88].setRotationPoint(1.8F, 3F, -21F);
		shermanfuryModel[88].rotateAngleZ = 0.34906585F;

		shermanfuryModel[89].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box184
		shermanfuryModel[89].setRotationPoint(1F, 4F, -21.4F);
		shermanfuryModel[89].rotateAngleZ = 0.34906585F;

		shermanfuryModel[90].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box185
		shermanfuryModel[90].setRotationPoint(-4F, 3.4F, -21.4F);
		shermanfuryModel[90].rotateAngleZ = -0.34906585F;

		shermanfuryModel[91].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box187
		shermanfuryModel[91].setRotationPoint(-11F, 1F, -22F);

		shermanfuryModel[92].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box190
		shermanfuryModel[92].setRotationPoint(3F, 1F, -22F);

		shermanfuryModel[93].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box193
		shermanfuryModel[93].setRotationPoint(-22F, 1F, -22F);

		shermanfuryModel[94].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box195
		shermanfuryModel[94].setRotationPoint(-24F, 4F, -21.4F);
		shermanfuryModel[94].rotateAngleZ = 0.34906585F;

		shermanfuryModel[95].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box196
		shermanfuryModel[95].setRotationPoint(-23.2F, 3F, -21F);
		shermanfuryModel[95].rotateAngleZ = 0.34906585F;

		shermanfuryModel[96].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box197
		shermanfuryModel[96].setRotationPoint(-29F, -2F, -21F);

		shermanfuryModel[97].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box198
		shermanfuryModel[97].setRotationPoint(-29F, 2F, -21F);
		shermanfuryModel[97].rotateAngleZ = -0.34906585F;

		shermanfuryModel[98].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box199
		shermanfuryModel[98].setRotationPoint(-29F, 3.4F, -21.4F);
		shermanfuryModel[98].rotateAngleZ = -0.34906585F;

		shermanfuryModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box200
		shermanfuryModel[99].setRotationPoint(-33F, 1F, -22F);

		shermanfuryModel[100].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box201
		shermanfuryModel[100].setRotationPoint(-36F, 1F, -22F);

		shermanfuryModel[101].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box202
		shermanfuryModel[101].setRotationPoint(-38F, 1F, -22F);

		shermanfuryModel[102].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box203
		shermanfuryModel[102].setRotationPoint(-27.2F, -7F, -22F);

		shermanfuryModel[103].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box204
		shermanfuryModel[103].setRotationPoint(-25F, -7F, -22F);

		shermanfuryModel[104].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box205
		shermanfuryModel[104].setRotationPoint(-31F, -7F, -22F);

		shermanfuryModel[105].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box206
		shermanfuryModel[105].setRotationPoint(-28.8F, -7F, -22F);

		shermanfuryModel[106].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box207
		shermanfuryModel[106].setRotationPoint(-31F, -7F, -21F);

		shermanfuryModel[107].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box208
		shermanfuryModel[107].setRotationPoint(44F, -6F, 15F);

		shermanfuryModel[108].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box209
		shermanfuryModel[108].setRotationPoint(39F, -6F, 15F);

		shermanfuryModel[109].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box210
		shermanfuryModel[109].setRotationPoint(37F, -6F, 15F);

		shermanfuryModel[110].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box211
		shermanfuryModel[110].setRotationPoint(-47F, -6F, 15F);

		shermanfuryModel[111].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box212
		shermanfuryModel[111].setRotationPoint(-52F, -6F, 15F);

		shermanfuryModel[112].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box213
		shermanfuryModel[112].setRotationPoint(-54F, -6F, 15F);

		shermanfuryModel[113].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box214
		shermanfuryModel[113].setRotationPoint(-47F, -6F, -24F);

		shermanfuryModel[114].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box215
		shermanfuryModel[114].setRotationPoint(-52F, -6F, -24F);

		shermanfuryModel[115].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box216
		shermanfuryModel[115].setRotationPoint(-54F, -6F, -24F);

		shermanfuryModel[116].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box217
		shermanfuryModel[116].setRotationPoint(37F, -6F, -24F);

		shermanfuryModel[117].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box218
		shermanfuryModel[117].setRotationPoint(39F, -6F, -24F);

		shermanfuryModel[118].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box219
		shermanfuryModel[118].setRotationPoint(44F, -6F, -24F);

		shermanfuryModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box226
		shermanfuryModel[119].setRotationPoint(-34F, -8F, 17F);

		shermanfuryModel[120].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box227
		shermanfuryModel[120].setRotationPoint(-36F, -8F, 17F);

		shermanfuryModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box228
		shermanfuryModel[121].setRotationPoint(-37F, -8F, 17F);

		shermanfuryModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box229
		shermanfuryModel[122].setRotationPoint(-34F, -8F, -22F);

		shermanfuryModel[123].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box230
		shermanfuryModel[123].setRotationPoint(-36F, -8F, -22F);

		shermanfuryModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box231
		shermanfuryModel[124].setRotationPoint(-37F, -8F, -22F);

		shermanfuryModel[125].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box240
		shermanfuryModel[125].setRotationPoint(-31F, -6F, 17F);
		shermanfuryModel[125].rotateAngleZ = 0.34906585F;

		shermanfuryModel[126].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box241
		shermanfuryModel[126].setRotationPoint(-31F, -6F, -21F);
		shermanfuryModel[126].rotateAngleZ = 0.34906585F;

		shermanfuryModel[127].addBox(0F, 0F, 0F, 13, 8, 1, 0F); // Import Box290
		shermanfuryModel[127].setRotationPoint(13F, -22F, 23.5F);

		shermanfuryModel[128].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box300
		shermanfuryModel[128].setRotationPoint(-32F, -22F, 8F);
		shermanfuryModel[128].rotateAngleZ = -0.15707963F;

		shermanfuryModel[129].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box301
		shermanfuryModel[129].setRotationPoint(-39F, -21F, 8F);
		shermanfuryModel[129].rotateAngleZ = -0.15707963F;

		shermanfuryModel[130].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box302
		shermanfuryModel[130].setRotationPoint(-45F, -20F, 8F);
		shermanfuryModel[130].rotateAngleZ = -0.15707963F;

		shermanfuryModel[131].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box303
		shermanfuryModel[131].setRotationPoint(-52F, -19F, 8F);
		shermanfuryModel[131].rotateAngleZ = -0.15707963F;

		shermanfuryModel[132].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Import Box304
		shermanfuryModel[132].setRotationPoint(-32F, -22F, -15F);
		shermanfuryModel[132].rotateAngleZ = -0.15707963F;

		shermanfuryModel[133].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Import Box308
		shermanfuryModel[133].setRotationPoint(-39F, -21F, -15F);
		shermanfuryModel[133].rotateAngleZ = -0.15707963F;

		shermanfuryModel[134].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Import Box311
		shermanfuryModel[134].setRotationPoint(-45F, -20F, -15F);
		shermanfuryModel[134].rotateAngleZ = -0.15707963F;

		shermanfuryModel[135].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, -7F, 0F, 8F); // Import Box312
		shermanfuryModel[135].setRotationPoint(-52F, -19F, -15F);
		shermanfuryModel[135].rotateAngleZ = -0.15707963F;

		shermanfuryModel[136].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F, -7F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 19F, 0F, 0F, 19F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box270
		shermanfuryModel[136].setRotationPoint(36F, -6F, 6F);
		shermanfuryModel[136].rotateAngleZ = -0.55850536F;

		shermanfuryModel[137].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box273
		shermanfuryModel[137].setRotationPoint(-23F, -22F, -26F);
		shermanfuryModel[137].rotateAngleY = 0.01745329F;
		shermanfuryModel[137].rotateAngleZ = -0.02617994F;

		shermanfuryModel[138].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box274
		shermanfuryModel[138].setRotationPoint(-23F, -19F, -27F);
		shermanfuryModel[138].rotateAngleZ = -0.01745329F;

		shermanfuryModel[139].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box275
		shermanfuryModel[139].setRotationPoint(-23F, -16F, -27F);

		shermanfuryModel[140].addBox(-13F, 0F, 0.3F, 13, 1, 1, 0F); // Import Box109
		shermanfuryModel[140].setRotationPoint(5.2F, -25F, 20F);
		shermanfuryModel[140].rotateAngleY = -0.05235988F;

		shermanfuryModel[141].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box118
		shermanfuryModel[141].setRotationPoint(-9F, -24.5F, 19F);

		shermanfuryModel[142].addBox(-13F, 0F, 0F, 13, 1, 1, 0F); // Import Box108
		shermanfuryModel[142].setRotationPoint(18F, -25F, 19F);
		shermanfuryModel[142].rotateAngleY = 0.10471976F;

		shermanfuryModel[143].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Import Box102
		shermanfuryModel[143].setRotationPoint(18F, -25F, 19F);

		shermanfuryModel[144].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box103
		shermanfuryModel[144].setRotationPoint(30.6F, -25F, 19F);
		shermanfuryModel[144].rotateAngleY = 0.76794487F;
		shermanfuryModel[144].rotateAngleZ = 0.66322512F;

		shermanfuryModel[145].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Box104
		shermanfuryModel[145].setRotationPoint(34F, -21.5F, 16F);
		shermanfuryModel[145].rotateAngleY = 0.27925268F;
		shermanfuryModel[145].rotateAngleZ = 0.54105207F;

		shermanfuryModel[146].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		shermanfuryModel[146].setRotationPoint(40.9F, -16.9F, 14F);
		shermanfuryModel[146].rotateAngleY = 0.80285146F;
		shermanfuryModel[146].rotateAngleZ = 0.62831853F;

		shermanfuryModel[147].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box285
		shermanfuryModel[147].setRotationPoint(48.7F, -8.7F, 6F);
		shermanfuryModel[147].rotateAngleY = 0.76794487F;
		shermanfuryModel[147].rotateAngleZ = 2.04203522F;

		shermanfuryModel[148].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box286
		shermanfuryModel[148].setRotationPoint(37F, -18F, 18F);

		shermanfuryModel[149].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box287
		shermanfuryModel[149].setRotationPoint(37F, -18F, 21F);

		shermanfuryModel[150].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box288
		shermanfuryModel[150].setRotationPoint(38F, -18F, 21F);
		shermanfuryModel[150].rotateAngleZ = -0.41887902F;

		shermanfuryModel[151].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box289
		shermanfuryModel[151].setRotationPoint(38F, -18F, 18F);
		shermanfuryModel[151].rotateAngleZ = -0.41887902F;

		shermanfuryModel[152].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		shermanfuryModel[152].setRotationPoint(37.2F, -19.8F, 18F);
		shermanfuryModel[152].rotateAngleZ = -0.41887902F;

		shermanfuryModel[153].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box293
		shermanfuryModel[153].setRotationPoint(37F, -18F, -22F);

		shermanfuryModel[154].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box294
		shermanfuryModel[154].setRotationPoint(37F, -18F, -19F);

		shermanfuryModel[155].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box295
		shermanfuryModel[155].setRotationPoint(38F, -18F, -19F);
		shermanfuryModel[155].rotateAngleZ = -0.41887902F;

		shermanfuryModel[156].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box299
		shermanfuryModel[156].setRotationPoint(38F, -18F, -22F);
		shermanfuryModel[156].rotateAngleZ = -0.41887902F;

		shermanfuryModel[157].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box302
		shermanfuryModel[157].setRotationPoint(37.2F, -19.8F, 21F);
		shermanfuryModel[157].rotateAngleZ = -0.41887902F;

		shermanfuryModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Import Box303
		shermanfuryModel[158].setRotationPoint(37F, -18F, 19.5F);

		shermanfuryModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box304
		shermanfuryModel[159].setRotationPoint(37F, -16.8F, 19.5F);

		shermanfuryModel[160].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box305
		shermanfuryModel[160].setRotationPoint(37F, -16.8F, -20.5F);

		shermanfuryModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Import Box306
		shermanfuryModel[161].setRotationPoint(37F, -18F, -20.5F);

		shermanfuryModel[162].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box307
		shermanfuryModel[162].setRotationPoint(37F, -18F, -19F);

		shermanfuryModel[163].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box308
		shermanfuryModel[163].setRotationPoint(38F, -18F, -19F);
		shermanfuryModel[163].rotateAngleZ = -0.41887902F;

		shermanfuryModel[164].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box309
		shermanfuryModel[164].setRotationPoint(37.2F, -19.8F, -19F);
		shermanfuryModel[164].rotateAngleZ = -0.41887902F;

		shermanfuryModel[165].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box310
		shermanfuryModel[165].setRotationPoint(37.2F, -19.8F, -22F);
		shermanfuryModel[165].rotateAngleZ = -0.41887902F;

		shermanfuryModel[166].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box311
		shermanfuryModel[166].setRotationPoint(38F, -18F, -22F);
		shermanfuryModel[166].rotateAngleZ = -0.41887902F;

		shermanfuryModel[167].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box312
		shermanfuryModel[167].setRotationPoint(37F, -18F, -22F);

		shermanfuryModel[168].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box313
		shermanfuryModel[168].setRotationPoint(36.5F, -13F, -3F);
		shermanfuryModel[168].rotateAngleX = 0.85521133F;
		shermanfuryModel[168].rotateAngleY = 1.57079633F;

		shermanfuryModel[169].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box314
		shermanfuryModel[169].setRotationPoint(36.5F, -13F, 0F);
		shermanfuryModel[169].rotateAngleX = 0.85521133F;
		shermanfuryModel[169].rotateAngleY = 1.57079633F;

		shermanfuryModel[170].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box315
		shermanfuryModel[170].setRotationPoint(36.5F, -13F, 2F);
		shermanfuryModel[170].rotateAngleX = 0.85521133F;
		shermanfuryModel[170].rotateAngleY = 1.57079633F;

		shermanfuryModel[171].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box316
		shermanfuryModel[171].setRotationPoint(31F, -22.5F, 0F);
		shermanfuryModel[171].rotateAngleX = 0.20943951F;
		shermanfuryModel[171].rotateAngleZ = -0.78539816F;

		shermanfuryModel[172].addBox(0F, 0F, -1F, 1, 9, 1, 0F); // Import Box317
		shermanfuryModel[172].setRotationPoint(31F, -22.5F, -1F);
		shermanfuryModel[172].rotateAngleX = -0.20943951F;
		shermanfuryModel[172].rotateAngleZ = -0.78539816F;

		shermanfuryModel[173].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box318
		shermanfuryModel[173].setRotationPoint(29F, -25F, -2.5F);
		shermanfuryModel[173].rotateAngleZ = -0.78539816F;

		shermanfuryModel[174].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box2
		shermanfuryModel[174].setRotationPoint(-23F, -22F, 23F);
		shermanfuryModel[174].rotateAngleY = -0.01745329F;
		shermanfuryModel[174].rotateAngleZ = -0.02617994F;

		shermanfuryModel[175].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box3
		shermanfuryModel[175].setRotationPoint(-23F, -19F, 24F);
		shermanfuryModel[175].rotateAngleZ = -0.01745329F;

		shermanfuryModel[176].addBox(0F, 0F, 0F, 45, 3, 3, 0F); // Import Box4
		shermanfuryModel[176].setRotationPoint(-23F, -16F, 24F);

		shermanfuryModel[177].addBox(0F, 0F, 0F, 8, 8, 3, 0F); // Import Box5
		shermanfuryModel[177].setRotationPoint(-50F, -20.5F, 24F);

		shermanfuryModel[178].addBox(0F, 0F, 0F, 8, 1, 2, 0F); // Import Box6
		shermanfuryModel[178].setRotationPoint(-50F, -21.5F, 24.5F);

		shermanfuryModel[179].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box7
		shermanfuryModel[179].setRotationPoint(-50F, -23.5F, 24.5F);

		shermanfuryModel[180].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Import Box8
		shermanfuryModel[180].setRotationPoint(-48F, -23.5F, 25F);

		shermanfuryModel[181].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box9
		shermanfuryModel[181].setRotationPoint(-45F, -22.5F, 25F);

		shermanfuryModel[182].addBox(0F, -1F, 0F, 6, 1, 6, 0F); // Import Box19
		shermanfuryModel[182].setRotationPoint(32F, -22F, 9.5F);
		shermanfuryModel[182].rotateAngleZ = 0.01745329F;

		shermanfuryModel[183].addShapeBox(1F, -3F, -0.5F, 4, 2, 4, 0F, 0.4F, 0.5F, 0.1F, 0.4F, 0.5F, 0.1F, 0.4F, 0.5F, 1F, 0.4F, 0.5F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Import Box20
		shermanfuryModel[183].setRotationPoint(32F, -21F, 10.5F);
		shermanfuryModel[183].rotateAngleZ = 0.01745329F;

		shermanfuryModel[184].addBox(0F, -1F, 0F, 3, 1, 6, 0F); // Import Box21
		shermanfuryModel[184].setRotationPoint(32F, -21F, 9.5F);
		shermanfuryModel[184].rotateAngleZ = 0.01745329F;

		shermanfuryModel[185].addShapeBox(1F, -3F, -0.5F, 1, 2, 3, 0F, 2.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 2.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Import Box22
		shermanfuryModel[185].setRotationPoint(35F, -19F, 11F);
		shermanfuryModel[185].rotateAngleZ = 0.01745329F;

		shermanfuryModel[186].addShapeBox(1F, -3F, -0.3F, 1, 2, 1, 0F, 0.4F, 1F, -0.2F, 0.4F, 0F, 0.5F, 0.4F, 0F, 1F, 0.4F, 1F, 0.5F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F); // Import Box23
		shermanfuryModel[186].setRotationPoint(37F, -17F, 12F);
		shermanfuryModel[186].rotateAngleZ = -0.59341195F;

		shermanfuryModel[187].addShapeBox(1F, -3F, -0.5F, 1, 1, 1, 0F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F, 0.6F, 0.5F, 0.6F); // Import Box24
		shermanfuryModel[187].setRotationPoint(38F, -15.5F, 12.5F);
		shermanfuryModel[187].rotateAngleZ = -0.59341195F;

		shermanfuryModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Import Box25
		shermanfuryModel[188].setRotationPoint(36.02F, -22F, 11.3F);
		shermanfuryModel[188].rotateAngleZ = 0.01745329F;

		shermanfuryModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 0, 0F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Import Box26
		shermanfuryModel[189].setRotationPoint(36.02F, -22F, 13.7F);
		shermanfuryModel[189].rotateAngleZ = 0.01745329F;

		shermanfuryModel[190].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Import Box343
		shermanfuryModel[190].setRotationPoint(24F, -27F, 12F);

		shermanfuryModel[191].addBox(0F, 0F, -18F, 1, 2, 4, 0F); // Import Box344
		shermanfuryModel[191].setRotationPoint(24F, -27F, 2F);

		shermanfuryModel[192].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box0
		shermanfuryModel[192].setRotationPoint(-24F, 1F, -22F);

		shermanfuryModel[193].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box1
		shermanfuryModel[193].setRotationPoint(1F, 1F, -22F);

		shermanfuryModel[194].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box2
		shermanfuryModel[194].setRotationPoint(-13F, 1F, -22F);

		shermanfuryModel[195].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box3
		shermanfuryModel[195].setRotationPoint(26F, 1F, -22F);

		shermanfuryModel[196].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box4
		shermanfuryModel[196].setRotationPoint(12F, 1F, -22F);

		shermanfuryModel[197].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box5
		shermanfuryModel[197].setRotationPoint(-19F, 1F, -22F);

		shermanfuryModel[198].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box6
		shermanfuryModel[198].setRotationPoint(6F, 1F, -22F);

		shermanfuryModel[199].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box7
		shermanfuryModel[199].setRotationPoint(-8F, 1F, -22F);

		shermanfuryModel[200].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box8
		shermanfuryModel[200].setRotationPoint(17F, 1F, -22F);

		shermanfuryModel[201].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box9
		shermanfuryModel[201].setRotationPoint(31F, 1F, -22F);

		shermanfuryModel[202].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box10
		shermanfuryModel[202].setRotationPoint(-19F, 1F, 17F);

		shermanfuryModel[203].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box11
		shermanfuryModel[203].setRotationPoint(-24F, 1F, 17F);

		shermanfuryModel[204].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box12
		shermanfuryModel[204].setRotationPoint(6F, 1F, 17F);

		shermanfuryModel[205].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box13
		shermanfuryModel[205].setRotationPoint(1F, 1F, 17F);

		shermanfuryModel[206].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box14
		shermanfuryModel[206].setRotationPoint(-8F, 1F, 17F);

		shermanfuryModel[207].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box15
		shermanfuryModel[207].setRotationPoint(-13F, 1F, 17F);

		shermanfuryModel[208].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box16
		shermanfuryModel[208].setRotationPoint(31F, 1F, 17F);

		shermanfuryModel[209].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box17
		shermanfuryModel[209].setRotationPoint(26F, 1F, 17F);

		shermanfuryModel[210].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box18
		shermanfuryModel[210].setRotationPoint(17F, 1F, 17F);

		shermanfuryModel[211].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import Box19
		shermanfuryModel[211].setRotationPoint(12F, 1F, 17F);

		shermanfuryModel[212].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box0
		shermanfuryModel[212].setRotationPoint(-9F, -8F, 17F);

		shermanfuryModel[213].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box1
		shermanfuryModel[213].setRotationPoint(-11F, -8F, 17F);

		shermanfuryModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box2
		shermanfuryModel[214].setRotationPoint(-12F, -8F, 17F);

		shermanfuryModel[215].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box3
		shermanfuryModel[215].setRotationPoint(-6F, -6F, 17F);
		shermanfuryModel[215].rotateAngleZ = 0.34906585F;

		shermanfuryModel[216].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box4
		shermanfuryModel[216].setRotationPoint(16F, -8F, 17F);

		shermanfuryModel[217].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box5
		shermanfuryModel[217].setRotationPoint(14F, -8F, 17F);

		shermanfuryModel[218].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box6
		shermanfuryModel[218].setRotationPoint(13F, -8F, 17F);

		shermanfuryModel[219].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box7
		shermanfuryModel[219].setRotationPoint(19F, -6F, 17F);
		shermanfuryModel[219].rotateAngleZ = 0.34906585F;

		shermanfuryModel[220].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box8
		shermanfuryModel[220].setRotationPoint(-12F, -8F, -22F);

		shermanfuryModel[221].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box9
		shermanfuryModel[221].setRotationPoint(-11F, -8F, -22F);

		shermanfuryModel[222].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box10
		shermanfuryModel[222].setRotationPoint(-9F, -8F, -22F);

		shermanfuryModel[223].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box11
		shermanfuryModel[223].setRotationPoint(-6F, -6F, -21F);
		shermanfuryModel[223].rotateAngleZ = 0.34906585F;

		shermanfuryModel[224].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box12
		shermanfuryModel[224].setRotationPoint(13F, -8F, -22F);

		shermanfuryModel[225].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box13
		shermanfuryModel[225].setRotationPoint(14F, -8F, -22F);

		shermanfuryModel[226].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box14
		shermanfuryModel[226].setRotationPoint(16F, -8F, -22F);

		shermanfuryModel[227].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box15
		shermanfuryModel[227].setRotationPoint(19F, -6F, -21F);
		shermanfuryModel[227].rotateAngleZ = 0.34906585F;

		shermanfuryModel[228].addBox(0F, 0F, 0F, 5, 1, 26, 0F); // Import Box16
		shermanfuryModel[228].setRotationPoint(-57F, -15.5F, -13F);
		shermanfuryModel[228].rotateAngleZ = 0.33161256F;

		shermanfuryModel[229].addBox(0F, 0F, 0F, 3, 5, 10, 0F); // Import Box17
		shermanfuryModel[229].setRotationPoint(-53F, -19F, -5F);
		shermanfuryModel[229].rotateAngleZ = 0.64577182F;

		shermanfuryModel[230].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Import Box18
		shermanfuryModel[230].setRotationPoint(-56F, -19F, -12F);
		shermanfuryModel[230].rotateAngleZ = 0.20943951F;

		shermanfuryModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box19
		shermanfuryModel[231].setRotationPoint(-53F, -18F, 6F);

		shermanfuryModel[232].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box20
		shermanfuryModel[232].setRotationPoint(-55F, -18F, 6F);

		shermanfuryModel[233].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box21
		shermanfuryModel[233].setRotationPoint(-56F, -18F, 6F);

		shermanfuryModel[234].addBox(-10F, -24F, -15F, 20, 1, 30, 0F); // Import Box25
		shermanfuryModel[234].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[235].addShapeBox(-15F, -24F, -15F, 5, 1, 30, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box27
		shermanfuryModel[235].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[236].addShapeBox(10F, -24F, -15F, 5, 1, 30, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box28
		shermanfuryModel[236].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[237].addShapeBox(10F, -25F, -16F, 5, 1, 32, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Import Box31
		shermanfuryModel[237].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[238].addBox(-10F, -25F, -16F, 20, 1, 32, 0F); // Import Box32
		shermanfuryModel[238].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[239].addShapeBox(-19F, -25F, -16F, 9, 1, 32, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Import Box33
		shermanfuryModel[239].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[240].addShapeBox(-10F, -38F, -18F, 14, 13, 36, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		shermanfuryModel[240].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[241].addShapeBox(10F, -38F, -18F, 7, 13, 36, 0F, 6F, 0F, -2F, -1F, -2F, -5F, -1F, -2F, -5F, 6F, 0F, -2F, 6F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 6F, 0F, 0F); // Import Box35
		shermanfuryModel[241].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[242].addShapeBox(-21F, -31F, -14F, 11, 6, 28, 0F, 5F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 5F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -5F); // Import Box36
		shermanfuryModel[242].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[243].addShapeBox(-26F, -38F, -18F, 16, 7, 36, 0F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -9F); // Import Box37
		shermanfuryModel[243].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[244].addShapeBox(16F, -35F, -10F, 3, 7, 20, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Import Box39
		shermanfuryModel[244].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[245].addShapeBox(-12F, -40F, -12F, 14, 2, 10, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		shermanfuryModel[245].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[246].addShapeBox(-12F, -40F, -14F, 14, 2, 2, 0F, -4F, 0F, -1F, -4F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		shermanfuryModel[246].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[247].addShapeBox(-12F, -40F, -2F, 14, 2, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box49
		shermanfuryModel[247].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[248].addShapeBox(-6F, -39F, 7F, 10, 1, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		shermanfuryModel[248].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[248].rotateAngleY = -0.54105207F;

		shermanfuryModel[249].addShapeBox(-3F, -40F, 12F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		shermanfuryModel[249].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[249].rotateAngleY = -0.54105207F;

		shermanfuryModel[250].addShapeBox(-22F, -42F, -4F, 3, 4, 3, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box45
		shermanfuryModel[250].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[251].addShapeBox(-21.5F, -48F, -3.5F, 2, 6, 2, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box46
		shermanfuryModel[251].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[252].addShapeBox(-30F, -38F, -7F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		shermanfuryModel[252].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[253].addShapeBox(-30F, -38F, 6F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box48
		shermanfuryModel[253].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[254].addShapeBox(-29F, -35.5F, 5F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box49
		shermanfuryModel[254].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[255].addShapeBox(-29F, -35.5F, -6F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box50
		shermanfuryModel[255].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[256].addShapeBox(-30F, -39F, -7F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		shermanfuryModel[256].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[257].addShapeBox(-30F, -39F, 6F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		shermanfuryModel[257].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[258].addShapeBox(0F, -40F, 12F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		shermanfuryModel[258].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[258].rotateAngleY = -0.54105207F;

		shermanfuryModel[259].addShapeBox(-3F, -40.8F, 12F, 4, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box54
		shermanfuryModel[259].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[259].rotateAngleY = -0.54105207F;

		shermanfuryModel[260].addBox(-8F, -25F, 23.2F, 6, 4, 1, 0F); // Import Box55
		shermanfuryModel[260].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[260].rotateAngleX = 0.2443461F;

		shermanfuryModel[261].addBox(-8F, -25.2F, 23.3F, 1, 1, 1, 0F); // Import Box56
		shermanfuryModel[261].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[261].rotateAngleX = 0.2443461F;

		shermanfuryModel[262].addBox(-3F, -25.2F, 23.3F, 1, 1, 1, 0F); // Import Box57
		shermanfuryModel[262].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[262].rotateAngleX = 0.2443461F;

		shermanfuryModel[263].addShapeBox(-26.5F, -37F, -3F, 1, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box58
		shermanfuryModel[263].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[264].addBox(8F, -39F, -11F, 1, 2, 4, 0F); // Import Box69
		shermanfuryModel[264].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[265].addShapeBox(7F, -38F, -11F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		shermanfuryModel[265].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[266].addShapeBox(7F, -38F, 7F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		shermanfuryModel[266].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[267].addBox(8F, -39F, 7F, 1, 2, 4, 0F); // Import Box72
		shermanfuryModel[267].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[268].addShapeBox(3.5F, -41F, -0.5F, 2, 6, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box76
		shermanfuryModel[268].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[269].addShapeBox(-15.5F, -52F, 9.5F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		shermanfuryModel[269].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[269].rotateAngleY = -0.66322512F;
		shermanfuryModel[269].rotateAngleZ = -0.13962634F;

		shermanfuryModel[270].addShapeBox(-19.5F, -52F, 9.5F, 4, 2, 2, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Import Box289
		shermanfuryModel[270].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[270].rotateAngleY = -0.66322512F;
		shermanfuryModel[270].rotateAngleZ = -0.13962634F;

		shermanfuryModel[271].addShapeBox(-21.5F, -52.5F, 8.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box290
		shermanfuryModel[271].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[271].rotateAngleY = -0.66322512F;
		shermanfuryModel[271].rotateAngleZ = -0.13962634F;

		shermanfuryModel[272].addShapeBox(-21.5F, -52.5F, 11.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		shermanfuryModel[272].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[272].rotateAngleY = -0.66322512F;
		shermanfuryModel[272].rotateAngleZ = -0.13962634F;

		shermanfuryModel[273].addShapeBox(-6.5F, -51.5F, 10F, 5, 1, 1, 0F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F); // Import Box292
		shermanfuryModel[273].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[273].rotateAngleY = -0.66322512F;
		shermanfuryModel[273].rotateAngleZ = -0.13962634F;

		shermanfuryModel[274].addShapeBox(-1.5F, -51.5F, 10F, 7, 1, 1, 0F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box293
		shermanfuryModel[274].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[274].rotateAngleY = -0.66322512F;
		shermanfuryModel[274].rotateAngleZ = -0.13962634F;

		shermanfuryModel[275].addShapeBox(-12.5F, -51.8F, 8F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		shermanfuryModel[275].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[275].rotateAngleY = -0.66322512F;
		shermanfuryModel[275].rotateAngleZ = -0.13962634F;

		shermanfuryModel[276].addShapeBox(-20.5F, -52F, 9.5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		shermanfuryModel[276].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[276].rotateAngleY = -0.66322512F;
		shermanfuryModel[276].rotateAngleZ = -0.13962634F;

		shermanfuryModel[277].addShapeBox(-20.5F, -52F, 11.5F, 1, 2, 0, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box296
		shermanfuryModel[277].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[277].rotateAngleY = -0.66322512F;
		shermanfuryModel[277].rotateAngleZ = -0.13962634F;

		shermanfuryModel[278].addShapeBox(-12.5F, -51.5F, 11.5F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		shermanfuryModel[278].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[278].rotateAngleY = -0.66322512F;
		shermanfuryModel[278].rotateAngleZ = -0.13962634F;

		shermanfuryModel[279].addShapeBox(-3.5F, -50.8F, 9F, 1, 1, 2, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F); // Import Box299
		shermanfuryModel[279].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[279].rotateAngleY = -0.66322512F;
		shermanfuryModel[279].rotateAngleZ = -0.13962634F;

		shermanfuryModel[280].addBox(0.5F, -28F, -22F, 11, 4, 2, 0F); // Import Box319
		shermanfuryModel[280].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[280].rotateAngleX = -0.13962634F;
		shermanfuryModel[280].rotateAngleY = -0.20943951F;

		shermanfuryModel[281].addBox(1F, -33F, -22F, 11, 4, 2, 0F); // Import Box320
		shermanfuryModel[281].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[281].rotateAngleX = -0.13962634F;
		shermanfuryModel[281].rotateAngleY = -0.20943951F;
		shermanfuryModel[281].rotateAngleZ = -0.01745329F;

		shermanfuryModel[282].addBox(1F, -29F, 18F, 11, 4, 2, 0F); // Import Box321
		shermanfuryModel[282].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[282].rotateAngleX = 0.05235988F;
		shermanfuryModel[282].rotateAngleY = 0.20943951F;
		shermanfuryModel[282].rotateAngleZ = -0.01745329F;

		shermanfuryModel[283].addBox(0.5F, -30F, 23F, 11, 4, 2, 0F); // Import Box322
		shermanfuryModel[283].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[283].rotateAngleX = 0.2268928F;
		shermanfuryModel[283].rotateAngleY = 0.20943951F;

		shermanfuryModel[284].addBox(-11F, -23F, -34.5F, 6, 1, 6, 0F); // Import Box325
		shermanfuryModel[284].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[284].rotateAngleX = -1.43116999F;
		shermanfuryModel[284].rotateAngleY = -0.33161256F;
		shermanfuryModel[284].rotateAngleZ = -0.05235988F;

		shermanfuryModel[285].addShapeBox(-10F, -25F, -35F, 4, 2, 4, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Import Box326
		shermanfuryModel[285].setRotationPoint(0F, 0F, 0F);
		shermanfuryModel[285].rotateAngleX = -1.43116999F;
		shermanfuryModel[285].rotateAngleY = -0.33161256F;
		shermanfuryModel[285].rotateAngleZ = -0.05235988F;

		shermanfuryModel[286].addBox(-18F, -23F, -34.5F, 6, 1, 6, 0F); // Import Box327
		shermanfuryModel[286].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[286].rotateAngleX = -1.43116999F;
		shermanfuryModel[286].rotateAngleY = -0.33161256F;
		shermanfuryModel[286].rotateAngleZ = -0.05235988F;

		shermanfuryModel[287].addBox(14F, -23F, -33.5F, 6, 1, 6, 0F); // Import Box333
		shermanfuryModel[287].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[287].rotateAngleX = -1.43116999F;
		shermanfuryModel[287].rotateAngleY = 3.47320521F;
		shermanfuryModel[287].rotateAngleZ = -0.05235988F;

		shermanfuryModel[288].addBox(7F, -23F, -33.5F, 6, 1, 6, 0F); // Import Box335
		shermanfuryModel[288].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[288].rotateAngleX = -1.43116999F;
		shermanfuryModel[288].rotateAngleY = 3.47320521F;
		shermanfuryModel[288].rotateAngleZ = -0.05235988F;

		shermanfuryModel[289].addShapeBox(8F, -25F, -34F, 4, 2, 4, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Import Box336
		shermanfuryModel[289].setRotationPoint(0F, 0F, 0F);
		shermanfuryModel[289].rotateAngleX = -1.43116999F;
		shermanfuryModel[289].rotateAngleY = 3.47320521F;
		shermanfuryModel[289].rotateAngleZ = -0.05235988F;

		shermanfuryModel[290].addShapeBox(-17F, -25F, -35F, 4, 2, 4, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Import Box0
		shermanfuryModel[290].setRotationPoint(0F, 0F, 0F);
		shermanfuryModel[290].rotateAngleX = -1.43116999F;
		shermanfuryModel[290].rotateAngleY = -0.33161256F;
		shermanfuryModel[290].rotateAngleZ = -0.05235988F;

		shermanfuryModel[291].addShapeBox(15F, -25F, -34F, 4, 2, 4, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 1F, 0.4F, 0F, 1F); // Import Box1
		shermanfuryModel[291].setRotationPoint(0F, 0F, 0F);
		shermanfuryModel[291].rotateAngleX = -1.43116999F;
		shermanfuryModel[291].rotateAngleY = 3.47320521F;
		shermanfuryModel[291].rotateAngleZ = -0.05235988F;

		shermanfuryModel[292].addBox(1.5F, -31F, 26F, 1, 9, 1, 0F); // Import Box11
		shermanfuryModel[292].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[292].rotateAngleX = 0.27925268F;
		shermanfuryModel[292].rotateAngleY = 0.20943951F;

		shermanfuryModel[293].addBox(9.5F, -31F, 26F, 1, 9, 1, 0F); // Import Box12
		shermanfuryModel[293].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[293].rotateAngleX = 0.27925268F;
		shermanfuryModel[293].rotateAngleY = 0.20943951F;

		shermanfuryModel[294].addBox(9.5F, -33F, -23.8F, 1, 9, 1, 0F); // Import Box13
		shermanfuryModel[294].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[294].rotateAngleX = -0.19198622F;
		shermanfuryModel[294].rotateAngleY = -0.20943951F;

		shermanfuryModel[295].addBox(1.5F, -33F, -23.8F, 1, 9, 1, 0F); // Import Box14
		shermanfuryModel[295].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[295].rotateAngleX = -0.19198622F;
		shermanfuryModel[295].rotateAngleY = -0.20943951F;

		shermanfuryModel[296].addShapeBox(-18.5F, -44F, 8.5F, 2, 6, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box15
		shermanfuryModel[296].setRotationPoint(0F, -1F, 0F);

		shermanfuryModel[297].addShapeBox(-15.5F, -66F, 8.5F, 2, 22, 2, 0F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F); // Import Box18
		shermanfuryModel[297].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[297].rotateAngleZ = -0.06981317F;

		shermanfuryModel[298].addShapeBox(-1F, -43.3F, -10.5F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box4
		shermanfuryModel[298].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[298].rotateAngleX = -0.2268928F;
		shermanfuryModel[298].rotateAngleY = 1.37881011F;

		shermanfuryModel[299].addShapeBox(-1.5F, -41.8F, -4.7F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box5
		shermanfuryModel[299].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[299].rotateAngleX = -0.2268928F;
		shermanfuryModel[299].rotateAngleY = 1.37881011F;

		shermanfuryModel[300].addShapeBox(-0.5F, -42.8F, -4F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		shermanfuryModel[300].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[300].rotateAngleX = -0.2268928F;
		shermanfuryModel[300].rotateAngleY = 1.37881011F;

		shermanfuryModel[301].addShapeBox(-0.5F, -42.8F, -3.5F, 1, 1, 10, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box8
		shermanfuryModel[301].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[301].rotateAngleX = -0.2268928F;
		shermanfuryModel[301].rotateAngleY = 1.37881011F;

		shermanfuryModel[302].addShapeBox(-0.5F, -42.3F, -12F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		shermanfuryModel[302].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[302].rotateAngleX = -0.2268928F;
		shermanfuryModel[302].rotateAngleY = 1.37881011F;

		shermanfuryModel[303].addShapeBox(-0.5F, -42.3F, -12F, 1, 3, 1, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F); // Import Box10
		shermanfuryModel[303].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[303].rotateAngleX = -0.2268928F;
		shermanfuryModel[303].rotateAngleY = 1.37881011F;

		shermanfuryModel[304].addShapeBox(-0.5F, -44F, -4.6F, 1, 1, 1, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		shermanfuryModel[304].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[304].rotateAngleX = -0.2268928F;
		shermanfuryModel[304].rotateAngleY = 1.37881011F;

		shermanfuryModel[305].addShapeBox(-4F, -43.7F, -6F, 3, 2, 4, 0F, 0.5F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0.5F, 0F, -0.6F, 0.5F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F); // Import Box299
		shermanfuryModel[305].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[305].rotateAngleX = -0.17453293F;
		shermanfuryModel[305].rotateAngleY = 1.37881011F;

		shermanfuryModel[306].addShapeBox(-0.5F, -43.3F, -10F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		shermanfuryModel[306].setRotationPoint(0F, -1.5F, 0F);
		shermanfuryModel[306].rotateAngleX = -0.2268928F;
		shermanfuryModel[306].rotateAngleY = 1.37881011F;

		shermanfuryModel[307].addShapeBox(-0.5F, -43.3F, -10F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Import Box14
		shermanfuryModel[307].setRotationPoint(0F, -2.2F, 0F);
		shermanfuryModel[307].rotateAngleX = -0.2268928F;
		shermanfuryModel[307].rotateAngleY = 1.37881011F;

		shermanfuryModel[308].addShapeBox(0.5F, -41.8F, -4.7F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box15
		shermanfuryModel[308].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[308].rotateAngleX = -0.2268928F;
		shermanfuryModel[308].rotateAngleY = 1.37881011F;

		shermanfuryModel[309].addShapeBox(-0.5F, -40.5F, -4.7F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box16
		shermanfuryModel[309].setRotationPoint(0F, -1F, 0F);
		shermanfuryModel[309].rotateAngleX = -0.2268928F;
		shermanfuryModel[309].rotateAngleY = 1.37881011F;

		shermanfuryModel[310].addShapeBox(0F, -4F, -10F, 3, 9, 20, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F); // Import Box38
		shermanfuryModel[310].setRotationPoint(17.5F, -32.5F, 0F);

		shermanfuryModel[311].addShapeBox(-1F, -1.5F, -1.5F, 45, 3, 3, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Import Box40
		shermanfuryModel[311].setRotationPoint(17.5F, -32.5F, 0F);

		shermanfuryModel[312].addShapeBox(-1F, -2.5F, -2.5F, 9, 5, 5, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Import Box41
		shermanfuryModel[312].setRotationPoint(17.5F, -32.5F, 0F);

		shermanfuryModel[313].addShapeBox(44F, -1.5F, -1.5F, 2, 3, 3, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Import Box54
		shermanfuryModel[313].setRotationPoint(17.5F, -32.5F, 0F);

		shermanfuryModel[314].addShapeBox(46F, -1.5F, -1.5F, 5, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box55
		shermanfuryModel[314].setRotationPoint(17.5F, -32.5F, 0F);

		shermanfuryModel[315].addShapeBox(18F, -1.5F, 0.3F, 90, 30, 1, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -80F, -27F, 0F, -80F, -27F, 0F, 0F, -27F, 0F); // Import Box343
		shermanfuryModel[315].setRotationPoint(17.5F, -32.5F, 0F);

		shermanfuryModel[316].addShapeBox(18F, -1.5F, -1.3F, 90, 30, 1, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, -80F, -27F, 0F, -80F, -27F, 0F, 0F, -27F, 0F); // Import Box345
		shermanfuryModel[316].setRotationPoint(17.5F, -32.5F, 0F);

		shermanfuryModel[317].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box268
		shermanfuryModel[317].setRotationPoint(45.5F, -5.2F, -25F);

		shermanfuryModel[318].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box269
		shermanfuryModel[318].setRotationPoint(46F, -4.5F, -25F);
		shermanfuryModel[318].rotateAngleZ = 3.71755131F;

		shermanfuryModel[319].addBox(0F, 0F, 0F, 17, 1, 11, 0F); // Import Box270
		shermanfuryModel[319].setRotationPoint(27F, -7F, -25F);

		shermanfuryModel[320].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box271
		shermanfuryModel[320].setRotationPoint(27F, -6F, -25F);
		shermanfuryModel[320].rotateAngleZ = 3.4906585F;

		shermanfuryModel[321].addBox(0F, 0F, 0F, 8, 1, 11, 0F); // Import Box272
		shermanfuryModel[321].setRotationPoint(17.5F, -7.6F, -25F);

		shermanfuryModel[322].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box273
		shermanfuryModel[322].setRotationPoint(17.5F, -6.6F, -25F);
		shermanfuryModel[322].rotateAngleZ = 3.85717765F;

		shermanfuryModel[323].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box274
		shermanfuryModel[323].setRotationPoint(14.5F, -8.2F, -25F);
		shermanfuryModel[323].rotateAngleZ = -3.66519143F;

		shermanfuryModel[324].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box275
		shermanfuryModel[324].setRotationPoint(-7F, -7.6F, -25F);

		shermanfuryModel[325].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box276
		shermanfuryModel[325].setRotationPoint(13.5F, -8.6F, -25F);

		shermanfuryModel[326].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box277
		shermanfuryModel[326].setRotationPoint(-7.5F, -6.6F, -25F);
		shermanfuryModel[326].rotateAngleZ = 3.85717765F;

		shermanfuryModel[327].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box278
		shermanfuryModel[327].setRotationPoint(-11.5F, -8.6F, -25F);

		shermanfuryModel[328].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box279
		shermanfuryModel[328].setRotationPoint(-10.5F, -8.2F, -25F);
		shermanfuryModel[328].rotateAngleZ = -3.66519143F;

		shermanfuryModel[329].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box280
		shermanfuryModel[329].setRotationPoint(-32F, -7.6F, -25F);

		shermanfuryModel[330].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box281
		shermanfuryModel[330].setRotationPoint(-32.5F, -6.6F, -25F);
		shermanfuryModel[330].rotateAngleZ = 3.85717765F;

		shermanfuryModel[331].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box282
		shermanfuryModel[331].setRotationPoint(-36.5F, -8.6F, -25F);

		shermanfuryModel[332].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box283
		shermanfuryModel[332].setRotationPoint(-35.5F, -8.2F, -25F);
		shermanfuryModel[332].rotateAngleZ = -3.66519143F;

		shermanfuryModel[333].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box284
		shermanfuryModel[333].setRotationPoint(-51F, -7F, -25F);
		shermanfuryModel[333].rotateAngleZ = -0.05235988F;

		shermanfuryModel[334].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Import Box285
		shermanfuryModel[334].setRotationPoint(-51F, -6.2F, -25F);
		shermanfuryModel[334].rotateAngleZ = -3.7350046F;

		shermanfuryModel[335].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box286
		shermanfuryModel[335].setRotationPoint(-54.8F, -4.8F, -25F);

		shermanfuryModel[336].addShapeBox(0F, -1F, 0F, 14, 1, 11, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		shermanfuryModel[336].setRotationPoint(-55F, 2F, -25F);
		shermanfuryModel[336].rotateAngleZ = 0.48869219F;

		shermanfuryModel[337].addBox(0F, 0F, 0F, 77, 1, 11, 0F); // Import Box288
		shermanfuryModel[337].setRotationPoint(-42F, 8F, -25F);

		shermanfuryModel[338].addShapeBox(0F, -1F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F); // Import Box289
		shermanfuryModel[338].setRotationPoint(35F, 9F, -25F);
		shermanfuryModel[338].rotateAngleZ = -0.54105207F;

		shermanfuryModel[339].addBox(0F, 0F, 0F, 17, 1, 11, 0F); // Import Box244
		shermanfuryModel[339].setRotationPoint(27F, -7F, 14F);

		shermanfuryModel[340].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box245
		shermanfuryModel[340].setRotationPoint(27F, -6F, 14F);
		shermanfuryModel[340].rotateAngleZ = 3.4906585F;

		shermanfuryModel[341].addBox(0F, 0F, 0F, 8, 1, 11, 0F); // Import Box246
		shermanfuryModel[341].setRotationPoint(17.5F, -7.6F, 14F);

		shermanfuryModel[342].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box247
		shermanfuryModel[342].setRotationPoint(17.5F, -6.6F, 14F);
		shermanfuryModel[342].rotateAngleZ = 3.85717765F;

		shermanfuryModel[343].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box248
		shermanfuryModel[343].setRotationPoint(13.5F, -8.6F, 14F);

		shermanfuryModel[344].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box249
		shermanfuryModel[344].setRotationPoint(14.5F, -8.2F, 14F);
		shermanfuryModel[344].rotateAngleZ = -3.66519143F;

		shermanfuryModel[345].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box250
		shermanfuryModel[345].setRotationPoint(-7.5F, -6.6F, 14F);
		shermanfuryModel[345].rotateAngleZ = 3.85717765F;

		shermanfuryModel[346].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box252
		shermanfuryModel[346].setRotationPoint(-11.5F, -8.6F, 14F);

		shermanfuryModel[347].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box253
		shermanfuryModel[347].setRotationPoint(-32.5F, -6.6F, 14F);
		shermanfuryModel[347].rotateAngleZ = 3.85717765F;

		shermanfuryModel[348].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box255
		shermanfuryModel[348].setRotationPoint(-36.5F, -8.6F, 14F);

		shermanfuryModel[349].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box256
		shermanfuryModel[349].setRotationPoint(-7F, -7.6F, 14F);

		shermanfuryModel[350].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box257
		shermanfuryModel[350].setRotationPoint(-32F, -7.6F, 14F);

		shermanfuryModel[351].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box258
		shermanfuryModel[351].setRotationPoint(-10.5F, -8.2F, 14F);
		shermanfuryModel[351].rotateAngleZ = -3.66519143F;

		shermanfuryModel[352].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import Box259
		shermanfuryModel[352].setRotationPoint(-51F, -7F, 14F);
		shermanfuryModel[352].rotateAngleZ = -0.05235988F;

		shermanfuryModel[353].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box260
		shermanfuryModel[353].setRotationPoint(-35.5F, -8.2F, 14F);
		shermanfuryModel[353].rotateAngleZ = -3.66519143F;

		shermanfuryModel[354].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box261
		shermanfuryModel[354].setRotationPoint(46F, -4.5F, 14F);
		shermanfuryModel[354].rotateAngleZ = 3.71755131F;

		shermanfuryModel[355].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box262
		shermanfuryModel[355].setRotationPoint(45.5F, -5.2F, 14F);

		shermanfuryModel[356].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Import Box263
		shermanfuryModel[356].setRotationPoint(-51F, -6.2F, 14F);
		shermanfuryModel[356].rotateAngleZ = -3.7350046F;

		shermanfuryModel[357].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box264
		shermanfuryModel[357].setRotationPoint(-54.8F, -4.8F, 14F);

		shermanfuryModel[358].addBox(0F, 0F, 0F, 77, 1, 11, 0F); // Import Box265
		shermanfuryModel[358].setRotationPoint(-42F, 8F, 14F);

		shermanfuryModel[359].addShapeBox(0F, -1F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F); // Import Box266
		shermanfuryModel[359].setRotationPoint(35F, 9F, 14F);
		shermanfuryModel[359].rotateAngleZ = -0.54105207F;

		shermanfuryModel[360].addShapeBox(0F, -1F, 0F, 14, 1, 11, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box267
		shermanfuryModel[360].setRotationPoint(-55F, 2F, 14F);
		shermanfuryModel[360].rotateAngleZ = 0.48869219F;

		shermanfuryModel[361].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0F); // Import Box276
		shermanfuryModel[361].setRotationPoint(43F, -13F, 5F);
		shermanfuryModel[361].rotateAngleZ = -2.67035376F;

		shermanfuryModel[362].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, -10F, 0F, 0F); // Import Box277
		shermanfuryModel[362].setRotationPoint(36.8F, -2.2F, 5F);
		shermanfuryModel[362].rotateAngleZ = -1.09955743F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 363; i++)
		{
			shermanfuryModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo shermanfuryModel[];
}