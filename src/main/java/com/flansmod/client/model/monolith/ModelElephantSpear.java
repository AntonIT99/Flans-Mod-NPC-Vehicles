//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ElephantSpear
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelElephantSpear extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelElephantSpear() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		gunModel[0] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // Box 70
		gunModel[1] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 71
		gunModel[2] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 72
		gunModel[3] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 75
		gunModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 76
		gunModel[5] = new ModelRendererTurbo(this, 17, 30, textureX, textureY); // Box 77
		gunModel[6] = new ModelRendererTurbo(this, 3, 35, textureX, textureY); // Box 78
		gunModel[7] = new ModelRendererTurbo(this, 3, 30, textureX, textureY); // Box 79
		gunModel[8] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 80
		gunModel[9] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // Box 81
		gunModel[10] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // Box 84
		gunModel[11] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Box 85

		gunModel[0].addShapeBox(56F, -3F, -1F, 30, 1, 1, 0F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(56F, -2F, -1F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F); // Box 71
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(86F, -3F, -1F, 2, 1, 1, 0F, 0F, -.4F, -0.2F, 0F, -.4F, -0.2F, 0F, -.4F, -0.2F, 0F, -.4F, -0.2F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F); // Box 72
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(86F, -2F, -1F, 2, 1, 1, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 75
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(88F, -2.5F, -1F, 2, 1, 1, 0F, 0F, -.1F, -.1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.1F, -.1F); // Box 76
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(90F, -2.5F, -1F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 77
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(90F, -2.5F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, .5F, 0F, 0F, 0F); // Box 78
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(90F, -2.5F, -1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 79
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(26F, -2F, -1F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F); // Box 80
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(26F, -3F, -1F, 30, 1, 1, 0F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(-4F, -3F, -1F, 30, 1, 1, 0F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, -.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(-4F, -2F, -1F, 30, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F); // Box 85
		gunModel[11].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}