//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RoundShield
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

public class ModelRoundShield extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelRoundShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[15];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		gunModel[1] = new ModelRendererTurbo(this, 25, 0, textureX, textureY); // Box 14
		gunModel[2] = new ModelRendererTurbo(this, 15, 18, textureX, textureY); // Box 9
		gunModel[3] = new ModelRendererTurbo(this, 34, 9, textureX, textureY); // Box 10
		gunModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		gunModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 13
		gunModel[7] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 12
		gunModel[8] = new ModelRendererTurbo(this, 15, 18, textureX, textureY); // Box 25
		gunModel[9] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Box 26
		gunModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		gunModel[11] = new ModelRendererTurbo(this, 34, 9, textureX, textureY); // Box 28
		gunModel[12] = new ModelRendererTurbo(this, 15, 18, textureX, textureY); // Box 29
		gunModel[13] = new ModelRendererTurbo(this, 15, 18, textureX, textureY); // Box 30
		gunModel[14] = new ModelRendererTurbo(this, 25, 0, textureX, textureY); // Box 31

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		gunModel[0].setRotationPoint(1F, -1F, -8F);

		gunModel[1].addShapeBox(0F, -5F, 0F, 1, 1, 8, 0F,0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[1].setRotationPoint(1F, -3.5F, -4F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 9
		gunModel[2].setRotationPoint(1F, -7.5F, -6F);

		gunModel[3].addShapeBox(0F, -3F, 0F, 1, 3, 14, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 10
		gunModel[3].setRotationPoint(1F, -1F, -7F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 11
		gunModel[4].setRotationPoint(1.3F, -1F, -2F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 12
		gunModel[5].setRotationPoint(2.3F, -1F, -1.5F);

		gunModel[6].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		gunModel[6].setRotationPoint(2.3F, -0.99F, -1.5F);

		gunModel[7].addShapeBox(0F, -1.7F, 0F, 1, 1, 4, 0F,0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 12
		gunModel[7].setRotationPoint(1.3F, -1F, -2F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F); // Box 25
		gunModel[8].setRotationPoint(1F, -5.5F, -6F);

		gunModel[9].addShapeBox(0F, -1.3F, 0F, 1, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F); // Box 26
		gunModel[9].setRotationPoint(1.3F, 2F, -2F);

		gunModel[10].addShapeBox(0F, -1F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.95F, -1F, 0F, -0.95F, -1F, 0F, 0F, -1F); // Box 27
		gunModel[10].setRotationPoint(2.3F, 1.01F, -1.5F);

		gunModel[11].addShapeBox(0F, 1F, 0F, 1, 3, 14, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 28
		gunModel[11].setRotationPoint(1F, -1F, -7F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 29
		gunModel[12].setRotationPoint(1F, 2.5F, -6F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 12, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 30
		gunModel[13].setRotationPoint(1F, 4.5F, -6F);

		gunModel[14].addShapeBox(0F, -5F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F, 0F, -0.1F, -3.5F); // Box 31
		gunModel[14].setRotationPoint(1F, 11.5F, -4F);
	}
}