//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFieldBombard extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelFieldBombard() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[14];
		barrelModel = new ModelRendererTurbo[13];
		leftBackWheelModel = new ModelRendererTurbo[6];
		rightBackWheelModel = new ModelRendererTurbo[6];

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
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		bodyModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 70
		bodyModel[4] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 74
		bodyModel[5] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 78
		bodyModel[6] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 48
		bodyModel[7] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 49
		bodyModel[8] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Box 50
		bodyModel[9] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 51
		bodyModel[10] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 52
		bodyModel[11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 8
		bodyModel[12] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 9
		bodyModel[13] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 10

		bodyModel[0].addShapeBox(0F, 0F, 0F, 74, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[0].setRotationPoint(-55.5F, 5.5F, -13.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 74, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[1].setRotationPoint(-55.5F, 5.5F, 8.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 4, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[2].setRotationPoint(-50.5F, 5.5F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[3].setRotationPoint(12.5F, 5.5F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 16, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 74
		bodyModel[4].setRotationPoint(-2.5F, -10F, -12.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 5, 16, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 78
		bodyModel[5].setRotationPoint(-2.5F, -10F, 9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 4, 25, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 48
		bodyModel[6].setRotationPoint(-40.5F, 5.5F, -12.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 4, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[7].setRotationPoint(-2.5F, -4F, 9.5F);
		bodyModel[7].rotateAngleZ = 0.78539816F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[8].setRotationPoint(-2.5F, -4F, -12.5F);
		bodyModel[8].rotateAngleZ = 0.78539816F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[9].setRotationPoint(-0.5F, -7F, 9.5F);
		bodyModel[9].rotateAngleZ = -0.78539816F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[10].setRotationPoint(-0.5F, -7F, -12.5F);
		bodyModel[10].rotateAngleZ = -0.78539816F;

		bodyModel[11].addShapeBox(-42F, -6F, -4F, 3, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[11].setRotationPoint(0F, -7.5F, 0F);
		bodyModel[11].rotateAngleZ = 0.29670597F;

		bodyModel[12].addShapeBox(-42F, -6F, -4F, 3, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[12].setRotationPoint(0F, -7.5F, 0F);
		bodyModel[12].rotateAngleZ = 0.10471976F;

		bodyModel[13].addShapeBox(-42F, -6F, -4F, 3, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[13].setRotationPoint(0F, -7.5F, 0F);
		bodyModel[13].rotateAngleZ = -0.08726646F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 1
		barrelModel[1] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 2
		barrelModel[2] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 3
		barrelModel[3] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 4
		barrelModel[4] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 5
		barrelModel[5] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 6
		barrelModel[6] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 7
		barrelModel[7] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 12
		barrelModel[8] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 13
		barrelModel[9] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 14
		barrelModel[10] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 15
		barrelModel[11] = new ModelRendererTurbo(this, 193, 97, textureX, textureY); // Box 16
		barrelModel[12] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 17

		barrelModel[0].addShapeBox(-11F, -2F, 6F, 17, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		barrelModel[0].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[1].addShapeBox(-46F, -2F, 5F, 35, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		barrelModel[1].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[2].addShapeBox(-46F, -2F, -9F, 35, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		barrelModel[2].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[3].addShapeBox(-11F, -2F, -9F, 17, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 4
		barrelModel[3].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[4].addShapeBox(-10F, -5F, -6F, 20, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		barrelModel[4].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[5].addShapeBox(-10F, -9F, -6F, 20, 4, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		barrelModel[5].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[6].addShapeBox(-10F, -1F, -6F, 20, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 7
		barrelModel[6].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[7].addShapeBox(-45F, -1.5F, -6F, 2, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[7].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[8].addShapeBox(-25F, -4.5F, -4.5F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		barrelModel[8].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[9].addShapeBox(-25F, -1.5F, -4.5F, 15, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 14
		barrelModel[9].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[10].addShapeBox(-25F, -7.5F, -4.5F, 15, 3, 9, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[10].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[11].addShapeBox(-29F, -4F, -8F, 4, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		barrelModel[11].setRotationPoint(0F, -7.5F, 0F);

		barrelModel[12].addShapeBox(-41.2F, -0.5F, -9.5F, 1, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		barrelModel[12].setRotationPoint(0F, -7.5F, 0F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 60
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 61
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 62
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 66
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 67
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 68

		leftBackWheelModel[0].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 60
		leftBackWheelModel[0].setRotationPoint(0F, 7.5F, 13.5F);

		leftBackWheelModel[1].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		leftBackWheelModel[1].setRotationPoint(0F, 7.5F, 13.5F);

		leftBackWheelModel[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		leftBackWheelModel[2].setRotationPoint(0F, 7.5F, 13.5F);

		leftBackWheelModel[3].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		leftBackWheelModel[3].setRotationPoint(-48.5F, 7.5F, 13.5F);

		leftBackWheelModel[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		leftBackWheelModel[4].setRotationPoint(-48.5F, 7.5F, 13.5F);

		leftBackWheelModel[5].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 68
		leftBackWheelModel[5].setRotationPoint(-48.5F, 7.5F, 13.5F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 45
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 46
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 47
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 57
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 58
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 59

		rightBackWheelModel[0].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		rightBackWheelModel[0].setRotationPoint(-48.5F, 7.5F, -17.5F);

		rightBackWheelModel[1].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 46
		rightBackWheelModel[1].setRotationPoint(-48.5F, 7.5F, -17.5F);

		rightBackWheelModel[2].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		rightBackWheelModel[2].setRotationPoint(-48.5F, 7.5F, -17.5F);

		rightBackWheelModel[3].addShapeBox(-4.5F, 1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 57
		rightBackWheelModel[3].setRotationPoint(0F, 7.5F, -17.5F);

		rightBackWheelModel[4].addShapeBox(-4.5F, -1.5F, 0F, 9, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		rightBackWheelModel[4].setRotationPoint(0F, 7.5F, -17.5F);

		rightBackWheelModel[5].addShapeBox(-4.5F, -4.5F, 0F, 9, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightBackWheelModel[5].setRotationPoint(0F, 7.5F, -17.5F);
	}
}