//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 17.12.2019 - 14:16:28
// Last changed on: 17.12.2019 - 14:16:28

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelkoreanpeasantarmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelkoreanpeasantarmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 18
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 19
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 27
		bodyModel[4] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 28
		bodyModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 31
		bodyModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 32

		bodyModel[0].addShapeBox(-4F, 7.5F, -2F, 8, 3, 4, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F); // Box 18
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 9.8F, -2F, 8, 7, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F); // Box 19
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2.5F, 0F, -2.2F, 3, 2, 4, 0F, 0.1F, 0.2F, 0.2F, 0.1F, 0.4F, 0.2F, 0.1F, 0.4F, 0.2F, 0.1F, 0.2F, 0.2F, -1.9F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, -1.9F, 0.2F, 0.2F); // Box 27
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 0F, -2.2F, 3, 2, 4, 0F, 0.1F, 0.4F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.4F, 0.2F, 0.1F, 0.2F, 0.2F, -1.9F, 0.2F, 0.2F, -1.9F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F); // Box 28
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 10.5F, -2.5F, 2, 5, 5, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 1F, -0.6F, -0.55F, -1F, -0.2F, -0.55F, -1F, -0.2F, 0.25F, 1F, -0.6F, 0.25F); // Box 12
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2F, 10.5F, -2.5F, 2, 5, 5, 0F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -1F, -0.2F, -0.55F, 1F, -0.6F, -0.55F, 1F, -0.6F, 0.25F, -1F, -0.2F, 0.25F); // Box 16
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3F, 10.5F, -2.5F, 2, 5, 5, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 1F, -0.6F, 0.25F, -1F, -0.2F, 0.25F, -1F, -0.2F, -0.55F, 1F, -0.6F, -0.55F); // Box 31
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2F, 10.5F, -2.5F, 2, 5, 5, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, -1F, -0.2F, 0.25F, 1F, -0.6F, 0.25F, 1F, -0.6F, -0.55F, -1F, -0.2F, -0.55F); // Box 32
		bodyModel[8].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 21

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 20

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[3];
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 23
		leftLegModel[2] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 26

		leftLegModel[0].addShapeBox(-2F, 10.1F, -2.3F, 4, 2, 5, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 3F, -2F, 4, 4, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 23
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7F, -2F, 4, 3, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 26
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[3];
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, 10.1F, -2.3F, 4, 2, 5, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 3F, -2F, 4, 4, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7F, -2F, 4, 3, 4, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);


	}
}