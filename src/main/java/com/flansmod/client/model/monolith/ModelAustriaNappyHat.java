//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AustriaNappyHat
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAustriaNappyHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelAustriaNappyHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[21];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 14
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		headModel[3] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 29
		headModel[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 9
		headModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		headModel[6] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 12
		headModel[8] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 41
		headModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		headModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 15
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
		headModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 17
		headModel[13] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 18
		headModel[14] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 19
		headModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 20
		headModel[16] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 21
		headModel[17] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 22
		headModel[18] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 23
		headModel[19] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 24
		headModel[20] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 25

		headModel[0].addShapeBox(-4F, -6.5F, -3.9F, 8, 3, 8, 0F,0.3F, 1.7F, 0.2F, 0.3F, 1.7F, 0.2F, 0.3F, 0.9F, 0.5F, 0.3F, 0.9F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, -0.7F, 0.1F, 0.5F, -0.7F, 0.1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -5.5F, -7F, 9, 1, 2, 0F,-2.3F, -0.8F, -1.3F, -2.3F, -0.8F, -1.3F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -1.8F, 0.9F, 0.3F, -1.8F, 0.9F, 0.3F, 0.5F, 0.5F, -0.1F, 0.5F, 0.5F, -0.1F); // Box 14
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -10.5F, -3.9F, 8, 2, 8, 0F,-1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 1.1F, 0.5F, 0.3F, 1.1F, 0.5F); // Box 23
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -6F, -5F, 9, 1, 3, 0F,-0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.7F, 0.5F, 1F, 0.1F, 0.5F, 1F, 0.1F, -1.8F, 0F, 4.3F, -1.8F, 0F, 4.3F); // Box 29
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, -5F, 1.5F, 9, 1, 3, 0F,-0.2F, 0.5F, 0.7F, -0.2F, 0.5F, 0.7F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.5F, -1F, 4.3F, -0.5F, -1F, 4.3F, 0.5F, 1.5F, 0.1F, 0.5F, 1.5F, 0.1F); // Box 9
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -4.5F, 4.5F, 9, 1, 3, 0F,-0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -2.3F, -1.5F, -1.3F, -2.3F, -1.5F, -1.3F, 0.5F, 1F, -0.1F, 0.5F, 1F, -0.1F, -1.8F, 2.2F, 0.3F, -1.8F, 2.2F, 0.3F); // Box 10
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-3F, -11.8F, -1.9F, 6, 2, 6, 0F,-2.8F, -0.2F, -2.5F, -2.8F, -0.2F, -2.5F, -2.8F, -0.2F, -3.1F, -2.8F, -0.2F, -3.1F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -4.5F, -3F, 8, 5, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 12
		headModel[7].setRotationPoint(0F, 0F, 0F);
		headModel[7].rotateAngleX = -0.12217305F;

		headModel[8].addShapeBox(-1.5F, -5.5F, -3F, 3, 1, 1, 0F,3.2F, 0.2F, 0F, 3.2F, 0.2F, 0F, 3.2F, 0.2F, 0.5F, 3.2F, 0.2F, 0.5F, 3.2F, 0F, 0F, 3.2F, 0F, 0F, 3.2F, 0F, 0.5F, 3.2F, 0F, 0.5F); // Box 41
		headModel[8].setRotationPoint(0F, 0F, 0F);
		headModel[8].rotateAngleX = -0.12217305F;

		headModel[9].addShapeBox(-1F, -7.5F, 5.1F, 2, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, 0.4F, 0.3F, 0.5F, -0.4F, 0.3F, 0.5F, -0.4F); // Box 14
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1F, -11.5F, 5.1F, 2, 4, 1, 0F,0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 15
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1F, -14.5F, 5.1F, 2, 3, 1, 0F,0.3F, 0.5F, 3F, 0.3F, 0.5F, 3F, 0.3F, -1F, -1.5F, 0.3F, -1F, -1.5F, 0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 16
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1F, -15F, 0.1F, 2, 2, 3, 0F,0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.5F, 0.6F, 0.3F, 0.5F, 0.6F); // Box 17
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -15F, -2.9F, 2, 2, 3, 0F,0.3F, 0.5F, 1.3F, 0.3F, 0.5F, 1.3F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0.6F, 0.3F, 0.5F, 0.6F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F); // Box 18
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-0.5F, -14F, -0.9F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -12F, 3.1F, 1, 8, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1F, -5F, 5.1F, 2, 2, 1, 0F,0.3F, 0F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0F, 0F, 1.3F, 0F, 0F, 1.3F); // Box 21
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-3.5F, -7.3F, -4.5F, 7, 1, 1, 0F,-1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-3.5F, -9.8F, -4.5F, 7, 2, 1, 0F,-2.5F, 0.3F, -1.5F, -2.5F, 0.3F, -1.5F, -2.5F, 0.3F, 1F, -2.5F, 0.3F, 1F, -1.5F, 0F, 0.1F, -1.5F, 0F, 0.1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 23
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-3.5F, -6.3F, -4.5F, 7, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1.5F, -11.8F, -2F, 3, 2, 1, 0F,-1F, 0F, -1.5F, -1F, 0F, -1.5F, -1F, -0.5F, 2.1F, -1F, -0.5F, 2.1F, -0.5F, -0.3F, 1F, -0.5F, -0.3F, 1F, -0.5F, -0.3F, -1.5F, -0.5F, -0.3F, -1.5F); // Box 25
		headModel[20].setRotationPoint(0F, 0F, 0F);
	}
}