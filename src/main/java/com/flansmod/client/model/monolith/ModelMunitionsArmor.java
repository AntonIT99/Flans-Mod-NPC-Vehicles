//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: gothicPlate
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMunitionsArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelMunitionsArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[24];

		initbodyModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 68
		bodyModel[2] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 69
		bodyModel[3] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 89
		bodyModel[4] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 90
		bodyModel[5] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 91
		bodyModel[6] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 92
		bodyModel[7] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 93
		bodyModel[8] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 96
		bodyModel[9] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 97
		bodyModel[10] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 105
		bodyModel[11] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 106
		bodyModel[12] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 107
		bodyModel[13] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 108
		bodyModel[14] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 55
		bodyModel[15] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 56
		bodyModel[16] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 65
		bodyModel[17] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 66
		bodyModel[18] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 67
		bodyModel[19] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 68
		bodyModel[20] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 69
		bodyModel[21] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 70
		bodyModel[22] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 71
		bodyModel[23] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 72

		bodyModel[0].addShapeBox(-4F, 6.5F, -2F, 4, 3, 4, 0F,0.6F, 0F, 0.4F, 0F, -0.5F, 1.5F, 0F, 0F, 1F, 0.6F, 0F, 0.5F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2.2F, 4, 2, 4, 0F,-1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, -1F, 0.4F, 0.5F, -2F, -0.3F, 1F, 0F, 0.2F, 1.5F, 0F, -0.7F, 0.5F, -2F, -1F, 0.5F); // Box 68
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -2.2F, 4, 2, 4, 0F,0F, 0.8F, 0.5F, -1F, 0.4F, 0.5F, -1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.2F, 1.5F, -2F, -0.3F, 1F, -2F, -1F, 0.5F, 0F, -0.7F, 0.5F); // Box 69
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 3.5F, -2F, 4, 3, 4, 0F,0.5F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.6F, 0F, 0.4F, 0F, 0.49F, 1.49F, 0F, 0F, 1F, 0.6F, 0F, 0.4F); // Box 89
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 2.5F, -2F, 4, 1, 4, 0F,-0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F, 0.4F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.4F, 0F, 0.5F); // Box 90
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, -0.5F, -2F, 4, 2, 4, 0F,-0.3F, -0.3F, 0.3F, -1.5F, -0.3F, 0.2F, 0F, -0.3F, 0.8F, -0.3F, -0.3F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F); // Box 91
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(0F, -0.5F, -2F, 4, 2, 4, 0F,-1.5F, -0.3F, 0.2F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.5F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F); // Box 92
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, 2.5F, -2F, 4, 1, 4, 0F,0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F, 0F, 0F, 1.2F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.5F, 0F, 0F, 1F); // Box 93
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 3.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1.2F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.51F, 1.51F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0F, 0F, 1F); // Box 96
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 6.5F, -2F, 4, 3, 4, 0F,0F, -0.5F, 1.5F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 97
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-4F, 9.4F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F); // Box 105
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 9.8F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 106
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 10.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0.5F, 1.2F, 0F, 0.5F, 1.2F, 1F, 0F, 1F); // Box 107
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(0F, 10.8F, -2F, 4, 1, 4, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.2F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0.5F, 1.2F); // Box 108
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-5F, 12.2F, -2F, 4, 1, 4, 0F,-0.2F, 0.5F, 1F, 1F, 0F, 0.8F, 1F, 0F, 0.8F, -0.2F, 0.5F, 1F, 0.3F, -0.3F, 1F, 0.5F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0.3F, -0.3F, 1F); // Box 55
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-5.1F, 13.2F, -2F, 4, 1, 4, 0F,0F, 0.3F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0F, 0.3F, 0.9F, 0.3F, 0F, 1.1F, 0.2F, 0.2F, 1.1F, 0.2F, 0.2F, 1.1F, 0.3F, 0F, 1.1F); // Box 56
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-5.1F, 14.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.4F, 0F, 1.1F, 0.2F, 0.2F, 1.1F, 0.2F, 0.2F, 1.1F, 0.4F, 0F, 1.1F); // Box 65
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-5.1F, 15.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.4F, 0F, 1.1F, 0.2F, 0.2F, 1.1F, 0.2F, 0.2F, 1.1F, 0.4F, 0F, 1.1F); // Box 66
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-5.1F, 16.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.4F, 0F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, 0.4F, 0F, 0.9F); // Box 67
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(1F, 12.2F, -2F, 4, 1, 4, 0F,1F, 0F, 0.8F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, 1F, 0F, 0.8F, 0.5F, 0F, 1.2F, 0.3F, -0.3F, 1F, 0.3F, -0.3F, 1F, 0.5F, 0F, 1.2F); // Box 68
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0.9F, 13.2F, -2F, 4, 1, 4, 0F,0.4F, 0F, 0.9F, 0F, 0.3F, 0.9F, 0F, 0.3F, 0.9F, 0.4F, 0F, 0.9F, 0.2F, 0.2F, 1.1F, 0.3F, 0F, 1.1F, 0.3F, 0F, 1.1F, 0.2F, 0.2F, 1.1F); // Box 69
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0.9F, 14.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.2F, 0F, 1.1F); // Box 70
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0.9F, 15.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.2F, 0F, 1.1F); // Box 71
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.9F, 16.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, -0.2F, 0F, 0.9F); // Box 72
		bodyModel[23].setRotationPoint(0F, 0F, 0F);
	}
}