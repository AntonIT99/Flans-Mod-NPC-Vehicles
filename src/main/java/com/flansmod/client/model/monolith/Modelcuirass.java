//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: cuirass
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelcuirass extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public Modelcuirass() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[14];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 68
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 89
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 90
		bodyModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 91
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 92
		bodyModel[7] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 93
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 96
		bodyModel[9] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 97
		bodyModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 105
		bodyModel[11] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 106
		bodyModel[12] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 107
		bodyModel[13] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 108

		bodyModel[0].addShapeBox(-4F, 6.5F, -2F, 4, 3, 4, 0F,0.6F, 0F, 0.4F, 0F, -0.5F, 1.5F, 0F, 0F, 1F, 0.6F, 0F, 0.5F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2.2F, 4, 2, 4, 0F,-1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, -1F, 0.4F, 0.5F, -2F, -0.3F, 1F, 0F, 0.2F, 1.5F, 0F, -0.7F, 0.5F, -2F, -1F, 0.5F); // Box 68
		bodyModel[1].setRotationPoint(0F, -3F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -2.2F, 4, 2, 4, 0F,0F, 0.8F, 0.5F, -1F, 0.4F, 0.5F, -1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.2F, 1.5F, -2F, -0.3F, 1F, -2F, -1F, 0.5F, 0F, -0.7F, 0.5F); // Box 69
		bodyModel[2].setRotationPoint(0F, -3F, 0F);

		bodyModel[3].addShapeBox(-4F, 3.5F, -2F, 4, 3, 4, 0F,0.5F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.6F, 0F, 0.4F, 0F, 0.49F, 1.49F, 0F, 0F, 1F, 0.6F, 0F, 0.4F); // Box 89
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 1.5F, -2F, 4, 2, 4, 0F,-0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F, 0.4F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.4F, 0F, 0.5F); // Box 90
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, -0.5F, -2F, 4, 1, 4, 0F,-1F, -0.3F, 0.3F, -1.5F, -0.3F, 0.2F, 0F, -0.3F, 0.8F, -1F, -0.3F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F); // Box 91
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -0.5F, -2F, 4, 1, 4, 0F,-1.5F, -0.3F, 0.2F, -1F, -0.3F, 0.3F, -1F, -0.3F, 0.5F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F); // Box 92
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 1.5F, -2F, 4, 2, 4, 0F,0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F, 0F, 0F, 1.2F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.5F, 0F, 0F, 1F); // Box 93
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 3.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1.2F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.51F, 1.51F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0F, 0F, 1F); // Box 96
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 6.5F, -2F, 4, 3, 4, 0F,0F, -0.5F, 1.5F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 97
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 9.3F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F); // Box 105
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 9.8F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 106
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 10.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0.5F, 1.2F, 0F, 0.5F, 1.2F, 1F, 0F, 1F); // Box 107
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 10.8F, -2F, 4, 1, 4, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.2F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0.5F, 1.2F); // Box 108
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
	}
}