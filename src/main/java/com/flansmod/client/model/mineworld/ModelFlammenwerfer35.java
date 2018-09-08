//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Flammenwerfer35
// Model Creator: 
// Created on: 19.04.2016 - 15:02:31
// Last changed on: 19.04.2016 - 15:02:31

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFlammenwerfer35 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelFlammenwerfer35() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[13];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportShape2
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import ImportShape4
		gunModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportShape4
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import ImportShape5
		gunModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import ImportShape7
		gunModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import ImportShape8
		gunModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import Box0
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box1
		gunModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box3
		gunModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box4
		gunModel[10] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import Box5
		gunModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box6
		gunModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box7

		gunModel[0].addBox(0F, 0F, 0F, 18, 1, 1, 0F); // Import ImportShape2
		gunModel[0].setRotationPoint(-6F, -4F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportShape4
		gunModel[1].setRotationPoint(-12F, -1F, 3F);

		gunModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import ImportShape4
		gunModel[2].setRotationPoint(-12F, -1F, 6F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Import ImportShape5
		gunModel[3].setRotationPoint(-3F, -4.5F, -1F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Import ImportShape7
		gunModel[4].setRotationPoint(-9F, -3.6F, -0.5F);
		gunModel[4].rotateAngleZ = 0.10471976F;

		gunModel[5].addBox(-1F, -0.5F, 0F, 4, 1, 1, 0F); // Import ImportShape8
		gunModel[5].setRotationPoint(-14.5F, 12F, 2.5F);
		gunModel[5].rotateAngleX = -0.12217305F;
		gunModel[5].rotateAngleY = -1.48352986F;
		gunModel[5].rotateAngleZ = 0.27925268F;

		gunModel[6].addShapeBox(0F, -1F, 0F, 2, 2, 2, 0F, 0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0.25F, 0.25F, 0.25F); // Import Box0
		gunModel[6].setRotationPoint(-6F, -3.5F, -1F);

		gunModel[7].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Import Box1
		gunModel[7].setRotationPoint(-2F, -3F, -0.5F);

		gunModel[8].addBox(0F, 0F, 1F, 1, 3, 1, 0F); // Import Box3
		gunModel[8].setRotationPoint(-14.5F, 10F, 3.5F);

		gunModel[9].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Import Box4
		gunModel[9].setRotationPoint(-14.5F, 12F, 2.5F);

		gunModel[10].addBox(-5F, 1F, 0F, 4, 1, 1, 0F); // Import Box5
		gunModel[10].setRotationPoint(-14F, -1.3F, 0.5F);
		gunModel[10].rotateAngleY = -3.14159265F;
		gunModel[10].rotateAngleZ = -0.66322512F;

		gunModel[11].addBox(-4F, 0F, 0F, 6, 1, 1, 0F); // Import Box6
		gunModel[11].setRotationPoint(-14F, 2.7F, 0.5F);
		gunModel[11].rotateAngleY = -3.14159265F;
		gunModel[11].rotateAngleZ = -1.22173048F;

		gunModel[12].addBox(-4F, 0F, 0F, 7, 1, 1, 0F); // Import Box7
		gunModel[12].setRotationPoint(-14.25F, 8.7F, 0.5F);
		gunModel[12].rotateAngleY = -3.14159265F;
		gunModel[12].rotateAngleZ = -1.6406095F;


		ammoModel = new ModelRendererTurbo[2];
		ammoModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportTank
		ammoModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import Box2

		ammoModel[0].addShapeBox(-17.5F, -2F, 4F, 5, 26, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -13F, -6F, 0F, -13F, -6F); // Import ImportTank
		ammoModel[0].setRotationPoint(1F, 0F, -2F);

		ammoModel[1].addBox(-17.5F, -2F, 4F, 3, 7, 3, 0F); // Import Box2
		ammoModel[1].setRotationPoint(2F, 3F, 4F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}