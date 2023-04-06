//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: to150MM
// Model Creator:
// Created on:08.07.2018 - 22:11:30
// Last changed on: 08.07.2018 - 22:11:30

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelto150MM extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public Modelto150MM()
	{
		to150mmModel = new ModelRendererTurbo[8];
		to150mmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox8
		to150mmModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportImportBox12
		to150mmModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox8
		to150mmModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox9
		to150mmModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import ImportBox10
		to150mmModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox11
		to150mmModel[6] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Import ImportBox12
		to150mmModel[7] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Import ImportBox13

		to150mmModel[0].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F); // Import ImportImportBox8
		to150mmModel[0].setRotationPoint(-1.05F, -14.05F, 0.05F);

		to150mmModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F); // Import ImportImportBox12
		to150mmModel[1].setRotationPoint(0.05F, 4F, 0.05F);

		to150mmModel[2].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Import ImportBox8
		to150mmModel[2].setRotationPoint(-1.05F, -14.05F, -1.05F);

		to150mmModel[3].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox9
		to150mmModel[3].setRotationPoint(0.05F, -14.05F, -1.05F);

		to150mmModel[4].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, 0F, 0.2F); // Import ImportBox10
		to150mmModel[4].setRotationPoint(0.05F, -14.05F, 0.05F);

		to150mmModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		to150mmModel[5].setRotationPoint(0.05F, 4F, -1.05F);

		to150mmModel[6].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, -0.1F, 0F, -0.1F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F); // Import ImportBox12
		to150mmModel[6].setRotationPoint(-1.05F, 4F, -1.05F);

		to150mmModel[7].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.1F, 0F, -0.1F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F); // Import ImportBox13
		to150mmModel[7].setRotationPoint(-1.05F, 4F, 0.05F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 8; i++)
		{
			to150mmModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo to150mmModel[];
}