//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: torricelli
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTorricelli extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelTorricelli() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[61];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 355
		bodyModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 43
		bodyModel[35] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 44
		bodyModel[36] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 45
		bodyModel[37] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 46
		bodyModel[38] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 56
		bodyModel[48] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 57
		bodyModel[49] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 58
		bodyModel[50] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 59
		bodyModel[51] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 60
		bodyModel[52] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 61
		bodyModel[53] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 62
		bodyModel[54] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 63
		bodyModel[55] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 64
		bodyModel[56] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 66
		bodyModel[58] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 67
		bodyModel[59] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 51
		bodyModel[60] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 52

		bodyModel[0].addShapeBox(0F, 0F, 0F, 84, 5, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 355
		bodyModel[0].setRotationPoint(-48F, -1.5F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 82, 5, 8, 0F,2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, -7F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -2F); // Box 1
		bodyModel[1].setRotationPoint(-46F, 9.5F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 21, 5, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -3.5F, 0.5F, 0F, -3.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -3.2F); // Box 2
		bodyModel[2].setRotationPoint(-69F, -1.5F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 21, 4, 8, 0F,0.5F, 0F, -3.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -3.2F, -1F, -1F, -3.2F, 0F, 2F, -0.2F, 0F, 2F, -0.2F, -1F, -1F, -3.2F); // Box 3
		bodyModel[3].setRotationPoint(-69F, 3.5F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 14, 5, 8, 0F,0F, 0F, -0.2F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F); // Box 4
		bodyModel[4].setRotationPoint(36F, -1.5F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 14, 5, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F, 0F, 0F, -2F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, 0F, -2F); // Box 5
		bodyModel[5].setRotationPoint(36F, 9.5F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 84, 6, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 6
		bodyModel[6].setRotationPoint(-48F, 3.5F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 6, 8, 0F,0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.2F); // Box 7
		bodyModel[7].setRotationPoint(36F, 3.5F, -4F);

		bodyModel[8].addShapeBox(0F, -1F, 0F, 42, 6, 6, 0F,0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 8
		bodyModel[8].setRotationPoint(-21F, 3.5F, -9F);

		bodyModel[9].addShapeBox(0F, -1F, 0F, 25, 6, 6, 0F,-16F, -1F, -1.5F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.7F, -16F, -1F, -1.5F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.7F); // Box 9
		bodyModel[9].setRotationPoint(-46F, 3.5F, -9F);

		bodyModel[10].addShapeBox(0F, -1F, 0F, 26, 6, 6, 0F,0F, -1F, -0.2F, -16F, -1F, -1.5F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, -16F, -1F, -1.5F, -5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 10
		bodyModel[10].setRotationPoint(21F, 3.5F, -9F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 17, 6, 8, 0F,0F, 0F, -0.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -10F, 0F, -3F, -10F, 0F, -3F, 0F, 0F, -1F); // Box 11
		bodyModel[11].setRotationPoint(50F, 3.5F, -4F);

		bodyModel[12].addShapeBox(0F, -1F, 0F, 42, 3, 6, 0F,0F, -1F, -2.2F, 0F, -1F, -2.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 12
		bodyModel[12].setRotationPoint(-21F, 0.5F, -9F);

		bodyModel[13].addShapeBox(0F, -1F, 0F, 25, 3, 6, 0F,-18F, -1F, -2.7F, 0F, -1F, -2.2F, 0F, 0.8F, -0.2F, -7F, -1F, -0.7F, -16F, 1F, -1.5F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 1F, 0F, -0.7F); // Box 13
		bodyModel[13].setRotationPoint(-46F, 0.5F, -9F);

		bodyModel[14].addShapeBox(0F, -1F, 0F, 26, 3, 6, 0F,0F, -1F, -2.2F, -20F, -1F, -2.7F, -9F, -1.5F, -0.7F, 0F, 0.8F, -0.2F, 0F, 1F, -0.2F, -16F, 1F, -1.5F, 1F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 14
		bodyModel[14].setRotationPoint(21F, 0.5F, -9F);

		bodyModel[15].addShapeBox(0F, -1F, 0F, 42, 4, 6, 0F,0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -2.2F, 0F, -1F, -2.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 15
		bodyModel[15].setRotationPoint(-21F, 9.5F, -9F);

		bodyModel[16].addShapeBox(0F, -1F, 0F, 25, 4, 6, 0F,-16F, 1F, -1.5F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, -3F, 0F, -0.7F, -18F, -1F, -2.7F, 0F, -1F, -2.2F, 0F, 0F, 0.5F, -9F, -1F, 0.5F); // Box 16
		bodyModel[16].setRotationPoint(-46F, 9.5F, -9F);

		bodyModel[17].addShapeBox(0F, -1F, 0F, 26, 4, 6, 0F,0F, 1F, -0.2F, -16F, 1F, -1.5F, -5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -2.2F, -18F, -1.5F, -2.7F, -11F, -1F, 0.5F, 0F, 0F, 0.5F); // Box 17
		bodyModel[17].setRotationPoint(21F, 9.5F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-52F, 10.5F, -4.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-64F, 9F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-64F, 8F, -0.5F);

		bodyModel[21].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-52F, 11F, -4F);

		bodyModel[22].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-52F, 11F, -4F);
		bodyModel[22].rotateAngleX = 2.0943951F;

		bodyModel[23].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-52F, 11F, -4F);
		bodyModel[23].rotateAngleX = 4.1887902F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 24
		bodyModel[24].setRotationPoint(-58F, 10.5F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, -2.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, -2.2F, 0F, -0.2F, -0.2F); // Box 25
		bodyModel[25].setRotationPoint(-56F, 10.5F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, 1.8F, 0F, -0.2F, -1F, 0F, -0.2F, 1.5F, 0F, -0.2F, -2.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, -1F, 0F, -0.2F, 1.5F, 0F, -0.2F, -2.2F); // Box 26
		bodyModel[26].setRotationPoint(-51F, 10.5F, -6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 22, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-52F, 10.5F, 3.5F);

		bodyModel[28].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(-52F, 11F, 4F);

		bodyModel[29].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(-52F, 11F, 4F);
		bodyModel[29].rotateAngleX = 2.0943951F;

		bodyModel[30].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-52F, 11F, 4F);
		bodyModel[30].rotateAngleX = 4.1887902F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-58F, 10.5F, 2.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -2.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -2.2F, 0F, -0.2F, 1.8F, 0F, -0.2F, -0.2F); // Box 32
		bodyModel[32].setRotationPoint(-56F, 10.5F, 5.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -2.2F, 0F, -0.2F, 1.5F, 0F, -0.2F, -1F, 0F, -0.2F, 1.8F, 0F, -0.2F, -2.2F, 0F, -0.2F, 1.5F, 0F, -0.2F, -1F, 0F, -0.2F, 1.8F); // Box 33
		bodyModel[33].setRotationPoint(-51F, 10.5F, 5.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 18, 8, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.5F); // Box 43
		bodyModel[34].setRotationPoint(-17F, -9F, -3.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 3.5F, 0F, -2.2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 3.5F, 0F, -2.2F); // Box 44
		bodyModel[35].setRotationPoint(-18F, -9F, -3.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 8, 8, 0F,0F, 0F, -0.7F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0.5F, 0F, -2.2F, 0.5F, 0F, -2.2F, 0F, 0F, -0.7F); // Box 45
		bodyModel[36].setRotationPoint(1F, -9F, -4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 46
		bodyModel[37].setRotationPoint(-3.5F, -21F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 47
		bodyModel[38].setRotationPoint(-1.5F, -21F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 17, 5, 8, 0F,0F, 0F, -0.9F, 2.5F, 0F, -3.5F, 2.5F, 0F, -3.5F, 0F, 0F, -0.9F, 0F, 0F, -0.5F, 0.5F, 0F, -3.5F, 0.5F, 0F, -3.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[39].setRotationPoint(50F, -1.5F, -4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 17, 1, 8, 0F,0F, 0.5F, -1F, -1F, 0.8F, -3.8F, -1F, 0.8F, -3.8F, 0F, 0.5F, -1F, 0F, 0F, -0.9F, 2.5F, 0F, -3.5F, 2.5F, 0F, -3.5F, 0F, 0F, -0.9F); // Box 49
		bodyModel[40].setRotationPoint(50F, -2.5F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, -2F, -1F, -1.8F, -2F, -1F, -1.8F, 0F, 0.5F, -1.5F); // Box 50
		bodyModel[41].setRotationPoint(50F, 9.5F, -3F);

		bodyModel[42].addShapeBox(0F, -1F, 0F, 42, 6, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F); // Box 51
		bodyModel[42].setRotationPoint(-21F, 3.5F, 3F);

		bodyModel[43].addShapeBox(0F, -1F, 0F, 25, 6, 6, 0F,1F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, -16F, -1F, -1.5F, -3F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, -16F, -1F, -1.5F); // Box 52
		bodyModel[43].setRotationPoint(-46F, 3.5F, 3F);

		bodyModel[44].addShapeBox(0F, -1F, 0F, 26, 6, 6, 0F,0F, 0F, -0.2F, 1F, 0F, -0.2F, -16F, -1F, -1.5F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, -5F, 0F, -0.2F, -16F, -1F, -1.5F, 0F, -1F, -0.2F); // Box 53
		bodyModel[44].setRotationPoint(21F, 3.5F, 3F);

		bodyModel[45].addShapeBox(0F, -1F, 0F, 42, 3, 6, 0F,0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1F, -2.2F, 0F, -1F, -2.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F); // Box 54
		bodyModel[45].setRotationPoint(-21F, 0.5F, 3F);

		bodyModel[46].addShapeBox(0F, -1F, 0F, 25, 3, 6, 0F,-7F, -1F, -0.7F, 0F, 0.8F, -0.2F, 0F, -1F, -2.2F, -18F, -1F, -2.7F, 1F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, -16F, 1F, -1.5F); // Box 55
		bodyModel[46].setRotationPoint(-46F, 0.5F, 3F);

		bodyModel[47].addShapeBox(0F, -1F, 0F, 26, 3, 6, 0F,0F, 0.8F, -0.2F, -9F, -1.5F, -0.7F, -20F, -1F, -2.7F, 0F, -1F, -2.2F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, -16F, 1F, -1.5F, 0F, 1F, -0.2F); // Box 56
		bodyModel[47].setRotationPoint(21F, 0.5F, 3F);

		bodyModel[48].addShapeBox(0F, -1F, 0F, 42, 4, 6, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2.2F, 0F, -1F, -2.2F); // Box 57
		bodyModel[48].setRotationPoint(-21F, 9.5F, 3F);

		bodyModel[49].addShapeBox(0F, -1F, 0F, 25, 4, 6, 0F,-3F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, -16F, 1F, -1.5F, -9F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, -2.2F, -18F, -1F, -2.7F); // Box 58
		bodyModel[49].setRotationPoint(-46F, 9.5F, 3F);

		bodyModel[50].addShapeBox(0F, -1F, 0F, 26, 4, 6, 0F,0F, 0F, -0.2F, -5F, 0F, -0.2F, -16F, 1F, -1.5F, 0F, 1F, -0.2F, 0F, 0F, 0.5F, -11F, -1F, 0.5F, -18F, -1.5F, -2.7F, 0F, -1F, -2.2F); // Box 59
		bodyModel[50].setRotationPoint(21F, 9.5F, 3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 60
		bodyModel[51].setRotationPoint(-16F, -10.5F, -0.5F);
		bodyModel[51].rotateAngleZ = -0.08726646F;

		bodyModel[52].addShapeBox(-5F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 61
		bodyModel[52].setRotationPoint(-16F, -10.5F, -0.5F);
		bodyModel[52].rotateAngleZ = -0.08726646F;

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 62
		bodyModel[53].setRotationPoint(-7.5F, -12F, -3F);
		bodyModel[53].rotateAngleZ = -0.36651914F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 63
		bodyModel[54].setRotationPoint(-7.5F, -12F, 2F);
		bodyModel[54].rotateAngleZ = -0.36651914F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[55].setRotationPoint(45F, -1.5F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[56].setRotationPoint(47F, -1.5F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 66
		bodyModel[57].setRotationPoint(45F, -1.5F, 3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[58].setRotationPoint(47F, -1.5F, 3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 51
		bodyModel[59].setRotationPoint(-69F, -9F, -0.5F);
		bodyModel[59].rotateAngleZ = 0.08726646F;

		bodyModel[60].addShapeBox(-10F, -3F, 0F, 15, 11, 1, 0F,-4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F); // Box 52
		bodyModel[60].setRotationPoint(-69F, -9F, -0.5F);
		bodyModel[60].rotateAngleZ = 0.08726646F;
	}
}