//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EdoUniform
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEdoUniform extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelEdoUniform() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 46
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 51
		bodyModel[3] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 40
		bodyModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 41

		bodyModel[0].addShapeBox(0F, -0.2F, -2F, 4, 9, 4, 0F,-1.5F, 0.15F, 0.45F, 0.7F, 0.1F, 0.4F, 0.7F, 0.1F, 0.5F, 0F, 0.15F, 0.5F, 4.5F, 0.2F, 0.45F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0.5F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.5F, 8.8F, -2.5F, 9, 2, 5, 0F,0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F, 0.1F, -0.3F, 0.3F); // Box 46
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, -0.2F, -2F, 3, 9, 4, 0F,0.7F, 0.1F, 0.5F, -0.5F, 0.25F, 0.5F, 1F, 0.2F, 0.5F, 0.7F, 0.1F, 0.5F, 0.3F, 0F, 0.5F, 4.5F, 0.2F, 0.5F, 1F, 0.2F, 0.5F, 0.3F, 0F, 0.5F); // Box 51
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2.5F, -1.2F, -2F, 5, 3, 4, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F); // Box 15
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(3F, -0.5F, -2.5F, 1, 10, 5, 0F,-0.3F, 0.1F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 6.5F, -0.2F, 0.2F, -6.5F, -0.2F, 0.2F, -6.5F, -0.2F, 0.2F, 6.5F, -0.2F, 0.2F); // Box 35
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.5F, 9.5F, -3.5F, 1, 1, 1, 0F,1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F); // Box 40
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.5F, 9.5F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F); // Box 41
		bodyModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 34

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F); // Box 34
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 46

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F); // Box 46
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 29
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 31
		leftLegModel[3] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 32
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 33

		leftLegModel[0].addShapeBox(-2F, -2.5F, -2.5F, 4, 2, 5, 0F,0.4F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.6F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.6F, 0F, 0.3F); // Box 29
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.5F, -2.5F, 4, 6, 5, 0F,0.6F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.4F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.4F, 0.5F, 0F); // Box 30
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.5F, -2.5F, 4, 1, 5, 0F,0.4F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 31
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 1F, -2F, 4, 10, 4, 0F,0.2F, -5F, 0.2F, 0.2F, -5F, 0.2F, 0.2F, -5F, 0.2F, 0.2F, -5F, 0.2F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 32
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 33
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 11
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		rightLegModel[3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 31
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 36

		rightLegModel[0].addShapeBox(-2F, -2.5F, -2.5F, 4, 2, 5, 0F,0.4F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.6F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.6F, 0F, 0.3F); // Box 4
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -0.5F, -2.5F, 4, 6, 5, 0F,0.6F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.4F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.4F, 0.5F, 0F); // Box 30
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 6.5F, -2.5F, 4, 1, 5, 0F,0.4F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 31
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 1F, -2F, 4, 10, 4, 0F,0.2F, -5F, 0.2F, 0.2F, -5F, 0.2F, 0.2F, -5F, 0.2F, 0.2F, -5F, 0.2F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 36
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}