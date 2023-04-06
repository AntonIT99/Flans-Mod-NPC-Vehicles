//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bork
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBork extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelBork() //Same as Filename
	{
		headModel = new ModelRendererTurbo[6];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 27
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 21
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		headModel[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 9
		headModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10

		headModel[0].addShapeBox(-4F, -8.5F, -4F, 8, 4, 8, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.3F, 0.95F, 0.3F, -0.3F, 0.95F, 0.05F, 0F, 0.2F, 0.05F, 0F, 0.2F, 0.05F, 0.4F, 0.2F, 0.05F, 0.4F, 0.2F); // Box 28
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -14F, -5.5F, 1, 10, 1, 0F,0F, 0.2F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, -0.6F, -0.3F, -0.3F, -0.6F, -0.3F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 27
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -14F, -5.5F, 1, 10, 1, 0F,-0.1F, -0.4F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, -0.1F, -0.4F, 0F, -0.3F, -0.3F, -0.6F, 0F, -0.3F, -0.6F, 0F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F); // Box 21
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -9.5F, -4F, 8, 1, 8, 0F,0.05F, -0.2F, -0.4F, 0.05F, -0.2F, -0.4F, 0.05F, -0.4F, 0.2F, 0.05F, -0.4F, 0.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.3F, 0.95F, 0.3F, 0.3F, 0.95F); // Box 8
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -13F, -2.5F, 6, 4, 6, 0F,0.8F, -0.5F, 0.3F, 0.8F, -0.5F, 0.3F, 3F, 0.8F, 2.95F, 3F, 0.8F, 2.95F, 0.55F, 0F, 0.7F, 0.55F, 0F, 0.7F, 0.55F, 0.4F, 0.2F, 0.55F, 0.4F, 0.2F); // Box 9
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -13.8F, 4.5F, 9, 16, 2, 0F,0.4F, -1F, 1F, 0.4F, -1F, 1F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0.5F, -1F, 1.4F, 0.5F, -1F, 2.4F, 0F, 1F, 2.4F, 0F, 1F); // Box 10
		headModel[5].setRotationPoint(0F, 0F, 0F);
	}
}