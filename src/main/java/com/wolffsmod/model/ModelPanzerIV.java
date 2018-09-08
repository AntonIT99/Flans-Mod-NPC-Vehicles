//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Panzer
// Model Creator:
// Created on:23.08.2018 - 01:28:25
// Last changed on: 23.08.2018 - 01:28:25

package com.wolffsmod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPanzerIV extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelPanzerIV()
	{
		panzerivModel = new ModelRendererTurbo[405];
		panzerivModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		panzerivModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box2
		panzerivModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box3
		panzerivModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box4
		panzerivModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box5
		panzerivModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box6
		panzerivModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box7
		panzerivModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box8
		panzerivModel[8] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box9
		panzerivModel[9] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box10
		panzerivModel[10] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box11
		panzerivModel[11] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box12
		panzerivModel[12] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box13
		panzerivModel[13] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box14
		panzerivModel[14] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box17
		panzerivModel[15] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box18
		panzerivModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box21
		panzerivModel[17] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box22
		panzerivModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box25
		panzerivModel[19] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box26
		panzerivModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box29
		panzerivModel[21] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box30
		panzerivModel[22] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box33
		panzerivModel[23] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box34
		panzerivModel[24] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box35
		panzerivModel[25] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box36
		panzerivModel[26] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box37
		panzerivModel[27] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box38
		panzerivModel[28] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Box39
		panzerivModel[29] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box40
		panzerivModel[30] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box75
		panzerivModel[31] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box77
		panzerivModel[32] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box78
		panzerivModel[33] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box79
		panzerivModel[34] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box80
		panzerivModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box81
		panzerivModel[36] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box82
		panzerivModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box83
		panzerivModel[38] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box84
		panzerivModel[39] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import Box85
		panzerivModel[40] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box86
		panzerivModel[41] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box87
		panzerivModel[42] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box88
		panzerivModel[43] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import Box89
		panzerivModel[44] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box90
		panzerivModel[45] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Import Box91
		panzerivModel[46] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Import Box92
		panzerivModel[47] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box93
		panzerivModel[48] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Import Box94
		panzerivModel[49] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box135
		panzerivModel[50] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box136
		panzerivModel[51] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Import Box138
		panzerivModel[52] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box141
		panzerivModel[53] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box142
		panzerivModel[54] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box145
		panzerivModel[55] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import Box149
		panzerivModel[56] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box150
		panzerivModel[57] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import Box151
		panzerivModel[58] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Box152
		panzerivModel[59] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box153
		panzerivModel[60] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Import Box154
		panzerivModel[61] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import Box155
		panzerivModel[62] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Import Box156
		panzerivModel[63] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Import Box157
		panzerivModel[64] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Import Box158
		panzerivModel[65] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box159
		panzerivModel[66] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box160
		panzerivModel[67] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Import Box161
		panzerivModel[68] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box162
		panzerivModel[69] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import Box163
		panzerivModel[70] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import Box164
		panzerivModel[71] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import Box165
		panzerivModel[72] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import Box166
		panzerivModel[73] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box167
		panzerivModel[74] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Import Box168
		panzerivModel[75] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Import Box169
		panzerivModel[76] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box170
		panzerivModel[77] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import Box171
		panzerivModel[78] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box172
		panzerivModel[79] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box173
		panzerivModel[80] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Import Box174
		panzerivModel[81] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Import Box175
		panzerivModel[82] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Import Box176
		panzerivModel[83] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Import Box177
		panzerivModel[84] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Import Box178
		panzerivModel[85] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box179
		panzerivModel[86] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Import Box180
		panzerivModel[87] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Import Box181
		panzerivModel[88] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Import Box182
		panzerivModel[89] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Import Box183
		panzerivModel[90] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Import Box184
		panzerivModel[91] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Import Box185
		panzerivModel[92] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Import Box186
		panzerivModel[93] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box187
		panzerivModel[94] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box188
		panzerivModel[95] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import Box189
		panzerivModel[96] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Import Box190
		panzerivModel[97] = new ModelRendererTurbo(this, 361, 113, textureX, textureY); // Import Box191
		panzerivModel[98] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Import Box192
		panzerivModel[99] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box194
		panzerivModel[100] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box195
		panzerivModel[101] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Import Box196
		panzerivModel[102] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box197
		panzerivModel[103] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import Box198
		panzerivModel[104] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import Box199
		panzerivModel[105] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import Box200
		panzerivModel[106] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import Box201
		panzerivModel[107] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Import Box202
		panzerivModel[108] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Import Box203
		panzerivModel[109] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Import Box204
		panzerivModel[110] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Import Box205
		panzerivModel[111] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Import Box215
		panzerivModel[112] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import Box216
		panzerivModel[113] = new ModelRendererTurbo(this, 137, 105, textureX, textureY); // Import Box217
		panzerivModel[114] = new ModelRendererTurbo(this, 465, 145, textureX, textureY); // Import Box218
		panzerivModel[115] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Import Box290
		panzerivModel[116] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Import Box378
		panzerivModel[117] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Import Box379
		panzerivModel[118] = new ModelRendererTurbo(this, 489, 233, textureX, textureY); // Import Box380
		panzerivModel[119] = new ModelRendererTurbo(this, 417, 385, textureX, textureY); // Import Box383
		panzerivModel[120] = new ModelRendererTurbo(this, 465, 385, textureX, textureY); // Import Box384
		panzerivModel[121] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Import Box385
		panzerivModel[122] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Box386
		panzerivModel[123] = new ModelRendererTurbo(this, 209, 401, textureX, textureY); // Import Box387
		panzerivModel[124] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Import Box390
		panzerivModel[125] = new ModelRendererTurbo(this, 73, 401, textureX, textureY); // Import Box392
		panzerivModel[126] = new ModelRendererTurbo(this, 345, 409, textureX, textureY); // Import Box393
		panzerivModel[127] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Import Box46
		panzerivModel[128] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Import Box47
		panzerivModel[129] = new ModelRendererTurbo(this, 209, 369, textureX, textureY); // Import Box185
		panzerivModel[130] = new ModelRendererTurbo(this, 89, 329, textureX, textureY); // Import Box45
		panzerivModel[131] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Import Box9
		panzerivModel[132] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Import Box10
		panzerivModel[133] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Import Box11
		panzerivModel[134] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Import Box12
		panzerivModel[135] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Import Box13
		panzerivModel[136] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Import Box14
		panzerivModel[137] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Import Box15
		panzerivModel[138] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box16
		panzerivModel[139] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box17
		panzerivModel[140] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Import Box28
		panzerivModel[141] = new ModelRendererTurbo(this, 241, 241, textureX, textureY); // Import Box29
		panzerivModel[142] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Import Box30
		panzerivModel[143] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Import Box31
		panzerivModel[144] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Import Box32
		panzerivModel[145] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Import Box33
		panzerivModel[146] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Import Box34
		panzerivModel[147] = new ModelRendererTurbo(this, 449, 401, textureX, textureY); // Import Box35
		panzerivModel[148] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box0
		panzerivModel[149] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box26
		panzerivModel[150] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box27
		panzerivModel[151] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box28
		panzerivModel[152] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box29
		panzerivModel[153] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box30
		panzerivModel[154] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box31
		panzerivModel[155] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box32
		panzerivModel[156] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box33
		panzerivModel[157] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box34
		panzerivModel[158] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box35
		panzerivModel[159] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box36
		panzerivModel[160] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box37
		panzerivModel[161] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box38
		panzerivModel[162] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box39
		panzerivModel[163] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box40
		panzerivModel[164] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box41
		panzerivModel[165] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box42
		panzerivModel[166] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box43
		panzerivModel[167] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box44
		panzerivModel[168] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box50
		panzerivModel[169] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box51
		panzerivModel[170] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box52
		panzerivModel[171] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box53
		panzerivModel[172] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box54
		panzerivModel[173] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box55
		panzerivModel[174] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box56
		panzerivModel[175] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box57
		panzerivModel[176] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box58
		panzerivModel[177] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box59
		panzerivModel[178] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box60
		panzerivModel[179] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box61
		panzerivModel[180] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box62
		panzerivModel[181] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box63
		panzerivModel[182] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box64
		panzerivModel[183] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box65
		panzerivModel[184] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box66
		panzerivModel[185] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box67
		panzerivModel[186] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box68
		panzerivModel[187] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box69
		panzerivModel[188] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box70
		panzerivModel[189] = new ModelRendererTurbo(this, 185, 321, textureX, textureY); // Import Box1
		panzerivModel[190] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Import Box2
		panzerivModel[191] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Import Box53
		panzerivModel[192] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box6
		panzerivModel[193] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box7
		panzerivModel[194] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Import Box8
		panzerivModel[195] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import Box9
		panzerivModel[196] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box10
		panzerivModel[197] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import Box11
		panzerivModel[198] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Import Box12
		panzerivModel[199] = new ModelRendererTurbo(this, 105, 425, textureX, textureY); // Import Box13
		panzerivModel[200] = new ModelRendererTurbo(this, 161, 425, textureX, textureY); // Import Box14
		panzerivModel[201] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import Box32
		panzerivModel[202] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Import Box33
		panzerivModel[203] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box34
		panzerivModel[204] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Import Box35
		panzerivModel[205] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Import Box1
		panzerivModel[206] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box1
		panzerivModel[207] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box2
		panzerivModel[208] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box3
		panzerivModel[209] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box4
		panzerivModel[210] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box5
		panzerivModel[211] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box6
		panzerivModel[212] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box7
		panzerivModel[213] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box8
		panzerivModel[214] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box9
		panzerivModel[215] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box10
		panzerivModel[216] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box11
		panzerivModel[217] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box12
		panzerivModel[218] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box13
		panzerivModel[219] = new ModelRendererTurbo(this, 321, 321, textureX, textureY); // Import Box14
		panzerivModel[220] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box15
		panzerivModel[221] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box16
		panzerivModel[222] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box17
		panzerivModel[223] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box18
		panzerivModel[224] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box19
		panzerivModel[225] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box25
		panzerivModel[226] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box2
		panzerivModel[227] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box3
		panzerivModel[228] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import Box1
		panzerivModel[229] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import Box2
		panzerivModel[230] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box3
		panzerivModel[231] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box4
		panzerivModel[232] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box5
		panzerivModel[233] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box6
		panzerivModel[234] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import Box24
		panzerivModel[235] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box25
		panzerivModel[236] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box26
		panzerivModel[237] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import Box27
		panzerivModel[238] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box28
		panzerivModel[239] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box29
		panzerivModel[240] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import Box34
		panzerivModel[241] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import Box50
		panzerivModel[242] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import Box51
		panzerivModel[243] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box52
		panzerivModel[244] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box53
		panzerivModel[245] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box54
		panzerivModel[246] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box55
		panzerivModel[247] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box57
		panzerivModel[248] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box58
		panzerivModel[249] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import Box59
		panzerivModel[250] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box60
		panzerivModel[251] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box61
		panzerivModel[252] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import Box70
		panzerivModel[253] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import Box71
		panzerivModel[254] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box72
		panzerivModel[255] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box73
		panzerivModel[256] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box74
		panzerivModel[257] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box75
		panzerivModel[258] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import Box76
		panzerivModel[259] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box77
		panzerivModel[260] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box78
		panzerivModel[261] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box79
		panzerivModel[262] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box80
		panzerivModel[263] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import Box81
		panzerivModel[264] = new ModelRendererTurbo(this, 125, 490, textureX, textureY); // Import Box82
		panzerivModel[265] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import Box83
		panzerivModel[266] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box84
		panzerivModel[267] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box85
		panzerivModel[268] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box86
		panzerivModel[269] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box87
		panzerivModel[270] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box88
		panzerivModel[271] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box89
		panzerivModel[272] = new ModelRendererTurbo(this, 150, 490, textureX, textureY); // Import Box90
		panzerivModel[273] = new ModelRendererTurbo(this, 177, 490, textureX, textureY); // Import Box91
		panzerivModel[274] = new ModelRendererTurbo(this, 187, 490, textureX, textureY); // Import Box92
		panzerivModel[275] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape93
		panzerivModel[276] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape94
		panzerivModel[277] = new ModelRendererTurbo(this, 41, 241, textureX, textureY); // Import Box96
		panzerivModel[278] = new ModelRendererTurbo(this, 337, 113, textureX, textureY); // Import Box59
		panzerivModel[279] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Import Box188
		panzerivModel[280] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Import Box66
		panzerivModel[281] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Import Box68
		panzerivModel[282] = new ModelRendererTurbo(this, 369, 305, textureX, textureY); // Import Box64
		panzerivModel[283] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Import Box67
		panzerivModel[284] = new ModelRendererTurbo(this, 169, 321, textureX, textureY); // Import Box73
		panzerivModel[285] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Import Box60
		panzerivModel[286] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Import Box74
		panzerivModel[287] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import Box162
		panzerivModel[288] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Import Box61
		panzerivModel[289] = new ModelRendererTurbo(this, 393, 345, textureX, textureY); // Import Box62
		panzerivModel[290] = new ModelRendererTurbo(this, 449, 305, textureX, textureY); // Import Box161
		panzerivModel[291] = new ModelRendererTurbo(this, 65, 361, textureX, textureY); // Import Box57
		panzerivModel[292] = new ModelRendererTurbo(this, 137, 321, textureX, textureY); // Import Box55
		panzerivModel[293] = new ModelRendererTurbo(this, 225, 353, textureX, textureY); // Import Box56
		panzerivModel[294] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Import Box72
		panzerivModel[295] = new ModelRendererTurbo(this, 121, 361, textureX, textureY); // Import Box71
		panzerivModel[296] = new ModelRendererTurbo(this, 65, 329, textureX, textureY); // Import Box75
		panzerivModel[297] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Import Box74
		panzerivModel[298] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Import Box214
		panzerivModel[299] = new ModelRendererTurbo(this, 265, 361, textureX, textureY); // Import Box218
		panzerivModel[300] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Import Box215
		panzerivModel[301] = new ModelRendererTurbo(this, 185, 369, textureX, textureY); // Import Box217
		panzerivModel[302] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Import Box219
		panzerivModel[303] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Import Box76
		panzerivModel[304] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); // Import Box216
		panzerivModel[305] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Import Box176
		panzerivModel[306] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import Box177
		panzerivModel[307] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Import Box178
		panzerivModel[308] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box181
		panzerivModel[309] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Import Box180
		panzerivModel[310] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box179
		panzerivModel[311] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Import Box388
		panzerivModel[312] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Import Box389
		panzerivModel[313] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Import Box391
		panzerivModel[314] = new ModelRendererTurbo(this, 321, 329, textureX, textureY); // Import Box394
		panzerivModel[315] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Import Box395
		panzerivModel[316] = new ModelRendererTurbo(this, 121, 401, textureX, textureY); // Import Box397
		panzerivModel[317] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Import Box398
		panzerivModel[318] = new ModelRendererTurbo(this, 489, 353, textureX, textureY); // Import Box0
		panzerivModel[319] = new ModelRendererTurbo(this, 33, 377, textureX, textureY); // Import Box1
		panzerivModel[320] = new ModelRendererTurbo(this, 393, 417, textureX, textureY); // Import Box2
		panzerivModel[321] = new ModelRendererTurbo(this, 441, 417, textureX, textureY); // Import Box4
		panzerivModel[322] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Import Box7
		panzerivModel[323] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import Box8
		panzerivModel[324] = new ModelRendererTurbo(this, 457, 329, textureX, textureY); // Import Box18
		panzerivModel[325] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Import Box23
		panzerivModel[326] = new ModelRendererTurbo(this, 225, 337, textureX, textureY); // Import Box24
		panzerivModel[327] = new ModelRendererTurbo(this, 337, 209, textureX, textureY); // Import Box25
		panzerivModel[328] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Import Box26
		panzerivModel[329] = new ModelRendererTurbo(this, 65, 353, textureX, textureY); // Import Box27
		panzerivModel[330] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Import Box0
		panzerivModel[331] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Import Box3
		panzerivModel[332] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import Box15
		panzerivModel[333] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import Box16
		panzerivModel[334] = new ModelRendererTurbo(this, 249, 193, textureX, textureY); // Import Box29
		panzerivModel[335] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box30
		panzerivModel[336] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box31
		panzerivModel[337] = new ModelRendererTurbo(this, 377, 433, textureX, textureY); // Import Box36
		panzerivModel[338] = new ModelRendererTurbo(this, 73, 433, textureX, textureY); // Import Box37
		panzerivModel[339] = new ModelRendererTurbo(this, 145, 409, textureX, textureY); // Import Box40
		panzerivModel[340] = new ModelRendererTurbo(this, 417, 433, textureX, textureY); // Import Box41
		panzerivModel[341] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import Box0
		panzerivModel[342] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Import Box1
		panzerivModel[343] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Import Box77
		panzerivModel[344] = new ModelRendererTurbo(this, 473, 313, textureX, textureY); // Import Box64
		panzerivModel[345] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box203
		panzerivModel[346] = new ModelRendererTurbo(this, 41, 129, textureX, textureY); // Import Box67
		panzerivModel[347] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box204
		panzerivModel[348] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Import Box63
		panzerivModel[349] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box68
		panzerivModel[350] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Import Box246
		panzerivModel[351] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box248
		panzerivModel[352] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box247
		panzerivModel[353] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Import Box245
		panzerivModel[354] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import Box249
		panzerivModel[355] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Import Box250
		panzerivModel[356] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Import Box237
		panzerivModel[357] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Import Box238
		panzerivModel[358] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box239
		panzerivModel[359] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box242
		panzerivModel[360] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box244
		panzerivModel[361] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box243
		panzerivModel[362] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Import Shape6
		panzerivModel[363] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Import Shape19
		panzerivModel[364] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape0
		panzerivModel[365] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape7
		panzerivModel[366] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape30
		panzerivModel[367] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape31
		panzerivModel[368] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape33
		panzerivModel[369] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape48
		panzerivModel[370] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape49
		panzerivModel[371] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape56
		panzerivModel[372] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Import Shape17
		panzerivModel[373] = new ModelRendererTurbo(this, 270, 450, textureX, textureY); // Import Shape18
		panzerivModel[374] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape62
		panzerivModel[375] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape63
		panzerivModel[376] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape64
		panzerivModel[377] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape65
		panzerivModel[378] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape66
		panzerivModel[379] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape67
		panzerivModel[380] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape68
		panzerivModel[381] = new ModelRendererTurbo(this, 235, 451, textureX, textureY); // Import Shape69
		panzerivModel[382] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box281
		panzerivModel[383] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Import Box282
		panzerivModel[384] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Import Box283
		panzerivModel[385] = new ModelRendererTurbo(this, 393, 209, textureX, textureY); // Import Box284
		panzerivModel[386] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Import Box285
		panzerivModel[387] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Import Box286
		panzerivModel[388] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Import Box287
		panzerivModel[389] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Import Box288
		panzerivModel[390] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box289
		panzerivModel[391] = new ModelRendererTurbo(this, 217, 241, textureX, textureY); // Import Box291
		panzerivModel[392] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Import Box292
		panzerivModel[393] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Import Box293
		panzerivModel[394] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Import Box294
		panzerivModel[395] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Import Box295
		panzerivModel[396] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Import Box296
		panzerivModel[397] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Import Box297
		panzerivModel[398] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Import Box298
		panzerivModel[399] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Import Box299
		panzerivModel[400] = new ModelRendererTurbo(this, 169, 369, textureX, textureY); // Import Box17
		panzerivModel[401] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Import Box18
		panzerivModel[402] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Import Box19
		panzerivModel[403] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box21
		panzerivModel[404] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Import Box0

		panzerivModel[0].addShapeBox(0F, 0F, 0F, 18, 15, 42, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		panzerivModel[0].setRotationPoint(43F, -16F, -21F);

		panzerivModel[1].addShapeBox(6F, -1F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		panzerivModel[1].setRotationPoint(43F, -16F, -16F);
		panzerivModel[1].rotateAngleZ = 0.3217497F;

		panzerivModel[2].addShapeBox(9F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box3
		panzerivModel[2].setRotationPoint(43F, -16F, -16F);
		panzerivModel[2].rotateAngleZ = 0.3217497F;

		panzerivModel[3].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		panzerivModel[3].setRotationPoint(43F, -16F, -16F);
		panzerivModel[3].rotateAngleZ = 0.3217497F;

		panzerivModel[4].addShapeBox(14F, -0.5F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		panzerivModel[4].setRotationPoint(43F, -16F, 13F);
		panzerivModel[4].rotateAngleZ = 0.3217497F;

		panzerivModel[5].addShapeBox(6F, -1F, 0F, 3, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		panzerivModel[5].setRotationPoint(43F, -16F, 13F);
		panzerivModel[5].rotateAngleZ = 0.3217497F;

		panzerivModel[6].addShapeBox(9F, -1F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box7
		panzerivModel[6].setRotationPoint(43F, -16F, 13F);
		panzerivModel[6].rotateAngleZ = 0.3217497F;

		panzerivModel[7].addShapeBox(3F, -0.2F, 0F, 11, 1, 21, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		panzerivModel[7].setRotationPoint(43F, -16F, -9F);
		panzerivModel[7].rotateAngleZ = 0.3217497F;

		panzerivModel[8].addShapeBox(4F, -1F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		panzerivModel[8].setRotationPoint(43F, -16F, -9F);
		panzerivModel[8].rotateAngleZ = 0.3217497F;

		panzerivModel[9].addShapeBox(9F, -1F, 1F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		panzerivModel[9].setRotationPoint(43F, -16F, -9F);
		panzerivModel[9].rotateAngleZ = 0.3217497F;

		panzerivModel[10].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		panzerivModel[10].setRotationPoint(43F, -16F, -8F);
		panzerivModel[10].rotateAngleZ = 0.3217497F;

		panzerivModel[11].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box12
		panzerivModel[11].setRotationPoint(43F, -16F, -6F);
		panzerivModel[11].rotateAngleZ = 0.3217497F;

		panzerivModel[12].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box13
		panzerivModel[12].setRotationPoint(43F, -16F, -3F);
		panzerivModel[12].rotateAngleZ = 0.3217497F;

		panzerivModel[13].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		panzerivModel[13].setRotationPoint(43F, -16F, -5F);
		panzerivModel[13].rotateAngleZ = 0.3217497F;

		panzerivModel[14].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box17
		panzerivModel[14].setRotationPoint(43F, -16F, 0F);
		panzerivModel[14].rotateAngleZ = 0.3217497F;

		panzerivModel[15].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		panzerivModel[15].setRotationPoint(43F, -16F, -2F);
		panzerivModel[15].rotateAngleZ = 0.3217497F;

		panzerivModel[16].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box21
		panzerivModel[16].setRotationPoint(43F, -16F, 3F);
		panzerivModel[16].rotateAngleZ = 0.3217497F;

		panzerivModel[17].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		panzerivModel[17].setRotationPoint(43F, -16F, 1F);
		panzerivModel[17].rotateAngleZ = 0.3217497F;

		panzerivModel[18].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box25
		panzerivModel[18].setRotationPoint(43F, -16F, 6F);
		panzerivModel[18].rotateAngleZ = 0.3217497F;

		panzerivModel[19].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		panzerivModel[19].setRotationPoint(43F, -16F, 4F);
		panzerivModel[19].rotateAngleZ = 0.3217497F;

		panzerivModel[20].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box29
		panzerivModel[20].setRotationPoint(43F, -16F, 9F);
		panzerivModel[20].rotateAngleZ = 0.3217497F;

		panzerivModel[21].addShapeBox(3.5F, -1.5F, 1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		panzerivModel[21].setRotationPoint(43F, -16F, 7F);
		panzerivModel[21].rotateAngleZ = 0.3217497F;

		panzerivModel[22].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		panzerivModel[22].setRotationPoint(43F, -16F, 7F);
		panzerivModel[22].rotateAngleZ = 0.3217497F;

		panzerivModel[23].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		panzerivModel[23].setRotationPoint(43F, -16F, 4F);
		panzerivModel[23].rotateAngleZ = 0.3217497F;

		panzerivModel[24].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		panzerivModel[24].setRotationPoint(43F, -16F, 1F);
		panzerivModel[24].rotateAngleZ = 0.3217497F;

		panzerivModel[25].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box36
		panzerivModel[25].setRotationPoint(43F, -16F, -2F);
		panzerivModel[25].rotateAngleZ = 0.3217497F;

		panzerivModel[26].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		panzerivModel[26].setRotationPoint(43F, -16F, -5F);
		panzerivModel[26].rotateAngleZ = 0.3217497F;

		panzerivModel[27].addShapeBox(7F, -2.5F, 1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		panzerivModel[27].setRotationPoint(43F, -16F, -8F);
		panzerivModel[27].rotateAngleZ = 0.3217497F;

		panzerivModel[28].addShapeBox(0F, 0F, 0F, 89, 18, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		panzerivModel[28].setRotationPoint(-46F, -15.5F, -21F);

		panzerivModel[29].addShapeBox(0F, 0F, 0F, 16, 3, 42, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, 0.5F, 0F); // Import Box40
		panzerivModel[29].setRotationPoint(43F, -1F, -21F);

		panzerivModel[30].addShapeBox(0F, 0F, 0F, 30, 3, 54, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		panzerivModel[30].setRotationPoint(-17F, -18.5F, -27F);

		panzerivModel[31].addShapeBox(0F, 0F, 0F, 80, 9, 50, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		panzerivModel[31].setRotationPoint(-46F, -24.5F, -25F);

		panzerivModel[32].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box78
		panzerivModel[32].setRotationPoint(-37F, -26.5F, -7F);

		panzerivModel[33].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		panzerivModel[33].setRotationPoint(-35F, -25F, 9F);

		panzerivModel[34].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		panzerivModel[34].setRotationPoint(-35F, -25F, 18F);

		panzerivModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box81
		panzerivModel[35].setRotationPoint(-36F, -25F, 9F);

		panzerivModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box82
		panzerivModel[36].setRotationPoint(-22F, -25F, 9F);

		panzerivModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		panzerivModel[37].setRotationPoint(-25F, -24.7F, 10F);

		panzerivModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		panzerivModel[38].setRotationPoint(-28F, -24.7F, 10F);

		panzerivModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		panzerivModel[39].setRotationPoint(-31F, -24.7F, 10F);

		panzerivModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		panzerivModel[40].setRotationPoint(-34F, -24.7F, 10F);

		panzerivModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box87
		panzerivModel[41].setRotationPoint(-37F, -24.7F, -15F);

		panzerivModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		panzerivModel[42].setRotationPoint(-34F, -24.7F, -15F);

		panzerivModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box89
		panzerivModel[43].setRotationPoint(-31F, -24.7F, -15F);

		panzerivModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		panzerivModel[44].setRotationPoint(-28F, -24.7F, -15F);

		panzerivModel[45].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box91
		panzerivModel[45].setRotationPoint(-38F, -25F, -16F);

		panzerivModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		panzerivModel[46].setRotationPoint(-38F, -25F, -7F);

		panzerivModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box93
		panzerivModel[47].setRotationPoint(-39F, -25F, -16F);

		panzerivModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box94
		panzerivModel[48].setRotationPoint(-25F, -25F, -16F);

		panzerivModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Import Box135
		panzerivModel[49].setRotationPoint(-15.5F, -24.5F, -34F);

		panzerivModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Import Box136
		panzerivModel[50].setRotationPoint(6.5F, -24.5F, -34F);

		panzerivModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box138
		panzerivModel[51].setRotationPoint(-15.5F, -24.5F, 22F);

		panzerivModel[52].addShapeBox(0F, 0F, 0F, 22, 1, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box141
		panzerivModel[52].setRotationPoint(-15F, -19.5F, 26F);

		panzerivModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box142
		panzerivModel[53].setRotationPoint(6.5F, -24.5F, 22F);

		panzerivModel[54].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box145
		panzerivModel[54].setRotationPoint(3F, -23.5F, 26F);

		panzerivModel[55].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box149
		panzerivModel[55].setRotationPoint(6F, -25.5F, -34F);

		panzerivModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box150
		panzerivModel[56].setRotationPoint(3F, -24.5F, 26F);

		panzerivModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		panzerivModel[57].setRotationPoint(0F, -24.5F, 26F);

		panzerivModel[58].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box152
		panzerivModel[58].setRotationPoint(0F, -23.5F, 26F);

		panzerivModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box153
		panzerivModel[59].setRotationPoint(-3F, -24.5F, 26F);

		panzerivModel[60].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box154
		panzerivModel[60].setRotationPoint(-3F, -23.5F, 26F);

		panzerivModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box155
		panzerivModel[61].setRotationPoint(-6F, -24.5F, 26F);

		panzerivModel[62].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box156
		panzerivModel[62].setRotationPoint(-6F, -23.5F, 26F);

		panzerivModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box157
		panzerivModel[63].setRotationPoint(-9F, -24.5F, 26F);

		panzerivModel[64].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box158
		panzerivModel[64].setRotationPoint(-9F, -23.5F, 26F);

		panzerivModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box159
		panzerivModel[65].setRotationPoint(-12F, -24.5F, 26F);

		panzerivModel[66].addShapeBox(0F, 0F, 0F, 2, 6, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box160
		panzerivModel[66].setRotationPoint(-12F, -23.5F, 26F);

		panzerivModel[67].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box161
		panzerivModel[67].setRotationPoint(-14F, -21.5F, -28F);

		panzerivModel[68].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box162
		panzerivModel[68].setRotationPoint(-14F, -23.5F, -28F);

		panzerivModel[69].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box163
		panzerivModel[69].setRotationPoint(-13F, -24.5F, -28F);

		panzerivModel[70].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box164
		panzerivModel[70].setRotationPoint(-14F, -18.5F, -28F);

		panzerivModel[71].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box165
		panzerivModel[71].setRotationPoint(-13F, -20.5F, -28F);

		panzerivModel[72].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box166
		panzerivModel[72].setRotationPoint(-13F, -16.5F, -31F);

		panzerivModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box167
		panzerivModel[73].setRotationPoint(-14F, -18.5F, -31F);

		panzerivModel[74].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box168
		panzerivModel[74].setRotationPoint(-14F, -21.5F, -31F);

		panzerivModel[75].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box169
		panzerivModel[75].setRotationPoint(-14F, -23.5F, -31F);

		panzerivModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box170
		panzerivModel[76].setRotationPoint(-13F, -24.5F, -31F);

		panzerivModel[77].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		panzerivModel[77].setRotationPoint(-12.5F, -22F, -29F);

		panzerivModel[78].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box172
		panzerivModel[78].setRotationPoint(-12.5F, -24F, -29F);

		panzerivModel[79].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box173
		panzerivModel[79].setRotationPoint(-12.5F, -19F, -29F);

		panzerivModel[80].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box174
		panzerivModel[80].setRotationPoint(-2.5F, -19F, -29F);

		panzerivModel[81].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box175
		panzerivModel[81].setRotationPoint(-2.5F, -22F, -29F);

		panzerivModel[82].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box176
		panzerivModel[82].setRotationPoint(-2.5F, -24F, -29F);

		panzerivModel[83].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box177
		panzerivModel[83].setRotationPoint(-4F, -18.5F, -28F);

		panzerivModel[84].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box178
		panzerivModel[84].setRotationPoint(-3F, -20.5F, -28F);

		panzerivModel[85].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box179
		panzerivModel[85].setRotationPoint(-4F, -21.5F, -28F);

		panzerivModel[86].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		panzerivModel[86].setRotationPoint(-4F, -23.5F, -28F);

		panzerivModel[87].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box181
		panzerivModel[87].setRotationPoint(-3F, -24.5F, -28F);

		panzerivModel[88].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box182
		panzerivModel[88].setRotationPoint(-3F, -24.5F, -31F);

		panzerivModel[89].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box183
		panzerivModel[89].setRotationPoint(-4F, -23.5F, -31F);

		panzerivModel[90].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box184
		panzerivModel[90].setRotationPoint(-4F, -21.5F, -31F);

		panzerivModel[91].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box185
		panzerivModel[91].setRotationPoint(-4F, -18.5F, -31F);

		panzerivModel[92].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box186
		panzerivModel[92].setRotationPoint(-3F, -16.5F, -31F);

		panzerivModel[93].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box187
		panzerivModel[93].setRotationPoint(-44F, -23.5F, -25F);

		panzerivModel[94].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box188
		panzerivModel[94].setRotationPoint(-44F, -22F, -25.5F);

		panzerivModel[95].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box189
		panzerivModel[95].setRotationPoint(-44F, -22F, 24.5F);

		panzerivModel[96].addShapeBox(0F, 0F, 0F, 23, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box190
		panzerivModel[96].setRotationPoint(-44F, -23.5F, 24F);

		panzerivModel[97].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box191
		panzerivModel[97].setRotationPoint(-53F, -15.5F, -17F);

		panzerivModel[98].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box192
		panzerivModel[98].setRotationPoint(-53F, -13.5F, -17F);

		panzerivModel[99].addShapeBox(0F, 0F, 0F, 6, 2, 23, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Import Box194
		panzerivModel[99].setRotationPoint(-53F, -11.5F, -17F);

		panzerivModel[100].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box195
		panzerivModel[100].setRotationPoint(-54F, -11.5F, -16F);

		panzerivModel[101].addShapeBox(0F, 0F, 0F, 9, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Import Box196
		panzerivModel[101].setRotationPoint(-54F, -11.5F, 0F);

		panzerivModel[102].addShapeBox(0F, 0F, 0F, 103, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box197
		panzerivModel[102].setRotationPoint(-49F, -16F, -31F);

		panzerivModel[103].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box198
		panzerivModel[103].setRotationPoint(54F, -16F, -31F);

		panzerivModel[104].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import Box199
		panzerivModel[104].setRotationPoint(61F, -14F, -31F);

		panzerivModel[105].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Import Box200
		panzerivModel[105].setRotationPoint(-61F, -16F, -31F);

		panzerivModel[106].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box201
		panzerivModel[106].setRotationPoint(-51F, -25F, -35F);
		panzerivModel[106].rotateAngleX = 0.15707963F;

		panzerivModel[107].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box202
		panzerivModel[107].setRotationPoint(-30F, -25F, -35F);
		panzerivModel[107].rotateAngleX = 0.15707963F;

		panzerivModel[108].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box203
		panzerivModel[108].setRotationPoint(-9F, -25F, -35F);
		panzerivModel[108].rotateAngleX = 0.15707963F;

		panzerivModel[109].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box204
		panzerivModel[109].setRotationPoint(12F, -25F, -35F);
		panzerivModel[109].rotateAngleX = 0.15707963F;

		panzerivModel[110].addShapeBox(0F, 0F, 0F, 64, 22, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box205
		panzerivModel[110].setRotationPoint(-31F, -25F, -34.5F);
		panzerivModel[110].rotateAngleX = 0.15707963F;

		panzerivModel[111].addShapeBox(0F, 0F, 0F, 103, 2, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box215
		panzerivModel[111].setRotationPoint(-49F, -16F, 20F);

		panzerivModel[112].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box216
		panzerivModel[112].setRotationPoint(54F, -16F, 20F);

		panzerivModel[113].addShapeBox(0F, 0F, 0F, 4, 2, 11, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import Box217
		panzerivModel[113].setRotationPoint(61F, -14F, 20F);

		panzerivModel[114].addShapeBox(0F, 0F, 0F, 12, 2, 11, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Import Box218
		panzerivModel[114].setRotationPoint(-61F, -16F, 20F);

		panzerivModel[115].addShapeBox(0F, 0F, 0F, 76, 3, 8, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 2F, 1F, 0F, 2F, 1F, 0F, 2F, 1F, -2F, 2F, 1F, -2F); // Import Box290
		panzerivModel[115].setRotationPoint(-33F, 2.5F, -21F);

		panzerivModel[116].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box378
		panzerivModel[116].setRotationPoint(-15F, -25.5F, -34F);

		panzerivModel[117].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box379
		panzerivModel[117].setRotationPoint(-15F, -25.5F, 25F);

		panzerivModel[118].addShapeBox(0F, 0F, 0F, 1, 6, 9, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box380
		panzerivModel[118].setRotationPoint(6F, -25.5F, 25F);

		panzerivModel[119].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box383
		panzerivModel[119].setRotationPoint(12F, -26F, 34F);
		panzerivModel[119].rotateAngleX = -0.15707963F;

		panzerivModel[120].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box384
		panzerivModel[120].setRotationPoint(-9F, -26F, 34F);
		panzerivModel[120].rotateAngleX = -0.15707963F;

		panzerivModel[121].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box385
		panzerivModel[121].setRotationPoint(-30F, -26F, 34F);
		panzerivModel[121].rotateAngleX = -0.15707963F;

		panzerivModel[122].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box386
		panzerivModel[122].setRotationPoint(-51F, -26F, 34F);
		panzerivModel[122].rotateAngleX = -0.15707963F;

		panzerivModel[123].addShapeBox(0F, 0F, 0F, 64, 22, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box387
		panzerivModel[123].setRotationPoint(-31F, -26F, 33.5F);
		panzerivModel[123].rotateAngleX = -0.15707963F;

		panzerivModel[124].addShapeBox(0F, 0F, 0F, 8, 9, 50, 0F, 0F, 0F, -1F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 2F, 0F, -5F, 2F, 0F, -5F, 0F, 0F, 0F); // Import Box390
		panzerivModel[124].setRotationPoint(34F, -24.5F, -25F);

		panzerivModel[125].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box392
		panzerivModel[125].setRotationPoint(33F, -26F, 34F);
		panzerivModel[125].rotateAngleX = -0.15707963F;

		panzerivModel[126].addShapeBox(0F, 0F, 0F, 20, 24, 1, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box393
		panzerivModel[126].setRotationPoint(33F, -25F, -35F);
		panzerivModel[126].rotateAngleX = 0.15707963F;

		panzerivModel[127].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import Box46
		panzerivModel[127].setRotationPoint(41F, -22F, -12F);

		panzerivModel[128].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box47
		panzerivModel[128].setRotationPoint(44F, -19.5F, -10.5F);

		panzerivModel[129].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import Box185
		panzerivModel[129].setRotationPoint(42F, -23F, 3.5F);
		panzerivModel[129].rotateAngleZ = 0.34906585F;

		panzerivModel[130].addShapeBox(0F, 0F, 0F, 1, 5, 9, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import Box45
		panzerivModel[130].setRotationPoint(43F, -21.5F, 4F);

		panzerivModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		panzerivModel[131].setRotationPoint(-24.5F, -24.5F, 22F);

		panzerivModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Import Box10
		panzerivModel[132].setRotationPoint(-24.5F, -24.5F, -34F);

		panzerivModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		panzerivModel[133].setRotationPoint(-38.5F, -24.5F, 22F);

		panzerivModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Import Box12
		panzerivModel[134].setRotationPoint(-38.5F, -24.5F, -34F);

		panzerivModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		panzerivModel[135].setRotationPoint(19.5F, -24.5F, 22F);

		panzerivModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Import Box14
		panzerivModel[136].setRotationPoint(19.5F, -24.5F, -34F);

		panzerivModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		panzerivModel[137].setRotationPoint(34.5F, -24.5F, 22F);

		panzerivModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Import Box16
		panzerivModel[138].setRotationPoint(34.5F, -24.5F, -34F);

		panzerivModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		panzerivModel[139].setRotationPoint(43.4F, -19.5F, -9F);

		panzerivModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box28
		panzerivModel[140].setRotationPoint(12F, -8F, -32F);

		panzerivModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box29
		panzerivModel[141].setRotationPoint(29F, -8F, -32F);

		panzerivModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box30
		panzerivModel[142].setRotationPoint(-11F, -8F, -32F);

		panzerivModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box31
		panzerivModel[143].setRotationPoint(-35F, -8F, -32F);

		panzerivModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		panzerivModel[144].setRotationPoint(-35F, -8F, 21F);

		panzerivModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box33
		panzerivModel[145].setRotationPoint(12F, -8F, 21F);

		panzerivModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		panzerivModel[146].setRotationPoint(-11F, -8F, 21F);

		panzerivModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box35
		panzerivModel[147].setRotationPoint(29F, -8F, 21F);

		panzerivModel[148].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		panzerivModel[148].setRotationPoint(-53F, -17.5F, 3F);
		panzerivModel[148].rotateAngleZ = -0.2443461F;

		panzerivModel[149].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box26
		panzerivModel[149].setRotationPoint(62F, -12F, 11F);
		panzerivModel[149].rotateAngleY = -0.13962634F;
		panzerivModel[149].rotateAngleZ = 1.78782627F;

		panzerivModel[150].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		panzerivModel[150].setRotationPoint(62F, -12F, 9F);
		panzerivModel[150].rotateAngleY = -0.13962634F;
		panzerivModel[150].rotateAngleZ = 1.78782627F;

		panzerivModel[151].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		panzerivModel[151].setRotationPoint(62F, -12F, 9F);
		panzerivModel[151].rotateAngleY = -0.13962634F;
		panzerivModel[151].rotateAngleZ = 1.78782627F;

		panzerivModel[152].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		panzerivModel[152].setRotationPoint(62F, -12F, 6F);
		panzerivModel[152].rotateAngleY = -0.13962634F;
		panzerivModel[152].rotateAngleZ = 1.78782627F;

		panzerivModel[153].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box30
		panzerivModel[153].setRotationPoint(62F, -12F, 6F);
		panzerivModel[153].rotateAngleY = -0.13962634F;
		panzerivModel[153].rotateAngleZ = 1.78782627F;

		panzerivModel[154].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box31
		panzerivModel[154].setRotationPoint(62F, -12F, 3F);
		panzerivModel[154].rotateAngleY = -0.13962634F;
		panzerivModel[154].rotateAngleZ = 1.78782627F;

		panzerivModel[155].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box32
		panzerivModel[155].setRotationPoint(62F, -12F, 3F);
		panzerivModel[155].rotateAngleY = -0.13962634F;
		panzerivModel[155].rotateAngleZ = 1.78782627F;

		panzerivModel[156].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box33
		panzerivModel[156].setRotationPoint(62F, -12F, 5F);
		panzerivModel[156].rotateAngleY = -0.13962634F;
		panzerivModel[156].rotateAngleZ = 1.78782627F;

		panzerivModel[157].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box34
		panzerivModel[157].setRotationPoint(62F, -12F, 0F);
		panzerivModel[157].rotateAngleY = -0.13962634F;
		panzerivModel[157].rotateAngleZ = 1.78782627F;

		panzerivModel[158].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box35
		panzerivModel[158].setRotationPoint(62F, -12F, 2F);
		panzerivModel[158].rotateAngleY = -0.13962634F;
		panzerivModel[158].rotateAngleZ = 1.78782627F;

		panzerivModel[159].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box36
		panzerivModel[159].setRotationPoint(62F, -12F, -1F);
		panzerivModel[159].rotateAngleY = -0.13962634F;
		panzerivModel[159].rotateAngleZ = 1.78782627F;

		panzerivModel[160].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box37
		panzerivModel[160].setRotationPoint(62F, -12F, -3F);
		panzerivModel[160].rotateAngleY = -0.13962634F;
		panzerivModel[160].rotateAngleZ = 1.78782627F;

		panzerivModel[161].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box38
		panzerivModel[161].setRotationPoint(62F, -12F, -4F);
		panzerivModel[161].rotateAngleY = -0.13962634F;
		panzerivModel[161].rotateAngleZ = 1.78782627F;

		panzerivModel[162].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box39
		panzerivModel[162].setRotationPoint(62F, -12F, -6F);
		panzerivModel[162].rotateAngleY = -0.13962634F;
		panzerivModel[162].rotateAngleZ = 1.78782627F;

		panzerivModel[163].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box40
		panzerivModel[163].setRotationPoint(62F, -12F, -6F);
		panzerivModel[163].rotateAngleY = -0.13962634F;
		panzerivModel[163].rotateAngleZ = 1.78782627F;

		panzerivModel[164].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box41
		panzerivModel[164].setRotationPoint(62F, -12F, -3F);
		panzerivModel[164].rotateAngleY = -0.13962634F;
		panzerivModel[164].rotateAngleZ = 1.78782627F;

		panzerivModel[165].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box42
		panzerivModel[165].setRotationPoint(62F, -12F, 0F);
		panzerivModel[165].rotateAngleY = -0.13962634F;
		panzerivModel[165].rotateAngleZ = 1.78782627F;

		panzerivModel[166].addShapeBox(9F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box43
		panzerivModel[166].setRotationPoint(62F, -12F, -7F);
		panzerivModel[166].rotateAngleY = -0.13962634F;
		panzerivModel[166].rotateAngleZ = 1.78782627F;

		panzerivModel[167].addShapeBox(4F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box44
		panzerivModel[167].setRotationPoint(62F, -12F, -7F);
		panzerivModel[167].rotateAngleY = -0.13962634F;
		panzerivModel[167].rotateAngleZ = 1.78782627F;

		panzerivModel[168].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box50
		panzerivModel[168].setRotationPoint(62F, -12F, 8F);
		panzerivModel[168].rotateAngleY = -0.13962634F;
		panzerivModel[168].rotateAngleZ = 1.78782627F;

		panzerivModel[169].addShapeBox(4F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		panzerivModel[169].setRotationPoint(50F, -17.5F, -39F);
		panzerivModel[169].rotateAngleZ = 0.3217497F;

		panzerivModel[170].addShapeBox(9F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box52
		panzerivModel[170].setRotationPoint(50F, -17.5F, -39F);
		panzerivModel[170].rotateAngleZ = 0.3217497F;

		panzerivModel[171].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		panzerivModel[171].setRotationPoint(50F, -17F, -38F);
		panzerivModel[171].rotateAngleZ = 0.3217497F;

		panzerivModel[172].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		panzerivModel[172].setRotationPoint(50F, -17F, -38F);
		panzerivModel[172].rotateAngleZ = 0.3217497F;

		panzerivModel[173].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box55
		panzerivModel[173].setRotationPoint(50F, -17F, -36F);
		panzerivModel[173].rotateAngleZ = 0.3217497F;

		panzerivModel[174].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box56
		panzerivModel[174].setRotationPoint(50F, -17F, -35F);
		panzerivModel[174].rotateAngleZ = 0.3217497F;

		panzerivModel[175].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		panzerivModel[175].setRotationPoint(50F, -17F, -35F);
		panzerivModel[175].rotateAngleZ = 0.3217497F;

		panzerivModel[176].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box58
		panzerivModel[176].setRotationPoint(50F, -17F, -33F);
		panzerivModel[176].rotateAngleZ = 0.3217497F;

		panzerivModel[177].addShapeBox(7F, -2.5F, 8F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		panzerivModel[177].setRotationPoint(50F, -17F, -32F);
		panzerivModel[177].rotateAngleZ = 0.3217497F;

		panzerivModel[178].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box60
		panzerivModel[178].setRotationPoint(50F, -17F, -30F);
		panzerivModel[178].rotateAngleZ = 0.3217497F;

		panzerivModel[179].addShapeBox(3.5F, -1.5F, 8F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		panzerivModel[179].setRotationPoint(50F, -17F, -32F);
		panzerivModel[179].rotateAngleZ = 0.3217497F;

		panzerivModel[180].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box62
		panzerivModel[180].setRotationPoint(50F, -17F, 22F);
		panzerivModel[180].rotateAngleZ = 0.3217497F;

		panzerivModel[181].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box63
		panzerivModel[181].setRotationPoint(50F, -17F, 24F);
		panzerivModel[181].rotateAngleZ = 0.3217497F;

		panzerivModel[182].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		panzerivModel[182].setRotationPoint(50F, -17F, 25F);
		panzerivModel[182].rotateAngleZ = 0.3217497F;

		panzerivModel[183].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box65
		panzerivModel[183].setRotationPoint(50F, -17F, 27F);
		panzerivModel[183].rotateAngleZ = 0.3217497F;

		panzerivModel[184].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box66
		panzerivModel[184].setRotationPoint(50F, -17F, 28F);
		panzerivModel[184].rotateAngleZ = 0.3217497F;

		panzerivModel[185].addShapeBox(3.5F, -1.5F, -1F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box67
		panzerivModel[185].setRotationPoint(50F, -17F, 30F);
		panzerivModel[185].rotateAngleZ = 0.3217497F;

		panzerivModel[186].addShapeBox(7F, -2.5F, -1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		panzerivModel[186].setRotationPoint(50F, -17F, 28F);
		panzerivModel[186].rotateAngleZ = 0.3217497F;

		panzerivModel[187].addShapeBox(7F, -2.5F, -1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box69
		panzerivModel[187].setRotationPoint(50F, -17F, 25F);
		panzerivModel[187].rotateAngleZ = 0.3217497F;

		panzerivModel[188].addShapeBox(7F, -2.5F, -1F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box70
		panzerivModel[188].setRotationPoint(50F, -17F, 22F);
		panzerivModel[188].rotateAngleZ = 0.3217497F;

		panzerivModel[189].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import Box1
		panzerivModel[189].setRotationPoint(41.3F, -22.5F, 20F);
		panzerivModel[189].rotateAngleY = -1.09955743F;
		panzerivModel[189].rotateAngleZ = -0.12217305F;

		panzerivModel[190].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F); // Import Box2
		panzerivModel[190].setRotationPoint(35F, -22.5F, -23.5F);
		panzerivModel[190].rotateAngleY = 1.09955743F;
		panzerivModel[190].rotateAngleZ = -0.12217305F;

		panzerivModel[191].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		panzerivModel[191].setRotationPoint(49F, -21F, 24F);

		panzerivModel[192].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		panzerivModel[192].setRotationPoint(50F, -19F, 25.5F);

		panzerivModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box7
		panzerivModel[193].setRotationPoint(50F, -17F, 25.5F);

		panzerivModel[194].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box8
		panzerivModel[194].setRotationPoint(49F, -20F, 24F);

		panzerivModel[195].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		panzerivModel[195].setRotationPoint(49F, -21F, -28F);

		panzerivModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box10
		panzerivModel[196].setRotationPoint(50F, -19F, -26.5F);

		panzerivModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box11
		panzerivModel[197].setRotationPoint(50F, -17F, -26.5F);

		panzerivModel[198].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box12
		panzerivModel[198].setRotationPoint(49F, -20F, -28F);

		panzerivModel[199].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Import Box13
		panzerivModel[199].setRotationPoint(28F, -25F, 4F);

		panzerivModel[200].addBox(0F, 0F, 0F, 12, 1, 12, 0F); // Import Box14
		panzerivModel[200].setRotationPoint(28F, -25F, -16F);

		panzerivModel[201].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Import Box32
		panzerivModel[201].setRotationPoint(28F, -25.5F, 4F);

		panzerivModel[202].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Import Box33
		panzerivModel[202].setRotationPoint(28F, -25.5F, -16F);

		panzerivModel[203].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box34
		panzerivModel[203].setRotationPoint(38F, -25.5F, -11F);

		panzerivModel[204].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import Box35
		panzerivModel[204].setRotationPoint(38F, -25.5F, 9F);

		panzerivModel[205].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		panzerivModel[205].setRotationPoint(-49F, -9.5F, 12.5F);

		panzerivModel[206].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box1
		panzerivModel[206].setRotationPoint(61F, -12F, 9F);
		panzerivModel[206].rotateAngleZ = 1.80527957F;

		panzerivModel[207].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		panzerivModel[207].setRotationPoint(61F, -12F, 7F);
		panzerivModel[207].rotateAngleZ = 1.80527957F;

		panzerivModel[208].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		panzerivModel[208].setRotationPoint(61F, -12F, 7F);
		panzerivModel[208].rotateAngleZ = 1.80527957F;

		panzerivModel[209].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box4
		panzerivModel[209].setRotationPoint(61F, -12F, 4F);
		panzerivModel[209].rotateAngleZ = 1.80527957F;

		panzerivModel[210].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		panzerivModel[210].setRotationPoint(61F, -12F, 4F);
		panzerivModel[210].rotateAngleZ = 1.80527957F;

		panzerivModel[211].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		panzerivModel[211].setRotationPoint(61F, -12F, 1F);
		panzerivModel[211].rotateAngleZ = 1.80527957F;

		panzerivModel[212].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		panzerivModel[212].setRotationPoint(61F, -12F, 1F);
		panzerivModel[212].rotateAngleZ = 1.80527957F;

		panzerivModel[213].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box8
		panzerivModel[213].setRotationPoint(61F, -12F, 3F);
		panzerivModel[213].rotateAngleZ = 1.80527957F;

		panzerivModel[214].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		panzerivModel[214].setRotationPoint(61F, -12F, -2F);
		panzerivModel[214].rotateAngleZ = 1.80527957F;

		panzerivModel[215].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box10
		panzerivModel[215].setRotationPoint(61F, -12F, 0F);
		panzerivModel[215].rotateAngleZ = 1.80527957F;

		panzerivModel[216].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box11
		panzerivModel[216].setRotationPoint(61F, -12F, -3F);
		panzerivModel[216].rotateAngleZ = 1.80527957F;

		panzerivModel[217].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box12
		panzerivModel[217].setRotationPoint(61F, -12F, -5F);
		panzerivModel[217].rotateAngleZ = 1.80527957F;

		panzerivModel[218].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box13
		panzerivModel[218].setRotationPoint(61F, -12F, -6F);
		panzerivModel[218].rotateAngleZ = 1.80527957F;

		panzerivModel[219].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		panzerivModel[219].setRotationPoint(61F, -12F, -8F);
		panzerivModel[219].rotateAngleZ = 1.80527957F;

		panzerivModel[220].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		panzerivModel[220].setRotationPoint(61F, -12F, -8F);
		panzerivModel[220].rotateAngleZ = 1.80527957F;

		panzerivModel[221].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		panzerivModel[221].setRotationPoint(61F, -12F, -5F);
		panzerivModel[221].rotateAngleZ = 1.80527957F;

		panzerivModel[222].addShapeBox(7F, -2.5F, -10F, 1, 1, 2, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		panzerivModel[222].setRotationPoint(61F, -12F, -2F);
		panzerivModel[222].rotateAngleZ = 1.80527957F;

		panzerivModel[223].addShapeBox(9F, -1F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box18
		panzerivModel[223].setRotationPoint(61F, -12F, -9F);
		panzerivModel[223].rotateAngleZ = 1.80527957F;

		panzerivModel[224].addShapeBox(4F, -1F, -10F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		panzerivModel[224].setRotationPoint(61F, -12F, -9F);
		panzerivModel[224].rotateAngleZ = 1.80527957F;

		panzerivModel[225].addShapeBox(3.5F, -1.5F, -10F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box25
		panzerivModel[225].setRotationPoint(61F, -12F, 6F);
		panzerivModel[225].rotateAngleZ = 1.80527957F;

		panzerivModel[226].addShapeBox(9F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		panzerivModel[226].setRotationPoint(50F, -17.5F, 12F);
		panzerivModel[226].rotateAngleZ = 0.3217497F;

		panzerivModel[227].addShapeBox(4F, -1F, 8F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		panzerivModel[227].setRotationPoint(50F, -17.5F, 12F);
		panzerivModel[227].rotateAngleZ = 0.3217497F;

		panzerivModel[228].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Import Box1
		panzerivModel[228].setRotationPoint(33F, -0.5F, 18F);

		panzerivModel[229].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		panzerivModel[229].setRotationPoint(32F, 3.5F, 20F);

		panzerivModel[230].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box3
		panzerivModel[230].setRotationPoint(39F, 3.5F, 20F);

		panzerivModel[231].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box4
		panzerivModel[231].setRotationPoint(31F, 3.5F, 20F);

		panzerivModel[232].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box5
		panzerivModel[232].setRotationPoint(40F, 4.5F, 20F);

		panzerivModel[233].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		panzerivModel[233].setRotationPoint(29F, 4.5F, 20F);

		panzerivModel[234].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Import Box24
		panzerivModel[234].setRotationPoint(-30F, -0.5F, 18F);

		panzerivModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box25
		panzerivModel[235].setRotationPoint(-24F, 3.5F, 20F);

		panzerivModel[236].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box26
		panzerivModel[236].setRotationPoint(-32F, 3.5F, 20F);

		panzerivModel[237].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		panzerivModel[237].setRotationPoint(-31F, 3.5F, 20F);

		panzerivModel[238].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box28
		panzerivModel[238].setRotationPoint(-34F, 4.5F, 20F);

		panzerivModel[239].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		panzerivModel[239].setRotationPoint(-23F, 4.5F, 20F);

		panzerivModel[240].addShapeBox(-1F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Import Box34
		panzerivModel[240].setRotationPoint(-8F, -0.5F, 18F);

		panzerivModel[241].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F); // Import Box50
		panzerivModel[241].setRotationPoint(12F, -0.5F, 18F);

		panzerivModel[242].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box51
		panzerivModel[242].setRotationPoint(11F, 3.5F, 20F);

		panzerivModel[243].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box52
		panzerivModel[243].setRotationPoint(18F, 3.5F, 20F);

		panzerivModel[244].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box53
		panzerivModel[244].setRotationPoint(19F, 4.5F, 20F);

		panzerivModel[245].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box54
		panzerivModel[245].setRotationPoint(8F, 4.5F, 20F);

		panzerivModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box55
		panzerivModel[246].setRotationPoint(10F, 3.5F, 20F);

		panzerivModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box57
		panzerivModel[247].setRotationPoint(-2F, 4.5F, 20F);

		panzerivModel[248].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box58
		panzerivModel[248].setRotationPoint(-3F, 3.5F, 20F);

		panzerivModel[249].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box59
		panzerivModel[249].setRotationPoint(-10F, 3.5F, 20F);

		panzerivModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box60
		panzerivModel[250].setRotationPoint(-11F, 3.5F, 20F);

		panzerivModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box61
		panzerivModel[251].setRotationPoint(-13F, 4.5F, 20F);

		panzerivModel[252].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box70
		panzerivModel[252].setRotationPoint(33F, -0.5F, -22F);

		panzerivModel[253].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box71
		panzerivModel[253].setRotationPoint(32F, 3.5F, -23F);

		panzerivModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box72
		panzerivModel[254].setRotationPoint(39F, 3.5F, -23F);

		panzerivModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box73
		panzerivModel[255].setRotationPoint(31F, 3.5F, -23F);

		panzerivModel[256].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box74
		panzerivModel[256].setRotationPoint(40F, 4.5F, -27F);

		panzerivModel[257].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box75
		panzerivModel[257].setRotationPoint(29F, 4.5F, -27F);

		panzerivModel[258].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box76
		panzerivModel[258].setRotationPoint(-30F, -0.5F, -22F);

		panzerivModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box77
		panzerivModel[259].setRotationPoint(-24F, 3.5F, -23F);

		panzerivModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box78
		panzerivModel[260].setRotationPoint(-32F, 3.5F, -23F);

		panzerivModel[261].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box79
		panzerivModel[261].setRotationPoint(-34F, 4.5F, -27F);

		panzerivModel[262].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box80
		panzerivModel[262].setRotationPoint(-23F, 4.5F, -27F);

		panzerivModel[263].addShapeBox(-1F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box81
		panzerivModel[263].setRotationPoint(-8F, -0.5F, -22F);

		panzerivModel[264].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F); // Import Box82
		panzerivModel[264].setRotationPoint(12F, -0.5F, -22F);

		panzerivModel[265].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box83
		panzerivModel[265].setRotationPoint(11F, 3.5F, -23F);

		panzerivModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box84
		panzerivModel[266].setRotationPoint(18F, 3.5F, -23F);

		panzerivModel[267].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box85
		panzerivModel[267].setRotationPoint(19F, 4.5F, -27F);

		panzerivModel[268].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box86
		panzerivModel[268].setRotationPoint(8F, 4.5F, -27F);

		panzerivModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box87
		panzerivModel[269].setRotationPoint(10F, 3.5F, -23F);

		panzerivModel[270].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box88
		panzerivModel[270].setRotationPoint(-2F, 4.5F, -27F);

		panzerivModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box89
		panzerivModel[271].setRotationPoint(-3F, 3.5F, -23F);

		panzerivModel[272].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box90
		panzerivModel[272].setRotationPoint(-10F, 3.5F, -23F);

		panzerivModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box91
		panzerivModel[273].setRotationPoint(-11F, 3.5F, -23F);

		panzerivModel[274].addShapeBox(0F, 0F, 0F, 2, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box92
		panzerivModel[274].setRotationPoint(-13F, 4.5F, -27F);

		panzerivModel[275].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape93
		panzerivModel[275].setRotationPoint(-50F, -21.5F, 18.5F);
		panzerivModel[275].rotateAngleX = -0.06981317F;
		panzerivModel[275].rotateAngleY = 1.57079633F;

		panzerivModel[276].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape94
		panzerivModel[276].setRotationPoint(-50F, -21.5F, 8.5F);
		panzerivModel[276].rotateAngleX = -0.06981317F;
		panzerivModel[276].rotateAngleY = 1.57079633F;

		panzerivModel[277].addShapeBox(0F, 0F, 0F, 76, 3, 8, 0F, 5F, 0F, 0F, 5F, 1F, 0F, 5F, 1F, 0F, 5F, 0F, 0F, 2F, 1F, -2F, 2F, 1F, -2F, 2F, 1F, 0F, 2F, 1F, 0F); // Import Box96
		panzerivModel[277].setRotationPoint(-33F, 2.5F, 13F);

		panzerivModel[278].addShapeBox(12F, -13F, -11F, 10, 5, 4, 0F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5F, 0F, 1F, 0F, 0F, 0F, 0F, -6F); // Import Box59
		panzerivModel[278].setRotationPoint(2F, -17F, -4F);

		panzerivModel[279].addShapeBox(22F, -13.5F, -8F, 2, 3, 16, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box188
		panzerivModel[279].setRotationPoint(2F, -17F, 0F);

		panzerivModel[280].addShapeBox(22F, -16.5F, -8F, 2, 3, 16, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box66
		panzerivModel[280].setRotationPoint(2F, -18F, 0F);

		panzerivModel[281].addShapeBox(12F, -13F, -11F, 10, 5, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box68
		panzerivModel[281].setRotationPoint(2F, -17F, 0F);

		panzerivModel[282].addShapeBox(12F, -13F, 11F, 10, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, -6F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 2F); // Import Box64
		panzerivModel[282].setRotationPoint(2F, -17F, 0F);

		panzerivModel[283].addShapeBox(12F, -19F, -15F, 10, 6, 30, 0F, 0F, 0F, 1.5F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.8F); // Import Box67
		panzerivModel[283].setRotationPoint(2F, -17F, 0F);

		panzerivModel[284].addShapeBox(3F, -19F, -17F, 9, 10, 34, 0F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 1F, 4F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 4F); // Import Box73
		panzerivModel[284].setRotationPoint(2F, -17F, 0F);

		panzerivModel[285].addShapeBox(12F, -20F, -14F, 8, 1, 28, 0F, 0F, 0F, 0F, -2F, -1F, -4F, -2F, -1F, -4F, 0F, 0F, 0F, 0F, 1F, 2.5F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 1F, 2.5F); // Import Box60
		panzerivModel[285].setRotationPoint(2F, -18F, 0F);

		panzerivModel[286].addShapeBox(3F, -20F, -17F, 9, 1, 34, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, -0.51F, 0F, 1F, -0.51F, 0F, 1F, 2F); // Import Box74
		panzerivModel[286].setRotationPoint(2F, -18F, 0F);

		panzerivModel[287].addShapeBox(-11F, -18F, -16.5F, 12, 7, 35, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F, 1F, 2.5F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 2.5F); // Import Box162
		panzerivModel[287].setRotationPoint(0F, -17F, -1F);

		panzerivModel[288].addShapeBox(-14F, -19F, -17F, 17, 10, 34, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 1F, 3F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, 3F); // Import Box61
		panzerivModel[288].setRotationPoint(2F, -17F, 0F);

		panzerivModel[289].addShapeBox(-14F, -20F, -16F, 17, 1, 32, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 1F, 2F, 0F, 1F, 3F, 0F, 1F, 3F, 0F, 1F, 2F); // Import Box62
		panzerivModel[289].setRotationPoint(2F, -18F, 0F);

		panzerivModel[290].addShapeBox(-17F, -18F, -17F, 8, 11, 2, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 2F); // Import Box161
		panzerivModel[290].setRotationPoint(-3F, -18F, -2F);

		panzerivModel[291].addShapeBox(-22F, -20F, -18F, 8, 2, 36, 0F, -4F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, -4F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box57
		panzerivModel[291].setRotationPoint(2F, -18F, 0F);

		panzerivModel[292].addShapeBox(-22F, -18F, 17F, 8, 11, 2, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Import Box55
		panzerivModel[292].setRotationPoint(2F, -18F, 0F);

		panzerivModel[293].addShapeBox(-24F, -18F, -16F, 2, 11, 32, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box56
		panzerivModel[293].setRotationPoint(2F, -18F, 0F);

		panzerivModel[294].addShapeBox(-27F, -20F, -10F, 8, 8, 18, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Import Box72
		panzerivModel[294].setRotationPoint(0F, -15F, 1F);

		panzerivModel[295].addShapeBox(-27F, -20F, -11F, 11, 3, 20, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 0F); // Import Box71
		panzerivModel[295].setRotationPoint(0F, -18F, 1F);

		panzerivModel[296].addShapeBox(-22F, -37F, -7.5F, 4, 2, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box75
		panzerivModel[296].setRotationPoint(2F, -2F, 0F);

		panzerivModel[297].addBox(-18F, -36F, -7.5F, 8, 1, 15, 0F); // Import Box74
		panzerivModel[297].setRotationPoint(2F, -3F, 0F);

		panzerivModel[298].addShapeBox(-21.5F, -37F, -7F, 4, 2, 14, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box214
		panzerivModel[298].setRotationPoint(2F, -4F, 0F);

		panzerivModel[299].addBox(-18F, -39F, -7.5F, 8, 1, 15, 0F); // Import Box218
		panzerivModel[299].setRotationPoint(2F, -3F, 0F);

		panzerivModel[300].addBox(-17.5F, -37F, -7F, 7, 2, 14, 0F); // Import Box215
		panzerivModel[300].setRotationPoint(2F, -4F, 0F);

		panzerivModel[301].addShapeBox(-22F, -39F, -7.5F, 4, 1, 15, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box217
		panzerivModel[301].setRotationPoint(2F, -3F, 0F);

		panzerivModel[302].addShapeBox(-10F, -39F, -7.5F, 4, 1, 15, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box219
		panzerivModel[302].setRotationPoint(2F, -3F, 0F);

		panzerivModel[303].addShapeBox(-10F, -37F, -7.5F, 4, 2, 15, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box76
		panzerivModel[303].setRotationPoint(2F, -2F, 0F);

		panzerivModel[304].addShapeBox(-10.5F, -37F, -7F, 4, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box216
		panzerivModel[304].setRotationPoint(2F, -4F, 0F);

		panzerivModel[305].addBox(22F, -8F, 9F, 4, 1, 1, 0F); // Import Box176
		panzerivModel[305].setRotationPoint(1F, -18F, 0F);
		panzerivModel[305].rotateAngleY = -0.4712389F;
		panzerivModel[305].rotateAngleZ = -0.43633231F;

		panzerivModel[306].addBox(22F, -8F, 9F, 4, 1, 1, 0F); // Import Box177
		panzerivModel[306].setRotationPoint(2F, -18F, 0F);
		panzerivModel[306].rotateAngleY = -0.38397244F;
		panzerivModel[306].rotateAngleZ = -0.40142573F;

		panzerivModel[307].addBox(23F, -8F, 9F, 4, 1, 1, 0F); // Import Box178
		panzerivModel[307].setRotationPoint(2F, -18F, 0F);
		panzerivModel[307].rotateAngleY = -0.29670597F;
		panzerivModel[307].rotateAngleZ = -0.36651914F;

		panzerivModel[308].addBox(23.5F, -10F, -5F, 4, 1, 1, 0F); // Import Box181
		panzerivModel[308].setRotationPoint(2F, -17.5F, -1F);
		panzerivModel[308].rotateAngleY = 0.62831853F;
		panzerivModel[308].rotateAngleZ = -0.36651914F;

		panzerivModel[309].addBox(24.5F, -8.5F, -5F, 4, 1, 1, 0F); // Import Box180
		panzerivModel[309].setRotationPoint(2F, -17.5F, -1F);
		panzerivModel[309].rotateAngleY = 0.54105207F;
		panzerivModel[309].rotateAngleZ = -0.40142573F;

		panzerivModel[310].addBox(25.5F, -7F, -5F, 4, 1, 1, 0F); // Import Box179
		panzerivModel[310].setRotationPoint(2F, -17.5F, -1F);
		panzerivModel[310].rotateAngleY = 0.45378561F;
		panzerivModel[310].rotateAngleZ = -0.43633231F;

		panzerivModel[311].addShapeBox(-16F, -20F, -26F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box388
		panzerivModel[311].setRotationPoint(0F, -18F, 0F);

		panzerivModel[312].addShapeBox(-16F, -20F, 25F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box389
		panzerivModel[312].setRotationPoint(0F, -18F, 0F);

		panzerivModel[313].addShapeBox(-29F, -20F, 25F, 13, 11, 1, 0F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F); // Import Box391
		panzerivModel[313].setRotationPoint(0F, -18F, 0F);

		panzerivModel[314].addShapeBox(-41F, -20F, 15F, 12, 11, 1, 0F, -9F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F, -9F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F); // Import Box394
		panzerivModel[314].setRotationPoint(0F, -18F, 0F);

		panzerivModel[315].addShapeBox(-29F, -20F, -26F, 13, 11, 1, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F); // Import Box395
		panzerivModel[315].setRotationPoint(0F, -18F, 0F);

		panzerivModel[316].addShapeBox(-33F, -20F, -5F, 1, 11, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box397
		panzerivModel[316].setRotationPoint(0F, -18F, 0F);

		panzerivModel[317].addShapeBox(-41F, -20F, -16F, 12, 11, 1, 0F, -8F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 10F, -8F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 10F); // Import Box398
		panzerivModel[317].setRotationPoint(0F, -18F, 0F);

		panzerivModel[318].addShapeBox(-6F, -20F, 25F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		panzerivModel[318].setRotationPoint(0F, -18F, 0F);

		panzerivModel[319].addShapeBox(-6F, -20F, -26F, 10, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		panzerivModel[319].setRotationPoint(0F, -18F, 0F);

		panzerivModel[320].addShapeBox(4F, -20F, 25F, 20, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F); // Import Box2
		panzerivModel[320].setRotationPoint(0F, -18F, 0F);

		panzerivModel[321].addShapeBox(4F, -20F, -20F, 20, 11, 1, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Import Box4
		panzerivModel[321].setRotationPoint(0F, -18F, 0F);

		panzerivModel[322].addShapeBox(24F, -20F, -14F, 5, 11, 1, 0F, 0F, 0F, 6F, 0.5F, -7F, 0F, 0F, -7F, -1F, 0F, 0F, -6F, 0F, 0F, 6F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -6F); // Import Box7
		panzerivModel[322].setRotationPoint(0F, -18F, 0F);

		panzerivModel[323].addShapeBox(24F, -20F, 13F, 5, 11, 1, 0F, 0F, 0F, -6F, 0F, -7F, -1F, 0.5F, -7F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 6F); // Import Box8
		panzerivModel[323].setRotationPoint(0F, -18F, 0F);

		panzerivModel[324].addShapeBox(-0.5F, -19F, -25F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box18
		panzerivModel[324].setRotationPoint(2F, -18F, 0F);

		panzerivModel[325].addShapeBox(-10.5F, -19F, -28.5F, 1, 1, 11, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box23
		panzerivModel[325].setRotationPoint(2F, -18F, 0F);
		panzerivModel[325].rotateAngleY = 0.34906585F;

		panzerivModel[326].addShapeBox(5.5F, -19F, -25F, 1, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box24
		panzerivModel[326].setRotationPoint(2F, -18F, 0F);
		panzerivModel[326].rotateAngleY = -0.27925268F;

		panzerivModel[327].addShapeBox(-10.5F, -19F, 17.5F, 1, 1, 11, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box25
		panzerivModel[327].setRotationPoint(2F, -18F, 0F);
		panzerivModel[327].rotateAngleY = -0.34906585F;

		panzerivModel[328].addShapeBox(-0.5F, -19F, 15F, 1, 1, 10, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		panzerivModel[328].setRotationPoint(2F, -18F, 0F);

		panzerivModel[329].addShapeBox(5.5F, -19F, 16F, 1, 1, 9, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		panzerivModel[329].setRotationPoint(2F, -18F, 0F);
		panzerivModel[329].rotateAngleY = 0.27925268F;

		panzerivModel[330].addShapeBox(20F, -16F, 10F, 3, 3, 2, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box0
		panzerivModel[330].setRotationPoint(2F, -18F, 0F);

		panzerivModel[331].addShapeBox(20F, -16F, -11F, 3, 3, 1, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box3
		panzerivModel[331].setRotationPoint(2F, -18F, 0F);

		panzerivModel[332].addShapeBox(3.5F, -20F, 25.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		panzerivModel[332].setRotationPoint(0F, -18F, 0F);

		panzerivModel[333].addShapeBox(3.5F, -20F, -26.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		panzerivModel[333].setRotationPoint(0F, -18F, 0F);

		panzerivModel[334].addBox(11F, -35.5F, -5.5F, 3, 2, 5, 0F); // Import Box29
		panzerivModel[334].setRotationPoint(2F, -3F, 0F);

		panzerivModel[335].addShapeBox(10F, -35.5F, -5.5F, 1, 2, 5, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box30
		panzerivModel[335].setRotationPoint(2F, -3F, 0F);

		panzerivModel[336].addShapeBox(14F, -35.5F, -5.5F, 1, 2, 5, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box31
		panzerivModel[336].setRotationPoint(2F, -3F, 0F);

		panzerivModel[337].addShapeBox(-30F, -20F, -9F, 3, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box36
		panzerivModel[337].setRotationPoint(0F, -18F, 1F);

		panzerivModel[338].addShapeBox(-32F, -20F, -7F, 2, 3, 12, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box37
		panzerivModel[338].setRotationPoint(0F, -18F, 1F);

		panzerivModel[339].addShapeBox(-32F, -17F, -6F, 2, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box40
		panzerivModel[339].setRotationPoint(0F, -18F, 1F);

		panzerivModel[340].addShapeBox(-30F, -17F, -8F, 3, 8, 14, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Import Box41
		panzerivModel[340].setRotationPoint(0F, -18F, 1F);

		panzerivModel[341].addShapeBox(-16.5F, -20F, 25.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		panzerivModel[341].setRotationPoint(0F, -18F, 0F);

		panzerivModel[342].addShapeBox(-16.5F, -20F, -26.3F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		panzerivModel[342].setRotationPoint(0F, -18F, 0F);

		panzerivModel[343].addShapeBox(-4F, -6F, -7F, 7, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box77
		panzerivModel[343].setRotationPoint(28F, -25F, 0F);

		panzerivModel[344].addShapeBox(-3F, -3F, -4F, 9, 5, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box64
		panzerivModel[344].setRotationPoint(25F, -31F, 0F);

		panzerivModel[345].addShapeBox(6F, -3F, -4F, 1, 5, 10, 0F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Import Box203
		panzerivModel[345].setRotationPoint(25F, -31F, 0F);

		panzerivModel[346].addShapeBox(6F, -2F, -0.5F, 6, 3, 3, 0F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F); // Import Box67
		panzerivModel[346].setRotationPoint(25F, -31F, 0F);

		panzerivModel[347].addShapeBox(12F, -2F, 0F, 1, 3, 3, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Import Box204
		panzerivModel[347].setRotationPoint(25F, -31F, -0.5F);

		panzerivModel[348].addShapeBox(-2F, -2F, -0.5F, 49, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box63
		panzerivModel[348].setRotationPoint(25F, -31F, 0F);

		panzerivModel[349].addShapeBox(47F, -2F, -0.5F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F); // Import Box68
		panzerivModel[349].setRotationPoint(25F, -31F, 0F);

		panzerivModel[350].addShapeBox(55F, 1F, -1.5F, 2, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box246
		panzerivModel[350].setRotationPoint(25F, -31F, 0F);

		panzerivModel[351].addShapeBox(55F, -2F, -1.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box248
		panzerivModel[351].setRotationPoint(25F, -31F, 0F);

		panzerivModel[352].addShapeBox(55F, -2F, 2.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box247
		panzerivModel[352].setRotationPoint(25F, -31F, 0F);

		panzerivModel[353].addShapeBox(55F, -3F, -1.5F, 2, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box245
		panzerivModel[353].setRotationPoint(25F, -31F, 0F);

		panzerivModel[354].addShapeBox(53F, -3F, -0.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box249
		panzerivModel[354].setRotationPoint(25F, -31F, 0F);

		panzerivModel[355].addShapeBox(53F, 1F, -0.5F, 2, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box250
		panzerivModel[355].setRotationPoint(25F, -31F, 0F);

		panzerivModel[356].addShapeBox(49F, -2.5F, 0F, 3, 1, 2, 0F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.3F, 0.8F, 0F, -0.7F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.7F, 0.8F); // Import Box237
		panzerivModel[356].setRotationPoint(25F, -31F, 0F);

		panzerivModel[357].addShapeBox(49F, 0.5F, 0F, 3, 1, 2, 0F, 0F, -0.7F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.7F, 1F, 0F, -0.3F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.3F, 1F); // Import Box238
		panzerivModel[357].setRotationPoint(25F, -31F, 0F);

		panzerivModel[358].addShapeBox(52F, -3F, -1.5F, 1, 1, 5, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box239
		panzerivModel[358].setRotationPoint(25F, -31F, 0F);

		panzerivModel[359].addShapeBox(52F, -2F, 2.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box242
		panzerivModel[359].setRotationPoint(25F, -31F, 0F);

		panzerivModel[360].addShapeBox(52F, 1F, -1.5F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box244
		panzerivModel[360].setRotationPoint(25F, -31F, 0F);

		panzerivModel[361].addShapeBox(52F, -2F, -1.5F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box243
		panzerivModel[361].setRotationPoint(25F, -31F, 0F);

		panzerivModel[362].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 7, 13, 13, 48, 7, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Shape6
		panzerivModel[362].setRotationPoint(54.5F, -4.5F, 28F);

		panzerivModel[363].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 5, 13, 13, 48, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Shape19
		panzerivModel[363].setRotationPoint(-48F, -3.5F, 27F);

		panzerivModel[364].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape0
		panzerivModel[364].setRotationPoint(41F, 5.5F, 24.5F);

		panzerivModel[365].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape7
		panzerivModel[365].setRotationPoint(30F, 5.5F, 24.5F);

		panzerivModel[366].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape30
		panzerivModel[366].setRotationPoint(-22F, 5.5F, 24.5F);

		panzerivModel[367].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape31
		panzerivModel[367].setRotationPoint(-33F, 5.5F, 24.5F);

		panzerivModel[368].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape33
		panzerivModel[368].setRotationPoint(-11F, 5.5F, 24.5F);

		panzerivModel[369].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape48
		panzerivModel[369].setRotationPoint(20F, 5.5F, 24.5F);

		panzerivModel[370].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape49
		panzerivModel[370].setRotationPoint(9F, 5.5F, 24.5F);

		panzerivModel[371].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape56
		panzerivModel[371].setRotationPoint(-1F, 5.5F, 24.5F);

		panzerivModel[372].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 7, 13, 13, 48, 7, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Shape17
		panzerivModel[372].setRotationPoint(54.5F, -4.5F, -22F);

		panzerivModel[373].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3, 0, 3, 0), new Coord2D(10, 0, 10, 0), new Coord2D(13, 3, 13, 3), new Coord2D(13, 10, 13, 10), new Coord2D(10, 13, 10, 13), new Coord2D(3, 13, 3, 13), new Coord2D(0, 10, 0, 10), new Coord2D(0, 3, 0, 3) }), 5, 13, 13, 48, 5, ModelRendererTurbo.MR_FRONT, new float[] {5 ,7 ,5 ,7 ,5 ,7 ,5 ,7}); // Import Shape18
		panzerivModel[373].setRotationPoint(-47.5F, -3.5F, -23F);

		panzerivModel[374].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape62
		panzerivModel[374].setRotationPoint(41F, 5.5F, -27.5F);

		panzerivModel[375].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape63
		panzerivModel[375].setRotationPoint(30F, 5.5F, -27.5F);

		panzerivModel[376].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape64
		panzerivModel[376].setRotationPoint(20F, 5.5F, -27.5F);

		panzerivModel[377].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape65
		panzerivModel[377].setRotationPoint(9F, 5.5F, -27.5F);

		panzerivModel[378].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape66
		panzerivModel[378].setRotationPoint(-1F, 5.5F, -27.5F);

		panzerivModel[379].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape67
		panzerivModel[379].setRotationPoint(-11F, 5.5F, -27.5F);

		panzerivModel[380].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape68
		panzerivModel[380].setRotationPoint(-22F, 5.5F, -27.5F);

		panzerivModel[381].addShape3D(4.5F, -4.5F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(7, 0, 7, 0), new Coord2D(9, 2, 9, 2), new Coord2D(9, 7, 9, 7), new Coord2D(7, 9, 7, 9), new Coord2D(2, 9, 2, 9), new Coord2D(0, 7, 0, 7), new Coord2D(0, 2, 0, 2) }), 7, 9, 9, 32, 7, ModelRendererTurbo.MR_FRONT, new float[] {3 ,5 ,3 ,5 ,3 ,5 ,3 ,5}); // Import Shape69
		panzerivModel[381].setRotationPoint(-33F, 5.5F, -27.5F);

		panzerivModel[382].addShapeBox(0F, 0F, 0F, 110, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box281
		panzerivModel[382].setRotationPoint(-51F, -12.1F, -30F);

		panzerivModel[383].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box282
		panzerivModel[383].setRotationPoint(59F, -12F, -30F);
		panzerivModel[383].rotateAngleZ = 1.04719755F;

		panzerivModel[384].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box283
		panzerivModel[384].setRotationPoint(63F, -5F, -30F);
		panzerivModel[384].rotateAngleZ = 1.95476876F;

		panzerivModel[385].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box284
		panzerivModel[385].setRotationPoint(60F, 2.4F, -30F);
		panzerivModel[385].rotateAngleZ = 2.67035376F;

		panzerivModel[386].addShapeBox(0F, 0F, 0F, 77, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box285
		panzerivModel[386].setRotationPoint(43F, 11F, -30F);
		panzerivModel[386].rotateAngleZ = 3.14159265F;

		panzerivModel[387].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box286
		panzerivModel[387].setRotationPoint(-34F, 11F, -30F);
		panzerivModel[387].rotateAngleZ = 3.43829863F;

		panzerivModel[388].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box287
		panzerivModel[388].setRotationPoint(-51.2F, 5.7F, -30F);
		panzerivModel[388].rotateAngleZ = 4.01425728F;

		panzerivModel[389].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box288
		panzerivModel[389].setRotationPoint(-55.7F, 0.3F, -30F);
		panzerivModel[389].rotateAngleZ = 4.72984227F;

		panzerivModel[390].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box289
		panzerivModel[390].setRotationPoint(-55.7F, -6.7F, -30F);
		panzerivModel[390].rotateAngleZ = 5.44542727F;

		panzerivModel[391].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box291
		panzerivModel[391].setRotationPoint(59F, -12F, 21F);
		panzerivModel[391].rotateAngleZ = 1.04719755F;

		panzerivModel[392].addShapeBox(0F, 0F, 0F, 110, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box292
		panzerivModel[392].setRotationPoint(-51F, -12.1F, 21F);

		panzerivModel[393].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box293
		panzerivModel[393].setRotationPoint(63F, -5F, 21F);
		panzerivModel[393].rotateAngleZ = 1.95476876F;

		panzerivModel[394].addShapeBox(0F, 0F, 0F, 19, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box294
		panzerivModel[394].setRotationPoint(60F, 2.4F, 21F);
		panzerivModel[394].rotateAngleZ = 2.67035376F;

		panzerivModel[395].addShapeBox(0F, 0F, 0F, 77, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box295
		panzerivModel[395].setRotationPoint(43F, 11F, 21F);
		panzerivModel[395].rotateAngleZ = 3.14159265F;

		panzerivModel[396].addShapeBox(0F, 0F, 0F, 18, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box296
		panzerivModel[396].setRotationPoint(-34F, 11F, 21F);
		panzerivModel[396].rotateAngleZ = 3.43829863F;

		panzerivModel[397].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box297
		panzerivModel[397].setRotationPoint(-55.7F, 0.3F, 21F);
		panzerivModel[397].rotateAngleZ = 4.72984227F;

		panzerivModel[398].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box298
		panzerivModel[398].setRotationPoint(-51.2F, 5.7F, 21F);
		panzerivModel[398].rotateAngleZ = 4.01425728F;

		panzerivModel[399].addShapeBox(0F, 0F, 0F, 7, 1, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box299
		panzerivModel[399].setRotationPoint(-55.7F, -6.7F, 21F);
		panzerivModel[399].rotateAngleZ = 5.44542727F;

		panzerivModel[400].addShapeBox(-6F, 4.5F, -3F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box17
		panzerivModel[400].setRotationPoint(-46F, -10F, 13F);

		panzerivModel[401].addShapeBox(-6F, 3.5F, -3F, 6, 3, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Import Box18
		panzerivModel[401].setRotationPoint(-46F, -10F, 13F);

		panzerivModel[402].addShapeBox(-4F, -0.5F, -3F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		panzerivModel[402].setRotationPoint(-46F, -10F, 13F);

		panzerivModel[403].addShapeBox(-1F, -0.5F, -2F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		panzerivModel[403].setRotationPoint(-46F, -10F, 13F);

		panzerivModel[404].addShapeBox(-4F, -0.5F, 2F, 1, 4, 1, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box0
		panzerivModel[404].setRotationPoint(-46F, -10F, 13F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 405; i++)
		{
			panzerivModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo panzerivModel[];
}