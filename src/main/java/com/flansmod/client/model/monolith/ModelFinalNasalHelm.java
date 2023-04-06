//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFinalNasalHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelFinalNasalHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[15];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 259
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		headModel[4] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 49
		headModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 23
		headModel[7] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 1
		headModel[8] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 2
		headModel[9] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 3
		headModel[10] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 4
		headModel[11] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 5
		headModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		headModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 7
		headModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 8

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F, 0.8F, -0.5F, 0.8F, 0.8F, -0.5F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5F, -4F, 8, 1, 8, 0F,1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, -0.8F, 1F, 1F, -0.8F, 1F, 1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 259
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5.5F, -4F, 8, 1, 8, 0F,0.95F, 0F, 0.95F, 0.95F, 0F, 0.95F, 0.95F, -0.3F, 0.95F, 0.95F, -0.3F, 0.95F, 0.95F, 0F, 0.95F, 0.95F, 0F, 0.95F, 0.95F, 0.4F, 0.95F, 0.95F, 0.4F, 0.95F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(3.5F, -4.6F, -5.3F, 1, 2, 1, 0F,0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.7F, 0F, -0.4F); // Box 27
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -11F, -4F, 8, 2, 8, 0F,-2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0.4F, -2F, -2.5F, 0.4F, -2F, 0.3F, 0.8F, 0.2F, 0.3F, 0.8F, 0.2F, 0.3F, 0.5F, 0.5F, 0.3F, 0.5F, 0.5F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -12.3F, 0F, 1, 1, 1, 0F,-0.4F, 0F, 1.2F, -0.4F, 0F, 1.2F, -0.4F, 0F, -2F, -0.4F, 0F, -2F, 1F, 0.3F, 1.5F, 1F, 0.3F, 1.5F, 1F, -0.1F, 1F, 1F, -0.1F, 1F); // Box 49
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -5F, -1F, 10, 5, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.8F, 0.25F, 2.7F, -0.8F, 0.25F, 2.7F, -0.8F, 0.25F, -3F, -0.8F, 0.25F, -3F); // Box 23
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4.5F, -4.6F, -5.3F, 1, 2, 1, 0F,0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0.7F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 1
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4.5F, -2.6F, -5.3F, 9, 3, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F, -0.2F, -0.5F, -0.4F); // Box 2
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4.5F, -0.1F, -5.3F, 9, 1, 1, 0F,-0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -3.2F, 0F, -0.4F, -3.2F, 0F, -0.4F, -3.2F, 0F, -0.4F, -3.2F, 0F, -0.4F); // Box 3
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.5F, -4.6F, -5.3F, 1, 2, 1, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F); // Box 4
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-0.8F, -3.5F, -5.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.8F, 0F, -0.4F); // Box 5
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3F, -3.6F, -5.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.8F, 0F, -0.4F); // Box 6
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -3.6F, -5.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.8F, 0F, -0.4F, 0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 7
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-0.2F, -3.5F, -5.3F, 1, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.8F, 0F, -0.4F, 0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 8
		headModel[14].setRotationPoint(0F, 0F, 0F);
	}
}