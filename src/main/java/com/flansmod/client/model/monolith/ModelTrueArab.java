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

public class ModelTrueArab extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelTrueArab() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[13];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 3
		gunModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 4
		gunModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		gunModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 8
		gunModel[4] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 9
		gunModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 10
		gunModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		gunModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 10
		gunModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 0
		gunModel[9] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 1
		gunModel[10] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 1
		gunModel[11] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 2
		gunModel[12] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 12

		gunModel[0].addShapeBox(0F, 0F, -0.7F, 1, 5, 1, 0F,-0.15F, 0.2F, 0.05F, -0.15F, 0.2F, 0.05F, -0.15F, 0.2F, 0.25F, -0.15F, 0.2F, 0.25F, -0.15F, 0.2F, -0.25F, -0.15F, 0.2F, -0.25F, -0.15F, 0.2F, -0.05F, -0.15F, 0.2F, -0.05F); // Box 3
		gunModel[0].setRotationPoint(0.2F, -2.5F, 0.5F);
		gunModel[0].rotateAngleY = -1.04719755F;

		gunModel[1].addShapeBox(0F, 2F, -0.5F, 1, 1, 1, 0F,-0.15F, -0.2F, -0.05F, -0.15F, -0.2F, -0.05F, -0.15F, 0F, -0.2F, -0.15F, 0F, -0.2F, -0.15F, -0.2F, -1.2F, -0.15F, -0.2F, -1.2F, -0.15F, -0.6F, 0.7F, -0.15F, -0.6F, 0.7F); // Box 4
		gunModel[1].setRotationPoint(0.2F, 0.5F, 0.5F);
		gunModel[1].rotateAngleY = -1.04719755F;

		gunModel[2].addShapeBox(0F, 0F, -0.65F, 1, 1, 1, 0F,0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, -0.45F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.7F); // Box 0
		gunModel[2].setRotationPoint(0.2F, -3.7F, 0.5F);
		gunModel[2].rotateAngleY = -1.04719755F;

		gunModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.45F, 0.5F, 0F, -0.45F, 0.5F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F); // Box 8
		gunModel[3].setRotationPoint(0.2F, -3.5F, 0.5F);
		gunModel[3].rotateAngleY = -1.04719755F;

		gunModel[4].addShapeBox(0F, 0F, -2.3F, 1, 1, 2, 0F,0F, -0.45F, 0.5F, 0F, -0.45F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, 0.5F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 9
		gunModel[4].setRotationPoint(0.2F, -3.5F, 0.5F);
		gunModel[4].rotateAngleY = -1.04719755F;

		gunModel[5].addShapeBox(0F, 0F, 1.9F, 1, 1, 1, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 10
		gunModel[5].setRotationPoint(0.2F, -3.9F, 0.5F);
		gunModel[5].rotateAngleY = -1.04719755F;

		gunModel[6].addShapeBox(0F, 0F, -3.1F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 11
		gunModel[6].setRotationPoint(0.2F, -3.9F, 0.5F);
		gunModel[6].rotateAngleY = -1.04719755F;

		gunModel[7].addShapeBox(0F, 0F, -0.65F, 1, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F, 0F, -0.2F, -0.45F); // Box 10
		gunModel[7].setRotationPoint(0.2F, -2.7F, 0.5F);
		gunModel[7].rotateAngleY = -1.04719755F;

		gunModel[8].addShapeBox(0F, 0F, 1.9F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[8].setRotationPoint(0.2F, -4.9F, 0.5F);
		gunModel[8].rotateAngleY = -1.04719755F;

		gunModel[9].addShapeBox(0F, 0F, -3.1F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Box 1
		gunModel[9].setRotationPoint(0.2F, -4.9F, 0.5F);
		gunModel[9].rotateAngleY = -1.04719755F;

		gunModel[10].addShapeBox(0F, 0F, -1.15F, 1, 12, 2, 0F,-0.45F, -0.5F, -0.15F, -0.45F, -0.5F, -0.15F, -0.45F, -0.5F, -0.15F, -0.45F, -0.5F, -0.15F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F); // Box 1
		gunModel[10].setRotationPoint(0.2F, -22.3F, 0.5F);
		gunModel[10].rotateAngleY = -1.04719755F;

		gunModel[11].addShapeBox(0F, 0F, -1.15F, 1, 4, 2, 0F,-0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 1F, -0.15F, -0.45F, 1F, -0.15F, -0.45F, 1F, -0.15F, -0.45F, 1F, -0.15F); // Box 2
		gunModel[11].setRotationPoint(0.2F, -26.8F, 0.5F);
		gunModel[11].rotateAngleY = -1.04719755F;

		gunModel[12].addShapeBox(0F, 0F, -1.15F, 1, 9, 2, 0F,-0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, -0.1F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F, -0.45F, -0.5F, 0.05F); // Box 12
		gunModel[12].setRotationPoint(0.2F, -11.3F, 0.5F);
		gunModel[12].rotateAngleY = -1.04719755F;
	}
}