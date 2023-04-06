//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MamlukMail
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOttomanKrug extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelOttomanKrug() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];
		leftLegModel = new ModelRendererTurbo[7];
		rightLegModel = new ModelRendererTurbo[7];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 34
		bodyModel[3] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 29
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 30
		bodyModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 31
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 32
		bodyModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 33
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 34
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 35
		bodyModel[10] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 36
		bodyModel[11] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 37
		bodyModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 38
		bodyModel[13] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 39
		bodyModel[14] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 41
		bodyModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 42
		bodyModel[17] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 43
		bodyModel[18] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 44
		bodyModel[19] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 45
		bodyModel[20] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 46
		bodyModel[21] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 47
		bodyModel[22] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 48

		bodyModel[0].addShapeBox(-4F, 1.9F, -2F, 8, 10, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.3F, 1.1F, 0.3F, 0.3F, 1.1F, 0.3F, 0.3F, 1.1F, 0.3F, 0.3F, 1.1F, 0.3F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F); // Box 1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F,0F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 34
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 6.4F, -2F, 9, 3, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.9F, 0F, 0F, 0.9F); // Box 29
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4.5F, 3.4F, -2F, 9, 3, 1, 0F,-3F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 30
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 9.4F, -2F, 9, 3, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F); // Box 31
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, 6.4F, -2.2F, 3, 3, 1, 0F,-0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F); // Box 32
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 0.9F, -2F, 3, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 33
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 0.9F, -2F, 2, 2, 1, 0F,-0.3F, -0.8F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.3F, -0.8F, 0.4F, -0.5F, 1.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, 1.4F, 0.4F); // Box 34
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(1.5F, 0.9F, -2F, 2, 2, 1, 0F,0F, 0F, 0.4F, -0.3F, -0.8F, 0.4F, -0.3F, -0.8F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, 1.4F, 0.4F, -0.5F, 1.4F, 0.4F, 0F, 0F, 0.4F); // Box 35
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, -0.4F, -2F, 2, 1, 4, 0F,-0.3F, -0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.3F, -0.2F, 0.4F, -0.8F, 0.8F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.8F, 0.4F); // Box 36
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4.5F, 9.4F, 1F, 9, 3, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F); // Box 37
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.5F, 3.4F, 1F, 9, 3, 1, 0F,-3F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F, -3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 38
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.5F, 6.4F, 1F, 9, 3, 1, 0F,0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 39
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.5F, 6.4F, 1.2F, 3, 3, 1, 0F,-0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F); // Box 40
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 0.9F, 1F, 2, 2, 1, 0F,-0.3F, -0.8F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.3F, -0.8F, 0.4F, -0.5F, 1.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, 1.4F, 0.4F); // Box 41
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.5F, 0.9F, 1F, 2, 2, 1, 0F,0F, 0F, 0.4F, -0.3F, -0.8F, 0.4F, -0.3F, -0.8F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -0.5F, 1.4F, 0.4F, -0.5F, 1.4F, 0.4F, 0F, 0F, 0.4F); // Box 42
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.5F, 0.9F, 1F, 3, 2, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 43
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-5F, 6.7F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F); // Box 44
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-5F, 8.3F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F); // Box 45
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(4F, 8.3F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F); // Box 46
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(4F, 6.7F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F); // Box 47
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2F, -0.4F, -2F, 2, 1, 4, 0F,0F, 0F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0.3F, 0.4F, -0.8F, 0.8F, 0.4F, -0.8F, 0.8F, 0.4F, 0F, 0.3F, 0.4F); // Box 48
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 3
		leftArmModel[2] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 49

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 4.6F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(1F, -2.4F, -2F, 2, 4, 4, 0F,0.8F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.8F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 49
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 2
		rightArmModel[2] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 50

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F, 0.1F, 3.4F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 4.6F, -2F, 4, 4, 4, 0F,0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -2.4F, -2F, 2, 4, 4, 0F,0.15F, 0F, 0.15F, 0.8F, 0F, 0.15F, 0.8F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, 0.5F, 0.15F); // Box 50
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		leftLegModel[2] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 32
		leftLegModel[3] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 33
		leftLegModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		leftLegModel[5] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 35
		leftLegModel[6] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 41

		leftLegModel[0].addShapeBox(-2F, 8.1F, -2.3F, 4, 4, 5, 0F,0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 0
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 1.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 32
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 2.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 33
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 3.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 34
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 4.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 35
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 5F, -2.3F, 4, 3, 5, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1.2F, -0.4F, 0.4F, -1.2F, -0.4F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1.2F, -0.4F, 0.4F, -1.2F, -0.4F); // Box 41
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 36
		rightLegModel[3] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 37
		rightLegModel[4] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 38
		rightLegModel[5] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 39
		rightLegModel[6] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 40

		rightLegModel[0].addShapeBox(-2F, 8.1F, -2.3F, 4, 4, 5, 0F,0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 10, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 4.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 36
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 1.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 37
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 3.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 38
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 2.1F, -2F, 4, 1, 4, 0F,0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F, 0.2F, -0.05F, 0.2F); // Box 39
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 5F, -2.3F, 4, 3, 5, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1.2F, -0.4F, 0.4F, -1.2F, -0.4F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, -1.2F, -0.4F, 0.4F, -1.2F, -0.4F); // Box 40
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);
	}
}