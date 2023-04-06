//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.12.2019 - 11:13:27
// Last changed on: 20.12.2019 - 11:13:27

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelegyptheaddress extends ModelCustomArmour //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public Modelegyptheaddress() //Same as Filename
	{
		headModel = new ModelRendererTurbo[5];
		headModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 20
		headModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 21
		headModel[2] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 23
		headModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 24

		headModel[0].addShapeBox(-4F, -7F, -4F, 8, 2, 8, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0.125F, 0F, 0F); // Box 20
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addBox(-4F, -8F, -4F, 8, 2, 9, 0F); // Box 21
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addBox(-4F, -8F, 4F, 8, 8, 1, 0F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addBox(-5F, -7.5F, -3F, 1, 7, 7, 0F); // Box 23
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addBox(4F, -7.5F, -3F, 1, 7, 7, 0F); // Box 24
		headModel[4].setRotationPoint(0F, 0F, 0F);


	}
}