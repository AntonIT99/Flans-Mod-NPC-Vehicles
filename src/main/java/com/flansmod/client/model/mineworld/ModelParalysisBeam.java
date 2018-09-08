//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.1.6
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelParalysisBeam extends ModelBase
{
	int textureX = 64;
	int textureY = 32;

	public ModelParalysisBeam()
	{
		paralysisbeamModel = new ModelRendererTurbo[4];
		paralysisbeamModel[0] = new ModelRendererTurbo(this, 14, 12, textureX, textureY); // Import Box0
		paralysisbeamModel[1] = new ModelRendererTurbo(this, 14, 12, textureX, textureY); // Import Box1
		paralysisbeamModel[2] = new ModelRendererTurbo(this, 14, 12, textureX, textureY); // Import Box2
		paralysisbeamModel[3] = new ModelRendererTurbo(this, 14, 12, textureX, textureY); // Import Box3

		paralysisbeamModel[0].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Import Box0
		paralysisbeamModel[0].setRotationPoint(-5.5F, 0F, -5.5F);

		paralysisbeamModel[1].addBox(0F, 0F, 0F, 1, 1, 11, 0F); // Import Box1
		paralysisbeamModel[1].setRotationPoint(4.5F, 0F, -5.5F);

		paralysisbeamModel[2].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import Box2
		paralysisbeamModel[2].setRotationPoint(-5.5F, 0F, -5.5F);

		paralysisbeamModel[3].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Import Box3
		paralysisbeamModel[3].setRotationPoint(-5.5F, 0F, 4.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 4; i++)
		{
			paralysisbeamModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo paralysisbeamModel[];
}