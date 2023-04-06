//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: romaniaww2
// Model Creator: 
// Created on: 03.01.2019 - 20:41:58
// Last changed on: 03.01.2019 - 20:41:58

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRomaniaWW2body extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelRomaniaWW2body() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[55];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];
		leftLegModel = new ModelRendererTurbo[4];
		rightLegModel = new ModelRendererTurbo[4];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		bodyModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import 
		bodyModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import 
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import 
		bodyModel[6] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import 
		bodyModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import 
		bodyModel[8] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import 
		bodyModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Import 
		bodyModel[14] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Import 
		bodyModel[18] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import 
		bodyModel[22] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import 
		bodyModel[24] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Import 
		bodyModel[26] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import 
		bodyModel[27] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import 
		bodyModel[28] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import 
		bodyModel[29] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import 
		bodyModel[30] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		bodyModel[31] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import 
		bodyModel[32] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Import 
		bodyModel[33] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import 
		bodyModel[34] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Import 
		bodyModel[35] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import 
		bodyModel[36] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import 
		bodyModel[37] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Import 
		bodyModel[38] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Import 
		bodyModel[39] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import 
		bodyModel[40] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Import 
		bodyModel[41] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Import 
		bodyModel[42] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import 
		bodyModel[43] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import 
		bodyModel[44] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Import 
		bodyModel[45] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import 
		bodyModel[46] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import 
		bodyModel[47] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import 
		bodyModel[48] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import 
		bodyModel[49] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 64
		bodyModel[50] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 65
		bodyModel[51] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 134
		bodyModel[52] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 135
		bodyModel[53] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 68
		bodyModel[54] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 69

		bodyModel[0].addShapeBox(-4.3F, 8.05F, -2.55F, 9, 1, 5, 0F,-0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.5F, 0.1F, -0.2F, -0.1F, 0.1F, -0.2F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2.3F, 7.9F, -2.6F, 1, 1, 1, 0F,-0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F); // Import 
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.3F, 7.9F, -2.6F, 1, 1, 1, 0F,-0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F); // Import 
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.3F, 0.1F, -2.55F, 1, 7, 4, 0F,-0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F); // Import 
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2.3F, 0.1F, -2.55F, 1, 7, 4, 0F,-0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.5F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F); // Import 
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.3F, 5F, -2.65F, 1, 1, 2, 0F,-0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F); // Import 
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(2.3F, 5F, -2.65F, 1, 1, 2, 0F,-0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F, -0.13F, -0.2F, -0.2F); // Import 
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2.3F, 5F, -2.75F, 1, 1, 1, 0F,-0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F); // Import 
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.3F, 5F, -2.75F, 1, 1, 1, 0F,-0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F); // Import 
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-0.5F, 2.7F, 1.5F, 1, 5, 1, 0F,-0.15F, -0.9F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F, -0.9F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F, -0.15F, 0.3F, -0.2F); // Import 
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 3.4F, 1.55F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F); // Import 
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.5F, 3.4F, 1.6F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Import 
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-0.5F, 8.1F, 1.5F, 1, 1, 1, 0F,-0.15F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F, -0.15F, 0.1F, -0.2F); // Import 
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.5F, 1F, -2.3F, 1, 1, 1, 0F,-0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F); // Import 
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, -2.4F, 2, 1, 1, 0F,-0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 0F, -2.4F, 2, 1, 1, 0F,0.0F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F); // Import 
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-0.5F, 2.5F, -2.3F, 1, 1, 1, 0F,-0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F); // Import 
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-0.5F, 4.25F, -2.3F, 1, 1, 1, 0F,-0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F); // Import 
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-0.5F, 6F, -2.3F, 1, 1, 1, 0F,-0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F, -0.27F, -0.27F, 0.0F); // Import 
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-0.5F, 8F, -2.2F, 1, 1, 1, 0F,-0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F); // Import 
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.15F, 0.1F, 0.45F, 3, 3, 2, 0F,0.0F, 0.5F, -0.2F, -2.3F, 0.5F, -0.2F, -2.3F, 0.5F, -0.2F, 0.0F, 0.5F, -0.2F, -2.75F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, -2.75F, 0.5F, -0.2F); // Import 
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.15F, 0.1F, 0.45F, 3, 3, 2, 0F,-2.3F, 0.5F, -0.2F, 0.0F, 0.5F, -0.2F, 0.0F, 0.5F, -0.2F, -2.3F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, -2.75F, 0.5F, -0.2F, -2.75F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F); // Import 
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-0.95F, 8.05F, -2.6F, 2, 1, 3, 0F,-0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F, -0.25F, 0.11F, -0.2F); // Import 
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-3.2F, 8.2F, 1.05F, 3, 2, 2, 0F,-0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F, -0.25F, 0.35F, -0.2F); // Import 
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.2F, 7.7F, 1.1F, 3, 1, 2, 0F,-0.23F, 0.0F, -0.2F, -0.23F, 0.0F, -0.2F, -0.23F, 0.0F, -0.2F, -0.23F, 0.0F, -0.2F, -0.23F, -0.2F, -0.2F, -0.23F, -0.2F, -0.2F, -0.23F, -0.2F, -0.2F, -0.23F, -0.2F, -0.2F); // Import 
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-2.2F, 8.4F, 2.15F, 1, 1, 1, 0F,-0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F, -0.32F, 0.2F, -0.2F); // Import 
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.2F, 8.6F, 2.2F, 1, 1, 1, 0F,-0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F, -0.28F, -0.32F, -0.2F); // Import 
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2.2F, 10.4F, 2F, 1, 1, 1, 0F,-0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.2F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F, -0.1F, 0.35F, -0.2F); // Import 
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-2.2F, 12.55F, 2F, 1, 1, 1, 0F,-0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.18F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F, -0.22F, 0.8F, -0.2F); // Import 
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2.2F, 14.55F, 2F, 1, 1, 1, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F, -0.15F, -0.8F, -0.2F); // Import 
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-2.2F, 14.95F, 2F, 1, 1, 1, 0F,-0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.15F, 0.2F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.8F, -0.2F); // Import 
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(1.8F, 8.65F, 2F, 2, 1, 1, 0F,0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F); // Import 
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1.8F, 7.75F, 2F, 2, 1, 1, 0F,-0.3F, -0.45F, 0.0F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F, 0.0F, -0.3F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.8F, 7.5F, 2F, 2, 1, 1, 0F,-0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F); // Import 
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1.8F, 9.1F, 2F, 2, 1, 1, 0F,0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F); // Import 
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1.8F, 9.8F, 2F, 2, 1, 1, 0F,-0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F, -0.6F, -0.3F, 0.0F); // Import 
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(1.8F, 7.2F, 2.1F, 2, 1, 1, 0F,-0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F, -0.75F, -0.35F, -0.3F); // Import 
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(1.8F, 6.95F, 2.1F, 2, 1, 1, 0F,-0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F, -0.7F, -0.3F, -0.25F); // Import 
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-0.5F, 1F, -2.25F, 1, 11, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1F, 0.0F, 0.0F, -3.1F, 0.0F, 0.0F, -3.1F, 0.0F, 0.0F, -3.1F, 0.0F); // Import 
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-4F, -0.1F, -2F, 4, 1, 4, 0F,0.1F, 0.0F, 0.1F, -1.5F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Import 
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4F, 0.9F, -2F, 8, 11, 4, 0F,0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F, 0.1F, -3F, 0F); // Import 
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(0F, -0.1F, -2F, 4, 1, 4, 0F,-1.5F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F); // Import 
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3.9F, 7F, -2.3F, 3, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[42].setRotationPoint(0F, -5F, 0F);

		bodyModel[43].addBox(-3.9F, 8F, -2.25F, 3, 2, 1, 0F); // Import 
		bodyModel[43].setRotationPoint(0F, -5F, 0F);

		bodyModel[44].addBox(0.9F, 7F, -2.3F, 3, 1, 1, 0F); // Import 
		bodyModel[44].setRotationPoint(0F, -5F, 0F);

		bodyModel[45].addBox(0.9F, 8F, -2.25F, 3, 2, 1, 0F); // Import 
		bodyModel[45].setRotationPoint(0F, -5F, 0F);

		bodyModel[46].addShapeBox(-1.5F, -0.09F, -2.05F, 3, 2, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.14F, 0.0F, 0.0F, 3.14F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(2.37F, 8.3F, 2.27F, 12, 6, 1, 0F,0.0F, -0.2F, -0.22F, -11.15F, -0.2F, -0.22F, -11.15F, -0.2F, -0.22F, 0.0F, -0.2F, -0.22F, 0.0F, -5.25F, -0.22F, -11.15F, -5.25F, -0.22F, -11.15F, -5.25F, -0.22F, 0.0F, -5.25F, -0.22F); // Import 
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2.13F, 9.5F, 2.12F, 12, 6, 1, 0F,0.0F, -0.2F, -0.22F, -11.15F, -0.2F, -0.22F, -11.15F, -0.2F, -0.22F, 0.0F, -0.2F, -0.22F, 0.0F, -5.25F, -0.22F, -11.15F, -5.25F, -0.22F, -11.15F, -5.25F, -0.22F, 0.0F, -5.25F, -0.22F); // Import 
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-4F, 8F, -3.25F, 4, 3, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 64
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(-4F, 8.1F, -3.45F, 4, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 65
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(0.8F, 8F, -3.25F, 4, 3, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 134
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(0.8F, 8.1F, -3.45F, 4, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 135
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-4F, 5.9F, -2F, 8, 11, 4, 0F,0.1F, -3F, 0.1F, 0.1F, -3F, 0.1F, 0.1F, -3F, 0.1F, 0.1F, -3F, 0.1F, 0.3F, -3.1F, 0.5F, 0.3F, -3.1F, 0.5F, 0.3F, -3.1F, 0.5F, 0.3F, -3.1F, 0.5F); // Box 68
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(-0.5F, 9F, -2.25F, 1, 11, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.1F, 0.5F, 0.0F, -6.1F, 0.5F, 0.0F, -6.1F, 0F, 0.0F, -6.1F, 0.0F); // Box 69
		bodyModel[54].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import 

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 8, 4, 0F,0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 2F, 0.1F, 0.1F, 2F, 0.1F, 0.1F, 2F, 0.1F, 0.1F, 2F, 0.1F); // Import 
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Import 

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 8, 4, 0F,0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 2F, 0.1F, 0.1F, 2F, 0.1F, 0.1F, 2F, 0.1F, 0.1F, 2F, 0.1F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import 
		leftLegModel[1] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Import 
		leftLegModel[2] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 136
		leftLegModel[3] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 71

		leftLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 6, 4, 0F,0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Import 
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 10F, -3F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 2.9F, -2F, 4, 6, 4, 0F,0.2F, -2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 71
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Import 
		rightLegModel[1] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import 
		rightLegModel[2] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Box 137
		rightLegModel[3] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 70

		rightLegModel[0].addShapeBox(-2F, -0.0999999999999996F, -2F, 4, 6, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F); // Import 
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 10F, -3F, 4, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import 
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 6F, -2F, 4, 4, 4, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 137
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 2.9F, -2F, 4, 6, 4, 0F,0.2F, -2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0.2F, -2.5F, 0.2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 70
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);
	}
}