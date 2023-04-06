//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 20.12.2019 - 11:13:27
// Last changed on: 20.12.2019 - 11:13:27

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEgyptBody extends ModelCustomArmour //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelEgyptBody() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		bodyModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 18
		bodyModel[4] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 19
		bodyModel[5] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 20

		bodyModel[0].addBox(-3F, 0F, -2F, 1, 4, 4, 0F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 10F, -2F, 8, 2, 4, 0F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F); // Box 6
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(2F, 0F, -2F, 1, 4, 4, 0F); // Box 10
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 8F, -2F, 8, 2, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 18
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 6F, -2F, 8, 2, 4, 0F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F, 0.075F, 0F, 0.075F); // Box 19
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 4F, -2F, 8, 2, 4, 0F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F); // Box 20
		bodyModel[5].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[1];
		leftLegModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 17

		leftLegModel[0].addShapeBox(-1.8F, 0F, -2F, 4, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 17
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[1];
		rightLegModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 12

		rightLegModel[0].addShapeBox(-2.2F, 0F, -2F, 4, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 12
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);


		skirtFrontModel = new ModelRendererTurbo[3];
		skirtFrontModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 13
		skirtFrontModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 14
		skirtFrontModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 18

		skirtFrontModel[0].addShapeBox(-4F, 0F, -2F, 4, 5, 1, 0F, 0.125F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, 0F, -1F, 0.125F, 0F, -1F, 0F, 0.125F, 0F, 0F); // Box 13
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(0F, 0F, -2F, 4, 5, 1, 0F, 0F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0F, -1F, 0F); // Box 14
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-2F, 0F, -2.5F, 4, 5, 1, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F); // Box 18
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);


		skirtRearModel = new ModelRendererTurbo[2];
		skirtRearModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 15
		skirtRearModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 16

		skirtRearModel[0].addShapeBox(0F, 0F, 1F, 4, 5, 1, 0F, 0F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0F, 0F, -1F, 0F); // Box 15
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);

		skirtRearModel[1].addShapeBox(-4F, 0F, 1F, 4, 5, 1, 0F, 0.125F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0.125F, 0F, -1F, 0.125F, 0F, -1F, 0F, 0.125F, 0F, 0F); // Box 16
		skirtRearModel[1].setRotationPoint(0F, 0F, 0F);


	}
}