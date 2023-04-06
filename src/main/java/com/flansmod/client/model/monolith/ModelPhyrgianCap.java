//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PhyrgianCap
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPhyrgianCap extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPhyrgianCap() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 259
		headModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 36
		headModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 37
		headModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 38
		headModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 39
		headModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 40
		headModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41
		headModel[11] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 42
		headModel[12] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 17
		headModel[13] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 18
		headModel[14] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 14
		headModel[15] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 15
		headModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 16

		headModel[0].addShapeBox(-4F, -9F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.7F, 0.2F, 0.3F, -0.7F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -11.8F, -4F, 8, 2, 7, 0F,-2.5F, -1F, -1F, -2.5F, -1F, -1F, -2.5F, 0F, -3F, -2.5F, 0F, -3F, 0.2F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -4.9F, -4F, 8, 1, 8, 0F,1F, 0.1F, 1F, 1F, 0.1F, 1F, 1F, -0.3F, 1F, 1F, -0.3F, 1F, 0.5F, -0.4F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 259
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -6.5F, -4F, 8, 2, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, -0.1F, 1F, 1F, -0.1F, 1F); // Box 28
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.7F, -5F, -4F, 1, 1, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0.2F, 0F, 2F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.2F, 0F, 1.5F); // Box 31
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.7F, -4F, -4F, 1, 3, 2, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0.2F, 0F, 1.5F, 0.7F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, 0F, -0.5F, 1F, 0.7F, -0.5F, 1F); // Box 36
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.7F, -1.5F, -4F, 1, 2, 2, 0F,0.7F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0F, 0F, 1F, 0.7F, 0F, 1F, 1.3F, -0.5F, 0.8F, -0.8F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F); // Box 37
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.7F, -0.5F, -4F, 1, 2, 2, 0F,1.3F, -0.5F, 0.8F, -0.8F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 1F, -0.3F, 0.5F, -1.5F, -0.3F, 0.5F, -1F, -0.3F, 0F, 0.7F, -0.3F, 0F); // Box 38
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3.7F, -0.5F, -4F, 1, 2, 2, 0F,-0.8F, -0.5F, 0.8F, 1.3F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F, -1.5F, -0.3F, 0.5F, 1F, -0.3F, 0.5F, 0.7F, -0.3F, 0F, -1F, -0.3F, 0F); // Box 39
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3.7F, -1.5F, -4F, 1, 2, 2, 0F,-0.3F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, 1F, 0F, 0F, 1F, -0.8F, -0.5F, 0.8F, 1.3F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F); // Box 40
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3.7F, -4F, -4F, 1, 3, 2, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 1.5F, 0F, 0F, 1.5F, -0.3F, -0.5F, 0.5F, 0.7F, -0.5F, 0.5F, 0.7F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 41
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3.7F, -5F, -4F, 1, 1, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 42
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1.5F, -13.8F, -3F, 3, 2, 3, 0F,-0.5F, -2.5F, 0.5F, -0.5F, -2.5F, 0.5F, -0.5F, -0.5F, -3F, -0.5F, -0.5F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -13.3F, -6F, 2, 1, 3, 0F,-0.5F, -0.5F, -0.8F, -0.5F, -0.5F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.9F, 0F, 0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1F, -12.3F, -6F, 2, 1, 3, 0F,0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, -1.9F, -0.3F, 0.5F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -4.5F, 3.9F, 8, 3, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -1.5F, 3.9F, 8, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.4F, 0F, -2.2F, -0.4F, 0F, -2.2F, -0.4F, -0.2F, 2F, -0.4F, -0.2F, 2F); // Box 16
		headModel[16].setRotationPoint(0F, 0F, 0F);
	}
}