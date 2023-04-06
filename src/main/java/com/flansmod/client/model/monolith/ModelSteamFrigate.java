//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SteamFrigate
// Model Creator: 
// Created on: 21.06.2022 - 18:11:13
// Last changed on: 21.06.2022 - 18:11:13

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSteamFrigate extends ModelVehicle //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelSteamFrigate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];
		frontWheelModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initfrontWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 7
		bodyModel[2] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 10
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[6] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
		bodyModel[7] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 13
		bodyModel[8] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 14
		bodyModel[9] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 15
		bodyModel[10] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 16
		bodyModel[11] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 19
		bodyModel[12] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 29
		bodyModel[14] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 30
		bodyModel[15] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 129, 147, textureX, textureY); // Box 31
		bodyModel[17] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 95
		bodyModel[18] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 46
		bodyModel[19] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 97
		bodyModel[20] = new ModelRendererTurbo(this, 129, 147, textureX, textureY); // Box 98
		bodyModel[21] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 99
		bodyModel[22] = new ModelRendererTurbo(this, 129, 147, textureX, textureY); // Box 100

		bodyModel[0].addShapeBox(0F, 0F, 0F, 82, 13, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[0].setRotationPoint(-37.5F, -7.2F, -14F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 11, 13, 28, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[1].setRotationPoint(44.5F, -7.2F, -14F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 15, 28, 0F,0F, -1F, 0F, 12F, 1F, -9F, 12F, 1F, -9F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(55.5F, -9.2F, -14F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 13, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		bodyModel[3].setRotationPoint(-43.5F, -7.2F, -14F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 10, 13, 24, 0F,0F, 1.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -4F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F); // Box 10
		bodyModel[4].setRotationPoint(-53.5F, -7.2F, -12F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 14, 8, 0F,5F, 0.5F, -3.5F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 5F, 0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 11
		bodyModel[5].setRotationPoint(-56.5F, -8.2F, -4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.9F, -3.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.9F, -3.5F); // Box 12
		bodyModel[6].setRotationPoint(-56.5F, 5.8F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 82, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0.5F, -10F); // Box 13
		bodyModel[7].setRotationPoint(-37.5F, 5.8F, -14F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 6, 4, 28, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -11F, 0F, 0.5F, -10F, 0F, 0.5F, -10F, 0F, 0F, -11F); // Box 14
		bodyModel[8].setRotationPoint(-43.5F, 5.8F, -14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 10, 4, 24, 0F,0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -10.5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1.5F, -10.5F); // Box 15
		bodyModel[9].setRotationPoint(-53.5F, 5.8F, -12F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 19, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[10].setRotationPoint(-56.5F, 5.3F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 11, 4, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -10F, 0F, 0.5F, -12F, 0F, 0.5F, -12F, 0F, 0.5F, -10F); // Box 19
		bodyModel[11].setRotationPoint(44.5F, 5.8F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 6, 5, 28, 0F,0F, 0F, 0F, -0.5F, 0F, -11F, -0.5F, 0F, -11F, 0F, 0F, 0F, 0F, -0.5F, -12F, -3.5F, -2F, -13.5F, -3.5F, -2F, -13.5F, 0F, -0.5F, -12F); // Box 20
		bodyModel[12].setRotationPoint(55.5F, 5.8F, -14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 29
		bodyModel[13].setRotationPoint(-63F, -19.2F, -0.5F);
		bodyModel[13].rotateAngleZ = 0.2268928F;

		bodyModel[14].addShapeBox(0.3F, 0F, 0F, 20, 12, 1, 0F,-13F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -13F, 0F, -0.4F, -13F, -8F, -0.4F, -0.3F, -8F, -0.4F, -0.3F, -8F, -0.4F, -13F, -8F, -0.4F); // Box 30
		bodyModel[14].setRotationPoint(-82F, -14.2F, -0.5F);
		bodyModel[14].rotateAngleZ = 0.2268928F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 71, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[15].setRotationPoint(0F, -78F, -1F);

		bodyModel[16].addShapeBox(2F, 0F, -30F, 1, 41, 63, 0F,-0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 31
		bodyModel[16].setRotationPoint(0F, -65F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 6, 24, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[17].setRotationPoint(19.5F, -30.2F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 40, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[18].setRotationPoint(50F, -8F, -1.5F);
		bodyModel[18].rotateAngleZ = 0.15707963F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 71, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[19].setRotationPoint(42F, -78F, -1F);

		bodyModel[20].addShapeBox(2F, 0F, -30F, 1, 41, 63, 0F,-0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 98
		bodyModel[20].setRotationPoint(42F, -65F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 71, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[21].setRotationPoint(-35F, -78F, -1F);

		bodyModel[22].addShapeBox(2F, 0F, -30F, 1, 41, 63, 0F,-0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, -6F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 100
		bodyModel[22].setRotationPoint(-35F, -65F, 0F);
	}

	private void initfrontWheelModel_1()
	{
		frontWheelModel[0] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 17
		frontWheelModel[1] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 18

		frontWheelModel[0].addShapeBox(0F, 0F, -0.5F, 5, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		frontWheelModel[0].setRotationPoint(-61.5F, 5.3F, 0F);

		frontWheelModel[1].addShapeBox(0F, 0F, -0.5F, 5, 2, 1, 0F,-4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		frontWheelModel[1].setRotationPoint(-61.5F, 3.3F, 0F);
	}
}