//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Goblino
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGoblino extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelGoblino() //Same as Filename
	{
		headModel = new ModelRendererTurbo[32];
		bodyModel = new ModelRendererTurbo[4];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtFrontModel = new ModelRendererTurbo[1];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 50
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 51
		headModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 52
		headModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 53
		headModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 54
		headModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 55
		headModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 57
		headModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 58
		headModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 59
		headModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 60
		headModel[11] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 61
		headModel[12] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 62
		headModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 63
		headModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 64
		headModel[15] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 65
		headModel[16] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 66
		headModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 77
		headModel[18] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 88
		headModel[19] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 89
		headModel[20] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 90
		headModel[21] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 91
		headModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 92
		headModel[23] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 93
		headModel[24] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 99
		headModel[25] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 100
		headModel[26] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 101
		headModel[27] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 102
		headModel[28] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 103
		headModel[29] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 104
		headModel[30] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 105
		headModel[31] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 106

		headModel[0].addShapeBox(-3.5F, -5F, -4F, 7, 1, 1, 0F,0.5F, 0.3F, 1F, 0.5F, 0.3F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-3.5F, -8F, -4F, 7, 3, 9, 0F,-1.5F, 0.5F, -2F, -1.5F, 0.5F, -2F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 50
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.5F, -4F, -3.5F, 7, 1, 1, 0F,-0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0.3F, 1F, 0.2F, 0.3F, 1F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F); // Box 51
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3.5F, -2.5F, -3.5F, 7, 1, 1, 0F,0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.7F, 0.5F, 0.8F, -0.7F, 0.5F, 0.8F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 52
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -4F, -4F, 2, 1, 1, 0F,-0.2F, 0.4F, 0.2F, -0.2F, 0.4F, 0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.7F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F); // Box 53
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1F, -3F, -5F, 2, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0.2F, -0.3F, 1F, 0.2F, -0.3F, 1F, -0.2F, 1F, -0.5F, -0.2F, 1F, -0.5F); // Box 54
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-3F, -2F, -5F, 3, 1, 1, 0F,-0.5F, -0.4F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.5F, -0.4F, 0F, 0F, 0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.2F, 0F); // Box 55
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3F, 0F, -5.5F, 3, 1, 1, 0F,0.2F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, -0.4F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, -0.5F, -0.4F, 0F); // Box 57
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3F, -0.5F, -5F, 1, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.3F, 0F, 0.2F, -0.7F, 0.5F, -0.3F, -0.6F, 0.5F, -0.3F, -0.5F, -0.3F, 0.2F, -0.6F, -0.3F); // Box 58
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-2.5F, -4.3F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 59
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3.5F, -2.5F, -4F, 7, 2, 4, 0F,-0.1F, 2F, -0.5F, -0.1F, 2F, -0.5F, -0.1F, 1F, 1F, -0.1F, 1F, 1F, -0.3F, 0.5F, 0.4F, -0.3F, 0.5F, 0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F); // Box 60
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-3.5F, -3F, -4F, 7, 2, 9, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 61
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, 0.5F, -4F, 7, 1, 4, 0F,-0.3F, 0.5F, 0.4F, -0.3F, 0.5F, 0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -2F, -1F, 0F, -2F); // Box 62
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-2F, 0.5F, -5F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F); // Box 63
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-6.5F, -6.5F, -0.5F, 4, 3, 1, 0F,-0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 0F, 0F); // Box 64
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.5F, -3F, -0.4F, 2, 1, 1, 0F,-0.2F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.2F, 0.5F, 0F, 1F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, 1F, 0F); // Box 65
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2F, -1.5F, -1F, 4, 6, 4, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F); // Box 66
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-2F, -1.2F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F); // Box 77
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(2.5F, -6.5F, -0.5F, 4, 3, 1, 0F,0F, -1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 2F, 0F); // Box 88
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(2.5F, -3F, -0.4F, 2, 1, 1, 0F,0F, -1F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 2F, 0F); // Box 89
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(0F, -2F, -5F, 3, 1, 1, 0F,-0.8F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.8F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.3F, 0F, 0F); // Box 90
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(0F, 0F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.5F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.2F, 0F); // Box 91
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(2F, -0.5F, -5F, 1, 1, 1, 0F,0F, 0.4F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.4F, 0F, -0.3F, -0.6F, 0.5F, 0.2F, -0.7F, 0.5F, 0.2F, -0.6F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 92
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(1.5F, -4.3F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 93
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(1F, -1.2F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F); // Box 99
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-1F, -1.2F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F); // Box 100
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(0F, -1.2F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F); // Box 101
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-2.5F, -0.8F, -5.5F, 1, 1, 1, 0F,-0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 102
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-1.5F, -0.8F, -5.5F, 1, 1, 1, 0F,-0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 103
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-0.5F, -0.8F, -5.5F, 1, 1, 1, 0F,-0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 104
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(0.5F, -0.8F, -5.5F, 1, 1, 1, 0F,-0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 105
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(1.5F, -0.8F, -5.5F, 1, 1, 1, 0F,-0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 106
		headModel[31].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 67
		bodyModel[1] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 68
		bodyModel[2] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 73

		bodyModel[0].addShapeBox(-4F, 3.5F, -1F, 8, 4, 5, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 67
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 7.5F, -1F, 8, 5, 5, 0F,1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 1F, 1F, 0F, 1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 68
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 12.5F, -1F, 8, 3, 5, 0F,-0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -1F, 0F, -2F, -1F, 0F); // Box 69
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1.5F, 15F, -1.5F, 3, 3, 3, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 94
		leftArmModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 95

		leftArmModel[0].addShapeBox(-1F, 1.5F, -1F, 3, 6, 3, 0F,1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1.5F, 0F, -1.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, -1.5F, 0F, 1F); // Box 94
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7.5F, -1F, 3, 6, 3, 0F,-1.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 1F, -1.5F, 0F, 1F, -2.5F, 0.5F, 0F, 2F, 0F, 0F, 2F, 1F, -1F, -2.5F, 1.5F, -1F); // Box 95
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 74
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 75

		rightArmModel[0].addShapeBox(-2F, 1.5F, -1F, 3, 6, 3, 0F,0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 1.5F, 0F, 0F, 1F, 0F, 1F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 1F, 1F, 0F, 1F); // Box 74
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-2F, 7.5F, -1F, 3, 6, 3, 0F,1F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 1F, 1F, 0F, 1F, 2F, 0F, 0F, -2.5F, 0.5F, 0F, -2.5F, 1.5F, -1F, 2F, 1F, -1F); // Box 75
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 96
		leftLegModel[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 97
		leftLegModel[2] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 98

		leftLegModel[0].addShapeBox(-1F, -2.5F, -1F, 3, 4, 4, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 2F, 1F, 0F, 2F); // Box 96
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1F, 1.5F, -1F, 3, 6, 4, 0F,1F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 0F, 2F, 1F, 0F, 2F, -1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -2F, -1F, 0F, -2F); // Box 97
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(0F, 7.5F, -2F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 98
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 70
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 71
		rightLegModel[2] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 76

		rightLegModel[0].addShapeBox(-2F, 1.5F, -1F, 3, 6, 4, 0F,0.5F, 2F, 0F, 1F, 2F, 0F, 1F, 0F, 2F, 0.5F, 0F, 2F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -2F, 1F, 0F, -2F); // Box 70
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3F, 7.5F, -2F, 3, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 71
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -2.5F, -1F, 3, 4, 4, 0F,0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, -2F, 0F, 1F, -2F, 0F, 1F, 0F, 2F, 0.5F, 0F, 2F); // Box 76
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 73, 38, textureX, textureY); // Box 72

		skirtFrontModel[0].addShapeBox(-2F, 0.5F, -2F, 15, 15, 1, 0F,0.3F, 0F, 0F, -10.7F, 0F, 0F, -10.7F, 0F, 0F, 0.3F, 0F, 0F, 0.6F, -10F, 0.5F, -10.4F, -10F, 0.5F, -10.4F, -10F, -0.7F, 0.6F, -10F, -0.7F); // Box 72
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}
}