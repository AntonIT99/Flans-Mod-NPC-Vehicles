//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modeljewclothing extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public Modeljewclothing() //Same as Filename
	{
		headModel = new ModelRendererTurbo[9];
		bodyModel = new ModelRendererTurbo[13];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[6];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 8
		headModel[1] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 9
		headModel[2] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 10
		headModel[3] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 11
		headModel[4] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 12
		headModel[5] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 13
		headModel[6] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 14
		headModel[7] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 15
		headModel[8] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0

		headModel[0].addShapeBox(-3F, -10.5F, -4F, 6, 4, 8, 0F,0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.8F, 0.5F); // Box 8
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7.3F, -6F, 8, 1, 12, 0F,0.2F, -0.7F, 0.3F, 0.2F, -0.7F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.8F, 0.3F, 0.2F, 0.8F, 0.3F); // Box 9
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-6.4F, -7.3F, -6F, 2, 1, 12, 0F,0.2F, -0.7F, -1.7F, 0.2F, -0.7F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, -1.7F, 0.2F, 0.5F, -1.7F, 0.2F, 0.5F, 0.3F, 0.2F, 0.8F, 0.3F, 0.2F, 0.8F, -1.7F); // Box 10
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.4F, -10.5F, -4F, 1, 4, 8, 0F,0.2F, 0.3F, 0F, 0.2F, 0.3F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.8F, 0F); // Box 11
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(4.4F, -7.3F, -6F, 2, 1, 12, 0F,0.2F, -0.7F, 0.3F, 0.2F, -0.7F, -1.7F, 0.2F, -0.8F, -1.7F, 0.2F, -0.8F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, -1.7F, 0.2F, 0.8F, -1.7F, 0.2F, 0.8F, 0.3F); // Box 12
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3.4F, -10.5F, -4F, 1, 4, 8, 0F,0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0.5F); // Box 13
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.6F, -6.3F, -3.5F, 1, 8, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 14
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3.6F, -6.3F, -3.5F, 1, 8, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 15
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -3.8F, -5F, 1, 2, 1, 0F,0.2F, 0.2F, -1F, 0.2F, 0.2F, -1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 0
		headModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 18
		bodyModel[8] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 26
		bodyModel[10] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 27
		bodyModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		bodyModel[12] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 29

		bodyModel[0].addShapeBox(-2F, 0F, -2F, 2, 7, 3, 0F,0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 5
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 2, 11, 4, 0F,0.5F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F); // Box 6
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -2F, 2, 7, 3, 0F,-2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 7
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(2F, 0F, -2F, 2, 11, 4, 0F,0F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 9
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2F, 7F, -2F, 4, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 10
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 0F, -2F, 6, 10, 4, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 11
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2F, 0F, -1F, 4, 5, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 2F, 0.5F); // Box 12
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0.95F, 1F, -2F, 1, 6, 1, 0F,-0.35F, 0F, 0.6F, -0.2F, 0.1F, 0.6F, -0.2F, 0.1F, 0.6F, -0.35F, 0F, 0.6F, 1F, 0F, 0.6F, -0.5F, -0.5F, 0.6F, -0.5F, -0.5F, 0.6F, 1F, 0F, 0.6F); // Box 18
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2F, 0F, -2F, 1, 1, 1, 0F,0.1F, 0F, 0.6F, -0.7F, -0.7F, 0.6F, -0.7F, -0.7F, 0.6F, 0.1F, 0F, 0.6F, 0.7F, 0F, 0.6F, -1.4F, 0F, 0.6F, -1.4F, 0F, 0.6F, 0.7F, 0F, 0.6F); // Box 25
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3F, 0F, -2F, 1, 1, 1, 0F,-0.7F, -0.7F, 0.6F, 0.1F, 0F, 0.6F, 0.1F, 0F, 0.6F, -0.7F, -0.7F, 0.6F, -1.4F, 0F, 0.6F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.6F, -1.4F, 0F, 0.6F); // Box 26
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1.95F, 1F, -2F, 1, 6, 1, 0F,-0.2F, 0.1F, 0.6F, -0.35F, 0F, 0.6F, -0.35F, 0F, 0.6F, -0.2F, 0.1F, 0.6F, -0.5F, -0.5F, 0.6F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, -0.5F, -0.5F, 0.6F); // Box 27
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -2F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, -0.2F, 0F, 0.5F); // Box 28
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2F, 0F, -2F, 2, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.4F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, -0.4F, 0.5F); // Box 29
		bodyModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 16

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 16
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 13
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 17
		leftLegModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 20
		leftLegModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 70
		leftLegModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 72
		leftLegModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 5
		leftLegModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 7

		leftLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 17
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -1F, -2F, 2, 8, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 20
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 70
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 8.8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 72
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 7F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(0F, -1F, -2F, 2, 8, 4, 0F,0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, 1F, 1F, -0.3F, 0.7F, 1F, -0.3F, 1F, 2F, 0F, 1.2F); // Box 7
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 19
		rightLegModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 21
		rightLegModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 11
		rightLegModel[3] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 61
		rightLegModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 4
		rightLegModel[5] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 6

		rightLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 19
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(0F, -1F, -2F, 2, 8, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 21
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 8.8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 7F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, -1F, -2F, 2, 8, 4, 0F,0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 0.1F, 0F, 0.5F, 1F, -0.3F, 0.7F, 0F, 0F, 1F, 2F, 0F, 1.2F, 1F, -0.3F, 1F); // Box 6
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}