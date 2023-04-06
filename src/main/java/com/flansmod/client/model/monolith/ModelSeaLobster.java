//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SeaLobster
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSeaLobster extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public ModelSeaLobster() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[23];
		leftArmModel = new ModelRendererTurbo[3];
		rightArmModel = new ModelRendererTurbo[3];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 39
		bodyModel[1] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 67
		bodyModel[2] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 22
		bodyModel[3] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 23
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 24
		bodyModel[5] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 25
		bodyModel[6] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 26
		bodyModel[7] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 32
		bodyModel[8] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 33
		bodyModel[9] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 34
		bodyModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 35
		bodyModel[11] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 36
		bodyModel[12] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 37
		bodyModel[13] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 38
		bodyModel[14] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 39
		bodyModel[15] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 40
		bodyModel[16] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 41
		bodyModel[17] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 42
		bodyModel[18] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 43
		bodyModel[19] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 44
		bodyModel[20] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 45
		bodyModel[21] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 46
		bodyModel[22] = new ModelRendererTurbo(this, 0, 35, textureX, textureY); // Box 47

		bodyModel[0].addShapeBox(-4F, 0F, -2F, 8, 6, 4, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 39
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 11F, -2F, 8, 5, 4, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F, 0.8F, 0.5F, 0.8F); // Box 67
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 3F, -2F, 4, 3, 4, 0F,0.25F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 22
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-4F, 4.5F, -2F, 4, 3, 4, 0F,0.4F, 0F, 0.4F, 0F, 1F, 0.4F, 0F, 1F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 23
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 6F, -2F, 4, 3, 4, 0F,0.5F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 24
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 7.5F, -2F, 4, 2, 4, 0F,0.6F, 0F, 0.6F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0F, -1F, 0.6F, 0F, -1F, 0.6F, 0.6F, 0F, 0.6F); // Box 25
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, 9F, -2F, 4, 3, 4, 0F,0.7F, 0F, 0.7F, 0F, 1F, 0.7F, 0F, 1F, 0.7F, 0.7F, 0F, 0.7F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 26
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4F, 11F, -2F, 8, 1, 4, 0F,0.6F, 0F, 0.7F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.7F, 0.6F, 0F, 0.7F); // Box 32
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 9F, -2F, 4, 3, 4, 0F,0F, 1F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0F, 1F, 0.7F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 33
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 7.5F, -2F, 4, 2, 4, 0F,0F, 1F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0F, 1F, 0.6F, 0F, -1F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0F, -1F, 0.6F); // Box 34
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 6F, -2F, 4, 3, 4, 0F,0F, 1F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 35
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(0F, 4.5F, -2F, 4, 3, 4, 0F,0F, 1F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 1F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 36
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(0F, 3F, -2F, 4, 3, 4, 0F,0F, 1F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 37
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 8.8F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F); // Box 38
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-4F, 5.8F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F); // Box 39
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 2.8F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F); // Box 40
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-4F, 4.3F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F); // Box 41
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 7.3F, -2F, 4, 1, 4, 0F,0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F); // Box 42
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(0F, 7.3F, -2F, 4, 1, 4, 0F,0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F); // Box 43
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(0F, 8.8F, -2F, 4, 1, 4, 0F,0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F); // Box 44
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(0F, 5.8F, -2F, 4, 1, 4, 0F,0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F); // Box 45
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(0F, 4.3F, -2F, 4, 1, 4, 0F,0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F); // Box 46
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(0F, 2.8F, -2F, 4, 1, 4, 0F,0F, 1F, 0.8F, 0.8F, 0F, 0.8F, 0.8F, 0F, 0.8F, 0F, 1F, 0.8F, 0F, -1.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0.6F, -0.5F, 0.6F, 0F, -1.5F, 0.6F); // Box 47
		bodyModel[22].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 21
		leftArmModel[1] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 65
		leftArmModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 66

		leftArmModel[0].addShapeBox(-1F, -2F, -2F, 4, 7, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 21
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1.5F, -2.2F, -2F, 3, 4, 4, 0F,-1F, 0.5F, 0.8F, 2F, 0F, 0.8F, 2F, 0F, 0.8F, -1F, 0.5F, 0.8F, 0F, -1.5F, 1.2F, -0.7F, -0.5F, 0.8F, -0.7F, -0.5F, 0.8F, 0F, -1.5F, 1.2F); // Box 65
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, -0.7F, -2F, 4, 2, 4, 0F,-0.7F, 0.2F, 0.2F, 0.3F, 1.5F, 0.2F, 0.3F, 1.5F, 0.2F, -0.7F, 0.2F, 0.2F, -1F, -0.2F, 0.4F, 1F, -1F, 0.4F, 1F, -1F, 0.4F, -1F, -0.2F, 0.4F); // Box 66
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		rightArmModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 34
		rightArmModel[2] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 39

		rightArmModel[0].addShapeBox(-3F, -2F, -2F, 4, 7, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 20
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-1.5F, -2.2F, -2F, 3, 4, 4, 0F,2F, 0F, 0.8F, -1F, 0.5F, 0.8F, -1F, 0.5F, 0.8F, 2F, 0F, 0.8F, -0.7F, -0.5F, 0.8F, 0F, -1.5F, 1.2F, 0F, -1.5F, 1.2F, -0.7F, -0.5F, 0.8F); // Box 34
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -0.7F, -2F, 4, 2, 4, 0F,0.3F, 1.5F, 0.2F, -0.7F, 0.2F, 0.2F, -0.7F, 0.2F, 0.2F, 0.3F, 1.5F, 0.2F, 1F, -1F, 0.4F, -1F, -0.2F, 0.4F, -1F, -0.2F, 0.4F, 1F, -1F, 0.4F); // Box 39
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);
	}
}