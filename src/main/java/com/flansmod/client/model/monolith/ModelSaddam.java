//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSaddam extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelSaddam() //Same as Filename
	{
		headModel = new ModelRendererTurbo[14];
		bodyModel = new ModelRendererTurbo[20];
		leftArmModel = new ModelRendererTurbo[5];
		rightArmModel = new ModelRendererTurbo[5];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Box 23
		headModel[1] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 21
		headModel[2] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 6
		headModel[3] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 26
		headModel[4] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 18
		headModel[5] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 0
		headModel[6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 30
		headModel[7] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 31
		headModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 32
		headModel[9] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 33
		headModel[10] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 34
		headModel[11] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 35
		headModel[12] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 36
		headModel[13] = new ModelRendererTurbo(this, 5, 112, textureX, textureY); // Box 47

		headModel[0].addShapeBox(-4F, -7.8F, -4F, 8, 2, 8, 0F,0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, 0F, 0.15F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 23
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2.5F, -2.45F, -4.05F, 2, 1, 1, 0F,-0.6F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F); // Box 21
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0.5F, -2.45F, -4.05F, 2, 1, 1, 0F,0F, 0F, 0F, -0.6F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 6
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -2.45F, -4.05F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 26
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-2.7F, -5.2F, -3.9F, 2, 1, 1, 0F,0F, -0.1F, 0.2F, -0.1F, -0.35F, 0.2F, 0F, -0.4F, 0.2F, -0.5F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.2F, -0.15F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0F, 0.2F); // Box 18
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.2F, -5.2F, -3.9F, 1, 1, 1, 0F,0.2F, -0.4F, 0.2F, -0.5F, -0.1F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F, 0.3F, -0.1F, 0.2F, 0.4F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F); // Box 0
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(0.8F, -5.2F, -3.9F, 2, 1, 1, 0F,-0.1F, -0.35F, 0.2F, 0F, -0.1F, 0.2F, -0.5F, -0.3F, 0.2F, 0F, -0.4F, 0.2F, -0.2F, -0.15F, 0.2F, -0.3F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0.2F); // Box 30
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(2.3F, -5.2F, -3.9F, 1, 1, 1, 0F,-0.5F, -0.1F, 0.2F, 0.2F, -0.4F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0.4F, -0.4F, 0.2F, 0.3F, -0.1F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F); // Box 31
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3F, -9.8F, -4F, 7, 2, 8, 0F,0.2F, -1F, 1F, -4.2F, 0F, 1.2F, -4.2F, 0F, 1.2F, 0.2F, -1F, 1F, -0.85F, 1F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.15F, -0.85F, 1F, 0.15F); // Box 32
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, -9.8F, -4F, 2, 3, 8, 0F,-0.2F, -2F, 0.8F, -0.2F, -1F, 1F, -0.2F, -1F, 1F, -0.2F, -2F, 0.8F, -0.5F, 2F, 0.15F, 0.85F, 0F, 0.15F, 0.85F, 0F, 0.15F, -0.5F, 2F, 0.15F); // Box 33
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.2F, -10.3F, -4F, 4, 1, 8, 0F,-3F, -0.3F, 0.7F, 0.5F, -1.5F, 0.2F, 0.5F, -1.5F, 0.2F, -3F, -0.3F, 0.7F, 0F, -0.5F, 1.2F, 0.35F, 2F, 0.15F, 0.35F, 2F, 0.15F, 0F, -0.5F, 1.2F); // Box 34
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5.6F, -9.8F, -4F, 1, 4, 8, 0F,0F, -4F, 0.5F, -0.2F, -2F, 0.8F, -0.2F, -2F, 0.8F, 0F, -4F, 0.5F, -0.15F, 0.8F, 0.15F, 0.1F, 1F, 0.15F, 0.1F, 1F, 0.15F, -0.15F, 0.8F, 0.15F); // Box 35
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(1F, -8.6F, -4.5F, 3, 3, 1, 0F,-0.8F, -0.6F, 0.1F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, -0.15F, -0.8F, -0.6F, -0.2F, -0.8F, -0.6F, 0F, -0.8F, -0.6F, 0F); // Box 36
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -6.8F, -4F, 8, 1, 8, 0F,0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F); // Box 47
		headModel[13].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		bodyModel[2] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 289
		bodyModel[3] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 291
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 292
		bodyModel[5] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 4
		bodyModel[6] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 5
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 7
		bodyModel[9] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 8
		bodyModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 10
		bodyModel[12] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 11
		bodyModel[13] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 46

		bodyModel[0].addShapeBox(-4F, 9.5F, -2F, 8, 1, 4, 0F,0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-2F, 0F, -2.2F, 2, 1, 4, 0F,0.1F, 0.4F, 0.4F, 0.1F, 0.2F, 0.4F, 0.1F, 0.2F, 0F, 0.1F, 0.4F, 0F, -1.9F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0F, -1.9F, 0.5F, 0F); // Box 27
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -2.2F, 2, 1, 4, 0F,0.1F, 0.2F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.5F, 0.4F, -1.9F, 0.5F, 0.4F, -1.9F, 0.5F, 0F, 0.1F, 0.5F, 0F); // Box 289
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 2F, -2F, 8, 8, 4, 0F,0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 291
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 10.3F, -2F, 8, 2, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F); // Box 292
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 0F, -2F, 8, 2, 4, 0F,0.7F, 0.2F, 0.15F, 0.7F, 0.2F, 0.15F, 0.7F, 0.2F, 0.15F, 0.7F, 0.2F, 0.15F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F, 0.75F, 0F, 0.5F); // Box 4
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 2.2F, -2.6F, 3, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 5
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 2.2F, -2.8F, 1, 1, 1, 0F,-0.15F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.15F, -0.2F, -0.1F, 0.5F, 0.2F, -0.1F, 0.5F, 0.2F, 0F, -0.15F, -0.2F, 0F); // Box 6
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2F, 2.2F, -2.8F, 1, 1, 1, 0F,0.5F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, 0F, 0.5F, 0.2F, 0F); // Box 7
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(3F, 2.2F, -2.8F, 1, 1, 1, 0F,0.5F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.15F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.2F, -0.1F, -0.15F, -0.2F, -0.1F, -0.15F, -0.2F, 0F, 0.5F, 0.2F, 0F); // Box 8
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(1F, 2.2F, -2.8F, 1, 1, 1, 0F,-0.15F, 0.05F, 0F, 0.5F, 0.05F, 0F, 0.5F, 0.05F, 0F, -0.15F, 0.05F, 0F, -0.15F, -0.2F, -0.1F, 0.5F, 0.2F, -0.1F, 0.5F, 0.2F, 0F, -0.15F, -0.2F, 0F); // Box 9
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1F, 2.2F, -2.6F, 3, 3, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, -0.1F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F); // Box 10
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.5F, 1.2F, -2.6F, 1, 8, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F); // Box 11
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4.7F, 4F, -3F, 1, 2, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 17
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.3F, 4F, -3F, 1, 2, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, 0.9F, 0F, -0.35F, -1.5F, -0.2F, -0.35F, -1.5F, -0.2F, -0.35F, 0.9F, 0F, -0.35F); // Box 18
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3F, 3F, -3F, 1, 1, 1, 0F,-0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.05F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.65F, 0F, -0.35F, -0.05F, 0F, -0.35F); // Box 19
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-5F, 0F, -3F, 1, 4, 1, 0F,-0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.2F, -0.35F, 0.2F, -0.2F, -0.65F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.05F, 0F, -0.35F, -0.65F, 0F, -0.35F); // Box 20
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-5F, 0F, -3F, 1, 1, 2, 0F,-0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.5F, -0.5F, 0.4F, -0.2F, -0.1F, 0.4F, -0.2F, -0.35F, -0.9F, -0.5F, -0.35F, -0.9F, -0.5F, -0.35F, -0.9F, -0.2F, -0.35F, -0.9F, -0.2F); // Box 21
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-2.5F, -0.5F, -2.7F, 2, 2, 5, 0F,-0.2F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.5F, 0F, -0.3F, 0.3F, 0F, 0.5F, 0F, 0F, 0.7F, 0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0.5F, -0.5F, -2.7F, 2, 2, 5, 0F,-1F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, 0.3F, 0F, 0.5F, 0.5F, 0F, 0.7F, 0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 46
		bodyModel[19].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 41
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 42
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 43
		leftArmModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		leftArmModel[4] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 45

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 5, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 41
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 3F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 42
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 7F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F); // Box 43
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 8F, -2F, 4, 1, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 44
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-2F, -2.4F, -1.5F, 4, 1, 3, 0F,-0.1F, 0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 45
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 12
		rightArmModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 13
		rightArmModel[3] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 14
		rightArmModel[4] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 15

		rightArmModel[0].addShapeBox(-3F, 8F, -2F, 4, 1, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F); // Box 12
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 3F, -2F, 4, 4, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 13
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2F, -2F, 4, 5, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 14
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-2F, -2.4F, -1.5F, 4, 1, 3, 0F,-0.1F, 0F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 15
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 37
		leftLegModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 38
		leftLegModel[2] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 39
		leftLegModel[3] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 40

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 4, 4, 0F,0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 37
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 4F, -2F, 4, 6, 4, 0F,0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.3F); // Box 38
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 39
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 40
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 19
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 11
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 61
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 16

		rightLegModel[0].addShapeBox(-2F, 4F, -2F, 4, 6, 4, 0F,0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.3F); // Box 19
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6.8F, -2F, 4, 4, 4, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 61
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 0F, -2F, 4, 4, 4, 0F,0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F); // Box 16
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}