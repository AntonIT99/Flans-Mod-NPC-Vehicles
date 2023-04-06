//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: OttomanHeavyInfantry
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOttomanHeavyInfantry extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelOttomanHeavyInfantry() //Same as Filename
	{
		headModel = new ModelRendererTurbo[21];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 20
		headModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 21
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 43
		headModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		headModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 45
		headModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 46
		headModel[9] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 47
		headModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		headModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 24
		headModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 18
		headModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 25
		headModel[14] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 31
		headModel[15] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 42
		headModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		headModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 22
		headModel[18] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 24
		headModel[19] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 25
		headModel[20] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 26

		headModel[0].addShapeBox(-4F, -11.3F, -4F, 8, 3, 8, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 22
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -6F, -4F, 1, 2, 8, 0F,0.9F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(3F, -6F, -4F, 1, 2, 8, 0F,0F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 20
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3F, -6F, -4F, 6, 2, 8, 0F,0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.2F, 0.9F, 0.9F, -0.2F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 21
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -12F, -0.5F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F); // Box 49
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -7F, -5F, 10, 1, 10, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 43
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -13F, -0.5F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 44
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -5F, -5.7F, 1, 1, 1, 0F,-0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F); // Box 45
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -7F, -5.7F, 1, 3, 1, 0F,-0.3F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F); // Box 46
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-0.5F, -5F, -5.7F, 1, 4, 1, 0F,-0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.3F, -0.5F, -0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, -0.3F, -0.1F, 0.1F, -0.3F); // Box 47
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -4.5F, -7.5F, 10, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 23
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -4.9F, -8.5F, 8, 1, 1, 0F,-3F, -0.3F, 0F, -3F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 24
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -7.5F, -6F, 2, 2, 1, 0F,0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 1.3F, -0.4F, -0.2F, 1.3F, -0.4F, -0.2F, 1.3F, -0.4F, -0.2F, 1.3F, -0.4F, -0.2F); // Box 25
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.85F, -5F, -4F, 1, 3, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F); // Box 31
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.85F, -5F, -4F, 1, 3, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F); // Box 42
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(3.85F, -2F, -4F, 1, 2, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F); // Box 21
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4.85F, -2F, -4F, 1, 2, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, -1.5F, -0.2F, 0F, -1.5F); // Box 22
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -4.5F, 4F, 8, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F); // Box 24
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -2.5F, 4.3F, 8, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.4F, 0.5F, -0.5F, -0.4F, 0.5F, -0.5F, 0.4F, 0.5F, -0.5F, 0.4F); // Box 25
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4F, -1F, 4.8F, 8, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, -0.7F, 0.5F, -0.5F, 0.7F, 0.5F, -0.5F, 0.7F); // Box 26
		headModel[20].setRotationPoint(0F, 0F, 0F);
	}
}