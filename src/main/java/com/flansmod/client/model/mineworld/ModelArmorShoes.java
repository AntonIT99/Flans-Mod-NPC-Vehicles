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

public class ModelArmorShoes extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelArmorShoes() //Same as Filename
	{
		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 6

		leftLegModel[0].addShapeBox(2F, 0F, -2F, 4, 12, 4, 0F, -0.51F, 0.01F, 0.51F, -8.01F, 0.01F, 0.51F, -8.01F, 0.01F, 0.51F, -0.51F, 0.01F, 0.51F, -0.51F, 0.01F, 0.51F, -8.01F, 0.01F, 0.51F, -8.01F, 0.01F, 0.51F, -0.51F, 0.01F, 0.51F); // Box 6
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 5

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 12, 4, 0F, 0.51F, 0.01F, 0.51F, 0.01F, 0.01F, 0.51F, 0.01F, 0.01F, 0.51F, 0.51F, 0.01F, 0.51F, 0.51F, 0.01F, 0.51F, 0.01F, 0.01F, 0.51F, 0.01F, 0.01F, 0.51F, 0.51F, 0.01F, 0.51F); // Box 5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);


	}
}