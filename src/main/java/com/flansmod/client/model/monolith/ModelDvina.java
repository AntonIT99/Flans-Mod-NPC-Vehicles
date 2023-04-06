//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Dvina
// Model Creator: 
// Created on: 06.07.2019 - 17:27:39
// Last changed on: 06.07.2019 - 17:27:39

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDvina extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelDvina() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];
		turretModel = new ModelRendererTurbo[9];
		barrelModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 108
		bodyModel[1] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 109
		bodyModel[2] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 110
		bodyModel[3] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 111

		bodyModel[0].addShapeBox(0F, 0F, 0F, 24, 18, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[0].setRotationPoint(-12F, -2F, -12F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 10, 75, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[1].setRotationPoint(-5F, 6F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 10, 75, 0F,0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[2].setRotationPoint(-5F, 6F, -75F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 140, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[3].setRotationPoint(-70F, 6F, -6F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Box 112
		turretModel[1] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 113
		turretModel[2] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 114
		turretModel[3] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Box 115
		turretModel[4] = new ModelRendererTurbo(this, 1, 329, textureX, textureY); // Box 116
		turretModel[5] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Box 117
		turretModel[6] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 118
		turretModel[7] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 119
		turretModel[8] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 120

		turretModel[0].addShapeBox(0F, 0F, 0F, 90, 30, 6, 0F,12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		turretModel[0].setRotationPoint(-40F, -30F, -12F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 90, 30, 6, 0F,12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		turretModel[1].setRotationPoint(-40F, -30F, 6F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 90, 30, 18, 0F,0F, -18F, 0F, 0F, -18F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 114
		turretModel[2].setRotationPoint(-40F, -30F, -30F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 90, 30, 18, 0F,12F, 0F, 0F, 0F, 0F, 0F, 0F, -18F, 0F, 0F, -18F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 115
		turretModel[3].setRotationPoint(-40F, -30F, 12F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 142, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		turretModel[4].setRotationPoint(-93F, -4F, -9F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 72, 4, 24, 0F,0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 117
		turretModel[5].setRotationPoint(-160F, -31F, -12F);
		turretModel[5].rotateAngleZ = -0.36651914F;

		turretModel[6].addShapeBox(0F, 0F, 0F, 3, 41, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		turretModel[6].setRotationPoint(-145F, -21F, -2F);
		turretModel[6].rotateAngleZ = 0.34906585F;

		turretModel[7].addShapeBox(0F, 0F, 0F, 3, 32, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		turretModel[7].setRotationPoint(-118F, -14F, -2F);
		turretModel[7].rotateAngleZ = -0.34906585F;

		turretModel[8].addShapeBox(0F, 0F, 0F, 18, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		turretModel[8].setRotationPoint(-139F, 13F, -8F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		barrelModel[1] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 95
		barrelModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 96
		barrelModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 97
		barrelModel[4] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 98
		barrelModel[5] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 100
		barrelModel[6] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 101
		barrelModel[7] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 102
		barrelModel[8] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 103
		barrelModel[9] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 104
		barrelModel[10] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 105
		barrelModel[11] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 106
		barrelModel[12] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 107

		barrelModel[0].addShapeBox(32F, -22F, -6F, 166, 12, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[0].setRotationPoint(-54F, -30F, 0F);

		barrelModel[1].addShapeBox(198F, -22F, -6F, 24, 12, 12, 0F,0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, 0F, 0F); // Box 95
		barrelModel[1].setRotationPoint(-54F, -30F, 0F);

		barrelModel[2].addShapeBox(2F, -24F, -8F, 50, 16, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		barrelModel[2].setRotationPoint(-54F, -30F, 0F);

		barrelModel[3].addShapeBox(-16F, -22F, -6F, 18, 12, 12, 0F,0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, 0F, 0F); // Box 97
		barrelModel[3].setRotationPoint(-54F, -30F, 0F);

		barrelModel[4].addShapeBox(-14F, -43.5F, -28F, 50, 20, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F); // Box 98
		barrelModel[4].setRotationPoint(-54F, -30F, 0F);

		barrelModel[5].addShapeBox(-14F, -43.5F, 27F, 50, 20, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, -20F); // Box 100
		barrelModel[5].setRotationPoint(-54F, -30F, 0F);

		barrelModel[6].addShapeBox(-14F, -8.5F, 27F, 50, 20, 1, 0F,0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F); // Box 101
		barrelModel[6].setRotationPoint(-54F, -30F, 0F);

		barrelModel[7].addShapeBox(-14F, -8.5F, -28F, 50, 20, 1, 0F,0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F); // Box 102
		barrelModel[7].setRotationPoint(-54F, -30F, 0F);

		barrelModel[8].addShapeBox(96F, -10.5F, -22F, 44, 16, 1, 0F,0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F); // Box 103
		barrelModel[8].setRotationPoint(-54F, -30F, 0F);

		barrelModel[9].addShapeBox(96F, -37.5F, -22F, 44, 16, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F, 16F); // Box 104
		barrelModel[9].setRotationPoint(-54F, -30F, 0F);

		barrelModel[10].addShapeBox(96F, -37.5F, 21F, 44, 16, 1, 0F,0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, -16F); // Box 105
		barrelModel[10].setRotationPoint(-54F, -30F, 0F);

		barrelModel[11].addShapeBox(96F, -10.5F, 21F, 44, 16, 1, 0F,0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, -35F, 0F, 0F, -35F, 0F, 0F, 0F, 0F, 0F); // Box 106
		barrelModel[11].setRotationPoint(-54F, -30F, 0F);

		barrelModel[12].addShapeBox(-9F, -8F, -6F, 156, 17, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Box 107
		barrelModel[12].setRotationPoint(-54F, -30F, 0F);
	}
}