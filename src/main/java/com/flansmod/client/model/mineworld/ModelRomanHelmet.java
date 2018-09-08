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

public class ModelRomanHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelRomanHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[4];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		headModel[1] = new ModelRendererTurbo(this, 32, 0, textureX, textureY); // Box 4
		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		headModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 8, 8, 0F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F, 1F); // Box 4
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1.5F, -9.8F, -4.99F, 3, 1, 1, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 8.98F, -0.5F, -0.01F, 8.98F, -0.5F, 0.99F, 0F, -0.5F, 0.99F, 0F, -0.5F, 0.99F, 8.98F, -0.5F, 0.99F, 8.98F); // Box 4
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1.5F, -7.9F, 3.01F, 3, 1, 1, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0F, -0.5F, -0.01F, 0.98F, -0.5F, -0.01F, 0.98F, -0.5F, 2.99F, 0F, -0.5F, 2.99F, 0F, -0.5F, 2.99F, 0.98F, -0.5F, 2.99F, 0.98F); // Box 5
		headModel[3].setRotationPoint(0F, 0F, 0F);


	}
}