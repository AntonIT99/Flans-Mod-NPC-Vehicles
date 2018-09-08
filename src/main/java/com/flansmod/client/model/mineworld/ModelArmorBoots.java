//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GermanPants
// Model Creator: 
// Created on: 28.02.2016 - 17:04:01
// Last changed on: 28.02.2016 - 17:04:01

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArmorBoots extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelArmorBoots() //Same as Filename
	{
		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 2

		leftLegModel[0].addShapeBox(-2F, 6F, -2F, 4, 6, 4, 0F, 0.5F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.5F, 0.05F, 0.45F); // Box 2
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Import 

		rightLegModel[0].addShapeBox(-2F, 6F, -2F, 4, 6, 4, 0F, 0.5F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.25F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.25F, 0.05F, 0.45F, 0.5F, 0.05F, 0.45F); // Import 
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);


	}
}