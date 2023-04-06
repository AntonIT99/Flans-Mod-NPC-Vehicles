//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RomanCrown
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRomanCrown extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelRomanCrown() //Same as Filename
	{
		headModel = new ModelRendererTurbo[20];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		headModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 41
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 42
		headModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 43
		headModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 44
		headModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 45
		headModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 46
		headModel[8] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 47
		headModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 48
		headModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 49
		headModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 54
		headModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 55
		headModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 56
		headModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 59
		headModel[15] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 60
		headModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 61
		headModel[17] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 62
		headModel[18] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 63
		headModel[19] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 64

		headModel[0].addShapeBox(-8.5F, -10F, -4F, 8, 8, 8, 0F,-3.1F, -2.3F, 0.9F, 0.5F, -1.6F, 1.3F, 0.5F, -1.6F, 1.3F, -3.1F, -2.3F, 0.9F, -3.6F, -3F, 0.4F, 0.5F, -3F, 0.9F, 0.5F, -3F, 0.9F, -3.6F, -3F, 0.4F); // Box 19
		headModel[0].setRotationPoint(0F, -0.5F, 0F);

		headModel[1].addShapeBox(0.5F, -10F, -4F, 8, 8, 8, 0F,0.5F, -1.6F, 1.3F, -3.1F, -2.3F, 0.9F, -3.1F, -2.3F, 0.9F, 0.5F, -1.6F, 1.3F, 0.5F, -3F, 0.9F, -3.6F, -3F, 0.4F, -3.6F, -3F, 0.4F, 0.5F, -3F, 0.9F); // Box 40
		headModel[1].setRotationPoint(0F, -0.5F, 0F);

		headModel[2].addShapeBox(-4.8F, -5.5F, -3.5F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 41
		headModel[2].setRotationPoint(0F, 0.5F, 0F);

		headModel[3].addShapeBox(3.8F, -5.5F, -3.5F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 42
		headModel[3].setRotationPoint(0F, 0.5F, 0F);

		headModel[4].addShapeBox(-4.8F, -5.5F, -1.5F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 43
		headModel[4].setRotationPoint(0F, 0.5F, 0F);

		headModel[5].addShapeBox(3.8F, -5.5F, -1.5F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 44
		headModel[5].setRotationPoint(0F, 0.5F, 0F);

		headModel[6].addShapeBox(-0.5F, -10.2F, -5.4F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 45
		headModel[6].setRotationPoint(0F, 0.5F, 0F);

		headModel[7].addShapeBox(-0.5F, -10.1F, -5.4F, 1, 1, 1, 0F,0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F); // Box 46
		headModel[7].setRotationPoint(0F, 0.5F, 0F);

		headModel[8].addShapeBox(-0.5F, -7.7F, -5.4F, 1, 2, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 47
		headModel[8].setRotationPoint(0F, 0.5F, 0F);

		headModel[9].addShapeBox(-3.5F, -7.5F, -5.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 48
		headModel[9].setRotationPoint(0F, 0.5F, 0F);

		headModel[10].addShapeBox(2.5F, -7.5F, -5.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 49
		headModel[10].setRotationPoint(0F, 0.5F, 0F);

		headModel[11].addShapeBox(-3.5F, -7.5F, 4.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 54
		headModel[11].setRotationPoint(0F, 0.5F, 0F);

		headModel[12].addShapeBox(-0.5F, -7.5F, 4.3F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 55
		headModel[12].setRotationPoint(0F, 0.5F, 0F);

		headModel[13].addShapeBox(2.5F, -7.5F, 4.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 56
		headModel[13].setRotationPoint(0F, 0.5F, 0F);

		headModel[14].addShapeBox(-5.5F, -7.5F, -0.5F, 1, 2, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 59
		headModel[14].setRotationPoint(0F, 0.5F, 0F);

		headModel[15].addShapeBox(-5.5F, -7.5F, -3.2F, 1, 2, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 60
		headModel[15].setRotationPoint(0F, 0.5F, 0F);

		headModel[16].addShapeBox(-5.5F, -7.5F, 2.2F, 1, 2, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 61
		headModel[16].setRotationPoint(0F, 0.5F, 0F);

		headModel[17].addShapeBox(4.5F, -7.5F, -3.2F, 1, 2, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 62
		headModel[17].setRotationPoint(0F, 0.5F, 0F);

		headModel[18].addShapeBox(4.5F, -7.5F, -0.5F, 1, 2, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 63
		headModel[18].setRotationPoint(0F, 0.5F, 0F);

		headModel[19].addShapeBox(4.5F, -7.5F, 2.2F, 1, 2, 1, 0F,0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F); // Box 64
		headModel[19].setRotationPoint(0F, 0.5F, 0F);
	}
}