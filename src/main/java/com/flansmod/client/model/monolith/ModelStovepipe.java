//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Stovepipe
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStovepipe extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelStovepipe() //Same as Filename
	{
		headModel = new ModelRendererTurbo[9];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		headModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 24
		headModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 25
		headModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 26
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		headModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 28
		headModel[8] = new ModelRendererTurbo(this, 37, 25, textureX, textureY); // Box 29

		headModel[0].addShapeBox(-4F, -5.5F, -3.9F, 8, 2, 8, 0F,0.2F, 1.7F, 0.4F, 0.2F, 1.7F, 0.4F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.2F, -1.5F, 0.5F, 0.2F, -1.5F, 0.5F, 0.2F, -0.7F, 0.1F, 0.2F, -0.7F, 0.1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -6F, -8F, 9, 1, 3, 0F,-2.5F, -0.7F, -1.3F, -2.5F, -0.7F, -1.3F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -2F, 0.5F, 0.3F, -2F, 0.5F, 0.3F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -13.5F, -3.9F, 8, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.2F, 1F, 0F, -1.2F, 1F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, 0.2F, 1.3F, 0.3F, 0.2F, 1.3F, 0.3F); // Box 23
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-2F, -12F, -4.5F, 4, 5, 1, 0F,0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-2F, -12.5F, -3.8F, 4, 1, 1, 0F,-1.9F, 0F, -0.2F, -1.9F, 0F, -0.2F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2F, -7F, -4.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, 0.1F, -1.9F, 0F, 0.1F, -1.9F, 0F, 0F, -1.9F, 0F, 0F); // Box 26
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -13.6F, -3.8F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 27
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -17.5F, -3.5F, 1, 4, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 28
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -6F, -5F, 9, 1, 3, 0F,-0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.7F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, -2F, 0F, 4.3F, -2F, 0F, 4.3F); // Box 29
		headModel[8].setRotationPoint(0F, 0F, 0F);
	}
}