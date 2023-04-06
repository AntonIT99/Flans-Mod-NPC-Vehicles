//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Pollaxe
// Model Creator: 
// Created on: 22.05.2019 - 13:23:56
// Last changed on: 22.05.2019 - 13:23:56

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDaneAxe extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelDaneAxe() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[7];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		gunModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 9
		gunModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 12

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -17F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.0999999999999996F, 0F, 0.0999999999999999F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.0999999999999996F, 0F, 0.1F, -0.0999999999999999F, 0F, 0.100000000000001F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, -0.0999999999999999F, 0F, 0.0999999999999996F); // Box 2
		gunModel[1].setRotationPoint(0F, -16.5F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, -0.1F, -0.0999999999999996F, 0F, -0.3F, -0.0999999999999996F, 0F, -0.3F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, -0.0999999999999999F, 0.4F, -0.299999999999999F, -0.0999999999999999F, 0.4F, -0.300000000000001F, 0.3F, 0F, -0.1F); // Box 6
		gunModel[2].setRotationPoint(1.2F, -16.5F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.4F, -0.3F, -0.0999999999999996F, 0.7F, -0.3F, -0.0999999999999996F, 0.7F, -0.3F, 0.1F, 0.4F, -0.3F, 0.1F, 0F, -0.3F, -0.0999999999999999F, 1.2F, -0.299999999999999F, -0.0999999999999999F, 1.2F, -0.300000000000001F, 0.1F, 0F, -0.3F); // Box 7
		gunModel[3].setRotationPoint(2.2F, -16F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0.7F, -0.3F, 0.9F, 1.5F, -0.3F, 0.9F, 1.5F, -0.3F, 0.1F, 0.7F, -0.3F, 0.1F, 1.2F, -0.3F, -0.299F, 2.1F, -0.299999999999999F, -0.299F, 2.1F, -0.300000000000001F, 0.1F, 1.2F, -0.3F); // Box 8
		gunModel[4].setRotationPoint(3.2F, -16F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.9F, 0.5F, -0.3F, 1.5F, 1.5F, -0.5F, 1.5F, 1.5F, -0.5F, -0.9F, 0.5F, -0.3F, -0.35F, 0F, -0.3F, 0.8F, 1F, -0.5F, 0.8F, 1F, -0.500000000000001F, -0.35F, 0F, -0.3F); // Box 9
		gunModel[5].setRotationPoint(4.2F, -17F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, 0F, -0.3F, 0.8F, -1F, -0.5F, 0.8F, -1F, -0.5F, -0.35F, 0F, -0.3F, 0.3F, 2.1F, -0.3F, -0.6F, 2.8F, -0.5F, -0.6F, 2.8F, -0.500000000000001F, 0.3F, 2.1F, -0.3F); // Box 12
		gunModel[6].setRotationPoint(4.2F, -16F, 0F);
	}
}