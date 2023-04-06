//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ArabeArmor
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelArabeArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelArabeArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 289
		bodyModel[3] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 290
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 293
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 294
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 297
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 299

		bodyModel[0].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.3F, 1F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 1F, 0.4F, 0.3F, -1F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, 0F, 0.4F, 0.3F, -1F, 0.4F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9.8F, -2F, 8, 4, 4, 0F,0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.2F, 0.1F, 0.3F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2F, 8, 10, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 289
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 9.8F, -2F, 8, 8, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 290
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(4F, 8.5F, -3F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 1F); // Box 293
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0.5F, -0.4F, -2F, 4, 2, 4, 0F,-0.8F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.4F, 5.2F, 0.8F, 0.2F, 5.7F, 0.5F, 0.2F, 5.7F, 0.5F, -0.5F, 5.2F, 0.7F); // Box 294
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.8F, -0.4F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.5F, -0.8F, 0F, 0.5F, -0.8F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 5.7F, 0.5F, -0.4F, 5.2F, 0.8F, -0.5F, 5.2F, 0.7F, 0.2F, 5.7F, 0.5F); // Box 297
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2F, -0.4F, -2F, 4, 2, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, 0.7F, 0F, 0F, 0.5F); // Box 299
		bodyModel[7].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 21
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 296

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 9, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.0999999999999996F, -2.4F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 5.7F, 0.5F, 0F, 7.2F, 0.5F, 0F, 7.2F, 0.5F, 0.2F, 5.7F, 0.5F); // Box 296
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 20
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 298

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 9, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4.1F, -2.4F, -2F, 4, 2, 4, 0F,-0.4F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 7.2F, 0.5F, 0.2F, 5.7F, 0.5F, 0.2F, 5.7F, 0.5F, 0F, 7.2F, 0.5F); // Box 298
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 292

		leftLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 1.8F, -2F, 4, 7, 4, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, -1.6F, 0.1F, 0.8F, 1.3F, -0.9F, 0.8F, 1.3F, -0.9F, 0.8F, -1.6F, 0.1F, 0.8F); // Box 292
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 291

		rightLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 1.8F, -2F, 4, 7, 4, 0F,0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 1.4F, -0.9F, 0.8F, -0.6F, 0.1F, 0.8F, -0.6F, 0.1F, 0.8F, 1.4F, -0.9F, 0.8F); // Box 291
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}