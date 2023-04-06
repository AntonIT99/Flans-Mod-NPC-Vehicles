//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PolishShako
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPolishShako extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelPolishShako() //Same as Filename
	{
		headModel = new ModelRendererTurbo[18];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		headModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		headModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 8
		headModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 12
		headModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14
		headModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		headModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		headModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		headModel[10] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 25
		headModel[11] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 26
		headModel[12] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 28
		headModel[13] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 29
		headModel[14] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 62
		headModel[15] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 85
		headModel[16] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 86
		headModel[17] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 87

		headModel[0].addShapeBox(-5F, -8.5F, -6F, 10, 4, 10, 0F,0F, -2F, -2F, 0F, -2F, -2F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F); // Box 1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -10.5F, -4F, 5, 4, 8, 0F,0F, 2.25F, 2.5F, 1F, 1F, 1F, 1F, -1F, 0.5F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.25F, 0F, 0.7F, 0.25F); // Box 4
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -5.5F, -6F, 5, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -10.5F, -5.66F, 1, 1, 1, 0F,-0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 7
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -10.5F, -5.5F, 1, 1, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.5F, -3F, 8, 6, 1, 0F,0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F, 0.25F, -0.125F, 0F); // Box 12
		headModel[5].setRotationPoint(0F, 0F, 0F);
		headModel[5].rotateAngleX = -0.12217305F;

		headModel[6].addShapeBox(-0.5F, -13.5F, -5.25F, 1, 3, 1, 0F,0.5F, 0.25F, 2.75F, 0.25F, 0.25F, 2.75F, 0.25F, 0.25F, -2.5F, 0.25F, 0.25F, -2.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 0F, 0F, -1.25F); // Box 14
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-6F, -11.5F, -5.2F, 1, 10, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 11
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addBox(-6F, -11.5F, -5.3F, 1, 1, 1, 0F); // Box 12
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-6F, -7.5F, -5.2F, 1, 2, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3F, -8.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 3.075F, -2.475F, 0F, -4.05F, -1.45F, 0F, -4.05F, -1.45F, 0F, 3.075F, -2.475F, 0F); // Box 25
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(5F, -11.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.125F, -0.25F, 0F, 0F, -0.125F, 0F, 2F, -1F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, -1F, 0F); // Box 26
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addBox(5F, -11.5F, -5.3F, 1, 1, 1, 0F); // Box 28
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-6F, -3.5F, -5.2F, 1, 2, 1, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -10.5F, -4F, 5, 4, 8, 0F,1F, 1F, 1F, 0F, 2.25F, 2.5F, 0F, 1F, 1F, 1F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.25F, 0F, 0.5F, 0.25F); // Box 62
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(0F, -5.5F, -6F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -8.5F, -5F, 1, 4, 1, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -3.925F, -1.45F, 0F, 2.95F, -2.475F, 0F, 2.95F, -2.475F, 0F, -3.925F, -1.45F, 0F); // Box 86
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-6F, -11.5F, -5F, 1, 4, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.125F, -0.25F, 0F, -2.5F, 0F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -2.5F, 0F, 0F); // Box 87
		headModel[17].setRotationPoint(0F, 0F, 0F);
	}
}