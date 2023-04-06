//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 11.08.2020 - 18:39:21
// Last changed on: 11.08.2020 - 18:39:21

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCclassSub extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelCclassSub() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 39
		bodyModel[35] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 40
		bodyModel[36] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 41
		bodyModel[37] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 42
		bodyModel[38] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 43
		bodyModel[39] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 44

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(4F, -0.5F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(4F, -0.5F, -4.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F); // Box 3
		bodyModel[2].setRotationPoint(4F, -0.5F, 1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -2.5F, -0.5F); // Box 4
		bodyModel[3].setRotationPoint(13F, -0.5F, 1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[4].setRotationPoint(13F, -0.5F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 8, 3, 0F,0F, -2.5F, -0.5F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[5].setRotationPoint(13F, -0.5F, -4.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 18, 8, 3, 0F,0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -2.99F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -2.99F, 0F, -3F, -1F); // Box 8
		bodyModel[6].setRotationPoint(22F, -0.5F, 1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 18, 8, 3, 0F,0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.8F, 0F); // Box 9
		bodyModel[7].setRotationPoint(22F, -0.5F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 18, 8, 3, 0F,0F, -3F, -1F, 0F, -3.5F, -2.99F, 0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -3.5F, -2.99F, 0F, -2.5F, 0F, 0F, -0.8F, 0F); // Box 10
		bodyModel[8].setRotationPoint(22F, -0.5F, -4.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(40F, 2F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.3F, -0.3F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, -0.3F, -0.3F); // Box 12
		bodyModel[10].setRotationPoint(41.5F, 2F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F); // Box 13
		bodyModel[11].setRotationPoint(-3F, -0.5F, 1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[12].setRotationPoint(-3F, -0.5F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-3F, -0.5F, -4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 8, 3, 0F,0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -3F, -1F); // Box 16
		bodyModel[14].setRotationPoint(-11F, -0.5F, 1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 8, 3, 0F,0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-11F, -0.5F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 8, 3, 0F,0F, -3F, -1F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-11F, -0.5F, -4.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 16, 8, 3, 0F,0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -3.5F, -2.99F, 0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -3.5F, -2.99F); // Box 19
		bodyModel[17].setRotationPoint(-27F, -0.5F, 1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 16, 8, 3, 0F,0F, -3.5F, -2.99F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -2.99F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -2.5F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-27F, -0.5F, -4.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 16, 8, 3, 0F,0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-27F, -0.5F, -1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0.5F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, -0.3F); // Box 22
		bodyModel[20].setRotationPoint(-29F, 2F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,-0.5F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -1F, -1F); // Box 23
		bodyModel[21].setRotationPoint(-36.5F, 2F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(-37.5F, 1F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-39.5F, 1F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F); // Box 26
		bodyModel[24].setRotationPoint(-40.5F, 1F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 41, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(-7F, -1.2F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.8F, 0.3F, 0F, -0.8F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(34F, -1.2F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 29
		bodyModel[27].setRotationPoint(34.5F, 0F, 0.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 30
		bodyModel[28].setRotationPoint(34.5F, 0F, -3.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(-13F, -1.2F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, -0.7F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.7F, -0.7F, -0.5F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.7F); // Box 32
		bodyModel[30].setRotationPoint(-16F, -0.7F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(0F, -4.2F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.4F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0F, -0.5F, 0.4F); // Box 34
		bodyModel[32].setRotationPoint(5F, -4.8F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.2F); // Box 35
		bodyModel[33].setRotationPoint(-6F, -2.2F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[34].setRotationPoint(-39.5F, 3F, -2.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 40
		bodyModel[35].setRotationPoint(-40.5F, 3F, -2.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 6, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 41
		bodyModel[36].setRotationPoint(-37.5F, 3F, -2.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 42
		bodyModel[37].setRotationPoint(4F, -8.2F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 43
		bodyModel[38].setRotationPoint(4F, -10.7F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F, -0.4F, 15F, -0.4F); // Box 44
		bodyModel[39].setRotationPoint(-1.5F, -18.7F, -0.5F);
	}
}