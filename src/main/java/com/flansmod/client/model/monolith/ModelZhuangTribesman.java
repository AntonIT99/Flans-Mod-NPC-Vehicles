//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.03.2020 - 18:59:45
// Last changed on: 16.03.2020 - 18:59:45

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZhuangTribesman extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelZhuangTribesman() //Same as Filename
	{
		headModel = new ModelRendererTurbo[6];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 30
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 31
		headModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 32
		headModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 33
		headModel[5] = new ModelRendererTurbo(this, 189, 18, textureX, textureY); // Box 25

		headModel[0].addShapeBox(-4F, -10F, -4F, 8, 4, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10F, -5.2F, 8, 4, 1, 0F, -1.9F, 0F, 0.1F, -1.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -1.9F, 0F, -0.4F, -1.9F, 0F, -0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 30
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5.2F, -10F, 4F, 1, 4, 8, 0F, 0.1F, 0F, -1.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -1.9F, -0.4F, 0F, -1.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.4F, 0F, -1.9F); // Box 31
		headModel[2].setRotationPoint(0F, 0F, -8F);

		headModel[3].addShapeBox(-4F, -10F, 4.2F, 8, 4, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -1.9F, 0F, 0.1F, -1.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -1.9F, 0F, -0.4F, -1.9F, 0F, -0.4F); // Box 32
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(4.2F, -10F, 4F, 1, 4, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, -1.9F, 0.1F, 0F, -1.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.4F, 0F, -1.9F, -0.4F, 0F, -1.9F, 0.1F, 0F, 0.1F); // Box 33
		headModel[4].setRotationPoint(0F, 0F, -8F);

		headModel[5].addShapeBox(-4.8F, -6.6F, -4F, 1, 4, 1, 0F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F); // Box 25
		headModel[5].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[12];
		bodyModel[0] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 55
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box15
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 56
		bodyModel[3] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 32
		bodyModel[4] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Import Box105
		bodyModel[5] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 172
		bodyModel[6] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 508, 20, textureX, textureY); // Box 25
		bodyModel[8] = new ModelRendererTurbo(this, 508, 20, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 508, 20, textureX, textureY); // Box 47
		bodyModel[10] = new ModelRendererTurbo(this, 508, 20, textureX, textureY); // Box 48
		bodyModel[11] = new ModelRendererTurbo(this, 41, 20, textureX, textureY); // Box 49

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 55
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 8.5F, -2.1F, 4, 4, 4, 0F, 0.2F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0F, 1.2F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0F, 1.2F, 0.2F, 0F, 0.9F); // Import Box15
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8.5F, -2.1F, 4, 4, 4, 0F, 0F, 0F, 1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.9F, 0F, 0F, 1.2F, 0F, 0F, 1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.9F, 0F, 0F, 1.2F); // Box 56
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2F, 0F, -2.3F, 4, 9, 1, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 32
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-3.2F, 1F, -3.15F, 2, 8, 1, 0F, -5.3F, 1.15F, -0.4F, 5.4F, 1.15F, -0.33F, 5.4F, 1.15F, 0F, -5.4F, 1.15F, 0F, 0.8F, -0.4F, -0.35F, -0.9F, -0.4F, -0.35F, -0.9F, -0.4F, 0F, 1F, -0.4F, 0F); // Import Box105
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(1.5F, 1F, -3.15F, 1, 8, 1, 0F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F); // Box 172
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-2.5F, 1F, -3.15F, 1, 8, 1, 0F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F); // Box 43
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-1.5F, 2.5F, -2.96F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 25
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.5F, 4F, -2.96F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 46
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 7F, -2.96F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 47
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1.5F, 5.5F, -2.96F, 3, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 48
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-0.5F, 1F, -3.15F, 1, 8, 1, 0F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0.95F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F, -0.45F, 0F, -0.4F); // Box 49
		bodyModel[11].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 49

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 11, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, 0F, 0F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0F); // Box 49
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box153

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 11, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0.6F); // Import Box153
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[9];
		leftLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box78
		leftLegModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 164
		leftLegModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 151
		leftLegModel[3] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 152
		leftLegModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 153
		leftLegModel[5] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 109
		leftLegModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 204
		leftLegModel[7] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 136
		leftLegModel[8] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box114

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

		leftLegModel[7].addShapeBox(-2F, 8F, -2F, 4, 2, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 136
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, -1.95F, -2F, 4, 14, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box114
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[9];
		rightLegModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box76
		rightLegModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 163
		rightLegModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Box79
		rightLegModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 149
		rightLegModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 150
		rightLegModel[5] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 115
		rightLegModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 203
		rightLegModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 202
		rightLegModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Import Box115

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

		rightLegModel[5].addShapeBox(-2F, 8F, -2F, 4, 2, 4, 0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 115
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-2F, 7F, -2F, 4, 1, 4, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, -1F, -2F, 4, 8, 4, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.55F, 0F, 0F, 0.45F, 0F, 0F, 0.15F, 0.5F, 0F, 0.55F); // Box 202
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, -1.95F, -2F, 4, 14, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box115
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);


	}
}