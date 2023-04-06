//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCorpseAmmo extends ModelBase
{
	int textureX = 128;
	int textureY = 64;

	public ModelCorpseAmmo()
	{
		corpseammoModel = new ModelRendererTurbo[6];
		corpseammoModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		corpseammoModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		corpseammoModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		corpseammoModel[3] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 3
		corpseammoModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 4
		corpseammoModel[5] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 5

		corpseammoModel[0].addShapeBox(-4F, -2F, -6F, 8, 4, 12, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		corpseammoModel[0].setRotationPoint(0F, 0F, 0F);

		corpseammoModel[1].addShapeBox(-4F, -4F, 6F, 8, 8, 8, 0F, 1F, -0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 1F, -0.5F, 0F, -1F, 0.5F, 0F, 1F, -0.5F, 0F, 1F, -0.5F, 0F, -1F, 0.5F, 0F); // Box 1
		corpseammoModel[1].setRotationPoint(0F, 0F, 0F);

		corpseammoModel[2].addShapeBox(4F, -2F, 2F, 12, 4, 4, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, 0F, 0F, 0F); // Box 2
		corpseammoModel[2].setRotationPoint(0F, 0F, 0F);

		corpseammoModel[3].addShapeBox(-16F, -2F, 2F, 12, 4, 4, 0F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 3
		corpseammoModel[3].setRotationPoint(0F, 0F, 0F);

		corpseammoModel[4].addShapeBox(-4F, -2F, -18F, 4, 4, 12, 0F, 1F, 0F, -1F, -1F, 0F, 1F, 0.5F, 0F, 0F, -1F, 0F, 1F, 1F, 0F, -1F, -1F, 0F, 1F, 0.5F, 0F, 0F, -1F, 0F, 1F); // Box 4
		corpseammoModel[4].setRotationPoint(0F, 0F, 0F);

		corpseammoModel[5].addShapeBox(1F, -2F, -18F, 4, 4, 12, 0F, -6F, 0F, -2F, 6F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -1F, -6F, 0F, -2F, 6F, 0F, -4F, 0F, 0F, 1F, 0F, 0F, -1F); // Box 5
		corpseammoModel[5].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 6; i++)
		{
			corpseammoModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo corpseammoModel[];
}