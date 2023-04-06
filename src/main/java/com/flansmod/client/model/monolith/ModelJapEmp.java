//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.03.2020 - 19:46:13
// Last changed on: 14.03.2020 - 19:46:13

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJapEmp extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelJapEmp() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import 
		headModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box203
		headModel[3] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box200
		headModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 25
		headModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 25
		headModel[6] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 58

		headModel[0].addShapeBox(-3.5F, -8F, -4F, 7, 2, 8, 0F, 0.45F, 0.3F, -0.15F, 0.45F, 0.3F, -0.15F, 0.45F, 0.3F, 0F, 0.45F, 0.3F, 0F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.4F, 0.9F, -0.5F, 0.4F); // Import 
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-3.5F, -6.5F, -4F, 7, 2, 8, 0F, 0.9F, 0.0F, 0.9F, 0.9F, 0.0F, 0.9F, 0.9F, 0.0F, 0.4F, 0.9F, 0.0F, 0.4F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.1F, 0.4F, 0.9F, -0.1F, 0.4F); // Import 
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(0F, -5F, -1.6F, 4, 5, 1, 0F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0F, 0.2F, 2.2F, 0.05F, 0.05F, 2.2F, 0.05F, 0.05F, -2.8F, 0F, 0.2F, -2.8F); // Import Box203
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5F, -1.6F, 4, 5, 1, 0F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.4F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0.05F, 2.2F, 0F, 0.2F, 2.2F, 0F, 0.2F, -2.8F, 0.05F, 0.05F, -2.8F); // Import Box200
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -10F, 1F, 6, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 25
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1F, -9F, 0.9F, 2, 2, 2, 0F, 0.5F, 4F, 1F, 0.5F, 4F, 1F, 0.5F, 3.5F, 0F, 0.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -15F, 2.9F, 2, 7, 1, 0F, 0.5F, 4F, -1F, 0.5F, 4F, -1F, 0.5F, 3.5F, 2F, 0.5F, 3.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		headModel[6].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[10];
		bodyModel[0] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box15
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Import Box89
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box90
		bodyModel[3] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 12
		bodyModel[4] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 29
		bodyModel[6] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 30
		bodyModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 31
		bodyModel[8] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 55
		bodyModel[9] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 57

		bodyModel[0].addShapeBox(-4F, 6.5F, -2.4F, 4, 3, 5, 0F, 0.6F, 0F, 0.4F, 0F, -0.5F, 1.5F, 0F, 0F, 1F, 0.6F, 0F, 0.5F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F); // Import Box15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 3.5F, -2.4F, 4, 3, 5, 0F, 0.5F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.6F, 0F, 0.4F, 0F, 0.49F, 1.49F, 0F, 0F, 1F, 0.6F, 0F, 0.4F); // Import Box89
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 2.5F, -2.4F, 4, 1, 5, 0F, 0.4F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, 0.4F, 0.5F, 0.7F, 0.5F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.5F, 0F, 0.5F); // Import Box90
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, -0.5F, -2.4F, 4, 2, 5, 0F, 0.4F, -0.3F, 0.3F, -1.5F, -1.3F, 0.2F, 0F, -0.3F, 0.8F, 0.4F, -0.3F, 0.5F, 0.4F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, 0.4F, 0.5F, 0.7F); // Box 12
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0F, -2.6F, 8, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 1
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, -0.5F, -2.4F, 4, 2, 5, 0F, -1.5F, -1.3F, 0.2F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.8F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.7F, 0F, 0.5F, 1F); // Box 29
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 2.5F, -2.4F, 4, 1, 5, 0F, 0F, 0.5F, 0.8F, 0.4F, 0.5F, 0.5F, 0.4F, 0.5F, 0.7F, 0F, 0.5F, 1F, 0F, 0F, 1.2F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 0F, 0F, 1F); // Box 30
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 3.5F, -2.4F, 4, 3, 5, 0F, 0F, 0F, 1.2F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.49F, 1.49F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0F, 0F, 1F); // Box 31
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 0F, -1.4F, 8, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 6.5F, -2.4F, 4, 3, 5, 0F, 0F, -0.5F, 1.5F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 57
		bodyModel[9].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 54

		leftArmModel[0].addShapeBox(-0.67F, -2F, -2F, 4, 12, 4, 0F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, -0.5F, 0.45F, 2.45F, -0.5F, 0.45F, 2.45F, -0.5F, 1.45F, 0.45F, -0.5F, 2.45F); // Box 54
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Import Box153

		rightArmModel[0].addShapeBox(-3.33F, -2F, -2F, 4, 12, 4, 0F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 2.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 2.45F, 2.45F, -0.5F, 1.45F); // Import Box153
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 136
		leftLegModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import Box78
		leftLegModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box114
		leftLegModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 164

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 136
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11F, -3.75F, 4, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box78
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box114
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 11.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Box 164
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 115
		rightLegModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box76
		rightLegModel[2] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box115
		rightLegModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 163

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 115
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 11F, -3.75F, 4, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box76
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box115
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 11.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Box 163
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);


		skirtFrontModel = new ModelRendererTurbo[3];
		skirtFrontModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 104
		skirtFrontModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 169
		skirtFrontModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 170

		skirtFrontModel[0].addShapeBox(-4F, -2.5F, -2.5F, 8, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 104
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(3.2F, -2.5F, -2.5F, 1, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 169
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-4.2F, -2.5F, -2.5F, 1, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 170
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);


		skirtRearModel = new ModelRendererTurbo[1];
		skirtRearModel[0] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 254

		skirtRearModel[0].addShapeBox(-4F, -2.5F, 1.5F, 8, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 254
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);


	}
}