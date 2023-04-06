//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Mempo
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMempo extends ModelCustomArmour //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelMempo() //Same as Filename
	{
		headModel = new ModelRendererTurbo[13];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 51
		headModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52
		headModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 53
		headModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 54
		headModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 55
		headModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
		headModel[7] = new ModelRendererTurbo(this, 2, 25, textureX, textureY); // Box 57
		headModel[8] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 58
		headModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 59
		headModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 60
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
		headModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 62

		headModel[0].addShapeBox(-4F, -3F, -4.7F, 3, 1, 2, 0F,0.4F, 0.1F, 0F, 0F, -0.2F, -0.1F, 0F, 0.3F, 0.8F, 0.8F, 0.6F, 0.8F, 0.2F, 0F, 0.6F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0.6F); // Box 50
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-0.5F, -3.7F, -4.9F, 1, 2, 1, 0F,-0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.5F, 0.7F, 0.2F, -0.5F, 0.7F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 51
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1.5F, -3.4F, -4.9F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0.3F, -0.1F, 0F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 52
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -2.4F, -4.9F, 2, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 53
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -2.4F, -4.9F, 2, 1, 1, 0F,-0.3F, 0F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, 0F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F); // Box 54
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -2F, -4.5F, 3, 2, 2, 0F,0.1F, 0.1F, 0F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0F, 0.6F, 0.2F, 0.3F, 0F, 0.1F, 0F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0F, 0.4F, 0.1F, 0F); // Box 55
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -1.5F, -4.7F, 1, 2, 2, 0F,0.8F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.8F, -0.4F, 0F, 0.3F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.3F, 0F, 0F); // Box 56
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -3F, -2F, 8, 1, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F); // Box 57
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1F, -2.4F, -4.9F, 2, 1, 1, 0F,0F, -0.3F, 0F, -0.3F, 0F, 0.3F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0.3F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 58
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(1F, -3F, -4.7F, 3, 1, 2, 0F,0F, -0.2F, -0.1F, 0.4F, 0.1F, 0F, 0.8F, 0.6F, 0.8F, 0F, 0.3F, 0.8F, 0F, 0.2F, 0F, 0.2F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0F, 0F, 0F); // Box 59
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(1F, -2F, -4.5F, 3, 2, 2, 0F,-0.8F, 0F, 0.1F, 0.1F, 0.1F, 0F, 0.6F, 0.2F, 0.3F, -0.8F, 0F, 0F, -0.2F, 0.3F, 0.2F, 0F, 0.1F, 0F, 0.4F, 0.1F, 0F, -0.2F, 0.3F, 0F); // Box 60
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -1.5F, -4.7F, 1, 2, 2, 0F,0F, -0.2F, 0F, 0.8F, -0.4F, 0F, 0.8F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 61
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(0.5F, -3.4F, -4.9F, 1, 1, 1, 0F,0.2F, -0.1F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, 0F, 0.2F, -0.1F, 0F, -0.1F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0.6F, 0F, 0F, 0.6F, 0F); // Box 62
		headModel[12].setRotationPoint(0F, 0F, 0F);
	}
}