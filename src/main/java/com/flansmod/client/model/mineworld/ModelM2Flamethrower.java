//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: M2Flamethrower
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelM2Flamethrower extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelM2Flamethrower() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[10];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportShape1
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportShape2
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportShape4
		gunModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import ImportShape4
		gunModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportShape5
		gunModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import ImportShape6
		gunModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportShape7
		gunModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import ImportShape8
		gunModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportShape9
		gunModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportShape10

		gunModel[0].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Import ImportShape1
		gunModel[0].setRotationPoint(0F, -3.5F, -0.5F);
		gunModel[0].rotateAngleZ = -0.1396263F;

		gunModel[1].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Import ImportShape2
		gunModel[1].setRotationPoint(-3F, -4F, -0.5F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportShape4
		gunModel[2].setRotationPoint(-12F, -1F, 3F);

		gunModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportShape4
		gunModel[3].setRotationPoint(-12F, -1F, 9F);

		gunModel[4].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Import ImportShape5
		gunModel[4].setRotationPoint(13F, -4.5F, -1F);

		gunModel[5].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Import ImportShape6
		gunModel[5].setRotationPoint(8F, -4F, -0.5F);
		gunModel[5].rotateAngleZ = -0.1570796F;

		gunModel[6].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import ImportShape7
		gunModel[6].setRotationPoint(-10F, -2.7F, -0.5F);
		gunModel[6].rotateAngleZ = 0.05235988F;

		gunModel[7].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Import ImportShape8
		gunModel[7].setRotationPoint(-15F, -1F, 1.5F);
		gunModel[7].rotateAngleY = -0.3665192F;
		gunModel[7].rotateAngleZ = 0.3141593F;

		gunModel[8].addBox(0F, 0F, 0F, 3, 1, 2, 0F); // Import ImportShape9
		gunModel[8].setRotationPoint(-4F, -3F, -1F);

		gunModel[9].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Import ImportShape10
		gunModel[9].setRotationPoint(-15F, -1F, 1.5F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import ImportTank
		ammoModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box0
		ammoModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box1

		ammoModel[0].addBox(-17.5F, -2F, 3F, 5, 12, 4, 0F); // Import ImportTank
		ammoModel[0].setRotationPoint(1F, 0F, -1F);

		ammoModel[1].addBox(-17.5F, -2F, 3F, 5, 12, 4, 0F); // Import Box0
		ammoModel[1].setRotationPoint(1F, 0F, 4F);

		ammoModel[2].addBox(-17.5F, -2F, 3F, 6, 9, 3, 0F); // Import Box1
		ammoModel[2].setRotationPoint(-1F, 0F, 2F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}