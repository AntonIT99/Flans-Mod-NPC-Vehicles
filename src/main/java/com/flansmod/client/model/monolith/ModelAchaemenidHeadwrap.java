//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AchaemenidHeadwrap
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAchaemenidHeadwrap extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelAchaemenidHeadwrap() //Same as Filename
	{
		headModel = new ModelRendererTurbo[9];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 136
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5
		headModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 8
		headModel[5] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 9
		headModel[6] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 10
		headModel[7] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 11
		headModel[8] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 10

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.3F, -4F, 8, 2, 8, 0F,-2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, -2F, -0.5F, -2F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.2F, 0.9F, 0.9F, -0.2F, 0.9F, 0.9F, 0.2F, 0.9F, 0.9F, 0.2F, 0.9F); // Box 136
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4.5F, -5F, -4.5F, 9, 1, 9, 0F,0.6F, 0F, 0.55F, 0.6F, 0F, 0.55F, 0.6F, -0.7F, 0.55F, 0.6F, -0.7F, 0.55F, 0.6F, -0.7F, 0.55F, 0.6F, -0.7F, 0.55F, 0.6F, 0.3F, 0.55F, 0.6F, 0.3F, 0.55F); // Box 5
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -2.5F, -4F, 8, 2, 4, 0F,0.5F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 8
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -3.2F, -4F, 8, 1, 4, 0F,0F, -2F, 0.2F, 0F, -2F, 0.2F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.5F, 1.2F, 0.5F, 0.5F, 1.2F, 0.5F, 0.5F, -1.3F, 0.5F, 0.5F, -1.3F, 0.5F); // Box 9
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, 0F, -4F, 4, 1, 8, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1.5F, -0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, -0.3F, 0.25F); // Box 10
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0F, 0F, -4F, 4, 1, 8, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0.25F, 0F, 0F, 0F); // Box 11
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -2.5F, 1F, 8, 2, 3, 0F,0.5F, 1.5F, 0.5F, 0.5F, 1.5F, 0.5F, 0.9F, 1.5F, 0.9F, 0.9F, 1.5F, 0.9F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 10
		headModel[8].setRotationPoint(0F, 0F, 0F);
	}
}