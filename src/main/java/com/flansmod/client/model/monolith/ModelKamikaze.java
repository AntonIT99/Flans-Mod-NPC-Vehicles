//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:25.12.2016 - 13:41:10
// Last changed on: 25.12.2016 - 13:41:10

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKamikaze extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelKamikaze()
	{
		kamikazeModel = new ModelRendererTurbo[22];
		kamikazeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		kamikazeModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		kamikazeModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 3
		kamikazeModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 4
		kamikazeModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 5
		kamikazeModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 6
		kamikazeModel[6] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 7
		kamikazeModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 8
		kamikazeModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 9
		kamikazeModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 10
		kamikazeModel[10] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
		kamikazeModel[11] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 12
		kamikazeModel[12] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 13
		kamikazeModel[13] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 14
		kamikazeModel[14] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 15
		kamikazeModel[15] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 15
		kamikazeModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 16
		kamikazeModel[17] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		kamikazeModel[18] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 18
		kamikazeModel[19] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 19
		kamikazeModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 20
		kamikazeModel[21] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 21

		kamikazeModel[0].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 1
		kamikazeModel[0].setRotationPoint(-3.5F, 19F, -3F);

		kamikazeModel[1].addShapeBox(0F, 0F, 0F, 7, 11, 7, 0F, -1.2F, 0F, -0.5F, -1.2F, 0F, -0.5F, -1.2F, 0F, -1F, -1.2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		kamikazeModel[1].setRotationPoint(-3.5F, -13F, -3F);

		kamikazeModel[2].addShapeBox(0F, 0F, 0F, 7, 21, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		kamikazeModel[2].setRotationPoint(-3.5F, -2F, -3F);

		kamikazeModel[3].addShapeBox(0F, 0F, 0F, 5, 16, 6, 0F, -2.2F, 0F, -3F, -2.2F, 0F, -3F, -2.2F, 0F, -2.8F, -2.2F, 0F, -2.8F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 4
		kamikazeModel[3].setRotationPoint(-2.5F, -29F, -3F);

		kamikazeModel[4].addShapeBox(0F, 0F, 0F, 1, 7, 10, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 5
		kamikazeModel[4].setRotationPoint(-0.5F, -29F, -10F);

		kamikazeModel[5].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, 4F, 0F, -0.25F, 4F, 0F); // Box 6
		kamikazeModel[5].setRotationPoint(-0.5F, -22F, -10F);

		kamikazeModel[6].addShapeBox(0F, 0F, 0F, 5, 5, 3, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		kamikazeModel[6].setRotationPoint(-2.5F, 6.5F, -6F);

		kamikazeModel[7].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		kamikazeModel[7].setRotationPoint(-2.5F, -1.5F, -6F);

		kamikazeModel[8].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.2F, -3F, -2F, -0.2F, -3F, -2F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 9
		kamikazeModel[8].setRotationPoint(-2.5F, 11.5F, -6F);

		kamikazeModel[9].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		kamikazeModel[9].setRotationPoint(-1F, 24.5F, -0.5F);

		kamikazeModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		kamikazeModel[10].setRotationPoint(-2F, 9F, 5F);

		kamikazeModel[11].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 12
		kamikazeModel[11].setRotationPoint(-2F, 14F, 5F);

		kamikazeModel[12].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		kamikazeModel[12].setRotationPoint(-2F, 6F, 5F);

		kamikazeModel[13].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		kamikazeModel[13].setRotationPoint(-1.5F, 4F, 5.5F);

		kamikazeModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		kamikazeModel[14].setRotationPoint(-1F, 11F, 4F);

		kamikazeModel[15].addShapeBox(0F, 0F, 0F, 34, 17, 3, 0F, 0F, 0F, -1F, 0F, -7F, 0.5F, 0F, -7F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0.5F, 0F, -4F, -2F, 0F, 0F, 0F); // Box 15
		kamikazeModel[15].setRotationPoint(3.5F, 2F, 1F);

		kamikazeModel[16].addShapeBox(0F, 0F, 0F, 34, 17, 3, 0F, 0F, -7F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -7F, -2F, 0F, -4F, 0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, -2F); // Box 16
		kamikazeModel[16].setRotationPoint(-37.5F, 2F, 1F);

		kamikazeModel[17].addShapeBox(0F, 0F, 0F, 14, 10, 1, 0F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -6F, -0.2F, 0F, -6F, -0.2F, 0F, 0F, -0.2F); // Box 17
		kamikazeModel[17].setRotationPoint(0F, -23F, -1F);

		kamikazeModel[18].addShapeBox(0F, 0F, 0F, 14, 10, 1, 0F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -6F, -0.2F); // Box 18
		kamikazeModel[18].setRotationPoint(-15F, -23F, -1F);

		kamikazeModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		kamikazeModel[19].setRotationPoint(-0.5F, 26F, -8.5F);

		kamikazeModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -5F, -7.3F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, -5F, -7.3F, 0F, -4F); // Box 20
		kamikazeModel[20].setRotationPoint(-0.5F, 26F, 1F);

		kamikazeModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.3F, 0F, -4F, 7F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -7.3F, 0F, -4F, 7F, 0F, -5F); // Box 21
		kamikazeModel[21].setRotationPoint(-0.5F, 26F, 1F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 22; i++)
		{
			kamikazeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo kamikazeModel[];
}