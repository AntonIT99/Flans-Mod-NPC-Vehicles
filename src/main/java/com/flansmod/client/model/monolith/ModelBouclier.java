//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bouclier
// Model Creator: 
// Created on: 30.07.2020 - 19:37:07
// Last changed on: 30.07.2020 - 19:37:07

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBouclier extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelBouclier() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[87];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 14
		bodyModel[6] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 39
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 40
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 48
		bodyModel[14] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 49
		bodyModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		bodyModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 51
		bodyModel[17] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 52
		bodyModel[18] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 53
		bodyModel[19] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 55
		bodyModel[20] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 56
		bodyModel[21] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 57
		bodyModel[22] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 58
		bodyModel[23] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 59
		bodyModel[24] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 63
		bodyModel[25] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 64
		bodyModel[26] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 65
		bodyModel[27] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 71
		bodyModel[28] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 72
		bodyModel[29] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 73
		bodyModel[30] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 74
		bodyModel[31] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 76
		bodyModel[32] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 77
		bodyModel[33] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 83
		bodyModel[34] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 84
		bodyModel[35] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 86
		bodyModel[36] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 88
		bodyModel[37] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 89
		bodyModel[38] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 90
		bodyModel[39] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 91
		bodyModel[40] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 92
		bodyModel[41] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 93
		bodyModel[42] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 94
		bodyModel[43] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 96
		bodyModel[44] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 70
		bodyModel[45] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 71
		bodyModel[46] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 72
		bodyModel[47] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 19
		bodyModel[48] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 20
		bodyModel[49] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 21
		bodyModel[50] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 31
		bodyModel[51] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 32
		bodyModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
		bodyModel[53] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 256
		bodyModel[54] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 257
		bodyModel[55] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 258
		bodyModel[56] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 82
		bodyModel[57] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 83
		bodyModel[58] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 84
		bodyModel[59] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 85
		bodyModel[60] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 86
		bodyModel[61] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 87
		bodyModel[62] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 88
		bodyModel[63] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 89
		bodyModel[64] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 90
		bodyModel[65] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 91
		bodyModel[66] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 92
		bodyModel[67] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 25
		bodyModel[68] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 26
		bodyModel[69] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 27
		bodyModel[70] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 28
		bodyModel[71] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		bodyModel[72] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 30
		bodyModel[73] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 99
		bodyModel[74] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 100
		bodyModel[75] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 101
		bodyModel[76] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 102
		bodyModel[77] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 103
		bodyModel[78] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 104
		bodyModel[79] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 105
		bodyModel[80] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 106
		bodyModel[81] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 107
		bodyModel[82] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 108
		bodyModel[83] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 109
		bodyModel[84] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 110
		bodyModel[85] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 111
		bodyModel[86] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 112

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,35F, 0.2F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, 35F, 0.2F, 0F, 35F, 0.5F, 0F, 34F, 0.5F, 0F, 34F, 0.5F, 0F, 35F, 0.5F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-2F, 0.5F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 41, 3, 14, 0F,-0.5F, -0.5F, 0F, 0.6F, -0.5F, -4.5F, 0.6F, -0.5F, -4.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, -1F, -4.5F, 0.5F, -1F, -4.5F, 0F, 0F, 0F); // Box 4
		bodyModel[1].setRotationPoint(33F, -4F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 4, 14, 0F,0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(33F, -1F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F,0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 8
		bodyModel[3].setRotationPoint(26.5F, -12F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F); // Box 10
		bodyModel[4].setRotationPoint(-75F, 0F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 38, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		bodyModel[5].setRotationPoint(31F, -37F, -0.5F);
		bodyModel[5].rotateAngleZ = 0.03490659F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 15
		bodyModel[6].setRotationPoint(-43F, -21F, -0.5F);
		bodyModel[6].rotateAngleZ = 0.01745329F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F); // Box 18
		bodyModel[7].setRotationPoint(-43F, -20F, -3F);
		bodyModel[7].rotateAngleZ = -0.08726646F;

		bodyModel[8].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 22
		bodyModel[8].setRotationPoint(-17F, -1.5F, 0F);

		bodyModel[9].addShapeBox(-5.5F, -0.7F, -1.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[9].setRotationPoint(-17F, -1.5F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[10].setRotationPoint(-52.5F, -7F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 40
		bodyModel[11].setRotationPoint(-53.5F, -7F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 41
		bodyModel[12].setRotationPoint(-58F, -7F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 5, 14, 0F,4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, -1.5F, -3F, -0.5F, 1.5F, -2F, -0.5F, 1.5F, -2F, 4.5F, -1.5F, -3F); // Box 48
		bodyModel[13].setRotationPoint(-58.5F, 3F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 5, 12, 0F,2F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, -5F, -4F, -2.8F, -4F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -4F, -2.8F, -4F); // Box 49
		bodyModel[14].setRotationPoint(-72F, 3F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 30, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 1F, -2F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, 0F, 1F, -2F); // Box 50
		bodyModel[15].setRotationPoint(33F, 3F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 6, 14, 0F,35F, 0F, 0F, 34F, 0F, 0F, 34F, 0F, 0F, 35F, 0F, 0F, 40F, 0.5F, -2F, 34F, 0F, -2F, 34F, 0F, -2F, 40F, 0.5F, -2F); // Box 51
		bodyModel[16].setRotationPoint(-2F, 3F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 6, 12, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -0.5F, -3.5F, -0.8F, -2F, -5.5F, -0.8F, -2F, -5.5F, 0F, -0.5F, -3.5F); // Box 52
		bodyModel[17].setRotationPoint(63F, 3F, -6F);

		bodyModel[18].addShapeBox(-8.5F, -1.5F, 0F, 12, 12, 1, 0F,-3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F); // Box 53
		bodyModel[18].setRotationPoint(-74.8F, -10F, -0.5F);
		bodyModel[18].rotateAngleZ = 0.08726646F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 2, 14, 0F,8F, 0.4F, -1F, 8F, 0.2F, 0F, 8F, 0.2F, 0F, 8F, 0.4F, -1F, 8F, 0.5F, -1F, 8F, 0.5F, 0F, 8F, 0.5F, 0F, 8F, 0.5F, -1F); // Box 55
		bodyModel[19].setRotationPoint(-55F, 0.5F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 11, 5, 12, 0F,0F, 0F, -2.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 56
		bodyModel[20].setRotationPoint(63F, -2F, -6F);

		bodyModel[21].addShapeBox(-5.5F, -0.7F, 0.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 57
		bodyModel[21].setRotationPoint(-17F, -1.5F, 0F);

		bodyModel[22].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 58
		bodyModel[22].setRotationPoint(-17F, -1.5F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[23].setRotationPoint(-18.5F, -1F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 63
		bodyModel[24].setRotationPoint(44.5F, -6.5F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[25].setRotationPoint(45.5F, -6.5F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 65
		bodyModel[26].setRotationPoint(47F, -6.5F, -0.5F);

		bodyModel[27].addShapeBox(-5.5F, -0.7F, -1.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 71
		bodyModel[27].setRotationPoint(-35F, -1.5F, 0F);

		bodyModel[28].addShapeBox(-5.5F, -0.7F, 0.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 72
		bodyModel[28].setRotationPoint(-35F, -1.5F, 0F);

		bodyModel[29].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 73
		bodyModel[29].setRotationPoint(-35F, -1.5F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[30].setRotationPoint(-36.5F, -1F, -0.5F);

		bodyModel[31].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 76
		bodyModel[31].setRotationPoint(-35F, -1.5F, 0F);

		bodyModel[32].addShapeBox(-0.5F, -1.5F, 0F, 1, 16, 1, 0F,-0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F); // Box 77
		bodyModel[32].setRotationPoint(-74.8F, -10F, -0.5F);
		bodyModel[32].rotateAngleZ = 0.12217305F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 83
		bodyModel[33].setRotationPoint(36F, -6.5F, -2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F); // Box 84
		bodyModel[34].setRotationPoint(36F, -8.5F, -2.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 86
		bodyModel[35].setRotationPoint(33.2F, -12.5F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 88
		bodyModel[36].setRotationPoint(33.7F, -10.5F, -0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 89
		bodyModel[37].setRotationPoint(35.75F, -8F, -2.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 90
		bodyModel[38].setRotationPoint(35.75F, -8F, 1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 91
		bodyModel[39].setRotationPoint(39.25F, -8F, 0F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 92
		bodyModel[40].setRotationPoint(39.25F, -8F, -1F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 93
		bodyModel[41].setRotationPoint(37.5F, -8F, -1.8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 94
		bodyModel[42].setRotationPoint(37.5F, -8F, 0.8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 5, 1, 0F,0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 96
		bodyModel[43].setRotationPoint(-74F, 4F, -0.5F);
		bodyModel[43].rotateAngleZ = -0.12217305F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F,0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 70
		bodyModel[44].setRotationPoint(15.5F, -12F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[45].setRotationPoint(15F, -2F, -2.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[46].setRotationPoint(26F, -2F, -2.5F);

		bodyModel[47].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 19
		bodyModel[47].setRotationPoint(28.5F, -1.8F, 5.5F);

		bodyModel[48].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 20
		bodyModel[48].setRotationPoint(28.5F, -2.7F, 5.5F);
		bodyModel[48].rotateAngleY = 0.76794487F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 21
		bodyModel[49].setRotationPoint(28.5F, -2.7F, 5.5F);
		bodyModel[49].rotateAngleY = 0.76794487F;

		bodyModel[50].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 31
		bodyModel[50].setRotationPoint(28.5F, -1.8F, -6.5F);

		bodyModel[51].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 32
		bodyModel[51].setRotationPoint(28F, -2.7F, -6.5F);
		bodyModel[51].rotateAngleY = -0.76794487F;

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 33
		bodyModel[52].setRotationPoint(28F, -2.7F, -6.5F);
		bodyModel[52].rotateAngleY = -0.76794487F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 256
		bodyModel[53].setRotationPoint(9F, -5F, 2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 257
		bodyModel[54].setRotationPoint(13F, -5F, 2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 258
		bodyModel[55].setRotationPoint(19F, -5F, 2F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[56].setRotationPoint(11F, -6F, 5.8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[57].setRotationPoint(23F, -6F, 5.8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 84
		bodyModel[58].setRotationPoint(-1F, -5F, 2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 85
		bodyModel[59].setRotationPoint(-7F, -5F, 2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 86
		bodyModel[60].setRotationPoint(-11F, -5F, 2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[61].setRotationPoint(3F, -6F, 5.8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[62].setRotationPoint(-9F, -6F, 5.8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F,0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 89
		bodyModel[63].setRotationPoint(4.5F, -12F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[64].setRotationPoint(4F, -2F, -2.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F,0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 91
		bodyModel[65].setRotationPoint(-6.5F, -12F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[66].setRotationPoint(-7F, -2F, -2.5F);

		bodyModel[67].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 25
		bodyModel[67].setRotationPoint(-50.5F, -2.7F, 5.5F);
		bodyModel[67].rotateAngleY = 2.51327412F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 26
		bodyModel[68].setRotationPoint(-50.5F, -2.7F, 5.5F);
		bodyModel[68].rotateAngleY = 2.51327412F;

		bodyModel[69].addShapeBox(-0.8F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 27
		bodyModel[69].setRotationPoint(-50.5F, -1.8F, 5.5F);
		bodyModel[69].rotateAngleY = 1.74532925F;

		bodyModel[70].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 28
		bodyModel[70].setRotationPoint(-51F, -2.7F, -5F);
		bodyModel[70].rotateAngleY = 3.9618974F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 29
		bodyModel[71].setRotationPoint(-51F, -2.7F, -5F);
		bodyModel[71].rotateAngleY = 3.9618974F;

		bodyModel[72].addShapeBox(-0.8F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 30
		bodyModel[72].setRotationPoint(-50.5F, -1.8F, -5F);
		bodyModel[72].rotateAngleY = 1.74532925F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[73].setRotationPoint(-57.5F, -4.5F, -4.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 12, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[74].setRotationPoint(-56.5F, -3.5F, -2.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 101
		bodyModel[75].setRotationPoint(32F, -8.5F, -2.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[76].setRotationPoint(32.8F, -8F, -1.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 103
		bodyModel[77].setRotationPoint(73.5F, -10F, -0.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 104
		bodyModel[78].setRotationPoint(13F, -5F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 105
		bodyModel[79].setRotationPoint(19F, -5F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[80].setRotationPoint(11F, -6F, -6.8F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[81].setRotationPoint(23F, -6F, -6.8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 108
		bodyModel[82].setRotationPoint(-1F, -5F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F); // Box 109
		bodyModel[83].setRotationPoint(-7F, -5F, -7F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.4F, -2.4F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -2.4F, -2.4F); // Box 110
		bodyModel[84].setRotationPoint(-11F, -5F, -7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[85].setRotationPoint(3F, -6F, -6.8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[86].setRotationPoint(-9F, -6F, -6.8F);
	}
}