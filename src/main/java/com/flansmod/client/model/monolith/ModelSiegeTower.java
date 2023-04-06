//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SiegeTower
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSiegeTower extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelSiegeTower() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];
		leftBackWheelModel = new ModelRendererTurbo[9];
		rightBackWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 47
		bodyModel[1] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 48
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 49
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 69
		bodyModel[5] = new ModelRendererTurbo(this, 801, 49, textureX, textureY); // Box 70
		bodyModel[6] = new ModelRendererTurbo(this, 961, 41, textureX, textureY); // Box 71
		bodyModel[7] = new ModelRendererTurbo(this, 881, 57, textureX, textureY); // Box 72
		bodyModel[8] = new ModelRendererTurbo(this, 921, 57, textureX, textureY); // Box 73
		bodyModel[9] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 74
		bodyModel[10] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 75
		bodyModel[11] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 76
		bodyModel[12] = new ModelRendererTurbo(this, 625, 73, textureX, textureY); // Box 77
		bodyModel[13] = new ModelRendererTurbo(this, 569, 153, textureX, textureY); // Box 78
		bodyModel[14] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 79
		bodyModel[15] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 80
		bodyModel[16] = new ModelRendererTurbo(this, 593, 73, textureX, textureY); // Box 81
		bodyModel[17] = new ModelRendererTurbo(this, 665, 73, textureX, textureY); // Box 82
		bodyModel[18] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 83
		bodyModel[19] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 84
		bodyModel[20] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 85
		bodyModel[21] = new ModelRendererTurbo(this, 249, 185, textureX, textureY); // Box 86
		bodyModel[22] = new ModelRendererTurbo(this, 905, 185, textureX, textureY); // Box 87
		bodyModel[23] = new ModelRendererTurbo(this, 737, 225, textureX, textureY); // Box 88
		bodyModel[24] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Box 89
		bodyModel[25] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Box 90
		bodyModel[26] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 91

		bodyModel[0].addShapeBox(0F, 0F, -0.5F, 48, 100, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[0].setRotationPoint(-8F, -104F, -35F);
		bodyModel[0].rotateAngleX = -0.06981317F;

		bodyModel[1].addShapeBox(0F, 0F, -0.5F, 48, 100, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[1].setRotationPoint(-8F, -104F, 35F);
		bodyModel[1].rotateAngleX = 0.06981317F;

		bodyModel[2].addShapeBox(0F, 51F, -0.5F, 64, 50, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[2].setRotationPoint(-72.01F, -105F, 35F);
		bodyModel[2].rotateAngleX = 0.06981317F;

		bodyModel[3].addShapeBox(0F, 51F, -0.5F, 64, 50, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[3].setRotationPoint(-72.01F, -105F, -35F);
		bodyModel[3].rotateAngleX = -0.06981317F;

		bodyModel[4].addShapeBox(0F, 0F, 0F, 142, 3, 84, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[4].setRotationPoint(-72.01F, -5F, -42F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 100, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 70
		bodyModel[5].setRotationPoint(39F, -104F, -35F);
		bodyModel[5].rotateAngleZ = 0.05235988F;

		bodyModel[6].addShapeBox(0F, 61F, -0.5F, 24, 40, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[6].setRotationPoint(41.99F, -105F, -35F);
		bodyModel[6].rotateAngleX = -0.06981317F;

		bodyModel[7].addShapeBox(0F, 41F, -0.5F, 18, 20, 1, 0F,2F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[7].setRotationPoint(41.99F, -105F, -35F);
		bodyModel[7].rotateAngleX = -0.06981317F;

		bodyModel[8].addShapeBox(0F, 41F, -0.5F, 18, 20, 1, 0F,2F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[8].setRotationPoint(41.99F, -105F, 35F);
		bodyModel[8].rotateAngleX = 0.06981317F;

		bodyModel[9].addShapeBox(0F, 61F, -0.5F, 24, 40, 1, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[9].setRotationPoint(41.99F, -105F, 35F);
		bodyModel[9].rotateAngleX = 0.06981317F;

		bodyModel[10].addShapeBox(-0.5F, 0F, 0F, 1, 27, 76, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 75
		bodyModel[10].setRotationPoint(42.5F, -64F, -38F);
		bodyModel[10].rotateAngleZ = 0.71558499F;

		bodyModel[11].addShapeBox(-0.5F, 0F, 0F, 1, 40, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[11].setRotationPoint(60F, -44F, -39F);
		bodyModel[11].rotateAngleZ = 0.19198622F;

		bodyModel[12].addShapeBox(-0.5F, 0F, 0F, 1, 40, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 77
		bodyModel[12].setRotationPoint(60F, -44F, 7F);
		bodyModel[12].rotateAngleZ = 0.19198622F;

		bodyModel[13].addShapeBox(-35F, -2F, 0F, 100, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[13].setRotationPoint(45F, -27F, -6F);

		bodyModel[14].addShapeBox(-35F, -6F, 0F, 100, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[14].setRotationPoint(45F, -27F, -6F);

		bodyModel[15].addShapeBox(-35F, 2F, 0F, 100, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 80
		bodyModel[15].setRotationPoint(45F, -27F, -6F);

		bodyModel[16].addShapeBox(65F, -6F, 0F, 15, 4, 12, 0F,0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 81
		bodyModel[16].setRotationPoint(45F, -27F, -6F);

		bodyModel[17].addShapeBox(65F, -2F, 0F, 15, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 82
		bodyModel[17].setRotationPoint(45F, -27F, -6F);

		bodyModel[18].addShapeBox(65F, 2F, 0F, 15, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, -4F); // Box 83
		bodyModel[18].setRotationPoint(45F, -27F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 115, 1, 78, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[19].setRotationPoint(-72.01F, -36F, -39F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 49, 1, 74, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[20].setRotationPoint(-8.01F, -79F, -37F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 13, 50, 39, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[21].setRotationPoint(10F, -130F, -19.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 13, 50, 39, 0F,0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 87
		bodyModel[22].setRotationPoint(23F, -130F, -19.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 13, 50, 39, 0F,0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 88
		bodyModel[23].setRotationPoint(-3F, -130F, -19.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 15, 43, 0F,-4F, -4F, -16F, 0F, 0F, -14F, 0F, 0F, -14F, -4F, -4F, -16F, 0F, 0F, -13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F); // Box 89
		bodyModel[24].setRotationPoint(-5F, -145F, -21.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 15, 15, 43, 0F,0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[25].setRotationPoint(9F, -145F, -21.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 15, 43, 0F,0F, 0F, -14F, -4F, -4F, -16F, -4F, -4F, -16F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 0F); // Box 91
		bodyModel[26].setRotationPoint(24F, -145F, -21.5F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 641, 25, textureX, textureY); // Box 60
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 721, 25, textureX, textureY); // Box 61
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 801, 25, textureX, textureY); // Box 62
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 63
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 64
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 553, 49, textureX, textureY); // Box 65
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 633, 49, textureX, textureY); // Box 66
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 67
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 793, 49, textureX, textureY); // Box 68

		leftBackWheelModel[0].addShapeBox(-13.5F, -13.5F, 0F, 27, 9, 9, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftBackWheelModel[0].setRotationPoint(-4.01F, -4F, 30F);

		leftBackWheelModel[1].addShapeBox(-13.5F, 4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 61
		leftBackWheelModel[1].setRotationPoint(-4.01F, -4F, 30F);

		leftBackWheelModel[2].addShapeBox(-13.5F, -4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftBackWheelModel[2].setRotationPoint(-4.01F, -4F, 30F);

		leftBackWheelModel[3].addShapeBox(-13.5F, 4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 63
		leftBackWheelModel[3].setRotationPoint(-55.01F, -4F, 30F);

		leftBackWheelModel[4].addShapeBox(-13.5F, -4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftBackWheelModel[4].setRotationPoint(-55.01F, -4F, 30F);

		leftBackWheelModel[5].addShapeBox(-13.5F, -13.5F, 0F, 27, 9, 9, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		leftBackWheelModel[5].setRotationPoint(-55.01F, -4F, 30F);

		leftBackWheelModel[6].addShapeBox(-13.5F, 4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 66
		leftBackWheelModel[6].setRotationPoint(45.99F, -4F, 30F);

		leftBackWheelModel[7].addShapeBox(-13.5F, -13.5F, 0F, 27, 9, 9, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftBackWheelModel[7].setRotationPoint(45.99F, -4F, 30F);

		leftBackWheelModel[8].addShapeBox(-13.5F, -4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		leftBackWheelModel[8].setRotationPoint(45.99F, -4F, 30F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 51
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 561, 1, textureX, textureY); // Box 52
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 53
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 54
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 55
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 56
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 945, 17, textureX, textureY); // Box 57
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 58
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 561, 25, textureX, textureY); // Box 59

		rightBackWheelModel[0].addShapeBox(-13.5F, -4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		rightBackWheelModel[0].setRotationPoint(-55.01F, -4F, -39F);

		rightBackWheelModel[1].addShapeBox(-13.5F, 4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 52
		rightBackWheelModel[1].setRotationPoint(-55.01F, -4F, -39F);

		rightBackWheelModel[2].addShapeBox(-13.5F, -13.5F, 0F, 27, 9, 9, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		rightBackWheelModel[2].setRotationPoint(-55.01F, -4F, -39F);

		rightBackWheelModel[3].addShapeBox(-13.5F, 4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 54
		rightBackWheelModel[3].setRotationPoint(-4.01F, -4F, -39F);

		rightBackWheelModel[4].addShapeBox(-13.5F, -13.5F, 0F, 27, 9, 9, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightBackWheelModel[4].setRotationPoint(-4.01F, -4F, -39F);

		rightBackWheelModel[5].addShapeBox(-13.5F, -4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightBackWheelModel[5].setRotationPoint(-4.01F, -4F, -39F);

		rightBackWheelModel[6].addShapeBox(-13.5F, 4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F); // Box 57
		rightBackWheelModel[6].setRotationPoint(45.99F, -4F, -39F);

		rightBackWheelModel[7].addShapeBox(-13.5F, -13.5F, 0F, 27, 9, 9, 0F,-9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightBackWheelModel[7].setRotationPoint(45.99F, -4F, -39F);

		rightBackWheelModel[8].addShapeBox(-13.5F, -4.5F, 0F, 27, 9, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightBackWheelModel[8].setRotationPoint(45.99F, -4F, -39F);
	}
}