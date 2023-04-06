//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModeliranHeadband extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModeliranHeadband() //Same as Filename
	{
		headModel = new ModelRendererTurbo[4];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 3

		headModel[0].addShapeBox(-4F, -6.5F, -4F, 8, 2, 8, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 1F, 0.1F, 0.1F, 1F, 0.1F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.2F, -4.5F, 4F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -1F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1.5F, -1.5F, 2F, -1.5F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.8F, -4.5F, 4F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, -1F, 1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, -1.5F, 1F, 2F, -1.5F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-17F, -14.5F, -4.1F, 34, 18, 1, 0F,-13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);
	}
}