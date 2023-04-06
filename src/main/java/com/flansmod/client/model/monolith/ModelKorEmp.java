//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 14.03.2020 - 20:01:31
// Last changed on: 14.03.2020 - 20:01:31

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKorEmp extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelKorEmp() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		headModel[0] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 25
		headModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 25
		headModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 29
		headModel[3] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 30
		headModel[4] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 31
		headModel[5] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 32
		headModel[6] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 33

		headModel[0].addShapeBox(-9F, -9.5F, 1F, 6, 3, 1, 0F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, -0.6F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, 0.8F, -0.2F); // Box 25
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -12F, -4F, 8, 7, 8, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 25
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(3F, -9.5F, 1F, 6, 3, 1, 0F, 0F, -0.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.6F, 0.8F, -0.2F, -0.6F, 0.8F, -0.2F, 0F, -0.2F, -0.2F); // Box 29
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -12F, -5.2F, 8, 7, 1, 0F, -1.9F, 0F, -0.4F, -1.9F, 0F, -0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -1.9F, 0F, 0.1F, -1.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 30
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5.2F, -12F, -4F, 1, 7, 8, 0F, -0.4F, 0F, -1.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -0.4F, 0F, -1.9F, 0.1F, 0F, -1.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -1.9F); // Box 31
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -12F, 4.2F, 8, 7, 1, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -1.9F, 0F, -0.4F, -1.9F, 0F, -0.4F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, -1.9F, 0F, 0.1F, -1.9F, 0F, 0.1F); // Box 32
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4.2F, -12F, -4F, 1, 7, 8, 0F, 0.1F, 0F, 0.1F, -0.4F, 0F, -1.9F, -0.4F, 0F, -1.9F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -1.9F, 0.1F, 0F, -1.9F, 0.1F, 0F, 0.1F); // Box 33
		headModel[6].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[9];
		bodyModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 55
		bodyModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Import Box15
		bodyModel[5] = new ModelRendererTurbo(this, 461, 6, textureX, textureY); // Box 56
		bodyModel[6] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 38
		bodyModel[7] = new ModelRendererTurbo(this, 3, 26, textureX, textureY); // Box 39
		bodyModel[8] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 40

		bodyModel[0].addShapeBox(-4F, 0F, -1.4F, 8, 10, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2.5F, 3, 8, 4, 0F, 0F, 0.2F, 0F, -0.9F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 2F, 0F, 2F, 2F, 0F, 2F, 1F, 0F, 0F, 2F, 0F); // Box 0
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3F, 0F, -2.6F, 7, 10, 4, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.2F, 1F, 2F, 0.2F); // Box 1
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3F, 0F, -2.6F, 7, 4, 4, 0F, -2.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -2.2F, 0F, 0F, 0.1F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.1F, -2F, 0F); // Box 3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 8.5F, -2F, 4, 2, 4, 0F, 0.2F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0F, 1.2F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.7F, 0F, 0F, 1.3F, 0F, 0F, 1.2F, 0.2F, 0F, 0.9F); // Import Box15
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 8.5F, -2F, 4, 2, 4, 0F, 0F, 0F, 1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.9F, 0F, 0F, 1.2F, 0F, 0F, 1.3F, 0.2F, 0F, 0.7F, 0.2F, 0F, 0.9F, 0F, 0F, 1.2F); // Box 56
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 0F, -2.4F, 8, 10, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 38
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-86F, -57F, -2.7F, 172, 124, 1, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F); // Box 39
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-86F, -57F, 1.7F, 172, 124, 1, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F, -89F, -65F, 0F); // Box 40
		bodyModel[8].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[1];
		leftArmModel[0] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 54

		leftArmModel[0].addShapeBox(-0.67F, -2F, -2F, 4, 12, 4, 0F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, -0.5F, 0.45F, 2.45F, -0.5F, 0.45F, 2.45F, -0.5F, 1.45F, 0.45F, -0.5F, 2.45F); // Box 54
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[1];
		rightArmModel[0] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Import Box153

		rightArmModel[0].addShapeBox(-3.33F, -2F, -2F, 4, 12, 4, 0F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 0.45F, 0.1F, 0.45F, 2.45F, -0.5F, 0.45F, 0.45F, -0.5F, 0.45F, 0.45F, -0.5F, 2.45F, 2.45F, -0.5F, 1.45F); // Import Box153
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 455, 31, textureX, textureY); // Box 136
		leftLegModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box78
		leftLegModel[2] = new ModelRendererTurbo(this, 451, 16, textureX, textureY); // Import Box114
		leftLegModel[3] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 164

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 136
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 11F, -3.75F, 4, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box78
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 10.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box114
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 11.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Box 164
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 439, 31, textureX, textureY); // Box 115
		rightLegModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box76
		rightLegModel[2] = new ModelRendererTurbo(this, 451, 16, textureX, textureY); // Import Box115
		rightLegModel[3] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 163

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 10, 4, 0F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Box 115
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 11F, -3.75F, 4, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, -0.05F, 0F, -0.25F); // Import Box76
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 10.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Import Box115
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 11.05F, -2F, 4, 2, 4, 0F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, 0F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F, 0.02F, -1F, 0.02F); // Box 163
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);


		skirtFrontModel = new ModelRendererTurbo[3];
		skirtFrontModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 104
		skirtFrontModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 169
		skirtFrontModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 170

		skirtFrontModel[0].addShapeBox(-4F, -2.5F, -2.5F, 8, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 104
		skirtFrontModel[0].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[1].addShapeBox(3.2F, -2.5F, -2.5F, 1, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 169
		skirtFrontModel[1].setRotationPoint(0F, 0F, 0F);

		skirtFrontModel[2].addShapeBox(-4.2F, -2.5F, -2.5F, 1, 12, 5, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 170
		skirtFrontModel[2].setRotationPoint(0F, 0F, 0F);


		skirtRearModel = new ModelRendererTurbo[1];
		skirtRearModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 254

		skirtRearModel[0].addShapeBox(-4F, -2.5F, 1.5F, 8, 12, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 254
		skirtRearModel[0].setRotationPoint(0F, 0F, 0F);


	}
}