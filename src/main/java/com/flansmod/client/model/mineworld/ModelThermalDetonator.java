//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.6
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelThermalDetonator extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelThermalDetonator()
	{
		thermaldetonatorModel = new ModelRendererTurbo[2];
		thermaldetonatorModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		thermaldetonatorModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1

		thermaldetonatorModel[0].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 0
		thermaldetonatorModel[0].setRotationPoint(-1F, -1F, -1F);

		thermaldetonatorModel[1].addShapeBox(0F, 0F, -0.5F, 1, 1, 1, 0F, 0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.75F, 0F, -0.25F); // Box 1
		thermaldetonatorModel[1].setRotationPoint(-0.5F, -1.3F, -0.5F);
		thermaldetonatorModel[1].rotateAngleY = 0.78539816F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 2; i++)
		{
			thermaldetonatorModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo thermaldetonatorModel[];
}