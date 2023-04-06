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

public class Modelbomb500kg extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public Modelbomb500kg()
	{
		bomb500kgModel = new ModelRendererTurbo[14];
		bomb500kgModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bomb500kgModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bomb500kgModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		bomb500kgModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 3
		bomb500kgModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		bomb500kgModel[5] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 5
		bomb500kgModel[6] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 6
		bomb500kgModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 8
		bomb500kgModel[8] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 9
		bomb500kgModel[9] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 10
		bomb500kgModel[10] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 11
		bomb500kgModel[11] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 12
		bomb500kgModel[12] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 13
		bomb500kgModel[13] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 14

		bomb500kgModel[0].addShapeBox(0F, 0F, 0F, 5, 17, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bomb500kgModel[0].setRotationPoint(0F, 0F, 0.5F);

		bomb500kgModel[1].addShapeBox(0F, 0F, 0F, 2, 17, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 1
		bomb500kgModel[1].setRotationPoint(5F, 0F, 0.5F);

		bomb500kgModel[2].addShapeBox(0F, 0F, 0F, 2, 17, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 2
		bomb500kgModel[2].setRotationPoint(-2F, 0F, 0.5F);

		bomb500kgModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -3F, 1F, 0F, -3F, 1F, 0F, -3F, -3F, 0F, -3F); // Box 3
		bomb500kgModel[3].setRotationPoint(-2F, 17F, 0.5F);

		bomb500kgModel[4].addShapeBox(0F, 0F, 0F, 5, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F); // Box 4
		bomb500kgModel[4].setRotationPoint(0F, 17F, 0.5F);

		bomb500kgModel[5].addShapeBox(0F, 0F, 0F, 2, 5, 9, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 1F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 1F, 0F, -3F); // Box 5
		bomb500kgModel[5].setRotationPoint(5F, 17F, 0.5F);

		bomb500kgModel[6].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F, 2F, 0F, -4F, -4F, 0F, -4F, -4F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 6
		bomb500kgModel[6].setRotationPoint(5F, -8F, 0.5F);

		bomb500kgModel[7].addShapeBox(0F, 0F, 0F, 5, 8, 9, 0F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bomb500kgModel[7].setRotationPoint(0F, -8F, 0.5F);

		bomb500kgModel[8].addShapeBox(0F, 0F, 0F, 2, 8, 9, 0F, -3F, 0F, -4F, 2F, 0F, -4F, 2F, 0F, -4F, -4F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 9
		bomb500kgModel[8].setRotationPoint(-2F, -8F, 0.5F);

		bomb500kgModel[9].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 4F, 0F, -0.25F, 4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 10
		bomb500kgModel[9].setRotationPoint(2F, -14F, 5F);

		bomb500kgModel[10].addShapeBox(0F, 0F, 0F, 1, 12, 6, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 4F, 0F, -0.25F, 4F, 0F); // Box 11
		bomb500kgModel[10].setRotationPoint(2F, -14F, -1F);

		bomb500kgModel[11].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 4F, -0.25F, 0F, 4F, -0.25F, 0F, 0F, -0.25F); // Box 12
		bomb500kgModel[11].setRotationPoint(-3.5F, -14F, 4.5F);

		bomb500kgModel[12].addShapeBox(0F, 0F, 0F, 6, 12, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 4F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 4F, -0.25F); // Box 13
		bomb500kgModel[12].setRotationPoint(2.5F, -14F, 4.5F);

		bomb500kgModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F); // Box 14
		bomb500kgModel[13].setRotationPoint(1F, 22F, 3.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 14; i++)
		{
			bomb500kgModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bomb500kgModel[];
}