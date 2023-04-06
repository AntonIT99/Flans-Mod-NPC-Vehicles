//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: usww1
// Model Creator: 
// Created on: 28.12.2019 - 14:15:05
// Last changed on: 28.12.2019 - 14:15:05

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelusww1final extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public Modelusww1final() //Same as Filename
	{
		headModel = new ModelRendererTurbo[13];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		headModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import 
		headModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import 
		headModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import 
		headModel[6] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import 
		headModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		headModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		headModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		headModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import 
		headModel[11] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import 
		headModel[12] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import 

		headModel[0].addShapeBox(-4.5F, -8F, -4.5F, 9, 2, 9, 0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F); // Import 
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -9F, -4.5F, 9, 1, 9, 0F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F); // Import 
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -6.5F, -4.5F, 9, 2, 9, 0F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Import 
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-6F, -5F, -4.5F, 2, 1, 9, 0F, -1.4F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -1.4F, 0.0F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.25F, 0.1F); // Import 
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(4F, -5F, -4.5F, 2, 1, 9, 0F, 0.0F, 0.0F, 0.1F, -1.4F, 0.0F, 0.1F, -1.4F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.5F, 0.1F); // Import 
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -5F, -6F, 9, 1, 2, 0F, 0.1F, 0.0F, -1.4F, 0.1F, 0.0F, -1.4F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F); // Import 
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -5F, 4F, 9, 1, 2, 0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -1.4F, 0.1F, 0.0F, -1.4F, 0.1F, -0.5F, 0.0F, 0.1F, -0.5F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F); // Import 
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-6F, -5F, -6F, 1, 1, 1, 0F, 0.0F, -0.75F, -1.4F, 0.4F, -0.75F, 0.0F, 0.4F, 0.0F, 0.4F, 0.0F, -0.75F, 0.4F, 0.0F, -0.25F, -1.4F, 0.4F, -0.25F, 0.0F, 0.4F, -0.425F, 0.4F, 0.0F, -0.25F, 0.4F); // Import 
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(5F, -5F, -6F, 1, 1, 1, 0F, 0.4F, -0.75F, 0.0F, 0.0F, -0.75F, -1.4F, 0.0F, -0.75F, 0.4F, 0.4F, 0.0F, 0.4F, 0.4F, -0.25F, 0.0F, 0.0F, -0.25F, -1.4F, 0.0F, -0.25F, 0.4F, 0.4F, -0.425F, 0.4F); // Import 
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(5F, -5F, 5F, 1, 1, 1, 0F, 0.4F, 0.0F, 0.4F, 0.0F, -0.75F, 0.4F, 0.0F, -0.75F, -1.4F, 0.4F, -0.75F, 0.0F, 0.4F, -0.425F, 0.4F, 0.0F, -0.25F, 0.4F, 0.0F, -0.25F, -1.4F, 0.4F, -0.25F, 0.0F); // Import 
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-6F, -5F, 5F, 1, 1, 1, 0F, 0.0F, -0.75F, 0.4F, 0.4F, 0.0F, 0.4F, 0.4F, -0.75F, 0.0F, 0.0F, -0.75F, -1.4F, 0.0F, -0.25F, 0.4F, 0.4F, -0.425F, 0.4F, 0.4F, -0.25F, 0.0F, 0.0F, -0.25F, -1.4F); // Import 
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -5F, -4.5F, 9, 5, 4, 0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -2.5F, -0.4F, 0.0F, -2.5F); // Import 
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F); // Import 
		headModel[12].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[49];
		bodyModel[0] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 28
		bodyModel[24] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 29
		bodyModel[25] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 30
		bodyModel[26] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 31
		bodyModel[27] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 32
		bodyModel[28] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 34
		bodyModel[30] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 35
		bodyModel[31] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[40] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 45
		bodyModel[41] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 46
		bodyModel[42] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 47
		bodyModel[43] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 54
		bodyModel[48] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 55

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 4, 12, 4, 0F, 0.2F, 0F, 0.2F, 0.2F, -0.75F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -2F, 4, 12, 4, 0F, 0.2F, -0.625F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 6
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2F, 0F, -2F, 2, 1, 1, 0F, 0F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -2F, 2, 1, 1, 0F, 0F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 3F, -2F, 4, 3, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 9
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 2.25F, -2F, 4, 1, 1, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 7.25F, -2F, 4, 1, 1, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 8F, -2F, 4, 3, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 8F, -2F, 4, 3, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 3F, -2F, 4, 3, 1, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 14
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 7.25F, -2F, 4, 1, 1, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 2.25F, -2F, 4, 1, 1, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0.35F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 16
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 7.25F, -2F, 4, 1, 3, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 17
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 7.25F, -2F, 4, 1, 3, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 18
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 7.25F, -1F, 8, 1, 3, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 19
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 7.25F, -2F, 1, 1, 1, 0F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 20
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-0.5F, 6.75F, -2F, 1, 2, 1, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F); // Box 21
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.5F, 6.75F, -2F, 2, 1, 1, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, -0.875F, 0.5F, -0.5F, -0.875F, 0.5F, -0.5F, -0.875F, 0.5F, 0.25F, -0.875F, 0.5F); // Box 22
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1.5F, 8.65F, -2F, 2, 1, 1, 0F, -0.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.25F, -0.875F, 0.5F, -0.5F, -0.875F, 0.5F, -0.5F, -0.875F, 0.5F, 0.25F, -0.875F, 0.5F); // Box 23
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0.25F, 7.25F, -2.5F, 2, 1, 3, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 24
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, 7.25F, -2.5F, 2, 1, 3, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 25
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4.5F, 7.25F, -2.5F, 2, 1, 3, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 26
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-2.5F, 7.25F, -2.5F, 2, 1, 3, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 27
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.5F, 6.25F, -2.5F, 2, 1, 1, 0F, -0.5F, -0.5F, 0.625F, 0F, -0.5F, 0.625F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, 0.625F, 0F, 0.5F, 0.625F, 0F, -0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Box 28
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.25F, 6.25F, -2.5F, 2, 1, 1, 0F, -0.5F, -0.5F, 0.625F, 0F, -0.5F, 0.625F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, 0.625F, 0F, 0.5F, 0.625F, 0F, -0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Box 29
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4.5F, 6.25F, -2.5F, 2, 1, 1, 0F, -0.5F, -0.5F, 0.625F, 0F, -0.5F, 0.625F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, 0.625F, 0F, 0.5F, 0.625F, 0F, -0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Box 30
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(2F, 6.25F, -2.5F, 2, 1, 1, 0F, -0.5F, -0.5F, 0.625F, 0F, -0.5F, 0.625F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.5F, 0.625F, 0F, 0.5F, 0.625F, 0F, -0.25F, 0.5F, -0.5F, 0.25F, 0.5F); // Box 31
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2F, 0F, -2F, 2, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4F, 0F, -2F, 2, 12, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2F, 6.25F, -2.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 34
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0.25F, 6.25F, -2.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 35
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4.5F, 6.25F, -2.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 36
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2.5F, 6.25F, -2.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 37
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-1.25F, 1F, -1.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 38
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-1.25F, 2F, -1.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 39
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-1.25F, 3F, -1.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 40
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-1.25F, 4F, -1.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 41
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1.25F, 5F, -1.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 42
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1.25F, 6F, -1.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 43
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-1.25F, 7F, -1.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 44
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-1.25F, 8F, -1.5F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 45
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(0.75F, 2F, -1.75F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 46
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.25F, 2F, -1.75F, 2, 1, 1, 0F, -1F, -0.75F, 0.75F, -0.5F, -0.75F, 0.75F, -0.5F, -0.75F, 0.5F, -1F, -0.75F, 0.5F, -1F, 0.25F, 0.75F, -0.5F, 0.25F, 0.75F, -0.5F, -0.5F, 0.5F, -1F, 0F, 0.5F); // Box 47
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-3F, 0.25F, 1F, 1, 6, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 49
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(2F, 0.25F, 1F, 1, 6, 1, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 50
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(2F, 0.25F, -2F, 1, 6, 1, 0F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F); // Box 51
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-3F, 0.25F, -2F, 1, 6, 1, 0F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F); // Box 52
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-3F, 7.25F, 1.5F, 2, 1, 2, 0F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F); // Box 54
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-3F, 6.25F, 2.5F, 2, 1, 1, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 55
		bodyModel[48].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 71

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[2];
		rightArmModel[0] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 70

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[3];
		leftLegModel[0] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 5
		leftLegModel[1] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 57
		leftLegModel[2] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 58

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 5
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addBox(-2F, 10F, -3F, 4, 2, 5, 0F); // Box 58
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[3];
		rightLegModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 4
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 56
		rightLegModel[2] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 59

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 4
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addBox(-2F, 10F, -3F, 4, 2, 5, 0F); // Box 59
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);


	}
}