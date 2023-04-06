//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Landsknecht
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLandsknecht extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelLandsknecht() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		headModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		headModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		headModel[3] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 12
		headModel[4] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 13
		headModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		headModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 15
		headModel[7] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 16
		headModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		headModel[9] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 18
		headModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19

		headModel[0].addShapeBox(-7F, -7.5F, -7F, 14, 2, 15, 0F,0.9F, 1.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -2.2F, 0.3F, 0.9F, -0.2F, 0.3F, 0.9F, -1.7F, 0.9F, 0.9F, 0.3F, 0.9F, 0.9F, 2.3F, -0.1F, 0.9F, 0.3F, -0.1F); // Box 5
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-7F, -9.5F, -7F, 14, 2, 15, 0F,0.5F, 0F, 0.4F, 0.5F, -2F, 0.4F, 0.5F, -3.7F, 0F, 0.5F, -1.7F, 0F, 0.9F, -1.5F, 0.9F, 0.9F, 0.5F, 0.9F, 0.9F, 2.2F, 0.3F, 0.9F, 0.2F, 0.3F); // Box 10
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-7F, -5.5F, -7F, 14, 1, 15, 0F,0.9F, 1.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -2.3F, -0.1F, 0.9F, -0.3F, -0.1F, 0.4F, -2.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, 1.8F, -0.6F, 0.4F, -0.2F, -0.6F); // Box 11
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -11F, -3.5F, 8, 2, 8, 0F,0.5F, -0.5F, 0.4F, 0.5F, -1.5F, 0.4F, 0.5F, -2.7F, 0F, 0.5F, -1.7F, 0F, 0.9F, -1F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 1.2F, 0.3F, 0.9F, 0.2F, 0.3F); // Box 12
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -9F, -3.5F, 8, 2, 8, 0F,0.9F, 1F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, -1.2F, 0.3F, 0.9F, -0.2F, 0.3F, 0.9F, -1.7F, 0.9F, 0.9F, 0.3F, 0.9F, 0.9F, 2.3F, -0.1F, 0.9F, 0.3F, -0.1F); // Box 13
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-9F, -12F, -0.5F, 11, 3, 1, 0F,0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-17F, -12F, -0.5F, 8, 3, 1, 0F,0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 2F, 0F); // Box 15
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-9F, -12F, 0.5F, 11, 3, 1, 0F,0F, 2.5F, -2F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.5F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 16
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-15F, -12F, 0.5F, 6, 3, 1, 0F,0F, -1F, -3F, 0F, 2.5F, -2F, 0F, 2.5F, 2F, 0F, -1F, 3F, -3F, 2F, -3F, 0F, 0F, -2F, 0F, 0F, 2F, -3F, 2F, 3F); // Box 17
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-9F, -11F, -1.5F, 11, 1, 1, 0F,0F, 2F, 2F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 2F, -2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F); // Box 18
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-15F, -11F, -1.5F, 6, 1, 1, 0F,0F, -1F, 3F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, -1F, -3F, -3F, 2F, 3F, 0F, 0F, 2F, 0F, 0F, -2F, -3F, 2F, -3F); // Box 19
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}
}