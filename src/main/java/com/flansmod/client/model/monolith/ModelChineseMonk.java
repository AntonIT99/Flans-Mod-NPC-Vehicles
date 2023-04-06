//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.03.2020 - 17:19:35
// Last changed on: 16.03.2020 - 17:19:35

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelChineseMonk extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelChineseMonk() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box532
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 168
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 101
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 60
		bodyModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 61
		bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 62
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 63
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 64
		bodyModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 65
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 66
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 67
		bodyModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[13] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 3
		bodyModel[14] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 1
		bodyModel[15] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 3
		bodyModel[16] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 55
		bodyModel[17] = new ModelRendererTurbo(this, 424, 12, textureX, textureY); // Import Box531
		bodyModel[18] = new ModelRendererTurbo(this, 424, 12, textureX, textureY); // Box 165
		bodyModel[19] = new ModelRendererTurbo(this, 424, 12, textureX, textureY); // Box 167

		bodyModel[0].addShapeBox(-3.5F, -1F, -3.5F, 1, 8, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.5F, 0F); // Import Box532
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(2.5F, -1F, -3.5F, 1, 8, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, -0.2F, 0F); // Box 168
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(2.45F, 0.7F, -3.8F, 1, 1, 1, 0F); // Box 101
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(2.45F, 2.5F, -3.8F, 1, 1, 1, 0F); // Box 60
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(2.45F, 4.5F, -3.8F, 1, 1, 1, 0F); // Box 61
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(-3.35F, 4.5F, -3.8F, 1, 1, 1, 0F); // Box 62
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(-3.35F, 2.5F, -3.8F, 1, 1, 1, 0F); // Box 63
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(-3.45F, 0.7F, -3.8F, 1, 1, 1, 0F); // Box 64
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addBox(-2.35F, 6.3F, -3.8F, 1, 1, 1, 0F); // Box 65
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addBox(1.45F, 6.3F, -3.8F, 1, 1, 1, 0F); // Box 66
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(-0.5F, 6.8F, -3.8F, 1, 1, 1, 0F); // Box 67
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 0F, -2.5F, 4, 8, 4, 0F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 1F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 0F, -2.6F, 5, 7, 4, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F, 1F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0.2F, 1F, 2.5F, 0.2F); // Box 1
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-1F, 0F, -2.6F, 5, 4, 4, 0F, -1.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -1.2F, 0F, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F); // Box 3
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3F, 3F, -3F, 8, 10, 6, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 2F, 2F, 0F, 0.1F, 1F, 0F, 0.1F, 1F, 0.2F, 2F, 2F, 0.2F); // Box 1
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3F, 0F, -3F, 8, 7, 6, 0F, -4.2F, 0F, 0F, -0.9F, 0.2F, 0F, -0.9F, 0.2F, 0F, -4.2F, 0F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F, 0.1F, -2F, 0F); // Box 3
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 0F, -1.4F, 8, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 55
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 5.8F, -3.5F, 3, 1, 2, 0F, -0.5F, -0.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, -0.2F, 0F); // Import Box531
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1.5F, 6.8F, -3.5F, 3, 1, 2, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 165
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0.5F, 5.8F, -3.5F, 3, 1, 2, 0F, -0.5F, -1.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, 0.8F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0.8F, 0F); // Box 167
		bodyModel[19].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 54

		leftArmModel[0].addShapeBox(-0.67F, -2F, -2F, 3, 12, 4, 0F, 0.45F, 0.1F, 0.45F, 0.85F, 0.1F, 0.45F, 0.85F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, -0.5F, 0.45F, 1.45F, -0.5F, 0.45F, 1.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F); // Box 54
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Import Box153

		rightArmModel[0].addShapeBox(-2.33F, -2F, -2F, 3, 12, 4, 0F, 0.85F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.85F, 0.1F, 0.45F, 1.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 1.45F, -0.5F, 0.45F); // Import Box153
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[9];
		leftLegModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box78
		leftLegModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 164
		leftLegModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 151
		leftLegModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 152
		leftLegModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 153
		leftLegModel[5] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 109
		leftLegModel[6] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 204
		leftLegModel[7] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 136
		leftLegModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box114

		leftLegModel[0].addShapeBox(-2F, 11F, -3.75F, 4, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box78
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Box 164
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-0.5F, 10.2F, -4F, 1, 1, 4, 0F, -0.3F, -0.4F, -0.85F, -0.3F, -0.5F, -0.85F, -0.3F, -0.5F, -2.6F, -0.3F, -0.4F, -2.6F, -0.3F, 0F, -0.85F, -0.3F, 0F, -0.85F, -0.3F, 0F, -2.6F, -0.3F, 0F, -2.6F); // Box 151
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 10.2F, -2.75F, 4, 1, 1, 0F, -0.25F, -0.5F, -0.3F, -2.1F, -0.5F, 0.3F, -2.1F, -0.4F, -0.9F, -0.25F, -0.4F, -0.3F, -0.25F, 0F, -0.3F, -2.1F, 0F, 0.3F, -2.1F, 0F, -0.9F, -0.25F, 0F, -0.3F); // Box 152
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, 10.2F, -2.75F, 4, 1, 1, 0F, -2.1F, -0.5F, 0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.4F, -0.3F, -2.1F, -0.4F, -0.9F, -2.1F, 0F, 0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -2.1F, 0F, -0.9F); // Box 153
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-2F, -1F, -2F, 4, 8, 4, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F); // Box 109
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F, 0F, 0F, 0.45F, 0.5F, 0F, 0.55F, 0.5F, 0F, 0.55F, 0F, 0F, 0.15F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-2F, 8F, -2F, 4, 2, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 136
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, -1.95F, -2F, 4, 14, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box114
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[9];
		rightLegModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box76
		rightLegModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 163
		rightLegModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Import Box79
		rightLegModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 149
		rightLegModel[4] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 150
		rightLegModel[5] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 115
		rightLegModel[6] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 203
		rightLegModel[7] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 202
		rightLegModel[8] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Import Box115

		rightLegModel[0].addShapeBox(-2F, 11F, -3.75F, 4, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box76
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 11.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Box 163
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10.2F, -2.75F, 4, 1, 1, 0F, -0.25F, -0.5F, -0.3F, -2.1F, -0.5F, 0.3F, -2.1F, -0.4F, -0.9F, -0.25F, -0.4F, -0.3F, -0.25F, 0F, -0.3F, -2.1F, 0F, 0.3F, -2.1F, 0F, -0.9F, -0.25F, 0F, -0.3F); // Import Box79
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 10.2F, -2.75F, 4, 1, 1, 0F, -2.1F, -0.5F, 0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.4F, -0.3F, -2.1F, -0.4F, -0.9F, -2.1F, 0F, 0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -2.1F, 0F, -0.9F); // Box 149
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-0.5F, 10.2F, -4F, 1, 1, 4, 0F, -0.3F, -0.4F, -0.85F, -0.3F, -0.5F, -0.85F, -0.3F, -0.5F, -2.6F, -0.3F, -0.4F, -2.6F, -0.3F, 0F, -0.85F, -0.3F, 0F, -0.85F, -0.3F, 0F, -2.6F, -0.3F, 0F, -2.6F); // Box 150
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-2F, 8F, -2F, 4, 2, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 115
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, -1F, -2F, 4, 8, 4, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F); // Box 202
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, -1.95F, -2F, 4, 14, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box115
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);


		skirtFrontModel = new ModelRendererTurbo[4];
		skirtFrontModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 104
		skirtFrontModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 170
		skirtFrontModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 169
		skirtFrontModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 170

		skirtFrontModel[0].addShapeBox(-4F, -2.5F, -2.5F, 8, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 104
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(-4.2F, -2.5F, -2.5F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 170
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(3.2F, -2.5F, -2.5F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 169
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[3].addShapeBox(-4.2F, -2.5F, -2.5F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 170
		skirtFrontModel[3].setRotationPoint(0F, 0F, 0F);


		skirtRearModel = new ModelRendererTurbo[1];
		skirtRearModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 254

		skirtRearModel[0].addShapeBox(-4F, -2.5F, 1.5F, 8, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 254
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);


	}
}