//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelcuirassImproved extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelcuirassImproved() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];
		leftArmModel = new ModelRendererTurbo[13];
		rightArmModel = new ModelRendererTurbo[13];
		leftLegModel = new ModelRendererTurbo[6];
		rightLegModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 92
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 93
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 96
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 97
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 27
		bodyModel[13] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 30
		bodyModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 32
		bodyModel[18] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 52

		bodyModel[0].addShapeBox(0F, -0.5F, -2F, 4, 2, 4, 0F,-0.5F, -0.2F, 0.5F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.7F, 0F, 0F, 1F); // Box 92
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 1.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 2F, -0.3F, -1F, 0.6F, -0.3F, -1F, 0.8F, 0F, 0F, 1.5F); // Box 93
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 4.5F, -2F, 4, 3, 4, 0F,0F, 0F, 2F, -0.3F, 1F, 0.6F, -0.3F, 1F, 0.8F, 0F, 0F, 1.5F, 0F, 0.51F, 1.8F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.6F, 0F, 0F, 1.2F); // Box 96
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 7.5F, -2F, 4, 3, 4, 0F,0F, -0.5F, 1.8F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.6F, 0F, 0F, 1.2F, 0F, 0.2F, 1.3F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.4F, 0F, 0F, 0.8F); // Box 97
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 11F, -2F, 4, 1, 4, 0F,0F, 0.3F, 1.3F, 0.3F, 1F, 0.2F, 0.3F, 1F, 0.4F, 0F, 0.5F, 0.8F, 0F, -0.8F, 1.8F, 0.4F, -1.8F, 0.5F, 0.4F, -1.8F, 0.6F, 0F, 0F, 1.2F); // Box 1
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -1F, -3F, 1, 2, 4, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 1.5F, 0.1F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.2F, -1.2F, 1.6F, 0F, -1.2F, 1.8F); // Box 2
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0.8F, -1F, -3F, 1, 2, 4, 0F,0.1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 1.5F, 0F, 0.2F, 1F, -1.6F, -0.3F, 0.5F, 1.1F, -0.3F, 0.5F, 0.2F, -1.4F, 1.8F, 0F, -1.2F, 1.6F); // Box 3
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.5F, -0.5F, -2F, 1, 3, 4, 0F,-0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -0.2F, 0F, 0.6F, 0F, 0.3F, 1.5F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, 0F, 0.3F, 1.5F); // Box 17
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 11.2F, -2F, 4, 2, 4, 0F,0F, 0.3F, 1.3F, 0.3F, 1F, 0.2F, 0.3F, 1F, 0.4F, 0F, -0.5F, 0.8F, 0F, 0F, 2F, 1F, -0.6F, 0.8F, 1F, -0.6F, 0.8F, 0F, 0F, 1.2F); // Box 18
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, -0.5F, -2F, 4, 2, 4, 0F,0F, -0.3F, 0.15F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.3F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, -0.2F, 0F, 0.7F); // Box 25
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 1.5F, -2F, 4, 3, 4, 0F,-0.2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, -0.2F, 0F, 0.7F, -0.3F, -1F, 0.6F, 0F, 0F, 2F, 0F, 0F, 1.5F, -0.3F, -1F, 0.8F); // Box 26
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 4.5F, -2F, 4, 3, 4, 0F,-0.3F, 1F, 0.6F, 0F, 0F, 2F, 0F, 0F, 1.5F, -0.3F, 1F, 0.8F, 0.5F, -1F, 0.5F, 0F, 0.51F, 1.8F, 0F, 0F, 1.2F, 0.5F, -1F, 0.6F); // Box 27
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 7.5F, -2F, 4, 3, 4, 0F,0.5F, 1F, 0.5F, 0F, -0.5F, 1.8F, 0F, 0F, 1.2F, 0.5F, 1F, 0.6F, 0.3F, -0.5F, 0.2F, 0F, 0.2F, 1.3F, 0F, 0F, 0.8F, 0.3F, -0.5F, 0.4F); // Box 28
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 11F, -2F, 4, 1, 4, 0F,0.3F, 1F, 0.2F, 0F, 0.3F, 1.3F, 0F, 0.5F, 0.8F, 0.3F, 1F, 0.4F, 0.4F, -1.8F, 0.5F, 0F, -0.8F, 1.8F, 0F, 0F, 1.2F, 0.4F, -1.8F, 0.6F); // Box 29
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 11.2F, -2F, 4, 2, 4, 0F,0.3F, 1F, 0.2F, 0F, 0.3F, 1.3F, 0F, -0.5F, 0.8F, 0.3F, 1F, 0.4F, 1F, -0.6F, 0.8F, 0F, 0F, 2F, 0F, 0F, 1.2F, 1F, -0.6F, 0.8F); // Box 30
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-1F, -1F, -3F, 1, 2, 4, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 1.5F, 0F, 0.2F, 1F, -0.6F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0F, -1.2F, 1.8F, -0.2F, -1.2F, 1.6F); // Box 31
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.8F, -1F, -3F, 1, 2, 4, 0F,-0.7F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 1.5F, 1.1F, -0.3F, 0.5F, -1.6F, -0.3F, 0.5F, 0F, -1.2F, 1.6F, 0.2F, -1.4F, 1.8F); // Box 32
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-3.5F, -0.5F, -2F, 1, 3, 4, 0F,0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.6F, 0F, 0F, 0.5F, -0.2F, 0F, 1.2F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1.5F, -0.2F, 0F, 1.2F); // Box 52
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 4
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 6
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 7
		leftArmModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 8
		leftArmModel[5] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 9
		leftArmModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 10
		leftArmModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 11
		leftArmModel[8] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 12
		leftArmModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 13
		leftArmModel[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 14
		leftArmModel[11] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 15
		leftArmModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 16

		leftArmModel[0].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 4
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 5
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 2F, -2F, 4, 4, 4, 0F,0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F); // Box 6
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 7
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.25F, -2F, -2F, 1, 5, 4, 0F,0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F); // Box 8
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(1.25F, -2F, -2F, 1, 5, 4, 0F,0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F); // Box 9
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, -2F, 0.25F, 4, 5, 1, 0F,0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F); // Box 10
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, -2F, -1.25F, 4, 5, 1, 0F,0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F); // Box 11
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2.55F, -2F, -2.55F, 1, 5, 1, 0F,0F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0F, 0F, 0.3F, 0.1F); // Box 12
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-1.55F, -2F, -2.55F, 1, 5, 1, 0F,-0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0.1F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0F); // Box 13
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-1.55F, -2F, 1.55F, 1, 5, 1, 0F,-0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, 0.1F, 0.3F, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 14
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2.55F, -2F, 1.55F, 1, 5, 1, 0F,0F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0.1F, 0F, 0.3F, 0.1F); // Box 15
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, 3.5F, -2F, 4, 1, 4, 0F,0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F); // Box 16
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 33
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		rightArmModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 35
		rightArmModel[3] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 36
		rightArmModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 37
		rightArmModel[5] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 38
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39
		rightArmModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 40
		rightArmModel[8] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 41
		rightArmModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 42
		rightArmModel[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 43
		rightArmModel[11] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 44
		rightArmModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 45

		rightArmModel[0].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 33
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6F, -2F, 4, 2, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 34
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 2F, -2F, 4, 4, 4, 0F,0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F); // Box 35
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 36
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-2.25F, -2F, -2F, 1, 5, 4, 0F,0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F); // Box 37
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-0.75F, -2F, -2F, 1, 5, 4, 0F,0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F); // Box 38
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, -2F, 0.25F, 4, 5, 1, 0F,0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F); // Box 39
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, -2F, -1.25F, 4, 5, 1, 0F,0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F); // Box 40
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(0.55F, -2F, -2.55F, 1, 5, 1, 0F,0F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0F, 0F, 0.3F, 0.1F); // Box 41
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3.55F, -2F, -2.55F, 1, 5, 1, 0F,-0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0.1F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0F); // Box 42
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3.55F, -2F, 1.55F, 1, 5, 1, 0F,-0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, 0.1F, 0.3F, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 43
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(0.55F, -2F, 1.55F, 1, 5, 1, 0F,0F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0.1F, 0F, 0.3F, 0.1F); // Box 44
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3F, 3.5F, -2F, 4, 1, 4, 0F,0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F); // Box 45
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 20
		leftLegModel[2] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 21
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 23
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 24
		leftLegModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.6F, 0F, 0.6F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 2F, -2F, 4, 3, 4, 0F,0.6F, 0F, 0.6F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 20
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.6F, 0F, 0.6F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 21
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 9F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 23
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.6F, 0.9F, 0.1F, -0.6F, 0.9F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 6F, -2F, 4, 3, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 24
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 46
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 47
		rightLegModel[2] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 48
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 49
		rightLegModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 50
		rightLegModel[5] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 51

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 1F, 0F, 0.6F); // Box 46
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 2F, -2F, 4, 3, 4, 0F,1F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 1F, 0F, 0.6F); // Box 47
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,1F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 1F, 0F, 0.6F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 48
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 9F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 49
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.6F, 0.9F, 0.1F, -0.6F, 0.9F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 50
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 6F, -2F, 4, 3, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 51
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);
	}
}