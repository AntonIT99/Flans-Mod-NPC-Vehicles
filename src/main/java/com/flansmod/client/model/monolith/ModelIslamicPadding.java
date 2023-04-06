//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: IslamicPadding
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIslamicPadding extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelIslamicPadding() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[5];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(-4F, 7.7F, -2F, 8, 1, 4, 0F,0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.2F, -2F, 7, 8, 4, 0F,0.7F, 0.1F, 0.5F, -3.5F, 0.1F, 0.5F, -3F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -3F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 8.8F, -2F, 8, 1, 4, 0F,0.55F, -0.1F, 0.55F, 0.55F, -0.1F, 0.55F, 0.55F, -0.1F, 0.55F, 0.55F, -0.1F, 0.55F, 0.55F, -0.1F, 0.55F, 0.55F, -0.1F, 0.55F, 0.55F, -0.1F, 0.55F, 0.55F, -0.1F, 0.55F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, -0.2F, -2F, 7, 8, 4, 0F,-1.5F, 0.1F, 0.4F, -2.3F, 0.1F, 0.5F, -2.3F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0.5F, 0.5F, 0.4F, -2.5F, 0.5F, 0.5F, -2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 27
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 6

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 6
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 5
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 25
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 70
		leftLegModel[3] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 72

		leftLegModel[0].addShapeBox(-2F, -1.5F, -2F, 4, 9, 4, 0F,1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0.7F, 0F, 1.2F, 1.5F, -0.5F, 0.7F, 1.5F, -0.5F, 0.7F, 0.7F, 0F, 1.2F); // Box 5
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 70
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7.8F, -2F, 4, 3, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 72
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 0
		rightLegModel[1] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 4
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 11
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 61

		rightLegModel[0].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -1.5F, -2F, 4, 9, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 1.6F, -0.5F, 0.7F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, 1.6F, -0.5F, 0.7F); // Box 4
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 7.8F, -2F, 4, 3, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}