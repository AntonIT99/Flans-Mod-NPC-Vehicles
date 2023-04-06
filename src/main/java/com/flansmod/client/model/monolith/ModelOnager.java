//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Onager
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOnager extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelOnager() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[20];
		leftBackWheelModel = new ModelRendererTurbo[6];
		rightBackWheelModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[2] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 70
		bodyModel[4] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 74
		bodyModel[5] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 78
		bodyModel[6] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 90
		bodyModel[7] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 47
		bodyModel[8] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 48
		bodyModel[9] = new ModelRendererTurbo(this, 233, 49, textureX, textureY); // Box 49
		bodyModel[10] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 50
		bodyModel[11] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Box 51
		bodyModel[12] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 52
		bodyModel[13] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 53
		bodyModel[14] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 54
		bodyModel[15] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 55
		bodyModel[16] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 56
		bodyModel[17] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 57
		bodyModel[18] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 58
		bodyModel[19] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 59

		bodyModel[0].addShapeBox(0F, 0F, 0F, 80, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[0].setRotationPoint(-40F, 3.5F, -17.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 80, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[1].setRotationPoint(-40F, 3.5F, 12.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[2].setRotationPoint(-40F, 3.5F, -12.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[3].setRotationPoint(36F, 3.5F, -12.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[4].setRotationPoint(1F, -16F, -16.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 20, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[5].setRotationPoint(1F, -16F, 13.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 5, 3, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[6].setRotationPoint(1F, -19F, -16.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 4, 35, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[7].setRotationPoint(6F, -1F, -17.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 4, 33, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 48
		bodyModel[8].setRotationPoint(-5F, 3.5F, -16.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 38, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[9].setRotationPoint(1F, -10F, 13.5F);
		bodyModel[9].rotateAngleZ = 1.09955743F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 38, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[10].setRotationPoint(1F, -10F, -16.5F);
		bodyModel[10].rotateAngleZ = 1.09955743F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 38, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[11].setRotationPoint(4F, -13F, 13.5F);
		bodyModel[11].rotateAngleZ = -1.09955743F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 38, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[12].setRotationPoint(4F, -13F, -16.5F);
		bodyModel[12].rotateAngleZ = -1.09955743F;

		bodyModel[13].addShapeBox(0.5F, 4F, 0F, 2, 35, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[13].setRotationPoint(-20F, -30F, -1.5F);
		bodyModel[13].rotateAngleZ = 0.41887902F;

		bodyModel[14].addShapeBox(-1.5F, -6F, -2F, 4, 10, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[14].setRotationPoint(-20F, -30F, -2.5F);
		bodyModel[14].rotateAngleZ = 0.41887902F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 3, 37, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[15].setRotationPoint(6F, -16F, -18.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[16].setRotationPoint(1F, -16F, -24.5F);
		bodyModel[16].rotateAngleY = 0.73303829F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[17].setRotationPoint(0F, -16F, 23F);
		bodyModel[17].rotateAngleY = -0.73303829F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[18].setRotationPoint(-14F, -15F, 0F);
		bodyModel[18].rotateAngleY = -1.02974426F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 28, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[19].setRotationPoint(-13F, -15F, -1F);
		bodyModel[19].rotateAngleY = 1.02974426F;
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 60
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 61
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 62
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 66
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 67
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 68

		leftBackWheelModel[0].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 60
		leftBackWheelModel[0].setRotationPoint(24F, 5.5F, 17.5F);

		leftBackWheelModel[1].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftBackWheelModel[1].setRotationPoint(24F, 5.5F, 17.5F);

		leftBackWheelModel[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftBackWheelModel[2].setRotationPoint(24F, 5.5F, 17.5F);

		leftBackWheelModel[3].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftBackWheelModel[3].setRotationPoint(-24F, 5.5F, 17.5F);

		leftBackWheelModel[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftBackWheelModel[4].setRotationPoint(-24F, 5.5F, 17.5F);

		leftBackWheelModel[5].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 68
		leftBackWheelModel[5].setRotationPoint(-24F, 5.5F, 17.5F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 45
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 46
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 47
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 57
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 58
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 59

		rightBackWheelModel[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		rightBackWheelModel[0].setRotationPoint(-24F, 5.5F, -21.5F);

		rightBackWheelModel[1].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 46
		rightBackWheelModel[1].setRotationPoint(-24F, 5.5F, -21.5F);

		rightBackWheelModel[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightBackWheelModel[2].setRotationPoint(-24F, 5.5F, -21.5F);

		rightBackWheelModel[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 57
		rightBackWheelModel[3].setRotationPoint(24F, 5.5F, -21.5F);

		rightBackWheelModel[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightBackWheelModel[4].setRotationPoint(24F, 5.5F, -21.5F);

		rightBackWheelModel[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightBackWheelModel[5].setRotationPoint(24F, 5.5F, -21.5F);
	}
}