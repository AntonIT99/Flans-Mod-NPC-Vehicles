//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KaftanRynda
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKaftanRynda extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelKaftanRynda() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[14];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[7];
		skirtFrontModel = new ModelRendererTurbo[1];
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
		bodyModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		bodyModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 51
		bodyModel[3] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 43
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 48
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 49
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 51
		bodyModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 52
		bodyModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 53
		bodyModel[13] = new ModelRendererTurbo(this, 2, 18, textureX, textureY); // Box 63

		bodyModel[0].addShapeBox(-2.5F, 1F, -2.6F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 11
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.2F, -2F, 4, 10, 4, 0F,0.7F, 0.1F, 0.4F, 0F, 0.25F, 0.45F, 0F, 0.2F, 0.5F, 0.7F, 0.1F, 0.5F, 0.3F, 0F, 0.4F, 0F, 0.2F, 0.45F, 0F, 0.2F, 0.5F, 0.3F, 0F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, -0.2F, -2F, 4, 10, 4, 0F,0F, 0.25F, 0.5F, 0.7F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0.5F); // Box 51
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.5F, -2.5F, 2, 9, 5, 0F,0.3F, -0.1F, 0.4F, -0.3F, 0.1F, 0.4F, -0.3F, 0.1F, 0.4F, 0.3F, -0.1F, 0.4F, -8.7F, 1.8F, 0F, 6.5F, -0.2F, 0.3F, 6.5F, -0.2F, 0.3F, -8.7F, 1.8F, 0F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2F, -0.5F, -2.5F, 2, 9, 5, 0F,-0.3F, 0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, -0.3F, 0.1F, 0.3F, 6.5F, -0.2F, 0.2F, -8.7F, 1.8F, 0F, -8.7F, 1.8F, 0F, 6.5F, -0.2F, 0.2F); // Box 35
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-1F, 0.5F, -2.55F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, -1.5F, -2F, 1, 2, 4, 0F,0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 15
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3F, -1.5F, 1F, 6, 2, 1, 0F,0.3F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 48
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.5F, 2.5F, -2.6F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 49
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2.5F, 4F, -2.6F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 50
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.5F, 5.5F, -2.6F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 51
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2.5F, 7F, -2.6F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 52
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2.5F, 8.5F, -2.6F, 5, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 53
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2F, -1.5F, -2F, 1, 2, 4, 0F,-0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, -0.3F, 0.5F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F); // Box 63
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 61
		leftArmModel[1] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 62

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 61
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7.2F, -2F, 4, 1, 4, 0F,0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F); // Box 62
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 27

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.1F, 0.2F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7.2F, -2F, 4, 1, 4, 0F,0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F); // Box 27
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 54
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 55
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 56
		leftLegModel[3] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 57
		leftLegModel[4] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 58
		leftLegModel[5] = new ModelRendererTurbo(this, 58, 37, textureX, textureY); // Box 59
		leftLegModel[6] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 60

		leftLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 54
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 56
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 57
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, -1.7F, -2F, 4, 11, 4, 0F,0F, 0.7F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 0.7F, 0.5F, -0.3F, 0.5F, 1.4F, 1.6F, 0F, 1F, 1.6F, 0F, 1F, -0.3F, 0.5F, 1.4F); // Box 58
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, -2.5F, -2.55F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.85F, 0.3F, 0F, 0.85F, 0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 59
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 8.3F, -2F, 4, 1, 4, 0F,-0.2F, -0.5F, 1.5F, 1.7F, 0F, 1.1F, 1.7F, 0F, 1.1F, -0.2F, -0.5F, 1.5F, -0.2F, 0.5F, 1.5F, 1.7F, 0F, 1.1F, 1.7F, 0F, 1.1F, -0.2F, 0.5F, 1.5F); // Box 60
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 4
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 11
		rightLegModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 61
		rightLegModel[5] = new ModelRendererTurbo(this, 58, 37, textureX, textureY); // Box 44
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 43, textureX, textureY); // Box 46

		rightLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -1.7F, -2F, 4, 11, 4, 0F,0.5F, 1F, 0.5F, 0F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 1F, 0.5F, 1.6F, 0F, 1F, -0.3F, 0.5F, 1.4F, -0.3F, 0.5F, 1.4F, 1.6F, 0F, 1F); // Box 4
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(1F, -2.5F, -2.55F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0.85F, -0.3F, 0F, 0.85F, -0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 44
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 8.3F, -2F, 4, 1, 4, 0F,1.7F, 0F, 1.1F, -0.2F, -0.5F, 1.5F, -0.2F, -0.5F, 1.5F, 1.7F, 0F, 1.1F, 1.7F, 0F, 1.1F, -0.2F, 0.5F, 1.5F, -0.2F, 0.5F, 1.5F, 1.7F, 0F, 1.1F); // Box 46
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19

		skirtFrontModel[0].addShapeBox(-4F, -1.7F, -2F, 8, 5, 2, 0F,0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F); // Box 19
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 23

		skirtRearModel[0].addShapeBox(-4F, -1.7F, 0F, 8, 5, 2, 0F,0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F); // Box 23
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}