//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SiamesePlate
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSiamesePlate extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 256;

	public ModelSiamesePlate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[14];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[6];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[8];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		bodyModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 31
		bodyModel[6] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 35
		bodyModel[7] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 36
		bodyModel[8] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 37
		bodyModel[9] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 38
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 39
		bodyModel[11] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 40
		bodyModel[12] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 47
		bodyModel[13] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 54

		bodyModel[0].addShapeBox(-4F, 0.5F, -2.5F, 12, 4, 5, 0F,-0.2F, 0.8F, 0.7F, -8F, -0.2F, 1.5F, -8F, 0.5F, 0.5F, -0.2F, 0.8F, 0.3F, 0F, -3F, 1F, -8F, -2.5F, 2F, -8F, -3F, 1F, 0F, -3F, 0.7F); // Box 31
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 1.5F, -2.5F, 12, 9, 5, 0F,0F, 0F, 1F, -8F, -0.5F, 2F, -8F, 0F, 1F, 0F, 0F, 0.7F, 0.3F, -7F, 1.3F, -8F, -6F, 2.3F, -8F, -6F, 1.5F, 0.3F, -7F, 0.8F); // Box 32
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 4.5F, -2.5F, 12, 5, 5, 0F,0.3F, 1F, 1.3F, -8F, 0F, 2.3F, -8F, 0F, 1.5F, 0.3F, 1F, 0.8F, 1F, -5F, 1.3F, -8F, -3.49F, 2.3F, -8F, -4F, 1.6F, 1F, -5F, 0.9F); // Box 33
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 5.5F, -2.5F, 4, 4, 5, 0F,1F, 1F, 1.3F, 0F, -0.5F, 2.3F, 0F, 0F, 1.6F, 1F, 1F, 0.9F, 0.4F, -0.5F, 0.8F, 0F, 0.2F, 1.5F, 0F, 0F, 1.2F, 0.4F, -0.5F, 0.2F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 10F, -2.5F, 4, 6, 5, 0F,0.3F, 1F, 0.8F, 0F, 0.3F, 1.5F, 0F, 0.5F, 1.2F, 0.3F, 1F, 0.1F, 0.5F, -5.7F, 0.5F, 0F, -5F, 2F, 0F, -5.3F, 1.3F, 0.9F, -5.7F, 0F); // Box 35
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2F, 2.5F, -4.8F, 24, 18, 1, 0F,0F, 0F, -0.2F, -20F, 0F, -0.2F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0.1F, -20F, -15F, 0.1F, -20F, -15F, 0F, 0F, -15F, 0F); // Box 31
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-8F, 0.5F, -2.5F, 12, 4, 5, 0F,-8F, -0.2F, 1.5F, -0.2F, 0.8F, 0.7F, -0.2F, 0.8F, 0.3F, -8F, 0.5F, 0.5F, -8F, -2.5F, 2F, 0F, -3F, 1F, 0F, -3F, 0.7F, -8F, -3F, 1F); // Box 35
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-8F, 4.5F, -2.5F, 12, 5, 5, 0F,-8F, 0F, 2.3F, 0.3F, 1F, 1.3F, 0.3F, 1F, 0.8F, -8F, 0F, 1.5F, -8F, -3.49F, 2.3F, 1F, -5F, 1.3F, 1F, -5F, 0.9F, -8F, -4F, 1.6F); // Box 36
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-8F, 1.5F, -2.5F, 12, 9, 5, 0F,-8F, -0.5F, 2F, 0F, 0F, 1F, 0F, 0F, 0.7F, -8F, 0F, 1F, -8F, -6F, 2.3F, 0.3F, -7F, 1.3F, 0.3F, -7F, 0.8F, -8F, -6F, 1.5F); // Box 37
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2F, 5.5F, -4.8F, 24, 28, 1, 0F,0F, 0F, 0.1F, -20F, 0F, 0.1F, -20F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, -0.5F, -20F, -25F, -0.5F, -20F, -25F, 0F, 0F, -25F, 0F); // Box 38
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 5.5F, -2.5F, 4, 4, 5, 0F,0F, -0.5F, 2.3F, 1F, 1F, 1.3F, 1F, 1F, 0.9F, 0F, 0F, 1.6F, 0F, 0.2F, 1.5F, 0.4F, -0.5F, 0.8F, 0.4F, -0.5F, 0.2F, 0F, 0F, 1.2F); // Box 39
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 10F, -2.5F, 4, 6, 5, 0F,0F, 0.3F, 1.5F, 0.3F, 1F, 0.8F, 0.3F, 1F, 0.1F, 0F, 0.5F, 1.2F, 0F, -5F, 2F, 0.5F, -5.7F, 0.5F, 0.9F, -5.7F, 0F, 0F, -5.3F, 1.3F); // Box 40
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.8F, 10.6F, -3.5F, 3, 1, 6, 0F,1.2F, 0.5F, 0.2F, 0.8F, 0F, 1.2F, 0.8F, 0F, 1.2F, 1.2F, 0.5F, 0.2F, 1F, 0F, 0.2F, 1.2F, 0.5F, 1.2F, 1.2F, 0.5F, 1.2F, 1F, 0F, 0.2F); // Box 47
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.8F, 10.6F, -3.5F, 3, 1, 6, 0F,1F, 0F, 1.2F, 1.2F, 0.5F, 0.2F, 1.2F, 0.5F, 0.2F, 1F, 0F, 1.2F, 1.2F, 0.5F, 1.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.2F, 1.2F, 0.5F, 1.2F); // Box 54
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 33
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 34
		leftArmModel[2] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 45
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 46
		leftArmModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 47
		leftArmModel[5] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 48

		leftArmModel[0].addShapeBox(-9F, 0.4F, -2F, 12, 6, 4, 0F,-8.5F, 0.5F, 2F, 1F, 0F, 0.3F, 1F, 0F, 0.3F, -8.5F, 0.5F, 2F, -8F, -5F, 2F, 0F, -4.2F, 0.3F, 0F, -4.2F, 0.3F, -8F, -5F, 2F); // Box 33
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-9F, -2.1F, -2F, 12, 9, 4, 0F,-7.5F, 0.7F, 1.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -7.5F, 0.7F, 1.4F, -8.5F, -7F, 2F, 1F, -6.5F, 0.3F, 1F, -6.5F, 0.3F, -8.5F, -7F, 2F); // Box 34
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(1F, 2F, -2F, 2, 1, 4, 0F,1.1F, 0F, 0.8F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 1.1F, 0F, 0.8F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 45
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(1F, 3F, -2F, 2, 1, 4, 0F,1.1F, 0F, 0.8F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 1.1F, 0F, 0.8F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F); // Box 46
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 5F, -2F, 4, 4, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0F, 0.8F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 47
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0F, 9F, -2F, 3, 1, 4, 0F,1.3F, 0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 1.3F, 0.2F, 0.3F, -1.2F, -0.5F, 0.8F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, -1.2F, -0.5F, 0.8F); // Box 48
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 66
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 86
		rightArmModel[2] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 35
		rightArmModel[3] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 18
		rightArmModel[4] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 19
		rightArmModel[5] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 30

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 12, 9, 4, 0F,0F, 0.3F, 0.3F, -7.5F, 0.7F, 1.4F, -7.5F, 0.7F, 1.4F, 0F, 0.3F, 0.3F, 1F, -6.5F, 0.3F, -8.5F, -7F, 2F, -8.5F, -7F, 2F, 1F, -6.5F, 0.3F); // Box 66
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 0.4F, -2F, 12, 6, 4, 0F,1F, 0F, 0.3F, -8.5F, 0.5F, 2F, -8.5F, 0.5F, 2F, 1F, 0F, 0.3F, 0F, -4.2F, 0.3F, -8F, -5F, 2F, -8F, -5F, 2F, 0F, -4.2F, 0.3F); // Box 86
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 5F, -2F, 4, 4, 4, 0F,0.8F, 0.5F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0.5F, 0.8F, 0.3F, 0F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0.3F); // Box 35
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 2F, -2F, 2, 1, 4, 0F,0.1F, 0.5F, 0.1F, 1.1F, 0F, 0.8F, 1.1F, 0F, 0.8F, 0.1F, 0.5F, 0.1F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 18
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 3F, -2F, 2, 1, 4, 0F,0.1F, 0.5F, 0.1F, 1.1F, 0F, 0.8F, 1.1F, 0F, 0.8F, 0.1F, 0.5F, 0.1F, 0.5F, -0.3F, 0.3F, 0.1F, 0.2F, 1.2F, 0.1F, 0.2F, 1.2F, 0.5F, -0.3F, 0.3F); // Box 19
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 9F, -2F, 3, 1, 4, 0F,0.3F, 0F, 0.3F, 1.3F, 0.2F, 0.3F, 1.3F, 0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.5F, -0.2F, 0.5F, -1.2F, -0.5F, 0.8F, -1.2F, -0.5F, 0.8F, 0.5F, -0.2F, 0.5F); // Box 30
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 32
		leftLegModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 41
		leftLegModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 42
		leftLegModel[3] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 43
		leftLegModel[4] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 44
		leftLegModel[5] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 49

		leftLegModel[0].addShapeBox(-11.2F, 4.3F, -4F, 15, 4, 1, 0F,-10F, 0F, 0.5F, 0F, 0.7F, -0.9F, 0F, 0.7F, 0.5F, -10F, 0F, -0.9F, -10.4F, -2.7F, 0.8F, -0.1F, -3.2F, -0.5F, -0.1F, -3.2F, 0.2F, -10.4F, -2.7F, -1.2F); // Box 32
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.5F, -4F, 5, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0.7F, -0.9F, 0F, 0.7F, 0.5F, 0F, 0F, -0.9F, -0.4F, 0.3F, 0.8F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0.2F, -0.4F, 0.3F, -1.2F); // Box 41
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.8F, 0.699999999999999F, -4F, 5, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0.7F, -0.9F, 0F, 0.7F, 0.5F, 0F, 0F, -0.9F, -0.4F, 0.3F, 0.8F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0.2F, -0.4F, 0.3F, -1.2F); // Box 42
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.6F, 1.9F, -4F, 5, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0.7F, -0.9F, 0F, 0.7F, 0.5F, 0F, 0F, -0.9F, -0.4F, 0.3F, 0.8F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0.2F, -0.4F, 0.3F, -1.2F); // Box 43
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.4F, 3.1F, -4F, 5, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0.7F, -0.9F, 0F, 0.7F, 0.5F, 0F, 0F, -0.9F, -0.4F, 0.3F, 0.8F, -0.1F, -0.2F, -0.5F, -0.1F, -0.2F, 0.2F, -0.4F, 0.3F, -1.2F); // Box 44
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 49
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 263
		rightLegModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 26
		rightLegModel[3] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 27
		rightLegModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 28
		rightLegModel[5] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 29
		rightLegModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 59
		rightLegModel[7] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 60

		rightLegModel[0].addShapeBox(-3F, -0.5F, -4F, 5, 1, 1, 0F,0F, 0.7F, -0.9F, 0F, 0F, 0.5F, 0F, 0F, -0.9F, 0F, 0.7F, 0.5F, -0.1F, -0.2F, -0.5F, -0.4F, 0.3F, 0.8F, -0.4F, 0.3F, -1.2F, -0.1F, -0.2F, 0.2F); // Box 263
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3.2F, 0.699999999999999F, -4F, 5, 1, 1, 0F,0F, 0.7F, -0.9F, 0F, 0F, 0.5F, 0F, 0F, -0.9F, 0F, 0.7F, 0.5F, -0.1F, -0.2F, -0.5F, -0.4F, 0.3F, 0.8F, -0.4F, 0.3F, -1.2F, -0.1F, -0.2F, 0.2F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3.4F, 1.9F, -4F, 5, 1, 1, 0F,0F, 0.7F, -0.9F, 0F, 0F, 0.5F, 0F, 0F, -0.9F, 0F, 0.7F, 0.5F, -0.1F, -0.2F, -0.5F, -0.4F, 0.3F, 0.8F, -0.4F, 0.3F, -1.2F, -0.1F, -0.2F, 0.2F); // Box 26
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3.6F, 3.1F, -4F, 5, 1, 1, 0F,0F, 0.7F, -0.9F, 0F, 0F, 0.5F, 0F, 0F, -0.9F, 0F, 0.7F, 0.5F, -0.1F, -0.2F, -0.5F, -0.4F, 0.3F, 0.8F, -0.4F, 0.3F, -1.2F, -0.1F, -0.2F, 0.2F); // Box 27
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-3.8F, 4.3F, -4F, 15, 4, 1, 0F,0F, 0.7F, -0.9F, -10F, 0F, 0.5F, -10F, 0F, -0.9F, 0F, 0.7F, 0.5F, -0.1F, -3.2F, -0.5F, -10.4F, -2.7F, 0.8F, -10.4F, -2.7F, -1.2F, -0.1F, -3.2F, 0.2F); // Box 28
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 29
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(0.7F, -0.699999999999999F, -4.5F, 2, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.2F, 0F, 1.6F, -0.4F, 0F, 1.6F, -0.4F, 0F, -1.1F, 0.2F, 0F, -1.1F); // Box 59
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(1F, -1.2F, -4.5F, 2, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1.4F, 0F, 1.7F, 1.2F, 0F, 1.7F, 1.2F, 0F, -1.1F, -1.4F, 0F, -1.1F); // Box 60
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);
	}
}