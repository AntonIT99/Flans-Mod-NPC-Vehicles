//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.03.2019 - 17:54:05
// Last changed on: 08.03.2019 - 17:54:05

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHoplon extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelHoplon() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 32, 0, textureX, textureY); // Box 2
		gunModel[1] = new ModelRendererTurbo(this, 42, 0, textureX, textureY); // Box 3
		gunModel[2] = new ModelRendererTurbo(this, 44, 11, textureX, textureY); // Box 7
		gunModel[3] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 9
		gunModel[4] = new ModelRendererTurbo(this, 52, 0, textureX, textureY); // Box 10
		gunModel[5] = new ModelRendererTurbo(this, 54, 11, textureX, textureY); // Box 11
		gunModel[6] = new ModelRendererTurbo(this, 34, 11, textureX, textureY); // Box 12
		gunModel[7] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // Box 25
		gunModel[8] = new ModelRendererTurbo(this, 10, 16, textureX, textureY); // Box 26
		gunModel[9] = new ModelRendererTurbo(this, 20, 8, textureX, textureY); // Box 27
		gunModel[10] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Box 28
		gunModel[11] = new ModelRendererTurbo(this, 20, 16, textureX, textureY); // Box 29
		gunModel[12] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Box 30
		gunModel[13] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 31
		gunModel[14] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // Box 32
		gunModel[15] = new ModelRendererTurbo(this, 10, 8, textureX, textureY); // Box 33

		gunModel[0].addShapeBox(1F, -3F, -6F, 1, 4, 4, 0F,0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 0F, 0.91F, 0F, 0F, 0.91F, 0F, 0.91F, 0F, 0F, 0.91F, 0F, 0F, 0.91F, 0.91F, 0F, 0.91F, 0.91F); // Box 2
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(1F, -3F, -1.09F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.18F, 0F, 0F, 0.18F, 0F, 0.91F, 0F, 0F, 0.91F, 0F, 0F, 0.91F, 0.18F, 0F, 0.91F, 0.18F); // Box 3
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(1F, 7F, -1.09F, 1, 4, 4, 0F,0F, 0.91F, 0F, 0F, 0.91F, 0F, 0F, 0.91F, 0.18F, 0F, 0.91F, 0.18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.18F, 0F, 0F, 0.18F); // Box 7
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(1F, 1.91F, -6F, 1, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.18F, 0F, 0F, 0.18F, 0F, 0F, 0.18F, 0F, 0F, 0.18F, 0F); // Box 9
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(1F, -3F, 4F, 1, 4, 4, 0F,0F, 0F, 0.91F, 0F, 0F, 0.91F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 0.91F, 0.91F, 0F, 0.91F, 0.91F, 0F, 0.91F, 0F, 0F, 0.91F, 0F); // Box 10
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(1F, 7F, 4F, 1, 4, 4, 0F,0F, 0.91F, 0.91F, 0F, 0.91F, 0.91F, 0F, 0.91F, 0F, 0F, 0.91F, 0F, 0F, 0F, 0.91F, 0F, 0F, 0.91F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F); // Box 11
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(1F, 7F, -6F, 1, 4, 4, 0F,0F, 0.91F, 0F, 0F, 0.91F, 0F, 0F, 0.91F, 0.91F, 0F, 0.91F, 0.91F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, 0F, 0.91F, 0F, 0F, 0.91F); // Box 12
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(2.05F, -3F, -1.09F, 1, 4, 4, 0F,0.2F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0.18F, 0.2F, -1F, 0.18F, 0.2F, 0.91F, 0F, 0.2F, 0.91F, 0F, 0.2F, 0.91F, 0.18F, 0.2F, 0.91F, 0.18F); // Box 25
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(2.05F, 7F, -1.09F, 1, 4, 4, 0F,0.2F, 0.91F, 0F, 0.2F, 0.91F, 0F, 0.2F, 0.91F, 0.18F, 0.2F, 0.91F, 0.18F, 0.2F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0.18F, 0.2F, -1F, 0.18F); // Box 26
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(2.05F, 1.91F, 3F, 1, 4, 4, 0F,0.2F, 0F, -0.09F, 0.2F, 0F, -0.09F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.18F, -0.09F, 0.2F, 0.18F, -0.09F, -1F, 0.18F, 0F, 0.2F, 0.18F, 0F); // Box 27
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(2.05F, -3F, 4F, 1, 4, 4, 0F,0.2F, -1F, 0.91F, -1F, -1F, 0.91F, -1F, -2.35F, -2.35F, 0.2F, -2.35F, -2.35F, 0.2F, 0.91F, 0.91F, 0.2F, 0.91F, 0.91F, -1F, 0.91F, -1F, 0.2F, 0.91F, -1F); // Box 28
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(2.05F, 7F, 4F, 1, 4, 4, 0F,0.2F, 0.91F, 0.91F, 0.2F, 0.91F, 0.91F, -1F, 0.91F, -1F, 0.2F, 0.91F, -1F, 0.2F, -1F, 0.91F, -1F, -1F, 0.91F, -1F, -2.35F, -2.35F, 0.2F, -2.35F, -2.35F); // Box 29
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(2.05F, 7F, -6F, 1, 4, 4, 0F,0.2F, 0.91F, -1F, -1F, 0.91F, -1F, 0.2F, 0.91F, 0.91F, 0.2F, 0.91F, 0.91F, 0.2F, -2.35F, -2.35F, -1F, -2.35F, -2.35F, -1F, -1F, 0.91F, 0.2F, -1F, 0.91F); // Box 30
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(2.05F, -3F, -6F, 1, 4, 4, 0F,0.2F, -2.35F, -2.35F, -1F, -2.35F, -2.35F, -1F, -1F, 0.91F, 0.2F, -1F, 0.91F, 0.2F, 0.91F, -1F, -1F, 0.91F, -1F, 0.2F, 0.91F, 0.91F, 0.2F, 0.91F, 0.91F); // Box 31
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(2.05F, 1.91F, -5F, 1, 4, 4, 0F,0.2F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, -0.09F, 0.2F, 0F, -0.09F, 0.2F, 0.18F, 0F, -1F, 0.18F, 0F, 0.2F, 0.18F, -0.09F, 0.2F, 0.18F, -0.09F); // Box 32
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(2.05F, 1.91F, -1F, 1, 4, 4, 0F,0.2F, 0F, 0.09F, 0.2F, 0F, 0.09F, 0.2F, 0F, 0.09F, 0.2F, 0F, 0.09F, 0.2F, 0.18F, 0.09F, 0.2F, 0.18F, 0.09F, 0.2F, 0.18F, 0.09F, 0.2F, 0.18F, 0.09F); // Box 33
		gunModel[15].setRotationPoint(0F, 0F, 0F);
	}
}