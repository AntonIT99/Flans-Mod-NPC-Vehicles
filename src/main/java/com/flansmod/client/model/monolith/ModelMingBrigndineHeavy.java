//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MingBrigndine
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingBrigndineHeavy extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelMingBrigndineHeavy() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[43];
		leftArmModel = new ModelRendererTurbo[16];
		rightArmModel = new ModelRendererTurbo[16];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 46
		bodyModel[3] = new ModelRendererTurbo(this, 46, 54, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 16
		bodyModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 33
		bodyModel[7] = new ModelRendererTurbo(this, 46, 54, textureX, textureY); // Box 38
		bodyModel[8] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		bodyModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 52
		bodyModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 55
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 56
		bodyModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 59
		bodyModel[14] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 60
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 61
		bodyModel[16] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 62
		bodyModel[17] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 64
		bodyModel[19] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 66
		bodyModel[20] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 69
		bodyModel[21] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 70
		bodyModel[22] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 84
		bodyModel[25] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 85
		bodyModel[26] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 86
		bodyModel[27] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 87
		bodyModel[28] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 98
		bodyModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 99
		bodyModel[30] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 100
		bodyModel[31] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 101
		bodyModel[32] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 104
		bodyModel[33] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 105
		bodyModel[34] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 113
		bodyModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 114
		bodyModel[36] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 115
		bodyModel[37] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 116
		bodyModel[38] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 117
		bodyModel[39] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 118
		bodyModel[40] = new ModelRendererTurbo(this, 33, 53, textureX, textureY); // Box 128
		bodyModel[41] = new ModelRendererTurbo(this, 33, 53, textureX, textureY); // Box 129
		bodyModel[42] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 130

		bodyModel[0].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F); // Box 22
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F); // Box 44
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, 1.5F, -2.6F, 1, 8, 1, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 46
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 5F, -2.5F, 4, 5, 5, 0F,0.5F, 0F, 0.4F, -0.1F, 0F, 0.4F, 0F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.2F, -0.1F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 13
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1.5F, -2.7F, 4, 3, 1, 0F,0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.2F, -0.1F, 0.5F, 0.2F, -0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 15
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0F, -2.5F, 2, 1, 5, 0F,0.5F, 0.5F, 0F, -0.5F, 0.6F, 0F, 2F, 0.6F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, 2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 16
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0.7F, 0.5F, 0.2F); // Box 33
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 5F, -2.5F, 4, 5, 5, 0F,-0.1F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0F, 0F, 0.4F, -0.1F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 38
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2F, 0F, -2.5F, 2, 1, 5, 0F,-0.5F, 0.6F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 2F, 0.6F, 0F, -0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 2F, 0.5F, 0.2F); // Box 40
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 8.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 52
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1.5F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 53
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 55
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 56
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.5F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 59
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0.5F, 8.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 60
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 61
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 62
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.7F, 5.4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 63
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4.2F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 64
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3.2F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 66
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(3F, 4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 69
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 70
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 9.3F, -2.5F, 8, 1, 5, 0F,0.8F, -0.4F, 0.4F, 0.8F, -0.4F, 0.4F, 0.8F, -0.4F, 0.4F, 0.8F, -0.4F, 0.4F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F); // Box 22
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 10.8F, -2.5F, 8, 1, 5, 0F,0.55F, 0.1F, 0.3F, 0.55F, 0.1F, 0.3F, 0.55F, 0.1F, 0.3F, 0.55F, 0.1F, 0.3F, 0.9F, -0.2F, 0.6F, 0.9F, -0.2F, 0.6F, 0.9F, -0.2F, 0.6F, 0.9F, -0.2F, 0.6F); // Box 37
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-1.5F, 4.6F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-1.5F, 3.6F, -3.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1.5F, 5.6F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2.5F, 4.6F, -3F, 5, 1, 6, 0F,-0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F); // Box 87
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4F, 5F, -2.5F, 1, 5, 5, 0F,1F, -0.3F, 0.45F, 0.9F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, -0.3F, 0.45F, 0.6F, 0F, 0.2F, -0.1F, -1.5F, 0.45F, 0F, -1.5F, 0.45F, 0.6F, 0F, 0.2F); // Box 98
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4.5F, 4.6F, -3F, 2, 1, 6, 0F,0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F); // Box 99
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-1.5F, 1.5F, -3.9F, 3, 1, 1, 0F,-0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3.5F, 1.5F, -3.9F, 2, 1, 1, 0F,-0.5F, 1F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 101
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.5F, 0.4F, -3.4F, 2, 1, 1, 0F,-1F, 1F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, -1F, 1F, 0F, -0.3F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, -1F, 0F); // Box 104
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-1.5F, 0.4F, -3.4F, 3, 1, 1, 0F,-0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0F, 1.5F, -2.7F, 4, 3, 1, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0F, -0.1F, 0.5F, 0F); // Box 113
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(2.5F, 4.6F, -3F, 2, 1, 6, 0F,0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F); // Box 114
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(3F, 5F, -2.5F, 1, 5, 5, 0F,0.9F, 0F, 0.7F, 1F, -0.3F, 0.45F, 1F, -0.3F, 0.45F, 1F, 0F, 0.7F, -0.1F, -1.5F, 0.45F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0F, -1.5F, 0.45F); // Box 115
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1.5F, 1.5F, -3.9F, 2, 1, 1, 0F,0.5F, 0.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1.5F, 0.4F, -3.4F, 2, 1, 1, 0F,0.5F, 0.5F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -1F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 118
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3.8F, 5F, -2.5F, 1, 5, 5, 0F,1F, -0.3F, 0.45F, 0.9F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, -0.3F, 0.45F, 0.6F, 0F, 0.2F, -0.1F, -1.5F, 0.45F, 0F, -1.5F, 0.45F, 0.6F, 0F, 0.2F); // Box 128
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(2.8F, 5F, -2.5F, 1, 5, 5, 0F,0.9F, 0F, 0.7F, 1F, -0.3F, 0.45F, 1F, -0.3F, 0.45F, 1F, 0F, 0.7F, -0.1F, -1.5F, 0.45F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0F, -1.5F, 0.45F); // Box 129
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2.7F, 5.4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 130
		bodyModel[42].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 41
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		leftArmModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 51
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 76
		leftArmModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 77
		leftArmModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 78
		leftArmModel[7] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 119
		leftArmModel[8] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 120
		leftArmModel[9] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 121
		leftArmModel[10] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 122
		leftArmModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 123
		leftArmModel[12] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 124
		leftArmModel[13] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 125
		leftArmModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 126
		leftArmModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 127

		leftArmModel[0].addShapeBox(-0.5F, -2F, -2.5F, 4, 1, 5, 0F,0F, 0.5F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0.5F, 0.5F, 0.2F); // Box 41
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.5F, 0.8F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 49
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(0.9F, 0F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 50
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.2F, -0.7F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 51
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.5F, 0.8F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 76
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0.9F, 0F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 77
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(2.2F, -0.7F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 78
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(0F, 2F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F); // Box 119
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(0F, 4F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F); // Box 120
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(0F, 6F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F); // Box 121
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(1.5F, 6F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.7F, 0.5F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.5F); // Box 122
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(1.5F, 4.5F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.7F, 0.5F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.5F); // Box 123
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(1.5F, 3F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.7F, 0.5F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.5F); // Box 124
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(1.5F, 1.5F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.7F, 0.5F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.5F); // Box 125
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(1.5F, 0F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.7F, 0.2F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.2F); // Box 126
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(-1.5F, -1F, -2.5F, 5, 3, 5, 0F,-0.5F, -0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, -0.5F, 0.2F, 0.2F, 1.5F, 0.1F, 0.2F, -2F, 0.4F, 0.2F, -2F, 0.4F, 0.2F, 1.5F, 0F); // Box 127
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 29
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 32
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		rightArmModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48
		rightArmModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		rightArmModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 75
		rightArmModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 89
		rightArmModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 90
		rightArmModel[10] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 95
		rightArmModel[11] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 96
		rightArmModel[12] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 97
		rightArmModel[13] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 107
		rightArmModel[14] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 108
		rightArmModel[15] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 109

		rightArmModel[0].addShapeBox(-3.5F, -2F, -2.5F, 4, 1, 5, 0F,-0.2F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.2F, 0F, 0F, -0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, -0.2F, 0.2F); // Box 29
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.5F, -1F, -2.5F, 5, 3, 5, 0F,0F, 0.2F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, -2F, 0.4F, 0.2F, 1.5F, 0F, 0.2F, 1.5F, 0F, 0.2F, -2F, 0.4F); // Box 32
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-0.5F, 0.8F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 35
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-1.9F, 0F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 47
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.2F, -0.7F, -3.2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 48
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3.2F, -0.7F, 2.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 73
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-1.9F, 0F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 74
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-0.5F, 0.8F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 75
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3.5F, 0F, -2.5F, 2, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.2F, -0.5F, 0.7F, 0.2F, 0.7F, 0.5F, 0F); // Box 89
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3.5F, 1.5F, -2.5F, 2, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, 0.7F, 0.5F, 0F); // Box 90
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-2F, 4F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F); // Box 95
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-2F, 6F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F); // Box 96
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-2F, 2F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F); // Box 97
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.5F, 4.5F, -2.5F, 2, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, 0.7F, 0.5F, 0F); // Box 107
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.5F, 3F, -2.5F, 2, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, 0.7F, 0.5F, 0F); // Box 108
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3.5F, 6F, -2.5F, 2, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0.5F, 0F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, 0.7F, 0.5F, 0F); // Box 109
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 57
		leftLegModel[3] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 58
		leftLegModel[4] = new ModelRendererTurbo(this, 17, 30, textureX, textureY); // Box 59
		leftLegModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
		leftLegModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		leftLegModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 76
		leftLegModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 77
		leftLegModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		leftLegModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		leftLegModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		leftLegModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		leftLegModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		leftLegModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90

		leftLegModel[0].addShapeBox(-1.5F, 0F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 82
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.5F, 0F, 2.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 85
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0F, 0.5F, 0.7F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.7F, 0F, 7.7F, 2F, 1.2F, 7.7F, 1.2F, 1.2F, 7.7F, 1.2F, 0F, 7.7F, 2F); // Box 57
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 0F, -2F, 4, 8, 4, 0F,-0.1F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, -0.3F, 0F, 2.2F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, -0.3F, 0F, 2.2F); // Box 58
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(2F, -1.2F, -2.5F, 1, 3, 5, 0F,2F, -0.5F, 0.25F, -0.4F, -0.7F, 0.2F, -0.4F, -0.7F, 0.2F, 2F, -0.5F, 0.25F, 1F, 4.5F, 1.5F, 1F, 4F, 1F, 1F, 4F, 1F, 1F, 4.5F, 1.5F); // Box 59
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 1.5F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 72
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.5F, 3F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 74
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-1.5F, 4.5F, -4.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 76
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1.5F, 6F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 77
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(1.8F, 6F, -3.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 80
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(1.8F, 6F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 82
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-1.5F, 6F, 3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 83
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(-1.5F, 4.5F, 3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 85
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(-1.5F, 3F, 2.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 87
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(-1.5F, 1.5F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 90
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		rightLegModel[2] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 68
		rightLegModel[3] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 69
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 30, textureX, textureY); // Box 70
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		rightLegModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 75
		rightLegModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 78
		rightLegModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		rightLegModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		rightLegModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		rightLegModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		rightLegModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		rightLegModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 89

		rightLegModel[0].addShapeBox(0.5F, 0F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 80
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(0.5F, 0F, 2.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 84
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 0F, -2F, 4, 1, 4, 0F,0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0.2F, 0.5F, 0.2F, 1.2F, 7.7F, 1.2F, 0F, 7.7F, 2F, 0F, 7.7F, 2F, 1.2F, 7.7F, 1.2F); // Box 68
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 0F, -2F, 4, 8, 4, 0F,0.5F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 1.5F, 0F, 1.5F, -0.3F, 0F, 2.2F, -0.3F, 0F, 2.2F, 1.5F, 0F, 1.5F); // Box 69
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-3F, -1.2F, -2.5F, 1, 3, 5, 0F,-0.4F, -0.7F, 0.2F, 2F, -0.5F, 0.25F, 2F, -0.5F, 0.25F, -0.4F, -0.7F, 0.2F, 1F, 4F, 1F, 1F, 4.5F, 1.5F, 1F, 4.5F, 1.5F, 1F, 4F, 1F); // Box 70
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(0.5F, 1.5F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 71
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(0.5F, 3F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 73
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(0.5F, 4.5F, -4.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 75
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(0.5F, 6F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 78
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2.8F, 6F, -3.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 79
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2.8F, 6F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 81
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(0.5F, 6F, 3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 84
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(0.5F, 4.5F, 3.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 86
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(0.5F, 3F, 2.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 88
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(0.5F, 1.5F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 89
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);
	}
}