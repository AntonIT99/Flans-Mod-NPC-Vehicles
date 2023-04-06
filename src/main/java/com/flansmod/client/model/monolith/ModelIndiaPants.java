//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIndiaPants extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelIndiaPants() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2

		bodyModel[0].addShapeBox(-12F, 8F, -10F, 24, 5, 20, 0F,-7.9F, -2F, -7.9F, -7.9F, -2F, -7.9F, -7.9F, -2F, -7.9F, -7.9F, -2F, -7.9F, -7.4F, -2F, -7.4F, -7.4F, -2F, -7.4F, -7.4F, -2F, -7.4F, -7.4F, -2F, -7.4F); // Box 24
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-12F, 9F, -10F, 24, 5, 20, 0F,-7.4F, -2F, -7.4F, -7.4F, -2F, -7.4F, -7.4F, -2F, -7.4F, -7.4F, -2F, -7.4F, -7.5F, -1F, -7.5F, -7.5F, -1F, -7.5F, -7.5F, -1F, -7.5F, -7.5F, -1F, -7.5F); // Box 0
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 1
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-5F, 9.5F, 0F, 1, 8, 1, 0F,0.3F, -0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.4F, 0.3F, 1.3F, 0.2F, -0.2F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 1.5F, -0.2F, 1.3F); // Box 2
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0

		leftLegModel[0].addShapeBox(-10F, -20F, -10F, 20, 48, 20, 0F,-7.4F, -20F, -7.4F, -7.4F, -20F, -7.4F, -7.4F, -20F, -7.4F, -7.4F, -20F, -7.4F, -7F, -20F, -7F, -7F, -20F, -7F, -7F, -20F, -7F, -7F, -20F, -7F); // Box 0
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 18

		rightLegModel[0].addShapeBox(-10F, -20F, -10F, 20, 48, 20, 0F,-7.4F, -20F, -7.4F, -7.4F, -20F, -7.4F, -7.4F, -20F, -7.4F, -7.4F, -20F, -7.4F, -7F, -20F, -7F, -7F, -20F, -7F, -7F, -20F, -7F, -7F, -20F, -7F); // Box 18
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}