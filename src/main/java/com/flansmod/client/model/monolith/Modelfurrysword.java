//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.12.2019 - 21:47:34
// Last changed on: 15.12.2019 - 21:47:34

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelfurrysword extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelfurrysword() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 7
		gunModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 9
		gunModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		gunModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		gunModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12

		gunModel[0].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-1F, -13F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 1
		gunModel[1].setRotationPoint(-0.5F, -3F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 2
		gunModel[2].setRotationPoint(-1F, -4F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F); // Box 4
		gunModel[3].setRotationPoint(1F, -13F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F); // Box 6
		gunModel[4].setRotationPoint(1F, -11F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F); // Box 7
		gunModel[5].setRotationPoint(1F, -9F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F); // Box 8
		gunModel[6].setRotationPoint(1F, -7F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F); // Box 9
		gunModel[7].setRotationPoint(-2F, -7F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F); // Box 10
		gunModel[8].setRotationPoint(-2F, -9F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F); // Box 11
		gunModel[9].setRotationPoint(-2F, -11F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F, 0F, 0.625F, -0.5F); // Box 12
		gunModel[10].setRotationPoint(-2F, -13F, -0.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}