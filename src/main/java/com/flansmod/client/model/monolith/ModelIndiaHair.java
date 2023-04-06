//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelIndiaHair extends ModelCustomArmour //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelIndiaHair() //Same as Filename
	{
		headModel = new ModelRendererTurbo[11];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 21
		headModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		headModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		headModel[4] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 2
		headModel[5] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 3
		headModel[6] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 4
		headModel[7] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 5
		headModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		headModel[9] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 7
		headModel[10] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 8

		headModel[0].addShapeBox(-2.7F, -4.8F, -3.9F, 2, 1, 1, 0F, -0.2F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, -0.5F, -0.3F, 0.2F, -0.3F, -0.3F, 0.2F, 0.1F, 0F, 0.2F, 0F, -0.2F, 0.2F, 0F, 0F, 0.2F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-2F, -2.5F, -4.05F, 2, 1, 1, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 21
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-3.2F, -4.8F, -3.9F, 1, 1, 1, 0F, 0.2F, -0.6F, 0.2F, -0.3F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.6F, 0.2F, 0.3F, -0.1F, 0.2F, 0.4F, -0.4F, 0.2F, 0F, 0F, 0.2F, 0F, -0.4F, 0.2F); // Box 0
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-0.5F, -5.3F, -4.02F, 1, 1, 1, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F, -0.1F, -0.3F, 0F); // Box 1
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-2.5F, -2.2F, -4.05F, 1, 1, 1, 0F, -0.2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.4F, -0.2F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 2
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-2.5F, -2.2F, -4.05F, 1, 1, 1, 0F, 0.2F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.3F, -0.4F, 0F, -0.6F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(2.2F, -4.8F, -3.9F, 1, 1, 1, 0F, -0.3F, -0.3F, 0.2F, 0.2F, -0.6F, 0.2F, 0F, -0.6F, 0.2F, 0F, -0.3F, 0.2F, 0.4F, -0.4F, 0.2F, 0.3F, -0.1F, 0.2F, 0F, -0.4F, 0.2F, 0F, 0F, 0.2F); // Box 4
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(0.7F, -4.8F, -3.9F, 2, 1, 1, 0F, 0F, -0.5F, 0.2F, -0.2F, -0.3F, 0.2F, -0.5F, -0.3F, 0.2F, 0F, -0.5F, 0.2F, 0.1F, 0F, 0.2F, -0.3F, -0.3F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, 0.2F); // Box 5
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(0F, -2.5F, -4.05F, 2, 1, 1, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 6
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(1.5F, -2.2F, -4.05F, 1, 1, 1, 0F, 0F, 0F, 0F, -0.2F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, -0.4F, -0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 7
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(1.5F, -2.2F, -4.05F, 1, 1, 1, 0F, -0.5F, -0.4F, 0F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.6F, -0.2F, 0F, 0.3F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 8
		headModel[10].setRotationPoint(0F, 0F, 0F);


	}
}