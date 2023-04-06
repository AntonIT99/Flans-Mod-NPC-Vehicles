//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ARCgunBullet
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelARCbullet extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelARCbullet()
	{
		arcbulletModel = new ModelRendererTurbo[8];
		arcbulletModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		arcbulletModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1
		arcbulletModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 2
		arcbulletModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 4
		arcbulletModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		arcbulletModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 7
		arcbulletModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		arcbulletModel[7] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 1

		arcbulletModel[0].addShapeBox(-1F, -4F, -1F, 2, 11, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 0
		arcbulletModel[0].setRotationPoint(0F, 0F, 0F);

		arcbulletModel[1].addShapeBox(-1F, 39F, -1F, 2, 14, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		arcbulletModel[1].setRotationPoint(0F, 0F, 0F);

		arcbulletModel[2].addShapeBox(-1F, -17F, -1F, 2, 13, 2, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		arcbulletModel[2].setRotationPoint(0F, 0F, 0F);

		arcbulletModel[3].addShapeBox(-1F, 7F, -1F, 2, 10, 2, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		arcbulletModel[3].setRotationPoint(0F, 0F, 0F);

		arcbulletModel[4].addShapeBox(0F, 17F, -2F, 2, 12, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -1F, 2F, 0F, -1F); // Box 5
		arcbulletModel[4].setRotationPoint(0F, 0F, 0F);

		arcbulletModel[5].addShapeBox(-2F, 29F, -1F, 2, 10, 2, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 7
		arcbulletModel[5].setRotationPoint(0F, 0F, 0F);

		arcbulletModel[6].addShapeBox(-1F, 53F, -2F, 2, 10, 2, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 0
		arcbulletModel[6].setRotationPoint(0F, 0F, 0F);

		arcbulletModel[7].addShapeBox(-2F, 63F, -2F, 2, 13, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 1
		arcbulletModel[7].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 8; i++)
		{
			arcbulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo arcbulletModel[];
}