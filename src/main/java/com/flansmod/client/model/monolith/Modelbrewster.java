//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: brewster
// Model Creator: 
// Created on: 28.12.2019 - 15:52:43
// Last changed on: 28.12.2019 - 15:52:43

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelbrewster extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public Modelbrewster() //Same as Filename
	{
		headModel = new ModelRendererTurbo[19];
		headModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 13
		headModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 15
		headModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 16
		headModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 17
		headModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 18
		headModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 19
		headModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 20
		headModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 21
		headModel[9] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 22
		headModel[10] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 23
		headModel[11] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 24
		headModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 30
		headModel[13] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 31
		headModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 32
		headModel[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 33
		headModel[16] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 34
		headModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 35
		headModel[18] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 36

		headModel[0].addShapeBox(0F, -3F, -4F, 5, 3, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 13
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -3F, -4F, 5, 3, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -8F, -4F, 5, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 15
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -8F, -4F, 5, 4, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 16
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -11F, -4F, 5, 3, 1, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 17
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0F, -11F, -4F, 5, 3, 1, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 18
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -8F, -4F, 5, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 19
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0F, -8F, -4F, 5, 1, 1, 0F, 0F, 0F, 2.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 20
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -6F, -4F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F); // Box 21
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3F, -6F, -4F, 2, 4, 1, 0F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F); // Box 22
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -8F, -4F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -8F, -4F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(0F, -7F, -7F, 3, 3, 1, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 1F, -0.25F, 0F, 0F); // Box 30
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-3F, -7F, -7F, 3, 3, 1, 0F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 1F); // Box 31
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -5F, -7F, 1, 1, 1, 0F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F); // Box 32
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-1F, -5F, -7F, 1, 1, 1, 0F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F, -0.5F, -0.375F, -0.375F, -0.375F, -0.375F, -0.375F); // Box 33
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -5F, -4F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(4F, -9F, -4F, 1, 1, 5, 0F, 4F, 2F, -3F, 0F, -0.75F, -1F, 0F, 0F, 0F, 4F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5F, -9F, -4F, 1, 1, 5, 0F, 0F, -0.75F, -1F, 4F, 2F, -3F, 4F, 2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		headModel[18].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[9];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 9
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 11
		bodyModel[3] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 37
		bodyModel[5] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 38
		bodyModel[6] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 39
		bodyModel[7] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 40
		bodyModel[8] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 41

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 4F, -2F, 4, 8, 1, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 2F, 0F, 3F, -2F, 0F, 0F, 0F); // Box 9
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2F, 4, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 11
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -2F, 4, 4, 1, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 12
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 4F, -2F, 4, 8, 1, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, -2F); // Box 37
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 8F, -2F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 38
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 3F, -2F, 8, 2, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 39
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3F, 0F, -2F, 2, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 40
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(1F, 0F, -2F, 2, 8, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 41
		bodyModel[8].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 36

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F, 0.25F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[2];
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 37

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F, 0.125F, 0F, 0.25F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[3];
		leftLegModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		leftLegModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 6
		leftLegModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 7

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addBox(-2F, 10F, -3F, 4, 2, 5, 0F); // Box 6
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[3];
		rightLegModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		rightLegModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 8

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 6, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 3
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addBox(-2F, 10F, -3F, 4, 2, 5, 0F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);


	}
}