//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAssyriaHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelAssyriaHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[19];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		headModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 2
		headModel[6] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 3
		headModel[7] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 18
		headModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 19
		headModel[9] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 20
		headModel[10] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 21
		headModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[12] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 23
		headModel[13] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 24
		headModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 25
		headModel[15] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 26
		headModel[16] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 27
		headModel[17] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 28
		headModel[18] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 29

		headModel[0].addShapeBox(-4F, -7.8F, -4F, 8, 4, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -2.5F, 0.9F, 0.9F, -2.5F, 0.9F, 0.9F, -2.5F, 0.9F, 0.9F, -2.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.6F, -4F, 8, 1, 8, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.3F, -4F, 8, 2, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-2F, -11.6F, -2F, 4, 2, 4, 0F,-1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 0
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -13F, -0.5F, 1, 2, 1, 0F,-0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 1
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -4.3F, -2.5F, 8, 2, 4, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 2
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -2.3F, -2.5F, 8, 2, 4, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, -1F); // Box 3
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3F, -5F, -4F, 2, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0.2F, 0F, 0.2F, 0.4F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 18
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(1F, -5F, -4F, 2, 1, 1, 0F,0F, -0.5F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0.4F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 19
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -1F, -4F, 8, 1, 6, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 20
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-2F, -2.5F, -4F, 2, 1, 1, 0F,0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F); // Box 21
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -2.5F, -4F, 2, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F); // Box 22
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -4.7F, 2.5F, 8, 1, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 1.2F, 1.8F, 0.5F, 1.2F); // Box 23
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -0.7F, 2.5F, 8, 1, 1, 0F,1.8F, 0F, 0.2F, 1.8F, 0F, 0.2F, 1.8F, 0F, 1.2F, 1.8F, 0F, 1.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F); // Box 24
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -3.2F, 2.5F, 8, 2, 1, 0F,1.8F, 0F, 0.2F, 1.8F, 0F, 0.2F, 1.8F, 0F, 1.2F, 1.8F, 0F, 1.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 0.2F, 1.8F, 0.5F, 1.2F, 1.8F, 0.5F, 1.2F); // Box 25
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -3.2F, 1.3F, 8, 2, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F); // Box 26
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -4.7F, 1.3F, 8, 1, 1, 0F,-1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F); // Box 27
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -0.2F, 1.3F, 8, 1, 1, 0F,0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, 1.8F, 0.5F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 28
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, 0F, -4F, 8, 1, 5, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, -2.8F, 0.5F, 0.5F, -2.8F, 0.5F, 0.5F, -2.8F, 0F, 0.2F, -2.8F, 0F, 0.2F); // Box 29
		headModel[18].setRotationPoint(0F, 0F, 0F);
	}
}