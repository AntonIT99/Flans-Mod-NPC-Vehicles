//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MughalLady
// Model Creator: 
// Created on: 26.03.2020 - 09:48:43
// Last changed on: 26.03.2020 - 09:48:43

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMughalLady extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMughalLady() //Same as Filename
	{
		headModel = new ModelRendererTurbo[36];
		bodyModel = new ModelRendererTurbo[60];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[7];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 6
		headModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 57
		headModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 59
		headModel[3] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 61
		headModel[4] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 86
		headModel[5] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 87
		headModel[6] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 67
		headModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 68
		headModel[8] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 70
		headModel[9] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 94
		headModel[10] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 95
		headModel[11] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 34
		headModel[12] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 35
		headModel[13] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 46
		headModel[14] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 48
		headModel[15] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 116
		headModel[16] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 117
		headModel[17] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 118
		headModel[18] = new ModelRendererTurbo(this, 55, 100, textureX, textureY); // Box 121
		headModel[19] = new ModelRendererTurbo(this, 55, 100, textureX, textureY); // Box 122
		headModel[20] = new ModelRendererTurbo(this, 55, 103, textureX, textureY); // Box 124
		headModel[21] = new ModelRendererTurbo(this, 55, 105, textureX, textureY); // Box 125
		headModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[23] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		headModel[24] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 4
		headModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		headModel[26] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 130
		headModel[27] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Box 132
		headModel[28] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 133
		headModel[29] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 134
		headModel[30] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 135
		headModel[31] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 136
		headModel[32] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 137
		headModel[33] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 138
		headModel[34] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 139
		headModel[35] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 140

		headModel[0].addShapeBox(-4F, -8.1F, -4F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -8.5F, -4.5F, 1, 2, 8, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 57
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8.5F, 2.5F, 8, 7, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 1F, 0.2F, 0.5F, 1F); // Box 59
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3.5F, -8.5F, -4.5F, 3, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 61
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, -8.5F, -4.5F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 86
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -8.5F, -1.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 87
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(0.5F, -8.5F, -4.5F, 3, 3, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F); // Box 67
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3.5F, -8.5F, -1.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 3F, 1F, 0F, 3F, 1F); // Box 68
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3.5F, -8.5F, -4.5F, 1, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 70
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -1F, 2.5F, 8, 3, 2, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2.8F, 0.5F, -1.5F, -2.8F, 0.5F, -1.5F, -2.8F, 0.5F, 1F, -2.8F, 0.5F, 1F); // Box 94
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1.5F, 2.5F, 3.5F, 3, 10, 2, 0F,-0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -2.5F, -0.3F, 0F, -2.5F, -0.3F, 0F, 2F, -0.3F, 0F, 2F); // Box 95
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5F, -8F, 5.5F, 10, 9, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 34
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5F, 1.3F, 5.5F, 10, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 35
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5.4F, 1.3F, 1.9F, 1, 3, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F); // Box 46
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4.4F, 1.3F, 1.9F, 1, 3, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 48
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4.35F, -8F, -5F, 1, 7, 11, 0F,-0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 2F, 0F, -0.4F, 2F, 0F, -0.4F, 4F, 0F, -0.4F, 4F, 0F); // Box 116
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-5.35F, -8F, -5F, 1, 7, 11, 0F,-0.4F, 0F, -4F, -0.4F, 0F, -4F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 2F, 0F, -0.4F, 2F, 0F, -0.4F, 4F, 0F, -0.4F, 4F, 0F); // Box 117
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-5F, -9.3F, -1.5F, 10, 1, 8, 0F,-0.5F, -0.5F, -2.4F, -0.5F, -0.5F, -2.4F, -0.5F, -0.5F, -2.4F, -0.5F, -0.5F, -2.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Box 118
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-3F, -4.1F, -4F, 2, 1, 1, 0F,0.3F, 0.1F, 0.05F, 0.1F, 0.1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.3F, 0.1F, 0.05F, 0.1F, 0.1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 121
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(1F, -4.1F, -4F, 2, 1, 1, 0F,0.1F, 0.1F, 0.05F, 0.3F, 0.1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0.1F, 0.1F, 0.05F, 0.3F, 0.1F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.05F); // Box 122
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-3F, -4.1F, -4F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 124
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(1F, -4.1F, -4F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 125
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-2.7F, -5.1F, -3.9F, 2, 1, 1, 0F,-0.2F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, 0.1F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F); // Box 18
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-3.2F, -5.1F, -3.9F, 1, 1, 1, 0F,0.2F, -0.6F, 0.2F, -0.3F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F, 0.3F, -0.1F, 0.2F, 0.4F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F); // Box 0
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(2.2F, -5.1F, -3.9F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0.4F, -0.4F, 0.2F, 0.3F, -0.1F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F); // Box 4
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(0.7F, -5.1F, -3.9F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, -0.2F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0.1F, 0F, 0.2F, -0.3F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F); // Box 5
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-1F, -7.5F, -4.8F, 1, 2, 1, 0F,-0.3F, -0.9F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.9F, 0F, 0.1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 0F, 0F); // Box 130
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(0F, -7.5F, -4.8F, 1, 2, 1, 0F,0F, -0.3F, 0F, -0.3F, -0.9F, 0F, -0.3F, -0.9F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.2F, 0F); // Box 132
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-4.5F, -3F, -4.5F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 133
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(3.5F, -3F, -4.5F, 1, 2, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 134
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-4.6F, -5.4F, -4.8F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-4F, -7.5F, -4.7F, 4, 1, 1, 0F,0F, -2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -2F, 0F, 0F, 1.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.4F, 0F); // Box 136
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(3.6F, -5.4F, -4.8F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(0F, -7.5F, -4.7F, 4, 1, 1, 0F,0F, -0.3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -0.3F, 0F); // Box 138
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-4.55F, -4.4F, -4.7F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 139
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(3.55F, -4.4F, -4.7F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 140
		headModel[35].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 19
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 20
		bodyModel[12] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		bodyModel[13] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 22
		bodyModel[14] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 23
		bodyModel[15] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 24
		bodyModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 26
		bodyModel[18] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 27
		bodyModel[19] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 90
		bodyModel[20] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 91
		bodyModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 92
		bodyModel[22] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 93
		bodyModel[23] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 94
		bodyModel[24] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 95
		bodyModel[25] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 96
		bodyModel[26] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 97
		bodyModel[27] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 79
		bodyModel[28] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 80
		bodyModel[29] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 81
		bodyModel[30] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 88
		bodyModel[31] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 89
		bodyModel[32] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 90
		bodyModel[33] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 91
		bodyModel[34] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 92
		bodyModel[35] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 93
		bodyModel[36] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 94
		bodyModel[37] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 96
		bodyModel[38] = new ModelRendererTurbo(this, 54, 111, textureX, textureY); // Box 97
		bodyModel[39] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 81
		bodyModel[40] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 82
		bodyModel[41] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 1
		bodyModel[42] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 3
		bodyModel[43] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 29
		bodyModel[44] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 30
		bodyModel[45] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 31
		bodyModel[46] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 32
		bodyModel[47] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 33
		bodyModel[48] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 36
		bodyModel[49] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 37
		bodyModel[50] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 40
		bodyModel[51] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 41
		bodyModel[52] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 42
		bodyModel[53] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 43
		bodyModel[54] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 44
		bodyModel[55] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 45
		bodyModel[56] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 47
		bodyModel[57] = new ModelRendererTurbo(this, 97, 97, textureX, textureY); // Box 119
		bodyModel[58] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 128
		bodyModel[59] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 129

		bodyModel[0].addShapeBox(-4F, 2F, -2F, 8, 3, 4, 0F,-0.7F, -0.1F, -0.1F, -0.7F, -0.1F, -0.1F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0.5F, -1.5F, -1F, 0.5F, -1.5F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2F, 8, 2, 4, 0F,-1.2F, 0F, 0.7F, -1.2F, 0F, 0.7F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 5F, -3F, 7, 4, 4, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.7F, 0F, -0.2F, -0.7F, 0F, -0.2F, -0.7F, 0F, 0.5F, -0.7F, 0F, 0.5F); // Box 2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 11F, -2F, 6, 2, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -2.5F, -0.5F, -1F, -2.5F, -0.5F, -1F, -2F, 0F, -1F, -2F, 0F, -1F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2F, 8, 3, 4, 0F,-1F, 0F, -1.5F, -1F, 0F, -1.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, -0.8F, 0.2F, -0.7F, -0.8F, 0.2F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 4
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 10.8F, -2F, 4, 3, 4, 0F,0.5F, -0.3F, 0.4F, -0.5F, -0.3F, 0F, 0F, 0F, 1F, 0.5F, 0.3F, 1F, 0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 8.8F, -2F, 4, 2, 4, 0F,-1F, 2F, -1F, -1F, 0F, 0F, -0.3F, 0F, -0.5F, -0.8F, 1F, -0.8F, 0.5F, 0.3F, 0.4F, -0.5F, 0.3F, 0F, 0F, 0F, 1F, 0.5F, -0.3F, 1F); // Box 7
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 8.8F, -2F, 4, 2, 4, 0F,-1F, 0F, 0F, -1F, 2F, -1F, -0.8F, 1F, -0.8F, -0.3F, 0F, -0.5F, -0.5F, 0.3F, 0F, 0.5F, 0.3F, 0.4F, 0.5F, -0.3F, 1F, 0F, 0F, 1F); // Box 12
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 10.8F, -2F, 4, 3, 4, 0F,-0.5F, -0.3F, 0F, 0.5F, -0.3F, 0.4F, 0.5F, 0.3F, 1F, 0F, 0F, 1F, -0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 2.2F, -2.21F, 4, 2, 2, 0F,-0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.7F, -2F, 0.2F, 0F, -1.9F, 0.2F, -0.5F, -1.2F, -2F, -0.7F, -1.2F, -2F); // Box 18
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 0.2F, -2.19F, 4, 2, 2, 0F,-0.2F, -0.7F, -0.9F, -0.3F, -1.5F, -0.3F, -1.5F, -0.5F, -0.8F, 0.5F, 0F, -0.5F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 19
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, 2.5F, -3.4F, 3, 1, 1, 0F,-0.3F, 0.2F, -0.5F, 0.45F, 0F, -0.5F, 0.5F, 0.2F, 0F, -0.2F, 0.3F, 0F, -0.1F, -0.4F, -0.5F, 0.5F, -0.4F, -0.5F, 0.5F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F); // Box 20
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.3F, 2.4F, -3.89F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.5F, 0F, -0.3F, -0.5F, 0.25F, -0.1F, 0F, -0.1F, 0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0.3F, -0.3F, 0F, 0.1F, -0.3F, 0F); // Box 21
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.3F, 4.09F, -3.9F, 3, 1, 1, 0F,0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0.3F, 1F, 0F, 0.1F, 1F, 0F, -0.2F, -0.2F, -0.2F, -0.1F, -0.3F, -0.2F, 0.2F, -0.3F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 3.29F, -3.4F, 3, 2, 1, 0F,-0.1F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.5F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, -0.2F, -0.5F, 0.4F, -0.5F, -0.5F, 0.5F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F); // Box 23
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.3F, 1.7F, -4.4F, 3, 1, 1, 0F,-1.3F, -1.6F, 0F, -1.4F, -1.6F, 0F, 0F, -1F, 0F, -0.2F, -0.8F, 0F, -1.2F, 0.9F, 0F, -1.3F, 0.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 24
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.3F, 5.09F, -4.4F, 3, 1, 1, 0F,-1.2F, 1.5F, 0F, -1.3F, 1.5F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, -1.3F, -2.2F, 0F, -1.5F, -2.2F, 0F, -0.1F, -1.3F, -0.3F, -0.2F, -1.2F, -0.3F); // Box 25
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 3.29F, -2F, 3, 2, 1, 0F,-0.2F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.3F, 1F, 0.5F, 0F, 1F, 0.5F, -0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, -0.1F, -1.6F, 0F, -0.2F, -1.6F, 0F); // Box 26
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.01F, 0.21F, -2.21F, 4, 2, 2, 0F,-0.3F, -1.5F, -0.3F, -0.2F, -0.7F, -0.9F, 0.5F, 0F, -0.5F, -1.5F, -0.5F, -0.8F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 2.2F, -2.21F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0.2F, -0.7F, -2F, 0.2F, -0.7F, -1.2F, -2F, -0.5F, -1.2F, -2F); // Box 90
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 2.5F, -3.4F, 3, 1, 1, 0F,0.45F, 0F, -0.5F, -0.3F, 0.2F, -0.5F, -0.2F, 0.3F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.2F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F); // Box 91
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.3F, 2.4F, -3.89F, 3, 1, 1, 0F,0F, -0.3F, -0.5F, -0.2F, -0.1F, -0.5F, -0.1F, 0.1F, 0F, 0.25F, -0.1F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0.1F, -0.3F, 0F, 0.3F, -0.3F, 0F); // Box 92
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.3F, 1.7F, -4.4F, 3, 1, 1, 0F,-1.4F, -1.6F, 0F, -1.3F, -1.6F, 0F, -0.2F, -0.8F, 0F, 0F, -1F, 0F, -1.3F, 0.9F, 0F, -1.2F, 0.9F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 93
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.5F, 3.29F, -2F, 3, 2, 1, 0F,0.5F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, 0F, 1F, 0.5F, 0.3F, 1F, 0.5F, 0.5F, -0.3F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -1.6F, 0F, -0.1F, -1.6F, 0F); // Box 94
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.5F, 3.29F, -3.4F, 3, 2, 1, 0F,0.4F, 0.2F, -0.5F, -0.1F, 0.2F, -0.5F, -0.2F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.4F, -0.5F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F); // Box 95
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.3F, 4.09F, -3.9F, 3, 1, 1, 0F,0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0.1F, 1F, 0F, 0.3F, 1F, 0F, -0.1F, -0.3F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 0.2F, -0.3F, 0F); // Box 96
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.3F, 5.09F, -4.4F, 3, 1, 1, 0F,-1.3F, 1.5F, 0F, -1.2F, 1.5F, 0F, 0F, 1.9F, 0F, 0F, 1.9F, 0F, -1.5F, -2.2F, 0F, -1.3F, -2.2F, 0F, -0.2F, -1.2F, -0.3F, -0.1F, -1.3F, -0.3F); // Box 97
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2F, 3F, -4F, 2, 2, 1, 0F,0F, -0.5F, 1F, 0F, -0.5F, 0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -0.1F, 0F, -0.3F, -0.2F, 0F, -0.1F, -0.7F, 0F, 0F, -0.5F); // Box 79
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3F, 3F, -4F, 1, 2, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0.5F, -0.2F, 0F, 0.3F, 0F, -0.4F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0.3F, 0.1F, 0F); // Box 80
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2F, 3F, -4F, 1, 2, 1, 0F,0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0.5F, -0.2F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.1F, 0.3F, 0F, -0.4F, 0.3F, 0.1F, 0F, 0F, 0F, -0.5F); // Box 81
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3F, 3F, -3F, 1, 2, 4, 0F,0.5F, -0.2F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, 1F, 0.7F, 0.5F, 1F, 0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 1.5F, 0.7F, 0.3F, 0.9F, 0.7F); // Box 88
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2F, 3F, -3F, 1, 2, 4, 0F,0F, -0.5F, -1F, 0.5F, -0.2F, 0F, 0.7F, 0.5F, 1F, 0F, 0.5F, 1F, -1F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.9F, 0.7F, 0F, 1.5F, 0.7F); // Box 89
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2F, 3F, 0F, 4, 2, 1, 0F,0F, 0.15F, 0F, 0F, 0.15F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.7F, 0F, 1.5F, 0.7F); // Box 90
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-2F, 2F, -4F, 2, 2, 1, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.6F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F); // Box 91
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3F, 2F, -4F, 1, 2, 1, 0F,0.3F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.3F, -0.5F, 0.3F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0.5F, -0.8F, 0F); // Box 92
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(2F, 2F, -4F, 1, 2, 1, 0F,0F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, 0.5F, -0.8F, 0F, 0F, -0.5F, -1F); // Box 93
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(2F, 2F, -3F, 1, 2, 2, 0F,1F, -0.5F, 0.7F, 0.3F, -0.1F, 0.1F, 1.7F, 2F, 0.5F, -1F, 2.2F, 0.5F, 1F, -0.5F, 1F, 0.5F, -0.8F, 0F, 0.55F, -1.1F, 0.5F, 0F, -0.5F, 1F); // Box 94
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3F, 2F, -3F, 1, 2, 2, 0F,0.3F, -0.1F, 0.1F, 1F, -0.5F, 0.7F, -1F, 2.2F, 0.5F, 1.7F, 2F, 0.5F, 0.5F, -0.8F, 0F, 1F, -0.5F, 1F, 0F, -0.5F, 1F, 0.55F, -1.1F, 0.5F); // Box 96
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.5F, 0F, 0F, 7, 2, 1, 0F,1.2F, 0F, 0.5F, 1.2F, 0F, 0.5F, 0F, 0.1F, 0.7F, 0F, 0.1F, 0.7F, 0.2F, 0.85F, 0.5F, 0.2F, 0.85F, 0.5F, 0.2F, 0.5F, 1F, 0.2F, 0.5F, 1F); // Box 97
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, 3F, -4F, 2, 2, 1, 0F,0F, -0.5F, 0.3F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.5F, 0F, -0.1F, -0.7F); // Box 81
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(0F, 2F, -4F, 2, 2, 1, 0F,0F, -0.5F, -0.6F, 0F, -0.5F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F); // Box 82
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-3F, 8F, -2F, 4, 3, 4, 0F,0.8F, -1F, 0F, 0.4F, -2F, 0F, -0.6F, -1.5F, 0.2F, 0.8F, -1F, 0F, 1.6F, 0F, 0.5F, 1.4F, 0F, 1F, 0.4F, 0F, 2F, 2.4F, 0F, 1.5F); // Box 1
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(1F, 8F, -2F, 2, 3, 4, 0F,1.4F, -2F, -0.2F, 0.8F, -1F, -0.2F, 0.8F, -1F, 0.2F, 0.4F, -1.5F, 0.2F, 1.4F, 0F, 0.8F, 1.6F, 0F, 0.3F, 2.4F, 0F, 1.3F, 0.4F, 0F, 1.8F); // Box 3
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-5F, -1.7F, -5.5F, 5, 3, 1, 0F,0F, -0.5F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 29
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-5F, 1.3F, -5.5F, 10, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 30
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-5.4F, -1F, -2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 31
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-5.4F, -1F, -5F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 32
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-5.4F, -1F, 2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 33
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-5.4F, 0F, -5F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 36
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-5.4F, 1.3F, -5F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F); // Box 37
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(4.4F, -1F, 2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 40
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(4.4F, -1F, -2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 41
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(4.4F, -1F, -5F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 42
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(4.4F, 0F, -5F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 43
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(4.4F, 1.3F, -5F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F); // Box 44
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-5.4F, 0F, 1.9F, 1, 1, 4, 0F,1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 45
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(4.4F, 0F, 1.9F, 1, 1, 4, 0F,-0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 47
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(0F, -1.7F, -5.5F, 5, 3, 1, 0F,0F, -2F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 119
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(1F, 8F, -3F, 2, 3, 1, 0F,1.4F, -2F, -0.2F, -0.2F, -1F, 0.2F, 0.8F, -1F, 0.2F, 0.4F, -1.5F, 0.2F, 1.4F, 0F, 0.8F, 1.6F, 0F, 0.3F, 1.7F, 0F, -0.3F, 0.4F, 0F, 1.8F); // Box 128
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-3F, 8F, -3F, 4, 3, 1, 0F,-0.2F, -1F, 0F, 0.4F, -2F, 0F, -0.6F, -1.5F, 0.2F, 0.8F, -1F, 0F, 1.6F, 0F, 0.5F, 1.4F, 0F, 1F, 0.4F, 0F, 2F, 1.7F, 0F, 1.5F); // Box 129
		bodyModel[59].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 100
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 101
		leftArmModel[2] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 98
		leftArmModel[3] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 99
		leftArmModel[4] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 142

		leftArmModel[0].addShapeBox(-1F, -2F, -1F, 3, 7, 3, 0F,0.8F, 0F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 100
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 4.7F, -0.7F, 3, 6, 3, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.6F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, 0F, -1.8F, -0.6F, 0F, -1.8F); // Box 101
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -1.99F, -1F, 3, 1, 3, 0F,0.5F, 0.2F, 0.5F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0.2F, -0.2F, 0.99F, 0F, 2.01F, -1.5F, -0.8F, 0F, -1.5F, -0.8F, -0.7F, 0.2F, 0F, -0.7F); // Box 98
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -2F, -1F, 3, 4, 3, 0F,1F, -1F, 2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0.8F, 0.2F, -0.2F, 0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 99
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 6.5F, -1.5F, 3, 3, 3, 0F,-0.3F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.5F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 142
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		rightArmModel[2] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 8
		rightArmModel[3] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 12
		rightArmModel[4] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 101

		rightArmModel[0].addShapeBox(-2F, -2F, -1F, 3, 7, 3, 0F,-1F, -0.2F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -1F, -0.2F, -0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0.1F); // Box 10
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2F, 4.7F, -0.7F, 3, 6, 3, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, -0.5F, 0.8F, -0.6F, -0.5F, 0.8F, -0.6F, 0F, -1.8F, 0F, 0F, -1.8F); // Box 11
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2F, -2F, -1F, 3, 4, 3, 0F,-1F, 0F, -0.2F, 1F, -1F, 2F, 0.8F, 0.2F, -0.2F, -1F, 0F, -0.2F, -0.5F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 8
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-2F, -1.99F, -1F, 3, 1, 3, 0F,-1F, 0F, -0.2F, 0.5F, 0.2F, 0.5F, 0.8F, 0.2F, -0.2F, -1F, 0F, -0.2F, -1.5F, -0.8F, 0F, 0.99F, 0F, 2.01F, 0.2F, 0F, -0.7F, -1.5F, -0.8F, -0.7F); // Box 12
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-2F, 6.5F, -1.5F, 3, 3, 3, 0F,0F, 0.2F, -0.8F, -0.3F, 0.2F, -0.8F, -0.3F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.8F, -0.1F, -0.5F, -0.8F, -0.1F, -0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 101
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 14
		leftLegModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 15
		leftLegModel[2] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 4
		leftLegModel[3] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 7
		leftLegModel[4] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 55
		leftLegModel[5] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 105
		leftLegModel[6] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 141

		leftLegModel[0].addShapeBox(-2F, 1.8F, -2F, 4, 3, 4, 0F,-0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4.8F, -2F, 4, 7, 4, 0F,-0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.5F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1F, -1F, -3F, 2, 2, 5, 0F,1.4F, 0F, 0.8F, 1.6F, 0F, 0.3F, 2.4F, 0F, 1.3F, 0.4F, 0F, 1.8F, 1.4F, 0F, -0.2F, 1.6F, 2F, 0.2F, 2.2F, 0F, 1.2F, 0.4F, 0F, 1.4F); // Box 4
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1F, 2F, -3F, 2, 4, 5, 0F,1.4F, 0F, -0.5F, 1F, 1F, -0.3F, 1.9F, 1F, 1F, 0.4F, 1F, 1.4F, 1.4F, 0F, -0.2F, 1.6F, 1.5F, 0.2F, 2F, 0F, 1.2F, 0.4F, 0F, 1.4F); // Box 7
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2.5F, 8F, -3.1F, 5, 1, 7, 0F,-0.5F, 2F, -0.3F, 0F, 0.5F, 0F, 0.5F, 2F, -0.7F, -0.8F, 2F, -0.6F, -0.7F, -2F, -0.1F, 0.2F, -0.7F, 0.2F, 0.7F, -2F, -0.5F, -0.5F, -2F, -0.5F); // Box 55
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2.5F, 3F, -3.1F, 5, 1, 7, 0F,-0.5F, 2F, -0.1F, 0F, 0F, 0F, 0.5F, 2F, -0.7F, -0.8F, 2F, -0.4F, -0.7F, -2F, -0.1F, 0.2F, -0.2F, 0.2F, 0.7F, -2F, -0.5F, -0.5F, -2F, -0.5F); // Box 105
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 5.8F, -1.5F, 4, 3, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 141
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 8
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 9
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 2
		rightLegModel[3] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 5
		rightLegModel[4] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 53
		rightLegModel[5] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 54
		rightLegModel[6] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 93

		rightLegModel[0].addShapeBox(-2F, 1.8F, -2F, 4, 3, 4, 0F,0F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F); // Box 8
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 4.8F, -2F, 4, 7, 4, 0F,-0.1F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.1F, 0F, -0.2F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 9
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-1F, -1F, -3F, 4, 2, 5, 0F,1.6F, 0F, 0.5F, 1.4F, 0F, 1F, 0.4F, 0F, 2F, 2.4F, 0F, 1.5F, 2F, 3F, 0F, -0.6F, 1F, 0F, 0.4F, 0.5F, 1.8F, 2F, 0F, 1.4F); // Box 2
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-1F, 2F, -2.5F, 4, 3, 4, 0F,1.6F, 0F, 0.5F, 1.4F, 0F, 0.5F, 0.4F, 1F, 1.5F, 2F, 1F, 1.5F, 2F, 1F, 0F, -0.6F, 0.5F, 0.5F, -0.6F, 0.6F, 1.8F, 2F, 0F, 2F); // Box 5
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-3F, 4F, -3F, 6, 1, 7, 0F,0F, 0F, 0F, -0.5F, 2F, 0F, 0F, 2.5F, -0.3F, 0F, 3F, -0.5F, 0.2F, 0F, 0.2F, -0.7F, -2F, 0.2F, 0F, -2.5F, -0.1F, 0.2F, -3F, -0.3F); // Box 53
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-3F, 8F, -3F, 6, 1, 7, 0F,0F, 2F, -0.4F, -0.5F, 3F, 0F, -0.5F, 2.5F, -0.7F, 0F, 3F, -0.5F, 0.2F, -2F, 0F, -0.7F, -3F, 0.2F, -0.5F, -2.5F, -0.5F, 0.2F, -3F, -0.3F); // Box 54
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 5.8F, -1.5F, 4, 3, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 93
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);
	}
}