//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RusMailedHelm
// Model Creator: 
// Created on: 06.04.2022 - 17:10:35
// Last changed on: 06.04.2022 - 17:10:35

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRusMailedHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelRusMailedHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[56];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 43
		headModel[1] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 44
		headModel[2] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 45
		headModel[3] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 46
		headModel[4] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 47
		headModel[5] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 48
		headModel[6] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 49
		headModel[7] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 50
		headModel[8] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 51
		headModel[9] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 52
		headModel[10] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 53
		headModel[11] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 54
		headModel[12] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 55
		headModel[13] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 56
		headModel[14] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 57
		headModel[15] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 58
		headModel[16] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 59
		headModel[17] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 62
		headModel[18] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 63
		headModel[19] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 64
		headModel[20] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 65
		headModel[21] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 67
		headModel[22] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 68
		headModel[23] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 69
		headModel[24] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 70
		headModel[25] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 71
		headModel[26] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 72
		headModel[27] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 73
		headModel[28] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 74
		headModel[29] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 75
		headModel[30] = new ModelRendererTurbo(this, 11, 25, textureX, textureY); // Box 76
		headModel[31] = new ModelRendererTurbo(this, 6, 24, textureX, textureY); // Box 78
		headModel[32] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 80
		headModel[33] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 81
		headModel[34] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 82
		headModel[35] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 89
		headModel[36] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 90
		headModel[37] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 91
		headModel[38] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 92
		headModel[39] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 93
		headModel[40] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 94
		headModel[41] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 95
		headModel[42] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 96
		headModel[43] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 97
		headModel[44] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 98
		headModel[45] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 99
		headModel[46] = new ModelRendererTurbo(this, 6, 24, textureX, textureY); // Box 100
		headModel[47] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 101
		headModel[48] = new ModelRendererTurbo(this, 9, 5, textureX, textureY); // Box 103
		headModel[49] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 108
		headModel[50] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 109
		headModel[51] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 110
		headModel[52] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 111
		headModel[53] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 112
		headModel[54] = new ModelRendererTurbo(this, 10, 24, textureX, textureY); // Box 113
		headModel[55] = new ModelRendererTurbo(this, 6, 24, textureX, textureY); // Box 57

		headModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.5F, 0F, 0.4F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.5F, 0F, 0.4F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 43
		headModel[0].setRotationPoint(-4F, -5.25F, -4F);

		headModel[1].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0.75F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, 0.5F, 0F, 0.5F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, 0.5F, 0F, 0.5F); // Box 44
		headModel[1].setRotationPoint(-4F, -5.25F, 0F);

		headModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 45
		headModel[2].setRotationPoint(-0.5F, -5.25F, -5F);

		headModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 46
		headModel[3].setRotationPoint(-1.5F, -5.25F, -5F);

		headModel[4].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.35F, 0F, 0.25F, -0.5F, 0F, 0.6F, 0F, 0F, 0F, 0.6F, 0F, -0.5F); // Box 47
		headModel[4].setRotationPoint(-4F, -8.25F, -4F);

		headModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-2.25F, -0.25F, -1.25F, 2F, 0F, -4F, 2F, 0F, 0F, -2F, 0F, -0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 1.75F, -0.25F, 0F, 0.25F, -0.25F, -0.5F); // Box 48
		headModel[5].setRotationPoint(-4F, -9.75F, -4F);

		headModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, -0.4F, 0F, 0F, -0.15F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 49
		headModel[6].setRotationPoint(-1.5F, -8.25F, -5F);

		headModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, -0.25F, -2.25F, 0.25F, -0.25F, -2F, 0.5F, 0F, 4F, -1.5F, 0F, 4F, 1F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 50
		headModel[7].setRotationPoint(-1.5F, -9.75F, -5F);

		headModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		headModel[8].setRotationPoint(-0.5F, -8.25F, -5F);

		headModel[9].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 52
		headModel[9].setRotationPoint(-0.5F, -9.75F, -5F);

		headModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.25F, -0.25F, -2F, 0.25F, -0.25F, -2.25F, -1.5F, 0F, 4F, 0.5F, 0F, 4F, 0F, -0.25F, -0.5F, 1F, -0.25F, -0.75F, 1F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 53
		headModel[10].setRotationPoint(0.5F, -9.75F, -5F);

		headModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0.25F, -0.25F, -1.25F, -2.25F, -0.25F, -1.25F, -2F, 0F, -0.25F, 2F, 0F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 1.75F, -0.25F, 0F); // Box 54
		headModel[11].setRotationPoint(2F, -9.75F, -4F);

		headModel[12].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, -0.5F, 1F, -0.25F, -0.75F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.15F, 1F, 0F, -0.4F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 55
		headModel[12].setRotationPoint(0.5F, -8.25F, -5F);

		headModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, 0F, 0.6F, 0.35F, 0F, 0.25F, 0.6F, 0F, -0.5F, 0F, 0F, 0F); // Box 56
		headModel[13].setRotationPoint(2F, -8.25F, -4F);

		headModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 57
		headModel[14].setRotationPoint(0.5F, -5.25F, -5F);

		headModel[15].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, 0.75F, 0.5F, 0F, 0.4F, 0.75F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.75F, 0.5F, 0F, 0.4F, 0.75F, 0F, -0.5F, 0F, 0F, 0F); // Box 58
		headModel[15].setRotationPoint(2F, -5.25F, -4F);

		headModel[16].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0.6F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0.6F, 0.35F, 0F, 0.25F); // Box 59
		headModel[16].setRotationPoint(-4F, -8.25F, 0F);

		headModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-2F, 0F, -0.25F, 2F, 0F, 0F, 0.25F, -0.25F, -1.25F, -2.25F, -0.25F, -1.25F, 0.25F, -0.25F, -0.5F, 1.75F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, -0.25F, 0F); // Box 62
		headModel[17].setRotationPoint(-4F, -9.75F, 0F);

		headModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1.5F, 0F, 4F, 0.5F, 0F, 4F, 0.25F, -0.25F, -2F, 0.25F, -0.25F, -2.25F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 1F, -0.25F, -0.75F); // Box 63
		headModel[18].setRotationPoint(-1.5F, -9.75F, 4F);

		headModel[19].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.5F, 0F, 4F, -1.5F, 0F, 4F, 0.25F, -0.25F, -2.25F, 0.25F, -0.25F, -2F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -0.75F, 0F, -0.25F, -0.5F); // Box 64
		headModel[19].setRotationPoint(0.5F, -9.75F, 4F);

		headModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 4F, -0.5F, 0F, 4F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 65
		headModel[20].setRotationPoint(-0.5F, -9.75F, 4F);

		headModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-3F, 0F, -0.25F, 4F, 0F, -0.5F, 4F, 0F, -0.5F, -3F, 0F, -0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 67
		headModel[21].setRotationPoint(-5F, -9.75F, -0.5F);

		headModel[22].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 68
		headModel[22].setRotationPoint(-4.75F, -5.25F, -0.5F);

		headModel[23].addShapeBox(0F, 0F, 0F, 0,75, 3, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0.09F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.09F, 0F); // Box 69
		headModel[23].setRotationPoint(-4.5F, -8.25F, -0.5F);

		headModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-1F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, -0.75F, -0.25F, 0.25F, -0.75F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 70
		headModel[24].setRotationPoint(-5.25F, -4.25F, -4.5F);

		headModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 4, 0F,-1F, -3.25F, -0.25F, 0.5F, -3.25F, -0.25F, 0.75F, -4F, 0F, -0.75F, -4F, 0F, -1F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.75F, 0F, 0F, -0.75F, 0F, 0F); // Box 71
		headModel[25].setRotationPoint(-5.25F, -4.25F, -4.5F);

		headModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0.25F, 0F, -0.75F, -1F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 72
		headModel[26].setRotationPoint(4.25F, -4.25F, -4.5F);

		headModel[27].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0.25F, 0.25F, -0.25F, -1F, 0.25F, -0.25F); // Box 73
		headModel[27].setRotationPoint(-5.25F, -4.25F, 0.5F);

		headModel[28].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 74
		headModel[28].setRotationPoint(-4.5F, -5F, -0.5F);

		headModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, -0.75F, -1.5F, 0.25F, -0.75F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.75F, 0.5F, -0.5F, 0.25F, -1.25F, 0.25F, 0.25F, -0.25F, 0F, 0F, 0F, 0.25F, 0.25F, 0.5F); // Box 75
		headModel[29].setRotationPoint(-5.5F, -1.25F, -4.5F);

		headModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0.25F, -1.25F, 0.25F, 0.25F, -0.25F, 0F, 0F, 0F, 0.25F, 0.25F, 0.5F, -0.75F, -0.75F, -1.5F, 0.5F, -0.25F, -1.25F, 1.25F, 1.25F, -1.75F, 0.25F, -1.25F, 0.5F); // Box 76
		headModel[30].setRotationPoint(-5.5F, 0.25F, -4.5F);

		headModel[31].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0.25F, 2.75F, 0.25F, 0F, 2.75F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 1.5F, 1F, -1F, 1.5F, 1F); // Box 78
		headModel[31].setRotationPoint(-4.25F, 0F, -4.25F);

		headModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, 0.5F, 0F, -0.5F, 0.5F, 0.25F, -0.75F, -0.5F, -0.75F, -0.75F, -1.5F, 0.25F, 0.25F, 0.5F, 0F, 0F, 0F, 0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -1.25F); // Box 80
		headModel[32].setRotationPoint(-5.5F, -1.25F, 0.5F);

		headModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, -0.75F, -0.5F, -0.75F, -0.75F, -1.5F, 0F, -0.75F, 0.5F, 0F, -0.5F, 0.5F, 0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -1.25F, 0.25F, 0.25F, 0.5F, 0F, 0F, 0F); // Box 81
		headModel[33].setRotationPoint(4.5F, -1.25F, -4.5F);

		headModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.5F, 0.5F, 0F, -0.75F, 0.5F, -0.75F, -0.75F, -1.5F, 0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0.25F, 0.25F, 0.5F, -0.5F, 0.25F, -1.25F, 0.25F, 0.25F, -0.25F); // Box 82
		headModel[34].setRotationPoint(4.5F, -1.25F, 0.5F);

		headModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,4F, 0F, -0.5F, -3F, 0F, -0.25F, -3F, 0F, -0.25F, 4F, 0F, -0.5F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 89
		headModel[35].setRotationPoint(4F, -9.75F, -0.5F);

		headModel[36].addShapeBox(0F, 0F, 0F, 0,75, 3, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.09F, 0F, 0F, 0.09F, 0F, 0F, 0F, 0F); // Box 90
		headModel[36].setRotationPoint(3.5F, -8.25F, -0.5F);

		headModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 4, 0F,-0.5F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0.25F, 0F, 0F, 0F, 0.6F, 0F, -0.5F, 0.35F, 0F, 0.25F, -0.5F, 0F, 0.6F); // Box 91
		headModel[37].setRotationPoint(2F, -8.25F, 0F);

		headModel[38].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.75F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.75F); // Box 92
		headModel[38].setRotationPoint(2F, -5.25F, 0F);

		headModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 93
		headModel[39].setRotationPoint(3.75F, -5.25F, -0.5F);

		headModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 1F, -0.25F, -0.75F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 1F, 0F, -0.4F); // Box 94
		headModel[40].setRotationPoint(-1.5F, -8.25F, 4F);

		headModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 95
		headModel[41].setRotationPoint(-0.5F, -8.25F, 4F);

		headModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.4F, 0F, 0F, -0.15F); // Box 96
		headModel[42].setRotationPoint(0.5F, -8.25F, 4F);

		headModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.25F); // Box 97
		headModel[43].setRotationPoint(-1.5F, -5.25F, 4F);

		headModel[44].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 98
		headModel[44].setRotationPoint(-0.5F, -5.25F, 4F);

		headModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, 0F); // Box 99
		headModel[45].setRotationPoint(0.5F, -5.25F, 4F);

		headModel[46].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0.25F, 0F, 2.75F, 0.75F, 0.25F, 2.75F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 1.5F, 1F, -0.5F, 1.5F, 1F, 0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 100
		headModel[46].setRotationPoint(-4.25F, 0F, 3.25F);

		headModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0.25F, 0.5F, 0F, 0F, 0F, 0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -1.25F, 0.25F, -1.25F, 0.5F, 1.25F, 1.25F, -1.75F, 0.5F, -0.25F, -0.75F, -0.75F, -0.75F, -1.5F); // Box 101
		headModel[47].setRotationPoint(-5.5F, 0.25F, 0.5F);

		headModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,2F, 0F, 0F, -2F, 0F, -0.25F, -2.25F, -0.25F, -1.25F, 0.25F, -0.25F, -1.25F, 1.75F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0.25F); // Box 103
		headModel[48].setRotationPoint(2F, -9.75F, 0F);

		headModel[49].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0.25F, 0F, -1F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F); // Box 108
		headModel[49].setRotationPoint(4.25F, -4.25F, 0.5F);

		headModel[50].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 109
		headModel[50].setRotationPoint(3.5F, -5F, -0.5F);

		headModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,2.5F, 1.5F, -2.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 2.5F, 1.5F, -2.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		headModel[51].setRotationPoint(-3.25F, 1.5F, -2.75F);

		headModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0.25F, 0.25F, -0.25F, -0.5F, 0.25F, -1.25F, 0.25F, 0.25F, 0.5F, 0F, 0F, 0F, 0.5F, -0.25F, -0.75F, -0.75F, -0.75F, -1.5F, 0.25F, -1.25F, 0.5F, 1.25F, 1.25F, -1.75F); // Box 111
		headModel[52].setRotationPoint(4.5F, 0.25F, -4.5F);

		headModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0.25F, 0.25F, 0.5F, -0.5F, 0.25F, -1.25F, 0.25F, 0.25F, -0.25F, 1.25F, 1.25F, -1.75F, 0.25F, -1.25F, 0.5F, -0.75F, -0.75F, -1.5F, 0.5F, -0.25F, -0.75F); // Box 112
		headModel[53].setRotationPoint(4.5F, 0.25F, 0.5F);

		headModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, 2.5F, 1.5F, -2.75F, 2.5F, 1.5F, -2.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		headModel[54].setRotationPoint(2.25F, 1.5F, -2.75F);

		headModel[55].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		headModel[55].setRotationPoint(-4F, -4F, 3.25F);
	}
}