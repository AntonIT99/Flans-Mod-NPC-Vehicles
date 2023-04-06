//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: class
// Model Creator: 
// Created on: 02.04.2021 - 15:05:33
// Last changed on: 02.04.2021 - 15:05:33

package com.flansmod.client.model.NewArmor; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHamasBody extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelHamasBody() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[14];
		bodyModel[0] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import 
		bodyModel[3] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import 
		bodyModel[4] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import 
		bodyModel[5] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import 
		bodyModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import 
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[8] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Import 
		bodyModel[9] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import 

		bodyModel[0].addShapeBox(-4F, -0.1F, -2F, 4, 2, 4, 0F, 0.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 1.9F, -2F, 8, 9, 4, 0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F); // Import 
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, -0.1F, -2F, 4, 2, 4, 0F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F, 0.0F, -0.5F, 0.1F); // Import 
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(0.65F, 2.5F, -2.3F, 3, 1, 1, 0F); // Import 
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(-3.65F, 2.5F, -2.3F, 3, 1, 1, 0F); // Import 
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(-3.65F, 3.5F, -2.25F, 3, 2, 1, 0F); // Import 
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(0.65F, 3.5F, -2.25F, 3, 2, 1, 0F); // Import 
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 1F, -2.15F, 1, 4, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F, 0.0F, 0F, 0.0F); // Import 
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 5F, -2.15F, 1, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F); // Import 
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-1.1F, 0F, -2.05F, 10, 14, 7, 0F, 0.0F, 0.1F, 0.0F, -7.8F, 0.1F, 0.0F, -7.8F, 0.1F, -4F, 0.0F, 0.1F, -4F, 0.0F, -12.0F, 0.0F, -7.8F, -12.0F, 0F, -7.8F, -12.0F, -4F, 0.0F, -12.0F, -4F); // Import 
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, -0.1F, -2.15F, 2, 2, 1, 0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import 
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1.5F, -0.1F, -2.15F, 2, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F); // Import 
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3F, -0.3F, -2F, 1, 1, 4, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2F, -0.3F, -2F, 1, 1, 4, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[13].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[2];
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3

		leftArmModel[0].addShapeBox(-1.05F, -2F, -2.1F, 8, 22, 8, 0F, 0.0F, 0.1F, 0.0F, -3.8F, 0.1F, 0.0F, -3.8F, 0.1F, -3.8F, 0.0F, 0.1F, -3.8F, 0.0F, -12.0F, 0.0F, -3.8F, -12.0F, 0.0F, -3.8F, -12.0F, -3.8F, 0.0F, -12.0F, -3.8F); // Import 
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.95F, 6.5F, -2F, 4, 2, 4, 0F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 3
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[2];
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		rightArmModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2

		rightArmModel[0].addShapeBox(-3.1F, -2F, -2.1F, 8, 22, 8, 0F, 0.0F, 0.1F, 0.0F, -3.8F, 0.1F, 0.0F, -3.8F, 0.1F, -3.8F, 0.0F, 0.1F, -3.8F, 0.0F, -12.0F, 0.0F, -3.8F, -12.0F, 0.0F, -3.8F, -12.0F, -3.8F, 0.0F, -12.0F, -3.8F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 6.5F, -2F, 4, 2, 4, 0F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[4];
		leftLegModel[0] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import 
		leftLegModel[1] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 93
		leftLegModel[2] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 95
		leftLegModel[3] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 97

		leftLegModel[0].addShapeBox(-2.1F, -1F, -2.1F, 8, 20, 8, 0F, 0.0F, 0.1F, 0.0F, -3.8F, 0.1F, 0.0F, -3.8F, 0.1F, -3.8F, 0.0F, 0.1F, -3.8F, 0.0F, -12.0F, 0.0F, -3.8F, -12.0F, 0.0F, -3.8F, -12.0F, -3.8F, 0.0F, -12.0F, -3.8F); // Import 
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 6F, -2.3F, 4, 6, 5, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, -0.475F, 0.125F, -0.55F, -0.475F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 93
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2F, 9F, -3.82F, 4, 3, 2, 0F, -0.275F, -0.8F, -0.75F, -0.275F, -0.8F, -0.75F, 0.125F, -0.8F, -0.475F, 0.125F, -0.8F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 95
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-2F, 7.8F, -3.82F, 4, 2, 2, 0F, -0.775F, -1.6F, -1.15F, -0.775F, -1.6F, -1.15F, -0.175F, -1.6F, -0.225F, -0.175F, -1.6F, -0.225F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 97
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[4];
		rightLegModel[0] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import 
		rightLegModel[1] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 25
		rightLegModel[2] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 94
		rightLegModel[3] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 96

		rightLegModel[0].addShapeBox(-2.1F, -1F, -2.1F, 8, 20, 8, 0F, 0.0F, 0.1F, 0.0F, -3.8F, 0.1F, 0.0F, -3.8F, 0.1F, -3.8F, 0.0F, 0.1F, -3.8F, 0.0F, -12.0F, 0.0F, -3.8F, -12.0F, 0.0F, -3.8F, -12.0F, -3.8F, 0.0F, -12.0F, -3.8F); // Import 
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 6F, -2.3F, 4, 6, 5, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, 0F, 0.125F, -0.55F, -0.475F, 0.125F, -0.55F, -0.475F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, 0F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 25
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-2F, 9F, -3.82F, 4, 3, 2, 0F, -0.275F, -0.8F, -0.75F, -0.275F, -0.8F, -0.75F, 0.125F, -0.8F, -0.475F, 0.125F, -0.8F, -0.475F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 94
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-2F, 7.8F, -3.82F, 4, 2, 2, 0F, -0.775F, -1.6F, -1.15F, -0.775F, -1.6F, -1.15F, -0.175F, -1.6F, -0.225F, -0.175F, -1.6F, -0.225F, -0.275F, 0.05F, -0.75F, -0.275F, 0.05F, -0.75F, 0.125F, 0.05F, -0.475F, 0.125F, 0.05F, -0.475F); // Box 96
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);


	}
}