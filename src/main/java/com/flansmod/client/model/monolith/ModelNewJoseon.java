//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 10.03.2020 - 03:30:10
// Last changed on: 10.03.2020 - 03:30:10

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNewJoseon extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNewJoseon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[192];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box15
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box18
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box19
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box27
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box28
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box173
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box175
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box177
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box178
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box179
		bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box181
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import Box182
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box183
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box184
		bodyModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box185
		bodyModel[15] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box186
		bodyModel[16] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box188
		bodyModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box189
		bodyModel[18] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box190
		bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box191
		bodyModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box192
		bodyModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box193
		bodyModel[22] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Box195
		bodyModel[23] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box196
		bodyModel[24] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box197
		bodyModel[25] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Import Box198
		bodyModel[26] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Box199
		bodyModel[27] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box200
		bodyModel[28] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box202
		bodyModel[29] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box203
		bodyModel[30] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box204
		bodyModel[31] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Import Box205
		bodyModel[32] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Box206
		bodyModel[33] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box207
		bodyModel[34] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Box209
		bodyModel[35] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Box210
		bodyModel[36] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box211
		bodyModel[37] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box212
		bodyModel[38] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Box213
		bodyModel[39] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Import Box214
		bodyModel[40] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box216
		bodyModel[41] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Import Box217
		bodyModel[42] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Box218
		bodyModel[43] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Box219
		bodyModel[44] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box220
		bodyModel[45] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box221
		bodyModel[46] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Box223
		bodyModel[47] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Box224
		bodyModel[48] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box225
		bodyModel[49] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Import Box226
		bodyModel[50] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Import Box227
		bodyModel[51] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Import Box228
		bodyModel[52] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box230
		bodyModel[53] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box231
		bodyModel[54] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box232
		bodyModel[55] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box233
		bodyModel[56] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box234
		bodyModel[57] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box235
		bodyModel[58] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box237
		bodyModel[59] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box238
		bodyModel[60] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box239
		bodyModel[61] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box240
		bodyModel[62] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box241
		bodyModel[63] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import Box242
		bodyModel[64] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Import Box243
		bodyModel[65] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box244
		bodyModel[66] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box245
		bodyModel[67] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box248
		bodyModel[68] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Import Box249
		bodyModel[69] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Box250
		bodyModel[70] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import Box251
		bodyModel[71] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Import Box252
		bodyModel[72] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Import Box253
		bodyModel[73] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import Box254
		bodyModel[74] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Import Box255
		bodyModel[75] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Import Box256
		bodyModel[76] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import Box258
		bodyModel[77] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box259
		bodyModel[78] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Import Box260
		bodyModel[79] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box289
		bodyModel[80] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box290
		bodyModel[81] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import Box291
		bodyModel[82] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box300
		bodyModel[83] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Import Box301
		bodyModel[84] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Import Box302
		bodyModel[85] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import Box303
		bodyModel[86] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Import Box304
		bodyModel[87] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Import Box305
		bodyModel[88] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Import Box306
		bodyModel[89] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Import Box307
		bodyModel[90] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Import Box308
		bodyModel[91] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Import Box309
		bodyModel[92] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Import Box310
		bodyModel[93] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Import Box311
		bodyModel[94] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Import Box312
		bodyModel[95] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Import Box313
		bodyModel[96] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Import Box314
		bodyModel[97] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Import Box315
		bodyModel[98] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Import Box316
		bodyModel[99] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Import Box317
		bodyModel[100] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Import Box318
		bodyModel[101] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Import Box319
		bodyModel[102] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Import Box320
		bodyModel[103] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Import Box331
		bodyModel[104] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Import Box332
		bodyModel[105] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import Box333
		bodyModel[106] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Import Box334
		bodyModel[107] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Import Box335
		bodyModel[108] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Import Box336
		bodyModel[109] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Import Box337
		bodyModel[110] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box338
		bodyModel[111] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box339
		bodyModel[112] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Import Box340
		bodyModel[113] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import Box341
		bodyModel[114] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Import Box342
		bodyModel[115] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box343
		bodyModel[116] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import Box344
		bodyModel[117] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box345
		bodyModel[118] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box346
		bodyModel[119] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box347
		bodyModel[120] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box348
		bodyModel[121] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box349
		bodyModel[122] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box350
		bodyModel[123] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box351
		bodyModel[124] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box352
		bodyModel[125] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box353
		bodyModel[126] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box354
		bodyModel[127] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box365
		bodyModel[128] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Import Box369
		bodyModel[129] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Import Box370
		bodyModel[130] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import Box371
		bodyModel[131] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Import Box372
		bodyModel[132] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box378
		bodyModel[133] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Import Box379
		bodyModel[134] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Import Box380
		bodyModel[135] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Import Box381
		bodyModel[136] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box390
		bodyModel[137] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import Box391
		bodyModel[138] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Import Box392
		bodyModel[139] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Import Box393
		bodyModel[140] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Import Box394
		bodyModel[141] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box395
		bodyModel[142] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Import Box396
		bodyModel[143] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Import Box397
		bodyModel[144] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Import Box398
		bodyModel[145] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Import Box399
		bodyModel[146] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box400
		bodyModel[147] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Import Box401
		bodyModel[148] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Import Box414
		bodyModel[149] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Import Box415
		bodyModel[150] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Import Box416
		bodyModel[151] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box417
		bodyModel[152] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Import Box418
		bodyModel[153] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Import Box419
		bodyModel[154] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Import Box420
		bodyModel[155] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Import Box421
		bodyModel[156] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Import Box422
		bodyModel[157] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box423
		bodyModel[158] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box424
		bodyModel[159] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Import Box425
		bodyModel[160] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Import Box426
		bodyModel[161] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Import Box427
		bodyModel[162] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Import Box428
		bodyModel[163] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box429
		bodyModel[164] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Import Box531
		bodyModel[165] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Import Box532
		bodyModel[166] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box542
		bodyModel[167] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box549
		bodyModel[168] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Import Box550
		bodyModel[169] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Import Box551
		bodyModel[170] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Import Box552
		bodyModel[171] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Import Box553
		bodyModel[172] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Import Box554
		bodyModel[173] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Import Box555
		bodyModel[174] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Import Box556
		bodyModel[175] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box557
		bodyModel[176] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box558
		bodyModel[177] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Import Box559
		bodyModel[178] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box560
		bodyModel[179] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box561
		bodyModel[180] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box562
		bodyModel[181] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box563
		bodyModel[182] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box564
		bodyModel[183] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import Box565
		bodyModel[184] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import Box566
		bodyModel[185] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Import Box567
		bodyModel[186] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box568
		bodyModel[187] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box569
		bodyModel[188] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box570
		bodyModel[189] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box571
		bodyModel[190] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import Box572
		bodyModel[191] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 308

		bodyModel[0].addShapeBox(-4F, 8F, -2.5F, 4, 2, 5, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.4F); // Import Box15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 8, 8, 4, 0F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 1.1F, 0.4F, 0.1F, 1.1F, 0.4F, 0.1F, 1.1F, 0.3F, 0.1F, 1.1F, 0.3F); // Import Box18
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(1F, 9.8F, -2F, 3, 7, 4, 0F, 1.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 1.3F, 0.1F, 0.1F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F); // Import Box19
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, 0F, -2.4F, 2, 1, 4, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.2F, 0.1F, -1.9F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, -1.9F, 0.2F, 0.1F); // Import Box27
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, -2.4F, 2, 1, 4, 0F, 0.1F, 0.4F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.2F, 0.1F, -1.9F, 0.2F, 0.1F, -1.9F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Import Box28
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0F, -2.3F, 1, 2, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Import Box173
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3F, 0F, -2.3F, 1, 2, 1, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Import Box175
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 2F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 3.3F, -0.3F, -0.4F, 3.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, 3.3F, -0.3F, -0.4F, 3.3F); // Import Box177
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.5F, 2F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box178
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 2F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box179
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.5F, 2F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box181
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.5F, 2F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box182
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2.5F, 2F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box183
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.5F, 4F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box184
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.5F, 4F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box185
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0.5F, 4F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box186
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-1.5F, 4F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box188
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2.5F, 4F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box189
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, 4F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box190
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.5F, 5.5F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box191
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(1.5F, 5.5F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box192
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.5F, 5.5F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box193
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1.5F, 5.5F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box195
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.5F, 5.5F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box196
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.5F, 5.5F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box197
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2.5F, 7F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box198
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(1.5F, 7F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box199
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0.5F, 7F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box200
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1.5F, 7F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box202
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.5F, 7F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box203
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.5F, 7F, -2.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box204
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2.5F, 10F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box205
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1.5F, 10F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box206
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.5F, 10F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box207
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-1.5F, 10F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box209
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-2.5F, 10F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box210
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3.5F, 10F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box211
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(2.5F, 11F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box212
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1.5F, 11F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box213
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0.5F, 11F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box214
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-1.5F, 11F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box216
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-2.5F, 11F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box217
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.5F, 11F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box218
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(2.5F, 11F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box219
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(1.5F, 11F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box220
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(0.5F, 11F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box221
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-1.5F, 11F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box223
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-2.5F, 11F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box224
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3.5F, 11F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box225
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(2.5F, 10F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box226
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(1.5F, 10F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box227
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(0.5F, 10F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box228
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-1.5F, 10F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box230
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-2.5F, 10F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box231
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-3.5F, 10F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box232
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(2.5F, 7.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box233
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(1.5F, 7.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box234
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(0.5F, 7.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box235
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-1.5F, 7.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box237
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-2.5F, 7.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box238
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-3.5F, 7.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box239
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-3.5F, 3.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box240
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-2.5F, 3.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box241
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-3.5F, 5.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box242
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-2.5F, 5.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box243
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-1.5F, 5.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box244
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-1.5F, 3.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box245
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(0.5F, 5.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box248
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(0.5F, 3.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box249
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(1.5F, 3.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box250
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(1.5F, 5.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box251
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(2.5F, 5.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box252
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(2.5F, 3.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box253
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-3.5F, 1.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box254
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-2.5F, 1.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box255
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-1.5F, 1.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box256
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(0.5F, 1.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box258
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(1.5F, 1.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box259
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(2.5F, 1.5F, 1.8F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box260
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-0.5F, 1.5F, -2.6F, 1, 11, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Import Box289
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(0F, 8F, -2.5F, 4, 2, 5, 0F, 0F, 0F, 0.7F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.4F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.4F, 0F, 0F, 0.7F); // Import Box290
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-5F, 12.2F, -2.5F, 10, 1, 5, 0F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F, -0.5F, -0.2F, 0.1F); // Import Box291
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-5.3F, 18.2F, -2.5F, 5, 1, 5, 0F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F); // Import Box300
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-4.6F, 11F, -1.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box301
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-4.6F, 10F, -1.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box302
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-4.6F, 10F, -0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box303
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-4.6F, 11F, -0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box304
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(-4.6F, 11F, 0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box305
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-4.6F, 10F, 0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box306
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-4.5F, 10F, 1.6F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box307
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-4.5F, 11F, 1.6F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box308
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-4.5F, 10F, -2.6F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box309
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-4.5F, 11F, -2.6F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box310
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(3.6F, 10F, -1.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box311
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(3.6F, 11F, -1.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box312
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(3.6F, 10F, -0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box313
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(3.5F, 10F, -2.6F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box314
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(3.5F, 11F, -2.6F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box315
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(3.6F, 11F, -0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box316
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(3.6F, 11F, 0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box317
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(3.6F, 10F, 0.5F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box318
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(3.5F, 10F, 1.6F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box319
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(3.5F, 11F, 1.6F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box320
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-4.85F, 15F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box331
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-4.85F, 14F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box332
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-4.95F, 14F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box333
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-4.95F, 15F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box334
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-4.95F, 15F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box335
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-4.95F, 14F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box336
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-4.95F, 14F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box337
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-4.95F, 15F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box338
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-4.85F, 15F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box339
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-4.85F, 14F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box340
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-4.85F, 15F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box341
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-4.85F, 14F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box342
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-5F, 17.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box343
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(-5F, 16.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box344
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-5.1F, 16.5F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box345
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-5.1F, 17.5F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box346
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-5.1F, 16.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box347
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-5.1F, 17.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box348
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-5.1F, 16.5F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box349
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-5.1F, 17.5F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box350
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-5F, 17.5F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box351
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-5F, 16.5F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box352
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-5F, 16.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box353
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-5F, 17.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box354
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(0.3F, 18.2F, -2.5F, 5, 1, 5, 0F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F); // Import Box365
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-3.5F, 13.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box369
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-3.5F, 14.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box370
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-2.5F, 14.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box371
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(-2.5F, 13.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box372
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-3.7F, 16F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box378
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(-3.7F, 17F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box379
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-2.7F, 17F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box380
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-2.7F, 16F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box381
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(2.5F, 13.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box390
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(2.5F, 14.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box391
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(1.5F, 14.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box392
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(1.5F, 13.5F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box393
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(1.7F, 16F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box394
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(1.7F, 17F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box395
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(2.7F, 17F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box396
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(2.7F, 16F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box397
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(-1.5F, 12.7F, -2.5F, 1, 6, 1, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Import Box398
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(0.5F, 12.7F, -2.5F, 1, 6, 1, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Import Box399
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(0.5F, 12.7F, 1.5F, 1, 6, 1, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Import Box400
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(-1.5F, 12.7F, 1.5F, 1, 6, 1, 0F, -1.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Import Box401
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(-3.5F, 13.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box414
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(-2.5F, 13.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box415
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(-2.5F, 14.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box416
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(-3.5F, 14.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box417
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(1.5F, 14.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box418
		bodyModel[152].setRotationPoint(0F, 0F, 0F);

		bodyModel[153].addShapeBox(1.5F, 13.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box419
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(2.5F, 13.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box420
		bodyModel[154].setRotationPoint(0F, 0F, 0F);

		bodyModel[155].addShapeBox(2.5F, 14.5F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box421
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(-3.7F, 16F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box422
		bodyModel[156].setRotationPoint(0F, 0F, 0F);

		bodyModel[157].addShapeBox(-2.7F, 16F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box423
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addShapeBox(-2.7F, 17F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box424
		bodyModel[158].setRotationPoint(0F, 0F, 0F);

		bodyModel[159].addShapeBox(-3.7F, 17F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box425
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(1.7F, 16F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box426
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(1.7F, 17F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box427
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addShapeBox(2.7F, 17F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box428
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addShapeBox(2.7F, 16F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box429
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(-3.5F, 0.8F, -2.6F, 7, 1, 2, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Import Box531
		bodyModel[164].setRotationPoint(0F, 0F, 0F);

		bodyModel[165].addShapeBox(-3.5F, -1F, -2.6F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Import Box532
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addShapeBox(2.5F, -1F, -2.6F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Import Box542
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(3.85F, 14F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box549
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(4F, 14F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box550
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(4F, 14F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box551
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(4F, 14F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box552
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(4F, 14F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box553
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(3.85F, 14F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box554
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(3.85F, 15F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box555
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(4F, 15F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box556
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(3.95F, 15F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box557
		bodyModel[175].setRotationPoint(0F, 0F, 0F);

		bodyModel[176].addShapeBox(3.95F, 15F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box558
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(3.95F, 15F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box559
		bodyModel[177].setRotationPoint(0F, 0F, 0F);

		bodyModel[178].addShapeBox(3.85F, 15F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box560
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(4.2F, 17F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box561
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(4.2F, 17F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box562
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(4.2F, 17F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box563
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(4.1F, 16F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box564
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(4.1F, 17F, -2.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box565
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(4.1F, 16F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box566
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addShapeBox(4.1F, 17F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box567
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(4.1F, 16F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box568
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(4.1F, 17F, 1.9F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box569
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(4F, 16F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box570
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addShapeBox(4F, 16F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box571
		bodyModel[189].setRotationPoint(0F, 0F, 0F);

		bodyModel[190].addShapeBox(4F, 16F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Import Box572
		bodyModel[190].setRotationPoint(0F, 0F, 0F);

		bodyModel[191].addShapeBox(-4F, 9.8F, -2F, 3, 7, 4, 0F, 0.3F, 0.1F, 0.1F, 1.3F, 0.1F, 0.1F, 1.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F); // Box 308
		bodyModel[191].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[51];
		leftArmModel[0] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Import Box73
		leftArmModel[1] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import Box3
		leftArmModel[2] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Import Box77
		leftArmModel[3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box52
		leftArmModel[4] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Import Box53
		leftArmModel[5] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Import Box54
		leftArmModel[6] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box55
		leftArmModel[7] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Import Box56
		leftArmModel[8] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import Box57
		leftArmModel[9] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Import Box58
		leftArmModel[10] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Import Box59
		leftArmModel[11] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box60
		leftArmModel[12] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Import Box61
		leftArmModel[13] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Import Box62
		leftArmModel[14] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Import Box63
		leftArmModel[15] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Import Box64
		leftArmModel[16] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Import Box65
		leftArmModel[17] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Import Box66
		leftArmModel[18] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Import Box68
		leftArmModel[19] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Import Box69
		leftArmModel[20] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import Box70
		leftArmModel[21] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 347
		leftArmModel[22] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 348
		leftArmModel[23] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 349
		leftArmModel[24] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 350
		leftArmModel[25] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 351
		leftArmModel[26] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 352
		leftArmModel[27] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 353
		leftArmModel[28] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 354
		leftArmModel[29] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 355
		leftArmModel[30] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 356
		leftArmModel[31] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 357
		leftArmModel[32] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 358
		leftArmModel[33] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 359
		leftArmModel[34] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 360
		leftArmModel[35] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 361
		leftArmModel[36] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Box 362
		leftArmModel[37] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 363
		leftArmModel[38] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 364
		leftArmModel[39] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 374
		leftArmModel[40] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 375
		leftArmModel[41] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 376
		leftArmModel[42] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 377
		leftArmModel[43] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 378
		leftArmModel[44] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 379
		leftArmModel[45] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 380
		leftArmModel[46] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 381
		leftArmModel[47] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 382
		leftArmModel[48] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 383
		leftArmModel[49] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 384
		leftArmModel[50] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 385

		leftArmModel[0].addShapeBox(-2.1F, 4.5F, -2F, 1, 1, 4, 0F, -0.7F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.7F, 0F, -1F); // Import Box73
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6.6F, -2F, 4, 2, 4, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 0F, -2F, 4, 7, 4, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Import Box77
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.82F, -3.01F, -3.1F, 4, 1, 1, 0F, 0.3F, -0.5F, -1.1F, -0.85F, -0.5F, -1.1F, -0.35F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box52
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.82F, -2.01F, -3.1F, 4, 1, 1, 0F, 0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box53
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-0.82F, -1.01F, -3.1F, 4, 1, 1, 0F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.55F, 0.2F, 0F, -0.55F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box54
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-0.82F, 0.99F, -3.1F, 4, 1, 1, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box55
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-0.82F, -0.01F, -3.1F, 4, 1, 1, 0F, 0.3F, 0F, -0.55F, 0.2F, 0F, -0.55F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box56
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-0.82F, -3.01F, -1.5F, 4, 1, 3, 0F, 0.3F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box57
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-0.82F, -2.01F, -1.5F, 4, 1, 3, 0F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box58
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-0.82F, -1.01F, -1.5F, 4, 1, 3, 0F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box59
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-0.82F, -0.01F, -1.5F, 4, 1, 3, 0F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box60
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-0.82F, 0.99F, -1.5F, 4, 1, 3, 0F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Import Box61
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-0.82F, 0.99F, 2.1F, 4, 1, 1, 0F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F); // Import Box62
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(-0.82F, -0.01F, 2.1F, 4, 1, 1, 0F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.2F, 0F, -0.55F, 0.3F, 0F, -0.55F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Import Box63
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-0.82F, -1.01F, 2.1F, 4, 1, 1, 0F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0F, 0F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.2F, 0F, -0.55F, 0.3F, 0F, -0.55F); // Import Box64
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(-0.82F, -2.01F, 2.1F, 4, 1, 1, 0F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0F, 0F, -0.7F, 0.3F, 0F, -0.7F); // Import Box65
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(-0.82F, -3.01F, 2.1F, 4, 1, 1, 0F, 0.3F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, -0.85F, -0.5F, -1.1F, 0.3F, -0.5F, -1.1F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, -0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F); // Import Box66
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(-0.67F, 2F, -3.9F, 4, 3, 1, 0F, 0.25F, 0F, -0.95F, -0.25F, 0F, -0.95F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.25F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F); // Import Box68
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(4.23F, 2F, -2F, 1, 3, 4, 0F, 0.45F, 0F, 0.45F, -1.05F, 0F, -0.35F, -1.05F, 0F, -0.35F, 0.45F, 0F, 0.45F, 0.45F, -0.5F, 0.45F, -1.05F, -0.5F, -0.35F, -1.05F, -0.5F, -0.35F, 0.45F, -0.5F, 0.45F); // Import Box69
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(-0.67F, 2F, 2.9F, 4, 3, 1, 0F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, -0.25F, 0F, -0.95F, 0.25F, 0F, -0.95F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, -0.25F, -0.5F, -0.95F, 0.25F, -0.5F, -0.95F); // Import Box70
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(1.5F, 1F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 347
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(0.5F, 1F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 348
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(-0.5F, 1F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 349
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(-0.5F, -0.5F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 350
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(-0.5F, -2F, 1.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 351
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(0.5F, -2F, 1.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 352
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(0.5F, -0.5F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 353
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(1.5F, -0.5F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 354
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(1.5F, -2F, 1.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 355
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(1.5F, 1F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 356
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(0.5F, 1F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 357
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(-0.5F, 1F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 358
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);

		leftArmModel[33].addShapeBox(-0.5F, -0.5F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 359
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);

		leftArmModel[34].addShapeBox(-0.5F, -2F, -2.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 360
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);

		leftArmModel[35].addShapeBox(0.5F, -2F, -2.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 361
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);

		leftArmModel[36].addShapeBox(0.5F, -0.5F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 362
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);

		leftArmModel[37].addShapeBox(1.5F, -0.5F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 363
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);

		leftArmModel[38].addShapeBox(1.5F, -2F, -2.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 364
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);

		leftArmModel[39].addShapeBox(3.4F, 0.5F, -4.44089209850063E-16F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 374
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);

		leftArmModel[40].addShapeBox(3.4F, 0.5F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 375
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);

		leftArmModel[41].addShapeBox(3.3F, 0.5F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 376
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);

		leftArmModel[42].addShapeBox(3.3F, -0.5F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 377
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);

		leftArmModel[43].addShapeBox(3F, -1.5F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 378
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);

		leftArmModel[44].addShapeBox(2.95F, -1.5F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 379
		leftArmModel[44].setRotationPoint(0F, 0F, 0F);

		leftArmModel[45].addShapeBox(3.2F, -0.5F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 380
		leftArmModel[45].setRotationPoint(0F, 0F, 0F);

		leftArmModel[46].addShapeBox(3.2F, -0.5F, -4.44089209850063E-16F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 381
		leftArmModel[46].setRotationPoint(0F, 0F, 0F);

		leftArmModel[47].addShapeBox(2.95F, -1.5F, -4.44089209850063E-16F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 382
		leftArmModel[47].setRotationPoint(0F, 0F, 0F);

		leftArmModel[48].addShapeBox(3.4F, 0.5F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 383
		leftArmModel[48].setRotationPoint(0F, 0F, 0F);

		leftArmModel[49].addShapeBox(3.2F, -0.5F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 384
		leftArmModel[49].setRotationPoint(0F, 0F, 0F);

		leftArmModel[50].addShapeBox(2.95F, -1.5F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 385
		leftArmModel[50].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[51];
		rightArmModel[0] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Import Box72
		rightArmModel[1] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Import Box2
		rightArmModel[2] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Import Box1
		rightArmModel[3] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import Box151
		rightArmModel[4] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box5
		rightArmModel[5] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import Box6
		rightArmModel[6] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import Box7
		rightArmModel[7] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import Box8
		rightArmModel[8] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Import Box9
		rightArmModel[9] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Import Box10
		rightArmModel[10] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import Box11
		rightArmModel[11] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Import Box12
		rightArmModel[12] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Import Box13
		rightArmModel[13] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Import Box14
		rightArmModel[14] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box15
		rightArmModel[15] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Import Box16
		rightArmModel[16] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box17
		rightArmModel[17] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Import Box18
		rightArmModel[18] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box21
		rightArmModel[19] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box23
		rightArmModel[20] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import Box24
		rightArmModel[21] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 329
		rightArmModel[22] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 330
		rightArmModel[23] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 331
		rightArmModel[24] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 332
		rightArmModel[25] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 333
		rightArmModel[26] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 334
		rightArmModel[27] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 335
		rightArmModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 336
		rightArmModel[29] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 337
		rightArmModel[30] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 338
		rightArmModel[31] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 339
		rightArmModel[32] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 340
		rightArmModel[33] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 341
		rightArmModel[34] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 342
		rightArmModel[35] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 343
		rightArmModel[36] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 344
		rightArmModel[37] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 345
		rightArmModel[38] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 346
		rightArmModel[39] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 398
		rightArmModel[40] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 399
		rightArmModel[41] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 400
		rightArmModel[42] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 401
		rightArmModel[43] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 402
		rightArmModel[44] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 403
		rightArmModel[45] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 404
		rightArmModel[46] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 405
		rightArmModel[47] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 406
		rightArmModel[48] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 407
		rightArmModel[49] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 408
		rightArmModel[50] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 409

		rightArmModel[0].addShapeBox(1.1F, 4.5F, -2F, 1, 1, 4, 0F, 0F, 0F, 0.1F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.7F, 0F, -1F, -0.7F, 0F, -1F, 0F, 0F, 0.1F); // Import Box72
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.6F, -2F, 4, 2, 4, 0F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Import Box2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 0F, -2F, 4, 7, 4, 0F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F); // Import Box1
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.18F, -2.01F, -1.5F, 4, 1, 3, 0F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Import Box151
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.18F, -1.01F, -1.5F, 4, 1, 3, 0F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F); // Import Box5
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.18F, 0.99F, -1.5F, 4, 1, 3, 0F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F); // Import Box6
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.18F, -0.01F, -1.5F, 4, 1, 3, 0F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F); // Import Box7
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.18F, -3.01F, -1.5F, 4, 1, 3, 0F, -0.35F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Import Box8
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3.18F, -3.01F, -3.1F, 4, 1, 1, 0F, -0.85F, -0.5F, -1.1F, 0.3F, -0.5F, -1.1F, 0.3F, -0.5F, 0.3F, -0.35F, -0.5F, 0.3F, -0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F); // Import Box9
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3.18F, -2.01F, -3.1F, 4, 1, 1, 0F, -0.3F, 0F, -0.9F, 0.3F, 0F, -0.9F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0F, 0F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F); // Import Box10
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3.18F, -1.01F, -3.1F, 4, 1, 1, 0F, 0F, 0F, -0.7F, 0.3F, 0F, -0.7F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.2F, 0F, -0.55F, 0.3F, 0F, -0.55F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F); // Import Box11
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3.18F, -0.01F, -3.1F, 4, 1, 1, 0F, 0.2F, 0F, -0.55F, 0.3F, 0F, -0.55F, 0.3F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F); // Import Box12
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3.18F, 0.99F, -3.1F, 4, 1, 1, 0F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F); // Import Box13
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.18F, 0.99F, 2.1F, 4, 1, 1, 0F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F); // Import Box14
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.18F, -0.01F, 2.1F, 4, 1, 1, 0F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.55F, 0.2F, 0F, -0.55F, 0.7F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F); // Import Box15
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3.18F, -1.01F, 2.1F, 4, 1, 1, 0F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0.6F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.55F, 0.2F, 0F, -0.55F); // Import Box16
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3.18F, -2.01F, 2.1F, 4, 1, 1, 0F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F, 0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F); // Import Box17
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3.18F, -3.01F, 2.1F, 4, 1, 1, 0F, -0.35F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, -1.1F, -0.85F, -0.5F, -1.1F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.9F, -0.3F, 0F, -0.9F); // Import Box18
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-3.33F, 2F, -3.9F, 4, 3, 1, 0F, -0.25F, 0F, -0.95F, 0.25F, 0F, -0.95F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, -0.25F, -0.5F, -0.95F, 0.25F, -0.5F, -0.95F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F); // Import Box21
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-5.23F, 2F, -2F, 1, 3, 4, 0F, -1.05F, 0F, -0.35F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, -1.05F, 0F, -0.35F, -1.05F, -0.5F, -0.35F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, -1.05F, -0.5F, -0.35F); // Import Box23
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-3.33F, 2F, 2.9F, 4, 3, 1, 0F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.25F, 0F, -0.95F, -0.25F, 0F, -0.95F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.25F, -0.5F, -0.95F, -0.25F, -0.5F, -0.95F); // Import Box24
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-0.5F, 1F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 329
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-1.5F, 1F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 330
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-2.5F, 1F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 331
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(-2.5F, -0.5F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 332
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(-2.5F, -2F, -2.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 333
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(-1.5F, -2F, -2.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 334
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);

		rightArmModel[27].addShapeBox(-1.5F, -0.5F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 335
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(-0.5F, -0.5F, -3F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 336
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(-0.5F, -2F, -2.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 337
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);

		rightArmModel[30].addShapeBox(-0.5F, 1F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 338
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);

		rightArmModel[31].addShapeBox(-1.5F, 1F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 339
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);

		rightArmModel[32].addShapeBox(-2.5F, 1F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 340
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);

		rightArmModel[33].addShapeBox(-2.5F, -0.5F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 341
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);

		rightArmModel[34].addShapeBox(-2.5F, -2F, 1.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 342
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);

		rightArmModel[35].addShapeBox(-1.5F, -2F, 1.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 343
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);

		rightArmModel[36].addShapeBox(-1.5F, -0.5F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 344
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);

		rightArmModel[37].addShapeBox(-0.5F, -0.5F, 2F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 345
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);

		rightArmModel[38].addShapeBox(-0.5F, -2F, 1.7F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 346
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);

		rightArmModel[39].addShapeBox(-4.3F, -0.5F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 398
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);

		rightArmModel[40].addShapeBox(-4.3F, 0.5F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 399
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);

		rightArmModel[41].addShapeBox(-4.3F, 0.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 400
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);

		rightArmModel[42].addShapeBox(-4.3F, -0.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 401
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);

		rightArmModel[43].addShapeBox(-4.3F, -0.5F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 402
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);

		rightArmModel[44].addShapeBox(-4.3F, 0.5F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 403
		rightArmModel[44].setRotationPoint(0F, 0F, 0F);

		rightArmModel[45].addShapeBox(-4.3F, -0.5F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 404
		rightArmModel[45].setRotationPoint(0F, 0F, 0F);

		rightArmModel[46].addShapeBox(-4.3F, 0.5F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 405
		rightArmModel[46].setRotationPoint(0F, 0F, 0F);

		rightArmModel[47].addShapeBox(-4F, -1.5F, 1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 406
		rightArmModel[47].setRotationPoint(0F, 0F, 0F);

		rightArmModel[48].addShapeBox(-4F, -1.5F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 407
		rightArmModel[48].setRotationPoint(0F, 0F, 0F);

		rightArmModel[49].addShapeBox(-4F, -1.5F, -1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 408
		rightArmModel[49].setRotationPoint(0F, 0F, 0F);

		rightArmModel[50].addShapeBox(-4F, -1.5F, -2.1F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 409
		rightArmModel[50].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[7];
		leftLegModel[0] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Import Box23
		leftLegModel[1] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Import Box26
		leftLegModel[2] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Import Box95
		leftLegModel[3] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Import Box97
		leftLegModel[4] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Import Box93
		leftLegModel[5] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 136
		leftLegModel[6] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 314

		leftLegModel[0].addShapeBox(-0.58F, 4.9F, -2F, 3, 2, 4, 0F, 0.5F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Import Box23
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box26
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -3.82F, 4, 2, 2, 0F, -0.275F, -0.8F, -0.75F, -0.275F, -0.8F, -0.75F, 0.125F, -0.8F, -0.475F, 0.125F, -0.8F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Import Box95
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 8.8F, -3.82F, 4, 2, 2, 0F, -0.775F, -1.6F, -1.15F, -0.775F, -1.6F, -1.15F, -0.175F, -1.6F, -0.225F, -0.175F, -1.6F, -0.225F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Import Box97
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2.3F, 4, 2, 5, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, -0.475F, 0.125F, -0.55F, -0.475F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Import Box93
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 136
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 6F, 0.3F); // Box 314
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[7];
		rightLegModel[0] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Import Box25
		rightLegModel[1] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Import Box94
		rightLegModel[2] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Import Box96
		rightLegModel[3] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Import Box25
		rightLegModel[4] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 115
		rightLegModel[5] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 307
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 315

		rightLegModel[0].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Import Box25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -3.82F, 4, 2, 2, 0F, -0.275F, -0.8F, -0.75F, -0.275F, -0.8F, -0.75F, 0.125F, -0.8F, -0.475F, 0.125F, -0.8F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Import Box94
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 8.8F, -3.82F, 4, 2, 2, 0F, -0.775F, -1.6F, -1.15F, -0.775F, -1.6F, -1.15F, -0.175F, -1.6F, -0.225F, -0.175F, -1.6F, -0.225F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Import Box96
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2.3F, 4, 2, 5, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, -0.475F, 0.125F, -0.55F, -0.475F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Import Box25
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 115
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.4F, 4.9F, -2F, 3, 2, 4, 0F, 0.1F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 307
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 6F, 0.3F); // Box 315
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);


	}
}