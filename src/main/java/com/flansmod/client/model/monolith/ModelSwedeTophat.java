//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SwedeTophat
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSwedeTophat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelSwedeTophat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 9, 7, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		headModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 11
		headModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13

		headModel[0].addShapeBox(-4F, -5.5F, -3.9F, 8, 2, 8, 0F,0.2F, 1.7F, 0.4F, 0.2F, 1.7F, 0.4F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -0.7F, 0.1F, 0.2F, -0.7F, 0.1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -12.5F, -3.9F, 8, 5, 8, 0F,-0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, -1.2F, 0.8F, -0.2F, -1.2F, 0.8F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, 0.2F, 1.3F, 0.3F, 0.2F, 1.3F, 0.3F); // Box 23
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(3.5F, -15F, 0.5F, 1, 4, 1, 0F,0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-2.5F, -4F, -2.9F, 6, 1, 6, 0F,2.4F, 1.7F, 3.4F, 3.2F, 1.7F, 3.4F, 3.2F, 0.7F, 3.3F, 2.4F, 0.7F, 3.3F, 2.7F, -1.5F, 3.5F, 2.2F, -1.5F, 3.5F, 2.2F, -0.7F, 3.1F, 2.7F, -0.7F, 3.1F); // Box 9
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(5.5F, -7F, -5.9F, 1, 3, 12, 0F,0.2F, 1.2F, -2.6F, 0.2F, 1.2F, -2.6F, 0.2F, 0.6F, -2.7F, 0.2F, 0.6F, -2.7F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -0.7F, 0.1F, 0.2F, -0.7F, 0.1F); // Box 11
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(5.5F, -12.9F, -2.9F, 1, 4, 6, 0F,0.2F, -0.7F, -1.9F, 0.2F, -0.7F, -1.9F, 0.2F, -1.3F, -0.4F, 0.2F, -1.3F, -0.4F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.2F, 1.3F, 0.4F, 0.2F, 1.3F, 0.4F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-7.4F, -4F, -5.9F, 2, 1, 12, 0F,-0.8F, 3.7F, -1.6F, 0.5F, 1.7F, 0.4F, 0.5F, 0.7F, 0.3F, -0.8F, 2.7F, -1.7F, -0.2F, -4F, -1.5F, 0.2F, -1.5F, 0.5F, 0.2F, -0.7F, 0.1F, -0.2F, -3.2F, -1.9F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}
}