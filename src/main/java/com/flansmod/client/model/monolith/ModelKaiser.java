//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SMSKaiser
// Model Creator: 
// Created on: 25.07.2020 - 13:01:08
// Last changed on: 25.07.2020 - 13:01:08

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKaiser extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKaiser() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[275];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 7, 379, textureX, textureY); // Core1
		bodyModel[1] = new ModelRendererTurbo(this, 7, 179, textureX, textureY); // Core10
		bodyModel[2] = new ModelRendererTurbo(this, 299, 402, textureX, textureY); // Core100
		bodyModel[3] = new ModelRendererTurbo(this, 7, 452, textureX, textureY); // Core101
		bodyModel[4] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Core102
		bodyModel[5] = new ModelRendererTurbo(this, 461, 176, textureX, textureY); // Core104
		bodyModel[6] = new ModelRendererTurbo(this, 7, 480, textureX, textureY); // Core105
		bodyModel[7] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core106
		bodyModel[8] = new ModelRendererTurbo(this, 344, 364, textureX, textureY); // Core107
		bodyModel[9] = new ModelRendererTurbo(this, 377, 275, textureX, textureY); // Core108
		bodyModel[10] = new ModelRendererTurbo(this, 342, 150, textureX, textureY); // Core109
		bodyModel[11] = new ModelRendererTurbo(this, 5, 137, textureX, textureY); // Core11
		bodyModel[12] = new ModelRendererTurbo(this, 7, 516, textureX, textureY); // Core110
		bodyModel[13] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core111
		bodyModel[14] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core112
		bodyModel[15] = new ModelRendererTurbo(this, 371, 150, textureX, textureY); // Core113
		bodyModel[16] = new ModelRendererTurbo(this, 7, 559, textureX, textureY); // Core114
		bodyModel[17] = new ModelRendererTurbo(this, 436, 291, textureX, textureY); // Core115
		bodyModel[18] = new ModelRendererTurbo(this, 407, 234, textureX, textureY); // Core116
		bodyModel[19] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core117
		bodyModel[20] = new ModelRendererTurbo(this, 413, 208, textureX, textureY); // Core118
		bodyModel[21] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core119
		bodyModel[22] = new ModelRendererTurbo(this, 5, 107, textureX, textureY); // Core12
		bodyModel[23] = new ModelRendererTurbo(this, 7, 621, textureX, textureY); // Core120
		bodyModel[24] = new ModelRendererTurbo(this, 427, 238, textureX, textureY); // Core121
		bodyModel[25] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core122
		bodyModel[26] = new ModelRendererTurbo(this, 7, 738, textureX, textureY); // Core123
		bodyModel[27] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core124
		bodyModel[28] = new ModelRendererTurbo(this, 418, 258, textureX, textureY); // Core125
		bodyModel[29] = new ModelRendererTurbo(this, 7, 678, textureX, textureY); // Core126
		bodyModel[30] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core127
		bodyModel[31] = new ModelRendererTurbo(this, 482, 172, textureX, textureY); // Core128
		bodyModel[32] = new ModelRendererTurbo(this, 95, 460, textureX, textureY); // Core129
		bodyModel[33] = new ModelRendererTurbo(this, 7, 88, textureX, textureY); // Core13
		bodyModel[34] = new ModelRendererTurbo(this, 402, 259, textureX, textureY); // Core130
		bodyModel[35] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core131
		bodyModel[36] = new ModelRendererTurbo(this, 121, 539, textureX, textureY); // Core132
		bodyModel[37] = new ModelRendererTurbo(this, 373, 234, textureX, textureY); // Core133
		bodyModel[38] = new ModelRendererTurbo(this, 488, 170, textureX, textureY); // Core134
		bodyModel[39] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core135
		bodyModel[40] = new ModelRendererTurbo(this, 182, 472, textureX, textureY); // Core136
		bodyModel[41] = new ModelRendererTurbo(this, 389, 406, textureX, textureY); // Core137
		bodyModel[42] = new ModelRendererTurbo(this, 522, 103, textureX, textureY); // Core138
		bodyModel[43] = new ModelRendererTurbo(this, 413, 107, textureX, textureY); // Core139
		bodyModel[44] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core14
		bodyModel[45] = new ModelRendererTurbo(this, 340, 432, textureX, textureY); // Core140
		bodyModel[46] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core141
		bodyModel[47] = new ModelRendererTurbo(this, 342, 234, textureX, textureY); // Core142
		bodyModel[48] = new ModelRendererTurbo(this, 161, 608, textureX, textureY); // Core143
		bodyModel[49] = new ModelRendererTurbo(this, 488, 174, textureX, textureY); // Core144
		bodyModel[50] = new ModelRendererTurbo(this, 455, 346, textureX, textureY); // Core145
		bodyModel[51] = new ModelRendererTurbo(this, 295, 615, textureX, textureY); // Core146
		bodyModel[52] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core147
		bodyModel[53] = new ModelRendererTurbo(this, 482, 172, textureX, textureY); // Core148
		bodyModel[54] = new ModelRendererTurbo(this, 482, 172, textureX, textureY); // Core149
		bodyModel[55] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core15
		bodyModel[56] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core150
		bodyModel[57] = new ModelRendererTurbo(this, 485, 347, textureX, textureY); // Core151
		bodyModel[58] = new ModelRendererTurbo(this, 137, 680, textureX, textureY); // Core152
		bodyModel[59] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core153
		bodyModel[60] = new ModelRendererTurbo(this, 245, 681, textureX, textureY); // Core154
		bodyModel[61] = new ModelRendererTurbo(this, 504, 347, textureX, textureY); // Core155
		bodyModel[62] = new ModelRendererTurbo(this, 488, 170, textureX, textureY); // Core156
		bodyModel[63] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core157
		bodyModel[64] = new ModelRendererTurbo(this, 488, 174, textureX, textureY); // Core158
		bodyModel[65] = new ModelRendererTurbo(this, 455, 346, textureX, textureY); // Core159
		bodyModel[66] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core16
		bodyModel[67] = new ModelRendererTurbo(this, 317, 389, textureX, textureY); // Core160
		bodyModel[68] = new ModelRendererTurbo(this, 482, 172, textureX, textureY); // Core161
		bodyModel[69] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core162
		bodyModel[70] = new ModelRendererTurbo(this, 340, 432, textureX, textureY); // Core163
		bodyModel[71] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core164
		bodyModel[72] = new ModelRendererTurbo(this, 482, 172, textureX, textureY); // Core165
		bodyModel[73] = new ModelRendererTurbo(this, 488, 170, textureX, textureY); // Core166
		bodyModel[74] = new ModelRendererTurbo(this, 341, 423, textureX, textureY); // Core167
		bodyModel[75] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core168
		bodyModel[76] = new ModelRendererTurbo(this, 488, 174, textureX, textureY); // Core169
		bodyModel[77] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core17
		bodyModel[78] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core170
		bodyModel[79] = new ModelRendererTurbo(this, 299, 402, textureX, textureY); // Core171
		bodyModel[80] = new ModelRendererTurbo(this, 482, 172, textureX, textureY); // Core172
		bodyModel[81] = new ModelRendererTurbo(this, 341, 391, textureX, textureY); // Core173
		bodyModel[82] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core174
		bodyModel[83] = new ModelRendererTurbo(this, 413, 150, textureX, textureY); // Core175
		bodyModel[84] = new ModelRendererTurbo(this, 183, 464, textureX, textureY); // Core176
		bodyModel[85] = new ModelRendererTurbo(this, 413, 69, textureX, textureY); // Core177
		bodyModel[86] = new ModelRendererTurbo(this, 387, 317, textureX, textureY); // Core178
		bodyModel[87] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core179
		bodyModel[88] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core18
		bodyModel[89] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core180
		bodyModel[90] = new ModelRendererTurbo(this, 499, 172, textureX, textureY); // Core181
		bodyModel[91] = new ModelRendererTurbo(this, 482, 172, textureX, textureY); // Core182
		bodyModel[92] = new ModelRendererTurbo(this, 505, 170, textureX, textureY); // Core183
		bodyModel[93] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core184
		bodyModel[94] = new ModelRendererTurbo(this, 488, 170, textureX, textureY); // Core185
		bodyModel[95] = new ModelRendererTurbo(this, 505, 174, textureX, textureY); // Core186
		bodyModel[96] = new ModelRendererTurbo(this, 488, 174, textureX, textureY); // Core187
		bodyModel[97] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core188
		bodyModel[98] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core189
		bodyModel[99] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core19
		bodyModel[100] = new ModelRendererTurbo(this, 482, 172, textureX, textureY); // Core190
		bodyModel[101] = new ModelRendererTurbo(this, 499, 172, textureX, textureY); // Core191
		bodyModel[102] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core192
		bodyModel[103] = new ModelRendererTurbo(this, 499, 172, textureX, textureY); // Core193
		bodyModel[104] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core194
		bodyModel[105] = new ModelRendererTurbo(this, 505, 170, textureX, textureY); // Core195
		bodyModel[106] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core196
		bodyModel[107] = new ModelRendererTurbo(this, 505, 174, textureX, textureY); // Core197
		bodyModel[108] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core198
		bodyModel[109] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core199
		bodyModel[110] = new ModelRendererTurbo(this, 152, 150, textureX, textureY); // Core2
		bodyModel[111] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core20
		bodyModel[112] = new ModelRendererTurbo(this, 499, 172, textureX, textureY); // Core200
		bodyModel[113] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core201
		bodyModel[114] = new ModelRendererTurbo(this, 168, 502, textureX, textureY); // Core202
		bodyModel[115] = new ModelRendererTurbo(this, 499, 172, textureX, textureY); // Core202
		bodyModel[116] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core203
		bodyModel[117] = new ModelRendererTurbo(this, 448, 146, textureX, textureY); // Core204
		bodyModel[118] = new ModelRendererTurbo(this, 413, 69, textureX, textureY); // Core205
		bodyModel[119] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core206
		bodyModel[120] = new ModelRendererTurbo(this, 505, 170, textureX, textureY); // Core207
		bodyModel[121] = new ModelRendererTurbo(this, 505, 174, textureX, textureY); // Core208
		bodyModel[122] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core209
		bodyModel[123] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core21
		bodyModel[124] = new ModelRendererTurbo(this, 499, 172, textureX, textureY); // Core210
		bodyModel[125] = new ModelRendererTurbo(this, 499, 172, textureX, textureY); // Core211
		bodyModel[126] = new ModelRendererTurbo(this, 505, 170, textureX, textureY); // Core212
		bodyModel[127] = new ModelRendererTurbo(this, 505, 174, textureX, textureY); // Core213
		bodyModel[128] = new ModelRendererTurbo(this, 499, 172, textureX, textureY); // Core214
		bodyModel[129] = new ModelRendererTurbo(this, 348, 317, textureX, textureY); // Core215
		bodyModel[130] = new ModelRendererTurbo(this, 187, 498, textureX, textureY); // Core216
		bodyModel[131] = new ModelRendererTurbo(this, 187, 498, textureX, textureY); // Core217
		bodyModel[132] = new ModelRendererTurbo(this, 418, 258, textureX, textureY); // Core218
		bodyModel[133] = new ModelRendererTurbo(this, 371, 89, textureX, textureY); // Core219
		bodyModel[134] = new ModelRendererTurbo(this, 501, 66, textureX, textureY); // Core22
		bodyModel[135] = new ModelRendererTurbo(this, 168, 502, textureX, textureY); // Core220
		bodyModel[136] = new ModelRendererTurbo(this, 495, 146, textureX, textureY); // Core221
		bodyModel[137] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core222
		bodyModel[138] = new ModelRendererTurbo(this, 187, 498, textureX, textureY); // Core223
		bodyModel[139] = new ModelRendererTurbo(this, 187, 498, textureX, textureY); // Core224
		bodyModel[140] = new ModelRendererTurbo(this, 186, 493, textureX, textureY); // Core225
		bodyModel[141] = new ModelRendererTurbo(this, 186, 488, textureX, textureY); // Core226
		bodyModel[142] = new ModelRendererTurbo(this, 186, 480, textureX, textureY); // Core227
		bodyModel[143] = new ModelRendererTurbo(this, 186, 505, textureX, textureY); // Core228
		bodyModel[144] = new ModelRendererTurbo(this, 168, 502, textureX, textureY); // Core229
		bodyModel[145] = new ModelRendererTurbo(this, 341, 423, textureX, textureY); // Core23
		bodyModel[146] = new ModelRendererTurbo(this, 168, 502, textureX, textureY); // Core230
		bodyModel[147] = new ModelRendererTurbo(this, 170, 462, textureX, textureY); // Core231
		bodyModel[148] = new ModelRendererTurbo(this, 169, 487, textureX, textureY); // Core232
		bodyModel[149] = new ModelRendererTurbo(this, 413, 78, textureX, textureY); // Core233
		bodyModel[150] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core234
		bodyModel[151] = new ModelRendererTurbo(this, 448, 146, textureX, textureY); // Core235
		bodyModel[152] = new ModelRendererTurbo(this, 396, 353, textureX, textureY); // Core236
		bodyModel[153] = new ModelRendererTurbo(this, 186, 505, textureX, textureY); // Core237
		bodyModel[154] = new ModelRendererTurbo(this, 182, 472, textureX, textureY); // Core238
		bodyModel[155] = new ModelRendererTurbo(this, 183, 464, textureX, textureY); // Core239
		bodyModel[156] = new ModelRendererTurbo(this, 389, 395, textureX, textureY); // Core24
		bodyModel[157] = new ModelRendererTurbo(this, 182, 472, textureX, textureY); // Core240
		bodyModel[158] = new ModelRendererTurbo(this, 458, 396, textureX, textureY); // Core241
		bodyModel[159] = new ModelRendererTurbo(this, 420, 396, textureX, textureY); // Core242
		bodyModel[160] = new ModelRendererTurbo(this, 417, 411, textureX, textureY); // Core243
		bodyModel[161] = new ModelRendererTurbo(this, 441, 411, textureX, textureY); // Core244
		bodyModel[162] = new ModelRendererTurbo(this, 461, 411, textureX, textureY); // Core245
		bodyModel[163] = new ModelRendererTurbo(this, 417, 411, textureX, textureY); // Core246
		bodyModel[164] = new ModelRendererTurbo(this, 461, 328, textureX, textureY); // Core247
		bodyModel[165] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core248
		bodyModel[166] = new ModelRendererTurbo(this, 413, 78, textureX, textureY); // Core249
		bodyModel[167] = new ModelRendererTurbo(this, 169, 487, textureX, textureY); // Core25
		bodyModel[168] = new ModelRendererTurbo(this, 186, 480, textureX, textureY); // Core250
		bodyModel[169] = new ModelRendererTurbo(this, 495, 146, textureX, textureY); // Core251
		bodyModel[170] = new ModelRendererTurbo(this, 420, 396, textureX, textureY); // Core252
		bodyModel[171] = new ModelRendererTurbo(this, 461, 411, textureX, textureY); // Core253
		bodyModel[172] = new ModelRendererTurbo(this, 458, 396, textureX, textureY); // Core254
		bodyModel[173] = new ModelRendererTurbo(this, 441, 411, textureX, textureY); // Core255
		bodyModel[174] = new ModelRendererTurbo(this, 420, 396, textureX, textureY); // Core256
		bodyModel[175] = new ModelRendererTurbo(this, 417, 411, textureX, textureY); // Core257
		bodyModel[176] = new ModelRendererTurbo(this, 441, 411, textureX, textureY); // Core258
		bodyModel[177] = new ModelRendererTurbo(this, 461, 411, textureX, textureY); // Core259
		bodyModel[178] = new ModelRendererTurbo(this, 149, 742, textureX, textureY); // Core26
		bodyModel[179] = new ModelRendererTurbo(this, 458, 396, textureX, textureY); // Core260
		bodyModel[180] = new ModelRendererTurbo(this, 458, 423, textureX, textureY); // Core261
		bodyModel[181] = new ModelRendererTurbo(this, 461, 328, textureX, textureY); // Core262
		bodyModel[182] = new ModelRendererTurbo(this, 478, 144, textureX, textureY); // Core263
		bodyModel[183] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core264
		bodyModel[184] = new ModelRendererTurbo(this, 186, 488, textureX, textureY); // Core265
		bodyModel[185] = new ModelRendererTurbo(this, 428, 423, textureX, textureY); // Core266
		bodyModel[186] = new ModelRendererTurbo(this, 458, 423, textureX, textureY); // Core267
		bodyModel[187] = new ModelRendererTurbo(this, 428, 423, textureX, textureY); // Core268
		bodyModel[188] = new ModelRendererTurbo(this, 420, 396, textureX, textureY); // Core269
		bodyModel[189] = new ModelRendererTurbo(this, 232, 740, textureX, textureY); // Core27
		bodyModel[190] = new ModelRendererTurbo(this, 417, 411, textureX, textureY); // Core270
		bodyModel[191] = new ModelRendererTurbo(this, 441, 411, textureX, textureY); // Core271
		bodyModel[192] = new ModelRendererTurbo(this, 461, 411, textureX, textureY); // Core272
		bodyModel[193] = new ModelRendererTurbo(this, 458, 396, textureX, textureY); // Core273
		bodyModel[194] = new ModelRendererTurbo(this, 346, 402, textureX, textureY); // Core274
		bodyModel[195] = new ModelRendererTurbo(this, 346, 402, textureX, textureY); // Core275
		bodyModel[196] = new ModelRendererTurbo(this, 520, 68, textureX, textureY); // Core28
		bodyModel[197] = new ModelRendererTurbo(this, 341, 391, textureX, textureY); // Core29
		bodyModel[198] = new ModelRendererTurbo(this, 165, 225, textureX, textureY); // Core3
		bodyModel[199] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core30
		bodyModel[200] = new ModelRendererTurbo(this, 366, 395, textureX, textureY); // Core31
		bodyModel[201] = new ModelRendererTurbo(this, 170, 462, textureX, textureY); // Core32
		bodyModel[202] = new ModelRendererTurbo(this, 489, 149, textureX, textureY); // Core33
		bodyModel[203] = new ModelRendererTurbo(this, 437, 364, textureX, textureY); // Core34
		bodyModel[204] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core35
		bodyModel[205] = new ModelRendererTurbo(this, 186, 493, textureX, textureY); // Core36
		bodyModel[206] = new ModelRendererTurbo(this, 346, 402, textureX, textureY); // Core37
		bodyModel[207] = new ModelRendererTurbo(this, 346, 402, textureX, textureY); // Core38
		bodyModel[208] = new ModelRendererTurbo(this, 348, 88, textureX, textureY); // Core39
		bodyModel[209] = new ModelRendererTurbo(this, 183, 297, textureX, textureY); // Core4
		bodyModel[210] = new ModelRendererTurbo(this, 348, 82, textureX, textureY); // Core40
		bodyModel[211] = new ModelRendererTurbo(this, 348, 71, textureX, textureY); // Core41
		bodyModel[212] = new ModelRendererTurbo(this, 348, 88, textureX, textureY); // Core42
		bodyModel[213] = new ModelRendererTurbo(this, 348, 82, textureX, textureY); // Core43
		bodyModel[214] = new ModelRendererTurbo(this, 437, 364, textureX, textureY); // Core44
		bodyModel[215] = new ModelRendererTurbo(this, 317, 389, textureX, textureY); // Core45
		bodyModel[216] = new ModelRendererTurbo(this, 187, 498, textureX, textureY); // Core46
		bodyModel[217] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core47
		bodyModel[218] = new ModelRendererTurbo(this, 348, 71, textureX, textureY); // Core48
		bodyModel[219] = new ModelRendererTurbo(this, 348, 88, textureX, textureY); // Core49
		bodyModel[220] = new ModelRendererTurbo(this, 195, 359, textureX, textureY); // Core5
		bodyModel[221] = new ModelRendererTurbo(this, 348, 82, textureX, textureY); // Core50
		bodyModel[222] = new ModelRendererTurbo(this, 348, 71, textureX, textureY); // Core51
		bodyModel[223] = new ModelRendererTurbo(this, 348, 88, textureX, textureY); // Core52
		bodyModel[224] = new ModelRendererTurbo(this, 348, 82, textureX, textureY); // Core53
		bodyModel[225] = new ModelRendererTurbo(this, 348, 71, textureX, textureY); // Core54
		bodyModel[226] = new ModelRendererTurbo(this, 187, 498, textureX, textureY); // Core55
		bodyModel[227] = new ModelRendererTurbo(this, 437, 364, textureX, textureY); // Core56
		bodyModel[228] = new ModelRendererTurbo(this, 420, 180, textureX, textureY); // Core57
		bodyModel[229] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core58
		bodyModel[230] = new ModelRendererTurbo(this, 373, 90, textureX, textureY); // Core59
		bodyModel[231] = new ModelRendererTurbo(this, 182, 409, textureX, textureY); // Core6
		bodyModel[232] = new ModelRendererTurbo(this, 373, 83, textureX, textureY); // Core60
		bodyModel[233] = new ModelRendererTurbo(this, 373, 71, textureX, textureY); // Core61
		bodyModel[234] = new ModelRendererTurbo(this, 373, 90, textureX, textureY); // Core62
		bodyModel[235] = new ModelRendererTurbo(this, 373, 83, textureX, textureY); // Core63
		bodyModel[236] = new ModelRendererTurbo(this, 373, 71, textureX, textureY); // Core64
		bodyModel[237] = new ModelRendererTurbo(this, 373, 90, textureX, textureY); // Core65
		bodyModel[238] = new ModelRendererTurbo(this, 373, 83, textureX, textureY); // Core66
		bodyModel[239] = new ModelRendererTurbo(this, 373, 71, textureX, textureY); // Core67
		bodyModel[240] = new ModelRendererTurbo(this, 373, 90, textureX, textureY); // Core68
		bodyModel[241] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core69
		bodyModel[242] = new ModelRendererTurbo(this, 249, 407, textureX, textureY); // Core7
		bodyModel[243] = new ModelRendererTurbo(this, 187, 498, textureX, textureY); // Core70
		bodyModel[244] = new ModelRendererTurbo(this, 420, 180, textureX, textureY); // Core71
		bodyModel[245] = new ModelRendererTurbo(this, 437, 364, textureX, textureY); // Core72
		bodyModel[246] = new ModelRendererTurbo(this, 373, 83, textureX, textureY); // Core73
		bodyModel[247] = new ModelRendererTurbo(this, 373, 71, textureX, textureY); // Core74
		bodyModel[248] = new ModelRendererTurbo(this, 187, 498, textureX, textureY); // Core75
		bodyModel[249] = new ModelRendererTurbo(this, 420, 180, textureX, textureY); // Core76
		bodyModel[250] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core77
		bodyModel[251] = new ModelRendererTurbo(this, 444, 365, textureX, textureY); // Core78
		bodyModel[252] = new ModelRendererTurbo(this, 420, 180, textureX, textureY); // Core79
		bodyModel[253] = new ModelRendererTurbo(this, 7, 305, textureX, textureY); // Core8
		bodyModel[254] = new ModelRendererTurbo(this, 449, 382, textureX, textureY); // Core80
		bodyModel[255] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core81
		bodyModel[256] = new ModelRendererTurbo(this, 449, 382, textureX, textureY); // Core82
		bodyModel[257] = new ModelRendererTurbo(this, 429, 189, textureX, textureY); // Core83
		bodyModel[258] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core84
		bodyModel[259] = new ModelRendererTurbo(this, 477, 366, textureX, textureY); // Core85
		bodyModel[260] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core86
		bodyModel[261] = new ModelRendererTurbo(this, 461, 188, textureX, textureY); // Core87
		bodyModel[262] = new ModelRendererTurbo(this, 461, 188, textureX, textureY); // Core88
		bodyModel[263] = new ModelRendererTurbo(this, 473, 382, textureX, textureY); // Core89
		bodyModel[264] = new ModelRendererTurbo(this, 7, 236, textureX, textureY); // Core9
		bodyModel[265] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core90
		bodyModel[266] = new ModelRendererTurbo(this, 473, 382, textureX, textureY); // Core91
		bodyModel[267] = new ModelRendererTurbo(this, 461, 176, textureX, textureY); // Core92
		bodyModel[268] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core93
		bodyModel[269] = new ModelRendererTurbo(this, 508, 102, textureX, textureY); // Core94
		bodyModel[270] = new ModelRendererTurbo(this, 182, 472, textureX, textureY); // Core95
		bodyModel[271] = new ModelRendererTurbo(this, 147, 70, textureX, textureY); // Core96
		bodyModel[272] = new ModelRendererTurbo(this, 381, 395, textureX, textureY); // Core97
		bodyModel[273] = new ModelRendererTurbo(this, 413, 107, textureX, textureY); // Core99
		bodyModel[274] = new ModelRendererTurbo(this, 432, 176, textureX, textureY); // Core309

		bodyModel[0].addBox(-20F, -15F, -33F, 47, 4, 66, 0F); // Core1
		bodyModel[0].setRotationPoint(0F, 14F, 0F);

		bodyModel[1].addShapeBox(104F, -15F, -24F, 42, 4, 48, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F); // Core10
		bodyModel[1].setRotationPoint(0F, 14F, 0F);

		bodyModel[2].addBox(68F, -76.5F, -18F, 1, 1, 36, 0F); // Core100
		bodyModel[2].setRotationPoint(0F, 14F, 0F);

		bodyModel[3].addShapeBox(179F, -24F, -6F, 10, 9, 12, 0F,0F, 0F, 0F, -1F, 0F, -5.5F, -1F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5.5F, -1F, 0F, -5.5F, 0F, 0F, 0F); // Core101
		bodyModel[3].setRotationPoint(0F, 14F, 0F);

		bodyModel[4].addBox(-38F, -35F, -8.5F, 5, 4, 16, 0F); // Core102
		bodyModel[4].setRotationPoint(0F, 14F, 0F);

		bodyModel[5].addShapeBox(59F, -55F, -6.5F, 5, 2, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core104
		bodyModel[5].setRotationPoint(0F, 14F, 0F);

		bodyModel[6].addShapeBox(166F, -24F, -11F, 13, 9, 22, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Core105
		bodyModel[6].setRotationPoint(0F, 14F, 0F);

		bodyModel[7].addShapeBox(-72F, -11F, -33F, 52, 7, 66, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F); // Core106
		bodyModel[7].setRotationPoint(0F, 14F, 0F);

		bodyModel[8].addBox(-45F, -33F, -8.5F, 7, 2, 16, 0F); // Core107
		bodyModel[8].setRotationPoint(0F, 14F, 0F);

		bodyModel[9].addBox(-36F, -31F, -16F, 8, 7, 30, 0F); // Core108
		bodyModel[9].setRotationPoint(0F, 14F, 0F);

		bodyModel[10].addShapeBox(54F, -58F, -4.5F, 5, 23, 8, 0F,0F, 0F, -1F, -.5F, 0F, -2.5F, -.5F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core109
		bodyModel[10].setRotationPoint(0F, 14F, 0F);

		bodyModel[11].addShapeBox(146F, -15F, -16F, 20, 4, 32, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Core11
		bodyModel[11].setRotationPoint(0F, 14F, 0F);

		bodyModel[12].addShapeBox(146F, -24F, -16F, 20, 9, 32, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Core110
		bodyModel[12].setRotationPoint(0F, 14F, 0F);

		bodyModel[13].addShapeBox(-124F, -11F, -30F, 52, 7, 60, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F); // Core111
		bodyModel[13].setRotationPoint(0F, 14F, 0F);

		bodyModel[14].addShapeBox(-156F, -11F, -24F, 32, 7, 48, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F); // Core112
		bodyModel[14].setRotationPoint(0F, 14F, 0F);

		bodyModel[15].addShapeBox(49F, -58F, -4.5F, 5, 23, 8, 0F,-.5F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -1F, -.5F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Core113
		bodyModel[15].setRotationPoint(0F, 14F, 0F);

		bodyModel[16].addShapeBox(118F, -24F, -24F, 28, 9, 48, 0F,0F, 0F, -2.7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2.7F, 0F, 0F, -2.7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2.7F); // Core114
		bodyModel[16].setRotationPoint(0F, 14F, 0F);

		bodyModel[17].addBox(-45F, -31F, -13F, 9, 7, 25, 0F); // Core115
		bodyModel[17].setRotationPoint(0F, 14F, 0F);

		bodyModel[18].addBox(-26F, -31F, -8F, 7, 7, 15, 0F); // Core116
		bodyModel[18].setRotationPoint(0F, 14F, 0F);

		bodyModel[19].addShapeBox(-176F, -11F, -18F, 20, 7, 36, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F); // Core117
		bodyModel[19].setRotationPoint(0F, 14F, 0F);

		bodyModel[20].addShapeBox(-19F, -31F, -8F, 3, 7, 15, 0F,0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core118
		bodyModel[20].setRotationPoint(0F, 14F, 0F);

		bodyModel[21].addShapeBox(-186F, -11F, -12F, 10, 7, 24, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6F); // Core119
		bodyModel[21].setRotationPoint(0F, 14F, 0F);

		bodyModel[22].addShapeBox(166F, -15F, -11F, 13, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Core12
		bodyModel[22].setRotationPoint(0F, 14F, 0F);

		bodyModel[23].addShapeBox(93F, -24F, -21F, 25, 9, 42, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Core120
		bodyModel[23].setRotationPoint(0F, 14F, 0F);

		bodyModel[24].addShapeBox(-28F, -31F, -16F, 2, 7, 30, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Core121
		bodyModel[24].setRotationPoint(0F, 14F, 0F);

		bodyModel[25].addShapeBox(-193F, -11F, -8F, 7, 7, 16, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -6F); // Core122
		bodyModel[25].setRotationPoint(0F, 14F, 0F);

		bodyModel[26].addShapeBox(68F, -24F, -24F, 19, 9, 48, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core123
		bodyModel[26].setRotationPoint(0F, 14F, 0F);

		bodyModel[27].addShapeBox(179F, -4F, -4F, 12, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1.5F); // Core124
		bodyModel[27].setRotationPoint(0F, 14F, 0F);

		bodyModel[28].addBox(-33F, -36F, -7F, 14, 5, 2, 0F); // Core125
		bodyModel[28].setRotationPoint(0F, 14F, 0F);

		bodyModel[29].addShapeBox(87F, -24F, -23F, 6, 9, 46, 0F,0F, 0F, 1F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 1F); // Core126
		bodyModel[29].setRotationPoint(0F, 14F, 0F);

		bodyModel[30].addShapeBox(166F, -4F, -9F, 13, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -2F); // Core127
		bodyModel[30].setRotationPoint(0F, 14F, 0F);

		bodyModel[31].addShapeBox(53F, -57F, 32F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core128
		bodyModel[31].setRotationPoint(0F, 14F, 0F);
		bodyModel[31].rotateAngleY = -0.61086524F;

		bodyModel[32].addShapeBox(62F, -24F, -27F, 6, 9, 54, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Core129
		bodyModel[32].setRotationPoint(0F, 14F, 0F);

		bodyModel[33].addShapeBox(179F, -15F, -6F, 10, 4, 12, 0F,0F, 0F, 0F, -1F, 0F, -5.5F, -1F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F); // Core13
		bodyModel[33].setRotationPoint(0F, 14F, 0F);

		bodyModel[34].addShapeBox(-20F, -36F, -4.5F, 1, 5, 8, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Core130
		bodyModel[34].setRotationPoint(0F, 14F, 0F);

		bodyModel[35].addShapeBox(146F, -4F, -14F, 20, 5, 28, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // Core131
		bodyModel[35].setRotationPoint(0F, 14F, 0F);

		bodyModel[36].addShapeBox(-45F, -24F, -27F, 107, 9, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core132
		bodyModel[36].setRotationPoint(0F, 14F, 0F);

		bodyModel[37].addShapeBox(-33.2F, -58F, -4.5F, 6, 26, 8, 0F,-1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Core133
		bodyModel[37].setRotationPoint(0F, 14F, 0F);

		bodyModel[38].addShapeBox(52.5F, -57F, 30.5F, 2, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core134
		bodyModel[38].setRotationPoint(0F, 14F, 0F);
		bodyModel[38].rotateAngleY = -0.61086524F;

		bodyModel[39].addShapeBox(104F, 5F, -18F, 42, 3, 36, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F); // Core135
		bodyModel[39].setRotationPoint(0F, 14F, 0F);

		bodyModel[40].addShapeBox(52.5F, -52F, 6F, 2, 1, 2, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Core136
		bodyModel[40].setRotationPoint(0F, 14F, 0F);

		bodyModel[41].addBox(-158F, 3F, -1F, 5, 2, 2, 0F); // Core137
		bodyModel[41].setRotationPoint(0F, 14F, 0F);

		bodyModel[42].addBox(72F, -40F, -6.5F, 4, 2, 12, 0F); // Core138
		bodyModel[42].setRotationPoint(0F, 14F, 0F);

		bodyModel[43].addShapeBox(48F, -32F, -13F, 12, 9, 25, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Core139
		bodyModel[43].setRotationPoint(0F, 14F, 0F);

		bodyModel[44].addShapeBox(179F, -11F, -6F, 10, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -5.5F, 2F, 0F, -5.5F, 0F, 0F, -2F); // Core14
		bodyModel[44].setRotationPoint(0F, 14F, 0F);

		bodyModel[45].addShapeBox(67F, -76F, -2F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core140
		bodyModel[45].setRotationPoint(0F, 14F, 0F);

		bodyModel[46].addShapeBox(104F, -4F, -22F, 42, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F); // Core141
		bodyModel[46].setRotationPoint(0F, 14F, 0F);

		bodyModel[47].addShapeBox(-27.2F, -58F, -4.5F, 6, 26, 8, 0F,0F, 0F, -1F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core142
		bodyModel[47].setRotationPoint(0F, 14F, 0F);

		bodyModel[48].addShapeBox(-54F, -24F, -27F, 9, 9, 54, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Core143
		bodyModel[48].setRotationPoint(0F, 14F, 0F);

		bodyModel[49].addShapeBox(52.5F, -56F, 30.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core144
		bodyModel[49].setRotationPoint(0F, 14F, 0F);
		bodyModel[49].rotateAngleY = -0.61086524F;

		bodyModel[50].addShapeBox(-43.5F, -45F, -7.5F, 4, 2, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Core145
		bodyModel[50].setRotationPoint(0F, 14F, 0F);

		bodyModel[51].addShapeBox(-68F, -24F, -23F, 14, 9, 46, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Core146
		bodyModel[51].setRotationPoint(0F, 14F, 0F);

		bodyModel[52].addShapeBox(61F, -4F, -28F, 43, 5, 56, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F); // Core147
		bodyModel[52].setRotationPoint(0F, 14F, 0F);

		bodyModel[53].addShapeBox(53F, -57F, 30F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core148
		bodyModel[53].setRotationPoint(0F, 14F, 0F);
		bodyModel[53].rotateAngleY = -0.61086524F;

		bodyModel[54].addShapeBox(52.5F, -57F, -32F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core149
		bodyModel[54].setRotationPoint(0F, 14F, 0F);
		bodyModel[54].rotateAngleY = 0.61086524F;

		bodyModel[55].addShapeBox(166F, -11F, -11F, 13, 7, 22, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // Core15
		bodyModel[55].setRotationPoint(0F, 14F, 0F);

		bodyModel[56].addShapeBox(27F, -4F, -31F, 34, 5, 62, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F); // Core150
		bodyModel[56].setRotationPoint(0F, 14F, 0F);

		bodyModel[57].addBox(-45.5F, -45F, -3.5F, 2, 2, 6, 0F); // Core151
		bodyModel[57].setRotationPoint(0F, 14F, 0F);

		bodyModel[58].addShapeBox(-74F, -24F, -21F, 6, 9, 42, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Core152
		bodyModel[58].setRotationPoint(0F, 14F, 0F);

		bodyModel[59].addShapeBox(-20F, -4F, -31F, 47, 5, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core153
		bodyModel[59].setRotationPoint(0F, 14F, 0F);

		bodyModel[60].addShapeBox(-78F, -24F, -18F, 4, 9, 36, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Core154
		bodyModel[60].setRotationPoint(0F, 14F, 0F);

		bodyModel[61].addShapeBox(-47.5F, -45F, -3.5F, 2, 2, 6, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Core155
		bodyModel[61].setRotationPoint(0F, 14F, 0F);

		bodyModel[62].addShapeBox(52F, -57F, -33.5F, 2, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core156
		bodyModel[62].setRotationPoint(0F, 14F, 0F);
		bodyModel[62].rotateAngleY = 0.61086524F;

		bodyModel[63].addShapeBox(-72F, -4F, -31F, 52, 5, 62, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F); // Core157
		bodyModel[63].setRotationPoint(0F, 14F, 0F);

		bodyModel[64].addShapeBox(52F, -56F, -33.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core158
		bodyModel[64].setRotationPoint(0F, 14F, 0F);
		bodyModel[64].rotateAngleY = 0.61086524F;

		bodyModel[65].addShapeBox(-43.5F, -40F, -7.5F, 4, 2, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Core159
		bodyModel[65].setRotationPoint(0F, 14F, 0F);

		bodyModel[66].addShapeBox(146F, -11F, -16F, 20, 7, 32, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // Core16
		bodyModel[66].setRotationPoint(0F, 14F, 0F);

		bodyModel[67].addBox(-44.5F, -76F, -1.5F, 2, 45, 2, 0F); // Core160
		bodyModel[67].setRotationPoint(0F, 14F, 0F);

		bodyModel[68].addShapeBox(52.5F, -57F, -34F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core161
		bodyModel[68].setRotationPoint(0F, 14F, 0F);
		bodyModel[68].rotateAngleY = 0.61086524F;

		bodyModel[69].addShapeBox(-124F, -4F, -28F, 52, 5, 56, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F); // Core162
		bodyModel[69].setRotationPoint(0F, 14F, 0F);

		bodyModel[70].addShapeBox(-45F, -76F, -2F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // Core163
		bodyModel[70].setRotationPoint(0F, 14F, 0F);

		bodyModel[71].addShapeBox(-156F, -4F, -22F, 32, 5, 44, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F); // Core164
		bodyModel[71].setRotationPoint(0F, 14F, 0F);

		bodyModel[72].addShapeBox(53F, -52F, -33F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core165
		bodyModel[72].setRotationPoint(0F, 14F, 0F);
		bodyModel[72].rotateAngleY = 0.61086524F;

		bodyModel[73].addShapeBox(52.5F, -52F, -32.5F, 2, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core166
		bodyModel[73].setRotationPoint(0F, 14F, 0F);
		bodyModel[73].rotateAngleY = 0.61086524F;

		bodyModel[74].addBox(-45F, -81F, -2F, 3, 5, 3, 0F); // Core167
		bodyModel[74].setRotationPoint(0F, 14F, 0F);

		bodyModel[75].addShapeBox(-176F, -4F, -16F, 20, 3, 32, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -8F); // Core168
		bodyModel[75].setRotationPoint(0F, 14F, 0F);

		bodyModel[76].addShapeBox(52.5F, -51F, -32.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core169
		bodyModel[76].setRotationPoint(0F, 14F, 0F);
		bodyModel[76].rotateAngleY = 0.61086524F;

		bodyModel[77].addShapeBox(104F, -11F, -24F, 42, 7, 48, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F); // Core17
		bodyModel[77].setRotationPoint(0F, 14F, 0F);

		bodyModel[78].addShapeBox(-186F, -4F, -10F, 10, 3, 20, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -2F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -7F); // Core170
		bodyModel[78].setRotationPoint(0F, 14F, 0F);

		bodyModel[79].addBox(-44F, -76.5F, -18F, 1, 1, 36, 0F); // Core171
		bodyModel[79].setRotationPoint(0F, 14F, 0F);

		bodyModel[80].addShapeBox(53F, -52F, -31F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core172
		bodyModel[80].setRotationPoint(0F, 14F, 0F);
		bodyModel[80].rotateAngleY = 0.61086524F;

		bodyModel[81].addBox(-44F, -109F, -1F, 1, 28, 1, 0F); // Core173
		bodyModel[81].setRotationPoint(0F, 14F, 0F);

		bodyModel[82].addShapeBox(-189F, -4F, -6F, 3, 3, 12, 0F,2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, -3F, 0F, -5F, 2F, 0F, -3F, 2F, 0F, -3F, -3F, 0F, -5F); // Core174
		bodyModel[82].setRotationPoint(0F, 14F, 0F);

		bodyModel[83].addBox(59F, -43F, -6.5F, 5, 8, 12, 0F); // Core175
		bodyModel[83].setRotationPoint(0F, 14F, 0F);

		bodyModel[84].addBox(52.5F, -54F, 6F, 2, 2, 2, 0F); // Core176
		bodyModel[84].setRotationPoint(0F, 14F, 0F);

		bodyModel[85].addShapeBox(47F, -35F, -13.5F, 13, 3, 26, 0F,0F, .1F, -3F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -3F, 0F, .1F, -3F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -3F); // Core177
		bodyModel[85].setRotationPoint(0F, 14F, 0F);

		bodyModel[86].addShapeBox(-54F, -31F, -13F, 9, 7, 25, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Core178
		bodyModel[86].setRotationPoint(0F, 14F, 0F);

		bodyModel[87].addShapeBox(61F, 5F, -24F, 43, 3, 48, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F); // Core179
		bodyModel[87].setRotationPoint(0F, 14F, 0F);

		bodyModel[88].addShapeBox(61F, -11F, -30F, 43, 7, 60, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F); // Core18
		bodyModel[88].setRotationPoint(0F, 14F, 0F);

		bodyModel[89].addShapeBox(166F, 1F, -7F, 13, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -2F); // Core180
		bodyModel[89].setRotationPoint(0F, 14F, 0F);

		bodyModel[90].addShapeBox(-37F, -57F, 4F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core181
		bodyModel[90].setRotationPoint(0F, 14F, 0F);

		bodyModel[91].addShapeBox(53.5F, -52F, 31F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core182
		bodyModel[91].setRotationPoint(0F, 14F, 0F);
		bodyModel[91].rotateAngleY = -0.61086524F;

		bodyModel[92].addShapeBox(-37.5F, -57F, 2.5F, 2, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core183
		bodyModel[92].setRotationPoint(0F, 14F, 0F);

		bodyModel[93].addShapeBox(146F, 1F, -12F, 20, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // Core184
		bodyModel[93].setRotationPoint(0F, 14F, 0F);

		bodyModel[94].addShapeBox(53F, -52F, 29.5F, 2, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core185
		bodyModel[94].setRotationPoint(0F, 14F, 0F);
		bodyModel[94].rotateAngleY = -0.61086524F;

		bodyModel[95].addShapeBox(-37.5F, -56F, 2.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core186
		bodyModel[95].setRotationPoint(0F, 14F, 0F);

		bodyModel[96].addShapeBox(53F, -51F, 29.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core187
		bodyModel[96].setRotationPoint(0F, 14F, 0F);
		bodyModel[96].rotateAngleY = -0.61086524F;

		bodyModel[97].addShapeBox(104F, 1F, -20F, 42, 4, 40, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -2F); // Core188
		bodyModel[97].setRotationPoint(0F, 14F, 0F);

		bodyModel[98].addShapeBox(61F, 1F, -26F, 43, 4, 52, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -2F); // Core189
		bodyModel[98].setRotationPoint(0F, 14F, 0F);

		bodyModel[99].addShapeBox(27F, -11F, -33F, 34, 7, 66, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F); // Core19
		bodyModel[99].setRotationPoint(0F, 14F, 0F);

		bodyModel[100].addShapeBox(53.5F, -52F, 29F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core190
		bodyModel[100].setRotationPoint(0F, 14F, 0F);
		bodyModel[100].rotateAngleY = -0.61086524F;

		bodyModel[101].addShapeBox(-37F, -57F, 2F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core191
		bodyModel[101].setRotationPoint(0F, 14F, 0F);

		bodyModel[102].addShapeBox(27F, 1F, -29F, 34, 4, 58, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F); // Core192
		bodyModel[102].setRotationPoint(0F, 14F, 0F);

		bodyModel[103].addShapeBox(-37F, -57F, -4F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core193
		bodyModel[103].setRotationPoint(0F, 14F, 0F);

		bodyModel[104].addShapeBox(-20F, 1F, -29F, 47, 4, 58, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core194
		bodyModel[104].setRotationPoint(0F, 14F, 0F);

		bodyModel[105].addShapeBox(-37.5F, -57F, -5.5F, 2, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core195
		bodyModel[105].setRotationPoint(0F, 14F, 0F);

		bodyModel[106].addShapeBox(-72F, 1F, -29F, 52, 4, 58, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F); // Core196
		bodyModel[106].setRotationPoint(0F, 14F, 0F);

		bodyModel[107].addShapeBox(-37.5F, -56F, -5.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core197
		bodyModel[107].setRotationPoint(0F, 14F, 0F);

		bodyModel[108].addShapeBox(-124F, 1F, -26F, 52, 4, 52, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F); // Core198
		bodyModel[108].setRotationPoint(0F, 14F, 0F);

		bodyModel[109].addShapeBox(-156F, 1F, -20F, 32, 4, 40, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -10F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -10F); // Core199
		bodyModel[109].setRotationPoint(0F, 14F, 0F);

		bodyModel[110].addShapeBox(-72F, -15F, -33F, 52, 4, 66, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Core2
		bodyModel[110].setRotationPoint(0F, 14F, 0F);

		bodyModel[111].addShapeBox(-20F, -11F, -33F, 47, 7, 66, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core20
		bodyModel[111].setRotationPoint(0F, 14F, 0F);

		bodyModel[112].addShapeBox(-37F, -57F, -6F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core200
		bodyModel[112].setRotationPoint(0F, 14F, 0F);

		bodyModel[113].addShapeBox(-176F, -1F, -14F, 20, 2, 28, 0F,0F, 0F, -6F, 0F, 0F, .7F, 0F, 0F, .7F, 0F, 0F, -6F, 0F, 0F, -8F, .7F, 0F, 0F, .7F, 0F, 0F, 0F, 0F, -8F); // Core201
		bodyModel[113].setRotationPoint(0F, 14F, 0F);

		bodyModel[114].addShapeBox(53.5F, -37F, 5F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Core202
		bodyModel[114].setRotationPoint(0F, 14F, 0F);

		bodyModel[115].addShapeBox(-37F, -52F, -5F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core202
		bodyModel[115].setRotationPoint(0F, 14F, 0F);

		bodyModel[116].addShapeBox(-124F, 5F, -24F, 52, 3, 48, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -8F); // Core203
		bodyModel[116].setRotationPoint(0F, 14F, 0F);

		bodyModel[117].addBox(58.5F, -40F, -7.5F, 6, 2, 14, 0F); // Core204
		bodyModel[117].setRotationPoint(0F, 14F, 0F);

		bodyModel[118].addShapeBox(60F, -35F, -13.5F, 23, 3, 26, 0F,0F, .1F, 0F, 0F, .1F, -6F, 0F, .1F, -6F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, -6F, 0F, .1F, -6F, 0F, .1F, 0F); // Core205
		bodyModel[118].setRotationPoint(0F, 14F, 0F);

		bodyModel[119].addShapeBox(-184F, -1F, -8F, 8, 2, 16, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -7F); // Core206
		bodyModel[119].setRotationPoint(0F, 14F, 0F);

		bodyModel[120].addShapeBox(-37.5F, -52F, -6.5F, 2, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core207
		bodyModel[120].setRotationPoint(0F, 14F, 0F);

		bodyModel[121].addShapeBox(-37.5F, -51F, -6.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core208
		bodyModel[121].setRotationPoint(0F, 14F, 0F);

		bodyModel[122].addShapeBox(-186F, -1F, -6F, 3, 2, 12, 0F,0F, 0F, -5F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, -5F, -2F, -.5F, -5.5F, 1F, 0F, -5F, 1F, 0F, -5F, -2F, -.5F, -5.5F); // Core209
		bodyModel[122].setRotationPoint(0F, 14F, 0F);

		bodyModel[123].addShapeBox(179F, 1F, -4F, 12, 4, 8, 0F,0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, -4F, 0F, -3.5F, -4F, 0F, -3.5F, 0F, 0F, -2.5F); // Core21
		bodyModel[123].setRotationPoint(0F, 14F, 0F);

		bodyModel[124].addShapeBox(-37F, -52F, -7F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core210
		bodyModel[124].setRotationPoint(0F, 14F, 0F);

		bodyModel[125].addShapeBox(-37F, -52F, 5F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core211
		bodyModel[125].setRotationPoint(0F, 14F, 0F);

		bodyModel[126].addShapeBox(-37.5F, -52F, 3.5F, 2, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core212
		bodyModel[126].setRotationPoint(0F, 14F, 0F);

		bodyModel[127].addShapeBox(-37.5F, -51F, 3.5F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F); // Core213
		bodyModel[127].setRotationPoint(0F, 14F, 0F);

		bodyModel[128].addShapeBox(-37F, -52F, 3F, 1, 2, 1, 0F,0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Core214
		bodyModel[128].setRotationPoint(0F, 14F, 0F);

		bodyModel[129].addBox(-51F, -35F, -5.5F, 6, 4, 10, 0F); // Core215
		bodyModel[129].setRotationPoint(0F, 14F, 0F);

		bodyModel[130].addShapeBox(14.4F, -48.1F, 11F, 1, 1, 1, 0F,-.3F, -.3F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.7F, -.2F, -.3F, -.7F, -.2F, -.3F, -.3F, -.2F); // Core216
		bodyModel[130].setRotationPoint(0F, 14F, 0F);
		bodyModel[130].rotateAngleY = -3.14159265F;

		bodyModel[131].addShapeBox(14F, -48.1F, 11F, 1, 1, 1, 0F,-.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F); // Core217
		bodyModel[131].setRotationPoint(0F, 14F, 0F);
		bodyModel[131].rotateAngleY = -3.14159265F;

		bodyModel[132].addBox(-33F, -36F, 4F, 14, 5, 2, 0F); // Core218
		bodyModel[132].setRotationPoint(0F, 14F, 0F);

		bodyModel[133].addBox(59F, -35F, -13.5F, 2, 3, 26, 0F); // Core219
		bodyModel[133].setRotationPoint(0F, 14F, 0F);

		bodyModel[134].addShapeBox(77F, -38F, -6F, 4, 3, 11, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Core22
		bodyModel[134].setRotationPoint(0F, 14F, 0F);

		bodyModel[135].addShapeBox(50.5F, -37F, 5F, 3, 1, 4, 0F,0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F); // Core220
		bodyModel[135].setRotationPoint(0F, 14F, 0F);

		bodyModel[136].addShapeBox(64.5F, -40F, -7.5F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Core221
		bodyModel[136].setRotationPoint(0F, 14F, 0F);

		bodyModel[137].addShapeBox(-72F, 5F, -27F, 52, 3, 54, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F); // Core222
		bodyModel[137].setRotationPoint(0F, 14F, 0F);

		bodyModel[138].addShapeBox(13.6F, -49.1F, 11F, 1, 2, 1, 0F,-.3F, -.7F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.7F, -.2F, -.3F, -.7F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.7F, -.2F); // Core223
		bodyModel[138].setRotationPoint(0F, 14F, 0F);
		bodyModel[138].rotateAngleY = -3.14159265F;

		bodyModel[139].addShapeBox(14F, -49.1F, 11F, 1, 1, 1, 0F,-.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F); // Core224
		bodyModel[139].setRotationPoint(0F, 14F, 0F);
		bodyModel[139].rotateAngleY = -3.14159265F;

		bodyModel[140].addShapeBox(13.5F, -49.9F, 11F, 2, 1, 1, 0F,-.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F); // Core225
		bodyModel[140].setRotationPoint(0F, 14F, 0F);
		bodyModel[140].rotateAngleY = -3.14159265F;

		bodyModel[141].addShapeBox(13.5F, -51F, 11F, 2, 1, 1, 0F,-.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F); // Core226
		bodyModel[141].setRotationPoint(0F, 14F, 0F);
		bodyModel[141].rotateAngleY = -3.14159265F;

		bodyModel[142].addBox(13.5F, -53F, 10.5F, 2, 2, 2, 0F); // Core227
		bodyModel[142].setRotationPoint(0F, 14F, 0F);
		bodyModel[142].rotateAngleY = -3.14159265F;

		bodyModel[143].addBox(-27.5F, -47F, 11F, 25, 1, 1, 0F); // Core228
		bodyModel[143].setRotationPoint(0F, 14F, 0F);
		bodyModel[143].rotateAngleY = -3.14159265F;
		bodyModel[143].rotateAngleZ = -0.80285146F;

		bodyModel[144].addShapeBox(31.5F, -32F, 9.5F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F); // Core229
		bodyModel[144].setRotationPoint(0F, 14F, 0F);
		bodyModel[144].rotateAngleY = -3.14159265F;

		bodyModel[145].addBox(67F, -81F, -2F, 3, 5, 3, 0F); // Core23
		bodyModel[145].setRotationPoint(0F, 14F, 0F);

		bodyModel[146].addShapeBox(28.5F, -32F, 9.5F, 3, 1, 4, 0F,0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F); // Core230
		bodyModel[146].setRotationPoint(0F, 14F, 0F);
		bodyModel[146].rotateAngleY = -3.14159265F;

		bodyModel[147].addShapeBox(30.5F, -50F, 10.5F, 2, 14, 2, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core231
		bodyModel[147].setRotationPoint(0F, 14F, 0F);
		bodyModel[147].rotateAngleY = -3.14159265F;

		bodyModel[148].addShapeBox(30F, -36F, 10F, 3, 6, 3, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core232
		bodyModel[148].setRotationPoint(0F, 14F, 0F);
		bodyModel[148].rotateAngleY = -3.14159265F;

		bodyModel[149].addShapeBox(59F, -35F, 12.5F, 2, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, .5F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F); // Core233
		bodyModel[149].setRotationPoint(0F, 14F, 0F);

		bodyModel[150].addShapeBox(-20F, 5F, -27F, 47, 3, 54, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Core234
		bodyModel[150].setRotationPoint(0F, 14F, 0F);

		bodyModel[151].addBox(58.5F, -45F, -7.5F, 6, 2, 14, 0F); // Core235
		bodyModel[151].setRotationPoint(0F, 14F, 0F);

		bodyModel[152].addBox(-39F, -43F, -6.5F, 5, 12, 12, 0F); // Core236
		bodyModel[152].setRotationPoint(0F, 14F, 0F);

		bodyModel[153].addBox(-12.5F, -63F, 6.5F, 22, 1, 1, 0F); // Core237
		bodyModel[153].setRotationPoint(0F, 14F, 0F);
		bodyModel[153].rotateAngleZ = -0.80285146F;

		bodyModel[154].addShapeBox(30.5F, -50F, 10.5F, 2, 1, 2, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Core238
		bodyModel[154].setRotationPoint(0F, 14F, 0F);
		bodyModel[154].rotateAngleY = -3.14159265F;

		bodyModel[155].addBox(30.5F, -52F, 10.5F, 2, 2, 2, 0F); // Core239
		bodyModel[155].setRotationPoint(0F, 14F, 0F);
		bodyModel[155].rotateAngleY = -3.14159265F;

		bodyModel[156].addBox(-174F, 3F, -0.5F, 9, 7, 1, 0F); // Core24
		bodyModel[156].setRotationPoint(0F, 14F, 0F);

		bodyModel[157].addShapeBox(30.5F, -48F, 10.5F, 2, 1, 2, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Core240
		bodyModel[157].setRotationPoint(0F, 14F, 0F);
		bodyModel[157].rotateAngleY = -3.14159265F;

		bodyModel[158].addShapeBox(23F, -27F, 17F, 18, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Core241
		bodyModel[158].setRotationPoint(0F, 14F, 0F);

		bodyModel[159].addShapeBox(41F, -27F, 17F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3.5F, -2F, 0F, -3.5F, 0F, 0F, -1F); // Core242
		bodyModel[159].setRotationPoint(0F, 14F, 0F);

		bodyModel[160].addShapeBox(41F, -29F, 18.5F, 6, 2, 5, 0F,0F, 0F, 0F, -1F, -.5F, -2F, -1F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core243
		bodyModel[160].setRotationPoint(0F, 14F, 0F);

		bodyModel[161].addBox(37F, -29F, 18.5F, 4, 2, 5, 0F); // Core244
		bodyModel[161].setRotationPoint(0F, 14F, 0F);

		bodyModel[162].addBox(29F, -29F, 18.5F, 6, 2, 5, 0F); // Core245
		bodyModel[162].setRotationPoint(0F, 14F, 0F);

		bodyModel[163].addShapeBox(38F, -29F, 10.5F, 6, 2, 5, 0F,0F, 0F, 0F, -1F, -.5F, -2F, -1F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core246
		bodyModel[163].setRotationPoint(0F, 14F, 0F);

		bodyModel[164].addBox(-39.5F, -40F, -7.5F, 6, 2, 14, 0F); // Core247
		bodyModel[164].setRotationPoint(0F, 14F, 0F);

		bodyModel[165].addShapeBox(27F, 5F, -27F, 34, 3, 54, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F); // Core248
		bodyModel[165].setRotationPoint(0F, 14F, 0F);

		bodyModel[166].addShapeBox(59F, -35F, -23.5F, 2, 3, 10, 0F,-.5F, .5F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core249
		bodyModel[166].setRotationPoint(0F, 14F, 0F);

		bodyModel[167].addShapeBox(52F, -41F, 5.5F, 3, 6, 3, 0F,-.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core25
		bodyModel[167].setRotationPoint(0F, 14F, 0F);

		bodyModel[168].addBox(35.5F, -53F, 6F, 2, 2, 2, 0F); // Core250
		bodyModel[168].setRotationPoint(0F, 14F, 0F);

		bodyModel[169].addShapeBox(64.5F, -45F, -7.5F, 4, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Core251
		bodyModel[169].setRotationPoint(0F, 14F, 0F);

		bodyModel[170].addShapeBox(38F, -27F, 9F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3.5F, -2F, 0F, -3.5F, 0F, 0F, -1F); // Core252
		bodyModel[170].setRotationPoint(0F, 14F, 0F);

		bodyModel[171].addBox(26F, -29F, 10.5F, 6, 2, 5, 0F); // Core253
		bodyModel[171].setRotationPoint(0F, 14F, 0F);

		bodyModel[172].addShapeBox(20F, -27F, 9F, 18, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Core254
		bodyModel[172].setRotationPoint(0F, 14F, 0F);

		bodyModel[173].addBox(34F, -29F, 10.5F, 4, 2, 5, 0F); // Core255
		bodyModel[173].setRotationPoint(0F, 14F, 0F);

		bodyModel[174].addShapeBox(3F, -27F, -17F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3.5F, -2F, 0F, -3.5F, 0F, 0F, -1F); // Core256
		bodyModel[174].setRotationPoint(0F, 14F, 0F);

		bodyModel[175].addShapeBox(3F, -29F, -15.5F, 6, 2, 5, 0F,0F, 0F, 0F, -1F, -.5F, -2F, -1F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core257
		bodyModel[175].setRotationPoint(0F, 14F, 0F);

		bodyModel[176].addBox(-1F, -29F, -15.5F, 4, 2, 5, 0F); // Core258
		bodyModel[176].setRotationPoint(0F, 14F, 0F);

		bodyModel[177].addBox(-9F, -29F, -15.5F, 6, 2, 5, 0F); // Core259
		bodyModel[177].setRotationPoint(0F, 14F, 0F);

		bodyModel[178].addBox(-87F, -24F, -12F, 9, 9, 24, 0F); // Core26
		bodyModel[178].setRotationPoint(0F, 14F, 0F);

		bodyModel[179].addShapeBox(-15F, -27F, -17F, 18, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Core260
		bodyModel[179].setRotationPoint(0F, 14F, 0F);

		bodyModel[180].addShapeBox(-9F, -27F, -8F, 15, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Core261
		bodyModel[180].setRotationPoint(0F, 14F, 0F);

		bodyModel[181].addBox(-39.5F, -45F, -7.5F, 6, 2, 14, 0F); // Core262
		bodyModel[181].setRotationPoint(0F, 14F, 0F);

		bodyModel[182].addBox(68.5F, -45F, -3.5F, 2, 2, 6, 0F); // Core263
		bodyModel[182].setRotationPoint(0F, 14F, 0F);

		bodyModel[183].addShapeBox(179F, 5F, -3F, 8, 3, 6, 0F,0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -2.8F, -8F, 0F, -2.8F, -8F, 0F, -2.8F, 0F, 0F, -2.8F); // Core264
		bodyModel[183].setRotationPoint(0F, 14F, 0F);

		bodyModel[184].addShapeBox(35.5F, -51F, 6.5F, 2, 1, 1, 0F,-.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F, -.3F, 0F, -.1F); // Core265
		bodyModel[184].setRotationPoint(0F, 14F, 0F);

		bodyModel[185].addShapeBox(6F, -27F, -8F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -1F); // Core266
		bodyModel[185].setRotationPoint(0F, 14F, 0F);

		bodyModel[186].addShapeBox(25F, -27F, 1F, 15, 3, 7, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Core267
		bodyModel[186].setRotationPoint(0F, 14F, 0F);

		bodyModel[187].addShapeBox(40F, -27F, 1F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, -1F); // Core268
		bodyModel[187].setRotationPoint(0F, 14F, 0F);

		bodyModel[188].addShapeBox(0F, -27F, -26F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3.5F, -2F, 0F, -3.5F, 0F, 0F, -1F); // Core269
		bodyModel[188].setRotationPoint(0F, 14F, 0F);

		bodyModel[189].addShapeBox(-91F, -24F, -12F, 4, 9, 24, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Core27
		bodyModel[189].setRotationPoint(0F, 14F, 0F);

		bodyModel[190].addShapeBox(0F, -29F, -24.5F, 6, 2, 5, 0F,0F, 0F, 0F, -1F, -.5F, -2F, -1F, -.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Core270
		bodyModel[190].setRotationPoint(0F, 14F, 0F);

		bodyModel[191].addBox(-4F, -29F, -24.5F, 4, 2, 5, 0F); // Core271
		bodyModel[191].setRotationPoint(0F, 14F, 0F);

		bodyModel[192].addBox(-12F, -29F, -24.5F, 6, 2, 5, 0F); // Core272
		bodyModel[192].setRotationPoint(0F, 14F, 0F);

		bodyModel[193].addShapeBox(-18F, -27F, -26F, 18, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Core273
		bodyModel[193].setRotationPoint(0F, 14F, 0F);

		bodyModel[194].addBox(101.6F, -51.5F, -44.8F, 1, 11, 1, 0F); // Core274
		bodyModel[194].setRotationPoint(0F, 14F, 0F);
		bodyModel[194].rotateAngleY = 0.6981317F;
		bodyModel[194].rotateAngleZ = 0.6981317F;

		bodyModel[195].addBox(102F, -51F, 43F, 1, 11, 1, 0F); // Core275
		bodyModel[195].setRotationPoint(0F, 14F, 0F);
		bodyModel[195].rotateAngleY = -0.6981317F;
		bodyModel[195].rotateAngleZ = 0.6981317F;

		bodyModel[196].addBox(72F, -38F, -8F, 5, 3, 15, 0F); // Core28
		bodyModel[196].setRotationPoint(0F, 14F, 0F);

		bodyModel[197].addBox(68F, -109F, -1F, 1, 28, 1, 0F); // Core29
		bodyModel[197].setRotationPoint(0F, 14F, 0F);

		bodyModel[198].addShapeBox(-124F, -15F, -30F, 52, 4, 60, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Core3
		bodyModel[198].setRotationPoint(0F, 14F, 0F);

		bodyModel[199].addShapeBox(166F, 5F, -5F, 13, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.8F, 0F, 0F, -4.8F, 0F, 0F, -2F); // Core30
		bodyModel[199].setRotationPoint(0F, 14F, 0F);

		bodyModel[200].addBox(-166F, 1F, -1.5F, 3, 5, 3, 0F); // Core31
		bodyModel[200].setRotationPoint(0F, 14F, 0F);

		bodyModel[201].addShapeBox(52.5F, -52F, 6F, 2, 11, 2, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core32
		bodyModel[201].setRotationPoint(0F, 14F, 0F);

		bodyModel[202].addShapeBox(70.5F, -45F, -3.5F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Core33
		bodyModel[202].setRotationPoint(0F, 14F, 0F);

		bodyModel[203].addBox(-35.5F, -53F, 2.5F, 1, 8, 1, 0F); // Core34
		bodyModel[203].setRotationPoint(0F, 14F, 0F);

		bodyModel[204].addShapeBox(-154F, 5F, -18F, 30, 3, 36, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -2F, 0F, -12F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -12F); // Core35
		bodyModel[204].setRotationPoint(0F, 14F, 0F);

		bodyModel[205].addShapeBox(35.5F, -49.9F, 6.5F, 2, 1, 1, 0F,-.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F, -.3F, .1F, -.1F); // Core36
		bodyModel[205].setRotationPoint(0F, 14F, 0F);

		bodyModel[206].addBox(36F, -106F, -29F, 1, 11, 1, 0F); // Core37
		bodyModel[206].setRotationPoint(0F, 14F, 0F);
		bodyModel[206].rotateAngleY = -0.6981317F;
		bodyModel[206].rotateAngleZ = 0.6981317F;

		bodyModel[207].addBox(35.5F, -106.5F, 27F, 1, 11, 1, 0F); // Core38
		bodyModel[207].setRotationPoint(0F, 14F, 0F);
		bodyModel[207].rotateAngleY = 0.6981317F;
		bodyModel[207].rotateAngleZ = 0.6981317F;

		bodyModel[208].addShapeBox(93F, -19.5F, -26.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core39
		bodyModel[208].setRotationPoint(0F, 14F, 0F);
		bodyModel[208].rotateAngleY = 0.52359878F;

		bodyModel[209].addShapeBox(-156F, -15F, -24F, 32, 4, 48, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Core4
		bodyModel[209].setRotationPoint(0F, 14F, 0F);

		bodyModel[210].addShapeBox(91F, -20F, -27F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core40
		bodyModel[210].setRotationPoint(0F, 14F, 0F);
		bodyModel[210].rotateAngleY = 0.52359878F;

		bodyModel[211].addShapeBox(87F, -22F, -28F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core41
		bodyModel[211].setRotationPoint(0F, 14F, 0F);
		bodyModel[211].rotateAngleY = 0.52359878F;

		bodyModel[212].addShapeBox(93F, -19.5F, 25.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core42
		bodyModel[212].setRotationPoint(0F, 14F, 0F);
		bodyModel[212].rotateAngleY = -0.52359878F;

		bodyModel[213].addShapeBox(91F, -20F, 25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core43
		bodyModel[213].setRotationPoint(0F, 14F, 0F);
		bodyModel[213].rotateAngleY = -0.52359878F;

		bodyModel[214].addBox(-38.5F, -53F, 2.5F, 1, 8, 1, 0F); // Core44
		bodyModel[214].setRotationPoint(0F, 14F, 0F);

		bodyModel[215].addBox(67.5F, -76F, -1.5F, 2, 41, 2, 0F); // Core45
		bodyModel[215].setRotationPoint(0F, 14F, 0F);

		bodyModel[216].addShapeBox(36F, -49.1F, 6.5F, 1, 1, 1, 0F,-.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F); // Core46
		bodyModel[216].setRotationPoint(0F, 14F, 0F);

		bodyModel[217].addShapeBox(61F, 8F, -22F, 43, 3, 44, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, -11F); // Core47
		bodyModel[217].setRotationPoint(0F, 14F, 0F);

		bodyModel[218].addShapeBox(87F, -22F, 24F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core48
		bodyModel[218].setRotationPoint(0F, 14F, 0F);
		bodyModel[218].rotateAngleY = -0.52359878F;

		bodyModel[219].addShapeBox(74F, -19.5F, 10.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core49
		bodyModel[219].setRotationPoint(0F, 14F, 0F);
		bodyModel[219].rotateAngleY = -0.52359878F;

		bodyModel[220].addShapeBox(-176F, -15F, -18F, 20, 4, 36, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Core5
		bodyModel[220].setRotationPoint(0F, 14F, 0F);

		bodyModel[221].addShapeBox(72F, -20F, 10F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core50
		bodyModel[221].setRotationPoint(0F, 14F, 0F);
		bodyModel[221].rotateAngleY = -0.52359878F;

		bodyModel[222].addShapeBox(68F, -22F, 9F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core51
		bodyModel[222].setRotationPoint(0F, 14F, 0F);
		bodyModel[222].rotateAngleY = -0.52359878F;

		bodyModel[223].addShapeBox(73F, -19.5F, -10.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core52
		bodyModel[223].setRotationPoint(0F, 14F, 0F);
		bodyModel[223].rotateAngleY = 0.52359878F;

		bodyModel[224].addShapeBox(71F, -20F, -11F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core53
		bodyModel[224].setRotationPoint(0F, 14F, 0F);
		bodyModel[224].rotateAngleY = 0.52359878F;

		bodyModel[225].addShapeBox(67F, -22F, -12F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core54
		bodyModel[225].setRotationPoint(0F, 14F, 0F);
		bodyModel[225].rotateAngleY = 0.52359878F;

		bodyModel[226].addShapeBox(36F, -48.1F, 6.5F, 1, 1, 1, 0F,-.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F); // Core55
		bodyModel[226].setRotationPoint(0F, 14F, 0F);

		bodyModel[227].addBox(-35.5F, -53F, -4.5F, 1, 8, 1, 0F); // Core56
		bodyModel[227].setRotationPoint(0F, 14F, 0F);

		bodyModel[228].addBox(62.5F, -53F, 2.5F, 1, 8, 1, 0F); // Core57
		bodyModel[228].setRotationPoint(0F, 14F, 0F);

		bodyModel[229].addShapeBox(104F, 8F, -16F, 42, 3, 32, 0F,0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -9F); // Core58
		bodyModel[229].setRotationPoint(0F, 14F, 0F);

		bodyModel[230].addShapeBox(-62F, -19.5F, -7.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core59
		bodyModel[230].setRotationPoint(0F, 14F, 0F);
		bodyModel[230].rotateAngleY = -0.61086524F;

		bodyModel[231].addShapeBox(-186F, -15F, -12F, 10, 4, 24, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Core6
		bodyModel[231].setRotationPoint(0F, 14F, 0F);

		bodyModel[232].addShapeBox(-58F, -20F, -8F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core60
		bodyModel[232].setRotationPoint(0F, 14F, 0F);
		bodyModel[232].rotateAngleY = -0.61086524F;

		bodyModel[233].addShapeBox(-56F, -22F, -9F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core61
		bodyModel[233].setRotationPoint(0F, 14F, 0F);
		bodyModel[233].rotateAngleY = -0.61086524F;

		bodyModel[234].addShapeBox(-63F, -19.5F, 8.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core62
		bodyModel[234].setRotationPoint(0F, 14F, 0F);
		bodyModel[234].rotateAngleY = 0.61086524F;

		bodyModel[235].addShapeBox(-59F, -20F, 8F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core63
		bodyModel[235].setRotationPoint(0F, 14F, 0F);
		bodyModel[235].rotateAngleY = 0.61086524F;

		bodyModel[236].addShapeBox(-57F, -22F, 7F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core64
		bodyModel[236].setRotationPoint(0F, 14F, 0F);
		bodyModel[236].rotateAngleY = 0.61086524F;

		bodyModel[237].addShapeBox(-81F, -19.5F, 24.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core65
		bodyModel[237].setRotationPoint(0F, 14F, 0F);
		bodyModel[237].rotateAngleY = 0.52359878F;

		bodyModel[238].addShapeBox(-77F, -20F, 24F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core66
		bodyModel[238].setRotationPoint(0F, 14F, 0F);
		bodyModel[238].rotateAngleY = 0.52359878F;

		bodyModel[239].addShapeBox(-75F, -22F, 23F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core67
		bodyModel[239].setRotationPoint(0F, 14F, 0F);
		bodyModel[239].rotateAngleY = 0.52359878F;

		bodyModel[240].addShapeBox(-81F, -19.5F, -24.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core68
		bodyModel[240].setRotationPoint(0F, 14F, 0F);
		bodyModel[240].rotateAngleY = -0.50614548F;

		bodyModel[241].addShapeBox(146F, 8F, -8F, 20, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -5F); // Core69
		bodyModel[241].setRotationPoint(0F, 14F, 0F);

		bodyModel[242].addShapeBox(-193F, -15F, -8F, 7, 4, 16, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Core7
		bodyModel[242].setRotationPoint(0F, 14F, 0F);

		bodyModel[243].addShapeBox(35.6F, -49.1F, 6.5F, 1, 2, 1, 0F,-.3F, -.7F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.7F, -.2F, -.3F, -.7F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.7F, -.2F); // Core70
		bodyModel[243].setRotationPoint(0F, 14F, 0F);

		bodyModel[244].addBox(59.5F, -53F, 2.5F, 1, 8, 1, 0F); // Core71
		bodyModel[244].setRotationPoint(0F, 14F, 0F);

		bodyModel[245].addBox(-38.5F, -53F, -4.5F, 1, 8, 1, 0F); // Core72
		bodyModel[245].setRotationPoint(0F, 14F, 0F);

		bodyModel[246].addShapeBox(-77F, -20F, -25F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core73
		bodyModel[246].setRotationPoint(0F, 14F, 0F);
		bodyModel[246].rotateAngleY = -0.50614548F;

		bodyModel[247].addShapeBox(-75F, -22F, -26F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core74
		bodyModel[247].setRotationPoint(0F, 14F, 0F);
		bodyModel[247].rotateAngleY = -0.50614548F;

		bodyModel[248].addShapeBox(36.4F, -48.1F, 6.5F, 1, 1, 1, 0F,-.3F, -.3F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.7F, -.2F, -.3F, -.7F, -.2F, -.3F, -.3F, -.2F); // Core75
		bodyModel[248].setRotationPoint(0F, 14F, 0F);

		bodyModel[249].addBox(59.5F, -53F, -4.5F, 1, 8, 1, 0F); // Core76
		bodyModel[249].setRotationPoint(0F, 14F, 0F);

		bodyModel[250].addShapeBox(-152F, 8F, -16F, 28, 3, 32, 0F,0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, -1F, -14F, 0F, 0F, -10F, 0F, 0F, -10F, -2F, -1F, -14F); // Core77
		bodyModel[250].setRotationPoint(0F, 14F, 0F);

		bodyModel[251].addBox(-39F, -50F, -5.5F, 5, 2, 10, 0F); // Core78
		bodyModel[251].setRotationPoint(0F, 14F, 0F);

		bodyModel[252].addBox(62.5F, -53F, -4.5F, 1, 8, 1, 0F); // Core79
		bodyModel[252].setRotationPoint(0F, 14F, 0F);

		bodyModel[253].addShapeBox(27F, -15F, -33F, 34, 4, 66, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Core8
		bodyModel[253].setRotationPoint(0F, 14F, 0F);

		bodyModel[254].addShapeBox(-39F, -50F, 4.5F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Core80
		bodyModel[254].setRotationPoint(0F, 14F, 0F);

		bodyModel[255].addShapeBox(-124F, 8F, -22F, 52, 3, 44, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -16F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -16F); // Core81
		bodyModel[255].setRotationPoint(0F, 14F, 0F);

		bodyModel[256].addShapeBox(-39F, -55F, 3.5F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Core82
		bodyModel[256].setRotationPoint(0F, 14F, 0F);

		bodyModel[257].addBox(59F, -50F, -5.5F, 5, 2, 10, 0F); // Core83
		bodyModel[257].setRotationPoint(0F, 14F, 0F);

		bodyModel[258].addShapeBox(-72F, 8F, -25F, 52, 3, 50, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -15F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -15F); // Core84
		bodyModel[258].setRotationPoint(0F, 14F, 0F);

		bodyModel[259].addBox(-39F, -55F, -4.5F, 5, 2, 8, 0F); // Core85
		bodyModel[259].setRotationPoint(0F, 14F, 0F);

		bodyModel[260].addShapeBox(-20F, 8F, -25F, 47, 3, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Core86
		bodyModel[260].setRotationPoint(0F, 14F, 0F);

		bodyModel[261].addShapeBox(59F, -50F, 4.5F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Core87
		bodyModel[261].setRotationPoint(0F, 14F, 0F);

		bodyModel[262].addShapeBox(59F, -50F, -7.5F, 5, 2, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core88
		bodyModel[262].setRotationPoint(0F, 14F, 0F);

		bodyModel[263].addShapeBox(-39F, -55F, -6.5F, 5, 2, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core89
		bodyModel[263].setRotationPoint(0F, 14F, 0F);

		bodyModel[264].addShapeBox(61F, -15F, -30F, 43, 4, 60, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Core9
		bodyModel[264].setRotationPoint(0F, 14F, 0F);

		bodyModel[265].addShapeBox(27F, 8F, -25F, 34, 3, 50, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -12F); // Core90
		bodyModel[265].setRotationPoint(0F, 14F, 0F);

		bodyModel[266].addShapeBox(-39F, -50F, -7.5F, 5, 2, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Core91
		bodyModel[266].setRotationPoint(0F, 14F, 0F);

		bodyModel[267].addShapeBox(59F, -55F, 3.5F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Core92
		bodyModel[267].setRotationPoint(0F, 14F, 0F);

		bodyModel[268].addShapeBox(166F, 8F, -3F, 13, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, 0F, 0F, 0F, -2F, -12F, 0F, -2.8F, -12F, 0F, -2.8F, 0F, 0F, -2F); // Core93
		bodyModel[268].setRotationPoint(0F, 14F, 0F);

		bodyModel[269].addShapeBox(76F, -40F, -4.5F, 3, 2, 8, 0F,0F, 0F, 2F, -.3F, -.3F, -.3F, -.3F, -.3F, -.3F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Core94
		bodyModel[269].setRotationPoint(0F, 14F, 0F);

		bodyModel[270].addShapeBox(52.5F, -50F, 6F, 2, 1, 2, 0F,.2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, .2F); // Core95
		bodyModel[270].setRotationPoint(0F, 14F, 0F);

		bodyModel[271].addShapeBox(146F, 5F, -10F, 20, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -2F); // Core96
		bodyModel[271].setRotationPoint(0F, 14F, 0F);

		bodyModel[272].addShapeBox(-165F, 3F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Core97
		bodyModel[272].setRotationPoint(0F, 14F, 0F);

		bodyModel[273].addShapeBox(60F, -32F, -13F, 22, 9, 25, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Core99
		bodyModel[273].setRotationPoint(0F, 14F, 0F);

		bodyModel[274].addBox(59F, -55F, -4.5F, 5, 2, 8, 0F); // Core309
		bodyModel[274].setRotationPoint(0F, 14F, 0F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase1
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase2
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 248, 444, textureX, textureY); // FrontTurretBase3
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 212, 475, textureX, textureY); // FrontTurretGun1
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 258, 475, textureX, textureY); // FrontTurretGun2
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 324, 475, textureX, textureY); // FrontTurretGun3

		gun_2_Model[0][0].addShapeBox(4F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // FrontTurretBase1

		gun_2_Model[0][1].addBox(-4F, 4F, -9F, 8, 3, 18, 0F); // FrontTurretBase2

		gun_2_Model[0][2].addShapeBox(-9F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // FrontTurretBase3

		gun_2_Model[0][3].addShapeBox(4F, -2F, -8F, 5, 6, 16, 0F,0F, 0F, 0F, -1F, -1.5F, -4F, -1F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // FrontTurretGun1

		gun_2_Model[0][4].addBox(-11F, -2F, -8F, 15, 6, 16, 0F); // FrontTurretGun2

		gun_2_Model[0][5].addShapeBox(-13F, -2F, -8F, 2, 6, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // FrontTurretGun3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(102F, -17F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[4];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel1
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel2
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel3
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel4

		gun_2_Model[1][0].addShapeBox(-1F, -1F, 1F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel1

		gun_2_Model[1][1].addShapeBox(-1F, -1F, -4F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel2

		gun_2_Model[1][2].addShapeBox(10F, -0.5F, -3.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel3

		gun_2_Model[1][3].addShapeBox(10F, -0.5F, 1.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(102F, -17F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase1
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase2
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 248, 444, textureX, textureY); // FrontTurretBase3
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 212, 475, textureX, textureY); // FrontTurretGun1
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 258, 475, textureX, textureY); // FrontTurretGun2
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 324, 475, textureX, textureY); // FrontTurretGun3

		gun_3_Model[0][0].addShapeBox(4F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // FrontTurretBase1

		gun_3_Model[0][1].addBox(-4F, 4F, -9F, 8, 3, 18, 0F); // FrontTurretBase2

		gun_3_Model[0][2].addShapeBox(-9F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // FrontTurretBase3

		gun_3_Model[0][3].addShapeBox(4F, -2F, -8F, 5, 6, 16, 0F,0F, 0F, 0F, -1F, -1.5F, -4F, -1F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // FrontTurretGun1

		gun_3_Model[0][4].addBox(-11F, -2F, -8F, 15, 6, 16, 0F); // FrontTurretGun2

		gun_3_Model[0][5].addShapeBox(-13F, -2F, -8F, 2, 6, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // FrontTurretGun3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(31F, -17F, -17F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[4];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel1
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel2
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel3
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel4

		gun_3_Model[1][0].addShapeBox(-1F, -1F, 1F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel1

		gun_3_Model[1][1].addShapeBox(-1F, -1F, -4F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel2

		gun_3_Model[1][2].addShapeBox(10F, -0.5F, -3.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel3

		gun_3_Model[1][3].addShapeBox(10F, -0.5F, 1.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(31F, -17F, -17F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[6];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase1
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase2
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 248, 444, textureX, textureY); // FrontTurretBase3
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 212, 475, textureX, textureY); // FrontTurretGun1
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 258, 475, textureX, textureY); // FrontTurretGun2
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 324, 475, textureX, textureY); // FrontTurretGun3

		gun_4_Model[0][0].addShapeBox(4F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // FrontTurretBase1

		gun_4_Model[0][1].addBox(-4F, 4F, -9F, 8, 3, 18, 0F); // FrontTurretBase2

		gun_4_Model[0][2].addShapeBox(-9F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // FrontTurretBase3

		gun_4_Model[0][3].addShapeBox(4F, -2F, -8F, 5, 6, 16, 0F,0F, 0F, 0F, -1F, -1.5F, -4F, -1F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // FrontTurretGun1

		gun_4_Model[0][4].addBox(-11F, -2F, -8F, 15, 6, 16, 0F); // FrontTurretGun2

		gun_4_Model[0][5].addShapeBox(-13F, -2F, -8F, 2, 6, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // FrontTurretGun3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(1F, -17F, 17F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[4];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel1
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel2
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel3
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel4

		gun_4_Model[1][0].addShapeBox(-1F, -1F, 1F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel1

		gun_4_Model[1][1].addShapeBox(-1F, -1F, -4F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel2

		gun_4_Model[1][2].addShapeBox(10F, -0.5F, -3.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel3

		gun_4_Model[1][3].addShapeBox(10F, -0.5F, 1.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(1F, -17F, 17F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[6];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase1
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase2
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 248, 444, textureX, textureY); // FrontTurretBase3
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 212, 475, textureX, textureY); // FrontTurretGun1
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 258, 475, textureX, textureY); // FrontTurretGun2
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 324, 475, textureX, textureY); // FrontTurretGun3

		gun_5_Model[0][0].addShapeBox(4F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // FrontTurretBase1

		gun_5_Model[0][1].addBox(-4F, 4F, -9F, 8, 3, 18, 0F); // FrontTurretBase2

		gun_5_Model[0][2].addShapeBox(-9F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // FrontTurretBase3

		gun_5_Model[0][3].addShapeBox(4F, -2F, -8F, 5, 6, 16, 0F,0F, 0F, 0F, -1F, -1.5F, -4F, -1F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // FrontTurretGun1

		gun_5_Model[0][4].addBox(-11F, -2F, -8F, 15, 6, 16, 0F); // FrontTurretGun2

		gun_5_Model[0][5].addShapeBox(-13F, -2F, -8F, 2, 6, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // FrontTurretGun3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-81F, -17F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[4];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel1
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel2
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel3
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel4

		gun_5_Model[1][0].addShapeBox(-1F, -1F, 1F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel1

		gun_5_Model[1][1].addShapeBox(-1F, -1F, -4F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel2

		gun_5_Model[1][2].addShapeBox(10F, -0.5F, -3.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel3

		gun_5_Model[1][3].addShapeBox(10F, -0.5F, 1.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-81F, -17F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[6];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase1
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 248, 445, textureX, textureY); // FrontTurretBase2
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 248, 444, textureX, textureY); // FrontTurretBase3
		gun_6_Model[0][3] = new ModelRendererTurbo(this, 212, 475, textureX, textureY); // FrontTurretGun1
		gun_6_Model[0][4] = new ModelRendererTurbo(this, 258, 475, textureX, textureY); // FrontTurretGun2
		gun_6_Model[0][5] = new ModelRendererTurbo(this, 324, 475, textureX, textureY); // FrontTurretGun3

		gun_6_Model[0][0].addShapeBox(4F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // FrontTurretBase1

		gun_6_Model[0][1].addBox(-4F, 4F, -9F, 8, 3, 18, 0F); // FrontTurretBase2

		gun_6_Model[0][2].addShapeBox(-9F, 4F, -9F, 5, 3, 18, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // FrontTurretBase3

		gun_6_Model[0][3].addShapeBox(4F, -2F, -8F, 5, 6, 16, 0F,0F, 0F, 0F, -1F, -1.5F, -4F, -1F, -1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // FrontTurretGun1

		gun_6_Model[0][4].addBox(-11F, -2F, -8F, 15, 6, 16, 0F); // FrontTurretGun2

		gun_6_Model[0][5].addShapeBox(-13F, -2F, -8F, 2, 6, 16, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // FrontTurretGun3

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-110F, -8F, 0F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[4];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel1
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 306, 467, textureX, textureY); // FrontTurrelBarrel2
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel3
		gun_6_Model[1][3] = new ModelRendererTurbo(this, 306, 461, textureX, textureY); // FrontTurrelBarrel4

		gun_6_Model[1][0].addShapeBox(-1F, -1F, 1F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel1

		gun_6_Model[1][1].addShapeBox(-1F, -1F, -4F, 4, 3, 3, 0F,7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, 0F, 0F); // FrontTurrelBarrel2

		gun_6_Model[1][2].addShapeBox(10F, -0.5F, -3.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel3

		gun_6_Model[1][3].addShapeBox(10F, -0.5F, 1.5F, 24, 2, 2, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // FrontTurrelBarrel4

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-110F, -8F, 0F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);
	}
}