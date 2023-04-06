//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PolishBurgonet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPolishBurgonet extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPolishBurgonet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[19];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		headModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 40
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 41
		headModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 42
		headModel[7] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 43
		headModel[8] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 44
		headModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 45
		headModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 24
		headModel[11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 25
		headModel[12] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 26
		headModel[13] = new ModelRendererTurbo(this, 46, 40, textureX, textureY); // Box 91
		headModel[14] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		headModel[15] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 51
		headModel[16] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 52
		headModel[17] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 53
		headModel[18] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 54

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -6.5F, -4F, 8, 2, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0.4F, 0.7F, 0.7F, 0.4F, 0.7F); // Box 28
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -11.3F, -4F, 8, 2, 8, 0F,-2.5F, -0.4F, -2.5F, -2.5F, -0.4F, -2.5F, -2.5F, -0.4F, -2.5F, -2.5F, -0.4F, -2.5F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -9.5F, -5.5F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F); // Box 26
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -7.5F, -5.5F, 1, 3, 1, 0F,0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 40
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -5.5F, -8.5F, 5, 1, 4, 0F,-1F, -0.7F, -1F, 0F, -0.5F, 0.4F, 0F, 1F, 0F, 0F, -0.2F, 0F, -1F, 0F, -1F, 0F, 0.2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5.5F, -5.5F, -4F, 1, 1, 8, 0F,-0.5F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 42
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5.5F, -4.5F, -4F, 1, 3, 8, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F); // Box 43
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5.5F, -2.5F, -4F, 1, 2, 8, 0F,-0.1F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.2F, 0F, -3.8F, -0.2F, 0F, -3.8F, -0.2F, 0F, -3.8F, -0.2F, 0F, -3.8F); // Box 44
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.2F, -6F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -5.5F, 2.7F, 8, 2, 2, 0F,0.7F, 0F, 1.5F, 0.7F, 0F, 1.5F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.7F, 0.7F, 0F, -0.7F, 0.7F, 0F, 0.2F, 0.7F, 0F, 0.2F); // Box 24
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -3.5F, 4F, 8, 2, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, -0.5F, -1.4F, 0.3F, -0.5F, -1.4F, 0.3F, -0.5F, 1.2F, 0.3F, -0.5F, 1.2F); // Box 25
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, -2F, 5.5F, 7, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.7F, -2F, 0F, -0.7F, -2F, 0F, -0.5F, 1.7F, 0F, -0.5F, 1.7F); // Box 26
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -5F, -3.4F, 8, 5, 1, 0F,0.2F, 0.3F, -4.2F, 0.2F, 0.3F, -4.2F, 0.2F, 0.3F, 3.8F, 0.2F, 0.3F, 3.8F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F); // Box 91
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -5.5F, -8.5F, 5, 1, 4, 0F,0F, -0.5F, 0.4F, -1F, -0.7F, -1F, 0F, -0.2F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4.2F, -6F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(4.5F, -5.5F, -4F, 1, 1, 8, 0F,-0.2F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 52
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(4.5F, -4.5F, -4F, 1, 3, 8, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F); // Box 53
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4.5F, -2.5F, -4F, 1, 2, 8, 0F,-0.3F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.1F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.2F, 0F, -3.8F, -0.2F, 0F, -3.8F, -0.2F, 0F, -3.8F, -0.2F, 0F, -3.8F); // Box 54
		headModel[18].setRotationPoint(0F, 0F, 0F);
	}
}