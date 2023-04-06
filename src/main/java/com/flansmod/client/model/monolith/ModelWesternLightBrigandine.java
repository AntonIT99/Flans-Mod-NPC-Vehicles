//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WesternLightBrigandine
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWesternLightBrigandine extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelWesternLightBrigandine() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[46];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 9, 15, textureX, textureY); // Box 13
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 16
		bodyModel[3] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 23
		bodyModel[4] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 33
		bodyModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 34
		bodyModel[6] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 36
		bodyModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 37
		bodyModel[8] = new ModelRendererTurbo(this, 9, 15, textureX, textureY); // Box 38
		bodyModel[9] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 39
		bodyModel[10] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 40
		bodyModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 43
		bodyModel[12] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 44
		bodyModel[13] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 45
		bodyModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 46
		bodyModel[15] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 53
		bodyModel[17] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 54
		bodyModel[18] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 55
		bodyModel[19] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 56
		bodyModel[20] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 57
		bodyModel[21] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 58
		bodyModel[22] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 59
		bodyModel[23] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 60
		bodyModel[24] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 61
		bodyModel[25] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 62
		bodyModel[26] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 63
		bodyModel[27] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 64
		bodyModel[28] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 65
		bodyModel[29] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 66
		bodyModel[30] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 67
		bodyModel[31] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 68
		bodyModel[32] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 69
		bodyModel[33] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 70
		bodyModel[34] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 71
		bodyModel[35] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 72
		bodyModel[36] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 79
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 80
		bodyModel[38] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 81
		bodyModel[39] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[40] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 83
		bodyModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 84
		bodyModel[42] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 85
		bodyModel[43] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 86
		bodyModel[44] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 63
		bodyModel[45] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 64

		bodyModel[0].addShapeBox(-4F, 5F, -2.5F, 4, 3, 5, 0F,0.7F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.7F, 0F, 0.4F, 0.5F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0F, 0.25F, 0.2F, 0.5F, 0.25F, 0.2F); // Box 13
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 2.5F, -2.7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F); // Box 15
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2.5F, 2, 2, 5, 0F,0.5F, 0.5F, 0F, -0.5F, 0.6F, 0F, 2F, 0.6F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0.2F, 2.8F, 0.5F, 0.2F, 2F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 16
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4.2F, 8.5F, -2.6F, 4, 5, 1, 0F,0.3F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.25F, -0.5F, 0.3F, 0.25F, -0.5F, 0.7F, 0F, 0.7F, 0.2F, 0.2F, 0.7F, 0.2F, 0.2F, -1.2F, 0.7F, 0F, -1.2F); // Box 23
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 2.5F, 1.7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0.7F, 0.5F, 0.2F); // Box 33
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4.5F, 8F, -2.5F, 1, 6, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.4F, -0.5F, 0.5F, -0.9F, -0.5F, 0.5F, -0.9F, -0.5F, 0.5F, 0.4F, -0.5F, 0.5F); // Box 34
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1.5F, 5.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 36
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 2.5F, -2.7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0.7F, 0.5F, 0.2F, 0.7F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 37
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 5F, -2.5F, 4, 3, 5, 0F,0F, 0F, 0.4F, 0.7F, 0F, 0.4F, 0.7F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.25F, 0.2F, 0.5F, 0.25F, 0.2F, 0.5F, 0.25F, 0.2F, 0F, 0.25F, 0.2F); // Box 38
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 2.5F, 1.7F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F); // Box 39
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(2F, 0F, -2.5F, 2, 2, 5, 0F,-0.5F, 0.6F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 2F, 0.6F, 0F, 2.8F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 2F, 0.5F, 0.2F); // Box 40
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0.2F, 8.5F, -2.6F, 4, 5, 1, 0F,0.2F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0.25F, -0.5F, 0.2F, 0.25F, -0.5F, 0.2F, 0.2F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, -1.2F, 0.2F, 0.2F, -1.2F); // Box 43
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4.2F, 8.5F, 1.6F, 4, 5, 1, 0F,0.3F, 0.25F, -0.5F, 0.2F, 0.25F, -0.5F, 0.2F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.7F, 0F, -1.2F, 0.2F, 0.2F, -1.2F, 0.2F, 0.2F, 0.7F, 0.7F, 0F, 0.7F); // Box 44
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0.2F, 8.5F, 1.6F, 4, 5, 1, 0F,0.2F, 0.25F, -0.5F, 0.3F, 0.25F, -0.5F, 0.3F, 0.25F, 0F, 0.2F, 0.25F, 0F, 0.2F, 0.2F, -1.2F, 0.7F, 0F, -1.2F, 0.7F, 0F, 0.7F, 0.2F, 0.2F, 0.7F); // Box 45
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(3.5F, 8F, -2.5F, 1, 6, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.9F, -0.5F, 0.5F, 0.4F, -0.5F, 0.5F, 0.4F, -0.5F, 0.5F, -0.9F, -0.5F, 0.5F); // Box 46
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-1.5F, 8.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 52
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-1.5F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 53
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-1.5F, 4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 54
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-1.5F, 10F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 55
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0.5F, 10F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 56
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.5F, 4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 57
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.5F, 5.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 58
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.5F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 59
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.5F, 8.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 60
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(-3.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 61
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(-4F, 4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 62
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(-4.3F, 5.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 63
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(-4.2F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 64
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-4.1F, 8.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 65
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(3.2F, 7F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 66
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(3.1F, 8.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 67
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(3.3F, 5.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 68
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(3F, 4F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 69
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(2.5F, 2.5F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 70
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3.5F, 0F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 71
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(2.5F, 0F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 72
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4.5F, 11.8F, -3.6F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 79
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-1.5F, 12F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 80
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(3.5F, 11.8F, -3.6F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 81
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(0.5F, 12F, -3.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 82
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-4.5F, 11.8F, 2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 83
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-1.5F, 12F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 84
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(0.5F, 12F, 2.7F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 85
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(3.5F, 11.8F, 2.6F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 86
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-4.3F, 10.2F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 63
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(3.3F, 10.2F, -3F, 1, 1, 6, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 64
		bodyModel[45].setRotationPoint(0F, 0F, 0F);
	}
}