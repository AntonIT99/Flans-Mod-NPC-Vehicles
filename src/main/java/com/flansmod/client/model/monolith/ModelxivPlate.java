//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: xivPlate
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelxivPlate extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelxivPlate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];
		leftArmModel = new ModelRendererTurbo[11];
		rightArmModel = new ModelRendererTurbo[11];
		leftLegModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 18
		bodyModel[3] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 35
		bodyModel[4] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 36
		bodyModel[5] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 38
		bodyModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 39
		bodyModel[7] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 89
		bodyModel[9] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 90
		bodyModel[10] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 91
		bodyModel[11] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 92
		bodyModel[12] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 93
		bodyModel[13] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 96
		bodyModel[14] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 97

		bodyModel[0].addShapeBox(-4F, 0.4F, -2F, 8, 9, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 15
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 9.4F, -2F, 8, 4, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 18
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, -0.4F, -2.4F, 1, 7, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 35
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2.5F, -0.4F, -2.4F, 1, 7, 5, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 36
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2F, 1.6F, -3F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0F, 0F, -0.8F, 0F); // Box 38
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 1.6F, -3F, 2, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 39
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 6.5F, -2F, 4, 3, 4, 0F,0.4F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F); // Box 15
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 3.5F, -2F, 4, 3, 4, 0F,0.5F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.4F, 0F, 0.4F, 0F, 0F, 1F, 0F, 0F, 0F, 0.4F, 0F, -0.6F); // Box 89
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 2.5F, -2F, 4, 1, 3, 0F,-0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F, 0.4F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.4F, 0F, 0.5F); // Box 90
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 0.5F, -2F, 4, 1, 3, 0F,-0.3F, -0.3F, 0.4F, -2.5F, -0.3F, 0.4F, -2F, -0.3F, 0.8F, -1.3F, -0.3F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F); // Box 91
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 0.5F, -2F, 4, 1, 3, 0F,-2.5F, -0.3F, 0.4F, -0.3F, -0.3F, 0.4F, -1.3F, -0.3F, 0.5F, -2F, -0.3F, 0.8F, 0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F); // Box 92
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 2.5F, -2F, 4, 1, 3, 0F,0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F, 0F, 0F, 1.2F, 0.4F, 0F, 0.7F, 0.4F, 0F, 0.5F, 0F, 0F, 1F); // Box 93
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 3.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1.2F, 0.5F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0.4F, 0F, 0.4F, 0.4F, 0F, -0.6F, 0F, 0F, 0F); // Box 96
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 6.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 97
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 47
		leftArmModel[2] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 48
		leftArmModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 52
		leftArmModel[4] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 53
		leftArmModel[5] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 54
		leftArmModel[6] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 57
		leftArmModel[7] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 58
		leftArmModel[8] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 60
		leftArmModel[9] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 62
		leftArmModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 64

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(0F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, -0.7F, -0.7F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.7F, -0.7F, 0.3F); // Box 47
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2F, -0.6F, -2F, 1, 1, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 48
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2F, -0.1F, -2F, 1, 1, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 52
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2F, 0.4F, -2F, 1, 1, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 53
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(2F, 0.9F, -2F, 1, 1, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 54
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, 7.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, 7.4F, -2F, 4, 1, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 58
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-1F, 4.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 60
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(2F, 1.4F, -2F, 1, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 62
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(1F, 2.9F, -2.2F, 1, 2, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 64
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 42
		rightArmModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 43
		rightArmModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 44
		rightArmModel[4] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 45
		rightArmModel[5] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 46
		rightArmModel[6] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 55
		rightArmModel[7] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 56
		rightArmModel[8] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 59
		rightArmModel[9] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 61
		rightArmModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 63

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0F, 0.3F, -0.7F, -0.7F, 0.3F, -0.7F, -0.7F, 0.3F, 0.3F, 0F, 0.3F); // Box 42
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -0.6F, -2F, 1, 1, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 43
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -0.1F, -2F, 1, 1, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 44
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 0.4F, -2F, 1, 1, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 45
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 0.9F, -2F, 1, 1, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 46
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 7.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 55
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 7.4F, -2F, 4, 1, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 56
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 4.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 59
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, 1.4F, -2F, 1, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 61
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-2F, 2.9F, -2.2F, 1, 2, 1, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 63
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 19
		leftLegModel[2] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 22
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		leftLegModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 24
		leftLegModel[5] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 27
		leftLegModel[6] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 28

		leftLegModel[0].addShapeBox(-2F, 9.1F, -2.3F, 4, 3, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 1.1F, -2.3F, 4, 4, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F); // Box 19
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 4.1F, -2.8F, 4, 2, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 22
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 2.6F, -0.3F, 4, 1, 3, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F); // Box 23
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 7.1F, -0.3F, 4, 1, 3, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F); // Box 24
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 5.1F, -2.3F, 4, 4, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 27
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 5.1F, -2.3F, 4, 4, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 28
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 20
		rightLegModel[2] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 21
		rightLegModel[3] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 25
		rightLegModel[4] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 26
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29

		rightLegModel[0].addShapeBox(-2F, 9.1F, -2.3F, 4, 3, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1.1F, -2.3F, 4, 4, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F); // Box 20
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 4.1F, -2.8F, 4, 2, 3, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 21
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 2.6F, -0.3F, 4, 1, 3, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F); // Box 25
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 7.1F, -0.3F, 4, 1, 3, 0F,0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F); // Box 26
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 5.1F, -2.3F, 4, 4, 3, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.4F, 0.2F, -1F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 29
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}