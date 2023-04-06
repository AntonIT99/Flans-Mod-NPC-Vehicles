//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 17cPikeman
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Model17cPikeman extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Model17cPikeman() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 14
		bodyModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 16
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 31
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 33
		bodyModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 35
		bodyModel[11] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 41

		bodyModel[0].addShapeBox(-4F, 1.5F, -2.5F, 4, 3, 5, 0F,-0.2F, 0F, 0.6F, 0F, -0.5F, 1.5F, 0F, 0F, 1F, -0.2F, 0F, 0.7F, 0F, -1F, 0.8F, 0F, 0F, 2.3F, 0F, 0F, 1.5F, 0F, -1F, 0.8F); // Box 13
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 4.5F, -2.5F, 4, 2, 5, 0F,0F, 1F, 0.8F, 0F, 0F, 2.3F, 0F, 0F, 1.5F, 0F, 1F, 0.8F, 1F, -1F, 1F, 0F, 0.51F, 2.5F, 0F, 0F, 1.6F, 1F, -1F, 0.9F); // Box 14
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 6.5F, -2.5F, 4, 3, 5, 0F,1F, 1F, 1F, 0F, -0.5F, 2.5F, 0F, 0F, 1.6F, 1F, 1F, 0.9F, 0.4F, -1F, 0.8F, 0F, 0.2F, 2.2F, 0F, 0F, 1.7F, 0.4F, -1F, 0.7F); // Box 15
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 10F, -2.5F, 4, 1, 5, 0F,0.2F, 1.5F, 0.8F, 0F, 0.3F, 2.2F, 0F, 0.5F, 1.7F, 0.2F, 1.5F, 0.4F, 0.5F, -1.6F, 0.5F, 0F, -0.5F, 2F, 0F, -0.8F, 2.3F, 0.9F, -1.6F, 0.6F); // Box 16
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, -1F, -2F, 1, 1, 4, 0F,0F, 0F, 0.6F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.6F, 0F, 0F, 0.6F, -0.5F, 1.1F, 1.3F, 0.3F, 1F, 1.5F, 0.3F, 1F, 1.3F, -0.5F, 1.2F, 1.3F); // Box 27
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0.5F, -2.5F, 4, 1, 5, 0F,-0.4F, 0.3F, 0.4F, 0F, -0.2F, 1F, 0F, 0F, 0.4F, -0.4F, 0.3F, 0.3F, -0.2F, 0F, 0.6F, 0F, 0.5F, 1.5F, 0F, 0F, 0.85F, -0.2F, 0F, 0.7F); // Box 32
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 0.5F, -2.5F, 4, 1, 5, 0F,0F, -0.2F, 1F, -0.4F, 0.3F, 0.4F, -0.4F, 0.3F, 0.3F, 0F, 0F, 0.4F, 0F, 0.5F, 1.5F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.7F, 0F, 0F, 0.85F); // Box 31
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 1.5F, -2.5F, 4, 3, 5, 0F,0F, -0.5F, 1.5F, -0.2F, 0F, 0.6F, -0.2F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 2.3F, 0F, -1F, 0.8F, 0F, -1F, 0.8F, 0F, 0F, 1.5F); // Box 32
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 4.5F, -2.5F, 4, 2, 5, 0F,0F, 0F, 2.3F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, 0F, 1.5F, 0F, 0.51F, 2.5F, 1F, -1F, 1F, 1F, -1F, 0.9F, 0F, 0F, 1.6F); // Box 33
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 6.5F, -2.5F, 4, 3, 5, 0F,0F, -0.5F, 2.5F, 1F, 1F, 1F, 1F, 1F, 0.9F, 0F, 0F, 1.6F, 0F, 0.2F, 2.2F, 0.4F, -1F, 0.8F, 0.4F, -1F, 0.7F, 0F, 0F, 1.7F); // Box 34
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 10F, -2.5F, 4, 1, 5, 0F,0F, 0.3F, 2.2F, 0.2F, 1.5F, 0.8F, 0.2F, 1.5F, 0.4F, 0F, 0.5F, 1.7F, 0F, -0.5F, 2F, 0.5F, -1.6F, 0.5F, 0.9F, -1.6F, 0.6F, 0F, -0.8F, 2.3F); // Box 35
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2.5F, -1F, -2F, 1, 1, 4, 0F,-0.2F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, -0.2F, 0F, 0.6F, 0.3F, 1F, 1.5F, -0.5F, 1.1F, 1.3F, -0.5F, 1.2F, 1.3F, 0.3F, 1F, 1.3F); // Box 41
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 36
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 37
		leftLegModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 38
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 39
		leftLegModel[4] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 40

		leftLegModel[0].addShapeBox(-2F, -2.5F, -3.8F, 4, 1, 1, 0F,0.3F, -0.7F, 1F, 0.2F, 0F, -0.4F, 0.8F, 0F, 3.1F, 0.3F, -0.7F, 0.6F, 0.2F, 0.4F, 1.2F, 0.8F, 0F, -0.2F, 1.5F, 0F, 3.3F, 0.2F, 0.4F, 0.6F); // Box 36
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -1F, -3.8F, 4, 1, 1, 0F,0.3F, 0F, 1.4F, 0.6F, 0.5F, 0F, 1.4F, 0.5F, 2.9F, 0.3F, 0F, -0.6F, 0.1F, 0.4F, 1.2F, 1.5F, 0F, -0.2F, 2.1F, 0F, 2.3F, 0.1F, 0.4F, -0.8F); // Box 37
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.5F, 0F, -3.8F, 4, 3, 1, 0F,0.5F, 0F, 1.4F, 0.8F, 0.5F, 0F, 1.7F, 0.5F, 2.4F, 0.5F, 0F, -0.6F, 0.2F, 0.4F, 0.9F, 1.3F, 0F, -0.5F, 2F, 0F, 2.6F, 0.2F, 0.4F, -0.5F); // Box 38
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 0.699999999999999F, -3.8F, 4, 3, 1, 0F,0.4F, 0F, 1.4F, 1.2F, 0.5F, 0F, 2F, 0.5F, 2.2F, 0.4F, 0F, -0.6F, 0F, 0.4F, 0.9F, 1.6F, 0F, -0.5F, 2.4F, 0F, 2.3F, 0F, 0.4F, -0.5F); // Box 39
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, 1.5F, -3.8F, 4, 3, 1, 0F,0.3F, 0F, 1.4F, 1.4F, 0.5F, 0F, 2.3F, 0.5F, 1.9F, 0.2F, 0F, -0.6F, 0F, -0.1F, 0.9F, 1.8F, -0.8F, -0.5F, 2.7F, -0.8F, 2.1F, 0F, -0.1F, -0.5F); // Box 40
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 38
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 39
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 41
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 42

		rightLegModel[0].addShapeBox(-2F, -2.5F, -4.1F, 4, 1, 1, 0F,0.2F, 0F, -0.4F, 0.3F, -0.7F, 1F, 0.3F, -0.7F, 0.6F, 0.8F, 0F, 3.1F, 0.8F, 0F, -0.2F, 0.2F, 0.4F, 1.2F, 0.2F, 0.4F, 0.6F, 1.5F, 0F, 3.3F); // Box 38
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -1F, -4.1F, 4, 1, 1, 0F,0.6F, 0.5F, 0F, 0.3F, 0F, 1.4F, 0.3F, 0F, -0.6F, 1.4F, 0.5F, 2.9F, 1.5F, 0F, -0.2F, 0.1F, 0.4F, 1.2F, 0.1F, 0.4F, -0.8F, 2.1F, 0F, 2.3F); // Box 39
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.5F, 0F, -4.1F, 4, 3, 1, 0F,0.8F, 0.5F, 0F, 0.5F, 0F, 1.4F, 0.5F, 0F, -0.6F, 1.7F, 0.5F, 2.4F, 1.3F, 0F, -0.5F, 0.2F, 0.4F, 0.9F, 0.2F, 0.4F, -0.5F, 2F, 0F, 2.6F); // Box 40
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, 0.699999999999999F, -4.1F, 4, 3, 1, 0F,1.2F, 0.5F, 0F, 0.4F, 0F, 1.4F, 0.4F, 0F, -0.6F, 2F, 0.5F, 2.2F, 1.6F, 0F, -0.5F, 0F, 0.4F, 0.9F, 0F, 0.4F, -0.5F, 2.4F, 0F, 2.3F); // Box 41
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.5F, 1.5F, -4.1F, 4, 3, 1, 0F,1.4F, 0.5F, 0F, 0.3F, 0F, 1.4F, 0.2F, 0F, -0.6F, 2.3F, 0.5F, 1.9F, 1.8F, -0.8F, -0.5F, 0F, -0.1F, 0.9F, 0F, -0.1F, -0.5F, 2.7F, -0.8F, 2.1F); // Box 42
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}