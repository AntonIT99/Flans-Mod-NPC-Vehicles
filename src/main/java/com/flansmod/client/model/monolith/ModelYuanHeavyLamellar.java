//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: YuanHeavyLamellar
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYuanHeavyLamellar extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelYuanHeavyLamellar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[6];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 46
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 211
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 41
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 15
		bodyModel[7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 48
		bodyModel[8] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 40
		bodyModel[9] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 41
		bodyModel[10] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 42
		bodyModel[11] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 43
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 45
		bodyModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 46
		bodyModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 47
		bodyModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 54
		bodyModel[16] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 56
		bodyModel[17] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 57
		bodyModel[18] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 58
		bodyModel[19] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 59
		bodyModel[20] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 60

		bodyModel[0].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, 0.3F, 0.7F, -0.3F, 0.3F); // Box 44
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, 1.5F, -2.6F, 1, 8, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 46
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-6F, -0.7F, -3F, 6, 2, 1, 0F,-1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 5.5F, -1F, 0F, 5F, -1F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 5.5F, -1F, 0F, 5.5F); // Box 211
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 1F, -3.5F, 1, 1, 1, 0F,1F, -1.6F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, 1F, -1.6F, -0.2F, 0F, 1F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 1F, -0.2F); // Box 40
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 1F, -3.5F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.2F, 1F, -1.6F, -0.2F, 1F, -1.6F, -0.2F, -0.4F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, -0.2F, -0.2F); // Box 41
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 4.5F, -2.5F, 8, 10, 10, 0F,0.8F, 0F, 0.2F, -4.2F, 0F, 0.2F, -4F, 0F, -4.8F, 0.8F, 0F, -4.8F, 0.6F, -4.5F, 0.2F, -4.2F, -4.5F, 0.2F, -4F, -4.5F, -4.8F, 0.6F, -4.5F, -4.8F); // Box 13
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1.5F, -2.7F, 8, 3, 1, 0F,0F, 0.2F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, 0F, 0.2F, 0F, 0.7F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, 0.7F, 0F, 0F); // Box 15
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 48
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-5F, 3.5F, -2.5F, 1, 3, 10, 0F,0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, -4.8F, 0.2F, 0F, -4.8F, 0F, 0.5F, 0.2F, -0.2F, 0.4F, 0.2F, 0F, 0.4F, -4.8F, 0F, 0.5F, -4.8F); // Box 40
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-5F, 3.5F, -3.7F, 4, 3, 1, 0F,0F, 0F, -0.5F, -1.7F, 0F, -0.5F, -1.7F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0.5F, -0.7F, -2.2F, 0.2F, -0.7F, -2.2F, 0.2F, 0F, 0F, 0.5F, 0F); // Box 41
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3F, 4F, -3F, 6, 1, 6, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F); // Box 42
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-5F, 3.5F, 2.7F, 4, 3, 1, 0F,0.2F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, -2.2F, 0.2F, 0F, -2.2F, 0.2F, -0.7F, -0.2F, 0.5F, -0.7F); // Box 43
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.5F, 4.3F, -3F, 1, 2, 1, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, -0.5F, 0.3F, -1F, -0.2F, 0.3F, -1F, -0.2F, 0F, 0.6F, -0.5F, 0F); // Box 45
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 4.5F, -2.5F, 8, 10, 10, 0F,-4.2F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, -4.8F, -4F, 0F, -4.8F, -4.2F, -4.5F, 0.2F, 0.6F, -4.5F, 0.2F, 0.6F, -4.5F, -4.8F, -4F, -4.5F, -4.8F); // Box 46
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 1.5F, -2.7F, 8, 3, 1, 0F,-4.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -4.2F, 0F, 0F, -4.2F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -4.2F, 0F, 0F); // Box 47
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, -0.7F, -3F, 6, 2, 1, 0F,0F, 0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 0F, 0.3F, 5.5F, 0F, 0.5F, 0F, -1F, 0F, 0.5F, -1F, 0F, 5.5F, 0F, 0.5F, 5.5F); // Box 54
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(4F, 3.5F, -2.5F, 1, 3, 10, 0F,-0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -4.8F, 0F, 0F, -4.8F, -0.2F, 0.4F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -4.8F, 0F, 0.4F, -4.8F); // Box 56
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1F, 3.5F, -3.7F, 4, 3, 1, 0F,-1.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, -1.7F, 0F, 0F, -2.2F, 0.2F, -0.7F, -0.2F, 0.5F, -0.7F, 0F, 0.5F, 0F, -2.2F, 0.2F, 0F); // Box 57
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1F, 3.5F, 2.7F, 4, 3, 1, 0F,-1.7F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.5F, -1.7F, 0F, -0.5F, -2.2F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, -0.7F, -2.2F, 0.2F, -0.7F); // Box 58
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-0.5F, 4.3F, -3F, 1, 2, 1, 0F,-0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, -0.2F, 0.3F, 0.6F, -0.5F, 0.3F, 0.6F, -0.5F, 0F, -1F, -0.2F, 0F); // Box 60
		bodyModel[20].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 50
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 51
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 52
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 53
		leftArmModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 55

		leftArmModel[0].addShapeBox(-5F, -2F, -3F, 8, 5, 1, 0F,-4F, 0F, -0.25F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, -4F, 0F, -0.25F, -5.3F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.25F, -5.3F, 0F, -0.25F); // Box 50
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(3F, -2F, -2F, 1, 10, 8, 0F,-0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -3.5F, -0.2F, 0F, -3.5F, -0.2F, -5F, 0.7F, 0.2F, -5F, 0.7F, 0.2F, -5F, -3.3F, -0.2F, -5F, -3.3F); // Box 51
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1.7F, 3F, -2F, 6, 4, 8, 0F,-2F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, 0F, -3.3F, -2F, 0F, -3.3F, -2.8F, -1.7F, 0.7F, 0F, -1.5F, 0.7F, 0F, -1.5F, -3.3F, -2.8F, -1.7F, -3.3F); // Box 52
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-5F, -2F, 2F, 8, 5, 1, 0F,-4F, 0F, -0.25F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, -4F, 0F, -0.25F, -5.3F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.3F, -5.3F, 0F, -0.3F); // Box 53
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(0F, -2.7F, -3F, 4, 2, 1, 0F,0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 4.5F, 0F, 0F, 5F, 0F, 0F, 0.5F, -2F, -0.5F, 0F, -2F, -0.5F, 5F, 0F, 0F, 5.5F); // Box 55
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 27
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 33
		rightArmModel[2] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 34
		rightArmModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 35
		rightArmModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 44
		rightArmModel[5] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 47

		rightArmModel[0].addShapeBox(-4F, -2.7F, -3F, 4, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 5F, -0.5F, -0.5F, 4.5F, -2F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 5.5F, -2F, -0.5F, 5F); // Box 27
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4F, -2F, -2F, 1, 10, 8, 0F,0F, -0.5F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0.2F, -5F, 0.7F, -0.2F, -5F, 0.7F, -0.2F, -5F, -3.3F, 0.2F, -5F, -3.3F); // Box 33
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4.3F, 3F, -2F, 6, 4, 8, 0F,-0.1F, 0F, 0.7F, -2F, 0F, 0.7F, -2F, 0F, -3.3F, -0.1F, 0F, -3.3F, 0F, -1.5F, 0.7F, -2.8F, -1.7F, 0.7F, -2.8F, -1.7F, -3.3F, 0F, -1.5F, -3.3F); // Box 34
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2F, -3F, 8, 5, 1, 0F,0.2F, 0F, -0.5F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, -5.3F, 0F, -0.3F, -5.3F, 0F, -0.25F, 0.2F, 0F, -0.25F); // Box 35
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-1F, 2F, -2F, 3, 1, 4, 0F,0.62F, 0.2F, 0.62F, 0.62F, -0.2F, 0.62F, 0.62F, -0.2F, 0.62F, 0.62F, 0.2F, 0.62F, 0.62F, -0.4F, 0.62F, 0.62F, 0F, 0.62F, 0.62F, 0F, 0.62F, 0.62F, -0.4F, 0.62F); // Box 44
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, -2F, 2F, 8, 5, 1, 0F,0.2F, 0F, 0F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.25F, -5.3F, 0F, -0.25F, -5.3F, 0F, -0.3F, 0.2F, 0F, -0.3F); // Box 47
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 48
		leftLegModel[1] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 49

		leftLegModel[0].addShapeBox(-6F, -0.800000000000001F, -2F, 8, 16, 8, 0F,-3.9F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, -3.3F, -3.9F, 0.5F, -3.3F, -4.5F, -7.8F, 2.2F, 2.5F, -8.2F, 1.5F, 2.5F, -8.2F, -2.5F, -4.5F, -7.8F, -1.8F); // Box 48
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.800000000000001F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.1F, 0F, 0.7F, -0.7F, 0.4F, 2.2F, 2.5F, 0F, 1.5F, 2.5F, 0F, 1.5F, -0.7F, 0.4F, 2.2F); // Box 49
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 42
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 44

		rightLegModel[0].addShapeBox(-2F, -0.800000000000001F, -2F, 8, 16, 8, 0F,0.5F, 0.5F, 0.7F, -3.9F, 0.5F, 0.7F, -3.9F, 0.5F, -3.3F, 0.5F, 0.5F, -3.3F, 2.5F, -8.2F, 1.5F, -4.5F, -7.8F, 2.2F, -4.5F, -7.8F, -1.8F, 2.5F, -8.2F, -2.5F); // Box 42
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.800000000000001F, -2F, 4, 9, 4, 0F,0F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0F, 0F, 0.7F, 2.5F, 0F, 1.5F, -0.7F, 0.4F, 2.2F, -0.7F, 0.4F, 2.2F, 2.5F, 0F, 1.5F); // Box 44
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}