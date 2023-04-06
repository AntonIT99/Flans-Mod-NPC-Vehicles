//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PaddedMail
// Model Creator: 
// Created on: 06.04.2022 - 17:10:35
// Last changed on: 06.04.2022 - 17:10:35

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPaddedMailRu extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPaddedMailRu() //Same as Filename
	{
		headModel = new ModelRendererTurbo[52];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 1
		headModel[1] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 2
		headModel[2] = new ModelRendererTurbo(this, 31, 6, textureX, textureY); // Box 3
		headModel[3] = new ModelRendererTurbo(this, 31, 6, textureX, textureY); // Box 5
		headModel[4] = new ModelRendererTurbo(this, 32, 7, textureX, textureY); // Box 6
		headModel[5] = new ModelRendererTurbo(this, 32, 7, textureX, textureY); // Box 7
		headModel[6] = new ModelRendererTurbo(this, 31, 6, textureX, textureY); // Box 8
		headModel[7] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 10
		headModel[8] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 11
		headModel[9] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 12
		headModel[10] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 13
		headModel[11] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 14
		headModel[12] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 16
		headModel[13] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 17
		headModel[14] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 18
		headModel[15] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 19
		headModel[16] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 20
		headModel[17] = new ModelRendererTurbo(this, 34, 37, textureX, textureY); // Box 21
		headModel[18] = new ModelRendererTurbo(this, 33, 36, textureX, textureY); // Box 23
		headModel[19] = new ModelRendererTurbo(this, 4, 52, textureX, textureY); // Box 25
		headModel[20] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 26
		headModel[21] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 27
		headModel[22] = new ModelRendererTurbo(this, 4, 52, textureX, textureY); // Box 28
		headModel[23] = new ModelRendererTurbo(this, 1, 15, textureX, textureY); // Box 30
		headModel[24] = new ModelRendererTurbo(this, 16, 5, textureX, textureY); // Box 35
		headModel[25] = new ModelRendererTurbo(this, 16, 5, textureX, textureY); // Box 36
		headModel[26] = new ModelRendererTurbo(this, 16, 5, textureX, textureY); // Box 37
		headModel[27] = new ModelRendererTurbo(this, 16, 5, textureX, textureY); // Box 38
		headModel[28] = new ModelRendererTurbo(this, 5, 49, textureX, textureY); // Box 39
		headModel[29] = new ModelRendererTurbo(this, 5, 49, textureX, textureY); // Box 40
		headModel[30] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 78
		headModel[31] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 79
		headModel[32] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 80
		headModel[33] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 81
		headModel[34] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 82
		headModel[35] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 83
		headModel[36] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 84
		headModel[37] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 85
		headModel[38] = new ModelRendererTurbo(this, 4, 52, textureX, textureY); // Box 86
		headModel[39] = new ModelRendererTurbo(this, 5, 49, textureX, textureY); // Box 104
		headModel[40] = new ModelRendererTurbo(this, 5, 49, textureX, textureY); // Box 105
		headModel[41] = new ModelRendererTurbo(this, 31, 6, textureX, textureY); // Box 106
		headModel[42] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 107
		headModel[43] = new ModelRendererTurbo(this, 3, 47, textureX, textureY); // Box 108
		headModel[44] = new ModelRendererTurbo(this, 3, 47, textureX, textureY); // Box 109
		headModel[45] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 111
		headModel[46] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 112
		headModel[47] = new ModelRendererTurbo(this, 32, 36, textureX, textureY); // Box 114
		headModel[48] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 115
		headModel[49] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 116
		headModel[50] = new ModelRendererTurbo(this, 32, 23, textureX, textureY); // Box 117
		headModel[51] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 109

		headModel[0].addShapeBox(0F, 0F, 0F, 8, 10, 2, 0F,0.0999999999999996F, 0F, 0.2F, 0.0999999999999999F, 0F, 0.2F, 0.0999999999999999F, 0F, 0F, 0.100000000000001F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[0].setRotationPoint(-4F, 0F, -2F);

		headModel[1].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, 0.1F, 0.3F, -0.5F, 0.1F, 0.3F, -0.6F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.5F, 0.3F, -0.0999999999999997F, -0.5F, 0.3F, -0.0999999999999997F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		headModel[1].setRotationPoint(0F, 0F, -2F);

		headModel[2].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.6F, 0F, 0.5F, 0.85F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 3
		headModel[2].setRotationPoint(-4F, 10F, -2F);

		headModel[3].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.85F, 0.5F, 0F, 0.6F, 0.75F, 0F, 0F, 0F, 0F, 0F); // Box 5
		headModel[3].setRotationPoint(0F, 10F, -2F);

		headModel[4].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.85F, 0.5F, 0F, 0.6F); // Box 6
		headModel[4].setRotationPoint(-4F, 10F, 0F);

		headModel[5].addShapeBox(0F, 0F, 0F, 4, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0.6F, 0F, 0.5F, 0.85F); // Box 7
		headModel[5].setRotationPoint(0F, 10F, 0F);

		headModel[6].addShapeBox(0F, 0F, 0F, 4, 10, 4, 0F,0.100000000000001F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.0999999999999999F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 8
		headModel[6].setRotationPoint(4F, 0F, -2F);

		headModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.6F, 0F, 0.75F, 0.8F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 10
		headModel[7].setRotationPoint(-4F, 10F, -2F);

		headModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.8F, 0.4F, 0F, 0.6F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 11
		headModel[8].setRotationPoint(0F, 10F, -2F);

		headModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.8F, 0.4F, 0F, 0.6F); // Box 12
		headModel[9].setRotationPoint(-4F, 10F, 0F);

		headModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.4F, 0F, 0.6F, 0F, 0.75F, 0.8F); // Box 13
		headModel[10].setRotationPoint(0F, 10F, 0F);

		headModel[11].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.3F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.2F, 0.3F, 0F, 0.45F); // Box 14
		headModel[11].setRotationPoint(4F, 0F, -2F);

		headModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.0999999999999993F, 0.3F, -0.1F, -0.0999999999999993F, 0.3F, -0.1F, -0.0999999999999997F, 0F, 0F, 0.1F, 0F, 0F, -1F, 0.3F, 0.1F, -1F, 0.3F, 0.1F, -1F, 0F, 0F, -0.5F, 0F); // Box 16
		headModel[12].setRotationPoint(0F, 4.4F, -2F);

		headModel[13].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -1F, 0.3F, 0.1F, -1F, 0.3F, 0.1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.0999999999999993F, 0.3F, 0.1F, -0.0999999999999993F, 0.3F, 0.0999999999999997F, -0.0999999999999997F, 0F, 0F, 0.1F, 0F); // Box 17
		headModel[13].setRotationPoint(0F, 5.4F, -2F);

		headModel[14].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -1F, 0.3F, 0.1F, -1F, 0.3F, 0.1F, -1F, 0F, 0F, -0.5F, 0F, -0.25F, -0.0999999999999993F, 0.3F, 0.1F, -0.0999999999999993F, 0.3F, 0.0999999999999997F, -0.0999999999999997F, 0F, 0F, 0.1F, 0F); // Box 18
		headModel[14].setRotationPoint(0F, 7.3F, -2F);

		headModel[15].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.1F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, -0.5F, 0F, 0.1F, -1F, 0F, 0.1F, -0.0999999999999993F, 0.3F, 0F, -0.0999999999999993F, 0.3F, 0F, 0.1F, 0F, 0.0999999999999997F, -0.0999999999999997F, 0F); // Box 19
		headModel[15].setRotationPoint(-4F, 5.4F, -2F);

		headModel[16].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.1F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, -0.5F, 0F, 0.1F, -1F, 0F, 0.1F, -0.0999999999999993F, 0.3F, -0.25F, -0.0999999999999993F, 0.3F, 0F, 0.1F, 0F, 0.0999999999999997F, -0.0999999999999997F, 0F); // Box 20
		headModel[16].setRotationPoint(-4F, 7.3F, -2F);

		headModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-0.1F, -0.0999999999999993F, 0.3F, 0F, -0.0999999999999993F, 0.3F, 0F, 0.1F, 0F, -0.1F, -0.0999999999999997F, 0F, 0.1F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, -0.5F, 0F, 0.1F, -1F, 0F); // Box 21
		headModel[17].setRotationPoint(-4F, 4.4F, -2F);

		headModel[18].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.6F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.0999999999999997F, -0.5F, 0.3F, 0F, -0.5F, 0.3F, 0F, -0.5F, 0F, -0.0999999999999997F, -0.5F, 0F); // Box 23
		headModel[18].setRotationPoint(-4F, 0F, -2F);

		headModel[19].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0.2F, -1F, 0.4F, 0.2F, -1F, 0.4F, 0.199999999999999F, -1F, 0F, 0.3F, -1F, 0F, 0.2F, -0.0999999999999993F, 0.4F, 0.2F, -0.0999999999999993F, 0.4F, 0.2F, -0.15F, 0F, 0.3F, -0.0999999999999997F, 0F); // Box 25
		headModel[19].setRotationPoint(-4F, 5.9F, -2F);

		headModel[20].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0.45F, -1F, 0.5F, 0.2F, -1F, 0.5F, 0.199999999999999F, -1F, 0F, 0.3F, -1F, 0F, 0.45F, 6.80011602582908E-16F, 0.5F, 0.2F, -0.0999999999999993F, 0.5F, 0.2F, -0.15F, 0F, 0.3F, -0.0999999999999997F, 0F); // Box 26
		headModel[20].setRotationPoint(-1.75F, 5.9F, -2F);

		headModel[21].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,1.7F, -1.75F, 0.6F, 0.2F, -1F, 0.6F, 0.199999999999999F, -1F, 0F, 1.8F, -1.75F, 0F, 0.7F, 0.400000000000001F, 0.6F, 0.2F, 0.150000000000001F, 0.6F, 0.2F, 0.1F, 0F, 0.55F, 0.4F, 0F); // Box 27
		headModel[21].setRotationPoint(-1.75F, 7.65F, -2F);

		headModel[22].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.3F, -1F, 0.5F, 0.85F, -2.4F, 0.7F, 0.85F, -2.4F, -1.5F, 0.3F, -1F, -1.3F, 0.3F, -0.0999999999999993F, 0.5F, 0.55F, 1.25F, 0.7F, 0.55F, 1.25F, -1.5F, 0.3F, -0.0999999999999997F, -1.3F); // Box 28
		headModel[22].setRotationPoint(0.75F, 5.9F, -2F);

		headModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, -1F, 0.5F, 0.1F, -1F, 0.5F, 0.199999999999999F, -1F, 0F, 0.3F, -1F, 0F, 0.2F, -0.0999999999999993F, 0.5F, 0.1F, -0.0999999999999993F, 0.5F, 0.2F, -0.15F, 0F, 0.3F, -0.0999999999999997F, 0F); // Box 30
		headModel[23].setRotationPoint(-0.5F, 5.9F, -2.1F);

		headModel[24].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.35F, 0F, 0.3F, 0.3F, 0F, 0.2F, 0.4F, 0F, 0.0499999999999991F, 0.1F, 0F, -0.05F, 0.7F, -1.5F, 0.6F, 0.85F, -1F, 0.6F, 1.1F, -1F, -8.32667268468867E-17F, 0.45F, -1.5F, 0.45F); // Box 35
		headModel[24].setRotationPoint(4F, -0.2F, -2F);

		headModel[25].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.1F, 0F, 0.05F, 0.4F, 0F, -0.050000000000001F, 0.3F, 0F, 0.2F, 0.35F, 0F, 0.3F, 0.45F, -1.5F, 0.45F, 1.1F, -1F, -8.32667268468867E-17F, 0.85F, -1F, 0.6F, 0.95F, -1.5F, 0.6F); // Box 36
		headModel[25].setRotationPoint(4F, -0.2F, 0F);

		headModel[26].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.3F, 0F, 0.2F, 0.35F, 0F, 0.3F, 0.1F, 0F, -0.05F, 0.4F, 0F, 0.0499999999999991F, 0.85F, -1F, 0.6F, 0.7F, -1.5F, 0.6F, 0.45F, -1.5F, 0.45F, 1.1F, -1F, -8.32667268468867E-17F); // Box 37
		headModel[26].setRotationPoint(-8F, -0.2F, -2F);

		headModel[27].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.4F, 0F, -0.0500000000000009F, 0.1F, 0F, 0.0500000000000001F, 0.35F, 0F, 0.3F, 0.3F, 0F, 0.2F, 1.1F, -1F, -8.32667268468867E-17F, 0.45F, -1.5F, 0.45F, 0.7F, -1.5F, 0.6F, 0.85F, -1F, 0.6F); // Box 38
		headModel[27].setRotationPoint(-8F, -0.2F, 0F);

		headModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.2F, 0F, 0.200000000000001F, 0.2F, 0F, 0.200000000000001F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 39
		headModel[28].setRotationPoint(4F, 10F, -2F);

		headModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.4F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.25F, 0F, 0.35F, 0.2F, 0F, 0.200000000000001F, 0.2F, 0F, 0.200000000000001F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 40
		headModel[29].setRotationPoint(4F, 8F, -2F);

		headModel[30].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.6F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.3F, -0.6F, 0.1F, 0.3F, -0.0999999999999997F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.3F, -0.0999999999999997F, -0.5F, 0.3F); // Box 78
		headModel[30].setRotationPoint(-4F, 0F, 0F);

		headModel[31].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,-0.1F, -0.0999999999999997F, 0F, 0F, 0.1F, 0F, 0F, -0.0999999999999993F, 0.3F, -0.1F, -0.0999999999999993F, 0.3F, 0.1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.3F, 0.1F, -1F, 0.3F); // Box 79
		headModel[31].setRotationPoint(-4F, 4.4F, 0F);

		headModel[32].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.3F, 0.1F, -1F, 0.3F, 0.0999999999999997F, -0.0999999999999997F, 0F, 0F, 0.1F, 0F, 0F, -0.0999999999999993F, 0.3F, 0.1F, -0.0999999999999993F, 0.3F); // Box 80
		headModel[32].setRotationPoint(-4F, 5.4F, 0F);

		headModel[33].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.1F, -1F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.3F, 0.1F, -1F, 0.3F, 0.0999999999999997F, -0.0999999999999997F, 0F, 0F, 0.1F, 0F, 0F, -0.0999999999999993F, 0.3F, 0.1F, -0.0999999999999993F, 0.3F); // Box 81
		headModel[33].setRotationPoint(-4F, 7.3F, 0F);

		headModel[34].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, 0.1F, 0F, -0.6F, 0.1F, 0F, -0.6F, 0.1F, 0.3F, 0F, 0.1F, 0.3F, 0F, -0.5F, 0F, -0.0999999999999997F, -0.5F, 0F, -0.0999999999999997F, -0.5F, 0.3F, 0F, -0.5F, 0.3F); // Box 82
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, 0.1F, 0F, -0.1F, -0.0999999999999997F, 0F, -0.1F, -0.0999999999999993F, 0.3F, 0F, -0.0999999999999993F, 0.3F, 0F, -0.5F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0.3F, 0F, -1F, 0.3F); // Box 83
		headModel[35].setRotationPoint(0F, 4.4F, 0F);

		headModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.5F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0.1F, 0F, 0.0999999999999997F, -0.0999999999999997F, 0F, 0.1F, -0.0999999999999993F, 0.3F, 0F, -0.0999999999999993F, 0.3F); // Box 84
		headModel[36].setRotationPoint(0F, 5.4F, 0F);

		headModel[37].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0F, -0.5F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0.3F, 0F, -1F, 0.3F, 0F, 0.1F, 0F, 0.0999999999999997F, -0.0999999999999997F, 0F, 0.1F, -0.0999999999999993F, 0.3F, 0F, -0.0999999999999993F, 0.3F); // Box 85
		headModel[37].setRotationPoint(0F, 7.3F, 0F);

		headModel[38].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,0.3F, -1F, 0F, 0.199999999999999F, -1F, 0F, 0.2F, -1F, 0.4F, 0.2F, -1F, 0.4F, 0.3F, -0.0999999999999997F, 0F, 0.2F, -0.15F, 0F, 0.2F, -0.0999999999999993F, 0.4F, 0.2F, -0.0999999999999993F, 0.4F); // Box 86
		headModel[38].setRotationPoint(-4F, 5.9F, 0F);

		headModel[39].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.2F, 0F, 0.200000000000001F, 0.2F, 0F, 0.200000000000001F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 104
		headModel[39].setRotationPoint(-8F, 10F, -2F);

		headModel[40].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.4F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.35F, 0F, 0.35F, 0.25F, 0F, 0.35F, 0.2F, 0F, 0.200000000000001F, 0.2F, 0F, 0.200000000000001F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 105
		headModel[40].setRotationPoint(-8F, 8F, -2F);

		headModel[41].addShapeBox(0F, 0F, 0F, 4, 10, 4, 0F,0.100000000000001F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.0999999999999999F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 106
		headModel[41].setRotationPoint(-8F, 0F, -2F);

		headModel[42].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.3F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.2F, 0.3F, 0F, 0.45F); // Box 107
		headModel[42].setRotationPoint(-8F, 0F, -2F);

		headModel[43].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,0.100000000000001F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.0999999999999999F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 108
		headModel[43].setRotationPoint(-4F, 12F, -2F);

		headModel[44].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,0.100000000000001F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.0999999999999999F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 109
		headModel[44].setRotationPoint(0F, 12F, -2F);

		headModel[45].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0.100000000000001F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.0999999999999999F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 111
		headModel[45].setRotationPoint(-4F, 19F, -2F);

		headModel[46].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-0.149999999999999F, -1.25F, -0.15F, 0.1F, -1.25F, -0.15F, 0.1F, -0.75F, 0.0999999999999996F, 0.0999999999999999F, -0.75F, 0.1F, -0.15F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 112
		headModel[46].setRotationPoint(-4F, 22F, -3.2F);

		headModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0F, 0.35F, 0.25F, 0F, 0.35F, 0.25F, 0F, 0.3F, 0.2F, 0F, 0.35F); // Box 114
		headModel[47].setRotationPoint(-4F, 19F, -2F);

		headModel[48].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0.100000000000001F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.0999999999999999F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 115
		headModel[48].setRotationPoint(0F, 19F, -2F);

		headModel[49].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0.1F, -1.25F, -0.15F, -0.149999999999999F, -1.25F, -0.15F, 0.0999999999999999F, -0.75F, 0.1F, 0.1F, -0.75F, 0.0999999999999996F, 0.1F, 0F, 0.1F, -0.15F, 0F, 0.1F, 0.1F, 0F, 0.0999999999999996F, 0.1F, 0F, 0.0999999999999996F); // Box 116
		headModel[49].setRotationPoint(0F, 22F, -3.2F);

		headModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.2F, 0.1F, 0.2F, 0.25F, 0F, 0.35F, 0.2F, 0F, 0.35F, 0.2F, 0F, 0.35F, 0.25F, 0F, 0.3F); // Box 117
		headModel[50].setRotationPoint(0F, 19F, -2F);

		headModel[51].addShapeBox(0F, 0F, 0F, 8, 10, 2, 0F,0.100000000000001F, 0F, 0F, 0.0999999999999999F, 0F, 0F, 0.0999999999999999F, 0F, 0.2F, 0.0999999999999996F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 109
		headModel[51].setRotationPoint(-4F, 0F, 0F);
	}
}