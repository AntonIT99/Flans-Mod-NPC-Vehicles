//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
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

public class ModelSturmabteilung extends ModelCustomArmour //Same as Filename
{
	int textureX = 4096;
	int textureY = 2048;

	public ModelSturmabteilung() //Same as Filename
	{
		headModel = new ModelRendererTurbo[12];
		headModel[0] = new ModelRendererTurbo(this, 2001, 5, textureX, textureY); // Import 
		headModel[1] = new ModelRendererTurbo(this, 2241, 65, textureX, textureY); // Import 
		headModel[2] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Import 
		headModel[3] = new ModelRendererTurbo(this, 1816, 17, textureX, textureY); // Import 
		headModel[4] = new ModelRendererTurbo(this, 1786, 4, textureX, textureY); // Box 9
		headModel[5] = new ModelRendererTurbo(this, 1783, 28, textureX, textureY); // Box 10
		headModel[6] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 1773, 7, textureX, textureY); // Box 12
		headModel[8] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 13
		headModel[9] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 14
		headModel[10] = new ModelRendererTurbo(this, 88, 56, textureX, textureY); // Box 42
		headModel[11] = new ModelRendererTurbo(this, 1783, 17, textureX, textureY); // Box 43

		headModel[0].addShapeBox(-4F, -6F, -6F, 8, 1, 2, 0F, 0F, -0.6F, 1F, 0.0F, -0.6F, 1F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-11.75F, -8.2F, -4.2F, 800, 800, 1, 0F, -10.5F, 0F, 0F, -787F, 0F, 0F, -787F, 0.0F, 0F, -10.5F, 0.0F, 0F, -10.5F, -799F, 0F, -787F, -799F, 0F, -787F, -799F, 0F, -10.5F, -799F, 0F); // Import 
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8.26F, -0.9F, 1, 3, 5, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Import 
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -6.75F, -4.3F, 30, 30, 1, 0F, -0.3F, -0.3F, 0.0F, -29.3F, -0.3F, 0.0F, -29.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -29.3F, 0.0F, -29.3F, -29.3F, 0.0F, -29.3F, -29.3F, 0.0F, -0.3F, -29.3F, 0.0F); // Import 
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -7.26F, -4.5F, 8, 2, 1, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 9
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -8.26F, 3.5F, 8, 3, 1, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 10
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -7.26F, -4.3F, 1, 2, 4, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4F, -8.26F, -0.9F, 1, 3, 5, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 12
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4F, -7.26F, -4.3F, 1, 2, 4, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 13
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -9F, -4F, 8, 2, 8, 0F, 0.2F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F, 0.2F, 0.5F, 0.1F); // Box 14
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -9.1F, -4F, 16, 1, 16, 0F, 0.1F, -0.4F, 0.1F, -7.9F, -0.4F, 0.1F, -7.9F, -0.4F, -7.9F, 0.1F, -0.4F, -7.9F, 0.1F, -0.4F, 0.1F, -7.9F, -0.4F, 0.1F, -7.9F, -0.4F, -7.9F, 0.1F, -0.4F, -7.9F); // Box 42
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -6.5F, -4.6F, 8, 1, 3, 0F, 0.4F, -0.6F, -0.3F, 0.4F, -0.6F, -0.3F, 0.4F, -0.6F, -0.3F, 0.4F, -0.6F, -0.3F, 0.4F, 0.0F, -0.3F, 0.4F, 0.0F, -0.3F, 0.4F, 0.0F, -0.3F, 0.4F, 0.0F, -0.3F); // Box 43
		headModel[11].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[26];
		bodyModel[0] = new ModelRendererTurbo(this, 2, 81, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 1, 0, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 64, 900, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 41
		bodyModel[4] = new ModelRendererTurbo(this, 60, 63, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 50
		bodyModel[6] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 51
		bodyModel[7] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 52
		bodyModel[8] = new ModelRendererTurbo(this, 58, 56, textureX, textureY); // Box 55
		bodyModel[9] = new ModelRendererTurbo(this, 64, 600, textureX, textureY); // Box 52
		bodyModel[10] = new ModelRendererTurbo(this, 280, 520, textureX, textureY); // Box 53
		bodyModel[11] = new ModelRendererTurbo(this, 280, 520, textureX, textureY); // Box 52
		bodyModel[12] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 59
		bodyModel[13] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 60
		bodyModel[14] = new ModelRendererTurbo(this, 58, 56, textureX, textureY); // Box 62
		bodyModel[15] = new ModelRendererTurbo(this, 60, 63, textureX, textureY); // Box 65
		bodyModel[16] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 66
		bodyModel[17] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 32
		bodyModel[18] = new ModelRendererTurbo(this, 43, 26, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 96, 48, textureX, textureY); // Box 35
		bodyModel[20] = new ModelRendererTurbo(this, 96, 48, textureX, textureY); // Box 36
		bodyModel[21] = new ModelRendererTurbo(this, 96, 48, textureX, textureY); // Box 37
		bodyModel[22] = new ModelRendererTurbo(this, 96, 48, textureX, textureY); // Box 38
		bodyModel[23] = new ModelRendererTurbo(this, 96, 48, textureX, textureY); // Box 39
		bodyModel[24] = new ModelRendererTurbo(this, 96, 48, textureX, textureY); // Box 40
		bodyModel[25] = new ModelRendererTurbo(this, 96, 48, textureX, textureY); // Box 41

		bodyModel[0].addShapeBox(-4.5F, 7.75F, -2.2F, 16, 8, 5, 0F, 0.1F, 0.0F, 0.15F, -6.9F, 0.0F, 0.15F, -6.9F, 0.0F, -0.45F, 0.1F, 0.0F, -0.45F, 0.1F, -6.7F, 0.15F, -6.9F, -6.7F, 0.15F, -6.9F, -6.7F, -0.45F, 0.1F, -6.7F, -0.45F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.5F, 0F, -2F, 16, 33, 4, 0F, 0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Import 
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-0.5F, 0.92F, -2.6F, 480, 240, 6, 0F, -0.5F, 0F, 0F, -478.43F, 1.07F, 0F, -478.43F, 1.07F, -5.5F, -0.5F, 0F, -5.5F, -1.2F, -239.352F, 0F, -477.75F, -240.352F, 0F, -477.75F, -240.352F, -5.5F, -1.2F, -239.352F, -5.5F); // Box 39
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-3.5F, 3.8F, -2.3F, 8, 8, 1, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -5.5F, -6F, 0F, -5.5F, -6F, 0F, 0F, -6F, 0F); // Box 41
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-2.8F, 4.8F, -2.39F, 4, 8, 1, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 53
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2.3F, 0.05F, -1.69F, 8, 7, 4, 0F, 0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 50
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(1.25F, 0.05F, -1.69F, 8, 7, 4, 0F, 0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 51
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-2.1F, 0.05F, 1.5F, 11, 7, 1, 0F, 0.2F, 0.2F, 0.3F, -6.6F, 0.2F, 0.3F, -6.6F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.3F, -6.6F, -6.7F, 0.3F, -6.6F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 52
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3.5F, 3.8F, -2.4F, 8, 4, 1, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 55
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-11.5F, 0.92F, -2.6F, 480, 240, 6, 0F, -10.43F, 1.07F, 0F, -468.5F, 0F, 0F, -468.5F, 0F, -5.5F, -10.43F, 1.07F, -5.5F, -9.75F, -240.352F, 0F, -469.2F, -239.3F, 0F, -469.2F, -239.3F, -5.5F, -9.75F, -240.352F, -5.5F); // Box 52
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.44F, -0.13F, -2.6F, 40, 40, 1, 0F, 0F, 0F, 0F, -38.65F, 0F, 0F, -38.65F, 0F, 0F, 0F, 0F, 0F, -0.5F, -39.5F, 0F, -39.3F, -39.3F, 0F, -39.3F, -39.3F, 0F, -0.5F, -39.5F, 0F); // Box 53
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(1.04F, -0.13F, -2.61F, 40, 40, 1, 0F, -1.35F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, -1.35F, 0F, 0F, -0.7F, -39.3F, 0F, -39.5F, -39.5F, 0F, -39.5F, -39.5F, 0F, -0.7F, -39.3F, 0F); // Box 52
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-2.45F, 4F, -2.85F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.65F, 0F, -0.4F, -29.65F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, 0F, -29.65F, -0.4F); // Box 59
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(2.1F, 4F, -2.85F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.65F, 0F, -0.4F, -29.65F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, 0F, -29.65F, -0.4F); // Box 60
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(1F, 3.8F, -2.4F, 8, 4, 1, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 62
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(1.8F, 4.8F, -2.39F, 4, 8, 1, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 65
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(1F, 3.8F, -2.3F, 8, 8, 1, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -5.5F, -6F, 0F, -5.5F, -6F, 0F, 0F, -6F, 0F); // Box 66
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4.5F, 9F, -2F, 9, 3, 4, 0F, 0F, 0.01F, 0.09F, 0F, 0.01F, 0.09F, 0F, 0.01F, 0.09F, 0F, 0.01F, 0.09F, 0F, 0F, 0.09F, 0F, 0F, 0.09F, 0F, 0F, 0.09F, 0F, 0F, 0.09F); // Box 32
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, -0.15F, -2.5F, 15, 1, 5, 0F, -1F, 0.1F, -0.1F, -7F, -8F, -0.1F, -7.0F, -8F, -0.2F, -1F, 0.1F, -0.2F, 0.0F, -1.1F, -0.1F, -8F, 7F, -0.1F, -8F, 7F, -0.2F, 0.0F, -1.1F, -0.2F); // Box 33
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-1F, 1F, -2.3F, 1, 1, 1, 0F, -0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 35
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1F, 2F, -2.3F, 1, 4, 1, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.1F, 0.5F, 0F); // Box 36
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0F, 2F, -2.3F, 1, 4, 1, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.1F, 0.5F, 0F, -0.1F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 37
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1F, 6.5F, -2.3F, 1, 1, 1, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.1F, -1F, 0F); // Box 38
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0F, 6.5F, -2.3F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, -0.2F, 0F); // Box 39
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 1F, -2.3F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-0.5F, 0.95F, -2.3F, 1, 1, 1, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F); // Box 41
		bodyModel[25].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this, 1220, 70, textureX, textureY); // Import 
		leftArmModel[1] = new ModelRendererTurbo(this, 900, 30, textureX, textureY); // Import 
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		leftArmModel[3] = new ModelRendererTurbo(this, 300, 420, textureX, textureY); // Box 57
		leftArmModel[4] = new ModelRendererTurbo(this, 96, 29, textureX, textureY); // Box 37

		leftArmModel[0].addShapeBox(-1F, 5.8F, -2F, 160, 40, 160, 0F, 0.3F, 0.0F, 0.3F, -155.7F, 0.0F, 0.3F, -155.7F, 0.0F, -155.7F, 0.3F, 0.0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import 
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(0.2F, -2.4F, -0.5F, 80, 1, 40, 0F, 0.4F, 0.0F, 0.15F, -77.9F, 0.0F, 0.15F, -77.9F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import 
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2.2F, -2F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.2F, -7F, 0.15F); // Import 
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.26F, 1.75F, -18.25F, 10, 800, 800, 0F, 0F, 0F, -17.5F, -9F, 0F, -17.5F, -9F, 0F, -781F, 0F, 0F, -781F, 0F, -798.5F, -17.5F, -9F, -798.5F, -17.5F, -9F, -798.5F, -781F, 0F, -798.5F, -781F); // Box 57
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 1.5F, -2F, 8, 9, 4, 0F, 0.25F, 0.0F, 0.2F, -3.75F, 0.0F, 0.2F, -3.75F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, -7F, 0.2F, -3.75F, -7F, 0.2F, -3.75F, -7F, 0.2F, 0.25F, -7F, 0.2F); // Box 37
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		rightArmModel[1] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Import 
		rightArmModel[2] = new ModelRendererTurbo(this, 650, 30, textureX, textureY); // Import 

		rightArmModel[0].addShapeBox(-3F, -2.2F, -2F, 8, 15, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, 0.2F, -7.0F, 0.15F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 5.8F, -2F, 160, 40, 160, 0F, 0.3F, 0F, 0.3F, -155.7F, 0F, 0.3F, -155.7F, 0F, -155.7F, 0.3F, 0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import 
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.2F, -2.4F, -0.5F, 80, 1, 40, 0F, 0.1F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.1F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import 
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[2];
		leftLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 41
		leftLegModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 34

		leftLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 9, 4, 0F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F); // Box 41
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 3, 4, 0F, 0.01F, 0F, 0.09F, 0.5F, 0F, 0.09F, 0.5F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F); // Box 34
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[2];
		rightLegModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 40
		rightLegModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 33

		rightLegModel[0].addShapeBox(-2F, 0F, -2F, 4, 3, 4, 0F, 0.5F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.5F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F); // Box 40
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-2F, 0F, -2F, 4, 9, 4, 0F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F, 0.01F, 0F, 0.09F); // Box 33
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);


	}
}