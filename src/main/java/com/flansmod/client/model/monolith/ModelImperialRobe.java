//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ImperialRobe
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelImperialRobe extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelImperialRobe() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 290
		bodyModel[3] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 291
		bodyModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 292
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 19
		bodyModel[8] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 20

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10.3F, -2F, 8, 3, 4, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-6.5F, 2F, -2F, 13, 6, 4, 0F,-2.15F, 0F, 0.35F, -2.15F, 0F, 0.35F, -2.15F, 0F, 0.35F, -2.15F, 0F, 0.35F, -2.15F, 0F, 0.35F, -2.15F, 0F, 0.35F, -2.15F, 0F, 0.35F, -2.15F, 0F, 0.35F); // Box 290
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 8F, -2F, 8, 1, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 291
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 9.3F, -2F, 8, 1, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F); // Box 292
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0F, -2F, 2, 2, 4, 0F,0.35F, 0.2F, 0.35F, -0.1F, 0.2F, 0.35F, 2F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 2F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 15
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(2F, 0F, -2F, 2, 2, 4, 0F,-0.1F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 0.35F, 0.2F, 0.35F, 2F, 0.2F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 2F, 0F, 0.35F); // Box 16
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 7.3F, -2.2F, 8, 4, 4, 0F,-3.6F, 0.1F, 0.7F, 0.6F, 0.1F, 0.7F, 0.6F, 0.1F, 0.7F, -3.6F, 0.1F, 0.7F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.7F, 0.4F, 0.1F, 0.7F); // Box 19
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1F, 0.2F, -2.2F, 5, 7, 4, 0F,-3F, 0.8F, 0.4F, 1.6F, 0.4F, 0.4F, 1.6F, 0.4F, 0.7F, -3F, 0.8F, 0.7F, -0.6F, 0.1F, 0.7F, 0.6F, 0.1F, 0.7F, 0.6F, 0.1F, 0.7F, -0.6F, 0.1F, 0.7F); // Box 20
		bodyModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 21

		leftArmModel[0].addShapeBox(-1F, 7F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 7, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20

		rightArmModel[0].addShapeBox(-3F, 7F, -2F, 4, 2, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 7, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 17

		skirtFrontModel[0].addShapeBox(-4F, -0.699999999999999F, -2.2F, 8, 10, 3, 0F,0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F); // Box 17
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 18

		skirtRearModel[0].addShapeBox(-4F, -0.699999999999999F, -0.8F, 8, 10, 3, 0F,0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F); // Box 18
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}