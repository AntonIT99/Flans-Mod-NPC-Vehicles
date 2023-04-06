//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: InfanteriePanzer
// Model Creator: 
// Created on: 03.01.2019 - 20:41:58
// Last changed on: 03.01.2019 - 20:41:58

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelInfanteriePanzer extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelInfanteriePanzer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[56];
		leftArmModel = new ModelRendererTurbo[2];
		rightArmModel = new ModelRendererTurbo[2];
		leftLegModel = new ModelRendererTurbo[3];
		rightLegModel = new ModelRendererTurbo[3];
		skirtFrontModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
		initskirtFrontModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		bodyModel[5] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 
		bodyModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import 
		bodyModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import 
		bodyModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import 
		bodyModel[14] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import 
		bodyModel[18] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import 
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import 
		bodyModel[24] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import 
		bodyModel[26] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import 
		bodyModel[27] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import 
		bodyModel[28] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 78
		bodyModel[29] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 79
		bodyModel[30] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 80
		bodyModel[31] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 81
		bodyModel[32] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 82
		bodyModel[33] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 84
		bodyModel[34] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 85
		bodyModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 86
		bodyModel[36] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 87
		bodyModel[37] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 88
		bodyModel[38] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 89
		bodyModel[39] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 92
		bodyModel[40] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 93
		bodyModel[41] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 94
		bodyModel[42] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 97
		bodyModel[43] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 100
		bodyModel[44] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 101
		bodyModel[45] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 102
		bodyModel[46] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 103
		bodyModel[47] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 104
		bodyModel[48] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 105
		bodyModel[49] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Box 106
		bodyModel[50] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 107
		bodyModel[51] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 108
		bodyModel[52] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 109
		bodyModel[53] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Box 110
		bodyModel[54] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 111
		bodyModel[55] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 112

		bodyModel[0].addShapeBox(-4.3F, 7.7F, -2.2F, 9, 1, 5, 0F,-0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -2.3F, 2, 1, 1, 0F,-0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-2F, 0F, -2.3F, 2, 1, 1, 0F,0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F); // Import 
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 8F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F); // Import 
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.2F, 7.85F, 1.05F, 3, 2, 2, 0F,-0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F); // Import 
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.2F, 7.35F, 1.1F, 3, 1, 2, 0F,-0.23F, 0.0F, -0.2F, -0.23F, 0.0F, -0.2F, -0.23F, 0.0F, -0.2F, -0.23F, 0.0F, -0.2F, -0.23F, -0.2F, -0.2F, -0.23F, -0.2F, -0.2F, -0.23F, -0.2F, -0.2F, -0.23F, -0.2F, -0.2F); // Import 
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2.2F, 8.05F, 2.15F, 1, 1, 1, 0F,-0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F); // Import 
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2.2F, 8.25F, 2.2F, 1, 1, 1, 0F,-0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F); // Import 
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.2F, 10.05F, 2F, 1, 1, 1, 0F,-0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F); // Import 
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2.2F, 12.2F, 2F, 1, 1, 1, 0F,-0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F); // Import 
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.2F, 14.2F, 2F, 1, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F); // Import 
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2.2F, 14.6F, 2F, 1, 1, 1, 0F,-0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Import 
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(1.8F, 8.3F, 2F, 2, 1, 1, 0F,0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F); // Import 
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(1.8F, 7.4F, 2F, 2, 1, 1, 0F,-0.3F, -0.45F, 0.0F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1.8F, 7.15F, 2F, 2, 1, 1, 0F,-0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F); // Import 
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.8F, 8.75F, 2F, 2, 1, 1, 0F,0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F); // Import 
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1.8F, 9.45F, 2F, 2, 1, 1, 0F,-0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F); // Import 
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.8F, 7.2F, 2.1F, 2, 1, 1, 0F,-0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F); // Import 
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.8F, 6.6F, 2.1F, 2, 1, 1, 0F,-0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F); // Import 
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-0.5F, 1F, -2.15F, 1, 11, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F); // Import 
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, -0.1F, -2F, 4, 1, 4, 0F,0.1F, 0.0F, 0.1F, -1.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import 
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 0.9F, -2F, 8, 11, 4, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F, 0.2F, -0.1F, 0.2F); // Import 
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0F, -0.1F, -2F, 4, 1, 4, 0F,-1.5F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F); // Import 
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-1.5F, -0.09F, -2.05F, 3, 2, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.14F, 0.0F, 0.0F, 3.14F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(2.37F, 7.95F, 2.27F, 12, 6, 1, 0F,0.0F, -0.2F, -0.22F, -11.15F, -0.2F, -0.22F, -11.15F, -0.2F, -0.22F, 0.0F, -0.2F, -0.22F, 0.0F, -5.25F, -0.22F, -11.15F, -5.25F, -0.22F, -11.15F, -5.25F, -0.22F, 0.0F, -5.25F, -0.22F); // Import 
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-2.13F, 9.15F, 2.12F, 12, 6, 1, 0F,0.0F, -0.2F, -0.22F, -11.15F, -0.2F, -0.22F, -11.15F, -0.2F, -0.22F, 0.0F, -0.2F, -0.22F, 0.0F, -5.25F, -0.22F, -11.15F, -5.25F, -0.22F, -11.15F, -5.25F, -0.22F, 0.0F, -5.25F, -0.22F); // Import 
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.1F, 0F, -2.31F, 2, 1, 1, 0F,-0.6F, -0.22F, 0.0F, -0.75F, 0.05F, 0.0F, -0.75F, 0.05F, 0.0F, -0.6F, -0.22F, 0.0F, -1.2F, 0.25F, 0.0F, -0.15F, -0.05F, 0.0F, -0.15F, -0.05F, 0.0F, -1.2F, 0.25F, 0.0F); // Import 
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0.1F, 0F, -2.31F, 2, 1, 1, 0F,-0.75F, 0.05F, 0.0F, -0.6F, -0.22F, 0.0F, -0.6F, -0.22F, 0.0F, -0.75F, 0.05F, 0.0F, -0.15F, -0.05F, 0.0F, -1.2F, 0.25F, 0.0F, -1.2F, 0.25F, 0.0F, -0.15F, -0.05F, 0.0F); // Import 
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4F, 1.5F, -3F, 2, 5, 3, 0F,0F, 0F, -0.3F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0.5F, -0.2F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, -0.2F, 0F); // Box 78
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2F, -0.5F, -0.5F, 2, 3, 3, 0F,-0.5F, 0.2F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.1F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.2F, -0.1F, 0F, 0.2F); // Box 79
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(2F, 1.5F, -3F, 2, 5, 3, 0F,0F, 0.2F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.5F, 0F, 0F); // Box 80
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4F, -0.5F, -0.5F, 2, 3, 3, 0F,0.5F, 0F, -0.5F, -0.5F, 0.2F, -0.5F, 0F, 0.2F, 0F, 0F, 0F, 0F, -0.1F, -0.2F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.1F, -0.2F, 0.2F); // Box 81
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2F, 1.5F, -3F, 4, 5, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 82
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.7F, 6.2F, -3F, 2, 3, 3, 0F,0F, 0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0.3F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, 0F, -0.5F, 0F, 0F); // Box 84
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-2F, 6.2F, -3F, 4, 3, 1, 0F,-0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 85
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.7F, 6.2F, -3F, 2, 3, 3, 0F,0.5F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, -0.4F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0.5F, -0.2F, 0F); // Box 86
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1.2F, 8.7F, -3F, 2, 3, 3, 0F,0F, 0.2F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0F, 0.3F, 0.5F, -0.2F, -0.4F, 0.5F, -0.2F, 0F, -0.5F, 0F, 0F); // Box 87
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1.5F, 8.7F, -3F, 3, 3, 1, 0F,-0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 88
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3.2F, 8.7F, -3F, 2, 3, 3, 0F,0.5F, 0F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, -0.4F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, 0.5F, -0.2F, 0F); // Box 89
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(2F, -0.5F, -3F, 2, 2, 3, 0F,-0.5F, 0F, 0F, 0.5F, -0.2F, -0.5F, 0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0F, -0.2F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0.2F, 0F); // Box 92
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-2F, -0.5F, -3F, 4, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F); // Box 93
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4F, -0.5F, -3F, 2, 2, 3, 0F,0.5F, -0.2F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-4F, 11.7F, -2F, 4, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F); // Box 97
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-4.3F, 7.7F, -3.2F, 3, 1, 1, 0F,-0.1F, 0.1F, -0.2F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, -0.2F, 0.1F, 0.1F, 0.2F, -0.1F, 0.1F, -0.2F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, -0.2F, 0.1F, 0.1F, 0.2F); // Box 100
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(1.3F, 7.7F, -3.2F, 3, 1, 1, 0F,-0.5F, 0.1F, 0.2F, -0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, 0.2F, -0.1F, 0.1F, -0.2F, 0.1F, 0.1F, 0.2F, -0.5F, 0.1F, -0.2F); // Box 101
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-2F, 7.7F, -3.2F, 4, 1, 1, 0F,-0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F); // Box 102
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(0F, 11.7F, -2F, 4, 3, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0.5F); // Box 103
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2.6F, 7.5F, -4F, 2, 3, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, -0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0F, -0.5F, -0.1F, 0F, -0.2F, -0.1F, -0.2F, -0.3F, -0.1F, 0.2F, -0.3F, -0.1F, 0F); // Box 104
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(1F, 7.5F, -4.2F, 2, 3, 1, 0F,-0.2F, -0.3F, 0F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0.2F, -0.2F, -0.3F, 0F, -0.6F, 0.1F, 0F, 0F, -0.2F, -0.1F, 0F, -0.2F, 0.2F, -0.6F, 0.1F, 0F); // Box 105
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-0.7F, 7.6F, -4.2F, 2, 3, 1, 0F,0F, -0.5F, 0F, -0.6F, -0.1F, -0.1F, -0.6F, -0.1F, 0.2F, 0F, -0.5F, 0F, -0.9F, 0.3F, 0F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, 0.2F, -0.9F, 0.3F, 0F); // Box 106
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-3.9F, 7.3F, -4.4F, 2, 2, 2, 0F,-0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F); // Box 107
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-3.9F, 9.5F, -4.4F, 2, 4, 2, 0F,-0.65F, 0.1F, -0.65F, -0.65F, 0.1F, -0.65F, -0.65F, 0.1F, -0.65F, -0.65F, 0.1F, -0.65F, -0.65F, 0.4F, -0.65F, -0.65F, 0.4F, -0.65F, -0.65F, 0.4F, -0.65F, -0.65F, 0.4F, -0.65F); // Box 108
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(-3.9F, 9F, -4.4F, 2, 1, 2, 0F,-0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F); // Box 109
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-5.7F, 7.5F, -3.3F, 2, 2, 2, 0F,-0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F); // Box 110
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-5.7F, 9.2F, -3.3F, 2, 1, 2, 0F,-0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F, -0.15F, -0.4F, -0.15F); // Box 111
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-5.7F, 9.7F, -3.3F, 2, 4, 2, 0F,-0.65F, 0.1F, -0.65F, -0.65F, 0.1F, -0.65F, -0.65F, 0.1F, -0.65F, -0.65F, 0.1F, -0.65F, -0.65F, 0.4F, -0.65F, -0.65F, 0.4F, -0.65F, -0.65F, 0.4F, -0.65F, -0.65F, 0.4F, -0.65F); // Box 112
		bodyModel[55].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import 
		leftArmModel[1] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 99

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 1.0F, 0.1F, 0.1F, 1.0F, 0.1F, 0.1F, 1.0F, 0.1F, 0.1F, 1.0F, 0.1F); // Import 
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 7.5F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 99
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import 
		rightArmModel[1] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 98

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 9, 4, 0F,0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 1.0F, 0.1F, 0.1F, 1.0F, 0.1F, 0.1F, 1.0F, 0.1F, 0.1F, 1.0F, 0.1F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 7.5F, -2F, 4, 1, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 98
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import 
		leftLegModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import 
		leftLegModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 136

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 7, 4, 0F,0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F); // Import 
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -3F, 4, 2, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 7F, -2F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Import 
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import 
		rightLegModel[2] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 137

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 7, 4, 0F,0.2F, 0.0F, 0F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F); // Import 
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -3F, 4, 2, 5, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 7F, -2F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initskirtFrontModel_1()
	{
		skirtFrontModel[0] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 24
		skirtFrontModel[1] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 25

		skirtFrontModel[0].addShapeBox(-2F, -1.2F, -2.8F, 4, 2, 1, 0F,0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 24
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-2F, 0.800000000000001F, -2.8F, 4, 2, 1, 0F,0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F, -0.9F, -0.3F, 0.2F); // Box 25
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);
	}
}