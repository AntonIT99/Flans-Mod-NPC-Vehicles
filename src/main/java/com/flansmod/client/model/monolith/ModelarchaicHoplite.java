//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: archaicHoplite
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelarchaicHoplite extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelarchaicHoplite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[16];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];
		skirtFrontModel = new ModelRendererTurbo[3];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 68
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 89
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 90
		bodyModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 91
		bodyModel[6] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 92
		bodyModel[7] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 93
		bodyModel[8] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 96
		bodyModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 97
		bodyModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 15
		bodyModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 21
		bodyModel[15] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 22

		bodyModel[0].addShapeBox(-4F, 6.5F, -2F, 4, 4, 4, 0F,0.1F, -1F, 0.4F, 0F, -0.5F, 0.8F, 0F, 0F, 1F, 0.2F, 0F, 0.5F, 0.15F, -0.4F, 0.2F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0.15F, -0.4F, 0.2F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2.2F, 4, 2, 4, 0F,-1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, -1F, 0.4F, 0.5F, -2F, -0.3F, 1F, 0F, 0.2F, 1.5F, 0F, -0.7F, 0.5F, -2F, -1F, 0.5F); // Box 68
		bodyModel[1].setRotationPoint(0F, -3F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -2.2F, 4, 2, 4, 0F,0F, 0.8F, 0.5F, -1F, 0.4F, 0.5F, -1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.2F, 1.5F, -2F, -0.3F, 1F, -2F, -1F, 0.5F, 0F, -0.7F, 0.5F); // Box 69
		bodyModel[2].setRotationPoint(0F, -3F, 0F);

		bodyModel[3].addShapeBox(-4F, 3.5F, -2F, 4, 3, 4, 0F,0.5F, -1F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0.1F, -1F, 0.5F, 0.1F, 1F, 0.4F, 0F, 0.49F, 0.8F, 0F, 0F, 1F, 0.2F, 0F, 0.4F); // Box 89
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1.5F, -2F, 4, 2, 4, 0F,0.8F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, 0.8F, 0.5F, 0.3F, 0.5F, 1F, 0.4F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0.1F, 1F, 0.5F); // Box 90
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, -0.5F, -2F, 4, 1, 4, 0F,1F, -0.3F, 0.3F, -1.5F, -0.3F, 0.2F, 0F, -0.3F, 0.8F, 1F, -0.3F, 0.5F, 0.8F, 0.5F, 0.5F, -0.5F, 0.5F, 0.8F, 0F, 0.5F, 1F, 0.8F, 0.5F, 0.3F); // Box 91
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -0.5F, -2F, 4, 1, 4, 0F,-1.5F, -0.3F, 0.2F, 1F, -0.3F, 0.3F, 1F, -0.3F, 0.5F, 0F, -0.3F, 0.8F, -0.5F, 0.5F, 0.8F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.3F, 0F, 0.5F, 1F); // Box 92
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 1.5F, -2F, 4, 2, 4, 0F,0F, 0.5F, 0.8F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.3F, 0F, 0.5F, 1F, 0F, 0F, 0.8F, 0.5F, 1F, 0.4F, 0.1F, 1F, 0.5F, 0F, 0F, 1F); // Box 93
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 3.5F, -2F, 4, 3, 4, 0F,0F, 0F, 0.8F, 0.5F, -1F, 0.4F, 0.1F, -1F, 0.5F, 0F, 0F, 1F, 0F, 0.51F, 0.8F, 0.1F, 1F, 0.4F, 0.2F, 0F, 0.4F, 0F, 0F, 1F); // Box 96
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 6.5F, -2F, 4, 4, 4, 0F,0F, -0.5F, 0.8F, 0.1F, -1F, 0.4F, 0.2F, 0F, 0.5F, 0F, 0F, 1F, 0F, -0.4F, 0.4F, 0.15F, -0.4F, 0.2F, 0.15F, -0.4F, 0.2F, 0F, -0.4F, 0.4F); // Box 97
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 1.8F, -2.1F, 4, 2, 1, 0F,-0.4F, 0.2F, 0.5F, -0.2F, 0F, 0.8F, 0F, 0.5F, -1.5F, -0.2F, 0.5F, -0.3F, 0.4F, 0.3F, 1F, -0.4F, 0.3F, 1.2F, 0F, 1.3F, -1F, 0.4F, 1.8F, -0.5F); // Box 14
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 1.8F, -2.1F, 4, 2, 1, 0F,-0.2F, 0F, 0.8F, -0.4F, 0.2F, 0.5F, -0.2F, 0.5F, -0.3F, 0F, 0.5F, -1.5F, -0.4F, 0.3F, 1.2F, 0.4F, 0.3F, 1F, 0.4F, 1.8F, -0.5F, 0F, 1.3F, -1F); // Box 15
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, 7.5F, -2.9F, 4, 3, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, -0.3F, -0.2F, -0.5F, -0.3F, -0.2F, 1F, -0.3F, 0F, 1F, -0.3F, 0F); // Box 16
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2F, 5.5F, -2.9F, 4, 2, 1, 0F,-0.7F, -0.3F, 0F, -0.7F, -0.3F, 0F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 10.1F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0.3F, 0.8F, 0F, 0.3F, 0.8F, 0.4F, 0F, 0.4F); // Box 21
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 10.1F, -2F, 4, 1, 4, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0.8F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0.3F, 0.8F); // Box 22
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 169
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 66
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 35

		leftArmModel[0].addShapeBox(-1F, 4.5F, -2F, 4, 4, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 169
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 1.5F, -2F, 4, 3, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 66
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-2F, -2.5F, -2F, 5, 3, 4, 0F,-2F, 0.3F, 0.4F, 1F, -0.75F, 0.4F, 1F, -0.75F, 0.4F, -2F, 0.3F, 0.4F, -0.7F, 0.2F, 0.2F, 0.3F, 1.5F, 0.2F, 0.3F, 1.5F, 0.2F, -0.7F, 0.2F, 0.2F); // Box 35
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 39
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 168
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 34

		rightArmModel[0].addShapeBox(-3F, 1.5F, -2F, 4, 3, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 39
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4.5F, -2F, 4, 4, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 168
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2.5F, -2F, 5, 3, 4, 0F,1F, -0.75F, 0.4F, -2F, 0.3F, 0.4F, -2F, 0.3F, 0.4F, 1F, -0.75F, 0.4F, 0.3F, 1.5F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.3F, 1.5F, 0.2F); // Box 34
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 74
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 25
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 26
		leftLegModel[4] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 29

		leftLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 1F, 0.1F, -0.5F, 1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 1F, 0.1F, 0F, 1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5.5F, -2F, 2, 2, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F); // Box 74
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7.5F, -2F, 2, 3, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -1.8F, 0.1F, 0F, -1.8F); // Box 25
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 3.2F, -2F, 2, 2, 4, 0F,0.1F, 0F, 0.2F, 2.1F, 0F, 0.2F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F); // Box 26
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0.3F, 0.9F, 0.1F, 0.3F, 0.9F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 29
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 75
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 26
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 27
		rightLegModel[4] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 28

		rightLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 1F, 0.1F, -0.5F, 1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 1F, 0.1F, 0F, 1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5.5F, -2F, 2, 2, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F); // Box 75
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7.5F, -2F, 2, 3, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -1.8F, 0.1F, 0F, -1.8F); // Box 26
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 3.2F, -2F, 2, 2, 4, 0F,0.1F, 0F, 0.2F, 2.1F, 0F, 0.2F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F); // Box 27
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.2F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0.3F, 0.9F, 0.1F, 0.3F, 0.9F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 28
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 19
		skirtFrontModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 24
		skirtFrontModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 25

		skirtFrontModel[0].addShapeBox(-4F, -2.2F, -2F, 8, 6, 3, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F); // Box 19
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-2F, -0.699999999999999F, -2.8F, 4, 2, 1, 0F,0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 24
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-2F, 1.3F, -2.8F, 4, 2, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F); // Box 25
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 23

		skirtRearModel[0].addShapeBox(-4F, -2.2F, -1F, 8, 6, 3, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F); // Box 23
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}