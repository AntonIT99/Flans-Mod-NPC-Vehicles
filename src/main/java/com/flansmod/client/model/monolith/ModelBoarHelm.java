//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BoarHelm
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBoarHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelBoarHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[99];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 47
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 48
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 50
		headModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		headModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		headModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 53
		headModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 54
		headModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 55
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
		headModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 57
		headModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 58
		headModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 59
		headModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 60
		headModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
		headModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 62
		headModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 63
		headModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 64
		headModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 65
		headModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 66
		headModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 67
		headModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 68
		headModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 69
		headModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
		headModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 71
		headModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
		headModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 73
		headModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
		headModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 75
		headModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 76
		headModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 77
		headModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 78
		headModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 79
		headModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 80
		headModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 81
		headModel[37] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 82
		headModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 83
		headModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 84
		headModel[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 85
		headModel[41] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 86
		headModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 87
		headModel[43] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 88
		headModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 89
		headModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		headModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 91
		headModel[47] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 92
		headModel[48] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 93
		headModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 94
		headModel[50] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 95
		headModel[51] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 96
		headModel[52] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		headModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 98
		headModel[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 107
		headModel[55] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 108
		headModel[56] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 109
		headModel[57] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 110
		headModel[58] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 111
		headModel[59] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 112
		headModel[60] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 113
		headModel[61] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 114
		headModel[62] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 115
		headModel[63] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 116
		headModel[64] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 117
		headModel[65] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 118
		headModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 119
		headModel[67] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 120
		headModel[68] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 121
		headModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 122
		headModel[70] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 123
		headModel[71] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 124
		headModel[72] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 125
		headModel[73] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 126
		headModel[74] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 127
		headModel[75] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 128
		headModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 129
		headModel[77] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 130
		headModel[78] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 131
		headModel[79] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 132
		headModel[80] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 133
		headModel[81] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 134
		headModel[82] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 135
		headModel[83] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 136
		headModel[84] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 137
		headModel[85] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 138
		headModel[86] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 180
		headModel[87] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		headModel[88] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 50
		headModel[89] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 51
		headModel[90] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 52
		headModel[91] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 53
		headModel[92] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 54
		headModel[93] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 55
		headModel[94] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		headModel[95] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 130
		headModel[96] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 131
		headModel[97] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 132
		headModel[98] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 133

		headModel[0].addShapeBox(-4F, -10.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(4.05F, -6.5F, -5F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 37
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(4.05F, -6.5F, -4F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 47
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(4.05F, -6.5F, -3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 48
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(4.05F, -6.5F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 49
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4.05F, -6.5F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 50
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4.05F, -6.5F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 51
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4.05F, -6.5F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 52
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4.05F, -6.5F, 2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 53
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4.05F, -6.5F, 3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 54
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4.05F, -6.5F, 4F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 55
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3.3F, -8.9F, -3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 56
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3.3F, -8.9F, -4F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 57
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3.3F, -8.9F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 58
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.3F, -8.9F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 59
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3.3F, -8.9F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 60
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(3.3F, -8.9F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 61
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(3.3F, -8.9F, 2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 62
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(3.3F, -8.9F, 3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 63
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4.3F, -8.9F, 3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 64
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4.3F, -8.9F, 2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 65
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4.3F, -8.9F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 66
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4.3F, -8.9F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 67
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4.3F, -8.9F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 68
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4.3F, -8.9F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 69
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4.3F, -8.9F, -3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 70
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-4.3F, -8.9F, -4F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 71
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5.05F, -6.5F, -5F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 72
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-5.05F, -6.5F, -4F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 73
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-5.05F, -6.5F, -3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 74
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-5.05F, -6.5F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 75
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-5.05F, -6.5F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 76
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-5.05F, -6.5F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 77
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-5.05F, -6.5F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 78
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-5.05F, -6.5F, 2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 79
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-5.05F, -6.5F, 3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 80
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-5.05F, -6.5F, 4F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 81
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-4F, -8.4F, -4F, 8, 1, 8, 0F,0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 1F, 0.3F, 1F, 1F, 0.3F, 1F, 1F, 0.3F, 1F, 1F, 0.3F, 1F); // Box 82
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-4.05F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 83
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-3.05F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 84
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-2.05F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 85
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(0.95F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 86
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-0.0499999999999998F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 87
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-1.05F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 88
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(2.95F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 89
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(1.95F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 90
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(2.95F, -6.5F, 4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 91
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(1.95F, -6.5F, 4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 92
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-0.0499999999999998F, -6.5F, 4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 93
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(0.95F, -6.5F, 4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 94
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-1.05F, -6.5F, 4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 95
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-2.05F, -6.5F, 4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 96
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-3.05F, -6.5F, 4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 97
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-4.05F, -6.5F, 4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 98
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(-4.05F, -8.9F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 107
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-3.05F, -8.9F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 108
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-1.05F, -8.9F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 109
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(-2.05F, -8.9F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 110
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(2.95F, -8.9F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 111
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(1.95F, -8.9F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 112
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(0.95F, -8.9F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 113
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-0.05F, -8.9F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 114
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(2.95F, -8.9F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 115
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(1.95F, -8.9F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 116
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(0.95F, -8.9F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 117
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(-0.0499999999999996F, -8.9F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 118
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(-1.05F, -8.9F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 119
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(-2.05F, -8.9F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 120
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(-3.05F, -8.9F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 121
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(-4.05F, -8.9F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 122
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(1.2F, -10.75F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 123
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(1.2F, -10.75F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 124
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(1.2F, -10.75F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 125
		headModel[72].setRotationPoint(0F, 0F, 0F);

		headModel[73].addShapeBox(1.2F, -10.75F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 126
		headModel[73].setRotationPoint(0F, 0F, 0F);

		headModel[74].addShapeBox(-2.2F, -10.75F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F); // Box 127
		headModel[74].setRotationPoint(0F, 0F, 0F);

		headModel[75].addShapeBox(-2.2F, -10.75F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F); // Box 128
		headModel[75].setRotationPoint(0F, 0F, 0F);

		headModel[76].addShapeBox(-2.2F, -10.75F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F); // Box 129
		headModel[76].setRotationPoint(0F, 0F, 0F);

		headModel[77].addShapeBox(-2.2F, -10.75F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F); // Box 130
		headModel[77].setRotationPoint(0F, 0F, 0F);

		headModel[78].addShapeBox(-0.0499999999999996F, -10.75F, -2.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 131
		headModel[78].setRotationPoint(0F, 0F, 0F);

		headModel[79].addShapeBox(0.95F, -10.75F, -2.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 132
		headModel[79].setRotationPoint(0F, 0F, 0F);

		headModel[80].addShapeBox(-1.05F, -10.75F, -2.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 133
		headModel[80].setRotationPoint(0F, 0F, 0F);

		headModel[81].addShapeBox(-2.05F, -10.75F, -2.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 134
		headModel[81].setRotationPoint(0F, 0F, 0F);

		headModel[82].addShapeBox(-1.05F, -10.75F, 1.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F); // Box 135
		headModel[82].setRotationPoint(0F, 0F, 0F);

		headModel[83].addShapeBox(-2.05F, -10.75F, 1.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F); // Box 136
		headModel[83].setRotationPoint(0F, 0F, 0F);

		headModel[84].addShapeBox(0.95F, -10.75F, 1.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F); // Box 137
		headModel[84].setRotationPoint(0F, 0F, 0F);

		headModel[85].addShapeBox(-0.0499999999999996F, -10.75F, 1.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F); // Box 138
		headModel[85].setRotationPoint(0F, 0F, 0F);

		headModel[86].addShapeBox(-5.05F, -5F, -5F, 10, 1, 10, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 180
		headModel[86].setRotationPoint(0F, 0F, 0F);

		headModel[87].addShapeBox(-2F, -11.5F, -2F, 4, 1, 4, 0F,-1.8F, 0.4F, -1.8F, -1.8F, 0.4F, -1.8F, -1.8F, 0.4F, -1.8F, -1.8F, 0.4F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		headModel[87].setRotationPoint(0F, 0F, 0F);

		headModel[88].addShapeBox(-0.5F, -13.8F, -0.5F, 1, 1, 1, 0F,0.3F, 0.5F, -0.7F, 0.3F, 0.5F, -0.7F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[88].setRotationPoint(0F, 0F, 0F);

		headModel[89].addShapeBox(-0.5F, -14.5F, 0.5F, 1, 1, 2, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 51
		headModel[89].setRotationPoint(0F, 0F, 0F);

		headModel[90].addShapeBox(-0.5F, -13.8F, 2.5F, 1, 1, 1, 0F,0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0.3F, 0.8F, -1F, 0.3F, 0.8F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 52
		headModel[90].setRotationPoint(0F, 0F, 0F);

		headModel[91].addShapeBox(-0.5F, -13.8F, 2.5F, 1, 4, 1, 0F,0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 2.5F, 0.8F, 0F, 2.5F); // Box 53
		headModel[91].setRotationPoint(0F, 0F, 0F);

		headModel[92].addShapeBox(-0.5F, -9.8F, 4.5F, 1, 5, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.9F, 0.3F, -1F, 0.9F, 0.3F, -1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 54
		headModel[92].setRotationPoint(0F, 0F, 0F);

		headModel[93].addShapeBox(-0.5F, -4.8F, 5.5F, 1, 5, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 55
		headModel[93].setRotationPoint(0F, 0F, 0F);

		headModel[94].addShapeBox(-0.5F, -13F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[94].setRotationPoint(0F, 0F, 0F);

		headModel[95].addShapeBox(-3.05F, -5F, -5F, 6, 1, 2, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 130
		headModel[95].setRotationPoint(0F, 0F, 0F);

		headModel[96].addShapeBox(-5.05F, -7.3F, -5F, 10, 1, 10, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 131
		headModel[96].setRotationPoint(0F, 0F, 0F);

		headModel[97].addShapeBox(-4.05F, -9.5F, -4F, 8, 1, 8, 0F,0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 132
		headModel[97].setRotationPoint(0F, 0F, 0F);

		headModel[98].addShapeBox(-5F, -4.5F, -3F, 10, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.7F, 3.6F, 0.8F, -0.7F, 3.6F, 0.8F, -0.7F, 3.6F, -1.4F, -0.7F, 3.6F, -1.4F); // Box 133
		headModel[98].setRotationPoint(0F, 0F, 0F);
	}
}