//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Arquebus
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

public class ModelArquebus extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelArquebus() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		ammoModel = new ModelRendererTurbo[2];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 23
		gunModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		gunModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 25
		gunModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 26
		gunModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 27
		gunModel[7] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 28
		gunModel[8] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 29
		gunModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		gunModel[10] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 31
		gunModel[11] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 32

		gunModel[0].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F); // Box 10
		gunModel[0].setRotationPoint(0F, -1.5F, 1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0.3F, -5.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, -5.3F, -0.3F, 0F, 4.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, -0.3F); // Box 11
		gunModel[1].setRotationPoint(-14F, -2F, 1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[2].setRotationPoint(-3F, -2F, 1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 24
		gunModel[3].setRotationPoint(0F, -2.5F, 1.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.2F, 0.2F); // Box 25
		gunModel[4].setRotationPoint(24F, -2.5F, 1.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 26
		gunModel[5].setRotationPoint(4F, -2.6F, 1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 27
		gunModel[6].setRotationPoint(16F, -2.6F, 1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 28
		gunModel[7].setRotationPoint(16F, -1.6F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 29
		gunModel[8].setRotationPoint(16F, -1.6F, 3F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 30
		gunModel[9].setRotationPoint(16F, 1.2F, 3F);
		gunModel[9].rotateAngleX = -0.52359878F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 31
		gunModel[10].setRotationPoint(16F, 1.6F, 0.2F);
		gunModel[10].rotateAngleX = 0.52359878F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F); // Box 32
		gunModel[11].setRotationPoint(16F, 3.6F, 1.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 33
		ammoModel[1] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 34

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 33
		ammoModel[0].setRotationPoint(0.5F, -3F, 0F);
		ammoModel[0].rotateAngleY = -1.57079633F;

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 34
		ammoModel[1].setRotationPoint(23.5F, -2.5F, 1.5F);
		animationType = EnumAnimationType.END_LOADED;
		
		translateAll(0F, -1F, -2F);
	}
}