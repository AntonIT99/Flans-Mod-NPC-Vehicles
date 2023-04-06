//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: QingFakeArmor
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelQingFakeArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelQingFakeArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[1];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 46
		bodyModel[3] = new ModelRendererTurbo(this, 46, 54, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 46, 54, textureX, textureY); // Box 38
		bodyModel[8] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 87
		bodyModel[9] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 98
		bodyModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 99
		bodyModel[11] = new ModelRendererTurbo(this, 49, 66, textureX, textureY); // Box 100
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 113
		bodyModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 114
		bodyModel[14] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 115
		bodyModel[15] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 118
		bodyModel[16] = new ModelRendererTurbo(this, 33, 53, textureX, textureY); // Box 128
		bodyModel[17] = new ModelRendererTurbo(this, 33, 53, textureX, textureY); // Box 129
		bodyModel[18] = new ModelRendererTurbo(this, 49, 66, textureX, textureY); // Box 135
		bodyModel[19] = new ModelRendererTurbo(this, 49, 66, textureX, textureY); // Box 136
		bodyModel[20] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 189
		bodyModel[21] = new ModelRendererTurbo(this, 25, 16, textureX, textureY); // Box 136

		bodyModel[0].addShapeBox(-4F, 11.5F, -2.5F, 8, 1, 5, 0F,0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F); // Box 22
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 11F, -2.5F, 8, 1, 5, 0F,0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F); // Box 44
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, 1.5F, -2.6F, 1, 8, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, -0.2F, 1.5F, 0F); // Box 46
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 5F, -2.5F, 4, 5, 5, 0F,0.5F, 0F, 0.4F, -0.1F, 0F, 0.4F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 1.1F, 0.2F, -0.1F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0.5F, 1.1F, 0.2F); // Box 13
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1.5F, -2.7F, 4, 3, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.2F, -0.1F, 0.5F, 0.2F, -0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 15
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0F, -2.5F, 2, 1, 5, 0F,-0.5F, 0.7F, 0F, -0.5F, 0.8F, 0F, 2F, 0.8F, 0F, -0.5F, 0.7F, 0F, 0F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, 2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 16
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0.7F, 0.5F, 0.2F); // Box 33
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 5F, -2.5F, 4, 5, 5, 0F,-0.1F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0F, 0F, 0.4F, -0.1F, 1.1F, 0.2F, 0.5F, 1.1F, 0.2F, 0.5F, 1.1F, 0.2F, 0F, 1.1F, 0.2F); // Box 38
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.5F, 4.6F, -3F, 5, 1, 6, 0F,-0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F); // Box 87
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 5F, -2.5F, 1, 5, 5, 0F,1F, -0.3F, 0.45F, 0.9F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, -0.3F, 0.45F, 0.6F, 0F, 0.3F, -0.1F, -1.5F, 0.45F, 0F, -1.5F, 0.45F, 0.6F, 0F, 0.3F); // Box 98
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4.5F, 4.6F, -3F, 2, 1, 6, 0F,0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F); // Box 99
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1.5F, -0.5F, -4.1F, 3, 5, 1, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, -2.8F, 0F, 0.5F, -2.8F, 0F, 0.5F, -3F, 0.5F, 0.5F, -3F, 0.5F); // Box 100
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 1.5F, -2.7F, 4, 3, 1, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0F, -0.1F, 0.5F, 0F); // Box 113
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.5F, 4.6F, -3F, 2, 1, 6, 0F,0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F); // Box 114
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3F, 5F, -2.5F, 1, 5, 5, 0F,0.9F, 0F, 0.7F, 1F, -0.3F, 0.45F, 1F, -0.3F, 0.45F, 1F, 0F, 0.7F, -0.1F, -1.5F, 0.45F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0F, -1.5F, 0.45F); // Box 115
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 118
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.8F, 5F, -2.5F, 1, 5, 5, 0F,1F, -0.3F, 0.45F, 0.9F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, -0.3F, 0.45F, 0.6F, 0F, 0.3F, -0.1F, -1.5F, 0.45F, 0F, -1.5F, 0.45F, 0.6F, 0F, 0.3F); // Box 128
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2.8F, 5F, -2.5F, 1, 5, 5, 0F,0.9F, 0F, 0.7F, 1F, -0.3F, 0.45F, 1F, -0.3F, 0.45F, 1F, 0F, 0.7F, -0.1F, -1.5F, 0.45F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0F, -1.5F, 0.45F); // Box 129
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-5F, -0.5F, -4.1F, 3, 5, 1, 0F,-1F, 0.5F, -1.5F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0.5F, 1.5F, 0F, -3.8F, -0.7F, 0F, -2.8F, 0F, 0F, -3F, 0.5F, 0F, -4F, 0.5F); // Box 135
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2F, -0.5F, -4.1F, 3, 5, 1, 0F,1F, 0F, -1F, -1F, 0.5F, -1.5F, -1F, 0.5F, 1.5F, 1F, 0F, 1F, 0F, -2.8F, 0F, 0F, -3.8F, -0.7F, 0F, -4F, 0.5F, 0F, -3F, 0.5F); // Box 136
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, 0F, -2.5F, 2, 1, 5, 0F,-0.5F, 0.8F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, 2F, 0.8F, 0F, -0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 2F, 0.5F, 0.2F); // Box 189
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2F, 9F, -3.6F, 4, 4, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 136
		bodyModel[21].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 163
		leftArmModel[1] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 165
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 166
		leftArmModel[3] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 167
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 191

		leftArmModel[0].addShapeBox(-1F, 2F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F); // Box 163
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(3F, -2F, -2F, 1, 5, 4, 0F,-0.2F, 0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, -0.1F, 0.8F, 1.2F, 0F, 0.7F, 1.2F, 0F, 0.7F, -0.2F, -0.1F, 0.8F); // Box 165
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(0.3F, 3F, -2F, 5, 2, 4, 0F,1F, 0.5F, 1.1F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, 1F, 0.5F, 1.1F, -3F, 0F, 1F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, -3F, 0F, 1F); // Box 166
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -2F, -3F, 4, 5, 6, 0F,0.5F, 0.7F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.5F, 0.7F, -0.5F, -0.3F, -0.5F, 0.1F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, -0.3F, -0.5F, 0.1F); // Box 167
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(0.3F, 3.3F, -2F, 5, 2, 4, 0F,1F, 0.5F, 1F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0.6F, 1F, 0.5F, 1F, -3F, 0F, 0.9F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, -3F, 0F, 0.9F); // Box 191
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 97
		rightArmModel[1] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 33
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 34
		rightArmModel[3] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 35
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 190

		rightArmModel[0].addShapeBox(-2F, 2F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F); // Box 97
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4F, -2F, -2F, 1, 5, 4, 0F,0F, -0.5F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, 0.2F, 0.5F, 0F, -0.5F, 0.5F, 1.2F, 0F, 0.7F, -0.2F, -0.1F, 0.8F, -0.2F, -0.1F, 0.8F, 1.2F, 0F, 0.7F); // Box 33
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-5.3F, 3F, -2F, 5, 2, 4, 0F,-0.1F, 0F, 0.7F, 1F, 0.5F, 1.1F, 1F, 0.5F, 1.1F, -0.1F, 0F, 0.7F, 0.5F, 0.5F, 0.5F, -3F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0.5F, 0.5F); // Box 34
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2F, -3F, 4, 5, 6, 0F,0.2F, 0.2F, -0.5F, 0.5F, 0.7F, -0.5F, 0.5F, 0.7F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, -0.1F, -0.2F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, 0.2F, -0.1F, -0.2F); // Box 35
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-5.3F, 3.3F, -2F, 5, 2, 4, 0F,-0.1F, 0F, 0.6F, 1F, 0.5F, 1F, 1F, 0.5F, 1F, -0.1F, 0F, 0.6F, 0.5F, 0.5F, 0.4F, -3F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0.5F, 0.4F); // Box 190
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 58

		leftLegModel[0].addShapeBox(-2F, -1F, -2F, 4, 11, 4, 0F,-0.1F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.3F, -1F, 2.2F, 2.5F, -2F, 1.5F, 2.5F, -2F, 1.5F, -0.3F, -1F, 2.2F); // Box 58
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 69

		rightLegModel[0].addShapeBox(-2F, -1F, -2F, 4, 11, 4, 0F,0.5F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, -0.1F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 2.5F, -2F, 1.5F, -0.3F, -1F, 2.2F, -0.3F, -1F, 2.2F, 2.5F, -2F, 1.5F); // Box 69
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}