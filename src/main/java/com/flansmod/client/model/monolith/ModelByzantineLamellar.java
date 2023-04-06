//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelByzantineLamellar extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelByzantineLamellar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[192];
		leftArmModel = new ModelRendererTurbo[20];
		rightArmModel = new ModelRendererTurbo[20];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 290
		bodyModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 291
		bodyModel[4] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 292
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[21] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[23] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[31] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[32] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[33] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[34] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[35] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[36] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[37] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[38] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[39] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[40] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[41] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[42] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[43] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[44] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[45] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[46] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[47] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[48] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[49] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[50] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[51] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[52] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[53] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[54] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[56] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[57] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[61] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[62] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[65] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[66] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[67] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[68] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[69] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[70] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[72] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[73] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[74] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[75] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[76] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[77] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[78] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[79] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[80] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[81] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[82] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[83] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[84] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[85] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[86] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[87] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[88] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[89] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[90] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[91] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[92] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[93] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[94] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[95] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[96] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[97] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[98] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[99] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[100] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[101] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[102] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[103] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[104] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[105] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[106] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[107] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[108] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[109] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[110] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[111] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[112] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[113] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[114] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[115] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[116] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[117] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[118] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[119] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[120] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[121] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[122] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[123] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[124] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[125] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[126] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[127] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[128] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[129] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[130] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[131] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[132] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[133] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[134] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[135] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[136] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[137] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[138] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[139] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[140] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[141] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[142] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[143] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[144] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[145] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[146] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[147] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		bodyModel[148] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 294
		bodyModel[149] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 297
		bodyModel[150] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 205
		bodyModel[151] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 206
		bodyModel[152] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 207
		bodyModel[153] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 208
		bodyModel[154] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 42
		bodyModel[155] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 43
		bodyModel[156] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 58
		bodyModel[157] = new ModelRendererTurbo(this, 38, 86, textureX, textureY); // Box 59
		bodyModel[158] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 70
		bodyModel[159] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 71
		bodyModel[160] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 72
		bodyModel[161] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 73
		bodyModel[162] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 74
		bodyModel[163] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 75
		bodyModel[164] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 80
		bodyModel[165] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 81
		bodyModel[166] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 17
		bodyModel[167] = new ModelRendererTurbo(this, 38, 86, textureX, textureY); // Box 18
		bodyModel[168] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 19
		bodyModel[169] = new ModelRendererTurbo(this, 38, 86, textureX, textureY); // Box 20
		bodyModel[170] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 21
		bodyModel[171] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 22
		bodyModel[172] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 23
		bodyModel[173] = new ModelRendererTurbo(this, 38, 86, textureX, textureY); // Box 24
		bodyModel[174] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 25
		bodyModel[175] = new ModelRendererTurbo(this, 38, 86, textureX, textureY); // Box 26
		bodyModel[176] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 245
		bodyModel[177] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 246
		bodyModel[178] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 247
		bodyModel[179] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 248
		bodyModel[180] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 249
		bodyModel[181] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 250
		bodyModel[182] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 251
		bodyModel[183] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 252
		bodyModel[184] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 253
		bodyModel[185] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 254
		bodyModel[186] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 255
		bodyModel[187] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 256
		bodyModel[188] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 257
		bodyModel[189] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 258
		bodyModel[190] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 259
		bodyModel[191] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 260

		bodyModel[0].addShapeBox(-4F, 8.6F, -2F, 8, 1, 4, 0F,0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10.3F, -2F, 8, 5, 4, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2F, 8, 8, 4, 0F,0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 290
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 8F, -2F, 8, 1, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 291
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 9.3F, -2F, 8, 1, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F); // Box 292
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(1F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(3F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-1F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2F, 3.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(3F, 5.5F, -2.55F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2F, 5.5F, -2.55F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1F, 5.5F, -2.55F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 5.5F, -2.55F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1F, 5.5F, -2.55F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-3F, 5.5F, -2.55F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 5.5F, -2.55F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-2F, 5.5F, -2.55F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(1F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-1F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(3F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(2F, 3F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-2F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-1F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(1F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(3F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(2F, 5F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-1F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(0F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(1F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(3F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(2F, 7F, 1.5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 29
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(2.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(1.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(0.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-1.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-2.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-3.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(2.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(1.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(0.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-1.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-2.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-3.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(2.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(1.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(0.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-1.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-2.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-3.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(2.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(1.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(0.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-1.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-2.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-3.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-3.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-2.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-3.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-2.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(-1.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-1.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(0.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(0.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(1.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(1.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(2.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(2.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-4.3F, 5.5F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 29
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-4.3F, 5.5F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 29
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-4.3F, 5.5F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 29
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-4.3F, 5.5F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 29
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(3.3F, 5.5F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 29
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(3.3F, 5.5F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 29
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(3.3F, 5.5F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 29
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(3.3F, 5.5F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F); // Box 29
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-4.5F, 6F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-4.5F, 7F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(3.5F, 6F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(3.5F, 7F, -2.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(3.5F, 7F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(3.5F, 6F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-4.5F, 7F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-4.5F, 6F, 1.6F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-4.6F, 7F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-4.6F, 6F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-4.6F, 7F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-4.6F, 6F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-4.6F, 7F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-4.6F, 6F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(3.6F, 7F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(3.6F, 6F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(3.6F, 7F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(3.6F, 6F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(3.6F, 7F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(3.6F, 6F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(3.8F, 5.5F, 1F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 29
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(3.8F, 5.5F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 29
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(3.8F, 5.5F, -1F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 29
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(3.8F, 5.5F, -2F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 29
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-4.8F, 5.5F, 1F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 29
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-4.8F, 5.5F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 29
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-4.8F, 5.5F, -1F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 29
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-4.8F, 5.5F, -2F, 1, 3, 1, 0F,-0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 29
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-5.1F, 7F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(-5.1F, 6F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-5.1F, 6F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-5.1F, 7F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(-5.1F, 7F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(-5.1F, 6F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(4.1F, 6F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(4.1F, 7F, -1.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(4.1F, 6F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(4.1F, 7F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(4.1F, 7F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(4.1F, 6F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(-0.5F, 4F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(-0.5F, 6F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(-0.5F, 7F, -2.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(-0.5F, 1.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(-0.5F, 3.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(-0.5F, 5.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(-0.5F, 7.5F, 1.8F, 1, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F); // Box 29
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(-3F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(2F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 29
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(-0.5F, -0.4F, -2F, 5, 1, 4, 0F,-0.3F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.4F, 3F, 0.6F, 0.2F, 2F, 0.6F, 0.2F, 2F, 0.6F, -0.5F, 3F, 0.6F); // Box 294
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(-4.8F, -0.4F, -2F, 5, 1, 4, 0F,0.2F, 0F, 0.6F, -0.3F, 0F, 0.6F, -0.3F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 2F, 0.6F, -0.3F, 3F, 0.6F, -0.5F, 3F, 0.6F, 0.2F, 2F, 0.6F); // Box 297
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(3F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 205
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(-4F, 1.5F, -2.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 206
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(3F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 207
		bodyModel[152].setRotationPoint(0F, 0F, 0F);

		bodyModel[153].addShapeBox(-4F, 1F, 1.5F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F); // Box 208
		bodyModel[153].setRotationPoint(0F, 0F, 0F);

		bodyModel[154].addShapeBox(-4.25F, 9.5F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 42
		bodyModel[154].setRotationPoint(0F, 0F, 0F);

		bodyModel[155].addShapeBox(-4.25F, 9.5F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 43
		bodyModel[155].setRotationPoint(0F, 0F, 0F);

		bodyModel[156].addShapeBox(-4.25F, 9.5F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F); // Box 58
		bodyModel[156].setRotationPoint(0F, 0F, 0F);

		bodyModel[157].addShapeBox(-4.25F, 9.5F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F); // Box 59
		bodyModel[157].setRotationPoint(0F, 0F, 0F);

		bodyModel[158].addShapeBox(3.5F, 9.5F, -2F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 70
		bodyModel[158].setRotationPoint(0F, 0F, 0F);

		bodyModel[159].addShapeBox(3.5F, 9.5F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 71
		bodyModel[159].setRotationPoint(0F, 0F, 0F);

		bodyModel[160].addShapeBox(3.5F, 9.5F, 1F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 72
		bodyModel[160].setRotationPoint(0F, 0F, 0F);

		bodyModel[161].addShapeBox(3.5F, 9.5F, 1F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 73
		bodyModel[161].setRotationPoint(0F, 0F, 0F);

		bodyModel[162].addShapeBox(3.5F, 9.5F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F); // Box 74
		bodyModel[162].setRotationPoint(0F, 0F, 0F);

		bodyModel[163].addShapeBox(3.5F, 9.5F, -0.5F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 75
		bodyModel[163].setRotationPoint(0F, 0F, 0F);

		bodyModel[164].addShapeBox(-4.6F, 9.5F, 1F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F); // Box 80
		bodyModel[164].setRotationPoint(0F, 0F, 0F);

		bodyModel[165].addShapeBox(-4.6F, 9.5F, 1F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F); // Box 81
		bodyModel[165].setRotationPoint(0F, 0F, 0F);

		bodyModel[166].addShapeBox(-1.25F, 9.5F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F); // Box 17
		bodyModel[166].setRotationPoint(0F, 0F, 0F);

		bodyModel[167].addShapeBox(-1.25F, 9.5F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F); // Box 18
		bodyModel[167].setRotationPoint(0F, 0F, 0F);

		bodyModel[168].addShapeBox(1.75F, 9.5F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F); // Box 19
		bodyModel[168].setRotationPoint(0F, 0F, 0F);

		bodyModel[169].addShapeBox(1.75F, 9.5F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F); // Box 20
		bodyModel[169].setRotationPoint(0F, 0F, 0F);

		bodyModel[170].addShapeBox(3.25F, 9.5F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F); // Box 21
		bodyModel[170].setRotationPoint(0F, 0F, 0F);

		bodyModel[171].addShapeBox(3.25F, 9.5F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F); // Box 22
		bodyModel[171].setRotationPoint(0F, 0F, 0F);

		bodyModel[172].addShapeBox(0.25F, 9.5F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F); // Box 23
		bodyModel[172].setRotationPoint(0F, 0F, 0F);

		bodyModel[173].addShapeBox(0.25F, 9.5F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F); // Box 24
		bodyModel[173].setRotationPoint(0F, 0F, 0F);

		bodyModel[174].addShapeBox(-2.75F, 9.5F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F); // Box 25
		bodyModel[174].setRotationPoint(0F, 0F, 0F);

		bodyModel[175].addShapeBox(-2.75F, 9.5F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F); // Box 26
		bodyModel[175].setRotationPoint(0F, 0F, 0F);

		bodyModel[176].addShapeBox(-1.25F, 9.5F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 245
		bodyModel[176].setRotationPoint(0F, 0F, 0F);

		bodyModel[177].addShapeBox(-1.25F, 9.5F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 246
		bodyModel[177].setRotationPoint(0F, 0F, 0F);

		bodyModel[178].addShapeBox(1.75F, 9.5F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 247
		bodyModel[178].setRotationPoint(0F, 0F, 0F);

		bodyModel[179].addShapeBox(1.75F, 9.5F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 248
		bodyModel[179].setRotationPoint(0F, 0F, 0F);

		bodyModel[180].addShapeBox(3.25F, 9.5F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 249
		bodyModel[180].setRotationPoint(0F, 0F, 0F);

		bodyModel[181].addShapeBox(3.25F, 9.5F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 250
		bodyModel[181].setRotationPoint(0F, 0F, 0F);

		bodyModel[182].addShapeBox(0.25F, 9.5F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 251
		bodyModel[182].setRotationPoint(0F, 0F, 0F);

		bodyModel[183].addShapeBox(0.25F, 9.5F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 252
		bodyModel[183].setRotationPoint(0F, 0F, 0F);

		bodyModel[184].addShapeBox(-2.75F, 9.5F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 253
		bodyModel[184].setRotationPoint(0F, 0F, 0F);

		bodyModel[185].addShapeBox(-2.75F, 9.5F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 254
		bodyModel[185].setRotationPoint(0F, 0F, 0F);

		bodyModel[186].addShapeBox(-4.6F, 9.5F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F); // Box 255
		bodyModel[186].setRotationPoint(0F, 0F, 0F);

		bodyModel[187].addShapeBox(-4.5F, 9.5F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F); // Box 256
		bodyModel[187].setRotationPoint(0F, 0F, 0F);

		bodyModel[188].addShapeBox(-4.6F, 9.5F, -0.5F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F); // Box 257
		bodyModel[188].setRotationPoint(0F, 0F, 0F);

		bodyModel[189].addShapeBox(-4.6F, 9.5F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F); // Box 258
		bodyModel[189].setRotationPoint(0F, 0F, 0F);

		bodyModel[190].addShapeBox(-4.5F, 9.5F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, 0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F); // Box 259
		bodyModel[190].setRotationPoint(0F, 0F, 0F);

		bodyModel[191].addShapeBox(-4.6F, 9.5F, -2F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F); // Box 260
		bodyModel[191].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 296
		leftArmModel[2] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 297
		leftArmModel[3] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 298
		leftArmModel[4] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 299
		leftArmModel[5] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 300
		leftArmModel[6] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 301
		leftArmModel[7] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 302
		leftArmModel[8] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 303
		leftArmModel[9] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 304
		leftArmModel[10] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 305
		leftArmModel[11] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 306
		leftArmModel[12] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 307
		leftArmModel[13] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 308
		leftArmModel[14] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 309
		leftArmModel[15] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 310
		leftArmModel[16] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 311
		leftArmModel[17] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 312
		leftArmModel[18] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 313
		leftArmModel[19] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 314

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.0999999999999996F, -2.4F, -2F, 2, 1, 4, 0F,0.2F, 0F, 0.5F, 1.2F, 0F, 0.5F, 1.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 2F, 0.5F, 1.5F, 0.2F, 0.5F, 1.5F, 0.2F, 0.5F, 0.2F, 2F, 0.5F); // Box 296
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -1F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 297
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -1F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 298
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(0.5F, -1F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 299
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0.5F, -1F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 300
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2F, -1F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 301
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2F, -1F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 302
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2F, -1F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 303
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(2F, -1F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 304
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(0.5F, -1F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 305
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(0.5F, -1F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 306
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, -1F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 307
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-1F, -1F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 308
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.5F, -1F, 1F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 309
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(2.5F, -1F, 1F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 310
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(2.5F, -1F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 311
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(2.5F, -1F, -0.5F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 312
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(2.5F, -1F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 313
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(2.5F, -1F, -2F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 314
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 0, 90, textureX, textureY); // Box 298
		rightArmModel[2] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 2
		rightArmModel[3] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 3
		rightArmModel[4] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 6
		rightArmModel[5] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 7
		rightArmModel[6] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 10
		rightArmModel[7] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 11
		rightArmModel[8] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 12
		rightArmModel[9] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 13
		rightArmModel[10] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 14
		rightArmModel[11] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 15
		rightArmModel[12] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 16
		rightArmModel[13] = new ModelRendererTurbo(this, 30, 86, textureX, textureY); // Box 17
		rightArmModel[14] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 36
		rightArmModel[15] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 37
		rightArmModel[16] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 38
		rightArmModel[17] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 39
		rightArmModel[18] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 40
		rightArmModel[19] = new ModelRendererTurbo(this, 40, 86, textureX, textureY); // Box 41

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2.1F, -2.4F, -2F, 2, 1, 4, 0F,1.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 1.2F, 0F, 0.5F, 1.5F, 0.2F, 0.5F, 0.2F, 2F, 0.5F, 0.2F, 2F, 0.5F, 1.5F, 0.2F, 0.5F); // Box 298
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -1F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 2
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -1F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 3
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(0F, -1F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 6
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(0F, -1F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 7
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-1.5F, -1F, -2.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 10
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-1.5F, -1F, -2.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F); // Box 11
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, -1F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 12
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, -1F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 13
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-1.5F, -1F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 14
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-1.5F, -1F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 15
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(0F, -1F, 1.5F, 1, 4, 1, 0F,0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.3F, 0F, -0.2F); // Box 16
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(0F, -1F, 1.5F, 1, 4, 1, 0F,-0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.3F, -0.2F, 0.1F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.3F, -0.2F); // Box 17
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.5F, -1F, 1F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 36
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3.5F, -1F, 1F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 37
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3.5F, -1F, -0.5F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 38
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3.5F, -1F, -0.5F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 39
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-3.5F, -1F, -2F, 1, 4, 1, 0F,-0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.3F); // Box 40
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-3.5F, -1F, -2F, 1, 4, 1, 0F,-0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.1F, -0.2F, 0.3F, -0.5F, -0.2F, 0.3F, -0.5F); // Box 41
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 2
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 3
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 4
		leftLegModel[3] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 5
		leftLegModel[4] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 177

		leftLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 6, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 2
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 3
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7.4F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 4
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 7.5F, -2F, 7, 3, 7, 0F,0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.2F, 0F, 0.2F, -2.7F, 0F, 0.2F, -2.7F, 0F, -2.8F, 0.2F, 0F, -2.8F); // Box 177
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 1
		rightLegModel[4] = new ModelRendererTurbo(this, 0, 100, textureX, textureY); // Box 178

		rightLegModel[0].addShapeBox(-2F, 7.4F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 6, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 7.5F, -2F, 7, 3, 7, 0F,0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0.2F, 0F, 0.2F, -2.7F, 0F, 0.2F, -2.7F, 0F, -2.8F, 0.2F, 0F, -2.8F); // Box 178
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}