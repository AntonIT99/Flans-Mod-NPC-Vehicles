//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KiteShield
// Model Creator: 
// Created on: 28.03.2019 - 18:38:48
// Last changed on: 28.03.2019 - 18:38:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKiteShield extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelKiteShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[9];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 12
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 13
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		gunModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 14
		gunModel[8] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 16

		gunModel[0].addShapeBox(0F, -1F, 0F, 1, 4, 12, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 16
		gunModel[0].setRotationPoint(1F, -2.5F, -6F);

		gunModel[1].addShapeBox(0F, 1F, 0F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 11
		gunModel[1].setRotationPoint(1.3F, -1F, -2F);

		gunModel[2].addShapeBox(0F, 1F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		gunModel[2].setRotationPoint(2.3F, -1F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		gunModel[3].setRotationPoint(2.3F, -0.99F, -1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F); // Box 14
		gunModel[4].setRotationPoint(2.3F, 1.01F, -1.5F);

		gunModel[5].addShapeBox(0F, -0.7F, 0F, 1, 1, 4, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		gunModel[5].setRotationPoint(1.3F, -1F, -2F);

		gunModel[6].addShapeBox(0F, 2.7F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 13
		gunModel[6].setRotationPoint(1.3F, -1F, -2F);

		gunModel[7].addShapeBox(0F, -5F, 0F, 1, 4, 12, 0F,0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 14
		gunModel[7].setRotationPoint(1F, -2.5F, -6F);

		gunModel[8].addShapeBox(0F, -5F, 0F, 1, 19, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 16
		gunModel[8].setRotationPoint(1F, 5.5F, -6F);
	}
}