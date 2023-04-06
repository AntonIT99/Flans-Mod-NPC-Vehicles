//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ManchuQuiver
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelManchuQuiver extends ModelCustomArmour //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelManchuQuiver() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[18];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 76
		bodyModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 41
		bodyModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 42
		bodyModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 45
		bodyModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 46
		bodyModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 47
		bodyModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 48
		bodyModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 49
		bodyModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 50
		bodyModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 51
		bodyModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 52
		bodyModel[12] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 53
		bodyModel[13] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 54
		bodyModel[14] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 55
		bodyModel[15] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 56
		bodyModel[16] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 57
		bodyModel[17] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 58

		bodyModel[0].addShapeBox(-4F, 10F, -2.5F, 8, 1, 5, 0F,0.55F, -0.1F, 0.25F, 0.55F, -0.1F, 0.25F, 0.55F, -0.1F, 0.25F, 0.55F, -0.1F, 0.25F, 0.55F, -0.3F, 0.25F, 0.55F, -0.3F, 0.25F, 0.55F, -0.3F, 0.25F, 0.55F, -0.3F, 0.25F); // Box 44
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-5.5F, 10.5F, -2.5F, 1, 5, 5, 0F,2F, 0F, 0F, 0F, 1F, 0F, -0.4F, -1F, 0.5F, 2.5F, -1.5F, 0.2F, 0F, 1F, 2F, 1F, 0.4F, 1.7F, 1F, 2.3F, -2F, 0.7F, 3F, -2.3F); // Box 76
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-12F, -2.5F, -0.2F, 1, 17, 1, 0F,-0.25F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, -0.25F); // Box 41
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-11.7F, -1.5F, 8.3F, 1, 7, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.5F, 0F, 3.4F, 1.6F, 0F, 3.4F, 1.6F, 0F, -4.1F, -2.5F, 0F, -4.1F); // Box 42
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-10.5F, -3.5F, -0.2F, 1, 17, 1, 0F,-0.25F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, -0.25F); // Box 45
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-10.2F, -2.5F, 8.3F, 1, 7, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.5F, 0F, 3.4F, 1.6F, 0F, 3.4F, 1.6F, 0F, -4.1F, -2.5F, 0F, -4.1F); // Box 46
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-10F, -3.5F, -3.2F, 1, 17, 1, 0F,-0.25F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, -0.25F); // Box 47
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-9.7F, -2.5F, 5.3F, 1, 7, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.5F, 0F, 3.4F, 1.6F, 0F, 3.4F, 1.6F, 0F, -4.1F, -2.5F, 0F, -4.1F); // Box 48
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-11F, -3.8F, -2.2F, 1, 17, 1, 0F,-0.25F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, -0.25F); // Box 49
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-10.7F, -2.8F, 6.3F, 1, 7, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.5F, 0F, 3.4F, 1.6F, 0F, 3.4F, 1.6F, 0F, -4.1F, -2.5F, 0F, -4.1F); // Box 50
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-11.5F, -4F, -0.2F, 1, 17, 1, 0F,-0.25F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, -0.25F); // Box 51
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-11.2F, -3F, 8.3F, 1, 7, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.5F, 0F, 3.4F, 1.6F, 0F, 3.4F, 1.6F, 0F, -4.1F, -2.5F, 0F, -4.1F); // Box 52
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-11.5F, -3F, -3.2F, 1, 17, 1, 0F,-0.25F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, -0.25F); // Box 53
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-11.2F, -2F, 5.3F, 1, 7, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.5F, 0F, 3.4F, 1.6F, 0F, 3.4F, 1.6F, 0F, -4.1F, -2.5F, 0F, -4.1F); // Box 54
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-11.8F, -3.5F, -1.2F, 1, 17, 1, 0F,-0.25F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, -0.25F); // Box 55
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-11.5F, -2.5F, 7.3F, 1, 7, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.5F, 0F, 3.4F, 1.6F, 0F, 3.4F, 1.6F, 0F, -4.1F, -2.5F, 0F, -4.1F); // Box 56
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-9.9F, -3.5F, -1.7F, 1, 17, 1, 0F,-0.25F, 0F, -9.25F, -0.25F, 0F, -9.25F, -0.25F, 0F, 8.75F, -0.25F, 0F, 8.75F, -5.25F, 0F, -0.25F, 4.75F, 0F, -0.25F, 4.75F, 0F, -0.25F, -5.25F, 0F, -0.25F); // Box 57
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-9.6F, -2.5F, 6.8F, 1, 7, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -2.5F, 0F, 3.4F, 1.6F, 0F, 3.4F, 1.6F, 0F, -4.1F, -2.5F, 0F, -4.1F); // Box 58
		bodyModel[17].setRotationPoint(0F, 0F, 0F);
	}
}