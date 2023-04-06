//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMonsMeg extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelMonsMeg() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];
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
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 27

		bodyModel[0].addShapeBox(0F, 0F, 0F, 60, 5, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 0
		bodyModel[0].setRotationPoint(-22F, -11F, -8F);

		bodyModel[1].addShapeBox(0F, -5F, 0F, 60, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-22F, -12F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 60, 5, 16, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(-22F, -22F, -8F);

		bodyModel[3].addShapeBox(0F, -5F, 0F, 46, 16, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-24F, -4F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F,0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 4
		bodyModel[4].setRotationPoint(38F, -22.5F, -8F);

		bodyModel[5].addShapeBox(0F, -5F, 0F, 6, 7, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(38F, -12.5F, -8.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 7
		bodyModel[6].setRotationPoint(38F, -10.5F, -8F);

		bodyModel[7].addShapeBox(0F, -5F, 0F, 24, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-46F, -11.5F, -7F);

		bodyModel[8].addShapeBox(0F, -10F, 0F, 24, 5, 14, 0F,0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-46F, -11.5F, -7F);

		bodyModel[9].addShapeBox(0F, -10F, 0F, 24, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F); // Box 10
		bodyModel[9].setRotationPoint(-46F, -1.5F, -7F);

		bodyModel[10].addShapeBox(0F, -5F, 0F, 14, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-38F, -2F, -13F);

		bodyModel[11].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(16F, 3F, -21F);

		bodyModel[12].addShapeBox(-1.5F, -1.5F, 0F, 3, 3, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[12].setRotationPoint(-27F, 3F, -21F);

		bodyModel[13].addShapeBox(0F, -5F, 0F, 4, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[13].setRotationPoint(22F, -4F, -13F);

		bodyModel[14].addShapeBox(0F, -5F, 0F, 4, 16, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[14].setRotationPoint(22F, -4F, 4F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 12
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 13
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 14
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 105, 121, textureX, textureY); // Box 15
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 16
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 17

		leftBackWheelModel[0].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		leftBackWheelModel[0].setRotationPoint(16F, 3F, 13F);

		leftBackWheelModel[1].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 13
		leftBackWheelModel[1].setRotationPoint(16F, 3F, 13F);

		leftBackWheelModel[2].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftBackWheelModel[2].setRotationPoint(16F, 3F, 13F);

		leftBackWheelModel[3].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 15
		leftBackWheelModel[3].setRotationPoint(-27F, 3F, 13F);

		leftBackWheelModel[4].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftBackWheelModel[4].setRotationPoint(-27F, 3F, 13F);

		leftBackWheelModel[5].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		leftBackWheelModel[5].setRotationPoint(-27F, 3F, 13F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 89, 137, textureX, textureY); // Box 18
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 19
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 20
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 21
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 22
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 23

		rightBackWheelModel[0].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		rightBackWheelModel[0].setRotationPoint(-27F, 3F, -18F);

		rightBackWheelModel[1].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 19
		rightBackWheelModel[1].setRotationPoint(-27F, 3F, -18F);

		rightBackWheelModel[2].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		rightBackWheelModel[2].setRotationPoint(-27F, 3F, -18F);

		rightBackWheelModel[3].addShapeBox(-7.5F, 2.5F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 21
		rightBackWheelModel[3].setRotationPoint(16F, 3F, -18F);

		rightBackWheelModel[4].addShapeBox(-7.5F, -2.5F, 0F, 15, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		rightBackWheelModel[4].setRotationPoint(16F, 3F, -18F);

		rightBackWheelModel[5].addShapeBox(-7.5F, -7.5F, 0F, 15, 5, 5, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		rightBackWheelModel[5].setRotationPoint(16F, 3F, -18F);
	}
}