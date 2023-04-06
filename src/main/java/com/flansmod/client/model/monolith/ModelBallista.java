//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBallista extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelBallista() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[35];
		barrelModel = new ModelRendererTurbo[80];
		leftBackWheelModel = new ModelRendererTurbo[9];
		rightBackWheelModel = new ModelRendererTurbo[9];

		initbodyModel_1();
		initbarrelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		bodyModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 20
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 31
		bodyModel[4] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 34
		bodyModel[5] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 38
		bodyModel[6] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 41
		bodyModel[7] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 42
		bodyModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[9] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 49
		bodyModel[10] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 50
		bodyModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 26
		bodyModel[15] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
		bodyModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		bodyModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		bodyModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 30
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		bodyModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 9
		bodyModel[21] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 25
		bodyModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 26
		bodyModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 27
		bodyModel[24] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 28
		bodyModel[25] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 29
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 30
		bodyModel[27] = new ModelRendererTurbo(this, 38, 185, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 38, 185, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 63
		bodyModel[30] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 64
		bodyModel[31] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 65
		bodyModel[32] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 66
		bodyModel[33] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 67
		bodyModel[34] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 68

		bodyModel[0].addShapeBox(0F, 0F, 0F, 104, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[0].setRotationPoint(-72F, 0.5F, -40F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 6, 80, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[1].setRotationPoint(-80F, 0.5F, -40F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[2].setRotationPoint(-71F, 1F, -34F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 30, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[3].setRotationPoint(-4F, -29F, -16F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 8, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[4].setRotationPoint(-4F, -4F, -34F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 5, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F); // Box 38
		bodyModel[5].setRotationPoint(-2F, -7F, -35F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 19, 5, 4, 0F,6F, -5F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[6].setRotationPoint(-23F, -7F, -15.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 58, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[7].setRotationPoint(-29F, -2F, -15.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 19, 5, 4, 0F,0F, 15F, 0F, 6F, -5F, 0F, 6F, -5F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Box 44
		bodyModel[8].setRotationPoint(4F, -7F, -15.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[9].setRotationPoint(-4F, -31F, -16F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[10].setRotationPoint(-4F, -32F, -16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[11].setRotationPoint(-59F, 1F, -34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[12].setRotationPoint(-47F, 1F, -34F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[13].setRotationPoint(-35F, 1F, -34F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[14].setRotationPoint(-24F, 1F, -34F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[15].setRotationPoint(-13F, 1F, -34F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[16].setRotationPoint(-2F, 1F, -34F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[17].setRotationPoint(9F, 1F, -34F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 5, 68, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[18].setRotationPoint(21F, 1F, -34F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 104, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[19].setRotationPoint(-72F, 0.5F, 34F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 6, 80, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[20].setRotationPoint(32F, 0.5F, -40F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 30, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[21].setRotationPoint(-4F, -29F, 11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 8, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[22].setRotationPoint(-4F, -4F, 29F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 5, 19, 0F,0F, 15F, 0F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[23].setRotationPoint(-2F, -7F, 16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 19, 5, 4, 0F,6F, -5F, 0F, 0F, 15F, 0F, 0F, 15F, 0F, 6F, -5F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[24].setRotationPoint(-23F, -7F, 11.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 58, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[25].setRotationPoint(-29F, -2F, 11.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 19, 5, 4, 0F,0F, 15F, 0F, 6F, -5F, 0F, 6F, -5F, 0F, 0F, 15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F); // Box 30
		bodyModel[26].setRotationPoint(4F, -7F, 11.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[27].setRotationPoint(-2.5F, -7F, -39F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[28].setRotationPoint(-2.5F, -7F, 16F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[29].setRotationPoint(1.5F, -31F, -16F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[30].setRotationPoint(1.5F, -32F, -16F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[31].setRotationPoint(-4F, -31F, 11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[32].setRotationPoint(-4F, -32F, 11F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[33].setRotationPoint(1.5F, -31F, 11F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[34].setRotationPoint(1.5F, -32F, 11F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 46
		barrelModel[1] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 47
		barrelModel[2] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 48
		barrelModel[3] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 58
		barrelModel[4] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 59
		barrelModel[5] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 60
		barrelModel[6] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 61
		barrelModel[7] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 64
		barrelModel[8] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 65
		barrelModel[9] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 66
		barrelModel[10] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 68
		barrelModel[11] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 70
		barrelModel[12] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 72
		barrelModel[13] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 73
		barrelModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 74
		barrelModel[15] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 80
		barrelModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 81
		barrelModel[17] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 82
		barrelModel[18] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 83
		barrelModel[19] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 84
		barrelModel[20] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 85
		barrelModel[21] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 92
		barrelModel[22] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 93
		barrelModel[23] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 94
		barrelModel[24] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 95
		barrelModel[25] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 96
		barrelModel[26] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 97
		barrelModel[27] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 98
		barrelModel[28] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 99
		barrelModel[29] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 100
		barrelModel[30] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 103
		barrelModel[31] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 104
		barrelModel[32] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 113
		barrelModel[33] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 114
		barrelModel[34] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 115
		barrelModel[35] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 116
		barrelModel[36] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 117
		barrelModel[37] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 118
		barrelModel[38] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 119
		barrelModel[39] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 120
		barrelModel[40] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 122
		barrelModel[41] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 123
		barrelModel[42] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 124
		barrelModel[43] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 126
		barrelModel[44] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 131
		barrelModel[45] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 132
		barrelModel[46] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 133
		barrelModel[47] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 134
		barrelModel[48] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 31
		barrelModel[49] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 32
		barrelModel[50] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 33
		barrelModel[51] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 34
		barrelModel[52] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 35
		barrelModel[53] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 36
		barrelModel[54] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 37
		barrelModel[55] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 38
		barrelModel[56] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 39
		barrelModel[57] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 40
		barrelModel[58] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 41
		barrelModel[59] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 42
		barrelModel[60] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 43
		barrelModel[61] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 44
		barrelModel[62] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 45
		barrelModel[63] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 46
		barrelModel[64] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 47
		barrelModel[65] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 48
		barrelModel[66] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 49
		barrelModel[67] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 50
		barrelModel[68] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 51
		barrelModel[69] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 52
		barrelModel[70] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 53
		barrelModel[71] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 54
		barrelModel[72] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 55
		barrelModel[73] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 56
		barrelModel[74] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 57
		barrelModel[75] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 58
		barrelModel[76] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 59
		barrelModel[77] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 60
		barrelModel[78] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 69
		barrelModel[79] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 70

		barrelModel[0].addShapeBox(-1.5F, -0.5F, -22F, 3, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		barrelModel[0].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[1].addShapeBox(-1.5F, 0.5F, -22F, 3, 1, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		barrelModel[1].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[2].addShapeBox(-1.5F, -1.5F, -22F, 3, 1, 44, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		barrelModel[2].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[3].addShapeBox(-80F, -6F, 4F, 110, 7, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 58
		barrelModel[3].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[4].addShapeBox(-80F, -3F, -4F, 110, 5, 8, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 59
		barrelModel[4].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[5].addShapeBox(-81F, -8F, -11F, 4, 12, 22, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 60
		barrelModel[5].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[6].addShapeBox(-75F, -7F, -18F, 5, 5, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		barrelModel[6].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[7].addShapeBox(-81F, -5F, 15F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		barrelModel[7].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[8].addShapeBox(-73F, -13F, 15F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		barrelModel[8].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[9].addShapeBox(10.5F, 1.5F, -35F, 4, 3, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		barrelModel[9].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[10].addShapeBox(10.5F, -39.5F, -35F, 4, 3, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		barrelModel[10].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[11].addShapeBox(-66F, -5F, -10F, 80, 5, 3, 0F,0F, 0F, 0F, 0.5F, 33F, 0F, 0.5F, 33F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0.5F, -33F, 0F, 0.5F, -33F, 0F, -2F, -1F, 0F); // Box 70
		barrelModel[11].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[12].addShapeBox(8.5F, 1F, -32F, 28, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		barrelModel[12].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[13].addShapeBox(8.5F, 1F, 28F, 28, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		barrelModel[13].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[14].addShapeBox(8.5F, -40F, 28F, 28, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		barrelModel[14].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[15].addShapeBox(13.5F, -45F, 21F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 80
		barrelModel[15].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[16].addShapeBox(13.5F, -45F, 15F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		barrelModel[16].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[17].addShapeBox(13.5F, -45F, 9F, 18, 6, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		barrelModel[17].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[18].addShapeBox(13.5F, 3F, 21F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 83
		barrelModel[18].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[19].addShapeBox(13.5F, 3F, 15F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		barrelModel[19].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[20].addShapeBox(13.5F, 3F, 9F, 18, 6, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		barrelModel[20].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[21].addShapeBox(21F, 9F, -19.5F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 92
		barrelModel[21].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[22].addShapeBox(22F, 9F, -19.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		barrelModel[22].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[23].addShapeBox(23F, 9F, -19.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 94
		barrelModel[23].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[24].addShapeBox(21F, 9F, 16.5F, 1, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 95
		barrelModel[24].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[25].addShapeBox(22F, 9F, 16.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		barrelModel[25].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[26].addShapeBox(23F, 9F, 16.5F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 97
		barrelModel[26].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[27].addShapeBox(21F, -47F, 16.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 98
		barrelModel[27].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[28].addShapeBox(22F, -47F, 16.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		barrelModel[28].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[29].addShapeBox(23F, -47F, 16.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 100
		barrelModel[29].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[30].addShapeBox(16.5F, -39.5F, 6.5F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		barrelModel[30].setRotationPoint(2F, -30.5F, 0F);

		barrelModel[31].addShapeBox(14.5F, -39.5F, 6.5F, 4, 44, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		barrelModel[31].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[32].addShapeBox(26F, -25F, 15.5F, 3, 18, 5, 0F,0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F); // Box 113
		barrelModel[32].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[33].addShapeBox(22.5F, -25F, 15.5F, 4, 9, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 114
		barrelModel[33].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[34].addShapeBox(20.5F, -39F, 15.5F, 4, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 115
		barrelModel[34].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[35].addShapeBox(18.5F, -25F, 15.5F, 4, 9, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 116
		barrelModel[35].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[36].addShapeBox(16.5F, -25F, 15.5F, 3, 18, 5, 0F,0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F); // Box 117
		barrelModel[36].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[37].addShapeBox(18.5F, -16F, 15.5F, 4, 9, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		barrelModel[37].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[38].addShapeBox(20.5F, -7F, 15.5F, 4, 10, 5, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		barrelModel[38].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[39].addShapeBox(22.5F, -16F, 15.5F, 4, 9, 5, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		barrelModel[39].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[40].addShapeBox(21.5F, -18F, 13.5F, 5, 4, 44, 0F,0F, 0F, 0F, 0F, 0F, -1F, -15F, 0F, 0F, 15F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -15F, 0F, 0F, 15F, 0F, -2F); // Box 122
		barrelModel[40].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[41].addShapeBox(-35F, -9F, -10F, 1, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 123
		barrelModel[41].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[42].addShapeBox(-35F, -6F, -4F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		barrelModel[42].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[43].addShapeBox(-35F, -8F, 8.5F, 1, 1, 48, 0F,0F, 0F, -1F, 0F, 0F, 0F, 46F, 9F, -2F, -46F, 9F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 46F, -9F, -2F, -46F, -9F, 0F); // Box 126
		barrelModel[43].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[44].addShapeBox(24.5F, -13.5F, 23.5F, 2, 18, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		barrelModel[44].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[45].addShapeBox(24.5F, -39.5F, 23.5F, 2, 18, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 132
		barrelModel[45].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[46].addShapeBox(26.5F, -39.5F, 23.5F, 4, 44, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		barrelModel[46].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[47].addShapeBox(30.5F, -39.5F, 23.5F, 3, 44, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 134
		barrelModel[47].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[48].addShapeBox(-80F, -6F, -7F, 110, 7, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 31
		barrelModel[48].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[49].addShapeBox(-66F, -5F, 7F, 80, 5, 3, 0F,0F, 0F, 0F, 0.5F, 33F, 0F, 0.5F, 33F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0.5F, -33F, 0F, 0.5F, -33F, 0F, -2F, -1F, 0F); // Box 32
		barrelModel[49].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[50].addShapeBox(21.5F, -18F, -57.5F, 5, 4, 44, 0F,15F, 0F, -2F, -15F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 15F, 0F, -2F, -15F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 33
		barrelModel[50].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[51].addShapeBox(-35F, -8F, -56.5F, 1, 1, 48, 0F,-46F, 9F, 0F, 46F, 9F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, -46F, -9F, 0F, 46F, -9F, -2F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 34
		barrelModel[51].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[52].addShapeBox(16.5F, -25F, -20.5F, 3, 18, 5, 0F,0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F); // Box 35
		barrelModel[52].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[53].addShapeBox(20.5F, -39F, -20.5F, 4, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 36
		barrelModel[53].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[54].addShapeBox(18.5F, -25F, -20.5F, 4, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 37
		barrelModel[54].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[55].addShapeBox(22.5F, -25F, -20.5F, 4, 9, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 38
		barrelModel[55].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[56].addShapeBox(26F, -25F, -20.5F, 3, 18, 5, 0F,0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F); // Box 39
		barrelModel[56].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[57].addShapeBox(20.5F, -7F, -20.5F, 4, 10, 5, 0F,2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		barrelModel[57].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[58].addShapeBox(13.5F, 3F, -15F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 41
		barrelModel[58].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[59].addShapeBox(13.5F, 3F, -21F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		barrelModel[59].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[60].addShapeBox(13.5F, 3F, -27F, 18, 6, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		barrelModel[60].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[61].addShapeBox(13.5F, -45F, -15F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Box 44
		barrelModel[61].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[62].addShapeBox(13.5F, -45F, -21F, 18, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		barrelModel[62].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[63].addShapeBox(13.5F, -45F, -27F, 18, 6, 6, 0F,-6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		barrelModel[63].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[64].addShapeBox(21F, -47F, -19.5F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 47
		barrelModel[64].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[65].addShapeBox(22F, -47F, -19.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		barrelModel[65].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[66].addShapeBox(23F, -47F, -19.5F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 49
		barrelModel[66].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[67].addShapeBox(18.5F, -16F, -20.5F, 4, 9, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		barrelModel[67].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[68].addShapeBox(22.5F, -16F, -20.5F, 4, 9, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 51
		barrelModel[68].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[69].addShapeBox(30.5F, 1.5F, -35F, 4, 3, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		barrelModel[69].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[70].addShapeBox(30.5F, -39.5F, -35F, 4, 3, 70, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		barrelModel[70].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[71].addShapeBox(8.5F, -40F, -32F, 28, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		barrelModel[71].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[72].addShapeBox(24.5F, -39.5F, -27.5F, 2, 18, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 55
		barrelModel[72].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[73].addShapeBox(26.5F, -39.5F, -27.5F, 4, 44, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		barrelModel[73].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[74].addShapeBox(30.5F, -39.5F, -27.5F, 3, 44, 4, 0F,0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F); // Box 57
		barrelModel[74].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[75].addShapeBox(24.5F, -13.5F, -27.5F, 2, 18, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		barrelModel[75].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[76].addShapeBox(-81F, -5F, -16F, 17, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		barrelModel[76].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[77].addShapeBox(-73F, -13F, -16F, 1, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		barrelModel[77].setRotationPoint(0F, -30.5F, 0F);

		barrelModel[78].addShapeBox(16.5F, -39.5F, -10.5F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		barrelModel[78].setRotationPoint(2F, -30.5F, 0F);

		barrelModel[79].addShapeBox(14.5F, -39.5F, -10.5F, 4, 44, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		barrelModel[79].setRotationPoint(0F, -30.5F, 0F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 16
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 17
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 18
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 19
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 21
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 22
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 23
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 24

		leftBackWheelModel[0].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftBackWheelModel[0].setRotationPoint(-62F, 2.5F, 40F);

		leftBackWheelModel[1].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 17
		leftBackWheelModel[1].setRotationPoint(-62F, 2.5F, 40F);

		leftBackWheelModel[2].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		leftBackWheelModel[2].setRotationPoint(-62F, 2.5F, 40F);

		leftBackWheelModel[3].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		leftBackWheelModel[3].setRotationPoint(-20F, 2.5F, 40F);

		leftBackWheelModel[4].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		leftBackWheelModel[4].setRotationPoint(-20F, 2.5F, 40F);

		leftBackWheelModel[5].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 21
		leftBackWheelModel[5].setRotationPoint(-20F, 2.5F, 40F);

		leftBackWheelModel[6].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftBackWheelModel[6].setRotationPoint(22F, 2.5F, 40F);

		leftBackWheelModel[7].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		leftBackWheelModel[7].setRotationPoint(22F, 2.5F, 40F);

		leftBackWheelModel[8].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 24
		leftBackWheelModel[8].setRotationPoint(22F, 2.5F, 40F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 0
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 1
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 2
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 10
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 12
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 13
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 14
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 15

		rightBackWheelModel[0].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		rightBackWheelModel[0].setRotationPoint(-62F, 2.5F, -44F);

		rightBackWheelModel[1].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 1
		rightBackWheelModel[1].setRotationPoint(-62F, 2.5F, -44F);

		rightBackWheelModel[2].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		rightBackWheelModel[2].setRotationPoint(-62F, 2.5F, -44F);

		rightBackWheelModel[3].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		rightBackWheelModel[3].setRotationPoint(-20F, 2.5F, -44F);

		rightBackWheelModel[4].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		rightBackWheelModel[4].setRotationPoint(-20F, 2.5F, -44F);

		rightBackWheelModel[5].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 12
		rightBackWheelModel[5].setRotationPoint(-20F, 2.5F, -44F);

		rightBackWheelModel[6].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		rightBackWheelModel[6].setRotationPoint(22F, 2.5F, -44F);

		rightBackWheelModel[7].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 4, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		rightBackWheelModel[7].setRotationPoint(22F, 2.5F, -44F);

		rightBackWheelModel[8].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 15
		rightBackWheelModel[8].setRotationPoint(22F, 2.5F, -44F);
	}
}