//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pilum
// Model Creator: 
// Created on: 06.07.2017 - 12:48:31
// Last changed on: 06.07.2017 - 12:48:31

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPilum extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelPilum() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[4];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		gunModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 7
		gunModel[3] = new ModelRendererTurbo(this, 26, 8, textureX, textureY); // Box 8

		gunModel[0].addShapeBox(0F, 0F, 0F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[0].setRotationPoint(-28F, -3F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 6
		gunModel[1].setRotationPoint(2F, -3F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 7
		gunModel[2].setRotationPoint(6F, -3F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 8
		gunModel[3].setRotationPoint(17F, -3F, 0F);
	}
}