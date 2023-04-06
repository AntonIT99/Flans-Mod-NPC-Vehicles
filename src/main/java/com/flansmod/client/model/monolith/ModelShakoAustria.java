//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ShakoAustria
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelShakoAustria extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelShakoAustria() //Same as Filename
	{
		headModel = new ModelRendererTurbo[16];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		headModel[3] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 12
		headModel[4] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 62
		headModel[5] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 85
		headModel[6] = new ModelRendererTurbo(this, 17, 32, textureX, textureY); // Box 14
		headModel[7] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 41
		headModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 42
		headModel[9] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 17
		headModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 18
		headModel[11] = new ModelRendererTurbo(this, 11, 41, textureX, textureY); // Box 19
		headModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 20
		headModel[13] = new ModelRendererTurbo(this, 1, 44, textureX, textureY); // Box 21
		headModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 22
		headModel[15] = new ModelRendererTurbo(this, 17, 32, textureX, textureY); // Box 23

		headModel[0].addShapeBox(-5F, -8.5F, -6F, 10, 4, 10, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -10.5F, -4F, 5, 4, 8, 0F,0F, 2.25F, 2.5F, 1F, 1F, 1F, 1F, -1F, 0.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.7F, 0.25F); // Box 4
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -5.5F, -6F, 5, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -4.5F, -3F, 8, 5, 1, 0F,1.2F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0.5F, 1.2F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F); // Box 12
		headModel[3].setRotationPoint(0F, 0F, 0F);
		headModel[3].rotateAngleX = -0.12217305F;

		headModel[4].addShapeBox(-5F, -10.5F, -4F, 5, 4, 8, 0F,1F, 1F, 1F, 0F, 2.25F, 2.5F, 0F, 1F, 1F, 1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.25F, 0F, 0.5F, 0.25F); // Box 62
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0F, -5.5F, -6F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -13.5F, -5.5F, 1, 2, 1, 0F,1.5F, 1.25F, 2.75F, 1.5F, 1.25F, 2.75F, 1.5F, 1.25F, -2.5F, 1.5F, 1.25F, -2.5F, -0.3F, 0F, 0.75F, -0.3F, 0F, 0.75F, -0.3F, 0F, -1.25F, -0.3F, 0F, -1.25F); // Box 14
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-2F, -5.5F, -3F, 4, 1, 1, 0F,3.5F, 0.2F, 0F, 3.5F, 0.2F, 0F, 3.5F, 0.2F, 0.5F, 3.5F, 0.2F, 0.5F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F); // Box 41
		headModel[7].setRotationPoint(0F, 0F, 0F);
		headModel[7].rotateAngleX = -0.12217305F;

		headModel[8].addShapeBox(-1.5F, -12.5F, -6.7F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.5F, -11.5F, -6.7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1.5F, -10.5F, -6.7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 18
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1F, -12F, -6.8F, 2, 2, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 19
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1.5F, -9.5F, -5.7F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1.5F, -8.5F, -5.7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1.5F, -7.5F, -5.7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 22
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -9.5F, -5.5F, 1, 1, 1, 0F,0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.3F, 0F, 0.75F, -0.3F, 0F, 0.75F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F); // Box 23
		headModel[15].setRotationPoint(0F, 0F, 0F);
	}
}