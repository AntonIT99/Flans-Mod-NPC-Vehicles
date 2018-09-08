//This File was created with the Minecraft-SMP Modelling Toolbox 2.0.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

public class ModelM4Sherman extends ModelVehicle
{
	int textureX = 512;
	int textureY = 512;

	public ModelM4Sherman()
	{
		bodyModel = new ModelRendererTurbo[215];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box6
		bodyModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box7
		bodyModel[3] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box8
		bodyModel[4] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import Box9
		bodyModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box11
		bodyModel[6] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Import Box12
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box13
		bodyModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box15
		bodyModel[9] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Import Box16
		bodyModel[10] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Import Box19
		bodyModel[11] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box22
		bodyModel[12] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Import Box23
		bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box24
		bodyModel[14] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Import Box42
		bodyModel[15] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box43
		bodyModel[16] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box44
		bodyModel[17] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import Box45
		bodyModel[18] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box52
		bodyModel[19] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box53
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box56
		bodyModel[21] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Import Box42
		bodyModel[22] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box43
		bodyModel[23] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box60
		bodyModel[24] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box61
		bodyModel[25] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box63
		bodyModel[26] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box64
		bodyModel[27] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box65
		bodyModel[28] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box66
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box67
		bodyModel[30] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box75
		bodyModel[31] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box112
		bodyModel[32] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import Box113
		bodyModel[33] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box114
		bodyModel[34] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box115
		bodyModel[35] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import Box116
		bodyModel[36] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Import Box117
		bodyModel[37] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Import Box118
		bodyModel[38] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Import Box119
		bodyModel[39] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Import Box120
		bodyModel[40] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Import Box121
		bodyModel[41] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Import Box122
		bodyModel[42] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box126
		bodyModel[43] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Import Box128
		bodyModel[44] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Import Box129
		bodyModel[45] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Import Box130
		bodyModel[46] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Import Box131
		bodyModel[47] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Import Box132
		bodyModel[48] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Import Box133
		bodyModel[49] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box134
		bodyModel[50] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Import Box135
		bodyModel[51] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Import Box136
		bodyModel[52] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box137
		bodyModel[53] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box139
		bodyModel[54] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import Box142
		bodyModel[55] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Import Box144
		bodyModel[56] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box145
		bodyModel[57] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Import Box146
		bodyModel[58] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Import Box147
		bodyModel[59] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Import Box148
		bodyModel[60] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Import Box149
		bodyModel[61] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Import Box150
		bodyModel[62] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Import Box151
		bodyModel[63] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box152
		bodyModel[64] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Import Box153
		bodyModel[65] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box154
		bodyModel[66] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box155
		bodyModel[67] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box156
		bodyModel[68] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Import Box158
		bodyModel[69] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box160
		bodyModel[70] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Import Box161
		bodyModel[71] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Import Box162
		bodyModel[72] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box163
		bodyModel[73] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Import Box164
		bodyModel[74] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Import Box165
		bodyModel[75] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Import Box166
		bodyModel[76] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Import Box167
		bodyModel[77] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Import Box168
		bodyModel[78] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Import Box169
		bodyModel[79] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Import Box171
		bodyModel[80] = new ModelRendererTurbo(this, 425, 129, textureX, textureY); // Import Box174
		bodyModel[81] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box176
		bodyModel[82] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Import Box177
		bodyModel[83] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import Box178
		bodyModel[84] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Import Box179
		bodyModel[85] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Import Box180
		bodyModel[86] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Import Box181
		bodyModel[87] = new ModelRendererTurbo(this, 233, 137, textureX, textureY); // Import Box182
		bodyModel[88] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Import Box183
		bodyModel[89] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Import Box184
		bodyModel[90] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Import Box185
		bodyModel[91] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Import Box187
		bodyModel[92] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Import Box190
		bodyModel[93] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Import Box193
		bodyModel[94] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Import Box195
		bodyModel[95] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Import Box196
		bodyModel[96] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Import Box197
		bodyModel[97] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Import Box198
		bodyModel[98] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Import Box199
		bodyModel[99] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box200
		bodyModel[100] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Import Box201
		bodyModel[101] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box202
		bodyModel[102] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Import Box203
		bodyModel[103] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Import Box204
		bodyModel[104] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import Box205
		bodyModel[105] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Import Box206
		bodyModel[106] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Import Box207
		bodyModel[107] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Import Box208
		bodyModel[108] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Import Box209
		bodyModel[109] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Import Box210
		bodyModel[110] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Import Box211
		bodyModel[111] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Import Box212
		bodyModel[112] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Import Box213
		bodyModel[113] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Import Box214
		bodyModel[114] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Import Box215
		bodyModel[115] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Import Box216
		bodyModel[116] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Import Box217
		bodyModel[117] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Import Box218
		bodyModel[118] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Import Box219
		bodyModel[119] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box226
		bodyModel[120] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box227
		bodyModel[121] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Import Box228
		bodyModel[122] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import Box229
		bodyModel[123] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import Box230
		bodyModel[124] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box231
		bodyModel[125] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import Box240
		bodyModel[126] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Import Box241
		bodyModel[127] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Import Box290
		bodyModel[128] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Import Box300
		bodyModel[129] = new ModelRendererTurbo(this, 473, 249, textureX, textureY); // Import Box301
		bodyModel[130] = new ModelRendererTurbo(this, 65, 257, textureX, textureY); // Import Box302
		bodyModel[131] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Import Box303
		bodyModel[132] = new ModelRendererTurbo(this, 145, 257, textureX, textureY); // Import Box304
		bodyModel[133] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Import Box308
		bodyModel[134] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Import Box311
		bodyModel[135] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Import Box312
		bodyModel[136] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Import Box270
		bodyModel[137] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Import Box109
		bodyModel[138] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Import Box118
		bodyModel[139] = new ModelRendererTurbo(this, 401, 153, textureX, textureY); // Import Box108
		bodyModel[140] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Import Box102
		bodyModel[141] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box103
		bodyModel[142] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Import Box104
		bodyModel[143] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box115
		bodyModel[144] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Import Box285
		bodyModel[145] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box286
		bodyModel[146] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box287
		bodyModel[147] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Import Box288
		bodyModel[148] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Import Box289
		bodyModel[149] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Import Box291
		bodyModel[150] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Import Box293
		bodyModel[151] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Import Box294
		bodyModel[152] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Import Box295
		bodyModel[153] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Import Box299
		bodyModel[154] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box302
		bodyModel[155] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Import Box303
		bodyModel[156] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Import Box304
		bodyModel[157] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Import Box305
		bodyModel[158] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Import Box306
		bodyModel[159] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Import Box307
		bodyModel[160] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Import Box308
		bodyModel[161] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Import Box309
		bodyModel[162] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Import Box310
		bodyModel[163] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Import Box311
		bodyModel[164] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Import Box312
		bodyModel[165] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Import Box313
		bodyModel[166] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Import Box314
		bodyModel[167] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Import Box315
		bodyModel[168] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Import Box316
		bodyModel[169] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Import Box317
		bodyModel[170] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Import Box318
		bodyModel[171] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box343
		bodyModel[172] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box344
		bodyModel[173] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box0
		bodyModel[174] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box1
		bodyModel[175] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box2
		bodyModel[176] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box3
		bodyModel[177] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Import Box4
		bodyModel[178] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box5
		bodyModel[179] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box6
		bodyModel[180] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box7
		bodyModel[181] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box8
		bodyModel[182] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Import Box9
		bodyModel[183] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box10
		bodyModel[184] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box11
		bodyModel[185] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box12
		bodyModel[186] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box13
		bodyModel[187] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box14
		bodyModel[188] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box15
		bodyModel[189] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box16
		bodyModel[190] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box17
		bodyModel[191] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Import Box18
		bodyModel[192] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Import Box19
		bodyModel[193] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box0
		bodyModel[194] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box1
		bodyModel[195] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Import Box2
		bodyModel[196] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import Box3
		bodyModel[197] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box4
		bodyModel[198] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box5
		bodyModel[199] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Import Box6
		bodyModel[200] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Import Box7
		bodyModel[201] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box8
		bodyModel[202] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import Box9
		bodyModel[203] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import Box10
		bodyModel[204] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Import Box11
		bodyModel[205] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Import Box12
		bodyModel[206] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Import Box13
		bodyModel[207] = new ModelRendererTurbo(this, 497, 177, textureX, textureY); // Import Box14
		bodyModel[208] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Import Box15
		bodyModel[209] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Import Box16
		bodyModel[210] = new ModelRendererTurbo(this, 0, 350, textureX, textureY); // Import Box17
		bodyModel[211] = new ModelRendererTurbo(this, 35, 350, textureX, textureY); // Import Box18
		bodyModel[212] = new ModelRendererTurbo(this, 449, 177, textureX, textureY); // Import Box19
		bodyModel[213] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Import Box20
		bodyModel[214] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Import Box21

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 11, 48, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,60F, 1F, 0F,15F, 4F, 0F,15F, 4F, 0F,60F, 1F, 0F); // Import Box0
		bodyModel[0].setRotationPoint(6F, -24F, -24F);

		bodyModel[1].addBox(-71F, 0F, 0F, 91, 14, 28, 0F); // Import Box6
		bodyModel[1].setRotationPoint(20F, -12F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 28, 0F,0F, 5F, 0F,-4F, 3F, 0F,-4F, 3F, 0F,0F, 5F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F); // Import Box7
		bodyModel[2].setRotationPoint(38F, -7.9F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 28, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box8
		bodyModel[3].setRotationPoint(40F, -7F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 3, 28, 0F,0F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,0F, 0F, 0F,0F, 2F, 0F,-3F, 0F, 0F,-3F, 0F, 0F,0F, 2F, 0F); // Import Box9
		bodyModel[4].setRotationPoint(40F, -3F, -14F);

		bodyModel[5].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Import Box11
		bodyModel[5].setRotationPoint(-55F, -12.5F, -27F);

		bodyModel[6].addBox(0F, 0F, 0F, 97, 1, 14, 0F); // Import Box12
		bodyModel[6].setRotationPoint(-55F, -12.5F, 13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 4F, 0F,2F, 5F, 0F,2F, 5F, 0F,0F, 4F, 0F); // Import Box13
		bodyModel[7].setRotationPoint(42F, -12.5F, -27F);

		bodyModel[8].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Import Box15
		bodyModel[8].setRotationPoint(-55F, -11.5F, -27F);

		bodyModel[9].addBox(67F, 0F, 0F, 97, 4, 1, 0F); // Import Box16
		bodyModel[9].setRotationPoint(-122F, -11.5F, 26F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 22, 11, 24, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -6F,35F, -5F, 0F,-60F, 1F, 0F,-60F, 1F, 0F,35F, -5F, -6F); // Import Box19
		bodyModel[10].setRotationPoint(-16F, -24F, 0F);

		bodyModel[11].addBox(0F, 0F, 0F, 97, 4, 1, 0F); // Import Box22
		bodyModel[11].setRotationPoint(-55F, -11.5F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 97, 4, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box23
		bodyModel[12].setRotationPoint(-55F, -11.5F, 13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F,0F, -2F, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 4F, 0F,2F, 5F, 0F,2F, 5F, 0F,0F, 4F, 0F); // Import Box24
		bodyModel[13].setRotationPoint(42F, -12.5F, 13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 22, 11, 24, 0F,0F, 0F, -6F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,35F, -5F, -6F,-60F, 1F, 0F,-60F, 1F, 0F,35F, -5F, 0F); // Import Box42
		bodyModel[14].setRotationPoint(-16F, -24F, -24F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 1, 26, 0F); // Import Box43
		bodyModel[15].setRotationPoint(-55F, -12.5F, -13F);

		bodyModel[16].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box44
		bodyModel[16].setRotationPoint(18F, -25F, 8F);

		bodyModel[17].addBox(0F, 0F, 0F, 10, 1, 10, 0F); // Import Box45
		bodyModel[17].setRotationPoint(18F, -25F, -18F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 5, 6, 0F); // Import Box52
		bodyModel[18].setRotationPoint(33F, -21F, -14F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box53
		bodyModel[19].setRotationPoint(38F, -20.5F, -13F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box56
		bodyModel[20].setRotationPoint(39F, -18.8F, -11.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,2F, 5F, 0F,0F, 4F, 0F,0F, 4F, 0F,2F, 5F, 0F); // Import Box42
		bodyModel[21].setRotationPoint(-57F, -12.5F, -27F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 14, 0F,0F, -2F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -2F, 0F,2F, 5F, 0F,0F, 4F, 0F,0F, 4F, 0F,2F, 5F, 0F); // Import Box43
		bodyModel[22].setRotationPoint(-57F, -12.5F, 13F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 21, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box60
		bodyModel[23].setRotationPoint(-52.3F, -9F, -10.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box61
		bodyModel[24].setRotationPoint(-52.4F, -9F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box63
		bodyModel[25].setRotationPoint(-52.4F, -10F, -11.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box64
		bodyModel[26].setRotationPoint(-52.4F, -10F, 10.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box65
		bodyModel[27].setRotationPoint(-52.4F, -10F, -10.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 21, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box66
		bodyModel[28].setRotationPoint(-52.4F, -1F, -10.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box67
		bodyModel[29].setRotationPoint(-53F, -6F, 0.1F);

		bodyModel[30].addShapeBox(4F, 0F, 0F, 5, 1, 9, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-1F, 0F, -2F,-2F, 0F, -1F,-2F, 0F, -2F,-2F, 0F, -1F); // Import Box75
		bodyModel[30].setRotationPoint(35.4F, -13F, 5F);
		bodyModel[30].rotateAngleZ = -0.33161256F;

		bodyModel[31].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box112
		bodyModel[31].setRotationPoint(-2.2F, -7F, 21F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box113
		bodyModel[32].setRotationPoint(-3.8F, -7F, 21F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box114
		bodyModel[33].setRotationPoint(-6F, -7F, 21F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box115
		bodyModel[34].setRotationPoint(0F, -7F, 21F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box116
		bodyModel[35].setRotationPoint(-6F, -7F, 17F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box117
		bodyModel[36].setRotationPoint(-4F, -2F, 17F);

		bodyModel[37].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box118
		bodyModel[37].setRotationPoint(-4F, 2F, 17F);
		bodyModel[37].rotateAngleZ = 0.34906585F;

		bodyModel[38].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box119
		bodyModel[38].setRotationPoint(1.8F, 3F, 17F);
		bodyModel[38].rotateAngleZ = -0.34906585F;

		bodyModel[39].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box120
		bodyModel[39].setRotationPoint(1F, 4F, 17.4F);
		bodyModel[39].rotateAngleZ = -0.34906585F;

		bodyModel[40].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box121
		bodyModel[40].setRotationPoint(-4F, 3.4F, 17.4F);
		bodyModel[40].rotateAngleZ = 0.34906585F;

		bodyModel[41].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box122
		bodyModel[41].setRotationPoint(3F, 1F, 17F);

		bodyModel[42].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box126
		bodyModel[42].setRotationPoint(-11F, 1F, 17F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box128
		bodyModel[43].setRotationPoint(19F, -7F, 21F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box129
		bodyModel[44].setRotationPoint(25F, -7F, 21F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box130
		bodyModel[45].setRotationPoint(22.8F, -7F, 21F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box131
		bodyModel[46].setRotationPoint(21.2F, -7F, 21F);

		bodyModel[47].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box132
		bodyModel[47].setRotationPoint(19F, -7F, 17F);

		bodyModel[48].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box133
		bodyModel[48].setRotationPoint(21F, 2F, 17F);
		bodyModel[48].rotateAngleZ = 0.34906585F;

		bodyModel[49].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box134
		bodyModel[49].setRotationPoint(26.8F, 3F, 17F);
		bodyModel[49].rotateAngleZ = -0.34906585F;

		bodyModel[50].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box135
		bodyModel[50].setRotationPoint(26F, 4F, 17.4F);
		bodyModel[50].rotateAngleZ = -0.34906585F;

		bodyModel[51].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box136
		bodyModel[51].setRotationPoint(21F, 3.4F, 17.4F);
		bodyModel[51].rotateAngleZ = 0.34906585F;

		bodyModel[52].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box137
		bodyModel[52].setRotationPoint(21F, -2F, 17F);

		bodyModel[53].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box139
		bodyModel[53].setRotationPoint(14F, 1F, 17F);

		bodyModel[54].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box142
		bodyModel[54].setRotationPoint(28F, 1F, 17F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box144
		bodyModel[55].setRotationPoint(-31F, -7F, 21F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box145
		bodyModel[56].setRotationPoint(-25F, -7F, 21F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box146
		bodyModel[57].setRotationPoint(-27.2F, -7F, 21F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box147
		bodyModel[58].setRotationPoint(-28.8F, -7F, 21F);

		bodyModel[59].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box148
		bodyModel[59].setRotationPoint(-31F, -7F, 17F);

		bodyModel[60].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box149
		bodyModel[60].setRotationPoint(-29F, 2F, 17F);
		bodyModel[60].rotateAngleZ = 0.34906585F;

		bodyModel[61].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box150
		bodyModel[61].setRotationPoint(-23.2F, 3F, 17F);
		bodyModel[61].rotateAngleZ = -0.34906585F;

		bodyModel[62].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box151
		bodyModel[62].setRotationPoint(-24F, 4F, 17.4F);
		bodyModel[62].rotateAngleZ = -0.34906585F;

		bodyModel[63].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box152
		bodyModel[63].setRotationPoint(-29F, 3.4F, 17.4F);
		bodyModel[63].rotateAngleZ = 0.34906585F;

		bodyModel[64].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box153
		bodyModel[64].setRotationPoint(-29F, -2F, 17F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box154
		bodyModel[65].setRotationPoint(-33F, 1F, 17F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box155
		bodyModel[66].setRotationPoint(-36F, 1F, 17F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box156
		bodyModel[67].setRotationPoint(-38F, 1F, 17F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box158
		bodyModel[68].setRotationPoint(-22F, 1F, 17F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box160
		bodyModel[69].setRotationPoint(19F, -7F, -22F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box161
		bodyModel[70].setRotationPoint(25F, -7F, -22F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box162
		bodyModel[71].setRotationPoint(22.8F, -7F, -22F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box163
		bodyModel[72].setRotationPoint(21.2F, -7F, -22F);

		bodyModel[73].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box164
		bodyModel[73].setRotationPoint(19F, -7F, -21F);

		bodyModel[74].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box165
		bodyModel[74].setRotationPoint(21F, 2F, -21F);
		bodyModel[74].rotateAngleZ = 0.34906585F;

		bodyModel[75].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box166
		bodyModel[75].setRotationPoint(26.8F, 3F, -21F);
		bodyModel[75].rotateAngleZ = -0.34906585F;

		bodyModel[76].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box167
		bodyModel[76].setRotationPoint(21F, -2F, -21F);

		bodyModel[77].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box168
		bodyModel[77].setRotationPoint(26F, 4F, -21.4F);
		bodyModel[77].rotateAngleZ = -0.34906585F;

		bodyModel[78].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box169
		bodyModel[78].setRotationPoint(21F, 3.4F, -21.4F);
		bodyModel[78].rotateAngleZ = 0.34906585F;

		bodyModel[79].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box171
		bodyModel[79].setRotationPoint(14F, 1F, -22F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box174
		bodyModel[80].setRotationPoint(28F, 1F, -22F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box176
		bodyModel[81].setRotationPoint(0F, -7F, -22F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box177
		bodyModel[82].setRotationPoint(-2.2F, -7F, -22F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box178
		bodyModel[83].setRotationPoint(-3.8F, -7F, -22F);

		bodyModel[84].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box179
		bodyModel[84].setRotationPoint(-6F, -7F, -21F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box180
		bodyModel[85].setRotationPoint(-6F, -7F, -22F);

		bodyModel[86].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box181
		bodyModel[86].setRotationPoint(-4F, 2F, -21F);
		bodyModel[86].rotateAngleZ = 0.34906585F;

		bodyModel[87].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box182
		bodyModel[87].setRotationPoint(-4F, -2F, -21F);

		bodyModel[88].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box183
		bodyModel[88].setRotationPoint(1.8F, 3F, -21F);
		bodyModel[88].rotateAngleZ = -0.34906585F;

		bodyModel[89].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box184
		bodyModel[89].setRotationPoint(1F, 4F, -21.4F);
		bodyModel[89].rotateAngleZ = -0.34906585F;

		bodyModel[90].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box185
		bodyModel[90].setRotationPoint(-4F, 3.4F, -21.4F);
		bodyModel[90].rotateAngleZ = 0.34906585F;

		bodyModel[91].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box187
		bodyModel[91].setRotationPoint(-11F, 1F, -22F);

		bodyModel[92].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box190
		bodyModel[92].setRotationPoint(3F, 1F, -22F);

		bodyModel[93].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box193
		bodyModel[93].setRotationPoint(-22F, 1F, -22F);

		bodyModel[94].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box195
		bodyModel[94].setRotationPoint(-24F, 4F, -21.4F);
		bodyModel[94].rotateAngleZ = -0.34906585F;

		bodyModel[95].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box196
		bodyModel[95].setRotationPoint(-23.2F, 3F, -21F);
		bodyModel[95].rotateAngleZ = -0.34906585F;

		bodyModel[96].addBox(0F, 0F, 0F, 3, 6, 4, 0F); // Import Box197
		bodyModel[96].setRotationPoint(-29F, -2F, -21F);

		bodyModel[97].addBox(-3F, 0F, 0F, 3, 2, 4, 0F); // Import Box198
		bodyModel[97].setRotationPoint(-29F, 2F, -21F);
		bodyModel[97].rotateAngleZ = 0.34906585F;

		bodyModel[98].addBox(-3F, 0F, 0F, 4, 1, 4, 0F); // Import Box199
		bodyModel[98].setRotationPoint(-29F, 3.4F, -21.4F);
		bodyModel[98].rotateAngleZ = 0.34906585F;

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box200
		bodyModel[99].setRotationPoint(-33F, 1F, -22F);

		bodyModel[100].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box201
		bodyModel[100].setRotationPoint(-36F, 1F, -22F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box202
		bodyModel[101].setRotationPoint(-38F, 1F, -22F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box203
		bodyModel[102].setRotationPoint(-27.2F, -7F, -22F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box204
		bodyModel[103].setRotationPoint(-25F, -7F, -22F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Import Box205
		bodyModel[104].setRotationPoint(-31F, -7F, -22F);

		bodyModel[105].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box206
		bodyModel[105].setRotationPoint(-28.8F, -7F, -22F);

		bodyModel[106].addBox(0F, 0F, 0F, 7, 5, 4, 0F); // Import Box207
		bodyModel[106].setRotationPoint(-31F, -7F, -21F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box208
		bodyModel[107].setRotationPoint(44F, -6F, 15F);

		bodyModel[108].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box209
		bodyModel[108].setRotationPoint(39F, -6F, 15F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box210
		bodyModel[109].setRotationPoint(37F, -6F, 15F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box211
		bodyModel[110].setRotationPoint(-47F, -6F, 15F);

		bodyModel[111].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box212
		bodyModel[111].setRotationPoint(-52F, -6F, 15F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box213
		bodyModel[112].setRotationPoint(-54F, -6F, 15F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box214
		bodyModel[113].setRotationPoint(-47F, -6F, -24F);

		bodyModel[114].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box215
		bodyModel[114].setRotationPoint(-52F, -6F, -24F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box216
		bodyModel[115].setRotationPoint(-54F, -6F, -24F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box217
		bodyModel[116].setRotationPoint(37F, -6F, -24F);

		bodyModel[117].addBox(0F, 0F, 0F, 5, 9, 9, 0F); // Import Box218
		bodyModel[117].setRotationPoint(39F, -6F, -24F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 9, 9, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box219
		bodyModel[118].setRotationPoint(44F, -6F, -24F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Box226
		bodyModel[119].setRotationPoint(-34F, -8F, 17F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box227
		bodyModel[120].setRotationPoint(-36F, -8F, 17F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F); // Import Box228
		bodyModel[121].setRotationPoint(-37F, -8F, 17F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Box229
		bodyModel[122].setRotationPoint(-34F, -8F, -22F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box230
		bodyModel[123].setRotationPoint(-36F, -8F, -22F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F); // Import Box231
		bodyModel[124].setRotationPoint(-37F, -8F, -22F);

		bodyModel[125].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box240
		bodyModel[125].setRotationPoint(-31F, -6F, 17F);
		bodyModel[125].rotateAngleZ = -0.34906585F;

		bodyModel[126].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box241
		bodyModel[126].setRotationPoint(-31F, -6F, -21F);
		bodyModel[126].rotateAngleZ = -0.34906585F;

		bodyModel[127].addBox(0F, 0F, 0F, 13, 8, 1, 0F); // Import Box290
		bodyModel[127].setRotationPoint(13F, -22F, 23.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 8F,0F, 0F, 8F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 8F,0F, 0F, 8F,0F, 0F, 0F,-7F, 0F, 0F); // Import Box300
		bodyModel[128].setRotationPoint(-32F, -22F, 8F);
		bodyModel[128].rotateAngleZ = 0.15707963F;

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 8F,0F, 0F, 8F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 8F,0F, 0F, 8F,0F, 0F, 0F,-7F, 0F, 0F); // Import Box301
		bodyModel[129].setRotationPoint(-39F, -21F, 8F);
		bodyModel[129].rotateAngleZ = 0.15707963F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 8F,0F, 0F, 8F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 8F,0F, 0F, 8F,0F, 0F, 0F,-7F, 0F, 0F); // Import Box302
		bodyModel[130].setRotationPoint(-45F, -20F, 8F);
		bodyModel[130].rotateAngleZ = 0.15707963F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 8F,0F, 0F, 8F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 8F,0F, 0F, 8F,0F, 0F, 0F,-7F, 0F, 0F); // Import Box303
		bodyModel[131].setRotationPoint(-52F, -19F, 8F);
		bodyModel[131].rotateAngleZ = 0.15707963F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,-7F, 0F, 8F,-7F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,-7F, 0F, 8F); // Import Box304
		bodyModel[132].setRotationPoint(-32F, -22F, -15F);
		bodyModel[132].rotateAngleZ = 0.15707963F;

		bodyModel[133].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,-7F, 0F, 8F,-7F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,-7F, 0F, 8F); // Import Box308
		bodyModel[133].setRotationPoint(-39F, -21F, -15F);
		bodyModel[133].rotateAngleZ = 0.15707963F;

		bodyModel[134].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,-7F, 0F, 8F,-7F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,-7F, 0F, 8F); // Import Box311
		bodyModel[134].setRotationPoint(-45F, -20F, -15F);
		bodyModel[134].rotateAngleZ = 0.15707963F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,-7F, 0F, 8F,-7F, 0F, 0F,0F, 0F, 0F,0F, 0F, 8F,-7F, 0F, 8F); // Import Box312
		bodyModel[135].setRotationPoint(-52F, -19F, -15F);
		bodyModel[135].rotateAngleZ = 0.15707963F;

		bodyModel[136].addShapeBox(0F, 0F, 0F, 10, 1, 7, 0F,-7F, 0F, 19F,0F, 0F, 19F,0F, 0F, 0F,-7F, 0F, 0F,-7F, 0F, 19F,0F, 0F, 19F,0F, 0F, 0F,-7F, 0F, 0F); // Import Box270
		bodyModel[136].setRotationPoint(36F, -6F, 6F);
		bodyModel[136].rotateAngleZ = 0.55850536F;

		bodyModel[137].addBox(-13F, 0F, 0.3F, 13, 1, 1, 0F); // Import Box109
		bodyModel[137].setRotationPoint(5.2F, -25F, 20F);
		bodyModel[137].rotateAngleY = 0.05235988F;

		bodyModel[138].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Import Box118
		bodyModel[138].setRotationPoint(-9F, -24.5F, 19F);

		bodyModel[139].addBox(-13F, 0F, 0F, 13, 1, 1, 0F); // Import Box108
		bodyModel[139].setRotationPoint(18F, -25F, 19F);
		bodyModel[139].rotateAngleY = -0.10471976F;

		bodyModel[140].addBox(0F, 0F, 0F, 13, 1, 1, 0F); // Import Box102
		bodyModel[140].setRotationPoint(18F, -25F, 19F);

		bodyModel[141].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box103
		bodyModel[141].setRotationPoint(30.6F, -25F, 19F);
		bodyModel[141].rotateAngleY = -0.76794487F;
		bodyModel[141].rotateAngleZ = -0.66322512F;

		bodyModel[142].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Import Box104
		bodyModel[142].setRotationPoint(34F, -21.5F, 16F);
		bodyModel[142].rotateAngleY = -0.27925268F;
		bodyModel[142].rotateAngleZ = -0.54105207F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F,8F, 0F, 0F,8F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,8F, 0F, 0F,8F, 0F, 0F,0F, 0F, 0F); // Import Box115
		bodyModel[143].setRotationPoint(40.9F, -16.9F, 14F);
		bodyModel[143].rotateAngleY = -0.80285146F;
		bodyModel[143].rotateAngleZ = -0.62831853F;

		bodyModel[144].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import Box285
		bodyModel[144].setRotationPoint(48.7F, -8.7F, 6F);
		bodyModel[144].rotateAngleY = -0.76794487F;
		bodyModel[144].rotateAngleZ = -2.04203522F;

		bodyModel[145].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box286
		bodyModel[145].setRotationPoint(37F, -18F, 18F);

		bodyModel[146].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box287
		bodyModel[146].setRotationPoint(37F, -18F, 21F);

		bodyModel[147].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box288
		bodyModel[147].setRotationPoint(38F, -18F, 21F);
		bodyModel[147].rotateAngleZ = 0.41887902F;

		bodyModel[148].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box289
		bodyModel[148].setRotationPoint(38F, -18F, 18F);
		bodyModel[148].rotateAngleZ = 0.41887902F;

		bodyModel[149].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -1F, -2F,0F, -1F, -2F,0F, -2F, 1F,0F, -2F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box291
		bodyModel[149].setRotationPoint(37.2F, -19.8F, 18F);
		bodyModel[149].rotateAngleZ = 0.41887902F;

		bodyModel[150].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box293
		bodyModel[150].setRotationPoint(37F, -18F, -22F);

		bodyModel[151].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box294
		bodyModel[151].setRotationPoint(37F, -18F, -19F);

		bodyModel[152].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box295
		bodyModel[152].setRotationPoint(38F, -18F, -19F);
		bodyModel[152].rotateAngleZ = 0.41887902F;

		bodyModel[153].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box299
		bodyModel[153].setRotationPoint(38F, -18F, -22F);
		bodyModel[153].rotateAngleZ = 0.41887902F;

		bodyModel[154].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -2F, 1F,0F, -2F, 1F,0F, -1F, -2F,0F, -1F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box302
		bodyModel[154].setRotationPoint(37.2F, -19.8F, 21F);
		bodyModel[154].rotateAngleZ = 0.41887902F;

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F); // Import Box303
		bodyModel[155].setRotationPoint(37F, -18F, 19.5F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box304
		bodyModel[156].setRotationPoint(37F, -16.8F, 19.5F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import Box305
		bodyModel[157].setRotationPoint(37F, -16.8F, -20.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F,0F, 0.2F, 0.2F); // Import Box306
		bodyModel[158].setRotationPoint(37F, -18F, -20.5F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box307
		bodyModel[159].setRotationPoint(37F, -18F, -19F);

		bodyModel[160].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box308
		bodyModel[160].setRotationPoint(38F, -18F, -19F);
		bodyModel[160].rotateAngleZ = 0.41887902F;

		bodyModel[161].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -2F, 1F,0F, -2F, 1F,0F, -1F, -2F,0F, -1F, -2F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box309
		bodyModel[161].setRotationPoint(37.2F, -19.8F, -19F);
		bodyModel[161].rotateAngleZ = 0.41887902F;

		bodyModel[162].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F,0F, -1F, -2F,0F, -1F, -2F,0F, -2F, 1F,0F, -2F, 1F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box310
		bodyModel[162].setRotationPoint(37.2F, -19.8F, -22F);
		bodyModel[162].rotateAngleZ = 0.41887902F;

		bodyModel[163].addBox(-1F, -2F, 0F, 1, 2, 1, 0F); // Import Box311
		bodyModel[163].setRotationPoint(38F, -18F, -22F);
		bodyModel[163].rotateAngleZ = 0.41887902F;

		bodyModel[164].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box312
		bodyModel[164].setRotationPoint(37F, -18F, -22F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box313
		bodyModel[165].setRotationPoint(36.5F, -13F, -3F);
		bodyModel[165].rotateAngleX = 0.85521133F;
		bodyModel[165].rotateAngleY = -1.57079633F;

		bodyModel[166].addBox(0F, 0F, 0F, 3, 7, 5, 0F); // Import Box314
		bodyModel[166].setRotationPoint(36.5F, -13F, 0F);
		bodyModel[166].rotateAngleX = 0.85521133F;
		bodyModel[166].rotateAngleY = -1.57079633F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box315
		bodyModel[167].setRotationPoint(36.5F, -13F, 2F);
		bodyModel[167].rotateAngleX = 0.85521133F;
		bodyModel[167].rotateAngleY = -1.57079633F;

		bodyModel[168].addBox(0F, 0F, 0F, 1, 9, 1, 0F); // Import Box316
		bodyModel[168].setRotationPoint(31F, -22.5F, 0F);
		bodyModel[168].rotateAngleX = 0.20943951F;
		bodyModel[168].rotateAngleZ = 0.78539816F;

		bodyModel[169].addBox(0F, 0F, -1F, 1, 9, 1, 0F); // Import Box317
		bodyModel[169].setRotationPoint(31F, -22.5F, -1F);
		bodyModel[169].rotateAngleX = -0.20943951F;
		bodyModel[169].rotateAngleZ = 0.78539816F;

		bodyModel[170].addBox(0F, 0F, 0F, 1, 4, 4, 0F); // Import Box318
		bodyModel[170].setRotationPoint(29F, -25F, -2.5F);
		bodyModel[170].rotateAngleZ = 0.78539816F;

		bodyModel[171].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Import Box343
		bodyModel[171].setRotationPoint(24F, -27F, 12F);

		bodyModel[172].addBox(0F, 0F, -18F, 1, 2, 4, 0F); // Import Box344
		bodyModel[172].setRotationPoint(24F, -27F, 2F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box0
		bodyModel[173].setRotationPoint(-24F, 1F, -22F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box1
		bodyModel[174].setRotationPoint(1F, 1F, -22F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box2
		bodyModel[175].setRotationPoint(-13F, 1F, -22F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box3
		bodyModel[176].setRotationPoint(26F, 1F, -22F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box4
		bodyModel[177].setRotationPoint(12F, 1F, -22F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box5
		bodyModel[178].setRotationPoint(-19F, 1F, -22F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box6
		bodyModel[179].setRotationPoint(6F, 1F, -22F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box7
		bodyModel[180].setRotationPoint(-8F, 1F, -22F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box8
		bodyModel[181].setRotationPoint(17F, 1F, -22F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box9
		bodyModel[182].setRotationPoint(31F, 1F, -22F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box10
		bodyModel[183].setRotationPoint(-19F, 1F, 17F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box11
		bodyModel[184].setRotationPoint(-24F, 1F, 17F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box12
		bodyModel[185].setRotationPoint(6F, 1F, 17F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box13
		bodyModel[186].setRotationPoint(1F, 1F, 17F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box14
		bodyModel[187].setRotationPoint(-8F, 1F, 17F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box15
		bodyModel[188].setRotationPoint(-13F, 1F, 17F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box16
		bodyModel[189].setRotationPoint(31F, 1F, 17F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box17
		bodyModel[190].setRotationPoint(26F, 1F, 17F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F); // Import Box18
		bodyModel[191].setRotationPoint(17F, 1F, 17F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 7, 5, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F,0F, -1.5F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1.5F, 0F); // Import Box19
		bodyModel[192].setRotationPoint(12F, 1F, 17F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Box0
		bodyModel[193].setRotationPoint(-9F, -8F, 17F);

		bodyModel[194].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box1
		bodyModel[194].setRotationPoint(-11F, -8F, 17F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F); // Import Box2
		bodyModel[195].setRotationPoint(-12F, -8F, 17F);

		bodyModel[196].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box3
		bodyModel[196].setRotationPoint(-6F, -6F, 17F);
		bodyModel[196].rotateAngleZ = -0.34906585F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Box4
		bodyModel[197].setRotationPoint(16F, -8F, 17F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box5
		bodyModel[198].setRotationPoint(14F, -8F, 17F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F); // Import Box6
		bodyModel[199].setRotationPoint(13F, -8F, 17F);

		bodyModel[200].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box7
		bodyModel[200].setRotationPoint(19F, -6F, 17F);
		bodyModel[200].rotateAngleZ = -0.34906585F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F); // Import Box8
		bodyModel[201].setRotationPoint(-12F, -8F, -22F);

		bodyModel[202].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box9
		bodyModel[202].setRotationPoint(-11F, -8F, -22F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Box10
		bodyModel[203].setRotationPoint(-9F, -8F, -22F);

		bodyModel[204].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box11
		bodyModel[204].setRotationPoint(-6F, -6F, -21F);
		bodyModel[204].rotateAngleZ = -0.34906585F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F); // Import Box12
		bodyModel[205].setRotationPoint(13F, -8F, -22F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box13
		bodyModel[206].setRotationPoint(14F, -8F, -22F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Box14
		bodyModel[207].setRotationPoint(16F, -8F, -22F);

		bodyModel[208].addBox(-3F, 0F, 0F, 4, 2, 4, 0F); // Import Box15
		bodyModel[208].setRotationPoint(19F, -6F, -21F);
		bodyModel[208].rotateAngleZ = -0.34906585F;

		bodyModel[209].addBox(0F, 0F, 0F, 5, 1, 26, 0F); // Import Box16
		bodyModel[209].setRotationPoint(-57F, -15.5F, -13F);
		bodyModel[209].rotateAngleZ = -0.33161256F;

		bodyModel[210].addBox(0F, 0F, 0F, 3, 5, 10, 0F); // Import Box17
		bodyModel[210].setRotationPoint(-53F, -19F, -5F);
		bodyModel[210].rotateAngleZ = -0.64577182F;

		bodyModel[211].addBox(0F, 0F, 0F, 4, 4, 6, 0F); // Import Box18
		bodyModel[211].setRotationPoint(-56F, -19F, -12F);
		bodyModel[211].rotateAngleZ = -0.20943951F;

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F); // Import Box19
		bodyModel[212].setRotationPoint(-53F, -18F, 6F);

		bodyModel[213].addBox(0F, 0F, 0F, 2, 4, 5, 0F); // Import Box20
		bodyModel[213].setRotationPoint(-55F, -18F, 6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 4, 5, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F,0F, -1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -1F, 0F); // Import Box21
		bodyModel[214].setRotationPoint(-56F, -18F, 6F);


		turretModel = new ModelRendererTurbo[55];
		turretModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box25
		turretModel[1] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Import Box27
		turretModel[2] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Import Box28
		turretModel[3] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Import Box31
		turretModel[4] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Import Box32
		turretModel[5] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Import Box33
		turretModel[6] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Import Box34
		turretModel[7] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Import Box35
		turretModel[8] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Import Box36
		turretModel[9] = new ModelRendererTurbo(this, 49, 137, textureX, textureY); // Import Box37
		turretModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box39
		turretModel[11] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Import Box47
		turretModel[12] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box48
		turretModel[13] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Import Box49
		turretModel[14] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import Box50
		turretModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box51
		turretModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box47
		turretModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box48
		turretModel[18] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import Box49
		turretModel[19] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box50
		turretModel[20] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box51
		turretModel[21] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box52
		turretModel[22] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box53
		turretModel[23] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box54
		turretModel[24] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box55
		turretModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box56
		turretModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box57
		turretModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box58
		turretModel[28] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box69
		turretModel[29] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box70
		turretModel[30] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box71
		turretModel[31] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box72
		turretModel[32] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box76
		turretModel[33] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Import Box325
		turretModel[34] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Import Box326
		turretModel[35] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Import Box327
		turretModel[36] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Import Box333
		turretModel[37] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Import Box335
		turretModel[38] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Import Box336
		turretModel[39] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Import Box0
		turretModel[40] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Import Box1
		turretModel[41] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Import Box15
		turretModel[42] = new ModelRendererTurbo(this, 497, 265, textureX, textureY); // Import Box18
		turretModel[43] = new ModelRendererTurbo(this, 20, 400, textureX, textureY); // Import Box4
		turretModel[44] = new ModelRendererTurbo(this, 36, 400, textureX, textureY); // Import Box5
		turretModel[45] = new ModelRendererTurbo(this, 36, 400, textureX, textureY); // Import Box7
		turretModel[46] = new ModelRendererTurbo(this, 4, 408, textureX, textureY); // Import Box8
		turretModel[47] = new ModelRendererTurbo(this, 52, 400, textureX, textureY); // Import Box9
		turretModel[48] = new ModelRendererTurbo(this, 60, 400, textureX, textureY); // Import Box10
		turretModel[49] = new ModelRendererTurbo(this, 4, 408, textureX, textureY); // Import Box11
		turretModel[50] = new ModelRendererTurbo(this, 30, 420, textureX, textureY); // Import Box299
		turretModel[51] = new ModelRendererTurbo(this, 60, 408, textureX, textureY); // Import Box13
		turretModel[52] = new ModelRendererTurbo(this, 44, 416, textureX, textureY); // Import Box14
		turretModel[53] = new ModelRendererTurbo(this, 52, 416, textureX, textureY); // Import Box15
		turretModel[54] = new ModelRendererTurbo(this, 60, 416, textureX, textureY); // Import Box16

		turretModel[0].addBox(-10F, -24F, -15F, 20, 1, 30, 0F); // Import Box25
		turretModel[0].setRotationPoint(0F, -1F, 0F);

		turretModel[1].addShapeBox(-15F, -24F, -15F, 5, 1, 30, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box27
		turretModel[1].setRotationPoint(0F, -1F, 0F);

		turretModel[2].addShapeBox(10F, -24F, -15F, 5, 1, 30, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box28
		turretModel[2].setRotationPoint(0F, -1F, 0F);

		turretModel[3].addShapeBox(10F, -25F, -16F, 5, 1, 32, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F); // Import Box31
		turretModel[3].setRotationPoint(0F, -1F, 0F);

		turretModel[4].addBox(-10F, -25F, -16F, 20, 1, 32, 0F); // Import Box32
		turretModel[4].setRotationPoint(0F, -1F, 0F);

		turretModel[5].addShapeBox(-19F, -25F, -16F, 9, 1, 32, 0F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -5F); // Import Box33
		turretModel[5].setRotationPoint(0F, -1F, 0F);

		turretModel[6].addShapeBox(-10F, -38F, -18F, 14, 13, 36, 0F,0F, 0F, -4F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -4F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box34
		turretModel[6].setRotationPoint(0F, -1F, 0F);

		turretModel[7].addShapeBox(10F, -38F, -18F, 7, 13, 36, 0F,6F, 0F, -2F,-1F, -2F, -5F,-1F, -2F, -5F,6F, 0F, -2F,6F, 0F, 0F,0F, 0F, -5F,0F, 0F, -5F,6F, 0F, 0F); // Import Box35
		turretModel[7].setRotationPoint(0F, -1F, 0F);

		turretModel[8].addShapeBox(-21F, -31F, -14F, 11, 6, 28, 0F,5F, 0F, -5F,0F, 0F, 2F,0F, 0F, 2F,5F, 0F, -5F,0F, 0F, -5F,0F, 0F, 4F,0F, 0F, 4F,0F, 0F, -5F); // Import Box36
		turretModel[8].setRotationPoint(0F, -1F, 0F);

		turretModel[9].addShapeBox(-26F, -38F, -18F, 16, 7, 36, 0F,0F, 0F, -9F,0F, 0F, -4F,0F, 0F, -4F,0F, 0F, -9F,0F, 0F, -9F,0F, 0F, -2F,0F, 0F, -2F,0F, 0F, -9F); // Import Box37
		turretModel[9].setRotationPoint(0F, -1F, 0F);

		turretModel[10].addShapeBox(16F, -35F, -10F, 3, 7, 20, 0F,0F, 1F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 1F, 0F,0F, 0F, 0F,-1F, 0F, -2F,-1F, 0F, -2F,0F, 0F, 0F); // Import Box39
		turretModel[10].setRotationPoint(0F, -1F, 0F);

		turretModel[11].addShapeBox(-12F, -40F, -12F, 14, 2, 10, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box47
		turretModel[11].setRotationPoint(0F, -1F, 0F);

		turretModel[12].addShapeBox(-12F, -40F, -14F, 14, 2, 2, 0F,-4F, 0F, -1F,-4F, 0F, -1F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box48
		turretModel[12].setRotationPoint(0F, -1F, 0F);

		turretModel[13].addShapeBox(-12F, -40F, -2F, 14, 2, 2, 0F,-2F, 0F, 0F,-2F, 0F, 0F,-4F, 0F, -1F,-4F, 0F, -1F,0F, 0F, 0F,0F, 0F, 0F,-2F, 0F, 0F,-2F, 0F, 0F); // Import Box49
		turretModel[13].setRotationPoint(0F, -1F, 0F);

		turretModel[14].addShapeBox(-6F, -39F, 7F, 10, 1, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box50
		turretModel[14].setRotationPoint(0F, -1F, 0F);
		turretModel[14].rotateAngleY = 0.54105207F;

		turretModel[15].addShapeBox(-3F, -40F, 12F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box51
		turretModel[15].setRotationPoint(0F, -1F, 0F);
		turretModel[15].rotateAngleY = 0.54105207F;

		turretModel[16].addShapeBox(-30F, -38F, -7F, 4, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box47
		turretModel[16].setRotationPoint(0F, -1F, 0F);

		turretModel[17].addShapeBox(-30F, -38F, 6F, 4, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box48
		turretModel[17].setRotationPoint(0F, -1F, 0F);

		turretModel[18].addShapeBox(-29F, -35.5F, 5F, 3, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box49
		turretModel[18].setRotationPoint(0F, -1F, 0F);

		turretModel[19].addShapeBox(-29F, -35.5F, -6F, 3, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box50
		turretModel[19].setRotationPoint(0F, -1F, 0F);

		turretModel[20].addShapeBox(-30F, -39F, -7F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box51
		turretModel[20].setRotationPoint(0F, -1F, 0F);

		turretModel[21].addShapeBox(-30F, -39F, 6F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box52
		turretModel[21].setRotationPoint(0F, -1F, 0F);

		turretModel[22].addShapeBox(0F, -40F, 12F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box53
		turretModel[22].setRotationPoint(0F, -1F, 0F);
		turretModel[22].rotateAngleY = 0.54105207F;

		turretModel[23].addShapeBox(-3F, -40.8F, 12F, 4, 1, 1, 0F,0F, -0.2F, 0F,0F, -0.2F, 0F,0F, -0.2F, 0F,0F, -0.2F, 0F,0F, -0.2F, 0F,0F, -0.2F, 0F,0F, -0.2F, 0F,0F, -0.2F, 0F); // Import Box54
		turretModel[23].setRotationPoint(0F, -1F, 0F);
		turretModel[23].rotateAngleY = 0.54105207F;

		turretModel[24].addBox(-8F, -25F, 23.2F, 6, 4, 1, 0F); // Import Box55
		turretModel[24].setRotationPoint(0F, -1F, 0F);
		turretModel[24].rotateAngleX = 0.2443461F;

		turretModel[25].addBox(-8F, -25.2F, 23.3F, 1, 1, 1, 0F); // Import Box56
		turretModel[25].setRotationPoint(0F, -1F, 0F);
		turretModel[25].rotateAngleX = 0.2443461F;

		turretModel[26].addBox(-3F, -25.2F, 23.3F, 1, 1, 1, 0F); // Import Box57
		turretModel[26].setRotationPoint(0F, -1F, 0F);
		turretModel[26].rotateAngleX = 0.2443461F;

		turretModel[27].addShapeBox(-26.5F, -37F, -3F, 1, 5, 6, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box58
		turretModel[27].setRotationPoint(0F, -1F, 0F);

		turretModel[28].addBox(8F, -39F, -11F, 1, 2, 4, 0F); // Import Box69
		turretModel[28].setRotationPoint(0F, -1F, 0F);

		turretModel[29].addShapeBox(7F, -38F, -11F, 1, 1, 4, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box70
		turretModel[29].setRotationPoint(0F, -1F, 0F);

		turretModel[30].addShapeBox(7F, -38F, 7F, 1, 1, 4, 0F,0F, 0F, 0F,0F, 1F, 0F,0F, 1F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box71
		turretModel[30].setRotationPoint(0F, -1F, 0F);

		turretModel[31].addBox(8F, -39F, 7F, 1, 2, 4, 0F); // Import Box72
		turretModel[31].setRotationPoint(0F, -1F, 0F);

		turretModel[32].addShapeBox(3.5F, -41F, -0.5F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.2F, 0F, -0.2F,-0.2F, 0F, -0.2F,-0.2F, 0F, -0.2F,-0.2F, 0F, -0.2F); // Import Box76
		turretModel[32].setRotationPoint(0F, -1F, 0F);

		turretModel[33].addBox(-11F, -23F, -34.5F, 6, 1, 6, 0F); // Import Box325
		turretModel[33].setRotationPoint(0F, -1F, 0F);
		turretModel[33].rotateAngleX = -1.43116999F;
		turretModel[33].rotateAngleY = 0.33161256F;
		turretModel[33].rotateAngleZ = 0.05235988F;

		turretModel[34].addShapeBox(-10F, -25F, -35F, 4, 2, 4, 0F,0.4F, 0F, 0.1F,0.4F, 0F, 0.1F,0.4F, 0F, 1F,0.4F, 0F, 1F,0.4F, 0F, 0.1F,0.4F, 0F, 0.1F,0.4F, 0F, 1F,0.4F, 0F, 1F); // Import Box326
		turretModel[34].setRotationPoint(0F, 0F, 0F);
		turretModel[34].rotateAngleX = -1.43116999F;
		turretModel[34].rotateAngleY = 0.33161256F;
		turretModel[34].rotateAngleZ = 0.05235988F;

		turretModel[35].addBox(-18F, -23F, -34.5F, 6, 1, 6, 0F); // Import Box327
		turretModel[35].setRotationPoint(0F, -1F, 0F);
		turretModel[35].rotateAngleX = -1.43116999F;
		turretModel[35].rotateAngleY = 0.33161256F;
		turretModel[35].rotateAngleZ = 0.05235988F;

		turretModel[36].addBox(14F, -23F, -33.5F, 6, 1, 6, 0F); // Import Box333
		turretModel[36].setRotationPoint(0F, -1F, 0F);
		turretModel[36].rotateAngleX = -1.43116999F;
		turretModel[36].rotateAngleY = -3.47320521F;
		turretModel[36].rotateAngleZ = 0.05235988F;

		turretModel[37].addBox(7F, -23F, -33.5F, 6, 1, 6, 0F); // Import Box335
		turretModel[37].setRotationPoint(0F, -1F, 0F);
		turretModel[37].rotateAngleX = -1.43116999F;
		turretModel[37].rotateAngleY = -3.47320521F;
		turretModel[37].rotateAngleZ = 0.05235988F;

		turretModel[38].addShapeBox(8F, -25F, -34F, 4, 2, 4, 0F,0.4F, 0F, 0.1F,0.4F, 0F, 0.1F,0.4F, 0F, 1F,0.4F, 0F, 1F,0.4F, 0F, 0.1F,0.4F, 0F, 0.1F,0.4F, 0F, 1F,0.4F, 0F, 1F); // Import Box336
		turretModel[38].setRotationPoint(0F, 0F, 0F);
		turretModel[38].rotateAngleX = -1.43116999F;
		turretModel[38].rotateAngleY = -3.47320521F;
		turretModel[38].rotateAngleZ = 0.05235988F;

		turretModel[39].addShapeBox(-17F, -25F, -35F, 4, 2, 4, 0F,0.4F, 0F, 0.1F,0.4F, 0F, 0.1F,0.4F, 0F, 1F,0.4F, 0F, 1F,0.4F, 0F, 0.1F,0.4F, 0F, 0.1F,0.4F, 0F, 1F,0.4F, 0F, 1F); // Import Box0
		turretModel[39].setRotationPoint(0F, 0F, 0F);
		turretModel[39].rotateAngleX = -1.43116999F;
		turretModel[39].rotateAngleY = 0.33161256F;
		turretModel[39].rotateAngleZ = 0.05235988F;

		turretModel[40].addShapeBox(15F, -25F, -34F, 4, 2, 4, 0F,0.4F, 0F, 0.1F,0.4F, 0F, 0.1F,0.4F, 0F, 1F,0.4F, 0F, 1F,0.4F, 0F, 0.1F,0.4F, 0F, 0.1F,0.4F, 0F, 1F,0.4F, 0F, 1F); // Import Box1
		turretModel[40].setRotationPoint(0F, 0F, 0F);
		turretModel[40].rotateAngleX = -1.43116999F;
		turretModel[40].rotateAngleY = -3.47320521F;
		turretModel[40].rotateAngleZ = 0.05235988F;

		turretModel[41].addShapeBox(-18.5F, -44F, 8.5F, 2, 6, 2, 0F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.5F, 0F, -0.5F,-0.2F, 0F, -0.2F,-0.2F, 0F, -0.2F,-0.2F, 0F, -0.2F,-0.2F, 0F, -0.2F); // Import Box15
		turretModel[41].setRotationPoint(0F, -1F, 0F);

		turretModel[42].addShapeBox(-15.5F, -66F, 8.5F, 2, 22, 2, 0F,-0.8F, 0F, -0.8F,-0.8F, 0F, -0.8F,-0.8F, 0F, -0.8F,-0.8F, 0F, -0.8F,-0.8F, 0F, -0.8F,-0.8F, 0F, -0.8F,-0.8F, 0F, -0.8F,-0.8F, 0F, -0.8F); // Import Box18
		turretModel[42].setRotationPoint(0F, -1F, 0F);
		turretModel[42].rotateAngleZ = 0.06981317F;

		turretModel[43].addShapeBox(-1F, -43.3F, -10.5F, 2, 2, 7, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F,0F, 0.5F, 0F); // Import Box4
		turretModel[43].setRotationPoint(0F, -1F, 0F);
		turretModel[43].rotateAngleX = -0.2268928F;
		turretModel[43].rotateAngleY = -1.37881011F;

		turretModel[44].addShapeBox(-1.5F, -41.8F, -4.7F, 1, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F); // Import Box5
		turretModel[44].setRotationPoint(0F, -1F, 0F);
		turretModel[44].rotateAngleX = -0.2268928F;
		turretModel[44].rotateAngleY = -1.37881011F;

		turretModel[45].addShapeBox(-0.5F, -42.8F, -4F, 1, 1, 10, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box7
		turretModel[45].setRotationPoint(0F, -1F, 0F);
		turretModel[45].rotateAngleX = -0.2268928F;
		turretModel[45].rotateAngleY = -1.37881011F;

		turretModel[46].addShapeBox(-0.5F, -42.8F, -3.5F, 1, 1, 10, 0F,-0.1F, -0.1F, 0F,-0.1F, -0.1F, 0F,-0.1F, -0.1F, 0F,-0.1F, -0.1F, 0F,-0.1F, -0.1F, 0F,-0.1F, -0.1F, 0F,-0.1F, -0.1F, 0F,-0.1F, -0.1F, 0F); // Import Box8
		turretModel[46].setRotationPoint(0F, -1F, 0F);
		turretModel[46].rotateAngleX = -0.2268928F;
		turretModel[46].rotateAngleY = -1.37881011F;

		turretModel[47].addShapeBox(-0.5F, -42.3F, -12F, 1, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box9
		turretModel[47].setRotationPoint(0F, -1F, 0F);
		turretModel[47].rotateAngleX = -0.2268928F;
		turretModel[47].rotateAngleY = -1.37881011F;

		turretModel[48].addShapeBox(-0.5F, -42.3F, -12F, 1, 3, 1, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 0F,-0.2F, -0.2F, 1F,-0.2F, -0.2F, 1F,-0.2F, -0.2F, -1F,-0.2F, -0.2F, -1F); // Import Box10
		turretModel[48].setRotationPoint(0F, -1F, 0F);
		turretModel[48].rotateAngleX = -0.2268928F;
		turretModel[48].rotateAngleY = -1.37881011F;

		turretModel[49].addShapeBox(-0.5F, -44F, -4.6F, 1, 1, 1, 0F,0F, 0F, -0.9F,0F, 0F, -0.9F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, -0.9F,0F, 0F, -0.9F,0F, 0F, 0F,0F, 0F, 0F); // Import Box11
		turretModel[49].setRotationPoint(0F, -1F, 0F);
		turretModel[49].rotateAngleX = -0.2268928F;
		turretModel[49].rotateAngleY = -1.37881011F;

		turretModel[50].addShapeBox(-4F, -43.7F, -6F, 3, 2, 4, 0F,0.5F, 0F, -0.6F,0F, 0F, -0.6F,0F, 0F, -0.6F,0.5F, 0F, -0.6F,0.5F, 0.5F, -0.6F,0F, 0.5F, -0.6F,0F, 0.5F, -0.6F,0.5F, 0.5F, -0.6F); // Import Box299
		turretModel[50].setRotationPoint(0F, -1F, 0F);
		turretModel[50].rotateAngleX = -0.17453293F;
		turretModel[50].rotateAngleY = -1.37881011F;

		turretModel[51].addShapeBox(-0.5F, -43.3F, -10F, 1, 1, 2, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box13
		turretModel[51].setRotationPoint(0F, -1.5F, 0F);
		turretModel[51].rotateAngleX = -0.2268928F;
		turretModel[51].rotateAngleY = -1.37881011F;

		turretModel[52].addShapeBox(-0.5F, -43.3F, -10F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.4F,-0.2F, -0.2F, -0.4F,-0.2F, -0.2F, -0.4F,-0.2F, -0.2F, -0.4F,-0.2F, -0.2F, -0.4F,-0.2F, -0.2F, -0.4F,-0.2F, -0.2F, -0.4F,-0.2F, -0.2F, -0.4F); // Import Box14
		turretModel[52].setRotationPoint(0F, -2.2F, 0F);
		turretModel[52].rotateAngleX = -0.2268928F;
		turretModel[52].rotateAngleY = -1.37881011F;

		turretModel[53].addShapeBox(0.5F, -41.8F, -4.7F, 1, 2, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F); // Import Box15
		turretModel[53].setRotationPoint(0F, -1F, 0F);
		turretModel[53].rotateAngleX = -0.2268928F;
		turretModel[53].rotateAngleY = -1.37881011F;

		turretModel[54].addShapeBox(-0.5F, -40.5F, -4.7F, 1, 1, 1, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F,0F, -0.5F, 0F); // Import Box16
		turretModel[54].setRotationPoint(0F, -1F, 0F);
		turretModel[54].rotateAngleX = -0.2268928F;
		turretModel[54].rotateAngleY = -1.37881011F;


		barrelModel = new ModelRendererTurbo[5];
		barrelModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box38
		barrelModel[1] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Import Box40
		barrelModel[2] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box41
		barrelModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box54
		barrelModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box55

		barrelModel[0].addShapeBox(0F, -4F, -10F, 3, 9, 20, 0F,0F, 1F, 0F,0F, 0F, -2F,0F, 0F, -2F,0F, 1F, 0F,0F, 0F, 0F,-1F, 0F, -2F,-1F, 0F, -2F,0F, 0F, 0F); // Import Box38
		barrelModel[0].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[1].addShapeBox(-1F, -1.5F, -1.5F, 45, 3, 3, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F); // Import Box40
		barrelModel[1].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[2].addShapeBox(-1F, -2.5F, -2.5F, 9, 5, 5, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F); // Import Box41
		barrelModel[2].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[3].addShapeBox(44F, -1.5F, -1.5F, 2, 3, 3, 0F,0F, -0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F,0F, -0.5F, -0.5F,0F, 0F, 0F,0F, 0F, 0F,0F, -0.5F, -0.5F); // Import Box54
		barrelModel[3].setRotationPoint(17.5F, -32.5F, 0F);

		barrelModel[4].addShapeBox(46F, -1.5F, -1.5F, 5, 3, 3, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F); // Import Box55
		barrelModel[4].setRotationPoint(17.5F, -32.5F, 0F);


		leftTrackModel = new ModelRendererTurbo[22];
		leftTrackModel[0] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Import Box268
		leftTrackModel[1] = new ModelRendererTurbo(this, 473, 209, textureX, textureY); // Import Box269
		leftTrackModel[2] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Import Box270
		leftTrackModel[3] = new ModelRendererTurbo(this, 137, 209, textureX, textureY); // Import Box271
		leftTrackModel[4] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Import Box272
		leftTrackModel[5] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Import Box273
		leftTrackModel[6] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Import Box274
		leftTrackModel[7] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Import Box275
		leftTrackModel[8] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Import Box276
		leftTrackModel[9] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Import Box277
		leftTrackModel[10] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Import Box278
		leftTrackModel[11] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Import Box279
		leftTrackModel[12] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Import Box280
		leftTrackModel[13] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Import Box281
		leftTrackModel[14] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Import Box282
		leftTrackModel[15] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Import Box283
		leftTrackModel[16] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Import Box284
		leftTrackModel[17] = new ModelRendererTurbo(this, 161, 241, textureX, textureY); // Import Box285
		leftTrackModel[18] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Import Box286
		leftTrackModel[19] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Import Box287
		leftTrackModel[20] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Import Box288
		leftTrackModel[21] = new ModelRendererTurbo(this, 17, 249, textureX, textureY); // Import Box289

		leftTrackModel[0].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box268
		leftTrackModel[0].setRotationPoint(45.5F, -5.2F, -25F);

		leftTrackModel[1].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box269
		leftTrackModel[1].setRotationPoint(46F, -4.5F, -25F);
		leftTrackModel[1].rotateAngleZ = -3.71755131F;

		leftTrackModel[2].addBox(0F, 0F, 0F, 17, 1, 11, 0F); // Import Box270
		leftTrackModel[2].setRotationPoint(27F, -7F, -25F);

		leftTrackModel[3].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box271
		leftTrackModel[3].setRotationPoint(27F, -6F, -25F);
		leftTrackModel[3].rotateAngleZ = -3.4906585F;

		leftTrackModel[4].addBox(0F, 0F, 0F, 8, 1, 11, 0F); // Import Box272
		leftTrackModel[4].setRotationPoint(17.5F, -7.6F, -25F);

		leftTrackModel[5].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box273
		leftTrackModel[5].setRotationPoint(17.5F, -6.6F, -25F);
		leftTrackModel[5].rotateAngleZ = -3.85717765F;

		leftTrackModel[6].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box274
		leftTrackModel[6].setRotationPoint(14.5F, -8.2F, -25F);
		leftTrackModel[6].rotateAngleZ = 3.66519143F;

		leftTrackModel[7].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F); // Import Box275
		leftTrackModel[7].setRotationPoint(-7F, -7.6F, -25F);

		leftTrackModel[8].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box276
		leftTrackModel[8].setRotationPoint(13.5F, -8.6F, -25F);

		leftTrackModel[9].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box277
		leftTrackModel[9].setRotationPoint(-7.5F, -6.6F, -25F);
		leftTrackModel[9].rotateAngleZ = -3.85717765F;

		leftTrackModel[10].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box278
		leftTrackModel[10].setRotationPoint(-11.5F, -8.6F, -25F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box279
		leftTrackModel[11].setRotationPoint(-10.5F, -8.2F, -25F);
		leftTrackModel[11].rotateAngleZ = 3.66519143F;

		leftTrackModel[12].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F); // Import Box280
		leftTrackModel[12].setRotationPoint(-32F, -7.6F, -25F);

		leftTrackModel[13].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box281
		leftTrackModel[13].setRotationPoint(-32.5F, -6.6F, -25F);
		leftTrackModel[13].rotateAngleZ = -3.85717765F;

		leftTrackModel[14].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box282
		leftTrackModel[14].setRotationPoint(-36.5F, -8.6F, -25F);

		leftTrackModel[15].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box283
		leftTrackModel[15].setRotationPoint(-35.5F, -8.2F, -25F);
		leftTrackModel[15].rotateAngleZ = 3.66519143F;

		leftTrackModel[16].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F); // Import Box284
		leftTrackModel[16].setRotationPoint(-51F, -7F, -25F);
		leftTrackModel[16].rotateAngleZ = 0.05235988F;

		leftTrackModel[17].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Import Box285
		leftTrackModel[17].setRotationPoint(-51F, -6.2F, -25F);
		leftTrackModel[17].rotateAngleZ = 3.7350046F;

		leftTrackModel[18].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box286
		leftTrackModel[18].setRotationPoint(-54.8F, -4.8F, -25F);

		leftTrackModel[19].addShapeBox(0F, -1F, 0F, 14, 1, 11, 0F,0F, 0F, 0F,0.5F, -0.3F, 0F,0.5F, -0.3F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,0F, 0F, 0F); // Import Box287
		leftTrackModel[19].setRotationPoint(-55F, 2F, -25F);
		leftTrackModel[19].rotateAngleZ = -0.48869219F;

		leftTrackModel[20].addBox(0F, 0F, 0F, 77, 1, 11, 0F); // Import Box288
		leftTrackModel[20].setRotationPoint(-42F, 8F, -25F);

		leftTrackModel[21].addShapeBox(0F, -1F, 0F, 13, 1, 11, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, -0.3F, 0F,0.5F, -0.3F, 0F,0F, 0F, 0F); // Import Box289
		leftTrackModel[21].setRotationPoint(35F, 9F, -25F);
		leftTrackModel[21].rotateAngleZ = 0.54105207F;


		rightTrackModel = new ModelRendererTurbo[24];
		rightTrackModel[0] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Import Box244
		rightTrackModel[1] = new ModelRendererTurbo(this, 9, 193, textureX, textureY); // Import Box245
		rightTrackModel[2] = new ModelRendererTurbo(this, 217, 193, textureX, textureY); // Import Box246
		rightTrackModel[3] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Import Box247
		rightTrackModel[4] = new ModelRendererTurbo(this, 473, 193, textureX, textureY); // Import Box248
		rightTrackModel[5] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Import Box249
		rightTrackModel[6] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Import Box250
		rightTrackModel[7] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Import Box252
		rightTrackModel[8] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Import Box253
		rightTrackModel[9] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Import Box255
		rightTrackModel[10] = new ModelRendererTurbo(this, 289, 201, textureX, textureY); // Import Box256
		rightTrackModel[11] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Import Box257
		rightTrackModel[12] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Import Box258
		rightTrackModel[13] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Import Box259
		rightTrackModel[14] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Import Box260
		rightTrackModel[15] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Import Box261
		rightTrackModel[16] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // Import Box262
		rightTrackModel[17] = new ModelRendererTurbo(this, 409, 209, textureX, textureY); // Import Box263
		rightTrackModel[18] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Import Box264
		rightTrackModel[19] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Import Box265
		rightTrackModel[20] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Import Box266
		rightTrackModel[21] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Import Box267
		rightTrackModel[22] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Import Box276
		rightTrackModel[23] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Import Box277

		rightTrackModel[0].addBox(0F, 0F, 0F, 17, 1, 11, 0F); // Import Box244
		rightTrackModel[0].setRotationPoint(27F, -7F, 14F);

		rightTrackModel[1].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box245
		rightTrackModel[1].setRotationPoint(27F, -6F, 14F);
		rightTrackModel[1].rotateAngleZ = -3.4906585F;

		rightTrackModel[2].addBox(0F, 0F, 0F, 8, 1, 11, 0F); // Import Box246
		rightTrackModel[2].setRotationPoint(17.5F, -7.6F, 14F);

		rightTrackModel[3].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box247
		rightTrackModel[3].setRotationPoint(17.5F, -6.6F, 14F);
		rightTrackModel[3].rotateAngleZ = -3.85717765F;

		rightTrackModel[4].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box248
		rightTrackModel[4].setRotationPoint(13.5F, -8.6F, 14F);

		rightTrackModel[5].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box249
		rightTrackModel[5].setRotationPoint(14.5F, -8.2F, 14F);
		rightTrackModel[5].rotateAngleZ = 3.66519143F;

		rightTrackModel[6].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box250
		rightTrackModel[6].setRotationPoint(-7.5F, -6.6F, 14F);
		rightTrackModel[6].rotateAngleZ = -3.85717765F;

		rightTrackModel[7].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box252
		rightTrackModel[7].setRotationPoint(-11.5F, -8.6F, 14F);

		rightTrackModel[8].addBox(0F, 0F, 0F, 2, 1, 11, 0F); // Import Box253
		rightTrackModel[8].setRotationPoint(-32.5F, -6.6F, 14F);
		rightTrackModel[8].rotateAngleZ = -3.85717765F;

		rightTrackModel[9].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box255
		rightTrackModel[9].setRotationPoint(-36.5F, -8.6F, 14F);

		rightTrackModel[10].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F); // Import Box256
		rightTrackModel[10].setRotationPoint(-7F, -7.6F, 14F);

		rightTrackModel[11].addShapeBox(0F, 0F, 0F, 19, 1, 11, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F); // Import Box257
		rightTrackModel[11].setRotationPoint(-32F, -7.6F, 14F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box258
		rightTrackModel[12].setRotationPoint(-10.5F, -8.2F, 14F);
		rightTrackModel[12].rotateAngleZ = 3.66519143F;

		rightTrackModel[13].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F,0.5F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, 0F, 0F); // Import Box259
		rightTrackModel[13].setRotationPoint(-51F, -7F, 14F);
		rightTrackModel[13].rotateAngleZ = 0.05235988F;

		rightTrackModel[14].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box260
		rightTrackModel[14].setRotationPoint(-35.5F, -8.2F, 14F);
		rightTrackModel[14].rotateAngleZ = 3.66519143F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 3, 1, 11, 0F); // Import Box261
		rightTrackModel[15].setRotationPoint(46F, -4.5F, 14F);
		rightTrackModel[15].rotateAngleZ = -3.71755131F;

		rightTrackModel[16].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box262
		rightTrackModel[16].setRotationPoint(45.5F, -5.2F, 14F);

		rightTrackModel[17].addBox(0F, 0F, 0F, 4, 1, 11, 0F); // Import Box263
		rightTrackModel[17].setRotationPoint(-51F, -6.2F, 14F);
		rightTrackModel[17].rotateAngleZ = 3.7350046F;

		rightTrackModel[18].addBox(0F, 0F, 0F, 1, 7, 11, 0F); // Import Box264
		rightTrackModel[18].setRotationPoint(-54.8F, -4.8F, 14F);

		rightTrackModel[19].addBox(0F, 0F, 0F, 77, 1, 11, 0F); // Import Box265
		rightTrackModel[19].setRotationPoint(-42F, 8F, 14F);

		rightTrackModel[20].addShapeBox(0F, -1F, 0F, 13, 1, 11, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, -0.3F, 0F,0.5F, -0.3F, 0F,0F, 0F, 0F); // Import Box266
		rightTrackModel[20].setRotationPoint(35F, 9F, 14F);
		rightTrackModel[20].rotateAngleZ = 0.54105207F;

		rightTrackModel[21].addShapeBox(0F, -1F, 0F, 14, 1, 11, 0F,0F, 0F, 0F,0.5F, -0.3F, 0F,0.5F, -0.3F, 0F,0F, 0F, 0F,0F, 0F, 0F,1F, 0F, 0F,1F, 0F, 0F,0F, 0F, 0F); // Import Box267
		rightTrackModel[21].setRotationPoint(-55F, 2F, 14F);
		rightTrackModel[21].rotateAngleZ = -0.48869219F;

		rightTrackModel[22].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,0.5F, -0.3F, 0F,0.5F, -0.3F, 0F,0F, 0F, 0F); // Import Box276
		rightTrackModel[22].setRotationPoint(43F, -13F, 5F);
		rightTrackModel[22].rotateAngleZ = 2.67035376F;

		rightTrackModel[23].addShapeBox(0F, 0F, 0F, 13, 1, 11, 0F,-10F, 0F, 0F,0F, 0F, 0F,0F, 0F, 0F,-10F, 0F, 0F,-10F, 0F, 0F,0.5F, -0.3F, 0F,0.5F, -0.3F, 0F,-10F, 0F, 0F); // Import Box277
		rightTrackModel[23].setRotationPoint(36.8F, -2.2F, 5F);
		rightTrackModel[23].rotateAngleZ = 1.09955743F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}