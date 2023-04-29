//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMk7 extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelMk7() //Same as Filename
	{
		headModel = new ModelRendererTurbo[26];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		headModel[3] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 34
		headModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 45
		headModel[5] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 23
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[7] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		headModel[8] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3
		headModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 0
		headModel[11] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 0
		headModel[12] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 1
		headModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		headModel[14] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 9
		headModel[15] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		headModel[16] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 11
		headModel[17] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 12
		headModel[18] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 0
		headModel[19] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 1
		headModel[20] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 2
		headModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 3
		headModel[22] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 4
		headModel[23] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		headModel[24] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		headModel[25] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 7

		headModel[0].addShapeBox(3F, -8F, -4F, 1, 2, 8, 0F,1F, 0.8F, 0.5F, 0.5F, 0.8F, -0.7F, 0.5F, -0.1F, 0.4F, 1F, 0F, 1.3F, 0F, -1F, 1.5F, 1.2F, -1F, 0.5F, 1.2F, 0.8F, 1.2F, 0F, 0.8F, 2F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(3F, -9.9F, -4F, 1, 1, 8, 0F,1.5F, 0.2F, -2.8F, -0.9F, -0.2F, -3.5F, -0.9F, -0.3F, -1.5F, 1.5F, 0F, -0.9F, 1F, 0.1F, 0.5F, 0.5F, 0.1F, -0.7F, 0.5F, 1F, 0.4F, 1F, 0.9F, 1.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-2F, -8F, -4F, 4, 2, 8, 0F,0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 1F, -1F, 1.5F, 1F, -1F, 1.5F, 1F, 0.8F, 2F, 1F, 0.8F, 2F); // Box 32
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-3F, -6.5F, -4.2F, 6, 5, 8, 0F,0F, 0.5F, 1.3F, 0F, 0.5F, 1.3F, 0F, -1.3F, 2.2F, 0F, -1.3F, 2.2F, -0.2F, -3.6F, 1.9F, -0.2F, -3.6F, 1.9F, 0F, 0.5F, 2.2F, 0F, 0.5F, 2.2F); // Box 34
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-2F, -9.9F, -4F, 4, 1, 8, 0F,-0.5F, 0.2F, -2.8F, -0.5F, 0.2F, -2.8F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.9F, 1.3F, 0F, 0.9F, 1.3F); // Box 45
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-5F, -0.8F, -4.1F, 10, 1, 2, 0F,-0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1.1F, 0F, -1.2F, -1.1F, 0F, -1.2F); // Box 23
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(5F, -3F, -2F, 1, 3, 1, 0F,0.2F, 1.2F, 0F, -0.8F, 1.1F, 0F, -0.8F, 0.8F, 0F, 0.2F, 1F, 0F, 1.2F, -0.4F, 1.5F, -1.8F, -0.4F, 1.5F, -1.8F, -0.2F, -1.7F, 1.2F, -0.2F, -1.7F); // Box 0
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(3F, -6.5F, -4.2F, 1, 5, 2, 0F,0F, 0.5F, 1.3F, 1.2F, 0.5F, 0.3F, 1.2F, 0.04F, 0.2F, 1F, -0.8F, 1.5F, 0.2F, -3.6F, 1.9F, 1.4F, -3F, 0.9F, 1.7F, -2.3F, -0.8F, -0.1F, -2F, 1.4F); // Box 2
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(3F, -6.5F, -2F, 1, 5, 1, 0F,2F, -0.8F, 1.5F, 1.2F, 0.04F, 0F, 1.2F, -0.15F, 0F, 0F, 0F, 0.7F, 0F, -3F, 1.4F, 1.7F, -2.3F, 1F, 1.9F, -0.5F, -0.5F, 0F, -2.5F, -0.8F); // Box 3
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(3F, -6.5F, -1F, 1, 5, 4, 0F,0F, -0.5F, 0.7F, 1.2F, -0.15F, 0F, 1.2F, -0.98F, 0.5F, 0F, -1.3F, 2F, 0F, -2.5F, 0.9F, 1.9F, -0.5F, 0.5F, 1.3F, -0.2F, 1F, 0.05F, 0F, 2F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-4F, -0.6F, -4.1F, 8, 1, 1, 0F,-0.8F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F, -0.8F, -0.4F, 0.2F, -1F, -0.1F, 0.2F, -1F, -0.1F, 0.2F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 0
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(5F, -7.2F, -1F, 1, 6, 4, 0F,0.3F, 0.5F, 0.1F, 0.2F, -3.4F, -1F, 0.3F, -3.6F, 0.1F, 0.4F, 0.1F, 0.5F, -0.9F, -0.8F, 0.5F, 0.3F, -0.6F, -0.7F, 0.4F, -0.4F, 0.4F, -0.3F, -0.32F, 1.8F); // Box 0
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(3.2F, -0.8F, -3.1F, 1, 1, 8, 0F,0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, -0.2F, -0.5F, 0.2F, 0.2F, -0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F); // Box 1
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(2.8F, -3.2F, 4F, 1, 2, 1, 0F,3F, -1F, -1F, -3F, -1F, -1F, -3F, -1F, 0.5F, 3F, -1F, 0.5F, -0.2F, 1F, 0F, 0.2F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 0
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-5F, -0.7F, 3F, 10, 1, 2, 0F,-0.8F, -0.4F, 0F, -0.8F, -0.4F, 0F, -0.8F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -1F, -0.1F, 0F, -1F, -0.1F, 0F, -1.1F, 0F, -1.2F, -1.1F, 0F, -1.2F); // Box 9
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-3.8F, -3.2F, 4F, 1, 2, 1, 0F,-3F, -1F, -1F, 3F, -1F, -1F, 3F, -1F, 0.5F, -3F, -1F, 0.5F, -0.2F, 1F, 0F, 0.2F, 1F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Box 10
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4.2F, -0.8F, -3.1F, 1, 1, 8, 0F,0.2F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0.2F, 0.2F, -0.3F, 0.2F, -0.2F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F); // Box 11
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-6F, -3F, -2F, 1, 3, 1, 0F,-0.8F, 1.1F, 0F, 0.2F, 1.2F, 0F, 0.2F, 1F, 0F, -0.8F, 0.8F, 0F, -1.8F, -0.4F, 1.5F, 1.2F, -0.4F, 1.5F, 1.2F, -0.2F, -1.7F, -1.8F, -0.2F, -1.7F); // Box 12
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(3F, -6.5F, 3F, 1, 5, 1, 0F,0F, -0.5F, -0.5F, 1.2F, -0.98F, -0.5F, 1.2F, -1.3F, 1.2F, 0F, -1.3F, 2F, 0F, 0F, -1.5F, 1.8F, -0.2F, -0.5F, 1.3F, 0F, 1F, 0F, 0.5F, 2F); // Box 0
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -6.5F, 3F, 1, 5, 1, 0F,1.2F, -0.98F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.3F, 2F, 1.2F, -1.3F, 1.2F, 1.8F, -0.2F, -0.5F, 0F, 0F, -1.5F, 0F, 0.5F, 2F, 1.3F, 0F, 1F); // Box 1
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-4F, -6.5F, -1F, 1, 5, 4, 0F,1.2F, -0.15F, 0F, 0F, -0.5F, 0.7F, 0F, -1.3F, 2F, 1.2F, -0.98F, 0.5F, 1.9F, -0.5F, 0.5F, 0F, -2.5F, 0.9F, 0.05F, 0F, 2F, 1.3F, -0.2F, 1F); // Box 2
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-4F, -6.5F, -2F, 1, 5, 1, 0F,1.2F, 0.04F, 0F, 2F, -0.8F, 1.5F, 0F, 0F, 0.7F, 1.2F, -0.15F, 0F, 1.7F, -2.3F, 1F, 0F, -3F, 1.4F, 0F, -2.5F, -0.8F, 1.9F, -0.5F, -0.5F); // Box 3
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-4F, -6.5F, -4.2F, 1, 5, 2, 0F,1.2F, 0.5F, 0.3F, 0F, 0.5F, 1.3F, 1F, -0.8F, 1.5F, 1.2F, 0.04F, 0.2F, 1.4F, -3F, 0.9F, 0.2F, -3.6F, 1.9F, -0.1F, -2F, 1.4F, 1.7F, -2.3F, -0.8F); // Box 4
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-4F, -8F, -4F, 1, 2, 8, 0F,0.5F, 0.8F, -0.7F, 1F, 0.8F, 0.5F, 1F, 0F, 1.3F, 0.5F, -0.1F, 0.4F, 1.2F, -1F, 0.5F, 0F, -1F, 1.5F, 0F, 0.8F, 2F, 1.2F, 0.8F, 1.2F); // Box 5
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(-4F, -9.9F, -4F, 1, 1, 8, 0F,-0.9F, -0.2F, -3.5F, 1.5F, 0.2F, -2.8F, 1.5F, 0F, -0.9F, -0.9F, -0.3F, -1.5F, 0.5F, 0.1F, -0.7F, 1F, 0.1F, 0.5F, 1F, 0.9F, 1.3F, 0.5F, 1F, 0.4F); // Box 6
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(-6F, -7.2F, -1F, 1, 6, 4, 0F,0.2F, -3.4F, -1F, 0.3F, 0.5F, 0.1F, 0.4F, 0.1F, 0.5F, 0.3F, -3.6F, 0.1F, 0.3F, -0.6F, -0.7F, -0.9F, -0.8F, 0.5F, -0.3F, -0.32F, 1.8F, 0.4F, -0.4F, 0.4F); // Box 7
		headModel[25].setRotationPoint(0F, 0F, 0F);
	}
}