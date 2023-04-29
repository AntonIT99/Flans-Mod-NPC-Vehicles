//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: p51d
// Model Creator: TaskForce51
// Created on: 04.06.2020 - 11:24:34
// Last changed on: 04.06.2020 - 11:24:34

package com.wolffsmod.model.price; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP51D extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelP51D() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[394];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 799, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 97, 799, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 799, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 137, 799, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 153, 799, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 201, 799, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 241, 799, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 257, 799, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 305, 799, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 345, 799, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 393, 799, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 113, 799, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 441, 799, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 465, 799, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1, 855, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 65, 855, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 711, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 97, 711, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 489, 799, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 97, 799, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 433, 799, textureX, textureY); // Box 26
		bodyModel[21] = new ModelRendererTurbo(this, 513, 799, textureX, textureY); // Box 27
		bodyModel[22] = new ModelRendererTurbo(this, 145, 799, textureX, textureY); // Box 28
		bodyModel[23] = new ModelRendererTurbo(this, 529, 799, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 545, 799, textureX, textureY); // Box 30
		bodyModel[25] = new ModelRendererTurbo(this, 129, 855, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 569, 799, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 649, 799, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 681, 799, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 729, 799, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 398, 710, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 177, 711, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 0, 755, textureX, textureY); // Box 46
		bodyModel[33] = new ModelRendererTurbo(this, 761, 799, textureX, textureY); // Box 47
		bodyModel[34] = new ModelRendererTurbo(this, 809, 799, textureX, textureY); // Box 48
		bodyModel[35] = new ModelRendererTurbo(this, 873, 799, textureX, textureY); // Box 49
		bodyModel[36] = new ModelRendererTurbo(this, 921, 799, textureX, textureY); // Box 50
		bodyModel[37] = new ModelRendererTurbo(this, 977, 799, textureX, textureY); // Box 51
		bodyModel[38] = new ModelRendererTurbo(this, 713, 799, textureX, textureY); // Box 52
		bodyModel[39] = new ModelRendererTurbo(this, 105, 807, textureX, textureY); // Box 53
		bodyModel[40] = new ModelRendererTurbo(this, 153, 807, textureX, textureY); // Box 54
		bodyModel[41] = new ModelRendererTurbo(this, 201, 807, textureX, textureY); // Box 55
		bodyModel[42] = new ModelRendererTurbo(this, 1, 827, textureX, textureY); // Box 56
		bodyModel[43] = new ModelRendererTurbo(this, 97, 827, textureX, textureY); // Box 62
		bodyModel[44] = new ModelRendererTurbo(this, 105, 827, textureX, textureY); // Box 68
		bodyModel[45] = new ModelRendererTurbo(this, 0, 899, textureX, textureY); // Box 71
		bodyModel[46] = new ModelRendererTurbo(this, 57, 756, textureX, textureY); // Box 75
		bodyModel[47] = new ModelRendererTurbo(this, 71, 899, textureX, textureY); // Box 93
		bodyModel[48] = new ModelRendererTurbo(this, 129, 827, textureX, textureY); // Box 94
		bodyModel[49] = new ModelRendererTurbo(this, 209, 827, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 137, 756, textureX, textureY); // Box 101
		bodyModel[51] = new ModelRendererTurbo(this, 249, 827, textureX, textureY); // Box 108
		bodyModel[52] = new ModelRendererTurbo(this, 273, 711, textureX, textureY); // Box 112
		bodyModel[53] = new ModelRendererTurbo(this, 641, 799, textureX, textureY); // Box 118
		bodyModel[54] = new ModelRendererTurbo(this, 281, 827, textureX, textureY); // Box 119
		bodyModel[55] = new ModelRendererTurbo(this, 305, 827, textureX, textureY); // Box 120
		bodyModel[56] = new ModelRendererTurbo(this, 201, 827, textureX, textureY); // Box 121
		bodyModel[57] = new ModelRendererTurbo(this, 329, 827, textureX, textureY); // Box 136
		bodyModel[58] = new ModelRendererTurbo(this, 337, 711, textureX, textureY); // Box 137
		bodyModel[59] = new ModelRendererTurbo(this, 33, 756, textureX, textureY); // Box 138
		bodyModel[60] = new ModelRendererTurbo(this, 361, 711, textureX, textureY); // Box 139
		bodyModel[61] = new ModelRendererTurbo(this, 1, 711, textureX, textureY); // Box 140
		bodyModel[62] = new ModelRendererTurbo(this, 81, 711, textureX, textureY); // Box 695
		bodyModel[63] = new ModelRendererTurbo(this, 857, 823, textureX, textureY); // Box 217
		bodyModel[64] = new ModelRendererTurbo(this, 353, 827, textureX, textureY); // Box 286
		bodyModel[65] = new ModelRendererTurbo(this, 377, 827, textureX, textureY); // Box 287
		bodyModel[66] = new ModelRendererTurbo(this, 121, 827, textureX, textureY); // Box 288
		bodyModel[67] = new ModelRendererTurbo(this, 393, 827, textureX, textureY); // Box 289
		bodyModel[68] = new ModelRendererTurbo(this, 441, 827, textureX, textureY); // Box 290
		bodyModel[69] = new ModelRendererTurbo(this, 481, 827, textureX, textureY); // Box 291
		bodyModel[70] = new ModelRendererTurbo(this, 529, 827, textureX, textureY); // Box 292
		bodyModel[71] = new ModelRendererTurbo(this, 569, 827, textureX, textureY); // Box 293
		bodyModel[72] = new ModelRendererTurbo(this, 617, 827, textureX, textureY); // Box 294
		bodyModel[73] = new ModelRendererTurbo(this, 297, 827, textureX, textureY); // Box 295
		bodyModel[74] = new ModelRendererTurbo(this, 281, 827, textureX, textureY); // Box 296
		bodyModel[75] = new ModelRendererTurbo(this, 321, 827, textureX, textureY); // Box 297
		bodyModel[76] = new ModelRendererTurbo(this, 665, 827, textureX, textureY); // Box 298
		bodyModel[77] = new ModelRendererTurbo(this, 681, 827, textureX, textureY); // Box 299
		bodyModel[78] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 239
		bodyModel[79] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 240
		bodyModel[80] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Box 241
		bodyModel[81] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 242
		bodyModel[82] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 243
		bodyModel[83] = new ModelRendererTurbo(this, 105, 209, textureX, textureY); // Box 244
		bodyModel[84] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 245
		bodyModel[85] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 246
		bodyModel[86] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 247
		bodyModel[87] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Box 248
		bodyModel[88] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 250
		bodyModel[89] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 251
		bodyModel[90] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 252
		bodyModel[91] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 253
		bodyModel[92] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 962
		bodyModel[93] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 964
		bodyModel[94] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 966
		bodyModel[95] = new ModelRendererTurbo(this, 1, 236, textureX, textureY); // Box 268
		bodyModel[96] = new ModelRendererTurbo(this, 33, 236, textureX, textureY); // Box 269
		bodyModel[97] = new ModelRendererTurbo(this, 49, 236, textureX, textureY); // Box 922
		bodyModel[98] = new ModelRendererTurbo(this, 73, 236, textureX, textureY); // Box 923
		bodyModel[99] = new ModelRendererTurbo(this, 25, 236, textureX, textureY); // Box 924
		bodyModel[100] = new ModelRendererTurbo(this, 97, 236, textureX, textureY); // Box 925
		bodyModel[101] = new ModelRendererTurbo(this, 113, 236, textureX, textureY); // Box 926
		bodyModel[102] = new ModelRendererTurbo(this, 121, 236, textureX, textureY); // Box 927
		bodyModel[103] = new ModelRendererTurbo(this, 145, 236, textureX, textureY); // Box 928
		bodyModel[104] = new ModelRendererTurbo(this, 177, 236, textureX, textureY); // Box 929
		bodyModel[105] = new ModelRendererTurbo(this, 1, 236, textureX, textureY); // Box 930
		bodyModel[106] = new ModelRendererTurbo(this, 137, 236, textureX, textureY); // Box 931
		bodyModel[107] = new ModelRendererTurbo(this, 169, 236, textureX, textureY); // Box 932
		bodyModel[108] = new ModelRendererTurbo(this, 193, 236, textureX, textureY); // Box 933
		bodyModel[109] = new ModelRendererTurbo(this, 145, 236, textureX, textureY); // Box 934
		bodyModel[110] = new ModelRendererTurbo(this, 209, 236, textureX, textureY); // Box 935
		bodyModel[111] = new ModelRendererTurbo(this, 217, 236, textureX, textureY); // Box 936
		bodyModel[112] = new ModelRendererTurbo(this, 225, 236, textureX, textureY); // Box 937
		bodyModel[113] = new ModelRendererTurbo(this, 233, 236, textureX, textureY); // Box 938
		bodyModel[114] = new ModelRendererTurbo(this, 241, 236, textureX, textureY); // Box 939
		bodyModel[115] = new ModelRendererTurbo(this, 249, 236, textureX, textureY); // Box 940
		bodyModel[116] = new ModelRendererTurbo(this, 257, 236, textureX, textureY); // Box 941
		bodyModel[117] = new ModelRendererTurbo(this, 265, 236, textureX, textureY); // Box 942
		bodyModel[118] = new ModelRendererTurbo(this, 273, 236, textureX, textureY); // Box 943
		bodyModel[119] = new ModelRendererTurbo(this, 281, 236, textureX, textureY); // Box 945
		bodyModel[120] = new ModelRendererTurbo(this, 289, 236, textureX, textureY); // Box 947
		bodyModel[121] = new ModelRendererTurbo(this, 297, 236, textureX, textureY); // Box 948
		bodyModel[122] = new ModelRendererTurbo(this, 313, 236, textureX, textureY); // Box 949
		bodyModel[123] = new ModelRendererTurbo(this, 321, 236, textureX, textureY); // Box 950
		bodyModel[124] = new ModelRendererTurbo(this, 329, 236, textureX, textureY); // Box 951
		bodyModel[125] = new ModelRendererTurbo(this, 337, 236, textureX, textureY); // Box 952
		bodyModel[126] = new ModelRendererTurbo(this, 345, 236, textureX, textureY); // Box 953
		bodyModel[127] = new ModelRendererTurbo(this, 353, 236, textureX, textureY); // Box 954
		bodyModel[128] = new ModelRendererTurbo(this, 361, 236, textureX, textureY); // Box 955
		bodyModel[129] = new ModelRendererTurbo(this, 369, 236, textureX, textureY); // Box 956
		bodyModel[130] = new ModelRendererTurbo(this, 377, 236, textureX, textureY); // Box 957
		bodyModel[131] = new ModelRendererTurbo(this, 385, 236, textureX, textureY); // Box 958
		bodyModel[132] = new ModelRendererTurbo(this, 393, 236, textureX, textureY); // Box 959
		bodyModel[133] = new ModelRendererTurbo(this, 425, 236, textureX, textureY); // Box 355
		bodyModel[134] = new ModelRendererTurbo(this, 481, 236, textureX, textureY); // Box 357
		bodyModel[135] = new ModelRendererTurbo(this, 1, 262, textureX, textureY); // Box 259
		bodyModel[136] = new ModelRendererTurbo(this, 9, 262, textureX, textureY); // Box 260
		bodyModel[137] = new ModelRendererTurbo(this, 1, 262, textureX, textureY); // Box 262
		bodyModel[138] = new ModelRendererTurbo(this, 49, 262, textureX, textureY); // Box 255
		bodyModel[139] = new ModelRendererTurbo(this, 33, 262, textureX, textureY); // Box 256
		bodyModel[140] = new ModelRendererTurbo(this, 89, 262, textureX, textureY); // Box 257
		bodyModel[141] = new ModelRendererTurbo(this, 73, 262, textureX, textureY); // Box 258
		bodyModel[142] = new ModelRendererTurbo(this, 113, 262, textureX, textureY); // Box 213
		bodyModel[143] = new ModelRendererTurbo(this, 137, 262, textureX, textureY); // Box 214
		bodyModel[144] = new ModelRendererTurbo(this, 49, 262, textureX, textureY); // Box 233
		bodyModel[145] = new ModelRendererTurbo(this, 57, 262, textureX, textureY); // Box 234
		bodyModel[146] = new ModelRendererTurbo(this, 73, 262, textureX, textureY); // Box 235
		bodyModel[147] = new ModelRendererTurbo(this, 81, 262, textureX, textureY); // Box 236
		bodyModel[148] = new ModelRendererTurbo(this, 97, 262, textureX, textureY); // Box 237
		bodyModel[149] = new ModelRendererTurbo(this, 113, 262, textureX, textureY); // Box 238
		bodyModel[150] = new ModelRendererTurbo(this, 129, 262, textureX, textureY); // Box 239
		bodyModel[151] = new ModelRendererTurbo(this, 137, 262, textureX, textureY); // Box 240
		bodyModel[152] = new ModelRendererTurbo(this, 153, 262, textureX, textureY); // Box 241
		bodyModel[153] = new ModelRendererTurbo(this, 161, 262, textureX, textureY); // Box 242
		bodyModel[154] = new ModelRendererTurbo(this, 169, 262, textureX, textureY); // Box 243
		bodyModel[155] = new ModelRendererTurbo(this, 177, 262, textureX, textureY); // Box 244
		bodyModel[156] = new ModelRendererTurbo(this, 185, 262, textureX, textureY); // Box 248
		bodyModel[157] = new ModelRendererTurbo(this, 193, 262, textureX, textureY); // Box 249
		bodyModel[158] = new ModelRendererTurbo(this, 201, 262, textureX, textureY); // Box 250
		bodyModel[159] = new ModelRendererTurbo(this, 209, 262, textureX, textureY); // Box 251
		bodyModel[160] = new ModelRendererTurbo(this, 217, 262, textureX, textureY); // Box 252
		bodyModel[161] = new ModelRendererTurbo(this, 225, 262, textureX, textureY); // Box 253
		bodyModel[162] = new ModelRendererTurbo(this, 233, 262, textureX, textureY); // Box 254
		bodyModel[163] = new ModelRendererTurbo(this, 241, 262, textureX, textureY); // Box 255
		bodyModel[164] = new ModelRendererTurbo(this, 249, 262, textureX, textureY); // Box 256
		bodyModel[165] = new ModelRendererTurbo(this, 257, 262, textureX, textureY); // Box 257
		bodyModel[166] = new ModelRendererTurbo(this, 265, 262, textureX, textureY); // Box 258
		bodyModel[167] = new ModelRendererTurbo(this, 273, 262, textureX, textureY); // Box 259
		bodyModel[168] = new ModelRendererTurbo(this, 281, 262, textureX, textureY); // Box 260
		bodyModel[169] = new ModelRendererTurbo(this, 289, 262, textureX, textureY); // Box 261
		bodyModel[170] = new ModelRendererTurbo(this, 297, 262, textureX, textureY); // Box 262
		bodyModel[171] = new ModelRendererTurbo(this, 305, 262, textureX, textureY); // Box 263
		bodyModel[172] = new ModelRendererTurbo(this, 313, 262, textureX, textureY); // Box 265
		bodyModel[173] = new ModelRendererTurbo(this, 321, 262, textureX, textureY); // Box 266
		bodyModel[174] = new ModelRendererTurbo(this, 329, 262, textureX, textureY); // Box 267
		bodyModel[175] = new ModelRendererTurbo(this, 337, 262, textureX, textureY); // Box 268
		bodyModel[176] = new ModelRendererTurbo(this, 345, 262, textureX, textureY); // Box 269
		bodyModel[177] = new ModelRendererTurbo(this, 353, 262, textureX, textureY); // Box 270
		bodyModel[178] = new ModelRendererTurbo(this, 361, 262, textureX, textureY); // Box 271
		bodyModel[179] = new ModelRendererTurbo(this, 369, 262, textureX, textureY); // Box 272
		bodyModel[180] = new ModelRendererTurbo(this, 377, 262, textureX, textureY); // Box 273
		bodyModel[181] = new ModelRendererTurbo(this, 385, 262, textureX, textureY); // Box 274
		bodyModel[182] = new ModelRendererTurbo(this, 393, 262, textureX, textureY); // Box 275
		bodyModel[183] = new ModelRendererTurbo(this, 401, 262, textureX, textureY); // Box 276
		bodyModel[184] = new ModelRendererTurbo(this, 409, 262, textureX, textureY); // Box 277
		bodyModel[185] = new ModelRendererTurbo(this, 417, 262, textureX, textureY); // Box 278
		bodyModel[186] = new ModelRendererTurbo(this, 425, 262, textureX, textureY); // Box 279
		bodyModel[187] = new ModelRendererTurbo(this, 433, 262, textureX, textureY); // Box 280
		bodyModel[188] = new ModelRendererTurbo(this, 441, 262, textureX, textureY); // Box 281
		bodyModel[189] = new ModelRendererTurbo(this, 449, 262, textureX, textureY); // Box 282
		bodyModel[190] = new ModelRendererTurbo(this, 457, 262, textureX, textureY); // Box 283
		bodyModel[191] = new ModelRendererTurbo(this, 465, 262, textureX, textureY); // Box 284
		bodyModel[192] = new ModelRendererTurbo(this, 473, 262, textureX, textureY); // Box 285
		bodyModel[193] = new ModelRendererTurbo(this, 481, 262, textureX, textureY); // Box 286
		bodyModel[194] = new ModelRendererTurbo(this, 489, 262, textureX, textureY); // Box 287
		bodyModel[195] = new ModelRendererTurbo(this, 497, 262, textureX, textureY); // Box 288
		bodyModel[196] = new ModelRendererTurbo(this, 505, 262, textureX, textureY); // Box 289
		bodyModel[197] = new ModelRendererTurbo(this, 513, 262, textureX, textureY); // Box 290
		bodyModel[198] = new ModelRendererTurbo(this, 521, 262, textureX, textureY); // Box 318
		bodyModel[199] = new ModelRendererTurbo(this, 529, 262, textureX, textureY); // Box 319
		bodyModel[200] = new ModelRendererTurbo(this, 537, 262, textureX, textureY); // Box 320
		bodyModel[201] = new ModelRendererTurbo(this, 545, 262, textureX, textureY); // Box 321
		bodyModel[202] = new ModelRendererTurbo(this, 553, 262, textureX, textureY); // Box 322
		bodyModel[203] = new ModelRendererTurbo(this, 561, 262, textureX, textureY); // Box 323
		bodyModel[204] = new ModelRendererTurbo(this, 569, 262, textureX, textureY); // Box 324
		bodyModel[205] = new ModelRendererTurbo(this, 577, 262, textureX, textureY); // Box 325
		bodyModel[206] = new ModelRendererTurbo(this, 585, 262, textureX, textureY); // Box 326
		bodyModel[207] = new ModelRendererTurbo(this, 593, 262, textureX, textureY); // Box 327
		bodyModel[208] = new ModelRendererTurbo(this, 601, 262, textureX, textureY); // Box 328
		bodyModel[209] = new ModelRendererTurbo(this, 609, 262, textureX, textureY); // Box 329
		bodyModel[210] = new ModelRendererTurbo(this, 617, 262, textureX, textureY); // Box 330
		bodyModel[211] = new ModelRendererTurbo(this, 625, 262, textureX, textureY); // Box 331
		bodyModel[212] = new ModelRendererTurbo(this, 633, 262, textureX, textureY); // Box 332
		bodyModel[213] = new ModelRendererTurbo(this, 641, 262, textureX, textureY); // Box 333
		bodyModel[214] = new ModelRendererTurbo(this, 649, 262, textureX, textureY); // Box 334
		bodyModel[215] = new ModelRendererTurbo(this, 657, 262, textureX, textureY); // Box 340
		bodyModel[216] = new ModelRendererTurbo(this, 665, 262, textureX, textureY); // Box 341
		bodyModel[217] = new ModelRendererTurbo(this, 673, 262, textureX, textureY); // Box 342
		bodyModel[218] = new ModelRendererTurbo(this, 681, 262, textureX, textureY); // Box 343
		bodyModel[219] = new ModelRendererTurbo(this, 689, 262, textureX, textureY); // Box 344
		bodyModel[220] = new ModelRendererTurbo(this, 697, 262, textureX, textureY); // Box 345
		bodyModel[221] = new ModelRendererTurbo(this, 705, 262, textureX, textureY); // Box 346
		bodyModel[222] = new ModelRendererTurbo(this, 713, 262, textureX, textureY); // Box 347
		bodyModel[223] = new ModelRendererTurbo(this, 721, 262, textureX, textureY); // Box 348
		bodyModel[224] = new ModelRendererTurbo(this, 729, 262, textureX, textureY); // Box 349
		bodyModel[225] = new ModelRendererTurbo(this, 737, 262, textureX, textureY); // Box 350
		bodyModel[226] = new ModelRendererTurbo(this, 745, 262, textureX, textureY); // Box 351
		bodyModel[227] = new ModelRendererTurbo(this, 753, 262, textureX, textureY); // Box 352
		bodyModel[228] = new ModelRendererTurbo(this, 761, 262, textureX, textureY); // Box 353
		bodyModel[229] = new ModelRendererTurbo(this, 769, 262, textureX, textureY); // Box 354
		bodyModel[230] = new ModelRendererTurbo(this, 777, 262, textureX, textureY); // Box 355
		bodyModel[231] = new ModelRendererTurbo(this, 785, 262, textureX, textureY); // Box 356
		bodyModel[232] = new ModelRendererTurbo(this, 793, 262, textureX, textureY); // Box 387
		bodyModel[233] = new ModelRendererTurbo(this, 801, 262, textureX, textureY); // Box 388
		bodyModel[234] = new ModelRendererTurbo(this, 809, 262, textureX, textureY); // Box 390
		bodyModel[235] = new ModelRendererTurbo(this, 817, 262, textureX, textureY); // Box 391
		bodyModel[236] = new ModelRendererTurbo(this, 825, 262, textureX, textureY); // Box 392
		bodyModel[237] = new ModelRendererTurbo(this, 833, 262, textureX, textureY); // Box 393
		bodyModel[238] = new ModelRendererTurbo(this, 841, 262, textureX, textureY); // Box 394
		bodyModel[239] = new ModelRendererTurbo(this, 849, 262, textureX, textureY); // Box 395
		bodyModel[240] = new ModelRendererTurbo(this, 857, 262, textureX, textureY); // Box 396
		bodyModel[241] = new ModelRendererTurbo(this, 865, 262, textureX, textureY); // Box 397
		bodyModel[242] = new ModelRendererTurbo(this, 873, 262, textureX, textureY); // Box 398
		bodyModel[243] = new ModelRendererTurbo(this, 881, 262, textureX, textureY); // Box 399
		bodyModel[244] = new ModelRendererTurbo(this, 889, 262, textureX, textureY); // Box 400
		bodyModel[245] = new ModelRendererTurbo(this, 897, 262, textureX, textureY); // Box 401
		bodyModel[246] = new ModelRendererTurbo(this, 905, 262, textureX, textureY); // Box 402
		bodyModel[247] = new ModelRendererTurbo(this, 913, 262, textureX, textureY); // Box 403
		bodyModel[248] = new ModelRendererTurbo(this, 921, 262, textureX, textureY); // Box 404
		bodyModel[249] = new ModelRendererTurbo(this, 929, 262, textureX, textureY); // Box 405
		bodyModel[250] = new ModelRendererTurbo(this, 937, 262, textureX, textureY); // Box 406
		bodyModel[251] = new ModelRendererTurbo(this, 945, 262, textureX, textureY); // Box 407
		bodyModel[252] = new ModelRendererTurbo(this, 953, 262, textureX, textureY); // Box 408
		bodyModel[253] = new ModelRendererTurbo(this, 961, 262, textureX, textureY); // Box 409
		bodyModel[254] = new ModelRendererTurbo(this, 969, 262, textureX, textureY); // Box 410
		bodyModel[255] = new ModelRendererTurbo(this, 977, 262, textureX, textureY); // Box 411
		bodyModel[256] = new ModelRendererTurbo(this, 985, 262, textureX, textureY); // Box 412
		bodyModel[257] = new ModelRendererTurbo(this, 993, 262, textureX, textureY); // Box 413
		bodyModel[258] = new ModelRendererTurbo(this, 1001, 262, textureX, textureY); // Box 414
		bodyModel[259] = new ModelRendererTurbo(this, 1009, 262, textureX, textureY); // Box 415
		bodyModel[260] = new ModelRendererTurbo(this, 1017, 262, textureX, textureY); // Box 416
		bodyModel[261] = new ModelRendererTurbo(this, 1, 270, textureX, textureY); // Box 417
		bodyModel[262] = new ModelRendererTurbo(this, 9, 270, textureX, textureY); // Box 418
		bodyModel[263] = new ModelRendererTurbo(this, 57, 270, textureX, textureY); // Box 419
		bodyModel[264] = new ModelRendererTurbo(this, 73, 270, textureX, textureY); // Box 421
		bodyModel[265] = new ModelRendererTurbo(this, 81, 270, textureX, textureY); // Box 422
		bodyModel[266] = new ModelRendererTurbo(this, 97, 270, textureX, textureY); // Box 423
		bodyModel[267] = new ModelRendererTurbo(this, 161, 270, textureX, textureY); // Box 424
		bodyModel[268] = new ModelRendererTurbo(this, 169, 270, textureX, textureY); // Box 425
		bodyModel[269] = new ModelRendererTurbo(this, 177, 270, textureX, textureY); // Box 426
		bodyModel[270] = new ModelRendererTurbo(this, 185, 270, textureX, textureY); // Box 427
		bodyModel[271] = new ModelRendererTurbo(this, 193, 270, textureX, textureY); // Box 428
		bodyModel[272] = new ModelRendererTurbo(this, 201, 270, textureX, textureY); // Box 429
		bodyModel[273] = new ModelRendererTurbo(this, 209, 270, textureX, textureY); // Box 430
		bodyModel[274] = new ModelRendererTurbo(this, 217, 270, textureX, textureY); // Box 431
		bodyModel[275] = new ModelRendererTurbo(this, 225, 270, textureX, textureY); // Box 432
		bodyModel[276] = new ModelRendererTurbo(this, 233, 270, textureX, textureY); // Box 433
		bodyModel[277] = new ModelRendererTurbo(this, 241, 270, textureX, textureY); // Box 434
		bodyModel[278] = new ModelRendererTurbo(this, 249, 270, textureX, textureY); // Box 435
		bodyModel[279] = new ModelRendererTurbo(this, 257, 270, textureX, textureY); // Box 436
		bodyModel[280] = new ModelRendererTurbo(this, 265, 270, textureX, textureY); // Box 437
		bodyModel[281] = new ModelRendererTurbo(this, 273, 270, textureX, textureY); // Box 438
		bodyModel[282] = new ModelRendererTurbo(this, 281, 270, textureX, textureY); // Box 439
		bodyModel[283] = new ModelRendererTurbo(this, 289, 270, textureX, textureY); // Box 440
		bodyModel[284] = new ModelRendererTurbo(this, 297, 270, textureX, textureY); // Box 441
		bodyModel[285] = new ModelRendererTurbo(this, 305, 270, textureX, textureY); // Box 442
		bodyModel[286] = new ModelRendererTurbo(this, 313, 270, textureX, textureY); // Box 443
		bodyModel[287] = new ModelRendererTurbo(this, 321, 270, textureX, textureY); // Box 444
		bodyModel[288] = new ModelRendererTurbo(this, 329, 270, textureX, textureY); // Box 445
		bodyModel[289] = new ModelRendererTurbo(this, 337, 270, textureX, textureY); // Box 446
		bodyModel[290] = new ModelRendererTurbo(this, 345, 270, textureX, textureY); // Box 447
		bodyModel[291] = new ModelRendererTurbo(this, 353, 270, textureX, textureY); // Box 448
		bodyModel[292] = new ModelRendererTurbo(this, 361, 270, textureX, textureY); // Box 449
		bodyModel[293] = new ModelRendererTurbo(this, 369, 270, textureX, textureY); // Box 450
		bodyModel[294] = new ModelRendererTurbo(this, 377, 270, textureX, textureY); // Box 451
		bodyModel[295] = new ModelRendererTurbo(this, 385, 270, textureX, textureY); // Box 452
		bodyModel[296] = new ModelRendererTurbo(this, 393, 270, textureX, textureY); // Box 453
		bodyModel[297] = new ModelRendererTurbo(this, 401, 270, textureX, textureY); // Box 454
		bodyModel[298] = new ModelRendererTurbo(this, 409, 270, textureX, textureY); // Box 455
		bodyModel[299] = new ModelRendererTurbo(this, 417, 270, textureX, textureY); // Box 456
		bodyModel[300] = new ModelRendererTurbo(this, 425, 270, textureX, textureY); // Box 457
		bodyModel[301] = new ModelRendererTurbo(this, 433, 270, textureX, textureY); // Box 458
		bodyModel[302] = new ModelRendererTurbo(this, 441, 270, textureX, textureY); // Box 459
		bodyModel[303] = new ModelRendererTurbo(this, 449, 270, textureX, textureY); // Box 460
		bodyModel[304] = new ModelRendererTurbo(this, 457, 270, textureX, textureY); // Box 461
		bodyModel[305] = new ModelRendererTurbo(this, 465, 270, textureX, textureY); // Box 462
		bodyModel[306] = new ModelRendererTurbo(this, 473, 270, textureX, textureY); // Box 463
		bodyModel[307] = new ModelRendererTurbo(this, 481, 270, textureX, textureY); // Box 464
		bodyModel[308] = new ModelRendererTurbo(this, 489, 270, textureX, textureY); // Box 465
		bodyModel[309] = new ModelRendererTurbo(this, 497, 270, textureX, textureY); // Box 466
		bodyModel[310] = new ModelRendererTurbo(this, 505, 270, textureX, textureY); // Box 467
		bodyModel[311] = new ModelRendererTurbo(this, 513, 270, textureX, textureY); // Box 468
		bodyModel[312] = new ModelRendererTurbo(this, 521, 270, textureX, textureY); // Box 469
		bodyModel[313] = new ModelRendererTurbo(this, 529, 270, textureX, textureY); // Box 470
		bodyModel[314] = new ModelRendererTurbo(this, 537, 270, textureX, textureY); // Box 471
		bodyModel[315] = new ModelRendererTurbo(this, 545, 270, textureX, textureY); // Box 472
		bodyModel[316] = new ModelRendererTurbo(this, 553, 270, textureX, textureY); // Box 473
		bodyModel[317] = new ModelRendererTurbo(this, 561, 270, textureX, textureY); // Box 474
		bodyModel[318] = new ModelRendererTurbo(this, 569, 270, textureX, textureY); // Box 475
		bodyModel[319] = new ModelRendererTurbo(this, 577, 270, textureX, textureY); // Box 476
		bodyModel[320] = new ModelRendererTurbo(this, 585, 270, textureX, textureY); // Box 477
		bodyModel[321] = new ModelRendererTurbo(this, 593, 270, textureX, textureY); // Box 478
		bodyModel[322] = new ModelRendererTurbo(this, 601, 270, textureX, textureY); // Box 480
		bodyModel[323] = new ModelRendererTurbo(this, 609, 270, textureX, textureY); // Box 481
		bodyModel[324] = new ModelRendererTurbo(this, 617, 270, textureX, textureY); // Box 482
		bodyModel[325] = new ModelRendererTurbo(this, 625, 270, textureX, textureY); // Box 483
		bodyModel[326] = new ModelRendererTurbo(this, 633, 270, textureX, textureY); // Box 484
		bodyModel[327] = new ModelRendererTurbo(this, 641, 270, textureX, textureY); // Box 485
		bodyModel[328] = new ModelRendererTurbo(this, 649, 270, textureX, textureY); // Box 486
		bodyModel[329] = new ModelRendererTurbo(this, 657, 270, textureX, textureY); // Box 487
		bodyModel[330] = new ModelRendererTurbo(this, 665, 270, textureX, textureY); // Box 488
		bodyModel[331] = new ModelRendererTurbo(this, 673, 270, textureX, textureY); // Box 489
		bodyModel[332] = new ModelRendererTurbo(this, 681, 270, textureX, textureY); // Box 460
		bodyModel[333] = new ModelRendererTurbo(this, 689, 270, textureX, textureY); // Box 461
		bodyModel[334] = new ModelRendererTurbo(this, 697, 270, textureX, textureY); // Box 462
		bodyModel[335] = new ModelRendererTurbo(this, 705, 270, textureX, textureY); // Box 463
		bodyModel[336] = new ModelRendererTurbo(this, 713, 270, textureX, textureY); // Box 464
		bodyModel[337] = new ModelRendererTurbo(this, 721, 270, textureX, textureY); // Box 465
		bodyModel[338] = new ModelRendererTurbo(this, 729, 270, textureX, textureY); // Box 466
		bodyModel[339] = new ModelRendererTurbo(this, 737, 270, textureX, textureY); // Box 467
		bodyModel[340] = new ModelRendererTurbo(this, 745, 270, textureX, textureY); // Box 468
		bodyModel[341] = new ModelRendererTurbo(this, 753, 270, textureX, textureY); // Box 469
		bodyModel[342] = new ModelRendererTurbo(this, 761, 270, textureX, textureY); // Box 470
		bodyModel[343] = new ModelRendererTurbo(this, 769, 270, textureX, textureY); // Box 471
		bodyModel[344] = new ModelRendererTurbo(this, 777, 270, textureX, textureY); // Box 472
		bodyModel[345] = new ModelRendererTurbo(this, 785, 270, textureX, textureY); // Box 473
		bodyModel[346] = new ModelRendererTurbo(this, 793, 270, textureX, textureY); // Box 474
		bodyModel[347] = new ModelRendererTurbo(this, 801, 270, textureX, textureY); // Box 475
		bodyModel[348] = new ModelRendererTurbo(this, 809, 270, textureX, textureY); // Box 476
		bodyModel[349] = new ModelRendererTurbo(this, 817, 270, textureX, textureY); // Box 477
		bodyModel[350] = new ModelRendererTurbo(this, 825, 270, textureX, textureY); // Box 478
		bodyModel[351] = new ModelRendererTurbo(this, 833, 270, textureX, textureY); // Box 479
		bodyModel[352] = new ModelRendererTurbo(this, 841, 270, textureX, textureY); // Box 480
		bodyModel[353] = new ModelRendererTurbo(this, 849, 270, textureX, textureY); // Box 481
		bodyModel[354] = new ModelRendererTurbo(this, 857, 270, textureX, textureY); // Box 482
		bodyModel[355] = new ModelRendererTurbo(this, 865, 270, textureX, textureY); // Box 483
		bodyModel[356] = new ModelRendererTurbo(this, 873, 270, textureX, textureY); // Box 484
		bodyModel[357] = new ModelRendererTurbo(this, 881, 270, textureX, textureY); // Box 485
		bodyModel[358] = new ModelRendererTurbo(this, 889, 270, textureX, textureY); // Box 486
		bodyModel[359] = new ModelRendererTurbo(this, 889, 270, textureX, textureY); // Box 487
		bodyModel[360] = new ModelRendererTurbo(this, 905, 270, textureX, textureY); // Box 462
		bodyModel[361] = new ModelRendererTurbo(this, 929, 270, textureX, textureY); // Box 463
		bodyModel[362] = new ModelRendererTurbo(this, 945, 270, textureX, textureY); // Box 465
		bodyModel[363] = new ModelRendererTurbo(this, 961, 270, textureX, textureY); // Box 466
		bodyModel[364] = new ModelRendererTurbo(this, 905, 270, textureX, textureY); // Box 467
		bodyModel[365] = new ModelRendererTurbo(this, 977, 270, textureX, textureY); // Box 468
		bodyModel[366] = new ModelRendererTurbo(this, 985, 270, textureX, textureY); // Box 469
		bodyModel[367] = new ModelRendererTurbo(this, 993, 270, textureX, textureY); // Box 470
		bodyModel[368] = new ModelRendererTurbo(this, 1001, 270, textureX, textureY); // Box 471
		bodyModel[369] = new ModelRendererTurbo(this, 1009, 270, textureX, textureY); // Box 472
		bodyModel[370] = new ModelRendererTurbo(this, 121, 278, textureX, textureY); // Box 512
		bodyModel[371] = new ModelRendererTurbo(this, 137, 278, textureX, textureY); // Box 513
		bodyModel[372] = new ModelRendererTurbo(this, 161, 278, textureX, textureY); // Box 514
		bodyModel[373] = new ModelRendererTurbo(this, 177, 278, textureX, textureY); // Box 515
		bodyModel[374] = new ModelRendererTurbo(this, 193, 278, textureX, textureY); // Box 516
		bodyModel[375] = new ModelRendererTurbo(this, 209, 278, textureX, textureY); // Box 517
		bodyModel[376] = new ModelRendererTurbo(this, 233, 278, textureX, textureY); // Box 518
		bodyModel[377] = new ModelRendererTurbo(this, 249, 278, textureX, textureY); // Box 601
		bodyModel[378] = new ModelRendererTurbo(this, 265, 278, textureX, textureY); // Box 602
		bodyModel[379] = new ModelRendererTurbo(this, 1017, 270, textureX, textureY); // Box 603
		bodyModel[380] = new ModelRendererTurbo(this, 281, 278, textureX, textureY); // Box 604
		bodyModel[381] = new ModelRendererTurbo(this, 289, 278, textureX, textureY); // Box 967
		bodyModel[382] = new ModelRendererTurbo(this, 329, 278, textureX, textureY); // Box 968
		bodyModel[383] = new ModelRendererTurbo(this, 345, 278, textureX, textureY); // Box 525
		bodyModel[384] = new ModelRendererTurbo(this, 385, 278, textureX, textureY); // Box 526
		bodyModel[385] = new ModelRendererTurbo(this, 401, 278, textureX, textureY); // Box 249
		bodyModel[386] = new ModelRendererTurbo(this, 425, 278, textureX, textureY); // Box 254
		bodyModel[387] = new ModelRendererTurbo(this, 449, 278, textureX, textureY); // Box 263
		bodyModel[388] = new ModelRendererTurbo(this, 465, 278, textureX, textureY); // Box 264
		bodyModel[389] = new ModelRendererTurbo(this, 473, 278, textureX, textureY); // Box 265
		bodyModel[390] = new ModelRendererTurbo(this, 337, 278, textureX, textureY); // Box 266
		bodyModel[391] = new ModelRendererTurbo(this, 793, 799, textureX, textureY); // Box 659
		bodyModel[392] = new ModelRendererTurbo(this, 857, 799, textureX, textureY); // Box 660
		bodyModel[393] = new ModelRendererTurbo(this, 241, 807, textureX, textureY); // Box 661

		bodyModel[0].addShapeBox(0F, 0F, 0F, 46, 20, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-30F, -39F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 7, 5, 0F, 0F, 0F, -4F, 0F, -3F, -1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 1
		bodyModel[1].setRotationPoint(-30F, -46F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		bodyModel[2].setRotationPoint(-27F, -43F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-24F, -41F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-21F, -41F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		bodyModel[5].setRotationPoint(-2F, -41F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bodyModel[6].setRotationPoint(12F, -41F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		bodyModel[7].setRotationPoint(-21F, -44F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 8
		bodyModel[8].setRotationPoint(-2F, -45F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 19, 5, 3, 0F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -2F); // Box 9
		bodyModel[9].setRotationPoint(-21F, -48F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 14, 5, 6, 0F, 0F, -1F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -3F, 0F, 0F, -5F); // Box 10
		bodyModel[10].setRotationPoint(-2F, -49F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-24F, -43F, -9F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 12
		bodyModel[12].setRotationPoint(12F, -45F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -3.9999F, -0.9999F, 0F); // Box 13
		bodyModel[13].setRotationPoint(12F, -46F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 21, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-49F, -39F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 19, 8, 9, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-49F, -47F, -9F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 29, 20, 18, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(16F, -39F, -9F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 29, 9, 9, 0F, 0F, -1F, -3F, 0F, -4F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 19
		bodyModel[17].setRotationPoint(16F, -46F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, -3F, 0F, -3.5F, -5F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 20
		bodyModel[18].setRotationPoint(12F, -49F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[19].setRotationPoint(-22F, -43F, -9F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[20].setRotationPoint(-22F, -46F, -9F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 27
		bodyModel[21].setRotationPoint(-22F, -50F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F); // Box 28
		bodyModel[22].setRotationPoint(-22F, -53F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[23].setRotationPoint(-22F, -53F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 8, 7, 3, 0F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, -2F); // Box 30
		bodyModel[24].setRotationPoint(-30F, -52F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 19, 5, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 37
		bodyModel[25].setRotationPoint(-49F, -20F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 29, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[26].setRotationPoint(-30F, -19F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[27].setRotationPoint(-1F, -19F, -9F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, -0.9999F); // Box 40
		bodyModel[28].setRotationPoint(12F, -19F, -9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 8, 18, 0F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -1F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 41
		bodyModel[29].setRotationPoint(10F, -19F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 7, 18, 0F, 0F, 0F, 0F, -6.9999F, 0F, 0F, -6.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, -1.9999F); // Box 42
		bodyModel[30].setRotationPoint(16F, -19F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 29, 11, 18, 0F, 0F, -6F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -6F, 0F, -7F, 0F, -2F, 0F, -9F, -4F, 0F, -9F, -4F, -7F, 0F, -2F); // Box 43
		bodyModel[31].setRotationPoint(16F, -25F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 7, 4, 14, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 46
		bodyModel[32].setRotationPoint(16F, -14F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 3, 14, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 47
		bodyModel[33].setRotationPoint(10F, -12F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 13, 8, 16, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -2F, -1F, -1F, -2F, -1F, -1F, -1F, 0F, -1F); // Box 48
		bodyModel[34].setRotationPoint(-1F, -18F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 49
		bodyModel[35].setRotationPoint(-6F, -16F, -8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 3, 16, 0F, 0F, -2F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F); // Box 50
		bodyModel[36].setRotationPoint(-16F, -16F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[37].setRotationPoint(-6F, -16F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F); // Box 52
		bodyModel[38].setRotationPoint(-16F, -15F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 8, 2, 14, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -1F, -2F); // Box 53
		bodyModel[39].setRotationPoint(-14F, -10F, -7F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 54
		bodyModel[40].setRotationPoint(-6F, -10F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 3, 14, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 55
		bodyModel[41].setRotationPoint(0F, -11F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 46, 20, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[42].setRotationPoint(-30F, -39F, 8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[43].setRotationPoint(12F, -41F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[44].setRotationPoint(12F, -45F, 3F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 19, 8, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[45].setRotationPoint(-49F, -47F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 29, 9, 9, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4F, -6F, 0F, -1F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F); // Box 75
		bodyModel[46].setRotationPoint(16F, -46F, 0F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 19, 5, 9, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -2F, -3F); // Box 93
		bodyModel[47].setRotationPoint(-49F, -20F, 0F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 29, 4, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -2F); // Box 94
		bodyModel[48].setRotationPoint(-30F, -19F, 0F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -1F); // Box 95
		bodyModel[49].setRotationPoint(-1F, -19F, 0F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 22, 11, 7, 0F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, -8.9999F, 0F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, -10.9999F, -1.9999F, 0F, 0F, -1.9999F); // Box 101
		bodyModel[50].setRotationPoint(23F, -23F, 0F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 5, 3, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -2F); // Box 108
		bodyModel[51].setRotationPoint(-16F, -15F, 5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 22, 11, 7, 0F, 0F, -8.9999F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, -8.9999F, 0F, 0F, 0F, -1.9999F, 0F, -10.9999F, -1.9999F, 0F, -8.9999F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[52].setRotationPoint(23F, -23F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, 0F, 0F, 0F, 0F, -3.5F, -2F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, -3F, 0F); // Box 118
		bodyModel[53].setRotationPoint(12F, -49F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -3.9999F, -0.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[54].setRotationPoint(12F, -46F, 0F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3.5F, -5F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 120
		bodyModel[55].setRotationPoint(12F, -49F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 4, 3, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, -2F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F); // Box 121
		bodyModel[56].setRotationPoint(12F, -49F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 7, 3, 0F, 0F, -6F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, 0F); // Box 136
		bodyModel[57].setRotationPoint(-30F, -52F, 1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 13, 6, 2, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F); // Box 137
		bodyModel[58].setRotationPoint(23F, -18F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 13, 6, 2, 0F, 0F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F); // Box 138
		bodyModel[59].setRotationPoint(23F, -18F, 3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 13, 2, 10, 0F, 0F, -1.9999F, 0F, 0F, 0F, -0.9999F, 0F, 0F, -0.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0.5F, -0.9999F, -1.9999F, 0.5F, -0.9999F, -1.9999F, 0F, 0F, 0F); // Box 139
		bodyModel[60].setRotationPoint(23F, -14F, -5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[61].setRotationPoint(31F, -18F, -3.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 695
		bodyModel[62].setRotationPoint(37F, -56F, -0.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 46, 10, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[63].setRotationPoint(-30F, -30F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 7, 5, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 286
		bodyModel[64].setRotationPoint(-30F, -46F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[65].setRotationPoint(-27F, -43F, 6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[66].setRotationPoint(-24F, -41F, 8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[67].setRotationPoint(-21F, -41F, 8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[68].setRotationPoint(-2F, -41F, 7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 19, 3, 2, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[69].setRotationPoint(-21F, -44F, 7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 292
		bodyModel[70].setRotationPoint(-2F, -45F, 5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 19, 5, 3, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F); // Box 293
		bodyModel[71].setRotationPoint(-21F, -48F, 6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 14, 5, 6, 0F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -1F, 0F, 0F, -5F, 0F, -1F, -3F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 294
		bodyModel[72].setRotationPoint(-2F, -49F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[73].setRotationPoint(-24F, -43F, 8F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[74].setRotationPoint(-22F, -43F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[75].setRotationPoint(-22F, -46F, 7F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[76].setRotationPoint(-22F, -50F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 299
		bodyModel[77].setRotationPoint(-22F, -53F, 2F);

		bodyModel[78].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[78].setRotationPoint(-18F, -34F, -5F);
		bodyModel[78].rotateAngleZ = -0.10471976F;

		bodyModel[79].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[79].setRotationPoint(-18F, -34F, -5F);
		bodyModel[79].rotateAngleZ = -0.10471976F;

		bodyModel[80].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[80].setRotationPoint(-18F, -34F, -5F);
		bodyModel[80].rotateAngleZ = -0.10471976F;

		bodyModel[81].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[81].setRotationPoint(-18F, -34F, 4F);
		bodyModel[81].rotateAngleZ = -0.10471976F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[82].setRotationPoint(-18F, -34F, -5F);
		bodyModel[82].rotateAngleZ = -0.10471976F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[83].setRotationPoint(-9F, -48F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[84].setRotationPoint(-7F, -52F, -3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[85].setRotationPoint(-10F, -47F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[86].setRotationPoint(-10.3F, -47.3F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[87].setRotationPoint(-10.3F, -47.3F, 1F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[88].setRotationPoint(-8F, -45F, -4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 15, 1, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[89].setRotationPoint(-8F, -45F, 3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[90].setRotationPoint(-15F, -33F, -6F);
		bodyModel[90].rotateAngleZ = 0.78539816F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[91].setRotationPoint(-15F, -33F, 5F);
		bodyModel[91].rotateAngleZ = 0.78539816F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[92].setRotationPoint(-7.5F, -51.5F, -1.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[93].setRotationPoint(-7.5F, -50.5F, -1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[94].setRotationPoint(-7.5F, -49.5F, -1.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 7, 5, 7, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 268
		bodyModel[95].setRotationPoint(-3F, -49F, -3.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[96].setRotationPoint(5F, -48F, -2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 922
		bodyModel[97].setRotationPoint(-2.5F, -49.3F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 923
		bodyModel[98].setRotationPoint(-2.5F, -49.3F, 1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 924
		bodyModel[99].setRotationPoint(-0.5F, -49.3F, -1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F); // Box 925
		bodyModel[100].setRotationPoint(1.5F, -49.3F, -1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 926
		bodyModel[101].setRotationPoint(-2.5F, -49.3F, -1F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 927
		bodyModel[102].setRotationPoint(-3F, -49F, -3.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 928
		bodyModel[103].setRotationPoint(-3F, -49.5F, -3.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 929
		bodyModel[104].setRotationPoint(3F, -49F, -3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 930
		bodyModel[105].setRotationPoint(2F, -48F, -3.3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 931
		bodyModel[106].setRotationPoint(0F, -48F, -3.3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 932
		bodyModel[107].setRotationPoint(-2F, -46F, -3.3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 933
		bodyModel[108].setRotationPoint(5F, -48F, -0.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.2F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 934
		bodyModel[109].setRotationPoint(4F, -48F, -0.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0.6F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 935
		bodyModel[110].setRotationPoint(10F, -48F, -0.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 936
		bodyModel[111].setRotationPoint(6.5F, -47F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F); // Box 937
		bodyModel[112].setRotationPoint(8.5F, -47F, -3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F); // Box 938
		bodyModel[113].setRotationPoint(5.5F, -47F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 939
		bodyModel[114].setRotationPoint(5.8F, -47F, -3.3F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 940
		bodyModel[115].setRotationPoint(-2.2F, -50.3F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 941
		bodyModel[116].setRotationPoint(2.2F, -50.3F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 942
		bodyModel[117].setRotationPoint(0F, -50.3F, -0.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 943
		bodyModel[118].setRotationPoint(0F, -50.3F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 945
		bodyModel[119].setRotationPoint(0F, -50.3F, 0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 947
		bodyModel[120].setRotationPoint(0F, -50.6F, -0.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 948
		bodyModel[121].setRotationPoint(-3F, -49.8F, 0.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 949
		bodyModel[122].setRotationPoint(-2.2F, -50.6F, -0.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 950
		bodyModel[123].setRotationPoint(-2.2F, -50.3F, -0.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 951
		bodyModel[124].setRotationPoint(-2.2F, -50.3F, 0.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1.4F, -0.3F, -0.4F, 0.4F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, 0.4F, -0.3F); // Box 952
		bodyModel[125].setRotationPoint(-4F, -49.8F, 0.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 953
		bodyModel[126].setRotationPoint(-4.3F, -48.4F, 0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 954
		bodyModel[127].setRotationPoint(2.2F, -50.6F, -1.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 955
		bodyModel[128].setRotationPoint(2.2F, -50.3F, -0.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 956
		bodyModel[129].setRotationPoint(2.2F, -50.3F, -1.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, -0.6F, 0.3F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F); // Box 957
		bodyModel[130].setRotationPoint(2.2F, -50.3F, -3.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 958
		bodyModel[131].setRotationPoint(2.2F, -49.3F, -4.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 959
		bodyModel[132].setRotationPoint(-4F, -44.8F, -4.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 16, 15, 8, 0F, 0F, 0F, -1F, 1F, 0F, -3F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[133].setRotationPoint(-4F, -44.25F, -8F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 16, 15, 8, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[134].setRotationPoint(-4F, -44.25F, 0F);

		bodyModel[135].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[135].setRotationPoint(-29F, -31F, -6F);
		bodyModel[135].rotateAngleZ = 0.15707963F;

		bodyModel[136].addShapeBox(0F, -3F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[136].setRotationPoint(-29F, -31F, 4F);
		bodyModel[136].rotateAngleZ = 0.15707963F;

		bodyModel[137].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 262
		bodyModel[137].setRotationPoint(-30F, -37F, -8F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 6, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[138].setRotationPoint(-25F, -42F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 5, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[139].setRotationPoint(-30F, -38F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[140].setRotationPoint(-25F, -44F, -8F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[141].setRotationPoint(-25F, -45F, -7F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 213
		bodyModel[142].setRotationPoint(-24.8F, -42.3F, -4F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[143].setRotationPoint(-24.8F, -43.3F, -4F);

		bodyModel[144].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 233
		bodyModel[144].setRotationPoint(-24.7F, -41.1F, 2.7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 234
		bodyModel[145].setRotationPoint(-24.6F, -42.1F, -0.9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 235
		bodyModel[146].setRotationPoint(-24.6F, -42.1F, -0.9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 236
		bodyModel[147].setRotationPoint(-24.6F, -42.1F, -0.9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 237
		bodyModel[148].setRotationPoint(-24.6F, -41.1F, -0.9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 238
		bodyModel[149].setRotationPoint(-24.6F, -41.1F, -0.9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 239
		bodyModel[150].setRotationPoint(-24.6F, -41.1F, 0.1F);

		bodyModel[151].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 240
		bodyModel[151].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[151].rotateAngleX = 5.49778714F;

		bodyModel[152].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 241
		bodyModel[152].setRotationPoint(-24.7F, -41.1F, 0.1F);

		bodyModel[153].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F); // Box 242
		bodyModel[153].setRotationPoint(-24.7F, -41.1F, 0.1F);

		bodyModel[154].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 243
		bodyModel[154].setRotationPoint(-24.6F, -41.1F, 0.1F);

		bodyModel[155].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 244
		bodyModel[155].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[155].rotateAngleX = 3.14159265F;

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 248
		bodyModel[156].setRotationPoint(-24.6F, -42.1F, 0.1F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 249
		bodyModel[157].setRotationPoint(-24.6F, -42.1F, 0.1F);

		bodyModel[158].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 250
		bodyModel[158].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[158].rotateAngleX = 4.71238898F;

		bodyModel[159].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 251
		bodyModel[159].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[159].rotateAngleX = 3.92699082F;

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 252
		bodyModel[160].setRotationPoint(-24.6F, -42.1F, 1.7F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 253
		bodyModel[161].setRotationPoint(-24.6F, -42.1F, 1.7F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 254
		bodyModel[162].setRotationPoint(-24.6F, -42.1F, 1.7F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 255
		bodyModel[163].setRotationPoint(-24.6F, -42.1F, 2.7F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 256
		bodyModel[164].setRotationPoint(-24.6F, -42.1F, 2.7F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 257
		bodyModel[165].setRotationPoint(-24.6F, -41.1F, 2.7F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 258
		bodyModel[166].setRotationPoint(-24.6F, -41.1F, 1.7F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 259
		bodyModel[167].setRotationPoint(-24.6F, -41.1F, 1.7F);

		bodyModel[168].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 260
		bodyModel[168].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[168].rotateAngleX = 3.92699082F;

		bodyModel[169].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 261
		bodyModel[169].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[169].rotateAngleX = 4.71238898F;

		bodyModel[170].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 262
		bodyModel[170].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[170].rotateAngleX = 5.49778714F;

		bodyModel[171].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 263
		bodyModel[171].setRotationPoint(-24.7F, -41.1F, 2.7F);

		bodyModel[172].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 265
		bodyModel[172].setRotationPoint(-24.6F, -41.1F, 2.7F);

		bodyModel[173].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 266
		bodyModel[173].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[173].rotateAngleX = 0.78539816F;

		bodyModel[174].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 267
		bodyModel[174].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[174].rotateAngleX = 1.57079633F;

		bodyModel[175].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 268
		bodyModel[175].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[175].rotateAngleX = 2.35619449F;

		bodyModel[176].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 269
		bodyModel[176].setRotationPoint(-24.7F, -41.1F, 2.7F);
		bodyModel[176].rotateAngleX = 3.14159265F;

		bodyModel[177].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F, 0F, -0.45F, 0.3F); // Box 270
		bodyModel[177].setRotationPoint(-24.7F, -41.1F, 0.1F);
		bodyModel[177].rotateAngleX = -0.38397244F;

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 271
		bodyModel[178].setRotationPoint(-24.7F, -41.9F, -0.9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F); // Box 272
		bodyModel[179].setRotationPoint(-24.7F, -41.7F, -0.9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 273
		bodyModel[180].setRotationPoint(-24.6F, -38.5F, -3.7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 274
		bodyModel[181].setRotationPoint(-24.6F, -38.5F, -3.7F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 275
		bodyModel[182].setRotationPoint(-24.6F, -39.5F, -3.7F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 276
		bodyModel[183].setRotationPoint(-24.6F, -39.5F, -3.7F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 277
		bodyModel[184].setRotationPoint(-24.6F, -39.5F, -3.7F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 278
		bodyModel[185].setRotationPoint(-24.6F, -39.5F, -2.7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 279
		bodyModel[186].setRotationPoint(-24.6F, -39.5F, -2.7F);

		bodyModel[187].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 280
		bodyModel[187].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[187].rotateAngleX = 0.78539816F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 281
		bodyModel[188].setRotationPoint(-24.6F, -38.5F, -2.7F);

		bodyModel[189].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 282
		bodyModel[189].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[189].rotateAngleX = 5.49778714F;

		bodyModel[190].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 283
		bodyModel[190].setRotationPoint(-24.7F, -38.5F, -2.7F);

		bodyModel[191].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 284
		bodyModel[191].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[191].rotateAngleX = 1.57079633F;

		bodyModel[192].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 285
		bodyModel[192].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[192].rotateAngleX = 2.35619449F;

		bodyModel[193].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 286
		bodyModel[193].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[193].rotateAngleX = 3.14159265F;

		bodyModel[194].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 287
		bodyModel[194].setRotationPoint(-24.6F, -38.5F, -2.7F);

		bodyModel[195].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 288
		bodyModel[195].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[195].rotateAngleX = -3.90953752F;

		bodyModel[196].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 289
		bodyModel[196].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[196].rotateAngleX = 4.71238898F;

		bodyModel[197].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 290
		bodyModel[197].setRotationPoint(-24.7F, -38.5F, -2.7F);
		bodyModel[197].rotateAngleX = 3.92699082F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 318
		bodyModel[198].setRotationPoint(-24.8F, -41.1F, 4.8F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 319
		bodyModel[199].setRotationPoint(-24.8F, -41.1F, 4.8F);

		bodyModel[200].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 320
		bodyModel[200].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[200].rotateAngleX = 3.92699082F;

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 321
		bodyModel[201].setRotationPoint(-24.8F, -42.1F, 4.8F);

		bodyModel[202].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 322
		bodyModel[202].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[202].rotateAngleX = 3.14159265F;

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 323
		bodyModel[203].setRotationPoint(-24.8F, -42.1F, 4.8F);

		bodyModel[204].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 324
		bodyModel[204].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[204].rotateAngleX = 2.35619449F;

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 325
		bodyModel[205].setRotationPoint(-24.8F, -42.1F, 4.8F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 326
		bodyModel[206].setRotationPoint(-24.8F, -42.1F, 5.8F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 327
		bodyModel[207].setRotationPoint(-24.8F, -42.1F, 5.8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 328
		bodyModel[208].setRotationPoint(-24.8F, -41.1F, 5.8F);

		bodyModel[209].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 329
		bodyModel[209].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[209].rotateAngleX = 5.49778714F;

		bodyModel[210].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 330
		bodyModel[210].setRotationPoint(-24.9F, -41.1F, 5.8F);

		bodyModel[211].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 331
		bodyModel[211].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[211].rotateAngleX = 0.78539816F;

		bodyModel[212].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 332
		bodyModel[212].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[212].rotateAngleX = 1.57079633F;

		bodyModel[213].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 333
		bodyModel[213].setRotationPoint(-24.9F, -41.1F, 5.8F);
		bodyModel[213].rotateAngleX = -3.90953752F;

		bodyModel[214].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 334
		bodyModel[214].setRotationPoint(-24.8F, -41.1F, 5.8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 340
		bodyModel[215].setRotationPoint(-24.8F, -44.6F, 4.4F);

		bodyModel[216].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 341
		bodyModel[216].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[216].rotateAngleX = -1.57079633F;

		bodyModel[217].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 342
		bodyModel[217].setRotationPoint(-24.8F, -43.6F, 4.4F);

		bodyModel[218].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 343
		bodyModel[218].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[218].rotateAngleX = 5.49778714F;

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 344
		bodyModel[219].setRotationPoint(-24.8F, -43.6F, 4.4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 345
		bodyModel[220].setRotationPoint(-24.8F, -43.6F, 3.4F);

		bodyModel[221].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 346
		bodyModel[221].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[221].rotateAngleX = 4.71238898F;

		bodyModel[222].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 347
		bodyModel[222].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[222].rotateAngleX = 3.92699082F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 348
		bodyModel[223].setRotationPoint(-24.8F, -43.6F, 3.4F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 349
		bodyModel[224].setRotationPoint(-24.8F, -44.6F, 3.4F);

		bodyModel[225].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 350
		bodyModel[225].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[225].rotateAngleX = 3.14159265F;

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 351
		bodyModel[226].setRotationPoint(-24.8F, -44.6F, 3.4F);

		bodyModel[227].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 352
		bodyModel[227].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[227].rotateAngleX = 2.35619449F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 353
		bodyModel[228].setRotationPoint(-24.8F, -44.6F, 3.4F);

		bodyModel[229].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 354
		bodyModel[229].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[229].rotateAngleX = 1.57079633F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 355
		bodyModel[230].setRotationPoint(-24.8F, -44.6F, 4.4F);

		bodyModel[231].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 356
		bodyModel[231].setRotationPoint(-24.9F, -43.6F, 4.4F);
		bodyModel[231].rotateAngleX = 0.78539816F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 387
		bodyModel[232].setRotationPoint(-24.8F, -41.6F, -6.3F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 388
		bodyModel[233].setRotationPoint(-24.8F, -41.6F, -7.3F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 390
		bodyModel[234].setRotationPoint(-24.8F, -41.6F, -6.3F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 391
		bodyModel[235].setRotationPoint(-24.8F, -41.6F, -7.3F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[236].setRotationPoint(-24.8F, -40.6F, -7.3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 393
		bodyModel[237].setRotationPoint(-24.8F, -40.6F, -7.3F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 394
		bodyModel[238].setRotationPoint(-24.8F, -40.6F, -6.3F);

		bodyModel[239].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 395
		bodyModel[239].setRotationPoint(-24.8F, -41.2F, -6.3F);

		bodyModel[240].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 396
		bodyModel[240].setRotationPoint(-24.9F, -41.2F, -6.3F);
		bodyModel[240].rotateAngleX = -1.29154365F;

		bodyModel[241].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 397
		bodyModel[241].setRotationPoint(-24.9F, -40.6F, -6.3F);
		bodyModel[241].rotateAngleX = 3.14159265F;

		bodyModel[242].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 398
		bodyModel[242].setRotationPoint(-24.9F, -40.6F, -6.3F);
		bodyModel[242].rotateAngleX = 3.92699082F;

		bodyModel[243].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 399
		bodyModel[243].setRotationPoint(-24.9F, -40.6F, -6.3F);
		bodyModel[243].rotateAngleX = 5.49778714F;

		bodyModel[244].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 400
		bodyModel[244].setRotationPoint(-24.9F, -40.6F, -6.3F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F); // Box 401
		bodyModel[245].setRotationPoint(-24.7F, -41.8F, -7.3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 402
		bodyModel[246].setRotationPoint(-24.6F, -42.1F, -3.7F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 403
		bodyModel[247].setRotationPoint(-24.6F, -42.1F, -3.7F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 404
		bodyModel[248].setRotationPoint(-24.6F, -42.1F, -3.7F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 405
		bodyModel[249].setRotationPoint(-24.6F, -42.1F, -2.7F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 406
		bodyModel[250].setRotationPoint(-24.6F, -42.1F, -2.7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 407
		bodyModel[251].setRotationPoint(-24.6F, -41.1F, -2.7F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 408
		bodyModel[252].setRotationPoint(-24.6F, -41.1F, -3.7F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 409
		bodyModel[253].setRotationPoint(-24.6F, -41.1F, -3.7F);

		bodyModel[254].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 410
		bodyModel[254].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[254].rotateAngleX = 3.92699082F;

		bodyModel[255].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 411
		bodyModel[255].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[255].rotateAngleX = 3.14159265F;

		bodyModel[256].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 412
		bodyModel[256].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[256].rotateAngleX = 2.35619449F;

		bodyModel[257].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 413
		bodyModel[257].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[257].rotateAngleX = 1.57079633F;

		bodyModel[258].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 414
		bodyModel[258].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[258].rotateAngleX = 0.78539816F;

		bodyModel[259].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 415
		bodyModel[259].setRotationPoint(-24.7F, -41.1F, -2.7F);

		bodyModel[260].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 416
		bodyModel[260].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[260].rotateAngleX = 5.49778714F;

		bodyModel[261].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 417
		bodyModel[261].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[261].rotateAngleX = 4.71238898F;

		bodyModel[262].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 418
		bodyModel[262].setRotationPoint(-24.6F, -41.1F, -2.7F);

		bodyModel[263].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 419
		bodyModel[263].setRotationPoint(-24.7F, -41.1F, -2.7F);
		bodyModel[263].rotateAngleX = -1.57079633F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 421
		bodyModel[264].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 422
		bodyModel[265].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 423
		bodyModel[266].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 424
		bodyModel[267].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 425
		bodyModel[268].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 426
		bodyModel[269].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 427
		bodyModel[270].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 428
		bodyModel[271].setRotationPoint(-24.6F, -39.1F, -1.1F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 429
		bodyModel[272].setRotationPoint(-24.8F, -44.6F, -4.4F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 430
		bodyModel[273].setRotationPoint(-24.8F, -44.6F, -4.4F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 431
		bodyModel[274].setRotationPoint(-24.8F, -44.6F, -5.4F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 432
		bodyModel[275].setRotationPoint(-24.8F, -44.6F, -5.4F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 433
		bodyModel[276].setRotationPoint(-24.8F, -44.6F, -5.4F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 434
		bodyModel[277].setRotationPoint(-24.8F, -43.6F, -5.4F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 435
		bodyModel[278].setRotationPoint(-24.8F, -43.6F, -5.4F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 436
		bodyModel[279].setRotationPoint(-24.8F, -43.6F, -4.4F);

		bodyModel[280].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 437
		bodyModel[280].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[280].rotateAngleX = 5.49778714F;

		bodyModel[281].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 438
		bodyModel[281].setRotationPoint(-24.9F, -43.6F, -4.4F);

		bodyModel[282].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 439
		bodyModel[282].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[282].rotateAngleX = 0.78539816F;

		bodyModel[283].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 440
		bodyModel[283].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[283].rotateAngleX = 1.57079633F;

		bodyModel[284].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 441
		bodyModel[284].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[284].rotateAngleX = 2.35619449F;

		bodyModel[285].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 442
		bodyModel[285].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[285].rotateAngleX = 3.14159265F;

		bodyModel[286].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 443
		bodyModel[286].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[286].rotateAngleX = 3.92699082F;

		bodyModel[287].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 444
		bodyModel[287].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[287].rotateAngleX = 4.71238898F;

		bodyModel[288].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 445
		bodyModel[288].setRotationPoint(-24.8F, -43.6F, -4.4F);

		bodyModel[289].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 446
		bodyModel[289].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[289].rotateAngleX = -4.36332313F;

		bodyModel[290].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 447
		bodyModel[290].setRotationPoint(-24.9F, -43.6F, -4.4F);
		bodyModel[290].rotateAngleX = -1.32645023F;

		bodyModel[291].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 448
		bodyModel[291].setRotationPoint(-24.8F, -38.5F, 3.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 449
		bodyModel[292].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 450
		bodyModel[293].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 451
		bodyModel[294].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 452
		bodyModel[295].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 453
		bodyModel[296].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 454
		bodyModel[297].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 455
		bodyModel[298].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 456
		bodyModel[299].setRotationPoint(-24.8F, -39F, 3F);

		bodyModel[300].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 457
		bodyModel[300].setRotationPoint(-24.9F, -38.5F, 3.5F);
		bodyModel[300].rotateAngleX = -1.57079633F;

		bodyModel[301].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 458
		bodyModel[301].setRotationPoint(-24.7F, -38.6F, 1.5F);
		bodyModel[301].rotateAngleX = -1.57079633F;

		bodyModel[302].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 459
		bodyModel[302].setRotationPoint(-24.6F, -38.6F, 1.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 460
		bodyModel[303].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 461
		bodyModel[304].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 462
		bodyModel[305].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 463
		bodyModel[306].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 464
		bodyModel[307].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 465
		bodyModel[308].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 466
		bodyModel[309].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 467
		bodyModel[310].setRotationPoint(-24.6F, -39.1F, 1F);

		bodyModel[311].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[311].setRotationPoint(-24.9F, -44F, 2F);
		bodyModel[311].rotateAngleX = 1.57079633F;

		bodyModel[312].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[312].setRotationPoint(-24.8F, -44F, 2F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 470
		bodyModel[313].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 471
		bodyModel[314].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 472
		bodyModel[315].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 473
		bodyModel[316].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 474
		bodyModel[317].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 475
		bodyModel[318].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 476
		bodyModel[319].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 477
		bodyModel[320].setRotationPoint(-24.8F, -44.5F, 1.5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 478
		bodyModel[321].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 480
		bodyModel[322].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 481
		bodyModel[323].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[324].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 483
		bodyModel[325].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 484
		bodyModel[326].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 485
		bodyModel[327].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[328].setRotationPoint(-24.8F, -39F, -6.5F);

		bodyModel[329].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, 0F, 0F, -0.48F, 0F); // Box 487
		bodyModel[329].setRotationPoint(-24.9F, -38.5F, -6.6F);
		bodyModel[329].rotateAngleX = -0.38397244F;

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 488
		bodyModel[330].setRotationPoint(-24.8F, -36.3F, -1.6F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 489
		bodyModel[331].setRotationPoint(-24.8F, -36.3F, 0.4F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F); // Box 460
		bodyModel[332].setRotationPoint(-24.8F, -39.5F, 4.8F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 461
		bodyModel[333].setRotationPoint(-24.8F, -39.5F, 5.8F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 462
		bodyModel[334].setRotationPoint(-24.8F, -38.5F, 5.8F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 463
		bodyModel[335].setRotationPoint(-24.8F, -38.5F, 4.8F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 464
		bodyModel[336].setRotationPoint(-24.8F, -38.5F, 4.8F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 465
		bodyModel[337].setRotationPoint(-24.8F, -39.5F, 4.8F);

		bodyModel[338].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 466
		bodyModel[338].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[338].rotateAngleX = 3.14159265F;

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F); // Box 467
		bodyModel[339].setRotationPoint(-24.8F, -39.5F, 4.8F);

		bodyModel[340].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F); // Box 468
		bodyModel[340].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[340].rotateAngleX = -3.90953752F;

		bodyModel[341].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 469
		bodyModel[341].setRotationPoint(-24.8F, -38.5F, 5.8F);

		bodyModel[342].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 470
		bodyModel[342].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[342].rotateAngleX = 3.92699082F;

		bodyModel[343].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 471
		bodyModel[343].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[343].rotateAngleX = 5.49778714F;

		bodyModel[344].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 472
		bodyModel[344].setRotationPoint(-24.9F, -38.5F, 5.8F);

		bodyModel[345].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 473
		bodyModel[345].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[345].rotateAngleX = 0.78539816F;

		bodyModel[346].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F); // Box 474
		bodyModel[346].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[346].rotateAngleX = 1.57079633F;

		bodyModel[347].addShapeBox(0F, -0.05F, 0.2F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.4F, 0F, -0.9F, -0.3F, 0F, -0.9F, -0.3F); // Box 475
		bodyModel[347].setRotationPoint(-24.9F, -38.5F, 5.8F);
		bodyModel[347].rotateAngleX = 2.35619449F;

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 476
		bodyModel[348].setRotationPoint(-24.8F, -39.5F, 5.8F);

		bodyModel[349].addShapeBox(0F, -0.5F, -0.2F, 1, 1, 1, 0F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.48F, -0.3F, 0F, -0.45F, -0.3F, 0F, -0.45F, -0.3F); // Box 477
		bodyModel[349].setRotationPoint(-24.9F, -43.5F, -2F);
		bodyModel[349].rotateAngleX = 1.57079633F;

		bodyModel[350].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 478
		bodyModel[350].setRotationPoint(-24.8F, -44F, -2F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 479
		bodyModel[351].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 480
		bodyModel[352].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 481
		bodyModel[353].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F); // Box 482
		bodyModel[354].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 483
		bodyModel[355].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F); // Box 484
		bodyModel[356].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 485
		bodyModel[357].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 486
		bodyModel[358].setRotationPoint(-24.8F, -44.5F, -2.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 487
		bodyModel[359].setRotationPoint(-24.8F, -39.8F, -4F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 462
		bodyModel[360].setRotationPoint(-30F, -46F, -4F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, -2F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 463
		bodyModel[361].setRotationPoint(-27F, -46F, -7F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 465
		bodyModel[362].setRotationPoint(-24.5F, -46.5F, -1F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 466
		bodyModel[363].setRotationPoint(-24.5F, -47F, -1F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 467
		bodyModel[364].setRotationPoint(-23F, -47.25F, -1F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 468
		bodyModel[365].setRotationPoint(-23F, -46.25F, -1F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.6F, -0.25F, 0F); // Box 469
		bodyModel[366].setRotationPoint(-23.1F, -45.75F, -1F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.7F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 470
		bodyModel[367].setRotationPoint(-24.5F, -48F, -1F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.7F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, 0F, -0.7F, -0.3F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 471
		bodyModel[368].setRotationPoint(-24.5F, -48F, 0F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.1F); // Box 472
		bodyModel[369].setRotationPoint(-22.7F, -47F, -1F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[370].setRotationPoint(-30F, -46F, -7F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1.5F); // Box 513
		bodyModel[371].setRotationPoint(-28F, -44F, -8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 514
		bodyModel[372].setRotationPoint(-27F, -42F, -8F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 2F, 0F, 0F, 2F, 0F); // Box 515
		bodyModel[373].setRotationPoint(-27F, -46F, 4F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 516
		bodyModel[374].setRotationPoint(-30F, -46F, 4F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 517
		bodyModel[375].setRotationPoint(-28F, -44F, 6F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		bodyModel[376].setRotationPoint(-27F, -42F, 7F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 601
		bodyModel[377].setRotationPoint(-20F, -42.3F, -8F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 602
		bodyModel[378].setRotationPoint(-19.5F, -40.3F, -8.5F);

		bodyModel[379].addShapeBox(-1F, -2F, 0F, 1, 2, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[379].setRotationPoint(-18.5F, -40.3F, -7.7F);
		bodyModel[379].rotateAngleZ = 0.36651914F;

		bodyModel[380].addShapeBox(-1F, -2F, 0F, 1, 1, 1, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[380].setRotationPoint(-18.5F, -40.3F, -7.2F);
		bodyModel[380].rotateAngleZ = 0.36651914F;

		bodyModel[381].addShapeBox(0F, 0F, 0F, 15, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 967
		bodyModel[381].setRotationPoint(-18.5F, -37.3F, -8.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 968
		bodyModel[382].setRotationPoint(-19.5F, -37.3F, -8.5F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 15, 8, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[383].setRotationPoint(-18.5F, -37.3F, 5.5F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[384].setRotationPoint(-19.5F, -37.3F, 5.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[385].setRotationPoint(-24F, -32F, -2F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[386].setRotationPoint(-24F, -33F, -1.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 263
		bodyModel[387].setRotationPoint(-22.5F, -36F, -1F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 264
		bodyModel[388].setRotationPoint(-22F, -40F, -0.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 265
		bodyModel[389].setRotationPoint(-22F, -42F, -0.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 266
		bodyModel[390].setRotationPoint(-21.7F, -42.1F, -0.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 659
		bodyModel[391].setRotationPoint(-21F, -55F, -2F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 9, 0, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		bodyModel[392].setRotationPoint(-12F, -55F, -2F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 15, 6, 4, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 661
		bodyModel[393].setRotationPoint(-3F, -55F, -2F);


		noseModel = new ModelRendererTurbo[56];
		noseModel[0] = new ModelRendererTurbo(this, 1, 922, textureX, textureY); // Box 16
		noseModel[1] = new ModelRendererTurbo(this, 73, 922, textureX, textureY); // Box 17
		noseModel[2] = new ModelRendererTurbo(this, 129, 922, textureX, textureY); // Box 21
		noseModel[3] = new ModelRendererTurbo(this, 177, 922, textureX, textureY); // Box 22
		noseModel[4] = new ModelRendererTurbo(this, 191, 985, textureX, textureY); // Box 31
		noseModel[5] = new ModelRendererTurbo(this, 160, 985, textureX, textureY); // Box 32
		noseModel[6] = new ModelRendererTurbo(this, 222, 985, textureX, textureY); // Box 33
		noseModel[7] = new ModelRendererTurbo(this, 252, 985, textureX, textureY); // Box 34
		noseModel[8] = new ModelRendererTurbo(this, 233, 922, textureX, textureY); // Box 35
		noseModel[9] = new ModelRendererTurbo(this, 289, 922, textureX, textureY); // Box 36
		noseModel[10] = new ModelRendererTurbo(this, 1, 962, textureX, textureY); // Box 77
		noseModel[11] = new ModelRendererTurbo(this, 49, 962, textureX, textureY); // Box 78
		noseModel[12] = new ModelRendererTurbo(this, 191, 1005, textureX, textureY); // Box 87
		noseModel[13] = new ModelRendererTurbo(this, 160, 1005, textureX, textureY); // Box 88
		noseModel[14] = new ModelRendererTurbo(this, 222, 1005, textureX, textureY); // Box 89
		noseModel[15] = new ModelRendererTurbo(this, 252, 1005, textureX, textureY); // Box 90
		noseModel[16] = new ModelRendererTurbo(this, 105, 962, textureX, textureY); // Box 91
		noseModel[17] = new ModelRendererTurbo(this, 161, 962, textureX, textureY); // Box 92
		noseModel[18] = new ModelRendererTurbo(this, 88, 986, textureX, textureY); // Box 122
		noseModel[19] = new ModelRendererTurbo(this, 34, 986, textureX, textureY); // Box 123
		noseModel[20] = new ModelRendererTurbo(this, 124, 986, textureX, textureY); // Box 124
		noseModel[21] = new ModelRendererTurbo(this, 61, 986, textureX, textureY); // Box 125
		noseModel[22] = new ModelRendererTurbo(this, 0, 986, textureX, textureY); // Box 126
		noseModel[23] = new ModelRendererTurbo(this, 16, 986, textureX, textureY); // Box 127
		noseModel[24] = new ModelRendererTurbo(this, 88, 1005, textureX, textureY); // Box 128
		noseModel[25] = new ModelRendererTurbo(this, 34, 1005, textureX, textureY); // Box 129
		noseModel[26] = new ModelRendererTurbo(this, 124, 1005, textureX, textureY); // Box 130
		noseModel[27] = new ModelRendererTurbo(this, 61, 1005, textureX, textureY); // Box 131
		noseModel[28] = new ModelRendererTurbo(this, 0, 1005, textureX, textureY); // Box 132
		noseModel[29] = new ModelRendererTurbo(this, 16, 1005, textureX, textureY); // Box 133
		noseModel[30] = new ModelRendererTurbo(this, 49, 922, textureX, textureY); // Import CO_51
		noseModel[31] = new ModelRendererTurbo(this, 329, 922, textureX, textureY); // Import CO_52
		noseModel[32] = new ModelRendererTurbo(this, 1, 922, textureX, textureY); // Import CO_53
		noseModel[33] = new ModelRendererTurbo(this, 361, 922, textureX, textureY); // Import CO_54
		noseModel[34] = new ModelRendererTurbo(this, 73, 922, textureX, textureY); // Import CO_55
		noseModel[35] = new ModelRendererTurbo(this, 393, 922, textureX, textureY); // Import CO_56
		noseModel[36] = new ModelRendererTurbo(this, 417, 922, textureX, textureY); // Import CO_57
		noseModel[37] = new ModelRendererTurbo(this, 441, 922, textureX, textureY); // Import CO_58
		noseModel[38] = new ModelRendererTurbo(this, 169, 922, textureX, textureY); // Import CO_59
		noseModel[39] = new ModelRendererTurbo(this, 225, 922, textureX, textureY); // Import CO_60
		noseModel[40] = new ModelRendererTurbo(this, 281, 922, textureX, textureY); // Import CO_61
		noseModel[41] = new ModelRendererTurbo(this, 473, 922, textureX, textureY); // Import CO_62
		noseModel[42] = new ModelRendererTurbo(this, 129, 922, textureX, textureY); // Import CO_63
		noseModel[43] = new ModelRendererTurbo(this, 201, 962, textureX, textureY); // Box 231
		noseModel[44] = new ModelRendererTurbo(this, 225, 962, textureX, textureY); // Box 232
		noseModel[45] = new ModelRendererTurbo(this, 41, 962, textureX, textureY); // Box 233
		noseModel[46] = new ModelRendererTurbo(this, 257, 962, textureX, textureY); // Box 234
		noseModel[47] = new ModelRendererTurbo(this, 1, 962, textureX, textureY); // Box 235
		noseModel[48] = new ModelRendererTurbo(this, 289, 962, textureX, textureY); // Box 236
		noseModel[49] = new ModelRendererTurbo(this, 313, 962, textureX, textureY); // Box 237
		noseModel[50] = new ModelRendererTurbo(this, 337, 962, textureX, textureY); // Box 238
		noseModel[51] = new ModelRendererTurbo(this, 97, 962, textureX, textureY); // Box 239
		noseModel[52] = new ModelRendererTurbo(this, 153, 962, textureX, textureY); // Box 240
		noseModel[53] = new ModelRendererTurbo(this, 369, 962, textureX, textureY); // Box 241
		noseModel[54] = new ModelRendererTurbo(this, 385, 962, textureX, textureY); // Box 242
		noseModel[55] = new ModelRendererTurbo(this, 401, 962, textureX, textureY); // Box 243

		noseModel[0].addShapeBox(0F, 0F, 0F, 14, 19, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 16
		noseModel[0].setRotationPoint(-63F, -39F, -9F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 16, 15, 18, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -1F); // Box 17
		noseModel[1].setRotationPoint(-79F, -39F, -9F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F, 0F, -2F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		noseModel[2].setRotationPoint(-63F, -47F, -9F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 16, 8, 9, 0F, 0F, -2F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 22
		noseModel[3].setRotationPoint(-79F, -46F, -9F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F); // Box 31
		noseModel[4].setRotationPoint(-85F, -38F, -8F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F, 0F, -3F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 32
		noseModel[5].setRotationPoint(-85F, -45F, -8F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -3F, 0F, -3F, -4F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, -3F, -1F); // Box 33
		noseModel[6].setRotationPoint(-85F, -29F, -8F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -4F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 34
		noseModel[7].setRotationPoint(-85F, -27F, -5F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 16, 12, 9, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -5F, 0F); // Box 35
		noseModel[8].setRotationPoint(-79F, -29F, -9F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 36
		noseModel[9].setRotationPoint(-63F, -24F, -9F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		noseModel[10].setRotationPoint(-63F, -47F, 0F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 16, 8, 9, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 78
		noseModel[11].setRotationPoint(-79F, -46F, 0F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 87
		noseModel[12].setRotationPoint(-85F, -38F, 0F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 6, 10, 8, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 88
		noseModel[13].setRotationPoint(-85F, -45F, 0F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F, 0F, -1F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -3F, -4F); // Box 89
		noseModel[14].setRotationPoint(-85F, -29F, 2F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, -1F); // Box 90
		noseModel[15].setRotationPoint(-85F, -27F, 0F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 16, 12, 9, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -6F, -4F); // Box 91
		noseModel[16].setRotationPoint(-79F, -29F, 0F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 14, 8, 9, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -3F, -3F); // Box 92
		noseModel[17].setRotationPoint(-63F, -24F, 0F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F, 0F, -4F, -4F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		noseModel[18].setRotationPoint(-91F, -44F, -8F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		noseModel[19].setRotationPoint(-96F, -42F, -6F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 124
		noseModel[20].setRotationPoint(-91F, -35F, -8F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 125
		noseModel[21].setRotationPoint(-96F, -35F, -6F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, -3.9999F, -2.9999F, 0F, -0.9999F, -0.9999F, 0F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		noseModel[22].setRotationPoint(-98F, -39F, -3F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, -2.9999F, 0F, 0F, -0.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F); // Box 127
		noseModel[23].setRotationPoint(-98F, -35F, -3F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 128
		noseModel[24].setRotationPoint(-91F, -44F, 0F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 5, 7, 6, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 129
		noseModel[25].setRotationPoint(-96F, -42F, 0F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 6, 9, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -4F, -4F); // Box 130
		noseModel[26].setRotationPoint(-91F, -35F, 0F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -3F, -4F); // Box 131
		noseModel[27].setRotationPoint(-96F, -35F, 0F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, 0F, -0.9999F, -0.9999F, 0F, -3.9999F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F); // Box 132
		noseModel[28].setRotationPoint(-98F, -39F, 0F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9999F, 0F, -2.9999F, -2.9999F); // Box 133
		noseModel[29].setRotationPoint(-98F, -35F, 0F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, -1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_51
		noseModel[30].setRotationPoint(-79F, -37.5F, -10F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_52
		noseModel[31].setRotationPoint(-70F, -37.5F, -10F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_53
		noseModel[32].setRotationPoint(-61.5F, -36.5F, -11F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_54
		noseModel[33].setRotationPoint(-70F, -36.5F, -9.5F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, -1.03333333F, 0F, 0F, 0.93333333F, 0F, 0F, 1.2F); // Import CO_55
		noseModel[34].setRotationPoint(-79F, -36.5F, -10F);

		noseModel[35].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_56
		noseModel[35].setRotationPoint(-79F, -36.5F, -9.5F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, -1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, -1F, -0.3F, -1.2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F); // Import CO_57
		noseModel[36].setRotationPoint(-79F, -35.5F, -10F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import CO_58
		noseModel[37].setRotationPoint(-70F, -35.5F, -10F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_59
		noseModel[38].setRotationPoint(-65F, -36.5F, -11F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_60
		noseModel[39].setRotationPoint(-68.5F, -36.5F, -11F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_61
		noseModel[40].setRotationPoint(-72F, -36.5F, -11F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_62
		noseModel[41].setRotationPoint(-75.5F, -36.5F, -10.8F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import CO_63
		noseModel[42].setRotationPoint(-78F, -36.5F, -10.2F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 231
		noseModel[43].setRotationPoint(-79F, -37.5F, 8F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		noseModel[44].setRotationPoint(-70F, -37.5F, 8F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 233
		noseModel[45].setRotationPoint(-61.5F, -36.5F, 10F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		noseModel[46].setRotationPoint(-70F, -36.5F, 7.5F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0.93333333F, 0F, 0F, -1.03333333F, -1F, 0F, -1.2F); // Box 235
		noseModel[47].setRotationPoint(-79F, -36.5F, 8F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F); // Box 236
		noseModel[48].setRotationPoint(-79F, -36.5F, 7.5F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1.2F); // Box 237
		noseModel[49].setRotationPoint(-79F, -35.5F, 8F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 238
		noseModel[50].setRotationPoint(-70F, -35.5F, 8F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 239
		noseModel[51].setRotationPoint(-65F, -36.5F, 10F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 240
		noseModel[52].setRotationPoint(-68.5F, -36.5F, 10F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 241
		noseModel[53].setRotationPoint(-72F, -36.5F, 10F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 242
		noseModel[54].setRotationPoint(-75.5F, -36.5F, 9.8F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 243
		noseModel[55].setRotationPoint(-78F, -36.5F, 9.2F);


		tailModel = new ModelRendererTurbo[21];
		tailModel[0] = new ModelRendererTurbo(this, 1, 656, textureX, textureY); // Box 23
		tailModel[1] = new ModelRendererTurbo(this, 113, 656, textureX, textureY); // Box 24
		tailModel[2] = new ModelRendererTurbo(this, 209, 656, textureX, textureY); // Box 44
		tailModel[3] = new ModelRendererTurbo(this, 0, 685, textureX, textureY); // Box 116
		tailModel[4] = new ModelRendererTurbo(this, 41, 620, textureX, textureY); // Box 390
		tailModel[5] = new ModelRendererTurbo(this, 97, 620, textureX, textureY); // Box 391
		tailModel[6] = new ModelRendererTurbo(this, 129, 620, textureX, textureY); // Box 392
		tailModel[7] = new ModelRendererTurbo(this, 161, 620, textureX, textureY); // Box 393
		tailModel[8] = new ModelRendererTurbo(this, 273, 620, textureX, textureY); // Box 163
		tailModel[9] = new ModelRendererTurbo(this, 313, 620, textureX, textureY); // Box 164
		tailModel[10] = new ModelRendererTurbo(this, 353, 620, textureX, textureY); // Box 165
		tailModel[11] = new ModelRendererTurbo(this, 393, 620, textureX, textureY); // Box 166
		tailModel[12] = new ModelRendererTurbo(this, 425, 620, textureX, textureY); // Box 167
		tailModel[13] = new ModelRendererTurbo(this, 99, 685, textureX, textureY); // Box 168
		tailModel[14] = new ModelRendererTurbo(this, 0, 573, textureX, textureY); // Import TA_10
		tailModel[15] = new ModelRendererTurbo(this, 33, 574, textureX, textureY); // Import TA_11
		tailModel[16] = new ModelRendererTurbo(this, 33, 574, textureX, textureY); // Import TA_12
		tailModel[17] = new ModelRendererTurbo(this, 105, 574, textureX, textureY); // Import FPL_2
		tailModel[18] = new ModelRendererTurbo(this, 1, 529, textureX, textureY); // Box 282
		tailModel[19] = new ModelRendererTurbo(this, 1, 529, textureX, textureY); // Box 283
		tailModel[20] = new ModelRendererTurbo(this, 73, 529, textureX, textureY); // Box 285

		tailModel[0].addShapeBox(0F, 0F, 0F, 41, 14, 12, 0F, 0F, -2F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, 0F); // Box 23
		tailModel[0].setRotationPoint(45F, -39F, -6F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 41, 7, 5, 0F, 0F, -1.9999F, -1.9999F, 0F, -4.9999F, -2.9999F, 0F, -4.9999F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9999F, -2.9999F, 0F, -1.9999F, 0F, 0F, 0F, 0F); // Box 24
		tailModel[1].setRotationPoint(45F, -44F, -5F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 41, 7, 6, 0F, 0F, -2.9999F, 0F, 0F, 0F, -3.9999F, 0F, 0F, 0F, 0F, -2.9999F, 0F, 0F, -1.9999F, -0.9999F, 0F, -4.9999F, -5.5F, 0F, -4.9999F, 0F, 0F, 0F, 0F); // Box 44
		tailModel[2].setRotationPoint(45F, -28F, -6F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 41, 7, 5, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -2.9999F, 0F, -1.9999F, -1.9999F, 0F, 0F, 0F, 0F, -1.9999F, 0F, 0F, -1.9999F, -2.9999F, 0F, 0F, 0F); // Box 116
		tailModel[3].setRotationPoint(45F, -44F, 0F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 23, 29, 4, 0F, -15F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -15F, 0F, -1.5F, 4F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -1.5F); // Box 390
		tailModel[4].setRotationPoint(63F, -68F, -2F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, 0F, 0F, -1.5F, -2F, -1F, -1.5F, -2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 391
		tailModel[5].setRotationPoint(86F, -71F, -2F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F, -2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F); // Box 392
		tailModel[6].setRotationPoint(78F, -71F, -2F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 49, 5, 4, 0F, 0F, -1F, -1.5F, 0F, 8F, -1F, 0F, 8F, -1F, 0F, -1F, -1.5F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -1.5F); // Box 393
		tailModel[7].setRotationPoint(37F, -44F, -2F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 163
		tailModel[8].setRotationPoint(86F, -39F, -2F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 13, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 164
		tailModel[9].setRotationPoint(86F, -36F, -2F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, 0F, 0F); // Box 165
		tailModel[10].setRotationPoint(86F, -33F, -2F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1.5F, -5F, 0F, -1.5F, 0F, 0F, 0F); // Box 166
		tailModel[11].setRotationPoint(86F, -30F, -2F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, -1.49999F, 0F, 0F, -1.49999F, 0F, 0F, 0F, 0F, 0F, -1.49999F, 0F, -1.9999F, -1.49999F, 0F, -1.9999F, -1.49999F, 0F, 0F, -1.49999F); // Box 167
		tailModel[12].setRotationPoint(86F, -28F, -2F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 41, 7, 6, 0F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, 0F, -3.9999F, 0F, -2.9999F, 0F, 0F, 0F, 0F, 0F, -4.9999F, 0F, 0F, -4.9999F, -5.5F, 0F, -1.9999F, -0.9999F); // Box 168
		tailModel[13].setRotationPoint(45F, -28F, 0F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 9, 2, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import TA_10
		tailModel[14].setRotationPoint(76F, -40F, -2F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F, -2F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import TA_11
		tailModel[15].setRotationPoint(65F, -40F, -40F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 16, 2, 35, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Import TA_12
		tailModel[16].setRotationPoint(60F, -40F, -36F);

		tailModel[17].addShapeBox(0F, -1F, 0F, 6, 2, 4, 0F, 0F, 0F, -0.5F, -2.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Import FPL_2
		tailModel[17].setRotationPoint(76F, -39F, -40F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 11, 2, 4, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, -0.5F, -1F); // Box 282
		tailModel[18].setRotationPoint(65F, -40F, 36F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 16, 2, 35, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -0.5F, 0F); // Box 283
		tailModel[19].setRotationPoint(60F, -40F, 1F);

		tailModel[20].addShapeBox(0F, -1F, 0F, 6, 2, 4, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Box 285
		tailModel[20].setRotationPoint(76F, -39F, 36F);


		leftWingModel = new ModelRendererTurbo[25];
		leftWingModel[0] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Import LW_01
		leftWingModel[1] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Import LW_02
		leftWingModel[2] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Import LW_03
		leftWingModel[3] = new ModelRendererTurbo(this, 177, 344, textureX, textureY); // Import LW_04
		leftWingModel[4] = new ModelRendererTurbo(this, 41, 344, textureX, textureY); // Import LW_05
		leftWingModel[5] = new ModelRendererTurbo(this, 97, 344, textureX, textureY); // Import LW_07
		leftWingModel[6] = new ModelRendererTurbo(this, 305, 344, textureX, textureY); // Import LW_08
		leftWingModel[7] = new ModelRendererTurbo(this, 361, 344, textureX, textureY); // Import LW_09
		leftWingModel[8] = new ModelRendererTurbo(this, 185, 344, textureX, textureY); // Import LW_10
		leftWingModel[9] = new ModelRendererTurbo(this, 489, 344, textureX, textureY); // Import LW_11
		leftWingModel[10] = new ModelRendererTurbo(this, 97, 344, textureX, textureY); // Import LW_12
		leftWingModel[11] = new ModelRendererTurbo(this, 209, 344, textureX, textureY); // Import LW_13
		leftWingModel[12] = new ModelRendererTurbo(this, 225, 344, textureX, textureY); // Import LW_14
		leftWingModel[13] = new ModelRendererTurbo(this, 537, 344, textureX, textureY); // Box 167
		leftWingModel[14] = new ModelRendererTurbo(this, 1, 179, textureX, textureY); // Box 524
		leftWingModel[15] = new ModelRendererTurbo(this, 25, 179, textureX, textureY); // Box 525
		leftWingModel[16] = new ModelRendererTurbo(this, 49, 179, textureX, textureY); // Box 526
		leftWingModel[17] = new ModelRendererTurbo(this, 73, 179, textureX, textureY); // Box 527
		leftWingModel[18] = new ModelRendererTurbo(this, 129, 179, textureX, textureY); // Box 528
		leftWingModel[19] = new ModelRendererTurbo(this, 185, 179, textureX, textureY); // Box 529
		leftWingModel[20] = new ModelRendererTurbo(this, 225, 179, textureX, textureY); // Box 530
		leftWingModel[21] = new ModelRendererTurbo(this, 265, 179, textureX, textureY); // Box 531
		leftWingModel[22] = new ModelRendererTurbo(this, 305, 179, textureX, textureY); // Box 532
		leftWingModel[23] = new ModelRendererTurbo(this, 57, 197, textureX, textureY); // Box 0
		leftWingModel[24] = new ModelRendererTurbo(this, 0, 196, textureX, textureY); // Box 1

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 8, 7, 20, 0F, -6F, 0.5F, 0F, 6F, 2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -4.5F, 0F, 6F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import LW_01
		leftWingModel[0].setRotationPoint(-47F, -24F, -32F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 8, 8, 77, 0F, -5F, 4.5F, 0F, 3F, 5F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, -5F, -11.5F, 0F, 3F, -10F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F); // Import LW_02
		leftWingModel[1].setRotationPoint(-41F, -28F, -109F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F); // Import LW_03
		leftWingModel[2].setRotationPoint(-36F, -33F, -112F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 22, 8, 77, 0F, -2.99999F, 5F, 0F, -7.99999F, 5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2.99999F, -10F, 0F, -7.99999F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW_04
		leftWingModel[3].setRotationPoint(-33F, -28F, -109F);

		leftWingModel[4].addShapeBox(5F, 0F, 0F, 13, 2, 3, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 0F, 0F, 0F, -0.5F, 0F, -5F, 1F, 0F); // Import LW_05
		leftWingModel[4].setRotationPoint(-29F, -33F, -112F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 30, 7, 20, 0F, -6F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LW_07
		leftWingModel[5].setRotationPoint(-39F, -24F, -32F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F, 2F, 2F, 0F, -4F, -2F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -4F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LW_08
		leftWingModel[6].setRotationPoint(-9F, -24F, -32F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 40, 8, 6, 0F, -4F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 1F, -2F, 0F, 0F, 0F); // Import LW_09
		leftWingModel[7].setRotationPoint(-43F, -25F, -12F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F, -4F, -3F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -4F, -2F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Import LW_10
		leftWingModel[8].setRotationPoint(-51F, -25F, -12F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F, 6F, -1F, 0F, -6F, -5.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F); // Import LW_11
		leftWingModel[9].setRotationPoint(-3F, -25F, -12F);

		leftWingModel[10].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import LW_12
		leftWingModel[10].setRotationPoint(-40.6F, -24.5F, -41F);

		leftWingModel[11].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import LW_13
		leftWingModel[11].setRotationPoint(-40.4F, -24.8F, -45F);

		leftWingModel[12].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import LW_14
		leftWingModel[12].setRotationPoint(-40.1F, -25.1F, -49F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		leftWingModel[13].setRotationPoint(-30F, -33F, -112F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F); // Box 524
		leftWingModel[14].setRotationPoint(-42F, -16F, -46F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 525
		leftWingModel[15].setRotationPoint(-42F, -16F, -50F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 526
		leftWingModel[16].setRotationPoint(-42F, -16F, -54F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 23, 12, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		leftWingModel[17].setRotationPoint(-35F, -16F, -54F);

		leftWingModel[18].addBox(0F, 0F, 0F, 23, 12, 4, 0F); // Box 528
		leftWingModel[18].setRotationPoint(-35F, -16F, -50F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 15, 12, 4, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 529
		leftWingModel[19].setRotationPoint(-12F, -16F, -54F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 15, 12, 4, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 530
		leftWingModel[20].setRotationPoint(-12F, -16F, -50F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 15, 12, 4, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F); // Box 531
		leftWingModel[21].setRotationPoint(-12F, -16F, -46F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 23, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 532
		leftWingModel[22].setRotationPoint(-35F, -16F, -46F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		leftWingModel[23].setRotationPoint(-35F, -23F, -49F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 1
		leftWingModel[24].setRotationPoint(-35F, -23F, -48F);


		rightWingModel = new ModelRendererTurbo[25];
		rightWingModel[0] = new ModelRendererTurbo(this, 0, 437, textureX, textureY); // Box 202
		rightWingModel[1] = new ModelRendererTurbo(this, 0, 437, textureX, textureY); // Box 203
		rightWingModel[2] = new ModelRendererTurbo(this, 0, 437, textureX, textureY); // Box 204
		rightWingModel[3] = new ModelRendererTurbo(this, 1, 438, textureX, textureY); // Box 205
		rightWingModel[4] = new ModelRendererTurbo(this, 1, 438, textureX, textureY); // Box 206
		rightWingModel[5] = new ModelRendererTurbo(this, 41, 438, textureX, textureY); // Box 207
		rightWingModel[6] = new ModelRendererTurbo(this, 177, 438, textureX, textureY); // Box 208
		rightWingModel[7] = new ModelRendererTurbo(this, 97, 438, textureX, textureY); // Box 209
		rightWingModel[8] = new ModelRendererTurbo(this, 113, 438, textureX, textureY); // Box 211
		rightWingModel[9] = new ModelRendererTurbo(this, 305, 438, textureX, textureY); // Box 212
		rightWingModel[10] = new ModelRendererTurbo(this, 361, 438, textureX, textureY); // Box 213
		rightWingModel[11] = new ModelRendererTurbo(this, 201, 438, textureX, textureY); // Box 214
		rightWingModel[12] = new ModelRendererTurbo(this, 489, 438, textureX, textureY); // Box 215
		rightWingModel[13] = new ModelRendererTurbo(this, 537, 438, textureX, textureY); // Box 216
		rightWingModel[14] = new ModelRendererTurbo(this, 361, 179, textureX, textureY); // Box 585
		rightWingModel[15] = new ModelRendererTurbo(this, 385, 179, textureX, textureY); // Box 586
		rightWingModel[16] = new ModelRendererTurbo(this, 409, 179, textureX, textureY); // Box 587
		rightWingModel[17] = new ModelRendererTurbo(this, 433, 179, textureX, textureY); // Box 588
		rightWingModel[18] = new ModelRendererTurbo(this, 489, 179, textureX, textureY); // Box 589
		rightWingModel[19] = new ModelRendererTurbo(this, 545, 179, textureX, textureY); // Box 590
		rightWingModel[20] = new ModelRendererTurbo(this, 585, 179, textureX, textureY); // Box 591
		rightWingModel[21] = new ModelRendererTurbo(this, 625, 179, textureX, textureY); // Box 592
		rightWingModel[22] = new ModelRendererTurbo(this, 665, 179, textureX, textureY); // Box 593
		rightWingModel[23] = new ModelRendererTurbo(this, 393, 197, textureX, textureY); // Box 594
		rightWingModel[24] = new ModelRendererTurbo(this, 449, 197, textureX, textureY); // Box 595

		rightWingModel[0].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 202
		rightWingModel[0].setRotationPoint(-40.6F, -24.5F, 40F);

		rightWingModel[1].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 203
		rightWingModel[1].setRotationPoint(-40.4F, -24.8F, 44F);

		rightWingModel[2].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 204
		rightWingModel[2].setRotationPoint(-40.1F, -25.1F, 48F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 8, 7, 20, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 6F, 2F, 0F, -6F, 0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 6F, -3F, 0F, -6F, -4.5F, 0F); // Box 205
		rightWingModel[3].setRotationPoint(-47F, -24F, 12F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 8, 8, 77, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 3F, 5F, 0F, -5F, 4.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 3F, -10F, 0F, -5F, -11.5F, 0F); // Box 206
		rightWingModel[4].setRotationPoint(-41F, -28F, 32F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -3F, -0.5F, -1F); // Box 207
		rightWingModel[5].setRotationPoint(-36F, -33F, 109F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 22, 8, 77, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -7.99999F, 5F, 0F, -2.99999F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.99999F, -10F, 0F, -2.99999F, -10F, 0F); // Box 208
		rightWingModel[6].setRotationPoint(-33F, -28F, 32F);

		rightWingModel[7].addShapeBox(5F, 0F, 0F, 13, 2, 3, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 1F, 0F, 0F, -0.5F, 0F, -6F, 0F, 0F, -5F, 0F, 0F); // Box 209
		rightWingModel[7].setRotationPoint(-29F, -33F, 109F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 30, 7, 20, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, -6F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -6F, -3F, 0F); // Box 211
		rightWingModel[8].setRotationPoint(-39F, -24F, 12F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 17, 7, 20, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, -4F, -2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, -4F, 0F, 2F, -3F, 0F); // Box 212
		rightWingModel[9].setRotationPoint(-9F, -24F, 12F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 40, 8, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -2F, -6F, 0F, 0F, -4F, 0F, 0F); // Box 213
		rightWingModel[10].setRotationPoint(-43F, -25F, 6F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, -1F, 0F, -4F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, -2F, 0F); // Box 214
		rightWingModel[11].setRotationPoint(-51F, -25F, 6F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 17, 8, 6, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, -5.5F, 0F, 6F, -1F, 0F, 0F, 1F, -2F, 0F, -1F, 0F, -6F, -1F, 0F, 6F, 0F, 0F); // Box 215
		rightWingModel[12].setRotationPoint(-3F, -25F, 6F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 216
		rightWingModel[13].setRotationPoint(-30F, -33F, 109F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F); // Box 585
		rightWingModel[14].setRotationPoint(-42F, -16F, 42F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F); // Box 586
		rightWingModel[15].setRotationPoint(-42F, -16F, 46F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 7, 12, 4, 0F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F); // Box 587
		rightWingModel[16].setRotationPoint(-42F, -16F, 50F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 23, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 588
		rightWingModel[17].setRotationPoint(-35F, -16F, 50F);

		rightWingModel[18].addBox(0F, 0F, 0F, 23, 12, 4, 0F); // Box 589
		rightWingModel[18].setRotationPoint(-35F, -16F, 46F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 15, 12, 4, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 1F, 0F, -5F, -4F, 0F, -4F, 0F); // Box 590
		rightWingModel[19].setRotationPoint(-12F, -16F, 50F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 15, 12, 4, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 591
		rightWingModel[20].setRotationPoint(-12F, -16F, 46F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 15, 12, 4, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -4F, 0F, -4F, 1F, 0F, 0F, 0F); // Box 592
		rightWingModel[21].setRotationPoint(-12F, -16F, 42F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 23, 12, 4, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightWingModel[22].setRotationPoint(-35F, -16F, 42F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 594
		rightWingModel[23].setRotationPoint(-35F, -23F, 48F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 26, 7, 1, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		rightWingModel[24].setRotationPoint(-35F, -23F, 47F);


		yawFlapModel = new ModelRendererTurbo[1];
		yawFlapModel[0] = new ModelRendererTurbo(this, 1, 620, textureX, textureY); // Box 377

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 13, 29, 4, 0F, 0F, 0F, -1F, -5F, 0F, -1.5F, -5F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 377
		yawFlapModel[0].setRotationPoint(86F, -68F, -2F);


		pitchFlapLeftModel = new ModelRendererTurbo[1];
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 137, 574, textureX, textureY); // Import FPL_1

		pitchFlapLeftModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 34, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Import FPL_1
		pitchFlapLeftModel[0].setRotationPoint(76F, -39F, -36F);


		pitchFlapRightModel = new ModelRendererTurbo[1];
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 105, 529, textureX, textureY); // Box 284

		pitchFlapRightModel[0].addShapeBox(0F, -1F, 0F, 9, 2, 34, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 284
		pitchFlapRightModel[0].setRotationPoint(76F, -39F, 2F);


		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 377, 344, textureX, textureY); // Import LW_06

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 15, 8, 77, 0F, 8F, 5F, 0F, -15F, 4F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 8F, -10F, 0F, -15F, -11.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import LW_06
		pitchFlapLeftWingModel[0].setRotationPoint(-11F, -28F, -109F);


		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 377, 438, textureX, textureY); // Box 210

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 15, 8, 77, 0F, 0F, -2F, 0F, 0F, -6F, 0F, -15F, 4F, 0F, 8F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -15F, -11.5F, 0F, 8F, -10F, 0F); // Box 210
		pitchFlapRightWingModel[0].setRotationPoint(-11F, -28F, 32F);


		tailWheelModel = new ModelRendererTurbo[7];
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 286, textureX, textureY); // Import TW_1
		tailWheelModel[1] = new ModelRendererTurbo(this, 17, 286, textureX, textureY); // Import TW_2
		tailWheelModel[2] = new ModelRendererTurbo(this, 25, 286, textureX, textureY); // Import TW_3
		tailWheelModel[3] = new ModelRendererTurbo(this, 33, 286, textureX, textureY); // Import TW_4
		tailWheelModel[4] = new ModelRendererTurbo(this, 49, 286, textureX, textureY); // Import TW_5
		tailWheelModel[5] = new ModelRendererTurbo(this, 65, 286, textureX, textureY); // Import TW_6
		tailWheelModel[6] = new ModelRendererTurbo(this, 97, 286, textureX, textureY); // Box 276

		tailWheelModel[0].addBox(0F, 0F, 0F, 5, 3, 1, 0F); // Import TW_1
		tailWheelModel[0].setRotationPoint(53F, -16F, -0.5F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, -0.25F); // Import TW_2
		tailWheelModel[1].setRotationPoint(52F, -20F, -1F);

		tailWheelModel[2].addShapeBox(0F, -4F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import TW_3
		tailWheelModel[2].setRotationPoint(52F, -20F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import TW_4
		tailWheelModel[3].setRotationPoint(53F, -17F, -0.5F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import TW_5
		tailWheelModel[4].setRotationPoint(53F, -13F, -0.5F);

		tailWheelModel[5].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import TW_6
		tailWheelModel[5].setRotationPoint(46F, -18.5F, -2F);
		tailWheelModel[5].rotateAngleZ = 0.13962634F;

		tailWheelModel[6].addShapeBox(0F, -4F, 0F, 12, 4, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		tailWheelModel[6].setRotationPoint(46F, -18.5F, 1F);
		tailWheelModel[6].rotateAngleZ = 0.13962634F;


		leftWingWheelModel = new ModelRendererTurbo[12];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 1, 298, textureX, textureY); // Import LWW_03
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 41, 298, textureX, textureY); // Import LWW_04
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 81, 298, textureX, textureY); // Import LWW_05
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 121, 298, textureX, textureY); // Import LWW_07
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 129, 298, textureX, textureY); // Import LWW_08
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 145, 298, textureX, textureY); // Import LWW_09
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 161, 298, textureX, textureY); // Import LWW_11
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 185, 298, textureX, textureY); // Import LWW_12
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 201, 298, textureX, textureY); // Import LWW_13
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 217, 298, textureX, textureY); // Import LWW_06
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 225, 298, textureX, textureY); // Box 762
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 273, 298, textureX, textureY); // Box 763

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Import LWW_03
		leftWingWheelModel[0].setRotationPoint(-52F, 6F, -38F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Import LWW_04
		leftWingWheelModel[1].setRotationPoint(-52F, 0F, -38F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_05
		leftWingWheelModel[2].setRotationPoint(-52F, -4F, -38F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_07
		leftWingWheelModel[3].setRotationPoint(-46F, -4F, -34F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -2.08333333F, -2F, 0F, 2.08333333F, -2F, 0F, 2.29166667F, -1F, 0F, -2.29166667F, -1F, 0F, -1.66666667F, 0F, -3F, 1.66666667F, 0F, -3F, 1.66666667F, 0F, 2F, -1.66666667F, 0F, 2F); // Import LWW_08
		leftWingWheelModel[4].setRotationPoint(-46F, -8F, -37F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Import LWW_09
		leftWingWheelModel[5].setRotationPoint(-46F, -23F, -37F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import LWW_11
		leftWingWheelModel[6].setRotationPoint(-43.5F, -11F, -39.5F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F, -5F, 0F, 1.04347826F, 5F, 0F, 1.04347826F, 5F, 0F, -1.64347826F, -5F, 0F, -1.64347826F, -1F, -2F, 4F, 6F, 0F, 4F, 6F, 0F, -4.6F, -1F, -2F, -4.6F); // Import LWW_12
		leftWingWheelModel[7].setRotationPoint(-48F, -14F, -37.5F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, -6F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, -0.6F, -6F, 0F, -0.6F, -3F, 0F, 1.04347826F, 3F, 0F, 1.04347826F, 3F, 0F, -1.64347826F, -3F, 0F, -1.64347826F); // Import LWW_13
		leftWingWheelModel[8].setRotationPoint(-46F, -23F, -37.5F);

		leftWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import LWW_06
		leftWingWheelModel[9].setRotationPoint(-46F, 2F, -38.5F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 2.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 762
		leftWingWheelModel[10].setRotationPoint(-45F, -6.5F, -3F);
		leftWingWheelModel[10].rotateAngleX = 1.57079633F;

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 3.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 2F, 0F, 0F, 3.5F, 0F, 0F); // Box 763
		leftWingWheelModel[11].setRotationPoint(-44F, 0.5F, -4.5F);
		leftWingWheelModel[11].rotateAngleX = 1.57079633F;


		rightWingWheelModel = new ModelRendererTurbo[12];
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 1, 319, textureX, textureY); // Box 256
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 41, 319, textureX, textureY); // Box 257
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 81, 319, textureX, textureY); // Box 258
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 121, 319, textureX, textureY); // Box 259
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 129, 319, textureX, textureY); // Box 260
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 145, 319, textureX, textureY); // Box 261
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 161, 319, textureX, textureY); // Box 262
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 185, 319, textureX, textureY); // Box 263
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 201, 319, textureX, textureY); // Box 264
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 217, 319, textureX, textureY); // Box 265
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 225, 319, textureX, textureY); // Box 268
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 273, 319, textureX, textureY); // Box 269

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 256
		rightWingWheelModel[0].setRotationPoint(-52F, 6F, 34F);

		rightWingWheelModel[1].addBox(0F, 0F, 0F, 14, 6, 4, 0F); // Box 257
		rightWingWheelModel[1].setRotationPoint(-52F, 0F, 34F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 14, 4, 4, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightWingWheelModel[2].setRotationPoint(-52F, -4F, 34F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, -1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, 1.66666667F, 0F, 0F, -1.66666667F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightWingWheelModel[3].setRotationPoint(-46F, -4F, 33F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -2.29166667F, -1F, 0F, 2.29166667F, -1F, 0F, 2.08333333F, -2F, 0F, -2.08333333F, -2F, 0F, -1.66666667F, 0F, 2F, 1.66666667F, 0F, 2F, 1.66666667F, 0F, -3F, -1.66666667F, 0F, -3F); // Box 260
		rightWingWheelModel[4].setRotationPoint(-46F, -8F, 35F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, 2.08333333F, 0F, 0F, -2.08333333F, 0F, 0F); // Box 261
		rightWingWheelModel[5].setRotationPoint(-46F, -23F, 35F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 262
		rightWingWheelModel[6].setRotationPoint(-43.5F, -11F, 34.5F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 4, 17, 1, 0F, -5F, 0F, -1.64347826F, 5F, 0F, -1.64347826F, 5F, 0F, 1.04347826F, -5F, 0F, 1.04347826F, -1F, -2F, -4.6F, 6F, 0F, -4.6F, 6F, 0F, 4F, -1F, -2F, 4F); // Box 263
		rightWingWheelModel[7].setRotationPoint(-48F, -14F, 36.5F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 1, 0F, -6F, 0F, -0.6F, 5F, 0F, -0.6F, 5F, 0F, 0F, -6F, 0F, 0F, -3F, 0F, -1.64347826F, 3F, 0F, -1.64347826F, 3F, 0F, 1.04347826F, -3F, 0F, 1.04347826F); // Box 264
		rightWingWheelModel[8].setRotationPoint(-46F, -23F, 36.5F);

		rightWingWheelModel[9].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Box 265
		rightWingWheelModel[9].setRotationPoint(-46F, 2F, 33.5F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 15, 2, 10, 0F, 2.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 268
		rightWingWheelModel[10].setRotationPoint(-45F, -6.5F, 1F);
		rightWingWheelModel[10].rotateAngleX = 1.57079633F;

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 2F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1.5F, 0F, 3.5F, -1.5F, 0F); // Box 269
		rightWingWheelModel[11].setRotationPoint(-44F, 0.5F, 2.5F);
		rightWingWheelModel[11].rotateAngleX = 1.57079633F;



		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(-87F, -35F, 0F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 0, 125, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 125, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 125, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 0, 125, textureX, textureY);
		prop[0].addBox(-0.5F, -36F, -2.5F, 1, 36, 5, 0.0F);
		prop[1].addBox(-0.5F, -36F, -2.5F, 1, 36, 5, 0.0F);
		prop[2].addBox(-0.5F, -36F, -2.5F, 1, 36, 5, 0.0F);
		prop[3].addBox(-0.5F, -36F, -2.5F, 1, 36, 5, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}