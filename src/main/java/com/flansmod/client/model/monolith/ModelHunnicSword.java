//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHunnicSword extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelHunnicSword() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[5];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box1
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import Box2
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import Box3
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import Box4
		gunModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 5

		gunModel[0].addShapeBox(0F, 0F, -1.15F, 1, 9, 2, 0F,-0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 5.5F, -0.3F, -0.45F, 5.5F, -0.3F, -0.45F, 5.5F, -0.3F, -0.45F, 5.5F, -0.3F); // Import Box1
		gunModel[0].setRotationPoint(0.2F, -17F, 0.5F);
		gunModel[0].rotateAngleY = -1.04719755F;

		gunModel[1].addShapeBox(0F, 0F, -1.15F, 1, 2, 2, 0F,-0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F); // Import Box2
		gunModel[1].setRotationPoint(0.2F, -20.5F, 0.5F);
		gunModel[1].rotateAngleY = -1.04719755F;

		gunModel[2].addShapeBox(0F, 0F, -0.65F, 1, 4, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F); // Import Box3
		gunModel[2].setRotationPoint(0.2F, -2.5F, 0.5F);
		gunModel[2].rotateAngleY = -1.04719755F;

		gunModel[3].addShapeBox(0F, 0F, -0.65F, 1, 1, 1, 0F,0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F); // Import Box4
		gunModel[3].setRotationPoint(0.2F, 1.5F, 0.5F);
		gunModel[3].rotateAngleY = -1.04719755F;

		gunModel[4].addShapeBox(0F, 0F, -0.65F, 1, 1, 1, 0F,0.1F, -0.15F, 0.6F, 0.1F, -0.15F, 0.6F, 0.1F, -0.15F, 0.6F, 0.1F, -0.15F, 0.6F, 0.1F, -0.15F, 0.6F, 0.1F, -0.15F, 0.6F, 0.1F, -0.15F, 0.6F, 0.1F, -0.15F, 0.6F); // Box 5
		gunModel[4].setRotationPoint(0.2F, -3F, 0.5F);
		gunModel[4].rotateAngleY = -1.04719755F;
	}
}