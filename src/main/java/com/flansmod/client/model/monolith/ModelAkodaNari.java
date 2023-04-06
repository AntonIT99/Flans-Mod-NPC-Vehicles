//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: AkodaNari
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAkodaNari extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelAkodaNari() //Same as Filename
	{
		headModel = new ModelRendererTurbo[33];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 19
		headModel[3] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 56
		headModel[6] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 57
		headModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 58
		headModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 59
		headModel[9] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 60
		headModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 61
		headModel[11] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 62
		headModel[12] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 63
		headModel[13] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 64
		headModel[14] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 65
		headModel[15] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 66
		headModel[16] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 67
		headModel[17] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 174
		headModel[18] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 189
		headModel[19] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 190
		headModel[20] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 78
		headModel[21] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 79
		headModel[22] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 80
		headModel[23] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 81
		headModel[24] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 82
		headModel[25] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 83
		headModel[26] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 84
		headModel[27] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 85
		headModel[28] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 86
		headModel[29] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 87
		headModel[30] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 88
		headModel[31] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 89
		headModel[32] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 90

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, -0.5F, -1F, -2F, -0.5F, -1F, -2F, 0F, -1.5F, -2F, 0F, -1.5F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 1, 2, 8, 0F,0.7F, -0.5F, 0.8F, 0F, -0.5F, 0.8F, 0F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.4F, 0.8F, 0F, -0.4F, 0.8F, 0F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3F, -6F, -4F, 1, 2, 8, 0F,0F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0F, -0.5F, 0.7F, 0F, -0.4F, 0.8F, 0.7F, -0.4F, 0.8F, 0.7F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3F, -6F, -4F, 6, 2, 8, 0F,0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.4F, 0.8F, 0.7F, -0.4F, 0.8F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 21
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -5.5F, -5F, 4, 1, 1, 0F,0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 1.3F, 0F, 0.4F, 2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 56
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(0F, -5.5F, -5F, 4, 1, 1, 0F,0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.4F, 2.5F, 0.5F, 0F, 1.3F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 57
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -4.5F, -2.5F, 8, 5, 1, 0F,0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.3F, -0.2F, 0.8F, 0.3F, -0.2F, 0.8F, 0.3F, -0.2F, -0.7F, 0.3F, -0.3F, -0.7F); // Box 58
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4.5F, -5.5F, -4.3F, 1, 5, 1, 0F,-0.5F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.6F, -0.2F, 0F, 0.2F, -0.2F, 0F, -2.1F, -0.6F, 0F, 1.5F, -0.8F, 0F, 1.1F, 0F, 0.35F, -1.7F, 0F, 0.35F); // Box 59
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(6.5F, -5.9F, -5F, 2, 5, 1, 0F,0.9F, 0F, -0.6F, -1.9F, 0.6F, -1F, -1.6F, 0.7F, 0.7F, 1.5F, -0.2F, -0.3F, -0.7F, -0.6F, -0.6F, -0.3F, -1.2F, -1F, 0F, -1.4F, 0.7F, -0.1F, -0.2F, -0.3F); // Box 60
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(8.5F, -7F, -3.3F, 1, 5, 2, 0F,2F, -0.6F, 0.3F, -2.6F, -0.4F, 0F, -1.8F, 0.2F, 0F, 1.2F, 0.2F, 0F, 0.8F, -0.2F, 0.8F, -1F, -0.2F, 0F, -0.2F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 61
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4.5F, -5.5F, -2.3F, 1, 5, 7, 0F,0.2F, -0.2F, 1F, -0.6F, -0.2F, 1F, -0.6F, 0.2F, 0F, 0.2F, 0.2F, 0F, -1.7F, 0F, 0.6F, 1.2F, 0F, 0.6F, 1.5F, 0.5F, 2.5F, -2F, 0.5F, 2.5F); // Box 62
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.5F, -5.5F, 4.2F, 9, 6, 1, 0F,0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 2.5F, -0.5F, -3.1F, 2.5F, -0.5F, -3.1F, 2.5F, -0.5F, 2.6F, 2.5F, -0.5F, 2.6F); // Box 63
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, -5.5F, 4.8F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 64
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5.5F, -4.25F, 5.5F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 65
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-6F, -3F, 6.1F, 12, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 66
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-6.5F, -1.75F, 6.8F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F); // Box 67
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-3.5F, 0.2F, -3.2F, 7, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, -1.4F, 0.5F, 0F, -1.4F); // Box 174
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5F, 0.2F, -3.7F, 10, 1, 1, 0F,-1.6F, 0F, -0.2F, -1.6F, 0F, -0.2F, -1.6F, 0F, 0F, -1.6F, 0F, 0F, -1.4F, 0F, 0.2F, -1.4F, 0F, 0.2F, -1.4F, 0F, 0F, -1.4F, 0F, 0F); // Box 189
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-5F, 1.45F, -4.3F, 10, 1, 1, 0F,-1.3F, 0F, -0.2F, -1.3F, 0F, -0.2F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -1.1F, 0F, 0.2F, -1.1F, 0F, 0.2F, -1.1F, 0F, 0F, -1.1F, 0F, 0F); // Box 190
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4F, -1.3F, -4.3F, 8, 1, 2, 0F,0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F); // Box 78
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(4.8F, -5.5F, -3.2F, 1, 1, 8, 0F,0F, -0.3F, 0F, -0.5F, -0.3F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 79
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(5.3F, -4.25F, -2.2F, 1, 1, 8, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0.4F, 0F, 0.1F, 2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 80
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(5.8F, -3F, -2.5F, 1, 1, 9, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 1.7F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0F, 1.8F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 81
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(6.3F, -1.75F, -3F, 1, 1, 10, 0F,0F, -0.1F, 0F, -0.5F, -0.1F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.4F, -0.5F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 82
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-5.5F, -5.5F, -2.3F, 1, 5, 7, 0F,-0.6F, -0.2F, 1F, 0.2F, -0.2F, 1F, 0.2F, 0.2F, 0F, -0.6F, 0.2F, 0F, 1.2F, 0F, 0.6F, -1.7F, 0F, 0.6F, -2F, 0.5F, 2.5F, 1.5F, 0.5F, 2.5F); // Box 83
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-5.8F, -5.5F, -3.2F, 1, 1, 8, 0F,-0.5F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 0F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 84
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-6.3F, -4.25F, -2.2F, 1, 1, 8, 0F,-0.5F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.1F, 2F, 0F, 0.1F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 85
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(-6.8F, -3F, -2.5F, 1, 1, 9, 0F,-0.5F, -0.1F, 1.7F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 1.8F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 86
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-7.3F, -1.75F, -3F, 1, 1, 10, 0F,-0.5F, -0.1F, 1F, 0F, -0.1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.2F, -0.1F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 87
		headModel[29].setRotationPoint(0F, 0F, 0F);

		headModel[30].addShapeBox(-5.5F, -5.5F, -4.3F, 1, 5, 1, 0F,-0.1F, 0.2F, 0F, -0.5F, 0.2F, 0F, 0.2F, -0.2F, 0F, -0.6F, -0.2F, 0F, 1.5F, -0.8F, 0F, -2.1F, -0.6F, 0F, -1.7F, 0F, 0.35F, 1.1F, 0F, 0.35F); // Box 88
		headModel[30].setRotationPoint(0F, 0F, 0F);

		headModel[31].addShapeBox(-8.5F, -5.9F, -5F, 2, 5, 1, 0F,-1.9F, 0.6F, -1F, 0.9F, 0F, -0.6F, 1.5F, -0.2F, -0.3F, -1.6F, 0.7F, 0.7F, -0.3F, -1.2F, -1F, -0.7F, -0.6F, -0.6F, -0.1F, -0.2F, -0.3F, 0F, -1.4F, 0.7F); // Box 89
		headModel[31].setRotationPoint(0F, 0F, 0F);

		headModel[32].addShapeBox(-9.5F, -7F, -3.3F, 1, 5, 2, 0F,-2.6F, -0.4F, 0F, 2F, -0.6F, 0.3F, 1.2F, 0.2F, 0F, -1.8F, 0.2F, 0F, -1F, -0.2F, 0F, 0.8F, -0.2F, 0.8F, 0F, -1.5F, 0F, -0.2F, -1.5F, 0F); // Box 90
		headModel[32].setRotationPoint(0F, 0F, 0F);
	}
}