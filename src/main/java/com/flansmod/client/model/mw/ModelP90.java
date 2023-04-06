//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 12.10.2016 - 15:22:57
// Last changed on: 12.10.2016 - 15:22:57

package com.flansmod.client.model.mw; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelP90 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelP90() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[34];
		gunModel[0] = new ModelRendererTurbo(this, 0, 8, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 20, 8, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 0, 11, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 8, 11, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 14, 11, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Box 6
		gunModel[6] = new ModelRendererTurbo(this, 20, 11, textureX, textureY); // Box 7
		gunModel[7] = new ModelRendererTurbo(this, 6, 14, textureX, textureY); // Box 8
		gunModel[8] = new ModelRendererTurbo(this, 14, 17, textureX, textureY); // Box 9
		gunModel[9] = new ModelRendererTurbo(this, 0, 17, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 6, 17, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Box 14
		gunModel[12] = new ModelRendererTurbo(this, 8, 20, textureX, textureY); // Box 15
		gunModel[13] = new ModelRendererTurbo(this, 10, 15, textureX, textureY); // Box 16
		gunModel[14] = new ModelRendererTurbo(this, 16, 20, textureX, textureY); // Box 19
		gunModel[15] = new ModelRendererTurbo(this, 8, 23, textureX, textureY); // Box 20
		gunModel[16] = new ModelRendererTurbo(this, 20, 19, textureX, textureY); // Box 21
		gunModel[17] = new ModelRendererTurbo(this, 0, 23, textureX, textureY); // Box 22
		gunModel[18] = new ModelRendererTurbo(this, 28, 14, textureX, textureY); // Box 23
		gunModel[19] = new ModelRendererTurbo(this, 28, 11, textureX, textureY); // Box 24
		gunModel[20] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Box 25
		gunModel[21] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Box 31
		gunModel[22] = new ModelRendererTurbo(this, 6, 28, textureX, textureY); // Box 32
		gunModel[23] = new ModelRendererTurbo(this, 12, 28, textureX, textureY); // Box 35
		gunModel[24] = new ModelRendererTurbo(this, 20, 28, textureX, textureY); // Box 36
		gunModel[25] = new ModelRendererTurbo(this, 23, 25, textureX, textureY); // Box 37
		gunModel[26] = new ModelRendererTurbo(this, 19, 25, textureX, textureY); // Box 39
		gunModel[27] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Box 40
		gunModel[28] = new ModelRendererTurbo(this, 0, 34, textureX, textureY); // Box 43
		gunModel[29] = new ModelRendererTurbo(this, 0, 36, textureX, textureY); // Box 44
		gunModel[30] = new ModelRendererTurbo(this, 15, 15, textureX, textureY); // Box 45
		gunModel[31] = new ModelRendererTurbo(this, 34, 14, textureX, textureY); // Box 47
		gunModel[32] = new ModelRendererTurbo(this, 34, 11, textureX, textureY); // Box 48
		gunModel[33] = new ModelRendererTurbo(this, 34, 8, textureX, textureY); // Box 49

		gunModel[0].addShapeBox(-6.25F, -2.5F, -1F, 8, 1, 2, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(1.75F, -2.5F, -1F, 4, 1, 2, 0F, 0F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, -0.5F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 1
		gunModel[1].setRotationPoint(0F, 0F, 0F);

		gunModel[2].addShapeBox(3.25F, -1.5F, -1F, 2, 1, 2, 0F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F); // Box 2
		gunModel[2].setRotationPoint(0F, 0F, 0F);

		gunModel[3].addShapeBox(2.75F, -1.5F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, 0F, -0.75F, -0.3F); // Box 3
		gunModel[3].setRotationPoint(0F, 0F, 0F);

		gunModel[4].addShapeBox(1.75F, -1.5F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.75F, -0.3F); // Box 4
		gunModel[4].setRotationPoint(0F, 0F, 0F);

		gunModel[5].addShapeBox(4.6F, -0.5F, -1F, 1, 1, 2, 0F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F, -0.35F, -0.3F, -0.5F); // Box 6
		gunModel[5].setRotationPoint(0F, 0F, 0F);

		gunModel[6].addShapeBox(-0.25F, -1.5F, -1F, 2, 2, 2, 0F, -0.75F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.75F, 0F, -0.3F, -0.75F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.75F, -0.5F, -0.3F); // Box 7
		gunModel[6].setRotationPoint(0F, 0F, 0F);

		gunModel[7].addShapeBox(1.5F, -1.75F, -0.5F, 1, 2, 1, 0F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.05F, -0.25F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, -0.1F, -0.3F, 0.05F, -0.25F, -0.3F, 0.05F); // Box 8
		gunModel[7].setRotationPoint(0F, 0F, 0F);

		gunModel[8].addShapeBox(1.75F, -0.25F, -1F, 1, 1, 2, 0F, 0F, 0F, -0.3F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, -0.25F, -0.75F, -0.4F, -0.25F, -0.75F, -0.4F, 0F, -0.75F, -0.3F); // Box 9
		gunModel[8].setRotationPoint(0F, 0F, 0F);

		gunModel[9].addShapeBox(3F, -0.5F, -1F, 1, 1, 2, 0F, -0.5F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F); // Box 10
		gunModel[9].setRotationPoint(0F, 0F, 0F);

		gunModel[10].addShapeBox(3F, -0.1F, -1F, 1, 1, 2, 0F, -0.5F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, 0.2F, -0.3F, -0.4F, -0.5F, -0.3F, -0.4F, -0.4F, -0.6F, -0.4F, -0.3F, -0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.4F, -0.6F, -0.4F); // Box 11
		gunModel[10].setRotationPoint(0F, 0F, 0F);

		gunModel[11].addShapeBox(1.4F, 0.3F, -1F, 2, 1, 2, 0F, -1.5F, -0.1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.5F, -0.1F, -0.4F, -1.5F, -0.1F, -0.4F, 0.3F, -0.5F, -0.4F, 0.3F, -0.5F, -0.4F, -1.5F, -0.1F, -0.4F); // Box 14
		gunModel[11].setRotationPoint(0F, 0F, 0F);

		gunModel[12].addShapeBox(2.4F, 0.3F, -1F, 2, 1, 2, 0F, 0.3F, -0.1F, -0.4F, -1.5F, -0.1F, -0.4F, -1.5F, -0.1F, -0.4F, 0.3F, -0.1F, -0.4F, 0.4F, 0F, -0.4F, -1.5F, -0.1F, -0.4F, -1.5F, -0.1F, -0.4F, 0.4F, 0F, -0.4F); // Box 15
		gunModel[12].setRotationPoint(0F, 0F, 0F);

		gunModel[13].addShapeBox(1.75F, 0F, -1F, 1, 1, 2, 0F, -0.25F, 0F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, 0.15F, -0.5F, -0.25F, 0F, -0.5F, -0.45F, -0.25F, -0.5F, -0.2F, -0.6F, -0.5F, -0.2F, -0.6F, -0.5F, -0.45F, -0.25F, -0.5F); // Box 16
		gunModel[13].setRotationPoint(0F, 0F, 0F);

		gunModel[14].addShapeBox(0.5F, 0F, -1F, 1, 2, 2, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -1.5F, -0.3F, -1F, -0.75F, -0.3F, -1F, -0.75F, -0.3F, 0.5F, -1.5F, -0.3F); // Box 19
		gunModel[14].setRotationPoint(0F, 0F, 0F);

		gunModel[15].addShapeBox(-6.25F, -1.5F, -1F, 3, 3, 2, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F); // Box 20
		gunModel[15].setRotationPoint(0F, 0F, 0F);

		gunModel[16].addShapeBox(-1.5F, 0.25F, -1F, 2, 1, 2, 0F, -0.25F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.25F, 0F, -0.3F); // Box 21
		gunModel[16].setRotationPoint(0F, 0F, 0F);

		gunModel[17].addShapeBox(-3.5F, -2F, -1F, 2, 3, 2, 0F, -0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, 0F, -0.3F, 0.25F, 0.25F, -0.3F, 0.25F, 0.25F, -0.3F, -0.25F, 0F, -0.3F); // Box 22
		gunModel[17].setRotationPoint(0F, 0F, 0F);

		gunModel[18].addShapeBox(-1.5F, -2.25F, -1F, 1, 1, 2, 0F, -0.25F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, 0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, -0.25F, 0.25F, -0.3F); // Box 23
		gunModel[18].setRotationPoint(0F, 0F, 0F);

		gunModel[19].addShapeBox(-0.25F, -2.25F, -1F, 1, 1, 2, 0F, 0F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, -0.25F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.25F, -0.3F, -0.25F, 0.25F, -0.3F, -0.25F, 0.25F, -0.3F, 0F, -0.25F, -0.3F); // Box 24
		gunModel[19].setRotationPoint(0F, 0F, 0F);

		gunModel[20].addShapeBox(-6.25F, -3.5F, -1F, 4, 1, 2, 0F, 0F, -0.3F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, -0.5F, 0.1F, -0.1F, 0F, 0.1F, -0.1F); // Box 25
		gunModel[20].setRotationPoint(0F, 0F, 0F);

		gunModel[21].addShapeBox(4.25F, -3.4F, -1F, 1, 1, 2, 0F, 0.1F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F, -0.4F, 0.1F, 0.1F, -0.4F, 0.1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.1F, 0F, -0.4F); // Box 31
		gunModel[21].setRotationPoint(0F, 0F, 0F);

		gunModel[22].addShapeBox(4.25F, -4.5F, -1F, 1, 1, 2, 0F, 0.6F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.6F, 0F, -0.4F); // Box 32
		gunModel[22].setRotationPoint(0F, 0F, 0F);

		gunModel[23].addShapeBox(2F, -4.5F, -1F, 2, 1, 2, 0F, 0F, 0F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, 0F, 0F, -0.4F, 0.5F, -0.5F, -0.4F, -0.35F, 0F, -0.4F, -0.35F, 0F, -0.4F, 0.5F, -0.5F, -0.4F); // Box 35
		gunModel[23].setRotationPoint(0F, 0F, 0F);

		gunModel[24].addShapeBox(1F, -4.5F, -1F, 1, 1, 2, 0F, -0.1F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.1F, 0F, -0.4F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F); // Box 36
		gunModel[24].setRotationPoint(0F, 0F, 0F);

		gunModel[25].addShapeBox(1F, -4F, -1.5F, 1, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, -0.2F, -0.4F, -0.25F, -0.2F, -0.4F, -0.25F, 0F, -0.4F, 0.25F, 0F, -0.4F); // Box 37
		gunModel[25].setRotationPoint(0F, 0F, 0F);

		gunModel[26].addShapeBox(1F, -4F, 0.5F, 1, 2, 1, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F); // Box 39
		gunModel[26].setRotationPoint(0F, 0F, 0F);

		gunModel[27].addShapeBox(1.15F, -4.65F, -0.5F, 4, 1, 1, 0F, 0F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, -0.45F, -0.8F, 0F, -0.45F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 40
		gunModel[27].setRotationPoint(0F, 0F, 0F);

		gunModel[28].addShapeBox(3.65F, -0.75F, 3.5F, 1, 1, 1, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 43
		gunModel[28].setRotationPoint(0F, 0F, 0F);
		gunModel[28].rotateAngleX = 1.57079633F;

		gunModel[29].addShapeBox(3.65F, -0.75F, -4.5F, 1, 1, 1, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F, 0F, -0.7F, -0.05F); // Box 44
		gunModel[29].setRotationPoint(0F, 0F, 0F);
		gunModel[29].rotateAngleX = -1.57079633F;

		gunModel[30].addShapeBox(5F, -2.4F, -0.5F, 1, 1, 1, 0F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 45
		gunModel[30].setRotationPoint(0F, 0F, 0F);

		gunModel[31].addShapeBox(-7.25F, -1.5F, -1F, 1, 3, 2, 0F, -0.75F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, 0F, -0.45F, -0.15F, -0.75F, -0.45F, -0.15F); // Box 47
		gunModel[31].setRotationPoint(0F, 0F, 0F);

		gunModel[32].addShapeBox(-7.25F, -2.5F, -1F, 1, 1, 2, 0F, -0.75F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, -0.75F, -0.1F, -0.05F, -0.75F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, -0.75F, 0F, -0.05F); // Box 48
		gunModel[32].setRotationPoint(0F, 0F, 0F);

		gunModel[33].addShapeBox(-7.25F, -3.5F, -1F, 1, 1, 2, 0F, -0.75F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, 0F, -0.25F, -0.15F, -0.75F, -0.25F, -0.15F, -0.75F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, 0F, 0.1F, -0.05F, -0.75F, 0.1F, -0.05F); // Box 49
		gunModel[33].setRotationPoint(0F, 0F, 0F);


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Box 46

		defaultBarrelModel[0].addShapeBox(5.3F, -2.4F, -0.5F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 46
		defaultBarrelModel[0].setRotationPoint(0F, 0F, 0F);


		defaultScopeModel = new ModelRendererTurbo[10];
		defaultScopeModel[0] = new ModelRendererTurbo(this, 4, 34, textureX, textureY); // Box 60
		defaultScopeModel[1] = new ModelRendererTurbo(this, 4, 39, textureX, textureY); // Box 62
		defaultScopeModel[2] = new ModelRendererTurbo(this, 6, 39, textureX, textureY); // Box 64
		defaultScopeModel[3] = new ModelRendererTurbo(this, 4, 37, textureX, textureY); // Box 57
		defaultScopeModel[4] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 27
		defaultScopeModel[5] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 13
		defaultScopeModel[6] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 14
		defaultScopeModel[7] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 16
		defaultScopeModel[8] = new ModelRendererTurbo(this, 0, 38, textureX, textureY); // Box 17
		defaultScopeModel[9] = new ModelRendererTurbo(this, 0, 40, textureX, textureY); // Box 63

		defaultScopeModel[0].addShapeBox(1.25F, -5F, -1F, 1, 1, 2, 0F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.55F, -0.4F, 0F, -0.55F, -0.4F, 0F, -0.55F, -0.4F, 0F, -0.55F, -0.4F); // Box 60
		defaultScopeModel[0].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[1].addShapeBox(1.25F, -5.5F, -1F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F); // Box 62
		defaultScopeModel[1].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[2].addShapeBox(1.25F, -5.3F, -1F, 1, 1, 2, 0F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F, -0.3F, -0.3F, -0.35F); // Box 64
		defaultScopeModel[2].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[3].addShapeBox(1.25F, -5.5F, 0F, 1, 1, 1, 0F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.35F, -0.2F, -0.1F, -0.4F, -0.2F, -0.1F, -0.4F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.4F, 0F, -0.25F, -0.4F); // Box 57
		defaultScopeModel[3].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[4].addShapeBox(3.75F, -5F, -0.5F, 1, 1, 1, 0F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, 0F, -0.3F, -0.25F, -0.55F, -0.3F, -0.25F, -0.55F, -0.3F, -0.25F, -0.55F, -0.3F, -0.25F, -0.55F, -0.3F); // Box 27
		defaultScopeModel[4].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[5].addShapeBox(3.75F, -5.55F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 13
		defaultScopeModel[5].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[6].addShapeBox(3.75F, -6.05F, -0.5F, 1, 1, 1, 0F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F, -0.25F, -0.45F, -0.25F); // Box 14
		defaultScopeModel[6].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[7].addShapeBox(3.75F, -5.8F, -0.2F, 1, 1, 1, 0F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F); // Box 16
		defaultScopeModel[7].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[8].addShapeBox(3.75F, -5.8F, -0.8F, 1, 1, 1, 0F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.3F, -0.45F, -0.25F, -0.2F, -0.45F, -0.25F, -0.2F, -0.45F); // Box 17
		defaultScopeModel[8].setRotationPoint(0F, 0F, 0F);

		defaultScopeModel[9].addShapeBox(3.75F, -5F, -0.5F, 1, 1, 1, 0F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.3F, 0.05F, -0.2F, -0.5F, 0.05F, -0.2F, -0.5F, 0.05F, -0.2F, -0.5F, 0.05F, -0.2F, -0.5F, 0.05F); // Box 63
		defaultScopeModel[9].setRotationPoint(0F, 0F, 0F);


		ammoModel = new ModelRendererTurbo[5];
		ammoModel[0] = new ModelRendererTurbo(this, 10, 0, textureX, textureY); // Box 26
		ammoModel[1] = new ModelRendererTurbo(this, 16, 3, textureX, textureY); // Box 27
		ammoModel[2] = new ModelRendererTurbo(this, 10, 3, textureX, textureY); // Box 28
		ammoModel[3] = new ModelRendererTurbo(this, 22, 3, textureX, textureY); // Box 29
		ammoModel[4] = new ModelRendererTurbo(this, 14, 3, textureX, textureY); // Box 30

		ammoModel[0].addShapeBox(-2F, -3.45F, -1F, 6, 1, 2, 0F, 0F, -0.2F, -0.1F, -0.05F, -0.2F, -0.1F, -0.05F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0F, -0.1F, -0.05F, 0F, -0.1F, -0.05F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 26
		ammoModel[0].setRotationPoint(0F, 0F, 0F);

		ammoModel[1].addShapeBox(-2.85F, -3.45F, -1F, 1, 1, 2, 0F, -0.125F, -0.18F, -0.25F, 0F, -0.18F, 0F, 0F, -0.18F, 0F, -0.125F, -0.18F, -0.25F, -0.125F, 0.05F, -0.25F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, -0.125F, 0.05F, -0.25F); // Box 27
		ammoModel[1].setRotationPoint(0F, 0F, 0F);

		ammoModel[2].addShapeBox(-1.85F, -3.45F, -1F, 1, 1, 2, 0F, 0F, -0.18F, 0F, -0.125F, -0.18F, -0.25F, -0.125F, -0.18F, -0.25F, 0F, -0.18F, 0F, 0F, 0.05F, 0F, -0.125F, 0.05F, -0.25F, -0.125F, 0.05F, -0.25F, 0F, 0.05F, 0F); // Box 28
		ammoModel[2].setRotationPoint(0F, 0F, 0F);

		ammoModel[3].addShapeBox(3.55F, -3.45F, -1F, 1, 1, 2, 0F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F); // Box 29
		ammoModel[3].setRotationPoint(0F, 0F, 0F);

		ammoModel[4].addShapeBox(-2.39F, -3.7F, -0.5F, 1, 1, 1, 0F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F); // Box 30
		ammoModel[4].setRotationPoint(0F, 0F, 0F);


		pumpModel = new ModelRendererTurbo[2];
		pumpModel[0] = new ModelRendererTurbo(this, 11, 32, textureX, textureY); // Box 17
		pumpModel[1] = new ModelRendererTurbo(this, 11, 35, textureX, textureY); // Box 18

		pumpModel[0].addShapeBox(1.5F, -2.3F, -1F, 3, 1, 2, 0F, 0F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, -0.25F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 17
		pumpModel[0].setRotationPoint(0F, 0F, 0F);

		pumpModel[1].addShapeBox(3.7F, -2.3F, -1F, 1, 1, 2, 0F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F); // Box 18
		pumpModel[1].setRotationPoint(0F, 0F, 0F);



		barrelAttachPoint = new Vector3f(5.5F /16F, 1.9F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(3F /16F, 4.65F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(4.15 /16F, 4F /16F, 0.75F /16F);
		
		pumpDelayAfterReload = 54;
		pumpTime = 6;
		pumpHandleDistance = 0.1F;		
		pumpDelay = 1;

		animationType = EnumAnimationType.P90;
		translateAll(0F, 0F, 0F);


		flipAll();
	}
}