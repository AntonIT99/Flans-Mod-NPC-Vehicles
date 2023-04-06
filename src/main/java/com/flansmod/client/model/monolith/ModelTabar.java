//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0 AAAAAA 0.7 SCALE USE!
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tabar
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

public class ModelTabar extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelTabar() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 9
		gunModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 10

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(1F, -12F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		gunModel[1].setRotationPoint(1F, -11.5F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.3F, 0F, -0.1F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.3F, 0F, -0.1F); // Box 6
		gunModel[2].setRotationPoint(2.2F, -11.5F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0.4F, -0.3F, -0.0999999999999996F, 2.2F, -0.3F, -0.0999999999999996F, 2.2F, -0.3F, -0.1F, 0.4F, -0.3F, -0.1F, 0.4F, -0.3F, -0.0999999999999999F, 2.2F, -0.299999999999999F, -0.0999999999999999F, 2.2F, -0.300000000000001F, -0.1F, 0.4F, -0.3F); // Box 7
		gunModel[3].setRotationPoint(3.2F, -11F, 0F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.1F, 4F, -0.3F, 0.9F, 2.5F, -0.3F, 0.9F, 2.5F, -0.3F, 0.1F, 4F, -0.3F, 0.1F, 4F, -0.3F, 0.9F, 2.5F, -0.299999999999999F, 0.9F, 2.5F, -0.300000000000001F, 0.1F, 4F, -0.3F); // Box 8
		gunModel[4].setRotationPoint(4.2F, -11.5F, 0F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 2.5F, -0.3F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, -0.9F, 2.5F, -0.3F, -0.9F, 0F, -0.3F, 1.7F, 0F, -0.5F, 1.7F, 0F, -0.500000000000001F, -0.9F, 0F, -0.3F); // Box 9
		gunModel[5].setRotationPoint(5.2F, -11.5F, 0F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 7
		gunModel[6].setRotationPoint(1F, -13F, 0F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[7].setRotationPoint(1F, -18F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.9F, 0F, -0.3F, 1.7F, 0F, -0.5F, 1.7F, 0F, -0.500000000000001F, -0.9F, 0F, -0.3F, -0.9F, 2.5F, -0.3F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, -0.9F, 2.5F, -0.3F); // Box 9
		gunModel[8].setRotationPoint(5.2F, -10.51F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0.2F, 1F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.2F, 1F, -0.1F, 0.2F, 1F, -0.1F, 0.3F, 0F, -0.1F, 0.3F, 0F, -0.1F, 0.2F, 1F, -0.1F); // Box 10
		gunModel[9].setRotationPoint(-1.3F, -11.5F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}