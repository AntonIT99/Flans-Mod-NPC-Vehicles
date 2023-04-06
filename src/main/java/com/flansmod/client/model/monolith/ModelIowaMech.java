//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIowaMech extends ModelMecha //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelIowaMech() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[88];
		headModel = new ModelRendererTurbo[8];
		hipsModel = new ModelRendererTurbo[1];
		leftArmModel = new ModelRendererTurbo[9];
		rightArmModel = new ModelRendererTurbo[9];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initheadModel_1();
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 400, textureX, textureY); // Import ImportImportMammaryRight
		bodyModel[1] = new ModelRendererTurbo(this, 17, 400, textureX, textureY); // Import ImportImportMammaryLeft
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportImportNeck
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportImportTop
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportImportBottom
		bodyModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import ImportImportTop
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import ImportImportBottom
		bodyModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import ImportImportRibCage
		bodyModel[8] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import ImportImportPelvis
		bodyModel[9] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 22
		bodyModel[12] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 23
		bodyModel[13] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 43
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 45
		bodyModel[28] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 47
		bodyModel[29] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 48
		bodyModel[30] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 49
		bodyModel[31] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 67
		bodyModel[32] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 68
		bodyModel[33] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 69
		bodyModel[34] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 70
		bodyModel[35] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 71
		bodyModel[36] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 72
		bodyModel[37] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 73
		bodyModel[38] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 74
		bodyModel[39] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 75
		bodyModel[40] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 76
		bodyModel[41] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 77
		bodyModel[42] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 78
		bodyModel[43] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 79
		bodyModel[44] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 80
		bodyModel[45] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 81
		bodyModel[46] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 82
		bodyModel[47] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 83
		bodyModel[48] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 84
		bodyModel[49] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 85
		bodyModel[50] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 86
		bodyModel[51] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 87
		bodyModel[52] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 88
		bodyModel[53] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 89
		bodyModel[54] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 101
		bodyModel[57] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 102
		bodyModel[58] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 103
		bodyModel[59] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 104
		bodyModel[60] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 105
		bodyModel[61] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 106
		bodyModel[62] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 107
		bodyModel[63] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 108
		bodyModel[64] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 109
		bodyModel[65] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 110
		bodyModel[66] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 112
		bodyModel[67] = new ModelRendererTurbo(this, 185, 300, textureX, textureY); // Box 113
		bodyModel[68] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 114
		bodyModel[69] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 116
		bodyModel[70] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 117
		bodyModel[71] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 118
		bodyModel[72] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 119
		bodyModel[73] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 120
		bodyModel[74] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 121
		bodyModel[75] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 122
		bodyModel[76] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 123
		bodyModel[77] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 124
		bodyModel[78] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 125
		bodyModel[79] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 126
		bodyModel[80] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 127
		bodyModel[81] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 128
		bodyModel[82] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 129
		bodyModel[83] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 130
		bodyModel[84] = new ModelRendererTurbo(this, 300, 250, textureX, textureY); // Box 132
		bodyModel[85] = new ModelRendererTurbo(this, 300, 250, textureX, textureY); // Box 133
		bodyModel[86] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 134
		bodyModel[87] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 135

		bodyModel[0].addShapeBox(-3.5F, -0.5F, -4.5F, 3, 3, 3, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.8F, 0.6F, 0.5F, 0.1F, 0.1F, -0.6F, -0.2F, 0.4F, -0.05F, 0.1F, 0.1F, 0.1F, -0.4F, 0.6F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import ImportImportMammaryRight
		bodyModel[0].setRotationPoint(1.2F, -30.5F, 0F);
		bodyModel[0].rotateAngleX = 0.87266463F;
		bodyModel[0].rotateAngleY = 1.57079633F;
		bodyModel[0].rotateAngleZ = 0.10471976F;

		bodyModel[1].addShapeBox(0.5F, -0.5F, -4.5F, 3, 3, 3, 0F,0.1F, 0.8F, 0.6F, 0.2F, 0.1F, 0.1F, -0.5F, -0.2F, 0.4F, 0.5F, 0.1F, 0.1F, 0.1F, 0.6F, 0.6F, 0.05F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import ImportImportMammaryLeft
		bodyModel[1].setRotationPoint(1.22F, -30.5F, 0F);
		bodyModel[1].rotateAngleX = 0.87266463F;
		bodyModel[1].rotateAngleY = 1.57079633F;
		bodyModel[1].rotateAngleZ = -0.10471976F;

		bodyModel[2].addShapeBox(-1F, -1F, -1F, 2, 3, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Import ImportImportNeck
		bodyModel[2].setRotationPoint(-0.3F, -32.3F, 0F);
		bodyModel[2].rotateAngleX = 0.08726646F;
		bodyModel[2].rotateAngleY = 1.57079633F;

		bodyModel[3].addShapeBox(-0.5F, 0F, -1F, 2, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F); // Import ImportImportTop
		bodyModel[3].setRotationPoint(0.8F, -31F, 2.7F);
		bodyModel[3].rotateAngleX = 0.17453293F;
		bodyModel[3].rotateAngleY = 1.57079633F;
		bodyModel[3].rotateAngleZ = 0.34906585F;

		bodyModel[4].addShapeBox(-0.3F, 5.5F, -0.3F, 2, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F); // Import ImportImportBottom
		bodyModel[4].setRotationPoint(-1F, -30.4F, 4.2F);
		bodyModel[4].rotateAngleX = -0.20943951F;
		bodyModel[4].rotateAngleY = 1.57079633F;
		bodyModel[4].rotateAngleZ = 0.12217305F;

		bodyModel[5].addShapeBox(-1.5F, 1F, -1F, 2, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F); // Import ImportImportTop
		bodyModel[5].setRotationPoint(0.8F, -32F, -2.2F);
		bodyModel[5].rotateAngleX = 0.17453293F;
		bodyModel[5].rotateAngleY = 1.57079633F;
		bodyModel[5].rotateAngleZ = -0.34906585F;

		bodyModel[6].addShapeBox(-1.7F, 6.5F, -0.3F, 2, 6, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F); // Import ImportImportBottom
		bodyModel[6].setRotationPoint(-1.4F, -31.4F, -3.9F);
		bodyModel[6].rotateAngleX = -0.20943951F;
		bodyModel[6].rotateAngleY = 1.57079633F;
		bodyModel[6].rotateAngleZ = -0.12217305F;

		bodyModel[7].addShapeBox(-3F, 0.2F, -1.3F, 6, 5, 3, 0F,-0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.3F, -0.8F, 0.5F, -0.3F, -0.8F, 0.5F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.1F, -0.6F, 0.6F, -0.1F, -0.6F, 0.6F); // Import ImportImportRibCage
		bodyModel[7].setRotationPoint(1.8F, -29.15F, 0F);
		bodyModel[7].rotateAngleY = 1.57079633F;

		bodyModel[8].addShapeBox(-4F, 7.5F, -3F, 8, 3, 4, 0F,-1.1F, 1.2F, 0.9F, -1.1F, 1.2F, 0.9F, -1.1F, 1F, -1.3F, -1.1F, 1F, -1.3F, 0.8F, -1F, 1F, 0.8F, -1F, 1F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Import ImportImportPelvis
		bodyModel[8].setRotationPoint(0F, -31F, 0F);
		bodyModel[8].rotateAngleX = 0.12217305F;
		bodyModel[8].rotateAngleY = 1.57079633F;

		bodyModel[9].addShapeBox(-3F, 0.2F, -1.3F, 3, 3, 4, 0F,-0.5F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F); // Box 22
		bodyModel[9].setRotationPoint(1.7F, -31F, 0F);
		bodyModel[9].rotateAngleY = 1.57079633F;

		bodyModel[10].addShapeBox(-0.02F, 0.2F, -1.3F, 3, 3, 4, 0F,0F, 0F, -1F, -0.5F, 0F, -2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.5F, 0F, -0.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 23
		bodyModel[10].setRotationPoint(1.72F, -31.02F, 0.02F);
		bodyModel[10].rotateAngleY = 1.57079633F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 22
		bodyModel[11].setRotationPoint(1.5F, -33F, -4F);
		bodyModel[11].rotateAngleX = -0.08726646F;
		bodyModel[11].rotateAngleZ = 0.17453293F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 23
		bodyModel[12].setRotationPoint(2.5F, -35F, 3F);
		bodyModel[12].rotateAngleX = 0.17453293F;
		bodyModel[12].rotateAngleZ = 0.26179939F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 30
		bodyModel[13].setRotationPoint(1.5F, -33F, 3F);
		bodyModel[13].rotateAngleX = 0.08726646F;
		bodyModel[13].rotateAngleZ = 0.17453293F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 31
		bodyModel[14].setRotationPoint(1.5F, -33F, 3F);
		bodyModel[14].rotateAngleX = 0.08726646F;
		bodyModel[14].rotateAngleZ = 0.17453293F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 32
		bodyModel[15].setRotationPoint(1.5F, -33F, 3F);
		bodyModel[15].rotateAngleX = 0.08726646F;
		bodyModel[15].rotateAngleZ = 0.17453293F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 33
		bodyModel[16].setRotationPoint(1.5F, -33F, 3F);
		bodyModel[16].rotateAngleX = 0.08726646F;
		bodyModel[16].rotateAngleZ = 0.17453293F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 34
		bodyModel[17].setRotationPoint(2.5F, -35F, -4F);
		bodyModel[17].rotateAngleX = -0.17453293F;
		bodyModel[17].rotateAngleZ = 0.26179939F;

		bodyModel[18].addShapeBox(-1.5F, 4F, -1F, 2, 1, 3, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 36
		bodyModel[18].setRotationPoint(0.8F, -32F, -2.2F);
		bodyModel[18].rotateAngleX = 0.17453293F;
		bodyModel[18].rotateAngleY = 1.57079633F;
		bodyModel[18].rotateAngleZ = -0.34906585F;

		bodyModel[19].addShapeBox(-0.5F, 3F, -1F, 2, 1, 3, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 37
		bodyModel[19].setRotationPoint(0.8F, -31F, 2.7F);
		bodyModel[19].rotateAngleX = 0.17453293F;
		bodyModel[19].rotateAngleY = 1.57079633F;
		bodyModel[19].rotateAngleZ = 0.34906585F;

		bodyModel[20].addShapeBox(-1F, -1F, -1F, 2, 3, 1, 0F,0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, 0.6F, 0.8F, 0F, 0.6F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 38
		bodyModel[20].setRotationPoint(-0.3F, -30.8F, 0F);
		bodyModel[20].rotateAngleX = 0.08726646F;
		bodyModel[20].rotateAngleY = 1.57079633F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[21].setRotationPoint(-3F, -22F, -5F);
		bodyModel[21].rotateAngleZ = -0.17453293F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 40
		bodyModel[22].setRotationPoint(-3F, -23.5F, -4.5F);
		bodyModel[22].rotateAngleX = -0.36651914F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 41
		bodyModel[23].setRotationPoint(-3F, -23F, 3.5F);
		bodyModel[23].rotateAngleX = 0.36651914F;
		bodyModel[23].rotateAngleY = 0.05235988F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2F); // Box 42
		bodyModel[24].setRotationPoint(-8F, -20.5F, -4.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 8, 2, 3, 0F); // Box 43
		bodyModel[25].setRotationPoint(-7F, -19F, -8F);
		bodyModel[25].rotateAngleY = -0.41887902F;

		bodyModel[26].addBox(0F, 0F, 0F, 8, 2, 3, 0F); // Box 44
		bodyModel[26].setRotationPoint(-6F, -19F, 5F);
		bodyModel[26].rotateAngleY = 0.41887902F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F); // Box 45
		bodyModel[27].setRotationPoint(-3F, -19.2F, -18F);
		bodyModel[27].rotateAngleY = -0.05235988F;

		bodyModel[28].addShapeBox(8F, 0F, 0F, 5, 2, 8, 0F,0F, 0.5F, 0F, -0.7F, 0.5F, -1F, -0.7F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 47
		bodyModel[28].setRotationPoint(-1F, -21.2F, -18F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 48
		bodyModel[29].setRotationPoint(-1F, -21.2F, -18F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[30].setRotationPoint(0F, -21.1F, -20F);

		bodyModel[31].addShapeBox(13F, 0F, 0F, 10, 3, 5, 0F,-0.5F, -1F, 0F, -1F, -1F, -1.3F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, -0.5F, -0.2F, -0.5F, -1F, -0.4F, -1.8F, -0.5F, -0.4F, -1.5F, -0.5F, -0.2F, -1.5F); // Box 67
		bodyModel[31].setRotationPoint(-4F, -18.8F, -17.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[32].setRotationPoint(-14F, -22.2F, -18F);
		bodyModel[32].rotateAngleY = -0.17453293F;

		bodyModel[33].addShapeBox(8F, 0F, 0F, 5, 2, 8, 0F,0F, 0.5F, 0F, -0.7F, 0.5F, -1F, -0.7F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 69
		bodyModel[33].setRotationPoint(-15F, -24.7F, -18F);
		bodyModel[33].rotateAngleY = 0.03490659F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 70
		bodyModel[34].setRotationPoint(-15F, -24.7F, -18F);
		bodyModel[34].rotateAngleY = 0.03490659F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[35].setRotationPoint(-14F, -24.6F, -20F);
		bodyModel[35].rotateAngleY = 0.03490659F;

		bodyModel[36].addShapeBox(2F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 72
		bodyModel[36].setRotationPoint(-3.2F, -24F, -15.6F);
		bodyModel[36].rotateAngleY = 0.03490659F;

		bodyModel[37].addShapeBox(4F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[37].setRotationPoint(-3.2F, -24F, -15.6F);
		bodyModel[37].rotateAngleY = 0.03490659F;

		bodyModel[38].addShapeBox(4F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[38].setRotationPoint(-3.2F, -24F, -13.6F);
		bodyModel[38].rotateAngleY = 0.03490659F;

		bodyModel[39].addShapeBox(2F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 75
		bodyModel[39].setRotationPoint(-3.2F, -24F, -13.6F);
		bodyModel[39].rotateAngleY = 0.03490659F;

		bodyModel[40].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 76
		bodyModel[40].setRotationPoint(-3.2F, -24F, -13.6F);
		bodyModel[40].rotateAngleY = 0.03490659F;

		bodyModel[41].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 77
		bodyModel[41].setRotationPoint(-3.2F, -24F, -15.6F);
		bodyModel[41].rotateAngleY = 0.03490659F;

		bodyModel[42].addShapeBox(0F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 78
		bodyModel[42].setRotationPoint(-3.2F, -24F, -11.6F);
		bodyModel[42].rotateAngleY = 0.03490659F;

		bodyModel[43].addShapeBox(2F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 79
		bodyModel[43].setRotationPoint(-3.2F, -24F, -11.6F);
		bodyModel[43].rotateAngleY = 0.03490659F;

		bodyModel[44].addShapeBox(4F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[44].setRotationPoint(-3.2F, -24F, -11.6F);
		bodyModel[44].rotateAngleY = 0.03490659F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[45].setRotationPoint(-12F, -22.7F, -16.5F);
		bodyModel[45].rotateAngleY = -0.17453293F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 82
		bodyModel[46].setRotationPoint(-6F, -18.8F, -8F);
		bodyModel[46].rotateAngleY = -0.17453293F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 83
		bodyModel[47].setRotationPoint(-5F, -18.8F, 2F);
		bodyModel[47].rotateAngleY = 0.17453293F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 84
		bodyModel[48].setRotationPoint(-6F, -18.8F, -8F);
		bodyModel[48].rotateAngleY = -0.17453293F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 14, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F); // Box 85
		bodyModel[49].setRotationPoint(-3F, -19.2F, 10F);
		bodyModel[49].rotateAngleY = 0.05235988F;

		bodyModel[50].addShapeBox(13F, 0F, 0F, 10, 3, 5, 0F,0F, -1F, -1.5F, 0F, -1F, -1.5F, -1F, -1F, -1.3F, -0.5F, -1F, 0F, -0.5F, -0.2F, -1.5F, -0.5F, -0.4F, -1.5F, -1F, -0.4F, -1.8F, -0.5F, -0.2F, -0.5F); // Box 86
		bodyModel[50].setRotationPoint(-4F, -18.8F, 11F);
		bodyModel[50].rotateAngleY = 0.10471976F;

		bodyModel[51].addShapeBox(8F, 0F, 0F, 5, 2, 8, 0F,0F, 0.5F, 0F, -0.7F, 0.5F, -1F, -0.7F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 87
		bodyModel[51].setRotationPoint(-1F, -21.2F, 10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 88
		bodyModel[52].setRotationPoint(-1F, -21.2F, 10F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[53].setRotationPoint(0F, -21.1F, 8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[54].setRotationPoint(1F, -22.7F, 12F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[55].setRotationPoint(1F, -22.7F, 12F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 101
		bodyModel[56].setRotationPoint(2F, -23.5F, 13F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 102
		bodyModel[57].setRotationPoint(3F, -23.5F, 13F);
		bodyModel[57].rotateAngleZ = 0.52359878F;

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 103
		bodyModel[58].setRotationPoint(3F, -23.5F, 14F);
		bodyModel[58].rotateAngleZ = 0.52359878F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[59].setRotationPoint(-12F, -22.2F, 7F);
		bodyModel[59].rotateAngleY = 0.17453293F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[60].setRotationPoint(-10F, -22.7F, 9.5F);
		bodyModel[60].rotateAngleY = 0.17453293F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 106
		bodyModel[61].setRotationPoint(-7F, -23.7F, 13F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 107
		bodyModel[62].setRotationPoint(-6F, -23.7F, 14F);
		bodyModel[62].rotateAngleZ = 0.52359878F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 108
		bodyModel[63].setRotationPoint(-6F, -23.7F, 13F);
		bodyModel[63].rotateAngleZ = 0.52359878F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 109
		bodyModel[64].setRotationPoint(-7F, -23.7F, 15F);
		bodyModel[64].rotateAngleY = 2.12930169F;

		bodyModel[65].addShapeBox(1F, 0F, 1.4F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 110
		bodyModel[65].setRotationPoint(-6F, -23.3F, 16F);
		bodyModel[65].rotateAngleY = 2.12930169F;
		bodyModel[65].rotateAngleZ = 0.52359878F;

		bodyModel[66].addShapeBox(1F, 0F, 2.4F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 112
		bodyModel[66].setRotationPoint(-6F, -23.3F, 16F);
		bodyModel[66].rotateAngleY = 2.12930169F;
		bodyModel[66].rotateAngleZ = 0.52359878F;

		bodyModel[67].addShapeBox(-5F, 7.5F, -3F, 10, 1, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 113
		bodyModel[67].setRotationPoint(0F, -29F, 0F);
		bodyModel[67].rotateAngleY = 1.57079633F;

		bodyModel[68].addShapeBox(0F, 7.5F, -3F, 2, 1, 1, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 114
		bodyModel[68].setRotationPoint(0.2F, -29F, -1F);
		bodyModel[68].rotateAngleY = 1.57079633F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[69].setRotationPoint(-13F, -25.5F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[70].setRotationPoint(-11.5F, -29.5F, -2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 118
		bodyModel[71].setRotationPoint(-11.5F, -31.3F, -2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 1, 14, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 119
		bodyModel[72].setRotationPoint(-13F, -26F, -7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 120
		bodyModel[73].setRotationPoint(-8F, -27F, 4.5F);
		bodyModel[73].rotateAngleY = 2.12930169F;

		bodyModel[74].addShapeBox(1F, 0F, 1.4F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 121
		bodyModel[74].setRotationPoint(-7F, -26.6F, 5.5F);
		bodyModel[74].rotateAngleY = 2.12930169F;
		bodyModel[74].rotateAngleZ = 0.52359878F;

		bodyModel[75].addShapeBox(1F, 0F, 2.4F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 122
		bodyModel[75].setRotationPoint(-7F, -26.6F, 5.5F);
		bodyModel[75].rotateAngleY = 2.12930169F;
		bodyModel[75].rotateAngleZ = 0.52359878F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 123
		bodyModel[76].setRotationPoint(-10F, -27F, -4.5F);
		bodyModel[76].rotateAngleY = -1.22173048F;

		bodyModel[77].addShapeBox(1F, 0F, -0.9F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 124
		bodyModel[77].setRotationPoint(-9F, -26.6F, -4.5F);
		bodyModel[77].rotateAngleY = -1.22173048F;
		bodyModel[77].rotateAngleZ = 0.52359878F;

		bodyModel[78].addShapeBox(1F, 0F, 0.0999999999999999F, 2, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 125
		bodyModel[78].setRotationPoint(-9F, -26.6F, -4.5F);
		bodyModel[78].rotateAngleY = -1.22173048F;
		bodyModel[78].rotateAngleZ = 0.52359878F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[79].setRotationPoint(-11F, -32.5F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 127
		bodyModel[80].setRotationPoint(-11F, -33.5F, -2F);

		bodyModel[81].addShapeBox(-1.7F, 11F, -0.3F, 2, 1, 3, 0F,0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F); // Box 128
		bodyModel[81].setRotationPoint(-1.4F, -31.4F, -3.9F);
		bodyModel[81].rotateAngleX = -0.20943951F;
		bodyModel[81].rotateAngleY = 1.57079633F;
		bodyModel[81].rotateAngleZ = -0.12217305F;

		bodyModel[82].addShapeBox(-0.3F, 10F, -0.3F, 2, 1, 3, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 129
		bodyModel[82].setRotationPoint(-1F, -30.4F, 4.2F);
		bodyModel[82].rotateAngleX = -0.20943951F;
		bodyModel[82].rotateAngleY = 1.57079633F;
		bodyModel[82].rotateAngleZ = 0.12217305F;

		bodyModel[83].addShapeBox(-5F, 7.5F, -3F, 10, 2, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F); // Box 130
		bodyModel[83].setRotationPoint(0F, -28F, 0F);
		bodyModel[83].rotateAngleY = 1.57079633F;

		bodyModel[84].addShapeBox(0F, -2F, -2F, 1, 4, 5, 0F,0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F); // Box 132
		bodyModel[84].setRotationPoint(4.2F, -35.3F, -2F);

		bodyModel[85].addShapeBox(0F, -2F, -2F, 1, 4, 5, 0F,0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, -2F); // Box 133
		bodyModel[85].setRotationPoint(4.2F, -35.3F, 1F);

		bodyModel[86].addShapeBox(-3.5F, -0.5F, -4.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0.7F, 0.5F, 0.4F, 0F, 0F, -0.7F, -0.3F, 0.3F, -0.15F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[86].setRotationPoint(1.2F, -30.5F, 0F);
		bodyModel[86].rotateAngleX = 0.87266463F;
		bodyModel[86].rotateAngleY = 1.57079633F;
		bodyModel[86].rotateAngleZ = 0.10471976F;

		bodyModel[87].addShapeBox(0.5F, -0.5F, -4.5F, 3, 3, 3, 0F,0F, 0.7F, 0.5F, 0F, 0F, 0F, -0.7F, -0.3F, 0.2F, 0.4F, 0F, 0F, 0F, 0.5F, 0.5F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[87].setRotationPoint(1.22F, -30.5F, 0F);
		bodyModel[87].rotateAngleX = 0.87266463F;
		bodyModel[87].rotateAngleY = 1.57079633F;
		bodyModel[87].rotateAngleZ = -0.10471976F;
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Import ImportImportHead
		headModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box8
		headModel[2] = new ModelRendererTurbo(this, 129, 300, textureX, textureY); // Box 21
		headModel[3] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 24
		headModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 25
		headModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 26
		headModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 27
		headModel[7] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 29

		headModel[0].addBox(-4F, -8.2F, -4F, 8, 8, 8, 0F); // Import ImportImportHead
		headModel[0].setRotationPoint(1F, -32F, 0F);
		headModel[0].rotateAngleX = 0.03490659F;
		headModel[0].rotateAngleY = 1.57079633F;

		headModel[1].addShapeBox(-4F, -0.2F, -4F, 1, 9, 8, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.8F, 1F, 1.5F, -1F, 1F, 1.5F, -1F, 1F, 1.5F, 0.8F, 1F, 1.5F); // Import Box8
		headModel[1].setRotationPoint(1F, -32F, 0F);
		headModel[1].rotateAngleZ = -0.03490659F;

		headModel[2].addShapeBox(-4F, -8.2F, -4F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 21
		headModel[2].setRotationPoint(2.5F, -32F, 0F);
		headModel[2].rotateAngleX = -0.08726646F;
		headModel[2].rotateAngleY = 1.57079633F;

		headModel[3].addBox(0F, -8.2F, 0F, 5, 3, 5, 0F); // Box 24
		headModel[3].setRotationPoint(3.5F, -34.5F, -2.5F);
		headModel[3].rotateAngleX = 0.03490659F;
		headModel[3].rotateAngleY = 1.57079633F;

		headModel[4].addBox(0F, -8.2F, 0F, 3, 1, 3, 0F); // Box 25
		headModel[4].setRotationPoint(2.5F, -35F, -1.5F);
		headModel[4].rotateAngleX = 0.03490659F;
		headModel[4].rotateAngleY = 1.57079633F;

		headModel[5].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 26
		headModel[5].setRotationPoint(1F, -41.5F, 2.5F);
		headModel[5].rotateAngleY = 1.91986218F;

		headModel[6].addShapeBox(-5F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 27
		headModel[6].setRotationPoint(1F, -41.5F, -2.5F);
		headModel[6].rotateAngleY = 1.22173048F;

		headModel[7].addBox(0F, -8.2F, 0F, 3, 2, 3, 0F); // Box 29
		headModel[7].setRotationPoint(4.5F, -33.5F, -1.5F);
		headModel[7].rotateAngleX = 0.03490659F;
		headModel[7].rotateAngleY = 1.57079633F;
	}

	private void inithipsModel_1()
	{
		hipsModel[0] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17

		hipsModel[0].addShapeBox(-4F, 0.5F, -1.8F, 8, 1, 4, 0F,0.6F, 1F, 1F, 0.6F, 1F, 1F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, -3.1F, 1.2F, 0F, -3.1F, 1.2F, 0F, -3.5F, 1F, -1.3F, -3.5F, 1F, -1.3F); // Box 17
		hipsModel[0].setRotationPoint(0F, -20.98F, 0F);
		hipsModel[0].rotateAngleX = 0.12217305F;
		hipsModel[0].rotateAngleY = 1.57079633F;
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 90
		leftArmModel[1] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 91
		leftArmModel[2] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 92
		leftArmModel[3] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 93
		leftArmModel[4] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 94
		leftArmModel[5] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 95
		leftArmModel[6] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 96
		leftArmModel[7] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 97
		leftArmModel[8] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 98

		leftArmModel[0].addShapeBox(0F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 90
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
		leftArmModel[0].rotateAngleZ = -1.57079633F;

		leftArmModel[1].addShapeBox(2F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 91
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
		leftArmModel[1].rotateAngleZ = -1.57079633F;

		leftArmModel[2].addShapeBox(4F, -1F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
		leftArmModel[2].rotateAngleZ = -1.57079633F;

		leftArmModel[3].addShapeBox(4F, -1F, -2.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
		leftArmModel[3].rotateAngleZ = -1.57079633F;

		leftArmModel[4].addShapeBox(0F, -1F, -2.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 94
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
		leftArmModel[4].rotateAngleZ = -1.57079633F;

		leftArmModel[5].addShapeBox(2F, -1F, -2.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 95
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
		leftArmModel[5].rotateAngleZ = -1.57079633F;

		leftArmModel[6].addShapeBox(4F, -1F, 1.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
		leftArmModel[6].rotateAngleZ = -1.57079633F;

		leftArmModel[7].addShapeBox(0F, -1F, 1.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 97
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);
		leftArmModel[7].rotateAngleZ = -1.57079633F;

		leftArmModel[8].addShapeBox(2F, -1F, 1.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 98
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);
		leftArmModel[8].rotateAngleZ = -1.57079633F;
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 50
		rightArmModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 52
		rightArmModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 54
		rightArmModel[3] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 58
		rightArmModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 59
		rightArmModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 60
		rightArmModel[6] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 64
		rightArmModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 65
		rightArmModel[8] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 66

		rightArmModel[0].addShapeBox(0F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 50
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
		rightArmModel[0].rotateAngleZ = -1.57079633F;

		rightArmModel[1].addShapeBox(2F, -1F, -0.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 52
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
		rightArmModel[1].rotateAngleZ = -1.57079633F;

		rightArmModel[2].addShapeBox(4F, -1F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
		rightArmModel[2].rotateAngleZ = -1.57079633F;

		rightArmModel[3].addShapeBox(4F, -1F, 1.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
		rightArmModel[3].rotateAngleZ = -1.57079633F;

		rightArmModel[4].addShapeBox(0F, -1F, 1.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 59
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
		rightArmModel[4].rotateAngleZ = -1.57079633F;

		rightArmModel[5].addShapeBox(2F, -1F, 1.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 60
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
		rightArmModel[5].rotateAngleZ = -1.57079633F;

		rightArmModel[6].addShapeBox(4F, -1F, -2.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
		rightArmModel[6].rotateAngleZ = -1.57079633F;

		rightArmModel[7].addShapeBox(0F, -1F, -2.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 65
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);
		rightArmModel[7].rotateAngleZ = -1.57079633F;

		rightArmModel[8].addShapeBox(2F, -1F, -2.5F, 2, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.1F); // Box 66
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);
		rightArmModel[8].rotateAngleZ = -1.57079633F;
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import ImportImportFemur
		leftLegModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		leftLegModel[2] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 20
		leftLegModel[3] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 136

		leftLegModel[0].addShapeBox(0.4F, 7F, -2.6F, 3, 9, 3, 0F,0F, 1F, 0F, 0.4F, 1F, 0F, 0.4F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportImportFemur
		leftLegModel[0].setRotationPoint(0F, -17F, 0F);
		leftLegModel[0].rotateAngleX = 0.05235988F;
		leftLegModel[0].rotateAngleY = 1.57079633F;

		leftLegModel[1].addShapeBox(0.5F, 1.5F, -2.3F, 4, 3, 5, 0F,-0.5F, 0F, 0F, -0.3F, 0.5F, 0F, -0.2F, 0.2F, 0.2F, 0.6F, -0.2F, 0F, 0.5F, 0F, 0.7F, 0.3F, 0F, 0.3F, 0F, 0.4F, -0.4F, 0.6F, 0.2F, 0F); // Box 18
		leftLegModel[1].setRotationPoint(0F, -22F, 0.4F);
		leftLegModel[1].rotateAngleY = -4.71238898F;

		leftLegModel[2].addShapeBox(0.9F, 1.5F, -2.3F, 3, 5, 4, 0F,1.1F, -0.2F, 0.5F, 0.8F, -0.2F, 1F, 1.3F, 0F, -0.2F, 0.1F, 0F, 0.7F, 0.9F, 2F, -0.6F, -0.6F, 2F, 0F, 0F, 2F, -0.8F, 0.5F, 2F, -0.8F); // Box 20
		leftLegModel[2].setRotationPoint(0F, -19F, 0F);
		leftLegModel[2].rotateAngleX = -0.06981317F;
		leftLegModel[2].rotateAngleY = 1.74532925F;

		leftLegModel[3].addShapeBox(-5F, -1.5F, -3F, 5, 2, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F); // Box 136
		leftLegModel[3].setRotationPoint(0F, -19F, 5F);
		leftLegModel[3].rotateAngleY = 1.57079633F;
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import ImportImportFemur
		rightLegModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import ImportImportThigh
		rightLegModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 19
		rightLegModel[3] = new ModelRendererTurbo(this, 185, 350, textureX, textureY); // Box 137

		rightLegModel[0].addShapeBox(-3.4F, 7F, -2.6F, 3, 9, 3, 0F,0.4F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.4F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import ImportImportFemur
		rightLegModel[0].setRotationPoint(0F, -17F, 0F);
		rightLegModel[0].rotateAngleX = 0.05235988F;
		rightLegModel[0].rotateAngleY = 1.57079633F;

		rightLegModel[1].addShapeBox(-3.9F, 1.5F, -2.3F, 3, 5, 4, 0F,0.8F, -0.2F, 1F, 1.1F, -0.2F, 0.5F, 0.1F, 0F, 0.7F, 1.3F, 0F, -0.2F, -0.6F, 2F, 0F, 0.9F, 2F, -0.6F, 0.5F, 2F, -0.8F, 0F, 2F, -0.8F); // Import ImportImportThigh
		rightLegModel[1].setRotationPoint(0F, -19F, 0F);
		rightLegModel[1].rotateAngleX = -0.06981317F;
		rightLegModel[1].rotateAngleY = 1.3962634F;

		rightLegModel[2].addShapeBox(0.5F, 1.5F, -2.3F, 4, 3, 5, 0F,-0.3F, 0.5F, 0F, -0.1F, 0F, 0F, 0.6F, -0.2F, 0F, -0.2F, 0.2F, 0.2F, 0.3F, 0F, 0.3F, 0.5F, 0F, 0.7F, 0.6F, 0.2F, 0F, 0F, 0.4F, -0.4F); // Box 19
		rightLegModel[2].setRotationPoint(0F, -22F, -5.4F);
		rightLegModel[2].rotateAngleY = -4.71238898F;

		rightLegModel[3].addShapeBox(-5F, -1.5F, -3F, 6, 2, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F); // Box 137
		rightLegModel[3].setRotationPoint(0F, -19F, 0F);
		rightLegModel[3].rotateAngleY = 1.57079633F;
	}
}