//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Ladder
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLadder extends ModelVehicle //Same as Filename
{
	int textureX = 32;
	int textureY = 256;

	public ModelLadder() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[18];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 22
		bodyModel[1] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 23
		bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 24
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 29
		bodyModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 30
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 31
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 32
		bodyModel[11] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 33
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		bodyModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 35
		bodyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 36
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		bodyModel[17] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 39

		bodyModel[0].addShapeBox(-0.5F, 0F, -0.5F, 1, 141, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 22
		bodyModel[0].setRotationPoint(5F, -130F, -8F);
		bodyModel[0].rotateAngleZ = -0.08726646F;

		bodyModel[1].addShapeBox(-0.5F, 0F, -0.5F, 1, 141, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 23
		bodyModel[1].setRotationPoint(5F, -130F, 8F);
		bodyModel[1].rotateAngleZ = -0.08726646F;

		bodyModel[2].addShapeBox(-0.5F, 8F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[2].setRotationPoint(5F, -130F, -8F);
		bodyModel[2].rotateAngleZ = -0.08726646F;

		bodyModel[3].addShapeBox(-0.5F, 16F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[3].setRotationPoint(5F, -130F, -8F);
		bodyModel[3].rotateAngleZ = -0.08726646F;

		bodyModel[4].addShapeBox(-0.5F, 24F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[4].setRotationPoint(5F, -130F, -8F);
		bodyModel[4].rotateAngleZ = -0.08726646F;

		bodyModel[5].addShapeBox(-0.5F, 32F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[5].setRotationPoint(5F, -130F, -8F);
		bodyModel[5].rotateAngleZ = -0.08726646F;

		bodyModel[6].addShapeBox(-0.5F, 40F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[6].setRotationPoint(5F, -130F, -8F);
		bodyModel[6].rotateAngleZ = -0.08726646F;

		bodyModel[7].addShapeBox(-0.5F, 48F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[7].setRotationPoint(5F, -130F, -8F);
		bodyModel[7].rotateAngleZ = -0.08726646F;

		bodyModel[8].addShapeBox(-0.5F, 56F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[8].setRotationPoint(5F, -130F, -8F);
		bodyModel[8].rotateAngleZ = -0.08726646F;

		bodyModel[9].addShapeBox(-0.5F, 64F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[9].setRotationPoint(5F, -130F, -8F);
		bodyModel[9].rotateAngleZ = -0.08726646F;

		bodyModel[10].addShapeBox(-0.5F, 72F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[10].setRotationPoint(5F, -130F, -8F);
		bodyModel[10].rotateAngleZ = -0.08726646F;

		bodyModel[11].addShapeBox(-0.5F, 80F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[11].setRotationPoint(5F, -130F, -8F);
		bodyModel[11].rotateAngleZ = -0.08726646F;

		bodyModel[12].addShapeBox(-0.5F, 88F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[12].setRotationPoint(5F, -130F, -8F);
		bodyModel[12].rotateAngleZ = -0.08726646F;

		bodyModel[13].addShapeBox(-0.5F, 96F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[13].setRotationPoint(5F, -130F, -8F);
		bodyModel[13].rotateAngleZ = -0.08726646F;

		bodyModel[14].addShapeBox(-0.5F, 104F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[14].setRotationPoint(5F, -130F, -8F);
		bodyModel[14].rotateAngleZ = -0.08726646F;

		bodyModel[15].addShapeBox(-0.5F, 112F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[15].setRotationPoint(5F, -130F, -8F);
		bodyModel[15].rotateAngleZ = -0.08726646F;

		bodyModel[16].addShapeBox(-0.5F, 120F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[16].setRotationPoint(5F, -130F, -8F);
		bodyModel[16].rotateAngleZ = -0.08726646F;

		bodyModel[17].addShapeBox(-0.5F, 128F, 0.5F, 1, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[17].setRotationPoint(5F, -130F, -8F);
		bodyModel[17].rotateAngleZ = -0.08726646F;
	}
}