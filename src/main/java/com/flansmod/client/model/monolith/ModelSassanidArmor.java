//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SassanidArmor
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSassanidArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelSassanidArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
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
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 18
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		bodyModel[4] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 26
		bodyModel[6] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 29
		bodyModel[9] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 36
		bodyModel[14] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 37

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 9.8F, -2F, 8, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F); // Box 19
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0F, -2F, 8, 8, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 24
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 10F, -2F, 3, 5, 4, 0F,0.4F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.6F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F, 0.6F, 0.1F, 0.6F); // Box 25
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(1F, 10F, -2F, 3, 5, 4, 0F,0F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -0.4F, 0.1F, 0.6F, 0.6F, 0.1F, 0.6F, 0.6F, 0.1F, 0.6F, -0.4F, 0.1F, 0.6F); // Box 26
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F, 0.4F, -0.7F, 0.4F); // Box 27
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 10F, -2F, 3, 1, 4, 0F,0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F); // Box 28
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 8F, -2F, 8, 1, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F); // Box 29
		bodyModel[8].setRotationPoint(0F, 0.3F, 0F);

		bodyModel[9].addShapeBox(-4F, 3.5F, -2F, 8, 1, 4, 0F,0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F); // Box 32
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 3F, -2F, 4, 1, 4, 0F,-0.55F, 3.4F, 0.45F, 0.45F, -0.4F, 0.45F, 0.45F, -0.4F, 0.45F, -0.55F, 3.4F, 0.45F, 0.45F, -4.2F, 0.45F, 0.45F, 0.6F, 0.45F, 0.45F, 0.6F, 0.45F, 0.45F, -4.2F, 0.45F); // Box 33
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 3F, -2F, 4, 1, 4, 0F,0.45F, -0.4F, 0.45F, -0.55F, 3.4F, 0.45F, -0.55F, 3.4F, 0.45F, 0.45F, -0.4F, 0.45F, 0.45F, 0.6F, 0.45F, 0.45F, -4.2F, 0.45F, 0.45F, -4.2F, 0.45F, 0.45F, 0.6F, 0.45F); // Box 34
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1.5F, 3F, -2.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-1.5F, 2F, -2.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.5F, 4F, -2.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 21
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 31

		leftArmModel[0].addShapeBox(-1F, 6.6F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2F, -2F, 4, 7, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 31
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 20
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 30

		rightArmModel[0].addShapeBox(-3F, 6.6F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2F, -2F, 4, 7, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 30
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 23

		leftLegModel[0].addShapeBox(-2F, 8.1F, -2.3F, 4, 4, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 3F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 23
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 22

		rightLegModel[0].addShapeBox(-2F, 8.1F, -2.3F, 4, 4, 5, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 3F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}