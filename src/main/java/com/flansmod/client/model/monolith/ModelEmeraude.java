//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Emeraude
// Model Creator: 
// Created on: 22.07.2020 - 09:00:10
// Last changed on: 22.07.2020 - 09:00:10

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEmeraude extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelEmeraude() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[32];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 139, 0, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 139, 0, textureX, textureY); // Box 32

		bodyModel[0].addShapeBox(0F, 0F, 0F, 35, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-11F, 8F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 35, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-11F, 10F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 3
		bodyModel[2].setRotationPoint(-11F, 14F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 19, 3, 8, 0F,0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, 0F); // Box 4
		bodyModel[3].setRotationPoint(24F, 8F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, -0.5F, -3F, -7F, -0.5F, -3F, 0F, 0F, -2F); // Box 5
		bodyModel[4].setRotationPoint(24F, 14F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, 0F, 0F, 8F, 0F, -2F, 8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(24F, 10F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 32, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -2F); // Box 7
		bodyModel[6].setRotationPoint(-43F, 8F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 24, 4, 8, 0F,8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, -2F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -2F); // Box 8
		bodyModel[7].setRotationPoint(-35F, 10F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 18, 2, 8, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -7F, -0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, -7F, -0.5F, -3F); // Box 9
		bodyModel[8].setRotationPoint(-29F, 14F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-7F, 4F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-7F, 6F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 12
		bodyModel[11].setRotationPoint(-10F, 4F, -1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 13, 1, 3, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 13
		bodyModel[12].setRotationPoint(-8F, 3.2F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.3F, -0.4F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.4F); // Box 14
		bodyModel[13].setRotationPoint(-15F, 3.2F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.3F, 0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0.2F); // Box 15
		bodyModel[14].setRotationPoint(5F, 3.2F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-40F, 12F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 17
		bodyModel[16].setRotationPoint(-34.8F, 11.2F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.8F, -0.2F, -0.2F); // Box 18
		bodyModel[17].setRotationPoint(-34.8F, 15F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 19
		bodyModel[18].setRotationPoint(-42F, 13F, -1.7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 20
		bodyModel[19].setRotationPoint(-42F, 13F, 0.7F);

		bodyModel[20].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F); // Box 21
		bodyModel[20].setRotationPoint(-42F, 13.5F, -1.2F);

		bodyModel[21].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F); // Box 22
		bodyModel[21].setRotationPoint(-42F, 13.5F, -1.2F);
		bodyModel[21].rotateAngleX = 2.0943951F;

		bodyModel[22].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F); // Box 23
		bodyModel[22].setRotationPoint(-42F, 13.5F, -1.2F);
		bodyModel[22].rotateAngleX = 4.1887902F;

		bodyModel[23].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F); // Box 24
		bodyModel[23].setRotationPoint(-42F, 13.5F, 1.2F);
		bodyModel[23].rotateAngleX = 4.1887902F;

		bodyModel[24].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F); // Box 25
		bodyModel[24].setRotationPoint(-42F, 13.5F, 1.2F);
		bodyModel[24].rotateAngleX = 2.0943951F;

		bodyModel[25].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F); // Box 26
		bodyModel[25].setRotationPoint(-42F, 13.5F, 1.2F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 27
		bodyModel[26].setRotationPoint(8F, 3.2F, 0.3F);
		bodyModel[26].rotateAngleZ = -0.36651914F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 28
		bodyModel[27].setRotationPoint(-13.5F, 3.2F, 0.3F);
		bodyModel[27].rotateAngleZ = -1.57079633F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 29
		bodyModel[28].setRotationPoint(-13.5F, 3.2F, -1.3F);
		bodyModel[28].rotateAngleZ = -1.57079633F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 30
		bodyModel[29].setRotationPoint(8F, 3.2F, -1.3F);
		bodyModel[29].rotateAngleZ = -0.36651914F;

		bodyModel[30].addShapeBox(0F, 0F, -1F, 54, 90, 1, 0F,0F, 0F, 0F, -51F, 0F, 0F, -51F, 0F, 0F, 0F, 0F, 0F, 0F, -85F, 0F, -51F, -85F, 0F, -51F, -85F, 0F, 0F, -85F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-5F, 7.2F, 1.55F);
		bodyModel[30].rotateAngleZ = 1.57079633F;

		bodyModel[31].addShapeBox(0F, 0F, -1F, 54, 90, 1, 0F,0F, 0F, 0F, -51F, 0F, 0F, -51F, 0F, 0F, 0F, 0F, 0F, 0F, -85F, 0F, -51F, -85F, 0F, -51F, -85F, 0F, 0F, -85F, 0F); // Box 32
		bodyModel[31].setRotationPoint(0F, 7.2F, -1.55F);
		bodyModel[31].rotateAngleY = -3.14159265F;
		bodyModel[31].rotateAngleZ = 1.57079633F;
	}
}