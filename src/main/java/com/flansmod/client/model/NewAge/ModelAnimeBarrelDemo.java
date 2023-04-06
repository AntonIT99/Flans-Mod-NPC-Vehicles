//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 01.02.2021 - 12:59:56
// Last changed on: 01.02.2021 - 12:59:56

package com.flansmod.client.model.NewAge; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelAnimeBarrelDemo extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelAnimeBarrelDemo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[358];
		turretModel = new ModelRendererTurbo[309];
		barrelModel = new ModelRendererTurbo[16];
		leftTrackWheelModels = new ModelRendererTurbo[24];
		rightTrackWheelModels = new ModelRendererTurbo[24];
		fancyTrackModel = new ModelRendererTurbo[13];
		trailerModel = new ModelRendererTurbo[64];
		animBarrelModel = new ModelRendererTurbo[45];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initfancyTrackModel_1();
		inittrailerModel_1();
		initanimBarrelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 50
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 51
		bodyModel[3] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 54
		bodyModel[6] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 55
		bodyModel[7] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 56
		bodyModel[8] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 122
		bodyModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 123
		bodyModel[10] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 124
		bodyModel[11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 125
		bodyModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 126
		bodyModel[13] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 127
		bodyModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 128
		bodyModel[15] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 129
		bodyModel[16] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 130
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 131
		bodyModel[18] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 132
		bodyModel[19] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 133
		bodyModel[20] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 134
		bodyModel[21] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 135
		bodyModel[22] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 136
		bodyModel[23] = new ModelRendererTurbo(this, 849, 9, textureX, textureY); // Box 137
		bodyModel[24] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 138
		bodyModel[25] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 139
		bodyModel[26] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 140
		bodyModel[27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 141
		bodyModel[28] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 142
		bodyModel[29] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 143
		bodyModel[30] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 144
		bodyModel[31] = new ModelRendererTurbo(this, 881, 9, textureX, textureY); // Box 145
		bodyModel[32] = new ModelRendererTurbo(this, 633, 9, textureX, textureY); // Box 146
		bodyModel[33] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 147
		bodyModel[34] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 148
		bodyModel[35] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 149
		bodyModel[36] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 151
		bodyModel[37] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 152
		bodyModel[38] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 153
		bodyModel[39] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 154
		bodyModel[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 155
		bodyModel[41] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 156
		bodyModel[42] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 157
		bodyModel[43] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 158
		bodyModel[44] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 159
		bodyModel[45] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 160
		bodyModel[46] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 161
		bodyModel[47] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 163
		bodyModel[48] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 167
		bodyModel[49] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 168
		bodyModel[50] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 169
		bodyModel[51] = new ModelRendererTurbo(this, 833, 49, textureX, textureY); // Box 170
		bodyModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 171
		bodyModel[53] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 172
		bodyModel[54] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 173
		bodyModel[55] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 174
		bodyModel[56] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 175
		bodyModel[57] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 176
		bodyModel[58] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 179
		bodyModel[59] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 180
		bodyModel[60] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 181
		bodyModel[61] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 182
		bodyModel[62] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 183
		bodyModel[63] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 184
		bodyModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 185
		bodyModel[65] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 186
		bodyModel[66] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 187
		bodyModel[67] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 188
		bodyModel[68] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 189
		bodyModel[69] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 190
		bodyModel[70] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 191
		bodyModel[71] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 192
		bodyModel[72] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 193
		bodyModel[73] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 194
		bodyModel[74] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 195
		bodyModel[75] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 196
		bodyModel[76] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 197
		bodyModel[77] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 198
		bodyModel[78] = new ModelRendererTurbo(this, 993, 65, textureX, textureY); // Box 199
		bodyModel[79] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 200
		bodyModel[80] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 201
		bodyModel[81] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 202
		bodyModel[82] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 203
		bodyModel[83] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 204
		bodyModel[84] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 205
		bodyModel[85] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 206
		bodyModel[86] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 207
		bodyModel[87] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 208
		bodyModel[88] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 209
		bodyModel[89] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 210
		bodyModel[90] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 211
		bodyModel[91] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 212
		bodyModel[92] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 213
		bodyModel[93] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 214
		bodyModel[94] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 215
		bodyModel[95] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 216
		bodyModel[96] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 217
		bodyModel[97] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 218
		bodyModel[98] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 219
		bodyModel[99] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 220
		bodyModel[100] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 221
		bodyModel[101] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 222
		bodyModel[102] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 223
		bodyModel[103] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 224
		bodyModel[104] = new ModelRendererTurbo(this, 825, 49, textureX, textureY); // Box 225
		bodyModel[105] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 226
		bodyModel[106] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 227
		bodyModel[107] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 228
		bodyModel[108] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Box 229
		bodyModel[109] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 231
		bodyModel[110] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 232
		bodyModel[111] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 233
		bodyModel[112] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 234
		bodyModel[113] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 235
		bodyModel[114] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 236
		bodyModel[115] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 237
		bodyModel[116] = new ModelRendererTurbo(this, 657, 73, textureX, textureY); // Box 238
		bodyModel[117] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 239
		bodyModel[118] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 240
		bodyModel[119] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 241
		bodyModel[120] = new ModelRendererTurbo(this, 721, 81, textureX, textureY); // Box 242
		bodyModel[121] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 243
		bodyModel[122] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 244
		bodyModel[123] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 287
		bodyModel[124] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 341
		bodyModel[125] = new ModelRendererTurbo(this, 787, 598, textureX, textureY); // Box 342
		bodyModel[126] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 343
		bodyModel[127] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 344
		bodyModel[128] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 345
		bodyModel[129] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 346
		bodyModel[130] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 347
		bodyModel[131] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 348
		bodyModel[132] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 349
		bodyModel[133] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 350
		bodyModel[134] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 351
		bodyModel[135] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 352
		bodyModel[136] = new ModelRendererTurbo(this, 921, 9, textureX, textureY); // Box 353
		bodyModel[137] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 354
		bodyModel[138] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 355
		bodyModel[139] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 356
		bodyModel[140] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 357
		bodyModel[141] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 358
		bodyModel[142] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 359
		bodyModel[143] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 360
		bodyModel[144] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 361
		bodyModel[145] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 362
		bodyModel[146] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 363
		bodyModel[147] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 364
		bodyModel[148] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 365
		bodyModel[149] = new ModelRendererTurbo(this, 593, 25, textureX, textureY); // Box 366
		bodyModel[150] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 367
		bodyModel[151] = new ModelRendererTurbo(this, 849, 25, textureX, textureY); // Box 368
		bodyModel[152] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 369
		bodyModel[153] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 370
		bodyModel[154] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 371
		bodyModel[155] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 372
		bodyModel[156] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 373
		bodyModel[157] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 374
		bodyModel[158] = new ModelRendererTurbo(this, 649, 25, textureX, textureY); // Box 375
		bodyModel[159] = new ModelRendererTurbo(this, 897, 25, textureX, textureY); // Box 376
		bodyModel[160] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 377
		bodyModel[161] = new ModelRendererTurbo(this, 665, 25, textureX, textureY); // Box 378
		bodyModel[162] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 379
		bodyModel[163] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 380
		bodyModel[164] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 381
		bodyModel[165] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 382
		bodyModel[166] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 383
		bodyModel[167] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 384
		bodyModel[168] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 385
		bodyModel[169] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 386
		bodyModel[170] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 387
		bodyModel[171] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 388
		bodyModel[172] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 389
		bodyModel[173] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 390
		bodyModel[174] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 391
		bodyModel[175] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 392
		bodyModel[176] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 393
		bodyModel[177] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 394
		bodyModel[178] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 395
		bodyModel[179] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 396
		bodyModel[180] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 397
		bodyModel[181] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 398
		bodyModel[182] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 399
		bodyModel[183] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 400
		bodyModel[184] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 401
		bodyModel[185] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 402
		bodyModel[186] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 403
		bodyModel[187] = new ModelRendererTurbo(this, 953, 33, textureX, textureY); // Box 404
		bodyModel[188] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 405
		bodyModel[189] = new ModelRendererTurbo(this, 921, 33, textureX, textureY); // Box 406
		bodyModel[190] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 407
		bodyModel[191] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 408
		bodyModel[192] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 409
		bodyModel[193] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 410
		bodyModel[194] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 411
		bodyModel[195] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 412
		bodyModel[196] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 413
		bodyModel[197] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 414
		bodyModel[198] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 415
		bodyModel[199] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 416
		bodyModel[200] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 417
		bodyModel[201] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 418
		bodyModel[202] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 419
		bodyModel[203] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 420
		bodyModel[204] = new ModelRendererTurbo(this, 721, 57, textureX, textureY); // Box 421
		bodyModel[205] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 422
		bodyModel[206] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 423
		bodyModel[207] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 424
		bodyModel[208] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 425
		bodyModel[209] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 426
		bodyModel[210] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 427
		bodyModel[211] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 428
		bodyModel[212] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 429
		bodyModel[213] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 430
		bodyModel[214] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 431
		bodyModel[215] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 432
		bodyModel[216] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 433
		bodyModel[217] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 434
		bodyModel[218] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 435
		bodyModel[219] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 436
		bodyModel[220] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 437
		bodyModel[221] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 438
		bodyModel[222] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 439
		bodyModel[223] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 440
		bodyModel[224] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 441
		bodyModel[225] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Box 442
		bodyModel[226] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 443
		bodyModel[227] = new ModelRendererTurbo(this, 713, 73, textureX, textureY); // Box 444
		bodyModel[228] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 445
		bodyModel[229] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 446
		bodyModel[230] = new ModelRendererTurbo(this, 897, 73, textureX, textureY); // Box 447
		bodyModel[231] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 448
		bodyModel[232] = new ModelRendererTurbo(this, 945, 73, textureX, textureY); // Box 449
		bodyModel[233] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 450
		bodyModel[234] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 451
		bodyModel[235] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 452
		bodyModel[236] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 453
		bodyModel[237] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 454
		bodyModel[238] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 455
		bodyModel[239] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 456
		bodyModel[240] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 457
		bodyModel[241] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 458
		bodyModel[242] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 459
		bodyModel[243] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 460
		bodyModel[244] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 461
		bodyModel[245] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 462
		bodyModel[246] = new ModelRendererTurbo(this, 913, 65, textureX, textureY); // Box 463
		bodyModel[247] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 464
		bodyModel[248] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 465
		bodyModel[249] = new ModelRendererTurbo(this, 513, 81, textureX, textureY); // Box 466
		bodyModel[250] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 467
		bodyModel[251] = new ModelRendererTurbo(this, 657, 81, textureX, textureY); // Box 468
		bodyModel[252] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 469
		bodyModel[253] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 470
		bodyModel[254] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 471
		bodyModel[255] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 472
		bodyModel[256] = new ModelRendererTurbo(this, 561, 81, textureX, textureY); // Box 479
		bodyModel[257] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 480
		bodyModel[258] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 481
		bodyModel[259] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 482
		bodyModel[260] = new ModelRendererTurbo(this, 217, 89, textureX, textureY); // Box 483
		bodyModel[261] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 484
		bodyModel[262] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 485
		bodyModel[263] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 486
		bodyModel[264] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 487
		bodyModel[265] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 488
		bodyModel[266] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 489
		bodyModel[267] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 490
		bodyModel[268] = new ModelRendererTurbo(this, 897, 89, textureX, textureY); // Box 491
		bodyModel[269] = new ModelRendererTurbo(this, 945, 89, textureX, textureY); // Box 492
		bodyModel[270] = new ModelRendererTurbo(this, 961, 89, textureX, textureY); // Box 493
		bodyModel[271] = new ModelRendererTurbo(this, 977, 89, textureX, textureY); // Box 494
		bodyModel[272] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 495
		bodyModel[273] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 496
		bodyModel[274] = new ModelRendererTurbo(this, 1009, 89, textureX, textureY); // Box 497
		bodyModel[275] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 498
		bodyModel[276] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 499
		bodyModel[277] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 500
		bodyModel[278] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 501
		bodyModel[279] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 502
		bodyModel[280] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 503
		bodyModel[281] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 504
		bodyModel[282] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 505
		bodyModel[283] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 506
		bodyModel[284] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 507
		bodyModel[285] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 508
		bodyModel[286] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 509
		bodyModel[287] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 510
		bodyModel[288] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 511
		bodyModel[289] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 512
		bodyModel[290] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 513
		bodyModel[291] = new ModelRendererTurbo(this, 401, 97, textureX, textureY); // Box 514
		bodyModel[292] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 515
		bodyModel[293] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 516
		bodyModel[294] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 517
		bodyModel[295] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 518
		bodyModel[296] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 519
		bodyModel[297] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 520
		bodyModel[298] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 521
		bodyModel[299] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 522
		bodyModel[300] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 523
		bodyModel[301] = new ModelRendererTurbo(this, 593, 97, textureX, textureY); // Box 524
		bodyModel[302] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 525
		bodyModel[303] = new ModelRendererTurbo(this, 625, 97, textureX, textureY); // Box 526
		bodyModel[304] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 527
		bodyModel[305] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 528
		bodyModel[306] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 529
		bodyModel[307] = new ModelRendererTurbo(this, 689, 97, textureX, textureY); // Box 530
		bodyModel[308] = new ModelRendererTurbo(this, 705, 97, textureX, textureY); // Box 531
		bodyModel[309] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 532
		bodyModel[310] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 533
		bodyModel[311] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 534
		bodyModel[312] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 535
		bodyModel[313] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 537
		bodyModel[314] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 539
		bodyModel[315] = new ModelRendererTurbo(this, 833, 97, textureX, textureY); // Box 540
		bodyModel[316] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 541
		bodyModel[317] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 1073
		bodyModel[318] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 1074
		bodyModel[319] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 1075
		bodyModel[320] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 1076
		bodyModel[321] = new ModelRendererTurbo(this, 641, 145, textureX, textureY); // Box 1077
		bodyModel[322] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 1078
		bodyModel[323] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 1079
		bodyModel[324] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 1080
		bodyModel[325] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 1081
		bodyModel[326] = new ModelRendererTurbo(this, 777, 145, textureX, textureY); // Box 1082
		bodyModel[327] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 1083
		bodyModel[328] = new ModelRendererTurbo(this, 521, 153, textureX, textureY); // Box 1084
		bodyModel[329] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 1085
		bodyModel[330] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Box 1086
		bodyModel[331] = new ModelRendererTurbo(this, 633, 153, textureX, textureY); // Box 1087
		bodyModel[332] = new ModelRendererTurbo(this, 657, 153, textureX, textureY); // Box 1088
		bodyModel[333] = new ModelRendererTurbo(this, 681, 153, textureX, textureY); // Box 1089
		bodyModel[334] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 1090
		bodyModel[335] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 1091
		bodyModel[336] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 1092
		bodyModel[337] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 1093
		bodyModel[338] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 1094
		bodyModel[339] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 1095
		bodyModel[340] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 1096
		bodyModel[341] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 1097
		bodyModel[342] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 1098
		bodyModel[343] = new ModelRendererTurbo(this, 849, 217, textureX, textureY); // Box 1099
		bodyModel[344] = new ModelRendererTurbo(this, 849, 217, textureX, textureY); // Box 1100
		bodyModel[345] = new ModelRendererTurbo(this, 633, 161, textureX, textureY); // Box 1101
		bodyModel[346] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 1102
		bodyModel[347] = new ModelRendererTurbo(this, 857, 161, textureX, textureY); // Box 1103
		bodyModel[348] = new ModelRendererTurbo(this, 897, 161, textureX, textureY); // Box 1104
		bodyModel[349] = new ModelRendererTurbo(this, 961, 161, textureX, textureY); // Box 1105
		bodyModel[350] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Box 1106
		bodyModel[351] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 1107
		bodyModel[352] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Box 1108
		bodyModel[353] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Box 1109
		bodyModel[354] = new ModelRendererTurbo(this, 817, 169, textureX, textureY); // Box 1110
		bodyModel[355] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 1111
		bodyModel[356] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 1112
		bodyModel[357] = new ModelRendererTurbo(this, 849, 217, textureX, textureY); // Box 1113

		bodyModel[0].addShapeBox(-41F, -15F, -19F, 97, 10, 38, 0F,0F, -0.5F, 0F, -23F, -0.5F, 0F, -23F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(46F, -5F, -19F, 10, 9, 38, 0F,0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -9F, -0.5F, 0F, -9F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-41F, -5F, -19F, 87, 6, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-41F, 0F, -19F, 87, 4, 38, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 52
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-53F, -15F, -19F, 12, 12, 38, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-60F, -15F, -10F, 7, 10, 28, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -6F, 0F, 0F); // Box 54
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-53F, -3F, -19F, 12, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 55
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-52F, 0F, -19F, 11, 3, 38, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 56
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-56F, -11F, 19F, 106, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(50F, -11F, 19F, 11, 1, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(50F, -11F, -30F, 11, 1, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-56F, -11F, -32F, 106, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-56F, -11F, -33F, 4, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-52F, -11F, -33F, 20, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2.5F, 0F, 0F, 0.5F, 0F); // Box 127
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-32F, -11F, -33F, 9, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0F, 0F, 2.5F, 0F); // Box 128
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-23F, -11F, -33F, 25, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 129
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2F, -11F, -33F, 48, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 130
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(50F, -11F, -32F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(50F, -11F, -33F, 11, 5, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 3.5F, 0F); // Box 132
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(50F, -11F, 32F, 11, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 3.5F, -0.5F); // Box 133
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, -11F, 32F, 48, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F); // Box 134
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-23F, -11F, 32F, 25, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, -0.5F, 0F, 3.5F, -0.5F); // Box 135
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-32F, -11F, 32F, 9, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, -0.5F, 0F, 2.5F, -0.5F); // Box 136
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-52F, -11F, 32F, 20, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 137
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-56F, -11F, 32F, 4, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F); // Box 138
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(50F, -11F, 30F, 11, 1, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(61F, -11F, -31F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(61F, -11F, -32F, 4, 1, 1, 0F,0F, 0F, 0F, -1F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3.25F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(61F, -11F, -33F, 3, 2, 1, 0F,0F, 0F, -0.5F, -0.5F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 3.5F, -0.5F, -0.5F, 2.25F, -0.5F, 0F, 2.25F, 0F, 0F, 3.5F, 0F); // Box 142
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(61F, -11F, 32F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 3.5F, 0F, 0F, 2.25F, 0F, -0.5F, 2.25F, -0.5F, 0F, 3.5F, -0.5F); // Box 143
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(61F, -11F, 31F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -1F, 3.25F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(61F, -11F, 19F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-61F, -11F, -32F, 5, 1, 13, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-61F, -11F, -33F, 5, 5, 1, 0F,0F, -1F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -3F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3F, 1F); // Box 147
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-61F, -11F, 32F, 5, 5, 1, 0F,0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -1.5F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -1.5F); // Box 148
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-61F, -11F, 19F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 149
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(50F, -11F, -19F, 11, 3, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, 0F, 0F, -4.5F, 2.5F, 0F, -4.5F, 2.5F, -0.75F, 0F, 0F, -0.75F); // Box 151
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(61F, -11F, -19F, 4, 1, 1, 0F,1F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, -0.75F, 1F, -1F, -0.75F, 4.5F, 4.5F, 0F, -7F, 5F, 0F, -7F, 5F, -0.75F, 4.5F, 4.5F, -0.75F); // Box 152
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(61F, -11F, -19F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -0.75F, 0F, 0F, -0.75F, 1F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, -0.75F, 1F, 0F, -0.75F); // Box 153
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(61F, -11F, 18F, 4, 1, 1, 0F,1F, -1F, -0.75F, 0F, -4F, -0.75F, 0F, -4F, 0F, 1F, -1F, 0F, 4.5F, 4.5F, -0.75F, -7F, 5F, -0.75F, -7F, 5F, 0F, 4.5F, 4.5F, 0F); // Box 154
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(50F, -11F, 18F, 11, 3, 1, 0F,0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.75F, -4.5F, 2.5F, -0.75F, -4.5F, 2.5F, 0F, 0F, 0F, 0F); // Box 155
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(61F, -11F, 18F, 4, 1, 1, 0F,0F, 0F, -0.75F, 0F, -3F, -0.75F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, -0.75F, 0F, 3F, -0.75F, 0F, 3F, 0F, 1F, 0F, 0F); // Box 156
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(42F, -11F, 18F, 8, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 2F, -0.75F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(42F, -11F, -19F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.75F, 0F, 0F, -0.75F); // Box 158
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(43F, -12F, -30F, 7, 1, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(28F, -13F, -30F, 15, 2, 11, 0F,0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(12F, -15F, -30F, 16, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(12F, -13F, -30F, 16, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 163
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-34.5F, -15F, -30F, 17, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-52.5F, -15F, -30F, 17, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-52.5F, -16F, -30F, 17, 1, 11, 0F,-2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-34.5F, -16F, -30F, 17, 1, 11, 0F,-2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(5F, -13F, -30F, 7, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F); // Box 171
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(5F, -15F, -30F, 7, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 172
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-17F, -15F, -30F, 5, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-17F, -13F, -30F, 5, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 174
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-12F, -15F, -30F, 7, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 175
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-12F, -13F, -30F, 7, 2, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 176
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-5F, -15F, -30F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F); // Box 179
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-5F, -13F, -30F, 9, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -4F, 0F, 0F, -1F); // Box 180
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-54.5F, -15F, -30F, 2, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-56.5F, -15F, -30F, 2, 4, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-52.5F, -15F, -31F, 5, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 183
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-47.5F, -15F, -31F, 13, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 184
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-54.5F, -15F, -31F, 2, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 185
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-56.5F, -15F, -31F, 2, 4, 1, 0F,0F, -2.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 186
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-34.5F, -15F, -31F, 8, 4, 1, 0F,0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 187
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-26.5F, -15F, -31F, 32, 4, 1, 0F,0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 188
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(5.5F, -15F, -31F, 22, 4, 1, 0F,0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 189
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(27.5F, -15F, -31F, 16, 4, 1, 0F,0F, -0.5F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 190
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(43.5F, -14F, -31F, 6, 3, 1, 0F,0F, -1F, -0.4F, 0.5F, -2F, -0.4F, 0.5F, -2F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 191
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(43.5F, -14F, 30F, 6, 3, 1, 0F,0F, -1F, -0.4F, 0.5F, -2F, -0.4F, 0.5F, -2F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 192
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(27.5F, -15F, 30F, 16, 4, 1, 0F,0F, -0.5F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 193
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(5.5F, -15F, 30F, 22, 4, 1, 0F,0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 194
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-24.5F, -15F, 30F, 30, 4, 1, 0F,0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 195
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(44F, -12F, 19F, 6, 2, 11, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(28F, -14F, 19F, 16, 3, 11, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(14F, -14F, 19F, 13, 3, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(8F, -14F, 21F, 6, 3, 9, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(5F, -14F, 23F, 3, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 200
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-23F, -14F, 19F, 11, 3, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-12F, -14F, 19F, 5, 3, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-7F, -14F, 23F, 11, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(4F, -14F, 23F, 1, 3, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-25F, -14F, 19F, 2, 3, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(27F, -14F, 19F, 1, 3, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-35.5F, -15F, -30F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-17.5F, -15F, -30F, 1, 4, 11, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(4F, -15F, -30F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-60F, -15F, -18F, 7, 10, 8, 0F,-2F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -3.5F, 0F, -6F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -6F, 0F, 0F); // Box 210
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-59.5F, -15F, -9F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-59.5F, -15F, 4F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-51.5F, -15.5F, -17F, 11, 1, 34, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 213
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-51F, -15.5F, -16.5F, 10, 1, 16, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 214
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-51F, -15.5F, 0.5F, 10, 1, 16, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 215
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-39.5F, -15.5F, -18F, 13, 1, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-39F, -16F, -12.5F, 10, 1, 25, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 217
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-39F, -16F, -17.5F, 10, 1, 5, 0F,-5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 218
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-39F, -16F, 12.5F, 10, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -5F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F); // Box 219
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-29F, -16F, -17.5F, 2, 1, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F); // Box 220
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-29F, -16F, 9.5F, 2, 1, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 221
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-36F, -16.5F, -10.5F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 222
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-36F, -16.5F, -8F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 223
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-36F, -16.5F, -3F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 224
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-36F, -16.5F, -5.5F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 225
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-36F, -16.5F, 2F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 226
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-36F, -16.5F, -0.5F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 227
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-36F, -16.5F, 7F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 228
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-36F, -16.5F, 4.5F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 229
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-36F, -16.5F, 9.5F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 231
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-38F, -14F, 19F, 13, 3, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-38F, -15F, 19F, 13, 1, 10, 0F,0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 233
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-37F, -14F, 29F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 234
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-37F, -14F, 31F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-37F, -13F, 29F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 236
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-37F, -13F, 31F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 237
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(-52.5F, -15F, 30F, 12, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 238
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-54.5F, -15F, 30F, 2, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 239
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-56.5F, -15F, 30F, 2, 4, 1, 0F,0F, -2.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -2.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 240
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-40.5F, -13F, 30F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 241
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-55F, -13F, 19F, 15, 2, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-55F, -15F, 19F, 15, 1, 11, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 243
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-40F, -14F, 19F, 2, 3, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(39F, -11.5F, 33F, 12, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 287
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(6F, -15F, 24F, 20, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 341
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-22F, -15F, 23F, 22, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 342
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-52F, -16F, 23F, 10, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(49F, -11F, -16F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(49F, -12F, -16F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(49F, -10F, -16F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 346
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(48F, -11F, -16F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 347
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(48F, -12F, -16F, 1, 1, 3, 0F,0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 348
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(48F, -10F, -16F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F); // Box 349
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(50F, -11F, -17F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 350
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(50F, -11F, -13F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 351
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(48F, -11F, -13F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 352
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(48F, -11F, -17F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 353
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(50F, -12F, -13F, 1, 1, 1, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 354
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(50F, -12F, -17F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 355
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(48F, -12F, -17F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 356
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(48F, -12F, -13F, 1, 1, 1, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 357
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(50F, -13F, -16.5F, 1, 1, 4, 0F,-0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 358
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(48F, -13F, -16.5F, 1, 1, 4, 0F,-0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 359
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(48.5F, -13F, -15F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 360
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(48.5F, -13F, -14F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 361
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(48.5F, -13F, -16F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 362
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(49F, -9F, -15F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 363
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(49F, -9F, 14.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 364
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(49F, -10F, 13.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 365
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(49F, -11F, 13.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(49F, -12F, 13.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(50F, -13F, 13F, 1, 1, 4, 0F,-0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 368
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(50F, -12F, 12.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 369
		bodyModel[152].setRotationPoint(0F, 0F, 0F);

		bodyModel[153].addShapeBox(50F, -11F, 12.5F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 370
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(50F, -12F, 16.5F, 1, 1, 1, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 371
		bodyModel[154].setRotationPoint(0F, 0F, 0F);

		bodyModel[155].addShapeBox(50F, -11F, 16.5F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 372
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(48.5F, -13F, 15.5F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 373
		bodyModel[156].setRotationPoint(0F, 0F, 0F);

		bodyModel[157].addShapeBox(48F, -13F, 13F, 1, 1, 4, 0F,-0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 374
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addShapeBox(48.5F, -13F, 13.5F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 375
		bodyModel[158].setRotationPoint(0F, 0F, 0F);

		bodyModel[159].addShapeBox(48.5F, -13F, 14.5F, 2, 1, 1, 0F,-0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 376
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(48F, -12F, 16.5F, 1, 1, 1, 0F,-0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 377
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(48F, -11F, 16.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 378
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addShapeBox(48F, -12F, 12.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 379
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addShapeBox(48F, -11F, 12.5F, 1, 3, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 380
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(48F, -12F, 13.5F, 1, 1, 3, 0F,0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 381
		bodyModel[164].setRotationPoint(0F, 0F, 0F);

		bodyModel[165].addShapeBox(48F, -11F, 13.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 382
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addShapeBox(48F, -10F, 13.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F); // Box 383
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(40F, -13F, -18F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(40F, -14F, -18F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 385
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(38F, -15F, -19F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(38F, -14F, -18F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(38F, -15F, 17F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(40F, -13F, 17F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(40F, -14F, 17F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(38F, -14F, 17F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, -4F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[175].setRotationPoint(34F, -14.5F, -1F);
		bodyModel[175].rotateAngleZ = -0.38397244F;

		bodyModel[176].addShapeBox(-1F, -1F, -3F, 1, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[176].setRotationPoint(35.2F, -14F, -1F);

		bodyModel[177].addShapeBox(-1F, -2F, -3F, 1, 1, 7, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[177].setRotationPoint(35.2F, -14F, -1F);

		bodyModel[178].addShapeBox(0F, -1F, -3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[178].setRotationPoint(35.2F, -14F, -1F);

		bodyModel[179].addShapeBox(0F, -2F, -3F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[179].setRotationPoint(35.2F, -14F, -1F);

		bodyModel[180].addShapeBox(0F, -2F, 3F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 397
		bodyModel[180].setRotationPoint(35.2F, -14F, -1F);

		bodyModel[181].addShapeBox(0F, -1F, 3F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[181].setRotationPoint(35.2F, -14F, -1F);

		bodyModel[182].addShapeBox(0.5F, 0F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[182].setRotationPoint(52F, -8F, -10F);
		bodyModel[182].rotateAngleZ = -0.34906585F;

		bodyModel[183].addShapeBox(1.5F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[183].setRotationPoint(52F, -8F, -10F);
		bodyModel[183].rotateAngleZ = -0.34906585F;

		bodyModel[184].addShapeBox(1.5F, -2F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[184].setRotationPoint(52F, -8F, -10F);
		bodyModel[184].rotateAngleZ = -0.34906585F;

		bodyModel[185].addShapeBox(3.5F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F); // Box 402
		bodyModel[185].setRotationPoint(52F, -8F, -10F);
		bodyModel[185].rotateAngleZ = -0.34906585F;

		bodyModel[186].addShapeBox(-0.5F, -2F, -0.5F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F); // Box 403
		bodyModel[186].setRotationPoint(52F, -8F, -10F);
		bodyModel[186].rotateAngleZ = -0.34906585F;

		bodyModel[187].addShapeBox(-0.5F, -2F, 19.5F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F); // Box 404
		bodyModel[187].setRotationPoint(52F, -8F, -10F);
		bodyModel[187].rotateAngleZ = -0.34906585F;

		bodyModel[188].addShapeBox(1.5F, -2F, 19.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[188].setRotationPoint(52F, -8F, -10F);
		bodyModel[188].rotateAngleZ = -0.34906585F;

		bodyModel[189].addShapeBox(3.5F, -2F, 19.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[189].setRotationPoint(52F, -8F, -10F);
		bodyModel[189].rotateAngleZ = -0.34906585F;

		bodyModel[190].addShapeBox(1.5F, -1F, 19.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[190].setRotationPoint(52F, -8F, -10F);
		bodyModel[190].rotateAngleZ = -0.34906585F;

		bodyModel[191].addShapeBox(0.5F, 0F, 19F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[191].setRotationPoint(52F, -8F, -10F);
		bodyModel[191].rotateAngleZ = -0.34906585F;

		bodyModel[192].addShapeBox(-1.5F, 0F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[192].setRotationPoint(-54F, -4F, -13F);
		bodyModel[192].rotateAngleZ = 2.18166156F;

		bodyModel[193].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[193].setRotationPoint(-54F, -4F, -13F);
		bodyModel[193].rotateAngleZ = 2.18166156F;

		bodyModel[194].addShapeBox(-2.5F, -2F, -0.5F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F); // Box 411
		bodyModel[194].setRotationPoint(-54F, -4F, -13F);
		bodyModel[194].rotateAngleZ = 2.18166156F;

		bodyModel[195].addShapeBox(-0.5F, -2F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[195].setRotationPoint(-54F, -4F, -13F);
		bodyModel[195].rotateAngleZ = 2.18166156F;

		bodyModel[196].addShapeBox(1.5F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[196].setRotationPoint(-54F, -4F, -13F);
		bodyModel[196].rotateAngleZ = 2.18166156F;

		bodyModel[197].addShapeBox(-1.5F, 0F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 414
		bodyModel[197].setRotationPoint(-54F, -4F, 13F);
		bodyModel[197].rotateAngleZ = 2.18166156F;

		bodyModel[198].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 415
		bodyModel[198].setRotationPoint(-54F, -4F, 13F);
		bodyModel[198].rotateAngleZ = 2.18166156F;

		bodyModel[199].addShapeBox(-2.5F, -2F, -0.5F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F); // Box 416
		bodyModel[199].setRotationPoint(-54F, -4F, 13F);
		bodyModel[199].rotateAngleZ = 2.18166156F;

		bodyModel[200].addShapeBox(-0.5F, -2F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[200].setRotationPoint(-54F, -4F, 13F);
		bodyModel[200].rotateAngleZ = 2.18166156F;

		bodyModel[201].addShapeBox(1.5F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[201].setRotationPoint(-54F, -4F, 13F);
		bodyModel[201].rotateAngleZ = 2.18166156F;

		bodyModel[202].addShapeBox(-5F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 419
		bodyModel[202].setRotationPoint(-60.5F, -15F, -9F);
		bodyModel[202].rotateAngleZ = -0.27925268F;

		bodyModel[203].addShapeBox(-5F, 0F, 13F, 5, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 420
		bodyModel[203].setRotationPoint(-60.5F, -15F, -9F);
		bodyModel[203].rotateAngleZ = -0.27925268F;

		bodyModel[204].addShapeBox(-60.5F, -15.5F, -9F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[204].setRotationPoint(0F, 0F, 0F);

		bodyModel[205].addShapeBox(-60.5F, -15.5F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[205].setRotationPoint(0F, 0F, 0F);

		bodyModel[206].addShapeBox(-60.5F, -15.5F, 14F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[206].setRotationPoint(0F, 0F, 0F);

		bodyModel[207].addShapeBox(-60.5F, -15.5F, 4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[207].setRotationPoint(0F, 0F, 0F);

		bodyModel[208].addShapeBox(-25.5F, -15.5F, -18F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		bodyModel[208].setRotationPoint(0F, 0F, 0F);

		bodyModel[209].addShapeBox(-20.5F, -15.5F, -17F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[209].setRotationPoint(0F, 0F, 0F);

		bodyModel[210].addShapeBox(-18.5F, -15.5F, -17F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[210].setRotationPoint(0F, 0F, 0F);

		bodyModel[211].addShapeBox(-24.5F, -15.5F, 10F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[211].setRotationPoint(0F, 0F, 0F);

		bodyModel[212].addShapeBox(-40.5F, -16.5F, -18F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 429
		bodyModel[212].setRotationPoint(0F, 0F, 0F);

		bodyModel[213].addShapeBox(-40.5F, -16.5F, 17F, 1, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[213].setRotationPoint(0F, 0F, 0F);

		bodyModel[214].addShapeBox(-40.5F, -16.5F, -17F, 1, 1, 34, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 431
		bodyModel[214].setRotationPoint(0F, 0F, 0F);

		bodyModel[215].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 432
		bodyModel[215].setRotationPoint(-59F, -10F, 15F);
		bodyModel[215].rotateAngleZ = 0.55850536F;

		bodyModel[216].addShapeBox(-0.5F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 433
		bodyModel[216].setRotationPoint(-59F, -10F, 15F);
		bodyModel[216].rotateAngleZ = 0.55850536F;

		bodyModel[217].addShapeBox(-0.5F, -1F, -3F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		bodyModel[217].setRotationPoint(-59F, -10F, 15F);
		bodyModel[217].rotateAngleZ = 0.55850536F;

		bodyModel[218].addShapeBox(-0.5F, -2F, -5F, 1, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		bodyModel[218].setRotationPoint(-59F, -10F, 15F);
		bodyModel[218].rotateAngleZ = 0.55850536F;

		bodyModel[219].addShapeBox(-0.5F, -4F, -6F, 1, 1, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		bodyModel[219].setRotationPoint(-59F, -10F, 15F);
		bodyModel[219].rotateAngleZ = 0.55850536F;

		bodyModel[220].addShapeBox(-0.5F, -3F, -6F, 1, 1, 1, 0F,-0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 437
		bodyModel[220].setRotationPoint(-59F, -10F, 15F);
		bodyModel[220].rotateAngleZ = 0.55850536F;

		bodyModel[221].addShapeBox(-0.5F, 0F, -3F, 1, 1, 2, 0F,-0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 438
		bodyModel[221].setRotationPoint(-59F, -10F, 15F);
		bodyModel[221].rotateAngleZ = 0.55850536F;

		bodyModel[222].addShapeBox(-0.5F, -1F, -5F, 1, 1, 2, 0F,-0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 439
		bodyModel[222].setRotationPoint(-59F, -10F, 15F);
		bodyModel[222].rotateAngleZ = 0.55850536F;

		bodyModel[223].addShapeBox(-1F, 1F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[223].setRotationPoint(-59F, -10F, 15F);
		bodyModel[223].rotateAngleZ = 0.55850536F;

		bodyModel[224].addShapeBox(-1F, 1F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 441
		bodyModel[224].setRotationPoint(-59F, -10F, 4F);
		bodyModel[224].rotateAngleZ = 0.55850536F;

		bodyModel[225].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 442
		bodyModel[225].setRotationPoint(-59F, -10F, 4F);
		bodyModel[225].rotateAngleZ = 0.55850536F;

		bodyModel[226].addShapeBox(-0.5F, 0F, -3F, 1, 1, 2, 0F,-0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 443
		bodyModel[226].setRotationPoint(-59F, -10F, 4F);
		bodyModel[226].rotateAngleZ = 0.55850536F;

		bodyModel[227].addShapeBox(-0.5F, -1F, -5F, 1, 1, 2, 0F,-0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 444
		bodyModel[227].setRotationPoint(-59F, -10F, 4F);
		bodyModel[227].rotateAngleZ = 0.55850536F;

		bodyModel[228].addShapeBox(-0.5F, -3F, -6F, 1, 1, 1, 0F,-0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 445
		bodyModel[228].setRotationPoint(-59F, -10F, 4F);
		bodyModel[228].rotateAngleZ = 0.55850536F;

		bodyModel[229].addShapeBox(-0.5F, -4F, -6F, 1, 1, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[229].setRotationPoint(-59F, -10F, 4F);
		bodyModel[229].rotateAngleZ = 0.55850536F;

		bodyModel[230].addShapeBox(-0.5F, -2F, -5F, 1, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[230].setRotationPoint(-59F, -10F, 4F);
		bodyModel[230].rotateAngleZ = 0.55850536F;

		bodyModel[231].addShapeBox(-0.5F, -1F, -3F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[231].setRotationPoint(-59F, -10F, 4F);
		bodyModel[231].rotateAngleZ = 0.55850536F;

		bodyModel[232].addShapeBox(-0.5F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[232].setRotationPoint(-59F, -10F, 4F);
		bodyModel[232].rotateAngleZ = 0.55850536F;

		bodyModel[233].addShapeBox(-1F, 1F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[233].setRotationPoint(-59F, -10F, -4F);
		bodyModel[233].rotateAngleZ = 0.55850536F;

		bodyModel[234].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[234].setRotationPoint(-59F, -10F, -4F);
		bodyModel[234].rotateAngleZ = 0.55850536F;

		bodyModel[235].addShapeBox(-0.5F, 0F, -3F, 1, 1, 2, 0F,-0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 452
		bodyModel[235].setRotationPoint(-59F, -10F, -4F);
		bodyModel[235].rotateAngleZ = 0.55850536F;

		bodyModel[236].addShapeBox(-0.5F, -1F, -5F, 1, 1, 2, 0F,-0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 453
		bodyModel[236].setRotationPoint(-59F, -10F, -4F);
		bodyModel[236].rotateAngleZ = 0.55850536F;

		bodyModel[237].addShapeBox(-0.5F, -3F, -6F, 1, 1, 1, 0F,-0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 454
		bodyModel[237].setRotationPoint(-59F, -10F, -4F);
		bodyModel[237].rotateAngleZ = 0.55850536F;

		bodyModel[238].addShapeBox(-0.5F, -4F, -6F, 1, 1, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		bodyModel[238].setRotationPoint(-59F, -10F, -4F);
		bodyModel[238].rotateAngleZ = 0.55850536F;

		bodyModel[239].addShapeBox(-0.5F, -2F, -5F, 1, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 456
		bodyModel[239].setRotationPoint(-59F, -10F, -4F);
		bodyModel[239].rotateAngleZ = 0.55850536F;

		bodyModel[240].addShapeBox(-0.5F, -1F, -3F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 457
		bodyModel[240].setRotationPoint(-59F, -10F, -4F);
		bodyModel[240].rotateAngleZ = 0.55850536F;

		bodyModel[241].addShapeBox(-0.5F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		bodyModel[241].setRotationPoint(-59F, -10F, -4F);
		bodyModel[241].rotateAngleZ = 0.55850536F;

		bodyModel[242].addShapeBox(-1F, 1F, -0.5F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		bodyModel[242].setRotationPoint(-59F, -10F, -14F);
		bodyModel[242].rotateAngleZ = 0.55850536F;

		bodyModel[243].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 460
		bodyModel[243].setRotationPoint(-59F, -10F, -14F);
		bodyModel[243].rotateAngleZ = 0.55850536F;

		bodyModel[244].addShapeBox(-0.5F, 0F, -3F, 1, 1, 2, 0F,-0.25F, 1F, 0F, -0.25F, 1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 461
		bodyModel[244].setRotationPoint(-59F, -10F, -14F);
		bodyModel[244].rotateAngleZ = 0.55850536F;

		bodyModel[245].addShapeBox(-0.5F, -1F, -5F, 1, 1, 2, 0F,-0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 462
		bodyModel[245].setRotationPoint(-59F, -10F, -14F);
		bodyModel[245].rotateAngleZ = 0.55850536F;

		bodyModel[246].addShapeBox(-0.5F, -3F, -6F, 1, 1, 1, 0F,-0.25F, 2F, 0F, -0.25F, 2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 463
		bodyModel[246].setRotationPoint(-59F, -10F, -14F);
		bodyModel[246].rotateAngleZ = 0.55850536F;

		bodyModel[247].addShapeBox(-0.5F, -4F, -6F, 1, 1, 1, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 464
		bodyModel[247].setRotationPoint(-59F, -10F, -14F);
		bodyModel[247].rotateAngleZ = 0.55850536F;

		bodyModel[248].addShapeBox(-0.5F, -2F, -5F, 1, 1, 2, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[248].setRotationPoint(-59F, -10F, -14F);
		bodyModel[248].rotateAngleZ = 0.55850536F;

		bodyModel[249].addShapeBox(-0.5F, -1F, -3F, 1, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		bodyModel[249].setRotationPoint(-59F, -10F, -14F);
		bodyModel[249].rotateAngleZ = 0.55850536F;

		bodyModel[250].addShapeBox(-0.5F, -1F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		bodyModel[250].setRotationPoint(-59F, -10F, -14F);
		bodyModel[250].rotateAngleZ = 0.55850536F;

		bodyModel[251].addShapeBox(-7F, -1F, -6F, 3, 1, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 468
		bodyModel[251].setRotationPoint(34F, -14.5F, -1F);

		bodyModel[252].addShapeBox(-7F, -1F, -7F, 3, 1, 1, 0F,-1.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 469
		bodyModel[252].setRotationPoint(34F, -14.5F, -1F);

		bodyModel[253].addShapeBox(-8F, -1F, -3F, 4, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[253].setRotationPoint(34F, -14.5F, -1F);

		bodyModel[254].addShapeBox(-9F, -1F, -3F, 1, 1, 8, 0F,0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 471
		bodyModel[254].setRotationPoint(34F, -14.5F, -1F);

		bodyModel[255].addShapeBox(-8F, -1F, 3F, 4, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 472
		bodyModel[255].setRotationPoint(34F, -14.5F, -1F);

		bodyModel[256].addShapeBox(0F, 1F, -0.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 479
		bodyModel[256].setRotationPoint(-61F, -5F, 15F);
		bodyModel[256].rotateAngleZ = 0.34906585F;

		bodyModel[257].addShapeBox(-1F, -2F, -46F, 3, 2, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		bodyModel[257].setRotationPoint(-61F, -5F, 15F);
		bodyModel[257].rotateAngleZ = 0.34906585F;

		bodyModel[258].addShapeBox(-1F, 0F, -46F, 3, 1, 62, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 481
		bodyModel[258].setRotationPoint(-61F, -5F, 15F);
		bodyModel[258].rotateAngleZ = 0.34906585F;

		bodyModel[259].addShapeBox(-1F, -3F, -46F, 3, 1, 62, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 482
		bodyModel[259].setRotationPoint(-61F, -5F, 15F);
		bodyModel[259].rotateAngleZ = 0.34906585F;

		bodyModel[260].addShapeBox(2F, 1F, -0.5F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		bodyModel[260].setRotationPoint(-61F, -5F, 15F);
		bodyModel[260].rotateAngleZ = 0.34906585F;

		bodyModel[261].addShapeBox(1F, 1F, -0.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 484
		bodyModel[261].setRotationPoint(-61F, -5F, 15F);
		bodyModel[261].rotateAngleZ = 0.34906585F;

		bodyModel[262].addShapeBox(-1F, 1F, -0.5F, 1, 2, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 485
		bodyModel[262].setRotationPoint(-61F, -5F, 15F);
		bodyModel[262].rotateAngleZ = 0.34906585F;

		bodyModel[263].addShapeBox(1F, 1F, -0.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 486
		bodyModel[263].setRotationPoint(-61F, -5F, -17F);
		bodyModel[263].rotateAngleZ = 0.34906585F;

		bodyModel[264].addShapeBox(2F, 1F, -0.5F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 487
		bodyModel[264].setRotationPoint(-61F, -5F, -17F);
		bodyModel[264].rotateAngleZ = 0.34906585F;

		bodyModel[265].addShapeBox(0F, 1F, -0.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		bodyModel[265].setRotationPoint(-61F, -5F, -17F);
		bodyModel[265].rotateAngleZ = 0.34906585F;

		bodyModel[266].addShapeBox(-1F, 1F, -0.5F, 1, 2, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 489
		bodyModel[266].setRotationPoint(-61F, -5F, -17F);
		bodyModel[266].rotateAngleZ = 0.34906585F;

		bodyModel[267].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 490
		bodyModel[267].setRotationPoint(-31.5F, 3F, 21F);
		bodyModel[267].rotateAngleZ = 0.54105207F;

		bodyModel[268].addShapeBox(2F, -1F, -2F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 491
		bodyModel[268].setRotationPoint(-31.5F, 3F, 21F);
		bodyModel[268].rotateAngleZ = 0.54105207F;

		bodyModel[269].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		bodyModel[269].setRotationPoint(-31.5F, 3F, 21F);
		bodyModel[269].rotateAngleZ = 0.54105207F;

		bodyModel[270].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 493
		bodyModel[270].setRotationPoint(-17F, 3F, 21F);
		bodyModel[270].rotateAngleZ = 0.54105207F;

		bodyModel[271].addShapeBox(2F, -1F, -2F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 494
		bodyModel[271].setRotationPoint(-17F, 3F, 21F);
		bodyModel[271].rotateAngleZ = 0.54105207F;

		bodyModel[272].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[272].setRotationPoint(-17F, 3F, 21F);
		bodyModel[272].rotateAngleZ = 0.54105207F;

		bodyModel[273].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 496
		bodyModel[273].setRotationPoint(-2.5F, 3F, 21F);
		bodyModel[273].rotateAngleZ = 0.54105207F;

		bodyModel[274].addShapeBox(2F, -1F, -2F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 497
		bodyModel[274].setRotationPoint(-2.5F, 3F, 21F);
		bodyModel[274].rotateAngleZ = 0.54105207F;

		bodyModel[275].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 498
		bodyModel[275].setRotationPoint(-2.5F, 3F, 21F);
		bodyModel[275].rotateAngleZ = 0.54105207F;

		bodyModel[276].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		bodyModel[276].setRotationPoint(12.5F, 3F, 21F);
		bodyModel[276].rotateAngleZ = 0.54105207F;

		bodyModel[277].addShapeBox(2F, -1F, -2F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 500
		bodyModel[277].setRotationPoint(12.5F, 3F, 21F);
		bodyModel[277].rotateAngleZ = 0.54105207F;

		bodyModel[278].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 501
		bodyModel[278].setRotationPoint(12.5F, 3F, 21F);
		bodyModel[278].rotateAngleZ = 0.54105207F;

		bodyModel[279].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 502
		bodyModel[279].setRotationPoint(28F, 3F, 21F);
		bodyModel[279].rotateAngleZ = 0.54105207F;

		bodyModel[280].addShapeBox(2F, -1F, -2F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 503
		bodyModel[280].setRotationPoint(28F, 3F, 21F);
		bodyModel[280].rotateAngleZ = 0.54105207F;

		bodyModel[281].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 504
		bodyModel[281].setRotationPoint(28F, 3F, 21F);
		bodyModel[281].rotateAngleZ = 0.54105207F;

		bodyModel[282].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 505
		bodyModel[282].setRotationPoint(43F, 3F, 21F);
		bodyModel[282].rotateAngleZ = 0.71558499F;

		bodyModel[283].addShapeBox(2F, -1F, -2F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 506
		bodyModel[283].setRotationPoint(43F, 3F, 21F);
		bodyModel[283].rotateAngleZ = 0.71558499F;

		bodyModel[284].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		bodyModel[284].setRotationPoint(43F, 3F, 21F);
		bodyModel[284].rotateAngleZ = 0.71558499F;

		bodyModel[285].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[285].setRotationPoint(43F, 3F, -20F);
		bodyModel[285].rotateAngleZ = 0.71558499F;

		bodyModel[286].addShapeBox(2F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[286].setRotationPoint(43F, 3F, -20F);
		bodyModel[286].rotateAngleZ = 0.71558499F;

		bodyModel[287].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[287].setRotationPoint(43F, 3F, -20F);
		bodyModel[287].rotateAngleZ = 0.71558499F;

		bodyModel[288].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[288].setRotationPoint(28F, 3F, -20F);
		bodyModel[288].rotateAngleZ = 0.54105207F;

		bodyModel[289].addShapeBox(2F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[289].setRotationPoint(28F, 3F, -20F);
		bodyModel[289].rotateAngleZ = 0.54105207F;

		bodyModel[290].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[290].setRotationPoint(28F, 3F, -20F);
		bodyModel[290].rotateAngleZ = 0.54105207F;

		bodyModel[291].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[291].setRotationPoint(12.5F, 3F, -20F);
		bodyModel[291].rotateAngleZ = 0.54105207F;

		bodyModel[292].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[292].setRotationPoint(-2.5F, 3F, -20F);
		bodyModel[292].rotateAngleZ = 0.54105207F;

		bodyModel[293].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 516
		bodyModel[293].setRotationPoint(-17F, 3F, -20F);
		bodyModel[293].rotateAngleZ = 0.54105207F;

		bodyModel[294].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 517
		bodyModel[294].setRotationPoint(-31.5F, 3F, -20F);
		bodyModel[294].rotateAngleZ = 0.54105207F;

		bodyModel[295].addShapeBox(2F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[295].setRotationPoint(-31.5F, 3F, -20F);
		bodyModel[295].rotateAngleZ = 0.54105207F;

		bodyModel[296].addShapeBox(2F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 519
		bodyModel[296].setRotationPoint(-17F, 3F, -20F);
		bodyModel[296].rotateAngleZ = 0.54105207F;

		bodyModel[297].addShapeBox(2F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 520
		bodyModel[297].setRotationPoint(-2.5F, 3F, -20F);
		bodyModel[297].rotateAngleZ = 0.54105207F;

		bodyModel[298].addShapeBox(2F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 521
		bodyModel[298].setRotationPoint(12.5F, 3F, -20F);
		bodyModel[298].rotateAngleZ = 0.54105207F;

		bodyModel[299].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 522
		bodyModel[299].setRotationPoint(12.5F, 3F, -20F);
		bodyModel[299].rotateAngleZ = 0.54105207F;

		bodyModel[300].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 523
		bodyModel[300].setRotationPoint(-2.5F, 3F, -20F);
		bodyModel[300].rotateAngleZ = 0.54105207F;

		bodyModel[301].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		bodyModel[301].setRotationPoint(-17F, 3F, -20F);
		bodyModel[301].rotateAngleZ = 0.54105207F;

		bodyModel[302].addShapeBox(8F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[302].setRotationPoint(-31.5F, 3F, -20F);
		bodyModel[302].rotateAngleZ = 0.54105207F;

		bodyModel[303].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[303].setRotationPoint(55F, -4F, -21F);
		bodyModel[303].rotateAngleZ = 2.77507351F;

		bodyModel[304].addShapeBox(2F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[304].setRotationPoint(55F, -4F, -21F);
		bodyModel[304].rotateAngleZ = 2.77507351F;

		bodyModel[305].addShapeBox(8F, -2F, -1F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 528
		bodyModel[305].setRotationPoint(55F, -4F, -21F);
		bodyModel[305].rotateAngleZ = 2.77507351F;

		bodyModel[306].addShapeBox(8F, -2F, -1F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[306].setRotationPoint(55F, -4F, 20F);
		bodyModel[306].rotateAngleZ = 2.77507351F;

		bodyModel[307].addShapeBox(2F, -1F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		bodyModel[307].setRotationPoint(55F, -4F, 21F);
		bodyModel[307].rotateAngleZ = 2.77507351F;

		bodyModel[308].addShapeBox(-2F, -2F, -2F, 4, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531
		bodyModel[308].setRotationPoint(55F, -4F, 22F);
		bodyModel[308].rotateAngleZ = 2.77507351F;

		bodyModel[309].addShapeBox(-7F, -14F, 19F, 12, 3, 4, 0F,5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[309].setRotationPoint(0F, 0F, 0F);

		bodyModel[310].addShapeBox(5F, -14F, 19F, 3, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 533
		bodyModel[310].setRotationPoint(0F, 0F, 0F);

		bodyModel[311].addShapeBox(8F, -14F, 19F, 6, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F); // Box 534
		bodyModel[311].setRotationPoint(0F, 0F, 0F);

		bodyModel[312].addShapeBox(-5F, -15F, -25F, 9, 5, 6, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 535
		bodyModel[312].setRotationPoint(0F, 0F, 0F);

		bodyModel[313].addShapeBox(4F, -15F, -24F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[313].setRotationPoint(0F, 0F, 0F);

		bodyModel[314].addShapeBox(5F, -15F, -24F, 1, 4, 5, 0F,0F, 0F, 0F, 6F, 0F, -4.5F, 6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[314].setRotationPoint(0F, 0F, 0F);

		bodyModel[315].addShapeBox(-12F, -15F, -22F, 7, 4, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[315].setRotationPoint(0F, 0F, 0F);

		bodyModel[316].addShapeBox(-17F, -15F, -20F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[316].setRotationPoint(0F, 0F, 0F);

		bodyModel[317].addShapeBox(41F, -12.5F, 33F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1073
		bodyModel[317].setRotationPoint(0F, 0F, 0F);

		bodyModel[318].addShapeBox(47F, -12.5F, 33F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1074
		bodyModel[318].setRotationPoint(0F, 0F, 0F);

		bodyModel[319].addShapeBox(47F, -12.5F, 30F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1075
		bodyModel[319].setRotationPoint(0F, 0F, 0F);

		bodyModel[320].addShapeBox(41F, -12.5F, 30F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1076
		bodyModel[320].setRotationPoint(0F, 0F, 0F);

		bodyModel[321].addShapeBox(47.5F, -12.5F, 31F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1077
		bodyModel[321].setRotationPoint(0F, 0F, 0F);

		bodyModel[322].addShapeBox(41.5F, -12.5F, 31F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1078
		bodyModel[322].setRotationPoint(0F, 0F, 0F);

		bodyModel[323].addShapeBox(35F, -13.5F, 31F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1079
		bodyModel[323].setRotationPoint(0F, 0F, 0F);

		bodyModel[324].addShapeBox(29F, -13.5F, 31F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1080
		bodyModel[324].setRotationPoint(0F, 0F, 0F);

		bodyModel[325].addShapeBox(34.5F, -13.5F, 33F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1081
		bodyModel[325].setRotationPoint(0F, 0F, 0F);

		bodyModel[326].addShapeBox(34.5F, -13.5F, 30F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1082
		bodyModel[326].setRotationPoint(0F, 0F, 0F);

		bodyModel[327].addShapeBox(28.5F, -13.5F, 30F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1083
		bodyModel[327].setRotationPoint(0F, 0F, 0F);

		bodyModel[328].addShapeBox(28.5F, -13.5F, 33F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1084
		bodyModel[328].setRotationPoint(0F, 0F, 0F);

		bodyModel[329].addShapeBox(26.5F, -12.5F, 33F, 12, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 1085
		bodyModel[329].setRotationPoint(0F, 0F, 0F);

		bodyModel[330].addShapeBox(22.5F, -14.5F, 31F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1086
		bodyModel[330].setRotationPoint(0F, 0F, 0F);

		bodyModel[331].addShapeBox(16.5F, -14.5F, 31F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1087
		bodyModel[331].setRotationPoint(0F, 0F, 0F);

		bodyModel[332].addShapeBox(22F, -14.5F, 33F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1088
		bodyModel[332].setRotationPoint(0F, 0F, 0F);

		bodyModel[333].addShapeBox(22F, -14.5F, 30F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1089
		bodyModel[333].setRotationPoint(0F, 0F, 0F);

		bodyModel[334].addShapeBox(16F, -14.5F, 30F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1090
		bodyModel[334].setRotationPoint(0F, 0F, 0F);

		bodyModel[335].addShapeBox(16F, -14.5F, 33F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1091
		bodyModel[335].setRotationPoint(0F, 0F, 0F);

		bodyModel[336].addShapeBox(14F, -13.5F, 33F, 12, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 1092
		bodyModel[336].setRotationPoint(0F, 0F, 0F);

		bodyModel[337].addShapeBox(22.5F, -14.5F, -33F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1093
		bodyModel[337].setRotationPoint(0F, 0F, 0F);

		bodyModel[338].addShapeBox(16.5F, -14.5F, -33F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1094
		bodyModel[338].setRotationPoint(0F, 0F, 0F);

		bodyModel[339].addShapeBox(22F, -14.5F, -31F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1095
		bodyModel[339].setRotationPoint(0F, 0F, 0F);

		bodyModel[340].addShapeBox(22F, -14.5F, -34F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1096
		bodyModel[340].setRotationPoint(0F, 0F, 0F);

		bodyModel[341].addShapeBox(16F, -14.5F, -34F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1097
		bodyModel[341].setRotationPoint(0F, 0F, 0F);

		bodyModel[342].addShapeBox(16F, -14.5F, -31F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1098
		bodyModel[342].setRotationPoint(0F, 0F, 0F);

		bodyModel[343].addShapeBox(14F, -13.5F, -34F, 12, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 1099
		bodyModel[343].setRotationPoint(0F, 0F, 0F);

		bodyModel[344].addShapeBox(26.5F, -12.5F, -34F, 12, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 1100
		bodyModel[344].setRotationPoint(0F, 0F, 0F);

		bodyModel[345].addShapeBox(28.5F, -13.5F, -31F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1101
		bodyModel[345].setRotationPoint(0F, 0F, 0F);

		bodyModel[346].addShapeBox(29F, -13.5F, -33F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1102
		bodyModel[346].setRotationPoint(0F, 0F, 0F);

		bodyModel[347].addShapeBox(28.5F, -13.5F, -34F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1103
		bodyModel[347].setRotationPoint(0F, 0F, 0F);

		bodyModel[348].addShapeBox(34.5F, -13.5F, -34F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1104
		bodyModel[348].setRotationPoint(0F, 0F, 0F);

		bodyModel[349].addShapeBox(35F, -13.5F, -33F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1105
		bodyModel[349].setRotationPoint(0F, 0F, 0F);

		bodyModel[350].addShapeBox(34.5F, -13.5F, -31F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1106
		bodyModel[350].setRotationPoint(0F, 0F, 0F);

		bodyModel[351].addShapeBox(41F, -12.5F, -31F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1107
		bodyModel[351].setRotationPoint(0F, 0F, 0F);

		bodyModel[352].addShapeBox(41.5F, -12.5F, -33F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1108
		bodyModel[352].setRotationPoint(0F, 0F, 0F);

		bodyModel[353].addShapeBox(41F, -12.5F, -34F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1109
		bodyModel[353].setRotationPoint(0F, 0F, 0F);

		bodyModel[354].addShapeBox(47F, -12.5F, -34F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1110
		bodyModel[354].setRotationPoint(0F, 0F, 0F);

		bodyModel[355].addShapeBox(47.5F, -12.5F, -33F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1111
		bodyModel[355].setRotationPoint(0F, 0F, 0F);

		bodyModel[356].addShapeBox(47F, -12.5F, -31F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1112
		bodyModel[356].setRotationPoint(0F, 0F, 0F);

		bodyModel[357].addShapeBox(39F, -11.5F, -34F, 12, 7, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 1113
		bodyModel[357].setRotationPoint(0F, 0F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 542
		turretModel[1] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Box 543
		turretModel[2] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 544
		turretModel[3] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 545
		turretModel[4] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 546
		turretModel[5] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 548
		turretModel[6] = new ModelRendererTurbo(this, 545, 105, textureX, textureY); // Box 549
		turretModel[7] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 550
		turretModel[8] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 551
		turretModel[9] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 552
		turretModel[10] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 553
		turretModel[11] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 554
		turretModel[12] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 555
		turretModel[13] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 556
		turretModel[14] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 557
		turretModel[15] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 558
		turretModel[16] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 559
		turretModel[17] = new ModelRendererTurbo(this, 929, 145, textureX, textureY); // Box 561
		turretModel[18] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 562
		turretModel[19] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 563
		turretModel[20] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 565
		turretModel[21] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 566
		turretModel[22] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 567
		turretModel[23] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 568
		turretModel[24] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 569
		turretModel[25] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 570
		turretModel[26] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 571
		turretModel[27] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 572
		turretModel[28] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 574
		turretModel[29] = new ModelRendererTurbo(this, 745, 97, textureX, textureY); // Box 575
		turretModel[30] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 576
		turretModel[31] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 577
		turretModel[32] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 578
		turretModel[33] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 579
		turretModel[34] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 580
		turretModel[35] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 581
		turretModel[36] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 582
		turretModel[37] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 583
		turretModel[38] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 584
		turretModel[39] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 585
		turretModel[40] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 586
		turretModel[41] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 587
		turretModel[42] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 588
		turretModel[43] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 589
		turretModel[44] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 590
		turretModel[45] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Box 591
		turretModel[46] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 592
		turretModel[47] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 593
		turretModel[48] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 594
		turretModel[49] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 595
		turretModel[50] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 596
		turretModel[51] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 598
		turretModel[52] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 599
		turretModel[53] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 612
		turretModel[54] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 613
		turretModel[55] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 614
		turretModel[56] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 615
		turretModel[57] = new ModelRendererTurbo(this, 545, 137, textureX, textureY); // Box 616
		turretModel[58] = new ModelRendererTurbo(this, 801, 137, textureX, textureY); // Box 617
		turretModel[59] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 619
		turretModel[60] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 620
		turretModel[61] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 621
		turretModel[62] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 622
		turretModel[63] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 623
		turretModel[64] = new ModelRendererTurbo(this, 457, 153, textureX, textureY); // Box 624
		turretModel[65] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 625
		turretModel[66] = new ModelRendererTurbo(this, 569, 153, textureX, textureY); // Box 626
		turretModel[67] = new ModelRendererTurbo(this, 609, 153, textureX, textureY); // Box 627
		turretModel[68] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 628
		turretModel[69] = new ModelRendererTurbo(this, 945, 145, textureX, textureY); // Box 629
		turretModel[70] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 630
		turretModel[71] = new ModelRendererTurbo(this, 625, 153, textureX, textureY); // Box 632
		turretModel[72] = new ModelRendererTurbo(this, 673, 153, textureX, textureY); // Box 633
		turretModel[73] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 634
		turretModel[74] = new ModelRendererTurbo(this, 953, 65, textureX, textureY); // Box 639
		turretModel[75] = new ModelRendererTurbo(this, 857, 73, textureX, textureY); // Box 640
		turretModel[76] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 641
		turretModel[77] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 642
		turretModel[78] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 643
		turretModel[79] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 644
		turretModel[80] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 645
		turretModel[81] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 646
		turretModel[82] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 648
		turretModel[83] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 649
		turretModel[84] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 650
		turretModel[85] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 664
		turretModel[86] = new ModelRendererTurbo(this, 657, 153, textureX, textureY); // Box 665
		turretModel[87] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 666
		turretModel[88] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 667
		turretModel[89] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 668
		turretModel[90] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 669
		turretModel[91] = new ModelRendererTurbo(this, 593, 153, textureX, textureY); // Box 670
		turretModel[92] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 671
		turretModel[93] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 672
		turretModel[94] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 673
		turretModel[95] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Box 674
		turretModel[96] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 675
		turretModel[97] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 676
		turretModel[98] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 677
		turretModel[99] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 678
		turretModel[100] = new ModelRendererTurbo(this, 857, 97, textureX, textureY); // Box 679
		turretModel[101] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 680
		turretModel[102] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 681
		turretModel[103] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 685
		turretModel[104] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 686
		turretModel[105] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 687
		turretModel[106] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 688
		turretModel[107] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 689
		turretModel[108] = new ModelRendererTurbo(this, 137, 129, textureX, textureY); // Box 690
		turretModel[109] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 691
		turretModel[110] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 692
		turretModel[111] = new ModelRendererTurbo(this, 609, 89, textureX, textureY); // Box 693
		turretModel[112] = new ModelRendererTurbo(this, 521, 89, textureX, textureY); // Box 694
		turretModel[113] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 695
		turretModel[114] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 696
		turretModel[115] = new ModelRendererTurbo(this, 601, 81, textureX, textureY); // Box 697
		turretModel[116] = new ModelRendererTurbo(this, 769, 81, textureX, textureY); // Box 698
		turretModel[117] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 699
		turretModel[118] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 700
		turretModel[119] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 701
		turretModel[120] = new ModelRendererTurbo(this, 321, 105, textureX, textureY); // Box 702
		turretModel[121] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 703
		turretModel[122] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 704
		turretModel[123] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 705
		turretModel[124] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Box 706
		turretModel[125] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Box 707
		turretModel[126] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 708
		turretModel[127] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 709
		turretModel[128] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 710
		turretModel[129] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 711
		turretModel[130] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 712
		turretModel[131] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 713
		turretModel[132] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 714
		turretModel[133] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 715
		turretModel[134] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 716
		turretModel[135] = new ModelRendererTurbo(this, 473, 105, textureX, textureY); // Box 717
		turretModel[136] = new ModelRendererTurbo(this, 801, 97, textureX, textureY); // Box 718
		turretModel[137] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 719
		turretModel[138] = new ModelRendererTurbo(this, 681, 105, textureX, textureY); // Box 720
		turretModel[139] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 721
		turretModel[140] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 722
		turretModel[141] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 723
		turretModel[142] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 724
		turretModel[143] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 725
		turretModel[144] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 726
		turretModel[145] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 727
		turretModel[146] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 728
		turretModel[147] = new ModelRendererTurbo(this, 249, 161, textureX, textureY); // Box 729
		turretModel[148] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 730
		turretModel[149] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 731
		turretModel[150] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 732
		turretModel[151] = new ModelRendererTurbo(this, 769, 129, textureX, textureY); // Box 733
		turretModel[152] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 734
		turretModel[153] = new ModelRendererTurbo(this, 817, 161, textureX, textureY); // Box 735
		turretModel[154] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 736
		turretModel[155] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 737
		turretModel[156] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 738
		turretModel[157] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 744
		turretModel[158] = new ModelRendererTurbo(this, 257, 137, textureX, textureY); // Box 745
		turretModel[159] = new ModelRendererTurbo(this, 593, 169, textureX, textureY); // Box 746
		turretModel[160] = new ModelRendererTurbo(this, 545, 169, textureX, textureY); // Box 747
		turretModel[161] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 756
		turretModel[162] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 757
		turretModel[163] = new ModelRendererTurbo(this, 713, 169, textureX, textureY); // Box 758
		turretModel[164] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Box 759
		turretModel[165] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 760
		turretModel[166] = new ModelRendererTurbo(this, 841, 161, textureX, textureY); // Box 761
		turretModel[167] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Box 762
		turretModel[168] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 763
		turretModel[169] = new ModelRendererTurbo(this, 713, 105, textureX, textureY); // Box 764
		turretModel[170] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 765
		turretModel[171] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 766
		turretModel[172] = new ModelRendererTurbo(this, 833, 105, textureX, textureY); // Box 767
		turretModel[173] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 768
		turretModel[174] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 769
		turretModel[175] = new ModelRendererTurbo(this, 1009, 105, textureX, textureY); // Box 770
		turretModel[176] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 771
		turretModel[177] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 772
		turretModel[178] = new ModelRendererTurbo(this, 537, 169, textureX, textureY); // Box 773
		turretModel[179] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 774
		turretModel[180] = new ModelRendererTurbo(this, 425, 113, textureX, textureY); // Box 775
		turretModel[181] = new ModelRendererTurbo(this, 537, 113, textureX, textureY); // Box 776
		turretModel[182] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 777
		turretModel[183] = new ModelRendererTurbo(this, 865, 113, textureX, textureY); // Box 780
		turretModel[184] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 781
		turretModel[185] = new ModelRendererTurbo(this, 745, 169, textureX, textureY); // Box 782
		turretModel[186] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 783
		turretModel[187] = new ModelRendererTurbo(this, 177, 177, textureX, textureY); // Box 784
		turretModel[188] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 785
		turretModel[189] = new ModelRendererTurbo(this, 1009, 113, textureX, textureY); // Box 786
		turretModel[190] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 787
		turretModel[191] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 788
		turretModel[192] = new ModelRendererTurbo(this, 905, 113, textureX, textureY); // Box 789
		turretModel[193] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 790
		turretModel[194] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 791
		turretModel[195] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 792
		turretModel[196] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 793
		turretModel[197] = new ModelRendererTurbo(this, 545, 121, textureX, textureY); // Box 794
		turretModel[198] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 797
		turretModel[199] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 798
		turretModel[200] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 799
		turretModel[201] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 800
		turretModel[202] = new ModelRendererTurbo(this, 833, 121, textureX, textureY); // Box 801
		turretModel[203] = new ModelRendererTurbo(this, 865, 121, textureX, textureY); // Box 802
		turretModel[204] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 803
		turretModel[205] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 804
		turretModel[206] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 805
		turretModel[207] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 806
		turretModel[208] = new ModelRendererTurbo(this, 417, 129, textureX, textureY); // Box 807
		turretModel[209] = new ModelRendererTurbo(this, 729, 129, textureX, textureY); // Box 808
		turretModel[210] = new ModelRendererTurbo(this, 945, 129, textureX, textureY); // Box 809
		turretModel[211] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 810
		turretModel[212] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 812
		turretModel[213] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 813
		turretModel[214] = new ModelRendererTurbo(this, 513, 137, textureX, textureY); // Box 814
		turretModel[215] = new ModelRendererTurbo(this, 569, 137, textureX, textureY); // Box 819
		turretModel[216] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 842
		turretModel[217] = new ModelRendererTurbo(this, 361, 177, textureX, textureY); // Box 843
		turretModel[218] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 844
		turretModel[219] = new ModelRendererTurbo(this, 785, 169, textureX, textureY); // Box 845
		turretModel[220] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 894
		turretModel[221] = new ModelRendererTurbo(this, 729, 137, textureX, textureY); // Box 895
		turretModel[222] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 985
		turretModel[223] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 986
		turretModel[224] = new ModelRendererTurbo(this, 897, 145, textureX, textureY); // Box 987
		turretModel[225] = new ModelRendererTurbo(this, 945, 145, textureX, textureY); // Box 988
		turretModel[226] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 989
		turretModel[227] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 990
		turretModel[228] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 991
		turretModel[229] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 992
		turretModel[230] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Box 993
		turretModel[231] = new ModelRendererTurbo(this, 289, 185, textureX, textureY); // Box 994
		turretModel[232] = new ModelRendererTurbo(this, 753, 185, textureX, textureY); // Box 923
		turretModel[233] = new ModelRendererTurbo(this, 865, 185, textureX, textureY); // Box 937
		turretModel[234] = new ModelRendererTurbo(this, 1009, 153, textureX, textureY); // Box 938
		turretModel[235] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 939
		turretModel[236] = new ModelRendererTurbo(this, 961, 145, textureX, textureY); // Box 940
		turretModel[237] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 941
		turretModel[238] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 942
		turretModel[239] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 943
		turretModel[240] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 944
		turretModel[241] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 945
		turretModel[242] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 946
		turretModel[243] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 947
		turretModel[244] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 948
		turretModel[245] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 949
		turretModel[246] = new ModelRendererTurbo(this, 849, 185, textureX, textureY); // Box 560
		turretModel[247] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 951
		turretModel[248] = new ModelRendererTurbo(this, 657, 185, textureX, textureY); // Box 952
		turretModel[249] = new ModelRendererTurbo(this, 689, 185, textureX, textureY); // Box 953
		turretModel[250] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 954
		turretModel[251] = new ModelRendererTurbo(this, 713, 185, textureX, textureY); // Box 955
		turretModel[252] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 956
		turretModel[253] = new ModelRendererTurbo(this, 33, 193, textureX, textureY); // Box 957
		turretModel[254] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 958
		turretModel[255] = new ModelRendererTurbo(this, 913, 193, textureX, textureY); // Box 959
		turretModel[256] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 960
		turretModel[257] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 961
		turretModel[258] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 962
		turretModel[259] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Box 963
		turretModel[260] = new ModelRendererTurbo(this, 961, 193, textureX, textureY); // Box 964
		turretModel[261] = new ModelRendererTurbo(this, 993, 193, textureX, textureY); // Box 965
		turretModel[262] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 966
		turretModel[263] = new ModelRendererTurbo(this, 729, 153, textureX, textureY); // Box 967
		turretModel[264] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Box 968
		turretModel[265] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 969
		turretModel[266] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 970
		turretModel[267] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 971
		turretModel[268] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 972
		turretModel[269] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 973
		turretModel[270] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 974
		turretModel[271] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 975
		turretModel[272] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 976
		turretModel[273] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 977
		turretModel[274] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Box 978
		turretModel[275] = new ModelRendererTurbo(this, 793, 153, textureX, textureY); // Box 979
		turretModel[276] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 980
		turretModel[277] = new ModelRendererTurbo(this, 961, 105, textureX, textureY); // Box 981
		turretModel[278] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 982
		turretModel[279] = new ModelRendererTurbo(this, 753, 201, textureX, textureY); // Box 983
		turretModel[280] = new ModelRendererTurbo(this, 785, 201, textureX, textureY); // Box 984
		turretModel[281] = new ModelRendererTurbo(this, 817, 201, textureX, textureY); // Box 985
		turretModel[282] = new ModelRendererTurbo(this, 849, 201, textureX, textureY); // Box 986
		turretModel[283] = new ModelRendererTurbo(this, 913, 201, textureX, textureY); // Box 987
		turretModel[284] = new ModelRendererTurbo(this, 945, 201, textureX, textureY); // Box 988
		turretModel[285] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 989
		turretModel[286] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 990
		turretModel[287] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 991
		turretModel[288] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 992
		turretModel[289] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 993
		turretModel[290] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 994
		turretModel[291] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 995
		turretModel[292] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 996
		turretModel[293] = new ModelRendererTurbo(this, 817, 161, textureX, textureY); // Box 997
		turretModel[294] = new ModelRendererTurbo(this, 121, 169, textureX, textureY); // Box 998
		turretModel[295] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 999
		turretModel[296] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 1001
		turretModel[297] = new ModelRendererTurbo(this, 985, 169, textureX, textureY); // Box 1002
		turretModel[298] = new ModelRendererTurbo(this, 1009, 169, textureX, textureY); // Box 1003
		turretModel[299] = new ModelRendererTurbo(this, 929, 113, textureX, textureY); // Box 1004
		turretModel[300] = new ModelRendererTurbo(this, 609, 121, textureX, textureY); // Box 1005
		turretModel[301] = new ModelRendererTurbo(this, 633, 121, textureX, textureY); // Box 1006
		turretModel[302] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 1007
		turretModel[303] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 1008
		turretModel[304] = new ModelRendererTurbo(this, 41, 225, textureX, textureY); // Import Box163
		turretModel[305] = new ModelRendererTurbo(this, 865, 201, textureX, textureY); // Import Box165
		turretModel[306] = new ModelRendererTurbo(this, 881, 201, textureX, textureY); // Import Box166
		turretModel[307] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 971
		turretModel[308] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 974

		turretModel[0].addShapeBox(-6F, -17.5F, -22F, 6, 3, 44, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 542
		turretModel[0].setRotationPoint(0F, 0F, 0F);

		turretModel[1].addShapeBox(-10F, -17.5F, -21F, 4, 3, 42, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 543
		turretModel[1].setRotationPoint(0F, 0F, 0F);

		turretModel[2].addShapeBox(-14F, -17.5F, -19F, 4, 3, 38, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 544
		turretModel[2].setRotationPoint(0F, 0F, 0F);

		turretModel[3].addShapeBox(-19F, -17.5F, -16F, 5, 3, 32, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 545
		turretModel[3].setRotationPoint(0F, 0F, 0F);

		turretModel[4].addShapeBox(-23F, -17.5F, -11F, 4, 3, 22, 0F,0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 546
		turretModel[4].setRotationPoint(0F, 0F, 0F);

		turretModel[5].addShapeBox(0F, -17.5F, -22F, 5, 3, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 548
		turretModel[5].setRotationPoint(0F, 0F, 0F);

		turretModel[6].addShapeBox(5F, -17.5F, -22F, 6, 3, 44, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 549
		turretModel[6].setRotationPoint(0F, 0F, 0F);

		turretModel[7].addShapeBox(11F, -17.5F, -21F, 5, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -2F, 0F, -0.8F, -2F, 0F, 0F, 0F); // Box 550
		turretModel[7].setRotationPoint(0F, 0F, 0F);

		turretModel[8].addShapeBox(16F, -17.5F, -19F, 4, 3, 38, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -4F, 0F, -0.8F, -4F, 0F, -0.8F, 0F); // Box 551
		turretModel[8].setRotationPoint(0F, 0F, 0F);

		turretModel[9].addShapeBox(20F, -17.5F, -15F, 2, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 552
		turretModel[9].setRotationPoint(0F, 0F, 0F);

		turretModel[10].addShapeBox(20F, -17.5F, 3F, 2, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -4F, 0F, -0.7F, 0F); // Box 553
		turretModel[10].setRotationPoint(0F, 0F, 0F);

		turretModel[11].addShapeBox(-6F, -21.5F, -22F, 6, 4, 44, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 554
		turretModel[11].setRotationPoint(0F, 0F, 0F);

		turretModel[12].addShapeBox(-10F, -21.5F, -21F, 4, 4, 42, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 555
		turretModel[12].setRotationPoint(0F, 0F, 0F);

		turretModel[13].addShapeBox(-14F, -21.5F, -19F, 4, 4, 38, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 556
		turretModel[13].setRotationPoint(0F, 0F, 0F);

		turretModel[14].addShapeBox(-19F, -21.5F, -16F, 5, 4, 32, 0F,0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 557
		turretModel[14].setRotationPoint(0F, 0F, 0F);

		turretModel[15].addShapeBox(-23F, -21.5F, -11F, 4, 4, 22, 0F,1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 558
		turretModel[15].setRotationPoint(0F, 0F, 0F);

		turretModel[16].addShapeBox(0F, -21.5F, -22F, 5, 4, 44, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		turretModel[16].setRotationPoint(0F, 0F, 0F);

		turretModel[17].addShapeBox(11F, -21.5F, -21F, 5, 4, 42, 0F,0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 561
		turretModel[17].setRotationPoint(0F, 0F, 0F);

		turretModel[18].addShapeBox(16F, -21.5F, -19F, 4, 4, 38, 0F,0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 562
		turretModel[18].setRotationPoint(0F, 0F, 0F);

		turretModel[19].addShapeBox(20F, -21.5F, -15F, 2, 4, 12, 0F,0F, 0F, -2F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 563
		turretModel[19].setRotationPoint(0F, 0F, 0F);

		turretModel[20].addShapeBox(20F, -21.5F, 3F, 2, 4, 12, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 565
		turretModel[20].setRotationPoint(0F, 0F, 0F);

		turretModel[21].addShapeBox(0F, -25.5F, -22F, 5, 4, 19, 0F,0F, 0F, -5F, 0F, 0F, -10F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 566
		turretModel[21].setRotationPoint(0F, 0F, 0F);

		turretModel[22].addShapeBox(0F, -25.5F, 2F, 5, 4, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 567
		turretModel[22].setRotationPoint(0F, 0F, 0F);

		turretModel[23].addShapeBox(5F, -25.5F, -22F, 6, 4, 18, 0F,0F, 0F, -10F, 0F, -1F, -13F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		turretModel[23].setRotationPoint(0F, 0F, 0F);

		turretModel[24].addShapeBox(5F, -25.5F, 3F, 6, 4, 19, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -11F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 569
		turretModel[24].setRotationPoint(0F, 0F, 0F);

		turretModel[25].addShapeBox(11F, -24.5F, -20F, 5, 3, 16, 0F,0F, 0F, -11F, 0F, -1F, -11F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 570
		turretModel[25].setRotationPoint(0F, 0F, 0F);

		turretModel[26].addShapeBox(11F, -24.5F, 3F, 5, 3, 17, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -9F, 0F, -1F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 571
		turretModel[26].setRotationPoint(0F, 0F, 0F);

		turretModel[27].addShapeBox(16F, -24.5F, -17F, 4, 3, 13, 0F,0F, -1F, -8F, 0F, -2F, -8F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 572
		turretModel[27].setRotationPoint(0F, 0F, 0F);

		turretModel[28].addShapeBox(16F, -24.5F, 3F, 4, 3, 14, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -2.5F, -6F, 0F, -1.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 574
		turretModel[28].setRotationPoint(0F, 0F, 0F);

		turretModel[29].addShapeBox(20F, -22.5F, -13F, 1, 1, 10, 0F,0F, 0F, -4F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 575
		turretModel[29].setRotationPoint(0F, 0F, 0F);

		turretModel[30].addShapeBox(20F, -22.5F, 3F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -4.5F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 576
		turretModel[30].setRotationPoint(0F, 0F, 0F);

		turretModel[31].addShapeBox(-6F, -25.5F, -21F, 6, 4, 17, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 577
		turretModel[31].setRotationPoint(0F, 0F, 0F);

		turretModel[32].addShapeBox(-6F, -25.5F, 3F, 6, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 578
		turretModel[32].setRotationPoint(0F, 0F, 0F);

		turretModel[33].addShapeBox(-10F, -25.5F, -20F, 4, 4, 16, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 579
		turretModel[33].setRotationPoint(0F, 0F, 0F);

		turretModel[34].addShapeBox(-10F, -25.5F, 3F, 4, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 580
		turretModel[34].setRotationPoint(0F, 0F, 0F);

		turretModel[35].addShapeBox(-14F, -25.5F, -18F, 4, 4, 14, 0F,0F, -1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 581
		turretModel[35].setRotationPoint(0F, 0F, 0F);

		turretModel[36].addShapeBox(-14F, -25.5F, 3F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 582
		turretModel[36].setRotationPoint(0F, 0F, 0F);

		turretModel[37].addShapeBox(-19F, -24.5F, -15F, 5, 3, 11, 0F,0F, -1F, -5F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 583
		turretModel[37].setRotationPoint(0F, 0F, 0F);

		turretModel[38].addShapeBox(-19F, -24.5F, 3F, 5, 3, 11, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 584
		turretModel[38].setRotationPoint(0F, 0F, 0F);

		turretModel[39].addShapeBox(-23F, -25.5F, -12F, 4, 4, 8, 0F,0F, -2F, -7F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 585
		turretModel[39].setRotationPoint(0F, 0F, 0F);

		turretModel[40].addShapeBox(-23F, -25.5F, 3F, 4, 4, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -6F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -6F); // Box 586
		turretModel[40].setRotationPoint(0F, 0F, 0F);

		turretModel[41].addShapeBox(11F, -24.5F, -4F, 5, 5, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 587
		turretModel[41].setRotationPoint(0F, 0F, 0F);

		turretModel[42].addShapeBox(16F, -23.5F, -4F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		turretModel[42].setRotationPoint(0F, 0F, 0F);

		turretModel[43].addShapeBox(5F, -25.5F, -4F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 589
		turretModel[43].setRotationPoint(0F, 0F, 0F);

		turretModel[44].addShapeBox(0F, -25.5F, -4F, 5, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 590
		turretModel[44].setRotationPoint(0F, 0F, 0F);

		turretModel[45].addShapeBox(-6F, -25.5F, -4F, 6, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 591
		turretModel[45].setRotationPoint(0F, 0F, 0F);

		turretModel[46].addShapeBox(-10F, -25.5F, -4F, 4, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 592
		turretModel[46].setRotationPoint(0F, 0F, 0F);

		turretModel[47].addShapeBox(-14F, -25.5F, -4F, 4, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		turretModel[47].setRotationPoint(0F, 0F, 0F);

		turretModel[48].addShapeBox(-19F, -25.5F, -4F, 5, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 594
		turretModel[48].setRotationPoint(0F, 0F, 0F);

		turretModel[49].addShapeBox(-24F, -25.5F, -4F, 5, 4, 7, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		turretModel[49].setRotationPoint(0F, 0F, 0F);

		turretModel[50].addShapeBox(-11F, -28.5F, -4F, 11, 3, 7, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F); // Box 596
		turretModel[50].setRotationPoint(0F, 0F, 0F);

		turretModel[51].addShapeBox(-2F, -27.5F, 8.5F, 5, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 598
		turretModel[51].setRotationPoint(0F, 0F, 0F);

		turretModel[52].addShapeBox(3F, -26.5F, 8.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 599
		turretModel[52].setRotationPoint(0F, 0F, 0F);

		turretModel[53].addShapeBox(0F, -28.5F, -4F, 5, 3, 7, 0F,0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 612
		turretModel[53].setRotationPoint(0F, 0F, 0F);

		turretModel[54].addShapeBox(5F, -26.5F, -4F, 6, 1, 7, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 613
		turretModel[54].setRotationPoint(0F, 0F, 0F);

		turretModel[55].addShapeBox(11F, -25.5F, -4F, 5, 1, 7, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 614
		turretModel[55].setRotationPoint(0F, 0F, 0F);

		turretModel[56].addShapeBox(11F, -25.5F, -9F, 5, 1, 5, 0F,0F, -0.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 615
		turretModel[56].setRotationPoint(0F, 0F, 0F);

		turretModel[57].addShapeBox(11F, -25.5F, 3F, 5, 1, 8, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1F, 0F); // Box 616
		turretModel[57].setRotationPoint(0F, 0F, 0F);

		turretModel[58].addShapeBox(5F, -26.5F, -12F, 6, 1, 8, 0F,0F, -0.5F, -5F, 0F, -1.5F, -6F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 617
		turretModel[58].setRotationPoint(0F, 0F, 0F);

		turretModel[59].addShapeBox(5F, -26.5F, 3F, 6, 1, 13, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -8F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, -5F, 0F, 0F, 0F); // Box 619
		turretModel[59].setRotationPoint(0F, 0F, 0F);

		turretModel[60].addShapeBox(0F, -28.5F, -17F, 5, 3, 13, 0F,0F, -1.5F, -2F, 0F, -2.5F, -10F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 620
		turretModel[60].setRotationPoint(0F, 0F, 0F);

		turretModel[61].addShapeBox(0F, -28.5F, 3F, 5, 3, 13, 0F,0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -0.5F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		turretModel[61].setRotationPoint(0F, 0F, 0F);

		turretModel[62].addShapeBox(-6F, -28.5F, -19F, 6, 3, 15, 0F,0F, -1.5F, -1.5F, 0F, -1.5F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 622
		turretModel[62].setRotationPoint(0F, 0F, 0F);

		turretModel[63].addShapeBox(-6F, -28.5F, 3F, 6, 3, 15, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -4F, 0F, -2.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 623
		turretModel[63].setRotationPoint(0F, 0F, 0F);

		turretModel[64].addShapeBox(-10F, -28.5F, -17F, 4, 3, 13, 0F,0F, -1.5F, -1F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 624
		turretModel[64].setRotationPoint(0F, 0F, 0F);

		turretModel[65].addShapeBox(-10F, -28.5F, 3F, 4, 3, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 1F); // Box 625
		turretModel[65].setRotationPoint(0F, 0F, 0F);

		turretModel[66].addShapeBox(-14F, -28.5F, -17F, 4, 3, 13, 0F,0F, -3F, -4F, 0F, -1.5F, -1F, 0F, -0.5F, 0F, 0F, -2.15F, 0F, 0F, 1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		turretModel[66].setRotationPoint(0F, 0F, 0F);

		turretModel[67].addShapeBox(-14F, -28.5F, 3F, 4, 3, 11, 0F,0F, -2.15F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -1F, 0F, -3.5F, -4F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -2F); // Box 627
		turretModel[67].setRotationPoint(0F, 0F, 0F);

		turretModel[68].addShapeBox(-16F, -26.5F, -14F, 2, 2, 10, 0F,-1F, -2F, -2.5F, 0F, -1F, -1F, 0F, -0.15F, 0F, 0F, -1F, 0F, 0F, 0.4F, -1.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		turretModel[68].setRotationPoint(0F, 0F, 0F);

		turretModel[69].addShapeBox(-16F, -26.5F, 3F, 2, 2, 9, 0F,0F, -1F, 0F, 0F, -0.15F, 0F, 0F, -1.5F, -2F, -1F, -2F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, -1.2F); // Box 629
		turretModel[69].setRotationPoint(0F, 0F, 0F);

		turretModel[70].addShapeBox(-6F, -29F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 630
		turretModel[70].setRotationPoint(0F, 0F, 0F);

		turretModel[71].addShapeBox(-8F, -29F, -19F, 6, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 632
		turretModel[71].setRotationPoint(0F, 0F, 0F);

		turretModel[72].addShapeBox(-14F, -29F, -19F, 6, 1, 17, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 633
		turretModel[72].setRotationPoint(0F, 0F, 0F);

		turretModel[73].addShapeBox(-2F, -29F, -19F, 5, 1, 17, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 634
		turretModel[73].setRotationPoint(0F, 0F, 0F);

		turretModel[74].addShapeBox(-4F, -30F, -15.5F, 2, 1, 1, 0F,-0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -0.25F, -0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F); // Box 639
		turretModel[74].setRotationPoint(0F, 0F, 0F);

		turretModel[75].addShapeBox(-4F, -30F, -7.5F, 2, 1, 1, 0F,0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F); // Box 640
		turretModel[75].setRotationPoint(0F, 0F, 0F);

		turretModel[76].addShapeBox(-9F, -28F, -17.5F, 7, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		turretModel[76].setRotationPoint(0F, 0F, 0F);

		turretModel[77].addShapeBox(-13F, -28F, -17.5F, 4, 3, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 642
		turretModel[77].setRotationPoint(0F, 0F, 0F);

		turretModel[78].addShapeBox(-2F, -28F, -17.5F, 4, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 643
		turretModel[78].setRotationPoint(0F, 0F, 0F);

		turretModel[79].addShapeBox(-16F, -27F, -14F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 644
		turretModel[79].setRotationPoint(0F, 0F, 0F);

		turretModel[80].addShapeBox(-16F, -26F, -12F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		turretModel[80].setRotationPoint(0F, 0F, 0F);

		turretModel[81].addShapeBox(-16F, -29F, -14F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 646
		turretModel[81].setRotationPoint(0F, 0F, 0F);

		turretModel[82].addShapeBox(-15F, -29.5F, -14F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 648
		turretModel[82].setRotationPoint(0F, 0F, 0F);

		turretModel[83].addShapeBox(-16F, -29F, -9F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 649
		turretModel[83].setRotationPoint(0F, 0F, 0F);

		turretModel[84].addShapeBox(-15F, -29.5F, -9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 650
		turretModel[84].setRotationPoint(0F, 0F, 0F);

		turretModel[85].addShapeBox(-7.5F, -28.5F, -1F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 664
		turretModel[85].setRotationPoint(0F, 0F, 0F);
		turretModel[85].rotateAngleX = -0.13962634F;
		turretModel[85].rotateAngleZ = 0.08726646F;

		turretModel[86].addShapeBox(-10.5F, -28.5F, -1F, 3, 2, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 665
		turretModel[86].setRotationPoint(0F, 0F, 0F);
		turretModel[86].rotateAngleX = -0.13962634F;
		turretModel[86].rotateAngleZ = 0.08726646F;

		turretModel[87].addShapeBox(-3.5F, -28.5F, -1F, 3, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 666
		turretModel[87].setRotationPoint(0F, 0F, 0F);
		turretModel[87].rotateAngleX = -0.13962634F;
		turretModel[87].rotateAngleZ = 0.08726646F;

		turretModel[88].addShapeBox(-1.5F, -29.5F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		turretModel[88].setRotationPoint(0F, 0F, 0F);
		turretModel[88].rotateAngleX = -0.13962634F;
		turretModel[88].rotateAngleZ = 0.08726646F;

		turretModel[89].addShapeBox(-1.5F, -29.5F, 5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 668
		turretModel[89].setRotationPoint(0F, 0F, 0F);
		turretModel[89].rotateAngleX = -0.13962634F;
		turretModel[89].rotateAngleZ = 0.08726646F;

		turretModel[90].addShapeBox(-1.5F, -29.5F, 1F, 1, 1, 6, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 669
		turretModel[90].setRotationPoint(0F, 0F, 0F);
		turretModel[90].rotateAngleX = -0.13962634F;
		turretModel[90].rotateAngleZ = 0.08726646F;

		turretModel[91].addShapeBox(-7.5F, -29.5F, -0.5F, 4, 1, 9, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 670
		turretModel[91].setRotationPoint(0F, 0F, 0F);
		turretModel[91].rotateAngleX = -0.13962634F;
		turretModel[91].rotateAngleZ = 0.08726646F;

		turretModel[92].addShapeBox(-10.5F, -29.5F, -0.5F, 3, 1, 9, 0F,-0.5F, -0.75F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 671
		turretModel[92].setRotationPoint(0F, 0F, 0F);
		turretModel[92].rotateAngleX = -0.13962634F;
		turretModel[92].rotateAngleZ = 0.08726646F;

		turretModel[93].addShapeBox(-3.5F, -29.5F, -0.5F, 3, 1, 9, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, -2F, -0.5F, -0.75F, -2F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 672
		turretModel[93].setRotationPoint(0F, 0F, 0F);
		turretModel[93].rotateAngleX = -0.13962634F;
		turretModel[93].rotateAngleZ = 0.08726646F;

		turretModel[94].addShapeBox(-8F, -29F, 1.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 673
		turretModel[94].setRotationPoint(0F, 0F, 0F);
		turretModel[94].rotateAngleX = -0.13962634F;
		turretModel[94].rotateAngleZ = 0.08726646F;

		turretModel[95].addShapeBox(-4F, -30F, -3F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 674
		turretModel[95].setRotationPoint(0F, 0F, 0F);
		turretModel[95].rotateAngleZ = 0.40142573F;

		turretModel[96].addShapeBox(-3F, -30F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 675
		turretModel[96].setRotationPoint(0F, 0F, 0F);
		turretModel[96].rotateAngleZ = 0.40142573F;

		turretModel[97].addShapeBox(-29F, -26F, -6F, 5, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 676
		turretModel[97].setRotationPoint(0F, 0F, 0F);

		turretModel[98].addShapeBox(-29F, -24F, -6F, 5, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F); // Box 677
		turretModel[98].setRotationPoint(0F, 0F, 0F);

		turretModel[99].addShapeBox(-29F, -26F, -10F, 5, 2, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		turretModel[99].setRotationPoint(0F, 0F, 0F);

		turretModel[100].addShapeBox(-24F, -26F, -9F, 3, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 679
		turretModel[100].setRotationPoint(0F, 0F, 0F);

		turretModel[101].addShapeBox(-24F, -26F, -10F, 3, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 680
		turretModel[101].setRotationPoint(0F, 0F, 0F);

		turretModel[102].addShapeBox(-24F, -26F, -7F, 3, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 681
		turretModel[102].setRotationPoint(0F, 0F, 0F);

		turretModel[103].addShapeBox(-29F, -26F, 7F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 685
		turretModel[103].setRotationPoint(0F, 0F, 0F);

		turretModel[104].addShapeBox(-29F, -24F, -10F, 5, 6, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 686
		turretModel[104].setRotationPoint(0F, 0F, 0F);

		turretModel[105].addShapeBox(-24F, -26F, 7F, 3, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 687
		turretModel[105].setRotationPoint(0F, 0F, 0F);

		turretModel[106].addShapeBox(-24F, -26F, 8F, 3, 7, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 688
		turretModel[106].setRotationPoint(0F, 0F, 0F);

		turretModel[107].addShapeBox(-24F, -26F, 10F, 3, 7, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 689
		turretModel[107].setRotationPoint(0F, 0F, 0F);

		turretModel[108].addShapeBox(-29F, -24F, 7F, 5, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 690
		turretModel[108].setRotationPoint(0F, 0F, 0F);

		turretModel[109].addShapeBox(-28.5F, -27F, -6F, 4, 1, 13, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 691
		turretModel[109].setRotationPoint(0F, 0F, 0F);

		turretModel[110].addShapeBox(-27.5F, -27F, -9.5F, 3, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 692
		turretModel[110].setRotationPoint(0F, 0F, 0F);

		turretModel[111].addShapeBox(-24.5F, -27F, -9.5F, 2, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		turretModel[111].setRotationPoint(0F, 0F, 0F);

		turretModel[112].addShapeBox(-22.5F, -27F, -9.5F, 1, 1, 3, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 694
		turretModel[112].setRotationPoint(0F, 0F, 0F);

		turretModel[113].addShapeBox(-29F, -27F, -5F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 695
		turretModel[113].setRotationPoint(0F, 0F, 0F);

		turretModel[114].addShapeBox(-29F, -27F, 5F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 696
		turretModel[114].setRotationPoint(0F, 0F, 0F);

		turretModel[115].addShapeBox(-29F, -27F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 697
		turretModel[115].setRotationPoint(0F, 0F, 0F);

		turretModel[116].addShapeBox(-28F, -27F, -8F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 698
		turretModel[116].setRotationPoint(0F, 0F, 0F);

		turretModel[117].addShapeBox(-24F, -27F, -7F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 699
		turretModel[117].setRotationPoint(0F, 0F, 0F);

		turretModel[118].addShapeBox(-26F, -26F, -13F, 3, 5, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 700
		turretModel[118].setRotationPoint(0F, 0F, 0F);

		turretModel[119].addShapeBox(-24F, -26F, -13F, 1, 5, 3, 0F,-0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.5F, 0F); // Box 701
		turretModel[119].setRotationPoint(0F, 0F, 0F);

		turretModel[120].addShapeBox(-27F, -26F, -13F, 2, 5, 3, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 702
		turretModel[120].setRotationPoint(0F, 0F, 0F);

		turretModel[121].addShapeBox(-28F, -24.5F, -12F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 703
		turretModel[121].setRotationPoint(0F, 0F, 0F);

		turretModel[122].addShapeBox(-30F, -26F, -6F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 704
		turretModel[122].setRotationPoint(0F, 0F, 0F);

		turretModel[123].addShapeBox(-30F, -26F, 5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 705
		turretModel[123].setRotationPoint(0F, 0F, 0F);

		turretModel[124].addShapeBox(-32F, -23F, -11F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 706
		turretModel[124].setRotationPoint(0F, 0F, 0F);

		turretModel[125].addShapeBox(-32F, -24F, -11F, 3, 1, 21, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 707
		turretModel[125].setRotationPoint(0F, 0F, 0F);

		turretModel[126].addShapeBox(-32F, -22F, -11F, 3, 1, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 708
		turretModel[126].setRotationPoint(0F, 0F, 0F);

		turretModel[127].addShapeBox(-32.5F, -24.5F, -12F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 709
		turretModel[127].setRotationPoint(0F, 0F, 0F);

		turretModel[128].addShapeBox(-32.5F, -23.5F, -12F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 710
		turretModel[128].setRotationPoint(0F, 0F, 0F);

		turretModel[129].addShapeBox(-32.5F, -21.5F, -12F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 711
		turretModel[129].setRotationPoint(0F, 0F, 0F);

		turretModel[130].addShapeBox(-32.5F, -23.5F, 10F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 712
		turretModel[130].setRotationPoint(0F, 0F, 0F);

		turretModel[131].addShapeBox(-32.5F, -24.5F, 10F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 713
		turretModel[131].setRotationPoint(0F, 0F, 0F);

		turretModel[132].addShapeBox(-32.5F, -21.5F, 10F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 714
		turretModel[132].setRotationPoint(0F, 0F, 0F);

		turretModel[133].addShapeBox(-31F, -26F, 5.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 715
		turretModel[133].setRotationPoint(0F, 0F, 0F);

		turretModel[134].addShapeBox(-31F, -26F, -5.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 716
		turretModel[134].setRotationPoint(0F, 0F, 0F);

		turretModel[135].addShapeBox(-20F, -26F, -6F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 717
		turretModel[135].setRotationPoint(0F, 0F, 0F);

		turretModel[136].addShapeBox(-19.5F, -30F, -5.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 718
		turretModel[136].setRotationPoint(0F, 0F, 0F);

		turretModel[137].addShapeBox(-17F, -26F, 8F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 719
		turretModel[137].setRotationPoint(0F, 0F, 0F);

		turretModel[138].addShapeBox(-17F, -30F, 8F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 720
		turretModel[138].setRotationPoint(0F, 0F, 0F);

		turretModel[139].addShapeBox(-19F, -29F, 7.5F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 721
		turretModel[139].setRotationPoint(0F, 0F, 0F);

		turretModel[140].addShapeBox(-19F, -28F, 7.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 722
		turretModel[140].setRotationPoint(0F, 0F, 0F);

		turretModel[141].addShapeBox(-19F, -27F, 7.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 723
		turretModel[141].setRotationPoint(0F, 0F, 0F);

		turretModel[142].addShapeBox(-17F, -29F, 10F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 724
		turretModel[142].setRotationPoint(0F, 0F, 0F);

		turretModel[143].addShapeBox(-17F, -35F, 11F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 725
		turretModel[143].setRotationPoint(0F, 0F, 0F);

		turretModel[144].addShapeBox(-16.5F, -39F, 11.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 726
		turretModel[144].setRotationPoint(0F, 0F, 0F);

		turretModel[145].addShapeBox(16F, -24.5F, -4F, 4, 1, 7, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 727
		turretModel[145].setRotationPoint(0F, 0F, 0F);

		turretModel[146].addShapeBox(16F, -24.5F, -9F, 4, 1, 5, 0F,0F, -0.5F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 728
		turretModel[146].setRotationPoint(0F, 0F, 0F);

		turretModel[147].addShapeBox(16F, -24.5F, 3F, 4, 1, 8, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F); // Box 729
		turretModel[147].setRotationPoint(0F, 0F, 0F);

		turretModel[148].addShapeBox(-0.5F, -26F, -24.6F, 3, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 730
		turretModel[148].setRotationPoint(0F, 0F, 0F);

		turretModel[149].addShapeBox(-0.5F, -22F, -21.6F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 731
		turretModel[149].setRotationPoint(0F, 0F, 0F);

		turretModel[150].addShapeBox(-27F, -25F, 6F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 732
		turretModel[150].setRotationPoint(0F, 0F, 0F);
		turretModel[150].rotateAngleY = -1.02974426F;

		turretModel[151].addShapeBox(-27F, -23F, 6F, 6, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 733
		turretModel[151].setRotationPoint(0F, 0F, 0F);
		turretModel[151].rotateAngleY = -1.02974426F;

		turretModel[152].addShapeBox(-27F, -26F, 4F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 734
		turretModel[152].setRotationPoint(0F, 0F, 0F);
		turretModel[152].rotateAngleY = -1.02974426F;

		turretModel[153].addShapeBox(-26.5F, -26F, -7F, 5, 1, 13, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 735
		turretModel[153].setRotationPoint(0F, 0F, 0F);
		turretModel[153].rotateAngleY = -1.02974426F;

		turretModel[154].addShapeBox(-27F, -26F, -1F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 736
		turretModel[154].setRotationPoint(0F, 0F, 0F);
		turretModel[154].rotateAngleY = -1.02974426F;

		turretModel[155].addShapeBox(-27F, -25F, -7F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 737
		turretModel[155].setRotationPoint(0F, 0F, 0F);
		turretModel[155].rotateAngleY = -1.02974426F;

		turretModel[156].addShapeBox(-27F, -26F, -6F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 738
		turretModel[156].setRotationPoint(0F, 0F, 0F);
		turretModel[156].rotateAngleY = -1.02974426F;

		turretModel[157].addShapeBox(-27F, -25F, -10F, 6, 2, 3, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 744
		turretModel[157].setRotationPoint(0F, 0F, 0F);
		turretModel[157].rotateAngleY = -1.02974426F;

		turretModel[158].addShapeBox(-27F, -23F, -10F, 6, 6, 3, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 745
		turretModel[158].setRotationPoint(0F, 0F, 0F);
		turretModel[158].rotateAngleY = -1.02974426F;

		turretModel[159].addShapeBox(-27F, -23F, -7F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F); // Box 746
		turretModel[159].setRotationPoint(0F, 0F, 0F);
		turretModel[159].rotateAngleY = -1.02974426F;

		turretModel[160].addShapeBox(-23F, -22F, -7F, 5, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 747
		turretModel[160].setRotationPoint(0F, 0F, 0F);
		turretModel[160].rotateAngleY = -1.02974426F;

		turretModel[161].addShapeBox(-27F, -25F, -10F, 6, 2, 3, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 756
		turretModel[161].setRotationPoint(0F, 0F, 0F);
		turretModel[161].rotateAngleY = 0.99483767F;

		turretModel[162].addShapeBox(-27F, -23F, -10F, 6, 6, 3, 0F,-1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.5F, 0F); // Box 757
		turretModel[162].setRotationPoint(0F, 0F, 0F);
		turretModel[162].rotateAngleY = 0.99483767F;

		turretModel[163].addShapeBox(-27F, -25F, -7F, 6, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 758
		turretModel[163].setRotationPoint(0F, 0F, 0F);
		turretModel[163].rotateAngleY = 0.99483767F;

		turretModel[164].addShapeBox(-27F, -23F, -7F, 6, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F); // Box 759
		turretModel[164].setRotationPoint(0F, 0F, 0F);
		turretModel[164].rotateAngleY = 0.99483767F;

		turretModel[165].addShapeBox(-27F, -25F, 6F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F); // Box 760
		turretModel[165].setRotationPoint(0F, 0F, 0F);
		turretModel[165].rotateAngleY = 0.99483767F;

		turretModel[166].addShapeBox(-27F, -23F, 6F, 6, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, -3F, -0.5F, 0F); // Box 761
		turretModel[166].setRotationPoint(0F, 0F, 0F);
		turretModel[166].rotateAngleY = 0.99483767F;

		turretModel[167].addShapeBox(-26.5F, -26F, -7F, 5, 1, 13, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		turretModel[167].setRotationPoint(0F, 0F, 0F);
		turretModel[167].rotateAngleY = 0.99483767F;

		turretModel[168].addShapeBox(-27F, -26F, 4F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 763
		turretModel[168].setRotationPoint(0F, 0F, 0F);
		turretModel[168].rotateAngleY = 0.99483767F;

		turretModel[169].addShapeBox(-27F, -26F, -1F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 764
		turretModel[169].setRotationPoint(0F, 0F, 0F);
		turretModel[169].rotateAngleY = 0.99483767F;

		turretModel[170].addShapeBox(-27F, -26F, -6F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 765
		turretModel[170].setRotationPoint(0F, 0F, 0F);
		turretModel[170].rotateAngleY = 0.99483767F;

		turretModel[171].addShapeBox(-23F, -22F, -7F, 5, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 766
		turretModel[171].setRotationPoint(0F, 0F, 0F);
		turretModel[171].rotateAngleY = 0.97738438F;

		turretModel[172].addShapeBox(-28F, -19F, -7F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 767
		turretModel[172].setRotationPoint(0F, 0F, 0F);
		turretModel[172].rotateAngleY = 0.99483767F;

		turretModel[173].addShapeBox(-28F, -19F, -2F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 768
		turretModel[173].setRotationPoint(0F, 0F, 0F);
		turretModel[173].rotateAngleY = 0.99483767F;

		turretModel[174].addShapeBox(-28F, -19F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 769
		turretModel[174].setRotationPoint(0F, 0F, 0F);
		turretModel[174].rotateAngleY = 0.99483767F;

		turretModel[175].addShapeBox(-28F, -19F, 5F, 4, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 770
		turretModel[175].setRotationPoint(0F, 0F, 0F);
		turretModel[175].rotateAngleY = 0.99483767F;

		turretModel[176].addShapeBox(-29F, -19F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F); // Box 771
		turretModel[176].setRotationPoint(0F, 0F, 0F);
		turretModel[176].rotateAngleY = 0.99483767F;

		turretModel[177].addShapeBox(-29F, -19F, -7F, 1, 1, 6, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.75F); // Box 772
		turretModel[177].setRotationPoint(0F, 0F, 0F);
		turretModel[177].rotateAngleY = 0.99483767F;

		turretModel[178].addShapeBox(14F, -19F, 18F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 773
		turretModel[178].setRotationPoint(0F, 0F, 0F);
		turretModel[178].rotateAngleZ = 0.66322512F;

		turretModel[179].addShapeBox(15F, -19F, 20F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 774
		turretModel[179].setRotationPoint(0F, 0F, 0F);
		turretModel[179].rotateAngleZ = 0.66322512F;

		turretModel[180].addShapeBox(19F, -19F, 20F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F); // Box 775
		turretModel[180].setRotationPoint(0F, 0F, 0F);
		turretModel[180].rotateAngleZ = 0.66322512F;

		turretModel[181].addShapeBox(19F, -19F, 22.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F); // Box 776
		turretModel[181].setRotationPoint(0F, 0F, 0F);
		turretModel[181].rotateAngleZ = 0.66322512F;

		turretModel[182].addShapeBox(15F, -19F, 22.5F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 777
		turretModel[182].setRotationPoint(0F, 0F, 0F);
		turretModel[182].rotateAngleZ = 0.66322512F;

		turretModel[183].addShapeBox(15F, -19F, 25F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 780
		turretModel[183].setRotationPoint(0F, 0F, 0F);
		turretModel[183].rotateAngleZ = 0.66322512F;

		turretModel[184].addShapeBox(19F, -19F, 25F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F); // Box 781
		turretModel[184].setRotationPoint(0F, 0F, 0F);
		turretModel[184].rotateAngleZ = 0.66322512F;

		turretModel[185].addShapeBox(13F, -19F, 18F, 1, 1, 9, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 782
		turretModel[185].setRotationPoint(0F, 0F, 0F);
		turretModel[185].rotateAngleZ = 0.66322512F;

		turretModel[186].addShapeBox(13F, -17F, 18F, 1, 1, 9, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 783
		turretModel[186].setRotationPoint(0F, 0F, 0F);
		turretModel[186].rotateAngleZ = 0.66322512F;

		turretModel[187].addShapeBox(14F, -17F, 18F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 784
		turretModel[187].setRotationPoint(0F, 0F, 0F);
		turretModel[187].rotateAngleZ = 0.66322512F;

		turretModel[188].addShapeBox(15F, -17F, 25F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 785
		turretModel[188].setRotationPoint(0F, 0F, 0F);
		turretModel[188].rotateAngleZ = 0.66322512F;

		turretModel[189].addShapeBox(15F, -17F, 22.5F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 786
		turretModel[189].setRotationPoint(0F, 0F, 0F);
		turretModel[189].rotateAngleZ = 0.66322512F;

		turretModel[190].addShapeBox(15F, -17F, 20F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 787
		turretModel[190].setRotationPoint(0F, 0F, 0F);
		turretModel[190].rotateAngleZ = 0.66322512F;

		turretModel[191].addShapeBox(19F, -17F, 20F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F); // Box 788
		turretModel[191].setRotationPoint(0F, 0F, 0F);
		turretModel[191].rotateAngleZ = 0.66322512F;

		turretModel[192].addShapeBox(19F, -17F, 22.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F); // Box 789
		turretModel[192].setRotationPoint(0F, 0F, 0F);
		turretModel[192].rotateAngleZ = 0.66322512F;

		turretModel[193].addShapeBox(19F, -17F, 25F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F); // Box 790
		turretModel[193].setRotationPoint(0F, 0F, 0F);
		turretModel[193].rotateAngleZ = 0.66322512F;

		turretModel[194].addShapeBox(12F, -14F, 18F, 1, 1, 9, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 791
		turretModel[194].setRotationPoint(0F, 0F, 0F);
		turretModel[194].rotateAngleZ = 0.66322512F;

		turretModel[195].addShapeBox(13F, -14F, 18F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 792
		turretModel[195].setRotationPoint(0F, 0F, 0F);
		turretModel[195].rotateAngleZ = 0.66322512F;

		turretModel[196].addShapeBox(14F, -14F, 25F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 793
		turretModel[196].setRotationPoint(0F, 0F, 0F);
		turretModel[196].rotateAngleZ = 0.66322512F;

		turretModel[197].addShapeBox(14F, -14F, 22.5F, 4, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 794
		turretModel[197].setRotationPoint(0F, 0F, 0F);
		turretModel[197].rotateAngleZ = 0.66322512F;

		turretModel[198].addShapeBox(18F, -14F, 22.5F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F); // Box 797
		turretModel[198].setRotationPoint(0F, 0F, 0F);
		turretModel[198].rotateAngleZ = 0.66322512F;

		turretModel[199].addShapeBox(18F, -14F, 25F, 1, 2, 2, 0F,0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, -0.2F, -0.65F, -0.65F, -0.2F, -0.65F, -0.65F, 0F, -0.45F, -0.45F); // Box 798
		turretModel[199].setRotationPoint(0F, 0F, 0F);
		turretModel[199].rotateAngleZ = 0.66322512F;

		turretModel[200].addShapeBox(7F, -25F, 17.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 799
		turretModel[200].setRotationPoint(0F, 0F, 0F);

		turretModel[201].addShapeBox(7F, -26F, 17.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 800
		turretModel[201].setRotationPoint(0F, 0F, 0F);

		turretModel[202].addShapeBox(7F, -27F, 17.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 801
		turretModel[202].setRotationPoint(0F, 0F, 0F);

		turretModel[203].addShapeBox(6F, -27F, 17.5F, 1, 1, 3, 0F,0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 802
		turretModel[203].setRotationPoint(0F, 0F, 0F);

		turretModel[204].addShapeBox(6F, -26F, 17.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 803
		turretModel[204].setRotationPoint(0F, 0F, 0F);

		turretModel[205].addShapeBox(6F, -25F, 17.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, -1F); // Box 804
		turretModel[205].setRotationPoint(0F, 0F, 0F);

		turretModel[206].addShapeBox(6.5F, -24F, 18.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 805
		turretModel[206].setRotationPoint(0F, 0F, 0F);

		turretModel[207].addShapeBox(-11F, -26.8F, -4F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 806
		turretModel[207].setRotationPoint(0F, 0F, 0F);
		turretModel[207].rotateAngleZ = -0.40142573F;

		turretModel[208].addShapeBox(-11F, -26.8F, -1.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 807
		turretModel[208].setRotationPoint(0F, 0F, 0F);
		turretModel[208].rotateAngleZ = -0.40142573F;

		turretModel[209].addShapeBox(-11F, -26.8F, 1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 808
		turretModel[209].setRotationPoint(0F, 0F, 0F);
		turretModel[209].rotateAngleZ = -0.40142573F;

		turretModel[210].addShapeBox(-2F, -27.8F, 3F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 809
		turretModel[210].setRotationPoint(0F, 0F, 0F);
		turretModel[210].rotateAngleZ = -0.26179939F;

		turretModel[211].addShapeBox(-2F, -27.8F, 0.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 810
		turretModel[211].setRotationPoint(0F, 0F, 0F);
		turretModel[211].rotateAngleZ = -0.26179939F;

		turretModel[212].addShapeBox(-2F, -27.8F, -4.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 812
		turretModel[212].setRotationPoint(0F, 0F, 0F);
		turretModel[212].rotateAngleZ = -0.26179939F;

		turretModel[213].addShapeBox(-2F, -27.8F, -2F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 813
		turretModel[213].setRotationPoint(0F, 0F, 0F);
		turretModel[213].rotateAngleZ = -0.26179939F;

		turretModel[214].addShapeBox(-2F, -27.8F, -5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 814
		turretModel[214].setRotationPoint(0F, 0F, 0F);
		turretModel[214].rotateAngleX = 0.08726646F;
		turretModel[214].rotateAngleZ = -0.26179939F;

		turretModel[215].addShapeBox(2F, -29F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 819
		turretModel[215].setRotationPoint(0F, 0F, 0F);
		turretModel[215].rotateAngleX = -0.41887902F;
		turretModel[215].rotateAngleY = -2.0943951F;

		turretModel[216].addShapeBox(13F, -27.5F, -5.5F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 842
		turretModel[216].setRotationPoint(0F, 0.5F, 0F);
		turretModel[216].rotateAngleY = -1.1693706F;
		turretModel[216].rotateAngleZ = -0.26179939F;

		turretModel[217].addShapeBox(15F, -28.5F, -6F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 843
		turretModel[217].setRotationPoint(0F, 0.5F, 0F);
		turretModel[217].rotateAngleY = -1.1693706F;
		turretModel[217].rotateAngleZ = -0.26179939F;

		turretModel[218].addShapeBox(27F, -1.5F, -4F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 844
		turretModel[218].setRotationPoint(0F, 0.5F, 0F);
		turretModel[218].rotateAngleY = -1.18682389F;
		turretModel[218].rotateAngleZ = 0.59341195F;

		turretModel[219].addShapeBox(31F, -0.5F, -5.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 845
		turretModel[219].setRotationPoint(0F, 0.5F, 0F);
		turretModel[219].rotateAngleY = -1.18682389F;
		turretModel[219].rotateAngleZ = 0.59341195F;

		turretModel[220].addShapeBox(20F, -23.5F, -9F, 1, 1, 6, 0F,0F, -0.5F, -3F, -0.5F, -0.75F, -2.5F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 894
		turretModel[220].setRotationPoint(0F, 0F, 0F);

		turretModel[221].addShapeBox(20F, -23.5F, 3F, 1, 1, 8, 0F,0F, -0.5F, 0F, -0.5F, -0.75F, 0F, -0.5F, -1F, -3.25F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F); // Box 895
		turretModel[221].setRotationPoint(0F, 0F, 0F);

		turretModel[222].addShapeBox(23F, -17F, -7F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 985
		turretModel[222].setRotationPoint(0F, 0F, 0F);
		turretModel[222].rotateAngleZ = 0.08726646F;

		turretModel[223].addShapeBox(23F, -17F, -6F, 1, 2, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 986
		turretModel[223].setRotationPoint(0F, 0F, 0F);
		turretModel[223].rotateAngleZ = 0.08726646F;

		turretModel[224].addShapeBox(23F, -17.25F, -7F, 1, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F); // Box 987
		turretModel[224].setRotationPoint(0F, 0F, 0F);
		turretModel[224].rotateAngleZ = 0.08726646F;

		turretModel[225].addShapeBox(23F, -15.75F, -7F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 988
		turretModel[225].setRotationPoint(0F, 0F, 0F);
		turretModel[225].rotateAngleZ = 0.08726646F;

		turretModel[226].addShapeBox(21F, -18.5F, -6.5F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 989
		turretModel[226].setRotationPoint(0F, 0F, 0F);

		turretModel[227].addShapeBox(23F, -18.5F, -6.5F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F); // Box 990
		turretModel[227].setRotationPoint(0F, 0F, 0F);

		turretModel[228].addShapeBox(20F, -17.5F, -3F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 991
		turretModel[228].setRotationPoint(0F, 0F, 0F);

		turretModel[229].addShapeBox(20F, -21.5F, -3F, 2, 4, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 992
		turretModel[229].setRotationPoint(0F, 0F, 0F);

		turretModel[230].addShapeBox(20F, -22.5F, -3F, 2, 1, 6, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 993
		turretModel[230].setRotationPoint(0F, 0F, 0F);

		turretModel[231].addShapeBox(20F, -23.5F, -3F, 2, 1, 6, 0F,0F, -0.5F, 0F, -1.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 994
		turretModel[231].setRotationPoint(0F, 0F, 0F);

		turretModel[232].addShapeBox(12F, -27.8F, -4F, 4, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 923
		turretModel[232].setRotationPoint(0F, 0F, 0F);
		turretModel[232].rotateAngleZ = -0.2268928F;

		turretModel[233].addShapeBox(6F, -26.5F, 5.5F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 937
		turretModel[233].setRotationPoint(0F, 0F, 0F);

		turretModel[234].addShapeBox(10F, -27.5F, 7.5F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 938
		turretModel[234].setRotationPoint(0F, 0F, 0F);

		turretModel[235].addShapeBox(12F, -27.5F, 7.5F, 2, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 939
		turretModel[235].setRotationPoint(0F, 0F, 0F);

		turretModel[236].addShapeBox(11F, -26.5F, 7.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Box 940
		turretModel[236].setRotationPoint(0F, 0F, 0F);

		turretModel[237].addShapeBox(11F, -26.5F, 9.5F, 3, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 941
		turretModel[237].setRotationPoint(0F, 0F, 0F);

		turretModel[238].addShapeBox(7F, -27.5F, 6.5F, 2, 1, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		turretModel[238].setRotationPoint(0F, 0F, 0F);

		turretModel[239].addShapeBox(-2F, -29.5F, 6.5F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F); // Box 943
		turretModel[239].setRotationPoint(0F, 0F, 0F);

		turretModel[240].addShapeBox(-2F, -28.5F, 6.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 944
		turretModel[240].setRotationPoint(0F, 0F, 0F);

		turretModel[241].addShapeBox(-2F, -28.5F, 5.5F, 1, 1, 1, 0F,0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 945
		turretModel[241].setRotationPoint(0F, 0F, 0F);

		turretModel[242].addShapeBox(-2F, -28.5F, 8.5F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 946
		turretModel[242].setRotationPoint(0F, 0F, 0F);

		turretModel[243].addShapeBox(-18F, -29F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 947
		turretModel[243].setRotationPoint(0F, 0F, 0F);
		turretModel[243].rotateAngleZ = 0.15707963F;

		turretModel[244].addShapeBox(-18F, -29F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 948
		turretModel[244].setRotationPoint(0F, 0F, 0F);
		turretModel[244].rotateAngleY = 0.19198622F;
		turretModel[244].rotateAngleZ = 0.15707963F;

		turretModel[245].addShapeBox(-18F, -29F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 949
		turretModel[245].setRotationPoint(0F, 0F, 0F);
		turretModel[245].rotateAngleY = -0.20943951F;
		turretModel[245].rotateAngleZ = 0.15707963F;

		turretModel[246].addShapeBox(5F, -21.5F, -22F, 6, 4, 44, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 560
		turretModel[246].setRotationPoint(0F, 0F, 0F);

		turretModel[247].addShapeBox(13F, -27.5F, -1.5F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 951
		turretModel[247].setRotationPoint(0F, 0.5F, 0F);
		turretModel[247].rotateAngleY = -1.09955743F;
		turretModel[247].rotateAngleZ = -0.26179939F;

		turretModel[248].addShapeBox(15F, -28.5F, -2F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 952
		turretModel[248].setRotationPoint(0F, 0.5F, 0F);
		turretModel[248].rotateAngleY = -1.09955743F;
		turretModel[248].rotateAngleZ = -0.26179939F;

		turretModel[249].addShapeBox(31F, -0.5F, -1.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 953
		turretModel[249].setRotationPoint(0F, 0.5F, 0F);
		turretModel[249].rotateAngleY = -1.11701072F;
		turretModel[249].rotateAngleZ = 0.59341195F;

		turretModel[250].addShapeBox(27F, -1.5F, 0F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 954
		turretModel[250].setRotationPoint(0F, 0.5F, 0F);
		turretModel[250].rotateAngleY = -1.11701072F;
		turretModel[250].rotateAngleZ = 0.59341195F;

		turretModel[251].addShapeBox(16F, -28.5F, -2F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 955
		turretModel[251].setRotationPoint(0F, 0.5F, 0F);
		turretModel[251].rotateAngleY = -0.87266463F;
		turretModel[251].rotateAngleZ = -0.26179939F;

		turretModel[252].addShapeBox(14F, -27.5F, -1.5F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 956
		turretModel[252].setRotationPoint(0F, 0.5F, 0F);
		turretModel[252].rotateAngleY = -0.87266463F;
		turretModel[252].rotateAngleZ = -0.26179939F;

		turretModel[253].addShapeBox(16F, -28.5F, -1F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 957
		turretModel[253].setRotationPoint(0F, 0.5F, 0F);
		turretModel[253].rotateAngleY = -0.68067841F;
		turretModel[253].rotateAngleZ = -0.26179939F;

		turretModel[254].addShapeBox(14F, -27.5F, -0.5F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 958
		turretModel[254].setRotationPoint(0F, 0.5F, 0F);
		turretModel[254].rotateAngleY = -0.68067841F;
		turretModel[254].rotateAngleZ = -0.26179939F;

		turretModel[255].addShapeBox(32F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 959
		turretModel[255].setRotationPoint(0F, 0.5F, 0F);
		turretModel[255].rotateAngleY = -0.9424778F;
		turretModel[255].rotateAngleZ = 0.59341195F;

		turretModel[256].addShapeBox(28F, -1F, 1.5F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 960
		turretModel[256].setRotationPoint(0F, 0.5F, 0F);
		turretModel[256].rotateAngleY = -0.9424778F;
		turretModel[256].rotateAngleZ = 0.59341195F;

		turretModel[257].addShapeBox(32F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 961
		turretModel[257].setRotationPoint(0F, 0.5F, 0F);
		turretModel[257].rotateAngleY = -0.71558499F;
		turretModel[257].rotateAngleZ = 0.59341195F;

		turretModel[258].addShapeBox(28F, -1F, 1.5F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		turretModel[258].setRotationPoint(0F, 0.5F, 0F);
		turretModel[258].rotateAngleY = -0.71558499F;
		turretModel[258].rotateAngleZ = 0.59341195F;

		turretModel[259].addShapeBox(27F, -1.5F, -1F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 963
		turretModel[259].setRotationPoint(0F, 0F, 0F);
		turretModel[259].rotateAngleY = 1.1693706F;
		turretModel[259].rotateAngleZ = 0.59341195F;

		turretModel[260].addShapeBox(13F, -27.5F, -2.5F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 964
		turretModel[260].setRotationPoint(0F, 0.5F, 0F);
		turretModel[260].rotateAngleY = 1.18682389F;
		turretModel[260].rotateAngleZ = -0.26179939F;

		turretModel[261].addShapeBox(15F, -28.5F, -3F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 965
		turretModel[261].setRotationPoint(0F, 0.5F, 0F);
		turretModel[261].rotateAngleY = 1.18682389F;
		turretModel[261].rotateAngleZ = -0.26179939F;

		turretModel[262].addShapeBox(31F, -0.5F, -2.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 966
		turretModel[262].setRotationPoint(0F, 0.5F, 0F);
		turretModel[262].rotateAngleY = 1.1693706F;
		turretModel[262].rotateAngleZ = 0.59341195F;

		turretModel[263].addShapeBox(28F, -1.5F, 0F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		turretModel[263].setRotationPoint(0F, 0F, 0F);
		turretModel[263].rotateAngleY = 0.90757121F;
		turretModel[263].rotateAngleZ = 0.59341195F;

		turretModel[264].addShapeBox(14F, -27.5F, -1.5F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 968
		turretModel[264].setRotationPoint(0F, 0.5F, 0F);
		turretModel[264].rotateAngleY = 0.9250245F;
		turretModel[264].rotateAngleZ = -0.26179939F;

		turretModel[265].addShapeBox(16F, -28.5F, -2F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 969
		turretModel[265].setRotationPoint(0F, 0.5F, 0F);
		turretModel[265].rotateAngleY = 0.9250245F;
		turretModel[265].rotateAngleZ = -0.26179939F;

		turretModel[266].addShapeBox(32F, -0.5F, -1.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 970
		turretModel[266].setRotationPoint(0F, 0.5F, 0F);
		turretModel[266].rotateAngleY = 0.90757121F;
		turretModel[266].rotateAngleZ = 0.59341195F;

		turretModel[267].addShapeBox(28F, -1.5F, 2F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		turretModel[267].setRotationPoint(0F, 0.5F, 0F);
		turretModel[267].rotateAngleY = 0.38397244F;
		turretModel[267].rotateAngleZ = 0.59341195F;

		turretModel[268].addShapeBox(14F, -27.5F, -1.5F, 11, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 972
		turretModel[268].setRotationPoint(0F, 0.5F, 0F);
		turretModel[268].rotateAngleY = 0.71558499F;
		turretModel[268].rotateAngleZ = -0.26179939F;

		turretModel[269].addShapeBox(16F, -28.5F, -2F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 973
		turretModel[269].setRotationPoint(0F, 0.5F, 0F);
		turretModel[269].rotateAngleY = 0.71558499F;
		turretModel[269].rotateAngleZ = -0.26179939F;

		turretModel[270].addShapeBox(32F, -0.5F, 0.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		turretModel[270].setRotationPoint(0F, 0.5F, 0F);
		turretModel[270].rotateAngleY = 0.38397244F;
		turretModel[270].rotateAngleZ = 0.59341195F;

		turretModel[271].addShapeBox(28F, -1.5F, 0F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 975
		turretModel[271].setRotationPoint(0F, 0.5F, 0F);
		turretModel[271].rotateAngleY = 0.6981317F;
		turretModel[271].rotateAngleZ = 0.59341195F;

		turretModel[272].addShapeBox(32F, -0.5F, -1.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 976
		turretModel[272].setRotationPoint(0F, 0.5F, 0F);
		turretModel[272].rotateAngleY = 0.6981317F;
		turretModel[272].rotateAngleZ = 0.59341195F;

		turretModel[273].addShapeBox(19F, -28.5F, 0.6F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 977
		turretModel[273].setRotationPoint(0F, 0.5F, 0F);
		turretModel[273].rotateAngleY = 0.38397244F;
		turretModel[273].rotateAngleZ = -0.26179939F;

		turretModel[274].addShapeBox(14F, -27.5F, 2.1F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 978
		turretModel[274].setRotationPoint(0F, 0.5F, 0F);
		turretModel[274].rotateAngleY = 0.38397244F;
		turretModel[274].rotateAngleZ = -0.26179939F;

		turretModel[275].addShapeBox(2F, -29F, 1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 979
		turretModel[275].setRotationPoint(0F, 0F, 0F);
		turretModel[275].rotateAngleX = -0.41887902F;
		turretModel[275].rotateAngleY = -2.49582083F;

		turretModel[276].addShapeBox(4F, -29.5F, -2F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		turretModel[276].setRotationPoint(0F, 0F, 0F);
		turretModel[276].rotateAngleX = -0.45378561F;
		turretModel[276].rotateAngleY = -2.16420827F;
		turretModel[276].rotateAngleZ = -0.27925268F;

		turretModel[277].addShapeBox(-9F, -30F, -15.5F, 2, 1, 1, 0F,0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F); // Box 981
		turretModel[277].setRotationPoint(0F, 0F, 0F);

		turretModel[278].addShapeBox(-9F, -30F, -7.5F, 2, 1, 1, 0F,-0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0.5F, 0.25F, -0.5F, -0.25F, -0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F, -0.25F, 0F, 0.5F, 0.25F, 0F, -0.25F); // Box 982
		turretModel[278].setRotationPoint(0F, 0F, 0F);

		turretModel[279].addShapeBox(-7F, -30F, -16F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 983
		turretModel[279].setRotationPoint(0F, 0F, 0F);

		turretModel[280].addShapeBox(-4F, -30F, -16F, 4, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 984
		turretModel[280].setRotationPoint(0F, 0F, 0F);

		turretModel[281].addShapeBox(-11F, -30F, -16F, 4, 1, 10, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 985
		turretModel[281].setRotationPoint(0F, 0F, 0F);

		turretModel[282].addShapeBox(-6F, -31F, -16F, 2, 1, 10, 0F,0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 986
		turretModel[282].setRotationPoint(0F, 0F, 0F);

		turretModel[283].addShapeBox(-4F, -31F, -16F, 4, 1, 10, 0F,0F, 0.5F, -1.5F, -1.5F, 0F, -4F, -1.5F, 0F, -4F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 987
		turretModel[283].setRotationPoint(0F, 0F, 0F);

		turretModel[284].addShapeBox(-7F, -31F, -16F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 988
		turretModel[284].setRotationPoint(0F, 0F, 0F);

		turretModel[285].addShapeBox(-8F, -31.5F, -14F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 989
		turretModel[285].setRotationPoint(0F, 0F, 0F);

		turretModel[286].addShapeBox(-8F, -31.5F, -9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 990
		turretModel[286].setRotationPoint(0F, 0F, 0F);

		turretModel[287].addShapeBox(-8F, -31.5F, -13F, 1, 1, 4, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 991
		turretModel[287].setRotationPoint(0F, 0F, 0F);

		turretModel[288].addShapeBox(-11F, -31F, -13.5F, 1, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 992
		turretModel[288].setRotationPoint(0F, 0F, 0F);

		turretModel[289].addShapeBox(-11F, -31F, -16F, 4, 1, 1, 0F,0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 1.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.5F); // Box 993
		turretModel[289].setRotationPoint(0F, 0F, 0F);

		turretModel[290].addShapeBox(-11F, -31F, -7F, 4, 1, 1, 0F,-1F, -0.5F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, -1F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 994
		turretModel[290].setRotationPoint(0F, 0F, 0F);

		turretModel[291].addShapeBox(-9.5F, -31.5F, -13F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 995
		turretModel[291].setRotationPoint(0F, 0F, 0F);

		turretModel[292].addShapeBox(-9.5F, -33.5F, -11.5F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 996
		turretModel[292].setRotationPoint(0F, 0F, 0F);

		turretModel[293].addShapeBox(-13.5F, -33.5F, -13F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 997
		turretModel[293].setRotationPoint(0F, 0F, 0F);

		turretModel[294].addShapeBox(-13.5F, -35.5F, -13F, 2, 1, 4, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 998
		turretModel[294].setRotationPoint(0F, 0F, 0F);

		turretModel[295].addShapeBox(-13.5F, -31.5F, -13F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 999
		turretModel[295].setRotationPoint(0F, 0F, 0F);

		turretModel[296].addShapeBox(-11.5F, -33.5F, -13F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F); // Box 1001
		turretModel[296].setRotationPoint(0F, 0F, 0F);

		turretModel[297].addShapeBox(-11.5F, -35.5F, -13F, 2, 1, 4, 0F,0F, -0.25F, -1F, -0.5F, -1.25F, -1.5F, -0.5F, -1.25F, -1.5F, 0F, -0.25F, -1F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F); // Box 1002
		turretModel[297].setRotationPoint(0F, 0F, 0F);

		turretModel[298].addShapeBox(-11.5F, -31.5F, -13F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, -0.25F, -1F, -0.5F, -1.25F, -1.5F, -0.5F, -1.25F, -1.5F, 0F, -0.25F, -1F); // Box 1003
		turretModel[298].setRotationPoint(0F, 0F, 0F);

		turretModel[299].addShapeBox(-9.5F, -33.5F, -12F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 1004
		turretModel[299].setRotationPoint(0F, 0F, 0F);

		turretModel[300].addShapeBox(-11.5F, -33.5F, -10F, 2, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F); // Box 1005
		turretModel[300].setRotationPoint(0F, 0F, 0F);

		turretModel[301].addShapeBox(-13.5F, -33.5F, -9F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 1006
		turretModel[301].setRotationPoint(0F, 0F, 0F);

		turretModel[302].addShapeBox(-11.5F, -33.5F, -13F, 2, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 1007
		turretModel[302].setRotationPoint(0F, 0F, 0F);

		turretModel[303].addShapeBox(-13.5F, -33.5F, -14F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1008
		turretModel[303].setRotationPoint(0F, 0F, 0F);

		turretModel[304].addShapeBox(35.5F, 0F, -16.5F, 8, 7, 9, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box163
		turretModel[304].setRotationPoint(-39F, -31.5F, 23F);

		turretModel[305].addShapeBox(43.5F, 0F, -17.5F, 3, 7, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box165
		turretModel[305].setRotationPoint(-39F, -31.5F, 23F);

		turretModel[306].addShapeBox(43.5F, 0F, -8.5F, 3, 7, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box166
		turretModel[306].setRotationPoint(-39F, -31.5F, 23F);

		turretModel[307].addShapeBox(28F, -1.5F, 2F, 6, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 971
		turretModel[307].setRotationPoint(-4F, 0.5F, 4F);
		turretModel[307].rotateAngleZ = 0.57595865F;

		turretModel[308].addShapeBox(32F, -0.5F, 0.5F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 974
		turretModel[308].setRotationPoint(-4F, 0.5F, 4F);
		turretModel[308].rotateAngleZ = 0.57595865F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 896
		barrelModel[1] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 897
		barrelModel[2] = new ModelRendererTurbo(this, 761, 169, textureX, textureY); // Box 898
		barrelModel[3] = new ModelRendererTurbo(this, 825, 177, textureX, textureY); // Box 924
		barrelModel[4] = new ModelRendererTurbo(this, 785, 185, textureX, textureY); // Box 925
		barrelModel[5] = new ModelRendererTurbo(this, 809, 185, textureX, textureY); // Box 926
		barrelModel[6] = new ModelRendererTurbo(this, 841, 185, textureX, textureY); // Box 927
		barrelModel[7] = new ModelRendererTurbo(this, 449, 185, textureX, textureY); // Box 930
		barrelModel[8] = new ModelRendererTurbo(this, 529, 185, textureX, textureY); // Box 931
		barrelModel[9] = new ModelRendererTurbo(this, 553, 185, textureX, textureY); // Box 932
		barrelModel[10] = new ModelRendererTurbo(this, 921, 153, textureX, textureY); // Box 933
		barrelModel[11] = new ModelRendererTurbo(this, 577, 185, textureX, textureY); // Box 934
		barrelModel[12] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 935
		barrelModel[13] = new ModelRendererTurbo(this, 633, 185, textureX, textureY); // Box 936
		barrelModel[14] = new ModelRendererTurbo(this, 769, 217, textureX, textureY); // Box 1114
		barrelModel[15] = new ModelRendererTurbo(this, 969, 217, textureX, textureY); // Box 1115

		barrelModel[0].addShapeBox(7F, -0.5F, -2.5F, 3, 2, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 896
		barrelModel[0].setRotationPoint(18F, -19F, 0F);

		barrelModel[1].addShapeBox(7F, -1.5F, -2.5F, 3, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 897
		barrelModel[1].setRotationPoint(18F, -19F, 0F);

		barrelModel[2].addShapeBox(7F, 1.5F, -2.5F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 898
		barrelModel[2].setRotationPoint(18F, -19F, 0F);

		barrelModel[3].addShapeBox(5F, -0.5F, -4.5F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 924
		barrelModel[3].setRotationPoint(18F, -19F, 0F);

		barrelModel[4].addShapeBox(3F, -0.5F, -4.5F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 925
		barrelModel[4].setRotationPoint(18F, -19F, 0F);

		barrelModel[5].addShapeBox(3F, -2.5F, -4.5F, 2, 2, 9, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 926
		barrelModel[5].setRotationPoint(18F, -19F, 0F);

		barrelModel[6].addShapeBox(2F, -4.5F, -4.5F, 2, 2, 9, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 927
		barrelModel[6].setRotationPoint(18F, -19F, 0F);

		barrelModel[7].addShapeBox(4F, -1.5F, -2.5F, 3, 1, 5, 0F,0F, 1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 2F, -1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 2F); // Box 930
		barrelModel[7].setRotationPoint(18F, -19F, 0F);

		barrelModel[8].addShapeBox(4F, 1.5F, -2.5F, 3, 1, 5, 0F,-1F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, -1F, 0F, 2F, 0F, 1F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 2F); // Box 931
		barrelModel[8].setRotationPoint(18F, -19F, 0F);

		barrelModel[9].addShapeBox(4F, -3F, -2.5F, 3, 1, 5, 0F,1F, 1.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 1.5F, 1F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F); // Box 932
		barrelModel[9].setRotationPoint(18F, -19F, 0F);

		barrelModel[10].addShapeBox(7F, -2.5F, -1.5F, 3, 1, 3, 0F,0F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F); // Box 933
		barrelModel[10].setRotationPoint(18F, -19F, 0F);

		barrelModel[11].addShapeBox(7F, 1.5F, -2.5F, 3, 1, 5, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 934
		barrelModel[11].setRotationPoint(18F, -19F, 0F);

		barrelModel[12].addShapeBox(7F, 2.5F, -1.5F, 3, 1, 3, 0F,0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.5F, 0F); // Box 935
		barrelModel[12].setRotationPoint(18F, -19F, 0F);

		barrelModel[13].addShapeBox(4F, 3F, -2.5F, 3, 1, 5, 0F,0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 1F, 1.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 1.5F, 1F); // Box 936
		barrelModel[13].setRotationPoint(18F, -19F, 0F);

		barrelModel[14].addShapeBox(3F, 1.5F, -4.5F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 1114
		barrelModel[14].setRotationPoint(18F, -19F, 0F);

		barrelModel[15].addShapeBox(2F, 3.5F, -4.5F, 2, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 1115
		barrelModel[15].setRotationPoint(18F, -19F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Import ImportShape319
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 2
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 3
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 4
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 5
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 6
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 7
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 8
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 9
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 10
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 11
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 12
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 13
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 14
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 15
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 16
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 17
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 18
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 951, 394, textureX, textureY); // Shape 37
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 951, 394, textureX, textureY); // Shape 38
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 39
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 773, 774, textureX, textureY); // Shape 43
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 773, 774, textureX, textureY); // Shape 44
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 773, 736, textureX, textureY); // Shape 45

		leftTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Import ImportShape319
		leftTrackWheelModels[0].setRotationPoint(27.5F, 3F, 28.5F);

		leftTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 2
		leftTrackWheelModels[1].setRotationPoint(27.5F, 3F, 24.5F);

		leftTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 3
		leftTrackWheelModels[2].setRotationPoint(27.5F, 3F, 25.5F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 4
		leftTrackWheelModels[3].setRotationPoint(42.5F, 3F, 25.5F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 5
		leftTrackWheelModels[4].setRotationPoint(42.5F, 3F, 28.5F);

		leftTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 6
		leftTrackWheelModels[5].setRotationPoint(42.5F, 3F, 24.5F);

		leftTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 7
		leftTrackWheelModels[6].setRotationPoint(12.5F, 3F, 25.5F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 8
		leftTrackWheelModels[7].setRotationPoint(12.5F, 3F, 28.5F);

		leftTrackWheelModels[8].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 9
		leftTrackWheelModels[8].setRotationPoint(12.5F, 3F, 24.5F);

		leftTrackWheelModels[9].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 10
		leftTrackWheelModels[9].setRotationPoint(-2.5F, 3F, 25.5F);

		leftTrackWheelModels[10].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 11
		leftTrackWheelModels[10].setRotationPoint(-2.5F, 3F, 28.5F);

		leftTrackWheelModels[11].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 12
		leftTrackWheelModels[11].setRotationPoint(-2.5F, 3F, 24.5F);

		leftTrackWheelModels[12].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 13
		leftTrackWheelModels[12].setRotationPoint(-17F, 3F, 25.5F);

		leftTrackWheelModels[13].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 14
		leftTrackWheelModels[13].setRotationPoint(-17F, 3F, 28.5F);

		leftTrackWheelModels[14].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 15
		leftTrackWheelModels[14].setRotationPoint(-17F, 3F, 24.5F);

		leftTrackWheelModels[15].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 16
		leftTrackWheelModels[15].setRotationPoint(-31.5F, 3F, 25.5F);

		leftTrackWheelModels[16].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 17
		leftTrackWheelModels[16].setRotationPoint(-31.5F, 3F, 28.5F);

		leftTrackWheelModels[17].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 18
		leftTrackWheelModels[17].setRotationPoint(-31.5F, 3F, 24.5F);

		leftTrackWheelModels[18].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 4, 1, 4), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 4, 11, 4), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8) }), 2, 11, 11, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,4 ,5 ,4 ,5 ,4 ,5}); // Shape 37
		leftTrackWheelModels[18].setRotationPoint(55.5F, -3.5F, 27.5F);

		leftTrackWheelModels[19].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 4, 1, 4), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 4, 11, 4), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8) }), 2, 11, 11, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,4 ,5 ,4 ,5 ,4 ,5}); // Shape 38
		leftTrackWheelModels[19].setRotationPoint(55.5F, -3.5F, 24.5F);

		leftTrackWheelModels[20].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 2, 8, 2), new Coord2D(10, 4, 10, 4), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(2, 8, 2, 8) }), 1, 10, 10, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {4 ,3 ,4 ,3 ,4 ,3 ,4 ,3}); // Shape 39
		leftTrackWheelModels[20].setRotationPoint(55.5F, -3.5F, 25.5F);

		leftTrackWheelModels[21].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 43
		leftTrackWheelModels[21].setRotationPoint(-46F, -2F, 30.5F);

		leftTrackWheelModels[22].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 44
		leftTrackWheelModels[22].setRotationPoint(-46F, -2F, 21.5F);

		leftTrackWheelModels[23].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 4, 1, 4), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 4, 11, 4), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8) }), 10, 11, 11, 36, 10, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,4 ,5 ,4 ,5 ,4 ,5}); // Shape 45
		leftTrackWheelModels[23].setRotationPoint(-46F, -2F, 28.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 19
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 20
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 21
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 22
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 23
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 24
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 25
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 26
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 27
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 28
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 29
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 30
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 31
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 32
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 33
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 34
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 35
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 954, 349, textureX, textureY); // Shape 36
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 957, 295, textureX, textureY); // Shape 40
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 951, 394, textureX, textureY); // Shape 41
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 951, 394, textureX, textureY); // Shape 42
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 773, 736, textureX, textureY); // Shape 46
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 773, 818, textureX, textureY); // Shape 47
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 773, 774, textureX, textureY); // Shape 48

		rightTrackWheelModels[0].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 19
		rightTrackWheelModels[0].setRotationPoint(42.5F, 3F, -21.5F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 20
		rightTrackWheelModels[1].setRotationPoint(42.5F, 3F, -24.5F);

		rightTrackWheelModels[2].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 21
		rightTrackWheelModels[2].setRotationPoint(42.5F, 3F, -25.5F);

		rightTrackWheelModels[3].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 22
		rightTrackWheelModels[3].setRotationPoint(27.5F, 3F, -25.5F);

		rightTrackWheelModels[4].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 23
		rightTrackWheelModels[4].setRotationPoint(27.5F, 3F, -24.5F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 24
		rightTrackWheelModels[5].setRotationPoint(27.5F, 3F, -21.5F);

		rightTrackWheelModels[6].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 25
		rightTrackWheelModels[6].setRotationPoint(12.5F, 3F, -21.5F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 26
		rightTrackWheelModels[7].setRotationPoint(12.5F, 3F, -24.5F);

		rightTrackWheelModels[8].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 27
		rightTrackWheelModels[8].setRotationPoint(12.5F, 3F, -25.5F);

		rightTrackWheelModels[9].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 28
		rightTrackWheelModels[9].setRotationPoint(-2.5F, 3F, -25.5F);

		rightTrackWheelModels[10].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 29
		rightTrackWheelModels[10].setRotationPoint(-2.5F, 3F, -24.5F);

		rightTrackWheelModels[11].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 30
		rightTrackWheelModels[11].setRotationPoint(-2.5F, 3F, -21.5F);

		rightTrackWheelModels[12].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 31
		rightTrackWheelModels[12].setRotationPoint(-17F, 3F, -25.5F);

		rightTrackWheelModels[13].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 32
		rightTrackWheelModels[13].setRotationPoint(-17F, 3F, -24.5F);

		rightTrackWheelModels[14].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 33
		rightTrackWheelModels[14].setRotationPoint(-17F, 3F, -21.5F);

		rightTrackWheelModels[15].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 34
		rightTrackWheelModels[15].setRotationPoint(-31.5F, 3F, -25.5F);

		rightTrackWheelModels[16].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 5, 1, 5), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 5, 11, 5), new Coord2D(11, 7, 11, 7), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 7, 1, 7) }), 1, 11, 11, 32, 1, ModelRendererTurbo.MR_FRONT, new float[] {2 ,5 ,4 ,5 ,2 ,5 ,4 ,5}); // Shape 35
		rightTrackWheelModels[16].setRotationPoint(-31.5F, 3F, -24.5F);

		rightTrackWheelModels[17].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 3, 12, 12, 40, 3, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 36
		rightTrackWheelModels[17].setRotationPoint(-31.5F, 3F, -21.5F);

		rightTrackWheelModels[18].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(2, 4, 2, 4), new Coord2D(4, 2, 4, 2), new Coord2D(8, 2, 8, 2), new Coord2D(10, 4, 10, 4), new Coord2D(10, 8, 10, 8), new Coord2D(8, 10, 8, 10), new Coord2D(4, 10, 4, 10), new Coord2D(2, 8, 2, 8) }), 1, 10, 10, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {4 ,3 ,4 ,3 ,4 ,3 ,4 ,3}); // Shape 40
		rightTrackWheelModels[18].setRotationPoint(55.5F, -3.5F, -24.5F);

		rightTrackWheelModels[19].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 4, 1, 4), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 4, 11, 4), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8) }), 2, 11, 11, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,4 ,5 ,4 ,5 ,4 ,5}); // Shape 41
		rightTrackWheelModels[19].setRotationPoint(55.5F, -3.5F, -25.5F);

		rightTrackWheelModels[20].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(1, 4, 1, 4), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 4, 11, 4), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8) }), 2, 11, 11, 36, 2, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,4 ,5 ,4 ,5 ,4 ,5}); // Shape 42
		rightTrackWheelModels[20].setRotationPoint(55.5F, -3.5F, -22.5F);

		rightTrackWheelModels[21].addShape3D(6F, -6F, -3F, new Shape2D(new Coord2D[] { new Coord2D(1, 4, 1, 4), new Coord2D(4, 1, 4, 1), new Coord2D(8, 1, 8, 1), new Coord2D(11, 4, 11, 4), new Coord2D(11, 8, 11, 8), new Coord2D(8, 11, 8, 11), new Coord2D(4, 11, 4, 11), new Coord2D(1, 8, 1, 8) }), 10, 11, 11, 36, 10, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,4 ,5 ,4 ,5 ,4 ,5}); // Shape 46
		rightTrackWheelModels[21].setRotationPoint(-46F, -2F, -21.5F);

		rightTrackWheelModels[22].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 47
		rightTrackWheelModels[22].setRotationPoint(-46F, -2F, -19.5F);

		rightTrackWheelModels[23].addShape3D(6F, -6F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 4, 0, 4), new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {4 ,6 ,4 ,6 ,4 ,6 ,4 ,6}); // Shape 48
		rightTrackWheelModels[23].setRotationPoint(-46F, -2F, -28.5F);
	}

	private void initfancyTrackModel_1()
	{
		fancyTrackModel[0] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Import 
		fancyTrackModel[1] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Import 
		fancyTrackModel[2] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Import 
		fancyTrackModel[3] = new ModelRendererTurbo(this, 873, 137, textureX, textureY); // Import 
		fancyTrackModel[4] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Import 
		fancyTrackModel[5] = new ModelRendererTurbo(this, 873, 145, textureX, textureY); // Import 
		fancyTrackModel[6] = new ModelRendererTurbo(this, 857, 185, textureX, textureY); // Import 
		fancyTrackModel[7] = new ModelRendererTurbo(this, 961, 201, textureX, textureY); // Import 
		fancyTrackModel[8] = new ModelRendererTurbo(this, 625, 177, textureX, textureY); // Import 
		fancyTrackModel[9] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Import 
		fancyTrackModel[10] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Import 
		fancyTrackModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import 
		fancyTrackModel[12] = new ModelRendererTurbo(this, 625, 41, textureX, textureY); // Import 

		fancyTrackModel[0].addShapeBox(-1.5F, 0F, -4F, 1, 1, 5, 0F,-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 
		fancyTrackModel[0].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[1].addShapeBox(-1F, 1F, 0.5F, 2, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		fancyTrackModel[1].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[2].addShapeBox(-0.5F, 0F, -4F, 1, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		fancyTrackModel[2].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[3].addShapeBox(-0.5F, 0F, 5F, 1, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		fancyTrackModel[3].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[4].addShapeBox(-1.5F, 0F, 1F, 1, 1, 5, 0F,-0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 
		fancyTrackModel[4].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[5].addShapeBox(-0.5F, 0F, 0.5F, 1, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		fancyTrackModel[5].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[6].addShapeBox(0.5F, 0F, 1.5F, 2, 1, 4, 0F,0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import 
		fancyTrackModel[6].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[7].addShapeBox(0.5F, 0F, -3.5F, 2, 1, 4, 0F,0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import 
		fancyTrackModel[7].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[8].addShapeBox(-1F, 2F, 0.5F, 2, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 
		fancyTrackModel[8].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[9].addShapeBox(-0.5F, 0F, -3F, 1, 1, 4, 0F,0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import 
		fancyTrackModel[9].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[10].addShapeBox(-0.5F, 0F, 1F, 1, 1, 4, 0F,0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F); // Import 
		fancyTrackModel[10].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[11].addShapeBox(0.5F, 0F, 1F, 1, 1, 5, 0F,0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		fancyTrackModel[11].setRotationPoint(0F, 0F, 0F);

		fancyTrackModel[12].addShapeBox(0.5F, 0F, -4F, 1, 1, 5, 0F,0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		fancyTrackModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void inittrailerModel_1()
	{
		trailerModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 61
		trailerModel[1] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 473
		trailerModel[2] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 474
		trailerModel[3] = new ModelRendererTurbo(this, 601, 73, textureX, textureY); // Box 475
		trailerModel[4] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 476
		trailerModel[5] = new ModelRendererTurbo(this, 617, 73, textureX, textureY); // Box 477
		trailerModel[6] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 478
		trailerModel[7] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 1023
		trailerModel[8] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 1024
		trailerModel[9] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 1025
		trailerModel[10] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 1026
		trailerModel[11] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 1027
		trailerModel[12] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 1028
		trailerModel[13] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 1029
		trailerModel[14] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 1030
		trailerModel[15] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 1031
		trailerModel[16] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 1032
		trailerModel[17] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 1033
		trailerModel[18] = new ModelRendererTurbo(this, 889, 113, textureX, textureY); // Box 1034
		trailerModel[19] = new ModelRendererTurbo(this, 745, 185, textureX, textureY); // Box 1035
		trailerModel[20] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 1036
		trailerModel[21] = new ModelRendererTurbo(this, 777, 185, textureX, textureY); // Box 1037
		trailerModel[22] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 1038
		trailerModel[23] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 1039
		trailerModel[24] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 1040
		trailerModel[25] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 1041
		trailerModel[26] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 1042
		trailerModel[27] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 1043
		trailerModel[28] = new ModelRendererTurbo(this, 801, 185, textureX, textureY); // Box 1044
		trailerModel[29] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 1045
		trailerModel[30] = new ModelRendererTurbo(this, 57, 129, textureX, textureY); // Box 1046
		trailerModel[31] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 1047
		trailerModel[32] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 1048
		trailerModel[33] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 1049
		trailerModel[34] = new ModelRendererTurbo(this, 913, 185, textureX, textureY); // Box 1050
		trailerModel[35] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 1051
		trailerModel[36] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 1052
		trailerModel[37] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 1053
		trailerModel[38] = new ModelRendererTurbo(this, 289, 129, textureX, textureY); // Box 1054
		trailerModel[39] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 1055
		trailerModel[40] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Box 1056
		trailerModel[41] = new ModelRendererTurbo(this, 777, 201, textureX, textureY); // Box 1057
		trailerModel[42] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 1058
		trailerModel[43] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 1059
		trailerModel[44] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 1060
		trailerModel[45] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 1061
		trailerModel[46] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 1062
		trailerModel[47] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 1063
		trailerModel[48] = new ModelRendererTurbo(this, 809, 201, textureX, textureY); // Box 1064
		trailerModel[49] = new ModelRendererTurbo(this, 185, 217, textureX, textureY); // Box 1065
		trailerModel[50] = new ModelRendererTurbo(this, 985, 129, textureX, textureY); // Box 1066
		trailerModel[51] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 1067
		trailerModel[52] = new ModelRendererTurbo(this, 57, 137, textureX, textureY); // Box 1068
		trailerModel[53] = new ModelRendererTurbo(this, 201, 137, textureX, textureY); // Box 1069
		trailerModel[54] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 1070
		trailerModel[55] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 1071
		trailerModel[56] = new ModelRendererTurbo(this, 753, 217, textureX, textureY); // Box 1072
		trailerModel[57] = new ModelRendererTurbo(this, 841, 201, textureX, textureY); // Box 869
		trailerModel[58] = new ModelRendererTurbo(this, 937, 201, textureX, textureY); // Box 870
		trailerModel[59] = new ModelRendererTurbo(this, 993, 217, textureX, textureY); // Box 871
		trailerModel[60] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 872
		trailerModel[61] = new ModelRendererTurbo(this, 529, 137, textureX, textureY); // Box 873
		trailerModel[62] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 875
		trailerModel[63] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Box 876

		trailerModel[0].addShapeBox(-2F, 0F, -7.5F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		trailerModel[0].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[0].rotateAngleZ = -0.38397244F;

		trailerModel[1].addShapeBox(-2F, 0F, -1F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		trailerModel[1].setRotationPoint(53.5F, -12.5F, -27.5F);
		trailerModel[1].rotateAngleZ = -0.08726646F;

		trailerModel[2].addShapeBox(-1F, 0F, -1F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 474
		trailerModel[2].setRotationPoint(53.5F, -12.5F, -24.5F);
		trailerModel[2].rotateAngleZ = -0.08726646F;

		trailerModel[3].addShapeBox(-1F, 0F, 3F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 475
		trailerModel[3].setRotationPoint(53.5F, -12.5F, -24.5F);
		trailerModel[3].rotateAngleZ = -0.08726646F;

		trailerModel[4].addShapeBox(-2F, 0F, 55F, 7, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 476
		trailerModel[4].setRotationPoint(53.5F, -12.5F, -27.5F);
		trailerModel[4].rotateAngleZ = -0.08726646F;

		trailerModel[5].addShapeBox(-1F, 0F, 49F, 5, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 477
		trailerModel[5].setRotationPoint(53.5F, -12.5F, -24.5F);
		trailerModel[5].rotateAngleZ = -0.08726646F;

		trailerModel[6].addShapeBox(-1F, 0F, 45F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 478
		trailerModel[6].setRotationPoint(53.5F, -12.5F, -24.5F);
		trailerModel[6].rotateAngleZ = -0.08726646F;

		trailerModel[7].addShapeBox(4F, -1F, -5.5F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1023
		trailerModel[7].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[7].rotateAngleZ = -0.38397244F;

		trailerModel[8].addShapeBox(-1F, -1F, -5.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1024
		trailerModel[8].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[8].rotateAngleZ = -0.38397244F;

		trailerModel[9].addShapeBox(0.5F, -1F, -5.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1025
		trailerModel[9].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[9].rotateAngleZ = -0.38397244F;

		trailerModel[10].addShapeBox(0.5F, -1F, -2.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1026
		trailerModel[10].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[10].rotateAngleZ = -0.38397244F;

		trailerModel[11].addShapeBox(2F, -1F, -5.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1027
		trailerModel[11].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[11].rotateAngleZ = -0.38397244F;

		trailerModel[12].addShapeBox(-1F, -1F, -2.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1028
		trailerModel[12].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[12].rotateAngleZ = -0.38397244F;

		trailerModel[13].addShapeBox(0.5F, -1F, 6F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1029
		trailerModel[13].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[13].rotateAngleZ = -0.38397244F;

		trailerModel[14].addShapeBox(-2F, 0F, 1F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1030
		trailerModel[14].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[14].rotateAngleZ = -0.38397244F;

		trailerModel[15].addShapeBox(-1F, -1F, 6F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1031
		trailerModel[15].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[15].rotateAngleZ = -0.38397244F;

		trailerModel[16].addShapeBox(-1F, -1F, 3F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1032
		trailerModel[16].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[16].rotateAngleZ = -0.38397244F;

		trailerModel[17].addShapeBox(0.5F, -1F, 3F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1033
		trailerModel[17].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[17].rotateAngleZ = -0.38397244F;

		trailerModel[18].addShapeBox(2F, -1F, 3F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1034
		trailerModel[18].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[18].rotateAngleZ = -0.38397244F;

		trailerModel[19].addShapeBox(4F, -1F, 3F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1035
		trailerModel[19].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[19].rotateAngleZ = -0.38397244F;

		trailerModel[20].addShapeBox(-2F, 0F, 9.5F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1036
		trailerModel[20].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[20].rotateAngleZ = -0.38397244F;

		trailerModel[21].addShapeBox(4F, -1F, 11.5F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1037
		trailerModel[21].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[21].rotateAngleZ = -0.38397244F;

		trailerModel[22].addShapeBox(2F, -1F, 11.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1038
		trailerModel[22].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[22].rotateAngleZ = -0.38397244F;

		trailerModel[23].addShapeBox(0.5F, -1F, 11.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1039
		trailerModel[23].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[23].rotateAngleZ = -0.38397244F;

		trailerModel[24].addShapeBox(-1F, -1F, 11.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1040
		trailerModel[24].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[24].rotateAngleZ = -0.38397244F;

		trailerModel[25].addShapeBox(-1F, -1F, 14.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1041
		trailerModel[25].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[25].rotateAngleZ = -0.38397244F;

		trailerModel[26].addShapeBox(0.5F, -1F, 14.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1042
		trailerModel[26].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[26].rotateAngleZ = -0.38397244F;

		trailerModel[27].addShapeBox(-2F, 0F, 18F, 9, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1043
		trailerModel[27].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[27].rotateAngleZ = -0.38397244F;

		trailerModel[28].addShapeBox(4F, -1F, 20F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1044
		trailerModel[28].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[28].rotateAngleZ = -0.38397244F;

		trailerModel[29].addShapeBox(2F, -1F, 20F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1045
		trailerModel[29].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[29].rotateAngleZ = -0.38397244F;

		trailerModel[30].addShapeBox(0.5F, -1F, 20F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1046
		trailerModel[30].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[30].rotateAngleZ = -0.38397244F;

		trailerModel[31].addShapeBox(-1F, -1F, 20F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1047
		trailerModel[31].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[31].rotateAngleZ = -0.38397244F;

		trailerModel[32].addShapeBox(-1F, -1F, 23F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1048
		trailerModel[32].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[32].rotateAngleZ = -0.38397244F;

		trailerModel[33].addShapeBox(0.5F, -1F, 23F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1049
		trailerModel[33].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[33].rotateAngleZ = -0.38397244F;

		trailerModel[34].addShapeBox(13.5F, -1F, 6.5F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1050
		trailerModel[34].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[34].rotateAngleZ = -0.38397244F;

		trailerModel[35].addShapeBox(12F, -1F, 6.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1051
		trailerModel[35].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[35].rotateAngleZ = -0.38397244F;

		trailerModel[36].addShapeBox(10.5F, -1F, 6.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1052
		trailerModel[36].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[36].rotateAngleZ = -0.38397244F;

		trailerModel[37].addShapeBox(9F, -1F, 6.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1053
		trailerModel[37].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[37].rotateAngleZ = -0.38397244F;

		trailerModel[38].addShapeBox(9F, -1F, 9.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1054
		trailerModel[38].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[38].rotateAngleZ = -0.38397244F;

		trailerModel[39].addShapeBox(8F, 0F, 6F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1055
		trailerModel[39].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[39].rotateAngleZ = -0.38397244F;

		trailerModel[40].addShapeBox(10.5F, -1F, 9.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1056
		trailerModel[40].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[40].rotateAngleZ = -0.38397244F;

		trailerModel[41].addShapeBox(13.5F, -1F, -4.5F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1057
		trailerModel[41].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[41].rotateAngleZ = -0.38397244F;

		trailerModel[42].addShapeBox(8F, 0F, -5F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1058
		trailerModel[42].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[42].rotateAngleZ = -0.38397244F;

		trailerModel[43].addShapeBox(10.5F, -1F, -1.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1059
		trailerModel[43].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[43].rotateAngleZ = -0.38397244F;

		trailerModel[44].addShapeBox(9F, -1F, -1.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1060
		trailerModel[44].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[44].rotateAngleZ = -0.38397244F;

		trailerModel[45].addShapeBox(9F, -1F, -4.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1061
		trailerModel[45].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[45].rotateAngleZ = -0.38397244F;

		trailerModel[46].addShapeBox(10.5F, -1F, -4.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1062
		trailerModel[46].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[46].rotateAngleZ = -0.38397244F;

		trailerModel[47].addShapeBox(12F, -1F, -4.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1063
		trailerModel[47].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[47].rotateAngleZ = -0.38397244F;

		trailerModel[48].addShapeBox(13.5F, -1F, 17.5F, 3, 1, 4, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1064
		trailerModel[48].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[48].rotateAngleZ = -0.38397244F;

		trailerModel[49].addShapeBox(8F, 0F, 17F, 9, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1065
		trailerModel[49].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[49].rotateAngleZ = -0.38397244F;

		trailerModel[50].addShapeBox(10.5F, -1F, 20.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1066
		trailerModel[50].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[50].rotateAngleZ = -0.38397244F;

		trailerModel[51].addShapeBox(9F, -1F, 20.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1067
		trailerModel[51].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[51].rotateAngleZ = -0.38397244F;

		trailerModel[52].addShapeBox(9F, -1F, 17.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1068
		trailerModel[52].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[52].rotateAngleZ = -0.38397244F;

		trailerModel[53].addShapeBox(10.5F, -1F, 17.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1069
		trailerModel[53].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[53].rotateAngleZ = -0.38397244F;

		trailerModel[54].addShapeBox(12F, -1F, 17.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1070
		trailerModel[54].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[54].rotateAngleZ = -0.38397244F;

		trailerModel[55].addShapeBox(8F, 0F, 0.5F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1071
		trailerModel[55].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[55].rotateAngleZ = -0.38397244F;

		trailerModel[56].addShapeBox(8F, 0F, 11.5F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1072
		trailerModel[56].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[56].rotateAngleZ = -0.38397244F;

		trailerModel[57].addShapeBox(7F, -1F, -4F, 1, 2, 7, 0F,-0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 869
		trailerModel[57].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[57].rotateAngleZ = -0.38397244F;

		trailerModel[58].addShapeBox(7F, -1F, 14F, 1, 2, 7, 0F,-0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 870
		trailerModel[58].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[58].rotateAngleZ = -0.38397244F;

		trailerModel[59].addShapeBox(7F, 0F, 4F, 1, 1, 9, 0F,-0.8F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.8F, 1F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 871
		trailerModel[59].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[59].rotateAngleZ = -0.38397244F;

		trailerModel[60].addShapeBox(7F, -1F, 3F, 1, 2, 1, 0F,-0.8F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 872
		trailerModel[60].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[60].rotateAngleZ = -0.38397244F;

		trailerModel[61].addShapeBox(7F, -1F, 13F, 1, 2, 1, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 873
		trailerModel[61].setRotationPoint(40.5F, -12.5F, -8.5F);
		trailerModel[61].rotateAngleZ = -0.38397244F;

		trailerModel[62].addShapeBox(-1F, -0.5F, -7.25F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 875
		trailerModel[62].setRotationPoint(57.5F, -5.25F, -11.5F);
		trailerModel[62].rotateAngleZ = 0.31415927F;

		trailerModel[63].addShapeBox(-1F, -0.5F, 24.25F, 5, 1, 6, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 876
		trailerModel[63].setRotationPoint(57.5F, -5.25F, -11.5F);
		trailerModel[63].rotateAngleZ = 0.31415927F;
	}

	private void initanimBarrelModel_1()
	{
		animBarrelModel[0] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 908
		animBarrelModel[1] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 909
		animBarrelModel[2] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 910
		animBarrelModel[3] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 917
		animBarrelModel[4] = new ModelRendererTurbo(this, 633, 177, textureX, textureY); // Box 918
		animBarrelModel[5] = new ModelRendererTurbo(this, 673, 177, textureX, textureY); // Box 920
		animBarrelModel[6] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 921
		animBarrelModel[7] = new ModelRendererTurbo(this, 841, 177, textureX, textureY); // Box 922
		animBarrelModel[8] = new ModelRendererTurbo(this, 881, 177, textureX, textureY); // Box 923
		animBarrelModel[9] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 924
		animBarrelModel[10] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 925
		animBarrelModel[11] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Box 926
		animBarrelModel[12] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 927
		animBarrelModel[13] = new ModelRendererTurbo(this, 569, 177, textureX, textureY); // Box 928
		animBarrelModel[14] = new ModelRendererTurbo(this, 609, 145, textureX, textureY); // Box 929
		animBarrelModel[15] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 930
		animBarrelModel[16] = new ModelRendererTurbo(this, 33, 185, textureX, textureY); // Box 931
		animBarrelModel[17] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 932
		animBarrelModel[18] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 933
		animBarrelModel[19] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 935
		animBarrelModel[20] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 936
		animBarrelModel[21] = new ModelRendererTurbo(this, 865, 137, textureX, textureY); // Box 937
		animBarrelModel[22] = new ModelRendererTurbo(this, 961, 129, textureX, textureY); // Box 938
		animBarrelModel[23] = new ModelRendererTurbo(this, 897, 137, textureX, textureY); // Box 939
		animBarrelModel[24] = new ModelRendererTurbo(this, 921, 145, textureX, textureY); // Box 940
		animBarrelModel[25] = new ModelRendererTurbo(this, 985, 145, textureX, textureY); // Box 941
		animBarrelModel[26] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 942
		animBarrelModel[27] = new ModelRendererTurbo(this, 97, 185, textureX, textureY); // Box 943
		animBarrelModel[28] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 944
		animBarrelModel[29] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 947
		animBarrelModel[30] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 948
		animBarrelModel[31] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 949
		animBarrelModel[32] = new ModelRendererTurbo(this, 849, 105, textureX, textureY); // Box 950
		animBarrelModel[33] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 973
		animBarrelModel[34] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 974
		animBarrelModel[35] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 975
		animBarrelModel[36] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 976
		animBarrelModel[37] = new ModelRendererTurbo(this, 841, 137, textureX, textureY); // Box 977
		animBarrelModel[38] = new ModelRendererTurbo(this, 865, 145, textureX, textureY); // Box 978
		animBarrelModel[39] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 979
		animBarrelModel[40] = new ModelRendererTurbo(this, 361, 153, textureX, textureY); // Box 980
		animBarrelModel[41] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 981
		animBarrelModel[42] = new ModelRendererTurbo(this, 513, 153, textureX, textureY); // Box 982
		animBarrelModel[43] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 983
		animBarrelModel[44] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 984

		animBarrelModel[0].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 908
		animBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[1].addShapeBox(0F, -1F, 0F, 10, 1, 4, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 909
		animBarrelModel[1].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[2].addShapeBox(0F, 2F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 910
		animBarrelModel[2].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[3].addShapeBox(10.5F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 917
		animBarrelModel[3].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[4].addShapeBox(10.5F, -1F, 0F, 14, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 918
		animBarrelModel[4].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[5].addShapeBox(10.5F, 2F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 920
		animBarrelModel[5].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[6].addShapeBox(10.5F, -2F, 1.5F, 14, 1, 2, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 921
		animBarrelModel[6].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[7].addShapeBox(25.5F, 2F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 922
		animBarrelModel[7].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[8].addShapeBox(25.5F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 923
		animBarrelModel[8].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[9].addShapeBox(25.5F, -1F, 0F, 14, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 924
		animBarrelModel[9].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[10].addShapeBox(25.5F, -2F, 1.5F, 14, 1, 2, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 925
		animBarrelModel[10].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[11].addShapeBox(55.5F, 1.7F, 0.5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 926
		animBarrelModel[11].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[12].addShapeBox(55.5F, 0.199999999999999F, 0.5F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 927
		animBarrelModel[12].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[13].addShapeBox(55.5F, -0.800000000000001F, 0.5F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		animBarrelModel[13].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[14].addShapeBox(55.5F, -1.8F, 1.5F, 11, 1, 2, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 929
		animBarrelModel[14].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[15].addShapeBox(67.5F, 1.7F, 0.5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 930
		animBarrelModel[15].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[16].addShapeBox(67.5F, 0.199999999999999F, 0.5F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 931
		animBarrelModel[16].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[17].addShapeBox(67.5F, -0.800000000000001F, 0.5F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 932
		animBarrelModel[17].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[18].addShapeBox(67.5F, -1.8F, 1.5F, 11, 1, 2, 0F,0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 933
		animBarrelModel[18].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[19].addShapeBox(78.5F, 0.199999999999999F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 935
		animBarrelModel[19].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[20].addShapeBox(78.5F, 1.7F, 0.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 936
		animBarrelModel[20].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[21].addShapeBox(78.5F, -0.800000000000001F, 0.5F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 937
		animBarrelModel[21].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[22].addShapeBox(78.5F, 0F, -0.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 938
		animBarrelModel[22].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[23].addShapeBox(80.5F, 0.199999999999999F, 0.5F, 2, 2, 3, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 939
		animBarrelModel[23].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[24].addShapeBox(80.5F, -0.800000000000001F, 0.5F, 2, 2, 3, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 940
		animBarrelModel[24].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[25].addShapeBox(80.5F, 0.699999999999999F, 0.5F, 2, 2, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F); // Box 941
		animBarrelModel[25].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[26].addShapeBox(41.5F, 0F, 0F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 942
		animBarrelModel[26].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[27].addShapeBox(41.5F, -1F, 0F, 14, 1, 4, 0F,0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 943
		animBarrelModel[27].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[28].addShapeBox(41.5F, 2F, 0F, 14, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F); // Box 944
		animBarrelModel[28].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[29].addShapeBox(40.5F, -1F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 947
		animBarrelModel[29].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[30].addShapeBox(40.5F, 2F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 948
		animBarrelModel[30].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[31].addShapeBox(40.5F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 949
		animBarrelModel[31].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[32].addShapeBox(79.5F, -1.8F, 1.5F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 950
		animBarrelModel[32].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[33].addShapeBox(39.5F, -0.899999999999999F, 0F, 1, 1, 4, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 973
		animBarrelModel[33].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[34].addShapeBox(39.5F, -0.100000000000001F, 0F, 1, 2, 4, 0F,0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.05F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F); // Box 974
		animBarrelModel[34].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[35].addShapeBox(39.5F, 1.9F, 0F, 1, 1, 4, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 975
		animBarrelModel[35].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[36].addShapeBox(66.5F, 1.7F, 0.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 976
		animBarrelModel[36].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[37].addShapeBox(66.5F, 0.199999999999999F, 0.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 977
		animBarrelModel[37].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[38].addShapeBox(66.5F, -0.800000000000001F, 0.5F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 978
		animBarrelModel[38].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[39].addShapeBox(9.5F, 2F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 979
		animBarrelModel[39].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[40].addShapeBox(9.5F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 980
		animBarrelModel[40].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[41].addShapeBox(9.5F, -1F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 981
		animBarrelModel[41].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[42].addShapeBox(24.5F, 2F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 982
		animBarrelModel[42].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[43].addShapeBox(24.5F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 983
		animBarrelModel[43].setRotationPoint(0F, 0F, 0F);

		animBarrelModel[44].addShapeBox(24.5F, -1F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 984
		animBarrelModel[44].setRotationPoint(0F, 0F, 0F);
		
	
	     barrelAttach = new Vector3f(21F/16F, 19.5F/16F, -1.8F/16F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[9];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 451, 524, textureX, textureY); // Box 374
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 467, 524, textureX, textureY); // Box 375
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 483, 524, textureX, textureY); // Box 376
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 499, 524, textureX, textureY); // Box 377
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 507, 524, textureX, textureY); // Box 378
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 515, 524, textureX, textureY); // Box 379
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 523, 524, textureX, textureY); // Box 380
		gun_1_Model[0][7] = new ModelRendererTurbo(this, 531, 524, textureX, textureY); // Box 399
		gun_1_Model[0][8] = new ModelRendererTurbo(this, 547, 524, textureX, textureY); // Box 400

		gun_1_Model[0][0].addShapeBox(-1.15F, -1.7F, 0.1F, 3, 6, 1, 0F,-1F, 0.2F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -1F, 0.2F, -0.2F, 1F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 374

		gun_1_Model[0][1].addShapeBox(-1.15F, -1.7F, -2.3F, 3, 6, 1, 0F,-1F, 0.2F, -0.2F, -0.4F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, -1F, 0.2F, -0.2F, 1F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, -2F, -0.2F, -0.2F, 1F, -0.2F, -0.2F); // Box 375

		gun_1_Model[0][2].addShapeBox(-3.15F, 3.05F, -3.1F, 3, 2, 2, 0F,-0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 376

		gun_1_Model[0][3].addShapeBox(-1.65F, -2.5F, 0.2F, 2, 3, 1, 0F,0F, 0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 1.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 1.2F, -0.2F); // Box 377

		gun_1_Model[0][4].addShapeBox(-1.65F, -2.5F, -2.4F, 2, 3, 1, 0F,0F, 0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 1.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 1.2F, -0.2F); // Box 378

		gun_1_Model[0][5].addShapeBox(-2.65F, -2.5F, 0.2F, 1, 3, 1, 0F,-0.3F, -1.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.3F, -1.2F, -0.2F, -0.4F, 0F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, -0.2F, -0.4F, 0F, -0.2F); // Box 379

		gun_1_Model[0][6].addShapeBox(-2.65F, -2.5F, -2.4F, 1, 3, 1, 0F,-0.3F, -1.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.3F, -1.2F, -0.2F, -0.4F, 0F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, -0.2F, -0.4F, 0F, -0.2F); // Box 380

		gun_1_Model[0][7].addShapeBox(-3.15F, 3.05F, -0.1F, 3, 2, 2, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -0.3F, -0.2F); // Box 399

		gun_1_Model[0][8].addShapeBox(-3.15F, 3.05F, -1.6F, 3, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 400

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(3F, -33.5F, -10F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[39];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 563, 524, textureX, textureY); // Box 356
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 595, 524, textureX, textureY); // Box 357
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 611, 524, textureX, textureY); // Box 358
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 619, 524, textureX, textureY); // Box 359
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 635, 524, textureX, textureY); // Box 360
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 667, 524, textureX, textureY); // Box 361
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 691, 524, textureX, textureY); // Box 362
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 699, 524, textureX, textureY); // Box 364
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 707, 524, textureX, textureY); // Box 366
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 715, 524, textureX, textureY); // Box 367
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 731, 524, textureX, textureY); // Box 368
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 747, 524, textureX, textureY); // Box 369
		gun_1_Model[2][12] = new ModelRendererTurbo(this, 763, 524, textureX, textureY); // Box 370
		gun_1_Model[2][13] = new ModelRendererTurbo(this, 795, 524, textureX, textureY); // Box 371
		gun_1_Model[2][14] = new ModelRendererTurbo(this, 803, 524, textureX, textureY); // Box 372
		gun_1_Model[2][15] = new ModelRendererTurbo(this, 835, 524, textureX, textureY); // Box 373
		gun_1_Model[2][16] = new ModelRendererTurbo(this, 843, 524, textureX, textureY); // Box 381
		gun_1_Model[2][17] = new ModelRendererTurbo(this, 891, 524, textureX, textureY); // Box 382
		gun_1_Model[2][18] = new ModelRendererTurbo(this, 915, 524, textureX, textureY); // Box 383
		gun_1_Model[2][19] = new ModelRendererTurbo(this, 931, 524, textureX, textureY); // Box 384
		gun_1_Model[2][20] = new ModelRendererTurbo(this, 939, 524, textureX, textureY); // Box 385
		gun_1_Model[2][21] = new ModelRendererTurbo(this, 947, 524, textureX, textureY); // Box 386
		gun_1_Model[2][22] = new ModelRendererTurbo(this, 955, 524, textureX, textureY); // Box 387
		gun_1_Model[2][23] = new ModelRendererTurbo(this, 451, 532, textureX, textureY); // Box 388
		gun_1_Model[2][24] = new ModelRendererTurbo(this, 483, 532, textureX, textureY); // Box 389
		gun_1_Model[2][25] = new ModelRendererTurbo(this, 451, 532, textureX, textureY); // Box 390
		gun_1_Model[2][26] = new ModelRendererTurbo(this, 475, 532, textureX, textureY); // Box 391
		gun_1_Model[2][27] = new ModelRendererTurbo(this, 483, 532, textureX, textureY); // Box 392
		gun_1_Model[2][28] = new ModelRendererTurbo(this, 507, 532, textureX, textureY); // Box 393
		gun_1_Model[2][29] = new ModelRendererTurbo(this, 515, 532, textureX, textureY); // Box 394
		gun_1_Model[2][30] = new ModelRendererTurbo(this, 523, 532, textureX, textureY); // Box 395
		gun_1_Model[2][31] = new ModelRendererTurbo(this, 531, 532, textureX, textureY); // Box 396
		gun_1_Model[2][32] = new ModelRendererTurbo(this, 539, 532, textureX, textureY); // Box 397
		gun_1_Model[2][33] = new ModelRendererTurbo(this, 627, 524, textureX, textureY); // Box 398
		gun_1_Model[2][34] = new ModelRendererTurbo(this, 547, 532, textureX, textureY); // Box 401
		gun_1_Model[2][35] = new ModelRendererTurbo(this, 555, 532, textureX, textureY); // Box 402
		gun_1_Model[2][36] = new ModelRendererTurbo(this, 563, 532, textureX, textureY); // Box 403
		gun_1_Model[2][37] = new ModelRendererTurbo(this, 571, 532, textureX, textureY); // Box 404
		gun_1_Model[2][38] = new ModelRendererTurbo(this, 587, 532, textureX, textureY); // Box 405

		gun_1_Model[2][0].addShapeBox(-0.65F, -2.2F, -1.6F, 13, 3, 2, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F, 0F, -0.4F, -0.05F); // Box 356

		gun_1_Model[2][1].addShapeBox(3.35F, -3.2F, -1.6F, 4, 1, 2, 0F,0F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.4F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Box 357

		gun_1_Model[2][2].addShapeBox(7.85F, -3.2F, -1.6F, 1, 1, 2, 0F,0F, -0.2F, 0.3F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0F, 0F, 0.3F); // Box 358

		gun_1_Model[2][3].addShapeBox(3.35F, -3.2F, -2.7F, 3, 1, 1, 0F,0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.4F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0.4F, 0F, -0.2F); // Box 359

		gun_1_Model[2][4].addShapeBox(-0.65F, -2.1F, -2.2F, 13, 1, 1, 0F,0F, -0.1F, -0.35F, -0.4F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, 0.1F, -0.35F, -0.4F, 0.1F, -0.35F, 0F, 0.1F, -0.35F, 0F, 0.1F, -0.35F); // Box 360

		gun_1_Model[2][5].addShapeBox(1.35F, -1.1F, -2.2F, 9, 1, 1, 0F,-0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F); // Box 361

		gun_1_Model[2][6].addShapeBox(10.35F, -1.1F, -2.2F, 2, 1, 1, 0F,0F, -0.1F, -0.1F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, -0.1F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.1F, 0F, 0.1F, -0.1F); // Box 362

		gun_1_Model[2][7].addShapeBox(12.35F, -1.2F, -1.6F, 1, 2, 2, 0F,0F, 0.1F, -0.05F, -0.3F, -0.2F, -0.05F, -0.3F, -0.2F, -0.05F, 0F, 0.1F, -0.05F, 0F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, -0.3F, -0.4F, -0.05F, 0F, -0.4F, -0.05F); // Box 364

		gun_1_Model[2][8].addShapeBox(-0.15F, -3.2F, -1.6F, 1, 1, 2, 0F,-0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, -0.45F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F); // Box 366

		gun_1_Model[2][9].addShapeBox(0.85F, -3.2F, -1.6F, 2, 1, 2, 0F,0.3F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, -0.1F, -0.5F, -0.6F, 0.3F, -0.5F, -0.6F, 0.3F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, 0.3F, 0F, -0.6F); // Box 367

		gun_1_Model[2][10].addShapeBox(1.35F, -2F, -0.2F, 3, 1, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 368

		gun_1_Model[2][11].addShapeBox(1.35F, -1.2F, 0.2F, 3, 2, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 369

		gun_1_Model[2][12].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 370

		gun_1_Model[2][13].addShapeBox(12F, -0.8F, -0.25F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 371

		gun_1_Model[2][14].addShapeBox(0F, 0F, -2.2F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 372

		gun_1_Model[2][15].addShapeBox(12F, -0.8F, -2.05F, 1, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 373

		gun_1_Model[2][16].addShapeBox(12.35F, -2F, -1.1F, 20, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 381

		gun_1_Model[2][17].addShapeBox(12.35F, -0.9F, -1.1F, 8, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 382

		gun_1_Model[2][18].addShapeBox(20.85F, -0.9F, -1.1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 383

		gun_1_Model[2][19].addShapeBox(19.85F, -0.9F, -1.1F, 2, 1, 1, 0F,0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F, 0F, -0.22F, -0.22F); // Box 384

		gun_1_Model[2][20].addShapeBox(19.25F, -2F, -1.1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 385

		gun_1_Model[2][21].addShapeBox(32.35F, -2F, -1.1F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 386

		gun_1_Model[2][22].addShapeBox(33.35F, -2F, -1.1F, 1, 1, 1, 0F,0F, -0.15F, -0.15F, 1F, 0.05F, 0.05F, 1F, 0.05F, 0.05F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 1F, 0.05F, 0.05F, 1F, 0.05F, 0.05F, 0F, -0.15F, -0.15F); // Box 387

		gun_1_Model[2][23].addShapeBox(3.35F, -2.7F, -10.2F, 4, 5, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388

		gun_1_Model[2][24].addShapeBox(3.35F, -2.7F, -10.2F, 4, 1, 8, 0F,0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0.1F, 0.1F, -0.15F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 389

		gun_1_Model[2][25].addShapeBox(30.35F, -2F, -1.1F, 2, 1, 1, 0F,0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 390

		gun_1_Model[2][26].addShapeBox(26.25F, -3.6F, -1.1F, 1, 2, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 391

		gun_1_Model[2][27].addShapeBox(26.25F, -2F, -1.1F, 1, 1, 1, 0F,-0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F, -0.05F); // Box 392

		gun_1_Model[2][28].addShapeBox(26.25F, -4.8F, -1.55F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 393

		gun_1_Model[2][29].addShapeBox(26.25F, -4.4F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 394

		gun_1_Model[2][30].addShapeBox(26.25F, -4.4F, -1.45F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.52F, -0.2F, -0.4F, -0.52F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 395

		gun_1_Model[2][31].addShapeBox(26.25F, -4.8F, -0.65F, 1, 1, 1, 0F,-0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.5F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F, -0.2F, -0.2F, -0.42F); // Box 396

		gun_1_Model[2][32].addShapeBox(26.25F, -4.35F, -1.1F, 1, 1, 1, 0F,-0.4F, -0.15F, -0.42F, -0.4F, -0.15F, -0.42F, -0.4F, -0.15F, -0.42F, -0.4F, -0.1F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F, -0.4F, 0F, -0.42F); // Box 397

		gun_1_Model[2][33].addShapeBox(3.35F, -1.9F, -0.2F, 1, 1, 3, 0F,-0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F); // Box 398

		gun_1_Model[2][34].addShapeBox(1.85F, -5.2F, -2.4F, 1, 5, 1, 0F,-0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 401

		gun_1_Model[2][35].addShapeBox(1.85F, -6.8F, -3.4F, 1, 2, 1, 0F,-0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.5F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, 0F, -0.4F, -0.1F, 0F, -0.4F); // Box 402

		gun_1_Model[2][36].addShapeBox(1.85F, -5.2F, -2.8F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.6F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 403

		gun_1_Model[2][37].addShapeBox(1.65F, -7.2F, -3.6F, 3, 2, 1, 0F,-0.1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Box 404

		gun_1_Model[2][38].addShapeBox(1.65F, -7.2F, -3.2F, 3, 2, 1, 0F,-0.1F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -1F, -0.6F, -0.4F, -0.6F, -0.6F, -0.4F, -0.1F, -0.2F, -0.4F, -0.5F, -0.2F, -0.4F, -1F, -0.6F, -0.4F, -0.6F, -0.6F, -0.4F); // Box 405

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(3F, -33.5F, -10F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);
	}
}