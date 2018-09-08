//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Schirmmuetze
// Model Creator: 
// Created on: 29.02.2016 - 18:52:18
// Last changed on: 29.02.2016 - 18:52:18

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGermanSchirmmuetze extends ModelCustomArmour //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelGermanSchirmmuetze() //Same as Filename
	{
		headModel = new ModelRendererTurbo[8];
		headModel[0] = new ModelRendererTurbo(this, 0, 126, textureX, textureY); // Import Import
		headModel[1] = new ModelRendererTurbo(this, 71, 126, textureX, textureY); // Import Import
		headModel[2] = new ModelRendererTurbo(this, 0, 148, textureX, textureY); // Import Import
		headModel[3] = new ModelRendererTurbo(this, 125, 127, textureX, textureY); // Import Import
		headModel[4] = new ModelRendererTurbo(this, 125, 127, textureX, textureY); // Import Import
		headModel[5] = new ModelRendererTurbo(this, 220, 950, textureX, textureY); // Import Import
		headModel[6] = new ModelRendererTurbo(this, 12, 280, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7

		headModel[0].addShapeBox(-4F, -7.4F, -4F, 16, 2, 16, 0F, 0F, 0.0F, 0.2F, -8F, 0.0F, 0.2F, -8F, 0.0F, -7.9F, 0F, 0.0F, -7.9F, 0.1F, 0.8F, 0.2F, -7.9F, 0.8F, 0.2F, -7.9F, 0.8F, -7.9F, 0.1F, 0.8F, -7.9F); // Import Import
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8.4F, -4F, 16, 2, 16, 0F, 1.0F, 0.0F, 1.0F, -7.2F, 0.0F, 1.0F, -7.2F, -0.3F, -7.0F, 1.0F, -0.3F, -7.0F, 0.0F, -0.2F, 0.2F, -8.0F, -0.2F, 0.2F, -8.0F, 0.25F, -7.95F, 0.0F, 0.25F, -7.95F); // Import Import
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5.4F, -4.5F, 16, 1, 16, 0F, 0.2F, -0.5F, -0.3F, -7.8F, -0.5F, -0.3F, -7.8F, -0.5F, -7.2F, 0.2F, -0.5F, -7.2F, 0.2F, 0.0F, 0.6F, -7.8F, 0.0F, 0.6F, -7.8F, 0.0F, -7.2F, 0.2F, 0.0F, -7.2F); // Import Import
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5.75F, -4.05F, 8, 1, 3, 0F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F); // Import Import
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -5.5F, -4.05F, 8, 1, 3, 0F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.2F, -0.4F, 0.2F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F, 0.25F, -0.4F, 0.25F); // Import Import
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-1.6F, -6.9F, -4.3F, 782, 471, 1, 0F, 0.0F, 0.0F, 0.0F, -779F, 0F, 0.0F, -779F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -469.5F, 0.0F, -779F, -469.5F, 0.0F, -779F, -469.5F, 0.0F, 0.0F, -469.5F, 0.0F); // Import Import
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-11.75F, -7.9F, -4.6F, 1000, 537, 1, 0F, -10.5F, 0.0F, 0.5F, -987F, 0.0F, 0.5F, -987F, 0F, 0.0F, -10.5F, 0.0F, 0.0F, -10.5F, -536F, 0.0F, -987F, -536F, 0.0F, -987F, -536F, 0.0F, -11.5F, -536F, 0.0F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.6F, -6.4F, -4.31F, 30, 30, 1, 0F, -0.15F, -0.15F, 0F, -29.15F, -0.15F, 0F, -29.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -29.15F, 0F, -29.15F, -29.15F, 0F, -29.15F, -29.15F, 0F, -0.15F, -29.15F, 0F); // Box 7
		headModel[7].setRotationPoint(0F, 0F, 0F);


	}
}