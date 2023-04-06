//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHunRobe extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelHunRobe() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[5];
		rightLegModel = new ModelRendererTurbo[5];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 290
		bodyModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 17

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-5F, 0F, -2F, 4, 9, 4, 0F,-0.65F, 0.1F, 0.35F, -0.65F, 0.1F, 0.35F, 1.35F, 0.1F, 0.35F, -0.65F, 0.1F, 0.35F, -0.65F, 0F, 0.35F, 1.35F, 0F, 0.3F, 1.35F, 0F, 0.35F, -0.65F, 0F, 0.35F); // Box 290
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(1F, 0F, -2F, 4, 9, 4, 0F,-0.65F, 0.1F, 0.35F, -0.65F, 0.1F, 0.35F, -0.65F, 0.1F, 0.35F, 1.35F, 0.1F, 0.35F, 3.35F, 0F, 0.4F, -0.65F, 0F, 0.35F, -0.65F, 0F, 0.35F, 1.35F, 0F, 0.35F); // Box 0
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(1F, 9F, -2F, 4, 8, 4, 0F,3.35F, 0F, 0.35F, -0.65F, 0F, 0.35F, -0.65F, 0F, 0.35F, 1.35F, 0F, 0.35F, 1.35F, 0.5F, 1F, 0F, -1F, 0.35F, -0.2F, 0F, 0.7F, 1.35F, 0F, 0.7F); // Box 1
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-5F, 9F, -2F, 4, 8, 4, 0F,-0.65F, 0F, 0.35F, 0.35F, 0F, 0.2F, 1.35F, 0F, 0.35F, -0.65F, 0F, 0.35F, 0F, -1F, 0.35F, 0.35F, 0F, 0.8F, 1.35F, 0F, 0.7F, -0.2F, 0F, 0.7F); // Box 2
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(4.8F, 12.8F, -1.8F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(4.8F, 17.1F, -0.8F, 2, 1, 4, 0F,0F, 0.1F, 0.6F, 0F, 0.1F, 0.6F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(4.8F, 18.3F, 0.2F, 2, 3, 3, 0F,0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 1F, -2F, 8, 8, 4, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 9
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-7.2F, 10.8F, 1F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-7.2F, 10.8F, 2F, 3, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F); // Box 16
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-7.2F, 10.8F, 0F, 3, 11, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 17
		bodyModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 21

		leftArmModel[0].addShapeBox(-1F, 7.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 3
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 20

		rightArmModel[0].addShapeBox(-3F, 7.5F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2F, -2F, 4, 10, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 23
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 7
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 8
		leftLegModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 10

		leftLegModel[0].addShapeBox(-2F, 10.1F, -3F, 4, 2, 5, 0F,0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 1F, -2F, 4, 6, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 23
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 7
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 8.1F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 8
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10.1F, -3.4F, 4, 2, 1, 0F,0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 10
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 6
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 11
		rightLegModel[2] = new ModelRendererTurbo(this, 25, 97, textureX, textureY); // Box 12
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 13
		rightLegModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 14

		rightLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 6, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 6
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 11
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 8.1F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 12
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10.1F, -3F, 4, 2, 5, 0F,0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 13
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10.1F, -3.4F, 4, 2, 1, 0F,0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 14
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}