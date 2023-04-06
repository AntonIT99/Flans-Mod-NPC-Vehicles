//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: footArmor
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelfootArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelfootArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[24];
		leftArmModel = new ModelRendererTurbo[16];
		rightArmModel = new ModelRendererTurbo[14];
		leftLegModel = new ModelRendererTurbo[15];
		rightLegModel = new ModelRendererTurbo[15];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 108
		bodyModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 89
		bodyModel[2] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 90
		bodyModel[3] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 91
		bodyModel[4] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 12
		bodyModel[5] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 100
		bodyModel[6] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 27
		bodyModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 28
		bodyModel[8] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 200
		bodyModel[9] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 201
		bodyModel[10] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 202
		bodyModel[11] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 26
		bodyModel[12] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 105
		bodyModel[13] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 106
		bodyModel[14] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 107
		bodyModel[15] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 108
		bodyModel[16] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 117
		bodyModel[17] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 118
		bodyModel[18] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 119
		bodyModel[19] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 135
		bodyModel[20] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 136
		bodyModel[21] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 137
		bodyModel[22] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 138
		bodyModel[23] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 83

		bodyModel[0].addShapeBox(0F, 10.8F, -2F, 4, 1, 1, 0F,0F, 0.2F, 0.5F, 0.7F, 0.4F, 0.5F, 0.7F, 0.4F, 1.2F, 0F, 0.4F, 0.5F, 0F, 0.5F, 1.6F, 1.3F, 0F, 1F, 1.3F, 0F, 1F, 0F, 0.5F, 1.8F); // Box 108
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-1F, 12.5F, -4.5F, 2, 1, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 89
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1F, 13F, -4.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 13.5F, -4.5F, 2, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 91
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 12.8F, -1.8F, 4, 2, 4, 0F,-0.5F, 0.3F, 0F, 1.4F, 0.3F, 0F, 0.8F, 0F, 1.5F, 0F, -0.6F, 1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0.5F, -0.3F, 1F, 0.5F); // Box 12
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 9.8F, -1.8F, 4, 3, 4, 0F,-0.25F, 0F, 0.25F, -0.2F, -0.5F, 0.3F, -0.2F, -0.5F, 0.15F, 0F, 0F, 0.2F, -0.5F, -0.3F, 0.05F, 1.4F, -0.3F, 0F, 0.8F, 0F, 1.51F, 0.05F, 0.6F, 1.51F); // Box 100
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 4F, -2F, 8, 6, 4, 0F,-0.1F, 1F, 0.8F, -3.9F, 0F, 2.3F, -4F, 0.5F, 1.7F, -0.1F, 1F, 1.1F, 0.9F, -4F, 1F, -3.8F, -2.49F, 2.4F, -4F, -3F, 1.2F, 0.9F, -4F, 0.8F); // Box 27
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 7F, -2F, 8, 6, 4, 0F,0.9F, 1F, 1F, -3.8F, -0.5F, 2.4F, -4F, 0F, 1.2F, 0.9F, 1F, 0.8F, 0.5F, -3.7F, 0.5F, -3.9F, -3.7F, 1.5F, -4F, -4.2F, 0.8F, 0.5F, -4F, 0.4F); // Box 28
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 7F, -2F, 8, 6, 4, 0F,-0.2F, -0.5F, 2.4F, -3.1F, 1F, 1F, -3.1F, 1F, 0.8F, 0F, 0F, 1.2F, -0.1F, -3.7F, 1.5F, -3.5F, -3.7F, 0.5F, -3.5F, -4F, 0.4F, 0F, -4.2F, 0.8F); // Box 200
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 4F, -2F, 8, 6, 4, 0F,-0.1F, 0F, 2.3F, -4.1F, 1F, 0.8F, -4.1F, 1F, 1.1F, 0F, 0.5F, 1.7F, -0.2F, -2.49F, 2.4F, -3.1F, -4F, 1F, -3.1F, -4F, 0.8F, 0F, -3F, 1.2F); // Box 201
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 1F, -2F, 8, 6, 4, 0F,0F, -0.8F, 1.5F, -4.2F, 0F, 0.2F, -4.2F, -0.3F, 0.7F, 0F, -0.5F, 1F, -0.1F, -3F, 2.3F, -4.1F, -4F, 0.8F, -4.1F, -4F, 1.1F, 0F, -3.5F, 1.7F); // Box 202
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 1F, -2F, 8, 6, 4, 0F,-0.2F, 0F, 0.2F, -4F, -0.8F, 1.5F, -4F, -0.5F, 1F, -0.2F, -0.3F, 0.7F, -0.1F, -4F, 0.8F, -3.9F, -3F, 2.3F, -4F, -3.5F, 1.7F, -0.1F, -4F, 1.1F); // Box 26
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 8.8F, -2.5F, 4, 1, 5, 0F,0F, -0.5F, 0.9F, 0.4F, -0.5F, 0F, 0.3F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0.1F, 0.8F, 0.35F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.4F, 0.1F); // Box 105
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 9.5F, -2.5F, 4, 1, 5, 0F,0F, -0.2F, 0.7F, 0.2F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.1F); // Box 106
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1F, 0F, -2F, 3, 2, 4, 0F,-0.1F, 0.2F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.2F, -0.1F, 0.7F, 0.5F, -0.2F, 0F, 1.2F, -0.3F, -0.8F, 0.1F, -0.3F, -0.7F, 0.6F, -0.2F, -0.3F, 0.9F); // Box 107
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, -2F, 1, 2, 4, 0F,0F, 0.4F, 0.3F, 0.1F, 0.2F, 0.2F, 0.1F, 0.7F, 0.5F, 0F, 1F, 0.2F, 0F, 0F, 1.5F, 0.2F, 0F, 1.2F, 0.2F, -0.3F, 0.9F, 0F, -0.4F, 1F); // Box 108
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 10.8F, -2F, 4, 1, 1, 0F,0.7F, 0.4F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.4F, 0.5F, 0.7F, 0.4F, 1.2F, 1.3F, 0F, 1F, 0F, 0.5F, 1.6F, 0F, 0.5F, 1.8F, 1.3F, 0F, 1F); // Box 117
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 9.5F, -2.5F, 4, 1, 5, 0F,0.2F, -0.3F, -0.1F, 0F, -0.2F, 0.7F, 0F, 0.2F, 0F, 0.1F, -0.3F, -0.1F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, -0.3F, 0.1F, 0F, 0F, 0F); // Box 118
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 8.8F, -2.5F, 4, 1, 5, 0F,0.4F, -0.5F, 0F, 0F, -0.5F, 0.9F, 0F, 0F, 0.2F, 0.3F, 0F, -0.1F, 0.35F, 0F, 0F, 0F, 0.1F, 0.8F, 0F, -0.4F, 0.1F, 0.2F, 0F, 0F); // Box 119
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 0F, -2F, 3, 2, 4, 0F,0.5F, 0F, 0F, -0.1F, 0.2F, 0.2F, -0.1F, 0.7F, 0.5F, 0.5F, 0F, 0.2F, -0.3F, -0.8F, 0.1F, -0.2F, 0F, 1.2F, -0.2F, -0.3F, 0.9F, -0.3F, -0.7F, 0.6F); // Box 135
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1F, 0F, -2F, 1, 2, 4, 0F,0.1F, 0.2F, 0.2F, 0F, 0.4F, 0.3F, 0F, 1F, 0.2F, 0.1F, 0.7F, 0.5F, 0.2F, 0F, 1.2F, 0F, 0F, 1.5F, 0F, -0.4F, 1F, 0.2F, -0.3F, 0.9F); // Box 136
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 12.8F, -1.8F, 4, 2, 4, 0F,1.4F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, -0.6F, 1.5F, 0.8F, 0F, 1.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 1F, 0.5F, 1F, 0.5F, 0.5F); // Box 137
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 9.8F, -1.8F, 4, 3, 4, 0F,-0.2F, -0.5F, 0.3F, -0.25F, 0F, 0.25F, 0F, 0F, 0.2F, -0.2F, -0.5F, 0.15F, 1.4F, -0.3F, 0F, -0.5F, -0.3F, 0.05F, 0.05F, 0.6F, 1.51F, 0.8F, 0F, 1.51F); // Box 138
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0F, 10.5F, -2.8F, 4, 1, 5, 0F,0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 4F, 0.5F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 2F, 0F, 4F, 2F, 0F); // Box 83
		bodyModel[23].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 57
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 58
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 62
		leftArmModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 101
		leftArmModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 57
		leftArmModel[5] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 58
		leftArmModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 60
		leftArmModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 67
		leftArmModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 68
		leftArmModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
		leftArmModel[10] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 77
		leftArmModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 95
		leftArmModel[12] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 96
		leftArmModel[13] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 97
		leftArmModel[14] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 98
		leftArmModel[15] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 99

		leftArmModel[0].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 58
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -0.6F, -2F, 4, 7, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F); // Box 62
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(0.51F, -4.1F, -1F, 1, 2, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, -1F, 0.7F, 0F, 0F, 0F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 101
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(0F, -2.1F, -2F, 3, 3, 4, 0F,1.3F, 0.7F, 0.3F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.5F, 0.7F, 0.8F, -0.5F, 1.3F, 1.1F, 0.7F, 0F, 0.6F, 0.7F, 0F, 0.5F, 0.5F, 3.3F, 1.5F); // Box 57
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0F, -4.1F, -3.01F, 1, 2, 2, 0F,1F, -2.3F, 1F, -2F, -2.5F, 1.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 2F, -0.5F, -2F, 2F, 0F, 0F, 0.5F, -0.5F, -0.5F, 0F, -0.5F); // Box 58
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-3F, -1.6F, -5.01F, 2, 2, 1, 0F,0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, -0.2F, -0.5F, 0.5F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 1.5F, 0.5F, 0.3F, 1.5F); // Box 60
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, -0.1F, -3F, 2, 2, 1, 0F,0F, 0F, 0.2F, -0.5F, 1.5F, -0.6F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 2F, 2F, 0F, 1F, 0.5F, 0F, 1.2F, -1F, 0F, 2F, -2.5F); // Box 67
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-3F, -0.1F, -3F, 2, 2, 1, 0F,0.5F, -0.5F, 0.5F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 1F, -0.5F, -0.5F, 0F, 1F, 2F, 0F, 2F, 2F, 0F, 2F, -2.5F, 0F, 1.2F, -2.5F); // Box 68
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-3.59F, -2.1F, -1.99F, 1, 2, 4, 0F,-1.7F, -1.2F, 1.3F, 1.31F, 0.7F, 0.3F, 2.1F, 0.7F, 0.8F, 1F, -1F, 1.5F, -1.5F, 1F, 1.5F, 2.3F, -0.7F, 0.8F, 2.1F, 4.3F, 1.5F, 0F, 4F, 2F); // Box 72
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-1F, 6.7F, -2F, 4, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 77
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(3.9F, 1.9F, -2F, 1, 1, 4, 0F,-0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 95
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(3.3F, 2.9F, -2F, 1, 2, 4, 0F,-0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F); // Box 96
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(3.3F, 4.9F, -2F, 1, 2, 4, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F); // Box 97
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(3.9F, 6.9F, -2F, 1, 1, 4, 0F,0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 98
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-0.5F, 3.9F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F); // Box 99
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 43
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 63
		rightArmModel[2] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 69
		rightArmModel[3] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 70
		rightArmModel[4] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 91
		rightArmModel[5] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 92
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 93
		rightArmModel[7] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 94
		rightArmModel[8] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 114
		rightArmModel[9] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 115
		rightArmModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 131
		rightArmModel[11] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 132
		rightArmModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 133
		rightArmModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 134

		rightArmModel[0].addShapeBox(-3F, -1.5F, -2F, 3, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 43
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.5F, 3.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, -0.8F, 0.3F, 0.2F, 0.2F, 0.3F); // Box 63
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(1F, -1.1F, -3F, 2, 4, 1, 0F,0F, 0F, 0.2F, 0.5F, -0.5F, 0.5F, 1F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 1F, 1F, 0F, 0.3F, 1F, 0F, 0.5F, -1.5F, 0F, 1F, -1.5F); // Box 69
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-1F, -1.1F, -3F, 2, 4, 1, 0F,-0.5F, 1.5F, -0.6F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, 1F, 0.5F, 0F, -0.5F, 0F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, -0.3F, -0.5F); // Box 70
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-4.2F, 2.9F, -2F, 1, 2, 4, 0F,0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F); // Box 91
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-4.2F, 4.9F, -2F, 1, 2, 4, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 92
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-4.8F, 1.9F, -2F, 1, 1, 4, 0F,-0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F); // Box 93
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-4.8F, 6.9F, -2F, 1, 1, 4, 0F,-0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 94
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, -2.1F, -2F, 3, 3, 4, 0F,0.3F, 0.3F, 0.4F, 1.3F, 0.7F, 0.3F, 0.5F, 0.7F, 0.8F, 0.3F, 0.3F, 0.4F, 0.7F, 0F, 0.6F, -0.5F, 1.3F, 1.1F, 0.5F, 3.3F, 1.5F, 0.7F, 0F, 0.5F); // Box 114
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(2.6F, -2.1F, -1.99F, 1, 2, 4, 0F,1.31F, 0.7F, 0.3F, -1.7F, -1.2F, 1.3F, 1F, -1F, 1.5F, 2.1F, 0.7F, 0.8F, 2.3F, -0.7F, 0.8F, -1.5F, 1F, 1.5F, 0F, 4F, 2F, 2.1F, 4.3F, 1.5F); // Box 115
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3F, -0.6F, -2F, 4, 7, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F); // Box 131
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3F, 6.7F, -2F, 4, 2, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 132
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 133
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 134
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 68
		leftLegModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 69
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 71
		leftLegModel[3] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 82
		leftLegModel[4] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 84
		leftLegModel[5] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 85
		leftLegModel[6] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 86
		leftLegModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 87
		leftLegModel[8] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 88
		leftLegModel[9] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 89
		leftLegModel[10] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 90
		leftLegModel[11] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 109
		leftLegModel[12] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 110
		leftLegModel[13] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 111
		leftLegModel[14] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 112

		leftLegModel[0].addShapeBox(-0.5F, 0.199999999999999F, -2F, 4, 1, 2, 0F,1F, 0F, 1.4F, 0.1F, 0.5F, 1.1F, 0.1F, 0.5F, 1.3F, 1.5F, 0F, 1.9F, 0.5F, 0F, 1.7F, 0.1F, -0.3F, 1F, 0.1F, -0.3F, 0.8F, 1.5F, 0F, 2.2F); // Box 68
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-0.4F, 1.2F, -2F, 4, 1, 3, 0F,0.5F, 0F, 1.5F, 0.2F, 0.3F, 1.1F, 0.2F, 0.3F, 1.8F, 1.6F, 0F, 1F, 0.7F, 0.2F, 0.8F, 0.1F, 0F, 1F, 0.1F, 0F, 1.4F, 1.6F, 0.2F, 0.3F); // Box 69
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.4F, 2.2F, -2F, 5, 1, 5, 0F,-0.4F, 0F, 1.6F, 0.2F, 0F, 1F, 0.4F, 0F, 0F, 0.6F, -0.2F, 0F, 0.2F, 0.5F, 1.8F, 0F, 0.5F, 0.7F, 0.1F, 0.5F, -0.3F, 0.6F, 1F, -0.3F); // Box 71
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 82
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, 5.1F, -2.8F, 4, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 84
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 6.1F, -2F, 4, 4, 4, 0F,0.5F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1F, 0.6F, 0.5F, -1F, 0.6F, 0.5F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F); // Box 85
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.5F, 1.9F, -2F, 4, 6, 4, 0F,0.5F, 0F, 0.1F, 0.8F, 0F, 0.1F, 0.8F, -1.5F, 0.7F, 0.5F, -1.5F, 0.8F, 0.5F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.5F, 0F, 0.1F); // Box 86
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.5F, 6.1F, -2.8F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 87
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(2.5F, 6.5F, -0.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F); // Box 88
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(2.5F, 5.5F, -0.8F, 1, 1, 3, 0F,-1F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 0.5F, 0.5F, 0.8F, -1F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 89
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-1.5F, 11.1F, -3.5F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 90
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-1.5F, 6.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 109
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(-1.5F, 6F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 110
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(-1.5F, 5.5F, -1.2F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 111
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(-1.5F, 11.1F, -4.5F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 112
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 120
		rightLegModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 121
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 122
		rightLegModel[3] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 123
		rightLegModel[4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 124
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 125
		rightLegModel[6] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 126
		rightLegModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 127
		rightLegModel[8] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 128
		rightLegModel[9] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 129
		rightLegModel[10] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 139
		rightLegModel[11] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 140
		rightLegModel[12] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 141
		rightLegModel[13] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 142
		rightLegModel[14] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 143

		rightLegModel[0].addShapeBox(-3.5F, 0.199999999999999F, -2F, 4, 1, 2, 0F,0.1F, 0.5F, 1.1F, 1F, 0F, 1.4F, 1.5F, 0F, 1.9F, 0.1F, 0.5F, 1.3F, 0.1F, -0.3F, 1F, 0.5F, 0F, 1.7F, 1.5F, 0F, 2.2F, 0.1F, -0.3F, 0.8F); // Box 120
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3.6F, 1.2F, -2F, 4, 1, 3, 0F,0.2F, 0.3F, 1.1F, 0.5F, 0F, 1.5F, 1.6F, 0F, 1F, 0.2F, 0.3F, 1.8F, 0.1F, 0F, 1F, 0.7F, 0.2F, 0.8F, 1.6F, 0.2F, 0.3F, 0.1F, 0F, 1.4F); // Box 121
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3.6F, 2.2F, -2F, 5, 1, 5, 0F,0.2F, 0F, 1F, -0.4F, 0F, 1.6F, 0.6F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 0.5F, 0.7F, 0.2F, 0.5F, 1.8F, 0.6F, 1F, -0.3F, 0.1F, 0.5F, -0.3F); // Box 122
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2.5F, 6.1F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, -1F, 0.6F, 0.4F, -1F, 0.6F, 0.2F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F); // Box 123
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.5F, 1.9F, -2F, 4, 6, 4, 0F,0.8F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, -1.5F, 0.8F, 0.8F, -1.5F, 0.7F, 0.3F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 124
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2.5F, 6.1F, -2.8F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F); // Box 125
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2.5F, 5.1F, -2.8F, 4, 1, 3, 0F,0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 126
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.5F, 11.1F, -1.5F, 4, 1, 4, 0F,0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, -0.4F, 0.4F, 0.5F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F); // Box 127
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.5F, 11.1F, -3.5F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 128
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2.5F, 11.1F, -4.5F, 4, 1, 2, 0F,0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 129
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2.5F, 5.5F, -1.2F, 4, 1, 3, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 139
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2.5F, 6F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 140
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-2.5F, 6.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 141
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-3.5F, 5.5F, -0.8F, 1, 1, 3, 0F,0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 142
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-3.5F, 6.5F, -0.8F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.8F, -0.5F, -1F, 0.8F, -0.5F, -1F, 0.5F, 0.8F, 0.5F, 0.5F, 0.8F); // Box 143
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);
	}
}