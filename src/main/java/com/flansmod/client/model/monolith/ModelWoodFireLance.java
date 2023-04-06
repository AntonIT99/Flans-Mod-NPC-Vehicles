//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FireLance
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

public class ModelWoodFireLance extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelWoodFireLance() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[2];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		gunModel[1] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Box 40

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,28F, 0F, 0F, 9F, 0.3F, 0.3F, 9F, 0.3F, 0.3F, 28F, 0F, 0F, 28F, 0F, 0F, 9F, 0.3F, 0.3F, 9F, 0.3F, 0.3F, 28F, 0F, 0F); // Box 46
		gunModel[0].setRotationPoint(-7F, -2.8F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 11, 5, 5, 0F,0.5F, 0.2F, -1.8F, 0.5F, 0.4F, -1.6F, 0.5F, 0.4F, 0.4F, 0.5F, 0.2F, 0.2F, 0.5F, -1.8F, -1.8F, 0.5F, -1.6F, -1.8F, 0.5F, -1.6F, 0.4F, 0.5F, -1.8F, 0.2F); // Box 40
		gunModel[1].setRotationPoint(14F, -3.8F, -3F);
	}
}