//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelParthianCataphract extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelParthianCataphract() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[26];
		leftArmModel = new ModelRendererTurbo[11];
		rightArmModel = new ModelRendererTurbo[11];
		leftLegModel = new ModelRendererTurbo[11];
		rightLegModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 7
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 13
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 16
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 66
		bodyModel[8] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 67
		bodyModel[9] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 68
		bodyModel[10] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 69
		bodyModel[11] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 70
		bodyModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 71
		bodyModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 72
		bodyModel[14] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 73
		bodyModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 74
		bodyModel[16] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 75
		bodyModel[17] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 76
		bodyModel[18] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 77
		bodyModel[19] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 78
		bodyModel[20] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 79
		bodyModel[21] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 80
		bodyModel[22] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 81
		bodyModel[23] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 82
		bodyModel[24] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 83
		bodyModel[25] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 84

		bodyModel[0].addShapeBox(-8F, -6F, -4F, 16, 23, 8, 0F,-3.9F, -5.9F, -1.9F, -3.9F, -5.9F, -1.9F, -3.9F, -5.9F, -1.9F, -3.9F, -5.9F, -1.9F, -3.9F, -4.9F, -1.9F, -3.9F, -4.9F, -1.9F, -3.9F, -4.9F, -1.9F, -3.9F, -4.9F, -1.9F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 7
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.5F, 7.1F, -2.9F, 1, 2, 1, 0F,0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F); // Box 9
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, 4.4F, -2.9F, 1, 2, 1, 0F,0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F); // Box 13
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-1.5F, 4.4F, -2.9F, 1, 2, 1, 0F,0.4F, 0.9F, -0.2F, 0.4F, 0.9F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F); // Box 14
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.9F, 7.1F, -1.5F, 1, 2, 1, 0F,-0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F); // Box 15
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4.9F, 4.4F, -1.5F, 1, 2, 1, 0F,-0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F); // Box 16
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 7.1F, -2.9F, 1, 2, 1, 0F,0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F); // Box 66
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.5F, 7.1F, -2.9F, 1, 2, 1, 0F,0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F); // Box 67
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.5F, 7.1F, -2.9F, 1, 2, 1, 0F,0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F); // Box 68
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0.5F, 4.4F, -2.9F, 1, 2, 1, 0F,0.4F, 0.9F, -0.2F, 0.4F, 0.9F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F); // Box 69
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2.5F, 4.4F, -2.9F, 1, 2, 1, 0F,0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F); // Box 70
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2.5F, 4.4F, 1.9F, 1, 2, 1, 0F,0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F); // Box 71
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.5F, 4.4F, 1.9F, 1, 2, 1, 0F,0.5F, 1F, -0.2F, 0.5F, 1F, -0.2F, 0.4F, 0.9F, -0.2F, 0.4F, 0.9F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F); // Box 72
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-1.5F, 4.4F, 1.9F, 1, 2, 1, 0F,0.5F, 1F, -0.2F, 0.5F, 1F, -0.2F, 0.4F, 0.9F, -0.2F, 0.4F, 0.9F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F); // Box 73
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 4.4F, 1.9F, 1, 2, 1, 0F,0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F); // Box 74
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3.5F, 7.1F, 1.9F, 1, 2, 1, 0F,0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F); // Box 75
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.5F, 7.1F, 1.9F, 1, 2, 1, 0F,0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F); // Box 76
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.5F, 7.1F, 1.9F, 1, 2, 1, 0F,0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F); // Box 77
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.5F, 7.1F, 1.9F, 1, 2, 1, 0F,0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.5F, 0.35F, -0.2F, 0.5F, 0.35F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F); // Box 78
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4.9F, 7.1F, 0.5F, 1, 2, 1, 0F,-0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F); // Box 79
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4.9F, 4.4F, 0.5F, 1, 2, 1, 0F,-0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F); // Box 80
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(3.9F, 7.1F, 0.5F, 1, 2, 1, 0F,-0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F); // Box 81
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(3.9F, 4.4F, 0.5F, 1, 2, 1, 0F,-0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F); // Box 82
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(3.9F, 4.4F, -1.5F, 1, 2, 1, 0F,-0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F); // Box 83
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(3.9F, 7.1F, -1.5F, 1, 2, 1, 0F,-0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F, -0.2F, 0.35F, 0.5F, -0.2F, 0.25F, 0.4F, -0.2F, 0.25F, 0.4F, -0.2F, 0.35F, 0.5F); // Box 84
		bodyModel[25].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 27
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 28
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 30
		leftArmModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 31
		leftArmModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 32
		leftArmModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35
		leftArmModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 36
		leftArmModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 37
		leftArmModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 39
		leftArmModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 40
		leftArmModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 47

		leftArmModel[0].addShapeBox(-1F, -4.5F, -2F, 4, 10, 4, 0F,0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F); // Box 27
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(1F, -1F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 28
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(1F, 0F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 30
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(1F, 1F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 31
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1F, 2F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 32
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.3F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.3F, 0.2F); // Box 35
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, 5F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 36
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, 6F, -2F, 4, 1, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.3F, 0.3F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 37
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-1F, 3F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 39
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-1F, 4F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 40
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(1F, -2F, -2F, 2, 1, 4, 0F,0.7F, 0.3F, 0.2F, 0.3F, 0.5F, 0.2F, 0.3F, 0.5F, 0.2F, 0.7F, 0.3F, 0.2F, 0.5F, 0.3F, 0.4F, 0.7F, 0F, 0.4F, 0.7F, 0F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 47
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 52
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 19
		rightArmModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 20
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 21
		rightArmModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 42
		rightArmModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 43
		rightArmModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		rightArmModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 45
		rightArmModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 46

		rightArmModel[0].addShapeBox(-3F, -4.5F, -2F, 4, 10, 4, 0F,0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F, 0.1F, -2.4F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -1F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 52
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 0F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 19
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 1F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 20
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 2F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 21
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 3F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 41
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 4F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 42
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 5F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.4F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.3F, 0.4F); // Box 43
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 6F, -2F, 4, 1, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.3F, 0.3F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 44
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.3F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.3F, 0.2F); // Box 45
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3F, -2F, -2F, 2, 1, 4, 0F,0.3F, 0.5F, 0.2F, 0.7F, 0.3F, 0.2F, 0.7F, 0.3F, 0.2F, 0.3F, 0.5F, 0.2F, 0.7F, 0F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.7F, 0F, 0.4F); // Box 46
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		leftLegModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 56
		leftLegModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 57
		leftLegModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 58
		leftLegModel[4] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 59
		leftLegModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 60
		leftLegModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 61
		leftLegModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 62
		leftLegModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 63
		leftLegModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 64
		leftLegModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 65

		leftLegModel[0].addShapeBox(-2F, 10.1F, -3.3F, 4, 2, 4, 0F,0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F); // Box 55
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-4F, -6.1F, -4F, 8, 24, 8, 0F,-1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F); // Box 56
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.7F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 57
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 2.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 58
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-4F, -5.5F, -4F, 8, 16, 8, 0F,-1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -2.8F, -5F, -0.8F, -0.8F, -4F, -0.8F, -0.8F, -4F, -0.8F, -2.8F, -5F, -0.8F); // Box 59
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, 3.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 60
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 4.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 61
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 5.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 62
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 6.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 63
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2F, 7.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 64
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-2F, 8.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 65
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		rightLegModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 267
		rightLegModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 270
		rightLegModel[4] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 8
		rightLegModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 48
		rightLegModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 49
		rightLegModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 50
		rightLegModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 52
		rightLegModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 53
		rightLegModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 54

		rightLegModel[0].addShapeBox(-2F, 10.1F, -3.3F, 4, 2, 4, 0F,0.2F, -0.5F, 0.3F, 0.2F, -0.5F, 0.3F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0.5F, 0.2F, 0.1F, 0F, 0.2F, 0.1F, 0F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-4F, -6.1F, -4F, 8, 24, 8, 0F,-1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F, -1.9F, -5.9F, -1.9F); // Box 5
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6.7F, -2F, 4, 1, 4, 0F,0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 267
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 2.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 270
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-4F, -5.5F, -4F, 8, 16, 8, 0F,-1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -1.8F, -4F, -1.8F, -0.8F, -4F, -0.8F, -2.8F, -5F, -0.8F, -2.8F, -5F, -0.8F, -0.8F, -4F, -0.8F); // Box 8
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 3.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 48
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 4.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 49
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 5.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 50
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 6.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 52
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-2F, 7.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 53
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2F, 8.7F, -2F, 4, 1, 3, 0F,0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 54
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);
	}
}