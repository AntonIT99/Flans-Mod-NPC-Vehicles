//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SkinArmor
// Model Creator: 
// Created on: 28.02.2016 - 16:11:42
// Last changed on: 28.02.2016 - 16:11:42

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArmorHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelArmorHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[2];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		headModel[1] = new ModelRendererTurbo(this, 32, 0, textureX, textureY); // Box 4

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F); // Box 4
		headModel[1].setRotationPoint(0F, 0F, 0F);


	}
}