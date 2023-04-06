//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: class
// Model Creator: 
// Created on: 27.05.2020 - 12:42:52
// Last changed on: 27.05.2020 - 12:42:52

package com.flansmod.client.model.NewArmor; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBritishMk1FragVest extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBritishMk1FragVest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[38];
		bodyModel[0] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 77
		bodyModel[2] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 72
		bodyModel[3] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 73
		bodyModel[4] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import 
		bodyModel[5] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Import 
		bodyModel[6] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import 
		bodyModel[7] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Import 
		bodyModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import 
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import 
		bodyModel[14] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Import 
		bodyModel[18] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 121, 57, textureX, textureY); // Import 
		bodyModel[22] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Import 
		bodyModel[24] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Import 
		bodyModel[26] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import 
		bodyModel[27] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import 
		bodyModel[28] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Import 
		bodyModel[29] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Import 
		bodyModel[30] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import 
		bodyModel[31] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Import 
		bodyModel[32] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import 
		bodyModel[33] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import 
		bodyModel[34] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import 
		bodyModel[35] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import 
		bodyModel[36] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import 
		bodyModel[37] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import 

		bodyModel[0].addShapeBox(-3.9F, 2.5F, -2.83F, 3, 1, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.9F, 2.5F, -2.8F, 3, 3, 1, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 77
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(1.1F, 2.5F, -2.83F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(1.1F, 2.5F, -2.8F, 3, 3, 1, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 1.25F, -2.6F, 1, 6, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, -0.25F, 0.0F); // Import 
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 1.1F, -2.75F, 8, 4, 1, 0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.3F, 0.0F, -0.35F, 0.3F, 0.0F, -0.35F, 0.3F, 0.0F, -0.35F, 0.3F, 0.0F, -0.35F); // Import 
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 5.1F, -2.5F, 8, 3, 5, 0F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, -0.1F, 0.3F, 0.0F, -0.1F); // Import 
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 1.1F, 1.75F, 8, 4, 1, 0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.3F, 0.0F, -0.35F, 0.3F, 0.0F, -0.35F, 0.3F, 0.0F, -0.35F, 0.3F, 0.0F, -0.35F); // Import 
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-1.5F, -1.2F, -2.5F, 1, 2, 5, 0F, 0.5F, -1.0F, -0.2F, -0.75F, -0.75F, 0.0F, 0.5F, -0.75F, 0.0F, 0.5F, -1.0F, -0.2F, -0.25F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F, -0.25F, 0.3F, -0.1F); // Import 
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0.499999999999998F, -1.2F, -2.5F, 1, 2, 5, 0F, -0.75F, -0.75F, 0.0F, 0.5F, -1.0F, -0.2F, 0.5F, -1.0F, -0.2F, 0.5F, -0.75F, 0.0F, 0.5F, 0.3F, -0.1F, -0.25F, 0.3F, -0.1F, -0.25F, 0.3F, -0.1F, 0.5F, 0.3F, -0.1F); // Import 
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, -0.199999999999999F, -2.5F, 4, 1, 5, 0F, 0.05F, 0.0F, -0.2F, -2.0F, 0.0F, -0.2F, -2.0F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.0F, 0.3F, -0.1F, -1.25F, 0.3F, -0.1F, -1.25F, 0.3F, -0.1F, 0.0F, 0.3F, -0.1F); // Import 
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, -0.199999999999999F, -2.5F, 4, 1, 5, 0F, -2.0F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, 0.05F, 0.0F, -0.2F, -2.0F, 0.0F, -0.2F, -1.25F, 0.3F, -0.1F, 0.0F, 0.3F, -0.1F, 0.0F, 0.3F, -0.1F, -1.25F, 0.3F, -0.1F); // Import 
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 8.5F, -2.4F, 1, 1, 1, 0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F); // Import 
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 8.5F, -2.4F, 1, 1, 1, 0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F, -0.2F, 0.31F, 0.0F); // Import 
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-0.5F, 8.5F, -2.85F, 1, 1, 1, 0F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F); // Import 
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 8.5F, -2.5F, 4, 1, 5, 0F, 0.2F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F); // Import 
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0.199999999999998F, 8.5F, -2.5F, 4, 1, 5, 0F, 0.2F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.2F, 0.3F, -0.2F); // Import 
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.8F, 8.4F, -3.25F, 2, 4, 1, 0F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F); // Import 
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1.8F, 8.3F, -3.35F, 2, 2, 2, 0F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, -0.6F, 0.2F, 0.3F, -0.6F, 0.2F, 0.3F, -1.2F, 0.2F, 0.3F, -1.2F, 0.2F); // Import 
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(2.3F, 8.5F, -3.6F, 1, 3, 1, 0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F); // Import 
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2.3F, 9.9F, -3.65F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import 
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(1.8F, 8.4F, -3.25F, 2, 4, 1, 0F, 0.1F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F); // Import 
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2.3F, 8.3F, -3.62F, 1, 1, 1, 0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F); // Import 
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(2.3F, 9.9F, -3.67F, 1, 1, 1, 0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F); // Import 
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.799999999999999F, 8.5F, 2F, 3, 3, 2, 0F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F, 0.0F, 0.05F, 0.2F, 0.0F); // Import 
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.799999999999999F, 8.1F, 2F, 3, 1, 2, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.3F, 0.1F, 0.1F, 0.3F, 0.1F); // Import 
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(1.8F, 8.2F, 3.15F, 1, 2, 1, 0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F); // Import 
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(0.799999999999999F, 8.5F, 2.05F, 3, 3, 2, 0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F); // Import 
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1.8F, 9.3F, 3.19F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import 
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(1.8F, 9.3F, 3.22F, 1, 1, 1, 0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F); // Import 
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1.8F, 8F, 3.19F, 1, 1, 1, 0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F); // Import 
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3.7F, 8.4F, -3.25F, 2, 4, 1, 0F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F, 0.25F, -0.1F, 0.2F); // Import 
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-3.7F, 8.3F, -3.35F, 2, 2, 2, 0F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, -0.6F, 0.2F, 0.3F, -0.6F, 0.2F, 0.3F, -1.2F, 0.2F, 0.3F, -1.2F, 0.2F); // Import 
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3.2F, 8.5F, -3.6F, 1, 3, 1, 0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F); // Import 
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.2F, 9.9F, -3.65F, 1, 1, 1, 0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F); // Import 
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.7F, 8.4F, -3.25F, 2, 4, 1, 0F, 0.1F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F, 0.0F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F, 0.1F, -0.25F, 0.25F); // Import 
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3.2F, 8.3F, -3.62F, 1, 1, 1, 0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F, -0.27F, -0.15F, 0.0F); // Import 
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3.2F, 9.9F, -3.67F, 1, 1, 1, 0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F, -0.32F, -0.32F, 0.0F); // Import 
		bodyModel[37].setRotationPoint(0F, 0F, 0F);


	}
}