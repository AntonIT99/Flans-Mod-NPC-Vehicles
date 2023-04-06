//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Scientist
// Model Creator: 
// Created on: 19.05.2020 - 08:09:04
// Last changed on: 19.05.2020 - 08:09:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelScientist extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelScientist() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];
		bodyModel = new ModelRendererTurbo[16];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[6];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 36
		headModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 37
		headModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 38
		headModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 39
		headModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 43
		headModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 44
		headModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 45
		headModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 0
		headModel[8] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 36
		headModel[9] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 39
		headModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 55
		headModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 50
		headModel[12] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 58
		headModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 59
		headModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 60

		headModel[0].addShapeBox(-0.5F, -9F, -0.5F, 1, 1, 1, 0F,0.4F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -14F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.6F, 0F, 0.4F); // Box 37
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -11F, -0.5F, 1, 2, 1, 0F,0.6F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 38
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -16F, -0.3F, 1, 2, 1, 0F,0.1F, 0F, -0.8F, -1F, 0F, -0.8F, -1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 39
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-2.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 44
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 45
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -3.8F, -5F, 1, 2, 1, 0F,0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 0
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -2.8F, -5F, 1, 1, 1, 0F,0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 36
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.4F, -2.8F, -5F, 1, 1, 2, 0F,-0.4F, -0.2F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 39
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0.4F, -2.8F, -5F, 1, 1, 2, 0F,-0.2F, -0.2F, -0.2F, -0.4F, -0.2F, -0.3F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.2F, -0.3F, -0.1F, -0.1F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 55
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -4.5F, -4.2F, 8, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 50
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(2.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 58
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(1.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0.5F, -5.5F, -4.3F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 60
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 25
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 26
		bodyModel[9] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 40
		bodyModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 41
		bodyModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 42
		bodyModel[15] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 51

		bodyModel[0].addShapeBox(-2F, 0F, -2F, 2, 7, 3, 0F,0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 5
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 2, 11, 4, 0F,0.5F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F); // Box 6
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -2F, 2, 7, 3, 0F,-2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 7
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, 7F, -2F, 4, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 10
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, 0F, -2F, 6, 10, 4, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 11
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2F, 0F, -1F, 4, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F); // Box 12
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0.95F, 1F, -2F, 1, 6, 1, 0F,-0.35F, 0F, 0.6F, -0.2F, 0.1F, 0.6F, -0.2F, 0.1F, 0.6F, -0.35F, 0F, 0.6F, 1F, 0F, 0.6F, -0.5F, -0.5F, 0.6F, -0.5F, -0.5F, 0.6F, 1F, 0F, 0.6F); // Box 18
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, 0F, -2F, 1, 1, 1, 0F,0.1F, 0F, 0.6F, -0.7F, -0.7F, 0.6F, -0.7F, -0.7F, 0.6F, 0.1F, 0F, 0.6F, 0.7F, 0F, 0.6F, -1.4F, 0F, 0.6F, -1.4F, 0F, 0.6F, 0.7F, 0F, 0.6F); // Box 25
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3F, 0F, -2F, 1, 1, 1, 0F,-0.7F, -0.7F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0.6F, -0.7F, -0.7F, 0.6F, -1.4F, 0F, 0.6F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F, -1.4F, 0F, 0.6F); // Box 26
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.95F, 1F, -2F, 1, 6, 1, 0F,-0.2F, 0.1F, 0.6F, -0.35F, 0F, 0.6F, -0.35F, 0F, 0.6F, -0.2F, 0.1F, 0.6F, -0.5F, -0.5F, 0.6F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, -0.5F, -0.5F, 0.6F); // Box 27
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, -2F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.2F, 0F, 0.5F); // Box 28
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2F, 0F, -2F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, -0.4F, 0.5F); // Box 29
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 0.5F, -3F, 2, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 40
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3F, 0.5F, -3F, 2, 1, 1, 0F,0F, 0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, 0F); // Box 41
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1F, 0.5F, -3F, 2, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, -0.2F); // Box 42
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(2F, 0F, -2F, 2, 11, 4, 0F,0F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 52

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 52
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 13

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 13
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 17
		leftLegModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 53
		leftLegModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 54
		leftLegModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 55
		leftLegModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 56
		leftLegModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 57

		leftLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 17
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -1F, -2F, 2, 8, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 53
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(0F, -1F, -2F, 2, 8, 4, 0F,0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 1F, 1F, -0.3F, 0.7F, 1F, -0.3F, 1F, 2F, 0F, 1.2F); // Box 54
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 8.8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 56
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 57
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 19
		rightLegModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 21
		rightLegModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
		rightLegModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 61
		rightLegModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 4
		rightLegModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 6

		rightLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 19
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(0F, -1F, -2F, 2, 8, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 21
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 8.8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 7F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, -1F, -2F, 2, 8, 4, 0F,0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0.1F, 0F, 0.5F, 1F, -0.3F, 0.7F, 0F, 0F, 1F, 2F, 0F, 1.2F, 1F, -0.3F, 1F); // Box 6
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}