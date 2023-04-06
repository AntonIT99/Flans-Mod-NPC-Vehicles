//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJapTankHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelJapTankHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[20];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 21
		headModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 25
		headModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 0
		headModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 1
		headModel[5] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 2
		headModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		headModel[7] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 4
		headModel[8] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 5
		headModel[9] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 7
		headModel[11] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 8
		headModel[12] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 9
		headModel[13] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 10
		headModel[14] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		headModel[15] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 12
		headModel[16] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 13
		headModel[17] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 14
		headModel[18] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 15
		headModel[19] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 16

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.1F, 0.15F, 0.4F, 0.1F, 0.15F, 0.4F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0.5F, 0.6F, 0.45F, 0.5F, 0.6F); // Box 20
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8.4F, -4F, 8, 1, 8, 0F,-0.85F, 1.5F, -1.9F, -0.85F, 1.5F, -1.9F, -0.85F, 1.3F, -0.85F, -0.85F, 1.3F, -0.85F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, 0.15F, 0.1F, -0.75F, 0.4F, 0.1F, -0.75F, 0.4F); // Box 21
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -4F, -3F, 8, 4, 1, 0F,0.15F, 0.5F, -0.5F, 0.15F, 0.5F, -0.5F, 0.15F, 0.8F, 0.5F, 0.15F, 0.8F, 0.5F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F); // Box 25
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -4F, -2.2F, 8, 4, 1, 0F,0.15F, 0.5F, -2.3F, 0.15F, 0.5F, -2.3F, 0.15F, 0.4F, 2.5F, 0.15F, 0.4F, 2.5F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F); // Box 0
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -5.8F, -4F, 8, 1, 2, 0F,0.5F, -0.2F, 0.6F, 0.5F, -0.2F, 0.6F, 0.5F, -0.4F, 0.7F, 0.5F, -0.4F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.65F, 0.6F, 0.5F, 0.65F, 0.6F); // Box 1
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -6.6F, -3.9F, 8, 1, 2, 0F,0.4F, -0.8F, 0.5F, 0.4F, -0.8F, 0.5F, 0.4F, -1F, 0.6F, 0.44F, -1F, 0.6F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 0.6F, 0.5F, 0.2F, 0.6F); // Box 2
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -6.2F, -2.5F, 8, 2, 1, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.05F, 0.5F, 0.5F, -0.05F, 0.5F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.6F, 0.05F, 0.2F, 0.6F, 0.05F, 0.2F); // Box 3
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -6.1F, 0F, 8, 2, 1, 0F,0.5F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, -0.05F, 0.3F, 0.5F, -0.05F, 0.3F, 0.6F, 0F, 0.2F, 0.6F, 0F, 0.2F, 0.6F, 0.05F, 0.2F, 0.6F, 0.05F, 0.2F); // Box 4
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -5.65F, 1.1F, 8, 1, 3, 0F,0.5F, -0.2F, 0.6F, 0.5F, -0.2F, 0.6F, 0.5F, -0.4F, 0.7F, 0.5F, -0.4F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.5F, 0.7F, 0.5F, 0.7F, 0.7F, 0.5F, 0.7F, 0.7F); // Box 5
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -6.45F, 1.1F, 8, 1, 3, 0F,0.44F, -0.8F, 0.6F, 0.4F, -0.8F, 0.6F, 0.4F, -1F, 0.5F, 0.4F, -1F, 0.5F, 0.5F, 0F, 0.6F, 0.5F, 0F, 0.6F, 0.5F, 0.2F, 0.7F, 0.5F, 0.2F, 0.7F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -7.2F, -2.2F, 8, 1, 3, 0F,0.4F, 0F, -1F, 0.4F, 0F, -1F, 0.4F, -0.05F, -0.6F, 0.4F, -0.05F, -0.6F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0.15F, 0.5F, 0.5F, 0.15F, 0.5F); // Box 7
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-4F, -6.5F, -4F, 8, 1, 8, 0F,0.35F, 0.15F, 0.35F, 0.35F, 0.15F, 0.35F, 0.35F, -0.2F, 0.59F, 0.35F, -0.2F, 0.59F, 0.4F, 0F, 0.5F, 0.4F, 0F, 0.5F, 0.4F, 0.5F, 0.6F, 0.4F, 0.5F, 0.6F); // Box 8
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-6F, -12.5F, -4.5F, 13, 12, 1, 0F,-5.3F, -5.3F, -0.2F, -6.3F, -5.3F, -0.2F, -6.3F, -5.3F, 0F, -5.3F, -5.3F, 0F, -5.3F, -5.3F, 0F, -6.3F, -5.3F, 0F, -6.3F, -5.3F, 0F, -5.3F, -5.3F, 0F); // Box 9
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-2.1F, -4.3F, -4.8F, 2, 1, 1, 0F,0F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.8F, -0.2F); // Box 10
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-4.1F, -4.3F, -4.8F, 2, 1, 1, 0F,-0.5F, -0.3F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, -0.2F, -0.3F, -0.2F, -0.4F, 0.6F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, -0.1F, 0.6F, -0.2F); // Box 11
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4.4F, -3.8F, -4.5F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F); // Box 12
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.5F, -3.8F, -4F, 9, 1, 8, 0F,-0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, 0.2F, 0.1F, -0.35F, 0.2F, 0.1F, -0.35F, -0.2F, -0.2F, -0.35F, -0.2F, -0.2F, -0.35F, -0.5F, 0.1F, -0.35F, -0.5F, 0.1F); // Box 13
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(2.1F, -4.3F, -4.8F, 2, 1, 1, 0F,0F, -0.1F, -0.2F, -0.5F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, 0F, -0.1F, -0.2F, 0F, 0.8F, -0.2F, -0.4F, 0.6F, -0.2F, -0.1F, 0.6F, -0.2F, 0F, 0.8F, -0.2F); // Box 14
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(0.1F, -4.3F, -4.8F, 2, 1, 1, 0F,0.1F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.3F, -0.2F); // Box 15
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(3.4F, -3.8F, -4.5F, 1, 1, 1, 0F,-0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F, -0.2F, -0.15F, -0.2F); // Box 16
		headModel[19].setRotationPoint(0F, 0F, 0F);
	}
}