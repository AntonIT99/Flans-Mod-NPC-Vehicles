//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelStreltsySystem extends ModelVehicle //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelStreltsySystem() //Same as Filename
	{
		turretModel = new ModelRendererTurbo[9];
		barrelModel = new ModelRendererTurbo[27];

		initturretModel_1();
		initbarrelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		turretModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 2
		turretModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 6
		turretModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 7
		turretModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		turretModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		turretModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		turretModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 3
		turretModel[8] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 4

		turretModel[0].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		turretModel[0].setRotationPoint(-0.5F, -17F, -0.5F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		turretModel[1].setRotationPoint(-0.5F, -17F, -0.5F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.3F, 4F, -0.0999999999999996F, -0.3F, 4F, -0.0999999999999996F, -0.1F, 0F, 0.3F, -0.1F, 0F, 0.3F, -0.299999999999999F, 1.8F, -0.0999999999999999F, -0.300000000000001F, 1.8F, -0.0999999999999999F); // Box 6
		turretModel[2].setRotationPoint(-0.5F, -17F, 0.7F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0.1F, -0.4F, 0.4F, 0.3F, -0.4F, 0.4F, 0.3F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.4F, 0F, -0.0999999999999999F, -0.4F, 0F, -0.0999999999999999F); // Box 7
		turretModel[3].setRotationPoint(-0.5F, -16.5F, 1.7F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.4F, 0F, -0.0999999999999996F, -0.4F, 0F, -0.0999999999999996F, -0.3F, 1F, 1.1F, -0.3F, 1F, 1.1F, -0.4F, -0.5F, -0.5F, -0.4F, -0.5F, -0.5F); // Box 0
		turretModel[4].setRotationPoint(-0.5F, -10.5F, 1.7F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 1
		turretModel[5].setRotationPoint(-0.5F, 9F, -0.5F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.4F, -2F, -0.0999999999999999F, -0.4F, -2F, -0.0999999999999999F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0.1F, -0.4F, 0.4F, 0.3F, -0.4F, 0.4F, 0.3F); // Box 2
		turretModel[6].setRotationPoint(-0.5F, -23.3F, 1.7F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 1.8F, 1F, -0.4F, 1.8F, 1F, -0.3F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.4F, -0.5F, 0.8F, -0.4F, -0.5F, 0.8F, -0.3F, 1.5F, 0.1F, -0.3F, 1.5F, 0.1F); // Box 3
		turretModel[7].setRotationPoint(-0.5F, -23.3F, 0.7F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 4
		turretModel[8].setRotationPoint(-0.5F, -22.3F, 0.7F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 10
		barrelModel[1] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 11
		barrelModel[2] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 23
		barrelModel[3] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 24
		barrelModel[4] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 25
		barrelModel[5] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 14
		barrelModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 15
		barrelModel[7] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 16
		barrelModel[8] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 17
		barrelModel[9] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 14
		barrelModel[10] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 15
		barrelModel[11] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 20
		barrelModel[12] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 21
		barrelModel[13] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 22
		barrelModel[14] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 23
		barrelModel[15] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 24
		barrelModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 25
		barrelModel[17] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 26
		barrelModel[18] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 27
		barrelModel[19] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 28
		barrelModel[20] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 29
		barrelModel[21] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 22
		barrelModel[22] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 23
		barrelModel[23] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 24
		barrelModel[24] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 25
		barrelModel[25] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 26
		barrelModel[26] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 27

		barrelModel[0].addShapeBox(-1F, -2F, -1F, 17, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F); // Box 10
		barrelModel[0].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[1].addShapeBox(-17.5F, -1.5F, -1F, 5, 2, 2, 0F,0F, -0.3F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.2F, 0F, 1.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.2F); // Box 11
		barrelModel[1].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[2].addShapeBox(-8F, -0.5F, -1F, 7, 1, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 23
		barrelModel[2].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[3].addShapeBox(-4F, -2.4F, -0.5F, 26, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 24
		barrelModel[3].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[4].addShapeBox(22F, -2.4F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 25
		barrelModel[4].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[5].addShapeBox(-10F, -1.5F, -1F, 2, 2, 2, 0F,0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		barrelModel[5].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[6].addShapeBox(16F, -2F, -1F, 5, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, -0.8F, -0.3F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.8F, -0.3F); // Box 15
		barrelModel[6].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[7].addShapeBox(16F, -1.3F, -0.5F, 8, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 16
		barrelModel[7].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[8].addShapeBox(-9F, -1F, -1.2F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		barrelModel[8].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[9].addShapeBox(-5.8F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 14
		barrelModel[9].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[10].addShapeBox(-6F, -3.4F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 15
		barrelModel[10].setRotationPoint(0F, -17F, -0.5F);
		barrelModel[10].rotateAngleZ = 0.78539816F;

		barrelModel[11].addShapeBox(-3F, -1.8F, -1.9F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 20
		barrelModel[11].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[12].addShapeBox(-2.5F, -3.1F, -1.9F, 1, 1, 1, 0F,-0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F); // Box 21
		barrelModel[12].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[13].addShapeBox(-2.8F, -2.2F, -1.9F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 22
		barrelModel[13].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[14].addShapeBox(-3F, -3.9F, -1.9F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 23
		barrelModel[14].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[15].addShapeBox(-3.3F, -3.9F, -1.4F, 1, 1, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 24
		barrelModel[15].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[16].addShapeBox(-8F, -2.4F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F); // Box 25
		barrelModel[16].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[17].addShapeBox(-7.5F, -3.1F, -1.4F, 1, 1, 1, 0F,-0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, -0.3F); // Box 26
		barrelModel[17].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[18].addShapeBox(-3.3F, -3.7F, -1.2F, 2, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 27
		barrelModel[18].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[19].addShapeBox(-3.5F, -2F, -2.2F, 2, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 28
		barrelModel[19].setRotationPoint(0F, -17F, -0.5F);
		barrelModel[19].rotateAngleY = -0.54105207F;
		barrelModel[19].rotateAngleZ = -0.76794487F;

		barrelModel[20].addShapeBox(-1F, -2.5F, -1.7F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 29
		barrelModel[20].setRotationPoint(0F, -17F, -0.5F);
		barrelModel[20].rotateAngleY = -0.27925268F;

		barrelModel[21].addShapeBox(-11F, -1.5F, -1F, 1, 2, 2, 0F,0F, -0.5F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		barrelModel[21].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[22].addShapeBox(-12F, -1.5F, -1F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 23
		barrelModel[22].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[23].addShapeBox(-19.5F, -1.5F, -1F, 2, 2, 2, 0F,0F, 0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, 0.3F, 0F, -0.5F, 2.5F, 0F, 0F, 1.5F, 0.2F, 0F, 1.5F, 0.2F, -0.5F, 2.5F, 0F); // Box 24
		barrelModel[23].setRotationPoint(0F, -17F, -0.5F);

		barrelModel[24].addShapeBox(-4.5F, 5.7F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 25
		barrelModel[24].setRotationPoint(0F, -17F, -0.5F);
		barrelModel[24].rotateAngleZ = -0.78539816F;

		barrelModel[25].addShapeBox(-7.5F, 0.5F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 26
		barrelModel[25].setRotationPoint(0F, -17F, -0.5F);
		barrelModel[25].rotateAngleZ = -0.52359878F;

		barrelModel[26].addShapeBox(-7.3F, 0.5F, -0.5F, 4, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 27
		barrelModel[26].setRotationPoint(-4F, -17F, -0.5F);
		barrelModel[26].rotateAngleZ = 0.17453293F;
	}
}