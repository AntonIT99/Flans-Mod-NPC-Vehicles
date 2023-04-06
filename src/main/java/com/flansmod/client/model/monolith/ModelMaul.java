//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Maul
// Model Creator: 
// Created on: 16.05.2019 - 13:10:34
// Last changed on: 16.05.2019 - 13:10:34

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMaul extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelMaul() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[5];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box3
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 5
		gunModel[2] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 6
		gunModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		gunModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 8

		gunModel[0].addShapeBox(0F, 0F, -0.65F, 1, 14, 1, 0F,-0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F); // Import Box3
		gunModel[0].setRotationPoint(0.3F, -7F, 0.5F);

		gunModel[1].addShapeBox(0F, 0F, -0.65F, 1, 3, 1, 0F,-0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F, -0.15F, 0.2F, -0.15F); // Box 5
		gunModel[1].setRotationPoint(0.3F, -15F, 0.5F);

		gunModel[2].addShapeBox(0F, 0F, -0.65F, 6, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 6
		gunModel[2].setRotationPoint(-2.2F, -10F, -1F);

		gunModel[3].addShapeBox(0F, 0F, -0.65F, 6, 1, 4, 0F,0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 7
		gunModel[3].setRotationPoint(-2.2F, -11.75F, -1F);

		gunModel[4].addShapeBox(0F, 0F, -0.65F, 6, 1, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 8
		gunModel[4].setRotationPoint(-2.2F, -8.25F, -1F);
	}
}