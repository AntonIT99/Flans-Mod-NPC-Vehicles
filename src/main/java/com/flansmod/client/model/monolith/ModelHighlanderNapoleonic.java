//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HighlanderNapoleonic
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHighlanderNapoleonic extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelHighlanderNapoleonic() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
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
		bodyModel[0] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 51
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 34
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 37
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 43
		bodyModel[5] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 116
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 128
		bodyModel[8] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 129
		bodyModel[9] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 134
		bodyModel[10] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 135
		bodyModel[11] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 38
		bodyModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 38
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 41
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 51
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 52
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 53

		bodyModel[0].addShapeBox(0F, -0.2F, -2F, 4, 8, 4, 0F,0F, 0.25F, 0.5F, 0.7F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0.5F); // Box 51
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.5F, -2.5F, 2, 10, 5, 0F,0.3F, -0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 0.3F, -0.1F, 0.2F, -8.7F, -0.2F, 0.4F, 6.5F, -2.5F, 0.4F, 6.5F, 2.8F, 0.8F, -8F, 4.8F, 0.8F); // Box 34
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0.25F, 0.8F, 0.7F, 0.1F, 0.8F, 0.7F, 0.1F, 0.8F, 0F, 0.2F, 0.8F); // Box 37
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, -1.2F, -2F, 6, 1, 4, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F); // Box 15
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(3F, -0.8F, -1.5F, 2, 2, 3, 0F,0F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 10F, 0F, 4, 4, 2, 0F,-0.5F, -0.25F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0F, -0.2F, 0.8F, 0.5F, 0.5F, 0.5F, -0.4F, 0.2F, 0.5F, 0F, 0.2F, 1F, 0F, 0.5F, 1.2F); // Box 116
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2F, 0.2F, -2.6F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 118
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.3F, 0.2F, 0.5F, 0.7F, 0.1F, 0.8F, 0.5F, 0.25F, 0.8F, 0F, 0.2F, 0.8F, 0.7F, 0.1F, 0.8F); // Box 128
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, -0.2F, -2F, 4, 8, 4, 0F,0.7F, 0.1F, 0.4F, 0F, 0.25F, 0.5F, 0F, 0.2F, 0.5F, 0.7F, 0.1F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.3F, 0F, 0.5F); // Box 129
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 10F, 0F, 4, 4, 2, 0F,0.7F, -0.1F, 0.8F, -0.5F, -0.25F, 0.8F, 0F, -0.2F, 0.8F, 0.7F, -0.1F, 0.8F, -0.4F, 0.2F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 1.2F, 0F, 0.2F, 1F); // Box 134
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2F, -0.5F, -2.5F, 2, 10, 5, 0F,-0.3F, 0.1F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 6.5F, -2.5F, 0.4F, -8.7F, -0.2F, 0.4F, -8F, 4.8F, 0.8F, 6.5F, 2.8F, 0.8F); // Box 135
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-5F, -0.8F, -1.5F, 2, 2, 3, 0F,0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 38
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.5F, 3.1F, -3F, 1, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 1.2F, 0F, -0.5F, 1.2F, 0F, 0.5F, 0F, 0F, -0.5F, 0.4F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, -0.5F, 0.4F, 0F); // Box 38
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2F, 1F, -2.6F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 41
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2F, 3.5F, -2.6F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 48
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 2.7F, -2.6F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 49
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2F, 6F, -2.6F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 50
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2F, 5.2F, -2.6F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 51
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2F, 8.5F, -2.7F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 52
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2F, 7.7F, -2.6F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 53
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 19, 18, textureX, textureY); // Box 44
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 45
		leftArmModel[2] = new ModelRendererTurbo(this, 97, 24, textureX, textureY); // Box 54

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.2F, 1.1F, 0.2F, 0.3F, 0.9F, 0.2F, 0.3F, 0.9F, 0.2F, 0.2F, 1.1F, 0.2F); // Box 44
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F); // Box 45
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.5F, -2.6F, -2.5F, 4, 2, 5, 0F,-0.2F, 0F, 0F, 0.1F, -0.5F, -0.1F, 0.1F, -0.5F, -0.1F, -0.2F, 0F, 0F, 0.2F, 0.5F, 0F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, 0.2F, 0.5F, 0F); // Box 54
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 19, 18, textureX, textureY); // Box 130
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 131
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 24, textureX, textureY); // Box 39

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.9F, 0.2F, 0.2F, 1.1F, 0.2F, 0.2F, 1.1F, 0.2F, 0.3F, 0.9F, 0.2F); // Box 130
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F); // Box 131
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.5F, -2.6F, -2.5F, 4, 2, 5, 0F,0.1F, -0.5F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, -0.5F, -0.1F, -0.5F, -0.5F, -0.3F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.5F, -0.5F, -0.3F); // Box 39
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 42
		leftLegModel[1] = new ModelRendererTurbo(this, 65, 22, textureX, textureY); // Box 50
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 39

		leftLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 42
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 8.8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 50
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.8F, -2F, 8, 5, 8, 0F,0.4F, 0F, 0.4F, -3.6F, 0F, 0.4F, -3.6F, 0F, -3.6F, 0.4F, 0F, -3.6F, 0.3F, -3.2F, 0.3F, -3.7F, -3.2F, 0.3F, -3.7F, -3.2F, -3.7F, 0.3F, -3.2F, -3.7F); // Box 39
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 65, 22, textureX, textureY); // Box 125
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 126
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 37

		rightLegModel[0].addShapeBox(-2F, 8.8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 125
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 126
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6.8F, -2F, 8, 5, 8, 0F,0.4F, 0F, 0.4F, -3.6F, 0F, 0.4F, -3.6F, 0F, -3.6F, 0.4F, 0F, -3.6F, 0.3F, -3.2F, 0.3F, -3.7F, -3.2F, 0.3F, -3.7F, -3.2F, -3.7F, 0.3F, -3.2F, -3.7F); // Box 37
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 36

		skirtFrontModel[0].addShapeBox(-4F, -2F, -2F, 16, 6, 6, 0F,0.2F, 0F, 0.4F, -7.8F, 0F, 0.4F, -7.8F, 0F, -2.6F, 0.2F, 0F, -2.6F, 0.8F, 0.5F, 1.4F, -7F, 0.5F, 1.4F, -6.8F, 0.5F, -2.6F, 1.2F, 0.5F, -2.6F); // Box 36
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 38

		skirtRearModel[0].addShapeBox(-4F, -2F, -4F, 16, 6, 6, 0F,0.2F, 0F, -2.6F, -7.8F, 0F, -2.6F, -7.8F, 0F, 0.4F, 0.2F, 0F, 0.4F, 1.2F, 0.5F, -2.6F, -6.8F, 0.5F, -2.6F, -7F, 0.5F, 1.4F, 0.8F, 0.5F, 1.4F); // Box 38
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}