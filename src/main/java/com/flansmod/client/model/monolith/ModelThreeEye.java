//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ThreeEye
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

public class ModelThreeEye extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelThreeEye() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[20];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 46
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 40
		gunModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		gunModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		gunModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		gunModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 11
		gunModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		gunModel[7] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 13
		gunModel[8] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 14
		gunModel[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 15
		gunModel[10] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 16
		gunModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		gunModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 18
		gunModel[13] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 19
		gunModel[14] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 20
		gunModel[15] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 21
		gunModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		gunModel[17] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 24
		gunModel[19] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 25

		gunModel[0].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,35F, 0F, 0F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 35F, 0F, 0F, 35F, 0F, 0F, 6F, 0.3F, 0.3F, 6F, 0.3F, 0.3F, 35F, 0F, 0F); // Box 46
		gunModel[0].setRotationPoint(-11F, -2.8F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0F); // Box 40
		gunModel[1].setRotationPoint(16F, -5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.2F, 0.2F); // Box 11
		gunModel[2].setRotationPoint(2F, -3.3F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F); // Box 17
		gunModel[3].setRotationPoint(21.5F, -5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 18
		gunModel[4].setRotationPoint(28F, -5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 11
		gunModel[5].setRotationPoint(24.5F, -5F, -0.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 12
		gunModel[6].setRotationPoint(21F, -5F, -0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0F); // Box 13
		gunModel[7].setRotationPoint(16F, -2.3F, -2F);
		gunModel[7].rotateAngleX = -0.17453293F;

		gunModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 14
		gunModel[8].setRotationPoint(21F, -2.3F, -2F);
		gunModel[8].rotateAngleX = -0.17453293F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 15
		gunModel[9].setRotationPoint(24.5F, -2.3F, -2F);
		gunModel[9].rotateAngleX = -0.17453293F;

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 16
		gunModel[10].setRotationPoint(28F, -2.3F, -2F);
		gunModel[10].rotateAngleX = -0.17453293F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 10, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F); // Box 17
		gunModel[11].setRotationPoint(21.5F, -2.3F, -2F);
		gunModel[11].rotateAngleX = -0.17453293F;

		gunModel[12].addShapeBox(0F, 0F, -2F, 5, 2, 2, 0F,0.2F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0F, 0F); // Box 18
		gunModel[12].setRotationPoint(16F, -2.3F, 3F);
		gunModel[12].rotateAngleX = 0.17453293F;

		gunModel[13].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 19
		gunModel[13].setRotationPoint(21F, -2.3F, 3F);
		gunModel[13].rotateAngleX = 0.17453293F;

		gunModel[14].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 20
		gunModel[14].setRotationPoint(24.5F, -2.3F, 3F);
		gunModel[14].rotateAngleX = 0.17453293F;

		gunModel[15].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,-0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F); // Box 21
		gunModel[15].setRotationPoint(28F, -2.3F, 3F);
		gunModel[15].rotateAngleX = 0.17453293F;

		gunModel[16].addShapeBox(0F, 0F, -2F, 10, 2, 2, 0F,0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.2F, 0.2F); // Box 22
		gunModel[16].setRotationPoint(21.5F, -2.3F, 3F);
		gunModel[16].rotateAngleX = 0.17453293F;

		gunModel[17].addShapeBox(-1F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[17].setRotationPoint(11.8F, -3.8F, -0.5F);
		gunModel[17].rotateAngleZ = 0.2268928F;

		gunModel[18].addShapeBox(-1F, -2F, -1F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[18].setRotationPoint(11.8F, -0.8F, 1F);
		gunModel[18].rotateAngleX = 0.17453293F;
		gunModel[18].rotateAngleY = 0.26179939F;
		gunModel[18].rotateAngleZ = -0.13962634F;

		gunModel[19].addShapeBox(-1F, -2F, -1F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[19].setRotationPoint(11.8F, -0.8F, 0F);
		gunModel[19].rotateAngleX = -0.17453293F;
		gunModel[19].rotateAngleY = -0.26179939F;
		gunModel[19].rotateAngleZ = -0.13962634F;
	}
}