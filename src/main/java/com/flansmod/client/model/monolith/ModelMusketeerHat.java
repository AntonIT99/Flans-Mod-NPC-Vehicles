//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MusketeerHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMusketeerHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMusketeerHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 16
		headModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 17
		headModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 18
		headModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 19
		headModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 12
		headModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
		headModel[9] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 14
		headModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 15

		headModel[0].addShapeBox(2F, -10F, 1.5F, 7, 3, 1, 0F,0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(9F, -10F, 1.5F, 6, 3, 1, 0F,0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, 0F, 0F); // Box 15
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(2F, -10F, 1.5F, 7, 3, 1, 0F,0F, -2F, 0F, 0F, 2.5F, -2F, 0F, 2.5F, 2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 16
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(9F, -10F, 1.5F, 4, 3, 1, 0F,0F, 2.5F, -2F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, 2.5F, 2F, 0F, 0F, -2F, -3F, 2F, -3F, -3F, 2F, 3F, 0F, 0F, 2F); // Box 17
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(2F, -9F, 1.5F, 7, 1, 1, 0F,0F, -1.5F, 0F, 0F, 2F, 2F, 0F, 2F, -2F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 1F, 0F); // Box 18
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(9F, -9F, 1.5F, 4, 1, 1, 0F,0F, 2F, 2F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 2F, -2F, 0F, 0F, 2F, -3F, 2F, 3F, -3F, 2F, -3F, 0F, 0F, -2F); // Box 19
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-11F, -6F, -3F, 22, 1, 6, 0F,-7F, 1F, 0F, -7F, 1F, 0F, -7F, 1F, 0F, -7F, 1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-11F, -6F, -10F, 22, 1, 7, 0F,-7F, -0.8F, 0F, -7F, -0.8F, 0F, -7F, 1F, 0F, -7F, 1F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 12
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-11F, -6F, 3F, 22, 1, 7, 0F,-7F, 1F, 0F, -7F, 1F, 0F, -7F, -1.8F, 0F, -7F, -1.8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -7F, 1F, 0F, -7F, 1F, 0F); // Box 13
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -8F, -4F, 8, 2, 9, 0F,0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 14
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -12F, -4F, 8, 4, 9, 0F,-1F, -0.5F, -2F, -1F, -0.5F, -2F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}
}