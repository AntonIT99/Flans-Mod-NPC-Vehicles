//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: guandao
// Model Creator: 
// Created on: 22.05.2019 - 13:48:54
// Last changed on: 22.05.2019 - 13:48:54

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGuandao extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 64;

	public ModelGuandao() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[7];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 6

		gunModel[0].addBox(0F, 0F, 0F, 1, 36, 1, 0F); // Box 0
		gunModel[0].setRotationPoint(-1.5F, -25F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0499999999999999F, 0F, 0F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0.0499999999999999F, 0F, 0F, 0.0499999999999999F, -0.5F, 2.77555756156289E-17F, -0.4F, -0.5F, -0.25F, -0.4F, -0.5F, -0.25F, 0.0499999999999999F, -0.5F, 2.77555756156289E-17F); // Box 1
		gunModel[1].setRotationPoint(-0.5F, -25F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.25F, 0.0499999999999999F, 0F, 0F, 0.0499999999999999F, 0F, 0F, -0.4F, 0F, -0.25F, -0.4F, -0.5F, -0.25F, 0.0499999999999999F, -0.5F, 2.77555756156289E-17F, 0.0499999999999999F, -0.5F, 2.77555756156289E-17F, -0.4F, -0.5F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(-2.5F, -25F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.05F, 0F, -0.25F, 0.45F, 0F, -0.35F, 0.45F, 0F, -0.35F, -0.05F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.25F); // Box 3
		gunModel[3].setRotationPoint(-1.5F, -29F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, 0F, -0.25F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.25F, 0F, -0.25F, -0.05F, 0F, -0.25F, 0.45F, 0F, -0.35F, 0.45F, 0F, -0.35F, -0.05F, 0F, -0.25F); // Box 4
		gunModel[4].setRotationPoint(-1.5F, -35F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, 0.5F, -0.35F, -0.75F, -0.25F, -0.45F, -0.75F, -0.25F, -0.45F, 1F, 0.5F, -0.35F, 0.25F, 0F, -0.25F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.25F, 0F, -0.25F); // Box 5
		gunModel[5].setRotationPoint(-1.5F, -38F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0F, -0.35F, -0.85F, 0F, -0.35F, -0.85F, 0F, -0.35F, -0.1F, 0F, -0.35F, -1.1F, 0F, -0.35F, 0.9F, 0F, -0.35F, 0.9F, 0F, -0.35F, -1.1F, 0F, -0.35F); // Box 6
		gunModel[6].setRotationPoint(-2.5F, -33F, 0F);
	}
}