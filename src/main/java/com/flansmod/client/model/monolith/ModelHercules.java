//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Hercules
// Model Creator: 
// Created on: 06.07.2019 - 17:27:39
// Last changed on: 06.07.2019 - 17:27:39

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHercules extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHercules() //Same as Filename
	{
		turretModel = new ModelRendererTurbo[1];
		barrelModel = new ModelRendererTurbo[20];

		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 34

		turretModel[0].addShapeBox(0F, 0F, 0F, 150, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[0].setRotationPoint(-50F, 0F, -12F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		barrelModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 95
		barrelModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 96
		barrelModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 97
		barrelModel[4] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 98
		barrelModel[5] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 100
		barrelModel[6] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 101
		barrelModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 102
		barrelModel[8] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 103
		barrelModel[9] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 104
		barrelModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 105
		barrelModel[11] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 106
		barrelModel[12] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 26
		barrelModel[13] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 27
		barrelModel[14] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 28
		barrelModel[15] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 29
		barrelModel[16] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Box 30
		barrelModel[17] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 31
		barrelModel[18] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 32
		barrelModel[19] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 33

		barrelModel[0].addShapeBox(99F, -29F, -5F, 58, 10, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		barrelModel[0].setRotationPoint(-40F, 2F, 0F);

		barrelModel[1].addShapeBox(157F, -29F, -5F, 30, 10, 10, 0F,0F, 0F, 0F, 0F, -4.8F, -4.8F, 0F, -4.8F, -4.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.8F, -4.8F, 0F, -4.8F, -4.8F, 0F, 0F, 0F); // Box 95
		barrelModel[1].setRotationPoint(-40F, 2F, 0F);

		barrelModel[2].addShapeBox(15F, -31F, -7F, 46, 6, 6, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 96
		barrelModel[2].setRotationPoint(-40F, 2F, 0F);

		barrelModel[3].addShapeBox(-5F, -31F, -7F, 20, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		barrelModel[3].setRotationPoint(-40F, 2F, 0F);

		barrelModel[4].addShapeBox(-7F, -51.5F, -28F, 24, 20, 1, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F); // Box 98
		barrelModel[4].setRotationPoint(-40F, 2F, 0F);

		barrelModel[5].addShapeBox(-7F, -51.5F, 27F, 24, 20, 1, 0F,0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, -20F); // Box 100
		barrelModel[5].setRotationPoint(-40F, 2F, 0F);

		barrelModel[6].addShapeBox(-7F, -16.5F, 27F, 24, 20, 1, 0F,0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 101
		barrelModel[6].setRotationPoint(-40F, 2F, 0F);

		barrelModel[7].addShapeBox(-7F, -16.5F, -28F, 24, 20, 1, 0F,0F, 0F, -20F, 0F, 0F, -20F, 0F, 0F, 20F, 0F, 0F, 20F, 0F, 0F, 0F, -15F, 0F, 0F, -15F, 0F, 0F, 0F, 0F, 0F); // Box 102
		barrelModel[7].setRotationPoint(-40F, 2F, 0F);

		barrelModel[8].addShapeBox(80F, -20.5F, -20F, 65, 16, 1, 0F,0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 0F, -55F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F); // Box 103
		barrelModel[8].setRotationPoint(-40F, 2F, 0F);

		barrelModel[9].addShapeBox(80F, -43.5F, -20F, 65, 16, 1, 0F,0F, 0F, 0F, -55F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 16F, 0F, 0F, 16F); // Box 104
		barrelModel[9].setRotationPoint(-40F, 2F, 0F);

		barrelModel[10].addShapeBox(80F, -43.5F, 19F, 65, 16, 1, 0F,0F, 0F, 0F, -55F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, -16F); // Box 105
		barrelModel[10].setRotationPoint(-40F, 2F, 0F);

		barrelModel[11].addShapeBox(80F, -20.5F, 19F, 65, 16, 1, 0F,0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, -16F, 0F, 0F, -16F, 0F, 0F, 0F, -55F, 0F, 0F, -55F, 0F, 0F, 0F, 0F, 0F); // Box 106
		barrelModel[11].setRotationPoint(-40F, 2F, 0F);

		barrelModel[12].addShapeBox(61F, -31F, -7F, 16, 14, 14, 0F,0F, 0.5F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0.5F, 0.5F); // Box 26
		barrelModel[12].setRotationPoint(-40F, 2F, 0F);

		barrelModel[13].addShapeBox(77F, -29F, -5F, 22, 10, 10, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F); // Box 27
		barrelModel[13].setRotationPoint(-40F, 2F, 0F);

		barrelModel[14].addShapeBox(15F, -31F, 1F, 46, 6, 6, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 28
		barrelModel[14].setRotationPoint(-40F, 2F, 0F);

		barrelModel[15].addShapeBox(15F, -23F, 1F, 46, 6, 6, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 29
		barrelModel[15].setRotationPoint(-40F, 2F, 0F);

		barrelModel[16].addShapeBox(15F, -23F, -7F, 46, 6, 6, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 30
		barrelModel[16].setRotationPoint(-40F, 2F, 0F);

		barrelModel[17].addShapeBox(0F, -17F, -6F, 124, 8, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		barrelModel[17].setRotationPoint(-40F, 2F, 0F);

		barrelModel[18].addShapeBox(0F, -6F, -5F, 50, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		barrelModel[18].setRotationPoint(-40F, 2F, 0F);

		barrelModel[19].addShapeBox(50F, -6F, -5F, 40, 5, 10, 0F,0F, 0F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F); // Box 33
		barrelModel[19].setRotationPoint(-40F, 2F, 0F);
	}
}