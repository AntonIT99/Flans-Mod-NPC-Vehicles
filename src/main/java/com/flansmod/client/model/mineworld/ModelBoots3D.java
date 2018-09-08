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

public class ModelBoots3D extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelBoots3D() //Same as Filename
	{
		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 2

		leftArmModel[0].addShapeBox(-5F, 10F, -2F, 4, 12, 4, 0F, 0.01F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.01F, 0.15F, 0.45F, 0.01F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.01F, 0.15F, 0.45F); // Box 2
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Import 

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 12, 4, 0F, 0.5F, 0.15F, 0.45F, 0.01F, 0.15F, 0.45F, 0.01F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F, 0.01F, 0.15F, 0.45F, 0.01F, 0.15F, 0.45F, 0.5F, 0.15F, 0.45F); // Import 
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);


	}
}