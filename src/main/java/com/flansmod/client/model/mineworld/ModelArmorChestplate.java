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

public class ModelArmorChestplate extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelArmorChestplate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		bodyModel[0] = new ModelRendererTurbo(this, 16, 16, textureX, textureY); // Import 

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Box 42

		leftArmModel[0].addShapeBox(3F, -2.2F, -2F, 4, 12, 4, 0F, -0.61F, 0.11F, 0.61F, -8.02F, 0.11F, 0.61F, -8.02F, 0.11F, 0.61F, -0.61F, 0.11F, 0.61F, -0.61F, 0.11F, 0.61F, -8.02F, 0.11F, 0.61F, -8.02F, 0.11F, 0.61F, -0.61F, 0.11F, 0.61F); // Box 42
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 40, 16, textureX, textureY); // Import 

		rightArmModel[0].addShapeBox(-3F, -2.2F, -2F, 4, 12, 4, 0F, 0.61F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.61F, 0.11F, 0.61F, 0.61F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.02F, 0.11F, 0.61F, 0.61F, 0.11F, 0.61F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


	}
}