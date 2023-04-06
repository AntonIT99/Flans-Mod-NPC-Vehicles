//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMontefortino extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelMontefortino() //Same as Filename
	{
		headModel = new ModelRendererTurbo[20];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 259
		headModel[3] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		headModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 39
		headModel[5] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 40
		headModel[6] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 41
		headModel[7] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 42
		headModel[8] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		headModel[9] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 24
		headModel[10] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 0
		headModel[11] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 1
		headModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 2
		headModel[13] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 3
		headModel[14] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 4
		headModel[15] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 5
		headModel[16] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 6
		headModel[17] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 7
		headModel[18] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 8
		headModel[19] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // Box 9

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 2, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5F, -4F, 8, 1, 8, 0F,1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, -0.8F, 1F, 1F, -0.8F, 1F, 1.3F, -0.4F, 1F, 1.3F, -0.4F, 1F, 1.3F, 0.8F, 1F, 1.3F, 0.8F, 1F); // Box 259
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -6.5F, -4F, 8, 2, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0.4F, 0.9F, 0.9F, 0.4F, 0.9F); // Box 28
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-5F, -1F, -4F, 1, 2, 3, 0F,-0.8F, -0.5F, 0.8F, 1.3F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F, -1.5F, -0.3F, 0F, 1F, -0.3F, 0F, 0.7F, -0.3F, -0.5F, -1F, -0.3F, -0.5F); // Box 39
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -2F, -4F, 1, 2, 3, 0F,-0.3F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 1F, 0F, 0F, 1F, -0.8F, -0.5F, 0.8F, 1.3F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F); // Box 40
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-5F, -3.5F, -4F, 1, 2, 3, 0F,0F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, -0.5F, 0F, 0.7F, -0.5F, 0F, 0.7F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 41
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -4.5F, -4F, 1, 1, 3, 0F,0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 42
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5F, -4.6F, 5F, 10, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.8F, 0F, -1F, -0.8F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F); // Box 23
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -4.2F, 6F, 8, 1, 1, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, -3F, -1F, 0F, -3F, -1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -3F, 0.3F, 0F, -3F, 0.3F, 0F); // Box 24
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -4.5F, -4F, 1, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 0
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -3.5F, -4F, 1, 2, 3, 0F,0.4F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.7F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.5F, 1F, 0.7F, -0.5F, 1F); // Box 1
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(4F, -2F, -4F, 1, 2, 3, 0F,0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 1F, 0.7F, 0F, 1F, 1.3F, -0.5F, 0.8F, -0.8F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F); // Box 2
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(4F, -1F, -4F, 1, 2, 3, 0F,1.3F, -0.5F, 0.8F, -0.8F, -0.5F, 0.8F, -0.2F, -0.5F, 0.8F, 0.7F, -0.5F, 0.8F, 1F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1F, -0.3F, -0.5F, 0.7F, -0.3F, -0.5F); // Box 3
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4F, -0.8F, -3.9F, 8, 1, 8, 0F,0.1F, -0.7F, 0.1F, 0.1F, -0.7F, 0.1F, 0.3F, 3F, 0.1F, 0.3F, 3F, 0.1F, -0.1F, 0F, 0.1F, -0.1F, 0F, 0.1F, 0.1F, -3F, 0.1F, 0.1F, -3F, 0.1F); // Box 4
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-2F, -10.8F, -2F, 4, 1, 4, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 5
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-2F, -11.5F, -2F, 4, 1, 4, 0F,-0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F); // Box 6
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-1F, -19.5F, -0.5F, 2, 8, 1, 0F,-0.5F, -0.1F, -0.8F, -0.5F, -0.1F, -0.8F, -0.5F, -0.1F, 0.3F, -0.5F, -0.1F, 0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 7
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1.8F, -18.5F, -0.2F, 2, 7, 1, 0F,1.5F, -1.1F, -1F, -2.5F, -0.6F, -1F, -2.5F, -0.6F, 0.5F, 1.5F, -1.1F, 0.5F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 8
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-0.2F, -18.5F, -0.2F, 2, 7, 1, 0F,-2.5F, -0.6F, -1F, 1.5F, -1.1F, -1F, 1.5F, -1.1F, 0.5F, -2.5F, -0.6F, 0.5F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F, -0.3F, -0.1F, -0.3F); // Box 9
		headModel[19].setRotationPoint(0F, 0F, 0F);
	}
}