//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NapoleonBritGear
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNapoleonBritGear extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelNapoleonBritGear() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[24];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 48
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 46
		bodyModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 47
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 52
		bodyModel[7] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 56
		bodyModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 57
		bodyModel[9] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 58
		bodyModel[10] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 59
		bodyModel[11] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 60
		bodyModel[12] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 61
		bodyModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 62
		bodyModel[14] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 30
		bodyModel[17] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 37

		bodyModel[0].addShapeBox(-5F, -1F, 3F, 10, 2, 3, 0F,0.0999999999999999F, -0.8F, 0.3F, 0.1F, -0.799999999999999F, 0.3F, 0.0999999999999996F, -0.8F, 0.4F, 0.1F, -0.8F, 0.4F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.0999999999999999F, 0F, -0.5F, 0.0999999999999999F, 0F, -0.5F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-5F, -2F, 3F, 10, 2, 3, 0F,0.0999999999999999F, -0.8F, 0.3F, 0.1F, -0.799999999999999F, 0.3F, 0.0999999999999995F, -0.799999999999999F, 0.4F, 0.1F, -0.8F, 0.4F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.3F, 0.0999999999999999F, -0.2F, 0.4F, 0.0999999999999999F, -0.2F, 0.4F); // Box 2
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-5F, -2F, 3F, 10, 2, 3, 0F,0.1F, 0.3F, -0.5F, 0.1F, 0.3F, -0.5F, 0.0999999999999999F, 0.3F, -0.5F, 0.0999999999999999F, 0.3F, -0.5F, 0.0999999999999999F, -1.2F, 0.3F, 0.1F, -1.2F, 0.3F, 0.0999999999999996F, -1.2F, 0.4F, 0.1F, -1.2F, 0.4F); // Box 3
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-5F, 1F, 2.5F, 10, 6, 3, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 48
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-5F, 9.5F, 3F, 5, 4, 2, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, -0.2F, 0F, 0F, -0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.4F); // Box 46
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-5F, 9.5F, 4.2F, 5, 4, 1, 0F,-0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.4F, -0.2F, -0.4F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.4F, -0.4F, -0.4F); // Box 47
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(3F, 9F, 2.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 3F, -0.3F, -2.3F, -3F, 0F, -2.3F, -3F, 0F, 2F, 3F, -0.3F, 2F); // Box 52
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(3.5F, -1.3F, -2.5F, 1, 1, 5, 0F,0.1F, -0.4F, -1F, 0.4F, -0.6F, -1F, 0.4F, -0.6F, 0F, 0.1F, -0.4F, 0F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 56
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(3.5F, -0.3F, -2.5F, 1, 4, 5, 0F,0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, -0.1F, -0.4F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0F, -0.1F, -0.4F, 0F); // Box 57
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(3.5F, 2.7F, -2.5F, 1, 3, 5, 0F,-0.1F, -0.6F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0F, -0.1F, -0.6F, 0F, -0.88F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.88F, 0F, 0F); // Box 58
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.5F, 1F, 5.5F, 1, 6, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F); // Box 59
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.5F, -3F, 7F, 1, 2, 1, 0F,-0.4F, -0.7F, 1.5F, 0F, -0.7F, 1.5F, 0F, -0.7F, -2.4F, -0.4F, -0.7F, -2.4F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F); // Box 60
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3.5F, -2F, 7F, 1, 2, 1, 0F,-0.4F, -0.8F, 0.6F, 0F, -0.800000000000001F, 0.6F, 0F, -0.800000000000001F, -1.5F, -0.4F, -0.800000000000001F, -1.5F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F); // Box 61
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3.5F, 0F, 7F, 1, 1, 1, 0F,-0.4F, 0.2F, 0.600000000000001F, 0F, 0.2F, 0.6F, 0F, 0.2F, -1.5F, -0.4F, 0.2F, -1.5F, -0.4F, 0.1F, 1.5F, 0F, 0.1F, 1.5F, 0F, 0F, -2.3F, -0.4F, 0F, -2.3F); // Box 62
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(4F, 11.5F, 1F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(4F, 10.5F, 1F, 2, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(4F, 12.5F, 1F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 30
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(2F, -3F, 7F, 1, 2, 1, 0F,-0.4F, -0.7F, 1.5F, 0F, -0.7F, 1.5F, 0F, -0.7F, -2.4F, -0.4F, -0.7F, -2.4F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F); // Box 31
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(2F, -2F, 7F, 1, 2, 1, 0F,-0.4F, -0.8F, 0.6F, 0F, -0.800000000000001F, 0.6F, 0F, -0.800000000000001F, -1.5F, -0.4F, -0.800000000000001F, -1.5F, -0.4F, -0.199999999999999F, 0.600000000000001F, 0F, -0.2F, 0.6F, 0F, -0.2F, -1.5F, -0.4F, -0.2F, -1.5F); // Box 32
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2F, 0F, 7F, 1, 1, 1, 0F,-0.4F, 0.2F, 0.600000000000001F, 0F, 0.2F, 0.6F, 0F, 0.2F, -1.5F, -0.4F, 0.2F, -1.5F, -0.4F, 0.1F, 1.5F, 0F, 0.1F, 1.5F, 0F, 0F, -2.3F, -0.4F, 0F, -2.3F); // Box 33
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, 1F, 5.5F, 1, 6, 1, 0F,-0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F); // Box 34
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4.5F, -1.3F, -2.5F, 1, 1, 5, 0F,0.4F, -0.6F, -1F, 0.1F, -0.4F, -1F, 0.1F, -0.4F, 0F, 0.4F, -0.6F, 0F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F); // Box 35
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4.5F, -0.3F, -2.5F, 1, 4, 5, 0F,0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, -0.5F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0F, 0F, -0.5F, 0F); // Box 36
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4.5F, 2.7F, -2.5F, 1, 3, 5, 0F,0F, -0.5F, 0.1F, -0.1F, -0.6F, 0.1F, -0.1F, -0.6F, 0F, 0F, -0.5F, 0F, -0.1F, 0F, 0F, -0.88F, 0F, 0F, -0.88F, 0F, 0F, -0.1F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(0F, 0F, 0F);
	}
}