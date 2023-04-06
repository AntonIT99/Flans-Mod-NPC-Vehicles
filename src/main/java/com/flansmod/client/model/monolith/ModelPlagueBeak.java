//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPlagueBeak extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPlagueBeak() //Same as Filename
	{
		headModel = new ModelRendererTurbo[25];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 136
		headModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 202
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 203
		headModel[3] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 204
		headModel[4] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 205
		headModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 206
		headModel[6] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 207
		headModel[7] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 218
		headModel[8] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 219
		headModel[9] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 18
		headModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		headModel[11] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 3
		headModel[12] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 4
		headModel[13] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 5
		headModel[14] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 6
		headModel[15] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 7
		headModel[16] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 8
		headModel[17] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 9
		headModel[18] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 10
		headModel[19] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 11
		headModel[20] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 12
		headModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 13
		headModel[22] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 14
		headModel[23] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 15
		headModel[24] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 16

		headModel[0].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.7F, 0.9F, 0.9F, -0.3F, 0.9F, 0.9F, -0.3F, 0.9F); // Box 136
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-5F, -6.4F, -7.8F, 10, 2, 3, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 202
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-5F, -6F, 4.8F, 10, 2, 3, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 203
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(4.9F, -6.4F, -4.8F, 3, 2, 10, 0F,0F, -0.7F, 0F, 0F, -1.5F, 0F, 0F, -1.9F, -0.3F, 0F, -1.1F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 204
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-7.9F, -6.4F, -4.8F, 3, 2, 10, 0F,0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -1.1F, -0.3F, 0F, -1.9F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.1F, -0.3F, 0F, 0.1F, -0.3F); // Box 205
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-8.01F, -6.4F, -7.8F, 3, 2, 3, 0F,-1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -1.5F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 206
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(5.01F, -6.4F, -7.8F, 3, 2, 3, 0F,0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 207
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(5.01F, -6F, 4.91F, 3, 2, 3, 0F,0F, -0.7F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -1.5F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 218
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-8.01F, -6F, 4.91F, 3, 2, 3, 0F,0F, -1.5F, 0F, 0F, -0.7F, 0F, 0F, -1.5F, 0F, -1F, -1.5F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -1F, -0.3F, -1F); // Box 219
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -7F, -4F, 8, 2, 8, 0F,1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -9F, -4F, 8, 2, 8, 0F,1.5F, 0.2F, 1.4F, 1.5F, 0.2F, 1.4F, 1.5F, 0F, 1.6F, 1.5F, 0F, 1.6F, 0.9F, 0.1F, 0.9F, 0.9F, 0.1F, 0.9F, 0.9F, 0.1F, 0.9F, 0.9F, 0.1F, 0.9F); // Box 2
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -6F, -3F, 8, 6, 7, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 3
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3.5F, -4F, -4.5F, 3, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 4
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-3.5F, -4.6F, -4.5F, 3, 1, 1, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 5
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3.5F, -3.4F, -4.5F, 3, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Box 6
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(0.5F, -4.6F, -4.5F, 3, 1, 1, 0F,-1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 7
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(0.5F, -4F, -4.5F, 3, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 8
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(0.5F, -3.4F, -4.5F, 3, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1F, -0.1F, 0F); // Box 9
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -6F, -4F, 8, 6, 2, 0F,0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F); // Box 10
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-2F, -2.5F, -7F, 4, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F); // Box 11
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1F, -3.5F, -7F, 2, 1, 3, 0F,0F, -0.99F, 0F, 0F, -0.99F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-2.5F, -1F, -7F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 13
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-2F, -2.5F, -9F, 4, 1, 2, 0F,-1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, 2F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 14
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-2.5F, -1.01F, -9.01F, 5, 1, 2, 0F,-1F, -1.49F, 0F, -1F, -1.49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 15
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-1.5F, -1.5F, -11F, 3, 2, 2, 0F,-1.499F, -2.99F, 0F, -1.499F, -2.99F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.499F, 1F, 0F, -1.499F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		headModel[24].setRotationPoint(0F, 0F, 0F);
	}
}