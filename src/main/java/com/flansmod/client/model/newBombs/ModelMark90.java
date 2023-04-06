//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator:
// Created on:30.07.2018 - 22:50:49
// Last changed on: 30.07.2018 - 22:50:49

package com.flansmod.client.model.newBombs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMark90 extends ModelBase
{
	int textureX = 512;
	int textureY = 512;

	public ModelMark90()
	{
		mark90Model = new ModelRendererTurbo[37];
		mark90Model[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		mark90Model[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		mark90Model[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 10
		mark90Model[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 11
		mark90Model[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 12
		mark90Model[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 13
		mark90Model[6] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 14
		mark90Model[7] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 15
		mark90Model[8] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 16
		mark90Model[9] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 21
		mark90Model[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 23
		mark90Model[11] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 24
		mark90Model[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 25
		mark90Model[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 26
		mark90Model[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 27
		mark90Model[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 28
		mark90Model[16] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 29
		mark90Model[17] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 30
		mark90Model[18] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 31
		mark90Model[19] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 32
		mark90Model[20] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 33
		mark90Model[21] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 34
		mark90Model[22] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 35
		mark90Model[23] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 36
		mark90Model[24] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 37
		mark90Model[25] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 38
		mark90Model[26] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 39
		mark90Model[27] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 40
		mark90Model[28] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 44
		mark90Model[29] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 45
		mark90Model[30] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 46
		mark90Model[31] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 47
		mark90Model[32] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 48
		mark90Model[33] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 49
		mark90Model[34] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 50
		mark90Model[35] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 51
		mark90Model[36] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 52

		mark90Model[0].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		mark90Model[0].setRotationPoint(0F, -23F, 6F);

		mark90Model[1].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		mark90Model[1].setRotationPoint(0F, -23F, -6F);

		mark90Model[2].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		mark90Model[2].setRotationPoint(6F, -23F, 0F);

		mark90Model[3].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		mark90Model[3].setRotationPoint(-6F, -23F, 0F);

		mark90Model[4].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		mark90Model[4].setRotationPoint(-6F, -23F, -6F);

		mark90Model[5].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 13
		mark90Model[5].setRotationPoint(-6F, -23F, 6F);

		mark90Model[6].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 14
		mark90Model[6].setRotationPoint(6F, -23F, 6F);

		mark90Model[7].addShapeBox(0F, 0F, 0F, 6, 16, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		mark90Model[7].setRotationPoint(6F, -23F, -6F);

		mark90Model[8].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, -8F, -2F, 0F, -8F); // Box 16
		mark90Model[8].setRotationPoint(0F, -7F, 6F);

		mark90Model[9].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, 2F, 0F, -8F, 2F, 0F, 2F, -8F, 0F, 2F); // Box 21
		mark90Model[9].setRotationPoint(-6F, -7F, -6F);

		mark90Model[10].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -8F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -8F, -8F, 0F, -8F); // Box 23
		mark90Model[10].setRotationPoint(-6F, -7F, 6F);

		mark90Model[11].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, 3F, -2F, 0F, 3F); // Box 24
		mark90Model[11].setRotationPoint(0F, -7F, -6F);

		mark90Model[12].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, -8F, 0F, -2F); // Box 25
		mark90Model[12].setRotationPoint(-6F, -7F, 0F);

		mark90Model[13].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, -2F, 3F, 0F, -2F); // Box 26
		mark90Model[13].setRotationPoint(6F, -7F, 0F);

		mark90Model[14].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 2F, 0F, 2F, -8F, 0F, 2F, -8F, 0F, -8F, 2F, 0F, -8F); // Box 27
		mark90Model[14].setRotationPoint(6F, -7F, 6F);

		mark90Model[15].addShapeBox(0F, 0F, 0F, 6, 11, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 2F, 2F, 0F, 2F); // Box 28
		mark90Model[15].setRotationPoint(6F, -7F, -6F);

		mark90Model[16].addShapeBox(0F, 0F, 0F, 6, 22, 6, 0F, 2F, 0F, 2F, -8F, 0F, 2F, -8F, 0F, -8F, 2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 29
		mark90Model[16].setRotationPoint(6F, -45F, 6F);

		mark90Model[17].addShapeBox(0F, 0F, 0F, 6, 22, 6, 0F, 2F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 2F, 2F, 0F, 2F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		mark90Model[17].setRotationPoint(6F, -45F, -6F);

		mark90Model[18].addShapeBox(0F, 0F, 0F, 6, 22, 6, 0F, -2F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, -8F, -2F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		mark90Model[18].setRotationPoint(0F, -45F, 6F);

		mark90Model[19].addShapeBox(0F, 0F, 0F, 6, 22, 6, 0F, 3F, 0F, -2F, -8F, 0F, -2F, -8F, 0F, -2F, 3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		mark90Model[19].setRotationPoint(6F, -45F, 0F);

		mark90Model[20].addShapeBox(0F, 0F, 0F, 6, 22, 6, 0F, -8F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, -8F, -8F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 33
		mark90Model[20].setRotationPoint(-6F, -45F, 6F);

		mark90Model[21].addShapeBox(0F, 0F, 0F, 6, 22, 6, 0F, -8F, 0F, -2F, 3F, 0F, -2F, 3F, 0F, -2F, -8F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		mark90Model[21].setRotationPoint(-6F, -45F, 0F);

		mark90Model[22].addShapeBox(0F, 0F, 0F, 6, 22, 6, 0F, -8F, 0F, -8F, 2F, 0F, -8F, 2F, 0F, 2F, -8F, 0F, 2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		mark90Model[22].setRotationPoint(-6F, -45F, -6F);

		mark90Model[23].addShapeBox(0F, 0F, 0F, 6, 22, 6, 0F, -2F, 0F, -8F, -2F, 0F, -8F, -2F, 0F, 3F, -2F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		mark90Model[23].setRotationPoint(0F, -45F, -6F);

		mark90Model[24].addShapeBox(0F, 0F, 0F, 9, 20, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F); // Box 37
		mark90Model[24].setRotationPoint(-6F, -45F, 2.5F);

		mark90Model[25].addShapeBox(0F, 0F, 0F, 1, 20, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F); // Box 38
		mark90Model[25].setRotationPoint(2.5F, -45F, -6F);

		mark90Model[26].addShapeBox(0F, 0F, 0F, 1, 20, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		mark90Model[26].setRotationPoint(2.5F, -45F, 3F);

		mark90Model[27].addShapeBox(0F, 0F, 0F, 9, 20, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F); // Box 40
		mark90Model[27].setRotationPoint(3F, -45F, 2.5F);

		mark90Model[28].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		mark90Model[28].setRotationPoint(6F, -45F, -6F);

		mark90Model[29].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		mark90Model[29].setRotationPoint(0F, -45F, -6F);

		mark90Model[30].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		mark90Model[30].setRotationPoint(-6F, -45F, -6F);

		mark90Model[31].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		mark90Model[31].setRotationPoint(-6F, -45F, 0F);

		mark90Model[32].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 48
		mark90Model[32].setRotationPoint(-6F, -45F, 6F);

		mark90Model[33].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 49
		mark90Model[33].setRotationPoint(6F, -45F, 6F);

		mark90Model[34].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		mark90Model[34].setRotationPoint(0F, -45F, 6F);

		mark90Model[35].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		mark90Model[35].setRotationPoint(6F, -45F, 0F);

		mark90Model[36].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		mark90Model[36].setRotationPoint(0F, -45F, 0F);


	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < 37; i++)
		{
			mark90Model[i].render(f5);
		}
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}

	public ModelRendererTurbo mark90Model[];
}