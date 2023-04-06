//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ArquebusMatchlock
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

public class ModelArquebusMatchlock extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelArquebusMatchlock() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[21];
		ammoModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 23
		gunModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		gunModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 25
		gunModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 14
		gunModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 15
		gunModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
		gunModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 17
		gunModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 14
		gunModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 20
		gunModel[12] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 21
		gunModel[13] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 22
		gunModel[14] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 23
		gunModel[15] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 24
		gunModel[16] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 25
		gunModel[17] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 26
		gunModel[18] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 27
		gunModel[19] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 28
		gunModel[20] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 29

		gunModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F); // Box 10
		gunModel[0].setRotationPoint(5F, -3.5F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0.3F, -3.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -3.3F, 0.2F, 0F, 4.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 4.5F, 0.2F); // Box 11
		gunModel[1].setRotationPoint(-14F, -4F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[2].setRotationPoint(-2F, -3F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 24
		gunModel[3].setRotationPoint(2F, -4.9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 25
		gunModel[4].setRotationPoint(22F, -4.9F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 14
		gunModel[5].setRotationPoint(-6F, -4F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0.5F, -0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.2F, 0F, -0.8F, -0.3F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.8F, -0.3F); // Box 15
		gunModel[6].setRotationPoint(16F, -3.5F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 16
		gunModel[7].setRotationPoint(16F, -3.8F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		gunModel[8].setRotationPoint(-3F, -3.5F, -1.2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 14
		gunModel[9].setRotationPoint(0.2F, -2.5F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 15
		gunModel[10].setRotationPoint(-5.8F, -4.44089209850063E-16F, -0.5F);
		gunModel[10].rotateAngleZ = 0.27925268F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 20
		gunModel[11].setRotationPoint(3F, -4.3F, -1.9F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F); // Box 21
		gunModel[12].setRotationPoint(3.5F, -5.6F, -1.9F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 22
		gunModel[13].setRotationPoint(3.2F, -4.7F, -1.9F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 23
		gunModel[14].setRotationPoint(3F, -6.4F, -1.9F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 24
		gunModel[15].setRotationPoint(2.7F, -6.4F, -1.4F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F); // Box 25
		gunModel[16].setRotationPoint(-2F, -4.9F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 26
		gunModel[17].setRotationPoint(-1.5F, -5.6F, -1.4F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 27
		gunModel[18].setRotationPoint(2.7F, -6.2F, -1.2F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 28
		gunModel[19].setRotationPoint(4.5F, -6.2F, -1.2F);
		gunModel[19].rotateAngleY = -0.54105207F;
		gunModel[19].rotateAngleZ = -0.76794487F;

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 29
		gunModel[20].setRotationPoint(5F, -5F, -1.7F);
		gunModel[20].rotateAngleY = -0.27925268F;
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 34

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 34
		ammoModel[0].setRotationPoint(23F, -4.8F, -0.5F);
		
		animationType = EnumAnimationType.END_LOADED;
	}
}