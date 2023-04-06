//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChinaShield
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

public class ModelChinaShield extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelChinaShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[5];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 16
		gunModel[0].setRotationPoint(0.5F, 0F, -5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 3
		gunModel[1].setRotationPoint(0.5F, -5F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 4
		gunModel[2].setRotationPoint(0.5F, 5F, -6F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[3].setRotationPoint(0.5F, -5F, -5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[4].setRotationPoint(0.5F, -5.5F, -1F);
	}
}