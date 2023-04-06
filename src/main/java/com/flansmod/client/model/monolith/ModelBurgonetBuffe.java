//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Burgonet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBurgonetBuffe extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelBurgonetBuffe() //Same as Filename
	{
		headModel = new ModelRendererTurbo[22];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		headModel[2] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		headModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 17
		headModel[5] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 19
		headModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		headModel[7] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 23
		headModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		headModel[9] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 25
		headModel[10] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 26
		headModel[11] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 27
		headModel[12] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 28
		headModel[13] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 29
		headModel[14] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 31
		headModel[15] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 19
		headModel[16] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 20
		headModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 86
		headModel[18] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 23
		headModel[19] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 24
		headModel[20] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 18
		headModel[21] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 90

		headModel[0].addShapeBox(-3.5F, -8F, -3.5F, 7, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.2F, 0.5F, -0.5F, 1.2F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(4.2F, -4F, 1F, 2, 4, 3, 0F,0.5F, 0F, 2.5F, -1.3F, 0F, 2.5F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -1.2F, 0F, 1F, -1.6F, 0F, 0F, 0.5F, 0F, 0F); // Box 21
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -9.8F, -3F, 9, 1, 8, 0F,-1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -1.5F, -1F, 0F, -1.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-2.5F, -7F, -5F, 5, 3, 10, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F); // Box 19
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4.5F, -4.5F, 3.8F, 9, 4, 2, 0F,0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, -1F, -1F, 0.5F, -1F, -1F); // Box 17
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -4F, 1F, 2, 4, 3, 0F,0.4F, 0F, 2.5F, -1.2F, 0F, 2.5F, -1.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, -1.2F, 0F, 1F, -1.2F, 0F, 0F, 0F, 0F, 0F); // Box 19
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(3.5F, -7F, -5F, 1, 3, 3, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.3F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F); // Box 21
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3.5F, -8F, -3.5F, 1, 2, 3, 0F,0.2F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -0.5F, 0.2F, 0.3F, 0F, 0.5F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0.7F); // Box 23
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3.5F, -7F, -1F, 1, 3, 6, 0F,0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F); // Box 24
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3.5F, -8F, 1F, 1, 2, 4, 0F,0.2F, 0.3F, 0.3F, 0.05F, 0.3F, 2F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 2F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F); // Box 25
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.5F, -8F, -3.5F, 1, 2, 3, 0F,0F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0F, 0F, 0.3F, -0.5F, 0F, -0.5F, 1.5F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, -0.5F); // Box 26
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -8F, 1F, 1, 2, 4, 0F,0.05F, 0.3F, 2F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.5F, -0.5F, 2F, 0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F); // Box 27
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.5F, -7F, -1F, 1, 3, 6, 0F,0.5F, -0.5F, 0.3F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F); // Box 28
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.5F, -7F, -5F, 1, 3, 3, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F, 0F, -0.5F, 0.3F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F); // Box 29
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, 0F, 1F, 10, 2, 4, 0F,-0.5F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F); // Box 31
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -11.8F, -4F, 1, 1, 9, 0F,-0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0F, -2.2F, -0.2F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F); // Box 19
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -10F, -4F, 1, 4, 10, 0F,-0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, -0.9F, -0.2F, 0.3F, -0.9F, -0.2F, -0.5F, 0.7F, -0.2F, -0.5F, 0.7F, -0.2F, -2.5F, 0.7F, -0.2F, -2.5F, 0.7F); // Box 20
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -9F, 3F, 1, 5, 3, 0F,-0.2F, -0.5F, 0.7F, -0.2F, -0.5F, 0.7F, -0.2F, -0.5F, 0.7F, -0.2F, -0.5F, 0.7F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, -0.1F, -0.2F, 0.3F, -0.1F); // Box 86
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5F, -4.5F, -7F, 10, 1, 4, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 1.5F, -0.2F, 0F, 1.5F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.4F, 1.5F, 0F, -0.4F, 1.5F); // Box 23
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -4.9F, -8F, 8, 1, 1, 0F,-3F, -0.3F, 0F, -3F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 24
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-5F, -3.5F, -3.7F, 10, 3, 4, 0F,-0.4F, 0F, 2.3F, -0.4F, 0F, 2.3F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.1F, 1.5F, 0.5F, -1.1F, 1.5F, 0.5F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F); // Box 18
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4F, 0.5F, -4F, 8, 2, 2, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 1F, 2F, -0.5F, 1F, 2F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F); // Box 90
		headModel[21].setRotationPoint(0F, 0F, 0F);
	}
}