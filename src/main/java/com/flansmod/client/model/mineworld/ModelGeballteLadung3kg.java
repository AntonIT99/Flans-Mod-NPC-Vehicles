//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GeballteLadung3kg
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.mineworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGeballteLadung3kg extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelGeballteLadung3kg()
	{
		geballteladung3kgModel = new ModelRendererTurbo[2];
		geballteladung3kgModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox0
		geballteladung3kgModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import ImportBox10

		geballteladung3kgModel[0].addShapeBox(-1F, -1F, -1F, 3, 5, 5, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Import ImportBox0
		geballteladung3kgModel[0].setRotationPoint(0F, 0F, 0F);
		geballteladung3kgModel[0].rotateAngleX = 4.71238898F;

		geballteladung3kgModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Import ImportBox10
		geballteladung3kgModel[1].setRotationPoint(0F, 6.5F, 0.5F);
		geballteladung3kgModel[1].rotateAngleX = 3.14159265F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			geballteladung3kgModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo geballteladung3kgModel[];
}