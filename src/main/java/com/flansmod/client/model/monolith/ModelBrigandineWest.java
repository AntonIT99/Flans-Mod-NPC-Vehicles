//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BrigandineWest
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBrigandineWest extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelBrigandineWest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[102];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 23
		bodyModel[1] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 24
		bodyModel[2] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 25
		bodyModel[3] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 37
		bodyModel[14] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 38
		bodyModel[15] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 39
		bodyModel[16] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 41
		bodyModel[18] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 42
		bodyModel[19] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 43
		bodyModel[20] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 44
		bodyModel[21] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 45
		bodyModel[22] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 46
		bodyModel[23] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 47
		bodyModel[24] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 48
		bodyModel[25] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 49
		bodyModel[26] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 50
		bodyModel[27] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 51
		bodyModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 52
		bodyModel[29] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 53
		bodyModel[30] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 54
		bodyModel[31] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 55
		bodyModel[32] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 56
		bodyModel[33] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 59
		bodyModel[34] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 60
		bodyModel[35] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 61
		bodyModel[36] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 62
		bodyModel[37] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 64
		bodyModel[39] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 65
		bodyModel[40] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 66
		bodyModel[41] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 67
		bodyModel[42] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 68
		bodyModel[43] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 69
		bodyModel[44] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 70
		bodyModel[45] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 71
		bodyModel[46] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 72
		bodyModel[47] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 73
		bodyModel[48] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 74
		bodyModel[49] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 75
		bodyModel[50] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 76
		bodyModel[51] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 77
		bodyModel[52] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 78
		bodyModel[53] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 80
		bodyModel[55] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 81
		bodyModel[56] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 82
		bodyModel[57] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 83
		bodyModel[58] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 84
		bodyModel[59] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 85
		bodyModel[60] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 86
		bodyModel[61] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 88
		bodyModel[63] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 89
		bodyModel[64] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 90
		bodyModel[65] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 91
		bodyModel[66] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 92
		bodyModel[67] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 93
		bodyModel[68] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 94
		bodyModel[69] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 95
		bodyModel[70] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 96
		bodyModel[71] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 97
		bodyModel[72] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 98
		bodyModel[73] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 99
		bodyModel[74] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 100
		bodyModel[75] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 101
		bodyModel[76] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 102
		bodyModel[77] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 103
		bodyModel[78] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 104
		bodyModel[79] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 105
		bodyModel[80] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 106
		bodyModel[81] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 107
		bodyModel[82] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 108
		bodyModel[83] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 109
		bodyModel[84] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 110
		bodyModel[85] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 111
		bodyModel[86] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 112
		bodyModel[87] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 113
		bodyModel[88] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 114
		bodyModel[89] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 115
		bodyModel[90] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 116
		bodyModel[91] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 117
		bodyModel[92] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 118
		bodyModel[93] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 119
		bodyModel[94] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 120
		bodyModel[95] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 121
		bodyModel[96] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 122
		bodyModel[97] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 123
		bodyModel[98] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 124
		bodyModel[99] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 125
		bodyModel[100] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 126
		bodyModel[101] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 127

		bodyModel[0].addShapeBox(-4F, 4F, -2F, 8, 6, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 23
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10.2F, -2F, 8, 4, 4, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F); // Box 24
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 3F, -2F, 8, 1, 4, 0F,0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F); // Box 25
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0F, -2F, 8, 3, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, -0.1F, 0.5F, 0.2F, -0.1F, 0.5F, 0.2F, -0.1F, 0.5F, 0.2F, -0.1F, 0.5F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2F, 1F, -2.6F, 4, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 27
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2F, 5F, -2.65F, 4, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 28
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2F, 9F, -2.5F, 4, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 29
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2F, 13F, -2.8F, 4, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 30
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(1.6F, 1F, -2.6F, 2, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.5F, -2.4F, 0.2F, -0.5F, -2.4F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, 1.8F, 0.2F, -0.8F, 1.8F, 0.2F, -0.2F, -0.2F, 0F); // Box 31
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(1.6F, 5F, -2.65F, 2, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.5F, -2.4F, 0.2F, -0.5F, -2.4F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, 1.8F, 0.2F, -0.8F, 1.8F, 0.2F, -0.2F, -0.2F, 0F); // Box 32
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(1.6F, 9F, -2.5F, 2, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.5F, -2.4F, 0.2F, -0.5F, -2.4F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, 1.8F, 0.2F, -0.8F, 1.8F, 0.2F, -0.2F, -0.2F, 0F); // Box 33
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.6F, 13F, -2.8F, 2, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.5F, -2.4F, 0.2F, -0.5F, -2.4F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.8F, 1.8F, 0.2F, -0.8F, 1.8F, 0.2F, -0.2F, -0.2F, 0F); // Box 34
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 35
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 37
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 38
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 39
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 40
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 41
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 42
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.5F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 43
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-5F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 44
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-5F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 45
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-5F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 46
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-5F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 47
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 48
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 49
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 50
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 51
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1.5F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 52
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(1.5F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 53
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1.5F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 54
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(1.5F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 55
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1.5F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 56
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 59
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1.5F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 60
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 61
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3.3F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 62
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1.8F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 63
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1.8F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 64
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-3.3F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 65
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.8F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 66
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4.8F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 67
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-5F, 9.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 68
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3.5F, 9.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 69
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2F, 9.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 70
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(0F, 9.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 71
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(1.5F, 9.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 72
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-5F, 11F, -2.55F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 73
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3.5F, 11F, -2.55F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 74
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2F, 11F, -2.55F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 75
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0F, 11F, -2.55F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 76
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(1.5F, 11F, -2.55F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 77
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-5F, 12.5F, -2.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 78
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-3.5F, 12.5F, -2.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 79
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-2F, 12.5F, -2.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 80
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(0F, 12.5F, -2.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 81
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(1.5F, 12.5F, -2.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 82
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-4.8F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 83
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-4.8F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 84
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-3.3F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 85
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-3.3F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 86
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-1.8F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 87
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-1.8F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 88
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(0F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 89
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(0F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 90
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(1.5F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 91
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(1.5F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 92
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(1.5F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 93
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(1.5F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 94
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(0F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 95
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(0F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 96
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-2F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 97
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-2F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 98
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-3.5F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 99
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-3.5F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 100
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-5F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 101
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-5F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 102
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-5F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 103
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-5F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 104
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-3.5F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 105
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(-3.5F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 106
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(-2F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 107
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(-2F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 108
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(1.5F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 109
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(1.5F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 110
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(0F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 111
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(0F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 112
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(0F, 9.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 113
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(1.5F, 11F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 114
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(1.5F, 9.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 115
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(0F, 11F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 116
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(0F, 12.5F, 1.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 117
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(1.5F, 12.5F, 1.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 118
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-2F, 12.5F, 1.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 119
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-2F, 11F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 120
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-2F, 9.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 121
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-3.5F, 9.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 122
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-5F, 9.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 123
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-5F, 11F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 124
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-3.5F, 11F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 125
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-3.5F, 12.5F, 1.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 126
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-5F, 12.5F, 1.65F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 127
		bodyModel[101].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 132
		leftArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 133
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 134

		leftArmModel[0].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 132
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 133
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-3F, -7.1F, -4F, 8, 20, 8, 0F,-1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F); // Box 134
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 96
		rightArmModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 97

		rightArmModel[0].addShapeBox(-5F, -7.1F, -4F, 8, 20, 8, 0F,-1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 96
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 97
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 128
		leftLegModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 129
		leftLegModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 130
		leftLegModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 131

		leftLegModel[0].addShapeBox(-4F, -5.1F, -4F, 8, 19, 8, 0F,-1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F); // Box 128
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 7.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F); // Box 129
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 8.8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 130
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 131
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		rightLegModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 60
		rightLegModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 61
		rightLegModel[3] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 36

		rightLegModel[0].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F); // Box 60
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 8.8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-4F, -5.1F, -4F, 8, 19, 8, 0F,-1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F); // Box 36
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}