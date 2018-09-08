//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GermanAssaultChest
// Model Creator: 
// Created on: 28.02.2016 - 16:11:42
// Last changed on: 28.02.2016 - 16:11:42

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCloneBootsRiot extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCloneBootsRiot() //Same as Filename
	{
		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 52
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 53
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 8
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 9

		leftLegModel[0].addShapeBox(-2F, 7.1F, -2F, 4, 3, 4, 0F, 0.02F, 0.8F, 0.4F, 0.41F, 0.8F, 0.4F, 0.41F, 0.8F, 0.4F, 0.02F, 0.8F, 0.4F, 0.02F, 0F, 0.4F, 0.41F, 0F, 0.4F, 0.41F, 0F, 0.4F, 0.02F, 0F, 0.4F); // Box 52
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10.91F, -2F, 4, 1, 4, 0F, 0.02F, 0.8F, 0.4F, 0.41F, 0.8F, 0.4F, 0.41F, 0.8F, 0.4F, 0.02F, 0.8F, 0.4F, 0.02F, 0.1F, 1.8F, 0.41F, 0.1F, 1.8F, 0.41F, 0.1F, 0.4F, 0.02F, 0.1F, 0.4F); // Box 53
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7.1F, -2F, 4, 3, 4, 0F, -2.25F, -1.5F, 0.41F, 0.42F, -2.75F, 0.41F, 0.42F, -2.75F, 0.41F, -2.25F, -2.75F, 0.41F, -2.25F, 0F, 0.41F, 0.42F, 0F, 0.41F, 0.42F, 0F, 0.41F, -2.25F, 0F, 0.41F); // Box 8
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 7.1F, -2F, 4, 3, 4, 0F, 0.42F, -2.75F, 0.41F, -2.25F, -1.5F, 0.41F, -2.25F, -2.75F, 0.41F, 0.42F, -2.75F, 0.41F, 0.42F, 0F, 0.41F, -2.25F, 0F, 0.41F, -2.25F, 0F, 0.41F, 0.42F, 0F, 0.41F); // Box 9
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 43
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 44
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 4
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 50, textureX, textureY); // Box 7

		rightLegModel[0].addShapeBox(-2F, 10.91F, -2F, 4, 1, 4, 0F, 0.41F, 0.8F, 0.4F, 0.02F, 0.8F, 0.4F, 0.02F, 0.8F, 0.4F, 0.41F, 0.8F, 0.4F, 0.41F, 0.1F, 1.8F, 0.02F, 0.1F, 1.8F, 0.02F, 0.1F, 0.4F, 0.41F, 0.1F, 0.4F); // Box 43
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7.1F, -2F, 4, 3, 4, 0F, 0.41F, 0.8F, 0.4F, 0.02F, 0.8F, 0.4F, 0.02F, 0.8F, 0.4F, 0.41F, 0.8F, 0.4F, 0.41F, 0F, 0.4F, 0.02F, 0F, 0.4F, 0.02F, 0F, 0.4F, 0.41F, 0F, 0.4F); // Box 44
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7.1F, -2F, 4, 3, 4, 0F, 0.42F, -2.75F, 0.41F, -2.25F, -1.5F, 0.41F, -2.25F, -2.75F, 0.41F, 0.42F, -2.75F, 0.41F, 0.42F, 0F, 0.41F, -2.25F, 0F, 0.41F, -2.25F, 0F, 0.41F, 0.42F, 0F, 0.41F); // Box 4
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, 7.1F, -2F, 4, 3, 4, 0F, -2.25F, -1.5F, 0.41F, 0.42F, -2.75F, 0.41F, 0.42F, -2.75F, 0.41F, -2.25F, -2.75F, 0.41F, -2.25F, 0F, 0.41F, 0.42F, 0F, 0.41F, 0.42F, 0F, 0.41F, -2.25F, 0F, 0.41F); // Box 7
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);


	}
}