//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPict extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelPict() //Same as Filename
	{
		headModel = new ModelRendererTurbo[1];
		bodyModel = new ModelRendererTurbo[15];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[11];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box15

		headModel[0].addShapeBox(-4F, -10F, -4F, 8, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box15
		headModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box20
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box36
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box37
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box38
		bodyModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import Box34
		bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box35
		bodyModel[6] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Import Box37
		bodyModel[7] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import Box38
		bodyModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 1
		bodyModel[10] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 2
		bodyModel[11] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 3
		bodyModel[12] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 4
		bodyModel[13] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 7

		bodyModel[0].addShapeBox(-3.5F, 9F, -2.5F, 7, 3, 4, 0F,-1F, 0F, 0.3F, -1F, 0F, 0.3F, 0F, 1F, 0F, 0F, 1F, 0F, -2.8F, 0F, -0.7F, -2.8F, 0F, -0.7F, 0.1F, -2F, 1.1F, 0.1F, -2F, 1.1F); // Import Box20
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.5F, 2.5F, -4F, 2, 3, 3, 0F,1F, -0.5F, -1F, 1F, -1F, -0.5F, 2F, 0F, 1F, 1F, 0F, 1F, 0.5F, -1.3F, -1F, 0.5F, -1F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Import Box36
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 6.5F, -2F, 7, 2, 3, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F); // Import Box37
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, -0.5F, -3.5F, 3, 3, 4, 0F,0F, 0F, -2F, 0F, -0.5F, -2F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, 1F, 0.5F, -0.5F, 0.2F, 1F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F); // Import Box38
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, -0.4F, -1.5F, 5, 1, 3, 0F,0F, -0.2F, 0F, -1.5F, 1.3F, -1F, -0.5F, 1.3F, 0F, 0F, -0.2F, 0.2F, -0.3F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 1.5F, -1.3F, 0F, 0.5F); // Import Box34
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, -0.4F, -1F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0.5F, 0F, 0F, 0.2F, 0.7F, 0F, 0F, 0F, 1F, 0F, -1F, -1F, 0.7F, 0.7F, 0F, 0F); // Import Box35
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -0.4F, -1F, 4, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -2F, 0F, 0.5F, 0F, 1F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1F, -1F, 0.7F); // Import Box37
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, -3F, -1.2F, 3, 3, 3, 0F,0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F); // Import Box38
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0.5F, -0.5F, -3.5F, 3, 3, 4, 0F,0F, -0.5F, -2F, 0F, 0F, -2F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, 0.2F, 1F, 0F, 1F, 0.5F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 0
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 0F, -3.5F, 4, 5, 6, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0.3F, 0.5F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 1
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(1.5F, 2.5F, -4F, 2, 3, 3, 0F,1F, -1F, -0.5F, 1F, -0.5F, -1F, 1F, 0F, 1F, 2F, 0F, 1F, 0.5F, -1F, -1F, 0.5F, -1.3F, -1F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F); // Box 2
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.5F, 0F, -3.5F, 4, 5, 6, 0F,0F, 0.5F, -2F, 0F, 0.5F, -2F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0.3F, 0F, -1F, -0.5F, 0F, 0.5F, -0.5F, 0F, 1F, -1F, 0F, 1F, -1F); // Box 3
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3F, 6.5F, -3F, 6, 2, 1, 0F,0F, 2.5F, 0F, 0F, 2.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 1F, 0.5F, 0F, 1F, 0.5F, 0F); // Box 4
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.5F, -0.4F, -1.5F, 5, 1, 3, 0F,-1.5F, 1.3F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, -0.5F, 1.3F, 0F, 0F, -1F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0.5F, -0.5F, -1F, 1.5F); // Box 6
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2F, 9.5F, -3.5F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F); // Box 7
		bodyModel[14].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 8
		leftArmModel[1] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 9
		leftArmModel[2] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 10

		leftArmModel[0].addShapeBox(-1.5F, -2.5F, -1.5F, 3, 3, 4, 0F,0F, 0F, 0F, 0.2F, -0.5F, -0.6F, 0.2F, -0.5F, -0.6F, 0F, 0F, 0F, -1F, 0F, 0.7F, 1F, 0F, -0.4F, 1F, 0F, 0.3F, -0.5F, 0F, 0.4F); // Box 8
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.7F, -0.5F, -1F, 2, 4, 3, 0F,0.2F, -1F, 1.2F, 1.2F, -1F, 0F, 1.2F, -1F, 0.8F, 0.2F, -1F, 0.9F, -0.5F, 0F, 0.5F, 1F, 0F, 0F, 1F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 9
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.45F, 3.5F, -1F, 2, 6, 3, 0F,-0.3F, 0F, 0.7F, 0.7F, 0F, 0.2F, 0.7F, -0.5F, 0.2F, -0.3F, -0.5F, 0.2F, -0.4F, 0.5F, 1.2F, 0.5F, 0.5F, 1.2F, 0.5F, 1F, -1.5F, -0.4F, 1F, -1.5F); // Box 10
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box20
		rightArmModel[1] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box29
		rightArmModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box30

		rightArmModel[0].addShapeBox(-1.5F, -2.5F, -1.5F, 3, 3, 4, 0F,0.2F, -0.5F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.5F, -0.6F, 1F, 0F, -0.4F, -1F, 0F, 0.7F, -0.5F, 0F, 0.4F, 1F, 0F, 0.3F); // Import Box20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1.2F, -0.5F, -1F, 2, 4, 3, 0F,1.2F, -1F, 0F, 0.2F, -1F, 1.2F, 0.2F, -1F, 0.9F, 1.2F, -1F, 0.8F, 1F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F); // Import Box29
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-1.55F, 3.5F, -1F, 2, 6, 3, 0F,0.7F, 0F, 0.2F, -0.3F, 0F, 0.7F, -0.3F, -0.5F, 0.2F, 0.7F, -0.5F, 0.2F, 0.5F, 0.5F, 1.2F, -0.4F, 0.5F, 1.2F, -0.4F, 1F, -1.5F, 0.5F, 1F, -1.5F); // Import Box30
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Import Box18
		leftLegModel[1] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box19
		leftLegModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box22
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box23
		leftLegModel[4] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box32
		leftLegModel[5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import Box33
		leftLegModel[6] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 15

		leftLegModel[0].addShapeBox(-1.7F, -0.5F, -2F, 4, 6, 4, 0F,0F, 0F, 0.5F, 0.2F, 2.5F, 0.5F, 0.2F, 0F, 0.3F, 0F, 0F, 0.3F, -0.2F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, 0F, -0.2F, 0F, 0F); // Import Box18
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.7F, 5.5F, -2F, 3, 7, 4, 0F,-0.2F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, -0.8F, 0.4F, 0F, -0.8F, 0.4F, 0F, 0F, -0.2F, 0F, 0F); // Import Box19
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-3F, -0.4F, 1F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, -0.5F, -1F); // Import Box22
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-3F, -3.4F, 1F, 2, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1F, -0.8F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0F); // Import Box23
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-1F, -0.0999999999999996F, -2F, 4, 1, 3, 0F,0F, 0.5F, 0F, -0.8F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box32
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1F, -3.1F, -2F, 4, 2, 3, 0F,0F, -0.8F, 0F, -0.8F, 0.1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0.5F, -0.8F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box33
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-1.2F, 11F, -3F, 3, 1, 5, 0F,0.4F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Box 15
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import Box24
		rightLegModel[1] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box25
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box26
		rightLegModel[3] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box27
		rightLegModel[4] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import Box28
		rightLegModel[5] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import Box29
		rightLegModel[6] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box31
		rightLegModel[7] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import Box35
		rightLegModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 11
		rightLegModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 12
		rightLegModel[10] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 13

		rightLegModel[0].addShapeBox(1F, -3.4F, 1F, 2, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Import Box24
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-3F, -3.4F, 1F, 4, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -1.5F, -0.8F, -0.5F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.8F, 0.5F, 0F); // Import Box25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(1F, -0.4F, 1F, 2, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, -1F, 0F, 0F, -1F); // Import Box26
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-3F, -0.4F, 1F, 4, 1, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.8F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1F, -1F, 0F, -1F); // Import Box27
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2.2F, -0.5F, -2F, 4, 6, 4, 0F,0.2F, 2.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0.2F, 0F, 0.3F, -0.4F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.4F, 0F, 0F); // Import Box28
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-1.2F, 5.5F, -2F, 3, 7, 4, 0F,0.4F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Import Box29
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-3F, -0.0999999999999996F, -2F, 4, 1, 3, 0F,-0.8F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, -1F, 0.5F, 0F); // Import Box31
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-3F, -3.1F, -2F, 4, 2, 3, 0F,-0.8F, 0.1F, 0.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.8F, 0.5F, -0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Import Box35
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(3F, -3.4F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1.5F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0.5F); // Box 11
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(3F, -0.4F, 1F, 4, 1, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 12
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-1.2F, 11F, -3F, 3, 1, 5, 0F,0.4F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, -0.8F, -0.2F, 0F, -0.8F, -0.2F, 0F, 0F, 0.4F, 0F, 0F); // Box 13
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);
	}
}