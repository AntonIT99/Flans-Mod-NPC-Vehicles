//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NavalMine
// Model Creator:
// Created on:07.07.2015 - 15:16:48
//same texture as naval mine

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSuperCannonBall extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelSuperCannonBall()
	{
		supercannonballModel = new ModelRendererTurbo[10];
		supercannonballModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		supercannonballModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 2
		supercannonballModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 4
		supercannonballModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 5
		supercannonballModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 9
		supercannonballModel[5] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 10
		supercannonballModel[6] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 11
		supercannonballModel[7] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 13
		supercannonballModel[8] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 14
		supercannonballModel[9] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 15

		supercannonballModel[0].addShapeBox(-2F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		supercannonballModel[0].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[1].addShapeBox(-2F, -6F, -6F, 4, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		supercannonballModel[1].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[2].addShapeBox(-6.01F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 4
		supercannonballModel[2].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[3].addShapeBox(-6.01F, -6.01F, -5.99F, 4, 4, 12, 0F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F); // Box 5
		supercannonballModel[3].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[4].addShapeBox(-2F, 2.01F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 9
		supercannonballModel[4].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[5].addShapeBox(-6.01F, -6.01F, -5.99F, 4, 4, 12, 0F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F); // Box 10
		supercannonballModel[5].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[6].addShapeBox(-6.01F, 1.99F, -5.99F, 4, 4, 12, 0F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F); // Box 11
		supercannonballModel[6].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[7].addShapeBox(1.99F, 1.99F, -5.99F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F); // Box 13
		supercannonballModel[7].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[8].addShapeBox(1.99F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 14
		supercannonballModel[8].setRotationPoint(0F, 0F, 0F);

		supercannonballModel[9].addShapeBox(1.99F, -6.01F, -5.99F, 4, 4, 12, 0F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F); // Box 15
		supercannonballModel[9].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 10; i++)
		{
			supercannonballModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo supercannonballModel[];
}