//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Scutum
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

public class ModelScutum extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelScutum() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 18
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		gunModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 5
		gunModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 7
		gunModel[5] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 8
		gunModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 13
		gunModel[11] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 14

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 26, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[0].setRotationPoint(1F, -6F, -2F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 24, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 18
		gunModel[1].setRotationPoint(1F, -5F, 6F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 4
		gunModel[2].setRotationPoint(1F, -6F, 6F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, 0.5F, 0F, -1F); // Box 5
		gunModel[3].setRotationPoint(1F, 19F, 6F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 24, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[4].setRotationPoint(1F, -5F, -6F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		gunModel[5].setRotationPoint(1F, -6F, -6F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		gunModel[6].setRotationPoint(1F, 19F, -6F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[7].setRotationPoint(1.3F, 3.5F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 11
		gunModel[8].setRotationPoint(1.3F, 6.5F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		gunModel[9].setRotationPoint(2.3F, 6F, 0.5F);

		gunModel[10].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		gunModel[10].setRotationPoint(2.3F, 6.01F, 0.5F);

		gunModel[11].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F); // Box 14
		gunModel[11].setRotationPoint(2.3F, 8.01F, 0.5F);
	}
}