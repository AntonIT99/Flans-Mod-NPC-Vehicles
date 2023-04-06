//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ThreeFourthArmor
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelThreeFourthArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelThreeFourthArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];
		leftArmModel = new ModelRendererTurbo[15];
		rightArmModel = new ModelRendererTurbo[15];
		leftLegModel = new ModelRendererTurbo[11];
		rightLegModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 12
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 13
		bodyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 14
		bodyModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 20
		bodyModel[7] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 21
		bodyModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 22
		bodyModel[9] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 23
		bodyModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 68
		bodyModel[11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 98
		bodyModel[12] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 99
		bodyModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 100
		bodyModel[14] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 101
		bodyModel[15] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 102
		bodyModel[16] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 103
		bodyModel[17] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 104
		bodyModel[18] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 105
		bodyModel[19] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 106
		bodyModel[20] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 118

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.5F, -2F, 4, 2, 4, 0F,0F, -0.3F, 0.15F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.3F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, -0.2F, 0F, 0.7F); // Box 12
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 1.5F, -2F, 4, 3, 4, 0F,-0.2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, -0.2F, 0F, 0.7F, -0.3F, -1F, 0.8F, 0F, 0F, 2.4F, 0F, 0F, 1.5F, -0.3F, -1F, 0.8F); // Box 13
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 4.5F, -2F, 4, 2, 4, 0F,-0.3F, 1F, 0.8F, 0F, 0F, 2.4F, 0F, 0F, 1.5F, -0.3F, 1F, 0.8F, 0.5F, -1F, 0.7F, 0F, 0.51F, 2.5F, 0F, 0F, 1.6F, 0.5F, -1F, 0.6F); // Box 14
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 6.5F, -2F, 4, 3, 4, 0F,0.5F, 1F, 0.7F, 0F, -0.5F, 2.5F, 0F, 0F, 1.6F, 0.5F, 1F, 0.6F, 0.3F, -0.5F, 0.2F, 0F, 0.2F, 2.2F, 0F, 0F, 1.7F, 0.3F, -0.5F, 0.4F); // Box 15
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 10F, -2F, 4, 1, 4, 0F,0.3F, 1F, 0.2F, 0F, 0.3F, 2.2F, 0F, 0.5F, 1.7F, 0.3F, 1F, 0.4F, 0.9F, -1.6F, 0.5F, 0F, -0.8F, 2.8F, 0F, -0.8F, 2.3F, 0.9F, -1.6F, 0.6F); // Box 16
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 10.5F, -2F, 4, 1, 4, 0F,0.7F, 1.2F, 0.4F, 0F, 0.3F, 2.7F, 0F, 0.5F, 2.2F, 0.7F, 1.2F, 0.5F, 1.4F, -1.2F, 0.7F, 0F, -0.8F, 3.1F, 0F, -0.8F, 2.6F, 1.4F, -1.2F, 0.8F); // Box 20
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 10.9F, -2F, 4, 1, 4, 0F,1.3F, 0.55F, 0.6F, 0F, 0.3F, 2.9F, 0F, 0.5F, 2.3F, 1.3F, 0.55F, 0.7F, 1.7F, -0.8F, 0.8F, 0F, -0.8F, 3.1F, 0F, -0.8F, 2.7F, 1.7F, -0.8F, 0.9F); // Box 21
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 11.4F, -2F, 4, 1, 4, 0F,1.5F, 0.55F, 0.6F, 0F, 0.3F, 3F, 0F, 0.5F, 2.5F, 1.5F, 0.55F, 0.7F, 1.9F, -0.7F, 0.8F, 0F, -0.7F, 3.2F, 0F, -0.7F, 2.7F, 1.9F, -0.7F, 0.9F); // Box 22
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 11.9F, -2F, 4, 1, 4, 0F,1.8F, 0.3F, 0.6F, 0F, 0.3F, 3.1F, 0F, 0.5F, 2.5F, 1.8F, 0.3F, 0.7F, 2F, -0.7F, 0.8F, 0F, -0.7F, 3.2F, 0F, -0.7F, 2.7F, 2F, -0.7F, 0.9F); // Box 23
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, -0.5F, -2.2F, 4, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.4F, 0.5F, 0F, -0.2F, 0.8F, -2F, -0.3F, 1.5F, 0F, 0.2F, 2F, 0F, -0.7F, 1.2F, -2F, -1F, 1F); // Box 68
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, -0.5F, -2.2F, 4, 2, 4, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.8F, 0F, 0.4F, 0.5F, 0F, 0.2F, 2F, -2F, -0.3F, 1.5F, -2F, -1F, 1F, 0F, -0.7F, 1.2F); // Box 98
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 1.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 2.4F, -0.3F, -1F, 0.8F, -0.3F, -1F, 0.8F, 0F, 0F, 1.5F); // Box 99
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 4.5F, -2F, 4, 2, 4, 0F,0F, 0F, 2.4F, -0.3F, 1F, 0.8F, -0.3F, 1F, 0.8F, 0F, 0F, 1.5F, 0F, 0.51F, 2.5F, 0.5F, -1F, 0.7F, 0.5F, -1F, 0.6F, 0F, 0F, 1.6F); // Box 100
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 6.5F, -2F, 4, 3, 4, 0F,0F, -0.5F, 2.5F, 0.5F, 1F, 0.7F, 0.5F, 1F, 0.6F, 0F, 0F, 1.6F, 0F, 0.2F, 2.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F, 0.4F, 0F, 0F, 1.7F); // Box 101
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 10F, -2F, 4, 1, 4, 0F,0F, 0.3F, 2.2F, 0.3F, 1F, 0.2F, 0.3F, 1F, 0.4F, 0F, 0.5F, 1.7F, 0F, -0.8F, 2.8F, 0.9F, -1.6F, 0.5F, 0.9F, -1.6F, 0.6F, 0F, -0.8F, 2.3F); // Box 102
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 10.5F, -2F, 4, 1, 4, 0F,0F, 0.3F, 2.7F, 0.7F, 1.2F, 0.4F, 0.7F, 1.2F, 0.5F, 0F, 0.5F, 2.2F, 0F, -0.8F, 3.1F, 1.4F, -1.2F, 0.7F, 1.4F, -1.2F, 0.8F, 0F, -0.8F, 2.6F); // Box 103
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0F, 10.9F, -2F, 4, 1, 4, 0F,0F, 0.3F, 2.9F, 1.3F, 0.55F, 0.6F, 1.3F, 0.55F, 0.7F, 0F, 0.5F, 2.3F, 0F, -0.8F, 3.1F, 1.7F, -0.8F, 0.8F, 1.7F, -0.8F, 0.9F, 0F, -0.8F, 2.7F); // Box 104
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0F, 11.9F, -2F, 4, 1, 4, 0F,0F, 0.3F, 3.1F, 1.8F, 0.3F, 0.6F, 1.8F, 0.3F, 0.7F, 0F, 0.5F, 2.5F, 0F, -0.7F, 3.2F, 2F, -0.7F, 0.8F, 2F, -0.7F, 0.9F, 0F, -0.7F, 2.7F); // Box 105
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 11.4F, -2F, 4, 1, 4, 0F,0F, 0.3F, 3F, 1.5F, 0.55F, 0.6F, 1.5F, 0.55F, 0.7F, 0F, 0.5F, 2.5F, 0F, -0.7F, 3.2F, 1.9F, -0.7F, 0.8F, 1.9F, -0.7F, 0.9F, 0F, -0.7F, 2.7F); // Box 106
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, -0.5F, -2F, 4, 2, 4, 0F,-0.5F, -0.2F, 0.5F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.7F, 0F, 0F, 1F); // Box 118
		bodyModel[20].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 57
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 58
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 102
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 103
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 104
		leftArmModel[5] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 57
		leftArmModel[6] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 72
		leftArmModel[7] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 61
		leftArmModel[8] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 62
		leftArmModel[9] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 60
		leftArmModel[10] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 62
		leftArmModel[11] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 99
		leftArmModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 69
		leftArmModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 70
		leftArmModel[14] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 82

		leftArmModel[0].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 58
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -1.5F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 102
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -0.5F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 103
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 0.5F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 104
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0F, -2.1F, -2F, 3, 2, 4, 0F,1.3F, 0.7F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0.7F, 0.8F, -0.5F, 1.3F, 1.1F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 3.3F, 1.5F); // Box 57
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-4.59F, -2.1F, -1.99F, 2, 2, 4, 0F,-1.7F, -1F, 1.3F, 1.31F, 0.7F, 0.3F, 2.1F, 0.7F, 0.8F, 0F, -1F, 1F, -1.1F, 0.5F, 2F, 3.1F, -1.5F, 0.4F, 2.1F, 3.3F, 1.5F, -1.5F, 3F, 1.3F); // Box 72
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, -1F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 61
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-1F, 0F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 62
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-1F, 5.9F, -2F, 4, 2, 4, 0F,0.2F, 0.7F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 60
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-1F, 1.4F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 62
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-0.5F, 3.9F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F); // Box 99
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(-3F, -0.1F, -3F, 2, 2, 1, 0F,0.5F, -0.5F, 1F, 0F, 0.8F, 0F, 0F, -0.5F, 0F, 0.7F, -0.2F, 0F, 0F, 0.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -1.5F, 0F, 0.7F, -1.5F); // Box 69
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(-1F, -0.1F, -3F, 2, 2, 1, 0F,0F, 0.8F, 0F, -0.5F, 1.5F, -0.6F, 0F, 1F, 0.5F, 0F, -0.2F, 0F, 0F, 1.5F, 1.5F, 0F, 0.5F, 0.3F, 0F, 0.7F, 0F, 0F, 1.5F, -1.5F); // Box 70
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(-1F, 1F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 82
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 57
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 58
		rightArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 59
		rightArmModel[3] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 60
		rightArmModel[4] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 87
		rightArmModel[5] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 88
		rightArmModel[6] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 89
		rightArmModel[7] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 90
		rightArmModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 91
		rightArmModel[9] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 92
		rightArmModel[10] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 93
		rightArmModel[11] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 94
		rightArmModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 95
		rightArmModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 96
		rightArmModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 97

		rightArmModel[0].addShapeBox(2.41F, -2.1F, -1.99F, 2, 2, 4, 0F,1.31F, 0.7F, 0.3F, -1.7F, -1F, 1.3F, 0F, -1F, 1F, 2.1F, 0.7F, 0.8F, 3.1F, -1.5F, 0.4F, -0.9F, 0.5F, 2F, -1.5F, 3F, 1.3F, 2.1F, 3.3F, 1.5F); // Box 57
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(1F, -0.1F, -3F, 2, 2, 1, 0F,0F, 0.8F, 0F, 0.5F, -0.5F, 1F, 0.7F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.7F, -1.5F, 0F, 1.5F, -1.5F); // Box 58
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-1F, -0.1F, -3F, 2, 2, 1, 0F,-0.5F, 1.5F, -0.6F, 0F, 0.8F, 0F, 0F, -0.2F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.3F, 0F, 1.5F, 1.5F, 0F, 1.5F, -1.5F, 0F, 0.7F, 0F); // Box 59
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.3F, 1.3F, 0.7F, 0.3F, 0.5F, 0.7F, 0.8F, 0.3F, 0.3F, 0.3F, 0.5F, 0F, 0.3F, -0.5F, 1.3F, 1.1F, 0.5F, 3.3F, 1.5F, 0.5F, 0F, 0.3F); // Box 60
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, -1F, -2F, 4, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 87
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, -1.5F, -2F, 4, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 88
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, -0.5F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 89
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 0F, -2F, 4, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 90
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 0.5F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 91
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, 1F, -2F, 4, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 92
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3F, 1.4F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 93
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3.5F, 3.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F); // Box 94
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3F, 5.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 95
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 96
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 97
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 107
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 108
		leftLegModel[2] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 109
		leftLegModel[3] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 110
		leftLegModel[4] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 111
		leftLegModel[5] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 112
		leftLegModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 113
		leftLegModel[7] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 114
		leftLegModel[8] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 115
		leftLegModel[9] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 116
		leftLegModel[10] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 117

		leftLegModel[0].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 107
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F); // Box 108
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 109
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 4.5F, -2.8F, 5, 1, 5, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 110
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 5.5F, -2.8F, 5, 1, 5, 0F,0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 111
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 0.5F, -2F, 4, 1, 3, 0F,0F, 0.3F, 2.5F, 1.9F, 0.4F, 0.6F, 1.9F, 0.4F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.4F, 2.5F, 2F, -0.4F, 0.8F, 2F, -0.4F, 0.5F, 0F, -0.4F, 0.5F); // Box 112
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 1.5F, -2F, 4, 1, 3, 0F,0F, 0.4F, 2.3F, 1.7F, 0.4F, 0.6F, 1.7F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, -0.6F, 2.3F, 1.8F, -0.6F, 0.8F, 1.8F, -0.6F, 0.5F, 0F, -0.6F, 0.5F); // Box 113
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 2.5F, -2F, 4, 1, 3, 0F,0F, 0.6F, 2.1F, 1.6F, 0.6F, 0.6F, 1.6F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, -0.6F, 2.1F, 1.7F, -0.6F, 0.8F, 1.7F, -0.6F, 0.5F, 0F, -0.6F, 0.5F); // Box 114
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 3.5F, -2F, 4, 1, 3, 0F,0F, 0.6F, 1.9F, 1.5F, 0.6F, 0.6F, 1.5F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, -0.6F, 1.9F, 1.6F, -0.6F, 0.8F, 1.6F, -0.6F, 0.5F, 0F, -0.6F, 0.5F); // Box 115
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2F, 4.5F, -2F, 4, 1, 3, 0F,0F, 0.6F, 1.6F, 1.4F, 0.6F, 0.6F, 1.4F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, -0.6F, 1.6F, 1.5F, -0.6F, 0.8F, 1.5F, -0.6F, 0.5F, 0F, -0.6F, 0.5F); // Box 116
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-2F, -0.199999999999999F, -2F, 4, 8, 4, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 11
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 60
		rightLegModel[2] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 61
		rightLegModel[3] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 21
		rightLegModel[4] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 78
		rightLegModel[5] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 24
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 74
		rightLegModel[7] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 78
		rightLegModel[8] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 79
		rightLegModel[9] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 80
		rightLegModel[10] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 81

		rightLegModel[0].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F, 0.7F, 0.2F, 0.7F); // Box 60
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3F, 4.5F, -2.8F, 5, 1, 5, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 21
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-3F, 5.5F, -2.8F, 5, 1, 5, 0F,0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 78
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 0.5F, -2F, 4, 1, 3, 0F,1.9F, 0.4F, 0.6F, 0F, 0.3F, 2.5F, 0F, 0.5F, 0.5F, 1.9F, 0.4F, 0.5F, 2F, -0.4F, 0.8F, 0F, -0.4F, 2.5F, 0F, -0.4F, 0.5F, 2F, -0.4F, 0.5F); // Box 24
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 1.5F, -2F, 4, 1, 3, 0F,1.7F, 0.4F, 0.6F, 0F, 0.4F, 2.3F, 0F, 0.4F, 0.5F, 1.7F, 0.4F, 0.5F, 1.8F, -0.6F, 0.8F, 0F, -0.6F, 2.3F, 0F, -0.6F, 0.5F, 1.8F, -0.6F, 0.5F); // Box 74
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 2.5F, -2F, 4, 1, 3, 0F,1.6F, 0.6F, 0.6F, 0F, 0.6F, 2.1F, 0F, 0.6F, 0.5F, 1.6F, 0.6F, 0.5F, 1.7F, -0.6F, 0.8F, 0F, -0.6F, 2.1F, 0F, -0.6F, 0.5F, 1.7F, -0.6F, 0.5F); // Box 78
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 3.5F, -2F, 4, 1, 3, 0F,1.5F, 0.6F, 0.6F, 0F, 0.6F, 1.9F, 0F, 0.6F, 0.5F, 1.5F, 0.6F, 0.5F, 1.6F, -0.6F, 0.8F, 0F, -0.6F, 1.9F, 0F, -0.6F, 0.5F, 1.6F, -0.6F, 0.5F); // Box 79
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, 4.5F, -2F, 4, 1, 3, 0F,1.4F, 0.6F, 0.6F, 0F, 0.6F, 1.6F, 0F, 0.6F, 0.5F, 1.4F, 0.6F, 0.5F, 1.5F, -0.6F, 0.8F, 0F, -0.6F, 1.6F, 0F, -0.6F, 0.5F, 1.5F, -0.6F, 0.5F); // Box 80
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2F, -0.199999999999999F, -2F, 4, 8, 4, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);
	}
}