//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NavalMine
// Model Creator:
// Created on:07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNavalMine extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelNavalMine()
	{
		navalmineModel = new ModelRendererTurbo[17];
		navalmineModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		navalmineModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		navalmineModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		navalmineModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		navalmineModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 9
		navalmineModel[5] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 10
		navalmineModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 11
		navalmineModel[7] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 13
		navalmineModel[8] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 14
		navalmineModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 15
		navalmineModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
		navalmineModel[11] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 17
		navalmineModel[12] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 18
		navalmineModel[13] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 19
		navalmineModel[14] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 20
		navalmineModel[15] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 21
		navalmineModel[16] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 22

		navalmineModel[0].addShapeBox(-2F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		navalmineModel[0].setRotationPoint(0F, 0F, 0F);

		navalmineModel[1].addShapeBox(-2F, -6F, -6F, 4, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		navalmineModel[1].setRotationPoint(0F, 0F, 0F);

		navalmineModel[2].addShapeBox(-6.01F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 4
		navalmineModel[2].setRotationPoint(0F, 0F, 0F);

		navalmineModel[3].addShapeBox(-6.01F, -6.01F, -5.99F, 4, 4, 12, 0F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F); // Box 5
		navalmineModel[3].setRotationPoint(0F, 0F, 0F);

		navalmineModel[4].addShapeBox(-2F, 2.01F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 9
		navalmineModel[4].setRotationPoint(0F, 0F, 0F);

		navalmineModel[5].addShapeBox(-6.01F, -6.01F, -5.99F, 4, 4, 12, 0F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F); // Box 10
		navalmineModel[5].setRotationPoint(0F, 0F, 0F);

		navalmineModel[6].addShapeBox(-6.01F, 1.99F, -5.99F, 4, 4, 12, 0F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F); // Box 11
		navalmineModel[6].setRotationPoint(0F, 0F, 0F);

		navalmineModel[7].addShapeBox(1.99F, 1.99F, -5.99F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F); // Box 13
		navalmineModel[7].setRotationPoint(0F, 0F, 0F);

		navalmineModel[8].addShapeBox(1.99F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 14
		navalmineModel[8].setRotationPoint(0F, 0F, 0F);

		navalmineModel[9].addShapeBox(1.99F, -6.01F, -5.99F, 4, 4, 12, 0F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F); // Box 15
		navalmineModel[9].setRotationPoint(0F, 0F, 0F);

		navalmineModel[10].addShapeBox(-0.5F, -0.5F, -9F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		navalmineModel[10].setRotationPoint(0F, 0F, 0F);

		navalmineModel[11].addShapeBox(-9F, -0.5F, -0.5F, 18, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		navalmineModel[11].setRotationPoint(0F, 0F, 0F);

		navalmineModel[12].addShapeBox(-0.5F, -9F, -0.5F, 1, 18, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		navalmineModel[12].setRotationPoint(0F, 0F, 0F);

		navalmineModel[13].addShapeBox(-0.5F, -7F, 5.5F, 1, 14, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 13F, 0F, -1F, 13F, 0F, 0F, -13F, 0F, 0F, -13F); // Box 19
		navalmineModel[13].setRotationPoint(0F, 0F, 0F);

		navalmineModel[14].addShapeBox(-0.5F, -7F, -7F, 1, 14, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, -1F, 13F, 0F, -1F, 13F); // Box 20
		navalmineModel[14].setRotationPoint(0F, 0F, 0F);

		navalmineModel[15].addShapeBox(-6.5F, -7F, -0.5F, 1, 14, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -13F, 0F, 0F, 13F, -1F, 0F, 13F, -1F, 0F, -13F, 0F, 0F); // Box 21
		navalmineModel[15].setRotationPoint(0F, 0F, 0F);

		navalmineModel[16].addShapeBox(5.5F, -7F, -0.5F, 1, 14, 1, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 13F, -1F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, 13F, -1F, 0F); // Box 22
		navalmineModel[16].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 17; i++)
		{
			navalmineModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo navalmineModel[];
}