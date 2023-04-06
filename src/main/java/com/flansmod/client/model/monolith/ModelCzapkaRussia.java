//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CzapkaRussia
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCzapkaRussia extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCzapkaRussia() //Same as Filename
	{
		headModel = new ModelRendererTurbo[42];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		headModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		headModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 14
		headModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 25
		headModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		headModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 28
		headModel[10] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 29
		headModel[11] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 62
		headModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 85
		headModel[13] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 86
		headModel[14] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 87
		headModel[15] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 29
		headModel[16] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 30
		headModel[17] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 31
		headModel[18] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 32
		headModel[19] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 34
		headModel[20] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 35
		headModel[21] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 36
		headModel[22] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 37
		headModel[23] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 38
		headModel[24] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 39
		headModel[25] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 40
		headModel[26] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 41
		headModel[27] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 42
		headModel[28] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 43
		headModel[29] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 44
		headModel[30] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 45
		headModel[31] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 46
		headModel[32] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 47
		headModel[33] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 48
		headModel[34] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 49
		headModel[35] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 50
		headModel[36] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 51
		headModel[37] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 52
		headModel[38] = new ModelRendererTurbo(this, 21, 58, textureX, textureY); // Box 53
		headModel[39] = new ModelRendererTurbo(this, 49, 13, textureX, textureY); // Box 8
		headModel[40] = new ModelRendererTurbo(this, 17, 32, textureX, textureY); // Box 14
		headModel[41] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 41

		headModel[0].addShapeBox(-5F, -8.5F, -6F, 10, 4, 10, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -10.5F, -4F, 5, 4, 8, 0F,0F, 2.25F, 2.5F, 1F, 1F, 1F, 1F, -1F, 0.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.7F, 0.25F); // Box 4
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -5.5F, -6F, 5, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -4.5F, -3F, 8, 5, 1, 0F,1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, 1.2F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F); // Box 12
		headModel[3].setRotationPoint(0F, 0F, 0F);
		headModel[3].rotateAngleX = -0.12217305F;

		headModel[4].addShapeBox(-6F, -11.5F, -5.2F, 1, 10, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 11
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addBox(-6F, -11.5F, -5.3F, 1, 1, 1, 0F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-6F, -7.5F, -5.2F, 1, 2, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3F, -8.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 3.075F, -2.475F, 0F, -4.05F, -1.45F, 0F, -4.05F, -1.45F, 0F, 3.075F, -2.475F, 0F); // Box 25
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(5F, -11.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, -0.25F, 0F, 0F, -0.125F, 0F, 2F, -1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -1F, 0F); // Box 26
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addBox(5F, -11.5F, -5.3F, 1, 1, 1, 0F); // Box 28
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-6F, -3.5F, -5.2F, 1, 2, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5F, -10.5F, -4F, 5, 4, 8, 0F,1F, 1F, 1F, 0F, 2.25F, 2.5F, 0F, 1F, 1F, 1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.25F, 0F, 0.5F, 0.25F); // Box 62
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(0F, -5.5F, -6F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -8.5F, -5F, 1, 4, 1, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -3.925F, -1.45F, 0F, 2.95F, -2.475F, 0F, 2.95F, -2.475F, 0F, -3.925F, -1.45F, 0F); // Box 86
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-6F, -11.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F, -0.25F, 0F, -2.5F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2.5F, 0F, 0F); // Box 87
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -10F, -5.9F, 1, 1, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F); // Box 29
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -9.6F, -5.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 30
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -9F, -5.7F, 1, 1, 1, 0F,-0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 31
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-0.5F, -8.9F, -5.6F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-0.5F, -10.25F, -6F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F); // Box 34
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-0.5F, -10.5F, -6F, 1, 1, 1, 0F,-0.62F, -0.35F, 0F, -0.22F, -0.35F, 0F, -0.22F, -0.35F, -0.3F, -0.62F, -0.35F, -0.3F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 35
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-0.8F, -10.65F, -6F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 36
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.2F, -10.65F, -6F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 37
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-0.5F, -10.5F, -6F, 1, 1, 1, 0F,-0.22F, -0.35F, 0F, -0.62F, -0.35F, 0F, -0.62F, -0.35F, -0.3F, -0.22F, -0.35F, -0.3F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 38
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-0.75F, -10.8F, -5.8F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 39
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-0.25F, -10.8F, -5.8F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 40
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-1F, -9.7F, -5.6F, 1, 1, 1, 0F,-0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, 0F, -0.3F, -0.45F, -0.1F, -0.3F, -0.35F, -0.1F); // Box 41
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(0F, -9.7F, -5.6F, 1, 1, 1, 0F,-0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.45F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.1F, -0.3F, -0.45F, -0.1F); // Box 42
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-1.5F, -9.7F, -5.6F, 1, 1, 1, 0F,-0.1F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.05F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F); // Box 43
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-1.5F, -10F, -5.85F, 1, 1, 1, 0F,-0.3F, 0.25F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, -0.3F, 0.25F, -0.5F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F); // Box 44
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-0.5F, -11.05F, -5.7F, 1, 1, 1, 0F,-0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F); // Box 45
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(0.5F, -9.7F, -5.6F, 1, 1, 1, 0F,-0.05F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, -0.3F, -0.05F, -0.35F, -0.3F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F); // Box 46
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(0.5F, -10F, -5.85F, 1, 1, 1, 0F,0F, -0.4F, 0F, -0.3F, 0.25F, 0F, -0.3F, 0.25F, -0.5F, 0F, -0.4F, -0.3F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F); // Box 47
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-0.5F, -9F, -5.7F, 1, 1, 1, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F); // Box 48
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-0.5F, -9F, -5.7F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F); // Box 49
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-0.5F, -9F, -5.6F, 1, 1, 1, 0F,0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F); // Box 50
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-0.5F, -9F, -5.6F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F); // Box 51
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(0.45F, -8.95F, -5.7F, 1, 1, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 52
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-2.2F, -9.15F, -5.7F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, -1F, -0.45F, 0F); // Box 53
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-0.5F, -12.5F, -6.7F, 1, 1, 1, 0F,0.3F, 0.5F, 0.25F, 0.3F, 0.5F, 0.25F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, -0.125F, 0.3F, 0.5F, -0.125F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F); // Box 8
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-0.5F, -17.5F, -5.8F, 1, 5, 1, 0F,0.5F, 0.25F, 2.75F, 0.25F, 0.25F, 2.75F, 0.25F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 14
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-2F, -5.5F, -3F, 4, 1, 1, 0F,3.5F, 0.2F, 0F, 3.5F, 0.2F, 0F, 3.5F, 0.2F, 0.5F, 3.5F, 0.2F, 0.5F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F); // Box 41
		headModel[41].setRotationPoint(0F, 0F, 0F);
		headModel[41].rotateAngleX = -0.12217305F;
	}
}