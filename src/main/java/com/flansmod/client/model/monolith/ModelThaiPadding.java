//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ThaiPadding
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelThaiPadding extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelThaiPadding() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 23
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		bodyModel[3] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 145
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 146
		bodyModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 147

		bodyModel[0].addShapeBox(-4F, 5F, -2F, 8, 5, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 3F, -2F, 8, 2, 4, 0F,0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 24
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2F, 4, 3, 4, 0F,0.5F, 0.2F, 0.2F, -1.5F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 25
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 10F, -2F, 8, 2, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, -2F, 4, 3, 4, 0F,-1.5F, 0.4F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.4F, 0.2F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 33
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 9.5F, -2F, 8, 2, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.6F, 0.1F, 0.6F, 0.6F, 0.1F, 0.6F, 0.6F, 0.1F, 0.6F, 0.6F, 0.1F, 0.6F); // Box 145
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 9.5F, -2.6F, 2, 1, 1, 0F,-0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 10.5F, -2.6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F, -0.95F, -0.1F, 0F); // Box 147
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 42
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 43

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 42
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 3.3F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 34
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 35

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 34
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 3.3F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 44
		leftLegModel[1] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 45
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 46
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 47

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.3F, 0F, 1.2F, 1F, 0.3F, 1.2F, 1F, 0.3F, 1.2F, 0.3F, 0F, 1.2F); // Box 44
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 5, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.3F, -0.8F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.3F, -0.8F, 0.1F); // Box 45
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10.1F, -4F, 4, 2, 1, 0F,0.15F, -0.5F, 0.5F, 0.15F, -0.5F, 0.5F, 0.15F, -1.5F, 1F, 0.15F, -1.5F, 1F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F); // Box 46
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.15F, -1F, 1F, 0.15F, -1F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 47
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 32
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 59
		rightLegModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 60
		rightLegModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 40
		rightLegModel[5] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 41

		rightLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.15F, -1F, 1F, 0.15F, -1F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 1
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.5F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0.8F, 1.2F, 0.3F, 0.5F, 1.2F, 0.3F, 0.5F, 1.2F, 1F, 0.8F, 1.2F); // Box 32
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(1F, 0F, -2.8F, 2, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.2F, 0F, 1.6F, -0.4F, 0F, 1.6F, -0.4F, 0F, -1.1F, 0.2F, 0F, -1.1F); // Box 59
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(1.3F, -0.5F, -2.8F, 2, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.4F, 0F, 1.7F, 1.2F, 0F, 1.7F, 1.2F, 0F, -1.1F, -1.4F, 0F, -1.1F); // Box 60
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10.1F, -4F, 4, 2, 1, 0F,0.15F, -0.5F, 0.5F, 0.15F, -0.5F, 0.5F, 0.15F, -1.5F, 1F, 0.15F, -1.5F, 1F, 0.15F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F); // Box 40
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 5F, -2F, 4, 5, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, -0.5F, 0.1F, 0.3F, -0.8F, 0.1F, 0.3F, -0.8F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 41
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}