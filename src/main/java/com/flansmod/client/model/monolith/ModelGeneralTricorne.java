//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Tricorne
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGeneralTricorne extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelGeneralTricorne() //Same as Filename
	{
		headModel = new ModelRendererTurbo[27];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 7
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 8
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		headModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 10
		headModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		headModel[8] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 13
		headModel[9] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 14
		headModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 15
		headModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 16
		headModel[12] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 17
		headModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[14] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 19
		headModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20
		headModel[16] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 21
		headModel[17] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 22
		headModel[18] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 29
		headModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 30
		headModel[20] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 31
		headModel[21] = new ModelRendererTurbo(this, 100, 26, textureX, textureY); // Box 32
		headModel[22] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 24
		headModel[23] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 25
		headModel[24] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 26
		headModel[25] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 27
		headModel[26] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 28

		headModel[0].addShapeBox(-4F, -7F, -4F, 8, 3, 8, 0F,0.2F, 1.5F, 0.3F, 0.2F, 1.5F, 0.3F, 0.2F, 1F, 0.9F, 0.2F, 1F, 0.9F, 0.9F, -1.5F, 1.2F, 0.9F, -1.5F, 1.2F, 0.9F, -0.6F, 1F, 0.9F, -0.6F, 1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -13F, -4F, 8, 3, 8, 0F,-3.1F, -2.7F, -3.5F, -3.1F, -2.7F, -3.5F, -3.1F, -3F, -2.5F, -3.1F, -3F, -2.5F, 0.2F, 1.5F, 0.3F, 0.2F, 1.5F, 0.3F, 0.2F, 2F, 0.9F, 0.2F, 2F, 0.9F); // Box 7
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -8F, -5.5F, 5, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, -6F, 1F, 0F, -1F); // Box 7
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -11F, -5.5F, 5, 3, 2, 0F,-1F, 0F, -2F, -1F, -0.5F, 1F, -1F, -0.5F, -1.5F, -1F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 8
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-7F, -11F, -4.5F, 2, 6, 1, 0F,-1F, -2F, -4F, 1F, 0F, -1F, 1F, 0F, 1F, -1.5F, -2F, 4F, 0F, 0.5F, -3F, -1F, 0F, 1F, -1F, 0F, -1F, -1F, 0.8F, 3F); // Box 9
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-9F, -8F, -2.5F, 2, 5, 1, 0F,0.5F, -0.5F, -5F, 1F, 1F, -2F, 1.5F, 1F, 2F, 0.5F, -0.5F, 5F, 1.5F, -1.2F, -5F, 0F, -1.5F, -1F, 1F, -1.2F, 1F, 1.5F, -1.2F, 5F); // Box 10
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-9F, -8F, 7.5F, 4, 5, 1, 0F,0.5F, -0.5F, 4F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0.5F, -0.5F, -4F, 1.5F, -1.2F, 4F, 0F, 0F, 1F, 0F, 0F, -1F, 1.5F, -1.2F, -4F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -8F, 7.5F, 5, 5, 1, 0F,0F, 0.5F, 2F, 0F, 1.5F, 2.5F, 0F, 1.5F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 1F, 0F, -0.2F, 1.5F, 0F, -0.2F, -1.5F, 0F, 0F, -1F); // Box 12
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -5.5F, -10.5F, 5, 1, 17, 0F,0.5F, 0.5F, -6.5F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F, -5.5F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 1F, 1.5F, 0F); // Box 13
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-10.5F, -5.5F, -0.5F, 5, 1, 7, 0F,-1F, -1F, -3.5F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, -1F, -2.5F, -0.2F, 0.2F, -3.5F, 0F, 0.2F, 1F, -0.5F, 1.5F, 0F, -0.2F, 0.2F, -2.5F); // Box 14
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0F, -8F, 7.5F, 5, 5, 1, 0F,0F, 1.5F, 2.5F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 1.5F, -2.5F, 0F, -0.2F, 1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.2F, -1.5F); // Box 15
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(5F, -8F, 7.5F, 4, 5, 1, 0F,0F, 0.5F, 2F, 0.5F, -0.5F, 4F, 0.5F, -0.5F, -4F, 0F, 0.5F, -2F, 0F, 0F, 1F, 1.5F, -1.2F, 4F, 1.5F, -1.2F, -4F, 0F, 0F, -1F); // Box 16
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(7F, -8F, -2.5F, 2, 5, 1, 0F,1F, 1F, -2F, 0.5F, -0.5F, -5F, 0.5F, -0.5F, 5F, 1.5F, 1F, 2F, 0F, -1.5F, -1F, 1.5F, -1.2F, -5F, 1.5F, -1.2F, 5F, 1F, -1.2F, 1F); // Box 17
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(5F, -11F, -4.5F, 2, 6, 1, 0F,1F, 0F, -1F, -1F, -2F, -4F, -1.5F, -2F, 4F, 1F, 0F, 1F, -1F, 0F, 1F, 0F, 0.5F, -3F, -1F, 0.8F, 3F, -1F, 0F, -1F); // Box 18
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(0F, -11F, -5.5F, 5, 3, 2, 0F,-1F, -0.5F, 1F, -1F, 0F, -2F, -1F, 0F, 1F, -1F, -0.5F, -1.5F, 0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 19
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(0F, -8F, -5.5F, 5, 3, 2, 0F,0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -6F); // Box 20
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(0F, -5.5F, -10.5F, 5, 1, 17, 0F,0F, 0F, -1F, 0.5F, 0.5F, -6.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, -5.5F, 1F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 21
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(5.5F, -5.5F, -0.5F, 5, 1, 7, 0F,0F, 0F, 1F, -1F, -1F, -3.5F, -1F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0.2F, 1F, -0.2F, 0.2F, -3.5F, -0.2F, 0.2F, -2.5F, -0.5F, 1.5F, 0F); // Box 22
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -7F, -2.9F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 29
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-6F, -3F, -2.9F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 30
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4F, -7F, 3.1F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 31
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-6F, -2.5F, 4.1F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(5F, -9F, -4.5F, 1, 2, 2, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 1.5F, 0.5F, 0.4F, -1.5F, 0.5F, 0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F); // Box 24
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(5F, -9F, -6.5F, 1, 2, 2, 0F,1.5F, 1.5F, 0F, -1.5F, 1.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 1.5F, 0F, 0.3F, -1.5F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 25
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(5F, -7.5F, -5.5F, 1, 2, 2, 0F,0.5F, -0.3F, -0.3F, -1.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.4F, -0.7F, -0.3F, 0.5F, -0.7F, -0.3F, 0F, -0.3F, -0.3F); // Box 26
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(3F, -7F, -2.9F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 27
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(4F, -3F, -2.9F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 28
		headModel[26].setRotationPoint(0F, 0F, 0F);
	}
}