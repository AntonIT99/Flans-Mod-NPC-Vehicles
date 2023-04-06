//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GermanKettle
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGermanKettle extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelGermanKettle() //Same as Filename
	{
		headModel = new ModelRendererTurbo[22];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 136
		headModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 203
		headModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 205
		headModel[6] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 206
		headModel[7] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 219
		headModel[8] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 91
		headModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 97
		headModel[10] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 98
		headModel[11] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 99
		headModel[12] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 100
		headModel[13] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 31
		headModel[14] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 32
		headModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 34
		headModel[16] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 35
		headModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 36
		headModel[18] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 37
		headModel[19] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 38
		headModel[20] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 39
		headModel[21] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 40

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.8F, 0.3F, 0.2F, 0.8F, 0.3F, 0.2F, 0.4F, 0.3F, 0.2F, 0.4F, 0.3F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.3F, -4F, 8, 2, 8, 0F,-2F, 0.2F, -2F, -2F, 0.2F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, -0.1F, 0.3F, 0.2F, -0.1F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -11.3F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0.1F, 1.5F, -0.2F, 1.5F, 1.5F, -0.2F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F); // Box 49
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 1F, -0.7F, 1F, 1F, -0.7F, 1F, 1F, -0.3F, 1F, 1F, -0.3F, 1F); // Box 136
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -4F, 4.8F, 10, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.3F, -3F, 0F, -0.3F, -3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 203
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-8.9F, -4.4F, -4.8F, 4, 3, 10, 0F,0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, -0.3F, 0F, -2.9F, -0.3F, 0F, -0.3F, 0F, -3F, -0.3F, 0F, -3F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 205
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-9.01F, -4.4F, -8.8F, 4, 3, 4, 0F,-1F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 206
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-9.01F, -4F, 4.91F, 4, 3, 4, 0F,0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, -1F, -2.5F, -1F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, -1F, -0.3F, -1F); // Box 219
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -5F, -3.4F, 8, 5, 1, 0F,1.2F, -0.7F, -4.2F, 1.2F, -0.7F, -4.2F, 1.2F, -0.7F, 3.8F, 1.2F, -0.7F, 3.8F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F); // Box 91
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -4.4F, -8.8F, 2, 3, 4, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -3F, 0F, -0.3F, -3F); // Box 97
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4.9F, -4.4F, -4.8F, 4, 3, 10, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, -2.9F, -0.3F, 0F, 0.1F, -0.3F, -3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, -3F, 0.1F, -0.3F); // Box 98
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4.9F, -4F, 4.91F, 4, 3, 4, 0F,0F, 0.5F, 0F, 0F, -2.5F, 0F, -1F, -2.5F, -1F, 0F, -2.5F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 99
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4.9F, -4.4F, -8.8F, 4, 3, 4, 0F,0F, -2.5F, 0F, -1F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, -1F, -0.3F, -1F); // Box 100
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -4.4F, -8.8F, 2, 3, 4, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -3F, 0F, -0.3F, -3F); // Box 31
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3F, -3.7F, -8.8F, 2, 2, 3, 0F,0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.2F, -0.87F, 0F, -0.2F, -0.87F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 32
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-3F, -4.9F, -5.8F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, 0.065F, 0F, -0.2F, 0.065F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 34
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(1F, -3.7F, -8.8F, 2, 2, 3, 0F,0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, -0.2F, -0.87F, 0F, -0.2F, -0.87F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 35
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(1F, -4.9F, -5.8F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.2F, 0.065F, 0F, -0.2F, 0.065F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // Box 36
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(3F, -4.4F, -8.8F, 2, 3, 4, 0F,0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -3F, 0F, -0.3F, -3F); // Box 37
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-0.5F, -10.3F, -4F, 1, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F); // Box 38
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-0.5F, -11.3F, -4F, 1, 1, 8, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-0.5F, -12.3F, -2.5F, 1, 1, 5, 0F,0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		headModel[21].setRotationPoint(0F, 0F, 0F);
	}
}