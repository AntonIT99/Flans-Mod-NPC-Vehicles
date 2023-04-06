//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNasalHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelNasalHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[22];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 259
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 27
		headModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[5] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 49
		headModel[6] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 21
		headModel[7] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		headModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import Box24
		headModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box31
		headModel[10] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Import Box32
		headModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box33
		headModel[12] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Import Box34
		headModel[13] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Import Box35
		headModel[14] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Import Box39
		headModel[15] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Import Box40
		headModel[16] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Import Box41
		headModel[17] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Import Box42
		headModel[18] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Import Box45
		headModel[19] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Import Box46
		headModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Import Box47
		headModel[21] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Import Box48

		headModel[0].addShapeBox(-4F, -8F, -4F, 8, 3, 8, 0F,0.3F, 0.8F, 0.3F, 0.3F, 0.8F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F, 0.8F, -0.5F, 0.8F, 0.8F, -0.5F, 0.8F, 0.8F, -0.2F, 0.8F, 0.8F, -0.2F, 0.8F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -5F, -4F, 8, 1, 8, 0F,1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, -0.8F, 1F, 1F, -0.8F, 1F, 1F, -0.4F, 1F, 1F, -0.4F, 1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 259
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -5.5F, -4F, 8, 1, 8, 0F,0.95F, 0F, 0.95F, 0.95F, 0F, 0.95F, 0.95F, -0.3F, 0.95F, 0.95F, -0.3F, 0.95F, 0.95F, 0F, 0.95F, 0.95F, 0F, 0.95F, 0.95F, 0.4F, 0.95F, 0.95F, 0.4F, 0.95F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -5.8F, -5.45F, 1, 4, 1, 0F,0F, -0.3F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, -0.2F, -0.3F, -0.4F, -0.2F, -0.3F, -0.4F, -0.2F, 0F, 0.2F, -0.2F); // Box 27
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -11F, -4F, 8, 2, 8, 0F,-2.5F, 0.6F, -2.7F, -2.5F, 0.6F, -2.7F, -2.5F, 0.4F, -2.3F, -2.5F, 0.4F, -2.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.2F, 0.3F, 0.3F, 0.5F, 0.3F, 0.3F, 0.5F, 0.3F); // Box 22
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -12.3F, -0.3F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 1F, -0.3F, 1F, 1F, -0.3F, 1F, 1F, -0.1F, 1F, 1F, -0.1F, 1F); // Box 49
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-1F, -5.8F, -5.45F, 1, 4, 1, 0F,-0.3F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.4F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.3F, -0.4F, -0.2F); // Box 21
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-5F, -5F, -1F, 10, 5, 1, 0F,-0.3F, 0F, -1F, -0.3F, 0F, -1F, -0.3F, 0F, 2F, -0.3F, 0F, 2F, -0.8F, 0.25F, 2.7F, -0.8F, 0.25F, 2.7F, -0.8F, 0.25F, -3F, -0.8F, 0.25F, -3F); // Box 23
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-5.1F, -4F, -5.3F, 1, 3, 10, 0F,-0.4F, 0.5F, -1F, -0.4F, 0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box24
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-5.1F, -1F, -2.3F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Import Box31
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-5.1F, -1F, -5.3F, 1, 1, 3, 0F,-0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.5F, -0.4F, 0F, -1.5F, -0.4F, 0F, 0F, 1.6F, 0F, 0F); // Import Box32
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5.1F, -1F, 1.7F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box33
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-5F, -4F, 4.2F, 10, 5, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F, -0.3F, 0.3F, -0.4F); // Import Box34
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-5F, 1.3F, 4.2F, 10, 3, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -1.3F, 0F, -0.4F, -1.3F, 0F, -0.4F, -1.3F, 0F, -0.4F, -1.3F, 0F, -0.4F); // Import Box35
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(4.1F, -4F, -5.3F, 1, 3, 10, 0F,-0.4F, 0.5F, -1F, -0.4F, 0.5F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box39
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(4.1F, -1F, 1.7F, 1, 1, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Import Box40
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(4.1F, -1F, -2.3F, 1, 1, 4, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 1.6F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Import Box41
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(4.1F, -1F, -5.3F, 1, 1, 3, 0F,-0.4F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.5F, -0.4F, 0F, -1.5F, 1.6F, 0F, 0F, -0.4F, 0F, 0F); // Import Box42
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-5.1F, 0F, 1.6F, 1, 1, 3, 0F,1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Import Box45
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-5.1F, 1.3F, 1.6F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -1.4F, -1F, 0F, 0.6F, -1F, 0F, 0.6F, 0F, 0F, -1.4F, 0F, 0F); // Import Box46
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(4.1F, 0F, 1.6F, 1, 1, 3, 0F,-0.4F, 0F, 0F, 1.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F); // Import Box47
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(4.1F, 1.3F, 1.6F, 1, 3, 3, 0F,-0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0.6F, -1F, 0F, -1.4F, -1F, 0F, -1.4F, 0F, 0F, 0.6F, 0F, 0F); // Import Box48
		headModel[21].setRotationPoint(0F, 0F, 0F);
	}
}