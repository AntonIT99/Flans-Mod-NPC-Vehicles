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

public class ModelGermanFeldbluseSummer extends ModelCustomArmour //Same as Filename
{
	int textureX = 4096;
	int textureY = 2048;

	public ModelGermanFeldbluseSummer() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[43];
		bodyModel[0] = new ModelRendererTurbo(this, 2, 81, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Import 
		bodyModel[2] = new ModelRendererTurbo(this, 24, 200, textureX, textureY); // Import 
		bodyModel[3] = new ModelRendererTurbo(this, 1, 0, textureX, textureY); // Import 
		bodyModel[4] = new ModelRendererTurbo(this, 64, 900, textureX, textureY); // Box 39
		bodyModel[5] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 41
		bodyModel[6] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 58, 56, textureX, textureY); // Box 44
		bodyModel[8] = new ModelRendererTurbo(this, 60, 63, textureX, textureY); // Box 46
		bodyModel[9] = new ModelRendererTurbo(this, 1240, 350, textureX, textureY); // Box 52
		bodyModel[10] = new ModelRendererTurbo(this, 60, 63, textureX, textureY); // Box 53
		bodyModel[11] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 50
		bodyModel[12] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 51
		bodyModel[13] = new ModelRendererTurbo(this, 25, 67, textureX, textureY); // Box 52
		bodyModel[14] = new ModelRendererTurbo(this, 58, 56, textureX, textureY); // Box 55
		bodyModel[15] = new ModelRendererTurbo(this, 64, 600, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 280, 520, textureX, textureY); // Box 53
		bodyModel[17] = new ModelRendererTurbo(this, 280, 520, textureX, textureY); // Box 52
		bodyModel[18] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 52
		bodyModel[19] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 53
		bodyModel[20] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 54
		bodyModel[21] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 55
		bodyModel[22] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 56
		bodyModel[23] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 57
		bodyModel[24] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 58
		bodyModel[25] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 59
		bodyModel[26] = new ModelRendererTurbo(this, 135, 0, textureX, textureY); // Box 60
		bodyModel[27] = new ModelRendererTurbo(this, 75, 24, textureX, textureY); // Box 61
		bodyModel[28] = new ModelRendererTurbo(this, 58, 56, textureX, textureY); // Box 62
		bodyModel[29] = new ModelRendererTurbo(this, 60, 63, textureX, textureY); // Box 65
		bodyModel[30] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 66
		bodyModel[31] = new ModelRendererTurbo(this, 58, 56, textureX, textureY); // Box 67
		bodyModel[32] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 68
		bodyModel[33] = new ModelRendererTurbo(this, 60, 63, textureX, textureY); // Box 69
		bodyModel[34] = new ModelRendererTurbo(this, 24, 200, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 15, 200, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 15, 200, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 15, 200, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 15, 200, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 15, 200, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 15, 200, textureX, textureY); // Box 48
		bodyModel[41] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 64
		bodyModel[42] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 65

		bodyModel[0].addShapeBox(-4.5F, 7.3F, -2.2F, 16, 8, 5, 0F, 0.1F, 0.0F, 0.1F, -6.9F, 0.0F, 0.1F, -6.9F, 0.0F, -0.51F, 0.1F, 0.0F, -0.5F, 0.1F, -6.7F, 0.1F, -6.9F, -6.7F, 0.1F, -6.9F, -6.7F, -0.5F, 0.1F, -6.7F, -0.5F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F, 0.0F, 0.4F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, -0.8F, 0.2F, 0.0F, 0.4F, 0.2F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Import 
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4.3F, 6.5F, -3F, 20, 20, 4, 0F, 0.0F, 0.0F, 0F, -17F, 0.0F, 0F, -17F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, -16F, 0F, -17F, -16F, 0F, -17F, -16F, -3F, 0.0F, -16F, -3F); // Import 
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.5F, 0F, -2F, 16, 36, 4, 0F, 0.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, -7.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, -7.0F, -24F, 0.1F, 0.0F, -24F, 0.1F); // Import 
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-0.5F, 0.92F, -2.6F, 480, 240, 6, 0F, -0.5F, 0F, 0F, -478.43F, 1.07F, 0F, -478.43F, 1.07F, -5.5F, -0.5F, 0F, -5.5F, -1.2F, -239.352F, 0F, -477.75F, -240.352F, 0F, -477.75F, -240.352F, -5.5F, -1.2F, -239.352F, -5.5F); // Box 39
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-3.5F, 3.8F, -2.3F, 8, 8, 1, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -5.5F, -6F, 0F, -5.5F, -6F, 0F, 0F, -6F, 0F); // Box 41
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 8.8F, -2.3F, 8, 8, 1, 0F, 0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F, 0F); // Box 43
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 8.8F, -2.4F, 8, 4, 1, 0F, 0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -3F, 0F); // Box 44
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-3F, 9.8F, -2.39F, 4, 8, 1, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F); // Box 46
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-3.5F, 1.6F, -2.2F, 800, 800, 10, 0F, 0F, -0.25F, 0F, -797.5F, -0.25F, 0F, -797.5F, -0.25F, -9F, 0F, -0.25F, -9F, 0F, -798.5F, 0F, -797.5F, -798.5F, 0F, -797.5F, -798.5F, -9F, 0F, -798.5F, -9F); // Box 52
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-2.8F, 4.8F, -2.39F, 4, 8, 1, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 53
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-2.3F, 0.05F, -1.69F, 8, 7, 4, 0F, 0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 50
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(1.25F, 0.05F, -1.69F, 8, 7, 4, 0F, 0.2F, 0.2F, 0.4F, -6.75F, 0.2F, 0.4F, -6.75F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.4F, -6.75F, -6.7F, 0.4F, -6.75F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 51
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-2.1F, 0.05F, 1.5F, 11, 7, 1, 0F, 0.2F, 0.2F, 0.3F, -6.6F, 0.2F, 0.3F, -6.6F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, -6.7F, 0.3F, -6.6F, -6.7F, 0.3F, -6.6F, -6.7F, -0.3F, 0.2F, -6.7F, -0.3F); // Box 52
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3.5F, 3.8F, -2.4F, 8, 4, 1, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 55
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-11.5F, 0.92F, -2.6F, 480, 240, 6, 0F, -10.43F, 1.07F, 0F, -468.5F, 0F, 0F, -468.5F, 0F, -5.5F, -10.43F, 1.07F, -5.5F, -9.75F, -240.352F, 0F, -469.2F, -239.3F, 0F, -469.2F, -239.3F, -5.5F, -9.75F, -240.352F, -5.5F); // Box 52
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2.44F, -0.13F, -2.6F, 40, 40, 1, 0F, 0F, 0F, 0F, -38.65F, 0F, 0F, -38.65F, 0F, 0F, 0F, 0F, 0F, -0.5F, -39.5F, 0F, -39.3F, -39.3F, 0F, -39.3F, -39.3F, 0F, -0.5F, -39.5F, 0F); // Box 53
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1.04F, -0.13F, -2.61F, 40, 40, 1, 0F, -1.35F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, 0F, -1.35F, 0F, 0F, -0.7F, -39.3F, 0F, -39.5F, -39.5F, 0F, -39.5F, -39.5F, 0F, -0.7F, -39.3F, 0F); // Box 52
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-0.2F, 3.5F, -2.55F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Box 52
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-0.2F, 1.5F, -2.55F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Box 53
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-0.2F, 5.5F, -2.55F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Box 54
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-0.2F, 9F, -2.55F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Box 55
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-0.2F, 11F, -2.55F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Box 56
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.8F, 9.3F, -2.85F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Box 57
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(2.2F, 9.3F, -2.85F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.5F, 0F, -0.4F, -29.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, -29.5F, -29.5F, -0.4F, 0F, -29.5F, -0.4F); // Box 58
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-2.45F, 4F, -2.85F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.65F, 0F, -0.4F, -29.65F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, 0F, -29.65F, -0.4F); // Box 59
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(2.1F, 4F, -2.85F, 30, 30, 1, 0F, 0F, 0F, -0.4F, -29.65F, 0F, -0.4F, -29.65F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, -29.65F, -29.65F, -0.4F, 0F, -29.65F, -0.4F); // Box 60
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-0.75F, 4.2F, -2.51F, 6, 6, 1, 0F, -0.3F, -0.1F, -0.4F, -5.45F, 0.3F, -0.4F, -5.45F, 0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -5.3F, -0.4F, -5F, -6.3F, -0.4F, -5F, -6.3F, -0.4F, -0.3F, -5.3F, -0.4F); // Box 61
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1F, 3.8F, -2.4F, 8, 4, 1, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, -5.5F, -3.5F, 0F, -5.5F, -3.5F, 0F, 0F, -3.5F, 0F); // Box 62
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(1.8F, 4.8F, -2.39F, 4, 8, 1, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -7F, 0F, -3F, -7F, 0F, -3F, -7F, 0F, 0F, -7F, 0F); // Box 65
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1F, 3.8F, -2.3F, 8, 8, 1, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -5.5F, -6F, 0F, -5.5F, -6F, 0F, 0F, -6F, 0F); // Box 66
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(1F, 8.8F, -2.4F, 8, 4, 1, 0F, 0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, -3F, 0F, 0F, -3F, 0F); // Box 67
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(1F, 8.8F, -2.3F, 8, 8, 1, 0F, 0F, 0.5F, 0F, -5F, 0.5F, 0F, -5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, -5F, 0F); // Box 68
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2F, 9.8F, -2.39F, 4, 8, 1, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, 0F, -3F, -6F, 0F, -3F, -6F, 0F, 0F, -6F, 0F); // Box 69
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(1.3F, 6.5F, -3F, 20, 20, 4, 0F, 0.0F, 0.0F, 0F, -17F, 0.0F, 0F, -17F, 0.0F, -3F, 0.0F, 0.0F, -3F, 0.0F, -16F, 0F, -17F, -16F, 0F, -17F, -16F, -3F, 0.0F, -16F, -3F); // Box 42
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-5.4F, 6.5F, -3.4F, 3, 3, 1, 0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F); // Box 43
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4.3F, 6.5F, -3.4F, 3, 3, 1, 0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F); // Box 44
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-3.2F, 6.5F, -3.4F, 3, 3, 1, 0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F); // Box 45
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(0.2F, 6.5F, -3.4F, 3, 3, 1, 0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F); // Box 46
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(1.3F, 6.5F, -3.4F, 3, 3, 1, 0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F); // Box 47
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(2.4F, 6.5F, -3.4F, 3, 3, 1, 0F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F); // Box 48
		bodyModel[40].setRotationPoint(0F, 0F, 0F);
		
		bodyModel[41].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F, 0.75F, -1.6F, -0.8F, -0.75F, -2.8F, -0.8F, -0.75F, -2.8F, -0.8F, 0.75F, -1.6F, -0.8F, 0.5F, -1.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.5F, -1.2F, 0.2F); // Box 64
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-3F, 7F, 2.5F, 6, 2, 2, 0F, 0.0F, 0.4F, 0.2F, 0.0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0.0F, 0.4F, 0.2F, -0.25F, -3.2F, -0.8F, 0.25F, -1.8F, -0.8F, 0.25F, -1.8F, -0.8F, -0.25F, -3.2F, -0.8F); // Box 65
		bodyModel[42].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[5];
		leftArmModel[0] = new ModelRendererTurbo(this, 1220, 70, textureX, textureY); // Import 
		leftArmModel[1] = new ModelRendererTurbo(this, 900, 30, textureX, textureY); // Import 
		leftArmModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		leftArmModel[3] = new ModelRendererTurbo(this, 300, 420, textureX, textureY); // Box 57
		leftArmModel[4] = new ModelRendererTurbo(this, 2150, 420, textureX, textureY); // Box 52

		leftArmModel[0].addShapeBox(-1F, 3.8F, -2F, 160, 40, 160, 0F, 0.3F, 0.0F, 0.3F, -155.7F, 0.0F, 0.3F, -155.7F, 0.0F, -155.7F, 0.3F, 0.0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import 
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(0.2F, -2.4F, -0.5F, 80, 1, 40, 0F, 0.4F, 0.0F, 0.15F, -77.9F, 0.0F, 0.15F, -77.9F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import 
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -2.2F, -2F, 8, 13, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7F, 0.15F, -3.8F, -7F, 0.15F, -3.8F, -7F, 0.15F, 0.2F, -7F, 0.15F); // Import 
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(2.3F, 1.5F, -18.25F, 10, 800, 800, 0F, 0F, -0.25F, -17.5F, -9F, -0.25F, -17.5F, -9F, -0.25F, -781F, 0F, -0.25F, -781F, 0F, -798.5F, -17.5F, -9F, -798.5F, -17.5F, -9F, -798.5F, -781F, 0F, -798.5F, -781F); // Box 57
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-6.7F, -0.4F, -18.75F, 10, 800, 800, 0F, -9F, -0.25F, -17.5F, 0F, -0.25F, -17.5F, 0F, -0.25F, -780F, -9F, -0.25F, -780F, -9F, -798.5F, -17.5F, 0F, -798.5F, -17.5F, 0F, -798.5F, -780F, -9F, -798.5F, -780F); // Box 52
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[3];
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import 
		rightArmModel[1] = new ModelRendererTurbo(this, 400, 170, textureX, textureY); // Import 
		rightArmModel[2] = new ModelRendererTurbo(this, 650, 30, textureX, textureY); // Import 

		rightArmModel[0].addShapeBox(-3F, -2.2F, -2F, 8, 13, 4, 0F, 0.2F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, -3.8F, 0.0F, 0.15F, 0.2F, 0.0F, 0.15F, 0.2F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, -3.8F, -7.0F, 0.15F, 0.2F, -7.0F, 0.15F); // Import 
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 3.8F, -2F, 160, 40, 160, 0F, 0.3F, 0F, 0.3F, -155.7F, 0F, 0.3F, -155.7F, 0F, -155.7F, 0.3F, 0F, -155.7F, 0.3F, -39F, 0.3F, -155.7F, -39F, 0.3F, -155.7F, -39F, -155.7F, 0.3F, -39F, -155.7F); // Import 
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-2.2F, -2.4F, -0.5F, 80, 1, 40, 0F, 0.1F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.1F, 0.0F, -38.85F, 0.4F, 0.0F, 0.15F, -77.6F, 0.0F, 0.15F, -77.6F, 0.0F, -38.85F, 0.4F, 0.0F, -38.85F); // Import 
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);


	}
}