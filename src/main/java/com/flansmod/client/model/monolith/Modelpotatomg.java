//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelpotatomg extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelpotatomg() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[30];
		barrelModel = new ModelRendererTurbo[65];

		initbodyModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		bodyModel[1] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 9
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		bodyModel[8] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 12
		bodyModel[9] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 13
		bodyModel[10] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 14
		bodyModel[11] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 26
		bodyModel[13] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 27
		bodyModel[14] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 28
		bodyModel[15] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 29
		bodyModel[16] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Box 30
		bodyModel[17] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Box 31
		bodyModel[18] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 32
		bodyModel[19] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 34
		bodyModel[21] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 35
		bodyModel[22] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 36
		bodyModel[23] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 37
		bodyModel[24] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 38
		bodyModel[25] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 39
		bodyModel[26] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 40
		bodyModel[27] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 41
		bodyModel[28] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 42
		bodyModel[29] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 43

		bodyModel[0].addShapeBox(-0.5F, -2F, -2.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 3
		bodyModel[0].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[1].addShapeBox(-0.5F, -2F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[1].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[2].addShapeBox(-0.5F, -2F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[3].addShapeBox(-0.5F, -1F, 2F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 6
		bodyModel[3].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[4].addShapeBox(-0.5F, -1F, -3F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 7
		bodyModel[4].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[5].addShapeBox(-0.5F, 1F, -3F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[5].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[6].addShapeBox(-0.5F, 1F, 2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[6].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[7].addShapeBox(-0.5F, 1F, -2F, 1, 1, 4, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 10
		bodyModel[7].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[8].addShapeBox(-1.5F, 2F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[8].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[9].addShapeBox(-1.5F, 2F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[9].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[10].addShapeBox(-1.5F, 2F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 14
		bodyModel[10].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[11].addShapeBox(-0.5F, 1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[11].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[12].addShapeBox(-11.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 26
		bodyModel[12].setRotationPoint(11.5F, 3.3F, 0F);
		bodyModel[12].rotateAngleZ = 0.66322512F;

		bodyModel[13].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[13].setRotationPoint(11.5F, 3.3F, 0F);
		bodyModel[13].rotateAngleZ = 0.66322512F;

		bodyModel[14].addShapeBox(-11F, 9F, -1.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[14].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[15].addShapeBox(-11F, 9F, 0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 29
		bodyModel[15].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[16].addShapeBox(-11F, 9F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[16].setRotationPoint(13F, 0.5F, 0F);

		bodyModel[17].addShapeBox(0.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 31
		bodyModel[17].setRotationPoint(14F, 3.3F, -1F);
		bodyModel[17].rotateAngleY = -0.78539816F;
		bodyModel[17].rotateAngleZ = -0.66322512F;

		bodyModel[18].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[18].setRotationPoint(14F, 3.3F, -1F);
		bodyModel[18].rotateAngleY = -0.78539816F;
		bodyModel[18].rotateAngleZ = -0.66322512F;

		bodyModel[19].addShapeBox(0.5F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 33
		bodyModel[19].setRotationPoint(14F, 3.3F, 1F);
		bodyModel[19].rotateAngleY = 0.78539816F;
		bodyModel[19].rotateAngleZ = -0.66322512F;

		bodyModel[20].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[20].setRotationPoint(14F, 3.3F, 1F);
		bodyModel[20].rotateAngleY = 0.78539816F;
		bodyModel[20].rotateAngleZ = -0.66322512F;

		bodyModel[21].addShapeBox(4F, 9F, -7.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[21].setRotationPoint(14F, 0.5F, -1F);

		bodyModel[22].addShapeBox(4F, 9F, -6.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[22].setRotationPoint(14F, 0.5F, -1F);

		bodyModel[23].addShapeBox(4F, 9F, -5.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[23].setRotationPoint(14F, 0.5F, -1F);

		bodyModel[24].addShapeBox(4F, 9F, 8.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 38
		bodyModel[24].setRotationPoint(14F, 0.5F, -1F);

		bodyModel[25].addShapeBox(4F, 9F, 7.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[25].setRotationPoint(14F, 0.5F, -1F);

		bodyModel[26].addShapeBox(4F, 9F, 6.5F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[26].setRotationPoint(14F, 0.5F, -1F);

		bodyModel[27].addShapeBox(3.5F, -0.5F, -0.5F, 2, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 41
		bodyModel[27].setRotationPoint(14F, 3.3F, 1F);
		bodyModel[27].rotateAngleY = 0.78539816F;
		bodyModel[27].rotateAngleZ = -0.66322512F;

		bodyModel[28].addShapeBox(3.5F, -0.5F, -0.5F, 2, 1, 1, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 42
		bodyModel[28].setRotationPoint(14F, 3.3F, -1F);
		bodyModel[28].rotateAngleY = -0.78539816F;
		bodyModel[28].rotateAngleZ = -0.66322512F;

		bodyModel[29].addShapeBox(3.5F, 0F, -3.5F, 1, 1, 7, 0F,-0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F); // Box 43
		bodyModel[29].setRotationPoint(14F, 3.3F, 0F);
		bodyModel[29].rotateAngleZ = -0.66322512F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		barrelModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		barrelModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		barrelModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 3
		barrelModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 5
		barrelModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 6
		barrelModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 7
		barrelModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 8
		barrelModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 9
		barrelModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 11
		barrelModel[11] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 12
		barrelModel[12] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 13
		barrelModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 14
		barrelModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 15
		barrelModel[15] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		barrelModel[16] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 17
		barrelModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 18
		barrelModel[18] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 19
		barrelModel[19] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		barrelModel[20] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 35
		barrelModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 37
		barrelModel[22] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 38
		barrelModel[23] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 39
		barrelModel[24] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 44
		barrelModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 45
		barrelModel[26] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 46
		barrelModel[27] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 51
		barrelModel[28] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 52
		barrelModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 53
		barrelModel[30] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 54
		barrelModel[31] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 55
		barrelModel[32] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 56
		barrelModel[33] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 76
		barrelModel[34] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 79
		barrelModel[35] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 80
		barrelModel[36] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 81
		barrelModel[37] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 82
		barrelModel[38] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 84
		barrelModel[39] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 85
		barrelModel[40] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 86
		barrelModel[41] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 87
		barrelModel[42] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 90
		barrelModel[43] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 91
		barrelModel[44] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 93
		barrelModel[45] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 95
		barrelModel[46] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 96
		barrelModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 99
		barrelModel[48] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 105
		barrelModel[49] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 106
		barrelModel[50] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 129
		barrelModel[51] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 130
		barrelModel[52] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 131
		barrelModel[53] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 133
		barrelModel[54] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 134
		barrelModel[55] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 135
		barrelModel[56] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 89
		barrelModel[57] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 31
		barrelModel[58] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 32
		barrelModel[59] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 33
		barrelModel[60] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 34
		barrelModel[61] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 35
		barrelModel[62] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 62
		barrelModel[63] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 63
		barrelModel[64] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 64

		barrelModel[0].addShapeBox(-8.4F, -1.9F, -0.5F, 15, 2, 1, 0F,0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F, 0F, 0F, 0.23F); // Box 0
		barrelModel[0].setRotationPoint(13F, -1F, 0F);

		barrelModel[1].addShapeBox(-8.4F, -0.75F, -0.5F, 8, 1, 1, 0F,0F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Box 0
		barrelModel[1].setRotationPoint(13F, -1F, 0F);

		barrelModel[2].addShapeBox(-7.4F, -2.15F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, 0.3F, 0.75F, -0.2F, 0.3F, 0.75F, -0.2F, 0F, 0F, -0.2F, 0F, -0.1F, -0.4F, 0.3F, 0.75F, -0.4F, 0.3F, 0.75F, -0.4F, 0F, -0.1F, -0.4F, 0F); // Box 1
		barrelModel[2].setRotationPoint(13F, -1F, 0F);

		barrelModel[3].addShapeBox(-3.5F, -2.15F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0.4F, -0.1F, -0.2F, 0.25F, -0.2F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0.4F, -0.2F, -0.4F, 0.25F); // Box 2
		barrelModel[3].setRotationPoint(13F, -1F, 0F);

		barrelModel[4].addShapeBox(-8.1F, -2.15F, -1.5F, 3, 2, 2, 0F,0.3F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, -0.7F, 0.3F, -0.2F, -0.7F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 3
		barrelModel[4].setRotationPoint(13F, -1F, 0F);

		barrelModel[5].addShapeBox(-2.15F, -2.25F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, -1.2F, -0.3F, -0.2F, -1.2F, -0.3F, -0.2F, 0.45F, -0.2F, -0.2F, 0.45F, -0.2F, -0.2F, -1.2F, -0.3F, -0.2F, -1.2F); // Box 5
		barrelModel[5].setRotationPoint(13F, -1F, 0F);

		barrelModel[6].addShapeBox(-1.7F, -2.25F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.45F, -0.35F, -0.3F, 0.45F, -0.35F, -0.3F, -1.2F, -0.35F, -0.2F, -1.2F, -0.35F, -0.2F, 0.45F, -0.35F, -0.3F, 0.45F, -0.35F, -0.3F, -1.2F, -0.35F, -0.2F, -1.2F); // Box 6
		barrelModel[6].setRotationPoint(13F, -1F, 0F);

		barrelModel[7].addShapeBox(-2.25F, -2.2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.7F, 0.45F, -0.1F, -0.7F, 0.45F, -0.2F, -0.7F, 0.15F, -0.4F, -0.7F, 0.15F, -0.4F, -0.15F, 0.45F, -0.4F, -0.15F, 0.45F, -0.4F, -0.15F, 0.15F, -0.4F, -0.15F, 0.15F); // Box 7
		barrelModel[7].setRotationPoint(13F, -1F, 0F);

		barrelModel[8].addShapeBox(-2.25F, -2F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.4F, 0.45F, -0.4F, -0.4F, 0.45F, -0.4F, -0.4F, 0.15F, -0.4F, -0.4F, 0.15F, -0.4F, -0.2F, 0.45F, -0.4F, -0.2F, 0.45F, -0.4F, -0.2F, 0.15F, -0.4F, -0.2F, 0.15F); // Box 8
		barrelModel[8].setRotationPoint(13F, -1F, 0F);

		barrelModel[9].addShapeBox(-3.4F, -1.45F, -0.3F, 2, 1, 1, 0F,0F, -0.38F, 0.2F, 0.22F, -0.38F, 0.2F, 0.22F, -0.38F, 0.2F, 0F, -0.38F, 0.2F, 0F, -0.38F, 0.2F, 0.22F, -0.38F, 0.2F, 0.22F, -0.38F, 0.2F, 0F, -0.38F, 0.2F); // Box 9
		barrelModel[9].setRotationPoint(13F, -1F, 0F);

		barrelModel[10].addShapeBox(-7.4F, -2.15F, 0.15F, 5, 1, 1, 0F,-0.1F, -0.2F, -0.35F, 0.75F, -0.2F, -0.35F, 0.75F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.2F, -0.55F, -0.35F, 0.75F, -0.55F, -0.35F, 0.75F, -0.55F, -0.4F, -0.2F, -0.55F, -0.4F); // Box 11
		barrelModel[10].setRotationPoint(13F, -1F, 0F);

		barrelModel[11].addShapeBox(-2.3F, -2.15F, -0.5F, 1, 1, 1, 0F,-0.35F, -0.2F, 0.4F, -0.2F, -0.2F, 0.4F, -0.2F, -0.2F, 0.25F, -0.35F, -0.2F, 0.4F, -0.35F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0.25F, -0.35F, -0.4F, 0.4F); // Box 12
		barrelModel[11].setRotationPoint(13F, -1F, 0F);

		barrelModel[12].addShapeBox(-2.85F, -2.15F, 0.3F, 1, 1, 1, 0F,-0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.2F, -0.4F, -0.1F, -0.55F, -0.4F, -0.1F, -0.55F, -0.4F, -0.1F, -0.55F, -0.65F, -0.1F, -0.55F, -0.65F); // Box 13
		barrelModel[12].setRotationPoint(13F, -1F, 0F);

		barrelModel[13].addShapeBox(-3.8F, -1.85F, -0.3F, 1, 1, 1, 0F,-0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.2F, 0.2F, -0.41F, -0.2F, 0.2F, -0.41F, -0.2F, 0.2F, -0.41F, -0.2F, 0.2F); // Box 14
		barrelModel[13].setRotationPoint(13F, -1F, 0F);

		barrelModel[14].addShapeBox(-1.78F, -1.85F, -0.3F, 1, 1, 1, 0F,-0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.3F, 0.2F, -0.41F, -0.1F, 0.2F, -0.41F, -0.1F, 0.2F, -0.41F, -0.1F, 0.2F, -0.41F, -0.1F, 0.2F); // Box 15
		barrelModel[14].setRotationPoint(13F, -1F, 0F);

		barrelModel[15].addShapeBox(-2.07F, -1.75F, -0.35F, 1, 1, 1, 0F,-0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F); // Box 16
		barrelModel[15].setRotationPoint(13F, -1F, 0F);

		barrelModel[16].addShapeBox(-2.3F, -2.25F, -0.35F, 1, 1, 1, 0F,-0.4F, -0.4F, 0.65F, -0.4F, -0.4F, 0.65F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.65F, -0.4F, -0.4F, 0.65F, -0.4F, -0.4F, 0.2F, -0.4F, -0.4F, 0.3F); // Box 17
		barrelModel[16].setRotationPoint(13F, -1F, 0F);

		barrelModel[17].addShapeBox(-3.3F, -1.75F, -0.3F, 2, 1, 1, 0F,0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F, 0F, -0.2F, 0.05F); // Box 18
		barrelModel[17].setRotationPoint(13F, -1F, 0F);

		barrelModel[18].addShapeBox(-2.8F, -1.68F, -0.32F, 1, 1, 1, 0F,-0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.05F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F, -0.35F, -0.35F, 0.2F); // Box 19
		barrelModel[18].setRotationPoint(13F, -1F, 0F);

		barrelModel[19].addShapeBox(-11.8F, -2F, -0.5F, 4, 1, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.2F, 0.15F); // Box 20
		barrelModel[19].setRotationPoint(13F, -1F, 0F);

		barrelModel[20].addShapeBox(-8.8F, -2F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 35
		barrelModel[20].setRotationPoint(13F, -1F, 0F);

		barrelModel[21].addShapeBox(-7.4F, -1.2F, -0.46F, 3, 1, 1, 0F,0F, -0.2F, 0.3F, 0.75F, -0.2F, 0.3F, 0.75F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0.3F, 0.75F, -0.4F, 0.3F, 0.75F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 37
		barrelModel[21].setRotationPoint(13F, -1F, 0F);

		barrelModel[22].addShapeBox(-4.5F, -1.2F, -1.45F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.4F, -0.25F, -0.1F, -0.4F, -0.25F, -0.1F, -0.25F, -0.35F, -0.1F, -0.25F, -0.35F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F); // Box 38
		barrelModel[22].setRotationPoint(13F, -1F, 0F);

		barrelModel[23].addShapeBox(-3.35F, -1.75F, -0.46F, 1, 1, 1, 0F,-0.2F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.3F, 0.5F, -0.2F, 0.3F, 0.5F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 39
		barrelModel[23].setRotationPoint(13F, -1F, 0F);

		barrelModel[24].addShapeBox(-7.4F, -2.5F, -0.5F, 1, 1, 1, 0F,0.6F, -0.45F, 0F, 0.3F, -0.45F, 0F, 0.3F, -0.45F, 0F, 0.6F, -0.45F, 0F, 0.6F, -0.45F, 0F, 0.3F, -0.45F, 0F, 0.3F, -0.45F, 0F, 0.6F, -0.45F, 0F); // Box 44
		barrelModel[24].setRotationPoint(13F, -1F, 0F);

		barrelModel[25].addShapeBox(-7.4F, -2.75F, -0.05F, 1, 1, 1, 0F,0.6F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F); // Box 45
		barrelModel[25].setRotationPoint(13F, -1F, 0F);

		barrelModel[26].addShapeBox(-7.4F, -2.75F, -0.95F, 1, 1, 1, 0F,0.6F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.3F, -0.25F, -0.45F, 0.6F, -0.25F, -0.45F); // Box 46
		barrelModel[26].setRotationPoint(13F, -1F, 0F);

		barrelModel[27].addShapeBox(-1F, -2.35F, -0.5F, 9, 1, 1, 0F,0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F); // Box 51
		barrelModel[27].setRotationPoint(13F, -1F, 0F);

		barrelModel[28].addShapeBox(7F, -1.45F, -0.5F, 1, 1, 1, 0F,0.4F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.2F, -0.35F, 0.25F, 0.4F, -0.35F, 0.25F, 0.4F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.2F, -0.15F, -0.25F, 0.4F, -0.15F, -0.25F); // Box 52
		barrelModel[28].setRotationPoint(13F, -1F, 0F);

		barrelModel[29].addShapeBox(7F, -2F, -0.5F, 1, 1, 1, 0F,0.4F, -0.3F, 0.25F, 0.2F, -0.3F, 0.25F, 0.2F, -0.3F, 0.25F, 0.4F, -0.3F, 0.25F, 0.4F, -0.1F, 0.25F, 0.2F, -0.1F, 0.25F, 0.2F, -0.1F, 0.25F, 0.4F, -0.1F, 0.25F); // Box 53
		barrelModel[29].setRotationPoint(13F, -1F, 0F);

		barrelModel[30].addShapeBox(7.2F, -2.35F, -0.5F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F); // Box 54
		barrelModel[30].setRotationPoint(13F, -1F, 0F);

		barrelModel[31].addShapeBox(7.2F, -1.45F, -0.5F, 6, 1, 1, 0F,0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.35F, 0.1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 55
		barrelModel[31].setRotationPoint(13F, -1F, 0F);

		barrelModel[32].addShapeBox(8F, -2F, -0.5F, 5, 1, 1, 0F,0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.3F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F, 0.2F, -0.1F, 0.1F); // Box 56
		barrelModel[32].setRotationPoint(13F, -1F, 0F);

		barrelModel[33].addShapeBox(-0.75F, -1.9F, 0.5F, 1, 1, 1, 0F,-0.35F, 0F, 0.23F, -0.35F, 0F, 0.23F, -0.35F, 0F, 0.23F, -0.35F, 0F, 0.23F, -0.35F, -0.25F, 0.23F, -0.35F, -0.25F, 0.23F, -0.35F, -0.25F, 0.23F, -0.35F, -0.25F, 0.23F); // Box 76
		barrelModel[33].setRotationPoint(13F, -1F, 0F);

		barrelModel[34].addShapeBox(-8.1F, -2.75F, 0.05F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F); // Box 79
		barrelModel[34].setRotationPoint(13F, -1F, 0F);

		barrelModel[35].addShapeBox(-8.1F, -2.75F, -1.05F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F, -0.3F, -0.3F, -0.45F); // Box 80
		barrelModel[35].setRotationPoint(13F, -1F, 0F);

		barrelModel[36].addShapeBox(-8.3F, -2.65F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.3F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F); // Box 81
		barrelModel[36].setRotationPoint(13F, -1F, 0F);

		barrelModel[37].addShapeBox(-8.3F, -3.85F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.35F, -0.2F, -0.45F, -0.55F, -0.2F, -0.45F, -0.55F, -0.2F, -0.45F, -0.55F, -0.2F, -0.45F, -0.55F, -0.2F); // Box 82
		barrelModel[37].setRotationPoint(13F, -1F, 0F);

		barrelModel[38].addShapeBox(-8.3F, -3.85F, -0.75F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Box 84
		barrelModel[38].setRotationPoint(13F, -1F, 0F);

		barrelModel[39].addShapeBox(-8.3F, -3.85F, -0.25F, 1, 2, 1, 0F,-0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F, -0.45F, -0.35F, -0.45F); // Box 85
		barrelModel[39].setRotationPoint(13F, -1F, 0F);

		barrelModel[40].addShapeBox(-8.3F, -2.8F, -0.33F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F); // Box 86
		barrelModel[40].setRotationPoint(13F, -1F, 0F);

		barrelModel[41].addShapeBox(-8.3F, -2.8F, -0.68F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.3F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F, -0.45F, -0.55F, -0.4F); // Box 87
		barrelModel[41].setRotationPoint(13F, -1F, 0F);

		barrelModel[42].addShapeBox(-11.8F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0.18F, -0.1F, 0F, 0.18F, -0.1F, 0F, 0.18F, 0F, 0F, 0.18F, 0.8F, 0.15F, 0.18F, -0.35F, 0.15F, 0.18F, -0.35F, 0.15F, 0.18F, 0.8F, 0.15F, 0.18F); // Box 90
		barrelModel[42].setRotationPoint(13F, -1F, 0F);

		barrelModel[43].addShapeBox(-11.8F, 0F, -0.5F, 1, 1, 1, 0F,0.8F, -0.15F, 0.18F, -0.35F, -0.15F, 0.18F, -0.35F, -0.15F, 0.18F, 0.8F, -0.15F, 0.18F, 0.9F, 0.15F, 0.18F, -0.45F, 0.15F, 0.18F, -0.45F, 0.15F, 0.18F, 0.9F, 0.15F, 0.18F); // Box 91
		barrelModel[43].setRotationPoint(13F, -1F, 0F);

		barrelModel[44].addShapeBox(-11.8F, 0.75F, -0.5F, 1, 1, 1, 0F,0.9F, -0.4F, 0.18F, -0.45F, -0.4F, 0.18F, -0.45F, -0.4F, 0.18F, 0.9F, -0.4F, 0.18F, 0.7F, -0.1F, 0.18F, -0.6F, -0.1F, 0.18F, -0.6F, -0.1F, 0.18F, 0.7F, -0.1F, 0.18F); // Box 93
		barrelModel[44].setRotationPoint(13F, -1F, 0F);

		barrelModel[45].addShapeBox(-9F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.3F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.6F, -0.4F); // Box 95
		barrelModel[45].setRotationPoint(13F, -1F, 0F);

		barrelModel[46].addShapeBox(-9.4F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.45F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.45F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.45F, -0.4F); // Box 96
		barrelModel[46].setRotationPoint(13F, -1F, 0F);

		barrelModel[47].addShapeBox(4F, -1.05F, -0.5F, 3, 1, 1, 0F,0.7F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.7F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F); // Box 99
		barrelModel[47].setRotationPoint(13F, -1F, 0F);

		barrelModel[48].addShapeBox(-1.4F, 0.35F, -0.5F, 1, 1, 1, 0F,0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F); // Box 105
		barrelModel[48].setRotationPoint(13F, -1F, 0F);

		barrelModel[49].addShapeBox(-1.4F, -0.2F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, -0.3F, -0.4F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F, 0F, -0.25F, 0.3F); // Box 106
		barrelModel[49].setRotationPoint(13F, -1F, 0F);

		barrelModel[50].addShapeBox(-3.8F, 0F, 0.9F, 3, 3, 6, 0F,-0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F); // Box 129
		barrelModel[50].setRotationPoint(13F, -1F, 0F);

		barrelModel[51].addShapeBox(-3.95F, -1F, 0.9F, 1, 4, 6, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 130
		barrelModel[51].setRotationPoint(13F, -1F, 0F);

		barrelModel[52].addShapeBox(-1.75F, -1F, 0.9F, 1, 4, 6, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 131
		barrelModel[52].setRotationPoint(13F, -1F, 0F);

		barrelModel[53].addShapeBox(-3.3F, -1F, 0.5F, 2, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 133
		barrelModel[53].setRotationPoint(13F, -1F, 0F);

		barrelModel[54].addShapeBox(-3.3F, -1F, 6.3F, 2, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 134
		barrelModel[54].setRotationPoint(13F, -1F, 0F);

		barrelModel[55].addShapeBox(-3.8F, -1.4F, 1F, 3, 1, 6, 0F,-0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 135
		barrelModel[55].setRotationPoint(13F, -1F, 0F);

		barrelModel[56].addShapeBox(4F, -0.5F, -0.5F, 3, 1, 1, 0F,0.7F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.5F, -0.3F, -0.2F, 0.7F, -0.3F, -0.2F, 0.7F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.5F, -0.1F, -0.2F, 0.7F, -0.1F, -0.2F); // Box 89
		barrelModel[56].setRotationPoint(13F, -1F, 0F);

		barrelModel[57].addShapeBox(12F, -2.8F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.3F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F, -0.3F, -0.2F, -0.15F, -0.3F); // Box 31
		barrelModel[57].setRotationPoint(13F, -1F, 0F);

		barrelModel[58].addShapeBox(12F, -3.4F, -0.75F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F); // Box 32
		barrelModel[58].setRotationPoint(13F, -1F, 0F);

		barrelModel[59].addShapeBox(12F, -3.4F, -0.25F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F, -0.2F, -0.2F, -0.45F); // Box 33
		barrelModel[59].setRotationPoint(13F, -1F, 0F);

		barrelModel[60].addShapeBox(12F, -3.7F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F); // Box 34
		barrelModel[60].setRotationPoint(13F, -1F, 0F);

		barrelModel[61].addShapeBox(12F, -3.25F, -0.5F, 1, 1, 1, 0F,-0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F, -0.45F, -0.3F, -0.47F); // Box 35
		barrelModel[61].setRotationPoint(13F, -1F, 0F);

		barrelModel[62].addShapeBox(8.9F, -2.07F, -0.5F, 5, 1, 1, 0F,0.35F, -0.35F, -0.32F, 0.6F, -0.35F, -0.32F, 0.6F, -0.35F, -0.32F, 0.35F, -0.35F, -0.32F, 0.35F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.6F, -0.4F, -0.15F, 0.35F, -0.4F, -0.15F); // Box 62
		barrelModel[62].setRotationPoint(13F, -1F, 0F);

		barrelModel[63].addShapeBox(8.9F, -1.9F, -0.5F, 5, 1, 1, 0F,0.35F, -0.43F, -0.15F, 0.6F, -0.43F, -0.15F, 0.6F, -0.43F, -0.15F, 0.35F, -0.43F, -0.15F, 0.35F, -0.43F, -0.15F, 0.6F, -0.43F, -0.15F, 0.6F, -0.43F, -0.15F, 0.35F, -0.43F, -0.15F); // Box 63
		barrelModel[63].setRotationPoint(13F, -1F, 0F);

		barrelModel[64].addShapeBox(8.9F, -1.78F, -0.5F, 5, 1, 1, 0F,0.35F, -0.45F, -0.15F, 0.6F, -0.45F, -0.15F, 0.6F, -0.45F, -0.15F, 0.35F, -0.45F, -0.15F, 0.35F, -0.3F, -0.32F, 0.6F, -0.3F, -0.32F, 0.6F, -0.3F, -0.32F, 0.35F, -0.3F, -0.32F); // Box 64
		barrelModel[64].setRotationPoint(13F, -1F, 0F);
	}
}