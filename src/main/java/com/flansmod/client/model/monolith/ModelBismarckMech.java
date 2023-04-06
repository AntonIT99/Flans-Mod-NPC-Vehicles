//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KirishimaMech
// Model Creator: 
// Created on: 16.08.2015 - 19:08:27
// Last changed on: 16.08.2015 - 19:08:27

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBismarckMech extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBismarckMech() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[89];
		hipsModel = new ModelRendererTurbo[5];
		leftArmModel = new ModelRendererTurbo[7];
		rightArmModel = new ModelRendererTurbo[7];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		inithipsModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportMammaryRight
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportImportMammaryLeft
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportImportNeck
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportImportTop
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportImportBottom
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportImportTop
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportImportBottom
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportImportRibCage
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import ImportImportHead
		bodyModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box8
		bodyModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 21
		bodyModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 29
		bodyModel[19] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 30
		bodyModel[20] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 43
		bodyModel[30] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 44
		bodyModel[31] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 52
		bodyModel[35] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 53
		bodyModel[36] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 54
		bodyModel[37] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 55
		bodyModel[38] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 56
		bodyModel[39] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 57
		bodyModel[40] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 58
		bodyModel[41] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 65
		bodyModel[42] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 66
		bodyModel[43] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 67
		bodyModel[44] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 71
		bodyModel[45] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 72
		bodyModel[46] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 73
		bodyModel[47] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 74
		bodyModel[48] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 76
		bodyModel[49] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 77
		bodyModel[50] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 78
		bodyModel[51] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 79
		bodyModel[52] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 80
		bodyModel[53] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 81
		bodyModel[54] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 82
		bodyModel[55] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 83
		bodyModel[56] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 84
		bodyModel[57] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 85
		bodyModel[58] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 86
		bodyModel[59] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 87
		bodyModel[60] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 88
		bodyModel[61] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 89
		bodyModel[62] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 90
		bodyModel[63] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 91
		bodyModel[64] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 92
		bodyModel[65] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 93
		bodyModel[66] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 94
		bodyModel[67] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 95
		bodyModel[68] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 96
		bodyModel[69] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 97
		bodyModel[70] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 98
		bodyModel[71] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 99
		bodyModel[72] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 100
		bodyModel[73] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 101
		bodyModel[74] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 102
		bodyModel[75] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 103
		bodyModel[76] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 104
		bodyModel[77] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 105
		bodyModel[78] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 106
		bodyModel[79] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 108
		bodyModel[80] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 109
		bodyModel[81] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 110
		bodyModel[82] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 111
		bodyModel[83] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 112
		bodyModel[84] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 113
		bodyModel[85] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 114
		bodyModel[86] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 115
		bodyModel[87] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 116
		bodyModel[88] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 117

		bodyModel[0].addShapeBox(-3.5F, -0.5F, -4.5F, 3, 3, 3, 0F,-0.5F, 0F, -0.8F, 0.2F, 0.3F, 0F, 0.3F, 0F, 0F, -0.7F, -0.3F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import ImportImportMammaryRight
		bodyModel[0].setRotationPoint(1.2F, -30.5F, 0F);
		bodyModel[0].rotateAngleX = 0.87266463F;
		bodyModel[0].rotateAngleY = 1.57079633F;
		bodyModel[0].rotateAngleZ = 0.10471976F;

		bodyModel[1].addShapeBox(0.5F, -0.5F, -4.5F, 3, 3, 3, 0F,0.2F, 0.3F, 0F, -0.5F, 0F, -0.8F, -0.7F, -0.3F, 0.2F, 0.3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportMammaryLeft
		bodyModel[1].setRotationPoint(1.22F, -30.5F, 0F);
		bodyModel[1].rotateAngleX = 0.87266463F;
		bodyModel[1].rotateAngleY = 1.57079633F;
		bodyModel[1].rotateAngleZ = -0.10471976F;

		bodyModel[2].addShapeBox(-1F, -1F, -1F, 2, 3, 1, 0F,0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Import ImportImportNeck
		bodyModel[2].setRotationPoint(-0.3F, -32.3F, 0F);
		bodyModel[2].rotateAngleX = 0.08726646F;
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addShapeBox(-0.5F, 0F, -1F, 2, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F); // Import ImportImportTop
		bodyModel[3].setRotationPoint(0.8F, -31F, 2.7F);
		bodyModel[3].rotateAngleX = 0.17453292F;
		bodyModel[3].rotateAngleY = 1.57079632F;
		bodyModel[3].rotateAngleZ = 0.34906585F;

		bodyModel[4].addShapeBox(-0.3F, 5.5F, -0.3F, 2, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F); // Import ImportImportBottom
		bodyModel[4].setRotationPoint(-0.2F, -30F, 3.7F);
		bodyModel[4].rotateAngleX = -0.06981317F;
		bodyModel[4].rotateAngleY = 1.57079633F;
		bodyModel[4].rotateAngleZ = 0.20943951F;

		bodyModel[5].addShapeBox(-1.5F, 1F, -1F, 2, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F); // Import ImportImportTop
		bodyModel[5].setRotationPoint(0.8F, -32F, -2.2F);
		bodyModel[5].rotateAngleX = 0.17453293F;
		bodyModel[5].rotateAngleY = 1.57079633F;
		bodyModel[5].rotateAngleZ = -0.34906585F;

		bodyModel[6].addShapeBox(-1.7F, 6.5F, -0.3F, 2, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F); // Import ImportImportBottom
		bodyModel[6].setRotationPoint(-0.2F, -31F, -3.2F);
		bodyModel[6].rotateAngleX = -0.06981317F;
		bodyModel[6].rotateAngleY = 1.57079633F;
		bodyModel[6].rotateAngleZ = -0.20943951F;

		bodyModel[7].addShapeBox(-3F, 0.2F, -1.3F, 6, 5, 3, 0F,-0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.1F, -0.2F, 0.6F, -0.1F, -0.2F, 0.6F); // Import ImportImportRibCage
		bodyModel[7].setRotationPoint(1.8F, -29.15F, 0F);
		bodyModel[7].rotateAngleY = 1.57079633F;

		bodyModel[8].addBox(-4F, -8.2F, -4F, 8, 8, 8, 0F); // Import ImportImportHead
		bodyModel[8].setRotationPoint(1F, -32.5F, 0F);
		bodyModel[8].rotateAngleX = 0.03490659F;
		bodyModel[8].rotateAngleY = 1.57079633F;

		bodyModel[9].addShapeBox(-4F, -0.2F, 0F, 2, 9, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box8
		bodyModel[9].setRotationPoint(1F, -32.5F, -4F);
		bodyModel[9].rotateAngleZ = -0.06981317F;

		bodyModel[10].addShapeBox(-3F, 0.2F, -1.3F, 6, 5, 3, 0F,-0.6F, -0.5F, -0.2F, -0.6F, -0.5F, -0.2F, -0.5F, -0.8F, 0.3F, -0.5F, -0.8F, 0.3F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F); // Box 21
		bodyModel[10].setRotationPoint(1.8F, -29.15F, 0F);
		bodyModel[10].rotateAngleY = 1.57079633F;

		bodyModel[11].addShapeBox(-3F, 0.2F, -1.3F, 3, 3, 4, 0F,-0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.3F, -0.5F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 22
		bodyModel[11].setRotationPoint(1.7F, -31F, 0F);
		bodyModel[11].rotateAngleY = 1.57079633F;

		bodyModel[12].addShapeBox(-0.02F, 0.2F, -1.3F, 3, 3, 4, 0F,0F, 0F, -1F, -0.5F, 0F, -2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 23
		bodyModel[12].setRotationPoint(1.7F, -31F, 0F);
		bodyModel[12].rotateAngleY = 1.57079633F;

		bodyModel[13].addShapeBox(-4F, -8.2F, -4F, 8, 2, 8, 0F,0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.8F, 0.2F, 0.2F, 0.8F, 0.2F); // Box 23
		bodyModel[13].setRotationPoint(1F, -32.5F, 0F);
		bodyModel[13].rotateAngleX = 0.03490659F;
		bodyModel[13].rotateAngleY = 1.57079633F;

		bodyModel[14].addShapeBox(-4F, -8.2F, -4.2F, 8, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0.1F, -1F, -0.8F, 0.1F, -1F, -0.8F, -1F, 0F, 3F, -1F, 0F, 3F, 0.1F, 0F, -0.8F, 0.1F, 0F, -0.8F); // Box 24
		bodyModel[14].setRotationPoint(1F, -31.5F, 0F);
		bodyModel[14].rotateAngleX = 0.03490659F;
		bodyModel[14].rotateAngleY = 1.57079633F;

		bodyModel[15].addShapeBox(-4F, -7.2F, -4F, 8, 1, 4, 0F,0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F); // Box 25
		bodyModel[15].setRotationPoint(1F, -31.5F, 0F);
		bodyModel[15].rotateAngleX = 0.03490659F;
		bodyModel[15].rotateAngleY = 1.57079633F;

		bodyModel[16].addShapeBox(-4F, -8.2F, -4F, 4, 4, 4, 0F,1F, -1.5F, 1F, 0F, 0F, 1.5F, 0F, -0.5F, 0F, 2F, -2F, 0F, 0.2F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 1F, 0F); // Box 26
		bodyModel[16].setRotationPoint(1F, -35.5F, 0F);
		bodyModel[16].rotateAngleX = 0.03490659F;
		bodyModel[16].rotateAngleY = 1.57079633F;

		bodyModel[17].addShapeBox(-4F, -8.2F, -4F, 4, 4, 4, 0F,0F, 0F, 1.5F, 1F, -1.5F, 1F, 2F, -2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0.2F, 0.5F, 0.5F, 1F, 1F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(1F, -35.5F, 4F);
		bodyModel[17].rotateAngleX = 0.03490659F;
		bodyModel[17].rotateAngleY = 1.57079633F;

		bodyModel[18].addShapeBox(-4F, -8.2F, -4F, 4, 4, 4, 0F,2F, -2F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 1F, 1F, -2.5F, 0.5F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 2F, 0.5F, 0.2F, 1.8F, 0.2F); // Box 29
		bodyModel[18].setRotationPoint(-3F, -35.7F, 0F);
		bodyModel[18].rotateAngleX = 0.03490659F;
		bodyModel[18].rotateAngleY = 1.57079633F;

		bodyModel[19].addShapeBox(-4F, -8.2F, -4F, 4, 4, 4, 0F,0F, -0.5F, 0F, 2F, -2F, 0F, 1F, -2.5F, 0.5F, 0F, -1.5F, 1F, 0F, 0F, 0F, 1F, 1F, 0F, 0.2F, 1.8F, 0.2F, 0F, 2F, 0.5F); // Box 30
		bodyModel[19].setRotationPoint(-3F, -35.7F, 4F);
		bodyModel[19].rotateAngleX = 0.03490659F;
		bodyModel[19].rotateAngleY = 1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.2F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.2F, -0.25F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 34
		bodyModel[20].setRotationPoint(1F, -30.8F, -0.5F);
		bodyModel[20].rotateAngleZ = 0.61086524F;

		bodyModel[21].addShapeBox(0F, 1F, 0F, 1, 1, 1, 0F,0F, -0.4F, 0.8F, 0F, -0.6F, 0.8F, 0F, -0.6F, 0.8F, 0F, -0.4F, 0.8F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 35
		bodyModel[21].setRotationPoint(1F, -30.8F, -0.5F);
		bodyModel[21].rotateAngleZ = 0.61086524F;

		bodyModel[22].addShapeBox(0F, 0.6F, 1.1F, 1, 1, 1, 0F,0F, -0.3F, -0.42F, 0F, -0.5F, -0.42F, 0F, -0.4F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.22F, -0.3F); // Box 36
		bodyModel[22].setRotationPoint(1F, -30.8F, -0.5F);
		bodyModel[22].rotateAngleZ = 0.61086524F;

		bodyModel[23].addShapeBox(0F, 0.6F, -1.1F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.5F, -0.42F, 0F, -0.3F, -0.42F, 0F, -0.22F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 37
		bodyModel[23].setRotationPoint(1F, -30.8F, -0.5F);
		bodyModel[23].rotateAngleZ = 0.61086524F;

		bodyModel[24].addShapeBox(-1.7F, 6.5F, -0.3F, 2, 4, 3, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 1F, -0.1F, 0.1F, 1F, -0.1F, 0.1F, 1F, -0.1F, 0.1F, 1F, -0.1F); // Box 38
		bodyModel[24].setRotationPoint(-0.2F, -31F, -3.2F);
		bodyModel[24].rotateAngleX = -0.06981317F;
		bodyModel[24].rotateAngleY = 1.57079633F;
		bodyModel[24].rotateAngleZ = -0.20943951F;

		bodyModel[25].addShapeBox(-1.5F, 4F, -1F, 2, 3, 3, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 1.5F, -0.1F, 0.1F, 1.5F, -0.1F, 0.1F, 1.5F, -0.1F, 0.1F, 1.5F, -0.1F); // Box 39
		bodyModel[25].setRotationPoint(0.8F, -32F, -2.2F);
		bodyModel[25].rotateAngleX = 0.17453293F;
		bodyModel[25].rotateAngleY = 1.57079633F;
		bodyModel[25].rotateAngleZ = -0.34906585F;

		bodyModel[26].addShapeBox(-0.5F, 3F, -1F, 2, 3, 3, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 1.5F, -0.1F, 0.1F, 1.5F, -0.1F, 0.1F, 1.5F, -0.1F, 0.1F, 1.5F, -0.1F); // Box 40
		bodyModel[26].setRotationPoint(0.8F, -31F, 2.7F);
		bodyModel[26].rotateAngleX = 0.17453292F;
		bodyModel[26].rotateAngleY = 1.57079632F;
		bodyModel[26].rotateAngleZ = 0.34906585F;

		bodyModel[27].addShapeBox(-0.3F, 5.5F, -0.3F, 2, 4, 3, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 1F, -0.1F, 0.1F, 1F, -0.1F, 0.1F, 1F, -0.1F, 0.1F, 1F, -0.1F); // Box 41
		bodyModel[27].setRotationPoint(-0.2F, -30F, 3.7F);
		bodyModel[27].rotateAngleX = -0.06981317F;
		bodyModel[27].rotateAngleY = 1.57079633F;
		bodyModel[27].rotateAngleZ = 0.20943951F;

		bodyModel[28].addShapeBox(-1.7F, 9.5F, -0.3F, 2, 1, 3, 0F,0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, 1F, 0.1F, 0.3F, 1F, 0.1F, 0.3F, 1F, 0.1F, 0.3F, 1F, 0.1F); // Box 42
		bodyModel[28].setRotationPoint(-0.2F, -31F, -3.2F);
		bodyModel[28].rotateAngleX = -0.06981317F;
		bodyModel[28].rotateAngleY = 1.57079633F;
		bodyModel[28].rotateAngleZ = -0.20943951F;

		bodyModel[29].addShapeBox(-0.3F, 8.5F, -0.3F, 2, 1, 3, 0F,0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, 1F, 0.1F, 0.3F, 1F, 0.1F, 0.3F, 1F, 0.1F, 0.3F, 1F, 0.1F); // Box 43
		bodyModel[29].setRotationPoint(-0.2F, -30F, 3.7F);
		bodyModel[29].rotateAngleX = -0.06981317F;
		bodyModel[29].rotateAngleY = 1.57079633F;
		bodyModel[29].rotateAngleZ = 0.20943951F;

		bodyModel[30].addShapeBox(-1.5F, 4F, -1F, 2, 10, 12, 0F,0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, -8.9F, 0.3F, 0F, -8.9F, 0.3F, -7.8F, 0.1F, 0.3F, -7.8F, 0.1F, 0.3F, -7.8F, -8.9F, 0.3F, -7.8F, -8.9F); // Box 44
		bodyModel[30].setRotationPoint(0.8F, -32F, -2.2F);
		bodyModel[30].rotateAngleX = 0.17453293F;
		bodyModel[30].rotateAngleY = 1.57079633F;
		bodyModel[30].rotateAngleZ = -0.34906585F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.2F); // Box 49
		bodyModel[31].setRotationPoint(1.5F, -39F, -8F);
		bodyModel[31].rotateAngleX = 0.03490659F;
		bodyModel[31].rotateAngleY = 1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F); // Box 50
		bodyModel[32].setRotationPoint(1.5F, -39F, 4F);
		bodyModel[32].rotateAngleX = 0.03490659F;
		bodyModel[32].rotateAngleY = 1.57079633F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 12, 10, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F); // Box 51
		bodyModel[33].setRotationPoint(-13F, -28F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 4, 10, 0F,0F, 0F, -3F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -3F); // Box 52
		bodyModel[34].setRotationPoint(-13F, -32F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[35].setRotationPoint(-10.5F, -34F, -1.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[36].setRotationPoint(-10.5F, -35F, -1.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 8, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 55
		bodyModel[37].setRotationPoint(-6F, -24F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[38].setRotationPoint(-4F, -24F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[39].setRotationPoint(-4F, -24F, 9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 4, 10, 0F,0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F); // Box 58
		bodyModel[40].setRotationPoint(-4F, -22F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[41].setRotationPoint(-4.5F, -21.5F, 11F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[42].setRotationPoint(-4.5F, -24.5F, 11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 67
		bodyModel[43].setRotationPoint(-4.5F, -18.5F, 11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[44].setRotationPoint(-4.5F, -21.5F, -15F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[45].setRotationPoint(-4.5F, -24.5F, -15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 73
		bodyModel[46].setRotationPoint(-4.5F, -18.5F, -15F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 74
		bodyModel[47].setRotationPoint(3F, -24F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 76
		bodyModel[48].setRotationPoint(3F, -24F, 9F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 77
		bodyModel[49].setRotationPoint(-13.5F, -48F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 78
		bodyModel[50].setRotationPoint(-13.5F, -46F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 79
		bodyModel[51].setRotationPoint(-13.5F, -42.5F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 80
		bodyModel[52].setRotationPoint(-13.5F, -40.5F, -5.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.7F); // Box 81
		bodyModel[53].setRotationPoint(-13.5F, -42.5F, -6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F, -1.3F); // Box 82
		bodyModel[54].setRotationPoint(-13.5F, -42.5F, 5.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F, -1.3F); // Box 83
		bodyModel[55].setRotationPoint(-13.5F, -42.5F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F, -1.3F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, 0.7F); // Box 84
		bodyModel[56].setRotationPoint(-13.5F, -42.5F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[57].setRotationPoint(-7.5F, -31.8F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[58].setRotationPoint(-7.5F, -31.8F, 2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[59].setRotationPoint(-9.5F, -31.8F, 2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[60].setRotationPoint(-9.5F, -31.8F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 89
		bodyModel[61].setRotationPoint(-8F, -31.8F, -14F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 90
		bodyModel[62].setRotationPoint(-8F, -31.8F, -17F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,-0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 91
		bodyModel[63].setRotationPoint(-8F, -31.8F, 10F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 92
		bodyModel[64].setRotationPoint(-8F, -31.8F, 14F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[65].setRotationPoint(-7.5F, -34.3F, 14.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 2, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 94
		bodyModel[66].setRotationPoint(-7.5F, -34.3F, -20.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 95
		bodyModel[67].setRotationPoint(-11F, -29.3F, -22F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[68].setRotationPoint(-11F, -32.3F, -22F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[69].setRotationPoint(-11F, -35.3F, -22F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 98
		bodyModel[70].setRotationPoint(-11F, -29.3F, 18F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[71].setRotationPoint(-11F, -32.3F, 18F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[72].setRotationPoint(-11F, -35.3F, 18F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 13, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 101
		bodyModel[73].setRotationPoint(-13.5F, -34.8F, 22F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0.5F, 0F, -1F, 0.5F); // Box 102
		bodyModel[74].setRotationPoint(-13.5F, -34.8F, 24.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 103
		bodyModel[75].setRotationPoint(-10.5F, -36.8F, 24.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 104
		bodyModel[76].setRotationPoint(-2F, -33.8F, 23F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 105
		bodyModel[77].setRotationPoint(-2F, -29.8F, 23F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F); // Box 106
		bodyModel[78].setRotationPoint(0F, -33.8F, 22.8F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F); // Box 108
		bodyModel[79].setRotationPoint(0F, -29.8F, 22.8F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 13, 8, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[80].setRotationPoint(-13.5F, -34.8F, -24F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 13, 8, 1, 0F,0F, -1F, 0.5F, -1.5F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -1.5F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[81].setRotationPoint(-13.5F, -34.8F, -25.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 12, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[82].setRotationPoint(-10.5F, -36.8F, -25.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 112
		bodyModel[83].setRotationPoint(-2F, -33.8F, -25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 113
		bodyModel[84].setRotationPoint(-2F, -29.8F, -25F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F); // Box 114
		bodyModel[85].setRotationPoint(0F, -33.8F, -24.8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.4F, -0.4F); // Box 115
		bodyModel[86].setRotationPoint(0F, -29.8F, -24.8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.6F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F); // Box 116
		bodyModel[87].setRotationPoint(1F, -28F, -3.5F);
		bodyModel[87].rotateAngleX = 0.17453293F;
		bodyModel[87].rotateAngleY = 0.12217305F;

		bodyModel[88].addShapeBox(0F, -0.2F, 0F, 3, 2, 1, 0F,-0.6F, 0F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, -0.6F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F); // Box 117
		bodyModel[88].setRotationPoint(1F, -28F, 2.5F);
		bodyModel[88].rotateAngleX = -0.17453293F;
		bodyModel[88].rotateAngleY = -0.12217305F;
	}

	
	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportImportPelvis
		hipsModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		hipsModel[2] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 31
		hipsModel[3] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 32
		hipsModel[4] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 33

		hipsModel[0].addShapeBox(-4F, 7.5F, -3F, 8, 3, 4, 0F,-1.1F, 0.8F, 0.9F, -1.1F, 0.8F, 0.9F, -1.1F, 0.6F, -1.3F, -1.1F, 0.6F, -1.3F, 0.2F, -1F, 1F, 0.2F, -1F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Import ImportImportPelvis
		hipsModel[0].setRotationPoint(0F, -31F, 0F);
		hipsModel[0].rotateAngleX = 0.12217305F;
		hipsModel[0].rotateAngleY = 1.57079633F;

		hipsModel[1].addShapeBox(-4F, 0.5F, -1.8F, 8, 1, 4, 0F,0F, 1F, 1F, 0F, 1F, 1F, -0.4F, 0F, 0.4F, -0.4F, 0F, 0.4F, -3.1F, 1.2F, 0F, -3.1F, 1.2F, 0F, -3.5F, 1F, -1.3F, -3.5F, 1F, -1.3F); // Box 17
		hipsModel[1].setRotationPoint(0F, -20.98F, 0F);
		hipsModel[1].rotateAngleX = 0.12217305F;
		hipsModel[1].rotateAngleY = 1.57079633F;

		hipsModel[2].addShapeBox(-4F, 7.5F, -3F, 8, 3, 4, 0F,-1F, 0.8F, 1F, -1F, 0.8F, 1F, -1F, 0.6F, -1.2F, -1F, 0.6F, -1.2F, 0.2F, -1F, 1.2F, 0.2F, -1F, 1.2F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F); // Box 31
		hipsModel[2].setRotationPoint(0F, -31F, 0F);
		hipsModel[2].rotateAngleX = 0.12217305F;
		hipsModel[2].rotateAngleY = 1.57079633F;

		hipsModel[3].addShapeBox(-4F, 7.5F, -4F, 4, 4, 5, 0F,0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, -1F, 0.65F, 0.2F, -1F, 0.65F, 1F, 0F, 0.5F, -0.2F, 0.5F, 1F, 0F, 1F, 0F, 0.8F, 1F, 0.4F); // Box 32
		hipsModel[3].setRotationPoint(0F, -29F, 0F);
		hipsModel[3].rotateAngleX = 0.12217305F;
		hipsModel[3].rotateAngleY = 1.57079633F;

		hipsModel[4].addShapeBox(-4F, 7.5F, -4F, 4, 4, 5, 0F,0.4F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0.65F, 0F, -1F, 0.65F, -0.2F, 0.5F, 1F, 1F, 0F, 0.5F, 0.8F, 1F, 0.4F, 0F, 1F, 0F); // Box 33
		hipsModel[4].setRotationPoint(0F, -29F, 4F);
		hipsModel[4].rotateAngleX = 0.12217305F;
		hipsModel[4].rotateAngleY = 1.57079633F;
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 132
		leftArmModel[1] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 133
		leftArmModel[2] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 134
		leftArmModel[3] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 135
		leftArmModel[4] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 136
		leftArmModel[5] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 137
		leftArmModel[6] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 138

		leftArmModel[0].addShapeBox(-4F, -7.5F, 2.5F, 8, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0.5F, -1F, -1.5F, 0.5F); // Box 132
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-6F, -4.5F, 2.5F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 133
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-4F, -7.5F, 1F, 8, 13, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 134
		leftArmModel[2].setRotationPoint(0F, 0F, -1F);

		leftArmModel[3].addShapeBox(-3F, 4F, 1F, 2, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 135
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1F, 6F, 0.8F, 2, 10, 2, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 136
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-3F, 6F, 0.8F, 2, 10, 2, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 137
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(1F, 4F, 1F, 2, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 138
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 125
		rightArmModel[1] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 126
		rightArmModel[2] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 127
		rightArmModel[3] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 128
		rightArmModel[4] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 129
		rightArmModel[5] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 130
		rightArmModel[6] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 131

		rightArmModel[0].addShapeBox(-4F, -7.5F, -3.5F, 8, 13, 1, 0F,-1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0.5F, -1F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-6F, -4.5F, -3.5F, 12, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4F, -7.5F, -2F, 8, 13, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 4F, -2F, 2, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 128
		rightArmModel[3].setRotationPoint(0F, 0F, -1F);

		rightArmModel[4].addShapeBox(1F, 6F, -1.8F, 2, 10, 2, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 129
		rightArmModel[4].setRotationPoint(0F, 0F, -1F);

		rightArmModel[5].addShapeBox(-3F, 6F, -1.8F, 2, 10, 2, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 130
		rightArmModel[5].setRotationPoint(0F, 0F, -1F);

		rightArmModel[6].addShapeBox(1F, 4F, -2F, 2, 2, 2, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 131
		rightArmModel[6].setRotationPoint(0F, 0F, -1F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportImportFemur
		leftLegModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		leftLegModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 20
		leftLegModel[3] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 47
		leftLegModel[4] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 48

		leftLegModel[0].addShapeBox(0.4F, 7F, -2.6F, 3, 9, 3, 0F,0F, 1F, 0F, 0.4F, 1F, 0F, 0.4F, 1F, 0F, 0F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F); // Import ImportImportFemur
		leftLegModel[0].setRotationPoint(0F, -17F, 0F);
		leftLegModel[0].rotateAngleX = 0.05235988F;
		leftLegModel[0].rotateAngleY = 1.57079633F;

		leftLegModel[1].addShapeBox(0.5F, 1.5F, -2.3F, 4, 3, 5, 0F,-0.5F, 0F, 0F, -0.9F, 0.5F, 0F, -0.8F, 0.2F, -0.2F, 0.6F, -0.2F, -0.4F, 0.5F, 0F, 0.7F, -0.3F, 0F, 0.3F, -0.4F, 0.4F, -0.6F, 0.6F, 0.2F, -0.4F); // Box 18
		leftLegModel[1].setRotationPoint(0F, -22F, 0.4F);
		leftLegModel[1].rotateAngleY = -4.71238898F;

		leftLegModel[2].addShapeBox(0.9F, 1.5F, -2.3F, 3, 5, 4, 0F,1.1F, -0.2F, 0.5F, 0.2F, -0.2F, 1F, 0.8F, 0F, -0.2F, 0.1F, 0F, 0.7F, 0.7F, 2F, -0.6F, -0.8F, 2F, 0F, -0.2F, 2F, -0.8F, 0.3F, 2F, -0.8F); // Box 20
		leftLegModel[2].setRotationPoint(0F, -19F, 0F);
		leftLegModel[2].rotateAngleX = -0.06981317F;
		leftLegModel[2].rotateAngleY = 1.74532925F;

		leftLegModel[3].addShapeBox(-2.4F, 11F, 2F, 1, 5, 3, 0F,-0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 47
		leftLegModel[3].setRotationPoint(0F, -17F, 4F);
		leftLegModel[3].rotateAngleX = -0.05235988F;
		leftLegModel[3].rotateAngleY = 1.57079633F;

		leftLegModel[4].addShapeBox(-3.4F, 14F, -2.6F, 3, 2, 3, 0F,0F, 1F, 0.2F, 0.4F, 1F, 0.2F, 0.4F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F); // Box 48
		leftLegModel[4].setRotationPoint(0F, -17F, 3.8F);
		leftLegModel[4].rotateAngleX = 0.05235988F;
		leftLegModel[4].rotateAngleY = 1.57079633F;
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportImportFemur
		rightLegModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportImportThigh
		rightLegModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
		rightLegModel[3] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 45
		rightLegModel[4] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 46

		rightLegModel[0].addShapeBox(-3.4F, 7F, -2.6F, 3, 9, 3, 0F,0.4F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.4F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F); // Import ImportImportFemur
		rightLegModel[0].setRotationPoint(0F, -17F, 0F);
		rightLegModel[0].rotateAngleX = 0.05235988F;
		rightLegModel[0].rotateAngleY = 1.57079633F;

		rightLegModel[1].addShapeBox(-3.9F, 1.5F, -2.3F, 3, 5, 4, 0F,0.2F, -0.2F, 1F, 1.1F, -0.2F, 0.5F, 0.1F, 0F, 0.7F, 0.8F, 0F, -0.2F, -0.8F, 2F, 0F, 0.7F, 2F, -0.6F, 0.3F, 2F, -0.8F, -0.2F, 2F, -0.8F); // Import ImportImportThigh
		rightLegModel[1].setRotationPoint(0F, -19F, 0F);
		rightLegModel[1].rotateAngleX = -0.06981317F;
		rightLegModel[1].rotateAngleY = 1.3962634F;

		rightLegModel[2].addShapeBox(0.5F, 1.5F, -2.3F, 4, 3, 5, 0F,-0.9F, 0.5F, 0F, -0.1F, 0F, 0F, 0.6F, -0.2F, -0.4F, -0.8F, 0.2F, -0.2F, -0.2F, 0F, 0.3F, 0.5F, 0F, 0.7F, 0.6F, 0.2F, -0.4F, -0.4F, 0.4F, -0.6F); // Box 19
		rightLegModel[2].setRotationPoint(0F, -22F, -5.4F);
		rightLegModel[2].rotateAngleY = -4.71238898F;

		rightLegModel[3].addShapeBox(-3.4F, 14F, -2.6F, 3, 2, 3, 0F,0.4F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0.4F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F); // Box 45
		rightLegModel[3].setRotationPoint(0F, -17F, 0F);
		rightLegModel[3].rotateAngleX = 0.05235988F;
		rightLegModel[3].rotateAngleY = 1.57079633F;

		rightLegModel[4].addShapeBox(-2.4F, 11F, 2F, 1, 5, 3, 0F,-0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 46
		rightLegModel[4].setRotationPoint(0F, -17F, 0F);
		rightLegModel[4].rotateAngleX = -0.05235988F;
		rightLegModel[4].rotateAngleY = 1.57079633F;
	}
}