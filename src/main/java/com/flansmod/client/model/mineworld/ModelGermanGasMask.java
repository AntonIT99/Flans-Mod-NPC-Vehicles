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

public class ModelGermanGasMask extends ModelCustomArmour //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelGermanGasMask() //Same as Filename
	{
		headModel = new ModelRendererTurbo[30];
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
		headModel[14] = new ModelRendererTurbo(this, 0, 65, textureX, textureY); // Box 14
		headModel[15] = new ModelRendererTurbo(this, 1, 42, textureX, textureY); // Box 15
		headModel[16] = new ModelRendererTurbo(this, 1, 55, textureX, textureY); // Box 16
		headModel[17] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 17
		headModel[18] = new ModelRendererTurbo(this, 14, 82, textureX, textureY); // Box 19
		headModel[19] = new ModelRendererTurbo(this, 2, 86, textureX, textureY); // Box 20
		headModel[20] = new ModelRendererTurbo(this, 14, 86, textureX, textureY); // Box 21
		headModel[21] = new ModelRendererTurbo(this, 2, 89, textureX, textureY); // Box 22
		headModel[22] = new ModelRendererTurbo(this, 2, 92, textureX, textureY); // Box 23
		headModel[23] = new ModelRendererTurbo(this, 14, 90, textureX, textureY); // Box 24
		headModel[24] = new ModelRendererTurbo(this, 14, 94, textureX, textureY); // Box 25
		headModel[25] = new ModelRendererTurbo(this, 2, 95, textureX, textureY); // Box 26
		headModel[26] = new ModelRendererTurbo(this, 1, 60, textureX, textureY); // Box 28
		headModel[27] = new ModelRendererTurbo(this, 30, 58, textureX, textureY); // Box 29
		headModel[28] = new ModelRendererTurbo(this, 25, 58, textureX, textureY); // Box 30
		headModel[29] = new ModelRendererTurbo(this, 20, 58, textureX, textureY); // Box 31

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

		headModel[5].addShapeBox(1.5F, -4F, -4.5F, 1, 4, 4, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0F, -2.5F, 0F, 0F, -2.5F); // Import Box18
		headModel[5].setRotationPoint(2F, 0F, 0F);

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

		headModel[14].addShapeBox(-4F, -7.8F, -4F, 8, 8, 8, 0F, 0.01F, 0.01F, -0.01F, 0.01F, 0.01F, -0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, -0.19F, -0.01F, 0.01F, -0.19F, -0.01F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F); // Box 14
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -3F, -7F, 8, 3, 3, 0F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -1F, -3F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 15
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1F, 0F, -6F, 2, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 16
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-1.5F, 1F, -6F, 3, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 17
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -3.9F, -4.6F, 1, 2, 1, 0F, -0.59F, 0.01F, -0.49F, 0.01F, 0.01F, -0.49F, 0.01F, 0.01F, -0.29F, -0.59F, 0.01F, -0.29F, -0.59F, -0.79F, -0.49F, 0.01F, -0.79F, -0.49F, 0.01F, -0.79F, -0.29F, -0.59F, -0.79F, -0.29F); // Box 19
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-2F, -2.5F, -4.6F, 4, 1, 1, 0F, 1.41F, 0.21F, -0.49F, -2.59F, 0.21F, -0.49F, -2.59F, 0.21F, -0.29F, 1.41F, 0.21F, -0.29F, 1.41F, -0.79F, -0.49F, -2.59F, -0.79F, -0.49F, -2.59F, -0.79F, -0.29F, 1.41F, -0.79F, -0.29F); // Box 20
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1.6F, -3.9F, -4.6F, 1, 2, 1, 0F, -0.59F, 0.01F, -0.49F, 0.01F, 0.01F, -0.49F, 0.01F, 0.01F, -0.29F, -0.59F, 0.01F, -0.29F, -0.59F, -0.79F, -0.49F, 0.01F, -0.79F, -0.49F, 0.01F, -0.79F, -0.29F, -0.59F, -0.79F, -0.29F); // Box 21
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-2F, -4F, -4.6F, 4, 1, 1, 0F, 1.41F, 0.21F, -0.49F, -2.59F, 0.21F, -0.49F, -2.59F, 0.21F, -0.29F, 1.41F, 0.21F, -0.29F, 1.41F, -0.79F, -0.49F, -2.59F, -0.79F, -0.49F, -2.59F, -0.79F, -0.29F, 1.41F, -0.79F, -0.29F); // Box 22
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(2F, -2.5F, -4.6F, 4, 1, 1, 0F, 1.41F, 0.21F, -0.49F, -2.59F, 0.21F, -0.49F, -2.59F, 0.21F, -0.29F, 1.41F, 0.21F, -0.29F, 1.41F, -0.79F, -0.49F, -2.59F, -0.79F, -0.49F, -2.59F, -0.79F, -0.29F, 1.41F, -0.79F, -0.29F); // Box 23
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(0F, -3.9F, -4.6F, 1, 2, 1, 0F, -0.59F, 0.01F, -0.49F, 0.01F, 0.01F, -0.49F, 0.01F, 0.01F, -0.29F, -0.59F, 0.01F, -0.29F, -0.59F, -0.79F, -0.49F, 0.01F, -0.79F, -0.49F, 0.01F, -0.79F, -0.29F, -0.59F, -0.79F, -0.29F); // Box 24
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(2.4F, -3.9F, -4.6F, 1, 2, 1, 0F, -0.59F, 0.01F, -0.49F, 0.01F, 0.01F, -0.49F, 0.01F, 0.01F, -0.29F, -0.59F, 0.01F, -0.29F, -0.59F, -0.79F, -0.49F, 0.01F, -0.79F, -0.49F, 0.01F, -0.79F, -0.29F, -0.59F, -0.79F, -0.29F); // Box 25
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(2F, -4F, -4.6F, 4, 1, 1, 0F, 1.41F, 0.21F, -0.49F, -2.59F, 0.21F, -0.49F, -2.59F, 0.21F, -0.29F, 1.41F, 0.21F, -0.29F, 1.41F, -0.79F, -0.49F, -2.59F, -0.79F, -0.49F, -2.59F, -0.79F, -0.29F, 1.41F, -0.79F, -0.29F); // Box 26
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-4F, -2.8F, -5F, 8, 3, 1, 0F, 0.01F, -0.49F, -0.99F, 0.01F, -0.49F, -0.99F, 0.01F, -0.49F, 0.01F, 0.01F, -0.49F, 0.01F, 0.01F, -0.19F, -0.99F, 0.01F, -0.19F, -0.99F, 0.01F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F); // Box 28
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-4F, -4.8F, -5F, 1, 5, 1, 0F, 0.01F, 0.01F, -0.99F, -0.09F, 0.01F, -0.99F, -0.09F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, -0.19F, -0.99F, -0.09F, -0.19F, -0.99F, -0.09F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F); // Box 29
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(3.1F, -4.8F, -5F, 1, 5, 1, 0F, 0.01F, 0.01F, -0.99F, -0.09F, 0.01F, -0.99F, -0.09F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, -0.19F, -0.99F, -0.09F, -0.19F, -0.99F, -0.09F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F); // Box 30
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-0.8F, -4.8F, -5F, 1, 5, 1, 0F, 0.01F, 0.01F, -0.99F, 0.51F, 0.01F, -0.99F, 0.51F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, 0.01F, -0.19F, -0.99F, 0.51F, -0.19F, -0.99F, 0.51F, -0.19F, 0.01F, 0.01F, -0.19F, 0.01F); // Box 31
		headModel[29].setRotationPoint(0F, 0F, 0F);


	}
}