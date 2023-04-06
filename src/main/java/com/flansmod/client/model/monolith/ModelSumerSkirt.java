//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SumerSkirt
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSumerSkirt extends ModelCustomArmour //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelSumerSkirt() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13

		bodyModel[0].addShapeBox(-4F, 9.8F, -2F, 8, 10, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F); // Box 13
		bodyModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2

		skirtFrontModel[0].addShapeBox(-4F, -2.2F, -2.2F, 8, 10, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.2F); // Box 2
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14

		skirtRearModel[0].addShapeBox(-4F, -2.2F, -1.8F, 8, 10, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 14
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}