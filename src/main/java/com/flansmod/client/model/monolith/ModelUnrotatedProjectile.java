//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelUnrotatedProjectile extends ModelBase
{
	int textureX = 128;
	int textureY = 64;

	public ModelUnrotatedProjectile()
	{
		modelunrotatedprojectileModel = new ModelRendererTurbo[9];
		modelunrotatedprojectileModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		modelunrotatedprojectileModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 11
		modelunrotatedprojectileModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 13
		modelunrotatedprojectileModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		modelunrotatedprojectileModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 15
		modelunrotatedprojectileModel[5] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 16
		modelunrotatedprojectileModel[6] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 17
		modelunrotatedprojectileModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		modelunrotatedprojectileModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21

		modelunrotatedprojectileModel[0].addShapeBox(-2F, -34F, -6F, 4, 6, 12, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		modelunrotatedprojectileModel[0].setRotationPoint(0F, 0F, 0F);

		modelunrotatedprojectileModel[1].addShapeBox(-6.01F, -34.02F, -5.99F, 4, 6, 12, 0F, 0F, -5.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, -5.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.95F); // Box 11
		modelunrotatedprojectileModel[1].setRotationPoint(0F, 0F, 0F);

		modelunrotatedprojectileModel[2].addShapeBox(1.99F, -34.02F, -5.99F, 4, 6, 12, 0F, 0F, 0F, -3.95F, 0F, -5.95F, -3.95F, 0F, -5.95F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F, 0F, 0F, -3.95F, 0F, 0F, -3.95F, 0F, 0F, 0F); // Box 13
		modelunrotatedprojectileModel[2].setRotationPoint(0F, 0F, 0F);

		modelunrotatedprojectileModel[3].addShapeBox(4.5F, -28F, -0.5F, 1, 18, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 4.7F, 0F, -0.3F, -5.3F, 0F, -0.3F, -5.3F, 0F, -0.3F, 4.7F, 0F, -0.3F); // Box 14
		modelunrotatedprojectileModel[3].setRotationPoint(0F, 0F, 0F);

		modelunrotatedprojectileModel[4].addShapeBox(-5.5F, -28F, -0.5F, 1, 18, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -5.3F, 0F, -0.3F, 4.7F, 0F, -0.3F, 4.7F, 0F, -0.3F, -5.3F, 0F, -0.3F); // Box 15
		modelunrotatedprojectileModel[4].setRotationPoint(0F, 0F, 0F);

		modelunrotatedprojectileModel[5].addShapeBox(-0.5F, -28F, 4.5F, 1, 18, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, 4.7F, -0.3F, 0F, 4.7F, -0.3F, 0F, -5.3F, -0.3F, 0F, -5.3F); // Box 16
		modelunrotatedprojectileModel[5].setRotationPoint(0F, 0F, 0F);

		modelunrotatedprojectileModel[6].addShapeBox(-0.5F, -28F, -5.5F, 1, 18, 1, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -5.3F, -0.3F, 0F, -5.3F, -0.3F, 0F, 4.7F, -0.3F, 0F, 4.7F); // Box 17
		modelunrotatedprojectileModel[6].setRotationPoint(0F, 0F, 0F);

		modelunrotatedprojectileModel[7].addShapeBox(-0.5F, 10F, -0.5F, 1, 10, 1, 0F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 20
		modelunrotatedprojectileModel[7].setRotationPoint(0F, 0F, 0F);

		modelunrotatedprojectileModel[8].addShapeBox(-0.5F, 20F, -0.5F, 1, 10, 1, 0F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 21
		modelunrotatedprojectileModel[8].setRotationPoint(0F, 0F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 9; i++)
		{
			modelunrotatedprojectileModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo modelunrotatedprojectileModel[];
}