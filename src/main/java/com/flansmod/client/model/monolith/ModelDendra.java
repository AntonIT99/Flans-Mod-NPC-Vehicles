//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Dendra
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDendra extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelDendra() //Same as Filename
	{
		headModel = new ModelRendererTurbo[2];
		bodyModel = new ModelRendererTurbo[4];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 60
		headModel[1] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 68

		headModel[0].addShapeBox(-4F, -2F, -4F, 8, 2, 8, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 60
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, 0F, -4F, 8, 2, 8, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F); // Box 68
		headModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 39
		bodyModel[1] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 61
		bodyModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 62
		bodyModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 67

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 6, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 39
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 5F, -2F, 8, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 8F, -2F, 8, 5, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 62
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 11F, -2F, 8, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 67
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 169
		leftArmModel[2] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 65
		leftArmModel[3] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 66

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 5F, -2F, 4, 4, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 169
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-2.5F, -2F, -2F, 4, 5, 4, 0F,-2F, 1.5F, 0.8F, 2F, 0F, 0.8F, 2F, 0F, 0.8F, -2F, 1.5F, 0.8F, 1F, -1.5F, 1.2F, -1.7F, 0.5F, 0.8F, -0.7F, 0.5F, 0.8F, 1F, -1.5F, 1.2F); // Box 65
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -0.5F, -2F, 4, 3, 4, 0F,-0.7F, 0.2F, 0.2F, 0.3F, 1.5F, 0.2F, 0.3F, 1.5F, 0.2F, -0.7F, 0.2F, 0.2F, -1F, 0.8F, 0.4F, 1F, 0F, 0.4F, 1F, 0F, 0.4F, -1F, 0.8F, 0.4F); // Box 66
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 34
		rightArmModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 39
		rightArmModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 168

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1.5F, -2F, -2F, 4, 5, 4, 0F,2F, 0F, 0.8F, -2F, 1.5F, 0.8F, -2F, 1.5F, 0.8F, 2F, 0F, 0.8F, -1.7F, 0.5F, 0.8F, 1F, -1.5F, 1.2F, 1F, -1.5F, 1.2F, -0.7F, 0.5F, 0.8F); // Box 34
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -0.5F, -2F, 4, 3, 4, 0F,0.3F, 1.5F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.3F, 1.5F, 0.2F, 1F, 0F, 0.4F, -1F, 0.8F, 0.4F, -1F, 0.8F, 0.4F, 1F, 0F, 0.4F); // Box 39
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 5F, -2F, 4, 4, 4, 0F,0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F); // Box 168
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 0
		leftLegModel[2] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 1

		leftLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 2, 2, 5, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.6F, 0.1F, 0F, -0.6F); // Box 0
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7F, -2F, 2, 4, 5, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.9F, 0.1F, 0F, -0.9F); // Box 1
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 75
		rightLegModel[2] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 26

		rightLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.8F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.8F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 2, 2, 5, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.6F, 0.1F, 0F, -0.6F); // Box 75
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7F, -2F, 2, 4, 5, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.9F, 0.1F, 0F, -0.9F); // Box 26
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 63

		skirtFrontModel[0].addShapeBox(-4F, -1F, -2.2F, 8, 5, 2, 0F,0.6F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F); // Box 63
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 64

		skirtRearModel[0].addShapeBox(-4F, -1F, 0.2F, 8, 5, 2, 0F,0.6F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 0.6F, -0.5F, 0.5F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F); // Box 64
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}