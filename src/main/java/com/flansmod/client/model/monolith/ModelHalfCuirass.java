//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HalfCuirass
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHalfCuirass extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelHalfCuirass() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[63];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 52
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 53
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 54
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 59
		bodyModel[6] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 66
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 68
		bodyModel[8] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 69
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 70
		bodyModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 71
		bodyModel[11] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 72
		bodyModel[12] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 73
		bodyModel[13] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 74
		bodyModel[14] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 75
		bodyModel[15] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 77
		bodyModel[16] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 81
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[18] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 83
		bodyModel[19] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 84
		bodyModel[20] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 85
		bodyModel[21] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 86
		bodyModel[22] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 93
		bodyModel[23] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 96
		bodyModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[25] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 98
		bodyModel[26] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 99
		bodyModel[27] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 102
		bodyModel[28] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 103
		bodyModel[29] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 104
		bodyModel[30] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 105
		bodyModel[31] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 106
		bodyModel[32] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 107
		bodyModel[33] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 108
		bodyModel[34] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 109
		bodyModel[35] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 110
		bodyModel[36] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 111
		bodyModel[37] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 112
		bodyModel[38] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 113
		bodyModel[39] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 114
		bodyModel[40] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 115
		bodyModel[41] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 116
		bodyModel[42] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 117
		bodyModel[43] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 118
		bodyModel[44] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 119
		bodyModel[45] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 120
		bodyModel[46] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 121
		bodyModel[47] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 122
		bodyModel[48] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 123
		bodyModel[49] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 131
		bodyModel[50] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 76
		bodyModel[51] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 77
		bodyModel[52] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 78
		bodyModel[53] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 79
		bodyModel[54] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 80
		bodyModel[55] = new ModelRendererTurbo(this, 9, 21, textureX, textureY); // Box 98
		bodyModel[56] = new ModelRendererTurbo(this, 9, 21, textureX, textureY); // Box 99
		bodyModel[57] = new ModelRendererTurbo(this, 9, 21, textureX, textureY); // Box 100
		bodyModel[58] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 101
		bodyModel[59] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 102
		bodyModel[60] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 103
		bodyModel[61] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 104
		bodyModel[62] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 115

		bodyModel[0].addShapeBox(0F, 4F, -4F, 4, 2, 4, 0F,-0.1F, -0.5F, 1.2F, 0F, -0.5F, 0.2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 6F, -4F, 4, 2, 4, 0F,-0.1F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8F, -4F, 4, 1, 4, 0F,-0.1F, 0F, 0.5F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0.8F, -1.5F, 0.6F, 0.5F, -2F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(3F, 1F, -4F, 1, 4, 4, 0F,1F, 1.5F, -1F, 0.5F, 1F, -1.5F, 0.4F, 0F, -1.5F, 0.5F, 0.5F, -1.5F, 2.9F, -0.5F, 1.2F, 0F, -0.5F, 0.2F, 0F, -1F, -2F, 3F, -1F, -2F); // Box 53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0.5F, -3F, 2, 1, 3, 0F,0.5F, 0.5F, -0.5F, 0F, 1F, 0F, -0.3F, 2F, 0.5F, 0.8F, 1.5F, 0.5F, 0.2F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -1.5F, 0.5F, 0.4F, -1F, 0.5F); // Box 54
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 10F, -4F, 4, 1, 4, 0F,0F, 0.2F, -1.5F, 0.6F, 0.5F, -2F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.8F, -0.3F, -0.8F, 1.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 59
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 9F, -4F, 5, 1, 4, 0F,0F, -0.6F, -0.8F, -0.3F, -0.2F, -1.3F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, -0.6F, -0.3F, -0.2F, -1.3F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 66
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(3F, -1.5F, -3.5F, 1, 4, 4, 0F,0.4F, -0.9F, -0.7F, 0F, -1.2F, -0.7F, 0.2F, -0.1F, 0F, 0.2F, 0.2F, 0F, 1F, -0.3F, 0.8F, -0.7F, 0F, 0.8F, -0.7F, 0F, -3F, 0.2F, -0.3F, -3F); // Box 68
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.2F, 2.2F, -4.2F, 1, 3, 1, 0F,0F, 0F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -0.3F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0.6F, -0.3F, 0F); // Box 69
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(1.5F, 4.7F, -5.4F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.1F, 0F, 0F, -0.3F, 0.5F, -0.2F, -0.6F, 0.5F, -0.2F, -0.6F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 70
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 4F, -4F, 1, 2, 1, 0F,-0.4F, -0.5F, 1.2F, -0.4F, -0.5F, 1.2F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 71
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.5F, 6F, -4F, 1, 2, 4, 0F,-0.4F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F); // Box 72
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.5F, 8F, -4F, 1, 1, 4, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0.8F, -1.5F, -0.4F, 0.5F, -1.5F, -0.4F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F); // Box 73
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(3F, -1.5F, 0.5F, 1, 2, 3, 0F,0.2F, 0.2F, 0F, 0.2F, -0.1F, 0F, 0F, -0.8F, -1F, 0.4F, -0.5F, -1F, 0.2F, -1.3F, 1F, -0.7F, -1F, 1F, 0F, 0F, -1F, 0.5F, -0.3F, -1F); // Box 74
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-0.5F, 1.5F, -5.2F, 2, 3, 1, 0F,-0.5F, 0.2F, -1.3F, 0.05F, 0.7F, -1.65F, 0.6F, 0.7F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-0.5F, 1.2F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 77
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 1F, -4F, 1, 4, 4, 0F,0.5F, 1F, -1.5F, 1F, 1.5F, -1F, 0.5F, 0.5F, -1.5F, 0.4F, 0F, -1.5F, 0F, -0.5F, 0.2F, 2.9F, -0.5F, 1.2F, 3F, -1F, -2F, 0F, -1F, -2F); // Box 81
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 4F, -4F, 4, 2, 4, 0F,0F, -0.5F, 0.2F, -0.1F, -0.5F, 1.2F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, -0.1F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 82
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 6F, -4F, 4, 2, 4, 0F,1F, 0F, 0F, -0.1F, 0F, 1F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0.7F, 0F, -0.8F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F); // Box 83
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 8F, -4F, 4, 1, 4, 0F,0.7F, 0F, -0.8F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.6F, 0.5F, -2F, -0.1F, 0.8F, -1.5F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F); // Box 84
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 10F, -4F, 4, 1, 4, 0F,0.6F, 0.5F, -2F, 0F, 0.2F, -1.5F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.8F, -0.3F, -0.8F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 1.1F, -0.5F, 0.5F); // Box 85
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-5F, 9F, -4F, 5, 1, 4, 0F,-0.3F, -0.2F, -1.3F, 0F, -0.6F, -0.8F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.3F, -0.2F, -1.3F, 0F, 0.4F, -0.6F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 86
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2F, 0.5F, -3F, 2, 1, 3, 0F,0F, 1F, 0F, 0.5F, 0.5F, -0.5F, 0.8F, 1.5F, 0.5F, -0.3F, 2F, 0.5F, 0.5F, -0.5F, 0F, 0.2F, 0F, -1.5F, 0.4F, -1F, 0.5F, 0F, -1.5F, 0.5F); // Box 93
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1.5F, 1.5F, -5.2F, 2, 3, 1, 0F,0.05F, 0.7F, -1.65F, -0.5F, 0.2F, -1.3F, -0.5F, 0.2F, 3F, 0.6F, 0.7F, 3F, -1.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.4F, 0F, 0F); // Box 96
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, -1.5F, -3.5F, 1, 4, 4, 0F,0F, -1.2F, -0.7F, 0.4F, -0.9F, -0.7F, 0.2F, 0.2F, 0F, 0.2F, -0.1F, 0F, -0.7F, 0F, 0.8F, 1F, -0.3F, 0.8F, 0.2F, -0.3F, -3F, -0.7F, 0F, -3F); // Box 97
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-3.2F, 2.2F, -4.2F, 1, 3, 1, 0F,0F, -0.2F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, 0.6F, -0.3F, 1F, 0.6F, -0.3F, 0F, -0.5F, 0F, 0F); // Box 98
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.5F, 4.7F, -5.4F, 1, 1, 1, 0F,0.5F, -0.4F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.5F, -0.4F, 0F, -0.6F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.5F, 0F, -0.6F, 0.5F, 0F); // Box 99
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0.9F, 0.8F, -4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 102
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1.9F, 0.8F, -4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 103
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(3.5F, 0F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 104
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(3.3F, 2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 105
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3.1F, 4F, -4.4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 106
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(3.9F, 5.6F, -4.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 107
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(3.7F, 7.1F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 108
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(3.7F, 8.5F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 109
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.7F, 8.5F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 110
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4.7F, 7.1F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 111
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4.9F, 5.6F, -4.2F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 112
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4.1F, 4F, -4.4F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 113
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4.3F, 2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 114
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.5F, 0F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 115
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(1.8F, -0.5F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 116
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-2.8F, -0.5F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 117
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(3.7F, 9.9F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 118
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(2F, 10.1F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 119
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(0.4F, 10.4F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 120
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-1.4F, 10.4F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 121
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3F, 10.1F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 122
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-4.7F, 9.9F, -3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 123
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4F, -1.5F, 0.5F, 1, 2, 3, 0F,0.2F, -0.1F, 0F, 0.2F, 0.2F, 0F, 0.4F, -0.5F, -1F, 0F, -0.8F, -1F, -0.7F, -1F, 1F, 0.2F, -1.3F, 1F, 0.5F, -0.3F, -1F, 0F, 0F, -1F); // Box 131
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0F, 4F, -4.1F, 4, 2, 2, 0F,0F, -0.5F, 1.2F, -1F, -0.5F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 76
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(0F, 2F, -4.1F, 4, 3, 2, 0F,0F, 0F, 0.3F, -0.5F, 0.4F, -0.6F, -0.5F, 0.4F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 1.2F, -1F, -0.5F, 0.5F, -1F, -0.5F, -2F, 0F, -0.5F, -2F); // Box 77
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(1.5F, 0F, -3.7F, 2, 2, 1, 0F,-1F, -0.3F, -0.4F, 0.2F, -0.8F, -0.6F, 0.2F, -0.8F, 0F, -1F, -0.3F, 0F, 0F, -0.15F, 0.32F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.15F, 0F); // Box 78
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(0F, 6F, -4.1F, 4, 2, 2, 0F,0F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, -0.6F, -0.2F, 0F, -1F, 0F, 0F, -2F); // Box 79
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(0F, 8F, -4.1F, 4, 2, 2, 0F,0F, 0F, 0.5F, -0.2F, 0F, -0.6F, -0.2F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.7F, -0.4F, -0.5F, -1.5F, -0.4F, -0.5F, 0.5F, 0F, 0F, 0.5F); // Box 80
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(3F, -1.5F, -3.5F, 1, 6, 4, 0F,0.6F, -0.7F, -0.4F, 0.2F, -1F, -0.5F, 0.4F, 0.1F, 0F, 0.4F, 0.4F, 0F, 4F, -0.3F, 2.5F, -3.2F, 0F, 2.5F, -3.2F, 0F, -3F, 3.2F, -0.3F, -3F); // Box 98
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3.2F, 4.2F, -3.5F, 1, 4, 4, 0F,-2.2F, 0F, 2.5F, 3F, -0.3F, 2.5F, 3F, 0.3F, -3F, -2.8F, 0.3F, -3F, 0.7F, -1F, 1.5F, 0.1F, -0.7F, 1.6F, -0.1F, -0.7F, 0F, 0.9F, -1F, 0F); // Box 99
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-4.8F, 6.5F, -3.5F, 1, 4, 4, 0F,-0.9F, -0.7F, 1.6F, 1.7F, -1F, 1.5F, 1.9F, -1F, 0F, -1.1F, -0.7F, 0F, 0.7F, -2.3F, -0.3F, -1.2F, 0F, -1F, -1.4F, 0F, 0F, 1F, -1.7F, 0F); // Box 100
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-4F, 2F, -4.1F, 4, 3, 2, 0F,-0.5F, 0.4F, -0.6F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -0.5F, 0.4F, 0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 1.2F, 0F, -0.5F, -2F, -1F, -0.5F, -2F); // Box 101
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-4F, 4F, -4.1F, 4, 2, 2, 0F,-1F, -0.5F, 0.5F, 0F, -0.5F, 1.2F, 0F, -0.5F, -2F, -1F, -0.5F, -2F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 102
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-4F, 6F, -4.1F, 4, 2, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, -0.6F, 0F, 0F, 0.5F, 0F, 0F, -2F, -0.2F, 0F, -1F); // Box 103
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4F, 8F, -4.1F, 4, 2, 2, 0F,-0.2F, 0F, -0.6F, 0F, 0F, 0.5F, 0F, 0F, -2F, -0.2F, 0F, -1F, -0.4F, -0.5F, -1.8F, 0F, 0F, -1.7F, 0F, 0F, 0.5F, -0.4F, -0.5F, 0.5F); // Box 104
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-3.5F, 0F, -3.7F, 2, 2, 1, 0F,0.2F, -0.8F, -0.6F, -1F, -0.3F, -0.4F, -1F, -0.3F, 0F, 0.2F, -0.8F, 0F, 0F, -0.4F, -0.2F, 0F, -0.15F, 0.32F, 0F, -0.15F, 0F, 0F, -0.4F, 0F); // Box 115
		bodyModel[62].setRotationPoint(0F, 0F, 0F);
	}
}