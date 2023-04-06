//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ARCGun
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelARCgun extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelARCgun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[112];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 0, 2, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 91, 29, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 91, 40, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 91, 40, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 1, 47, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 13
		gunModel[13] = new ModelRendererTurbo(this, 53, 58, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 1, 53, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 48, 27, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 44, 8, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 44, 3, textureX, textureY); // Box 18
		gunModel[18] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 1
		gunModel[19] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 2
		gunModel[20] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 3
		gunModel[21] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 4
		gunModel[22] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 5
		gunModel[23] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 6
		gunModel[24] = new ModelRendererTurbo(this, 49, 19, textureX, textureY); // Box 8
		gunModel[25] = new ModelRendererTurbo(this, 53, 53, textureX, textureY); // Box 9
		gunModel[26] = new ModelRendererTurbo(this, 53, 48, textureX, textureY); // Box 10
		gunModel[27] = new ModelRendererTurbo(this, 55, 43, textureX, textureY); // Box 11
		gunModel[28] = new ModelRendererTurbo(this, 43, 35, textureX, textureY); // Box 12
		gunModel[29] = new ModelRendererTurbo(this, 68, 35, textureX, textureY); // Box 13
		gunModel[30] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 14
		gunModel[31] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 15
		gunModel[32] = new ModelRendererTurbo(this, 93, 7, textureX, textureY); // Box 16
		gunModel[33] = new ModelRendererTurbo(this, 93, 17, textureX, textureY); // Box 17
		gunModel[34] = new ModelRendererTurbo(this, 62, 28, textureX, textureY); // Box 18
		gunModel[35] = new ModelRendererTurbo(this, 62, 28, textureX, textureY); // Box 19
		gunModel[36] = new ModelRendererTurbo(this, 82, 3, textureX, textureY); // Box 20
		gunModel[37] = new ModelRendererTurbo(this, 82, 13, textureX, textureY); // Box 21
		gunModel[38] = new ModelRendererTurbo(this, 62, 28, textureX, textureY); // Box 22
		gunModel[39] = new ModelRendererTurbo(this, 62, 28, textureX, textureY); // Box 23
		gunModel[40] = new ModelRendererTurbo(this, 62, 28, textureX, textureY); // Box 24
		gunModel[41] = new ModelRendererTurbo(this, 62, 28, textureX, textureY); // Box 25
		gunModel[42] = new ModelRendererTurbo(this, 80, 3, textureX, textureY); // Box 26
		gunModel[43] = new ModelRendererTurbo(this, 50, 3, textureX, textureY); // Box 29
		gunModel[44] = new ModelRendererTurbo(this, 57, 11, textureX, textureY); // Box 30
		gunModel[45] = new ModelRendererTurbo(this, 57, 3, textureX, textureY); // Box 31
		gunModel[46] = new ModelRendererTurbo(this, 68, 11, textureX, textureY); // Box 32
		gunModel[47] = new ModelRendererTurbo(this, 68, 3, textureX, textureY); // Box 33
		gunModel[48] = new ModelRendererTurbo(this, 50, 3, textureX, textureY); // Box 34
		gunModel[49] = new ModelRendererTurbo(this, 57, 3, textureX, textureY); // Box 35
		gunModel[50] = new ModelRendererTurbo(this, 68, 3, textureX, textureY); // Box 36
		gunModel[51] = new ModelRendererTurbo(this, 93, 17, textureX, textureY); // Box 37
		gunModel[52] = new ModelRendererTurbo(this, 82, 13, textureX, textureY); // Box 38
		gunModel[53] = new ModelRendererTurbo(this, 50, 3, textureX, textureY); // Box 39
		gunModel[54] = new ModelRendererTurbo(this, 50, 3, textureX, textureY); // Box 40
		gunModel[55] = new ModelRendererTurbo(this, 57, 3, textureX, textureY); // Box 41
		gunModel[56] = new ModelRendererTurbo(this, 57, 11, textureX, textureY); // Box 42
		gunModel[57] = new ModelRendererTurbo(this, 57, 3, textureX, textureY); // Box 43
		gunModel[58] = new ModelRendererTurbo(this, 68, 3, textureX, textureY); // Box 44
		gunModel[59] = new ModelRendererTurbo(this, 68, 11, textureX, textureY); // Box 45
		gunModel[60] = new ModelRendererTurbo(this, 68, 3, textureX, textureY); // Box 46
		gunModel[61] = new ModelRendererTurbo(this, 49, 19, textureX, textureY); // Box 47
		gunModel[62] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 48
		gunModel[63] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 49
		gunModel[64] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 50
		gunModel[65] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 51
		gunModel[66] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 52
		gunModel[67] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 53
		gunModel[68] = new ModelRendererTurbo(this, 49, 19, textureX, textureY); // Box 54
		gunModel[69] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 55
		gunModel[70] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 56
		gunModel[71] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 57
		gunModel[72] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 58
		gunModel[73] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 59
		gunModel[74] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 60
		gunModel[75] = new ModelRendererTurbo(this, 49, 19, textureX, textureY); // Box 61
		gunModel[76] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 62
		gunModel[77] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 63
		gunModel[78] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 64
		gunModel[79] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 65
		gunModel[80] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 66
		gunModel[81] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 67
		gunModel[82] = new ModelRendererTurbo(this, 49, 19, textureX, textureY); // Box 68
		gunModel[83] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 69
		gunModel[84] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 70
		gunModel[85] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 71
		gunModel[86] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 72
		gunModel[87] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 73
		gunModel[88] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 74
		gunModel[89] = new ModelRendererTurbo(this, 49, 19, textureX, textureY); // Box 75
		gunModel[90] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 76
		gunModel[91] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 77
		gunModel[92] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 78
		gunModel[93] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 79
		gunModel[94] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 80
		gunModel[95] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 81
		gunModel[96] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 82
		gunModel[97] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 83
		gunModel[98] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 84
		gunModel[99] = new ModelRendererTurbo(this, 67, 19, textureX, textureY); // Box 85
		gunModel[100] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 86
		gunModel[101] = new ModelRendererTurbo(this, 56, 19, textureX, textureY); // Box 87
		gunModel[102] = new ModelRendererTurbo(this, 49, 19, textureX, textureY); // Box 88
		gunModel[103] = new ModelRendererTurbo(this, 81, 53, textureX, textureY); // Box 89
		gunModel[104] = new ModelRendererTurbo(this, 81, 44, textureX, textureY); // Box 90
		gunModel[105] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 92
		gunModel[106] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 93
		gunModel[107] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 94
		gunModel[108] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 95
		gunModel[109] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 96
		gunModel[110] = new ModelRendererTurbo(this, 84, 24, textureX, textureY); // Box 97
		gunModel[111] = new ModelRendererTurbo(this, 81, 53, textureX, textureY); // Box 98

		gunModel[0].addShapeBox(0F, -3F, -1F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, -1F, 2F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(0F, -1F, -3F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(0F, -3F, 0F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 4
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(0F, 1F, 0F, 18, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(0F, 2F, -1F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(0F, -3F, -1F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 7
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(0F, 1F, -1F, 18, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(-7F, -1F, -3F, 7, 2, 6, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 9
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(-7F, -3F, -3F, 7, 2, 6, 0F,0F, .2F, -1.9F, 0F, .2F, -1.9F, 0F, .2F, -1.9F, 0F, .2F, -1.9F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 10
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(-7F, 1F, -3F, 7, 2, 6, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -1.9F, 0F, 0.2F, -1.9F, 0F, 0.2F, -1.9F, 0F, 0.2F, -1.9F); // Box 11
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(-4F, -6F, -1F, 22, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(-4F, -8F, -1F, 18, 2, 2, 0F,0F, 0F, -.5F, -2F, 0F, -.5F, -2F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(-7F, -5F, -1F, 3, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(-4F, 3F, -1F, 22, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(-7F, -1F, 3F, 4, 2, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, -.2F, -.2F, .2F, -.2F, -.2F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -.2F, -.2F, .2F, -.2F, -.2F, .2F); // Box 16
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(18F, -5.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(18F, 2.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(15F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Box 1
		gunModel[18].setRotationPoint(0F, 0F, 0F);
		gunModel[18].rotateAngleX = 0.78539816F;

		gunModel[19].addShapeBox(16F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, 0F); // Box 2
		gunModel[19].setRotationPoint(0F, 0F, 0F);
		gunModel[19].rotateAngleX = 0.78539816F;

		gunModel[20].addShapeBox(14F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.2F, -0.5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, -.2F, -0.5F); // Box 3
		gunModel[20].setRotationPoint(0F, 0F, 0F);
		gunModel[20].rotateAngleX = 0.78539816F;

		gunModel[21].addShapeBox(15F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -0.5F, -.6F, 0F, -0.5F, .3F, 0F, -.2F); // Box 4
		gunModel[21].setRotationPoint(0F, 0F, 0F);
		gunModel[21].rotateAngleX = 0.78539816F;

		gunModel[22].addShapeBox(15F, 3.5F, -1F, 1, 1, 2, 0F,-0.6F, 0F, -0.5F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 5
		gunModel[22].setRotationPoint(0F, 0F, 0F);
		gunModel[22].rotateAngleX = 0.78539816F;

		gunModel[23].addShapeBox(16F, 3.5F, -1F, 1, 1, 2, 0F,-0.3F, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 6
		gunModel[23].setRotationPoint(0F, 0F, 0F);
		gunModel[23].rotateAngleX = 0.78539816F;

		gunModel[24].addShapeBox(16F, 2.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 8
		gunModel[24].setRotationPoint(0F, 0F, 0F);
		gunModel[24].rotateAngleX = 0.78539816F;

		gunModel[25].addShapeBox(-7F, -7F, -1F, 3, 2, 2, 0F,1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 9
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(-8F, -9F, -1F, 3, 2, 2, 0F,1F, -2.5F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 1F, -2.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 10
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(-9.5F, -9F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, -1.5F, .5F, 0F, -1.5F, .5F, 0F, 0F, .5F, 0F); // Box 11
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(-17.5F, -9.5F, -1F, 8, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(-18F, -10F, 1F, 9, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(-10.5F, -11F, 1.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 14
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(-11.5F, -11F, 1.5F, 1, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 15
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(-17F, -2.5F, -3F, 7, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[32].setRotationPoint(0F, 0F, 0F);
		gunModel[32].rotateAngleZ = 0.66322512F;

		gunModel[33].addShapeBox(-17F, -4.5F, -3F, 7, 2, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[33].setRotationPoint(0F, 0F, 0F);
		gunModel[33].rotateAngleZ = 0.66322512F;

		gunModel[34].addShapeBox(-20F, -8F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[34].setRotationPoint(0F, 0F, 1F);

		gunModel[35].addShapeBox(-23F, -8F, 2F, 3, 1, 1, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 2F, 0F); // Box 19
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(-10F, -2.5F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 20
		gunModel[36].setRotationPoint(0F, 0F, 0F);
		gunModel[36].rotateAngleZ = 0.66322512F;

		gunModel[37].addShapeBox(-10F, -4.5F, -3F, 2, 2, 6, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 21
		gunModel[37].setRotationPoint(0F, 0F, 0F);
		gunModel[37].rotateAngleZ = 0.66322512F;

		gunModel[38].addShapeBox(-23F, -5F, 2F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -.5F); // Box 22
		gunModel[38].setRotationPoint(0F, 0F, 0F);

		gunModel[39].addShapeBox(-23F, 0F, 2F, 3, 1, 1, 0F,-1F, 2F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, -1F, 2F, -1F, 0F, -3F, .5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -3F, -.5F); // Box 23
		gunModel[39].setRotationPoint(0F, 0F, 0F);

		gunModel[40].addShapeBox(-20F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		gunModel[40].setRotationPoint(0F, 0F, 0F);

		gunModel[41].addShapeBox(-14F, 0F, -1F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addShapeBox(-8F, -2F, -0.5F, 2, 1, 1, 0F,0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, .3F, .3F); // Box 26
		gunModel[42].setRotationPoint(0F, 0F, 0F);
		gunModel[42].rotateAngleZ = 0.66322512F;

		gunModel[43].addShapeBox(7F, -18F, -1F, 1, 4, 2, 0F,0F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.1F); // Box 29
		gunModel[43].setRotationPoint(0F, 0F, 0F);
		gunModel[43].rotateAngleZ = -0.78539816F;

		gunModel[44].addShapeBox(6.5F, -22F, -1.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[44].setRotationPoint(0F, 0F, 0F);
		gunModel[44].rotateAngleZ = -0.78539816F;

		gunModel[45].addShapeBox(7.5F, -22F, -1.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 31
		gunModel[45].setRotationPoint(0F, 0F, 0F);
		gunModel[45].rotateAngleZ = -0.78539816F;

		gunModel[46].addShapeBox(6.5F, -24F, -1.5F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[46].setRotationPoint(0F, 0F, 0F);
		gunModel[46].rotateAngleZ = -0.78539816F;

		gunModel[47].addShapeBox(7.5F, -24F, -1.5F, 1, 2, 3, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 33
		gunModel[47].setRotationPoint(0F, 0F, 0F);
		gunModel[47].rotateAngleZ = -0.78539816F;

		gunModel[48].addShapeBox(6F, -18F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F); // Box 34
		gunModel[48].setRotationPoint(0F, 0F, 0F);
		gunModel[48].rotateAngleZ = -0.78539816F;

		gunModel[49].addShapeBox(5.5F, -22F, -1.5F, 1, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 35
		gunModel[49].setRotationPoint(0F, 0F, 0F);
		gunModel[49].rotateAngleZ = -0.78539816F;

		gunModel[50].addShapeBox(5.5F, -24F, -1.5F, 1, 2, 3, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 36
		gunModel[50].setRotationPoint(0F, 0F, 0F);
		gunModel[50].rotateAngleZ = -0.78539816F;

		gunModel[51].addShapeBox(-17F, -0.5F, -3F, 7, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
		gunModel[51].setRotationPoint(0F, 0F, 0F);
		gunModel[51].rotateAngleZ = 0.66322512F;

		gunModel[52].addShapeBox(-10F, -0.5F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F); // Box 38
		gunModel[52].setRotationPoint(0F, 0F, 0F);
		gunModel[52].rotateAngleZ = 0.66322512F;

		gunModel[53].addShapeBox(7F, 14F, -1F, 1, 4, 2, 0F,0F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.1F); // Box 39
		gunModel[53].setRotationPoint(0F, 0F, 0F);
		gunModel[53].rotateAngleZ = 0.78539816F;

		gunModel[54].addShapeBox(6F, 14F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.5F); // Box 40
		gunModel[54].setRotationPoint(0F, 0F, 0F);
		gunModel[54].rotateAngleZ = 0.78539816F;

		gunModel[55].addShapeBox(5.5F, 18F, -1.5F, 1, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 41
		gunModel[55].setRotationPoint(0F, 0F, 0F);
		gunModel[55].rotateAngleZ = 0.78539816F;

		gunModel[56].addShapeBox(6.5F, 18F, -1.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[56].setRotationPoint(0F, 0F, 0F);
		gunModel[56].rotateAngleZ = 0.78539816F;

		gunModel[57].addShapeBox(7.5F, 18F, -1.5F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 43
		gunModel[57].setRotationPoint(0F, 0F, 0F);
		gunModel[57].rotateAngleZ = 0.78539816F;

		gunModel[58].addShapeBox(7.5F, 22F, -1.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 44
		gunModel[58].setRotationPoint(0F, 0F, 0F);
		gunModel[58].rotateAngleZ = 0.78539816F;

		gunModel[59].addShapeBox(6.5F, 22F, -1.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 45
		gunModel[59].setRotationPoint(0F, 0F, 0F);
		gunModel[59].rotateAngleZ = 0.78539816F;

		gunModel[60].addShapeBox(5.5F, 22F, -1.5F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 46
		gunModel[60].setRotationPoint(0F, 0F, 0F);
		gunModel[60].rotateAngleZ = 0.78539816F;

		gunModel[61].addShapeBox(13.5F, 2.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 47
		gunModel[61].setRotationPoint(0F, 0F, 0F);
		gunModel[61].rotateAngleX = 0.78539816F;

		gunModel[62].addShapeBox(13.5F, 3.5F, -1F, 1, 1, 2, 0F,-0.3F, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 48
		gunModel[62].setRotationPoint(0F, 0F, 0F);
		gunModel[62].rotateAngleX = 0.78539816F;

		gunModel[63].addShapeBox(12.5F, 3.5F, -1F, 1, 1, 2, 0F,-0.6F, 0F, -0.5F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 49
		gunModel[63].setRotationPoint(0F, 0F, 0F);
		gunModel[63].rotateAngleX = 0.78539816F;

		gunModel[64].addShapeBox(12.5F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Box 50
		gunModel[64].setRotationPoint(0F, 0F, 0F);
		gunModel[64].rotateAngleX = 0.78539816F;

		gunModel[65].addShapeBox(13.5F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, 0F); // Box 51
		gunModel[65].setRotationPoint(0F, 0F, 0F);
		gunModel[65].rotateAngleX = 0.78539816F;

		gunModel[66].addShapeBox(12.5F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -0.5F, -.6F, 0F, -0.5F, .3F, 0F, -.2F); // Box 52
		gunModel[66].setRotationPoint(0F, 0F, 0F);
		gunModel[66].rotateAngleX = 0.78539816F;

		gunModel[67].addShapeBox(11.5F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.2F, -0.5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, -.2F, -0.5F); // Box 53
		gunModel[67].setRotationPoint(0F, 0F, 0F);
		gunModel[67].rotateAngleX = 0.78539816F;

		gunModel[68].addShapeBox(11F, 2.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 54
		gunModel[68].setRotationPoint(0F, 0F, 0F);
		gunModel[68].rotateAngleX = 0.78539816F;

		gunModel[69].addShapeBox(11F, 3.5F, -1F, 1, 1, 2, 0F,-0.3F, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 55
		gunModel[69].setRotationPoint(0F, 0F, 0F);
		gunModel[69].rotateAngleX = 0.78539816F;

		gunModel[70].addShapeBox(10F, 3.5F, -1F, 1, 1, 2, 0F,-0.6F, 0F, -0.5F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 56
		gunModel[70].setRotationPoint(0F, 0F, 0F);
		gunModel[70].rotateAngleX = 0.78539816F;

		gunModel[71].addShapeBox(10F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Box 57
		gunModel[71].setRotationPoint(0F, 0F, 0F);
		gunModel[71].rotateAngleX = 0.78539816F;

		gunModel[72].addShapeBox(11F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, 0F); // Box 58
		gunModel[72].setRotationPoint(0F, 0F, 0F);
		gunModel[72].rotateAngleX = 0.78539816F;

		gunModel[73].addShapeBox(10F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -0.5F, -.6F, 0F, -0.5F, .3F, 0F, -.2F); // Box 59
		gunModel[73].setRotationPoint(0F, 0F, 0F);
		gunModel[73].rotateAngleX = 0.78539816F;

		gunModel[74].addShapeBox(9F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.2F, -0.5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, -.2F, -0.5F); // Box 60
		gunModel[74].setRotationPoint(0F, 0F, 0F);
		gunModel[74].rotateAngleX = 0.78539816F;

		gunModel[75].addShapeBox(6F, 2.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 61
		gunModel[75].setRotationPoint(0F, 0F, 0F);
		gunModel[75].rotateAngleX = 0.78539816F;

		gunModel[76].addShapeBox(6F, 3.5F, -1F, 1, 1, 2, 0F,-0.3F, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 62
		gunModel[76].setRotationPoint(0F, 0F, 0F);
		gunModel[76].rotateAngleX = 0.78539816F;

		gunModel[77].addShapeBox(5F, 3.5F, -1F, 1, 1, 2, 0F,-0.6F, 0F, -0.5F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 63
		gunModel[77].setRotationPoint(0F, 0F, 0F);
		gunModel[77].rotateAngleX = 0.78539816F;

		gunModel[78].addShapeBox(5F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Box 64
		gunModel[78].setRotationPoint(0F, 0F, 0F);
		gunModel[78].rotateAngleX = 0.78539816F;

		gunModel[79].addShapeBox(6F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, 0F); // Box 65
		gunModel[79].setRotationPoint(0F, 0F, 0F);
		gunModel[79].rotateAngleX = 0.78539816F;

		gunModel[80].addShapeBox(5F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -0.5F, -.6F, 0F, -0.5F, .3F, 0F, -.2F); // Box 66
		gunModel[80].setRotationPoint(0F, 0F, 0F);
		gunModel[80].rotateAngleX = 0.78539816F;

		gunModel[81].addShapeBox(4F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.2F, -0.5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, -.2F, -0.5F); // Box 67
		gunModel[81].setRotationPoint(0F, 0F, 0F);
		gunModel[81].rotateAngleX = 0.78539816F;

		gunModel[82].addShapeBox(8.5F, 2.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 68
		gunModel[82].setRotationPoint(0F, 0F, 0F);
		gunModel[82].rotateAngleX = 0.78539816F;

		gunModel[83].addShapeBox(8.5F, 3.5F, -1F, 1, 1, 2, 0F,-0.3F, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 69
		gunModel[83].setRotationPoint(0F, 0F, 0F);
		gunModel[83].rotateAngleX = 0.78539816F;

		gunModel[84].addShapeBox(7.5F, 3.5F, -1F, 1, 1, 2, 0F,-0.6F, 0F, -0.5F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 70
		gunModel[84].setRotationPoint(0F, 0F, 0F);
		gunModel[84].rotateAngleX = 0.78539816F;

		gunModel[85].addShapeBox(7.5F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Box 71
		gunModel[85].setRotationPoint(0F, 0F, 0F);
		gunModel[85].rotateAngleX = 0.78539816F;

		gunModel[86].addShapeBox(8.5F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, 0F); // Box 72
		gunModel[86].setRotationPoint(0F, 0F, 0F);
		gunModel[86].rotateAngleX = 0.78539816F;

		gunModel[87].addShapeBox(7.5F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -0.5F, -.6F, 0F, -0.5F, .3F, 0F, -.2F); // Box 73
		gunModel[87].setRotationPoint(0F, 0F, 0F);
		gunModel[87].rotateAngleX = 0.78539816F;

		gunModel[88].addShapeBox(6.5F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.2F, -0.5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, -.2F, -0.5F); // Box 74
		gunModel[88].setRotationPoint(0F, 0F, 0F);
		gunModel[88].rotateAngleX = 0.78539816F;

		gunModel[89].addShapeBox(1F, 2.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 75
		gunModel[89].setRotationPoint(0F, 0F, 0F);
		gunModel[89].rotateAngleX = 0.78539816F;

		gunModel[90].addShapeBox(1F, 3.5F, -1F, 1, 1, 2, 0F,-0.3F, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 76
		gunModel[90].setRotationPoint(0F, 0F, 0F);
		gunModel[90].rotateAngleX = 0.78539816F;

		gunModel[91].addShapeBox(0F, 3.5F, -1F, 1, 1, 2, 0F,-0.6F, 0F, -0.5F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 77
		gunModel[91].setRotationPoint(0F, 0F, 0F);
		gunModel[91].rotateAngleX = 0.78539816F;

		gunModel[92].addShapeBox(0F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Box 78
		gunModel[92].setRotationPoint(0F, 0F, 0F);
		gunModel[92].rotateAngleX = 0.78539816F;

		gunModel[93].addShapeBox(1F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, 0F); // Box 79
		gunModel[93].setRotationPoint(0F, 0F, 0F);
		gunModel[93].rotateAngleX = 0.78539816F;

		gunModel[94].addShapeBox(0F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -0.5F, -.6F, 0F, -0.5F, .3F, 0F, -.2F); // Box 80
		gunModel[94].setRotationPoint(0F, 0F, 0F);
		gunModel[94].rotateAngleX = 0.78539816F;

		gunModel[95].addShapeBox(-1F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.2F, -0.5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, -.2F, -0.5F); // Box 81
		gunModel[95].setRotationPoint(0F, 0F, 0F);
		gunModel[95].rotateAngleX = 0.78539816F;

		gunModel[96].addShapeBox(1.5F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.2F, -0.5F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, -.2F, -0.5F); // Box 82
		gunModel[96].setRotationPoint(0F, 0F, 0F);
		gunModel[96].rotateAngleX = 0.78539816F;

		gunModel[97].addShapeBox(2.5F, 8.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, .3F, 0F, -.2F, -.6F, 0F, -0.5F, -.6F, 0F, -0.5F, .3F, 0F, -.2F); // Box 83
		gunModel[97].setRotationPoint(0F, 0F, 0F);
		gunModel[97].rotateAngleX = 0.78539816F;

		gunModel[98].addShapeBox(3.5F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 1F, 0F, 0F); // Box 84
		gunModel[98].setRotationPoint(0F, 0F, 0F);
		gunModel[98].rotateAngleX = 0.78539816F;

		gunModel[99].addShapeBox(2.5F, 4.5F, -1F, 1, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -0.5F); // Box 85
		gunModel[99].setRotationPoint(0F, 0F, 0F);
		gunModel[99].rotateAngleX = 0.78539816F;

		gunModel[100].addShapeBox(2.5F, 3.5F, -1F, 1, 1, 2, 0F,-0.6F, 0F, -0.5F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 86
		gunModel[100].setRotationPoint(0F, 0F, 0F);
		gunModel[100].rotateAngleX = 0.78539816F;

		gunModel[101].addShapeBox(3.5F, 3.5F, -1F, 1, 1, 2, 0F,-0.3F, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.3F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 87
		gunModel[101].setRotationPoint(0F, 0F, 0F);
		gunModel[101].rotateAngleX = 0.78539816F;

		gunModel[102].addShapeBox(3.5F, 2.5F, -0.5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 88
		gunModel[102].setRotationPoint(0F, 0F, 0F);
		gunModel[102].rotateAngleX = 0.78539816F;

		gunModel[103].addShapeBox(-8F, -3F, -3F, 1, 2, 6, 0F,0F, -.5F, -1.9F, 0F, .2F, -1.9F, 0F, .2F, -1.9F, 0F, -.5F, -1.9F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.5F); // Box 89
		gunModel[103].setRotationPoint(0F, 0F, 0F);

		gunModel[104].addShapeBox(-8F, -1F, -3F, 1, 2, 6, 0F,0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.5F); // Box 90
		gunModel[104].setRotationPoint(0F, 0F, 0F);

		gunModel[105].addShapeBox(-13.5F, -11F, 1.5F, 1, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 92
		gunModel[105].setRotationPoint(0F, 0F, 0F);

		gunModel[106].addShapeBox(-12.5F, -11F, 1.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 93
		gunModel[106].setRotationPoint(0F, 0F, 0F);

		gunModel[107].addShapeBox(-15.5F, -11F, 1.5F, 1, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 94
		gunModel[107].setRotationPoint(0F, 0F, 0F);

		gunModel[108].addShapeBox(-14.5F, -11F, 1.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 95
		gunModel[108].setRotationPoint(0F, 0F, 0F);

		gunModel[109].addShapeBox(-17.5F, -11F, 1.5F, 1, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 96
		gunModel[109].setRotationPoint(0F, 0F, 0F);

		gunModel[110].addShapeBox(-16.5F, -11F, 1.5F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 97
		gunModel[110].setRotationPoint(0F, 0F, 0F);

		gunModel[111].addShapeBox(-8F, 1F, -3F, 1, 2, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0F, -0.5F, -1.9F, 0F, 0.2F, -1.9F, 0F, 0.2F, -1.9F, 0F, -0.5F, -1.9F); // Box 98
		gunModel[111].setRotationPoint(0F, 0F, 0F);
	}
}