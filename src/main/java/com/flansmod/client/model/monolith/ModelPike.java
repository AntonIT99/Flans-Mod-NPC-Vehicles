//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.03.2019 - 22:05:19
// Last changed on: 08.03.2019 - 22:05:19

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPike extends ModelGun //Same as Filename
{
	int textureX = 256;
	int textureY = 32;

	public ModelPike() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[4];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 3, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4

		gunModel[0].addBox(-25F, 0F, -3F, 106, 1, 1, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 0F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(81F, 0F, 0F);

		gunModel[2].addShapeBox(0F, 0F, -3F, 5, 1, 1, 0F,0F, 1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1F, 0F); // Box 3
		gunModel[2].setRotationPoint(83F, 0F, 0F);

		gunModel[3].addShapeBox(-1F, 0F, -3F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Box 4
		gunModel[3].setRotationPoint(89F, 0F, 0F);
	}
}