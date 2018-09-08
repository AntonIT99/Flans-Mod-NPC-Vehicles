//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GeballteLadung
// Model Creator:
// Created on:30.08.2016 - 14:52:35
// Last changed on: 30.08.2016 - 14:52:35

package com.flansmod.client.model.mineworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStielhandgranate24 extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelStielhandgranate24()
	{
		geballteladungModel = new ModelRendererTurbo[27];
		geballteladungModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox4
		geballteladungModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		geballteladungModel[2] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		geballteladungModel[3] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 8
		geballteladungModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 9
		geballteladungModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 10
		geballteladungModel[6] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 12
		geballteladungModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 13
		geballteladungModel[8] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 14
		geballteladungModel[9] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		geballteladungModel[10] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 16
		geballteladungModel[11] = new ModelRendererTurbo(this, 27, 14, textureX, textureY); // Box 17
		geballteladungModel[12] = new ModelRendererTurbo(this, 14, 30, textureX, textureY); // Box 18
		geballteladungModel[13] = new ModelRendererTurbo(this, 8, 22, textureX, textureY); // Box 19
		geballteladungModel[14] = new ModelRendererTurbo(this, 2, 30, textureX, textureY); // Box 20
		geballteladungModel[15] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 21
		geballteladungModel[16] = new ModelRendererTurbo(this, 13, 20, textureX, textureY); // Box 22
		geballteladungModel[17] = new ModelRendererTurbo(this, 12, 14, textureX, textureY); // Box 23
		geballteladungModel[18] = new ModelRendererTurbo(this, 13, 1, textureX, textureY); // Box 24
		geballteladungModel[19] = new ModelRendererTurbo(this, 7, 7, textureX, textureY); // Box 25
		geballteladungModel[20] = new ModelRendererTurbo(this, 14, 23, textureX, textureY); // Box 26
		geballteladungModel[21] = new ModelRendererTurbo(this, 0, 6, textureX, textureY); // Box 27
		geballteladungModel[22] = new ModelRendererTurbo(this, 27, 22, textureX, textureY); // Box 28
		geballteladungModel[23] = new ModelRendererTurbo(this, 25, 28, textureX, textureY); // Box 29
		geballteladungModel[24] = new ModelRendererTurbo(this, 19, 28, textureX, textureY); // Box 31
		geballteladungModel[25] = new ModelRendererTurbo(this, 10, 28, textureX, textureY); // Box 32
		geballteladungModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 35

		geballteladungModel[0].addShapeBox(-1.5F, -0.5F, -1F, 3, 1, 3, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F); // Import ImportImportBox4
		geballteladungModel[0].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[0].rotateAngleX = 4.71238898F;

		geballteladungModel[1].addShapeBox(-0.5F, -0.5F, -7F, 1, 1, 4, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 2
		geballteladungModel[1].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[1].rotateAngleX = 4.71238898F;

		geballteladungModel[2].addShapeBox(-0.5F, -0.5F, -7F, 1, 1, 4, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 6
		geballteladungModel[2].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[2].rotateAngleX = 4.71238898F;

		geballteladungModel[3].addShapeBox(-0.5F, -0.5F, -7F, 1, 1, 4, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 8
		geballteladungModel[3].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[3].rotateAngleX = 4.71238898F;

		geballteladungModel[4].addShapeBox(-1.5F, -0.5F, -1F, 3, 1, 3, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 9
		geballteladungModel[4].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[4].rotateAngleX = 4.71238898F;

		geballteladungModel[5].addShapeBox(-1.5F, -2.3F, -1F, 3, 1, 3, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F, -0.25F, -0.05F, 0F); // Box 10
		geballteladungModel[5].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[5].rotateAngleX = 4.71238898F;

		geballteladungModel[6].addShapeBox(-1.5F, -0.5F, -1F, 3, 1, 1, 0F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F); // Box 12
		geballteladungModel[6].setRotationPoint(0F, -1F, 0F);
		geballteladungModel[6].rotateAngleX = 4.71238898F;

		geballteladungModel[7].addShapeBox(-1.5F, -0.5F, -1.1F, 3, 1, 1, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, -0.9F, -0.8F, -0.05F, -0.9F); // Box 13
		geballteladungModel[7].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[7].rotateAngleX = 4.71238898F;

		geballteladungModel[8].addShapeBox(-1.5F, -2.3F, -1.1F, 3, 1, 1, 0F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, -0.9F, -0.8F, -0.05F, -0.9F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.9F, -0.05F, -0.05F, -0.9F); // Box 14
		geballteladungModel[8].setRotationPoint(0F, 0F, -0.9F);
		geballteladungModel[8].rotateAngleX = 4.71238898F;

		geballteladungModel[9].addShapeBox(-0.5F, -0.5F, -2F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 15
		geballteladungModel[9].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[9].rotateAngleX = 4.71238898F;

		geballteladungModel[10].addShapeBox(-0.5F, 0.25F, -2F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 16
		geballteladungModel[10].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[10].rotateAngleX = 4.71238898F;

		geballteladungModel[11].addShapeBox(-0.5F, -1.25F, -2F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 17
		geballteladungModel[11].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[11].rotateAngleX = 4.71238898F;

		geballteladungModel[12].addShapeBox(-0.5F, 0.25F, -2.75F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 18
		geballteladungModel[12].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[12].rotateAngleX = 4.71238898F;

		geballteladungModel[13].addShapeBox(-0.5F, -0.5F, -2.75F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 19
		geballteladungModel[13].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[13].rotateAngleX = 4.71238898F;

		geballteladungModel[14].addShapeBox(-0.5F, -1.25F, -2.75F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 20
		geballteladungModel[14].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[14].rotateAngleX = 4.71238898F;

		geballteladungModel[15].addShapeBox(-0.5F, -0.5F, -3.5F, 1, 1, 1, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 21
		geballteladungModel[15].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[15].rotateAngleX = 4.71238898F;

		geballteladungModel[16].addShapeBox(-0.5F, 0.25F, -3.5F, 1, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 22
		geballteladungModel[16].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[16].rotateAngleX = 4.71238898F;

		geballteladungModel[17].addShapeBox(-0.5F, -1.25F, -3.5F, 1, 1, 1, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 23
		geballteladungModel[17].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[17].rotateAngleX = 4.71238898F;

		geballteladungModel[18].addShapeBox(-0.5F, -0.5F, -2.75F, 1, 1, 1, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 24
		geballteladungModel[18].setRotationPoint(0F, -5F, 0F);
		geballteladungModel[18].rotateAngleX = 4.71238898F;

		geballteladungModel[19].addShapeBox(-0.5F, 0.25F, -7.75F, 1, 1, 1, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F); // Box 25
		geballteladungModel[19].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[19].rotateAngleX = 4.71238898F;

		geballteladungModel[20].addShapeBox(-0.5F, -1.25F, -7.75F, 1, 1, 1, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.3F, -0.75F, -0.25F, -0.3F, -0.75F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 26
		geballteladungModel[20].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[20].rotateAngleX = 4.71238898F;

		geballteladungModel[21].addShapeBox(-0.5F, -0.5F, -8.75F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 27
		geballteladungModel[21].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[21].rotateAngleX = 4.71238898F;

		geballteladungModel[22].addShapeBox(-0.5F, 0.25F, -8.75F, 1, 1, 1, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 28
		geballteladungModel[22].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[22].rotateAngleX = 4.71238898F;

		geballteladungModel[23].addShapeBox(-0.5F, -1.25F, -8.75F, 1, 1, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, -0.25F, 0.125F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Box 29
		geballteladungModel[23].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[23].rotateAngleX = 4.71238898F;

		geballteladungModel[24].addShapeBox(-0.5F, -0.5F, -8.9F, 1, 1, 1, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F, 0F, -0.11F, 0F); // Box 31
		geballteladungModel[24].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[24].rotateAngleX = 4.71238898F;

		geballteladungModel[25].addShapeBox(-0.5F, -0.64F, -8.9F, 1, 1, 1, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 32
		geballteladungModel[25].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[25].rotateAngleX = 4.71238898F;

		geballteladungModel[26].addShapeBox(-0.5F, -0.36F, -8.9F, 1, 1, 1, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 35
		geballteladungModel[26].setRotationPoint(0F, 0F, 0F);
		geballteladungModel[26].rotateAngleX = 4.71238898F;


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 27; i++)
		{
			geballteladungModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo geballteladungModel[];
}