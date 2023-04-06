//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 09.03.2020 - 21:49:32
// Last changed on: 09.03.2020 - 21:49:32

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelQingFootSoldierII extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelQingFootSoldierII() //Same as Filename
	{
		headModel = new ModelRendererTurbo[12];
		headModel[0] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Import Box18
		headModel[1] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Import Box22
		headModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box49
		headModel[3] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Box202
		headModel[4] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Import Box203
		headModel[5] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Import Box204
		headModel[6] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Import Box205
		headModel[7] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Import Box206
		headModel[8] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Import Box207
		headModel[9] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import Box218
		headModel[10] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Import Box219
		headModel[11] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Import Box102

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 1, 8, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.1F, 0.9F, 0.9F, -0.1F, 0.9F); // Import Box18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, -0.4F, -1.8F, -2F, -0.4F, -1.8F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.9F, 0.1F, 0.2F, 0.9F, 0.1F); // Import Box22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -10.8F, -0.5F, 1, 1, 1, 0F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0.4F, 1.7F, 1.5F, 0.4F, 1.7F); // Import Box49
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -6.7F, -7.8F, 10, 2, 3, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box202
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -6.3F, 4.8F, 10, 2, 3, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box203
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4.9F, -6.7F, -4.8F, 3, 2, 10, 0F, 0F, 0.8F, 0F, 0F, -1.5F, 0F, 0F, -1.9F, -0.3F, 0F, 0.4F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Import Box204
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-7.9F, -6.7F, -4.8F, 3, 2, 10, 0F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, 0.4F, -0.3F, 0F, -1.9F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Import Box205
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-8.01F, -6.7F, -7.8F, 3, 2, 3, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, -1.5F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box206
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(5.01F, -6.7F, -7.8F, 3, 2, 3, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box207
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(5.01F, -6.3F, 4.91F, 3, 2, 3, 0F, 0F, 0.8F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F); // Import Box218
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-8.01F, -6.3F, 4.91F, 3, 2, 3, 0F, 0F, -1.5F, 0F, 0F, 0.8F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F); // Import Box219
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -6.8F, -3.5F, 9, 7, 1, 0F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Import Box102
		headModel[11].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[27];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 37
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 70
		bodyModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 71
		bodyModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 60
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 61
		bodyModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 62
		bodyModel[11] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 66
		bodyModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 67
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 68
		bodyModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box162
		bodyModel[22] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Import Box160
		bodyModel[23] = new ModelRendererTurbo(this, 497, 35, textureX, textureY); // Import Box162
		bodyModel[24] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Import Box164
		bodyModel[25] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box165
		bodyModel[26] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 83

		bodyModel[0].addShapeBox(-4F, 0F, -2.5F, 4, 10, 4, 0F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 1F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-1F, 0F, -2.6F, 5, 10, 4, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 1F, 2F, 0.2F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1F, 0F, -2.6F, 5, 4, 4, 0F, -1.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1.2F, 0.2F, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 7.5F, -3F, 8, 2, 6, 0F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.3F, 0.2F, 0.1F, -0.3F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-1F, 7.5F, -2.4F, 2, 1, 1, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F, -0.1F, 0.15F, 0F); // Box 37
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.8F, 6.25F, -3.2F, 2, 3, 1, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 7
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.8F, 6.65F, -3.2F, 2, 1, 1, 0F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F); // Box 70
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.3F, 7.2F, -3.25F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 71
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3F, 6.65F, -3.2F, 2, 1, 1, 0F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F); // Box 60
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3F, 6.25F, -3.2F, 2, 3, 1, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 61
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.5F, 7.2F, -3.25F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 62
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.7F, 6.65F, -3.2F, 2, 1, 1, 0F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F); // Box 66
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.7F, 6.25F, -3.2F, 2, 3, 1, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 67
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(1.2F, 7.2F, -3.25F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 68
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.1F, 6.25F, -3.2F, 2, 3, 1, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 18
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-0.6F, 7.2F, -3.25F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 19
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-1.1F, 6.65F, -3.2F, 2, 1, 1, 0F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F); // Box 20
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2.6F, 6.65F, -3.2F, 2, 1, 1, 0F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, 0F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F, -0.15F, -0.3F, 0.1F); // Box 21
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(3.1F, 7.2F, -3.25F, 1, 2, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 22
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.6F, 6.25F, -3.2F, 2, 3, 1, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 23
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 0F, 0.2F, 8, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 0F, 2F, 0.2F); // Box 34
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-86F, -57F, -2.7F, 172, 124, 1, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F); // Import Box162
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2.5F, 1F, -3F, 1, 8, 1, 0F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Import Box160
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.5F, 1F, -3F, 1, 8, 1, 0F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Import Box162
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.5F, 1F, 1.6F, 1, 8, 1, 0F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Import Box164
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2.5F, 1F, 1.6F, 1, 8, 1, 0F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.1F, 0.95F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Import Box165
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addBox(-3F, 0F, -2F, 4, 5, 4, 0F); // Box 83
		bodyModel[26].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[3];
		leftArmModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box95
		leftArmModel[1] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 43
		leftArmModel[2] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Import Box101

		leftArmModel[0].addShapeBox(-1F, 3F, -2F, 4, 5, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box95
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F, 0.02F, 0.1F, 0.02F, 0.02F, 0.1F, 0.02F, 0.02F, 0.1F, 0.02F, 0.02F, 0.1F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 43
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 7.6F, -2F, 4, 2, 4, 0F, 0.27F, 0F, 0.27F, 0.27F, 0F, 0.27F, 0.27F, 0F, 0.27F, 0.27F, 0F, 0.27F, 0.27F, -0.5F, 0.27F, 0.27F, -0.5F, 0.27F, 0.27F, -0.5F, 0.27F, 0.27F, -0.5F, 0.27F); // Import Box101
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box152
		rightArmModel[1] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 41
		rightArmModel[2] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Import Box153

		rightArmModel[0].addShapeBox(-3F, 3F, -2F, 4, 5, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Import Box152
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F, 0.02F, 0.1F, 0.02F, 0.02F, 0.1F, 0.02F, 0.02F, 0.1F, 0.02F, 0.02F, 0.1F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F); // Box 41
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 7.6F, -2F, 4, 2, 4, 0F, 0.27F, 0F, 0.27F, 0.27F, 0F, 0.27F, 0.27F, 0F, 0.27F, 0.27F, 0F, 0.27F, 0.27F, -0.5F, 0.27F, 0.27F, -0.5F, 0.27F, 0.27F, -0.5F, 0.27F, 0.27F, -0.5F, 0.27F); // Import Box153
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[6];
		leftLegModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 107
		leftLegModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 78
		leftLegModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 137
		leftLegModel[3] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 109
		leftLegModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 204
		leftLegModel[5] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 136

		leftLegModel[0].addShapeBox(-2F, 10F, -2.75F, 4, 1, 1, 0F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 107
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11F, -2.75F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 78
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 137
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, -1F, -2F, 4, 6, 4, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F); // Box 109
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 136
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[6];
		rightLegModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 76
		rightLegModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 79
		rightLegModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 87
		rightLegModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 115
		rightLegModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 202
		rightLegModel[5] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 203

		rightLegModel[0].addShapeBox(-2F, 11F, -2.75F, 4, 1, 1, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 76
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -2.75F, 4, 1, 1, 0F, -0.5F, -0.5F, -0.55F, -0.5F, -0.5F, -0.55F, -0.5F, -0.4F, 1F, -0.5F, -0.4F, 1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Box 79
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 87
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 115
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, -1F, -2F, 4, 6, 4, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F); // Box 202
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);


	}
}