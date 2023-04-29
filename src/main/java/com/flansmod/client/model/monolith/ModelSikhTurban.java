//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SikhTurban
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSikhTurban extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelSikhTurban() //Same as Filename
	{
		headModel = new ModelRendererTurbo[16];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 25
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 18
		headModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		headModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 21
		headModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 23
		headModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		headModel[8] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 14
		headModel[9] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 15
		headModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 20
		headModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 29
		headModel[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		headModel[13] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 19
		headModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 20
		headModel[15] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21

		headModel[0].addShapeBox(-4F, -2F, -4.7F, 4, 1, 1, 0F,0F, -1F, -0.3F, -1F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, 0F, -1F, -0.3F, -2.5F, -0.3F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, -2.5F, -0.3F, -0.3F); // Box 19
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -2F, -4.7F, 4, 1, 1, 0F,-1F, 0.5F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, -1F, 0.5F, -0.3F, 0.2F, -1F, -0.3F, -2.5F, -0.3F, -0.3F, -2.5F, -0.3F, -0.3F, 0.2F, -1F, -0.3F); // Box 25
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3F, -5F, -4F, 2, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 18
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(1F, -5F, -4F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 19
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -6F, -4.5F, 3, 1, 9, 0F,1F, -0.5F, 0F, 1F, 1F, 1.5F, 1F, -2F, 2F, 0.5F, -2F, 1F, -0.5F, 0.8F, -0.5F, 1F, -0.8F, 0.5F, 1F, 2.5F, 0F, -0.5F, 2F, 0F); // Box 20
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -7F, -4.5F, 3, 1, 9, 0F,0.2F, 2F, -1.5F, -0.5F, 5F, -1F, 0F, 3.3F, 1.5F, -0.5F, 1F, 1F, 1F, 0.5F, 0F, 1F, -1F, 1.5F, 1F, 2F, 2F, 0.5F, 2F, 1F); // Box 21
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(2F, -7F, -4.5F, 3, 1, 9, 0F,-0.5F, 5F, -1F, 0.2F, 2F, -1.5F, -0.5F, 1F, 1F, 0F, 3.3F, 1.5F, 1F, -1F, 1.5F, 1F, 0.5F, 0F, 0.5F, 2F, 1F, 1F, 2F, 2F); // Box 23
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(2F, -6F, -4.5F, 3, 1, 9, 0F,1F, 1F, 1.5F, 1F, -0.5F, 0F, 0.5F, -2F, 1F, 1F, -2F, 2F, 1F, -0.8F, 0.5F, -0.5F, 0.8F, -0.5F, -0.5F, 2F, 0F, 1F, 2.5F, 0F); // Box 24
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1F, -7F, -4.5F, 3, 1, 9, 0F,1.5F, 5F, -1F, 0.5F, 5F, -1F, 0F, 3.3F, 1.5F, 1F, 3.3F, 1.5F, 0F, -1F, 1.5F, -1F, -1F, 1.5F, -1F, 2F, 2F, 0F, 2F, 2F); // Box 14
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1F, -7F, -4.5F, 3, 1, 9, 0F,0F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, -3F, 2F, 0F, -3F, 2F, 0F, 0.2F, 0.5F, -1F, 0.2F, 0.5F, -1F, 3.5F, 0F, 0F, 3.5F, 0F); // Box 15
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -1F, -3.9F, 8, 1, 1, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.8F, 0.4F, 0F, 0.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 20
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, 0F, -3.9F, 8, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.5F, -2.8F, 0.5F, 0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, -0.5F); // Box 29
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.2F, -3F, -3.9F, 2, 2, 1, 0F,0.2F, 0F, 0.2F, -0.8F, -0.5F, 0.2F, -0.8F, -0.5F, 1.2F, 0.2F, 0F, 1.2F, 0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.8F, 0.2F, 0F, 0.8F); // Box 18
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -5F, -3.9F, 1, 2, 2, 0F,0.2F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, -0.7F, 0.5F, 0.2F, -0.7F, 0.5F, 0.2F, 0.4F, 0F, 0.2F); // Box 19
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(2.2F, -3F, -3.9F, 2, 2, 1, 0F,-0.8F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 1.2F, -0.8F, -0.5F, 1.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F); // Box 20
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3F, -5F, -3.9F, 1, 2, 2, 0F,-1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1F, 0F, 0.2F, -0.7F, 0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, -0.7F, 0.5F, 0.2F); // Box 21
		headModel[15].setRotationPoint(0F, 0F, 0F);
	}
}