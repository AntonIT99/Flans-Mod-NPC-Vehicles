//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Morion
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMorion extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelMorion() //Same as Filename
	{
		headModel = new ModelRendererTurbo[14];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[3] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 23
		headModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 24
		headModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		headModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 27
		headModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 28
		headModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 29
		headModel[11] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 30
		headModel[12] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 31
		headModel[13] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 32

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -11.8F, -4F, 1, 1, 8, 0F,-0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -10F, -4F, 1, 4, 8, 0F,-0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, -0.5F, 0.7F, -0.2F, -0.5F, 0.7F, -0.2F, -0.5F, 0.7F, -0.2F, -0.5F, 0.7F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0F, -6.5F, -4F, 4, 2, 8, 0F,0F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, -1.2F, 0.9F, 0.9F, 0.3F, 0.9F, 0.9F, 0.4F, 0.9F, 0F, -1F, 0.9F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1F, -6.5F, -8F, 1, 3, 3, 0F,-0.6F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, -1F, 0.2F, -0.6F, -1F, 0.2F, 1F, -2F, 0.2F, -1F, -2F, 0.2F, -6F, 0.2F, 0.2F, 5F, -0.5F, 0.2F); // Box 23
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(0F, -6.5F, -8F, 1, 3, 3, 0F,0.3F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, -1F, 0.2F, 0F, -1F, 0.2F, -1F, -2F, 0.2F, 1F, -2F, 0.2F, 5F, -0.5F, 0.2F, -6F, 0.2F, 0.2F); // Box 24
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0F, -6.5F, 5F, 1, 3, 2, 0F,0F, -1F, 0.2F, -0.6F, -1F, 0.2F, -0.6F, -1F, 0.2F, 0.3F, -1F, 0.2F, -6F, 0.2F, 0.2F, 5F, -0.5F, 0.2F, 1F, -1.5F, 0.2F, -1F, -1.5F, 0.2F); // Box 26
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1F, -6.5F, 5F, 1, 3, 2, 0F,-0.6F, -1F, 0.2F, 0F, -1F, 0.2F, 0.3F, -1F, 0.2F, -0.6F, -1F, 0.2F, 5F, -0.5F, 0.2F, -6F, 0.2F, 0.2F, -1F, -1.5F, 0.2F, 1F, -1.5F, 0.2F); // Box 27
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -6.5F, -4F, 4, 2, 8, 0F,0.9F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0.4F, 0.9F, 0F, -1F, 0.9F, 0F, -1.2F, 0.9F, 0.9F, 0.3F, 0.9F); // Box 28
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(5F, -4F, -5F, 1, 1, 5, 0F,0.2F, 0.3F, -0.2F, 0F, 0F, -0.2F, 1F, -0.2F, 0F, 0.2F, 0.3F, 0F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 1F, -0.1F, 0F, 0F, -0.8F, 0F); // Box 29
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-6F, -4F, -5F, 1, 1, 5, 0F,0F, 0F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, 0F, 1F, -0.2F, 0F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, 1F, -0.1F, 0F); // Box 30
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-6F, -4F, 0F, 1, 1, 5, 0F,1F, -0.2F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, -0.2F, 0F, 0F, -0.2F, 1F, -0.1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F); // Box 31
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(5F, -4F, 0F, 1, 1, 5, 0F,0.2F, 0.3F, 0F, 1F, -0.2F, 0F, 0F, 0F, -0.2F, 0.2F, 0.3F, -0.2F, 0F, -0.8F, 0F, 1F, -0.1F, 0F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F); // Box 32
		headModel[13].setRotationPoint(0F, 0F, 0F);
	}
}