//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKontos extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelKontos() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[6];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box2
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box3
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box4
		gunModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 1

		gunModel[0].addShapeBox(15F, 0F, 1F, 10, 1, 1, 0F,40F, -0.1F, -0.1F, 40F, -0.1F, -0.1F, 40F, -0.1F, -0.1F, 40F, -0.1F, -0.1F, 40F, -0.1F, -0.1F, 40F, -0.1F, -0.1F, 40F, -0.1F, -0.1F, 40F, -0.1F, -0.1F); // Import Box0
		gunModel[0].setRotationPoint(-10F, 0F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Import Box2
		gunModel[1].setRotationPoint(60F, 0F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 1F, 7, 1, 1, 0F,0F, 1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1F, 0F); // Import Box3
		gunModel[2].setRotationPoint(63F, 0F, 0F);

		gunModel[3].addShapeBox(-1F, 0F, 1F, 2, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F); // Import Box4
		gunModel[3].setRotationPoint(71F, 0F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 1F, 7, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 0
		gunModel[4].setRotationPoint(53F, 0F, 0F);

		gunModel[5].addShapeBox(15F, 0F, 1F, 10, 1, 1, 0F,5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F); // Box 1
		gunModel[5].setRotationPoint(-17F, 0F, 0F);
	}
}