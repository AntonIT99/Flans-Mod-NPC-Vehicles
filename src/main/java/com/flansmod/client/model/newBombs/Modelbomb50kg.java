//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:29.07.2018 - 19:22:28
// Last changed on: 29.07.2018 - 19:22:28

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelbomb50kg extends ModelBase
{
	int textureX = 64;
	int textureY = 64;

	public Modelbomb50kg()
	{
		bomb50kgModel = new ModelRendererTurbo[13];
		bomb50kgModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bomb50kgModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bomb50kgModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		bomb50kgModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bomb50kgModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 4
		bomb50kgModel[5] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 5
		bomb50kgModel[6] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 6
		bomb50kgModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 7
		bomb50kgModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 8
		bomb50kgModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 9
		bomb50kgModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 10
		bomb50kgModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 11
		bomb50kgModel[12] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 12

		bomb50kgModel[0].addBox(0F, 0F, 0F, 1, 6, 3, 0F); // Box 0
		bomb50kgModel[0].setRotationPoint(0F, 0F, 0F);

		bomb50kgModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1
		bomb50kgModel[1].setRotationPoint(1F, 0F, 0F);

		bomb50kgModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bomb50kgModel[2].setRotationPoint(-1F, 0F, 0F);

		bomb50kgModel[3].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bomb50kgModel[3].setRotationPoint(0F, -5F, 0F);

		bomb50kgModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, 0.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		bomb50kgModel[4].setRotationPoint(1F, -5F, 0F);

		bomb50kgModel[5].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F, -1.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 5
		bomb50kgModel[5].setRotationPoint(-1F, -5F, 0F);

		bomb50kgModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 6
		bomb50kgModel[6].setRotationPoint(1F, 6F, 0F);

		bomb50kgModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		bomb50kgModel[7].setRotationPoint(0F, 6F, 0F);

		bomb50kgModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 8
		bomb50kgModel[8].setRotationPoint(-1F, 6F, 0F);

		bomb50kgModel[9].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 2F, 0F, -0.4F, 2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 9
		bomb50kgModel[9].setRotationPoint(0F, -7F, 1.5F);

		bomb50kgModel[10].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 2F, 0F, -0.4F, 2F, 0F); // Box 10
		bomb50kgModel[10].setRotationPoint(0F, -7F, -0.5F);

		bomb50kgModel[11].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 2F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 2F, -0.4F); // Box 11
		bomb50kgModel[11].setRotationPoint(0.5F, -7F, 1F);

		bomb50kgModel[12].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 2F, -0.4F, 0F, 2F, -0.4F, 0F, 0F, -0.4F); // Box 12
		bomb50kgModel[12].setRotationPoint(-1.5F, -7F, 1F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 13; i++)
		{
			bomb50kgModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo bomb50kgModel[];
}