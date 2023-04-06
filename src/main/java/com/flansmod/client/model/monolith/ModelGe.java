//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DaggerAxe
// Model Creator: 
// Created on: 22.05.2019 - 13:36:33
// Last changed on: 22.05.2019 - 13:36:33

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGe extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 64;

	public ModelGe() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[5];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 4

		gunModel[0].addBox(0F, 0F, 0F, 1, 36, 1, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -20F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(-1F, -19F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(1F, -19F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, 0F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(2F, -19F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.25F, -0.25F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.35F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, -0.25F, -0.35F); // Box 4
		gunModel[4].setRotationPoint(5F, -19F, 0F);
	}
}