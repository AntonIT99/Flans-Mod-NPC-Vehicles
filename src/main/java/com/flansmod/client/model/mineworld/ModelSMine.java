//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GeballteLadung
// Model Creator:
// Created on:26.08.2016 - 16:16:41
// Last changed on: 26.08.2016 - 16:16:41

package com.flansmod.client.model.mineworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSMine extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelSMine()
	{
		smineModel = new ModelRendererTurbo[7];
		smineModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox1
		smineModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		smineModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		smineModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 3
		smineModel[4] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		smineModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		smineModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 6

		smineModel[0].addShapeBox(-0.5F, -1F, 0.5F, 1, 2, 4, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F); // Import ImportImportBox1
		smineModel[0].setRotationPoint(0F, -1F, 0F);
		smineModel[0].rotateAngleX = 4.71238898F;

		smineModel[1].addShapeBox(-2F, -1F, 0.5F, 1, 2, 4, 0F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.5F, 0F); // Box 1
		smineModel[1].setRotationPoint(0F, -1F, 0F);
		smineModel[1].rotateAngleX = 4.71238898F;

		smineModel[2].addShapeBox(1F, -1F, -0.5F, 1, 2, 4, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0.25F, 0.25F, 0F); // Box 2
		smineModel[2].setRotationPoint(0F, 0F, 0F);
		smineModel[2].rotateAngleX = 4.71238898F;

		smineModel[3].addShapeBox(-0.5F, -1F, -0.4F, 1, 2, 2, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F, -0.3F, -0.8F, 0F); // Box 3
		smineModel[3].setRotationPoint(0F, 3F, 0F);
		smineModel[3].rotateAngleX = 4.71238898F;

		smineModel[4].addShapeBox(-0.5F, -0.5F, -0.7F, 1, 1, 1, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F); // Box 4
		smineModel[4].setRotationPoint(0F, 5F, 0F);
		smineModel[4].rotateAngleX = 4.71238898F;

		smineModel[5].addShapeBox(-0.5F, -0.65F, -0.6F, 1, 1, 1, 0F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.9F, -0.2F, -0.45F, -0.9F, -0.2F); // Box 5
		smineModel[5].setRotationPoint(0F, 5F, 0F);
		smineModel[5].rotateAngleX = 4.71238898F;

		smineModel[6].addShapeBox(-0.5F, 0.1F, -0.6F, 1, 1, 1, 0F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.9F, -0.2F, -0.45F, -0.9F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F); // Box 6
		smineModel[6].setRotationPoint(0F, 5F, 0F);
		smineModel[6].rotateAngleX = 4.71238898F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 7; i++)
		{
			smineModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo smineModel[];
}