//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mongol
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMongolHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMongolHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 136
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		headModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 7

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -1.5F, 1.7F, 0.9F, -1.5F, 1.7F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.3F, -4F, 8, 2, 8, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -1.5F, -3F, 0F, -1.5F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -11.3F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -1.3F, -0.3F, -0.2F, -1.3F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.7F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 2F, 0.5F, 0F, 2F); // Box 49
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 136
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -6.5F, -5F, 10, 2, 11, 0F,0.9F, 0.5F, 0.9F, 0.9F, 0.5F, 0.9F, 0.9F, -1.2F, 0.3F, 0.9F, -1.2F, 0.3F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, 1.3F, -0.1F, 0.9F, 1.3F, -0.1F); // Box 5
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -8.5F, -5F, 10, 1, 11, 0F,0.6F, -0.9F, 0.6F, 0.6F, -0.9F, 0.6F, 0.6F, -2.7F, 0F, 0.6F, -2.7F, 0F, 0.9F, 0.5F, 0.9F, 0.9F, 0.5F, 0.9F, 0.9F, 2.2F, 0.3F, 0.9F, 2.2F, 0.3F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -3.7F, -5F, 10, 1, 11, 0F,0.9F, 1.5F, 0.9F, 0.9F, 1.5F, 0.9F, 0.9F, -0.5F, -0.1F, 0.9F, -0.5F, -0.1F, 0.6F, -2F, 0.6F, 0.6F, -2F, 0.6F, 0.6F, 0.1F, -0.4F, 0.6F, 0.1F, -0.4F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}
}