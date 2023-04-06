//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FireGourd
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

public class ModelFireGourd extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelFireGourd() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[2];
		ammoModel = new ModelRendererTurbo[8];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 40

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,25F, 0F, 0F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 25F, 0F, 0F, 25F, 0F, 0F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 25F, 0F, 0F); // Box 46
		gunModel[0].setRotationPoint(-12F, -2.8F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F); // Box 40
		gunModel[1].setRotationPoint(6F, -3.3F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 41
		ammoModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 42
		ammoModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 43
		ammoModel[3] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 44
		ammoModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 45
		ammoModel[5] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 46
		ammoModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 47
		ammoModel[7] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 48

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.4F, 0.4F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.2F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0.4F, 0.4F); // Box 41
		ammoModel[0].setRotationPoint(12F, -3.3F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0F, 0F, 0F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0F, 0F, 0F); // Box 42
		ammoModel[1].setRotationPoint(13F, -4.8F, -2F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 5, 0F,0.5F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0.3F); // Box 43
		ammoModel[2].setRotationPoint(15F, -4.8F, -2F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 1.5F, 1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1.5F, 1.5F); // Box 44
		ammoModel[3].setRotationPoint(16F, -3.3F, -0.5F);

		ammoModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.5F, 0.5F, 0.5F, 1F, 1F, 0.5F, 1F, 1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 1F, 1F, 0.5F, 1F, 1F, 0F, 0.5F, 0.5F); // Box 45
		ammoModel[4].setRotationPoint(17F, -3.3F, -0.5F);

		ammoModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Box 46
		ammoModel[5].setRotationPoint(18.5F, -3.3F, -0.5F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 47
		ammoModel[6].setRotationPoint(19.5F, -3.3F, -0.5F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 48
		ammoModel[7].setRotationPoint(20.5F, -3.3F, -0.5F);
	}
}