//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: QingNapoleonic
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelQingNapoleonic extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelQingNapoleonic() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		bodyModel[3] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 36

		bodyModel[0].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 22
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2F, 4, 9, 4, 0F,0.3F, 0.1F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0.3F, 0.1F, 0.3F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 24
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 10F, -2F, 8, 2, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-10.5F, -5F, -2.45F, 31, 31, 1, 0F,-7.5F, -7.5F, -0.05F, -17.5F, -7.5F, -0.05F, -17.5F, -7.5F, 0F, -7.5F, -7.5F, 0F, -7.5F, -17.5F, 0.05F, -17.5F, -17.5F, 0.05F, -17.5F, -17.5F, 0F, -7.5F, -17.5F, 0F); // Box 35
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, -2F, 4, 9, 4, 0F,0F, 0.4F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 36
		bodyModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 43
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 44
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 45

		leftArmModel[0].addShapeBox(-1F, 4F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 43
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 44
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 45
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 35
		rightArmModel[2] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 36

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.1F, 0.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 34
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 35
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 8F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 36
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 37
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 38
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 39
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 40
		leftLegModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 41
		leftLegModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 42

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.3F, 0.8F, 0.8F, 1F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, -0.3F, 0.8F, 0.8F); // Box 37
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 38
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 39
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7F, -2F, 4, 9, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 40
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 9.4F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 41
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 42
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 27
		rightLegModel[4] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 28
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 32

		rightLegModel[0].addShapeBox(-2F, 9.4F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, 0.3F, 0.14F, 0.15F, 0.3F, 0.14F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.7F, 0.15F, 0F, 0.14F, 0.15F, 0F, 0.14F); // Box 1
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 27
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 7F, -2F, 4, 9, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F); // Box 28
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 0F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0.2F, 0.8F, -0.3F, 0.8F, 0.8F, -0.3F, 0.8F, 0.8F, 1F, 0.2F, 0.8F); // Box 32
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}