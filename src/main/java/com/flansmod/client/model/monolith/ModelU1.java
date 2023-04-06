//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: U1
// Model Creator: 
// Created on: 09.08.2020 - 11:17:14
// Last changed on: 09.08.2020 - 11:17:14

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelU1 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelU1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[35];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 13
		bodyModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 18
		bodyModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 25
		bodyModel[8] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 26
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 27
		bodyModel[10] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 28
		bodyModel[11] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 29
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[13] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 31
		bodyModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 32
		bodyModel[15] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 34
		bodyModel[17] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 35
		bodyModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 36
		bodyModel[19] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 37
		bodyModel[20] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 38
		bodyModel[21] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 39
		bodyModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 40
		bodyModel[23] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 41
		bodyModel[24] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 42
		bodyModel[25] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 43
		bodyModel[26] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 44
		bodyModel[27] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 45
		bodyModel[28] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 46
		bodyModel[29] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 47
		bodyModel[30] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 48
		bodyModel[31] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 49
		bodyModel[32] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 50
		bodyModel[33] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 51
		bodyModel[34] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 52

		bodyModel[0].addShapeBox(0F, 0F, 0F, 28, 3, 8, 0F,0F, 0.7F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 1
		bodyModel[0].setRotationPoint(-14F, 3F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 28, 2, 7, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.2F, -1.8F, 0F, 0.4F, -1.8F, 0F, 0.4F, -1.8F, 0F, 0.2F, -1.8F); // Box 2
		bodyModel[1].setRotationPoint(-14F, 6F, -3.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 3, 8, 0F,0F, 0.5F, -0.3F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.3F); // Box 4
		bodyModel[2].setRotationPoint(14F, 3F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0.8F, -0.4F, 0F, 0.7F, -0.3F, 0F, 0.7F, -0.3F, 0F, 0.8F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F); // Box 9
		bodyModel[3].setRotationPoint(-19F, 3F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 15, 3, 8, 0F,0F, 1F, -0.8F, 0F, 0.8F, -0.4F, 0F, 0.8F, -0.4F, 0F, 1F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.5F, -0.8F); // Box 11
		bodyModel[4].setRotationPoint(-34F, 3F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 2, 6, 0F,0.5F, 0.7F, -0.7F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0.5F, 0.7F, -0.7F, 0.5F, -1F, -0.7F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.5F, -1F, -0.7F); // Box 13
		bodyModel[5].setRotationPoint(-41F, 3F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 4, 8, 0F,0F, -0.5F, -0.5F, 0F, 0.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -2.5F, 0F, -1F, -2.5F, 0F, -0.5F, -0.5F); // Box 18
		bodyModel[6].setRotationPoint(26F, 2F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0.5F, 0.2F, -2F, 0F, 0.7F, -0.7F, 0F, 0.7F, -0.7F, 0.5F, 0.2F, -2F, 0.5F, 0F, -2F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0.5F, 0F, -2F); // Box 25
		bodyModel[7].setRotationPoint(-43.5F, 3F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, 0F, 0F, 0F); // Box 26
		bodyModel[8].setRotationPoint(37F, 0F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0.2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.2F, 0F, 8F, -0.49F, 0F, 0F, -0.49F, 0F, 0F, -0.49F, 0F, 8F, -0.49F, 0F); // Box 27
		bodyModel[9].setRotationPoint(34F, 0F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[10].setRotationPoint(26F, 1.5F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 29
		bodyModel[11].setRotationPoint(25.5F, -4.9F, -0.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 30
		bodyModel[12].setRotationPoint(25.5F, -5.9F, -0.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 5, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 31
		bodyModel[13].setRotationPoint(1F, -2F, -2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0F, 0F, -1F, -0.2F, -0.3F, -1F, -0.2F, -0.3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[14].setRotationPoint(4F, -1.5F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[15].setRotationPoint(1F, -3F, -1F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 34
		bodyModel[16].setRotationPoint(2.6F, -10F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 35
		bodyModel[17].setRotationPoint(1.5F, -10F, -0.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 36
		bodyModel[18].setRotationPoint(-20.5F, -4.9F, -0.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.2F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.5F, -0.2F, -0.2F, -0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.2F, 0F, -0.2F); // Box 37
		bodyModel[19].setRotationPoint(-20.5F, -5.9F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, 0F, -2.3F, 0F, 0.2F, -2.3F, 0F, 0.2F, -2.3F, 0F, 0F, -2.3F); // Box 38
		bodyModel[20].setRotationPoint(-19F, 6F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 2, 8, 0F,0F, 0F, -0.3F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.3F, 0F, 0.4F, -2.3F, 0F, 0.3F, -2.5F, 0F, 0.3F, -2.5F, 0F, 0.4F, -2.3F); // Box 39
		bodyModel[21].setRotationPoint(14F, 6F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, 0.5F, -0.5F, 0F, 1F, -2.5F, 0F, 1F, -2.5F, 0F, 0.5F, -0.5F, 0F, 0.3F, -2.5F, 0F, -0.8F, -3.5F, 0F, -0.8F, -3.5F, 0F, 0.3F, -2.5F); // Box 40
		bodyModel[22].setRotationPoint(26F, 6F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0.25F, -0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.25F, -0.6F, 0F, -0.1F, -2.3F, 0F, 0F, -2.3F, 0F, 0F, -2.3F, 0F, -0.1F, -2.3F); // Box 41
		bodyModel[23].setRotationPoint(-27F, 6F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0.5F, -0.8F, 0F, 0.25F, -0.6F, 0F, 0.25F, -0.6F, 0F, 0.5F, -0.8F, -4F, -0.5F, -3F, 0F, -0.1F, -2.3F, 0F, -0.1F, -2.3F, -4F, -0.5F, -3F); // Box 42
		bodyModel[24].setRotationPoint(-34F, 6F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 3, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.7F, -0.2F); // Box 43
		bodyModel[25].setRotationPoint(-39F, 5.4F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0.5F, -1.5F, 1F, 0.5F, -1.5F, 1F, 0F, -0.5F, 0F); // Box 44
		bodyModel[26].setRotationPoint(-34F, 5.4F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[27].setRotationPoint(-15F, 7.7F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 46
		bodyModel[28].setRotationPoint(-20F, 7.7F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[29].setRotationPoint(12F, 7.7F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[30].setRotationPoint(-34F, 1F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, -1F); // Box 49
		bodyModel[31].setRotationPoint(-39F, 0.699999999999999F, -1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, -1F, -1.8F, -0.8F, -1.2F, -1.8F, -0.8F, -1.2F, 0F, 0.25F, -1F); // Box 50
		bodyModel[32].setRotationPoint(37F, 5F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 51
		bodyModel[33].setRotationPoint(-36F, -6.5F, -0.5F);
		bodyModel[33].rotateAngleZ = 0.2268928F;

		bodyModel[34].addShapeBox(-7F, -1F, 0F, 9, 7, 1, 0F,-1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F, -1.5F, -1.5F, -0.4F); // Box 52
		bodyModel[34].setRotationPoint(-36F, -6.5F, -0.5F);
		bodyModel[34].rotateAngleZ = 0.2268928F;
	}
}