//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGaddafi extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelGaddafi() //Same as Filename
	{
		headModel = new ModelRendererTurbo[24];
		bodyModel = new ModelRendererTurbo[4];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		headModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 23
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 24
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 25
		headModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		headModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 27
		headModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 28
		headModel[7] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		headModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		headModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		headModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		headModel[11] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 4
		headModel[12] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 5
		headModel[13] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 6
		headModel[14] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 7
		headModel[15] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 8
		headModel[16] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 9
		headModel[17] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 10
		headModel[18] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 11
		headModel[19] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 12
		headModel[20] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 13
		headModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 8
		headModel[22] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 11
		headModel[23] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 13

		headModel[0].addShapeBox(1F, -3.5F, -4F, 2, 1, 1, 0F,0.4F, 0F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0F, 0F, 0.2F, -0.1F, -0.3F, 0.2F, 0.1F, -0.45F, 0.2F, 0.1F, -0.45F, 0.2F, -0.1F, -0.3F, 0.2F); // Box 19
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5.7F, 0F, 8, 1, 4, 0F,0.2F, 0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 1F, 0.2F, 1.8F, 1F, 1.2F, 1.8F, 0.5F, 1.2F); // Box 23
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -1.7F, 0F, 8, 2, 4, 0F,1.8F, 0F, 0.2F, 1.8F, 0F, 0.2F, 1.8F, 0F, 1.2F, 1.8F, 0F, 1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Box 24
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -3.2F, 0F, 8, 1, 4, 0F,1.8F, 1F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 1.2F, 1.8F, 1F, 1.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 1.2F, 1.8F, 0.5F, 1.2F); // Box 25
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -3.2F, -1.2F, 8, 1, 1, 0F,0.8F, 1F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 1F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F); // Box 26
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.2F, -1.2F, 8, 1, 1, 0F,-1.2F, 1F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0.8F, 0F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0F, 0F); // Box 27
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -1.2F, -1.2F, 8, 2, 1, 0F,0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, -1.2F, -1F, 0F, -1.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F); // Box 28
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(1F, -4.9F, -4F, 2, 1, 1, 0F,0.8F, -0.5F, 0.2F, 0.7F, -0.5F, 0.2F, 0.7F, -0.5F, 0.2F, 0.8F, -0.5F, 0.2F, 0.4F, 0.4F, 0.2F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0F, 0.6F, 0.2F); // Box 0
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(0F, -4.4F, -4.15F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F); // Box 1
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3.3F, -4.5F, -4.1F, 1, 1, 4, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 2
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(1F, -5.1F, -4.05F, 2, 1, 1, 0F,-0.5F, -0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F); // Box 3
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0.5F, -5.1F, -4.05F, 1, 1, 1, 0F,0F, -0.55F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.55F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.15F, 0.2F); // Box 4
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -4.9F, -4.05F, 1, 1, 1, 0F,0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F); // Box 5
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(2.5F, -5.1F, -4.05F, 2, 1, 1, 0F,0F, -0.35F, 0.2F, -0.45F, -0.55F, 0.2F, -0.45F, -0.55F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.3F, 0.2F, -0.45F, -0.15F, 0.2F, -0.45F, -0.15F, 0.2F, 0F, -0.3F, 0.2F); // Box 6
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3F, -4.9F, -4F, 2, 1, 1, 0F,0.7F, -0.5F, 0.2F, 0.8F, -0.5F, 0.2F, 0.8F, -0.5F, 0.2F, 0.7F, -0.5F, 0.2F, 0.6F, 0.2F, 0.2F, 0.4F, 0.4F, 0.2F, 0F, 0.6F, 0.2F, 0.6F, 0.2F, 0.2F); // Box 7
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-3F, -3.5F, -4F, 2, 1, 1, 0F,0.6F, 0.2F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0.6F, 0.2F, 0.2F, 0.1F, -0.45F, 0.2F, -0.1F, -0.3F, 0.2F, -0.1F, -0.3F, 0.2F, 0.1F, -0.45F, 0.2F); // Box 8
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1F, -4.4F, -4.15F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F); // Box 9
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-1.5F, -5.1F, -4.05F, 1, 1, 1, 0F,0F, -0.35F, 0.2F, 0F, -0.55F, 0.2F, 0F, -0.55F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.15F, 0.2F, 0F, -0.3F, 0.2F); // Box 10
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-3F, -5.1F, -4.05F, 2, 1, 1, 0F,-0.5F, -0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.5F, -0.35F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F); // Box 11
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4.5F, -5.1F, -4.05F, 2, 1, 1, 0F,-0.45F, -0.55F, 0.2F, 0F, -0.35F, 0.2F, 0F, -0.35F, 0.2F, -0.45F, -0.55F, 0.2F, -0.45F, -0.15F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -0.45F, -0.15F, 0.2F); // Box 12
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4.3F, -4.5F, -4.1F, 1, 1, 4, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 13
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-3F, -9.5F, -4F, 6, 3, 8, 0F,0F, 0.2F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, -0.8F, 0.5F, 0F, 0.1F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 1.5F, 0.5F, 0.2F, 1.8F, 0.8F, 0.2F, 0.8F, 0.8F); // Box 8
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4.4F, -9.5F, -4F, 1, 3, 8, 0F,-0.1F, 0F, -0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.1F, 0.5F, -0.1F, -0.1F, 0F, 0.3F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.8F, 0.8F, 0.3F, 0.9F, 0.3F); // Box 11
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(3.4F, -8.5F, -4F, 1, 3, 8, 0F,0.2F, 0.3F, 0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.3F, 0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.8F, 0F, 0.2F, 1.1F, 0.3F, 0.2F, 0.8F, 0.8F); // Box 13
		headModel[23].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 19
		bodyModel[1] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 20
		bodyModel[3] = new ModelRendererTurbo(this, 61, 46, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 4, 12, 4, 0F,0.2F, 0.5F, 0.4F, 0F, 0.7F, 0.4F, 0F, 0.7F, 0.4F, 0.2F, 0.5F, 0.4F, 0.5F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0.5F, 0F, 0.6F); // Box 19
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -2F, 4, 12, 4, 0F,0F, 0.7F, 0.4F, 0.2F, 0.5F, 0.4F, 0.2F, 0.5F, 0.4F, 0F, 0.7F, 0.4F, 0F, 0F, 0.8F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0F, 0F, 1F); // Box 20
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1.5F, -0.5F, -2.2F, 6, 10, 4, 0F,-3F, 0.8F, 0.6F, 1.6F, 0.2F, 0.6F, 1.6F, 0.2F, 0.9F, -3F, 0.8F, 0.9F, 3.4F, -2.5F, 0.9F, -9.3F, 4.1F, 0.9F, -9.3F, 4.1F, 1.2F, 3.4F, -2.5F, 1.2F); // Box 20
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-7.5F, -5.8F, -2.95F, 17, 17, 1, 0F,-7.2F, -7.2F, -0.05F, -7.2F, -7.2F, -0.05F, -7.2F, -7.2F, 0F, -7.2F, -7.2F, 0F, -7.2F, -7.2F, 0F, -7.2F, -7.2F, 0F, -7.2F, -7.2F, 0F, -7.2F, -7.2F, 0F); // Box 27
		bodyModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 17

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 11, 4, 0F,0F, 0.5F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0.2F, 0.5F, 0.5F); // Box 17
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 18

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 11, 4, 0F,0.1F, 0.1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.1F, 0.1F, 0F, 1F, 0F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 1F, 0F, 0.5F); // Box 18
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 22
		leftLegModel[1] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 40

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 9, 4, 0F,0F, 0F, 0.8F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0F, 0F, 1F, 0F, 1.7F, 1F, 1.2F, 1.5F, 0.4F, 1.2F, 1.5F, 1F, 0F, 1.7F, 1.5F); // Box 22
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 40
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 21
		rightLegModel[1] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 11

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 9, 4, 0F,0.5F, 0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 1F, 0.5F, 0F, 0.6F, 1.2F, 1.5F, 0.4F, 0F, 1.7F, 1F, 0F, 1.7F, 1.5F, 1.2F, 1.5F, 1F); // Box 21
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -1.1F, 1.5F, 0.2F, -1.1F, 1.5F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0F, 1.8F, 0.2F, 0F, 1.8F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}