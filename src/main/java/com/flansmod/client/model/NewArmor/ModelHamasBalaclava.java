//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: class
// Model Creator: 
// Created on: 02.04.2021 - 15:05:33
// Last changed on: 02.04.2021 - 15:05:33

package com.flansmod.client.model.NewArmor; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHamasBalaclava extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelHamasBalaclava() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];
		headModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import 
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		headModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import 
		headModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import 
		headModel[4] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import 
		headModel[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import 
		headModel[6] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import 
		headModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import 
		headModel[8] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import 
		headModel[9] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import 
		headModel[10] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import 
		headModel[11] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 0
		headModel[12] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 1
		headModel[13] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 2
		headModel[14] = new ModelRendererTurbo(this, 186, 15, textureX, textureY); // Box 3

		headModel[0].addShapeBox(-4F, -2F, -4F, 8, 2, 8, 0F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.1F, 0.01F, 0.01F, 0.1F, 0.01F, 0.01F, 0.1F, 0.01F, 0.01F, 0.1F, 0.01F); // Import 
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -3F, -4F, 3, 1, 1, 0F, -1.0F, -0.2F, 0.01F, 0.1F, 1.9428903E-16F, 0.01F, 0.1F, 1.9428903E-16F, 0.01F, -1.0F, -0.2F, 0.01F, -1.0F, 0.0F, 0.01F, 0.1F, 0.0F, 0.01F, 0.1F, 0.0F, 0.01F, -1.0F, 0.0F, 0.01F); // Import 
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-2F, -3F, -4F, 3, 1, 1, 0F, -1.1F, -2.7755576E-17F, 0.01F, 0.1F, 1.9428903E-16F, 0.01F, 0.1F, 1.9428903E-16F, 0.01F, -1.1F, -2.7755576E-17F, 0.01F, -1.1F, 0.0F, 0.01F, 0.1F, 0.0F, 0.01F, 0.1F, 0.0F, 0.01F, -1.1F, 0.0F, 0.01F); // Import 
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5F, -4F, 1, 3, 8, 0F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, -8.326673E-17F, 0.01F, 0.01F, 8.326673E-17F, 0.01F, 0.01F, 8.326673E-17F, 0.01F, 0.01F, -8.326673E-17F, 0.01F); // Import 
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -5F, -4F, 3, 1, 1, 0F, -1.0F, 0.0F, 0.01F, 0.1F, 0.0F, 0.01F, 0.1F, 0.0F, 0.01F, -1.0F, 0.0F, 0.01F, -1.0F, -0.1F, 0.01F, 0.1F, -0.2F, 0.01F, 0.1F, -0.2F, 0.01F, -1.0F, -0.1F, 0.01F); // Import 
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2F, -5F, -4F, 3, 1, 1, 0F, -1.1F, 0.0F, 0.01F, 0.1F, 0.0F, 0.01F, 0.1F, 0.0F, 0.01F, -1.1F, 0.0F, 0.01F, -1.1F, -0.2F, 0.01F, 0.1F, -0.2F, 0.01F, 0.1F, -0.2F, 0.01F, -1.1F, -0.2F, 0.01F); // Import 
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(1F, -3F, -4F, 3, 1, 1, 0F, -0.1F, 1.9428903E-16F, 0.01F, -1.0F, -0.2F, 0.01F, -1.0F, -0.2F, 0.01F, -0.1F, 1.9428903E-16F, 0.01F, -0.1F, 0.0F, 0.01F, -1.0F, 0.0F, 0.01F, -1.0F, 0.0F, 0.01F, -0.1F, 0.0F, 0.01F); // Import 
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(1F, -5F, -4F, 3, 1, 1, 0F, -0.1F, 0.0F, 0.01F, -1.0F, 0.0F, 0.01F, -1.1F, 0.0F, 0.01F, -0.1F, 0.0F, 0.01F, -0.1F, -0.2F, 0.01F, -1.0F, -0.1F, 0.01F, -1.0F, -0.1F, 0.01F, -0.1F, -0.2F, 0.01F); // Import 
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3F, -5F, -4F, 1, 3, 8, 0F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, -8.326673E-17F, 0.01F, 0.01F, 8.326673E-17F, 0.01F, 0.01F, 8.326673E-17F, 0.01F, 0.01F, -8.326673E-17F, 0.01F); // Import 
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F, 0.01F, 0.0F, 0.01F); // Import 
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-3F, -5F, 3F, 6, 3, 1, 0F, 0.0F, 0.0F, 0.01F, 0.0F, 0.0F, 0.01F, 0.0F, 0.0F, 0.01F, 0.0F, 0.0F, 0.01F, 0.0F, -8.326673E-17F, 0.01F, 0.0F, 8.326673E-17F, 0.01F, 0.0F, 8.326673E-17F, 0.01F, 0.0F, -8.326673E-17F, 0.01F); // Import 
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -7.5F, -4F, 8, 2, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, -2F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 1F, 0.1F, 0.1F, 1F, 0.1F); // Box 0
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.2F, -5.5F, 4F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, -1F, -1.5F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 2F, -1.5F, -1.5F, 2F, -1.5F); // Box 1
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-0.8F, -5.5F, 4F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, -1F, 1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 2F, -1.5F, 1F, 2F, -1.5F); // Box 2
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-17F, -15.5F, -4.1F, 34, 18, 1, 0F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F, -13.5F, -8.1F, 0.1F); // Box 3
		headModel[14].setRotationPoint(0F, 0F, 0F);


	}
}