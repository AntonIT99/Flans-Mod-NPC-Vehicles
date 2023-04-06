//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: FalconerGlove
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBirdGun extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelBirdGun() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[8];
		defaultScopeModel = new ModelRendererTurbo[1];
		ammoModel = new ModelRendererTurbo[70];

		initgunModel_1();
		initdefaultScopeModel_1();
		initammoModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 2, 37, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 2, 24, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 2, 24, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 1
		gunModel[4] = new ModelRendererTurbo(this, 2, 24, textureX, textureY); // Box 2
		gunModel[5] = new ModelRendererTurbo(this, 2, 24, textureX, textureY); // Box 3
		gunModel[6] = new ModelRendererTurbo(this, 2, 24, textureX, textureY); // Box 4
		gunModel[7] = new ModelRendererTurbo(this, 2, 24, textureX, textureY); // Box 5

		gunModel[0].addShapeBox(-5F, -3F, -3F, 1, 6, 6, 0F,0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F); // Box 0
		gunModel[0].setRotationPoint(1F, 0F, 0F);

		gunModel[1].addShapeBox(-4F, -3F, -3F, 3, 6, 6, 0F,0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F); // Box 1
		gunModel[1].setRotationPoint(1F, 0F, 0F);

		gunModel[2].addShapeBox(-1F, -2.5F, -2.5F, 1, 5, 5, 0F,0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F); // Box 0
		gunModel[2].setRotationPoint(1F, 0F, 0F);

		gunModel[3].addShapeBox(-6F, -6F, -6F, 3, 12, 12, 0F,-2F, -3F, -3F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, -2F, -3F, -3F, -2F, -3F, -3F, 0F, -3.5F, -3.5F, 0F, -3.5F, -3.5F, -2F, -3F, -3F); // Box 1
		gunModel[3].setRotationPoint(-1F, 0F, 0F);

		gunModel[4].addShapeBox(0F, -2.5F, -2.5F, 1, 5, 3, 0F,0F, -.2F, -.2F, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.2F, 0F, 0F, -.2F, -.2F, 0F, -.4F, -.5F, 0F, -.4F, -.5F, 0F, -.2F, 0F); // Box 2
		gunModel[4].setRotationPoint(1F, 0F, 0F);

		gunModel[5].addShapeBox(1F, -2F, -2F, 1, 4, 2, 0F,0F, .1F, 0F, 0F, -.2F, -1F, -.5F, -.2F, .5F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, -.2F, -1F, -.5F, -.2F, .5F, 0F, .1F, 0F); // Box 3
		gunModel[5].setRotationPoint(1F, 0F, 0F);

		gunModel[6].addShapeBox(0F, -2.3F, 1F, 1, 1, 1, 0F,0F, 0F, .3F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, .3F); // Box 4
		gunModel[6].setRotationPoint(1F, 0F, 0F);

		gunModel[7].addShapeBox(0F, -1.3F, 1F, 1, 2, 1, 0F,0F, 0F, .3F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, .3F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, .3F); // Box 5
		gunModel[7].setRotationPoint(1F, 0F, 0F);
	}

	private void initdefaultScopeModel_1()
	{
		defaultScopeModel[0] = new ModelRendererTurbo(this, 2, 14, textureX, textureY); // Box 0

		defaultScopeModel[0].addShapeBox(-1.5F, -3F, -1.5F, 4, 6, 4, 0F,-1.5F, -1F, -1.5F, -1.5F, -1F, -1.5F, -1.5F, -1F, -1.5F, -1.5F, -1F, -1.5F, -1.5F, -1F, -1.5F, -1.5F, -1F, -1.5F, -1.5F, -1F, -1.5F, -1.5F, -1F, -1.5F); // Box 0
		defaultScopeModel[0].setRotationPoint(1F, 0F, 0F);
	}

	private void initammoModel_1()
	{
		ammoModel[0] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 1
		ammoModel[1] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 3
		ammoModel[2] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 4
		ammoModel[3] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 5
		ammoModel[4] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 6
		ammoModel[5] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 7
		ammoModel[6] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 8
		ammoModel[7] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 9
		ammoModel[8] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 10
		ammoModel[9] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 11
		ammoModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 12
		ammoModel[11] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 13
		ammoModel[12] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 14
		ammoModel[13] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 16
		ammoModel[14] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 17
		ammoModel[15] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 18
		ammoModel[16] = new ModelRendererTurbo(this, 17, 4, textureX, textureY); // Box 19
		ammoModel[17] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 20
		ammoModel[18] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 21
		ammoModel[19] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 22
		ammoModel[20] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 23
		ammoModel[21] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 24
		ammoModel[22] = new ModelRendererTurbo(this, 17, 8, textureX, textureY); // Box 25
		ammoModel[23] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 26
		ammoModel[24] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 27
		ammoModel[25] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 28
		ammoModel[26] = new ModelRendererTurbo(this, 7, 9, textureX, textureY); // Box 31
		ammoModel[27] = new ModelRendererTurbo(this, 39, 32, textureX, textureY); // Box 34
		ammoModel[28] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 35
		ammoModel[29] = new ModelRendererTurbo(this, 34, 32, textureX, textureY); // Box 36
		ammoModel[30] = new ModelRendererTurbo(this, 47, 32, textureX, textureY); // Box 38
		ammoModel[31] = new ModelRendererTurbo(this, 39, 25, textureX, textureY); // Box 42
		ammoModel[32] = new ModelRendererTurbo(this, 34, 25, textureX, textureY); // Box 43
		ammoModel[33] = new ModelRendererTurbo(this, 47, 25, textureX, textureY); // Box 47
		ammoModel[34] = new ModelRendererTurbo(this, 39, 28, textureX, textureY); // Box 48
		ammoModel[35] = new ModelRendererTurbo(this, 34, 28, textureX, textureY); // Box 49
		ammoModel[36] = new ModelRendererTurbo(this, 47, 28, textureX, textureY); // Box 53
		ammoModel[37] = new ModelRendererTurbo(this, 34, 32, textureX, textureY); // Box 54
		ammoModel[38] = new ModelRendererTurbo(this, 34, 28, textureX, textureY); // Box 55
		ammoModel[39] = new ModelRendererTurbo(this, 39, 28, textureX, textureY); // Box 56
		ammoModel[40] = new ModelRendererTurbo(this, 34, 25, textureX, textureY); // Box 57
		ammoModel[41] = new ModelRendererTurbo(this, 39, 25, textureX, textureY); // Box 58
		ammoModel[42] = new ModelRendererTurbo(this, 47, 25, textureX, textureY); // Box 59
		ammoModel[43] = new ModelRendererTurbo(this, 47, 28, textureX, textureY); // Box 60
		ammoModel[44] = new ModelRendererTurbo(this, 47, 32, textureX, textureY); // Box 61
		ammoModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 62
		ammoModel[46] = new ModelRendererTurbo(this, 22, 13, textureX, textureY); // Box 63
		ammoModel[47] = new ModelRendererTurbo(this, 22, 13, textureX, textureY); // Box 64
		ammoModel[48] = new ModelRendererTurbo(this, 24, 18, textureX, textureY); // Box 65
		ammoModel[49] = new ModelRendererTurbo(this, 24, 18, textureX, textureY); // Box 66
		ammoModel[50] = new ModelRendererTurbo(this, 24, 18, textureX, textureY); // Box 67
		ammoModel[51] = new ModelRendererTurbo(this, 25, 21, textureX, textureY); // Box 68
		ammoModel[52] = new ModelRendererTurbo(this, 20, 25, textureX, textureY); // Box 69
		ammoModel[53] = new ModelRendererTurbo(this, 25, 21, textureX, textureY); // Box 70
		ammoModel[54] = new ModelRendererTurbo(this, 25, 24, textureX, textureY); // Box 73
		ammoModel[55] = new ModelRendererTurbo(this, 25, 24, textureX, textureY); // Box 74
		ammoModel[56] = new ModelRendererTurbo(this, 25, 31, textureX, textureY); // Box 75
		ammoModel[57] = new ModelRendererTurbo(this, 25, 28, textureX, textureY); // Box 76
		ammoModel[58] = new ModelRendererTurbo(this, 19, 18, textureX, textureY); // Box 79
		ammoModel[59] = new ModelRendererTurbo(this, 20, 21, textureX, textureY); // Box 80
		ammoModel[60] = new ModelRendererTurbo(this, 32, 1, textureX, textureY); // Box 83
		ammoModel[61] = new ModelRendererTurbo(this, 38, 1, textureX, textureY); // Box 84
		ammoModel[62] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 85
		ammoModel[63] = new ModelRendererTurbo(this, 32, 9, textureX, textureY); // Box 88
		ammoModel[64] = new ModelRendererTurbo(this, 32, 17, textureX, textureY); // Box 89
		ammoModel[65] = new ModelRendererTurbo(this, 38, 1, textureX, textureY); // Box 96
		ammoModel[66] = new ModelRendererTurbo(this, 32, 9, textureX, textureY); // Box 98
		ammoModel[67] = new ModelRendererTurbo(this, 32, 17, textureX, textureY); // Box 99
		ammoModel[68] = new ModelRendererTurbo(this, 32, 1, textureX, textureY); // Box 100
		ammoModel[69] = new ModelRendererTurbo(this, 46, 1, textureX, textureY); // Box 0

		ammoModel[0].addShapeBox(0F, -3F, -2F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 1
		ammoModel[0].setRotationPoint(1F, 0F, 0F);

		ammoModel[1].addShapeBox(0F, -3F, -3F, 1, 1, 1, 0F,-.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 3
		ammoModel[1].setRotationPoint(1F, 0F, 0F);

		ammoModel[2].addShapeBox(0F, -3F, -1F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 4
		ammoModel[2].setRotationPoint(1F, 0F, 0F);

		ammoModel[3].addShapeBox(0F, -2F, -3F, 1, 1, 1, 0F,-.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 5
		ammoModel[3].setRotationPoint(1F, 0F, 0F);

		ammoModel[4].addShapeBox(0F, -3F, 0F, 1, 1, 1, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F); // Box 6
		ammoModel[4].setRotationPoint(1F, 0F, 0F);

		ammoModel[5].addShapeBox(0.5F, -3F, 0F, 1, 1, 1, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F); // Box 7
		ammoModel[5].setRotationPoint(1F, 0F, 0F);

		ammoModel[6].addShapeBox(0.5F, -3F, -1F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 8
		ammoModel[6].setRotationPoint(1F, 0F, 0F);

		ammoModel[7].addShapeBox(-0.5F, -3F, 0F, 1, 1, 1, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F); // Box 9
		ammoModel[7].setRotationPoint(1F, 0F, 0F);

		ammoModel[8].addShapeBox(-0.5F, -3F, -1F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 10
		ammoModel[8].setRotationPoint(1F, 0F, 0F);

		ammoModel[9].addShapeBox(0F, -4F, -2F, 1, 1, 1, 0F,-.5F, 0F, .5F, -.3F, 0F, .5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 11
		ammoModel[9].setRotationPoint(1F, 0F, 0F);

		ammoModel[10].addShapeBox(0F, -4F, -2F, 1, 1, 1, 0F,-.3F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, -.3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 12
		ammoModel[10].setRotationPoint(1F, 0F, 0F);

		ammoModel[11].addShapeBox(0F, -5F, -2.5F, 1, 1, 1, 0F,-.5F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 13
		ammoModel[11].setRotationPoint(1F, 0F, 0F);

		ammoModel[12].addShapeBox(0F, -5F, -2.5F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 14
		ammoModel[12].setRotationPoint(1F, 0F, 0F);

		ammoModel[13].addShapeBox(-2F, -4.5F, -2F, 1, 1, 1, 0F,-.3F, 0F, .5F, -.5F, 0F, .5F, -.5F, 0F, -.5F, 0F, 0F, -.5F, -.3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 16
		ammoModel[13].setRotationPoint(1F, 0F, 0F);

		ammoModel[14].addShapeBox(-2F, -4.5F, -2F, 1, 1, 1, 0F,-.5F, 0F, .5F, -.3F, 0F, .5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 17
		ammoModel[14].setRotationPoint(1F, 0F, 0F);

		ammoModel[15].addShapeBox(-2F, -5.5F, -2.5F, 1, 1, 1, 0F,-.5F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.3F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F); // Box 18
		ammoModel[15].setRotationPoint(1F, 0F, 0F);

		ammoModel[16].addShapeBox(-2F, -5.5F, -2.5F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F); // Box 19
		ammoModel[16].setRotationPoint(1F, 0F, 0F);

		ammoModel[17].addShapeBox(-2F, -3.5F, -2F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F); // Box 20
		ammoModel[17].setRotationPoint(1F, 0F, 0F);

		ammoModel[18].addShapeBox(-2F, -3.5F, -3F, 1, 1, 1, 0F,-.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 21
		ammoModel[18].setRotationPoint(1F, 0F, 0F);

		ammoModel[19].addShapeBox(-2F, -2.5F, -3F, 1, 1, 1, 0F,-.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 22
		ammoModel[19].setRotationPoint(1F, 0F, 0F);

		ammoModel[20].addShapeBox(-1.5F, -3.5F, -1F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 23
		ammoModel[20].setRotationPoint(1F, 0F, 0F);

		ammoModel[21].addShapeBox(-2F, -3.5F, -1F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 24
		ammoModel[21].setRotationPoint(1F, 0F, 0F);

		ammoModel[22].addShapeBox(-2.5F, -3.5F, -1F, 1, 1, 1, 0F,-.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 25
		ammoModel[22].setRotationPoint(1F, 0F, 0F);

		ammoModel[23].addShapeBox(-2.5F, -3.5F, 0F, 1, 1, 1, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F); // Box 26
		ammoModel[23].setRotationPoint(1F, 0F, 0F);

		ammoModel[24].addShapeBox(-2F, -3.5F, 0F, 1, 1, 1, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F); // Box 27
		ammoModel[24].setRotationPoint(1F, 0F, 0F);

		ammoModel[25].addShapeBox(-1.5F, -3.5F, 0F, 1, 1, 1, 0F,-.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, .5F, 0F, -.3F, .5F, 0F); // Box 28
		ammoModel[25].setRotationPoint(1F, 0F, 0F);

		ammoModel[26].addShapeBox(-2F, -5.5F, -2.5F, 3, 1, 1, 0F,.1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .2F, 0F, .4F, .2F, 0F, .4F, .2F, 0F, .4F, .2F, 0F, .4F); // Box 31
		ammoModel[26].setRotationPoint(1F, 0F, 0F);

		ammoModel[27].addShapeBox(-1.5F, -6F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		ammoModel[27].setRotationPoint(1F, 0F, 0F);

		ammoModel[28].addShapeBox(-1.5F, -6F, -3F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		ammoModel[28].setRotationPoint(1F, 0F, 0F);

		ammoModel[29].addShapeBox(0.5F, -6F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F, -.3F, 0F, 0F, 0F); // Box 36
		ammoModel[29].setRotationPoint(1F, 0F, 0F);

		ammoModel[30].addShapeBox(-2.5F, -6F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.3F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -.2F); // Box 38
		ammoModel[30].setRotationPoint(1F, 0F, 0F);

		ammoModel[31].addShapeBox(-1.5F, -9F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 0F, .4F); // Box 42
		ammoModel[31].setRotationPoint(1F, 0F, 0F);

		ammoModel[32].addShapeBox(0.5F, -9F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, -.2F, -.2F, 0F, -.5F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, 0F, 0F, .4F); // Box 43
		ammoModel[32].setRotationPoint(1F, 0F, 0F);

		ammoModel[33].addShapeBox(-2.5F, -9F, -2F, 1, 1, 1, 0F,-.2F, -.2F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, -.5F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, -.3F, 0F, -.2F); // Box 47
		ammoModel[33].setRotationPoint(1F, 0F, 0F);

		ammoModel[34].addShapeBox(-1.5F, -8F, -2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, 0F, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 48
		ammoModel[34].setRotationPoint(1F, 0F, 0F);

		ammoModel[35].addShapeBox(0.5F, -8F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, 0F, 0F, .4F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, 0F, 0F, .2F); // Box 49
		ammoModel[35].setRotationPoint(1F, 0F, 0F);

		ammoModel[36].addShapeBox(-2.5F, -8F, -2F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.3F, 0F, -.2F); // Box 53
		ammoModel[36].setRotationPoint(1F, 0F, 0F);

		ammoModel[37].addShapeBox(0.5F, -6F, -3F, 1, 1, 1, 0F,0F, 0F, .2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -.3F, -.2F, 0F, 0F, 0F, 0F, 0F); // Box 54
		ammoModel[37].setRotationPoint(1F, 0F, 0F);

		ammoModel[38].addShapeBox(0.5F, -8F, -3F, 1, 2, 1, 0F,0F, 0F, .2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		ammoModel[38].setRotationPoint(1F, 0F, 0F);

		ammoModel[39].addShapeBox(-1.5F, -8F, -3F, 2, 2, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		ammoModel[39].setRotationPoint(1F, 0F, 0F);

		ammoModel[40].addShapeBox(0.5F, -9F, -3F, 1, 1, 1, 0F,0F, -.2F, 0F, -.5F, -.2F, -.2F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, -.3F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		ammoModel[40].setRotationPoint(1F, 0F, 0F);

		ammoModel[41].addShapeBox(-1.5F, -9F, -3F, 2, 1, 1, 0F,0F, -.2F, 0F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		ammoModel[41].setRotationPoint(1F, 0F, 0F);

		ammoModel[42].addShapeBox(-2.5F, -9F, -3F, 1, 1, 1, 0F,-.5F, -.2F, -.2F, 0F, -.2F, 0F, 0F, 0F, 0F, -.2F, -.2F, 0F, -.3F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		ammoModel[42].setRotationPoint(1F, 0F, 0F);

		ammoModel[43].addShapeBox(-2.5F, -8F, -3F, 1, 2, 1, 0F,-.3F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		ammoModel[43].setRotationPoint(1F, 0F, 0F);

		ammoModel[44].addShapeBox(-2.5F, -6F, -3F, 1, 1, 1, 0F,-.3F, 0F, -.2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, 0F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 0F); // Box 61
		ammoModel[44].setRotationPoint(1F, 0F, 0F);

		ammoModel[45].addShapeBox(-3.5F, -6F, -4F, 6, 6, 1, 0F,-2F, 0F, -.8F, -2F, 0F, -.8F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, -.8F, -1F, -2F, -.8F); // Box 62
		ammoModel[45].setRotationPoint(1F, 0F, 0F);

		ammoModel[46].addShapeBox(-1.5F, -10.8F, -3F, 1, 2, 2, 0F,0F, -1.5F, -.5F, 0F, -1F, -.5F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		ammoModel[46].setRotationPoint(1F, 0F, 0F);

		ammoModel[47].addShapeBox(-0.5F, -10.8F, -3F, 1, 2, 2, 0F,0F, -1F, -.5F, 0F, -1.5F, -.5F, 0F, -1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		ammoModel[47].setRotationPoint(1F, 0F, 0F);

		ammoModel[48].addShapeBox(-1.5F, -9.8F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 65
		ammoModel[48].setRotationPoint(1F, 0F, 0F);

		ammoModel[49].addShapeBox(-1.5F, -10.8F, -1F, 2, 1, 1, 0F,-1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F); // Box 66
		ammoModel[49].setRotationPoint(1F, 0F, 0F);

		ammoModel[50].addShapeBox(-1.5F, -8.8F, -1F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F, -1F, -.5F, 0F); // Box 67
		ammoModel[50].setRotationPoint(1F, 0F, 0F);

		ammoModel[51].addShapeBox(-1F, -9.8F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 68
		ammoModel[51].setRotationPoint(1F, 0F, 0F);

		ammoModel[52].addShapeBox(-1F, -10.8F, 0F, 1, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 69
		ammoModel[52].setRotationPoint(1F, 0F, 0F);

		ammoModel[53].addShapeBox(-1F, -8.8F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F); // Box 70
		ammoModel[53].setRotationPoint(1F, 0F, 0F);

		ammoModel[54].addShapeBox(-1F, -9.8F, 1F, 1, 1, 1, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.1F, -.1F, -.5F, -.1F, -.1F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F); // Box 73
		ammoModel[54].setRotationPoint(1F, 0F, 0F);

		ammoModel[55].addShapeBox(-1F, -9.8F, 1F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, -.5F); // Box 74
		ammoModel[55].setRotationPoint(1F, 0F, 0F);

		ammoModel[56].addShapeBox(-1F, -9.8F, 1.5F, 1, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, -.3F, -.5F, -.5F, -.3F); // Box 75
		ammoModel[56].setRotationPoint(1F, 0F, 0F);

		ammoModel[57].addShapeBox(-1F, -9.8F, 1.5F, 1, 1, 1, 0F,-.5F, -.1F, -.4F, -.5F, -.1F, -.4F, -.5F, -.7F, 0F, -.5F, -.7F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F); // Box 76
		ammoModel[57].setRotationPoint(1F, 0F, 0F);

		ammoModel[58].addShapeBox(-1F, -9.8F, 0F, 1, 1, 1, 0F,.01F, 0F, 0F, .01F, 0F, 0F, .01F, -.5F, -.2F, .01F, -.5F, -.2F, .01F, -.8F, -.2F, .01F, -.8F, -.2F, .01F, -.5F, -.2F, .01F, -.5F, -.2F); // Box 79
		ammoModel[58].setRotationPoint(1F, 0F, 0F);

		ammoModel[59].addShapeBox(-1F, -11.3F, -1F, 1, 1, 1, 0F,-.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 80
		ammoModel[59].setRotationPoint(1F, 0F, 0F);

		ammoModel[60].addShapeBox(0.5F, -9F, -3.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -.4F, -.2F, 0F, .4F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.4F, .2F, 0F, .4F, .2F, 0F); // Box 83
		ammoModel[60].setRotationPoint(1F, 0F, 0F);

		ammoModel[61].addShapeBox(0.5F, -9F, -5.5F, 1, 3, 2, 0F,-2.5F, 3F, 0F, 2.5F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1F, 0F, 2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		ammoModel[61].setRotationPoint(1F, 0F, 0F);

		ammoModel[62].addShapeBox(3F, -12F, -6.5F, 1, 5, 1, 0F,-.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		ammoModel[62].setRotationPoint(1F, 0F, 0F);

		ammoModel[63].addShapeBox(4F, -12F, -6.5F, 5, 5, 1, 0F,0F, -.5F, 0F, 0F, -.5F, -1F, 0F, 0F, 1F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 88
		ammoModel[63].setRotationPoint(1F, 0F, 0F);

		ammoModel[64].addShapeBox(9F, -11.5F, -5.5F, 5, 5, 1, 0F,0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, 3F, 0F, .5F, 0F, 0F, .5F, 0F, -3F, 0F, -1F, -3F, 0F, 1F, 0F, .5F, 0F); // Box 89
		ammoModel[64].setRotationPoint(1F, 0F, 0F);

		ammoModel[65].addShapeBox(-2.5F, -9F, -5.5F, 1, 3, 2, 0F,2.5F, 3.5F, 0F, -2.5F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		ammoModel[65].setRotationPoint(1F, 0F, 0F);

		ammoModel[66].addShapeBox(-10F, -12F, -6.5F, 5, 5, 1, 0F,0F, -.5F, -1F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 1F, 0F, 1F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 98
		ammoModel[66].setRotationPoint(1F, 0F, 0F);

		ammoModel[67].addShapeBox(-15F, -11.5F, -5.5F, 5, 5, 1, 0F,0F, -1F, -3F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -1F, 3F, -3F, 0F, -1F, 0F, .5F, 0F, 0F, .5F, 0F, -3F, 0F, 1F); // Box 99
		ammoModel[67].setRotationPoint(1F, 0F, 0F);

		ammoModel[68].addShapeBox(-2.5F, -9F, -3.5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, .4F, -.2F, 0F, -.4F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .4F, .2F, 0F, -.4F, .2F, 0F); // Box 100
		ammoModel[68].setRotationPoint(1F, 0F, 0F);

		ammoModel[69].addShapeBox(-5F, -12F, -6.5F, 1, 5, 1, 0F,0F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		ammoModel[69].setRotationPoint(1F, 0F, 0F);
	}
}