//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRussianHalfMask extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelRussianHalfMask() //Same as Filename
	{
		headModel = new ModelRendererTurbo[47];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box19
		headModel[3] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Import Box21
		headModel[4] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Import Box24
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box31
		headModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Import Box32
		headModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box33
		headModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Import Box34
		headModel[9] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Import Box35
		headModel[10] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box45
		headModel[11] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Import Box46
		headModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 34
		headModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 34
		headModel[14] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 34
		headModel[15] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 34
		headModel[16] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 34
		headModel[17] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 34
		headModel[18] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 34
		headModel[19] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 34
		headModel[20] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 32
		headModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 36
		headModel[22] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 37
		headModel[23] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 18
		headModel[24] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 1
		headModel[25] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 50
		headModel[26] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 29
		headModel[27] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 30
		headModel[28] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 22
		headModel[29] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 59
		headModel[30] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 60
		headModel[31] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 61
		headModel[32] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 63
		headModel[33] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 64
		headModel[34] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 65
		headModel[35] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 66
		headModel[36] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 67
		headModel[37] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 68
		headModel[38] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 69
		headModel[39] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 70
		headModel[40] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 71
		headModel[41] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 72
		headModel[42] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 73
		headModel[43] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 74
		headModel[44] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 75
		headModel[45] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 76
		headModel[46] = new ModelRendererTurbo(this, 25, 31, textureX, textureY); // Box 77

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.3F, 0.8F, 0.1F, 0.3F, 0.8F, 0.1F, 0.3F, 0.3F, 1F, 0.3F, 0.3F, 1F, 0.9F, -0.5F, 0.7F, 0.9F, -0.5F, 0.7F, 0.9F, -0.5F, 1.2F, 0.9F, -0.5F, 1.2F); // Import Box18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.8F, -4F, 8, 1, 8, 0F,-1.8F, 0.2F, -2.3F, -1.8F, 0.2F, -2.3F, -1.8F, -0.1F, -0.6F, -1.8F, -0.1F, -0.6F, 0.3F, 1F, 0.1F, 0.3F, 1F, 0.1F, 0.3F, 1.5F, 1F, 0.3F, 1.5F, 1F); // Import Box22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 1, 2, 8, 0F,1F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, -0.5F, 1.4F, 1F, -0.5F, 1.4F, 1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1.2F, 1F, 0F, 1.2F); // Import Box19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3F, -6F, -4F, 6, 2, 8, 0F,1F, 0F, 0.8F, 1F, 0F, 0.8F, 1F, -0.5F, 1.4F, 1F, -0.5F, 1.4F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, 0F, 1.2F, 1F, 0F, 1.2F); // Import Box21
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5.4F, -4F, -5F, 1, 3, 10, 0F,-0.4F, 0.5F, -1F, -0.4F, 0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box24
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5.4F, -1F, -2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Import Box31
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5.4F, -1F, -5F, 1, 1, 3, 0F,-0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.5F, -0.4F, 0F, -1.5F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Import Box32
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5.4F, -1F, 2F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box33
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -4F, 4.5F, 10, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F, 0F, 0.3F, -0.4F); // Import Box34
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, 1.3F, 4.5F, 10, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Import Box35
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5.4F, 0F, 1.9F, 1, 1, 3, 0F,1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Import Box45
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5.4F, 1.3F, 1.9F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F); // Import Box46
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -3.8F, -4.5F, 1, 2, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0.3F, -0.5F, 0.2F, 0.3F, -0.5F); // Box 34
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -4.5F, -3.5F, 2, 1, 1, 0F,0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, 2F, -0.5F, 1.5F, -0.5F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 34
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1F, -4.5F, -3.5F, 2, 1, 1, 0F,1F, 0F, 1.4F, 1F, 0F, 1.4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F); // Box 34
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-2F, -4.7F, -3.5F, 4, 1, 1, 0F,0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F); // Box 34
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -4.7F, -3.5F, 2, 1, 1, 0F,-0.3F, 0F, 0.8F, 0F, 0F, 1.4F, 0F, 0F, 1F, -0.3F, 0F, 1F, -0.1F, -0.2F, 0.8F, 0F, -0.5F, 1.5F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F); // Box 34
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -4F, -3.5F, 1, 1, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 1.1F, 1F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0.8F, 0.3F, 0F, 1F, 1.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 34
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -3.5F, -2.9F, 2, 1, 1, 0F,-0.5F, -0.5F, 1.5F, 0.5F, -0.5F, 1.7F, 4F, 0.5F, -0.5F, 0F, 0.5F, 1.5F, -1F, 0F, 1.4F, 0F, 0F, 1.5F, 3F, 0F, -2F, 0F, 0F, 1F); // Box 34
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-1F, -3.5F, -3.5F, 2, 2, 1, 0F,-0.5F, 0F, 1F, -0.5F, 0F, 1F, 1F, 1.5F, 0F, 1F, 1.5F, 0F, 0F, -0.3F, 1.5F, 0F, -0.3F, 1.5F, 2F, -1.5F, -0.5F, 2F, -1.5F, -0.5F); // Box 34
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-5.4F, -1F, -4F, 1, 1, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 32
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-5.4F, 0F, -4F, 1, 1, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 36
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-5.4F, 1.3F, -4F, 1, 3, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F); // Box 37
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-3.4F, -5.3F, -5F, 3, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0.2F, -0.2F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F); // Box 18
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-1.5F, -8F, -4F, 3, 5, 1, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0.8F, 1F, 0.4F, 0.8F, 1F, 0.5F, -1.6F, 1.1F, 0.5F, -1.6F, 1.1F, 0.5F, -1F, 1.5F, 0.5F, -1F, 1.5F); // Box 1
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-1.5F, -9.6F, -4F, 3, 1, 1, 0F,-0.6F, -0.8F, 0.2F, -0.6F, -0.8F, 0.2F, -0.6F, -0.8F, 1.5F, -0.6F, -0.8F, 1.5F, 0.4F, 0.6F, 0.4F, 0.4F, 0.6F, 0.4F, 0.4F, 0.8F, 1F, 0.4F, 0.8F, 1F); // Box 50
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-5F, -2.7F, -4.6F, 10, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 29
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-5F, 1.3F, -4.6F, 10, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, -0.4F); // Box 30
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-5F, -4.5F, -4.6F, 2, 2, 1, 0F,0F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F, 0F, -0.2F, -0.4F); // Box 22
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-2F, -12.2F, -2F, 4, 1, 4, 0F,-1.2F, -0.5F, -1.9F, -1.2F, -0.5F, -1.9F, -1.2F, -0.6F, 0F, -1.2F, -0.6F, 0F, 0.2F, 0.2F, -0.3F, 0.2F, 0.2F, -0.3F, 0.2F, 0.5F, 1.4F, 0.2F, 0.5F, 1.4F); // Box 59
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-1F, -12.1F, -1F, 2, 1, 2, 0F,-0.8F, 0.7F, -1.8F, -0.8F, 0.7F, -1.8F, -0.8F, 0.68F, 0.2F, -0.8F, 0.68F, 0.2F, -0.2F, -0.6F, -0.9F, -0.2F, -0.6F, -0.9F, -0.2F, -0.5F, 1F, -0.2F, -0.5F, 1F); // Box 60
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-0.5F, -13.5F, 0.52F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.35F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F); // Box 61
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(4F, -6F, -4F, 1, 2, 8, 0F,1F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, -0.5F, 1.4F, 1F, -0.5F, 1.4F, 1F, -0.5F, 1F, 0F, -0.5F, 1F, 0F, 0F, 1.2F, 1F, 0F, 1.2F); // Box 63
		headModel[32].setRotationPoint(0F, 0F, 0F);

		headModel[33].addShapeBox(2F, -3.5F, -2.9F, 2, 1, 1, 0F,0.5F, -0.5F, 1.7F, -0.5F, -0.5F, 1.5F, 0F, 0.5F, 1.5F, 4F, 0.5F, -0.5F, 0F, 0F, 1.5F, -1F, 0F, 1.4F, 0F, 0F, 1F, 3F, 0F, -2F); // Box 64
		headModel[33].setRotationPoint(0F, 0F, 0F);

		headModel[34].addShapeBox(2F, -4.7F, -3.5F, 2, 1, 1, 0F,0F, 0F, 1.4F, -0.3F, 0F, 0.8F, -0.3F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1.5F, -0.1F, -0.2F, 0.8F, 0F, 0.5F, 1.5F, 0F, 0.5F, 1.5F); // Box 65
		headModel[34].setRotationPoint(0F, 0F, 0F);

		headModel[35].addShapeBox(3F, -4F, -3.5F, 1, 1, 1, 0F,0F, 0F, 1.1F, 0F, 0F, 0.8F, 0F, 0.5F, 0.5F, 1F, 0.5F, 0F, 0.3F, 0F, 1F, -0.5F, 0F, 0.8F, -0.5F, 0F, 0F, 1.5F, 0F, 0F); // Box 66
		headModel[35].setRotationPoint(0F, 0F, 0F);

		headModel[36].addShapeBox(3F, -4.5F, -4.6F, 2, 2, 1, 0F,-0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0.4F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0F, -0.2F, -0.4F, 0.4F, -0.2F, -0.4F); // Box 67
		headModel[36].setRotationPoint(0F, 0F, 0F);

		headModel[37].addShapeBox(4.4F, -4F, -5F, 1, 3, 10, 0F,-0.4F, 0.5F, -1F, -0.4F, 0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 68
		headModel[37].setRotationPoint(0F, 0F, 0F);

		headModel[38].addShapeBox(4.4F, -1F, -4F, 1, 1, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 69
		headModel[38].setRotationPoint(0F, 0F, 0F);

		headModel[39].addShapeBox(4.4F, 0F, -4F, 1, 1, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 70
		headModel[39].setRotationPoint(0F, 0F, 0F);

		headModel[40].addShapeBox(4.4F, 1.3F, -4F, 1, 3, 2, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -2.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F); // Box 71
		headModel[40].setRotationPoint(0F, 0F, 0F);

		headModel[41].addShapeBox(4.4F, -1F, -2F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Box 72
		headModel[41].setRotationPoint(0F, 0F, 0F);

		headModel[42].addShapeBox(4.4F, -1F, 2F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 73
		headModel[42].setRotationPoint(0F, 0F, 0F);

		headModel[43].addShapeBox(4.4F, 0F, 1.9F, 1, 1, 3, 0F,-0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Box 74
		headModel[43].setRotationPoint(0F, 0F, 0F);

		headModel[44].addShapeBox(4.4F, 1.3F, 1.9F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F, -2.4F, 0F, 0F, 1.6F, 0F, 0F); // Box 75
		headModel[44].setRotationPoint(0F, 0F, 0F);

		headModel[45].addShapeBox(0.4F, -5.3F, -5F, 3, 1, 1, 0F,0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F); // Box 76
		headModel[45].setRotationPoint(0F, 0F, 0F);

		headModel[46].addShapeBox(-12F, -22.5F, -5F, 24, 32, 1, 0F,-10.4F, -14F, -0.6F, -10.4F, -14F, -0.6F, -10.4F, -14F, 0F, -10.4F, -14F, 0F, -10.4F, -14F, 0.15F, -10.4F, -14F, 0.15F, -10.4F, -14F, 0F, -10.4F, -14F, 0F); // Box 77
		headModel[46].setRotationPoint(0F, 0F, 0F);
	}
}