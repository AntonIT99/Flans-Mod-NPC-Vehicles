//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ChinaBuckler
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

public class ModelChinaBuckler extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelChinaBuckler() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 5
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		gunModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		gunModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		gunModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 9
		gunModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 10
		gunModel[7] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 11
		gunModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 14

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[0].setRotationPoint(1F, -4F, -3F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[1].setRotationPoint(1F, -4F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		gunModel[2].setRotationPoint(1F, -1F, -3F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[3].setRotationPoint(1F, 1F, -3F);

		gunModel[4].addShapeBox(0F, 0.5F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, 0F, 0F); // Box 8
		gunModel[4].setRotationPoint(1F, -1F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 9
		gunModel[5].setRotationPoint(1F, -11F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 10
		gunModel[6].setRotationPoint(1F, 5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0.5F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 11
		gunModel[7].setRotationPoint(3F, -14F, -0.5F);

		gunModel[8].addShapeBox(0F, 0.5F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 12
		gunModel[8].setRotationPoint(3F, 14F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -2F, 0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -2F, 0.2F, -0.2F); // Box 13
		gunModel[9].setRotationPoint(1F, 13F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-2F, 0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, -2F, 0.2F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		gunModel[10].setRotationPoint(1F, -13F, -0.5F);
	}
}