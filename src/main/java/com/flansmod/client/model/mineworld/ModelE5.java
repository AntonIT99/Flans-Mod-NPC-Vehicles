//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: E5
// Model Creator: 
// Created on: 21.10.2016 - 23:07:57
// Last changed on: 21.10.2016 - 23:07:57

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelE5 extends ModelGun //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelE5() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[15];
		gunModel[0] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Import ImportBarrel
		gunModel[1] = new ModelRendererTurbo(this, 113, 150, textureX, textureY); // Import ImportBody
		gunModel[2] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import ImportGrip
		gunModel[3] = new ModelRendererTurbo(this, 150, 150, textureX, textureY); // Import ImportSightFront
		gunModel[4] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import ImportSightRear
		gunModel[5] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import ImportBodyBack
		gunModel[6] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Import ImportUnderBarrel
		gunModel[7] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import ImportGrip
		gunModel[8] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import Box13
		gunModel[9] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Import Box18
		gunModel[10] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box19
		gunModel[11] = new ModelRendererTurbo(this, 160, 165, textureX, textureY); // Import Box20
		gunModel[12] = new ModelRendererTurbo(this, 160, 150, textureX, textureY); // Import Box22
		gunModel[13] = new ModelRendererTurbo(this, 100, 150, textureX, textureY); // Import Box23
		gunModel[14] = new ModelRendererTurbo(this, 100, 175, textureX, textureY); // Import Box24

		gunModel[0].addBox(0F, 0F, 1F, 11, 1, 1, 0F); // Import ImportBarrel
		gunModel[0].setRotationPoint(1F, -2.7F, -0.6F);

		gunModel[1].addBox(0F, 0F, 1F, 8, 2, 2, 0F); // Import ImportBody
		gunModel[1].setRotationPoint(-6F, -3.2F, -1.1F);

		gunModel[2].addBox(-2F, 0F, 1F, 2, 3, 2, 0F); // Import ImportGrip
		gunModel[2].setRotationPoint(-3.5F, 1.5F, -1.1F);
		gunModel[2].rotateAngleZ = -3.66519143F;

		gunModel[3].addBox(0F, 0F, 1F, 1, 3, 1, 0F); // Import ImportSightFront
		gunModel[3].setRotationPoint(10F, -4.8F, -0.6F);

		gunModel[4].addShapeBox(0F, 0F, 1F, 2, 1, 1, 0F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import ImportSightRear
		gunModel[4].setRotationPoint(2F, -3.5F, -0.6F);

		gunModel[5].addBox(0F, 0F, 1F, 2, 1, 2, 0F); // Import ImportBodyBack
		gunModel[5].setRotationPoint(-3.5F, -1.7F, -1.1F);

		gunModel[6].addBox(0F, 0F, 1F, 6, 2, 1, 0F); // Import ImportUnderBarrel
		gunModel[6].setRotationPoint(4F, -1.7F, -0.6F);

		gunModel[7].addBox(0F, 0F, 1F, 2, 5, 2, 0F); // Import ImportGrip
		gunModel[7].setRotationPoint(-2F, -2.2F, -1.1F);

		gunModel[8].addBox(0F, -2F, 1F, 2, 2, 2, 0F); // Import Box13
		gunModel[8].setRotationPoint(-2F, 2.8F, -1.1F);
		gunModel[8].rotateAngleZ = 0.85521133F;

		gunModel[9].addShapeBox(0F, 0F, 1F, 2, 1, 1, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Import Box18
		gunModel[9].setRotationPoint(2F, -2.7F, -0.6F);

		gunModel[10].addBox(0F, 0F, 1F, 3, 3, 1, 0F); // Import Box19
		gunModel[10].setRotationPoint(-3F, -5.5F, -0.6F);

		gunModel[11].addShapeBox(0F, 0F, 1F, 15, 1, 1, 0F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F); // Import Box20
		gunModel[11].setRotationPoint(-5F, -4.7F, -0.6F);

		gunModel[12].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, 0F, 0.8F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box22
		gunModel[12].setRotationPoint(-4.8F, -3.5F, -0.6F);

		gunModel[13].addShapeBox(0F, 0F, 1F, 2, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0.5F, 0F); // Import Box23
		gunModel[13].setRotationPoint(0F, -1F, -0.6F);

		gunModel[14].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F, -0.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.2F, 0F); // Import Box24
		gunModel[14].setRotationPoint(3F, -0.7F, -0.6F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 150, 180, textureX, textureY); // Import ImportMagazine

		ammoModel[0].addBox(0F, 0F, 1F, 2, 1, 2, 0F); // Import ImportMagazine
		ammoModel[0].setRotationPoint(-3F, -3F, -2.6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}