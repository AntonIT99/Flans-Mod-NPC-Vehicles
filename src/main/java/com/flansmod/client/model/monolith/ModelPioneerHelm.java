//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPioneerHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 128;

	public ModelPioneerHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[28];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 6
		headModel[7] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 17
		headModel[8] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 18
		headModel[9] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 28
		headModel[10] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 0
		headModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 1
		headModel[12] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 2
		headModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 3
		headModel[14] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		headModel[15] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 5
		headModel[16] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 6
		headModel[17] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 7
		headModel[18] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 8
		headModel[19] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 39
		headModel[20] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 39
		headModel[21] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 15
		headModel[22] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 16
		headModel[23] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 17
		headModel[24] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 18
		headModel[25] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 19
		headModel[26] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 10
		headModel[27] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Box 21

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -9.8F, -4F, 8, 1, 8, 0F,-2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6F, -4F, 8, 2, 8, 0F,1.1F, -0.5F, 1.1F, 1.1F, -0.5F, 1.1F, 1.1F, -0.5F, 1.1F, 1.1F, -0.5F, 1.1F, 1.1F, -0.5F, 1.1F, 1.1F, -0.5F, 1.1F, 1.1F, -0.3F, 1.1F, 1.1F, -0.3F, 1.1F); // Box 0
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -6F, 0.5F, 1, 2, 4, 0F,0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.3F, 0.9F, 0F, -0.3F, 0.9F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -8F, -4.5F, 1, 3, 9, 0F,0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -6F, -4.5F, 1, 3, 1, 0F,0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 1.5F, 0F, -0.5F, 1.5F, 0F, -0.7F, 0.9F, 0F, -0.7F, 0.9F, 0F, -0.5F, 0.9F, 0F, -0.5F, 0.9F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -10.3F, -4.5F, 1, 1, 9, 0F,0F, -0.2F, -2.4F, 0F, -0.2F, -2.4F, 0F, -0.2F, -2.4F, 0F, -0.2F, -2.4F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F, 0F, 1F, 0.3F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-1F, -5F, -4.5F, 1, 1, 1, 0F,0.5F, -0.2F, 0.7F, -0.9F, -0.2F, 0.7F, -0.9F, -0.2F, -0.7F, 0.5F, -0.2F, -0.7F, -0.4F, 0F, 0.7F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.7F, -0.4F, 0F, -0.7F); // Box 17
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3.2F, -5.2F, -4.5F, 2, 1, 1, 0F,-0.3F, -0.5F, 0.7F, -0.3F, -0.3F, 0.7F, -0.3F, -0.3F, -0.7F, -0.3F, -0.5F, -0.7F, 0.5F, -0.1F, 0.7F, 0.5F, -0.3F, 0.7F, 0.5F, -0.3F, -0.7F, 0.5F, -0.1F, -0.7F); // Box 18
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-0.5F, -4F, -4.9F, 1, 3, 1, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0F, -0.3F, 1.1F, 0F, -0.3F, 1.1F, 0F, -0.3F, -1.6F, 0F, -0.3F, -1.6F); // Box 28
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5F, -5F, -4F, 1, 3, 8, 0F,0.1F, -0.5F, 1.1F, 0.9F, -0.5F, 1.1F, 0.9F, -0.5F, 1.1F, 0.1F, -0.5F, 1.1F, 0.1F, -0.5F, 1.1F, -0.1F, -0.5F, 1.1F, -0.1F, 0F, 1.1F, 0.1F, 0F, 1.1F); // Box 0
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -5F, -4F, 1, 3, 8, 0F,0.9F, -0.5F, 1.1F, 0.1F, -0.5F, 1.1F, 0.1F, -0.5F, 1.1F, 0.9F, -0.5F, 1.1F, -0.1F, -0.5F, 1.1F, 0.1F, -0.5F, 1.1F, 0.1F, 0F, 1.1F, -0.1F, 0F, 1.1F); // Box 1
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-3F, -5F, 3F, 6, 3, 1, 0F,1.1F, -0.5F, -0.1F, 1.1F, -0.5F, -0.1F, 1.1F, -0.5F, 1.1F, 1.1F, -0.5F, 1.1F, 1.1F, -0.1F, -0.1F, 1.1F, -0.1F, -0.1F, 1.1F, 0F, 1.1F, 1.1F, 0F, 1.1F); // Box 2
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4.2F, -4.5F, -4.5F, 1, 2, 1, 0F,-0.5F, -0.2F, 0.7F, 0.1F, -0.1F, 0.7F, 0.1F, -0.1F, -0.7F, -0.5F, -0.2F, -0.7F, 0F, 0F, 0.7F, -0.6F, 0F, 0.7F, -0.6F, 0F, -0.7F, 0F, 0F, -0.7F); // Box 3
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(3.2F, -4.5F, -4.5F, 1, 2, 1, 0F,0.1F, -0.1F, 0.7F, -0.5F, -0.2F, 0.7F, -0.5F, -0.2F, -0.7F, 0.1F, -0.1F, -0.7F, -0.6F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -0.7F, -0.6F, 0F, -0.7F); // Box 4
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(1.2F, -5.2F, -4.5F, 2, 1, 1, 0F,-0.3F, -0.3F, 0.7F, -0.3F, -0.5F, 0.7F, -0.3F, -0.5F, -0.7F, -0.3F, -0.3F, -0.7F, 0.5F, -0.3F, 0.7F, 0.5F, -0.1F, 0.7F, 0.5F, -0.1F, -0.7F, 0.5F, -0.3F, -0.7F); // Box 5
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(0F, -5F, -4.5F, 1, 1, 1, 0F,-0.9F, -0.2F, 0.7F, 0.5F, -0.2F, 0.7F, 0.5F, -0.2F, -0.7F, -0.9F, -0.2F, -0.7F, -0.2F, 0F, 0.7F, -0.4F, 0F, 0.7F, -0.4F, 0F, -0.7F, -0.2F, 0F, -0.7F); // Box 6
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -9.8F, -0.5F, 8, 1, 1, 0F,-1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, -1.7F, 0.3F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 7
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -7.8F, -0.5F, 8, 2, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0.5F, 0F); // Box 8
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4.85F, -3F, -4.25F, 1, 4, 4, 0F,0F, -0.5F, 0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -1.5F); // Box 39
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(3.85F, -3F, -4.25F, 1, 4, 4, 0F,0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.3F, -0.5F, -1.5F, -0.3F, -0.5F, -1.5F); // Box 39
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-0.5F, -11F, 0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 15
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-0.5F, -11F, -1.2F, 1, 1, 1, 0F,-0.2F, 0F, -0.25F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F); // Box 16
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-0.5F, -12F, -0.9F, 1, 1, 2, 0F,-0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, -0.6F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 17
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-0.5F, -12F, -2.3F, 1, 1, 1, 0F,-0.2F, -0.6F, -0.2F, -0.2F, -0.6F, -0.2F, -0.2F, -0.4F, 0.2F, -0.2F, -0.4F, 0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F); // Box 18
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-5F, -5.3F, -0.5F, 10, 1, 1, 0F,0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 19
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-5F, -4.5F, 4F, 20, 14, 1, 0F,-0.2F, 0F, -0.3F, -10.2F, 0F, -0.3F, -10.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, -7F, -1.3F, -10.2F, -7F, -1.3F, -10.2F, -7F, 0.7F, -0.2F, -7F, 0.7F); // Box 10
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(-0.5F, -13F, -0.9F, 1, 2, 2, 0F,-0.4F, -0.2F, 0.5F, -0.4F, -0.2F, 0.5F, -0.4F, -0.8F, 0.3F, -0.4F, -0.8F, 0.3F, -0.4F, 0F, 0.4F, -0.4F, 0F, 0.4F, -0.4F, 0F, 0.1F, -0.4F, 0F, 0.1F); // Box 21
		headModel[27].setRotationPoint(0F, 0F, 0F);
	}
}