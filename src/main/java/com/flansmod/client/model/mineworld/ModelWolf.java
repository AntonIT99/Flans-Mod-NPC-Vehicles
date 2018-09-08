//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Wolf
// Model Creator: 
// Created on: 21.04.2016 - 18:43:09
// Last changed on: 21.04.2016 - 18:43:09

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWolf extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelWolf() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import field_78185_a-0
		bodyModel[1] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Import field_78185_a-1
		bodyModel[2] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Import field_78185_a-2
		bodyModel[3] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import field_78185_a-3
		bodyModel[4] = new ModelRendererTurbo(this, 21, 0, textureX, textureY); // Import field_78186_h
		bodyModel[5] = new ModelRendererTurbo(this, 18, 14, textureX, textureY); // Import field_78183_b
		bodyModel[6] = new ModelRendererTurbo(this, 9, 18, textureX, textureY); // Import field_78180_g
		bodyModel[7] = new ModelRendererTurbo(this, 0, 18, textureX, textureY); // Import field_78179_f
		bodyModel[8] = new ModelRendererTurbo(this, 0, 18, textureX, textureY); // Import field_78184_c
		bodyModel[9] = new ModelRendererTurbo(this, 0, 18, textureX, textureY); // Import field_78181_d
		bodyModel[10] = new ModelRendererTurbo(this, 0, 18, textureX, textureY); // Import field_78182_e

		bodyModel[0].addBox(-3F, 10.5F, -9F, 6, 6, 4, 0F); // Import field_78185_a-0
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addBox(-3F, 8.5F, -7F, 2, 2, 1, 0F); // Import field_78185_a-1
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(1F, 8.5F, -7F, 2, 2, 1, 0F); // Import field_78185_a-2
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-1.5F, 13.49F, -12F, 3, 3, 4, 0F); // Import field_78185_a-3
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 10F, -6F, 8, 6, 7, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 1F, -6F, 0F, 1F, -6F, 0F, -6F, -1F, 0F, -6F, -1F); // Import field_78186_h
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3F, 11F, 0F, 6, 9, 6, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -3F, -9F, 0F, -3F, -9F, 0F, -9F, 3F, 0F, -9F, 3F); // Import field_78183_b
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 12.5F, 9F, 2, 8, 2, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, -2F, 3F, 0F, -2F, 3F); // Import field_78180_g
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(-2.5F, 16F, -5F, 2, 8, 2, 0F); // Import field_78179_f
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addBox(-2.5F, 16F, 6F, 2, 8, 2, 0F); // Import field_78184_c
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addBox(0.5F, 16F, 6F, 2, 8, 2, 0F); // Import field_78181_d
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(0.5F, 16F, -5F, 2, 8, 2, 0F); // Import field_78182_e
		bodyModel[10].setRotationPoint(0F, 0F, 0F);


	}
}