//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: cuirassStandalone
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelcuirassStandalone extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelcuirassStandalone() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 92
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 17
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 25
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 26
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		bodyModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 199
		bodyModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 200
		bodyModel[10] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 201
		bodyModel[11] = new ModelRendererTurbo(this, 1, 22, textureX, textureY); // Box 202

		bodyModel[0].addShapeBox(0F, -0.5F, -2F, 4, 2, 4, 0F,-0.5F, -0.2F, 0.5F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.7F, 0F, 0F, 1F); // Box 92
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2.5F, -0.5F, -2F, 1, 3, 4, 0F,-0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -0.2F, 0F, 0.6F, 0F, 0.3F, 1.5F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, 0F, 0.3F, 1.5F); // Box 17
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, -0.5F, -2F, 4, 2, 4, 0F,0F, -0.3F, 0.15F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.3F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, -0.2F, 0F, 0.7F); // Box 25
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, -0.5F, -2F, 1, 3, 4, 0F,0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.6F, 0F, 0F, 0.5F, -0.2F, 0F, 1.2F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1.5F, -0.2F, 0F, 1.2F); // Box 52
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1.5F, -2F, 8, 6, 4, 0F,-0.2F, 0F, 0.5F, -4F, 0F, 1.5F, -4F, 0F, 1F, -0.2F, 0F, 0.7F, -0.1F, -4F, 0.7F, -3.9F, -3F, 2.3F, -4F, -3F, 1.5F, -0.1F, -4F, 1F); // Box 26
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 4.5F, -2F, 8, 6, 4, 0F,-0.1F, 1F, 0.7F, -3.9F, 0F, 2.3F, -4F, 0F, 1.5F, -0.1F, 1F, 1F, 0.9F, -4F, 0.8F, -3.8F, -2.49F, 2.1F, -4F, -3F, 1.2F, 0.9F, -4F, 0.8F); // Box 27
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 7.5F, -2F, 8, 6, 4, 0F,0.9F, 1F, 0.8F, -3.8F, -0.5F, 2.1F, -4F, 0F, 1.2F, 0.9F, 1F, 0.8F, 0.5F, -3.5F, 0.5F, -3.9F, -2.8F, 1.5F, -4F, -3F, 0.8F, 0.5F, -3.5F, 0.4F); // Box 28
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 11F, -2F, 4, 1, 4, 0F,0.5F, 1F, 0.5F, 0F, 0.3F, 1.5F, 0F, 0.5F, 0.8F, 0.5F, 1F, 0.4F, 0.6F, -1.8F, 0.7F, 0F, -0.8F, 2F, 0F, -0.8F, 1.2F, 0.6F, -1.8F, 0.6F); // Box 29
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 11F, -2F, 4, 1, 4, 0F,0F, 0.3F, 1.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.4F, 0F, 0.5F, 0.8F, 0F, -0.8F, 2F, 0.6F, -1.8F, 0.7F, 0.6F, -1.8F, 0.6F, 0F, -0.8F, 1.2F); // Box 199
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 7.5F, -2F, 8, 6, 4, 0F,-0.2F, -0.5F, 2.1F, -3.1F, 1F, 0.8F, -3.1F, 1F, 0.8F, 0F, 0F, 1.2F, -0.1F, -2.8F, 1.5F, -3.5F, -3.5F, 0.5F, -3.5F, -3.5F, 0.4F, 0F, -3F, 0.8F); // Box 200
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 4.5F, -2F, 8, 6, 4, 0F,-0.1F, 0F, 2.3F, -4.1F, 1F, 0.7F, -4.1F, 1F, 1F, 0F, 0F, 1.5F, -0.2F, -2.49F, 2.1F, -3.1F, -4F, 0.8F, -3.1F, -4F, 0.8F, 0F, -3F, 1.2F); // Box 201
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 1.5F, -2F, 8, 6, 4, 0F,0F, 0F, 1.5F, -4.2F, 0F, 0.5F, -4.2F, 0F, 0.7F, 0F, 0F, 1F, -0.1F, -3F, 2.3F, -4.1F, -4F, 0.7F, -4.1F, -4F, 1F, 0F, -3F, 1.5F); // Box 202
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
	}
}