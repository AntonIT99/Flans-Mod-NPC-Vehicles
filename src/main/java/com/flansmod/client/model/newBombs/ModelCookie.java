//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:30.07.2018 - 22:50:49
// Last changed on: 30.07.2018 - 22:50:49

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCookie extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelCookie()
	{
		cookieModel = new ModelRendererTurbo[9];
		cookieModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		cookieModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		cookieModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		cookieModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		cookieModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 12
		cookieModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		cookieModel[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		cookieModel[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		cookieModel[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 44

		cookieModel[0].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		cookieModel[0].setRotationPoint(0F, -49F, 6F);

		cookieModel[1].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		cookieModel[1].setRotationPoint(0F, -49F, -6F);

		cookieModel[2].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		cookieModel[2].setRotationPoint(6F, -49F, 0F);

		cookieModel[3].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		cookieModel[3].setRotationPoint(-6F, -49F, 0F);

		cookieModel[4].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		cookieModel[4].setRotationPoint(-6F, -49F, -6F);

		cookieModel[5].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 13
		cookieModel[5].setRotationPoint(-6F, -49F, 6F);

		cookieModel[6].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 14
		cookieModel[6].setRotationPoint(6F, -49F, 6F);

		cookieModel[7].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		cookieModel[7].setRotationPoint(6F, -49F, -6F);

		cookieModel[8].addShapeBox(0F, 0F, 0F, 6, 40, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		cookieModel[8].setRotationPoint(0F, -49F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 9; i++)
		{
			cookieModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo cookieModel[];
}