//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SiameseKettle
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSiameseKettle extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelSiameseKettle() //Same as Filename
	{
		headModel = new ModelRendererTurbo[30];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 50
		headModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 136
		headModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 203
		headModel[6] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 205
		headModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 206
		headModel[8] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 219
		headModel[9] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 91
		headModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 88
		headModel[11] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 89
		headModel[12] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 90
		headModel[13] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 91
		headModel[14] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 92
		headModel[15] = new ModelRendererTurbo(this, 55, 6, textureX, textureY); // Box 93
		headModel[16] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 94
		headModel[17] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 95
		headModel[18] = new ModelRendererTurbo(this, 51, 25, textureX, textureY); // Box 96
		headModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 97
		headModel[20] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 98
		headModel[21] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 99
		headModel[22] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 100
		headModel[23] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 101
		headModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 102
		headModel[25] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 103
		headModel[26] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 104
		headModel[27] = new ModelRendererTurbo(this, 51, 25, textureX, textureY); // Box 105
		headModel[28] = new ModelRendererTurbo(this, 55, 6, textureX, textureY); // Box 106
		headModel[29] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 107

		headModel[0].addShapeBox(-4F, -9F, -4F, 8, 4, 8, 0F,0F, 0.3F, 0.1F, 0F, 0.3F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.3F, -4F, 8, 1, 8, 0F,-2F, 0.2F, -2F, -2F, 0.2F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -11.3F, -0.5F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0.1F, 1.5F, -0.2F, 1.5F, 1.5F, -0.2F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F); // Box 49
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -11.3F, -0.5F, 1, 1, 1, 0F,0.1F, 0.7F, 0.1F, 0.1F, 0.7F, 0.1F, 0.1F, 0.7F, 0.1F, 0.1F, 0.7F, 0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 50
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 136
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -4.5F, 4.8F, 10, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 203
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-7.9F, -4.9F, -4.8F, 3, 1, 10, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.1F, -0.3F, 0F, -0.9F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 205
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-8.01F, -4.9F, -7.8F, 3, 1, 3, 0F,-1F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 206
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-8.01F, -4.5F, 4.91F, 3, 1, 3, 0F,0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F); // Box 219
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -5F, -3.4F, 8, 5, 1, 0F,0.4F, 0.3F, -4.2F, 0.4F, 0.3F, -4.2F, 0.4F, 0.3F, 3.8F, 0.4F, 0.3F, 3.8F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.3F, -0.2F); // Box 91
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -4.5F, -2.5F, 1, 2, 6, 0F,-0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 88
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5F, -2.5F, -2.5F, 1, 3, 6, 0F,0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, -1.7F, -1.2F, 0F, -1.7F, -1.2F, 0F, -1.7F, 0.8F, 0F, -1.7F); // Box 89
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -4F, 4F, 8, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.7F, 0.5F, 0F, -0.7F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 90
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-2F, -2F, 4F, 4, 3, 1, 0F,0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -3.2F, 0F, 0F, -3.2F, 0F, 0F, 2.8F, 0F, 0F, 2.8F); // Box 91
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -2F, 4F, 3, 3, 1, 0F,-0.5F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.3F, -0.5F, 0F, 0.3F, 1F, -2F, -1.6F, 0F, 0F, -3.2F, 0F, 0F, 2.8F, 1F, -2F, 1F); // Box 92
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-1.5F, -8F, -5.2F, 3, 2, 1, 0F,-1.4F, 0F, -0.5F, -1.4F, 0F, -0.5F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1.5F, -6F, -5.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F); // Box 94
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(4.2F, -7.7F, -1.5F, 1, 2, 3, 0F,0F, 0F, -1.4F, -0.5F, 0F, -1.4F, -0.5F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(4.2F, -5.7F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F); // Box 96
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-5F, -4.9F, -7.8F, 10, 1, 3, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 97
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(4.9F, -4.9F, -4.8F, 3, 1, 10, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.9F, -0.3F, 0F, 0.1F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 98
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(4.9F, -4.5F, 4.91F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 99
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(4.9F, -4.9F, -7.8F, 3, 1, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 100
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(2F, -2F, 4F, 3, 3, 1, 0F,0F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -3.2F, 1F, -2F, -1.6F, 1F, -2F, 1F, 0F, 0F, 2.8F); // Box 101
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(4F, -4.5F, -2.5F, 1, 2, 6, 0F,-0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F); // Box 102
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(4F, -2.5F, -2.5F, 1, 3, 6, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -1.2F, 0F, -1.7F, 0.8F, 0F, -1.7F, 0.8F, 0F, -1.7F, -1.2F, 0F, -1.7F); // Box 103
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-5.2F, -7.7F, -1.5F, 1, 2, 3, 0F,-0.5F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, -0.5F, 0F, -1.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5.2F, -5.7F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F); // Box 105
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-1.5F, -7.5F, 4.2F, 3, 2, 1, 0F,-1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.5F, -1.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-1.5F, -5.5F, 4.2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F); // Box 107
		headModel[29].setRotationPoint(0F, 0F, 0F);
	}
}