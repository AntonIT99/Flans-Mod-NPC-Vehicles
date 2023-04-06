//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GorlatnayaRynda
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGorlatnayaRynda extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelGorlatnayaRynda() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 29
		headModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 30
		headModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		headModel[4] = new ModelRendererTurbo(this, 25, 27, textureX, textureY); // Box 32
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 33
		headModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 34

		headModel[0].addShapeBox(-4F, -15.5F, -3.9F, 8, 11, 8, 0F,1.5F, 2.4F, 0.7F, 1.5F, 2.4F, 0.7F, 1.2F, 1.2F, 2.5F, 1.2F, 1.2F, 2.5F, 0.5F, -1.5F, 0.3F, 0.5F, -1.5F, 0.3F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7F, -2.9F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 29
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-6F, -3F, -2.9F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7F, 3.1F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 31
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-6F, -3F, 4.1F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3F, -7F, -2.9F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 33
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4F, -3F, -2.9F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}
}