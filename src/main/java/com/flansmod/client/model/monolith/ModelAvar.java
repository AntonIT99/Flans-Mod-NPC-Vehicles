//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAvar extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelAvar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[210];
		leftArmModel = new ModelRendererTurbo[53];
		rightArmModel = new ModelRendererTurbo[50];
		leftLegModel = new ModelRendererTurbo[64];
		rightLegModel = new ModelRendererTurbo[64];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 18
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 31
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 37
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 39
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 53
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 54
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 55
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 56
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 57
		bodyModel[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 58
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 59
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 60
		bodyModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 69
		bodyModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 70
		bodyModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 71
		bodyModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 72
		bodyModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 73
		bodyModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 74
		bodyModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 75
		bodyModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 76
		bodyModel[21] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 85
		bodyModel[22] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 86
		bodyModel[23] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 87
		bodyModel[24] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 88
		bodyModel[25] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 89
		bodyModel[26] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 90
		bodyModel[27] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 91
		bodyModel[28] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 92
		bodyModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 95
		bodyModel[30] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 97
		bodyModel[31] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 99
		bodyModel[32] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 101
		bodyModel[33] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 103
		bodyModel[34] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 105
		bodyModel[35] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 111
		bodyModel[36] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 112
		bodyModel[37] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 113
		bodyModel[38] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 116
		bodyModel[39] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 117
		bodyModel[40] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 120
		bodyModel[41] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 123
		bodyModel[42] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 124
		bodyModel[43] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 127
		bodyModel[44] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 128
		bodyModel[45] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 129
		bodyModel[46] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 132
		bodyModel[47] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 133
		bodyModel[48] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 136
		bodyModel[49] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 139
		bodyModel[50] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 140
		bodyModel[51] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 143
		bodyModel[52] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 144
		bodyModel[53] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 145
		bodyModel[54] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 148
		bodyModel[55] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 149
		bodyModel[56] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 152
		bodyModel[57] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 155
		bodyModel[58] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 156
		bodyModel[59] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 157
		bodyModel[60] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 160
		bodyModel[61] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 161
		bodyModel[62] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 164
		bodyModel[63] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 165
		bodyModel[64] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 167
		bodyModel[65] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 168
		bodyModel[66] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 171
		bodyModel[67] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 173
		bodyModel[68] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 174
		bodyModel[69] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 175
		bodyModel[70] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 176
		bodyModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 179
		bodyModel[72] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 181
		bodyModel[73] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 184
		bodyModel[74] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 185
		bodyModel[75] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 186
		bodyModel[76] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 188
		bodyModel[77] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 189
		bodyModel[78] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 190
		bodyModel[79] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 191
		bodyModel[80] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 192
		bodyModel[81] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 193
		bodyModel[82] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 195
		bodyModel[83] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 196
		bodyModel[84] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 197
		bodyModel[85] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 198
		bodyModel[86] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 199
		bodyModel[87] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 200
		bodyModel[88] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 202
		bodyModel[89] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 203
		bodyModel[90] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 204
		bodyModel[91] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 205
		bodyModel[92] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 206
		bodyModel[93] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 207
		bodyModel[94] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 209
		bodyModel[95] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 210
		bodyModel[96] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 211
		bodyModel[97] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 212
		bodyModel[98] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 213
		bodyModel[99] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 214
		bodyModel[100] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 216
		bodyModel[101] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 217
		bodyModel[102] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 218
		bodyModel[103] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 219
		bodyModel[104] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 220
		bodyModel[105] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 221
		bodyModel[106] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 223
		bodyModel[107] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 224
		bodyModel[108] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 225
		bodyModel[109] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 226
		bodyModel[110] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 227
		bodyModel[111] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 228
		bodyModel[112] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[113] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 231
		bodyModel[114] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 232
		bodyModel[115] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 233
		bodyModel[116] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 234
		bodyModel[117] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 235
		bodyModel[118] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 237
		bodyModel[119] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 238
		bodyModel[120] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 239
		bodyModel[121] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 240
		bodyModel[122] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 241
		bodyModel[123] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 242
		bodyModel[124] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 243
		bodyModel[125] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 244
		bodyModel[126] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 245
		bodyModel[127] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 248
		bodyModel[128] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 249
		bodyModel[129] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 250
		bodyModel[130] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 251
		bodyModel[131] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 252
		bodyModel[132] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 253
		bodyModel[133] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 255
		bodyModel[134] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 256
		bodyModel[135] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 258
		bodyModel[136] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 259
		bodyModel[137] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 261
		bodyModel[138] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 262
		bodyModel[139] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 263
		bodyModel[140] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 264
		bodyModel[141] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 269
		bodyModel[142] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 277
		bodyModel[143] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 278
		bodyModel[144] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 279
		bodyModel[145] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 280
		bodyModel[146] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 281
		bodyModel[147] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 282
		bodyModel[148] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 283
		bodyModel[149] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 286
		bodyModel[150] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 287
		bodyModel[151] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 288
		bodyModel[152] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 289
		bodyModel[153] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 290
		bodyModel[154] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 291
		bodyModel[155] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 292
		bodyModel[156] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 293
		bodyModel[157] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 294
		bodyModel[158] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 295
		bodyModel[159] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 296
		bodyModel[160] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 297
		bodyModel[161] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 298
		bodyModel[162] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 299
		bodyModel[163] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 300
		bodyModel[164] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 301
		bodyModel[165] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 302
		bodyModel[166] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 303
		bodyModel[167] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 304
		bodyModel[168] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 305
		bodyModel[169] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 291
		bodyModel[170] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 292
		bodyModel[171] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 293
		bodyModel[172] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 294
		bodyModel[173] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 295
		bodyModel[174] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 296
		bodyModel[175] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 297
		bodyModel[176] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 298
		bodyModel[177] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 299
		bodyModel[178] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 301
		bodyModel[179] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 302
		bodyModel[180] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 303
		bodyModel[181] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 304
		bodyModel[182] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 305
		bodyModel[183] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 306
		bodyModel[184] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 307
		bodyModel[185] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 308
		bodyModel[186] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 309
		bodyModel[187] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 310
		bodyModel[188] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 311
		bodyModel[189] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 312
		bodyModel[190] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 313
		bodyModel[191] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 314
		bodyModel[192] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 315
		bodyModel[193] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 316
		bodyModel[194] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 317
		bodyModel[195] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 318
		bodyModel[196] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 319
		bodyModel[197] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 320
		bodyModel[198] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[199] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[200] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[201] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[202] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[203] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[204] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[205] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[206] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		bodyModel[207] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 9
		bodyModel[208] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[209] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(1F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 31
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 37
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 39
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(3F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 53
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(2F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 54
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(1F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 55
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 56
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 57
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 58
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 59
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 60
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(3F, 5.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 69
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2F, 5.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 70
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1F, 5.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 71
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 5.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 72
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1F, 5.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 73
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3F, 5.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 74
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 5.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 75
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-2F, 5.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 76
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(3F, 8.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 85
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2F, 8.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 86
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(1F, 8.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 87
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 8.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 88
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-1F, 8.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 89
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3F, 8.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 90
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4F, 8.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 91
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2F, 8.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 92
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 95
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 97
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 99
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-1F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 101
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 103
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 105
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 111
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 112
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 113
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 116
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 117
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(1F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 120
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(3F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 123
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 124
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 127
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-3F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 128
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 129
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-1F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 132
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(0F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 133
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(1F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 136
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(3F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 139
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(2F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 140
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-4F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 143
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 144
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 145
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-1F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 148
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(0F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 149
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(1F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 152
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(3F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 155
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(2F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 156
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(3F, 8.5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 157
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(2F, 8.5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 160
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(1F, 8.5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 161
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(0F, 8.5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 164
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-1F, 8.5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 165
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-2F, 8.5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 167
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-3F, 8.5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 168
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4F, 8.5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 171
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-3.5F, 0F, -2.3F, 1, 4, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 173
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-3.5F, -0.2F, -2.3F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F); // Box 174
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(2.5F, 0F, -2.3F, 1, 4, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 175
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(2.5F, -0.2F, -2.3F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F); // Box 176
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-1.5F, 2F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 179
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(0.5F, 2F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 181
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(2.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 184
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(1.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 185
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(0.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 186
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-1.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 188
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-2.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 189
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-3.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 190
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(2.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 191
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(1.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 192
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(0.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 193
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-1.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 195
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-2.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 196
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-3.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 197
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(2.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 198
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(1.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 199
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(0.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 200
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-1.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 202
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-2.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 203
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-3.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 204
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(2.5F, 9F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 205
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(1.5F, 9F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 206
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(0.5F, 9F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 207
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-1.5F, 9F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 209
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-2.5F, 9F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 210
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-3.5F, 9F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 211
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(2.5F, 10F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 212
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(1.5F, 10F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 213
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(0.5F, 10F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 214
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-1.5F, 10F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 216
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-2.5F, 10F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 217
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-3.5F, 10F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 218
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(2.5F, 10F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 219
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(1.5F, 10F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 220
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(0.5F, 10F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 221
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-1.5F, 10F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 223
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-2.5F, 10F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 224
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-3.5F, 10F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 225
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(2.5F, 9F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 226
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(1.5F, 9F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 227
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(0.5F, 9F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 228
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-1.5F, 9F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 230
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-2.5F, 9F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 231
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-3.5F, 9F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 232
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(2.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 233
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(1.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 234
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(0.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 235
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-1.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 237
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-2.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 238
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-3.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 239
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-3.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 240
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-2.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 241
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-3.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 242
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-2.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 243
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-1.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 244
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-1.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 245
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(0.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 248
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(0.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 249
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(1.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 250
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(1.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 251
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(2.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 252
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(2.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 253
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(-2.5F, 1.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 255
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-1.5F, 1.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 256
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(0.5F, 1.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 258
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(1.5F, 1.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 259
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-4.3F, 5.5F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 261
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(-4.3F, 5.5F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 262
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(-4.3F, 5.5F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 263
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(-4.3F, 5.5F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 264
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(3.3F, 5.5F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 269
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(3.3F, 5.5F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 277
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(3.3F, 5.5F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 278
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(3.3F, 5.5F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 279
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(-3.5F, 0F, 1.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 1F, 0F, -0.05F, 1F, 0F, -0.05F, 1F, 0F, -0.05F, 1F, 0F); // Box 280
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(-3.5F, -0.2F, 1.4F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F); // Box 281
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(2.5F, -0.2F, 1.4F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F, -0.05F, -0.8F, 0F); // Box 282
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(2.5F, 0F, 1.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 1F, 0F, -0.05F, 1F, 0F, -0.05F, 1F, 0F, -0.05F, 1F, 0F); // Box 283
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(-4.5F, 6F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 286
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(-4.5F, 7F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 287
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(3.5F, 6F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 288
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(3.5F, 7F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 289
		bodyModel[152].setRotationPoint(0F, 0F, 0F);

		bodyModel[153].addShapeBox(3.5F, 7F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 290
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(3.5F, 6F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 291
		bodyModel[154].setRotationPoint(0F, 0F, 0F);

		bodyModel[155].addShapeBox(-4.5F, 7F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 292
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(-4.5F, 6F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 293
		bodyModel[156].setRotationPoint(0F, 0F, 0F);

		bodyModel[157].addShapeBox(-4.6F, 7F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 294
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addShapeBox(-4.6F, 6F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 295
		bodyModel[158].setRotationPoint(0F, 0F, 0F);

		bodyModel[159].addShapeBox(-4.6F, 7F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 296
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(-4.6F, 6F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 297
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(-4.6F, 7F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 298
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addShapeBox(-4.6F, 6F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 299
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addShapeBox(3.6F, 7F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 300
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(3.6F, 6F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 301
		bodyModel[164].setRotationPoint(0F, 0F, 0F);

		bodyModel[165].addShapeBox(3.6F, 7F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 302
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addShapeBox(3.6F, 6F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 303
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(3.6F, 7F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 304
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(3.6F, 6F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 305
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(-5F, 11.4F, -2.5F, 10, 1, 5, 0F,-0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 291
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(3.3F, 8.5F, 1F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 292
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(3.3F, 8.5F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 293
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(3.3F, 8.5F, -1F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 294
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(3.3F, 8.5F, -2F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 295
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(-4.3F, 8.5F, 1F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 296
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(-4.3F, 8.5F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 297
		bodyModel[175].setRotationPoint(0F, 0F, 0F);

		bodyModel[176].addShapeBox(-4.3F, 8.5F, -1F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 298
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(-4.3F, 8.5F, -2F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 299
		bodyModel[177].setRotationPoint(0F, 0F, 0F);

		bodyModel[178].addShapeBox(-4.6F, 10F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 301
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(-4.6F, 9F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 302
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(-4.6F, 9F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 303
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(-4.6F, 10F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 304
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(-4.6F, 10F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 305
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(-4.6F, 9F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 306
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(-4.5F, 9F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 307
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addShapeBox(-4.5F, 10F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 308
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(-4.5F, 9F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 309
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(-4.5F, 10F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 310
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(3.6F, 9F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 311
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addShapeBox(3.6F, 10F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 312
		bodyModel[189].setRotationPoint(0F, 0F, 0F);

		bodyModel[190].addShapeBox(3.6F, 9F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 313
		bodyModel[190].setRotationPoint(0F, 0F, 0F);

		bodyModel[191].addShapeBox(3.5F, 9F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 314
		bodyModel[191].setRotationPoint(0F, 0F, 0F);

		bodyModel[192].addShapeBox(3.5F, 10F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 315
		bodyModel[192].setRotationPoint(0F, 0F, 0F);

		bodyModel[193].addShapeBox(3.6F, 10F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 316
		bodyModel[193].setRotationPoint(0F, 0F, 0F);

		bodyModel[194].addShapeBox(3.6F, 10F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 317
		bodyModel[194].setRotationPoint(0F, 0F, 0F);

		bodyModel[195].addShapeBox(3.6F, 9F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 318
		bodyModel[195].setRotationPoint(0F, 0F, 0F);

		bodyModel[196].addShapeBox(3.5F, 9F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 319
		bodyModel[196].setRotationPoint(0F, 0F, 0F);

		bodyModel[197].addShapeBox(3.5F, 10F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 320
		bodyModel[197].setRotationPoint(0F, 0F, 0F);

		bodyModel[198].addShapeBox(-0.5F, 2F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 0
		bodyModel[198].setRotationPoint(0F, 0F, 0F);

		bodyModel[199].addShapeBox(-0.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 1
		bodyModel[199].setRotationPoint(0F, 0F, 0F);

		bodyModel[200].addShapeBox(-0.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 2
		bodyModel[200].setRotationPoint(0F, 0F, 0F);

		bodyModel[201].addShapeBox(-0.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 3
		bodyModel[201].setRotationPoint(0F, 0F, 0F);

		bodyModel[202].addShapeBox(-0.5F, 1.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 4
		bodyModel[202].setRotationPoint(0F, 0F, 0F);

		bodyModel[203].addShapeBox(-0.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 5
		bodyModel[203].setRotationPoint(0F, 0F, 0F);

		bodyModel[204].addShapeBox(-0.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 6
		bodyModel[204].setRotationPoint(0F, 0F, 0F);

		bodyModel[205].addShapeBox(-0.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 7
		bodyModel[205].setRotationPoint(0F, 0F, 0F);

		bodyModel[206].addShapeBox(-3F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 8
		bodyModel[206].setRotationPoint(0F, 0F, 0F);

		bodyModel[207].addShapeBox(2F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 9
		bodyModel[207].setRotationPoint(0F, 0F, 0F);

		bodyModel[208].addShapeBox(1.5F, 2F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 10
		bodyModel[208].setRotationPoint(0F, 0F, 0F);

		bodyModel[209].addShapeBox(-2.5F, 2F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 11
		bodyModel[209].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 475
		leftArmModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 476
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 477
		leftArmModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 478
		leftArmModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 479
		leftArmModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 480
		leftArmModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 481
		leftArmModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 482
		leftArmModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 483
		leftArmModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 484
		leftArmModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 485
		leftArmModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 486
		leftArmModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 487
		leftArmModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 488
		leftArmModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 489
		leftArmModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 490
		leftArmModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 491
		leftArmModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 492
		leftArmModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 493
		leftArmModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 494
		leftArmModel[21] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 495
		leftArmModel[22] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 496
		leftArmModel[23] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 497
		leftArmModel[24] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 498
		leftArmModel[25] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 499
		leftArmModel[26] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 500
		leftArmModel[27] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 501
		leftArmModel[28] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 502
		leftArmModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 503
		leftArmModel[30] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 504
		leftArmModel[31] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 505
		leftArmModel[32] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 506
		leftArmModel[33] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 507
		leftArmModel[34] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 508
		leftArmModel[35] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 509
		leftArmModel[36] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 510
		leftArmModel[37] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 511
		leftArmModel[38] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 512
		leftArmModel[39] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 513
		leftArmModel[40] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 514
		leftArmModel[41] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 515
		leftArmModel[42] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 516
		leftArmModel[43] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 517
		leftArmModel[44] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 518
		leftArmModel[45] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 519
		leftArmModel[46] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 520
		leftArmModel[47] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 521
		leftArmModel[48] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 522
		leftArmModel[49] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 523
		leftArmModel[50] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 524
		leftArmModel[51] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 525
		leftArmModel[52] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 526

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(1.5F, 2.5F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 475
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(0.5F, 2.5F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 476
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.5F, 2.5F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 477
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.5F, 1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 478
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0.5F, 1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 479
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(1.5F, 1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 480
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(1.5F, -1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 481
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(0.5F, -1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 482
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-0.5F, -1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 483
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(2.5F, 1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 484
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2.5F, -1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 485
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(2.5F, 2.5F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 486
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(2F, -2F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 487
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(1F, -2F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 488
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-1F, -2F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 489
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(0F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 490
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(0F, -2F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 491
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(-1F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 492
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(1F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 493
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(2F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 494
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(2F, 2F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 495
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(1F, 2F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 496
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(0F, 2F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 497
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(-1F, 2F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 498
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(-1F, -2F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 499
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(-1F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 500
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(-1F, 2F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 501
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(0F, 2F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 502
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(0F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 503
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(0F, -2F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 504
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(1F, -2F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 505
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(2F, -2F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 506
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);

		leftArmModel[33].addShapeBox(2F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 507
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);

		leftArmModel[34].addShapeBox(1F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 508
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);

		leftArmModel[35].addShapeBox(1F, 2F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 509
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);

		leftArmModel[36].addShapeBox(2F, 2F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 510
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);

		leftArmModel[37].addShapeBox(2.7F, 2F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 511
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);

		leftArmModel[38].addShapeBox(2.7F, -2F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 512
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);

		leftArmModel[39].addShapeBox(2.7F, 0F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 513
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);

		leftArmModel[40].addShapeBox(2.7F, 0F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 514
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);

		leftArmModel[41].addShapeBox(2.7F, -2F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 515
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);

		leftArmModel[42].addShapeBox(2.7F, -2F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 516
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);

		leftArmModel[43].addShapeBox(2.7F, -2F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 517
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);

		leftArmModel[44].addShapeBox(2.7F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 518
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);

		leftArmModel[45].addShapeBox(2.7F, 0F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 519
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);

		leftArmModel[46].addShapeBox(2.7F, 2F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 520
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);

		leftArmModel[47].addShapeBox(2.7F, 2F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 521
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);

		leftArmModel[48].addShapeBox(2.7F, 2F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 522
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);

		leftArmModel[49].addShapeBox(-0.7F, -2.7F, -2F, 1, 3, 1, 0F,0F, -0.2F, -0.05F, 3F, 0F, -0.05F, 3F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -2F, -0.05F, 2.8F, -2F, -0.05F, 2.8F, -2F, -0.05F, 0F, -2F, -0.05F); // Box 523
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);

		leftArmModel[50].addShapeBox(-0.7F, -2.7F, -1F, 1, 3, 1, 0F,0F, -0.2F, -0.05F, 3F, 0F, -0.05F, 3F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -2F, -0.05F, 2.8F, -2F, -0.05F, 2.8F, -2F, -0.05F, 0F, -2F, -0.05F); // Box 524
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);

		leftArmModel[51].addShapeBox(-0.7F, -2.7F, 0F, 1, 3, 1, 0F,0F, -0.2F, -0.05F, 3F, 0F, -0.05F, 3F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -2F, -0.05F, 2.8F, -2F, -0.05F, 2.8F, -2F, -0.05F, 0F, -2F, -0.05F); // Box 525
		leftArmModel[51].setRotationPoint(0F, 0F, 0F);

		leftArmModel[52].addShapeBox(-0.7F, -2.7F, 1F, 1, 3, 1, 0F,0F, -0.2F, -0.05F, 3F, 0F, -0.05F, 3F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -2F, -0.05F, 2.8F, -2F, -0.05F, 2.8F, -2F, -0.05F, 0F, -2F, -0.05F); // Box 526
		leftArmModel[52].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 430
		rightArmModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 431
		rightArmModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 432
		rightArmModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 433
		rightArmModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 434
		rightArmModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 435
		rightArmModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 436
		rightArmModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 437
		rightArmModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 438
		rightArmModel[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 439
		rightArmModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 440
		rightArmModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 441
		rightArmModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 442
		rightArmModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 443
		rightArmModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 444
		rightArmModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 445
		rightArmModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 446
		rightArmModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 447
		rightArmModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 448
		rightArmModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 449
		rightArmModel[21] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 450
		rightArmModel[22] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 451
		rightArmModel[23] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 452
		rightArmModel[24] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 453
		rightArmModel[25] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 454
		rightArmModel[26] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 455
		rightArmModel[27] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 456
		rightArmModel[28] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 457
		rightArmModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 458
		rightArmModel[30] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 459
		rightArmModel[31] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 460
		rightArmModel[32] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 461
		rightArmModel[33] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 462
		rightArmModel[34] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 463
		rightArmModel[35] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 464
		rightArmModel[36] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 465
		rightArmModel[37] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 466
		rightArmModel[38] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 467
		rightArmModel[39] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 468
		rightArmModel[40] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 469
		rightArmModel[41] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 470
		rightArmModel[42] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 471
		rightArmModel[43] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 472
		rightArmModel[44] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 473
		rightArmModel[45] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 474
		rightArmModel[46] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 527
		rightArmModel[47] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 528
		rightArmModel[48] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 529
		rightArmModel[49] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 530

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1F, 2F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 430
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(0F, 2F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 431
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-2F, 2F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 432
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 2F, -2.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 433
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 434
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, -2F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 435
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-2F, -2F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 436
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-2F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 437
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-1F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 438
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-1F, -2F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 439
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(0F, -2F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 440
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(0F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 441
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-1F, 2F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 442
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(0F, 2F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 443
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-2F, 2F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 444
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3F, 2F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 445
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 446
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-3F, -2F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 447
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-2F, -2F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 448
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-2F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 449
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-1F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 450
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-1F, -2F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 451
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(0F, -2F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 452
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(0F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 453
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(-3.7F, 2F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 454
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(-3.7F, 2F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 455
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);

		rightArmModel[27].addShapeBox(-3.7F, 2F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 456
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(-3.7F, 2F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 457
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(-3.7F, 0F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 458
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);

		rightArmModel[30].addShapeBox(-3.7F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 459
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);

		rightArmModel[31].addShapeBox(-3.7F, 0F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 460
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);

		rightArmModel[32].addShapeBox(-3.7F, 0F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 461
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);

		rightArmModel[33].addShapeBox(-3.7F, -2F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 462
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);

		rightArmModel[34].addShapeBox(-3.7F, -2F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 463
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);

		rightArmModel[35].addShapeBox(-3.7F, -2F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 464
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);

		rightArmModel[36].addShapeBox(-3.7F, -2F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 465
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);

		rightArmModel[37].addShapeBox(-2.5F, 1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 466
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);

		rightArmModel[38].addShapeBox(-1.5F, 1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 467
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);

		rightArmModel[39].addShapeBox(-0.5F, 1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 468
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);

		rightArmModel[40].addShapeBox(-0.5F, -1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 469
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);

		rightArmModel[41].addShapeBox(-1.5F, -1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 470
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);

		rightArmModel[42].addShapeBox(-2.5F, -1F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 471
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);

		rightArmModel[43].addShapeBox(-0.5F, 2.5F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 472
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);

		rightArmModel[44].addShapeBox(-1.5F, 2.5F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 473
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);

		rightArmModel[45].addShapeBox(-2.5F, 2.5F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 4.3F, -0.3F, -0.4F, 4.3F); // Box 474
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);

		rightArmModel[46].addShapeBox(-0.3F, -2.7F, 1F, 1, 3, 1, 0F,3F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 3F, 0F, -0.05F, 2.8F, -2F, -0.05F, 0F, -2F, -0.05F, 0F, -2F, -0.05F, 2.8F, -2F, -0.05F); // Box 527
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);

		rightArmModel[47].addShapeBox(-0.3F, -2.7F, 0F, 1, 3, 1, 0F,3F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 3F, 0F, -0.05F, 2.8F, -2F, -0.05F, 0F, -2F, -0.05F, 0F, -2F, -0.05F, 2.8F, -2F, -0.05F); // Box 528
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);

		rightArmModel[48].addShapeBox(-0.3F, -2.7F, -1F, 1, 3, 1, 0F,3F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 3F, 0F, -0.05F, 2.8F, -2F, -0.05F, 0F, -2F, -0.05F, 0F, -2F, -0.05F, 2.8F, -2F, -0.05F); // Box 529
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);

		rightArmModel[49].addShapeBox(-0.3F, -2.7F, -2F, 1, 3, 1, 0F,3F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 3F, 0F, -0.05F, 2.8F, -2F, -0.05F, 0F, -2F, -0.05F, 0F, -2F, -0.05F, 2.8F, -2F, -0.05F); // Box 530
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 23
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 355
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 356
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 357
		leftLegModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 358
		leftLegModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 359
		leftLegModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 360
		leftLegModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 361
		leftLegModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 362
		leftLegModel[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 363
		leftLegModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 364
		leftLegModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 384
		leftLegModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 385
		leftLegModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 386
		leftLegModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 387
		leftLegModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 388
		leftLegModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 389
		leftLegModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 390
		leftLegModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 391
		leftLegModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 392
		leftLegModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 393
		leftLegModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 394
		leftLegModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 395
		leftLegModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 396
		leftLegModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 397
		leftLegModel[26] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 408
		leftLegModel[27] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 409
		leftLegModel[28] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 410
		leftLegModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 411
		leftLegModel[30] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 412
		leftLegModel[31] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 413
		leftLegModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 418
		leftLegModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 419
		leftLegModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 420
		leftLegModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 421
		leftLegModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 426
		leftLegModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 427
		leftLegModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 428
		leftLegModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 429
		leftLegModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 549
		leftLegModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 550
		leftLegModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 551
		leftLegModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 552
		leftLegModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 553
		leftLegModel[45] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 554
		leftLegModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 555
		leftLegModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 556
		leftLegModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 557
		leftLegModel[49] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 558
		leftLegModel[50] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 559
		leftLegModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 560
		leftLegModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 561
		leftLegModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 562
		leftLegModel[54] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 563
		leftLegModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 564
		leftLegModel[56] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 565
		leftLegModel[57] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 566
		leftLegModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 567
		leftLegModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 568
		leftLegModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 569
		leftLegModel[61] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 570
		leftLegModel[62] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 571
		leftLegModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 572

		leftLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 23
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1.5F, -0.5F, -2.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 355
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(1.7F, 2.5F, -2.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 356
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(1.5F, -0.5F, -1.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 357
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(1.7F, 2.5F, -1.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 358
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(1.7F, 2.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 359
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(1.5F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 360
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(1.5F, -0.5F, 0.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 361
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(1.7F, 2.5F, 0.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 362
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(1.7F, 2.5F, 1.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 363
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(1.5F, -0.5F, 1.5F, 1, 3, 1, 0F,0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 364
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(1F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 384
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(-1F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 385
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(-0.8F, 2.5F, -2.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 386
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);

		leftLegModel[15].addShapeBox(0.2F, 2.5F, -2.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 387
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);

		leftLegModel[16].addShapeBox(1.2F, 2.5F, -2.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 388
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);

		leftLegModel[17].addShapeBox(0F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 389
		leftLegModel[17].setRotationPoint(0F, 0F, 0F);

		leftLegModel[18].addShapeBox(0.5F, 0.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 390
		leftLegModel[18].setRotationPoint(0F, 0F, 0F);

		leftLegModel[19].addShapeBox(0.5F, 1.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 391
		leftLegModel[19].setRotationPoint(0F, 0F, 0F);

		leftLegModel[20].addShapeBox(-0.5F, 1.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 392
		leftLegModel[20].setRotationPoint(0F, 0F, 0F);

		leftLegModel[21].addShapeBox(-0.5F, 0.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 393
		leftLegModel[21].setRotationPoint(0F, 0F, 0F);

		leftLegModel[22].addShapeBox(-0.3F, 3F, -3F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 394
		leftLegModel[22].setRotationPoint(0F, 0F, 0F);

		leftLegModel[23].addShapeBox(-0.3F, 4F, -3F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 395
		leftLegModel[23].setRotationPoint(0F, 0F, 0F);

		leftLegModel[24].addShapeBox(0.7F, 4F, -3F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 396
		leftLegModel[24].setRotationPoint(0F, 0F, 0F);

		leftLegModel[25].addShapeBox(0.7F, 3F, -3F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 397
		leftLegModel[25].setRotationPoint(0F, 0F, 0F);

		leftLegModel[26].addShapeBox(-1F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 408
		leftLegModel[26].setRotationPoint(0F, 0F, 0F);

		leftLegModel[27].addShapeBox(0F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 409
		leftLegModel[27].setRotationPoint(0F, 0F, 0F);

		leftLegModel[28].addShapeBox(1F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 410
		leftLegModel[28].setRotationPoint(0F, 0F, 0F);

		leftLegModel[29].addShapeBox(1.2F, 2.5F, 1.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 411
		leftLegModel[29].setRotationPoint(0F, 0F, 0F);

		leftLegModel[30].addShapeBox(0.2F, 2.5F, 1.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 412
		leftLegModel[30].setRotationPoint(0F, 0F, 0F);

		leftLegModel[31].addShapeBox(-0.8F, 2.5F, 1.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 413
		leftLegModel[31].setRotationPoint(0F, 0F, 0F);

		leftLegModel[32].addShapeBox(-0.5F, 1.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 418
		leftLegModel[32].setRotationPoint(0F, 0F, 0F);

		leftLegModel[33].addShapeBox(-0.5F, 0.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 419
		leftLegModel[33].setRotationPoint(0F, 0F, 0F);

		leftLegModel[34].addShapeBox(0.5F, 0.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 420
		leftLegModel[34].setRotationPoint(0F, 0F, 0F);

		leftLegModel[35].addShapeBox(0.5F, 1.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 421
		leftLegModel[35].setRotationPoint(0F, 0F, 0F);

		leftLegModel[36].addShapeBox(-0.3F, 3F, 2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 426
		leftLegModel[36].setRotationPoint(0F, 0F, 0F);

		leftLegModel[37].addShapeBox(-0.3F, 4F, 2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 427
		leftLegModel[37].setRotationPoint(0F, 0F, 0F);

		leftLegModel[38].addShapeBox(0.7F, 4F, 2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 428
		leftLegModel[38].setRotationPoint(0F, 0F, 0F);

		leftLegModel[39].addShapeBox(0.7F, 3F, 2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 429
		leftLegModel[39].setRotationPoint(0F, 0F, 0F);

		leftLegModel[40].addShapeBox(1.85F, 1F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 549
		leftLegModel[40].setRotationPoint(0F, 0F, 0F);

		leftLegModel[41].addShapeBox(1.75F, 1F, 1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 550
		leftLegModel[41].setRotationPoint(0F, 0F, 0F);

		leftLegModel[42].addShapeBox(1.75F, 1F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 551
		leftLegModel[42].setRotationPoint(0F, 0F, 0F);

		leftLegModel[43].addShapeBox(1.75F, 1F, -1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 552
		leftLegModel[43].setRotationPoint(0F, 0F, 0F);

		leftLegModel[44].addShapeBox(1.85F, 1F, -2.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 553
		leftLegModel[44].setRotationPoint(0F, 0F, 0F);

		leftLegModel[45].addShapeBox(1.85F, 1F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 554
		leftLegModel[45].setRotationPoint(0F, 0F, 0F);

		leftLegModel[46].addShapeBox(1.85F, 2F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 555
		leftLegModel[46].setRotationPoint(0F, 0F, 0F);

		leftLegModel[47].addShapeBox(1.85F, 2F, -2.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 556
		leftLegModel[47].setRotationPoint(0F, 0F, 0F);

		leftLegModel[48].addShapeBox(1.95F, 2F, -1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 557
		leftLegModel[48].setRotationPoint(0F, 0F, 0F);

		leftLegModel[49].addShapeBox(1.95F, 2F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 558
		leftLegModel[49].setRotationPoint(0F, 0F, 0F);

		leftLegModel[50].addShapeBox(1.95F, 2F, 1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 559
		leftLegModel[50].setRotationPoint(0F, 0F, 0F);

		leftLegModel[51].addShapeBox(1.85F, 2F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 560
		leftLegModel[51].setRotationPoint(0F, 0F, 0F);

		leftLegModel[52].addShapeBox(2.2F, 4F, -1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 561
		leftLegModel[52].setRotationPoint(0F, 0F, 0F);

		leftLegModel[53].addShapeBox(2.2F, 4F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 562
		leftLegModel[53].setRotationPoint(0F, 0F, 0F);

		leftLegModel[54].addShapeBox(2.2F, 4F, 1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 563
		leftLegModel[54].setRotationPoint(0F, 0F, 0F);

		leftLegModel[55].addShapeBox(2.1F, 3F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 564
		leftLegModel[55].setRotationPoint(0F, 0F, 0F);

		leftLegModel[56].addShapeBox(2.1F, 4F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 565
		leftLegModel[56].setRotationPoint(0F, 0F, 0F);

		leftLegModel[57].addShapeBox(2.1F, 3F, -2.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 566
		leftLegModel[57].setRotationPoint(0F, 0F, 0F);

		leftLegModel[58].addShapeBox(2.1F, 4F, -2.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 567
		leftLegModel[58].setRotationPoint(0F, 0F, 0F);

		leftLegModel[59].addShapeBox(2.1F, 3F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 568
		leftLegModel[59].setRotationPoint(0F, 0F, 0F);

		leftLegModel[60].addShapeBox(2.1F, 4F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 569
		leftLegModel[60].setRotationPoint(0F, 0F, 0F);

		leftLegModel[61].addShapeBox(2F, 3F, 1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 570
		leftLegModel[61].setRotationPoint(0F, 0F, 0F);

		leftLegModel[62].addShapeBox(2F, 3F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 571
		leftLegModel[62].setRotationPoint(0F, 0F, 0F);

		leftLegModel[63].addShapeBox(2F, 3F, -1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 572
		leftLegModel[63].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 321
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 322
		rightLegModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 323
		rightLegModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 324
		rightLegModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 325
		rightLegModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 326
		rightLegModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 327
		rightLegModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 328
		rightLegModel[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 329
		rightLegModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 330
		rightLegModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 331
		rightLegModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 332
		rightLegModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 333
		rightLegModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 334
		rightLegModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 335
		rightLegModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 336
		rightLegModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 337
		rightLegModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 338
		rightLegModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 339
		rightLegModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 340
		rightLegModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 341
		rightLegModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 342
		rightLegModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 343
		rightLegModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 344
		rightLegModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 345
		rightLegModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 346
		rightLegModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 347
		rightLegModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 348
		rightLegModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 349
		rightLegModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 350
		rightLegModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 351
		rightLegModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 352
		rightLegModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 353
		rightLegModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 354
		rightLegModel[36] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 366
		rightLegModel[37] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 367
		rightLegModel[38] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 368
		rightLegModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 369
		rightLegModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 370
		rightLegModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 371
		rightLegModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 372
		rightLegModel[43] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 375
		rightLegModel[44] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 376
		rightLegModel[45] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 377
		rightLegModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 378
		rightLegModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 379
		rightLegModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 380
		rightLegModel[49] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 381
		rightLegModel[50] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 402
		rightLegModel[51] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 403
		rightLegModel[52] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 404
		rightLegModel[53] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 405
		rightLegModel[54] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 406
		rightLegModel[55] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 407
		rightLegModel[56] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 414
		rightLegModel[57] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 415
		rightLegModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 416
		rightLegModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 417
		rightLegModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 422
		rightLegModel[61] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 423
		rightLegModel[62] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 424
		rightLegModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 425

		rightLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.5F, -0.5F, 1.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 321
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, -0.5F, 0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 322
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.5F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 323
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.5F, -0.5F, -1.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 324
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.5F, -0.5F, -2.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 325
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.7F, 2.5F, -2.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 326
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.7F, 2.5F, -1.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 327
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2.7F, 2.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 328
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2.7F, 2.5F, 0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 329
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2.7F, 2.5F, 1.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 330
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-2.85F, 2F, -2.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 331
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-2.85F, 1F, -2.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 332
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-2.95F, 1F, -1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 333
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);

		rightLegModel[15].addShapeBox(-2.95F, 2F, -1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 334
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);

		rightLegModel[16].addShapeBox(-2.95F, 2F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 335
		rightLegModel[16].setRotationPoint(0F, 0F, 0F);

		rightLegModel[17].addShapeBox(-2.95F, 1F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 336
		rightLegModel[17].setRotationPoint(0F, 0F, 0F);

		rightLegModel[18].addShapeBox(-2.95F, 1F, 1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 337
		rightLegModel[18].setRotationPoint(0F, 0F, 0F);

		rightLegModel[19].addShapeBox(-2.95F, 2F, 1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 338
		rightLegModel[19].setRotationPoint(0F, 0F, 0F);

		rightLegModel[20].addShapeBox(-2.85F, 2F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 339
		rightLegModel[20].setRotationPoint(0F, 0F, 0F);

		rightLegModel[21].addShapeBox(-2.85F, 1F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 340
		rightLegModel[21].setRotationPoint(0F, 0F, 0F);

		rightLegModel[22].addShapeBox(-2.85F, 2F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 341
		rightLegModel[22].setRotationPoint(0F, 0F, 0F);

		rightLegModel[23].addShapeBox(-2.85F, 1F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 342
		rightLegModel[23].setRotationPoint(0F, 0F, 0F);

		rightLegModel[24].addShapeBox(-3F, 4.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 343
		rightLegModel[24].setRotationPoint(0F, 0F, 0F);

		rightLegModel[25].addShapeBox(-3F, 3.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 344
		rightLegModel[25].setRotationPoint(0F, 0F, 0F);

		rightLegModel[26].addShapeBox(-3.1F, 3.5F, 1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 345
		rightLegModel[26].setRotationPoint(0F, 0F, 0F);

		rightLegModel[27].addShapeBox(-3.1F, 4.5F, 1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 346
		rightLegModel[27].setRotationPoint(0F, 0F, 0F);

		rightLegModel[28].addShapeBox(-3.1F, 3.5F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 347
		rightLegModel[28].setRotationPoint(0F, 0F, 0F);

		rightLegModel[29].addShapeBox(-3.1F, 4.5F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 348
		rightLegModel[29].setRotationPoint(0F, 0F, 0F);

		rightLegModel[30].addShapeBox(-3.1F, 3.5F, -1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 349
		rightLegModel[30].setRotationPoint(0F, 0F, 0F);

		rightLegModel[31].addShapeBox(-3.1F, 4.5F, -1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 350
		rightLegModel[31].setRotationPoint(0F, 0F, 0F);

		rightLegModel[32].addShapeBox(-3F, 4.5F, -2.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 351
		rightLegModel[32].setRotationPoint(0F, 0F, 0F);

		rightLegModel[33].addShapeBox(-3F, 3.5F, -2.1F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 352
		rightLegModel[33].setRotationPoint(0F, 0F, 0F);

		rightLegModel[34].addShapeBox(-3F, 3.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 353
		rightLegModel[34].setRotationPoint(0F, 0F, 0F);

		rightLegModel[35].addShapeBox(-3F, 4.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 354
		rightLegModel[35].setRotationPoint(0F, 0F, 0F);

		rightLegModel[36].addShapeBox(-2F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 366
		rightLegModel[36].setRotationPoint(0F, 0F, 0F);

		rightLegModel[37].addShapeBox(0F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 367
		rightLegModel[37].setRotationPoint(0F, 0F, 0F);

		rightLegModel[38].addShapeBox(-1F, 0F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 368
		rightLegModel[38].setRotationPoint(0F, 0F, 0F);

		rightLegModel[39].addShapeBox(-1.5F, 0.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 369
		rightLegModel[39].setRotationPoint(0F, 0F, 0F);

		rightLegModel[40].addShapeBox(-1.5F, 1.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 370
		rightLegModel[40].setRotationPoint(0F, 0F, 0F);

		rightLegModel[41].addShapeBox(-0.5F, 1.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 371
		rightLegModel[41].setRotationPoint(0F, 0F, 0F);

		rightLegModel[42].addShapeBox(-0.5F, 0.5F, -2.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 372
		rightLegModel[42].setRotationPoint(0F, 0F, 0F);

		rightLegModel[43].addShapeBox(-2.2F, 2.5F, -2.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 375
		rightLegModel[43].setRotationPoint(0F, 0F, 0F);

		rightLegModel[44].addShapeBox(-0.2F, 2.5F, -2.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 376
		rightLegModel[44].setRotationPoint(0F, 0F, 0F);

		rightLegModel[45].addShapeBox(-1.2F, 2.5F, -2.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 377
		rightLegModel[45].setRotationPoint(0F, 0F, 0F);

		rightLegModel[46].addShapeBox(-1.7F, 3F, -3F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 378
		rightLegModel[46].setRotationPoint(0F, 0F, 0F);

		rightLegModel[47].addShapeBox(-1.7F, 4F, -3F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 379
		rightLegModel[47].setRotationPoint(0F, 0F, 0F);

		rightLegModel[48].addShapeBox(-0.7F, 4F, -3F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 380
		rightLegModel[48].setRotationPoint(0F, 0F, 0F);

		rightLegModel[49].addShapeBox(-0.7F, 3F, -3F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 381
		rightLegModel[49].setRotationPoint(0F, 0F, 0F);

		rightLegModel[50].addShapeBox(0F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 402
		rightLegModel[50].setRotationPoint(0F, 0F, 0F);

		rightLegModel[51].addShapeBox(-1F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 403
		rightLegModel[51].setRotationPoint(0F, 0F, 0F);

		rightLegModel[52].addShapeBox(-2F, 0F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 404
		rightLegModel[52].setRotationPoint(0F, 0F, 0F);

		rightLegModel[53].addShapeBox(-2.2F, 2.5F, 1.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 405
		rightLegModel[53].setRotationPoint(0F, 0F, 0F);

		rightLegModel[54].addShapeBox(-1.2F, 2.5F, 1.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 406
		rightLegModel[54].setRotationPoint(0F, 0F, 0F);

		rightLegModel[55].addShapeBox(-0.2F, 2.5F, 1.6F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 407
		rightLegModel[55].setRotationPoint(0F, 0F, 0F);

		rightLegModel[56].addShapeBox(-1.5F, 0.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 414
		rightLegModel[56].setRotationPoint(0F, 0F, 0F);

		rightLegModel[57].addShapeBox(-0.5F, 0.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 415
		rightLegModel[57].setRotationPoint(0F, 0F, 0F);

		rightLegModel[58].addShapeBox(-0.5F, 1.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 416
		rightLegModel[58].setRotationPoint(0F, 0F, 0F);

		rightLegModel[59].addShapeBox(-1.5F, 1.5F, 1.9F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 417
		rightLegModel[59].setRotationPoint(0F, 0F, 0F);

		rightLegModel[60].addShapeBox(-1.7F, 3F, 2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 422
		rightLegModel[60].setRotationPoint(0F, 0F, 0F);

		rightLegModel[61].addShapeBox(-0.7F, 3F, 2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 423
		rightLegModel[61].setRotationPoint(0F, 0F, 0F);

		rightLegModel[62].addShapeBox(-0.7F, 4F, 2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 424
		rightLegModel[62].setRotationPoint(0F, 0F, 0F);

		rightLegModel[63].addShapeBox(-1.7F, 4F, 2F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 425
		rightLegModel[63].setRotationPoint(0F, 0F, 0F);
	}
}