//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ManchuNobleHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelManchuNobleHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelManchuNobleHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 5
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 7
		headModel[3] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 8
		headModel[4] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 9
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		headModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		headModel[7] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		headModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		headModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		headModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 12

		headModel[0].addShapeBox(-4F, -7.5F, -4F, 8, 3, 8, 0F,0.2F, 1.5F, 0.3F, 0.2F, 1.5F, 0.3F, 0.2F, 0.4F, 0.9F, 0.2F, 0.4F, 0.9F, 0.9F, -1.5F, 1.7F, 0.9F, -1.5F, 1.7F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -8F, -5F, 3, 3, 11, 0F,0.9F, 0F, 1.5F, -0.5F, 1F, 1.5F, -0.5F, -1.2F, 1F, 0.9F, -2F, 1F, -0.6F, 0F, 0.7F, 0F, -0.2F, 0.9F, 0F, 1.7F, -0.1F, -0.6F, 2F, -0.6F); // Box 5
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -13.5F, -4F, 8, 3, 8, 0F,-3.1F, -2.7F, -3.5F, -3.1F, -2.7F, -3.5F, -3.1F, -3F, -2.5F, -3.1F, -3F, -2.5F, 0.2F, 1.5F, 0.3F, 0.2F, 1.5F, 0.3F, 0.2F, 2.6F, 0.9F, 0.2F, 2.6F, 0.9F); // Box 7
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(2F, -8F, -5F, 3, 3, 11, 0F,-0.5F, 1F, 1.5F, 0.9F, 0F, 1.5F, 0.9F, -2F, 1F, -0.5F, -1.2F, 1F, 0F, -0.2F, 0.9F, -0.6F, 0F, 0.7F, -0.6F, 2F, -0.6F, 0F, 1.7F, -0.1F); // Box 8
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1.5F, -8F, -5F, 3, 3, 11, 0F,1F, 1F, 1.5F, 1F, 1F, 1.5F, 1F, -1.2F, 1F, 1F, -1.2F, 1F, 0.5F, -0.2F, 0.9F, 0.5F, -0.2F, 0.9F, 0.5F, 1.7F, -0.1F, 0.5F, 1.7F, -0.1F); // Box 9
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -11.5F, 0.1F, 1, 1, 1, 0F,0.4F, 0.6F, 0.4F, 0.4F, 0.6F, 0.4F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.5F, 0.4F, 0.4F, 0.6F, 0.4F, 0.4F, 0.6F, 0.4F, 0.4F, 0.3F, 0.4F, 0.4F, 0.3F); // Box 7
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -13F, 0.15F, 1, 1, 1, 0F,-0.2F, 0.2F, -0.4F, -0.2F, 0.2F, -0.4F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 8
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -11.5F, 1.1F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Box 9
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -9.5F, 6.1F, 1, 1, 9, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, -10.3F, 0F, 1F, -10.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1F, 9.7F, 0F, 1F, 9.7F, 0F); // Box 10
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-0.5F, 0.5F, 15.1F, 1, 1, 2, 0F,1F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 1F, -0.3F, 0F, 1F, -0.3F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F); // Box 11
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-10.5F, -17.6F, -7F, 21, 21, 1, 0F,-9F, -9F, -0.4F, -9F, -9F, -0.4F, -9F, -9F, 0F, -9F, -9F, 0F, -9F, -9F, -1F, -9F, -9F, -1F, -9F, -9F, 0F, -9F, -9F, 0F); // Box 12
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}
}