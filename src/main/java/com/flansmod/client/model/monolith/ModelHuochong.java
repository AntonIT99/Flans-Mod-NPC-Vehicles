//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Huochong
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

public class ModelHuochong extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelHuochong() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		gunModel[1] = new ModelRendererTurbo(this, 1, 4, textureX, textureY); // Box 40
		gunModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 10
		gunModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 11
		gunModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		gunModel[5] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 13
		gunModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 16
		gunModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		gunModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 18
		gunModel[9] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 19
		gunModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,25F, 0F, 0F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 25F, 0F, 0F, 25F, 0F, 0F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 25F, 0F, 0F); // Box 46
		gunModel[0].setRotationPoint(-14F, -2.8F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.2F, 0.2F); // Box 40
		gunModel[1].setRotationPoint(4F, -3.3F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F); // Box 10
		gunModel[2].setRotationPoint(8F, -3.3F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 11
		gunModel[3].setRotationPoint(3F, -3.3F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.2F, 0.2F, 0.2F, -0.5F, 0.55F, 0.5F, -0.5F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F); // Box 12
		gunModel[4].setRotationPoint(9F, -3.3F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F); // Box 13
		gunModel[5].setRotationPoint(9.5F, -3.3F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F); // Box 16
		gunModel[6].setRotationPoint(14F, -3.3F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 17
		gunModel[7].setRotationPoint(14.5F, -3.3F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 18
		gunModel[8].setRotationPoint(23F, -3.3F, -0.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.8F); // Box 19
		gunModel[9].setRotationPoint(11.5F, -3.3F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0.55F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.5F, 0.5F); // Box 20
		gunModel[10].setRotationPoint(13F, -3.3F, -0.5F);
	}
}