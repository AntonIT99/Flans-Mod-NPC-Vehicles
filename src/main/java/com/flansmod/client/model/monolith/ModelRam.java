//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ram
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRam extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelRam() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];
		bodyDoorOpenModel = new ModelRendererTurbo[3];
		bodyDoorCloseModel = new ModelRendererTurbo[3];
		leftBackWheelModel = new ModelRendererTurbo[9];
		rightBackWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[2] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 70
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 71
		bodyModel[5] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 72
		bodyModel[6] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 73
		bodyModel[7] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 74
		bodyModel[8] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 75
		bodyModel[9] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 76
		bodyModel[10] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 77
		bodyModel[11] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 78
		bodyModel[12] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 82
		bodyModel[13] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 83
		bodyModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 84
		bodyModel[15] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 85
		bodyModel[16] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 86
		bodyModel[17] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 87
		bodyModel[18] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 88
		bodyModel[19] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 89
		bodyModel[20] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 90
		bodyModel[21] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Box 91
		bodyModel[22] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 92

		bodyModel[0].addShapeBox(0F, 0F, 0F, 80, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[0].setRotationPoint(-40F, 3.5F, -13.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 80, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[1].setRotationPoint(-40F, 3.5F, 8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[2].setRotationPoint(-40F, 3.5F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[3].setRotationPoint(36F, 3.5F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[4].setRotationPoint(-39F, -20F, -12.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[5].setRotationPoint(-14F, -20F, -12.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[6].setRotationPoint(11F, -20F, -12.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[7].setRotationPoint(36F, -20F, -12.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[8].setRotationPoint(-39F, -20F, 9.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[9].setRotationPoint(-14F, -20F, 9.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[10].setRotationPoint(11F, -20F, 9.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[11].setRotationPoint(36F, -20F, 9.5F);

		bodyModel[12].addShapeBox(0F, 0F, -1.5F, 84, 41, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[12].setRotationPoint(-42F, -44.5F, 0F);
		bodyModel[12].rotateAngleX = -0.48869219F;

		bodyModel[13].addShapeBox(0F, 0F, -1.5F, 84, 41, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[13].setRotationPoint(-42F, -44.5F, 0F);
		bodyModel[13].rotateAngleX = 0.48869219F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[14].setRotationPoint(-39F, -43F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[15].setRotationPoint(-14F, -43F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[16].setRotationPoint(11F, -43F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 24, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[17].setRotationPoint(36F, -43F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 80, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[18].setRotationPoint(-40F, -22F, -1.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 3, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[19].setRotationPoint(36F, -23F, -12.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[20].setRotationPoint(11F, -23F, -12.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[21].setRotationPoint(-14F, -23F, -12.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[22].setRotationPoint(-40F, -23F, -12.5F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 93
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 94
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 95

		bodyDoorOpenModel[0].addShapeBox(0F, -10F, 0F, 90, 5, 15, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyDoorOpenModel[0].setRotationPoint(-33F, -7.5F, -7.5F);

		bodyDoorOpenModel[1].addShapeBox(0F, -10F, 0F, 90, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 94
		bodyDoorOpenModel[1].setRotationPoint(-33F, 2.5F, -7.5F);

		bodyDoorOpenModel[2].addShapeBox(0F, -5F, 0F, 90, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyDoorOpenModel[2].setRotationPoint(-33F, -7.5F, -7.5F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 79
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 80
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 81

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 90, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyDoorCloseModel[0].setRotationPoint(-45F, -7.5F, -7.5F);

		bodyDoorCloseModel[1].addShapeBox(0F, -5F, 0F, 90, 5, 15, 0F,0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyDoorCloseModel[1].setRotationPoint(-45F, -7.5F, -7.5F);

		bodyDoorCloseModel[2].addShapeBox(0F, -5F, 0F, 90, 5, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 81
		bodyDoorCloseModel[2].setRotationPoint(-45F, 2.5F, -7.5F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 60
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 61
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 62
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 63
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 64
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 65
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 66
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 67
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 68

		leftBackWheelModel[0].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 60
		leftBackWheelModel[0].setRotationPoint(36F, 5.5F, 13.5F);

		leftBackWheelModel[1].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftBackWheelModel[1].setRotationPoint(36F, 5.5F, 13.5F);

		leftBackWheelModel[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftBackWheelModel[2].setRotationPoint(36F, 5.5F, 13.5F);

		leftBackWheelModel[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 63
		leftBackWheelModel[3].setRotationPoint(0F, 5.5F, 13.5F);

		leftBackWheelModel[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		leftBackWheelModel[4].setRotationPoint(0F, 5.5F, 13.5F);

		leftBackWheelModel[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		leftBackWheelModel[5].setRotationPoint(0F, 5.5F, 13.5F);

		leftBackWheelModel[6].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftBackWheelModel[6].setRotationPoint(-36F, 5.5F, 13.5F);

		leftBackWheelModel[7].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftBackWheelModel[7].setRotationPoint(-36F, 5.5F, 13.5F);

		leftBackWheelModel[8].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 68
		leftBackWheelModel[8].setRotationPoint(-36F, 5.5F, 13.5F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 45
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 46
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 47
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 54
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 55
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 56
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 57
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 58
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 59

		rightBackWheelModel[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		rightBackWheelModel[0].setRotationPoint(-36F, 5.5F, -17.5F);

		rightBackWheelModel[1].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 46
		rightBackWheelModel[1].setRotationPoint(-36F, 5.5F, -17.5F);

		rightBackWheelModel[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightBackWheelModel[2].setRotationPoint(-36F, 5.5F, -17.5F);

		rightBackWheelModel[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 54
		rightBackWheelModel[3].setRotationPoint(0F, 5.5F, -17.5F);

		rightBackWheelModel[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		rightBackWheelModel[4].setRotationPoint(0F, 5.5F, -17.5F);

		rightBackWheelModel[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		rightBackWheelModel[5].setRotationPoint(0F, 5.5F, -17.5F);

		rightBackWheelModel[6].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 57
		rightBackWheelModel[6].setRotationPoint(36F, 5.5F, -17.5F);

		rightBackWheelModel[7].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightBackWheelModel[7].setRotationPoint(36F, 5.5F, -17.5F);

		rightBackWheelModel[8].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightBackWheelModel[8].setRotationPoint(36F, 5.5F, -17.5F);
	}
}