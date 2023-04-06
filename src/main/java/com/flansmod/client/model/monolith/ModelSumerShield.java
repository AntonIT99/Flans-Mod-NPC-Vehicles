//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SumerShield
// Model Creator: 
// Created on: 09.05.2020 - 08:47:14
// Last changed on: 09.05.2020 - 08:47:14

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSumerShield extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 64;

	public ModelSumerShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[3];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 26, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(1F, -8F, -3.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(0F, -1F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, -1F, 6F);
	}
}