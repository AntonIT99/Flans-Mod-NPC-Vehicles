//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 23.07.2015 - 18:30:05
// Last changed on: 23.07.2015 - 18:30:05

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelBuzzard extends ModelPlane //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelBuzzard() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[126];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 60
		bodyModel[43] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 61
		bodyModel[44] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 62
		bodyModel[45] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 63
		bodyModel[46] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 64
		bodyModel[47] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 65
		bodyModel[48] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 66
		bodyModel[49] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 67
		bodyModel[50] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 68
		bodyModel[51] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 69
		bodyModel[52] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 70
		bodyModel[53] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 76
		bodyModel[56] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 77
		bodyModel[57] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 80
		bodyModel[58] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 81
		bodyModel[59] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 82
		bodyModel[60] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 83
		bodyModel[61] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 0
		bodyModel[62] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 2
		bodyModel[63] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 3
		bodyModel[64] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 4
		bodyModel[65] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 5
		bodyModel[66] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 6
		bodyModel[67] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 7
		bodyModel[68] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
		bodyModel[69] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 1
		bodyModel[70] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 2
		bodyModel[71] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 3
		bodyModel[72] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 4
		bodyModel[73] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 5
		bodyModel[74] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 6
		bodyModel[75] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 7
		bodyModel[76] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 8
		bodyModel[77] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 9
		bodyModel[78] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 10
		bodyModel[79] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 11
		bodyModel[80] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 12
		bodyModel[81] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 13
		bodyModel[82] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 14
		bodyModel[83] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 15
		bodyModel[84] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 16
		bodyModel[85] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 17
		bodyModel[86] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 18
		bodyModel[87] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 19
		bodyModel[88] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 20
		bodyModel[89] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 21
		bodyModel[90] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 22
		bodyModel[91] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 23
		bodyModel[92] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 24
		bodyModel[93] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 25
		bodyModel[94] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 26
		bodyModel[95] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 27
		bodyModel[96] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 28
		bodyModel[97] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 29
		bodyModel[98] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 30
		bodyModel[99] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 31
		bodyModel[100] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 33
		bodyModel[101] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 34
		bodyModel[102] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 35
		bodyModel[103] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 36
		bodyModel[104] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 37
		bodyModel[105] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 38
		bodyModel[106] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 39
		bodyModel[107] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 40
		bodyModel[108] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 41
		bodyModel[109] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 42
		bodyModel[110] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 43
		bodyModel[111] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 44
		bodyModel[112] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 45
		bodyModel[113] = new ModelRendererTurbo(this, 81, 97, textureX, textureY); // Box 46
		bodyModel[114] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 47
		bodyModel[115] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 48
		bodyModel[116] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 49
		bodyModel[117] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 50
		bodyModel[118] = new ModelRendererTurbo(this, 193, 89, textureX, textureY); // Box 51
		bodyModel[119] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 52
		bodyModel[120] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 53
		bodyModel[121] = new ModelRendererTurbo(this, 225, 89, textureX, textureY); // Box 54
		bodyModel[122] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Box 55
		bodyModel[123] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 56
		bodyModel[124] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 57
		bodyModel[125] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 58

		bodyModel[0].addShapeBox(0F, 0F, 0F, 60, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-26.5F, 3F, -0.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-34.5F, 3F, -0.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-34.5F, 3F, -0.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 14, 2, 12, 0F); // Box 3
		bodyModel[3].setRotationPoint(-19.5F, -2F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 8, 12, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-7.5F, -10F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F, -1F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-6.5F, -14F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-4.5F, -19F, -3.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(-5F, -15F, -2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-5.5F, -19F, -3.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-22.5F, -3.5F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(-21.5F, 0.5F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-22.5F, -6.5F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 12
		bodyModel[12].setRotationPoint(-21.5F, -11F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-20.5F, 1.5F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 14
		bodyModel[14].setRotationPoint(-19.5F, 0F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-16.5F, 0.5F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-16.5F, 0.5F, 1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-16.5F, 2.5F, -1F);

		bodyModel[18].addShapeBox(-2F, 0F, 0F, 1, 25, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 19
		bodyModel[18].setRotationPoint(1.5F, -22.5F, -0.5F);
		bodyModel[18].rotateAngleZ = -0.08726646F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 20
		bodyModel[19].setRotationPoint(-0.5F, -28.5F, -0.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 6, 7, 14, 0F); // Box 21
		bodyModel[20].setRotationPoint(-3.5F, -7F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 22
		bodyModel[21].setRotationPoint(-3.5F, 0F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F, 0.25F, 5F, 0.25F, 0.25F, 5F, 0.25F, 0.25F, 5F, 0.25F, 0.25F, 5F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 23
		bodyModel[22].setRotationPoint(-0.5F, -31.5F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-1F, -25F, -1F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-1.5F, -29F, -1.5F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 7, 6, 0F); // Box 26
		bodyModel[25].setRotationPoint(-35.5F, -8F, -3F);
		bodyModel[25].rotateAngleZ = 0.6981317F;

		bodyModel[26].addShapeBox(2F, 0F, 0F, 1, 7, 6, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 27
		bodyModel[26].setRotationPoint(-35.5F, -8F, -3F);
		bodyModel[26].rotateAngleZ = 0.6981317F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 4, 14, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-3.5F, -11F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(21.5F, 3F, -0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(2.5F, -4F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 16, 0F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, 1F, 0F, 0.1F, 1F, 0F, 0.1F, 1F, 0F, 0.1F, 1F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-0.5F, 4F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 32
		bodyModel[31].setRotationPoint(-0.5F, 6F, -19F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 33
		bodyModel[32].setRotationPoint(-0.5F, 2.5F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-13.5F, 6F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 35
		bodyModel[34].setRotationPoint(3.5F, 6.5F, -20F);
		bodyModel[34].rotateAngleZ = -0.20943951F;

		bodyModel[35].addShapeBox(0F, 0F, 10F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 36
		bodyModel[35].setRotationPoint(3.5F, 6.5F, -20F);
		bodyModel[35].rotateAngleZ = -0.20943951F;

		bodyModel[36].addShapeBox(1F, 0F, 1F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 37
		bodyModel[36].setRotationPoint(3.5F, 6.5F, -20F);
		bodyModel[36].rotateAngleZ = -0.20943951F;

		bodyModel[37].addShapeBox(3F, 0F, 1F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 38
		bodyModel[37].setRotationPoint(3.5F, 6.5F, -20F);
		bodyModel[37].rotateAngleZ = -0.20943951F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 39
		bodyModel[38].setRotationPoint(3.5F, 6.5F, 9F);
		bodyModel[38].rotateAngleZ = -0.20943951F;

		bodyModel[39].addShapeBox(0F, 0F, 10F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 40
		bodyModel[39].setRotationPoint(3.5F, 6.5F, 9F);
		bodyModel[39].rotateAngleZ = -0.20943951F;

		bodyModel[40].addShapeBox(1F, 0F, 1F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 41
		bodyModel[40].setRotationPoint(3.5F, 6.5F, 9F);
		bodyModel[40].rotateAngleZ = -0.20943951F;

		bodyModel[41].addShapeBox(3F, 0F, 1F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 42
		bodyModel[41].setRotationPoint(3.5F, 6.5F, 9F);
		bodyModel[41].rotateAngleZ = -0.20943951F;

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 60
		bodyModel[42].setRotationPoint(-0.5F, 0F, -6F);
		bodyModel[42].rotateAngleY = -0.2443461F;

		bodyModel[43].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[43].setRotationPoint(-0.5F, -1F, -6F);
		bodyModel[43].rotateAngleY = -0.2443461F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[44].setRotationPoint(-0.5F, -2F, -6F);
		bodyModel[44].rotateAngleY = -0.2443461F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -2.3F, 0F, -0.3F, 1.7F, 0F, -0.3F, 1.7F, 0F, -0.3F, -2.3F, 0F, -0.3F); // Box 63
		bodyModel[45].setRotationPoint(-24.5F, -8F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 64
		bodyModel[46].setRotationPoint(-24.5F, -10F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[47].setRotationPoint(-21.5F, -9.5F, -0.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[48].setRotationPoint(27.5F, -12F, -8F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[49].setRotationPoint(35.5F, -12F, -8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[50].setRotationPoint(34.5F, -12F, -8F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 69
		bodyModel[51].setRotationPoint(34.5F, -12F, -8F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[52].setRotationPoint(27.5F, -12F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[53].setRotationPoint(29.5F, -12F, -14F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[54].setRotationPoint(33.5F, -12F, -14F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[55].setRotationPoint(28.5F, -14F, -15F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[56].setRotationPoint(28.5F, -21F, -15F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[57].setRotationPoint(29.5F, -12F, 9F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[58].setRotationPoint(33.5F, -12F, 9F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 10, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[59].setRotationPoint(28.5F, -14F, 14F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[60].setRotationPoint(28.5F, -21F, 14F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[61].setRotationPoint(28.5F, -22F, 14F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[62].setRotationPoint(28.5F, -22F, -15F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 3
		bodyModel[63].setRotationPoint(2.5F, 6F, -19F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 2, 38, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 4
		bodyModel[64].setRotationPoint(1F, 6F, -19F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 5
		bodyModel[65].setRotationPoint(27.5F, -12F, 8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 6
		bodyModel[66].setRotationPoint(-0.5F, 5F, -20F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Box 7
		bodyModel[67].setRotationPoint(-0.5F, 5F, 19F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 0
		bodyModel[68].setRotationPoint(-3.5F, -7F, -7.2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 1
		bodyModel[69].setRotationPoint(-3.5F, -6F, -7.2F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 2
		bodyModel[70].setRotationPoint(-3.5F, -5F, -7.2F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 3
		bodyModel[71].setRotationPoint(-3.5F, -4F, -7.2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 4
		bodyModel[72].setRotationPoint(-3.5F, -2F, -7.2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 5
		bodyModel[73].setRotationPoint(-3.5F, -1F, -7.2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 6
		bodyModel[74].setRotationPoint(-3.5F, -3F, -7.2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 7
		bodyModel[75].setRotationPoint(-3.5F, -7F, 6.2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 8
		bodyModel[76].setRotationPoint(-3.5F, -6F, 6.2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 9
		bodyModel[77].setRotationPoint(-3.5F, -5F, 6.2F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 10
		bodyModel[78].setRotationPoint(-3.5F, -4F, 6.2F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 11
		bodyModel[79].setRotationPoint(-3.5F, -2F, 6.2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 12
		bodyModel[80].setRotationPoint(-3.5F, -1F, 6.2F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F); // Box 13
		bodyModel[81].setRotationPoint(-3.5F, -3F, 6.2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[82].setRotationPoint(-2.5F, -13F, -2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 15
		bodyModel[83].setRotationPoint(-3.5F, -11.2F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 16
		bodyModel[84].setRotationPoint(-3.5F, -11.2F, -4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 17
		bodyModel[85].setRotationPoint(-3.5F, -11.2F, -3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 18
		bodyModel[86].setRotationPoint(-3.5F, -11.2F, 4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 19
		bodyModel[87].setRotationPoint(-3.5F, -11.2F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 20
		bodyModel[88].setRotationPoint(-3.5F, -11.2F, 2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[89].setRotationPoint(2.5F, -6F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[90].setRotationPoint(4.5F, -6F, -2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 23
		bodyModel[91].setRotationPoint(-0.5F, -25F, 1F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F); // Box 24
		bodyModel[92].setRotationPoint(-0.5F, -25F, 2F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 25
		bodyModel[93].setRotationPoint(-0.5F, -27F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F); // Box 26
		bodyModel[94].setRotationPoint(-0.5F, -27F, 2F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 27
		bodyModel[95].setRotationPoint(-0.5F, -25F, -2F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 28
		bodyModel[96].setRotationPoint(-0.5F, -25F, -3F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F); // Box 29
		bodyModel[97].setRotationPoint(-0.5F, -27F, -2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, 0.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 30
		bodyModel[98].setRotationPoint(-0.5F, -27F, -3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, 0F, 5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, -5F); // Box 31
		bodyModel[99].setRotationPoint(2.5F, -9F, -0.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F, 0F, 0F, -5F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 5F); // Box 33
		bodyModel[100].setRotationPoint(2.5F, -9F, -0.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 34
		bodyModel[101].setRotationPoint(-21.5F, -11.25F, -0.5F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 35
		bodyModel[102].setRotationPoint(4.5F, -5F, -2F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 36
		bodyModel[103].setRotationPoint(2.5F, -5F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 37
		bodyModel[104].setRotationPoint(4.5F, -3F, -2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 38
		bodyModel[105].setRotationPoint(2.5F, -3F, -2F);

		bodyModel[106].addShapeBox(2.25F, 0.25F, 1.25F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[106].setRotationPoint(-35.5F, -8F, -3F);
		bodyModel[106].rotateAngleZ = 0.6981317F;

		bodyModel[107].addShapeBox(2.25F, 0.25F, 3.25F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[107].setRotationPoint(-35.5F, -8F, -3F);
		bodyModel[107].rotateAngleZ = 0.6981317F;

		bodyModel[108].addShapeBox(2.25F, 2.25F, 3.25F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[108].setRotationPoint(-35.5F, -8F, -3F);
		bodyModel[108].rotateAngleZ = 0.6981317F;

		bodyModel[109].addShapeBox(2.25F, 4.25F, 1.25F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[109].setRotationPoint(-35.5F, -8F, -3F);
		bodyModel[109].rotateAngleZ = 0.6981317F;

		bodyModel[110].addShapeBox(2F, 0F, 1F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 43
		bodyModel[110].setRotationPoint(3.5F, 6.5F, 9F);
		bodyModel[110].rotateAngleZ = -0.20943951F;

		bodyModel[111].addShapeBox(2F, 0F, 1F, 1, 1, 9, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F); // Box 44
		bodyModel[111].setRotationPoint(3.5F, 6.5F, -20F);
		bodyModel[111].rotateAngleZ = -0.20943951F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, 0F, -2F, 0.1F, 0F, -2F); // Box 45
		bodyModel[112].setRotationPoint(-0.5F, 7F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[113].setRotationPoint(3.5F, 6F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F); // Box 47
		bodyModel[114].setRotationPoint(31.5F, -20F, -14F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[115].setRotationPoint(31.5F, -20F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[116].setRotationPoint(-18.5F, 2.5F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[117].setRotationPoint(-18.5F, 0.5F, 1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 51
		bodyModel[118].setRotationPoint(-18.5F, 0.5F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[119].setRotationPoint(-9.5F, 2.5F, -1F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[120].setRotationPoint(-9.5F, 0.5F, 1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 54
		bodyModel[121].setRotationPoint(-9.5F, 0.5F, -3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 55
		bodyModel[122].setRotationPoint(-7.5F, 0.5F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[123].setRotationPoint(-7.5F, 2.5F, -1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[124].setRotationPoint(-7.5F, 0.5F, 1F);

		bodyModel[125].addShapeBox(-1F, 0F, 0F, 1, 7, 6, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F); // Box 58
		bodyModel[125].setRotationPoint(-35.5F, -8F, -3F);
		bodyModel[125].rotateAngleZ = 0.6981317F;


		yawFlapModel = new ModelRendererTurbo[2];
		yawFlapModel[0] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 8
		yawFlapModel[1] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 9

		yawFlapModel[0].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 8
		yawFlapModel[0].setRotationPoint(38.5F, -21F, -14.5F);

		yawFlapModel[1].addShapeBox(0F, 0F, -0.5F, 1, 7, 1, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 9
		yawFlapModel[1].setRotationPoint(38.5F, -21F, 14.5F);


		bodyWheelModel = new ModelRendererTurbo[10];
		bodyWheelModel[0] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 45
		bodyWheelModel[1] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 46
		bodyWheelModel[2] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 47
		bodyWheelModel[3] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 48
		bodyWheelModel[4] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 50
		bodyWheelModel[5] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 51
		bodyWheelModel[6] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 52
		bodyWheelModel[7] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 60
		bodyWheelModel[8] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 61
		bodyWheelModel[9] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 62

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyWheelModel[0].setRotationPoint(-26.5F, 7F, -1F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyWheelModel[1].setRotationPoint(-26.5F, 8F, -1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyWheelModel[2].setRotationPoint(-26.5F, 9F, -1F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyWheelModel[3].setRotationPoint(-25.5F, 6F, -2F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 50
		bodyWheelModel[4].setRotationPoint(-25.5F, 6F, 1F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 51
		bodyWheelModel[5].setRotationPoint(-25.5F, 4F, -1.4F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 52
		bodyWheelModel[6].setRotationPoint(-25.5F, 8F, -1.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyWheelModel[7].setRotationPoint(-25.5F, 4F, 0.4F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyWheelModel[8].setRotationPoint(33.5F, 4F, 0.4F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 62
		bodyWheelModel[9].setRotationPoint(33.5F, 4F, -1.4F);


		tailWheelModel = new ModelRendererTurbo[6];
		tailWheelModel[0] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 54
		tailWheelModel[1] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 55
		tailWheelModel[2] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 56
		tailWheelModel[3] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 57
		tailWheelModel[4] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 58
		tailWheelModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 59

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 54
		tailWheelModel[0].setRotationPoint(33.5F, 6F, 1F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		tailWheelModel[1].setRotationPoint(33.5F, 6F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		tailWheelModel[2].setRotationPoint(32.5F, 7F, -1F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		tailWheelModel[3].setRotationPoint(32.5F, 8F, -1F);

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 58
		tailWheelModel[4].setRotationPoint(32.5F, 9F, -1F);

		tailWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 59
		tailWheelModel[5].setRotationPoint(33.5F, 8F, -1.5F);


		leftWingWheelModel = new ModelRendererTurbo[2];
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Shape 2
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Shape 44

		leftWingWheelModel[0].addShape3D(5F, -3F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2) }), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 2
		leftWingWheelModel[0].setRotationPoint(1.5F, 7F, -20F);

		leftWingWheelModel[1].addShape3D(5F, -3F, -3F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(6, 0, 6, 0), new Coord2D(8, 2, 8, 2), new Coord2D(8, 4, 8, 4), new Coord2D(6, 6, 6, 6), new Coord2D(4, 6, 4, 6), new Coord2D(2, 4, 2, 4), new Coord2D(2, 2, 2, 2) }), 3, 8, 8, 20, 3, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Shape 44
		leftWingWheelModel[1].setRotationPoint(1.5F, 7F, 20F);

		heliMainRotorModels = new ModelRendererTurbo[4][0];

		heliMainRotorModels[0] = new ModelRendererTurbo[1];
		heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 146
		heliMainRotorModels[0][0].addBox(-50F, 1F, -1F, 100, 1, 2, 0F); // Box 146
		heliMainRotorModels[0][0].setRotationPoint(0F, -31F, 0F);

		
		heliMainRotorModels[1] = new ModelRendererTurbo[1];
		heliMainRotorModels[1][0] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); //
		heliMainRotorModels[1][0].addBox(-50F, 3F, -1F, 100, 1, 2, 0F); // Box 147
		heliMainRotorModels[1][0].setRotationPoint(0F, -31F, 0F);

		
		heliMainRotorModels[2] = new ModelRendererTurbo[1];
		heliMainRotorModels[2][0] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 146
		heliMainRotorModels[2][0].addBox(-50F, 2F, -1F, 100, 1, 2, 0F); // Box 146
		heliMainRotorModels[2][0].setRotationPoint(0F, -31F, 0F);
		
		heliMainRotorModels[3] = new ModelRendererTurbo[1];
		heliMainRotorModels[3][0] = new ModelRendererTurbo(this, 0, 138, textureX, textureY); // Box 146
		heliMainRotorModels[3][0].addBox(-50F, 4F, -1F, 100, 1, 2, 0F); // Box 146
		heliMainRotorModels[3][0].setRotationPoint(0F, -31F, 0F);



		heliMainRotorOrigins = new Vector3f[] { new Vector3f(0F, 48F / 16F, 0F), new Vector3f(0F, 48F / 16F, 0F),  new Vector3f(0F, 48F / 16F, 0F) , new Vector3f(0F, 48F / 16F, 0F)}; 

		heliRotorSpeeds = new float[] { 1.1F, 1.2F, -1.3F, -1.4F };



		translateAll(0F, 0F, 0F);


		flipAll();
	}

}