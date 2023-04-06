//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FrogMouth
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFrogMouth extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelFrogMouth() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[16];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 60
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 61
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 67
		bodyModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 68
		bodyModel[7] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 69
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 70
		bodyModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 71
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 72
		bodyModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 73
		bodyModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 74
		bodyModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 75
		bodyModel[14] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 77
		bodyModel[15] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 78

		bodyModel[0].addShapeBox(-5F, -9.5F, -5.5F, 5, 4, 7, 0F,-1F, -1.5F, -1.5F, 0F, -1.2F, 0F, 0F, 0.2F, -1F, -0.2F, -0.8F, 0F, 0.8F, 1.4F, 0F, 0F, 2.4F, 1.8F, 0F, 0.2F, 0F, 2.2F, 1.1F, 0F); // Box 2
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-5F, -1.8F, -5.5F, 5, 4, 7, 0F,0.5F, 0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0.2F, 0.9F, 1.9F, 1.5F, 0F, -1F, -0.5F, -2F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-5F, -4.6F, 1.5F, 5, 6, 4, 0F,2.5F, 0.2F, 0F, 0F, -1.8F, 0F, 0F, -1.5F, 1.5F, 0.8F, 0.2F, -0.5F, 0F, 0.3F, 0F, 0F, 1.3F, 0F, 0F, -1.2F, -0.5F, -0.8F, -1F, -1.5F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-6F, -2.8F, -5.5F, 6, 1, 7, 0F,0F, 0.8F, 0.7F, 0F, -0.5F, 2.2F, 0F, 0.2F, 0.9F, 1.5F, 2F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0.5F, 0F, -1.5F, 0F, 0.9F, -1.5F, 0F); // Box 60
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-5F, -9.5F, 1.5F, 5, 5, 4, 0F,-0.2F, -0.8F, 0F, 0F, 0.2F, 1F, 0F, -1F, -0.5F, -0.8F, -1.5F, -1.5F, 2.2F, 0.1F, 0F, 0F, -1.8F, 0F, 0F, 1.5F, 1F, 0F, 0.2F, -0.5F); // Box 61
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0.4F, 2.5F, 4, 4, 1, 0F,1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 1.4F, 0F, -0.2F, 0.5F, 2F, 0.5F, 0F, 3F, 0.5F, 0F, 1F, 0.5F, 0.5F, 1F, -0.5F); // Box 67
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 0.4F, -3.5F, 4, 3, 1, 0F,1.4F, 0F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0.5F, 1F, -0.2F, 0F, 2F, 0.8F, 0F, 2.5F, 0.5F, 0.5F, 1.5F, 0.5F); // Box 68
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-5F, -0.6F, -3.5F, 4, 1, 6, 0F,0F, -0.5F, -0.5F, 1F, 0F, 0.5F, 1F, 1F, 0.5F, 0F, 0F, 0F, 0.4F, 0F, -0.2F, 1F, 0F, 0.5F, 1F, -1F, 1.5F, 0.5F, 0F, 0.7F); // Box 69
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, -9.5F, -5.5F, 5, 4, 7, 0F,0F, -1.2F, 0F, -1F, -1.5F, -1.5F, -0.2F, -0.8F, 0F, 0F, 0.2F, -1F, 0F, 2.4F, 1.8F, 0.8F, 1.4F, 0F, 2.2F, 1.1F, 0F, 0F, 0.2F, 0F); // Box 70
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, -1.8F, -5.5F, 5, 4, 7, 0F,0F, -0.5F, 0.5F, 0.5F, 0.5F, 0F, 1.9F, 1.5F, 0F, 0F, 0.2F, 0.9F, 0F, 0F, -1.5F, -1F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 71
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, -4.6F, 1.5F, 5, 6, 4, 0F,0F, -1.8F, 0F, 2.5F, 0.2F, 0F, 0.8F, 0.2F, -0.5F, 0F, -1.5F, 1.5F, 0F, 1.3F, 0F, 0F, 0.3F, 0F, -0.8F, -1F, -1.5F, 0F, -1.2F, -0.5F); // Box 72
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, -2.8F, -5.5F, 6, 1, 7, 0F,0F, -0.5F, 2.2F, 0F, 0.8F, 0.7F, 1.5F, 2F, 0F, 0F, 0.2F, 0.9F, 0F, 0.5F, 0.5F, -0.5F, -0.5F, 0F, 0.9F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 73
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, -9.5F, 1.5F, 5, 5, 4, 0F,0F, 0.2F, 1F, -0.2F, -0.8F, 0F, -0.8F, -1.5F, -1.5F, 0F, -1F, -0.5F, 0F, -1.8F, 0F, 2.2F, 0.1F, 0F, 0F, 0.2F, -0.5F, 0F, 1.5F, 1F); // Box 74
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 0.4F, 2.5F, 4, 4, 1, 0F,0F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.4F, 0F, -0.2F, 0F, 1F, 0.5F, 0F, 3F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 1F, -0.5F, 0F, 1F, 0.5F); // Box 75
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1F, -0.6F, -3.5F, 4, 1, 6, 0F,1F, 0F, 0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 1F, 1F, 0.5F, 1F, 0F, 0.5F, 0.4F, 0F, -0.2F, 0.5F, 0F, 0.7F, 1F, -1F, 1.5F); // Box 77
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 0.4F, -3.5F, 4, 3, 1, 0F,0F, 0F, 0.5F, 1.4F, 0F, -0.2F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0.8F, 0.5F, 1F, -0.2F, 0.5F, 1.5F, 0.5F, 0F, 2.5F, 0.5F); // Box 78
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
	}
}