//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PersianHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPersianHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelPersianHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[19];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		headModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 15
		headModel[5] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 16
		headModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 17
		headModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		headModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 20
		headModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 21
		headModel[11] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 22
		headModel[12] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 23
		headModel[13] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 24
		headModel[14] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 25
		headModel[15] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 26
		headModel[16] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 27
		headModel[17] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 28
		headModel[18] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 29

		headModel[0].addShapeBox(-4F, -5.3F, -4F, 8, 1, 8, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F); // Box 136
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -6.1F, -4F, 8, 1, 8, 0F,1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F); // Box 11
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.9F, -4F, 8, 1, 8, 0F,1.3F, 0.3F, 1.3F, 1.3F, 0.3F, 1.3F, 1.3F, 0.3F, 1.3F, 1.3F, 0.3F, 1.3F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 13
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8.2F, -4F, 8, 1, 8, 0F,1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.3F, 0F, 1.3F, 1.3F, 0F, 1.3F, 1.3F, 0F, 1.3F, 1.3F, 0F, 1.3F); // Box 14
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -10.2F, -4F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 15
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -11.5F, -4F, 8, 1, 8, 0F,-1.6F, -0.3F, -1.6F, -1.6F, -0.3F, -1.6F, -1.6F, -0.3F, -1.6F, -1.6F, -0.3F, -1.6F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 16
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -9.2F, -4F, 8, 1, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F); // Box 17
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3F, -5F, -4F, 2, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 18
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1F, -5F, -4F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 19
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -1F, -4F, 8, 1, 5, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 20
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-2F, -2.5F, -4F, 2, 1, 1, 0F,0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F); // Box 21
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -2.5F, -4F, 2, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F); // Box 22
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -4.7F, 0F, 8, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 1.2F, 1.8F, 0.5F, 1.2F); // Box 23
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -0.7F, 0F, 8, 1, 4, 0F,1.8F, 0F, 0.2F, 1.8F, 0F, 0.2F, 1.8F, 0F, 1.2F, 1.8F, 0F, 1.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 24
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -3.2F, 0F, 8, 2, 4, 0F,1.8F, 0F, 0.2F, 1.8F, 0F, 0.2F, 1.8F, 0F, 1.2F, 1.8F, 0F, 1.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 1.2F, 1.8F, 0.5F, 1.2F); // Box 25
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -3.2F, -1.2F, 8, 2, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F); // Box 26
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -4.7F, -1.2F, 8, 1, 1, 0F,-1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F); // Box 27
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -0.2F, -1.2F, 8, 1, 1, 0F,0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 28
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, 0F, -4F, 8, 1, 5, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0F, 0.2F, -2.8F, 0F, 0.2F, -2.8F, 0F, 0.2F, -2.8F, 0F, 0.2F); // Box 29
		headModel[18].setRotationPoint(0F, 0F, 0F);
	}
}