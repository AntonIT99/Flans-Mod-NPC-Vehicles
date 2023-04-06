//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BoetianShield
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

public class ModelBoetianShield extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelBoetianShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[18];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 12
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 14
		gunModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 10
		gunModel[6] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 11
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12
		gunModel[8] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 16
		gunModel[9] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 23
		gunModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 24
		gunModel[11] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 25
		gunModel[12] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 26
		gunModel[13] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 27
		gunModel[14] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 28
		gunModel[15] = new ModelRendererTurbo(this, 50, 15, textureX, textureY); // Box 29
		gunModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 30
		gunModel[17] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 31

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 4, 9, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 16
		gunModel[0].setRotationPoint(1F, -2.5F, -4.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 11
		gunModel[1].setRotationPoint(1.3F, -2F, -2F);

		gunModel[2].addShapeBox(0F, -2.7F, 0F, 1, 1, 4, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		gunModel[2].setRotationPoint(1.3F, -1F, -2F);

		gunModel[3].addShapeBox(0F, -5F, 0F, 1, 1, 10, 0F,0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[3].setRotationPoint(1F, -6.5F, -5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 9
		gunModel[4].setRotationPoint(1F, -10.5F, -5F);

		gunModel[5].addShapeBox(0F, -3F, 0F, 1, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[5].setRotationPoint(1F, -4.5F, -7F);

		gunModel[6].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F); // Box 11
		gunModel[6].setRotationPoint(1F, -0.5F, -7F);

		gunModel[7].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[7].setRotationPoint(1F, -0.5F, -4.6F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 16
		gunModel[8].setRotationPoint(1F, 9.5F, -5F);

		gunModel[9].addShapeBox(0F, -2.8F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 23
		gunModel[9].setRotationPoint(1.3F, 4.5F, -2F);

		gunModel[10].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[10].setRotationPoint(1F, 2.5F, -4.6F);

		gunModel[11].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 25
		gunModel[11].setRotationPoint(1F, 2.5F, -7F);

		gunModel[12].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 26
		gunModel[12].setRotationPoint(1F, -0.5F, 6F);

		gunModel[13].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 27
		gunModel[13].setRotationPoint(1F, -0.5F, 3.6F);

		gunModel[14].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 28
		gunModel[14].setRotationPoint(1F, 2.5F, 3.6F);

		gunModel[15].addShapeBox(0F, -3F, 0F, 1, 3, 1, 0F,0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		gunModel[15].setRotationPoint(1F, 2.5F, 6F);

		gunModel[16].addShapeBox(0F, -3F, 0F, 1, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		gunModel[16].setRotationPoint(1F, 4.5F, -7F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 10, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		gunModel[17].setRotationPoint(1F, 6.5F, -5F);
	}
}