//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Laser
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLaser extends ModelAttachment //Same as Filename
{
	int textureX = 2048;
	int textureY = 8;

	public ModelLaser() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[6];
		attachmentModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportImportImportBox0
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportImportBox0
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportBox1
		attachmentModel[3] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Import ImportImportBox3
		attachmentModel[4] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 0
		attachmentModel[5] = new ModelRendererTurbo(this, 2, 2, textureX, textureY); // Box 1

		attachmentModel[0].addShapeBox(0F, -2F, 0F, 800, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import ImportImportImportBox0
		attachmentModel[0].setRotationPoint(2F, 0F, -0.5F);

		attachmentModel[1].addShapeBox(0F, -2F, 0F, 800, 1, 1, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import ImportImportBox0
		attachmentModel[1].setRotationPoint(802F, 0F, -0.5F);

		attachmentModel[2].addBox(-2F, -2F, -1F, 4, 1, 2, 0F); // Import ImportImportBox1
		attachmentModel[2].setRotationPoint(0F, 0F, 0F);

		attachmentModel[3].addShapeBox(-2F, -3F, -0.5F, 4, 1, 1, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportImportBox3
		attachmentModel[3].setRotationPoint(0F, 1.2F, 0F);

		attachmentModel[4].addShapeBox(0.8F, -2F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 0
		attachmentModel[4].setRotationPoint(0F, 1.2F, 0F);

		attachmentModel[5].addShapeBox(-1.8F, -2F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 1
		attachmentModel[5].setRotationPoint(0F, 1.2F, 0F);
	}
}