//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tonkyogasa
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTonkyogasa extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelTonkyogasa() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		headModel[1] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 5
		headModel[2] = new ModelRendererTurbo(this, 28, 1, textureX, textureY); // Box 14
		headModel[3] = new ModelRendererTurbo(this, 37, 6, textureX, textureY); // Box 29
		headModel[4] = new ModelRendererTurbo(this, 43, 11, textureX, textureY); // Box 8
		headModel[5] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 9
		headModel[6] = new ModelRendererTurbo(this, 28, 13, textureX, textureY); // Box 78
		headModel[7] = new ModelRendererTurbo(this, 45, 25, textureX, textureY); // Box 58
		headModel[8] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 13
		headModel[9] = new ModelRendererTurbo(this, 43, 11, textureX, textureY); // Box 14
		headModel[10] = new ModelRendererTurbo(this, 54, 1, textureX, textureY); // Box 15

		headModel[0].addShapeBox(-4.5F, -8F, -4.5F, 9, 3, 9, 0F,-0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, 0.4F, -0.4F, 1F, 0.4F, -0.4F, 1F, 0.4F, 1F, 0.8F, 0.4F, 1F, 0.8F); // Box 4
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -14F, -4.5F, 9, 6, 9, 0F,-4.4F, 0F, -7F, -4.4F, 0F, -7F, -4.4F, 0F, -1.9F, -4.4F, 0F, -1.9F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F); // Box 5
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -6F, -8.5F, 10, 1, 3, 0F,-2.5F, -0.9F, -1.3F, -2.5F, -0.9F, -1.3F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -2F, 1F, 0.1F, -2F, 1F, 0.1F, 0.3F, 0.5F, -0.1F, 0.3F, 0.5F, -0.1F); // Box 14
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -6F, -5.5F, 10, 1, 3, 0F,-0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.7F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, -2F, 0F, 4.3F, -2F, 0F, 4.3F); // Box 29
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(3.5F, -4F, -4.5F, 1, 4, 9, 0F,-0.6F, 1.3F, 0F, 0.4F, 1.3F, 0F, 0.4F, 0F, 0.8F, 0F, 0F, 0.8F, -1.5F, -0.5F, -1.8F, 1.4F, -1.1F, -1.8F, 1.2F, 0F, -1.5F, -1.2F, 0.6F, -1.5F); // Box 8
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0F, -3F, 3.5F, 4, 3, 1, 0F,1F, 1F, -1.8F, 0.9F, 1F, -1.8F, 0.4F, -1F, 0.8F, -1F, -2F, 0.8F, -4.7F, 0.6F, 0.5F, 1.7F, 0F, 0.5F, 0.8F, -0.5F, 0.2F, -3F, 0.2F, 0F); // Box 9
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -1.3F, -4.3F, 8, 1, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F); // Box 78
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -4.5F, -2.5F, 8, 5, 1, 0F,0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.3F, -0.2F, 0.8F, 0.3F, -0.2F, 0.8F, 0.3F, -0.2F, -0.7F, 0.3F, -0.3F, -0.7F); // Box 58
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-15F, -23.5F, -5.6F, 30, 30, 1, 0F,-13F, -13F, -3.9F, -13F, -13F, -3.9F, -13F, -13F, 4F, -13F, -13F, 4F, -13F, -14F, -0.7F, -13F, -14F, -0.7F, -13F, -14F, 0F, -13F, -14F, 0F); // Box 13
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.5F, -4F, -4.5F, 1, 4, 9, 0F,0.4F, 1.3F, 0F, -0.6F, 1.3F, 0F, 0F, 0F, 0.8F, 0.4F, 0F, 0.8F, 1.4F, -1.1F, -1.8F, -1.5F, -0.5F, -1.8F, -1.2F, 0.6F, -1.5F, 1.2F, 0F, -1.5F); // Box 14
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -3F, 3.5F, 4, 3, 1, 0F,0.9F, 1F, -1.8F, 1F, 1F, -1.8F, -1F, -2F, 0.8F, 0.4F, -1F, 0.8F, 1.7F, 0F, 0.5F, -4.7F, 0.6F, 0.5F, -3F, 0.2F, 0F, 0.8F, -0.5F, 0.2F); // Box 15
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}
}