//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BallistaBolt
// Model Creator:
// Created on:07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBallistaBolt extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelBallistaBolt()
	{
		ballistaboltModel = new ModelRendererTurbo[2];
		ballistaboltModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		ballistaboltModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 7

		ballistaboltModel[0].addShapeBox(-0.5F, -25F, -0.5F, 1, 29, 1, 0F, 0.4F, 5F, 0.4F, 0.4F, 5F, 0.4F, 0.4F, 5F, 0.4F, 0.4F, 5F, 0.4F, 0.4F, 5F, 0.4F, 0.4F, 5F, 0.4F, 0.4F, 5F, 0.4F, 0.4F, 5F, 0.4F); // Box 6
		ballistaboltModel[0].setRotationPoint(0F, 0F, 0F);

		ballistaboltModel[1].addShapeBox(-0.5F, 9F, -0.5F, 1, 10, 1, 0F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, -0.45F, 5F, -0.45F, -0.45F, 5F, -0.45F, -0.45F, 5F, -0.45F, 0F, 5F, -0.45F); // Box 7
		ballistaboltModel[1].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			ballistaboltModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo ballistaboltModel[];
}