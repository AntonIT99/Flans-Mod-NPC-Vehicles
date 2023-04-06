//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: gothicPlate
// Model Creator: 
// Created on: 07.07.2015 - 15:16:48
// Last changed on: 07.07.2015 - 15:16:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelheavyMunitionsArmor extends ModelCustomArmour //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelheavyMunitionsArmor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[27];
		leftArmModel = new ModelRendererTurbo[10];
		rightArmModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 33
		bodyModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 15
		bodyModel[2] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 68
		bodyModel[3] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 69
		bodyModel[4] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 89
		bodyModel[5] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 90
		bodyModel[6] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 91
		bodyModel[7] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 92
		bodyModel[8] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 93
		bodyModel[9] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 96
		bodyModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 97
		bodyModel[11] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 105
		bodyModel[12] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 106
		bodyModel[13] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 107
		bodyModel[14] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 108
		bodyModel[15] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 53
		bodyModel[16] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 54
		bodyModel[17] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 55
		bodyModel[18] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 56
		bodyModel[19] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 65
		bodyModel[20] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 66
		bodyModel[21] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 67
		bodyModel[22] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 68
		bodyModel[23] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 69
		bodyModel[24] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 70
		bodyModel[25] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 71
		bodyModel[26] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 72

		bodyModel[0].addShapeBox(-4F, 0.4F, -2F, 8, 13, 4, 0F,0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F, 0.1F, -0.6F, 0.1F); // Box 33
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 6.5F, -2F, 4, 3, 4, 0F,0.6F, 0F, 0.4F, 0F, -0.5F, 1.5F, 0F, 0F, 1F, 0.6F, 0F, 0.5F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F); // Box 15
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 0F, -2.2F, 4, 2, 4, 0F,-1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 0.5F, -1F, 0.4F, 0.5F, -2F, -0.3F, 1F, 0F, 0.2F, 1.5F, 0F, -0.7F, 0.5F, -2F, -1F, 0.5F); // Box 68
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -2.2F, 4, 2, 4, 0F,0F, 0.8F, 0.5F, -1F, 0.4F, 0.5F, -1F, 0.4F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.2F, 1.5F, -2F, -0.3F, 1F, -2F, -1F, 0.5F, 0F, -0.7F, 0.5F); // Box 69
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 3.5F, -2F, 4, 3, 4, 0F,0.5F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.6F, 0F, 0.4F, 0F, 0.49F, 1.49F, 0F, 0F, 1F, 0.6F, 0F, 0.4F); // Box 89
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(-4F, 2.5F, -2F, 4, 1, 4, 0F,-0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F, 0.4F, 0F, 0.4F, 0F, 0F, 1.2F, 0F, 0F, 1F, 0.4F, 0F, 0.5F); // Box 90
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-4F, -0.5F, -2F, 4, 2, 4, 0F,0.2F, -0.3F, 0.3F, -1.5F, -0.3F, 0.2F, 0F, -0.3F, 0.8F, 0.2F, -0.3F, 0.5F, -0.2F, 0.5F, 0.5F, 0F, 0.5F, 0.8F, 0F, 0.5F, 1F, -0.2F, 0.5F, 0.7F); // Box 91
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(0F, -0.5F, -2F, 4, 2, 4, 0F,-1.5F, -0.3F, 0.2F, 0.2F, -0.3F, 0.3F, 0.2F, -0.3F, 0.5F, 0F, -0.3F, 0.8F, 0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F); // Box 92
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(0F, 2.5F, -2F, 4, 1, 4, 0F,0F, 0.5F, 0.8F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.7F, 0F, 0.5F, 1F, 0F, 0F, 1.2F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.5F, 0F, 0F, 1F); // Box 93
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(0F, 3.5F, -2F, 4, 3, 4, 0F,0F, 0F, 1.2F, 0.5F, 0F, 0.4F, 0.5F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0.51F, 1.51F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0F, 0F, 1F); // Box 96
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(0F, 6.5F, -2F, 4, 3, 4, 0F,0F, -0.5F, 1.5F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.4F, 0.15F, 0F, 0.2F, 0.15F, 0F, 0.2F, 0F, 0F, 0.4F); // Box 97
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 9.4F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F); // Box 105
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-4F, 9.8F, -2F, 8, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.25F, -0.2F, 0.25F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F, 0.6F, 0F, 0.6F); // Box 106
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-4F, 10.8F, -2F, 4, 1, 4, 0F,0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 1F, 0F, 1F, 0F, 0.5F, 1.2F, 0F, 0.5F, 1.2F, 1F, 0F, 1F); // Box 107
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(0F, 10.8F, -2F, 4, 1, 4, 0F,0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 1.2F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0.5F, 1.2F); // Box 108
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-4F, 0.5F, -2F, 3, 3, 4, 0F,1.5F, 0F, 0.4F, -1F, 0F, 0.7F, -1F, 0F, 1F, 1.5F, 0F, 0.5F, 0.6F, 0F, 0.4F, -0.5F, 1F, 1.5F, 0F, 1F, 1F, 0.6F, 0F, 0.4F); // Box 53
		bodyModel[15].setRotationPoint(-1F, 0F, 0F);

		bodyModel[16].addShapeBox(3F, 0.5F, -2F, 3, 3, 4, 0F,-1F, 0F, 0.7F, 1.5F, 0F, 0.4F, 1.5F, 0F, 0.5F, -1F, 0F, 1F, -0.5F, 1F, 1.5F, 0.6F, 0F, 0.4F, 0.6F, 0F, 0.4F, 0F, 1F, 1F); // Box 54
		bodyModel[16].setRotationPoint(-1F, 0F, 0F);

		bodyModel[17].addShapeBox(-5F, 12.2F, -2F, 4, 1, 4, 0F,-0.2F, 0.5F, 1F, 1F, 0F, 0.8F, 1F, 0F, 0.8F, -0.2F, 0.5F, 1F, 0.3F, -0.3F, 1F, 0.5F, 0F, 1.2F, 0.5F, 0F, 1.2F, 0.3F, -0.3F, 1F); // Box 55
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-5.1F, 13.2F, -2F, 4, 1, 4, 0F,0F, 0.3F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0F, 0.3F, 0.9F, 0.3F, 0F, 1.1F, 0.2F, 0.2F, 1.1F, 0.2F, 0.2F, 1.1F, 0.3F, 0F, 1.1F); // Box 56
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-5.1F, 14.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.4F, 0F, 1.1F, 0.2F, 0.2F, 1.1F, 0.2F, 0.2F, 1.1F, 0.4F, 0F, 1.1F); // Box 65
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(-5.1F, 15.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.4F, 0F, 1.1F, 0.2F, 0.2F, 1.1F, 0.2F, 0.2F, 1.1F, 0.4F, 0F, 1.1F); // Box 66
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(-5.1F, 16.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.4F, 0F, 0.9F, -0.2F, 0.2F, 0.9F, -0.2F, 0.2F, 0.9F, 0.4F, 0F, 0.9F); // Box 67
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(1F, 12.2F, -2F, 4, 1, 4, 0F,1F, 0F, 0.8F, -0.2F, 0.5F, 1F, -0.2F, 0.5F, 1F, 1F, 0F, 0.8F, 0.5F, 0F, 1.2F, 0.3F, -0.3F, 1F, 0.3F, -0.3F, 1F, 0.5F, 0F, 1.2F); // Box 68
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(0.9F, 13.2F, -2F, 4, 1, 4, 0F,0.4F, 0F, 0.9F, 0F, 0.3F, 0.9F, 0F, 0.3F, 0.9F, 0.4F, 0F, 0.9F, 0.2F, 0.2F, 1.1F, 0.3F, 0F, 1.1F, 0.3F, 0F, 1.1F, 0.2F, 0.2F, 1.1F); // Box 69
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(0.9F, 14.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.2F, 0F, 1.1F); // Box 70
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(0.9F, 15.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.4F, 0F, 1.1F, 0.2F, 0F, 1.1F); // Box 71
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(0.9F, 16.2F, -2F, 4, 1, 4, 0F,0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, 0.2F, 0F, 0.9F, -0.2F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, -0.2F, 0F, 0.9F); // Box 72
		bodyModel[26].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		leftArmModel[1] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 57
		leftArmModel[2] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 58
		leftArmModel[3] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 60
		leftArmModel[4] = new ModelRendererTurbo(this, 89, 17, textureX, textureY); // Box 62
		leftArmModel[5] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 100
		leftArmModel[6] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 101
		leftArmModel[7] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 102
		leftArmModel[8] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 103
		leftArmModel[9] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 104

		leftArmModel[0].addShapeBox(-1F, -2.1F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 1
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 57
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1F, 7F, -2F, 4, 3, 4, 0F,0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 58
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1F, 4.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F); // Box 60
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(2F, 1.4F, -2F, 1, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 62
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-0.5F, 2.9F, -2F, 4, 2, 4, 0F,0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F); // Box 100
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(0F, -2.1F, -2F, 3, 2, 4, 0F,1.3F, 0.6F, 0.8F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 0.3F, 1.3F, 0.6F, 0.8F, 1.3F, 1.3F, 1.8F, 0.5F, 0F, 0.8F, 0.5F, 0F, 0.8F, 1.3F, 1.3F, 1.8F); // Box 101
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(0F, -1.5F, -2F, 3, 2, 4, 0F,0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F); // Box 102
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(0F, -0.5F, -2F, 3, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 103
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(0F, 0.5F, -2F, 3, 2, 4, 0F,0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F); // Box 104
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 42
		rightArmModel[2] = new ModelRendererTurbo(this, 113, 25, textureX, textureY); // Box 43
		rightArmModel[3] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 44
		rightArmModel[4] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 45
		rightArmModel[5] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 55
		rightArmModel[6] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 56
		rightArmModel[7] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 59
		rightArmModel[8] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 61
		rightArmModel[9] = new ModelRendererTurbo(this, 97, 41, textureX, textureY); // Box 63

		rightArmModel[0].addShapeBox(-3F, -2.1F, -2F, 4, 8, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, -2.1F, -2F, 3, 2, 4, 0F,0.3F, 0.3F, 0.3F, 1.3F, 0.6F, 0.8F, 1.3F, 0.6F, 0.8F, 0.3F, 0.3F, 0.3F, 0.5F, 0F, 0.8F, 1.3F, 1.3F, 1.8F, 1.3F, 1.3F, 1.8F, 0.5F, 0F, 0.8F); // Box 42
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3F, -1.5F, -2F, 3, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 43
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3F, -0.5F, -2F, 3, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 44
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3F, 0.5F, -2F, 3, 2, 4, 0F,0.2F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0F, 0.3F, 0.2F, 0.2F, 0.3F, 0.2F, 0.4F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 45
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-3F, 9.5F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 55
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-3F, 7F, -2F, 4, 3, 4, 0F,0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.5F, -0.8F, 0.5F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F); // Box 56
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-3F, 4.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F, 0.2F, 1.2F, 0.2F); // Box 59
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-3F, 1.4F, -2F, 1, 3, 4, 0F,0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F); // Box 61
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-3.5F, 2.9F, -2F, 4, 2, 4, 0F,0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, 0.2F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, -0.8F, 0.4F, 0.2F, 0.2F, 0.4F); // Box 63
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);
	}
}