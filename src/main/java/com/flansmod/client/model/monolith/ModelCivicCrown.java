//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CivicCrown
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCivicCrown extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelCivicCrown() //Same as Filename
	{
		headModel = new ModelRendererTurbo[20];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 21
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 23
		headModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24
		headModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 25
		headModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 26
		headModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 27
		headModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 28
		headModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 29
		headModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 30
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 31
		headModel[12] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 32
		headModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 33
		headModel[14] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 34
		headModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 35
		headModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 36
		headModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 37
		headModel[18] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 38
		headModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39

		headModel[0].addShapeBox(-1.5F, -6.1F, -2F, 3, 1, 2, 0F,3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F, 3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F); // Box 20
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-1.5F, -5.7F, -1F, 3, 1, 2, 0F,3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F, 3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F); // Box 21
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1.5F, -5.5F, 0F, 3, 1, 2, 0F,3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F, 3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1.5F, -5.3F, 1F, 3, 1, 2, 0F,3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F, 3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F); // Box 23
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(3.5F, -5.3F, 2F, 1, 1, 2, 0F,0.6F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.6F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 24
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1.5F, -6.5F, -3F, 3, 1, 2, 0F,3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F, 3.6F, 0.5F, 0.2F, 3.5F, 0.5F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F); // Box 25
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -6.9F, -4F, 1, 1, 2, 0F,0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 26
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -5.1F, 2F, 1, 1, 2, 0F,0.6F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.6F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 27
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3.5F, -7F, -4F, 1, 1, 2, 0F,0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 28
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(2.5F, -5.1F, 3.2F, 2, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.6F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.6F, 0.2F, 0.2F, 0F); // Box 29
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(1.5F, -5F, 3.3F, 2, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.6F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.6F, 0.2F, 0.2F, 0F); // Box 30
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0.5F, -4.8F, 3.4F, 2, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.6F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.6F, 0.2F, 0.2F, 0F); // Box 31
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -4.6F, 3.5F, 2, 1, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.6F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.6F, 0.2F, 0.2F, 0F); // Box 32
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1.5F, -4.6F, 3.5F, 2, 1, 1, 0F,0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.6F); // Box 33
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-2.5F, -4.8F, 3.4F, 2, 1, 1, 0F,0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.6F); // Box 34
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-3.5F, -5F, 3.3F, 2, 1, 1, 0F,0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.6F); // Box 35
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.2F, -7.2F, -4.5F, 1, 1, 2, 0F,0.2F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 36
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-3.6F, -7.6F, -5F, 1, 1, 2, 0F,0.2F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 37
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(3.2F, -7.2F, -4.5F, 1, 1, 2, 0F,0.5F, 0.7F, 0.2F, 0.2F, 0.7F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 38
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(2.8F, -7.6F, -5F, 1, 1, 2, 0F,0.5F, 0.7F, 0.2F, 0.2F, 0.7F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 39
		headModel[19].setRotationPoint(0F, 0F, 0F);
	}
}