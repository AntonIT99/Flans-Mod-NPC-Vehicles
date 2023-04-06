//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJaguarHead extends ModelCustomArmour //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelJaguarHead() //Same as Filename
	{
		headModel = new ModelRendererTurbo[30];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 6
		headModel[2] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 7
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 8
		headModel[4] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 9
		headModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 10
		headModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		headModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 12
		headModel[8] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 51
		headModel[9] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 53
		headModel[10] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 54
		headModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 55
		headModel[12] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 50
		headModel[13] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 52
		headModel[14] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 35
		headModel[15] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 36
		headModel[16] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 37
		headModel[17] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 39
		headModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 40
		headModel[19] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 41
		headModel[20] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 42
		headModel[21] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 43
		headModel[22] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 45
		headModel[23] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 46
		headModel[24] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 47
		headModel[25] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 48
		headModel[26] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 49
		headModel[27] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 51
		headModel[28] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 52
		headModel[29] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 54

		headModel[0].addShapeBox(-4F, -9F, -5F, 8, 5, 10, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 5
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -4F, -5F, 1, 4, 10, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 6
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(3F, -4F, -5F, 1, 4, 10, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 7
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addBox(-3F, -4F, 4F, 6, 4, 1, 0F); // Box 8
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addBox(-5.5F, -8F, -3F, 11, 5, 2, 0F); // Box 9
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2.5F, -7.5F, -7F, 5, 3, 4, 0F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4.5F, -10.5F, -2.5F, 2, 3, 1, 0F, 0.9F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.9F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(2.5F, -10.5F, -2.5F, 2, 3, 1, 0F, -1F, 0F, 0F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-0.5F, -10.5F, 3.5F, 1, 1, 3, 0F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 51
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-0.5F, -9.8F, 6.5F, 1, 3, 1, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 2.5F, 0.8F, 0F, 2.5F); // Box 53
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(-0.5F, -6.8F, 8.5F, 1, 3, 1, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.9F, 0.3F, -1F, 0.9F, 0.3F, -1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 54
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(-0.5F, -3.8F, 9.5F, 1, 4, 1, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 55
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-0.5F, -9.8F, 2.5F, 1, 1, 1, 0F, 0.3F, 0.5F, -0.7F, 0.3F, 0.5F, -0.7F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-0.5F, -9.8F, 6.5F, 1, 1, 1, 0F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0.3F, 0.8F, -1F, 0.3F, 0.8F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 52
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-0.5F, -1.8F, 6.5F, 1, 3, 1, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 2.5F, 0.8F, 0F, 2.5F); // Box 35
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, 1.2F, 8.5F, 1, 3, 1, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.9F, 0.3F, -1F, 0.9F, 0.3F, -1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 36
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-0.5F, 4.2F, 9.5F, 1, 4, 1, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 37
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(-0.5F, -1.8F, 6.5F, 1, 1, 1, 0F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0.3F, 0.8F, -1F, 0.3F, 0.8F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 39
		headModel[17].setRotationPoint(0F, 0F, 0F);

		headModel[18].addShapeBox(-0.5F, -2.5F, 3.5F, 1, 1, 3, 0F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 40
		headModel[18].setRotationPoint(0F, 0F, 0F);

		headModel[19].addShapeBox(-3.5F, -5.8F, 6.5F, 1, 3, 1, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 2.5F, 0.8F, 0F, 2.5F); // Box 41
		headModel[19].setRotationPoint(0F, 0F, 0F);

		headModel[20].addShapeBox(-3.5F, -2.8F, 8.5F, 1, 3, 1, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.9F, 0.3F, -1F, 0.9F, 0.3F, -1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 42
		headModel[20].setRotationPoint(0F, 0F, 0F);

		headModel[21].addShapeBox(-3.5F, 0.200000000000001F, 9.5F, 1, 4, 1, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 43
		headModel[21].setRotationPoint(0F, 0F, 0F);

		headModel[22].addShapeBox(-3.5F, -5.8F, 6.5F, 1, 1, 1, 0F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0.3F, 0.8F, -1F, 0.3F, 0.8F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 45
		headModel[22].setRotationPoint(0F, 0F, 0F);

		headModel[23].addShapeBox(-3.5F, -6.5F, 3.5F, 1, 1, 3, 0F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 46
		headModel[23].setRotationPoint(0F, 0F, 0F);

		headModel[24].addShapeBox(2.5F, -5.8F, 6.5F, 1, 3, 1, 0F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.8F, 0F, -2F, 0.8F, 0F, -2F, 0.8F, 0F, 2.5F, 0.8F, 0F, 2.5F); // Box 47
		headModel[24].setRotationPoint(0F, 0F, 0F);

		headModel[25].addShapeBox(2.5F, -2.8F, 8.5F, 1, 3, 1, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.9F, 0.3F, -1F, 0.9F, 0.3F, -1F, 0.9F, 0F, 1.5F, 0.9F, 0F, 1.5F); // Box 48
		headModel[25].setRotationPoint(0F, 0F, 0F);

		headModel[26].addShapeBox(2.5F, 0.200000000000001F, 9.5F, 1, 4, 1, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F); // Box 49
		headModel[26].setRotationPoint(0F, 0F, 0F);

		headModel[27].addShapeBox(2.5F, -5.8F, 6.5F, 1, 1, 1, 0F, 0.3F, -0.3F, 1.3F, 0.3F, -0.3F, 1.3F, 0.3F, 0.8F, -1F, 0.3F, 0.8F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F); // Box 51
		headModel[27].setRotationPoint(0F, 0F, 0F);

		headModel[28].addShapeBox(2.5F, -6.5F, 3.5F, 1, 1, 3, 0F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F); // Box 52
		headModel[28].setRotationPoint(0F, 0F, 0F);

		headModel[29].addShapeBox(-4F, -1F, -5F, 8, 1, 10, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F); // Box 54
		headModel[29].setRotationPoint(0F, 0F, 0F);


	}
}