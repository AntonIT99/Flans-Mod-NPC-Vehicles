//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRomanKettle extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelRomanKettle() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 136
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 203
		headModel[4] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 204
		headModel[5] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 205
		headModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 206
		headModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 207
		headModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 218
		headModel[9] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 219
		headModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 0

		headModel[0].addShapeBox(-4F, -7.7F, -4F, 8, 3, 8, 0F,0.7F, 0.6F, 0.7F, 0.7F, 0.6F, 0.7F, 0.7F, 0.2F, 1F, 0.7F, 0.2F, 1F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.4F, -4F, 8, 2, 8, 0F,-3.8F, 2.5F, -4.3F, -3.8F, 2.5F, -4.3F, -3.8F, 2.5F, -3.5F, -3.8F, 2.5F, -3.5F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.5F, 1F, 0.7F, 0.5F, 1F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5.7F, -4F, 8, 2, 8, 0F,0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 136
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -5.7F, 4.8F, 10, 2, 2, 0F,0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 203
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(4.9F, -6.1F, -4.8F, 2, 2, 10, 0F,0F, -1.2F, 0F, 0F, -1.5F, 0F, 0F, -1.9F, -0.3F, 0F, -1.8F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 204
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-6.9F, -6.1F, -4.8F, 2, 2, 10, 0F,0F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, -1.6F, -0.3F, 0F, -1.9F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 205
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-7.01F, -6.1F, -6.8F, 2, 2, 2, 0F,-1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, -1.5F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 206
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(5.01F, -6.1F, -6.8F, 2, 2, 2, 0F,0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 207
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(5.01F, -5.7F, 4.91F, 2, 2, 2, 0F,0F, -1.2F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 218
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-7.01F, -5.7F, 4.91F, 2, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F); // Box 219
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -6.1F, -6.8F, 10, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 0
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}
}