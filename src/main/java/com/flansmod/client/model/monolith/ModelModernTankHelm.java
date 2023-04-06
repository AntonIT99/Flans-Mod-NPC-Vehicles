//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: natoTank
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelModernTankHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelModernTankHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[27];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 21
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 25
		headModel[4] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 14
		headModel[5] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 15
		headModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 18
		headModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 22
		headModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[9] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 26
		headModel[10] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 27
		headModel[11] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 28
		headModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 29
		headModel[13] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 30
		headModel[14] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 31
		headModel[15] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 32
		headModel[16] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 33
		headModel[17] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 34
		headModel[18] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 35
		headModel[19] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 36
		headModel[20] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 37
		headModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 38
		headModel[22] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 39
		headModel[23] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 40
		headModel[24] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 41
		headModel[25] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 42
		headModel[26] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 43

		headModel[0].addShapeBox(-4F, -8F, -4.15F, 8, 3, 8, 0F,0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.7F, 0.5F, 0.15F, 0.7F, 0.5F, 0.15F, 2.5F, 0.6F, 0.15F, 2.5F, 0.6F); // Box 20
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8.4F, -4F, 8, 1, 8, 0F,-1.5F, 0.5F, -1.9F, -1.5F, 0.5F, -1.9F, -1.5F, 0.7F, -1.85F, -1.5F, 0.7F, -1.85F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, 0.5F, 0.15F, -0.75F, 0.5F); // Box 21
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5.1F, -1F, 4, 3, 5, 0F,0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.1F, 2F, 1F, 0.1F, 2F, 1F, 0.2F, 0.5F, 0.5F, 0.2F, 1F, 0.5F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -1F, -3.5F, 8, 1, 2, 0F,0.15F, 1F, -0.5F, 0.15F, 1F, -0.5F, 0.15F, 0.4F, 2F, 0.15F, 0.4F, 2F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F); // Box 25
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5.75F, -5F, -2.5F, 2, 4, 4, 0F,0.2F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F); // Box 14
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3.75F, -5F, -2.5F, 2, 4, 4, 0F,0F, 0F, 0F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.3F, 0F); // Box 15
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -8F, -3.9F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 1.2F, 0.9F, -0.5F, 1.2F); // Box 18
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -9.8F, -3.9F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F); // Box 22
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -5.5F, -3.9F, 1, 3, 1, 0F,0.9F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, -1.6F, 0.9F, 0F, -2.2F, 0.9F, 0F, -1.6F, 0F, 0.9F, -1.6F, 0F); // Box 28
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -5.5F, -2.9F, 8, 3, 1, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, -1.6F, 0F, 0.9F, -1.6F, 0F, 0.9F, -2.5F, 0F, 0.9F, -2.5F, 0F); // Box 26
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -5.5F, -1.9F, 8, 3, 2, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0.5F, 0.9F, 0F, 0.5F, 0.9F, -2.5F, 0F, 0.9F, -2.5F, 0F, 0.9F, -2.5F, 0.5F, 0.9F, -2.5F, 0.5F); // Box 27
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -5.5F, 0.6F, 8, 3, 1, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, -2.5F, 0F, 0.9F, -2.5F, 0F, 0.9F, -1.5F, 0F, 0.9F, -1.5F, 0F); // Box 28
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -5.5F, 1.6F, 8, 4, 1, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, -2.5F, 0F, 0.9F, -2.5F, 0F, 0.9F, -0.6F, -0.5F, 0.9F, -0.6F, -0.5F); // Box 29
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -5.5F, 2.1F, 8, 5, 3, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0.2F, 0.9F, 0F, 0.2F, 0.9F, -1.6F, 0F, 0.9F, -1.6F, 0F, 0.9F, -1.2F, 0F, 0.9F, -1.2F, 0F); // Box 30
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -4.5F, -3.2F, 8, 3, 2, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 1F, -0.2F, 0.15F, 1F, -0.2F, 0.15F, 0F, 0F, 0.15F, 0F, 0F); // Box 31
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(3F, -5.5F, -3.9F, 1, 3, 1, 0F,0F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0.9F, 0.9F, -1.6F, 0.9F, 0.9F, -1.6F, 0F, 0F, -1.6F, 0F); // Box 32
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2F, -5.5F, -3.9F, 2, 3, 1, 0F,1F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, -2.2F, 0.9F, 0F, -2.7F, 0.9F, 0F, -1.6F, 0F, 1F, -1.6F, 0F); // Box 33
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(0F, -5.5F, -3.9F, 2, 3, 1, 0F,0F, 0F, 0.9F, 1F, 0F, 0.9F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.7F, 0.9F, 1F, -2.2F, 0.9F, 1F, -1.6F, 0F, 0F, -1.6F, 0F); // Box 34
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(0F, -5.1F, -1F, 4, 3, 5, 0F,0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.1F, 2F, 1F, 0.1F, 2F, 1F, 0.2F, 1F, 0.5F, 0.2F, 0.5F, 0.5F); // Box 35
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4.75F, -5F, -2.5F, 1, 3, 1, 0F,-0.2F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, -0.2F, 0F, -1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 36
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3.75F, -5F, -2.5F, 1, 3, 1, 0F,0F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 37
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-6.5F, -3F, -1F, 1, 1, 1, 0F,0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-7.2F, -2.5F, -4F, 1, 1, 5, 0F,-1.2F, -1F, 0F, 0.8F, -1F, 0F, -0.2F, 1F, -0.4F, -0.2F, 1F, -0.4F, -1.2F, 1F, 0F, 0.8F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F); // Box 39
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-6.2F, -0.5F, -6F, 1, 1, 2, 0F,-3.2F, 0F, 0F, 2.8F, 0.2F, -1F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -3.2F, 0F, 0F, 2.8F, -0.2F, -1F, -0.2F, -1F, 0F, -0.2F, -1F, 0F); // Box 40
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-3.2F, -0.5F, -6F, 2, 1, 1, 0F,0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0.2F, 0F, 1.2F, 0.2F, 0F, 0F, 0F, 0F); // Box 41
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-2F, -0.7F, -4.2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-0.5F, -4.5F, 2.1F, 1, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1F, 0.1F, 0F, -1F, 0.1F); // Box 43
		headModel[26].setRotationPoint(0F, 0F, 0F);
	}
}