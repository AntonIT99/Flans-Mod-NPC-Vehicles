//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PolishDuck
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPolishDuck extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelPolishDuck() //Same as Filename
	{
		headModel = new ModelRendererTurbo[36];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 259
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 30
		headModel[4] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 31
		headModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		headModel[6] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 24
		headModel[7] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 21
		headModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		headModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 28
		headModel[10] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 22
		headModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 49
		headModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 44
		headModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		headModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 22
		headModel[15] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 23
		headModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 24
		headModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 24
		headModel[18] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 25
		headModel[19] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 26
		headModel[20] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 28
		headModel[21] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 29
		headModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		headModel[23] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 32
		headModel[24] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 33
		headModel[25] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 34
		headModel[26] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 35
		headModel[27] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 36
		headModel[28] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 37
		headModel[29] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 38
		headModel[30] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 39
		headModel[31] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 40
		headModel[32] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 41
		headModel[33] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 42
		headModel[34] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 43
		headModel[35] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 44

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5F, -4F, 8, 1, 8, 0F,1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, -0.8F, 1F, 1F, -0.8F, 1F, 1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 259
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.5F, -4F, 8, 2, 8, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0.4F, 0.8F, 0.8F, 0.4F, 0.8F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -5.3F, -5F, 10, 1, 1, 0F,0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F); // Box 30
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.85F, -5F, -4F, 1, 3, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0.2F, -1F, 0.3F, -0.6F, -1F, 0.3F, -0.6F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 31
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -5F, -7F, 10, 1, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 23
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4.9F, -9F, 8, 1, 2, 0F,-3F, -0.4F, 0F, -3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3F, -0.4F, 0F, -3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 24
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5.1F, -1F, -4F, 1, 2, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.5F, -0.2F, -0.8F, -0.5F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0.5F, -2.5F, -0.2F, 0.5F, -2.5F); // Box 21
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -8F, -5.5F, 1, 6, 1, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F, 0.2F, -0.3F, -0.2F); // Box 27
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-2F, -2.5F, -5.5F, 2, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 28
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -11.5F, -4F, 8, 1, 8, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 22
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-0.5F, -12.2F, -0.5F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F); // Box 49
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -12.3F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -10.5F, -4F, 8, 2, 8, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 21
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-0.5F, -10F, -5.5F, 1, 2, 1, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 22
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -12F, -5.5F, 1, 2, 1, 0F,0.2F, 0F, -1.2F, 0.2F, 0F, -1.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 23
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -14F, -5.5F, 1, 2, 1, 0F,0.2F, -0.5F, -2.4F, 0.2F, -0.5F, -2.4F, 0.2F, -0.7F, 2F, 0.2F, -0.7F, 2F, 0.2F, 0F, -1.2F, 0.2F, 0F, -1.2F, 0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F); // Box 24
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -4.5F, 2.7F, 8, 2, 2, 0F,0.7F, 0F, 1.5F, 0.7F, 0F, 1.5F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.7F, 0.7F, 0F, -0.7F, 0.7F, 0F, 0.2F, 0.7F, 0F, 0.2F); // Box 24
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -2.5F, 4F, 8, 2, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, -0.5F, -1.4F, 0.3F, -0.5F, -1.4F, 0.3F, -0.5F, 1.2F, 0.3F, -0.5F, 1.2F); // Box 25
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-3.5F, -1F, 5.5F, 7, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.7F, -2F, 0F, -0.7F, -2F, 0F, -0.5F, 1.7F, 0F, -0.5F, 1.7F); // Box 26
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4.5F, -6.5F, -5.5F, 9, 2, 1, 0F,0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4F, -2.5F, -5.5F, 2, 2, 1, 0F,0.3F, 0.5F, -0.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0.5F, 0.3F, 0.5F, 0F, -0.9F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0.5F, 0F, 0.3F); // Box 29
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-2F, 0F, -5.5F, 4, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.9F, -1.5F, 0F, 0.9F, -1.5F); // Box 31
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4F, 0F, -5.5F, 2, 1, 1, 0F,0.5F, 0.5F, -0.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, 0.5F, 0.3F, 1F, 0.2F, 0.5F, 0F, 0.5F, 1F, 0F, 0.9F, -1.5F, 1F, 0.6F, -1F); // Box 32
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-2F, 1.2F, -8.5F, 4, 1, 2, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.51F, 0F, -0.3F, 0.51F); // Box 33
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-5F, 1.2F, -8.5F, 3, 1, 2, 0F,0.5F, -0.3F, -0.8F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.5F, 0.5F, -0.4F, -0.8F, 0F, 0F, 0F, 0F, -0.3F, 0.51F, 0F, -0.6F, 1.01F); // Box 34
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-4.85F, -4F, -4F, 1, 3, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0.2F, -1F, 0.3F, -0.6F, -1F, 0.3F, -0.6F, 0F, 0F, 0.2F, 0F, 0F); // Box 35
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-4.85F, -3F, -4F, 1, 3, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, -1F, 0.3F, -0.6F, -1F, 0.3F, -0.6F, 0F, -0.5F, 0.2F, 0F, -0.5F); // Box 36
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(0F, -2.5F, -5.5F, 2, 2, 1, 0F,0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 37
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(2F, -2.5F, -5.5F, 2, 2, 1, 0F,0F, 0F, -0.3F, 0.3F, 0.5F, -0.9F, 0.3F, 0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, 0.5F, 0F, -0.9F, 0.5F, 0F, 0.3F, 0F, 0.5F, -0.3F); // Box 38
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(2F, 0F, -5.5F, 2, 1, 1, 0F,0F, 0F, -0.3F, 0.5F, 0.5F, -0.9F, 0.5F, 0.5F, 0.3F, 0F, 0F, -0.3F, 0F, 0.5F, 1F, 1F, 0.2F, 0.5F, 1F, 0.6F, -1F, 0F, 0.9F, -1.5F); // Box 39
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(2F, 1.2F, -8.5F, 3, 1, 2, 0F,0F, -0.7F, 0F, 0.5F, -0.3F, -0.8F, 0F, 0F, 0.5F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0.5F, -0.4F, -0.8F, 0F, -0.6F, 1.01F, 0F, -0.3F, 0.51F); // Box 40
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(3.85F, -5F, -4F, 1, 3, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.6F, -1F, 0.3F, 0.2F, -1F, 0.3F, 0.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 41
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(3.85F, -4F, -4F, 1, 3, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.6F, -1F, 0.3F, 0.2F, -1F, 0.3F, 0.2F, 0F, 0F, -0.6F, 0F, 0F); // Box 42
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(3.85F, -3F, -4F, 1, 3, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.6F, -1F, 0.3F, 0.2F, -1F, 0.3F, 0.2F, 0F, -0.5F, -0.6F, 0F, -0.5F); // Box 43
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(4.1F, -1F, -4F, 1, 2, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.5F, -0.2F, -0.8F, -0.5F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0.5F, -2.5F, -0.2F, 0.5F, -2.5F); // Box 44
		headModel[35].setRotationPoint(0F, 0F, 0F);
	}
}