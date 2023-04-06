//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPlumbatae extends ModelBase
{
	int textureX = 32;
	int textureY = 32;

	public ModelPlumbatae()
	{
		plumbataeModel = new ModelRendererTurbo[6];
		plumbataeModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		plumbataeModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 1
		plumbataeModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		plumbataeModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		plumbataeModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 4
		plumbataeModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 5

		plumbataeModel[0].addShapeBox(-0.5F, -6.5F, -0.5F, 1, 7, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		plumbataeModel[0].setRotationPoint(0F, -1F, 0F);

		plumbataeModel[1].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 5, 1, 0F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 1
		plumbataeModel[1].setRotationPoint(0F, -6F, 0F);

		plumbataeModel[2].addShapeBox(-0.5F, 4.5F, -0.5F, 1, 1, 1, 0F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 2
		plumbataeModel[2].setRotationPoint(0F, -1F, 0F);

		plumbataeModel[3].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 3
		plumbataeModel[3].setRotationPoint(0F, 0F, 0F);

		plumbataeModel[4].addShapeBox(-0.5F, -6F, -1.5F, 1, 3, 3, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, -1F); // Box 4
		plumbataeModel[4].setRotationPoint(0F, -1F, 0F);

		plumbataeModel[5].addShapeBox(-1.5F, -6F, -0.5F, 3, 3, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F, -1F, 0F, -0.3F); // Box 5
		plumbataeModel[5].setRotationPoint(0F, -1F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 6; i++)
		{
			plumbataeModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo plumbataeModel[];
}