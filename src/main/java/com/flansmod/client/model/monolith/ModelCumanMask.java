//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CumanMask
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCumanMask extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelCumanMask() //Same as Filename
	{
		headModel = new ModelRendererTurbo[60];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 28
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		headModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 21
		headModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 22
		headModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 23
		headModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 24
		headModel[9] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 25
		headModel[10] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 26
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
		headModel[12] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 28
		headModel[13] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 29
		headModel[14] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 30
		headModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 31
		headModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 32
		headModel[17] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 33
		headModel[18] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 34
		headModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 35
		headModel[20] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 36
		headModel[21] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 37
		headModel[22] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 38
		headModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39
		headModel[24] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 45
		headModel[25] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 48
		headModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		headModel[27] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 50
		headModel[28] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 51
		headModel[29] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 52
		headModel[30] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 53
		headModel[31] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 54
		headModel[32] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 55
		headModel[33] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 56
		headModel[34] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box24
		headModel[35] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box31
		headModel[36] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box32
		headModel[37] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import Box33
		headModel[38] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box45
		headModel[39] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Import Box46
		headModel[40] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 30
		headModel[41] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 36
		headModel[42] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 37
		headModel[43] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 22
		headModel[44] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 30
		headModel[45] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 34
		headModel[46] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Import Box34
		headModel[47] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Import Box35
		headModel[48] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 54
		headModel[49] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 55
		headModel[50] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 56
		headModel[51] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 57
		headModel[52] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 58
		headModel[53] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 59
		headModel[54] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 60
		headModel[55] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 61
		headModel[56] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 62
		headModel[57] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 63
		headModel[58] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 64
		headModel[59] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 65

		headModel[0].addShapeBox(-4F, -10F, -4F, 8, 3, 8, 0F,-1F, 0.3F, -1F, -1F, 0.3F, -1F, -1F, 0.2F, -1F, -1F, 0.2F, -1F, 0.8F, -0.5F, 0.8F, 0.8F, -0.5F, 0.8F, 0.8F, -0.3F, 0.9F, 0.8F, -0.3F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7.5F, -4F, 8, 3, 8, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, -0.2F, 0.9F, 0.8F, -0.2F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0.6F, 0.9F, 0.9F, 0.6F, 0.9F); // Box 28
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -13.3F, -4F, 8, 1, 8, 0F,-3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -1F, 2F, -1F, -1F, 2F, -1F, -1F, 2.1F, -1F, -1F, 2.1F, -1F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -15F, -0.5F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F); // Box 49
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -17F, -0.5F, 1, 1, 1, 0F,-0.45F, 1F, -0.45F, -0.45F, 1F, -0.45F, -0.45F, 1F, -0.45F, -0.45F, 1F, -0.45F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F); // Box 44
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3F, -5F, -5.2F, 2, 1, 1, 0F,0.4F, -0.4F, 0.5F, 0.2F, -0.2F, 0.5F, 0.2F, -0.2F, 0F, 0.4F, -0.4F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F); // Box 21
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -5F, -5.2F, 2, 1, 1, 0F,-0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 22
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-1F, -3F, -5.5F, 2, 1, 1, 0F,-0.6F, -0.5F, 0.3F, -0.6F, -0.5F, 0.3F, -0.6F, -0.5F, 0F, -0.6F, -0.5F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1F, -4F, -5.2F, 2, 2, 1, 0F,-0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, 0F, 0.3F, -0.6F, -0.2F, 0.6F, -0.6F, -0.2F, 0.6F, -0.6F, -0.2F, 0.3F, -0.6F, -0.2F, 0.3F); // Box 24
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1F, -2F, -5.2F, 2, 1, 1, 0F,-0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 25
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-2F, -2F, -5.2F, 1, 1, 1, 0F,0.2F, -0.5F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0F, 0.2F, -0.5F, 0F, 0.1F, 0.2F, 0.7F, 0F, -0.2F, 0.7F, 0F, -0.2F, 0F, 0.1F, 0.2F, 0F); // Box 26
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-3.2F, -2F, -5.2F, 1, 1, 1, 0F,0.4F, 0F, 0.3F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.4F, 0F, 0F, 0F, -0.2F, 0.5F, 0.1F, 0.2F, 0.7F, 0.1F, 0.2F, 0F, 0F, -0.2F, 0F); // Box 27
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -3F, -5.2F, 1, 1, 1, 0F,0F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0.3F, 0F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.3F, 0F, 0F); // Box 28
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-2F, -3F, -5.2F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.2F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0.5F, 0F); // Box 29
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -5F, -5.2F, 1, 1, 1, 0F,0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F); // Box 30
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -4F, -5.2F, 1, 1, 1, 0F,0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F); // Box 31
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -4F, -5.2F, 1, 1, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F); // Box 32
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -2F, -5.2F, 8, 2, 1, 0F,0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 33
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-3F, 0F, -5.2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 34
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-3F, -6F, -5.2F, 2, 1, 1, 0F,0.7F, -0.7F, 0.6F, -0.2F, -0.4F, 0.6F, -0.2F, -0.4F, 0F, 0.7F, -0.7F, 0F, 0.4F, 0.4F, 0.6F, 0.2F, 0.2F, 0.6F, 0.2F, 0.2F, 0F, 0.4F, 0.4F, 0F); // Box 35
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1F, -6F, -5.2F, 1, 1, 1, 0F,0.2F, -0.4F, 0.6F, -0.4F, -0.5F, 0.6F, -0.4F, -0.5F, 0F, 0.2F, -0.4F, 0F, -0.2F, 0.2F, 0.6F, -0.2F, 0.3F, 0.6F, -0.2F, 0.3F, 0F, -0.2F, 0.2F, 0F); // Box 36
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4F, -6.5F, -5.2F, 4, 2, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.1F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, 0F, 0F, 0.1F, 0F, 0F); // Box 37
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-1F, -0.9F, -5.5F, 2, 1, 1, 0F,-0.2F, 0.2F, 0.5F, -0.2F, 0.2F, 0.5F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.4F, -0.5F, 0.3F, -0.4F, -0.5F, 0.3F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F); // Box 38
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-0.5F, -7F, -5.8F, 1, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 39
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-5F, -5F, -5.2F, 1, 1, 1, 0F,-0.2F, -0.3F, 0.2F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.2F, -0.3F, 0F, -0.3F, 1F, 0.2F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.3F, 1F, 0F); // Box 45
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(1F, -2F, -5.2F, 1, 1, 1, 0F,0.4F, 0F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0F, 0.4F, 0F, 0F, 0F, -0.2F, 0.7F, 0.1F, 0.2F, 0.7F, 0.1F, 0.2F, 0F, 0F, -0.2F, 0F); // Box 48
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(2.2F, -2F, -5.2F, 1, 1, 1, 0F,0F, -0.5F, 0.5F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0F, 0F, -0.5F, 0F, 0.1F, 0.2F, 0.7F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0.1F, 0.2F, 0F); // Box 49
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(1F, -3F, -5.2F, 1, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.3F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.3F, 0F, 0F); // Box 50
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(3F, -3F, -5.2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F, 0.8F, 0.5F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.8F, 0.5F, 0F); // Box 51
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(3F, -5F, -5.2F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F); // Box 52
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(1F, -5F, -5.2F, 2, 1, 1, 0F,0.2F, -0.2F, 0.5F, 0.4F, -0.4F, 0.5F, 0.4F, -0.4F, 0F, 0.2F, -0.2F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F); // Box 53
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(1F, -6F, -5.2F, 2, 1, 1, 0F,-0.2F, -0.4F, 0.6F, 0.7F, -0.7F, 0.6F, 0.7F, -0.7F, 0F, -0.2F, -0.4F, 0F, 0.2F, 0.2F, 0.6F, 0.4F, 0.4F, 0.6F, 0.4F, 0.4F, 0F, 0.2F, 0.2F, 0F); // Box 54
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(0F, -6F, -5.2F, 1, 1, 1, 0F,-0.4F, -0.5F, 0.6F, 0.2F, -0.4F, 0.6F, 0.2F, -0.4F, 0F, -0.4F, -0.5F, 0F, -0.2F, 0.3F, 0.6F, -0.2F, 0.2F, 0.6F, -0.2F, 0.2F, 0F, -0.2F, 0.3F, 0F); // Box 55
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(0F, -6.5F, -5.2F, 4, 2, 1, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.3F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F); // Box 56
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-5.4F, -4F, -5F, 1, 3, 10, 0F,-0.4F, 0.5F, -1F, -0.4F, 0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box24
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-5.4F, -1F, -2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Import Box31
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-5.4F, -1F, -5F, 1, 1, 3, 0F,-0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Import Box32
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-5.4F, -1F, 2F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box33
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-5.4F, 0F, 1.9F, 1, 1, 3, 0F,1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Import Box45
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-5.4F, 1.3F, 1.9F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F); // Import Box46
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-3F, 1.3F, -5.6F, 6, 3, 1, 0F,0F, 1F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 30
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-5.4F, 0F, -4F, 1, 1, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 36
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-5.4F, 1.3F, -4F, 1, 3, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F); // Box 37
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-5F, -4.5F, -4.6F, 2, 4, 1, 0F,0F, 0F, -0.4F, -0.8F, 0F, 0.4F, -0.8F, 0F, -1.2F, 0F, 0F, -0.4F, 0F, 0.5F, -0.4F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, -1F, 0F, 0.5F, -0.4F); // Box 22
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-5F, 0.5F, -4.6F, 2, 1, 1, 0F,0F, 0.5F, -0.4F, 0.4F, 0.5F, 0.2F, 0.4F, 0.5F, -1F, 0F, 0.5F, -0.4F, 0F, -0.2F, -0.4F, 0F, -1.2F, 0.2F, 0.5F, -1.2F, -0.8F, 0F, -0.2F, -0.4F); // Box 30
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-5F, 1.29F, -5.6F, 2, 3, 1, 0F,0F, 0F, -1.4F, 0F, 1F, -0.8F, 0F, 1F, 0F, 0F, 0F, 0.59F, -1.9F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, 0.6F, -1.9F, 0F, 0.6F); // Box 34
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-5F, -4F, 4.5F, 10, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Import Box34
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-5F, 1.3F, 4.5F, 10, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Import Box35
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(4F, -5F, -5.2F, 1, 1, 1, 0F,-0.1F, -0.5F, 0F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0F, -0.1F, -0.5F, 0F, 0F, 0.7F, 0F, -0.3F, 1F, 0.2F, -0.3F, 1F, 0F, 0F, 0.7F, 0F); // Box 54
		headModel[48].setRotationPoint(0F, 0F, 0F);

		headModel[49].addShapeBox(3F, -4.5F, -4.6F, 2, 4, 1, 0F,-0.8F, 0F, 0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -1.2F, 0.4F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0.4F, 0.5F, -1F); // Box 55
		headModel[49].setRotationPoint(0F, 0F, 0F);

		headModel[50].addShapeBox(3F, 0.5F, -4.6F, 2, 1, 1, 0F,0.4F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0.4F, 0.5F, -1F, 0F, -1.2F, 0.2F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.5F, -1.2F, -0.8F); // Box 56
		headModel[50].setRotationPoint(0F, 0F, 0F);

		headModel[51].addShapeBox(3F, 1.29F, -5.6F, 2, 3, 1, 0F,0F, 1F, -0.8F, 0F, 0F, -1.4F, 0F, 0F, 0.59F, 0F, 1F, 0F, 0F, 0F, -1.4F, -1.9F, 0F, -1.4F, -1.9F, 0F, 0.6F, 0F, 0F, 0.6F); // Box 57
		headModel[51].setRotationPoint(0F, 0F, 0F);

		headModel[52].addShapeBox(4.4F, -4F, -5F, 1, 3, 10, 0F,-0.4F, 0.5F, -1F, -0.4F, 0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 58
		headModel[52].setRotationPoint(0F, 0F, 0F);

		headModel[53].addShapeBox(4.4F, -1F, 2F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 59
		headModel[53].setRotationPoint(0F, 0F, 0F);

		headModel[54].addShapeBox(4.4F, -1F, -2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 60
		headModel[54].setRotationPoint(0F, 0F, 0F);

		headModel[55].addShapeBox(4.4F, -1F, -5F, 1, 1, 3, 0F,-0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 61
		headModel[55].setRotationPoint(0F, 0F, 0F);

		headModel[56].addShapeBox(4.4F, 0F, -4F, 1, 1, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 62
		headModel[56].setRotationPoint(0F, 0F, 0F);

		headModel[57].addShapeBox(4.4F, 1.3F, -4F, 1, 3, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F); // Box 63
		headModel[57].setRotationPoint(0F, 0F, 0F);

		headModel[58].addShapeBox(4.4F, 1.3F, 1.9F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 64
		headModel[58].setRotationPoint(0F, 0F, 0F);

		headModel[59].addShapeBox(4.4F, 0F, 1.9F, 1, 1, 3, 0F,-0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 65
		headModel[59].setRotationPoint(0F, 0F, 0F);
	}
}