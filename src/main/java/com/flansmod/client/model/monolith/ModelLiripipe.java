//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelLiripipe extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelLiripipe() //Same as Filename
	{
		headModel = new ModelRendererTurbo[7];
		bodyModel = new ModelRendererTurbo[2];
		leftArmModel = new ModelRendererTurbo[1];
		rightArmModel = new ModelRendererTurbo[1];

		initheadModel_1();
		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
	}

	private void initheadModel_1()
	{
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		headModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		headModel[2] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 2
		headModel[3] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 3
		headModel[4] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 4
		headModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		headModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 6

		headModel[0].addShapeBox(-4F, -8F, -3F, 8, 8, 8, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F); // Box 0
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -8F, 7F, 8, 8, 1, 0F,0F, 0F, 1F, 0F, 0F, 1F, -3F, -4.5F, 0F, -3F, -4.5F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, -3F, 3.8F, 0F, -3F, 3.8F, 0F); // Box 1
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-4F, -3F, 8F, 8, 6, 1, 0F,-3F, 0.5F, 0F, -3F, 0.5F, 0F, -3.5F, -10F, 1F, -3.5F, -10F, 1F, -3F, 0.8F, 0F, -3F, 0.8F, 0F, -3.5F, 5F, 1F, -3.5F, 5F, 1F); // Box 2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(-4F, -8.01F, -4.01F, 8, 1, 1, 0F,0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.55F, 0F, 0F, 0.55F, 0F, 0F); // Box 3
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -0.69F, -4.01F, 8, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, 0F); // Box 4
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-4F, -7F, -4F, 1, 6, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, 0F, 0.3F, 0F, 0.75F, 0.3F, 0F); // Box 5
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(3.5F, -7F, -4F, 1, 6, 1, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.05F, 0F, 0F, 0.55F, 0F, 0F, 0F, 0.3F, 0.5F, -0.5F, 0.3F, 0.5F, 0.25F, 0.3F, 0F, 0.75F, 0.3F, 0F); // Box 6
		headModel[6].setRotationPoint(0F, 0F, 0F);
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 294
		bodyModel[1] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 297

		bodyModel[0].addShapeBox(-0.5F, -0.4F, -2F, 5, 2, 4, 0F,-0.3F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.4F, 3F, 0.7F, 0.2F, 2F, 0.5F, 0.2F, 2F, 0.5F, -0.5F, 3F, 0.7F); // Box 294
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4.8F, -0.4F, -2F, 5, 2, 4, 0F,0.2F, 0F, 0.5F, -0.3F, 0F, 0.5F, -0.3F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 2F, 0.5F, -0.3F, 3F, 0.7F, -0.5F, 3F, 0.7F, 0.2F, 2F, 0.5F); // Box 297
		bodyModel[1].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 296

		leftArmModel[0].addShapeBox(-0.0999999999999996F, -2.4F, -2F, 2, 1, 4, 0F,0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 3F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 3F, 0.5F); // Box 296
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 298

		rightArmModel[0].addShapeBox(-2.1F, -2.4F, -2F, 2, 1, 4, 0F,-0.4F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, -0.4F, 0F, 0.5F, 0F, 0.7F, 0.5F, 0.2F, 3F, 0.5F, 0.2F, 3F, 0.5F, 0F, 0.7F, 0.5F); // Box 298
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);
	}
}