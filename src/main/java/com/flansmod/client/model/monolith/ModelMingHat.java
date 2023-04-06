//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingHat extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMingHat() //Same as Filename
	{
		headModel = new ModelRendererTurbo[24];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 51
		headModel[4] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 53
		headModel[5] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 54
		headModel[6] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 55
		headModel[7] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 133
		headModel[8] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 134
		headModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 50
		headModel[10] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 52
		headModel[11] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 138
		headModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 139
		headModel[13] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 140
		headModel[14] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 143
		headModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 144
		headModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 13
		headModel[17] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 90
		headModel[18] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 91
		headModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 92
		headModel[20] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 94
		headModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 95
		headModel[22] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 96
		headModel[23] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 97

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-0.5F, -10.8F, -0.5F, 1, 1, 1, 0F,0.3F, 0.3F, 0.3F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.3F, 0.3F, 0.3F, 1.3F, 0F, 1.3F, 1.2F, 0F, 1.2F, 1.2F, 0F, 1.2F, 1.3F, 0F, 1.3F); // Box 49
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -12.5F, 0.5F, 1, 1, 3, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 51
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -11.8F, 3.5F, 1, 3, 1, 0F,0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 2.5F, 0.8F, 0F, 2.5F); // Box 53
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -8.8F, 5.5F, 1, 3, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.9F, 0.3F, -1F, 0.9F, 0.3F, -1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 54
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -5.8F, 6.5F, 1, 4, 1, 0F,0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 55
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -6F, -3F, 1, 5, 7, 0F,0.9F, -0.5F, 0.9F, 0.2F, -0.5F, 0.9F, 0.2F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F); // Box 133
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3F, -6F, -3F, 1, 5, 7, 0F,0.2F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.2F, -0.5F, 0.9F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F); // Box 134
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-0.5F, -11.8F, -0.5F, 1, 1, 1, 0F,0.3F, 0.5F, -0.7F, 0.3F, 0.5F, -0.7F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.5F, -11.8F, 3.5F, 1, 1, 1, 0F,0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0.3F, 0.8F, -1F, 0.3F, 0.8F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 52
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1F, -9F, -4F, 2, 4, 1, 0F,0.2F, -0.1F, 0.3F, 0.2F, -0.1F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 138
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -10F, -3F, 1, 4, 1, 0F,0.2F, -0.1F, 0.3F, 0.2F, -0.1F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 139
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, -8F, -2F, 1, 4, 3, 0F,0.9F, -1.5F, 0.9F, -1F, -1.5F, 0.9F, -1.6F, -0.5F, 0.9F, 1.5F, -0.5F, 0.9F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F); // Box 140
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-3F, -6F, 1F, 6, 5, 3, 0F,0.2F, -0.5F, 0.9F, 0.2F, -0.5F, 0.9F, 0.2F, -0.5F, 0.9F, 0.2F, -0.5F, 0.9F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F); // Box 143
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4F, -8F, -2F, 1, 4, 3, 0F,-1F, -1.5F, 0.9F, 0.9F, -1.5F, 0.9F, 1.5F, -0.5F, 0.9F, -1.6F, -0.5F, 0.9F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F); // Box 144
		headModel[15].setRotationPoint(0F, 0F, 0F);
//aaaa
		headModel[16].addShapeBox(3F, -4F, 0.4F, 1, 5, 4, 0F,0F, -0.2F, -1.2F, 0.4F, -0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -3.7F, 3.4F, 0.7F, 0.3F, 2.6F, -0.7F, 2.7F, 0F, -0.7F, 3.1F); // Box 13
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(0F, -4F, 3.4F, 3, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.8F, -1.5F, 0F, -0.3F, -0.7F, 0F, -0.7F, 3.1F, 0F, -0.7F, 3.1F); // Box 90
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -4F, 0.4F, 1, 5, 4, 0F,0.4F, -0.2F, 0.3F, 0F, -0.2F, -1.2F, 0F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 3.4F, 0.7F, 0.3F, 0F, -0.3F, -3.7F, 0F, -0.7F, 3.1F, 2.6F, -0.7F, 2.7F); // Box 91
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-3F, -4F, 3.4F, 3, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -0.7F, 0F, -0.8F, -1.5F, 0F, -0.7F, 3.1F, 0F, -0.7F, 3.1F); // Box 92
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3F, -4.5F, 0.4F, 1, 5, 4, 0F,0F, -0.2F, -1.2F, 0.4F, -0.2F, 0.3F, 0.4F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -3.7F, 3.4F, 0.7F, 0.3F, 2.6F, -0.7F, 2.7F, 0F, -0.7F, 3.1F); // Box 94
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(0F, -4.5F, 3.4F, 3, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.8F, -1.5F, 0F, -0.3F, -0.7F, 0F, -0.7F, 3.1F, 0F, -0.7F, 3.1F); // Box 95
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-3F, -4.5F, 3.4F, 3, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.3F, -0.7F, 0F, -0.8F, -1.5F, 0F, -0.7F, 3.1F, 0F, -0.7F, 3.1F); // Box 96
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4F, -4.5F, 0.4F, 1, 5, 4, 0F,0.4F, -0.2F, 0.3F, 0F, -0.2F, -1.2F, 0F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 3.4F, 0.7F, 0.3F, 0F, -0.3F, -3.7F, 0F, -0.7F, 3.1F, 2.6F, -0.7F, 2.7F); // Box 97
		headModel[23].setRotationPoint(0F, 0F, 0F);


	}
}