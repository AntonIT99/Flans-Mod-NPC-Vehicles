//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SafavidPadding
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSafavidPadding extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelSafavidPadding() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];
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
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 21
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 22
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 24
		bodyModel[6] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 25
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 26
		bodyModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 28
		bodyModel[9] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 33
		bodyModel[10] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 36
		bodyModel[12] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 37
		bodyModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 38
		bodyModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 46
		bodyModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 47
		bodyModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 47
		bodyModel[18] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 51
		bodyModel[19] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 52

		bodyModel[0].addShapeBox(-4F, 7.7F, -2F, 8, 1, 4, 0F,0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.2F, -2F, 7, 8, 4, 0F,0.7F, 0.1F, 0.5F, -3F, 0.1F, 0.5F, -3F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0.5F, 0.5F, 0.5F, -3F, 0.7F, 0.5F, -3F, 0.7F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, 2F, -3F, 7, 1, 1, 0F,0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Box 21
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, 2F, -3F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 22
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2.5F, 2F, -3F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 24
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 3.3F, -3F, 7, 1, 1, 0F,0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Box 25
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 3.3F, -3F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 26
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.5F, 3.3F, -3F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 28
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 4.6F, -3F, 7, 1, 1, 0F,0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Box 33
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.5F, 4.6F, -3F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 34
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2.5F, 4.6F, -3F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 36
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, 6F, -3F, 7, 1, 1, 0F,0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F); // Box 37
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 6F, -3F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 38
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2.5F, 6F, -3F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F); // Box 40
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 8.8F, -2F, 8, 2, 4, 0F,0.65F, -0.1F, 0.9F, 1.1F, 0.9F, 0.9F, 1.1F, 0.9F, 0.9F, 0.65F, -0.1F, 0.9F, 0.9F, 0.4F, 0.9F, 0.65F, -0.1F, 0.9F, 0.65F, -0.1F, 0.9F, 0.9F, 0.4F, 0.9F); // Box 46
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 8.5F, -2F, 8, 2, 4, 0F,1.1F, 0.4F, 1.1F, 0.7F, -0.1F, 1.1F, 0.7F, -0.1F, 1.1F, 1.1F, 0.4F, 1.1F, 0.9F, -0.1F, 1.1F, 1.1F, 0.4F, 1.1F, 1.1F, 0.5F, 1.1F, 0.9F, -0.1F, 1.1F); // Box 47
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, -0.2F, -2.5F, 4, 2, 5, 0F,0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.1F, 0.2F, -1F, -1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -1F, 0.2F); // Box 47
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3F, -0.2F, -2F, 7, 8, 4, 0F,-3F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, -3F, 0.1F, 0.5F, -3F, 0.7F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, -3F, 0.7F, 0.5F); // Box 51
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, -0.2F, -2.5F, 4, 2, 5, 0F,0F, 0.3F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.2F, -1F, -1F, 0.2F, -1F, -1F, 0.2F, 0F, 0F, 0.2F); // Box 52
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 53
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 54

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0.1F, 0.4F, 0.8F, 0.4F, 0.6F, 0.2F, 0.4F, 0.6F, 0.2F, 0.4F, 0.4F, 0.8F, 0.4F); // Box 53
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F); // Box 54
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 46

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.1F, 0.1F, 0.6F, 0.2F, 0.4F, 0.4F, 0.8F, 0.4F, 0.4F, 0.8F, 0.4F, 0.6F, 0.2F, 0.4F); // Box 46
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 49
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 50

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 11, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -1.5F, -2F, 4, 8, 4, 0F,0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.4F, -0.3F, 0F, 0.8F, 1.6F, -0.5F, 0.7F, 1.6F, -0.5F, 0.7F, -0.3F, 0F, 0.8F); // Box 49
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 50
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 11

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 11, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -1.5F, -2F, 4, 8, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 1.6F, -0.5F, 0.7F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, 1.6F, -0.5F, 0.7F); // Box 4
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}