//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: JapPadding
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJapPadding extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelJapPadding() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24
		bodyModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 37
		bodyModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 38
		bodyModel[7] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 39
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 40
		bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 41
		bodyModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 35
		bodyModel[11] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 36

		bodyModel[0].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 22
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2F, 8, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 4F, -2F, 8, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 24
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.2F, -1.5F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 25
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, -2F, 4, 4, 4, 0F,-1.5F, 0.4F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.4F, 0.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 33
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, -2F, 2, 9, 4, 0F,-1.5F, 0.45F, 0.55F, 1.5F, 0.3F, 0.55F, 1F, 0.3F, 0.55F, 0F, 0.45F, 0.55F, 3.5F, 0F, 0.6F, -3.5F, 0F, 0.6F, -3.5F, 0F, 0.6F, 3.5F, 0F, 0.6F); // Box 37
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.5F, 10F, -2.5F, 1, 4, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0.5F, -1.2F, 0.5F, 0.5F, -1.2F, 0.5F, 0F, 0.8F, 0F, 0F); // Box 38
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 10F, -2.5F, 1, 4, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1.2F, 0.5F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0F, -1.2F, 0.5F, 0F); // Box 39
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 9.5F, -2.5F, 1, 1, 1, 0F,1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F); // Box 40
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.5F, 9.5F, -2.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F); // Box 41
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2F, 0F, -2F, 2, 4, 4, 0F,1.5F, 0.3F, 0.5F, -1.5F, 0.45F, 0.5F, 0F, 0.45F, 0.5F, 1F, 0.3F, 0.5F, -1F, 0.5F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 35
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-5F, 9F, -2F, 2, 1, 4, 0F,-1.5F, 0F, 0.6F, 1.5F, 0F, 0.6F, 1.5F, 0F, 0.6F, -1.5F, 0F, 0.6F, -0.5F, 0.3F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, -0.5F, 0.3F, 0F); // Box 36
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 40
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 41

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 40
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 4F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 41
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 34
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 35

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 34
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 35
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 42
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 43
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 44

		leftLegModel[0].addShapeBox(-2F, -1F, -2F, 4, 6, 4, 0F,0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 42
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -1.5F, -2F, 4, 1, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 43
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 44
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 18
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 19
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 39

		rightLegModel[0].addShapeBox(-2F, -1F, -2F, 4, 6, 4, 0F,0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F); // Box 18
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 19
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -1.5F, -2F, 4, 1, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 39
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}