//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kilo
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKilo extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelKilo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[44];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 337, 25, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 1, 48, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 401, 48, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 45

		bodyModel[0].addShapeBox(0F, 0F, 0F, 46, 5, 14, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 23
		bodyModel[0].setRotationPoint(-9F, -1F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 46, 4, 14, 0F,0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-9F, 4F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 46, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -5F); // Box 2
		bodyModel[2].setRotationPoint(-9F, 8F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 4, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, -5.5F); // Box 3
		bodyModel[3].setRotationPoint(-29F, 8F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 20, 4, 14, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 4
		bodyModel[4].setRotationPoint(-29F, 4F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 20, 5, 14, 0F,0F, -1F, -3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 5
		bodyModel[5].setRotationPoint(-29F, -1F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 20, 3, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, 0F, -1F); // Box 6
		bodyModel[6].setRotationPoint(-49F, 4F, -3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, -0.5F, -2F, 0F, 2F, 0.5F, 0F, 2F, 0.5F, 0F, -0.5F, -2F, 0F, 0F, -0.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -0.5F); // Box 7
		bodyModel[7].setRotationPoint(-49F, 2F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 20, 2, 6, 0F,0F, 1F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 1F, -1F, 0F, -2.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2.5F, -2F); // Box 8
		bodyModel[8].setRotationPoint(-49F, 8F, -3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 46, 2, 8, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-9F, -3F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 20, 2, 8, 0F,0F, -0.5F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -2.5F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 10
		bodyModel[10].setRotationPoint(-29F, -3F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 13, 2, 6, 0F,0F, -2.5F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -2.5F, -2F, 0F, 2.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.5F, -1.5F); // Box 11
		bodyModel[11].setRotationPoint(-42F, -2.5F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -5F, -2.5F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, -5F, -2.5F, 0F, 3.5F, -2.5F, 0F, 2.5F, -1.5F, 0F, 2.5F, -1.5F, 0F, 3.5F, -2.5F); // Box 12
		bodyModel[12].setRotationPoint(-48F, -2.5F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 0F, -2F); // Box 13
		bodyModel[13].setRotationPoint(-58F, 5F, -2.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,-0.5F, -2.75F, -2.25F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, -0.5F, -2.75F, -2.25F, 0F, 2F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, -2F); // Box 14
		bodyModel[14].setRotationPoint(-58F, 2F, -2.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, 2F, -2F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, 2F, -2F, -0.5F, -2.75F, -2.25F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, -0.5F, -2.75F, -2.25F); // Box 15
		bodyModel[15].setRotationPoint(-58F, 8F, -2.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 2F); // Box 16
		bodyModel[16].setRotationPoint(-54F, 5F, -10.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,2F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(-54F, 5F, 2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 8, 7, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(-56F, 6F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(-60F, 5F, -0.5F);

		bodyModel[20].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 20
		bodyModel[20].setRotationPoint(-59F, 5.5F, 0F);

		bodyModel[21].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 23
		bodyModel[21].setRotationPoint(-59F, 5.5F, 0F);
		bodyModel[21].rotateAngleX = 1.04719755F;

		bodyModel[22].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 24
		bodyModel[22].setRotationPoint(-59F, 5.5F, 0F);
		bodyModel[22].rotateAngleX = 2.0943951F;

		bodyModel[23].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 25
		bodyModel[23].setRotationPoint(-59F, 5.5F, 0F);
		bodyModel[23].rotateAngleX = 3.14159265F;

		bodyModel[24].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 26
		bodyModel[24].setRotationPoint(-59F, 5.5F, 0F);
		bodyModel[24].rotateAngleX = 4.1887902F;

		bodyModel[25].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 27
		bodyModel[25].setRotationPoint(-59F, 5.5F, 0F);
		bodyModel[25].rotateAngleX = 5.23598776F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 5, 14, 0F,0F, 0F, -1F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F); // Box 28
		bodyModel[26].setRotationPoint(37F, -1F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 29
		bodyModel[27].setRotationPoint(37F, 4F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3.5F); // Box 30
		bodyModel[28].setRotationPoint(37F, 8F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, -1F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F); // Box 31
		bodyModel[29].setRotationPoint(37F, -3F, -4F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, -0.25F, -2.5F, 0F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, -0.25F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1.5F); // Box 32
		bodyModel[30].setRotationPoint(45F, -3F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 5, 14, 0F,0F, 0.5F, -3.5F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0.5F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 33
		bodyModel[31].setRotationPoint(48F, -1F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(48F, 4F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -5F, 0F, -1F, -5F, 0F, 0F, -5F); // Box 35
		bodyModel[33].setRotationPoint(48F, 8F, -7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -0.5F); // Box 36
		bodyModel[34].setRotationPoint(52F, 4F, -6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0.5F, -3F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(52F, 0F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 3, 12, 0F,0F, 0F, -0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, -2F, -4.5F, 0F, -2F, -4.5F, 0F, 0F, -4F); // Box 38
		bodyModel[36].setRotationPoint(52F, 8F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, -0.5F, -2.5F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0F, -0.5F, -2.5F); // Box 39
		bodyModel[37].setRotationPoint(56F, 4F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0F, -1F, -4.5F, 0F, -3F, -5.5F, 0F, -3F, -5.5F, 0F, -1F, -4.5F, 0F, 0F, -2F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -2F); // Box 40
		bodyModel[38].setRotationPoint(56F, 0F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 3, 12, 0F,0F, 0.5F, -2.5F, 0F, 1.5F, -4.5F, 0F, 1.5F, -4.5F, 0F, 0.5F, -2.5F, 0F, -2F, -4.5F, -0.5F, -3.5F, -5F, -0.5F, -3.5F, -5F, 0F, -2F, -4.5F); // Box 41
		bodyModel[39].setRotationPoint(56F, 8F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 10, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[40].setRotationPoint(8F, -11F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 8, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 43
		bodyModel[41].setRotationPoint(4F, -11F, -2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 44
		bodyModel[42].setRotationPoint(18F, -11F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 8, 2, 0F,0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Box 45
		bodyModel[43].setRotationPoint(1F, -11F, -1F);
	}
}