//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: BeeNest
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

public class ModelBeeNest extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelBeeNest() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[12];
		ammoModel = new ModelRendererTurbo[28];

		initgunModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		gunModel[1] = new ModelRendererTurbo(this, 1, 6, textureX, textureY); // Box 19
		gunModel[2] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // Box 20
		gunModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		gunModel[4] = new ModelRendererTurbo(this, 0, 22, textureX, textureY); // Box 22
		gunModel[5] = new ModelRendererTurbo(this, 0, 27, textureX, textureY); // Box 23
		gunModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 24
		gunModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 25
		gunModel[8] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 28
		gunModel[9] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 29
		gunModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 30
		gunModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 31

		gunModel[0].addShapeBox(0F, 0F, -1.5F, 31, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 18
		gunModel[0].setRotationPoint(-15F, -3.1F, 0F);
		gunModel[0].rotateAngleZ = -0.03490659F;

		gunModel[1].addShapeBox(0F, 0F, -3F, 31, 1, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0F, 0F); // Box 19
		gunModel[1].setRotationPoint(-15F, -2.6F, -0.8F);
		gunModel[1].rotateAngleX = -1.04719755F;

		gunModel[2].addShapeBox(0F, 0F, 0F, 31, 1, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0F, 0F); // Box 20
		gunModel[2].setRotationPoint(-15F, -2.6F, 0.8F);
		gunModel[2].rotateAngleX = 1.04719755F;

		gunModel[3].addShapeBox(0F, 0F, -3F, 31, 1, 3, 0F,0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[3].setRotationPoint(-15F, -7.6F, -1.5F);
		gunModel[3].rotateAngleX = 1.04719755F;

		gunModel[4].addShapeBox(0F, 0F, 0F, 31, 1, 3, 0F,0F, 0F, 0F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 22
		gunModel[4].setRotationPoint(-15F, -7.6F, 1.5F);
		gunModel[4].rotateAngleX = -1.04719755F;

		gunModel[5].addShapeBox(0F, 0F, -1.5F, 31, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		gunModel[5].setRotationPoint(-15F, -7.5F, 0F);
		gunModel[5].rotateAngleZ = 0.03490659F;

		gunModel[6].addShapeBox(0F, 0F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F); // Box 24
		gunModel[6].setRotationPoint(7F, -7.4F, 0F);
		gunModel[6].rotateAngleZ = 0.03490659F;

		gunModel[7].addShapeBox(0F, 0F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 25
		gunModel[7].setRotationPoint(7F, -5F, 0F);
		gunModel[7].rotateAngleZ = 0.03490659F;

		gunModel[8].addShapeBox(0F, 0F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, 2F); // Box 28
		gunModel[8].setRotationPoint(15.5F, -1.3F, 0F);
		gunModel[8].rotateAngleZ = 0.03490659F;

		gunModel[9].addShapeBox(0F, 0F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F); // Box 29
		gunModel[9].setRotationPoint(15.5F, 1.7F, 0F);
		gunModel[9].rotateAngleZ = 0.03490659F;

		gunModel[10].addShapeBox(0F, 0F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F); // Box 30
		gunModel[10].setRotationPoint(-5F, -7.4F, 0F);
		gunModel[10].rotateAngleZ = 0.03490659F;

		gunModel[11].addShapeBox(0F, 0F, -1.5F, 1, 3, 3, 0F,-0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 1.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F); // Box 31
		gunModel[11].setRotationPoint(-5F, -5F, 0F);
		gunModel[11].rotateAngleZ = 0.03490659F;
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		ammoModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 27
		ammoModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 32
		ammoModel[3] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 33
		ammoModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 34
		ammoModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 35
		ammoModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 36
		ammoModel[7] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 37
		ammoModel[8] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 38
		ammoModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 39
		ammoModel[10] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 40
		ammoModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 41
		ammoModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 42
		ammoModel[13] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 43
		ammoModel[14] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 44
		ammoModel[15] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 45
		ammoModel[16] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 46
		ammoModel[17] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 47
		ammoModel[18] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 48
		ammoModel[19] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 49
		ammoModel[20] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 50
		ammoModel[21] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 51
		ammoModel[22] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 52
		ammoModel[23] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 53
		ammoModel[24] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 54
		ammoModel[25] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 55
		ammoModel[26] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 56
		ammoModel[27] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 57

		ammoModel[0].addShapeBox(0F, 0F, -1.5F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 26
		ammoModel[0].setRotationPoint(-5F, -6.5F, 0F);

		ammoModel[1].addShapeBox(0F, 0F, -1.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 27
		ammoModel[1].setRotationPoint(12F, -6.5F, 0F);

		ammoModel[2].addShapeBox(0F, 0F, -0.5F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 32
		ammoModel[2].setRotationPoint(-5F, -6.5F, 0F);

		ammoModel[3].addShapeBox(0F, 0F, -0.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 33
		ammoModel[3].setRotationPoint(12F, -6.5F, 0F);

		ammoModel[4].addShapeBox(0F, 0F, 0.5F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 34
		ammoModel[4].setRotationPoint(-5F, -6.5F, 0F);

		ammoModel[5].addShapeBox(0F, 0F, 0.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 35
		ammoModel[5].setRotationPoint(12F, -6.5F, 0F);

		ammoModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 36
		ammoModel[6].setRotationPoint(-5F, -5.5F, 0F);

		ammoModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 37
		ammoModel[7].setRotationPoint(12F, -5.5F, 0F);

		ammoModel[8].addShapeBox(0F, 0F, -1F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 38
		ammoModel[8].setRotationPoint(-5F, -5.5F, 0F);

		ammoModel[9].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 39
		ammoModel[9].setRotationPoint(12F, -5.5F, 0F);

		ammoModel[10].addShapeBox(0F, 0F, -2F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 40
		ammoModel[10].setRotationPoint(-5F, -5.5F, 0F);

		ammoModel[11].addShapeBox(0F, 0F, -2F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 41
		ammoModel[11].setRotationPoint(12F, -5.5F, 0F);

		ammoModel[12].addShapeBox(0F, 0F, 1F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 42
		ammoModel[12].setRotationPoint(-5F, -5.5F, 0F);

		ammoModel[13].addShapeBox(0F, 0F, 1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 43
		ammoModel[13].setRotationPoint(12F, -5.5F, 0F);

		ammoModel[14].addShapeBox(0F, 0F, -1.5F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 44
		ammoModel[14].setRotationPoint(-5F, -4.5F, 0F);

		ammoModel[15].addShapeBox(0F, 0F, -1.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 45
		ammoModel[15].setRotationPoint(12F, -4.5F, 0F);

		ammoModel[16].addShapeBox(0F, 0F, -0.5F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 46
		ammoModel[16].setRotationPoint(-5F, -4.5F, 0F);

		ammoModel[17].addShapeBox(0F, 0F, -0.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 47
		ammoModel[17].setRotationPoint(12F, -4.5F, 0F);

		ammoModel[18].addShapeBox(0F, 0F, 0.5F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 48
		ammoModel[18].setRotationPoint(-5F, -4.5F, 0F);

		ammoModel[19].addShapeBox(0F, 0F, 0.5F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 49
		ammoModel[19].setRotationPoint(12F, -4.5F, 0F);

		ammoModel[20].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 50
		ammoModel[20].setRotationPoint(12F, -3.5F, 0F);

		ammoModel[21].addShapeBox(0F, 0F, -1F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 51
		ammoModel[21].setRotationPoint(-5F, -3.5F, 0F);

		ammoModel[22].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 52
		ammoModel[22].setRotationPoint(-5F, -3.5F, 0F);

		ammoModel[23].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 53
		ammoModel[23].setRotationPoint(12F, -3.5F, 0F);

		ammoModel[24].addShapeBox(0F, 0F, -1F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 54
		ammoModel[24].setRotationPoint(12F, -7.5F, 0F);

		ammoModel[25].addShapeBox(0F, 0F, -1F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 55
		ammoModel[25].setRotationPoint(-5F, -7.5F, 0F);

		ammoModel[26].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F,5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F, 5F, -0.3F, -0.3F); // Box 56
		ammoModel[26].setRotationPoint(-5F, -7.5F, 0F);

		ammoModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.2F, -0.2F); // Box 57
		ammoModel[27].setRotationPoint(12F, -7.5F, 0F);
	}
}