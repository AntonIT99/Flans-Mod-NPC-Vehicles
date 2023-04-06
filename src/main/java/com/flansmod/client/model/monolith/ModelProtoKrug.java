//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ProtoKrug
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelProtoKrug extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelProtoKrug() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];
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
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 48
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 84
		bodyModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 85
		bodyModel[3] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 86
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 45
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 46
		bodyModel[6] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 47
		bodyModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 49
		bodyModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		bodyModel[9] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 51
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 61
		bodyModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 62
		bodyModel[12] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 63
		bodyModel[13] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 64
		bodyModel[14] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 65
		bodyModel[15] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 66
		bodyModel[16] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 67
		bodyModel[17] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 68
		bodyModel[18] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 69

		bodyModel[0].addShapeBox(-4.5F, -0.2F, -2.5F, 9, 11, 5, 0F,0.4F, 0.25F, 0.4F, 0.4F, 0.25F, 0.4F, 0.4F, 0.25F, 0.4F, 0.4F, 0.25F, 0.4F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0.15F); // Box 48
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-1.5F, 3.75F, -3.5F, 3, 1, 1, 0F,0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 84
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1.5F, 2.5F, -3.5F, 3, 1, 1, 0F,-1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 85
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1.5F, 5F, -3.5F, 3, 1, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F); // Box 86
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.8F, 2F, -3.1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.8F, 7F, -2.9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, 7F, -2.9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2.8F, 2F, -3.1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.8F, 7F, -2.9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.5F, 7F, -2.9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 10.55F, -2F, 4, 1, 4, 0F,0.6F, -0.2F, 0.8F, 4.6F, -0.2F, 0.8F, 4.6F, -0.2F, 0.8F, 0.6F, -0.2F, 0.8F, 0.6F, -0.2F, 0.8F, 4.6F, -0.2F, 0.8F, 4.6F, -0.2F, 0.8F, 0.6F, -0.2F, 0.8F); // Box 61
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3.8F, 7F, 1.9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1.5F, 7F, 1.9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.5F, 7F, 1.9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2.8F, 7F, 1.9F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.8F, 2F, 2.1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.8F, 2F, 2.1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.5F, 2F, 2.1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1.5F, 2F, 2.1F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 52
		leftArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 53
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 54
		leftArmModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 55
		leftArmModel[4] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 56

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.3F, 0.4F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.4F, 0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 52
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 5F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 53
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 8F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 54
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(3F, 4F, -2F, 1, 5, 4, 0F,-0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F); // Box 55
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(3F, 0.6F, -2F, 1, 3, 4, 0F,-1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 56
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 56
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 61
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 62
		rightArmModel[3] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 63
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 64

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.4F, 0.3F, 0.3F, 0.3F, 0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F); // Box 56
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 61
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-4F, 4F, -2F, 1, 5, 4, 0F,0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F); // Box 62
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-4F, 0.6F, -2F, 1, 3, 4, 0F,0.4F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, -1.2F, 0.2F, -0.5F, 0.4F, 0.2F, -0.5F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 63
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 8F, -2F, 4, 1, 4, 0F,0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F, 0.4F, -0.2F, 0.4F); // Box 64
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 57
		leftLegModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 58
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 59
		leftLegModel[3] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 60

		leftLegModel[0].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F); // Box 57
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.5F, 5F, -2.7F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-1.5F, 6F, -2.7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.5F, 7F, -2.7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 60
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 37
		rightLegModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 38
		rightLegModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 39
		rightLegModel[3] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 40

		rightLegModel[0].addShapeBox(-1.5F, 6F, -2.7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-1.5F, 5F, -2.7F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-1.5F, 7F, -2.7F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 39
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 6F, -2F, 4, 1, 4, 0F,0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F); // Box 40
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44

		skirtFrontModel[0].addShapeBox(-4F, -1.5F, -2F, 8, 6, 2, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 1.6F, 0F, 1.1F, 1.7F, 0F, 1.1F, 2F, 0.1F, 0.8F, 1.9F, 0.1F, 0.7F); // Box 44
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtRearModel_1()
	{
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 45

		skirtRearModel[0].addShapeBox(-4F, -1.5F, 0F, 8, 6, 2, 0F,0.5F, 0F, 0.6F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.6F, 1.7F, 0F, 0.8F, 1.6F, 0F, 0.7F, 1.6F, 0F, 1.1F, 1.7F, 0F, 1.1F); // Box 45
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);
	}
}