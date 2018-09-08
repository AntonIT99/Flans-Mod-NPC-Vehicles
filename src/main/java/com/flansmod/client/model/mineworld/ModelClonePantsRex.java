//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
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

public class ModelClonePantsRex extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelClonePantsRex() //Same as Filename
	{
		leftLegModel = new ModelRendererTurbo[9];
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 39
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 49
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 50
		leftLegModel[4] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 51
		leftLegModel[5] = new ModelRendererTurbo(this, 21, 51, textureX, textureY); // Box 12
		leftLegModel[6] = new ModelRendererTurbo(this, 41, 46, textureX, textureY); // Box 13
		leftLegModel[7] = new ModelRendererTurbo(this, 21, 51, textureX, textureY); // Box 16
		leftLegModel[8] = new ModelRendererTurbo(this, 56, 34, textureX, textureY); // Box 18

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

		leftLegModel[5].addShapeBox(-1.25F, -1.75F, 1.75F, 8, 11, 1, 0F, 0.6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.25F, 0.6F, 0F, -0.25F, 0.6F, -4F, -0.75F, -4F, -4F, -0.75F, -4F, -4F, 0.5F, 0.6F, -4F, 0.5F); // Box 12
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(1.75F, -1.75F, -3.25F, 1, 11, 6, 0F, -0.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, -0.25F, -4F, 0.5F); // Box 13
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.25F, -1.75F, -3.5F, 8, 11, 1, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0.75F, 0F, 0F, 0.75F, -0.4F, -4F, -0.25F, -4F, -4F, -0.25F, -4F, -4F, 0F, -0.4F, -4F, 0F); // Box 16
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(2.5F, 0F, -1F, 1, 2, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 18
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[9];
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 42
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 45
		rightLegModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 46
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 47
		rightLegModel[5] = new ModelRendererTurbo(this, 2, 51, textureX, textureY); // Box 11
		rightLegModel[6] = new ModelRendererTurbo(this, 41, 46, textureX, textureY); // Box 14
		rightLegModel[7] = new ModelRendererTurbo(this, 2, 51, textureX, textureY); // Box 15
		rightLegModel[8] = new ModelRendererTurbo(this, 56, 34, textureX, textureY); // Box 17

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

		rightLegModel[5].addShapeBox(-2.25F, -1.75F, 1.75F, 8, 11, 1, 0F, 0.5F, 0F, 0F, -3.9F, 0F, 0F, -3.9F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, -4F, -0.75F, -3.9F, -4F, -0.75F, -3.9F, -4F, 0.5F, 0.5F, -4F, 0.5F); // Box 11
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3F, -1.75F, -3.25F, 1, 11, 6, 0F, -0.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, -0.25F, -4F, 0.5F); // Box 14
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.25F, -1.75F, -3.5F, 8, 11, 1, 0F, 0.5F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, -4F, -0.25F, -4.9F, -4F, -0.25F, -4.9F, -4F, 0F, 0.5F, -4F, 0F); // Box 15
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-3.5F, 0F, -1F, 1, 2, 2, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 17
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);


	}
}