//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRomeo extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelRomeo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[91];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 53
		bodyModel[51] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 54
		bodyModel[52] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 55
		bodyModel[53] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 56
		bodyModel[54] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 57
		bodyModel[55] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 58
		bodyModel[56] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 59
		bodyModel[57] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 60
		bodyModel[58] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 61
		bodyModel[59] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 62
		bodyModel[60] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 63
		bodyModel[61] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 64
		bodyModel[62] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 65
		bodyModel[63] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 66
		bodyModel[64] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 67
		bodyModel[65] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 68
		bodyModel[66] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 69
		bodyModel[67] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 70
		bodyModel[68] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 71
		bodyModel[69] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 72
		bodyModel[70] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 73
		bodyModel[71] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 74
		bodyModel[72] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 75
		bodyModel[73] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 76
		bodyModel[74] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 77
		bodyModel[75] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 78
		bodyModel[76] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 79
		bodyModel[77] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 80
		bodyModel[78] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 81
		bodyModel[79] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 82
		bodyModel[80] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 83
		bodyModel[81] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 84
		bodyModel[82] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 85
		bodyModel[83] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 87
		bodyModel[84] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 88
		bodyModel[85] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 89
		bodyModel[86] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 92
		bodyModel[87] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 93
		bodyModel[88] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 94
		bodyModel[89] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 95
		bodyModel[90] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 96

		bodyModel[0].addShapeBox(0F, 0F, 0F, 45, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 3
		bodyModel[0].setRotationPoint(-20F, 4F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 45, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F); // Box 4
		bodyModel[1].setRotationPoint(-20F, 0F, -2F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 22, 6, 11, 0F,0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -1F); // Box 5
		bodyModel[2].setRotationPoint(-42F, 4F, -5.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 22, 4, 11, 0F,0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(-42F, 0F, -5.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 45, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 7
		bodyModel[4].setRotationPoint(-20F, 10F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 22, 4, 11, 0F,0F, 0.5F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, -1F, 0F, 0F, -5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -5F); // Box 8
		bodyModel[5].setRotationPoint(-42F, 10F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, -1.5F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0.5F, -0.5F, -1.5F); // Box 9
		bodyModel[6].setRotationPoint(-47F, 4F, -5.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 4, 9, 0F,0.5F, 2.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 2.5F, -0.5F, 0.5F, -2F, -3.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, -2F, -3.5F); // Box 10
		bodyModel[7].setRotationPoint(-47F, 10F, -4.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0.5F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 11
		bodyModel[8].setRotationPoint(-47F, 12F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F); // Box 12
		bodyModel[9].setRotationPoint(-56F, 12F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, 1F, -3.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 1F, -3.5F, 0F, -3F, -2F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0F, -3F, -2F); // Box 13
		bodyModel[10].setRotationPoint(-56F, 4F, -5.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, 2F, -3F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F, -1.5F, 0F, 2F, -3F, 0F, 1F, -5F, 0.5F, 1F, -4.5F, 0.5F, 1F, -4.5F, 0F, 1F, -5F); // Box 14
		bodyModel[11].setRotationPoint(-56F, 7F, -5.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,0.5F, 0F, -4F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0.5F, 0F, -4F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 15
		bodyModel[12].setRotationPoint(-47F, 0F, -5.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 4, 11, 0F,0F, -0.5F, -4.5F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, -0.5F, -4.5F, 0F, -1F, -3.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, -1F, -3.5F); // Box 16
		bodyModel[13].setRotationPoint(-56F, 0F, -5.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, -0.5F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -2.5F, 0F, -0.2F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1.8F); // Box 17
		bodyModel[14].setRotationPoint(-67F, 3F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 4, 5, 0F,0F, -1F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1F, -2F, 0F, -0.5F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -1.5F); // Box 18
		bodyModel[15].setRotationPoint(-67F, 0F, -2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 4, 5, 0F,-1F, -2F, -2.4F, 0F, -1F, -2F, 0F, -1F, -2F, -1F, -2F, -2.4F, 0.5F, -0.5F, -2.4F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0.5F, -0.5F, -2.4F); // Box 19
		bodyModel[16].setRotationPoint(-75F, 0F, -2.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F,0F, 2.2F, -2.5F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, 2.2F, -2.5F, 0F, 1F, -3.25F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 1F, -3.25F); // Box 20
		bodyModel[17].setRotationPoint(-67F, 7F, -3.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.3F); // Box 21
		bodyModel[18].setRotationPoint(-67F, 12F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, -0.2F, 0F, 2F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 2F, -0.2F, 0F, -2.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-64.5F, 7.2F, 0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, -0.2F, 0F, -2.5F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2.5F, -0.2F, 0F, 2F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 23
		bodyModel[20].setRotationPoint(-64.5F, 7.2F, -7.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.3F); // Box 24
		bodyModel[21].setRotationPoint(7F, -7F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F); // Box 25
		bodyModel[22].setRotationPoint(7F, -8F, -2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,0F, 0F, -1.6F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.6F, 0.3F, -0.4F, -1.5F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0.3F, -0.4F, -1.5F); // Box 26
		bodyModel[23].setRotationPoint(-2F, -7F, -2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0.7F, 0.1F, -1.8F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.7F, 0.1F, -1.8F, 0F, 0F, -1.6F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.6F); // Box 27
		bodyModel[24].setRotationPoint(-2F, -8F, -2F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0.4F, -0.3F, -0.7F, 0.4F, -0.3F, -0.7F, 0F, 0F, 0F, 0F, -0.4F, 0.1F, 0.4F, -0.5F, -0.6F, 0.4F, -0.5F, -0.6F, 0F, -0.4F, 0.1F); // Box 28
		bodyModel[25].setRotationPoint(16F, -7F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -0.3F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.4F, 0.3F, -0.7F, 0.4F, 0.3F, -0.7F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(16F, -8F, -2F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, -1.6F, 0.7F, -0.1F, -1.8F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.7F, -0.1F, -1.8F); // Box 30
		bodyModel[27].setRotationPoint(-2F, -9F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, -0.4F, -1F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1.2F, 0F, -0.4F, -1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F); // Box 31
		bodyModel[28].setRotationPoint(7F, -9F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.4F, -1.2F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -1.5F, 0F, -0.4F, -1.2F, 0F, 0F, -0.3F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0F, 0F, -0.3F); // Box 32
		bodyModel[29].setRotationPoint(16F, -9F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.2F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.8F, 0.4F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.8F); // Box 33
		bodyModel[30].setRotationPoint(7F, -12.4F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, 0F, 0F, 0F); // Box 34
		bodyModel[31].setRotationPoint(11F, -12.4F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(9F, -12.4F, -1F);

		bodyModel[33].addShapeBox(-0.5F, 0F, 0F, 1, 10, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 36
		bodyModel[33].setRotationPoint(4.3F, -18F, -0.5F);

		bodyModel[34].addShapeBox(-0.5F, 0F, 0F, 1, 10, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 37
		bodyModel[34].setRotationPoint(6F, -18F, -0.5F);

		bodyModel[35].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F, -0.1F, 0.4F, -0.1F); // Box 38
		bodyModel[35].setRotationPoint(6F, -19F, -0.5F);

		bodyModel[36].addShapeBox(-0.5F, 0F, 0F, 1, 12, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 39
		bodyModel[36].setRotationPoint(8F, -24F, -0.5F);

		bodyModel[37].addShapeBox(-0.5F, 0F, 0F, 1, 12, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 40
		bodyModel[37].setRotationPoint(10.7F, -24F, -0.5F);

		bodyModel[38].addShapeBox(-0.5F, 0F, 0F, 1, 11, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 41
		bodyModel[38].setRotationPoint(9.8F, -23F, -0.5F);

		bodyModel[39].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F, 0.15F, -0.2F, -0.25F); // Box 42
		bodyModel[39].setRotationPoint(9.5F, -23.6F, -0.5F);

		bodyModel[40].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0.1F, 0.4F, -0.4F, 0.1F, 0.4F, -0.4F, 0.1F, 0.4F, -0.4F, 0.1F, 0.4F, -0.4F, 0.1F, 0.4F, -0.4F, 0.1F, 0.4F, -0.4F, 0.1F, 0.4F, -0.4F, 0.1F, 0.4F); // Box 43
		bodyModel[40].setRotationPoint(4.3F, -19.5F, -0.5F);

		bodyModel[41].addShapeBox(-0.5F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F, -0.3F, 0.1F, -0.2F); // Box 44
		bodyModel[41].setRotationPoint(4.1F, -19F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0.3F, 0F, -1.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.3F, 0F, -1.5F, 1F, -0.8F, -1.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 1F, -0.8F, -1.4F); // Box 45
		bodyModel[42].setRotationPoint(-2F, -3.4F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,1F, -0.8F, -1.4F, 0F, -1.3F, 0.8F, 0F, -1.3F, 0.8F, 1F, -0.8F, -1.4F, 4.3F, 1.5F, -1F, 0F, 2F, 1.8F, 0F, 2F, 1.8F, 4.3F, 1.5F, -1F); // Box 46
		bodyModel[43].setRotationPoint(-2F, -2F, -2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.3F, 0.8F, 0.5F, -0.3F, 0.8F, 0.5F, -0.3F, 0.8F, 0F, -0.3F, 0.8F, 0F, 1F, 1.8F, 0.5F, 0.7F, 1.5F, 0.5F, 0.7F, 1.5F, 0F, 1F, 1.8F); // Box 47
		bodyModel[44].setRotationPoint(7F, -1F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 7, 1, 4, 0F,0.5F, -0.3F, 0.8F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0.5F, -0.3F, 0.8F, 0.5F, 0.7F, 1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0.7F, 1.5F); // Box 48
		bodyModel[45].setRotationPoint(18F, -1F, -2F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 9, 3, 4, 0F,0F, 0F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F); // Box 49
		bodyModel[46].setRotationPoint(7F, -3.4F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.4F); // Box 50
		bodyModel[47].setRotationPoint(-5F, -9F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[48].setRotationPoint(-1F, -9F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.7F, -1F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.7F, -1F, -0.25F); // Box 52
		bodyModel[49].setRotationPoint(-75F, 12F, -0.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0.5F, -0.5F, -3.4F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0.5F, -0.5F, -3.4F, 0.7F, 0.2F, -3.4F, 0F, -0.2F, -1.8F, 0F, -0.2F, -1.8F, 0.7F, 0.2F, -3.4F); // Box 53
		bodyModel[50].setRotationPoint(-75F, 3F, -3.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 54
		bodyModel[51].setRotationPoint(-70.5F, 7.5F, 0F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 55
		bodyModel[52].setRotationPoint(-70.5F, 7.5F, -4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 4, 7, 0F,0F, 2F, -3.25F, 0F, 2.2F, -2.5F, 0F, 2.2F, -2.5F, 0F, 2F, -3.25F, 0F, 1F, -3.25F, 0F, 1F, -3.25F, 0F, 1F, -3.25F, 0F, 1F, -3.25F); // Box 56
		bodyModel[53].setRotationPoint(-71F, 7F, -3.5F);

		bodyModel[54].addShapeBox(-4F, 0F, 0F, 5, 6, 1, 0F,0F, 0.2F, -0.45F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, 0F, 0.2F, -0.45F, 0F, 0.2F, -0.45F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, 0F, 0.2F, -0.45F); // Box 57
		bodyModel[54].setRotationPoint(-72F, 5.5F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 58
		bodyModel[55].setRotationPoint(-66.7F, 7.2F, -4.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 59
		bodyModel[56].setRotationPoint(-66.7F, 6.2F, -4.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0F, -1F); // Box 60
		bodyModel[57].setRotationPoint(-66.7F, 8.2F, -4.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 61
		bodyModel[58].setRotationPoint(-66.7F, 7.2F, 1.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 62
		bodyModel[59].setRotationPoint(-66.7F, 6.2F, 1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0F, -1F); // Box 63
		bodyModel[60].setRotationPoint(-66.7F, 8.2F, 1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 16, 6, 14, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F); // Box 64
		bodyModel[61].setRotationPoint(25F, 4F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 5F); // Box 65
		bodyModel[62].setRotationPoint(25F, 0F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 16, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 66
		bodyModel[63].setRotationPoint(25F, 10F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 16, 1, 4, 0F,0F, -0.3F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 1F); // Box 67
		bodyModel[64].setRotationPoint(25F, -1F, -2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 15, 4, 4, 0F,0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, 0F, 4.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 4.5F); // Box 68
		bodyModel[65].setRotationPoint(41F, 0F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 15, 4, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 69
		bodyModel[66].setRotationPoint(41F, 10F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 15, 6, 14, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1.5F); // Box 70
		bodyModel[67].setRotationPoint(41F, 4F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -0.1F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, -0.1F, -0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F); // Box 71
		bodyModel[68].setRotationPoint(41F, -1F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 4, 8, 0F,0F, 0F, 0F, 0.5F, -1.5F, -2.7F, 0.5F, -1.5F, -2.7F, 0F, 0F, 0F, 0F, 0F, -3F, 0.5F, 0.2F, -3.5F, 0.5F, 0.2F, -3.5F, 0F, 0F, -3F); // Box 72
		bodyModel[69].setRotationPoint(56F, 10F, -4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 6, 8, 0F,0F, 0F, 0.5F, 0.5F, 0.8F, -1.8F, 0.5F, 0.8F, -1.8F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 1.5F, -2.7F, 0.5F, 1.5F, -2.7F, 0F, 0F, 0F); // Box 73
		bodyModel[70].setRotationPoint(56F, 4F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 4, 2, 0F,0F, 0F, 1.5F, 0.5F, -1.8F, 0.8F, 0.5F, -1.8F, 0.8F, 0F, 0F, 1.5F, 0F, 0F, 3.5F, 0.5F, -0.8F, 1.2F, 0.5F, -0.8F, 1.2F, 0F, 0F, 3.5F); // Box 74
		bodyModel[71].setRotationPoint(56F, 0F, -1F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0.3F, -0.5F, 0.5F, 0.5F, -1.2F, 0.5F, 0.5F, -1.2F, 0F, 0.3F, -0.5F, 0F, 0F, 0.5F, 0.5F, 1.8F, -0.2F, 0.5F, 1.8F, -0.2F, 0F, 0F, 0.5F); // Box 75
		bodyModel[72].setRotationPoint(56F, -1F, -2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F,0F, 0.8F, 0.2F, 0F, 0.8F, -1.4F, 0F, 0.8F, -1.4F, 0F, 0.8F, 0.2F, 0F, 1.5F, -0.7F, 0F, -1F, -1.9F, 0F, -1F, -1.9F, 0F, 1.5F, -0.7F); // Box 76
		bodyModel[73].setRotationPoint(66.5F, 4F, -2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0.2F, 0.8F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.8F, 0F, -0.8F, 1.2F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, 1.2F); // Box 77
		bodyModel[74].setRotationPoint(66.5F, 2F, -1F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0.5F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1.8F, 0.8F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.8F); // Box 78
		bodyModel[75].setRotationPoint(66.5F, -1F, -1F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[76].setRotationPoint(70.2F, -4F, -0.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0.2F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, -0.4F); // Box 80
		bodyModel[77].setRotationPoint(68.2F, -4F, -0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, 0F, 0F, 0F); // Box 81
		bodyModel[78].setRotationPoint(71.2F, -4F, -0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, 0.8F, -1.4F, 1.1F, 0.8F, -1.8F, 1.1F, 0.8F, -1.8F, 0F, 0.8F, -1.4F, 0F, -1F, -1.9F, 0F, -3.5F, -1.9F, 0F, -3.5F, -1.9F, 0F, -1F, -1.9F); // Box 82
		bodyModel[79].setRotationPoint(73.5F, 4F, -2F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.2F, 0.2F, 0.4F, 0.2F, -0.7F, 0.4F, 0.2F, -0.7F, 0F, 0.2F, 0.2F, 0F, -0.8F, -0.4F, 0.1F, -0.8F, -0.8F, 0.1F, -0.8F, -0.8F, 0F, -0.8F, -0.4F); // Box 83
		bodyModel[80].setRotationPoint(73.5F, 2F, -1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.8F, -0.2F, -0.3F, 0.4F, -0.7F, -0.3F, 0.4F, -0.7F, 0F, 0.8F, -0.2F, 0F, 1.8F, 0.2F, 0.4F, 1.8F, -0.7F, 0.4F, 1.8F, -0.7F, 0F, 1.8F, 0.2F); // Box 84
		bodyModel[81].setRotationPoint(73.5F, -1F, -1F);

		bodyModel[82].addShapeBox(9F, 0F, 0F, 2, 2, 1, 0F,0F, 2.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.2F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F); // Box 85
		bodyModel[82].setRotationPoint(65F, 11F, -0.5F);

		bodyModel[83].addShapeBox(9F, 0F, 0F, 2, 2, 1, 0F,0F, 2.2F, 0F, 0F, 0.5F, 0F, -0.8F, -0.2F, 0.2F, 0F, 1.2F, 0.6F, 0F, 1.4F, 0F, 0F, 0F, 0F, -0.8F, -0.7F, 0.2F, 0F, 0F, 0.7F); // Box 87
		bodyModel[83].setRotationPoint(65F, 11F, 0.5F);

		bodyModel[84].addShapeBox(9F, 0F, 0F, 6, 2, 1, 0F,0F, 2.5F, -0.5F, 0F, 2.5F, -0.1F, 0F, 1.5F, 0.4F, 3.2F, 1.2F, 0F, 0F, 1F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0.5F, 4.2F, -0.7F, -0.2F); // Box 88
		bodyModel[84].setRotationPoint(56F, 11F, 0.5F);

		bodyModel[85].addShapeBox(9F, 0F, 0F, 3, 2, 1, 0F,0F, 2.6F, 0F, 0F, 2.2F, 0F, 0F, 1.2F, 0.6F, 0F, 1.5F, 0.4F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.5F); // Box 89
		bodyModel[85].setRotationPoint(62F, 11F, 0.5F);

		bodyModel[86].addShapeBox(9F, 0F, 0F, 2, 2, 1, 0F,0F, 1.2F, 0.6F, -0.8F, -0.2F, 0.2F, 0F, 0.5F, 0F, 0F, 2.2F, 0F, 0F, 0F, 0.7F, -0.8F, -0.7F, 0.2F, 0F, 0F, 0F, 0F, 1.4F, 0F); // Box 92
		bodyModel[86].setRotationPoint(65F, 11F, -1.5F);

		bodyModel[87].addShapeBox(9F, 0F, 0F, 3, 2, 1, 0F,0F, 2.5F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, 2.5F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F); // Box 93
		bodyModel[87].setRotationPoint(62F, 11F, -0.5F);

		bodyModel[88].addShapeBox(9F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F); // Box 94
		bodyModel[88].setRotationPoint(57F, 13F, -0.5F);

		bodyModel[89].addShapeBox(9F, 0F, 0F, 6, 2, 1, 0F,3.2F, 1.2F, 0F, 0F, 1.5F, 0.4F, 0F, 2.5F, -0.1F, 0F, 2.5F, -0.5F, 4.2F, -0.7F, -0.2F, 0F, 0F, 0.5F, 0F, 1.4F, 0F, 0F, 1F, 0F); // Box 95
		bodyModel[89].setRotationPoint(56F, 11F, -1.5F);

		bodyModel[90].addShapeBox(9F, 0F, 0F, 3, 2, 1, 0F,0F, 1.5F, 0.4F, 0F, 1.2F, 0.6F, 0F, 2.2F, 0F, 0F, 2.6F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.7F, 0F, 1.4F, 0F, 0F, 1.4F, 0F); // Box 96
		bodyModel[90].setRotationPoint(62F, 11F, -1.5F);
	}
}