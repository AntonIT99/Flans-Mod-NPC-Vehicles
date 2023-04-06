//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJaguarBody extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelJaguarBody() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[6];
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 290
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 123
		bodyModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 53

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 10, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9F, -2F, 4, 2, 4, 0F, 0.2F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.3F); // Box 15
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 9F, -2F, 4, 2, 4, 0F, 0F, 0F, 0.7F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0F, 0F, 0.7F); // Box 290
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, 11F, -3F, 4, 5, 5, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F); // Box 12
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2F, 11F, -2F, 4, 5, 5, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.55F, 0F, 0F, -0.55F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.55F, 0F, -0.2F, -0.55F); // Box 123
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0F, -3F, 8, 2, 6, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 53
		bodyModel[5].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 14

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 14
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[2];
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		rightArmModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 13

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 0
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6F, -2F, 4, 2, 4, 0F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 13
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[2];
		leftLegModel[0] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		leftLegModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 16

		leftLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 11, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 4
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 2, 4, 0F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 16
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[2];
		rightLegModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		rightLegModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 15

		rightLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 11, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 3
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 2, 4, 0F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 15
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);


	}
}