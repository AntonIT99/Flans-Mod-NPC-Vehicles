//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MamlukMail
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMamlukMail extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMamlukMail() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 18
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		bodyModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 22
		bodyModel[6] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 23
		bodyModel[7] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 24
		bodyModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 26
		bodyModel[10] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.3F, 1.1F, 0.3F, 0.3F, 1.1F, 0.3F, 0.3F, 1.1F, 0.3F, 0.3F, 1.1F, 0.3F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 18
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 21
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 5F, -2F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 22
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 3F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 23
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0.32F, 3F, -2.05F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 24
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0.32F, 5F, -2.05F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 25
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.32F, 7F, -2.05F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 26
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.32F, 9F, -2.02F, 4, 1, 4, 0F,0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 27
		bodyModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 4.6F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4.6F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		leftLegModel[2] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 32
		leftLegModel[3] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 33
		leftLegModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		leftLegModel[5] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 35
		leftLegModel[6] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 41

		leftLegModel[0].addShapeBox(-2F, 8.1F, -2.3F, 4, 4, 5, 0F,0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 1.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 32
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 2.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 33
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 3.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 34
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 4.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 35
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 5.6F, -2.3F, 4, 3, 5, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1.2F, -0.4F, 0.4F, -1.2F, -0.4F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1.2F, -0.4F, 0.4F, -1.2F, -0.4F); // Box 41
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 36
		rightLegModel[3] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 37
		rightLegModel[4] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 38
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 39
		rightLegModel[6] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 40

		rightLegModel[0].addShapeBox(-2F, 8.1F, -2.3F, 4, 4, 5, 0F,0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 4.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 36
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 1.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 37
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 3.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 38
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 2.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 39
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 5.6F, -2.3F, 4, 3, 5, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1.2F, -0.4F, 0.4F, -1.2F, -0.4F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1.2F, -0.4F, 0.4F, -1.2F, -0.4F); // Box 40
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);
	}
}