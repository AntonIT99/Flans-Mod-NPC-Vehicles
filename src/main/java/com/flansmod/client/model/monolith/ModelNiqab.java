//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Niqab
// Model Creator: 
// Created on: 26.03.2020 - 09:48:43
// Last changed on: 26.03.2020 - 09:48:43

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNiqab extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 512;

	public ModelNiqab() //Same as Filename
	{
		headModel = new ModelRendererTurbo[25];
		bodyModel = new ModelRendererTurbo[23];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[10];
		rightLegModel = new ModelRendererTurbo[10];
		skirtFrontModel = new ModelRendererTurbo[3];
		skirtRearModel = new ModelRendererTurbo[3];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box15
		headModel[1] = new ModelRendererTurbo(this, 41, 121, textureX, textureY); // Box 24
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		headModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 28
		headModel[4] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 29
		headModel[5] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 30
		headModel[6] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 31
		headModel[7] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 32
		headModel[8] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 33
		headModel[9] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 34
		headModel[10] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 35
		headModel[11] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 36
		headModel[12] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 39
		headModel[13] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 40
		headModel[14] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 41
		headModel[15] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 42
		headModel[16] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 43
		headModel[17] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 45
		headModel[18] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 46
		headModel[19] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 47
		headModel[20] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 48
		headModel[21] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Box 24
		headModel[22] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 25
		headModel[23] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 26
		headModel[24] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 27

		headModel[0].addShapeBox(-4F, -8.5F, -4F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -8.5F, -4F, 1, 8, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 24
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -4.5F, -4.6F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, -0.4F, 0.2F, 0.3F, -0.4F, 0.2F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 27
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3F, -4.5F, -4.6F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0.2F, 0.3F, -0.4F); // Box 28
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -2.7F, -4.6F, 4, 5, 1, 0F,0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 29
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, 2.3F, -4.6F, 8, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 30
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -1F, -1F, 1, 2, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 31
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -1F, -4F, 1, 2, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 32
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -1F, 1F, 1, 2, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 33
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -8.5F, 3.5F, 8, 11, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 34
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, 2.3F, 3.5F, 8, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 35
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, 1F, -4F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 36
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3.5F, -8.5F, -4F, 1, 8, 8, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 39
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3.5F, -1F, 1F, 1, 2, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 40
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.5F, -1F, -1F, 1, 2, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 41
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3.5F, -1F, -4F, 1, 2, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(3.5F, 1F, -4F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 43
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.5F, 1F, 0.9F, 1, 1, 3, 0F,1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 45
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4.5F, 2.3F, 0.9F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F); // Box 46
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(3.5F, 1F, 0.9F, 1, 1, 3, 0F,-0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 47
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3.5F, 2.3F, 0.9F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 48
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(0F, -2.7F, -4.6F, 4, 5, 1, 0F,0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 24
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4F, -8.7F, -4.6F, 4, 5, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.4F); // Box 25
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(0F, -8.7F, -4.6F, 4, 5, 1, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.8F, -0.4F); // Box 26
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4F, -9F, -4F, 8, 1, 8, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 27
		headModel[24].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box15
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box20
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box34
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box36
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import Box37
		bodyModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box38
		bodyModel[6] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box40
		bodyModel[7] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import Box41
		bodyModel[8] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import Box43
		bodyModel[9] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import Box44
		bodyModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box34
		bodyModel[11] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import Box35
		bodyModel[12] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Import Box36
		bodyModel[13] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Import Box37
		bodyModel[14] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Import Box38
		bodyModel[15] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 30
		bodyModel[17] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 41
		bodyModel[20] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 43
		bodyModel[21] = new ModelRendererTurbo(this, 17, 257, textureX, textureY); // Box 44
		bodyModel[22] = new ModelRendererTurbo(this, 49, 257, textureX, textureY); // Box 47

		bodyModel[0].addShapeBox(-4.5F, 7.5F, -3.4F, 9, 3, 5, 0F,-0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, -0.2F, 0F, 1.6F, -0.2F, 0F, 1.6F); // Import Box15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9.5F, -2.5F, 8, 3, 4, 0F,0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -2.8F, 0F, -0.7F, -2.8F, 0F, -0.7F, 0.1F, -2F, 1F, 0.1F, -2F, 1F); // Import Box20
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, 8.5F, -3F, 9, 1, 5, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Import Box34
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, 2.5F, -3F, 7, 4, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F); // Import Box36
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, 6F, -3F, 6, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.1F, 1F, 0F, 0.1F); // Import Box37
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 0.5F, -2.5F, 7, 2, 4, 0F,-0.5F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0.3F, -0.5F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Import Box38
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.5F, 1F, -2.5F, 3, 2, 1, 0F,-0.5F, -0.8F, 0.3F, 0F, -0.8F, 0.3F, 0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F); // Import Box40
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, 3.01F, -2.5F, 3, 1, 1, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0.5F, 0F, -1F, -0.5F, 0F, -1F); // Import Box41
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0.5F, 3F, -2.5F, 3, 1, 1, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, -0.4F, 0.7F, -0.5F, -0.4F, 0.7F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Import Box43
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.5F, 1.01F, -2.5F, 3, 2, 1, 0F,0F, -0.8F, 0.3F, -0.5F, -0.8F, 0.3F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0.5F, 0F, -1F); // Import Box44
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 0.1F, -1.5F, 4, 5, 3, 0F,0F, -0.2F, 0F, -1.5F, 0.3F, 0F, -2.5F, 0.3F, 0.5F, 0F, -0.2F, 0.2F, -1.3F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1.3F, 0F, -1F); // Import Box34
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 0.1F, -1F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.2F, 0.7F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0.7F, 0.7F, 0F, 0F); // Import Box35
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, 0.1F, -1.5F, 4, 5, 3, 0F,-1.5F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, -2.5F, 0.3F, 0.5F, 0F, -1F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, -1F, -1F, -2F, 0F); // Import Box36
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 0.1F, -1F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -2F, 0F, 0.5F, 0F, 1F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1F, -1F, 0.7F); // Import Box37
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.5F, -2.5F, -1.2F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box38
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 4.5F, -3F, 7, 4, 4, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.2F, -1F, 0.2F, -0.2F, -1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.5F, 10.5F, -1.4F, 9, 3, 3, 0F,0.2F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, -0.2F, 0F, 1.6F, -0.2F, 0F, 1.6F, 0.4F, -1F, -1.2F, 0.4F, -1F, -1.2F, 0F, -1.8F, 2.2F, 0F, -1.8F, 2.2F); // Box 30
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4.5F, -0.5F, -1.5F, 4, 3, 3, 0F,0F, -0.2F, 0F, -1.5F, 0.3F, 0F, -1F, 0.3F, 0.5F, 0F, -0.2F, 0.4F, -0.3F, 0.5F, 2F, 0F, 0.5F, 2.5F, 0F, 0F, 1F, -0.3F, 0F, 1F); // Box 31
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.5F, -0.5F, -1.5F, 4, 3, 3, 0F,-1.5F, 0.3F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.4F, -1F, 0.3F, 0.5F, 0F, 0.5F, 2.5F, -0.3F, 0.5F, 2F, -0.3F, 0F, 1F, 0F, 0F, 1F); // Box 32
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4.5F, 3.5F, -1.5F, 4, 3, 3, 0F,-0.3F, 0.5F, 2F, 0F, 0.5F, 2.5F, 0F, 1F, 1F, -0.3F, 1F, 1F, 0F, -1.2F, 1.5F, 0F, 0.3F, 2F, 0F, 0.3F, 1.4F, 0F, -1.2F, 1.3F); // Box 41
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1F, 3.5F, -1.5F, 2, 3, 3, 0F,0F, 0.5F, 2.6F, 0F, 0.5F, 2.6F, 0F, 1F, 1.2F, 0F, 1F, 1.2F, 1F, 0.3F, 2F, 1F, 0.3F, 2F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F); // Box 43
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1F, -0.5F, -1.5F, 2, 3, 3, 0F,1F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.5F, 0.7F, 1F, 0.5F, 0.7F, 0F, 0.5F, 2.6F, 0F, 0.5F, 2.6F, 0F, 0F, 1.2F, 0F, 0F, 1.2F); // Box 44
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.5F, 3.5F, -1.5F, 4, 3, 3, 0F,0F, 0.5F, 2.5F, -0.3F, 0.5F, 2F, -0.3F, 1F, 1F, 0F, 1F, 1F, 0F, 0.3F, 2F, 0F, -1.2F, 1.5F, 0F, -1.2F, 1.3F, 0F, 0.3F, 1.4F); // Box 47
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box31
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import Box32
		leftArmModel[2] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import Box33
		leftArmModel[3] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 48
		leftArmModel[4] = new ModelRendererTurbo(this, 33, 265, textureX, textureY); // Box 50

		leftArmModel[0].addShapeBox(-1.5F, -2F, -1.5F, 3, 3, 3, 0F,0F, 0F, 0F, -0.2F, -1F, -0.6F, -0.2F, -1F, -0.6F, 0F, 0F, 0F, -1F, 0F, -0.3F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -1F, 0F, -0.3F); // Import Box31
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.55F, 4F, -1F, 2, 6, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Import Box32
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.8F, 0F, -1F, 2, 4, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F); // Import Box33
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-2F, -1.5F, -1.5F, 3, 4, 3, 0F,-1.5F, 0.3F, 0F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.2F, -1F, 0.3F, 0.5F, 0F, 1.5F, 1.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0F, 0.5F, 0F, 1F, 1F); // Box 48
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.55F, 4F, -1F, 2, 5, 2, 0F,0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.5F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F); // Box 50
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Import Box20
		rightArmModel[1] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import Box29
		rightArmModel[2] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Import Box30
		rightArmModel[3] = new ModelRendererTurbo(this, 33, 257, textureX, textureY); // Box 45
		rightArmModel[4] = new ModelRendererTurbo(this, 17, 265, textureX, textureY); // Box 49

		rightArmModel[0].addShapeBox(-1.5F, -2F, -1.5F, 3, 3, 3, 0F,-0.2F, -1F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -1F, -0.6F, -0.2F, 0F, -0.4F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -0.2F, 0F, -0.4F); // Import Box20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1.2F, 0F, -1F, 2, 4, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Import Box29
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-1.55F, 4F, -1F, 2, 6, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Import Box30
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-1F, -1.5F, -1.5F, 3, 4, 3, 0F,0.5F, -0.2F, -0.5F, -1.5F, 0.3F, 0F, -1F, 0.3F, 0.5F, 0.5F, -0.2F, -0.2F, 0.7F, 0.5F, 0.5F, 0F, 1.5F, 1.5F, 0F, 1F, 1F, 0.7F, 0F, 0.5F); // Box 45
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-1.55F, 4F, -1F, 2, 5, 2, 0F,0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.5F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F); // Box 49
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Import Box17
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import Box18
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Import Box19
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Import Box21
		leftLegModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Import Box22
		leftLegModel[5] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import Box23
		leftLegModel[6] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Import Box32
		leftLegModel[7] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Import Box33
		leftLegModel[8] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 37
		leftLegModel[9] = new ModelRendererTurbo(this, 9, 233, textureX, textureY); // Box 38

		leftLegModel[0].addShapeBox(-1F, 0.4F, 1F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Import Box17
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.7F, 0F, -2F, 4, 6, 4, 0F,-0.4F, 0F, 0.2F, 0.2F, 2.5F, 0.5F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.2F, 0F, 0F); // Import Box18
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.7F, 6F, -2F, 3, 6, 4, 0F,-0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.2F, 0F, 0F); // Import Box19
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1F, -2.6F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Import Box21
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-3F, 0.4F, 1F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, -0.5F, -1F); // Import Box22
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-3F, -2.6F, 1F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F); // Import Box23
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1F, 0.4F, -2F, 4, 1, 3, 0F,0F, 0.5F, 0F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box32
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1F, -2.6F, -2F, 4, 2, 3, 0F,0F, -0.8F, 0F, -0.5F, 0.1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -0.8F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box33
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(3.7F, -0.5F, -0.2F, 1, 11, 5, 0F,1F, 0F, 0F, -1.4F, 0F, 0F, -2.5F, 0F, -2F, 2F, 0F, -2F, -1.2F, 0F, 1F, 0.8F, 0F, 1F, -2.2F, 0F, 0F, 1.8F, 0F, 0F); // Box 37
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(3.7F, -0.5F, -3.2F, 1, 11, 5, 0F,1.2F, 2F, -1.5F, -2F, 2F, -1.5F, -1.4F, 0F, 0F, 1F, 0F, 0F, 0.8F, -0.5F, 0F, -1.2F, -0.5F, 0F, 0.8F, 0F, -1F, -1.2F, 0F, -1F); // Box 38
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Import Box24
		rightLegModel[1] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Import Box25
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Import Box26
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Import Box27
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Import Box28
		rightLegModel[5] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Import Box29
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box31
		rightLegModel[7] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Import Box35
		rightLegModel[8] = new ModelRendererTurbo(this, 25, 233, textureX, textureY); // Box 39
		rightLegModel[9] = new ModelRendererTurbo(this, 41, 233, textureX, textureY); // Box 40

		rightLegModel[0].addShapeBox(1F, -2.6F, 1F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Import Box24
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3F, -2.6F, 1F, 4, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F); // Import Box25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(1F, 0.4F, 1F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, 0F, 0F, -1F); // Import Box26
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3F, 0.4F, 1F, 4, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Import Box27
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.2F, 0F, -2F, 4, 6, 4, 0F,0.2F, 2.5F, 0.5F, -0.4F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.8F, 0F, 0F); // Import Box28
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-1.2F, 6F, -2F, 3, 6, 4, 0F,0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3F, 0.4F, -2F, 4, 1, 3, 0F,-0.8F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3F, -2.6F, -2F, 4, 2, 3, 0F,-0.5F, 0.1F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0.5F, -0.5F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box35
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-4.7F, -0.5F, -3.2F, 1, 11, 5, 0F,-2F, 2F, -1.5F, 1.2F, 2F, -1.5F, 1F, 0F, 0F, -1.4F, 0F, 0F, -1.2F, -0.5F, 0F, 0.8F, -0.5F, 0F, -1.2F, 0F, -1F, 0.8F, 0F, -1F); // Box 39
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-4.7F, -0.5F, -0.2F, 1, 11, 5, 0F,-1.4F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -2F, -2.5F, 0F, -2F, 0.8F, 0F, 1F, -1.2F, 0F, 1F, 1.8F, 0F, 0F, -2.2F, 0F, 0F); // Box 40
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 28
		skirtFrontModel[1] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 35
		skirtFrontModel[2] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 36

		skirtFrontModel[0].addShapeBox(-4.5F, -2.5F, -3.4F, 9, 13, 1, 0F,0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 1.2F, -0.5F, 0.8F, 1.2F, -0.5F, 0.8F, 1.2F, -0.5F, -1.2F, 1.2F, -0.5F, -1.2F); // Box 28
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(5.7F, -0.5F, -4.2F, 1, 11, 5, 0F,1.2F, 2F, -1.5F, -2F, 2F, -1.5F, -1.4F, 0F, 0F, 1F, 0F, 0F, 0.8F, -0.5F, 0F, -1.2F, -0.5F, 0F, 0.8F, 0F, -1F, -1.2F, 0F, -1F); // Box 35
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-6.7F, -0.5F, -4.2F, 1, 11, 5, 0F,-2F, 2F, -1.5F, 1.2F, 2F, -1.5F, 1F, 0F, 0F, -1.4F, 0F, 0F, -1.2F, -0.5F, 0F, 0.8F, -0.5F, 0F, -1.2F, 0F, -1F, 0.8F, 0F, -1F); // Box 36
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 29
		skirtRearModel[1] = new ModelRendererTurbo(this, 41, 201, textureX, textureY); // Box 33
		skirtRearModel[2] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 34

		skirtRearModel[0].addShapeBox(-4.5F, -0.5F, 3F, 9, 11, 1, 0F,0.5F, -1F, -0.2F, 0.5F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0.5F, 1.8F, 0F, 0.5F, 1.8F); // Box 29
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(5.7F, -0.5F, 0.8F, 1, 11, 5, 0F,1F, 0F, 0F, -1.4F, 0F, 0F, -2.5F, 0F, -2F, 2F, 0F, -2F, -1.2F, 0F, 1F, 0.8F, 0F, 1F, -2.2F, 0F, 0F, 1.8F, 0F, 0F); // Box 33
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(-6.7F, -0.5F, 0.8F, 1, 11, 5, 0F,-1.4F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, -2F, -2.5F, 0F, -2F, 0.8F, 0F, 1F, -1.2F, 0F, 1F, 1.8F, 0F, 0F, -2.2F, 0F, 0F); // Box 34
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);
	}
}