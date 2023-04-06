//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RusWW1Hat
// Model Creator: 
// Created on: 22.07.2020 - 16:11:09
// Last changed on: 22.07.2020 - 16:11:09

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRusWW1Hat extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelRusWW1Hat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[10];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box28
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box30
		headModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box32
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box33
		headModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 6
		headModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 7
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		headModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 9
		headModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 10
		headModel[9] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 11

		headModel[0].addShapeBox(-3.5F, -7.5F, -4.5F, 7, 2, 9, 0F,0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2.7F, 0F, 0F, 2.7F, 0F); // Import Box28
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2F, -5.5F, -6.5F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box30
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(2F, -5.5F, -6.5F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, -0.4F, -1.5F, 0.3F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.3F, -1.5F, 0.3F, 0F, 0F, 0F, -0.75F, 0F); // Import Box32
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-2.5F, -9.5F, -4.5F, 5, 4, 9, 0F,0F, 1.3F, 2.5F, 0F, 1.3F, 2.5F, 0F, -1.2F, 2.5F, 0F, -1.2F, 2.5F, 0.8F, -2F, 1F, 0.8F, -2F, 1F, 0F, 1F, 1F, 0F, 1F, 1F); // Import Box33
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(3.5F, -7.5F, -4.5F, 1, 2, 9, 0F,0F, 1F, 0.2F, 0.2F, -0.3F, -1.2F, 0.2F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0.2F, -1F, -0.1F, 2F, -1F, 0F, 2.7F, 0F); // Box 6
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(2.5F, -9.5F, -4.5F, 3, 4, 9, 0F,0F, 1.3F, 2.5F, 1F, -1.2F, -0.5F, 1F, -2.2F, 0.2F, 0F, -1.2F, 2.5F, -0.8F, -2F, 1F, -0.4F, -1.5F, -0.8F, -0.7F, 0F, -0.3F, 0F, 1F, 1F); // Box 7
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -7.1F, -5.2F, 1, 1, 1, 0F,0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F); // Box 8
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5.5F, -9.5F, -4.5F, 3, 4, 9, 0F,1F, -1.2F, -0.5F, 0F, 1.3F, 2.5F, 0F, -1.2F, 2.5F, 1F, -2.7F, 0.2F, -0.4F, -1.5F, -0.8F, -0.8F, -2F, 1F, 0F, 1F, 1F, -0.7F, 0F, -0.3F); // Box 9
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -7.5F, -4.5F, 1, 2, 9, 0F,0.2F, -0.3F, -1.2F, 0F, 1F, 0.2F, 0F, 0F, 0.5F, 0.2F, -1F, -0.5F, -0.1F, 0.2F, -1F, 0F, 0F, 0.5F, 0F, 2.7F, 0F, -0.1F, 2F, -1F); // Box 10
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -5.5F, -6.5F, 2, 1, 6, 0F,0F, -0.4F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.3F, 0.25F, 0F, 0F, -0.3F, -1.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.3F, 0F, 0F); // Box 11
		headModel[9].setRotationPoint(0F, 0F, 0F);
	}
}