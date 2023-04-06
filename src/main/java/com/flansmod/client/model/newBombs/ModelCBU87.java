//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:31.07.2018 - 16:07:20
// Last changed on: 31.07.2018 - 16:07:20

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCBU87 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelCBU87()
	{
		cbu87Model = new ModelRendererTurbo[13];
		cbu87Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		cbu87Model[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		cbu87Model[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		cbu87Model[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		cbu87Model[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 4
		cbu87Model[5] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 6
		cbu87Model[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 7
		cbu87Model[7] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 8
		cbu87Model[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 9
		cbu87Model[9] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 10
		cbu87Model[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		cbu87Model[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 12
		cbu87Model[12] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 13

		cbu87Model[0].addShapeBox(0F, 0F, 0F, 4, 35, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		cbu87Model[0].setRotationPoint(-2F, -17F, -4F);

		cbu87Model[1].addShapeBox(0F, 0F, 0F, 2, 35, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1
		cbu87Model[1].setRotationPoint(2F, -17F, -4F);

		cbu87Model[2].addShapeBox(0F, 0F, 0F, 2, 35, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		cbu87Model[2].setRotationPoint(-4F, -17F, -4F);

		cbu87Model[3].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 1F, 0F, -3F); // Box 3
		cbu87Model[3].setRotationPoint(2F, 18F, -4F);

		cbu87Model[4].addShapeBox(0F, 0F, 0F, 4, 2, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F); // Box 4
		cbu87Model[4].setRotationPoint(-2F, 18F, -4F);

		cbu87Model[5].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, -3F, 0F, -3F); // Box 6
		cbu87Model[5].setRotationPoint(-4F, 18F, -4F);

		cbu87Model[6].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, 1F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 7
		cbu87Model[6].setRotationPoint(2F, -22F, -4F);

		cbu87Model[7].addShapeBox(0F, 0F, 0F, 4, 5, 8, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		cbu87Model[7].setRotationPoint(-2F, -22F, -4F);

		cbu87Model[8].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F, -3F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		cbu87Model[8].setRotationPoint(-4F, -22F, -4F);

		cbu87Model[9].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		cbu87Model[9].setRotationPoint(-0.5F, -22F, -4F);

		cbu87Model[10].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		cbu87Model[10].setRotationPoint(-4F, -22F, -0.5F);

		cbu87Model[11].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		cbu87Model[11].setRotationPoint(-0.5F, -22F, 1F);

		cbu87Model[12].addShapeBox(0F, 0F, 0F, 3, 5, 1, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		cbu87Model[12].setRotationPoint(1F, -22F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 13; i++)
		{
			cbu87Model[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo cbu87Model[];
}