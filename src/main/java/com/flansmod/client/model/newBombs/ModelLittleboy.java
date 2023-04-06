//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.07.2018 - 19:41:40
// Last changed on: 29.07.2018 - 19:41:40

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLittleboy extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelLittleboy()
	{
		littleboyModel = new ModelRendererTurbo[19];
		littleboyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		littleboyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		littleboyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		littleboyModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 3
		littleboyModel[4] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 4
		littleboyModel[5] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 5
		littleboyModel[6] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 6
		littleboyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 8
		littleboyModel[8] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 9
		littleboyModel[9] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 14
		littleboyModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
		littleboyModel[11] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 16
		littleboyModel[12] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 17
		littleboyModel[13] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 18
		littleboyModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		littleboyModel[15] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 20
		littleboyModel[16] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		littleboyModel[17] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 22
		littleboyModel[18] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 23

		littleboyModel[0].addShapeBox(0F, 0F, 0F, 5, 25, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		littleboyModel[0].setRotationPoint(0F, -8F, 0.5F);

		littleboyModel[1].addShapeBox(0F, 0F, 0F, 2, 25, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1
		littleboyModel[1].setRotationPoint(5F, -8F, 0.5F);

		littleboyModel[2].addShapeBox(0F, 0F, 0F, 2, 25, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		littleboyModel[2].setRotationPoint(-2F, -8F, 0.5F);

		littleboyModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, -3F, 0F, -3F); // Box 3
		littleboyModel[3].setRotationPoint(-2F, 17F, 0.5F);

		littleboyModel[4].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F); // Box 4
		littleboyModel[4].setRotationPoint(0F, 17F, 0.5F);

		littleboyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 1F, 0F, -3F); // Box 5
		littleboyModel[5].setRotationPoint(5F, 17F, 0.5F);

		littleboyModel[6].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F, 2F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		littleboyModel[6].setRotationPoint(5F, -16F, 0.5F);

		littleboyModel[7].addShapeBox(0F, 0F, 0F, 5, 8, 9, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		littleboyModel[7].setRotationPoint(0F, -16F, 0.5F);

		littleboyModel[8].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F, -3F, 0F, -3F, 2F, 0F, -3F, 2F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		littleboyModel[8].setRotationPoint(-2F, -16F, 0.5F);

		littleboyModel[9].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		littleboyModel[9].setRotationPoint(1F, -23F, 3.5F);

		littleboyModel[10].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		littleboyModel[10].setRotationPoint(-4F, -27F, 10F);

		littleboyModel[11].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		littleboyModel[11].setRotationPoint(-4F, -27F, -1F);

		littleboyModel[12].addShapeBox(0F, 0F, 0F, 12, 5, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		littleboyModel[12].setRotationPoint(-4F, -27F, -1F);

		littleboyModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		littleboyModel[13].setRotationPoint(7F, -27F, -1F);

		littleboyModel[14].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, 0F, 0F, -0.5F, 0.5F, 4F, 3.5F, 1F, 4F, -4F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -6F, 3.5F, 1F, -6F, -4F, -0.5F, 0F, 0F); // Box 19
		littleboyModel[14].setRotationPoint(3.5F, -23F, 3F);

		littleboyModel[15].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, 3.5F, 4F, 0.5F, -4F, 4F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 3.5F, -6F, 0.5F, -4F, -6F, 1F, 0F, 0F, -0.5F, -0.5F, 0F, 0F); // Box 20
		littleboyModel[15].setRotationPoint(0.5F, -23F, 0F);

		littleboyModel[16].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F, -0.5F, 0F, 0F, 1F, 4F, -4F, 0.5F, 4F, 3.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 1F, -6F, -4F, 0.5F, -6F, 3.5F, 0F, 0F, -0.5F); // Box 21
		littleboyModel[16].setRotationPoint(3.5F, -23F, 6F);

		littleboyModel[17].addShapeBox(0F, 0F, 0F, 1, 7, 4, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -4F, 4F, 1F, 3.5F, 4F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, -4F, -6F, 1F, 3.5F, -6F, 0.5F); // Box 22
		littleboyModel[17].setRotationPoint(0.5F, -23F, 6F);

		littleboyModel[18].addShapeBox(0F, 0F, 0F, 10, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		littleboyModel[18].setRotationPoint(-3F, -27F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 19; i++)
		{
			littleboyModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo littleboyModel[];
}