//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelPalmyraHelm extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelPalmyraHelm() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];

		initheadModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		headModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 22
		headModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 28
		headModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		headModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		headModel[5] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 2
		headModel[6] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 3

		headModel[0].addShapeBox(-4F, -7.8F, -4F, 8, 2, 8, 0F,0.2F, 0.8F, 0.3F, 0.2F, 0.8F, 0.3F, 0.2F, 0.8F, 0.3F, 0.2F, 0.8F, 0.3F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F, 0.9F, -0.5F, 0.9F); // Box 18
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -10.1F, -4F, 8, 1, 8, 0F,-1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F, 0.2F, 0.5F, 0.3F); // Box 22
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -6.3F, -4F, 8, 2, 8, 0F,0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F, 0.9F, 0F, 0.9F); // Box 28
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-2F, -12.1F, -2F, 4, 2, 4, 0F,-1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, -1.2F, -0.5F, -1.2F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 0
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-0.5F, -13.5F, -0.5F, 1, 2, 1, 0F,-0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 1
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -4.3F, -1.1F, 8, 3, 6, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F); // Box 2
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -1.3F, -1.1F, 8, 1, 6, 0F,0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, 0F, 0F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, -1F, 0.9F, -0.5F, 0F, 0.9F, -0.5F, 0F); // Box 3
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}
}