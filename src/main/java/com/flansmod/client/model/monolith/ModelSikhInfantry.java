//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SikhInfantry
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSikhInfantry extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelSikhInfantry() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[14];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 15
		bodyModel[3] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 34
		bodyModel[4] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 35
		bodyModel[5] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 36
		bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 57
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 58
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 59
		bodyModel[9] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 36
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		bodyModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 38
		bodyModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 45
		bodyModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 46

		bodyModel[0].addShapeBox(-4F, -0.2F, -2F, 4, 8, 4, 0F,0.7F, 0.1F, 0.4F, 0F, 0.15F, 0.45F, 0F, 0.15F, 0.5F, 0.7F, 0.1F, 0.5F, 0.3F, 0F, 0.4F, 0F, 0.2F, 0.45F, 0F, 0.2F, 0.5F, 0.3F, 0F, 0.5F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, -0.2F, -2F, 4, 8, 4, 0F,0.5F, 0.25F, 0.5F, 0.7F, 0.1F, 0.5F, 0.7F, 0.1F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0F, 0.2F, 0.5F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3F, -1.2F, -2F, 6, 1, 4, 0F,0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F); // Box 15
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.5F, -2.5F, 2, 9, 5, 0F,0.3F, -0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 0.3F, -0.1F, 0.2F, -8.7F, 1.8F, 0.4F, 6.5F, -0.2F, 0.2F, 6.5F, -0.2F, 0.2F, -8.7F, 1.8F, 0.4F); // Box 34
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2F, -0.5F, -2.5F, 2, 9, 5, 0F,-0.3F, 0.1F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F, 0.2F, -0.3F, 0.1F, 0.2F, 6.5F, -0.2F, 0.2F, -8.7F, 1.8F, 0.4F, -8.7F, 1.8F, 0.4F, 6.5F, -0.2F, 0.2F); // Box 35
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-0.3F, -0.2F, -2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 36
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-0.3F, 1.3F, -2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 57
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.3F, 6.8F, -2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 58
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.3F, 5.5F, -2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 59
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 8F, -2F, 4, 2, 4, 0F,0.3F, 0.2F, 0.4F, 0F, 0F, 0.45F, 0F, 0F, 0.5F, 0.3F, 0.2F, 0.5F, 0.7F, 0.1F, 0.7F, 0F, 0.15F, 0.75F, 0F, 0.15F, 0.8F, 0.7F, 0.1F, 0.8F); // Box 36
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 8F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0.25F, 0.8F, 0.7F, 0.1F, 0.8F, 0.7F, 0.1F, 0.8F, 0F, 0.2F, 0.8F); // Box 37
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.3F, 2.9F, -3F, 1, 1, 1, 0F,1.2F, 0F, 0.1F, -1F, 1F, 0F, -1F, 1F, 0F, 1.2F, 0F, 0F, -0.4F, 1F, 0.2F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, -0.4F, 1F, 0F); // Box 38
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.3F, 8.1F, -2.8F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 45
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.3F, 9.4F, -2.9F, 1, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 46
		bodyModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 55
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 56

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F); // Box 55
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 6F, -2F, 4, 2, 4, 0F,0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F); // Box 56
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 46
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 37

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F); // Box 46
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6F, -2F, 4, 2, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.1F, 0.1F, 0.3F, 0.4F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.3F, 0.4F, 0.2F); // Box 37
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 44
		leftLegModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 47
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 48
		leftLegModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 49
		leftLegModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 50
		leftLegModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 51
		leftLegModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 52

		leftLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 7, 4, 0F,0.5F, -0.25F, 0.8F, 0.7F, -0.1F, 0.8F, 0.7F, -0.15F, 0.8F, 0F, -0.1F, 0.8F, -0.4F, 0.5F, 0.9F, 1.5F, 0F, 0.9F, 1.5F, 0F, 0.9F, -0.4F, 0.5F, 0.9F); // Box 44
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -0.5F, -2F, 4, 5, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F); // Box 47
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 5.5F, -2F, 4, 5, 4, 0F,0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 48
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 49
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 9.8F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 50
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 10F, -4.8F, 4, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, -1.1F, 0.5F, 0.2F, -1.1F, 0.5F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 51
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, -2.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 52
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 4
		rightLegModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 30
		rightLegModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 31
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 11
		rightLegModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 61
		rightLegModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 41
		rightLegModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 42

		rightLegModel[0].addShapeBox(-2F, -2.5F, -2F, 4, 2, 4, 0F,0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F); // Box 4
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, -0.5F, -2F, 4, 5, 4, 0F,0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F); // Box 30
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 5.5F, -2F, 4, 5, 4, 0F,0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 31
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 9.8F, -2F, 4, 1, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 10F, -4.8F, 4, 2, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, -1.1F, 0.5F, 0.2F, -1.1F, 0.5F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 41
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, -2F, -2F, 4, 7, 4, 0F,0.7F, -0.15F, 0.7F, 0F, -0.1F, 0.75F, 0F, -0.1F, 0.8F, 0.7F, -0.15F, 0.8F, 1.5F, 0F, 0.88F, -0.4F, 0.5F, 0.88F, -0.4F, 0.5F, 0.88F, 1.5F, 0F, 0.88F); // Box 42
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);
	}
}