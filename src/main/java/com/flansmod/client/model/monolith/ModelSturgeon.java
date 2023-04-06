//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Sturgeon
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSturgeon extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelSturgeon() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[57];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		bodyModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 38
		bodyModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 41
		bodyModel[5] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 44
		bodyModel[8] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 45
		bodyModel[9] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 46
		bodyModel[10] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 49
		bodyModel[11] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 50
		bodyModel[12] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 51
		bodyModel[13] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 52
		bodyModel[14] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 53
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[16] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 50
		bodyModel[17] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 51
		bodyModel[18] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 52
		bodyModel[19] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 53
		bodyModel[20] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 95
		bodyModel[21] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 96
		bodyModel[22] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 97
		bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 98
		bodyModel[24] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 99
		bodyModel[25] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 100
		bodyModel[26] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 101
		bodyModel[27] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 102
		bodyModel[28] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 103
		bodyModel[29] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 104
		bodyModel[30] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 62
		bodyModel[31] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 70
		bodyModel[32] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 58
		bodyModel[33] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 73
		bodyModel[34] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 74
		bodyModel[35] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 75
		bodyModel[36] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 76
		bodyModel[37] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 77
		bodyModel[38] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 81
		bodyModel[39] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 82
		bodyModel[40] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 83
		bodyModel[41] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 85
		bodyModel[42] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 87
		bodyModel[43] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 88
		bodyModel[44] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 89
		bodyModel[45] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 90
		bodyModel[46] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 91
		bodyModel[47] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 92
		bodyModel[48] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 93
		bodyModel[49] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 94
		bodyModel[50] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 95
		bodyModel[51] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 96
		bodyModel[52] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 97
		bodyModel[53] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 98
		bodyModel[54] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 99
		bodyModel[55] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 100
		bodyModel[56] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 101

		bodyModel[0].addShapeBox(0F, 0F, 0F, 38, 6, 16, 0F,0F, -0.5F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F); // Box 37
		bodyModel[0].setRotationPoint(-24F, -5F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 38, 5, 16, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.75F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -0.75F, -5F); // Box 38
		bodyModel[1].setRotationPoint(-24F, 6F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 38, 5, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 39
		bodyModel[2].setRotationPoint(-24F, 1F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 39, 5, 16, 0F,0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F); // Box 40
		bodyModel[3].setRotationPoint(14F, 1F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 39, 6, 16, 0F,0F, 0F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, 0F, -5F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.25F); // Box 41
		bodyModel[4].setRotationPoint(14F, -5F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 39, 5, 16, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.5F, -5F, 0F, -1.25F, -5F, 0F, -1.25F, -5F, 0F, -0.5F, -5F); // Box 42
		bodyModel[5].setRotationPoint(14F, 6F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 17, 5, 16, 0F,0F, 0.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, -2F, 0F, -2F, -5F, 0F, -0.75F, -5F, 0F, -0.75F, -5F, 0F, -2F, -5F); // Box 43
		bodyModel[6].setRotationPoint(-41F, 6F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 17, 5, 16, 0F,0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, -0.5F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -2F); // Box 44
		bodyModel[7].setRotationPoint(-41F, 1F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 6, 16, 0F,0F, -2F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, -2F, -5F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F); // Box 45
		bodyModel[8].setRotationPoint(-41F, -5F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 13, 4, 10, 0F,0F, 1.25F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 1.25F, -1F, 0F, -3.25F, -3.25F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -3.25F, -3.25F); // Box 46
		bodyModel[9].setRotationPoint(-54F, 6F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 13, 5, 10, 0F,0F, -1.5F, -1F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, -1.5F, -1F, 0F, -0.25F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.25F, -1F); // Box 49
		bodyModel[10].setRotationPoint(-54F, 0F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 4, 10, 0F,0F, -1F, -3.25F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, -3.25F, 0F, -0.5F, -1F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, -0.5F, -1F); // Box 50
		bodyModel[11].setRotationPoint(-54F, -2F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0.5F, 3F, 0F, 0.5F, 3F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.75F, 3F, 0F, 0.75F, 3F, 0.5F, 0F, 0F); // Box 51
		bodyModel[12].setRotationPoint(-68F, 2F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,-7.5F, -0.25F, 0F, 0F, 1F, 0.75F, 0F, 1F, 0.75F, -7.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0.5F, 0F, 0F); // Box 52
		bodyModel[13].setRotationPoint(-68F, 0F, -1F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 2, 2, 0F,0.5F, 0F, 0F, 0F, -0.75F, 3F, 0F, -0.75F, 3F, 0.5F, 0F, 0F, -7.5F, -0.25F, 0F, 0F, 0.75F, 0.75F, 0F, 0.75F, 0.75F, -7.5F, -0.25F, 0F); // Box 53
		bodyModel[14].setRotationPoint(-68F, 4F, -1F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F); // Box 49
		bodyModel[15].setRotationPoint(-72.5F, 2F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 50
		bodyModel[16].setRotationPoint(-70.75F, 3F, 0F);

		bodyModel[17].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 51
		bodyModel[17].setRotationPoint(-70.75F, 3F, 0F);

		bodyModel[18].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 52
		bodyModel[18].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[18].rotateAngleX = 0.87266463F;

		bodyModel[19].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 53
		bodyModel[19].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[19].rotateAngleX = 0.87266463F;

		bodyModel[20].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 95
		bodyModel[20].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[20].rotateAngleX = 1.74532925F;

		bodyModel[21].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 96
		bodyModel[21].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[21].rotateAngleX = 1.74532925F;

		bodyModel[22].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 97
		bodyModel[22].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[22].rotateAngleX = 2.70526034F;

		bodyModel[23].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 98
		bodyModel[23].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[23].rotateAngleX = 2.70526034F;

		bodyModel[24].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 99
		bodyModel[24].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[24].rotateAngleX = 4.45058959F;

		bodyModel[25].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 100
		bodyModel[25].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[25].rotateAngleX = 4.45058959F;

		bodyModel[26].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 101
		bodyModel[26].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[26].rotateAngleX = 3.4906585F;

		bodyModel[27].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 102
		bodyModel[27].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[27].rotateAngleX = 3.4906585F;

		bodyModel[28].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 103
		bodyModel[28].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[28].rotateAngleX = 5.32325422F;

		bodyModel[29].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 104
		bodyModel[29].setRotationPoint(-70.75F, 3F, 0F);
		bodyModel[29].rotateAngleX = 5.32325422F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 8, 1, 0F,0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 62
		bodyModel[30].setRotationPoint(-65.25F, -6.5F, -0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 8, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 70
		bodyModel[31].setRotationPoint(-65.25F, 3.5F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F,0F, -0.25F, 0F, -3.75F, -0.25F, 0F, 3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.75F, -0.25F, 0F, 3F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 58
		bodyModel[32].setRotationPoint(-66F, 2.5F, -11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F,0F, -0.25F, 0F, 3F, -0.25F, 0F, -3.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 3F, -0.25F, 0F, -3.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 73
		bodyModel[33].setRotationPoint(-66F, 2.5F, 0F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 74
		bodyModel[34].setRotationPoint(-66F, 0F, -11.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 75
		bodyModel[35].setRotationPoint(-66F, 3F, -11.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 76
		bodyModel[36].setRotationPoint(-66F, 0F, 10.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 77
		bodyModel[37].setRotationPoint(-66F, 3F, 10.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 10, 6, 16, 0F,0F, -1.25F, -5F, 0F, -3F, -5.25F, 0F, -3F, -5.25F, 0F, -1.25F, -5F, 0F, 0F, -1F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0F, -1F); // Box 81
		bodyModel[38].setRotationPoint(53F, -5F, -8F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,0F, 0F, -1F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -1.5F); // Box 82
		bodyModel[39].setRotationPoint(53F, 1F, -8F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 5, 16, 0F,0F, 0F, -1.5F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0F, -1.5F, 0F, -1.25F, -5F, 0F, -2.75F, -5.25F, 0F, -2.75F, -5.25F, 0F, -1.25F, -5F); // Box 83
		bodyModel[40].setRotationPoint(53F, 6F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 5, 4, 10, 0F,0F, 0.25F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, 0F, 0F); // Box 85
		bodyModel[41].setRotationPoint(63F, 1.5F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0.5F, -2.25F, 0F, -0.75F, -3.25F, 0F, -0.75F, -3.25F, 0F, 0.5F, -2.25F, 0F, -0.25F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.25F, 0.25F); // Box 87
		bodyModel[42].setRotationPoint(63F, -1.5F, -5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 3, 10, 0F,0F, 0F, 0F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0F, 0F, 0F, -0.25F, -2.25F, 0F, -1.75F, -3F, 0F, -1.75F, -3F, 0F, -0.25F, -2.25F); // Box 88
		bodyModel[43].setRotationPoint(63F, 5.5F, -5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0.75F, -1.25F, 0F, 1.25F, -2.75F, 0F, 1.25F, -2.75F, 0F, 0.75F, -1.25F, 0F, -1.75F, -3F, 0F, -3.25F, -4F, 0F, -3.25F, -4F, 0F, -1.75F, -3F); // Box 89
		bodyModel[44].setRotationPoint(68F, 5.5F, -5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, -1.25F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, 0F, -1.25F, 0F, -0.75F, -1.25F, 0F, -1.25F, -2.75F, 0F, -1.25F, -2.75F, 0F, -0.75F, -1.25F); // Box 90
		bodyModel[45].setRotationPoint(68F, 1.5F, -5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, -0.75F, -3.25F, 0F, -2.25F, -4F, 0F, -2.25F, -4F, 0F, -0.75F, -3.25F, 0F, 0F, -1.25F, 0F, 0.25F, -2.75F, 0F, 0.25F, -2.75F, 0F, 0F, -1.25F); // Box 91
		bodyModel[46].setRotationPoint(68F, -1.5F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, -0.25F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, 0F, -0.25F, 0.25F); // Box 92
		bodyModel[47].setRotationPoint(71F, 1.5F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.25F, -1F, -0.6F, -0.25F, -1.25F, -0.6F, -0.25F, -1.25F, 0F, 0.25F, -1F, 0F, -0.25F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.25F, 0.25F); // Box 93
		bodyModel[48].setRotationPoint(71F, 1F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.25F, 0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.25F, 0.25F, 0F, 0.25F, -1F, -0.5F, -0.25F, -1.25F, -0.5F, -0.25F, -1.25F, 0F, 0.25F, -1F); // Box 94
		bodyModel[49].setRotationPoint(71F, 4F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 8, 12, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[50].setRotationPoint(33F, -15.5F, -1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F); // Box 96
		bodyModel[51].setRotationPoint(41F, -15.5F, -1.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 97
		bodyModel[52].setRotationPoint(30F, -15.5F, -1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-1F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 98
		bodyModel[53].setRotationPoint(35F, -11.5F, -7.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 99
		bodyModel[54].setRotationPoint(35F, -11.5F, 1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[55].setRotationPoint(-41.5F, -5F, -2.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 101
		bodyModel[56].setRotationPoint(-41.5F, -5.75F, -2.5F);
	}
}