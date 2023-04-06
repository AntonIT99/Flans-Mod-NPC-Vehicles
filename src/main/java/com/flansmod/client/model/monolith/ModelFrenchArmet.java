//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FrenchArmet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFrenchArmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelFrenchArmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[49];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 16
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 17
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		headModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 20
		headModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 21
		headModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 23
		headModel[8] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 24
		headModel[9] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 25
		headModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 26
		headModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 27
		headModel[12] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 28
		headModel[13] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 29
		headModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 28
		headModel[15] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 32
		headModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
		headModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 34
		headModel[18] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 33
		headModel[19] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 36
		headModel[20] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 37
		headModel[21] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 38
		headModel[22] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 39
		headModel[23] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 40
		headModel[24] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 41
		headModel[25] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 42
		headModel[26] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 43
		headModel[27] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 44
		headModel[28] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 45
		headModel[29] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 46
		headModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		headModel[31] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 49
		headModel[32] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 50
		headModel[33] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 51
		headModel[34] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 52
		headModel[35] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 53
		headModel[36] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 54
		headModel[37] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 55
		headModel[38] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 56
		headModel[39] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 57
		headModel[40] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 58
		headModel[41] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 59
		headModel[42] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 60
		headModel[43] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 61
		headModel[44] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 62
		headModel[45] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 63
		headModel[46] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 64
		headModel[47] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 65
		headModel[48] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 66

		headModel[0].addShapeBox(-0.5F, -10.3F, -9F, 7, 5, 6, 0F,-0.5F, 0F, -3.5F, -2.5F, -1F, -4F, -0.3F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -1.3F, 0F, -2F, 0.3F, 0F, 0F, -0.5F, 0F, 0F); // Box 15
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(4.5F, -7.3F, -3F, 2, 3, 3, 0F,0F, 0F, 0F, -0.3F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.8F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 16
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -4.8F, -11F, 7, 5, 8, 0F,-0.5F, 0F, 0F, -1F, 0F, -3F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -4.5F, -2.5F, 0F, -5.5F, -1F, -1F, 0F, -0.5F, 1F, 0F); // Box 17
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3.5F, -13.3F, -3F, 2, 3, 8, 0F,1F, -1.7F, -1F, -1F, -2.7F, -2F, -1F, -2.5F, -3.9F, 1F, -1F, -2F, 0F, 1F, 2F, -0.2F, 0.7F, -1F, -0.2F, 0.7F, -2.5F, 0.3F, 0.5F, 1F); // Box 19
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(3.5F, -2.3F, -6F, 2, 1, 11, 0F,0F, 0F, 0.5F, 0.3F, 0F, -2.5F, 0.3F, 1F, -2.5F, 0F, 1F, 0.5F, 0F, 2.5F, -2.5F, -0.7F, 1F, -4.5F, -0.7F, 0.5F, -4.4F, 0.3F, 0F, -0.5F); // Box 20
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(3.5F, -5.3F, -6F, 2, 1, 11, 0F,0F, -2F, 0.8F, 0.5F, -2F, -3.2F, 0.5F, 0F, -2.2F, 0F, 0F, 1.3F, 0F, 2F, 0.5F, 0.3F, 2F, -3.5F, 0.3F, 1F, -2.5F, 0F, 1F, 0.5F); // Box 21
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(3.5F, -6.3F, -3F, 2, 1, 8, 0F,0F, 0.3F, 0.5F, 0.5F, 0.3F, -2.5F, 0.5F, 0.5F, -1.8F, 0F, 0.5F, 1.6F, 0F, 2F, 0.8F, 0.3F, 2F, -2.2F, 0.5F, 0F, -2.2F, 0F, 0F, 1.3F); // Box 22
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3.5F, -9.3F, -3F, 2, 3, 8, 0F,0F, 0F, 2F, -0.2F, 0.3F, -1F, -0.2F, 0.3F, -2.5F, 0.3F, 0.5F, 1F, 0F, 0F, 2.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, -1.8F, 0F, -0.5F, 1.6F); // Box 23
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(0F, -13.3F, -3F, 3, 3, 8, 0F,0F, -0.9F, -0.7F, -0.5F, -1.7F, -1F, -0.5F, -1F, -2F, 0F, -0.3F, -1.5F, 0F, 1F, 3F, 0.5F, 1F, 2F, 0.2F, 0.5F, 1F, 0F, 0.5F, 1.8F); // Box 24
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(0F, -9.3F, -3F, 3, 3, 8, 0F,0F, 0F, 2F, 0.5F, 0F, 2F, 0.2F, 0.5F, 1F, 0F, 0.5F, 1.8F, 0F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0.5F, -0.5F, 1.6F, 0F, -0.5F, 2.2F); // Box 25
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0F, -6.3F, -3F, 3, 1, 8, 0F,0F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.5F, 1.6F, 0F, 0.5F, 2.2F, 0F, 2F, 0.8F, 0.5F, 2F, 0.8F, 0.5F, 0F, 1.3F, 0F, 0F, 1.8F); // Box 26
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -5.3F, -6F, 3, 1, 11, 0F,0F, -2F, 0.8F, 0.5F, -2F, 0.8F, 0.5F, 0F, 1.2F, 0F, 0F, 1.8F, 0F, 2F, 0.5F, 0.5F, 2F, 0.5F, 0.5F, 1F, 0.5F, 0F, 1F, 0.9F); // Box 27
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(0F, -2.3F, -6F, 3, 1, 11, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 1F, 0.5F, 0F, 1F, 0.9F, 0F, 4F, -2.5F, 0.5F, 2.5F, -2.5F, 0.2F, 0F, -0.5F, 0F, 0F, -0.1F); // Box 28
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4.5F, -6.3F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.2F, 0F, 0F, 0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.3F, 0F, -0.4F, -0.5F, 0F, 0.3F, -0.5F, 0F); // Box 29
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4.5F, -5.3F, -3F, 2, 3, 3, 0F,0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.8F, -0.69F, 0.5F, 0F, -0.69F, 0.5F, 0F, 2F, 0F, -1F, 1.5F, 0F, 0.3F, -2F, 0.5F, 0F, -2F, 0.5F); // Box 28
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -14.3F, -3F, 1, 3, 8, 0F,0F, -0.9F, -0.7F, 0F, -0.9F, -0.7F, 0F, -0.3F, -1.5F, 0F, -0.3F, -1.5F, 0.5F, 2F, 2.8F, 0.5F, 2F, 2.8F, 0.5F, 1F, 3F, 0.5F, 1F, 3F); // Box 32
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, -9.3F, 4F, 1, 3, 1, 0F,0.5F, 1F, 3F, 0.5F, 1F, 2F, 0.5F, 1F, 3F, 0.5F, 1F, 3F, 0.3F, -0.9F, -0.7F, 0.3F, -0.9F, -0.7F, 0.3F, -0.3F, 3F, 0.3F, -0.3F, 3F); // Box 33
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -7F, 4F, 1, 3, 1, 0F,0.3F, 0.1F, -0.7F, 0.3F, 0.1F, -0.7F, 0.3F, -0.3F, 3F, 0.3F, -0.3F, 3F, 0F, 4F, 3F, 0F, 4F, 2F, 0F, 1F, 1.5F, 0F, 1F, 1.5F); // Box 34
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4.5F, 0.999999999999999F, -2.8F, 9, 2, 9, 0F,-0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 3.5F, -2.5F, -0.5F, 3.5F, -2.5F, 0.5F, 1F, 0.8F, 0.5F, 1F, 0.8F, 0.5F, -2F, 0.5F, 0.5F, -2F, 0.5F); // Box 33
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(0F, -5.5F, -8F, 6, 1, 5, 0F,0F, 0F, 0.2F, -1F, 0F, -1.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.8F, 0F, -1F, 0.7F, 0F, 0F, 0F, 0F, 0F); // Box 36
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1.5F, -13.3F, 9F, 3, 7, 3, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 37
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-1.5F, -20.3F, 9F, 3, 7, 3, 0F,3F, -1F, -2.5F, 3F, -1F, -2.5F, 3F, -3F, 7F, 3F, -3F, 7F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 38
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-1.5F, -24.3F, 9F, 3, 4, 3, 0F,1F, -2F, -10F, 1F, -2F, -10F, 1F, -7F, 12F, 1F, -7F, 12F, 3F, 1F, -2.5F, 3F, 1F, -2.5F, 3F, 3F, 7F, 3F, 3F, 7F); // Box 39
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(8.5F, -22.3F, 7.5F, 3, 4, 2, 0F,-2F, -2F, -10F, 6F, -5F, -10F, 6F, -10F, 12F, -2F, -7F, 12F, 3F, 1F, -2.5F, 3F, 3F, -2.5F, 3F, 5F, 7F, 3F, 3F, 7F); // Box 40
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(0.5F, -11.3F, 7.5F, 3, 7, 3, 0F,-2F, 0F, 1F, 4F, 0F, 1F, 4F, 0F, 1F, -2F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 41
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(3.5F, -18.3F, 7.5F, 3, 7, 3, 0F,-2F, -1F, -2.5F, 8F, -3F, -2.5F, 8F, -5F, 6F, -2F, -3F, 6F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 42
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(4F, -10.3F, 4.5F, 3, 7, 3, 0F,-4F, 0F, -3F, 6F, -5F, -3F, 6F, -5F, 5F, -4F, 0F, 5F, 2F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(8F, -10.3F, 7.5F, 10, 5, 5, 0F,0F, 0F, 0F, -1F, 1F, -5F, -3F, 3F, 6F, 0F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, -6F, 0F, -1F, 8F, -5F, 0F, 0F); // Box 44
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-6.5F, -4.8F, -11F, 7, 5, 8, 0F,-1F, 0F, -3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, -5.5F, -0.5F, 1F, -4.5F, -0.5F, 1F, 0F, -1F, -1F, 0F); // Box 45
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-6F, -5.5F, -8F, 6, 1, 5, 0F,-1F, 0F, -1.5F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.8F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 46
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-6.5F, -10.3F, -9F, 7, 5, 6, 0F,-2.5F, -1F, -4F, -0.5F, 0F, -3.5F, -0.5F, -3F, 0F, -0.3F, -3F, 0F, -1.3F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.3F, 0F, 0F); // Box 47
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-3F, -13.3F, -3F, 3, 3, 8, 0F,-0.5F, -1.7F, -1F, 0F, -0.9F, -0.7F, 0F, -0.3F, -1.5F, -0.5F, -1F, -2F, 0.5F, 1F, 2F, 0F, 1F, 3F, 0F, 0.5F, 1.8F, 0.2F, 0.5F, 1F); // Box 49
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-3F, -9.3F, -3F, 3, 3, 8, 0F,0.5F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, 1.8F, 0.2F, 0.5F, 1F, 0.5F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, -0.5F, 2.2F, 0.5F, -0.5F, 1.6F); // Box 50
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(-3F, -6.3F, -3F, 3, 1, 8, 0F,0.5F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.5F, 2.2F, 0.5F, 0.5F, 1.6F, 0.5F, 2F, 0.8F, 0F, 2F, 0.8F, 0F, 0F, 1.8F, 0.5F, 0F, 1.3F); // Box 51
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(-3F, -5.3F, -6F, 3, 1, 11, 0F,0.5F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 0F, 1.8F, 0.5F, 0F, 1.2F, 0.5F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, 1F, 0.9F, 0.5F, 1F, 0.5F); // Box 52
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(-3F, -2.3F, -6F, 3, 1, 11, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1F, 0.9F, 0.5F, 1F, 0.5F, 0.5F, 2.5F, -2.5F, 0F, 4F, -2.5F, 0F, 0F, -0.1F, 0.2F, 0F, -0.5F); // Box 53
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(-5.5F, -13.3F, -3F, 2, 3, 8, 0F,-1F, -2.7F, -2F, 1F, -1.7F, -1F, 1F, -1F, -2F, -1F, -2.5F, -3.9F, -0.2F, 0.7F, -1F, 0F, 1F, 2F, 0.3F, 0.5F, 1F, -0.2F, 0.7F, -2.5F); // Box 54
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(-5.5F, -9.3F, -3F, 2, 3, 8, 0F,-0.2F, 0.3F, -1F, 0F, 0F, 2F, 0.3F, 0.5F, 1F, -0.2F, 0.3F, -2.5F, 0.5F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, -0.5F, 1.6F, 0.5F, -0.5F, -1.8F); // Box 55
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(-5.5F, -6.3F, -3F, 2, 1, 8, 0F,0.5F, 0.3F, -2.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 1.6F, 0.5F, 0.5F, -1.8F, 0.3F, 2F, -2.2F, 0F, 2F, 0.8F, 0F, 0F, 1.3F, 0.5F, 0F, -2.2F); // Box 56
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(-5.5F, -5.3F, -6F, 2, 1, 11, 0F,0.5F, -2F, -3.2F, 0F, -2F, 0.8F, 0F, 0F, 1.3F, 0.5F, 0F, -2.2F, 0.3F, 2F, -3.5F, 0F, 2F, 0.5F, 0F, 1F, 0.5F, 0.3F, 1F, -2.5F); // Box 57
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(-5.5F, -2.3F, -6F, 2, 1, 11, 0F,0.3F, 0F, -2.5F, 0F, 0F, 0.5F, 0F, 1F, 0.5F, 0.3F, 1F, -2.5F, -0.7F, 1F, -4.5F, 0F, 2.5F, -2.5F, 0.3F, 0F, -0.5F, -0.7F, 0.5F, -4.4F); // Box 58
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(-6.5F, -7.3F, -3F, 2, 3, 3, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0.5F, 0.8F, -0.3F, 0.5F); // Box 59
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(-6.5F, -6.3F, 0.5F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.3F, 0.2F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0.3F, -0.5F, 0F, -0.4F, -0.5F, 0F); // Box 60
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(-6.5F, -5.3F, -3F, 2, 3, 3, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.69F, 0.5F, 0.8F, -0.69F, 0.5F, -1F, 1.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0.5F, 0.3F, -2F, 0.5F); // Box 61
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(-3.5F, -11.3F, 7.5F, 3, 7, 3, 0F,4F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, 1F, 4F, 0F, 1F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 62
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(-6.5F, -18.3F, 7.5F, 3, 7, 3, 0F,8F, -3F, -2.5F, -2F, -1F, -2.5F, -2F, -3F, 6F, 8F, -5F, 6F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 63
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-11.5F, -22.3F, 7.5F, 3, 4, 2, 0F,6F, -5F, -10F, -2F, -2F, -10F, -2F, -7F, 12F, 6F, -10F, 12F, 3F, 3F, -2.5F, 3F, 1F, -2.5F, 3F, 3F, 7F, 3F, 5F, 7F); // Box 64
		headModel[46].setRotationPoint(0F, 0F, 0F);

		headModel[47].addShapeBox(-7F, -10.3F, 4.5F, 3, 7, 3, 0F,6F, -5F, -3F, -4F, 0F, -3F, -4F, 0F, 5F, 6F, -5F, 5F, 0F, 0F, 0F, 2F, 1F, 2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		headModel[47].setRotationPoint(0F, 0F, 0F);

		headModel[48].addShapeBox(-18F, -10.3F, 7.5F, 10, 5, 5, 0F,-1F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 3F, 6F, 1F, 0F, -6F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, -1F, 8F); // Box 66
		headModel[48].setRotationPoint(0F, 0F, 0F);
	}
}