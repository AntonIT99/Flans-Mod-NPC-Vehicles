//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Flirt
// Model Creator: 
// Created on: 23.07.2020 - 09:12:33
// Last changed on: 23.07.2020 - 09:12:33

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFlirt extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelFlirt() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[47];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 22
		bodyModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 34
		bodyModel[13] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 35
		bodyModel[14] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 39
		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 40
		bodyModel[17] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 42
		bodyModel[18] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 44
		bodyModel[19] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 49
		bodyModel[21] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 50
		bodyModel[22] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 51
		bodyModel[23] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 53
		bodyModel[25] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 54
		bodyModel[26] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 55
		bodyModel[27] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 56
		bodyModel[28] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 57
		bodyModel[29] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 58
		bodyModel[30] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 59
		bodyModel[31] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 60
		bodyModel[32] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 61
		bodyModel[33] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 62
		bodyModel[34] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 248
		bodyModel[35] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 249
		bodyModel[36] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 250
		bodyModel[37] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 66
		bodyModel[38] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 67
		bodyModel[39] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 68
		bodyModel[40] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 69
		bodyModel[41] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 70
		bodyModel[42] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 71
		bodyModel[43] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 72
		bodyModel[44] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 73
		bodyModel[45] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 74
		bodyModel[46] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 75

		bodyModel[0].addShapeBox(0F, 0F, 0F, 38, 4, 12, 0F,0F, 0F, -0.5F, 0F, 2F, -5.5F, 0F, 2F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(26F, 0F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 52, 4, 12, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bodyModel[1].setRotationPoint(-26F, 0F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 26, 4, 10, 0F,0F, -0.5F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F); // Box 3
		bodyModel[2].setRotationPoint(-52F, 0F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 2, 12, 0F,0F, 0.5F, -4F, -0.5F, 0.1F, -5.5F, -0.5F, 0.1F, -5.5F, 0F, 0.5F, -4F, 3F, -0.8F, -2.5F, 0F, -2F, -5.5F, 0F, -2F, -5.5F, 3F, -0.8F, -2.5F); // Box 6
		bodyModel[3].setRotationPoint(44F, -2F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 9
		bodyModel[4].setRotationPoint(40.5F, -7.5F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(41.5F, -6.5F, -0.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 11
		bodyModel[6].setRotationPoint(42.5F, -7.65F, -0.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 13
		bodyModel[7].setRotationPoint(28.5F, -4.5F, -1.3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[8].setRotationPoint(7.5F, -8.5F, -1.5F);
		bodyModel[8].rotateAngleZ = 0.05235988F;

		bodyModel[9].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 22
		bodyModel[9].setRotationPoint(-6F, -2.7F, 3F);
		bodyModel[9].rotateAngleY = 0.76794487F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 23
		bodyModel[10].setRotationPoint(-6F, -2.7F, 3F);
		bodyModel[10].rotateAngleY = 0.76794487F;

		bodyModel[11].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 24
		bodyModel[11].setRotationPoint(-6F, -1.8F, 3F);

		bodyModel[12].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 34
		bodyModel[12].setRotationPoint(-6.5F, -2.7F, -4F);
		bodyModel[12].rotateAngleY = -0.76794487F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 35
		bodyModel[13].setRotationPoint(-6.5F, -2.7F, -4F);
		bodyModel[13].rotateAngleY = -0.76794487F;

		bodyModel[14].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 36
		bodyModel[14].setRotationPoint(-6F, -1.8F, -4F);

		bodyModel[15].addShapeBox(-5F, -1F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 39
		bodyModel[15].setRotationPoint(-38F, -2F, 0F);
		bodyModel[15].rotateAngleY = -3.14159265F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[16].setRotationPoint(-39.5F, -1.3F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 42
		bodyModel[17].setRotationPoint(31.5F, -19.5F, -0.5F);
		bodyModel[17].rotateAngleZ = 0.05235988F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 44
		bodyModel[18].setRotationPoint(32F, -15.5F, -3.5F);
		bodyModel[18].rotateAngleZ = 0.03490659F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 48
		bodyModel[19].setRotationPoint(-63.5F, -8F, -0.5F);
		bodyModel[19].rotateAngleZ = 0.13962634F;

		bodyModel[20].addShapeBox(-10.3F, -3F, 0F, 15, 11, 1, 0F,-4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F); // Box 49
		bodyModel[20].setRotationPoint(-63.5F, -8F, -0.5F);
		bodyModel[20].rotateAngleZ = 0.13962634F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 38, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -1.5F); // Box 50
		bodyModel[21].setRotationPoint(26F, 4F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 52, 4, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F); // Box 51
		bodyModel[22].setRotationPoint(-26F, 4F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 36, 3, 10, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -3.5F, -1.8F, -4.5F, 0F, 1F, -1F, 0F, 1F, -1F, -3.5F, -1.8F, -4.5F); // Box 52
		bodyModel[23].setRotationPoint(-62F, 4F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F,0F, 0F, -0.5F, 0F, -0.5F, 0.15F, 0F, -0.5F, 0.15F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, -0.5F); // Box 53
		bodyModel[24].setRotationPoint(-62F, 0F, -3F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[25].setRotationPoint(33F, -4F, -2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 55
		bodyModel[26].setRotationPoint(32.9F, -4.7F, -2.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[27].setRotationPoint(-9.5F, -8.5F, -1.5F);
		bodyModel[27].rotateAngleZ = 0.05235988F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[28].setRotationPoint(25.5F, -8.5F, -1.5F);
		bodyModel[28].rotateAngleZ = 0.05235988F;

		bodyModel[29].addShapeBox(-5F, -1F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 58
		bodyModel[29].setRotationPoint(-22F, -2F, 0F);
		bodyModel[29].rotateAngleY = -3.14159265F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[30].setRotationPoint(-23.5F, -1.3F, -0.5F);

		bodyModel[31].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 60
		bodyModel[31].setRotationPoint(-48F, -4F, 0.5F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 61
		bodyModel[32].setRotationPoint(-48F, -4F, 0.5F);
		bodyModel[32].rotateAngleY = -3.14159265F;

		bodyModel[33].addShapeBox(-0.8F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 62
		bodyModel[33].setRotationPoint(-47F, -3.1F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 1F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1.5F, 0F, -2.4F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2.4F, -2F); // Box 248
		bodyModel[34].setRotationPoint(16.5F, -2.5F, 2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -1F, -1F); // Box 249
		bodyModel[35].setRotationPoint(20.5F, -2.5F, 2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 250
		bodyModel[36].setRotationPoint(25.5F, -2.5F, 2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[37].setRotationPoint(-0.5F, -2.5F, -1.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0.3F, 0F, 0.5F, 0.8F, 0.2F, 0.5F, 0.8F, 0.2F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0F); // Box 67
		bodyModel[38].setRotationPoint(-0.5F, -4.5F, -1.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.5F, 0.3F, 0F, 0.5F, 0.8F, 0.2F, 0.5F, 0.8F, 0.2F, -0.5F, 0.3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0F, 0F); // Box 68
		bodyModel[39].setRotationPoint(19F, -4.5F, -1.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[40].setRotationPoint(19F, -2.5F, -1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 70
		bodyModel[41].setRotationPoint(-63F, 1F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.9F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.9F, -3F, 0F); // Box 71
		bodyModel[42].setRotationPoint(-63F, 4F, -0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 1.4F, -0.4F, 0F, 1.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, -0.5F, 0F); // Box 72
		bodyModel[43].setRotationPoint(-62F, 5F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 1F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1.5F, 0F, -2.4F, -2F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -2.4F, -2F); // Box 73
		bodyModel[44].setRotationPoint(16.5F, -2.5F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -1F, -1F); // Box 74
		bodyModel[45].setRotationPoint(20.5F, -2.5F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.3F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.3F, -1F); // Box 75
		bodyModel[46].setRotationPoint(25.5F, -2.5F, -6F);
	}
}