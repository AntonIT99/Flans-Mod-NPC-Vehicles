//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 19.12.2016 - 17:05:16
// Last changed on: 19.12.2016 - 17:05:16

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTest extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTest() //Same as Filename
	{
		headModel = new ModelRendererTurbo[2];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		headModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5

		headModel[0].addShapeBox(9.00F, 8.00F, -8.00F, 3, 2, 1, 0.00F, -2.00F, 0.00F, 2.00F, -3.00F, 0.00F, 3.00F, -4.00F, 0.00F, 4.00F, -1.00F, 0.00F, 1.00F, -6.00F, 0.00F, 6.00F, -7.00F, 0.00F, 7.00F, -8.00F, 0.00F, 8.00F, -5.00F, 0.00F, 5.00F);
		headModel[0].setRotationPoint(6.00F, 5.00F, -6.00F);

		headModel[1].addBox(9.00F, 8.00F, -8.00F, 3, 2, 1, 0.00F);
		headModel[1].setRotationPoint(6.00F, 5.00F, -6.00F);




	}
}