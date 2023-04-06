//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: rusww1
// Model Creator: 
// Created on: 22.07.2020 - 15:56:28
// Last changed on: 22.07.2020 - 15:56:28

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRusWW1Body extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelRusWW1Body() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box10
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import Box12
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box13
		bodyModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box14
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box16
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box17
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box19
		bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box20
		bodyModel[9] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box21
		bodyModel[10] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box23
		bodyModel[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Import Box0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8F, 1F, 8, 1, 1, 0F,0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F); // Import Box10
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 8F, -2F, 3, 1, 1, 0F,0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F); // Import Box12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(1F, 8F, -2F, 3, 1, 1, 0F,0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F); // Import Box13
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.4F, 8F, -2F, 1, 1, 1, 0F,0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F, 0.325F, 0F, 0.4F); // Import Box14
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0F, -2F, 8, 8, 4, 0F,-7.3F, 0.7F, 0.65F, 2.2F, 0.25F, 0.65F, 2.2F, 0.25F, 0.65F, -7.3F, 0.7F, 0.65F, 0.7F, -3.2F, 0.65F, -8.45F, 0.5F, 0.65F, -8.8F, 0.5F, 0.65F, 0.7F, -3.2F, 0.65F); // Import Box16
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3F, 9F, -2F, 3, 3, 4, 0F,-0.05F, 0F, 0.45F, -1.15F, 0F, 0.45F, -1.15F, 0F, 0.45F, -0.35F, 0F, 0.45F, -1F, 1F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, -1F, 1F, 0.45F); // Import Box17
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 8F, -3F, 2, 2, 1, 0F,0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F, 0.325F, 0F, 0.325F); // Import Box19
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 8F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box20
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3F, 7.2F, 2.3F, 1, 1, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box21
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 0F, -2F, 1, 5, 1, 0F,0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F, 0.2F, 0F, 0.325F); // Import Box23
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 9.5F, -2F, 8, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 0
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box1
		leftArmModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box25

		leftArmModel[0].addShapeBox(-0.8F, -2F, -2F, 4, 10, 4, 0F,0.125F, 0.1F, 0.125F, 0.125F, 0.1F, 0.125F, 0.125F, 0.1F, 0.125F, 0.125F, 0.1F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Import Box1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.8F, -2.1F, -0.5F, 4, 1, 1, 0F,0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F); // Import Box25
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box2
		rightArmModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box24

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.125F, 0.1F, 0.125F, 0.125F, 0.1F, 0.125F, 0.125F, 0.1F, 0.125F, 0.125F, 0.1F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Import Box2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -0.5F, 4, 1, 1, 0F,0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F, 0.125F, -0.8F, 0.125F); // Import Box24
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box4
		leftLegModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box6
		leftLegModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box9

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Import Box4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box6
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -3F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box9
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Import Box5
		rightLegModel[1] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box7
		rightLegModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box8

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F,0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Import Box5
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -3F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}