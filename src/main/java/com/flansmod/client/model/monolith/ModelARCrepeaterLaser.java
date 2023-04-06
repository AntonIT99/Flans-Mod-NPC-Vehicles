//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ArcRepeaterBullet2
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelARCrepeaterLaser extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelARCrepeaterLaser()
	{
		arcrepeaterlaserModel = new ModelRendererTurbo[6];
		arcrepeaterlaserModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		arcrepeaterlaserModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 21
		arcrepeaterlaserModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 22
		arcrepeaterlaserModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 23
		arcrepeaterlaserModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 24
		arcrepeaterlaserModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 25

		arcrepeaterlaserModel[0].addShapeBox(-0.5F, 0F, -0.5F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		arcrepeaterlaserModel[0].setRotationPoint(0F, 0F, 0F);

		arcrepeaterlaserModel[1].addShapeBox(-0.5F, 11F, -0.5F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, 1F, -1F, 0F, -1F, 1F, 0F, -1F); // Box 21
		arcrepeaterlaserModel[1].setRotationPoint(0F, 0F, 0F);

		arcrepeaterlaserModel[2].addShapeBox(-1.5F, 22F, -1.5F, 1, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 2F, -2F, 0F, 2F); // Box 22
		arcrepeaterlaserModel[2].setRotationPoint(0F, 0F, 0F);

		arcrepeaterlaserModel[3].addShapeBox(0.5F, 28F, 0.5F, 1, 7, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, -3F, 2F, 0F, -3F); // Box 23
		arcrepeaterlaserModel[3].setRotationPoint(0F, 0F, 0F);

		arcrepeaterlaserModel[4].addShapeBox(-1.5F, 35F, -2.5F, 1, 11, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 2F, 0F, -2F, 2F, 0F, 2F, -2F, 0F, 2F); // Box 24
		arcrepeaterlaserModel[4].setRotationPoint(0F, 0F, 0F);

		arcrepeaterlaserModel[5].addShapeBox(-0.5F, 46F, -0.5F, 1, 11, 1, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		arcrepeaterlaserModel[5].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 6; i++)
		{
			arcrepeaterlaserModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo arcrepeaterlaserModel[];
}