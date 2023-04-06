//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChinaColdWar
// Model Creator: 
// Created on: 10.04.2020 - 16:18:54
// Last changed on: 10.04.2020 - 16:18:54

package com.flansmod.client.model.invalid; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChina60sHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelChina60sHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[5];
		headModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 
		headModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import 
		headModel[2] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import 
		headModel[3] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import 
		headModel[4] = new ModelRendererTurbo(this, 2, 65, textureX, textureY); // Import 

		headModel[0].addShapeBox(-4F, -5.25F, -6F, 8, 1, 2, 0F, -0.3F, -0.6F, 0.0F, -0.3F, -0.6F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, -0.3F, -0.4F, 0.0F, -0.3F, -0.4F, 0.0F, 0.15F, -0.8F, 0.0F, 0.15F, -0.8F, 0.0F); // Import 
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F); // Import 
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8.8F, -4F, 8, 1, 8, 0F, -1.0F, -0.2F, -1.0F, -1.0F, -0.2F, -1.0F, -1.0F, -0.2F, -1.0F, -1.0F, -0.2F, -1.0F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F); // Import 
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7.75F, -4F, 8, 2, 8, 0F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F); // Import 
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -7.5F, -4.2F, 1, 1, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		headModel[4].setRotationPoint(0F, 0F, 0F);


	}
}