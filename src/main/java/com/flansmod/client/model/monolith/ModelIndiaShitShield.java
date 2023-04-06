//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIndiaShitShield extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelIndiaShitShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[10];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		gunModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		gunModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		gunModel[5] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
		gunModel[6] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 0
		gunModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 1
		gunModel[9] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 2

		gunModel[0].addBox(0F, 0F, 0F, 3, 6, 14, 0F); // Box 0
		gunModel[0].setRotationPoint(1F, -2F, -7F);

		gunModel[1].addShapeBox(0F, 10F, 0F, 3, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		gunModel[1].setRotationPoint(1F, -6F, -7F);

		gunModel[2].addShapeBox(0F, 10F, 0F, 3, 4, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[2].setRotationPoint(1F, -16F, -7F);

		gunModel[3].addShapeBox(0F, 14F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		gunModel[3].setRotationPoint(1F, -6F, -6F);

		gunModel[4].addShapeBox(0F, 17F, 0F, 3, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 0
		gunModel[4].setRotationPoint(1F, -6F, -4F);

		gunModel[5].addShapeBox(0F, 14F, 0F, 3, 3, 12, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[5].setRotationPoint(1F, -23F, -6F);

		gunModel[6].addShapeBox(0F, 17F, 0F, 3, 1, 8, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[6].setRotationPoint(1F, -27F, -4F);

		gunModel[7].addBox(0F, 0F, 0F, 2, 3, 7, 0F); // Box 0
		gunModel[7].setRotationPoint(3.5F, -0.5F, -3.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		gunModel[8].setRotationPoint(3.5F, -3.5F, -3.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 2
		gunModel[9].setRotationPoint(3.5F, 2.5F, -3.5F);
	}
}