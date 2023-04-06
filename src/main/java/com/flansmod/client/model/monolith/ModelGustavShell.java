//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GustavShell
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGustavShell extends ModelBase
{
	int textureX = 128;
	int textureY = 256;

	public ModelGustavShell()
	{
		gustavshellModel = new ModelRendererTurbo[8];
		gustavshellModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box14
		gustavshellModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box21
		gustavshellModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box22
		gustavshellModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box23
		gustavshellModel[4] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import Box24
		gustavshellModel[5] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import Box25
		gustavshellModel[6] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Import Box26
		gustavshellModel[7] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Import Box27

		gustavshellModel[0].addShapeBox(-6.95F, 0F, 0F, 7, 100, 7, 0F, -6.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.95F, -6.95F, 0F, -6.95F, 0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -1.4F, 0F, -1.4F); // Import Box14
		gustavshellModel[0].setRotationPoint(0.05F, -96.05F, 0.05F);

		gustavshellModel[1].addShapeBox(-6.95F, 0F, 0F, 7, 100, 7, 0F, -6.95F, 0F, -6.95F, 0F, 0F, -6.95F, 0F, 0F, 0F, -6.95F, 0F, 0F, -1.4F, 0F, -1.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.26F, 0F, 0F); // Import Box21
		gustavshellModel[1].setRotationPoint(0.05F, -96.05F, -7.05F);

		gustavshellModel[2].addShapeBox(-6.95F, 0F, 0F, 7, 100, 7, 0F, 0F, 0F, -6.95F, -6.95F, 0F, -6.95F, -6.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -1.4F, 0F, -1.4F, 0.26F, 0F, 0F, 0F, 0F, 0F); // Import Box22
		gustavshellModel[2].setRotationPoint(7.05F, -96.05F, -7.05F);

		gustavshellModel[3].addShapeBox(-6.95F, 0F, 0F, 7, 100, 7, 0F, 0F, 0F, 0F, -6.95F, 0F, 0F, -6.95F, 0F, -6.95F, 0F, 0F, -6.95F, 0F, 0F, 0F, 0.26F, 0F, 0F, -1.4F, 0F, -1.4F, 0F, 0F, 0.6F); // Import Box23
		gustavshellModel[3].setRotationPoint(7.05F, -96.05F, 0.05F);

		gustavshellModel[4].addShapeBox(-6.95F, 0F, 0F, 7, 40, 7, 0F, 0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, -1.4F, 0F, -1.4F, -6.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.95F, -6.95F, 0F, -6.95F); // Import Box24
		gustavshellModel[4].setRotationPoint(0.05F, 4.05F, 0.05F);

		gustavshellModel[5].addShapeBox(-6.95F, 0F, 0F, 7, 40, 7, 0F, -1.4F, 0F, -1.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.26F, 0F, 0F, -6.95F, 0F, -6.95F, 0F, 0F, -6.95F, 0F, 0F, 0F, -6.95F, 0F, 0F); // Import Box25
		gustavshellModel[5].setRotationPoint(0.05F, 4.05F, -7.05F);

		gustavshellModel[6].addShapeBox(-6.95F, 0F, 0F, 7, 40, 7, 0F, 0F, 0F, 0.6F, -1.4F, 0F, -1.4F, 0.26F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.95F, -6.95F, 0F, -6.95F, -6.95F, 0F, 0F, 0F, 0F, 0F); // Import Box26
		gustavshellModel[6].setRotationPoint(7.05F, 4.05F, -7.05F);

		gustavshellModel[7].addShapeBox(-6.95F, 0F, 0F, 7, 40, 7, 0F, 0F, 0F, 0F, 0.26F, 0F, 0F, -1.4F, 0F, -1.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, -6.95F, 0F, 0F, -6.95F, 0F, -6.95F, 0F, 0F, -6.95F); // Import Box27
		gustavshellModel[7].setRotationPoint(7.05F, 4.05F, 0.05F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 8; i++)
		{
			gustavshellModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo gustavshellModel[];
}