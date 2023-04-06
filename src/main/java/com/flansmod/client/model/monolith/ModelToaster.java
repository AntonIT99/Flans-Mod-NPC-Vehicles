//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelToaster extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelToaster() //Same as Filename
	{
		headModel = new ModelRendererTurbo[23];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		headModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 20
		headModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 21
		headModel[3] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 22
		headModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 25
		headModel[5] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 0
		headModel[6] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1
		headModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		headModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		headModel[9] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 4
		headModel[10] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 11
		headModel[11] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 12
		headModel[12] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 13
		headModel[13] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 14
		headModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 15
		headModel[15] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 16
		headModel[16] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 17
		headModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 18
		headModel[18] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 19
		headModel[19] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 20
		headModel[20] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		headModel[21] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Box 22
		headModel[22] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 23

		headModel[0].addShapeBox(-4F, -5F, -4F, 8, 1, 4, 0F,0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, -0.4F, 0.3F, 0.8F, -0.4F, 0.3F, 0.8F, -0.6F, 0.8F, 0.8F, -0.6F, 0.8F, 0.8F, -0.2F, 0.3F, 0.8F, -0.2F, 0.3F); // Box 19
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.15F, 0.5F, 0.15F, 0.15F, 0.5F, 0.45F, 0.3F, 0.5F, 0.45F, 0.3F, 0.5F, 0.45F, 0F, 0.6F, 0.45F, 0F, 0.6F); // Box 20
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -8.4F, -4F, 8, 1, 8, 0F,-0.85F, 0.5F, -1.9F, -0.85F, 0.5F, -1.9F, -0.85F, 0.7F, -1.85F, -0.85F, 0.7F, -1.85F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, 0.15F, 0.15F, -0.75F, 0.5F, 0.15F, -0.75F, 0.5F); // Box 21
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -5.1F, -1F, 8, 3, 5, 0F,0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0F, 0.45F, 0F, 0F, 0.45F, 0F, 0.5F, 0.45F, 0F, 0.5F); // Box 22
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -4F, -3.5F, 8, 4, 2, 0F,0.15F, 0.5F, -0.5F, 0.15F, 0.5F, -0.5F, 0.15F, 0.4F, 2F, 0.15F, 0.4F, 2F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F); // Box 25
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3.5F, -2.1F, 3F, 7, 3, 1, 0F,0.15F, 0F, 0.5F, 0.15F, 0F, 0.5F, 0.15F, 0F, 0.5F, 0.15F, 0F, 0.5F, -0.85F, 0F, -1F, -0.85F, 0F, -1F, -0.85F, 0F, 1F, -0.85F, 0F, 1F); // Box 0
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-2.5F, -6.5F, -4.8F, 5, 1, 1, 0F,-0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, -0.5F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, 0.8F, 0.3F, 0.5F, 0.8F, 0.3F, 0.5F); // Box 1
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-3.5F, -8F, -4.3F, 1, 3, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 2
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-3.5F, -8F, 3.7F, 1, 6, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.15F); // Box 3
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-3.5F, -8.4F, -4F, 1, 1, 8, 0F,0F, 1F, -1.6F, 0F, 1F, -1.6F, 0F, 1.2F, -1.55F, 0F, 1.2F, -1.55F, 0F, -0.75F, 0.45F, 0F, -0.75F, 0.45F, 0F, -0.75F, 0.8F, 0F, -0.75F, 0.8F); // Box 4
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1.6F, -8.2F, -4.3F, 1, 3, 1, 0F,0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F); // Box 11
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-1.6F, -8.6F, -4F, 1, 1, 8, 0F,0.1F, 1F, -1.6F, 0.1F, 1F, -1.6F, 0.1F, 1.2F, -1.55F, 0.1F, 1.2F, -1.55F, 0.1F, -0.75F, 0.45F, 0.1F, -0.75F, 0.45F, 0.1F, -0.55F, 0.8F, 0.1F, -0.55F, 0.8F); // Box 12
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1.6F, -8F, 3.7F, 1, 6, 1, 0F,0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F); // Box 13
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-6F, -6F, -2F, 2, 4, 4, 0F,0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F); // Box 14
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4F, -6F, -2F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F); // Box 15
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -8F, -0.6F, 8, 3, 1, 0F,0.45F, 0.15F, 0.4F, 0.45F, 0.15F, 0.4F, 0.45F, 0.15F, 0.4F, 0.45F, 0.15F, 0.4F, 0.75F, 0.3F, 0.4F, 0.75F, 0.3F, 0.4F, 0.75F, 0F, 0.4F, 0.75F, 0F, 0.4F); // Box 16
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -8.4F, -0.6F, 8, 1, 1, 0F,-0.85F, 0.7F, 0.4F, -0.85F, 0.7F, 0.4F, -0.85F, 0.8F, 0.4F, -0.85F, 0.8F, 0.4F, 0.45F, -0.75F, 0.4F, 0.45F, -0.75F, 0.4F, 0.45F, -0.75F, 0.4F, 0.45F, -0.75F, 0.4F); // Box 17
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(0.6F, -8F, 3.7F, 1, 6, 1, 0F,0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F); // Box 18
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(0.6F, -8.6F, -4F, 1, 1, 8, 0F,0.1F, 1F, -1.6F, 0.1F, 1F, -1.6F, 0.1F, 1.2F, -1.55F, 0.1F, 1.2F, -1.55F, 0.1F, -0.75F, 0.45F, 0.1F, -0.75F, 0.45F, 0.1F, -0.55F, 0.8F, 0.1F, -0.55F, 0.8F); // Box 19
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(0.6F, -8.2F, -4.3F, 1, 3, 1, 0F,0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, 0.15F, 0.15F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.5F, 0.1F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F); // Box 20
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(2.5F, -8F, -4.3F, 1, 3, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.15F, 0F, 0F, 0.15F); // Box 21
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(2.5F, -8.4F, -4F, 1, 1, 8, 0F,0F, 1F, -1.6F, 0F, 1F, -1.6F, 0F, 1.2F, -1.55F, 0F, 1.2F, -1.55F, 0F, -0.75F, 0.45F, 0F, -0.75F, 0.45F, 0F, -0.75F, 0.8F, 0F, -0.75F, 0.8F); // Box 22
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(2.5F, -8F, 3.7F, 1, 6, 1, 0F,0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, 0.15F, 0.15F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.15F, 0F, -0.3F, 0.15F); // Box 23
		headModel[22].setRotationPoint(0F, 0F, 0F);
	}
}