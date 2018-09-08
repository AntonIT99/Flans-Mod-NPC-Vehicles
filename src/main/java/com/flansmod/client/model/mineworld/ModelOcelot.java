//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ocelot
// Model Creator: 
// Created on: 21.04.2016 - 20:19:51
// Last changed on: 21.04.2016 - 20:19:51

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOcelot extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelOcelot() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[11];
		bodyModel[0] = new ModelRendererTurbo(this, 20, 0, textureX, textureY); // Import field_78162_h
		bodyModel[1] = new ModelRendererTurbo(this, 0, 15, textureX, textureY); // Import Box11
		bodyModel[2] = new ModelRendererTurbo(this, 4, 15, textureX, textureY); // Import Box12
		bodyModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import main
		bodyModel[4] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Import nose
		bodyModel[5] = new ModelRendererTurbo(this, 0, 10, textureX, textureY); // Import ear1
		bodyModel[6] = new ModelRendererTurbo(this, 6, 10, textureX, textureY); // Import ear2
		bodyModel[7] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Import field_78159_b
		bodyModel[8] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Import field_78157_d
		bodyModel[9] = new ModelRendererTurbo(this, 8, 13, textureX, textureY); // Import field_78161_a
		bodyModel[10] = new ModelRendererTurbo(this, 40, 0, textureX, textureY); // Import field_78160_c

		bodyModel[0].addShapeBox(-2F, 14F, 3F, 4, 16, 6, 0F, 0F, -6F, 10F, 0F, -6F, 10F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, -10F, -6F, 0F, -10F, -6F, 0F, -16F, 0F, 0F, -16F, 0F); // Import field_78162_h
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-0.5F, 14.5F, 7.25F, 1, 8, 1, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.25F, -6.5F, 0F, -2.25F, -6.5F, 0F, -3F, 6.25F, 0F, -3F, 6.25F); // Import Box11
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, 10F, 20.6F, 1, 8, 1, 0F, -0.01F, -10.25F, 6.75F, -0.01F, -10.25F, 6.75F, -0.01F, -9.25F, -7.9F, -0.01F, -9.25F, -7.9F, -0.01F, 1F, -1.15F, -0.01F, 1F, -1.15F, -0.01F, 0F, 0F, -0.01F, 0F, 0F); // Import Box12
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addBox(-2.5F, 13F, -11F, 5, 4, 5, 0F); // Import main
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addBox(-1.5F, 15F, -12F, 3, 2, 2, 0F); // Import nose
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addBox(-2F, 12F, -9F, 1, 1, 2, 0F); // Import ear1
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addBox(1F, 12F, -9F, 1, 1, 2, 0F); // Import ear2
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addBox(-2.1F, 18F, 6F, 2, 6, 2, 0F); // Import field_78159_b
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addBox(-2.2F, 13.8F, -5F, 2, 10, 2, 0F); // Import field_78157_d
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addBox(0.1F, 18F, 6F, 2, 6, 2, 0F); // Import field_78161_a
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addBox(0.2F, 13.8F, -5F, 2, 10, 2, 0F); // Import field_78160_c
		bodyModel[10].setRotationPoint(0F, 0F, 0F);


	}
}