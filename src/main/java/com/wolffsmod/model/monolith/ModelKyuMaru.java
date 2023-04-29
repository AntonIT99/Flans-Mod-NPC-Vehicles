//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.wolffsmod.model.monolith; //Path where the model is located

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.model.ModelFlanVehicle;

public class ModelKyuMaru extends ModelFlanVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKyuMaru() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[306];
		turretModel = new ModelRendererTurbo[247];
		barrelModel = new ModelRendererTurbo[74];
		leftTrackWheelModels = new ModelRendererTurbo[140];
		rightTrackWheelModels = new ModelRendererTurbo[140];
		leftTrackModel = new ModelRendererTurbo[7];
		rightTrackModel = new ModelRendererTurbo[7];

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
		bodyModel[0] = new ModelRendererTurbo(this, 444, 174, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 348, 286, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core100
		bodyModel[3] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core101
		bodyModel[4] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core102
		bodyModel[5] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core103
		bodyModel[6] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core104
		bodyModel[7] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core105
		bodyModel[8] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core106
		bodyModel[9] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core107
		bodyModel[10] = new ModelRendererTurbo(this, 42, 115, textureX, textureY); // Core108
		bodyModel[11] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core109
		bodyModel[12] = new ModelRendererTurbo(this, 11, 410, textureX, textureY); // Core11
		bodyModel[13] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core110
		bodyModel[14] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core111
		bodyModel[15] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core112
		bodyModel[16] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core113
		bodyModel[17] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core114
		bodyModel[18] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core115
		bodyModel[19] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core116
		bodyModel[20] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core117
		bodyModel[21] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core118
		bodyModel[22] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core119
		bodyModel[23] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core12
		bodyModel[24] = new ModelRendererTurbo(this, 42, 115, textureX, textureY); // Core120
		bodyModel[25] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core121
		bodyModel[26] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core122
		bodyModel[27] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core123
		bodyModel[28] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core124
		bodyModel[29] = new ModelRendererTurbo(this, 484, 347, textureX, textureY); // Core125
		bodyModel[30] = new ModelRendererTurbo(this, 484, 347, textureX, textureY); // Core126
		bodyModel[31] = new ModelRendererTurbo(this, 389, 257, textureX, textureY); // Core127
		bodyModel[32] = new ModelRendererTurbo(this, 389, 257, textureX, textureY); // Core128
		bodyModel[33] = new ModelRendererTurbo(this, 389, 257, textureX, textureY); // Core129
		bodyModel[34] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core13
		bodyModel[35] = new ModelRendererTurbo(this, 389, 257, textureX, textureY); // Core130
		bodyModel[36] = new ModelRendererTurbo(this, 389, 257, textureX, textureY); // Core131
		bodyModel[37] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core132
		bodyModel[38] = new ModelRendererTurbo(this, 42, 115, textureX, textureY); // Core133
		bodyModel[39] = new ModelRendererTurbo(this, 389, 257, textureX, textureY); // Core134
		bodyModel[40] = new ModelRendererTurbo(this, 419, 323, textureX, textureY); // Core135
		bodyModel[41] = new ModelRendererTurbo(this, 497, 254, textureX, textureY); // Core136
		bodyModel[42] = new ModelRendererTurbo(this, 449, 259, textureX, textureY); // Core137
		bodyModel[43] = new ModelRendererTurbo(this, 417, 306, textureX, textureY); // Core138
		bodyModel[44] = new ModelRendererTurbo(this, 558, 322, textureX, textureY); // Core139
		bodyModel[45] = new ModelRendererTurbo(this, 11, 410, textureX, textureY); // Core14
		bodyModel[46] = new ModelRendererTurbo(this, 529, 321, textureX, textureY); // Core140
		bodyModel[47] = new ModelRendererTurbo(this, 602, 326, textureX, textureY); // Core141
		bodyModel[48] = new ModelRendererTurbo(this, 487, 324, textureX, textureY); // Core142
		bodyModel[49] = new ModelRendererTurbo(this, 21, 119, textureX, textureY); // Core143
		bodyModel[50] = new ModelRendererTurbo(this, 42, 123, textureX, textureY); // Core144
		bodyModel[51] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core145
		bodyModel[52] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core146
		bodyModel[53] = new ModelRendererTurbo(this, 42, 123, textureX, textureY); // Core147
		bodyModel[54] = new ModelRendererTurbo(this, 42, 123, textureX, textureY); // Core148
		bodyModel[55] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core149
		bodyModel[56] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core15
		bodyModel[57] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Core150
		bodyModel[58] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Core151
		bodyModel[59] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Core152
		bodyModel[60] = new ModelRendererTurbo(this, 57, 109, textureX, textureY); // Core153
		bodyModel[61] = new ModelRendererTurbo(this, 57, 117, textureX, textureY); // Core154
		bodyModel[62] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Core155
		bodyModel[63] = new ModelRendererTurbo(this, 45, 109, textureX, textureY); // Core156
		bodyModel[64] = new ModelRendererTurbo(this, 45, 109, textureX, textureY); // Core157
		bodyModel[65] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Core158
		bodyModel[66] = new ModelRendererTurbo(this, 45, 109, textureX, textureY); // Core159
		bodyModel[67] = new ModelRendererTurbo(this, 348, 286, textureX, textureY); // Core16
		bodyModel[68] = new ModelRendererTurbo(this, 419, 347, textureX, textureY); // Core160
		bodyModel[69] = new ModelRendererTurbo(this, 355, 349, textureX, textureY); // Core161
		bodyModel[70] = new ModelRendererTurbo(this, 47, 104, textureX, textureY); // Core162
		bodyModel[71] = new ModelRendererTurbo(this, 13, 96, textureX, textureY); // Core163
		bodyModel[72] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core164
		bodyModel[73] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core165
		bodyModel[74] = new ModelRendererTurbo(this, 11, 349, textureX, textureY); // Core166
		bodyModel[75] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core167
		bodyModel[76] = new ModelRendererTurbo(this, 11, 357, textureX, textureY); // Core168
		bodyModel[77] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core169
		bodyModel[78] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Core17
		bodyModel[79] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core170
		bodyModel[80] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core171
		bodyModel[81] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core172
		bodyModel[82] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core173
		bodyModel[83] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core174
		bodyModel[84] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core175
		bodyModel[85] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core176
		bodyModel[86] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core177
		bodyModel[87] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core178
		bodyModel[88] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core179
		bodyModel[89] = new ModelRendererTurbo(this, 635, 89, textureX, textureY); // Core18
		bodyModel[90] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core180
		bodyModel[91] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core181
		bodyModel[92] = new ModelRendererTurbo(this, 348, 263, textureX, textureY); // Core182
		bodyModel[93] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core183
		bodyModel[94] = new ModelRendererTurbo(this, 13, 89, textureX, textureY); // Core184
		bodyModel[95] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core185
		bodyModel[96] = new ModelRendererTurbo(this, 69, 349, textureX, textureY); // Core186
		bodyModel[97] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core187
		bodyModel[98] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core188
		bodyModel[99] = new ModelRendererTurbo(this, 128, 349, textureX, textureY); // Core189
		bodyModel[100] = new ModelRendererTurbo(this, 419, 347, textureX, textureY); // Core19
		bodyModel[101] = new ModelRendererTurbo(this, 181, 349, textureX, textureY); // Core190
		bodyModel[102] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core191
		bodyModel[103] = new ModelRendererTurbo(this, 47, 94, textureX, textureY); // Core192
		bodyModel[104] = new ModelRendererTurbo(this, 238, 349, textureX, textureY); // Core193
		bodyModel[105] = new ModelRendererTurbo(this, 57, 109, textureX, textureY); // Core194
		bodyModel[106] = new ModelRendererTurbo(this, 294, 349, textureX, textureY); // Core195
		bodyModel[107] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Core196
		bodyModel[108] = new ModelRendererTurbo(this, 57, 117, textureX, textureY); // Core197
		bodyModel[109] = new ModelRendererTurbo(this, 339, 349, textureX, textureY); // Core198
		bodyModel[110] = new ModelRendererTurbo(this, 379, 359, textureX, textureY); // Core199
		bodyModel[111] = new ModelRendererTurbo(this, 282, 187, textureX, textureY); // Core2
		bodyModel[112] = new ModelRendererTurbo(this, 11, 323, textureX, textureY); // Core20
		bodyModel[113] = new ModelRendererTurbo(this, 45, 109, textureX, textureY); // Core200
		bodyModel[114] = new ModelRendererTurbo(this, 45, 109, textureX, textureY); // Core201
		bodyModel[115] = new ModelRendererTurbo(this, 355, 360, textureX, textureY); // Core202
		bodyModel[116] = new ModelRendererTurbo(this, 11, 357, textureX, textureY); // Core203
		bodyModel[117] = new ModelRendererTurbo(this, 45, 109, textureX, textureY); // Core204
		bodyModel[118] = new ModelRendererTurbo(this, 21, 119, textureX, textureY); // Core205
		bodyModel[119] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core206
		bodyModel[120] = new ModelRendererTurbo(this, 11, 349, textureX, textureY); // Core207
		bodyModel[121] = new ModelRendererTurbo(this, 47, 104, textureX, textureY); // Core208
		bodyModel[122] = new ModelRendererTurbo(this, 69, 349, textureX, textureY); // Core209
		bodyModel[123] = new ModelRendererTurbo(this, 159, 117, textureX, textureY); // Core210
		bodyModel[124] = new ModelRendererTurbo(this, 397, 289, textureX, textureY); // Core211
		bodyModel[125] = new ModelRendererTurbo(this, 128, 349, textureX, textureY); // Core212
		bodyModel[126] = new ModelRendererTurbo(this, 397, 289, textureX, textureY); // Core213
		bodyModel[127] = new ModelRendererTurbo(this, 181, 349, textureX, textureY); // Core214
		bodyModel[128] = new ModelRendererTurbo(this, 238, 349, textureX, textureY); // Core215
		bodyModel[129] = new ModelRendererTurbo(this, 150, 132, textureX, textureY); // Core216
		bodyModel[130] = new ModelRendererTurbo(this, 150, 132, textureX, textureY); // Core217
		bodyModel[131] = new ModelRendererTurbo(this, 294, 349, textureX, textureY); // Core218
		bodyModel[132] = new ModelRendererTurbo(this, 150, 132, textureX, textureY); // Core219
		bodyModel[133] = new ModelRendererTurbo(this, 13, 119, textureX, textureY); // Core22
		bodyModel[134] = new ModelRendererTurbo(this, 339, 349, textureX, textureY); // Core220
		bodyModel[135] = new ModelRendererTurbo(this, 150, 132, textureX, textureY); // Core221
		bodyModel[136] = new ModelRendererTurbo(this, 355, 349, textureX, textureY); // Core222
		bodyModel[137] = new ModelRendererTurbo(this, 355, 360, textureX, textureY); // Core223
		bodyModel[138] = new ModelRendererTurbo(this, 192, 138, textureX, textureY); // Core224
		bodyModel[139] = new ModelRendererTurbo(this, 192, 138, textureX, textureY); // Core225
		bodyModel[140] = new ModelRendererTurbo(this, 379, 359, textureX, textureY); // Core226
		bodyModel[141] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core227
		bodyModel[142] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Core228
		bodyModel[143] = new ModelRendererTurbo(this, 192, 138, textureX, textureY); // Core229
		bodyModel[144] = new ModelRendererTurbo(this, 21, 119, textureX, textureY); // Core23
		bodyModel[145] = new ModelRendererTurbo(this, 192, 138, textureX, textureY); // Core230
		bodyModel[146] = new ModelRendererTurbo(this, 192, 138, textureX, textureY); // Core231
		bodyModel[147] = new ModelRendererTurbo(this, 192, 138, textureX, textureY); // Core232
		bodyModel[148] = new ModelRendererTurbo(this, 197, 103, textureX, textureY); // Core233
		bodyModel[149] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core234
		bodyModel[150] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core235
		bodyModel[151] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core236
		bodyModel[152] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core237
		bodyModel[153] = new ModelRendererTurbo(this, 38, 89, textureX, textureY); // Core238
		bodyModel[154] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core239
		bodyModel[155] = new ModelRendererTurbo(this, 13, 104, textureX, textureY); // Core24
		bodyModel[156] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core240
		bodyModel[157] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core241
		bodyModel[158] = new ModelRendererTurbo(this, 206, 119, textureX, textureY); // Core242
		bodyModel[159] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core243
		bodyModel[160] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core244
		bodyModel[161] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core245
		bodyModel[162] = new ModelRendererTurbo(this, 191, 119, textureX, textureY); // Core246
		bodyModel[163] = new ModelRendererTurbo(this, 13, 104, textureX, textureY); // Core247
		bodyModel[164] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core248
		bodyModel[165] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core249
		bodyModel[166] = new ModelRendererTurbo(this, 13, 89, textureX, textureY); // Core25
		bodyModel[167] = new ModelRendererTurbo(this, 203, 132, textureX, textureY); // Core250
		bodyModel[168] = new ModelRendererTurbo(this, 150, 132, textureX, textureY); // Core251
		bodyModel[169] = new ModelRendererTurbo(this, 763, 251, textureX, textureY); // Core252
		bodyModel[170] = new ModelRendererTurbo(this, 763, 251, textureX, textureY); // Core253
		bodyModel[171] = new ModelRendererTurbo(this, 822, 264, textureX, textureY); // Core254
		bodyModel[172] = new ModelRendererTurbo(this, 822, 264, textureX, textureY); // Core255
		bodyModel[173] = new ModelRendererTurbo(this, 763, 251, textureX, textureY); // Core256
		bodyModel[174] = new ModelRendererTurbo(this, 679, 253, textureX, textureY); // Core257
		bodyModel[175] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core258
		bodyModel[176] = new ModelRendererTurbo(this, 13, 96, textureX, textureY); // Core259
		bodyModel[177] = new ModelRendererTurbo(this, 13, 135, textureX, textureY); // Core26
		bodyModel[178] = new ModelRendererTurbo(this, 679, 300, textureX, textureY); // Core260
		bodyModel[179] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core261
		bodyModel[180] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core262
		bodyModel[181] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core263
		bodyModel[182] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core264
		bodyModel[183] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core265
		bodyModel[184] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core266
		bodyModel[185] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core267
		bodyModel[186] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core268
		bodyModel[187] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core269
		bodyModel[188] = new ModelRendererTurbo(this, 659, 299, textureX, textureY); // Core27
		bodyModel[189] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core270
		bodyModel[190] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core271
		bodyModel[191] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core272
		bodyModel[192] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core273
		bodyModel[193] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core274
		bodyModel[194] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core275
		bodyModel[195] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core276
		bodyModel[196] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core277
		bodyModel[197] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core278
		bodyModel[198] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core279
		bodyModel[199] = new ModelRendererTurbo(this, 455, 347, textureX, textureY); // Core28
		bodyModel[200] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core280
		bodyModel[201] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core281
		bodyModel[202] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core282
		bodyModel[203] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core283
		bodyModel[204] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core284
		bodyModel[205] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core285
		bodyModel[206] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core286
		bodyModel[207] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core287
		bodyModel[208] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core288
		bodyModel[209] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core289
		bodyModel[210] = new ModelRendererTurbo(this, 455, 347, textureX, textureY); // Core29
		bodyModel[211] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core290
		bodyModel[212] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core291
		bodyModel[213] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core292
		bodyModel[214] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core293
		bodyModel[215] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core294
		bodyModel[216] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core295
		bodyModel[217] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core296
		bodyModel[218] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core297
		bodyModel[219] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core298
		bodyModel[220] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core299
		bodyModel[221] = new ModelRendererTurbo(this, 11, 323, textureX, textureY); // Core3
		bodyModel[222] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core30
		bodyModel[223] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core300
		bodyModel[224] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core301
		bodyModel[225] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core302
		bodyModel[226] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core303
		bodyModel[227] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core304
		bodyModel[228] = new ModelRendererTurbo(this, 371, 317, textureX, textureY); // Core305
		bodyModel[229] = new ModelRendererTurbo(this, 13, 263, textureX, textureY); // Core306
		bodyModel[230] = new ModelRendererTurbo(this, 300, 263, textureX, textureY); // Core307
		bodyModel[231] = new ModelRendererTurbo(this, 300, 292, textureX, textureY); // Core308
		bodyModel[232] = new ModelRendererTurbo(this, 13, 292, textureX, textureY); // Core309
		bodyModel[233] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core31
		bodyModel[234] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core32
		bodyModel[235] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core33
		bodyModel[236] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core34
		bodyModel[237] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core35
		bodyModel[238] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core36
		bodyModel[239] = new ModelRendererTurbo(this, 38, 89, textureX, textureY); // Core37
		bodyModel[240] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Core38
		bodyModel[241] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core39
		bodyModel[242] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core40
		bodyModel[243] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core41
		bodyModel[244] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core42
		bodyModel[245] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core43
		bodyModel[246] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core44
		bodyModel[247] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core45
		bodyModel[248] = new ModelRendererTurbo(this, 410, 134, textureX, textureY); // Core46
		bodyModel[249] = new ModelRendererTurbo(this, 410, 134, textureX, textureY); // Core47
		bodyModel[250] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Core48
		bodyModel[251] = new ModelRendererTurbo(this, 38, 89, textureX, textureY); // Core49
		bodyModel[252] = new ModelRendererTurbo(this, 147, 98, textureX, textureY); // Core5
		bodyModel[253] = new ModelRendererTurbo(this, 410, 134, textureX, textureY); // Core50
		bodyModel[254] = new ModelRendererTurbo(this, 410, 145, textureX, textureY); // Core51
		bodyModel[255] = new ModelRendererTurbo(this, 410, 145, textureX, textureY); // Core52
		bodyModel[256] = new ModelRendererTurbo(this, 410, 145, textureX, textureY); // Core53
		bodyModel[257] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Core54
		bodyModel[258] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Core55
		bodyModel[259] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Core56
		bodyModel[260] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Core57
		bodyModel[261] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core58
		bodyModel[262] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core59
		bodyModel[263] = new ModelRendererTurbo(this, 4, 85, textureX, textureY); // Core6
		bodyModel[264] = new ModelRendererTurbo(this, 38, 89, textureX, textureY); // Core60
		bodyModel[265] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Core61
		bodyModel[266] = new ModelRendererTurbo(this, 413, 113, textureX, textureY); // Core63
		bodyModel[267] = new ModelRendererTurbo(this, 413, 113, textureX, textureY); // Core64
		bodyModel[268] = new ModelRendererTurbo(this, 413, 113, textureX, textureY); // Core65
		bodyModel[269] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core66
		bodyModel[270] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core67
		bodyModel[271] = new ModelRendererTurbo(this, 383, 111, textureX, textureY); // Core68
		bodyModel[272] = new ModelRendererTurbo(this, 396, 134, textureX, textureY); // Core69
		bodyModel[273] = new ModelRendererTurbo(this, 761, 131, textureX, textureY); // Core7
		bodyModel[274] = new ModelRendererTurbo(this, 383, 134, textureX, textureY); // Core70
		bodyModel[275] = new ModelRendererTurbo(this, 383, 134, textureX, textureY); // Core71
		bodyModel[276] = new ModelRendererTurbo(this, 21, 119, textureX, textureY); // Core72
		bodyModel[277] = new ModelRendererTurbo(this, 21, 135, textureX, textureY); // Core73
		bodyModel[278] = new ModelRendererTurbo(this, 383, 134, textureX, textureY); // Core74
		bodyModel[279] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core75
		bodyModel[280] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core76
		bodyModel[281] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core77
		bodyModel[282] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core78
		bodyModel[283] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core79
		bodyModel[284] = new ModelRendererTurbo(this, 11, 179, textureX, textureY); // Core8
		bodyModel[285] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core80
		bodyModel[286] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core81
		bodyModel[287] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core82
		bodyModel[288] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core83
		bodyModel[289] = new ModelRendererTurbo(this, 13, 119, textureX, textureY); // Core84
		bodyModel[290] = new ModelRendererTurbo(this, 56, 122, textureX, textureY); // Core85
		bodyModel[291] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core86
		bodyModel[292] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core87
		bodyModel[293] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core88
		bodyModel[294] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core89
		bodyModel[295] = new ModelRendererTurbo(this, 167, 185, textureX, textureY); // Core9
		bodyModel[296] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core90
		bodyModel[297] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core91
		bodyModel[298] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core92
		bodyModel[299] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core93
		bodyModel[300] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core94
		bodyModel[301] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core95
		bodyModel[302] = new ModelRendererTurbo(this, 393, 361, textureX, textureY); // Core96
		bodyModel[303] = new ModelRendererTurbo(this, 12, 128, textureX, textureY); // Core97
		bodyModel[304] = new ModelRendererTurbo(this, 47, 94, textureX, textureY); // Core98
		bodyModel[305] = new ModelRendererTurbo(this, 393, 366, textureX, textureY); // Core99

		bodyModel[0].addShapeBox(-70F, -21F, -24F, 118, 21, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(61.66F, -47.56F, 24F, 7, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core10
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
		bodyModel[1].rotateAngleZ = -0.38397244F;

		bodyModel[2].addShapeBox(53F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core100
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(52F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core101
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(51F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core102
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(30.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core103
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(29.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core104
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(28.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core105
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(8.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core106
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(7.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core107
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(71F, -24F, -35F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core108
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(40F, -68.4F, -14.5F, 1, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F); // Core109
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
		bodyModel[11].rotateAngleZ = -0.82030475F;

		bodyModel[12].addShapeBox(-80F, -19F, 24F, 155, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core11
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(6.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core110
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-14.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core111
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-15.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core112
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-16.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core113
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-37.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core114
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-38.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core115
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-39.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core116
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-60.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core117
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-61.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core118
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-62.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core119
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(80.05F, -18.38F, 24F, 2, 2, 15, 0F,0F, 0F, 0F, -.55F, 0F, 0F, -.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core12
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(71F, -23F, -35F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Core120
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(40F, -69.6F, -14.5F, 1, 1, 2, 0F,-.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Core121
		bodyModel[25].setRotationPoint(0F, 0F, 0F);
		bodyModel[25].rotateAngleZ = -0.82030475F;

		bodyModel[26].addShapeBox(-82.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core122
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-83.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core123
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-84.5F, -20.8F, -38.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core124
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-87F, -9.2F, -37F, 1, 7, 12, 0F,-.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Core125
		bodyModel[29].setRotationPoint(0F, 0F, 0F);
		bodyModel[29].rotateAngleZ = -0.06981317F;

		bodyModel[30].addShapeBox(-87F, -9.2F, 25F, 1, 7, 12, 0F,-.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // Core126
		bodyModel[30].setRotationPoint(0F, 0F, 0F);
		bodyModel[30].rotateAngleZ = -0.06981317F;

		bodyModel[31].addShapeBox(82.05F, -10.7F, 24F, 1, 9, 15, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core127
		bodyModel[31].setRotationPoint(0F, 0F, 0F);
		bodyModel[31].rotateAngleZ = 0.06981317F;

		bodyModel[32].addShapeBox(71.5F, -10.7F, 38F, 11, 9, 1, 0F,-4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core128
		bodyModel[32].setRotationPoint(0F, 0F, 0F);
		bodyModel[32].rotateAngleZ = 0.06981317F;

		bodyModel[33].addShapeBox(71.5F, -10.7F, 24F, 11, 9, 1, 0F,-4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core129
		bodyModel[33].setRotationPoint(0F, 0F, 0F);
		bodyModel[33].rotateAngleZ = 0.06981317F;

		bodyModel[34].addShapeBox(74F, -16.4F, -25F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F); // Core13
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(71.5F, -10.7F, -25F, 11, 9, 1, 0F,-4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core130
		bodyModel[35].setRotationPoint(0F, 0F, 0F);
		bodyModel[35].rotateAngleZ = 0.06981317F;

		bodyModel[36].addShapeBox(71.5F, -10.7F, -39F, 11, 9, 1, 0F,-4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -4F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core131
		bodyModel[36].setRotationPoint(0F, 0F, 0F);
		bodyModel[36].rotateAngleZ = 0.06981317F;

		bodyModel[37].addShapeBox(41F, -69F, -14.5F, 1, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F); // Core132
		bodyModel[37].setRotationPoint(0F, 0F, 0F);
		bodyModel[37].rotateAngleZ = -0.82030475F;

		bodyModel[38].addShapeBox(71F, -25F, -35F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core133
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(82.05F, -10.7F, -39F, 1, 9, 15, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Core134
		bodyModel[39].setRotationPoint(0F, 0F, 0F);
		bodyModel[39].rotateAngleZ = 0.06981317F;

		bodyModel[40].addShapeBox(-89F, -32.1F, 16F, 23, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core135
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-92.5F, -32F, -29F, 28, 4, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Core136
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-64.5F, -32F, -20F, 6, 4, 40, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core137
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-89F, -32.1F, -27F, 23, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core138
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-89F, -32.1F, -11F, 12, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core139
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-80F, -19F, -25F, 155, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core14
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-89F, -32.1F, 6F, 12, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core140
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-76F, -32.1F, -1F, 15, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core141
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-76F, -32.1F, -11F, 15, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core142
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(78F, -18F, 13F, 1, 2, 1, 0F,0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F); // Core143
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(71.5F, -24F, -34.5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core144
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(42F, -68.5F, -14F, 1, 1, 1, 0F,0F, .3F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core145
		bodyModel[51].setRotationPoint(0F, 0F, 0F);
		bodyModel[51].rotateAngleZ = -0.82030475F;

		bodyModel[52].addShapeBox(41.5F, -68F, -14F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core146
		bodyModel[52].setRotationPoint(0F, 0F, 0F);
		bodyModel[52].rotateAngleZ = -0.82030475F;

		bodyModel[53].addShapeBox(72F, -25F, -34.5F, 3, 1, 2, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core147
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(71.5F, -23F, -34.5F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Core148
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(41.5F, -68F, -14.5F, 1, 1, 2, 0F,0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core149
		bodyModel[55].setRotationPoint(0F, 0F, 0F);
		bodyModel[55].rotateAngleZ = -0.82030475F;

		bodyModel[56].addShapeBox(80.05F, -18.38F, -39F, 2, 2, 15, 0F,0F, 0F, 0F, -.55F, 0F, 0F, -.55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core15
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(72F, -24F, -32F, 3, 1, 2, 0F,0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Core150
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(61.3F, -49F, -21F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core151
		bodyModel[58].setRotationPoint(0F, 0F, 0F);
		bodyModel[58].rotateAngleZ = -0.54105207F;

		bodyModel[59].addShapeBox(63.3F, -48.5F, -21F, 1, 2, 1, 0F,0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F); // Core152
		bodyModel[59].setRotationPoint(0F, 0F, 0F);
		bodyModel[59].rotateAngleZ = -0.54105207F;

		bodyModel[60].addShapeBox(72F, -25.1F, -32F, 3, 1, 2, 0F,0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Core153
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(72F, -22.9F, -32F, 3, 1, 2, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F); // Core154
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addBox(61.3F, -48F, -21F, 1, 1, 1, 0F); // Core155
		bodyModel[62].setRotationPoint(0F, 0F, 0F);
		bodyModel[62].rotateAngleZ = -0.54105207F;

		bodyModel[63].addShapeBox(71.5F, -23.5F, -30F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core156
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(71.5F, -22.5F, -30F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Core157
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(60.3F, -49.5F, -21.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F); // Core158
		bodyModel[65].setRotationPoint(0F, 0F, 0F);
		bodyModel[65].rotateAngleZ = -0.54105207F;

		bodyModel[66].addShapeBox(71.5F, -24.5F, -30F, 3, 1, 2, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core159
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(61.66F, -47.56F, -39F, 7, 2, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core16
		bodyModel[67].setRotationPoint(0F, 0F, 0F);
		bodyModel[67].rotateAngleZ = -0.38397244F;

		bodyModel[68].addShapeBox(-86F, -21F, -38F, 3, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Core160
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-83.2F, -20F, 37.8F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core161
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(72F, -23F, -30.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core162
		bodyModel[70].setRotationPoint(0F, 0F, -1F);

		bodyModel[71].addShapeBox(75F, -20F, -23F, 4, 1, 5, 0F,-1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core163
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(40F, -69.6F, 12.5F, 1, 1, 2, 0F,-.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Core164
		bodyModel[72].setRotationPoint(0F, 0F, 0F);
		bodyModel[72].rotateAngleZ = -0.82030475F;

		bodyModel[73].addShapeBox(74F, -26F, -36F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core165
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(54F, -20F, 37.8F, 21, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core166
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(74F, -25F, -28F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core167
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(54F, -16F, 37.8F, 21, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Core168
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(74F, -26F, -31F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Core169
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-93F, -28F, -38F, 47, 7, 76, 0F,1F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 3.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Core17
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(74F, -16.4F, -39F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, 3F, 0F, 0F); // Core170
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(74F, -17F, -39F, 8, 1, 1, 0F,-.3F, 2.3F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.3F, 2.3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Core171
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(71F, -25F, -28F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core172
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(74F, -17F, -25F, 8, 1, 1, 0F,-.3F, 2.3F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.3F, 2.3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Core173
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(71F, -26F, -31F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Core174
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(71F, -26F, -32F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core175
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(74F, -17F, 38F, 8, 1, 1, 0F,-.3F, 2.3F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.3F, 2.3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Core176
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(74F, -25F, 28F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core177
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(74F, -26F, 29F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core178
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(74F, -16.4F, 24F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F); // Core179
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-93F, -30F, -24F, 23, 30, 48, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -5F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -12F, 0F); // Core18
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(74F, -17F, 24F, 8, 1, 1, 0F,-.3F, 2.3F, 0F, -.15F, 0F, 0F, -.15F, 0F, 0F, -.3F, 2.3F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Core180
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(71F, -26F, 29F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core181
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(74F, -16.4F, 38F, 8, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, 3F, 0F, 0F); // Core182
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(71F, -25F, 28F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core183
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(76F, -21F, -22.5F, 3, 1, 4, 0F,-1F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, -1F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core184
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(41F, -69F, 12.5F, 1, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F); // Core185
		bodyModel[95].setRotationPoint(0F, 0F, 0F);
		bodyModel[95].rotateAngleZ = -0.82030475F;

		bodyModel[96].addShapeBox(29.98F, -20F, 37.8F, 24, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core186
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(71F, -26F, 32F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core187
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(74F, -26F, 34F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core188
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(7.95F, -20F, 37.8F, 22, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core189
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-86F, -21F, 24F, 3, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Core19
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-15.07F, -20F, 37.8F, 23, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core190
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(74F, -26F, 32F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core191
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(70.5F, -22F, 29F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Core192
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-38.11F, -20F, 37.8F, 23, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core193
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(72F, -25.1F, 32F, 3, 1, 2, 0F,0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Core194
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-58.14F, -20F, 37.8F, 20, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core195
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(72F, -24F, 32F, 3, 1, 2, 0F,0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Core196
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(72F, -22.9F, 32F, 3, 1, 2, 0F,0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F); // Core197
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-61.14F, -20F, 37.8F, 3, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Core198
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-85.2F, -20F, 37.8F, 2, 5, 1, 0F,-.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .7F, 0F, 0F); // Core199
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(48F, -12F, -24F, 26, 12, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F); // Core2
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-83F, -21F, -38F, 158, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core20
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(71.5F, -24.5F, 29F, 3, 1, 2, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core200
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(71.5F, -23.5F, 29F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core201
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-69.2F, -15F, 37.8F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Core202
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(54F, -16F, -38.8F, 21, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Core203
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(71.5F, -22.5F, 29F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Core204
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(74F, -18F, -14F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core205
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(40F, -69F, 12.5F, 1, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Core206
		bodyModel[119].setRotationPoint(0F, 0F, 0F);
		bodyModel[119].rotateAngleZ = -0.82030475F;

		bodyModel[120].addShapeBox(54F, -20F, -38.8F, 21, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core207
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(72F, -23F, 33.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core208
		bodyModel[121].setRotationPoint(0F, 0F, -1F);

		bodyModel[122].addShapeBox(29.98F, -20F, -38.8F, 24, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core209
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(33F, -28F, 28F, 6, 4, 5, 0F,-1F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, -1F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core210
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(59F, -22F, 25.5F, 11, 1, 11, 0F,0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core211
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(7.95F, -20F, -38.8F, 22, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core212
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(59F, -22F, -36.5F, 11, 1, 11, 0F,0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, -.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core213
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-15.07F, -20F, -38.8F, 23, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core214
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-38.11F, -20F, -38.8F, 23, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core215
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(30F, -32.3F, 1F, 7, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core216
		bodyModel[129].setRotationPoint(0F, 0F, 0F);
		bodyModel[129].rotateAngleZ = -0.19198622F;

		bodyModel[130].addShapeBox(37F, -32.3F, 1F, 6, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Core217
		bodyModel[130].setRotationPoint(0F, 0F, 0F);
		bodyModel[130].rotateAngleZ = -0.19198622F;

		bodyModel[131].addShapeBox(-58.14F, -20F, -38.8F, 20, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core218
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(43F, -32.3F, 4F, 4, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Core219
		bodyModel[132].setRotationPoint(0F, 0F, 0F);
		bodyModel[132].rotateAngleZ = -0.19198622F;

		bodyModel[133].addShapeBox(68.5F, 34.15F, 12.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F); // Core22
		bodyModel[133].setRotationPoint(0F, 0F, 0F);
		bodyModel[133].rotateAngleZ = 0.6981317F;

		bodyModel[134].addShapeBox(-61.14F, -20F, -38.8F, 3, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Core220
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(25F, -32.3F, 1F, 5, 1, 22, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Core221
		bodyModel[135].setRotationPoint(0F, 0F, 0F);
		bodyModel[135].rotateAngleZ = -0.19198622F;

		bodyModel[136].addShapeBox(-83.2F, -20F, -38.8F, 22, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core222
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-69.2F, -15F, -38.8F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Core223
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(31F, -34.3F, 21.9F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core224
		bodyModel[138].setRotationPoint(0F, 0F, 0F);
		bodyModel[138].rotateAngleZ = -0.19198622F;

		bodyModel[139].addShapeBox(35F, -34.3F, 21.9F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core225
		bodyModel[139].setRotationPoint(0F, 0F, 0F);
		bodyModel[139].rotateAngleZ = -0.19198622F;

		bodyModel[140].addShapeBox(-85.2F, -20F, -38.8F, 2, 5, 1, 0F,-.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .7F, 0F, 0F); // Core226
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(40F, -68.4F, 12.5F, 1, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F); // Core227
		bodyModel[141].setRotationPoint(0F, 0F, 0F);
		bodyModel[141].rotateAngleZ = -0.82030475F;

		bodyModel[142].addShapeBox(61.3F, -48F, -21F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Core228
		bodyModel[142].setRotationPoint(0F, 0F, 0F);
		bodyModel[142].rotateAngleZ = -0.54105207F;

		bodyModel[143].addShapeBox(32F, -34.3F, 21.9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core229
		bodyModel[143].setRotationPoint(0F, 0F, 0F);
		bodyModel[143].rotateAngleZ = -0.19198622F;

		bodyModel[144].addShapeBox(74F, -18F, 13F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core23
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(37F, -34.5F, 20F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core230
		bodyModel[145].setRotationPoint(0F, 0F, 0F);
		bodyModel[145].rotateAngleX = -0.06981317F;
		bodyModel[145].rotateAngleY = -0.38397244F;
		bodyModel[145].rotateAngleZ = -0.19198622F;

		bodyModel[146].addShapeBox(34F, -34.5F, 20F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core231
		bodyModel[146].setRotationPoint(0F, 0F, 0F);
		bodyModel[146].rotateAngleX = -0.06981317F;
		bodyModel[146].rotateAngleY = -0.38397244F;
		bodyModel[146].rotateAngleZ = -0.19198622F;

		bodyModel[147].addShapeBox(33F, -34.5F, 20F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core232
		bodyModel[147].setRotationPoint(0F, 0F, 0F);
		bodyModel[147].rotateAngleX = -0.06981317F;
		bodyModel[147].rotateAngleY = -0.38397244F;
		bodyModel[147].rotateAngleZ = -0.19198622F;

		bodyModel[148].addShapeBox(40F, -28F, 8F, 3, 4, 8, 0F,-1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core233
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(43F, -28F, 8F, 1, 4, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Core234
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(43F, -28F, 14F, 1, 4, 2, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core235
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(43F, -28F, 9F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core236
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(42F, -68.5F, 13F, 1, 1, 1, 0F,0F, .3F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core237
		bodyModel[152].setRotationPoint(0F, 0F, 0F);
		bodyModel[152].rotateAngleZ = -0.82030475F;

		bodyModel[153].addShapeBox(34F, -69.2F, -23.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core238
		bodyModel[153].setRotationPoint(0F, 0F, 0F);
		bodyModel[153].rotateAngleZ = -0.87266463F;

		bodyModel[154].addShapeBox(45F, -27F, -6F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core239
		bodyModel[154].setRotationPoint(0F, 0F, 0F);
		bodyModel[154].rotateAngleY = 0.52359878F;

		bodyModel[155].addShapeBox(74F, -19F, -23F, 5, 4, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core24
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(45F, -26F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core240
		bodyModel[156].setRotationPoint(0F, 0F, 0F);
		bodyModel[156].rotateAngleY = 0.52359878F;

		bodyModel[157].addShapeBox(45F, -26F, -6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core241
		bodyModel[157].setRotationPoint(0F, 0F, 0F);
		bodyModel[157].rotateAngleY = 0.52359878F;

		bodyModel[158].addShapeBox(43F, -27F, -6F, 2, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core242
		bodyModel[158].setRotationPoint(0F, 0F, 0F);
		bodyModel[158].rotateAngleY = 0.52359878F;

		bodyModel[159].addShapeBox(33F, -27F, 22.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core243
		bodyModel[159].setRotationPoint(0F, 0F, 0F);
		bodyModel[159].rotateAngleY = -0.52359878F;

		bodyModel[160].addShapeBox(33F, -26F, 25.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core244
		bodyModel[160].setRotationPoint(0F, 0F, 0F);
		bodyModel[160].rotateAngleY = -0.52359878F;

		bodyModel[161].addShapeBox(33F, -26F, 22.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core245
		bodyModel[161].setRotationPoint(0F, 0F, 0F);
		bodyModel[161].rotateAngleY = -0.52359878F;

		bodyModel[162].addShapeBox(31F, -27F, 22.5F, 2, 2, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core246
		bodyModel[162].setRotationPoint(0F, 0F, 0F);
		bodyModel[162].rotateAngleY = -0.52359878F;

		bodyModel[163].addShapeBox(74F, -19F, 18F, 5, 4, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core247
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(41.5F, -68F, 13F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core248
		bodyModel[164].setRotationPoint(0F, 0F, 0F);
		bodyModel[164].rotateAngleZ = -0.82030475F;

		bodyModel[165].addShapeBox(45F, -25F, -6F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core249
		bodyModel[165].setRotationPoint(0F, 0F, 0F);
		bodyModel[165].rotateAngleY = 0.52359878F;

		bodyModel[166].addShapeBox(76F, -21F, 18.5F, 3, 1, 4, 0F,-1F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, -1F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core25
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(33F, -25F, 22.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core250
		bodyModel[167].setRotationPoint(0F, 0F, 0F);
		bodyModel[167].rotateAngleY = -0.52359878F;

		bodyModel[168].addShapeBox(28F, -32.5F, 18.9F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core251
		bodyModel[168].setRotationPoint(0F, 0F, 0F);
		bodyModel[168].rotateAngleZ = -0.19198622F;

		bodyModel[169].addShapeBox(-96F, -30F, -35F, 5, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core252
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(-96F, -28F, -17F, 8, 13, 34, 0F,0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 0F); // Core253
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(-96F, -28F, -22F, 8, 6, 5, 0F,0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F); // Core254
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(-96F, -28F, 17F, 8, 6, 5, 0F,0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 3F, 1F, 0F, 0F, 0F); // Core255
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(-96F, -30F, 28F, 5, 7, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core256
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(-96.5F, -32F, -17F, 4, 4, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core257
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(41.5F, -68F, 12.5F, 1, 1, 2, 0F,0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Core258
		bodyModel[175].setRotationPoint(0F, 0F, 0F);
		bodyModel[175].rotateAngleZ = -0.82030475F;

		bodyModel[176].addShapeBox(75F, -20F, 18F, 4, 1, 5, 0F,-1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core259
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(60.3F, -49.5F, 19.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F); // Core26
		bodyModel[177].setRotationPoint(0F, 0F, 0F);
		bodyModel[177].rotateAngleZ = -0.54105207F;

		bodyModel[178].addShapeBox(-97.5F, -32F, -17F, 1, 3, 34, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Core260
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(-96F, -32F, -38F, 3, 3, 1, 0F,-1F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Core261
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(-96F, -32F, -38F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Core262
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(-96F, -32F, -38F, 1, 1, 1, 0F,0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F); // Core263
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(-96F, -32F, -38F, 2, 1, 1, 0F,0F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F); // Core264
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(-96F, -32F, -38F, 1, 2, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, -.5F, -.8F, 0F); // Core265
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(-96F, -32F, 37F, 3, 3, 1, 0F,-1F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Core266
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addShapeBox(-96F, -32F, 37F, 1, 2, 1, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, -.5F, -.8F, 0F); // Core267
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(-96F, -32F, 37F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Core268
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(-96F, -32F, 37F, 2, 1, 1, 0F,0F, -.5F, 0F, -.8F, -.5F, 0F, -.8F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F); // Core269
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(-96F, -32F, 37F, 1, 1, 1, 0F,0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F); // Core27
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addShapeBox(20F, -58F, -27F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core270
		bodyModel[189].setRotationPoint(0F, 0F, 0F);
		bodyModel[189].rotateAngleZ = -1.13446401F;

		bodyModel[190].addShapeBox(20F, -59F, -27F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core271
		bodyModel[190].setRotationPoint(0F, 0F, 0F);
		bodyModel[190].rotateAngleZ = -1.13446401F;

		bodyModel[191].addShapeBox(20F, -44F, -27F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core272
		bodyModel[191].setRotationPoint(0F, 0F, 0F);
		bodyModel[191].rotateAngleZ = -1.13446401F;

		bodyModel[192].addShapeBox(10F, -23F, -27F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core273
		bodyModel[192].setRotationPoint(0F, 0F, 0F);
		bodyModel[192].rotateAngleZ = -1.13446401F;

		bodyModel[193].addShapeBox(10F, -37F, -27F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core274
		bodyModel[193].setRotationPoint(0F, 0F, 0F);
		bodyModel[193].rotateAngleZ = -1.13446401F;

		bodyModel[194].addShapeBox(10F, -38F, -27F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core275
		bodyModel[194].setRotationPoint(0F, 0F, 0F);
		bodyModel[194].rotateAngleZ = -1.13446401F;

		bodyModel[195].addShapeBox(1F, -4F, -27F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core276
		bodyModel[195].setRotationPoint(0F, 0F, 0F);
		bodyModel[195].rotateAngleZ = -1.13446401F;

		bodyModel[196].addShapeBox(1F, -18F, -27F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core277
		bodyModel[196].setRotationPoint(0F, 0F, 0F);
		bodyModel[196].rotateAngleZ = -1.13446401F;

		bodyModel[197].addShapeBox(1F, -19F, -27F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core278
		bodyModel[197].setRotationPoint(0F, 0F, 0F);
		bodyModel[197].rotateAngleZ = -1.13446401F;

		bodyModel[198].addShapeBox(-7F, 13F, -27F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core279
		bodyModel[198].setRotationPoint(0F, 0F, 0F);
		bodyModel[198].rotateAngleZ = -1.13446401F;

		bodyModel[199].addBox(-88F, -21F, -34F, 2, 5, 10, 0F); // Core28
		bodyModel[199].setRotationPoint(0F, 0F, 0F);

		bodyModel[200].addShapeBox(-7F, -1F, -27F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core280
		bodyModel[200].setRotationPoint(0F, 0F, 0F);
		bodyModel[200].rotateAngleZ = -1.13446401F;

		bodyModel[201].addShapeBox(-7F, -2F, -27F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core281
		bodyModel[201].setRotationPoint(0F, 0F, 0F);
		bodyModel[201].rotateAngleZ = -1.13446401F;

		bodyModel[202].addShapeBox(-18F, 19F, -27F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core282
		bodyModel[202].setRotationPoint(0F, 0F, 0F);
		bodyModel[202].rotateAngleZ = -1.13446401F;

		bodyModel[203].addShapeBox(-18F, 20F, -27F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core283
		bodyModel[203].setRotationPoint(0F, 0F, 0F);
		bodyModel[203].rotateAngleZ = -1.13446401F;

		bodyModel[204].addShapeBox(-18F, 34F, -27F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core284
		bodyModel[204].setRotationPoint(0F, 0F, 0F);
		bodyModel[204].rotateAngleZ = -1.13446401F;

		bodyModel[205].addShapeBox(-27F, 39F, -27F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core285
		bodyModel[205].setRotationPoint(0F, 0F, 0F);
		bodyModel[205].rotateAngleZ = -1.13446401F;

		bodyModel[206].addShapeBox(-27F, 40F, -27F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core286
		bodyModel[206].setRotationPoint(0F, 0F, 0F);
		bodyModel[206].rotateAngleZ = -1.13446401F;

		bodyModel[207].addShapeBox(-27F, 54F, -27F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core287
		bodyModel[207].setRotationPoint(0F, 0F, 0F);
		bodyModel[207].rotateAngleZ = -1.13446401F;

		bodyModel[208].addShapeBox(-27F, 39F, 25F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core288
		bodyModel[208].setRotationPoint(0F, 0F, 0F);
		bodyModel[208].rotateAngleZ = -1.13446401F;

		bodyModel[209].addShapeBox(-27F, 40F, 25F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core289
		bodyModel[209].setRotationPoint(0F, 0F, 0F);
		bodyModel[209].rotateAngleZ = -1.13446401F;

		bodyModel[210].addBox(-88F, -21F, 24F, 2, 5, 10, 0F); // Core29
		bodyModel[210].setRotationPoint(0F, 0F, 0F);

		bodyModel[211].addShapeBox(-27F, 54F, 25F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core290
		bodyModel[211].setRotationPoint(0F, 0F, 0F);
		bodyModel[211].rotateAngleZ = -1.13446401F;

		bodyModel[212].addShapeBox(-18F, 34F, 25F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core291
		bodyModel[212].setRotationPoint(0F, 0F, 0F);
		bodyModel[212].rotateAngleZ = -1.13446401F;

		bodyModel[213].addShapeBox(-18F, 20F, 25F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core292
		bodyModel[213].setRotationPoint(0F, 0F, 0F);
		bodyModel[213].rotateAngleZ = -1.13446401F;

		bodyModel[214].addShapeBox(-18F, 19F, 25F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core293
		bodyModel[214].setRotationPoint(0F, 0F, 0F);
		bodyModel[214].rotateAngleZ = -1.13446401F;

		bodyModel[215].addShapeBox(-7F, 13F, 25F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core294
		bodyModel[215].setRotationPoint(0F, 0F, 0F);
		bodyModel[215].rotateAngleZ = -1.13446401F;

		bodyModel[216].addShapeBox(-7F, -1F, 25F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core295
		bodyModel[216].setRotationPoint(0F, 0F, 0F);
		bodyModel[216].rotateAngleZ = -1.13446401F;

		bodyModel[217].addShapeBox(-7F, -2F, 25F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core296
		bodyModel[217].setRotationPoint(0F, 0F, 0F);
		bodyModel[217].rotateAngleZ = -1.13446401F;

		bodyModel[218].addShapeBox(1F, -4F, 25F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core297
		bodyModel[218].setRotationPoint(0F, 0F, 0F);
		bodyModel[218].rotateAngleZ = -1.13446401F;

		bodyModel[219].addShapeBox(1F, -18F, 25F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core298
		bodyModel[219].setRotationPoint(0F, 0F, 0F);
		bodyModel[219].rotateAngleZ = -1.13446401F;

		bodyModel[220].addShapeBox(1F, -19F, 25F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core299
		bodyModel[220].setRotationPoint(0F, 0F, 0F);
		bodyModel[220].rotateAngleZ = -1.13446401F;

		bodyModel[221].addShapeBox(-83F, -21F, 24F, 158, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core3
		bodyModel[221].setRotationPoint(0F, 0F, 0F);

		bodyModel[222].addShapeBox(-97.5F, -27F, -16F, 1, 1, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core30
		bodyModel[222].setRotationPoint(0F, 0F, 0F);

		bodyModel[223].addShapeBox(10F, -23F, 25F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core300
		bodyModel[223].setRotationPoint(0F, 0F, 0F);
		bodyModel[223].rotateAngleZ = -1.13446401F;

		bodyModel[224].addShapeBox(10F, -37F, 25F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core301
		bodyModel[224].setRotationPoint(0F, 0F, 0F);
		bodyModel[224].rotateAngleZ = -1.13446401F;

		bodyModel[225].addShapeBox(10F, -38F, 25F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core302
		bodyModel[225].setRotationPoint(0F, 0F, 0F);
		bodyModel[225].rotateAngleZ = -1.13446401F;

		bodyModel[226].addShapeBox(20F, -44F, 25F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Core303
		bodyModel[226].setRotationPoint(0F, 0F, 0F);
		bodyModel[226].rotateAngleZ = -1.13446401F;

		bodyModel[227].addShapeBox(20F, -58F, 25F, 4, 14, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core304
		bodyModel[227].setRotationPoint(0F, 0F, 0F);
		bodyModel[227].rotateAngleZ = -1.13446401F;

		bodyModel[228].addShapeBox(20F, -59F, 25F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core305
		bodyModel[228].setRotationPoint(0F, 0F, 0F);
		bodyModel[228].rotateAngleZ = -1.13446401F;

		bodyModel[229].addShapeBox(-70F, -9F, -25F, 131, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core306
		bodyModel[229].setRotationPoint(0F, 0F, 0F);

		bodyModel[230].addShapeBox(61F, -9F, -25F, 4, 10, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Core307
		bodyModel[230].setRotationPoint(0F, 0F, 0F);

		bodyModel[231].addShapeBox(61F, -9F, 18F, 4, 10, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Core308
		bodyModel[231].setRotationPoint(0F, 0F, 0F);

		bodyModel[232].addShapeBox(-70F, -9F, 18F, 131, 10, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core309
		bodyModel[232].setRotationPoint(0F, 0F, 0F);

		bodyModel[233].addShapeBox(-97.5F, -27F, -8F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Core31
		bodyModel[233].setRotationPoint(0F, 0F, 0F);

		bodyModel[234].addShapeBox(-97.5F, -26F, -19F, 1, 1, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Core32
		bodyModel[234].setRotationPoint(0F, 0F, 0F);

		bodyModel[235].addShapeBox(-97.5F, -23F, -19F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Core33
		bodyModel[235].setRotationPoint(0F, 0F, 0F);

		bodyModel[236].addShapeBox(-95.5F, -15F, -19F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 2F, 2F, 0F, -2F, 2F, 0F); // Core34
		bodyModel[236].setRotationPoint(0F, 0F, 0F);

		bodyModel[237].addShapeBox(-97.5F, -25F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core35
		bodyModel[237].setRotationPoint(0F, 0F, 0F);

		bodyModel[238].addShapeBox(-97.5F, -27F, -10F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core36
		bodyModel[238].setRotationPoint(0F, 0F, 0F);

		bodyModel[239].addShapeBox(34F, -69.2F, 17.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core37
		bodyModel[239].setRotationPoint(0F, 0F, 0F);
		bodyModel[239].rotateAngleZ = -0.87266463F;

		bodyModel[240].addBox(61.3F, -48F, 20F, 1, 1, 1, 0F); // Core38
		bodyModel[240].setRotationPoint(0F, 0F, 0F);
		bodyModel[240].rotateAngleZ = -0.54105207F;

		bodyModel[241].addShapeBox(-93.5F, -13F, 2F, 1, 1, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core39
		bodyModel[241].setRotationPoint(0F, 0F, 0F);

		bodyModel[242].addShapeBox(-95.5F, -15F, 16F, 1, 1, 3, 0F,-2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 2F, 0F, 2F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core40
		bodyModel[242].setRotationPoint(0F, 0F, 0F);

		bodyModel[243].addShapeBox(-97.5F, -23F, 18F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Core41
		bodyModel[243].setRotationPoint(0F, 0F, 0F);

		bodyModel[244].addShapeBox(-97.5F, -26F, 16F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F); // Core42
		bodyModel[244].setRotationPoint(0F, 0F, 0F);

		bodyModel[245].addShapeBox(-97.5F, -27F, 10F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Core43
		bodyModel[245].setRotationPoint(0F, 0F, 0F);

		bodyModel[246].addShapeBox(-97.5F, -27F, 8F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core44
		bodyModel[246].setRotationPoint(0F, 0F, 0F);

		bodyModel[247].addShapeBox(-97.5F, -27F, 2F, 1, 1, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core45
		bodyModel[247].setRotationPoint(0F, 0F, 0F);

		bodyModel[248].addShapeBox(-86F, -8F, -10F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core46
		bodyModel[248].setRotationPoint(0F, 0F, 0F);

		bodyModel[249].addShapeBox(-86F, -10F, -10F, 5, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core47
		bodyModel[249].setRotationPoint(0F, 0F, 0F);

		bodyModel[250].addShapeBox(61.3F, -49F, 20F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core48
		bodyModel[250].setRotationPoint(0F, 0F, 0F);
		bodyModel[250].rotateAngleZ = -0.54105207F;

		bodyModel[251].addShapeBox(34F, -69.2F, -18.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core49
		bodyModel[251].setRotationPoint(0F, 0F, 0F);
		bodyModel[251].rotateAngleZ = -0.87266463F;

		bodyModel[252].addShapeBox(-46F, -27F, -38F, 73, 6, 76, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core5
		bodyModel[252].setRotationPoint(0F, 0F, 0F);

		bodyModel[253].addShapeBox(-86F, -6F, -10F, 10, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core50
		bodyModel[253].setRotationPoint(0F, 0F, 0F);

		bodyModel[254].addShapeBox(-88F, -8F, -10F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core51
		bodyModel[254].setRotationPoint(0F, 0F, 0F);

		bodyModel[255].addShapeBox(-88F, -8F, -6F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core52
		bodyModel[255].setRotationPoint(0F, 0F, 0F);

		bodyModel[256].addShapeBox(-90F, -8F, -10F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Core53
		bodyModel[256].setRotationPoint(0F, 0F, 0F);

		bodyModel[257].addShapeBox(-52F, -70F, 9F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core54
		bodyModel[257].setRotationPoint(0F, 0F, 0F);
		bodyModel[257].rotateAngleZ = 0.82030475F;

		bodyModel[258].addShapeBox(-53F, -70F, 9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core55
		bodyModel[258].setRotationPoint(0F, 0F, 0F);
		bodyModel[258].rotateAngleZ = 0.82030475F;

		bodyModel[259].addShapeBox(-53F, -68F, 9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core56
		bodyModel[259].setRotationPoint(0F, 0F, 0F);
		bodyModel[259].rotateAngleZ = 0.82030475F;

		bodyModel[260].addShapeBox(-54F, -70F, 9F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Core57
		bodyModel[260].setRotationPoint(0F, 0F, 0F);
		bodyModel[260].rotateAngleZ = 0.82030475F;

		bodyModel[261].addShapeBox(-92.5F, -12F, 0F, 1, 1, 3, 0F,-2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 2F, 0F, 2F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core58
		bodyModel[261].setRotationPoint(0F, 0F, 0F);

		bodyModel[262].addShapeBox(-90.5F, -10F, -5F, 1, 1, 5, 0F,-2F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core59
		bodyModel[262].setRotationPoint(0F, 0F, 0F);

		bodyModel[263].addShapeBox(27F, -27F, -38F, 27, 6, 76, 0F,0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core6
		bodyModel[263].setRotationPoint(0F, 0F, 0F);

		bodyModel[264].addShapeBox(34F, -69.2F, 22.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core60
		bodyModel[264].setRotationPoint(0F, 0F, 0F);
		bodyModel[264].rotateAngleZ = -0.87266463F;

		bodyModel[265].addShapeBox(61.3F, -48F, 20F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Core61
		bodyModel[265].setRotationPoint(0F, 0F, 0F);
		bodyModel[265].rotateAngleZ = -0.54105207F;

		bodyModel[266].addShapeBox(-87.5F, -10F, 13F, 1, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core63
		bodyModel[266].setRotationPoint(0F, 0F, 0F);
		bodyModel[266].rotateAngleY = 0.2443461F;

		bodyModel[267].addShapeBox(-87.5F, -6F, 13F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core64
		bodyModel[267].setRotationPoint(0F, 0F, 0F);
		bodyModel[267].rotateAngleY = 0.2443461F;

		bodyModel[268].addShapeBox(-87.5F, -8F, 17F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core65
		bodyModel[268].setRotationPoint(0F, 0F, 0F);
		bodyModel[268].rotateAngleY = 0.2443461F;

		bodyModel[269].addShapeBox(-93.5F, -13F, -18F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Core66
		bodyModel[269].setRotationPoint(0F, 0F, 2F);

		bodyModel[270].addShapeBox(-92.5F, -12F, -8F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 2F, 2F, 0F, -2F, 2F, 0F); // Core67
		bodyModel[270].setRotationPoint(0F, 0F, 0F);

		bodyModel[271].addShapeBox(-90.5F, -10F, -3F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -2F, 2F, 0F); // Core68
		bodyModel[271].setRotationPoint(0F, 0F, 0F);

		bodyModel[272].addShapeBox(-83F, -8.5F, -33F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, .5F, 0F, .5F, .5F, 0F); // Core69
		bodyModel[272].setRotationPoint(0F, 0F, 0F);
		bodyModel[272].rotateAngleY = -0.45378561F;

		bodyModel[273].addShapeBox(48F, -20F, -24F, 6, 8, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core7
		bodyModel[273].setRotationPoint(0F, 0F, 0F);

		bodyModel[274].addBox(-82.5F, -9F, -30F, 1, 1, 2, 0F); // Core70
		bodyModel[274].setRotationPoint(0F, 0F, 0F);
		bodyModel[274].rotateAngleY = -0.45378561F;

		bodyModel[275].addBox(-82.5F, -7F, -30F, 1, 1, 2, 0F); // Core71
		bodyModel[275].setRotationPoint(0F, 0F, 0F);
		bodyModel[275].rotateAngleY = -0.45378561F;

		bodyModel[276].addShapeBox(78F, -18F, -14F, 1, 2, 1, 0F,0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F); // Core72
		bodyModel[276].setRotationPoint(0F, 0F, 0F);

		bodyModel[277].addShapeBox(63.3F, -48.5F, 20F, 1, 2, 1, 0F,0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F); // Core73
		bodyModel[277].setRotationPoint(0F, 0F, 0F);
		bodyModel[277].rotateAngleZ = -0.54105207F;

		bodyModel[278].addShapeBox(-82.5F, -9F, -28F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Core74
		bodyModel[278].setRotationPoint(0F, 0F, 0F);
		bodyModel[278].rotateAngleY = -0.45378561F;

		bodyModel[279].addShapeBox(53F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core75
		bodyModel[279].setRotationPoint(0F, 0F, 0F);

		bodyModel[280].addShapeBox(51F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core76
		bodyModel[280].setRotationPoint(0F, 0F, 0F);

		bodyModel[281].addShapeBox(52F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core77
		bodyModel[281].setRotationPoint(0F, 0F, 0F);

		bodyModel[282].addShapeBox(28.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core78
		bodyModel[282].setRotationPoint(0F, 0F, 0F);

		bodyModel[283].addShapeBox(30.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core79
		bodyModel[283].setRotationPoint(0F, 0F, 0F);

		bodyModel[284].addShapeBox(54F, -22F, -24F, 20, 10, 48, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core8
		bodyModel[284].setRotationPoint(0F, 0F, 0F);

		bodyModel[285].addShapeBox(29.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core80
		bodyModel[285].setRotationPoint(0F, 0F, 0F);

		bodyModel[286].addShapeBox(6.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core81
		bodyModel[286].setRotationPoint(0F, 0F, 0F);

		bodyModel[287].addShapeBox(8.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core82
		bodyModel[287].setRotationPoint(0F, 0F, 0F);

		bodyModel[288].addShapeBox(7.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core83
		bodyModel[288].setRotationPoint(0F, 0F, 0F);

		bodyModel[289].addShapeBox(68.5F, 34.15F, -14.5F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, 0F); // Core84
		bodyModel[289].setRotationPoint(0F, 0F, 0F);
		bodyModel[289].rotateAngleZ = 0.6981317F;

		bodyModel[290].addShapeBox(74F, -26F, -35F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core85
		bodyModel[290].setRotationPoint(0F, 0F, 0F);

		bodyModel[291].addShapeBox(-16.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core86
		bodyModel[291].setRotationPoint(0F, 0F, 0F);

		bodyModel[292].addShapeBox(-14.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core87
		bodyModel[292].setRotationPoint(0F, 0F, 0F);

		bodyModel[293].addShapeBox(-15.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core88
		bodyModel[293].setRotationPoint(0F, 0F, 0F);

		bodyModel[294].addShapeBox(-39.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core89
		bodyModel[294].setRotationPoint(0F, 0F, 0F);

		bodyModel[295].addShapeBox(74F, -19F, -24F, 5, 14, 48, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Core9
		bodyModel[295].setRotationPoint(0F, 0F, 0F);

		bodyModel[296].addShapeBox(-37.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core90
		bodyModel[296].setRotationPoint(0F, 0F, 0F);

		bodyModel[297].addShapeBox(-38.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core91
		bodyModel[297].setRotationPoint(0F, 0F, 0F);

		bodyModel[298].addShapeBox(-82.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core92
		bodyModel[298].setRotationPoint(0F, 0F, 0F);

		bodyModel[299].addShapeBox(-62.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core93
		bodyModel[299].setRotationPoint(0F, 0F, 0F);

		bodyModel[300].addShapeBox(-60.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core94
		bodyModel[300].setRotationPoint(0F, 0F, 0F);

		bodyModel[301].addShapeBox(-61.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core95
		bodyModel[301].setRotationPoint(0F, 0F, 0F);

		bodyModel[302].addShapeBox(-84.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core96
		bodyModel[302].setRotationPoint(0F, 0F, 0F);

		bodyModel[303].addShapeBox(40F, -69F, -14.5F, 1, 1, 2, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Core97
		bodyModel[303].setRotationPoint(0F, 0F, 0F);
		bodyModel[303].rotateAngleZ = -0.82030475F;

		bodyModel[304].addShapeBox(70.5F, -22F, -35F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Core98
		bodyModel[304].setRotationPoint(0F, 0F, 0F);

		bodyModel[305].addShapeBox(-83.5F, -20.8F, 37.5F, 1, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // Core99
		bodyModel[305].setRotationPoint(0F, 0F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 10, 492, textureX, textureY); // Turret1
		turretModel[1] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret10
		turretModel[2] = new ModelRendererTurbo(this, 792, 473, textureX, textureY); // Turret100
		turretModel[3] = new ModelRendererTurbo(this, 774, 436, textureX, textureY); // Turret101
		turretModel[4] = new ModelRendererTurbo(this, 792, 473, textureX, textureY); // Turret102
		turretModel[5] = new ModelRendererTurbo(this, 832, 496, textureX, textureY); // Turret103
		turretModel[6] = new ModelRendererTurbo(this, 774, 426, textureX, textureY); // Turret104
		turretModel[7] = new ModelRendererTurbo(this, 818, 472, textureX, textureY); // Turret105
		turretModel[8] = new ModelRendererTurbo(this, 832, 496, textureX, textureY); // Turret106
		turretModel[9] = new ModelRendererTurbo(this, 774, 426, textureX, textureY); // Turret107
		turretModel[10] = new ModelRendererTurbo(this, 774, 408, textureX, textureY); // Turret108
		turretModel[11] = new ModelRendererTurbo(this, 818, 472, textureX, textureY); // Turret109
		turretModel[12] = new ModelRendererTurbo(this, 709, 533, textureX, textureY); // Turret11
		turretModel[13] = new ModelRendererTurbo(this, 832, 496, textureX, textureY); // Turret110
		turretModel[14] = new ModelRendererTurbo(this, 762, 549, textureX, textureY); // Turret111
		turretModel[15] = new ModelRendererTurbo(this, 782, 473, textureX, textureY); // Turret112
		turretModel[16] = new ModelRendererTurbo(this, 706, 407, textureX, textureY); // Turret113
		turretModel[17] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret114
		turretModel[18] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret115
		turretModel[19] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret116
		turretModel[20] = new ModelRendererTurbo(this, 706, 407, textureX, textureY); // Turret117
		turretModel[21] = new ModelRendererTurbo(this, 790, 558, textureX, textureY); // Turret118
		turretModel[22] = new ModelRendererTurbo(this, 889, 449, textureX, textureY); // Turret119
		turretModel[23] = new ModelRendererTurbo(this, 783, 408, textureX, textureY); // Turret12
		turretModel[24] = new ModelRendererTurbo(this, 706, 407, textureX, textureY); // Turret120
		turretModel[25] = new ModelRendererTurbo(this, 799, 558, textureX, textureY); // Turret121
		turretModel[26] = new ModelRendererTurbo(this, 799, 558, textureX, textureY); // Turret122
		turretModel[27] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret123
		turretModel[28] = new ModelRendererTurbo(this, 706, 407, textureX, textureY); // Turret124
		turretModel[29] = new ModelRendererTurbo(this, 706, 407, textureX, textureY); // Turret125
		turretModel[30] = new ModelRendererTurbo(this, 799, 558, textureX, textureY); // Turret126
		turretModel[31] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret127
		turretModel[32] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret128
		turretModel[33] = new ModelRendererTurbo(this, 706, 407, textureX, textureY); // Turret129
		turretModel[34] = new ModelRendererTurbo(this, 606, 428, textureX, textureY); // Turret13
		turretModel[35] = new ModelRendererTurbo(this, 790, 558, textureX, textureY); // Turret130
		turretModel[36] = new ModelRendererTurbo(this, 606, 404, textureX, textureY); // Turret131
		turretModel[37] = new ModelRendererTurbo(this, 799, 558, textureX, textureY); // Turret132
		turretModel[38] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret133
		turretModel[39] = new ModelRendererTurbo(this, 790, 546, textureX, textureY); // Turret134
		turretModel[40] = new ModelRendererTurbo(this, 606, 415, textureX, textureY); // Turret135
		turretModel[41] = new ModelRendererTurbo(this, 790, 546, textureX, textureY); // Turret136
		turretModel[42] = new ModelRendererTurbo(this, 646, 408, textureX, textureY); // Turret137
		turretModel[43] = new ModelRendererTurbo(this, 787, 567, textureX, textureY); // Turret138
		turretModel[44] = new ModelRendererTurbo(this, 663, 408, textureX, textureY); // Turret139
		turretModel[45] = new ModelRendererTurbo(this, 606, 428, textureX, textureY); // Turret14
		turretModel[46] = new ModelRendererTurbo(this, 646, 408, textureX, textureY); // Turret140
		turretModel[47] = new ModelRendererTurbo(this, 787, 567, textureX, textureY); // Turret141
		turretModel[48] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret142
		turretModel[49] = new ModelRendererTurbo(this, 14, 566, textureX, textureY); // Turret143
		turretModel[50] = new ModelRendererTurbo(this, 476, 670, textureX, textureY); // Turret144
		turretModel[51] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret145
		turretModel[52] = new ModelRendererTurbo(this, 790, 546, textureX, textureY); // Turret146
		turretModel[53] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret147
		turretModel[54] = new ModelRendererTurbo(this, 663, 408, textureX, textureY); // Turret148
		turretModel[55] = new ModelRendererTurbo(this, 646, 408, textureX, textureY); // Turret149
		turretModel[56] = new ModelRendererTurbo(this, 661, 428, textureX, textureY); // Turret15
		turretModel[57] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret150
		turretModel[58] = new ModelRendererTurbo(this, 790, 546, textureX, textureY); // Turret151
		turretModel[59] = new ModelRendererTurbo(this, 785, 522, textureX, textureY); // Turret152
		turretModel[60] = new ModelRendererTurbo(this, 663, 408, textureX, textureY); // Turret153
		turretModel[61] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret154
		turretModel[62] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret155
		turretModel[63] = new ModelRendererTurbo(this, 646, 408, textureX, textureY); // Turret156
		turretModel[64] = new ModelRendererTurbo(this, 785, 522, textureX, textureY); // Turret157
		turretModel[65] = new ModelRendererTurbo(this, 785, 522, textureX, textureY); // Turret158
		turretModel[66] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret159
		turretModel[67] = new ModelRendererTurbo(this, 661, 428, textureX, textureY); // Turret16
		turretModel[68] = new ModelRendererTurbo(this, 663, 408, textureX, textureY); // Turret160
		turretModel[69] = new ModelRendererTurbo(this, 606, 415, textureX, textureY); // Turret161
		turretModel[70] = new ModelRendererTurbo(this, 785, 522, textureX, textureY); // Turret162
		turretModel[71] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret163
		turretModel[72] = new ModelRendererTurbo(this, 606, 404, textureX, textureY); // Turret164
		turretModel[73] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret165
		turretModel[74] = new ModelRendererTurbo(this, 785, 498, textureX, textureY); // Turret166
		turretModel[75] = new ModelRendererTurbo(this, 785, 498, textureX, textureY); // Turret167
		turretModel[76] = new ModelRendererTurbo(this, 646, 408, textureX, textureY); // Turret168
		turretModel[77] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret169
		turretModel[78] = new ModelRendererTurbo(this, 606, 445, textureX, textureY); // Turret17
		turretModel[79] = new ModelRendererTurbo(this, 785, 498, textureX, textureY); // Turret170
		turretModel[80] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret171
		turretModel[81] = new ModelRendererTurbo(this, 646, 408, textureX, textureY); // Turret172
		turretModel[82] = new ModelRendererTurbo(this, 869, 401, textureX, textureY); // Turret173
		turretModel[83] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret174
		turretModel[84] = new ModelRendererTurbo(this, 646, 408, textureX, textureY); // Turret175
		turretModel[85] = new ModelRendererTurbo(this, 476, 659, textureX, textureY); // Turret176
		turretModel[86] = new ModelRendererTurbo(this, 166, 569, textureX, textureY); // Turret177
		turretModel[87] = new ModelRendererTurbo(this, 671, 462, textureX, textureY); // Turret178
		turretModel[88] = new ModelRendererTurbo(this, 868, 546, textureX, textureY); // Turret179
		turretModel[89] = new ModelRendererTurbo(this, 606, 445, textureX, textureY); // Turret18
		turretModel[90] = new ModelRendererTurbo(this, 646, 408, textureX, textureY); // Turret180
		turretModel[91] = new ModelRendererTurbo(this, 868, 546, textureX, textureY); // Turret181
		turretModel[92] = new ModelRendererTurbo(this, 663, 408, textureX, textureY); // Turret182
		turretModel[93] = new ModelRendererTurbo(this, 663, 408, textureX, textureY); // Turret183
		turretModel[94] = new ModelRendererTurbo(this, 868, 546, textureX, textureY); // Turret184
		turretModel[95] = new ModelRendererTurbo(this, 663, 408, textureX, textureY); // Turret185
		turretModel[96] = new ModelRendererTurbo(this, 868, 546, textureX, textureY); // Turret186
		turretModel[97] = new ModelRendererTurbo(this, 663, 408, textureX, textureY); // Turret187
		turretModel[98] = new ModelRendererTurbo(this, 868, 546, textureX, textureY); // Turret188
		turretModel[99] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret189
		turretModel[100] = new ModelRendererTurbo(this, 606, 428, textureX, textureY); // Turret19
		turretModel[101] = new ModelRendererTurbo(this, 868, 546, textureX, textureY); // Turret190
		turretModel[102] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret191
		turretModel[103] = new ModelRendererTurbo(this, 844, 528, textureX, textureY); // Turret192
		turretModel[104] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret193
		turretModel[105] = new ModelRendererTurbo(this, 785, 522, textureX, textureY); // Turret194
		turretModel[106] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret195
		turretModel[107] = new ModelRendererTurbo(this, 844, 528, textureX, textureY); // Turret196
		turretModel[108] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret197
		turretModel[109] = new ModelRendererTurbo(this, 844, 528, textureX, textureY); // Turret198
		turretModel[110] = new ModelRendererTurbo(this, 476, 647, textureX, textureY); // Turret199
		turretModel[111] = new ModelRendererTurbo(this, 744, 462, textureX, textureY); // Turret2
		turretModel[112] = new ModelRendererTurbo(this, 606, 428, textureX, textureY); // Turret20
		turretModel[113] = new ModelRendererTurbo(this, 671, 462, textureX, textureY); // Turret200
		turretModel[114] = new ModelRendererTurbo(this, 367, 569, textureX, textureY); // Turret201
		turretModel[115] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret202
		turretModel[116] = new ModelRendererTurbo(this, 785, 522, textureX, textureY); // Turret203
		turretModel[117] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret204
		turretModel[118] = new ModelRendererTurbo(this, 844, 528, textureX, textureY); // Turret205
		turretModel[119] = new ModelRendererTurbo(this, 844, 551, textureX, textureY); // Turret206
		turretModel[120] = new ModelRendererTurbo(this, 868, 466, textureX, textureY); // Turret207
		turretModel[121] = new ModelRendererTurbo(this, 851, 426, textureX, textureY); // Turret208
		turretModel[122] = new ModelRendererTurbo(this, 868, 528, textureX, textureY); // Turret209
		turretModel[123] = new ModelRendererTurbo(this, 702, 465, textureX, textureY); // Turret21
		turretModel[124] = new ModelRendererTurbo(this, 851, 426, textureX, textureY); // Turret210
		turretModel[125] = new ModelRendererTurbo(this, 868, 528, textureX, textureY); // Turret211
		turretModel[126] = new ModelRendererTurbo(this, 868, 528, textureX, textureY); // Turret212
		turretModel[127] = new ModelRendererTurbo(this, 868, 437, textureX, textureY); // Turret213
		turretModel[128] = new ModelRendererTurbo(this, 852, 414, textureX, textureY); // Turret214
		turretModel[129] = new ModelRendererTurbo(this, 773, 570, textureX, textureY); // Turret215
		turretModel[130] = new ModelRendererTurbo(this, 852, 414, textureX, textureY); // Turret216
		turretModel[131] = new ModelRendererTurbo(this, 762, 570, textureX, textureY); // Turret217
		turretModel[132] = new ModelRendererTurbo(this, 868, 437, textureX, textureY); // Turret218
		turretModel[133] = new ModelRendererTurbo(this, 851, 405, textureX, textureY); // Turret219
		turretModel[134] = new ModelRendererTurbo(this, 709, 533, textureX, textureY); // Turret22
		turretModel[135] = new ModelRendererTurbo(this, 671, 462, textureX, textureY); // Turret220
		turretModel[136] = new ModelRendererTurbo(this, 697, 509, textureX, textureY); // Turret221
		turretModel[137] = new ModelRendererTurbo(this, 750, 450, textureX, textureY); // Turret222
		turretModel[138] = new ModelRendererTurbo(this, 452, 409, textureX, textureY); // Turret223
		turretModel[139] = new ModelRendererTurbo(this, 868, 448, textureX, textureY); // Turret224
		turretModel[140] = new ModelRendererTurbo(this, 851, 437, textureX, textureY); // Turret225
		turretModel[141] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret226
		turretModel[142] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret227
		turretModel[143] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret228
		turretModel[144] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret229
		turretModel[145] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret23
		turretModel[146] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret230
		turretModel[147] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret231
		turretModel[148] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret232
		turretModel[149] = new ModelRendererTurbo(this, 803, 407, textureX, textureY); // Turret233
		turretModel[150] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret234
		turretModel[151] = new ModelRendererTurbo(this, 310, 421, textureX, textureY); // Turret235
		turretModel[152] = new ModelRendererTurbo(this, 709, 533, textureX, textureY); // Turret236
		turretModel[153] = new ModelRendererTurbo(this, 671, 491, textureX, textureY); // Turret237
		turretModel[154] = new ModelRendererTurbo(this, 868, 466, textureX, textureY); // Turret238
		turretModel[155] = new ModelRendererTurbo(this, 851, 426, textureX, textureY); // Turret239
		turretModel[156] = new ModelRendererTurbo(this, 661, 428, textureX, textureY); // Turret24
		turretModel[157] = new ModelRendererTurbo(this, 868, 437, textureX, textureY); // Turret240
		turretModel[158] = new ModelRendererTurbo(this, 851, 426, textureX, textureY); // Turret241
		turretModel[159] = new ModelRendererTurbo(this, 852, 414, textureX, textureY); // Turret242
		turretModel[160] = new ModelRendererTurbo(this, 868, 437, textureX, textureY); // Turret243
		turretModel[161] = new ModelRendererTurbo(this, 852, 414, textureX, textureY); // Turret245
		turretModel[162] = new ModelRendererTurbo(this, 851, 405, textureX, textureY); // Turret246
		turretModel[163] = new ModelRendererTurbo(this, 868, 448, textureX, textureY); // Turret247
		turretModel[164] = new ModelRendererTurbo(this, 851, 437, textureX, textureY); // Turret248
		turretModel[165] = new ModelRendererTurbo(this, 661, 428, textureX, textureY); // Turret25
		turretModel[166] = new ModelRendererTurbo(this, 725, 426, textureX, textureY); // Turret26
		turretModel[167] = new ModelRendererTurbo(this, 725, 426, textureX, textureY); // Turret27
		turretModel[168] = new ModelRendererTurbo(this, 228, 461, textureX, textureY); // Turret28
		turretModel[169] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret29
		turretModel[170] = new ModelRendererTurbo(this, 750, 450, textureX, textureY); // Turret3
		turretModel[171] = new ModelRendererTurbo(this, 702, 465, textureX, textureY); // Turret30
		turretModel[172] = new ModelRendererTurbo(this, 752, 516, textureX, textureY); // Turret31
		turretModel[173] = new ModelRendererTurbo(this, 702, 465, textureX, textureY); // Turret32
		turretModel[174] = new ModelRendererTurbo(this, 752, 516, textureX, textureY); // Turret33
		turretModel[175] = new ModelRendererTurbo(this, 750, 450, textureX, textureY); // Turret34
		turretModel[176] = new ModelRendererTurbo(this, 134, 458, textureX, textureY); // Turret35
		turretModel[177] = new ModelRendererTurbo(this, 752, 516, textureX, textureY); // Turret36
		turretModel[178] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret37
		turretModel[179] = new ModelRendererTurbo(this, 702, 487, textureX, textureY); // Turret38
		turretModel[180] = new ModelRendererTurbo(this, 746, 508, textureX, textureY); // Turret39
		turretModel[181] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret4
		turretModel[182] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret40
		turretModel[183] = new ModelRendererTurbo(this, 7, 454, textureX, textureY); // Turret41
		turretModel[184] = new ModelRendererTurbo(this, 702, 487, textureX, textureY); // Turret42
		turretModel[185] = new ModelRendererTurbo(this, 71, 457, textureX, textureY); // Turret43
		turretModel[186] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret44
		turretModel[187] = new ModelRendererTurbo(this, 702, 487, textureX, textureY); // Turret45
		turretModel[188] = new ModelRendererTurbo(this, 746, 508, textureX, textureY); // Turret46
		turretModel[189] = new ModelRendererTurbo(this, 71, 422, textureX, textureY); // Turret47
		turretModel[190] = new ModelRendererTurbo(this, 746, 508, textureX, textureY); // Turret48
		turretModel[191] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret49
		turretModel[192] = new ModelRendererTurbo(this, 213, 494, textureX, textureY); // Turret5
		turretModel[193] = new ModelRendererTurbo(this, 714, 491, textureX, textureY); // Turret50
		turretModel[194] = new ModelRendererTurbo(this, 746, 508, textureX, textureY); // Turret51
		turretModel[195] = new ModelRendererTurbo(this, 291, 432, textureX, textureY); // Turret52
		turretModel[196] = new ModelRendererTurbo(this, 750, 450, textureX, textureY); // Turret53
		turretModel[197] = new ModelRendererTurbo(this, 134, 423, textureX, textureY); // Turret54
		turretModel[198] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret55
		turretModel[199] = new ModelRendererTurbo(this, 702, 465, textureX, textureY); // Turret56
		turretModel[200] = new ModelRendererTurbo(this, 709, 533, textureX, textureY); // Turret57
		turretModel[201] = new ModelRendererTurbo(this, 227, 425, textureX, textureY); // Turret58
		turretModel[202] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret59
		turretModel[203] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret6
		turretModel[204] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret60
		turretModel[205] = new ModelRendererTurbo(this, 743, 460, textureX, textureY); // Turret61
		turretModel[206] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret62
		turretModel[207] = new ModelRendererTurbo(this, 678, 443, textureX, textureY); // Turret63
		turretModel[208] = new ModelRendererTurbo(this, 7, 425, textureX, textureY); // Turret64
		turretModel[209] = new ModelRendererTurbo(this, 702, 465, textureX, textureY); // Turret65
		turretModel[210] = new ModelRendererTurbo(this, 702, 465, textureX, textureY); // Turret66
		turretModel[211] = new ModelRendererTurbo(this, 721, 415, textureX, textureY); // Turret67
		turretModel[212] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret68
		turretModel[213] = new ModelRendererTurbo(this, 702, 487, textureX, textureY); // Turret69
		turretModel[214] = new ModelRendererTurbo(this, 742, 464, textureX, textureY); // Turret7
		turretModel[215] = new ModelRendererTurbo(this, 721, 415, textureX, textureY); // Turret70
		turretModel[216] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret71
		turretModel[217] = new ModelRendererTurbo(this, 678, 418, textureX, textureY); // Turret72
		turretModel[218] = new ModelRendererTurbo(this, 702, 487, textureX, textureY); // Turret73
		turretModel[219] = new ModelRendererTurbo(this, 721, 415, textureX, textureY); // Turret74
		turretModel[220] = new ModelRendererTurbo(this, 702, 487, textureX, textureY); // Turret75
		turretModel[221] = new ModelRendererTurbo(this, 721, 415, textureX, textureY); // Turret76
		turretModel[222] = new ModelRendererTurbo(this, 714, 491, textureX, textureY); // Turret77
		turretModel[223] = new ModelRendererTurbo(this, 793, 426, textureX, textureY); // Turret78
		turretModel[224] = new ModelRendererTurbo(this, 671, 462, textureX, textureY); // Turret79
		turretModel[225] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret8
		turretModel[226] = new ModelRendererTurbo(this, 793, 426, textureX, textureY); // Turret80
		turretModel[227] = new ModelRendererTurbo(this, 671, 462, textureX, textureY); // Turret81
		turretModel[228] = new ModelRendererTurbo(this, 671, 462, textureX, textureY); // Turret82
		turretModel[229] = new ModelRendererTurbo(this, 793, 426, textureX, textureY); // Turret83
		turretModel[230] = new ModelRendererTurbo(this, 664, 491, textureX, textureY); // Turret84
		turretModel[231] = new ModelRendererTurbo(this, 793, 426, textureX, textureY); // Turret85
		turretModel[232] = new ModelRendererTurbo(this, 750, 437, textureX, textureY); // Turret86
		turretModel[233] = new ModelRendererTurbo(this, 899, 398, textureX, textureY); // Turret87
		turretModel[234] = new ModelRendererTurbo(this, 793, 426, textureX, textureY); // Turret88
		turretModel[235] = new ModelRendererTurbo(this, 671, 491, textureX, textureY); // Turret89
		turretModel[236] = new ModelRendererTurbo(this, 664, 491, textureX, textureY); // Turret9
		turretModel[237] = new ModelRendererTurbo(this, 751, 408, textureX, textureY); // Turret90
		turretModel[238] = new ModelRendererTurbo(this, 793, 446, textureX, textureY); // Turret91
		turretModel[239] = new ModelRendererTurbo(this, 751, 426, textureX, textureY); // Turret92
		turretModel[240] = new ModelRendererTurbo(this, 793, 473, textureX, textureY); // Turret93
		turretModel[241] = new ModelRendererTurbo(this, 793, 473, textureX, textureY); // Turret94
		turretModel[242] = new ModelRendererTurbo(this, 362, 493, textureX, textureY); // Turret95
		turretModel[243] = new ModelRendererTurbo(this, 751, 426, textureX, textureY); // Turret96
		turretModel[244] = new ModelRendererTurbo(this, 495, 483, textureX, textureY); // Turret97
		turretModel[245] = new ModelRendererTurbo(this, 793, 473, textureX, textureY); // Turret98
		turretModel[246] = new ModelRendererTurbo(this, 770, 444, textureX, textureY); // Turret99

		turretModel[0].addShapeBox(-16F, -11F, -30F, 35, 9, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret1
		turretModel[0].setRotationPoint(0F, -28F, 0F);

		turretModel[1].addShapeBox(32F, -14.6F, -12F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret10
		turretModel[1].setRotationPoint(0F, -28F, 0F);
		turretModel[1].rotateAngleY = -0.40142573F;

		turretModel[2].addShapeBox(31.7F, -10F, 18F, 1, 1, 1, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Turret100
		turretModel[2].setRotationPoint(0F, -28F, 0F);
		turretModel[2].rotateAngleZ = 0.34906585F;

		turretModel[3].addShapeBox(-54F, -21F, 0F, 2, 1, 2, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret101
		turretModel[3].setRotationPoint(0F, -28F, 0F);

		turretModel[4].addShapeBox(31.7F, -10F, 9F, 1, 1, 1, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Turret102
		turretModel[4].setRotationPoint(0F, -28F, 0F);
		turretModel[4].rotateAngleZ = 0.34906585F;

		turretModel[5].addShapeBox(-3F, -17.5F, -21F, 11, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret103
		turretModel[5].setRotationPoint(0F, -28F, 0F);

		turretModel[6].addShapeBox(-54F, -23F, 0F, 2, 2, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret104
		turretModel[6].setRotationPoint(0F, -28F, 0F);

		turretModel[7].addShapeBox(16F, -30.8F, 18.5F, 1, 4, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Turret105
		turretModel[7].setRotationPoint(0F, -28F, 0F);
		turretModel[7].rotateAngleZ = -0.45378561F;

		turretModel[8].addShapeBox(-8F, -17.5F, -21F, 5, 3, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret106
		turretModel[8].setRotationPoint(0F, -28F, 0F);

		turretModel[9].addShapeBox(-54F, -23F, 1F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Turret107
		turretModel[9].setRotationPoint(0F, -28F, 0F);

		turretModel[10].addShapeBox(-53.5F, -29F, 0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret108
		turretModel[10].setRotationPoint(0F, -28F, 0F);

		turretModel[11].addShapeBox(16F, -30.8F, 8.5F, 1, 4, 1, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Turret109
		turretModel[11].setRotationPoint(0F, -28F, 0F);
		turretModel[11].rotateAngleZ = -0.45378561F;

		turretModel[12].addShapeBox(6.5F, -18.5F, 9F, 1, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Turret11
		turretModel[12].setRotationPoint(0F, -28F, 0F);

		turretModel[13].addShapeBox(8F, -17.5F, -21F, 8, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F); // Turret110
		turretModel[13].setRotationPoint(0F, -28F, 0F);

		turretModel[14].addShapeBox(-7F, -22.5F, -18F, 1, 1, 10, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Turret111
		turretModel[14].setRotationPoint(0F, -28F, 0F);

		turretModel[15].addShapeBox(25.5F, -19.5F, 19.5F, 1, 1, 1, 0F,-.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Turret112
		turretModel[15].setRotationPoint(0F, -28F, 0F);

		turretModel[16].addShapeBox(-49F, -20F, 2.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret113
		turretModel[16].setRotationPoint(0F, -28F, 0F);

		turretModel[17].addShapeBox(-59F, -15F, -22.7F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Turret114
		turretModel[17].setRotationPoint(0F, -28F, 0F);

		turretModel[18].addShapeBox(31F, -15.6F, 11F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret115
		turretModel[18].setRotationPoint(0F, -28F, 0F);
		turretModel[18].rotateAngleY = 0.40142573F;

		turretModel[19].addShapeBox(-46F, -12F, 25F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret116
		turretModel[19].setRotationPoint(0F, -28F, 0F);

		turretModel[20].addShapeBox(-48F, -20F, 2.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret117
		turretModel[20].setRotationPoint(0F, -28F, 0F);

		turretModel[21].addShapeBox(-7.5F, -23F, -18F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret118
		turretModel[21].setRotationPoint(0F, -28F, 0F);

		turretModel[22].addShapeBox(-68F, -9F, -24F, 15, 5, 48, 0F,0F, 0F, -3F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F); // Turret119
		turretModel[22].setRotationPoint(0F, -28F, 0F);

		turretModel[23].addShapeBox(-53.5F, -30F, 0.5F, 1, 1, 1, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret12
		turretModel[23].setRotationPoint(0F, -28F, 0F);

		turretModel[24].addShapeBox(-40F, -20F, 2.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret120
		turretModel[24].setRotationPoint(0F, -28F, 0F);

		turretModel[25].addShapeBox(-8F, -23F, -18F, 1, 5, 1, 0F,0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F); // Turret121
		turretModel[25].setRotationPoint(0F, -28F, 0F);

		turretModel[26].addShapeBox(-6F, -23F, -18F, 1, 5, 1, 0F,0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F); // Turret122
		turretModel[26].setRotationPoint(0F, -28F, 0F);

		turretModel[27].addShapeBox(-68F, -12F, 17F, 15, 1, 7, 0F,0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F); // Turret123
		turretModel[27].setRotationPoint(0F, -28F, 0F);

		turretModel[28].addShapeBox(-49F, -20F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret124
		turretModel[28].setRotationPoint(0F, -28F, 0F);

		turretModel[29].addShapeBox(-48F, -20F, -1.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret125
		turretModel[29].setRotationPoint(0F, -28F, 0F);

		turretModel[30].addShapeBox(-6F, -23F, -10F, 1, 5, 1, 0F,0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F); // Turret126
		turretModel[30].setRotationPoint(0F, -28F, 0F);

		turretModel[31].addShapeBox(-68F, -12F, -24F, 15, 1, 7, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F); // Turret127
		turretModel[31].setRotationPoint(0F, -28F, 0F);

		turretModel[32].addShapeBox(-68F, -12F, -21F, 1, 1, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret128
		turretModel[32].setRotationPoint(0F, -28F, 0F);

		turretModel[33].addShapeBox(-40F, -20F, -1.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret129
		turretModel[33].setRotationPoint(0F, -28F, 0F);

		turretModel[34].addShapeBox(-44F, -8F, 32F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret13
		turretModel[34].setRotationPoint(0F, -28F, 0F);
		turretModel[34].rotateAngleY = 0.13962634F;

		turretModel[35].addShapeBox(-7.5F, -23F, -10F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret130
		turretModel[35].setRotationPoint(0F, -28F, 0F);

		turretModel[36].addShapeBox(-16F, -9F, 30F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret131
		turretModel[36].setRotationPoint(0F, -28F, 0F);

		turretModel[37].addShapeBox(-8F, -23F, -10F, 1, 5, 1, 0F,0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F); // Turret132
		turretModel[37].setRotationPoint(0F, -28F, 0F);

		turretModel[38].addShapeBox(-68F, -15F, -21F, 1, 1, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret133
		turretModel[38].setRotationPoint(0F, -28F, 0F);

		turretModel[39].addShapeBox(-7.5F, -23F, -9F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret134
		turretModel[39].setRotationPoint(0F, -28F, 0F);

		turretModel[40].addShapeBox(-16F, -7F, 30F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F); // Turret135
		turretModel[40].setRotationPoint(0F, -28F, 0F);

		turretModel[41].addShapeBox(-5.5F, -22.5F, -9F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret136
		turretModel[41].setRotationPoint(0F, -28F, 0F);

		turretModel[42].addShapeBox(-18F, -11.5F, 31F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret137
		turretModel[42].setRotationPoint(0F, -28F, 0F);
		turretModel[42].rotateAngleX = -0.15707963F;
		turretModel[42].rotateAngleZ = -0.52359878F;

		turretModel[43].addShapeBox(-8F, -18F, -18F, 3, 1, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret138
		turretModel[43].setRotationPoint(0F, -28F, 0F);

		turretModel[44].addShapeBox(-18F, -11.6F, 31F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Turret139
		turretModel[44].setRotationPoint(0F, -28F, 0F);
		turretModel[44].rotateAngleX = -0.15707963F;
		turretModel[44].rotateAngleZ = -0.52359878F;

		turretModel[45].addShapeBox(-44F, -3F, 32F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret14
		turretModel[45].setRotationPoint(0F, -28F, 0F);
		turretModel[45].rotateAngleY = 0.13962634F;

		turretModel[46].addShapeBox(-15.5F, -11F, 31F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret140
		turretModel[46].setRotationPoint(0F, -28F, 0F);
		turretModel[46].rotateAngleX = -0.08726646F;
		turretModel[46].rotateAngleZ = -0.52359878F;

		turretModel[47].addShapeBox(-8F, -18F, -10F, 3, 1, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret141
		turretModel[47].setRotationPoint(0F, -28F, 0F);

		turretModel[48].addBox(-68F, -15F, 16.5F, 1, 7, 1, 0F); // Turret142
		turretModel[48].setRotationPoint(0F, -28F, 0F);

		turretModel[49].addShapeBox(19F, -2F, -30F, 8, 3, 60, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Turret143
		turretModel[49].setRotationPoint(0F, -28F, 0F);

		turretModel[50].addShapeBox(5.5F, -19F, 1F, 6, 1, 5, 0F,-.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret144
		turretModel[50].setRotationPoint(0F, -28F, 0F);
		turretModel[50].rotateAngleZ = -0.19198622F;

		turretModel[51].addShapeBox(-56F, -15F, -23.25F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Turret145
		turretModel[51].setRotationPoint(0F, -28F, 0F);

		turretModel[52].addShapeBox(-5.5F, -22.5F, -17F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret146
		turretModel[52].setRotationPoint(0F, -28F, 0F);

		turretModel[53].addBox(-68F, -15F, -17.5F, 1, 7, 1, 0F); // Turret147
		turretModel[53].setRotationPoint(0F, -28F, 0F);

		turretModel[54].addShapeBox(-15.5F, -11.1F, 31F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Turret148
		turretModel[54].setRotationPoint(0F, -28F, 0F);
		turretModel[54].rotateAngleX = -0.08726646F;
		turretModel[54].rotateAngleZ = -0.52359878F;

		turretModel[55].addShapeBox(-13F, -11.5F, 31F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret149
		turretModel[55].setRotationPoint(0F, -28F, 0F);
		turretModel[55].rotateAngleX = -0.05235988F;
		turretModel[55].rotateAngleZ = -0.52359878F;

		turretModel[56].addShapeBox(-29F, -8F, 33F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret15
		turretModel[56].setRotationPoint(0F, -28F, 0F);
		turretModel[56].rotateAngleY = 0.13962634F;

		turretModel[57].addBox(-68F, -15F, 11.5F, 1, 7, 1, 0F); // Turret150
		turretModel[57].setRotationPoint(0F, -28F, 0F);

		turretModel[58].addShapeBox(-7.5F, -23F, -17F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret151
		turretModel[58].setRotationPoint(0F, -28F, 0F);

		turretModel[59].addShapeBox(-1F, -20.5F, -20F, 6, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret152
		turretModel[59].setRotationPoint(0F, -28F, 0F);

		turretModel[60].addShapeBox(-13F, -11.6F, 31F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Turret153
		turretModel[60].setRotationPoint(0F, -28F, 0F);
		turretModel[60].rotateAngleX = -0.05235988F;
		turretModel[60].rotateAngleZ = -0.52359878F;

		turretModel[61].addBox(-68F, -15F, -11.5F, 1, 7, 1, 0F); // Turret154
		turretModel[61].setRotationPoint(0F, -28F, 0F);

		turretModel[62].addBox(-68F, -15F, -5.5F, 1, 7, 1, 0F); // Turret155
		turretModel[62].setRotationPoint(0F, -28F, 0F);

		turretModel[63].addShapeBox(-10.5F, -11F, 31F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret156
		turretModel[63].setRotationPoint(0F, -28F, 0F);
		turretModel[63].rotateAngleZ = -0.52359878F;

		turretModel[64].addShapeBox(-4F, -20.5F, -20F, 3, 1, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret157
		turretModel[64].setRotationPoint(0F, -28F, 0F);

		turretModel[65].addShapeBox(5F, -20.5F, -20F, 3, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Turret158
		turretModel[65].setRotationPoint(0F, -28F, 0F);

		turretModel[66].addBox(-68F, -15F, 6.5F, 1, 7, 1, 0F); // Turret159
		turretModel[66].setRotationPoint(0F, -28F, 0F);

		turretModel[67].addShapeBox(-44F, -8F, 33F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret16
		turretModel[67].setRotationPoint(0F, -28F, 0F);
		turretModel[67].rotateAngleY = 0.13962634F;

		turretModel[68].addShapeBox(-10.5F, -11.1F, 31F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Turret160
		turretModel[68].setRotationPoint(0F, -28F, 0F);
		turretModel[68].rotateAngleZ = -0.52359878F;

		turretModel[69].addShapeBox(-16F, -7F, -34F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F); // Turret161
		turretModel[69].setRotationPoint(0F, -28F, 0F);

		turretModel[70].addShapeBox(8F, -20.5F, -18F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.5F, 0F, 0F, -.5F); // Turret162
		turretModel[70].setRotationPoint(0F, -28F, 0F);

		turretModel[71].addBox(-68F, -15F, 0.5F, 1, 7, 1, 0F); // Turret163
		turretModel[71].setRotationPoint(0F, -28F, 0F);

		turretModel[72].addShapeBox(-16F, -9F, -34F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret164
		turretModel[72].setRotationPoint(0F, -28F, 0F);

		turretModel[73].addShapeBox(-62F, -15F, 21.1F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F); // Turret165
		turretModel[73].setRotationPoint(0F, -28F, 0F);

		turretModel[74].addShapeBox(-0.5F, -24.5F, -18F, 5, 4, 12, 0F,-1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret166
		turretModel[74].setRotationPoint(0F, -28F, 0F);

		turretModel[75].addShapeBox(4.5F, -24.5F, -18F, 3, 4, 12, 0F,1F, 0F, -3F, -2F, 0F, -4.5F, -2F, 0F, -4.5F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Turret167
		turretModel[75].setRotationPoint(0F, -28F, 0F);

		turretModel[76].addShapeBox(-18F, -12F, -32.5F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret168
		turretModel[76].setRotationPoint(0F, -28F, 0F);
		turretModel[76].rotateAngleX = 0.15707963F;
		turretModel[76].rotateAngleZ = -0.52359878F;

		turretModel[77].addShapeBox(-65F, -15F, 20.55F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F); // Turret169
		turretModel[77].setRotationPoint(0F, -28F, 0F);

		turretModel[78].addShapeBox(-43F, -8F, 33F, 14, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret17
		turretModel[78].setRotationPoint(0F, -28F, 0F);
		turretModel[78].rotateAngleY = 0.13962634F;

		turretModel[79].addShapeBox(-3.5F, -24.5F, -18F, 3, 4, 12, 0F,-2F, 0F, -4.5F, 1F, 0F, -3F, 1F, 0F, -3F, -2F, 0F, -4.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Turret170
		turretModel[79].setRotationPoint(0F, -28F, 0F);

		turretModel[80].addShapeBox(-59F, -15F, 21.65F, 1, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F); // Turret171
		turretModel[80].setRotationPoint(0F, -28F, 0F);

		turretModel[81].addShapeBox(-15.5F, -11F, -33F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret172
		turretModel[81].setRotationPoint(0F, -28F, 0F);
		turretModel[81].rotateAngleX = 0.08726646F;
		turretModel[81].rotateAngleZ = -0.52359878F;

		turretModel[82].addShapeBox(6F, -19.5F, -13.5F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret173
		turretModel[82].setRotationPoint(0F, -28F, 0F);

		turretModel[83].addShapeBox(-56F, -15F, 22.25F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F); // Turret174
		turretModel[83].setRotationPoint(0F, -28F, 0F);

		turretModel[84].addShapeBox(-13F, -11F, -33F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret175
		turretModel[84].setRotationPoint(0F, -28F, 0F);
		turretModel[84].rotateAngleX = 0.05235988F;
		turretModel[84].rotateAngleZ = -0.52359878F;

		turretModel[85].addShapeBox(10F, -18.5F, 2F, 4, 2, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret176
		turretModel[85].setRotationPoint(0F, -28F, 0F);

		turretModel[86].addShapeBox(-16F, -2F, -30F, 35, 3, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret177
		turretModel[86].setRotationPoint(0F, -28F, 0F);

		turretModel[87].addShapeBox(-57F, -17F, 14F, 4, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret178
		turretModel[87].setRotationPoint(0F, -28F, 0F);

		turretModel[88].addShapeBox(15F, -19.5F, -9.5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret179
		turretModel[88].setRotationPoint(0F, -28F, 0F);
		turretModel[88].rotateAngleY = -0.78539816F;

		turretModel[89].addShapeBox(-43F, -8F, -38F, 14, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret18
		turretModel[89].setRotationPoint(0F, -28F, 0F);
		turretModel[89].rotateAngleY = -0.13962634F;

		turretModel[90].addShapeBox(-10.5F, -11F, -33F, 2, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret180
		turretModel[90].setRotationPoint(0F, -28F, 0F);
		turretModel[90].rotateAngleZ = -0.52359878F;

		turretModel[91].addShapeBox(12F, -19.5F, 7.5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret181
		turretModel[91].setRotationPoint(0F, -28F, 0F);
		turretModel[91].rotateAngleY = -2.35619449F;

		turretModel[92].addShapeBox(-10.5F, -11.1F, -33F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Turret182
		turretModel[92].setRotationPoint(0F, -28F, 0F);
		turretModel[92].rotateAngleZ = -0.52359878F;

		turretModel[93].addShapeBox(-13F, -11.1F, -33F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Turret183
		turretModel[93].setRotationPoint(0F, -28F, 0F);
		turretModel[93].rotateAngleX = 0.05235988F;
		turretModel[93].rotateAngleZ = -0.52359878F;

		turretModel[94].addShapeBox(17F, -19.5F, -0.5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret184
		turretModel[94].setRotationPoint(0F, -28F, 0F);
		turretModel[94].rotateAngleY = -1.57079633F;

		turretModel[95].addShapeBox(-15.5F, -11.1F, -33F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Turret185
		turretModel[95].setRotationPoint(0F, -28F, 0F);
		turretModel[95].rotateAngleX = 0.08726646F;
		turretModel[95].rotateAngleZ = -0.52359878F;

		turretModel[96].addShapeBox(-2F, -19.5F, -12.5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret186
		turretModel[96].setRotationPoint(0F, -28F, 0F);
		turretModel[96].rotateAngleY = 0.78539816F;

		turretModel[97].addShapeBox(-18F, -12.1F, -32.5F, 2, 1, 2, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F); // Turret187
		turretModel[97].setRotationPoint(0F, -28F, 0F);
		turretModel[97].rotateAngleX = 0.15707963F;
		turretModel[97].rotateAngleZ = -0.52359878F;

		turretModel[98].addShapeBox(-5F, -19.5F, 4.5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret188
		turretModel[98].setRotationPoint(0F, -28F, 0F);
		turretModel[98].rotateAngleY = 2.35619449F;

		turretModel[99].addShapeBox(-49F, -12F, 25F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret189
		turretModel[99].setRotationPoint(0F, -28F, 0F);

		turretModel[100].addShapeBox(-44F, -3F, -38F, 16, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret19
		turretModel[100].setRotationPoint(0F, -28F, 0F);
		turretModel[100].rotateAngleY = -0.13962634F;

		turretModel[101].addShapeBox(-7F, -19.5F, -4.5F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret190
		turretModel[101].setRotationPoint(0F, -28F, 0F);
		turretModel[101].rotateAngleY = 1.57079633F;

		turretModel[102].addShapeBox(-49.5F, -12F, 29F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret191
		turretModel[102].setRotationPoint(0F, -28F, 0F);

		turretModel[103].addShapeBox(11F, -23.5F, -15F, 2, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret192
		turretModel[103].setRotationPoint(0F, -28F, 0F);

		turretModel[104].addShapeBox(-46F, -15F, 29F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret193
		turretModel[104].setRotationPoint(0F, -28F, 0F);

		turretModel[105].addShapeBox(8F, -20.5F, -12F, 2, 1, 6, 0F,0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, 0F); // Turret194
		turretModel[105].setRotationPoint(0F, -28F, 0F);

		turretModel[106].addShapeBox(-49F, -15F, 29F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret195
		turretModel[106].setRotationPoint(0F, -28F, 0F);

		turretModel[107].addShapeBox(9F, -23.5F, -15F, 2, 6, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret196
		turretModel[107].setRotationPoint(0F, -28F, 0F);

		turretModel[108].addShapeBox(-49.5F, -16F, 29F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret197
		turretModel[108].setRotationPoint(0F, -28F, 0F);

		turretModel[109].addShapeBox(13F, -22.5F, -15F, 2, 1, 6, 0F,0F, .5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Turret198
		turretModel[109].setRotationPoint(0F, -28F, 0F);

		turretModel[110].addBox(11F, -24.5F, 1.5F, 2, 6, 2, 0F); // Turret199
		turretModel[110].setRotationPoint(0F, -28F, 1F);

		turretModel[111].addShapeBox(17.5F, -17F, -3.5F, 2, 3, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret2
		turretModel[111].setRotationPoint(0F, -28F, 0F);

		turretModel[112].addShapeBox(-44F, -8F, -33F, 16, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret20
		turretModel[112].setRotationPoint(0F, -28F, 0F);
		turretModel[112].rotateAngleY = -0.13962634F;

		turretModel[113].addShapeBox(-57F, -17F, 13F, 4, 10, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret200
		turretModel[113].setRotationPoint(0F, -28F, 0F);

		turretModel[114].addShapeBox(-53F, -2F, -30F, 37, 2, 60, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -5F); // Turret201
		turretModel[114].setRotationPoint(0F, -28F, 0F);

		turretModel[115].addShapeBox(-44.5F, -16F, 29F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret202
		turretModel[115].setRotationPoint(0F, -28F, 0F);

		turretModel[116].addShapeBox(8F, -20.5F, -13.5F, 1, 1, 3, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Turret203
		turretModel[116].setRotationPoint(0F, -28F, 0F);

		turretModel[117].addShapeBox(-50.5F, -16F, 29F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Turret204
		turretModel[117].setRotationPoint(0F, -28F, 0F);

		turretModel[118].addShapeBox(13F, -21.5F, -15F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Turret205
		turretModel[118].setRotationPoint(0F, -28F, 0F);

		turretModel[119].addShapeBox(13.5F, -21.5F, -13.5F, 1, 3, 3, 0F,-.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F, -.2F); // Turret206
		turretModel[119].setRotationPoint(0F, -28F, 0F);

		turretModel[120].addShapeBox(-48F, -15.5F, 22.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret207
		turretModel[120].setRotationPoint(0F, -28F, 0F);

		turretModel[121].addShapeBox(-31.5F, -40.5F, 25.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret208
		turretModel[121].setRotationPoint(0F, -28F, 0F);
		turretModel[121].rotateAngleZ = 0.61086524F;

		turretModel[122].addShapeBox(13.5F, -18F, -15.5F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Turret209
		turretModel[122].setRotationPoint(0F, -28F, 0F);

		turretModel[123].addShapeBox(-61F, -16F, 20F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Turret21
		turretModel[123].setRotationPoint(0F, -28F, 0F);

		turretModel[124].addShapeBox(-31.5F, -38.5F, 25.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Turret210
		turretModel[124].setRotationPoint(0F, -28F, 0F);
		turretModel[124].rotateAngleZ = 0.61086524F;

		turretModel[125].addShapeBox(10.5F, -18F, -15.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret211
		turretModel[125].setRotationPoint(0F, -28F, 0F);

		turretModel[126].addShapeBox(8.5F, -18F, -15.5F, 2, 1, 7, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Turret212
		turretModel[126].setRotationPoint(0F, -28F, 0F);

		turretModel[127].addShapeBox(-31.5F, -39F, 25.5F, 3, 1, 3, 0F,.2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F); // Turret213
		turretModel[127].setRotationPoint(0F, -28F, 0F);
		turretModel[127].rotateAngleZ = 0.61086524F;

		turretModel[128].addShapeBox(-31.5F, -43.5F, 25.5F, 3, 3, 3, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret214
		turretModel[128].setRotationPoint(0F, -28F, 0F);
		turretModel[128].rotateAngleZ = 0.61086524F;

		turretModel[129].addShapeBox(-12F, -22F, -10F, 4, 2, 1, 0F,-1F, 1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, -1F, 1F, -.1F, 0F, -3F, -.1F, 0F, .2F, -.1F, 0F, .2F, -.1F, 0F, -3F, -.1F); // Turret215
		turretModel[129].setRotationPoint(0F, -28F, 0F);

		turretModel[130].addShapeBox(-31.5F, -44.5F, 25.5F, 3, 1, 3, 0F,-.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret216
		turretModel[130].setRotationPoint(0F, -28F, 0F);
		turretModel[130].rotateAngleZ = 0.61086524F;

		turretModel[131].addShapeBox(-12F, -23.5F, -10F, 1, 1, 1, 0F,.2F, -.3F, .1F, .2F, -.3F, .1F, .2F, -.3F, .1F, .2F, -.3F, .1F, .2F, -.3F, .1F, .2F, -.3F, .1F, .2F, -.3F, .1F, .2F, -.3F, .1F); // Turret217
		turretModel[131].setRotationPoint(0F, -28F, 0F);

		turretModel[132].addShapeBox(-31.5F, -42F, 25.5F, 3, 1, 3, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Turret218
		turretModel[132].setRotationPoint(0F, -28F, 0F);
		turretModel[132].rotateAngleZ = 0.61086524F;

		turretModel[133].addShapeBox(-31F, -44.5F, 26F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret219
		turretModel[133].setRotationPoint(0F, -28F, 0F);
		turretModel[133].rotateAngleZ = 0.61086524F;

		turretModel[134].addShapeBox(-1.5F, -18.5F, 9F, 1, 1, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Turret22
		turretModel[134].setRotationPoint(0F, -28F, 0F);

		turretModel[135].addShapeBox(-57F, -17F, 20F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Turret220
		turretModel[135].setRotationPoint(0F, -28F, 0F);

		turretModel[136].addShapeBox(-1F, -17.5F, 9.5F, 8, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret221
		turretModel[136].setRotationPoint(0F, -28F, 0F);

		turretModel[137].addShapeBox(31F, -14.1F, -12F, 3, 1, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret222
		turretModel[137].setRotationPoint(0F, -28F, 0F);
		turretModel[137].rotateAngleY = -0.40142573F;

		turretModel[138].addShapeBox(-53F, -15F, -30F, 37, 4, 60, 0F,-1F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Turret223
		turretModel[138].setRotationPoint(0F, -28F, 0F);

		turretModel[139].addShapeBox(-30.5F, -49.5F, 26.5F, 1, 5, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret224
		turretModel[139].setRotationPoint(0F, -28F, 0F);
		turretModel[139].rotateAngleZ = 0.61086524F;

		turretModel[140].addShapeBox(-30.5F, -95.5F, 26.5F, 1, 46, 1, 0F,-.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret225
		turretModel[140].setRotationPoint(0F, -28F, 0F);
		turretModel[140].rotateAngleZ = 0.61086524F;

		turretModel[141].addShapeBox(-46F, -12F, -30F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret226
		turretModel[141].setRotationPoint(0F, -28F, 0F);

		turretModel[142].addShapeBox(-49F, -12F, -30F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret227
		turretModel[142].setRotationPoint(0F, -28F, 0F);

		turretModel[143].addShapeBox(-49.5F, -12F, -30F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret228
		turretModel[143].setRotationPoint(0F, -28F, 0F);

		turretModel[144].addShapeBox(-44.5F, -16F, -30F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Turret229
		turretModel[144].setRotationPoint(0F, -28F, 0F);

		turretModel[145].addShapeBox(33F, -15.6F, -12F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret23
		turretModel[145].setRotationPoint(0F, -28F, 0F);
		turretModel[145].rotateAngleY = -0.40142573F;

		turretModel[146].addShapeBox(-46F, -15F, -30F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret230
		turretModel[146].setRotationPoint(0F, -28F, 0F);

		turretModel[147].addShapeBox(-49F, -15F, -30F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret231
		turretModel[147].setRotationPoint(0F, -28F, 0F);

		turretModel[148].addShapeBox(-50.5F, -16F, -30F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Turret232
		turretModel[148].setRotationPoint(0F, -28F, 0F);

		turretModel[149].addShapeBox(-49.5F, -16F, -30F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret233
		turretModel[149].setRotationPoint(0F, -28F, 0F);

		turretModel[150].addShapeBox(31F, -15.6F, -12F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret234
		turretModel[150].setRotationPoint(0F, -28F, 0F);
		turretModel[150].rotateAngleY = -0.40142573F;

		turretModel[151].addShapeBox(-16F, -15F, -30F, 35, 4, 60, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret235
		turretModel[151].setRotationPoint(0F, -28F, 0F);

		turretModel[152].addShapeBox(-0.5F, -18.5F, 9F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret236
		turretModel[152].setRotationPoint(0F, -28F, 0F);

		turretModel[153].addShapeBox(-57F, -18F, 14F, 4, 1, 5, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret237
		turretModel[153].setRotationPoint(0F, -28F, 0F);

		turretModel[154].addShapeBox(-48F, -15.5F, -26.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret238
		turretModel[154].setRotationPoint(0F, -28F, 0F);

		turretModel[155].addShapeBox(-31.5F, -38.5F, -28.5F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Turret239
		turretModel[155].setRotationPoint(0F, -28F, 0F);
		turretModel[155].rotateAngleZ = 0.61086524F;

		turretModel[156].addShapeBox(-29F, -8F, -37F, 1, 5, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret24
		turretModel[156].setRotationPoint(0F, -28F, -1F);
		turretModel[156].rotateAngleY = -0.13962634F;

		turretModel[157].addShapeBox(-31.5F, -39F, -28.5F, 3, 1, 3, 0F,.2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F, .2F, -.2F, .2F); // Turret240
		turretModel[157].setRotationPoint(0F, -28F, 0F);
		turretModel[157].rotateAngleZ = 0.61086524F;

		turretModel[158].addShapeBox(-31.5F, -40.5F, -28.5F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret241
		turretModel[158].setRotationPoint(0F, -28F, 0F);
		turretModel[158].rotateAngleZ = 0.61086524F;

		turretModel[159].addShapeBox(-31.5F, -43.5F, -28.5F, 3, 3, 3, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret242
		turretModel[159].setRotationPoint(0F, -28F, 0F);
		turretModel[159].rotateAngleZ = 0.61086524F;

		turretModel[160].addShapeBox(-31.5F, -42F, -28.5F, 3, 1, 3, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Turret243
		turretModel[160].setRotationPoint(0F, -28F, 0F);
		turretModel[160].rotateAngleZ = 0.61086524F;

		turretModel[161].addShapeBox(-31.5F, -44.5F, -28.5F, 3, 1, 3, 0F,-.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret245
		turretModel[161].setRotationPoint(0F, -28F, 0F);
		turretModel[161].rotateAngleZ = 0.61086524F;

		turretModel[162].addShapeBox(-31F, -44.5F, -28F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret246
		turretModel[162].setRotationPoint(0F, -28F, 0F);
		turretModel[162].rotateAngleZ = 0.61086524F;

		turretModel[163].addShapeBox(-30.5F, -49.5F, -27.5F, 1, 5, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret247
		turretModel[163].setRotationPoint(0F, -28F, 0F);
		turretModel[163].rotateAngleZ = 0.61086524F;

		turretModel[164].addShapeBox(-30.5F, -95.5F, -27.5F, 1, 46, 1, 0F,-.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Turret248
		turretModel[164].setRotationPoint(0F, -28F, 0F);
		turretModel[164].rotateAngleZ = 0.61086524F;

		turretModel[165].addShapeBox(-44F, -8F, -37F, 1, 5, 5, 0F,0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret25
		turretModel[165].setRotationPoint(0F, -28F, -1F);
		turretModel[165].rotateAngleY = -0.13962634F;

		turretModel[166].addShapeBox(-41.5F, -17.5F, -17F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret26
		turretModel[166].setRotationPoint(0F, -28F, 0F);

		turretModel[167].addShapeBox(-41.5F, -17.5F, -7F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret27
		turretModel[167].setRotationPoint(0F, -28F, 0F);

		turretModel[168].addShapeBox(19F, -11F, 13F, 17, 9, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Turret28
		turretModel[168].setRotationPoint(0F, -28F, 0F);

		turretModel[169].addShapeBox(31F, -16.6F, -12F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret29
		turretModel[169].setRotationPoint(0F, -28F, 0F);
		turretModel[169].rotateAngleY = -0.40142573F;

		turretModel[170].addShapeBox(31F, -14.1F, 11F, 3, 1, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret3
		turretModel[170].setRotationPoint(0F, -28F, 0F);
		turretModel[170].rotateAngleY = 0.40142573F;

		turretModel[171].addShapeBox(-61F, -15F, 13F, 4, 8, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret30
		turretModel[171].setRotationPoint(0F, -28F, 0F);

		turretModel[172].addShapeBox(-3.5F, -18.5F, 9.5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret31
		turretModel[172].setRotationPoint(0F, -28F, 0F);

		turretModel[173].addShapeBox(-61F, -15F, 14F, 4, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret32
		turretModel[173].setRotationPoint(0F, -28F, 0F);

		turretModel[174].addShapeBox(-4F, -19F, 10F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret33
		turretModel[174].setRotationPoint(0F, -28F, 0F);

		turretModel[175].addShapeBox(-6F, -18F, -23F, 3, 1, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret34
		turretModel[175].setRotationPoint(0F, -28F, 0F);

		turretModel[176].addShapeBox(19F, -15F, 7F, 17, 4, 23, 0F,0F, 0F, -6F, 0F, -2.5F, -6F, 0F, -4F, -6F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Turret35
		turretModel[176].setRotationPoint(0F, -28F, 0F);

		turretModel[177].addShapeBox(-4F, -19F, 17F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret36
		turretModel[177].setRotationPoint(0F, -28F, 0F);

		turretModel[178].addShapeBox(-4F, -19.5F, -23F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret37
		turretModel[178].setRotationPoint(0F, -28F, 0F);

		turretModel[179].addShapeBox(-61F, -16F, 15F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret38
		turretModel[179].setRotationPoint(0F, -28F, 0F);

		turretModel[180].addShapeBox(-4F, -19F, 18F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret39
		turretModel[180].setRotationPoint(0F, -28F, 0F);

		turretModel[181].addShapeBox(-68F, -15F, 17F, 16, 1, 7, 0F,0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F); // Turret4
		turretModel[181].setRotationPoint(0F, -28F, 0F);

		turretModel[182].addShapeBox(-5F, -18.5F, -23F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret40
		turretModel[182].setRotationPoint(0F, -28F, 0F);

		turretModel[183].addShapeBox(36F, -13F, 3F, 6, 2, 21, 0F,0F, -.5F, -10F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, -2F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Turret41
		turretModel[183].setRotationPoint(0F, -28F, 0F);

		turretModel[184].addShapeBox(-61F, -16F, 19F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret42
		turretModel[184].setRotationPoint(0F, -28F, 0F);

		turretModel[185].addShapeBox(36F, -11F, 3F, 6, 9, 21, 0F,0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Turret43
		turretModel[185].setRotationPoint(0F, -28F, 0F);

		turretModel[186].addShapeBox(-6F, -19.5F, -23F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret44
		turretModel[186].setRotationPoint(0F, -28F, 0F);

		turretModel[187].addShapeBox(-59.5F, -16F, 16F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret45
		turretModel[187].setRotationPoint(0F, -28F, 0F);

		turretModel[188].addShapeBox(-4F, -19F, 11F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret46
		turretModel[188].setRotationPoint(0F, -28F, 0F);

		turretModel[189].addShapeBox(36F, -11F, -24F, 6, 9, 21, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Turret47
		turretModel[189].setRotationPoint(0F, -28F, 0F);

		turretModel[190].addShapeBox(-2F, -19F, 18F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret48
		turretModel[190].setRotationPoint(0F, -28F, 0F);

		turretModel[191].addShapeBox(-6F, -20.5F, -23F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret49
		turretModel[191].setRotationPoint(0F, -28F, 0F);

		turretModel[192].addShapeBox(-53F, -11F, -30F, 37, 9, 60, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Turret5
		turretModel[192].setRotationPoint(0F, -28F, 0F);

		turretModel[193].addShapeBox(-59.5F, -16F, 13.5F, 1, 1, 1, 0F,.2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret50
		turretModel[193].setRotationPoint(0F, -28F, 0F);

		turretModel[194].addShapeBox(-2F, -19F, 11F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret51
		turretModel[194].setRotationPoint(0F, -28F, 0F);

		turretModel[195].addShapeBox(19F, -15F, -13F, 10, 4, 26, 0F,0F, 0F, 0F, 0F, -1.48F, 0F, 0F, -1.48F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret52
		turretModel[195].setRotationPoint(0F, -28F, 0F);

		turretModel[196].addShapeBox(-6F, -18F, 22F, 3, 1, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret53
		turretModel[196].setRotationPoint(0F, -28F, 0F);

		turretModel[197].addShapeBox(19F, -15F, -30F, 17, 4, 23, 0F,0F, 0F, -3F, 0F, -4F, -6F, 0F, -2.5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F); // Turret54
		turretModel[197].setRotationPoint(0F, -28F, 0F);

		turretModel[198].addShapeBox(-4F, -19.5F, 22F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret55
		turretModel[198].setRotationPoint(0F, -28F, 0F);

		turretModel[199].addShapeBox(-61F, -15F, 5.8F, 4, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret56
		turretModel[199].setRotationPoint(0F, -28F, 0F);

		turretModel[200].addShapeBox(-4F, -17.2F, 10F, 2, 1, 10, 0F,-.5F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, -.5F, .1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret57
		turretModel[200].setRotationPoint(0F, -28F, 0F);

		turretModel[201].addShapeBox(19F, -11F, -30F, 17, 9, 17, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret58
		turretModel[201].setRotationPoint(0F, -28F, 0F);

		turretModel[202].addShapeBox(31F, -16.6F, 11F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret59
		turretModel[202].setRotationPoint(0F, -28F, 0F);
		turretModel[202].rotateAngleY = 0.40142573F;

		turretModel[203].addShapeBox(33F, -15.6F, 11F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret6
		turretModel[203].setRotationPoint(0F, -28F, 0F);
		turretModel[203].rotateAngleY = 0.40142573F;

		turretModel[204].addShapeBox(-65F, -15F, -21.55F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Turret60
		turretModel[204].setRotationPoint(0F, -28F, 0F);

		turretModel[205].addShapeBox(22.5F, -17F, -3.5F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Turret61
		turretModel[205].setRotationPoint(0F, -28F, 0F);

		turretModel[206].addShapeBox(-5F, -18.5F, 22F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret62
		turretModel[206].setRotationPoint(0F, -28F, 0F);

		turretModel[207].addShapeBox(-43F, -17.05F, 9.5F, 19, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret63
		turretModel[207].setRotationPoint(0F, -28F, 0F);

		turretModel[208].addShapeBox(36F, -13F, -24F, 6, 2, 21, 0F,0F, -2F, 0F, 0F, -2F, -10F, 0F, -2F, -10F, 0F, -.5F, -10F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -10F); // Turret64
		turretModel[208].setRotationPoint(0F, -28F, 0F);

		turretModel[209].addShapeBox(-61F, -15F, 4.8F, 4, 8, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret65
		turretModel[209].setRotationPoint(0F, -28F, 0F);

		turretModel[210].addShapeBox(-61F, -16F, 11.8F, 4, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Turret66
		turretModel[210].setRotationPoint(0F, -28F, 0F);

		turretModel[211].addShapeBox(-41F, -17.2F, 17F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret67
		turretModel[211].setRotationPoint(0F, -28F, 0F);

		turretModel[212].addShapeBox(-6F, -19.5F, 22F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret68
		turretModel[212].setRotationPoint(0F, -28F, 0F);

		turretModel[213].addShapeBox(-61F, -16F, 10.8F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret69
		turretModel[213].setRotationPoint(0F, -28F, 0F);

		turretModel[214].addShapeBox(19.5F, -17F, -3.5F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret7
		turretModel[214].setRotationPoint(0F, -28F, 0F);

		turretModel[215].addShapeBox(-29F, -17.2F, 17F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret70
		turretModel[215].setRotationPoint(0F, -28F, 0F);

		turretModel[216].addShapeBox(-6F, -20.5F, 22F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret71
		turretModel[216].setRotationPoint(0F, -28F, 0F);

		turretModel[217].addShapeBox(-48F, -17.05F, -20.5F, 9, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret72
		turretModel[217].setRotationPoint(0F, -28F, 0F);

		turretModel[218].addShapeBox(-59.5F, -16F, 7.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret73
		turretModel[218].setRotationPoint(0F, -28F, 0F);

		turretModel[219].addShapeBox(-48.5F, -17.2F, -19F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret74
		turretModel[219].setRotationPoint(0F, -28F, 0F);

		turretModel[220].addShapeBox(-61F, -16F, 6.8F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret75
		turretModel[220].setRotationPoint(0F, -28F, 0F);

		turretModel[221].addShapeBox(-48.5F, -17.2F, -7F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret76
		turretModel[221].setRotationPoint(0F, -28F, 0F);

		turretModel[222].addShapeBox(-59.5F, -16F, 5.3F, 1, 1, 1, 0F,.2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret77
		turretModel[222].setRotationPoint(0F, -28F, 0F);

		turretModel[223].addShapeBox(21F, -14F, 8F, 6, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret78
		turretModel[223].setRotationPoint(0F, -28F, 0F);

		turretModel[224].addShapeBox(-57F, -17F, 4.8F, 4, 10, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret79
		turretModel[224].setRotationPoint(0F, -28F, 0F);

		turretModel[225].addShapeBox(-68F, -15F, -24F, 16, 1, 7, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -3F); // Turret8
		turretModel[225].setRotationPoint(0F, -28F, 0F);

		turretModel[226].addShapeBox(21F, -20F, 8F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret80
		turretModel[226].setRotationPoint(0F, -28F, 0F);

		turretModel[227].addShapeBox(-57F, -17F, 5.8F, 4, 10, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret81
		turretModel[227].setRotationPoint(0F, -28F, 0F);

		turretModel[228].addShapeBox(-57F, -17F, 11.8F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Turret82
		turretModel[228].setRotationPoint(0F, -28F, 0F);

		turretModel[229].addShapeBox(26F, -19F, 18F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret83
		turretModel[229].setRotationPoint(0F, -28F, 0F);

		turretModel[230].addShapeBox(-55.5F, -18F, 11.3F, 1, 1, 1, 0F,.2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret84
		turretModel[230].setRotationPoint(0F, -28F, 0F);

		turretModel[231].addShapeBox(26F, -19F, 15F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret85
		turretModel[231].setRotationPoint(0F, -28F, 0F);

		turretModel[232].addShapeBox(32F, -14.6F, 11F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret86
		turretModel[232].setRotationPoint(0F, -28F, 0F);
		turretModel[232].rotateAngleY = 0.40142573F;

		turretModel[233].addShapeBox(-62F, -15F, -22.1F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Turret87
		turretModel[233].setRotationPoint(0F, -28F, 0F);

		turretModel[234].addShapeBox(26F, -19F, 8F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret88
		turretModel[234].setRotationPoint(0F, -28F, 0F);

		turretModel[235].addShapeBox(-57F, -18F, 5.8F, 4, 1, 5, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret89
		turretModel[235].setRotationPoint(0F, -28F, 0F);

		turretModel[236].addShapeBox(-55.5F, -18F, 19.5F, 1, 1, 1, 0F,.2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, -.7F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Turret9
		turretModel[236].setRotationPoint(0F, -28F, 0F);

		turretModel[237].addShapeBox(-55F, -17F, -1.5F, 4, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Turret90
		turretModel[237].setRotationPoint(0F, -28F, 0F);

		turretModel[238].addShapeBox(21F, -19F, 8F, 5, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret91
		turretModel[238].setRotationPoint(0F, -28F, 0F);

		turretModel[239].addShapeBox(-55F, -20F, -1F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Turret92
		turretModel[239].setRotationPoint(0F, -28F, 0F);

		turretModel[240].addShapeBox(32.2F, -10F, 8F, 3, 1, 12, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Turret93
		turretModel[240].setRotationPoint(0F, -28F, 0F);
		turretModel[240].rotateAngleZ = 0.34906585F;

		turretModel[241].addShapeBox(35.2F, -10F, 8F, 1, 1, 12, 0F,0F, -.3F, 0F, 0F, -.3F, -2F, 0F, -.3F, -2F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -2F, 0F, -.3F, -2F, 0F, -.3F, 0F); // Turret94
		turretModel[241].setRotationPoint(0F, -28F, 0F);
		turretModel[241].rotateAngleZ = 0.34906585F;

		turretModel[242].addShapeBox(-16F, -17F, -27F, 35, 2, 54, 0F,0F, 0F, -3F, -11F, 0F, -3F, -11F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret95
		turretModel[242].setRotationPoint(0F, -28F, 0F);

		turretModel[243].addShapeBox(-55F, -20F, 2F, 4, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Turret96
		turretModel[243].setRotationPoint(0F, -28F, 0F);

		turretModel[244].addShapeBox(-52F, -17F, -27F, 36, 2, 54, 0F,-1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Turret97
		turretModel[244].setRotationPoint(0F, -28F, 0F);

		turretModel[245].addShapeBox(36.2F, -10F, 10F, 1, 1, 8, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F); // Turret98
		turretModel[245].setRotationPoint(0F, -28F, 0F);
		turretModel[245].rotateAngleZ = 0.34906585F;

		turretModel[246].addShapeBox(-54F, -20F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Turret99
		turretModel[246].setRotationPoint(0F, -28F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 511, 654, textureX, textureY); // MachineGun1
		barrelModel[1] = new ModelRendererTurbo(this, 511, 684, textureX, textureY); // MachineGun10
		barrelModel[2] = new ModelRendererTurbo(this, 440, 684, textureX, textureY); // MachineGun11
		barrelModel[3] = new ModelRendererTurbo(this, 423, 683, textureX, textureY); // MachineGun12
		barrelModel[4] = new ModelRendererTurbo(this, 434, 648, textureX, textureY); // MachineGun13
		barrelModel[5] = new ModelRendererTurbo(this, 434, 648, textureX, textureY); // MachineGun14
		barrelModel[6] = new ModelRendererTurbo(this, 434, 648, textureX, textureY); // MachineGun15
		barrelModel[7] = new ModelRendererTurbo(this, 458, 642, textureX, textureY); // MachineGun16
		barrelModel[8] = new ModelRendererTurbo(this, 452, 657, textureX, textureY); // MachineGun17
		barrelModel[9] = new ModelRendererTurbo(this, 422, 666, textureX, textureY); // MachineGun18
		barrelModel[10] = new ModelRendererTurbo(this, 446, 678, textureX, textureY); // MachineGun19
		barrelModel[11] = new ModelRendererTurbo(this, 511, 666, textureX, textureY); // MachineGun2
		barrelModel[12] = new ModelRendererTurbo(this, 470, 696, textureX, textureY); // MachineGun20
		barrelModel[13] = new ModelRendererTurbo(this, 470, 696, textureX, textureY); // MachineGun21
		barrelModel[14] = new ModelRendererTurbo(this, 487, 684, textureX, textureY); // MachineGun22
		barrelModel[15] = new ModelRendererTurbo(this, 470, 684, textureX, textureY); // MachineGun23
		barrelModel[16] = new ModelRendererTurbo(this, 470, 684, textureX, textureY); // MachineGun24
		barrelModel[17] = new ModelRendererTurbo(this, 450, 700, textureX, textureY); // MachineGun25
		barrelModel[18] = new ModelRendererTurbo(this, 422, 700, textureX, textureY); // MachineGun26
		barrelModel[19] = new ModelRendererTurbo(this, 422, 700, textureX, textureY); // MachineGun26
		barrelModel[20] = new ModelRendererTurbo(this, 439, 700, textureX, textureY); // MachineGun27
		barrelModel[21] = new ModelRendererTurbo(this, 439, 700, textureX, textureY); // MachineGun28
		barrelModel[22] = new ModelRendererTurbo(this, 422, 700, textureX, textureY); // MachineGun29
		barrelModel[23] = new ModelRendererTurbo(this, 511, 648, textureX, textureY); // MachineGun3
		barrelModel[24] = new ModelRendererTurbo(this, 422, 700, textureX, textureY); // MachineGun30
		barrelModel[25] = new ModelRendererTurbo(this, 450, 700, textureX, textureY); // MachineGun31
		barrelModel[26] = new ModelRendererTurbo(this, 468, 708, textureX, textureY); // MachineGun4
		barrelModel[27] = new ModelRendererTurbo(this, 468, 708, textureX, textureY); // MachineGun5
		barrelModel[28] = new ModelRendererTurbo(this, 468, 708, textureX, textureY); // MachineGun6
		barrelModel[29] = new ModelRendererTurbo(this, 511, 678, textureX, textureY); // MachineGun7
		barrelModel[30] = new ModelRendererTurbo(this, 522, 684, textureX, textureY); // MachineGun8
		barrelModel[31] = new ModelRendererTurbo(this, 511, 684, textureX, textureY); // MachineGun9
		barrelModel[32] = new ModelRendererTurbo(this, 104, 643, textureX, textureY); // MainGun1
		barrelModel[33] = new ModelRendererTurbo(this, 19, 653, textureX, textureY); // MainGun10
		barrelModel[34] = new ModelRendererTurbo(this, 19, 664, textureX, textureY); // MainGun11
		barrelModel[35] = new ModelRendererTurbo(this, 19, 653, textureX, textureY); // MainGun12
		barrelModel[36] = new ModelRendererTurbo(this, 10, 686, textureX, textureY); // MainGun13
		barrelModel[37] = new ModelRendererTurbo(this, 10, 686, textureX, textureY); // MainGun14
		barrelModel[38] = new ModelRendererTurbo(this, 10, 686, textureX, textureY); // MainGun15
		barrelModel[39] = new ModelRendererTurbo(this, 10, 686, textureX, textureY); // MainGun16
		barrelModel[40] = new ModelRendererTurbo(this, 13, 695, textureX, textureY); // MainGun17
		barrelModel[41] = new ModelRendererTurbo(this, 29, 702, textureX, textureY); // MainGun18
		barrelModel[42] = new ModelRendererTurbo(this, 29, 719, textureX, textureY); // MainGun19
		barrelModel[43] = new ModelRendererTurbo(this, 17, 646, textureX, textureY); // MainGun2
		barrelModel[44] = new ModelRendererTurbo(this, 29, 685, textureX, textureY); // MainGun20
		barrelModel[45] = new ModelRendererTurbo(this, 179, 689, textureX, textureY); // MainGun21
		barrelModel[46] = new ModelRendererTurbo(this, 159, 726, textureX, textureY); // MainGun22
		barrelModel[47] = new ModelRendererTurbo(this, 67, 705, textureX, textureY); // MainGun23
		barrelModel[48] = new ModelRendererTurbo(this, 67, 722, textureX, textureY); // MainGun24
		barrelModel[49] = new ModelRendererTurbo(this, 247, 725, textureX, textureY); // MainGun25
		barrelModel[50] = new ModelRendererTurbo(this, 247, 708, textureX, textureY); // MainGun26
		barrelModel[51] = new ModelRendererTurbo(this, 247, 691, textureX, textureY); // MainGun27
		barrelModel[52] = new ModelRendererTurbo(this, 67, 688, textureX, textureY); // MainGun28
		barrelModel[53] = new ModelRendererTurbo(this, 179, 723, textureX, textureY); // MainGun29
		barrelModel[54] = new ModelRendererTurbo(this, 19, 664, textureX, textureY); // MainGun3
		barrelModel[55] = new ModelRendererTurbo(this, 179, 706, textureX, textureY); // MainGun30
		barrelModel[56] = new ModelRendererTurbo(this, 159, 708, textureX, textureY); // MainGun31
		barrelModel[57] = new ModelRendererTurbo(this, 221, 722, textureX, textureY); // MainGun32
		barrelModel[58] = new ModelRendererTurbo(this, 221, 704, textureX, textureY); // MainGun33
		barrelModel[59] = new ModelRendererTurbo(this, 159, 691, textureX, textureY); // MainGun34
		barrelModel[60] = new ModelRendererTurbo(this, 225, 688, textureX, textureY); // MainGun36
		barrelModel[61] = new ModelRendererTurbo(this, 343, 725, textureX, textureY); // MainGun37
		barrelModel[62] = new ModelRendererTurbo(this, 343, 708, textureX, textureY); // MainGun38
		barrelModel[63] = new ModelRendererTurbo(this, 343, 691, textureX, textureY); // MainGun39
		barrelModel[64] = new ModelRendererTurbo(this, 19, 653, textureX, textureY); // MainGun4
		barrelModel[65] = new ModelRendererTurbo(this, 373, 695, textureX, textureY); // MainGun40
		barrelModel[66] = new ModelRendererTurbo(this, 377, 709, textureX, textureY); // MainGun41
		barrelModel[67] = new ModelRendererTurbo(this, 377, 709, textureX, textureY); // MainGun42
		barrelModel[68] = new ModelRendererTurbo(this, 377, 709, textureX, textureY); // MainGun43
		barrelModel[69] = new ModelRendererTurbo(this, 19, 653, textureX, textureY); // MainGun5
		barrelModel[70] = new ModelRendererTurbo(this, 19, 653, textureX, textureY); // MainGun6
		barrelModel[71] = new ModelRendererTurbo(this, 19, 653, textureX, textureY); // MainGun7
		barrelModel[72] = new ModelRendererTurbo(this, 19, 653, textureX, textureY); // MainGun8
		barrelModel[73] = new ModelRendererTurbo(this, 19, 653, textureX, textureY); // MainGun9

		barrelModel[0].addShapeBox(-13F, -2.5F, -1.5F, 12, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun1
		barrelModel[0].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[1].addShapeBox(0.9F, -2.5F, 1.7F, 1, 2, 2, 0F,-.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -2F, 0F, -.4F, -2F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // MachineGun10
		barrelModel[1].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[2].addShapeBox(1.5F, -1.5F, -5.6F, 2, 2, 5, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F); // MachineGun11
		barrelModel[2].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[3].addShapeBox(1.5F, -3.5F, -5.5F, 2, 2, 4, 0F,.1F, -.6F, -2F, .1F, -.6F, -2F, .1F, -.2F, 0F, .1F, -.2F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // MachineGun12
		barrelModel[3].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[4].addShapeBox(4F, -2F, -1.5F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun13
		barrelModel[4].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[5].addShapeBox(4F, -3F, -1.5F, 9, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun14
		barrelModel[5].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[6].addShapeBox(4F, -1F, -1.5F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // MachineGun15
		barrelModel[6].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[7].addShapeBox(3.5F, -4.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MachineGun16
		barrelModel[7].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[8].addShapeBox(13F, -2.5F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F); // MachineGun17
		barrelModel[8].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[9].addShapeBox(14F, -2F, -0.5F, 16, 1, 1, 0F,0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // MachineGun18
		barrelModel[9].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[10].addShapeBox(30F, -2F, -0.5F, 3, 1, 1, 0F,0F, .25F, .25F, 0F, .25F, .25F, 0F, .25F, .25F, 0F, .25F, .25F, 0F, .25F, .25F, 0F, .25F, .25F, 0F, .25F, .25F, 0F, .25F, .25F); // MachineGun19
		barrelModel[10].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[11].addShapeBox(-1F, -2.5F, -1.5F, 5, 3, 3, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // MachineGun2
		barrelModel[11].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[12].addShapeBox(2F, 0.3F, -1.4F, 7, 1, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // MachineGun20
		barrelModel[12].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[13].addShapeBox(2F, 0.3F, 0.4F, 7, 1, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // MachineGun21
		barrelModel[13].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[14].addShapeBox(5F, 2.5F, -2F, 5, 3, 4, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F); // MachineGun22
		barrelModel[14].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[15].addShapeBox(0F, 2.5F, 1F, 5, 3, 1, 0F,-1F, 2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -1F, 2F, .2F, 0F, -4F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, -4F, .2F); // MachineGun23
		barrelModel[15].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[16].addShapeBox(0F, 2.5F, -2F, 5, 3, 1, 0F,-1F, 2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -1F, 2F, .2F, 0F, -4F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, -4F, .2F); // MachineGun24
		barrelModel[16].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[17].addShapeBox(-16F, -3.5F, 1.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun25
		barrelModel[17].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[18].addShapeBox(-15F, -0.55F, 1.5F, 3, 1, 1, 0F,0F, -.7F, 0F, 0F, -.7F, 1F, 0F, -.7F, -1F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // MachineGun26
		barrelModel[18].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[19].addShapeBox(-15F, -3.45F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 1F, 0F, -.7F, -1F, 0F, -.7F, 0F); // MachineGun26
		barrelModel[19].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[20].addShapeBox(-15F, -2F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // MachineGun27
		barrelModel[20].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[21].addShapeBox(-15F, -2F, -2.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // MachineGun28
		barrelModel[21].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[22].addShapeBox(-15F, -0.55F, -2.5F, 3, 1, 1, 0F,0F, -.7F, 0F, 0F, -.7F, -1F, 0F, -.7F, 1F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // MachineGun29
		barrelModel[22].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[23].addShapeBox(-13F, -3.5F, -1.5F, 17, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun3
		barrelModel[23].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[24].addShapeBox(-15F, -3.45F, -2.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, -1F, 0F, -.7F, 1F, 0F, -.7F, 0F); // MachineGun30
		barrelModel[24].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[25].addShapeBox(-16F, -3.5F, -2.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun31
		barrelModel[25].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[26].addShapeBox(-3F, -2F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun4
		barrelModel[26].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[27].addShapeBox(-3F, -3F, 1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun5
		barrelModel[27].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[28].addShapeBox(-3F, -1F, 1.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // MachineGun6
		barrelModel[28].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[29].addShapeBox(1.5F, -2.5F, 1.5F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MachineGun7
		barrelModel[29].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[30].addShapeBox(1.5F, -0.5F, 1.5F, 2, 2, 5, 0F,.3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F); // MachineGun8
		barrelModel[30].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[31].addShapeBox(3.1F, -2.5F, 1.7F, 1, 2, 2, 0F,-.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, -2F, 0F, -.4F, -2F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F); // MachineGun9
		barrelModel[31].setRotationPoint(12F, -52.5F, 3.5F);

		barrelModel[32].addShapeBox(-8F, -4F, -13F, 13, 9, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun1
		barrelModel[32].setRotationPoint(37F, -35F, 0F);

		barrelModel[33].addShapeBox(-4F, -6.5F, 10F, 3, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MainGun10
		barrelModel[33].setRotationPoint(37F, -35F, 0F);
		barrelModel[33].rotateAngleZ = -0.19198622F;

		barrelModel[34].addShapeBox(-4F, -6F, 10F, 3, 1, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .4F, 0F, .4F, .4F, 0F, .4F, .4F, 0F, .4F, .4F, 0F, .4F); // MainGun11
		barrelModel[34].setRotationPoint(37F, -35F, 0F);
		barrelModel[34].rotateAngleZ = -0.19198622F;

		barrelModel[35].addShapeBox(-4F, -8.5F, 10F, 3, 1, 1, 0F,-1F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MainGun12
		barrelModel[35].setRotationPoint(37F, -35F, 0F);
		barrelModel[35].rotateAngleZ = -0.19198622F;

		barrelModel[36].addShapeBox(4.3F, -2F, 8F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun13
		barrelModel[36].setRotationPoint(37F, -35F, 0F);

		barrelModel[37].addShapeBox(4.3F, -3F, 8F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun14
		barrelModel[37].setRotationPoint(37F, -35F, 0F);

		barrelModel[38].addShapeBox(4.3F, -1F, 8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // MainGun15
		barrelModel[38].setRotationPoint(37F, -35F, 0F);

		barrelModel[39].addShapeBox(4.3F, -2F, 10F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun16
		barrelModel[39].setRotationPoint(37F, -35F, 0F);

		barrelModel[40].addShapeBox(4.2F, -2F, 9F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun17
		barrelModel[40].setRotationPoint(37F, -35F, 0F);

		barrelModel[41].addShapeBox(5F, -4F, -2F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun18
		barrelModel[41].setRotationPoint(37F, -35F, 0F);

		barrelModel[42].addShapeBox(5F, -4F, 2F, 10, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // MainGun19
		barrelModel[42].setRotationPoint(37F, -35F, 0F);

		barrelModel[43].addShapeBox(-8F, -7F, -13F, 13, 3, 26, 0F,-.5F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun2
		barrelModel[43].setRotationPoint(37F, -35F, 0F);

		barrelModel[44].addShapeBox(5F, -4F, -4F, 10, 8, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun20
		barrelModel[44].setRotationPoint(37F, -35F, 0F);

		barrelModel[45].addShapeBox(34F, -5F, -4F, 12, 8, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // MainGun21
		barrelModel[45].setRotationPoint(37F, -35F, 0F);

		barrelModel[46].addShapeBox(46F, -5F, 2F, 1, 8, 2, 0F,0F, .5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, -1.5F, 0F); // MainGun22
		barrelModel[46].setRotationPoint(37F, -35F, 0F);

		barrelModel[47].addShapeBox(15F, -3F, -1F, 34, 6, 2, 0F,0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F); // MainGun23
		barrelModel[47].setRotationPoint(37F, -35F, 0F);

		barrelModel[48].addShapeBox(15F, -3F, 1.5F, 34, 6, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // MainGun24
		barrelModel[48].setRotationPoint(37F, -35F, 0F);

		barrelModel[49].addShapeBox(49F, -3F, 1F, 40, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // MainGun25
		barrelModel[49].setRotationPoint(37F, -35F, 0F);

		barrelModel[50].addShapeBox(49F, -3F, -1F, 40, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun26
		barrelModel[50].setRotationPoint(37F, -35F, 0F);

		barrelModel[51].addShapeBox(49F, -3F, -3F, 40, 6, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MainGun27
		barrelModel[51].setRotationPoint(37F, -35F, 0F);

		barrelModel[52].addShapeBox(15F, -3F, -3.5F, 34, 6, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // MainGun28
		barrelModel[52].setRotationPoint(37F, -35F, 0F);

		barrelModel[53].addShapeBox(34F, -5F, 2F, 12, 8, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // MainGun29
		barrelModel[53].setRotationPoint(37F, -35F, 0F);

		barrelModel[54].addShapeBox(-4F, -6F, -11F, 3, 1, 1, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .4F, 0F, .4F, .4F, 0F, .4F, .4F, 0F, .4F, .4F, 0F, .4F); // MainGun3
		barrelModel[54].setRotationPoint(37F, -35F, 0F);
		barrelModel[54].rotateAngleZ = -0.19198622F;

		barrelModel[55].addShapeBox(34F, -5F, -1.5F, 12, 8, 3, 0F,0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, .5F, .5F); // MainGun30
		barrelModel[55].setRotationPoint(37F, -35F, 0F);

		barrelModel[56].addShapeBox(46F, -5F, -1.5F, 1, 8, 3, 0F,0F, .5F, .5F, 0F, -1F, .5F, 0F, -1F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, -1F, .5F, 0F, -1F, .5F, 0F, .5F, .5F); // MainGun31
		barrelModel[56].setRotationPoint(37F, -35F, 0F);

		barrelModel[57].addShapeBox(33F, -5F, 2F, 1, 8, 2, 0F,0F, -1F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -.5F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -.5F); // MainGun32
		barrelModel[57].setRotationPoint(37F, -35F, 0F);

		barrelModel[58].addShapeBox(33F, -5F, -1.5F, 1, 8, 3, 0F,0F, -1F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, -1F, .5F, 0F, -1F, .5F, 0F, .5F, .5F, 0F, .5F, .5F, 0F, -1F, .5F); // MainGun33
		barrelModel[58].setRotationPoint(37F, -35F, 0F);

		barrelModel[59].addShapeBox(46F, -5F, -4F, 1, 8, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, .5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, .5F, 0F); // MainGun34
		barrelModel[59].setRotationPoint(37F, -35F, 0F);

		barrelModel[60].addShapeBox(33F, -5F, -4F, 1, 8, 2, 0F,0F, -1.5F, -.5F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F); // MainGun36
		barrelModel[60].setRotationPoint(37F, -35F, 0F);

		barrelModel[61].addShapeBox(89F, -3F, 1F, 5, 6, 2, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -2F, -.3F, 0F, -2F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -2F, -.3F, 0F, -2F, -.3F); // MainGun37
		barrelModel[61].setRotationPoint(37F, -35F, 0F);

		barrelModel[62].addShapeBox(89F, -3F, -1F, 5, 6, 2, 0F,0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F); // MainGun38
		barrelModel[62].setRotationPoint(37F, -35F, 0F);

		barrelModel[63].addShapeBox(89F, -3F, -3F, 5, 6, 2, 0F,0F, -2F, -.3F, 0F, -2F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -2F, -.3F, 0F, -2F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F); // MainGun39
		barrelModel[63].setRotationPoint(37F, -35F, 0F);

		barrelModel[64].addShapeBox(-4F, -6.5F, -11F, 3, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MainGun4
		barrelModel[64].setRotationPoint(37F, -35F, 0F);
		barrelModel[64].rotateAngleZ = -0.19198622F;

		barrelModel[65].addBox(89F, -0.5F, 1F, 4, 1, 3, 0F); // MainGun40
		barrelModel[65].setRotationPoint(37F, -35F, 0F);

		barrelModel[66].addShapeBox(89F, -0.5F, 3F, 4, 1, 2, 0F,.1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F); // MainGun41
		barrelModel[66].setRotationPoint(37F, -35F, 0F);

		barrelModel[67].addShapeBox(89F, -1.5F, 3F, 4, 1, 2, 0F,.1F, -.2F, -.5F, .1F, -.2F, -.5F, .1F, -.2F, -.5F, .1F, -.2F, -.5F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F); // MainGun42
		barrelModel[67].setRotationPoint(37F, -35F, 0F);

		barrelModel[68].addShapeBox(89F, 0.5F, 3F, 4, 1, 2, 0F,.1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, -.2F, -.5F, .1F, -.2F, -.5F, .1F, -.2F, -.5F, .1F, -.2F, -.5F); // MainGun43
		barrelModel[68].setRotationPoint(37F, -35F, 0F);

		barrelModel[69].addShapeBox(-2F, -7.5F, -11F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MainGun5
		barrelModel[69].setRotationPoint(37F, -35F, 0F);
		barrelModel[69].rotateAngleZ = -0.19198622F;

		barrelModel[70].addShapeBox(-4F, -8.5F, -11F, 3, 1, 1, 0F,-1F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MainGun6
		barrelModel[70].setRotationPoint(37F, -35F, 0F);
		barrelModel[70].rotateAngleZ = -0.19198622F;

		barrelModel[71].addShapeBox(-4F, -7.5F, -11F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MainGun7
		barrelModel[71].setRotationPoint(37F, -35F, 0F);
		barrelModel[71].rotateAngleZ = -0.19198622F;

		barrelModel[72].addShapeBox(-4F, -7.5F, 10F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MainGun8
		barrelModel[72].setRotationPoint(37F, -35F, 0F);
		barrelModel[72].rotateAngleZ = -0.19198622F;

		barrelModel[73].addShapeBox(-2F, -7.5F, 10F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F); // MainGun9
		barrelModel[73].setRotationPoint(37F, -35F, 0F);
		barrelModel[73].rotateAngleZ = -0.19198622F;
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 115, 379, textureX, textureY); // LeftWheel1
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel10
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel100
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel101
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel102
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel103
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel104
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel105
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel106
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel107
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel108
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel109
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel11
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel110
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel111
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel112
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel113
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel114
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel115
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel116
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel117
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel118
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel119
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel12
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel120
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel121
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel122
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel123
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel124
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel125
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel126
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel127
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel128
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel129
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel13
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel130
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel131
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel132
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel133
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel134
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel135
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel136
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel137
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel138
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel139
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel14
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel140
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel141
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel15
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel16
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel17
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel18
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel19
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 115, 379, textureX, textureY); // LeftWheel2
		leftTrackWheelModels[54] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel20
		leftTrackWheelModels[55] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel21
		leftTrackWheelModels[56] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel22
		leftTrackWheelModels[57] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel23
		leftTrackWheelModels[58] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel24
		leftTrackWheelModels[59] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel25
		leftTrackWheelModels[60] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel26
		leftTrackWheelModels[61] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel27
		leftTrackWheelModels[62] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel28
		leftTrackWheelModels[63] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel29
		leftTrackWheelModels[64] = new ModelRendererTurbo(this, 115, 379, textureX, textureY); // LeftWheel3
		leftTrackWheelModels[65] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel30
		leftTrackWheelModels[66] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel31
		leftTrackWheelModels[67] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel32
		leftTrackWheelModels[68] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel33
		leftTrackWheelModels[69] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel34
		leftTrackWheelModels[70] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel35
		leftTrackWheelModels[71] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel36
		leftTrackWheelModels[72] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel37
		leftTrackWheelModels[73] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel38
		leftTrackWheelModels[74] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel39
		leftTrackWheelModels[75] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel4
		leftTrackWheelModels[76] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel40
		leftTrackWheelModels[77] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel41
		leftTrackWheelModels[78] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel42
		leftTrackWheelModels[79] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel43
		leftTrackWheelModels[80] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel44
		leftTrackWheelModels[81] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel45
		leftTrackWheelModels[82] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel46
		leftTrackWheelModels[83] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel47
		leftTrackWheelModels[84] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel48
		leftTrackWheelModels[85] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel49
		leftTrackWheelModels[86] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel5
		leftTrackWheelModels[87] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel50
		leftTrackWheelModels[88] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel51
		leftTrackWheelModels[89] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel52
		leftTrackWheelModels[90] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel53
		leftTrackWheelModels[91] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel54
		leftTrackWheelModels[92] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel55
		leftTrackWheelModels[93] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel56
		leftTrackWheelModels[94] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel57
		leftTrackWheelModels[95] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel58
		leftTrackWheelModels[96] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel59
		leftTrackWheelModels[97] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel6
		leftTrackWheelModels[98] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel60
		leftTrackWheelModels[99] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel61
		leftTrackWheelModels[100] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel62
		leftTrackWheelModels[101] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel63
		leftTrackWheelModels[102] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel64
		leftTrackWheelModels[103] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel65
		leftTrackWheelModels[104] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel66
		leftTrackWheelModels[105] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel67
		leftTrackWheelModels[106] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel68
		leftTrackWheelModels[107] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel69
		leftTrackWheelModels[108] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel70
		leftTrackWheelModels[109] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // LeftWheel71
		leftTrackWheelModels[110] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel72
		leftTrackWheelModels[111] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel73
		leftTrackWheelModels[112] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel74
		leftTrackWheelModels[113] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel75
		leftTrackWheelModels[114] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel76
		leftTrackWheelModels[115] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel77
		leftTrackWheelModels[116] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel78
		leftTrackWheelModels[117] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel79
		leftTrackWheelModels[118] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel8
		leftTrackWheelModels[119] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel80
		leftTrackWheelModels[120] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel81
		leftTrackWheelModels[121] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel82
		leftTrackWheelModels[122] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel83
		leftTrackWheelModels[123] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel84
		leftTrackWheelModels[124] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel85
		leftTrackWheelModels[125] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel86
		leftTrackWheelModels[126] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel87
		leftTrackWheelModels[127] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel88
		leftTrackWheelModels[128] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel89
		leftTrackWheelModels[129] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel9
		leftTrackWheelModels[130] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel90
		leftTrackWheelModels[131] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel91
		leftTrackWheelModels[132] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // LeftWheel92
		leftTrackWheelModels[133] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel93
		leftTrackWheelModels[134] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel94
		leftTrackWheelModels[135] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // LeftWheel95
		leftTrackWheelModels[136] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel96
		leftTrackWheelModels[137] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // LeftWheel97
		leftTrackWheelModels[138] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel98
		leftTrackWheelModels[139] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // LeftWheel99

		leftTrackWheelModels[0].addShapeBox(-8F, 3F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel1
		leftTrackWheelModels[0].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[1].addShapeBox(-4F, 2F, 6F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel10
		leftTrackWheelModels[1].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[2].addShapeBox(-3F, -3F, 7F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel100
		leftTrackWheelModels[2].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[3].addShapeBox(-3F, 1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel101
		leftTrackWheelModels[3].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[4].addShapeBox(7F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel102
		leftTrackWheelModels[4].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[5].addShapeBox(-3F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // LeftWheel103
		leftTrackWheelModels[5].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[6].addShapeBox(-3F, -8F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel104
		leftTrackWheelModels[6].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[7].addShapeBox(-8F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // LeftWheel105
		leftTrackWheelModels[7].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[8].addShapeBox(-8F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel106
		leftTrackWheelModels[8].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[9].addShapeBox(-8F, 3F, 6F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel107
		leftTrackWheelModels[9].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[10].addShapeBox(-3F, 7F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel108
		leftTrackWheelModels[10].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[11].addShapeBox(-3F, 3F, 6F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel109
		leftTrackWheelModels[11].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[12].addShapeBox(-4F, -2F, 6F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel11
		leftTrackWheelModels[12].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[13].addShapeBox(-3F, -8F, 6F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel110
		leftTrackWheelModels[13].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[14].addShapeBox(-8F, -8F, 6F, 12, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // LeftWheel111
		leftTrackWheelModels[14].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[15].addShapeBox(-8F, -3F, 6F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel112
		leftTrackWheelModels[15].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[16].addShapeBox(-8F, 3F, 6F, 12, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel113
		leftTrackWheelModels[16].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[17].addShapeBox(-3F, 6F, 6F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel114
		leftTrackWheelModels[17].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[18].addShapeBox(-4F, 3F, 6F, 12, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel115
		leftTrackWheelModels[18].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[19].addShapeBox(6F, -3F, 6F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel116
		leftTrackWheelModels[19].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[20].addShapeBox(-4F, -8F, 6F, 12, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // LeftWheel117
		leftTrackWheelModels[20].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[21].addShapeBox(8F, -1F, 7F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel118
		leftTrackWheelModels[21].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[22].addShapeBox(-10F, -1F, 7F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel119
		leftTrackWheelModels[22].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[23].addShapeBox(-3F, -3F, 7F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel12
		leftTrackWheelModels[23].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[24].addShapeBox(5.5F, -6.5F, 7F, 3, 3, 2, 0F,-1.7F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F); // LeftWheel120
		leftTrackWheelModels[24].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[25].addShapeBox(-8.5F, -6.5F, 7F, 3, 3, 2, 0F,0F, -1.7F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F); // LeftWheel121
		leftTrackWheelModels[25].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[26].addShapeBox(-5F, -10F, 7F, 3, 3, 2, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // LeftWheel122
		leftTrackWheelModels[26].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[27].addShapeBox(2F, 7F, 7F, 3, 3, 2, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // LeftWheel123
		leftTrackWheelModels[27].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[28].addShapeBox(-8F, 3F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel124
		leftTrackWheelModels[28].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[29].addShapeBox(-8F, -3F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel125
		leftTrackWheelModels[29].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[30].addShapeBox(-8F, -8F, 0F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel126
		leftTrackWheelModels[30].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[31].addShapeBox(-3F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // LeftWheel127
		leftTrackWheelModels[31].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[32].addShapeBox(-3F, -8F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel128
		leftTrackWheelModels[32].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[33].addShapeBox(-8F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // LeftWheel129
		leftTrackWheelModels[33].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[34].addShapeBox(-3F, 1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel13
		leftTrackWheelModels[34].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[35].addShapeBox(-8F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel130
		leftTrackWheelModels[35].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[36].addShapeBox(-8F, 3F, 6F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel131
		leftTrackWheelModels[36].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[37].addShapeBox(-3F, 7F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel132
		leftTrackWheelModels[37].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[38].addShapeBox(5.5F, 3.5F, 7F, 3, 3, 2, 0F,0F, -1.7F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F); // LeftWheel133
		leftTrackWheelModels[38].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[39].addShapeBox(-3F, 3F, 6F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel134
		leftTrackWheelModels[39].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[40].addShapeBox(7F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel135
		leftTrackWheelModels[40].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[41].addShapeBox(-4F, 2F, 6F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel136
		leftTrackWheelModels[41].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[42].addShapeBox(-4F, -2F, 6F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel137
		leftTrackWheelModels[42].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[43].addShapeBox(-4F, -4F, 6F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel138
		leftTrackWheelModels[43].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[44].addShapeBox(-3F, -3F, 7F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel139
		leftTrackWheelModels[44].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[45].addShapeBox(7F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel14
		leftTrackWheelModels[45].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[46].addShapeBox(-3F, -1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel140
		leftTrackWheelModels[46].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[47].addShapeBox(-3F, 1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel141
		leftTrackWheelModels[47].setRotationPoint(71F, -9F, 27F);

		leftTrackWheelModels[48].addShapeBox(-3F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // LeftWheel15
		leftTrackWheelModels[48].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[49].addShapeBox(-3F, -8F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel16
		leftTrackWheelModels[49].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[50].addShapeBox(-8F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // LeftWheel17
		leftTrackWheelModels[50].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[51].addShapeBox(-8F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel18
		leftTrackWheelModels[51].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[52].addShapeBox(-8F, 3F, 6F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel19
		leftTrackWheelModels[52].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[53].addShapeBox(-8F, -3F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel2
		leftTrackWheelModels[53].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[54].addShapeBox(-3F, 7F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel20
		leftTrackWheelModels[54].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[55].addShapeBox(2F, -10F, 7F, 3, 3, 2, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // LeftWheel21
		leftTrackWheelModels[55].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[56].addShapeBox(-5F, 7F, 7F, 3, 3, 2, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // LeftWheel22
		leftTrackWheelModels[56].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[57].addShapeBox(-3F, 3F, 6F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel23
		leftTrackWheelModels[57].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[58].addShapeBox(-8F, -8F, 0F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel24
		leftTrackWheelModels[58].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[59].addShapeBox(-8F, -3F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel25
		leftTrackWheelModels[59].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[60].addShapeBox(-8F, 3F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel26
		leftTrackWheelModels[60].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[61].addShapeBox(-4F, -4F, 6F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel27
		leftTrackWheelModels[61].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[62].addShapeBox(-3F, -1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel28
		leftTrackWheelModels[62].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[63].addShapeBox(-4F, 2F, 6F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel29
		leftTrackWheelModels[63].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[64].addShapeBox(-8F, -8F, 0F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel3
		leftTrackWheelModels[64].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[65].addShapeBox(-4F, -2F, 6F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel30
		leftTrackWheelModels[65].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[66].addShapeBox(-3F, -3F, 7F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel31
		leftTrackWheelModels[66].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[67].addShapeBox(-3F, 1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel32
		leftTrackWheelModels[67].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[68].addShapeBox(7F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel33
		leftTrackWheelModels[68].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[69].addShapeBox(-3F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // LeftWheel34
		leftTrackWheelModels[69].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[70].addShapeBox(-3F, -8F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel35
		leftTrackWheelModels[70].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[71].addShapeBox(-8F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // LeftWheel36
		leftTrackWheelModels[71].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[72].addShapeBox(-8F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel37
		leftTrackWheelModels[72].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[73].addShapeBox(-8F, 3F, 6F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel38
		leftTrackWheelModels[73].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[74].addShapeBox(-3F, 7F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel39
		leftTrackWheelModels[74].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[75].addShapeBox(-8F, -8F, 0F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel4
		leftTrackWheelModels[75].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[76].addShapeBox(-3F, 3F, 6F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel40
		leftTrackWheelModels[76].setRotationPoint(27F, 1F, 27F);

		leftTrackWheelModels[77].addShapeBox(-8F, -8F, 0F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel41
		leftTrackWheelModels[77].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[78].addShapeBox(-8F, -3F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel42
		leftTrackWheelModels[78].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[79].addShapeBox(-8F, 3F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel43
		leftTrackWheelModels[79].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[80].addShapeBox(-4F, -4F, 6F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel44
		leftTrackWheelModels[80].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[81].addShapeBox(-3F, -1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel45
		leftTrackWheelModels[81].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[82].addShapeBox(-4F, 2F, 6F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel46
		leftTrackWheelModels[82].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[83].addShapeBox(-4F, -2F, 6F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel47
		leftTrackWheelModels[83].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[84].addShapeBox(-3F, -3F, 7F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel48
		leftTrackWheelModels[84].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[85].addShapeBox(-3F, 1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel49
		leftTrackWheelModels[85].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[86].addShapeBox(-8F, -3F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel5
		leftTrackWheelModels[86].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[87].addShapeBox(7F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel50
		leftTrackWheelModels[87].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[88].addShapeBox(-3F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // LeftWheel51
		leftTrackWheelModels[88].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[89].addShapeBox(-3F, -8F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel52
		leftTrackWheelModels[89].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[90].addShapeBox(-8F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // LeftWheel53
		leftTrackWheelModels[90].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[91].addShapeBox(-8F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel54
		leftTrackWheelModels[91].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[92].addShapeBox(-8F, 3F, 6F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel55
		leftTrackWheelModels[92].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[93].addShapeBox(-3F, 7F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel56
		leftTrackWheelModels[93].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[94].addShapeBox(-3F, 3F, 6F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel57
		leftTrackWheelModels[94].setRotationPoint(5F, 1F, 27F);

		leftTrackWheelModels[95].addShapeBox(-8F, -8F, 0F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel58
		leftTrackWheelModels[95].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[96].addShapeBox(-8F, -3F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel59
		leftTrackWheelModels[96].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[97].addShapeBox(-8F, 3F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel6
		leftTrackWheelModels[97].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[98].addShapeBox(-8F, 3F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel60
		leftTrackWheelModels[98].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[99].addShapeBox(-4F, -4F, 6F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel61
		leftTrackWheelModels[99].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[100].addShapeBox(-3F, -1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel62
		leftTrackWheelModels[100].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[101].addShapeBox(-4F, 2F, 6F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel63
		leftTrackWheelModels[101].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[102].addShapeBox(-4F, -2F, 6F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel64
		leftTrackWheelModels[102].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[103].addShapeBox(-3F, -3F, 7F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel65
		leftTrackWheelModels[103].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[104].addShapeBox(-3F, 1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel66
		leftTrackWheelModels[104].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[105].addShapeBox(7F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel67
		leftTrackWheelModels[105].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[106].addShapeBox(-3F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // LeftWheel68
		leftTrackWheelModels[106].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[107].addShapeBox(-3F, -8F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel69
		leftTrackWheelModels[107].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[108].addShapeBox(-8F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // LeftWheel70
		leftTrackWheelModels[108].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[109].addShapeBox(-8.5F, 3.5F, 7F, 3, 3, 2, 0F,-1.7F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F); // LeftWheel71
		leftTrackWheelModels[109].setRotationPoint(-74F, -9F, 27F);

		leftTrackWheelModels[110].addShapeBox(-8F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel72
		leftTrackWheelModels[110].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[111].addShapeBox(-8F, 3F, 6F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel73
		leftTrackWheelModels[111].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[112].addShapeBox(-3F, 7F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel74
		leftTrackWheelModels[112].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[113].addShapeBox(-3F, 3F, 6F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel75
		leftTrackWheelModels[113].setRotationPoint(-14F, 1F, 27F);

		leftTrackWheelModels[114].addShapeBox(-8F, -8F, 0F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel76
		leftTrackWheelModels[114].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[115].addShapeBox(-8F, -3F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel77
		leftTrackWheelModels[115].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[116].addShapeBox(-8F, 3F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel78
		leftTrackWheelModels[116].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[117].addShapeBox(-4F, -4F, 6F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel79
		leftTrackWheelModels[117].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[118].addShapeBox(-4F, -4F, 6F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel8
		leftTrackWheelModels[118].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[119].addShapeBox(-3F, -1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel80
		leftTrackWheelModels[119].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[120].addShapeBox(-4F, 2F, 6F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel81
		leftTrackWheelModels[120].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[121].addShapeBox(-4F, -2F, 6F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel82
		leftTrackWheelModels[121].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[122].addShapeBox(-3F, -3F, 7F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel83
		leftTrackWheelModels[122].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[123].addShapeBox(-3F, 1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel84
		leftTrackWheelModels[123].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[124].addShapeBox(7F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel85
		leftTrackWheelModels[124].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[125].addShapeBox(-3F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // LeftWheel86
		leftTrackWheelModels[125].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[126].addShapeBox(-3F, -8F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel87
		leftTrackWheelModels[126].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[127].addShapeBox(-8F, -8F, 6F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // LeftWheel88
		leftTrackWheelModels[127].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[128].addShapeBox(-8F, -3F, 6F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel89
		leftTrackWheelModels[128].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[129].addShapeBox(-3F, -1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel9
		leftTrackWheelModels[129].setRotationPoint(49F, 1F, 27F);

		leftTrackWheelModels[130].addShapeBox(-8F, 3F, 6F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel90
		leftTrackWheelModels[130].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[131].addShapeBox(-3F, 7F, 6F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel91
		leftTrackWheelModels[131].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[132].addShapeBox(-3F, 3F, 6F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel92
		leftTrackWheelModels[132].setRotationPoint(-38F, 1F, 27F);

		leftTrackWheelModels[133].addShapeBox(-8F, -8F, 0F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel93
		leftTrackWheelModels[133].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[134].addShapeBox(-8F, -3F, 0F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel94
		leftTrackWheelModels[134].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[135].addShapeBox(-8F, 3F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // LeftWheel95
		leftTrackWheelModels[135].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[136].addShapeBox(-4F, -4F, 6F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel96
		leftTrackWheelModels[136].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[137].addShapeBox(-3F, -1F, 7F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel97
		leftTrackWheelModels[137].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[138].addShapeBox(-4F, 2F, 6F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // LeftWheel98
		leftTrackWheelModels[138].setRotationPoint(-59F, 1F, 27F);

		leftTrackWheelModels[139].addShapeBox(-4F, -2F, 6F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // LeftWheel99
		leftTrackWheelModels[139].setRotationPoint(-59F, 1F, 27F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel1
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel10
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel100
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel101
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel102
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel103
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel104
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel105
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel106
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel107
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel108
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel109
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel11
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel110
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel111
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel112
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel113
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel114
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel115
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel116
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel117
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel118
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel119
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel12
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel120
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel121
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel122
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel123
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel124
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel125
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel126
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel127
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel128
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel129
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel13
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel130
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel131
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel132
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel133
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel134
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel135
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel136
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel137
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel138
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel139
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel14
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel140
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel15
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel16
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel17
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel18
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel19
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel2
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel20
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel21
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel22
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel23
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel24
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel25
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel26
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel27
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel28
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel29
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel3
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel30
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel31
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel32
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel33
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel34
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel35
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel36
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel37
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel38
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel39
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel4
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel40
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel41
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel42
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel43
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel44
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel45
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel46
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel47
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel48
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel49
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel5
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel50
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel51
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 41, 398, textureX, textureY); // RightWheel52
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel53
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel54
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel55
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel56
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel57
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel58
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel59
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel6
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel60
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel61
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel62
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel63
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel64
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel65
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 115, 379, textureX, textureY); // RightWheel66
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 115, 379, textureX, textureY); // RightWheel67
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 115, 379, textureX, textureY); // RightWheel68
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel69
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel7
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel70
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel71
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel72
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel73
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 14, 379, textureX, textureY); // RightWheel74
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel75
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel76
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel77
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel78
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel79
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel8
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel80
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel81
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel82
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel83
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 167, 377, textureX, textureY); // RightWheel84
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel85
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel86
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel87
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel88
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel89
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 73, 379, textureX, textureY); // RightWheel9
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel90
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel91
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel92
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel93
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel94
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel95
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel96
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel97
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel98
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // RightWheel99

		rightTrackWheelModels[0].addShapeBox(-8F, -8F, -6F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel1
		rightTrackWheelModels[0].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[1].addShapeBox(-4F, -2F, -7F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel10
		rightTrackWheelModels[1].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[2].addShapeBox(-8F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightWheel100
		rightTrackWheelModels[2].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[3].addShapeBox(-3F, -8F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel101
		rightTrackWheelModels[3].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[4].addShapeBox(-8F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightWheel102
		rightTrackWheelModels[4].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[5].addShapeBox(-3F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWheel103
		rightTrackWheelModels[5].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[6].addShapeBox(7F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel104
		rightTrackWheelModels[6].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[7].addShapeBox(-3F, 3F, -9F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel105
		rightTrackWheelModels[7].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[8].addShapeBox(-3F, 7F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel106
		rightTrackWheelModels[8].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[9].addShapeBox(-8F, 3F, -9F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel107
		rightTrackWheelModels[9].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[10].addShapeBox(-8F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel108
		rightTrackWheelModels[10].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[11].addShapeBox(-3F, -8F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel109
		rightTrackWheelModels[11].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[12].addShapeBox(-4F, -4F, -7F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel11
		rightTrackWheelModels[12].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[13].addShapeBox(-8F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightWheel110
		rightTrackWheelModels[13].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[14].addShapeBox(-3F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWheel111
		rightTrackWheelModels[14].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[15].addShapeBox(7F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel112
		rightTrackWheelModels[15].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[16].addShapeBox(-3F, 3F, -9F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel113
		rightTrackWheelModels[16].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[17].addShapeBox(-3F, 7F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel114
		rightTrackWheelModels[17].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[18].addShapeBox(-8F, 3F, -9F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel115
		rightTrackWheelModels[18].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[19].addShapeBox(-8F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel116
		rightTrackWheelModels[19].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[20].addShapeBox(7F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel117
		rightTrackWheelModels[20].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[21].addShapeBox(-3F, 3F, -9F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel118
		rightTrackWheelModels[21].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[22].addShapeBox(-3F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWheel119
		rightTrackWheelModels[22].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[23].addShapeBox(-8F, -3F, -6F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel12
		rightTrackWheelModels[23].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[24].addShapeBox(-3F, -8F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel120
		rightTrackWheelModels[24].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[25].addShapeBox(-8F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightWheel121
		rightTrackWheelModels[25].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[26].addShapeBox(-8F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel122
		rightTrackWheelModels[26].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[27].addShapeBox(-8F, 3F, -9F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel123
		rightTrackWheelModels[27].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[28].addShapeBox(-3F, 7F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel124
		rightTrackWheelModels[28].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[29].addShapeBox(-3F, 7F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel125
		rightTrackWheelModels[29].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[30].addShapeBox(-8F, 3F, -9F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel126
		rightTrackWheelModels[30].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[31].addShapeBox(-8F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel127
		rightTrackWheelModels[31].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[32].addShapeBox(-8F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightWheel128
		rightTrackWheelModels[32].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[33].addShapeBox(-3F, -8F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel129
		rightTrackWheelModels[33].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[34].addShapeBox(-4F, 2F, -7F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel13
		rightTrackWheelModels[34].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[35].addShapeBox(-3F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWheel130
		rightTrackWheelModels[35].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[36].addShapeBox(7F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel131
		rightTrackWheelModels[36].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[37].addShapeBox(-3F, 3F, -9F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel132
		rightTrackWheelModels[37].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[38].addShapeBox(-3F, 3F, -9F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel133
		rightTrackWheelModels[38].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[39].addShapeBox(-3F, 7F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel134
		rightTrackWheelModels[39].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[40].addShapeBox(7F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel135
		rightTrackWheelModels[40].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[41].addShapeBox(-3F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWheel136
		rightTrackWheelModels[41].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[42].addShapeBox(-3F, -8F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel137
		rightTrackWheelModels[42].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[43].addShapeBox(-8F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightWheel138
		rightTrackWheelModels[43].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[44].addShapeBox(-8F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel139
		rightTrackWheelModels[44].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[45].addShapeBox(-4F, 2F, -7F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel14
		rightTrackWheelModels[45].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[46].addShapeBox(-8F, 3F, -9F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel140
		rightTrackWheelModels[46].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[47].addShapeBox(-4F, -2F, -7F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel15
		rightTrackWheelModels[47].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[48].addShapeBox(-4F, -4F, -7F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel16
		rightTrackWheelModels[48].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[49].addShapeBox(-4F, -4F, -7F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel17
		rightTrackWheelModels[49].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[50].addShapeBox(-4F, -2F, -7F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel18
		rightTrackWheelModels[50].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[51].addShapeBox(-4F, 2F, -7F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel19
		rightTrackWheelModels[51].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[52].addShapeBox(-8.5F, -6.5F, -9F, 3, 3, 2, 0F,0F, -1.7F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F); // RightWheel2
		rightTrackWheelModels[52].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[53].addShapeBox(-4F, -4F, -7F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel20
		rightTrackWheelModels[53].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[54].addShapeBox(-4F, -2F, -7F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel21
		rightTrackWheelModels[54].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[55].addShapeBox(-4F, 2F, -7F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel22
		rightTrackWheelModels[55].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[56].addShapeBox(-8F, 3F, -6F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel23
		rightTrackWheelModels[56].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[57].addShapeBox(-4F, -4F, -7F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel24
		rightTrackWheelModels[57].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[58].addShapeBox(-4F, -2F, -7F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel25
		rightTrackWheelModels[58].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[59].addShapeBox(-4F, 2F, -7F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel26
		rightTrackWheelModels[59].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[60].addShapeBox(-4F, -4F, -7F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel27
		rightTrackWheelModels[60].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[61].addShapeBox(-4F, -2F, -7F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel28
		rightTrackWheelModels[61].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[62].addShapeBox(-4F, 2F, -7F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel29
		rightTrackWheelModels[62].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[63].addShapeBox(-5F, -10F, -9F, 3, 3, 2, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // RightWheel3
		rightTrackWheelModels[63].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[64].addShapeBox(-3F, -3F, -8F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel30
		rightTrackWheelModels[64].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[65].addShapeBox(-3F, 1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel31
		rightTrackWheelModels[65].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[66].addShapeBox(-3F, -1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel32
		rightTrackWheelModels[66].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[67].addShapeBox(-3F, -3F, -8F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel33
		rightTrackWheelModels[67].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[68].addShapeBox(-8F, -8F, -6F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel34
		rightTrackWheelModels[68].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[69].addShapeBox(-3F, -1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel35
		rightTrackWheelModels[69].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[70].addShapeBox(-3F, 1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel36
		rightTrackWheelModels[70].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[71].addShapeBox(-3F, -3F, -8F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel37
		rightTrackWheelModels[71].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[72].addShapeBox(-3F, -1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel38
		rightTrackWheelModels[72].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[73].addShapeBox(-3F, 1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel39
		rightTrackWheelModels[73].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[74].addShapeBox(2F, -10F, -9F, 3, 3, 2, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // RightWheel4
		rightTrackWheelModels[74].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[75].addShapeBox(-3F, 1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel40
		rightTrackWheelModels[75].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[76].addShapeBox(-3F, -1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel41
		rightTrackWheelModels[76].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[77].addShapeBox(-3F, -3F, -8F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel42
		rightTrackWheelModels[77].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[78].addShapeBox(-3F, -3F, -8F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel43
		rightTrackWheelModels[78].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[79].addShapeBox(-3F, -1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel44
		rightTrackWheelModels[79].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[80].addShapeBox(-8F, -3F, -6F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel45
		rightTrackWheelModels[80].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[81].addShapeBox(-3F, 1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel46
		rightTrackWheelModels[81].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[82].addShapeBox(-3F, 1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel47
		rightTrackWheelModels[82].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[83].addShapeBox(-3F, -1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel48
		rightTrackWheelModels[83].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[84].addShapeBox(-3F, -3F, -8F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel49
		rightTrackWheelModels[84].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[85].addShapeBox(5.5F, -6.5F, -9F, 3, 3, 2, 0F,-1.7F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F); // RightWheel5
		rightTrackWheelModels[85].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[86].addShapeBox(-3F, 1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel50
		rightTrackWheelModels[86].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[87].addShapeBox(-3F, -1F, -8F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel51
		rightTrackWheelModels[87].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[88].addShapeBox(-3F, -3F, -8F, 6, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel52
		rightTrackWheelModels[88].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[89].addShapeBox(-8F, 3F, -6F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel53
		rightTrackWheelModels[89].setRotationPoint(27F, 1F, -27F);

		rightTrackWheelModels[90].addShapeBox(-8F, -3F, -6F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel54
		rightTrackWheelModels[90].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[91].addShapeBox(-8F, -8F, -6F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel55
		rightTrackWheelModels[91].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[92].addShapeBox(-8F, 3F, -6F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel56
		rightTrackWheelModels[92].setRotationPoint(5F, 1F, -27F);

		rightTrackWheelModels[93].addShapeBox(-8F, -8F, -6F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel57
		rightTrackWheelModels[93].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[94].addShapeBox(-8F, -3F, -6F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel58
		rightTrackWheelModels[94].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[95].addShapeBox(-8F, 3F, -6F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel59
		rightTrackWheelModels[95].setRotationPoint(-14F, 1F, -27F);

		rightTrackWheelModels[96].addShapeBox(8F, -1F, -9F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel6
		rightTrackWheelModels[96].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[97].addShapeBox(-8F, 3F, -6F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel60
		rightTrackWheelModels[97].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[98].addShapeBox(-8F, -3F, -6F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel61
		rightTrackWheelModels[98].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[99].addShapeBox(-8F, -8F, -6F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel62
		rightTrackWheelModels[99].setRotationPoint(-38F, 1F, -27F);

		rightTrackWheelModels[100].addShapeBox(-8F, -8F, -6F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel63
		rightTrackWheelModels[100].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[101].addShapeBox(-8F, -3F, -6F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel64
		rightTrackWheelModels[101].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[102].addShapeBox(-8F, 3F, -6F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel65
		rightTrackWheelModels[102].setRotationPoint(-59F, 1F, -27F);

		rightTrackWheelModels[103].addShapeBox(-8F, 3F, -6F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel66
		rightTrackWheelModels[103].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[104].addShapeBox(-8F, -3F, -6F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel67
		rightTrackWheelModels[104].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[105].addShapeBox(-8F, -8F, -6F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel68
		rightTrackWheelModels[105].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[106].addShapeBox(-8F, -8F, -6F, 16, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel69
		rightTrackWheelModels[106].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[107].addShapeBox(-4F, -4F, -7F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel7
		rightTrackWheelModels[107].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[108].addShapeBox(-8F, -3F, -6F, 16, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel70
		rightTrackWheelModels[108].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[109].addShapeBox(6F, -3F, -9F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel71
		rightTrackWheelModels[109].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[110].addShapeBox(-4F, -8F, -9F, 12, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWheel72
		rightTrackWheelModels[110].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[111].addShapeBox(-3F, -8F, -9F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel73
		rightTrackWheelModels[111].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[112].addShapeBox(-8F, 3F, -6F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel74
		rightTrackWheelModels[112].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[113].addShapeBox(-8F, -8F, -9F, 12, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightWheel75
		rightTrackWheelModels[113].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[114].addShapeBox(-8F, -3F, -9F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel76
		rightTrackWheelModels[114].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[115].addShapeBox(-8F, 3F, -9F, 12, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel77
		rightTrackWheelModels[115].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[116].addShapeBox(-3F, 6F, -9F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel78
		rightTrackWheelModels[116].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[117].addShapeBox(-4F, 3F, -9F, 12, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel79
		rightTrackWheelModels[117].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[118].addShapeBox(-4F, -2F, -7F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel8
		rightTrackWheelModels[118].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[119].addShapeBox(5.5F, 3.5F, -9F, 3, 3, 2, 0F,0F, -1.7F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F); // RightWheel80
		rightTrackWheelModels[119].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[120].addShapeBox(2F, 7F, -9F, 3, 3, 2, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // RightWheel81
		rightTrackWheelModels[120].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[121].addShapeBox(-5F, 7F, -9F, 3, 3, 2, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // RightWheel82
		rightTrackWheelModels[121].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[122].addShapeBox(-8.5F, 3.5F, -9F, 3, 3, 2, 0F,-1.7F, 0F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0F, -1.7F, 0F); // RightWheel83
		rightTrackWheelModels[122].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[123].addShapeBox(-10F, -1F, -9F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel84
		rightTrackWheelModels[123].setRotationPoint(-74F, -9F, -27F);

		rightTrackWheelModels[124].addShapeBox(-8F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel85
		rightTrackWheelModels[124].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[125].addShapeBox(-8F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // RightWheel86
		rightTrackWheelModels[125].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[126].addShapeBox(-3F, -8F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel87
		rightTrackWheelModels[126].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[127].addShapeBox(-3F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWheel88
		rightTrackWheelModels[127].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[128].addShapeBox(7F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel89
		rightTrackWheelModels[128].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[129].addShapeBox(-4F, 2F, -7F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // RightWheel9
		rightTrackWheelModels[129].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[130].addShapeBox(-3F, 3F, -9F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel90
		rightTrackWheelModels[130].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[131].addShapeBox(-3F, 7F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel91
		rightTrackWheelModels[131].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[132].addShapeBox(-8F, 3F, -9F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel92
		rightTrackWheelModels[132].setRotationPoint(71F, -9F, -27F);

		rightTrackWheelModels[133].addShapeBox(-3F, -8F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel93
		rightTrackWheelModels[133].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[134].addShapeBox(-3F, -8F, -9F, 11, 5, 3, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // RightWheel94
		rightTrackWheelModels[134].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[135].addShapeBox(7F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel95
		rightTrackWheelModels[135].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[136].addShapeBox(-3F, 3F, -9F, 11, 5, 3, 0F,-10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel96
		rightTrackWheelModels[136].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[137].addShapeBox(-3F, 7F, -9F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel97
		rightTrackWheelModels[137].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[138].addShapeBox(-8F, 3F, -9F, 11, 5, 3, 0F,0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // RightWheel98
		rightTrackWheelModels[138].setRotationPoint(49F, 1F, -27F);

		rightTrackWheelModels[139].addShapeBox(-8F, -3F, -9F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // RightWheel99
		rightTrackWheelModels[139].setRotationPoint(49F, 1F, -27F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 206, 378, textureX, textureY); // TrackLeft1
		leftTrackModel[1] = new ModelRendererTurbo(this, 253, 378, textureX, textureY); // TrackLeft2
		leftTrackModel[2] = new ModelRendererTurbo(this, 301, 377, textureX, textureY); // TrackLeft3
		leftTrackModel[3] = new ModelRendererTurbo(this, 388, 376, textureX, textureY); // TrackLeft4
		leftTrackModel[4] = new ModelRendererTurbo(this, 654, 376, textureX, textureY); // TrackLeft5
		leftTrackModel[5] = new ModelRendererTurbo(this, 738, 376, textureX, textureY); // TrackLeft6
		leftTrackModel[6] = new ModelRendererTurbo(this, 787, 376, textureX, textureY); // TrackLeft7

		leftTrackModel[0].addShapeBox(-7.9F, 0.15F, -6F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackLeft1
		leftTrackModel[0].setRotationPoint(78.5F, -13F, 31F);
		leftTrackModel[0].rotateAngleZ = 1.57079633F;

		leftTrackModel[1].addShapeBox(-7.2F, 0.1F, -6F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackLeft2
		leftTrackModel[1].setRotationPoint(79F, -6F, 31F);
		leftTrackModel[1].rotateAngleZ = 0.78539816F;

		leftTrackModel[2].addShapeBox(-23.7F, 0.1F, -6F, 24, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackLeft3
		leftTrackModel[2].setRotationPoint(74F, -1F, 31F);
		leftTrackModel[2].rotateAngleZ = 0.43633231F;

		leftTrackModel[3].addShapeBox(-116F, 0F, -6F, 116, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackLeft4
		leftTrackModel[3].setRotationPoint(53F, 9F, 31F);

		leftTrackModel[4].addShapeBox(-23.45F, -0.15F, -6F, 24, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackLeft5
		leftTrackModel[4].setRotationPoint(-63F, 9F, 31F);
		leftTrackModel[4].rotateAngleZ = -0.59341195F;

		leftTrackModel[5].addShapeBox(-7.55F, 0F, -6F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackLeft6
		leftTrackModel[5].setRotationPoint(-82F, -4F, 31F);
		leftTrackModel[5].rotateAngleZ = -1.41371669F;

		leftTrackModel[6].addShapeBox(-6.1F, 0.2F, -6F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackLeft7
		leftTrackModel[6].setRotationPoint(-83F, -11F, 31F);
		leftTrackModel[6].rotateAngleZ = -1.71042267F;
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 787, 376, textureX, textureY); // TrackRight1
		rightTrackModel[1] = new ModelRendererTurbo(this, 738, 376, textureX, textureY); // TrackRight2
		rightTrackModel[2] = new ModelRendererTurbo(this, 654, 376, textureX, textureY); // TrackRight3
		rightTrackModel[3] = new ModelRendererTurbo(this, 388, 376, textureX, textureY); // TrackRight4
		rightTrackModel[4] = new ModelRendererTurbo(this, 301, 377, textureX, textureY); // TrackRight5
		rightTrackModel[5] = new ModelRendererTurbo(this, 253, 378, textureX, textureY); // TrackRight6
		rightTrackModel[6] = new ModelRendererTurbo(this, 206, 378, textureX, textureY); // TrackRight7

		rightTrackModel[0].addShapeBox(-6.1F, 0.2F, -6F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackRight1
		rightTrackModel[0].setRotationPoint(-83F, -11F, -31F);
		rightTrackModel[0].rotateAngleZ = -1.71042267F;

		rightTrackModel[1].addShapeBox(-7.55F, 0F, -6F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackRight2
		rightTrackModel[1].setRotationPoint(-82F, -4F, -31F);
		rightTrackModel[1].rotateAngleZ = -1.41371669F;

		rightTrackModel[2].addShapeBox(-23.45F, -0.15F, -6F, 24, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackRight3
		rightTrackModel[2].setRotationPoint(-63F, 9F, -31F);
		rightTrackModel[2].rotateAngleZ = -0.59341195F;

		rightTrackModel[3].addShapeBox(-116F, 0F, -6F, 116, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackRight4
		rightTrackModel[3].setRotationPoint(53F, 9F, -31F);

		rightTrackModel[4].addShapeBox(-23.7F, 0.1F, -6F, 24, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackRight5
		rightTrackModel[4].setRotationPoint(74F, -1F, -31F);
		rightTrackModel[4].rotateAngleZ = 0.43633231F;

		rightTrackModel[5].addShapeBox(-7.2F, 0.1F, -6F, 7, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackRight6
		rightTrackModel[5].setRotationPoint(79F, -6F, -31F);
		rightTrackModel[5].rotateAngleZ = 0.78539816F;

		rightTrackModel[6].addShapeBox(-7.9F, 0.15F, -6F, 8, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // TrackRight7
		rightTrackModel[6].setRotationPoint(78.5F, -13F, -31F);
		rightTrackModel[6].rotateAngleZ = 1.57079633F;
	}
}