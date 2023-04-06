//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: MortarWarhead
// Model Creator: 
// Created on: 18.12.2022 - 22:37:18
// Last changed on: 18.12.2022 - 22:37:18

package com.flansmod.client.model.monolith; //Path where the model is located

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMortarWarhead extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelMortarWarhead()
	{
		MortarWarheadModel = new ModelRendererTurbo[9];


		MortarWarheadModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 38
		MortarWarheadModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 39
		MortarWarheadModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 40
		MortarWarheadModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 41
		MortarWarheadModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 42
		MortarWarheadModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 43
		MortarWarheadModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 44
		MortarWarheadModel[7] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 45
		MortarWarheadModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 46

		MortarWarheadModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F); // Box 38
		MortarWarheadModel[0].setRotationPoint(-0.5F, 26F, -0.5F);

		MortarWarheadModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		MortarWarheadModel[1].setRotationPoint(-0.5F, 25.5F, -0.5F);

		MortarWarheadModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F); // Box 40
		MortarWarheadModel[2].setRotationPoint(-0.5F, 23.5F, -0.5F);

		MortarWarheadModel[3].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 41
		MortarWarheadModel[3].setRotationPoint(-0.5F, 20.5F, -0.5F);

		MortarWarheadModel[4].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		MortarWarheadModel[4].setRotationPoint(-0.5F, 16F, -0.5F);

		MortarWarheadModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 43
		MortarWarheadModel[5].setRotationPoint(-0.5F, 16.5F, -1.5F);

		MortarWarheadModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 44
		MortarWarheadModel[6].setRotationPoint(-0.5F, 19F, -1.5F);

		MortarWarheadModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 45
		MortarWarheadModel[7].setRotationPoint(-1.5F, 19F, -0.5F);

		MortarWarheadModel[8].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F); // Box 46
		MortarWarheadModel[8].setRotationPoint(-1.5F, 16.5F, -0.5F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 8; i++)
		{
			MortarWarheadModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo MortarWarheadModel[];
}