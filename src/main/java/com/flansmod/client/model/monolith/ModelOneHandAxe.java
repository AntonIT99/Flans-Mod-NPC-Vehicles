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

public class ModelOneHandAxe extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelOneHandAxe() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[4];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7

		gunModel[0].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(0F, -15.5F, 0F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 2
		gunModel[1].setRotationPoint(0F, -15F, 0F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0.3F, -0.2F, -0.1F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.2F, -0.2F, -0.3F, 0.2F, -0.2F, -0.3F, 0.3F, -0.2F, -0.1F); // Box 6
		gunModel[2].setRotationPoint(1.2F, -15F, 0F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.1F, 0.3F, -0.3F, 4.8F, 0.4F, -0.48F, 4.8F, 0.4F, -0.48F, -0.1F, 0.3F, -0.3F, -0.1F, 0.3F, -0.3F, 4.5F, 1.8F, -0.48F, 4.5F, 1.8F, -0.48F, -0.1F, 0.3F, -0.3F); // Box 7
		gunModel[3].setRotationPoint(2.2F, -14.5F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}