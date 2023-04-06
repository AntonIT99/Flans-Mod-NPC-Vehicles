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

public class ModelHanLance extends ModelGun //Same as Filename
{
	int textureX = 128;
	int textureY = 32;

	public ModelHanLance() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[7];

		initgunModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initgunModel_1()
	{
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box0
		gunModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Import Box0
		gunModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Import Box0
		gunModel[4] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Import Box0
		gunModel[5] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Import Box0
		gunModel[6] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 5

		gunModel[0].addShapeBox(-17F, 0F, -2F, 54, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Import Box0
		gunModel[0].setRotationPoint(0F, 0F, 0F);

		gunModel[1].addShapeBox(-0.5F, -0.5F, -0.65F, 1, 1, 1, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F); // Import Box0
		gunModel[1].setRotationPoint(40.2F, 0.5F, -1.65F);
		gunModel[1].rotateAngleX = 3.14159265F;
		gunModel[1].rotateAngleZ = 1.57079633F;

		gunModel[2].addShapeBox(0F, 0F, -1.15F, 1, 4, 2, 0F,-0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 0.5F, -0.4F, -0.45F, 5.5F, -0.3F, -0.45F, 5.5F, -0.3F, -0.45F, 5.5F, -0.3F, -0.45F, 5.5F, -0.3F); // Import Box0
		gunModel[2].setRotationPoint(49.5F, 1F, -1.6F);
		gunModel[2].rotateAngleX = 3.14159265F;
		gunModel[2].rotateAngleY = 0F;
		gunModel[2].rotateAngleZ = 1.57079633F;

		gunModel[3].addShapeBox(0F, 0F, -1.15F, 1, 1, 2, 0F,-0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 0F, -0.95F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F, -0.45F, 1F, -0.4F); // Import Box0
		gunModel[3].setRotationPoint(52F, 1F, -1.6F);
		gunModel[3].rotateAngleX = 3.14159265F;
		gunModel[3].rotateAngleZ = 1.57079633F;

		gunModel[4].addShapeBox(0F, 0F, -0.65F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F, -0.1F, 0.5F, -0.1F); // Import Box0
		gunModel[4].setRotationPoint(40.2F, 1F, -1.65F);
		gunModel[4].rotateAngleX = 3.14159265F;
		gunModel[4].rotateAngleZ = 1.57079633F;

		gunModel[5].addShapeBox(-0.5F, -0.5F, -0.65F, 1, 1, 1, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Import Box0
		gunModel[5].setRotationPoint(40.2F, 0.5F, -1.65F);
		gunModel[5].rotateAngleX = 3.14159265F;
		gunModel[5].rotateAngleZ = 1.57079633F;

		gunModel[6].addShapeBox(-17F, 0F, -2F, 4, 1, 1, 0F,0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F, 0.1F, -0.1F, -0.1F); // Box 5
		gunModel[6].setRotationPoint(0F, 0F, 0F);
	}
}