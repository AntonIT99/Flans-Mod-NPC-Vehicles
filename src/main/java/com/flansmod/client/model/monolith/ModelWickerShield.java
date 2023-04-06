//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: persianShield
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

public class ModelWickerShield extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 64;

	public ModelWickerShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[3];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 17
		gunModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 18

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 22, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[0].setRotationPoint(0.5F, -5F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 22, 3, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[1].setRotationPoint(0.5F, -5F, -4F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[2].setRotationPoint(0.5F, -5F, 5F);
	}
}