//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AustriaNapoleonic
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAustriaNapoleonic extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelAustriaNapoleonic() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[16];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
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
		bodyModel[0] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 51
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 34
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 37
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 52
		bodyModel[5] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 116
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 118
		bodyModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 119
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 120
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 121
		bodyModel[10] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 122
		bodyModel[11] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 127
		bodyModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 128
		bodyModel[13] = new ModelRendererTurbo(this, 44, 1, textureX, textureY); // Box 129
		bodyModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 134
		bodyModel[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 135

		bodyModel[0].addShapeBox(0F, -0.2F, -2F, 4, 8, 4, 0F,0.5F, 0.25F, 0.5F, 0.7F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0.5F); // Box 51
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.5F, -2.5F, 2, 11, 5, 0F,0.3F, -0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 0.3F, -0.1F, 0.2F, -8.7F, 1.8F, 0.4F, 6.5F, -0.5F, 0.4F, 6.6F, 1.8F, 0.8F, -8.4F, 3.8F, 0.8F); // Box 34
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0.25F, 0.8F, 0.7F, 0.1F, 0.8F, 0.7F, 0.1F, 0.8F, 0F, 0.2F, 0.8F); // Box 37
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, -1.2F, -2F, 6, 1, 4, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F); // Box 15
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(0F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.4F, 0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F); // Box 52
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 10F, 0F, 4, 4, 2, 0F,-0.5F, -0.25F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.1F, 0.8F, 0F, -0.2F, 0.8F, 0.5F, 0.5F, 0.5F, -0.4F, 0.2F, 0.5F, 0F, 0.2F, 1F, 0F, 0.5F, 1.2F); // Box 116
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.75F, 1F, -2.9F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 118
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.75F, 3F, -2.9F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 119
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.75F, 5F, -2.9F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 120
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.75F, 7F, -2.9F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 121
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.75F, 9F, -3.1F, 1, 1, 1, 0F,-0.7F, -0.2F, -0.300000000000001F, 0.2F, -0.2F, -0.300000000000002F, 0.2F, -0.2F, -0.300000000000001F, -0.7F, -0.2F, -0.300000000000001F, -0.7F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.299999999999999F, 0.2F, -0.3F, -0.300000000000001F, -0.7F, -0.3F, -0.300000000000001F); // Box 122
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.4F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.2F, 0.2F); // Box 127
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.3F, 0.2F, 0.5F, 0.7F, 0.1F, 0.8F, 0.5F, 0.25F, 0.8F, 0F, 0.2F, 0.8F, 0.7F, 0.1F, 0.8F); // Box 128
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, -0.2F, -2F, 4, 8, 4, 0F,0.7F, 0.1F, 0.4F, 0.5F, 0.25F, 0.4F, 0F, 0.2F, 0.5F, 0.7F, 0.1F, 0.5F, 0.3F, 0F, 0.5F, 0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.5F, 0.3F, 0F, 0.5F); // Box 129
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 10F, 0F, 4, 4, 2, 0F,0.7F, -0.1F, 0.8F, -0.5F, -0.25F, 0.8F, 0F, -0.2F, 0.8F, 0.7F, -0.1F, 0.8F, -0.4F, 0.2F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 1.2F, 0F, 0.2F, 1F); // Box 134
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(2F, -0.5F, -2.5F, 2, 11, 5, 0F,-0.3F, 0.1F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 6.5F, -0.5F, 0.4F, -8.7F, 1.8F, 0.4F, -8F, 3.8F, 0.8F, 6.5F, 1.8F, 0.8F); // Box 135
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 43
		leftArmModel[1] = new ModelRendererTurbo(this, 19, 18, textureX, textureY); // Box 44
		leftArmModel[2] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 45
		leftArmModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 26
		leftArmModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 74

		leftArmModel[0].addShapeBox(-2F, -2.5F, -1.5F, 4, 2, 3, 0F,0F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F); // Box 43
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F,0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.2F, 1.1F, 0.2F, 0.3F, 0.9F, 0.2F, 0.3F, 0.9F, 0.2F, 0.2F, 1.1F, 0.2F); // Box 44
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 7.5F, -2F, 4, 1, 4, 0F,0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F); // Box 45
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(3F, 6.5F, -0.5F, 1, 1, 1, 0F,-0.200000000000001F, -0.4F, -0.3F, -0.600000000000002F, -0.4F, -0.3F, -0.600000000000001F, -0.4F, -0.0999999999999996F, -0.299999999999999F, -0.4F, -0.1F, 0.100000000000002F, 0F, -0.3F, -0.599999999999999F, -1.02140518265514E-14F, -0.3F, -0.600000000000001F, 0F, -0.0999999999999996F, 0.100000000000001F, 0F, -0.1F); // Box 26
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(3F, 5F, -0.5F, 1, 1, 1, 0F,-0.200000000000001F, -0.4F, -0.3F, -0.600000000000002F, -0.4F, -0.3F, -0.600000000000001F, -0.4F, -0.0999999999999996F, -0.299999999999999F, -0.4F, -0.1F, 0.100000000000002F, 0F, -0.3F, -0.599999999999999F, -1.02140518265514E-14F, -0.3F, -0.600000000000001F, 0F, -0.0999999999999996F, 0.100000000000001F, 0F, -0.1F); // Box 74
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 19, 18, textureX, textureY); // Box 130
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 131
		rightArmModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 132
		rightArmModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 133
		rightArmModel[4] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 38

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.9F, 0.2F, 0.2F, 1.1F, 0.2F, 0.2F, 1.1F, 0.2F, 0.3F, 0.9F, 0.2F); // Box 130
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7.5F, -2F, 4, 1, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F); // Box 131
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4F, 5F, -0.5F, 1, 1, 1, 0F,-0.600000000000002F, -0.4F, -0.3F, -0.200000000000001F, -0.4F, -0.3F, -0.299999999999999F, -0.4F, -0.1F, -0.600000000000001F, -0.4F, -0.0999999999999996F, -0.599999999999999F, -1.02140518265514E-14F, -0.3F, 0.100000000000002F, 0F, -0.3F, 0.100000000000001F, 0F, -0.1F, -0.600000000000001F, 0F, -0.0999999999999996F); // Box 132
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-4F, 6.5F, -0.5F, 1, 1, 1, 0F,-0.600000000000002F, -0.4F, -0.3F, -0.200000000000001F, -0.4F, -0.3F, -0.299999999999999F, -0.4F, -0.1F, -0.600000000000001F, -0.4F, -0.0999999999999996F, -0.599999999999999F, -1.02140518265514E-14F, -0.3F, 0.100000000000002F, 0F, -0.3F, 0.100000000000001F, 0F, -0.1F, -0.600000000000001F, 0F, -0.0999999999999996F); // Box 133
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-2F, -2.5F, -1.5F, 4, 2, 3, 0F,0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F); // Box 38
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 40
		leftLegModel[1] = new ModelRendererTurbo(this, 25, 5, textureX, textureY); // Box 41
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 42
		leftLegModel[3] = new ModelRendererTurbo(this, 65, 22, textureX, textureY); // Box 50

		leftLegModel[0].addShapeBox(-2F, -0.5F, -2F, 4, 5, 4, 0F,0.4F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F); // Box 40
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 6, 5, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, -0.8F, 0.4F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F); // Box 41
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 42
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7.8F, -2F, 4, 3, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 50
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 123
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 5, textureX, textureY); // Box 124
		rightLegModel[2] = new ModelRendererTurbo(this, 65, 22, textureX, textureY); // Box 125
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 126

		rightLegModel[0].addShapeBox(-2F, -0.5F, -2F, 4, 5, 4, 0F,0.4F, 0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, -0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F); // Box 123
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 6, 5, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, -0.8F, 0.4F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F); // Box 124
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7.8F, -2F, 4, 3, 4, 0F,0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 125
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 126
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}