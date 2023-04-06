//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: DepthCharge
// Model Creator:
// Created on:07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDepthCharge extends ModelBase
{
	int textureX = 128;
	int textureY = 64;

	public ModelDepthCharge()
	{
		depthchargeModel = new ModelRendererTurbo[20];
		depthchargeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		depthchargeModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		depthchargeModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		depthchargeModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 11
		depthchargeModel[4] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 13
		depthchargeModel[5] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 14
		depthchargeModel[6] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 8
		depthchargeModel[7] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 9
		depthchargeModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		depthchargeModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 11
		depthchargeModel[10] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 12
		depthchargeModel[11] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 13
		depthchargeModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		depthchargeModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		depthchargeModel[14] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 16
		depthchargeModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 17
		depthchargeModel[16] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 18
		depthchargeModel[17] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		depthchargeModel[18] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 20
		depthchargeModel[19] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 21

		depthchargeModel[0].addShapeBox(-2F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		depthchargeModel[0].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[1].addShapeBox(-6.01F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 4
		depthchargeModel[1].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[2].addShapeBox(-2F, 2.01F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 9
		depthchargeModel[2].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[3].addShapeBox(-6.01F, 1.99F, -5.99F, 4, 4, 12, 0F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F); // Box 11
		depthchargeModel[3].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[4].addShapeBox(1.99F, 1.99F, -5.99F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, -3.95F, -3.95F, 0F, -3.95F, -3.95F, 0F, 0F, -3.95F); // Box 13
		depthchargeModel[4].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[5].addShapeBox(1.99F, -2F, -6F, 4, 4, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 14
		depthchargeModel[5].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[6].addShapeBox(1.99F, -11.01F, -5.99F, 4, 9, 12, 0F, 0F, 0F, -3.95F, 0F, -8.95F, -3.95F, 0F, -8.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F); // Box 8
		depthchargeModel[6].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[7].addShapeBox(-2F, -10.99F, -6F, 4, 9, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		depthchargeModel[7].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[8].addShapeBox(-6.01F, -11.01F, -5.99F, 4, 9, 12, 0F, 0F, -8.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -8.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F); // Box 10
		depthchargeModel[8].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[9].addShapeBox(-6.01F, -10F, -6F, 4, 1, 12, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 11
		depthchargeModel[9].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[10].addShapeBox(-2F, -10F, -6F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		depthchargeModel[10].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[11].addShapeBox(1.99F, -10F, -6F, 4, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 13
		depthchargeModel[11].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[12].addShapeBox(4.5F, -11F, -0.5F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		depthchargeModel[12].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[13].addShapeBox(-5.5F, -11F, -0.5F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		depthchargeModel[13].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[14].addShapeBox(-0.5F, -11F, 4.5F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		depthchargeModel[14].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[15].addShapeBox(-0.5F, -11F, -5.5F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		depthchargeModel[15].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[16].addShapeBox(2.7F, -11F, 2.7F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		depthchargeModel[16].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[17].addShapeBox(-3.7F, -11F, -3.7F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		depthchargeModel[17].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[18].addShapeBox(-3.7F, -11F, 2.7F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		depthchargeModel[18].setRotationPoint(0F, 0F, 0F);

		depthchargeModel[19].addShapeBox(2.7F, -11F, -3.7F, 1, 9, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		depthchargeModel[19].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 20; i++)
		{
			depthchargeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo depthchargeModel[];
}