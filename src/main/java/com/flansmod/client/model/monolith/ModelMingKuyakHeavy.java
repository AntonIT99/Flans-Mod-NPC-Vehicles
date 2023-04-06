//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MingKuyakHeavy
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingKuyakHeavy extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelMingKuyakHeavy() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[17];
		leftArmModel = new ModelRendererTurbo[6];
		rightArmModel = new ModelRendererTurbo[6];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtFrontModel = new ModelRendererTurbo[2];
		skirtRearModel = new ModelRendererTurbo[3];

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
		bodyModel[0] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 22
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 46
		bodyModel[3] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 211
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 40
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 41
		bodyModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 26
		bodyModel[10] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 37
		bodyModel[11] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 48
		bodyModel[12] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 51
		bodyModel[13] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 53
		bodyModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 54
		bodyModel[15] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 55
		bodyModel[16] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 56

		bodyModel[0].addShapeBox(-4F, 9.3F, -2.5F, 8, 1, 5, 0F,0.8F, -0.4F, 0.4F, 0.8F, -0.4F, 0.4F, 0.8F, -0.4F, 0.4F, 0.8F, -0.4F, 0.4F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F); // Box 22
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F); // Box 44
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, 1.5F, -2.6F, 1, 8, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 46
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-6F, -0.7F, -3F, 6, 2, 1, 0F,-1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 5.5F, -1F, 0F, 5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 5.5F, -1F, 0F, 5.5F); // Box 211
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 1F, -3.5F, 1, 1, 1, 0F,1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F); // Box 40
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, 1F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F); // Box 41
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 4.5F, -2.5F, 4, 5, 5, 0F,0.5F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F); // Box 13
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 3.5F, -2.5F, 4, 1, 5, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.5F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 14
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 1.5F, -2.7F, 4, 2, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 15
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 10F, -2F, 8, 2, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 26
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 10.8F, -2.5F, 8, 1, 5, 0F,0.55F, 0.1F, 0.3F, 0.55F, 0.1F, 0.3F, 0.55F, 0.1F, 0.3F, 0.55F, 0.1F, 0.3F, 0.9F, -0.2F, 0.6F, 0.9F, -0.2F, 0.6F, 0.9F, -0.2F, 0.6F, 0.9F, -0.2F, 0.6F); // Box 37
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 1.5F, 1.7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 48
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, -0.7F, -3F, 6, 2, 1, 0F,0F, 0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 0F, 0.3F, 5.5F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 5.5F, 0F, 0.5F, 5.5F); // Box 51
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 1.5F, -2.7F, 4, 2, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 53
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 3.5F, -2.5F, 4, 1, 5, 0F,-0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.2F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 54
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 4.5F, -2.5F, 4, 5, 5, 0F,-0.2F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 55
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 1.5F, 1.7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 56
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 52
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 60
		leftArmModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 61
		leftArmModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 62
		leftArmModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 63
		leftArmModel[5] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 64

		leftArmModel[0].addShapeBox(0F, -2.7F, -3F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 4.5F, 0F, 0F, 5F, 0F, 0F, 0.5F, -2F, -0.5F, 0F, -2F, -0.5F, 5F, 0F, 0F, 5.5F); // Box 52
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 2F, -2F, 3, 1, 4, 0F,0.62F, -0.2F, 0.62F, 0.62F, 0.2F, 0.62F, 0.62F, 0.2F, 0.62F, 0.62F, -0.2F, 0.62F, 0.62F, 0F, 0.62F, 0.62F, -0.4F, 0.62F, 0.62F, -0.4F, 0.62F, 0.62F, 0F, 0.62F); // Box 60
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2F, -3F, 4, 5, 1, 0F,0F, 0F, -0.25F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0F, 0F, -0.25F, -1.3F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.25F, -1.3F, 0F, -0.25F); // Box 61
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(3F, -2F, -2F, 1, 5, 4, 0F,-0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F); // Box 62
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1.3F, 3F, -2F, 3, 2, 4, 0F,1F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, 1F, 0F, 0.7F, 0F, -0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, -0.5F, 0.7F); // Box 63
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, -2F, 2F, 4, 5, 1, 0F,0F, 0F, -0.25F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.25F, -1.3F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.3F, -1.3F, 0F, -0.3F); // Box 64
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 27
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 33
		rightArmModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 34
		rightArmModel[3] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 35
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 44
		rightArmModel[5] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 47

		rightArmModel[0].addShapeBox(-4F, -2.7F, -3F, 4, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5F, -0.5F, -0.5F, 4.5F, -2F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 5.5F, -2F, -0.5F, 5F); // Box 27
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4F, -2F, -2F, 1, 5, 4, 0F,0F, -0.5F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, 0.7F, 0.2F, 0F, 0.7F); // Box 33
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4.3F, 3F, -2F, 3, 2, 4, 0F,-0.1F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, 0F, 0.7F, -0.1F, 0F, 0.7F, 0F, 0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, 0.5F, 0.7F); // Box 34
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2F, -3F, 4, 5, 1, 0F,0.2F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.25F, 0.2F, 0F, -0.25F); // Box 35
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-1F, 2F, -2F, 3, 1, 4, 0F,0.62F, 0.2F, 0.62F, 0.62F, -0.2F, 0.62F, 0.62F, -0.2F, 0.62F, 0.62F, 0.2F, 0.62F, 0.62F, -0.4F, 0.62F, 0.62F, 0F, 0.62F, 0.62F, 0F, 0.62F, 0.62F, -0.4F, 0.62F); // Box 44
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, -2F, 2F, 4, 5, 1, 0F,0.2F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.25F, -1.3F, 0F, -0.25F, -1.3F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 47
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 57
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 58
		leftLegModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 59

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0F, 0.5F, 0.7F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.7F, 0F, 7.7F, 2F, 1.2F, 7.7F, 1.2F, 1.2F, 7.7F, 1.2F, 0F, 7.7F, 2F); // Box 57
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 8, 4, 0F,-0.1F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, -0.3F, 0F, 2.2F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -0.3F, 0F, 2.2F); // Box 58
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(2F, -1.2F, -2.5F, 1, 3, 5, 0F,2F, -0.5F, 0.25F, -0.4F, -0.7F, 0.2F, -0.4F, -0.7F, 0.2F, 2F, -0.5F, 0.25F, 1F, 4.5F, 1.5F, 1F, 4F, 1F, 1F, 4F, 1F, 1F, 4.5F, 1.5F); // Box 59
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 42
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 43
		rightLegModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 46

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 8, 4, 0F,0.5F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 1.5F, 0F, 1.5F, -0.3F, 0F, 2.2F, -0.3F, 0F, 2.2F, 1.5F, 0F, 1.5F); // Box 42
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0.2F, 0.5F, 0.2F, 1.2F, 7.7F, 1.2F, 0F, 7.7F, 2F, 0F, 7.7F, 2F, 1.2F, 7.7F, 1.2F); // Box 43
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3F, -1.2F, -2.5F, 1, 3, 5, 0F,-0.4F, -0.7F, 0.2F, 2F, -0.5F, 0.25F, 2F, -0.5F, 0.25F, -0.4F, -0.7F, 0.2F, 1F, 4F, 1F, 1F, 4.5F, 1.5F, 1F, 4.5F, 1.5F, 1F, 4F, 1F); // Box 46
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 20
		skirtFrontModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23

		skirtFrontModel[0].addShapeBox(-3F, -1.5F, -2.7F, 6, 3, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, 0.7F, -1F, 0F, 0.7F, -1F, 0F, -1.2F, -1F, 0F, -1.2F); // Box 20
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-3F, -1.5F, -2.6F, 6, 3, 1, 0F,1.3F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, -0.5F, 1.3F, 0F, -0.5F, -0.7F, 0.2F, 0.7F, -0.8F, 0.2F, 0.7F, -0.8F, 0.2F, -1.2F, -0.7F, 0.2F, -1.2F); // Box 23
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 40
		skirtRearModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 49
		skirtRearModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50

		skirtRearModel[0].addShapeBox(-3F, -1.5F, 1.5F, 6, 3, 1, 0F,1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, -1.2F, -1F, 0F, 0.7F, -1F, 0F, 0.7F); // Box 40
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-3F, -1.5F, 1.65F, 6, 3, 1, 0F,1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -1.2F, -1F, 0F, -1.2F, -1F, 0F, 0.7F, -1F, 0F, 0.7F); // Box 49
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(-3F, -1.5F, 1.55F, 6, 3, 1, 0F,1.3F, 0F, -0.5F, 1.2F, 0F, -0.5F, 1.2F, 0F, 0F, 1.3F, 0F, 0F, -0.7F, 0.2F, -1.2F, -0.8F, 0.2F, -1.2F, -0.8F, 0.2F, 0.7F, -0.7F, 0.2F, 0.7F); // Box 50
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);
	}
}