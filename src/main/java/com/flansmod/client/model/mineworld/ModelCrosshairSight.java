//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.2.7
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelCrosshairSight extends ModelAttachment
{
	int textureX = 128;
	int textureY = 32;

	public ModelCrosshairSight()
	{
		attachmentModel = new ModelRendererTurbo[6];
		attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import 
		attachmentModel[1] = new ModelRendererTurbo(this, 96, 0, textureX, textureY); // Import 
		attachmentModel[2] = new ModelRendererTurbo(this, 100, 0, textureX, textureY); // Import 
		attachmentModel[3] = new ModelRendererTurbo(this, 88, 3, textureX, textureY); // Import 
		attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import 
		attachmentModel[5] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0

		attachmentModel[0].addBox(-16F, 0F, -8F, 32, 3, 16, 0F); // Import 
		attachmentModel[0].setRotationPoint(0F, 0F, 0F);

		attachmentModel[1].addBox(15F, 3F, 7F, 1, 14, 1, 0F); // Import 
		attachmentModel[1].setRotationPoint(0F, 0F, 0F);

		attachmentModel[2].addBox(15F, 3F, -8F, 1, 14, 1, 0F); // Import 
		attachmentModel[2].setRotationPoint(0F, 0F, 0F);

		attachmentModel[3].addBox(15F, 17F, -8F, 1, 1, 16, 0F); // Import 
		attachmentModel[3].setRotationPoint(0F, 0F, 0F);

		attachmentModel[4].addBox(15F, 9.5F, -0.5F, 1, 3, 1, 0F); // Import 
		attachmentModel[4].setRotationPoint(0F, -1F, 0F);

		attachmentModel[5].addBox(15F, 9.5F, -0.5F, 1, 1, 3, 0F); // Box 0
		attachmentModel[5].setRotationPoint(0F, 0F, -1F);

	}
}