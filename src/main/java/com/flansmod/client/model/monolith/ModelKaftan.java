//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kaftan
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKaftan extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelKaftan() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];
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
		bodyModel[0] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		bodyModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 16
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 17
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 24
		bodyModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 26
		bodyModel[11] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 29
		bodyModel[13] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 30
		bodyModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 31
		bodyModel[15] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 32
		bodyModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 35
		bodyModel[19] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 36
		bodyModel[20] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 37
		bodyModel[21] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 39

		bodyModel[0].addShapeBox(-4F, 7.7F, -2F, 8, 1, 4, 0F,0.5F, -0.1F, 0.5F, 0.5F, -1.1F, 0.5F, 0.5F, -1.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.3F, -0.1F, 0.3F, 0.3F, 1.9F, 0.3F, 0.3F, 1.9F, 0.3F, 0.3F, -0.1F, 0.3F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.2F, -2F, 11, 8, 4, 0F,0.7F, 0.2F, 0.5F, -2.3F, 0.2F, 0.5F, -2.3F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, -2.5F, 1F, 0.5F, -2.5F, 1F, 0.5F, 0.5F, 0F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.3F, 0.9F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, 0.9F, 0.3F, 0.5F, -1.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -1.1F, 0.5F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 0.5F, -2.7F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F); // Box 11
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 6.5F, -2F, 8, 1, 4, 0F,0.6F, -0.9F, 0.6F, 0.6F, -3.5F, 0.6F, 0.6F, -3.5F, 0.6F, 0.6F, -0.9F, 0.6F, 0.6F, 1.1F, 0.6F, 0.6F, 3.5F, 0.6F, 0.6F, 3.5F, 0.6F, 0.6F, 1.1F, 0.6F); // Box 16
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(4F, 7.5F, 0F, 1, 13, 1, 0F,0.3F, -0.5F, 4F, -0.1F, -0.3F, 4F, -0.1F, 0.2F, -4F, 0.3F, 0F, -4F, -2.7F, -0.3F, -1.5F, 2.5F, -0.5F, -1.5F, 2.5F, -1F, 1F, -2.7F, -0.7F, 1F); // Box 17
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 3.5F, -2.7F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F); // Box 27
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 6.5F, -2.7F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F); // Box 28
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 8.2F, -2F, 8, 1, 4, 0F,0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.8F); // Box 24
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1F, 2F, -2.7F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F); // Box 25
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 5F, -2.7F, 2, 1, 1, 0F,0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F); // Box 26
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, -2.6F, -2F, 8, 1, 4, 0F,0.9F, -11.5F, 0.9F, -0.8F, -1.9F, 0.7F, -0.8F, -1.9F, 0.7F, 0.9F, -11.5F, 0.9F, 0.7F, 13F, 0.9F, 1.6F, 1.3F, 0.7F, 1.6F, 1.3F, 0.7F, 0.7F, 13F, 0.9F); // Box 28
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-6.5F, 9.5F, -3F, 2, 4, 6, 0F,0F, 0F, -0.5F, 0F, 0.4F, -0.4F, 0F, 0.4F, -0.4F, 0F, 0F, -0.5F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.3F, 0.2F); // Box 29
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.5F, 9F, -3.6F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 30
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4.5F, 11F, -3.6F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 31
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3F, 9.5F, -3.57F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 32
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3F, 7.5F, -3.57F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 33
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.5F, 7.5F, -3.55F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 34
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1.5F, 5.5F, -3.55F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 35
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 6F, -3.52F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 4F, -3.52F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 37
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(1.5F, 4F, -3.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1.5F, 2F, -3.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 39
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 45
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 46

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.4F, 0.35F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.35F, 0.4F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 45
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7.2F, -2F, 4, 1, 4, 0F,0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F); // Box 46
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 27

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.35F, 0.4F, 0.4F, 0.35F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7.2F, -2F, 4, 1, 4, 0F,0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F, 0.6F, 0.4F, 0.6F); // Box 27
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 40
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 41
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 42
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 43
		leftLegModel[4] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 44

		leftLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 40
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 41
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 42
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 43
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, -1.7F, -2F, 4, 11, 4, 0F,0.5F, 0.7F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 0.7F, 0.5F, -0.3F, 0.5F, 1.4F, 1.6F, 0F, 1F, 1.6F, 0F, 1F, -0.3F, 0.5F, 1.4F); // Box 44
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 4
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 11
		rightLegModel[4] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 61

		rightLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -1.7F, -2F, 4, 11, 4, 0F,0.5F, 1F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 1F, 0.5F, 1.6F, 0F, 1F, -0.3F, 0.5F, 1.4F, -0.3F, 0.5F, 1.4F, 1.6F, 0F, 1F); // Box 4
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19

		skirtFrontModel[0].addShapeBox(-4F, -1.7F, -2F, 8, 5, 2, 0F,0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F); // Box 19
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 23

		skirtRearModel[0].addShapeBox(-4F, -1.7F, 0F, 8, 5, 2, 0F,0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.5F); // Box 23
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}