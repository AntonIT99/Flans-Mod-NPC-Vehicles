//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGAU901 extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelGAU901() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[118];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 56, 20, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 8, 29, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 75, 22, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 7, 52, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 67, 53, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 116, 53, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 103, 68, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 131, 68, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 107, 118, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 7, 80, textureX, textureY); // Box 9
		gunModel[10] = new ModelRendererTurbo(this, 107, 127, textureX, textureY); // Box 10
		gunModel[11] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 11
		gunModel[12] = new ModelRendererTurbo(this, 167, 115, textureX, textureY); // Box 12
		gunModel[13] = new ModelRendererTurbo(this, 7, 91, textureX, textureY); // Box 14
		gunModel[14] = new ModelRendererTurbo(this, 140, 35, textureX, textureY); // Box 15
		gunModel[15] = new ModelRendererTurbo(this, 67, 30, textureX, textureY); // Box 16
		gunModel[16] = new ModelRendererTurbo(this, 8, 69, textureX, textureY); // Box 17
		gunModel[17] = new ModelRendererTurbo(this, 2, 65, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 2, 69, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 8, 73, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 46, 69, textureX, textureY); // Box 22
		gunModel[21] = new ModelRendererTurbo(this, 46, 69, textureX, textureY); // Box 23
		gunModel[22] = new ModelRendererTurbo(this, 46, 69, textureX, textureY); // Box 24
		gunModel[23] = new ModelRendererTurbo(this, 46, 69, textureX, textureY); // Box 25
		gunModel[24] = new ModelRendererTurbo(this, 96, 33, textureX, textureY); // Box 26
		gunModel[25] = new ModelRendererTurbo(this, 141, 39, textureX, textureY); // Box 27
		gunModel[26] = new ModelRendererTurbo(this, 142, 45, textureX, textureY); // Box 28
		gunModel[27] = new ModelRendererTurbo(this, 147, 43, textureX, textureY); // Box 30
		gunModel[28] = new ModelRendererTurbo(this, 46, 69, textureX, textureY); // Box 31
		gunModel[29] = new ModelRendererTurbo(this, 68, 118, textureX, textureY); // Box 32
		gunModel[30] = new ModelRendererTurbo(this, 7, 103, textureX, textureY); // Box 33
		gunModel[31] = new ModelRendererTurbo(this, 84, 80, textureX, textureY); // Box 34
		gunModel[32] = new ModelRendererTurbo(this, 84, 91, textureX, textureY); // Box 35
		gunModel[33] = new ModelRendererTurbo(this, 117, 91, textureX, textureY); // Box 36
		gunModel[34] = new ModelRendererTurbo(this, 117, 80, textureX, textureY); // Box 37
		gunModel[35] = new ModelRendererTurbo(this, 142, 80, textureX, textureY); // Box 38
		gunModel[36] = new ModelRendererTurbo(this, 167, 127, textureX, textureY); // Box 39
		gunModel[37] = new ModelRendererTurbo(this, 167, 127, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 167, 115, textureX, textureY); // Box 41
		gunModel[39] = new ModelRendererTurbo(this, 167, 127, textureX, textureY); // Box 42
		gunModel[40] = new ModelRendererTurbo(this, 167, 115, textureX, textureY); // Box 43
		gunModel[41] = new ModelRendererTurbo(this, 167, 127, textureX, textureY); // Box 44
		gunModel[42] = new ModelRendererTurbo(this, 167, 115, textureX, textureY); // Box 45
		gunModel[43] = new ModelRendererTurbo(this, 7, 125, textureX, textureY); // Box 46
		gunModel[44] = new ModelRendererTurbo(this, 7, 142, textureX, textureY); // Box 47
		gunModel[45] = new ModelRendererTurbo(this, 39, 122, textureX, textureY); // Box 48
		gunModel[46] = new ModelRendererTurbo(this, 7, 117, textureX, textureY); // Box 49
		gunModel[47] = new ModelRendererTurbo(this, 7, 117, textureX, textureY); // Box 50
		gunModel[48] = new ModelRendererTurbo(this, 39, 140, textureX, textureY); // Box 51
		gunModel[49] = new ModelRendererTurbo(this, 68, 123, textureX, textureY); // Box 55
		gunModel[50] = new ModelRendererTurbo(this, 7, 157, textureX, textureY); // Box 60
		gunModel[51] = new ModelRendererTurbo(this, 7, 125, textureX, textureY); // Box 61
		gunModel[52] = new ModelRendererTurbo(this, 84, 103, textureX, textureY); // Box 62
		gunModel[53] = new ModelRendererTurbo(this, 117, 103, textureX, textureY); // Box 63
		gunModel[54] = new ModelRendererTurbo(this, 39, 150, textureX, textureY); // Box 66
		gunModel[55] = new ModelRendererTurbo(this, 39, 150, textureX, textureY); // Box 67
		gunModel[56] = new ModelRendererTurbo(this, 39, 140, textureX, textureY); // Box 68
		gunModel[57] = new ModelRendererTurbo(this, 43, 154, textureX, textureY); // Box 69
		gunModel[58] = new ModelRendererTurbo(this, 142, 80, textureX, textureY); // Box 70
		gunModel[59] = new ModelRendererTurbo(this, 142, 80, textureX, textureY); // Box 71
		gunModel[60] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 72
		gunModel[61] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 73
		gunModel[62] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 75
		gunModel[63] = new ModelRendererTurbo(this, 68, 130, textureX, textureY); // Box 76
		gunModel[64] = new ModelRendererTurbo(this, 69, 154, textureX, textureY); // Box 77
		gunModel[65] = new ModelRendererTurbo(this, 69, 140, textureX, textureY); // Box 78
		gunModel[66] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 79
		gunModel[67] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 83
		gunModel[68] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 84
		gunModel[69] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 85
		gunModel[70] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 87
		gunModel[71] = new ModelRendererTurbo(this, 69, 147, textureX, textureY); // Box 88
		gunModel[72] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 89
		gunModel[73] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 90
		gunModel[74] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 91
		gunModel[75] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 92
		gunModel[76] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 93
		gunModel[77] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 94
		gunModel[78] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 95
		gunModel[79] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 96
		gunModel[80] = new ModelRendererTurbo(this, 87, 124, textureX, textureY); // Box 97
		gunModel[81] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 98
		gunModel[82] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 99
		gunModel[83] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 100
		gunModel[84] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 101
		gunModel[85] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 102
		gunModel[86] = new ModelRendererTurbo(this, 86, 122, textureX, textureY); // Box 103
		gunModel[87] = new ModelRendererTurbo(this, 162, 105, textureX, textureY); // Box 104
		gunModel[88] = new ModelRendererTurbo(this, 162, 105, textureX, textureY); // Box 105
		gunModel[89] = new ModelRendererTurbo(this, 162, 105, textureX, textureY); // Box 106
		gunModel[90] = new ModelRendererTurbo(this, 162, 105, textureX, textureY); // Box 107
		gunModel[91] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 108
		gunModel[92] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 109
		gunModel[93] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 110
		gunModel[94] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 111
		gunModel[95] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 112
		gunModel[96] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 113
		gunModel[97] = new ModelRendererTurbo(this, 140, 35, textureX, textureY); // Box 114
		gunModel[98] = new ModelRendererTurbo(this, 141, 39, textureX, textureY); // Box 115
		gunModel[99] = new ModelRendererTurbo(this, 142, 45, textureX, textureY); // Box 116
		gunModel[100] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 117
		gunModel[101] = new ModelRendererTurbo(this, 123, 33, textureX, textureY); // Box 118
		gunModel[102] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 119
		gunModel[103] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 120
		gunModel[104] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 121
		gunModel[105] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 122
		gunModel[106] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 123
		gunModel[107] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 124
		gunModel[108] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 125
		gunModel[109] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 127
		gunModel[110] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 128
		gunModel[111] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 129
		gunModel[112] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 130
		gunModel[113] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 131
		gunModel[114] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 133
		gunModel[115] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 134
		gunModel[116] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 135
		gunModel[117] = new ModelRendererTurbo(this, 107, 139, textureX, textureY); // Box 136

		gunModel[0].addShapeBox(-1F, -7F, -1.5F, 4, 13, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(-16F, -19F, -5F, 17, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(-4F, 6F, -1.5F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, -1F, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(-16F, -9F, -5F, 20, 2, 10, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, .5F); // Box 3
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(-23F, -18.5F, -4.5F, 7, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(3F, -12F, -2F, 23, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(6F, -7F, -2F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 6
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(15F, -7F, -2F, 11, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 7
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(26F, -12F, -2F, 25, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(3F, -18.5F, -3F, 30, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(26F, -8F, -2F, 25, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(51F, -12F, -2F, 1, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(26F, -11F, -2F, 1, 3, 4, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(3F, -16.5F, -3F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(7F, -12F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F); // Box 15
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(1F, -19F, -5F, 2, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(-12F, -17F, -6F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(-12F, -14F, -6F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(-12F, -16F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(-2F, -16F, -6F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(-15F, -11.5F, -6F, 2, 1, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(7.5F, -7.5F, -3F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(7.5F, -8.5F, -3F, 3, 1, 6, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addShapeBox(-15F, -10.5F, -6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 25
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(-24F, -18.5F, -4.5F, 1, 11, 9, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 26
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(7F, -15F, -4F, 4, 3, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 27
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(9F, -19F, -4F, 4, 4, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(12F, -20F, -4F, 4, 1, 8, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(7.5F, -6.5F, -3F, 3, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 31
		gunModel[28].setRotationPoint(0F, 0F, 0F);

		gunModel[29].addShapeBox(17F, -12F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		gunModel[29].setRotationPoint(0F, 0F, 0F);

		gunModel[30].addShapeBox(3F, -14.5F, -3F, 30, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 33
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(33F, -18.5F, -3F, 9, 2, 6, 0F,0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 34
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(33F, -16.5F, -3F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 35
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(42F, -16.5F, -2F, 5, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		gunModel[33].setRotationPoint(0F, 0F, 0F);

		gunModel[34].addShapeBox(42F, -17.5F, -2F, 5, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		gunModel[34].setRotationPoint(0F, 0F, 0F);

		gunModel[35].addShapeBox(42F, -7F, -1.5F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		gunModel[35].setRotationPoint(0F, 0F, 0F);

		gunModel[36].addShapeBox(32F, -11F, -2F, 1, 3, 4, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[36].setRotationPoint(0F, 0F, 0F);

		gunModel[37].addShapeBox(38F, -11F, -2F, 1, 3, 4, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		gunModel[37].setRotationPoint(0F, 0F, 0F);

		gunModel[38].addShapeBox(32F, -11F, -2F, 1, 3, 4, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		gunModel[38].setRotationPoint(0F, 0F, 0F);

		gunModel[39].addShapeBox(44F, -11F, -2F, 1, 3, 4, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		gunModel[39].setRotationPoint(0F, 0F, 0F);

		gunModel[40].addShapeBox(38F, -11F, -2F, 1, 3, 4, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		gunModel[40].setRotationPoint(0F, 0F, 0F);

		gunModel[41].addShapeBox(50F, -11F, -2F, 1, 3, 4, 0F,3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		gunModel[41].setRotationPoint(0F, 0F, 0F);

		gunModel[42].addShapeBox(44F, -11F, -2F, 1, 3, 4, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		gunModel[42].setRotationPoint(0F, 0F, 0F);

		gunModel[43].addShapeBox(47F, -17.5F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		gunModel[43].setRotationPoint(0F, 0F, 0F);

		gunModel[44].addShapeBox(48F, -18F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 47
		gunModel[44].setRotationPoint(0F, 0F, 0F);

		gunModel[45].addShapeBox(51F, -18.5F, -5F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F); // Box 48
		gunModel[45].setRotationPoint(0F, 0F, 0F);

		gunModel[46].addShapeBox(47F, -16.5F, -5F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		gunModel[46].setRotationPoint(0F, 0F, 0F);

		gunModel[47].addShapeBox(47F, -16.5F, 1F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		gunModel[47].setRotationPoint(0F, 0F, 0F);

		gunModel[48].addShapeBox(51F, -16.5F, -5F, 1, 1, 4, 0F,0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 51
		gunModel[48].setRotationPoint(0F, 0F, 0F);

		gunModel[49].addShapeBox(17F, -14F, -3F, 4, 3, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		gunModel[49].setRotationPoint(0F, 0F, 0F);

		gunModel[50].addShapeBox(48F, -14F, -5F, 3, 1, 10, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 60
		gunModel[50].setRotationPoint(0F, 0F, 0F);

		gunModel[51].addShapeBox(47F, -14.5F, -5F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 61
		gunModel[51].setRotationPoint(0F, 0F, 0F);

		gunModel[52].addShapeBox(33F, -14.5F, -3F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F); // Box 62
		gunModel[52].setRotationPoint(0F, 0F, 0F);

		gunModel[53].addShapeBox(42F, -14.5F, -2F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 63
		gunModel[53].setRotationPoint(0F, 0F, 0F);

		gunModel[54].addShapeBox(51F, -16.5F, 1F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		gunModel[54].setRotationPoint(0F, 0F, 0F);

		gunModel[55].addShapeBox(51F, -15.5F, 1F, 1, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 67
		gunModel[55].setRotationPoint(0F, 0F, 0F);

		gunModel[56].addShapeBox(51F, -15.5F, -5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 68
		gunModel[56].setRotationPoint(0F, 0F, 0F);

		gunModel[57].addShapeBox(51F, -14.5F, -5F, 1, 2, 10, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		gunModel[57].setRotationPoint(0F, 0F, 0F);

		gunModel[58].addShapeBox(52F, -7F, -1.5F, 5, 2, 3, 0F,0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, -1F); // Box 70
		gunModel[58].setRotationPoint(0F, 0F, 0F);

		gunModel[59].addShapeBox(52F, -8F, -1.5F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 71
		gunModel[59].setRotationPoint(0F, 0F, 0F);

		gunModel[60].addShapeBox(59F, -8F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, .5F, 0F, -.5F, .5F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 72
		gunModel[60].setRotationPoint(0F, 0F, 0F);

		gunModel[61].addShapeBox(42F, -5F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, -.5F, 0F, 0F, -.5F); // Box 73
		gunModel[61].setRotationPoint(0F, 0F, 0F);

		gunModel[62].addShapeBox(52F, -5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F); // Box 75
		gunModel[62].setRotationPoint(0F, 0F, 0F);

		gunModel[63].addShapeBox(17F, -18F, -5F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		gunModel[63].setRotationPoint(0F, 0F, 0F);

		gunModel[64].addShapeBox(16.5F, -23F, -5F, 4, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		gunModel[64].setRotationPoint(0F, 0F, 0F);

		gunModel[65].addShapeBox(16.5F, -20F, -5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		gunModel[65].setRotationPoint(0F, 0F, 0F);

		gunModel[66].addShapeBox(20.5F, -23F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F); // Box 79
		gunModel[66].setRotationPoint(0F, 0F, 0F);

		gunModel[67].addShapeBox(20.5F, -22.5F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		gunModel[67].setRotationPoint(0F, 0F, 0F);

		gunModel[68].addShapeBox(20.5F, -23F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[68].setRotationPoint(0F, 0F, 0F);

		gunModel[69].addShapeBox(20.5F, -23F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F); // Box 85
		gunModel[69].setRotationPoint(0F, 0F, 0F);

		gunModel[70].addShapeBox(20.5F, -21F, -5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		gunModel[70].setRotationPoint(0F, 0F, 0F);

		gunModel[71].addShapeBox(16.5F, -20F, -3F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 88
		gunModel[71].setRotationPoint(0F, 0F, 0F);

		gunModel[72].addShapeBox(20.5F, -23F, -5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F); // Box 89
		gunModel[72].setRotationPoint(0F, 0F, 0F);

		gunModel[73].addShapeBox(20.5F, -22.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		gunModel[73].setRotationPoint(0F, 0F, 0F);

		gunModel[74].addShapeBox(20.5F, -21F, -2F, 1, 1, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		gunModel[74].setRotationPoint(0F, 0F, 0F);

		gunModel[75].addShapeBox(20.5F, -21.5F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 92
		gunModel[75].setRotationPoint(0F, 0F, 0F);

		gunModel[76].addShapeBox(20.5F, -21.5F, 1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		gunModel[76].setRotationPoint(0F, 0F, 0F);

		gunModel[77].addShapeBox(20.5F, -22F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		gunModel[77].setRotationPoint(0F, 0F, 0F);

		gunModel[78].addShapeBox(20.5F, -22F, -4F, 1, 1, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		gunModel[78].setRotationPoint(0F, 0F, 0F);

		gunModel[79].addShapeBox(20.5F, -23F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		gunModel[79].setRotationPoint(0F, 0F, 0F);

		gunModel[80].addShapeBox(20.5F, -22F, -5F, 1, 1, 2, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		gunModel[80].setRotationPoint(0F, 0F, 0F);

		gunModel[81].addShapeBox(20.5F, -19F, -4F, 1, 1, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		gunModel[81].setRotationPoint(0F, 0F, 0F);

		gunModel[82].addShapeBox(20.5F, -20F, -4F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		gunModel[82].setRotationPoint(0F, 0F, 0F);

		gunModel[83].addShapeBox(20.5F, -20F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F); // Box 100
		gunModel[83].setRotationPoint(0F, 0F, 0F);

		gunModel[84].addShapeBox(20.5F, -19F, -5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		gunModel[84].setRotationPoint(0F, 0F, 0F);

		gunModel[85].addShapeBox(20.5F, -20F, -5F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F); // Box 102
		gunModel[85].setRotationPoint(0F, 0F, 0F);

		gunModel[86].addShapeBox(20.5F, -19F, -5F, 1, 1, 2, 0F,0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		gunModel[86].setRotationPoint(0F, 0F, 0F);

		gunModel[87].addShapeBox(52F, -12F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F); // Box 104
		gunModel[87].setRotationPoint(0F, 0F, 0F);

		gunModel[88].addShapeBox(52F, -10.7F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F); // Box 105
		gunModel[88].setRotationPoint(0F, 0F, 0F);

		gunModel[89].addShapeBox(52F, -8F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F); // Box 106
		gunModel[89].setRotationPoint(0F, 0F, 0F);

		gunModel[90].addShapeBox(52F, -9.3F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F); // Box 107
		gunModel[90].setRotationPoint(0F, 0F, 0F);

		gunModel[91].addShapeBox(57F, -5.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 1F, -2.5F, -.5F, 1F, -2.5F, -.5F, 0F, 0F, -.5F); // Box 108
		gunModel[91].setRotationPoint(0F, 0F, 0F);

		gunModel[92].addShapeBox(50F, -5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F); // Box 109
		gunModel[92].setRotationPoint(0F, 0F, 0F);

		gunModel[93].addShapeBox(49F, -5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 110
		gunModel[93].setRotationPoint(0F, 0F, 0F);

		gunModel[94].addShapeBox(48F, -5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 111
		gunModel[94].setRotationPoint(0F, 0F, 0F);

		gunModel[95].addShapeBox(46F, -5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 112
		gunModel[95].setRotationPoint(0F, 0F, 0F);

		gunModel[96].addShapeBox(47F, -5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, 0F, 0F, -.5F); // Box 113
		gunModel[96].setRotationPoint(0F, 0F, 0F);

		gunModel[97].addShapeBox(7F, -12F, 2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 114
		gunModel[97].setRotationPoint(0F, 0F, 0F);

		gunModel[98].addShapeBox(7F, -15F, 3F, 4, 3, 1, 0F,-2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 115
		gunModel[98].setRotationPoint(0F, 0F, 0F);

		gunModel[99].addShapeBox(9F, -19F, 3F, 4, 4, 1, 0F,-3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		gunModel[99].setRotationPoint(0F, 0F, 0F);

		gunModel[100].addShapeBox(0.5F, -18.5F, -7F, 2, 2, 2, 0F,-.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F); // Box 117
		gunModel[100].setRotationPoint(0F, 0F, 0F);

		gunModel[101].addShapeBox(0.5F, -18.5F, -12F, 2, 2, 5, 0F,.1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F); // Box 118
		gunModel[101].setRotationPoint(0F, 0F, 0F);

		gunModel[102].addShapeBox(-5F, -25F, -4.5F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		gunModel[102].setRotationPoint(0F, 0F, 0F);

		gunModel[103].addShapeBox(-5F, -31F, -4.5F, 2, 6, 2, 0F,-7F, 0F, 0F, 6F, -2F, 0F, 6F, -2F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 120
		gunModel[103].setRotationPoint(0F, 0F, 0F);

		gunModel[104].addShapeBox(2F, -31F, -4.5F, 13, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 121
		gunModel[104].setRotationPoint(0F, 0F, 0F);

		gunModel[105].addShapeBox(15F, -31F, -4.5F, 2, 2, 2, 0F,0F, 0F, 0F, -.5F, -1F, 1F, 1F, -1F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 1F, 1F, -1F, 1F, 0F, 0F); // Box 122
		gunModel[105].setRotationPoint(0F, 0F, 0F);

		gunModel[106].addShapeBox(17F, -10F, -6.5F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		gunModel[106].setRotationPoint(0F, 0F, 0F);

		gunModel[107].addShapeBox(17F, -10F, -10.5F, 2, 2, 4, 0F,0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		gunModel[107].setRotationPoint(0F, 0F, 0F);

		gunModel[108].addShapeBox(17F, -24F, -10.5F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		gunModel[108].setRotationPoint(0F, 0F, 0F);

		gunModel[109].addShapeBox(17F, -28F, -10.5F, 2, 2, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 127
		gunModel[109].setRotationPoint(0F, 0F, 0F);

		gunModel[110].addShapeBox(17F, -30F, -6.5F, 2, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 1F, .5F, 0F, -1F, 0F, 2F, -1F, 0F, 2F, -1F, -1F, 0F, 1F, 0F, 1F, 0F); // Box 128
		gunModel[110].setRotationPoint(0F, 0F, 0F);

		gunModel[111].addShapeBox(41F, -12F, -7F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		gunModel[111].setRotationPoint(0F, 0F, 0F);

		gunModel[112].addShapeBox(50F, -9F, -7F, 2, 2, 5, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		gunModel[112].setRotationPoint(0F, 0F, 0F);

		gunModel[113].addShapeBox(43F, -12F, -9F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		gunModel[113].setRotationPoint(0F, 0F, 0F);

		gunModel[114].addShapeBox(50F, -12F, -9F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		gunModel[114].setRotationPoint(0F, 0F, 0F);

		gunModel[115].addShapeBox(7F, -7.3F, -1F, 2, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		gunModel[115].setRotationPoint(0F, 0F, 0F);
		gunModel[115].rotateAngleZ = -0.2268928F;

		gunModel[116].addShapeBox(7F, 2.7F, -1F, 2, 4, 2, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 3F, -2F, 0F); // Box 135
		gunModel[116].setRotationPoint(0F, 0F, 0F);
		gunModel[116].rotateAngleZ = -0.2268928F;

		gunModel[117].addShapeBox(1F, 4.7F, -1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		gunModel[117].setRotationPoint(0F, 0F, 0F);
		gunModel[117].rotateAngleZ = -0.2268928F;
	}
}