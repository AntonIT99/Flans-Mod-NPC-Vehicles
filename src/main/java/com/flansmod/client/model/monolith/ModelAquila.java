//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Aquila
// Model Creator: 
// Created on: 28.04.2019 - 13:52:19
// Last changed on: 28.04.2019 - 13:52:19

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAquila extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 64;

	public ModelAquila() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[19];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Import Box2
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box3
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box5
		gunModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box6
		gunModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box7
		gunModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box8
		gunModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box9
		gunModel[8] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box10
		gunModel[9] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box12
		gunModel[10] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box13
		gunModel[11] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box14
		gunModel[12] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import Box15
		gunModel[13] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import Box16
		gunModel[14] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box17
		gunModel[15] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box18
		gunModel[16] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import Box19
		gunModel[17] = new ModelRendererTurbo(this, 11, 0, textureX, textureY); // Import Box20
		gunModel[18] = new ModelRendererTurbo(this, 4, 18, textureX, textureY); // Import Box21

		gunModel[0].addShapeBox(0F, 0F, -1F, 2, 13, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 37F, -0.25F, -0.25F, 37F, -0.25F, -0.25F, 37F, -0.25F, -0.25F, 37F, -0.25F); // Import Box0
		gunModel[0].setRotationPoint(0F, -28F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 2, 2, 6, 0F); // Import Box2
		gunModel[1].setRotationPoint(0F, -29F, -3F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box3
		gunModel[2].setRotationPoint(0.5F, -31F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Import Box5
		gunModel[3].setRotationPoint(0.5F, -31F, 0F);

		gunModel[4].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Import Box6
		gunModel[4].setRotationPoint(0.5F, -34F, -1F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box7
		gunModel[5].setRotationPoint(0.5F, -35F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box8
		gunModel[6].setRotationPoint(0.5F, -34F, -3F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box9
		gunModel[7].setRotationPoint(0.5F, -34F, -5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.1F, 0.7F, 0F, -1.1F, 0.7F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box10
		gunModel[8].setRotationPoint(0.5F, -34F, -3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F); // Import Box12
		gunModel[9].setRotationPoint(0.5F, -32F, -5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box13
		gunModel[10].setRotationPoint(0.5F, -34F, 1F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1.5F, 1F, 0F, 1.5F, 1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.1F, 0.7F, 0F, -1.1F, 0.7F); // Import Box14
		gunModel[11].setRotationPoint(0.5F, -34F, 2F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		gunModel[12].setRotationPoint(0.5F, -34F, 3F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1.25F, -1F, 0F, -1.25F, -1F); // Import Box16
		gunModel[13].setRotationPoint(0.5F, -32F, 3F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, -0.6F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		gunModel[14].setRotationPoint(0.5F, -36.5F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, -0.9F, -0.75F, 0F, -0.9F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Import Box18
		gunModel[15].setRotationPoint(0.5F, -36.25F, 0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Import Box19
		gunModel[16].setRotationPoint(0.5F, -36.5F, 0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.6F, 0.25F, 0F, -0.6F, 0.25F, 0F, -0.9F, -0.75F, 0F, -0.9F, -0.75F); // Import Box20
		gunModel[17].setRotationPoint(0.5F, -35.25F, 0.5F);

		gunModel[18].addBox(0F, 0F, 0F, 2, 5, 2, 0F); // Import Box21
		gunModel[18].setRotationPoint(0F, -27F, -1F);
	}
}