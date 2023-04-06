//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CannonBall
// Model Creator:
// Created on:07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCannonBall extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelCannonBall()
	{
		cannonballModel = new ModelRendererTurbo[9];
		cannonballModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		cannonballModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 2
		cannonballModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		cannonballModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		cannonballModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		cannonballModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		cannonballModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		cannonballModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		cannonballModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9

		cannonballModel[0].addShapeBox(-1F, -1F, -3F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		cannonballModel[0].setRotationPoint(0F, 0F, 0F);

		cannonballModel[1].addShapeBox(-1F, -3F, -3F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		cannonballModel[1].setRotationPoint(0F, 0F, 0F);

		cannonballModel[2].addShapeBox(-1F, 1F, -3F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 3
		cannonballModel[2].setRotationPoint(0F, 0F, 0F);

		cannonballModel[3].addShapeBox(-1.01F, -1F, 3F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 4
		cannonballModel[3].setRotationPoint(-2F, 0F, -6F);

		cannonballModel[4].addShapeBox(-1.01F, -3.01F, 3.01F, 2, 2, 6, 0F, -1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 5
		cannonballModel[4].setRotationPoint(-2F, 0F, -6F);

		cannonballModel[5].addShapeBox(-1.01F, 0.99F, 3.01F, 2, 2, 6, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1.9F, 0F, -2F); // Box 6
		cannonballModel[5].setRotationPoint(-2F, 0F, -6F);

		cannonballModel[6].addShapeBox(3.01F, 0.99F, 3.01F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -1.9F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, -2F); // Box 7
		cannonballModel[6].setRotationPoint(-2F, 0F, -6F);

		cannonballModel[7].addShapeBox(3.01F, -3.01F, 3.01F, 2, 2, 6, 0F, 0F, 0F, -2F, -1.9F, 0F, -2F, -1.9F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 8
		cannonballModel[7].setRotationPoint(-2F, 0F, -6F);

		cannonballModel[8].addShapeBox(3.01F, -1F, 3F, 2, 2, 6, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 9
		cannonballModel[8].setRotationPoint(-2F, 0F, -6F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 9; i++)
		{
			cannonballModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo cannonballModel[];
}