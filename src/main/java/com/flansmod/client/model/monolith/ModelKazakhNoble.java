//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KazakhNoble
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKazakhNoble extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelKazakhNoble() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[51];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		bodyModel[2] = new ModelRendererTurbo(this, 46, 54, textureX, textureY); // Box 13
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 16
		bodyModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 33
		bodyModel[6] = new ModelRendererTurbo(this, 46, 54, textureX, textureY); // Box 38
		bodyModel[7] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 52
		bodyModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 55
		bodyModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 56
		bodyModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 59
		bodyModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 60
		bodyModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 61
		bodyModel[14] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 62
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 63
		bodyModel[16] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 64
		bodyModel[17] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 66
		bodyModel[18] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 69
		bodyModel[19] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 70
		bodyModel[20] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 84
		bodyModel[21] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 85
		bodyModel[22] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 86
		bodyModel[23] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 130
		bodyModel[24] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 23
		bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		bodyModel[26] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		bodyModel[28] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		bodyModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		bodyModel[31] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		bodyModel[32] = new ModelRendererTurbo(this, 25, 72, textureX, textureY); // Box 44
		bodyModel[33] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 156
		bodyModel[34] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 172
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 173
		bodyModel[36] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 73
		bodyModel[37] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 74
		bodyModel[38] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 75
		bodyModel[39] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 76
		bodyModel[40] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 77
		bodyModel[41] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 78
		bodyModel[42] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 79
		bodyModel[43] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 80
		bodyModel[44] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 81
		bodyModel[45] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 82
		bodyModel[46] = new ModelRendererTurbo(this, 25, 72, textureX, textureY); // Box 83
		bodyModel[47] = new ModelRendererTurbo(this, 25, 72, textureX, textureY); // Box 84
		bodyModel[48] = new ModelRendererTurbo(this, 25, 72, textureX, textureY); // Box 85
		bodyModel[49] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 87
		bodyModel[50] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 88

		bodyModel[0].addShapeBox(-4F, 9F, -2.5F, 8, 1, 5, 0F,0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, 0F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F, 0.55F, -0.2F, 0.25F); // Box 22
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2.5F, 8, 1, 5, 0F,0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.1F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F, 0.6F, -0.3F, 0.3F); // Box 44
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 5F, -2.5F, 4, 4, 5, 0F,0.7F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.7F, 0F, 0.4F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 13
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 1.5F, -2.7F, 4, 3, 1, 0F,0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -1F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F); // Box 15
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2.5F, 2, 1, 5, 0F,0.5F, 0.7F, 0F, -0.5F, 0.8F, 0F, 2F, 0.8F, 0F, 0.5F, 0.7F, 0F, 0.3F, 1.5F, 0.2F, 2F, 0.5F, 0.2F, 2F, 0.5F, 0.2F, 0.3F, 1.5F, 0.2F); // Box 16
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 1.5F, 1.7F, 4, 3, 1, 0F,0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -1F, 0F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0.7F, 0.5F, 0.2F); // Box 33
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 5F, -2.5F, 4, 4, 5, 0F,0F, 0F, 0.4F, 0.7F, 0F, 0.4F, 0.7F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 38
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 10F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 52
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.5F, 7.4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 53
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 1.8F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 55
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.5F, 1.8F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 56
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.5F, 7.4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 59
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0.5F, 10F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 60
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.2F, 0.8F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 61
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 3.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 62
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.7F, 6F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 63
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4.2F, 7.6F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 64
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(3.2F, 7.6F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 66
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2.5F, 3.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 69
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.2F, 0.8F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 70
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-2F, 4.6F, -3.5F, 4, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 84
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2F, 3.1F, -3.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 85
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-2F, 6.1F, -3.5F, 4, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 86
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(2.7F, 6F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 130
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4.2F, 9.5F, -2.6F, 4, 3, 1, 0F,0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.7F, 1F, 0.9F, 0.2F, 1.4F, 1.1F, 0.2F, 1.4F, -1.2F, 0.7F, 1F, -1.2F); // Box 23
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4.5F, 9F, -2.5F, 1, 4, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.3F, 0.5F, 0.5F, -1.4F, 0.5F, 0.5F, -1.4F, 0.5F, 0.5F, 1.3F, 0.5F, 0.5F); // Box 34
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.2F, 9.5F, 1.6F, 4, 3, 1, 0F,0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.7F, 1F, -1.2F, 0.2F, 1.2F, -1.2F, 0.2F, 1.2F, 0.9F, 0.7F, 1F, 0.9F); // Box 44
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.5F, 11.5F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 79
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1.5F, 11.7F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 80
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(0.5F, 11.7F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 82
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4.5F, 11.5F, 2.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 83
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3.5F, 11.5F, 2.4F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 86
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4F, 9.5F, -2F, 9, 12, 4, 0F,0.2F, 0F, 0.5F, -5F, 0F, 0.6F, -5F, 0F, -1.4F, 0.2F, 0F, -1.5F, 1.4F, -6.5F, 1.1F, -5.7F, -6.2F, 1.1F, -5.7F, -6.2F, -1.2F, 1.7F, -6.5F, -1.3F); // Box 44
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(3.5F, 11.5F, -3.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 156
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0.5F, 11.7F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 172
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-1.5F, 11.7F, 2.5F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 173
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-5F, -0.5F, -3F, 1, 3, 6, 0F,0.1F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F); // Box 73
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-5F, 2.5F, -3F, 1, 2, 6, 0F,-0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0.2F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0.1F, 0.2F, 0F); // Box 74
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-6F, 13F, -3.5F, 6, 1, 7, 0F,0F, 0.2F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.3F, 0.3F); // Box 75
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0F, 1.5F, -2.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0.7F, 0.5F, 0.2F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 76
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2F, 0F, -2.5F, 2, 1, 5, 0F,-0.5F, 0.8F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, 2F, 0.8F, 0F, 2F, 0.5F, 0.2F, 0.3F, 1.5F, 0.2F, 0.3F, 1.5F, 0.2F, 2F, 0.5F, 0.2F); // Box 77
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(0F, 1.5F, 1.7F, 4, 3, 1, 0F,0F, 0F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 78
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(0.2F, 9.5F, -2.6F, 4, 3, 1, 0F,0.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 1.4F, 1.1F, 0.7F, 1F, 0.9F, 0.7F, 1F, -1.2F, 0.2F, 1.4F, -1.2F); // Box 79
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(0.2F, 9.5F, 1.6F, 4, 3, 1, 0F,0.2F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1.2F, -1.2F, 0.7F, 1F, -1.2F, 0.7F, 1F, 0.9F, 0.2F, 1.2F, 0.9F); // Box 80
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(3.5F, 9F, -2.5F, 1, 4, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.4F, 0.5F, 0.5F, 1.3F, 0.5F, 0.5F, 1.3F, 0.5F, 0.5F, -1.4F, 0.5F, 0.5F); // Box 81
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(0F, 13F, -3.5F, 6, 1, 7, 0F,0F, -0.3F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 82
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-5F, 9.5F, -2F, 9, 12, 4, 0F,-5F, 0F, 0.6F, 0.2F, 0F, 0.5F, 0.2F, 0F, -1.5F, -5F, 0F, -1.4F, -5.7F, -6.2F, 1.1F, 1.4F, -6.5F, 1.1F, 1.7F, -6.5F, -1.3F, -5.7F, -6.2F, -1.2F); // Box 83
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-4F, 9.5F, -2F, 9, 12, 4, 0F,0.2F, 0F, -1.5F, -5F, 0F, -1.4F, -5F, 0F, 0.6F, 0.2F, 0F, 0.5F, 1.7F, -6.5F, -1.3F, -5.7F, -6.2F, -1.2F, -5.7F, -6.2F, 1.1F, 1.4F, -6.5F, 1.1F); // Box 84
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-5F, 9.5F, -2F, 9, 12, 4, 0F,-5F, 0F, -1.4F, 0.2F, 0F, -1.5F, 0.2F, 0F, 0.5F, -5F, 0F, 0.6F, -5.7F, -6.2F, -1.2F, 1.7F, -6.5F, -1.3F, 1.4F, -6.5F, 1.1F, -5.7F, -6.2F, 1.1F); // Box 85
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(4F, 2.5F, -3F, 1, 2, 6, 0F,0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, -0.2F, 0.3F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, -0.2F, 0.3F, 0F); // Box 87
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(4F, -0.5F, -3F, 1, 3, 6, 0F,-0.2F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, -0.2F, 0.3F, -0.2F, 0.1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.1F, 0F, 0F); // Box 88
		bodyModel[50].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 163
		leftArmModel[1] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 164
		leftArmModel[2] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 170
		leftArmModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 171
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 86

		leftArmModel[0].addShapeBox(-1F, 8F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 163
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 164
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(3F, 4F, -2F, 1, 5, 4, 0F,-0.9F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.9F, 0.2F, 0F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 170
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(3.3F, 0.6F, -2F, 1, 3, 4, 0F,-1.4F, 0.2F, -0.5F, 0.6F, 0.2F, -0.5F, 0.6F, 0.2F, -0.5F, -1.4F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 171
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-5F, -2F, -2F, 8, 15, 4, 0F,-3.7F, 0.35F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, -3.7F, 0.35F, 0.3F, -4F, -8.4F, 0.7F, 0.6F, -8.6F, 0.3F, 0.6F, -8.6F, 0.3F, -4F, -8.4F, 0.7F); // Box 86
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 56
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 62
		rightArmModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 63
		rightArmModel[3] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 61
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 64

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 8, 15, 4, 0F,0.3F, 0.25F, 0.3F, -3.7F, 0.35F, 0.3F, -3.7F, 0.35F, 0.3F, 0.3F, 0.25F, 0.3F, 0.6F, -8.6F, 0.3F, -4F, -8.4F, 0.7F, -4F, -8.4F, 0.7F, 0.6F, -8.6F, 0.3F); // Box 56
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-4F, 4F, -2F, 1, 5, 4, 0F,0.3F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F); // Box 62
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4.3F, 0.6F, -2F, 1, 3, 4, 0F,0.6F, 0.2F, -0.5F, -1.4F, 0.2F, -0.5F, -1.4F, 0.2F, -0.5F, 0.6F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 63
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 6F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 61
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 8F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 64
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}
}