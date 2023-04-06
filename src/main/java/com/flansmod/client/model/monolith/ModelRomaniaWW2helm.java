//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: romaniaww2
// Model Creator: 
// Created on: 03.01.2019 - 20:41:58
// Last changed on: 03.01.2019 - 20:41:58

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRomaniaWW2helm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelRomaniaWW2helm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 
		headModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		headModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import 
		headModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import 
		headModel[6] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import 

		headModel[0].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F,-0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F, -0.6F, -0.8F, 0.0F); // Import 
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -4F, -4.5F, 9, 4, 4, 0F,0.5F, 0.0F, -3.5F, 0.5F, 0.0F, -3.5F, 0.5F, 0.0F, 1F, 0.5F, 0.0F, 1F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -0.5F, -0.4F, 0.0F, -2.5F, -0.4F, 0.0F, -2.5F); // Import 
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -10F, -4F, 8, 2, 8, 0F,-1.2F, -0.4F, -2.8F, -1.2F, -0.4F, -2.8F, -1.2F, -0.7F, -1F, -1.2F, -0.7F, -1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8F, -5F, 8, 3, 5, 0F,0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.1F, 0.0F, 1.1F, 0.1F, 0.0F, 1.1F, 0.75F, 0.4F, 0.5F, 0.75F, 0.4F, 0.5F, 1.5F, 1.0F, 1.1F, 1.5F, 1.0F, 1.1F); // Import 
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -8F, 0.2F, 8, 3, 4, 0F,0.1F, 0.0F, -0.9F, 0.1F, 0.0F, -0.9F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 1.5F, 1.0F, -0.9F, 1.5F, 1.0F, -0.9F, 0.85F, 1.2F, 0.9F, 0.85F, 1.2F, 0.9F); // Import 
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -4F, 0.4F, 8, 1, 4, 0F,1.5F, 0.5F, -0.4F, 1.5F, 0.5F, -0.4F, 0.85F, -0.2F, 0.7F, 0.85F, -0.2F, 0.7F, 1.7F, -0.8F, -0.4F, 1.7F, -0.8F, -0.4F, 1.4F, 0.8F, 1.5F, 1.4F, 0.8F, 1.5F); // Import 
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4F, -4.2F, 8, 1, 4, 0F,0.75F, 0.7F, 1.2F, 0.75F, 0.7F, 1.2F, 1.5F, 0.5F, 1F, 1.5F, 0.5F, 1F, 0.95F, -1.3F, 1.7F, 0.95F, -1.3F, 1.7F, 1.7F, -0.8F, 1F, 1.7F, -0.8F, 1F); // Import 
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}
}