//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ngob
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNgob extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelNgob() //Same as Filename
	{
		headModel = new ModelRendererTurbo[10];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 136
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 203
		headModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 205
		headModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 206
		headModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 219
		headModel[6] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 97
		headModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 98
		headModel[8] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 99
		headModel[9] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 100

		headModel[0].addShapeBox(-4F, -9F, -4F, 8, 3, 8, 0F,0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7F, -4F, 8, 3, 8, 0F,0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 1.9F, -0.7F, 1.9F, 1.9F, -0.7F, 1.9F, 1.9F, -0.3F, 1.9F, 1.9F, -0.3F, 1.9F); // Box 136
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -5.5F, 4.8F, 10, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 203
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-8.9F, -5.9F, -4.8F, 4, 2, 10, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, 0F, -1.9F, -0.3F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -0.9F, -0.3F, 0F, 0.1F, -0.3F); // Box 205
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-8.01F, -5.9F, -7.8F, 3, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, 0F, 0F, 1F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F, 0F, -0.8F, 0F, 1F, -0.3F, 0F); // Box 206
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-8.01F, -5.5F, 4.91F, 3, 2, 3, 0F,1F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 1F, 0F, -1.5F, 0F, 1F, -0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 0F); // Box 219
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -5.9F, -8.8F, 10, 2, 4, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F); // Box 97
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4.9F, -5.9F, -4.8F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.9F, -0.3F, 0F, -0.4F, -0.3F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, -0.9F, -0.3F); // Box 98
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4.9F, -5.5F, 4.91F, 3, 2, 3, 0F,0F, 0F, 0F, 1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 1F, 0F, -0.8F, 0F, 1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 1F); // Box 99
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4.9F, -5.9F, -7.8F, 3, 2, 3, 0F,0F, -1.5F, 1F, 0F, -1.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -0.8F, 0F); // Box 100
		headModel[9].setRotationPoint(0F, 0F, 0F);
	}
}