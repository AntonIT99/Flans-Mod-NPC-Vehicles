//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ShitBow
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

public class ModelShitBow extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelShitBow() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[5];
		ammoModel = new ModelRendererTurbo[3];
		slideModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		gunModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 25
		gunModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 26
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		gunModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 28

		gunModel[0].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 24
		gunModel[0].setRotationPoint(1F, -5F, 0F);

		gunModel[1].addBox(-1F, 0F, 0F, 1, 5, 1, 0F); // Box 25
		gunModel[1].setRotationPoint(2F, 1F, 0F);
		gunModel[1].rotateAngleZ = -0.17453293F;

		gunModel[2].addShapeBox(-1F, 5F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 26
		gunModel[2].setRotationPoint(2F, 1F, 0F);
		gunModel[2].rotateAngleZ = -0.17453293F;

		gunModel[3].addBox(-1F, -5F, 0F, 1, 5, 1, 0F); // Box 27
		gunModel[3].setRotationPoint(2F, -5F, 0F);
		gunModel[3].rotateAngleZ = 0.17453293F;

		gunModel[4].addShapeBox(-3F, -12F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 28
		gunModel[4].setRotationPoint(2F, -5F, 0F);
		gunModel[4].rotateAngleZ = 0.17453293F;
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		ammoModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 32
		ammoModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 33

		ammoModel[0].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 31
		ammoModel[0].setRotationPoint(-3F, -2.8F, 0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F); // Box 32
		ammoModel[1].setRotationPoint(5F, -2.8F, 0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, 0F); // Box 33
		ammoModel[2].setRotationPoint(6F, -2.8F, 0.5F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 29

		slideModel[0].addShapeBox(0F, 0F, 0F, 1, 28, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, 0.7F, 0F, -0.3F); // Box 29
		slideModel[0].setRotationPoint(-2F, -16F, 1F);
		slideModel[0].rotateAngleY = 3.14159265F;
		animationType = EnumAnimationType.END_LOADED;
	}
}