//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bascinet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSallet extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelSallet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 21
		headModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 22
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		headModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 21
		headModel[7] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 22
		headModel[8] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 23
		headModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		headModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 25
		headModel[11] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 26
		headModel[12] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 27
		headModel[13] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 28
		headModel[14] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 29
		headModel[15] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 30
		headModel[16] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 31

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -4F, -3F, 1, 4, 7, 0F,0.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -2F, -1.2F, -0.5F, -2F, -1.2F, 0F, 0F, 0.5F, 0F, 0F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(4.7F, -4F, -3F, 1, 4, 7, 0F,0.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -2F, -1.2F, -0.5F, -2F, -1.2F, 0F, 0F, 0.5F, 0F, 0F); // Box 21
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F); // Box 22
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7F, -5F, 8, 3, 9, 0F,0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F); // Box 19
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4.2F, -6F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 20
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4F, 3F, 8, 2, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, -1F, -0.5F, 0.5F, -1F, -0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F); // Box 21
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -2F, 5.5F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1F, -1F, -2.5F, -1F, -1F, 0F, 1F, -1F, 0F, 1F, -1F, -2F, 1F, 0F, -2F, 1F, 0F); // Box 22
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4.7F, -2F, 4F, 1, 2, 1, 0F,0.5F, 1F, 0F, -1.2F, 1F, 0F, -1.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 1.5F, 0.5F, 0F, 1.5F); // Box 23
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -2F, 4F, 1, 2, 1, 0F,0.5F, 1F, 0F, -1.2F, 1F, 0F, -1.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 1.5F, 0.5F, 0F, 1.5F); // Box 24
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4.2F, -4F, -3.5F, 1, 1, 2, 0F,-0.2F, 0.2F, 0F, -0.5F, 0.2F, -0.2F, -0.5F, 0.7F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 25
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4.2F, -3F, -5F, 1, 3, 5, 0F,-0.2F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.3F, 0.5F, -0.2F, -0.3F, 0.5F); // Box 26
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.8F, -3F, -6F, 10, 1, 1, 0F,-1.6F, 0.2F, 0.5F, -2F, 0.2F, 0.5F, -0.5F, 0.2F, 0F, -0.1F, 0.2F, 0F, -1.6F, -0.2F, 0F, -2F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 27
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.9F, -3F, -5F, 1, 3, 5, 0F,-0.2F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0.5F, 0.3F, -0.3F, 0.5F); // Box 28
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4.9F, -6F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, 0F, 3F, -0.5F, 0F, 3F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 29
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.9F, -4F, -3.5F, 1, 1, 2, 0F,-0.2F, 0.2F, -0.2F, -0.5F, 0.2F, 0F, -0.5F, 0.7F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 30
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.8F, -2F, -6F, 10, 2, 1, 0F,-1.6F, 0.2F, 0F, -2F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -1.6F, 0F, 0.2F, -2F, 0F, 0.2F, -0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 31
		headModel[16].setRotationPoint(0F, 0F, 0F);
	}
}