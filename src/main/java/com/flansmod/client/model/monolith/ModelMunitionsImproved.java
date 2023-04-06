//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMunitionsImproved extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMunitionsImproved() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[31];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 92
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 93
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 96
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 97
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 2
		bodyModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 3
		bodyModel[8] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 31
		bodyModel[10] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 32
		bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 2
		bodyModel[14] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 3
		bodyModel[15] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 4
		bodyModel[16] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 5
		bodyModel[17] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		bodyModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 13
		bodyModel[20] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 14
		bodyModel[21] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 15
		bodyModel[22] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		bodyModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 20
		bodyModel[24] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 21
		bodyModel[25] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 22
		bodyModel[26] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 23
		bodyModel[27] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 24
		bodyModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 25
		bodyModel[29] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 26
		bodyModel[30] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(0F, -0.5F, -2F, 4, 2, 4, 0F,-0.5F, -0.2F, 0.5F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 1.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.7F, 0F, 0F, 1F); // Box 92
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 1.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.7F, 0F, 0F, 1F, 0F, 0F, 2F, -0.3F, -1F, 0.6F, -0.3F, -1F, 0.8F, 0F, 0F, 1.5F); // Box 93
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 4.5F, -2F, 4, 2, 4, 0F,0F, 0F, 2F, -0.3F, 1F, 0.6F, -0.3F, 1F, 0.8F, 0F, 0F, 1.5F, 0F, 0.51F, 2.1F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0.6F, 0F, 0F, 1.6F); // Box 96
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 6.5F, -2F, 4, 3, 4, 0F,0F, -0.5F, 2.1F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.6F, 0F, 0F, 1.6F, 0F, 0.2F, 2.2F, 0.3F, -1F, 0.2F, 0.3F, -1F, 0.4F, 0F, 0F, 1.7F); // Box 97
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2F, 8, 12, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 0
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 10F, -2F, 4, 1, 4, 0F,0F, 0.3F, 2.2F, 0.3F, 1.5F, 0.2F, 0.3F, 1.5F, 0.4F, 0F, 0.5F, 1.7F, 0F, -0.8F, 2.8F, 0.9F, -1.6F, 0.5F, 0.9F, -1.6F, 0.6F, 0F, -0.8F, 2.3F); // Box 1
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -1F, -3F, 1, 2, 4, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 1.5F, 0.1F, 0.5F, 0.5F, -0.6F, 0.5F, 0.5F, -0.2F, -1.2F, 1.6F, 0F, -1.2F, 1.8F); // Box 2
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0.8F, -1F, -3F, 1, 2, 4, 0F,0.1F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 1.5F, 0F, 0.2F, 1F, -1.6F, -0.3F, 0.5F, 1.1F, -0.3F, 0.5F, 0.2F, -1.4F, 1.8F, 0F, -1.2F, 1.6F); // Box 3
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(2.5F, -0.5F, -2F, 1, 3, 4, 0F,-0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, -0.2F, 0F, 0.6F, 0F, 0.3F, 1.5F, -0.2F, 0F, 1.2F, -0.2F, 0F, 1.2F, 0F, 0.3F, 1.5F); // Box 17
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1F, -1F, -3F, 1, 2, 4, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0.2F, 1.5F, 0F, 0.2F, 1F, -0.6F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0F, -1.2F, 1.8F, -0.2F, -1.2F, 1.6F); // Box 31
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1.8F, -1F, -3F, 1, 2, 4, 0F,-0.7F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 1.5F, 1.1F, -0.3F, 0.5F, -1.6F, -0.3F, 0.5F, 0F, -1.2F, 1.6F, 0.2F, -1.4F, 1.8F); // Box 32
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 10.5F, -2F, 4, 1, 4, 0F,0F, 0.3F, 2.7F, 0.7F, 1.2F, 0.4F, 0.7F, 1.2F, 0.5F, 0F, 0.5F, 2.2F, 0F, -0.8F, 3.1F, 1.4F, -1.2F, 0.7F, 1.4F, -1.2F, 0.8F, 0F, -0.8F, 2.6F); // Box 0
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 10.9F, -2F, 4, 1, 4, 0F,0F, 0.3F, 2.9F, 1.3F, 0.55F, 0.6F, 1.3F, 0.55F, 0.7F, 0F, 0.5F, 2.3F, 0F, -0.8F, 3.1F, 1.7F, -0.8F, 0.8F, 1.7F, -0.8F, 0.9F, 0F, -0.8F, 2.7F); // Box 1
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 11.4F, -2F, 4, 1, 4, 0F,0F, 0.3F, 3F, 1.5F, 0.55F, 0.6F, 1.5F, 0.55F, 0.7F, 0F, 0.5F, 2.5F, 0F, -0.7F, 3.2F, 1.9F, -0.7F, 0.8F, 1.9F, -0.7F, 0.9F, 0F, -0.7F, 2.7F); // Box 2
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 11.9F, -2F, 4, 1, 4, 0F,0F, 0.3F, 3.1F, 1.8F, 0.3F, 0.6F, 1.8F, 0.3F, 0.7F, 0F, 0.5F, 2.5F, 0F, -0.7F, 3.2F, 2F, -0.7F, 0.8F, 2F, -0.7F, 0.9F, 0F, -0.7F, 2.7F); // Box 3
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0F, 12.5F, -2F, 4, 1, 4, 0F,0F, 0.3F, 3.1F, 1.9F, 0.4F, 0.6F, 1.9F, 0.4F, 0.7F, 0F, 0.5F, 2.5F, 0F, -0.6F, 3.2F, 2F, -0.6F, 0.8F, 2F, -0.6F, 0.9F, 0F, -0.6F, 2.7F); // Box 4
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 13.2F, -2F, 4, 1, 4, 0F,0F, 0.3F, 3.1F, 1.9F, 0.4F, 0.6F, 1.9F, 0.4F, 0.7F, 0F, 0.5F, 2.5F, 0F, -0.6F, 3.2F, 2F, -0.6F, 0.8F, 2F, -0.6F, 0.9F, 0F, -0.6F, 2.7F); // Box 5
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0F, 13.7F, -2F, 4, 1, 4, 0F,0F, 0.3F, 3.1F, 1.9F, 0.4F, 0.6F, 1.9F, 0.4F, 0.7F, 0F, 0.5F, 2.5F, 0F, -0.6F, 3.2F, 2F, -0.6F, 0.8F, 2F, -0.6F, 0.9F, 0F, -0.6F, 2.7F); // Box 6
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, -0.5F, -2F, 4, 2, 4, 0F,0F, -0.3F, 0.15F, -0.5F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.3F, 0.5F, -0.2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, -0.2F, 0F, 0.7F); // Box 12
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 1.5F, -2F, 4, 3, 4, 0F,-0.2F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1F, -0.2F, 0F, 0.7F, -0.3F, -1F, 0.6F, 0F, 0F, 2F, 0F, 0F, 1.5F, -0.3F, -1F, 0.8F); // Box 13
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 4.5F, -2F, 4, 2, 4, 0F,-0.3F, 1F, 0.6F, 0F, 0F, 2F, 0F, 0F, 1.5F, -0.3F, 1F, 0.8F, 0.5F, -1F, 0.5F, 0F, 0.51F, 2.1F, 0F, 0F, 1.6F, 0.5F, -1F, 0.6F); // Box 14
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 6.5F, -2F, 4, 3, 4, 0F,0.5F, 1F, 0.5F, 0F, -0.5F, 2.1F, 0F, 0F, 1.6F, 0.5F, 1F, 0.6F, 0.3F, -1F, 0.2F, 0F, 0.2F, 2.2F, 0F, 0F, 1.7F, 0.3F, -1F, 0.4F); // Box 15
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4F, 10F, -2F, 4, 1, 4, 0F,0.3F, 1.5F, 0.2F, 0F, 0.3F, 2.2F, 0F, 0.5F, 1.7F, 0.3F, 1.5F, 0.4F, 0.9F, -1.6F, 0.5F, 0F, -0.8F, 2.8F, 0F, -0.8F, 2.3F, 0.9F, -1.6F, 0.6F); // Box 16
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4F, 10.5F, -2F, 4, 1, 4, 0F,0.7F, 1.2F, 0.4F, 0F, 0.3F, 2.7F, 0F, 0.5F, 2.2F, 0.7F, 1.2F, 0.5F, 1.4F, -1.2F, 0.7F, 0F, -0.8F, 3.1F, 0F, -0.8F, 2.6F, 1.4F, -1.2F, 0.8F); // Box 20
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-4F, 10.9F, -2F, 4, 1, 4, 0F,1.3F, 0.55F, 0.6F, 0F, 0.3F, 2.9F, 0F, 0.5F, 2.3F, 1.3F, 0.55F, 0.7F, 1.7F, -0.8F, 0.8F, 0F, -0.8F, 3.1F, 0F, -0.8F, 2.7F, 1.7F, -0.8F, 0.9F); // Box 21
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 11.4F, -2F, 4, 1, 4, 0F,1.5F, 0.55F, 0.6F, 0F, 0.3F, 3F, 0F, 0.5F, 2.5F, 1.5F, 0.55F, 0.7F, 1.9F, -0.7F, 0.8F, 0F, -0.7F, 3.2F, 0F, -0.7F, 2.7F, 1.9F, -0.7F, 0.9F); // Box 22
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4F, 11.9F, -2F, 4, 1, 4, 0F,1.8F, 0.3F, 0.6F, 0F, 0.3F, 3.1F, 0F, 0.5F, 2.5F, 1.8F, 0.3F, 0.7F, 2F, -0.7F, 0.8F, 0F, -0.7F, 3.2F, 0F, -0.7F, 2.7F, 2F, -0.7F, 0.9F); // Box 23
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4F, 12.5F, -2F, 4, 1, 4, 0F,1.9F, 0.4F, 0.6F, 0F, 0.3F, 3.1F, 0F, 0.5F, 2.5F, 1.9F, 0.4F, 0.7F, 2F, -0.6F, 0.8F, 0F, -0.6F, 3.2F, 0F, -0.6F, 2.7F, 2F, -0.6F, 0.9F); // Box 24
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4F, 13.2F, -2F, 4, 1, 4, 0F,1.9F, 0.4F, 0.6F, 0F, 0.3F, 3.1F, 0F, 0.5F, 2.5F, 1.9F, 0.4F, 0.7F, 2F, -0.6F, 0.8F, 0F, -0.6F, 3.2F, 0F, -0.6F, 2.7F, 2F, -0.6F, 0.9F); // Box 25
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4F, 13.7F, -2F, 4, 1, 4, 0F,1.9F, 0.4F, 0.6F, 0F, 0.3F, 3.1F, 0F, 0.5F, 2.5F, 1.9F, 0.4F, 0.7F, 2F, -0.6F, 0.8F, 0F, -0.6F, 3.2F, 0F, -0.6F, 2.7F, 2F, -0.6F, 0.9F); // Box 26
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-3.5F, -0.5F, -2F, 1, 3, 4, 0F,0F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.6F, 0F, 0F, 0.5F, -0.2F, 0F, 1.2F, 0F, 0.3F, 1.5F, 0F, 0.3F, 1.5F, -0.2F, 0F, 1.2F); // Box 27
		bodyModel[30].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 4
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 4
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 5F, -2F, 4, 3, 4, 0F,0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F); // Box 6
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 28
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 8, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 28
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5F, -2F, 4, 3, 4, 0F,0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, -0.9F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F, 0.35F, 0.1F, 0.35F); // Box 29
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 20
		leftLegModel[1] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 21
		leftLegModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		leftLegModel[3] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 24
		leftLegModel[4] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 24

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,0.8F, 0F, 1.5F, 1.2F, 0F, 0.6F, 1.2F, 0F, 0.6F, 0.8F, 0F, 1.5F, 0.6F, 0F, 1F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, 0.6F, 0F, 1F); // Box 20
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,0.6F, 0F, 1F, 1F, 0F, 0.6F, 1F, 0F, 0.6F, 0.6F, 0F, 1F, 0.5F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 21
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 23
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -0.6F, 0.9F, 0.2F, -0.6F, 0.9F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 24
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 7
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 8
		rightLegModel[2] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 9
		rightLegModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 10
		rightLegModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 11

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 5, 4, 0F,1.2F, 0F, 0.6F, 0.8F, 0F, 1.5F, 0.8F, 0F, 1.5F, 1.2F, 0F, 0.6F, 1F, 0F, 0.6F, 0.6F, 0F, 1F, 0.6F, 0F, 1F, 1F, 0F, 0.6F); // Box 7
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 5F, -2F, 4, 1, 4, 0F,1F, 0F, 0.6F, 0.6F, 0F, 1F, 0.6F, 0F, 1F, 1F, 0F, 0.6F, 0.7F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.7F, 0F, 0.5F); // Box 8
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 5, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 9
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 10
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-2F, 10F, -2F, 4, 2, 4, 0F,0.2F, -0.6F, 0.9F, 0.2F, -0.6F, 0.9F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 11
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);
	}
}