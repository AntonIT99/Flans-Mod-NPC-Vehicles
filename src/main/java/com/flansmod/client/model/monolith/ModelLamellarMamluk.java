//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LamellarMamluk
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLamellarMamluk extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelLamellarMamluk() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 46
		bodyModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 47
		bodyModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		bodyModel[4] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 22
		bodyModel[5] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 28

		bodyModel[0].addShapeBox(-10F, 4F, -2.5F, 20, 10, 5, 0F,-4.9F, 0F, 0.4F, -4.9F, 0F, 0.4F, -4.9F, 0F, 0.2F, -4.9F, 0F, 0.2F, -5.2F, -5F, 0.2F, -5.2F, -5F, 0.2F, -5.2F, -5F, 0.2F, -5.2F, -5F, 0.2F); // Box 55
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8.8F, -2F, 8, 2, 4, 0F,0.75F, 0F, 1F, 1.2F, 1F, 1F, 1.2F, 1F, 1F, 0.75F, 0F, 1F, 1F, 0.5F, 1F, 0.75F, 0F, 1F, 0.75F, 0F, 1F, 1F, 0.5F, 1F); // Box 46
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 8.5F, -2F, 8, 2, 4, 0F,1.2F, 0.5F, 1.2F, 0.8F, 0F, 1.2F, 0.8F, 0F, 1.2F, 1.2F, 0.5F, 1.2F, 1F, 0F, 1.2F, 1.2F, 0.5F, 1.2F, 1.2F, 0.5F, 1.2F, 1F, 0F, 1.2F); // Box 47
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-10F, -3F, -2.5F, 20, 7, 5, 0F,-5.5F, -4F, 0.2F, -5.5F, -4F, 0.2F, -5.5F, -4F, 0.2F, -5.5F, -4F, 0.2F, -4.9F, 0F, 0.4F, -4.9F, 0F, 0.4F, -4.9F, 0F, 0.2F, -4.9F, 0F, 0.2F); // Box 20
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, -0.3F, -2F, 1, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.6F); // Box 22
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2F, -0.3F, -2F, 1, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, 0.6F); // Box 28
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 44, 37, textureX, textureY); // Box 23
		leftArmModel[1] = new ModelRendererTurbo(this, 34, 52, textureX, textureY); // Box 24

		leftArmModel[0].addShapeBox(3F, -2.3F, -4.5F, 1, 5, 9, 0F,0.4F, 0.1F, -1.9F, -0.4F, 0.2F, -1.9F, -0.4F, 0.2F, -1.9F, 0.4F, 0.1F, -1.9F, 0.1F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0.1F, 0.4F, -1F); // Box 23
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(3F, 3.4F, -4F, 1, 3, 8, 0F,0.1F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0.1F, 0.4F, -1.2F, -0.1F, 0.1F, -1.9F, 0.2F, 0.2F, -1.9F, 0.2F, 0.2F, -1.9F, -0.1F, 0.1F, -1.9F); // Box 24
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 44, 37, textureX, textureY); // Box 26
		rightArmModel[1] = new ModelRendererTurbo(this, 34, 52, textureX, textureY); // Box 27

		rightArmModel[0].addShapeBox(-4F, -2.3F, -4.5F, 1, 5, 9, 0F,-0.4F, 0.2F, -1.9F, 0.4F, 0.1F, -1.9F, 0.4F, 0.1F, -1.9F, -0.4F, 0.2F, -1.9F, 0F, 0.4F, -1F, 0.1F, 0.4F, -1F, 0.1F, 0.4F, -1F, 0F, 0.4F, -1F); // Box 26
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4F, 3.4F, -4F, 1, 3, 8, 0F,0F, 0.4F, -1.2F, 0.1F, 0.4F, -1.2F, 0.1F, 0.4F, -1.2F, 0F, 0.4F, -1.2F, 0.2F, 0.2F, -1.9F, -0.1F, 0.1F, -1.9F, -0.1F, 0.1F, -1.9F, 0.2F, 0.2F, -1.9F); // Box 27
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 21

		leftLegModel[0].addShapeBox(-1F, -1.5F, -2F, 8, 14, 8, 0F,0.5F, 0F, 0.7F, -4.3F, 0F, 0.7F, -4.3F, 0F, -3.3F, 0.5F, 0F, -3.3F, -0.3F, -6.5F, 1.8F, -2.8F, -6.8F, 1.3F, -2.8F, -6.8F, -2.7F, -0.3F, -6.5F, -2.2F); // Box 21
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-7F, -1.5F, -2F, 8, 14, 8, 0F,-4.3F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, -3.3F, -4.3F, 0F, -3.3F, -2.8F, -6.8F, 1.3F, -0.3F, -6.5F, 1.8F, -0.3F, -6.5F, -2.2F, -2.8F, -6.8F, -2.7F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}