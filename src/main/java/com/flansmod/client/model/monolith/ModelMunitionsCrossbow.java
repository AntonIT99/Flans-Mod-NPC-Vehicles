//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MunitionsCrossbow
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

public class ModelMunitionsCrossbow extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelMunitionsCrossbow() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[20];
		ammoModel = new ModelRendererTurbo[3];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 14
		gunModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 15
		gunModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 17
		gunModel[6] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 18
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		gunModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 20
		gunModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 21
		gunModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 22
		gunModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		gunModel[12] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 24
		gunModel[13] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 25
		gunModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 26
		gunModel[15] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 27
		gunModel[16] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 29
		gunModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 30
		gunModel[18] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		gunModel[0].setRotationPoint(0F, -4F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F); // Box 11
		gunModel[1].setRotationPoint(-12F, -4F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		gunModel[2].setRotationPoint(9F, -4F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 14
		gunModel[3].setRotationPoint(1.2F, -2F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 15
		gunModel[4].setRotationPoint(-4.8F, -1.3F, -0.5F);
		gunModel[4].rotateAngleZ = 0.05235988F;

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 17
		gunModel[5].setRotationPoint(0.2F, -4.6F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		gunModel[6].setRotationPoint(14F, -3.5F, 0F);

		gunModel[7].addShapeBox(0F, 0F, -3F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[7].setRotationPoint(14F, -3.5F, 0F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		gunModel[8].setRotationPoint(14F, -3.5F, 2.7F);
		gunModel[8].rotateAngleY = 0.05235988F;

		gunModel[9].addShapeBox(0F, 0F, -5F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[9].setRotationPoint(14F, -3.5F, -2.7F);
		gunModel[9].rotateAngleY = -0.05235988F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[10].setRotationPoint(13.8F, -3.5F, 7.3F);
		gunModel[10].rotateAngleY = 0.34906585F;

		gunModel[11].addShapeBox(0F, 0F, -8F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[11].setRotationPoint(13.8F, -3.5F, -7.3F);
		gunModel[11].rotateAngleY = -0.34906585F;

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 24
		gunModel[12].setRotationPoint(9.5F, -3.5F, -2F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.2F, -0.1F, -0.2F, 0.7F, 0.2F, -0.2F, 0.7F, 0.2F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, 0.7F, 0.2F, -0.2F, 0.7F, 0.2F, -0.2F, 0.2F, -0.1F, -0.2F); // Box 25
		gunModel[13].setRotationPoint(9.5F, -3.5F, -2F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0.2F, -0.2F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, -0.4F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, -0.2F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, -0.4F, 0.5F, 0.2F, -0.2F); // Box 26
		gunModel[14].setRotationPoint(15.3F, -3.5F, -2.4F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0.2F, -0.1F, -0.2F, 0.7F, 0.2F, -0.2F, 0.7F, 0.2F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, 0.7F, 0.2F, -0.2F, 0.7F, 0.2F, -0.2F, 0.2F, -0.1F, -0.2F); // Box 27
		gunModel[15].setRotationPoint(9.5F, -3.5F, 1F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 29
		gunModel[16].setRotationPoint(0F, -4.8F, -0.5F);
		gunModel[16].rotateAngleY = 0.89011792F;
		gunModel[16].rotateAngleZ = -0.06981317F;

		gunModel[17].addShapeBox(0F, 0F, 0F, 19, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 30
		gunModel[17].setRotationPoint(-0.6F, -4.8F, -0.1F);
		gunModel[17].rotateAngleY = -0.89011792F;
		gunModel[17].rotateAngleZ = -0.06981317F;

		gunModel[18].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.5F, 0.2F, -0.2F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, 0F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, -0.2F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, 0F, 0.5F, 0.2F, -0.2F); // Box 24
		gunModel[18].setRotationPoint(15.3F, -3.5F, 1.4F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 25
		gunModel[19].setRotationPoint(19.2F, -3.5F, -2F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 31
		ammoModel[1] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 32
		ammoModel[2] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 33

		ammoModel[0].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 31
		ammoModel[0].setRotationPoint(0F, -4.8F, -0.5F);

		ammoModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F); // Box 32
		ammoModel[1].setRotationPoint(14F, -4.8F, -0.5F);

		ammoModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, 0F); // Box 33
		ammoModel[2].setRotationPoint(15F, -4.8F, -0.5F);
		animationType = EnumAnimationType.CROSSBOW;
	}
}