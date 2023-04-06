//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EarlyHussar
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEarlyHussar extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelEarlyHussar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[79];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 48
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 26
		bodyModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 27
		bodyModel[3] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 28
		bodyModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 29
		bodyModel[5] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 44
		bodyModel[8] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		bodyModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 30
		bodyModel[11] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 31
		bodyModel[12] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 32
		bodyModel[13] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 50
		bodyModel[14] = new ModelRendererTurbo(this, 113, 36, textureX, textureY); // Box 54
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 56
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 57
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 58
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 59
		bodyModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 60
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 61
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 62
		bodyModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 63
		bodyModel[24] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 64
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 65
		bodyModel[26] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 66
		bodyModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 67
		bodyModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 68
		bodyModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 69
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 70
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		bodyModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
		bodyModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 75
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 76
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 77
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 78
		bodyModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		bodyModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[43] = new ModelRendererTurbo(this, 121, 36, textureX, textureY); // Box 83
		bodyModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		bodyModel[45] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		bodyModel[46] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		bodyModel[47] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		bodyModel[48] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		bodyModel[49] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 89
		bodyModel[50] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		bodyModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 91
		bodyModel[52] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 100
		bodyModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 101
		bodyModel[54] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 102
		bodyModel[55] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 103
		bodyModel[56] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		bodyModel[57] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 105
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 106
		bodyModel[59] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 107
		bodyModel[60] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 108
		bodyModel[61] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 109
		bodyModel[62] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 110
		bodyModel[63] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 111
		bodyModel[64] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 112
		bodyModel[65] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 113
		bodyModel[66] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 114
		bodyModel[67] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 115
		bodyModel[68] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 116
		bodyModel[69] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 117
		bodyModel[70] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		bodyModel[71] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 119
		bodyModel[72] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 109
		bodyModel[73] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 110
		bodyModel[74] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 111
		bodyModel[75] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 112
		bodyModel[76] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 113
		bodyModel[77] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 114
		bodyModel[78] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 115

		bodyModel[0].addShapeBox(-4.5F, -0.2F, -2.5F, 18, 20, 10, 0F,0.4F, 0.2F, 0.4F, -8.6F, 0.2F, 0.4F, -8.6F, 0.2F, -4.6F, 0.4F, 0.2F, -4.6F, 0F, -9.8F, 0.1F, -9F, -9.8F, 0.1F, -9F, -9.8F, -4.9F, 0F, -9.8F, -4.9F); // Box 48
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 1.5F, -2.5F, 8, 1, 5, 0F,-0.2F, 1F, 0.5F, -4F, 0F, 1.5F, -4F, 0F, 1F, -0.2F, 1F, 0.6F, -0.3F, -0.5F, 0.6F, -4F, 0.5F, 1.8F, -4F, 0.5F, 1F, -0.3F, -0.5F, 0.6F); // Box 26
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 4.5F, -2.5F, 8, 3, 5, 0F,-0.1F, 1F, 0.9F, -4F, 0F, 2.5F, -4F, 0F, 1.5F, -0.1F, 1F, 1F, 0.9F, -1F, 0.8F, -4F, 0.51F, 2.1F, -4F, 0F, 1F, 0.9F, -1F, 0.6F); // Box 27
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 7.5F, -2.5F, 8, 3, 5, 0F,0.9F, 1F, 1F, -4F, -0.5F, 2.3F, -4F, 0F, 1.2F, 0.9F, 1F, 0.8F, 0.5F, -0.5F, 0.5F, -4F, 0.2F, 1.5F, -4F, 0F, 0.8F, 0.5F, -0.5F, 0.4F); // Box 28
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 11F, -2.5F, 4, 1, 5, 0F,0.5F, 1F, 0.5F, 0F, 0.3F, 1.5F, 0F, 0.5F, 0.8F, 0.5F, 1F, 0.4F, 0.6F, -1.8F, 0.7F, 0F, -0.8F, 2F, 0F, -0.8F, 1.2F, 0.6F, -1.8F, 0.6F); // Box 29
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 6F, -2.5F, 8, 2, 5, 0F,0.5F, 1F, 1.3F, -4F, 0F, 2.7F, -4F, 0F, 1.5F, 0.4F, 1F, 1F, 0.9F, -1.5F, 0.8F, -4F, 0F, 2.1F, -4F, -0.5F, 1F, 0.9F, -1.5F, 0.6F); // Box 42
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 2.5F, -2.5F, 8, 2, 5, 0F,-0.3F, 0.5F, 0.8F, -4F, -0.5F, 2.1F, -4F, -0.5F, 1.3F, -0.2F, 0.5F, 1F, -0.1F, -1F, 0.7F, -4F, 0F, 2.3F, -4F, 0F, 1.3F, -0.1F, -1F, 0.8F); // Box 43
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 8.5F, -2.5F, 8, 2, 5, 0F,0.9F, 0.5F, 1F, -4F, -1F, 2.3F, -4F, -0.5F, 1.2F, 0.9F, 0.5F, 0.8F, 0.5F, -0.5F, 0.5F, -4F, 0.2F, 1.5F, -4F, 0F, 0.8F, 0.5F, -0.5F, 0.4F); // Box 44
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.75F, -1F, -4.1F, 2, 6, 7, 0F,0F, 0F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F, 0F, 1F, 0F, 0F, 5F, -1F, 1F, -5.5F, -0.5F, 1F, -5.5F, -0.5F, 0F, 5F, -1F, 0F); // Box 28
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-5.25F, -1F, -4F, 2, 6, 7, 0F,-0.3F, -0.5F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, -0.3F, -0.5F, 0F, -5.5F, -0.5F, 1F, 5F, -1F, 1F, 5F, -1F, 0F, -5.5F, -0.5F, 0F); // Box 29
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-5F, -1F, 2.5F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 30
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-5F, 7F, 4F, 10, 4, 3, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 31
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 10F, 5F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 32
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-5F, 4F, 3F, 10, 3, 3, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 1F, -1.5F, 0F, 1F); // Box 50
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2F, -13.5F, 5F, 1, 24, 1, 0F,-4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 54
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(6F, -19.5F, 1F, 1, 6, 1, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 55
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.5F, 7F, 3.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 56
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2.6F, 6F, 3.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 57
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2.8F, 5F, 3.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 58
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.9F, 4F, 4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 59
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(3.5F, 0F, 4.5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 60
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(3.1F, 3F, 4.2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 61
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(3.2F, 2F, 4.3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 62
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(3.4F, 1F, 4.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 63
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(4.3F, -4F, 5.1F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 64
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(4.2F, -3F, 5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 65
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(4F, -2F, 4.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 66
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(3.9F, -1F, 4.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 67
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(5.3F, -10F, 5.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 68
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(5.2F, -9F, 5.6F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 69
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(5F, -8F, 5.5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 70
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(4.9F, -7F, 5.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 71
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(4.5F, -6F, 5.1F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 72
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(4.4F, -5F, 5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 73
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(5.5F, -11F, 5.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 74
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(5.6F, -12F, 5.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 75
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(5.8F, -13F, 6F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 76
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(5.9F, -14F, 5.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 77
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(5.9F, -15F, 5.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 78
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(6.2F, -16F, 4.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 79
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(6.4F, -17F, 3.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 80
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(6.8F, -18F, 3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 81
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(6.8F, -19F, 2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, -1.6F, 0F, 0F); // Box 82
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4F, -13.5F, 5F, 1, 24, 1, 0F,4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 83
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.5F, 7F, 3.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 84
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-4.6F, 6F, 3.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 85
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-4.8F, 5F, 3.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 86
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4.9F, 4F, 4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 87
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-5.2F, 2F, 4.3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 88
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-5.1F, 3F, 4.2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 89
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-5.4F, 1F, 4.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 90
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-5.5F, 0F, 4.5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 91
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-7.2F, -9F, 5.6F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 100
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-7.6F, -10F, 5.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 101
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-7.8F, -11F, 5.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 102
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-7.8F, -12F, 5.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 103
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-8F, -13F, 6F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 104
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-8.1F, -14F, 5.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 105
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-8.1F, -15F, 5.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 106
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-8.4F, -16F, 4.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 107
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(-8.4F, -17F, 3.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 108
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-8.8F, -18F, 3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 109
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-8.8F, -19F, 2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 110
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(-8F, -19.5F, 1F, 1, 6, 1, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 111
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-6.8F, -8F, 5.5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 112
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-6.7F, -7F, 5.4F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 113
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-6.5F, -6F, 5.3F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 114
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-6.4F, -5F, 5.2F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 115
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-6.2F, -4F, 5F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 116
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-6.1F, -3F, 4.9F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 117
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-5.9F, -2F, 4.8F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 118
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-5.8F, -1F, 4.7F, 1, 1, 8, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.9F, 0F, 0F, 1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.6F, 0F, 0F, 1F, 0F, 0F); // Box 119
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-4F, 1.5F, -2.5F, 8, 1, 5, 0F,-4F, 0F, 1.5F, -0.2F, 1F, 0.5F, -0.2F, 1F, 0.6F, -4F, 0F, 1F, -4F, 0.5F, 1.8F, -0.3F, -0.5F, 0.6F, -0.3F, -0.5F, 0.6F, -4F, 0.5F, 1F); // Box 109
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-4F, 2.5F, -2.5F, 8, 2, 5, 0F,-4F, -0.5F, 2.1F, -0.3F, 0.5F, 0.8F, -0.2F, 0.5F, 1F, -4F, -0.5F, 1.3F, -4F, 0F, 2.3F, -0.1F, -1F, 0.7F, -0.1F, -1F, 0.8F, -4F, 0F, 1.3F); // Box 110
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-4F, 4.5F, -2.5F, 8, 3, 5, 0F,-4F, 0F, 2.5F, -0.1F, 1F, 0.9F, -0.1F, 1F, 1F, -4F, 0F, 1.5F, -4F, 0.51F, 2.1F, 0.9F, -1F, 0.8F, 0.9F, -1F, 0.6F, -4F, 0F, 1F); // Box 111
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-4F, 6F, -2.5F, 8, 2, 5, 0F,-4F, 0F, 2.7F, 0.5F, 1F, 1.3F, 0.4F, 1F, 1F, -4F, 0F, 1.5F, -4F, 0F, 2.1F, 0.9F, -1.5F, 0.8F, 0.9F, -1.5F, 0.6F, -4F, -0.5F, 1F); // Box 112
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(-4F, 7.5F, -2.5F, 8, 3, 5, 0F,-4F, -0.5F, 2.3F, 0.9F, 1F, 1F, 0.9F, 1F, 0.8F, -4F, 0F, 1.2F, -4F, 0.2F, 1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.4F, -4F, 0F, 0.8F); // Box 113
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(-4F, 8.5F, -2.5F, 8, 2, 5, 0F,-4F, -1F, 2.3F, 0.9F, 0.5F, 1F, 0.9F, 0.5F, 0.8F, -4F, -0.5F, 1.2F, -4F, 0.2F, 1.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.4F, -4F, 0F, 0.8F); // Box 114
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(0F, 11F, -2.5F, 4, 1, 5, 0F,0F, 0.3F, 1.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.4F, 0F, 0.5F, 0.8F, 0F, -0.8F, 2F, 0.6F, -1.8F, 0.7F, 0.6F, -1.8F, 0.6F, 0F, -0.8F, 1.2F); // Box 115
		bodyModel[78].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 116

		leftArmModel[0].addShapeBox(-5F, -2F, -2F, 8, 18, 8, 0F,-3.7F, 0.35F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.25F, -3.7F, -3.7F, 0.35F, -3.7F, -3.5F, -8.6F, 0.5F, 0.5F, -8.6F, 0.5F, 0.5F, -8.6F, -3.5F, -3.5F, -8.6F, -3.5F); // Box 116
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 56

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 8, 18, 8, 0F,0.3F, 0.25F, 0.3F, -3.7F, 0.35F, 0.3F, -3.7F, 0.35F, -3.7F, 0.3F, 0.25F, -3.7F, 0.5F, -8.6F, 0.5F, -3.5F, -8.6F, 0.5F, -3.5F, -8.6F, -3.5F, 0.5F, -8.6F, -3.5F); // Box 56
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 44

		skirtFrontModel[0].addShapeBox(-4F, -2F, -2F, 16, 12, 4, 0F,0.5F, 0F, 0.5F, -7.5F, 0F, 0.6F, -7.5F, 0F, -1.4F, 0.5F, 0F, -1.5F, 1.6F, -6F, 1.1F, -6.3F, -6F, 1.1F, -6F, -5.9F, -1.2F, 1.9F, -5.9F, -1.3F); // Box 44
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 117

		skirtRearModel[0].addShapeBox(-4F, -2F, -2F, 16, 12, 4, 0F,0.5F, 0F, -1.5F, -7.5F, 0F, -1.4F, -7.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 1.7F, -6F, -1.3F, -6F, -6F, -1.2F, -6.3F, -6F, 1.1F, 1.4F, -6F, 1.1F); // Box 117
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}