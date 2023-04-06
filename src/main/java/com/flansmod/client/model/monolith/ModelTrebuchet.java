//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Treuchet
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTrebuchet extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelTrebuchet() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];
		bodyDoorOpenModel = new ModelRendererTurbo[10];
		bodyDoorCloseModel = new ModelRendererTurbo[11];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 20
		bodyModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 21
		bodyModel[2] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 25
		bodyModel[3] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Box 26
		bodyModel[4] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 27
		bodyModel[5] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 28
		bodyModel[6] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 29
		bodyModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 30
		bodyModel[8] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 31
		bodyModel[9] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 32
		bodyModel[10] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 33
		bodyModel[11] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 34
		bodyModel[12] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 35
		bodyModel[13] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 36
		bodyModel[14] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 37
		bodyModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 38
		bodyModel[16] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 39
		bodyModel[17] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 40
		bodyModel[18] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 41
		bodyModel[19] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 42
		bodyModel[20] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 43
		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 44
		bodyModel[22] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 45

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 2, 18, 0F,0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 20
		bodyModel[0].setRotationPoint(1.5F, -50F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 4, 72, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[1].setRotationPoint(0.5F, -61F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 72, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[2].setRotationPoint(0.5F, -61F, 9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 3, 62, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F); // Box 26
		bodyModel[3].setRotationPoint(0.5F, -51F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 62, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F); // Box 27
		bodyModel[4].setRotationPoint(0.5F, -51F, 9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 62, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F); // Box 28
		bodyModel[5].setRotationPoint(1F, -51F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 62, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F); // Box 29
		bodyModel[6].setRotationPoint(0.5F, -51F, 9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 62, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 18F, 0F, 0F, 18F, 0F, 0F, -18F, 0F, 0F, -18F); // Box 30
		bodyModel[7].setRotationPoint(1F, -51F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 62, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, 0F, 18F, 0F, 0F, 18F); // Box 31
		bodyModel[8].setRotationPoint(1F, -51F, 10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 106, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[9].setRotationPoint(-62.5F, 7F, -13.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 106, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[10].setRotationPoint(-62.5F, 7F, 8.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[11].setRotationPoint(-49.5F, -7F, -13.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[12].setRotationPoint(-49.5F, -7F, 8.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[13].setRotationPoint(-48.5F, -6F, -16F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[14].setRotationPoint(-48F, -11F, -15.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[15].setRotationPoint(-48F, -4F, -15.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[16].setRotationPoint(-46.5F, -5.5F, -15.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[17].setRotationPoint(-53.5F, -5.5F, -15.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[18].setRotationPoint(-48F, -11F, 14.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[19].setRotationPoint(-48F, -4F, 14.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[20].setRotationPoint(-46.5F, -5.5F, 14.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[21].setRotationPoint(-53.5F, -5.5F, 14.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[22].setRotationPoint(-49F, -6.5F, -6F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 47
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 48
		bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 193, 100, textureX, textureY); // Box 50
		bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 209, 100, textureX, textureY); // Box 51
		bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 52
		bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 53
		bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 55
		bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 56
		bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 57

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 7, 5, 14, 0F,12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyDoorOpenModel[0].setRotationPoint(-1.5F, -4F, -7F);

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 31, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyDoorOpenModel[1].setRotationPoint(-13.5F, -13F, -7F);

		bodyDoorOpenModel[2].addShapeBox(0F, 0F, 0F, 7, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F); // Box 49
		bodyDoorOpenModel[2].setRotationPoint(-1.5F, -25F, -7F);

		bodyDoorOpenModel[3].addShapeBox(0F, 0F, 0F, 3, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyDoorOpenModel[3].setRotationPoint(0.5F, -42F, -8F);

		bodyDoorOpenModel[4].addShapeBox(0F, 0F, 0F, 3, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyDoorOpenModel[4].setRotationPoint(0.5F, -42F, 7F);

		bodyDoorOpenModel[5].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 52
		bodyDoorOpenModel[5].setRotationPoint(1.5F, -50F, -7F);
		bodyDoorOpenModel[5].rotateAngleZ = -1.3962634F;

		bodyDoorOpenModel[6].addShapeBox(-75F, -11F, 0F, 88, 4, 4, 0F,0F, -1F, -1F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -1F, -1F); // Box 53
		bodyDoorOpenModel[6].setRotationPoint(4F, -52F, -2F);
		bodyDoorOpenModel[6].rotateAngleZ = -1.41371669F;

		bodyDoorOpenModel[7].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 55
		bodyDoorOpenModel[7].setRotationPoint(0.5F, -152F, -0.5F);

		bodyDoorOpenModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F); // Box 56
		bodyDoorOpenModel[8].setRotationPoint(0.5F, -156F, -0.5F);

		bodyDoorOpenModel[9].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyDoorOpenModel[9].setRotationPoint(0.5F, -148F, -0.5F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 13
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 193, 100, textureX, textureY); // Box 14
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 209, 100, textureX, textureY); // Box 15
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 16
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 17
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 18
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 19
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 22
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 23
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 24
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 46

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 88, 4, 4, 0F,0F, -1F, -1F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, -1F, -1F); // Box 13
		bodyDoorCloseModel[0].setRotationPoint(-73F, -63F, -2F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 3, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyDoorCloseModel[1].setRotationPoint(9.5F, -53F, -8F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 3, 21, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyDoorCloseModel[2].setRotationPoint(9.5F, -53F, 7F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 7, 12, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F); // Box 16
		bodyDoorCloseModel[3].setRotationPoint(7.5F, -36F, -7F);

		bodyDoorCloseModel[4].addShapeBox(0F, 0F, 0F, 31, 9, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyDoorCloseModel[4].setRotationPoint(-4.5F, -24F, -7F);

		bodyDoorCloseModel[5].addShapeBox(0F, 0F, 0F, 7, 5, 14, 0F,12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyDoorCloseModel[5].setRotationPoint(7.5F, -15F, -7F);

		bodyDoorCloseModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 19
		bodyDoorCloseModel[6].setRotationPoint(1.5F, -50F, -7F);

		bodyDoorCloseModel[7].addShapeBox(0F, 0F, 0F, 1, 22, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 22
		bodyDoorCloseModel[7].setRotationPoint(-72F, -60F, -0.5F);

		bodyDoorCloseModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F); // Box 23
		bodyDoorCloseModel[8].setRotationPoint(-72F, -38F, -0.5F);

		bodyDoorCloseModel[9].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 3F, 0F, 3F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 24
		bodyDoorCloseModel[9].setRotationPoint(-72F, -34F, -0.5F);

		bodyDoorCloseModel[10].addShapeBox(0F, 0F, 0F, 1, 52, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 46
		bodyDoorCloseModel[10].setRotationPoint(-47F, -6.5F, -0.5F);
		bodyDoorCloseModel[10].rotateAngleZ = 3.31612558F;
	}
}