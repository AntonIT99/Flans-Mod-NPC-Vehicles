//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NizamFez
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNizamFez extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelNizamFez() //Same as Filename
	{
		headModel = new ModelRendererTurbo[10];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 25
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 19
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 13
		headModel[7] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 14
		headModel[8] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 15
		headModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16

		headModel[0].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.2F, 1.5F, 0.3F, 0.2F, 1.5F, 0.3F, 0.2F, 0.9F, 0.7F, 0.2F, 0.9F, 0.7F, 0.1F, -1.5F, 0.5F, 0.1F, -1.5F, 0.5F, 0.1F, -0.6F, 0.3F, 0.1F, -0.6F, 0.3F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -2F, -4.5F, 4, 1, 1, 0F,0F, -1F, -0.3F, -1F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, 0F, -1F, -0.3F, -2.5F, -0.3F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, -2.5F, -0.3F, -0.3F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0F, -2F, -4.5F, 4, 1, 1, 0F,-1F, 0.5F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, -1F, 0.5F, -0.3F, 0.2F, -1F, -0.3F, -2.5F, -0.3F, -0.3F, -2.5F, -0.3F, -0.3F, 0.2F, -1F, -0.3F); // Box 25
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3F, -5F, -4F, 2, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 18
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(1F, -5F, -4F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 19
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -12F, -4F, 8, 4, 8, 0F,0.5F, 0.4F, 0.2F, 0.3F, 0.6F, 0.2F, 0.5F, -0.5F, 1.7F, 0.4F, -0.7F, 1.6F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 1.1F, 0.7F, 0.2F, 1.1F, 0.7F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-3F, -11F, 6F, 4, 5, 2, 0F,0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3F, -13F, 0F, 4, 1, 8, 0F,-1.5F, 0F, -2F, 1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -0.5F, 0.5F, 0.2F, 2F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 14
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -6F, 5.5F, 6, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -1F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F); // Box 15
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -2.5F, 5.5F, 5, 2, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.8F, -0.5F, 0F, 0.8F, -1.5F, 0.5F, -2.3F, -1F, 0.5F, -2.3F, -1F, 0F, 1.8F, -1.5F, 0F, 1.8F); // Box 16
		headModel[9].setRotationPoint(0F, 0F, 0F);
	}
}