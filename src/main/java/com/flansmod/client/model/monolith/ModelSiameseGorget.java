//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SiameseGorget
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSiameseGorget extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelSiameseGorget() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 141
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 142
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 143
		bodyModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 144
		bodyModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 148
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 149
		bodyModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 150
		bodyModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 151
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 152
		bodyModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 153

		bodyModel[0].addShapeBox(-2F, 6F, -3.5F, 4, 2, 1, 0F,1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.8F, 0F, -0.5F, -1.8F, 0F, -0.5F, -1.8F, 0F, 0.5F, -1.8F, 0F, 0.5F); // Box 141
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.5F, 3.5F, -3.5F, 7, 2, 1, 0F,1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 142
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-6F, 1F, -3.5F, 12, 2, 1, 0F,0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 143
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-6F, -1F, -3.3F, 3, 2, 3, 0F,1.5F, -0.5F, -0.5F, 0F, -0.8F, -0.5F, -0.5F, 0F, 0.3F, 2F, 0.5F, 0.3F, 0.5F, 0.5F, 0F, 2F, 0.5F, 0F, 1F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F); // Box 144
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(3F, -1F, -3.3F, 3, 2, 3, 0F,0F, -0.8F, -0.5F, 1.5F, -0.5F, -0.5F, 2F, 0.5F, 0.3F, -0.5F, 0F, 0.3F, 2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.3F, 1F, 0.5F, 0.3F); // Box 148
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-6F, 1F, 2.5F, 12, 2, 1, 0F,0.5F, -0.5F, 0.2F, 0.5F, -0.5F, 0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-6F, -1F, 0.3F, 3, 2, 3, 0F,2F, 0.5F, 0.3F, -0.5F, 0F, 0.3F, 0F, -0.8F, -0.5F, 1.5F, -0.5F, -0.5F, 0.5F, 0.5F, 0.3F, 1F, 0.5F, 0.3F, 2F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 150
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(3F, -1F, 0.3F, 3, 2, 3, 0F,-0.5F, 0F, 0.3F, 2F, 0.5F, 0.3F, 1.5F, -0.5F, -0.5F, 0F, -0.8F, -0.5F, 1F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0F, 2F, 0.5F, 0F); // Box 151
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 3.5F, 2.5F, 7, 2, 1, 0F,1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 152
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2F, 6F, 2.5F, 4, 2, 1, 0F,1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.8F, 0F, 0.5F, -1.8F, 0F, 0.5F, -1.8F, 0F, -0.5F, -1.8F, 0F, -0.5F); // Box 153
		bodyModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11

		leftArmModel[0].addShapeBox(-1F, 3.5F, -2F, 4, 5, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0F, 0.8F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 11
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 35

		rightArmModel[0].addShapeBox(-3F, 3.5F, -2F, 4, 5, 4, 0F,0.8F, 0.5F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0.5F, 0.8F, 0.3F, 0F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0.3F); // Box 35
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}
}