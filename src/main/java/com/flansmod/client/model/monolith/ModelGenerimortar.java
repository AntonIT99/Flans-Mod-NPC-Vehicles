//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Generimortar
// Model Creator: 
// Created on: 18.12.2022 - 22:37:18
// Last changed on: 18.12.2022 - 22:37:18

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGenerimortar extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelGenerimortar() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];
		turretModel = new ModelRendererTurbo[10];
		barrelModel = new ModelRendererTurbo[17];

		initbodyModel_1();
		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[0].setRotationPoint(-3.5F, 8F, -2.5F);

		bodyModel[1].addShapeBox(0F, 0F, -1F, 7, 1, 1, 0F,0F, 1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, 1F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 0
		bodyModel[1].setRotationPoint(-3.5F, 8F, 2.5F);

		bodyModel[2].addShapeBox(0F, 0.4F, 0F, 3, 1, 10, 0F,3F, -0.2F, 1F, 3F, -0.9F, 1F, 3F, -0.9F, 1F, 3F, -0.2F, 1F, 3F, -0.2F, 1F, 3F, 0.5F, 1F, 3F, 0.5F, 1F, 3F, -0.2F, 1F); // Box 0
		bodyModel[2].setRotationPoint(-1.5F, 6.9F, -5F);
		bodyModel[2].rotateAngleZ = -0.12217305F;

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.45F, 0.2F, 0.45F, 0.45F, -0.2F, 0.45F, 0.45F, -0.2F, 0.45F, 0.45F, 0.2F, 0.45F, 0.45F, -0.2F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, 0F, 0.45F, 0.45F, -0.2F, 0.45F); // Box 0
		bodyModel[3].setRotationPoint(-0.5F, 7F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, 0.45F, -0.4F, -0.5F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F); // Box 0
		bodyModel[4].setRotationPoint(-1.35F, 6.85F, -2.3F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, -0.5F, 0.45F, -0.4F, -0.5F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F); // Box 0
		bodyModel[5].setRotationPoint(-1.35F, 6.85F, 1.3F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, -0.5F, 0.45F, -0.4F, -0.5F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F); // Box 0
		bodyModel[6].setRotationPoint(0.35F, 7.2F, 1.3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, -0.5F, 0.45F, -0.4F, -0.5F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F, -0.4F, 0F, 0.45F); // Box 0
		bodyModel[7].setRotationPoint(0.35F, 7.2F, -2.3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.45F, 0F, -0.4F, 0.45F, -0.9F, -0.4F, 0.45F, -0.9F, -0.4F, 0.45F, 0F, -0.4F, 0.45F, 0F, -0.4F, 0.45F, 0F, -0.4F, 0.45F, 0F, -0.4F, 0.45F, 0F, -0.4F); // Box 0
		bodyModel[8].setRotationPoint(1.35F, 7.2F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.45F, -0.2F, -0.4F, 0.45F, 0F, -0.4F, 0.45F, 0F, -0.4F, 0.45F, -0.2F, -0.4F, 0.45F, -0.5F, -0.4F, 0.45F, 0F, -0.4F, 0.45F, 0F, -0.4F, 0.45F, -0.5F, -0.4F); // Box 0
		bodyModel[9].setRotationPoint(-2.4F, 6.8F, -0.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 12
		turretModel[1] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 13
		turretModel[2] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 15
		turretModel[3] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 16
		turretModel[4] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 17
		turretModel[5] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 18
		turretModel[6] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 19
		turretModel[7] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 20
		turretModel[8] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 22
		turretModel[9] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 23

		turretModel[0].addShapeBox(-0.5F, -7F, -0.5F, 1, 8, 1, 0F,-0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F, -0.2F); // Box 12
		turretModel[0].setRotationPoint(17.5F, -1F, 0F);
		turretModel[0].rotateAngleZ = 0.71558499F;

		turretModel[1].addShapeBox(17F, -1F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.1F, 0.15F, -0.15F, -0.1F, 0.15F, -0.15F, -0.1F, 0.15F, -0.15F, -0.1F, 0.15F, -0.15F, -0.1F, 0.4F, -0.15F, -0.1F, 0.4F, -0.15F, -0.1F, 0.4F, -0.15F, -0.1F, 0.4F); // Box 13
		turretModel[1].setRotationPoint(0F, -1F, 0F);

		turretModel[2].addShapeBox(17F, 0.5F, -0.2F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 15
		turretModel[2].setRotationPoint(0F, -2F, 0F);
		turretModel[2].rotateAngleX = 0.4712389F;

		turretModel[3].addShapeBox(17F, 0.5F, -0.8F, 1, 12, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 16
		turretModel[3].setRotationPoint(0F, -2F, 0F);
		turretModel[3].rotateAngleX = -0.4712389F;

		turretModel[4].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F, -0.15F, -0.25F, -0.15F); // Box 17
		turretModel[4].setRotationPoint(17.5F, -1F, 0F);
		turretModel[4].rotateAngleZ = 0.71558499F;

		turretModel[5].addShapeBox(-0.5F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.05F, 0.2F, -0.05F, -0.05F, 0.2F, -0.05F, -0.05F, 0.2F, -0.05F, -0.05F, 0.2F, -0.05F, -0.05F, 0.2F, -0.05F, -0.05F, 0.2F, -0.05F, -0.05F, 0.2F, -0.05F, -0.05F, 0.2F, -0.05F); // Box 18
		turretModel[5].setRotationPoint(17.5F, -1F, 0F);
		turretModel[5].rotateAngleZ = 0.71558499F;

		turretModel[6].addShapeBox(-0.5F, -2.7F, -0.5F, 1, 1, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 19
		turretModel[6].setRotationPoint(17.5F, -1F, 0F);
		turretModel[6].rotateAngleZ = 0.71558499F;

		turretModel[7].addShapeBox(-0.5F, -2.85F, -0.5F, 1, 1, 1, 0F,-0.13F, 0.2F, -0.13F, -0.13F, 0.2F, -0.13F, -0.13F, 0.2F, -0.13F, -0.13F, 0.2F, -0.13F, -0.13F, 0.2F, -0.13F, -0.13F, 0.2F, -0.13F, -0.13F, 0.2F, -0.13F, -0.13F, 0.2F, -0.13F); // Box 20
		turretModel[7].setRotationPoint(17.5F, -1F, 0F);
		turretModel[7].rotateAngleZ = 0.71558499F;

		turretModel[8].addShapeBox(17F, -8.5F, -6.2F, 1, 1, 1, 0F,0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F); // Box 22
		turretModel[8].setRotationPoint(0F, 16.8F, 0F);

		turretModel[9].addShapeBox(17F, 8.65F, 5.3F, 1, 1, 1, 0F,0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F, 0.15F, -0.3F, 0.15F); // Box 23
		turretModel[9].setRotationPoint(0F, -0.3F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 0
		barrelModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 0
		barrelModel[3] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 0
		barrelModel[4] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 0
		barrelModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 1
		barrelModel[6] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 2
		barrelModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 3
		barrelModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 4
		barrelModel[9] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 5
		barrelModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 6
		barrelModel[11] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 7
		barrelModel[12] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 8
		barrelModel[13] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 9
		barrelModel[14] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 10
		barrelModel[15] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 11
		barrelModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 21

		barrelModel[0].addShapeBox(0.2F, -0.7F, 0F, 1, 1, 1, 0F,0.4F, -0.15F, -0.15F, 0.4F, -0.15F, -0.15F, 0.4F, -0.15F, -0.15F, 0.4F, -0.15F, -0.15F, 0.4F, -0.15F, -0.15F, 0.4F, -0.15F, -0.15F, 0.4F, -0.15F, -0.15F, 0.4F, -0.15F, -0.15F); // Box 0
		barrelModel[0].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[0].rotateAngleZ = 0.78539816F;

		barrelModel[1].addShapeBox(1.9F, -0.75F, 0F, 1, 1, 1, 0F,0.3F, -0.05F, 0.75F, 0.3F, -0.05F, 0.75F, 0.3F, -0.05F, 0.75F, 0.3F, -0.05F, 0.75F, 0.3F, -0.05F, 0.75F, 0.3F, -0.05F, 0.75F, 0.3F, -0.05F, 0.75F, 0.3F, -0.05F, 0.75F); // Box 0
		barrelModel[1].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[1].rotateAngleZ = 0.78539816F;

		barrelModel[2].addShapeBox(1.9F, -1.6F, 0F, 1, 1, 1, 0F,0.3F, -0.15F, 0.1F, 0.3F, -0.15F, 0.1F, 0.3F, -0.15F, 0.1F, 0.3F, -0.15F, 0.1F, 0.3F, -0.1F, 0.75F, 0.3F, -0.1F, 0.75F, 0.3F, -0.1F, 0.75F, 0.3F, -0.1F, 0.75F); // Box 0
		barrelModel[2].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[2].rotateAngleZ = 0.78539816F;

		barrelModel[3].addShapeBox(1.9F, 0.0999999999999996F, 0F, 1, 1, 1, 0F,0.3F, -0.1F, 0.75F, 0.3F, -0.1F, 0.75F, 0.3F, -0.1F, 0.75F, 0.3F, -0.1F, 0.75F, 0.3F, -0.15F, 0.1F, 0.3F, -0.15F, 0.1F, 0.3F, -0.15F, 0.1F, 0.3F, -0.15F, 0.1F); // Box 0
		barrelModel[3].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[3].rotateAngleZ = 0.78539816F;

		barrelModel[4].addShapeBox(2.9F, -0.75F, 0F, 24, 1, 1, 0F,0.3F, -0.05F, 0.65F, 0.3F, -0.05F, 0.65F, 0.3F, -0.05F, 0.65F, 0.3F, -0.05F, 0.65F, 0.3F, -0.05F, 0.65F, 0.3F, -0.05F, 0.65F, 0.3F, -0.05F, 0.65F, 0.3F, -0.05F, 0.65F); // Box 0
		barrelModel[4].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[4].rotateAngleZ = 0.78539816F;

		barrelModel[5].addShapeBox(2.9F, -1.6F, 0F, 24, 1, 1, 0F,0.3F, -0.25F, 0.05F, 0.3F, -0.25F, 0.05F, 0.3F, -0.25F, 0.05F, 0.3F, -0.25F, 0.05F, 0.3F, -0.1F, 0.65F, 0.3F, -0.1F, 0.65F, 0.3F, -0.1F, 0.65F, 0.3F, -0.1F, 0.65F); // Box 1
		barrelModel[5].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[5].rotateAngleZ = 0.78539816F;

		barrelModel[6].addShapeBox(2.9F, 0.1F, 0F, 24, 1, 1, 0F,0.3F, -0.1F, 0.65F, 0.3F, -0.1F, 0.65F, 0.3F, -0.1F, 0.65F, 0.3F, -0.1F, 0.65F, 0.3F, -0.25F, 0.05F, 0.3F, -0.25F, 0.05F, 0.3F, -0.25F, 0.05F, 0.3F, -0.25F, 0.05F); // Box 2
		barrelModel[6].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[6].rotateAngleZ = 0.78539816F;

		barrelModel[7].addShapeBox(15.9F, -0.599999999999999F, 0F, 1, 1, 1, 0F,0.2F, -0.05F, 0.75F, 0.2F, -0.05F, 0.75F, 0.2F, -0.05F, 0.75F, 0.2F, -0.05F, 0.75F, 0.2F, -0.05F, 0.75F, 0.2F, -0.05F, 0.75F, 0.2F, -0.05F, 0.75F, 0.2F, -0.05F, 0.75F); // Box 3
		barrelModel[7].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[7].rotateAngleZ = 0.78539816F;

		barrelModel[8].addShapeBox(15.9F, -0.449999999999999F, 0F, 1, 1, 1, 0F,0.2F, -0.15F, 0.1F, 0.2F, -0.15F, 0.1F, 0.2F, -0.15F, 0.1F, 0.2F, -0.15F, 0.1F, 0.2F, -0.1F, 0.75F, 0.2F, -0.1F, 0.75F, 0.2F, -0.1F, 0.75F, 0.2F, -0.1F, 0.75F); // Box 4
		barrelModel[8].setRotationPoint(0F, 6F, -0.5F);
		barrelModel[8].rotateAngleZ = 0.78539816F;

		barrelModel[9].addShapeBox(15.9F, 0.25F, 0F, 1, 1, 1, 0F,0.2F, -0.1F, 0.75F, 0.2F, -0.1F, 0.75F, 0.2F, -0.1F, 0.75F, 0.2F, -0.1F, 0.75F, 0.2F, -0.15F, 0.1F, 0.2F, -0.15F, 0.1F, 0.2F, -0.15F, 0.1F, 0.2F, -0.15F, 0.1F); // Box 5
		barrelModel[9].setRotationPoint(0F, 7F, -0.5F);
		barrelModel[9].rotateAngleZ = 0.78539816F;

		barrelModel[10].addShapeBox(14F, 0.65F, 0F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 6
		barrelModel[10].setRotationPoint(0F, 7F, 0.2F);
		barrelModel[10].rotateAngleZ = 0.78539816F;

		barrelModel[11].addShapeBox(14F, 0.65F, 0F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 7
		barrelModel[11].setRotationPoint(0F, 7F, -1F);
		barrelModel[11].rotateAngleZ = 0.78539816F;

		barrelModel[12].addShapeBox(18.05F, 0.600000000000001F, 0F, 1, 1, 3, 0F,0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 8
		barrelModel[12].setRotationPoint(0F, 7F, -1.5F);
		barrelModel[12].rotateAngleZ = 0.78539816F;

		barrelModel[13].addShapeBox(18.05F, 1.1F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 9
		barrelModel[13].setRotationPoint(0F, 7F, -1.8F);
		barrelModel[13].rotateAngleZ = 0.78539816F;

		barrelModel[14].addShapeBox(18.05F, 1.1F, 0F, 1, 1, 1, 0F,0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F, 0F, -0.05F, -0.2F); // Box 10
		barrelModel[14].setRotationPoint(0F, 7F, 0.8F);
		barrelModel[14].rotateAngleZ = 0.78539816F;

		barrelModel[15].addShapeBox(18.3F, 1.25F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 11
		barrelModel[15].setRotationPoint(0F, 7F, -1.5F);
		barrelModel[15].rotateAngleZ = 0.78539816F;

		barrelModel[16].addShapeBox(18.3F, 1.25F, 0F, 1, 1, 1, 0F,-0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F); // Box 21
		barrelModel[16].setRotationPoint(0F, 7F, 2F);
		barrelModel[16].rotateAngleZ = 0.78539816F;
	}
}