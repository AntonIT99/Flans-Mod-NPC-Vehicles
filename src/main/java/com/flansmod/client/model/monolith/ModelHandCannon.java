//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HandCannon
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

public class ModelHandCannon extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelHandCannon() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[4];
		ammoModel = new ModelRendererTurbo[2];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		gunModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 25
		gunModel[2] = new ModelRendererTurbo(this, 4, 17, textureX, textureY); // Box 14
		gunModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 15

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 24
		gunModel[0].setRotationPoint(1F, -2.5F, 1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, 0.2F); // Box 25
		gunModel[1].setRotationPoint(13F, -2.5F, 1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,2F, -0.3F, -0.3F, 2F, -0.3F, -0.3F, 2F, -0.3F, -0.3F, 2F, -0.3F, -0.3F, 2F, -0.3F, -0.3F, 2F, -0.3F, -0.3F, 2F, -0.3F, -0.3F, 2F, -0.3F, -0.3F); // Box 14
		gunModel[2].setRotationPoint(-14F, -2.5F, 1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -0.3F); // Box 15
		gunModel[3].setRotationPoint(0F, -2.5F, 1.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 33
		ammoModel[1] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 34

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 33
		ammoModel[0].setRotationPoint(0.5F, -3F, 0F);
		ammoModel[0].rotateAngleY = -1.57079633F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 34
		ammoModel[1].setRotationPoint(12.5F, -2.5F, 1.5F);
		animationType = EnumAnimationType.END_LOADED;
	}
}