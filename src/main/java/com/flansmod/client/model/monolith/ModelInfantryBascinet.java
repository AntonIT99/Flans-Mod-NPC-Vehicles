//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelInfantryBascinet extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelInfantryBascinet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[10];
		bodyModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 19
		headModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 20
		headModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 21
		headModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 23
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[7] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		headModel[8] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 12
		headModel[9] = new ModelRendererTurbo(this, 81, 41, textureX, textureY); // Box 7

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.5F, 0.5F, 1F, 0.5F, 0.5F, 1F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5F, -4F, 1, 3, 6, 0F,0.5F, -0.5F, 1F, -1.2F, -0.5F, 1F, -1.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, -3F, -1.2F, 0.5F, -3F, -1.2F, 0.2F, 1F, 0.5F, 0.2F, 1F); // Box 19
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5F, 3F, 8, 3, 1, 0F,0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 20
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(4.7F, -5F, -4F, 1, 3, 6, 0F,0.5F, -0.5F, 1F, -1.2F, -0.5F, 1F, -1.2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0.5F, -3F, -1.2F, 0.5F, -3F, -1.2F, 0.2F, 1F, 0.5F, 0.2F, 1F); // Box 21
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-1F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3F, -10.8F, -3F, 6, 1, 7, 0F,-2.8F, 0.75F, -6.2F, -2.8F, 0.75F, -6.2F, -2.8F, 0.75F, -0.5F, -2.8F, 0.75F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1.2F, -6F, -1.7F, 1, 1, 2, 0F,-0.5F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0.5F, -0.8F, -0.5F, 0.5F, -0.8F, -0.5F, -1F, 1F, -0.2F, -1F, 1F, -0.2F, -0.5F, -1.2F, -0.5F, -0.5F, -1.2F); // Box 28
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -1F, -4F, 16, 5, 4, 0F,0.1F, -0.2F, 0.1F, -7.9F, -0.2F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -3.9F, 0.1F, -7.9F, -3.9F, 0.1F, -7.9F, -1.9F, 0.1F, 0.1F, -1.9F, 0.1F); // Box 11
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -5F, -3F, 16, 10, 7, 0F,0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -5.7F, 1.1F, -7.9F, -5.7F, 1.1F, -7.9F, -5.9F, 0.1F, 0.1F, -5.9F, 0.1F); // Box 12
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -1F, 0F, 16, 5, 4, 0F,0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -1.9F, 0.1F, -7.9F, -1.9F, 0.1F, -7.9F, -3.9F, 0.1F, 0.1F, -3.9F, 0.1F); // Box 7
		headModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 294
		bodyModel[1] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 297

		bodyModel[0].addShapeBox(-0.5F, -0.4F, -2F, 15, 6, 4, 0F,-0.3F, 0F, 0.5F, -9.7F, -0.2F, 0.5F, -9.7F, -0.2F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, -2F, 0.7F, -10.4F, -4F, 0.5F, -10.4F, -4F, 0.5F, -0.4F, -2F, 0.7F); // Box 294
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.8F, -0.4F, -2F, 15, 6, 4, 0F,0F, -0.2F, 0.5F, -10.3F, 0F, 0.5F, -10.3F, 0F, 0.5F, 0F, -0.2F, 0.5F, -0.8F, -4F, 0.5F, -10.3F, -2F, 0.7F, -10.3F, -2F, 0.7F, -0.8F, -4F, 0.5F); // Box 297
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}
}