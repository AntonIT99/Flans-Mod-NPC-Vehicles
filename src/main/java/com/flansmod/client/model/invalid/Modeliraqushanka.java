//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: iraqwoodland
// Model Creator: 
// Created on: 02.05.2021 - 12:22:29
// Last changed on: 02.05.2021 - 12:22:29

package com.flansmod.client.model.invalid; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modeliraqushanka extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public Modeliraqushanka() //Same as Filename
	{
		headModel = new ModelRendererTurbo[10];
		headModel[0] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import Box3
		headModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import Box102
		headModel[2] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import Box103
		headModel[3] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Import Box104
		headModel[4] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import Box105
		headModel[5] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Import Box109
		headModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box111
		headModel[7] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Import Box112
		headModel[8] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Import Box113
		headModel[9] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box114

		headModel[0].addShapeBox(-4F, -8.1F, -4F, 8, 4, 7, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Import Box3
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -8.3F, -4.75F, 9, 4, 1, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box102
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -8.3F, 3.7F, 9, 4, 1, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Import Box103
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -8.3F, -3.5F, 4, 4, 7, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box104
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0.5F, -8.3F, -3.5F, 4, 4, 7, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box105
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -8.3F, -4.75F, 9, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F); // Import Box109
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(0.5F, -9.3F, -3.5F, 4, 1, 7, 0F, -0.2F, -0.7F, -1.25F, -1F, -0.7F, -0.5F, -1F, -0.7F, -0.5F, -0.2F, -0.7F, -1.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box111
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -9.3F, -3.5F, 4, 1, 7, 0F, -1F, -0.7F, -0.5F, -0.2F, -0.7F, -1.25F, -0.2F, -0.7F, -1.25F, -1F, -0.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box112
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -8.3F, 3.7F, 9, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F); // Import Box113
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -8.1F, 3.1F, 8, 4, 1, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Import Box114
		headModel[9].setRotationPoint(0F, 0F, 0F);


	}
}