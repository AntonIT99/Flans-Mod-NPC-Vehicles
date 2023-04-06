//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Musketeer
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMusketeer extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMusketeer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];
		leftArmModel = new ModelRendererTurbo[14];
		rightArmModel = new ModelRendererTurbo[14];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 59
		bodyModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 62
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 63
		bodyModel[4] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 64
		bodyModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 65
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 66
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 87
		bodyModel[8] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 88
		bodyModel[9] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 89
		bodyModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 90
		bodyModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 91
		bodyModel[12] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 92
		bodyModel[13] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 93
		bodyModel[14] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 94
		bodyModel[15] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 95
		bodyModel[16] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 96
		bodyModel[17] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 97
		bodyModel[18] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 98
		bodyModel[19] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 99
		bodyModel[20] = new ModelRendererTurbo(this, 77, 48, textureX, textureY); // Box 100

		bodyModel[0].addShapeBox(0F, -1F, -3.5F, 2, 2, 5, 0F,0.2F, 0.1F, -0.3F, 1.5F, 0F, -0.7F, 0.6F, 0.2F, 1.2F, 0F, 0.2F, 0.7F, -1.6F, -0.3F, 0.2F, 2.5F, -1.3F, -0.8F, 0.8F, -1F, 1.5F, 0F, -0.8F, 1.3F); // Box 3
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2F, -1F, -3.5F, 2, 2, 5, 0F,1.5F, 0F, -1.3F, 0.2F, 0.1F, -0.3F, 0F, 0.2F, 0.7F, 0.6F, 0.2F, 1.2F, 2.5F, -1.3F, -0.8F, -1.6F, -0.3F, 0.2F, 0F, -0.8F, 1.3F, 0.8F, -1F, 1.5F); // Box 59
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2F, 4, 8, 4, 0F,0.5F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0.5F, 0.1F, 0.2F); // Box 62
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-7F, 0F, -2F, 2, 3, 4, 0F,0F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0F, 0.2F, -1F, -0.9F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, -1F, -0.9F, 0.2F); // Box 63
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 8F, -2F, 4, 5, 4, 0F,0.2F, -0.1F, 0F, 0F, -1.1F, 0.2F, 0F, -1.1F, 0.2F, 0.2F, -0.1F, 0F, 1F, 0.5F, 0.5F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 1F, 0.5F, 0.5F); // Box 64
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-1F, 0F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 65
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 1F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F); // Box 66
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(5F, 0F, -2F, 2, 3, 4, 0F,0.5F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.1F, 0.2F, -1F, -0.9F, 0.2F, -1F, -0.9F, 0.2F, 0.5F, 0.1F, 0.2F); // Box 87
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, -2F, 4, 8, 4, 0F,0F, 1F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 1F, 0.2F, 0F, 1.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0F, 1.1F, 0.2F); // Box 88
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 8F, -2F, 4, 5, 4, 0F,0F, -1.1F, 0.2F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0F, -1.1F, 0.2F, 0F, 1.5F, 1F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 0F, 1.5F, 1F); // Box 89
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 1.5F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 90
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 2.5F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F); // Box 91
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 3F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 92
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-1F, 4F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F); // Box 93
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1F, 4.5F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 94
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1F, 5.5F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F); // Box 95
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-1F, 6F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 96
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1F, 7F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F); // Box 97
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1F, 7.5F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F); // Box 98
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-1F, 8.5F, -2.7F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F); // Box 99
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 7.7F, -2F, 8, 2, 4, 0F,0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F, 0.8F, 0F, 0.4F); // Box 100
		bodyModel[20].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 73
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 74
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 75
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 76
		leftArmModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 77
		leftArmModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 78
		leftArmModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 79
		leftArmModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 80
		leftArmModel[8] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 81
		leftArmModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 82
		leftArmModel[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 83
		leftArmModel[11] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 84
		leftArmModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 85
		leftArmModel[13] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 86

		leftArmModel[0].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 73
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 74
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 2F, -2F, 4, 4, 4, 0F,0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F); // Box 75
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 76
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.25F, -2F, -2F, 1, 5, 4, 0F,0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F); // Box 77
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(1.25F, -2F, -2F, 1, 5, 4, 0F,0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.4F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F, 0.1F, 0.3F, 0.6F); // Box 78
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, -2F, 0.25F, 4, 5, 1, 0F,0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F); // Box 79
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, -2F, -1.25F, 4, 5, 1, 0F,0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.4F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F, 0.6F, 0.3F, 0.1F); // Box 80
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2.55F, -2F, -2.55F, 1, 5, 1, 0F,0F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0F, 0F, 0.3F, 0.1F); // Box 81
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-1.55F, -2F, -2.55F, 1, 5, 1, 0F,-0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, 0F, -0.1F, 0.3F, 0F, 0.1F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0F); // Box 82
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-1.55F, -2F, 1.55F, 1, 5, 1, 0F,-0.1F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, 0.1F, 0.3F, 0F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F); // Box 83
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2.55F, -2F, 1.55F, 1, 5, 1, 0F,0F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, 0.1F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0.1F, 0F, 0.3F, 0.1F); // Box 84
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-1F, 3.5F, -2F, 4, 1, 4, 0F,0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.6F, 0.2F, 0.6F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F, 0.4F, -0.5F, 0.4F); // Box 85
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-1F, 5.4F, -2F, 4, 2, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 86
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 33
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		rightArmModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 35
		rightArmModel[3] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 36
		rightArmModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 37
		rightArmModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 38
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39
		rightArmModel[7] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 40
		rightArmModel[8] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 41
		rightArmModel[9] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 42
		rightArmModel[10] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 43
		rightArmModel[11] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 44
		rightArmModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 45
		rightArmModel[13] = new ModelRendererTurbo(this, 60, 50, textureX, textureY); // Box 58

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

		rightArmModel[13].addShapeBox(-3F, 5.4F, -2F, 4, 2, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 58
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 68
		leftLegModel[1] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 69
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 70
		leftLegModel[3] = new ModelRendererTurbo(this, 83, 36, textureX, textureY); // Box 71
		leftLegModel[4] = new ModelRendererTurbo(this, 4, 51, textureX, textureY); // Box 72

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 68
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 69
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 70
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 5.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F); // Box 71
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 72
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 7
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 8
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		rightLegModel[3] = new ModelRendererTurbo(this, 83, 36, textureX, textureY); // Box 60
		rightLegModel[4] = new ModelRendererTurbo(this, 4, 51, textureX, textureY); // Box 61

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 7
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 5.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F); // Box 60
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}