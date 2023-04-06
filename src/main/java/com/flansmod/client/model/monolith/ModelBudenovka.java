//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBudenovka extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelBudenovka() //Same as Filename
	{
		headModel = new ModelRendererTurbo[17];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import Box30
		headModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box32
		headModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 4
		headModel[8] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 5
		headModel[9] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 7
		headModel[11] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 8
		headModel[12] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 9
		headModel[13] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 10
		headModel[14] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 11
		headModel[15] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12
		headModel[16] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 13

		headModel[0].addShapeBox(-4F, -7.5F, -4F, 8, 2, 8, 0F,0.1F, 1.8F, 0.3F, 0.1F, 1.8F, 0.3F, 0.1F, 1.2F, 0.3F, 0.1F, 1.2F, 0.3F, 0.5F, -0.5F, 1.1F, 0.5F, -0.5F, 1.1F, 0.5F, -0.7F, 1.1F, 0.5F, -0.7F, 1.1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5.5F, -4F, 8, 1, 8, 0F,0.5F, 0.5F, 1.2F, 0.5F, 0.5F, 1.2F, 0.5F, 0.7F, 1.2F, 0.5F, 0.7F, 1.2F, 0.5F, 0F, 1.4F, 0.5F, 0F, 1.4F, 0.5F, 0.4F, 0.95F, 0.5F, 0.4F, 0.95F); // Box 28
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -10.5F, -4F, 8, 1, 8, 0F,-2.5F, 0.8F, -3.5F, -2.5F, 0.8F, -3.5F, -2.5F, 0.6F, -1.5F, -2.5F, 0.6F, -1.5F, 0.1F, 0.2F, 0.3F, 0.1F, 0.2F, 0.3F, 0.1F, 0.8F, 0.3F, 0.1F, 0.8F, 0.3F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -13.5F, 0.5F, 1, 2, 1, 0F,0.3F, 0.2F, -0.3F, 0.3F, 0.2F, -0.3F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 1F, 0.2F, 1F, 1F, 0.2F, 1F, 1F, 0.4F, 1F, 1F, 0.4F, 1F); // Box 49
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-2.5F, -4.7F, -8.5F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Import Box30
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(2.5F, -4.7F, -8.5F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, -0.4F, -1.5F, 0.3F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.3F, -1.5F, 0.3F, 0F, 0F, 0F, -0.75F, 0F); // Import Box32
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -4.7F, -8.5F, 2, 1, 5, 0F,0F, -0.4F, -1.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.3F, 0.25F, 0F, 0F, -0.3F, -1.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.3F, 0F, 0F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(4.5F, -5.5F, -4F, 1, 2, 9, 0F,-0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.1F, 0F, 0F, 0.3F, 0F); // Box 4
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4.5F, -8.5F, -4F, 1, 3, 9, 0F,0F, 0.5F, -0.7F, -0.2F, 0.3F, -0.7F, -0.2F, -0.4F, 0.5F, 0F, -0.2F, 0.5F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0.5F, -0.3F, 0F, 0.5F); // Box 5
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.5F, -5.5F, -4F, 1, 2, 9, 0F,0F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, -0.2F, 0.1F, 0F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5.5F, -8.5F, -4F, 1, 3, 9, 0F,-0.2F, 0.3F, -0.7F, 0F, 0.5F, -0.7F, 0F, -0.2F, 0.5F, -0.2F, -0.4F, 0.5F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 7
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4.5F, -8.5F, 5F, 9, 3, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, -0.3F, -0.5F, 0.5F, -0.3F, -0.5F, 0.5F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 8
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4.5F, -5.5F, 5F, 9, 2, 1, 0F,0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.2F, -0.5F, 0.2F, -0.2F, -0.5F, 0.2F); // Box 9
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-0.5F, -10.2F, -5.2F, 1, 1, 1, 0F,-0.4F, 0F, -2.2F, -0.4F, 0F, -2.2F, -0.4F, 0F, 1.5F, -0.4F, 0F, 1.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-2F, -9.2F, -5.2F, 4, 1, 1, 0F,-0.3F, 0F, -0.6F, -0.3F, 0F, -0.6F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F, -1.3F, 0F, -0.3F); // Box 11
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-1F, -8.5F, -5.2F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0.7F, -0.2F, -0.3F, 0.7F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0.1F, 0.6F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0F, 0.1F, 0.6F, 0F); // Box 12
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(0F, -8.5F, -5.2F, 1, 1, 1, 0F,0.7F, -0.2F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.7F, -0.2F, -0.3F, -1F, 0.6F, 0F, 0.1F, 0.6F, 0F, 0.1F, 0.6F, 0F, -1F, 0.6F, 0F); // Box 13
		headModel[16].setRotationPoint(0F, 0F, 0F);
	}
}