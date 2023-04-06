//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ToseiGusoku
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAshigaruArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 64;

	public ModelAshigaruArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[31];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];
		skirtFrontModel = new ModelRendererTurbo[12];
		skirtRearModel = new ModelRendererTurbo[12];

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
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 289
		bodyModel[1] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 31
		bodyModel[2] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 32
		bodyModel[3] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 33
		bodyModel[4] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 89
		bodyModel[7] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 90
		bodyModel[8] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 93
		bodyModel[9] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 96
		bodyModel[10] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 97
		bodyModel[11] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 105
		bodyModel[12] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 106
		bodyModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 107
		bodyModel[14] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 108
		bodyModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 110
		bodyModel[16] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 111
		bodyModel[17] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 112
		bodyModel[18] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 114
		bodyModel[19] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 115
		bodyModel[20] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 116
		bodyModel[21] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 117
		bodyModel[22] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 118
		bodyModel[23] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 119
		bodyModel[24] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 120
		bodyModel[25] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 121
		bodyModel[26] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 122
		bodyModel[27] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 123
		bodyModel[28] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 124
		bodyModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 125
		bodyModel[30] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 126

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 289
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3F, -0.5F, -3F, 1, 1, 6, 0F,-0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Box 31
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(2F, -0.5F, -3F, 1, 1, 6, 0F,-0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Box 32
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 0.5F, -3F, 1, 2, 6, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 33
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2F, 0.5F, -3F, 1, 2, 6, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 34
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 6.5F, -2.4F, 4, 3, 5, 0F,0.6F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0.6F, 0F, 0.5F, 0.2F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 0.5F, 0F, 0.2F); // Box 15
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 3.5F, -2.4F, 4, 3, 5, 0F,0.6F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.6F, 0F, 0.5F, 0.6F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0.6F, 0F, 0.4F); // Box 89
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 1.5F, -2.4F, 4, 2, 5, 0F,-0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.4F, -0.2F, 0.5F, 0.2F, 0.6F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.6F, 0F, 0.5F); // Box 90
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 1.5F, -2.4F, 4, 2, 5, 0F,0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.4F, 0F, 0F, 1.2F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.5F, 0F, 0F, 1F); // Box 93
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 3.5F, -2.4F, 4, 3, 5, 0F,0F, 0F, 1.2F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.4F, 0F, 0F, 1F); // Box 96
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 6.5F, -2.4F, 4, 3, 5, 0F,0F, 0F, 1F, 0.46F, 0F, 0.7F, 0.6F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.2F, 0F, 0.3F, 0.5F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 97
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 8.7F, -3.4F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 105
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 8.7F, -3.4F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 106
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.8F, 8.7F, -3.4F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 107
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.8F, 8.7F, -3.4F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 108
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(3.6F, 8.7F, -3.1F, 1, 3, 1, 0F,0F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 110
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.7F, 8.7F, -3.2F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 111
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2F, 8.7F, -3.2F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 112
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.6F, 8.7F, -3.1F, 1, 3, 1, 0F,-0.6F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 114
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3F, 8.7F, -3.2F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 115
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.7F, 8.7F, -3.2F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F); // Box 116
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(3.6F, 8.7F, 2.1F, 1, 3, 1, 0F,0F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 117
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2.7F, 8.7F, 2F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 118
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(2F, 8.7F, 2F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 119
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.8F, 8.7F, 2.1F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 120
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 8.7F, 2.1F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 121
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1F, 8.7F, 2.1F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 122
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1.8F, 8.7F, 2.1F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 123
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3F, 8.7F, 2.1F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 124
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.7F, 8.7F, 2.1F, 1, 3, 1, 0F,-0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 125
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4.6F, 8.7F, 2.1F, 1, 3, 1, 0F,-0.6F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F); // Box 126
		bodyModel[30].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 101
		leftArmModel[2] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 104
		leftArmModel[3] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 106

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 4F, -2F, 4, 5, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 101
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 3.5F, -2F, 4, 1, 4, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 104
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 8.6F, -2F, 4, 2, 4, 0F,0.25F, 0.2F, 0.25F, 0.25F, 0.2F, 0.25F, 0.25F, 0.2F, 0.25F, 0.25F, 0.2F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 106
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 100
		rightArmModel[2] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 102
		rightArmModel[3] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 105

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4F, -2F, 4, 5, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 100
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 3.5F, -2F, 4, 1, 4, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 102
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 8.6F, -2F, 4, 2, 4, 0F,0.25F, 0.2F, 0.25F, 0.25F, 0.2F, 0.25F, 0.25F, 0.2F, 0.25F, 0.25F, 0.2F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F, 0.25F, -0.5F, 0.25F); // Box 105
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 20
		leftLegModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 21
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		leftLegModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 20
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 21
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 23
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 18
		rightLegModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 19
		rightLegModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 22
		rightLegModel[4] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 5, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 18
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 19
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 7F, -2F, 4, 4, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 22
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 69
		skirtFrontModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 70
		skirtFrontModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 71
		skirtFrontModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 72
		skirtFrontModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 77
		skirtFrontModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 81
		skirtFrontModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 84
		skirtFrontModel[7] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 85
		skirtFrontModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 86
		skirtFrontModel[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 87
		skirtFrontModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 88
		skirtFrontModel[11] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 89

		skirtFrontModel[0].addShapeBox(-2F, -1F, -3.6F, 4, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 69
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-2F, 0F, -4.1F, 4, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 70
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-2F, 1F, -4.5F, 4, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 71
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[3].addShapeBox(-2F, 2F, -5F, 4, 2, 1, 0F,-0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 72
		skirtFrontModel[3].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[4].addShapeBox(2F, -1F, -3.5F, 3, 2, 1, 0F,-0.2F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0.1F, -0.2F, 0F, -0.5F); // Box 77
		skirtFrontModel[4].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[5].addShapeBox(2.2F, 0F, -4F, 3, 2, 1, 0F,-0.2F, 0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0.5F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.7F, 0.2F, 0F, 0.4F, -0.2F, 0F, -0.5F); // Box 81
		skirtFrontModel[5].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[6].addShapeBox(2.4F, 1F, -4.5F, 3, 2, 1, 0F,-0.2F, 0F, -0.3F, 0.2F, 0F, -1F, 0.2F, 0F, 0.7F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.9F, 0.2F, 0F, 0.6F, -0.2F, 0F, -0.5F); // Box 84
		skirtFrontModel[6].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[7].addShapeBox(2.6F, 2F, -5F, 3, 2, 1, 0F,-0.2F, 0F, -0.3F, 0.2F, 0F, -1.3F, 0.2F, 0F, 1F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -1.2F, 0.2F, 0F, 0.9F, -0.2F, 0F, -0.5F); // Box 85
		skirtFrontModel[7].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[8].addShapeBox(-5F, -1F, -3.5F, 3, 2, 1, 0F,0.2F, 0F, -0.5F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, 0.2F, 0F, 0.1F); // Box 86
		skirtFrontModel[8].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[9].addShapeBox(-5.2F, 0F, -4F, 3, 2, 1, 0F,0.2F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, 0.5F, 0.2F, 0F, -0.7F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, 0.2F, 0F, 0.4F); // Box 87
		skirtFrontModel[9].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[10].addShapeBox(-5.4F, 1F, -4.5F, 3, 2, 1, 0F,0.2F, 0F, -1F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, -0.9F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, 0.2F, 0F, 0.6F); // Box 88
		skirtFrontModel[10].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[11].addShapeBox(-5.6F, 2F, -5F, 3, 2, 1, 0F,0.2F, 0F, -1.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, 1F, 0.2F, 0F, -1.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, 0.2F, 0F, 0.9F); // Box 89
		skirtFrontModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 90
		skirtRearModel[1] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 91
		skirtRearModel[2] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 92
		skirtRearModel[3] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 93
		skirtRearModel[4] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 94
		skirtRearModel[5] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 95
		skirtRearModel[6] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 96
		skirtRearModel[7] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 97
		skirtRearModel[8] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 98
		skirtRearModel[9] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 99
		skirtRearModel[10] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 100
		skirtRearModel[11] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 101

		skirtRearModel[0].addShapeBox(2.6F, 2F, 3.7F, 3, 2, 1, 0F,-0.2F, 0F, -0.3F, 0.2F, 0F, 1F, 0.2F, 0F, -1.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, 0.2F, 0F, 0.9F, 0.2F, 0F, -1.2F, -0.2F, 0F, -0.3F); // Box 90
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(2F, -1F, 2.2F, 3, 2, 1, 0F,-0.2F, 0F, -0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.5F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, 0.2F, 0F, 0.1F, 0.2F, 0F, -0.4F, -0.2F, 0F, -0.3F); // Box 91
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[2].addShapeBox(2.4F, 1F, 3.2F, 3, 2, 1, 0F,-0.2F, 0F, -0.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, -1F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, 0.2F, 0F, 0.6F, 0.2F, 0F, -0.9F, -0.2F, 0F, -0.3F); // Box 92
		skirtRearModel[2].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[3].addShapeBox(2.2F, 0F, 2.7F, 3, 2, 1, 0F,-0.2F, 0F, -0.3F, 0.2F, 0F, 0.5F, 0.2F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, 0.2F, 0F, 0.4F, 0.2F, 0F, -0.7F, -0.2F, 0F, -0.3F); // Box 93
		skirtRearModel[3].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[4].addShapeBox(-2F, -1F, 2.5F, 4, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 94
		skirtRearModel[4].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[5].addShapeBox(-2F, 0F, 3F, 4, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 95
		skirtRearModel[5].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[6].addShapeBox(-2F, 1F, 3.6F, 4, 2, 1, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F); // Box 96
		skirtRearModel[6].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[7].addShapeBox(-2F, 2F, 4.1F, 4, 2, 1, 0F,-0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F); // Box 97
		skirtRearModel[7].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[8].addShapeBox(-5F, -1F, 2.2F, 3, 2, 1, 0F,0.2F, 0F, 0.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.1F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.4F); // Box 98
		skirtRearModel[8].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[9].addShapeBox(-5.2F, 0F, 2.7F, 3, 2, 1, 0F,0.2F, 0F, 0.5F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0.4F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.7F); // Box 99
		skirtRearModel[9].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[10].addShapeBox(-5.4F, 1F, 3.2F, 3, 2, 1, 0F,0.2F, 0F, 0.7F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -1F, 0.2F, 0F, 0.6F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.3F, 0.2F, 0F, -0.9F); // Box 100
		skirtRearModel[10].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[11].addShapeBox(-5.6F, 2F, 3.7F, 3, 2, 1, 0F,0.2F, 0F, 1F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.2F, 0F, -1.3F, 0.2F, 0F, 0.9F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.3F, 0.2F, 0F, -1.2F); // Box 101
		skirtRearModel[11].setRotationPoint(0F, 0F, 0F);
	}
}