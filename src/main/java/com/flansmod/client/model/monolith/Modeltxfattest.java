//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: txarmor
// Model Creator: 
// Created on: 08.12.2019 - 19:00:02
// Last changed on: 08.12.2019 - 19:00:02

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modeltxfattest extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public Modeltxfattest() //Same as Filename
	{
		headModel = new ModelRendererTurbo[19];
		headModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
		headModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 6
		headModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		headModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 9
		headModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 10
		headModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
		headModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 13
		headModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 14
		headModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 15
		headModel[9] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 16
		headModel[10] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 18
		headModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 20
		headModel[12] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 21
		headModel[13] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 22
		headModel[14] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 23
		headModel[15] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 24
		headModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 25
		headModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 26
		headModel[18] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 66

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2F, -6F, -8F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 6
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -8F, 2, 1, 4, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 8
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(2F, -6F, -8F, 2, 1, 4, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 9
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -11.5F, -4F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 10
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(1F, -11.5F, -4F, 3, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 11
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -10.5F, 3.5F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -10.5F, 3F, 3, 3, 1, 0F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 14
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1F, -10.5F, 2F, 3, 3, 2, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 15
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1F, -10.5F, 0.5F, 2, 3, 1, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 16
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1F, -11.5F, -1.5F, 2, 4, 1, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 18
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(1F, -11.5F, -1.5F, 3, 4, 1, 0F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 20
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -11.5F, -1.5F, 3, 4, 1, 0F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 21
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -10.5F, 0.5F, 3, 3, 2, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 1.5F, 0F, 0F, -1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 22
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(1F, -10.5F, 1.5F, 3, 3, 1, 0F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1.5F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 23
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3F, -11.5F, -4F, 1, 4, 8, 0F, -0.5F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, -3.625F, -0.5F, 0F, -3.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 24
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.5F, -11.5F, -4F, 1, 4, 8, 0F, -0.5F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, -3.625F, -0.5F, 0F, -3.625F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 25
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -7.5F, -5F, 1, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -11.5F, -4F, 3, 4, 2, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 66
		headModel[18].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[41];
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 29
		bodyModel[2] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 30
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 32
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 35
		bodyModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 36
		bodyModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 37
		bodyModel[9] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 38
		bodyModel[10] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 39
		bodyModel[11] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 40
		bodyModel[12] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 41
		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 42
		bodyModel[14] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 43
		bodyModel[15] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 44
		bodyModel[16] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 45
		bodyModel[17] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 46
		bodyModel[18] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 47
		bodyModel[19] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 49
		bodyModel[21] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 50
		bodyModel[22] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 51
		bodyModel[23] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 57
		bodyModel[25] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 62
		bodyModel[29] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 64
		bodyModel[31] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 65
		bodyModel[32] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 66
		bodyModel[33] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 68
		bodyModel[34] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 74
		bodyModel[35] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 75
		bodyModel[36] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 76
		bodyModel[37] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 77
		bodyModel[38] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 78
		bodyModel[39] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 79
		bodyModel[40] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 80

		bodyModel[0].addBox(-4F, 0F, -2F, 8, 12, 4, 0F); // Box 2
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-1.5F, 1F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2F, 0F, -3F, 6, 12, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0.5F, 1F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0.5F, 3F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 33
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0.5F, 5F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0.5F, 7F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0.5F, 8F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0.5F, 9F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 37
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.5F, 10F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.5F, 11F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.5F, 6F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 40
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, 4F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.5F, 2F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.5F, 2F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 43
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1.5F, 3F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 44
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-1.5F, 4F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 45
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.5F, 5F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 46
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1.5F, 6F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 47
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-1.5F, 7F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 48
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1.5F, 8F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1.5F, 9F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 50
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1.5F, 10F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1.5F, 11F, -3.25F, 1, 1, 1, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 52
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(2.5F, 0F, -3.25F, 1, 13, 1, 0F, 6.25F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 6.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 57
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-3.5F, 0F, -3.25F, 1, 13, 1, 0F, -6F, 0F, -0.5F, 6.25F, 0F, -0.5F, 6.25F, 0F, 0F, -6F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 59
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3.5F, 0F, 1.75F, 1, 13, 1, 0F, -6F, 0F, -0.5F, 6.25F, 0F, -0.5F, 6.25F, 0F, 0F, -6F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 60
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2.5F, 0F, 1.75F, 1, 13, 1, 0F, 6.25F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, 6.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 61
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(3F, -0.25F, -2.25F, 1, 1, 4, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 1F, 0.5F, -0.75F, 1F); // Box 62
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.25F, -0.25F, -2.25F, 1, 1, 4, 0F, 0.5F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, -0.75F, 0.5F, -0.25F, -0.75F, 0.5F, -0.25F, -0.75F, 1F, 0.5F, -0.75F, 1F); // Box 63
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-5.7F, 13F, -3.25F, 2, 3, 6, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 64
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-6.7F, 13F, -3.25F, 1, 2, 6, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 65
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-7F, 13.5F, -0.5F, 1, 1, 1, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 66
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-5F, 12F, -3.25F, 1, 1, 6, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 68
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-5F, 12F, -3.25F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 1.75F, 0F, -0.5F, 1.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.5F, 1.75F, -0.5F, -0.5F, 1.75F, -0.5F, 0F, -0.75F, 0.25F, 0F); // Box 74
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(4F, 12F, -3.25F, 1, 1, 1, 0F, 1.75F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 1.75F, 0F, 0F, 1.75F, -0.5F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, 1.75F, -0.5F, 0F); // Box 75
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(4F, 12F, 1.75F, 1, 1, 1, 0F, 1.75F, 0F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, 1.75F, 0F, 0F, 1.75F, -0.5F, -0.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, 0F, 1.75F, -0.5F, 0F); // Box 76
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-5F, 12F, 1.75F, 1, 1, 1, 0F, -0.75F, -0.25F, -0.5F, 1.75F, 0F, -0.5F, 1.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.5F, 1.75F, -0.5F, -0.5F, 1.75F, -0.5F, 0F, -0.75F, 0.25F, 0F); // Box 77
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(3.25F, 12F, -3.25F, 1, 1, 6, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F); // Box 78
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(4.3F, 13F, -2F, 2, 3, 3, 0F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -1F, -0.5F, -0.75F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 79
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(4.3F, 12.25F, -0.7F, 1, 1, 1, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 80
		bodyModel[40].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3

		leftArmModel[0].addBox(-1F, -2F, -2F, 4, 10, 4, 0F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4

		rightArmModel[0].addBox(-3F, -2F, -2F, 4, 10, 4, 0F); // Box 4
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[2];
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		leftLegModel[1] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 54

		leftLegModel[0].addBox(-2F, 0F, -2F, 4, 10, 4, 0F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addBox(-2F, 10F, -3F, 4, 2, 5, 0F); // Box 54
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[2];
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		rightLegModel[1] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 53

		rightLegModel[0].addBox(-2F, 0F, -2F, 4, 10, 4, 0F); // Box 1
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addBox(-2F, 10F, -3F, 4, 2, 5, 0F); // Box 53
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);


	}
}