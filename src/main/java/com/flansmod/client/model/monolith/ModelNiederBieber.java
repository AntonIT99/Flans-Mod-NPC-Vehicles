//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NiederBieber
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNiederBieber extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelNiederBieber() //Same as Filename
	{
		headModel = new ModelRendererTurbo[34];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 259
		headModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 28
		headModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 29
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 32
		headModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 34
		headModel[7] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 35
		headModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 39
		headModel[9] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 40
		headModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 41
		headModel[11] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 42
		headModel[12] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 43
		headModel[13] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 44
		headModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 45
		headModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 46
		headModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 47
		headModel[17] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 48
		headModel[18] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 256
		headModel[19] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		headModel[20] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[21] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 29
		headModel[22] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 30
		headModel[23] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 31
		headModel[24] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 32
		headModel[25] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 33
		headModel[26] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 34
		headModel[27] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 36
		headModel[28] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 28
		headModel[29] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 29
		headModel[30] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 30
		headModel[31] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 31
		headModel[32] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 32
		headModel[33] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 33

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5.3F, -4F, 8, 1, 1, 0F,1F, 0.3F, 1F, 1F, 0.3F, 1F, 1F, 0.3F, 1.5F, 1F, 0.3F, 1.5F, 1F, -0.1F, 1F, 1F, -0.1F, 1F, 1F, -0.1F, 1F, 1F, -0.1F, 1F); // Box 259
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -6.5F, -4F, 8, 2, 4, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 28
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6.5F, 2F, 8, 5, 2, 0F,0.9F, 0F, 1.2F, 0.9F, 0F, 1.2F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0.5F, 1.2F, 0.9F, 0.5F, 1.2F, 0.9F, 0.5F, 0.9F, 0.9F, 0.5F, 0.9F); // Box 29
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4F, -1F, 1F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0.2F, 3.5F, 0F, -1F, 2F, 0.2F, 1F, 0F, 0.5F, 3F); // Box 32
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -1F, 1F, 1, 1, 4, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, -1F, 0F, -0.9F, 0.2F, 0F, 0.5F, 3F, 2F, 0.2F, 1F); // Box 34
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -1F, 1F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, 3F); // Box 35
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.85F, -1.5F, -4.5F, 1, 2, 4, 0F,-0.3F, -0.5F, 0.6F, 4F, -0.7F, 0.6F, 3.2F, -0.7F, 0.8F, -0.2F, -0.5F, 0.8F, -0.7F, 0F, 0.5F, 3.7F, -0.2F, 0.5F, 3.2F, -0.2F, 0.3F, -1F, -0.2F, 0.3F); // Box 39
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.85F, -2F, -4.5F, 1, 1, 4, 0F,-0.1F, 0F, 0.5F, 1.7F, 0.2F, 0.5F, 1.7F, 0F, 1F, 0F, 0F, 1F, -0.3F, 0F, 0.6F, 2F, 0.2F, 0.6F, 1.7F, 0.2F, 0.8F, -0.2F, 0F, 0.8F); // Box 40
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4.85F, -3F, -4.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0.4F, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, -0.1F, 0F, 0.5F, 1.7F, -0.2F, 0.5F, 1.7F, 0F, 1F, 0F, 0F, 1F); // Box 41
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.85F, -4.5F, -4.5F, 1, 2, 4, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.2F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 42
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -5.8F, -2F, 8, 1, 3, 0F,1F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, -0.3F, 1F, -0.2F, -0.3F, 1F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, -0.2F, 0.2F, 1F, -0.2F, 0.2F); // Box 43
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, -5F, 0.8F, 10, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 44
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -4F, 0.8F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.6F, 0F, 1F, -0.6F); // Box 45
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -5.7F, -2F, 8, 1, 3, 0F,1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F); // Box 46
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -5.7F, -2.2F, 8, 2, 1, 0F,1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1F, -0.7F, 0F, 1F, -0.7F, 0F, 1F, -0.7F, -0.8F, 1F, -0.7F, -0.8F); // Box 47
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -5.7F, 0F, 8, 2, 1, 0F,1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1.3F, -0.4F, -0.4F, 1F, -0.7F, -0.8F, 1F, -0.7F, -0.8F, 1F, -0.7F, 0F, 1F, -0.7F, 0F); // Box 48
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5F, -6.5F, -7F, 5, 1, 3, 0F,-1F, -0.7F, -1.5F, 0F, -0.7F, -1F, 0F, -0.7F, 0F, 0.1F, -0.7F, -0.8F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, -0.8F); // Box 256
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(0F, -6.5F, -7F, 5, 1, 3, 0F,0F, -0.7F, -1F, -1F, -0.7F, -1.5F, 0.1F, -0.7F, -0.8F, 0F, -0.7F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0.1F, 0F, -0.8F, 0F, 0F, 0F); // Box 29
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4.85F, -5F, -1.5F, 1, 1, 2, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0.3F, 0.4F, -0.5F, 0.3F, 0.2F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 28
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-6F, -0.4F, -4.5F, 2, 1, 4, 0F,-1F, -0.6F, 0F, 0F, -0.7F, 0F, 0F, -0.1F, 0.5F, -0.2F, -0.2F, 0.2F, -1F, -0.2F, 0F, 0F, -0.1F, 0F, 0F, -0.3F, 0.3F, -0.2F, -0.3F, 0.1F); // Box 29
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(3.85F, -4.5F, -4.5F, 1, 2, 4, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 1F, 0.4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0.2F, -0.5F, 1F); // Box 30
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(3.85F, -3F, -4.5F, 1, 1, 4, 0F,0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.2F, 0F, 1F, 1.7F, -0.2F, 0.7F, -0.1F, 0F, 0.7F, 0F, 0F, 1F, 1.7F, 0F, 1F); // Box 31
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(3.85F, -5F, -1.5F, 1, 1, 2, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.4F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, 0.2F, -0.5F, 0F); // Box 32
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(3.85F, -2F, -4.5F, 1, 1, 4, 0F,1.7F, 0.2F, 0.7F, -0.1F, 0F, 0.7F, 0F, 0F, 1F, 1.7F, 0F, 1F, 2F, 0.2F, 0.8F, -0.3F, 0F, 0.8F, -0.2F, 0F, 0.8F, 1.7F, 0.2F, 0.8F); // Box 33
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(2.85F, -1.5F, -4.5F, 2, 2, 4, 0F,3.5F, -0.7F, 0.8F, -0.3F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F, 3.2F, -0.7F, 0.8F, 3.2F, -0.2F, 0.7F, -0.7F, 0F, 0.7F, -1F, -0.2F, 0.3F, 2.7F, -0.2F, 0.3F); // Box 34
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(4F, -0.4F, -4.8F, 2, 1, 4, 0F,0F, -0.7F, 0F, -1F, -0.6F, 0F, -0.2F, -0.2F, 0.2F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0F, -1F, -0.2F, 0F, -0.2F, -0.3F, 0.1F, 0F, -0.3F, 0.3F); // Box 36
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-4F, -9.8F, -0.5F, 8, 1, 1, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F); // Box 28
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-4F, -8F, -0.5F, 8, 2, 1, 0F,0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F); // Box 29
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-0.5F, -8F, -4F, 1, 3, 8, 0F,0F, 0.3F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -1.5F, 1.2F, 0F, -1.5F, 1.2F); // Box 30
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-0.5F, -9.8F, -4F, 1, 1, 8, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.6F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F); // Box 31
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-0.5F, -8F, 2F, 1, 6, 2, 0F,0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -1.5F, 1.2F, 0F, -1.5F, 1.2F, 0F, 0.3F, 0.6F, 0F, 0.3F, 0.6F, 0F, 0.3F, 1F, 0F, 0.3F, 1F); // Box 32
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-0.5F, -0.8F, -5.3F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 33
		headModel[33].setRotationPoint(0F, 0F, 0F);
	}
}