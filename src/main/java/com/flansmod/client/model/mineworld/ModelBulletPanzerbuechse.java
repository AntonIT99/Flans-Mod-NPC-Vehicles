//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bullet
// Model Creator:
// Created on:26.08.2016 - 22:54:08
// Last changed on: 26.08.2016 - 22:54:08

package com.flansmod.client.model.mineworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBulletPanzerbuechse extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelBulletPanzerbuechse()
	{
		bulletModel = new ModelRendererTurbo[2];
		bulletModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bulletModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1

		bulletModel[0].addBox(-0.5F, -1.5F, -0.5F, 1, 3, 1, 0F); // Box 0
		bulletModel[0].setRotationPoint(0F, 0F, 0F);

		bulletModel[1].addShapeBox(-0.5F, 2.5F, -0.5F, 1, 2, 1, 0F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 1
		bulletModel[1].setRotationPoint(0F, -1F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			bulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bulletModel[];
}