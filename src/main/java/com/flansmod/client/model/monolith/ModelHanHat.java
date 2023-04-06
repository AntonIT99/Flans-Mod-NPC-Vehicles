//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: HanHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHanHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelHanHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		headModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 22
		headModel[4] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 23
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 24
		headModel[6] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 25

		headModel[0].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 19
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F); // Box 20
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8.4F, -4F, 8, 1, 8, 0F,-0.85F, 0.2F, -0.9F, -0.85F, 0.2F, -0.9F, -0.85F, 0.2F, -0.85F, -0.85F, 0.2F, -0.85F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, 0.15F); // Box 21
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -8F, 0F, 9, 6, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 22
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, -10F, -2F, 9, 2, 6, 0F,-0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 23
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -8F, -2.5F, 9, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -4F, -3.5F, 9, 4, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 25
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}
}