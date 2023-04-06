//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelModelTlimo extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelModelTlimo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[115];
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
		bodyModel[0] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 11
		bodyModel[8] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 164
		bodyModel[9] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 168
		bodyModel[10] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 190
		bodyModel[11] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 193
		bodyModel[12] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 194
		bodyModel[13] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 195
		bodyModel[14] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 199
		bodyModel[15] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 201
		bodyModel[16] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 202
		bodyModel[17] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 203
		bodyModel[18] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 204
		bodyModel[19] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 205
		bodyModel[20] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 206
		bodyModel[21] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 207
		bodyModel[22] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 208
		bodyModel[23] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 209
		bodyModel[24] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 210
		bodyModel[25] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 211
		bodyModel[26] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 212
		bodyModel[27] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 213
		bodyModel[28] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 214
		bodyModel[29] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 215
		bodyModel[30] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 216
		bodyModel[31] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 217
		bodyModel[32] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 218
		bodyModel[33] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 219
		bodyModel[34] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 220
		bodyModel[35] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 221
		bodyModel[36] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 222
		bodyModel[37] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 223
		bodyModel[38] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 224
		bodyModel[39] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 225
		bodyModel[40] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 227
		bodyModel[41] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 228
		bodyModel[42] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 229
		bodyModel[43] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 230
		bodyModel[44] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 231
		bodyModel[45] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 232
		bodyModel[46] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 233
		bodyModel[47] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 234
		bodyModel[48] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 235
		bodyModel[49] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 236
		bodyModel[50] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 237
		bodyModel[51] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 238
		bodyModel[52] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 239
		bodyModel[53] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 240
		bodyModel[54] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 241
		bodyModel[55] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 242
		bodyModel[56] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 243
		bodyModel[57] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 244
		bodyModel[58] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 245
		bodyModel[59] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 246
		bodyModel[60] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 247
		bodyModel[61] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 248
		bodyModel[62] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 249
		bodyModel[63] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 250
		bodyModel[64] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 251
		bodyModel[65] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 252
		bodyModel[66] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 253
		bodyModel[67] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 254
		bodyModel[68] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 255
		bodyModel[69] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 256
		bodyModel[70] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 257
		bodyModel[71] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 258
		bodyModel[72] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 259
		bodyModel[73] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 260
		bodyModel[74] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 261
		bodyModel[75] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 262
		bodyModel[76] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 263
		bodyModel[77] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 264
		bodyModel[78] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 265
		bodyModel[79] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 266
		bodyModel[80] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 267
		bodyModel[81] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 268
		bodyModel[82] = new ModelRendererTurbo(this, 0, 324, textureX, textureY); // Box 269
		bodyModel[83] = new ModelRendererTurbo(this, 0, 324, textureX, textureY); // Box 270
		bodyModel[84] = new ModelRendererTurbo(this, 0, 324, textureX, textureY); // Box 271
		bodyModel[85] = new ModelRendererTurbo(this, 0, 324, textureX, textureY); // Box 272
		bodyModel[86] = new ModelRendererTurbo(this, 0, 62, textureX, textureY); // Box 273
		bodyModel[87] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 274
		bodyModel[88] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 285
		bodyModel[89] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 286
		bodyModel[90] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 287
		bodyModel[91] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 288
		bodyModel[92] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 289
		bodyModel[93] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 290
		bodyModel[94] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 291
		bodyModel[95] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 292
		bodyModel[96] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 293
		bodyModel[97] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 294
		bodyModel[98] = new ModelRendererTurbo(this, 0, 197, textureX, textureY); // Box 295
		bodyModel[99] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 296
		bodyModel[100] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 297
		bodyModel[101] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 298
		bodyModel[102] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 299
		bodyModel[103] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 300
		bodyModel[104] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 301
		bodyModel[105] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 302
		bodyModel[106] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 303
		bodyModel[107] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 304
		bodyModel[108] = new ModelRendererTurbo(this, 0, 388, textureX, textureY); // Box 305
		bodyModel[109] = new ModelRendererTurbo(this, 483, 31, textureX, textureY); // Box 188
		bodyModel[110] = new ModelRendererTurbo(this, 483, 31, textureX, textureY); // Box 189
		bodyModel[111] = new ModelRendererTurbo(this, 483, 31, textureX, textureY); // Box 221
		bodyModel[112] = new ModelRendererTurbo(this, 483, 31, textureX, textureY); // Box 222
		bodyModel[113] = new ModelRendererTurbo(this, 266, 16, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 266, 16, textureX, textureY); // Box 0

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

		bodyModel[9].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 168
		bodyModel[9].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[9].rotateAngleX = -3.14159265F;

		bodyModel[10].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 190
		bodyModel[10].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[10].rotateAngleX = -3.14159265F;

		bodyModel[11].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, -1.25F, 1.5F, 0.5F, -1.25F, 1.5F, 0.5F, -1.25F, 1.5F, 0.5F, -1.25F, 1.5F); // Box 193
		bodyModel[11].setRotationPoint(-30.5F, -9.5F, -0.5F);

		bodyModel[12].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,0.5F, -1.25F, 1.5F, 0.5F, -1.25F, 1.5F, 0.5F, -1.25F, 1.5F, 0.5F, -1.25F, 1.5F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F, 0.5F, 1.5F, 0.25F); // Box 194
		bodyModel[12].setRotationPoint(-30.5F, -9.5F, -0.5F);

		bodyModel[13].addShapeBox(-0.5F, -0.5F, 0F, 5, 1, 1, 0F,0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F, 0.5F, 0.25F, 1.5F); // Box 195
		bodyModel[13].setRotationPoint(-30.5F, -9.5F, -0.5F);

		bodyModel[14].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 199
		bodyModel[14].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[14].rotateAngleX = -2.74016693F;

		bodyModel[15].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 201
		bodyModel[15].setRotationPoint(-31F, -9.5F, 0F);

		bodyModel[16].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 202
		bodyModel[16].setRotationPoint(-31F, -9.5F, 0F);

		bodyModel[17].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 203
		bodyModel[17].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[17].rotateAngleX = 0.40142573F;

		bodyModel[18].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 204
		bodyModel[18].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[18].rotateAngleX = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 205
		bodyModel[19].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[19].rotateAngleX = -1.57079633F;

		bodyModel[20].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 206
		bodyModel[20].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[20].rotateAngleX = -1.1693706F;

		bodyModel[21].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 207
		bodyModel[21].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[21].rotateAngleX = 1.97222205F;

		bodyModel[22].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 208
		bodyModel[22].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[22].rotateAngleX = 1.57079633F;

		bodyModel[23].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 209
		bodyModel[23].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[23].rotateAngleX = 1.57079633F;

		bodyModel[24].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 210
		bodyModel[24].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[24].rotateAngleX = -0.78539816F;

		bodyModel[25].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 211
		bodyModel[25].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[25].rotateAngleX = -0.38397244F;

		bodyModel[26].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 212
		bodyModel[26].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[26].rotateAngleX = 2.75762022F;

		bodyModel[27].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 213
		bodyModel[27].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[27].rotateAngleX = 2.35619449F;

		bodyModel[28].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 214
		bodyModel[28].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[28].rotateAngleX = 1.18682389F;

		bodyModel[29].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 215
		bodyModel[29].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[29].rotateAngleX = 0.78539816F;

		bodyModel[30].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 216
		bodyModel[30].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[30].rotateAngleX = -2.35619449F;

		bodyModel[31].addShapeBox(0F, 7.5F, -0.5F, 1, 1, 1, 0F,0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 1F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F, 0.5F, 0F, 1.25F); // Box 217
		bodyModel[31].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[31].rotateAngleX = -1.95476876F;

		bodyModel[32].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 218
		bodyModel[32].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[32].rotateAngleX = 1.04719755F;

		bodyModel[33].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 219
		bodyModel[33].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[33].rotateAngleX = -2.0943951F;

		bodyModel[34].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 220
		bodyModel[34].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[34].rotateAngleX = -0.52359878F;

		bodyModel[35].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 221
		bodyModel[35].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[35].rotateAngleX = -3.66519143F;

		bodyModel[36].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 222
		bodyModel[36].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[36].rotateAngleX = 0.52359878F;

		bodyModel[37].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 223
		bodyModel[37].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[37].rotateAngleX = -2.61799388F;

		bodyModel[38].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 224
		bodyModel[38].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[38].rotateAngleX = -1.04719755F;

		bodyModel[39].addShapeBox(0F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F); // Box 225
		bodyModel[39].setRotationPoint(-31F, -9.5F, 0F);
		bodyModel[39].rotateAngleX = -4.1887902F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F); // Box 227
		bodyModel[40].setRotationPoint(-3F, 0F, 11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 228
		bodyModel[41].setRotationPoint(13F, 0F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[42].setRotationPoint(17F, -2.5F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 230
		bodyModel[43].setRotationPoint(21F, -6F, 11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[44].setRotationPoint(25F, -9F, 11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 232
		bodyModel[45].setRotationPoint(29F, -9F, 11F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F); // Box 233
		bodyModel[46].setRotationPoint(33F, -9F, 11F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 234
		bodyModel[47].setRotationPoint(-13F, -1F, 8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1.25F, 2F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, 0F, 1.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[48].setRotationPoint(-13F, -4F, 8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,3F, 1.5F, 0F, -3.25F, 2.25F, 0F, -3.25F, 2.25F, 0F, 3F, 1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 236
		bodyModel[49].setRotationPoint(-14F, -7F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F); // Box 237
		bodyModel[50].setRotationPoint(-21F, -10F, 8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 238
		bodyModel[51].setRotationPoint(-25F, -10F, 8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F); // Box 239
		bodyModel[52].setRotationPoint(-29F, -10F, 8F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F); // Box 240
		bodyModel[53].setRotationPoint(-30F, -8F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.75F, 0F); // Box 241
		bodyModel[54].setRotationPoint(-31F, -7F, 11F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 2F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, -1F, 2F, 0F, 0.5F, 1F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, 1F, 0F); // Box 242
		bodyModel[55].setRotationPoint(-32F, -4F, 11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F); // Box 243
		bodyModel[56].setRotationPoint(33F, -9F, -15F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 244
		bodyModel[57].setRotationPoint(29F, -9F, -15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[58].setRotationPoint(25F, -9F, -15F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 246
		bodyModel[59].setRotationPoint(21F, -6F, -15F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[60].setRotationPoint(17F, -2.5F, -15F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[61].setRotationPoint(13F, 0F, -15F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F); // Box 249
		bodyModel[62].setRotationPoint(-3F, 0F, -15F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,1.25F, 2F, 0F, -1.25F, 2F, 0F, -1.25F, 2F, 0F, 1.25F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[63].setRotationPoint(-13F, -4F, -15F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[64].setRotationPoint(-13F, -1F, -15F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,3F, 1.5F, 0F, -3.25F, 2.25F, 0F, -3.25F, 2.25F, 0F, 3F, 1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 252
		bodyModel[65].setRotationPoint(-14F, -7F, -15F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.75F, 0F, 0.75F, -0.75F, 0F, 0.75F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F); // Box 253
		bodyModel[66].setRotationPoint(-21F, -10F, -15F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 254
		bodyModel[67].setRotationPoint(-25F, -10F, -15F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.75F, 0F); // Box 255
		bodyModel[68].setRotationPoint(-29F, -10F, -15F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0.5F, 0F); // Box 256
		bodyModel[69].setRotationPoint(-30F, -8F, -15F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, -0.5F, 0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.5F, 0.75F, 0F); // Box 257
		bodyModel[70].setRotationPoint(-31F, -7F, -15F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-1F, 2F, 0F, 0.5F, 1.25F, 0F, 0.5F, 1.25F, 0F, -1F, 2F, 0F, 0.5F, 1F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1.25F, 0F, 0.5F, 1F, 0F); // Box 258
		bodyModel[71].setRotationPoint(-32F, -4F, -15F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,20F, 4.25F, 0F, 20F, 4.25F, 0F, 20F, 4.25F, 0F, 20F, 4.25F, 0F, 17.75F, 5F, 0F, 20F, 5F, 0F, 20F, 5F, 0F, 17.75F, 5F, 0F); // Box 259
		bodyModel[72].setRotationPoint(-7F, -10F, 9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,20F, 4.25F, 0F, 20F, 4.25F, 0F, 20F, 4.25F, 0F, 20F, 4.25F, 0F, 17.75F, 5F, 0F, 20F, 5F, 0F, 20F, 5F, 0F, 17.75F, 5F, 0F); // Box 260
		bodyModel[73].setRotationPoint(-7F, -10F, -10F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 12, 0F,0F, 4.25F, 3F, 0F, 4.25F, 3F, 0F, 4.25F, 3F, 0F, 4.25F, 3F, -2.25F, 5F, 3F, 2.25F, 5F, 3F, 2.25F, 5F, 3F, -2.25F, 5F, 3F); // Box 261
		bodyModel[74].setRotationPoint(-27F, -10F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 38, 1, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 262
		bodyModel[75].setRotationPoint(-24F, -3F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 13, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 263
		bodyModel[76].setRotationPoint(13F, -16F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, -1.5F, 10F, 0F, -2.25F, 10F, 0F, 2.25F, 10F, 0F, 2.25F); // Box 264
		bodyModel[77].setRotationPoint(-2F, -2F, 9F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 2.25F, 10F, 0F, 2.25F, 10F, 0F, -2.25F, 10F, 0F, -1.5F); // Box 265
		bodyModel[78].setRotationPoint(-2F, -2F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 16, 10, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 266
		bodyModel[79].setRotationPoint(14F, -13F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 267
		bodyModel[80].setRotationPoint(14F, -14F, -2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 268
		bodyModel[81].setRotationPoint(14F, -3F, -2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 269
		bodyModel[82].setRotationPoint(30F, -3F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[83].setRotationPoint(30F, -13F, 4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 271
		bodyModel[84].setRotationPoint(30F, -14F, -2F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 2, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[85].setRotationPoint(30F, -13F, -5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[86].setRotationPoint(30F, -13F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[87].setRotationPoint(7F, -19F, 3.5F);
		bodyModel[87].rotateAngleZ = -0.64577182F;

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0F, 0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.75F, 5.75F, 0F, 0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0.75F, 5.75F); // Box 285
		bodyModel[88].setRotationPoint(14F, -13F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 1.75F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.75F, 1.5F, 0F, -0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.75F, 5.75F); // Box 286
		bodyModel[89].setRotationPoint(14F, -14F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.75F, 5.75F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, -0.75F, 5.75F, 0F, 1.75F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.75F, 1.5F); // Box 287
		bodyModel[90].setRotationPoint(14F, -3F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 288
		bodyModel[91].setRotationPoint(-3F, -10F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -1.25F, 0F, 3F, 2.25F, 0F, 3F, 2.25F, 0F, 3F, -1.25F, 0F, 3F); // Box 289
		bodyModel[92].setRotationPoint(-5F, -17F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[93].setRotationPoint(-3F, -16F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[94].setRotationPoint(-3F, -16F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[95].setRotationPoint(-21F, -16F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 7, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, -1.25F, 0F, 3F, 2.25F, 0F, 3F, 2.25F, 0F, 3F, -1.25F, 0F, 3F); // Box 293
		bodyModel[96].setRotationPoint(-23F, -17F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 8, 1, 12, 0F,0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 294
		bodyModel[97].setRotationPoint(-21F, -10F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		bodyModel[98].setRotationPoint(-21F, -16F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 296
		bodyModel[99].setRotationPoint(13F, 0F, 4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 297
		bodyModel[100].setRotationPoint(17F, -2.5F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[101].setRotationPoint(21F, -6F, 4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -6F, 0F, 0F, -5.25F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 5.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[102].setRotationPoint(25F, -9F, 4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -5.25F, 0F, -1.75F, -5.25F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 5.25F, 0F, -1.5F, 5.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 300
		bodyModel[103].setRotationPoint(29F, -9F, 4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0.75F, 0F, 0F, 0.5F, 0F, -1.75F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -1.5F, 5.25F, 0F, 0F, 5.25F, 0F); // Box 301
		bodyModel[104].setRotationPoint(29F, -9F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -5.25F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 5.25F, 0F, 0F, 6F, 0F); // Box 302
		bodyModel[105].setRotationPoint(25F, -9F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Box 303
		bodyModel[106].setRotationPoint(21F, -6F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 304
		bodyModel[107].setRotationPoint(17F, -2.5F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F); // Box 305
		bodyModel[108].setRotationPoint(13F, 0F, -11F);

		bodyModel[109].addShapeBox(3F, 1F, 1F, 1, 3, 1, 0F,10F, 4.25F, 0F, -8F, 4.25F, 0F, -8F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, -6.5F, 0F, -8F, -6.5F, 0F, -8F, -6.5F, 0F, 10F, -6.5F, 0F); // Box 188
		bodyModel[109].setRotationPoint(3F, -9F, 8.5F);

		bodyModel[110].addShapeBox(3F, 2F, 1F, 1, 3, 1, 0F,10F, 4.25F, 0F, -8F, 4.25F, 0F, -8F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, -6.5F, 0F, -8F, -6.5F, 0F, -8F, -6.5F, 0F, 10F, -6.5F, 0F); // Box 189
		bodyModel[110].setRotationPoint(3F, -10F, -11.5F);

		bodyModel[111].addShapeBox(-8F, 1F, 1F, 1, 3, 1, 0F,10F, 4.25F, 0F, -8F, 4.25F, 0F, -8F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, -6.5F, 0F, -8F, -6.5F, 0F, -8F, -6.5F, 0F, 10F, -6.5F, 0F); // Box 221
		bodyModel[111].setRotationPoint(3F, -9F, 8.5F);

		bodyModel[112].addShapeBox(-8F, 2F, 1F, 1, 3, 1, 0F,10F, 4.25F, 0F, -8F, 4.25F, 0F, -8F, 4.25F, 0F, 10F, 4.25F, 0F, 10F, -6.5F, 0F, -8F, -6.5F, 0F, -8F, -6.5F, 0F, 10F, -6.5F, 0F); // Box 222
		bodyModel[112].setRotationPoint(3F, -10F, -11.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[113].setRotationPoint(31F, -10F, 4.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[114].setRotationPoint(31F, -10F, -7.5F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 308
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 309
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 310
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 311
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 312
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 313
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 314
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 315
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 316
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 317
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 318
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 319
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 320
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 321
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 322
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 323
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 324
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 325
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 326
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 327
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 328
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 329
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 330
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 331
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 332

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
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 243
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 270
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 271
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 272
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 273
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 274
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 275
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 276
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 277
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 279
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 280
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 281
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 282
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 284
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 285
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 286
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 287
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 289
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 292
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 293
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 294
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 304
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 305
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 306
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 307

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
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 333
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 334
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 335
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 336
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 337
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 338
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 339
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 340
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 341
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 342
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 343
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 344
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 345
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 346
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 347
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 348
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 349
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 350
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 351
		leftBackWheelModel[19] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 352
		leftBackWheelModel[20] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 353
		leftBackWheelModel[21] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 354
		leftBackWheelModel[22] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 355
		leftBackWheelModel[23] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 356
		leftBackWheelModel[24] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 357

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
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 358
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 359
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 0, 123, textureX, textureY); // Box 360
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 361
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 362
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 363
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 364
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 365
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 366
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 367
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 368
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 369
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 370
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 371
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 372
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 373
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 374
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 375
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 376
		rightBackWheelModel[19] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 377
		rightBackWheelModel[20] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 378
		rightBackWheelModel[21] = new ModelRendererTurbo(this, 0, 335, textureX, textureY); // Box 379
		rightBackWheelModel[22] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 380
		rightBackWheelModel[23] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 381
		rightBackWheelModel[24] = new ModelRendererTurbo(this, 0, 67, textureX, textureY); // Box 382

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
		steeringWheelModel[0] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 275
		steeringWheelModel[1] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 277
		steeringWheelModel[2] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 281
		steeringWheelModel[3] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 283
		steeringWheelModel[4] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 284
		steeringWheelModel[5] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 295
		steeringWheelModel[6] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 296
		steeringWheelModel[7] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 297
		steeringWheelModel[8] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 298
		steeringWheelModel[9] = new ModelRendererTurbo(this, 0, 133, textureX, textureY); // Box 299

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