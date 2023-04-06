//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHastati extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelHastati() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[16];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 290
		bodyModel[3] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 291
		bodyModel[4] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 292
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 9, 57, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 15

		bodyModel[0].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 11.3F, -2F, 8, 4, 4, 0F,0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F, 0.8F, 0.7F, 0.8F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 290
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 9F, -2F, 8, 1, 4, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 291
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 10.3F, -2F, 8, 1, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F, 0.3F); // Box 292
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 1F, -2.5F, 7, 6, 1, 0F,0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 0
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, 6.5F, -2.5F, 6, 1, 5, 0F,1.4F, -0.2F, 0.1F, 1.4F, -0.2F, 0.1F, 1.4F, -2.2F, 0.1F, 1.4F, -2.2F, 0.1F, 1.4F, -0.2F, 0.1F, 1.4F, -0.2F, 0.1F, 1.4F, 1.8F, 0.1F, 1.4F, 1.8F, 0.1F); // Box 5
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-3.5F, -0.5F, -2.5F, 1, 2, 5, 0F,-0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, -0.5F, 0.35F, -0.2F, -0.5F, 0.35F, -0.2F, -1.5F, 0.35F, -0.2F, -1.5F, 0.35F); // Box 6
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.5F, -0.5F, -2.5F, 1, 2, 5, 0F,-0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, 0F, 0.35F, -0.2F, -0.5F, 0.35F, -0.2F, -0.5F, 0.35F, -0.2F, -1.5F, 0.35F, -0.2F, -1.5F, 0.35F); // Box 7
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, -0.7F, 1.8F, 7, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 8
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.9F, 1F, -3.5F, 3, 3, 1, 0F,0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F); // Box 10
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.1F, 1F, -3.5F, 3, 3, 1, 0F,-0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 11
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.1F, 3.5F, -3.5F, 3, 2, 1, 0F,-0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 12
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2.9F, 3.5F, -3.5F, 3, 2, 1, 0F,-0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 13
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-0.1F, 5F, -3.5F, 3, 2, 1, 0F,-0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 14
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2.9F, 5F, -3.5F, 3, 2, 1, 0F,-0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 15
		bodyModel[15].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 21

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 74
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 25

		leftLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 2, 2, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -2.8F, 0.1F, 0F, -2.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F); // Box 74
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7F, -2F, 2, 4, 4, 0F,0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -0.8F, 0.1F, 0F, -0.8F, 0.1F, 0F, 0.1F, 2.1F, 0F, 0.1F, 2.1F, 0F, -1.8F, 0.1F, 0F, -1.8F); // Box 25
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 25

		rightLegModel[0].addShapeBox(-2F, 11.1F, -2F, 4, 1, 4, 0F,0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.4F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);
	}
}