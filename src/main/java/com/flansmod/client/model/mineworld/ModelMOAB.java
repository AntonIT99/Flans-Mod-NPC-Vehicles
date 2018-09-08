//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MOAB
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.mineworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMOAB extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelMOAB()
	{
		moabModel = new ModelRendererTurbo[9];
		moabModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImport
		moabModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportImportBox0
		moabModel[2] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Import ImportImportBox1
		moabModel[3] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Import ImportImportBox2
		moabModel[4] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Import ImportImportBox3
		moabModel[5] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Import ImportImportBox4
		moabModel[6] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Import ImportImportBox5
		moabModel[7] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Import ImportImportBox6
		moabModel[8] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Import ImportImportBox7

		moabModel[0].addShapeBox(-2F, 19F, -3F, 10, 16, 10, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportImport
		moabModel[0].setRotationPoint(0F, -70F, 4F);
		moabModel[0].rotateAngleX = 3.14159265F;

		moabModel[1].addShapeBox(-2F, 0F, -3F, 10, 16, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -5F, -5F, 0F, -5F); // Import ImportImportBox0
		moabModel[1].setRotationPoint(0F, -105F, 4F);
		moabModel[1].rotateAngleX = 3.14159265F;

		moabModel[2].addBox(0F, 0F, 0F, 12, 66, 12, 0F); // Import ImportImportBox1
		moabModel[2].setRotationPoint(-3F, -23F, 8F);
		moabModel[2].rotateAngleX = 3.14159265F;

		moabModel[3].addShapeBox(0F, -1F, -4F, 12, 12, 12, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox2
		moabModel[3].setRotationPoint(-3F, -12F, 4F);
		moabModel[3].rotateAngleX = 3.14159265F;

		moabModel[4].addBox(0F, -18F, 0F, 10, 14, 10, 0F); // Import ImportImportBox3
		moabModel[4].setRotationPoint(-2F, 7F, -3F);

		moabModel[5].addBox(0F, -11F, 0F, 8, 2, 10, 0F); // Import ImportImportBox4
		moabModel[5].setRotationPoint(-1F, 10F, 7F);

		moabModel[6].addBox(0F, -13F, 0F, 8, 2, 10, 0F); // Import ImportImportBox5
		moabModel[6].setRotationPoint(-1F, 12F, -13F);

		moabModel[7].addBox(0F, -11F, 0F, 10, 2, 8, 0F); // Import ImportImportBox6
		moabModel[7].setRotationPoint(8F, 10F, -2F);

		moabModel[8].addBox(0F, -11F, 0F, 10, 2, 8, 0F); // Import ImportImportBox7
		moabModel[8].setRotationPoint(-12F, 10F, -2F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 9; i++)
		{
			moabModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo moabModel[];
}