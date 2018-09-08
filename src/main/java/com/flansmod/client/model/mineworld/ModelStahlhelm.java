//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Stahlhelm
// Model Creator: 
// Created on: 19.04.2016 - 14:33:13
// Last changed on: 19.04.2016 - 14:33:13

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStahlhelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelStahlhelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];
		headModel[0] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Import 702
		headModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 704
		headModel[2] = new ModelRendererTurbo(this, 29, 1, textureX, textureY); // Import Box15
		headModel[3] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Import Box16
		headModel[4] = new ModelRendererTurbo(this, 79, 1, textureX, textureY); // Import Box17
		headModel[5] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Import Box18
		headModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box19
		headModel[7] = new ModelRendererTurbo(this, 0, 16, textureX, textureY); // Import Box20
		headModel[8] = new ModelRendererTurbo(this, 0, -16, textureX, textureY); // Import Box8
		headModel[9] = new ModelRendererTurbo(this, 542, 30, textureX, textureY); // Import Box9
		headModel[10] = new ModelRendererTurbo(this, 350, 30, textureX, textureY); // Import Box10
		headModel[11] = new ModelRendererTurbo(this, 528, -16, textureX, textureY); // Import Box11
		headModel[12] = new ModelRendererTurbo(this, 350, 30, textureX, textureY); // Import Box12
		headModel[13] = new ModelRendererTurbo(this, 542, 30, textureX, textureY); // Import Box13
		headModel[14] = new ModelRendererTurbo(this, 8, 24, textureX, textureY); // Box 14

		headModel[0].addShapeBox(-4.5F, -8F, -4.5F, 9, 2, 9, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import 702
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4.5F, -5F, -4.5F, 9, 1, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.35F, 0F, 1.3F, 0.35F, 0F, 1.3F, 0.35F, 0F, 0F, 0.35F, 0F, 0F); // Import 704
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4.5F, -9F, -4.5F, 9, 1, 9, 0F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Import Box15
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addBox(-4.5F, -7F, -4.5F, 9, 2, 9, 0F); // Import Box16
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5.5F, -5F, -3.5F, 11, 3, 9, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box17
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3.5F, -4F, -4.5F, 1, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, 0F, 0F, -2.5F); // Import Box18
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, 0F, -4F, 9, 1, 1, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, 0F); // Import Box19
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -4F, -4.5F, 1, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, -0.4F, 0F, -2.5F); // Import Box20
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5.45F, -66F, -59.5F, 1, 256, 256, 0F, -0.9F, -59F, -59F, 0F, -59F, -59F, 0F, -59F, -195F, -0.9F, -59F, -195F, -0.9F, -195F, -59F, 0F, -195F, -59F, 0F, -195F, -195F, -0.9F, -195F, -195F); // Import Box8
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.45F, -46.25F, -42F, 1, 80, 80, 0F, -0.9F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F); // Import Box9
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5.2F, -47.65F, -39.5F, 1, 80, 80, 0F, -1.1F, -39.7F, -39.7F, 0.2F, -39.7F, -39.7F, 0.2F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, -0.8F, -39.7F, -39.7F, -0.1F, -39.7F, -39.7F, -0.1F, -39.7F, -39.7F, -0.8F, -39.7F, -39.7F); // Import Box10
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(3.55F, -66F, -59.5F, 1, 256, 256, 0F, -0.9F, -59F, -59F, 0F, -59F, -59F, 0F, -59F, -195F, -0.9F, -59F, -195F, -0.9F, -195F, -59F, 0F, -195F, -59F, 0F, -195F, -195F, -0.9F, -195F, -195F); // Import Box11
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3.2F, -47.65F, -39.5F, 1, 80, 80, 0F, -0.9F, -39.7F, -39.7F, -0.2F, -39.7F, -39.7F, -0.2F, -39.7F, -39.7F, -0.9F, -39.7F, -39.7F, -1.2F, -39.7F, -39.7F, 0.1F, -39.7F, -39.7F, 0.1F, -39.7F, -39.7F, -1.2F, -39.7F, -39.7F); // Import Box12
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(3.45F, -46.25F, -42F, 1, 80, 80, 0F, -1.1F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, 0F, -39.7F, -39.7F, -1.1F, -39.7F, -39.7F); // Import Box13
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -7.75F, -4F, 8, 8, 8, 0F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F); // Box 14
		headModel[14].setRotationPoint(0F, 0F, 0F);


	}
}