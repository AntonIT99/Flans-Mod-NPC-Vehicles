//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Eboshi
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEboshi extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelEboshi() //Same as Filename
	{
		headModel = new ModelRendererTurbo[6];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 31
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		headModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 33

		headModel[0].addShapeBox(-4F, -7F, -4F, 8, 2, 8, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1F, 1F, 0.5F, -1F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F); // Box 27
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9F, -4F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 1.7F, 0F, -0.9F, 1.7F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 1F, 0.5F, 0.4F, 1F, 0.5F); // Box 28
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -13F, -4F, 8, 4, 8, 0F,-3F, 0F, -4.6F, -3F, 0F, -4.6F, -3.5F, 0.5F, 5.4F, -3.5F, 0.5F, 5.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1.7F, 0F, 1F, 1.7F); // Box 29
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -5.5F, 4F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -5F, 4.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.3F, -0.5F, -0.5F, -2.7F, 0.5F, -0.5F, -2.7F, 0F, 1.5F, 3.3F, -1F, 1.5F); // Box 32
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -5F, 4.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.7F, 0.5F, -0.5F, 3.3F, -0.5F, -0.5F, 3.3F, -1F, 1.5F, -2.7F, 0F, 1.5F); // Box 33
		headModel[5].setRotationPoint(0F, 0F, 0F);
	}
}