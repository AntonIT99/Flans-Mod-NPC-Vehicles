//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: fourMirrors
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFourMirrors extends ModelCustomArmour //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelFourMirrors() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 83
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 84
		bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 85
		bodyModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 86
		bodyModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 87
		bodyModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 88
		bodyModel[7] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 89
		bodyModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 90
		bodyModel[9] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 91
		bodyModel[10] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 92
		bodyModel[11] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 93
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 94
		bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 95
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 96
		bodyModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 97
		bodyModel[16] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 98
		bodyModel[17] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 99
		bodyModel[18] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 100
		bodyModel[19] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 101

		bodyModel[0].addShapeBox(-2F, 4.6F, -3F, 4, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 84
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2F, 3F, -3F, 4, 1, 1, 0F,-1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 83
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2F, 6.2F, -3F, 4, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F); // Box 84
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-5F, 5.4F, -2F, 1, 1, 4, 0F,0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F); // Box 85
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-5.1F, 3.8F, -2F, 1, 1, 4, 0F,0.1F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0.1F, 0F, -1.3F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F); // Box 86
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.9F, 7F, -2F, 1, 1, 4, 0F,0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0.1F, 0.3F, -0.1F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0.1F, 0F, -1.3F); // Box 87
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5F, 4F, -2.5F, 5, 1, 1, 0F,-0.6F, -2.3F, 0F, 0F, 0.7F, 0F, -0.7F, 0.8F, 0F, -0.1F, -2.7F, 0F, -0.7F, 1.7F, 0F, 0F, -1.2F, 0F, 0F, -1.5F, 0F, -0.3F, 2.2F, 0F); // Box 88
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-5F, 5.5F, -2.4F, 5, 1, 1, 0F,-0.6F, 0.5F, 0F, 0F, 0.2F, 0F, -0.7F, 0.3F, 0F, -0.1F, 0.6F, 0F, -0.7F, -1.1F, 0F, 0F, -0.7F, 0F, 0F, -1F, 0F, -0.3F, -1.1F, 0F); // Box 89
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 4F, -2.5F, 5, 1, 1, 0F,0F, 0.7F, 0F, -0.6F, -2.3F, 0F, -0.1F, -2.7F, 0F, -0.7F, 0.8F, 0F, 0F, -1.2F, 0F, -0.7F, 1.7F, 0F, -0.3F, 2.2F, 0F, 0F, -1.5F, 0F); // Box 90
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 5.5F, -2.4F, 5, 1, 1, 0F,0F, 0.2F, 0F, -0.6F, 0.5F, 0F, -0.1F, 0.6F, 0F, -0.7F, 0.3F, 0F, 0F, -0.7F, 0F, -0.7F, -1.1F, 0F, -0.3F, -1.1F, 0F, 0F, -1F, 0F); // Box 91
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(4.2F, 3.8F, -2F, 1, 1, 4, 0F,0F, 0F, -1.3F, 0.1F, 0F, -1.3F, 0.1F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F); // Box 92
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(4.1F, 5.4F, -2F, 1, 1, 4, 0F,0F, 0.3F, -0.1F, 0.1F, 0.3F, -0.1F, 0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F); // Box 93
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(4F, 7F, -2F, 1, 1, 4, 0F,0F, 0.3F, -0.1F, 0.1F, 0.3F, -0.1F, 0.1F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0.1F, 0F, -1.3F, 0F, 0F, -1.3F); // Box 94
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2F, 3F, 2F, 4, 1, 1, 0F,-1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 95
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2F, 4.6F, 2F, 4, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F); // Box 96
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 6.2F, 2F, 4, 1, 1, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F); // Box 97
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-5F, 5.5F, 1.4F, 5, 1, 1, 0F,-0.1F, 0.6F, 0F, -0.7F, 0.3F, 0F, 0F, 0.2F, 0F, -0.6F, 0.5F, 0F, -0.3F, -1.1F, 0F, 0F, -1F, 0F, 0F, -0.7F, 0F, -0.7F, -1.1F, 0F); // Box 98
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-5F, 4F, 1.3F, 5, 1, 1, 0F,-0.1F, -2.7F, 0F, -0.7F, 0.8F, 0F, 0F, 0.7F, 0F, -0.6F, -2.3F, 0F, -0.3F, 2.2F, 0F, 0F, -1.5F, 0F, 0F, -1.2F, 0F, -0.7F, 1.7F, 0F); // Box 99
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0F, 5.5F, 1.4F, 5, 1, 1, 0F,-0.7F, 0.3F, 0F, -0.1F, 0.6F, 0F, -0.6F, 0.5F, 0F, 0F, 0.2F, 0F, 0F, -1F, 0F, -0.3F, -1.1F, 0F, -0.7F, -1.1F, 0F, 0F, -0.7F, 0F); // Box 100
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 4F, 1.3F, 5, 1, 1, 0F,-0.7F, 0.8F, 0F, -0.1F, -2.7F, 0F, -0.6F, -2.3F, 0F, 0F, 0.7F, 0F, 0F, -1.5F, 0F, -0.3F, 2.2F, 0F, -0.7F, 1.7F, 0F, 0F, -1.2F, 0F); // Box 101
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
	}
}