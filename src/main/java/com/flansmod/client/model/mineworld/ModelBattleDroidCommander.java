//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
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

public class ModelBattleDroidCommander extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBattleDroidCommander() //Same as Filename
	{
		headModel = new ModelRendererTurbo[14];
		headModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 9
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 10
		headModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		headModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12
		headModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
		headModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 14
		headModel[6] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 17
		headModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 18
		headModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 20
		headModel[9] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 115
		headModel[10] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 116
		headModel[11] = new ModelRendererTurbo(this, 1, 82, textureX, textureY); // Box 118
		headModel[12] = new ModelRendererTurbo(this, 1, 94, textureX, textureY); // Box 119
		headModel[13] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 99

		headModel[0].addShapeBox(-0.5F, -7F, 0.5F, 1, 7, 1, 0F, 0F, 0.0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-1F, -8F, -3.5F, 2, 3, 4, 0F, -0.5F, -4.5F, 0.5F, -0.5F, -4.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 10
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-1F, -8F, 0.5F, 2, 1, 1, 0F, 0F, 0.0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -7F, 1.5F, 1, 2, 2, 0F, 0F, 0.0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, -1.5F, -0.67F, 0F, -1.5F, -0.67F); // Box 12
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -8F, 1.5F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(0.25F, -7F, 1.5F, 1, 2, 2, 0F, -0.25F, 0.0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 14
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -7F, 0.5F, 1, 1, 1, 0F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F); // Box 17
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -7.4F, 0.5F, 1, 1, 1, 0F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F); // Box 18
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -6.6F, 0.5F, 1, 1, 1, 0F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, 0.1F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, -0.25F, 0.75F, -0.3F, -0.25F); // Box 20
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1.25F, -7F, 1.5F, 1, 2, 2, 0F, -0.25F, 0.0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 115
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.5F, -8F, -1.5F, 1, 1, 1, 0F, 0F, -0.9F, -0.25F, 0F, -0.9F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-0.75F, -6.75F, -11.5F, 10, 1, 10, 0F, 0F, -0.35F, -9.75F, -9.6F, -0.35F, -9.75F, -9.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -9.6F, 0F, -10F, -9.6F, 0F, 0F, 0F, 0F, 0F); // Box 118
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(0.35F, -6.75F, -11.5F, 10, 1, 10, 0F, 0F, -0.35F, -9.75F, -9.6F, -0.35F, -9.75F, -9.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, -9.6F, 0F, -10F, -9.6F, 0F, 0F, 0F, 0F, 0F); // Box 119
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-0.5F, -5F, -3.5F, 1, 1, 1, 0F, -0.15F, -1.75F, 0.4F, -0.15F, -1.75F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		headModel[13].setRotationPoint(0F, 0F, 0F);


		bodyModel = new ModelRendererTurbo[37];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import 
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 22
		bodyModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 23
		bodyModel[3] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 24
		bodyModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 28
		bodyModel[5] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 29
		bodyModel[6] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 30
		bodyModel[7] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 31
		bodyModel[8] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 32
		bodyModel[9] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 33
		bodyModel[10] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 34
		bodyModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 35
		bodyModel[12] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 36
		bodyModel[13] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 48
		bodyModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 50
		bodyModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 51
		bodyModel[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 52
		bodyModel[17] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 53
		bodyModel[18] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 54
		bodyModel[19] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 55
		bodyModel[20] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 62
		bodyModel[21] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 63
		bodyModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 64
		bodyModel[23] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 78
		bodyModel[24] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 81
		bodyModel[25] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 82
		bodyModel[26] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 83
		bodyModel[27] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 84
		bodyModel[28] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 109
		bodyModel[29] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 110
		bodyModel[30] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 111
		bodyModel[31] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 112
		bodyModel[32] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 113
		bodyModel[33] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 114
		bodyModel[34] = new ModelRendererTurbo(this, 87, 59, textureX, textureY); // Box 96
		bodyModel[35] = new ModelRendererTurbo(this, 87, 69, textureX, textureY); // Box 97
		bodyModel[36] = new ModelRendererTurbo(this, 87, 80, textureX, textureY); // Box 98

		bodyModel[0].addShapeBox(-3F, -0.5F, -2F, 6, 5, 4, 0F, -0.5F, 0.1F, -1F, -0.5F, 0.1F, -1F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F); // Import 
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -0.5F, 2, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 22
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, -0.75F, -0.5F, 2, 2, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F); // Box 23
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 0.75F, -0.5F, 2, 2, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F); // Box 24
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-5.5F, -0.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 28
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-5.5F, 0F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 29
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-5.5F, 0.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 30
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(4.5F, -0.75F, -0.5F, 1, 2, 2, 0F, 0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Box 31
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(4.5F, 0F, -0.5F, 1, 2, 2, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F); // Box 32
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(4.5F, 0.75F, -0.5F, 1, 2, 2, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0.5F, -0.75F, -0.5F); // Box 33
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2F, -0.75F, -0.5F, 2, 2, 2, 0F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F); // Box 34
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(2F, 0F, -0.5F, 2, 2, 2, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F); // Box 35
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(2F, 0.75F, -0.5F, 2, 2, 2, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.25F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, 0F); // Box 36
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.5F, 7F, -1F, 1, 5, 3, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 48
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-2F, 11.25F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F); // Box 50
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-2F, 12F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F); // Box 51
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-2F, 12.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F); // Box 52
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(1F, 12.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F); // Box 53
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(1F, 12F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F); // Box 54
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1F, 11.25F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.5F); // Box 55
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-1F, 12F, -0.5F, 2, 2, 2, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 62
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-1F, 11.25F, -0.5F, 2, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F); // Box 63
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-1F, 12.75F, -0.5F, 2, 2, 2, 0F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 64
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(-2.5F, 7.5F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 78
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.5F, 9F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F); // Box 81
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2F, 7.5F, 0F, 1, 1, 1, 0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 82
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-2.5F, 9F, 0F, 2, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F); // Box 83
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-3F, 4.5F, -2F, 6, 3, 4, 0F, -1F, 1F, -0.5F, -1F, 1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Box 84
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3F, -1F, 3F, 6, 8, 2, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 109
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(1.25F, -9F, 1.5F, 1, 9, 1, 0F, -0.45F, 0.0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 110
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(1.25F, -10F, 1.5F, 1, 1, 1, 0F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 111
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(2F, -6F, 1.5F, 1, 6, 1, 0F, -0.45F, 0.0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F); // Box 112
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(2F, -7F, 1.5F, 1, 1, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 113
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3F, -1F, 2F, 6, 8, 1, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-1.5F, -5F, -2F, 18, 9, 1, 0F, 0F, -7.5F, -0.3F, -15F, -7.5F, -0.3F, -15F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-1.5F, -3.4F, -1.45F, 18, 9, 1, 0F, 0F, -7.5F, 0F, -15F, -7.5F, 0F, -15F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, 0F, -0.2F, -15F, 0F, -0.2F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-1.5F, 4F, -2F, 3, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 98
		bodyModel[36].setRotationPoint(0F, 0F, 0F);


		leftArmModel = new ModelRendererTurbo[12];
		leftArmModel[0] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 38
		leftArmModel[1] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 39
		leftArmModel[2] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 40
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 44
		leftArmModel[4] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 45
		leftArmModel[5] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 92
		leftArmModel[6] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 93
		leftArmModel[7] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 94
		leftArmModel[8] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 97
		leftArmModel[9] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 98
		leftArmModel[10] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 99
		leftArmModel[11] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 100

		leftArmModel[0].addShapeBox(-0.5F, 2.25F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 38
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-0.5F, 3F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 39
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-0.5F, 3.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 40
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 44
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-0.5F, 5F, -0.5F, 1, 1, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 45
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-0.5F, 6F, -0.5F, 1, 1, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Box 92
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-0.25F, 8.5F, 0.5F, 1, 2, 2, 0F, -0.25F, 0.0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F); // Box 93
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(-0.5F, 7.5F, -0.5F, 1, 1, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 94
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(-0.5F, 6F, 0.5F, 1, 1, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Box 97
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(-0.25F, 8.75F, -0.5F, 1, 1, 2, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 98
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-1F, 8F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Box 99
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(-0.25F, 8.5F, -0.5F, 1, 2, 2, 0F, -0.25F, 0.0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F); // Box 100
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);


		rightArmModel = new ModelRendererTurbo[12];
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 41
		rightArmModel[1] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 42
		rightArmModel[2] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 43
		rightArmModel[3] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 46
		rightArmModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 101
		rightArmModel[5] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 102
		rightArmModel[6] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 103
		rightArmModel[7] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 104
		rightArmModel[8] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 105
		rightArmModel[9] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 106
		rightArmModel[10] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 107
		rightArmModel[11] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 108

		rightArmModel[0].addShapeBox(-0.5F, 2.25F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 41
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-0.5F, 3F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 42
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-0.5F, 3.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 43
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 46
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-0.5F, 5F, -0.5F, 1, 1, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 101
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-0.5F, 6F, -0.5F, 1, 1, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Box 102
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-0.5F, 6F, 0.5F, 1, 1, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Box 103
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-0.5F, 7.5F, -0.5F, 1, 1, 2, 0F, 0F, 0.0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 104
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(0.5F, 8F, 0F, 1, 2, 2, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, -0.25F, -0.5F, 0.5F, -0.25F, -0.5F, 0.5F, -1.25F, 0F, 0.5F, -1.25F); // Box 105
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-0.75F, 8.5F, -0.5F, 1, 2, 2, 0F, -0.25F, 0.0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F); // Box 106
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-0.75F, 8.75F, -0.5F, 1, 1, 2, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 107
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-0.75F, 8.5F, 0.5F, 1, 2, 2, 0F, -0.25F, 0.0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F); // Box 108
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);


		leftLegModel = new ModelRendererTurbo[12];
		leftLegModel[0] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 59
		leftLegModel[1] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 60
		leftLegModel[2] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 61
		leftLegModel[3] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 71
		leftLegModel[4] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 72
		leftLegModel[5] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 73
		leftLegModel[6] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 74
		leftLegModel[7] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 75
		leftLegModel[8] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 76
		leftLegModel[9] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 86
		leftLegModel[10] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 87
		leftLegModel[11] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 88

		leftLegModel[0].addShapeBox(0F, 0F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 59
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(0F, 0.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 60
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(0F, -0.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 61
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-0.25F, 1F, -0.5F, 1, 4, 2, 0F, 0.25F, 0.0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 71
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(-0.25F, 5F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(-0.25F, 5.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 73
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(-0.25F, 4.25F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 74
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(-0.25F, 7F, -0.5F, 1, 3, 2, 0F, 0.25F, 0.0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F); // Box 75
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(-0.25F, 10F, -2.5F, 1, 2, 4, 0F, 0.25F, -0.5F, -2.25F, 0.25F, -0.5F, -2.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 76
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(-0.25F, 10F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F); // Box 86
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(-0.25F, 9.6F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F); // Box 87
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-0.25F, 10.4F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F); // Box 88
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);


		rightLegModel = new ModelRendererTurbo[12];
		rightLegModel[0] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 56
		rightLegModel[1] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 57
		rightLegModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 58
		rightLegModel[3] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 65
		rightLegModel[4] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 66
		rightLegModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 67
		rightLegModel[6] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 68
		rightLegModel[7] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 69
		rightLegModel[8] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 70
		rightLegModel[9] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 89
		rightLegModel[10] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 90
		rightLegModel[11] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 91

		rightLegModel[0].addShapeBox(-1F, 0.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 56
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(-1F, 0F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 57
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-1F, -0.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 58
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(-0.75F, 1F, -0.5F, 1, 4, 2, 0F, 0.25F, 0.0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 65
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-0.75F, 5F, -0.5F, 1, 2, 2, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 66
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-0.75F, 4.25F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 67
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-0.75F, 5.75F, -0.5F, 1, 2, 2, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Box 68
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-0.75F, 7F, -0.5F, 1, 3, 2, 0F, 0.25F, 0.0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F); // Box 69
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-0.75F, 10F, -2.5F, 1, 2, 4, 0F, 0.25F, -0.5F, -2.25F, 0.25F, -0.5F, -2.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F); // Box 70
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-0.75F, 10F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F); // Box 89
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-0.75F, 10.4F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F); // Box 90
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(-0.75F, 9.6F, 0F, 1, 1, 1, 0F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, -0.25F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F, 0.5F, -0.3F, 0.1F); // Box 91
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);


	}
}