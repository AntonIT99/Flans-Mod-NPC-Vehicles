//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelTigerSkin extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelTigerSkin() //Same as Filename
	{
		headModel = new ModelRendererTurbo[22];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 28
		headModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 17
		headModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		headModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 20
		headModel[4] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 26
		headModel[6] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 27
		headModel[7] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 28
		headModel[8] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 29
		headModel[9] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 30
		headModel[10] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 31
		headModel[11] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 32
		headModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		headModel[13] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 1
		headModel[14] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		headModel[15] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 3
		headModel[16] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 4
		headModel[17] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 5
		headModel[18] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 6
		headModel[19] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 7
		headModel[20] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 8
		headModel[21] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 9

		headModel[0].addShapeBox(-4F, -12.5F, -5.5F, 16, 16, 6, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -8F, -8F, 0F, -8F, -8F, 0F, 0F, -8F, 0F); // Box 28
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2F, -8.5F, -8.5F, 8, 8, 7, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, -4F, -4F, 0F, -4F, -4F, -4F, 0F, -4F, -4F); // Box 17
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.5F, -12F, -0.5F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 19
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -14.5F, -2F, 6, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F); // Box 20
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-3.5F, -10F, 1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -8F, -3F, 8, 8, 7, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 1.1F, 0F, 0.5F, 1.1F, 0F, 0.5F, 1.1F, 0F, 1.1F, 1.1F, 0F, 1.1F); // Box 26
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-3.5F, -8F, -2.5F, 7, 4, 2, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(2.75F, -1F, -4.1F, 2, 6, 2, 0F,0F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, 0F, 0F, 5F, -1F, 0F, -5.5F, -0.5F, 0F, -5.5F, -0.5F, 0F, 5F, -1F, 0F); // Box 28
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5.25F, -1F, -4F, 2, 6, 2, 0F,-0.3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.5F, 0F, -5.5F, -0.5F, 0F, 5F, -1F, 0F, 5F, -1F, 0F, -5.5F, -0.5F, 0F); // Box 29
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5F, 0F, 2F, 10, 9, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, 9F, 2F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 31
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1F, 11F, 3F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 32
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -15F, -2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-1F, -13.5F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1F, -14F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 2
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(0.5F, -14F, -2F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 3
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(1F, -15F, -2F, 3, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 4
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-5F, 8.5F, -1.5F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-1.8F, -4.5F, -6.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.49F, 0F, -0.49F, -0.49F, 0F, -0.49F, -0.49F, 0F, -0.49F, -0.49F, 0F, -0.49F); // Box 6
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(0.8F, -4.5F, -6.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.49F, 0F, -0.49F, -0.49F, 0F, -0.49F, -0.49F, 0F, -0.49F, -0.49F, 0F, -0.49F); // Box 7
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(1F, -14.5F, -2F, 6, 4, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -2F, 0F, -3F, -2F, 0F, 0F, -2F, 0F); // Box 8
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-5F, 8.5F, -3.5F, 10, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		headModel[21].setRotationPoint(0F, 0F, 0F);
	}
}