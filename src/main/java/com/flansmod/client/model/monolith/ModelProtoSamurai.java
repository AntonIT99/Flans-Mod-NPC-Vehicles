//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ProtoSamurai
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelProtoSamurai extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelProtoSamurai() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];
		leftArmModel = new ModelRendererTurbo[17];
		rightArmModel = new ModelRendererTurbo[17];
		leftLegModel = new ModelRendererTurbo[61];
		rightLegModel = new ModelRendererTurbo[61];
		skirtFrontModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 45
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 89
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 90
		bodyModel[8] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 54
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 55
		bodyModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 60
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 61
		bodyModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 62
		bodyModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 63
		bodyModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 64
		bodyModel[15] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 65
		bodyModel[16] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 140
		bodyModel[17] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 142
		bodyModel[18] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 233

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-5F, -0.5F, 1F, 5, 4, 1, 0F,0.6F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0.6F, 0F, 1.5F, 0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.7F, 0.3F, 0F, 1F); // Box 13
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 3.5F, -2F, 4, 3, 1, 0F,-0.1F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, -1F, -0.1F, 0F, -1F, 0.8F, -0.5F, 0.5F, 0F, -0.49F, 0.8F, 0F, -0.5F, 1F, 0.8F, -0.5F, 1F); // Box 14
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 6.5F, -2F, 4, 2, 4, 0F,0.8F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1.4F, 0.8F, 0.5F, 0.9F, 0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0.2F, 0.5F, 0.4F); // Box 15
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 3.5F, 1F, 4, 3, 1, 0F,1.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.7F, 1.3F, 0F, 1F, 0.8F, -0.5F, 1.1F, 0F, 0.51F, 1.1F, 0F, -0.5F, 1.4F, 0.8F, -0.5F, 0.9F); // Box 45
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 1.5F, -2F, 4, 2, 1, 0F,-0.4F, -0.2F, 0.5F, 0F, -0.2F, 0.8F, 0F, -0.2F, 2F, -0.4F, -0.2F, 1F, -0.1F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 1.7F, -0.1F, 0F, 1F); // Box 46
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.5F, 9F, -3F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 89
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 8.5F, -3.7F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 1.7F, -2.9F, 1, 7, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 54
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.8F, 1.2F, -2.9F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 55
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.2F, 1.2F, -2.9F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 60
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 1.5F, -2F, 4, 2, 1, 0F,0F, -0.2F, 0.8F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, 0F, 0.8F, -0.1F, 0F, 0.6F, -0.1F, 0F, 1F, 0F, 0F, 1.7F); // Box 61
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 3.5F, -2F, 4, 3, 1, 0F,0F, 0F, 0.8F, -0.1F, 0F, 0.6F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, -0.49F, 0.8F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 62
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 6.5F, -2F, 4, 2, 4, 0F,0F, 0.5F, 0.8F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.9F, 0F, 0.5F, 1.4F, 0F, 0.5F, 0.8F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.4F, 0F, 0.5F, 0.8F); // Box 63
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 3.5F, 1F, 4, 3, 1, 0F,0F, 0F, -1F, 1.3F, 0F, -1F, 1.3F, 0F, 1F, 0F, 0F, 1.7F, 0F, 0.51F, 1.1F, 0.8F, -0.5F, 1.1F, 0.8F, -0.5F, 0.9F, 0F, -0.5F, 1.4F); // Box 64
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, -0.5F, 1F, 5, 4, 1, 0F,0F, 0F, -2.5F, 0.6F, 0F, -2F, 0.6F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 1F, 0F, 0F, 1.7F); // Box 65
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, -0.5F, -2F, 8, 3, 5, 0F,-0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, 1.5F, 0.2F, 0.5F, 1.5F, 0.2F, 0.5F, -0.2F, -1F, 0.7F, -0.2F, -1F, 0.7F, 1.5F, -2.5F, 0.5F, 1.5F, -2.5F, 0.5F); // Box 140
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4.1F, -0.5F, -2F, 2, 3, 5, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.5F, 0.3F, 0.5F, 1.5F, 0.3F, 0.5F, -0.2F, -1F, 0.8F, -0.2F, -1F, 0.8F, -0.5F, -2.5F, 0.6F, 1.5F, -2.5F, 0.6F); // Box 142
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2.1F, -0.5F, -2F, 2, 3, 5, 0F,-0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 1.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, -0.2F, -1F, 0.8F, -0.2F, -1F, 0.8F, 1.5F, -2.5F, 0.6F, -0.5F, -2.5F, 0.6F); // Box 233
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 234
		leftArmModel[1] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 235
		leftArmModel[2] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 236
		leftArmModel[3] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 237
		leftArmModel[4] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 238
		leftArmModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 239
		leftArmModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 240
		leftArmModel[7] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 241
		leftArmModel[8] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 242
		leftArmModel[9] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 243
		leftArmModel[10] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 244
		leftArmModel[11] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 245
		leftArmModel[12] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 246
		leftArmModel[13] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 247
		leftArmModel[14] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 248
		leftArmModel[15] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 249
		leftArmModel[16] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 250

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 3, 4, 0F,0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F); // Box 234
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 0.9F, -2F, 4, 1, 4, 0F,0.35F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F); // Box 235
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 2.6F, -2F, 4, 1, 4, 0F,0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.35F, 0F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, -0.3F, 0.35F, 0.35F, 0F, 0.35F); // Box 236
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 1.8F, -2F, 4, 1, 4, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F); // Box 237
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 3.4F, -2F, 4, 1, 4, 0F,0.35F, -0.2F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, -0.2F, 0.35F, 0.1F, -0.2F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.35F, 0.1F, 0.1F, -0.2F, 0.1F); // Box 238
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, 4F, -2F, 4, 4, 4, 0F,0.25F, -0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.25F, -0.1F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 239
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F); // Box 240
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(2F, 8F, -2F, 1, 2, 4, 0F,-0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.8F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F, -0.8F, -0.4F, 0.1F); // Box 241
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(2.7F, -2.5F, -3F, 1, 1, 6, 0F,0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F); // Box 242
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(3F, -1.8F, -3F, 1, 1, 6, 0F,-0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 243
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(3F, -0.8F, -3F, 1, 1, 6, 0F,-0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 244
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(3F, 0.2F, -3F, 1, 1, 6, 0F,-0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 245
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(3F, 1.2F, -3F, 1, 1, 6, 0F,-0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 246
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(3F, 2.2F, -3F, 1, 1, 6, 0F,-0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 247
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(1.6F, -2.9F, -3F, 1, 1, 6, 0F,0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F); // Box 248
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(0.6F, -2.9F, -3F, 1, 1, 6, 0F,0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F); // Box 249
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(-0.4F, -2.9F, -3F, 1, 1, 6, 0F,0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F); // Box 250
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 29
		rightArmModel[1] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 52
		rightArmModel[2] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 53
		rightArmModel[3] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 56
		rightArmModel[4] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 126
		rightArmModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 127
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 128
		rightArmModel[7] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 129
		rightArmModel[8] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 116
		rightArmModel[9] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 117
		rightArmModel[10] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 118
		rightArmModel[11] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 166
		rightArmModel[12] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 167
		rightArmModel[13] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 168
		rightArmModel[14] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 169
		rightArmModel[15] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 170
		rightArmModel[16] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 171

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 3, 4, 0F,0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F); // Box 29
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 0.9F, -2F, 4, 1, 4, 0F,0.35F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0.35F, -0.5F, 0.35F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F); // Box 52
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 2.6F, -2F, 4, 1, 4, 0F,0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.1F, 0.35F, 0.1F, 0.35F, -0.3F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, -0.3F, 0.35F); // Box 53
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 1.8F, -2F, 4, 1, 4, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F); // Box 56
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 3.4F, -2F, 4, 1, 4, 0F,0.35F, 0.1F, 0.35F, 0.35F, -0.2F, 0.35F, 0.35F, -0.2F, 0.35F, 0.35F, 0.1F, 0.35F, 0.1F, -0.35F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.1F, -0.35F, 0.1F); // Box 126
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 4F, -2F, 4, 4, 4, 0F,0.5F, 0.3F, 0.3F, 0.25F, -0.1F, 0.3F, 0.25F, -0.1F, 0.3F, 0.5F, 0.3F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 127
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F,0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F); // Box 128
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 8F, -2F, 1, 2, 4, 0F,0.1F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, -0.4F, 0.1F, -0.8F, -0.4F, 0.1F, -0.8F, -0.4F, 0.1F, 0.3F, -0.4F, 0.1F); // Box 129
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-4F, -1.8F, -3F, 1, 1, 6, 0F,0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F); // Box 116
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3.7F, -2.5F, -3F, 1, 1, 6, 0F,-0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 117
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-2.7F, -2.9F, -3F, 1, 1, 6, 0F,0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F); // Box 118
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-4F, -0.8F, -3F, 1, 1, 6, 0F,0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F); // Box 166
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-4F, 0.2F, -3F, 1, 1, 6, 0F,0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F); // Box 167
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-4F, 1.2F, -3F, 1, 1, 6, 0F,0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F); // Box 168
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-4F, 2F, -3F, 1, 1, 6, 0F,0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F); // Box 169
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-1.7F, -2.9F, -3F, 1, 1, 6, 0F,0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F); // Box 170
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-0.7F, -2.9F, -3F, 1, 1, 6, 0F,0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0F, 0F); // Box 171
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 172
		leftLegModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 173
		leftLegModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 174
		leftLegModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 175
		leftLegModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 176
		leftLegModel[5] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 177
		leftLegModel[6] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 178
		leftLegModel[7] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 179
		leftLegModel[8] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 180
		leftLegModel[9] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 181
		leftLegModel[10] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 182
		leftLegModel[11] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 183
		leftLegModel[12] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 184
		leftLegModel[13] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 185
		leftLegModel[14] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 186
		leftLegModel[15] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 187
		leftLegModel[16] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 188
		leftLegModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 189
		leftLegModel[18] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 190
		leftLegModel[19] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 191
		leftLegModel[20] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 192
		leftLegModel[21] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 193
		leftLegModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 194
		leftLegModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 195
		leftLegModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 196
		leftLegModel[25] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 197
		leftLegModel[26] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 198
		leftLegModel[27] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 199
		leftLegModel[28] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 200
		leftLegModel[29] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 201
		leftLegModel[30] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 202
		leftLegModel[31] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 203
		leftLegModel[32] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 204
		leftLegModel[33] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 205
		leftLegModel[34] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 206
		leftLegModel[35] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 207
		leftLegModel[36] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 208
		leftLegModel[37] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 209
		leftLegModel[38] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 210
		leftLegModel[39] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 211
		leftLegModel[40] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 212
		leftLegModel[41] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 213
		leftLegModel[42] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 214
		leftLegModel[43] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 215
		leftLegModel[44] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 216
		leftLegModel[45] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 217
		leftLegModel[46] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 218
		leftLegModel[47] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 219
		leftLegModel[48] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 220
		leftLegModel[49] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 221
		leftLegModel[50] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 222
		leftLegModel[51] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 223
		leftLegModel[52] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 224
		leftLegModel[53] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 225
		leftLegModel[54] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 226
		leftLegModel[55] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 227
		leftLegModel[56] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 228
		leftLegModel[57] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 229
		leftLegModel[58] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 230
		leftLegModel[59] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 231
		leftLegModel[60] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 232

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 172
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 173
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 174
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 6.5F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 175
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.2F, 1.5F, 0.2F, -1.2F, 1.5F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 1.2F, 0.2F, 0F, 1.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 176
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, -2F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 177
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 5.7F, -2F, 4, 1, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 178
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.4F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 179
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2.4F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 180
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2.4F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 181
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-1.4F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 182
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-0.4F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 183
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(0.6F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 184
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(-1.3F, 0F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 185
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(-2.4F, 0F, -2.35F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 186
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);

		leftLegModel[15].addShapeBox(1.7F, 0F, -1.7F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 187
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);

		leftLegModel[16].addShapeBox(1.7F, 0F, -0.7F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 188
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);

		leftLegModel[17].addShapeBox(1.7F, 0F, 0.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 189
		leftLegModel[17].setRotationPoint(0F, 0F, 0F);

		leftLegModel[18].addShapeBox(-2.3F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 190
		leftLegModel[18].setRotationPoint(0F, 0F, 0F);

		leftLegModel[19].addShapeBox(-1.3F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 191
		leftLegModel[19].setRotationPoint(0F, 0F, 0F);

		leftLegModel[20].addShapeBox(-0.3F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 192
		leftLegModel[20].setRotationPoint(0F, 0F, 0F);

		leftLegModel[21].addShapeBox(0.7F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 193
		leftLegModel[21].setRotationPoint(0F, 0F, 0F);

		leftLegModel[22].addShapeBox(2.4F, 3.45F, -2.2F, 1, 2, 1, 0F,0.2F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 194
		leftLegModel[22].setRotationPoint(0F, 0F, 0F);

		leftLegModel[23].addShapeBox(-2.1F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F); // Box 195
		leftLegModel[23].setRotationPoint(0F, 0F, 0F);

		leftLegModel[24].addShapeBox(-2.3F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 196
		leftLegModel[24].setRotationPoint(0F, 0F, 0F);

		leftLegModel[25].addShapeBox(0.7F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 197
		leftLegModel[25].setRotationPoint(0F, 0F, 0F);

		leftLegModel[26].addShapeBox(-0.3F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 198
		leftLegModel[26].setRotationPoint(0F, 0F, 0F);

		leftLegModel[27].addShapeBox(-1.3F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 199
		leftLegModel[27].setRotationPoint(0F, 0F, 0F);

		leftLegModel[28].addShapeBox(-2.3F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 200
		leftLegModel[28].setRotationPoint(0F, 0F, 0F);

		leftLegModel[29].addShapeBox(-1.3F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 201
		leftLegModel[29].setRotationPoint(0F, 0F, 0F);

		leftLegModel[30].addShapeBox(-0.3F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 202
		leftLegModel[30].setRotationPoint(0F, 0F, 0F);

		leftLegModel[31].addShapeBox(0.7F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 203
		leftLegModel[31].setRotationPoint(0F, 0F, 0F);

		leftLegModel[32].addShapeBox(2F, 1.5F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 204
		leftLegModel[32].setRotationPoint(0F, 0F, 0F);

		leftLegModel[33].addShapeBox(2F, 1.5F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 205
		leftLegModel[33].setRotationPoint(0F, 0F, 0F);

		leftLegModel[34].addShapeBox(2F, 1.5F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 206
		leftLegModel[34].setRotationPoint(0F, 0F, 0F);

		leftLegModel[35].addShapeBox(2F, 1.5F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 207
		leftLegModel[35].setRotationPoint(0F, 0F, 0F);

		leftLegModel[36].addShapeBox(1.6F, -1.5F, -1.7F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 208
		leftLegModel[36].setRotationPoint(0F, 0F, 0F);

		leftLegModel[37].addShapeBox(1.6F, -1.5F, -0.7F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 209
		leftLegModel[37].setRotationPoint(0F, 0F, 0F);

		leftLegModel[38].addShapeBox(1.6F, -1.5F, 0.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 210
		leftLegModel[38].setRotationPoint(0F, 0F, 0F);

		leftLegModel[39].addShapeBox(1.7F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 211
		leftLegModel[39].setRotationPoint(0F, 0F, 0F);

		leftLegModel[40].addShapeBox(1.9F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 212
		leftLegModel[40].setRotationPoint(0F, 0F, 0F);

		leftLegModel[41].addShapeBox(0.9F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 213
		leftLegModel[41].setRotationPoint(0F, 0F, 0F);

		leftLegModel[42].addShapeBox(-0.100000000000001F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 214
		leftLegModel[42].setRotationPoint(0F, 0F, 0F);

		leftLegModel[43].addShapeBox(-1.1F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 215
		leftLegModel[43].setRotationPoint(0F, 0F, 0F);

		leftLegModel[44].addShapeBox(-2.1F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 216
		leftLegModel[44].setRotationPoint(0F, 0F, 0F);

		leftLegModel[45].addShapeBox(2.4F, 3.45F, -1.2F, 1, 2, 1, 0F,0.2F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 217
		leftLegModel[45].setRotationPoint(0F, 0F, 0F);

		leftLegModel[46].addShapeBox(2.4F, 3.45F, -0.2F, 1, 2, 1, 0F,0.2F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 218
		leftLegModel[46].setRotationPoint(0F, 0F, 0F);

		leftLegModel[47].addShapeBox(2.4F, 3.45F, 0.8F, 1, 2, 1, 0F,0.2F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 219
		leftLegModel[47].setRotationPoint(0F, 0F, 0F);

		leftLegModel[48].addShapeBox(-1.1F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F); // Box 220
		leftLegModel[48].setRotationPoint(0F, 0F, 0F);

		leftLegModel[49].addShapeBox(-0.100000000000001F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F); // Box 221
		leftLegModel[49].setRotationPoint(0F, 0F, 0F);

		leftLegModel[50].addShapeBox(0.9F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F); // Box 222
		leftLegModel[50].setRotationPoint(0F, 0F, 0F);

		leftLegModel[51].addShapeBox(1.9F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F); // Box 223
		leftLegModel[51].setRotationPoint(0F, 0F, 0F);

		leftLegModel[52].addShapeBox(1.7F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 224
		leftLegModel[52].setRotationPoint(0F, 0F, 0F);

		leftLegModel[53].addShapeBox(1.7F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 225
		leftLegModel[53].setRotationPoint(0F, 0F, 0F);

		leftLegModel[54].addShapeBox(-0.3F, 0F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 226
		leftLegModel[54].setRotationPoint(0F, 0F, 0F);

		leftLegModel[55].addShapeBox(-0.4F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 227
		leftLegModel[55].setRotationPoint(0F, 0F, 0F);

		leftLegModel[56].addShapeBox(0.7F, 0F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 228
		leftLegModel[56].setRotationPoint(0F, 0F, 0F);

		leftLegModel[57].addShapeBox(0.6F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 229
		leftLegModel[57].setRotationPoint(0F, 0F, 0F);

		leftLegModel[58].addShapeBox(1.7F, 0F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 230
		leftLegModel[58].setRotationPoint(0F, 0F, 0F);

		leftLegModel[59].addShapeBox(1.6F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 231
		leftLegModel[59].setRotationPoint(0F, 0F, 0F);

		leftLegModel[60].addShapeBox(1.6F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 232
		leftLegModel[60].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		rightLegModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		rightLegModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		rightLegModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 10
		rightLegModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 11
		rightLegModel[5] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 51
		rightLegModel[6] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 57
		rightLegModel[7] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 407
		rightLegModel[8] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 408
		rightLegModel[9] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 413
		rightLegModel[10] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 414
		rightLegModel[11] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 415
		rightLegModel[12] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 416
		rightLegModel[13] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 430
		rightLegModel[14] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 431
		rightLegModel[15] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 432
		rightLegModel[16] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 433
		rightLegModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 434
		rightLegModel[18] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 435
		rightLegModel[19] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 436
		rightLegModel[20] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 437
		rightLegModel[21] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 438
		rightLegModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 443
		rightLegModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 446
		rightLegModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 454
		rightLegModel[25] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 455
		rightLegModel[26] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 456
		rightLegModel[27] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 457
		rightLegModel[28] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 467
		rightLegModel[29] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 468
		rightLegModel[30] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 469
		rightLegModel[31] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 470
		rightLegModel[32] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 479
		rightLegModel[33] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 480
		rightLegModel[34] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 481
		rightLegModel[35] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 482
		rightLegModel[36] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 123
		rightLegModel[37] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 124
		rightLegModel[38] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 125
		rightLegModel[39] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 144
		rightLegModel[40] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 145
		rightLegModel[41] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 146
		rightLegModel[42] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 147
		rightLegModel[43] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 148
		rightLegModel[44] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 149
		rightLegModel[45] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 150
		rightLegModel[46] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 151
		rightLegModel[47] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 152
		rightLegModel[48] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 153
		rightLegModel[49] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 154
		rightLegModel[50] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 155
		rightLegModel[51] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 156
		rightLegModel[52] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 157
		rightLegModel[53] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 158
		rightLegModel[54] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 159
		rightLegModel[55] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 160
		rightLegModel[56] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 161
		rightLegModel[57] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 162
		rightLegModel[58] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 163
		rightLegModel[59] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 164
		rightLegModel[60] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 165

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 7
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 8
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 9
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 6.5F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 10
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.2F, 1.5F, 0.2F, -1.2F, 1.5F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 1.2F, 0.2F, 0F, 1.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, -2F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 51
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 5.7F, -2F, 4, 1, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 57
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-1.4F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 407
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.4F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 408
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2.4F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 413
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-1.4F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 414
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-0.4F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 415
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(0.6F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 416
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-1.6F, 0F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 430
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-2.7F, 0F, -2.35F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 431
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);

		rightLegModel[15].addShapeBox(-2.7F, 0F, -1.7F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 432
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);

		rightLegModel[16].addShapeBox(-2.7F, 0F, -0.7F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 433
		rightLegModel[16].setRotationPoint(0F, 0F, 0F);

		rightLegModel[17].addShapeBox(-2.7F, 0F, 0.5F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 434
		rightLegModel[17].setRotationPoint(0F, 0F, 0F);

		rightLegModel[18].addShapeBox(-2.6F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 435
		rightLegModel[18].setRotationPoint(0F, 0F, 0F);

		rightLegModel[19].addShapeBox(-1.6F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 436
		rightLegModel[19].setRotationPoint(0F, 0F, 0F);

		rightLegModel[20].addShapeBox(-0.6F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 437
		rightLegModel[20].setRotationPoint(0F, 0F, 0F);

		rightLegModel[21].addShapeBox(0.4F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 438
		rightLegModel[21].setRotationPoint(0F, 0F, 0F);

		rightLegModel[22].addShapeBox(-3.4F, 3.45F, -2.2F, 1, 2, 1, 0F,0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 443
		rightLegModel[22].setRotationPoint(0F, 0F, 0F);

		rightLegModel[23].addShapeBox(-2.9F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F); // Box 446
		rightLegModel[23].setRotationPoint(0F, 0F, 0F);

		rightLegModel[24].addShapeBox(-2.7F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 454
		rightLegModel[24].setRotationPoint(0F, 0F, 0F);

		rightLegModel[25].addShapeBox(0.3F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 455
		rightLegModel[25].setRotationPoint(0F, 0F, 0F);

		rightLegModel[26].addShapeBox(-0.7F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 456
		rightLegModel[26].setRotationPoint(0F, 0F, 0F);

		rightLegModel[27].addShapeBox(-1.7F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 457
		rightLegModel[27].setRotationPoint(0F, 0F, 0F);

		rightLegModel[28].addShapeBox(-2.7F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 467
		rightLegModel[28].setRotationPoint(0F, 0F, 0F);

		rightLegModel[29].addShapeBox(-1.7F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 468
		rightLegModel[29].setRotationPoint(0F, 0F, 0F);

		rightLegModel[30].addShapeBox(-0.7F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 469
		rightLegModel[30].setRotationPoint(0F, 0F, 0F);

		rightLegModel[31].addShapeBox(0.3F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 470
		rightLegModel[31].setRotationPoint(0F, 0F, 0F);

		rightLegModel[32].addShapeBox(-3F, 1.5F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 479
		rightLegModel[32].setRotationPoint(0F, 0F, 0F);

		rightLegModel[33].addShapeBox(-3F, 1.5F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 480
		rightLegModel[33].setRotationPoint(0F, 0F, 0F);

		rightLegModel[34].addShapeBox(-3F, 1.5F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 481
		rightLegModel[34].setRotationPoint(0F, 0F, 0F);

		rightLegModel[35].addShapeBox(-3F, 1.5F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 482
		rightLegModel[35].setRotationPoint(0F, 0F, 0F);

		rightLegModel[36].addShapeBox(-2.6F, -1.5F, -1.7F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 123
		rightLegModel[36].setRotationPoint(0F, 0F, 0F);

		rightLegModel[37].addShapeBox(-2.6F, -1.5F, -0.7F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 124
		rightLegModel[37].setRotationPoint(0F, 0F, 0F);

		rightLegModel[38].addShapeBox(-2.6F, -1.5F, 0.5F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 125
		rightLegModel[38].setRotationPoint(0F, 0F, 0F);

		rightLegModel[39].addShapeBox(1.3F, 1.5F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 144
		rightLegModel[39].setRotationPoint(0F, 0F, 0F);

		rightLegModel[40].addShapeBox(1.1F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 145
		rightLegModel[40].setRotationPoint(0F, 0F, 0F);

		rightLegModel[41].addShapeBox(0.1F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 146
		rightLegModel[41].setRotationPoint(0F, 0F, 0F);

		rightLegModel[42].addShapeBox(-0.9F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 147
		rightLegModel[42].setRotationPoint(0F, 0F, 0F);

		rightLegModel[43].addShapeBox(-1.9F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 148
		rightLegModel[43].setRotationPoint(0F, 0F, 0F);

		rightLegModel[44].addShapeBox(-2.9F, 3.45F, -2.9F, 1, 2, 1, 0F,0.1F, 0F, 0.5F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F); // Box 149
		rightLegModel[44].setRotationPoint(0F, 0F, 0F);

		rightLegModel[45].addShapeBox(-3.4F, 3.45F, -1.2F, 1, 2, 1, 0F,0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 150
		rightLegModel[45].setRotationPoint(0F, 0F, 0F);

		rightLegModel[46].addShapeBox(-3.4F, 3.45F, -0.2F, 1, 2, 1, 0F,0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 151
		rightLegModel[46].setRotationPoint(0F, 0F, 0F);

		rightLegModel[47].addShapeBox(-3.4F, 3.45F, 0.8F, 1, 2, 1, 0F,0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.3F, 0F, 0.1F); // Box 152
		rightLegModel[47].setRotationPoint(0F, 0F, 0F);

		rightLegModel[48].addShapeBox(-1.9F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F); // Box 153
		rightLegModel[48].setRotationPoint(0F, 0F, 0F);

		rightLegModel[49].addShapeBox(-0.9F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F); // Box 154
		rightLegModel[49].setRotationPoint(0F, 0F, 0F);

		rightLegModel[50].addShapeBox(0.1F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F); // Box 155
		rightLegModel[50].setRotationPoint(0F, 0F, 0F);

		rightLegModel[51].addShapeBox(1.1F, 3.45F, 2F, 1, 2, 1, 0F,0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.3F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.3F); // Box 156
		rightLegModel[51].setRotationPoint(0F, 0F, 0F);

		rightLegModel[52].addShapeBox(1.3F, 1.5F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 157
		rightLegModel[52].setRotationPoint(0F, 0F, 0F);

		rightLegModel[53].addShapeBox(1.4F, 0F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 158
		rightLegModel[53].setRotationPoint(0F, 0F, 0F);

		rightLegModel[54].addShapeBox(-0.6F, 0F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 159
		rightLegModel[54].setRotationPoint(0F, 0F, 0F);

		rightLegModel[55].addShapeBox(-0.4F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 160
		rightLegModel[55].setRotationPoint(0F, 0F, 0F);

		rightLegModel[56].addShapeBox(0.4F, 0F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 161
		rightLegModel[56].setRotationPoint(0F, 0F, 0F);

		rightLegModel[57].addShapeBox(0.6F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 162
		rightLegModel[57].setRotationPoint(0F, 0F, 0F);

		rightLegModel[58].addShapeBox(1.4F, 0F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 163
		rightLegModel[58].setRotationPoint(0F, 0F, 0F);

		rightLegModel[59].addShapeBox(1.6F, -1.5F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 164
		rightLegModel[59].setRotationPoint(0F, 0F, 0F);

		rightLegModel[60].addShapeBox(1.6F, -1.5F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 165
		rightLegModel[60].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 91
		skirtFrontModel[1] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 92

		skirtFrontModel[0].addShapeBox(-1F, -2F, -3.5F, 2, 5, 1, 0F,-0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -1.5F, 1.5F, 0.5F, 2F, 1F, 0.5F, 2F, 1F, 0F, -1.5F, 1.5F, 0F); // Box 91
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-1F, -2F, -3.4F, 2, 5, 1, 0F,0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 2F, 1F, 0.5F, -1.5F, 1.5F, 0.5F, -1.5F, 1.5F, 0F, 2F, 1F, 0F); // Box 92
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);
	}
}