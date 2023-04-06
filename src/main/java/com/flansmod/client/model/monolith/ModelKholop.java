//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kholop
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKholop extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelKholop() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		bodyModel[2] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 41
		bodyModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 44

		bodyModel[0].addShapeBox(-4F, -0.2F, -2F, 8, 8, 4, 0F,0.7F, 0F, 0.8F, 0.7F, 0F, 0.8F, 0.7F, 0F, 1.8F, 0.7F, 0F, 1.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8.2F, -2F, 8, 1, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 24
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 7.8F, -2F, 8, 1, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 39
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 8.8F, -2F, 8, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.8F, 0F, 0.6F, 0.8F, 0F, 0.6F, 0.8F, 0F, 0.6F, 0.8F, 0F, 0.6F); // Box 40
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, -5.2F, 3.5F, 9, 6, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 41
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(4F, -5.2F, -2.5F, 1, 7, 6, 0F,0F, -1.5F, -1.5F, 0.5F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0.3F, -0.5F, -1.8F, 0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5F, -5.2F, -2.5F, 1, 7, 6, 0F,0.5F, -1.5F, -1F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.8F, 0.3F, 0F, -1.8F, 0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 44
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 45
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 46

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.4F, 0.5F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.5F, 0.4F, 0.2F, 1.2F, 1F, 1F, 0.9F, 0.8F, 1F, 0.9F, 0.8F, 0.2F, 1.2F, 1F); // Box 45
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 2.7F, -2F, 4, 5, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F); // Box 46
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 27

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.5F, 0.3F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.5F, 0.3F, 0.4F, 1F, 0.9F, 0.8F, 0.2F, 1.2F, 1F, 0.2F, 1.2F, 1F, 1F, 0.9F, 0.8F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 2.7F, -2F, 4, 5, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F); // Box 27
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 44
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 47
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 48

		leftLegModel[0].addShapeBox(-2F, -1.4F, -2F, 4, 11, 4, 0F,0.7F, 0.7F, 0.7F, 0.7F, 1F, 0.7F, 0.7F, 1F, 0.7F, 0.7F, 0.7F, 0.7F, -0.3F, 0.2F, 2.4F, 2F, 0F, 1.5F, 2F, 0F, 1.5F, -0.3F, 0.2F, 2.4F); // Box 44
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 47
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 48
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 11
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 61

		rightLegModel[0].addShapeBox(-2F, -1.4F, -2F, 4, 11, 4, 0F,0.8F, 1F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 1F, 0.8F, 2F, 0F, 1.5F, -0.3F, 0.2F, 2.4F, -0.3F, 0.2F, 2.4F, 2F, 0F, 1.5F); // Box 4
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}