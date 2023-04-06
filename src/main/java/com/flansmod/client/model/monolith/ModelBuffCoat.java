//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BuffCoat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBuffCoat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelBuffCoat() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[13];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 59
		bodyModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 62
		bodyModel[2] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 63
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 64
		bodyModel[4] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 59
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 61
		bodyModel[6] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 62
		bodyModel[7] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 63
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 64
		bodyModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 70
		bodyModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 73
		bodyModel[11] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 74
		bodyModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 78

		bodyModel[0].addShapeBox(-2F, -1F, -3.5F, 2, 2, 5, 0F,1.5F, 0F, -1.3F, 0.2F, 0.1F, -0.3F, 0F, 0.2F, 0.7F, 0.6F, 0.2F, 1.2F, 2.5F, -1.3F, -0.8F, -1.6F, -0.3F, 0.2F, 0F, -0.8F, 1.3F, 0.8F, -1F, 1.5F); // Box 59
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 4, 6, 4, 0F,0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0.3F, 0.1F, 0.4F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.4F, 0.3F, 0.1F, 0.4F); // Box 62
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-6.5F, 0F, -2F, 2, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, -1F, -0.9F, 0.2F, 0.35F, 0.1F, 0.3F, 0.35F, 0.1F, 0.3F, -1F, -0.9F, 0.2F); // Box 63
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 7F, -2F, 4, 5, 4, 0F,0.7F, 0.1F, 0.4F, 0F, -1.1F, 0.5F, 0F, -1.1F, 0.5F, 0.7F, 0.1F, 0.4F, 1.5F, 0.5F, 0.5F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 1.5F, 0.5F, 0.5F); // Box 64
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 6F, -2F, 4, 1, 4, 0F,0F, -0.1F, 0.3F, 0F, -1.1F, 0.3F, 0F, -1.1F, 0.3F, 0F, -0.1F, 0.3F, 0.7F, -0.1F, 0.4F, 0F, 1.1F, 0.5F, 0F, 1.1F, 0.5F, 0.7F, -0.1F, 0.4F); // Box 59
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, -1F, -3.5F, 2, 2, 5, 0F,0.2F, 0.1F, -0.3F, 1.5F, 0F, -1.3F, 0.6F, 0.2F, 1.2F, 0F, 0.2F, 0.7F, -1.6F, -0.3F, 0.2F, 2.5F, -1.3F, -0.8F, 0.8F, -1F, 1.5F, 0F, -0.8F, 1.3F); // Box 61
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, -2F, 4, 6, 4, 0F,0F, 1F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0F, 1.1F, 0.4F); // Box 62
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 6F, -2F, 4, 1, 4, 0F,0F, -1.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -1.1F, 0.3F, 0F, 1.1F, 0.5F, 0.7F, -0.1F, 0.4F, 0.7F, -0.1F, 0.4F, 0F, 1.1F, 0.5F); // Box 63
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 7F, -2F, 4, 5, 4, 0F,0F, -1.1F, 0.5F, 0.7F, 0.1F, 0.4F, 0.7F, 0.1F, 0.4F, 0F, -1.1F, 0.5F, 0F, 1.5F, 1F, 1.5F, 0.5F, 0.5F, 1.5F, 0.5F, 0.5F, 0F, 1.5F, 1F); // Box 64
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(4.5F, 0F, -2F, 2, 3, 4, 0F,0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.35F, 0.1F, 0.3F, -1F, -0.9F, 0.2F, -1F, -0.9F, 0.2F, 0.35F, 0.1F, 0.3F); // Box 70
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.4F, 1F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.4F, 3F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.4F, 5F, -2.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 71
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 72

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 71
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 72
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 34
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35

		rightArmModel[0].addShapeBox(-3F, 6F, -2F, 4, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 34
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 35
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 65
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 66
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 67
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 68
		leftLegModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 69

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 65
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 5.5F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 9.8F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 68
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 69
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 11
		rightLegModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 61
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 60

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 7
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 9.8F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 5.5F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}