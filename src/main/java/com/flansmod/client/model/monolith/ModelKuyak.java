//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kuyak
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKuyak extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelKuyak() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[64];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];
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
		bodyModel[0] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 23
		bodyModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 25
		bodyModel[2] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 35
		bodyModel[3] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 41
		bodyModel[5] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 44
		bodyModel[8] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 45
		bodyModel[9] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 46
		bodyModel[10] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 47
		bodyModel[11] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 48
		bodyModel[12] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 50
		bodyModel[14] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 51
		bodyModel[15] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 53
		bodyModel[17] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 54
		bodyModel[18] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 56
		bodyModel[20] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 59
		bodyModel[21] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 60
		bodyModel[22] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 61
		bodyModel[23] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 62
		bodyModel[24] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 65
		bodyModel[25] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 66
		bodyModel[26] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 83
		bodyModel[28] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 84
		bodyModel[29] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 85
		bodyModel[30] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 86
		bodyModel[31] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 89
		bodyModel[32] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 90
		bodyModel[33] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 91
		bodyModel[34] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 92
		bodyModel[35] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 93
		bodyModel[36] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 94
		bodyModel[37] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 95
		bodyModel[38] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 96
		bodyModel[39] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 99
		bodyModel[40] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 100
		bodyModel[41] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 101
		bodyModel[42] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 102
		bodyModel[43] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 103
		bodyModel[44] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 104
		bodyModel[45] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 105
		bodyModel[46] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 106
		bodyModel[47] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 109
		bodyModel[48] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 110
		bodyModel[49] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 111
		bodyModel[50] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 112
		bodyModel[51] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 116
		bodyModel[52] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 117
		bodyModel[53] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 118
		bodyModel[54] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 122
		bodyModel[55] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 123
		bodyModel[56] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 126
		bodyModel[57] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 127
		bodyModel[58] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 129
		bodyModel[60] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 130
		bodyModel[61] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 131
		bodyModel[62] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 17
		bodyModel[63] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 24

		bodyModel[0].addShapeBox(-4F, 4F, -2F, 8, 6, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 23
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 8, 4, 4, 0F,0.1F, 0.15F, 0.3F, 0.1F, 0.15F, 0.3F, 0.1F, 0.15F, 0.3F, 0.1F, 0.15F, 0.3F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F); // Box 25
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1.6F, 3F, -2.6F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 35
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.3F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 40
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.3F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 41
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.3F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 42
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.3F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 43
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.8F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 44
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4.8F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 45
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.8F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 46
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.8F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 47
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.2F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 48
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.2F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 49
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.2F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 50
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0.2F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 51
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.7F, 3F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 52
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.7F, 4.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 53
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.7F, 6F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 54
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.7F, 7.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 55
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1.7F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 56
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.2F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 59
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(1.7F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 60
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.2F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 61
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.1F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 62
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.1F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 65
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4.6F, 1F, -2.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 66
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.6F, -0.5F, -2.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 67
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.6F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 83
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4.6F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 84
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.1F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 85
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.1F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 86
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0.2F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 89
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0.2F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 90
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.7F, 1F, 1.6F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 91
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1.7F, -0.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 92
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1.7F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 93
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1.7F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 94
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(0.2F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 95
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(0.2F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 96
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-3.3F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 99
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3.3F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 100
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4.8F, 3F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 101
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4.8F, 4.5F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 102
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4.8F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 103
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.8F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 104
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3.3F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 105
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3.3F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 106
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(1.7F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 109
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(1.7F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 110
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(0.2F, 6F, 1.5F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 111
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0.2F, 7.5F, 1.4F, 3, 3, 1, 0F,-1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Box 112
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-1.45F, 1F, -2.7F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 116
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-1.45F, -0.5F, -2.7F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 117
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-1.6F, 6F, -2.6F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 118
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-1.6F, 7.5F, -2.6F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 122
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-1.6F, 4.5F, -2.6F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 123
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-1.45F, -0.5F, 1.55F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 126
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-1.45F, 1F, 1.55F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 127
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-1.6F, 3F, 1.65F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 128
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-1.6F, 4.5F, 1.65F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 129
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-1.6F, 6F, 1.65F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 130
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-1.6F, 7.5F, 1.65F, 3, 3, 1, 0F,-0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F, -0.7F, -1F, 0F); // Box 131
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(4F, 9.2F, 0F, 1, 13, 1, 0F,0.3F, -0.5F, 4F, -0.1F, -0.3F, 4F, -0.1F, 0.2F, -4F, 0.3F, 0F, -4F, -2.7F, -0.3F, -1.5F, 2.5F, -0.5F, -1.5F, 2.5F, -1F, 1F, -2.7F, -0.7F, 1F); // Box 17
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F,0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 24
		bodyModel[63].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 134
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 135

		leftArmModel[0].addShapeBox(-3F, -7.2F, -4F, 8, 16, 8, 0F,-1.8F, -5F, -1.8F, -1.8F, -5F, -1.8F, -1.8F, -5F, -1.8F, -1.8F, -5F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F); // Box 134
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2.1F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 135
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 124

		rightArmModel[0].addShapeBox(-5F, -7.2F, -4F, 8, 16, 8, 0F,-1.8F, -5F, -1.8F, -1.8F, -5F, -1.8F, -1.8F, -5F, -1.8F, -1.8F, -5F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 124
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 128
		leftLegModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 129
		leftLegModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 130
		leftLegModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 131

		leftLegModel[0].addShapeBox(-4F, -5.1F, -4F, 8, 19, 8, 0F,-1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F); // Box 128
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6.3F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F); // Box 129
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7.3F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 130
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

		rightLegModel[1].addShapeBox(-2F, 6.3F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F); // Box 60
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7.3F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-4F, -5.1F, -4F, 8, 19, 8, 0F,-1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F, -1.9F, -5F, -1.9F); // Box 36
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 24

		skirtFrontModel[0].addShapeBox(-4F, -1.8F, -2F, 8, 6, 2, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F); // Box 24
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 125

		skirtRearModel[0].addShapeBox(-4F, -1.8F, 0F, 8, 6, 2, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F, 0.7F, 0.8F, 0.7F); // Box 125
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}