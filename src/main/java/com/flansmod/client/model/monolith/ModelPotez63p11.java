//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Potez63p11
// Model Creator: 
// Created on: 05.02.2021 - 18:59:13
// Last changed on: 05.02.2021 - 18:59:13

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPotez63p11 extends ModelPlane //Same as Filename
{
	int textureX = 2048;
	int textureY = 1024;

	public ModelPotez63p11() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[129];
		noseModel = new ModelRendererTurbo[16];
		tailModel = new ModelRendererTurbo[20];
		leftWingModel = new ModelRendererTurbo[46];
		rightWingModel = new ModelRendererTurbo[46];
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
		bodyModel[0] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 12
		bodyModel[1] = new ModelRendererTurbo(this, 1137, 1, textureX, textureY); // Box 18
		bodyModel[2] = new ModelRendererTurbo(this, 1257, 1, textureX, textureY); // Box 19
		bodyModel[3] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 153
		bodyModel[4] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 158
		bodyModel[5] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Box 159
		bodyModel[6] = new ModelRendererTurbo(this, 537, 25, textureX, textureY); // Box 160
		bodyModel[7] = new ModelRendererTurbo(this, 585, 25, textureX, textureY); // Box 161
		bodyModel[8] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 162
		bodyModel[9] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 163
		bodyModel[10] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 164
		bodyModel[11] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 165
		bodyModel[12] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 174
		bodyModel[13] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 175
		bodyModel[14] = new ModelRendererTurbo(this, 1353, 9, textureX, textureY); // Box 182
		bodyModel[15] = new ModelRendererTurbo(this, 1009, 25, textureX, textureY); // Box 183
		bodyModel[16] = new ModelRendererTurbo(this, 1169, 25, textureX, textureY); // Box 184
		bodyModel[17] = new ModelRendererTurbo(this, 1129, 1, textureX, textureY); // Box 185
		bodyModel[18] = new ModelRendererTurbo(this, 1465, 1, textureX, textureY); // Box 186
		bodyModel[19] = new ModelRendererTurbo(this, 1609, 1, textureX, textureY); // Box 191
		bodyModel[20] = new ModelRendererTurbo(this, 2025, 1, textureX, textureY); // Box 193
		bodyModel[21] = new ModelRendererTurbo(this, 1761, 17, textureX, textureY); // Box 194
		bodyModel[22] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 206
		bodyModel[23] = new ModelRendererTurbo(this, 1097, 25, textureX, textureY); // Box 207
		bodyModel[24] = new ModelRendererTurbo(this, 1241, 25, textureX, textureY); // Box 211
		bodyModel[25] = new ModelRendererTurbo(this, 2001, 17, textureX, textureY); // Box 212
		bodyModel[26] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 214
		bodyModel[27] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 223
		bodyModel[28] = new ModelRendererTurbo(this, 1825, 1, textureX, textureY); // Box 224
		bodyModel[29] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 273
		bodyModel[30] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 287
		bodyModel[31] = new ModelRendererTurbo(this, 529, 25, textureX, textureY); // Box 288
		bodyModel[32] = new ModelRendererTurbo(this, 1225, 33, textureX, textureY); // Box 289
		bodyModel[33] = new ModelRendererTurbo(this, 1353, 33, textureX, textureY); // Box 290
		bodyModel[34] = new ModelRendererTurbo(this, 1121, 25, textureX, textureY); // Box 291
		bodyModel[35] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 292
		bodyModel[36] = new ModelRendererTurbo(this, 1673, 33, textureX, textureY); // Box 293
		bodyModel[37] = new ModelRendererTurbo(this, 1729, 33, textureX, textureY); // Box 294
		bodyModel[38] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 295
		bodyModel[39] = new ModelRendererTurbo(this, 1049, 33, textureX, textureY); // Box 296
		bodyModel[40] = new ModelRendererTurbo(this, 1745, 33, textureX, textureY); // Box 297
		bodyModel[41] = new ModelRendererTurbo(this, 1793, 33, textureX, textureY); // Box 298
		bodyModel[42] = new ModelRendererTurbo(this, 1121, 33, textureX, textureY); // Box 299
		bodyModel[43] = new ModelRendererTurbo(this, 1193, 33, textureX, textureY); // Box 300
		bodyModel[44] = new ModelRendererTurbo(this, 1809, 33, textureX, textureY); // Box 301
		bodyModel[45] = new ModelRendererTurbo(this, 1825, 33, textureX, textureY); // Box 302
		bodyModel[46] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 342
		bodyModel[47] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 343
		bodyModel[48] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 344
		bodyModel[49] = new ModelRendererTurbo(this, 1025, 57, textureX, textureY); // Box 345
		bodyModel[50] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 346
		bodyModel[51] = new ModelRendererTurbo(this, 1593, 57, textureX, textureY); // Box 347
		bodyModel[52] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 274
		bodyModel[53] = new ModelRendererTurbo(this, 1841, 33, textureX, textureY); // Box 275
		bodyModel[54] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 276
		bodyModel[55] = new ModelRendererTurbo(this, 1753, 9, textureX, textureY); // Box 277
		bodyModel[56] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 279
		bodyModel[57] = new ModelRendererTurbo(this, 961, 17, textureX, textureY); // Box 281
		bodyModel[58] = new ModelRendererTurbo(this, 953, 41, textureX, textureY); // Box 282
		bodyModel[59] = new ModelRendererTurbo(this, 1929, 33, textureX, textureY); // Box 283
		bodyModel[60] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 285
		bodyModel[61] = new ModelRendererTurbo(this, 1889, 33, textureX, textureY); // Box 286
		bodyModel[62] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 287
		bodyModel[63] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 288
		bodyModel[64] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 289
		bodyModel[65] = new ModelRendererTurbo(this, 1513, 73, textureX, textureY); // Box 290
		bodyModel[66] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 291
		bodyModel[67] = new ModelRendererTurbo(this, 1065, 49, textureX, textureY); // Box 292
		bodyModel[68] = new ModelRendererTurbo(this, 1169, 57, textureX, textureY); // Box 293
		bodyModel[69] = new ModelRendererTurbo(this, 1305, 33, textureX, textureY); // Box 294
		bodyModel[70] = new ModelRendererTurbo(this, 1481, 49, textureX, textureY); // Box 295
		bodyModel[71] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 296
		bodyModel[72] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 297
		bodyModel[73] = new ModelRendererTurbo(this, 1857, 33, textureX, textureY); // Box 298
		bodyModel[74] = new ModelRendererTurbo(this, 1497, 49, textureX, textureY); // Box 299
		bodyModel[75] = new ModelRendererTurbo(this, 1729, 73, textureX, textureY); // Box 300
		bodyModel[76] = new ModelRendererTurbo(this, 1801, 73, textureX, textureY); // Box 302
		bodyModel[77] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 303
		bodyModel[78] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 260
		bodyModel[79] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 261
		bodyModel[80] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 263
		bodyModel[81] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 270
		bodyModel[82] = new ModelRendererTurbo(this, 549, 216, textureX, textureY); // Box 271
		bodyModel[83] = new ModelRendererTurbo(this, 945, 81, textureX, textureY); // Box 273
		bodyModel[84] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 274
		bodyModel[85] = new ModelRendererTurbo(this, 1057, 81, textureX, textureY); // Box 275
		bodyModel[86] = new ModelRendererTurbo(this, 745, 41, textureX, textureY); // Box 276
		bodyModel[87] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 254
		bodyModel[88] = new ModelRendererTurbo(this, 1369, 9, textureX, textureY); // Box 256
		bodyModel[89] = new ModelRendererTurbo(this, 585, 57, textureX, textureY); // Box 258
		bodyModel[90] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 267
		bodyModel[91] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 268
		bodyModel[92] = new ModelRendererTurbo(this, 1393, 17, textureX, textureY); // Box 269
		bodyModel[93] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 270
		bodyModel[94] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 274
		bodyModel[95] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 275
		bodyModel[96] = new ModelRendererTurbo(this, 601, 65, textureX, textureY); // Box 281
		bodyModel[97] = new ModelRendererTurbo(this, 1705, 33, textureX, textureY); // Box 282
		bodyModel[98] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 283
		bodyModel[99] = new ModelRendererTurbo(this, 1905, 33, textureX, textureY); // Box 284
		bodyModel[100] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 285
		bodyModel[101] = new ModelRendererTurbo(this, 1993, 57, textureX, textureY); // Box 286
		bodyModel[102] = new ModelRendererTurbo(this, 1769, 33, textureX, textureY); // Box 287
		bodyModel[103] = new ModelRendererTurbo(this, 729, 65, textureX, textureY); // Box 288
		bodyModel[104] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 289
		bodyModel[105] = new ModelRendererTurbo(this, 116, 132, textureX, textureY); // Box 291
		bodyModel[106] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 293
		bodyModel[107] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 294
		bodyModel[108] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 295
		bodyModel[109] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 296
		bodyModel[110] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 299
		bodyModel[111] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 301
		bodyModel[112] = new ModelRendererTurbo(this, 569, 89, textureX, textureY); // Box 302
		bodyModel[113] = new ModelRendererTurbo(this, 1113, 81, textureX, textureY); // Box 303
		bodyModel[114] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 304
		bodyModel[115] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 305
		bodyModel[116] = new ModelRendererTurbo(this, 625, 89, textureX, textureY); // Box 306
		bodyModel[117] = new ModelRendererTurbo(this, 1729, 49, textureX, textureY); // Box 307
		bodyModel[118] = new ModelRendererTurbo(this, 1409, 89, textureX, textureY); // Box 308
		bodyModel[119] = new ModelRendererTurbo(this, 1225, 41, textureX, textureY); // Box 309
		bodyModel[120] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 310
		bodyModel[121] = new ModelRendererTurbo(this, 1625, 89, textureX, textureY); // Box 312
		bodyModel[122] = new ModelRendererTurbo(this, 1313, 73, textureX, textureY); // Box 313
		bodyModel[123] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 314
		bodyModel[124] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 315
		bodyModel[125] = new ModelRendererTurbo(this, 1769, 97, textureX, textureY); // Box 317
		bodyModel[126] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 298
		bodyModel[127] = new ModelRendererTurbo(this, 521, 41, textureX, textureY); // Box 299
		bodyModel[128] = new ModelRendererTurbo(this, 1801, 73, textureX, textureY); // Box 300

		bodyModel[0].addShapeBox(0F, 0F, 0F, 55, 9, 7, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 12
		bodyModel[0].setRotationPoint(-71F, -34F, 1F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 55, 9, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 18
		bodyModel[1].setRotationPoint(-71F, -34F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 68, 5, 1, 0F); // Box 19
		bodyModel[2].setRotationPoint(-84F, -39F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 153
		bodyModel[3].setRotationPoint(-93F, -24F, -33F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[4].setRotationPoint(-92F, -31F, -39F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 159
		bodyModel[5].setRotationPoint(-92F, -31F, -33F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, -7F, -5F); // Box 160
		bodyModel[6].setRotationPoint(-92F, -24F, -33F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 7, 6, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 161
		bodyModel[7].setRotationPoint(-92F, -24F, -39F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[8].setRotationPoint(-93F, -25F, -34F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 163
		bodyModel[9].setRotationPoint(-93F, -24F, -34F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 164
		bodyModel[10].setRotationPoint(-93F, -25F, -33F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 165
		bodyModel[11].setRotationPoint(-93F, -24F, -33F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 174
		bodyModel[12].setRotationPoint(-23F, -43F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 175
		bodyModel[13].setRotationPoint(-23F, -43F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[14].setRotationPoint(-43F, -44F, -4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[15].setRotationPoint(-64F, -44F, -5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 34, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[16].setRotationPoint(-64F, -44F, 3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 185
		bodyModel[17].setRotationPoint(-41F, -44F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[18].setRotationPoint(-41F, -44F, 1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 191
		bodyModel[19].setRotationPoint(-45F, -44F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[20].setRotationPoint(-45F, -44F, 1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[21].setRotationPoint(-37F, -46F, -2F);
		bodyModel[21].rotateAngleZ = 0.08726646F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 17, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -13F, 0F, -1F, -13F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, -12F, 0F, -12F, -12F); // Box 206
		bodyModel[22].setRotationPoint(-63F, -51F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 17, 16, 0F,0F, -1F, -13F, 0F, -1F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, -12F, 0F, -12F, -12F, 0F, -12F, 0F, 0F, -12F, 0F); // Box 207
		bodyModel[23].setRotationPoint(-63F, -51F, -16F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Box 211
		bodyModel[24].setRotationPoint(-64F, -46F, -4F);
		bodyModel[24].rotateAngleZ = 0.45378561F;

		bodyModel[25].addBox(0F, 0F, 0F, 1, 11, 6, 0F); // Box 212
		bodyModel[25].setRotationPoint(-46F, -50F, -3F);
		bodyModel[25].rotateAngleZ = -0.13962634F;

		bodyModel[26].addBox(0F, 0F, 0F, 8, 1, 6, 0F); // Box 214
		bodyModel[26].setRotationPoint(-55F, -40F, -3F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 223
		bodyModel[27].setRotationPoint(-61F, -41F, 1F);
		bodyModel[27].rotateAngleZ = 0.54105207F;

		bodyModel[28].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 224
		bodyModel[28].setRotationPoint(-61F, -41F, -2F);
		bodyModel[28].rotateAngleZ = 0.54105207F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[29].setRotationPoint(-36F, -32F, -2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[30].setRotationPoint(-86F, -16F, 31F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[31].setRotationPoint(-86F, -16F, 33F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[32].setRotationPoint(-83F, -16F, 33F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 290
		bodyModel[33].setRotationPoint(-83F, -14F, 33F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 291
		bodyModel[34].setRotationPoint(-86F, -14F, 33F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[35].setRotationPoint(-86F, -14F, 31F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[36].setRotationPoint(-83F, -16F, 31F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[37].setRotationPoint(-83F, -14F, 31F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[38].setRotationPoint(-86F, -16F, -33F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[39].setRotationPoint(-86F, -16F, -35F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[40].setRotationPoint(-83F, -16F, -35F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[41].setRotationPoint(-83F, -14F, -35F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[42].setRotationPoint(-86F, -14F, -35F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 300
		bodyModel[43].setRotationPoint(-86F, -14F, -33F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[44].setRotationPoint(-83F, -16F, -33F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F); // Box 302
		bodyModel[45].setRotationPoint(-83F, -14F, -33F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 342
		bodyModel[46].setRotationPoint(-65F, -26.4F, -61.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 343
		bodyModel[47].setRotationPoint(-58F, -27F, -61F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[48].setRotationPoint(-58F, -27F, -64F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Box 345
		bodyModel[49].setRotationPoint(-58F, -27F, -68F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, -9F, 0F, -9F, -9F); // Box 346
		bodyModel[50].setRotationPoint(-65F, -26.4F, -68.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[51].setRotationPoint(-58F, -27F, -71F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F); // Box 274
		bodyModel[52].setRotationPoint(-53F, -55F, 3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 275
		bodyModel[53].setRotationPoint(-58F, -55F, 1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -4F, -1F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, -4F, 1F, 0F, 0F, -1F, 0F, -6F, -1F, 0F, -6F, 1F, 0F, 0F, 1F); // Box 276
		bodyModel[54].setRotationPoint(-63F, -54F, 1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[55].setRotationPoint(-53F, -55F, 0F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[56].setRotationPoint(-58F, -55F, 0F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[57].setRotationPoint(-39F, -53F, 0F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 1F, -2F, 0F, 1F); // Box 282
		bodyModel[58].setRotationPoint(-41F, -53F, 1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 283
		bodyModel[59].setRotationPoint(-52F, -55F, 1F);
		bodyModel[59].rotateAngleZ = -0.13962634F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 285
		bodyModel[60].setRotationPoint(-53F, -55F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 286
		bodyModel[61].setRotationPoint(-58F, -55F, -4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 6, 1, 0F,0F, -4F, 1F, 0F, 1F, 1F, 0F, 1F, -1F, 0F, -4F, -1F, 0F, 0F, 1F, 0F, -6F, 1F, 0F, -6F, -1F, 0F, 0F, -1F); // Box 287
		bodyModel[62].setRotationPoint(-63F, -54F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 288
		bodyModel[63].setRotationPoint(-53F, -55F, -3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 289
		bodyModel[64].setRotationPoint(-58F, -55F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, -3F, 0F, -1F, -2F, 0F, -1F, -5F, 0F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 290
		bodyModel[65].setRotationPoint(-51F, -47F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 291
		bodyModel[66].setRotationPoint(-39F, -53F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -3F, -2F, 0F, -3F); // Box 292
		bodyModel[67].setRotationPoint(-41F, -53F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 293
		bodyModel[68].setRotationPoint(-52F, -55F, -4F);
		bodyModel[68].rotateAngleZ = -0.13962634F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[69].setRotationPoint(-38F, -53F, -4F);
		bodyModel[69].rotateAngleZ = -0.13962634F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -3F, -2F, 0F, -3F); // Box 295
		bodyModel[70].setRotationPoint(-36.7F, -51F, -4F);
		bodyModel[70].rotateAngleZ = 0.4712389F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 296
		bodyModel[71].setRotationPoint(-35F, -52.5F, -4F);
		bodyModel[71].rotateAngleZ = -0.13962634F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[72].setRotationPoint(-35F, -52.5F, 0F);
		bodyModel[72].rotateAngleZ = -0.13962634F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[73].setRotationPoint(-38F, -53F, 3F);
		bodyModel[73].rotateAngleZ = -0.13962634F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 1F, -2F, 0F, 1F); // Box 299
		bodyModel[74].setRotationPoint(-36.7F, -51F, 1F);
		bodyModel[74].rotateAngleZ = 0.4712389F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 24, 8, 8, 0F,0F, 0F, -4F, 0F, -1F, -5F, 0F, -1F, -2F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 300
		bodyModel[75].setRotationPoint(-51F, -47F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 11, 6, 8, 0F,0F, 1F, -4F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, 1F, -3F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[76].setRotationPoint(-27F, -45F, 0F);

		bodyModel[77].addBox(0F, 0F, 0F, 68, 5, 1, 0F); // Box 303
		bodyModel[77].setRotationPoint(-84F, -39F, 7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[78].setRotationPoint(-24F, -43.25F, 1F);
		bodyModel[78].rotateAngleZ = -0.10471976F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 261
		bodyModel[79].setRotationPoint(-30F, -44F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 20, 8, 8, 0F,0F, -3F, 0F, 0F, -2F, -5F, 0F, -2F, -1F, 0F, -3F, -5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -4F, -6F); // Box 263
		bodyModel[80].setRotationPoint(-104F, -34F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 20, 7, 2, 0F,0F, -8F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, -5F, 0F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -5F); // Box 270
		bodyModel[81].setRotationPoint(-104F, -39F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 18, 8, 8, 0F,-3F, 0F, 0F, 0F, -7F, -7F, 0F, -8F, 0F, -1F, 0F, -7F, 1F, -8F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, -1F, -8F, -8F); // Box 271
		bodyModel[82].setRotationPoint(-102F, -47F, 0F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 20, 8, 8, 0F,0F, -3F, -5F, 0F, -2F, -1F, 0F, -2F, -5F, 0F, -3F, 0F, 0F, -4F, -6F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 273
		bodyModel[83].setRotationPoint(-104F, -34F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 20, 7, 2, 0F,0F, -8F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 4F, 0F, 1F, -5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 4F); // Box 274
		bodyModel[84].setRotationPoint(-104F, -39F, -8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 18, 8, 8, 0F,-1F, 0F, -7F, 0F, -8F, 0F, 0F, -7F, -7F, -3F, 0F, 0F, -1F, -8F, -8F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, -8F, 0F); // Box 275
		bodyModel[85].setRotationPoint(-102F, -47F, -8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,-2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 276
		bodyModel[86].setRotationPoint(-101F, -47F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 254
		bodyModel[87].setRotationPoint(-101F, -47F, 0F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 256
		bodyModel[88].setRotationPoint(-101F, -42F, -4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 258
		bodyModel[89].setRotationPoint(-101F, -40F, 3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 267
		bodyModel[90].setRotationPoint(-117F, -43.2F, -3.6F);
		bodyModel[90].rotateAngleX = -0.45378561F;

		bodyModel[91].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 268
		bodyModel[91].setRotationPoint(-117F, -43F, 2.5F);
		bodyModel[91].rotateAngleX = 0.45378561F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[92].setRotationPoint(-117F, -46F, 0F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 270
		bodyModel[93].setRotationPoint(-117F, -46F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -5F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 274
		bodyModel[94].setRotationPoint(-116F, -32F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 275
		bodyModel[95].setRotationPoint(-117F, -39F, -4.7F);
		bodyModel[95].rotateAngleX = 0.4712389F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 12, 4, 3, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, -2F); // Box 281
		bodyModel[96].setRotationPoint(-116F, -32F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -3F, 1F, 0F, -2F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 282
		bodyModel[97].setRotationPoint(-117F, -38F, -3F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -2F, -1F, 0F, -3F); // Box 283
		bodyModel[98].setRotationPoint(-117F, -38F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 284
		bodyModel[99].setRotationPoint(-121F, -39F, -2F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 285
		bodyModel[100].setRotationPoint(-121F, -39F, 1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -3F, -2F, 0F, -3F); // Box 286
		bodyModel[101].setRotationPoint(-46F, -53F, -4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 287
		bodyModel[102].setRotationPoint(-44F, -54F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 1F, -2F, 0F, 1F); // Box 288
		bodyModel[103].setRotationPoint(-46F, -53F, 1F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[104].setRotationPoint(-44F, -54F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 291
		bodyModel[105].setRotationPoint(-101F, -42F, 3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 293
		bodyModel[106].setRotationPoint(-117F, -42F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 294
		bodyModel[107].setRotationPoint(-117F, -40F, -4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 295
		bodyModel[108].setRotationPoint(-117F, -42F, 2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 296
		bodyModel[109].setRotationPoint(-117F, -40F, 3F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 299
		bodyModel[110].setRotationPoint(-104F, -31F, 0F);

		bodyModel[111].addBox(0F, 0F, 0F, 68, 2, 5, 0F); // Box 301
		bodyModel[111].setRotationPoint(-84F, -31F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 20, 2, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[112].setRotationPoint(-104F, -31F, -5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[113].setRotationPoint(-68F, -51F, 0F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, -2F, -4F, 0F, -2F, -4F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[114].setRotationPoint(-68F, -51F, -7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[115].setRotationPoint(-68F, -39F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 12, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[116].setRotationPoint(-68F, -39F, -7F);

		bodyModel[117].addBox(0F, 0F, 0F, 8, 1, 6, 0F); // Box 307
		bodyModel[117].setRotationPoint(-82F, -38F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 308
		bodyModel[118].setRotationPoint(-117F, -39.2F, 2.6F);
		bodyModel[118].rotateAngleX = 1.1693706F;

		bodyModel[119].addBox(0F, 0F, 0F, 5, 1, 5, 0F); // Box 309
		bodyModel[119].setRotationPoint(-76F, -32F, -2.5F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 9, 5, 0F); // Box 310
		bodyModel[120].setRotationPoint(-69F, -40F, -2.5F);
		bodyModel[120].rotateAngleZ = -0.26179939F;

		bodyModel[121].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 312
		bodyModel[121].setRotationPoint(-82F, -39F, 4F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 313
		bodyModel[122].setRotationPoint(-101F, -40F, -5F);

		bodyModel[123].addBox(0F, 0F, 0F, 26, 2, 7, 0F); // Box 314
		bodyModel[123].setRotationPoint(-66F, -38F, 0F);

		bodyModel[124].addBox(0F, 0F, 0F, 26, 2, 7, 0F); // Box 315
		bodyModel[124].setRotationPoint(-66F, -38F, -7F);

		bodyModel[125].addBox(0F, 0F, 0F, 68, 2, 5, 0F); // Box 317
		bodyModel[125].setRotationPoint(-84F, -31F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 298
		bodyModel[126].setRotationPoint(-24F, -43.25F, -3F);
		bodyModel[126].rotateAngleZ = -0.10471976F;

		bodyModel[127].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[127].setRotationPoint(-30F, -44F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 11, 6, 8, 0F,0F, 1F, -3F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F); // Box 300
		bodyModel[128].setRotationPoint(-27F, -45F, -8F);
	}

	private void initnoseModel_1()
	{
		noseModel[0] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 107
		noseModel[1] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 222
		noseModel[2] = new ModelRendererTurbo(this, 1465, 73, textureX, textureY); // Box 271
		noseModel[3] = new ModelRendererTurbo(this, 1585, 73, textureX, textureY); // Box 301
		noseModel[4] = new ModelRendererTurbo(this, 1985, 73, textureX, textureY); // Box 305
		noseModel[5] = new ModelRendererTurbo(this, 905, 73, textureX, textureY); // Box 266
		noseModel[6] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 267
		noseModel[7] = new ModelRendererTurbo(this, 1841, 73, textureX, textureY); // Box 268
		noseModel[8] = new ModelRendererTurbo(this, 513, 65, textureX, textureY); // Box 260
		noseModel[9] = new ModelRendererTurbo(this, 1865, 81, textureX, textureY); // Box 261
		noseModel[10] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 262
		noseModel[11] = new ModelRendererTurbo(this, 697, 65, textureX, textureY); // Box 263
		noseModel[12] = new ModelRendererTurbo(this, 753, 57, textureX, textureY); // Box 264
		noseModel[13] = new ModelRendererTurbo(this, 905, 57, textureX, textureY); // Box 266
		noseModel[14] = new ModelRendererTurbo(this, 1025, 65, textureX, textureY); // Box 297
		noseModel[15] = new ModelRendererTurbo(this, 1921, 81, textureX, textureY); // Box 298

		noseModel[0].addShapeBox(0F, 0F, 0F, 19, 7, 6, 0F,0F, -2F, -4F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 107
		noseModel[0].setRotationPoint(-82F, -51F, -6F);

		noseModel[1].addShapeBox(0F, 0F, 0F, 13, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, -3F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 222
		noseModel[1].setRotationPoint(-84F, -34F, -8F);

		noseModel[2].addShapeBox(0F, 2F, 0F, 12, 8, 8, 0F,0F, 2F, -4F, 0F, -1F, -5F, 0F, -1F, -2F, 0F, 2F, -3F, 0F, 1F, -9F, 0F, 1F, -9F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 271
		noseModel[2].setRotationPoint(-63F, -50F, -2F);

		noseModel[3].addShapeBox(0F, 2F, 0F, 12, 8, 8, 0F,0F, 2F, -3F, 0F, -1F, -2F, 0F, -1F, -5F, 0F, 2F, -4F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 1F, -9F, 0F, 1F, -9F); // Box 301
		noseModel[3].setRotationPoint(-63F, -50F, -6F);

		noseModel[4].addShapeBox(0F, 0F, 0F, 13, 10, 8, 0F,0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -3F, -3F); // Box 305
		noseModel[4].setRotationPoint(-84F, -34F, 0F);

		noseModel[5].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		noseModel[5].setRotationPoint(-84F, -50F, 0F);

		noseModel[6].addShapeBox(0F, 0F, 0F, 18, 5, 8, 0F,-6F, -2F, -7F, 0F, -1F, -6F, 0F, 0F, 0F, -6F, -1F, 0F, -1F, -1F, -7F, 0F, 0F, -4F, 0F, 0F, -3F, 1F, -1F, 0F); // Box 267
		noseModel[6].setRotationPoint(-102F, -50F, -8F);

		noseModel[7].addShapeBox(0F, 0F, 0F, 2, 11, 8, 0F,0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 268
		noseModel[7].setRotationPoint(-84F, -50F, -8F);

		noseModel[8].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F,0F, -4F, -3F, 0F, -2F, -3F, 0F, -1F, 0F, 1F, -4F, 0F, 0F, 2F, -3F, 0F, 1F, -2F, 0F, 1F, 0F, 1F, 2F, 0F); // Box 260
		noseModel[8].setRotationPoint(-116F, -50F, -4F);

		noseModel[9].addShapeBox(0F, 0F, 0F, 19, 7, 6, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -2F, -4F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 1F, 0F, 0F, 0F, -1F); // Box 261
		noseModel[9].setRotationPoint(-82F, -51F, 0F);

		noseModel[10].addShapeBox(0F, 0F, 0F, 9, 7, 5, 0F,0F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 262
		noseModel[10].setRotationPoint(-72F, -46F, -8F);

		noseModel[11].addShapeBox(0F, 0F, 0F, 9, 7, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 263
		noseModel[11].setRotationPoint(-72F, -46F, 3F);

		noseModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 264
		noseModel[12].setRotationPoint(-77F, -44F, -8F);

		noseModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		noseModel[13].setRotationPoint(-77F, -44F, 3F);

		noseModel[14].addShapeBox(0F, 0F, 0F, 20, 3, 4, 0F,1F, -4F, 0F, 0F, -1F, 0F, 0F, -2F, -3F, 0F, -4F, -3F, 1F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, -2F, 0F, 2F, -3F); // Box 297
		noseModel[14].setRotationPoint(-116F, -50F, 0F);

		noseModel[15].addShapeBox(0F, 0F, 0F, 18, 5, 8, 0F,-6F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -6F, -6F, -2F, -7F, 1F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, -4F, -1F, -1F, -7F); // Box 298
		noseModel[15].setRotationPoint(-102F, -50F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 234, 138, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		tailModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 5
		tailModel[3] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 14
		tailModel[4] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 16
		tailModel[5] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 17
		tailModel[6] = new ModelRendererTurbo(this, 1401, 1, textureX, textureY); // Box 20
		tailModel[7] = new ModelRendererTurbo(this, 1473, 1, textureX, textureY); // Box 21
		tailModel[8] = new ModelRendererTurbo(this, 1545, 1, textureX, textureY); // Box 22
		tailModel[9] = new ModelRendererTurbo(this, 1617, 1, textureX, textureY); // Box 23
		tailModel[10] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Box 24
		tailModel[11] = new ModelRendererTurbo(this, 1713, 1, textureX, textureY); // Box 25
		tailModel[12] = new ModelRendererTurbo(this, 1737, 1, textureX, textureY); // Box 26
		tailModel[13] = new ModelRendererTurbo(this, 1761, 1, textureX, textureY); // Box 27
		tailModel[14] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 68
		tailModel[15] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 71
		tailModel[16] = new ModelRendererTurbo(this, 1929, 1, textureX, textureY); // Box 73
		tailModel[17] = new ModelRendererTurbo(this, 1097, 25, textureX, textureY); // Box 84
		tailModel[18] = new ModelRendererTurbo(this, 1633, 17, textureX, textureY); // Box 86
		tailModel[19] = new ModelRendererTurbo(this, 1793, 17, textureX, textureY); // Box 89

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
		leftWingModel[0] = new ModelRendererTurbo(this, 13, 262, textureX, textureY); // Box 75
		leftWingModel[1] = new ModelRendererTurbo(this, 1281, 9, textureX, textureY); // Box 76
		leftWingModel[2] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 77
		leftWingModel[3] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 78
		leftWingModel[4] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 79
		leftWingModel[5] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 80
		leftWingModel[6] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 81
		leftWingModel[7] = new ModelRendererTurbo(this, 1281, 9, textureX, textureY); // Box 82
		leftWingModel[8] = new ModelRendererTurbo(this, 1329, 9, textureX, textureY); // Box 83
		leftWingModel[9] = new ModelRendererTurbo(this, 1705, 9, textureX, textureY); // Box 84
		leftWingModel[10] = new ModelRendererTurbo(this, 2017, 9, textureX, textureY); // Box 85
		leftWingModel[11] = new ModelRendererTurbo(this, 753, 17, textureX, textureY); // Box 96
		leftWingModel[12] = new ModelRendererTurbo(this, 849, 17, textureX, textureY); // Box 97
		leftWingModel[13] = new ModelRendererTurbo(this, 1393, 17, textureX, textureY); // Box 98
		leftWingModel[14] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 76
		leftWingModel[15] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 77
		leftWingModel[16] = new ModelRendererTurbo(this, 521, 25, textureX, textureY); // Box 79
		leftWingModel[17] = new ModelRendererTurbo(this, 921, 25, textureX, textureY); // Box 80
		leftWingModel[18] = new ModelRendererTurbo(this, 3, 129, textureX, textureY); // Box 82
		leftWingModel[19] = new ModelRendererTurbo(this, 1593, 17, textureX, textureY); // Box 83
		leftWingModel[20] = new ModelRendererTurbo(this, 1889, 17, textureX, textureY); // Box 146
		leftWingModel[21] = new ModelRendererTurbo(this, 1929, 17, textureX, textureY); // Box 149
		leftWingModel[22] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 150
		leftWingModel[23] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 151
		leftWingModel[24] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Box 152
		leftWingModel[25] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 155
		leftWingModel[26] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 156
		leftWingModel[27] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 157
		leftWingModel[28] = new ModelRendererTurbo(this, 1593, 33, textureX, textureY); // Box 219
		leftWingModel[29] = new ModelRendererTurbo(this, 889, 41, textureX, textureY); // Box 249
		leftWingModel[30] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 250
		leftWingModel[31] = new ModelRendererTurbo(this, 1729, 1, textureX, textureY); // Box 251
		leftWingModel[32] = new ModelRendererTurbo(this, 1753, 1, textureX, textureY); // Box 252
		leftWingModel[33] = new ModelRendererTurbo(this, 1777, 1, textureX, textureY); // Box 253
		leftWingModel[34] = new ModelRendererTurbo(this, 785, 57, textureX, textureY); // Box 303
		leftWingModel[35] = new ModelRendererTurbo(this, 0, 194, textureX, textureY); // Box 304
		leftWingModel[36] = new ModelRendererTurbo(this, 146, 133, textureX, textureY); // Box 305
		leftWingModel[37] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 307
		leftWingModel[38] = new ModelRendererTurbo(this, 1289, 65, textureX, textureY); // Box 313
		leftWingModel[39] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 315
		leftWingModel[40] = new ModelRendererTurbo(this, 1441, 41, textureX, textureY); // Box 333
		leftWingModel[41] = new ModelRendererTurbo(this, 1473, 41, textureX, textureY); // Box 334
		leftWingModel[42] = new ModelRendererTurbo(this, 1169, 49, textureX, textureY); // Box 335
		leftWingModel[43] = new ModelRendererTurbo(this, 1209, 49, textureX, textureY); // Box 336
		leftWingModel[44] = new ModelRendererTurbo(this, 1977, 49, textureX, textureY); // Box 337
		leftWingModel[45] = new ModelRendererTurbo(this, 2009, 49, textureX, textureY); // Box 338

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
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1745, 1, textureX, textureY); // Box 29
		rightWingModel[1] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 31
		rightWingModel[2] = new ModelRendererTurbo(this, 1873, 1, textureX, textureY); // Box 47
		rightWingModel[3] = new ModelRendererTurbo(this, 1217, 9, textureX, textureY); // Box 48
		rightWingModel[4] = new ModelRendererTurbo(this, 1329, 9, textureX, textureY); // Box 58
		rightWingModel[5] = new ModelRendererTurbo(this, 1641, 9, textureX, textureY); // Box 59
		rightWingModel[6] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 61
		rightWingModel[7] = new ModelRendererTurbo(this, 1465, 17, textureX, textureY); // Box 75
		rightWingModel[8] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 167
		rightWingModel[9] = new ModelRendererTurbo(this, 793, 1, textureX, textureY); // Box 170
		rightWingModel[10] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 171
		rightWingModel[11] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Box 172
		rightWingModel[12] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 173
		rightWingModel[13] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 236
		rightWingModel[14] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 237
		rightWingModel[15] = new ModelRendererTurbo(this, 697, 41, textureX, textureY); // Box 238
		rightWingModel[16] = new ModelRendererTurbo(this, 761, 41, textureX, textureY); // Box 239
		rightWingModel[17] = new ModelRendererTurbo(this, 1705, 33, textureX, textureY); // Box 240
		rightWingModel[18] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 241
		rightWingModel[19] = new ModelRendererTurbo(this, 537, 41, textureX, textureY); // Box 242
		rightWingModel[20] = new ModelRendererTurbo(this, 641, 41, textureX, textureY); // Box 243
		rightWingModel[21] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 246
		rightWingModel[22] = new ModelRendererTurbo(this, 825, 41, textureX, textureY); // Box 247
		rightWingModel[23] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 248
		rightWingModel[24] = new ModelRendererTurbo(this, 1753, 49, textureX, textureY); // Box 269
		rightWingModel[25] = new ModelRendererTurbo(this, 1873, 57, textureX, textureY); // Box 270
		rightWingModel[26] = new ModelRendererTurbo(this, 833, 17, textureX, textureY); // Box 279
		rightWingModel[27] = new ModelRendererTurbo(this, 1953, 17, textureX, textureY); // Box 280
		rightWingModel[28] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 281
		rightWingModel[29] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 282
		rightWingModel[30] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 283
		rightWingModel[31] = new ModelRendererTurbo(this, 1097, 25, textureX, textureY); // Box 284
		rightWingModel[32] = new ModelRendererTurbo(this, 1361, 25, textureX, textureY); // Box 285
		rightWingModel[33] = new ModelRendererTurbo(this, 1097, 33, textureX, textureY); // Box 286
		rightWingModel[34] = new ModelRendererTurbo(this, 1609, 65, textureX, textureY); // Box 316
		rightWingModel[35] = new ModelRendererTurbo(this, 729, 73, textureX, textureY); // Box 317
		rightWingModel[36] = new ModelRendererTurbo(this, 1137, 73, textureX, textureY); // Box 318
		rightWingModel[37] = new ModelRendererTurbo(this, 1185, 73, textureX, textureY); // Box 319
		rightWingModel[38] = new ModelRendererTurbo(this, 1401, 65, textureX, textureY); // Box 320
		rightWingModel[39] = new ModelRendererTurbo(this, 1393, 41, textureX, textureY); // Box 321
		rightWingModel[40] = new ModelRendererTurbo(this, 1409, 65, textureX, textureY); // Box 351
		rightWingModel[41] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 352
		rightWingModel[42] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 353
		rightWingModel[43] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 354
		rightWingModel[44] = new ModelRendererTurbo(this, 1273, 73, textureX, textureY); // Box 355
		rightWingModel[45] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 356

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
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 4, 136, textureX, textureY); // Box 69
		yawFlapModel[1] = new ModelRendererTurbo(this, 361, 244, textureX, textureY); // Box 85

		yawFlapModel[0].addShapeBox(0F, 0F, 0F, 13, 2, 37, 0F,0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F); // Box 69
		yawFlapModel[0].setRotationPoint(77F, -44F, 1F);
		yawFlapModel[0].rotateAngleX = 0.17453293F;

		yawFlapModel[1].addShapeBox(0F, 0F, 0F, 13, 2, 37, 0F,0F, 0F, 0F, -6F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		yawFlapModel[1].setRotationPoint(77F, -50F, -37F);
		yawFlapModel[1].rotateAngleX = -0.17453293F;
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 1665, 17, textureX, textureY); // Box 87
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 1737, 17, textureX, textureY); // Box 88
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 195
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 1465, 9, textureX, textureY); // Box 234
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 1681, 1, textureX, textureY); // Box 235
		pitchFlapLeftModel[5] = new ModelRendererTurbo(this, 1353, 9, textureX, textureY); // Box 263

		pitchFlapLeftModel[0].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F,0F, -1F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		pitchFlapLeftModel[0].setRotationPoint(77F, -59F, -38F);

		pitchFlapLeftModel[1].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1F, 0F); // Box 88
		pitchFlapLeftModel[1].setRotationPoint(77F, -48F, -38F);

		pitchFlapLeftModel[2].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Box 195
		pitchFlapLeftModel[2].setRotationPoint(-58F, -46F, -0.5F);
		pitchFlapLeftModel[2].rotateAngleZ = 0.15707963F;

		pitchFlapLeftModel[3].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 234
		pitchFlapLeftModel[3].setRotationPoint(-58.2F, -47F, -1.5F);
		pitchFlapLeftModel[3].rotateAngleZ = 0.15707963F;

		pitchFlapLeftModel[4].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 235
		pitchFlapLeftModel[4].setRotationPoint(-58.32F, -48.4F, -1.5F);
		pitchFlapLeftModel[4].rotateAngleX = -0.34906585F;
		pitchFlapLeftModel[4].rotateAngleZ = 0.15707963F;

		pitchFlapLeftModel[5].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 263
		pitchFlapLeftModel[5].setRotationPoint(-58.32F, -48F, 0.5F);
		pitchFlapLeftModel[5].rotateAngleX = 0.34906585F;
		pitchFlapLeftModel[5].rotateAngleZ = 0.15707963F;
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 1889, 1, textureX, textureY); // Box 72
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 2001, 1, textureX, textureY); // Box 74

		pitchFlapRightModel[0].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1F, 0F); // Box 72
		pitchFlapRightModel[0].setRotationPoint(77F, -48F, 38F);

		pitchFlapRightModel[1].addShapeBox(0F, 0F, 0F, 8, 11, 1, 0F,0F, -1F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		pitchFlapRightModel[1].setRotationPoint(77F, -59F, 38F);
	}

	private void initpitchFlapLeftWingModel_1()
	{
		pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 1033, 25, textureX, textureY); // Box 81

		pitchFlapLeftWingModel[0].addShapeBox(0F, 0F, 0F, 7, 2, 49, 0F,4F, -1F, 0F, -8F, -2F, 0F, 1F, -3F, 0F, 0F, -1F, 0F, 4F, 0F, 0F, -8F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F); // Box 81
		pitchFlapLeftWingModel[0].setRotationPoint(-32F, -36.3F, -134.3F);
		pitchFlapLeftWingModel[0].rotateAngleX = -0.10471976F;
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1913, 1, textureX, textureY); // Box 196
		tailWheelModel[1] = new ModelRendererTurbo(this, 1281, 9, textureX, textureY); // Box 197
		tailWheelModel[2] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 198
		tailWheelModel[3] = new ModelRendererTurbo(this, 1305, 9, textureX, textureY); // Box 199
		tailWheelModel[4] = new ModelRendererTurbo(this, 1329, 9, textureX, textureY); // Box 200
		tailWheelModel[5] = new ModelRendererTurbo(this, 1393, 9, textureX, textureY); // Box 201
		tailWheelModel[6] = new ModelRendererTurbo(this, 1705, 9, textureX, textureY); // Box 202
		tailWheelModel[7] = new ModelRendererTurbo(this, 1729, 9, textureX, textureY); // Box 203

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
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 2041, 1, textureX, textureY); // Box 224
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 225
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 1057, 33, textureX, textureY); // Box 226
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 1169, 33, textureX, textureY); // Box 227
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1201, 33, textureX, textureY); // Box 228
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 1281, 33, textureX, textureY); // Box 229
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 1961, 1, textureX, textureY); // Box 230
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 1905, 9, textureX, textureY); // Box 231
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 232
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 1777, 9, textureX, textureY); // Box 233
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 360
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 1369, 33, textureX, textureY); // Box 361
		leftWingWheelModel[12] = new ModelRendererTurbo(this, 2041, 33, textureX, textureY); // Box 362
		leftWingWheelModel[13] = new ModelRendererTurbo(this, 585, 41, textureX, textureY); // Box 363

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
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 921, 41, textureX, textureY); // Box 255
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1329, 33, textureX, textureY); // Box 256
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 257
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 258
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 259
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 1313, 17, textureX, textureY); // Box 260
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 261
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1865, 17, textureX, textureY); // Box 262

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