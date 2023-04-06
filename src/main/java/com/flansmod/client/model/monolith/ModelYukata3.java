//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 15.03.2020 - 00:38:28
// Last changed on: 15.03.2020 - 00:38:28

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelYukata3 extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelYukata3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[9];
		bodyModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box15
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 55
		bodyModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 56
		bodyModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 45
		bodyModel[8] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 46

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 4, 2, 4, 0F, 0.2F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0F, 1.2F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0F, 1.2F, 0.2F, 0F, 0.9F); // Import Box15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(-4F, 0F, -1.4F, 8, 10, 4, 0F); // Box 55
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8.5F, -2F, 4, 2, 4, 0F, 0F, 0F, 1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.9F, 0F, 0F, 1.2F, 0F, 0F, 1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.9F, 0F, 0F, 1.2F); // Box 56
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0F, -2.5F, 4, 7, 4, 0F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 1F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-1F, 0F, -2.6F, 5, 7, 4, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 1F, 2F, 0.2F); // Box 1
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-1F, 0F, -2.6F, 5, 4, 4, 0F, -2.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.2F, 0F, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F); // Box 3
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5.33F, 0F, -2F, 1, 17, 4, 0F, -0.55F, 0.1F, 0.55F, 0.45F, 0.1F, 0.55F, 0.45F, 0.1F, 0.45F, -0.55F, 0.1F, 0.45F, 0.45F, -0.5F, 0.55F, 0F, -0.5F, 0.55F, 0F, -0.5F, 2.55F, 0.45F, -0.5F, 1.55F); // Box 43
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(4.33F, 0F, -2F, 1, 17, 4, 0F, 0.45F, 0.1F, 0.55F, -0.55F, 0.1F, 0.55F, -0.55F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0F, -0.5F, 0.55F, 0.45F, -0.5F, 0.55F, 0.45F, -0.5F, 1.55F, 0F, -0.5F, 2.55F); // Box 45
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 0.5F, 0.6F, 8, 16, 4, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0.35F, 0F, -3F, 0.35F, 0F, -3F, 0.35F, 0F, -0.05F, 0.35F, 0F, -0.05F); // Box 46
		bodyModel[8].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 54

		leftArmModel[0].addShapeBox(-0.67F, -2F, -2F, 4, 12, 4, 0F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, -0.5F, 0.45F, 2.45F, -0.5F, 0.45F, 2.45F, -0.5F, 1.45F, 0.45F, -0.5F, 2.45F); // Box 54
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box153

		rightArmModel[0].addShapeBox(-3.33F, -2F, -2F, 4, 12, 4, 0F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 2.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 2.45F, 2.45F, -0.5F, 1.45F); // Import Box153
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[12];
		leftLegModel[0] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box78
		leftLegModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box114
		leftLegModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 164
		leftLegModel[3] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 36
		leftLegModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 40
		leftLegModel[5] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 41
		leftLegModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 42
		leftLegModel[7] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 151
		leftLegModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 152
		leftLegModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 153
		leftLegModel[10] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 79
		leftLegModel[11] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 80

		leftLegModel[0].addShapeBox(-2F, 11F, -3.75F, 4, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box78
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 9.05F, -2F, 4, 3, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box114
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 11.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Box 164
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, -2F, -2F, 4, 11, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F, 1.1F, 0.5F, 0.9F, 0.1F, 0.5F, 0.9F); // Box 36
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-2F, -2F, -2.1F, 1, 11, 4, 0F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -1.9F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F); // Box 40
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-1F, -2F, -2.1F, 1, 11, 4, 0F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -1.9F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F); // Box 41
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(0F, -2F, -2.1F, 1, 11, 4, 0F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -1.9F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F); // Box 42
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-0.5F, 10.2F, -4F, 1, 1, 4, 0F, -0.3F, -0.4F, -0.85F, -0.3F, -0.5F, -0.85F, -0.3F, -0.5F, -2.6F, -0.3F, -0.4F, -2.6F, -0.3F, 0F, -0.85F, -0.3F, 0F, -0.85F, -0.3F, 0F, -2.6F, -0.3F, 0F, -2.6F); // Box 151
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-2F, 10.2F, -2.75F, 4, 1, 1, 0F, -0.25F, -0.5F, -0.3F, -2.1F, -0.5F, 0.3F, -2.1F, -0.4F, -0.9F, -0.25F, -0.4F, -0.3F, -0.25F, 0F, -0.3F, -2.1F, 0F, 0.3F, -2.1F, 0F, -0.9F, -0.25F, 0F, -0.3F); // Box 152
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-2F, 10.2F, -2.75F, 4, 1, 1, 0F, -2.1F, -0.5F, 0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.4F, -0.3F, -2.1F, -0.4F, -0.9F, -2.1F, 0F, 0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -2.1F, 0F, -0.9F); // Box 153
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-2F, 12F, 0F, 4, 1, 2, 0F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 79
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-2F, 12F, -2.75F, 4, 1, 2, 0F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 80
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[12];
		rightLegModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 115
		rightLegModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box76
		rightLegModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box115
		rightLegModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 163
		rightLegModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 37
		rightLegModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 38
		rightLegModel[6] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 39
		rightLegModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box79
		rightLegModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 149
		rightLegModel[9] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 150
		rightLegModel[10] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 77
		rightLegModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 78

		rightLegModel[0].addShapeBox(-2F, -2F, -2F, 4, 11, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 1.1F, 0.5F, 1.1F, 0.1F, 0.5F, 1.1F, 0.1F, 0.5F, 0.9F, 1.1F, 0.5F, 0.9F); // Box 115
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 11F, -3.75F, 4, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box76
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 9.05F, -2F, 4, 3, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box115
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 11.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Box 163
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-1F, -2F, -2.1F, 1, 11, 4, 0F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 1.1F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F); // Box 37
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(0F, -2F, -2.1F, 1, 11, 4, 0F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 1.1F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F); // Box 38
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(1F, -2F, -2.1F, 1, 11, 4, 0F, 0.1F, 0F, 0.1F, -0.9F, 0F, 0.1F, -0.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 1.1F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F, -1.9F, 0.5F, 1.1F, 1.1F, 0.5F, 1.1F); // Box 39
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2F, 10.2F, -2.75F, 4, 1, 1, 0F, -0.25F, -0.5F, -0.3F, -2.1F, -0.5F, 0.3F, -2.1F, -0.4F, -0.9F, -0.25F, -0.4F, -0.3F, -0.25F, 0F, -0.3F, -2.1F, 0F, 0.3F, -2.1F, 0F, -0.9F, -0.25F, 0F, -0.3F); // Import Box79
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2F, 10.2F, -2.75F, 4, 1, 1, 0F, -2.1F, -0.5F, 0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.4F, -0.3F, -2.1F, -0.4F, -0.9F, -2.1F, 0F, 0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -2.1F, 0F, -0.9F); // Box 149
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-0.5F, 10.2F, -4F, 1, 1, 4, 0F, -0.3F, -0.4F, -0.85F, -0.3F, -0.5F, -0.85F, -0.3F, -0.5F, -2.6F, -0.3F, -0.4F, -2.6F, -0.3F, 0F, -0.85F, -0.3F, 0F, -0.85F, -0.3F, 0F, -2.6F, -0.3F, 0F, -2.6F); // Box 150
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-2F, 12F, -2.75F, 4, 1, 2, 0F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 77
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-2F, 12F, 0F, 4, 1, 2, 0F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 78
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);


	}
}