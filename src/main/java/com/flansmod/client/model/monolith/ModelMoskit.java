//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Moskit
// Model Creator: 
// Created on: 17.10.2020 - 02:19:54
// Last changed on: 17.10.2020 - 02:19:54

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMoskit extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelMoskit() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[50];
		turretModel = new ModelRendererTurbo[2];
		barrelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 48
		bodyModel[1] = new ModelRendererTurbo(this, 100, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 16
		bodyModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 35
		bodyModel[30] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 36
		bodyModel[31] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 37
		bodyModel[32] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 38
		bodyModel[33] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 39
		bodyModel[34] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 40
		bodyModel[35] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 41
		bodyModel[36] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 42
		bodyModel[37] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 43
		bodyModel[38] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 44
		bodyModel[39] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 45
		bodyModel[40] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 46
		bodyModel[41] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 47
		bodyModel[42] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 48
		bodyModel[43] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 49
		bodyModel[44] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 50
		bodyModel[45] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 51
		bodyModel[46] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 52
		bodyModel[47] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 53
		bodyModel[48] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 54
		bodyModel[49] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 55

		bodyModel[0].addShapeBox(0F, 0F, 0F, 32, 5, 13, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -1.5F, -0.5F, 0F); // Box 48
		bodyModel[0].setRotationPoint(-31F, 1F, -6.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 13, 4, 13, 0F,0F, 0.5F, 0F, 3F, 2F, 0F, 3F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, -0.25F, 3F, -1.25F, -0.75F, 3F, -1.25F, -0.75F, 0F, 0.25F, -0.25F); // Box 2
		bodyModel[1].setRotationPoint(1F, 1F, -6.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F,0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0.75F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0.75F, -0.75F); // Box 3
		bodyModel[2].setRotationPoint(17F, -1F, -6.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 4, 13, 0F,0F, 0.5F, -0.75F, 0F, 0.75F, -2F, 0F, 0.75F, -2F, 0F, 0.5F, -0.75F, 0F, 0F, -1.75F, 0F, -1F, -3.75F, 0F, -1F, -3.75F, 0F, 0F, -1.75F); // Box 4
		bodyModel[3].setRotationPoint(22F, -1F, -6.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 4, 13, 0F,0F, 0.75F, -2F, 0F, 0.75F, -4F, 0F, 0.75F, -4F, 0F, 0.75F, -2F, 0F, -1F, -3.75F, 0F, -1.5F, -5.5F, 0F, -1.5F, -5.5F, 0F, -1F, -3.75F); // Box 5
		bodyModel[4].setRotationPoint(26F, -1F, -6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0.75F, 0.5F, 0.5F, 0.75F, -1.75F, 0.5F, 0.75F, -1.75F, 0F, 0.75F, 0.5F, 0F, -1.5F, -1F, -0.75F, -1.75F, -1.75F, -0.75F, -1.75F, -1.75F, 0F, -1.5F, -1F); // Box 6
		bodyModel[5].setRotationPoint(29F, -1F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 22, 2, 13, 0F,-1.5F, -0.5F, 0F, 0F, -0.33F, -0.17F, 0F, -0.33F, -0.17F, -1.5F, -0.5F, 0F, -16.75F, 0F, -4.75F, 0F, 0.25F, -3.75F, 0F, 0.25F, -3.75F, -16.75F, 0F, -4.75F); // Box 7
		bodyModel[6].setRotationPoint(-31F, 5F, -6.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 2, 13, 0F,0F, -0.33F, -0.17F, -2F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.33F, -0.17F, 0F, 0.25F, -3.75F, -1.75F, 0F, -3F, -1.75F, 0F, -3F, 0F, 0.25F, -3.75F); // Box 8
		bodyModel[7].setRotationPoint(-9F, 5F, -6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 16, 2, 13, 0F,0F, 0.25F, -0.25F, 0F, 1.75F, -0.75F, 0F, 1.75F, -0.75F, 0F, 0.25F, -0.25F, -0.25F, -0.5F, -3F, 0F, -0.25F, -3.75F, 0F, -0.25F, -3.75F, -0.25F, -0.5F, -3F); // Box 9
		bodyModel[8].setRotationPoint(1F, 5.5F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 5, 3, 13, 0F,0F, 0.25F, -0.75F, 0F, 1F, -1.75F, 0F, 1F, -1.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -3.75F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0.25F, -3.75F); // Box 10
		bodyModel[9].setRotationPoint(17F, 4F, -6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 13, 0F,0F, -1F, -1.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, -1F, -1.75F, 0F, 1.5F, -5F, 0F, 0F, -5.75F, 0F, 0F, -5.75F, 0F, 1.5F, -5F); // Box 11
		bodyModel[10].setRotationPoint(22F, 2F, -6.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 3, 13, 0F,0F, 0F, -3.75F, 0F, 0.5F, -5.5F, 0F, 0.5F, -5.5F, 0F, 0F, -3.75F, 0F, 1F, -5.75F, 0F, -2F, -6F, 0F, -2F, -6F, 0F, 1F, -5.75F); // Box 12
		bodyModel[11].setRotationPoint(26F, 2F, -6.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, -0.5F, -1F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.5F, -1F, 0F, 1F, -1.5F, -1.25F, 0.1F, -1.75F, -1.25F, 0.1F, -1.75F, 0F, 1F, -1.5F); // Box 13
		bodyModel[12].setRotationPoint(29F, 1F, -2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 24, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[13].setRotationPoint(-22F, -3F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 17
		bodyModel[14].setRotationPoint(2F, -3F, -2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[15].setRotationPoint(5F, -3F, -3F);

		bodyModel[16].addShapeBox(0F, -1F, 0F, 4, 7, 8, 0F,1F, 0.5F, 0F, -4F, 0.25F, -2F, -4F, 0.25F, -4F, 1F, 0.5F, -2F, 0.5F, 0F, 0F, -3F, -2F, -2F, -3F, -2F, -4F, 0.5F, -2F, -2F); // Box 19
		bodyModel[16].setRotationPoint(11F, -3F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 20
		bodyModel[17].setRotationPoint(3F, -5.5F, -2F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F, 0.2F, 3F, 0.2F); // Box 21
		bodyModel[18].setRotationPoint(1F, -13.5F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-8F, -3.2F, 2.9F);
		bodyModel[19].rotateAngleZ = 0.17453293F;

		bodyModel[20].addShapeBox(0F, 1F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[20].setRotationPoint(-8F, -3.2F, 2.9F);
		bodyModel[20].rotateAngleZ = 0.17453293F;

		bodyModel[21].addShapeBox(0F, 2F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 24
		bodyModel[21].setRotationPoint(-8F, -3.2F, 2.9F);
		bodyModel[21].rotateAngleZ = 0.17453293F;

		bodyModel[22].addShapeBox(0F, 2F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 25
		bodyModel[22].setRotationPoint(-6F, -4.2F, 2.9F);

		bodyModel[23].addShapeBox(0F, 2F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 26
		bodyModel[23].setRotationPoint(-2.5F, -4.2F, 2.9F);
		bodyModel[23].rotateAngleZ = 0.17453293F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(-29F, -1F, -1.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(-29F, -2F, -1.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 29
		bodyModel[26].setRotationPoint(-29F, -3F, -1.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 30
		bodyModel[27].setRotationPoint(-29F, -4F, -1.5F);

		bodyModel[28].addShapeBox(-3.5F, -0.5F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 31
		bodyModel[28].setRotationPoint(-27.5F, -2.7F, -0.5F);
		bodyModel[28].rotateAngleZ = -0.26179939F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[29].setRotationPoint(13.25F, -2F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[30].setRotationPoint(13.25F, -1F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[31].setRotationPoint(-20.5F, -6F, -1F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 38
		bodyModel[32].setRotationPoint(-21.5F, -6.5F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 39
		bodyModel[33].setRotationPoint(-20.5F, -8F, -1F);

		bodyModel[34].addShapeBox(-1F, -2F, 0F, 3, 2, 3, 0F,-0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F); // Box 40
		bodyModel[34].setRotationPoint(-19.5F, -7.5F, -1.5F);
		bodyModel[34].rotateAngleZ = 0.76794487F;

		bodyModel[35].addShapeBox(0F, 2F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 41
		bodyModel[35].setRotationPoint(-21.4F, -3.9F, 2.9F);
		bodyModel[35].rotateAngleZ = 0.17453293F;

		bodyModel[36].addShapeBox(0F, 2F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 42
		bodyModel[36].setRotationPoint(-24.9F, -3.9F, 2.9F);

		bodyModel[37].addShapeBox(0F, 2F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 43
		bodyModel[37].setRotationPoint(-26.9F, -2.9F, 2.9F);
		bodyModel[37].rotateAngleZ = 0.17453293F;

		bodyModel[38].addShapeBox(0F, 1F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[38].setRotationPoint(-26.9F, -2.9F, 2.9F);
		bodyModel[38].rotateAngleZ = 0.17453293F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[39].setRotationPoint(-26.9F, -2.9F, 2.9F);
		bodyModel[39].rotateAngleZ = 0.17453293F;

		bodyModel[40].addShapeBox(0F, 2F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 46
		bodyModel[40].setRotationPoint(-21.4F, -3.9F, -5.9F);
		bodyModel[40].rotateAngleZ = 0.17453293F;

		bodyModel[41].addShapeBox(0F, 2F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 47
		bodyModel[41].setRotationPoint(-24.9F, -3.9F, -5.9F);

		bodyModel[42].addShapeBox(0F, 2F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 48
		bodyModel[42].setRotationPoint(-26.9F, -2.9F, -5.9F);
		bodyModel[42].rotateAngleZ = 0.17453293F;

		bodyModel[43].addShapeBox(0F, 1F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[43].setRotationPoint(-26.9F, -2.9F, -5.9F);
		bodyModel[43].rotateAngleZ = 0.17453293F;

		bodyModel[44].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[44].setRotationPoint(-26.9F, -2.9F, -5.9F);
		bodyModel[44].rotateAngleZ = 0.17453293F;

		bodyModel[45].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[45].setRotationPoint(-8F, -3.2F, -5.9F);
		bodyModel[45].rotateAngleZ = 0.17453293F;

		bodyModel[46].addShapeBox(0F, 1F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[46].setRotationPoint(-8F, -3.2F, -5.9F);
		bodyModel[46].rotateAngleZ = 0.17453293F;

		bodyModel[47].addShapeBox(0F, 2F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 53
		bodyModel[47].setRotationPoint(-8F, -3.2F, -5.9F);
		bodyModel[47].rotateAngleZ = 0.17453293F;

		bodyModel[48].addShapeBox(0F, 2F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 54
		bodyModel[48].setRotationPoint(-6F, -4.2F, -5.9F);

		bodyModel[49].addShapeBox(0F, 2F, 0F, 1, 3, 3, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F); // Box 55
		bodyModel[49].setRotationPoint(-2.5F, -4.2F, -5.9F);
		bodyModel[49].rotateAngleZ = 0.17453293F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 33
		turretModel[1] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 34

		turretModel[0].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 33
		turretModel[0].setRotationPoint(14.75F, -4F, -1.5F);

		turretModel[1].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 34
		turretModel[1].setRotationPoint(14.75F, -3F, -1.5F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 32

		barrelModel[0].addShapeBox(0F, -0.5F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 32
		barrelModel[0].setRotationPoint(14.75F, -2.5F, -0.5F);
	}
}