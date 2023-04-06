//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SwedoidBucket
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSwedoidBucket extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelSwedoidBucket() //Same as Filename
	{
		headModel = new ModelRendererTurbo[42];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 2
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		headModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 21
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		headModel[6] = new ModelRendererTurbo(this, 25, 12, textureX, textureY); // Box 2
		headModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		headModel[8] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 7
		headModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 8
		headModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		headModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		headModel[12] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 11
		headModel[13] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 12
		headModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 14
		headModel[15] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 15
		headModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 16
		headModel[17] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 17
		headModel[18] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 18
		headModel[19] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 19
		headModel[20] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 20
		headModel[21] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 21
		headModel[22] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 22
		headModel[23] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 23
		headModel[24] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 53
		headModel[25] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 54
		headModel[26] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 55
		headModel[27] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 56
		headModel[28] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 57
		headModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 78
		headModel[30] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 87
		headModel[31] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 88
		headModel[32] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		headModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 46
		headModel[34] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 47
		headModel[35] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 48
		headModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[37] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		headModel[38] = new ModelRendererTurbo(this, 25, 12, textureX, textureY); // Box 51
		headModel[39] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		headModel[40] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 53
		headModel[41] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 54

		headModel[0].addShapeBox(-6F, -9F, -5.5F, 6, 5, 5, 0F,-1.2F, -0.8F, -0.9F, 0F, -0.8F, -0.4F, 0F, -0.8F, 0F, -0.9F, -0.8F, 0F, -0.7F, 0.2F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0F, 0.2F, -0.3F, 0F); // Box 2
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -9F, -5.4F, 1, 6, 1, 0F,-0.1F, -0.8F, -0.1F, -0.1F, -0.8F, -0.1F, -0.2F, -0.8F, 1.1F, -0.2F, -0.8F, 1.1F, 0.1F, -0.5F, 1.3F, 0.1F, -0.5F, 1.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 4
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1.7F, -1.45F, -5.95F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 14
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1.7F, -0.65F, -5.85F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 17
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1.7F, 0.15F, -5.8F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 21
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-6F, -2.8F, -5.5F, 6, 5, 5, 0F,-0.7F, 0.2F, 0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0F, 0.15F, 0.7F, 0F, -1F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, -0.3F, -1.5F, 0F); // Box 0
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-6F, -9F, -0.5F, 6, 5, 6, 0F,-0.9F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.2F, -1.2F, -0.8F, -0.7F, 0.2F, -0.3F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0.8F, -0.7F, -0.3F, -0.2F); // Box 2
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-6F, -3.6F, -0.5F, 6, 5, 6, 0F,0.2F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.7F, 0.8F, -0.7F, 0.7F, -0.2F, -0.3F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.2F, 0.5F, -1.3F, -0.2F, -0.4F); // Box 3
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -4F, -5.4F, 1, 6, 1, 0F,0.1F, -0.5F, 1.3F, 0.1F, -0.5F, 1.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, -0.1F, 0.9F, 0.3F, -0.1F, 0.9F, 0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F); // Box 7
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.7F, -2.2F, -6F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 8
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1.7F, 0.9F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 9
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5.2F, -3.2F, -5.5F, 5, 1, 4, 0F,-0.8F, 0F, 0.5F, 0F, -0.2F, 1F, 0F, 0.3F, 0.2F, 0.2F, 0.6F, 0.2F, -0.9F, -0.4F, 0.2F, 0F, -0.1F, 0.8F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 10
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5.2F, -4.5F, -5.5F, 5, 1, 4, 0F,-0.9F, 0.1F, 0.2F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0F, 0F, 0.3F, 0F, -0.8F, -0.2F, 0.5F, 0F, -0.2F, 1F, 0F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F); // Box 11
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.7F, -4.5F, -5.5F, 2, 1, 4, 0F,-0.3F, -0.8F, 0.5F, -0.2F, -0.8F, 0.61F, -0.2F, -0.2F, 0.2F, 0.7F, -0.3F, 0.2F, -0.3F, 0.3F, 0.5F, -0.2F, 0.37F, 0.65F, -0.2F, -0.1F, 0.2F, 0.7F, -0.3F, 0.2F); // Box 12
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-2.5F, -1.6F, -5.85F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 14
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-2.5F, -0.8F, -5.75F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 15
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2.5F, -1.11022302462516E-16F, -5.65F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 16
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-2.5F, 0.75F, -5.55F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 17
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-2.5F, -2.35F, -5.9F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 18
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-3.35F, -2.45F, -5.8F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 19
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-3.35F, -1.7F, -5.7F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 20
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-3.35F, -0.9F, -5.65F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 21
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-3.35F, -0.1F, -5.45F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 22
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-3.35F, 0.65F, -5.3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 23
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4.25F, -2.55F, -5.65F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 53
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-4.25F, -1.8F, -5.6F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 54
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-4.25F, -1F, -5.4F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 55
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-4.25F, -0.2F, -5.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 56
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-4.25F, 0.55F, -5.1F, 1, 1, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, -0.05F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 57
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(2.7F, -4.5F, -5.5F, 2, 1, 4, 0F,-0.2F, -0.8F, 0.61F, -0.3F, -0.8F, 0.5F, 0.7F, -0.3F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, 0.37F, 0.65F, -0.3F, 0.3F, 0.5F, 0.7F, -0.3F, 0.2F, -0.2F, -0.1F, 0.2F); // Box 78
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(0.2F, -4.5F, -5.5F, 5, 1, 4, 0F,0F, 0.2F, 0.8F, -0.9F, 0.1F, 0.2F, 0F, 0.3F, 0F, 0F, 0.4F, 0F, 0F, -0.2F, 1F, -0.8F, -0.2F, 0.5F, 0.2F, -0.7F, 0.2F, 0F, -0.7F, 0.2F); // Box 87
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(0.2F, -3.2F, -5.5F, 5, 1, 4, 0F,0F, -0.2F, 1F, -0.8F, 0F, 0.5F, 0.2F, 0.6F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.1F, 0.8F, -0.9F, -0.4F, 0.2F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 88
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-6F, -3.5F, -5.5F, 2, 1, 5, 0F,-0.7F, 0.3F, 0F, 0F, 0.3F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.8F, 0F, -0.7F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0.1F, 0F, 0.15F, -1F, 0F); // Box 45
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-6F, -10.5F, -5.5F, 6, 3, 6, 0F,-0.7F, -2F, -0.4F, 0F, -1.8F, 0.3F, 0F, 0.8F, -0.5F, -0.2F, -1.8F, -0.5F, -1F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 46
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-6F, -10.5F, -0.5F, 6, 3, 6, 0F,-0.2F, -1.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, -1.8F, 0.3F, -0.7F, -2F, -0.4F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.7F); // Box 47
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(0F, -9F, -5.5F, 6, 5, 5, 0F,0F, -0.8F, -0.4F, -1.2F, -0.8F, -0.9F, -0.9F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0.8F, -0.7F, 0.2F, 0F, 0.2F, -0.3F, 0F, 0F, 0.2F, 0F); // Box 48
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(4F, -3.5F, -5.5F, 2, 1, 5, 0F,0F, 0.3F, 0.2F, -0.7F, 0.3F, 0F, 0.2F, 0.8F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, 0.2F, -0.7F, -0.5F, 0F, 0.15F, -1F, 0F, 0F, 0.1F, 0F); // Box 49
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(0F, -2.8F, -5.5F, 6, 5, 5, 0F,0F, 0.2F, 0.8F, -0.7F, 0.2F, 0F, 0.15F, 0.7F, 0F, 0F, 0.2F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, -1F, -0.3F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 50
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(0F, -9F, -0.5F, 6, 5, 6, 0F,0F, -0.8F, 0F, -0.9F, -0.8F, 0F, -1.2F, -0.8F, -0.7F, 0F, -0.8F, -0.2F, 0F, 0.2F, 0F, 0.2F, -0.3F, 0F, -0.7F, -0.3F, -0.2F, 0F, -0.3F, 0.8F); // Box 51
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(0F, -3.6F, -0.5F, 6, 5, 6, 0F,0F, 0.2F, 0F, 0.2F, 0.7F, 0F, -0.7F, 0.7F, -0.2F, 0F, 0.7F, 0.8F, 0F, -0.7F, 0F, -0.3F, -0.7F, 0F, -1.3F, -0.2F, -0.4F, 0F, 0.2F, 0.5F); // Box 52
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(0F, -10.5F, -0.5F, 6, 3, 6, 0F,0F, 0.8F, -0.5F, -0.2F, -1.8F, -0.5F, -0.7F, -2F, -0.4F, 0F, -1.8F, 0.3F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.7F, 0F, 0F, 0F); // Box 53
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(0F, -10.5F, -5.5F, 6, 3, 6, 0F,0F, -1.8F, 0.3F, -0.7F, -2F, -0.4F, -0.2F, -1.8F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, -1F, 0F, -0.7F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 54
		headModel[41].setRotationPoint(0F, 0F, 0F);
	}
}