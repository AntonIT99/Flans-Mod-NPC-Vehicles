//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: QingElite
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelQingElite extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelQingElite() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[5];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 27
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 20
		bodyModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 52
		bodyModel[7] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 53
		bodyModel[8] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 26
		bodyModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 30
		bodyModel[13] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 34
		bodyModel[16] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 35
		bodyModel[17] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 36
		bodyModel[18] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 38

		bodyModel[0].addShapeBox(-4F, 7.7F, -2F, 8, 1, 4, 0F,0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.3F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.2F, -2F, 7, 8, 4, 0F,0.7F, 0.1F, 0.5F, -3F, 0.1F, 0.5F, -3F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0.5F, 0.5F, 0.5F, -3F, 0.5F, 0.5F, -3F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 10F, -2F, 8, 1, 4, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, -0.2F, -2F, 7, 8, 4, 0F,0F, 0.1F, 0.4F, -2.3F, 0.1F, 0.5F, -2.3F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.5F, 0.4F, -2.5F, 0.5F, 0.5F, -2.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 27
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-1.5F, 0.5F, -3F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 19
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, -1.2F, -2.7F, 3, 2, 5, 0F,0F, 0.5F, 0F, 0.1F, -0.8F, 0F, 0F, 0.6F, -0.2F, 0F, 0.5F, -0.3F, 1F, -1F, 0.2F, -1F, 0.5F, 0.4F, 0F, 0F, -0.1F, 1F, 0F, -0.1F); // Box 20
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5F, -1F, 1.8F, 10, 1, 1, 0F,3F, 0F, 1F, 3F, 0F, 1F, 3F, -0.3F, -0.3F, 3F, -0.3F, -0.3F, 2F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0.2F, 3F, 0F, 0.2F); // Box 52
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-8F, 0F, 2F, 16, 4, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 53
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-10.5F, -4.5F, -3F, 21, 21, 1, 0F,-7.5F, -7.5F, -0.3F, -7.5F, -7.5F, -0.3F, -7.5F, -7.5F, -0.3F, -7.5F, -7.5F, -0.3F, -8F, -8F, -0.3F, -8F, -8F, -0.3F, -8F, -8F, -0.3F, -8F, -8F, -0.3F); // Box 26
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 2F, -3F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 27
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.5F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2.5F, 4F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.3F, -0.5F, 0.5F, 0.3F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 29
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2.5F, 8F, -3F, 1, 1, 1, 0F,0.5F, 0.5F, 0.3F, -0.5F, 0.5F, 0.3F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 30
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-1.5F, 9F, -3F, 3, 1, 1, 0F,0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F); // Box 31
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-10.5F, -4.5F, 2F, 21, 21, 1, 0F,-7.5F, -7.5F, -0.3F, -7.5F, -7.5F, -0.3F, -7.5F, -7.5F, -0.3F, -7.5F, -7.5F, -0.3F, -8F, -8F, -0.3F, -8F, -8F, -0.3F, -8F, -8F, -0.3F, -8F, -8F, -0.3F); // Box 33
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.5F, 0F, -3F, 1, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.5F, 4F, -3F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 35
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.5F, 8F, -3F, 1, 1, 1, 0F,-0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 36
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0F, -1.2F, -2.7F, 3, 2, 5, 0F,0.1F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, 0F, 0.6F, -0.2F, -1F, 0.5F, 0.4F, 1F, -1F, 0.2F, 1F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 38
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 6
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 18
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 212

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 7, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.6F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.6F, 0.3F); // Box 6
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 5F, -2F, 4, 3, 4, 0F,0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.4F, 0.7F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.4F, 0.7F, 0.4F); // Box 18
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1.5F, -3.7F, -3.1F, 4, 3, 1, 0F,0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, -0.8F, 3F, 1.5F, -0.7F, 3F, 0.5F, 0.5F, -0.5F, -1.5F, 0F, -0.5F, -1F, 0F, 5F, 1F, 0.5F, 5F); // Box 212
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 17
		rightArmModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 211
		rightArmModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 25
		rightArmModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 37

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 7, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.3F, 0.3F, 0.6F, 0.3F, 0.3F, 0.6F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5F, -2F, 4, 3, 4, 0F,0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.4F, 0.4F, 0.4F, 0.4F, 0.7F, 0.4F, 0.4F, 0.7F, 0.4F, 0.4F, 0.4F, 0.4F); // Box 17
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.5F, -3.7F, -3.1F, 4, 3, 1, 0F,0F, -1F, -0.5F, 0.5F, -1F, -0.5F, 1.5F, -0.7F, 3F, 0.5F, -0.8F, 3F, -1.5F, 0F, -0.4F, 0.5F, 0.5F, -0.4F, 1F, 0.5F, 5F, -1F, 0F, 5F); // Box 211
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(2.5F, -3.7F, -3.1F, 1, 3, 1, 0F,0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0.5F, -0.8F, 3F, 1.5F, -0.7F, 3F, 0.5F, 0.5F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 5F, 1F, 0.5F, 5F); // Box 25
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(6.5F, -3.7F, -3.1F, 1, 3, 1, 0F,0F, -1F, -0.5F, 0.5F, -1F, -0.5F, 1.5F, -0.7F, 3F, 0.5F, -0.8F, 3F, -0.5F, 0F, -0.4F, 0.5F, 0.5F, -0.4F, 1F, 0.5F, 5F, -0.5F, 0F, 5F); // Box 37
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 5
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 70
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 16

		leftLegModel[0].addShapeBox(-2F, -1.5F, -2F, 4, 9, 4, 0F,1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0.7F, -0.2F, 1.2F, 1.5F, -0.5F, 0.7F, 1.5F, -0.5F, 0.7F, 0.7F, -0.2F, 1.2F); // Box 5
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 70
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 5.5F, -2F, 4, 6, 4, 0F,1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 0.7F, 0F, 1.2F, 1.5F, -1F, 0.7F, 1.5F, -1F, 0.7F, 0.7F, 0F, 1.2F); // Box 16
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 11
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 15

		rightLegModel[0].addShapeBox(-2F, -1.5F, -2F, 4, 9, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 1.6F, -0.5F, 0.7F, -0.3F, -0.2F, 0.8F, -0.3F, -0.2F, 0.8F, 1.6F, -0.5F, 0.7F); // Box 4
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 5.5F, -2F, 4, 6, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 1.6F, -1F, 0.7F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, 1.6F, -1F, 0.7F); // Box 15
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}