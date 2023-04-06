//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGermArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelGermArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 19
		bodyModel[1] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		bodyModel[4] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 3

		bodyModel[0].addShapeBox(-4F, 10F, -2F, 8, 5, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F); // Box 19
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 12, 5, 0F,1F, 0.1F, -0.2F, 1F, 0.1F, -0.2F, 1F, 0.1F, -0.2F, 1F, 0.1F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F, 0.3F, 0.2F, -0.2F); // Box 0
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 12, 5, 0F,1.3F, 0.4F, 0.1F, 1.3F, 0.4F, 0.1F, 1.3F, 0.4F, 0.1F, 1.3F, 0.4F, 0.1F, 0.6F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F, 0.6F, 0.5F, 0.1F); // Box 1
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 12, 5, 0F,1.6F, 0.7F, 0.4F, 1.6F, 0.7F, 0.4F, 1.6F, 0.7F, 0.4F, 1.6F, 0.7F, 0.4F, 0.9F, 0.8F, 0.4F, 0.9F, 0.8F, 0.4F, 0.9F, 0.8F, 0.4F, 0.9F, 0.8F, 0.4F); // Box 2
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 12, 5, 0F,2.2F, 1.2F, 0.8F, 2.2F, 1.2F, 0.8F, 2.2F, 1.2F, 0.8F, 2.2F, 1.2F, 0.8F, 1.5F, 1.2F, 0.8F, 1.5F, 1.2F, 0.8F, 1.5F, 1.2F, 0.8F, 1.5F, 1.2F, 0.8F); // Box 3
		bodyModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 2
		leftLegModel[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 3
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 5

		leftLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 8, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 2
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 3
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 9.4F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 4
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 22
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 0
		rightLegModel[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 1

		rightLegModel[0].addShapeBox(-2F, 9.4F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 8, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 22
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 9F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.7F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}