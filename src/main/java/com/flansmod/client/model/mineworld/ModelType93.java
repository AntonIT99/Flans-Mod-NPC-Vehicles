//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Type93
// Model Creator: 
// Created on: 21.04.2016 - 16:15:36
// Last changed on: 21.04.2016 - 16:15:36

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelType93 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelType93() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[11];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportShape2
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportShape4
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportShape4
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportShape5
		gunModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import ImportShape7
		gunModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import ImportShape10
		gunModel[6] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import Box4
		gunModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box5
		gunModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box6
		gunModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box10
		gunModel[10] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import Box11

		gunModel[0].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Import ImportShape2
		gunModel[0].setRotationPoint(-6F, -4F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportShape4
		gunModel[1].setRotationPoint(-12F, -1F, 2F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportShape4
		gunModel[2].setRotationPoint(-12F, -1F, 8F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportShape5
		gunModel[3].setRotationPoint(-4F, -4.5F, -1F);

		gunModel[4].addBox(-0.5F, 0F, 0F, 5, 1, 1, 0F); // Import ImportShape7
		gunModel[4].setRotationPoint(-10F, -2.7F, -0.5F);
		gunModel[4].rotateAngleZ = 0.31415927F;

		gunModel[5].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // Import ImportShape10
		gunModel[5].setRotationPoint(-15F, -1F, 1.5F);

		gunModel[6].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Import Box4
		gunModel[6].setRotationPoint(-14.5F, 4F, -0.5F);

		gunModel[7].addBox(-4F, 1F, 0F, 3, 1, 1, 0F); // Import Box5
		gunModel[7].setRotationPoint(-14F, -1.3F, 0.5F);
		gunModel[7].rotateAngleY = -3.14159265F;
		gunModel[7].rotateAngleZ = -0.57595865F;

		gunModel[8].addBox(-4F, 0F, 0F, 6, 1, 1, 0F); // Import Box6
		gunModel[8].setRotationPoint(-14F, 2.7F, 0.5F);
		gunModel[8].rotateAngleY = -3.14159265F;
		gunModel[8].rotateAngleZ = -1.23918377F;

		gunModel[9].addShapeBox(14F, 0F, 0F, 2, 2, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box10
		gunModel[9].setRotationPoint(-4F, -4.5F, -1F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import Box11
		gunModel[10].setRotationPoint(-4F, -4.5F, -1F);


		ammoModel = new ModelRendererTurbo[3];
		ammoModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import ImportTank
		ammoModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box8
		ammoModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box9

		ammoModel[0].addBox(-17.5F, -2F, 3F, 4, 9, 3, 0F); // Import ImportTank
		ammoModel[0].setRotationPoint(2F, -1F, -2F);

		ammoModel[1].addBox(-17.5F, -2F, 3F, 4, 8, 3, 0F); // Import Box8
		ammoModel[1].setRotationPoint(0F, 0F, 1F);

		ammoModel[2].addBox(-17.5F, -2F, 3F, 4, 9, 3, 0F); // Import Box9
		ammoModel[2].setRotationPoint(2F, -1F, 4F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}