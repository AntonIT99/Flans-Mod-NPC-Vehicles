//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ARCgunBulletPig
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPigBullet extends ModelBase
{
	int textureX = 64;
	int textureY = 64;

	public ModelPigBullet()
	{
		pigbulletModel = new ModelRendererTurbo[7];
		pigbulletModel[0] = new ModelRendererTurbo(this, 1, 18, textureX, textureY); // Box 2
		pigbulletModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 26
		pigbulletModel[2] = new ModelRendererTurbo(this, 26, 1, textureX, textureY); // Box 27
		pigbulletModel[3] = new ModelRendererTurbo(this, 34, 6, textureX, textureY); // Box 28
		pigbulletModel[4] = new ModelRendererTurbo(this, 34, 6, textureX, textureY); // Box 29
		pigbulletModel[5] = new ModelRendererTurbo(this, 34, 6, textureX, textureY); // Box 30
		pigbulletModel[6] = new ModelRendererTurbo(this, 34, 6, textureX, textureY); // Box 31

		pigbulletModel[0].addShapeBox(-9F, 7F, -5F, 16, 8, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		pigbulletModel[0].setRotationPoint(0F, 0F, 0F);

		pigbulletModel[1].addShapeBox(5F, 5F, -4F, 8, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		pigbulletModel[1].setRotationPoint(0F, 0F, 0F);

		pigbulletModel[2].addShapeBox(12.5F, 9F, -2F, 1, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		pigbulletModel[2].setRotationPoint(0F, 0F, 0F);

		pigbulletModel[3].addShapeBox(2F, 15F, -5F, 4, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		pigbulletModel[3].setRotationPoint(0F, 0F, 0F);

		pigbulletModel[4].addShapeBox(2F, 15F, 1F, 4, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		pigbulletModel[4].setRotationPoint(0F, 0F, 0F);

		pigbulletModel[5].addShapeBox(-10F, 15F, -5F, 4, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		pigbulletModel[5].setRotationPoint(0F, 0F, 0F);

		pigbulletModel[6].addShapeBox(-10F, 15F, 1F, 4, 6, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		pigbulletModel[6].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 7; i++)
		{
			pigbulletModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo pigbulletModel[];
}