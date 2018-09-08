//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GermanAssaultChest
// Model Creator: 
// Created on: 28.02.2016 - 16:11:42
// Last changed on: 28.02.2016 - 16:11:42

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGermanFeldbluseCamo extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 256;

	public ModelGermanFeldbluseCamo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[46];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import 
		bodyModel[3] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import 
		bodyModel[4] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Import 
		bodyModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import 
		bodyModel[6] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Import 
		bodyModel[7] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Import 
		bodyModel[8] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Import 
		bodyModel[9] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Import 
		bodyModel[10] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import 
		bodyModel[11] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import 
		bodyModel[12] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import 
		bodyModel[13] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import 
		bodyModel[14] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Import 
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[16] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 36
		bodyModel[17] = new ModelRendererTurbo(this, 12, 73, textureX, textureY); // Box 37
		bodyModel[18] = new ModelRendererTurbo(this, 12, 73, textureX, textureY); // Box 30
		bodyModel[19] = new ModelRendererTurbo(this, 12, 73, textureX, textureY); // Box 31
		bodyModel[20] = new ModelRendererTurbo(this, 12, 73, textureX, textureY); // Box 32
		bodyModel[21] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 80, 88, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 111, 2, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 111, 2, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 105, 10, textureX, textureY); // Box 42
		bodyModel[28] = new ModelRendererTurbo(this, 105, 10, textureX, textureY); // Box 43
		bodyModel[29] = new ModelRendererTurbo(this, 120, 3, textureX, textureY); // Box 44
		bodyModel[30] = new ModelRendererTurbo(this, 120, 3, textureX, textureY); // Box 45
		bodyModel[31] = new ModelRendererTurbo(this, 117, 10, textureX, textureY); // Box 46
		bodyModel[32] = new ModelRendererTurbo(this, 117, 10, textureX, textureY); // Box 48
		bodyModel[33] = new ModelRendererTurbo(this, 90, 1, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 51
		bodyModel[35] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Box 52
		bodyModel[36] = new ModelRendererTurbo(this, 90, 1, textureX, textureY); // Box 53
		bodyModel[37] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 80, 105, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 96, 3, textureX, textureY); // Box 52
		bodyModel[43] = new ModelRendererTurbo(this, 96, 3, textureX, textureY); // Box 53
		bodyModel[44] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 64
		bodyModel[45] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 65

		bodyModel[0].addShapeBox(-4.5F, 7.3F, -2.2F, 16, 8, 5, 0F, 0.1F, 0.0F, 0.1F, -6.9F, 0.0F, 0.1F, -6.9F, 0.0F, -0.51F, 0.1F, 0.0F, -0.5F, 0.1F, -6.7F, 0.1F, -6.9F, -6.7F, 0.1F, -6.9F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3.3F, 1.3F, -2.4F, 8, 13, 1, 0F, 0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import 
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-3.3F, 0.3F, -2.4F, 8, 8, 1, 0F, 0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import 
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(2.3F, 0.3F, -2.4F, 8, 8, 1, 0F, 0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import 
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(2.3F, 1.3F, -2.4F, 8, 13, 1, 0F, 0.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, 0.0F, -6.7F, 0.1F); // Import 
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2.5F, 6.5F, -2.6F, 4, 4, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import 
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3.3F, 0F, -2.2F, 8, 7, 5, 0F, 0.0F, 0.2F, 0.3F, -7.0F, 0.2F, 0.3F, -7.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F, 0.0F, -6.7F, 0.3F, -7.0F, -6.7F, 0.3F, -7.0F, -6.7F, -0.6F, 0.0F, -6.7F, -0.6F); // Import 
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2.3F, 0F, -2.2F, 8, 7, 5, 0F, 0.0F, 0.2F, 0.3F, -7.0F, 0.2F, 0.3F, -7.0F, 0.2F, -0.6F, 0.0F, 0.2F, -0.6F, 0.0F, -6.7F, 0.3F, -7.0F, -6.7F, 0.3F, -7.0F, -6.7F, -0.6F, 0.0F, -6.7F, -0.6F); // Import 
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.3F, 0.4F, 1.8F, 8, 10, 1, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, -0.6F, 0.0F, 0.1F, -0.6F, -3.0F, -6.0F, 0.1F, -5.0F, -7.7F, 0.1F, -5.0F, -7.7F, -0.6F, -3.0F, -6.0F, -0.6F); // Import 
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4.7F, 0.4F, 1.8F, 8, 10, 1, 0F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, -0.6F, -7.0F, 0.1F, -0.6F, -5.0F, -7.7F, 0.1F, -3.0F, -6.0F, 0.1F, -3.0F, -6.0F, -0.6F, -5.0F, -7.7F, -0.6F); // Import 
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-0.5F, 2.7F, 1.8F, 8, 12, 1, 0F, 0.1F, 0.0F, 0.1F, -7.0F, 0.0F, 0.1F, -7.0F, 0.0F, -0.51F, 0.1F, 0.0F, -0.5F, 0.1F, -6.7F, 0.1F, -7.0F, -6.7F, 0.1F, -7.0F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Import 
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F, 0.0F, 0.4F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, 0.4F, 0.2F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Import 
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.6F, 6.5F, -2.6F, 4, 4, 1, 0F, 0.0F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, -2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2F, -1.0F, 0.0F, -2F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import 
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.6F, 6.5F, -2.6F, 4, 4, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import 
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(2.7F, 6.5F, -2.6F, 4, 4, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Import 
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4.5F, 0F, -2F, 16, 18, 4, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -6.0F, 0.1F, -7.0F, -6.0F, 0.1F, -7.0F, -6.0F, 0.1F, 0.0F, -6.0F, 0.1F); // Import 
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(0.6F, 6.5F, -2.8F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Box 36
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.1F, 7.5F, -2.8F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Box 37
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(3.2F, 7.5F, -2.8F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Box 30
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2F, 7.5F, -2.8F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Box 31
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4.1F, 7.5F, -2.8F, 3, 3, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Box 32
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-2.5F, 6.5F, -2.8F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Box 33
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2.7F, 6.5F, -2.8F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Box 35
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-4.6F, 6.5F, -2.8F, 4, 2, 1, 0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F); // Box 36
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-0.5F, 0.92F, -2.6F, 12, 6, 6, 0F, -0.5F, 0F, 0F, -10.43F, 1.07F, 0F, -10.43F, 1.07F, -5.5F, -0.5F, 0F, -5.5F, -1.2F, -5.3F, 0F, -9.75F, -6.352F, 0F, -9.75F, -6.352F, -5.5F, -1.2F, -5.3F, -5.5F); // Box 39
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1F, 3.8F, -2.3F, 2, 2, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3.5F, 3.8F, -2.3F, 2, 2, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(1F, 8.8F, -2.3F, 2, 3, 1, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4F, 8.8F, -2.3F, 2, 3, 1, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-4F, 8.8F, -2.4F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1F, 8.8F, -2.4F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-3F, 9.8F, -2.39F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(2F, 9.8F, -2.39F, 1, 2, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(1.8F, 4.8F, -2.39F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1F, 3.8F, -2.4F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 51
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-3.5F, 1.6F, -2.2F, 20, 20, 10, 0F, 0F, -0.25F, 0F, -17.5F, -0.25F, 0F, -17.5F, -0.25F, -9F, 0F, -0.25F, -9F, 0F, -18.5F, 0F, -17.5F, -18.5F, 0F, -17.5F, -18.5F, -9F, 0F, -18.5F, -9F); // Box 52
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-2.8F, 4.8F, -2.39F, 1, 1, 1, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-2.3F, 0.05F, -1.69F, 8, 7, 4, 0F, 0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 50
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(1.25F, 0.05F, -1.69F, 8, 7, 4, 0F, 0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 51
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-2.1F, 0.05F, 1.5F, 11, 7, 1, 0F, 0.2F, 0.2F, 0.3F, -6.6F, 0.2F, 0.3F, -6.6F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.3F, -6.6F, -6.7F, 0.3F, -6.6F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 52
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-3.5F, 3.8F, -2.4F, 2, 1, 1, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 55
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-11.5F, 0.92F, -2.6F, 12, 6, 6, 0F, -10.43F, 1.07F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -5.5F, -10.43F, 1.07F, -5.5F, -9.75F, -6.352F, 0F, -1.2F, -5.3F, 0F, -1.2F, -5.3F, -5.5F, -9.75F, -6.352F, -5.5F); // Box 52
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(1.04F, -0.13F, -2.61F, 1, 1, 1, 0F, -1.35F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.35F, 0F, 0F, -0.7F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.7F, -0.3F, 0F); // Box 52
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-2.44F, -0.13F, -2.6F, 1, 1, 1, 0F, 0F, 0F, 0F, 0.35F, 0F, 0F, 0.35F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.5F, 0F); // Box 53
		bodyModel[43].setRotationPoint(0F, 0F, 0F); 
		
		bodyModel[44].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F, 0.75F, -1.6F, -0.8F, -0.75F, -2.8F, -0.8F, -0.75F, -2.8F, -0.8F, 0.75F, -1.6F, -0.8F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Box 64
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F, 0.0F, 0.4F, 0.2F, 0.0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0.0F, 0.4F, 0.2F, -0.25F, -3.2F, -0.8F, 0.25F, -1.8F, -0.8F, 0.25F, -1.8F, -0.8F, -0.25F, -3.2F, -0.8F); // Box 65
		bodyModel[45].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Import 
		leftArmModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import 
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		leftArmModel[3] = new ModelRendererTurbo(this, 1, 151, textureX, textureY); // Box 57
		leftArmModel[4] = new ModelRendererTurbo(this, 68, 150, textureX, textureY); // Box 52

		leftArmModel[0].addShapeBox(-1F, 5.8F, -2F, 4, 1, 4, 0F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F); // Import 
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(0.2F, -2.4F, -0.5F, 2, 1, 1, 0F, 0.4F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F); // Import 
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2.2F, -2F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.2F, -7F, 0.15F); // Import 
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.3F, 1.5F, -18.25F, 10, 20, 19, 0F, 0F, -0.25F, -17.5F, -9F, -0.25F, -17.5F, -9F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -18.5F, -17.5F, -9F, -18.5F, -17.5F, -9F, -18.5F, 0F, 0F, -18.5F, 0F); // Box 57
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-6.7F, -0.4F, -18.75F, 10, 20, 20, 0F, -9F, -0.25F, -17.5F, 0F, -0.25F, -17.5F, 0F, -0.25F, 0F, -9F, -0.25F, 0F, -9F, -18.5F, -17.5F, 0F, -18.5F, -17.5F, 0F, -18.5F, 0F, -9F, -18.5F, 0F); // Box 52
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		rightArmModel[1] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Import 
		rightArmModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import 

		rightArmModel[0].addShapeBox(-3F, -2.2F, -2F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, 0.2F, -7.0F, 0.15F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5.8F, -2F, 4, 1, 4, 0F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F); // Import 
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.2F, -2.4F, -0.5F, 2, 1, 1, 0F, 0.1F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.1F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F, 0.4F, 0.0F, 0.15F); // Import 
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


	}
}