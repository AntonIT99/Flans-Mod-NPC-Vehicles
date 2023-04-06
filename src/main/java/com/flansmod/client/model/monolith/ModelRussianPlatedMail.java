//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RussianPlatedMail
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRussianPlatedMail extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelRussianPlatedMail() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[17];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 45
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 48
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 49
		bodyModel[4] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 32
		bodyModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 22
		bodyModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 38
		bodyModel[7] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 39
		bodyModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 41
		bodyModel[9] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 42
		bodyModel[10] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 43
		bodyModel[11] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 44
		bodyModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 45
		bodyModel[13] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 46
		bodyModel[14] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 47
		bodyModel[15] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 48
		bodyModel[16] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 49

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 6, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 1.6F, -0.6F, 1.1F, 1.7F, -0.6F, 1.1F, 2F, -0.5F, 0.8F, 1.9F, -0.5F, 0.7F); // Box 44
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8.5F, 0F, 8, 6, 2, 0F,0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 1.7F, -0.6F, 0.8F, 1.6F, -0.6F, 0.7F, 1.6F, -0.6F, 1.1F, 1.7F, -0.6F, 1.1F); // Box 45
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 9, 5, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F); // Box 48
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, -0.2F, -3.1F, 4, 9, 1, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 49
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-5.1F, -0.2F, -3.1F, 4, 9, 3, 0F,-0.25F, 0.2F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.6F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 32
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 9F, -3F, 9, 1, 6, 0F,0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F); // Box 22
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2F, 9.8F, -3.1F, 4, 3, 1, 0F,0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.4F, 0.4F, 0.3F, -0.4F, 0.4F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F); // Box 38
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-5.1F, 9.8F, -3.1F, 4, 3, 3, 0F,-0.6F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, 0F, 0F, -0.6F, 0F, 0F, -0.25F, -0.5F, 0.2F, -1.2F, -0.5F, 0.2F, -1.2F, -0.3F, 0F, -0.25F, -0.3F, 0F); // Box 39
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-5.1F, -0.2F, 0.1F, 4, 9, 3, 0F,-0.25F, 0.5F, 0F, -1.2F, 0.5F, 0F, -1.2F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.6F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 41
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(1.1F, -0.2F, -3.1F, 4, 9, 3, 0F,-1.2F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.5F, 0F, -1.2F, 0.5F, 0F, -1.2F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -1.2F, 0F, 0F); // Box 42
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(1.1F, 9.8F, -3.1F, 4, 3, 3, 0F,-1.2F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.6F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F, -0.25F, -0.3F, 0F, -1.2F, -0.3F, 0F); // Box 43
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.1F, -0.2F, 0.1F, 4, 9, 3, 0F,-1.2F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.2F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, -1.2F, 0F, -0.2F); // Box 44
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, -0.2F, 2.1F, 4, 9, 1, 0F,0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 45
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-5.1F, -0.2F, 0.1F, 4, 9, 3, 0F,-0.25F, 0.5F, 0F, -1.2F, 0.5F, 0F, -1.2F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.6F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -0.2F, -0.6F, 0F, -0.2F); // Box 46
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-5.1F, 9.8F, 0.1F, 4, 3, 3, 0F,-0.6F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, -0.2F, -0.6F, 0F, -0.2F, -0.25F, -0.3F, 0F, -1.2F, -0.3F, 0F, -1.2F, -0.5F, 0.2F, -0.25F, -0.5F, 0.2F); // Box 47
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 9.8F, 2.1F, 4, 3, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.4F, 0.4F, 0.3F, -0.4F, 0.4F); // Box 48
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.1F, 9.8F, 0.1F, 4, 3, 3, 0F,-1.2F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, -1.2F, 0F, -0.2F, -1.2F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.5F, 0.2F, -1.2F, -0.5F, 0.2F); // Box 49
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 50
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 51

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.3F, 0.35F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.35F, 0.3F, 0.7F, 0.4F, 0.9F, 0.9F, 0.4F, 0.7F, 0.9F, 0.4F, 0.7F, 0.7F, 0.4F, 0.9F); // Box 50
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-5F, 4F, -2F, 8, 4, 8, 0F,-3.4F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, -3.4F, -3.4F, 0F, -3.4F, -3.7F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, -3.8F, -3.7F, 0.5F, -3.7F); // Box 51
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 56
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 40

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.3F, 0.25F, 0.3F, 0.3F, 0.35F, 0.3F, 0.3F, 0.35F, 0.3F, 0.3F, 0.25F, 0.3F, 0.9F, 0.4F, 0.7F, 0.7F, 0.4F, 0.9F, 0.7F, 0.4F, 0.9F, 0.9F, 0.4F, 0.7F); // Box 56
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4F, -2F, 8, 4, 8, 0F,0.6F, 0F, 0.6F, -3.4F, 0F, 0.6F, -3.4F, 0F, -3.4F, 0.6F, 0F, -3.4F, 0.3F, 0.5F, 0.3F, -3.7F, 0.5F, 0.3F, -3.7F, 0.5F, -3.7F, 0.3F, 0.5F, -3.8F); // Box 40
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 52

		leftLegModel[0].addShapeBox(-2F, 4.8F, -2F, 8, 5, 8, 0F,0.7F, 0.2F, 0.7F, -3.3F, 0.2F, 0.7F, -3.3F, 0.2F, -3.3F, 0.7F, 0.2F, -3.3F, 0.4F, 1F, 0.4F, -3.6F, 1F, 0.4F, -3.6F, 1F, -3.6F, 0.4F, 1F, -3.6F); // Box 52
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 55

		rightLegModel[0].addShapeBox(-2F, 4.8F, -2F, 8, 5, 8, 0F,0.7F, 0.2F, 0.7F, -3.3F, 0.2F, 0.7F, -3.3F, 0.2F, -3.3F, 0.7F, 0.2F, -3.3F, 0.4F, 1F, 0.4F, -3.6F, 1F, 0.4F, -3.6F, 1F, -3.6F, 0.4F, 1F, -3.6F); // Box 55
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}