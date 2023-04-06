//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: EarlyPlate
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEarlyPlate extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelEarlyPlate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[24];
		leftArmModel = new ModelRendererTurbo[7];
		rightArmModel = new ModelRendererTurbo[7];
		leftLegModel = new ModelRendererTurbo[9];
		rightLegModel = new ModelRendererTurbo[9];
		skirtFrontModel = new ModelRendererTurbo[32];
		skirtRearModel = new ModelRendererTurbo[18];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 200
		bodyModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 201
		bodyModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 202
		bodyModel[3] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 105
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 84
		bodyModel[5] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 85
		bodyModel[6] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 87
		bodyModel[7] = new ModelRendererTurbo(this, 17, 22, textureX, textureY); // Box 89
		bodyModel[8] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 90
		bodyModel[9] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 48
		bodyModel[10] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 42
		bodyModel[11] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 35
		bodyModel[12] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 36
		bodyModel[13] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 47
		bodyModel[14] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 48
		bodyModel[15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 78
		bodyModel[16] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 79
		bodyModel[17] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 80
		bodyModel[18] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 81
		bodyModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 82
		bodyModel[20] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 83
		bodyModel[21] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 84
		bodyModel[22] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 85
		bodyModel[23] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 90

		bodyModel[0].addShapeBox(2F, 7F, -2F, 6, 6, 4, 0F,-0.2F, -0.5F, 2.2F, -3.1F, 1F, 1.3F, -3.1F, 0.5F, 0.8F, 0F, 0.4F, 1.2F, -0.1F, -3.7F, 1.5F, -3.7F, -3.7F, 0.5F, -3.7F, -4F, 0.5F, 0F, -3.5F, 0.8F); // Box 200
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2F, 4F, -2F, 6, 6, 1, 0F,-0.1F, 0F, 2F, -4.1F, 0F, 1F, -4.1F, 0F, -0.9F, 0F, 0.5F, -0.3F, -0.2F, -2.49F, 2.2F, -3.1F, -4F, 1.3F, -3.1F, -3.7F, -0.2F, 0F, -3F, 0.2F); // Box 201
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(2F, 1F, -2F, 6, 6, 1, 0F,0F, 0F, 0.6F, -4.5F, 0F, 0.4F, -4.5F, 0F, -0.3F, 0F, 0F, 0F, -0.1F, -3F, 2F, -4.1F, -3F, 1F, -4.1F, -3F, -0.9F, 0F, -3.5F, -0.3F); // Box 202
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, 9.2F, -3.5F, 4, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 105
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, 4F, -2.2F, 7, 4, 1, 0F,-0.9F, 0F, 2F, -0.9F, 0F, 2F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.6F, 2.2F, -0.9F, -0.6F, 2.2F, -0.9F, -0.6F, -0.2F, -0.9F, -0.6F, 0F); // Box 84
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 0F, -2.2F, 7, 4, 1, 0F,-1.3F, -0.5F, 0.4F, -1.3F, -0.5F, 0.4F, -1.3F, -0.5F, 0F, -1.3F, -0.5F, 0F, -0.9F, 0F, 2F, -0.9F, 0F, 2F, -0.9F, 0F, 0F, -0.9F, 0F, 0F); // Box 85
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 6.8F, -2.2F, 2, 3, 1, 0F,0F, -0.6F, 2.2F, 0F, -0.6F, 2.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, 0F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 87
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(1.5F, 6.8F, -2.2F, 2, 3, 1, 0F,0.5F, -0.6F, 2.2F, -0.9F, -0.6F, 2.2F, -0.9F, -0.6F, -0.2F, 0.5F, -0.6F, 0F, 0.8F, 0F, 1.5F, -1F, -0.4F, 1.3F, -1F, -0.4F, 0F, 0.8F, 0F, 0F); // Box 89
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 0.8F, -4.2F, 1, 3, 1, 0F,1F, -0.4F, -1.1F, -1.6F, -0.4F, -1.1F, -1.6F, -0.4F, 1F, 1F, -0.4F, 1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 90
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.5F, 4.8F, -2.5F, 9, 6, 5, 0F,-0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.45F, 1F, -0.3F, -0.45F, 1F, -0.3F, -0.45F, 1F, -0.3F, -0.45F, 1F, -0.3F); // Box 48
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 5, 5, 0F,-0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 42
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2F, 9.2F, -3.5F, 2, 1, 7, 0F,0F, 0F, 0F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0.1F, 0F, -1F, 0.1F, 0F, -1F, 0F, 0F, -0.7F); // Box 35
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 7F, 1F, 2, 3, 1, 0F,-0.1F, 1F, 0.3F, 0F, -0.3F, 0.2F, 0F, 0.4F, 1.2F, -0.2F, 1F, 1.4F, -0.7F, -0.7F, -0.5F, -0.1F, -0.7F, -0.5F, 0F, -0.5F, 0.8F, 0F, -0.7F, 1F); // Box 36
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(1.5F, -0.2F, -2.5F, 2, 2, 4, 0F,-0.1F, 0.1F, -0.2F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0F, 0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 47
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.5F, -0.2F, 1.4F, 2, 7, 1, 0F,-0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, 4.2F, 0.5F, 0.1F, -4.5F, 0.5F, -0.1F, -4.5F, 0.5F, 0.5F, 4.2F, 0.5F, 0.5F); // Box 48
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 6.8F, -2.2F, 2, 3, 1, 0F,-0.9F, -0.6F, 2.2F, 0.5F, -0.6F, 2.2F, 0.5F, -0.6F, 0F, -0.9F, -0.6F, -0.2F, -1F, -0.4F, 1.3F, 0.8F, 0F, 1.5F, 0.8F, 0F, 0F, -1F, -0.4F, 0F); // Box 78
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-8F, 7F, -2F, 6, 6, 4, 0F,-3.1F, 1F, 1.3F, -0.2F, -0.5F, 2.2F, 0F, 0.4F, 1.2F, -3.1F, 0.5F, 0.8F, -3.7F, -3.7F, 0.5F, -0.1F, -3.7F, 1.5F, 0F, -3.5F, 0.8F, -3.7F, -4F, 0.5F); // Box 79
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-8F, 4F, -2F, 6, 6, 1, 0F,-4.1F, 0F, 1F, -0.1F, 0F, 2F, 0F, 0.5F, -0.3F, -4.1F, 0F, -0.9F, -3.1F, -4F, 1.3F, -0.2F, -2.49F, 2.2F, 0F, -3F, 0.2F, -3.1F, -3.7F, -0.2F); // Box 80
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-8F, 1F, -2F, 6, 6, 1, 0F,-4.5F, 0F, 0.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, -4.5F, 0F, -0.3F, -4.1F, -3F, 1F, -0.1F, -3F, 2F, 0F, -3.5F, -0.3F, -4.1F, -3F, -0.9F); // Box 81
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2F, 7F, 1F, 2, 3, 1, 0F,0F, -0.3F, 0.2F, -0.1F, 1F, 0.3F, -0.2F, 1F, 1.4F, 0F, 0.4F, 1.2F, -0.1F, -0.7F, -0.5F, -0.7F, -0.7F, -0.5F, 0F, -0.7F, 1F, 0F, -0.5F, 0.8F); // Box 82
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.5F, -0.2F, 1.4F, 2, 7, 1, 0F,-0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -4.5F, 0.5F, -0.1F, 4.2F, 0.5F, 0.1F, 4.2F, 0.5F, 0.5F, -4.5F, 0.5F, 0.5F); // Box 83
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-3.5F, -0.2F, -2.5F, 2, 2, 4, 0F,-0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.2F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 84
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 9.2F, -3.5F, 2, 1, 7, 0F,0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0.25F, 0F, -1F, 0.15F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0.15F, 0F, -1F); // Box 85
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-0.5F, 0.8F, -4.2F, 1, 3, 1, 0F,-1.6F, -0.4F, -1.1F, 1F, -0.4F, -1.1F, 1F, -0.4F, 1F, -1.6F, -0.4F, 1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 90
		bodyModel[23].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 57
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 58
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 62
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 77
		leftArmModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 99
		leftArmModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 91
		leftArmModel[6] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 56

		leftArmModel[0].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 9F, -2F, 4, 3, 4, 0F,0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F); // Box 58
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 2.4F, -2F, 4, 1, 4, 0F,0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.3F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F); // Box 62
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 5.7F, -2F, 4, 3, 4, 0F,0.3F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.5F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 77
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 3.9F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F); // Box 99
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, -2F, -2F, 4, 4, 4, 0F,0F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 91
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, 3.4F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 56
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 100
		rightArmModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 101
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 102
		rightArmModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 103
		rightArmModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 104
		rightArmModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 105
		rightArmModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 106

		rightArmModel[0].addShapeBox(-3F, 3.4F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 100
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 2.4F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F); // Box 101
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2F, -2F, 4, 4, 4, 0F,0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.4F, 0F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 102
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 5.7F, -2F, 4, 3, 4, 0F,0.3F, 0F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 103
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 9F, -2F, 4, 3, 4, 0F,0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F); // Box 104
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 105
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 3.9F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, -0.8F, -0.2F, 0.2F, -0.8F, -0.2F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F); // Box 106
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 82
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 84
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 85
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 86
		leftLegModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 87
		leftLegModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 88
		leftLegModel[6] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 89
		leftLegModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 90
		leftLegModel[8] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 45

		leftLegModel[0].addShapeBox(-2F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 82
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.8F, 5.1F, -2.5F, 4, 1, 1, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 84
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.8F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1F, 0.6F, 0.4F, -1F, 0.6F, 0.3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F); // Box 85
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.8F, 1.9F, -2F, 4, 5, 3, 0F,0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, -1.5F, 0.2F, 0.5F, -1.5F, -0.7F, 0.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.9F, 0.3F, 0F, -1.2F); // Box 86
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.8F, 6.1F, -2.5F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 87
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(2F, 6.5F, -1.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F); // Box 88
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(2F, 5.5F, -1.8F, 1, 1, 3, 0F,-1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 89
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 11.1F, -3.5F, 4, 1, 2, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 1.1F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 45
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 91
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 92
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 93
		rightLegModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 94
		rightLegModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 95
		rightLegModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 96
		rightLegModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 97
		rightLegModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 98
		rightLegModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 99

		rightLegModel[0].addShapeBox(-2F, 1.1F, -2F, 4, 7, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 91
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2.2F, 1.9F, -2F, 4, 5, 3, 0F,0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -1.5F, -0.7F, 0.8F, -1.5F, 0.2F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.3F, 0F, -1.2F, 0.3F, 0F, -0.9F); // Box 92
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2.2F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1F, 0.6F, 0.4F, -1F, 0.6F, 0F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0.3F, 0.5F, 0.1F, 0F, 0.5F, 0.1F); // Box 93
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 94
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 11.1F, -3.5F, 4, 1, 2, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.2F, 5.1F, -2.5F, 4, 1, 1, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 96
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.2F, 6.1F, -2.5F, 4, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 0.7F, -0.4F, 0.2F, 0.7F, -0.4F); // Box 97
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3F, 5.5F, -1.8F, 1, 1, 3, 0F,0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 98
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-3F, 6.5F, -1.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F); // Box 99
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 44
		skirtFrontModel[1] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 39
		skirtFrontModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 41
		skirtFrontModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 42
		skirtFrontModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 43
		skirtFrontModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 44
		skirtFrontModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 46
		skirtFrontModel[7] = new ModelRendererTurbo(this, 17, 45, textureX, textureY); // Box 47
		skirtFrontModel[8] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 48
		skirtFrontModel[9] = new ModelRendererTurbo(this, 17, 45, textureX, textureY); // Box 49
		skirtFrontModel[10] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 50
		skirtFrontModel[11] = new ModelRendererTurbo(this, 17, 45, textureX, textureY); // Box 51
		skirtFrontModel[12] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 52
		skirtFrontModel[13] = new ModelRendererTurbo(this, 17, 45, textureX, textureY); // Box 53
		skirtFrontModel[14] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 54
		skirtFrontModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 55
		skirtFrontModel[16] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 49
		skirtFrontModel[17] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 50
		skirtFrontModel[18] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 52
		skirtFrontModel[19] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 53
		skirtFrontModel[20] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 54
		skirtFrontModel[21] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 55
		skirtFrontModel[22] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 56
		skirtFrontModel[23] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 57
		skirtFrontModel[24] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 58
		skirtFrontModel[25] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 65
		skirtFrontModel[26] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 66
		skirtFrontModel[27] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 67
		skirtFrontModel[28] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 86
		skirtFrontModel[29] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 87
		skirtFrontModel[30] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 88
		skirtFrontModel[31] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 89

		skirtFrontModel[0].addShapeBox(-4F, -1.5F, -2F, 8, 2, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.6F, 0F, 0F, 0.5F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.9F, 0.1F, 0.5F, 0.9F, 0.1F, 0.5F); // Box 44
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-4F, 0.5F, -2F, 8, 2, 2, 0F,0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1.2F, 0.3F, 1.2F, 1.2F, 0.3F, 1.2F, 1.2F, 0.3F, 1.6F, 1.2F, 0.3F, 1.5F); // Box 39
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-5.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 41
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[3].addShapeBox(-4.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 42
		skirtFrontModel[3].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[4].addShapeBox(-3.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 43
		skirtFrontModel[4].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[5].addShapeBox(-6.1F, 2.8F, -3.2F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 44
		skirtFrontModel[5].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[6].addShapeBox(-2F, -1.8F, -3.5F, 4, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		skirtFrontModel[6].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[7].addShapeBox(2F, -1.8F, -3.5F, 2, 1, 3, 0F,0F, 0F, -0.1F, 0.1F, 0F, -1.1F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.4F, 0F, -0.7F, 0.6F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 47
		skirtFrontModel[7].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[8].addShapeBox(-2F, -0.800000000000001F, -3.7F, 4, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		skirtFrontModel[8].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[9].addShapeBox(2F, -0.800000000000001F, -3.5F, 2, 1, 3, 0F,0F, 0F, 0.1F, 0.3F, 0F, -0.9F, 0.4F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.8F, 0F, -0.2F, 1F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 49
		skirtFrontModel[9].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[10].addShapeBox(-2F, 0.199999999999999F, -4F, 4, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		skirtFrontModel[10].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[11].addShapeBox(2F, 0.199999999999999F, -3.8F, 2, 1, 3, 0F,0F, 0F, 0.1F, 0.65F, 0F, -0.6F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.7F, 0F, -0.2F, 0.8F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 51
		skirtFrontModel[11].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[12].addShapeBox(-2F, 1.2F, -4.2F, 4, 1, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		skirtFrontModel[12].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[13].addShapeBox(2F, 1.2F, -4F, 2, 1, 3, 0F,0F, 0F, 0.1F, 0.5F, 0F, -0.4F, 0.6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.7F, 0F, 0.2F, -0.5F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 53
		skirtFrontModel[13].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[14].addShapeBox(-2F, 2.2F, -4.2F, 4, 1, 1, 0F,1F, 0F, -0.1F, 1F, 0F, -0.1F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		skirtFrontModel[14].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[15].addShapeBox(-1F, 3.2F, -4.2F, 2, 1, 1, 0F,0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, -0.7F, 0F, 0.3F, -0.7F, 0F, 0.3F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F); // Box 55
		skirtFrontModel[15].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[16].addShapeBox(-1.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 49
		skirtFrontModel[16].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[17].addShapeBox(-2.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 50
		skirtFrontModel[17].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[18].addShapeBox(4.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 52
		skirtFrontModel[18].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[19].addShapeBox(3.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 53
		skirtFrontModel[19].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[20].addShapeBox(2.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 54
		skirtFrontModel[20].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[21].addShapeBox(0.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 55
		skirtFrontModel[21].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[22].addShapeBox(1.2F, 2.8F, -3.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 56
		skirtFrontModel[22].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[23].addShapeBox(-6.1F, 2.8F, -2.2F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F); // Box 57
		skirtFrontModel[23].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[24].addShapeBox(-6.1F, 2.8F, -1.2F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 58
		skirtFrontModel[24].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[25].addShapeBox(4.2F, 2.8F, -1.2F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 65
		skirtFrontModel[25].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[26].addShapeBox(4.2F, 2.8F, -2.2F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F); // Box 66
		skirtFrontModel[26].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[27].addShapeBox(4.2F, 2.8F, -3.2F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 67
		skirtFrontModel[27].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[28].addShapeBox(-4F, -1.8F, -3.5F, 2, 1, 3, 0F,0.1F, 0F, -1.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.4F, 0F, -0.7F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0.6F, 0F, -0.5F); // Box 86
		skirtFrontModel[28].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[29].addShapeBox(-4F, -0.800000000000001F, -3.5F, 2, 1, 3, 0F,0.3F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.4F, 0F, -1F, 0.8F, 0F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 1F, 0F, -1.5F); // Box 87
		skirtFrontModel[29].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[30].addShapeBox(-4F, 0.199999999999999F, -3.8F, 2, 1, 3, 0F,0.65F, 0F, -0.6F, 0F, 0F, 0.1F, 0F, 0F, 0F, 1F, 0F, -1F, 0.7F, 0F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0.8F, 0F, -1.5F); // Box 88
		skirtFrontModel[30].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[31].addShapeBox(-4F, 1.2F, -4F, 2, 1, 3, 0F,0.5F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.6F, 0F, -1F, -0.7F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1.5F); // Box 89
		skirtFrontModel[31].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 45
		skirtRearModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 40
		skirtRearModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 59
		skirtRearModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 60
		skirtRearModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 61
		skirtRearModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 62
		skirtRearModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 63
		skirtRearModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 64
		skirtRearModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 68
		skirtRearModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 69
		skirtRearModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 70
		skirtRearModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 71
		skirtRearModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 72
		skirtRearModel[13] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 73
		skirtRearModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 74
		skirtRearModel[15] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 75
		skirtRearModel[16] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 76
		skirtRearModel[17] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 77

		skirtRearModel[0].addShapeBox(-4F, -1.5F, 0F, 8, 2, 2, 0F,0F, 0F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 1F, 0.8F, 0F, 1F); // Box 45
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-4F, 0.5F, 0F, 8, 2, 2, 0F,0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 1.2F, 0.3F, 1.6F, 1.2F, 0.3F, 1.5F, 1.2F, 0.3F, 1.2F, 1.2F, 0.3F, 1.2F); // Box 40
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(-6.1F, 2.8F, 2.1F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F); // Box 59
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[3].addShapeBox(-6.1F, 2.8F, 1.1F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 60
		skirtRearModel[3].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[4].addShapeBox(-6.1F, 2.8F, 0.0999999999999999F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F); // Box 61
		skirtRearModel[4].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[5].addShapeBox(4.2F, 2.8F, 2.1F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F); // Box 62
		skirtRearModel[5].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[6].addShapeBox(4.2F, 2.8F, 1.1F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 63
		skirtRearModel[6].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[7].addShapeBox(4.2F, 2.8F, 0.0999999999999999F, 1, 1, 1, 0F,-0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F); // Box 64
		skirtRearModel[7].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[8].addShapeBox(4.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 68
		skirtRearModel[8].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[9].addShapeBox(3.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 69
		skirtRearModel[9].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[10].addShapeBox(2.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 70
		skirtRearModel[10].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[11].addShapeBox(1.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 71
		skirtRearModel[11].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[12].addShapeBox(0.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 72
		skirtRearModel[12].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[13].addShapeBox(-1.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 73
		skirtRearModel[13].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[14].addShapeBox(-2.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 74
		skirtRearModel[14].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[15].addShapeBox(-3.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 75
		skirtRearModel[15].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[16].addShapeBox(-4.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, -0.9F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.9F, -0.9F, 0.2F, -0.9F); // Box 76
		skirtRearModel[16].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[17].addShapeBox(-5.2F, 2.8F, 3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, -0.9F, 0F, 0.2F, -0.9F); // Box 77
		skirtRearModel[17].setRotationPoint(0F, 0F, 0F);
	}
}