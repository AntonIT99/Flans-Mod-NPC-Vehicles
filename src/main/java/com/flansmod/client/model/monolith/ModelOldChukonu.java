//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: OldChukonu
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

public class ModelOldChukonu extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelOldChukonu() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		ammoModel = new ModelRendererTurbo[4];
		slideModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();
		initslideModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 11

		gunModel[0].addShapeBox(0F, 0F, 0F, 10, 2, 3, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 0
		gunModel[0].setRotationPoint(-8F, -2F, -1.5F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,-1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(-4.8F, -3F, -1.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(-4.8F, -2F, -1.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 3
		gunModel[3].setRotationPoint(0.5F, -1F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 4
		gunModel[4].setRotationPoint(0.1F, 1F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.5F, 0F, 0.3F); // Box 5
		gunModel[5].setRotationPoint(0.1F, 2F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -1.3F, -0.2F, -0.4F, 0.7F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -1.3F, -0.2F, -0.4F, 0.7F, -0.2F, -0.4F); // Box 6
		gunModel[6].setRotationPoint(1.5F, -1.2F, 0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0.7F, -0.2F, -0.4F, -1.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, 0.7F, -0.2F, -0.4F, -1.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F); // Box 7
		gunModel[7].setRotationPoint(1.5F, -1.2F, -7.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 9
		gunModel[8].setRotationPoint(1.5F, -1.2F, 0F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 10
		gunModel[9].setRotationPoint(1.5F, -1.2F, -2F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.2F, -0.5F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 11
		gunModel[10].setRotationPoint(1.1F, 2F, -0.5F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 12
		ammoModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 13
		ammoModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 14
		ammoModel[3] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 15

		ammoModel[0].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 12
		ammoModel[0].setRotationPoint(-3.8F, -3F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.3F, -0.3F); // Box 13
		ammoModel[1].setRotationPoint(0.8F, -3F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 14
		ammoModel[2].setRotationPoint(-3.8F, -3.2F, 0.1F);

		ammoModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.49F, -0.49F, -0.2F, -0.49F, -0.49F, -0.2F, -0.3F, -0.3F); // Box 15
		ammoModel[3].setRotationPoint(0.8F, -3.2F, 0.1F);
	}

	private void initslideModel_1()
	{
		slideModel[0] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 8

		slideModel[0].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 8
		slideModel[0].setRotationPoint(-10F, -1.5F, -1F);
		
		gunSlideDistance = 1F;
		gunSlideDistance = 0.5F;
		animationType = EnumAnimationType.RIFLE;
		
		numBulletsInReloadAnimation = 5;
		tiltGunTime = 0.279F;
		unloadClipTime = 0.0F;
		loadClipTime = 0.558F;
		untiltGunTime = 0.163F;
	}
}