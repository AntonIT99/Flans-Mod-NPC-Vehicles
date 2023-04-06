//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MingKuyak
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingKuyak extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelMingKuyak() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 22
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 42
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 43
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 45
		bodyModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 46
		bodyModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 47
		bodyModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 211
		bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 40
		bodyModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 41
		bodyModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 29

		bodyModel[0].addShapeBox(0F, 1.5F, -2.7F, 4, 2, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 35
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F); // Box 22
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 4.5F, -2.5F, 4, 5, 5, 0F,-0.2F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, -0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 42
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 3.5F, -2.5F, 4, 1, 5, 0F,-0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.2F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 43
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F); // Box 44
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 1.5F, 1.7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 45
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.5F, 1.5F, -2.6F, 1, 8, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 46
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, 0F, -2.5F, 2, 1, 5, 0F,-0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F); // Box 47
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-6F, -0.7F, -3F, 6, 2, 1, 0F,0F, -0.2F, -0.5F, 0.5F, 0.3F, -0.5F, 1.5F, 0.3F, 4.5F, 0.5F, -0.2F, 4.5F, -1F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 5F, -1F, 0F, 5F); // Box 211
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.5F, 1F, -3.5F, 1, 1, 1, 0F,1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F); // Box 40
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 1F, -3.5F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.2F, 1.2F, -1.2F, -0.2F, 1.2F, -1.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.7F, 0.8F, -0.2F, 0.7F, 0.8F, -0.2F, 0F, -0.2F, -0.2F); // Box 41
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 4.5F, -2.5F, 4, 5, 5, 0F,0.5F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F); // Box 13
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 3.5F, -2.5F, 4, 1, 5, 0F,0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.5F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 14
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 1.5F, -2.7F, 4, 2, 1, 0F,0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 15
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 0F, -2.5F, 2, 1, 5, 0F,0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 16
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 1.5F, 1.7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 17
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, -0.7F, -3F, 6, 2, 1, 0F,0.5F, 0.3F, -0.5F, 0F, -0.2F, -0.5F, 0.5F, -0.2F, 4.5F, 1.5F, 0.3F, 4.5F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 5F, 1F, 0.5F, 5F); // Box 18
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.3F, 10.5F, 1.6F, 4, 3, 1, 0F,0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F); // Box 28
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.2F, 10.5F, 1.6F, 4, 3, 1, 0F,0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F); // Box 29
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		leftLegModel[1] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 22
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 26
		leftLegModel[3] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 27

		leftLegModel[0].addShapeBox(-1.7F, -1.5F, -2.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 50
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.7F, -1.5F, -2.6F, 4, 3, 1, 0F,0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0.2F, 0.7F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F, -1.2F, 0.3F, 0.2F, -1.2F); // Box 22
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.7F, -1.5F, 1.6F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 26
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.7F, -1.5F, 1.6F, 4, 3, 1, 0F,0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F); // Box 27
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 20
		rightLegModel[1] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 23
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		rightLegModel[3] = new ModelRendererTurbo(this, 13, 25, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2.2F, -1.5F, -2.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.2F, 0F, 0F, -1.2F); // Box 20
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.2F, -1.5F, -2.6F, 4, 3, 1, 0F,0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0.2F, 0.7F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F, -1.2F, 0.3F, 0.2F, -1.2F); // Box 23
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.2F, -1.5F, 1.6F, 4, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 24
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.2F, -1.5F, 1.6F, 4, 3, 1, 0F,0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.2F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F); // Box 25
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}