//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HeaterShield
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

public class ModelHeaterShield extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelHeaterShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[8];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 14
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 16
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 9
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		gunModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 11
		gunModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 12
		gunModel[7] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 13

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[0].setRotationPoint(1F, -1.5F, -6F);

		gunModel[1].addShapeBox(0F, -5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[1].setRotationPoint(1F, 0.49F, -6F);

		gunModel[2].addShapeBox(0F, -4F, 0F, 1, 5, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[2].setRotationPoint(1F, 6.49F, -6F);

		gunModel[3].addShapeBox(0F, -4F, 0F, 1, 3, 6, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[3].setRotationPoint(1F, 11.5F, -6F);

		gunModel[4].addShapeBox(0F, -4F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 10
		gunModel[4].setRotationPoint(0.99F, 11.49F, 0F);

		gunModel[5].addShapeBox(0F, -4F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 11
		gunModel[5].setRotationPoint(0.99F, 6.5F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 12
		gunModel[6].setRotationPoint(0.99F, -1.51F, 0F);

		gunModel[7].addShapeBox(0F, -5F, 0F, 1, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		gunModel[7].setRotationPoint(0.99F, 0.5F, 0F);
	}
}