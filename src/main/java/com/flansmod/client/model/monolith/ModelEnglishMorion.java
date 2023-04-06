//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelEnglishMorion extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelEnglishMorion() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[3] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 28
		headModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 29
		headModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 30
		headModel[8] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 32
		headModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 0
		headModel[10] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 1
		headModel[11] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 3
		headModel[12] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 4
		headModel[13] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 5
		headModel[14] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 6
		headModel[15] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 7
		headModel[16] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 8

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -11.8F, -4.5F, 1, 1, 9, 0F,-0.2F, -1F, -1.5F, -0.2F, -1F, -1.5F, -0.2F, -1.2F, -2.5F, -0.2F, -1.2F, -2.5F, -0.2F, 1.5F, 0.5F, -0.2F, 1.5F, 0.5F, -0.2F, 1.5F, 0.1F, -0.2F, 1.5F, 0.1F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -10F, -4.5F, 1, 5, 9, 0F,-0.2F, -0.7F, 0.5F, -0.2F, -0.7F, 0.5F, -0.2F, -0.7F, 0.1F, -0.2F, -0.7F, 0.1F, -0.2F, -0.5F, 1F, -0.2F, -0.5F, 1F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(0F, -6.5F, -4F, 4, 2, 8, 0F,0F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, -0.5F, 0.9F, 0.9F, 0.4F, 0.9F, 0.9F, 0.5F, 0.9F, 0F, -0.5F, 0.9F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -6.5F, -4F, 4, 2, 8, 0F,0.9F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0.4F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0.9F, 0.5F, 0.9F); // Box 28
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(5F, -4F, -5F, 1, 1, 5, 0F,0.2F, 0.3F, -0.2F, 0F, 0F, -0.2F, 1F, -0.2F, 0F, 0.2F, 0.3F, 0F, 0F, -0.8F, -0.2F, 0F, -0.3F, -0.2F, 1F, -0.1F, 0F, 0F, -0.8F, 0F); // Box 29
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-6F, -4F, -5F, 1, 1, 5, 0F,0F, 0F, -0.2F, 0.2F, 0.3F, -0.2F, 0.2F, 0.3F, 0F, 1F, -0.2F, 0F, 0F, -0.3F, -0.2F, 0F, -0.8F, -0.2F, 0F, -0.8F, 0F, 1F, -0.1F, 0F); // Box 30
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(5F, -4F, 0F, 1, 1, 5, 0F,0.2F, 0.3F, 0F, 1F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0.2F, 0F, -0.2F, 0F, -0.8F, 0F, 1F, -0.1F, 0F, 0F, 0F, -0.2F, 0F, -0.8F, -0.2F); // Box 32
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-6F, -4F, -9.6F, 6, 1, 5, 0F,-3F, 0.5F, -1F, 0F, 1F, 0F, 0F, 1.8F, -0.2F, 0F, 0F, -0.2F, -3F, -1F, -1F, 0F, -1.5F, 0F, 0F, -2F, -0.2F, 0F, -0.3F, -0.2F); // Box 0
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(0F, -4F, -9.6F, 6, 1, 5, 0F,0F, 1F, 0F, -3F, 0.5F, -1F, 0F, 0F, -0.2F, 0F, 1.8F, -0.2F, 0F, -1.5F, 0F, -3F, -1F, -1F, 0F, -0.3F, -0.2F, 0F, -2F, -0.2F); // Box 1
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(0F, -4F, 4.6F, 6, 1, 3, 0F,0F, 1F, -0.2F, 0F, -0.2F, -0.2F, -3F, -0.3F, -1F, 0F, -0.5F, -0.5F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, -3F, -0.1F, -1F, 0F, 0F, -0.5F); // Box 3
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-6F, -4F, 0F, 1, 1, 5, 0F,1F, -0.2F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, -0.2F, 0F, -0.2F, -0.2F, 1F, -0.1F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.2F, 0F, 0F, -0.2F); // Box 4
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-6F, -4F, 4.6F, 6, 1, 3, 0F,0F, -0.2F, -0.2F, 0F, 1F, -0.2F, 0F, -0.5F, -0.5F, -3F, -0.3F, -1F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.5F, -3F, -0.1F, -1F); // Box 5
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4F, -4F, -3F, 1, 4, 3, 0F,0F, 0F, -0.2F, -0.1F, 0F, -0.2F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, -0.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 6
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.5F, -0.5F, -3.2F, 9, 1, 1, 0F,-0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.25F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F, -0.5F, -0.3F, -0.3F); // Box 7
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-5F, -4F, -3F, 1, 4, 3, 0F,-0.1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, -0.7F, -0.5F, -1.5F); // Box 8
		headModel[16].setRotationPoint(0F, 0F, 0F);
	}
}