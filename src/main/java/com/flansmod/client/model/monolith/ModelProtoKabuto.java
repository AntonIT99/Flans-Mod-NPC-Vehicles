//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: nuKabuto
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelProtoKabuto extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelProtoKabuto() //Same as Filename
	{
		headModel = new ModelRendererTurbo[106];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 43
		headModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 44
		headModel[2] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 45
		headModel[3] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 46
		headModel[4] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 47
		headModel[5] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 48
		headModel[6] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 49
		headModel[7] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 50
		headModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 52
		headModel[9] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 53
		headModel[10] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 54
		headModel[11] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 55
		headModel[12] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 58
		headModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		headModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		headModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 47
		headModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 48
		headModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		headModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 50
		headModel[19] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 51
		headModel[20] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		headModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 53
		headModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 54
		headModel[23] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 55
		headModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
		headModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 57
		headModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 58
		headModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 59
		headModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 60
		headModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
		headModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 62
		headModel[31] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 63
		headModel[32] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 64
		headModel[33] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 65
		headModel[34] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 66
		headModel[35] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 67
		headModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 68
		headModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 69
		headModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 70
		headModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 71
		headModel[40] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
		headModel[41] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 73
		headModel[42] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
		headModel[43] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 75
		headModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 76
		headModel[45] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 77
		headModel[46] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 78
		headModel[47] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 79
		headModel[48] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 80
		headModel[49] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 81
		headModel[50] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 82
		headModel[51] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 83
		headModel[52] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 84
		headModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 85
		headModel[54] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 86
		headModel[55] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 87
		headModel[56] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 88
		headModel[57] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 89
		headModel[58] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		headModel[59] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 91
		headModel[60] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 92
		headModel[61] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 93
		headModel[62] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 94
		headModel[63] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 95
		headModel[64] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 96
		headModel[65] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		headModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 98
		headModel[67] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 106
		headModel[68] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 107
		headModel[69] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 108
		headModel[70] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 109
		headModel[71] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 110
		headModel[72] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 111
		headModel[73] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 112
		headModel[74] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 113
		headModel[75] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 114
		headModel[76] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 115
		headModel[77] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 116
		headModel[78] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 117
		headModel[79] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 118
		headModel[80] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 119
		headModel[81] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 120
		headModel[82] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 121
		headModel[83] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 122
		headModel[84] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 123
		headModel[85] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 124
		headModel[86] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 125
		headModel[87] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 126
		headModel[88] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 127
		headModel[89] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 128
		headModel[90] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 129
		headModel[91] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 130
		headModel[92] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 131
		headModel[93] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 132
		headModel[94] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 133
		headModel[95] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 134
		headModel[96] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 135
		headModel[97] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 136
		headModel[98] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 137
		headModel[99] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 138
		headModel[100] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 180
		headModel[101] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 56
		headModel[102] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 57
		headModel[103] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		headModel[104] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 121
		headModel[105] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 122

		headModel[0].addShapeBox(-4F, -5.5F, 4.7F, 8, 2, 1, 0F,0.9F, -0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.6F, 0.9F, -0.2F, -0.3F, 0.9F, -0.2F, -0.3F, 0.9F, -0.2F, -0.3F, 0.9F, -0.2F, -0.3F); // Box 43
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -4.5F, 5.1F, 8, 2, 1, 0F,1.3F, -0.2F, 0F, 1.3F, -0.2F, 0F, 1.3F, -0.2F, -0.6F, 1.3F, -0.2F, -0.6F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F, 1.3F, -0.2F, -0.3F); // Box 44
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -3.5F, 5.5F, 8, 2, 1, 0F,1.7F, -0.2F, 0F, 1.7F, -0.2F, 0F, 1.7F, -0.2F, -0.6F, 1.7F, -0.2F, -0.6F, 1.7F, -0.2F, -0.3F, 1.7F, -0.2F, -0.3F, 1.7F, -0.2F, -0.3F, 1.7F, -0.2F, -0.3F); // Box 45
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -2.2F, 5.9F, 8, 2, 1, 0F,2.1F, -0.2F, 0F, 2.1F, -0.2F, 0F, 2.1F, -0.2F, -0.6F, 2.1F, -0.2F, -0.6F, 2.1F, -0.2F, -0.3F, 2.1F, -0.2F, -0.3F, 2.1F, -0.2F, -0.3F, 2.1F, -0.2F, -0.3F); // Box 46
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5.5F, -5.5F, -4F, 1, 2, 9, 0F,-0.6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 47
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5.9F, -4.5F, -4F, 1, 2, 9, 0F,-0.6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.4F, -0.6F, -0.2F, 0.4F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F); // Box 48
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-6.3F, -3.5F, -4F, 1, 2, 9, 0F,-0.6F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.8F, -0.6F, -0.2F, 0.8F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.8F, -0.3F, -0.2F, 0.8F); // Box 49
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-6.7F, -2.3F, -4F, 1, 2, 10, 0F,-0.6F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0.1F, -0.6F, -0.2F, 0.1F, -0.6F, -0.2F, 0.5F, 0F, -0.2F, 0.5F); // Box 50
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4.5F, -5.5F, -4F, 1, 2, 9, 0F,0F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 52
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4.9F, -4.5F, -4F, 1, 2, 9, 0F,0F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F, -0.6F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F); // Box 53
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(5.3F, -3.5F, -4F, 1, 2, 9, 0F,0F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F, -0.6F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.8F, -0.3F, -0.2F, 0.8F); // Box 54
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(5.7F, -2.3F, -4F, 1, 2, 10, 0F,0F, -0.2F, 0.1F, -0.6F, -0.2F, 0.1F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.5F, -0.6F, -0.2F, 0.5F); // Box 55
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -4.5F, -3F, 8, 5, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, -1F, 0.1F, -0.3F, -1F); // Box 58
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4.05F, -6.5F, -5F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 37
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4.05F, -6.5F, -4F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 47
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(4.05F, -6.5F, -3F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 48
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(4.05F, -6.5F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 49
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4.05F, -6.5F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 50
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4.05F, -6.5F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 51
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(4.05F, -6.5F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 52
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(4.05F, -6.5F, 2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 53
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(4.05F, -6.5F, 3F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 54
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(4.05F, -6.5F, 4F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 55
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(3.3F, -8.3F, -3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 56
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(3.3F, -8.3F, -4F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 57
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(3.3F, -8.3F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 58
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(3.3F, -8.3F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 59
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(3.3F, -8.3F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 60
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(3.3F, -8.3F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 61
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(3.3F, -8.3F, 2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 62
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(3.3F, -8.3F, 3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 63
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-4.3F, -8.3F, 3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 64
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-4.3F, -8.3F, 2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 65
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-4.3F, -8.3F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 66
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-4.3F, -8.3F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 67
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-4.3F, -8.3F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 68
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-4.3F, -8.3F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 69
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-4.3F, -8.3F, -3F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 70
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-4.3F, -8.3F, -4F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.9F, 0F, -0.05F); // Box 71
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-5.05F, -6.5F, -5F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 72
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-5.05F, -6.5F, -4F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 73
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-5.05F, -6.5F, -3F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 74
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-5.05F, -6.5F, -2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 75
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-5.05F, -6.5F, -1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 76
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-5.05F, -6.5F, 0F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 77
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-5.05F, -6.5F, 1F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 78
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-5.05F, -6.5F, 2F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 79
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-5.05F, -6.5F, 3F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 80
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(-5.05F, -6.5F, 4F, 1, 3, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 81
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(-4F, -7.8F, -4F, 8, 1, 8, 0F,0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 1F, 0.3F, 1F, 1F, 0.3F, 1F, 1F, 0.3F, 1F, 1F, 0.3F, 1F); // Box 82
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(-4.05F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 83
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(-3.05F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 84
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(-2.05F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 85
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(0.95F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 86
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(-0.0499999999999998F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 87
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(-1.05F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 88
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(2.95F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 89
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(1.95F, -6.5F, -5F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 90
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(2.95F, -6.5F, 4F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 91
		headModel[59].setRotationPoint(0F, 0F, 0F);

		headModel[60].addShapeBox(1.95F, -6.5F, 4F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 92
		headModel[60].setRotationPoint(0F, 0F, 0F);

		headModel[61].addShapeBox(-0.0499999999999998F, -6.5F, 4F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 93
		headModel[61].setRotationPoint(0F, 0F, 0F);

		headModel[62].addShapeBox(0.95F, -6.5F, 4F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 94
		headModel[62].setRotationPoint(0F, 0F, 0F);

		headModel[63].addShapeBox(-1.05F, -6.5F, 4F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 95
		headModel[63].setRotationPoint(0F, 0F, 0F);

		headModel[64].addShapeBox(-2.05F, -6.5F, 4F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 96
		headModel[64].setRotationPoint(0F, 0F, 0F);

		headModel[65].addShapeBox(-3.05F, -6.5F, 4F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 97
		headModel[65].setRotationPoint(0F, 0F, 0F);

		headModel[66].addShapeBox(-4.05F, -6.5F, 4F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 98
		headModel[66].setRotationPoint(0F, 0F, 0F);

		headModel[67].addShapeBox(-4.05F, -4.3F, 4.1F, 1, 3, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F); // Box 106
		headModel[67].setRotationPoint(0F, 0F, 0F);

		headModel[68].addShapeBox(-4.05F, -8.3F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 107
		headModel[68].setRotationPoint(0F, 0F, 0F);

		headModel[69].addShapeBox(-3.05F, -8.3F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 108
		headModel[69].setRotationPoint(0F, 0F, 0F);

		headModel[70].addShapeBox(-1.05F, -8.3F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 109
		headModel[70].setRotationPoint(0F, 0F, 0F);

		headModel[71].addShapeBox(-2.05F, -8.3F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 110
		headModel[71].setRotationPoint(0F, 0F, 0F);

		headModel[72].addShapeBox(2.95F, -8.3F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 111
		headModel[72].setRotationPoint(0F, 0F, 0F);

		headModel[73].addShapeBox(1.95F, -8.3F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 112
		headModel[73].setRotationPoint(0F, 0F, 0F);

		headModel[74].addShapeBox(0.95F, -8.3F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 113
		headModel[74].setRotationPoint(0F, 0F, 0F);

		headModel[75].addShapeBox(-0.0499999999999996F, -8.3F, -4.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F); // Box 114
		headModel[75].setRotationPoint(0F, 0F, 0F);

		headModel[76].addShapeBox(2.95F, -8.3F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 115
		headModel[76].setRotationPoint(0F, 0F, 0F);

		headModel[77].addShapeBox(1.95F, -8.3F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 116
		headModel[77].setRotationPoint(0F, 0F, 0F);

		headModel[78].addShapeBox(0.95F, -8.3F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 117
		headModel[78].setRotationPoint(0F, 0F, 0F);

		headModel[79].addShapeBox(-0.0499999999999996F, -8.3F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 118
		headModel[79].setRotationPoint(0F, 0F, 0F);

		headModel[80].addShapeBox(-1.05F, -8.3F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 119
		headModel[80].setRotationPoint(0F, 0F, 0F);

		headModel[81].addShapeBox(-2.05F, -8.3F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 120
		headModel[81].setRotationPoint(0F, 0F, 0F);

		headModel[82].addShapeBox(-3.05F, -8.3F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 121
		headModel[82].setRotationPoint(0F, 0F, 0F);

		headModel[83].addShapeBox(-4.05F, -8.3F, 3.4F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0.8F, -0.05F, -0.2F, 0.8F); // Box 122
		headModel[83].setRotationPoint(0F, 0F, 0F);

		headModel[84].addShapeBox(1.2F, -9.75F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 123
		headModel[84].setRotationPoint(0F, 0F, 0F);

		headModel[85].addShapeBox(1.2F, -9.75F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 124
		headModel[85].setRotationPoint(0F, 0F, 0F);

		headModel[86].addShapeBox(1.2F, -9.75F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 125
		headModel[86].setRotationPoint(0F, 0F, 0F);

		headModel[87].addShapeBox(1.2F, -9.75F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F); // Box 126
		headModel[87].setRotationPoint(0F, 0F, 0F);

		headModel[88].addShapeBox(-2.2F, -9.75F, 1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F); // Box 127
		headModel[88].setRotationPoint(0F, 0F, 0F);

		headModel[89].addShapeBox(-2.2F, -9.75F, 0F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F); // Box 128
		headModel[89].setRotationPoint(0F, 0F, 0F);

		headModel[90].addShapeBox(-2.2F, -9.75F, -1F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F); // Box 129
		headModel[90].setRotationPoint(0F, 0F, 0F);

		headModel[91].addShapeBox(-2.2F, -9.75F, -2F, 1, 2, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 2.2F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 2.2F, -0.5F, -0.05F); // Box 130
		headModel[91].setRotationPoint(0F, 0F, 0F);

		headModel[92].addShapeBox(-0.0499999999999996F, -9.75F, -2.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 131
		headModel[92].setRotationPoint(0F, 0F, 0F);

		headModel[93].addShapeBox(0.95F, -9.75F, -2.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 132
		headModel[93].setRotationPoint(0F, 0F, 0F);

		headModel[94].addShapeBox(-1.05F, -9.75F, -2.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 133
		headModel[94].setRotationPoint(0F, 0F, 0F);

		headModel[95].addShapeBox(-2.05F, -9.75F, -2.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F); // Box 134
		headModel[95].setRotationPoint(0F, 0F, 0F);

		headModel[96].addShapeBox(-1.05F, -9.75F, 1.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F); // Box 135
		headModel[96].setRotationPoint(0F, 0F, 0F);

		headModel[97].addShapeBox(-2.05F, -9.75F, 1.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F); // Box 136
		headModel[97].setRotationPoint(0F, 0F, 0F);

		headModel[98].addShapeBox(0.95F, -9.75F, 1.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F); // Box 137
		headModel[98].setRotationPoint(0F, 0F, 0F);

		headModel[99].addShapeBox(-0.0499999999999996F, -9.75F, 1.3F, 1, 2, 1, 0F,-0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 2.1F, -0.05F, -0.5F, 2.1F); // Box 138
		headModel[99].setRotationPoint(0F, 0F, 0F);

		headModel[100].addShapeBox(-3.05F, -1.5F, 3F, 6, 1, 2, 0F,0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 180
		headModel[100].setRotationPoint(0F, 0F, 0F);

		headModel[101].addShapeBox(-4F, -5.5F, -5F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.3F, 0F, 0.1F, 2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 56
		headModel[101].setRotationPoint(0F, 0F, 0F);

		headModel[102].addShapeBox(0F, -5.5F, -5F, 4, 1, 1, 0F,0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.1F, 2.5F, 0.5F, 0F, 1.3F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		headModel[102].setRotationPoint(0F, 0F, 0F);

		headModel[103].addShapeBox(-0.5F, -10.6F, -0.5F, 1, 1, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 25
		headModel[103].setRotationPoint(0F, 0F, 0F);

		headModel[104].addShapeBox(-0.5F, -11.5F, -0.5F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 121
		headModel[104].setRotationPoint(0F, 0F, 0F);

		headModel[105].addShapeBox(-0.5F, -12.5F, -0.5F, 1, 1, 1, 0F,0.7F, -0.1F, 0.7F, 0.7F, -0.1F, 0.7F, 0.7F, -0.1F, 0.7F, 0.7F, -0.1F, 0.7F, 0.4F, -0.1F, 0.4F, 0.4F, -0.1F, 0.4F, 0.4F, -0.1F, 0.4F, 0.4F, -0.1F, 0.4F); // Box 122
		headModel[105].setRotationPoint(0F, 0F, 0F);
	}
}