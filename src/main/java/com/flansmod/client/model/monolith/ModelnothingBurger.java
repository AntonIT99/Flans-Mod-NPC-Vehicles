//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelnothingBurger extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelnothingBurger() //Same as Filename
	{
		headModel = new ModelRendererTurbo[32];
		bodyModel = new ModelRendererTurbo[35];

		initheadModel_1();
		initbodyModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 79, 60, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 79, 71, textureX, textureY); // Box 2
		headModel[2] = new ModelRendererTurbo(this, 79, 71, textureX, textureY); // Box 3
		headModel[3] = new ModelRendererTurbo(this, 66, 60, textureX, textureY); // Box 4
		headModel[4] = new ModelRendererTurbo(this, 79, 71, textureX, textureY); // Box 5
		headModel[5] = new ModelRendererTurbo(this, 79, 71, textureX, textureY); // Box 6
		headModel[6] = new ModelRendererTurbo(this, 66, 60, textureX, textureY); // Box 7
		headModel[7] = new ModelRendererTurbo(this, 66, 60, textureX, textureY); // Box 8
		headModel[8] = new ModelRendererTurbo(this, 66, 60, textureX, textureY); // Box 9
		headModel[9] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 10
		headModel[10] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 11
		headModel[11] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 12
		headModel[12] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 13
		headModel[13] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 16
		headModel[14] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 17
		headModel[15] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 18
		headModel[16] = new ModelRendererTurbo(this, 66, 60, textureX, textureY); // Box 19
		headModel[17] = new ModelRendererTurbo(this, 79, 71, textureX, textureY); // Box 20
		headModel[18] = new ModelRendererTurbo(this, 66, 60, textureX, textureY); // Box 21
		headModel[19] = new ModelRendererTurbo(this, 79, 71, textureX, textureY); // Box 22
		headModel[20] = new ModelRendererTurbo(this, 66, 60, textureX, textureY); // Box 23
		headModel[21] = new ModelRendererTurbo(this, 79, 71, textureX, textureY); // Box 24
		headModel[22] = new ModelRendererTurbo(this, 79, 60, textureX, textureY); // Box 25
		headModel[23] = new ModelRendererTurbo(this, 66, 60, textureX, textureY); // Box 26
		headModel[24] = new ModelRendererTurbo(this, 79, 71, textureX, textureY); // Box 27
		headModel[25] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 28
		headModel[26] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 29
		headModel[27] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 30
		headModel[28] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 31
		headModel[29] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 32
		headModel[30] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 33
		headModel[31] = new ModelRendererTurbo(this, 69, 79, textureX, textureY); // Box 34

		headModel[0].addShapeBox(5F, -9F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(7F, -9F, -1F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 2
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(5F, -10F, -1F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(7F, -10F, -1F, 1, 1, 4, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 4
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(5F, -7F, -1F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 5
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(4F, -9F, -1F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 6
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(4F, -10F, -1F, 1, 1, 4, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 7
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4F, -7F, -1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 8
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(7F, -7F, -1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 9
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(5.5F, -11F, 0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 10
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(3F, -8.5F, 0.5F, 6, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 11
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(5.5F, -8.5F, -2F, 1, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 12
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3.45F, -8.5F, 0.3F, 5, 1, 1, 0F,0F, -2F, -3F, -.5F, 2F, 2F, 0F, 2F, -2.5F, -.5F, -2F, 2.5F, 0F, 2F, -3F, -.5F, -2F, 2F, 0F, -2F, -2.5F, -.5F, 2F, 2.5F); // Box 13
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(5.15F, -8.5F, -1.5F, 1, 1, 5, 0F,2F, 2F, -0.5F, -2.5F, 2F, 0F, 2.5F, -2F, -0.5F, -3F, -2F, 0F, 2F, -2F, -0.5F, -2.5F, -2F, 0F, 2.5F, 2F, -0.5F, -3F, 2F, 0F); // Box 16
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.5F, -8.5F, 1F, 5, 1, 1, 0F,0F, 2F, -2.5F, -0.5F, -2F, 2.5F, 0F, -2F, -3F, -0.5F, 2F, 2F, 0F, -2F, -2.5F, -0.5F, 2F, 2.5F, 0F, 2F, -3F, -0.5F, -2F, 2F); // Box 17
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(5.6F, -8.5F, -1.5F, 1, 1, 5, 0F,2.5F, -2F, -0.5F, -3F, -2F, 0F, 2F, 2F, -0.5F, -2.5F, 2F, 0F, 2.5F, 2F, -0.5F, -3F, 2F, 0F, 2F, -2F, -0.5F, -2.5F, -2F, 0F); // Box 18
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-5F, -7F, -1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Box 19
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-5F, -9F, -1F, 1, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 20
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5F, -10F, -1F, 1, 1, 4, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 21
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-7F, -10F, -1F, 2, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-8F, -10F, -1F, 1, 1, 4, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 23
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-8F, -9F, -1F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 24
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-7F, -9F, -1F, 2, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-8F, -7F, -1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Box 26
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-7F, -7F, -1F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 27
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-9F, -8.5F, 0.5F, 6, 1, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 28
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-6.5F, -8.5F, -2F, 1, 1, 6, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 29
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-8.55F, -8.5F, 0.3F, 5, 1, 1, 0F,0F, -2F, -3F, -.5F, 2F, 2F, 0F, 2F, -2.5F, -.5F, -2F, 2.5F, 0F, 2F, -3F, -.5F, -2F, 2F, 0F, -2F, -2.5F, -.5F, 2F, 2.5F); // Box 30
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-6.85F, -8.5F, -1.5F, 1, 1, 5, 0F,2F, 2F, -0.5F, -2.5F, 2F, 0F, 2.5F, -2F, -0.5F, -3F, -2F, 0F, 2F, -2F, -0.5F, -2.5F, -2F, 0F, 2.5F, 2F, -0.5F, -3F, 2F, 0F); // Box 31
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-6.5F, -11F, 0.5F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 32
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-6.4F, -8.5F, -1.5F, 1, 1, 5, 0F,2.5F, -2F, -0.5F, -3F, -2F, 0F, 2F, 2F, -0.5F, -2.5F, 2F, 0F, 2.5F, 2F, -0.5F, -3F, 2F, 0F, 2F, -2F, -0.5F, -2.5F, -2F, 0F); // Box 33
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-8.5F, -8.5F, 1F, 5, 1, 1, 0F,0F, 2F, -2.5F, -0.5F, -2F, 2.5F, 0F, -2F, -3F, -0.5F, 2F, 2F, 0F, -2F, -2.5F, -0.5F, 2F, 2.5F, 0F, 2F, -3F, -0.5F, -2F, 2F); // Box 34
		headModel[31].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 4, 45, textureX, textureY); // Box 6
		bodyModel[1] = new ModelRendererTurbo(this, 3, 74, textureX, textureY); // Box 7
		bodyModel[2] = new ModelRendererTurbo(this, 3, 83, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 3, 92, textureX, textureY); // Box 9
		bodyModel[4] = new ModelRendererTurbo(this, 14, 45, textureX, textureY); // Box 11
		bodyModel[5] = new ModelRendererTurbo(this, 14, 42, textureX, textureY); // Box 12
		bodyModel[6] = new ModelRendererTurbo(this, 5, 41, textureX, textureY); // Box 13
		bodyModel[7] = new ModelRendererTurbo(this, 4, 52, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 5, 58, textureX, textureY); // Box 17
		bodyModel[9] = new ModelRendererTurbo(this, 5, 68, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 25, 56, textureX, textureY); // Box 20
		bodyModel[11] = new ModelRendererTurbo(this, 25, 66, textureX, textureY); // Box 21
		bodyModel[12] = new ModelRendererTurbo(this, 24, 99, textureX, textureY); // Box 22
		bodyModel[13] = new ModelRendererTurbo(this, 3, 99, textureX, textureY); // Box 23
		bodyModel[14] = new ModelRendererTurbo(this, 4, 104, textureX, textureY); // Box 24
		bodyModel[15] = new ModelRendererTurbo(this, 4, 111, textureX, textureY); // Box 26
		bodyModel[16] = new ModelRendererTurbo(this, 25, 104, textureX, textureY); // Box 27
		bodyModel[17] = new ModelRendererTurbo(this, 25, 111, textureX, textureY); // Box 28
		bodyModel[18] = new ModelRendererTurbo(this, 32, 84, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 32, 79, textureX, textureY); // Box 1
		bodyModel[20] = new ModelRendererTurbo(this, 32, 73, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 96, 61, textureX, textureY); // Box 36
		bodyModel[22] = new ModelRendererTurbo(this, 96, 67, textureX, textureY); // Box 37
		bodyModel[23] = new ModelRendererTurbo(this, 96, 73, textureX, textureY); // Box 38
		bodyModel[24] = new ModelRendererTurbo(this, 96, 80, textureX, textureY); // Box 39
		bodyModel[25] = new ModelRendererTurbo(this, 107, 61, textureX, textureY); // Box 40
		bodyModel[26] = new ModelRendererTurbo(this, 107, 73, textureX, textureY); // Box 41
		bodyModel[27] = new ModelRendererTurbo(this, 107, 83, textureX, textureY); // Box 42
		bodyModel[28] = new ModelRendererTurbo(this, 96, 61, textureX, textureY); // Box 43
		bodyModel[29] = new ModelRendererTurbo(this, 96, 67, textureX, textureY); // Box 44
		bodyModel[30] = new ModelRendererTurbo(this, 96, 73, textureX, textureY); // Box 45
		bodyModel[31] = new ModelRendererTurbo(this, 96, 80, textureX, textureY); // Box 46
		bodyModel[32] = new ModelRendererTurbo(this, 107, 61, textureX, textureY); // Box 47
		bodyModel[33] = new ModelRendererTurbo(this, 107, 73, textureX, textureY); // Box 48
		bodyModel[34] = new ModelRendererTurbo(this, 107, 83, textureX, textureY); // Box 49

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 3, 1, 1, 0F,.1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F); // Box 6
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 5F, -2.5F, 8, 2, 5, 0F,.1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, -.2F, .1F, 0F, -.2F, .1F, 0F, -.1F, .1F, 0F, -.1F, .1F, 0F, -.3F, .1F, 0F, -.3F); // Box 7
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 7F, -2.5F, 8, 2, 5, 0F,.1F, 0F, -.1F, .1F, 0F, -.1F, .1F, 0F, -.3F, .1F, 0F, -.3F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 8
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 9F, -2.5F, 8, 1, 5, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 9
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(1F, 0F, -2F, 3, 1, 1, 0F,.1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F); // Box 11
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, -2F, 1, 1, 1, 0F,-1F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, -1F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // Box 12
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-1F, 0F, -2F, 1, 1, 1, 0F,0F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, .5F, 0F, 0.5F, .5F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 13
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 0F, -1F, 8, 1, 3, 0F,.1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .2F, .1F, 0F, .4F, .1F, 0F, .4F); // Box 14
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 1F, -3F, 8, 3, 1, 0F,.1F, 0F, -.8F, .1F, 0F, -.8F, .1F, 0F, 0F, .1F, 0F, 0F, -.4F, -.5F, .6F, -.4F, -.5F, .6F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 17
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(-4F, 4F, -3F, 8, 1, 1, 0F,-.4F, .5F, .6F, -.4F, .5F, .6F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, -.4F, .1F, 0F, -.4F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 18
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 1F, -2F, 8, 3, 4, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .4F, .1F, 0F, .4F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .4F, .1F, 0F, .4F); // Box 20
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 4F, -2F, 8, 1, 4, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .4F, .1F, 0F, .4F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .3F, .1F, 0F, .3F); // Box 21
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 10F, 1.5F, 8, 2, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 10F, -2.5F, 8, 2, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .2F, .1F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F); // Box 23
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 12F, -2.5F, 8, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.7F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, -.5F, -.7F, 0F, -.5F); // Box 24
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3.5F, 16F, -2.5F, 7, 5, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, -.5F, -.2F, 0F, -.5F, -.8F, 0F, 0F, -.8F, 0F, 0F, -.8F, 0F, -.5F, -.8F, 0F, -.5F); // Box 26
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 12F, 1.5F, 8, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, 0F, -0.7F, 0F, 0F); // Box 27
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-3.5F, 16F, 1.5F, 7, 5, 1, 0F,-0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, 0F, -0.8F, 0F, 0F); // Box 28
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 10F, 2.5F, 8, 2, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .3F, .1F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 0
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 9F, 2.5F, 8, 1, 1, 0F,.1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, .3F, .1F, 0F, .3F); // Box 1
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 7F, 2.5F, 8, 2, 1, 0F,.1F, 0F, .3F, .1F, 0F, .3F, .1F, 0F, -1.3F, .1F, 0F, -1.3F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F, .1F, 0F, 0F); // Box 2
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2F, 1F, 2F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2F, 2F, 0F, -2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -2F, -1F, 0F); // Box 36
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(4F, -1F, 5F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 37
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(5F, -2F, 5F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 3F, -1F, 0F, 3F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 1F, 1F, 0F, 0F, 0F); // Box 38
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(8F, -5F, 6F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 39
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(9F, -5F, 6F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, -1F, .5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 40
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(12F, -4F, 5.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, -1F, .5F, 0F, -1F, -.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 1F, 0F); // Box 41
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(13F, -3F, 5F, 3, 6, 1, 0F,0F, 0F, 0F, 0F, -4F, 3F, 0F, -4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 4F, 1F, 1F, -4F, 0F, 0F, 0F); // Box 42
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3F, 1F, 2F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 2F, 0F, 2F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 2F, -1F, 0F); // Box 43
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-5F, -1F, 5F, 1, 3, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 44
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-8F, -2F, 5F, 3, 4, 1, 0F,0F, 3F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 3F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Box 45
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-9F, -5F, 6F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-12F, -5F, 6F, 3, 8, 1, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 47
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-13F, -4F, 5.5F, 1, 7, 1, 0F,0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F); // Box 48
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-16F, -3F, 5F, 3, 6, 1, 0F,0F, -4F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -3F, 1F, 1F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, -4F); // Box 49
		bodyModel[34].setRotationPoint(0F, 0F, 0F);
	}
}