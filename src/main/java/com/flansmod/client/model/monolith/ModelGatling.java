//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Gatling
// Model Creator: 
// Created on: 06.07.2019 - 17:27:39
// Last changed on: 06.07.2019 - 17:27:39

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGatling extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelGatling() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[15];
		turretModel = new ModelRendererTurbo[3];
		barrelModel = new ModelRendererTurbo[35];
		leftBackWheelModel = new ModelRendererTurbo[19];
		rightBackWheelModel = new ModelRendererTurbo[19];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftBackWheelModel_1();
		initrightBackWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box34
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box35
		bodyModel[2] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box129
		bodyModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Box131
		bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box132
		bodyModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Import Box108
		bodyModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box109
		bodyModel[7] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Box110
		bodyModel[8] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Import Box111
		bodyModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box112
		bodyModel[10] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Import Box113
		bodyModel[11] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Import Box114
		bodyModel[12] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Import Box115
		bodyModel[13] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Import Box116
		bodyModel[14] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Import Box123

		bodyModel[0].addBox(-29F, 12F, -4F, 29, 3, 8, 0F); // Import Box34
		bodyModel[0].setRotationPoint(-8F, -17F, 0F);
		bodyModel[0].rotateAngleZ = 0.26179939F;

		bodyModel[1].addBox(-29F, 12F, -4F, 29, 1, 8, 0F); // Import Box35
		bodyModel[1].setRotationPoint(-8F, -18F, 0F);
		bodyModel[1].rotateAngleZ = 0.26179939F;

		bodyModel[2].addBox(-4F, 10F, -27F, 4, 3, 54, 0F); // Import Box129
		bodyModel[2].setRotationPoint(-8F, -12F, 0F);
		bodyModel[2].rotateAngleZ = 0.26179939F;

		bodyModel[3].addBox(-0.25F, 11.5F, -4F, 10, 4, 8, 0F); // Import Box131
		bodyModel[3].setRotationPoint(-5F, -18F, 0F);

		bodyModel[4].addBox(-28.25F, 12F, -4F, 23, 1, 8, 0F); // Import Box132
		bodyModel[4].setRotationPoint(-8F, -14F, 0F);
		bodyModel[4].rotateAngleZ = 0.26179939F;

		bodyModel[5].addShapeBox(-49F, 12F, -4F, 20, 1, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F); // Import Box108
		bodyModel[5].setRotationPoint(-8F, -18F, 0F);
		bodyModel[5].rotateAngleZ = 0.26179939F;

		bodyModel[6].addShapeBox(-49F, 12F, -4F, 20, 3, 8, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box109
		bodyModel[6].setRotationPoint(-8F, -17F, 0F);
		bodyModel[6].rotateAngleZ = 0.26179939F;

		bodyModel[7].addShapeBox(-47.3F, 12F, -4F, 20, 1, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F); // Import Box110
		bodyModel[7].setRotationPoint(-8F, -14F, 0F);
		bodyModel[7].rotateAngleZ = 0.26179939F;

		bodyModel[8].addShapeBox(-58F, 15F, -4F, 9, 3, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box111
		bodyModel[8].setRotationPoint(-8F, -17F, 0F);
		bodyModel[8].rotateAngleZ = 0.26179939F;

		bodyModel[9].addShapeBox(-58F, 13F, -4F, 9, 1, 8, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Import Box112
		bodyModel[9].setRotationPoint(-8F, -18F, 0F);
		bodyModel[9].rotateAngleZ = 0.26179939F;

		bodyModel[10].addShapeBox(-67F, 25.98F, -4F, 14, 1, 8, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Import Box113
		bodyModel[10].setRotationPoint(-8F, -21F, 0F);
		bodyModel[10].rotateAngleZ = 0.08726646F;

		bodyModel[11].addShapeBox(-67F, 27.98F, -4F, 14, 3, 8, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box114
		bodyModel[11].setRotationPoint(-8F, -20F, 0F);
		bodyModel[11].rotateAngleZ = 0.08726646F;

		bodyModel[12].addShapeBox(-67F, 32.98F, -4F, 14, 1, 8, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Import Box115
		bodyModel[12].setRotationPoint(-8F, -26F, 0F);
		bodyModel[12].rotateAngleZ = 0.08726646F;

		bodyModel[13].addShapeBox(-58F, 20F, -4F, 9, 1, 8, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3F, 0F); // Import Box116
		bodyModel[13].setRotationPoint(-8F, -23F, 0F);
		bodyModel[13].rotateAngleZ = 0.26179939F;

		bodyModel[14].addShapeBox(-68F, 27.98F, -4F, 1, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box123
		bodyModel[14].setRotationPoint(-8F, -20F, 0F);
		bodyModel[14].rotateAngleZ = 0.08726646F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 17
		turretModel[1] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 18
		turretModel[2] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 19

		turretModel[0].addShapeBox(-1F, -0.5F, -7.5F, 3, 8, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 17
		turretModel[0].setRotationPoint(0F, -17F, 0F);

		turretModel[1].addShapeBox(-1F, -0.5F, 6.5F, 3, 8, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 18
		turretModel[1].setRotationPoint(0F, -17F, 0F);

		turretModel[2].addShapeBox(-1F, 8F, -7.5F, 3, 2, 15, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, -1.7F, 0F, 0.3F, -1.7F, 0F, 0.3F, -1.7F, 0F, 0.3F, -1.7F); // Box 19
		turretModel[2].setRotationPoint(0F, -17F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Import Box14
		barrelModel[1] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Import Box15
		barrelModel[2] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Import Box16
		barrelModel[3] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Import Box17
		barrelModel[4] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Import Box18
		barrelModel[5] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box19
		barrelModel[6] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Import Box20
		barrelModel[7] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Import Box21
		barrelModel[8] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Import Box22
		barrelModel[9] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Import Box23
		barrelModel[10] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Import Box24
		barrelModel[11] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import Box25
		barrelModel[12] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box26
		barrelModel[13] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Import Box27
		barrelModel[14] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 1
		barrelModel[15] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 2
		barrelModel[16] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 3
		barrelModel[17] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 4
		barrelModel[18] = new ModelRendererTurbo(this, 265, 89, textureX, textureY); // Box 5
		barrelModel[19] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 6
		barrelModel[20] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 7
		barrelModel[21] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 8
		barrelModel[22] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 9
		barrelModel[23] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 10
		barrelModel[24] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 11
		barrelModel[25] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 12
		barrelModel[26] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 13
		barrelModel[27] = new ModelRendererTurbo(this, 137, 97, textureX, textureY); // Box 14
		barrelModel[28] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 15
		barrelModel[29] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 16
		barrelModel[30] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 20
		barrelModel[31] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 21
		barrelModel[32] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 22
		barrelModel[33] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 23
		barrelModel[34] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 24

		barrelModel[0].addBox(-28F, -5F, -1F, 16, 10, 2, 0F); // Import Box14
		barrelModel[0].setRotationPoint(0F, -17F, 0F);

		barrelModel[1].addBox(-28F, -1F, -5F, 16, 2, 10, 0F); // Import Box15
		barrelModel[1].setRotationPoint(0F, -17F, 0F);

		barrelModel[2].addShapeBox(-28F, -5F, 1F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		barrelModel[2].setRotationPoint(0F, -17F, 0F);

		barrelModel[3].addShapeBox(-28F, -5F, -5F, 16, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box17
		barrelModel[3].setRotationPoint(0F, -17F, 0F);

		barrelModel[4].addShapeBox(-28F, 1F, 1F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Import Box18
		barrelModel[4].setRotationPoint(0F, -17F, 0F);

		barrelModel[5].addShapeBox(-28F, 1F, -5F, 16, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box19
		barrelModel[5].setRotationPoint(0F, -17F, 0F);

		barrelModel[6].addShapeBox(-30F, -6F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box20
		barrelModel[6].setRotationPoint(0F, -17F, 0F);

		barrelModel[7].addShapeBox(-30F, -6F, -1F, 2, 12, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		barrelModel[7].setRotationPoint(0F, -17F, 0F);

		barrelModel[8].addShapeBox(-30F, -6F, -6F, 2, 5, 5, 0F,0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		barrelModel[8].setRotationPoint(0F, -17F, 0F);

		barrelModel[9].addBox(-30F, -1F, -6F, 2, 2, 12, 0F); // Import Box23
		barrelModel[9].setRotationPoint(0F, -17F, 0F);

		barrelModel[10].addShapeBox(-30F, 1F, -6F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box24
		barrelModel[10].setRotationPoint(0F, -17F, 0F);

		barrelModel[11].addShapeBox(-30F, 1F, 1F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F); // Import Box25
		barrelModel[11].setRotationPoint(0F, -17F, 0F);

		barrelModel[12].addShapeBox(-33F, -1F, -1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		barrelModel[12].setRotationPoint(0F, -17F, 0F);

		barrelModel[13].addShapeBox(-35F, -2F, -2F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box27
		barrelModel[13].setRotationPoint(0F, -17F, 0F);

		barrelModel[14].addShapeBox(-12F, -4.3F, -0.5F, 45, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 1
		barrelModel[14].setRotationPoint(0F, -17F, 0F);

		barrelModel[15].addShapeBox(-12F, -2.5F, -3F, 45, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 2
		barrelModel[15].setRotationPoint(0F, -17F, 0F);

		barrelModel[16].addShapeBox(-12F, -2.5F, 2.5F, 45, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 3
		barrelModel[16].setRotationPoint(0F, -17F, 0F);

		barrelModel[17].addShapeBox(-12F, 1.5F, 2.5F, 45, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 4
		barrelModel[17].setRotationPoint(0F, -17F, 0F);

		barrelModel[18].addShapeBox(-12F, 1.5F, -3.5F, 45, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 5
		barrelModel[18].setRotationPoint(0F, -17F, 0F);

		barrelModel[19].addShapeBox(-12F, 3.2F, -0.5F, 45, 1, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 6
		barrelModel[19].setRotationPoint(0F, -17F, 0F);

		barrelModel[20].addShapeBox(22F, 1F, 1F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 7
		barrelModel[20].setRotationPoint(0F, -17F, 0F);

		barrelModel[21].addBox(22F, -5F, -1F, 2, 10, 2, 0F); // Box 8
		barrelModel[21].setRotationPoint(0F, -17F, 0F);

		barrelModel[22].addShapeBox(22F, 1F, -5F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		barrelModel[22].setRotationPoint(0F, -17F, 0F);

		barrelModel[23].addBox(22F, -1F, -5F, 2, 2, 10, 0F); // Box 10
		barrelModel[23].setRotationPoint(0F, -17F, 0F);

		barrelModel[24].addShapeBox(22F, -5F, -5F, 2, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		barrelModel[24].setRotationPoint(0F, -17F, 0F);

		barrelModel[25].addShapeBox(22F, -5F, 1F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		barrelModel[25].setRotationPoint(0F, -17F, 0F);

		barrelModel[26].addShapeBox(-29F, -0.5F, -6.5F, 65, 2, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 13
		barrelModel[26].setRotationPoint(0F, -17F, 0F);

		barrelModel[27].addShapeBox(-29F, -0.5F, 5.5F, 65, 2, 1, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 14
		barrelModel[27].setRotationPoint(0F, -17F, 0F);

		barrelModel[28].addShapeBox(-12F, -0.5F, -0.5F, 50, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 15
		barrelModel[28].setRotationPoint(0F, -17F, 0F);

		barrelModel[29].addShapeBox(34F, 0F, -6.5F, 1, 1, 12, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F); // Box 16
		barrelModel[29].setRotationPoint(0F, -17F, 0F);

		barrelModel[30].addBox(-15F, -6F, -2F, 2, 10, 4, 0F); // Box 20
		barrelModel[30].setRotationPoint(0F, -17F, 0F);

		barrelModel[31].addShapeBox(-15F, -30F, -2F, 2, 24, 4, 0F,-0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 21
		barrelModel[31].setRotationPoint(0F, -17F, 0F);

		barrelModel[32].addShapeBox(-26F, 0F, -9.5F, 1, 1, 3, 0F,0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F); // Box 22
		barrelModel[32].setRotationPoint(0F, -17F, 0F);

		barrelModel[33].addShapeBox(-26F, 0F, -9.5F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		barrelModel[33].setRotationPoint(0F, -17F, 0F);

		barrelModel[34].addShapeBox(-26F, 9F, -12.5F, 1, 1, 3, 0F,0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F); // Box 24
		barrelModel[34].setRotationPoint(0F, -17F, 0F);
	}

	private void initleftBackWheelModel_1()
	{
		leftBackWheelModel[0] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Import Box113
		leftBackWheelModel[1] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Import Box114
		leftBackWheelModel[2] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Import Box115
		leftBackWheelModel[3] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Import Box116
		leftBackWheelModel[4] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Import Box117
		leftBackWheelModel[5] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Import Box118
		leftBackWheelModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Import Box119
		leftBackWheelModel[7] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Import Box120
		leftBackWheelModel[8] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Import Box121
		leftBackWheelModel[9] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Import Box122
		leftBackWheelModel[10] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Import Box123
		leftBackWheelModel[11] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Import Box124
		leftBackWheelModel[12] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Import Box125
		leftBackWheelModel[13] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Import Box126
		leftBackWheelModel[14] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box127
		leftBackWheelModel[15] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Import Box128
		leftBackWheelModel[16] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Box129
		leftBackWheelModel[17] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box130
		leftBackWheelModel[18] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Import Box131

		leftBackWheelModel[0].addBox(-1F, -9.5F, 29F, 2, 42, 2, 0F); // Import Box113
		leftBackWheelModel[0].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[1].addShapeBox(-21F, 11.5F, 29F, 22, 2, 2, 0F,-7F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 16F, 0F, -5F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -18F, 0F); // Import Box114
		leftBackWheelModel[1].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[2].addShapeBox(-21F, -4.5F, 28F, 6, 15, 4, 0F,-5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box115
		leftBackWheelModel[2].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[3].addShapeBox(-19F, -9.5F, 28F, 18, 5, 4, 0F,-3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F); // Import Box116
		leftBackWheelModel[3].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[4].addShapeBox(-7F, 26.5F, 29F, 22, 2, 2, 0F,-7F, 16F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -7F, 16F, 0F, -5F, -18F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -18F, 0F); // Import Box117
		leftBackWheelModel[4].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[5].addShapeBox(1F, 24.5F, 28F, 17, 8, 4, 0F,0F, -6F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F); // Import Box118
		leftBackWheelModel[5].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[6].addBox(-21F, 10.5F, 29F, 42, 2, 2, 0F); // Import Box119
		leftBackWheelModel[6].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[7].addShapeBox(13F, 12.5F, 28F, 8, 17, 4, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, -3F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, -1F, -2F, 0F); // Import Box120
		leftBackWheelModel[7].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[8].addShapeBox(-19F, 27.5F, 28F, 18, 5, 4, 0F,-3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F); // Import Box121
		leftBackWheelModel[8].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[9].addShapeBox(-21F, 12.5F, 28F, 5, 18, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, -5F, -3F, 0F); // Import Box122
		leftBackWheelModel[9].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[10].addShapeBox(1F, -9.5F, 28F, 18, 5, 4, 0F,0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, -3F, 0F); // Import Box123
		leftBackWheelModel[10].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[11].addShapeBox(16F, -4.5F, 28F, 5, 15, 4, 0F,2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box124
		leftBackWheelModel[11].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[12].addShapeBox(0F, -7.5F, 29F, 20, 20, 2, 0F,0F, -18F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, -6F, -15F, 0F, -5F, -16F, 0F, 0F, 0F, 0F); // Import Box125
		leftBackWheelModel[12].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[13].addShapeBox(-14F, 7.5F, 29F, 20, 20, 2, 0F,1F, -19F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 1F, -19F, 0F, 0F, 0F, 0F, -6F, -15F, 0F, -5F, -16F, 0F, 0F, 0F, 0F); // Import Box126
		leftBackWheelModel[13].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[14].addBox(-21F, 10.5F, 28F, 2, 2, 4, 0F); // Import Box127
		leftBackWheelModel[14].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[15].addBox(-1F, -9.5F, 28F, 2, 2, 4, 0F); // Import Box128
		leftBackWheelModel[15].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[16].addBox(19F, 10.5F, 28F, 2, 2, 4, 0F); // Import Box129
		leftBackWheelModel[16].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[17].addBox(-1F, 30.5F, 28F, 2, 2, 4, 0F); // Import Box130
		leftBackWheelModel[17].setRotationPoint(-8F, -11.5F, 0F);

		leftBackWheelModel[18].addBox(-1F, 10.5F, 19F, 2, 2, 12, 0F); // Import Box131
		leftBackWheelModel[18].setRotationPoint(-8F, -11.5F, 0F);
	}

	private void initrightBackWheelModel_1()
	{
		rightBackWheelModel[0] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Import Box124
		rightBackWheelModel[1] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Import Box125
		rightBackWheelModel[2] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Import Box126
		rightBackWheelModel[3] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Import Box127
		rightBackWheelModel[4] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Import Box128
		rightBackWheelModel[5] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Import Box129
		rightBackWheelModel[6] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Import Box130
		rightBackWheelModel[7] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Import Box131
		rightBackWheelModel[8] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Import Box132
		rightBackWheelModel[9] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Import Box133
		rightBackWheelModel[10] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Import Box134
		rightBackWheelModel[11] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Import Box135
		rightBackWheelModel[12] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Import Box136
		rightBackWheelModel[13] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Import Box137
		rightBackWheelModel[14] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Import Box138
		rightBackWheelModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Import Box139
		rightBackWheelModel[16] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Import Box140
		rightBackWheelModel[17] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Import Box141
		rightBackWheelModel[18] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Import Box142

		rightBackWheelModel[0].addBox(-1F, -9.5F, -31F, 2, 42, 2, 0F); // Import Box124
		rightBackWheelModel[0].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[1].addShapeBox(-21F, 11.5F, -31F, 22, 2, 2, 0F,-7F, 16F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 16F, 0F, -5F, -18F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -18F, 0F); // Import Box125
		rightBackWheelModel[1].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[2].addShapeBox(-21F, -4.5F, -32F, 6, 15, 4, 0F,-5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box126
		rightBackWheelModel[2].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[3].addShapeBox(-19F, -9.5F, -32F, 18, 5, 4, 0F,-3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F); // Import Box127
		rightBackWheelModel[3].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[4].addShapeBox(-7F, 26.5F, -31F, 22, 2, 2, 0F,-7F, 16F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -7F, 16F, 0F, -5F, -18F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -5F, -18F, 0F); // Import Box128
		rightBackWheelModel[4].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[5].addShapeBox(1F, 24.5F, -32F, 17, 8, 4, 0F,0F, -6F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, -2F, -5F, 0F, -2F, -5F, 0F, 0F, 0F, 0F); // Import Box129
		rightBackWheelModel[5].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[6].addBox(-21F, 10.5F, -31F, 42, 2, 2, 0F); // Import Box130
		rightBackWheelModel[6].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[7].addShapeBox(13F, 12.5F, -32F, 8, 17, 4, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -1F, -3F, 0F, -5F, -2F, 0F, -5F, -2F, 0F, -1F, -2F, 0F); // Import Box131
		rightBackWheelModel[7].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[8].addShapeBox(-19F, 27.5F, -32F, 18, 5, 4, 0F,-3F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -5F, 0F); // Import Box132
		rightBackWheelModel[8].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[9].addShapeBox(-21F, 12.5F, -32F, 5, 18, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 2F, -3F, 0F, 2F, -3F, 0F, -5F, -3F, 0F); // Import Box133
		rightBackWheelModel[9].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[10].addShapeBox(1F, -9.5F, -32F, 18, 5, 4, 0F,0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, 0F, -3F, 0F); // Import Box134
		rightBackWheelModel[10].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[11].addShapeBox(16F, -4.5F, -32F, 5, 15, 4, 0F,2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Import Box135
		rightBackWheelModel[11].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[12].addShapeBox(0F, -7.5F, -31F, 20, 20, 2, 0F,0F, -18F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, -6F, -15F, 0F, -5F, -16F, 0F, 0F, 0F, 0F); // Import Box136
		rightBackWheelModel[12].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[13].addShapeBox(-14F, 7.5F, -31F, 20, 20, 2, 0F,1F, -19F, 0F, -6F, -3F, 0F, -6F, -3F, 0F, 1F, -19F, 0F, 0F, 0F, 0F, -6F, -15F, 0F, -5F, -16F, 0F, 0F, 0F, 0F); // Import Box137
		rightBackWheelModel[13].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[14].addBox(-21F, 10.5F, -32F, 2, 2, 4, 0F); // Import Box138
		rightBackWheelModel[14].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[15].addBox(-1F, -9.5F, -32F, 2, 2, 4, 0F); // Import Box139
		rightBackWheelModel[15].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[16].addBox(19F, 10.5F, -32F, 2, 2, 4, 0F); // Import Box140
		rightBackWheelModel[16].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[17].addBox(-1F, 30.5F, -32F, 2, 2, 4, 0F); // Import Box141
		rightBackWheelModel[17].setRotationPoint(-8F, -11.5F, 0F);

		rightBackWheelModel[18].addBox(-1F, 10.5F, -31F, 2, 2, 12, 0F); // Import Box142
		rightBackWheelModel[18].setRotationPoint(-8F, -11.5F, 0F);
	}
}