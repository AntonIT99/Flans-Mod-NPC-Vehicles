//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RussiaNapoleonicGear
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRussiaNapoleonicGear extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelRussiaNapoleonicGear() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[17];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 39
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 40
		bodyModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 41
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 42
		bodyModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 43
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 44
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		bodyModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 47
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 48
		bodyModel[11] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 49
		bodyModel[12] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 50
		bodyModel[13] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 51
		bodyModel[14] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 52
		bodyModel[15] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 53
		bodyModel[16] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 54

		bodyModel[0].addShapeBox(2F, -0.5F, -3F, 3, 9, 6, 0F,-1F, 0.5F, 0.2F, 1F, -0.3F, 0.2F, 1F, -0.3F, 0.2F, -1F, 0.5F, 0.2F, 6.5F, -2F, 0.4F, -9.5F, 1.5F, 0.4F, -9.5F, 1.5F, 0.8F, 6.5F, -2F, 0.8F); // Box 38
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(3F, -1.5F, -3F, 3, 1, 6, 0F,-1F, -0.3F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.3F, 0F, 0F, -0.5F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.5F, 0.2F); // Box 39
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-5.5F, 6.5F, -3F, 1, 3, 6, 0F,0F, -2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.8F, 0F, -2F, 0.2F, -0.5F, 0.3F, 0F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.8F, -0.5F, 0.3F, 0.2F); // Box 40
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(4F, 11F, 1.5F, 1, 2, 7, 0F,-0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, -1.7F, -6.4F, 0F, 1.7F, -6.4F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -2F, 5F, -1F, 2F, 5F, -1.2F); // Box 41
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 2F, 3F, 8, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 42
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 1.5F, 5.5F, 8, 6, 1, 0F,-0.2F, 0.2F, 2F, -0.2F, 0.2F, 2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, -1F, 2F, -1F, -1F, 2F, -1F, -1F, -0.5F, -1F, -1F, -0.5F); // Box 43
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, 2F, 6.5F, 3, 3, 1, 0F,-0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 44
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 1F, 6.5F, 1, 1, 1, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-5F, 10.5F, 3F, 5, 3, 2, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.4F); // Box 46
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-5F, 10.5F, 4.2F, 5, 3, 1, 0F,-0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, -0.4F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.4F, -0.4F, -0.4F); // Box 47
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 3.5F, -3F, 4, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.5F); // Box 48
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-5F, -0.35F, -2.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.3F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 49
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-5F, 3.65F, -2.5F, 1, 4, 5, 0F,-1F, 0F, 0.3F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-1F, 3.5F, -3.95F, 2, 1, 1, 0F,-0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F); // Box 51
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(4F, -0.35F, -2.5F, 1, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, 0.3F, -1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 52
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(4F, 3.65F, -2.5F, 1, 4, 5, 0F,1F, 0F, 0.5F, -1F, 0F, 0.3F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 3.5F, -3F, 4, 1, 1, 0F,-1F, 0F, 0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0.9F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 54
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
	}
}