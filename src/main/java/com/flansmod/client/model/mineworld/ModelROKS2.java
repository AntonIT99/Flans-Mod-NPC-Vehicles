//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ROKS2
// Model Creator: 
// Created on: 21.04.2016 - 15:49:04
// Last changed on: 21.04.2016 - 15:49:04

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelROKS2 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelROKS2() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[16];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportShape2
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportShape4
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportShape4
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box5
		gunModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box6
		gunModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box10
		gunModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box11
		gunModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box12
		gunModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box13
		gunModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box14
		gunModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box15
		gunModel[11] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box16
		gunModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box17
		gunModel[13] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box18
		gunModel[14] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 0
		gunModel[15] = new ModelRendererTurbo(this, 24, 40, textureX, textureY); // Box 3

		gunModel[0].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Import ImportShape2
		gunModel[0].setRotationPoint(-4F, -4F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportShape4
		gunModel[1].setRotationPoint(-12F, 3F, 2F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportShape4
		gunModel[2].setRotationPoint(-12F, 3F, 8F);

		gunModel[3].addBox(-4F, -1F, 0F, 4, 1, 1, 0F); // Import Box5
		gunModel[3].setRotationPoint(-10F, 3.7F, 0.5F);
		gunModel[3].rotateAngleY = -3.14159265F;
		gunModel[3].rotateAngleZ = -0.10471976F;

		gunModel[4].addBox(-3.5F, 0F, 0F, 4, 1, 1, 0F); // Import Box6
		gunModel[4].setRotationPoint(-13F, 4.7F, 0.5F);
		gunModel[4].rotateAngleY = -3.14159265F;
		gunModel[4].rotateAngleZ = -0.61086524F;

		gunModel[5].addShapeBox(11F, 0F, 0F, 2, 2, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box10
		gunModel[5].setRotationPoint(-1F, -4.5F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box11
		gunModel[6].setRotationPoint(2F, -4.5F, -1F);

		gunModel[7].addBox(-5.5F, 0F, 0F, 3, 1, 1, 0F); // Import Box12
		gunModel[7].setRotationPoint(-15.5F, 9.9F, 0.5F);
		gunModel[7].rotateAngleY = -3.19395253F;
		gunModel[7].rotateAngleZ = -1.1693706F;

		gunModel[8].addShapeBox(-6F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F); // Import Box13
		gunModel[8].setRotationPoint(-2F, -4.5F, -0.5F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Import Box14
		gunModel[9].setRotationPoint(-1F, -3F, -0.5F);

		gunModel[10].addBox(-4F, -1F, 0F, 5, 1, 1, 0F); // Import Box15
		gunModel[10].setRotationPoint(-6F, 3.4F, 0.5F);
		gunModel[10].rotateAngleY = -3.14159265F;
		gunModel[10].rotateAngleZ = 0.2443461F;

		gunModel[11].addShapeBox(0F, -1F, 0F, 2, 3, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box16
		gunModel[11].setRotationPoint(2F, -3.5F, -1F);

		gunModel[12].addBox(-4F, -1F, 0F, 5, 1, 1, 0F); // Import Box17
		gunModel[12].setRotationPoint(3.5F, 1.4F, 0.5F);
		gunModel[12].rotateAngleY = -3.14159265F;
		gunModel[12].rotateAngleZ = -1.57079633F;

		gunModel[13].addBox(-6F, -1F, 3F, 6, 1, 1, 0F); // Import Box18
		gunModel[13].setRotationPoint(-2F, 4.4F, 3.5F);
		gunModel[13].rotateAngleY = -3.14159265F;
		gunModel[13].rotateAngleZ = -0.34906585F;

		gunModel[14].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Box 0
		gunModel[14].setRotationPoint(-14.7F, 7F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 3
		gunModel[15].setRotationPoint(13F, -4.7F, -1F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import ImportTank
		ammoModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box8
		ammoModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box9

		ammoModel[0].addBox(-17.5F, -2F, 3F, 2, 8, 2, 0F); // Import ImportTank
		ammoModel[0].setRotationPoint(4F, 1F, -2F);

		ammoModel[1].addBox(-17.5F, -3F, 3F, 4, 11, 6, 0F); // Import Box8
		ammoModel[1].setRotationPoint(2F, 1F, 0F);

		ammoModel[2].addBox(-17.5F, -2F, 3F, 3, 5, 2, 0F); // Import Box9
		ammoModel[2].setRotationPoint(4F, 4F, 6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}