//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GorlatnayaBoyar
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGorlatnayaBoyar extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelGorlatnayaBoyar() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 29
		headModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 30
		headModel[3] = new ModelRendererTurbo(this, 1, 20, textureX, textureY); // Box 31
		headModel[4] = new ModelRendererTurbo(this, 25, 27, textureX, textureY); // Box 32
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		headModel[6] = new ModelRendererTurbo(this, 44, 13, textureX, textureY); // Box 20
		headModel[7] = new ModelRendererTurbo(this, 44, 19, textureX, textureY); // Box 29
		headModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 18
		headModel[10] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 16
		headModel[11] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 17
		headModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[14] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 20
		headModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		headModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16

		headModel[0].addShapeBox(-4F, -15.5F, -3.9F, 8, 11, 8, 0F,1.5F, 2.4F, 0.7F, 1.5F, 2.4F, 0.7F, 1.2F, 1.2F, 2.5F, 1.2F, 1.2F, 2.5F, 0.5F, -1.5F, 0.3F, 0.5F, -1.5F, 0.3F, 0.5F, -0.6F, 0.5F, 0.5F, -0.6F, 0.5F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7F, -2.9F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 29
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5.5F, -3F, -2.9F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -7F, 3.1F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 31
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5.5F, -3F, 3.6F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -2F, -4.7F, 4, 1, 1, 0F,0F, -1.5F, -0.3F, -1F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, -2.5F, 0F, -0.3F, 0.2F, -1F, -0.3F, 0.2F, -1F, -0.3F, -2.5F, 0F, -0.3F); // Box 19
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -1F, -3.9F, 8, 2, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 20
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, 1F, -3.9F, 8, 2, 2, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -1.3F, 0.5F, 0.5F, -1.3F, 0.5F, 0.5F, -1.5F, 0.9F, -0.8F, -1.5F, 0.9F, -0.8F); // Box 29
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.2F, -3F, -3.9F, 1, 2, 1, 0F,0.2F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, 0F, 1.2F, 0.2F, 0.5F, 1.2F, -0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, -0.2F, 0F, 0.8F); // Box 18
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3F, -5F, -4F, 2, 1, 1, 0F,0.4F, -0.6F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, -0.6F, 0.2F, 0.2F, 0.1F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.1F, 0.2F); // Box 18
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(1F, -5F, -4F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, 0.4F, -0.6F, 0.2F, 0.4F, -0.6F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0F, 0.2F); // Box 16
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -2F, -4.7F, 4, 1, 1, 0F,-1F, 0.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, -1F, 0.5F, -0.3F, 0.2F, -1F, -0.3F, -2.5F, 0F, -0.3F, -2.5F, 0F, -0.3F, 0.2F, -1F, -0.3F); // Box 17
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3.2F, -3F, -3.9F, 1, 2, 1, 0F,-0.5F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 1.2F, -0.5F, 0F, 1.2F, 0F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.8F, 0F, 0F, 0.8F); // Box 18
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3F, -7F, -2.9F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 19
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.5F, -3F, -2.9F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3.2F, -6.5F, -3.9F, 1, 2, 1, 0F,0.3F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0F, -0.5F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 1.2F, 0F, 0F, 1.2F); // Box 15
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.2F, -6.5F, -3.9F, 1, 2, 1, 0F,-0.2F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.8F, -0.2F, 0F, 0.8F, 0.2F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 1.2F, 0.2F, 0.5F, 1.2F); // Box 16
		headModel[16].setRotationPoint(0F, 0F, 0F);
	}
}