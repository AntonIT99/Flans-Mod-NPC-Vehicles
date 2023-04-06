//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PrawnARCRepeater
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

public class ModelARCrepeater extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelARCrepeater() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[120];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 2, 44, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 26, 59, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 2, 33, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 2, 49, textureX, textureY); // Box 1
		gunModel[4] = new ModelRendererTurbo(this, 2, 54, textureX, textureY); // Box 2
		gunModel[5] = new ModelRendererTurbo(this, 36, 43, textureX, textureY); // Box 4
		gunModel[6] = new ModelRendererTurbo(this, 2, 59, textureX, textureY); // Box 5
		gunModel[7] = new ModelRendererTurbo(this, 23, 69, textureX, textureY); // Box 6
		gunModel[8] = new ModelRendererTurbo(this, 20, 56, textureX, textureY); // Box 7
		gunModel[9] = new ModelRendererTurbo(this, 2, 68, textureX, textureY); // Box 8
		gunModel[10] = new ModelRendererTurbo(this, 2, 72, textureX, textureY); // Box 9
		gunModel[11] = new ModelRendererTurbo(this, 2, 65, textureX, textureY); // Box 10
		gunModel[12] = new ModelRendererTurbo(this, 42, 49, textureX, textureY); // Box 11
		gunModel[13] = new ModelRendererTurbo(this, 42, 49, textureX, textureY); // Box 12
		gunModel[14] = new ModelRendererTurbo(this, 37, 49, textureX, textureY); // Box 13
		gunModel[15] = new ModelRendererTurbo(this, 42, 49, textureX, textureY); // Box 14
		gunModel[16] = new ModelRendererTurbo(this, 31, 46, textureX, textureY); // Box 15
		gunModel[17] = new ModelRendererTurbo(this, 31, 49, textureX, textureY); // Box 16
		gunModel[18] = new ModelRendererTurbo(this, 42, 56, textureX, textureY); // Box 17
		gunModel[19] = new ModelRendererTurbo(this, 52, 55, textureX, textureY); // Box 18
		gunModel[20] = new ModelRendererTurbo(this, 52, 52, textureX, textureY); // Box 19
		gunModel[21] = new ModelRendererTurbo(this, 52, 49, textureX, textureY); // Box 20
		gunModel[22] = new ModelRendererTurbo(this, 37, 52, textureX, textureY); // Box 21
		gunModel[23] = new ModelRendererTurbo(this, 37, 49, textureX, textureY); // Box 22
		gunModel[24] = new ModelRendererTurbo(this, 32, 40, textureX, textureY); // Box 23
		gunModel[25] = new ModelRendererTurbo(this, 2, 39, textureX, textureY); // Box 25
		gunModel[26] = new ModelRendererTurbo(this, 52, 58, textureX, textureY); // Box 26
		gunModel[27] = new ModelRendererTurbo(this, 23, 64, textureX, textureY); // Box 27
		gunModel[28] = new ModelRendererTurbo(this, 13, 65, textureX, textureY); // Box 28
		gunModel[29] = new ModelRendererTurbo(this, 23, 64, textureX, textureY); // Box 30
		gunModel[30] = new ModelRendererTurbo(this, 45, 64, textureX, textureY); // Box 31
		gunModel[31] = new ModelRendererTurbo(this, 45, 69, textureX, textureY); // Box 32
		gunModel[32] = new ModelRendererTurbo(this, 45, 64, textureX, textureY); // Box 33
		gunModel[33] = new ModelRendererTurbo(this, 45, 64, textureX, textureY); // Box 34
		gunModel[34] = new ModelRendererTurbo(this, 45, 69, textureX, textureY); // Box 35
		gunModel[35] = new ModelRendererTurbo(this, 45, 64, textureX, textureY); // Box 36
		gunModel[36] = new ModelRendererTurbo(this, 20, 53, textureX, textureY); // Box 37
		gunModel[37] = new ModelRendererTurbo(this, 36, 43, textureX, textureY); // Box 38
		gunModel[38] = new ModelRendererTurbo(this, 20, 59, textureX, textureY); // Box 39
		gunModel[39] = new ModelRendererTurbo(this, 20, 59, textureX, textureY); // Box 40
		gunModel[40] = new ModelRendererTurbo(this, 20, 59, textureX, textureY); // Box 41
		gunModel[41] = new ModelRendererTurbo(this, 20, 59, textureX, textureY); // Box 42
		gunModel[42] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 43
		gunModel[43] = new ModelRendererTurbo(this, 36, 59, textureX, textureY); // Box 44
		gunModel[44] = new ModelRendererTurbo(this, 36, 59, textureX, textureY); // Box 45
		gunModel[45] = new ModelRendererTurbo(this, 31, 59, textureX, textureY); // Box 46
		gunModel[46] = new ModelRendererTurbo(this, 31, 59, textureX, textureY); // Box 48
		gunModel[47] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 49
		gunModel[48] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 50
		gunModel[49] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 51
		gunModel[50] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 52
		gunModel[51] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 53
		gunModel[52] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 54
		gunModel[53] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 55
		gunModel[54] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 56
		gunModel[55] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 57
		gunModel[56] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 58
		gunModel[57] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 59
		gunModel[58] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 60
		gunModel[59] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 61
		gunModel[60] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 62
		gunModel[61] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 63
		gunModel[62] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 64
		gunModel[63] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 65
		gunModel[64] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 66
		gunModel[65] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 67
		gunModel[66] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 68
		gunModel[67] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 69
		gunModel[68] = new ModelRendererTurbo(this, 26, 52, textureX, textureY); // Box 70
		gunModel[69] = new ModelRendererTurbo(this, 31, 52, textureX, textureY); // Box 71
		gunModel[70] = new ModelRendererTurbo(this, 51, 94, textureX, textureY); // Box 72
		gunModel[71] = new ModelRendererTurbo(this, 2, 88, textureX, textureY); // Box 73
		gunModel[72] = new ModelRendererTurbo(this, 2, 84, textureX, textureY); // Box 74
		gunModel[73] = new ModelRendererTurbo(this, 2, 80, textureX, textureY); // Box 75
		gunModel[74] = new ModelRendererTurbo(this, 12, 97, textureX, textureY); // Box 76
		gunModel[75] = new ModelRendererTurbo(this, 29, 97, textureX, textureY); // Box 77
		gunModel[76] = new ModelRendererTurbo(this, 40, 97, textureX, textureY); // Box 78
		gunModel[77] = new ModelRendererTurbo(this, 29, 101, textureX, textureY); // Box 79
		gunModel[78] = new ModelRendererTurbo(this, 7, 101, textureX, textureY); // Box 80
		gunModel[79] = new ModelRendererTurbo(this, 37, 101, textureX, textureY); // Box 81
		gunModel[80] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 82
		gunModel[81] = new ModelRendererTurbo(this, 22, 97, textureX, textureY); // Box 83
		gunModel[82] = new ModelRendererTurbo(this, 2, 101, textureX, textureY); // Box 84
		gunModel[83] = new ModelRendererTurbo(this, 30, 92, textureX, textureY); // Box 88
		gunModel[84] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // Box 89
		gunModel[85] = new ModelRendererTurbo(this, 16, 92, textureX, textureY); // Box 90
		gunModel[86] = new ModelRendererTurbo(this, 51, 94, textureX, textureY); // Box 91
		gunModel[87] = new ModelRendererTurbo(this, 51, 79, textureX, textureY); // Box 92
		gunModel[88] = new ModelRendererTurbo(this, 51, 87, textureX, textureY); // Box 93
		gunModel[89] = new ModelRendererTurbo(this, 51, 87, textureX, textureY); // Box 94
		gunModel[90] = new ModelRendererTurbo(this, 51, 83, textureX, textureY); // Box 95
		gunModel[91] = new ModelRendererTurbo(this, 51, 83, textureX, textureY); // Box 96
		gunModel[92] = new ModelRendererTurbo(this, 51, 83, textureX, textureY); // Box 97
		gunModel[93] = new ModelRendererTurbo(this, 51, 83, textureX, textureY); // Box 98
		gunModel[94] = new ModelRendererTurbo(this, 35, 78, textureX, textureY); // Box 99
		gunModel[95] = new ModelRendererTurbo(this, 35, 80, textureX, textureY); // Box 100
		gunModel[96] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 101
		gunModel[97] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 102
		gunModel[98] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 103
		gunModel[99] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 104
		gunModel[100] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 105
		gunModel[101] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 106
		gunModel[102] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 107
		gunModel[103] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 108
		gunModel[104] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 109
		gunModel[105] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 110
		gunModel[106] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 111
		gunModel[107] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 112
		gunModel[108] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 113
		gunModel[109] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 114
		gunModel[110] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 115
		gunModel[111] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 116
		gunModel[112] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 117
		gunModel[113] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 118
		gunModel[114] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 119
		gunModel[115] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 120
		gunModel[116] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 121
		gunModel[117] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 122
		gunModel[118] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 123
		gunModel[119] = new ModelRendererTurbo(this, 41, 80, textureX, textureY); // Box 124

		gunModel[0].addShapeBox(5F, 1F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(0F, -1F, 0F);

		gunModel[1].addShapeBox(5.5F, 5.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .9F, 0F, -.3F, -1.6F, .3F, -.3F, -1.6F, .3F, -.3F, .9F, 0F, -.3F); // Box 2
		gunModel[1].setRotationPoint(0F, -1F, 0F);

		gunModel[2].addShapeBox(5F, 0F, -1.5F, 11, 1, 3, 0F,0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[2].setRotationPoint(0F, -1F, 0F);

		gunModel[3].addShapeBox(5F, 2F, -1F, 11, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[3].setRotationPoint(0F, -1F, 0F);

		gunModel[4].addShapeBox(-1F, 1F, -1F, 6, 2, 2, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 2
		gunModel[4].setRotationPoint(0F, -1F, 0F);

		gunModel[5].addShapeBox(2.1F, 1.5F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[5].setRotationPoint(0F, -1F, 0F);
		gunModel[5].rotateAngleZ = 0.59341195F;

		gunModel[6].addShapeBox(-7F, 5F, -1F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[6].setRotationPoint(0F, -1F, 0F);

		gunModel[7].addShapeBox(-6F, 8F, -1.5F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[7].setRotationPoint(0F, -1F, 0F);

		gunModel[8].addShapeBox(5.5F, 4.5F, -0.5F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[8].setRotationPoint(0F, -1F, 0F);

		gunModel[9].addShapeBox(0F, 4.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 8
		gunModel[9].setRotationPoint(0F, -1F, 0F);

		gunModel[10].addShapeBox(-1F, 5.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -1F, 0F, .3F, -1F, 0F, .3F, 0F, 0F, .3F); // Box 9
		gunModel[10].setRotationPoint(0F, -1F, 0F);

		gunModel[11].addShapeBox(2F, 3.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 10
		gunModel[11].setRotationPoint(0F, -1F, 0F);

		gunModel[12].addShapeBox(-2.5F, 3.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[12].setRotationPoint(0F, -1F, 0F);
		gunModel[12].rotateAngleZ = 0.59341195F;

		gunModel[13].addShapeBox(-2.5F, 0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 12
		gunModel[13].setRotationPoint(0F, -1F, 0F);
		gunModel[13].rotateAngleZ = 0.59341195F;

		gunModel[14].addShapeBox(-2.5F, 0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[14].setRotationPoint(0F, -1F, 0F);
		gunModel[14].rotateAngleZ = 0.59341195F;

		gunModel[15].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 4, 1, 0F,-.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F); // Box 14
		gunModel[15].setRotationPoint(0F, -1F, 0F);
		gunModel[15].rotateAngleZ = 0.59341195F;

		gunModel[16].addShapeBox(16F, -1.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[16].setRotationPoint(0F, -1F, 0F);
		gunModel[16].rotateAngleZ = -0.15707963F;

		gunModel[17].addShapeBox(18F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, .5F, -.3F, -.3F, .5F, -.3F, -.3F, .5F, -.3F, -.3F, .5F, -.3F); // Box 16
		gunModel[17].setRotationPoint(0F, -1F, 0F);
		gunModel[17].rotateAngleZ = -0.15707963F;

		gunModel[18].addShapeBox(-8F, 4.5F, -1.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[18].setRotationPoint(0F, -1F, 0F);

		gunModel[19].addShapeBox(-11F, 3.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[19].setRotationPoint(0F, -1F, 0F);

		gunModel[20].addShapeBox(-11F, 2.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[20].setRotationPoint(0F, -1F, 0F);

		gunModel[21].addShapeBox(-11F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[21].setRotationPoint(0F, -1F, 0F);

		gunModel[22].addShapeBox(-2F, 1F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[22].setRotationPoint(0F, -1F, 0F);
		gunModel[22].rotateAngleZ = 0.59341195F;

		gunModel[23].addShapeBox(-2.5F, 2.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[23].setRotationPoint(0F, -1F, 0F);
		gunModel[23].rotateAngleZ = 0.59341195F;

		gunModel[24].addShapeBox(3F, 0F, -0.5F, 2, 1, 1, 0F,-1F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, -1F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, 0F, .3F); // Box 23
		gunModel[24].setRotationPoint(0F, -1F, 0F);

		gunModel[25].addShapeBox(5F, 1F, -1.5F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 25
		gunModel[25].setRotationPoint(0F, -1F, 0F);

		gunModel[26].addShapeBox(-11F, 4.5F, -0.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		gunModel[26].setRotationPoint(0F, -1F, 0F);

		gunModel[27].addShapeBox(-6F, 7F, -1.5F, 7, 1, 3, 0F,0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		gunModel[27].setRotationPoint(0F, -1F, 0F);

		gunModel[28].addShapeBox(-1F, 6.5F, -1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[28].setRotationPoint(0F, -1F, 0F);

		gunModel[29].addShapeBox(-6F, 9F, -1.5F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 30
		gunModel[29].setRotationPoint(0F, -1F, 0F);

		gunModel[30].addShapeBox(1F, 9F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -0.5F); // Box 31
		gunModel[30].setRotationPoint(0F, -1F, 0F);

		gunModel[31].addShapeBox(1F, 8F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 32
		gunModel[31].setRotationPoint(0F, -1F, 0F);

		gunModel[32].addShapeBox(1F, 7F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 33
		gunModel[32].setRotationPoint(0F, -1F, 0F);

		gunModel[33].addShapeBox(-7F, 7F, -1.5F, 1, 1, 3, 0F,0F, -0.5F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 34
		gunModel[33].setRotationPoint(0F, -1F, 0F);

		gunModel[34].addShapeBox(-7F, 8F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 35
		gunModel[34].setRotationPoint(0F, -1F, 0F);

		gunModel[35].addShapeBox(-7F, 9F, -1.5F, 1, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.7F); // Box 36
		gunModel[35].setRotationPoint(0F, -1F, 0F);

		gunModel[36].addShapeBox(5F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F); // Box 37
		gunModel[36].setRotationPoint(0F, -1F, 0F);

		gunModel[37].addShapeBox(2.1F, 2.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 38
		gunModel[37].setRotationPoint(0F, -1F, 0F);
		gunModel[37].rotateAngleZ = 0.59341195F;

		gunModel[38].addShapeBox(15.5F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F); // Box 39
		gunModel[38].setRotationPoint(0F, -1F, 0F);

		gunModel[39].addShapeBox(15.5F, 4.5F, -0.5F, 1, 1, 1, 0F,-.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.8F, 0F, 0F, -.8F, -.8F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, -.8F, -.8F, 0F); // Box 40
		gunModel[39].setRotationPoint(0F, -1F, 0F);

		gunModel[40].addShapeBox(15.5F, 4.5F, -0.5F, 1, 1, 1, 0F,-0.8F, -0.8F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -.8F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F); // Box 41
		gunModel[40].setRotationPoint(0F, -1F, 0F);

		gunModel[41].addShapeBox(15.5F, 4.5F, -0.5F, 1, 1, 1, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[41].setRotationPoint(0F, -1F, 0F);

		gunModel[42].addShapeBox(7F, 5.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, -.3F, -1.3F, .3F, -.3F, -1.3F, .3F, -.3F, .6F, 0F, -.3F); // Box 43
		gunModel[42].setRotationPoint(0F, -1F, 0F);

		gunModel[43].addShapeBox(6.5F, 4.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 44
		gunModel[43].setRotationPoint(0F, -1F, 0F);
		gunModel[43].rotateAngleZ = -0.43633231F;

		gunModel[44].addShapeBox(7.5F, 4.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 45
		gunModel[44].setRotationPoint(0F, -1F, 0F);
		gunModel[44].rotateAngleZ = -0.43633231F;

		gunModel[45].addShapeBox(7.5F, 3.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 46
		gunModel[45].setRotationPoint(0F, -1F, 0F);
		gunModel[45].rotateAngleZ = -0.43633231F;

		gunModel[46].addShapeBox(6.5F, 3.5F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 48
		gunModel[46].setRotationPoint(0F, -1F, 0F);
		gunModel[46].rotateAngleZ = -0.43633231F;

		gunModel[47].addShapeBox(7F, 4.5F, -1.5F, 1, 1, 1, 0F,.6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[47].setRotationPoint(0F, -1F, 0F);

		gunModel[48].addShapeBox(7F, 3.5F, -0.5F, 1, 1, 1, 0F,0.6F, 0F, -0.3F, -1.3F, 0.3F, -0.3F, -1.3F, 0.3F, -0.3F, 0.6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[48].setRotationPoint(0F, -1F, 0F);

		gunModel[49].addShapeBox(7F, 4.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F); // Box 51
		gunModel[49].setRotationPoint(0F, -1F, 0F);

		gunModel[50].addShapeBox(8.5F, 4.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F); // Box 52
		gunModel[50].setRotationPoint(0F, -1F, 0F);

		gunModel[51].addShapeBox(8.5F, 3.5F, -0.5F, 1, 1, 1, 0F,0.6F, 0F, -0.3F, -1.3F, 0.3F, -0.3F, -1.3F, 0.3F, -0.3F, 0.6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[51].setRotationPoint(0F, -1F, 0F);

		gunModel[52].addShapeBox(8.5F, 5.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, -.3F, -1.3F, .3F, -.3F, -1.3F, .3F, -.3F, .6F, 0F, -.3F); // Box 54
		gunModel[52].setRotationPoint(0F, -1F, 0F);

		gunModel[53].addShapeBox(8.5F, 4.5F, -1.5F, 1, 1, 1, 0F,.6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[53].setRotationPoint(0F, -1F, 0F);

		gunModel[54].addShapeBox(10F, 4.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F); // Box 56
		gunModel[54].setRotationPoint(0F, -1F, 0F);

		gunModel[55].addShapeBox(10F, 3.5F, -0.5F, 1, 1, 1, 0F,0.6F, 0F, -0.3F, -1.3F, 0.3F, -0.3F, -1.3F, 0.3F, -0.3F, 0.6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		gunModel[55].setRotationPoint(0F, -1F, 0F);

		gunModel[56].addShapeBox(10F, 5.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, -.3F, -1.3F, .3F, -.3F, -1.3F, .3F, -.3F, .6F, 0F, -.3F); // Box 58
		gunModel[56].setRotationPoint(0F, -1F, 0F);

		gunModel[57].addShapeBox(10F, 4.5F, -1.5F, 1, 1, 1, 0F,.6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		gunModel[57].setRotationPoint(0F, -1F, 0F);

		gunModel[58].addShapeBox(11.5F, 4.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F); // Box 60
		gunModel[58].setRotationPoint(0F, -1F, 0F);

		gunModel[59].addShapeBox(11.5F, 3.5F, -0.5F, 1, 1, 1, 0F,0.6F, 0F, -0.3F, -1.3F, 0.3F, -0.3F, -1.3F, 0.3F, -0.3F, 0.6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[59].setRotationPoint(0F, -1F, 0F);

		gunModel[60].addShapeBox(11.5F, 5.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, -.3F, -1.3F, .3F, -.3F, -1.3F, .3F, -.3F, .6F, 0F, -.3F); // Box 62
		gunModel[60].setRotationPoint(0F, -1F, 0F);

		gunModel[61].addShapeBox(11.5F, 4.5F, -1.5F, 1, 1, 1, 0F,.6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		gunModel[61].setRotationPoint(0F, -1F, 0F);

		gunModel[62].addShapeBox(13F, 4.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F); // Box 64
		gunModel[62].setRotationPoint(0F, -1F, 0F);

		gunModel[63].addShapeBox(13F, 3.5F, -0.5F, 1, 1, 1, 0F,0.6F, 0F, -0.3F, -1.3F, 0.3F, -0.3F, -1.3F, 0.3F, -0.3F, 0.6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		gunModel[63].setRotationPoint(0F, -1F, 0F);

		gunModel[64].addShapeBox(13F, 5.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, -.3F, -1.3F, .3F, -.3F, -1.3F, .3F, -.3F, .6F, 0F, -.3F); // Box 66
		gunModel[64].setRotationPoint(0F, -1F, 0F);

		gunModel[65].addShapeBox(13F, 4.5F, -1.5F, 1, 1, 1, 0F,.6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		gunModel[65].setRotationPoint(0F, -1F, 0F);

		gunModel[66].addShapeBox(14.5F, 3.5F, -0.5F, 1, 1, 1, 0F,0.6F, 0F, -0.3F, -1.3F, 0.3F, -0.3F, -1.3F, 0.3F, -0.3F, 0.6F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		gunModel[66].setRotationPoint(0F, -1F, 0F);

		gunModel[67].addShapeBox(14.5F, 4.5F, -1.5F, 1, 1, 1, 0F,.6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, -.3F, 0F, -1.3F, -.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[67].setRotationPoint(0F, -1F, 0F);

		gunModel[68].addShapeBox(14.5F, 5.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, -.3F, -1.3F, .3F, -.3F, -1.3F, .3F, -.3F, .6F, 0F, -.3F); // Box 70
		gunModel[68].setRotationPoint(0F, -1F, 0F);

		gunModel[69].addShapeBox(14.5F, 4.5F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -0.3F, 0.3F, 0.6F, -0.3F, 0F); // Box 71
		gunModel[69].setRotationPoint(0F, -1F, 0F);

		gunModel[70].addShapeBox(-5F, 1F, -1F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F); // Box 72
		gunModel[70].setRotationPoint(0F, -1F, 0F);
		gunModel[70].rotateAngleZ = -0.73303829F;

		gunModel[71].addShapeBox(-3F, -3F, -1F, 20, 1, 2, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 73
		gunModel[71].setRotationPoint(0F, -1F, 0F);

		gunModel[72].addShapeBox(-3F, -4F, -1F, 19, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		gunModel[72].setRotationPoint(0F, -1F, 0F);

		gunModel[73].addShapeBox(4F, -5F, -1F, 13, 1, 2, 0F,0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 75
		gunModel[73].setRotationPoint(0F, -1F, 0F);

		gunModel[74].addShapeBox(-10F, -4F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[74].setRotationPoint(0F, -1F, 0F);

		gunModel[75].addShapeBox(-10F, -5F, -1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[75].setRotationPoint(0F, -1F, 0F);

		gunModel[76].addShapeBox(-8F, -6F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[76].setRotationPoint(0F, -1F, 0F);

		gunModel[77].addShapeBox(-8F, -8F, -1F, 1, 2, 2, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		gunModel[77].setRotationPoint(0F, -1F, 0F);

		gunModel[78].addShapeBox(-2.7F, -8F, -0.5F, 1, 3, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		gunModel[78].setRotationPoint(0F, -1F, 0F);

		gunModel[79].addShapeBox(-6F, -8F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[79].setRotationPoint(0F, -1F, 0F);

		gunModel[80].addShapeBox(0F, -6F, -1F, 4, 2, 2, 0F,-2F, .5F, -.2F, 0F, -1F, -.2F, 0F, -1F, -.2F, -2F, .5F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		gunModel[80].setRotationPoint(0F, -1F, 0F);

		gunModel[81].addShapeBox(-11F, -5F, -1F, 1, 3, 2, 0F,0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 83
		gunModel[81].setRotationPoint(0F, -1F, 0F);

		gunModel[82].addShapeBox(-1F, -7F, -0.5F, 1, 3, 1, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[82].setRotationPoint(0F, -1F, 0F);

		gunModel[83].addShapeBox(-8F, -4F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		gunModel[83].setRotationPoint(0F, -1F, 0F);

		gunModel[84].addShapeBox(-8F, -3F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, 0F); // Box 89
		gunModel[84].setRotationPoint(0F, -1F, 0F);

		gunModel[85].addShapeBox(-7F, -3F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 90
		gunModel[85].setRotationPoint(0F, -1F, 0F);

		gunModel[86].addShapeBox(-6F, 1F, -1F, 1, 2, 2, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F); // Box 91
		gunModel[86].setRotationPoint(0F, -1F, 0F);
		gunModel[86].rotateAngleZ = -0.73303829F;

		gunModel[87].addShapeBox(4F, -4F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		gunModel[87].setRotationPoint(0F, -1F, 0F);
		gunModel[87].rotateAngleZ = 0.78539816F;

		gunModel[88].addShapeBox(4.5F, -8F, -1F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 93
		gunModel[88].setRotationPoint(0F, -1F, 0F);
		gunModel[88].rotateAngleZ = 0.78539816F;

		gunModel[89].addShapeBox(3.5F, -8F, -1F, 1, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 94
		gunModel[89].setRotationPoint(0F, -1F, 0F);
		gunModel[89].rotateAngleZ = 0.78539816F;

		gunModel[90].addShapeBox(3.5F, -9F, -1F, 1, 1, 2, 0F,-.4F, 0F, -.7F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.4F, 0F, -.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 95
		gunModel[90].setRotationPoint(0F, -1F, 0F);
		gunModel[90].rotateAngleZ = 0.78539816F;

		gunModel[91].addShapeBox(4.5F, -9F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 96
		gunModel[91].setRotationPoint(0F, -1F, 0F);
		gunModel[91].rotateAngleZ = 0.78539816F;

		gunModel[92].addShapeBox(4.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.7F, -0.4F, 0F, -0.7F, 0F, 0F, -0.5F); // Box 97
		gunModel[92].setRotationPoint(0F, -1F, 0F);
		gunModel[92].rotateAngleZ = 0.78539816F;

		gunModel[93].addShapeBox(3.5F, -5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.7F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.4F, 0F, -0.7F); // Box 98
		gunModel[93].setRotationPoint(0F, -1F, 0F);
		gunModel[93].rotateAngleZ = 0.78539816F;

		gunModel[94].addShapeBox(10F, -14.2F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[94].setRotationPoint(0F, -1F, 0F);
		gunModel[94].rotateAngleZ = -0.78539816F;

		gunModel[95].addShapeBox(12F, -14.2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.2F, -.2F, -.5F, -.2F, -.2F, 0F, 0F, 0F); // Box 100
		gunModel[95].setRotationPoint(0F, -1F, 0F);
		gunModel[95].rotateAngleZ = -0.78539816F;

		gunModel[96].addShapeBox(14.5F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 101
		gunModel[96].setRotationPoint(0F, -1F, 0F);

		gunModel[97].addShapeBox(13F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 102
		gunModel[97].setRotationPoint(0F, -1F, 0F);

		gunModel[98].addShapeBox(10F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 103
		gunModel[98].setRotationPoint(0F, -1F, 0F);

		gunModel[99].addShapeBox(11.5F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 104
		gunModel[99].setRotationPoint(0F, -1F, 0F);

		gunModel[100].addShapeBox(4F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 105
		gunModel[100].setRotationPoint(0F, -1F, 0F);

		gunModel[101].addShapeBox(5.5F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 106
		gunModel[101].setRotationPoint(0F, -1F, 0F);

		gunModel[102].addShapeBox(7F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 107
		gunModel[102].setRotationPoint(0F, -1F, 0F);

		gunModel[103].addShapeBox(8.5F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 108
		gunModel[103].setRotationPoint(0F, -1F, 0F);

		gunModel[104].addShapeBox(-2F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 109
		gunModel[104].setRotationPoint(0F, -1F, 0F);

		gunModel[105].addShapeBox(-0.5F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 110
		gunModel[105].setRotationPoint(0F, -1F, 0F);

		gunModel[106].addShapeBox(1F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 111
		gunModel[106].setRotationPoint(0F, -1F, 0F);

		gunModel[107].addShapeBox(2.5F, -3F, 0.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.3F, -1F, 0F, 1F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 1F, 0F, 1F, 1F, -.5F); // Box 112
		gunModel[107].setRotationPoint(0F, -1F, 0F);

		gunModel[108].addShapeBox(-2F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		gunModel[108].setRotationPoint(0F, -1F, 0F);

		gunModel[109].addShapeBox(-0.5F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		gunModel[109].setRotationPoint(0F, -1F, 0F);

		gunModel[110].addShapeBox(1F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		gunModel[110].setRotationPoint(0F, -1F, 0F);

		gunModel[111].addShapeBox(2.5F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		gunModel[111].setRotationPoint(0F, -1F, 0F);

		gunModel[112].addShapeBox(4F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		gunModel[112].setRotationPoint(0F, -1F, 0F);

		gunModel[113].addShapeBox(5.5F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		gunModel[113].setRotationPoint(0F, -1F, 0F);

		gunModel[114].addShapeBox(7F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[114].setRotationPoint(0F, -1F, 0F);

		gunModel[115].addShapeBox(8.5F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[115].setRotationPoint(0F, -1F, 0F);

		gunModel[116].addShapeBox(10F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		gunModel[116].setRotationPoint(0F, -1F, 0F);

		gunModel[117].addShapeBox(11.5F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		gunModel[117].setRotationPoint(0F, -1F, 0F);

		gunModel[118].addShapeBox(13F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		gunModel[118].setRotationPoint(0F, -1F, 0F);

		gunModel[119].addShapeBox(14.5F, -3F, -2.5F, 1, 1, 2, 0F,1F, -1F, -0.5F, -1.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -0.5F, -1.3F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		gunModel[119].setRotationPoint(0F, -1F, 0F);
	}
}