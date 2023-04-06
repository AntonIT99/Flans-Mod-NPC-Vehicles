//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LoricaSquamata
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLoricaDacia extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelLoricaDacia() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];
		leftArmModel = new ModelRendererTurbo[12];
		rightArmModel = new ModelRendererTurbo[12];
		leftLegModel = new ModelRendererTurbo[2];
		rightLegModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 18
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 19
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 31
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 39
		bodyModel[11] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 27
		bodyModel[12] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 28
		bodyModel[13] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		bodyModel[16] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 32
		bodyModel[17] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 34
		bodyModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 44
		bodyModel[19] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 45
		bodyModel[20] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 51
		bodyModel[21] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 52
		bodyModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 53
		bodyModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 54
		bodyModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 55
		bodyModel[25] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 56
		bodyModel[26] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 57
		bodyModel[27] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 58
		bodyModel[28] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 59
		bodyModel[29] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 60
		bodyModel[30] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 61
		bodyModel[31] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 62
		bodyModel[32] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 63
		bodyModel[33] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 64
		bodyModel[34] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 65
		bodyModel[35] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 66
		bodyModel[36] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 71
		bodyModel[37] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 72
		bodyModel[38] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 73
		bodyModel[39] = new ModelRendererTurbo(this, 10, 1, textureX, textureY); // Box 74

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F); // Box 18
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 9.8F, -2F, 8, 6, 4, 0F,0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F); // Box 19
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8.5F, -2.5F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F); // Box 25
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 9.5F, -2.5F, 1, 5, 1, 0F,-0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0.6F, -0.15F, 0F, 0.6F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F); // Box 26
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(1F, 8.5F, -2.5F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F); // Box 27
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(1F, 9.5F, -2.5F, 1, 5, 1, 0F,-0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0.6F, -0.15F, 0F, 0.6F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F); // Box 28
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 8.5F, -2.5F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F); // Box 29
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1F, 9.5F, -2.5F, 1, 5, 1, 0F,-0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0.6F, -0.15F, 0F, 0.6F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F); // Box 30
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2F, 8.5F, -2.5F, 1, 1, 1, 0F,-0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F, -0.1F, 0.1F, 0.4F); // Box 31
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2F, 9.5F, -2.5F, 1, 5, 1, 0F,-0.15F, 0F, 0.3F, -0.15F, 0F, 0.3F, -0.15F, 0F, -0.7F, -0.15F, 0F, -0.7F, -0.15F, 0F, 0.6F, -0.15F, 0F, 0.6F, -0.15F, 0F, -0.9F, -0.15F, 0F, -0.9F); // Box 32
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 1F, -2F, 8, 7, 4, 0F,0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 0.2F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F, 0.1F, 1.1F, 0.1F); // Box 39
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 7.5F, -2F, 4, 1, 4, 0F,0.4F, 0.1F, 0.4F, 0.5F, 0.1F, 0.45F, 0.5F, 0.1F, 0.45F, 0.4F, 0.1F, 0.4F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 27
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 6.5F, -2F, 4, 1, 4, 0F,0.4F, 0.1F, 0.4F, 0.5F, 0.1F, 0.45F, 0.5F, 0.1F, 0.45F, 0.4F, 0.1F, 0.4F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 28
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 5.5F, -2F, 4, 1, 4, 0F,0.4F, 0.1F, 0.4F, 0.5F, 0.1F, 0.45F, 0.5F, 0.1F, 0.45F, 0.4F, 0.1F, 0.4F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 29
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 4.5F, -2F, 4, 1, 4, 0F,0.4F, 0.1F, 0.4F, 0.5F, 0.1F, 0.45F, 0.5F, 0.1F, 0.45F, 0.4F, 0.1F, 0.4F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 30
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 3.5F, -2F, 4, 1, 4, 0F,0.4F, 0.1F, 0.4F, 0.5F, 0.1F, 0.45F, 0.5F, 0.1F, 0.45F, 0.4F, 0.1F, 0.4F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 31
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.5F, 1F, -2F, 2, 2, 4, 0F,1.5F, 1.1F, 0.5F, 0.5F, 0.1F, 0.65F, 0.5F, 1.1F, 0.65F, 1.5F, 1.1F, 0.5F, 0F, 1F, 0.5F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.6F, 0F, 1.5F, 0.5F); // Box 32
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 0F, -2F, 3, 4, 4, 0F,1F, 0.5F, 0.8F, -1.2F, 0.7F, 0.8F, -1.2F, 0.7F, 0.8F, 1F, 0.5F, 0.8F, 0.3F, -0.5F, 0.8F, -0.8F, -0.5F, 0.8F, -0.8F, -0.5F, 0.8F, 0.3F, -0.5F, 0.8F); // Box 34
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.5F, 1F, -2F, 2, 2, 4, 0F,0.5F, 0.1F, 0.65F, 1.5F, 1.1F, 0.5F, 1.5F, 1.1F, 0.5F, 0.5F, 1.1F, 0.65F, 0.7F, 0.5F, 0.8F, 0F, 1F, 0.7F, 0F, 1.5F, 0.5F, 0.5F, 0.5F, 0.6F); // Box 44
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1F, 0F, -2F, 3, 4, 4, 0F,-1.2F, 0.7F, 0.8F, 1F, 0.5F, 0.8F, 1F, 0.5F, 0.8F, -1.2F, 0.7F, 0.8F, -0.8F, -0.5F, 0.8F, 0.3F, -0.5F, 0.8F, 0.3F, -0.5F, 0.8F, -0.8F, -0.5F, 0.8F); // Box 45
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 3.5F, -2F, 4, 1, 4, 0F,0F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 51
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0F, 4.5F, -2F, 4, 1, 4, 0F,0F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 52
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0F, 5.5F, -2F, 4, 1, 4, 0F,0F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 53
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0F, 6.5F, -2F, 4, 1, 4, 0F,0F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 54
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 7.5F, -2F, 4, 1, 4, 0F,0F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0.4F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 55
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-1.3F, 7.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 56
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-1.3F, 6.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 57
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-1.3F, 5.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 58
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-1.3F, 4.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 59
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-1.3F, 3.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 60
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(0.2F, 3.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 61
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(0.2F, 4.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 62
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(0.2F, 5.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 63
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0.2F, 6.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 64
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(0.2F, 7.65F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F, -0.2F, -0.3F, 0.65F); // Box 65
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-0.6F, 3.65F, -2F, 1, 1, 1, 0F,0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F); // Box 66
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-0.6F, 4.65F, -2F, 1, 1, 1, 0F,0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F); // Box 71
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-0.6F, 5.65F, -2F, 1, 1, 1, 0F,0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F); // Box 72
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-0.6F, 6.65F, -2F, 1, 1, 1, 0F,0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F); // Box 73
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-0.6F, 7.65F, -2F, 1, 1, 1, 0F,0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F, 0F, -0.42F, 0.67F); // Box 74
		bodyModel[39].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 40
		leftArmModel[2] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 41
		leftArmModel[3] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 42
		leftArmModel[4] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 43
		leftArmModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 66
		leftArmModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 67
		leftArmModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 68
		leftArmModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 69
		leftArmModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 70
		leftArmModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 71
		leftArmModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 72

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.8F, -2F, -2F, 2, 3, 4, 0F,0F, 0.4F, 0.6F, 0.5F, 0.4F, 0.6F, 0.5F, 0.4F, 0.6F, 0F, 0.4F, 0.6F, 0F, -0.2F, 0.6F, -0.3F, -0.2F, 0.6F, -0.3F, -0.2F, 0.6F, 0F, -0.2F, 0.6F); // Box 40
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(0.5F, -2F, -2F, 2, 3, 4, 0F,0F, 0.3F, 0.5F, 0.9F, 0.3F, 0.5F, 0.9F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F); // Box 41
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(1F, -2F, -2F, 2, 2, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, -1F, 0.8F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, -1F, 0.8F, 0.4F); // Box 42
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(1F, 0F, -2F, 2, 1, 4, 0F,-0.7F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, -1F, 0.8F, 0.4F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.4F, -1F, 0.8F, 0.4F); // Box 43
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(1F, 7F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 66
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(1F, 6F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 67
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(1F, 5F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 68
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(1F, 4F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 69
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(1F, 3F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 70
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(1F, 2F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 71
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(1F, 1F, -2F, 2, 1, 4, 0F,0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F); // Box 72
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 36
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 37
		rightArmModel[3] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 38
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 39
		rightArmModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 52
		rightArmModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 59
		rightArmModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 60
		rightArmModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 61
		rightArmModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 62
		rightArmModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 63
		rightArmModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 64

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 6, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1.3F, -2F, -2F, 2, 3, 4, 0F,0.5F, 0.4F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0.6F, 0.5F, 0.4F, 0.6F, -0.3F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, 0F, -0.2F, 0.6F, -0.3F, -0.2F, 0.6F); // Box 36
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.5F, -2F, -2F, 2, 3, 4, 0F,0.9F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0.9F, 0.3F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, 0F, 0.5F); // Box 37
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -2F, -2F, 2, 2, 4, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.5F, 0F, 0.4F, -1F, 0.8F, 0.4F, -1F, 0.8F, 0.4F, 0.5F, 0F, 0.4F); // Box 38
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 0F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.5F, 0F, 0.4F, -1F, 0.8F, 0.4F, -1F, 0.8F, 0.4F, 0.5F, 0F, 0.4F); // Box 39
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 1F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 52
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 2F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 59
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 3F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 60
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 4F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 61
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3F, 5F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 62
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-3F, 6F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 63
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3F, 7F, -2F, 2, 1, 4, 0F,0.3F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.4F, 0.2F, 0.4F, 0.5F, 0.3F, 0.4F, 0.5F, 0.3F, 0.4F, 0.4F, 0.2F, 0.4F); // Box 64
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 24
		leftLegModel[1] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 74

		leftLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 24
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 8F, -2F, 2, 2, 4, 0F,0.2F, 1.5F, 0.2F, 2.2F, 1.5F, 0.2F, 2.2F, 1.5F, -0.8F, 0.2F, 1.5F, -0.8F, 0.2F, 0.5F, 0.2F, 2.2F, 0.5F, 0.2F, 2.2F, 0.5F, -0.8F, 0.2F, 0.5F, -0.8F); // Box 74
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 25
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 75

		rightLegModel[0].addShapeBox(-2F, 10.1F, -2F, 4, 2, 4, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 8F, -2F, 2, 2, 4, 0F,0.2F, 1.5F, 0.2F, 2.2F, 1.5F, 0.2F, 2.2F, 1.5F, -0.8F, 0.2F, 1.5F, -0.8F, 0.2F, 0.5F, 0.2F, 2.2F, 0.5F, 0.2F, 2.2F, 0.5F, -0.8F, 0.2F, 0.5F, -0.8F); // Box 75
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);
	}
}