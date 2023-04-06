//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Standard
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

public class ModelStandard extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelStandard() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[6];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 16
		gunModel[2] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 17
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		gunModel[5] = new ModelRendererTurbo(this, 4, 4, textureX, textureY); // Box 20

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F); // Box 15
		gunModel[0].setRotationPoint(0.5F, -18F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 16
		gunModel[1].setRotationPoint(0.5F, -40F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.1F, 1F, -0.1F, -0.1F, 1F, -0.1F, -0.1F, 1F, -0.1F, -0.1F, 1F, -0.1F); // Box 17
		gunModel[2].setRotationPoint(0.5F, -43F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[3].setRotationPoint(0.5F, -39F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 6F, 0.1F, 0.1F, 6F, 0.1F, 0.1F, 6F, 0.1F, 0.1F, 6F, 0.1F, 0.1F, 9F, 0.1F, 0.1F, 9F, 0.1F, 0.1F, 9F, 0.1F, 0.1F, 9F, 0.1F); // Box 19
		gunModel[4].setRotationPoint(0.5F, -31.5F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 60, 58, 1, 0F,-20F, -21F, -0.3F, -20F, -21F, -0.3F, -20F, -21F, -0.3F, -20F, -21F, -0.3F, -20F, -21F, -0.3F, -20F, -21F, -0.3F, -20F, -21F, -0.3F, -20F, -21F, -0.3F); // Box 20
		gunModel[5].setRotationPoint(-39.5F, -58.5F, 0F);
	}
}