//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PolishLancerNappy
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPolishLancerNappy extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelPolishLancerNappy() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[33];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 137
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 78
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 80
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 82
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 84
		bodyModel[5] = new ModelRendererTurbo(this, 80, 1, textureX, textureY); // Box 51
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 37
		bodyModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		bodyModel[8] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 52
		bodyModel[9] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 43
		bodyModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 116
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		bodyModel[12] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 119
		bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 120
		bodyModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 121
		bodyModel[15] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 122
		bodyModel[16] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 127
		bodyModel[17] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 128
		bodyModel[18] = new ModelRendererTurbo(this, 80, 14, textureX, textureY); // Box 129
		bodyModel[19] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 134
		bodyModel[20] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 135
		bodyModel[21] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 38
		bodyModel[22] = new ModelRendererTurbo(this, 115, 1, textureX, textureY); // Box 39
		bodyModel[23] = new ModelRendererTurbo(this, 116, 26, textureX, textureY); // Box 40
		bodyModel[24] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 46
		bodyModel[25] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 43
		bodyModel[28] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 44
		bodyModel[29] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 38

		bodyModel[0].addShapeBox(-3.25F, 0F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 137
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2.25F, 2F, -3.2F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 78
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2.25F, 4F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 80
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2.25F, 6F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 82
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2.25F, 8F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 84
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, -0.2F, -2F, 4, 7, 4, 0F,0F, 0.25F, 0.5F, 0.7F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0.5F); // Box 51
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 7F, -2F, 4, 2, 4, 0F,0F, 0F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0.25F, 0.4F, 0.5F, 0.1F, 0.4F, 0.5F, 0.1F, 0.8F, 0F, 0.2F, 0.8F); // Box 37
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3F, -1.2F, -2F, 6, 1, 4, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F); // Box 15
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 8.5F, -2F, 4, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F); // Box 52
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(3F, -0.5F, -1.5F, 4, 2, 3, 0F,0F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 9F, 0F, 4, 5, 2, 0F,-0.5F, -0.25F, 0.8F, 0.5F, -0.1F, 0.8F, 0.5F, -0.1F, 0.8F, 0F, -0.2F, 0.8F, 0.5F, 0.5F, 0.5F, -0.4F, 0.2F, 0.5F, 0F, 0.2F, 1F, 0F, 0.5F, 1.2F); // Box 116
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.25F, 0F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 118
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.25F, 2F, -3.2F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 119
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.25F, 4F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 120
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0.25F, 6F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 121
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0.25F, 8F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 122
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 8.5F, -2F, 4, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.2F, 0.2F); // Box 127
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 7F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.3F, 0.2F, 0.5F, 0.5F, 0.1F, 0.4F, 0F, 0.25F, 0.4F, 0F, 0.2F, 0.8F, 0.5F, 0.1F, 0.8F); // Box 128
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, -0.2F, -2F, 4, 7, 4, 0F,0.7F, 0.1F, 0.4F, 0F, 0.25F, 0.5F, 0F, 0.2F, 0.5F, 0.7F, 0.1F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0.3F, 0F, 0.5F); // Box 129
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 9F, 0F, 4, 5, 2, 0F,0.5F, -0.1F, 0.8F, -0.5F, -0.25F, 0.8F, 0F, -0.2F, 0.8F, 0.5F, -0.1F, 0.8F, -0.4F, 0.2F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 1.2F, 0F, 0.2F, 1F); // Box 134
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, -0.5F, -2.5F, 2, 9, 5, 0F,-0.3F, 0.1F, 0.4F, 0.3F, -0.1F, 0.4F, 0.3F, -0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 6.5F, -1.5F, 0.5F, -8.7F, 1.8F, 0.5F, -8.4F, 3.8F, 0.8F, 6.5F, 0.8F, 0.8F); // Box 135
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-7F, -0.5F, -1.5F, 4, 2, 3, 0F,0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 38
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-2F, 1.8F, -2.7F, 4, 7, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 39
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2F, -0.2F, -2.7F, 4, 2, 1, 0F,1.4F, 0.3F, -0.1F, 1.4F, 0.3F, -0.1F, 1.4F, 0.3F, 0F, 1.4F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 40
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.5F, 8.8F, -2.5F, 9, 2, 5, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 46
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-1.5F, 8.9F, -2.8F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 40
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1F, 8.9F, -2.8F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1F, 10.3F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 43
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0.5F, 8.9F, -2.8F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 44
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.5F, 6.5F, -3F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 35
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-5F, 6.5F, -3F, 2, 1, 1, 0F,-0.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.6F, -2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.6F, -2F, 0F); // Box 36
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-1F, 6.5F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, -0.5F, -0.5F, 0F); // Box 37
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(2F, 0.5F, -3F, 1, 6, 1, 0F,0.2F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, 0.5F, 0F, 1.5F, -1.5F, 0F, -2F, -0.8F, 0F, -2F, -0.8F, 0F, 1.5F, -1.5F, 0F); // Box 38
		bodyModel[32].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 19, 18, textureX, textureY); // Box 44
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 45
		leftArmModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 45
		leftArmModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 46

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 0.9F, 0.1F, 0.1F, 0.9F, 0.1F, 0.1F, 1.1F, 0.1F); // Box 44
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6.5F, -2F, 4, 2, 4, 0F,0.5F, 0.4F, 0.3F, 0.5F, 0.6F, 0.3F, 0.5F, 0.6F, 0.3F, 0.5F, 0.4F, 0.3F, 0F, 0.1F, 0.1F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.1F, 0F); // Box 45
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1.7F, -2.1F, -2F, 5, 2, 7, 0F,-2F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -2.8F, -2F, 0.2F, -2.8F, -2F, -0.4F, 0.4F, 0.7F, 0F, 0.4F, 0.7F, 0F, -2.6F, -2F, -0.4F, -2.6F); // Box 45
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -2.8F, -2F, 4, 1, 4, 0F,0F, 0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 46
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 19, 18, textureX, textureY); // Box 130
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 131
		rightArmModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 40
		rightArmModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 41

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.9F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 0.9F, 0.1F); // Box 130
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F,0.5F, 0.6F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.6F, 0.3F, 0F, 0.3F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F); // Box 131
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2.8F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.4F, 0F, -0.1F); // Box 40
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.3F, -2.1F, -2F, 5, 2, 7, 0F,0.2F, 0F, 0.2F, -2F, 0.2F, 0.2F, -2F, 0.2F, -2.8F, 0.2F, 0F, -2.8F, 0.7F, 0F, 0.4F, -2F, -0.4F, 0.4F, -2F, -0.4F, -2.6F, 0.7F, 0F, -2.6F); // Box 41
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 42
		leftLegModel[1] = new ModelRendererTurbo(this, 65, 22, textureX, textureY); // Box 50
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 47
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 48

		leftLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 42
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 9.8F, -2F, 4, 1, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 50
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, -0.5F, -2F, 4, 5, 4, 0F,0.4F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F); // Box 47
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 5F, -2F, 4, 6, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 123
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 124
		rightLegModel[2] = new ModelRendererTurbo(this, 65, 22, textureX, textureY); // Box 125
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 126

		rightLegModel[0].addShapeBox(-2F, -0.5F, -2F, 4, 5, 4, 0F,0.4F, 0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F); // Box 123
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 6, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 9.8F, -2F, 4, 1, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 125
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 126
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}