//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Goeben
// Model Creator: 
// Created on: 22.07.2020 - 16:37:26
// Last changed on: 22.07.2020 - 16:37:26

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGoeben extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGoeben() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[103];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 353, 121, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 62
		bodyModel[61] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 63
		bodyModel[62] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 64
		bodyModel[63] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 65
		bodyModel[64] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 66
		bodyModel[65] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 67
		bodyModel[66] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 68
		bodyModel[67] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 69
		bodyModel[68] = new ModelRendererTurbo(this, 97, 89, textureX, textureY); // Box 70
		bodyModel[69] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		bodyModel[70] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 72
		bodyModel[71] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 73
		bodyModel[72] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 74
		bodyModel[73] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 75
		bodyModel[74] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 76
		bodyModel[75] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 77
		bodyModel[76] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 78
		bodyModel[77] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 79
		bodyModel[78] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 81
		bodyModel[80] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 82
		bodyModel[81] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 97
		bodyModel[83] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 98
		bodyModel[84] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 99
		bodyModel[85] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 100
		bodyModel[86] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 101
		bodyModel[87] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 102
		bodyModel[88] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Box 103
		bodyModel[89] = new ModelRendererTurbo(this, 233, 249, textureX, textureY); // Box 104
		bodyModel[90] = new ModelRendererTurbo(this, 337, 185, textureX, textureY); // Box 105
		bodyModel[91] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 106
		bodyModel[92] = new ModelRendererTurbo(this, 225, 161, textureX, textureY); // Box 107
		bodyModel[93] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 108
		bodyModel[94] = new ModelRendererTurbo(this, 153, 265, textureX, textureY); // Box 109
		bodyModel[95] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 110
		bodyModel[96] = new ModelRendererTurbo(this, 225, 177, textureX, textureY); // Box 111
		bodyModel[97] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 112
		bodyModel[98] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 113
		bodyModel[99] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 114
		bodyModel[100] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 115
		bodyModel[101] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 116
		bodyModel[102] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 117

		bodyModel[0].addShapeBox(0F, 0F, 0F, 10, 8, 57, 0F,20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-13F, -4F, -28F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 8, 51, 0F,19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F, 19F, 0F, 0F, 19F, 0F, 3F, 19F, 0F, 3F, 19F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-53F, -4F, -25F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 8, 45, 0F,10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F, 10F, 0F, 0F, 10F, 0F, 3F, 10F, 0F, 3F, 10F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-91F, -4F, -22F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 8, 39, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(-116F, -4F, -19F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 22, 8, 29, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-138F, -4F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 19, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(-157F, -4F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-173F, -4F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 8, 9, 0F,-1.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F); // Box 8
		bodyModel[7].setRotationPoint(-178F, -4F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 8, 57, 0F,17.5F, 0F, 0F, 17.5F, 0F, -4F, 17.5F, 0F, -4F, 17.5F, 0F, 0F, 17.5F, 0F, 0F, 17.5F, 0F, -4F, 17.5F, 0F, -4F, 17.5F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(34.5F, -4F, -28F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 8, 49, 0F,15F, 0F, 0F, 15F, 0F, -5F, 15F, 0F, -5F, 15F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, -4F, 15F, 0F, -4F, 15F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(72F, -4F, -24F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 8, 41, 0F,0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(88F, -4F, -20F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 3, 34, 0F,20F, 4.5F, 0F, 20F, 6F, -9F, 20F, 6F, -9F, 20F, 4.5F, 0F, 20F, 4.5F, 0F, 20F, 4.5F, -9F, 20F, 4.5F, -9F, 20F, 4.5F, 0F); // Box 12
		bodyModel[11].setRotationPoint(123F, -3.5F, -16.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 3, 16, 0F,0F, 6F, 0F, 0F, 6.2F, -5F, 0F, 6.2F, -5F, 0F, 6F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, -5F, 0F, 4.5F, -5F, 0F, 4.5F, 0F); // Box 13
		bodyModel[12].setRotationPoint(153F, -3.5F, -7.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 5, 3, 6, 0F,0F, 6.2F, 0F, 0F, 6.4F, -2.5F, 0F, 6.4F, -2.5F, 0F, 6.2F, 0F, 0F, 4.5F, 0F, 1F, 4.5F, -2.5F, 1F, 4.5F, -2.5F, 0F, 4.5F, 0F); // Box 14
		bodyModel[13].setRotationPoint(173F, -3.5F, -2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 13, 5, 38, 0F,0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F); // Box 15
		bodyModel[14].setRotationPoint(90F, -8.5F, -18.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 26, 5, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(64F, -8F, -18.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 17
		bodyModel[16].setRotationPoint(61F, -8F, -21.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 5, 44, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 18
		bodyModel[17].setRotationPoint(53F, -8F, -21.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 4, 5, 44, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(49F, -8F, -21.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 5, 48, 0F,0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F); // Box 20
		bodyModel[19].setRotationPoint(42F, -8F, -23.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 5, 52, 0F,15F, 0F, 0.5F, 15F, 0F, -1.5F, 15F, 0F, -1.5F, 15F, 0F, 0.5F, 15F, 0F, 0.5F, 15F, 0F, -1.5F, 15F, 0F, -1.5F, 15F, 0F, 0.5F); // Box 21
		bodyModel[20].setRotationPoint(24F, -8F, -25.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 5, 52, 0F,20F, 0F, 0F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0.5F, 20F, 0F, 0.5F, 20F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-17F, -8F, -25.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 5, 5, 46, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-42F, -8F, -22.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 46, 0F,9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(-53F, -8F, -22.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 19, 5, 20, 0F,0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 13F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-81F, -8F, -9.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(70F, -14F, -9.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(56F, -17F, -9.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 10, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, -9F, 2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 9F, 0F, -9F); // Box 29
		bodyModel[27].setRotationPoint(52F, -17F, -9.5F);

		bodyModel[28].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(96.5F, -10F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(88F, -10F, -8.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(88F, -10F, 2.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(18F, -10F, -12F);

		bodyModel[32].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(26.5F, -10F, -14.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[33].setRotationPoint(18F, -10F, -23F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 36
		bodyModel[34].setRotationPoint(-31F, -10F, 18F);

		bodyModel[35].addShapeBox(-8.5F, 0F, -2.5F, 17, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-22.5F, -10F, 15.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 17, 3, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[36].setRotationPoint(-31F, -10F, 7F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 17, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 39
		bodyModel[37].setRotationPoint(-89F, -10F, 3.5F);

		bodyModel[38].addShapeBox(-8.5F, 0F, -2.5F, 17, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[38].setRotationPoint(-80.5F, -10F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 17, 6, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[39].setRotationPoint(-89F, -10F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F); // Box 42
		bodyModel[40].setRotationPoint(-111F, -6F, 3.5F);

		bodyModel[41].addShapeBox(-8.5F, 0F, -2.5F, 17, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[41].setRotationPoint(-102.5F, -6F, 1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 17, 2, 6, 0F,-5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[42].setRotationPoint(-111F, -6F, -7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 10, 10, 0F,-4F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 0F, 3F, 0F, 0F); // Box 45
		bodyModel[43].setRotationPoint(-8F, -17F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 10, 10, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -1F, -1F, 0F, -1F, 5F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 3F, 3F, 0F, 3F); // Box 46
		bodyModel[44].setRotationPoint(-8F, -17F, 0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 17, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[45].setRotationPoint(0F, -33F, -5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 17, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 48
		bodyModel[46].setRotationPoint(-2F, -33F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 17, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 49
		bodyModel[47].setRotationPoint(8F, -33F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 19, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 50
		bodyModel[48].setRotationPoint(61F, -35F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 19, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[49].setRotationPoint(53F, -35F, -5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 19, 12, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 52
		bodyModel[50].setRotationPoint(51F, -35F, -5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 12, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[51].setRotationPoint(-61F, -15F, -10.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 11, 22, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 54
		bodyModel[52].setRotationPoint(-67F, -18F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 7, 11, 14, 0F,0F, -1F, 0F, -2F, -2F, -5F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[53].setRotationPoint(-49F, -18F, -10.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 7, 11, 6, 0F,0F, 0F, 0F, -2F, -1F, 0F, -5F, -3F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F); // Box 56
		bodyModel[54].setRotationPoint(-49F, -18F, 3.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 8, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[55].setRotationPoint(-49F, -15F, 5.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[56].setRotationPoint(-60F, -28.5F, -1.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[57].setRotationPoint(10F, -29F, -8.5F);

		bodyModel[58].addShapeBox(-0.5F, 0F, -0.5F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F); // Box 60
		bodyModel[58].setRotationPoint(10.5F, -29F, -8F);
		bodyModel[58].rotateAngleY = -2.82743339F;

		bodyModel[59].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 61
		bodyModel[59].setRotationPoint(-16.5F, -29F, -17F);

		bodyModel[60].addShapeBox(-0.5F, 0F, -0.5F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, 0F); // Box 62
		bodyModel[60].setRotationPoint(-6F, -29F, 8.5F);
		bodyModel[60].rotateAngleY = 0.38397244F;

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[61].setRotationPoint(-6.5F, -29F, 8F);

		bodyModel[62].addShapeBox(-0.5F, 0F, -0.5F, 1, 10, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 64
		bodyModel[62].setRotationPoint(20F, -29F, 19F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[63].setRotationPoint(-180F, -20F, 0F);
		bodyModel[63].rotateAngleZ = 0.33161256F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[64].setRotationPoint(73F, -18F, -2.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 6, 7, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[65].setRotationPoint(72F, -19F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 68
		bodyModel[66].setRotationPoint(80F, -17.8F, -1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 15, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[67].setRotationPoint(56F, -24F, -5.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 5, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 70
		bodyModel[68].setRotationPoint(62.5F, -22F, -3.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F, 0F, 30F, 0F); // Box 71
		bodyModel[69].setRotationPoint(64.5F, -51F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 72
		bodyModel[70].setRotationPoint(64.5F, -54F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F); // Box 73
		bodyModel[71].setRotationPoint(66F, -77F, 0F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 74
		bodyModel[72].setRotationPoint(66F, -56F, -5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 75
		bodyModel[73].setRotationPoint(61F, -56F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[74].setRotationPoint(62F, -7F, 20F);
		bodyModel[74].rotateAngleY = 0.73303829F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[75].setRotationPoint(44F, -7F, 23F);
		bodyModel[75].rotateAngleY = 0.73303829F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[76].setRotationPoint(-73F, -7F, 23F);
		bodyModel[76].rotateAngleY = -0.73303829F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[77].setRotationPoint(-45F, -7F, 29F);
		bodyModel[77].rotateAngleY = -0.73303829F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[78].setRotationPoint(62F, -7F, -19F);
		bodyModel[78].rotateAngleY = -0.73303829F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[79].setRotationPoint(44F, -7F, -22F);
		bodyModel[79].rotateAngleY = -0.73303829F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[80].setRotationPoint(-68F, -7F, -17F);
		bodyModel[80].rotateAngleY = -2.19911486F;

		bodyModel[81].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[81].setRotationPoint(-40F, -7F, -23F);
		bodyModel[81].rotateAngleY = -2.19911486F;

		bodyModel[82].addShapeBox(0F, 0F, 0F, 15, 1, 41, 0F,0F, 7F, 0F, 0F, 7F, -3.5F, 0F, 7F, -3.5F, 0F, 7F, 0F, 0F, 7F, -6F, 0F, 7F, -8.5F, 0F, 7F, -8.5F, 0F, 7F, -6F); // Box 97
		bodyModel[82].setRotationPoint(88F, 11F, -20F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 49, 0F,15F, 7F, 0F, 15F, 7F, -4F, 15F, 7F, -4F, 15F, 7F, 0F, 15F, 7F, -5F, 15F, 7F, -10F, 15F, 7F, -10F, 15F, 7F, -5F); // Box 98
		bodyModel[83].setRotationPoint(72F, 11F, -24F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 5, 1, 57, 0F,17.5F, 7F, 0F, 17.5F, 7F, -4F, 17.5F, 7F, -4F, 17.5F, 7F, 0F, 17.5F, 7F, -5F, 17.5F, 7F, -9F, 17.5F, 7F, -9F, 17.5F, 7F, -5F); // Box 99
		bodyModel[84].setRotationPoint(34.5F, 11F, -28F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 10, 1, 57, 0F,20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, 0F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F, 20F, 7F, -5F); // Box 100
		bodyModel[85].setRotationPoint(-13F, 11F, -28F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 1, 51, 0F,19F, 7F, 0F, 19F, 7F, 3F, 19F, 7F, 3F, 19F, 7F, 0F, 19F, 7F, -5F, 19F, 7F, -2F, 19F, 7F, -2F, 19F, 7F, -5F); // Box 101
		bodyModel[86].setRotationPoint(-53F, 11F, -25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 1, 45, 0F,10F, 7F, 0F, 10F, 7F, 3F, 10F, 7F, 3F, 10F, 7F, 0F, 10F, 7F, -5F, 10F, 7F, -2F, 10F, 7F, -2F, 10F, 7F, -5F); // Box 102
		bodyModel[87].setRotationPoint(-91F, 11F, -22F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 22, 1, 29, 0F,0F, 7F, 0F, 0F, 7F, 5F, 0F, 7F, 5F, 0F, 7F, 0F, -4F, 6F, -5F, 0F, 7F, 0F, 0F, 7F, 0F, -4F, 6F, -5F); // Box 103
		bodyModel[88].setRotationPoint(-138F, 11F, -14F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 15, 1, 39, 0F,0F, 7F, 0F, 0F, 7F, 3F, 0F, 7F, 3F, 0F, 7F, 0F, 0F, 7F, -5F, 0F, 7F, -2F, 0F, 7F, -2F, 0F, 7F, -5F); // Box 104
		bodyModel[89].setRotationPoint(-116F, 11F, -19F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 16, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -3F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -3F, -2F); // Box 105
		bodyModel[90].setRotationPoint(-173F, 4F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 19, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -2F, -3F, 3F, 0F, 2F, 3F, 0F, 2F, 0F, -2F, -3F); // Box 106
		bodyModel[91].setRotationPoint(-157F, 4F, -9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, -1.5F, -1F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -1.5F, -1F, -4F); // Box 107
		bodyModel[92].setRotationPoint(-178F, 4F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 50, 5, 34, 0F,0F, 5F, 0F, 0F, 5F, -9F, 0F, 5F, -9F, 0F, 5F, 0F, 0F, 5F, -5F, -8F, 4F, -14F, -8F, 4F, -14F, 0F, 5F, -5F); // Box 108
		bodyModel[93].setRotationPoint(103F, 9F, -16.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 20, 14, 16, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 8F, 0F, -5F, -2F, -8F, -7F, -2F, -8F, -7F, 8F, 0F, -5F); // Box 109
		bodyModel[94].setRotationPoint(153F, 4F, -7.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 6, 6, 0F,0F, 0F, 0F, 1F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, 2F, 0F, -2F, 0F, -3F, -2.8F, 0F, -3F, -2.8F, 2F, 0F, -2F); // Box 110
		bodyModel[95].setRotationPoint(173F, 4F, -2.5F);

		bodyModel[96].addShapeBox(-18F, 0F, 0F, 18, 12, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 111
		bodyModel[96].setRotationPoint(-180F, -20F, 0F);
		bodyModel[96].rotateAngleZ = 0.33161256F;

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F); // Box 112
		bodyModel[97].setRotationPoint(-55F, -51F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 113
		bodyModel[98].setRotationPoint(-55F, -54F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F); // Box 114
		bodyModel[99].setRotationPoint(-55.5F, -77F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 11, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 115
		bodyModel[100].setRotationPoint(-55.5F, -56F, -5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 116
		bodyModel[101].setRotationPoint(-60.5F, -56F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 117
		bodyModel[102].setRotationPoint(176F, -21F, 0F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[6];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 84
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 85
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 86
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 87
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 88
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 89

		gun_1_Model[0][0].addShapeBox(-11F, -1.5F, -3F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84

		gun_1_Model[0][1].addShapeBox(2F, -1.5F, -3F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 85

		gun_1_Model[0][2].addShapeBox(-11F, -1.5F, 3F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 86

		gun_1_Model[0][3].addShapeBox(2F, -1.5F, 3F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -3.8F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 87

		gun_1_Model[0][4].addShapeBox(-11F, -1.5F, -8F, 13, 4, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88

		gun_1_Model[0][5].addShapeBox(2F, -1.5F, -8F, 6, 4, 5, 0F,0F, 0F, 0F, -3.8F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(96.5F, -13F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[6];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 90
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 91
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 93
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 94
		gun_1_Model[1][4] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 95
		gun_1_Model[1][5] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 96

		gun_1_Model[1][0].addShapeBox(-1.5F, -1F, 2.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 90

		gun_1_Model[1][1].addShapeBox(-1.5F, -1F, -4.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 91

		gun_1_Model[1][2].addShapeBox(7.5F, -1F, 2.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 93

		gun_1_Model[1][3].addShapeBox(7.5F, -1F, -4.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 94

		gun_1_Model[1][4].addShapeBox(15.5F, -1F, 2.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 95

		gun_1_Model[1][5].addShapeBox(15.5F, -1F, -4.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 96

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(96.5F, -13F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("FrontGun", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 84
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 85
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 86
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 87
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 88
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 89

		gun_2_Model[0][0].addShapeBox(-11F, -1.5F, -3F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84

		gun_2_Model[0][1].addShapeBox(2F, -1.5F, -3F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 85

		gun_2_Model[0][2].addShapeBox(-11F, -1.5F, 3F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 86

		gun_2_Model[0][3].addShapeBox(2F, -1.5F, 3F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -3.8F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 87

		gun_2_Model[0][4].addShapeBox(-11F, -1.5F, -8F, 13, 4, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88

		gun_2_Model[0][5].addShapeBox(2F, -1.5F, -8F, 6, 4, 5, 0F,0F, 0F, 0F, -3.8F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(26.5F, -13F, -14.5F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[6];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 90
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 91
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 93
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 94
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 95
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 96

		gun_2_Model[1][0].addShapeBox(-1.5F, -1F, 2.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 90

		gun_2_Model[1][1].addShapeBox(-1.5F, -1F, -4.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 91

		gun_2_Model[1][2].addShapeBox(7.5F, -1F, 2.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 93

		gun_2_Model[1][3].addShapeBox(7.5F, -1F, -4.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 94

		gun_2_Model[1][4].addShapeBox(15.5F, -1F, 2.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 95

		gun_2_Model[1][5].addShapeBox(15.5F, -1F, -4.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 96

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(26.5F, -13F, -14.5F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RightGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 84
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 85
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 86
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 87
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 88
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 89

		gun_3_Model[0][0].addShapeBox(-11F, -1.5F, -3F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84

		gun_3_Model[0][1].addShapeBox(2F, -1.5F, -3F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 85

		gun_3_Model[0][2].addShapeBox(-11F, -1.5F, 3F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 86

		gun_3_Model[0][3].addShapeBox(2F, -1.5F, 3F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -3.8F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 87

		gun_3_Model[0][4].addShapeBox(-11F, -1.5F, -8F, 13, 4, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88

		gun_3_Model[0][5].addShapeBox(2F, -1.5F, -8F, 6, 4, 5, 0F,0F, 0F, 0F, -3.8F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-22.5F, -13F, 15.5F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[6];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 90
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 91
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 93
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 94
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 95
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 96

		gun_3_Model[1][0].addShapeBox(-1.5F, -1F, 2.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 90

		gun_3_Model[1][1].addShapeBox(-1.5F, -1F, -4.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 91

		gun_3_Model[1][2].addShapeBox(7.5F, -1F, 2.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 93

		gun_3_Model[1][3].addShapeBox(7.5F, -1F, -4.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 94

		gun_3_Model[1][4].addShapeBox(15.5F, -1F, 2.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 95

		gun_3_Model[1][5].addShapeBox(15.5F, -1F, -4.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 96

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-22.5F, -13F, 15.5F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("LeftGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[6];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 84
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 85
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 86
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 87
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 88
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 89

		gun_4_Model[0][0].addShapeBox(-11F, -1.5F, -3F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84

		gun_4_Model[0][1].addShapeBox(2F, -1.5F, -3F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 85

		gun_4_Model[0][2].addShapeBox(-11F, -1.5F, 3F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 86

		gun_4_Model[0][3].addShapeBox(2F, -1.5F, 3F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -3.8F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 87

		gun_4_Model[0][4].addShapeBox(-11F, -1.5F, -8F, 13, 4, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88

		gun_4_Model[0][5].addShapeBox(2F, -1.5F, -8F, 6, 4, 5, 0F,0F, 0F, 0F, -3.8F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-80.5F, -13F, 1F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[6];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 90
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 91
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 93
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 94
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 95
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 96

		gun_4_Model[1][0].addShapeBox(-1.5F, -1F, 2.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 90

		gun_4_Model[1][1].addShapeBox(-1.5F, -1F, -4.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 91

		gun_4_Model[1][2].addShapeBox(7.5F, -1F, 2.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 93

		gun_4_Model[1][3].addShapeBox(7.5F, -1F, -4.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 94

		gun_4_Model[1][4].addShapeBox(15.5F, -1F, 2.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 95

		gun_4_Model[1][5].addShapeBox(15.5F, -1F, -4.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 96

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-80.5F, -13F, 1F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RearUpperGun", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[6];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 153, 129, textureX, textureY); // Box 84
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 85
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 86
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 87
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // Box 88
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 89

		gun_5_Model[0][0].addShapeBox(-11F, -1.5F, -3F, 13, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 84

		gun_5_Model[0][1].addShapeBox(2F, -1.5F, -3F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 85

		gun_5_Model[0][2].addShapeBox(-11F, -1.5F, 3F, 13, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F); // Box 86

		gun_5_Model[0][3].addShapeBox(2F, -1.5F, 3F, 6, 4, 5, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, -3.8F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F); // Box 87

		gun_5_Model[0][4].addShapeBox(-11F, -1.5F, -8F, 13, 4, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 88

		gun_5_Model[0][5].addShapeBox(2F, -1.5F, -8F, 6, 4, 5, 0F,0F, 0F, 0F, -3.8F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3.8F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 89

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-102.5F, -9F, 1F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[6];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 90
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 91
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 93
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 94
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 95
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 96

		gun_5_Model[1][0].addShapeBox(-1.5F, -1F, 2.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 90

		gun_5_Model[1][1].addShapeBox(-1.5F, -1F, -4.2F, 9, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 91

		gun_5_Model[1][2].addShapeBox(7.5F, -1F, 2.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 93

		gun_5_Model[1][3].addShapeBox(7.5F, -1F, -4.2F, 8, 2, 2, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 94

		gun_5_Model[1][4].addShapeBox(15.5F, -1F, 2.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 95

		gun_5_Model[1][5].addShapeBox(15.5F, -1F, -4.2F, 10, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 96

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-102.5F, -9F, 1F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RearLowerGun", gun_5_Model);
	}
}