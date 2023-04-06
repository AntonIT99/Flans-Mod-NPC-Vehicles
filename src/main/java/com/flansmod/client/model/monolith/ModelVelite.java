//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WolfSkin
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelVelite extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelVelite() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 17
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 21
		headModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 22
		headModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		headModel[7] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 27
		headModel[8] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 28
		headModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		headModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 30
		headModel[11] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 31
		headModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 32
		headModel[13] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 33
		headModel[14] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 34

		headModel[0].addShapeBox(-3F, -11.5F, -7.5F, 6, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-1.5F, -8.5F, -10.5F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.5F, -12F, -4.5F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3F, -13.5F, -6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(1F, -13.5F, -6F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.5F, -10F, -0.5F, 7, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 22
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -8F, -3F, 8, 8, 7, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 1.1F, 0F, 0.5F, 1.1F, 0F, 0.5F, 1.1F, 0F, 1.1F, 1.1F, 0F, 1.1F); // Box 26
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3.5F, -8F, -4.5F, 7, 4, 4, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(2.75F, -1F, -4.1F, 2, 6, 2, 0F,0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, 5F, -1F, 0F); // Box 28
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.25F, -1F, -4F, 2, 6, 2, 0F,-0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -5.5F, -0.5F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, -5.5F, -0.5F, 0F); // Box 29
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, 0F, 2F, 10, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5F, 5F, 2F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 31
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1F, 7F, 3F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 32
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(2F, 6F, 2.8F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -2F, 0.5F, 0F); // Box 33
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, 6F, 2.8F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 2F, -0.5F, 0F); // Box 34
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}
}