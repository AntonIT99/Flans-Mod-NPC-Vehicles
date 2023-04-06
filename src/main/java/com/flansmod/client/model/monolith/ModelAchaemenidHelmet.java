//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AchaemenidHelmet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAchaemenidHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelAchaemenidHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[78];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 19
		headModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 23
		headModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 16
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 201
		headModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 202
		headModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 203
		headModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 204
		headModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 205
		headModel[11] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 206
		headModel[12] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 207
		headModel[13] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 208
		headModel[14] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 209
		headModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 210
		headModel[16] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 211
		headModel[17] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 212
		headModel[18] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 213
		headModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 214
		headModel[20] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 215
		headModel[21] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 216
		headModel[22] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 217
		headModel[23] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 34
		headModel[24] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 35
		headModel[25] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 167
		headModel[26] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 168
		headModel[27] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 169
		headModel[28] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 170
		headModel[29] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 40
		headModel[30] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 41
		headModel[31] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 42
		headModel[32] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 43
		headModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		headModel[34] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 45
		headModel[35] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 46
		headModel[36] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 49
		headModel[37] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 50
		headModel[38] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 51
		headModel[39] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 52
		headModel[40] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 53
		headModel[41] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 54
		headModel[42] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 55
		headModel[43] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 56
		headModel[44] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 57
		headModel[45] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 58
		headModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 59
		headModel[47] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 60
		headModel[48] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 61
		headModel[49] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 62
		headModel[50] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 63
		headModel[51] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 64
		headModel[52] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 65
		headModel[53] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 66
		headModel[54] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 67
		headModel[55] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 68
		headModel[56] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 69
		headModel[57] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 70
		headModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		headModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
		headModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		headModel[61] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 74
		headModel[62] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 75
		headModel[63] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 76
		headModel[64] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 77
		headModel[65] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 78
		headModel[66] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 79
		headModel[67] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 80
		headModel[68] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 81
		headModel[69] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 82
		headModel[70] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 83
		headModel[71] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 84
		headModel[72] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 85
		headModel[73] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 86
		headModel[74] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 87
		headModel[75] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 88
		headModel[76] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 89
		headModel[77] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 90

		headModel[0].addShapeBox(-4F, -8F, -4F, 4, 2, 8, 0F,0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 1F, -0.5F, 1F, 0F, -0.5F, 1.4F, 0F, -0.5F, 0.7F, 1F, -0.5F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 4, 1, 8, 0F,-0.8F, 0F, -1.5F, 0F, 1F, -3.7F, 0F, 1F, -3.7F, -0.8F, 0F, -1.5F, 0.5F, 0.5F, 0.3F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -7F, -1F, 4, 3, 5, 0F,1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.7F, 1F, -0.5F, 0.7F, 1F, 0.7F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.6F, 0.7F, 1F, 0.5F, 0.7F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7F, -5F, 3, 3, 3, 0F,1F, -0.5F, 0F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0.7F, 1F, -0.5F, 0.7F, 1F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.7F, 1F, 0.5F, 0.7F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -5F, -1F, 10, 5, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.7F, 0.4F, 2.7F, -0.7F, 0.4F, 2.7F, -0.7F, 0.8F, -3F, -0.7F, 0.8F, -3F); // Box 23
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1F, -7F, -5F, 1, 3, 3, 0F,0F, -0.5F, 0.35F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.7F, 0F, -0.5F, 0.7F); // Box 16
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -3.7F, 4.2F, 1, 2, 1, 0F,-0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F); // Box 201
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 202
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 203
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-2.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 204
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-2F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 205
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 206
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 207
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(0.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 208
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 209
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 210
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(1.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 211
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(1F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 212
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(2F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 213
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(2.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 214
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 215
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(4F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 216
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(3.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 217
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4F, -3.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 34
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-3.5F, -2.2F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 35
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-5.5F, -3.5F, 3.4F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 167
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-5.5F, -3.5F, 2.4F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 168
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5.5F, -3.5F, 1.4F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 169
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-5.5F, -3.5F, 0.4F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 170
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-5.5F, -3.5F, -0.6F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 40
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-5.5F, -3.5F, -1.6F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 41
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(0F, -7F, -5F, 1, 3, 3, 0F,0F, -0.5F, 0.4F, 0F, -0.5F, 0.35F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.7F, 0F, -0.1F, 0.7F); // Box 42
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(1F, -7F, -5F, 3, 3, 3, 0F,0F, -0.5F, 0.35F, 1F, -0.5F, 0F, 1F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.5F, 1F, 0F, 0F, 1F, 0.5F, 0.7F, 0F, -0.5F, 0.7F); // Box 43
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(0F, -8F, -4F, 4, 2, 8, 0F,0F, 0.3F, 0.7F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 1.4F, 1F, -0.5F, 1F, 1F, -0.5F, 0.7F, 0F, -0.5F, 0.7F); // Box 44
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(0F, -9.8F, -4F, 4, 1, 8, 0F,0F, 1F, -3.7F, -0.8F, 0F, -1.5F, -0.8F, 0F, -1.5F, 0F, 1F, -3.7F, 0F, 0.5F, 0.7F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 45
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(0F, -7F, -1F, 4, 3, 5, 0F,0F, -0.5F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.5F, 1F, 0.7F, 0.5F, 1F, 0.5F, 0.7F, 0F, 0.6F, 0.7F); // Box 46
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-5.5F, -2F, -1.1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 49
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-5.5F, -2F, -0.1F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 50
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-5.5F, -2F, 0.9F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 51
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-5.5F, -2F, 1.9F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 52
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-5.5F, -0.5F, 3.4F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 53
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-5.5F, -0.5F, -1.6F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 54
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-5.5F, -0.5F, -0.6F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 55
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-5.5F, -0.5F, 0.4F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 56
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-5.5F, -0.5F, 1.4F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 57
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-5.5F, -0.5F, 2.4F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 58
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-5F, -0.7F, 4.2F, 1, 2, 1, 0F,-0.375F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.75F, 0F, -0.625F); // Box 59
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-4F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 60
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-3F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 61
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-2F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 62
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-1F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 63
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(0F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 64
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(1F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 65
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(2F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 66
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(3F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, 0.125F, 0F, -0.125F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 67
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(4F, -0.7F, 4.2F, 1, 2, 1, 0F,0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.75F, 0F, -0.625F, -0.25F, 0F, -0.625F); // Box 68
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-5.5F, -2F, 2.9F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 69
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-5.5F, -2F, -2.1F, 1, 2, 1, 0F,-0.75F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.625F, 0F, -0.75F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F); // Box 70
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(-5.5F, -2F, 3.9F, 1, 2, 1, 0F,-0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F, -0.25F, -0.375F, -0.375F, -0.625F, 0F, -0.75F); // Box 71
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(4.5F, -2F, -2.1F, 1, 2, 1, 0F,-0.125F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, -0.375F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 72
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(4.5F, -2F, 3.9F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.75F, -0.25F, -0.375F, -0.375F); // Box 73
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(4.5F, -3.5F, -1.6F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 74
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(4.5F, -3.5F, -0.6F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 75
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(4.5F, -3.5F, 0.4F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 76
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(4.5F, -3.5F, 1.4F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 77
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(4.5F, -3.5F, 2.4F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 78
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(4.5F, -3.5F, 3.4F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 79
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(4.5F, -2F, 2.9F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 80
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(4.5F, -2F, 1.9F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 81
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(4.5F, -2F, 0.9F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 82
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(4.5F, -2F, -0.1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 83
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(4.5F, -2F, -1.1F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 84
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(4.5F, -0.5F, -1.6F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 85
		headModel[72].setRotationPoint(0F, 0F, 0F);

		headModel[73].addShapeBox(4.5F, -0.5F, -0.6F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 86
		headModel[73].setRotationPoint(0F, 0F, 0F);

		headModel[74].addShapeBox(4.5F, -0.5F, 0.4F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 87
		headModel[74].setRotationPoint(0F, 0F, 0F);

		headModel[75].addShapeBox(4.5F, -0.5F, 1.4F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 88
		headModel[75].setRotationPoint(0F, 0F, 0F);

		headModel[76].addShapeBox(4.5F, -0.5F, 2.4F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 89
		headModel[76].setRotationPoint(0F, 0F, 0F);

		headModel[77].addShapeBox(4.5F, -0.5F, 3.4F, 1, 2, 1, 0F,-0.125F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.25F, -0.375F, 0.125F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.25F, -0.375F, 0.125F); // Box 90
		headModel[77].setRotationPoint(0F, 0F, 0F);
	}
}