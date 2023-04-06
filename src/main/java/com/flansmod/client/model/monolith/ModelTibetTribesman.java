//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 16.03.2020 - 15:02:51
// Last changed on: 16.03.2020 - 15:02:51

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTibetTribesman extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelTibetTribesman() //Same as Filename
	{
		headModel = new ModelRendererTurbo[9];
		headModel[0] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 101
		headModel[1] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 60
		headModel[2] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 61
		headModel[3] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 62
		headModel[4] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 63
		headModel[5] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 64
		headModel[6] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 65
		headModel[7] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 66
		headModel[8] = new ModelRendererTurbo(this, 45, 2, textureX, textureY); // Box 67

		headModel[0].addBox(2.45F, 0.7F, -3.2F, 1, 1, 1, 0F); // Box 101
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addBox(2.45F, 2.5F, -3.2F, 1, 1, 1, 0F); // Box 60
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addBox(2.45F, 4.5F, -3.2F, 1, 1, 1, 0F); // Box 61
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addBox(-3.35F, 4.5F, -3.2F, 1, 1, 1, 0F); // Box 62
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addBox(-3.35F, 2.5F, -3.2F, 1, 1, 1, 0F); // Box 63
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addBox(-3.45F, 0.7F, -3.2F, 1, 1, 1, 0F); // Box 64
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addBox(-2.35F, 6.3F, -3.2F, 1, 1, 1, 0F); // Box 65
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addBox(1.45F, 6.3F, -3.2F, 1, 1, 1, 0F); // Box 66
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addBox(-0.5F, 6.8F, -3.2F, 1, 1, 1, 0F); // Box 67
		headModel[8].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[24];
		bodyModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 55
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box15
		bodyModel[5] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 56
		bodyModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 38
		bodyModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 81
		bodyModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 82
		bodyModel[9] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 39
		bodyModel[10] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 40
		bodyModel[11] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 41
		bodyModel[12] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 42
		bodyModel[13] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 43
		bodyModel[14] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 44
		bodyModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 45
		bodyModel[16] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 46
		bodyModel[17] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 47
		bodyModel[18] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 48
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Box531
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box532
		bodyModel[21] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 165
		bodyModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 167
		bodyModel[23] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 168

		bodyModel[0].addShapeBox(-4F, 0F, -1.4F, 8, 9, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2.5F, 4, 7, 4, 0F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 1F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-1F, 0F, -2.6F, 5, 7, 4, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 1F, 2F, 0.2F); // Box 1
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-1F, 0F, -2.6F, 5, 4, 4, 0F, -2.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.2F, 0F, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 8.5F, -2F, 4, 4, 4, 0F, 0.2F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0F, 1.2F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0F, 1.2F, 0.2F, 0F, 0.9F); // Import Box15
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 8.5F, -2F, 4, 4, 4, 0F, 0F, 0F, 1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.9F, 0F, 0F, 1.2F, 0F, 0F, 1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.9F, 0F, 0F, 1.2F); // Box 56
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 9F, -2.4F, 8, 3, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 11F, -2.2F, 4, 1, 4, 0F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F); // Box 81
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 11F, -2.2F, 4, 1, 4, 0F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F); // Box 82
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 9F, -2.2F, 4, 1, 4, 0F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F); // Box 39
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 9F, -2.2F, 4, 1, 4, 0F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F); // Box 40
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 10F, -2.2F, 4, 1, 4, 0F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F); // Box 41
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 10F, -2.2F, 4, 1, 4, 0F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F); // Box 42
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 9F, 1.2F, 4, 1, 1, 0F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F); // Box 43
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 10F, 1.2F, 4, 1, 1, 0F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F); // Box 44
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 11F, 1.2F, 4, 1, 1, 0F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F, 0.2F, -0.4F, 0.9F, 0F, -0.4F, 1.2F, 0F, -0.4F, 1.3F, 0.2F, -0.4F, 0.7F); // Box 45
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0F, 11F, 1.2F, 4, 1, 1, 0F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F); // Box 46
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0F, 10F, 1.2F, 4, 1, 1, 0F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F); // Box 47
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0F, 9F, 1.2F, 4, 1, 1, 0F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F, 0F, -0.4F, 1.2F, 0.2F, -0.4F, 0.9F, 0.2F, -0.4F, 0.7F, 0F, -0.4F, 1.3F); // Box 48
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-3.5F, 5.8F, -2.9F, 3, 1, 2, 0F, -0.5F, -0.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, -0.2F, 0F); // Import Box531
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3.5F, -1F, -2.9F, 1, 8, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.4F, -0.5F, 0F); // Import Box532
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1.5F, 6.8F, -2.9F, 3, 1, 2, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F); // Box 165
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.5F, 5.8F, -2.9F, 3, 1, 2, 0F, -0.5F, -1.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, 0.8F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, 0.8F, 0F); // Box 167
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(2.5F, -1F, -2.9F, 1, 8, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, -0.2F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, 0F, -0.2F, 0F); // Box 168
		bodyModel[23].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 53

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 11, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 49
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.8F, 5F, -2F, 4, 4, 4, 0F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 53
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[2];
		rightArmModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box153
		rightArmModel[1] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 52

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 11, 4, 0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Import Box153
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3.2F, 5F, -2F, 4, 4, 4, 0F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 52
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[9];
		leftLegModel[0] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box78
		leftLegModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 164
		leftLegModel[2] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 151
		leftLegModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 152
		leftLegModel[4] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 153
		leftLegModel[5] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 109
		leftLegModel[6] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 204
		leftLegModel[7] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 136
		leftLegModel[8] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import Box114

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
		rightLegModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box76
		rightLegModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 163
		rightLegModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box79
		rightLegModel[3] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 149
		rightLegModel[4] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 150
		rightLegModel[5] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 115
		rightLegModel[6] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 203
		rightLegModel[7] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 202
		rightLegModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box115

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


		skirtFrontModel = new ModelRendererTurbo[3];
		skirtFrontModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 104
		skirtFrontModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 169
		skirtFrontModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 170

		skirtFrontModel[0].addShapeBox(-4F, -2.5F, -2.5F, 8, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 104
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(3.2F, -2.5F, -2.5F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 169
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-4.2F, -2.5F, -2.5F, 1, 8, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 170
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);


		skirtRearModel = new ModelRendererTurbo[1];
		skirtRearModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 254

		skirtRearModel[0].addShapeBox(-4F, -2.5F, 1.5F, 8, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 254
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);


	}
}