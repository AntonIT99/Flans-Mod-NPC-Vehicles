//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJazayer extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelJazayer() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[17];
		ammoModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		gunModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 11
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 23
		gunModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 24
		gunModel[4] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 25
		gunModel[5] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 14
		gunModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 17
		gunModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 14
		gunModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 15
		gunModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 20
		gunModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 21
		gunModel[11] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 22
		gunModel[12] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 23
		gunModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 25
		gunModel[14] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 22
		gunModel[15] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 23
		gunModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 26

		gunModel[0].addShapeBox(0F, 0F, 0F, 17, 2, 2, 0F,10F, -0.3F, 0F, 10F, -0.3F, -0.2F, 10F, -0.3F, -0.2F, 10F, -0.3F, 0F, 10F, 0F, 0F, 10F, -0.7F, -0.3F, 10F, -0.7F, -0.3F, 10F, 0F, 0F); // Box 10
		gunModel[0].setRotationPoint(19F, -4.5F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, -0.9F, 0.2F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.9F, 0.2F, -1F, 2.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 2.5F, 0.2F); // Box 11
		gunModel[1].setRotationPoint(-13.5F, -4F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[2].setRotationPoint(3F, -3F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,15F, -0.1F, -0.1F, 15F, -0.1F, -0.1F, 15F, -0.1F, -0.1F, 15F, -0.1F, -0.1F, 15F, -0.1F, -0.1F, 15F, -0.1F, -0.1F, 15F, -0.1F, -0.1F, 15F, -0.1F, -0.1F); // Box 24
		gunModel[3].setRotationPoint(22F, -4.9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 25
		gunModel[4].setRotationPoint(46F, -4.9F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		gunModel[5].setRotationPoint(1F, -4F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 17
		gunModel[6].setRotationPoint(2F, -4.7F, -1.2F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 14
		gunModel[7].setRotationPoint(1.2F, -3.7F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 15
		gunModel[8].setRotationPoint(0.2F, -0.9F, -0.5F);
		gunModel[8].rotateAngleZ = 0.78539816F;

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 20
		gunModel[9].setRotationPoint(6F, -4.3F, -1.9F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F); // Box 21
		gunModel[10].setRotationPoint(5.5F, -5.6F, -1.9F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 22
		gunModel[11].setRotationPoint(6.2F, -4.7F, -1.9F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F); // Box 23
		gunModel[12].setRotationPoint(6F, -5.4F, -1.9F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 25
		gunModel[13].setRotationPoint(1F, -4.9F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[14].setRotationPoint(0F, -4F, -1F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 23
		gunModel[15].setRotationPoint(-1F, -4F, -1F);

		gunModel[16].addShapeBox(-1F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 26
		gunModel[16].setRotationPoint(-0.5F, -2.1F, -0.5F);
		gunModel[16].rotateAngleZ = -0.62831853F;
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 34
		ammoModel[0].setRotationPoint(46F, -4.8F, -0.5F);
	}
}