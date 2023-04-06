//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelModelTYellow extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelModelTYellow() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[79];
		leftFrontWheelModel = new ModelRendererTurbo[25];
		rightFrontWheelModel = new ModelRendererTurbo[25];
		leftBackWheelModel = new ModelRendererTurbo[25];
		rightBackWheelModel = new ModelRendererTurbo[25];
		steeringWheelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();
		initsteeringWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 164
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 227
		bodyModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 228
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 229
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 230
		bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 231
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 232
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 233
		bodyModel[16] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 234
		bodyModel[17] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 235
		bodyModel[18] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 236
		bodyModel[19] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 237
		bodyModel[20] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 238
		bodyModel[21] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 239
		bodyModel[22] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 240
		bodyModel[23] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 241
		bodyModel[24] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 242
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 243
		bodyModel[26] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 244
		bodyModel[27] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 245
		bodyModel[28] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 246
		bodyModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 247
		bodyModel[30] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Box 248
		bodyModel[31] = new ModelRendererTurbo(this, 537, 1, textureX, textureY); // Box 249
		bodyModel[32] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 250
		bodyModel[33] = new ModelRendererTurbo(this, 577, 1, textureX, textureY); // Box 251
		bodyModel[34] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 252
		bodyModel[35] = new ModelRendererTurbo(this, 625, 1, textureX, textureY); // Box 253
		bodyModel[36] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 254
		bodyModel[37] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 255
		bodyModel[38] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 256
		bodyModel[39] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 257
		bodyModel[40] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 258
		bodyModel[41] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 259
		bodyModel[42] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 260
		bodyModel[43] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 261
		bodyModel[44] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 262
		bodyModel[45] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 263
		bodyModel[46] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 264
		bodyModel[47] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 265
		bodyModel[48] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 266
		bodyModel[49] = new ModelRendererTurbo(this, 897, 1, textureX, textureY); // Box 267
		bodyModel[50] = new ModelRendererTurbo(this, 945, 1, textureX, textureY); // Box 268
		bodyModel[51] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 269
		bodyModel[52] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 270
		bodyModel[53] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 271
		bodyModel[54] = new ModelRendererTurbo(this, 745, 1, textureX, textureY); // Box 272
		bodyModel[55] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 273
		bodyModel[56] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 274
		bodyModel[57] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 285
		bodyModel[58] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 286
		bodyModel[59] = new ModelRendererTurbo(this, 665, 1, textureX, textureY); // Box 287
		bodyModel[60] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 288
		bodyModel[61] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 289
		bodyModel[62] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 290
		bodyModel[63] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 291
		bodyModel[64] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 296
		bodyModel[65] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 297
		bodyModel[66] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 298
		bodyModel[67] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 299
		bodyModel[68] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 300
		bodyModel[69] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 301
		bodyModel[70] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 302
		bodyModel[71] = new ModelRendererTurbo(this, 889, 9, textureX, textureY); // Box 303
		bodyModel[72] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 304
		bodyModel[73] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 305
		bodyModel[74] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 243
		bodyModel[75] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 188
		bodyModel[76] = new ModelRendererTurbo(this, 745, 17, textureX, textureY); // Box 189
		bodyModel[77] = new ModelRendererTurbo(this, 266, 16, textureX, textureY); // Box 0
		bodyModel[78] = new ModelRendererTurbo(this, 266, 16, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, -1F, 0F, 1, 3, 1, 0F,14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(3F, -1F, -7F);

		bodyModel[1].addShapeBox(0F, -1F, 0F, 1, 3, 1, 0F,7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, 7F, 0F, 0F); // Box 3
		bodyModel[1].setRotationPoint(25F, -1F, -7F);

		bodyModel[2].addShapeBox(0F, -1F, 0F, 4, 3, 1, 0F,7F, -0.75F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, -0.75F, 0F); // Box 4
		bodyModel[2].setRotationPoint(-22F, -1F, -7F);

		bodyModel[3].addShapeBox(0F, -1F, 0F, 4, 3, 1, 0F,7F, -0.75F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, -0.75F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-22F, -1F, 6F);

		bodyModel[4].addShapeBox(0F, -1F, 0F, 1, 3, 1, 0F,14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F); // Box 6
		bodyModel[4].setRotationPoint(3F, -1F, 6F);

		bodyModel[5].addShapeBox(0F, -1F, 0F, 1, 3, 1, 0F,7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, 7F, 0F, 0F, 7F, 0F, 0F, 7F, -0.75F, 0F, 7F, -0.75F, 0F, 7F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(25F, -1F, 6F);

		bodyModel[6].addShapeBox(0F, -1F, 0F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[6].setRotationPoint(31F, 2F, -14F);

		bodyModel[7].addShapeBox(0F, -1F, 0F, 1, 1, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[7].setRotationPoint(-23F, 2F, -14F);

		bodyModel[8].addShapeBox(0F, -1F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		bodyModel[8].setRotationPoint(31F, 1F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F); // Box 227
		bodyModel[9].setRotationPoint(-3F, 0F, 11F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[10].setRotationPoint(13F, 0F, 11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[11].setRotationPoint(17F, -2.5F, 11F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[12].setRotationPoint(21F, -6F, 11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[13].setRotationPoint(25F, -9F, 11F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 232
		bodyModel[14].setRotationPoint(29F, -9F, 11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F); // Box 233
		bodyModel[15].setRotationPoint(33F, -9F, 11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[16].setRotationPoint(-13F, -1F, 8F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1.25F, 2F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, 0F, 1.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[17].setRotationPoint(-13F, -4F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,3F, 1.5F, 0F, -3.25F, 2.25F, 0F, -3.25F, 2.25F, 0F, 3F, 1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 236
		bodyModel[18].setRotationPoint(-14F, -7F, 8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F); // Box 237
		bodyModel[19].setRotationPoint(-21F, -10F, 8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 238
		bodyModel[20].setRotationPoint(-25F, -10F, 8F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F); // Box 239
		bodyModel[21].setRotationPoint(-29F, -10F, 8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F); // Box 240
		bodyModel[22].setRotationPoint(-30F, -8F, 8F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.75F, 0F); // Box 241
		bodyModel[23].setRotationPoint(-31F, -7F, 11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 2F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, -1F, 2F, 0F, 0.5F, 1F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, 1F, 0F); // Box 242
		bodyModel[24].setRotationPoint(-32F, -4F, 11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F); // Box 243
		bodyModel[25].setRotationPoint(33F, -9F, -15F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 244
		bodyModel[26].setRotationPoint(29F, -9F, -15F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[27].setRotationPoint(25F, -9F, -15F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[28].setRotationPoint(21F, -6F, -15F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[29].setRotationPoint(17F, -2.5F, -15F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[30].setRotationPoint(13F, 0F, -15F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F); // Box 249
		bodyModel[31].setRotationPoint(-3F, 0F, -15F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1.25F, 2F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, 0F, 1.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[32].setRotationPoint(-13F, -4F, -15F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[33].setRotationPoint(-13F, -1F, -15F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,3F, 1.5F, 0F, -3.25F, 2.25F, 0F, -3.25F, 2.25F, 0F, 3F, 1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 252
		bodyModel[34].setRotationPoint(-14F, -7F, -15F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F); // Box 253
		bodyModel[35].setRotationPoint(-21F, -10F, -15F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 254
		bodyModel[36].setRotationPoint(-25F, -10F, -15F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F); // Box 255
		bodyModel[37].setRotationPoint(-29F, -10F, -15F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F); // Box 256
		bodyModel[38].setRotationPoint(-30F, -8F, -15F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.75F, 0F); // Box 257
		bodyModel[39].setRotationPoint(-31F, -7F, -15F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 2F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, -1F, 2F, 0F, 0.5F, 1F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, 1F, 0F); // Box 258
		bodyModel[40].setRotationPoint(-32F, -4F, -15F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,10F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 5F, 0F); // Box 259
		bodyModel[41].setRotationPoint(3F, -10F, 9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,10F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 5F, 0F, 10F, 5F, 0F); // Box 260
		bodyModel[42].setRotationPoint(3F, -10F, -10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,10F, -1.75F, 3F, 0F, 1.25F, 3F, 0F, 1.25F, 3F, 10F, -1.75F, 3F, 10F, 5F, 3F, 0F, 5F, 3F, 0F, 5F, 3F, 10F, 5F, 3F); // Box 261
		bodyModel[43].setRotationPoint(-14F, -10F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 38, 1, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 262
		bodyModel[44].setRotationPoint(-24F, -3F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 263
		bodyModel[45].setRotationPoint(13F, -16F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -1.5F, 10F, 0F, -2.25F, 10F, 0F, 2.25F, 10F, 0F, 2.25F); // Box 264
		bodyModel[46].setRotationPoint(-2F, -2F, 9F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 2.25F, 10F, 0F, 2.25F, 10F, 0F, -2.25F, 10F, 0F, -1.5F); // Box 265
		bodyModel[47].setRotationPoint(-2F, -2F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 10, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 266
		bodyModel[48].setRotationPoint(14F, -13F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 267
		bodyModel[49].setRotationPoint(14F, -14F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 268
		bodyModel[50].setRotationPoint(14F, -3F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 269
		bodyModel[51].setRotationPoint(30F, -3F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[52].setRotationPoint(30F, -13F, 4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 271
		bodyModel[53].setRotationPoint(30F, -14F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[54].setRotationPoint(30F, -13F, -5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[55].setRotationPoint(30F, -13F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[56].setRotationPoint(7F, -19F, 3.5F);
		bodyModel[56].rotateAngleZ = -0.64577182F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.75F, 5.75F, 0F, 0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.75F, 5.75F); // Box 285
		bodyModel[57].setRotationPoint(14F, -13F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 1.75F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.75F, 1.5F, 0F, -0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.75F, 5.75F); // Box 286
		bodyModel[58].setRotationPoint(14F, -14F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.75F, 5.75F, 0F, 1.75F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.75F, 1.5F); // Box 287
		bodyModel[59].setRotationPoint(14F, -3F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 288
		bodyModel[60].setRotationPoint(-3F, -10F, -6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -1.25F, 0F, 3F, 2.25F, 0F, 3F, 2.25F, 0F, 3F, -1.25F, 0F, 3F); // Box 289
		bodyModel[61].setRotationPoint(-5F, -17F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[62].setRotationPoint(-3F, -16F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[63].setRotationPoint(-3F, -16F, 8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[64].setRotationPoint(13F, 0F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[65].setRotationPoint(17F, -2.5F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[66].setRotationPoint(21F, -6F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -6F, 0F, 0F, -5.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 5.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[67].setRotationPoint(25F, -9F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -5.25F, 0F, -1.75F, -5.25F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 5.25F, 0F, -1.5F, 5.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[68].setRotationPoint(29F, -9F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.75F, 0F, 0F, 0.5F, 0F, -1.75F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -1.5F, 5.25F, 0F, 0F, 5.25F, 0F); // Box 301
		bodyModel[69].setRotationPoint(29F, -9F, -11F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -5.25F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 5.25F, 0F, 0F, 6F, 0F); // Box 302
		bodyModel[70].setRotationPoint(25F, -9F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 303
		bodyModel[71].setRotationPoint(21F, -6F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[72].setRotationPoint(17F, -2.5F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[73].setRotationPoint(13F, 0F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 9, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 243
		bodyModel[74].setRotationPoint(-7F, -14F, -6F);

		bodyModel[75].addShapeBox(3F, 1F, 1F, 1, 3, 1, 0F,10F, 4.25F, 0F, -8F, 4.25F, 0F, -8F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, -6.5F, 0F, -8F, -6.5F, 0F, -8F, -6.5F, 0F, 10F, -6.5F, 0F); // Box 188
		bodyModel[75].setRotationPoint(3F, -9F, 8.5F);

		bodyModel[76].addShapeBox(3F, 2F, 1F, 1, 3, 1, 0F,10F, 4.25F, 0F, -8F, 4.25F, 0F, -8F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, -6.5F, 0F, -8F, -6.5F, 0F, -8F, -6.5F, 0F, 10F, -6.5F, 0F); // Box 189
		bodyModel[76].setRotationPoint(3F, -10F, -11.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[77].setRotationPoint(31F, -10F, 4.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[78].setRotationPoint(31F, -10F, -7.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 308
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 309
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 310
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 311
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 312
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 313
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 314
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 513, 9, textureX, textureY); // Box 315
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 529, 9, textureX, textureY); // Box 316
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 537, 9, textureX, textureY); // Box 317
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 569, 9, textureX, textureY); // Box 318
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 593, 9, textureX, textureY); // Box 319
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 320
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 841, 9, textureX, textureY); // Box 321
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 905, 9, textureX, textureY); // Box 322
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 323
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 929, 9, textureX, textureY); // Box 324
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 937, 9, textureX, textureY); // Box 325
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 326
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 961, 9, textureX, textureY); // Box 327
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 328
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 977, 9, textureX, textureY); // Box 329
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 330
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 331
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 332

		leftFrontWheelModel[0].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F); // Box 308
		leftFrontWheelModel[0].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[1].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F); // Box 309
		leftFrontWheelModel[1].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[2].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F); // Box 310
		leftFrontWheelModel[2].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[3].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6.4F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6F, 3.8F, 0F, 6.45F, -3.95F, 0F); // Box 311
		leftFrontWheelModel[3].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[4].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F); // Box 312
		leftFrontWheelModel[4].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[5].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F); // Box 313
		leftFrontWheelModel[5].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[6].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F); // Box 314
		leftFrontWheelModel[6].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[7].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.45F, -3.95F, 0F, 6F, 3.8F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.4F, -3.95F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F); // Box 315
		leftFrontWheelModel[7].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[8].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 316
		leftFrontWheelModel[8].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[9].addShapeBox(6.5F, -3.5F, 0F, 1, 1, 1, 0F,1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F); // Box 317
		leftFrontWheelModel[9].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[10].addShapeBox(4.5F, -6.5F, 0F, 1, 1, 1, 0F,-0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F); // Box 318
		leftFrontWheelModel[10].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[11].addShapeBox(-5.5F, -6.5F, 0F, 1, 1, 1, 0F,1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F); // Box 319
		leftFrontWheelModel[11].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[12].addShapeBox(-7.5F, -3.5F, 0F, 1, 1, 1, 0F,-0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F); // Box 320
		leftFrontWheelModel[12].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[13].addShapeBox(-8.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 321
		leftFrontWheelModel[13].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[14].addShapeBox(-7.5F, 2.5F, 0F, 1, 1, 1, 0F,1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F); // Box 322
		leftFrontWheelModel[14].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[15].addShapeBox(-5.5F, 5.5F, 0F, 1, 1, 1, 0F,0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F); // Box 323
		leftFrontWheelModel[15].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[16].addShapeBox(-3.5F, 6.5F, 0F, 1, 1, 1, 0F,0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F); // Box 324
		leftFrontWheelModel[16].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[17].addShapeBox(-0.5F, 7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 325
		leftFrontWheelModel[17].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[18].addShapeBox(2.5F, 6.5F, 0F, 1, 1, 1, 0F,1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F); // Box 326
		leftFrontWheelModel[18].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[19].addShapeBox(4.5F, 5.5F, 0F, 1, 1, 1, 0F,1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F); // Box 327
		leftFrontWheelModel[19].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[20].addShapeBox(6.5F, 2.5F, 0F, 1, 1, 1, 0F,-0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F); // Box 328
		leftFrontWheelModel[20].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[21].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 329
		leftFrontWheelModel[21].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[22].addShapeBox(-3.5F, -7.5F, 0F, 1, 1, 1, 0F,1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F); // Box 330
		leftFrontWheelModel[22].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[23].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 331
		leftFrontWheelModel[23].setRotationPoint(31.5F, 1.5F, 12F);

		leftFrontWheelModel[24].addShapeBox(2.5F, -7.5F, 0F, 1, 1, 1, 0F,0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F); // Box 332
		leftFrontWheelModel[24].setRotationPoint(31.5F, 1.5F, 12F);
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 243
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 270
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 271
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 272
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 273
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 274
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 275
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 276
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 277
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 279
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 280
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 889, 1, textureX, textureY); // Box 281
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Box 282
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 985, 1, textureX, textureY); // Box 284
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 285
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 286
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 287
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 289
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 292
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 293
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 294
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 304
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 305
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 306
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 307

		rightFrontWheelModel[0].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F); // Box 243
		rightFrontWheelModel[0].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[1].addShapeBox(-0.5F, 7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 270
		rightFrontWheelModel[1].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[2].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F); // Box 271
		rightFrontWheelModel[2].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[3].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F); // Box 272
		rightFrontWheelModel[3].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[4].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F); // Box 273
		rightFrontWheelModel[4].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[5].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 274
		rightFrontWheelModel[5].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[6].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 275
		rightFrontWheelModel[6].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[7].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 276
		rightFrontWheelModel[7].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[8].addShapeBox(-8.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 277
		rightFrontWheelModel[8].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[9].addShapeBox(-5.5F, -6.5F, 0F, 1, 1, 1, 0F,1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F); // Box 279
		rightFrontWheelModel[9].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[10].addShapeBox(4.5F, -6.5F, 0F, 1, 1, 1, 0F,-0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F); // Box 280
		rightFrontWheelModel[10].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[11].addShapeBox(-5.5F, 5.5F, 0F, 1, 1, 1, 0F,0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F); // Box 281
		rightFrontWheelModel[11].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[12].addShapeBox(4.5F, 5.5F, 0F, 1, 1, 1, 0F,1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F); // Box 282
		rightFrontWheelModel[12].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[13].addShapeBox(-7.5F, 2.5F, 0F, 1, 1, 1, 0F,1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F); // Box 284
		rightFrontWheelModel[13].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[14].addShapeBox(6.5F, 2.5F, 0F, 1, 1, 1, 0F,-0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F); // Box 285
		rightFrontWheelModel[14].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[15].addShapeBox(6.5F, -3.5F, 0F, 1, 1, 1, 0F,1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F); // Box 286
		rightFrontWheelModel[15].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[16].addShapeBox(-7.5F, -3.5F, 0F, 1, 1, 1, 0F,-0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F); // Box 287
		rightFrontWheelModel[16].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[17].addShapeBox(-3.5F, -7.5F, 0F, 1, 1, 1, 0F,1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F); // Box 289
		rightFrontWheelModel[17].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[18].addShapeBox(2.5F, -7.5F, 0F, 1, 1, 1, 0F,0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F); // Box 292
		rightFrontWheelModel[18].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[19].addShapeBox(2.5F, 6.5F, 0F, 1, 1, 1, 0F,1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F); // Box 293
		rightFrontWheelModel[19].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[20].addShapeBox(-3.5F, 6.5F, 0F, 1, 1, 1, 0F,0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F); // Box 294
		rightFrontWheelModel[20].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[21].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F); // Box 304
		rightFrontWheelModel[21].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[22].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F); // Box 305
		rightFrontWheelModel[22].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[23].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6.4F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6F, 3.8F, 0F, 6.45F, -3.95F, 0F); // Box 306
		rightFrontWheelModel[23].setRotationPoint(31.5F, 1.5F, -13F);

		rightFrontWheelModel[24].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.45F, -3.95F, 0F, 6F, 3.8F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.4F, -3.95F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F); // Box 307
		rightFrontWheelModel[24].setRotationPoint(31.5F, 1.5F, -13F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 333
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 334
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 335
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 336
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 337
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 338
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 339
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 340
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 341
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 342
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 343
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 344
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 345
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 346
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 347
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 348
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 349
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 350
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 351
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 352
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 353
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 354
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 355
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 356
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 357

		leftBackWheelModel[0].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F); // Box 333
		leftBackWheelModel[0].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[1].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F); // Box 334
		leftBackWheelModel[1].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[2].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F); // Box 335
		leftBackWheelModel[2].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[3].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6.4F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6F, 3.8F, 0F, 6.45F, -3.95F, 0F); // Box 336
		leftBackWheelModel[3].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[4].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F); // Box 337
		leftBackWheelModel[4].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[5].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F); // Box 338
		leftBackWheelModel[5].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[6].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F); // Box 339
		leftBackWheelModel[6].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[7].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.45F, -3.95F, 0F, 6F, 3.8F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.4F, -3.95F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F); // Box 340
		leftBackWheelModel[7].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[8].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 341
		leftBackWheelModel[8].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[9].addShapeBox(6.5F, -3.5F, 0F, 1, 1, 1, 0F,1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F); // Box 342
		leftBackWheelModel[9].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[10].addShapeBox(4.5F, -6.5F, 0F, 1, 1, 1, 0F,-0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F); // Box 343
		leftBackWheelModel[10].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[11].addShapeBox(-5.5F, -6.5F, 0F, 1, 1, 1, 0F,1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F); // Box 344
		leftBackWheelModel[11].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[12].addShapeBox(-7.5F, -3.5F, 0F, 1, 1, 1, 0F,-0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F); // Box 345
		leftBackWheelModel[12].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[13].addShapeBox(-8.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 346
		leftBackWheelModel[13].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[14].addShapeBox(-7.5F, 2.5F, 0F, 1, 1, 1, 0F,1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F); // Box 347
		leftBackWheelModel[14].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[15].addShapeBox(-5.5F, 5.5F, 0F, 1, 1, 1, 0F,0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F); // Box 348
		leftBackWheelModel[15].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[16].addShapeBox(-3.5F, 6.5F, 0F, 1, 1, 1, 0F,0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F); // Box 349
		leftBackWheelModel[16].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[17].addShapeBox(-0.5F, 7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 350
		leftBackWheelModel[17].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[18].addShapeBox(2.5F, 6.5F, 0F, 1, 1, 1, 0F,1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F); // Box 351
		leftBackWheelModel[18].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[19].addShapeBox(4.5F, 5.5F, 0F, 1, 1, 1, 0F,1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F); // Box 352
		leftBackWheelModel[19].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[20].addShapeBox(6.5F, 2.5F, 0F, 1, 1, 1, 0F,-0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F); // Box 353
		leftBackWheelModel[20].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[21].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 354
		leftBackWheelModel[21].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[22].addShapeBox(-3.5F, -7.5F, 0F, 1, 1, 1, 0F,1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F); // Box 355
		leftBackWheelModel[22].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[23].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 356
		leftBackWheelModel[23].setRotationPoint(-22.5F, 1.5F, 12F);

		leftBackWheelModel[24].addShapeBox(2.5F, -7.5F, 0F, 1, 1, 1, 0F,0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F); // Box 357
		leftBackWheelModel[24].setRotationPoint(-22.5F, 1.5F, 12F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 358
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 359
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 360
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 361
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 362
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 577, 17, textureX, textureY); // Box 363
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 585, 17, textureX, textureY); // Box 364
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 593, 17, textureX, textureY); // Box 365
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 366
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 609, 17, textureX, textureY); // Box 367
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 368
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 369
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 370
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 641, 17, textureX, textureY); // Box 371
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 649, 17, textureX, textureY); // Box 372
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 657, 17, textureX, textureY); // Box 373
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 665, 17, textureX, textureY); // Box 374
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 673, 17, textureX, textureY); // Box 375
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 681, 17, textureX, textureY); // Box 376
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 689, 17, textureX, textureY); // Box 377
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 697, 17, textureX, textureY); // Box 378
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 379
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 713, 17, textureX, textureY); // Box 380
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 721, 17, textureX, textureY); // Box 381
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 729, 17, textureX, textureY); // Box 382

		rightBackWheelModel[0].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F); // Box 358
		rightBackWheelModel[0].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[1].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F); // Box 359
		rightBackWheelModel[1].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[2].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F, 1.5F, -1.25F, 0.5F); // Box 360
		rightBackWheelModel[2].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[3].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 6.4F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6F, 3.8F, 0F, 6.45F, -3.95F, 0F); // Box 361
		rightBackWheelModel[3].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[4].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F); // Box 362
		rightBackWheelModel[4].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[5].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F); // Box 363
		rightBackWheelModel[5].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[6].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,-3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F, 3.8F, 5.95F, 0F, -3.95F, 6.45F, 0F, 3.8F, 6F, 0F, -3.95F, 6.4F, 0F, -3.95F, 6.45F, 0F, 3.8F, 5.95F, 0F); // Box 364
		rightBackWheelModel[6].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[7].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.45F, -3.95F, 0F, 6F, 3.8F, 0F, 5.95F, 3.8F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F, 6.4F, -3.95F, 0F, 6.45F, -3.95F, 0F, 5.95F, 3.8F, 0F); // Box 365
		rightBackWheelModel[7].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[8].addShapeBox(6.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 366
		rightBackWheelModel[8].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[9].addShapeBox(6.5F, -3.5F, 0F, 1, 1, 1, 0F,1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F); // Box 367
		rightBackWheelModel[9].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[10].addShapeBox(4.5F, -6.5F, 0F, 1, 1, 1, 0F,-0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F); // Box 368
		rightBackWheelModel[10].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[11].addShapeBox(-5.5F, -6.5F, 0F, 1, 1, 1, 0F,1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F); // Box 369
		rightBackWheelModel[11].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[12].addShapeBox(-7.5F, -3.5F, 0F, 1, 1, 1, 0F,-0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F); // Box 370
		rightBackWheelModel[12].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[13].addShapeBox(-8.5F, -0.5F, 0F, 1, 1, 1, 0F,0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F); // Box 371
		rightBackWheelModel[13].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[14].addShapeBox(-7.5F, 2.5F, 0F, 1, 1, 1, 0F,1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, -0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F); // Box 372
		rightBackWheelModel[14].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[15].addShapeBox(-5.5F, 5.5F, 0F, 1, 1, 1, 0F,0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, 1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F); // Box 373
		rightBackWheelModel[15].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[16].addShapeBox(-3.5F, 6.5F, 0F, 1, 1, 1, 0F,0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F); // Box 374
		rightBackWheelModel[16].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[17].addShapeBox(-0.5F, 7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 375
		rightBackWheelModel[17].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[18].addShapeBox(2.5F, 6.5F, 0F, 1, 1, 1, 0F,1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F); // Box 376
		rightBackWheelModel[18].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[19].addShapeBox(4.5F, 5.5F, 0F, 1, 1, 1, 0F,1.15F, -0.35F, 0.5F, 0.35F, 2.15F, 0.5F, 0.35F, 2.15F, 0.5F, 1.15F, -0.35F, 0.5F, -0.25F, 0.75F, 0.5F, 1.75F, -1.75F, 0.5F, 1.75F, -1.75F, 0.5F, -0.25F, 0.75F, 0.5F); // Box 377
		rightBackWheelModel[19].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[20].addShapeBox(6.5F, 2.5F, 0F, 1, 1, 1, 0F,-0.15F, 1.65F, 0.5F, 1F, 0.85F, 0.5F, 1F, 0.85F, 0.5F, -0.15F, 1.65F, 0.5F, 1.15F, 0.6F, 0.5F, -0.3F, 1.35F, 0.5F, -0.3F, 1.35F, 0.5F, 1.15F, 0.6F, 0.5F); // Box 378
		rightBackWheelModel[20].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[21].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 1, 0F,6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F, 6.5F, 0F, 0F); // Box 379
		rightBackWheelModel[21].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[22].addShapeBox(-3.5F, -7.5F, 0F, 1, 1, 1, 0F,1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F); // Box 380
		rightBackWheelModel[22].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[23].addShapeBox(-0.5F, -7.5F, 0F, 1, 1, 1, 0F,1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 1F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, 0.5F); // Box 381
		rightBackWheelModel[23].setRotationPoint(-22.5F, 1.5F, -13F);

		rightBackWheelModel[24].addShapeBox(2.5F, -7.5F, 0F, 1, 1, 1, 0F,0.85F, 1F, 0.5F, 1.35F, -0.3F, 0.5F, 1.35F, -0.3F, 0.5F, 0.85F, 1F, 0.5F, 1.65F, -0.15F, 0.5F, 0.6F, 1.15F, 0.5F, 0.6F, 1.15F, 0.5F, 1.65F, -0.15F, 0.5F); // Box 382
		rightBackWheelModel[24].setRotationPoint(-22.5F, 1.5F, -13F);
	}

	private void initsteeringWheelModel_1()
	{
		steeringWheelModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 275
		steeringWheelModel[1] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 277
		steeringWheelModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 281
		steeringWheelModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 283
		steeringWheelModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 284
		steeringWheelModel[5] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 295
		steeringWheelModel[6] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 296
		steeringWheelModel[7] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 297
		steeringWheelModel[8] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 298
		steeringWheelModel[9] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 299

		steeringWheelModel[0].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F); // Box 275
		steeringWheelModel[0].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[1].addShapeBox(0F, 2F, -0.5F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F); // Box 277
		steeringWheelModel[1].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[2].addShapeBox(0F, -0.5F, 2F, 1, 1, 1, 0F,-0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F); // Box 281
		steeringWheelModel[2].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[3].addShapeBox(0F, -3F, -0.5F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F); // Box 283
		steeringWheelModel[3].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[4].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F, -0.25F, -0.25F, 2F); // Box 284
		steeringWheelModel[4].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[5].addShapeBox(0F, -0.5F, -3F, 1, 1, 1, 0F,-0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F, -0.25F, 0.65F, -0.25F); // Box 295
		steeringWheelModel[5].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[6].addShapeBox(0F, 0.5F, 1F, 1, 1, 1, 0F,-0.25F, -0.3F, -1.4F, -0.25F, -0.3F, -1.4F, -0.25F, -0.6F, 0.75F, -0.25F, -0.6F, 0.75F, -0.25F, 0.9F, 0.2F, -0.25F, 0.9F, 0.2F, -0.25F, 1.25F, -0.85F, -0.25F, 1.25F, -0.85F); // Box 296
		steeringWheelModel[6].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[7].addShapeBox(0F, 0.5F, -2F, 1, 1, 1, 0F,-0.25F, -0.6F, 0.75F, -0.25F, -0.6F, 0.75F, -0.25F, -0.3F, -1.4F, -0.25F, -0.3F, -1.4F, -0.25F, 1.25F, -0.85F, -0.25F, 1.25F, -0.85F, -0.25F, 0.9F, 0.2F, -0.25F, 0.9F, 0.2F); // Box 297
		steeringWheelModel[7].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[8].addShapeBox(0F, -1.5F, -2F, 1, 1, 1, 0F,-0.25F, 1.25F, -0.85F, -0.25F, 1.25F, -0.85F, -0.25F, 0.9F, 0.2F, -0.25F, 0.9F, 0.2F, -0.25F, -0.6F, 0.75F, -0.25F, -0.6F, 0.75F, -0.25F, -0.3F, -1.4F, -0.25F, -0.3F, -1.4F); // Box 298
		steeringWheelModel[8].setRotationPoint(6F, -19F, 4F);

		steeringWheelModel[9].addShapeBox(0F, -1.5F, 1F, 1, 1, 1, 0F,-0.25F, 0.9F, 0.2F, -0.25F, 0.9F, 0.2F, -0.25F, 1.25F, -0.85F, -0.25F, 1.25F, -0.85F, -0.25F, -0.3F, -1.4F, -0.25F, -0.3F, -1.4F, -0.25F, -0.6F, 0.75F, -0.25F, -0.6F, 0.75F); // Box 299
		steeringWheelModel[9].setRotationPoint(6F, -19F, 4F);
	}
}