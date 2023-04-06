//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: LaterCuirass
// Model Creator: 
// Created on: 11.01.2021 - 14:32:22
// Last changed on: 11.01.2021 - 14:32:22

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLaterCuirass extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelLaterCuirass() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[33];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 51
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 52
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 53
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 54
		bodyModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 55
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 56
		bodyModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 57
		bodyModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 58
		bodyModel[9] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 59
		bodyModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 60
		bodyModel[11] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 66
		bodyModel[12] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 67
		bodyModel[13] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 71
		bodyModel[14] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 72
		bodyModel[15] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 73
		bodyModel[16] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 75
		bodyModel[17] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 81
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 82
		bodyModel[19] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 83
		bodyModel[20] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 84
		bodyModel[21] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 85
		bodyModel[22] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 86
		bodyModel[23] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 87
		bodyModel[24] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 88
		bodyModel[25] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 89
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 90
		bodyModel[27] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 91
		bodyModel[28] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 92
		bodyModel[29] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 93
		bodyModel[30] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 96
		bodyModel[31] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 100
		bodyModel[32] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 101

		bodyModel[0].addShapeBox(0F, 4F, -4F, 4, 2, 4, 0F,-0.1F, -0.5F, 0.7F, 0F, -0.5F, 0.2F, 0F, 0F, -2F, 0F, 0F, -2F, -0.1F, 0F, 0.7F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 50
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0F, 6F, -4F, 4, 2, 4, 0F,-0.1F, 0F, 0.7F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0F, 0.2F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 51
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 8F, -4F, 4, 1, 4, 0F,-0.1F, 0F, 0.2F, 0.7F, 0F, -0.8F, 0.7F, 0F, 0.5F, 0F, 0F, 0.5F, -0.1F, 0.8F, -1F, 0.6F, 0.5F, -1.7F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 52
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(3F, 1F, -4F, 1, 4, 4, 0F,1F, 1.5F, -1F, 0.5F, 1F, -1.5F, 0.4F, 0F, -1.5F, 0.5F, 0.5F, -1.5F, 2.9F, -0.5F, 0.7F, 0F, -0.5F, 0.2F, 0F, -1F, -2F, 3F, -1F, -2F); // Box 53
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0.5F, -3F, 2, 1, 3, 0F,0.5F, 0.5F, -0.5F, 0F, 1F, 0F, -0.3F, 2F, 0.5F, 0.8F, 1.5F, 0.5F, 0.2F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0F, -1.5F, 0.5F, 0.4F, -1F, 0.5F); // Box 54
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 4F, 1F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.2F, 0F, 0F, 0.7F, 1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 1F, 0F, 0.3F); // Box 55
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 1F, 1F, 3, 3, 2, 0F,0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 1F, 0.5F, 0.5F, 1F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1.2F, 0F, 0F, 0.7F); // Box 56
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 0.5F, 1F, 2, 1, 2, 0F,0.8F, 1.5F, 0.5F, -0.3F, 2F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F, 0F, 0.4F, -1F, 0.5F, 0F, -1.5F, 0.5F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Box 57
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(-4F, 6F, 1F, 4, 3, 2, 0F,1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 1F, 0F, 0.3F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.6F, 0.5F, -0.5F); // Box 58
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 10F, -4F, 4, 1, 4, 0F,0F, 0.2F, -1F, 0.6F, 0.5F, -1.7F, 0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0.8F, -0.3F, -0.8F, 1.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 59
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 10F, 1F, 4, 1, 3, 0F,0.6F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, -1F, 0.6F, 0.5F, -1.5F, 1.1F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0.8F, -0.2F, -1F); // Box 60
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 9F, -4F, 5, 1, 4, 0F,0F, -0.6F, -0.3F, -0.3F, -0.2F, -1F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, -0.1F, -0.3F, -0.2F, -1F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 66
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-5F, 9F, 0F, 5, 1, 4, 0F,-0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, -0.2F, -0.2F, -1.3F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.6F, -0.2F, -0.2F, -1.3F); // Box 67
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-0.5F, 4F, -4F, 1, 2, 1, 0F,-0.4F, -0.5F, 0.7F, -0.4F, -0.5F, 0.7F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, 0F, 0.7F, -0.4F, 0F, 0.7F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 71
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-0.5F, 6F, -4F, 1, 2, 4, 0F,-0.4F, 0F, 0.7F, -0.4F, 0F, 0.7F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F); // Box 72
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-0.5F, 8F, -4F, 1, 1, 4, 0F,-0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0.8F, -1F, -0.4F, 0.5F, -1F, -0.4F, 0.5F, 0.5F, -0.4F, 0.5F, 0.5F); // Box 73
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-0.5F, 1.5F, -5.2F, 2, 3, 1, 0F,-0.5F, 0.2F, -1.3F, 0.05F, 0.7F, -1.65F, 0.6F, 0.7F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0F, -0.5F, -1.4F, 0F, -0.5F, -1.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 75
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 1F, -4F, 1, 4, 4, 0F,0.5F, 1F, -1.5F, 1F, 1.5F, -1F, 0.5F, 0.5F, -1.5F, 0.4F, 0F, -1.5F, 0F, -0.5F, 0.2F, 2.9F, -0.5F, 0.7F, 3F, -1F, -2F, 0F, -1F, -2F); // Box 81
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 4F, -4F, 4, 2, 4, 0F,0F, -0.5F, 0.2F, -0.1F, -0.5F, 0.7F, 0F, 0F, -2F, 0F, 0F, -2F, 1F, 0F, 0F, -0.1F, 0F, 0.7F, 0F, 0F, 0.5F, 1F, 0F, 0.5F); // Box 82
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 6F, -4F, 4, 2, 4, 0F,1F, 0F, 0F, -0.1F, 0F, 0.7F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 0.7F, 0F, -0.8F, -0.1F, 0F, 0.2F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F); // Box 83
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-4F, 8F, -4F, 4, 1, 4, 0F,0.7F, 0F, -0.8F, -0.1F, 0F, 0.2F, 0F, 0F, 0.5F, 0.7F, 0F, 0.5F, 0.6F, 0.5F, -1.7F, -0.1F, 0.8F, -1F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F); // Box 84
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-4F, 10F, -4F, 4, 1, 4, 0F,0.6F, 0.5F, -1.7F, 0F, 0.2F, -1F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.8F, -0.3F, -0.8F, 0F, 0.5F, 0F, 0F, -0.5F, 0.5F, 1.1F, -0.5F, 0.5F); // Box 85
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(-5F, 9F, -4F, 5, 1, 4, 0F,-0.3F, -0.2F, -1F, 0F, -0.6F, -0.3F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.3F, -0.2F, -1F, 0F, 0.4F, -0.1F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F); // Box 86
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0F, 9F, 0F, 5, 1, 4, 0F,0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, -1.3F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.2F, -0.2F, -1.3F, 0F, -0.2F, -0.6F); // Box 87
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0F, 6F, 1F, 4, 3, 2, 0F,0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.3F, 0F, 0F, 0.8F, 0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.6F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 88
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0F, 4F, 1F, 4, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.7F, 0F, 0F, 1.2F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0.3F, 0F, 0F, 0.8F); // Box 89
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(1F, 1F, 1F, 3, 3, 2, 0F,-0.5F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 1F, 0F, -0.5F, 1F, 0.5F, 1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.7F, 1F, 0F, 1.2F); // Box 90
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2F, 0.5F, 1F, 2, 1, 2, 0F,-0.3F, 2F, 0.5F, 0.8F, 1.5F, 0.5F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, 0F, -1.5F, 0.5F, 0.4F, -1F, 0.5F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, -1F); // Box 91
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(0F, 10F, 1F, 4, 1, 3, 0F,0F, 0.5F, 0.5F, 0.6F, 0.5F, 0.5F, 0.6F, 0.5F, -1.5F, 0F, 0.5F, -1F, 0F, -0.5F, 0.5F, 1.1F, -0.5F, 0.5F, 0.8F, -0.2F, -1F, 0F, 0F, 0F); // Box 92
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(2F, 0.5F, -3F, 2, 1, 3, 0F,0F, 1F, 0F, 0.5F, 0.5F, -0.5F, 0.8F, 1.5F, 0.5F, -0.3F, 2F, 0.5F, 0.5F, -0.5F, 0F, 0.2F, 0F, -1.5F, 0.4F, -1F, 0.5F, 0F, -1.5F, 0.5F); // Box 93
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-1.5F, 1.5F, -5.2F, 2, 3, 1, 0F,0.05F, 0.7F, -1.65F, -0.5F, 0.2F, -1.3F, -0.5F, 0.2F, 3F, 0.6F, 0.7F, 3F, -1.4F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1.4F, 0F, 0F); // Box 96
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-0.5F, 1F, 3.2F, 2, 3, 1, 0F,-0.5F, 0.2F, 3F, 0.6F, 0.7F, 3F, -0.1F, 0.7F, -0.65F, -0.5F, 0.2F, -0.5F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 100
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-1.5F, 1F, 3.2F, 2, 3, 1, 0F,0.6F, 0.7F, 3F, -0.5F, 0.2F, 3F, -0.5F, 0.2F, -0.5F, -0.1F, 0.7F, -0.65F, -1.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.4F, 0F, 0F); // Box 101
		bodyModel[32].setRotationPoint(0F, 0F, 0F);
	}
}