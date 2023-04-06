//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CuirassierHat
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCuirassierHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCuirassierHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[24];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 14
		headModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		headModel[7] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 15
		headModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 16
		headModel[9] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 19
		headModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 20
		headModel[11] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 12
		headModel[12] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 41
		headModel[13] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 50
		headModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		headModel[15] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 23
		headModel[16] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 24
		headModel[17] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 25
		headModel[18] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 26
		headModel[19] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 27
		headModel[20] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 28
		headModel[21] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 29
		headModel[22] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 30
		headModel[23] = new ModelRendererTurbo(this, 59, 18, textureX, textureY); // Box 31

		headModel[0].addShapeBox(-4F, -9F, -4F, 4, 3, 8, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 1.3F, 0.2F, 0F, 1.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 1.5F, 0.9F, -0.5F, 1.5F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.5F, -3.3F, 8, 1, 8, 0F,-2F, 0.2F, -3F, -2F, 0.2F, -3F, -2F, 0F, -1F, -2F, 0F, -1F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.5F, -5F, 8, 2, 9, 0F,0.9F, 0F, -0.1F, 0.9F, 0F, -0.1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, 0.4F, 0.9F, 0.9F, 0.4F, 0.9F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-2F, -9F, 3F, 4, 3, 1, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 1.3F, 0.2F, 0F, 1.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 1.5F, 0.9F, -0.5F, 1.5F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -9F, -3.8F, 1, 1, 1, 0F,2.2F, 0F, -0.4F, 2.2F, 0F, -0.4F, 2.2F, 0F, 1F, 2.2F, 0F, 1F, 2.2F, 1.5F, 0.9F, 2.2F, 1.5F, 0.9F, 2.2F, 1.5F, 1.2F, 2.2F, 1.5F, 1.2F); // Box 10
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4.5F, -5.5F, -8.5F, 9, 1, 2, 0F,-1.8F, -0.8F, -1.3F, -1.8F, -0.8F, -1.3F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0F, -1.8F, 0.9F, 0.3F, -1.8F, 0.9F, 0.3F, 1F, 0.5F, -0.1F, 1F, 0.5F, -0.1F); // Box 14
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -6F, -6.5F, 9, 1, 3, 0F,0.2F, -1F, 0F, 0.2F, -1F, 0F, -0.1F, 0F, 0.7F, 0.2F, 0F, 0.7F, 1F, 1F, 0.1F, 1F, 1F, 0.1F, -1.4F, 0F, 4.3F, -1.3F, 0F, 4.3F); // Box 29
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-1F, -10.5F, 6.1F, 2, 12, 1, 0F,0.3F, 0F, 0.8F, 0.3F, 0F, 0.8F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, 0.5F, 2F, 2F, 0.5F, 2F, 2F); // Box 15
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1F, -13.5F, 5.1F, 2, 3, 2, 0F,0.3F, 1F, 4F, 0.3F, 1F, 4F, 0.3F, -1F, -1.5F, 0.3F, -1F, -1.5F, 0.3F, 2F, -0.2F, 0.3F, 2F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F); // Box 16
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1F, -14F, 0.1F, 2, 4, 4, 0F,0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1F, -12F, 4.1F, 2, 5, 2, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -4.5F, -3F, 8, 5, 1, 0F,1.2F, 0F, -0.3F, 1.2F, 0F, -0.3F, 1.2F, 0F, 0.8F, 1.2F, 0F, 0.8F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F); // Box 12
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-2F, -5.5F, -2.5F, 4, 1, 1, 0F,3.5F, 0.2F, 0F, 3.5F, 0.2F, 0F, 3.5F, 0.2F, 0.5F, 3.5F, 0.2F, 0.5F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0.5F); // Box 41
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(0F, -9F, -4F, 4, 3, 8, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, 1.3F, 0.2F, 0F, 1.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 1.5F, 0.9F, -0.5F, 1.5F); // Box 50
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -6.6F, -5F, 8, 2, 9, 0F,0.9F, 1.8F, 0F, 0.9F, 1.8F, 0F, 0.9F, 0F, 2F, 0.9F, 0F, 2F, 1F, -0.5F, 0.9F, 1F, -0.5F, 0.9F, 1.1F, 1.4F, 1.3F, 1.1F, 1.4F, 1.3F); // Box 22
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-1F, -14F, -2.9F, 2, 4, 4, 0F,0F, 0.7F, 0.3F, 0F, 0.7F, 0.3F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.5F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 23
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1F, -12F, 6.1F, 2, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -3F, -0.7F, 0F, -3F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.7F, 0F, -1F, -0.7F); // Box 24
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-1F, -15.5F, -3F, 2, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 25
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1F, -17.5F, -3.75F, 2, 1, 2, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 26
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-1F, -17F, -3.55F, 2, 2, 2, 0F,-0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.7F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 27
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1F, -14.5F, -2.9F, 2, 1, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -3F, 0.3F, 0F, -3F, 0F, 1F, 2F, 0F, 1F, 2F); // Box 28
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(5F, -8F, -1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(5F, -9F, -1F, 1, 1, 1, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 30
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(5F, -19F, -1F, 1, 8, 1, 0F,1F, 0.2F, 0.8F, 1F, 0.2F, 0.8F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 2F, 0.5F); // Box 31
		headModel[23].setRotationPoint(0F, 0F, 0F);
	}
}