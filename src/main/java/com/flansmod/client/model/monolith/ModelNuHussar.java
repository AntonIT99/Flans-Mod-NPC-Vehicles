//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NuHussar
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNuHussar extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelNuHussar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[93];
		leftArmModel = new ModelRendererTurbo[17];
		rightArmModel = new ModelRendererTurbo[17];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 27
		bodyModel[1] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 28
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 29
		bodyModel[3] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 42
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 43
		bodyModel[5] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 44
		bodyModel[6] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 31
		bodyModel[10] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 32
		bodyModel[11] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 50
		bodyModel[12] = new ModelRendererTurbo(this, 113, 36, textureX, textureY); // Box 54
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 56
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 57
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 58
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 59
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 60
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 61
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 63
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 64
		bodyModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 65
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 66
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 67
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 68
		bodyModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 69
		bodyModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 70
		bodyModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		bodyModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		bodyModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 75
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 76
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 77
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 78
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		bodyModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		bodyModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[41] = new ModelRendererTurbo(this, 121, 36, textureX, textureY); // Box 83
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		bodyModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		bodyModel[45] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		bodyModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 89
		bodyModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		bodyModel[49] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 91
		bodyModel[50] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 100
		bodyModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		bodyModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
		bodyModel[54] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		bodyModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 105
		bodyModel[56] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 106
		bodyModel[57] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 107
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 108
		bodyModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
		bodyModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 110
		bodyModel[61] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 111
		bodyModel[62] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 112
		bodyModel[63] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 113
		bodyModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 114
		bodyModel[65] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 115
		bodyModel[66] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
		bodyModel[67] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 117
		bodyModel[68] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		bodyModel[69] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 119
		bodyModel[70] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 111
		bodyModel[71] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 112
		bodyModel[72] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 113
		bodyModel[73] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 114
		bodyModel[74] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 115
		bodyModel[75] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 68
		bodyModel[76] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 96
		bodyModel[77] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 109
		bodyModel[78] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 110
		bodyModel[79] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 111
		bodyModel[80] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 112
		bodyModel[81] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 113
		bodyModel[82] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 114
		bodyModel[83] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 115
		bodyModel[84] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 116
		bodyModel[85] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 117
		bodyModel[86] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 118
		bodyModel[87] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 119
		bodyModel[88] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 120
		bodyModel[89] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 121
		bodyModel[90] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 122
		bodyModel[91] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 123
		bodyModel[92] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 124

		bodyModel[0].addShapeBox(-4F, 4.5F, -2.5F, 8, 3, 5, 0F,-0.1F, 1F, 0.7F, -4F, 0F, 2.3F, -4F, 0F, 1.5F, -0.1F, 1F, 1F, 0.9F, -1F, 0.8F, -4F, 0.51F, 2.1F, -4F, 0F, 1F, 0.9F, -1F, 0.6F); // Box 27
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 7.5F, -2.5F, 8, 3, 5, 0F,0.9F, 1F, 1F, -4F, -0.5F, 2.3F, -4F, 0F, 1.2F, 0.9F, 1F, 0.8F, 0.5F, -0.5F, 0.5F, -4F, 0.2F, 1.5F, -4F, 0F, 0.8F, 0.5F, -0.5F, 0.4F); // Box 28
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 11F, -2.5F, 4, 1, 5, 0F,0.5F, 1F, 0.5F, 0F, 0.3F, 1.5F, 0F, 0.5F, 0.8F, 0.5F, 1F, 0.4F, 0.6F, -1.8F, 0.7F, 0F, -0.8F, 2F, 0F, -0.8F, 1.2F, 0.6F, -1.8F, 0.6F); // Box 29
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 6F, -2.5F, 8, 2, 5, 0F,0.5F, 1F, 1.3F, -4F, 0F, 2.7F, -4F, 0F, 1.5F, 0.4F, 1F, 1F, 0.9F, -1.5F, 0.8F, -4F, 0F, 2.1F, -4F, -0.5F, 1F, 0.9F, -1.5F, 0.6F); // Box 42
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1.5F, -2.5F, 8, 3, 5, 0F,-0.3F, 0.7F, 0.2F, -4F, -0.5F, 1.5F, -4F, -0.5F, 1.3F, -0.2F, 0.7F, 0.7F, -0.1F, -1F, 0.7F, -4F, 0F, 2.3F, -4F, 0F, 1.5F, -0.1F, -1F, 1F); // Box 43
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 8.5F, -2.5F, 8, 2, 5, 0F,0.9F, 0.5F, 1F, -4F, -1F, 2.3F, -4F, -0.5F, 1.2F, 0.9F, 0.5F, 0.8F, 0.5F, -0.5F, 0.5F, -4F, 0.2F, 1.5F, -4F, 0F, 0.8F, 0.5F, -0.5F, 0.4F); // Box 44
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(2.75F, -1F, -4.1F, 2, 6, 7, 0F,0F, 0F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, 0F, 1F, 0F, 0F, 5F, -1F, 1F, -5.5F, -0.5F, 1F, -5.5F, -0.5F, 0F, 5F, -1F, 0F); // Box 28
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-5.25F, -1F, -4F, 2, 6, 7, 0F,-0.3F, -0.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.3F, -0.5F, 0F, -5.5F, -0.5F, 1F, 5F, -1F, 1F, 5F, -1F, 0F, -5.5F, -0.5F, 0F); // Box 29
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-5F, -1F, 2.5F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 30
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-5F, 7F, 4F, 10, 4, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 31
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 10F, 5F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 32
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-5F, 4F, 3F, 10, 3, 3, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F); // Box 50
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2F, -13.5F, 5F, 1, 24, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 54
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(6F, -19.5F, 1F, 1, 6, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 55
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2.5F, 7F, 3.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 56
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(2.6F, 6F, 3.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 57
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.8F, 5F, 3.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 58
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2.9F, 4F, 4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 59
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(3.5F, 0F, 4.5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 60
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3.1F, 3F, 4.2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 61
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(3.2F, 2F, 4.3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 62
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(3.4F, 1F, 4.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 63
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(4.3F, -4F, 5.1F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 64
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(4.2F, -3F, 5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 65
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(4F, -2F, 4.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 66
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(3.9F, -1F, 4.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 67
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(5.3F, -10F, 5.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 68
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(5.2F, -9F, 5.6F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 69
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(5F, -8F, 5.5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 70
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(4.9F, -7F, 5.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 71
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(4.5F, -6F, 5.1F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 72
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(4.4F, -5F, 5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 73
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(5.5F, -11F, 5.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 74
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(5.6F, -12F, 5.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 75
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(5.8F, -13F, 6F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 76
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(5.9F, -14F, 5.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 77
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(5.9F, -15F, 5.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 78
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(6.2F, -16F, 4.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 79
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(6.4F, -17F, 3.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 80
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(6.8F, -18F, 3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 81
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(6.8F, -19F, 2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 82
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4F, -13.5F, 5F, 1, 24, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 83
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4.5F, 7F, 3.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 84
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4.6F, 6F, 3.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 85
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.8F, 5F, 3.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 86
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4.9F, 4F, 4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 87
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-5.2F, 2F, 4.3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 88
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-5.1F, 3F, 4.2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 89
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-5.4F, 1F, 4.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 90
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-5.5F, 0F, 4.5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 91
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-7.2F, -9F, 5.6F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 100
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-7.6F, -10F, 5.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 101
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-7.8F, -11F, 5.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 102
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-7.8F, -12F, 5.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 103
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-8F, -13F, 6F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 104
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-8.1F, -14F, 5.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 105
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-8.1F, -15F, 5.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-8.4F, -16F, 4.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 107
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-8.4F, -17F, 3.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 108
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-8.8F, -18F, 3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 109
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-8.8F, -19F, 2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 110
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-8F, -19.5F, 1F, 1, 6, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 111
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-6.8F, -8F, 5.5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 112
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-6.7F, -7F, 5.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 113
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-6.5F, -6F, 5.3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 114
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-6.4F, -5F, 5.2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 115
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-6.2F, -4F, 5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 116
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-6.1F, -3F, 4.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 117
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-5.9F, -2F, 4.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 118
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-5.8F, -1F, 4.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 119
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-4F, 4.5F, -2.5F, 8, 3, 5, 0F,-4F, 0F, 2.3F, -0.1F, 1F, 0.7F, -0.1F, 1F, 1F, -4F, 0F, 1.5F, -4F, 0.51F, 2.1F, 0.9F, -1F, 0.8F, 0.9F, -1F, 0.6F, -4F, 0F, 1F); // Box 111
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-4F, 6F, -2.5F, 8, 2, 5, 0F,-4F, 0F, 2.7F, 0.5F, 1F, 1.3F, 0.4F, 1F, 1F, -4F, 0F, 1.5F, -4F, 0F, 2.1F, 0.9F, -1.5F, 0.8F, 0.9F, -1.5F, 0.6F, -4F, -0.5F, 1F); // Box 112
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-4F, 7.5F, -2.5F, 8, 3, 5, 0F,-4F, -0.5F, 2.3F, 0.9F, 1F, 1F, 0.9F, 1F, 0.8F, -4F, 0F, 1.2F, -4F, 0.2F, 1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.4F, -4F, 0F, 0.8F); // Box 113
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-4F, 8.5F, -2.5F, 8, 2, 5, 0F,-4F, -1F, 2.3F, 0.9F, 0.5F, 1F, 0.9F, 0.5F, 0.8F, -4F, -0.5F, 1.2F, -4F, 0.2F, 1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.4F, -4F, 0F, 0.8F); // Box 114
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(0F, 11F, -2.5F, 4, 1, 5, 0F,0F, 0.3F, 1.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.4F, 0F, 0.5F, 0.8F, 0F, -0.8F, 2F, 0.6F, -1.8F, 0.7F, 0.6F, -1.8F, 0.6F, 0F, -0.8F, 1.2F); // Box 115
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-4F, 0F, -3F, 4, 2, 6, 0F,0.5F, 0.2F, -0.5F, 0F, 0.2F, 0.7F, 0F, -0.2F, 0.2F, 0.5F, -0.2F, -0.2F, -1.5F, -0.3F, 0.5F, 0F, 0.2F, 1.5F, 0F, 0.2F, 1.5F, -1.5F, -0.3F, 1F); // Box 68
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-0.5F, 9.5F, -4.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 96
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-4F, 1.5F, -2.5F, 8, 3, 5, 0F,-4F, -0.5F, 1.5F, -0.3F, 0.7F, 0.2F, -0.2F, 0.7F, 0.7F, -4F, -0.5F, 1.3F, -4F, 0F, 2.3F, -0.1F, -1F, 0.7F, -0.1F, -1F, 1F, -4F, 0F, 1.5F); // Box 109
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, -3F, 4, 2, 6, 0F,0F, 0.2F, 0.7F, 0.5F, 0.2F, -0.5F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 1.5F, -1.5F, -0.3F, 0.5F, -1.5F, -0.3F, 1F, 0F, 0.2F, 1.5F); // Box 110
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-4.4F, 8.5F, -3.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 111
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(3.4F, 8.5F, -3.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 112
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(3.4F, 7F, -4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 113
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-4.4F, 7F, -4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 114
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(3F, 5.5F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 115
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(-4F, 5.5F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 116
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(2.6F, 4F, -3.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 117
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(-3.6F, 4F, -3.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 118
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(2.3F, 2.2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 119
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(-3.3F, 2.2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 120
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-0.5F, 8.2F, -4.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 121
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-0.5F, 6.5F, -5.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 122
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-0.5F, 4.7F, -5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 123
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(-0.5F, 2.8F, -4.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 124
		bodyModel[92].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 125
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 126
		leftArmModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 127
		leftArmModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 128
		leftArmModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 129
		leftArmModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 130
		leftArmModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 131
		leftArmModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 132
		leftArmModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 133
		leftArmModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 134
		leftArmModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 135
		leftArmModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 136
		leftArmModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 137
		leftArmModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 138
		leftArmModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 139
		leftArmModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 140
		leftArmModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 141

		leftArmModel[0].addShapeBox(1F, 5.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 125
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(1F, 5.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 126
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(1F, 4.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 127
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(1F, 4.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 128
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1F, 3.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 129
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(1F, 3.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 130
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(1F, 2.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 131
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(1F, 2.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 132
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(1F, 1.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 133
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(1F, 1.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 134
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(1F, 0.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 135
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(1F, 0.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 136
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, -0.6F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 2F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.1F, -0.5F, 2F, -2F, 0F, 1F, 0.1F, -0.5F, 0.3F, 0.1F, -0.5F, 0.3F, -2F, 0F, 1F); // Box 137
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-1F, -2.1F, -2F, 4, 2, 4, 0F,1.3F, 0.7F, 1F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 1.3F, 0.7F, 1F, 0.1F, 0F, 2F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.1F, 0F, 2F); // Box 138
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(-1F, 7.5F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 139
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(3F, 4.5F, -2F, 1, 5, 4, 0F,-0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 140
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(3F, 1.1F, -2F, 1, 3, 4, 0F,-1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 141
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 66
		rightArmModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 86
		rightArmModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 87
		rightArmModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 88
		rightArmModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 62
		rightArmModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 63
		rightArmModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 64
		rightArmModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 97
		rightArmModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 98
		rightArmModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 99
		rightArmModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 100
		rightArmModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 101
		rightArmModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 102
		rightArmModel[13] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 103
		rightArmModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 104
		rightArmModel[15] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 107
		rightArmModel[16] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 108

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 2, 4, 0F,0.3F, 0.3F, 0.3F, 1.3F, 0.7F, 1F, 1.3F, 0.7F, 1F, 0.3F, 0.3F, 0.3F, 0.5F, -0.5F, 0.3F, 0.1F, 0F, 2F, 0.1F, 0F, 2F, 0.5F, -0.5F, 0.3F); // Box 66
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -0.6F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.3F, 0.1F, -0.5F, 2F, 0.1F, -0.5F, 2F, 0.5F, 0F, 0.3F, 0.1F, -0.5F, 0.3F, -2F, 0F, 1F, -2F, 0F, 1F, 0.1F, -0.5F, 0.3F); // Box 86
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 0.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 87
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 0.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 88
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-4F, 4.5F, -2F, 1, 5, 4, 0F,0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F); // Box 62
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-4F, 1.1F, -2F, 1, 3, 4, 0F,0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 63
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 7.5F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 64
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 1.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 97
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 1.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 98
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, 2.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 99
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3F, 2.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 100
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3F, 3.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 101
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3F, 3.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 102
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3F, 4.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 103
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3F, 4.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 104
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3F, 5.5F, -2F, 2, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 107
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3F, 5.7F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 108
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);
	}
}