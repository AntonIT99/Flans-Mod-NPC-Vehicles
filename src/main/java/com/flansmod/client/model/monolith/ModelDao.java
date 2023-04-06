//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Dao
// Model Creator: 
// Created on: 16.05.2019 - 13:10:34
// Last changed on: 16.05.2019 - 13:10:34

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDao extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelDao() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box1
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box2
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box3
		gunModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 5
		gunModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 9
		gunModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 10
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		gunModel[8] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 12
		gunModel[9] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 13
		gunModel[10] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 14

		gunModel[0].addShapeBox(0F, 0F, -0.65F, 1, 1, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Import Box0
		gunModel[0].setRotationPoint(0.2F, -3F, 0.5F);
		gunModel[0].rotateAngleY = -1.04719755F;

		gunModel[1].addShapeBox(0F, 0F, -1.15F, 1, 6, 2, 0F,-0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.5F, -0.45F, 0.5F, -0.5F, -0.45F, 6F, -0.5F, -0.45F, 6F, -0.5F, -0.45F, 6F, -0.5F, -0.45F, 6F, -0.5F); // Import Box1
		gunModel[1].setRotationPoint(0.2F, -14.5F, 0.5F);
		gunModel[1].rotateAngleY = -1.04719755F;

		gunModel[2].addShapeBox(0F, 0F, -1.15F, 1, 1, 2, 0F,-0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -1.5F, -0.45F, -0.2F, -1.5F, -0.45F, 1F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 1F, -0.5F, -0.45F, 1F, -0.5F); // Import Box2
		gunModel[2].setRotationPoint(0.2F, -17F, 0.5F);
		gunModel[2].rotateAngleY = -1.04719755F;

		gunModel[3].addShapeBox(0F, 0F, -0.65F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Import Box3
		gunModel[3].setRotationPoint(0.2F, -2.5F, 0.5F);
		gunModel[3].rotateAngleY = -1.04719755F;

		gunModel[4].addShapeBox(0F, 0F, -0.65F, 1, 1, 1, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 5
		gunModel[4].setRotationPoint(0.2F, -3F, 0.5F);
		gunModel[4].rotateAngleY = -1.04719755F;

		gunModel[5].addShapeBox(0F, 1.5F, -0.65F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 9
		gunModel[5].setRotationPoint(0.2F, 0.5F, 0.5F);
		gunModel[5].rotateAngleY = -1.04719755F;

		gunModel[6].addShapeBox(0F, 1.6F, -0.1F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.8F, -0.25F, -0.2F, -0.8F, -0.25F); // Box 10
		gunModel[6].setRotationPoint(0.2F, 0.4F, 0.5F);
		gunModel[6].rotateAngleY = -1.04719755F;

		gunModel[7].addShapeBox(0F, 1F, -0.1F, 1, 1, 1, 0F,-0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.8F, -0.25F, -0.2F, -0.8F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F); // Box 11
		gunModel[7].setRotationPoint(0.2F, 0.5F, 0.5F);
		gunModel[7].rotateAngleY = -1.04719755F;

		gunModel[8].addShapeBox(0F, 1F, -1.2F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.8F, -0.25F, -0.2F, -0.8F, -0.25F); // Box 12
		gunModel[8].setRotationPoint(0.2F, 0.5F, 0.5F);
		gunModel[8].rotateAngleY = -1.04719755F;

		gunModel[9].addShapeBox(0F, 1.6F, -1.2F, 1, 1, 1, 0F,-0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.8F, -0.25F, -0.2F, -0.8F, -0.25F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F); // Box 13
		gunModel[9].setRotationPoint(0.2F, 0.4F, 0.5F);
		gunModel[9].rotateAngleY = -1.04719755F;

		gunModel[10].addShapeBox(0F, 0.6F, -0.65F, 1, 1, 1, 0F,-0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F); // Box 14
		gunModel[10].setRotationPoint(0.2F, 0.5F, 0.5F);
		gunModel[10].rotateAngleY = -1.04719755F;
	}
}