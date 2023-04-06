//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.03.2018 - 15:36:24
// Last changed on: 23.03.2018 - 15:36:24

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGoblin extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelGoblin() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[170];
		noseModel = new ModelRendererTurbo[70];
		tailModel = new ModelRendererTurbo[105];
		leftWingModel = new ModelRendererTurbo[3];
		rightWingModel = new ModelRendererTurbo[3];
		yawFlapModel = new ModelRendererTurbo[10];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		pitchFlapRightWingModel = new ModelRendererTurbo[1];
		bodyDoorOpenModel = new ModelRendererTurbo[3];
		leftWingPos1Model = new ModelRendererTurbo[11];
		leftWingPos2Model = new ModelRendererTurbo[11];
		rightWingPos1Model = new ModelRendererTurbo[11];
		rightWingPos2Model = new ModelRendererTurbo[11];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftWingModel_1();
		initpitchFlapRightWingModel_1();
		initbodyDoorOpenModel_1();
		initleftWingPos1Model_1();
		initleftWingPos2Model_1();
		initrightWingPos1Model_1();
		initrightWingPos2Model_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 47
		bodyModel[1] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 49
		bodyModel[3] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 51
		bodyModel[5] = new ModelRendererTurbo(this, 857, 1, textureX, textureY); // Box 52
		bodyModel[6] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 53
		bodyModel[7] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 54
		bodyModel[8] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 55
		bodyModel[9] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 56
		bodyModel[10] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 57
		bodyModel[11] = new ModelRendererTurbo(this, 521, 9, textureX, textureY); // Box 58
		bodyModel[12] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 59
		bodyModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 60
		bodyModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 61
		bodyModel[15] = new ModelRendererTurbo(this, 945, 9, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 52
		bodyModel[18] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 53
		bodyModel[19] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 54
		bodyModel[20] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 55
		bodyModel[21] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 56
		bodyModel[22] = new ModelRendererTurbo(this, 561, 9, textureX, textureY); // Box 57
		bodyModel[23] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 58
		bodyModel[24] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 59
		bodyModel[25] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 62
		bodyModel[26] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 63
		bodyModel[27] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 64
		bodyModel[28] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 65
		bodyModel[29] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 66
		bodyModel[30] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 67
		bodyModel[31] = new ModelRendererTurbo(this, 761, 17, textureX, textureY); // Box 68
		bodyModel[32] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 69
		bodyModel[33] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 70
		bodyModel[34] = new ModelRendererTurbo(this, 537, 17, textureX, textureY); // Box 71
		bodyModel[35] = new ModelRendererTurbo(this, 913, 17, textureX, textureY); // Box 72
		bodyModel[36] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 73
		bodyModel[37] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 74
		bodyModel[38] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 75
		bodyModel[39] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 76
		bodyModel[40] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 77
		bodyModel[41] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 78
		bodyModel[42] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 79
		bodyModel[43] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 80
		bodyModel[44] = new ModelRendererTurbo(this, 881, 25, textureX, textureY); // Box 89
		bodyModel[45] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 90
		bodyModel[46] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 91
		bodyModel[47] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 92
		bodyModel[48] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 93
		bodyModel[49] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 94
		bodyModel[50] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 95
		bodyModel[51] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 96
		bodyModel[52] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 97
		bodyModel[53] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 98
		bodyModel[54] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 123
		bodyModel[56] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 124
		bodyModel[57] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 127
		bodyModel[58] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 214
		bodyModel[60] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 215
		bodyModel[61] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 216
		bodyModel[62] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 217
		bodyModel[63] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 218
		bodyModel[64] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 219
		bodyModel[65] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 220
		bodyModel[66] = new ModelRendererTurbo(this, 937, 49, textureX, textureY); // Box 221
		bodyModel[67] = new ModelRendererTurbo(this, 945, 65, textureX, textureY); // Box 222
		bodyModel[68] = new ModelRendererTurbo(this, 961, 65, textureX, textureY); // Box 223
		bodyModel[69] = new ModelRendererTurbo(this, 977, 65, textureX, textureY); // Box 224
		bodyModel[70] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 225
		bodyModel[71] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 226
		bodyModel[72] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 227
		bodyModel[73] = new ModelRendererTurbo(this, 825, 17, textureX, textureY); // Box 228
		bodyModel[74] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 229
		bodyModel[75] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 230
		bodyModel[76] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 231
		bodyModel[77] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 232
		bodyModel[78] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 233
		bodyModel[79] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 234
		bodyModel[80] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 235
		bodyModel[81] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 236
		bodyModel[82] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 237
		bodyModel[83] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 238
		bodyModel[84] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 241
		bodyModel[85] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 242
		bodyModel[86] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 243
		bodyModel[87] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 244
		bodyModel[88] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 245
		bodyModel[89] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 246
		bodyModel[90] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 247
		bodyModel[91] = new ModelRendererTurbo(this, 809, 89, textureX, textureY); // Box 248
		bodyModel[92] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 249
		bodyModel[93] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 250
		bodyModel[94] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 251
		bodyModel[95] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 252
		bodyModel[96] = new ModelRendererTurbo(this, 833, 65, textureX, textureY); // Box 253
		bodyModel[97] = new ModelRendererTurbo(this, 833, 41, textureX, textureY); // Box 254
		bodyModel[98] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 255
		bodyModel[99] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 256
		bodyModel[100] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 257
		bodyModel[101] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 258
		bodyModel[102] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 259
		bodyModel[103] = new ModelRendererTurbo(this, 921, 81, textureX, textureY); // Box 263
		bodyModel[104] = new ModelRendererTurbo(this, 777, 97, textureX, textureY); // Box 268
		bodyModel[105] = new ModelRendererTurbo(this, 849, 97, textureX, textureY); // Box 269
		bodyModel[106] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 270
		bodyModel[107] = new ModelRendererTurbo(this, 977, 97, textureX, textureY); // Box 271
		bodyModel[108] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 272
		bodyModel[109] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 273
		bodyModel[110] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 274
		bodyModel[111] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 275
		bodyModel[112] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 276
		bodyModel[113] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 277
		bodyModel[114] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 278
		bodyModel[115] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 299
		bodyModel[116] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 300
		bodyModel[117] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 303
		bodyModel[118] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 304
		bodyModel[119] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 239
		bodyModel[120] = new ModelRendererTurbo(this, 937, 129, textureX, textureY); // Box 240
		bodyModel[121] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 241
		bodyModel[122] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 242
		bodyModel[123] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 243
		bodyModel[124] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 244
		bodyModel[125] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 245
		bodyModel[126] = new ModelRendererTurbo(this, 657, 137, textureX, textureY); // Box 246
		bodyModel[127] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 247
		bodyModel[128] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 248
		bodyModel[129] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 252
		bodyModel[130] = new ModelRendererTurbo(this, 937, 25, textureX, textureY); // Box 253
		bodyModel[131] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 962
		bodyModel[132] = new ModelRendererTurbo(this, 673, 73, textureX, textureY); // Box 964
		bodyModel[133] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Box 966
		bodyModel[134] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 19
		bodyModel[135] = new ModelRendererTurbo(this, 961, 137, textureX, textureY); // Box 390
		bodyModel[136] = new ModelRendererTurbo(this, 977, 137, textureX, textureY); // Box 391
		bodyModel[137] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Box 392
		bodyModel[138] = new ModelRendererTurbo(this, 753, 137, textureX, textureY); // Box 393
		bodyModel[139] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 394
		bodyModel[140] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 395
		bodyModel[141] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 396
		bodyModel[142] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Box 397
		bodyModel[143] = new ModelRendererTurbo(this, 521, 153, textureX, textureY); // Box 398
		bodyModel[144] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 399
		bodyModel[145] = new ModelRendererTurbo(this, 785, 137, textureX, textureY); // Box 400
		bodyModel[146] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 401
		bodyModel[147] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Box 281
		bodyModel[148] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Box 403
		bodyModel[149] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 404
		bodyModel[150] = new ModelRendererTurbo(this, 825, 25, textureX, textureY); // Box 405
		bodyModel[151] = new ModelRendererTurbo(this, 977, 25, textureX, textureY); // Box 406
		bodyModel[152] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 407
		bodyModel[153] = new ModelRendererTurbo(this, 553, 17, textureX, textureY); // Box 408
		bodyModel[154] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 409
		bodyModel[155] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 410
		bodyModel[156] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 411
		bodyModel[157] = new ModelRendererTurbo(this, 785, 17, textureX, textureY); // Box 412
		bodyModel[158] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 413
		bodyModel[159] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 416
		bodyModel[160] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 417
		bodyModel[161] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 418
		bodyModel[162] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 293
		bodyModel[163] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 294
		bodyModel[164] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 426
		bodyModel[165] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 427
		bodyModel[166] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 428
		bodyModel[167] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 70
		bodyModel[168] = new ModelRendererTurbo(this, 761, 25, textureX, textureY); // Box 74
		bodyModel[169] = new ModelRendererTurbo(this, 913, 25, textureX, textureY); // Box 75

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[0].setRotationPoint(-12F, -39F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[1].setRotationPoint(-6F, -39F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 49
		bodyModel[2].setRotationPoint(-12F, -37F, -10F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 50
		bodyModel[3].setRotationPoint(-12F, -33F, -12F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[4].setRotationPoint(-12F, -27F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[5].setRotationPoint(-12F, -19F, -12F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[6].setRotationPoint(-16F, -19F, -12F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[7].setRotationPoint(-20F, -19F, -12F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[8].setRotationPoint(-16F, -27F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 56
		bodyModel[9].setRotationPoint(-16F, -33F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 57
		bodyModel[10].setRotationPoint(-16F, -37F, -10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[11].setRotationPoint(-16F, -39F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 59
		bodyModel[12].setRotationPoint(-20F, -39F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[13].setRotationPoint(-20F, -40F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[14].setRotationPoint(-20F, -40F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[15].setRotationPoint(-26F, -40F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[16].setRotationPoint(-26F, -40F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, -3F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[17].setRotationPoint(-26F, -39F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 53
		bodyModel[18].setRotationPoint(-20F, -37F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[19].setRotationPoint(-26F, -37F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 55
		bodyModel[20].setRotationPoint(-20F, -33F, -12F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[21].setRotationPoint(-26F, -33F, -12F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[22].setRotationPoint(-20F, -27F, -12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[23].setRotationPoint(-26F, -27F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 59
		bodyModel[24].setRotationPoint(-26F, -19F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 62
		bodyModel[25].setRotationPoint(-6F, -37F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 63
		bodyModel[26].setRotationPoint(-6F, -33F, -12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 64
		bodyModel[27].setRotationPoint(-6F, -27F, -12F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[28].setRotationPoint(-6F, -19F, -12F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[29].setRotationPoint(3F, -39F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[30].setRotationPoint(3F, -37F, -10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[31].setRotationPoint(3F, -33F, -12F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 69
		bodyModel[32].setRotationPoint(3F, -27F, -12F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,-3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[33].setRotationPoint(3F, -44F, -6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,-3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F); // Box 71
		bodyModel[34].setRotationPoint(2F, -44F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[35].setRotationPoint(3F, -18F, -12F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-1F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[36].setRotationPoint(6F, -47F, -4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 74
		bodyModel[37].setRotationPoint(7F, -48F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F); // Box 75
		bodyModel[38].setRotationPoint(5F, -47F, -4F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 76
		bodyModel[39].setRotationPoint(6F, -48F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[40].setRotationPoint(3F, -18F, -12F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 6, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[41].setRotationPoint(-6F, -17F, -12F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 14, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[42].setRotationPoint(-20F, -16F, -12F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 80
		bodyModel[43].setRotationPoint(-26F, -17F, -12F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -2F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[44].setRotationPoint(3F, -13F, -9F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -2F, -5F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[45].setRotationPoint(-6F, -12F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[46].setRotationPoint(-20F, -11F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 92
		bodyModel[47].setRotationPoint(-26F, -12F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -1F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 93
		bodyModel[48].setRotationPoint(-13F, -43F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, -1F, -1F, 0F, -1F, -1F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 1F, -1F); // Box 94
		bodyModel[49].setRotationPoint(-14F, -44F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[50].setRotationPoint(-15F, -44F, -4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[51].setRotationPoint(-15F, -44F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[52].setRotationPoint(-20F, -43F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 14, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[53].setRotationPoint(-20F, -23F, -11F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 9, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[54].setRotationPoint(-6F, -23F, -11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[55].setRotationPoint(-26F, -41F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[56].setRotationPoint(-26F, -40F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, -1F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[57].setRotationPoint(-23F, -41F, -4F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, -2F, 0F, 0F, -2F, -3F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 128
		bodyModel[58].setRotationPoint(-23F, -40F, -6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 214
		bodyModel[59].setRotationPoint(-12F, -39F, 5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 215
		bodyModel[60].setRotationPoint(-6F, -39F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[61].setRotationPoint(-12F, -37F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		bodyModel[62].setRotationPoint(-12F, -33F, 9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[63].setRotationPoint(-12F, -27F, 11F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[64].setRotationPoint(-12F, -19F, 11F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[65].setRotationPoint(-16F, -19F, 11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[66].setRotationPoint(-20F, -19F, 11F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 222
		bodyModel[67].setRotationPoint(-16F, -27F, 11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[68].setRotationPoint(-16F, -33F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[69].setRotationPoint(-16F, -37F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[70].setRotationPoint(-16F, -39F, 5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[71].setRotationPoint(-20F, -39F, 3F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[72].setRotationPoint(-20F, -40F, 0F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[73].setRotationPoint(-20F, -40F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[74].setRotationPoint(-26F, -40F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[75].setRotationPoint(-26F, -40F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, -1F); // Box 231
		bodyModel[76].setRotationPoint(-26F, -39F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		bodyModel[77].setRotationPoint(-20F, -37F, 6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 233
		bodyModel[78].setRotationPoint(-26F, -37F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[79].setRotationPoint(-20F, -33F, 9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[80].setRotationPoint(-26F, -33F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		bodyModel[81].setRotationPoint(-20F, -27F, 11F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 237
		bodyModel[82].setRotationPoint(-26F, -27F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 238
		bodyModel[83].setRotationPoint(-26F, -19F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[84].setRotationPoint(-6F, -37F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[85].setRotationPoint(-6F, -33F, 9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 243
		bodyModel[86].setRotationPoint(-6F, -27F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[87].setRotationPoint(-6F, -19F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 245
		bodyModel[88].setRotationPoint(3F, -39F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[89].setRotationPoint(3F, -37F, 0F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[90].setRotationPoint(3F, -33F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 248
		bodyModel[91].setRotationPoint(3F, -27F, 0F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 249
		bodyModel[92].setRotationPoint(3F, -44F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 5, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[93].setRotationPoint(2F, -44F, 3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[94].setRotationPoint(3F, -18F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[95].setRotationPoint(6F, -47F, 0F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		bodyModel[96].setRotationPoint(7F, -48F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 254
		bodyModel[97].setRotationPoint(5F, -47F, 1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 255
		bodyModel[98].setRotationPoint(6F, -48F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -3F); // Box 256
		bodyModel[99].setRotationPoint(3F, -18F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 6, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -4F); // Box 257
		bodyModel[100].setRotationPoint(-6F, -17F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 14, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 258
		bodyModel[101].setRotationPoint(-20F, -16F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -1F, -3F); // Box 259
		bodyModel[102].setRotationPoint(-26F, -17F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -3F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 263
		bodyModel[103].setRotationPoint(-33F, -38F, 2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 5, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -5F, 0F, -1F, -5F); // Box 268
		bodyModel[104].setRotationPoint(3F, -13F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -5F, 0F, -1F, -5F); // Box 269
		bodyModel[105].setRotationPoint(-6F, -12F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F); // Box 270
		bodyModel[106].setRotationPoint(-20F, -11F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 6, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -2F, -5F); // Box 271
		bodyModel[107].setRotationPoint(-26F, -12F, 0F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -1F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 272
		bodyModel[108].setRotationPoint(-13F, -43F, 4F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -1F, -1F, -1F, -1F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 1F, 0F); // Box 273
		bodyModel[109].setRotationPoint(-14F, -44F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 274
		bodyModel[110].setRotationPoint(-15F, -44F, 2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[111].setRotationPoint(-15F, -44F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[112].setRotationPoint(-20F, -43F, 1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 14, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[113].setRotationPoint(-20F, -23F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[114].setRotationPoint(-6F, -23F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[115].setRotationPoint(-26F, -41F, 2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[116].setRotationPoint(-26F, -40F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 303
		bodyModel[117].setRotationPoint(-23F, -41F, 2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 304
		bodyModel[118].setRotationPoint(-23F, -40F, 2F);

		bodyModel[119].addShapeBox(0F, 1F, 0F, 10, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		bodyModel[119].setRotationPoint(-9F, -26F, -5F);
		bodyModel[119].rotateAngleZ = -0.10471976F;

		bodyModel[120].addShapeBox(9F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[120].setRotationPoint(-9F, -26F, -5F);
		bodyModel[120].rotateAngleZ = -0.10471976F;

		bodyModel[121].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[121].setRotationPoint(-9F, -26F, -5F);
		bodyModel[121].rotateAngleZ = -0.10471976F;

		bodyModel[122].addShapeBox(1F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[122].setRotationPoint(-9F, -26F, 4F);
		bodyModel[122].rotateAngleZ = -0.10471976F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[123].setRotationPoint(-9F, -26F, -5F);
		bodyModel[123].rotateAngleZ = -0.10471976F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 15, 10, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 244
		bodyModel[124].setRotationPoint(0F, -40F, -5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[125].setRotationPoint(2F, -44F, -3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 15, 8, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[126].setRotationPoint(-1F, -39F, -4F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[127].setRotationPoint(-1.3F, -39.3F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[128].setRotationPoint(-1.3F, -39.3F, 1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[129].setRotationPoint(-6F, -25F, -5.5F);
		bodyModel[129].rotateAngleZ = 0.78539816F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 253
		bodyModel[130].setRotationPoint(-6F, -25F, 4.5F);
		bodyModel[130].rotateAngleZ = 0.78539816F;

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 962
		bodyModel[131].setRotationPoint(1.5F, -43.5F, -1.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 964
		bodyModel[132].setRotationPoint(1.5F, -42.5F, -1.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 966
		bodyModel[133].setRotationPoint(1.5F, -41.5F, -1.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 140, 180, 0F,0F, -124F, -85F, 0F, -123.5F, -85F, 0F, -123.5F, -85F, 0F, -124F, -85F, 0F, -9F, -85F, 0F, -9F, -85F, 0F, -9F, -85F, 0F, -9F, -85F); // Box 19
		bodyModel[134].setRotationPoint(-16F, -164F, -90F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 17, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[135].setRotationPoint(-20F, -40F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 17, 3, 0F,0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 391
		bodyModel[136].setRotationPoint(-20F, -40F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 13, 6, 0F,0F, -7F, -2F, 0F, -5F, -3F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 392
		bodyModel[137].setRotationPoint(-20F, -40F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 393
		bodyModel[138].setRotationPoint(-20F, -27F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[139].setRotationPoint(-16F, -33F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[140].setRotationPoint(-16F, -26F, -4.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 4, 17, 2, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 396
		bodyModel[141].setRotationPoint(-20F, -40F, 0F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 4, 17, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 397
		bodyModel[142].setRotationPoint(-20F, -40F, 2F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 8, 13, 6, 0F,0F, -3F, 0F, 0F, -2F, 0F, 0F, -5F, -3F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 398
		bodyModel[143].setRotationPoint(-20F, -40F, 5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 8, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		bodyModel[144].setRotationPoint(-20F, -27F, 5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		bodyModel[145].setRotationPoint(-16F, -33F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyModel[146].setRotationPoint(-16F, -26F, 2.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 228, 6, 42, 0F,0F, 4F, -19F, -213F, 0F, -19F, -213F, 4F, -19F, 0F, 6F, -20F, 0F, 0F, -19F, -213F, 0F, -19F, -213F, 0F, -19F, 0F, 0F, -19F); // Box 281
		bodyModel[147].setRotationPoint(-12F, -29F, -14F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 228, 6, 42, 0F,0F, 0F, -17F, -213F, 0F, -17F, -213F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -19F, -213F, 0F, -19F, -213F, 0F, -19F, 0F, 0F, -19F); // Box 403
		bodyModel[148].setRotationPoint(-12F, -29F, -28F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 5, 5, 6, 0F,0F, 0F, -2F, -1F, -3F, -1F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		bodyModel[149].setRotationPoint(-12F, -34F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		bodyModel[150].setRotationPoint(-12F, -32F, -8.5F);
		bodyModel[150].rotateAngleZ = 0.33161256F;

		bodyModel[151].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		bodyModel[151].setRotationPoint(-12F, -32F, -6.5F);
		bodyModel[151].rotateAngleZ = 0.62831853F;

		bodyModel[152].addShapeBox(4F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[152].setRotationPoint(-12F, -32F, -5.5F);
		bodyModel[152].rotateAngleZ = 0.62831853F;

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[153].setRotationPoint(-5F, -30F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[154].setRotationPoint(-5F, -30F, -7F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[155].setRotationPoint(-6.5F, -30F, -8F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[156].setRotationPoint(-3F, -30F, -7F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[157].setRotationPoint(-3F, -30F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413
		bodyModel[158].setRotationPoint(-1F, -30F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 416
		bodyModel[159].setRotationPoint(-1F, -30F, -7F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 417
		bodyModel[160].setRotationPoint(-12.5F, -35.5F, -6.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[161].setRotationPoint(-12F, -28F, -2F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.999999F, 0F, 0F, -0.999999F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[162].setRotationPoint(-13F, -29.5F, 4F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 294
		bodyModel[163].setRotationPoint(-13F, -31.5F, 4.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 426
		bodyModel[164].setRotationPoint(-12F, -40.5F, -4F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 427
		bodyModel[165].setRotationPoint(-12F, -40.5F, -5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[166].setRotationPoint(-12F, -40.5F, 4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[167].setRotationPoint(-12.5F, -40.6F, -0.5F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[168].setRotationPoint(-12.5F, -41.6F, 0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[169].setRotationPoint(-12.5F, -41.6F, -1.5F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 60
		noseModel[1] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 61
		noseModel[2] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 81
		noseModel[3] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 82
		noseModel[4] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 83
		noseModel[5] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 84
		noseModel[6] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 85
		noseModel[7] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 86
		noseModel[8] = new ModelRendererTurbo(this, 737, 25, textureX, textureY); // Box 87
		noseModel[9] = new ModelRendererTurbo(this, 841, 25, textureX, textureY); // Box 88
		noseModel[10] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 100
		noseModel[11] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 101
		noseModel[12] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 103
		noseModel[13] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 104
		noseModel[14] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 105
		noseModel[15] = new ModelRendererTurbo(this, 681, 33, textureX, textureY); // Box 106
		noseModel[16] = new ModelRendererTurbo(this, 705, 33, textureX, textureY); // Box 107
		noseModel[17] = new ModelRendererTurbo(this, 737, 9, textureX, textureY); // Box 108
		noseModel[18] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 109
		noseModel[19] = new ModelRendererTurbo(this, 777, 9, textureX, textureY); // Box 110
		noseModel[20] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 111
		noseModel[21] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 112
		noseModel[22] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 113
		noseModel[23] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 114
		noseModel[24] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 115
		noseModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 116
		noseModel[26] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 117
		noseModel[27] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 118
		noseModel[28] = new ModelRendererTurbo(this, 865, 9, textureX, textureY); // Box 119
		noseModel[29] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 120
		noseModel[30] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 121
		noseModel[31] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 122
		noseModel[32] = new ModelRendererTurbo(this, 865, 25, textureX, textureY); // Box 125
		noseModel[33] = new ModelRendererTurbo(this, 929, 33, textureX, textureY); // Box 126
		noseModel[34] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 127
		noseModel[35] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 128
		noseModel[36] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 239
		noseModel[37] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 240
		noseModel[38] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 260
		noseModel[39] = new ModelRendererTurbo(this, 617, 97, textureX, textureY); // Box 261
		noseModel[40] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 262
		noseModel[41] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 264
		noseModel[42] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 265
		noseModel[43] = new ModelRendererTurbo(this, 697, 97, textureX, textureY); // Box 266
		noseModel[44] = new ModelRendererTurbo(this, 737, 97, textureX, textureY); // Box 267
		noseModel[45] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 279
		noseModel[46] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 280
		noseModel[47] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 281
		noseModel[48] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 282
		noseModel[49] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 283
		noseModel[50] = new ModelRendererTurbo(this, 681, 97, textureX, textureY); // Box 284
		noseModel[51] = new ModelRendererTurbo(this, 721, 97, textureX, textureY); // Box 285
		noseModel[52] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 286
		noseModel[53] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 287
		noseModel[54] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 288
		noseModel[55] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 289
		noseModel[56] = new ModelRendererTurbo(this, 729, 41, textureX, textureY); // Box 290
		noseModel[57] = new ModelRendererTurbo(this, 529, 105, textureX, textureY); // Box 291
		noseModel[58] = new ModelRendererTurbo(this, 929, 105, textureX, textureY); // Box 292
		noseModel[59] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 293
		noseModel[60] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 294
		noseModel[61] = new ModelRendererTurbo(this, 937, 57, textureX, textureY); // Box 295
		noseModel[62] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 296
		noseModel[63] = new ModelRendererTurbo(this, 665, 81, textureX, textureY); // Box 297
		noseModel[64] = new ModelRendererTurbo(this, 905, 25, textureX, textureY); // Box 298
		noseModel[65] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 301
		noseModel[66] = new ModelRendererTurbo(this, 977, 81, textureX, textureY); // Box 302
		noseModel[67] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 377
		noseModel[68] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 378
		noseModel[69] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 379

		noseModel[0].addShapeBox(0F, 0F, 0F, 7, 10, 12, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 60
		noseModel[0].setRotationPoint(-33F, -27F, -12F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 61
		noseModel[1].setRotationPoint(-33F, -33F, -12F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 81
		noseModel[2].setRotationPoint(-33F, -18F, -12F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 82
		noseModel[3].setRotationPoint(-33F, -36F, -9F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -2F, -1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 83
		noseModel[4].setRotationPoint(-33F, -37F, -6F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, -3F, -1F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 84
		noseModel[5].setRotationPoint(-33F, -38F, -6F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, -3F, -3F, 0F, -1F, -4F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		noseModel[6].setRotationPoint(-33F, -39F, -6F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 6, 6, 11, 0F,0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 86
		noseModel[7].setRotationPoint(-39F, -19F, -11F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 6, 8, 11, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 87
		noseModel[8].setRotationPoint(-39F, -26F, -11F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 6, 7, 11, 0F,0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 88
		noseModel[9].setRotationPoint(-39F, -32F, -11F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 100
		noseModel[10].setRotationPoint(-39F, -35F, -8F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -1F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 1F); // Box 101
		noseModel[11].setRotationPoint(-44F, -21F, -9F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F); // Box 103
		noseModel[12].setRotationPoint(-44F, -25F, -9F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, -3F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -1F); // Box 104
		noseModel[13].setRotationPoint(-44F, -30F, -9F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, -3F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -1F); // Box 105
		noseModel[14].setRotationPoint(-44F, -32F, -7F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -3.5F, -2F, 0F, -1F, -2F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 106
		noseModel[15].setRotationPoint(-39F, -37F, -5F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, -4F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 107
		noseModel[16].setRotationPoint(-44F, -34F, -5F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -3F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 108
		noseModel[17].setRotationPoint(-45F, -31F, -3F);

		noseModel[18].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 109
		noseModel[18].setRotationPoint(-45F, -30F, -4F);

		noseModel[19].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 110
		noseModel[19].setRotationPoint(-45F, -27F, -6F);

		noseModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 111
		noseModel[20].setRotationPoint(-45F, -24F, -6F);

		noseModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 112
		noseModel[21].setRotationPoint(-45F, -29F, -6F);

		noseModel[22].addShapeBox(0F, 0F, 0F, 7, 5, 9, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2.5F, -5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 113
		noseModel[22].setRotationPoint(-33F, -13F, -9F);

		noseModel[23].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 114
		noseModel[23].setRotationPoint(-39F, -15F, -8F);

		noseModel[24].addShapeBox(0F, 0F, 0F, 5, 6, 7, 0F,0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 115
		noseModel[24].setRotationPoint(-44F, -18F, -7F);

		noseModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 1F); // Box 116
		noseModel[25].setRotationPoint(-45F, -21F, -6F);

		noseModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 1F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 117
		noseModel[26].setRotationPoint(-45F, -18F, -5F);

		noseModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 118
		noseModel[27].setRotationPoint(-45F, -19F, -2F);

		noseModel[28].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		noseModel[28].setRotationPoint(-43F, -25F, -0.5F);

		noseModel[29].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		noseModel[29].setRotationPoint(-43F, -25F, -1.5F);

		noseModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 121
		noseModel[30].setRotationPoint(-45F, -25F, -1.5F);

		noseModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 122
		noseModel[31].setRotationPoint(-45F, -25F, -0.5F);

		noseModel[32].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, -4F, -3F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		noseModel[32].setRotationPoint(-32F, -40F, -6F);

		noseModel[33].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, -5F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		noseModel[33].setRotationPoint(-32F, -41F, -4F);

		noseModel[34].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, -2F, 0F, -1F); // Box 127
		noseModel[34].setRotationPoint(-37F, -12F, -2F);

		noseModel[35].addTrapezoid(0F, 0F, 0F, 4, 1, 1, 0F, -0.50F, ModelRendererTurbo.MR_RIGHT); // Box 128
		noseModel[35].setRotationPoint(-39F, -11F, -0.5F);

		noseModel[36].addShapeBox(0F, 0F, 0F, 7, 10, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 239
		noseModel[36].setRotationPoint(-33F, -27F, 0F);

		noseModel[37].addShapeBox(0F, 0F, 0F, 7, 7, 12, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 240
		noseModel[37].setRotationPoint(-33F, -33F, 0F);

		noseModel[38].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F); // Box 260
		noseModel[38].setRotationPoint(-33F, -18F, 0F);

		noseModel[39].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 261
		noseModel[39].setRotationPoint(-33F, -36F, 0F);

		noseModel[40].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, -2F, -1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F); // Box 262
		noseModel[40].setRotationPoint(-33F, -37F, 4F);

		noseModel[41].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -4F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 264
		noseModel[41].setRotationPoint(-33F, -39F, 0F);

		noseModel[42].addShapeBox(0F, 0F, 0F, 6, 6, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F); // Box 265
		noseModel[42].setRotationPoint(-39F, -19F, 0F);

		noseModel[43].addShapeBox(0F, 0F, 0F, 6, 8, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F); // Box 266
		noseModel[43].setRotationPoint(-39F, -26F, 0F);

		noseModel[44].addShapeBox(0F, 0F, 0F, 6, 7, 11, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F); // Box 267
		noseModel[44].setRotationPoint(-39F, -32F, 0F);

		noseModel[45].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F); // Box 279
		noseModel[45].setRotationPoint(-39F, -35F, 0F);

		noseModel[46].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, -1F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -3F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -5F); // Box 280
		noseModel[46].setRotationPoint(-44F, -21F, 3F);

		noseModel[47].addShapeBox(0F, 0F, 0F, 5, 6, 5, 0F,0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -3F); // Box 281
		noseModel[47].setRotationPoint(-44F, -25F, 4F);

		noseModel[48].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, 0F, -1F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, -3F); // Box 282
		noseModel[48].setRotationPoint(-44F, -30F, 3F);

		noseModel[49].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -3F, 0F, 0F, -1F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, -2F); // Box 283
		noseModel[49].setRotationPoint(-44F, -32F, 2F);

		noseModel[50].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -1F, -2F, 0F, -3.5F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 284
		noseModel[50].setRotationPoint(-39F, -37F, 0F);

		noseModel[51].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -4F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -1F); // Box 285
		noseModel[51].setRotationPoint(-44F, -34F, 0F);

		noseModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F); // Box 286
		noseModel[52].setRotationPoint(-45F, -31F, 0F);

		noseModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 287
		noseModel[53].setRotationPoint(-45F, -30F, 2F);

		noseModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 288
		noseModel[54].setRotationPoint(-45F, -27F, 2F);

		noseModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 289
		noseModel[55].setRotationPoint(-45F, -24F, 3F);

		noseModel[56].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F); // Box 290
		noseModel[56].setRotationPoint(-45F, -29F, 2F);

		noseModel[57].addShapeBox(0F, 0F, 0F, 7, 5, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -2.5F, -5F); // Box 291
		noseModel[57].setRotationPoint(-33F, -13F, 0F);

		noseModel[58].addShapeBox(0F, 0F, 0F, 6, 5, 8, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -3F, -4F); // Box 292
		noseModel[58].setRotationPoint(-39F, -15F, 0F);

		noseModel[59].addShapeBox(0F, 0F, 0F, 5, 6, 7, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -4F, -5F); // Box 293
		noseModel[59].setRotationPoint(-44F, -18F, 0F);

		noseModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -4F); // Box 294
		noseModel[60].setRotationPoint(-45F, -21F, 2F);

		noseModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F); // Box 295
		noseModel[61].setRotationPoint(-45F, -18F, 1F);

		noseModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F); // Box 296
		noseModel[62].setRotationPoint(-45F, -19F, 0F);

		noseModel[63].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 297
		noseModel[63].setRotationPoint(-43F, -25F, 0.5F);

		noseModel[64].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 298
		noseModel[64].setRotationPoint(-45F, -25F, 0.5F);

		noseModel[65].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, -4F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 301
		noseModel[65].setRotationPoint(-32F, -40F, 2F);

		noseModel[66].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 302
		noseModel[66].setRotationPoint(-32F, -41F, 2F);

		noseModel[67].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		noseModel[67].setRotationPoint(-43F, -32F, -0.5F);

		noseModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 378
		noseModel[68].setRotationPoint(-44F, -30F, -0.5F);

		noseModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 379
		noseModel[69].setRotationPoint(-40F, -26F, -0.5F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 140
		tailModel[1] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 141
		tailModel[2] = new ModelRendererTurbo(this, 801, 41, textureX, textureY); // Box 142
		tailModel[3] = new ModelRendererTurbo(this, 793, 41, textureX, textureY); // Box 143
		tailModel[4] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 144
		tailModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 145
		tailModel[6] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 146
		tailModel[7] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 147
		tailModel[8] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 148
		tailModel[9] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 149
		tailModel[10] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 150
		tailModel[11] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 151
		tailModel[12] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 154
		tailModel[13] = new ModelRendererTurbo(this, 545, 49, textureX, textureY); // Box 156
		tailModel[14] = new ModelRendererTurbo(this, 585, 49, textureX, textureY); // Box 157
		tailModel[15] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 158
		tailModel[16] = new ModelRendererTurbo(this, 625, 49, textureX, textureY); // Box 159
		tailModel[17] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 160
		tailModel[18] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 161
		tailModel[19] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 162
		tailModel[20] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 163
		tailModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 164
		tailModel[22] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 165
		tailModel[23] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 166
		tailModel[24] = new ModelRendererTurbo(this, 945, 49, textureX, textureY); // Box 167
		tailModel[25] = new ModelRendererTurbo(this, 977, 49, textureX, textureY); // Box 168
		tailModel[26] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 169
		tailModel[27] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 170
		tailModel[28] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 171
		tailModel[29] = new ModelRendererTurbo(this, 841, 49, textureX, textureY); // Box 172
		tailModel[30] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 173
		tailModel[31] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 174
		tailModel[32] = new ModelRendererTurbo(this, 1001, 49, textureX, textureY); // Box 176
		tailModel[33] = new ModelRendererTurbo(this, 577, 49, textureX, textureY); // Box 178
		tailModel[34] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 179
		tailModel[35] = new ModelRendererTurbo(this, 617, 49, textureX, textureY); // Box 180
		tailModel[36] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 181
		tailModel[37] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 183
		tailModel[38] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY); // Box 184
		tailModel[39] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 185
		tailModel[40] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 186
		tailModel[41] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 187
		tailModel[42] = new ModelRendererTurbo(this, 777, 1, textureX, textureY); // Box 188
		tailModel[43] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 189
		tailModel[44] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 190
		tailModel[45] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 192
		tailModel[46] = new ModelRendererTurbo(this, 713, 25, textureX, textureY); // Box 193
		tailModel[47] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 194
		tailModel[48] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 195
		tailModel[49] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 196
		tailModel[50] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 197
		tailModel[51] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 305
		tailModel[52] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 306
		tailModel[53] = new ModelRendererTurbo(this, 257, 113, textureX, textureY); // Box 307
		tailModel[54] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 308
		tailModel[55] = new ModelRendererTurbo(this, 609, 113, textureX, textureY); // Box 309
		tailModel[56] = new ModelRendererTurbo(this, 761, 113, textureX, textureY); // Box 310
		tailModel[57] = new ModelRendererTurbo(this, 801, 113, textureX, textureY); // Box 311
		tailModel[58] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 312
		tailModel[59] = new ModelRendererTurbo(this, 841, 113, textureX, textureY); // Box 313
		tailModel[60] = new ModelRendererTurbo(this, 553, 113, textureX, textureY); // Box 314
		tailModel[61] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 315
		tailModel[62] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 316
		tailModel[63] = new ModelRendererTurbo(this, 953, 113, textureX, textureY); // Box 317
		tailModel[64] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 318
		tailModel[65] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 319
		tailModel[66] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 320
		tailModel[67] = new ModelRendererTurbo(this, 369, 121, textureX, textureY); // Box 321
		tailModel[68] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 322
		tailModel[69] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 323
		tailModel[70] = new ModelRendererTurbo(this, 609, 97, textureX, textureY); // Box 324
		tailModel[71] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 325
		tailModel[72] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 326
		tailModel[73] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 327
		tailModel[74] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 328
		tailModel[75] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 329
		tailModel[76] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 330
		tailModel[77] = new ModelRendererTurbo(this, 513, 121, textureX, textureY); // Box 331
		tailModel[78] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 332
		tailModel[79] = new ModelRendererTurbo(this, 657, 121, textureX, textureY); // Box 333
		tailModel[80] = new ModelRendererTurbo(this, 761, 97, textureX, textureY); // Box 334
		tailModel[81] = new ModelRendererTurbo(this, 689, 121, textureX, textureY); // Box 335
		tailModel[82] = new ModelRendererTurbo(this, 721, 121, textureX, textureY); // Box 336
		tailModel[83] = new ModelRendererTurbo(this, 1001, 97, textureX, textureY); // Box 337
		tailModel[84] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 338
		tailModel[85] = new ModelRendererTurbo(this, 921, 121, textureX, textureY); // Box 339
		tailModel[86] = new ModelRendererTurbo(this, 881, 97, textureX, textureY); // Box 340
		tailModel[87] = new ModelRendererTurbo(this, 577, 121, textureX, textureY); // Box 341
		tailModel[88] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 343
		tailModel[89] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 344
		tailModel[90] = new ModelRendererTurbo(this, 641, 113, textureX, textureY); // Box 345
		tailModel[91] = new ModelRendererTurbo(this, 929, 97, textureX, textureY); // Box 346
		tailModel[92] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 347
		tailModel[93] = new ModelRendererTurbo(this, 553, 9, textureX, textureY); // Box 348
		tailModel[94] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 349
		tailModel[95] = new ModelRendererTurbo(this, 49, 129, textureX, textureY); // Box 350
		tailModel[96] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 352
		tailModel[97] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 353
		tailModel[98] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 354
		tailModel[99] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Box 355
		tailModel[100] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 356
		tailModel[101] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 357
		tailModel[102] = new ModelRendererTurbo(this, 657, 97, textureX, textureY); // Box 373
		tailModel[103] = new ModelRendererTurbo(this, 241, 137, textureX, textureY); // Box 375
		tailModel[104] = new ModelRendererTurbo(this, 361, 137, textureX, textureY); // Box 376

		tailModel[0].addShapeBox(0F, 0F, 0F, 9, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Box 140
		tailModel[0].setRotationPoint(7F, -27F, -12F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 7, 9, 11, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 141
		tailModel[1].setRotationPoint(16F, -27F, -11F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 10, 7, 9, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 142
		tailModel[2].setRotationPoint(23F, -26F, -9F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 143
		tailModel[3].setRotationPoint(33F, -24F, -6F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 9, 6, 12, 0F,0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		tailModel[4].setRotationPoint(7F, -33F, -12F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 11, 0F,0F, 0F, -2F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 145
		tailModel[5].setRotationPoint(16F, -32F, -11F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, -2F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 146
		tailModel[6].setRotationPoint(23F, -30F, -9F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 147
		tailModel[7].setRotationPoint(33F, -27F, -6F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 9, 5, 10, 0F,0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 148
		tailModel[8].setRotationPoint(7F, -37F, -10F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 7, 6, 9, 0F,0F, 0F, -3F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 149
		tailModel[9].setRotationPoint(16F, -36F, -9F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 10, 8, 7, 0F,0F, 0F, -3F, 0F, -6F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 150
		tailModel[10].setRotationPoint(23F, -35F, -7F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 151
		tailModel[11].setRotationPoint(33F, -29F, -4F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 154
		tailModel[12].setRotationPoint(7F, -18F, -12F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 7, 5, 11, 0F,0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 156
		tailModel[13].setRotationPoint(16F, -19F, -11F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 10, 5, 9, 0F,0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 157
		tailModel[14].setRotationPoint(23F, -21F, -9F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -1F, 0F, 0F, -1F); // Box 158
		tailModel[15].setRotationPoint(33F, -22F, -6F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, -3F, -4F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 159
		tailModel[16].setRotationPoint(7F, -14F, -9F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 7, 6, 8, 0F,0F, -3F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -1F, -3F, 0F, -3F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 160
		tailModel[17].setRotationPoint(16F, -17F, -8F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 10, 6, 7, 0F,0F, -3F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, -2F, 0F, -4F, -4F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 161
		tailModel[18].setRotationPoint(23F, -19F, -7F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, -2F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 162
		tailModel[19].setRotationPoint(33F, -21F, -6F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 163
		tailModel[20].setRotationPoint(33F, -19F, -4F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 164
		tailModel[21].setRotationPoint(33F, -30F, -2F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 10, 7, 4, 0F,0F, 0F, -1F, 0F, -6F, -4F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 165
		tailModel[22].setRotationPoint(23F, -36F, -4F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, -2F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 166
		tailModel[23].setRotationPoint(16F, -39F, -6F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 167
		tailModel[24].setRotationPoint(7F, -39F, -6F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F,-2F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		tailModel[25].setRotationPoint(7F, -44F, -5F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,-3F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, -3F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 169
		tailModel[26].setRotationPoint(7F, -46F, -4F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 170
		tailModel[27].setRotationPoint(16F, -42F, -4F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 11, 11, 3, 0F,0F, 0F, -1F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, -3F, -1F, 0F, 0F, 0F, -6F, 0F); // Box 171
		tailModel[28].setRotationPoint(23F, -41F, -3F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 172
		tailModel[29].setRotationPoint(16F, -44F, -3F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 173
		tailModel[30].setRotationPoint(23F, -43F, -3F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,-3F, 0F, -2.5F, 0.25F, 0F, -3F, 0.2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		tailModel[31].setRotationPoint(23F, -46F, -3F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, -1F, 2F, -1F, -1.5F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 176
		tailModel[32].setRotationPoint(16F, -45F, -2F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, -2F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 178
		tailModel[33].setRotationPoint(10F, -47F, -2F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 9, 9, 3, 0F,-3F, 0F, -2.5F, 0F, -3F, -3F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, -2.5F, -0.75F, 0F, -3F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 179
		tailModel[34].setRotationPoint(26F, -55F, -3F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-2F, 0F, -0.5F, -1F, -1.5F, -0.5F, -1F, -1.5F, 0F, -2F, 0F, 0F, 0F, -3F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 180
		tailModel[35].setRotationPoint(29F, -56F, -1F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 6, 15, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		tailModel[36].setRotationPoint(23F, -46F, -15F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 7, 15, 13, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -5F, 0F, -12F, 0F, -3F, -9F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, -3F, -3F); // Box 183
		tailModel[37].setRotationPoint(16F, -46F, -15F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		tailModel[38].setRotationPoint(23F, -56F, -15F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		tailModel[39].setRotationPoint(29F, -55F, -15F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 186
		tailModel[40].setRotationPoint(29F, -58F, -15F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 187
		tailModel[41].setRotationPoint(25F, -58F, -15F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 188
		tailModel[42].setRotationPoint(24F, -58F, -15F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 189
		tailModel[43].setRotationPoint(21F, -56F, -15F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 8, 8, 10, 0F,0F, 0F, -8F, -3F, 0F, -8F, -3F, 0F, 0F, 0F, 1F, 0F, -5F, 1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -8F, -5F, 1F, -9F); // Box 190
		tailModel[44].setRotationPoint(27F, -21F, -14F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 7, 9, 10, 0F,0F, -2F, -6F, -5F, 0F, -8F, -5F, 1F, 0F, 0F, -2F, 0F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -4F, -1F, -9F); // Box 192
		tailModel[45].setRotationPoint(25F, -21F, -14F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		tailModel[46].setRotationPoint(36F, -26F, -3F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 194
		tailModel[47].setRotationPoint(36F, -25F, -4F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		tailModel[48].setRotationPoint(36F, -23F, -4F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		tailModel[49].setRotationPoint(36F, -21F, -4F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		tailModel[50].setRotationPoint(36F, -19F, -3F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 9, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -0.5F, 0F); // Box 305
		tailModel[51].setRotationPoint(7F, -27F, 0F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 7, 9, 11, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 306
		tailModel[52].setRotationPoint(16F, -27F, 0F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 10, 7, 9, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F); // Box 307
		tailModel[53].setRotationPoint(23F, -26F, 0F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 308
		tailModel[54].setRotationPoint(33F, -24F, 3F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 9, 6, 12, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 309
		tailModel[55].setRotationPoint(7F, -33F, 0F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 7, 6, 11, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 310
		tailModel[56].setRotationPoint(16F, -32F, 0F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 10, 6, 9, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F); // Box 311
		tailModel[57].setRotationPoint(23F, -30F, 0F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 312
		tailModel[58].setRotationPoint(33F, -27F, 2F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 9, 5, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 313
		tailModel[59].setRotationPoint(7F, -37F, 0F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 7, 6, 9, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -5F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F); // Box 314
		tailModel[60].setRotationPoint(16F, -36F, 0F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 10, 8, 7, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -5F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F); // Box 315
		tailModel[61].setRotationPoint(23F, -35F, 0F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F); // Box 316
		tailModel[62].setRotationPoint(33F, -29F, 0F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -4F, 0F, 0F, -3F); // Box 317
		tailModel[63].setRotationPoint(7F, -18F, 0F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 7, 5, 11, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, -3F); // Box 318
		tailModel[64].setRotationPoint(16F, -19F, 0F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 10, 5, 9, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -4F, 0F, 0F, -2F); // Box 319
		tailModel[65].setRotationPoint(23F, -21F, 0F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -2F, 0F, 0F, -1F); // Box 320
		tailModel[66].setRotationPoint(33F, -22F, 2F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 9, 5, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -4F, 0F, -1F, -5F); // Box 321
		tailModel[67].setRotationPoint(7F, -14F, 0F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 7, 6, 8, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, -3F, 0F, -1F, -3F); // Box 322
		tailModel[68].setRotationPoint(16F, -17F, 0F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 10, 6, 7, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -4F, 0F, -1F, -2F); // Box 323
		tailModel[69].setRotationPoint(23F, -19F, 0F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 3, 4, 4, 0F,0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F); // Box 324
		tailModel[70].setRotationPoint(33F, -21F, 2F);

		tailModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -1F, -1F); // Box 325
		tailModel[71].setRotationPoint(33F, -19F, 0F);

		tailModel[72].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 326
		tailModel[72].setRotationPoint(33F, -30F, 0F);

		tailModel[73].addShapeBox(0F, 0F, 0F, 10, 7, 4, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -4F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, 0F); // Box 327
		tailModel[73].setRotationPoint(23F, -36F, 0F);

		tailModel[74].addShapeBox(0F, 0F, 0F, 7, 4, 6, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F); // Box 328
		tailModel[74].setRotationPoint(16F, -39F, 0F);

		tailModel[75].addShapeBox(0F, 0F, 0F, 9, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 329
		tailModel[75].setRotationPoint(7F, -39F, 0F);

		tailModel[76].addShapeBox(0F, 0F, 0F, 9, 5, 5, 0F,-2F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 330
		tailModel[76].setRotationPoint(7F, -44F, 0F);

		tailModel[77].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,-3F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, -3F, 0F, -2F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -2F, 0F); // Box 331
		tailModel[77].setRotationPoint(7F, -46F, 0F);

		tailModel[78].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, 0F); // Box 332
		tailModel[78].setRotationPoint(16F, -42F, 0F);

		tailModel[79].addShapeBox(0F, 0F, 0F, 11, 11, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, 0F, 0F, -1F, 0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, -6F, 0F); // Box 333
		tailModel[79].setRotationPoint(23F, -41F, 0F);

		tailModel[80].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 334
		tailModel[80].setRotationPoint(16F, -44F, 0F);

		tailModel[81].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, 0F, 0F, -1F); // Box 335
		tailModel[81].setRotationPoint(23F, -43F, 0F);

		tailModel[82].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,-3F, 0F, 0F, 0.2F, 0F, 0F, 0.25F, 0F, -3F, -3F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F); // Box 336
		tailModel[82].setRotationPoint(23F, -46F, 0F);

		tailModel[83].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, -1.5F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F); // Box 337
		tailModel[83].setRotationPoint(16F, -45F, 0F);

		tailModel[84].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 338
		tailModel[84].setRotationPoint(10F, -47F, 0F);

		tailModel[85].addShapeBox(0F, 0F, 0F, 9, 9, 3, 0F,-3F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, -3F, 0F, -2.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -3F, 0F, 0F, -2.5F); // Box 339
		tailModel[85].setRotationPoint(26F, -55F, 0F);

		tailModel[86].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,-2F, 0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, -0.5F, -2F, 0F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -0.5F); // Box 340
		tailModel[86].setRotationPoint(29F, -56F, 0F);

		tailModel[87].addShapeBox(0F, 0F, 0F, 6, 15, 13, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 341
		tailModel[87].setRotationPoint(23F, -46F, 2F);

		tailModel[88].addShapeBox(0F, 0F, 0F, 7, 15, 13, 0F,-5F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -3F, -9F); // Box 343
		tailModel[88].setRotationPoint(16F, -46F, 2F);

		tailModel[89].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		tailModel[89].setRotationPoint(23F, -56F, 14F);

		tailModel[90].addShapeBox(0F, 0F, 0F, 5, 9, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 345
		tailModel[90].setRotationPoint(29F, -55F, 14F);

		tailModel[91].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 346
		tailModel[91].setRotationPoint(29F, -58F, 14F);

		tailModel[92].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 347
		tailModel[92].setRotationPoint(25F, -58F, 14F);

		tailModel[93].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 348
		tailModel[93].setRotationPoint(24F, -58F, 14F);

		tailModel[94].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 349
		tailModel[94].setRotationPoint(21F, -56F, 14F);

		tailModel[95].addShapeBox(0F, 0F, 0F, 8, 8, 10, 0F,0F, 1F, 0F, -3F, 0F, 0F, -3F, 0F, -8F, 0F, 0F, -8F, -5F, 1F, -9F, 0F, 0.5F, -8F, 0F, 0.5F, -1F, -5F, 1F, 0F); // Box 350
		tailModel[95].setRotationPoint(27F, -21F, 4F);

		tailModel[96].addShapeBox(0F, 0F, 0F, 7, 9, 10, 0F,0F, -2F, 0F, -5F, 1F, 0F, -5F, 0F, -8F, 0F, -2F, -6F, -4F, -1F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, -4F, -1F, 0F); // Box 352
		tailModel[96].setRotationPoint(25F, -21F, 4F);

		tailModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		tailModel[97].setRotationPoint(36F, -26F, 0F);

		tailModel[98].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		tailModel[98].setRotationPoint(36F, -25F, 2F);

		tailModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		tailModel[99].setRotationPoint(36F, -23F, 3F);

		tailModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 356
		tailModel[100].setRotationPoint(36F, -21F, 2F);

		tailModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 357
		tailModel[101].setRotationPoint(36F, -19F, 0F);

		tailModel[102].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		tailModel[102].setRotationPoint(33F, -18F, -0.5F);

		tailModel[103].addShapeBox(0F, 0F, 0F, 19, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 375
		tailModel[103].setRotationPoint(26F, -10F, -0.5F);

		tailModel[104].addShapeBox(0F, 0F, 0F, 13, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 376
		tailModel[104].setRotationPoint(20F, -16F, -0.5F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 198
		leftWingModel[1] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 199
		leftWingModel[2] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 205

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 24, 5, 26, 0F,-15F, -2F, 0F, 0F, -2F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -10F, -2F, 0F, 0F, -2F, 0F); // Box 198
		leftWingModel[0].setRotationPoint(-20F, -19F, -38F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 19, 5, 26, 0F,-10F, -2F, 0F, -2F, -3F, 0F, -10F, -1F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -2F, -1F, 0F, -10F, -3F, 0F, 0F, -2F, 0F); // Box 199
		leftWingModel[1].setRotationPoint(-6F, -19F, -38F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 21, 5, 26, 0F,-17F, -3F, 0F, 0F, -2F, 0F, -15F, 0F, 0F, 0F, -1F, 0F, -17F, -1F, 0F, 0F, 0F, 0F, -15F, -2F, 0F, 0F, -3F, 0F); // Box 205
		leftWingModel[2].setRotationPoint(-26F, -19F, -38F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 777, 129, textureX, textureY); // Box 358
		rightWingModel[1] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 359
		rightWingModel[2] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 365

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 24, 5, 26, 0F,0F, 0F, 0F, -10F, 0F, 0F, 0F, -2F, 0F, -15F, -2F, 0F, 0F, -2F, 0F, -10F, -2F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 358
		rightWingModel[0].setRotationPoint(-20F, -19F, 12F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 19, 5, 26, 0F,0F, 0F, 0F, -10F, -1F, 0F, -2F, -3F, 0F, -10F, -2F, 0F, 0F, -2F, 0F, -10F, -3F, 0F, -2F, -1F, 0F, -10F, 0F, 0F); // Box 359
		rightWingModel[1].setRotationPoint(-6F, -19F, 12F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 21, 5, 26, 0F,0F, -1F, 0F, -15F, 0F, 0F, 0F, -2F, 0F, -17F, -3F, 0F, 0F, -3F, 0F, -15F, -2F, 0F, 0F, 0F, 0F, -17F, -1F, 0F); // Box 365
		rightWingModel[2].setRotationPoint(-26F, -19F, 12F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 182
		yawFlapModel[1] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 191
		yawFlapModel[2] = new ModelRendererTurbo(this, 529, 121, textureX, textureY); // Box 342
		yawFlapModel[3] = new ModelRendererTurbo(this, 89, 129, textureX, textureY); // Box 351
		yawFlapModel[4] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 374
		yawFlapModel[5] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 175
		yawFlapModel[6] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 176
		yawFlapModel[7] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 177
		yawFlapModel[8] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 178
		yawFlapModel[9] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 179

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 5, 15, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -1F, 3F, -13F, -1F, 3F, 1F, 0F, 0F, 0F); // Box 182
		yawFlapModel[0].setRotationPoint(29F, -46F, -15F);

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 5, 8, 10, 0F,0F, 0F, -8F, -2F, 0F, -10F, -2F, 0F, 1F, 0F, 0F, 0F, -3F, 0.5F, -1F, 0F, 0F, -2F, 0F, 0F, -7F, -3F, 0.5F, -8F); // Box 191
		yawFlapModel[1].setRotationPoint(32F, -21F, -14F);

		yawFlapModel[2].addShapeBox(0F, 0F, 0F, 5, 15, 13, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 1F, -1F, 3F, -13F, 0F, 0F, -12F); // Box 342
		yawFlapModel[2].setRotationPoint(29F, -46F, 2F);

		yawFlapModel[3].addShapeBox(0F, 0F, 0F, 5, 8, 10, 0F,0F, 0F, 0F, -2F, 0F, 1F, -2F, 0F, -10F, 0F, 0F, -8F, -3F, 0.5F, -8F, 0F, 0F, -7F, 0F, 0F, -2F, -3F, 0.5F, -1F); // Box 351
		yawFlapModel[3].setRotationPoint(32F, -21F, 4F);

		yawFlapModel[4].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		yawFlapModel[4].setRotationPoint(37F, -18F, -0.5F);

		yawFlapModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		yawFlapModel[5].setRotationPoint(-10F, -31F, -0.5F);

		yawFlapModel[6].addShapeBox(-1F, -3F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 176
		yawFlapModel[6].setRotationPoint(-10F, -31F, -0.5F);

		yawFlapModel[7].addShapeBox(-1F, -4F, -0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		yawFlapModel[7].setRotationPoint(-10F, -31F, -0.5F);

		yawFlapModel[8].addShapeBox(-1F, -5F, -0.5F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 178
		yawFlapModel[8].setRotationPoint(-10F, -31F, -0.5F);

		yawFlapModel[9].addShapeBox(-0.5F, -4.5F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		yawFlapModel[9].setRotationPoint(-10F, -31F, -0.5F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 657, 65, textureX, textureY); // Box 200

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 26, 0F,-8F, -2F, 0F, 0F, -3F, 0F, -7F, -0.5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, -7F, -2.5F, 0F, 0F, -2F, 0F); // Box 200
		pitchFlapLeftWingModel[0].setRotationPoint(3F, -18F, -38F);
	}

	private void initpitchFlapRightWingModel_1()
	{
		pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 697, 129, textureX, textureY); // Box 360

		pitchFlapRightWingModel[0].addShapeBox(0F, 0F, 0F, 11, 3, 26, 0F,0F, 0F, 0F, -7F, -0.5F, 0F, 0F, -3F, 0F, -8F, -2F, 0F, 0F, -2F, 0F, -7F, -2.5F, 0F, 0F, 0F, 0F, -8F, 0F, 0F); // Box 360
		pitchFlapRightWingModel[0].setRotationPoint(3F, -18F, 12F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 76
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 77
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 78

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 15, 19, 4, 0F,-14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyDoorOpenModel[0].setRotationPoint(-34F, -47F, -2F);

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyDoorOpenModel[1].setRotationPoint(-20F, -49F, -2F);

		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -2F); // Box 78
		bodyDoorOpenModel[2].setRotationPoint(-25F, -49F, -2F);
	}

	private void initleftWingPos1Model_1()
	{
		leftWingPos1Model[0] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 201
		leftWingPos1Model[1] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 202
		leftWingPos1Model[2] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 203
		leftWingPos1Model[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 204
		leftWingPos1Model[4] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 206
		leftWingPos1Model[5] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 207
		leftWingPos1Model[6] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 208
		leftWingPos1Model[7] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 209
		leftWingPos1Model[8] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 211
		leftWingPos1Model[9] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 212
		leftWingPos1Model[10] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Box 213

		leftWingPos1Model[0].addShapeBox(16F, 1F, -24F, 11, 4, 24, 0F,-7F, -2F, 0F, -2F, -3F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -2F, -1F, 0F, -8F, -3F, 0F, 0F, -3F, 0F); // Box 201
		leftWingPos1Model[0].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[1].addShapeBox(9F, 0F, -24F, 14, 5, 24, 0F,-9F, -3F, 0F, 0F, -3F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 0F, -2F, 0F); // Box 202
		leftWingPos1Model[1].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[2].addShapeBox(0F, 0F, -24F, 18, 5, 24, 0F,-15F, -3F, 0F, 0F, -3F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, 0F, -2F, 0F); // Box 203
		leftWingPos1Model[2].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[3].addShapeBox(-4F, 0F, -24F, 19, 5, 24, 0F,-17F, -4F, 0F, 0F, -3F, 0F, -15F, 0F, 0F, 0F, -1F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -15F, -2F, 0F, 0F, -3F, 0F); // Box 204
		leftWingPos1Model[3].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[4].addShapeBox(15F, 3F, -26F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		leftWingPos1Model[4].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[5].addShapeBox(13F, 3F, -26F, 2, 2, 2, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		leftWingPos1Model[5].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[6].addShapeBox(23F, 3F, -26F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 208
		leftWingPos1Model[6].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[7].addShapeBox(-7F, 3F, -25.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		leftWingPos1Model[7].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[8].addShapeBox(-5F, 2F, -25.5F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 211
		leftWingPos1Model[8].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[9].addShapeBox(16F, -11F, -24F, 14, 14, 2, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 212
		leftWingPos1Model[9].setRotationPoint(-5F, -17F, -38F);

		leftWingPos1Model[10].addShapeBox(24F, -11F, -24F, 8, 14, 2, 0F,-6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -6F, 0F, -1F, 0F, 0F, -1F, -3F, -1F, -1F, -3F, -1F, 0F, 0F, 0F, 0F); // Box 213
		leftWingPos1Model[10].setRotationPoint(-5F, -17F, -38F);
	}

	private void initleftWingPos2Model_1()
	{
		leftWingPos2Model[0] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 462
		leftWingPos2Model[1] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 463
		leftWingPos2Model[2] = new ModelRendererTurbo(this, 857, 65, textureX, textureY); // Box 464
		leftWingPos2Model[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 465
		leftWingPos2Model[4] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 466
		leftWingPos2Model[5] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 467
		leftWingPos2Model[6] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 468
		leftWingPos2Model[7] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 469
		leftWingPos2Model[8] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 470
		leftWingPos2Model[9] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 471
		leftWingPos2Model[10] = new ModelRendererTurbo(this, 713, 65, textureX, textureY); // Box 472

		leftWingPos2Model[0].addShapeBox(16F, 1F, -24F, 11, 4, 24, 0F,-7F, -2F, 0F, -2F, -3F, 0F, -8F, -1F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -2F, -1F, 0F, -8F, -3F, 0F, 0F, -3F, 0F); // Box 462
		leftWingPos2Model[0].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[0].rotateAngleX = -1.57079633F;

		leftWingPos2Model[1].addShapeBox(9F, 0F, -24F, 14, 5, 24, 0F,-9F, -3F, 0F, 0F, -3F, 0F, -7F, -1F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, 0F, -2F, 0F); // Box 463
		leftWingPos2Model[1].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[1].rotateAngleX = -1.57079633F;

		leftWingPos2Model[2].addShapeBox(0F, 0F, -24F, 18, 5, 24, 0F,-15F, -3F, 0F, 0F, -3F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, -9F, -2F, 0F, 0F, -2F, 0F); // Box 464
		leftWingPos2Model[2].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[2].rotateAngleX = -1.57079633F;

		leftWingPos2Model[3].addShapeBox(-4F, 0F, -24F, 19, 5, 24, 0F,-17F, -4F, 0F, 0F, -3F, 0F, -15F, 0F, 0F, 0F, -1F, 0F, -17F, 0F, 0F, 0F, 0F, 0F, -15F, -2F, 0F, 0F, -3F, 0F); // Box 465
		leftWingPos2Model[3].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[3].rotateAngleX = -1.57079633F;

		leftWingPos2Model[4].addShapeBox(15F, 3F, -26F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		leftWingPos2Model[4].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[4].rotateAngleX = -1.57079633F;

		leftWingPos2Model[5].addShapeBox(13F, 3F, -26F, 2, 2, 2, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 467
		leftWingPos2Model[5].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[5].rotateAngleX = -1.57079633F;

		leftWingPos2Model[6].addShapeBox(23F, 3F, -26F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 468
		leftWingPos2Model[6].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[6].rotateAngleX = -1.57079633F;

		leftWingPos2Model[7].addShapeBox(-7F, 3F, -25.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		leftWingPos2Model[7].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[7].rotateAngleX = -1.57079633F;

		leftWingPos2Model[8].addShapeBox(-5F, 2F, -25.5F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		leftWingPos2Model[8].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[8].rotateAngleX = -1.57079633F;

		leftWingPos2Model[9].addShapeBox(16F, -11F, -24F, 14, 14, 2, 0F,-11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -11F, 0F, -1F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F); // Box 471
		leftWingPos2Model[9].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[9].rotateAngleX = -1.57079633F;

		leftWingPos2Model[10].addShapeBox(24F, -11F, -24F, 8, 14, 2, 0F,-6F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -6F, 0F, -1F, 0F, 0F, -1F, -3F, -1F, -1F, -3F, -1F, 0F, 0F, 0F, 0F); // Box 472
		leftWingPos2Model[10].setRotationPoint(-5F, -17F, -38F);
		leftWingPos2Model[10].rotateAngleX = -1.57079633F;
	}

	private void initrightWingPos1Model_1()
	{
		rightWingPos1Model[0] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 361
		rightWingPos1Model[1] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 362
		rightWingPos1Model[2] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 363
		rightWingPos1Model[3] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 364
		rightWingPos1Model[4] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 366
		rightWingPos1Model[5] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 367
		rightWingPos1Model[6] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 368
		rightWingPos1Model[7] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 369
		rightWingPos1Model[8] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 370
		rightWingPos1Model[9] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 371
		rightWingPos1Model[10] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 372

		rightWingPos1Model[0].addShapeBox(16F, 1F, 0F, 11, 4, 24, 0F,0F, 0F, 0F, -8F, -1F, 0F, -2F, -3F, 0F, -7F, -2F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, -2F, -1F, 0F, -7F, 0F, 0F); // Box 361
		rightWingPos1Model[0].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[1].addShapeBox(9F, 0F, 0F, 14, 5, 24, 0F,0F, 0F, 0F, -7F, -1F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, 0F, -2F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 362
		rightWingPos1Model[1].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[2].addShapeBox(0F, 0F, 0F, 18, 5, 24, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, -15F, -3F, 0F, 0F, -2F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 363
		rightWingPos1Model[2].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[3].addShapeBox(-4F, 0F, 0F, 19, 5, 24, 0F,0F, -1F, 0F, -15F, 0F, 0F, 0F, -3F, 0F, -17F, -4F, 0F, 0F, -3F, 0F, -15F, -2F, 0F, 0F, 0F, 0F, -17F, 0F, 0F); // Box 364
		rightWingPos1Model[3].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[4].addShapeBox(15F, 3F, 24F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		rightWingPos1Model[4].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[5].addShapeBox(13F, 3F, 24F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 367
		rightWingPos1Model[5].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[6].addShapeBox(23F, 3F, 24F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 368
		rightWingPos1Model[6].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[7].addShapeBox(-7F, 3F, 24.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		rightWingPos1Model[7].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[8].addShapeBox(-5F, 2F, 24.5F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		rightWingPos1Model[8].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[9].addShapeBox(16F, -11F, 22F, 14, 14, 2, 0F,-11F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F); // Box 371
		rightWingPos1Model[9].setRotationPoint(-5F, -17F, 38F);

		rightWingPos1Model[10].addShapeBox(24F, -11F, 22F, 8, 14, 2, 0F,-6F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, -1F, 0F, 0F, -1F); // Box 372
		rightWingPos1Model[10].setRotationPoint(-5F, -17F, 38F);
	}

	private void initrightWingPos2Model_1()
	{
		rightWingPos2Model[0] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 451
		rightWingPos2Model[1] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 452
		rightWingPos2Model[2] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 453
		rightWingPos2Model[3] = new ModelRendererTurbo(this, 593, 137, textureX, textureY); // Box 454
		rightWingPos2Model[4] = new ModelRendererTurbo(this, 953, 105, textureX, textureY); // Box 455
		rightWingPos2Model[5] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 456
		rightWingPos2Model[6] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 457
		rightWingPos2Model[7] = new ModelRendererTurbo(this, 857, 129, textureX, textureY); // Box 458
		rightWingPos2Model[8] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 459
		rightWingPos2Model[9] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 460
		rightWingPos2Model[10] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 461

		rightWingPos2Model[0].addShapeBox(16F, 1F, 0F, 11, 4, 24, 0F,0F, 0F, 0F, -8F, -1F, 0F, -2F, -3F, 0F, -7F, -2F, 0F, 0F, -3F, 0F, -8F, -3F, 0F, -2F, -1F, 0F, -7F, 0F, 0F); // Box 451
		rightWingPos2Model[0].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[0].rotateAngleX = 1.57079633F;

		rightWingPos2Model[1].addShapeBox(9F, 0F, 0F, 14, 5, 24, 0F,0F, 0F, 0F, -7F, -1F, 0F, 0F, -3F, 0F, -9F, -3F, 0F, 0F, -2F, 0F, -7F, -3F, 0F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 452
		rightWingPos2Model[1].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[1].rotateAngleX = 1.57079633F;

		rightWingPos2Model[2].addShapeBox(0F, 0F, 0F, 18, 5, 24, 0F,0F, 0F, 0F, -9F, 0F, 0F, 0F, -3F, 0F, -15F, -3F, 0F, 0F, -2F, 0F, -9F, -2F, 0F, 0F, 0F, 0F, -15F, 0F, 0F); // Box 453
		rightWingPos2Model[2].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[2].rotateAngleX = 1.57079633F;

		rightWingPos2Model[3].addShapeBox(-4F, 0F, 0F, 19, 5, 24, 0F,0F, -1F, 0F, -15F, 0F, 0F, 0F, -3F, 0F, -17F, -4F, 0F, 0F, -3F, 0F, -15F, -2F, 0F, 0F, 0F, 0F, -17F, 0F, 0F); // Box 454
		rightWingPos2Model[3].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[3].rotateAngleX = 1.57079633F;

		rightWingPos2Model[4].addShapeBox(15F, 3F, 24F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 455
		rightWingPos2Model[4].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[4].rotateAngleX = 1.57079633F;

		rightWingPos2Model[5].addShapeBox(13F, 3F, 24F, 2, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 456
		rightWingPos2Model[5].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[5].rotateAngleX = 1.57079633F;

		rightWingPos2Model[6].addShapeBox(23F, 3F, 24F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Box 457
		rightWingPos2Model[6].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[6].rotateAngleX = 1.57079633F;

		rightWingPos2Model[7].addShapeBox(-7F, 3F, 24.5F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 458
		rightWingPos2Model[7].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[7].rotateAngleX = 1.57079633F;

		rightWingPos2Model[8].addShapeBox(-5F, 2F, 24.5F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 459
		rightWingPos2Model[8].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[8].rotateAngleX = 1.57079633F;

		rightWingPos2Model[9].addShapeBox(16F, -11F, 22F, 14, 14, 2, 0F,-11F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, -1F); // Box 460
		rightWingPos2Model[9].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[9].rotateAngleX = 1.57079633F;

		rightWingPos2Model[10].addShapeBox(24F, -11F, 22F, 8, 14, 2, 0F,-6F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -3F, -1F, -1F, 0F, 0F, -1F); // Box 461
		rightWingPos2Model[10].setRotationPoint(-5F, -17F, 38F);
		rightWingPos2Model[10].rotateAngleX = 1.57079633F;
	}
}