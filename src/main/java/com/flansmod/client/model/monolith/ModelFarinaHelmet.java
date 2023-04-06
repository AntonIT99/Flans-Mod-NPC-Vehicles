//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelFarinaHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelFarinaHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[27];
		bodyModel = new ModelRendererTurbo[2];

		initheadModel_1();
		initbodyModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		headModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 18
		headModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 22
		headModel[3] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 31
		headModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 32
		headModel[5] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 42
		headModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 43
		headModel[7] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 44
		headModel[8] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 45
		headModel[9] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 47
		headModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 48
		headModel[11] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 23
		headModel[12] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 26
		headModel[13] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 27
		headModel[14] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 31
		headModel[15] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 33
		headModel[16] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 11
		headModel[17] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 12
		headModel[18] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 7
		headModel[19] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 39
		headModel[20] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 41
		headModel[21] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 43
		headModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 44
		headModel[23] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 45
		headModel[24] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 46
		headModel[25] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 47
		headModel[26] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 48

		headModel[0].addShapeBox(-4F, -6.5F, -4F, 2, 2, 4, 0F,0.9F, 0.8F, 1F, -0.5F, 1F, 1.7F, 0.9F, 0.2F, 0.9F, 1.2F, 0.2F, 0.9F, 1.4F, 0F, 1.7F, 0.4F, 0F, 2.2F, 0.4F, 1.4F, 1F, 2.1F, 1.4F, 0.5F); // Box 2
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, -4F, 2, 2, 8, 0F,0.2F, 0.6F, -0.5F, 1F, 0.6F, 0.2F, 1F, -0.1F, 0.8F, 0.2F, -0.1F, 0.3F, 0.9F, -0.5F, 0.7F, 0F, -0.5F, 1.7F, 0F, 0.3F, 1.5F, 0.9F, 0.3F, 1F); // Box 18
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -9.9F, -4F, 2, 1, 8, 0F,-1.2F, -0.3F, -2.5F, 1F, 0F, -2.2F, 1F, -0.6F, -0.7F, -1.2F, -0.8F, -1.2F, 0.2F, 0.3F, -0.5F, 1F, 0.3F, 0.2F, 1F, 1F, 0.8F, 0.2F, 1F, 0.3F); // Box 22
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-1F, -9.9F, -4F, 2, 1, 8, 0F,0.2F, 0.2F, -2.2F, 0.2F, 0.2F, -2.2F, 0.2F, -0.4F, -0.7F, 0.2F, -0.4F, -0.7F, -0.3F, 0.15F, 0.1F, -0.3F, 0.15F, 0.1F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F); // Box 31
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-1F, -8F, -4F, 2, 2, 8, 0F,0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, -0.1F, 0.8F, 0F, -0.1F, 0.8F, 1F, -0.5F, 1.7F, 1F, -0.5F, 1.7F, 1F, 0.3F, 1.5F, 1F, 0.3F, 1.5F); // Box 32
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -10.5F, -4F, 1, 1, 8, 0F,-0.1F, 0.1F, -2.6F, -0.1F, 0.1F, -2.6F, -0.1F, -0.5F, -0.7F, -0.1F, -0.5F, -0.7F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1.4F, 1.2F, 0F, 1.4F, 1.2F); // Box 42
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-0.5F, -8.7F, -2F, 1, 2, 6, 0F,0F, 0.6F, 0.2F, 0F, 0.6F, 0.2F, 0F, -0.6F, 1.2F, 0F, -0.6F, 1.2F, 1F, -0.5F, 1.7F, 1F, -0.5F, 1.7F, 0F, 1F, 1.9F, 0F, 1F, 1.9F); // Box 43
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-0.5F, -5.7F, 4F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F); // Box 44
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-1F, -9.9F, -4F, 2, 1, 8, 0F,0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, -0.6F, -0.7F, 0F, -0.6F, -0.7F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 1F, 0.8F, 0F, 1F, 0.8F); // Box 45
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-1F, -7.3F, 2F, 2, 1, 2, 0F,0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, 0.2F, 0.8F, 0.8F, 0.2F, 0.8F, 0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 1.6F, 0.2F, 0.5F, 1.6F); // Box 47
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-1F, -5.3F, 2F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.5F, 1.6F, 0.2F, 0.5F, 1.6F, 0F, 0.15F, 0.1F, 0F, 0.15F, 0.1F, -0.2F, 0.4F, 1.5F, -0.2F, 0.4F, 1.5F); // Box 48
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-5F, -4F, -1F, 10, 4, 1, 0F,-0.3F, 0.2F, 1F, -0.3F, 0.2F, 1F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.9F, 0.4F, 2.7F, -0.9F, 0.4F, 2.7F, -0.9F, 0.7F, -3F, -0.9F, 0.7F, -3F); // Box 23
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-1F, -6.5F, -4F, 2, 2, 4, 0F,1.5F, 1F, 1.7F, 1.5F, 1F, 1.7F, 0.1F, 0.2F, 0.9F, 0.1F, 0.2F, 0.9F, 0.6F, 0F, 2.2F, 0.6F, 0F, 2.2F, 0.6F, 1.4F, 1F, 0.6F, 1.4F, 1F); // Box 26
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -4.5F, -4F, 2, 1, 4, 0F,1.4F, 0F, 1.7F, -0.6F, 0F, 2.1F, -0.6F, -1.4F, 1F, 2.1F, -1.4F, 0.5F, 1.8F, 0.8F, 2F, -1F, 0.5F, 2.5F, -0.1F, 2F, 0.9F, 2.3F, 2F, 0.3F); // Box 27
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-1F, -6.5F, 1F, 2, 1, 4, 0F,0.1F, 0.2F, 0.9F, 0.1F, 0.2F, 0.9F, 1.5F, 0F, 0.9F, 1.5F, 0F, 0.9F, 0.6F, 1.4F, 1F, 0.6F, 1.4F, 1F, 0.6F, 2F, 1.2F, 0.6F, 2F, 1.2F); // Box 31
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-4F, -6.5F, 1F, 2, 1, 4, 0F,0.8F, 0.2F, 0.9F, 0.9F, 0.2F, 0.9F, -0.5F, 0F, 0.9F, 0.9F, -0.2F, 0F, 1.5F, 1.4F, 0.5F, 0.4F, 1.4F, 1F, 0.4F, 2F, 1.2F, 1.4F, 2F, 0.2F); // Box 33
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-4F, -1F, -4F, 16, 5, 4, 0F,0.1F, -0.2F, 0.1F, -7.9F, -0.2F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -3.9F, 0.1F, -7.9F, -3.9F, 0.1F, -7.9F, -1.9F, 0.1F, 0.1F, -1.9F, 0.1F); // Box 11
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-4F, -5F, -3F, 16, 10, 7, 0F,0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -5.7F, 1.1F, -7.9F, -5.7F, 1.1F, -7.9F, -5.9F, 0.1F, 0.1F, -5.9F, 0.1F); // Box 12
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-4F, -1F, 0F, 16, 5, 4, 0F,0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -1.9F, 0.1F, -7.9F, -1.9F, 0.1F, -7.9F, -3.9F, 0.1F, 0.1F, -3.9F, 0.1F); // Box 7
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-4F, -5F, -3F, 10, 10, 7, 0F,0.1F, 0F, 1.5F, -9.9F, 0F, 1.5F, -7.9F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, -5.7F, 1.1F, -7.5F, -6.7F, 1.1F, -7.9F, -5.9F, 0.1F, 0.1F, -5.9F, 0.1F); // Box 39
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-1.5F, -1.7F, -4.1F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F); // Box 41
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(2F, -4.5F, -4F, 2, 1, 4, 0F,-0.6F, 0F, 2.1F, 1.4F, 0F, 1.7F, 2.1F, -1.4F, 0.5F, -0.6F, -1.4F, 1F, -1F, 0.5F, 2.5F, 1.8F, 0.8F, 2F, 2.3F, 2F, 0.3F, -0.1F, 2F, 0.9F); // Box 43
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(2F, -6.5F, -4F, 2, 2, 4, 0F,-0.5F, 1F, 1.7F, 0.9F, 0.8F, 1F, 1.2F, 0.2F, 0.9F, 0.9F, 0.2F, 0.9F, 0.4F, 0F, 2.2F, 1.4F, 0F, 1.7F, 2.1F, 1.4F, 0.5F, 0.4F, 1.4F, 1F); // Box 44
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(2F, -6.5F, 1F, 2, 1, 4, 0F,0.9F, 0.2F, 0.9F, 0.8F, 0.2F, 0.9F, 0.9F, -0.2F, 0F, -0.5F, 0F, 0.9F, 0.4F, 1.4F, 1F, 1.5F, 1.4F, 0.5F, 1.4F, 2F, 0.2F, 0.4F, 2F, 1.2F); // Box 45
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(2F, -8F, -4F, 2, 2, 8, 0F,1F, 0.6F, 0.2F, 0.2F, 0.6F, -0.5F, 0.2F, -0.1F, 0.3F, 1F, -0.1F, 0.8F, 0F, -0.5F, 1.7F, 0.9F, -0.5F, 0.7F, 0.9F, 0.3F, 1F, 0F, 0.3F, 1.5F); // Box 46
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(2F, -9.9F, -4F, 2, 1, 8, 0F,1F, 0F, -2.2F, -1.2F, -0.3F, -2.5F, -1.2F, -0.8F, -1.2F, 1F, -0.6F, -0.7F, 1F, 0.3F, 0.2F, 0.2F, 0.3F, -0.5F, 0.2F, 1F, 0.3F, 1F, 1F, 0.8F); // Box 47
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(-6F, -5F, -3F, 10, 10, 7, 0F,-9.9F, 0F, 1.5F, 0.1F, 0F, 1.5F, 0.1F, 0F, 0.1F, -7.9F, 0F, 0.1F, -7.5F, -6.7F, 1.1F, 0.1F, -5.7F, 1.1F, 0.1F, -5.9F, 0.1F, -7.9F, -5.9F, 0.1F); // Box 48
		headModel[26].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 297
		bodyModel[1] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 42

		bodyModel[0].addShapeBox(-4.8F, -0.4F, -2F, 5, 6, 4, 0F,0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, 0.5F, -1F, -4F, 0.5F, 0F, -2F, 0.7F, 0F, -2F, 0.7F, -1F, -4F, 0.5F); // Box 297
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(0.2F, -0.4F, -2F, 5, 6, 4, 0F,0F, 0F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, 0.7F, -1F, -4F, 0.5F, -1F, -4F, 0.5F, 0F, -2F, 0.7F); // Box 42
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}
}