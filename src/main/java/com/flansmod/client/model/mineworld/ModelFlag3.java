//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFlag3 extends ModelGun
{
	int textureX = 64;
	int textureY = 128;

	public ModelFlag3()
	{
		gunModel = new ModelRendererTurbo[2];
		gunModel[0] = new ModelRendererTurbo(this, 1, 37, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		gunModel[0].addShapeBox(0F, 0F, -1F, 2, 50, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Import Box0
		gunModel[0].setRotationPoint(0F, -30F, 0F);

		gunModel[1].addBox(0F, 0F, 0F, 0, 10, 20, 0F); // Box 0
		gunModel[1].setRotationPoint(1F, -30F, 0.75F);

		flipAll();
	}
}