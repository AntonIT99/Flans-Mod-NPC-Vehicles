//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCataphractarii extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelCataphractarii() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[142];
		leftArmModel = new ModelRendererTurbo[9];
		rightArmModel = new ModelRendererTurbo[9];
		leftLegModel = new ModelRendererTurbo[9];
		rightLegModel = new ModelRendererTurbo[9];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 394
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 395
		bodyModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 396
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 397
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 414
		bodyModel[10] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 415
		bodyModel[11] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 416
		bodyModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 417
		bodyModel[13] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 216
		bodyModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 217
		bodyModel[15] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 218
		bodyModel[16] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 219
		bodyModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 220
		bodyModel[18] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 221
		bodyModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 222
		bodyModel[20] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 147
		bodyModel[21] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 153
		bodyModel[22] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 158
		bodyModel[23] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 163
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 299
		bodyModel[25] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 300
		bodyModel[26] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 301
		bodyModel[27] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 302
		bodyModel[28] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 303
		bodyModel[29] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 304
		bodyModel[30] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 305
		bodyModel[31] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 306
		bodyModel[32] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 307
		bodyModel[33] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 308
		bodyModel[34] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 309
		bodyModel[35] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 310
		bodyModel[36] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 311
		bodyModel[37] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 312
		bodyModel[38] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 313
		bodyModel[39] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 241
		bodyModel[40] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 246
		bodyModel[41] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 247
		bodyModel[42] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 252
		bodyModel[43] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 167
		bodyModel[44] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 168
		bodyModel[45] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 169
		bodyModel[46] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 170
		bodyModel[47] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 134
		bodyModel[48] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 135
		bodyModel[49] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 136
		bodyModel[50] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 179
		bodyModel[51] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 180
		bodyModel[52] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 181
		bodyModel[53] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 182
		bodyModel[54] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 183
		bodyModel[55] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 184
		bodyModel[56] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 185
		bodyModel[57] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 186
		bodyModel[58] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 187
		bodyModel[59] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 188
		bodyModel[60] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 189
		bodyModel[61] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 190
		bodyModel[62] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 191
		bodyModel[63] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 192
		bodyModel[64] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 193
		bodyModel[65] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 194
		bodyModel[66] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 195
		bodyModel[67] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 196
		bodyModel[68] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 197
		bodyModel[69] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 198
		bodyModel[70] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 199
		bodyModel[71] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 200
		bodyModel[72] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 201
		bodyModel[73] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 202
		bodyModel[74] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 203
		bodyModel[75] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 204
		bodyModel[76] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 205
		bodyModel[77] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 206
		bodyModel[78] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 207
		bodyModel[79] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 208
		bodyModel[80] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 209
		bodyModel[81] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 210
		bodyModel[82] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 211
		bodyModel[83] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 212
		bodyModel[84] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 213
		bodyModel[85] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 214
		bodyModel[86] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 215
		bodyModel[87] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 216
		bodyModel[88] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 217
		bodyModel[89] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 218
		bodyModel[90] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 219
		bodyModel[91] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 220
		bodyModel[92] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 221
		bodyModel[93] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 222
		bodyModel[94] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 223
		bodyModel[95] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 224
		bodyModel[96] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 225
		bodyModel[97] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 226
		bodyModel[98] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 227
		bodyModel[99] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 228
		bodyModel[100] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 229
		bodyModel[101] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 230
		bodyModel[102] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 231
		bodyModel[103] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 232
		bodyModel[104] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 233
		bodyModel[105] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 234
		bodyModel[106] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 235
		bodyModel[107] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 236
		bodyModel[108] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 237
		bodyModel[109] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 238
		bodyModel[110] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 239
		bodyModel[111] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 240
		bodyModel[112] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 241
		bodyModel[113] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 242
		bodyModel[114] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 243
		bodyModel[115] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 244
		bodyModel[116] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 245
		bodyModel[117] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 246
		bodyModel[118] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 247
		bodyModel[119] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 248
		bodyModel[120] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 249
		bodyModel[121] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 250
		bodyModel[122] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 251
		bodyModel[123] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 252
		bodyModel[124] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 253
		bodyModel[125] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 254
		bodyModel[126] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 255
		bodyModel[127] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 256
		bodyModel[128] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 257
		bodyModel[129] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 258
		bodyModel[130] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 259
		bodyModel[131] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 260
		bodyModel[132] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 261
		bodyModel[133] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 262
		bodyModel[134] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 263
		bodyModel[135] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 264
		bodyModel[136] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 265
		bodyModel[137] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 266
		bodyModel[138] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 267
		bodyModel[139] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 268
		bodyModel[140] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 269
		bodyModel[141] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 270

		bodyModel[0].addShapeBox(-4F, 1F, -2F, 8, 7, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F, 0.1F, 2.5F, 0.1F); // Box 24
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10.4F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F); // Box 27
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 1F, -2F, 8, 6, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F); // Box 39
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0F, -2F, 4, 1, 4, 0F,0.1F, 0.2F, 0.1F, -1.6F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F); // Box 1
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, -2F, 4, 1, 4, 0F,-1.6F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.4F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F); // Box 2
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 3F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 394
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(1F, 3F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 395
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, 3F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 396
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(3F, 3F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 397
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1F, 3F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 414
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2F, 3F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 415
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3F, 3F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 416
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 3F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 417
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 216
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 217
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 218
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-0.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 219
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 220
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 221
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 222
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(4F, 4.5F, -2F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 147
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(4F, 4.5F, -1F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 153
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(4F, 4.5F, 0F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 158
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(4F, 4.5F, 1F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 163
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(2.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 299
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 300
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 301
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-0.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 302
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 303
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 304
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 305
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3F, 3F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 306
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(2F, 3F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 307
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1F, 3F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 308
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0F, 3F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 309
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-1F, 3F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 310
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2F, 3F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 311
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3F, 3F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 312
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4F, 3F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 313
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(3.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 241
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.5F, 1.5F, -3F, 1, 2, 1, 0F,-0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F); // Box 246
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4.5F, 1.5F, 2F, 1, 2, 1, 0F,-0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F); // Box 247
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(3.5F, 1.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 252
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-5F, 4.5F, 1F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 167
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-5F, 4.5F, 0F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 168
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-5F, 4.5F, -1F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 169
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-5F, 4.5F, -2F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 170
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3.5F, -0.5F, -2F, 1, 2, 4, 0F,0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 134
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(2.5F, -0.5F, -2F, 1, 2, 4, 0F,0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 135
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-3F, -0.7F, -2F, 1, 9, 4, 0F,0.2F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, -7.5F, 1.8F, 0.4F, 6.5F, -0.2F, 0.4F, 6.5F, -0.2F, 0.4F, -7.5F, 1.8F, 0.4F); // Box 136
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(4F, 6F, 1F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 179
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(4F, 6F, 0F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 180
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(4F, 6F, -1F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 181
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(4F, 6F, -2F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 182
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(4F, 7.5F, 1F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 183
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(4F, 7.5F, 0F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 184
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(4F, 7.5F, -1F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 185
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(4F, 7.5F, -2F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 186
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(4F, 9F, 1F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 187
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(4F, 9F, 0F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 188
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(4F, 9F, -1F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 189
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(4F, 9F, -2F, 1, 2, 1, 0F,-0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F); // Box 190
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-5F, 6F, -2F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 191
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-5F, 6F, -1F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 192
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-5F, 6F, 0F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 193
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-5F, 6F, 1F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 194
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-5F, 7.5F, -2F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 195
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-5F, 7.5F, -1F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 196
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-5F, 7.5F, 0F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 197
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-5F, 7.5F, 1F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 198
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-5F, 9F, -2F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 199
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-5F, 9F, -1F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 200
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-5F, 9F, 0F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 201
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-5F, 9F, 1F, 1, 2, 1, 0F,-0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F); // Box 202
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-4.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F); // Box 203
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-3.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 204
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-2.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 205
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-1.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 206
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-0.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 207
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(0.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 208
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(1.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 209
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(2.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 210
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(3.5F, 4.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 211
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-4F, 6F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 212
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-3F, 6F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 213
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(-2F, 6F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 214
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-1F, 6F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 215
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(0F, 6F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 216
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(1F, 6F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 217
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(2F, 6F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 218
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(3F, 6F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 219
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-4F, 9F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 220
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-3F, 9F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 221
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-2F, 9F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 222
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-1F, 9F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 223
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(0F, 9F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 224
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(1F, 9F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 225
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(2F, 9F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 226
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(3F, 9F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 227
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-4.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F); // Box 228
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-3.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 229
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-2.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 230
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-1.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 231
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-0.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 232
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(0.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 233
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(1.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 234
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(2.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 235
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(3.5F, 7.5F, -3F, 1, 2, 1, 0F,-0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F); // Box 236
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-4.5F, 4.5F, 2F, 1, 2, 1, 0F,-0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F); // Box 237
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-3.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 238
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-2.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 239
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-1.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 240
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-0.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 241
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(0.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 242
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(1.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 243
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(2.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 244
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(3.5F, 4.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 245
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(-4.5F, 7.5F, 2F, 1, 2, 1, 0F,-0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F, -0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F); // Box 246
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(-3.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 247
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-2.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 248
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(-1.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 249
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-0.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 250
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(0.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 251
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(1.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 252
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(2.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 253
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(3.5F, 7.5F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 254
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-4F, 6F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 255
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-3F, 6F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 256
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-2F, 6F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 257
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-1F, 6F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 258
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(0F, 6F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 259
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(1F, 6F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 260
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(2F, 6F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 261
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(3F, 6F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 262
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-4F, 9F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 263
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-3F, 9F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 264
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-2F, 9F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 265
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-1F, 9F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 266
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(0F, 9F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 267
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(1F, 9F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 268
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(2F, 9F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 269
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(3F, 9F, 2F, 1, 2, 1, 0F,0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F); // Box 270
		bodyModel[141].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 160
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 161
		leftArmModel[2] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 162
		leftArmModel[3] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 294
		leftArmModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 295
		leftArmModel[5] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 296
		leftArmModel[6] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 297
		leftArmModel[7] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 298
		leftArmModel[8] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 299

		leftArmModel[0].addShapeBox(-1F, 1.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 160
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 3, 4, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 161
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 1F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 162
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 2.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 294
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 3.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 295
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, 4.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 296
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, 5.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 297
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, 6.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 298
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-1F, 7.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 299
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 30
		rightArmModel[1] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 146
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 153
		rightArmModel[3] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 287
		rightArmModel[4] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 288
		rightArmModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 289
		rightArmModel[6] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 290
		rightArmModel[7] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 291
		rightArmModel[8] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 292

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 3, 4, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 30
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 1.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 146
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 1F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 153
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 2.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 287
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 3.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 288
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 6.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 289
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 5.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 290
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 4.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 291
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 7.5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 292
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 278
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 279
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 280
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 281
		leftLegModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 282
		leftLegModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 283
		leftLegModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 284
		leftLegModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 285
		leftLegModel[8] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 286

		leftLegModel[0].addShapeBox(-2F, 3F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 278
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 279
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 280
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 281
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 282
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 8F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 283
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 284
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 10F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 285
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 286
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 163
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 271
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 272
		rightLegModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 273
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 274
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 275
		rightLegModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 276
		rightLegModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 277

		rightLegModel[0].addShapeBox(-2F, 11.1F, -3F, 4, 1, 5, 0F,0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 3F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 163
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 4F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 271
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 272
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 273
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 274
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 8F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 275
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 276
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 10F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 277
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 300

		skirtFrontModel[0].addShapeBox(-4F, -1.1F, -2F, 8, 5, 4, 0F,0.45F, 0.2F, 0.4F, 0.45F, 0.2F, 0.4F, 0.45F, 0.2F, -0.6F, 0.45F, 0.2F, -0.6F, 0.85F, 0.6F, 0.8F, 0.85F, 0.6F, 0.8F, 0.85F, 0.6F, -0.2F, 0.85F, 0.6F, -0.2F); // Box 300
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 26

		skirtRearModel[0].addShapeBox(-4F, -1.1F, -2F, 8, 5, 4, 0F,0.4F, 0.2F, -0.6F, 0.4F, 0.2F, -0.6F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.8F, 0.6F, -0.2F, 0.8F, 0.6F, -0.2F, 0.8F, 0.6F, 0.8F, 0.8F, 0.6F, 0.8F); // Box 26
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}