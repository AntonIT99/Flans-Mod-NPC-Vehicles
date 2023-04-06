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

public class ModelHamasVest extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelHamasVest() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[63];
		bodyModel[0] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import 
		bodyModel[3] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Import 
		bodyModel[4] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Import 
		bodyModel[5] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Import 
		bodyModel[6] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Import 
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Import 
		bodyModel[8] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Import 
		bodyModel[9] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Import 
		bodyModel[14] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Import 
		bodyModel[17] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Import 
		bodyModel[18] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Import 
		bodyModel[19] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Import 
		bodyModel[20] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import 
		bodyModel[21] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import 
		bodyModel[22] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Import 
		bodyModel[23] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import 
		bodyModel[24] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Import 
		bodyModel[25] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Import 
		bodyModel[26] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Import 
		bodyModel[27] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Import 
		bodyModel[28] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Import 
		bodyModel[29] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Import 
		bodyModel[30] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Import 
		bodyModel[31] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Import 
		bodyModel[32] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Import 
		bodyModel[33] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import 
		bodyModel[34] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Import 
		bodyModel[35] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Import 
		bodyModel[36] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Import 
		bodyModel[37] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Import 
		bodyModel[38] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Import 
		bodyModel[39] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Import 
		bodyModel[40] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Import 
		bodyModel[41] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Import 
		bodyModel[42] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Import 
		bodyModel[43] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Import 
		bodyModel[44] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import 
		bodyModel[45] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import 
		bodyModel[46] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Import 
		bodyModel[47] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Import 
		bodyModel[48] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import 
		bodyModel[49] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Import 
		bodyModel[50] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Import 
		bodyModel[51] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Import 
		bodyModel[52] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Import 
		bodyModel[53] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Import 
		bodyModel[54] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import 
		bodyModel[55] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Import 
		bodyModel[56] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Import 
		bodyModel[57] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Import 
		bodyModel[58] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Import 
		bodyModel[59] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Import 
		bodyModel[60] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 
		bodyModel[61] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Import 
		bodyModel[62] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Import 

		bodyModel[0].addShapeBox(-3F, 3.4F, -2.5F, 6, 5, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.55F, 3.4F, -2.4F, 1, 5, 5, 0F, -0.4F, -1.15F, 0.0F, -0.4F, -1.15F, 0.0F, -0.4F, -3.2F, -0.35F, -0.4F, -3.2F, -0.35F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F, -1.0F, -0.35F, -0.4F, -1.0F, -0.35F); // Import 
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(3.55F, 3.4F, -2.4F, 1, 5, 5, 0F, -0.4F, -1.15F, 0.0F, -0.4F, -1.15F, 0.0F, -0.4F, -3.2F, -0.4F, -0.4F, -3.2F, -0.4F, -0.4F, -0.75F, 0.0F, -0.4F, -0.75F, 0.0F, -0.4F, -1.0F, -0.4F, -0.4F, -1.0F, -0.4F); // Import 
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-2.75F, 4.3F, -3.6F, 2, 1, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2.75F, 3.9F, -3.6F, 2, 1, 1, 0F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F); // Import 
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2.2F, 4.5F, -4.15F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Import 
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, -0.1F, -2.5F, 1, 5, 1, 0F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.25F, -0.2F, 0.2F, -0.25F, -0.4F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.25F, -0.4F, 0.0F, -0.25F); // Import 
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, -0.1F, -2.5F, 1, 5, 1, 0F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, -0.2F, 0.2F, -0.05F, 0.0F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F, -0.4F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F); // Import 
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-2.75F, 5.3F, -3.6F, 2, 2, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F); // Import 
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-2.55F, 7.3F, -3.6F, 2, 1, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.4F, 0.0F, 0.0F); // Import 
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-1F, 3.9F, -3.6F, 2, 1, 1, 0F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F); // Import 
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-1F, 4.3F, -3.6F, 2, 1, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-1F, 5.3F, -3.6F, 2, 2, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F); // Import 
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.800000000000001F, 7.3F, -3.6F, 2, 1, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.4F, 0.0F, 0.0F); // Import 
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-0.449999999999999F, 4.5F, -4.15F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Import 
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(0.75F, 3.9F, -3.6F, 2, 1, 1, 0F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F, -0.15F, 0.0F, 0.1F); // Import 
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0.75F, 4.3F, -3.6F, 2, 1, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(0.75F, 5.3F, -3.6F, 2, 2, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F); // Import 
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0.949999999999999F, 7.3F, -3.6F, 2, 1, 2, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -0.4F, 0.0F, 0.0F); // Import 
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1.3F, 4.5F, -4.15F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Import 
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-3F, -0.3F, 1.75F, 7, 7, 1, 0F, -0.2F, 0.0F, -0.3F, -6.2F, 0.0F, -0.3F, -6.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -6.95F, 0.7F, -0.3F, -0.05F, -0.1F, -0.3F, -0.05F, -0.1F, -0.3F, -6.95F, 0.7F, -0.3F); // Import 
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, -0.3F, 1.8F, 7, 7, 1, 0F, -6.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -0.2F, 0.0F, -0.3F, -6.2F, 0.0F, -0.3F, -0.05F, -0.1F, -0.3F, -6.95F, 0.7F, -0.3F, -6.95F, 0.7F, -0.3F, -0.05F, -0.1F, -0.3F); // Import 
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-4.3F, 6F, -3.4F, 2, 1, 2, 0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F); // Import 
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4.3F, 5.1F, -3.4F, 2, 1, 1, 0F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F); // Import 
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.75F, 5.7F, -3.95F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Import 
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2.3F, 6F, -3.4F, 2, 1, 2, 0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F); // Import 
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(2.3F, 5.1F, -3.4F, 2, 1, 1, 0F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F, -0.3F, 0.0F, 0.1F); // Import 
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2.85F, 5.7F, -3.95F, 1, 1, 1, 0F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.3F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F, -0.38F, -0.2F, -0.4F); // Import 
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4F, 3.4F, -2.5F, 1, 5, 1, 0F, 0.0F, -1.15F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F); // Import 
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(3F, 3.4F, -2.5F, 1, 5, 1, 0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -1.15F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-4F, 7F, -2.01F, 8, 4, 4, 0F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F); // Import 
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-4F, 2.8F, -2.01F, 8, 4, 4, 0F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-4F, -0.199999999999999F, -2.01F, 4, 3, 4, 0F, 0.0F, 0.0F, 0.3F, 0.0F, -0.7F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F); // Import 
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(0F, -0.199999999999999F, -2.01F, 4, 3, 4, 0F, 0.0F, -0.7F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, -0.3F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F); // Import 
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.5F, -0.2F, -0.53F, 2, 1, 3, 0F, 0.4F, 0.05F, -0.4F, -0.6F, 0.05F, -0.4F, -0.5F, 0.05F, 0.0F, 0.3F, 0.05F, 0.0F, 0.4F, -0.5F, -0.4F, -0.6F, -0.5F, -0.4F, 0.3F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F); // Import 
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(1.5F, -0.2F, -0.53F, 2, 1, 3, 0F, -0.6F, 0.05F, -0.4F, 0.4F, 0.05F, -0.4F, 0.3F, 0.05F, 0.0F, -0.5F, 0.05F, 0.0F, -0.6F, -0.5F, -0.4F, 0.4F, -0.5F, -0.4F, -0.5F, -0.5F, 0.0F, 0.3F, -0.5F, 0.0F); // Import 
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-3F, 0.3F, 0.47F, 6, 1, 2, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F); // Import 
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2.5F, 4.440892E-16F, 1.37F, 2, 9, 1, 0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(0.5F, 4.440892E-16F, 1.37F, 2, 9, 1, 0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(3F, 7.7F, 1F, 1, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.35F, -0.9F, 0.0F, 0.35F, -0.9F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.3F, 0.0F, 0.35F, -0.9F, 0.0F, 0.35F, -0.9F, 0.4F, 0.0F, -0.3F, 0.4F); // Import 
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3F, 7.7F, 1F, 6, 3, 1, 0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.4F, 0.0F, -0.3F, 0.4F); // Import 
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-4F, 7.7F, 1F, 1, 3, 1, 0F, 0.35F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.35F, -0.9F, 0.4F, 0.35F, -0.9F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.4F, 0.35F, -0.9F, 0.4F); // Import 
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(2.55F, 9F, 2.3F, 1, 1, 1, 0F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F); // Import 
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(2.55F, 7.75F, 2.3F, 1, 1, 1, 0F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F); // Import 
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(2.55F, 7.4F, 2.4F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(1.95F, 9.3F, 2.7F, 1, 1, 1, 0F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F); // Import 
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(-2F, 9.5F, 2.3F, 4, 1, 2, 0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F); // Import 
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(-2F, 7.7F, 2.4F, 4, 1, 2, 0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -0.25F, 0.1F, 0.0F, -0.25F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F, 0.1F, 0.25F, 0.0F); // Import 
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(-2F, 8.7F, 2.4F, 4, 1, 2, 0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, 0.1F, -0.25F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F); // Import 
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(-2F, 10.5F, 2.3F, 4, 1, 2, 0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F); // Import 
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0.5F, 9F, 3.45F, 1, 2, 1, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F); // Import 
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(-1.5F, 9F, 3.45F, 1, 2, 1, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F); // Import 
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(0.5F, 8F, 2.45F, 1, 1, 2, 0F, -0.2F, 0.35F, 0.0F, -0.2F, 0.35F, 0.0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(-1.5F, 8F, 2.45F, 1, 1, 2, 0F, -0.2F, 0.35F, 0.0F, -0.2F, 0.35F, 0.0F, -0.2F, 0.35F, -0.25F, -0.2F, 0.35F, -0.25F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(0.5F, 10.8F, 3.45F, 1, 1, 1, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.55F, 0.0F, -0.2F, -0.55F, 0.0F, -0.2F, -0.55F, -0.3F, -0.2F, -0.55F, -0.3F); // Import 
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(-1.5F, 10.8F, 3.45F, 1, 1, 1, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.55F, 0.0F, -0.2F, -0.55F, 0.0F, -0.2F, -0.55F, -0.3F, -0.2F, -0.55F, -0.3F); // Import 
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(-3.55F, 9F, 2.3F, 1, 1, 1, 0F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F, 0.5F, 0.6F, 0.2F); // Import 
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(-4.15F, 9.3F, 2.7F, 1, 1, 1, 0F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F, -0.15F, -0.05F, -0.15F); // Import 
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(-3.55F, 7.75F, 2.3F, 1, 1, 1, 0F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F, 0.5F, -0.3F, 0.2F); // Import 
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(-3.55F, 7.4F, 2.4F, 1, 1, 1, 0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Import 
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(0F, 8.7F, -2F, 4, 1, 3, 0F, 0.0F, 0.1F, 0.4F, 0.35F, 0.1F, 0.4F, 0.35F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.4F, 0.35F, 0.1F, 0.4F, 0.35F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F); // Import 
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(-4F, 8.7F, -2F, 4, 1, 3, 0F, 0.35F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.0F, 0.35F, 0.1F, 0.0F, 0.35F, 0.1F, 0.4F, 0.0F, 0.1F, 0.4F, 0.0F, 0.1F, 0.0F, 0.35F, 0.1F, 0.0F); // Import 
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(-1F, 8.7F, -2.5F, 2, 1, 1, 0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F); // Import 
		bodyModel[62].setRotationPoint(0F, 0F, 0F);


	}
}