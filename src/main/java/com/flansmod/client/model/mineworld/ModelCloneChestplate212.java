//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
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

public class ModelCloneChestplate212 extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCloneChestplate212() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[39];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 116, 43, textureX, textureY); // Box 6
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 11
		bodyModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 12
		bodyModel[10] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 13
		bodyModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		bodyModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 16
		bodyModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 17
		bodyModel[14] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 18
		bodyModel[15] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 19
		bodyModel[16] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 20
		bodyModel[17] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 21
		bodyModel[18] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 22
		bodyModel[19] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 23
		bodyModel[20] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 30
		bodyModel[21] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 32
		bodyModel[22] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 43
		bodyModel[24] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 44
		bodyModel[25] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 45
		bodyModel[26] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 38
		bodyModel[27] = new ModelRendererTurbo(this, 25, 61, textureX, textureY); // Box 39
		bodyModel[28] = new ModelRendererTurbo(this, 81, 54, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 81, 59, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 81, 64, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 81, 64, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 81, 64, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 2, 43, textureX, textureY); // Box 49
		bodyModel[34] = new ModelRendererTurbo(this, 101, 101, textureX, textureY); // Box 54
		bodyModel[35] = new ModelRendererTurbo(this, 101, 101, textureX, textureY); // Box 55
		bodyModel[36] = new ModelRendererTurbo(this, 116, 43, textureX, textureY); // Box 56
		bodyModel[37] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 57
		bodyModel[38] = new ModelRendererTurbo(this, 113, 50, textureX, textureY); // Box 58

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 11, 4, 0F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0.9F, -2.9F, 4, 3, 1, 0F, 0.01F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 1.1F, 0F, -0.05F, 0.1F, 0F, -0.05F, 0.1F, 0F, 0.01F, 1.1F, 0F); // Box 3
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addBox(-3.5F, 8F, -3.2F, 2, 3, 1, 0F); // Box 4
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 1F, -2.2F, 8, 5, 4, 0F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F); // Box 5
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 6.2F, -2.2F, 2, 2, 3, 0F, 0.02F, 1.1F, 0.41F, 0.75F, -1.25F, 0.41F, 0.75F, -1.25F, 1.61F, 0.02F, 1.1F, 1.61F, 0.02F, -0.2F, 0.41F, 0F, -0.2F, 0.41F, 0F, -0.2F, 1.61F, 0.02F, -0.2F, 1.61F); // Box 6
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-2F, 6.2F, -2.2F, 2, 2, 3, 0F, 0F, 0.1F, 0.4F, -0.5F, 0.1F, 0.4F, -0.5F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, -0.2F, 0.4F, -0.5F, -1.2F, 0.4F, -0.5F, -1.2F, 0.4F, 0F, -0.2F, 0.4F); // Box 8
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, 6.2F, -2.2F, 2, 2, 3, 0F, -0.5F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, -0.5F, 0.1F, 0.4F, -0.5F, -1.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, -0.5F, -1.2F, 0.4F); // Box 9
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(2F, 6.2F, -2.2F, 2, 2, 3, 0F, 0F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, -0.2F, 0.4F, 0.01F, -0.2F, 0.4F, 0.01F, -0.2F, 0.4F, 0F, -0.2F, 0.4F); // Box 10
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-0.5F, 6.2F, -2.2F, 1, 2, 3, 0F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, -1.2F, 0.4F, 0F, -1.2F, 0.4F, 0F, -1.2F, 0.4F, 0F, -1.2F, 0.4F); // Box 11
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addBox(1.5F, 8F, -3.2F, 2, 3, 1, 0F); // Box 12
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 8.5F, -2.7F, 8, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 0.9F, -2.9F, 4, 3, 1, 0F, -0.05F, 0F, 0F, 0.01F, 0F, 0F, 0.01F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0.1F, 0F, 0.01F, 1.1F, 0F, 0.01F, 1.1F, 0F, -0.05F, 0.1F, 0F); // Box 14
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.2F, 8.5F, -2.7F, 1, 2, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 16
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 8.5F, 1.7F, 8, 2, 1, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3.2F, 8.5F, -2.7F, 1, 2, 5, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.4F, 0F, -0.25F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 18
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 0F, -2.5F, 2, 2, 3, 0F, 0.02F, 0.11F, 0.4F, 0.25F, 0.11F, 0.4F, 0.25F, 0.11F, 0.4F, 0.02F, 0.11F, 0.4F, 0.02F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F, 0.02F, -0.2F, 0.4F); // Box 19
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(2F, 0F, -2.5F, 2, 2, 3, 0F, 0.25F, 0.11F, 0.4F, 0.011F, 0.11F, 0.4F, 0.011F, 0.11F, 0.4F, 0.25F, 0.11F, 0.4F, 0.25F, -0.2F, 0.4F, 0.011F, -0.2F, 0.4F, 0.011F, -0.2F, 0.4F, 0.25F, -0.2F, 0.4F); // Box 20
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-2F, 0F, -2.5F, 2, 2, 3, 0F, -0.25F, 0.1F, 0.4F, -0.5F, -0.9F, 0.4F, -0.5F, -0.9F, 0.4F, -0.25F, 0.1F, 0.4F, -0.25F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F, -0.25F, -0.2F, 0.4F); // Box 21
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, -2.5F, 2, 2, 3, 0F, -0.5F, -0.9F, 0.4F, -0.25F, 0.1F, 0.4F, -0.25F, 0.1F, 0.4F, -0.5F, -0.9F, 0.4F, -0.5F, -0.2F, 0.4F, -0.25F, -0.2F, 0.4F, -0.25F, -0.2F, 0.4F, -0.5F, -0.2F, 0.4F); // Box 22
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-2F, 2F, 2F, 16, 6, 1, 0F, 0.75F, 1F, 0F, -11.25F, 1F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F, 0F, -11F, -1.5F, 0F, -12F, -3F, 0F, 0F, -3F, 0F); // Box 23
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1.5F, 11.2F, -2F, 3, 2, 4, 0F, -0.25F, 0.1F, 0.4F, -0.25F, 0.1F, 0.4F, -0.25F, 0.1F, 0.4F, -0.25F, 0.1F, 0.4F, -0.25F, -0.5F, 0.4F, -0.25F, -0.5F, 0.4F, -0.25F, -0.5F, 0.4F, -0.25F, -0.5F, 0.4F); // Box 30
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4.5F, 11.2F, -2F, 3, 2, 4, 0F, -0.49F, 0.1F, 0.4F, 0.25F, 0.1F, 0.4F, 0.25F, 0.1F, 0.4F, -0.49F, 0.1F, 0.4F, -0.49F, -2F, 0.4F, 0.25F, -0.5F, 0.4F, 0.25F, -0.5F, 0.4F, -0.49F, -1.5F, 0.4F); // Box 32
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1.5F, 11.2F, -2F, 3, 2, 4, 0F, 0.25F, 0.1F, 0.4F, -0.49F, 0.1F, 0.4F, -0.49F, 0.1F, 0.4F, 0.25F, 0.1F, 0.4F, 0.25F, -0.5F, 0.4F, -0.49F, -2F, 0.4F, -0.49F, -2F, 0.4F, 0.25F, -0.5F, 0.4F); // Box 34
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.5F, -0.2F, -2.2F, 5, 1, 4, 0F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F); // Box 43
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.9F, -0.1F, -2.2F, 2, 1, 4, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F); // Box 44
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(1.9F, -0.1F, -2.2F, 2, 1, 4, 0F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F); // Box 45
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-3.4F, 3.7F, -2.91F, 2, 3, 1, 0F, 0F, -0.1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.1F, 0F, 0F, -2.4F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, 0F, -2.4F, 0F); // Box 38
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-2F, 2.5F, 2.01F, 20, 12, 1, 0F, 0F, 0.25F, 0F, -16F, 0.25F, 0F, -16F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -9.75F, 0F, -16F, -9.75F, 0F, -16F, -9.75F, 0F, 0F, -9.75F, 0F); // Box 39
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(1.8F, 8F, 2.2F, 2, 3, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 41
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-3.8F, 8F, 2.2F, 2, 3, 1, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 42
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-1.5F, 9F, 2.7F, 3, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 43
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-1.5F, 8.4F, 2.7F, 3, 1, 1, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 44
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-1.5F, 9.6F, 2.7F, 3, 1, 1, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 45
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-1.5F, 9.8F, -1.5F, 3, 3, 3, 0F, 2.52F, 0F, 0.52F, 2.52F, 0F, 0.52F, 2.52F, 0F, 0.52F, 2.52F, 0F, 0.52F, 2.52F, 0F, 0.52F, 2.52F, 0F, 0.52F, 2.52F, 0F, 0.52F, 2.52F, 0F, 0.52F); // Box 49
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-4F, 0.91F, -2.9F, 4, 3, 1, 0F, 0.02F, 0.02F, 0.01F, -0.04F, 0.02F, 0.01F, -0.04F, 0.02F, 0.01F, 0.02F, 0.02F, 0.01F, 0.02F, -1.5F, 0.01F, -0.04F, -0.4F, 0.01F, -0.04F, -0.4F, 0.01F, 0.02F, -1.5F, 0.01F); // Box 54
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(0F, 0.91F, -2.9F, 4, 3, 1, 0F, -0.04F, 0.02F, 0.01F, 0.02F, 0.02F, 0.01F, 0.02F, 0.02F, 0.01F, -0.04F, 0.02F, 0.01F, -0.04F, -0.4F, 0.01F, 0.02F, -1.5F, 0.01F, 0.02F, -1.5F, 0.01F, -0.04F, -0.4F, 0.01F); // Box 55
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(2F, 6.2F, -2.2F, 2, 2, 3, 0F, 0.75F, -1.25F, 0.41F, 0.02F, 1.1F, 0.41F, 0.02F, 1.1F, 1.61F, 0.75F, -1.25F, 1.61F, 0F, -0.2F, 0.41F, 0.02F, -0.2F, 0.41F, 0.02F, -0.2F, 1.61F, 0F, -0.2F, 1.61F); // Box 56
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4F, 6.2F, -2.2F, 2, 2, 3, 0F, 0F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0.01F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, -0.2F, 0.4F, 0.01F, -0.2F, 0.4F, 0.01F, -0.2F, 0.4F, 0F, -0.2F, 0.4F); // Box 57
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-1.5F, 10.5F, -2F, 3, 2, 4, 0F, 0.5F, 0.1F, 0.41F, 0.5F, 0.1F, 0.41F, 0.5F, 0.1F, 0.41F, 0.5F, 0.1F, 0.41F, -0.5F, -0.5F, 0.41F, -0.5F, -0.5F, 0.41F, -0.5F, -0.5F, 0.41F, -0.5F, -0.5F, 0.41F); // Box 58
		bodyModel[38].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[8];
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 36
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 38
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 39
		leftArmModel[3] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 40
		leftArmModel[4] = new ModelRendererTurbo(this, 110, 35, textureX, textureY); // Box 41
		leftArmModel[5] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 42
		leftArmModel[6] = new ModelRendererTurbo(this, 98, 54, textureX, textureY); // Box 52
		leftArmModel[7] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 53

		leftArmModel[0].addShapeBox(-1F, -2.09F, -2F, 4, 12, 4, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.15F, 0.1F, 0.1F, 0.15F, 0.1F, 0.1F, 0.15F, 0.1F, 0.1F, 0.15F, 0.1F); // Box 36
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(2F, 7.5F, -2F, 1, 1, 4, 0F, -0.5F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, -0.5F, 0.25F, 0.3F, -0.5F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, -0.5F, 0.5F, 0.3F); // Box 38
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 5.6F, -2F, 4, 1, 4, 0F, 0.11F, 1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 0.25F, 0.3F, 0.11F, 0.25F, 0.3F, 0.11F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.1F, 0.5F, 0.3F); // Box 39
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 3.8F, -2F, 4, 2, 4, 0F, 0.11F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.25F, 0.5F, 0.11F, 0.25F, 0.5F, 0.11F, -1.75F, 0.3F, 0.3F, -1.75F, 0.3F, 0.3F, -0.5F, 0.5F, 0.11F, -0.5F, 0.5F); // Box 40
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1F, 1.8F, -2F, 4, 1, 4, 0F, 0.1F, -1.5F, 0.31F, 0.31F, 0.25F, 0.31F, 0.31F, 0.25F, 0.31F, 0.1F, -1.5F, 0.31F, 0.1F, 0.5F, 0.31F, 0.31F, 0.5F, 0.31F, 0.31F, 0.5F, 0.31F, 0.1F, 0.5F, 0.31F); // Box 41
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-1F, -2.2F, -2F, 4, 3, 4, 0F, -0.4F, 0.25F, 0.5F, 0.6F, 0.25F, 0.5F, 0.6F, 0.25F, 0.5F, -0.4F, 0.25F, 0.5F, -0.4F, -1.75F, 0.5F, 0.6F, 1F, 0.5F, 0.6F, 1F, 0.5F, -0.4F, -1.75F, 0.5F); // Box 42
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-1F, -2.2F, -2F, 4, 3, 4, 0F, -1.39F, -1.9F, 0.51F, 0.61F, -0.8F, 0.51F, 0.61F, -0.8F, 0.51F, -1.39F, -1.9F, 0.51F, -1.39F, -1.1F, 0.51F, 0.61F, 1F, 0.51F, 0.61F, 1F, 0.51F, -1.39F, -1.1F, 0.51F); // Box 52
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-1F, 1.8F, -2F, 4, 1, 4, 0F, 0.11F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.11F, 0.25F, 0.3F, 0.11F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.11F, 0.5F, 0.3F); // Box 53
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[9];
		rightArmModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 23
		rightArmModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 24
		rightArmModel[2] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 25
		rightArmModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 26
		rightArmModel[4] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 27
		rightArmModel[5] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 29
		rightArmModel[6] = new ModelRendererTurbo(this, 15, 82, textureX, textureY); // Box 40
		rightArmModel[7] = new ModelRendererTurbo(this, 98, 54, textureX, textureY); // Box 47
		rightArmModel[8] = new ModelRendererTurbo(this, 110, 35, textureX, textureY); // Box 54

		rightArmModel[0].addShapeBox(-3F, -2.09F, -2F, 4, 12, 4, 0F, 0.1F, 0.0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0.15F, 0.1F, 0.1F, 0.15F, 0.1F, 0.1F, 0.15F, 0.1F, 0.1F, 0.15F, 0.1F); // Box 23
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.2F, -2F, 4, 3, 4, 0F, 0.6F, 0.25F, 0.5F, -0.4F, 0.25F, 0.5F, -0.4F, 0.25F, 0.5F, 0.6F, 0.25F, 0.5F, 0.6F, 1F, 0.5F, -0.4F, -1.75F, 0.5F, -0.4F, -1.75F, 0.5F, 0.6F, 1F, 0.5F); // Box 24
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, 1.8F, -2F, 4, 1, 4, 0F, 0.3F, 0.25F, 0.3F, 0.11F, 0.25F, 0.3F, 0.11F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.5F, 0.3F, 0.11F, 0.5F, 0.3F, 0.1F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 25
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, 3.8F, -2F, 4, 2, 4, 0F, 0.3F, 0.25F, 0.3F, 0.11F, 0.25F, 0.3F, 0.11F, 0.25F, 0.5F, 0.3F, 0.25F, 0.5F, 0.3F, -1.75F, 0.3F, 0.11F, -1.75F, 0.3F, 0.11F, -0.5F, 0.5F, 0.3F, -0.5F, 0.5F); // Box 26
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 5.6F, -2F, 4, 1, 4, 0F, 0.3F, 1F, 0.3F, 0.11F, 1F, 0.3F, 0.11F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.5F, 0.3F, 0.11F, 0.5F, 0.3F, 0.11F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 27
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 7.5F, -2F, 1, 1, 4, 0F, 0.3F, 0.25F, 0.3F, -0.5F, 0.25F, 0.3F, -0.5F, 0.25F, 0.3F, 0.3F, 0.25F, 0.3F, 0.3F, 0.5F, 0.3F, -0.5F, 0.5F, 0.3F, -0.5F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 29
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3.35F, 5.05F, -1F, 1, 8, 2, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -6F, -0.6F, 0F, -6F, -0.6F, 0F, -6F, -0.6F, 0F, -6F, -0.6F); // Box 40
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, -2.2F, -2F, 4, 3, 4, 0F, 0.61F, -0.8F, 0.51F, -1.39F, -1.9F, 0.51F, -1.39F, -1.9F, 0.51F, 0.61F, -0.8F, 0.51F, 0.61F, 1F, 0.51F, -1.39F, -1.1F, 0.51F, -1.39F, -1.1F, 0.51F, 0.61F, 1F, 0.51F); // Box 47
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 1.8F, -2F, 4, 1, 4, 0F, 0.31F, 0.25F, 0.31F, 0.1F, -1.5F, 0.31F, 0.1F, -1.5F, 0.31F, 0.31F, 0.25F, 0.31F, 0.31F, 0.5F, 0.31F, 0.1F, 0.5F, 0.31F, 0.1F, 0.5F, 0.31F, 0.31F, 0.5F, 0.31F); // Box 54
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);


	}
}