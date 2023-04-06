//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GenericCuirassNappy
// Model Creator: 
// Created on: 24.06.2022 - 18:43:07
// Last changed on: 24.06.2022 - 18:43:07

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGenericCuirassNappy extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelGenericCuirassNappy() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[112];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box50
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box51
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box52
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box53
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box54
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box55
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box56
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box57
		bodyModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box58
		bodyModel[9] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box59
		bodyModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box60
		bodyModel[11] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import Box66
		bodyModel[12] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box67
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box68
		bodyModel[14] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box69
		bodyModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box70
		bodyModel[16] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box71
		bodyModel[17] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box72
		bodyModel[18] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box73
		bodyModel[19] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box74
		bodyModel[20] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box75
		bodyModel[21] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box77
		bodyModel[22] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box78
		bodyModel[23] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box81
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box82
		bodyModel[25] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box83
		bodyModel[26] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box84
		bodyModel[27] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box85
		bodyModel[28] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box86
		bodyModel[29] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box87
		bodyModel[30] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box88
		bodyModel[31] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box89
		bodyModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box90
		bodyModel[33] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box91
		bodyModel[34] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import Box92
		bodyModel[35] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box93
		bodyModel[36] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box96
		bodyModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box97
		bodyModel[38] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box98
		bodyModel[39] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box99
		bodyModel[40] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box100
		bodyModel[41] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box101
		bodyModel[42] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box102
		bodyModel[43] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box103
		bodyModel[44] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box104
		bodyModel[45] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box105
		bodyModel[46] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box106
		bodyModel[47] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box107
		bodyModel[48] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box108
		bodyModel[49] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box109
		bodyModel[50] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box110
		bodyModel[51] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box111
		bodyModel[52] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box112
		bodyModel[53] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box113
		bodyModel[54] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box114
		bodyModel[55] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box115
		bodyModel[56] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box116
		bodyModel[57] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box117
		bodyModel[58] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box118
		bodyModel[59] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box119
		bodyModel[60] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box120
		bodyModel[61] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box121
		bodyModel[62] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box122
		bodyModel[63] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box123
		bodyModel[64] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box124
		bodyModel[65] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box125
		bodyModel[66] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box126
		bodyModel[67] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box127
		bodyModel[68] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box128
		bodyModel[69] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box129
		bodyModel[70] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box130
		bodyModel[71] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box131
		bodyModel[72] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box76
		bodyModel[73] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box77
		bodyModel[74] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box78
		bodyModel[75] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box79
		bodyModel[76] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box80
		bodyModel[77] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box81
		bodyModel[78] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box82
		bodyModel[79] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box83
		bodyModel[80] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box84
		bodyModel[81] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box85
		bodyModel[82] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box86
		bodyModel[83] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box87
		bodyModel[84] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box88
		bodyModel[85] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box89
		bodyModel[86] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box90
		bodyModel[87] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box91
		bodyModel[88] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box92
		bodyModel[89] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box93
		bodyModel[90] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box94
		bodyModel[91] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box95
		bodyModel[92] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box96
		bodyModel[93] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box97
		bodyModel[94] = new ModelRendererTurbo(this, 9, 21, textureX, textureY); // Import Box98
		bodyModel[95] = new ModelRendererTurbo(this, 9, 21, textureX, textureY); // Import Box99
		bodyModel[96] = new ModelRendererTurbo(this, 9, 21, textureX, textureY); // Import Box100
		bodyModel[97] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box101
		bodyModel[98] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box102
		bodyModel[99] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box103
		bodyModel[100] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box104
		bodyModel[101] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box105
		bodyModel[102] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import Box106
		bodyModel[103] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box107
		bodyModel[104] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box108
		bodyModel[105] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box109
		bodyModel[106] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box110
		bodyModel[107] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box111
		bodyModel[108] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box112
		bodyModel[109] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box113
		bodyModel[110] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box114
		bodyModel[111] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box115

		bodyModel[0].addShapeBox(0F, 4F, -4F, 4, 2, 4, 0F,-0.1F, -0.5F, 1.2F, 0F, -0.5F, 0.2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 6F, -4F, 4, 2, 4, 0F,-0.1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8F, -4F, 4, 1, 4, 0F,-0.1F, 0F, 0.5F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0.8F, -1.5F, 0.6F, 0.5F, -2F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Import Box52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(3F, 1F, -4F, 1, 4, 4, 0F,1F, 1.5F, -1F, 0.5F, 1F, -1.5F, 0.4F, 0F, -1.5F, 0.5F, 0.5F, -1.5F, 2.9F, -0.5F, 1.2F, 0F, -0.5F, 0.2F, 0F, -1F, -2F, 3F, -1F, -2F); // Import Box53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0.5F, -3F, 2, 1, 3, 0F,0.5F, 0.5F, -0.5F, 0F, 1F, 0F, -0.3F, 2F, 0.5F, 0.8F, 1.5F, 0.5F, 0.2F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -1.5F, 0.5F, 0.4F, -1F, 0.5F); // Import Box54
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 4F, 1F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.2F, 0F, 0F, 0.7F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 1F, 0F, 0.3F); // Import Box55
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1F, 1F, 3, 3, 2, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 1F, 0.5F, 0.5F, 1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1.2F, 0F, 0F, 0.7F); // Import Box56
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 0.5F, 1F, 2, 1, 2, 0F,0.8F, 1.5F, 0.5F, -0.3F, 2F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.4F, -1F, 0.5F, 0F, -1.5F, 0.5F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Import Box57
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 6F, 1F, 4, 3, 2, 0F,1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 1F, 0F, 0.3F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.6F, 0.5F, -0.5F); // Import Box58
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 10F, -4F, 4, 1, 4, 0F,0F, 0.2F, -1.5F, 0.6F, 0.5F, -2F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.8F, -0.3F, -0.8F, 1.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Import Box59
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 10F, 1F, 4, 1, 3, 0F,0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, 0.6F, 0.5F, -1.5F, 1.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.8F, -0.2F, -1F); // Import Box60
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 9F, -4F, 5, 1, 4, 0F,0F, -0.6F, -0.8F, -0.3F, -0.2F, -1.3F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, -0.6F, -0.3F, -0.2F, -1.3F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F); // Import Box66
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-5F, 9F, 0F, 5, 1, 4, 0F,-0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.2F, -0.2F, -1.3F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.2F, -0.2F, -1.3F); // Import Box67
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(3F, -1.5F, -3.5F, 1, 4, 4, 0F,0.4F, -0.9F, -0.7F, 0F, -1.2F, -0.7F, 0.2F, -0.1F, 0F, 0.2F, 0.2F, 0F, 1F, -0.3F, 0.8F, -0.7F, 0F, 0.8F, -0.7F, 0F, -3F, 0.2F, -0.3F, -3F); // Import Box68
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2.2F, 2.2F, -4.2F, 1, 3, 1, 0F,0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -0.3F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.6F, -0.3F, 0F); // Import Box69
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.5F, 4.7F, -5.4F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.1F, 0F, 0F, -0.3F, 0.5F, -0.2F, -0.6F, 0.5F, -0.2F, -0.6F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Import Box70
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-0.5F, 4F, -4F, 1, 2, 1, 0F,-0.4F, -0.5F, 1.2F, -0.4F, -0.5F, 1.2F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box71
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-0.5F, 6F, -4F, 1, 2, 4, 0F,-0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F); // Import Box72
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-0.5F, 8F, -4F, 1, 1, 4, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0.8F, -1.5F, -0.4F, 0.5F, -1.5F, -0.4F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F); // Import Box73
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3F, -1.5F, 0.5F, 1, 2, 3, 0F,0.2F, 0.2F, 0F, 0.2F, -0.1F, 0F, 0F, -0.8F, -1F, 0.4F, -0.5F, -1F, 0.2F, -1.3F, 1F, -0.7F, -1F, 1F, 0F, 0F, -1F, 0.5F, -0.3F, -1F); // Import Box74
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-0.5F, 1.5F, -5.2F, 2, 3, 1, 0F,-0.5F, 0.2F, -1.3F, 0.05F, 0.7F, -1.65F, 0.6F, 0.7F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.5F, 0F, 0F); // Import Box75
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-0.5F, 1.2F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box77
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(4.1F, 6.3F, -0.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box78
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 1F, -4F, 1, 4, 4, 0F,0.5F, 1F, -1.5F, 1F, 1.5F, -1F, 0.5F, 0.5F, -1.5F, 0.4F, 0F, -1.5F, 0F, -0.5F, 0.2F, 2.9F, -0.5F, 1.2F, 3F, -1F, -2F, 0F, -1F, -2F); // Import Box81
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 4F, -4F, 4, 2, 4, 0F,0F, -0.5F, 0.2F, -0.1F, -0.5F, 1.2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, -0.1F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Import Box82
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 6F, -4F, 4, 2, 4, 0F,1F, 0F, 0F, -0.1F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0.7F, 0F, -0.8F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F); // Import Box83
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4F, 8F, -4F, 4, 1, 4, 0F,0.7F, 0F, -0.8F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.6F, 0.5F, -2F, -0.1F, 0.8F, -1.5F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F); // Import Box84
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4F, 10F, -4F, 4, 1, 4, 0F,0.6F, 0.5F, -2F, 0F, 0.2F, -1.5F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.8F, -0.3F, -0.8F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 1.1F, -0.5F, 0.5F); // Import Box85
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-5F, 9F, -4F, 5, 1, 4, 0F,-0.3F, -0.2F, -1.3F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.3F, -0.2F, -1.3F, 0F, 0.4F, -0.6F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Import Box86
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0F, 9F, 0F, 5, 1, 4, 0F,0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, -1.2F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, -1.3F, 0F, -0.2F, -0.6F); // Import Box87
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0F, 6F, 1F, 4, 3, 2, 0F,0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.3F, 0F, 0F, 0.8F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.6F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Import Box88
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0F, 4F, 1F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.3F, 0F, 0F, 0.8F); // Import Box89
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1F, 1F, 1F, 3, 3, 2, 0F,-0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 1F, 0F, -0.5F, 1F, 0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.7F, 1F, 0F, 1.2F); // Import Box90
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2F, 0.5F, 1F, 2, 1, 2, 0F,-0.3F, 2F, 0.5F, 0.8F, 1.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0.4F, -1F, 0.5F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Import Box91
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0F, 10F, 1F, 4, 1, 3, 0F,0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.6F, 0.5F, -1.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 1.1F, -0.5F, 0.5F, 0.8F, -0.2F, -1F, 0F, 0F, 0F); // Import Box92
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(2F, 0.5F, -3F, 2, 1, 3, 0F,0F, 1F, 0F, 0.5F, 0.5F, -0.5F, 0.8F, 1.5F, 0.5F, -0.3F, 2F, 0.5F, 0.5F, -0.5F, 0F, 0.2F, 0F, -1.5F, 0.4F, -1F, 0.5F, 0F, -1.5F, 0.5F); // Import Box93
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-1.5F, 1.5F, -5.2F, 2, 3, 1, 0F,0.05F, 0.7F, -1.65F, -0.5F, 0.2F, -1.3F, -0.5F, 0.2F, 3F, 0.6F, 0.7F, 3F, -1.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.4F, 0F, 0F); // Import Box96
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4F, -1.5F, -3.5F, 1, 4, 4, 0F,0F, -1.2F, -0.7F, 0.4F, -0.9F, -0.7F, 0.2F, 0.2F, 0F, 0.2F, -0.1F, 0F, -0.7F, 0F, 0.8F, 1F, -0.3F, 0.8F, 0.2F, -0.3F, -3F, -0.7F, 0F, -3F); // Import Box97
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.2F, 2.2F, -4.2F, 1, 3, 1, 0F,0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0.6F, -0.3F, 1F, 0.6F, -0.3F, 0F, -0.5F, 0F, 0F); // Import Box98
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2.5F, 4.7F, -5.4F, 1, 1, 1, 0F,0.5F, -0.4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, -0.4F, 0F, -0.6F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.5F, 0F, -0.6F, 0.5F, 0F); // Import Box99
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-0.5F, 1F, 3.2F, 2, 3, 1, 0F,-0.5F, 0.2F, 3F, 0.6F, 0.7F, 3F, -0.1F, 0.7F, -0.65F, -0.5F, 0.2F, -0.5F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.5F, 0F, 0F); // Import Box100
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-1.5F, 1F, 3.2F, 2, 3, 1, 0F,0.6F, 0.7F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0.2F, -0.5F, -0.1F, 0.7F, -0.65F, -1.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.4F, 0F, 0F); // Import Box101
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(0.9F, 0.8F, -4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box102
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-1.9F, 0.8F, -4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box103
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(3.5F, 0F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box104
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(3.3F, 2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box105
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(3.1F, 4F, -4.4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box106
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(3.9F, 5.6F, -4.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box107
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(3.7F, 7.1F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box108
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(3.7F, 8.5F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box109
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-4.7F, 8.5F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box110
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-4.7F, 7.1F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box111
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-4.9F, 5.6F, -4.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box112
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-4.1F, 4F, -4.4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box113
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-4.3F, 2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box114
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-4.5F, 0F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box115
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(1.8F, -0.5F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box116
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-2.8F, -0.5F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box117
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(3.7F, 9.9F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box118
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(2F, 10.1F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box119
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(0.4F, 10.4F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box120
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-1.4F, 10.4F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box121
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-3F, 10.1F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box122
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4.7F, 9.9F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box123
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(3.9F, 7.8F, -0.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box124
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(3.9F, 7.8F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box125
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(4.1F, 6.3F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box126
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-4.9F, 7.8F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box127
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-5.1F, 6.3F, 0.5F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box128
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-5.1F, 6.3F, -0.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box129
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-4.9F, 7.8F, -0.7F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box130
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-4F, -1.5F, 0.5F, 1, 2, 3, 0F,0.2F, -0.1F, 0F, 0.2F, 0.2F, 0F, 0.4F, -0.5F, -1F, 0F, -0.8F, -1F, -0.7F, -1F, 1F, 0.2F, -1.3F, 1F, 0.5F, -0.3F, -1F, 0F, 0F, -1F); // Import Box131
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(0F, 4F, -4.1F, 4, 2, 2, 0F,0F, -0.5F, 1.2F, -1F, -0.5F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box76
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(0F, 2F, -4.1F, 4, 3, 2, 0F,0F, 0F, 0.3F, -0.5F, 0.4F, -0.6F, -0.5F, 0.4F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1.2F, -1F, -0.5F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F); // Import Box77
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(1.5F, 0F, -3.7F, 2, 2, 1, 0F,-1F, -0.3F, -0.4F, 0.2F, -0.8F, -0.6F, 0.2F, -0.8F, 0F, -1F, -0.3F, 0F, 0F, -0.15F, 0.32F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.15F, 0F); // Import Box78
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(0F, 6F, -4.1F, 4, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, -0.6F, -0.2F, 0F, -1F, 0F, 0F, -2F); // Import Box79
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(0F, 8F, -4.1F, 4, 2, 2, 0F,0F, 0F, 0.5F, -0.2F, 0F, -0.6F, -0.2F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.7F, -0.4F, -0.5F, -1.5F, -0.4F, -0.5F, 0.5F, 0F, 0F, 0.5F); // Import Box80
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-4.7F, 9.9F, 2.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box81
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(-3F, 10F, 2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box82
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(-1.4F, 10F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box83
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(0.4F, 10F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box84
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(2F, 10F, 2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box85
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(3.7F, 9.9F, 2.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box86
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(3.7F, 8.5F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box87
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(3.7F, 7.1F, 2.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box88
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(3.9F, 5.6F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box89
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(3.1F, 4F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box90
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(3.3F, 2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box91
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(3.5F, 0F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box92
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(1.3F, 0.2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box93
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-0.5F, 0.7F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box94
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(0F, 4F, 1.1F, 4, 2, 2, 0F,0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0.9F, 0F, -0.5F, 1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, 1F); // Import Box95
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(0F, 2F, 1.1F, 4, 3, 2, 0F,0F, 0F, 0.5F, -0.5F, 0.4F, 0.5F, -0.5F, 1.1F, 0.4F, 0F, 0.4F, 0.9F, 0F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, -0.5F, 0.9F, 0F, -0.5F, 1.2F); // Import Box96
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(0F, 6F, 2.1F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, 1F, 0F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -0.4F, 0F, -0.5F, 0F); // Import Box97
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(3F, -1.5F, -3.5F, 1, 6, 4, 0F,0.6F, -0.7F, -0.4F, 0.2F, -1F, -0.5F, 0.4F, 0.1F, 0F, 0.4F, 0.4F, 0F, 4F, -0.3F, 2.5F, -3.2F, 0F, 2.5F, -3.2F, 0F, -3F, 3.2F, -0.3F, -3F); // Import Box98
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-3.2F, 4.2F, -3.5F, 1, 4, 4, 0F,-2.2F, 0F, 2.5F, 3F, -0.3F, 2.5F, 3F, 0.3F, -3F, -2.8F, 0.3F, -3F, 0.7F, -1F, 1.5F, 0.1F, -0.7F, 1.6F, -0.1F, -0.7F, 0F, 0.9F, -1F, 0F); // Import Box99
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-4.8F, 6.5F, -3.5F, 1, 4, 4, 0F,-0.9F, -0.7F, 1.6F, 1.7F, -1F, 1.5F, 1.9F, -1F, 0F, -1.1F, -0.7F, 0F, 0.7F, -2.3F, -0.3F, -1.2F, 0F, -1F, -1.4F, 0F, 0F, 1F, -1.7F, 0F); // Import Box100
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-4F, 2F, -4.1F, 4, 3, 2, 0F,-0.5F, 0.4F, -0.6F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -0.5F, 0.4F, 0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 1.2F, 0F, -0.5F, -2F, -1F, -0.5F, -2F); // Import Box101
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-4F, 4F, -4.1F, 4, 2, 2, 0F,-1F, -0.5F, 0.5F, 0F, -0.5F, 1.2F, 0F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box102
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(-4F, 6F, -4.1F, 4, 2, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, -0.6F, 0F, 0F, 0.5F, 0F, 0F, -2F, -0.2F, 0F, -1F); // Import Box103
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(-4F, 8F, -4.1F, 4, 2, 2, 0F,-0.2F, 0F, -0.6F, 0F, 0F, 0.5F, 0F, 0F, -2F, -0.2F, 0F, -1F, -0.4F, -0.5F, -1.8F, 0F, 0F, -1.7F, 0F, 0F, 0.5F, -0.4F, -0.5F, 0.5F); // Import Box104
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(-4F, 2F, 1.1F, 4, 3, 2, 0F,-0.5F, 0.4F, 0.5F, 0F, 0F, 0.5F, 0F, 0.4F, 0.9F, -0.5F, 1.1F, 0.4F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.2F, -1F, -0.5F, 0.9F); // Import Box105
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(-4F, 4F, 1.1F, 4, 2, 2, 0F,-1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.2F, -1F, -0.5F, 0.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.4F); // Import Box106
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(-4F, 6F, 2.1F, 4, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.4F, -0.3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.3F, -0.5F, -0.4F); // Import Box107
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(-4.7F, 8.5F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box108
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-4.7F, 7.1F, 2.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box109
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-4.9F, 5.6F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box110
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-4.1F, 4F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box111
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(-4.3F, 2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box112
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(-4.5F, 0F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box113
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(-2.3F, 0.2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Import Box114
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(-3.5F, 0F, -3.7F, 2, 2, 1, 0F,0.2F, -0.8F, -0.6F, -1F, -0.3F, -0.4F, -1F, -0.3F, 0F, 0.2F, -0.8F, 0F, 0F, -0.4F, -0.2F, 0F, -0.15F, 0.32F, 0F, -0.15F, 0F, 0F, -0.4F, 0F); // Import Box115
		bodyModel[111].setRotationPoint(0F, 0F, 0F);
	}
}