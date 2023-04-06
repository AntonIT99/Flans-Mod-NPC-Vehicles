//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.12.2019 - 12:09:50
// Last changed on: 20.12.2019 - 12:09:50

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelkhopesh extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelkhopesh() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[7];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-1F, -3F, -0.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 1
		gunModel[1].setRotationPoint(-1F, 2F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 2
		gunModel[2].setRotationPoint(-1F, -8F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 3
		gunModel[3].setRotationPoint(-1F, -9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 4
		gunModel[4].setRotationPoint(0F, -12F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 5
		gunModel[5].setRotationPoint(2F, -15F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 6
		gunModel[6].setRotationPoint(0.5F, -17F, -0.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}