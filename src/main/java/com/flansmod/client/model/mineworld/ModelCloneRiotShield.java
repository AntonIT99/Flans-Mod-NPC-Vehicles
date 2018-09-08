//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.2
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: CloneRiotShield
// Model Creator: 
// Created on: -
// Last changed on: -

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelCloneRiotShield extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelCloneRiotShield() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[8];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportImportImport
		gunModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Import ImportBox0
		gunModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import ImportBox1
		gunModel[3] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Import ImportBox2
		gunModel[4] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Import ImportBox3
		gunModel[5] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Import ImportBox5
		gunModel[6] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Import ImportBox6
		gunModel[7] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import ImportBox7

		gunModel[0].addBox(0F, 0F, 0F, 1, 7, 12, 0F); // Import ImportImportImport
		gunModel[0].setRotationPoint(1F, 5F, 9F);
		gunModel[0].rotateAngleX = 3.14159265F;

		gunModel[1].addShapeBox(0F, -24F, 0F, 1, 14, 3, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox0
		gunModel[1].setRotationPoint(1F, -5F, 9F);
		gunModel[1].rotateAngleX = 3.14159265F;

		gunModel[2].addBox(0F, 6F, 0F, 1, 2, 3, 0F); // Import ImportBox1
		gunModel[2].setRotationPoint(1F, 4F, 9F);
		gunModel[2].rotateAngleX = 3.14159265F;

		gunModel[3].addShapeBox(0F, 6F, -1F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import ImportBox2
		gunModel[3].setRotationPoint(1F, 4F, 5F);
		gunModel[3].rotateAngleX = 3.14159265F;

		gunModel[4].addShapeBox(0F, 6F, 0F, 1, 2, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox3
		gunModel[4].setRotationPoint(1F, 4F, 2F);
		gunModel[4].rotateAngleX = 3.14159265F;

		gunModel[5].addBox(0F, 6F, 0F, 1, 2, 3, 0F); // Import ImportBox5
		gunModel[5].setRotationPoint(1F, 4F, 0F);
		gunModel[5].rotateAngleX = 3.14159265F;

		gunModel[6].addShapeBox(0F, -24F, 0F, 1, 14, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import ImportBox6
		gunModel[6].setRotationPoint(1F, -5F, 0F);
		gunModel[6].rotateAngleX = 3.14159265F;

		gunModel[7].addBox(0F, 0F, 0F, 1, 14, 6, 0F); // Import ImportBox7
		gunModel[7].setRotationPoint(1F, 19F, 6F);
		gunModel[7].rotateAngleX = 3.14159265F;



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}