//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Surcouf
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSurcouf extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSurcouf() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[84];
		turretModel = new ModelRendererTurbo[12];
		barrelModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 51
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 52
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 26
		bodyModel[17] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 27
		bodyModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 28
		bodyModel[19] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 29
		bodyModel[20] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 31
		bodyModel[22] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 32
		bodyModel[23] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 34
		bodyModel[24] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 35
		bodyModel[25] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 36
		bodyModel[26] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 40
		bodyModel[29] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 41
		bodyModel[30] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 42
		bodyModel[31] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 43
		bodyModel[32] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 45
		bodyModel[34] = new ModelRendererTurbo(this, 257, 89, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Box 57
		bodyModel[46] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 58
		bodyModel[47] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 77
		bodyModel[48] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 78
		bodyModel[49] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 79
		bodyModel[50] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 81
		bodyModel[51] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 82
		bodyModel[52] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 83
		bodyModel[53] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Box 84
		bodyModel[54] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 85
		bodyModel[55] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 86
		bodyModel[56] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 87
		bodyModel[57] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 88
		bodyModel[58] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 89
		bodyModel[59] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 90
		bodyModel[60] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 91
		bodyModel[61] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 92
		bodyModel[62] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 93
		bodyModel[63] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 94
		bodyModel[64] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 95
		bodyModel[65] = new ModelRendererTurbo(this, 161, 121, textureX, textureY); // Box 96
		bodyModel[66] = new ModelRendererTurbo(this, 193, 121, textureX, textureY); // Box 97
		bodyModel[67] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 98
		bodyModel[68] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 99
		bodyModel[69] = new ModelRendererTurbo(this, 233, 121, textureX, textureY); // Box 100
		bodyModel[70] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 101
		bodyModel[71] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 102
		bodyModel[72] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 103
		bodyModel[73] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 104
		bodyModel[74] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 18
		bodyModel[75] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 21
		bodyModel[76] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 22
		bodyModel[77] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 23
		bodyModel[78] = new ModelRendererTurbo(this, 113, 137, textureX, textureY); // Box 109
		bodyModel[79] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 110
		bodyModel[80] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 111
		bodyModel[81] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 112
		bodyModel[82] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 113
		bodyModel[83] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 114

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 51
		bodyModel[0].setRotationPoint(86F, -11.5F, -0.5F);
		bodyModel[0].rotateAngleZ = 0.08726646F;

		bodyModel[1].addShapeBox(-10F, -3F, 0F, 15, 11, 1, 0F,-4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F); // Box 52
		bodyModel[1].setRotationPoint(86F, -11.5F, -0.5F);
		bodyModel[1].rotateAngleZ = 0.08726646F;

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 3
		bodyModel[2].setRotationPoint(-22.5F, -2F, -3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 21, 17, 5, 0F,0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 4
		bodyModel[3].setRotationPoint(-22.5F, -2F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 17, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Box 5
		bodyModel[4].setRotationPoint(-39.5F, -2F, -3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 17, 17, 5, 0F,0F, -5.5F, -0.5F, 0F, -5.5F, 0F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -6F, -0.5F, 0F, -5.5F, 0F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F); // Box 6
		bodyModel[5].setRotationPoint(-39.5F, -2F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 20, 16, 6, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F); // Box 9
		bodyModel[6].setRotationPoint(-59.5F, -2F, -3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 16, 5, 0F,0F, -5F, -1F, 0F, -5.5F, 0F, 0F, 2F, 0F, 0F, 1.5F, 0.5F, 0F, -6F, -1F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0.5F); // Box 10
		bodyModel[7].setRotationPoint(-59.5F, -2F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 31, 8, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 2F, -1F); // Box 11
		bodyModel[8].setRotationPoint(-90.5F, -1.5F, -2.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 30, 8, 5, 0F,0F, 0.5F, -2F, -16F, 3F, -2F, -16F, 3F, -2F, 0F, 0.5F, -2F, 0F, -4F, -2F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -4F, -2F); // Box 12
		bodyModel[9].setRotationPoint(-120.5F, -1.5F, -2.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 31, 8, 4, 0F,0F, -3F, -1.5F, 0F, -4.5F, 0.5F, 0F, 2F, 0F, 0F, 1F, 1F, 0F, -1F, -1.5F, 0F, 1.5F, 0.5F, 0F, 6F, 0F, 0F, 2F, 1F); // Box 13
		bodyModel[10].setRotationPoint(-90.5F, -1.5F, -6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 30, 8, 5, 0F,0F, -1F, -3.5F, 0F, -3F, -0.5F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, -5.5F, -3.5F, 0F, -1F, -0.5F, 0F, 2F, -1F, 0F, -4F, 0F); // Box 16
		bodyModel[11].setRotationPoint(-120.5F, -1.5F, -5.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 21, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0F); // Box 18
		bodyModel[12].setRotationPoint(-1.5F, -2F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 43, 11, 5, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 4F, 0F); // Box 21
		bodyModel[13].setRotationPoint(19.5F, -2F, -2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 43, 15, 5, 0F,0F, -5F, -0.5F, 0F, -3.5F, -2.5F, 0F, 0F, 1F, 0F, 2F, 0.5F, 0F, -5F, -0.5F, 0F, -7.5F, -2.5F, 0F, -4F, 1F, 0F, 0F, 0.5F); // Box 22
		bodyModel[14].setRotationPoint(19.5F, -2F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 41, 10, 2, 0F,50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, 0F, 0F, 50F, -1F, 0F, 50F, -1.5F, 0F, 50F, -1.5F, 0F, 50F, -1F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-48.5F, 6F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 7, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Box 26
		bodyModel[16].setRotationPoint(42.5F, 9.5F, -1F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 8, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[17].setRotationPoint(49.5F, 9F, -1F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 75, 3, 10, 0F,0F, 0F, 0F, 0.5F, -1F, -4F, 0.5F, -1F, -4F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 1.5F, 0F); // Box 28
		bodyModel[18].setRotationPoint(12.5F, -5F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 30, 2, 10, 0F,0F, -0.6F, -2.5F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, -0.6F, -2.5F, 0F, 5.5F, -4F, -0.5F, -0.5F, -4F, -0.5F, -0.5F, -4F, 0F, 5.5F, -4F); // Box 29
		bodyModel[19].setRotationPoint(57.5F, 3F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 47, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[20].setRotationPoint(-53.5F, -5F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 22, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, -1F, 0F, 0F, 0F); // Box 31
		bodyModel[21].setRotationPoint(62.5F, -2F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 22, 11, 4, 0F,0F, -3.5F, -0.5F, -11F, -3F, -3F, -4F, 0F, 1F, 0F, 0F, 0F, 0F, -3.5F, -0.5F, -11F, -5.5F, -3F, -4F, -6F, 1F, 0F, 0F, 0F); // Box 32
		bodyModel[22].setRotationPoint(62.5F, -2F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 22, 11, 4, 0F,0F, 0F, 0F, -4F, 0F, 1F, -11F, -3F, -3F, 0F, -3.5F, -0.5F, 0F, 0F, 0F, -4F, -6F, 1F, -11F, -5.5F, -3F, 0F, -3.5F, -0.5F); // Box 34
		bodyModel[23].setRotationPoint(62.5F, -2F, 2F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 17, 7, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 35
		bodyModel[24].setRotationPoint(-70.5F, -5F, -5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 45, 5, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 36
		bodyModel[25].setRotationPoint(-115.5F, -5F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 17, 17, 5, 0F,0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -5.5F, 0F, 0F, -5.5F, -0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -5.5F, 0F, 0F, -6F, -0.5F); // Box 38
		bodyModel[26].setRotationPoint(-39.5F, -2F, 3.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 20, 16, 5, 0F,0F, 1.5F, 0.5F, 0F, 2F, 0F, 0F, -5.5F, 0F, 0F, -5F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -6F, -1F); // Box 39
		bodyModel[27].setRotationPoint(-59.5F, -2F, 3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 21, 15, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, -5F, -0.5F, 0F, -5.5F, 0.5F, 0F, 1.5F, 0F, 0F, 0F, 0.5F, 0F, -5F, -0.5F, 0F, -3.5F, 0.5F); // Box 40
		bodyModel[28].setRotationPoint(-1.5F, -2F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 31, 8, 4, 0F,0F, 1F, 1F, 0F, 2F, 0F, 0F, -4.5F, 0.5F, 0F, -3F, -1.5F, 0F, 2F, 1F, 0F, 6F, 0F, 0F, 1.5F, 0.5F, 0F, -1F, -1.5F); // Box 41
		bodyModel[29].setRotationPoint(-90.5F, -1.5F, 2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 30, 8, 5, 0F,0F, 0.5F, 0F, 0F, 1F, -1F, 0F, -3F, -0.5F, 0F, -1F, -3.5F, 0F, -4F, 0F, 0F, 2F, -1F, 0F, -1F, -0.5F, 0F, -5.5F, -3.5F); // Box 42
		bodyModel[30].setRotationPoint(-120.5F, -1.5F, 0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 43, 15, 5, 0F,0F, 2F, 0.5F, 0F, 0F, 1F, 0F, -3.5F, -2.5F, 0F, -5F, -0.5F, 0F, 0F, 0.5F, 0F, -4F, 1F, 0F, -7.5F, -2.5F, 0F, -5F, -0.5F); // Box 43
		bodyModel[31].setRotationPoint(19.5F, -2F, 3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 35, 2, 10, 0F,0F, 0F, -1F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, -1F, 0F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F); // Box 44
		bodyModel[32].setRotationPoint(-41.5F, -8.5F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 35, 2, 10, 0F,-1F, 0F, -3F, 0F, 2.5F, -2F, 0F, 2.5F, -2F, -1F, 0F, -3F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, -1F); // Box 45
		bodyModel[33].setRotationPoint(-41.5F, -10.5F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 35, 2, 10, 0F,0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 46
		bodyModel[34].setRotationPoint(-41.5F, -6.5F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 47
		bodyModel[35].setRotationPoint(-22F, -19.5F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(-27.5F, -12.5F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, -1.8F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.8F, -0.3F, 0F, -1.8F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -0.3F); // Box 49
		bodyModel[37].setRotationPoint(-127.5F, -1.5F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, -1.8F, 0.3F, 0F, 0.5F, 0F, 0F, -1F, 0.5F, -3F, -1.5F, -0.4F, 0F, -1.8F, 0.3F, 0F, 0F, 0F, 0F, -1.5F, 0.5F, -3F, -1.8F, -0.4F); // Box 50
		bodyModel[38].setRotationPoint(-127.5F, -1.5F, 0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,-3F, -1.5F, -0.4F, 0F, -1F, 0.5F, 0F, 0.5F, 0F, 0F, -1.8F, 0.3F, -3F, -1.8F, -0.4F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, -1.8F, 0.3F); // Box 51
		bodyModel[39].setRotationPoint(-127.5F, -1.5F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 14, 4, 5, 0F,0F, -0.5F, -2F, 0F, -0.5F, -1.5F, 0F, 3F, -2F, 0F, 0.5F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 52
		bodyModel[40].setRotationPoint(-120.5F, -1.5F, -3.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 14, 4, 5, 0F,0F, 0.5F, -2F, 0F, 3F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, -2F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, -2F); // Box 53
		bodyModel[41].setRotationPoint(-120.5F, -1.5F, -1.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.9F); // Box 54
		bodyModel[42].setRotationPoint(7.5F, -5F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[43].setRotationPoint(7.5F, -5F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 19, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[44].setRotationPoint(-6.5F, -2F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 21, 17, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -5.5F, 0F, 0F, -5.5F, 0F); // Box 57
		bodyModel[45].setRotationPoint(-22.5F, -2F, 3.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 21, 15, 5, 0F,0F, -5.5F, 0.5F, 0F, -5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -3.5F, 0.5F, 0F, -5F, -0.5F, 0F, 0F, 0.5F, 0F, 1.5F, 0F); // Box 58
		bodyModel[46].setRotationPoint(-1.5F, -2F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[47].setRotationPoint(-11.5F, -14.5F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[48].setRotationPoint(-11.5F, -14.5F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 79
		bodyModel[49].setRotationPoint(-11.5F, -14.5F, 1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[50].setRotationPoint(-11.5F, -15.5F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[51].setRotationPoint(-11.5F, -15.5F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 83
		bodyModel[52].setRotationPoint(-11.5F, -15.5F, 1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 84
		bodyModel[53].setRotationPoint(-22F, -30.5F, -0.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F); // Box 85
		bodyModel[54].setRotationPoint(-22F, -27.5F, -0.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 86
		bodyModel[55].setRotationPoint(-44.5F, -8.5F, -4F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-1.5F, -0.5F, -2F, 1F, 0F, -2F, 1F, 0F, -2F, -1.5F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 87
		bodyModel[56].setRotationPoint(-44.5F, -10.5F, -4F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 88
		bodyModel[57].setRotationPoint(-16F, -19.5F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 89
		bodyModel[58].setRotationPoint(-29.5F, -13.5F, -0.5F);

		bodyModel[59].addShapeBox(-0.5F, -0.8F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[59].setRotationPoint(-29F, -13.5F, 0F);
		bodyModel[59].rotateAngleZ = -0.52359878F;

		bodyModel[60].addShapeBox(-2.5F, -0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 91
		bodyModel[60].setRotationPoint(-29F, -13.5F, 0F);
		bodyModel[60].rotateAngleZ = -0.52359878F;

		bodyModel[61].addShapeBox(-2.5F, -0.8F, -0.5F, 2, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 92
		bodyModel[61].setRotationPoint(-34.5F, -13.5F, 0F);
		bodyModel[61].rotateAngleZ = -0.52359878F;

		bodyModel[62].addShapeBox(-0.5F, -0.8F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[62].setRotationPoint(-34.5F, -13.5F, 0F);
		bodyModel[62].rotateAngleZ = -0.52359878F;

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 94
		bodyModel[63].setRotationPoint(-35F, -13.5F, -0.5F);

		bodyModel[64].addShapeBox(-0.5F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[64].setRotationPoint(-81.5F, -4.5F, -7F);

		bodyModel[65].addShapeBox(-0.5F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[65].setRotationPoint(-80.3F, -4.5F, -7F);

		bodyModel[66].addShapeBox(-0.5F, 0F, 0F, 1, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[66].setRotationPoint(-82.7F, -4.5F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[67].setRotationPoint(-120.5F, 1.5F, -0.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 11, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[68].setRotationPoint(-126.5F, 1.5F, -0.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 75, 5, 10, 0F,0F, -2F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 1.5F, 0F); // Box 100
		bodyModel[69].setRotationPoint(12.5F, -2F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,-1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[70].setRotationPoint(50.5F, -4F, -8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F); // Box 102
		bodyModel[71].setRotationPoint(50.5F, -4F, 2F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,-1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[72].setRotationPoint(-91.5F, 5F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F); // Box 104
		bodyModel[73].setRotationPoint(-91.5F, 5F, 5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[74].setRotationPoint(-106.5F, 9.5F, -3.5F);

		bodyModel[75].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[75].setRotationPoint(-106.5F, 10F, -3F);

		bodyModel[76].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[76].setRotationPoint(-106.5F, 10F, -3F);
		bodyModel[76].rotateAngleX = 2.0943951F;

		bodyModel[77].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[77].setRotationPoint(-106.5F, 10F, -3F);
		bodyModel[77].rotateAngleX = 4.1887902F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 53, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[78].setRotationPoint(-106.5F, 9.5F, 2.5F);

		bodyModel[79].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[79].setRotationPoint(-106.5F, 10F, 3F);

		bodyModel[80].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[80].setRotationPoint(-106.5F, 10F, 3F);
		bodyModel[80].rotateAngleX = 2.0943951F;

		bodyModel[81].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[81].setRotationPoint(-106.5F, 10F, 3F);
		bodyModel[81].rotateAngleX = 4.1887902F;

		bodyModel[82].addShapeBox(-10F, -3F, 0F, 15, 11, 1, 0F,-4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F); // Box 113
		bodyModel[82].setRotationPoint(-41F, -18F, -0.5F);
		bodyModel[82].rotateAngleZ = 0.08726646F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 114
		bodyModel[83].setRotationPoint(-41F, -18F, -0.5F);
		bodyModel[83].rotateAngleZ = 0.08726646F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 59
		turretModel[1] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 60
		turretModel[2] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 61
		turretModel[3] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 62
		turretModel[4] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 63
		turretModel[5] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 64
		turretModel[6] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 65
		turretModel[7] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 66
		turretModel[8] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 67
		turretModel[9] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 68
		turretModel[10] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 69
		turretModel[11] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 70

		turretModel[0].addShapeBox(0F, 0F, 0F, 14, 3, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 59
		turretModel[0].setRotationPoint(-6.5F, -5F, -5F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0F, -0.1F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -3.6F, 0F, 0F, -3.6F, 0F, 0F, -0.1F); // Box 60
		turretModel[1].setRotationPoint(7.5F, -5F, -5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 61
		turretModel[2].setRotationPoint(-6.5F, -6.5F, -5F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 12, 4, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		turretModel[3].setRotationPoint(-6.5F, -10.5F, -5F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 12, 2, 10, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		turretModel[4].setRotationPoint(-6.5F, -13F, -5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,0F, 0F, -0.5F, -0.3F, 0F, -3F, -0.3F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -2F, -0.7F, 0F, -4F, -0.7F, 0F, -4F, 0F, 0F, -2F); // Box 64
		turretModel[5].setRotationPoint(7.5F, -6.5F, -5F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -3F, -0.3F, 0F, -3F, 0F, 0F, -0.5F); // Box 65
		turretModel[6].setRotationPoint(7.5F, -8.5F, -5F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 10, 0F,0F, 0.5F, -0.5F, -2F, 0.5F, -3F, -2F, 0.5F, -3F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -2.5F, 0F, 0F, -0.5F); // Box 66
		turretModel[7].setRotationPoint(7.5F, -10.5F, -5F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0F, -2.5F, -1F, -1F, -3.8F, -1F, -1F, -3.8F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F); // Box 67
		turretModel[8].setRotationPoint(7.5F, -13F, -5F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 68
		turretModel[9].setRotationPoint(5.5F, -6.5F, -5F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 10, 0F,0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 69
		turretModel[10].setRotationPoint(5.5F, -10.5F, -5F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 70
		turretModel[11].setRotationPoint(5.5F, -13F, -5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 71
		barrelModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 72
		barrelModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 73
		barrelModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 74
		barrelModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 75
		barrelModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 76

		barrelModel[0].addShapeBox(-7.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 71
		barrelModel[0].setRotationPoint(11.5F, -9F, -1.5F);

		barrelModel[1].addShapeBox(0.5F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 72
		barrelModel[1].setRotationPoint(11.5F, -9F, -1.5F);

		barrelModel[2].addShapeBox(9.3F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F); // Box 73
		barrelModel[2].setRotationPoint(11.5F, -9F, -1.5F);

		barrelModel[3].addShapeBox(9.3F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F); // Box 74
		barrelModel[3].setRotationPoint(11.5F, -9F, 1.5F);

		barrelModel[4].addShapeBox(0.5F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, 0F); // Box 75
		barrelModel[4].setRotationPoint(11.5F, -9F, 1.5F);

		barrelModel[5].addShapeBox(-7.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 76
		barrelModel[5].setRotationPoint(11.5F, -9F, 1.5F);
	}
}