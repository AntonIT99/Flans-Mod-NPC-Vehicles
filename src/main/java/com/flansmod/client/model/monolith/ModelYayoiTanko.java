//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: KofunTanko
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYayoiTanko extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelYayoiTanko() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[19];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 13
		bodyModel[2] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 14
		bodyModel[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 15
		bodyModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 45
		bodyModel[6] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 46
		bodyModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 89
		bodyModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 90
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 55
		bodyModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 60
		bodyModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 61
		bodyModel[12] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 62
		bodyModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 63
		bodyModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 64
		bodyModel[15] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 65
		bodyModel[16] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 66
		bodyModel[17] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 91
		bodyModel[18] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 92

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-5F, -0.5F, 1F, 5, 4, 1, 0F,0.6F, 0F, -2F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0.6F, 0F, 1.5F, 0.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.7F, 0.3F, 0F, 1F); // Box 13
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 3.5F, -2F, 4, 3, 1, 0F,-0.1F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, -1F, -0.1F, 0F, -1F, 0.8F, -0.5F, 0.5F, 0F, -0.49F, 0.8F, 0F, -0.5F, 1F, 0.8F, -0.5F, 1F); // Box 14
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 6.5F, -2F, 4, 2, 4, 0F,0.8F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1.4F, 0.8F, 0.5F, 0.9F, 0.5F, 1F, 0.2F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0.5F, 1F, 0.4F); // Box 15
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.5F, -0.5F, -2F, 1, 3, 5, 0F,0.5F, 0F, 0.3F, -0.8F, 0F, 0.3F, -2.5F, 0.2F, 0.7F, 2F, 0.2F, 0.7F, -0.2F, -0.2F, 0.8F, 0F, -0.3F, 0.8F, -2.5F, -2.5F, 0.8F, 2F, -2.5F, 0.8F); // Box 27
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 3.5F, 1F, 4, 3, 1, 0F,1.3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.7F, 1.3F, 0F, 1F, 0.8F, -0.5F, 1.1F, 0F, 0.51F, 1.1F, 0F, -0.5F, 1.4F, 0.8F, -0.5F, 0.9F); // Box 45
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1.5F, -2F, 4, 2, 1, 0F,-0.4F, -0.2F, 0.5F, 0F, -0.2F, 0.8F, 0F, -0.2F, 2F, -0.4F, -0.2F, 1F, -0.1F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 1.7F, -0.1F, 0F, 1F); // Box 46
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.5F, 9F, -3F, 9, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 89
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1F, 9.5F, -3.7F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.8F, 1.2F, -2.9F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 55
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.2F, 1.2F, -2.9F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.05F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 60
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 1.5F, -2F, 4, 2, 1, 0F,0F, -0.2F, 0.8F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 1F, 0F, -0.2F, 2F, 0F, 0F, 0.8F, -0.1F, 0F, 0.6F, -0.1F, 0F, 1F, 0F, 0F, 1.7F); // Box 61
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 3.5F, -2F, 4, 3, 1, 0F,0F, 0F, 0.8F, -0.1F, 0F, 0.6F, -0.1F, 0F, -1F, 0F, 0F, -1F, 0F, -0.49F, 0.8F, 0.8F, -0.5F, 0.5F, 0.8F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 62
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 6.5F, -2F, 4, 2, 4, 0F,0F, 0.5F, 0.8F, 0.8F, 0.5F, 0.5F, 0.8F, 0.5F, 0.9F, 0F, 0.5F, 1.4F, 0F, 1F, 0.8F, 0.5F, 1F, 0.2F, 0.5F, 1F, 0.4F, 0F, 1F, 0.8F); // Box 63
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 3.5F, 1F, 4, 3, 1, 0F,0F, 0F, -1F, 1.3F, 0F, -1F, 1.3F, 0F, 1F, 0F, 0F, 1.7F, 0F, 0.51F, 1.1F, 0.8F, -0.5F, 1.1F, 0.8F, -0.5F, 0.9F, 0F, -0.5F, 1.4F); // Box 64
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, -0.5F, 1F, 5, 4, 1, 0F,0F, 0F, -2.5F, 0.6F, 0F, -2F, 0.6F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 1F, 0F, 0F, 1.7F); // Box 65
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2.5F, -0.5F, -2F, 1, 3, 5, 0F,-0.8F, 0F, 0.3F, 0.5F, 0F, 0.3F, 2F, 0.2F, 0.7F, -2.5F, 0.2F, 0.7F, 0F, -0.3F, 0.8F, -0.2F, -0.2F, 0.8F, 2F, -2.5F, 0.8F, -2.5F, -2.5F, 0.8F); // Box 66
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1F, 10.5F, -3.5F, 2, 5, 1, 0F,-0.2F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.2F, 0F, 0F, -1.5F, 0.5F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0F, -1.5F, 0.5F, 0F); // Box 91
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1F, 10.5F, -3.4F, 2, 5, 1, 0F,0F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.5F, 0F, 2F, 0F, 0.5F, -1.5F, 0.5F, 0.5F, -1.5F, 0.5F, 0F, 2F, 0F, 0F); // Box 92
		bodyModel[18].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 48
		leftArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 49

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 3, 4, 0F,0.35F, 0.35F, 0.35F, 0.2F, 0.2F, 0.35F, 0.2F, 0.2F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 1.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0.5F, 0.35F, 0.35F, 0.35F, 1.35F, 0.35F); // Box 48
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 49
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 29
		rightArmModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 53

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 3, 4, 0F,0.2F, 0.2F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.35F, 0.2F, 0.2F, 0.35F, 0.5F, 0.35F, 0.35F, 0.35F, 1.35F, 0.35F, 0.35F, 1.35F, 0.35F, 0.5F, 0.35F, 0.35F); // Box 29
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 53
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 75
		leftLegModel[1] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 47

		leftLegModel[0].addShapeBox(-2F, 6.5F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.05F, -1F, 0.05F, 0.05F, -1F, 0.05F, 0.05F, -1F, 0.05F, 0.05F, -1F, 0.05F); // Box 75
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, -1.5F, -2F, 4, 7, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.4F, -0.3F, 0.7F, 0.8F, -0.3F, 0.5F, 0.8F, -0.3F, 0.5F, 0.4F, -0.3F, 0.7F); // Box 47
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 7
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		rightLegModel[2] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 51

		rightLegModel[0].addShapeBox(-2F, -1.5F, -2F, 5, 7, 4, 0F,0.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, -0.3F, 0.8F, 0.6F, -0.3F, 1F, 0.6F, -0.3F, 1F, 1F, -0.3F, 0.8F); // Box 7
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6.5F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F); // Box 9
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, -2F, -2F, 4, 2, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 51
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}
}