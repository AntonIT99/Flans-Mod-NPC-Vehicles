//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 22.07.2020 - 09:49:51
// Last changed on: 22.07.2020 - 09:49:51

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNusret extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelNusret() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[60];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 59
		bodyModel[40] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 60
		bodyModel[41] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 61
		bodyModel[42] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 62
		bodyModel[43] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 63
		bodyModel[44] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 64
		bodyModel[45] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 65
		bodyModel[46] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 66
		bodyModel[47] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 67
		bodyModel[48] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 68
		bodyModel[49] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 69
		bodyModel[50] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 70
		bodyModel[51] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		bodyModel[52] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 72
		bodyModel[53] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 73
		bodyModel[54] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 74
		bodyModel[55] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 75
		bodyModel[56] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 76
		bodyModel[57] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 77
		bodyModel[58] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 78
		bodyModel[59] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 79

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 5, 16, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-16F, 1.5F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 16, 5, 16, 0F,0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 2
		bodyModel[1].setRotationPoint(0F, 1.5F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 6, 16, 0F,0F, 0F, 0F, 0F, 0.7F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(16F, 0.5F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 7, 15, 0F,0F, -0.3F, 0F, 0F, 0.3F, -2F, 0F, 0.3F, -2F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(28F, -0.5F, -7.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 7, 11, 0F,0F, 0.3F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(35F, -0.5F, -5.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 7, 6, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(42F, -1.5F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0.7F, -0.5F, 0F, 0.7F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, -0.5F, 0F, -0.7F, 0.5F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(16F, -1.5F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F); // Box 8
		bodyModel[7].setRotationPoint(0F, -0.5F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-16F, -0.5F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.3F, 0F, 0F, 0.3F, -2F, 0F, 0.3F, 2F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, -2F, 0F, -0.3F, 2F, 0F, 0.3F, 0F); // Box 10
		bodyModel[9].setRotationPoint(28F, -2.5F, -7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(42F, -4.5F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.3F, 0F, 0F, 1F, -2.5F, 0F, 1F, 2.5F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0.7F, 0F); // Box 12
		bodyModel[11].setRotationPoint(35F, -2.5F, -5.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 5, 16, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 13
		bodyModel[12].setRotationPoint(-32F, 1.5F, -8F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 13, 5, 15, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F); // Box 14
		bodyModel[13].setRotationPoint(-45F, 1.5F, -7.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0F); // Box 15
		bodyModel[14].setRotationPoint(42F, 5.5F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 16
		bodyModel[15].setRotationPoint(-32F, -0.5F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0.8F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0.5F, 1F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0.5F); // Box 17
		bodyModel[16].setRotationPoint(-44F, -0.5F, -7.5F);

		bodyModel[17].addShapeBox(-2F, 0F, 0F, 2, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.7F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-45F, 1F, -5.5F);
		bodyModel[17].rotateAngleZ = 0.38397244F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 19
		bodyModel[18].setRotationPoint(-47F, -8.5F, -0.5F);
		bodyModel[18].rotateAngleZ = 0.36651914F;

		bodyModel[19].addShapeBox(-18.2F, -7.5F, 0F, 30, 20, 1, 0F,-11.5F, -7.5F, -0.45F, -11.5F, -7.5F, -0.45F, -11.5F, -7.5F, -0.45F, -11.5F, -7.5F, -0.45F, -11.5F, -7.5F, -0.45F, -11.5F, -7.5F, -0.45F, -11.5F, -7.5F, -0.45F, -11.5F, -7.5F, -0.45F); // Box 20
		bodyModel[19].setRotationPoint(-47F, -8.5F, -0.5F);
		bodyModel[19].rotateAngleZ = 0.36651914F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 29, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-9F, -4.5F, -4.5F);

		bodyModel[21].addShapeBox(0F, -14.5F, 0F, 1, 17, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 22
		bodyModel[21].setRotationPoint(11F, -5.5F, -1.5F);
		bodyModel[21].rotateAngleZ = 0.12217305F;

		bodyModel[22].addShapeBox(1F, -14.5F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(11F, -5.5F, -1.5F);
		bodyModel[22].rotateAngleZ = 0.12217305F;

		bodyModel[23].addShapeBox(2F, -14.5F, 0F, 1, 17, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(11F, -5.5F, -1.5F);
		bodyModel[23].rotateAngleZ = 0.12217305F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(-9.5F, -11.5F, -1F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(-9.5F, -11.5F, -1F);
		bodyModel[25].rotateAngleZ = 0.2443461F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 27
		bodyModel[26].setRotationPoint(2.5F, -14F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 6, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(14F, -10.5F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 29
		bodyModel[28].setRotationPoint(14F, -15.5F, -3.5F);
		bodyModel[28].rotateAngleZ = 0.05235988F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 30
		bodyModel[29].setRotationPoint(14F, -15.5F, -3.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 31
		bodyModel[30].setRotationPoint(22F, -15.5F, -3.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 34
		bodyModel[31].setRotationPoint(15F, -5.3F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35
		bodyModel[32].setRotationPoint(15F, -5.3F, -7.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 27, 1, 15, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 36
		bodyModel[33].setRotationPoint(-12F, -5.3F, -7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-1F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 37
		bodyModel[34].setRotationPoint(-13.1F, -5.4F, -6.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 38, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 38
		bodyModel[35].setRotationPoint(24F, -33.5F, -0.5F);
		bodyModel[35].rotateAngleZ = 0.06981317F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 39
		bodyModel[36].setRotationPoint(24F, -29.5F, -5F);
		bodyModel[36].rotateAngleZ = 0.06981317F;

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 4, 9, 0F,0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 40
		bodyModel[37].setRotationPoint(20F, -2.5F, -4.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 41
		bodyModel[38].setRotationPoint(20F, -4.5F, -4.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 9, 1, 15, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -8.9F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, -8.9F, 0F, -2.5F); // Box 59
		bodyModel[39].setRotationPoint(-41F, 7F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F); // Box 60
		bodyModel[40].setRotationPoint(-16F, 7F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F); // Box 61
		bodyModel[41].setRotationPoint(0F, 7F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 3, 16, 0F,0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2F); // Box 62
		bodyModel[42].setRotationPoint(16F, 6F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 7, 3, 15, 0F,0F, -0.5F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F); // Box 63
		bodyModel[43].setRotationPoint(28F, 6F, -7.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 7, 3, 11, 0F,0F, -0.5F, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.5F); // Box 64
		bodyModel[44].setRotationPoint(35F, 6F, -5.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -3F, -0.8F, -2.5F, -3F, -0.8F, -2.5F, 0F, -0.5F, -1.5F); // Box 65
		bodyModel[45].setRotationPoint(42F, 7.5F, -3F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 16, 2, 16, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2.5F); // Box 66
		bodyModel[46].setRotationPoint(-32F, 7F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.5F, 0F, -0.7F, -0.5F, 0F, 0F, 0F); // Box 67
		bodyModel[47].setRotationPoint(16F, -1.5F, 7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 68
		bodyModel[48].setRotationPoint(0F, -0.5F, 7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F); // Box 69
		bodyModel[49].setRotationPoint(-16F, -0.5F, 7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -0.3F, 0F, 0F, 0.3F, 2F, 0F, 0.3F, -2F, 0F, -0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 2F, 0F, -0.3F, -2F, 0F, 0.3F, 0F); // Box 70
		bodyModel[50].setRotationPoint(28F, -2.5F, 6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 2.5F, 0F, 0.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, -2.5F, 0F, 0F, 0F); // Box 71
		bodyModel[51].setRotationPoint(42F, -4.5F, 2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0.3F, 0F, 0F, 1F, 2.5F, 0F, 1F, -2.5F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0.7F, 0F); // Box 72
		bodyModel[52].setRotationPoint(35F, -2.5F, 4.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F); // Box 73
		bodyModel[53].setRotationPoint(-32F, -0.5F, 7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0.8F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, -0.5F, 1F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, -0.5F); // Box 74
		bodyModel[54].setRotationPoint(-44F, -0.5F, 6.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 75
		bodyModel[55].setRotationPoint(14F, -15.5F, 2.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 76
		bodyModel[56].setRotationPoint(22F, -15.5F, 2.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 77
		bodyModel[57].setRotationPoint(15F, -5.3F, 3.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 78
		bodyModel[58].setRotationPoint(15F, -5.3F, 6.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,-1F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 79
		bodyModel[59].setRotationPoint(-13.1F, -5.4F, 4.5F);
	}
}