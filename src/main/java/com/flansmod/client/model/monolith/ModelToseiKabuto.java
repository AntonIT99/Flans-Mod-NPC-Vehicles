//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ToseiKabuto
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelToseiKabuto extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelToseiKabuto() //Same as Filename
	{
		headModel = new ModelRendererTurbo[49];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19
		headModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 56
		headModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 58
		headModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 84
		headModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 33
		headModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		headModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 35
		headModel[11] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 37
		headModel[12] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 38
		headModel[13] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 39
		headModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 100
		headModel[15] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 101
		headModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 104
		headModel[17] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 105
		headModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 116
		headModel[19] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 117
		headModel[20] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 46
		headModel[21] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 47
		headModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 48
		headModel[23] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 49
		headModel[24] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 50
		headModel[25] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 55
		headModel[26] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 56
		headModel[27] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 57
		headModel[28] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 58
		headModel[29] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 59
		headModel[30] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 60
		headModel[31] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 61
		headModel[32] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 62
		headModel[33] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 63
		headModel[34] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 64
		headModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 65
		headModel[36] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 66
		headModel[37] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 67
		headModel[38] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 68
		headModel[39] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 69
		headModel[40] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 70
		headModel[41] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 71
		headModel[42] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 72
		headModel[43] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 73
		headModel[44] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 74
		headModel[45] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 75
		headModel[46] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 76
		headModel[47] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 77
		headModel[48] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 78

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, -2F, -0.4F, -1.5F, -2F, -0.4F, -1.5F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 1, 2, 8, 0F,0.7F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.4F, 0.8F, 0F, -0.4F, 0.8F, 0F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3F, -6F, -4F, 1, 2, 8, 0F,0F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.4F, 0.8F, 0.7F, -0.4F, 0.8F, 0.7F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -6F, -4F, 6, 2, 8, 0F,0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.4F, 0.8F, 0.7F, -0.4F, 0.8F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 21
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.5F, -5F, 4, 1, 1, 0F,0.2F, 1.4F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1.5F, 0F, 0.2F, 1.4F, 0F, 0.5F, 0F, 1F, 0F, 0.2F, 2F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 56
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -4.5F, -2.5F, 8, 5, 1, 0F,0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.3F, -0.1F, 0.8F, 0.3F, -0.1F, 0.8F, 0.3F, -0.1F, -0.7F, 0.3F, -0.1F, -0.7F); // Box 58
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5.6F, -4.8F, -3.2F, 1, 1, 8, 0F,-0.5F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0.3F, 1F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.4F, -0.3F, 0.3F, 0.4F); // Box 84
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(0F, -5.5F, -5F, 4, 1, 1, 0F,0F, 1.5F, -0.5F, 0.2F, 1.4F, -0.5F, 0.2F, 1.4F, 0F, 0F, 1.5F, 0F, 0F, 0.2F, 2F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 33
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-6.1F, -5.3F, -5.2F, 1, 2, 1, 0F,0.5F, 0.5F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, 0.5F, 0.5F, -0.3F, 1.5F, -1F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 1.5F, -1F, -0.3F); // Box 20
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-6.1F, -5.3F, -5.2F, 1, 2, 1, 0F,-0.8F, -0.1F, -0.3F, 0.5F, -0.5F, -1.3F, 0.5F, -0.5F, 0.7F, -0.8F, -0.1F, -0.3F, -0.5F, 0F, -0.3F, -0.3F, 0.5F, -1.3F, -0.3F, 0.5F, 0.7F, -0.5F, 0F, -0.3F); // Box 35
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-6.1F, -3.8F, -3.2F, 1, 1, 8, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.4F, -0.5F, 0F, 0.4F, -0.3F, 0.3F, 1F, -0.2F, 0.3F, 1F, -0.2F, 0.3F, 0.8F, -0.3F, 0.3F, 0.8F); // Box 37
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-6.6F, -2.8F, -3.2F, 1, 1, 8, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.8F, -0.5F, 0F, 0.8F, -0.3F, 0.3F, 1F, -0.2F, 0.3F, 1F, -0.2F, 0.3F, 1.2F, -0.3F, 0.3F, 1.2F); // Box 38
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-7.1F, -1.8F, -3.2F, 1, 1, 9, 0F,-0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.2F, -0.5F, 0F, 0.2F, -0.5F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.8F, 0.8F, -0.5F, 0.8F, 0.8F); // Box 39
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-2F, 2.1F, -4.9F, 4, 1, 1, 0F,-0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, 2.1F, -4.9F, 2, 1, 1, 0F,-0.5F, 1F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, -0.5F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 101
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, 1F, -4.4F, 2, 1, 1, 0F,-1F, 1F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, -1F, 1F, 0F, -0.3F, -1F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.3F, -1F, 0F); // Box 104
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-2F, 1F, -4.4F, 4, 1, 1, 0F,-0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(2F, 2.1F, -4.9F, 2, 1, 1, 0F,0.5F, 0.5F, -0.5F, -0.5F, 1F, -0.5F, -0.5F, 1F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 116
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(2F, 1F, -4.4F, 2, 1, 1, 0F,0.5F, 0.5F, -0.5F, -1F, 1F, -0.5F, -1F, 1F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -0.3F, -0.3F, -1F, -0.3F, -0.3F, -1F, 0F, 0F, 0F, 0F); // Box 117
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(0F, -1F, -4.2F, 3, 1, 1, 0F,0F, 0.1F, 0.2F, 0.1F, -0.2F, 0F, 0.1F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0F); // Box 46
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(3F, -3F, -4.2F, 1, 3, 1, 0F,-0.2F, -0.5F, 0F, 0.3F, 0.1F, 0F, 0.3F, 0.5F, 1F, -0.2F, -0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 47
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-3F, -1F, -4.2F, 3, 1, 1, 0F,0.1F, -0.2F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0F, 0.1F, -0.2F, 0F, 0F, 0.1F, 0F, 0F, 0.2F, 0.1F, 0F, 0.2F, 0F, 0F, 0.1F, 0F); // Box 48
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4F, -3F, -4.2F, 1, 3, 1, 0F,0.3F, 0.1F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, 0.3F, 0.5F, 1F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 49
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-5.6F, -4.5F, 4F, 1, 4, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 1.1F, -0.5F, -0.7F, -1F, -0.5F, -0.7F, -1F, -0.5F, 0.3F, 1.1F, -0.5F, 0.3F); // Box 50
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-5F, -4.9F, 4.3F, 10, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.1F); // Box 55
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-5F, -3.9F, 4.8F, 10, 1, 1, 0F,0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0.3F, -0.1F, 0.3F, 0.3F, -0.1F); // Box 56
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5.5F, -2.9F, 5.3F, 11, 1, 1, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.3F, -0.3F, 0.2F, 0.3F, -0.3F, 0.2F, 0.3F, -0.1F, 0.2F, 0.3F, -0.1F); // Box 57
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-6F, -1.9F, 5.8F, 12, 1, 1, 0F,0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.9F, -0.3F, 0.2F, 0.9F, -0.3F, 0.2F, 0.9F, -0.1F, 0.2F, 0.9F, -0.1F); // Box 58
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-0.5F, -5F, 5.3F, 1, 4, 1, 0F,-0.2F, -0.3F, 0.5F, -0.2F, -0.3F, 0.5F, -0.2F, -0.3F, -1.3F, -0.2F, -0.3F, -1.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0.3F, -0.3F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 59
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(3.5F, -5F, 5.3F, 1, 4, 1, 0F,0F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, -0.7F, 0.3F, -0.3F, 0.3F, 0.3F, -0.3F, 0.3F, 0F, 0.4F, -0.7F, 0F, 0.4F); // Box 60
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(6.1F, -1.8F, -3.2F, 1, 1, 9, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 1F, -0.5F, 0.5F, 1F, -0.5F, 0.8F, 0.8F, 0F, 0.8F, 0.8F); // Box 61
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(5.6F, -2.8F, -3.2F, 1, 1, 8, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.8F, 0F, 0F, 0.8F, -0.2F, 0.3F, 1F, -0.3F, 0.3F, 1F, -0.3F, 0.3F, 1.2F, -0.2F, 0.3F, 1.2F); // Box 62
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(5.1F, -3.8F, -3.2F, 1, 1, 8, 0F,0F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0.4F, 0F, 0F, 0.4F, -0.2F, 0.3F, 1F, -0.3F, 0.3F, 1F, -0.3F, 0.3F, 0.8F, -0.2F, 0.3F, 0.8F); // Box 63
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(4.6F, -4.8F, -3.2F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.3F, 0F, -0.3F, 0.3F, 1F, -0.3F, 0.3F, 0.4F, -0.2F, 0.3F, 0.4F); // Box 64
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(5.1F, -5.3F, -5.2F, 1, 2, 1, 0F,-0.2F, -0.1F, -0.3F, 0.5F, 0.5F, -0.3F, 0.5F, 0.5F, -0.3F, -0.2F, -0.1F, -0.3F, -0.5F, 0F, -0.3F, 1.5F, -1F, -0.3F, 1.5F, -1F, -0.3F, -0.5F, 0F, -0.3F); // Box 65
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(5.1F, -5.3F, -5.2F, 1, 2, 1, 0F,0.5F, -0.5F, -1.3F, -0.8F, -0.1F, -0.3F, -0.8F, -0.1F, -0.3F, 0.5F, -0.5F, 0.7F, -0.3F, 0.5F, -1.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.3F, 0.5F, 0.7F); // Box 66
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-4.5F, -5F, 5.3F, 1, 4, 1, 0F,-0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -1.3F, -0.4F, -0.3F, -1.3F, 0.3F, 0.3F, -0.3F, -0.7F, 0.3F, -0.3F, -0.7F, 0F, 0.4F, 0.3F, 0F, 0.4F); // Box 67
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-2.5F, -5F, 5.3F, 1, 4, 1, 0F,-0.4F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -1.3F, -0.4F, -0.3F, -1.3F, 0.1F, 0.3F, -0.3F, -0.5F, 0.3F, -0.3F, -0.5F, 0F, 0.4F, 0.1F, 0F, 0.4F); // Box 68
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(1.5F, -5F, 5.3F, 1, 4, 1, 0F,0F, -0.3F, 0.5F, -0.4F, -0.3F, 0.5F, -0.4F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, -0.5F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, 0.4F, -0.5F, 0F, 0.4F); // Box 69
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-5.6F, -4.5F, -2F, 1, 4, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 1.1F, -0.5F, -0.7F, -1F, -0.5F, -0.7F, -1F, -0.5F, 0.3F, 1.1F, -0.5F, 0.3F); // Box 70
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-5.6F, -4.5F, 2F, 1, 4, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 1.1F, -0.5F, -0.7F, -1F, -0.5F, -0.7F, -1F, -0.5F, 0.3F, 1.1F, -0.5F, 0.3F); // Box 71
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-5.6F, -4.5F, 2.22044604925031E-16F, 1, 4, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 1.1F, -0.5F, -0.7F, -1F, -0.5F, -0.7F, -1F, -0.5F, 0.3F, 1.1F, -0.5F, 0.3F); // Box 72
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-5.6F, -4.5F, -4F, 1, 4, 1, 0F,-0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, 1.1F, -0.5F, -0.7F, -1F, -0.5F, -0.7F, -1F, -0.5F, 0.3F, 1.1F, -0.5F, 0.3F); // Box 73
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(4.6F, -4.5F, -4F, 1, 4, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, -0.5F, -0.7F, 1.1F, -0.5F, -0.7F, 1.1F, -0.5F, 0.3F, -1F, -0.5F, 0.3F); // Box 74
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(4.6F, -4.5F, -2F, 1, 4, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, -0.5F, -0.7F, 1.1F, -0.5F, -0.7F, 1.1F, -0.5F, 0.3F, -1F, -0.5F, 0.3F); // Box 75
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(4.6F, -4.5F, 0F, 1, 4, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, -0.5F, -0.7F, 1.1F, -0.5F, -0.7F, 1.1F, -0.5F, 0.3F, -1F, -0.5F, 0.3F); // Box 76
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(4.6F, -4.5F, 2F, 1, 4, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, -0.5F, -0.7F, 1.1F, -0.5F, -0.7F, 1.1F, -0.5F, 0.3F, -1F, -0.5F, 0.3F); // Box 77
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(4.6F, -4.5F, 4F, 1, 4, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, -0.5F, -0.7F, 1.1F, -0.5F, -0.7F, 1.1F, -0.5F, 0.3F, -1F, -0.5F, 0.3F); // Box 78
		headModel[48].setRotationPoint(0F, 0F, 0F);
	}
}