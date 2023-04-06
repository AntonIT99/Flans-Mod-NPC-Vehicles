//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BirbMissile
// Model Creator:
// Created on:-
// Last changed on: -

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBirb extends ModelBase
{
	int textureX = 128;
	int textureY = 128;

	public ModelBirb()
	{
		birbModel = new ModelRendererTurbo[35];
		birbModel[0] = new ModelRendererTurbo(this, 15, 16, textureX, textureY); // Box 0
		birbModel[1] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 0
		birbModel[2] = new ModelRendererTurbo(this, 1, 11, textureX, textureY); // Box 1
		birbModel[3] = new ModelRendererTurbo(this, 15, 11, textureX, textureY); // Box 2
		birbModel[4] = new ModelRendererTurbo(this, 1, 21, textureX, textureY); // Box 3
		birbModel[5] = new ModelRendererTurbo(this, 15, 21, textureX, textureY); // Box 4
		birbModel[6] = new ModelRendererTurbo(this, 1, 35, textureX, textureY); // Box 5
		birbModel[7] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 6
		birbModel[8] = new ModelRendererTurbo(this, 1, 26, textureX, textureY); // Box 7
		birbModel[9] = new ModelRendererTurbo(this, 1, 30, textureX, textureY); // Box 8
		birbModel[10] = new ModelRendererTurbo(this, 15, 30, textureX, textureY); // Box 9
		birbModel[11] = new ModelRendererTurbo(this, 23, 35, textureX, textureY); // Box 0
		birbModel[12] = new ModelRendererTurbo(this, 23, 35, textureX, textureY); // Box 1
		birbModel[13] = new ModelRendererTurbo(this, 23, 40, textureX, textureY); // Box 2
		birbModel[14] = new ModelRendererTurbo(this, 23, 40, textureX, textureY); // Box 3
		birbModel[15] = new ModelRendererTurbo(this, 15, 40, textureX, textureY); // Box 4
		birbModel[16] = new ModelRendererTurbo(this, 9, 42, textureX, textureY); // Box 6
		birbModel[17] = new ModelRendererTurbo(this, 15, 40, textureX, textureY); // Box 11
		birbModel[18] = new ModelRendererTurbo(this, 9, 42, textureX, textureY); // Box 12
		birbModel[19] = new ModelRendererTurbo(this, 32, 13, textureX, textureY); // Box 0
		birbModel[20] = new ModelRendererTurbo(this, 32, 18, textureX, textureY); // Box 1
		birbModel[21] = new ModelRendererTurbo(this, 32, 25, textureX, textureY); // Box 0
		birbModel[22] = new ModelRendererTurbo(this, 32, 13, textureX, textureY); // Box 0
		birbModel[23] = new ModelRendererTurbo(this, 32, 18, textureX, textureY); // Box 1
		birbModel[24] = new ModelRendererTurbo(this, 32, 25, textureX, textureY); // Box 2
		birbModel[25] = new ModelRendererTurbo(this, 11, 35, textureX, textureY); // Box 3
		birbModel[26] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 4
		birbModel[27] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 7
		birbModel[28] = new ModelRendererTurbo(this, 11, 35, textureX, textureY); // Box 8
		birbModel[29] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 9
		birbModel[30] = new ModelRendererTurbo(this, 22, 32, textureX, textureY); // Box 10
		birbModel[31] = new ModelRendererTurbo(this, 22, 32, textureX, textureY); // Box 11
		birbModel[32] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 0
		birbModel[33] = new ModelRendererTurbo(this, 22, 32, textureX, textureY); // Box 1
		birbModel[34] = new ModelRendererTurbo(this, 22, 32, textureX, textureY); // Box 2

		birbModel[0].addShapeBox(-2F, 1F, 0F, 4, 2, 2, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .3F, -1F, 0F, .3F); // Box 0
		birbModel[0].setRotationPoint(0F, 17F, 0F);

		birbModel[1].addShapeBox(-2F, 1F, -2F, 4, 2, 2, 0F, -1.2F, 0F, -.5F, -1.2F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		birbModel[1].setRotationPoint(0F, 17F, 0F);

		birbModel[2].addShapeBox(-2F, -1F, -2F, 4, 2, 2, 0F, -1.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.2F, 0F, -.5F, -1.2F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 1
		birbModel[2].setRotationPoint(0F, 17F, 0F);

		birbModel[3].addShapeBox(-2F, -1F, 0F, 4, 2, 2, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -.5F, -1.5F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 2
		birbModel[3].setRotationPoint(0F, 17F, 0F);

		birbModel[4].addShapeBox(-2F, 3F, -2F, 4, 2, 2, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		birbModel[4].setRotationPoint(0F, 17F, 0F);

		birbModel[5].addShapeBox(-2F, 3F, 0F, 4, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, .3F, -1F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 4
		birbModel[5].setRotationPoint(0F, 17F, 0F);

		birbModel[6].addShapeBox(-1F, -6F, 0F, 2, 5, 2, 0F, 0F, .5F, -1.5F, 0F, .5F, -1.5F, 2F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 5
		birbModel[6].setRotationPoint(0F, 17F, 0F);

		birbModel[7].addShapeBox(-2F, 5F, 0F, 4, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1.3F, 0F, -1F, -1.3F, 0F, -1F); // Box 6
		birbModel[7].setRotationPoint(0F, 17F, 0F);

		birbModel[8].addShapeBox(-2F, 5F, -2F, 4, 1, 2, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -.1F, -1.5F, 0F, -.1F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 7
		birbModel[8].setRotationPoint(0F, 17F, 0F);

		birbModel[9].addShapeBox(-1F, 6F, -2F, 2, 1, 2, 0F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, .5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, -.3F, -1F, 0F, -.3F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 8
		birbModel[9].setRotationPoint(0F, 17F, 0F);

		birbModel[10].addShapeBox(-1F, 6F, 0F, 2, 1, 1, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, -1F, 0F, -.5F, -1F, 0F, -.5F); // Box 9
		birbModel[10].setRotationPoint(0F, 17F, 0F);

		birbModel[11].addShapeBox(-1F, 7F, -1.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 0
		birbModel[11].setRotationPoint(0F, 17F, 0F);

		birbModel[12].addShapeBox(0F, 7F, -1.5F, 1, 1, 2, 0F, 0F, 0F, .2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 1
		birbModel[12].setRotationPoint(0F, 17F, 0F);

		birbModel[13].addShapeBox(0F, 8F, -1.5F, 1, 1, 2, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -.6F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, -.2F); // Box 2
		birbModel[13].setRotationPoint(0F, 17F, 0F);

		birbModel[14].addShapeBox(-1F, 8F, -1.5F, 1, 1, 2, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, -.6F, 0F, 0F, -.2F, -.5F, 0F, -1F); // Box 3
		birbModel[14].setRotationPoint(0F, 17F, 0F);

		birbModel[15].addShapeBox(0F, 9F, -1.5F, 1, 1, 2, 0F, 0F, 0F, -.6F, -.5F, 0F, -1F, -.5F, 0F, -1F, 0F, 0F, -.2F, 0F, 0F, -.8F, -.7F, 0F, -1.2F, -.7F, 0F, -.8F, 0F, 0F, -.5F); // Box 4
		birbModel[15].setRotationPoint(0F, 17F, 0F);

		birbModel[16].addShapeBox(0F, 10F, -1.5F, 1, 1, 2, 0F, 0F, 0F, -.8F, -.7F, 0F, -1.2F, -.7F, 0F, -.8F, 0F, 0F, -.5F, 0F, -.6F, -.9F, -.8F, -.6F, -1.3F, -.8F, -.6F, -.7F, 0F, 0F, -.3F); // Box 6
		birbModel[16].setRotationPoint(0F, 17F, 0F);

		birbModel[17].addShapeBox(-1F, 9F, -1.5F, 1, 1, 2, 0F, -.5F, 0F, -1F, 0F, 0F, -.6F, 0F, 0F, -.2F, -.5F, 0F, -1F, -.7F, 0F, -1.2F, 0F, 0F, -.8F, 0F, 0F, -.5F, -.7F, 0F, -.8F); // Box 11
		birbModel[17].setRotationPoint(0F, 17F, 0F);

		birbModel[18].addShapeBox(-1F, 10F, -1.5F, 1, 1, 2, 0F, -.7F, 0F, -1.2F, 0F, 0F, -.8F, 0F, 0F, -.5F, -.7F, 0F, -.8F, -.8F, -.6F, -1.3F, 0F, -.6F, -.9F, 0F, 0F, -.3F, -.8F, -.6F, -.7F); // Box 12
		birbModel[18].setRotationPoint(0F, 17F, 0F);

		birbModel[19].addShapeBox(1F, 2F, -2F, 4, 3, 1, 0F, 1F, -.5F, -.5F, 0F, .5F, 1F, 0F, .5F, -1.5F, 0F, -.5F, 0F, 1F, 0F, -.5F, 0F, 1F, 1F, 0F, 1F, -1.5F, 0F, 0F, 0F); // Box 0
		birbModel[19].setRotationPoint(0F, 17F, 0F);

		birbModel[20].addShapeBox(5F, 2F, -3F, 5, 4, 1, 0F, 0F, .5F, 0F, 0F, -1.5F, -.5F, 0F, -1.5F, 0F, 0F, .5F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F); // Box 1
		birbModel[20].setRotationPoint(0F, 17F, 0F);

		birbModel[21].addShapeBox(10F, 3F, -2.5F, 4, 3, 1, 0F, 0F, -.5F, 0F, 0F, -1.2F, -1F, 0F, -1.2F, 0F, 0F, -.5F, -.5F, 0F, 0F, 0F, -1.5F, -.5F, -.5F, -1.5F, -.5F, 0F, 0F, 0F, -.5F); // Box 0
		birbModel[21].setRotationPoint(0F, 17F, 0F);

		birbModel[22].addShapeBox(-5F, 2F, -2F, 4, 3, 1, 0F, 0F, .5F, 1F, 1F, -.5F, -.5F, 0F, -.5F, 0F, 0F, .5F, -1.5F, 0F, 1F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 1F, -1.5F); // Box 0
		birbModel[22].setRotationPoint(0F, 17F, 0F);

		birbModel[23].addShapeBox(-10F, 2F, -3F, 5, 4, 1, 0F, 0F, -1.5F, -.5F, 0F, .5F, 0F, 0F, .5F, -.5F, 0F, -1.5F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 1
		birbModel[23].setRotationPoint(0F, 17F, 0F);

		birbModel[24].addShapeBox(-14F, 3F, -2.5F, 4, 3, 1, 0F, 0F, -1.2F, -1F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -1.2F, 0F, -1.5F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, -1.5F, -.5F, 0F); // Box 2
		birbModel[24].setRotationPoint(0F, 17F, 0F);

		birbModel[25].addShapeBox(1F, 2F, 0F, 1, 1, 3, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 1F, -.5F, .2F, 1F, -.5F); // Box 3
		birbModel[25].setRotationPoint(0F, 17F, 0F);

		birbModel[26].addShapeBox(1F, 2.5F, 2F, 1, 1, 2, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, -2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F); // Box 4
		birbModel[26].setRotationPoint(0F, 17F, 0F);

		birbModel[27].addShapeBox(-2F, 2.5F, 2F, 1, 1, 2, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -2F, 0F, -.2F, -2F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 2F, 0F, -.2F, 2F, 0F); // Box 7
		birbModel[27].setRotationPoint(0F, 17F, 0F);

		birbModel[28].addShapeBox(-2F, 2F, 0F, 1, 1, 3, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 1F, -.5F, .2F, 1F, -.5F); // Box 8
		birbModel[28].setRotationPoint(0F, 17F, 0F);

		birbModel[29].addShapeBox(1F, 4.5F, 3.5F, 1, 1, 1, 0F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 9
		birbModel[29].setRotationPoint(0F, 17F, 0F);

		birbModel[30].addShapeBox(1F, 5.5F, 3F, 1, 1, 1, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.2F, -.2F, -.8F, -.2F, -.2F, -.8F, -.2F, 0F, .2F, -.2F, 0F, .2F); // Box 10
		birbModel[30].setRotationPoint(0F, 17F, 0F);

		birbModel[31].addShapeBox(1F, 5.5F, 4F, 1, 1, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F); // Box 11
		birbModel[31].setRotationPoint(0F, 17F, 0F);

		birbModel[32].addShapeBox(-2F, 4.5F, 3.5F, 1, 1, 1, 0F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 0
		birbModel[32].setRotationPoint(0F, 17F, 0F);

		birbModel[33].addShapeBox(-2F, 5.5F, 3F, 1, 1, 1, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, 0F, -.2F, -.1F, 0F, -.2F, -.2F, -.2F, -.8F, -.2F, -.2F, -.8F, -.2F, 0F, .2F, -.2F, 0F, .2F); // Box 1
		birbModel[33].setRotationPoint(0F, 17F, 0F);

		birbModel[34].addShapeBox(-2F, 5.5F, 4F, 1, 1, 1, 0F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, -.2F, -.2F, -.3F, -.2F, -.2F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F); // Box 2
		birbModel[34].setRotationPoint(0F, 17F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 35; i++)
		{
			birbModel[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo birbModel[];
}