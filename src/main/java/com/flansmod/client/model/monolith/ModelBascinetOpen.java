//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bascinet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBascinetOpen extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelBascinetOpen() //Same as Filename
	{
		headModel = new ModelRendererTurbo[20];
		headModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		headModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 21
		headModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 23
		headModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		headModel[7] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 27
		headModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 31
		headModel[9] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 32
		headModel[10] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 33
		headModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 34
		headModel[12] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 35
		headModel[13] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 36
		headModel[14] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		headModel[15] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 25
		headModel[16] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 26
		headModel[17] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 27
		headModel[18] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 28
		headModel[19] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 29

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5F, -4F, 1, 5, 6, 0F, 0.5F, 0F, 1F, -1.2F, 0F, 1F, -1.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, -3F, -1.2F, 0.5F, -3F, -1.2F, 0.2F, 1F, 0.5F, 0.2F, 1F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5F, 3F, 8, 5, 1, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 20
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(4.7F, -5F, -4F, 1, 5, 6, 0F, 0.5F, 0F, 1F, -1.2F, 0F, 1F, -1.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, -3F, -1.2F, 0.5F, -3F, -1.2F, 0.2F, 1F, 0.5F, 0.2F, 1F); // Box 21
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F, -1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3F, -10.8F, -3F, 6, 1, 7, 0F, -2.8F, 0.75F, -6.2F, -2.8F, 0.75F, -6.2F, -2.8F, 0.75F, -0.5F, -2.8F, 0.75F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -5.5F, -7.5F, 4, 2, 1, 0F, 0F, 0.7F, 0F, 0F, 1.5F, 5F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0.5F, -1F, 0F, 0F, -1F, 1.5F, 0F, -1F, -1.5F, 1F, -1F, -0.5F); // Box 24
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -8.5F, -7.5F, 4, 3, 1, 0F, 0.5F, 0F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, 1.5F, 0.7F, 0F, 1.5F, 0F, -0.7F, 0F, 0F, -1.5F, 5F, 0F, -0.7F, 0F, 1F, -0.5F, 0F); // Box 27
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5.2F, -4.5F, -7F, 1, 2, 4, 0F, -0.2F, 1.5F, -0.5F, -0.2F, 1.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -1F, -1F, -0.2F, -1F, -1F); // Box 31
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.2F, -6.5F, -2F, 1, 1, 2, 0F, -0.5F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.5F, 0.5F, -0.8F, -0.5F, -1F, 1F, -0.2F, -1F, 1F, -0.2F, -0.5F, -1.2F, -0.5F, -0.5F, -1.2F); // Box 32
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5.2F, -8.5F, -6F, 1, 3, 4, 0F, -0.5F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, -1F, 0.3F, -0.5F, -1F, 0.3F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0.5F, -1.5F, -0.2F, 0.5F, -1.5F); // Box 33
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0.5F, -8.5F, -9.3F, 3, 1, 1, 0F, 0F, -0.3F, -0.6F, -0.2F, -0.6F, -2.1F, -0.2F, -0.6F, 1.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, 0F, -2F, -0.3F, 0F, 1.5F, 0F, -0.3F, 0F); // Box 34
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, -8.5F, -9.8F, 2, 1, 1, 0F, -0.2F, -0.6F, -2.1F, -0.8F, -0.3F, -1.2F, -0.8F, -0.3F, 0.4F, -0.2F, -0.6F, 1.5F, -0.3F, 0F, -2F, -0.8F, -0.3F, -0.9F, -0.8F, -0.3F, 0.5F, -0.3F, 0F, 1.5F); // Box 35
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-2.5F, -8.5F, -9.8F, 2, 1, 1, 0F, -0.2F, -0.3F, -1.4F, -0.2F, -0.3F, -1.1F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.4F, -0.2F, -0.3F, -0.9F, -0.3F, -0.3F, -0.7F, -0.3F, -0.3F, 0.5F, -0.2F, -0.3F, 0.5F); // Box 36
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -5.5F, -7.5F, 4, 2, 1, 0F, 0F, 1.5F, 5F, 0F, 0.7F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 1.5F, 0.5F, -1F, 0F, 1F, -1F, -0.5F, 0F, -1F, -1.5F); // Box 24
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4.2F, -4.5F, -7F, 1, 2, 4, 0F, -0.2F, 1.5F, -0.5F, -0.2F, 1.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, 0.5F, -0.5F, -0.2F, -2F, 0F, -0.2F, -2F, 0F, -0.2F, -1F, -1F, -0.2F, -1F, -1F); // Box 25
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(0F, -8.5F, -7.5F, 4, 3, 1, 0F, 0F, 0.1F, -2F, 0.5F, 0F, -2F, 0.7F, 0F, 1.5F, 0F, 0.1F, 1.5F, 0F, -1.5F, 5F, 0F, -0.7F, 0F, 1F, -0.5F, 0F, 0F, -0.7F, 0F); // Box 26
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(4.2F, -8.5F, -6F, 1, 3, 4, 0F, -0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -1F, 0.3F, -0.2F, -1F, 0.3F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0.5F, -1.5F, -0.2F, 0.5F, -1.5F); // Box 27
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1.2F, -6F, -1.7F, 1, 1, 2, 0F, -0.5F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.5F, 0.5F, -0.8F, -0.5F, -1F, 1F, -0.2F, -1F, 1F, -0.2F, -0.5F, -1.2F, -0.5F, -0.5F, -1.2F); // Box 28
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(4.2F, -6.5F, -2F, 1, 1, 2, 0F, -0.2F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 0.5F, -0.8F, -0.2F, 0.5F, -0.8F, -0.2F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -0.5F, -1.2F, -0.2F, -0.5F, -1.2F); // Box 29
		headModel[19].setRotationPoint(0F, 0F, 0F);


	}
}