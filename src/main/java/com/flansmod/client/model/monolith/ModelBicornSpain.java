//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BicornSpain
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBicornSpain extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelBicornSpain() //Same as Filename
	{
		headModel = new ModelRendererTurbo[21];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 7
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 10
		headModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 11
		headModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 13
		headModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		headModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 18
		headModel[9] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 20
		headModel[10] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17
		headModel[11] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 18
		headModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		headModel[13] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 20
		headModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		headModel[15] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 22
		headModel[16] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 23
		headModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		headModel[18] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 25
		headModel[19] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 26
		headModel[20] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 20

		headModel[0].addShapeBox(-4F, -7F, -4F, 8, 3, 8, 0F,0.2F, 1.5F, 0F, 0.2F, 1.5F, 0F, 0.2F, 1F, 0.9F, 0.2F, 1F, 0.9F, 0.9F, -1.5F, 0.7F, 0.9F, -1.5F, 0.7F, 0.9F, -0.6F, 1F, 0.9F, -0.6F, 1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -13F, -4F, 8, 3, 8, 0F,-3.1F, -2.7F, -3.5F, -3.1F, -2.7F, -3.5F, -3.1F, -3F, -2.5F, -3.1F, -3F, -2.5F, 0.2F, 1.5F, 0F, 0.2F, 1.5F, 0F, 0.2F, 2F, 0.9F, 0.2F, 2F, 0.9F); // Box 7
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-6F, -11F, -5.5F, 1, 6, 1, 0F,-1F, -3F, -2.5F, 1.5F, -0.5F, -1F, 1.5F, -0.5F, 1F, -1.5F, -3F, 2.5F, 0F, 1F, -1.5F, 0.5F, 0.5F, 1.5F, 0.5F, 0.5F, -1F, -2F, 0.8F, 1.5F); // Box 9
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-8F, -7F, -4.5F, 2, 4, 1, 0F,0.5F, -1.5F, -5F, 1F, 1F, -1.5F, 1.5F, 1F, 1.5F, 0.5F, -1.5F, 5F, 2F, -0.5F, -5F, 0F, -1F, -0.5F, 2F, -1.2F, 0.5F, 2F, -0.5F, 5F); // Box 10
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-8F, -7F, 7.5F, 3, 4, 1, 0F,0.5F, -1.5F, 6F, 0F, 2.5F, 2F, 0F, 2.5F, -2F, 0.5F, -1.5F, -6F, 2F, -0.5F, 6F, 0F, 0F, 1F, 0F, 0F, -1F, 2F, -0.5F, -6F); // Box 11
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -8F, 7.5F, 5, 5, 1, 0F,0F, 1.5F, 2F, 0F, 2.5F, 2.5F, 0F, 3F, -2.5F, 0F, 1.5F, -2F, 0F, 0F, 1F, 0F, -0.2F, 1.5F, 0F, -0.2F, -0.5F, 0F, 0F, -1F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -5.5F, -8.5F, 5, 1, 15, 0F,-0.5F, 0.5F, -3.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2.5F, 0F, 0F, -1F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 13
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-9.5F, -5.5F, -0.5F, 3, 1, 7, 0F,-0.5F, -1F, -1F, 2F, 0F, 2.5F, 1F, 0F, -0.5F, -0.5F, -1F, -4.5F, 0.3F, 1F, -1F, 2F, 0F, 3F, 1.5F, 1.5F, 0F, 0.3F, 1F, -4.5F); // Box 14
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -11F, -5.5F, 5, 6, 1, 0F,-1.5F, -0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1.5F, -0.5F, 1F, -0.5F, 0.5F, 1.5F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, -0.5F, 0.5F, -1F); // Box 18
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(0F, -5.5F, -8.5F, 5, 1, 15, 0F,0F, 0F, -2F, -0.5F, 0.5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -2.5F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 20
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0F, -8F, 7.5F, 5, 5, 1, 0F,0F, 2.5F, 2.5F, 0F, 1.5F, 2F, 0F, 1.5F, -2F, 0F, 3F, -2.5F, 0F, -0.2F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.2F, -0.5F); // Box 17
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -11F, -5.5F, 5, 6, 1, 0F,0F, 0.5F, 0F, -1.5F, -0.5F, -1F, -1.5F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 2F, -0.5F, 0.5F, 1.5F, -0.5F, 0.5F, -1F, 0F, 0.5F, -2F); // Box 18
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(5F, -7F, 7.5F, 3, 4, 1, 0F,0F, 2.5F, 2F, 0.5F, -1.5F, 6F, 0.5F, -1.5F, -6F, 0F, 2.5F, -2F, 0F, 0F, 1F, 2F, -0.5F, 6F, 2F, -0.5F, -6F, 0F, 0F, -1F); // Box 19
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(6F, -7F, -4.5F, 2, 4, 1, 0F,1F, 1F, -1.5F, 0.5F, -1.5F, -5F, 0.5F, -1.5F, 5F, 1.5F, 1F, 1.5F, 0F, -1F, -0.5F, 2F, -0.5F, -5F, 2F, -0.5F, 5F, 2F, -1.2F, 0.5F); // Box 20
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(5F, -11F, -5.5F, 1, 6, 1, 0F,1.5F, -0.5F, -1F, -1F, -3F, -2.5F, -1.5F, -3F, 2.5F, 1.5F, -0.5F, 1F, 0.5F, 0.5F, 1.5F, 0F, 1F, -1.5F, -2F, 0.8F, 1.5F, 0.5F, 0.5F, -1F); // Box 21
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(6.5F, -5.5F, -0.5F, 3, 1, 7, 0F,2F, 0F, 2.5F, -0.5F, -1F, -1F, -0.5F, -1F, -4.5F, 1F, 0F, -0.5F, 2F, 0F, 3F, 0.3F, 1F, -1F, 0.3F, 1F, -4.5F, 1.5F, 1.5F, 0F); // Box 22
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(1.5F, -9F, -6F, 5, 1, 1, 0F,0F, 0F, 0.3F, -2F, 0F, -0.3F, -2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(1.5F, -8F, -6F, 5, 2, 1, 0F,0F, 0F, 0.5F, -2F, 0F, -0.1F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0.7F, -3F, -1F, 0.1F, -3F, -1F, 0F, -1F, -1F, 0F); // Box 24
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(1.5F, -10F, -6F, 5, 2, 1, 0F,-1F, 0F, 0F, -3F, 0F, -0.3F, -3F, 0F, 0.3F, -1F, 0F, 0F, 0F, -1F, 0.3F, -2F, -1F, -0.3F, -2F, -1F, 0.2F, 0F, -1F, 0F); // Box 25
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(2.5F, -9.5F, -6.5F, 1, 4, 1, 0F,-0.8F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 26
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3F, -15.5F, -6F, 1, 6, 1, 0F,-0.5F, 0.5F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, 1F, -0.5F, 0.5F, 1F, -0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F); // Box 20
		headModel[20].setRotationPoint(0F, 0F, 0F);
	}
}