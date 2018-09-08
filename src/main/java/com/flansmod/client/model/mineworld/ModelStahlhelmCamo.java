//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: StahlhelmCamo
// Model Creator: 
// Created on: 19.04.2016 - 20:42:05
// Last changed on: 19.04.2016 - 20:42:05

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStahlhelmCamo extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelStahlhelmCamo() //Same as Filename
	{
		headModel = new ModelRendererTurbo[8];
		headModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import 702
		headModel[1] = new ModelRendererTurbo(this, 18, 39, textureX, textureY); // Import 704
		headModel[2] = new ModelRendererTurbo(this, 0, 9, textureX, textureY); // Import Box15
		headModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY); // Import Box16
		headModel[4] = new ModelRendererTurbo(this, 13, 26, textureX, textureY); // Import Box17
		headModel[5] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Import Box18
		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box19
		headModel[7] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Import Box20

		headModel[0].addShapeBox(-4.5F, -8F, -4.5F, 9, 2, 9, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import 702
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -5F, -4.5F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 1.3F, 0.4F, 0F, 1.3F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Import 704
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -9F, -4.5F, 9, 1, 9, 0F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box15
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addBox(-4.5F, -7F, -4.5F, 9, 2, 9, 0F); // Import Box16
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5.5F, -5F, -3.5F, 9, 3, 9, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 2F, 0F, -2F, 2F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box17
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3.5F, -4F, -4.5F, 1, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, 0F, 0F, -2.5F); // Import Box18
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Import Box19
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -4F, -4.5F, 1, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Import Box20
		headModel[7].setRotationPoint(0F, 0F, 0F);


	}
}