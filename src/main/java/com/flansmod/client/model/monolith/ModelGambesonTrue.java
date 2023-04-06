//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GambesonTrue
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGambesonTrue extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelGambesonTrue() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 16
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 17
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 28

		bodyModel[0].addShapeBox(-4F, 7.7F, -2F, 8, 1, 4, 0F,0.3F, -0.1F, 0.5F, 0.3F, -1.1F, 0.5F, 0.3F, -1.1F, 0.5F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F, 0.3F, 0.3F, 1.9F, 0.3F, 0.3F, 1.9F, 0.3F, 0.3F, -0.1F, 0.3F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.2F, -2F, 11, 8, 4, 0F,0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.3F, 0F, 0.5F, -2.7F, 1F, 0.5F, -2.7F, 1F, 0.5F, 0.3F, 0F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.3F, 0.9F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, 0.9F, 0.3F, 0.5F, -1.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -1.1F, 0.5F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 0.5F, -2.7F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F); // Box 11
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 6.5F, -2F, 8, 1, 4, 0F,0.6F, -0.9F, 0.6F, 0.6F, -3.5F, 0.6F, 0.6F, -3.5F, 0.6F, 0.6F, -0.9F, 0.6F, 0.6F, 1.1F, 0.6F, 0.6F, 3.5F, 0.6F, 0.6F, 3.5F, 0.6F, 0.6F, 1.1F, 0.6F); // Box 16
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(4F, 7.5F, 0F, 1, 13, 1, 0F,0.3F, -0.5F, 4F, -0.1F, -0.3F, 4F, -0.1F, 0.2F, -4F, 0.3F, 0F, -4F, -2.7F, -0.3F, -1.5F, 2.5F, -0.5F, -1.5F, 2.5F, -1F, 1F, -2.7F, -0.7F, 1F); // Box 17
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 3.5F, -2.7F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F); // Box 27
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 6.5F, -2.7F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F); // Box 28
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 6

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F); // Box 6
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.1F, 0.2F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 5
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[3] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 25
		leftLegModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 26
		leftLegModel[5] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Box 0

		leftLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 2
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -1.7F, -2F, 4, 9, 4, 0F,0.5F, 0.5F, 0.4F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, 0.5F, 0.4F, -0.3F, 0.4F, 0.8F, 1.5F, -0.5F, 0.7F, 1.5F, -0.5F, 0.7F, -0.3F, 0.4F, 0.8F); // Box 5
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 9.4F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 1F, 0.1F, -0.5F, 1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 26
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, -1.7F, -2F, 4, 5, 4, 0F,0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F); // Box 0
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Box 19
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 22
		rightLegModel[3] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 0
		rightLegModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 1
		rightLegModel[5] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 4

		rightLegModel[0].addShapeBox(-2F, 9.4F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -1.7F, -2F, 4, 5, 4, 0F,0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F); // Box 19
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 1F, 0.1F, -0.5F, 1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, -1.7F, -2F, 4, 9, 4, 0F,0.5F, 0.9F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.9F, 0.5F, 1.6F, -0.5F, 0.7F, -0.3F, 0.5F, 0.9F, -0.3F, 0.5F, 0.9F, 1.6F, -0.5F, 0.7F); // Box 4
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}