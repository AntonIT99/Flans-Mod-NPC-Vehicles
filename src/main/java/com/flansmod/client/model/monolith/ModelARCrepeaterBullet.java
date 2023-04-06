//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ArcRepeaterBullet1
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelARCrepeaterBullet extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelARCrepeaterBullet()
	{
		arcrepeaterbulletModel = new ModelRendererTurbo[19];
		arcrepeaterbulletModel[0] = new ModelRendererTurbo(this, 7, 1, textureX, textureY); // Box 2
		arcrepeaterbulletModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 3
		arcrepeaterbulletModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 4
		arcrepeaterbulletModel[3] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 5
		arcrepeaterbulletModel[4] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 6
		arcrepeaterbulletModel[5] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 7
		arcrepeaterbulletModel[6] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 8
		arcrepeaterbulletModel[7] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 9
		arcrepeaterbulletModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 10
		arcrepeaterbulletModel[9] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 11
		arcrepeaterbulletModel[10] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 12
		arcrepeaterbulletModel[11] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 13
		arcrepeaterbulletModel[12] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 14
		arcrepeaterbulletModel[13] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 15
		arcrepeaterbulletModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 16
		arcrepeaterbulletModel[15] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 17
		arcrepeaterbulletModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 18
		arcrepeaterbulletModel[17] = new ModelRendererTurbo(this, 2, 5, textureX, textureY); // Box 19
		arcrepeaterbulletModel[18] = new ModelRendererTurbo(this, 0, 4, textureX, textureY); // Box 20

		arcrepeaterbulletModel[0].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		arcrepeaterbulletModel[0].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[1].addShapeBox(-1F, 7F, -1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		arcrepeaterbulletModel[1].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[2].addShapeBox(-1F, 9F, -1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 4
		arcrepeaterbulletModel[2].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[3].addShapeBox(-2F, 25F, -3F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		arcrepeaterbulletModel[3].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[4].addShapeBox(-2F, 27F, -3F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 6
		arcrepeaterbulletModel[4].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[5].addShapeBox(-3F, 2F, -3F, 5, 5, 5, 0F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 7
		arcrepeaterbulletModel[5].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[6].addShapeBox(-4F, 20F, -5F, 5, 5, 5, 0F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 8
		arcrepeaterbulletModel[6].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[7].addShapeBox(3F, 24F, -1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 9
		arcrepeaterbulletModel[7].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[8].addShapeBox(3F, 22F, -1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		arcrepeaterbulletModel[8].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[9].addShapeBox(1F, 17F, -3F, 5, 5, 5, 0F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 11
		arcrepeaterbulletModel[9].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[10].addShapeBox(-4F, 34F, 1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 12
		arcrepeaterbulletModel[10].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[11].addShapeBox(-4F, 32F, 1F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		arcrepeaterbulletModel[11].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[12].addShapeBox(-6F, 27F, -1F, 5, 5, 5, 0F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 14
		arcrepeaterbulletModel[12].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[13].addShapeBox(0F, 19F, 2F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 15
		arcrepeaterbulletModel[13].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[14].addShapeBox(0F, 17F, 2F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		arcrepeaterbulletModel[14].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[15].addShapeBox(-2F, 12F, 0F, 5, 5, 5, 0F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 17
		arcrepeaterbulletModel[15].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[16].addShapeBox(0F, 38F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		arcrepeaterbulletModel[16].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[17].addShapeBox(-2F, 33F, -2F, 5, 5, 5, 0F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2.2F, 0F, -2.2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 19
		arcrepeaterbulletModel[17].setRotationPoint(0F, 0F, 0F);

		arcrepeaterbulletModel[18].addShapeBox(0F, 40F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 20
		arcrepeaterbulletModel[18].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 19; i++)
		{
			arcrepeaterbulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo arcrepeaterbulletModel[];
}