//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Potez631
// Model Creator: 
// Created on: 05.02.2021 - 18:59:13
// Last changed on: 05.02.2021 - 18:59:13

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPotez631 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelPotez631() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[124];
		noseModel = new ModelRendererTurbo[18];
		tailModel = new ModelRendererTurbo[20];
		leftWingModel = new ModelRendererTurbo[49];
		rightWingModel = new ModelRendererTurbo[49];
		yawFlapModel = new ModelRendererTurbo[2];
		pitchFlapLeftModel = new ModelRendererTurbo[6];
		pitchFlapRightModel = new ModelRendererTurbo[2];
		pitchFlapLeftWingModel = new ModelRendererTurbo[1];
		tailWheelModel = new ModelRendererTurbo[8];
		leftWingWheelModel = new ModelRendererTurbo[14];
		rightWingWheelModel = new ModelRendererTurbo[8];

		initbodyModel_1();
		initnoseModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initpitchFlapLeftWingModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 10
		bodyModel[1] = new ModelRendererTurbo(this, 609, 1, textureX, textureY); // Box 12
		bodyModel[2] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 1361, 1, textureX, textureY); // Box 19
		bodyModel[4] = new ModelRendererTurbo(this, 2009, 17, textureX, textureY); // Box 86
		bodyModel[5] = new ModelRendererTurbo(this, 817, 41, textureX, textureY); // Box 87
		bodyModel[6] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 88
		bodyModel[7] = new ModelRendererTurbo(this, 1481, 41, textureX, textureY); // Box 111
		bodyModel[8] = new ModelRendererTurbo(this, 1601, 41, textureX, textureY); // Box 112
		bodyModel[9] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 113
		bodyModel[10] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 115
		bodyModel[11] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 116
		bodyModel[12] = new ModelRendererTurbo(this, 1073, 25, textureX, textureY); // Box 117
		bodyModel[13] = new ModelRendererTurbo(this, 1089, 25, textureX, textureY); // Box 118
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 120
		bodyModel[15] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 121
		bodyModel[16] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 122
		bodyModel[17] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 124
		bodyModel[18] = new ModelRendererTurbo(this, 1065, 1, textureX, textureY); // Box 125
		bodyModel[19] = new ModelRendererTurbo(this, 1233, 1, textureX, textureY); // Box 126
		bodyModel[20] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 127
		bodyModel[21] = new ModelRendererTurbo(this, 1201, 25, textureX, textureY); // Box 128
		bodyModel[22] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 129
		bodyModel[23] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 130
		bodyModel[24] = new ModelRendererTurbo(this, 513, 33, textureX, textureY); // Box 131
		bodyModel[25] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 132
		bodyModel[26] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 133
		bodyModel[27] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Box 134
		bodyModel[28] = new ModelRendererTurbo(this, 1385, 9, textureX, textureY); // Box 135
		bodyModel[29] = new ModelRendererTurbo(this, 1409, 9, textureX, textureY); // Box 136
		bodyModel[30] = new ModelRendererTurbo(this, 529, 33, textureX, textureY); // Box 137
		bodyModel[31] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 138
		bodyModel[32] = new ModelRendererTurbo(this, 601, 33, textureX, textureY); // Box 139
		bodyModel[33] = new ModelRendererTurbo(this, 1057, 33, textureX, textureY); // Box 140
		bodyModel[34] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 142
		bodyModel[35] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 143
		bodyModel[36] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 153
		bodyModel[37] = new ModelRendererTurbo(this, 1065, 41, textureX, textureY); // Box 158
		bodyModel[38] = new ModelRendererTurbo(this, 1121, 41, textureX, textureY); // Box 159
		bodyModel[39] = new ModelRendererTurbo(this, 1153, 41, textureX, textureY); // Box 160
		bodyModel[40] = new ModelRendererTurbo(this, 1185, 41, textureX, textureY); // Box 161
		bodyModel[41] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 162
		bodyModel[42] = new ModelRendererTurbo(this, 1241, 1, textureX, textureY); // Box 163
		bodyModel[43] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Box 164
		bodyModel[44] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 165
		bodyModel[45] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 174
		bodyModel[46] = new ModelRendererTurbo(this, 1265, 25, textureX, textureY); // Box 175
		bodyModel[47] = new ModelRendererTurbo(this, 1209, 33, textureX, textureY); // Box 176
		bodyModel[48] = new ModelRendererTurbo(this, 1385, 33, textureX, textureY); // Box 177
		bodyModel[49] = new ModelRendererTurbo(this, 1401, 33, textureX, textureY); // Box 178
		bodyModel[50] = new ModelRendererTurbo(this, 1449, 9, textureX, textureY); // Box 179
		bodyModel[51] = new ModelRendererTurbo(this, 1473, 9, textureX, textureY); // Box 180
		bodyModel[52] = new ModelRendererTurbo(this, 1545, 9, textureX, textureY); // Box 181
		bodyModel[53] = new ModelRendererTurbo(this, 1449, 33, textureX, textureY); // Box 182
		bodyModel[54] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 183
		bodyModel[55] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 184
		bodyModel[56] = new ModelRendererTurbo(this, 1833, 9, textureX, textureY); // Box 185
		bodyModel[57] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 186
		bodyModel[58] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 187
		bodyModel[59] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 188
		bodyModel[60] = new ModelRendererTurbo(this, 1745, 33, textureX, textureY); // Box 189
		bodyModel[61] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 190
		bodyModel[62] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 191
		bodyModel[63] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 192
		bodyModel[64] = new ModelRendererTurbo(this, 1481, 17, textureX, textureY); // Box 193
		bodyModel[65] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 194
		bodyModel[66] = new ModelRendererTurbo(this, 1593, 17, textureX, textureY); // Box 195
		bodyModel[67] = new ModelRendererTurbo(this, 2033, 17, textureX, textureY); // Box 196
		bodyModel[68] = new ModelRendererTurbo(this, 1289, 25, textureX, textureY); // Box 197
		bodyModel[69] = new ModelRendererTurbo(this, 1825, 33, textureX, textureY); // Box 198
		bodyModel[70] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 199
		bodyModel[71] = new ModelRendererTurbo(this, 1985, 41, textureX, textureY); // Box 206
		bodyModel[72] = new ModelRendererTurbo(this, 1433, 49, textureX, textureY); // Box 207
		bodyModel[73] = new ModelRendererTurbo(this, 1817, 49, textureX, textureY); // Box 210
		bodyModel[74] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 211
		bodyModel[75] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 212
		bodyModel[76] = new ModelRendererTurbo(this, 1473, 57, textureX, textureY); // Box 213
		bodyModel[77] = new ModelRendererTurbo(this, 177, 27, textureX, textureY); // Box 214
		bodyModel[78] = new ModelRendererTurbo(this, 1305, 41, textureX, textureY); // Box 215
		bodyModel[79] = new ModelRendererTurbo(this, 1785, 41, textureX, textureY); // Box 216
		bodyModel[80] = new ModelRendererTurbo(this, 1857, 49, textureX, textureY); // Box 218
		bodyModel[81] = new ModelRendererTurbo(this, 641, 49, textureX, textureY); // Box 221
		bodyModel[82] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 223
		bodyModel[83] = new ModelRendererTurbo(this, 1905, 1, textureX, textureY); // Box 224
		bodyModel[84] = new ModelRendererTurbo(this, 1345, 41, textureX, textureY); // Box 273
		bodyModel[85] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 275
		bodyModel[86] = new ModelRendererTurbo(this, 1337, 49, textureX, textureY); // Box 276
		bodyModel[87] = new ModelRendererTurbo(this, 1385, 49, textureX, textureY); // Box 277
		bodyModel[88] = new ModelRendererTurbo(this, 1721, 65, textureX, textureY); // Box 278
		bodyModel[89] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 287
		bodyModel[90] = new ModelRendererTurbo(this, 929, 41, textureX, textureY); // Box 288
		bodyModel[91] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 289
		bodyModel[92] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 290
		bodyModel[93] = new ModelRendererTurbo(this, 1145, 41, textureX, textureY); // Box 291
		bodyModel[94] = new ModelRendererTurbo(this, 1177, 41, textureX, textureY); // Box 292
		bodyModel[95] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 293
		bodyModel[96] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 294
		bodyModel[97] = new ModelRendererTurbo(this, 1257, 41, textureX, textureY); // Box 295
		bodyModel[98] = new ModelRendererTurbo(this, 689, 49, textureX, textureY); // Box 296
		bodyModel[99] = new ModelRendererTurbo(this, 705, 49, textureX, textureY); // Box 297
		bodyModel[100] = new ModelRendererTurbo(this, 1409, 49, textureX, textureY); // Box 298
		bodyModel[101] = new ModelRendererTurbo(this, 721, 49, textureX, textureY); // Box 299
		bodyModel[102] = new ModelRendererTurbo(this, 1425, 49, textureX, textureY); // Box 300
		bodyModel[103] = new ModelRendererTurbo(this, 1721, 49, textureX, textureY); // Box 301
		bodyModel[104] = new ModelRendererTurbo(this, 1737, 49, textureX, textureY); // Box 302
		bodyModel[105] = new ModelRendererTurbo(this, 1673, 81, textureX, textureY); // Box 322
		bodyModel[106] = new ModelRendererTurbo(this, 1801, 81, textureX, textureY); // Box 323
		bodyModel[107] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 324
		bodyModel[108] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 326
		bodyModel[109] = new ModelRendererTurbo(this, 1881, 49, textureX, textureY); // Box 327
		bodyModel[110] = new ModelRendererTurbo(this, 1969, 49, textureX, textureY); // Box 328
		bodyModel[111] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 329
		bodyModel[112] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 330
		bodyModel[113] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 331
		bodyModel[114] = new ModelRendererTurbo(this, 1977, 81, textureX, textureY); // Box 332
		bodyModel[115] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 342
		bodyModel[116] = new ModelRendererTurbo(this, 1585, 73, textureX, textureY); // Box 343
		bodyModel[117] = new ModelRendererTurbo(this, 2009, 81, textureX, textureY); // Box 344
		bodyModel[118] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 345
		bodyModel[119] = new ModelRendererTurbo(this, 1425, 89, textureX, textureY); // Box 346
		bodyModel[120] = new ModelRendererTurbo(this, 1689, 89, textureX, textureY); // Box 347
		bodyModel[121] = new ModelRendererTurbo(this, 1721, 89, textureX, textureY); // Box 348
		bodyModel[122] = new ModelRendererTurbo(this, 1801, 89, textureX, textureY); // Box 349
		bodyModel[123] = new ModelRendererTurbo(this, 1841, 89, textureX, textureY); // Box 350

		bodyModel[0].addBox(0F, 0F, 0F, 55, 5, 1, 0F); // Box 10
		bodyModel[0].setRotationPoint(-71F, -39F, 7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 55, 9, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[1].setRotationPoint(-71F, -34F, 1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 55, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 18
		bodyModel[2].setRotationPoint(-71F, -34F, -8F);

		bodyModel[3].addBox(0F, 0F, 0F, 55, 5, 1, 0F); // Box 19
		bodyModel[3].setRotationPoint(-71F, -39F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F,0F, -3F, -4F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -3F, -3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[4].setRotationPoint(-22F, -45F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 49, 3, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[5].setRotationPoint(-71F, -42F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 6, 8, 0F,0F, -3F, -3F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, -3F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 88
		bodyModel[6].setRotationPoint(-22F, -45F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 49, 3, 8, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[7].setRotationPoint(-71F, -42F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 49, 3, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 112
		bodyModel[8].setRotationPoint(-71F, -42F, -8F);

		bodyModel[9].addBox(0F, 0F, 0F, 40, 1, 1, 0F); // Box 113
		bodyModel[9].setRotationPoint(-70F, -49F, 2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 115
		bodyModel[10].setRotationPoint(-70F, -49F, 2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 116
		bodyModel[11].setRotationPoint(-58F, -49F, 2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 117
		bodyModel[12].setRotationPoint(-48F, -49F, 2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 118
		bodyModel[13].setRotationPoint(-41F, -49F, 2F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 120
		bodyModel[14].setRotationPoint(-58F, -49F, 0F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 121
		bodyModel[15].setRotationPoint(-48F, -49F, 0F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 122
		bodyModel[16].setRotationPoint(-39F, -49F, 0F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 124
		bodyModel[17].setRotationPoint(-70F, -49F, 0F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 125
		bodyModel[18].setRotationPoint(-58F, -49F, 0F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 126
		bodyModel[19].setRotationPoint(-48F, -49F, 0F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 127
		bodyModel[20].setRotationPoint(-39F, -49F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 128
		bodyModel[21].setRotationPoint(-41F, -49F, 2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 129
		bodyModel[22].setRotationPoint(-48F, -49F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 130
		bodyModel[23].setRotationPoint(-58F, -49F, 2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 131
		bodyModel[24].setRotationPoint(-70F, -49F, 2F);

		bodyModel[25].addBox(0F, 0F, 0F, 39, 1, 1, 0F); // Box 132
		bodyModel[25].setRotationPoint(-70F, -49F, -3F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 133
		bodyModel[26].setRotationPoint(-70F, -49F, -3F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 134
		bodyModel[27].setRotationPoint(-58F, -49F, -3F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 135
		bodyModel[28].setRotationPoint(-48F, -49F, -3F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 136
		bodyModel[29].setRotationPoint(-39F, -49F, -3F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F); // Box 137
		bodyModel[30].setRotationPoint(-41F, -49F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F); // Box 138
		bodyModel[31].setRotationPoint(-48F, -49F, -5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F); // Box 139
		bodyModel[32].setRotationPoint(-58F, -49F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F); // Box 140
		bodyModel[33].setRotationPoint(-70F, -49F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 142
		bodyModel[34].setRotationPoint(-75F, -49F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, -5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, -1F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -1F); // Box 143
		bodyModel[35].setRotationPoint(-81F, -48F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 153
		bodyModel[36].setRotationPoint(-93F, -24F, -33F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[37].setRotationPoint(-92F, -31F, -39F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 159
		bodyModel[38].setRotationPoint(-92F, -31F, -33F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -5F); // Box 160
		bodyModel[39].setRotationPoint(-92F, -24F, -33F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 161
		bodyModel[40].setRotationPoint(-92F, -24F, -39F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[41].setRotationPoint(-93F, -25F, -34F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 163
		bodyModel[42].setRotationPoint(-93F, -24F, -34F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 164
		bodyModel[43].setRotationPoint(-93F, -25F, -33F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 165
		bodyModel[44].setRotationPoint(-93F, -24F, -33F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 174
		bodyModel[45].setRotationPoint(-22F, -42F, 0F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[46].setRotationPoint(-22F, -42F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 176
		bodyModel[47].setRotationPoint(-33F, -49F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 177
		bodyModel[48].setRotationPoint(-33F, -49F, 2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F); // Box 178
		bodyModel[49].setRotationPoint(-33F, -49F, -5F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 179
		bodyModel[50].setRotationPoint(-31F, -49F, 0F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 180
		bodyModel[51].setRotationPoint(-31F, -49F, 0F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 181
		bodyModel[52].setRotationPoint(-31F, -49F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[53].setRotationPoint(-37F, -42F, -4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[54].setRotationPoint(-56F, -42F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[55].setRotationPoint(-56F, -42F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 185
		bodyModel[56].setRotationPoint(-35F, -42F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[57].setRotationPoint(-35F, -42F, 1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[58].setRotationPoint(-24F, -42F, 1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 188
		bodyModel[59].setRotationPoint(-24F, -42F, -3F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 189
		bodyModel[60].setRotationPoint(-58F, -42F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 190
		bodyModel[61].setRotationPoint(-56F, -42F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 191
		bodyModel[62].setRotationPoint(-39F, -42F, -3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[63].setRotationPoint(-56F, -42F, 1F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[64].setRotationPoint(-39F, -42F, 1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[65].setRotationPoint(-34F, -41F, -2F);
		bodyModel[65].rotateAngleZ = 0.08726646F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, -5F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, -1F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -1F); // Box 195
		bodyModel[66].setRotationPoint(-81F, -48F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, -5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 1F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 1F); // Box 196
		bodyModel[67].setRotationPoint(-81F, -48F, 1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 197
		bodyModel[68].setRotationPoint(-75F, -49F, -3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 198
		bodyModel[69].setRotationPoint(-75F, -49F, 0F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 199
		bodyModel[70].setRotationPoint(-75F, -49F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 17, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -12F, 0F, -1F, -12F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -12F, 0F, -12F, -12F); // Box 206
		bodyModel[71].setRotationPoint(-79F, -44F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 17, 16, 0F,0F, -1F, -12F, 0F, -1F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 207
		bodyModel[72].setRotationPoint(-79F, -44F, -16F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 16, 15, 0F,0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 210
		bodyModel[73].setRotationPoint(-81F, -39F, -17F);
		bodyModel[73].rotateAngleZ = 0.52359878F;

		bodyModel[74].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 211
		bodyModel[74].setRotationPoint(-82F, -39F, -4F);
		bodyModel[74].rotateAngleZ = 0.45378561F;

		bodyModel[75].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 212
		bodyModel[75].setRotationPoint(-59F, -42F, -3.5F);
		bodyModel[75].rotateAngleZ = -0.13962634F;

		bodyModel[76].addBox(0F, 0F, 0F, 61, 1, 11, 0F); // Box 213
		bodyModel[76].setRotationPoint(-77F, -31F, -5F);

		bodyModel[77].addBox(0F, 0F, 0F, 8, 1, 6, 0F); // Box 214
		bodyModel[77].setRotationPoint(-68F, -32F, -3.5F);

		bodyModel[78].addBox(0F, 0F, 0F, 14, 6, 3, 0F); // Box 215
		bodyModel[78].setRotationPoint(-80F, -37F, 3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 16, 8, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 216
		bodyModel[79].setRotationPoint(-81F, -37F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 16, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -12F, 0F, -12F, -12F); // Box 218
		bodyModel[80].setRotationPoint(-81F, -39F, 2F);
		bodyModel[80].rotateAngleZ = 0.52359878F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 17, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 221
		bodyModel[81].setRotationPoint(-88F, -34F, 0F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 223
		bodyModel[82].setRotationPoint(-79F, -35F, 1F);
		bodyModel[82].rotateAngleZ = 0.54105207F;

		bodyModel[83].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 224
		bodyModel[83].setRotationPoint(-79F, -35F, -2F);
		bodyModel[83].rotateAngleZ = 0.54105207F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[84].setRotationPoint(-33F, -34F, -2.5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 275
		bodyModel[85].setRotationPoint(-40F, -42F, -3F);
		bodyModel[85].rotateAngleZ = -0.13962634F;

		bodyModel[86].addBox(0F, 0F, 0F, 8, 1, 6, 0F); // Box 276
		bodyModel[86].setRotationPoint(-49F, -32F, -3F);

		bodyModel[87].addBox(0F, 0F, 0F, 8, 1, 6, 0F); // Box 277
		bodyModel[87].setRotationPoint(-54F, -38F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, -2F, 0F, -5F, -2F, 0F, -5F, -2F, -4F, 0F, -2F, -4F); // Box 278
		bodyModel[88].setRotationPoint(-54F, -40F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[89].setRotationPoint(-86F, -16F, 31F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[90].setRotationPoint(-86F, -16F, 33F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[91].setRotationPoint(-83F, -16F, 33F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 290
		bodyModel[92].setRotationPoint(-83F, -14F, 33F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 291
		bodyModel[93].setRotationPoint(-86F, -14F, 33F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[94].setRotationPoint(-86F, -14F, 31F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[95].setRotationPoint(-83F, -16F, 31F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[96].setRotationPoint(-83F, -14F, 31F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[97].setRotationPoint(-86F, -16F, -33F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[98].setRotationPoint(-86F, -16F, -35F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[99].setRotationPoint(-83F, -16F, -35F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[100].setRotationPoint(-83F, -14F, -35F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[101].setRotationPoint(-86F, -14F, -35F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 300
		bodyModel[102].setRotationPoint(-86F, -14F, -33F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[103].setRotationPoint(-83F, -16F, -33F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 302
		bodyModel[104].setRotationPoint(-83F, -14F, -33F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 37, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 322
		bodyModel[105].setRotationPoint(-60F, -24F, 3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 37, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[106].setRotationPoint(-60F, -24F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 37, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 324
		bodyModel[107].setRotationPoint(-60F, -24F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 37, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[108].setRotationPoint(-60F, -24F, -6F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -2F, -1F); // Box 327
		bodyModel[109].setRotationPoint(-23F, -24F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -1F, 0F, -2F, -1F); // Box 328
		bodyModel[110].setRotationPoint(-23F, -24F, -3F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 329
		bodyModel[111].setRotationPoint(-23F, -24F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 330
		bodyModel[112].setRotationPoint(-23F, -24F, -6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 331
		bodyModel[113].setRotationPoint(-67F, -23.4F, -3.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 332
		bodyModel[114].setRotationPoint(-67F, -23.4F, 2.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 342
		bodyModel[115].setRotationPoint(-65F, -26.4F, -61.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 343
		bodyModel[116].setRotationPoint(-58F, -27F, -61F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[117].setRotationPoint(-58F, -27F, -64F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 345
		bodyModel[118].setRotationPoint(-58F, -27F, -68F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 346
		bodyModel[119].setRotationPoint(-65F, -26.4F, -68.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[120].setRotationPoint(-58F, -27F, -71F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 348
		bodyModel[121].setRotationPoint(-65F, -27.4F, -75.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 349
		bodyModel[122].setRotationPoint(-58F, -28F, -75F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 350
		bodyModel[123].setRotationPoint(-58F, -28F, -78F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 1870, 17, textureX, textureY); // Box 81
		noseModel[1] = new ModelRendererTurbo(this, 2001, 132, textureX, textureY); // Box 83
		noseModel[2] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 84
		noseModel[3] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 90
		noseModel[4] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 91
		noseModel[5] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 92
		noseModel[6] = new ModelRendererTurbo(this, 697, 25, textureX, textureY); // Box 93
		noseModel[7] = new ModelRendererTurbo(this, 1057, 17, textureX, textureY); // Box 95
		noseModel[8] = new ModelRendererTurbo(this, 1121, 25, textureX, textureY); // Box 103
		noseModel[9] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 104
		noseModel[10] = new ModelRendererTurbo(this, 1161, 25, textureX, textureY); // Box 105
		noseModel[11] = new ModelRendererTurbo(this, 1305, 25, textureX, textureY); // Box 106
		noseModel[12] = new ModelRendererTurbo(this, 1233, 25, textureX, textureY); // Box 107
		noseModel[13] = new ModelRendererTurbo(this, 1785, 25, textureX, textureY); // Box 108
		noseModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 109
		noseModel[15] = new ModelRendererTurbo(this, 1929, 17, textureX, textureY); // Box 110
		noseModel[16] = new ModelRendererTurbo(this, 1897, 49, textureX, textureY); // Box 222
		noseModel[17] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 272

		noseModel[0].addShapeBox(0F, 0F, 0F, 17, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 81
		noseModel[0].setRotationPoint(-88F, -34F, 0F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 11, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -6F, -4F); // Box 83
		noseModel[1].setRotationPoint(-99F, -34F, 0F);

		noseModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -4F, -4F); // Box 84
		noseModel[2].setRotationPoint(-104F, -34F, 0F);

		noseModel[3].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 1F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, 1F, -3F, 0F, 0F, -4F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 90
		noseModel[3].setRotationPoint(-79F, -42F, 0F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 17, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 91
		noseModel[4].setRotationPoint(-88F, -39F, 0F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 92
		noseModel[5].setRotationPoint(-88F, -44F, 0F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 11, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 93
		noseModel[6].setRotationPoint(-99F, -39F, 0F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, -5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 95
		noseModel[7].setRotationPoint(-104F, -40F, 0F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 11, 8, 7, 0F,0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -4F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 103
		noseModel[8].setRotationPoint(-99F, -34F, -7F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -4F, 0F); // Box 104
		noseModel[9].setRotationPoint(-104F, -34F, -4F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 1F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 1F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -4F); // Box 105
		noseModel[10].setRotationPoint(-79F, -42F, -8F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 17, 5, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 106
		noseModel[11].setRotationPoint(-88F, -39F, -8F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 9, 5, 8, 0F,0F, -2F, -5F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		noseModel[12].setRotationPoint(-88F, -44F, -8F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 11, 5, 6, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		noseModel[13].setRotationPoint(-99F, -39F, -6F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, -3F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		noseModel[14].setRotationPoint(-99F, -42F, -6F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, -5F, -4F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		noseModel[15].setRotationPoint(-104F, -40F, -4F);

		noseModel[16].addShapeBox(0F, 0F, 0F, 17, 10, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 222
		noseModel[16].setRotationPoint(-88F, -34F, -8F);

		noseModel[17].addShapeBox(0F, 0F, 0F, 11, 3, 6, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 272
		noseModel[17].setRotationPoint(-99F, -42F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, -5, 133, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		tailModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
		tailModel[3] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 14
		tailModel[4] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 16
		tailModel[5] = new ModelRendererTurbo(this, 1073, 1, textureX, textureY); // Box 17
		tailModel[6] = new ModelRendererTurbo(this, 1481, 1, textureX, textureY); // Box 20
		tailModel[7] = new ModelRendererTurbo(this, 1553, 1, textureX, textureY); // Box 21
		tailModel[8] = new ModelRendererTurbo(this, 1625, 1, textureX, textureY); // Box 22
		tailModel[9] = new ModelRendererTurbo(this, 1697, 1, textureX, textureY); // Box 23
		tailModel[10] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Box 24
		tailModel[11] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 25
		tailModel[12] = new ModelRendererTurbo(this, 1817, 1, textureX, textureY); // Box 26
		tailModel[13] = new ModelRendererTurbo(this, 1841, 1, textureX, textureY); // Box 27
		tailModel[14] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 68
		tailModel[15] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 71
		tailModel[16] = new ModelRendererTurbo(this, 1993, 1, textureX, textureY); // Box 73
		tailModel[17] = new ModelRendererTurbo(this, 1233, 33, textureX, textureY); // Box 84
		tailModel[18] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 86
		tailModel[19] = new ModelRendererTurbo(this, 1825, 17, textureX, textureY); // Box 89

		tailModel[0].addShapeBox(0F, 0F, 0F, 75, 5, 7, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F); // Box 0
		tailModel[0].setRotationPoint(-16F, -44F, 0F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 75, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F); // Box 4
		tailModel[1].setRotationPoint(-16F, -39F, 0F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 75, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, -6F, 0F, 0F, -7F, -3F, 0F, 0F, 0F); // Box 5
		tailModel[2].setRotationPoint(-16F, -34F, 0F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 75, 5, 7, 0F,0F, 0F, -4F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		tailModel[3].setRotationPoint(-16F, -44F, -7F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 75, 5, 7, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		tailModel[4].setRotationPoint(-16F, -39F, -7F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 75, 9, 7, 0F,0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -3F, 0F, -6F, 0F, 0F, 1F, 0F); // Box 17
		tailModel[5].setRotationPoint(-16F, -34F, -7F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 29, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 20
		tailModel[6].setRotationPoint(59F, -44F, 0F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 29, 5, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		tailModel[7].setRotationPoint(59F, -44F, -4F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 29, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -5F, -1F, 0F, -1F, 0F); // Box 22
		tailModel[8].setRotationPoint(59F, -39F, 0F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 29, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -5F, -1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 23
		tailModel[9].setRotationPoint(59F, -39F, -4F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -1F, 0F); // Box 24
		tailModel[10].setRotationPoint(88F, -39F, 0F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 25
		tailModel[11].setRotationPoint(88F, -39F, -3F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 26
		tailModel[12].setRotationPoint(88F, -44F, 0F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0F, -2F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		tailModel[13].setRotationPoint(88F, -44F, -3F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 17, 3, 37, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -6F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F); // Box 68
		tailModel[14].setRotationPoint(60F, -45F, 1F);
		tailModel[14].rotateAngleX = 0.17453293F;

		tailModel[15].addShapeBox(0F, 0F, 0F, 13, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -3F, -3F, -1F); // Box 71
		tailModel[15].setRotationPoint(64F, -48F, 38F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 13, 11, 2, 0F,-3F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -3F, -3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 73
		tailModel[16].setRotationPoint(64F, -59F, 38F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 17, 3, 37, 0F,-6F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 84
		tailModel[17].setRotationPoint(60F, -51F, -37F);
		tailModel[17].rotateAngleX = -0.17453293F;

		tailModel[18].addShapeBox(0F, 0F, 0F, 13, 11, 2, 0F,-3F, -3F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		tailModel[18].setRotationPoint(64F, -59F, -39F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 13, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, -3F, -3F, 0F); // Box 89
		tailModel[19].setRotationPoint(64F, -48F, -39F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 0, 151, textureX, textureY); // Box 75
		leftWingModel[1] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 76
		leftWingModel[2] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 77
		leftWingModel[3] = new ModelRendererTurbo(this, 126, 161, textureX, textureY); // Box 78
		leftWingModel[4] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 79
		leftWingModel[5] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 80
		leftWingModel[6] = new ModelRendererTurbo(this, 817, 17, textureX, textureY); // Box 81
		leftWingModel[7] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 82
		leftWingModel[8] = new ModelRendererTurbo(this, 585, 9, textureX, textureY); // Box 83
		leftWingModel[9] = new ModelRendererTurbo(this, 1385, 9, textureX, textureY); // Box 84
		leftWingModel[10] = new ModelRendererTurbo(this, 1449, 9, textureX, textureY); // Box 85
		leftWingModel[11] = new ModelRendererTurbo(this, 881, 17, textureX, textureY); // Box 96
		leftWingModel[12] = new ModelRendererTurbo(this, 1481, 17, textureX, textureY); // Box 97
		leftWingModel[13] = new ModelRendererTurbo(this, 1601, 17, textureX, textureY); // Box 98
		leftWingModel[14] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 76
		leftWingModel[15] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 77
		leftWingModel[16] = new ModelRendererTurbo(this, 577, 25, textureX, textureY); // Box 79
		leftWingModel[17] = new ModelRendererTurbo(this, 1057, 25, textureX, textureY); // Box 80
		leftWingModel[18] = new ModelRendererTurbo(this, 1785, 9, textureX, textureY); // Box 82
		leftWingModel[19] = new ModelRendererTurbo(this, 90, 50, textureX, textureY); // Box 83
		leftWingModel[20] = new ModelRendererTurbo(this, 1713, 33, textureX, textureY); // Box 146
		leftWingModel[21] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 149
		leftWingModel[22] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 150
		leftWingModel[23] = new ModelRendererTurbo(this, 937, 41, textureX, textureY); // Box 151
		leftWingModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 152
		leftWingModel[25] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 155
		leftWingModel[26] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 156
		leftWingModel[27] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Box 157
		leftWingModel[28] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 219
		leftWingModel[29] = new ModelRendererTurbo(this, 1153, 57, textureX, textureY); // Box 249
		leftWingModel[30] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 250
		leftWingModel[31] = new ModelRendererTurbo(this, 1857, 1, textureX, textureY); // Box 251
		leftWingModel[32] = new ModelRendererTurbo(this, 545, 9, textureX, textureY); // Box 252
		leftWingModel[33] = new ModelRendererTurbo(this, 1417, 9, textureX, textureY); // Box 253
		leftWingModel[34] = new ModelRendererTurbo(this, 1305, 73, textureX, textureY); // Box 303
		leftWingModel[35] = new ModelRendererTurbo(this, 1849, 73, textureX, textureY); // Box 304
		leftWingModel[36] = new ModelRendererTurbo(this, 1713, 65, textureX, textureY); // Box 305
		leftWingModel[37] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 307
		leftWingModel[38] = new ModelRendererTurbo(this, 634, 86, textureX, textureY); // Box 313
		leftWingModel[39] = new ModelRendererTurbo(this, 1025, 81, textureX, textureY); // Box 315
		leftWingModel[40] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 333
		leftWingModel[41] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 334
		leftWingModel[42] = new ModelRendererTurbo(this, 1057, 57, textureX, textureY); // Box 335
		leftWingModel[43] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 336
		leftWingModel[44] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 337
		leftWingModel[45] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 338
		leftWingModel[46] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 339
		leftWingModel[47] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 340
		leftWingModel[48] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 341

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 40, 8, 37, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -1F, 1F); // Box 75
		leftWingModel[0].setRotationPoint(-55F, -31F, -38F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 4, 8, 37, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F); // Box 76
		leftWingModel[1].setRotationPoint(-59F, -31F, -38F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 5, 8, 38, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F); // Box 77
		leftWingModel[2].setRotationPoint(-64F, -31F, -38F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		leftWingModel[3].setRotationPoint(-82F, -34F, -33F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		leftWingModel[4].setRotationPoint(-82F, -34F, -43F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		leftWingModel[5].setRotationPoint(-82F, -24F, -43F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F); // Box 81
		leftWingModel[6].setRotationPoint(-82F, -24F, -33F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 82
		leftWingModel[7].setRotationPoint(-85F, -24F, -43F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -5F, -5F); // Box 83
		leftWingModel[8].setRotationPoint(-85F, -24F, -33F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 84
		leftWingModel[9].setRotationPoint(-85F, -34F, -33F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0F, -5F, -5F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		leftWingModel[10].setRotationPoint(-85F, -34F, -43F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 35, 10, 9, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -7F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 1F); // Box 96
		leftWingModel[11].setRotationPoint(-64F, -34F, -33F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 48, 10, 9, 0F,0F, 0F, 1F, 0F, 1F, -8F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -11F, -8F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 97
		leftWingModel[12].setRotationPoint(-64F, -24F, -42F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 49, 10, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -9F, 0F, -3F, -2F); // Box 98
		leftWingModel[13].setRotationPoint(-64F, -24F, -33F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 4, 8, 47, 0F,-5F, -1F, 0F, 6F, 0F, 0F, -1F, 0F, 1F, 1F, -1F, 1F, -5F, -1F, 0F, 6F, 0F, 0F, -1F, 0F, 1F, 1F, -1F, 1F); // Box 76
		leftWingModel[14].setRotationPoint(-58F, -34.4F, -86F);
		leftWingModel[14].rotateAngleX = -0.06981317F;

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 5, 8, 48, 0F,-6F, -4F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -6F, -4F, 0F, 6F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F); // Box 77
		leftWingModel[15].setRotationPoint(-64F, -34.4F, -87F);
		leftWingModel[15].rotateAngleX = -0.06981317F;

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 5, 6, 48, 0F,-5F, -2F, 0F, 5F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, 5F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 79
		leftWingModel[16].setRotationPoint(-53F, -38.4F, -134F);
		leftWingModel[16].rotateAngleX = -0.10471976F;

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 5, 6, 48, 0F,-7F, -3F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -7F, -3F, 0F, 5F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 80
		leftWingModel[17].setRotationPoint(-58F, -38.4F, -134F);
		leftWingModel[17].rotateAngleX = -0.10471976F;

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, -2F, 0F, -7F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 82
		leftWingModel[18].setRotationPoint(-43F, -38.2F, -142.2F);
		leftWingModel[18].rotateAngleX = -0.10471976F;

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,-5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 83
		leftWingModel[19].setRotationPoint(-51F, -38.2F, -142.2F);
		leftWingModel[19].rotateAngleX = -0.10471976F;

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -5F); // Box 146
		leftWingModel[20].setRotationPoint(-92F, -24F, -33F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 149
		leftWingModel[21].setRotationPoint(-92F, -24F, -39F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		leftWingModel[22].setRotationPoint(-92F, -31F, -39F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 151
		leftWingModel[23].setRotationPoint(-92F, -31F, -33F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 152
		leftWingModel[24].setRotationPoint(-93F, -24F, -33F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 155
		leftWingModel[25].setRotationPoint(-93F, -24F, -34F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		leftWingModel[26].setRotationPoint(-93F, -25F, -34F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 157
		leftWingModel[27].setRotationPoint(-93F, -25F, -33F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 35, 10, 9, 0F,0F, -3F, -2F, 0F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		leftWingModel[28].setRotationPoint(-64F, -34F, -42F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftWingModel[29].setRotationPoint(-92F, -31F, 27F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 250
		leftWingModel[30].setRotationPoint(-93F, -24F, 32F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 251
		leftWingModel[31].setRotationPoint(-93F, -24F, 33F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 252
		leftWingModel[32].setRotationPoint(-93F, -25F, 33F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 253
		leftWingModel[33].setRotationPoint(-93F, -25F, 32F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 40, 8, 37, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -1F, 1F); // Box 303
		leftWingModel[34].setRotationPoint(-55F, -31F, -38F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 40, 8, 47, 0F,-6F, 0F, 0F, -10F, -6F, 0F, -1F, -6F, 2F, 1F, 0F, 1F, -6F, 0F, 0F, -10F, -2F, 0F, -1F, -2F, 2F, 1F, 0F, 1F); // Box 304
		leftWingModel[35].setRotationPoint(-54F, -34.4F, -86F);
		leftWingModel[35].rotateAngleX = -0.06981317F;

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 16, 8, 48, 0F,-5F, -2F, 0F, -4F, -4F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, -5F, -2F, 0F, -4F, -3F, 0F, 3F, -2F, 0F, 0F, 0F, 0F); // Box 305
		leftWingModel[36].setRotationPoint(-48F, -39.4F, -134F);
		leftWingModel[36].rotateAngleX = -0.10471976F;

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, -2F, 0F, -7F, -2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -7F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 307
		leftWingModel[37].setRotationPoint(-43F, -38.2F, -142.2F);
		leftWingModel[37].rotateAngleX = -0.10471976F;

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 40, 8, 37, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 2F, 0F, -1F, 1F); // Box 313
		leftWingModel[38].setRotationPoint(-55F, -31F, -38F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 35, 10, 9, 0F,0F, -3F, -2F, 0F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		leftWingModel[39].setRotationPoint(-64F, -34F, -42F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 333
		leftWingModel[40].setRotationPoint(-65F, -26.4F, -61.5F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 334
		leftWingModel[41].setRotationPoint(-58F, -27F, -64F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 335
		leftWingModel[42].setRotationPoint(-58F, -27F, -61F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 336
		leftWingModel[43].setRotationPoint(-58F, -27F, -71F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 337
		leftWingModel[44].setRotationPoint(-58F, -27F, -68F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 338
		leftWingModel[45].setRotationPoint(-65F, -26.4F, -68.5F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 339
		leftWingModel[46].setRotationPoint(-58F, -28F, -78F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 340
		leftWingModel[47].setRotationPoint(-58F, -28F, -75F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 341
		leftWingModel[48].setRotationPoint(-65F, -27.4F, -75.5F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 29
		rightWingModel[1] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 31
		rightWingModel[2] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 47
		rightWingModel[3] = new ModelRendererTurbo(this, 1321, 9, textureX, textureY); // Box 48
		rightWingModel[4] = new ModelRendererTurbo(this, 1721, 9, textureX, textureY); // Box 58
		rightWingModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 59
		rightWingModel[6] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 61
		rightWingModel[7] = new ModelRendererTurbo(this, 929, 17, textureX, textureY); // Box 75
		rightWingModel[8] = new ModelRendererTurbo(this, 1233, 41, textureX, textureY); // Box 167
		rightWingModel[9] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 170
		rightWingModel[10] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Box 171
		rightWingModel[11] = new ModelRendererTurbo(this, 1785, 1, textureX, textureY); // Box 172
		rightWingModel[12] = new ModelRendererTurbo(this, 1809, 1, textureX, textureY); // Box 173
		rightWingModel[13] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 236
		rightWingModel[14] = new ModelRendererTurbo(this, 1625, 57, textureX, textureY); // Box 237
		rightWingModel[15] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 238
		rightWingModel[16] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 239
		rightWingModel[17] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 240
		rightWingModel[18] = new ModelRendererTurbo(this, 1689, 57, textureX, textureY); // Box 241
		rightWingModel[19] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 242
		rightWingModel[20] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 243
		rightWingModel[21] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 246
		rightWingModel[22] = new ModelRendererTurbo(this, 593, 57, textureX, textureY); // Box 247
		rightWingModel[23] = new ModelRendererTurbo(this, 1121, 57, textureX, textureY); // Box 248
		rightWingModel[24] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 269
		rightWingModel[25] = new ModelRendererTurbo(this, 553, 81, textureX, textureY); // Box 270
		rightWingModel[26] = new ModelRendererTurbo(this, 1465, 33, textureX, textureY); // Box 279
		rightWingModel[27] = new ModelRendererTurbo(this, 1737, 33, textureX, textureY); // Box 280
		rightWingModel[28] = new ModelRendererTurbo(this, 1849, 33, textureX, textureY); // Box 281
		rightWingModel[29] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 282
		rightWingModel[30] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 283
		rightWingModel[31] = new ModelRendererTurbo(this, 1089, 41, textureX, textureY); // Box 284
		rightWingModel[32] = new ModelRendererTurbo(this, 1473, 41, textureX, textureY); // Box 285
		rightWingModel[33] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 286
		rightWingModel[34] = new ModelRendererTurbo(this, 1081, 81, textureX, textureY); // Box 316
		rightWingModel[35] = new ModelRendererTurbo(this, 1201, 81, textureX, textureY); // Box 317
		rightWingModel[36] = new ModelRendererTurbo(this, 1593, 81, textureX, textureY); // Box 318
		rightWingModel[37] = new ModelRendererTurbo(this, 801, 81, textureX, textureY); // Box 319
		rightWingModel[38] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 320
		rightWingModel[39] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 321
		rightWingModel[40] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 351
		rightWingModel[41] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 352
		rightWingModel[42] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 353
		rightWingModel[43] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 354
		rightWingModel[44] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 355
		rightWingModel[45] = new ModelRendererTurbo(this, 513, 97, textureX, textureY); // Box 356
		rightWingModel[46] = new ModelRendererTurbo(this, 889, 97, textureX, textureY); // Box 357
		rightWingModel[47] = new ModelRendererTurbo(this, 921, 97, textureX, textureY); // Box 358
		rightWingModel[48] = new ModelRendererTurbo(this, 961, 97, textureX, textureY); // Box 359

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 4, 8, 37, 0F,0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 29
		rightWingModel[0].setRotationPoint(-59F, -31F, 1F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 5, 8, 38, 0F,0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F); // Box 31
		rightWingModel[1].setRotationPoint(-64F, -31F, 0F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 4, 8, 47, 0F,1F, -1F, 1F, -1F, 0F, 1F, 6F, 0F, 0F, -5F, -1F, 0F, 1F, -1F, 1F, -1F, 0F, 1F, 6F, 0F, 0F, -5F, -1F, 0F); // Box 47
		rightWingModel[2].setRotationPoint(-58F, -31F, 39F);
		rightWingModel[2].rotateAngleX = 0.06981317F;

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 5, 8, 48, 0F,0F, -4F, 0F, 0F, -1F, 0F, 6F, -1F, 0F, -6F, -4F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 6F, -1F, 0F, -6F, -4F, 0F); // Box 48
		rightWingModel[3].setRotationPoint(-64F, -31F, 38F);
		rightWingModel[3].rotateAngleX = 0.06981317F;

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 5, 6, 48, 0F,0F, 0F, 0F, 0F, 1F, 0F, 5F, -1F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 5F, -1F, 0F, -5F, -2F, 0F); // Box 58
		rightWingModel[4].setRotationPoint(-53F, -33.4F, 86F);
		rightWingModel[4].rotateAngleX = 0.10471976F;

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 5, 6, 48, 0F,0F, -3F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, -7F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 5F, -2F, 0F, -7F, -3F, 0F); // Box 59
		rightWingModel[5].setRotationPoint(-58F, -33.4F, 86F);
		rightWingModel[5].rotateAngleX = 0.10471976F;

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -5F, -2F, 0F); // Box 61
		rightWingModel[6].setRotationPoint(-51F, -37.5F, 133.8F);
		rightWingModel[6].rotateAngleX = 0.10471976F;

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 40, 8, 47, 0F,1F, 0F, 1F, -1F, -6F, 2F, -10F, -6F, 0F, -6F, 0F, 0F, 1F, 0F, 1F, -1F, -2F, 2F, -10F, -2F, 0F, -6F, 0F, 0F); // Box 75
		rightWingModel[7].setRotationPoint(-54F, -31F, 39F);
		rightWingModel[7].rotateAngleX = 0.06981317F;

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		rightWingModel[8].setRotationPoint(-92F, -31F, 27F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 170
		rightWingModel[9].setRotationPoint(-93F, -25F, 33F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 171
		rightWingModel[10].setRotationPoint(-93F, -24F, 33F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		rightWingModel[11].setRotationPoint(-93F, -25F, 32F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 173
		rightWingModel[12].setRotationPoint(-93F, -24F, 32F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 236
		rightWingModel[13].setRotationPoint(-82F, -34F, 23F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 237
		rightWingModel[14].setRotationPoint(-82F, -34F, 33F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F); // Box 238
		rightWingModel[15].setRotationPoint(-82F, -24F, 33F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 18, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 239
		rightWingModel[16].setRotationPoint(-82F, -24F, 23F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -5F, -5F); // Box 240
		rightWingModel[17].setRotationPoint(-85F, -24F, 33F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 241
		rightWingModel[18].setRotationPoint(-85F, -24F, 23F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0F, -5F, -5F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		rightWingModel[19].setRotationPoint(-85F, -34F, 23F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 3, 10, 10, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 243
		rightWingModel[20].setRotationPoint(-85F, -34F, 33F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 246
		rightWingModel[21].setRotationPoint(-92F, -24F, 27F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -5F); // Box 247
		rightWingModel[22].setRotationPoint(-92F, -24F, 33F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 248
		rightWingModel[23].setRotationPoint(-92F, -31F, 33F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 48, 10, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -8F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, -8F, 0F, -3F, -2F); // Box 269
		rightWingModel[24].setRotationPoint(-64F, -24F, 33F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 49, 10, 9, 0F,0F, 0F, 1F, 0F, 1F, -9F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, -11F, -9F, 0F, -11F, 0F, 0F, 0F, 0F); // Box 270
		rightWingModel[25].setRotationPoint(-64F, -24F, 24F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		rightWingModel[26].setRotationPoint(-86F, -16F, 33F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		rightWingModel[27].setRotationPoint(-86F, -16F, 31F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		rightWingModel[28].setRotationPoint(-86F, -14F, 31F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 282
		rightWingModel[29].setRotationPoint(-86F, -14F, 33F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 283
		rightWingModel[30].setRotationPoint(-83F, -14F, 33F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 284
		rightWingModel[31].setRotationPoint(-83F, -14F, 31F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		rightWingModel[32].setRotationPoint(-83F, -16F, 31F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 286
		rightWingModel[33].setRotationPoint(-83F, -16F, 33F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 40, 8, 37, 0F,0F, 0F, 1F, 0F, -6F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -2F, 2F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 316
		rightWingModel[34].setRotationPoint(-55F, -31F, 1F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 35, 10, 9, 0F,0F, -3F, -2F, 0F, -7F, -7F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 317
		rightWingModel[35].setRotationPoint(-64F, -34F, 24F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 35, 10, 9, 0F,0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, -7F, 0F, -3F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 1F); // Box 318
		rightWingModel[36].setRotationPoint(-64F, -34F, 33F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 16, 8, 48, 0F,0F, 0F, 0F, 3F, -5F, 0F, -4F, -4F, 0F, -5F, -2F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, -4F, -3F, 0F, -5F, -2F, 0F); // Box 319
		rightWingModel[37].setRotationPoint(-48F, -34.4F, 86F);
		rightWingModel[37].rotateAngleX = 0.10471976F;

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 7, 2, 49, 0F,0F, -1F, 0F, 1F, -3F, 0F, -8F, -2F, 0F, 4F, -1F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, -8F, 0F, 0F, 4F, 0F, 0F); // Box 320
		rightWingModel[38].setRotationPoint(-32F, -31.3F, 85.7F);
		rightWingModel[38].rotateAngleX = 0.10471976F;

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, 0F, 0F, -3F, 0F, -7F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -7F, -2F, 0F, 0F, -2F, 0F); // Box 321
		rightWingModel[39].setRotationPoint(-43F, -37.5F, 133.8F);
		rightWingModel[39].rotateAngleX = 0.10471976F;

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 351
		rightWingModel[40].setRotationPoint(-65F, -26.4F, 51.5F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 352
		rightWingModel[41].setRotationPoint(-58F, -27F, 58F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 353
		rightWingModel[42].setRotationPoint(-58F, -27F, 61F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 354
		rightWingModel[43].setRotationPoint(-58F, -27F, 65F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 355
		rightWingModel[44].setRotationPoint(-65F, -26.4F, 58.5F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 356
		rightWingModel[45].setRotationPoint(-58F, -27F, 68F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, 0F, 0F, -9F, 0F); // Box 357
		rightWingModel[46].setRotationPoint(-65F, -27.4F, 65.5F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 358
		rightWingModel[47].setRotationPoint(-58F, -28F, 72F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 359
		rightWingModel[48].setRotationPoint(-58F, -28F, 75F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 1385, 9, textureX, textureY); // Box 69
		yawFlapModel[1] = new ModelRendererTurbo(this, 753, 41, textureX, textureY); // Box 85

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 37, 0F,0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F); // Box 69
		yawFlapModel[0].setRotationPoint(77F, -44F, 1F);
		yawFlapModel[0].rotateAngleX = 0.17453293F;

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 37, 0F,0F, 0F, 0F, -6F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		yawFlapModel[1].setRotationPoint(77F, -50F, -37F);
		yawFlapModel[1].rotateAngleX = -0.17453293F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1721, 17, textureX, textureY); // Box 87
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1745, 17, textureX, textureY); // Box 88
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 1945, 1, textureX, textureY); // Box 195
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 1081, 33, textureX, textureY); // Box 234
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 235
		pitchFlapLeftModel[5] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 263

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F,0F, -1F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		pitchFlapLeftModel[0].setRotationPoint(77F, -59F, -38F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1F, 0F); // Box 88
		pitchFlapLeftModel[1].setRotationPoint(77F, -48F, -38F);

		pitchFlapLeftModel[2].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 195
		pitchFlapLeftModel[2].setRotationPoint(-72F, -38F, -1F);
		pitchFlapLeftModel[2].rotateAngleZ = 0.15707963F;

		pitchFlapLeftModel[3].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 234
		pitchFlapLeftModel[3].setRotationPoint(-72.2F, -39F, -2F);
		pitchFlapLeftModel[3].rotateAngleZ = 0.15707963F;

		pitchFlapLeftModel[4].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 235
		pitchFlapLeftModel[4].setRotationPoint(-72.32F, -40.4F, -2F);
		pitchFlapLeftModel[4].rotateAngleX = -0.34906585F;
		pitchFlapLeftModel[4].rotateAngleZ = 0.15707963F;

		pitchFlapLeftModel[5].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 263
		pitchFlapLeftModel[5].setRotationPoint(-72.32F, -40F, 0F);
		pitchFlapLeftModel[5].rotateAngleX = 0.34906585F;
		pitchFlapLeftModel[5].rotateAngleZ = 0.15707963F;
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1969, 1, textureX, textureY); // Box 72
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 74

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1F, 0F); // Box 72
		pitchFlapRightModel[0].setRotationPoint(77F, -48F, 38F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F,0F, -1F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		pitchFlapRightModel[1].setRotationPoint(77F, -59F, 38F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1169, 25, textureX, textureY); // Box 81

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 7, 2, 49, 0F,4F, -1F, 0F, -8F, -2F, 0F, 1F, -3F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -8F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 81
		pitchFlapLeftWingModel[0].setRotationPoint(-32F, -36.3F, -134.3F);
		pitchFlapLeftWingModel[0].rotateAngleX = -0.10471976F;
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1785, 9, textureX, textureY); // Box 196
		tailWheelModel[1] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 197
		tailWheelModel[2] = new ModelRendererTurbo(this, 1929, 33, textureX, textureY); // Box 198
		tailWheelModel[3] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 199
		tailWheelModel[4] = new ModelRendererTurbo(this, 689, 25, textureX, textureY); // Box 200
		tailWheelModel[5] = new ModelRendererTurbo(this, 1153, 25, textureX, textureY); // Box 201
		tailWheelModel[6] = new ModelRendererTurbo(this, 1353, 25, textureX, textureY); // Box 202
		tailWheelModel[7] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 203

		tailWheelModel[0].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 196
		tailWheelModel[0].setRotationPoint(85F, -36F, -0.5F);
		tailWheelModel[0].rotateAngleZ = 0.61086524F;

		tailWheelModel[1].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 197
		tailWheelModel[1].setRotationPoint(87F, -30F, -1F);

		tailWheelModel[2].addBox(0F, 0F, 0F, 6, 2, 2, 0F); // Box 198
		tailWheelModel[2].setRotationPoint(85F, -32F, -1F);

		tailWheelModel[3].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 199
		tailWheelModel[3].setRotationPoint(87F, -34F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F); // Box 200
		tailWheelModel[4].setRotationPoint(89F, -30F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		tailWheelModel[5].setRotationPoint(89F, -34F, -1F);

		tailWheelModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		tailWheelModel[6].setRotationPoint(85F, -34F, -1F);

		tailWheelModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 203
		tailWheelModel[7].setRotationPoint(85F, -30F, -1F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 224
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 1953, 49, textureX, textureY); // Box 225
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 2009, 41, textureX, textureY); // Box 226
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 227
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1457, 49, textureX, textureY); // Box 228
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1841, 49, textureX, textureY); // Box 229
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1857, 9, textureX, textureY); // Box 230
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 231
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 232
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 233
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 360
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 361
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 617, 25, textureX, textureY); // Box 362
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 363

		leftWingWheelModel[0].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 224
		leftWingWheelModel[0].setRotationPoint(-59F, -19F, -37F);

		leftWingWheelModel[1].addBox(0F, 0F, 0F, 2, 11, 10, 0F); // Box 225
		leftWingWheelModel[1].setRotationPoint(-61F, -18F, -38F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		leftWingWheelModel[2].setRotationPoint(-64F, -12F, -36F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 227
		leftWingWheelModel[3].setRotationPoint(-64F, -6F, -36F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Box 228
		leftWingWheelModel[4].setRotationPoint(-58F, -6F, -36F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		leftWingWheelModel[5].setRotationPoint(-58F, -12F, -36F);

		leftWingWheelModel[6].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 230
		leftWingWheelModel[6].setRotationPoint(-48F, -22F, -37F);
		leftWingWheelModel[6].rotateAngleZ = -0.78539816F;

		leftWingWheelModel[7].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 231
		leftWingWheelModel[7].setRotationPoint(-54F, -16F, -36F);
		leftWingWheelModel[7].rotateAngleZ = -0.78539816F;

		leftWingWheelModel[8].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 232
		leftWingWheelModel[8].setRotationPoint(-59F, -19F, -30F);

		leftWingWheelModel[9].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 233
		leftWingWheelModel[9].setRotationPoint(-48F, -22F, -30F);
		leftWingWheelModel[9].rotateAngleZ = -0.78539816F;

		leftWingWheelModel[10].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 360
		leftWingWheelModel[10].setRotationPoint(-59F, -19F, -30F);

		leftWingWheelModel[11].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 361
		leftWingWheelModel[11].setRotationPoint(-59F, -19F, -37F);

		leftWingWheelModel[12].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 362
		leftWingWheelModel[12].setRotationPoint(-59F, -19F, 29F);

		leftWingWheelModel[13].addBox(0F, 0F, 0F, 2, 14, 1, 0F); // Box 363
		leftWingWheelModel[13].setRotationPoint(-59F, -19F, 36F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 537, 65, textureX, textureY); // Box 255
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1185, 57, textureX, textureY); // Box 256
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 1233, 57, textureX, textureY); // Box 257
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 689, 65, textureX, textureY); // Box 258
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 259
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 545, 17, textureX, textureY); // Box 260
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1353, 33, textureX, textureY); // Box 261
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1417, 17, textureX, textureY); // Box 262

		rightWingWheelModel[0].addBox(0F, 0F, 0F, 2, 11, 10, 0F); // Box 255
		rightWingWheelModel[0].setRotationPoint(-61F, -18F, 28F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,-2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		rightWingWheelModel[1].setRotationPoint(-64F, -12F, 30F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F); // Box 257
		rightWingWheelModel[2].setRotationPoint(-64F, -6F, 30F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Box 258
		rightWingWheelModel[3].setRotationPoint(-58F, -6F, 30F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 6, 6, 6, 0F,0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		rightWingWheelModel[4].setRotationPoint(-58F, -12F, 30F);

		rightWingWheelModel[5].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 260
		rightWingWheelModel[5].setRotationPoint(-48F, -22F, 36F);
		rightWingWheelModel[5].rotateAngleZ = -0.78539816F;

		rightWingWheelModel[6].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Box 261
		rightWingWheelModel[6].setRotationPoint(-54F, -16F, 30F);
		rightWingWheelModel[6].rotateAngleZ = -0.78539816F;

		rightWingWheelModel[7].addBox(0F, 0F, 0F, 1, 14, 1, 0F); // Box 262
		rightWingWheelModel[7].setRotationPoint(-48F, -22F, 29F);
		rightWingWheelModel[7].rotateAngleZ = -0.78539816F;
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-87F, -25F, 33F);
		propellerModels[1] = makeProp2(-87F, -24F, -33F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -22F, -1.5F, 2, 22, 3, 0.0F);
		prop[1].addBox(-1F, -22F, -1.5F, 2, 22, 3, 0.0F);
		prop[2].addBox(-1F, -22F, -1.5F, 2, 22, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-1F, -22F, -1.5F, 2, 22, 3, 0.0F);
		prop[1].addBox(-1F, -22F, -1.5F, 2, 22, 3, 0.0F);
		prop[2].addBox(-1F, -22F, -1.5F, 2, 22, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private void initGuns() {
	}
	{
	}
}