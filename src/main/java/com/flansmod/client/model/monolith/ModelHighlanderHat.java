//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HighlanderHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHighlanderHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelHighlanderHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[4];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 12
		headModel[2] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 13
		headModel[3] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 4

		headModel[0].addShapeBox(-4F, -5.5F, -3.9F, 8, 3, 8, 0F,0.4F, 1.7F, 0.4F, 0.4F, 1.7F, 0.4F, 0.4F, 0.7F, 0.5F, 0.4F, 0.7F, 0.5F, 0.5F, -2.5F, 0.3F, 0.5F, -2.5F, 0.3F, 0.5F, -1.7F, 0.1F, 0.5F, -1.7F, 0.1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8.5F, -3.9F, 8, 1, 8, 0F,1.2F, -0.2F, 1.5F, 1.2F, -0.2F, 1.5F, 1.2F, -1.5F, 2F, 1.2F, -1.5F, 2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 1.3F, 0.5F, 0.4F, 1.3F, 0.5F); // Box 12
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -9.2F, -3.9F, 8, 2, 8, 0F,-1.3F, 1F, -2F, -1.3F, 1F, -2F, -1.3F, 0.6F, -1F, -1.3F, 0.6F, -1F, 1.2F, -1.1F, 1.5F, 1.2F, -1.1F, 1.5F, 1.2F, 0.2F, 2F, 1.2F, 0.2F, 2F); // Box 13
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -12F, -0.3F, 2, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		headModel[3].setRotationPoint(0F, 0F, 0F);
	}
}