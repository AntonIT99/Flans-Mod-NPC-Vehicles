//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SumerHelmet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSumerHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelSumerHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 20
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 4, 8, 0F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.5F, -0.5F, 1F, 0.5F, -0.5F, 1F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -4F, -1F, 1, 3, 3, 0F, 0.5F, 0.4F, 1F, -1.2F, 0.4F, 1F, -1.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.5F, 0.5F, -1.2F, 0.5F, 0.5F, -1.2F, 0.2F, 1F, 0.5F, 0.2F, 1F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -4F, 3F, 8, 3, 1, 0F, 0.5F, 0.2F, 1F, 0.5F, 0.2F, 1F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 20
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -10.8F, -3F, 6, 1, 7, 0F, -2.8F, 0.75F, -6.2F, -2.8F, 0.75F, -6.2F, -2.8F, 0.75F, -0.5F, -2.8F, 0.75F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1.2F, -6F, -1.7F, 1, 1, 2, 0F, -0.5F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.5F, 0.5F, -0.8F, -0.5F, -1F, 1F, -0.2F, -1F, 1F, -0.2F, -0.5F, -1.2F, -0.5F, -0.5F, -1.2F); // Box 28
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(3F, -4F, -1F, 1, 3, 3, 0F, -1.2F, 0.4F, 1F, 0.5F, 0.4F, 1F, 0.5F, 0.2F, 0.5F, -1.2F, 0.2F, 0.5F, -1.2F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.2F, 1F, -1.2F, 0.2F, 1F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);


	}
}