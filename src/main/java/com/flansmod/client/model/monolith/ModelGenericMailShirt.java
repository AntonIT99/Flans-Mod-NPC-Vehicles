//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GenericMailShirt
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGenericMailShirt extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelGenericMailShirt() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 47
		bodyModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 48

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 2, 4, 0F,0.7F, 0F, 1F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0.7F, 0F, 1F); // Box 47
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 10, 5, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 48
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 78

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 7, 4, 0F,0.3F, 0.4F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.4F, 0.3F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F); // Box 78
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 7, 4, 0F,0.3F, 0.25F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.25F, 0.3F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F); // Box 56
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44

		skirtFrontModel[0].addShapeBox(-4F, -1.5F, -2F, 8, 6, 2, 0F,0.4F, 2F, 0.4F, 0.4F, 2F, 0.4F, 0.4F, 2F, 0.4F, 0.4F, 2F, 0.4F, 0.9F, -3.5F, 0.9F, 0.9F, -3.5F, 0.9F, 0.9F, -3.5F, 0.9F, 0.9F, -3.5F, 0.9F); // Box 44
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 45

		skirtRearModel[0].addShapeBox(-4F, -1.5F, 0F, 8, 6, 2, 0F,0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.4F, 1F, 0.4F, 0.9F, -3.5F, 0.9F, 0.9F, -3.5F, 0.9F, 0.9F, -3.5F, 0.9F, 0.9F, -3.5F, 0.9F); // Box 45
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}