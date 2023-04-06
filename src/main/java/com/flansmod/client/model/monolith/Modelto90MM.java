//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: to90MM
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelto90MM extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public Modelto90MM()
	{
		to90mmModel = new ModelRendererTurbo[8];
		to90mmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox2
		to90mmModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import ImportBox8
		to90mmModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox9
		to90mmModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox10
		to90mmModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import ImportBox11
		to90mmModel[5] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Import ImportBox12
		to90mmModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Import ImportBox13
		to90mmModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Import ImportBox14

		to90mmModel[0].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import ImportBox2
		to90mmModel[0].setRotationPoint(-1.05F, -8.05F, -1.05F);

		to90mmModel[1].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F); // Import ImportBox8
		to90mmModel[1].setRotationPoint(-1.05F, -8.05F, 0.05F);

		to90mmModel[2].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F); // Import ImportBox9
		to90mmModel[2].setRotationPoint(0.05F, -8.05F, 0.05F);

		to90mmModel[3].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox10
		to90mmModel[3].setRotationPoint(0.05F, -8.05F, -1.05F);

		to90mmModel[4].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F, -0.95F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox11
		to90mmModel[4].setRotationPoint(0.05F, 4.05F, -1.05F);

		to90mmModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F); // Import ImportBox12
		to90mmModel[5].setRotationPoint(0.05F, 4.05F, 0.05F);

		to90mmModel[6].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.35F, 0F, -0.35F, -0.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.95F, -0.95F, 0F, -0.95F); // Import ImportBox13
		to90mmModel[6].setRotationPoint(-1.05F, 4.05F, 0.05F);

		to90mmModel[7].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F, -0.35F, 0F, -0.35F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.95F, 0F, -0.95F, 0F, 0F, -0.95F, 0F, 0F, 0F, -0.95F, 0F, 0F); // Import ImportBox14
		to90mmModel[7].setRotationPoint(-1.05F, 4.05F, -1.05F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 8; i++)
		{
			to90mmModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo to90mmModel[];
}