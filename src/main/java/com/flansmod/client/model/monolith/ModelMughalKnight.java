//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMughalKnight extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMughalKnight() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[17];
		leftArmModel = new ModelRendererTurbo[4];
		rightArmModel = new ModelRendererTurbo[4];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtFrontModel = new ModelRendererTurbo[1];
		skirtRearModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
		initskirtRearModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 7
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 16, 0, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 19

		bodyModel[0].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 2.5F, -2.5F, 6, 7, 1, 0F,0.35F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 0
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3F, -0.5F, -2.5F, 1, 3, 5, 0F,-0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F); // Box 6
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(2F, -0.5F, -2.5F, 1, 3, 5, 0F,-0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F, -0.2F, 0F, 0.15F); // Box 7
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5F, 4F, -2F, 1, 6, 4, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.6F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -0.6F, 0F, 0.2F); // Box 9
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.1F, 4.5F, -3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, 0.5F, -0.3F, 0F, -0.3F, -0.3F, 0.1F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, 0.5F, -0.3F, 0F); // Box 10
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.9F, 8F, -3F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.1F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, 0.5F, -0.3F, 0F, -0.3F, -0.3F, 0.1F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, 0.5F, -0.3F, 0F); // Box 11
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.1F, 4.5F, 2F, 1, 1, 1, 0F,0.5F, -0.3F, 0F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, -0.3F, -0.3F, 0.1F, 0.5F, -0.3F, 0F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, -0.3F, -0.3F, 0.1F); // Box 12
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3.9F, 8F, 2F, 1, 1, 1, 0F,0.5F, -0.3F, 0F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, -0.3F, -0.3F, 0.1F, 0.5F, -0.3F, 0F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, -0.3F, -0.3F, 0.1F); // Box 13
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3F, 2.5F, 1.5F, 6, 7, 1, 0F,0.35F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F); // Box 14
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(4.1F, 4F, -2F, 1, 6, 4, 0F,-0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -0.6F, 0F, 0.2F, -0.6F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 15
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(3.2F, 4.5F, -3F, 1, 1, 1, 0F,0.8F, -0.3F, 0.35F, -0.3F, -0.3F, 0.1F, 0.5F, -0.3F, 0F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, -0.3F, -0.3F, 0.1F, 0.5F, -0.3F, 0F, 0.8F, -0.3F, 0.35F); // Box 16
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3F, 8F, -3F, 1, 1, 1, 0F,0.8F, -0.3F, 0.35F, -0.3F, -0.3F, 0.1F, 0.5F, -0.3F, 0F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, -0.3F, -0.3F, 0.1F, 0.5F, -0.3F, 0F, 0.8F, -0.3F, 0.35F); // Box 17
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(3F, 8F, 2F, 1, 1, 1, 0F,0.8F, -0.3F, 0.35F, 0.5F, -0.3F, 0F, -0.3F, -0.3F, 0.1F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, 0.5F, -0.3F, 0F, -0.3F, -0.3F, 0.1F, 0.8F, -0.3F, 0.35F); // Box 18
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(3.2F, 4.5F, 2F, 1, 1, 1, 0F,0.8F, -0.3F, 0.35F, 0.5F, -0.3F, 0F, -0.3F, -0.3F, 0.1F, 0.8F, -0.3F, 0.35F, 0.8F, -0.3F, 0.35F, 0.5F, -0.3F, 0F, -0.3F, -0.3F, 0.1F, 0.8F, -0.3F, 0.35F); // Box 19
		bodyModel[16].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 20
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		leftArmModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 22
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 23

		leftArmModel[0].addShapeBox(-1F, 7.9F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 20
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 4.6F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F); // Box 21
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(2F, 1.1F, -2F, 1, 4, 4, 0F,-0.3F, 1F, 0.3F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, -0.3F, 1F, 0.3F, 0.3F, -0.5F, 0.3F, 0.4F, -0.5F, 0.3F, 0.4F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F); // Box 22
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F); // Box 23
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		rightArmModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4.6F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 1.1F, -2F, 1, 4, 4, 0F,0.7F, 0F, 0.3F, -0.3F, 1F, 0.3F, -0.3F, 1F, 0.3F, 0.7F, 0F, 0.3F, 0.4F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.4F, -0.5F, 0.3F); // Box 0
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 7.9F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 2
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 25
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26

		leftLegModel[0].addShapeBox(-2F, 1F, -2F, 4, 10, 4, 0F,0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.6F, -2.9F, 0.6F, 0.6F, -2.9F, 0.6F, 0.6F, -2.9F, 0.6F, 0.6F, -2.9F, 0.6F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F); // Box 25
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10.1F, -2.3F, 4, 2, 5, 0F,0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 26
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 4

		rightLegModel[0].addShapeBox(-2F, 10.1F, -2.3F, 4, 2, 5, 0F,0.1F, -0.5F, 0.5F, 0.1F, -0.5F, 0.5F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F, 0.1F, 0.4F, 0.1F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 1F, -2F, 4, 10, 4, 0F,0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.6F, -2.9F, 0.6F, 0.6F, -2.9F, 0.6F, 0.6F, -2.9F, 0.6F, 0.6F, -2.9F, 0.6F); // Box 4
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 1

		skirtFrontModel[0].addShapeBox(-4F, -4.1F, -3.2F, 8, 10, 4, 0F,0.2F, -0.5F, -0.8F, 0.2F, -0.5F, -0.8F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.4F, -2.9F, -0.6F, 0.4F, -2.9F, -0.6F, 0.4F, -2.9F, 0.4F, 0.4F, -2.9F, 0.4F); // Box 1
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 3

		skirtRearModel[0].addShapeBox(-4F, -4.1F, -1.8F, 8, 10, 4, 0F,0.2F, -0.5F, -0.8F, 0.2F, -0.5F, -0.8F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.4F, -2.9F, -0.6F, 0.4F, -2.9F, -0.6F, 0.4F, -2.9F, 0.4F, 0.4F, -2.9F, 0.4F); // Box 3
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}