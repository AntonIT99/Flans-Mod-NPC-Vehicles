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

public class ModelClonePants212 extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelClonePants212() //Same as Filename
	{
		leftLegModel = new ModelRendererTurbo[7];
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 39
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 49
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 50
		leftLegModel[4] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 51
		leftLegModel[5] = new ModelRendererTurbo(this, 44, 42, textureX, textureY); // Box 11
		leftLegModel[6] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 13

		leftLegModel[0].addShapeBox(-2F, -0.0899999999999999F, -2F, 4, 12, 4, 0F, 0.01F, 0.8F, 0.11F, 0.01F, 0.8F, 0.11F, 0.01F, 0.8F, 0.11F, 0.01F, 0.8F, 0.11F, 0.01F, 0F, 0.11F, 0.01F, 0F, 0.11F, 0.01F, 0F, 0.11F, 0.01F, 0F, 0.11F); // Box 39
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 1.91F, -2F, 4, 2, 4, 0F, 0.02F, 0.4F, 0.4F, 0.41F, 2.4F, 0.4F, 0.41F, 2.4F, 0.4F, 0.02F, 0.4F, 0.4F, 0.02F, 0.5F, 0.4F, 0.41F, 0.5F, 0.4F, 0.41F, 1F, 0.4F, 0.02F, 1F, 0.4F); // Box 48
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(1F, 4.91F, -2F, 1, 1, 4, 0F, 0.09F, 0.7F, 1F, 0.41F, 0F, 1F, 0.41F, -0.3F, 0.4F, 0.09F, -0.3F, 0.4F, 0.09F, 0.7F, 1F, 0.41F, 0F, 1F, 0.41F, -0.3F, 0.4F, 0.09F, -0.3F, 0.4F); // Box 49
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-0.5F, 4.91F, -2F, 1, 1, 4, 0F, 0.01F, 0.7F, 1F, 0.41F, 0.7F, 1F, 0.41F, -0.3F, 0.4F, 0.01F, -0.3F, 0.4F, 0.01F, 0.7F, 1F, 0.41F, 0.7F, 1F, 0.41F, -0.3F, 0.4F, 0.01F, -0.3F, 0.4F); // Box 50
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 4.91F, -2F, 1, 1, 4, 0F, 0.02F, 0F, 1F, 0.5F, 0.7F, 1F, 0.5F, -0.3F, 0.4F, 0.02F, -0.3F, 0.4F, 0.02F, 0F, 1F, 0.5F, 0.7F, 1F, 0.5F, -0.3F, 0.4F, 0.02F, -0.3F, 0.4F); // Box 51
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 1.91F, -2F, 4, 2, 4, 0F, 0.03F, 0.4F, 0.41F, 0.42F, 2.4F, 0.41F, 0.42F, 2.4F, 0.41F, 0.03F, 0.4F, 0.41F, 0.03F, -1.5F, 0.41F, 0.42F, -2.5F, 0.41F, 0.42F, -4.4F, 0.41F, 0.03F, -1F, 0.41F); // Box 11
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-0.5F, 4.91F, -2F, 1, 1, 4, 0F, 0.01F, 0.7F, 1.01F, 0.41F, -1.5F, 1.01F, 0.41F, -0.3F, 0.4F, 0.01F, -0.3F, 0.4F, 0.01F, 0.7F, 1.01F, 0.41F, 0.7F, 1.01F, 0.41F, -0.3F, 0.4F, 0.01F, -0.3F, 0.4F); // Box 13
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[7];
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 42
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 45
		rightLegModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 46
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 47
		rightLegModel[5] = new ModelRendererTurbo(this, 44, 42, textureX, textureY); // Box 10
		rightLegModel[6] = new ModelRendererTurbo(this, 53, 33, textureX, textureY); // Box 12

		rightLegModel[0].addShapeBox(-2F, -0.0899999999999999F, -2F, 4, 12, 4, 0F, 0.01F, 0.8F, 0.11F, 0.01F, 0.8F, 0.11F, 0.01F, 0.8F, 0.11F, 0.01F, 0.8F, 0.11F, 0.01F, 0F, 0.11F, 0.01F, 0F, 0.11F, 0.01F, 0F, 0.11F, 0.01F, 0F, 0.11F); // Box 38
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1.91F, -2F, 4, 2, 4, 0F, 0.41F, 2.4F, 0.4F, 0.02F, 0.4F, 0.4F, 0.02F, 0.4F, 0.4F, 0.41F, 2.4F, 0.4F, 0.41F, 0.5F, 0.4F, 0.02F, 0.5F, 0.4F, 0.02F, 1F, 0.4F, 0.41F, 1F, 0.4F); // Box 42
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-0.5F, 4.91F, -2F, 1, 1, 4, 0F, 0.41F, 0.7F, 1F, 0.01F, 0.7F, 1F, 0.01F, -0.3F, 0.4F, 0.41F, -0.3F, 0.4F, 0.41F, 0.7F, 1F, 0.01F, 0.7F, 1F, 0.01F, -0.3F, 0.4F, 0.41F, -0.3F, 0.4F); // Box 45
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 4.91F, -2F, 1, 1, 4, 0F, 0.41F, 0F, 1F, 0.09F, 0.7F, 1F, 0.09F, -0.3F, 0.4F, 0.41F, -0.3F, 0.4F, 0.41F, 0F, 1F, 0.09F, 0.7F, 1F, 0.09F, -0.3F, 0.4F, 0.41F, -0.3F, 0.4F); // Box 46
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(1F, 4.91F, -2F, 1, 1, 4, 0F, 0.5F, 0.7F, 1F, 0.02F, 0F, 1F, 0.02F, -0.3F, 0.4F, 0.5F, -0.3F, 0.4F, 0.5F, 0.7F, 1F, 0.02F, 0F, 1F, 0.02F, -0.3F, 0.4F, 0.5F, -0.3F, 0.4F); // Box 47
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 1.91F, -2F, 4, 2, 4, 0F, 0.42F, 2.4F, 0.41F, 0.03F, 0.4F, 0.41F, 0.03F, 0.4F, 0.41F, 0.42F, 2.4F, 0.41F, 0.42F, -2.5F, 0.41F, 0.03F, -1.5F, 0.41F, 0.03F, -1F, 0.41F, 0.42F, -4.4F, 0.41F); // Box 10
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-0.5F, 4.91F, -2F, 1, 1, 4, 0F, 0.41F, -1.5F, 1.01F, 0.01F, 0.7F, 1.01F, 0.01F, -0.3F, 0.4F, 0.41F, -0.3F, 0.4F, 0.41F, 0.7F, 1.01F, 0.01F, 0.7F, 1.01F, 0.01F, -0.3F, 0.4F, 0.41F, -0.3F, 0.4F); // Box 12
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);


	}
}