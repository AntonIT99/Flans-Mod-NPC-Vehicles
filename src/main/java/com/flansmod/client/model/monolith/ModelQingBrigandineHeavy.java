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

public class ModelQingBrigandineHeavy extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelQingBrigandineHeavy() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[49];
		leftArmModel = new ModelRendererTurbo[23];
		rightArmModel = new ModelRendererTurbo[23];
		leftLegModel = new ModelRendererTurbo[21];
		rightLegModel = new ModelRendererTurbo[20];

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
		bodyModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 52
		bodyModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 55
		bodyModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 56
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 59
		bodyModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 60
		bodyModel[14] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 61
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 62
		bodyModel[16] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 63
		bodyModel[17] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 64
		bodyModel[18] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 66
		bodyModel[19] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 69
		bodyModel[20] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 70
		bodyModel[21] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 84
		bodyModel[22] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 85
		bodyModel[23] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 86
		bodyModel[24] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 87
		bodyModel[25] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 98
		bodyModel[26] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 99
		bodyModel[27] = new ModelRendererTurbo(this, 49, 66, textureX, textureY); // Box 100
		bodyModel[28] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 113
		bodyModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 114
		bodyModel[30] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 115
		bodyModel[31] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 118
		bodyModel[32] = new ModelRendererTurbo(this, 33, 53, textureX, textureY); // Box 128
		bodyModel[33] = new ModelRendererTurbo(this, 33, 53, textureX, textureY); // Box 129
		bodyModel[34] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 130
		bodyModel[35] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 23
		bodyModel[36] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		bodyModel[37] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		bodyModel[45] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		bodyModel[46] = new ModelRendererTurbo(this, 49, 66, textureX, textureY); // Box 135
		bodyModel[47] = new ModelRendererTurbo(this, 49, 66, textureX, textureY); // Box 136
		bodyModel[48] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 189

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

		bodyModel[5].addShapeBox(-4F, 0F, -2.5F, 2, 1, 5, 0F,-0.5F, 0.7F, 0F, -0.5F, 0.8F, 0F, 2F, 0.8F, 0F, -0.5F, 0.7F, 0F, 0F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, 2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 16
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0.7F, 0.5F, 0.2F); // Box 33
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 5F, -2.5F, 4, 5, 5, 0F,-0.1F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0F, 0F, 0.4F, -0.1F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 38
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.5F, 8.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 52
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 53
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 55
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 56
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 59
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.5F, 8.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 60
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 61
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 62
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.7F, 5.4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 63
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4.2F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 64
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(3.2F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 66
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(3F, 4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 69
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 70
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1.5F, 4.6F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1.5F, 3.6F, -3.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1.5F, 5.6F, -3.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-2.5F, 4.6F, -3F, 5, 1, 6, 0F,-0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F, -0.05F, -0.3F, -0.02F); // Box 87
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 5F, -2.5F, 1, 5, 5, 0F,1F, -0.3F, 0.45F, 0.9F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, -0.3F, 0.45F, 0.6F, 0F, 0.2F, -0.1F, -1.5F, 0.45F, 0F, -1.5F, 0.45F, 0.6F, 0F, 0.2F); // Box 98
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.5F, 4.6F, -3F, 2, 1, 6, 0F,0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F); // Box 99
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1.5F, -0.5F, -4.1F, 3, 5, 1, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0.5F, -2.8F, 0F, 0.5F, -2.8F, 0F, 0.5F, -3F, 0.5F, 0.5F, -3F, 0.5F); // Box 100
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 1.5F, -2.7F, 4, 3, 1, 0F,-0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0F, -0.1F, 0.5F, 0F); // Box 113
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2.5F, 4.6F, -3F, 2, 1, 6, 0F,0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.02F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.1F, 0.05F, -0.3F, -0.02F); // Box 114
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(3F, 5F, -2.5F, 1, 5, 5, 0F,0.9F, 0F, 0.7F, 1F, -0.3F, 0.45F, 1F, -0.3F, 0.45F, 1F, 0F, 0.7F, -0.1F, -1.5F, 0.45F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0F, -1.5F, 0.45F); // Box 115
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 118
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.8F, 5F, -2.5F, 1, 5, 5, 0F,1F, -0.3F, 0.45F, 0.9F, 0F, 0.7F, 1F, 0F, 0.7F, 1F, -0.3F, 0.45F, 0.6F, 0F, 0.2F, -0.1F, -1.5F, 0.45F, 0F, -1.5F, 0.45F, 0.6F, 0F, 0.2F); // Box 128
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2.8F, 5F, -2.5F, 1, 5, 5, 0F,0.9F, 0F, 0.7F, 1F, -0.3F, 0.45F, 1F, -0.3F, 0.45F, 1F, 0F, 0.7F, -0.1F, -1.5F, 0.45F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0F, -1.5F, 0.45F); // Box 129
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(2.7F, 5.4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 130
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4.2F, 10.5F, -2.6F, 4, 3, 1, 0F,0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.7F, 0F, 0.7F, 0F, 0.2F, 0.7F, 0F, 0.2F, -1.2F, 0.7F, 0F, -1.2F); // Box 23
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4.5F, 10F, -2.5F, 1, 4, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.9F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F, 0.9F, -0.5F, 0.5F); // Box 34
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(0.2F, 10.5F, -2.6F, 4, 3, 1, 0F,0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0F, 0.2F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, -1.2F, 0F, 0.2F, -1.2F); // Box 43
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-4.2F, 10.5F, 1.6F, 4, 3, 1, 0F,0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, -1.2F, 0F, 0.2F, -1.2F, 0F, 0.2F, 0.7F, 0.7F, 0F, 0.7F); // Box 44
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0.2F, 10.5F, 1.6F, 4, 3, 1, 0F,0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, -1.2F, 0.7F, 0F, -1.2F, 0.7F, 0F, 0.7F, 0F, 0.2F, 0.7F); // Box 45
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(3.5F, 10F, -2.5F, 1, 4, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.4F, -0.5F, 0.5F, 0.9F, -0.5F, 0.5F, 0.9F, -0.5F, 0.5F, -1.4F, -0.5F, 0.5F); // Box 46
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4.5F, 11.5F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 79
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-1.5F, 11.7F, -3.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 80
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0.5F, 11.7F, -3.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 82
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.5F, 11.5F, 2.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 83
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(3.5F, 11.5F, 2.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 86
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-5F, -0.5F, -4.1F, 3, 5, 1, 0F,-1F, 0.5F, -1.5F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0.5F, 1.5F, 0F, -3.8F, -0.7F, 0F, -2.8F, 0F, 0F, -3F, 0.5F, 0F, -4F, 0.5F); // Box 135
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2F, -0.5F, -4.1F, 3, 5, 1, 0F,1F, 0F, -1F, -1F, 0.5F, -1.5F, -1F, 0.5F, 1.5F, 1F, 0F, 1F, 0F, -2.8F, 0F, 0F, -3.8F, -0.7F, 0F, -4F, 0.5F, 0F, -3F, 0.5F); // Box 136
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(2F, 0F, -2.5F, 2, 1, 5, 0F,-0.5F, 0.8F, 0F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, 2F, 0.8F, 0F, -0.2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 2F, 0.5F, 0.2F); // Box 189
		bodyModel[48].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 161
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 162
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 163
		leftArmModel[3] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 164
		leftArmModel[4] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 165
		leftArmModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 166
		leftArmModel[6] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 167
		leftArmModel[7] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 168
		leftArmModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 169
		leftArmModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 170
		leftArmModel[10] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 171
		leftArmModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 172
		leftArmModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 179
		leftArmModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 180
		leftArmModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 181
		leftArmModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 182
		leftArmModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 183
		leftArmModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 184
		leftArmModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 185
		leftArmModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 186
		leftArmModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 187
		leftArmModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 188
		leftArmModel[22] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 191

		leftArmModel[0].addShapeBox(-1F, 4F, -2F, 1, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F); // Box 161
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -2F, 1, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F); // Box 162
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 2F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F); // Box 163
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.5F, 4.5F, -2.5F, 4, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F); // Box 164
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(3F, -2F, -2F, 1, 5, 4, 0F,-0.2F, 0.2F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, -0.1F, 0.8F, 1.2F, 0F, 0.7F, 1.2F, 0F, 0.7F, -0.2F, -0.1F, 0.8F); // Box 165
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(0.3F, 3F, -2F, 5, 2, 4, 0F,1F, 0.5F, 1.1F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, 1F, 0.5F, 1.1F, -3F, 0F, 1F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, -3F, 0F, 1F); // Box 166
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, -2F, -3F, 4, 5, 6, 0F,0.5F, 0.7F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.5F, 0.7F, -0.5F, -0.3F, -0.5F, 0.1F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, -0.3F, -0.5F, 0.1F); // Box 167
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-0.5F, 3.5F, -2.5F, 4, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F); // Box 168
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-0.5F, 5.5F, -2.5F, 4, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F); // Box 169
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-0.5F, 6.5F, -2.5F, 4, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F); // Box 170
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-0.5F, 7.5F, -2.5F, 4, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F); // Box 171
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-0.5F, 2.5F, -2.5F, 4, 1, 5, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0.1F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F); // Box 172
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(1.9F, -2F, -2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 179
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(1.9F, -2F, 1.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 180
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.9F, -0.7F, 1.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 181
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(2.9F, -0.7F, -2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 182
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(3.5F, 1F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 183
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(3.5F, 1F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 184
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(3.9F, 2.5F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 185
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(3.9F, 2.5F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 186
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(4.3F, 4F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 187
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(4.3F, 4F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 188
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(0.3F, 3.3F, -2F, 5, 2, 4, 0F,1F, 0.5F, 1F, -0.1F, 0F, 0.6F, -0.1F, 0F, 0.6F, 1F, 0.5F, 1F, -3F, 0F, 0.9F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, -3F, 0F, 0.9F); // Box 191
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		rightArmModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 95
		rightArmModel[5] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 96
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 58, textureX, textureY); // Box 97
		rightArmModel[7] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 107
		rightArmModel[8] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 33
		rightArmModel[9] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 34
		rightArmModel[10] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 35
		rightArmModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 123
		rightArmModel[12] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 124
		rightArmModel[13] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 127
		rightArmModel[14] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 128
		rightArmModel[15] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 129
		rightArmModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 149
		rightArmModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 150
		rightArmModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 151
		rightArmModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 152
		rightArmModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 153
		rightArmModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		rightArmModel[22] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 190

		rightArmModel[0].addShapeBox(-4.5F, 1F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 47
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.9F, -0.7F, -2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 48
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.9F, -0.7F, 1.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 73
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-4.5F, 1F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 74
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(0F, 4F, -2F, 1, 1, 4, 0F,0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F); // Box 95
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(0F, 6F, -2F, 1, 1, 4, 0F,0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F); // Box 96
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-2F, 2F, -2F, 3, 1, 4, 0F,0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.5F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.6F, 0.6F, -0.2F, 0.5F); // Box 97
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3.5F, 4.5F, -2.5F, 4, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F); // Box 107
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-4F, -2F, -2F, 1, 5, 4, 0F,0F, -0.5F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, 0.2F, 0.5F, 0F, -0.5F, 0.5F, 1.2F, 0F, 0.7F, -0.2F, -0.1F, 0.8F, -0.2F, -0.1F, 0.8F, 1.2F, 0F, 0.7F); // Box 33
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-5.3F, 3F, -2F, 5, 2, 4, 0F,-0.1F, 0F, 0.7F, 1F, 0.5F, 1.1F, 1F, 0.5F, 1.1F, -0.1F, 0F, 0.7F, 0.5F, 0.5F, 0.5F, -3F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0.5F, 0.5F); // Box 34
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3F, -2F, -3F, 4, 5, 6, 0F,0.2F, 0.2F, -0.5F, 0.5F, 0.7F, -0.5F, 0.5F, 0.7F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, -0.1F, -0.2F, -0.3F, -0.5F, 0.1F, -0.3F, -0.5F, 0.1F, 0.2F, -0.1F, -0.2F); // Box 35
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3.5F, 3.5F, -2.5F, 4, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F); // Box 123
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3.5F, 5.5F, -2.5F, 4, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F); // Box 124
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.5F, 6.5F, -2.5F, 4, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F); // Box 127
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.5F, 7.5F, -2.5F, 4, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F); // Box 128
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3.5F, 2.5F, -2.5F, 4, 1, 5, 0F,0.1F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0F, 0.7F, 0F, 0F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, 0.7F, 0F, 0F); // Box 129
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-4.9F, 2.5F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 149
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-4.9F, 2.5F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 150
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-5.3F, 4F, -3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 151
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-5.3F, 4F, 2F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 152
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-2.9F, -2F, -2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 153
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-2.9F, -2F, 1.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 154
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-5.3F, 3.3F, -2F, 5, 2, 4, 0F,-0.1F, 0F, 0.6F, 1F, 0.5F, 1F, 1F, 0.5F, 1F, -0.1F, 0F, 0.6F, 0.5F, 0.5F, 0.4F, -3F, 0F, 1F, -3F, 0F, 1F, 0.5F, 0.5F, 0.4F); // Box 190
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 58
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 72
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		leftLegModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 76
		leftLegModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 77
		leftLegModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		leftLegModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		leftLegModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		leftLegModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		leftLegModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 87
		leftLegModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 90
		leftLegModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		leftLegModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 131
		leftLegModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 133
		leftLegModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 137
		leftLegModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 141
		leftLegModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 142
		leftLegModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 144
		leftLegModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 146
		leftLegModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 148

		leftLegModel[0].addShapeBox(-1.5F, -0.300000000000001F, 2.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 85
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 11, 4, 0F,-0.1F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, -0.3F, -2F, 2.2F, 2.5F, -3F, 1.5F, 2.5F, -3F, 1.5F, -0.3F, -2F, 2.2F); // Box 58
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.5F, 1.7F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 72
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 3.2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 74
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1.5F, 4.7F, -4.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 76
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1.5F, 6.2F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 77
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(2.8F, 6.7F, -3.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 80
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(2.8F, 6.7F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 82
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-1.5F, 6.2F, 3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 83
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-1.5F, 4.7F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 85
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-1.5F, 3.2F, 2.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 87
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-1.5F, 1.7F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 90
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(1.5F, -0.5F, -3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 81
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(-1.5F, 7.7F, -4.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 131
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(-1.5F, 7.7F, 3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 133
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);

		leftLegModel[15].addShapeBox(2.5F, 5.2F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 137
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);

		leftLegModel[16].addShapeBox(2.1F, 3.7F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 141
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);

		leftLegModel[17].addShapeBox(1.8F, 2.2F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 142
		leftLegModel[17].setRotationPoint(0F, 0F, 0F);

		leftLegModel[18].addShapeBox(1.8F, 2.2F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 144
		leftLegModel[18].setRotationPoint(0F, 0F, 0F);

		leftLegModel[19].addShapeBox(2.1F, 3.7F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 146
		leftLegModel[19].setRotationPoint(0F, 0F, 0F);

		leftLegModel[20].addShapeBox(2.5F, 5.2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 148
		leftLegModel[20].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		rightLegModel[1] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 69
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 71
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 73
		rightLegModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 75
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 78
		rightLegModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		rightLegModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		rightLegModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		rightLegModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		rightLegModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		rightLegModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 89
		rightLegModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 130
		rightLegModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 132
		rightLegModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 138
		rightLegModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 139
		rightLegModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 140
		rightLegModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 143
		rightLegModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 145
		rightLegModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 147

		rightLegModel[0].addShapeBox(0.5F, -0.300000000000001F, 2.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 84
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 11, 4, 0F,0.5F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, -0.1F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 2.5F, -3F, 1.5F, -0.3F, -2F, 2.2F, -0.3F, -2F, 2.2F, 2.5F, -3F, 1.5F); // Box 69
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(0.5F, 1.7F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 71
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(0.5F, 3.2F, -3.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 73
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(0.5F, 4.7F, -4.1F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 75
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(0.5F, 6.2F, -4.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 78
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3.8F, 6.7F, -3.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 79
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3.8F, 6.7F, 2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 81
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(0.5F, 6.2F, 3.3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 84
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(0.5F, 4.7F, 3F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 86
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(0.5F, 3.2F, 2.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 88
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(0.5F, 1.7F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 89
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(0.5F, 7.7F, -4.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 130
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(0.5F, 7.7F, 3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 132
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-3.5F, 5.2F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 138
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);

		rightLegModel[15].addShapeBox(-3.1F, 3.7F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 139
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);

		rightLegModel[16].addShapeBox(-2.8F, 2.2F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 140
		rightLegModel[16].setRotationPoint(0F, 0F, 0F);

		rightLegModel[17].addShapeBox(-2.8F, 2.2F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 143
		rightLegModel[17].setRotationPoint(0F, 0F, 0F);

		rightLegModel[18].addShapeBox(-3.1F, 3.7F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 145
		rightLegModel[18].setRotationPoint(0F, 0F, 0F);

		rightLegModel[19].addShapeBox(-3.5F, 5.2F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 147
		rightLegModel[19].setRotationPoint(0F, 0F, 0F);
	}
}