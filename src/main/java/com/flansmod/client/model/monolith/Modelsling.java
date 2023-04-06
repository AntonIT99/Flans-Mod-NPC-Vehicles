//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 08.12.2019 - 12:57:33
// Last changed on: 08.12.2019 - 12:57:33

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelsling extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelsling() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		gunModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 4
		gunModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 9
		gunModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		gunModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		gunModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		gunModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 15
		gunModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 16
		gunModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 17
		gunModel[14] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 18

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 42, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[0].setRotationPoint(0F, -2F, -2.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 2, 42, 1, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[1].setRotationPoint(3F, -2F, -2.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 42, 1, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 3
		gunModel[2].setRotationPoint(-2F, -2F, -2.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 42, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F); // Box 4
		gunModel[3].setRotationPoint(-2F, -2F, 14.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 42, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[4].setRotationPoint(0F, -2F, 14.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 42, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F); // Box 6
		gunModel[5].setRotationPoint(3F, -2F, 14.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 9
		gunModel[6].setRotationPoint(0F, 40F, 8.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[7].setRotationPoint(2F, 42F, 4.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 11
		gunModel[8].setRotationPoint(-2F, 42F, 4.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[9].setRotationPoint(1F, 42F, 4.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[10].setRotationPoint(-2F, 41F, 2.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		gunModel[11].setRotationPoint(3F, 41F, 2.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 16
		gunModel[12].setRotationPoint(-2F, 41F, 8.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[13].setRotationPoint(3F, 41F, 8.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 7, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 18
		gunModel[14].setRotationPoint(0F, 41F, -2.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 19

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		ammoModel[0].setRotationPoint(1F, 41F, 5.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}