//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: WheelLock
// Model Creator: 
// Created on: 28.03.2019 - 18:38:48
// Last changed on: 28.03.2019 - 18:38:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelWheelLock extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelWheelLock() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[28];
		ammoModel = new ModelRendererTurbo[1];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		gunModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		gunModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 23
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 24
		gunModel[4] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 25
		gunModel[5] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		gunModel[6] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 15
		gunModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 16
		gunModel[8] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 17
		gunModel[9] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 14
		gunModel[10] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 15
		gunModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 20
		gunModel[12] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 21
		gunModel[13] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 22
		gunModel[14] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 23
		gunModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 25
		gunModel[16] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 26
		gunModel[17] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 23
		gunModel[18] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 25
		gunModel[19] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 27
		gunModel[20] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 28
		gunModel[21] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 29
		gunModel[22] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 30
		gunModel[23] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 31
		gunModel[24] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 32
		gunModel[25] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 33
		gunModel[26] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 34
		gunModel[27] = new ModelRendererTurbo(this, 9, 49, textureX, textureY); // Box 35

		gunModel[0].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F); // Box 10
		gunModel[0].setRotationPoint(7F, -4.5F, -1F);

		gunModel[1].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -2.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.2F, -0.3F, 1.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.3F, 1.5F, -0.2F); // Box 11
		gunModel[1].setRotationPoint(-8.5F, -4F, -1F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F); // Box 23
		gunModel[2].setRotationPoint(0F, -3F, -1F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 24
		gunModel[3].setRotationPoint(4F, -4.9F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F); // Box 25
		gunModel[4].setRotationPoint(19F, -4.9F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0.6F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.6F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F); // Box 14
		gunModel[5].setRotationPoint(-3F, -4F, -1F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, -0.8F, -0.3F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -0.8F, -0.3F); // Box 15
		gunModel[6].setRotationPoint(16F, -4.5F, -1F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 16
		gunModel[7].setRotationPoint(16F, -3.8F, -0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 17
		gunModel[8].setRotationPoint(0F, -3.5F, -1.2F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 14
		gunModel[9].setRotationPoint(0.2F, -2F, -0.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 15
		gunModel[10].setRotationPoint(-0.8F, -0.3F, -0.5F);
		gunModel[10].rotateAngleZ = 0.78539816F;

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 20
		gunModel[11].setRotationPoint(5F, -4.3F, -1.9F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F); // Box 21
		gunModel[12].setRotationPoint(5.5F, -5.6F, -1.9F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 22
		gunModel[13].setRotationPoint(5.2F, -4.7F, -1.9F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F); // Box 23
		gunModel[14].setRotationPoint(4.5F, -6.6F, -1.9F);
		gunModel[14].rotateAngleZ = -0.43633231F;

		gunModel[15].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F, 0F, 0.1F, 0.4F); // Box 25
		gunModel[15].setRotationPoint(0F, -4.9F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F); // Box 26
		gunModel[16].setRotationPoint(0.5F, -5.2F, -1.4F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0.5F, 0.5F, 0F); // Box 23
		gunModel[17].setRotationPoint(-4F, -4F, -1F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 25
		gunModel[18].setRotationPoint(-3.8F, -0.8F, -0.5F);
		gunModel[18].rotateAngleZ = 1.22173048F;

		gunModel[19].addShapeBox(-4F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F, -0.2F, -0.3F, 0F); // Box 27
		gunModel[19].setRotationPoint(-0.8F, -0.8F, -0.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, 0F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, 0F, 0F); // Box 28
		gunModel[20].setRotationPoint(-9.8F, -1.5F, -1F);
		gunModel[20].rotateAngleZ = 0.34906585F;

		gunModel[21].addShapeBox(-0.6F, 0F, 0F, 1, 2, 2, 0F,-0.2F, -0.3F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.3F, -0.3F); // Box 29
		gunModel[21].setRotationPoint(-9.8F, -1.5F, -1F);
		gunModel[21].rotateAngleZ = 0.34906585F;

		gunModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, -0.2F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, -1F, -0.3F, -0.2F, -1F, -0.5F, -0.2F, -1F, -0.5F, 0F, -1F, -0.3F); // Box 30
		gunModel[22].setRotationPoint(19F, -4.5F, -1F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.3F, 0F); // Box 31
		gunModel[23].setRotationPoint(-3F, -3.5F, -1.2F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, 1.3F, -0.2F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 1.3F, 0F); // Box 32
		gunModel[24].setRotationPoint(-7F, -3.5F, -1.2F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F); // Box 33
		gunModel[25].setRotationPoint(-1F, -3.5F, -1.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 34
		gunModel[26].setRotationPoint(-4.8F, -1.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 35
		gunModel[27].setRotationPoint(-1F, -3.5F, -1.7F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 34

		ammoModel[0].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 34
		ammoModel[0].setRotationPoint(20F, -4.8F, -0.5F);
		animationType = EnumAnimationType.END_LOADED;
	}
}