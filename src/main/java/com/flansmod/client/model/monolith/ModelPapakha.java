//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPapakha extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPapakha() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 21
		headModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 5
		headModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		headModel[4] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 0
		headModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 2
		headModel[6] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 3
		headModel[7] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 4
		headModel[8] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 5
		headModel[9] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 6
		headModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7

		headModel[0].addShapeBox(-3F, -2.5F, -4F, 3, 1, 1, 0F,0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F); // Box 21
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(0F, -2.5F, -4F, 3, 1, 1, 0F,0F, -0.3F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0.5F, 0.7F, 0.2F, 0.5F, 0.7F, 0.2F, 0F, -0.3F, 0.2F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.5F, -2F, 8, 2, 5, 0F,0F, 0.5F, 3.5F, 0F, 0.5F, 3.5F, 0F, -1.2F, 3.3F, 0F, -1.2F, 3.3F, 0F, -0.7F, 3.9F, 0F, -0.7F, 3.9F, 0F, 1.3F, 2.9F, 0F, 1.3F, 2.9F); // Box 5
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-5F, -3.7F, -5F, 1, 1, 11, 0F,1F, 1.2F, -1.1F, 0F, 1.5F, 0.9F, 0F, -0.5F, -0.1F, 1F, -0.2F, -2.1F, 0.6F, -1.6F, -1.4F, 0F, -2F, 0.6F, 0F, 0.1F, -0.4F, 0.6F, -0.1F, -2.4F); // Box 7
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-6F, -6.5F, -5F, 2, 2, 11, 0F,0.2F, 0.3F, -1.6F, 0F, 0.5F, 0.5F, 0F, -1.2F, 0.3F, 0.2F, -1F, -1.7F, 0F, -0.4F, -1.1F, 0F, -0.7F, 0.9F, 0F, 1.3F, -0.1F, 0F, 1F, -2.1F); // Box 0
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-3F, -3.7F, -5F, 7, 1, 11, 0F,1F, 1.5F, 0.9F, 0F, 1.5F, 0.9F, 0F, -0.5F, -0.1F, 1F, -0.5F, -0.1F, 1F, -2F, 0.6F, 0F, -2F, 0.6F, 0F, 0.1F, -0.4F, 1F, 0.1F, -0.4F); // Box 2
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -11.5F, -2F, 8, 4, 5, 0F,0F, -0.7F, 3F, 0F, -0.7F, 3F, 0F, -2.7F, 4.2F, 0F, -2.7F, 4.2F, 0F, 0.5F, 3.5F, 0F, 0.5F, 3.5F, 0F, 2.2F, 3.3F, 0F, 2.2F, 3.3F); // Box 3
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-6F, -10.5F, -5F, 2, 4, 11, 0F,0.5F, -0.3F, -2.2F, 0F, 0.3F, 0F, 0F, -1.7F, 1.2F, 0.5F, -1.6F, -1.1F, 0.2F, -0.3F, -1.6F, 0F, -0.5F, 0.5F, 0F, 1.2F, 0.3F, 0.2F, 1F, -1.7F); // Box 4
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(4F, -10.5F, -5F, 2, 4, 11, 0F,0F, 0.3F, 0F, 0.5F, -0.3F, -2.2F, 0.5F, -1.6F, -1.1F, 0F, -1.7F, 1.2F, 0F, -0.5F, 0.5F, 0.2F, -0.3F, -1.6F, 0.2F, 1F, -1.7F, 0F, 1.2F, 0.3F); // Box 5
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(4F, -6.5F, -5F, 2, 2, 11, 0F,0F, 0.5F, 0.5F, 0.2F, 0.3F, -1.6F, 0.2F, -1F, -1.7F, 0F, -1.2F, 0.3F, 0F, -0.7F, 0.9F, 0F, -0.4F, -1.1F, 0F, 1F, -2.1F, 0F, 1.3F, -0.1F); // Box 6
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -3.7F, -5F, 1, 1, 11, 0F,0F, 1.5F, 0.9F, 1F, 1.2F, -1.1F, 1F, -0.2F, -2.1F, 0F, -0.5F, -0.1F, 0F, -2F, 0.6F, 0.6F, -1.6F, -1.4F, 0.6F, -0.1F, -2.4F, 0F, 0.1F, -0.4F); // Box 7
		headModel[10].setRotationPoint(0F, 0F, 0F);
	}
}