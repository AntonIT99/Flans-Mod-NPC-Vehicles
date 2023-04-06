//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Barbute
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArchaicCorinthian extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelArchaicCorinthian() //Same as Filename
	{
		headModel = new ModelRendererTurbo[20];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 31
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		headModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		headModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 19
		headModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 20
		headModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		headModel[9] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 22
		headModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 24
		headModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 26
		headModel[12] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 28
		headModel[13] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 19
		headModel[14] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 33
		headModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 34
		headModel[16] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 35
		headModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 36
		headModel[18] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 37
		headModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 20

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.5F, -4F, 8, 1, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0.4F, 0.9F, 0.9F, 0.4F, 0.9F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3.75F, -5.5F, -4.8F, 1, 2, 4, 0F,0.25F, 0F, 0.05F, 0F, 0F, 0F, 0.1F, 0F, 0.5F, 0.2F, 0F, 0.5F, 2.8F, 3.5F, 0.5F, -0.4F, 3.6F, 0F, 0.2F, 3F, 0.5F, 0.2F, 3F, 0.5F); // Box 31
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0.75F, -3F, -4.8F, 2, 4, 1, 0F,0F, -0.2F, 0.5F, -0.1F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.2F, -1F, 0.5F, -1F, -2F, 0.4F, -1F, -1F, 0F, 0F, -1F, -0.5F); // Box 17
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2.75F, -3F, -4.8F, 2, 4, 1, 0F,-0.1F, 0F, 0.25F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, -1F, -2F, 0.3F, -0.2F, -1F, 0.5F, 0F, -1F, -0.5F, -1F, -1F, 0F); // Box 18
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.75F, -5.5F, -4.8F, 1, 2, 4, 0F,0F, 0F, 0F, 0.25F, 0F, 0.05F, 0.2F, 0F, 0.5F, 0.1F, 0F, 0.5F, -0.4F, 3.6F, 0F, 2.8F, 3.5F, 0.5F, 0.2F, 3F, 0.5F, 0.2F, 3F, 0.5F); // Box 19
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3.5F, -6F, -4.8F, 2, 2, 1, 0F,0.2F, 0F, -0.05F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.55F, 0.2F, 0.25F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, 0F, 0F, 0.2F, 0F); // Box 20
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1.5F, -6F, -4.8F, 2, 2, 1, 0F,0.5F, 0F, 0F, 0.2F, 0F, -0.05F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, 0.2F, -0.55F, 0.2F, 0.25F, 0F, 0.2F, 0F, 0.5F, -0.2F, 0F); // Box 21
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.5F, -6F, -4.8F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.2F, 0.2F, 0.5F, 0.8F, 0.2F, 0.5F, 0.8F, 0.2F, -0.5F, -0.2F, 0.2F); // Box 22
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0.5F, -6F, -4.8F, 1, 2, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.8F, 0.2F, -0.5F, -0.2F, 0.2F, -0.5F, -0.2F, 0.2F, 0.5F, 0.8F, 0.2F); // Box 24
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5F, -5.5F, -0.2F, 10, 2, 5, 0F,-0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, 1F, 0F, -0.1F, 1F, 0F); // Box 26
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5F, -3.5F, -0.2F, 10, 3, 5, 0F,-0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, -1F, 0.1F, -0.1F, -1F, 0.1F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.2F, -0.1F, -1F, 0F, -0.1F, -1F, 0F); // Box 28
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-0.5F, -13.3F, -3F, 1, 1, 4, 0F,0.2F, 0F, -1.2F, 0.2F, 0F, -1.2F, 0.2F, 0F, -1.2F, 0.2F, 0F, -1.2F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F); // Box 19
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-0.5F, -17.3F, -1.5F, 1, 4, 1, 0F,0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, 0.15F, -0.5F, 1F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 33
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -17.3F, -3.5F, 1, 4, 2, 0F,0.15F, -2.5F, 3.5F, 0.15F, -2.5F, 3.5F, 0.15F, -0.5F, -1F, 0.15F, -0.5F, -1F, -0.15F, 1F, 0F, -0.15F, 1F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F); // Box 34
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -17.3F, -0.5F, 1, 4, 4, 0F,0.15F, -0.5F, -1F, 0.15F, -0.5F, -1F, 0.15F, -3.5F, 1F, 0.15F, -3.5F, 1F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 1.3F, -2F, -0.15F, 1.3F, -2F); // Box 35
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -12F, 1.5F, 1, 3, 3, 0F,-0.15F, 0F, 1F, -0.15F, 0F, 1F, 0.15F, 1.85F, 0F, 0.15F, 1.85F, 0F, -0.15F, 0F, 0.8F, -0.15F, 0F, 0.8F, 0.15F, 3F, 1F, 0.15F, 3F, 1F); // Box 36
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-0.5F, -11.8F, 7.5F, 1, 3, 3, 0F,0.15F, 2F, 3F, 0.15F, 2F, 3F, -0.15F, -4F, -4.5F, -0.15F, -4F, -4.5F, 0.15F, 3F, 2F, 0.15F, 3F, 2F, -0.15F, 10F, -2.2F, -0.15F, 10F, -2.2F); // Box 37
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-0.5F, -12.3F, -0.4F, 1, 3, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 20
		headModel[19].setRotationPoint(0F, 0F, 0F);
	}
}