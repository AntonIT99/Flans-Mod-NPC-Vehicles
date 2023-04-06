//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: uc2ww1
// Model Creator: 
// Created on: 01.08.2020 - 10:41:20
// Last changed on: 01.08.2020 - 10:41:20

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modeluc2ww1 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public Modeluc2ww1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[51];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 52

		bodyModel[0].addShapeBox(0F, 0F, 0F, 26, 3, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(0F, 3F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 26, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 3
		bodyModel[2].setRotationPoint(0F, 5F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(26F, 3F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(26F, 0F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, -3F); // Box 6
		bodyModel[5].setRotationPoint(26F, 5F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0.2F, -2.5F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0.2F, -2.5F, 0F, 0F, -1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, -1F); // Box 7
		bodyModel[6].setRotationPoint(35F, 1F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F,0F, 0F, -1F, 1F, 0F, -3.8F, 1F, 0F, -3.8F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, -1F); // Box 8
		bodyModel[7].setRotationPoint(35F, 3F, -4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F,0F, 0F, -1F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, -1F, 0F, -0.5F, -3F, -1F, -2F, -3.5F, -1F, -2F, -3.5F, 0F, -0.5F, -3F); // Box 9
		bodyModel[8].setRotationPoint(35F, 5F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 6, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, 0F, -0.5F, 0F, 0F, -0.8F, -2.95F, 0F, -0.8F, -2.95F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 11
		bodyModel[9].setRotationPoint(46F, -3F, -1F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 17, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(18F, -3F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(14F, -1F, -1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 19, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[12].setRotationPoint(-5F, -1F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-7F, -1.5F, -1.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 19, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-25F, -0.4F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 26, 3, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-26F, 0F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 26, 2, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-26F, 3F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 3, 8, 0F,0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, -0.3F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.3F, -3F); // Box 19
		bodyModel[17].setRotationPoint(-20F, 5F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0.5F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.5F, 0F, 0F, -1F, -3F, 0F, -0.3F, -3F, 0F, -0.3F, -3F, 0F, -1F, -3F); // Box 20
		bodyModel[18].setRotationPoint(-26F, 5F, -4F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F); // Box 21
		bodyModel[19].setRotationPoint(-37F, 0F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -2F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -2F); // Box 22
		bodyModel[20].setRotationPoint(-43F, 0F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, -2F, -3.5F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -2F, -3.5F, 0F, -0.5F, -3F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, -3F); // Box 23
		bodyModel[21].setRotationPoint(-49F, 0F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.9F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, -1F); // Box 24
		bodyModel[22].setRotationPoint(-37F, 2.5F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 3, 8, 0F,0F, 2.4F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.4F, -1F, 0F, -3.5F, -3F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, -3.5F, -3F); // Box 25
		bodyModel[23].setRotationPoint(-37F, 5F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, -2.5F); // Box 26
		bodyModel[24].setRotationPoint(35F, -3F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -2F, -2F); // Box 27
		bodyModel[25].setRotationPoint(-43F, 2.5F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, -1F, -2.5F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, -1F, -2.5F, -2F); // Box 28
		bodyModel[26].setRotationPoint(-49F, 2.5F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 29
		bodyModel[27].setRotationPoint(0F, -5F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0.2F, 0F, 0F, 1F, 0.5F, 0.2F, 1F, 0.5F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 30
		bodyModel[28].setRotationPoint(0F, -6F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 31
		bodyModel[29].setRotationPoint(2.75F, -8F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 32
		bodyModel[30].setRotationPoint(2.75F, -12F, -0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 33
		bodyModel[31].setRotationPoint(4.9F, -12F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 34
		bodyModel[32].setRotationPoint(4.9F, -8F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F); // Box 35
		bodyModel[33].setRotationPoint(37F, -5.5F, -0.5F);
		bodyModel[33].rotateAngleZ = -0.15707963F;

		bodyModel[34].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 36
		bodyModel[34].setRotationPoint(37F, -5F, 0F);
		bodyModel[34].rotateAngleX = 0.45378561F;

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 37
		bodyModel[35].setRotationPoint(37F, -5F, 0F);
		bodyModel[35].rotateAngleX = -0.45378561F;

		bodyModel[36].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 38
		bodyModel[36].setRotationPoint(42F, -4.2F, 0F);
		bodyModel[36].rotateAngleX = -0.45378561F;

		bodyModel[37].addShapeBox(0F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F); // Box 39
		bodyModel[37].setRotationPoint(42F, -4.2F, 0F);
		bodyModel[37].rotateAngleX = 0.45378561F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 40
		bodyModel[38].setRotationPoint(7F, -6.5F, -1.5F);
		bodyModel[38].rotateAngleY = 0.03490659F;
		bodyModel[38].rotateAngleZ = -0.03490659F;

		bodyModel[39].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 41
		bodyModel[39].setRotationPoint(-23.5F, -2.5F, -0.5F);
		bodyModel[39].rotateAngleY = -0.04363323F;
		bodyModel[39].rotateAngleZ = 0.12217305F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 42
		bodyModel[40].setRotationPoint(-24F, -2.5F, -0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[41].setRotationPoint(9.5F, -2.8F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 44
		bodyModel[42].setRotationPoint(9F, -3.4F, -0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F); // Box 45
		bodyModel[43].setRotationPoint(11F, -3.5F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[44].setRotationPoint(-42F, 3F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F); // Box 47
		bodyModel[45].setRotationPoint(-38F, 3F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F); // Box 48
		bodyModel[46].setRotationPoint(-43.5F, 3F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 2F, 0.5F, 0F); // Box 49
		bodyModel[47].setRotationPoint(24F, -1F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[48].setRotationPoint(24F, -1F, 1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 31, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 51
		bodyModel[49].setRotationPoint(7F, -6.5F, 0.5F);
		bodyModel[49].rotateAngleY = -0.03490659F;
		bodyModel[49].rotateAngleZ = -0.03490659F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 52
		bodyModel[50].setRotationPoint(-23.5F, -2.5F, -0.5F);
		bodyModel[50].rotateAngleY = 0.04363323F;
		bodyModel[50].rotateAngleZ = 0.12217305F;
	}
}