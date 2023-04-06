//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BalaoGuppy
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBalaoGuppy extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelBalaoGuppy() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[36];

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
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 37

		bodyModel[0].addShapeBox(0F, 0F, 0F, 20, 3, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(0F, 0.5F, -6.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 20, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 2
		bodyModel[1].setRotationPoint(0F, 7.5F, -6.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(0F, 3.5F, -6.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 35, 3, 13, 0F,0F, 0F, -4F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(20F, 0.5F, -6.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 35, 3, 13, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, -4F); // Box 5
		bodyModel[4].setRotationPoint(20F, 7.5F, -6.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 35, 4, 13, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(20F, 3.5F, -6.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 3, 13, 0F,0F, 0F, -1.75F, 0F, 0.75F, -4.5F, 0F, 0.75F, -4.5F, 0F, 0F, -1.75F, 0F, -0.5F, -4F, 0F, -1.75F, -5.25F, 0F, -1.75F, -5.25F, 0F, -0.5F, -4F); // Box 7
		bodyModel[6].setRotationPoint(55F, 7.5F, -6.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 4, 13, 0F,0F, 0F, -1.75F, 0F, 0.25F, -4.5F, 0F, 0.25F, -4.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.75F, -4.5F, 0F, -0.75F, -4.5F, 0F, 0F, -1.75F); // Box 8
		bodyModel[7].setRotationPoint(55F, 3.5F, -6.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 3, 13, 0F,0F, -1F, -4F, 0F, -1.5F, -5F, 0F, -1.5F, -5F, 0F, -1F, -4F, 0F, 0F, -1.75F, 0F, -0.25F, -4.5F, 0F, -0.25F, -4.5F, 0F, 0F, -1.75F); // Box 9
		bodyModel[8].setRotationPoint(55F, 0.5F, -6.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 55, 5, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(0F, -1.5F, -3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 8, 6, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F); // Box 11
		bodyModel[10].setRotationPoint(55F, -1.5F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 8, 6, 0F,0F, 0.5F, -1F, 0F, 0.5F, -2.25F, 0F, 0.5F, -2.25F, 0F, 0.5F, -1F, 0F, 0.25F, -1F, -0.75F, -1.25F, -2.25F, -0.75F, -1.25F, -2.25F, 0F, 0.25F, -1F); // Box 12
		bodyModel[11].setRotationPoint(66F, -1.5F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 3, 13, 0F,0F, 0.75F, -4.5F, -0.75F, 2.25F, -5.75F, -0.75F, 2.25F, -5.75F, 0F, 0.75F, -4.5F, 0F, -1.75F, -5.25F, -4.25F, -2.5F, -6.25F, -4.25F, -2.5F, -6.25F, 0F, -1.75F, -5.25F); // Box 13
		bodyModel[12].setRotationPoint(66F, 7.5F, -6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0.5F, -2.25F, 0.5F, -0.75F, -2.75F, 0.5F, -0.75F, -2.75F, 0F, 0.5F, -2.25F, 0.33F, 0F, -2.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.33F, 0F, -2.25F); // Box 14
		bodyModel[13].setRotationPoint(74F, -1.5F, -3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 32, 5, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 15
		bodyModel[14].setRotationPoint(-32F, -1.5F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 21, 5, 6, 0F,0F, -0.25F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 16
		bodyModel[15].setRotationPoint(-53F, -1.5F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 5, 6, 0F,0F, -0.5F, -2F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.5F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 17
		bodyModel[16].setRotationPoint(-62F, -1.5F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,-0.5F, -1F, -2.75F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, -0.5F, -1F, -2.75F, 1.5F, 0F, -2.75F, 0F, 0F, -2F, 0F, 0F, -2F, 1.5F, 0F, -2.75F); // Box 18
		bodyModel[17].setRotationPoint(-65F, -1.5F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 37, 3, 13, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F); // Box 19
		bodyModel[18].setRotationPoint(-37F, 0.5F, -6.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 37, 4, 13, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F); // Box 20
		bodyModel[19].setRotationPoint(-37F, 3.5F, -6.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 37, 3, 13, 0F,0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -0.5F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.5F, -4F); // Box 21
		bodyModel[20].setRotationPoint(-37F, 7.5F, -6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, -3.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -1F, -3.5F); // Box 22
		bodyModel[21].setRotationPoint(-61F, 0.5F, -6.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 24, 4, 13, 0F,0F, 1F, -3.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 1F, -3.5F, 0F, -2.75F, -3.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -2.75F, -3.5F); // Box 23
		bodyModel[22].setRotationPoint(-61F, 3.5F, -6.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 24, 3, 13, 0F,0F, 2.75F, -3.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 2.75F, -3.5F, 0F, -3.75F, -5F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -3.75F, -5F); // Box 24
		bodyModel[23].setRotationPoint(-61F, 7.5F, -6.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 14, 3, 13, 0F,0F, 0F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -6F, 1.25F, -1.25F, -5.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 1.25F, -1.25F, -5.5F); // Box 25
		bodyModel[24].setRotationPoint(-75F, 0.5F, -6.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 14, 3, 13, 0F,1.25F, -0.75F, -5.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 1.25F, -0.75F, -5.5F, 1.5F, -0.75F, -5.75F, 0F, 0.25F, -3.5F, 0F, 0.25F, -3.5F, 1.5F, -0.75F, -5.75F); // Box 26
		bodyModel[25].setRotationPoint(-75F, 1.5F, -6.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 14, 3, 13, 0F,1.5F, 0.75F, -5.75F, 0F, -0.25F, -3.5F, 0F, -0.25F, -3.5F, 1.5F, 0.75F, -5.75F, -5.5F, -1.75F, -5.25F, 0F, -0.75F, -4.75F, 0F, -0.75F, -4.75F, -5.5F, -1.75F, -5.25F); // Box 27
		bodyModel[26].setRotationPoint(-75F, 4.5F, -6.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 12, 13, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(12F, -14.5F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 13, 4, 0F,0F, 0F, -0.5F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 1.5F, 0F, -1.25F, 1.5F, 0F, -1.25F, -0.25F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(24F, -14.5F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 12, 4, 0F,0F, 0F, -1.25F, -0.1F, 0F, -0.45F, -0.1F, 0F, -0.45F, 0F, 0F, -1.25F, 3.25F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 3.25F, 0F, -1F); // Box 30
		bodyModel[29].setRotationPoint(9F, -13.5F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, 0F, -0.25F, 4F, 0F, -0.25F, 4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 31
		bodyModel[30].setRotationPoint(-76F, 5.5F, -0.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 33
		bodyModel[31].setRotationPoint(-66F, 7.25F, -1.75F);
		bodyModel[31].rotateAngleZ = 0.03490659F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 34
		bodyModel[32].setRotationPoint(-66F, 7.25F, 0.75F);
		bodyModel[32].rotateAngleZ = 0.03490659F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0.33F, 0F, -2.25F, 0.5F, 0F, -2.75F, 0.5F, 0F, -2.75F, 0.33F, 0F, -2.25F, 0.75F, 0.75F, -2.25F, -1F, -0.75F, -2.75F, -1F, -0.75F, -2.75F, 0.75F, 0.75F, -2.25F); // Box 35
		bodyModel[33].setRotationPoint(74F, 1.5F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 36
		bodyModel[34].setRotationPoint(17.5F, -22.5F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 37
		bodyModel[35].setRotationPoint(19.2F, -22.5F, -0.5F);
	}
}