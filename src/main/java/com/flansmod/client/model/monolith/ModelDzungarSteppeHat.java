//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DzungarSteppeHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDzungarSteppeHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelDzungarSteppeHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 51
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 52
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 53
		headModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 54
		headModel[4] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 56
		headModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 57
		headModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 59
		headModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 60
		headModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 61
		headModel[9] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 62
		headModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 63

		headModel[0].addShapeBox(-4.5F, -9F, -4F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 1F, 0.5F, 0.4F, 1F, 0.5F, 0.4F, 1F, 1.5F, 0.2F, 1F, 1.5F, 0.2F); // Box 51
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -12F, -4F, 8, 3, 8, 0F,-2F, 0.5F, -2.6F, -2F, 0.5F, -2.6F, -2F, -0.5F, 1.2F, -2F, -0.5F, 1.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.3F); // Box 52
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -14F, -3F, 8, 1, 8, 0F,-3.8F, 0F, -7F, -3.8F, 0F, -7F, -3.8F, -0.5F, 2F, -3.8F, -0.5F, 2F, -2F, 0.5F, -1.6F, -2F, 0.5F, -1.6F, -2F, 1.5F, 0.2F, -2F, 1.5F, 0.2F); // Box 53
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3F, -10.5F, -7F, 3, 5, 3, 0F,0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 54
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -10.5F, -7F, 1, 6, 3, 0F,1F, -3F, -1.5F, 0F, -0.5F, -1F, 0F, -1F, 0F, 1F, -3.4F, 1F, 0F, 2.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 2.3F, 0F); // Box 56
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-6F, -7.5F, -7F, 2, 6, 13, 0F,2.5F, -2F, -4F, -1F, 0F, -1.5F, -1F, -2F, 0F, 2.5F, -3F, -3F, 1F, -1F, -3F, 0F, -0.5F, -0.5F, 0F, 1F, 0F, 1F, 0F, -3F); // Box 57
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-6F, -7.5F, 4F, 6, 7, 2, 0F,-1F, -1.6F, 0F, 0F, -1.8F, 0F, 0F, -2.5F, 1F, -1F, -2F, 0F, -2F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -2F, 0F, 0F); // Box 59
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0F, -10.5F, -7F, 3, 5, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 60
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(0F, -7.5F, 4F, 6, 7, 2, 0F,0F, -1.8F, 0F, -1F, -1.6F, 0F, -1F, -2F, 0F, 0F, -2.5F, 1F, 0F, 0F, 0F, -2F, -0.3F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 61
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3F, -10.5F, -7F, 1, 6, 3, 0F,0F, -0.5F, -1F, 1F, -3F, -1.5F, 1F, -3.4F, 1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, -0.5F, 0F, 2.3F, 0F, 0F, -0.5F, 0F); // Box 62
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -7.5F, -7F, 2, 6, 13, 0F,-1F, 0F, -1.5F, 2.5F, -2F, -4F, 2.5F, -3F, -3F, -1F, -2F, 0F, 0F, -0.5F, -0.5F, 1F, -1F, -3F, 1F, 0F, -3F, 0F, 1F, 0F); // Box 63
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}
}