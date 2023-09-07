//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 18.08.2023 - 11:53:34
// Last changed on: 18.08.2023 - 11:53:34

package com.wolffsmod.model.sturmgeschuetz; //Path where the model is located

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.wolffsmod.model.ModelFlanVehicle;

public class ModelDisstonTractor extends ModelFlanVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelDisstonTractor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 10
		bodyModel[4] = new ModelRendererTurbo(this, 77, 176, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 377, 49, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 14
		bodyModel[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 17
		bodyModel[8] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 18
		bodyModel[9] = new ModelRendererTurbo(this, 467, 124, textureX, textureY); // Box 19
		bodyModel[10] = new ModelRendererTurbo(this, 216, 190, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 247, 192, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 273, 130, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 320, 13, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 49
		bodyModel[19] = new ModelRendererTurbo(this, -5, 128, textureX, textureY); // Box 74

		bodyModel[0].addBox(0F, 0F, 0F, 52, 9, 28, 0F); // Box 0
		bodyModel[0].setRotationPoint(1F, -2F, 0F);

		bodyModel[1].addBox(0F, 0F, 0F, 54, 23, 44, 0F); // Box 1
		bodyModel[1].setRotationPoint(-1F, -25F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 18, 20, 28, 0F); // Box 9
		bodyModel[2].setRotationPoint(53F, -13F, 0F);

		bodyModel[3].addBox(0F, 0F, 0F, 15, 12, 28, 0F); // Box 10
		bodyModel[3].setRotationPoint(71F, -13F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 8, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[4].setRotationPoint(71F, -1F, 0F);

		bodyModel[5].addBox(0F, 0F, 0F, 16, 3, 44, 0F); // Box 13
		bodyModel[5].setRotationPoint(53F, -5F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 16, 4, 44, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[6].setRotationPoint(53F, -9F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[7].setRotationPoint(53F, -13F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[8].setRotationPoint(53F, -13F, 28F);

		bodyModel[9].addBox(0F, 0F, 7F, 6, 6, 8, 0F); // Box 19
		bodyModel[9].setRotationPoint(53F, -19F, 21F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 20
		bodyModel[10].setRotationPoint(53F, -22F, 30F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[11].setRotationPoint(53F, -22F, 34F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[12].setRotationPoint(53F, -22F, 28F);

		bodyModel[13].addBox(0F, 0F, 0F, 5, 14, 4, 0F); // Box 23
		bodyModel[13].setRotationPoint(54F, -25F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 12, 2, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[14].setRotationPoint(54F, -25F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 12, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(54F, -25F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 12, 44, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[16].setRotationPoint(53F, -25F, -8F);

		bodyModel[17].addBox(0F, 0F, 0F, 6, 2, 8, 0F); // Box 18
		bodyModel[17].setRotationPoint(48F, -27F, 28F);

		bodyModel[18].addBox(0F, -1F, 0F, 19, 1, 1, 0F); // Box 49
		bodyModel[18].setRotationPoint(46F, -16F, 31F);

		bodyModel[19].addBox(0F, 0F, 0F, 58, 11, 8, 0F); // Box 74
		bodyModel[19].setRotationPoint(7F, 2F, -9F);


		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 81, 282, textureX, textureY); // Box 75

		bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 58, 11, 8, 0F); // Box 75
		bodyDoorOpenModel[0].setRotationPoint(7F, 2F, 29F);


		turretModel = new ModelRendererTurbo[12];
		turretModel[0] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 17
		turretModel[1] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 19
		turretModel[2] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 20
		turretModel[3] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 22
		turretModel[4] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 25
		turretModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 27
		turretModel[6] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 29
		turretModel[7] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 30
		turretModel[8] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 31
		turretModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 32
		turretModel[10] = new ModelRendererTurbo(this, 368, 143, textureX, textureY); // Box 33
		turretModel[11] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Box 34

		turretModel[0].addShapeBox(0F, 0F, 0F, 9, 14, 34, 0F, 3F, -1F, -5F, -4F, -3F, -8F, -4F, -3F, -8F, 3F, -1F, -5F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F); // Box 17
		turretModel[0].setRotationPoint(34F, -39F, -3F);

		turretModel[1].addBox(0F, 0F, 0F, 15, 13, 22, 0F); // Box 19
		turretModel[1].setRotationPoint(16F, -38F, 3F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 15, 13, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 20
		turretModel[2].setRotationPoint(16F, -38F, 25F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 15, 13, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F); // Box 22
		turretModel[3].setRotationPoint(16F, -38F, 0F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 5, 17, 18, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		turretModel[4].setRotationPoint(11F, -38F, 5F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 27
		turretModel[5].setRotationPoint(12F, -38F, 1F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -3F, 0F, 1F); // Box 29
		turretModel[6].setRotationPoint(12F, -38F, 23F);

		turretModel[7].addBox(0F, 0F, 0F, 15, 3, 16, 0F); // Box 30
		turretModel[7].setRotationPoint(30F, -28F, 6F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		turretModel[8].setRotationPoint(44F, -28F, 4F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[9].setRotationPoint(44F, -28F, 4F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 33
		turretModel[10].setRotationPoint(44F, -28F, 22F);

		turretModel[11].addBox(0F, 0F, 0F, 13, 3, 20, 0F); // Box 34
		turretModel[11].setRotationPoint(31F, -28F, 4F);


		barrelModel = new ModelRendererTurbo[9];
		barrelModel[0] = new ModelRendererTurbo(this, 388, 147, textureX, textureY); // Box 35
		barrelModel[1] = new ModelRendererTurbo(this, 12, 8, textureX, textureY); // Box 38
		barrelModel[2] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 39
		barrelModel[3] = new ModelRendererTurbo(this, 336, 11, textureX, textureY); // Box 42
		barrelModel[4] = new ModelRendererTurbo(this, 444, 107, textureX, textureY); // Box 43
		barrelModel[5] = new ModelRendererTurbo(this, 105, 59, textureX, textureY); // Box 44
		barrelModel[6] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 45
		barrelModel[7] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 46
		barrelModel[8] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 48

		barrelModel[0].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 35
		barrelModel[0].setRotationPoint(39F, -33F, 13F);

		barrelModel[1].addBox(0F, 0F, 0F, 4, 1, 1, 0F); // Box 38
		barrelModel[1].setRotationPoint(39F, -31F, 14F);

		barrelModel[2].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		barrelModel[2].setRotationPoint(39F, -34F, 14F);

		barrelModel[3].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		barrelModel[3].setRotationPoint(39F, -34F, 13F);

		barrelModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		barrelModel[4].setRotationPoint(39F, -34F, 15F);

		barrelModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 44
		barrelModel[5].setRotationPoint(39F, -31F, 15F);

		barrelModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		barrelModel[6].setRotationPoint(39F, -31F, 13F);

		barrelModel[7].addBox(0F, -1F, 1F, 22, 1, 1, 0F); // Box 46
		barrelModel[7].setRotationPoint(43F, -32F, 13F);

		barrelModel[8].addBox(0F, -1F, 1F, 6, 1, 1, 0F); // Box 48
		barrelModel[8].setRotationPoint(43F, -31F, 13F);


		leftTrackModel = new ModelRendererTurbo[18];
		leftTrackModel[0] = new ModelRendererTurbo(this, 315, 179, textureX, textureY); // Shape 43
		leftTrackModel[1] = new ModelRendererTurbo(this, 388, 165, textureX, textureY); // Shape 44
		leftTrackModel[2] = new ModelRendererTurbo(this, 39, 66, textureX, textureY); // Shape 45
		leftTrackModel[3] = new ModelRendererTurbo(this, 256, 157, textureX, textureY); // Shape 46
		leftTrackModel[4] = new ModelRendererTurbo(this, 137, 14, textureX, textureY); // Shape 47
		leftTrackModel[5] = new ModelRendererTurbo(this, 152, 169, textureX, textureY); // Shape 48
		leftTrackModel[6] = new ModelRendererTurbo(this, 316, 155, textureX, textureY); // Shape 49
		leftTrackModel[7] = new ModelRendererTurbo(this, 343, 158, textureX, textureY); // Shape 50
		leftTrackModel[8] = new ModelRendererTurbo(this, 435, 142, textureX, textureY); // Shape 57
		leftTrackModel[9] = new ModelRendererTurbo(this, 469, 163, textureX, textureY); // Shape 59
		leftTrackModel[10] = new ModelRendererTurbo(this, 243, 232, textureX, textureY); // Box 63
		leftTrackModel[11] = new ModelRendererTurbo(this, 103, 256, textureX, textureY); // Box 64
		leftTrackModel[12] = new ModelRendererTurbo(this, 216, 129, textureX, textureY); // Box 66
		leftTrackModel[13] = new ModelRendererTurbo(this, 171, 195, textureX, textureY); // Box 68
		leftTrackModel[14] = new ModelRendererTurbo(this, 149, 148, textureX, textureY); // Box 70
		leftTrackModel[15] = new ModelRendererTurbo(this, 96, 153, textureX, textureY); // Box 71
		leftTrackModel[16] = new ModelRendererTurbo(this, 18, 164, textureX, textureY); // Box 73
		leftTrackModel[17] = new ModelRendererTurbo(this, 16, 48, textureX, textureY); // Box 77

		leftTrackModel[0].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 8, 15, 15, 52, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 43
		leftTrackModel[0].setRotationPoint(68F, 15F, 36F);

		leftTrackModel[1].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 8, 15, 15, 52, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 44
		leftTrackModel[1].setRotationPoint(18F, 15F, 36F);

		leftTrackModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 45
		leftTrackModel[2].setRotationPoint(55F, 16F, 36F);

		leftTrackModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 46
		leftTrackModel[3].setRotationPoint(49F, 16F, 36F);

		leftTrackModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 47
		leftTrackModel[4].setRotationPoint(43F, 16F, 36F);

		leftTrackModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 48
		leftTrackModel[5].setRotationPoint(37F, 16F, 36F);

		leftTrackModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 49
		leftTrackModel[6].setRotationPoint(31F, 16F, 36F);

		leftTrackModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 50
		leftTrackModel[7].setRotationPoint(25F, 16F, 36F);

		leftTrackModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 57
		leftTrackModel[8].setRotationPoint(31F, 5F, 36F);

		leftTrackModel[9].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 59
		leftTrackModel[9].setRotationPoint(49F, 5F, 36F);

		leftTrackModel[10].addBox(0F, 0F, 0F, 57, 1, 8, 0F); // Box 63
		leftTrackModel[10].setRotationPoint(7F, -1F, 28F);

		leftTrackModel[11].addBox(0F, 0F, 0F, 58, 1, 8, 0F); // Box 64
		leftTrackModel[11].setRotationPoint(7F, 15F, 28F);

		leftTrackModel[12].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 66
		leftTrackModel[12].setRotationPoint(64F, -1F, 28F);
		leftTrackModel[12].rotateAngleZ = -0.71558499F;

		leftTrackModel[13].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 68
		leftTrackModel[13].setRotationPoint(69F, 3F, 28F);
		leftTrackModel[13].rotateAngleZ = -1.57079633F;

		leftTrackModel[14].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 70
		leftTrackModel[14].setRotationPoint(64F, 15F, 28F);
		leftTrackModel[14].rotateAngleZ = 0.76794487F;

		leftTrackModel[15].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 71
		leftTrackModel[15].setRotationPoint(3F, 3F, 28F);
		leftTrackModel[15].rotateAngleZ = -1.57079633F;

		leftTrackModel[16].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 73
		leftTrackModel[16].setRotationPoint(2F, 3F, 28F);
		leftTrackModel[16].rotateAngleZ = 0.80285146F;

		leftTrackModel[17].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 77
		leftTrackModel[17].setRotationPoint(6F, 16F, 28F);
		leftTrackModel[17].rotateAngleZ = 2.28638132F;


		rightTrackModel = new ModelRendererTurbo[18];
		rightTrackModel[0] = new ModelRendererTurbo(this, 20, 191, textureX, textureY); // Shape 50
		rightTrackModel[1] = new ModelRendererTurbo(this, 22, 226, textureX, textureY); // Shape 42
		rightTrackModel[2] = new ModelRendererTurbo(this, 297, 127, textureX, textureY); // Shape 51
		rightTrackModel[3] = new ModelRendererTurbo(this, 290, 163, textureX, textureY); // Shape 52
		rightTrackModel[4] = new ModelRendererTurbo(this, 333, 133, textureX, textureY); // Shape 53
		rightTrackModel[5] = new ModelRendererTurbo(this, 354, 125, textureX, textureY); // Shape 54
		rightTrackModel[6] = new ModelRendererTurbo(this, 386, 124, textureX, textureY); // Shape 55
		rightTrackModel[7] = new ModelRendererTurbo(this, 410, 128, textureX, textureY); // Shape 56
		rightTrackModel[8] = new ModelRendererTurbo(this, 456, 197, textureX, textureY); // Shape 58
		rightTrackModel[9] = new ModelRendererTurbo(this, 281, 192, textureX, textureY); // Shape 60
		rightTrackModel[10] = new ModelRendererTurbo(this, 235, 282, textureX, textureY); // Box 62
		rightTrackModel[11] = new ModelRendererTurbo(this, 102, 237, textureX, textureY); // Box 65
		rightTrackModel[12] = new ModelRendererTurbo(this, 215, 161, textureX, textureY); // Box 65
		rightTrackModel[13] = new ModelRendererTurbo(this, 185, 142, textureX, textureY); // Box 67
		rightTrackModel[14] = new ModelRendererTurbo(this, 182, 173, textureX, textureY); // Box 69
		rightTrackModel[15] = new ModelRendererTurbo(this, 16, 48, textureX, textureY); // Box 71
		rightTrackModel[16] = new ModelRendererTurbo(this, 55, 155, textureX, textureY); // Box 72
		rightTrackModel[17] = new ModelRendererTurbo(this, 16, 48, textureX, textureY); // Box 76

		rightTrackModel[0].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 8, 15, 15, 52, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 50
		rightTrackModel[0].setRotationPoint(68F, 15F, 0F);

		rightTrackModel[1].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 8, 15, 15, 52, 8, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Shape 42
		rightTrackModel[1].setRotationPoint(18F, 15F, 0F);

		rightTrackModel[2].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 51
		rightTrackModel[2].setRotationPoint(25F, 16F, 0F);

		rightTrackModel[3].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 52
		rightTrackModel[3].setRotationPoint(31F, 16F, 0F);

		rightTrackModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 53
		rightTrackModel[4].setRotationPoint(37F, 16F, 0F);

		rightTrackModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 54
		rightTrackModel[5].setRotationPoint(43F, 16F, 0F);

		rightTrackModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 55
		rightTrackModel[6].setRotationPoint(49F, 16F, 0F);

		rightTrackModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 56
		rightTrackModel[7].setRotationPoint(55F, 16F, 0F);

		rightTrackModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 58
		rightTrackModel[8].setRotationPoint(31F, 5F, 0F);

		rightTrackModel[9].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 1, 4, 1), new Coord2D(6, 1, 6, 1), new Coord2D(7, 2, 7, 2), new Coord2D(7, 4, 7, 4), new Coord2D(6, 5, 6, 5), new Coord2D(4, 5, 4, 5), new Coord2D(3, 4, 3, 4), new Coord2D(3, 2, 3, 2) }), 8, 7, 5, 16, 8, ModelRendererTurbo.MR_FRONT, new float[] {2 ,2 ,2 ,2 ,2 ,2 ,2 ,2}); // Shape 60
		rightTrackModel[9].setRotationPoint(49F, 5F, 0F);

		rightTrackModel[10].addBox(0F, 0F, 0F, 57, 1, 8, 0F); // Box 62
		rightTrackModel[10].setRotationPoint(7F, -1F, -8F);

		rightTrackModel[11].addBox(0F, 0F, 0F, 58, 1, 8, 0F); // Box 65
		rightTrackModel[11].setRotationPoint(7F, 15F, -8F);

		rightTrackModel[12].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 65
		rightTrackModel[12].setRotationPoint(64F, -1F, -8F);
		rightTrackModel[12].rotateAngleZ = -0.71558499F;

		rightTrackModel[13].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 67
		rightTrackModel[13].setRotationPoint(69F, 3F, -8F);
		rightTrackModel[13].rotateAngleZ = -1.57079633F;

		rightTrackModel[14].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 69
		rightTrackModel[14].setRotationPoint(64F, 15F, -8F);
		rightTrackModel[14].rotateAngleZ = 0.76794487F;

		rightTrackModel[15].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 71
		rightTrackModel[15].setRotationPoint(2F, 3F, -8F);
		rightTrackModel[15].rotateAngleZ = 0.80285146F;

		rightTrackModel[16].addBox(0F, 0F, 0F, 8, 1, 8, 0F); // Box 72
		rightTrackModel[16].setRotationPoint(3F, 3F, -8F);
		rightTrackModel[16].rotateAngleZ = -1.57079633F;

		rightTrackModel[17].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 76
		rightTrackModel[17].setRotationPoint(6F, 16F, -8F);
		rightTrackModel[17].rotateAngleZ = 2.28638132F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}