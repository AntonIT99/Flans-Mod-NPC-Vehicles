//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:31.07.2018 - 15:47:56
// Last changed on: 31.07.2018 - 15:47:56

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAIR2 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelAIR2()
	{
		air2Model = new ModelRendererTurbo[25];
		air2Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		air2Model[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		air2Model[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 2
		air2Model[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		air2Model[4] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 4
		air2Model[5] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 6
		air2Model[6] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 7
		air2Model[7] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 8
		air2Model[8] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 10
		air2Model[9] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 11
		air2Model[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 12
		air2Model[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 13
		air2Model[12] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 14
		air2Model[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 15
		air2Model[14] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 16
		air2Model[15] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 17
		air2Model[16] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 18
		air2Model[17] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 19
		air2Model[18] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		air2Model[19] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 21
		air2Model[20] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 22
		air2Model[21] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 23
		air2Model[22] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 24
		air2Model[23] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 25
		air2Model[24] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 26

		air2Model[0].addShapeBox(0F, 0F, 0F, 4, 37, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		air2Model[0].setRotationPoint(-2F, -27F, -6F);

		air2Model[1].addShapeBox(0F, 0F, 0F, 4, 37, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 1
		air2Model[1].setRotationPoint(2F, -27F, -6F);

		air2Model[2].addShapeBox(0F, 0F, 0F, 4, 37, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 2
		air2Model[2].setRotationPoint(-6F, -27F, -6F);

		air2Model[3].addShapeBox(0F, 0F, 0F, 4, 12, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -5F, 0F, -5F, 1F, 0F, -5F, 1F, 0F, -5F, -5F, 0F, -5F); // Box 3
		air2Model[3].setRotationPoint(-6F, 10F, -6F);

		air2Model[4].addShapeBox(0F, 0F, 0F, 4, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F, -1F, 0F, -5F); // Box 4
		air2Model[4].setRotationPoint(-2F, 10F, -6F);

		air2Model[5].addShapeBox(0F, 0F, 0F, 4, 12, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 1F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -5F, 1F, 0F, -5F); // Box 6
		air2Model[5].setRotationPoint(2F, 10F, -6F);

		air2Model[6].addShapeBox(0F, 0F, 0F, 4, 16, 12, 0F, -3F, 0F, -5F, 1F, 0F, -3F, 1F, 0F, -3F, -3F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 7
		air2Model[6].setRotationPoint(-6F, -43F, -6F);

		air2Model[7].addShapeBox(0F, 0F, 0F, 4, 16, 12, 0F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		air2Model[7].setRotationPoint(-2F, -43F, -6F);

		air2Model[8].addShapeBox(0F, 0F, 0F, 4, 16, 12, 0F, 1F, 0F, -3F, -3F, 0F, -5F, -3F, 0F, -5F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 10
		air2Model[8].setRotationPoint(2F, -43F, -6F);

		air2Model[9].addShapeBox(0F, 0F, 0F, 1, 24, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		air2Model[9].setRotationPoint(-0.5F, -44F, -10F);

		air2Model[10].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		air2Model[10].setRotationPoint(-0.5F, -50F, -10F);

		air2Model[11].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		air2Model[11].setRotationPoint(-0.5F, -48F, -7F);

		air2Model[12].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		air2Model[12].setRotationPoint(-0.5F, -46F, -4F);

		air2Model[13].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		air2Model[13].setRotationPoint(-0.5F, -46F, 3F);

		air2Model[14].addShapeBox(0F, 0F, 0F, 1, 24, 7, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F); // Box 16
		air2Model[14].setRotationPoint(-0.5F, -44F, 3F);

		air2Model[15].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		air2Model[15].setRotationPoint(-0.5F, -48F, 5F);

		air2Model[16].addShapeBox(0F, 0F, 0F, 1, 6, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		air2Model[16].setRotationPoint(-0.5F, -50F, 8F);

		air2Model[17].addShapeBox(0F, 0F, 0F, 7, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, 0F, 0F); // Box 19
		air2Model[17].setRotationPoint(3F, -44F, -0.5F);

		air2Model[18].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		air2Model[18].setRotationPoint(8F, -50F, -0.5F);

		air2Model[19].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		air2Model[19].setRotationPoint(5F, -48F, -0.5F);

		air2Model[20].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		air2Model[20].setRotationPoint(3F, -46F, -0.5F);

		air2Model[21].addShapeBox(0F, 0F, 0F, 7, 24, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -19F, 0F); // Box 23
		air2Model[21].setRotationPoint(-10F, -44F, -0.5F);

		air2Model[22].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		air2Model[22].setRotationPoint(-10F, -50F, -0.5F);

		air2Model[23].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		air2Model[23].setRotationPoint(-7F, -48F, -0.5F);

		air2Model[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		air2Model[24].setRotationPoint(-4F, -46F, -0.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 25; i++)
		{
			air2Model[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo air2Model[];
}