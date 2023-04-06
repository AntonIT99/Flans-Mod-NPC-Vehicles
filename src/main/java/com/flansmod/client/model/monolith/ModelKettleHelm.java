//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PersianVeiledHelm
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKettleHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelKettleHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[13];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 136
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 202
		headModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 203
		headModel[5] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 204
		headModel[6] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 205
		headModel[7] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 206
		headModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 207
		headModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 218
		headModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 219
		headModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 87
		headModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 88

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.5F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 136
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -6.4F, -7.8F, 10, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 202
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -6F, 4.8F, 10, 2, 3, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 203
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4.9F, -6.4F, -4.8F, 3, 2, 10, 0F,0F, -0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.9F, -0.3F, 0F, -1.1F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 204
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-7.9F, -6.4F, -4.8F, 3, 2, 10, 0F,0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -1.1F, -0.3F, 0F, -1.9F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 205
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-8.01F, -6.4F, -7.8F, 3, 2, 3, 0F,-1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -1.5F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 206
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(5.01F, -6.4F, -7.8F, 3, 2, 3, 0F,0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 207
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(5.01F, -6F, 4.91F, 3, 2, 3, 0F,0F, -0.7F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 218
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-8.01F, -6F, 4.91F, 3, 2, 3, 0F,0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F); // Box 219
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-0.5F, -8F, -4.5F, 1, 3, 9, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, -0.5F, 0.9F, -0.2F, -0.5F, 0.9F, -0.2F, -0.5F, 0.9F, -0.2F, -0.5F, 0.9F); // Box 87
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -9.5F, -4.5F, 1, 1, 9, 0F,-0.2F, 0.2F, -2F, -0.2F, 0.2F, -2F, -0.2F, 0.2F, -2F, -0.2F, 0.2F, -2F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F); // Box 88
		headModel[12].setRotationPoint(0F, 0F, 0F);
	}
}