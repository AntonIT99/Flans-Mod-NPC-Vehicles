//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:30.07.2018 - 22:50:49
// Last changed on: 30.07.2018 - 22:50:49

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKH20 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelKH20()
	{
		kh20Model = new ModelRendererTurbo[34];
		kh20Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		kh20Model[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		kh20Model[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		kh20Model[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		kh20Model[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 12
		kh20Model[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		kh20Model[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		kh20Model[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		kh20Model[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 45
		kh20Model[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 46
		kh20Model[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 52
		kh20Model[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 53
		kh20Model[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 54
		kh20Model[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 55
		kh20Model[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 56
		kh20Model[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 57
		kh20Model[16] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 58
		kh20Model[17] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 59
		kh20Model[18] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 60
		kh20Model[19] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 61
		kh20Model[20] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 62
		kh20Model[21] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 63
		kh20Model[22] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 64
		kh20Model[23] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 65
		kh20Model[24] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 66
		kh20Model[25] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 67
		kh20Model[26] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 68
		kh20Model[27] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 69
		kh20Model[28] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 70
		kh20Model[29] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 71
		kh20Model[30] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 72
		kh20Model[31] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 73
		kh20Model[32] = new ModelRendererTurbo(this, 161, 57, textureX, textureY); // Box 74
		kh20Model[33] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 75

		kh20Model[0].addShapeBox(0F, 0F, 0F, 6, 49, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		kh20Model[0].setRotationPoint(0F, -45F, 6F);

		kh20Model[1].addShapeBox(0F, 0F, 0F, 6, 49, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		kh20Model[1].setRotationPoint(0F, -45F, -6F);

		kh20Model[2].addShapeBox(0F, 0F, 0F, 6, 49, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		kh20Model[2].setRotationPoint(6F, -45F, 0F);

		kh20Model[3].addShapeBox(0F, 0F, 0F, 6, 49, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		kh20Model[3].setRotationPoint(-6F, -45F, 0F);

		kh20Model[4].addShapeBox(0F, 0F, 0F, 6, 49, 6, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		kh20Model[4].setRotationPoint(-6F, -45F, -6F);

		kh20Model[5].addShapeBox(0F, 0F, 0F, 6, 49, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 13
		kh20Model[5].setRotationPoint(-6F, -45F, 6F);

		kh20Model[6].addShapeBox(0F, 0F, 0F, 6, 49, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 14
		kh20Model[6].setRotationPoint(6F, -45F, 6F);

		kh20Model[7].addShapeBox(0F, 0F, 0F, 6, 49, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		kh20Model[7].setRotationPoint(6F, -45F, -6F);

		kh20Model[8].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F); // Box 45
		kh20Model[8].setRotationPoint(0F, 4F, 6F);

		kh20Model[9].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5.5F, 0F, -5.5F); // Box 46
		kh20Model[9].setRotationPoint(-6F, 4F, 6F);

		kh20Model[10].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5.5F, 0F, -5.5F, 0F, 0F, -5F); // Box 52
		kh20Model[10].setRotationPoint(6F, 4F, 6F);

		kh20Model[11].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		kh20Model[11].setRotationPoint(0F, 4F, -6F);

		kh20Model[12].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 54
		kh20Model[12].setRotationPoint(6F, 4F, 0F);

		kh20Model[13].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 55
		kh20Model[13].setRotationPoint(-6F, 4F, 0F);

		kh20Model[14].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 56
		kh20Model[14].setRotationPoint(-6F, 4F, -6F);

		kh20Model[15].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5.5F, 0F, -5.5F, -5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		kh20Model[15].setRotationPoint(6F, 4F, -6F);

		kh20Model[16].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F); // Box 58
		kh20Model[16].setRotationPoint(0F, 15F, 0F);

		kh20Model[17].addShapeBox(0F, 0F, 0F, 6, 35, 6, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		kh20Model[17].setRotationPoint(0F, -102F, 0F);

		kh20Model[18].addShapeBox(0F, 0F, 0F, 6, 62, 6, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5.5F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 60
		kh20Model[18].setRotationPoint(6F, -107F, 6F);

		kh20Model[19].addShapeBox(0F, 0F, 0F, 6, 62, 6, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		kh20Model[19].setRotationPoint(6F, -107F, 0F);

		kh20Model[20].addShapeBox(0F, 0F, 0F, 6, 62, 6, 0F, 0F, 0F, -5F, -5.5F, 0F, -5.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		kh20Model[20].setRotationPoint(6F, -107F, -6F);

		kh20Model[21].addShapeBox(0F, 0F, 0F, 6, 62, 6, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		kh20Model[21].setRotationPoint(0F, -107F, -6F);

		kh20Model[22].addShapeBox(0F, 0F, 0F, 6, 62, 6, 0F, -5.5F, 0F, -5.5F, 0F, 0F, -5F, 0F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		kh20Model[22].setRotationPoint(-6F, -107F, -6F);

		kh20Model[23].addShapeBox(0F, 0F, 0F, 6, 62, 6, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		kh20Model[23].setRotationPoint(-6F, -107F, 0F);

		kh20Model[24].addShapeBox(0F, 0F, 0F, 6, 62, 6, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, -5.5F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 66
		kh20Model[24].setRotationPoint(-6F, -107F, 6F);

		kh20Model[25].addShapeBox(0F, 0F, 0F, 6, 62, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		kh20Model[25].setRotationPoint(0F, -107F, 6F);

		kh20Model[26].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		kh20Model[26].setRotationPoint(0F, -88F, 0F);

		kh20Model[27].addShapeBox(0F, 0F, 0F, 1, 35, 55, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -52F, 0F, 0F, -52F, 0F); // Box 69
		kh20Model[27].setRotationPoint(2F, -31F, 12F);

		kh20Model[28].addShapeBox(0F, 0F, 0F, 1, 35, 55, 0F, 0F, 28F, 0F, 0F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -52F, 0F, 0F, -52F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		kh20Model[28].setRotationPoint(2F, -31F, -61F);

		kh20Model[29].addShapeBox(0F, 0F, 0F, 1, 24, 28, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F); // Box 71
		kh20Model[29].setRotationPoint(1F, -94F, 7F);

		kh20Model[30].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		kh20Model[30].setRotationPoint(0.5F, -105F, 34F);

		kh20Model[31].addShapeBox(0F, 0F, 0F, 1, 24, 28, 0F, 0F, 11F, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		kh20Model[31].setRotationPoint(1F, -94F, -29F);

		kh20Model[32].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		kh20Model[32].setRotationPoint(0.5F, -105F, -30F);

		kh20Model[33].addShapeBox(0F, 0F, 0F, 11, 24, 1, 0F, 0F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11F, 0F, 0F, -25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -25F, 0F); // Box 75
		kh20Model[33].setRotationPoint(-13F, -94F, 2.5F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 34; i++)
		{
			kh20Model[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo kh20Model[];
}